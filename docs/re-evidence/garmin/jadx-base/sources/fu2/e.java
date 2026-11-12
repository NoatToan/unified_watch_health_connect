package fu2;

import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lfu2/e;", "", "", "value", "", "unit", "<init>", "(Ljava/lang/Double;Ljava/lang/String;)V", "weather_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Double f73578a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f73579b;

    public e(Double d14, String str) {
        this.f73578a = d14;
        this.f73579b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return s.g(this.f73578a, eVar.f73578a) && s.g(this.f73579b, eVar.f73579b);
    }

    public final int hashCode() {
        Double d14 = this.f73578a;
        int iHashCode = (d14 == null ? 0 : d14.hashCode()) * 31;
        String str = this.f73579b;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        return this.f73579b + ": " + this.f73578a;
    }
}
