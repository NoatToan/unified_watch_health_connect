package ht;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lht/e;", "", "", "gasChanged", "suitChanged", "suitThicknessChanged", "equipmentChanged", "<init>", "(ZZZZ)V", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f85468a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f85469b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f85470c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f85471d;

    public e(boolean z14, boolean z15, boolean z16, boolean z17) {
        this.f85468a = z14;
        this.f85469b = z15;
        this.f85470c = z16;
        this.f85471d = z17;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return this.f85468a == eVar.f85468a && this.f85469b == eVar.f85469b && this.f85470c == eVar.f85470c && this.f85471d == eVar.f85471d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f85471d) + q6.f.g(q6.f.g(Boolean.hashCode(this.f85468a) * 31, 31, this.f85469b), 31, this.f85470c);
    }

    public final String toString() {
        boolean z14 = this.f85468a;
        return com.airbnb.lottie.animation.keyframe.a.f(", equipmentChanged=", ")", com.airbnb.lottie.animation.keyframe.a.m("EditDiveGearAnalyticInfo(gasChanged=", ", suitChanged=", ", suitThicknessChanged=", z14, this.f85469b), this.f85470c, this.f85471d);
    }
}
