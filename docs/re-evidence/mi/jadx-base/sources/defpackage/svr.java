package defpackage;

import android.content.Context;

/* JADX INFO: loaded from: classes2.dex */
public class svr {
    public static String a(Context context, String str) throws IllegalArgumentException {
        try {
            Class<?> clsLoadClass = context.getClassLoader().loadClass("android.os.SystemProperties");
            return (String) clsLoadClass.getMethod("get", String.class).invoke(clsLoadClass, new String(str));
        } catch (IllegalArgumentException e) {
            throw e;
        } catch (Exception unused) {
            return "";
        }
    }
}
