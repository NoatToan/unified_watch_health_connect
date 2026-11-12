package en0;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Len0/c;", "", "", "value", "Len0/a;", "unit", "<init>", "(DLen0/a;)V", "gcm-hand-alignment_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final double f64689a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a f64690b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final double f64691c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final double f64692d;

    public c(double d14, a aVar) {
        aVar.getClass();
        this.f64689a = d14;
        this.f64690b = aVar;
        this.f64691c = aVar.b() * d14;
        this.f64692d = aVar.a() * d14;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return Double.compare(this.f64689a, cVar.f64689a) == 0 && this.f64690b.equals(cVar.f64690b);
    }

    public final int hashCode() {
        return this.f64690b.hashCode() + (Double.hashCode(this.f64689a) * 31);
    }

    public final String toString() {
        return "AngleValue(value=" + this.f64689a + ", unit=" + this.f64690b + ")";
    }
}
