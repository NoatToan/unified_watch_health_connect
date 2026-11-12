package com.amap.api.col.p0003sl;

import android.content.Context;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Build;
import android.text.TextUtils;
import androidx.webkit.ProxyConfig;

/* JADX INFO: loaded from: classes4.dex */
public final class ir {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private volatile b f2810a = new b(0);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private ki f2811b = new ki("HttpsDecisionUtil");

    static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static ir f2812a = new ir();
    }

    private static boolean c() {
        return false;
    }

    public static ir a() {
        return a.f2812a;
    }

    public final void a(Context context) {
        if (this.f2810a == null) {
            this.f2810a = new b((byte) 0);
        }
        this.f2810a.a(ki.a(context, "open_common", "a3", true));
        this.f2810a.a(context);
        jh.a(context).a();
    }

    public final void a(boolean z) {
        if (this.f2810a == null) {
            this.f2810a = new b((byte) 0);
        }
        this.f2810a.b(z);
    }

    final void a(Context context, boolean z) {
        if (this.f2810a == null) {
            this.f2810a = new b((byte) 0);
        }
        b(context, z);
        this.f2810a.a(z);
    }

    public final boolean b() {
        if (this.f2810a == null) {
            this.f2810a = new b((byte) 0);
        }
        return this.f2810a.a();
    }

    private static void b(Context context, boolean z) {
        SharedPreferences.Editor editorA = ki.a(context, "open_common");
        ki.a(editorA, "a3", z);
        ki.a(editorA);
    }

    static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        protected boolean f2813a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f2814b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final boolean f2815c;
        private boolean d;

        private b() {
            this.f2814b = 0;
            this.f2813a = true;
            this.f2815c = true;
            this.d = false;
        }

        /* synthetic */ b(byte b2) {
            this();
        }

        public final void a(Context context) {
            if (context != null && this.f2814b <= 0) {
                this.f2814b = context.getApplicationContext().getApplicationInfo().targetSdkVersion;
            }
        }

        public final void a(boolean z) {
            this.f2813a = z;
        }

        public final void b(boolean z) {
            this.d = z;
        }

        public final boolean a() {
            int i;
            if (!this.d) {
                boolean z = Build.VERSION.SDK_INT >= 28;
                boolean z2 = !this.f2813a || (i = this.f2814b) <= 0 || i >= 28;
                if (!z || !z2) {
                    return false;
                }
            }
            return true;
        }
    }

    public static String a(String str) {
        if (TextUtils.isEmpty(str) || str.startsWith(ProxyConfig.MATCH_HTTPS)) {
            return str;
        }
        try {
            Uri.Builder builderBuildUpon = Uri.parse(str).buildUpon();
            builderBuildUpon.scheme(ProxyConfig.MATCH_HTTPS);
            return builderBuildUpon.build().toString();
        } catch (Throwable unused) {
            return str;
        }
    }

    public final boolean b(boolean z) {
        if (c()) {
            return false;
        }
        return z || b();
    }

    public static void b(Context context) {
        b(context, true);
    }
}
