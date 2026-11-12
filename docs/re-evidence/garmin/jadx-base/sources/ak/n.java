package ak;

/* JADX INFO: loaded from: classes7.dex */
public class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f3570a;

    public n(byte[] bArr, int i14) {
        this.f3570a = (int) k.e(i14, 2, bArr);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && (obj instanceof n) && ((n) obj).f3570a == this.f3570a;
    }

    public final int hashCode() {
        return 217 + this.f3570a;
    }

    public final String toString() {
        return "Timestamp: Rx=" + this.f3570a;
    }

    public n(int i14) {
        this.f3570a = i14;
    }
}
