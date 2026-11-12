package com.amap.api.mapcore.util;

import android.content.Context;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Build;
import android.text.TextUtils;

/* JADX INFO: loaded from: classes2.dex */
public final class gp {
    private volatile b a = new b(0);
    private hp b = new hp("HttpsDecisionUtil");

    public static class a {
        public static gp a = new gp();
    }

    public static gp a() {
        return a.a;
    }

    private static void b(Context context, boolean z) {
        SharedPreferences.Editor editorA = hp.a(context, "open_common");
        hp.a(editorA, "a3", z);
        hp.a(editorA);
    }

    public static class b {
        public boolean a;
        private int b;
        private final boolean c;
        private boolean d;

        private b() {
            this.b = 0;
            this.a = true;
            this.c = true;
            this.d = false;
        }

        public final void a(Context context) {
            if (context != null && this.b <= 0 && Build.VERSION.SDK_INT >= 4) {
                this.b = context.getApplicationContext().getApplicationInfo().targetSdkVersion;
            }
        }

        public final void a(boolean z) {
            this.a = z;
        }

        /* JADX WARN: Code duplicated, block: B:19:0x0023  */
        public final boolean a() {
            boolean z;
            if (!this.d) {
                boolean z2 = Build.VERSION.SDK_INT >= 28;
                if (this.a) {
                    int i = this.b;
                    if (i <= 0) {
                        i = 28;
                    }
                    if (i >= 28) {
                        z = true;
                    } else {
                        z = false;
                    }
                } else {
                    z = true;
                }
                if (!(z2 && z)) {
                    return false;
                }
            }
            return true;
        }

        public /* synthetic */ b(byte b) {
            this();
        }
    }

    public final void a(Context context) {
        if (this.a == null) {
            this.a = new b((byte) 0);
        }
        this.a.a(hp.a(context, "open_common", "a3", true));
        this.a.a(context);
    }

    public static void b(Context context) {
        b(context, true);
    }

    public final void a(Context context, boolean z) {
        if (this.a == null) {
            this.a = new b((byte) 0);
        }
        b(context, z);
        this.a.a(z);
    }

    public static String a(String str) {
        if (TextUtils.isEmpty(str) || str.startsWith("https")) {
            return str;
        }
        try {
            Uri.Builder builderBuildUpon = Uri.parse(str).buildUpon();
            builderBuildUpon.scheme("https");
            return builderBuildUpon.build().toString();
        } catch (Throwable unused) {
            return str;
        }
    }

    public final boolean a(boolean z) {
        byte b2 = 0;
        if (Build.VERSION.SDK_INT == 19) {
            return false;
        }
        if (!z) {
            if (this.a == null) {
                this.a = new b(b2);
            }
            if (!this.a.a()) {
                return false;
            }
        }
        return true;
    }
}
