package c22;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;

/* JADX INFO: loaded from: classes10.dex */
public class b1 {
    public static double a(String str) {
        try {
            return Double.parseDouble(str);
        } catch (NumberFormatException unused) {
            return b(str);
        }
    }

    public static double b(String str) {
        try {
            return NumberFormat.getNumberInstance(Locale.getDefault()).parse(str).doubleValue();
        } catch (ParseException e4) {
            com.garmin.android.apps.connectmobile.i2.i("GCMNumberFormatter", e4.getMessage());
            return 0.0d;
        }
    }

    public static int c(String str) {
        try {
            return NumberFormat.getNumberInstance(Locale.getDefault()).parse(str).intValue();
        } catch (ParseException e4) {
            com.garmin.android.apps.connectmobile.i2.i("GCMNumberFormatter", e4.getMessage());
            return 0;
        }
    }
}
