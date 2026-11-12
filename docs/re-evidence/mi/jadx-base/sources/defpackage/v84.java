package defpackage;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.io.Writer;
import java.util.Calendar;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public class v84 {
    public static double a(double d, double d2, double d3, double d4) {
        double dG = g(d2);
        double dG2 = g(d4);
        double dG3 = g(d);
        double dG4 = g(d3);
        if (dG < 0.0d) {
            dG = Math.abs(dG) + 1.5707963267948966d;
        }
        if (dG > 0.0d) {
            dG = 1.5707963267948966d - Math.abs(dG);
        }
        if (dG3 < 0.0d) {
            dG3 = 6.283185307179586d - Math.abs(dG3);
        }
        if (dG2 < 0.0d) {
            dG2 = Math.abs(dG2) + 1.5707963267948966d;
        }
        if (dG2 > 0.0d) {
            dG2 = 1.5707963267948966d - Math.abs(dG2);
        }
        if (dG4 < 0.0d) {
            dG4 = 6.283185307179586d - Math.abs(dG4);
        }
        double dCos = Math.cos(dG3) * 6378137.0d * Math.sin(dG);
        double dSin = Math.sin(dG3) * 6378137.0d * Math.sin(dG);
        double dCos2 = Math.cos(dG) * 6378137.0d;
        double dCos3 = Math.cos(dG4) * 6378137.0d * Math.sin(dG2);
        double d5 = dCos - dCos3;
        double dSin2 = dSin - ((Math.sin(dG4) * 6378137.0d) * Math.sin(dG2));
        double dCos4 = dCos2 - (Math.cos(dG2) * 6378137.0d);
        double dSqrt = Math.sqrt((d5 * d5) + (dSin2 * dSin2) + (dCos4 * dCos4));
        return Math.acos((8.1361263181538E13d - (dSqrt * dSqrt)) / 8.1361263181538E13d) * 6378137.0d;
    }

    public static boolean b(Context context, String str) {
        return ni4.a(context, str) == 0;
    }

    public static int c(int i, int i2) {
        Calendar calendar = Calendar.getInstance();
        calendar.set(1, i);
        calendar.set(2, i2);
        return calendar.getActualMaximum(5);
    }

    public static String d(String str) {
        return str == null ? "" : str;
    }

    public static int e(Activity activity) {
        try {
            Class<?> cls = Class.forName("com.android.internal.R$dimen");
            return activity.getResources().getDimensionPixelSize(Integer.parseInt(cls.getField("status_bar_height").get(cls.newInstance()).toString()));
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }
    }

    public static String f(@NotNull Throwable th) {
        try {
            StringWriter stringWriter = new StringWriter();
            PrintWriter printWriter = new PrintWriter((Writer) stringWriter, true);
            th.printStackTrace(printWriter);
            printWriter.flush();
            stringWriter.flush();
            return stringWriter.toString();
        } catch (Exception e) {
            return e.getMessage();
        }
    }

    public static double g(double d) {
        return (d * 3.141592653589793d) / 180.0d;
    }

    public static void h(CompoundButton compoundButton, boolean z, CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
        compoundButton.setOnCheckedChangeListener(null);
        compoundButton.setChecked(z);
        compoundButton.setOnCheckedChangeListener(onCheckedChangeListener);
    }

    public static void i(View view, int i, int i2, int i3, int i4) {
        if (view.getLayoutParams() instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
            marginLayoutParams.setMargins(i, i2, i3, i4);
            if (i > 0) {
                marginLayoutParams.setMarginStart(i);
            }
            if (i3 > 0) {
                marginLayoutParams.setMarginEnd(i3);
            }
            view.requestLayout();
        }
    }
}
