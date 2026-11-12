package l4;

import ch.qos.logback.core.CoreConstants;
import h5.x0;
import kotlin.m2;
import kotlin.v3;
import o4.e0;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0082\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B9\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Ll4/q;", "Lh5/x0;", "Ll4/s;", "Lt4/d;", "painter", "", "sizeToIntrinsics", "Lh4/d;", "alignment", "Lf5/k;", "contentScale", "", "alpha", "Lo4/e0;", "colorFilter", "<init>", "(Lt4/d;ZLh4/d;Lf5/k;FLo4/e0;)V", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
final /* data */ class q extends x0<s> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final t4.d f109857a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f109858b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final h4.d f109859c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final f5.k f109860d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float f109861e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final e0 f109862f;

    public q(t4.d dVar, boolean z14, h4.d dVar2, f5.k kVar, float f14, e0 e0Var) {
        this.f109857a = dVar;
        this.f109858b = z14;
        this.f109859c = dVar2;
        this.f109860d = kVar;
        this.f109861e = f14;
        this.f109862f = e0Var;
    }

    @Override // h5.x0
    public final h4.r.c create() {
        return new s(this.f109857a, this.f109858b, this.f109859c, this.f109860d, this.f109861e, this.f109862f);
    }

    @Override // h5.x0
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q)) {
            return false;
        }
        q qVar = (q) obj;
        return p005kotlin.jvm.internal.s.g(this.f109857a, qVar.f109857a) && this.f109858b == qVar.f109858b && p005kotlin.jvm.internal.s.g(this.f109859c, qVar.f109859c) && p005kotlin.jvm.internal.s.g(this.f109860d, qVar.f109860d) && Float.compare(this.f109861e, qVar.f109861e) == 0 && p005kotlin.jvm.internal.s.g(this.f109862f, qVar.f109862f);
    }

    @Override // h5.x0
    public final int hashCode() {
        int iD = q6.f.d(this.f109861e, (this.f109860d.hashCode() + ((this.f109859c.hashCode() + q6.f.g(this.f109857a.hashCode() * 31, 31, this.f109858b)) * 31)) * 31, 31);
        e0 e0Var = this.f109862f;
        return iD + (e0Var == null ? 0 : e0Var.hashCode());
    }

    @Override // h5.x0
    public final void inspectableProperties(m2 m2Var) {
        m2Var.f91341a = "paint";
        v3 v3Var = m2Var.f91343c;
        v3Var.c(this.f109857a, "painter");
        v3Var.c(Boolean.valueOf(this.f109858b), "sizeToIntrinsics");
        v3Var.c(this.f109859c, "alignment");
        v3Var.c(this.f109860d, "contentScale");
        v3Var.c(Float.valueOf(this.f109861e), "alpha");
        v3Var.c(this.f109862f, "colorFilter");
    }

    public final String toString() {
        return "PainterElement(painter=" + this.f109857a + ", sizeToIntrinsics=" + this.f109858b + ", alignment=" + this.f109859c + ", contentScale=" + this.f109860d + ", alpha=" + this.f109861e + ", colorFilter=" + this.f109862f + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    @Override // h5.x0
    public final void update(h4.r.c cVar) {
        s sVar = (s) cVar;
        boolean z14 = sVar.f109864b;
        t4.d dVar = this.f109857a;
        boolean z15 = this.f109858b;
        boolean z16 = z14 != z15 || (z15 && !n4.g.c(sVar.f109863a.mo54getIntrinsicSizeNHjbRc(), dVar.mo54getIntrinsicSizeNHjbRc()));
        sVar.f109863a = dVar;
        sVar.f109864b = z15;
        sVar.f109865c = this.f109859c;
        sVar.f109866d = this.f109860d;
        sVar.f109867e = this.f109861e;
        sVar.f109868f = this.f109862f;
        if (z16) {
            h5.k.g(sVar).T();
        }
        h5.t.a(sVar);
    }
}
