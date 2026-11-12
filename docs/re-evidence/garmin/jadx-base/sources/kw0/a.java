package kw0;

import b63.o;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import pv0.s;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lkw0/a;", "", "Lb63/o;", "calendarDate", "Lpv0/s;", "logStatus", "", "isMeasured", "<init>", "(Lb63/o;Lpv0/s;Z)V", "impl_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o f106903a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final s f106904b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f106905c;

    public a(o oVar, s sVar, boolean z14) {
        this.f106903a = oVar;
        this.f106904b = sVar;
        this.f106905c = z14;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return p005kotlin.jvm.internal.s.g(this.f106903a, aVar.f106903a) && this.f106904b == aVar.f106904b && this.f106905c == aVar.f106905c;
    }

    public final int hashCode() {
        o oVar = this.f106903a;
        int iHashCode = (oVar == null ? 0 : oVar.f16206a.hashCode()) * 31;
        s sVar = this.f106904b;
        return Boolean.hashCode(this.f106905c) + ((iHashCode + (sVar != null ? sVar.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("BehaviourDailyLog(calendarDate=");
        sb3.append(this.f106903a);
        sb3.append(", logStatus=");
        sb3.append(this.f106904b);
        sb3.append(", isMeasured=");
        return hb.a.k(sb3, this.f106905c, ")");
    }

    public /* synthetic */ a(o oVar, s sVar, boolean z14, int i14, j jVar) {
        this(oVar, sVar, (i14 & 4) != 0 ? false : z14);
    }
}
