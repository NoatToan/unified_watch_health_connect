package dh2;

/* JADX INFO: loaded from: classes11.dex */
public class f extends l {

    public enum a {
        FIRST_PACKET(0),
        DATA_TRANSMISSION(1),
        LAST_PACKET(2),
        ACK_REQUEST_RESPONSE(3),
        CAPABILITIES(4),
        ENCRYPTION_KEY(5);


        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f59649a;

        a(int i14) {
            this.f59649a = i14;
        }
    }

    public enum b {
        SUCCESS(0),
        RESEND_FROM_SEQ(1),
        CRC_MISMATCH(2),
        TRANSFER_NOT_STARTED(3),
        INVALID_CONNECTION_ID(4),
        OUT_OF_MEMORY(5);


        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f59657a;

        b(int i14) {
            this.f59657a = i14;
        }
    }

    public f(b bVar) {
        super(false);
        i(15);
        byte[] bArr = this.f59673a;
        bArr[1] = (byte) 2;
        bArr[3] = (byte) bVar.f59657a;
    }

    @Override // dh2.v
    public final int c(boolean z14) {
        return 5;
    }

    public final a j() {
        byte b14 = this.f59673a[2];
        if (b14 == 1) {
            return a.DATA_TRANSMISSION;
        }
        if (b14 == 2) {
            return a.LAST_PACKET;
        }
        if (b14 == 3) {
            return a.ACK_REQUEST_RESPONSE;
        }
        if (b14 != 4) {
            return b14 != 5 ? a.FIRST_PACKET : a.ENCRYPTION_KEY;
        }
        return a.CAPABILITIES;
    }

    public final b k() {
        byte b14 = this.f59673a[3];
        if (b14 == 1) {
            return b.RESEND_FROM_SEQ;
        }
        if (b14 == 2) {
            return b.CRC_MISMATCH;
        }
        if (b14 == 3) {
            return b.TRANSFER_NOT_STARTED;
        }
        if (b14 != 4) {
            return b14 != 5 ? b.SUCCESS : b.OUT_OF_MEMORY;
        }
        return b.INVALID_CONNECTION_ID;
    }

    public f(byte[] bArr) {
        super(bArr);
    }
}
