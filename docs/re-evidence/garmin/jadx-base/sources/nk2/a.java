package nk2;

import ds.e0;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Arrays;
import nz2.e;
import nz2.f;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lnk2/a;", "Ldz2/b;", "original", "", "windowBits", "bufferSize", "<init>", "(Ldz2/b;II)V", "file-transfer-device_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class a implements dz2.b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final dz2.b f126449b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Logger f126450c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final byte[] f126451d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ByteArrayOutputStream f126452e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final f f126453f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public byte[] f126454g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f126455h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public long f126456i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f126457j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public long f126458k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final long f126459l;

    public a(dz2.b bVar, int i14, int i15) {
        bVar.getClass();
        this.f126449b = bVar;
        this.f126450c = LoggerFactory.getLogger("FT#DeflaterDataSource");
        this.f126451d = new byte[i15];
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        this.f126452e = byteArrayOutputStream;
        f fVar = new f(byteArrayOutputStream, new e(-1, i14));
        fVar.f128421d = true;
        this.f126453f = fVar;
        this.f126459l = bVar.getF126459l();
    }

    @Override // dz2.b
    public final int b(int i14, int i15, byte[] bArr) throws IOException {
        bArr.getClass();
        long j8 = this.f126456i;
        long j14 = this.f126459l;
        if (j8 >= j14) {
            return 0;
        }
        int iF = f(i14, i15, bArr);
        if (iF >= i15 || this.f126456i >= j14) {
            return iF;
        }
        byte[] bArr2 = this.f126451d;
        int length = bArr2.length;
        dz2.b bVar = this.f126449b;
        int iB = bVar.b(0, length, bArr2);
        this.f126457j = iB;
        long j15 = this.f126456i;
        long j16 = ((long) iB) + j15;
        long f126459l = bVar.getF126459l();
        StringBuilder sbK = e0.k(j15, "Compressing bytes ", "-");
        sbK.append(j16);
        sbK.append(" out of ");
        sbK.append(f126459l);
        String string = sbK.toString();
        Logger logger = this.f126450c;
        logger.debug(string);
        int i16 = this.f126457j;
        f fVar = this.f126453f;
        fVar.write(bArr2, 0, i16);
        fVar.flush();
        if (this.f126456i + ((long) this.f126457j) == j14) {
            logger.debug("End of uncompressed file. Finishing deflater");
            while (!fVar.f128418a.f128417k) {
                fVar.a(4);
            }
        }
        return f(i14 + iF, i15 - iF, bArr) + iF;
    }

    @Override // dz2.b
    public final void close() throws IOException {
        this.f126449b.close();
        this.f126453f.close();
        this.f126452e.close();
    }

    @Override // dz2.b
    public final boolean d() {
        if (this.f126449b.d()) {
            return true;
        }
        byte[] bArr = this.f126454g;
        return (bArr != null ? bArr.length : Integer.MIN_VALUE) > this.f126455h;
    }

    @Override // dz2.b
    public final byte[] e(int i14) throws IOException {
        long j8 = this.f126456i;
        long j14 = this.f126459l;
        if (j8 >= j14) {
            return new byte[0];
        }
        int iMin = Math.min(i14, (int) (j14 - j8));
        byte[] bArr = new byte[iMin];
        int iB = b(0, iMin, bArr);
        return iB < iMin ? Arrays.copyOf(bArr, iB) : bArr;
    }

    public final int f(int i14, int i15, byte[] bArr) {
        byte[] bArr2 = this.f126454g;
        ByteArrayOutputStream byteArrayOutputStream = this.f126452e;
        if (bArr2 == null && byteArrayOutputStream.size() == 0) {
            return 0;
        }
        byte[] bArr3 = this.f126454g;
        if ((bArr3 != null ? bArr3.length : Integer.MIN_VALUE) <= this.f126455h) {
            this.f126454g = byteArrayOutputStream.toByteArray();
            this.f126455h = 0;
        }
        byte[] bArr4 = this.f126454g;
        bArr4.getClass();
        int iMin = Math.min(bArr4.length - this.f126455h, i15);
        byte[] bArr5 = this.f126454g;
        bArr5.getClass();
        System.arraycopy(bArr5, this.f126455h, bArr, i14, iMin);
        this.f126458k += (long) iMin;
        this.f126455h += iMin;
        byteArrayOutputStream.reset();
        int i16 = this.f126455h;
        byte[] bArr6 = this.f126454g;
        bArr6.getClass();
        if (i16 >= bArr6.length) {
            this.f126454g = null;
            this.f126456i += (long) this.f126457j;
            this.f126457j = 0;
            return iMin;
        }
        byte[] bArr7 = this.f126454g;
        if (bArr7 != null) {
            int i17 = this.f126455h;
            byteArrayOutputStream.write(bArr7, i17, bArr7.length - i17);
        }
        return iMin;
    }

    @Override // dz2.b
    /* JADX INFO: renamed from: getSize, reason: from getter */
    public final long getF126459l() {
        return this.f126459l;
    }

    @Override // dz2.b
    public final void setPosition(long j8) {
        this.f126456i = j8;
        this.f126457j = 0;
        this.f126454g = null;
        this.f126455h = 0;
        this.f126452e.reset();
        this.f126449b.setPosition(j8);
    }

    public /* synthetic */ a(dz2.b bVar, int i14, int i15, int i16, j jVar) {
        this(bVar, i14, (i16 & 4) != 0 ? 32768 : i15);
    }
}
