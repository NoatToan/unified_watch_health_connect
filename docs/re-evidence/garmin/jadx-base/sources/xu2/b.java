package xu2;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lxu2/b;", "", "", "isCharging", "", "stateOfChange", "<init>", "(ZI)V", "real-time-settings_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f192254a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f192255b;

    public b(boolean z14, int i14) {
        this.f192254a = z14;
        this.f192255b = i14;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f192254a == bVar.f192254a && this.f192255b == bVar.f192255b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f192255b) + (Boolean.hashCode(this.f192254a) * 31);
    }

    public final String toString() {
        return "BatteryStatusOptions(isCharging=" + this.f192254a + ", stateOfChange=" + this.f192255b + ")";
    }
}
