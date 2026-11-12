package c22;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lc22/a0;", "", "Lo53/z;", "main", "computation", "io", "<init>", "(Lo53/z;Lo53/z;Lo53/z;)V", "gcm-common-util_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o53.z f22989a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final o53.z f22990b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final o53.z f22991c;

    /* JADX WARN: Illegal instructions before constructor call */
    public a0(o53.z zVar, o53.z zVar2, o53.z zVar3, int i14, p005kotlin.jvm.internal.j jVar) {
        if ((i14 & 1) != 0) {
            x53.c cVar = o53.s0.f129406a;
            zVar = u53.o.f168762a;
        }
        zVar2 = (i14 & 2) != 0 ? o53.s0.f129406a : zVar2;
        if ((i14 & 4) != 0) {
            x53.c cVar2 = o53.s0.f129406a;
            zVar3 = x53.b.f189152a;
        }
        this(zVar, zVar2, zVar3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a0)) {
            return false;
        }
        a0 a0Var = (a0) obj;
        return p005kotlin.jvm.internal.s.g(this.f22989a, a0Var.f22989a) && p005kotlin.jvm.internal.s.g(this.f22990b, a0Var.f22990b) && p005kotlin.jvm.internal.s.g(this.f22991c, a0Var.f22991c);
    }

    public final int hashCode() {
        return this.f22991c.hashCode() + ((this.f22990b.hashCode() + (this.f22989a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "CoroutinesDispatcherProvider(main=" + this.f22989a + ", computation=" + this.f22990b + ", io=" + this.f22991c + ")";
    }

    public a0(o53.z zVar, o53.z zVar2, o53.z zVar3) {
        zVar.getClass();
        zVar2.getClass();
        zVar3.getClass();
        this.f22989a = zVar;
        this.f22990b = zVar2;
        this.f22991c = zVar3;
    }

    public a0() {
        this(null, null, null, 7, null);
    }
}
