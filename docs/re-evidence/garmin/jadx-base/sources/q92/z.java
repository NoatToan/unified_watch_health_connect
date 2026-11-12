package q92;

import o53.s0;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0080\b\u0018\u00002\u00020\u0001B%\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lq92/z;", "", "Lo53/z;", "main", "computation", "io", "<init>", "(Lo53/z;Lo53/z;Lo53/z;)V", "garmin-consent_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o53.z f143826a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final o53.z f143827b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final o53.z f143828c;

    /* JADX WARN: Illegal instructions before constructor call */
    public z(o53.z zVar, o53.z zVar2, o53.z zVar3, int i14, p005kotlin.jvm.internal.j jVar) {
        if ((i14 & 1) != 0) {
            x53.c cVar = s0.f129406a;
            zVar = u53.o.f168762a;
        }
        zVar2 = (i14 & 2) != 0 ? s0.f129406a : zVar2;
        if ((i14 & 4) != 0) {
            x53.c cVar2 = s0.f129406a;
            zVar3 = x53.b.f189152a;
        }
        this(zVar, zVar2, zVar3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z)) {
            return false;
        }
        z zVar = (z) obj;
        return p005kotlin.jvm.internal.s.g(this.f143826a, zVar.f143826a) && p005kotlin.jvm.internal.s.g(this.f143827b, zVar.f143827b) && p005kotlin.jvm.internal.s.g(this.f143828c, zVar.f143828c);
    }

    public final int hashCode() {
        return this.f143828c.hashCode() + ((this.f143827b.hashCode() + (this.f143826a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "CoroutinesDispatcherProvider(main=" + this.f143826a + ", computation=" + this.f143827b + ", io=" + this.f143828c + ")";
    }

    public z(o53.z zVar, o53.z zVar2, o53.z zVar3) {
        zVar.getClass();
        zVar2.getClass();
        zVar3.getClass();
        this.f143826a = zVar;
        this.f143827b = zVar2;
        this.f143828c = zVar3;
    }

    public z() {
        this(null, null, null, 7, null);
    }
}
