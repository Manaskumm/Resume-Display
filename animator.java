import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.*;
import javax.swing.border.EmptyBorder;

public class resume extends JFrame implements KeyListener {
        private JLabel[] lbl;
        private int dx = 0;
        private int dy = 0;
        private final int SPEED = 5;
        private Timer timer;

        public resume() {
            setTitle("Animated Text Display");
            setSize(800, 600); // Set a default window size instead of fullscreen
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

            String userText = JOptionPane.showInputDialog(this, 
                "Enter the text you want to animate:",
                "Text Input",
                JOptionPane.PLAIN_MESSAGE);

            if (userText == null || userText.trim().isEmpty()) {
                userText = "No text entered";
            }
            
            JPanel pnl = new JPanel();
            pnl.setLayout(null);
            pnl.setBorder(new EmptyBorder(20, 20, 20, 20));
            pnl.setBackground(Color.BLACK);
            
            lbl = new JLabel[] {
                createStyledLabel(userText, SwingConstants.CENTER, 20)
            };
            
            // Center the label in the window
            int y = (getHeight() - 30) / 2;
            for (JLabel l : lbl) {
                l.setForeground(Color.WHITE);
                l.setBounds(20, y, getWidth() - 60, 30);
                pnl.add(l);
            }
            
            add(pnl);
            setLocationRelativeTo(null);
            addKeyListener(this);
            setFocusable(true);

            dx = SPEED;
            dy = SPEED;

            timer = new Timer(16, new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    updateLabelPositions();
                }
            });
            timer.start();
        }

        private void updateLabelPositions() {
            Rectangle bounds = getBounds();
            for (JLabel l : lbl) {
                Point p = l.getLocation();
                int newX = p.x + dx;
                int newY = p.y + dy;
                
                if (newX <= 0 || newX + l.getWidth() >= bounds.width - 40) {
                    dx = -dx;
                    newX = p.x + dx;
                }
                
                if (newY <= 0 || newY + l.getHeight() >= bounds.height - 40) {
                    dy = -dy;
                    newY = p.y + dy;
                }
                
                l.setLocation(newX, newY);
            }
        }

        private JLabel createStyledLabel(String text, int alignment, int fontSize) {
            JLabel l = new JLabel(text, alignment);
            l.setFont(new Font("Arial", Font.PLAIN, fontSize));
            l.setForeground(Color.WHITE);
            l.setAlignmentX(Component.LEFT_ALIGNMENT);
            return l;
        }

        public void keyPressed(KeyEvent e) {
            switch (e.getKeyCode()) {
                case KeyEvent.VK_LEFT:
                    dx = -SPEED;
                    break;
                case KeyEvent.VK_RIGHT:
                    dx = SPEED;
                    break;
                case KeyEvent.VK_UP:
                    dy = -SPEED;
                    break;
                case KeyEvent.VK_DOWN:
                    dy = SPEED;
                    break;
                case KeyEvent.VK_ESCAPE:
                    System.exit(0);
                    break;
            }
        }

        public void keyReleased(KeyEvent e) {
        }
        
        public void keyTyped(KeyEvent e) {
        }

        public static void main(String[] args) {
            SwingUtilities.invokeLater(() -> {
                resume frame = new resume();
                frame.setVisible(true);
            });
        }
}