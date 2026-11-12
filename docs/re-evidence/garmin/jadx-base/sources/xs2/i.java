package xs2;

import bs2.q4;
import com.garmin.gfdi.file.FileException;
import java.io.IOException;
import java.io.OutputStream;
import o13.p;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u0001:\u0001\bB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Lxs2/i;", "Lxs2/b;", "Ljava/io/OutputStream;", "output", "", "finalSize", "<init>", "(Ljava/io/OutputStream;I)V", "a", "gfdi_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class i implements b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final OutputStream f192125a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f192126b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Logger f192127c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f192128d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f192129e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f192130f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f192131g;

    static {
        new a(null);
    }

    public i(OutputStream outputStream, int i14) {
        outputStream.getClass();
        this.f192125a = outputStream;
        this.f192126b = i14;
        rs2.d.f154380a.getClass();
        this.f192127c = LoggerFactory.getLogger(rs2.d.a("StandardFileDataParser", -1L, this, null));
    }

    @Override // xs2.b
    public final p<FileException, byte[]> a(byte[] bArr) throws IOException {
        int i14;
        bArr.getClass();
        int length = bArr.length;
        Logger logger = this.f192127c;
        if (length < 7) {
            logger.error("Received malformed File Data request");
            return new p<>(new FileException(FileException.a.MALFORMED_GFDI_MESSAGE), e((byte) 2));
        }
        int iK = jg.b.K(1, bArr);
        int iL = (int) jg.b.L(3, bArr);
        if (iL != this.f192131g) {
            int i15 = this.f192130f;
            if (i15 >= 3) {
                logger.debug("Too many consecutive invalid packets; aborting transfer");
                return new p<>(new FileException(FileException.a.CANCELLED_BY_APP), e((byte) 2));
            }
            if (iL == this.f192128d) {
                this.f192130f = i15 + 1;
                logger.debug("Received GFDI file data request. Duplicate packet. Retrying...");
                return new p<>(null, e((byte) 0));
            }
            logger.debug("Received GFDI file data request. Offset mismatch. Retrying...");
            this.f192130f++;
            return new p<>(null, e((byte) 4));
        }
        int length2 = bArr.length;
        int i16 = 7;
        while (true) {
            i14 = this.f192129e;
            if (i16 >= length2) {
                break;
            }
            this.f192129e = q4.a(bArr[i16], i14);
            i16++;
        }
        if (i14 != iK) {
            logger.debug("Received File Data request. CRC Mismatch");
            return new p<>(new FileException(FileException.a.CRC_MISMATCH), e((byte) 3));
        }
        int length3 = bArr.length - 7;
        this.f192125a.write(bArr, 7, length3);
        this.f192131g += length3;
        this.f192128d = iL;
        this.f192130f = 0;
        return new p<>(null, e((byte) 0));
    }

    @Override // xs2.b
    /* JADX INFO: renamed from: b */
    public final boolean getF192086g() {
        return this.f192131g < this.f192126b;
    }

    @Override // xs2.b
    /* JADX INFO: renamed from: c, reason: from getter */
    public final int getF192131g() {
        return this.f192131g;
    }

    @Override // xs2.b
    /* JADX INFO: renamed from: d */
    public final int getF192085f() {
        return this.f192131g;
    }

    public final byte[] e(byte b14) {
        byte[] bArr = new byte[5];
        bArr[0] = b14;
        jg.b.U(bArr, 1, this.f192131g);
        return bArr;
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lxs2/i$a;", "", "<init>", "()V", "", "MAX_INVALID_PACKETS", "I", "gfdi_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        private a() {
        }
    }
}
