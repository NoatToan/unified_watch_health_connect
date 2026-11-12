package nv2;

import p005kotlin.Metadata;
import wr.g;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0081\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lnv2/d;", "", "", "seconds", "Ltv2/c;", "formattedValue", "", "is24Hours", "<init>", "(JLtv2/c;Z)V", "real-time-settings_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f127973a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final tv2.c f127974b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f127975c;

    public d(long j8, tv2.c cVar, boolean z14) {
        cVar.getClass();
        this.f127973a = j8;
        this.f127974b = cVar;
        this.f127975c = z14;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return this.f127973a == dVar.f127973a && this.f127974b.equals(dVar.f127974b) && this.f127975c == dVar.f127975c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f127975c) + g.l(this.f127974b, Long.hashCode(this.f127973a) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("TODPickerOptions(seconds=");
        sb3.append(this.f127973a);
        sb3.append(", formattedValue=");
        sb3.append(this.f127974b);
        return com.airbnb.lottie.animation.keyframe.a.i(sb3, ", is24Hours=", this.f127975c, ")");
    }
}
