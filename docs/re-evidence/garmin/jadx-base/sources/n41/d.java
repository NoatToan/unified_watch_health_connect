package n41;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\bB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Ln41/d;", "", "Ln41/d$a;", "bound", "", "value", "<init>", "(Ln41/d$a;D)V", "a", "gcm-domain-wellness_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f123608a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final double f123609b;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Ln41/d$a;", "", "<init>", "(Ljava/lang/String;I)V", "gcm-domain-wellness_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public enum a {
        /* JADX INFO: Fake field, exist only in values array */
        UPPER,
        LOWER
    }

    public d(a aVar, double d14) {
        aVar.getClass();
        this.f123608a = aVar;
        this.f123609b = d14;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return this.f123608a == dVar.f123608a && Double.compare(this.f123609b, dVar.f123609b) == 0;
    }

    public final int hashCode() {
        return Double.hashCode(this.f123609b) + (this.f123608a.hashCode() * 31);
    }

    public final String toString() {
        return "YRangeBound(bound=" + this.f123608a + ", value=" + this.f123609b + ")";
    }
}
