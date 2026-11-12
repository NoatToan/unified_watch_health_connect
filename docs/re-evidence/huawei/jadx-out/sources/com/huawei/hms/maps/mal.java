package com.huawei.hms.maps;

import android.text.TextUtils;
import android.util.Log;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes10.dex */
public abstract class mal {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Pattern f14198a = Pattern.compile("[0-9]*[a-z|A-Z]*[一-龥]*");

    static class maa extends Throwable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f14199a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private Throwable f14200b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private Throwable f14201c;

        public maa(Throwable th) {
            this.f14201c = th;
        }

        public void a(Throwable th) {
            this.f14200b = th;
        }

        @Override // java.lang.Throwable
        public Throwable getCause() {
            Throwable th;
            synchronized (this) {
                th = this.f14200b;
                if (th == this) {
                    th = null;
                }
            }
            return th;
        }

        @Override // java.lang.Throwable
        public String getMessage() {
            return this.f14199a;
        }

        @Override // java.lang.Throwable
        public String toString() {
            Throwable th = this.f14201c;
            if (th == null) {
                return "";
            }
            String name = th.getClass().getName();
            if (this.f14199a == null) {
                return name;
            }
            String str = name + ": ";
            if (this.f14199a.startsWith(str)) {
                return this.f14199a;
            }
            return str + this.f14199a;
        }

        public void a(String str) {
            this.f14199a = str;
        }
    }

    public static void a(String str, String str2, String str3) {
        if (TextUtils.isEmpty(str2) && TextUtils.isEmpty(str3)) {
            return;
        }
        Log.d(str, a(str2, str3));
    }

    public static void b(String str, String str2, String str3) {
        if (TextUtils.isEmpty(str2) && TextUtils.isEmpty(str3)) {
            return;
        }
        Log.e(str, a(str2, str3));
    }

    public static void c(String str, String str2, String str3) {
        if (TextUtils.isEmpty(str2) && TextUtils.isEmpty(str3)) {
            return;
        }
        Log.i(str, a(str2, str3));
    }

    public static void d(String str, String str2, String str3) {
        if (TextUtils.isEmpty(str2) && TextUtils.isEmpty(str3)) {
            return;
        }
        Log.w(str, a(str2, str3));
    }

    public static void a(String str, String str2, String str3, Throwable th) {
        if (TextUtils.isEmpty(str2) && TextUtils.isEmpty(str3)) {
            return;
        }
        Log.d(str, a(str2, str3), a(th));
    }

    public static void b(String str, String str2, String str3, Throwable th) {
        if (TextUtils.isEmpty(str2) && TextUtils.isEmpty(str3)) {
            return;
        }
        Log.e(str, a(str2, str3), a(th));
    }

    public static void c(String str, String str2, String str3, Throwable th) {
        if (TextUtils.isEmpty(str2) && TextUtils.isEmpty(str3)) {
            return;
        }
        Log.i(str, a(str2, str3), a(th));
    }

    public static void d(String str, String str2, String str3, Throwable th) {
        if (TextUtils.isEmpty(str2) && TextUtils.isEmpty(str3)) {
            return;
        }
        Log.w(str, a(str2, str3), a(th));
    }

    public static void a(String str, String str2, Throwable th, boolean z) {
        if (TextUtils.isEmpty(str2)) {
            return;
        }
        Log.d(str, a(str2, z), a(th));
    }

    public static void b(String str, String str2, Throwable th, boolean z) {
        if (TextUtils.isEmpty(str2) && th == null) {
            return;
        }
        Log.e(str, a(str2, z), a(th));
    }

    public static void c(String str, String str2, Throwable th, boolean z) {
        if (TextUtils.isEmpty(str2) && th == null) {
            return;
        }
        Log.i(str, a(str2, z), a(th));
    }

    public static void d(String str, String str2, Throwable th, boolean z) {
        if (TextUtils.isEmpty(str2) && th == null) {
            return;
        }
        Log.w(str, a(str2, z), a(th));
    }

    public static void a(String str, String str2, boolean z) {
        if (TextUtils.isEmpty(str2)) {
            return;
        }
        Log.d(str, a(str2, z));
    }

    public static void b(String str, String str2, boolean z) {
        if (TextUtils.isEmpty(str2)) {
            return;
        }
        Log.e(str, a(str2, z));
    }

    public static void c(String str, String str2, boolean z) {
        if (TextUtils.isEmpty(str2)) {
            return;
        }
        Log.i(str, a(str2, z));
    }

    public static void d(String str, String str2, boolean z) {
        if (TextUtils.isEmpty(str2)) {
            return;
        }
        Log.w(str, a(str2, z));
    }

    public static String a(String str) {
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        int length = str.length();
        int i = 1;
        if (1 == length) {
            return String.valueOf('*');
        }
        StringBuilder sb = new StringBuilder(length);
        for (int i2 = 0; i2 < length; i2++) {
            char cCharAt = str.charAt(i2);
            if (f14198a.matcher(String.valueOf(cCharAt)).matches()) {
                if (i % 2 == 0) {
                    cCharAt = '*';
                }
                i++;
            }
            sb.append(cCharAt);
        }
        return sb.toString();
    }

    private static String b(String str) {
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        char[] charArray = str.toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            if (i % 2 == 0) {
                charArray[i] = '*';
            }
        }
        return new String(charArray);
    }

    private static String a(String str, String str2) {
        StringBuilder sb = new StringBuilder(512);
        if (!TextUtils.isEmpty(str)) {
            sb.append(str);
        }
        if (!TextUtils.isEmpty(str2)) {
            sb.append(a(str2));
        }
        return sb.toString();
    }

    public static void b(String str, String str2) {
        if (TextUtils.isEmpty(str2)) {
            return;
        }
        Log.v(str, str2);
    }

    private static String a(String str, boolean z) {
        StringBuilder sb = new StringBuilder(512);
        if (!TextUtils.isEmpty(str)) {
            if (z) {
                str = a(str);
            }
            sb.append(str);
        }
        return sb.toString();
    }

    public static Throwable a(Throwable th) {
        if (th == null) {
            return null;
        }
        maa maaVar = new maa(th);
        maaVar.setStackTrace(th.getStackTrace());
        maaVar.a(b(th.getMessage()));
        Throwable cause = th.getCause();
        maa maaVar2 = maaVar;
        while (cause != null) {
            maa maaVar3 = new maa(cause);
            maaVar3.setStackTrace(cause.getStackTrace());
            maaVar3.a(b(cause.getMessage()));
            maaVar2.a(maaVar3);
            cause = cause.getCause();
            maaVar2 = maaVar3;
        }
        return maaVar;
    }
}
