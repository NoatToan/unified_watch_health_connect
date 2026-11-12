package rs;

import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0004\u0012\b\b\u0002\u0010\b\u001a\u00020\u0004¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lrs/a;", "", "", "activityTypeKey", "", "minSwolf", "groundContactTime", "stepSpeedLoss", "verticalOscillation", "<init>", "(Ljava/lang/String;DDDD)V", "gcm-domain-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f154290a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final double f154291b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final double f154292c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final double f154293d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final double f154294e;

    public /* synthetic */ a(String str, double d14, double d15, double d16, double d17, int i14, p005kotlin.jvm.internal.j jVar) {
        this(str, (i14 & 2) != 0 ? Double.NaN : d14, (i14 & 4) != 0 ? Double.NaN : d15, (i14 & 8) != 0 ? Double.NaN : d16, (i14 & 16) != 0 ? Double.NaN : d17);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return s.g(this.f154290a, aVar.f154290a) && Double.compare(this.f154291b, aVar.f154291b) == 0 && Double.compare(this.f154292c, aVar.f154292c) == 0 && Double.compare(this.f154293d, aVar.f154293d) == 0 && Double.compare(this.f154294e, aVar.f154294e) == 0;
    }

    public final int hashCode() {
        return Double.hashCode(this.f154294e) + org.apache.commons.lang3.e.b(org.apache.commons.lang3.e.b(org.apache.commons.lang3.e.b(this.f154290a.hashCode() * 31, 31, this.f154291b), 31, this.f154292c), 31, this.f154293d);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("LapColumnDataModel(activityTypeKey=");
        sb3.append(this.f154290a);
        sb3.append(", minSwolf=");
        sb3.append(this.f154291b);
        am.j.x(sb3, ", groundContactTime=", this.f154292c, ", stepSpeedLoss=");
        sb3.append(this.f154293d);
        return am.j.r(sb3, ", verticalOscillation=", this.f154294e, ")");
    }

    public a(String str, double d14, double d15, double d16, double d17) {
        str.getClass();
        this.f154290a = str;
        this.f154291b = d14;
        this.f154292c = d15;
        this.f154293d = d16;
        this.f154294e = d17;
    }
}
