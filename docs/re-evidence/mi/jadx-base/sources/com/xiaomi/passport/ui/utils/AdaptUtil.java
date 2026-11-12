package com.xiaomi.passport.ui.utils;

import android.R;
import android.app.Activity;
import android.os.Build;
import android.text.TextUtils;
import android.view.View;
import androidx.core.view.WindowInsetsCompat;
import androidx.core.view.c;
import com.xiaomi.passport.ui.utils.AdaptUtil;
import defpackage.o7h;

/* JADX INFO: loaded from: classes11.dex */
public class AdaptUtil {
    public static void fitDeviceNotch(final Activity activity) {
        String str = Build.DEVICE;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        str.hashCode();
        if (!str.equals("jinghu")) {
            activity.getWindow().getDecorView().setFitsSystemWindows(true);
        } else {
            activity.getWindow().getDecorView().setSystemUiVisibility(9232);
            c.H0(activity.getWindow().getDecorView().findViewById(R.id.content), new o7h() { // from class: cp0
                @Override // defpackage.o7h
                public final WindowInsetsCompat a(View view, WindowInsetsCompat windowInsetsCompat) {
                    return AdaptUtil.lambda$fitDeviceNotch$0(activity, view, windowInsetsCompat);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ WindowInsetsCompat lambda$fitDeviceNotch$0(Activity activity, View view, WindowInsetsCompat windowInsetsCompat) {
        view.setPadding(view.getPaddingLeft(), windowInsetsCompat.m(), view.getPaddingRight(), view.getPaddingBottom());
        activity.getWindow().addFlags(134217728);
        return windowInsetsCompat;
    }
}
