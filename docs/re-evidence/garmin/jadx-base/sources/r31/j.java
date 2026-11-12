package r31;

import p005kotlin.Metadata;
import yc.l2;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001Bi\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\b\b\u0002\u0010\r\u001a\u00020\f\u0012\b\b\u0002\u0010\u000e\u001a\u00020\f¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lr31/j;", "", "", "deviceUnitId", "", "deviceName", "deviceProductNumber", "Li53/c;", "Lk31/c;", "recommendedItems", "completedItems", "ignoredItems", "", "isLoading", "isError", "<init>", "(JLjava/lang/String;Ljava/lang/String;Li53/c;Li53/c;Li53/c;ZZ)V", "gcm-onboarding_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f150028a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f150029b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f150030c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final i53.c<k31.c> f150031d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final i53.c<k31.c> f150032e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final i53.c<k31.c> f150033f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f150034g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f150035h;

    public j(long j8, String str, String str2, i53.c cVar, i53.c cVar2, i53.c cVar3, boolean z14, boolean z15, int i14, p005kotlin.jvm.internal.j jVar) {
        this((i14 & 1) != 0 ? -1L : j8, (i14 & 2) != 0 ? "" : str, (i14 & 4) != 0 ? "" : str2, (i14 & 8) != 0 ? j53.l.b() : cVar, (i14 & 16) != 0 ? j53.l.b() : cVar2, (i14 & 32) != 0 ? j53.l.b() : cVar3, (i14 & 64) != 0 ? false : z14, (i14 & 128) != 0 ? false : z15);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return this.f150028a == jVar.f150028a && p005kotlin.jvm.internal.s.g(this.f150029b, jVar.f150029b) && p005kotlin.jvm.internal.s.g(this.f150030c, jVar.f150030c) && p005kotlin.jvm.internal.s.g(this.f150031d, jVar.f150031d) && p005kotlin.jvm.internal.s.g(this.f150032e, jVar.f150032e) && p005kotlin.jvm.internal.s.g(this.f150033f, jVar.f150033f) && this.f150034g == jVar.f150034g && this.f150035h == jVar.f150035h;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f150035h) + q6.f.g(l2.a(this.f150033f, l2.a(this.f150032e, l2.a(this.f150031d, wr.g.j(wr.g.j(Long.hashCode(this.f150028a) * 31, 31, this.f150029b), 31, this.f150030c), 31), 31), 31), 31, this.f150034g);
    }

    public final String toString() {
        StringBuilder sbK = com.airbnb.lottie.animation.keyframe.a.k(this.f150028a, "DeviceSetupUiState(deviceUnitId=", ", deviceName=", this.f150029b);
        sbK.append(", deviceProductNumber=");
        sbK.append(this.f150030c);
        sbK.append(", recommendedItems=");
        sbK.append(this.f150031d);
        sbK.append(", completedItems=");
        sbK.append(this.f150032e);
        sbK.append(", ignoredItems=");
        sbK.append(this.f150033f);
        com.airbnb.lottie.animation.keyframe.a.v(", isLoading=", ", isError=", sbK, this.f150034g, this.f150035h);
        sbK.append(")");
        return sbK.toString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public j(long j8, String str, String str2, i53.c<? extends k31.c> cVar, i53.c<? extends k31.c> cVar2, i53.c<? extends k31.c> cVar3, boolean z14, boolean z15) {
        str.getClass();
        str2.getClass();
        cVar.getClass();
        cVar2.getClass();
        cVar3.getClass();
        this.f150028a = j8;
        this.f150029b = str;
        this.f150030c = str2;
        this.f150031d = cVar;
        this.f150032e = cVar2;
        this.f150033f = cVar3;
        this.f150034g = z14;
        this.f150035h = z15;
    }

    public j() {
        this(0L, null, null, null, null, null, false, false, 255, null);
    }
}
