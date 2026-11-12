package com.huawei.ui.commonui.utils.versioncontrol;

import android.app.Activity;
import android.os.Build;
import android.text.TextUtils;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwcommonmodel.utils.PermissionUtil;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.login.ui.login.LoginInit;
import com.huawei.operation.utils.PhoneInfoUtils;
import defpackage.qrs;
import health.compact.a.CommonUtil;
import health.compact.a.ReflectionUtils;
import health.compact.a.ReleaseLogUtil;
import health.compact.a.Utils;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class VersionControlUtil {
    private static final int REFLECT_METHOD_PARAM_LENGTH = 2;
    public static final boolean SLEEP_MANAGER_DEFAULT_STRATEGY = true;
    private static final List<String> SUPPORT_TRANSITION_ANIMATION_MODEL_LIST;
    private static final String TAG = "CommonUI_VersionControlUtil";

    private static boolean isCloseActivityTransitionAnimation() {
        return true;
    }

    public static boolean isSupportSleepManagement() {
        return true;
    }

    static {
        ArrayList arrayList = new ArrayList();
        SUPPORT_TRANSITION_ANIMATION_MODEL_LIST = arrayList;
        arrayList.add("PNH");
        arrayList.add("CLS");
        arrayList.add("PLR");
        arrayList.add("PLA");
        arrayList.add("PLU");
        arrayList.add("ADY");
        arrayList.add("HBN");
        arrayList.add("HBP");
        arrayList.add("HED");
        arrayList.add("LMR");
        arrayList.add("LMU");
        arrayList.add("VYG");
        arrayList.add("SGT");
        arrayList.add("SGU");
    }

    public static boolean isShowSmartSleepImprovement() {
        return !Utils.o() && isSupportOperationAccount();
    }

    public static boolean isShownOversea() {
        return Utils.o();
    }

    public static boolean isVersioned(String str) {
        boolean z = true;
        if (TextUtils.isEmpty(str)) {
            return true;
        }
        String[] strArrSplit = str.split("#");
        int length = strArrSplit.length;
        if (length != 2) {
            LogUtil.e(TAG, "version control method format wrong, current length is ", Integer.valueOf(length));
            return true;
        }
        String strSubstring = strArrSplit[0];
        String str2 = strArrSplit[1];
        if (strSubstring.startsWith("!")) {
            strSubstring = strSubstring.substring(1);
        } else {
            z = false;
        }
        return reflectVersionControlMethod(strSubstring, str2, z);
    }

    private static boolean reflectVersionControlMethod(String str, String str2, boolean z) {
        try {
            Object objInvoke = ReflectionUtils.e(ReflectionUtils.e(str), str2, (Class<?>[]) new Class[0]).invoke(null, new Object[0]);
            return ((objInvoke instanceof Boolean) && z == ((Boolean) objInvoke).booleanValue()) ? false : true;
        } catch (ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
            LogUtil.j(TAG, "reflect version control method fail");
        }
        return true;
    }

    public static boolean isSupportOperationAccount() {
        return !LoginInit.getInstance(BaseApplication.getContext()).isMinorAccount();
    }

    public static boolean isSupportActivityTransitionAnimation(Activity activity) {
        if (isCloseActivityTransitionAnimation()) {
            return false;
        }
        if (activity == null || activity.isFinishing() || activity.isDestroyed()) {
            ReleaseLogUtil.c(TAG, "isSupportActivityTransitionAnimation activity ", activity);
            return false;
        }
        if (!activity.isInMultiWindowMode() && !qrs.b(activity) && !qrs.ab(activity)) {
            String deviceModel = PhoneInfoUtils.getDeviceModel();
            ReleaseLogUtil.c(TAG, "isSupportActivityTransitionAnimation deviceModel ", deviceModel, " Build.TIME ", Long.valueOf(Build.TIME));
            if (TextUtils.isEmpty(deviceModel)) {
                return false;
            }
            String upperCase = deviceModel.toUpperCase();
            Iterator<String> it = SUPPORT_TRANSITION_ANIMATION_MODEL_LIST.iterator();
            while (it.hasNext()) {
                if (upperCase.contains(it.next())) {
                    return true;
                }
            }
            if (PermissionUtil.h() && !CommonUtil.bg()) {
                return true;
            }
        }
        return false;
    }
}
