package gloriacrud;

import java.awt.Dimension;
import java.sql.*;

public class GloriaCRUD {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        boolean isVisible = true;
        int maxSizeLF[] = new int[2];
        maxSizeLF[0] = 403;
        maxSizeLF[1] = 182;
        LogInForm lf = new LogInForm();
        UserMaintenance um = new UserMaintenance();
        lf.setMaximumSize(new Dimension(maxSizeLF[0], maxSizeLF[1]));
        Connection sqlConnect = SQLConnector.getConnection();
        
        um.setVisible(isVisible);
    }
    
}
