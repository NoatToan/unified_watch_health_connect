package o51;

import j53.l;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;
import yc.l2;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B=\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0014\b\u0002\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00020\u0002\u0012\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u0002¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lo51/i;", "", "Li53/c;", "Lt41/h;", "headers", "Lo51/h;", "splits", "totals", "<init>", "(Li53/c;Li53/c;Li53/c;)V", "gcm-pacepro_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i53.c<t41.h> f129269a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i53.c<i53.c<h>> f129270b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final i53.c<h> f129271c;

    public i(i53.c cVar, i53.c cVar2, i53.c cVar3, int i14, p005kotlin.jvm.internal.j jVar) {
        this((i14 & 1) != 0 ? l.b() : cVar, (i14 & 2) != 0 ? l.b() : cVar2, (i14 & 4) != 0 ? l.b() : cVar3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return s.g(this.f129269a, iVar.f129269a) && s.g(this.f129270b, iVar.f129270b) && s.g(this.f129271c, iVar.f129271c);
    }

    public final int hashCode() {
        return this.f129271c.hashCode() + l2.a(this.f129270b, this.f129269a.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("PaceProSplitsState(headers=");
        sb3.append(this.f129269a);
        sb3.append(", splits=");
        sb3.append(this.f129270b);
        sb3.append(", totals=");
        return l2.e(sb3, this.f129271c, ")");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public i(i53.c<? extends t41.h> cVar, i53.c<? extends i53.c<h>> cVar2, i53.c<h> cVar3) {
        cVar.getClass();
        cVar2.getClass();
        cVar3.getClass();
        this.f129269a = cVar;
        this.f129270b = cVar2;
        this.f129271c = cVar3;
    }

    public i() {
        this(null, null, null, 7, null);
    }
}
