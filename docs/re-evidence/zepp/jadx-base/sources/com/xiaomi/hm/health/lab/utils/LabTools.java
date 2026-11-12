package com.xiaomi.hm.health.lab.utils;

import android.bluetooth.BluetoothAdapter;
import android.content.Context;
import android.util.TypedValue;
import androidx.core.text.TextUtilsCompat;
import com.huami.view.basetitle.IdGetter;
import java.text.SimpleDateFormat;
import java.util.Locale;

/* JADX INFO: loaded from: classes21.dex */
public class LabTools {
    private static final String a = "status_bar_height";

    public static float dp2px(Context context, float f) {
        return TypedValue.applyDimension(1, f, context.getResources().getDisplayMetrics());
    }

    public static String formatDateSimple(long j) {
        return new SimpleDateFormat("yyyy-MM-dd", Locale.getDefault()).format(Long.valueOf(j));
    }

    public static int getStatusBarHeight(Context context) {
        try {
            return context.getResources().getDimensionPixelSize(IdGetter.getIdSys(context, a, "dimen"));
        } catch (Exception unused) {
            return (int) dp2px(context, 24.0f);
        }
    }

    public static boolean isBluetoothEnable() {
        BluetoothAdapter defaultAdapter = BluetoothAdapter.getDefaultAdapter();
        return defaultAdapter != null && defaultAdapter.isEnabled();
    }

    public static boolean isBluetoothSupportAndDisable() {
        BluetoothAdapter defaultAdapter = BluetoothAdapter.getDefaultAdapter();
        return (defaultAdapter == null || defaultAdapter.isEnabled()) ? false : true;
    }

    public static boolean isRTL() {
        return TextUtilsCompat.getLayoutDirectionFromLocale(Locale.getDefault()) == 1;
    }

    public static float sp2px(Context context, float f) {
        return TypedValue.applyDimension(2, f, context.getResources().getDisplayMetrics());
    }
}
