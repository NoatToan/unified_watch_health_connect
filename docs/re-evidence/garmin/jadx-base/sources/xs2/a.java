package xs2;

import bs2.q4;
import com.garmin.gfdi.file.FileException;
import com.google.common.primitives.UnsignedBytes;
import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.zip.InflaterOutputStream;
import java.util.zip.ZipException;
import o13.p;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001:\u0002\b\tB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\n"}, d2 = {"Lxs2/a;", "Lxs2/b;", "Ljava/io/OutputStream;", "output", "", "finalSize", "<init>", "(Ljava/io/OutputStream;I)V", "a", "b", "gfdi_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class a implements xs2.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f192080a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Logger f192081b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f192082c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final b f192083d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public InflaterOutputStream f192084e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f192085f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f192086g;

    /* JADX INFO: renamed from: xs2.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lxs2/a$a;", "Ljava/io/IOException;", "<init>", "()V", "gfdi_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class C3581a extends IOException {
    }

    public a(OutputStream outputStream, int i14) {
        outputStream.getClass();
        this.f192080a = i14;
        rs2.d.f154380a.getClass();
        this.f192081b = LoggerFactory.getLogger(rs2.d.a("CompressedDataProcessor", -1L, this, null));
        b bVar = new b(outputStream);
        this.f192083d = bVar;
        this.f192084e = new InflaterOutputStream(bVar);
        this.f192086g = true;
    }

    @Override // xs2.b
    public final p<FileException, byte[]> a(byte[] bArr) {
        bArr.getClass();
        int length = bArr.length;
        Logger logger = this.f192081b;
        if (length == 0) {
            logger.error("Empty compressed data payload");
            return new p<>(new FileException(FileException.a.MALFORMED_GFDI_MESSAGE), new byte[]{(byte) this.f192082c, 1});
        }
        int i14 = bArr[0] & UnsignedBytes.MAX_VALUE;
        if (bArr.length < 8) {
            logger.error("Received malformed compressed data payload");
            return new p<>(new FileException(FileException.a.MALFORMED_GFDI_MESSAGE), new byte[]{(byte) i14, 1});
        }
        int i15 = this.f192082c;
        if (i14 != i15) {
            return new p<>(null, new byte[]{(byte) i14, 4, (byte) i15});
        }
        int i16 = i15 + 1;
        this.f192082c = i16;
        if (i16 > 255) {
            this.f192082c = 0;
        }
        byte b14 = bArr[1];
        long jL = jg.b.L(2, bArr);
        int iK = jg.b.K(6, bArr);
        b bVar = this.f192083d;
        bVar.f192087a = (int) jL;
        bVar.f192088b = iK;
        try {
            this.f192084e.write(bArr, 8, bArr.length - 8);
            this.f192085f = (bArr.length - 8) + this.f192085f;
            if ((b14 & 2) != 0) {
                this.f192084e.finish();
                this.f192084e = new InflaterOutputStream(bVar);
                this.f192086g = bVar.f192087a < this.f192080a;
            }
            return new p<>(null, new byte[]{(byte) i14, 0});
        } catch (ZipException e4) {
            logger.error("Failed to inflate compressed payload", (Throwable) e4);
            return new p<>(new FileException(FileException.a.COMPRESSION_ERROR, e4), new byte[]{(byte) i14, 3});
        } catch (C3581a unused) {
            logger.error("Compressed data payload has incorrect CRC");
            return new p<>(new FileException(FileException.a.CRC_MISMATCH), new byte[]{(byte) i14, 2});
        } catch (IOException e14) {
            logger.error("Failed to write data to output");
            return new p<>(new FileException(FileException.a.INTERNAL_ERROR, e14), new byte[]{(byte) i14, 1});
        }
    }

    @Override // xs2.b
    /* JADX INFO: renamed from: b, reason: from getter */
    public final boolean getF192086g() {
        return this.f192086g;
    }

    @Override // xs2.b
    /* JADX INFO: renamed from: c */
    public final int getF192131g() {
        return this.f192083d.f192089c;
    }

    @Override // xs2.b
    /* JADX INFO: renamed from: d, reason: from getter */
    public final int getF192085f() {
        return this.f192085f;
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lxs2/a$b;", "Ljava/io/FilterOutputStream;", "Ljava/io/OutputStream;", "output", "<init>", "(Ljava/io/OutputStream;)V", "gfdi_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class b extends FilterOutputStream {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f192087a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f192088b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f192089c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f192090d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(OutputStream outputStream) {
            super(outputStream);
            outputStream.getClass();
        }

        @Override // java.io.FilterOutputStream, java.io.OutputStream
        public final void write(byte[] bArr, int i14, int i15) throws IOException {
            ((FilterOutputStream) this).out.write(bArr, i14, i15);
            if (bArr != null) {
                int i16 = i15 + i14;
                while (i14 < i16) {
                    int iA = q4.a(bArr[i14], this.f192090d);
                    this.f192090d = iA;
                    int i17 = this.f192089c + 1;
                    this.f192089c = i17;
                    if (this.f192087a == i17 && iA != this.f192088b) {
                        throw new C3581a();
                    }
                    i14++;
                }
            }
        }

        @Override // java.io.FilterOutputStream, java.io.OutputStream
        public final void write(int i14) throws IOException {
            ((FilterOutputStream) this).out.write(i14);
            int iA = q4.a((byte) i14, this.f192090d);
            this.f192090d = iA;
            int i15 = this.f192089c + 1;
            this.f192089c = i15;
            if (this.f192087a == i15 && iA != this.f192088b) {
                throw new C3581a();
            }
        }

        @Override // java.io.FilterOutputStream, java.io.OutputStream
        public final void write(byte[] bArr) throws IOException {
            write(bArr, 0, bArr != null ? bArr.length : 0);
        }
    }
}
