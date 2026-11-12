package dy1;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Ldy1/a;", "", "Lmx1/a;", "benchmarkType", "", "isBarbell", "<init>", "(Lmx1/a;Z)V", "gcm-training-plans_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final mx1.a f61526a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f61527b;

    public a(mx1.a aVar, boolean z14) {
        aVar.getClass();
        this.f61526a = aVar;
        this.f61527b = z14;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f61526a == aVar.f61526a && this.f61527b == aVar.f61527b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f61527b) + (this.f61526a.hashCode() * 31);
    }

    public final String toString() {
        return "BenchmarkEquipmentState(benchmarkType=" + this.f61526a + ", isBarbell=" + this.f61527b + ")";
    }
}
