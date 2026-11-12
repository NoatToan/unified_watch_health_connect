package qm1;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lqm1/n;", "", "Lrl1/k;", "sleepLevel", "", "sleepIntervalLength", "<init>", "(Lrl1/k;F)V", "gcm-sleep_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final rl1.k f145636a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f145637b;

    public n(rl1.k kVar, float f14) {
        kVar.getClass();
        this.f145636a = kVar;
        this.f145637b = f14;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        return this.f145636a == nVar.f145636a && Float.compare(this.f145637b, nVar.f145637b) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f145637b) + (this.f145636a.hashCode() * 31);
    }

    public final String toString() {
        return "SleepLevelChartData(sleepLevel=" + this.f145636a + ", sleepIntervalLength=" + this.f145637b + ")";
    }
}
