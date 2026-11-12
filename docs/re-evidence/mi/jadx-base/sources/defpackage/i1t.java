package defpackage;

import android.content.Context;
import android.os.Handler;
import android.text.TextUtils;
import com.google.android.gms.auth.api.signin.GoogleSignInStatusCodes;
import com.smarthome.core.modelconfig.PluginDeviceInfo;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import okhttp3.HttpUrl;

/* JADX INFO: loaded from: classes4.dex */
public final class i1t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Context f20670a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public o0t f20671b;
    public boolean c = true;
    public boolean d = false;
    public boolean e = true;
    public boolean f = false;
    public List<String> g = new ArrayList();
    public p1t h = new p1t((byte) 0);
    public p1t i = new p1t();
    public o2t.d j = new a();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public o2t.d f20672k = new b();
    public Handler l = null;
    public z5t m = null;
    public z5t n = null;

    public class a implements o2t.d {

        /* JADX INFO: renamed from: i1t$a$a, reason: collision with other inner class name */
        public class RunnableC0962a implements Runnable {
            public RunnableC0962a() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                i1t.this.s(false);
            }
        }

        public a() {
        }

        @Override // o2t.d
        public final void a(int i) {
            if (i > 0 && i1t.b(i1t.this) != null) {
                ((o1t) i1t.this.p().f).f(i);
                i1t.i(i1t.this, "error", String.valueOf(((o1t) i1t.this.p().f).h()));
                i1t.b(i1t.this).postDelayed(new RunnableC0962a(), 660000L);
            }
        }
    }

    public class b implements o2t.d {

        public class a implements Runnable {
            public a() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                i1t.this.v(false);
            }
        }

        public b() {
        }

        @Override // o2t.d
        public final void a(int i) {
            if (i <= 0) {
                return;
            }
            ((o1t) i1t.this.w().f).f(i);
            i1t.i(i1t.this, "info", String.valueOf(((o1t) i1t.this.w().f).h()));
            if (i1t.b(i1t.this) == null) {
                return;
            }
            i1t.b(i1t.this).postDelayed(new a(), 660000L);
        }
    }

    public static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static Map<String, i1t> f20677a = new HashMap();
    }

    public i1t(o0t o0tVar) {
        this.f20671b = o0tVar;
    }

    public static /* synthetic */ Handler b(i1t i1tVar) {
        Context context = i1tVar.f20670a;
        if (context == null || context == null) {
            return null;
        }
        if (i1tVar.l == null) {
            i1tVar.l = new Handler(i1tVar.f20670a.getMainLooper());
        }
        return i1tVar.l;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0019  */
    public static String c(Context context, String str, o0t o0tVar) {
        String strD;
        if (context == null) {
            return null;
        }
        if (o0tVar != null) {
            try {
                if (TextUtils.isEmpty(o0tVar.a())) {
                    strD = PluginDeviceInfo.FMODEL;
                } else {
                    strD = m0t.d(o0tVar.a());
                }
            } catch (Throwable unused) {
                return null;
            }
        } else {
            strD = PluginDeviceInfo.FMODEL;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(context.getFilesDir().getAbsolutePath());
        String str2 = File.separator;
        sb.append(str2);
        sb.append("EBDEC84EF205FEA2DF0719DEB822869E");
        sb.append(str2);
        sb.append(str);
        sb.append(str2);
        sb.append(strD);
        return sb.toString();
    }

    public static i1t d(o0t o0tVar) {
        if (o0tVar == null || TextUtils.isEmpty(o0tVar.a())) {
            return null;
        }
        if (c.f20677a.get(o0tVar.a()) == null) {
            c.f20677a.put(o0tVar.a(), new i1t(o0tVar));
        }
        return c.f20677a.get(o0tVar.a());
    }

    public static /* synthetic */ void i(i1t i1tVar, String str, String str2) {
        try {
            String str3 = new SimpleDateFormat("yyyyMMdd").format(new Date());
            r1t.c(i1tVar.f20671b).d(i1tVar.f20670a, "", "", str3 + str, str2);
        } catch (Throwable unused) {
        }
    }

    public final String A() {
        Context context = this.f20670a;
        if (context == null) {
            return null;
        }
        return c(context, "CB5E100E5A9A3E7F6D1FD97512215282", this.f20671b);
    }

    public final long a(String str) {
        try {
            String str2 = new SimpleDateFormat("yyyyMMdd").format(new Date());
            return Long.parseLong(r1t.c(this.f20671b).b(this.f20670a, "", "", str2 + str));
        } catch (Throwable unused) {
            return 0L;
        }
    }

    public final void e() {
        if (o()) {
            f(g1t.f);
            f(g1t.e);
        }
    }

    public final void f(int i) {
        Context context;
        p1t p1tVarL = l(i);
        String strC = g1t.c(p1tVarL.a());
        if (TextUtils.isEmpty(strC) || HttpUrl.PATH_SEGMENT_ENCODE_SET_URI.equals(strC) || (context = this.f20670a) == null) {
            return;
        }
        o2t.h(context, this.f20671b, g1t.b(i), q(i), strC);
        p1tVarL.d();
    }

    public final void g(Context context) {
        this.f20670a = context.getApplicationContext();
    }

    public final void h(g1t g1tVar) {
        if (o() && this.c && g1t.e(g1tVar) && g1tVar != null) {
            List<String> list = this.g;
            if (list != null && list.size() != 0) {
                for (int i = 0; i < this.g.size(); i++) {
                    if (!TextUtils.isEmpty(this.g.get(i)) && g1tVar.f().contains(this.g.get(i))) {
                        return;
                    }
                }
            }
            if (this.e || g1tVar.a() != g1t.e) {
                p1t p1tVarL = l(g1tVar.a());
                if (p1tVarL.c(g1tVar.f())) {
                    String strC = g1t.c(p1tVarL.a());
                    if (this.f20670a == null || TextUtils.isEmpty(strC) || HttpUrl.PATH_SEGMENT_ENCODE_SET_URI.equals(strC)) {
                        return;
                    }
                    o2t.h(this.f20670a, this.f20671b, g1tVar.i(), q(g1tVar.a()), strC);
                    n(false);
                    p1tVarL.d();
                }
                p1tVarL.b(g1tVar);
            }
        }
    }

    public final void j(boolean z) {
        if (o()) {
            n(z);
        }
    }

    public final void k(boolean z, boolean z2, boolean z3, boolean z4, List<String> list) {
        this.c = z;
        this.d = z2;
        this.e = z3;
        this.f = z4;
        this.g = list;
        t();
        y();
    }

    public final p1t l(int i) {
        return i == g1t.f ? this.i : this.h;
    }

    public final void n(boolean z) {
        s(z);
        v(z);
    }

    public final boolean o() {
        return this.f20670a != null;
    }

    public final z5t p() {
        z5t z5tVar = this.n;
        if (z5tVar != null) {
            return z5tVar;
        }
        t();
        return this.n;
    }

    public final z5t q(int i) {
        if (i == g1t.f) {
            if (this.n == null) {
                this.n = p();
            }
            return this.n;
        }
        if (this.m == null) {
            this.m = w();
        }
        return this.m;
    }

    public final void s(boolean z) {
        z5t z5tVarQ = q(g1t.f);
        if (z) {
            ((o1t) z5tVarQ.f).g(z);
        }
        Context context = this.f20670a;
        if (context == null) {
            return;
        }
        o2t.j(context, z5tVarQ, this.j);
    }

    public final z5t t() {
        if (this.f20670a == null) {
            return null;
        }
        z5t z5tVar = new z5t();
        this.n = z5tVar;
        z5tVar.f40930a = A();
        z5t z5tVar2 = this.n;
        z5tVar2.f40931b = 512000000L;
        z5tVar2.d = GoogleSignInStatusCodes.SIGN_IN_FAILED;
        z5tVar2.c = "1";
        z5tVar2.h = -1;
        z5tVar2.i = "elkey";
        long jA = a("error");
        this.n.f = new o1t(true, new w6t(this.f20670a, this.d), jA, 10000000);
        z5t z5tVar3 = this.n;
        z5tVar3.g = null;
        return z5tVar3;
    }

    public final void v(boolean z) {
        z5t z5tVarQ = q(g1t.e);
        if (z) {
            ((o1t) z5tVarQ.f).g(z);
        }
        Context context = this.f20670a;
        if (context == null) {
            return;
        }
        o2t.j(context, z5tVarQ, this.f20672k);
    }

    public final z5t w() {
        z5t z5tVar = this.m;
        if (z5tVar != null) {
            return z5tVar;
        }
        y();
        return this.m;
    }

    public final z5t y() {
        if (this.f20670a == null) {
            return null;
        }
        z5t z5tVar = new z5t();
        this.m = z5tVar;
        z5tVar.f40930a = z();
        z5t z5tVar2 = this.m;
        z5tVar2.f40931b = 512000000L;
        z5tVar2.d = GoogleSignInStatusCodes.SIGN_IN_FAILED;
        z5tVar2.c = "1";
        z5tVar2.h = -1;
        z5tVar2.i = "inlkey";
        long jA = a("info");
        this.m.f = new o1t(this.f, new w6t(this.f20670a, this.d), jA, 30000000);
        z5t z5tVar3 = this.m;
        z5tVar3.g = null;
        return z5tVar3;
    }

    public final String z() {
        Context context = this.f20670a;
        if (context == null) {
            return null;
        }
        return c(context, "CAF9B6B99962BF5C2264824231D7A40C", this.f20671b);
    }
}
