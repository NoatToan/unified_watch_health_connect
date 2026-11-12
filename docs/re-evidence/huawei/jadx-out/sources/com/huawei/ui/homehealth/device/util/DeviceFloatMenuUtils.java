package com.huawei.ui.homehealth.device.util;

import android.content.Context;
import android.view.View;
import android.view.WindowManager;
import com.huawei.openalliance.ad.constant.Constants;

/* JADX INFO: loaded from: classes17.dex */
public class DeviceFloatMenuUtils {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static View f25333b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static boolean f25334c = false;

    /* JADX INFO: loaded from: classes43.dex */
    public interface MenuClickListener {
        void setOnClick(int i);
    }

    public static void b(Context context) {
        ((WindowManager) context.getSystemService(Constants.NATIVE_WINDOW_SUB_DIR)).removeView(f25333b);
        f25334c = false;
    }
}
