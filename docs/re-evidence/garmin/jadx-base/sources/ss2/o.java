package ss2;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lss2/o;", "Lss2/r;", "", "sessionKey", "deviceInitializationVector", "<init>", "([B[B)V", "gfdi_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class o implements r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte[] f160827a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Logger f160828b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f160829c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f160830d;

    public o(byte[] bArr, byte[] bArr2) {
        bArr.getClass();
        bArr2.getClass();
        this.f160827a = bArr;
        rs2.d.f154380a.getClass();
        this.f160828b = LoggerFactory.getLogger(rs2.d.a("GarminAuthMessageDecryptor", -1L, this, null));
        this.f160829c = jg.b.L(0, bArr2);
    }

    @Override // ss2.r
    public final byte[] decrypt(byte[] bArr) {
        int length = bArr.length;
        Logger logger = this.f160828b;
        if (length < 2) {
            logger.error("Message decryption failed: buffer is too small");
            return null;
        }
        int iK = jg.b.K(0, bArr);
        if (iK != bArr.length) {
            logger.error("Message decryption failed: buffer is not the correct length {} != {}", Integer.valueOf(iK), Integer.valueOf(bArr.length));
            return null;
        }
        byte[] bArrB = n.b(bArr, 2, bArr.length - 2, false, this.f160827a);
        if (bArrB.length < 10) {
            logger.error("Decryption Failed: not enough bytes for header");
            return null;
        }
        long jL = jg.b.L(0, bArrB);
        if (jL < this.f160830d) {
            logger.error("Decryption Failed: packet counter < expected");
            return null;
        }
        this.f160830d = jL;
        if (jg.b.L(4, bArrB) != this.f160829c) {
            logger.error("Decryption Failed: incorrect div");
            return null;
        }
        int iK2 = jg.b.K(8, bArrB) + 8;
        if (bArrB.length >= iK2) {
            return p13.s.k(8, iK2, bArrB);
        }
        logger.error("Decryption Failed: decrypted size ({}) < expected ({})", Integer.valueOf(bArrB.length), Integer.valueOf(iK2));
        return null;
    }
}
