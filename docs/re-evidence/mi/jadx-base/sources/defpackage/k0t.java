package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Build;
import android.text.TextUtils;
import com.miui.tsmclient.util.Constants;

/* JADX INFO: loaded from: classes4.dex */
public final class k0t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public volatile b f23312a = new b(0);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public i4t f23313b = new i4t("HttpsDecisionUtil");

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static k0t f23314a = new k0t();
    }

    public static k0t a() {
        return a.f23314a;
    }

    public static String b(String str) {
        if (TextUtils.isEmpty(str) || str.startsWith(Constants.URI_SCHEME)) {
            return str;
        }
        try {
            Uri.Builder builderBuildUpon = Uri.parse(str).buildUpon();
            builderBuildUpon.scheme(Constants.URI_SCHEME);
            return builderBuildUpon.build().toString();
        } catch (Throwable unused) {
            return str;
        }
    }

    public static void f(Context context) {
        g(context, true);
    }

    public static void g(Context context, boolean z) {
        SharedPreferences.Editor editorC = i4t.c(context, "open_common");
        i4t.k(editorC, "a3", z);
        i4t.f(editorC);
    }

    public static boolean j() {
        return false;
    }

    public final void c(Context context) {
        if (this.f23312a == null) {
            this.f23312a = new b((byte) 0);
        }
        this.f23312a.b(i4t.l(context, "open_common", "a3", true));
        this.f23312a.a(context);
        u1t.a(context).b();
    }

    public final void d(Context context, boolean z) {
        if (this.f23312a == null) {
            this.f23312a = new b((byte) 0);
        }
        g(context, z);
        this.f23312a.b(z);
    }

    public final void e(boolean z) {
        if (this.f23312a == null) {
            this.f23312a = new b((byte) 0);
        }
        this.f23312a.d(z);
    }

    public final boolean h() {
        if (this.f23312a == null) {
            this.f23312a = new b((byte) 0);
        }
        return this.f23312a.c();
    }

    public final boolean i(boolean z) {
        if (j()) {
            return false;
        }
        return z || h();
    }

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f23315a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public boolean f23316b;
        public final boolean c;
        public boolean d;

        public b() {
            this.f23315a = 0;
            this.f23316b = true;
            this.c = true;
            this.d = false;
        }

        public final void a(Context context) {
            if (context != null && this.f23315a <= 0) {
                this.f23315a = context.getApplicationContext().getApplicationInfo().targetSdkVersion;
            }
        }

        public final void b(boolean z) {
            this.f23316b = z;
        }

        public final boolean c() {
            int i;
            if (!this.d) {
                boolean z = Build.VERSION.SDK_INT >= 28;
                boolean z2 = !this.f23316b || (i = this.f23315a) <= 0 || i >= 28;
                if (!z || !z2) {
                    return false;
                }
            }
            return true;
        }

        public final void d(boolean z) {
            this.d = z;
        }

        public /* synthetic */ b(byte b2) {
            this();
        }
    }
}
