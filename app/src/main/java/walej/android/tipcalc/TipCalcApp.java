package walej.android.tipcalc;

import android.app.Application;

/**
 * Created by walej on 17/07/2016.
 */
public class TipCalcApp extends Application {
    private final static String ABOUT_URL = "https://gt.linkedin.com/in/barrioswilfred";

    public String getAboutUrl(){
        return ABOUT_URL;
    }
}
