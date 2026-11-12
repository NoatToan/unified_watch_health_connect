package kw0;

import b63.o;
import g22.l;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;
import pv0.y;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lkw0/d;", "", "Lb63/o;", "calendarDate", "", "amount", "Lpv0/y;", "behaviourSubType", "<init>", "(Lb63/o;Ljava/lang/Integer;Lpv0/y;)V", "impl_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o f106914a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Integer f106915b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final y f106916c;

    public /* synthetic */ d(o oVar, Integer num, y yVar, int i14, j jVar) {
        this((i14 & 1) != 0 ? l.d(o.INSTANCE) : oVar, num, (i14 & 4) != 0 ? null : yVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return s.g(this.f106914a, dVar.f106914a) && s.g(this.f106915b, dVar.f106915b) && s.g(this.f106916c, dVar.f106916c);
    }

    public final int hashCode() {
        o oVar = this.f106914a;
        int iHashCode = (oVar == null ? 0 : oVar.f16206a.hashCode()) * 31;
        Integer num = this.f106915b;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        y yVar = this.f106916c;
        return iHashCode2 + (yVar != null ? yVar.hashCode() : 0);
    }

    public final String toString() {
        return "BehaviourLogDetails(calendarDate=" + this.f106914a + ", amount=" + this.f106915b + ", behaviourSubType=" + this.f106916c + ")";
    }

    public d(o oVar, Integer num, y yVar) {
        this.f106914a = oVar;
        this.f106915b = num;
        this.f106916c = yVar;
    }
}
