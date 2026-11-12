package com.huawei.haf.bundle.extension;

import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils;
import com.huawei.haf.common.utils.CommonConstant;
import health.compact.a.LogUtil;
import java.lang.reflect.Field;

/* JADX INFO: loaded from: classes2.dex */
final class ComponentInfoReader {
    private ComponentInfoReader() {
    }

    private static Class a() throws ClassNotFoundException {
        return Class.forName("com.huawei.haf.bundle.extension.ComponentInfo");
    }

    static String[] c(String str) {
        return e(str + "_A_", str, "Activities");
    }

    static String[] b(String str) {
        return e(str + "_S_", str, "Services");
    }

    static String[] a(String str) {
        return e(str + "_R_", str, "Receivers");
    }

    static String d(Context context, String str) {
        return e(context, str, d(str));
    }

    static String b(Context context, String str) {
        String strD = d(str);
        String strE = e(context, str, strD + "_desc", (String) null);
        return TextUtils.isEmpty(strE) ? e(context, str, strD) : strE;
    }

    private static String e(Context context, String str, String str2) {
        return e(context, str, str2, str);
    }

    private static String e(Context context, String str, String str2, String str3) {
        try {
            Resources resources = context.getResources();
            return resources.getString(resources.getIdentifier(str2, "string", context.getPackageName()));
        } catch (Resources.NotFoundException e) {
            LogUtil.e("Bundle_ComponentInfoMgr", "getModuleString ", str, ", resId=", str2, ", ex =", LogUtil.c(e));
            return str3;
        }
    }

    private static String d(String str) {
        return e(str + "_T", str, str, "Title");
    }

    private static String[] e(String str, String str2, String str3) {
        int iC = c(str + "N", 0, str2, str3);
        if (iC == 0) {
            return CommonConstant.e;
        }
        String[] strArr = new String[iC];
        for (int i = 0; i < iC; i++) {
            strArr[i] = e(str + i, (String) null, str2, str3);
        }
        return strArr;
    }

    private static String e(String str, String str2, String str3, String str4) {
        Object objA = a(str, str3, str4);
        return objA instanceof String ? ((String) objA).intern() : str2;
    }

    private static int c(String str, int i, String str2, String str3) {
        Object objA = a(str, str2, str3);
        return objA instanceof Integer ? ((Integer) objA).intValue() : i;
    }

    private static Object a(String str, String str2, String str3) {
        try {
            Field field = a().getField(str);
            field.setAccessible(true);
            return field.get(null);
        } catch (ClassNotFoundException | IllegalAccessException | NoSuchFieldException unused) {
            LogUtil.c("Bundle_ComponentInfoMgr", "getComponentInfoValue, ", str2, " not exist ", str3);
            return null;
        }
    }
}
