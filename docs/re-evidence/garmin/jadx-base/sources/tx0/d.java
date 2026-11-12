package tx0;

import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001BM\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0002\u0012\b\b\u0002\u0010\b\u001a\u00020\u0002\u0012\b\b\u0002\u0010\t\u001a\u00020\u0002¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Ltx0/d;", "", "", "flow", "physicalSymptoms", "mood", "discharge", "ovulation", "sexualActivity", "sexDrive", "<init>", "(ZZZZZZZ)V", "impl_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f166826a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f166827b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f166828c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f166829d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f166830e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f166831f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f166832g;

    public /* synthetic */ d(boolean z14, boolean z15, boolean z16, boolean z17, boolean z18, boolean z19, boolean z24, int i14, j jVar) {
        this((i14 & 1) != 0 ? false : z14, (i14 & 2) != 0 ? false : z15, (i14 & 4) != 0 ? false : z16, (i14 & 8) != 0 ? false : z17, (i14 & 16) != 0 ? false : z18, (i14 & 32) != 0 ? false : z19, (i14 & 64) != 0 ? false : z24);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return this.f166826a == dVar.f166826a && this.f166827b == dVar.f166827b && this.f166828c == dVar.f166828c && this.f166829d == dVar.f166829d && this.f166830e == dVar.f166830e && this.f166831f == dVar.f166831f && this.f166832g == dVar.f166832g;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f166832g) + q6.f.g(q6.f.g(q6.f.g(q6.f.g(q6.f.g(Boolean.hashCode(this.f166826a) * 31, 31, this.f166827b), 31, this.f166828c), 31, this.f166829d), 31, this.f166830e), 31, this.f166831f);
    }

    public final String toString() {
        StringBuilder sbM = com.airbnb.lottie.animation.keyframe.a.m("MenstrualCycleSymptomsSectionVisibility(flow=", ", physicalSymptoms=", ", mood=", this.f166826a, this.f166827b);
        kg.f.q(", discharge=", ", ovulation=", sbM, this.f166828c, this.f166829d);
        kg.f.q(", sexualActivity=", ", sexDrive=", sbM, this.f166830e, this.f166831f);
        return hb.a.k(sbM, this.f166832g, ")");
    }

    public d(boolean z14, boolean z15, boolean z16, boolean z17, boolean z18, boolean z19, boolean z24) {
        this.f166826a = z14;
        this.f166827b = z15;
        this.f166828c = z16;
        this.f166829d = z17;
        this.f166830e = z18;
        this.f166831f = z19;
        this.f166832g = z24;
    }

    public d() {
        this(false, false, false, false, false, false, false, 127, null);
    }
}
