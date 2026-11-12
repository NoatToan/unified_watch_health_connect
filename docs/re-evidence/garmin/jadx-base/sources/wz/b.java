package wz;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\bB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Lwz/b;", "", "Lwz/b$a;", "bound", "", "value", "<init>", "(Lwz/b$a;D)V", "a", "gcm-charts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f188124a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final double f188125b;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lwz/b$a;", "", "<init>", "(Ljava/lang/String;I)V", "gcm-charts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public enum a {
        UPPER,
        LOWER
    }

    public b(a aVar, double d14) {
        aVar.getClass();
        this.f188124a = aVar;
        this.f188125b = d14;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f188124a == bVar.f188124a && Double.compare(this.f188125b, bVar.f188125b) == 0;
    }

    public final int hashCode() {
        return Double.hashCode(this.f188125b) + (this.f188124a.hashCode() * 31);
    }

    public final String toString() {
        return "YRangeBound(bound=" + this.f188124a + ", value=" + this.f188125b + ")";
    }
}
