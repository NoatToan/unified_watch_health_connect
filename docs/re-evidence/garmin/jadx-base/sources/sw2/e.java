package sw2;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lsw2/e;", "", "", "compositionId", "Lrw2/e;", "version", "<init>", "(ILrw2/e;)V", "real-time-settings_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f161114a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final rw2.e f161115b;

    public e(int i14, rw2.e eVar) {
        eVar.getClass();
        this.f161114a = i14;
        this.f161115b = eVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!e.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        obj.getClass();
        e eVar = (e) obj;
        return this.f161114a == eVar.f161114a && this.f161115b.equals(eVar.f161115b);
    }

    public final int hashCode() {
        return this.f161115b.hashCode() + (this.f161114a * 31);
    }

    public final String toString() {
        return "RTSUiKey(compositionId=" + this.f161114a + ", version=" + this.f161115b + ")";
    }
}
