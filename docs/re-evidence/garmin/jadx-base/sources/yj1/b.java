package yj1;

import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B[\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0002\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\u0002\u0012\b\b\u0002\u0010\n\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lyj1/b;", "", "", "hasAssistance", "hasFallDetection", "hasRealTimeSettings", "hasEmergencyCalling", "", "emergencyCallingInfo", "hasAssistancePlus", "isAssistancePlusEnabled", "assistancePlusNotes", "<init>", "(ZZZZLjava/lang/String;ZZLjava/lang/String;)V", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f197518a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f197519b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f197520c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f197521d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f197522e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f197523f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f197524g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f197525h;

    public /* synthetic */ b(boolean z14, boolean z15, boolean z16, boolean z17, String str, boolean z18, boolean z19, String str2, int i14, p005kotlin.jvm.internal.j jVar) {
        this((i14 & 1) != 0 ? false : z14, (i14 & 2) != 0 ? false : z15, (i14 & 4) != 0 ? false : z16, (i14 & 8) != 0 ? false : z17, (i14 & 16) != 0 ? null : str, (i14 & 32) != 0 ? false : z18, (i14 & 64) != 0 ? false : z19, (i14 & 128) != 0 ? null : str2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f197518a == bVar.f197518a && this.f197519b == bVar.f197519b && this.f197520c == bVar.f197520c && this.f197521d == bVar.f197521d && s.g(this.f197522e, bVar.f197522e) && this.f197523f == bVar.f197523f && this.f197524g == bVar.f197524g && s.g(this.f197525h, bVar.f197525h);
    }

    public final int hashCode() {
        int iG = q6.f.g(q6.f.g(q6.f.g(Boolean.hashCode(this.f197518a) * 31, 31, this.f197519b), 31, this.f197520c), 31, this.f197521d);
        String str = this.f197522e;
        int iG2 = q6.f.g(q6.f.g((iG + (str == null ? 0 : str.hashCode())) * 31, 31, this.f197523f), 31, this.f197524g);
        String str2 = this.f197525h;
        return iG2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbM = com.airbnb.lottie.animation.keyframe.a.m("DeviceFeaturesUiState(hasAssistance=", ", hasFallDetection=", ", hasRealTimeSettings=", this.f197518a, this.f197519b);
        kg.f.q(", hasEmergencyCalling=", ", emergencyCallingInfo=", sbM, this.f197520c, this.f197521d);
        v.h.C(this.f197522e, ", hasAssistancePlus=", ", isAssistancePlusEnabled=", sbM, this.f197523f);
        sbM.append(this.f197524g);
        sbM.append(", assistancePlusNotes=");
        sbM.append(this.f197525h);
        sbM.append(")");
        return sbM.toString();
    }

    public b(boolean z14, boolean z15, boolean z16, boolean z17, String str, boolean z18, boolean z19, String str2) {
        this.f197518a = z14;
        this.f197519b = z15;
        this.f197520c = z16;
        this.f197521d = z17;
        this.f197522e = str;
        this.f197523f = z18;
        this.f197524g = z19;
        this.f197525h = str2;
    }

    public b() {
        this(false, false, false, false, null, false, false, null, 255, null);
    }
}
