package ry0;

import cy0.q;
import e23.p;
import ly0.s;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import yc.l2;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0016\b\u0002\u0010\t\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u0007\u0018\u00010\u0006¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lry0/c;", "", "Lcy0/q;", "summary", "Lly0/s;", "mapData", "Li53/c;", "Lkotlin/Function0;", "", "galleryComponents", "<init>", "(Lcy0/q;Lly0/s;Li53/c;)V", "gcm-multi-day-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final q f155064a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final s f155065b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final i53.c<p<p3.m, Integer, Unit>> f155066c;

    /* JADX WARN: Multi-variable type inference failed */
    public c(q qVar, s sVar, i53.c<? extends p<? super p3.m, ? super Integer, Unit>> cVar) {
        qVar.getClass();
        this.f155064a = qVar;
        this.f155065b = sVar;
        this.f155066c = cVar;
    }

    public static c a(c cVar, i53.f fVar) {
        q qVar = cVar.f155064a;
        s sVar = cVar.f155065b;
        qVar.getClass();
        return new c(qVar, sVar, fVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return p005kotlin.jvm.internal.s.g(this.f155064a, cVar.f155064a) && p005kotlin.jvm.internal.s.g(this.f155065b, cVar.f155065b) && p005kotlin.jvm.internal.s.g(this.f155066c, cVar.f155066c);
    }

    public final int hashCode() {
        int iHashCode = this.f155064a.hashCode() * 31;
        s sVar = this.f155065b;
        int iHashCode2 = (iHashCode + (sVar == null ? 0 : sVar.hashCode())) * 31;
        i53.c<p<p3.m, Integer, Unit>> cVar = this.f155066c;
        return iHashCode2 + (cVar != null ? cVar.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("ListSummary(summary=");
        sb3.append(this.f155064a);
        sb3.append(", mapData=");
        sb3.append(this.f155065b);
        sb3.append(", galleryComponents=");
        return l2.e(sb3, this.f155066c, ")");
    }

    public /* synthetic */ c(q qVar, s sVar, i53.c cVar, int i14, p005kotlin.jvm.internal.j jVar) {
        this(qVar, sVar, (i14 & 4) != 0 ? null : cVar);
    }
}
