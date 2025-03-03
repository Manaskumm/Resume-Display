import java.awt.*;
import javax.swing.*;
import javax.swing.border.EmptyBorder;

public class resume extends JFrame {
        private JLabel[] lbl;
        private float a = 0f;

        public resume() {
            setTitle("Manas Kummarapurugu Resume");
            setSize(500, 400);
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            
            JPanel pnl = new JPanel();
            pnl.setLayout(new BoxLayout(pnl, BoxLayout.Y_AXIS));
            pnl.setBorder(new EmptyBorder(20, 20, 20, 20));
            pnl.setBackground(Color.BLACK);
            
            lbl = new JLabel[] {
                createStyledLabel("Manas Kummarapurugu", SwingConstants.CENTER, 20),
                createStyledLabel("manas.kumm@rutgers.edu", SwingConstants.CENTER, 14),
                createStyledLabel("Education:", SwingConstants.LEFT, 16),
                createStyledLabel("BS Computer Science, BA Economics, Rutgers University (Expected 2028)", SwingConstants.LEFT, 14),
                createStyledLabel("Technical Skills:", SwingConstants.LEFT, 16),
                createStyledLabel("Java, Python, C++", SwingConstants.LEFT, 14),
                createStyledLabel("Experience:", SwingConstants.LEFT, 16),
                createStyledLabel("Pals Learning Center - Math and English Tutor", SwingConstants.LEFT, 14),
                createStyledLabel("- Taught fundamental math and English concepts to elementary school students", SwingConstants.LEFT, 14),
                createStyledLabel("Projects:", SwingConstants.LEFT, 16),
                createStyledLabel("- S&P 500 Index Fund Predictor using Python", SwingConstants.LEFT, 14),
                createStyledLabel("  Used scikit-learn and Random Forest model to analyze historical data", SwingConstants.LEFT, 14),
                createStyledLabel("  Utilized yfinance Python package to fetch accurate real-time market data", SwingConstants.LEFT, 14)
            };
            
            for (JLabel l : lbl) {
                l.setForeground(Color.WHITE);
                pnl.add(l);
                l.setBorder(new EmptyBorder(5, 0, 5, 0));
            }
            
            add(pnl);
            setLocationRelativeTo(null);
        }

        private JLabel createStyledLabel(String text, int alignment, int fontSize) {
            JLabel l = new JLabel(text, alignment);
            l.setFont(new Font("Arial", Font.PLAIN, fontSize));
            l.setForeground(Color.WHITE);
            l.setAlignmentX(Component.LEFT_ALIGNMENT);
            return l;
        }

        public static void main(String[] args) {
            SwingUtilities.invokeLater(() -> {
                resume frame = new resume();
                frame.setVisible(true);
            });
        }
}