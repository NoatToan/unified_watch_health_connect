package rf2;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lrf2/g;", "", "", "allowRemoteTerminate", "", "version", "<init>", "(ZI)V", "live-session-view"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f152478a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f152479b;

    public /* synthetic */ g(boolean z14, int i14, int i15, p005kotlin.jvm.internal.j jVar) {
        this((i15 & 1) != 0 ? false : z14, (i15 & 2) != 0 ? 0 : i14);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return this.f152478a == gVar.f152478a && this.f152479b == gVar.f152479b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f152479b) + (Boolean.hashCode(this.f152478a) * 31);
    }

    public final String toString() {
        return "LiveActivityDeviceCapabilities(allowRemoteTerminate=" + this.f152478a + ", version=" + this.f152479b + ")";
    }

    public g(boolean z14, int i14) {
        this.f152478a = z14;
        this.f152479b = i14;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public g() {
        this(false, 0 == true ? 1 : 0, 3, null);
    }
}
