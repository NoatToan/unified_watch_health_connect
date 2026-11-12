package ak;

/* JADX INFO: loaded from: classes7.dex */
public class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f3563a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f3564b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f3565c;

    public enum a {
        DBM(32),
        UNKNOWN(Integer.MIN_VALUE);


        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f3569a;

        a(int i14) {
            this.f3569a = i14;
        }
    }

    public m(byte[] bArr, int i14) {
        this.f3563a = (int) k.e(i14, 1, bArr);
        this.f3564b = bArr[i14 + 1];
        this.f3565c = bArr[i14 + 2];
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        return mVar.f3563a == this.f3563a && mVar.f3564b == this.f3564b && mVar.f3565c == this.f3565c;
    }

    public final int hashCode() {
        return ((((217 + this.f3563a) * 31) + this.f3564b) * 31) + this.f3565c;
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("RSSI: Value=");
        sb3.append(this.f3564b);
        a aVar = a.DBM;
        if (this.f3563a != aVar.f3569a) {
            aVar = a.UNKNOWN;
        }
        sb3.append(aVar);
        sb3.append(", Threshold Config=");
        return am.j.q(sb3, this.f3565c, "dB");
    }

    public m(int i14, int i15, int i16) {
        this.f3563a = i14;
        this.f3564b = i15;
        this.f3565c = i16;
    }
}
