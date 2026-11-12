package v11;

import c22.c3;
import j53.l;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lv11/d;", "", "Lc22/c3;", "stringResId", "Li53/c;", "", "args", "<init>", "(Lc22/c3;Li53/c;)V", "gcm-nutrition_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c3 f174683a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i53.c<String> f174684b;

    public d(c3 c3Var, i53.c<String> cVar) {
        c3Var.getClass();
        cVar.getClass();
        this.f174683a = c3Var;
        this.f174684b = cVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return s.g(this.f174683a, dVar.f174683a) && s.g(this.f174684b, dVar.f174684b);
    }

    public final int hashCode() {
        return this.f174684b.hashCode() + (this.f174683a.hashCode() * 31);
    }

    public final String toString() {
        return "StringResource(stringResId=" + this.f174683a + ", args=" + this.f174684b + ")";
    }

    public d(c3 c3Var, i53.c cVar, int i14, j jVar) {
        this(c3Var, (i14 & 2) != 0 ? l.b() : cVar);
    }
}
