package com.huawei.openplatform.abl.log;

import android.content.Context;
import defpackage.ohi;

/* JADX INFO: loaded from: classes12.dex */
public abstract class HiAdLog {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static b f21529a;

    public static void w(String str, String str2, Object... objArr) {
        b bVar = f21529a;
        if (bVar != null) {
            bVar.d(str, str2, objArr);
        }
    }

    public static void w(String str, String str2) {
        b bVar = f21529a;
        if (bVar != null) {
            bVar.d(str, str2);
        }
    }

    public static void printSafeStackTrace(int i, Throwable th) {
        b bVar = f21529a;
        if (bVar != null) {
            bVar.a(i, th);
        }
    }

    public static void printSafeStackTrace(int i, String str, Throwable th) {
        b bVar = f21529a;
        if (bVar != null) {
            bVar.a(i, str, th);
        }
    }

    public static void printSafeExceptionMessage(int i, String str, String str2, Throwable th) {
        b bVar = f21529a;
        if (bVar != null) {
            bVar.a(i, str, str2, th);
        }
    }

    public static boolean isWarnEnable() {
        b bVar = f21529a;
        if (bVar != null) {
            return bVar.d();
        }
        return false;
    }

    public static boolean isInfoEnable() {
        b bVar = f21529a;
        if (bVar != null) {
            return bVar.c();
        }
        return false;
    }

    public static boolean isErrorEnable() {
        b bVar = f21529a;
        if (bVar != null) {
            return bVar.b();
        }
        return false;
    }

    public static boolean isDebugEnable() {
        b bVar = f21529a;
        if (bVar != null) {
            return bVar.a();
        }
        return false;
    }

    public static void init(Context context, ohi ohiVar) {
        if (ohiVar == null) {
            return;
        }
        if (ohiVar.j()) {
            f21529a = new l(context).c(ohiVar.i());
        } else {
            f21529a = new c(context);
        }
        f21529a.a(ohiVar);
    }

    public static void i(String str, String str2, Object... objArr) {
        b bVar = f21529a;
        if (bVar != null) {
            bVar.c(str, str2, objArr);
        }
    }

    public static void i(String str, String str2) {
        b bVar = f21529a;
        if (bVar != null) {
            bVar.c(str, str2);
        }
    }

    public static void e(String str, String str2, Object... objArr) {
        b bVar = f21529a;
        if (bVar != null) {
            bVar.b(str, str2, objArr);
        }
    }

    public static void e(String str, String str2) {
        b bVar = f21529a;
        if (bVar != null) {
            bVar.b(str, str2);
        }
    }

    public static void d(String str, String str2, Object... objArr) {
        b bVar = f21529a;
        if (bVar != null) {
            bVar.a(str, str2, objArr);
        }
    }

    public static void d(String str, String str2) {
        b bVar = f21529a;
        if (bVar != null) {
            bVar.a(str, str2);
        }
    }
}
