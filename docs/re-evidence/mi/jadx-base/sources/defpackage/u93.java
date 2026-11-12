package defpackage;

import android.content.Context;
import android.content.res.Resources;
import java.util.Locale;

/* JADX INFO: loaded from: classes3.dex */
public class u93 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static c4n<u93> f35540b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Resources f35541a;

    public class a extends c4n<u93> {
        @Override // defpackage.c4n
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public u93 a(Object obj) {
            return new u93((Context) obj, null);
        }

        @Override // defpackage.c4n
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public void c(u93 u93Var, Object obj) {
            super.c(u93Var, obj);
            u93Var.u((Context) obj);
        }
    }

    public /* synthetic */ u93(Context context, a aVar) {
        this(context);
    }

    public static u93 n(Context context) {
        if (f35540b == null) {
            f35540b = new a();
        }
        return f35540b.b(context);
    }

    public String[] b() {
        return this.f35541a.getStringArray(ihi.f21148a);
    }

    public String[] c() {
        return this.f35541a.getStringArray(ihi.f21149b);
    }

    public String[] d() {
        return this.f35541a.getStringArray(ihi.c);
    }

    public String[] e() {
        return this.f35541a.getStringArray(ihi.d);
    }

    public String[] f() {
        return this.f35541a.getStringArray(ihi.e);
    }

    public String[] g() {
        return this.f35541a.getStringArray(ihi.f);
    }

    public String[] h() {
        return this.f35541a.getStringArray(ihi.g);
    }

    public String[] i() {
        return this.f35541a.getStringArray(ihi.h);
    }

    public String[] j() {
        return this.f35541a.getStringArray(ihi.i);
    }

    public String[] k() {
        return this.f35541a.getStringArray(ihi.j);
    }

    public Locale l() {
        return Locale.getDefault();
    }

    public String[] m() {
        return this.f35541a.getStringArray(ihi.f21150k);
    }

    public String[] o() {
        return this.f35541a.getStringArray(ihi.l);
    }

    public String[] p() {
        return this.f35541a.getStringArray(ihi.p);
    }

    public String[] q() {
        return this.f35541a.getStringArray(ihi.m);
    }

    public String[] r() {
        return this.f35541a.getStringArray(ihi.q);
    }

    public String[] s() {
        return this.f35541a.getStringArray(ihi.n);
    }

    public String[] t() {
        return this.f35541a.getStringArray(ihi.o);
    }

    public final void u(Context context) {
        this.f35541a = context.getResources();
    }

    public u93(Context context) {
        this.f35541a = context.getResources();
    }
}
