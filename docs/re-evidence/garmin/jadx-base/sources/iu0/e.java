package iu0;

import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u0083\u0001\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\b\u0002\u0010\n\u001a\u00020\u0002\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0002¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Liu0/e;", "", "", "isCumulativeTimeON", "isPaceOrSpeedON", "isLastLapTimeON", "Lju0/c;", "triggerSelected", "", "lapValue", "isEstCompletionTimeON", "", "estimatedCompletionTime", "isLiveTrackOn", "hasLiveTrackSupport", "hasLTESupport", "isCyclingSupported", "isEdgeDevice", "<init>", "(ZZZLju0/c;Ljava/lang/Integer;ZDLjava/lang/Boolean;ZZZZ)V", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f95021a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f95022b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f95023c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ju0.c f95024d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Integer f95025e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f95026f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final double f95027g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Boolean f95028h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final boolean f95029i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final boolean f95030j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final boolean f95031k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final boolean f95032l;

    public /* synthetic */ e(boolean z14, boolean z15, boolean z16, ju0.c cVar, Integer num, boolean z17, double d14, Boolean bool, boolean z18, boolean z19, boolean z24, boolean z25, int i14, j jVar) {
        this((i14 & 1) != 0 ? false : z14, (i14 & 2) != 0 ? false : z15, (i14 & 4) != 0 ? false : z16, (i14 & 8) != 0 ? ju0.c.EVERY_LAP : cVar, (i14 & 16) != 0 ? null : num, (i14 & 32) != 0 ? false : z17, (i14 & 64) != 0 ? Double.NaN : d14, (i14 & 128) == 0 ? bool : null, (i14 & 256) != 0 ? false : z18, (i14 & 512) != 0 ? false : z19, (i14 & 1024) != 0 ? false : z24, (i14 & 2048) != 0 ? false : z25);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return this.f95021a == eVar.f95021a && this.f95022b == eVar.f95022b && this.f95023c == eVar.f95023c && this.f95024d == eVar.f95024d && s.g(this.f95025e, eVar.f95025e) && this.f95026f == eVar.f95026f && Double.compare(this.f95027g, eVar.f95027g) == 0 && s.g(this.f95028h, eVar.f95028h) && this.f95029i == eVar.f95029i && this.f95030j == eVar.f95030j && this.f95031k == eVar.f95031k && this.f95032l == eVar.f95032l;
    }

    public final int hashCode() {
        int iHashCode = (this.f95024d.hashCode() + q6.f.g(q6.f.g(Boolean.hashCode(this.f95021a) * 31, 31, this.f95022b), 31, this.f95023c)) * 31;
        Integer num = this.f95025e;
        int iB = org.apache.commons.lang3.e.b(q6.f.g((iHashCode + (num == null ? 0 : num.hashCode())) * 31, 31, this.f95026f), 31, this.f95027g);
        Boolean bool = this.f95028h;
        return Boolean.hashCode(this.f95032l) + q6.f.g(q6.f.g(q6.f.g((iB + (bool != null ? bool.hashCode() : 0)) * 31, 31, this.f95029i), 31, this.f95030j), 31, this.f95031k);
    }

    public final String toString() {
        StringBuilder sbM = com.airbnb.lottie.animation.keyframe.a.m("MessageContentUIModel(isCumulativeTimeON=", ", isPaceOrSpeedON=", ", isLastLapTimeON=", this.f95021a, this.f95022b);
        sbM.append(this.f95023c);
        sbM.append(", triggerSelected=");
        sbM.append(this.f95024d);
        sbM.append(", lapValue=");
        sbM.append(this.f95025e);
        sbM.append(", isEstCompletionTimeON=");
        sbM.append(this.f95026f);
        sbM.append(", estimatedCompletionTime=");
        sbM.append(this.f95027g);
        sbM.append(", isLiveTrackOn=");
        sbM.append(this.f95028h);
        com.airbnb.lottie.animation.keyframe.a.v(", hasLiveTrackSupport=", ", hasLTESupport=", sbM, this.f95029i, this.f95030j);
        com.airbnb.lottie.animation.keyframe.a.v(", isCyclingSupported=", ", isEdgeDevice=", sbM, this.f95031k, this.f95032l);
        sbM.append(")");
        return sbM.toString();
    }

    public e(boolean z14, boolean z15, boolean z16, ju0.c cVar, Integer num, boolean z17, double d14, Boolean bool, boolean z18, boolean z19, boolean z24, boolean z25) {
        cVar.getClass();
        this.f95021a = z14;
        this.f95022b = z15;
        this.f95023c = z16;
        this.f95024d = cVar;
        this.f95025e = num;
        this.f95026f = z17;
        this.f95027g = d14;
        this.f95028h = bool;
        this.f95029i = z18;
        this.f95030j = z19;
        this.f95031k = z24;
        this.f95032l = z25;
    }

    public e() {
        this(false, false, false, null, null, false, 0.0d, null, false, false, false, false, 4095, null);
    }
}
