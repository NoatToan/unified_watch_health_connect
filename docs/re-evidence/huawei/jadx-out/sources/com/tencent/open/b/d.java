package com.tencent.open.b;

import android.content.Context;
import android.text.TextUtils;
import android.view.WindowManager;
import com.huawei.openalliance.ad.constant.Constants;
import java.util.Locale;

/* JADX INFO: loaded from: classes20.dex */
public class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static String f31032a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static String f31033b;

    public static String a(Context context) {
        if (!TextUtils.isEmpty(f31032a)) {
            return f31032a;
        }
        if (context == null) {
            return "";
        }
        f31032a = "";
        WindowManager windowManager = (WindowManager) context.getSystemService(Constants.NATIVE_WINDOW_SUB_DIR);
        if (windowManager != null) {
            f31032a = windowManager.getDefaultDisplay().getWidth() + "x" + windowManager.getDefaultDisplay().getHeight();
        }
        return f31032a;
    }

    public static String a() {
        return Locale.getDefault().getLanguage();
    }
}
