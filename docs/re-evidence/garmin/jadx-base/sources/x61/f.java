package x61;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u000e\b\u0087\b\u0018\u00002\u00020\u0001Bµ\u0001\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0013\u001a\u00020\u0002¢\u0006\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lx61/f;", "", "", "validData", "", "formattedDate", "feedbackPhrase", "feedbackMessage", "", "aerobicLow", "aerobicLowTargetMin", "aerobicLowTargetMax", "aerobicHigh", "aerobicHighTargetMin", "aerobicHighTargetMax", "anaerobic", "anaerobicTargetMin", "anaerobicTargetMax", "trainingStatusPauseDate", "shouldShowDeviceSelector", "<init>", "(ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/String;Z)V", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f189223a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f189224b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f189225c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f189226d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Double f189227e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Double f189228f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Double f189229g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Double f189230h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Double f189231i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Double f189232j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final Double f189233k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Double f189234l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final Double f189235m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final String f189236n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final boolean f189237o;

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ f(boolean z14, String str, String str2, String str3, Double d14, Double d15, Double d16, Double d17, Double d18, Double d19, Double d24, Double d25, Double d26, String str4, boolean z15, int i14, p005kotlin.jvm.internal.j jVar) {
        Double dValueOf = Double.valueOf(0.0d);
        this((i14 & 1) != 0 ? false : z14, (i14 & 2) != 0 ? "" : str, (i14 & 4) != 0 ? "" : str2, (i14 & 8) != 0 ? "" : str3, (i14 & 16) != 0 ? dValueOf : d14, (i14 & 32) != 0 ? dValueOf : d15, (i14 & 64) != 0 ? dValueOf : d16, (i14 & 128) != 0 ? dValueOf : d17, (i14 & 256) != 0 ? dValueOf : d18, (i14 & 512) != 0 ? dValueOf : d19, (i14 & 1024) != 0 ? dValueOf : d24, (i14 & 2048) != 0 ? dValueOf : d25, (i14 & 4096) != 0 ? dValueOf : d26, (i14 & 8192) != 0 ? null : str4, z15);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return this.f189223a == fVar.f189223a && p005kotlin.jvm.internal.s.g(this.f189224b, fVar.f189224b) && p005kotlin.jvm.internal.s.g(this.f189225c, fVar.f189225c) && p005kotlin.jvm.internal.s.g(this.f189226d, fVar.f189226d) && p005kotlin.jvm.internal.s.g(this.f189227e, fVar.f189227e) && p005kotlin.jvm.internal.s.g(this.f189228f, fVar.f189228f) && p005kotlin.jvm.internal.s.g(this.f189229g, fVar.f189229g) && p005kotlin.jvm.internal.s.g(this.f189230h, fVar.f189230h) && p005kotlin.jvm.internal.s.g(this.f189231i, fVar.f189231i) && p005kotlin.jvm.internal.s.g(this.f189232j, fVar.f189232j) && p005kotlin.jvm.internal.s.g(this.f189233k, fVar.f189233k) && p005kotlin.jvm.internal.s.g(this.f189234l, fVar.f189234l) && p005kotlin.jvm.internal.s.g(this.f189235m, fVar.f189235m) && p005kotlin.jvm.internal.s.g(this.f189236n, fVar.f189236n) && this.f189237o == fVar.f189237o;
    }

    public final int hashCode() {
        int iHashCode = Boolean.hashCode(this.f189223a) * 31;
        String str = this.f189224b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f189225c;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f189226d;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Double d14 = this.f189227e;
        int iHashCode5 = (iHashCode4 + (d14 == null ? 0 : d14.hashCode())) * 31;
        Double d15 = this.f189228f;
        int iHashCode6 = (iHashCode5 + (d15 == null ? 0 : d15.hashCode())) * 31;
        Double d16 = this.f189229g;
        int iHashCode7 = (iHashCode6 + (d16 == null ? 0 : d16.hashCode())) * 31;
        Double d17 = this.f189230h;
        int iHashCode8 = (iHashCode7 + (d17 == null ? 0 : d17.hashCode())) * 31;
        Double d18 = this.f189231i;
        int iHashCode9 = (iHashCode8 + (d18 == null ? 0 : d18.hashCode())) * 31;
        Double d19 = this.f189232j;
        int iHashCode10 = (iHashCode9 + (d19 == null ? 0 : d19.hashCode())) * 31;
        Double d24 = this.f189233k;
        int iHashCode11 = (iHashCode10 + (d24 == null ? 0 : d24.hashCode())) * 31;
        Double d25 = this.f189234l;
        int iHashCode12 = (iHashCode11 + (d25 == null ? 0 : d25.hashCode())) * 31;
        Double d26 = this.f189235m;
        int iHashCode13 = (iHashCode12 + (d26 == null ? 0 : d26.hashCode())) * 31;
        String str4 = this.f189236n;
        return Boolean.hashCode(this.f189237o) + ((iHashCode13 + (str4 != null ? str4.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("LoadFocusUiModel(validData=");
        sb3.append(this.f189223a);
        sb3.append(", formattedDate=");
        sb3.append(this.f189224b);
        sb3.append(", feedbackPhrase=");
        sn.a.t(sb3, this.f189225c, ", feedbackMessage=", this.f189226d, ", aerobicLow=");
        b71.i.p(this.f189227e, this.f189228f, ", aerobicLowTargetMin=", ", aerobicLowTargetMax=", sb3);
        b71.i.p(this.f189229g, this.f189230h, ", aerobicHigh=", ", aerobicHighTargetMin=", sb3);
        b71.i.p(this.f189231i, this.f189232j, ", aerobicHighTargetMax=", ", anaerobic=", sb3);
        b71.i.p(this.f189233k, this.f189234l, ", anaerobicTargetMin=", ", anaerobicTargetMax=", sb3);
        b71.i.u(sb3, this.f189235m, ", trainingStatusPauseDate=", this.f189236n, ", shouldShowDeviceSelector=");
        return hb.a.k(sb3, this.f189237o, ")");
    }

    public f(boolean z14, String str, String str2, String str3, Double d14, Double d15, Double d16, Double d17, Double d18, Double d19, Double d24, Double d25, Double d26, String str4, boolean z15) {
        this.f189223a = z14;
        this.f189224b = str;
        this.f189225c = str2;
        this.f189226d = str3;
        this.f189227e = d14;
        this.f189228f = d15;
        this.f189229g = d16;
        this.f189230h = d17;
        this.f189231i = d18;
        this.f189232j = d19;
        this.f189233k = d24;
        this.f189234l = d25;
        this.f189235m = d26;
        this.f189236n = str4;
        this.f189237o = z15;
    }
}
