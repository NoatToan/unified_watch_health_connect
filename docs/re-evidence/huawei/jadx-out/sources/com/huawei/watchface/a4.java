package com.huawei.watchface;

import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;
import com.huawei.openalliance.ad.constant.Constants;
import com.huawei.watchface.environment.Environment;
import com.huawei.watchface.utils.HwLog;
import com.huawei.watchface.utils.constants.WatchFaceConstant;
import com.huawei.watchface.videoedit.utils.ScreenUtils;

/* JADX INFO: loaded from: classes20.dex */
public abstract class a4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final boolean f30056a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final boolean f30057b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f30058c;
    public static final String d;

    static {
        f30056a = ((p0.a(WatchFaceConstant.f30622c, "").isEmpty() && p0.a("persist.sys.fold.disp.size", "").isEmpty()) || d()) ? false : true;
        f30057b = p0.a("ro.build.characteristics", "").equals("tablet");
        f30058c = p0.a("persist.sys.default.res.yres", "");
        d = p0.a("persist.sys.default.res.xres", "");
    }

    public static String a() {
        if (f30056a) {
            return "2480*2200";
        }
        if (e()) {
            return "1920*1200";
        }
        String strC = c();
        if (c(strC) || b(strC) || a(strC)) {
            return "1920*1080";
        }
        return ("2560*1600".equals(strC) || "1600*2560".equals(strC)) ? "1920*1200" : strC;
    }

    public static boolean b(String str) {
        return "1280*720".equals(str) || "1496*720".equals(str) || "1493*720".equals(str);
    }

    public static String c() {
        if (f30056a) {
            return "2480*2200";
        }
        String str = f30058c;
        if (!TextUtils.isEmpty(str)) {
            String str2 = d;
            if (!TextUtils.isEmpty(str2)) {
                return str + "*" + str2;
            }
        }
        DisplayMetrics displayMetrics = new DisplayMetrics();
        try {
            Display displayB = b();
            if (displayB != null) {
                displayB.getRealMetrics(displayMetrics);
            }
        } catch (Exception unused) {
            displayMetrics = Environment.getApplicationContext().getResources().getDisplayMetrics();
        }
        return String.valueOf(displayMetrics.heightPixels) + "*" + String.valueOf(displayMetrics.widthPixels);
    }

    public static boolean d() {
        String strA = p0.a("ro.config.hw_fold_disp");
        HwLog.i(ScreenUtils.TAG, "isDoubleDisplayProduct screenSize = " + strA);
        if (TextUtils.isEmpty(strA)) {
            return false;
        }
        String[] strArrSplit = strA.split(",");
        return strArrSplit.length >= 9 && r2.a(strArrSplit[8], 0) == 1;
    }

    public static boolean e() {
        return f30057b;
    }

    public static Display b() {
        Object objA = Environment.a(Constants.NATIVE_WINDOW_SUB_DIR);
        WindowManager windowManager = objA instanceof WindowManager ? (WindowManager) objA : null;
        if (windowManager == null) {
            return null;
        }
        try {
            return windowManager.getDefaultDisplay();
        } catch (Exception e) {
            HwLog.e(ScreenUtils.TAG, HwLog.printException(e));
            return null;
        }
    }

    public static boolean a(String str) {
        return "2240*1080".equals(str) || "2280*1080".equals(str) || "2340*1080".equals(str) || "2220*1080".equals(str);
    }

    public static boolean c(String str) {
        return "2560*1440".equals(str) || "1520*720".equals(str) || "2880*1440".equals(str) || "1480*720".equals(str);
    }
}
