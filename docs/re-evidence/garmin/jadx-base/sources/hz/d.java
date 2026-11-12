package hz;

import org.joda.time.DateTime;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lhz/d;", "", "Lorg/joda/time/DateTime;", "date", "", "value", "<init>", "(Lorg/joda/time/DateTime;F)V", "gcm-charts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final DateTime f86388a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f86389b;

    public d(DateTime dateTime, float f14) {
        dateTime.getClass();
        this.f86388a = dateTime;
        this.f86389b = f14;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return this.f86388a.equals(dVar.f86388a) && Float.compare(this.f86389b, dVar.f86389b) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f86389b) + (this.f86388a.hashCode() * 31);
    }

    public final String toString() {
        return "ChartDateValue(date=" + this.f86388a + ", value=" + this.f86389b + ")";
    }
}
