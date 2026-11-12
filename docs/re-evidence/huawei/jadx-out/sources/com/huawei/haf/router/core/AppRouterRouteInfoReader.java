package com.huawei.haf.router.core;

import com.huawei.haf.common.utils.CommonConstant;
import health.compact.a.LogUtil;
import health.compact.a.ReflectionUtils;

/* JADX INFO: loaded from: classes2.dex */
final class AppRouterRouteInfoReader {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f6059a;
    private final Class<?> e;

    AppRouterRouteInfoReader(String str, ClassLoader classLoader) {
        this.f6059a = str;
        this.e = ReflectionUtils.c("com.huawei.haf.router.routes.AppRoute$$Info$$" + str, classLoader);
    }

    String[] i() {
        return this.e != null ? a("R_", "Roots") : CommonConstant.e;
    }

    String[] a() {
        return this.e != null ? a("P_", "Providers") : CommonConstant.e;
    }

    String[] e() {
        return this.e != null ? a("I_", "Interceptors") : CommonConstant.e;
    }

    String[] d() {
        return this.e != null ? a("A_", "Autowireds") : CommonConstant.e;
    }

    String[] c() {
        return this.e != null ? a("B_", "Bootstraps") : CommonConstant.e;
    }

    String[] b() {
        return this.e != null ? a("M_", "Names") : CommonConstant.e;
    }

    private String[] a(String str, String str2) {
        int iE = e(str + "N", 0, str2);
        if (iE == 0) {
            return CommonConstant.e;
        }
        String[] strArr = new String[iE];
        for (int i = 0; i < iE; i++) {
            strArr[i] = c(str + i, "", str2);
        }
        return strArr;
    }

    private String c(String str, String str2, String str3) {
        Object objD = d(str, str3);
        return objD instanceof String ? ((String) objD).intern() : str2;
    }

    private int e(String str, int i, String str2) {
        Object objD = d(str, str2);
        return objD instanceof Integer ? ((Integer) objD).intValue() : i;
    }

    private Object d(String str, String str2) {
        try {
            return ReflectionUtils.c(this.e, str).get(null);
        } catch (IllegalAccessException | NoSuchFieldException unused) {
            LogUtil.c("HAF_RouteInfo", "getRouteInfoValue, pluginName[", this.f6059a, "] not exist ", str2);
            return null;
        }
    }
}
