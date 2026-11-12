package yj1;

import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001Be\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0002\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\t\u001a\u00020\u0002\u0012\b\b\u0002\u0010\n\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0002\u0012\b\b\u0002\u0010\f\u001a\u00020\u0002¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lyj1/l;", "", "", "hasLTESubscription", "assistancePlusEnabled", "", "emergencyNotes", "isMyInformationFilled", "emergencyContactsNames", "userHasSeenEmergencyContacts", "userHasSeenLTEMyInformationScreen", "isRegularAssistanceValid", "hasAPlusCapableDevice", "<init>", "(ZZLjava/lang/String;ZLjava/lang/String;ZZZZ)V", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f197559a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f197560b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f197561c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f197562d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f197563e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f197564f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f197565g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f197566h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final boolean f197567i;

    public /* synthetic */ l(boolean z14, boolean z15, String str, boolean z16, String str2, boolean z17, boolean z18, boolean z19, boolean z24, int i14, p005kotlin.jvm.internal.j jVar) {
        this((i14 & 1) != 0 ? false : z14, (i14 & 2) != 0 ? false : z15, (i14 & 4) != 0 ? null : str, (i14 & 8) != 0 ? false : z16, (i14 & 16) != 0 ? null : str2, (i14 & 32) != 0 ? false : z17, (i14 & 64) != 0 ? false : z18, (i14 & 128) != 0 ? false : z19, (i14 & 256) != 0 ? false : z24);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        return this.f197559a == lVar.f197559a && this.f197560b == lVar.f197560b && s.g(this.f197561c, lVar.f197561c) && this.f197562d == lVar.f197562d && s.g(this.f197563e, lVar.f197563e) && this.f197564f == lVar.f197564f && this.f197565g == lVar.f197565g && this.f197566h == lVar.f197566h && this.f197567i == lVar.f197567i;
    }

    public final int hashCode() {
        int iG = q6.f.g(Boolean.hashCode(this.f197559a) * 31, 31, this.f197560b);
        String str = this.f197561c;
        int iG2 = q6.f.g((iG + (str == null ? 0 : str.hashCode())) * 31, 31, this.f197562d);
        String str2 = this.f197563e;
        return Boolean.hashCode(this.f197567i) + q6.f.g(q6.f.g(q6.f.g((iG2 + (str2 != null ? str2.hashCode() : 0)) * 31, 31, this.f197564f), 31, this.f197565g), 31, this.f197566h);
    }

    public final String toString() {
        StringBuilder sbM = com.airbnb.lottie.animation.keyframe.a.m("SafetyFeaturesMainUIModel(hasLTESubscription=", ", assistancePlusEnabled=", ", emergencyNotes=", this.f197559a, this.f197560b);
        v.h.C(this.f197561c, ", isMyInformationFilled=", ", emergencyContactsNames=", sbM, this.f197562d);
        v.h.C(this.f197563e, ", userHasSeenEmergencyContacts=", ", userHasSeenLTEMyInformationScreen=", sbM, this.f197564f);
        kg.f.q(", isRegularAssistanceValid=", ", hasAPlusCapableDevice=", sbM, this.f197565g, this.f197566h);
        return hb.a.k(sbM, this.f197567i, ")");
    }

    public l(boolean z14, boolean z15, String str, boolean z16, String str2, boolean z17, boolean z18, boolean z19, boolean z24) {
        this.f197559a = z14;
        this.f197560b = z15;
        this.f197561c = str;
        this.f197562d = z16;
        this.f197563e = str2;
        this.f197564f = z17;
        this.f197565g = z18;
        this.f197566h = z19;
        this.f197567i = z24;
    }

    public l() {
        this(false, false, null, false, null, false, false, false, false, 511, null);
    }
}
