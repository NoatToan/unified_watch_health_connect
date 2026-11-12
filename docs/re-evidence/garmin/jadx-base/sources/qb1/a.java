package qb1;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001BC\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0002\u0012\b\b\u0002\u0010\b\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lqb1/a;", "", "", "showPregnancyCycleTypeErrorDialog", "showSetUpPregnancyAgainDialog", "showHydrationDialog", "showWeightGainDialog", "showOverlappingPregnancyErrorDialog", "showGDPRConsentModel", "<init>", "(ZZZZZZ)V", "gcm-pregnancy-tracking_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f144029a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f144030b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f144031c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f144032d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f144033e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f144034f;

    public /* synthetic */ a(boolean z14, boolean z15, boolean z16, boolean z17, boolean z18, boolean z19, int i14, p005kotlin.jvm.internal.j jVar) {
        this((i14 & 1) != 0 ? false : z14, (i14 & 2) != 0 ? false : z15, (i14 & 4) != 0 ? false : z16, (i14 & 8) != 0 ? false : z17, (i14 & 16) != 0 ? false : z18, (i14 & 32) != 0 ? false : z19);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f144029a == aVar.f144029a && this.f144030b == aVar.f144030b && this.f144031c == aVar.f144031c && this.f144032d == aVar.f144032d && this.f144033e == aVar.f144033e && this.f144034f == aVar.f144034f;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f144034f) + q6.f.g(q6.f.g(q6.f.g(q6.f.g(Boolean.hashCode(this.f144029a) * 31, 31, this.f144030b), 31, this.f144031c), 31, this.f144032d), 31, this.f144033e);
    }

    public final String toString() {
        boolean z14 = this.f144030b;
        boolean z15 = this.f144031c;
        boolean z16 = this.f144032d;
        boolean z17 = this.f144033e;
        boolean z18 = this.f144034f;
        StringBuilder sbM = com.airbnb.lottie.animation.keyframe.a.m("PregnancySetUpUIModel(showPregnancyCycleTypeErrorDialog=", ", showSetUpPregnancyAgainDialog=", ", showHydrationDialog=", this.f144029a, z14);
        kg.f.q(", showWeightGainDialog=", ", showOverlappingPregnancyErrorDialog=", sbM, z15, z16);
        return com.airbnb.lottie.animation.keyframe.a.f(", showGDPRConsentModel=", ")", sbM, z17, z18);
    }

    public a(boolean z14, boolean z15, boolean z16, boolean z17, boolean z18, boolean z19) {
        this.f144029a = z14;
        this.f144030b = z15;
        this.f144031c = z16;
        this.f144032d = z17;
        this.f144033e = z18;
        this.f144034f = z19;
    }

    public a() {
        this(false, false, false, false, false, false, 63, null);
    }
}
