package com.loc;

import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.text.TextUtils;

/* JADX INFO: loaded from: classes18.dex */
public final class p {
    private volatile b a = new b(0);
    private x b = new x("HttpsDecisionUtil");

    public static class a {
        public static p a = new p();
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

        public /* synthetic */ b(byte b) {
            this();
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

        public final void b(boolean z) {
            this.d = z;
        }
    }

    public static p a() {
        return a.a;
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

    public static boolean b() {
        return Build.VERSION.SDK_INT == 19;
    }

    public final void a(Context context) {
        if (this.a == null) {
            this.a = new b((byte) 0);
        }
        this.a.a(this.b.a(context, "isTargetRequired"));
        this.a.a(context);
    }

    public final void a(Context context, boolean z) {
        if (this.a == null) {
            this.a = new b((byte) 0);
        }
        this.b.a(context, "isTargetRequired", z);
        this.a.a(z);
    }

    public final void a(boolean z) {
        if (this.a == null) {
            this.a = new b((byte) 0);
        }
        this.a.b(z);
    }

    public final void b(Context context) {
        this.b.a(context, "isTargetRequired", true);
    }

    public final boolean b(boolean z) {
        byte b2 = 0;
        if (b()) {
            return false;
        }
        if (z) {
            return true;
        }
        if (this.a == null) {
            this.a = new b(b2);
        }
        return this.a.a();
    }
}
