package defpackage;

import android.R;
import android.annotation.TargetApi;
import android.content.Context;
import android.os.Build;
import android.view.Window;
import androidx.annotation.RestrictTo;
import androidx.core.view.d;

/* JADX INFO: loaded from: classes5.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public class r08 {
    public static void a(Window window, boolean z, Integer num, Integer num2) {
        boolean z2 = num == null || num.intValue() == 0;
        boolean z3 = num2 == null || num2.intValue() == 0;
        if (z2 || z3) {
            int iB = i8f.b(window.getContext(), R.attr.colorBackground, -16777216);
            if (z2) {
                num = Integer.valueOf(iB);
            }
            if (z3) {
                num2 = Integer.valueOf(iB);
            }
        }
        tkr.b(window, !z);
        int iC = c(window.getContext(), z);
        int iB2 = b(window.getContext(), z);
        window.setStatusBarColor(iC);
        window.setNavigationBarColor(iB2);
        boolean zD = d(iC, i8f.f(num.intValue()));
        boolean zD2 = d(iB2, i8f.f(num2.intValue()));
        d dVarA = tkr.a(window, window.getDecorView());
        if (dVarA != null) {
            dVarA.c(zD);
            dVarA.b(zD2);
        }
    }

    @TargetApi(21)
    public static int b(Context context, boolean z) {
        if (z && Build.VERSION.SDK_INT < 27) {
            return z44.p(i8f.b(context, R.attr.navigationBarColor, -16777216), 128);
        }
        if (z) {
            return 0;
        }
        return i8f.b(context, R.attr.navigationBarColor, -16777216);
    }

    @TargetApi(21)
    public static int c(Context context, boolean z) {
        if (z) {
            return 0;
        }
        return i8f.b(context, R.attr.statusBarColor, -16777216);
    }

    public static boolean d(int i, boolean z) {
        return i8f.f(i) || (i == 0 && z);
    }
}
