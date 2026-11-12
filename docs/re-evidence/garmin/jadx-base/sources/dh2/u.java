package dh2;

/* JADX INFO: loaded from: classes11.dex */
public class u extends e {

    public enum a {
        SUCCESS(0),
        NO_SUCH_APPLICATION(1),
        NO_FREE_CONNECTION(2),
        CONNECTION_EXISTS(3);

        a(int i14) {
        }
    }

    public u() {
        byte[] bArr = this.f59673a;
        bArr[0] = 0;
        bArr[1] = 1;
    }

    @Override // dh2.v
    public final int c(boolean z14) {
        return 21;
    }

    @Override // dh2.e
    public final int e() {
        return 1;
    }

    public u(byte[] bArr) {
        super(bArr);
    }
}
