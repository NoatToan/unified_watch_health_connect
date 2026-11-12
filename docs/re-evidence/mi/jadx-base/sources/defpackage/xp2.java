package defpackage;

import android.net.Uri;
import com.facebook.common.time.RealtimeSinceBootClock;

/* JADX INFO: loaded from: classes4.dex */
public class xp2 implements c93 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f39324a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ypk f39325b;
    public final jxk c;
    public final l3d d;
    public final c93 e;
    public final String f;
    public final int g;
    public final Object h;
    public final long i;

    public xp2(String str, ypk ypkVar, jxk jxkVar, l3d l3dVar, c93 c93Var, String str2, Object obj) {
        this.f39324a = (String) b6i.g(str);
        this.f39325b = ypkVar;
        this.c = jxkVar;
        this.d = l3dVar;
        this.e = c93Var;
        this.f = str2;
        this.g = ilb.d(Integer.valueOf(str.hashCode()), Integer.valueOf(ypkVar != null ? ypkVar.hashCode() : 0), Integer.valueOf(jxkVar.hashCode()), l3dVar, c93Var, str2);
        this.h = obj;
        this.i = RealtimeSinceBootClock.get().now();
    }

    @Override // defpackage.c93
    public String a() {
        return this.f39324a;
    }

    @Override // defpackage.c93
    public boolean b(Uri uri) {
        return a().contains(uri.toString());
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof xp2)) {
            return false;
        }
        xp2 xp2Var = (xp2) obj;
        return this.g == xp2Var.g && this.f39324a.equals(xp2Var.f39324a) && i4h.a(this.f39325b, xp2Var.f39325b) && i4h.a(this.c, xp2Var.c) && i4h.a(this.d, xp2Var.d) && i4h.a(this.e, xp2Var.e) && i4h.a(this.f, xp2Var.f);
    }

    public int hashCode() {
        return this.g;
    }

    public String toString() {
        return String.format(null, "%s_%s_%s_%s_%s_%s_%d", this.f39324a, this.f39325b, this.c, this.d, this.e, this.f, Integer.valueOf(this.g));
    }
}
