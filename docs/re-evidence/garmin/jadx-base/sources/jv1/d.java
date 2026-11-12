package jv1;

import p005kotlin.Metadata;
import r1.q2;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Ljv1/d;", "", "Lhv1/j;", "weeklyAvgValue", "", "AvgPaceValue", "Ljv1/y;", "fitnessStatesFromAPI", "<init>", "(Lhv1/j;ILjv1/y;)V", "gcm-training-plans_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final hv1.j f101026a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f101027b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final y f101028c;

    public /* synthetic */ d(hv1.j jVar, int i14, y yVar, int i15, p005kotlin.jvm.internal.j jVar2) {
        this((i15 & 1) != 0 ? hv1.j.ZERO : jVar, (i15 & 2) != 0 ? 0 : i14, (i15 & 4) != 0 ? null : yVar);
    }

    public static d a(d dVar, hv1.j jVar, int i14, int i15) {
        if ((i15 & 1) != 0) {
            jVar = dVar.f101026a;
        }
        if ((i15 & 2) != 0) {
            i14 = dVar.f101027b;
        }
        y yVar = dVar.f101028c;
        dVar.getClass();
        jVar.getClass();
        return new d(jVar, i14, yVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return this.f101026a == dVar.f101026a && this.f101027b == dVar.f101027b && p005kotlin.jvm.internal.s.g(this.f101028c, dVar.f101028c);
    }

    public final int hashCode() {
        int iD = q2.d(this.f101027b, this.f101026a.hashCode() * 31, 31);
        y yVar = this.f101028c;
        return iD + (yVar == null ? 0 : yVar.hashCode());
    }

    public final String toString() {
        return "AtpWeeklyAvgAndPaceUIModel(weeklyAvgValue=" + this.f101026a + ", AvgPaceValue=" + this.f101027b + ", fitnessStatesFromAPI=" + this.f101028c + ")";
    }

    public d(hv1.j jVar, int i14, y yVar) {
        jVar.getClass();
        this.f101026a = jVar;
        this.f101027b = i14;
        this.f101028c = yVar;
    }

    public d() {
        this(null, 0, null, 7, null);
    }
}
