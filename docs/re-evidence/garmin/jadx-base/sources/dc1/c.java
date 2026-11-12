package dc1;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Ldc1/c;", "", "", "date", "", "value", "<init>", "(Ljava/lang/String;D)V", "gcm-pulseox_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f59140a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final double f59141b;

    public c(String str, double d14) {
        str.getClass();
        this.f59140a = str;
        this.f59141b = d14;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return this.f59140a.equals(cVar.f59140a) && Double.compare(this.f59141b, cVar.f59141b) == 0;
    }

    public final int hashCode() {
        return Double.hashCode(this.f59141b) + (this.f59140a.hashCode() * 31);
    }

    public final String toString() {
        return "SpO2DailyAverage(date=" + this.f59140a + ", value=" + this.f59141b + ")";
    }
}
