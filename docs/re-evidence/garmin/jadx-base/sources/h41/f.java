package h41;

import i41.h;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lh41/f;", "", "", "last4WeekDayIndex", "", "balancedLow", "balancedUpper", "weeklyAvg", "Li41/h;", "status", "<init>", "(ILjava/lang/Float;Ljava/lang/Float;Ljava/lang/Integer;Li41/h;)V", "gcm-overnighthrv_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f81613a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Float f81614b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Float f81615c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Integer f81616d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final h f81617e;

    public f(int i14, Float f14, Float f15, Integer num, h hVar) {
        this.f81613a = i14;
        this.f81614b = f14;
        this.f81615c = f15;
        this.f81616d = num;
        this.f81617e = hVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return this.f81613a == fVar.f81613a && s.g(this.f81614b, fVar.f81614b) && s.g(this.f81615c, fVar.f81615c) && s.g(this.f81616d, fVar.f81616d) && this.f81617e == fVar.f81617e;
    }

    public final int hashCode() {
        int iHashCode = Integer.hashCode(this.f81613a) * 31;
        Float f14 = this.f81614b;
        int iHashCode2 = (iHashCode + (f14 == null ? 0 : f14.hashCode())) * 31;
        Float f15 = this.f81615c;
        int iHashCode3 = (iHashCode2 + (f15 == null ? 0 : f15.hashCode())) * 31;
        Integer num = this.f81616d;
        int iHashCode4 = (iHashCode3 + (num == null ? 0 : num.hashCode())) * 31;
        h hVar = this.f81617e;
        return iHashCode4 + (hVar != null ? hVar.hashCode() : 0);
    }

    public final String toString() {
        return "HrvStatusCardChartEntry(last4WeekDayIndex=" + this.f81613a + ", balancedLow=" + this.f81614b + ", balancedUpper=" + this.f81615c + ", weeklyAvg=" + this.f81616d + ", status=" + this.f81617e + ")";
    }
}
