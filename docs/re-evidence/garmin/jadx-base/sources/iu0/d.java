package iu0;

import ju0.q;
import l20.r;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Liu0/d;", "", "Lju0/q;", "dto", "Ll20/r;", "contacts", "Lsd2/f;", "device", "<init>", "(Lju0/q;Ll20/r;Lsd2/f;)V", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final q f95018a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final r f95019b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final sd2.f f95020c;

    public /* synthetic */ d(q qVar, r rVar, sd2.f fVar, int i14, j jVar) {
        this((i14 & 1) != 0 ? null : qVar, (i14 & 2) != 0 ? null : rVar, fVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return s.g(this.f95018a, dVar.f95018a) && s.g(this.f95019b, dVar.f95019b) && s.g(this.f95020c, dVar.f95020c);
    }

    public final int hashCode() {
        q qVar = this.f95018a;
        int iHashCode = (qVar == null ? 0 : qVar.hashCode()) * 31;
        r rVar = this.f95019b;
        int iHashCode2 = (iHashCode + (rVar == null ? 0 : rVar.hashCode())) * 31;
        sd2.f fVar = this.f95020c;
        return iHashCode2 + (fVar != null ? fVar.hashCode() : 0);
    }

    public final String toString() {
        return "LiveEventSharingResources(dto=" + this.f95018a + ", contacts=" + this.f95019b + ", device=" + this.f95020c + ")";
    }

    public d(q qVar, r rVar, sd2.f fVar) {
        this.f95018a = qVar;
        this.f95019b = rVar;
        this.f95020c = fVar;
    }
}
