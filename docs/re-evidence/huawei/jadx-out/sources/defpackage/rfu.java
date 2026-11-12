package defpackage;

import android.view.ViewConfiguration;
import com.huawei.hwcommonmodel.application.BaseApplication;

/* JADX INFO: loaded from: classes43.dex */
public class rfu {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static float f47278a = (float) (Math.log(0.78d) / Math.log(0.9d));
    private static float d = ViewConfiguration.getScrollFriction();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static float f47279c = ((BaseApplication.getContext().getResources().getDisplayMetrics().density * 160.0f) * 386.0878f) * 0.84f;

    private static double e(int i) {
        return Math.log((Math.abs(i) * 0.35f) / (d * f47279c));
    }

    private static double e(double d2) {
        return ((((double) f47278a) - 1.0d) * Math.log(d2 / ((double) (d * f47279c)))) / ((double) f47278a);
    }

    public static double d(int i) {
        double dE = e(i);
        double d2 = f47278a;
        return Math.exp(dE * (d2 / (d2 - 1.0d))) * ((double) (d * f47279c));
    }

    public static int d(double d2) {
        return Math.abs((int) (((Math.exp(e(d2)) * ((double) d)) * ((double) f47279c)) / 0.3499999940395355d));
    }
}
