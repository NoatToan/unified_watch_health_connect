package tq0;

import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;
import r1.q2;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Ltq0/l;", "", "Ltq0/a;", "activityDTO", "", "selectedFieldIndex", "selectedMonth", "selectedYear", "<init>", "(Ltq0/a;III)V", "gcm-insights_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f166099a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f166100b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f166101c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f166102d;

    public /* synthetic */ l(a aVar, int i14, int i15, int i16, int i17, p005kotlin.jvm.internal.j jVar) {
        this(aVar, (i17 & 2) != 0 ? 0 : i14, (i17 & 4) != 0 ? 0 : i15, (i17 & 8) != 0 ? 0 : i16);
    }

    public static l a(l lVar, int i14, int i15, int i16, int i17) {
        a aVar = lVar.f166099a;
        if ((i17 & 2) != 0) {
            i14 = lVar.f166100b;
        }
        if ((i17 & 4) != 0) {
            i15 = lVar.f166101c;
        }
        if ((i17 & 8) != 0) {
            i16 = lVar.f166102d;
        }
        lVar.getClass();
        aVar.getClass();
        return new l(aVar, i14, i15, i16);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        return s.g(this.f166099a, lVar.f166099a) && this.f166100b == lVar.f166100b && this.f166101c == lVar.f166101c && this.f166102d == lVar.f166102d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f166102d) + q2.d(this.f166101c, q2.d(this.f166100b, this.f166099a.hashCode() * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("InsightsActivityData(activityDTO=");
        sb3.append(this.f166099a);
        sb3.append(", selectedFieldIndex=");
        sb3.append(this.f166100b);
        sb3.append(", selectedMonth=");
        return androidx.core.view.j.e(this.f166101c, this.f166102d, ", selectedYear=", ")", sb3);
    }

    public l(a aVar, int i14, int i15, int i16) {
        aVar.getClass();
        this.f166099a = aVar;
        this.f166100b = i14;
        this.f166101c = i15;
        this.f166102d = i16;
    }
}
