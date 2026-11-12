package gj0;

import i3.e5;
import p005kotlin.Metadata;
import wr.g;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lgj0/c;", "", "", "x", "", "formattedValue", "formattedValueContentDescription", "formattedDate", "<init>", "(FLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "gcm-functional-threshold-power_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f77492a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f77493b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f77494c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f77495d;

    public c(float f14, String str, String str2, String str3) {
        com.airbnb.lottie.animation.keyframe.a.y(str, str2, str3);
        this.f77492a = f14;
        this.f77493b = str;
        this.f77494c = str2;
        this.f77495d = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return Float.compare(this.f77492a, cVar.f77492a) == 0 && this.f77493b.equals(cVar.f77493b) && this.f77494c.equals(cVar.f77494c) && this.f77495d.equals(cVar.f77495d);
    }

    public final int hashCode() {
        return this.f77495d.hashCode() + g.j(g.j(Float.hashCode(this.f77492a) * 31, 31, this.f77493b), 31, this.f77494c);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("FtpReportChartHoverEntry(x=");
        sb3.append(this.f77492a);
        sb3.append(", formattedValue=");
        sb3.append(this.f77493b);
        sb3.append(", formattedValueContentDescription=");
        return e5.h(sb3, this.f77494c, ", formattedDate=", this.f77495d, ")");
    }
}
