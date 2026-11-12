package jf;

import o4.e0;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002BK\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Ljf/q;", "Ljf/w;", "Lc2/t;", "parentScope", "Ljf/d;", "painter", "", "contentDescription", "Lh4/d;", "alignment", "Lf5/k;", "contentScale", "", "alpha", "Lo4/e0;", "colorFilter", "", "clipToBounds", "<init>", "(Lc2/t;Ljf/d;Ljava/lang/String;Lh4/d;Lf5/k;FLo4/e0;Z)V", "coil-compose-core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class q implements w, c2.t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c2.t f98678a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d f98679b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f98680c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final h4.d f98681d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final f5.k f98682e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final float f98683f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e0 f98684g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f98685h;

    public q(c2.t tVar, d dVar, String str, h4.d dVar2, f5.k kVar, float f14, e0 e0Var, boolean z14) {
        this.f98678a = tVar;
        this.f98679b = dVar;
        this.f98680c = str;
        this.f98681d = dVar2;
        this.f98682e = kVar;
        this.f98683f = f14;
        this.f98684g = e0Var;
        this.f98685h = z14;
    }

    @Override // jf.w
    /* JADX INFO: renamed from: a, reason: from getter */
    public final float getF98683f() {
        return this.f98683f;
    }

    @Override // jf.w
    /* JADX INFO: renamed from: b, reason: from getter */
    public final d getF98679b() {
        return this.f98679b;
    }

    @Override // c2.t
    public final h4.r c(h4.r rVar, h4.d dVar) {
        return this.f98678a.c(rVar, dVar);
    }

    @Override // c2.t
    public final h4.r d(h4.r rVar) {
        return this.f98678a.d(rVar);
    }

    @Override // jf.w
    /* JADX INFO: renamed from: e, reason: from getter */
    public final e0 getF98684g() {
        return this.f98684g;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q)) {
            return false;
        }
        q qVar = (q) obj;
        return p005kotlin.jvm.internal.s.g(this.f98678a, qVar.f98678a) && p005kotlin.jvm.internal.s.g(this.f98679b, qVar.f98679b) && p005kotlin.jvm.internal.s.g(this.f98680c, qVar.f98680c) && p005kotlin.jvm.internal.s.g(this.f98681d, qVar.f98681d) && p005kotlin.jvm.internal.s.g(this.f98682e, qVar.f98682e) && Float.compare(this.f98683f, qVar.f98683f) == 0 && p005kotlin.jvm.internal.s.g(this.f98684g, qVar.f98684g) && this.f98685h == qVar.f98685h;
    }

    @Override // jf.w
    /* JADX INFO: renamed from: getContentDescription, reason: from getter */
    public final String getF98680c() {
        return this.f98680c;
    }

    public final int hashCode() {
        int iHashCode = (this.f98679b.hashCode() + (this.f98678a.hashCode() * 31)) * 31;
        String str = this.f98680c;
        int iD = q6.f.d(this.f98683f, (this.f98682e.hashCode() + ((this.f98681d.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31)) * 31)) * 31, 31);
        e0 e0Var = this.f98684g;
        return Boolean.hashCode(this.f98685h) + ((iD + (e0Var != null ? e0Var.hashCode() : 0)) * 31);
    }

    @Override // jf.w
    /* JADX INFO: renamed from: k, reason: from getter */
    public final f5.k getF98682e() {
        return this.f98682e;
    }

    @Override // jf.w
    /* JADX INFO: renamed from: l, reason: from getter */
    public final h4.d getF98681d() {
        return this.f98681d;
    }

    @Override // jf.w
    /* JADX INFO: renamed from: m, reason: from getter */
    public final boolean getF98685h() {
        return this.f98685h;
    }

    public final String toString() {
        return "RealSubcomposeAsyncImageScope(parentScope=" + this.f98678a + ", painter=" + this.f98679b + ", contentDescription=" + this.f98680c + ", alignment=" + this.f98681d + ", contentScale=" + this.f98682e + ", alpha=" + this.f98683f + ", colorFilter=" + this.f98684g + ", clipToBounds=" + this.f98685h + ")";
    }
}
