package to;

import com.mapbox.maps.plugin.locationcomponent.ModelSourceWrapper;
import i3.e5;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;
import r1.q2;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lto/j;", "", "", ModelSourceWrapper.POSITION, "lapNumber", "parentLapNumber", "", "isDisplayMetric", "", "activityTypeKey", "<init>", "(IIIZLjava/lang/String;)V", "gcm-domain-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f165806a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f165807b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f165808c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f165809d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f165810e;

    public /* synthetic */ j(int i14, int i15, int i16, boolean z14, String str, int i17, p005kotlin.jvm.internal.j jVar) {
        this((i17 & 1) != 0 ? 0 : i14, (i17 & 2) != 0 ? 0 : i15, (i17 & 4) != 0 ? 0 : i16, (i17 & 8) != 0 ? false : z14, str);
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getF165810e() {
        return this.f165810e;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final boolean getF165809d() {
        return this.f165809d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return this.f165806a == jVar.f165806a && this.f165807b == jVar.f165807b && this.f165808c == jVar.f165808c && this.f165809d == jVar.f165809d && s.g(this.f165810e, jVar.f165810e);
    }

    public final int hashCode() {
        return this.f165810e.hashCode() + q6.f.g(q2.d(this.f165808c, q2.d(this.f165807b, Integer.hashCode(this.f165806a) * 31, 31), 31), 31, this.f165809d);
    }

    public final String toString() {
        int i14 = this.f165806a;
        int i15 = this.f165807b;
        int i16 = this.f165808c;
        StringBuilder sbJ = e5.j(i14, i15, "StatsLapsRowDescriptor(position=", ", lapNumber=", ", parentLapNumber=");
        fb1.c.x(sbJ, i16, ", isDisplayMetric=", this.f165809d, ", activityTypeKey=");
        return am.j.o(this.f165810e, ")", sbJ);
    }

    public j(int i14, int i15, int i16, boolean z14, String str) {
        str.getClass();
        this.f165806a = i14;
        this.f165807b = i15;
        this.f165808c = i16;
        this.f165809d = z14;
        this.f165810e = str;
    }
}
