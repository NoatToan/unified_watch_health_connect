package nk2;

import androidx.room.a0;
import com.garmin.device.filetransfer.FileTransferException;
import com.garmin.device.filetransfer.TransferStatusException;
import com.garmin.proto.generated.GDIFileAccess;
import ds.e0;
import java.io.ByteArrayOutputStream;
import java.io.OutputStream;
import java.util.zip.Inflater;
import java.util.zip.InflaterOutputStream;
import java.util.zip.ZipException;
import n61.h;
import o13.m;
import o13.t;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p13.s;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001:\u0002\u0007\bB\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\t"}, d2 = {"Lnk2/b;", "Ldz2/a;", "dataSink", "", "bufferSize", "<init>", "(Ldz2/a;I)V", "a", "b", "file-transfer-device_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class b implements dz2.a {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final Logger f126460g;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final dz2.a f126461b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Inflater f126462c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final InflaterOutputStream f126463d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final t f126464e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f126465f;

    static {
        new a(null);
        Logger logger = LoggerFactory.getLogger("FT#InflaterDataSink");
        logger.getClass();
        f126460g = logger;
    }

    public b(dz2.a aVar, int i14) {
        aVar.getClass();
        this.f126461b = aVar;
        C2432b c2432b = new C2432b();
        Inflater inflater = new Inflater();
        this.f126462c = inflater;
        this.f126463d = new InflaterOutputStream(c2432b, inflater, i14);
        this.f126464e = m.b(new h(23));
    }

    public final void c() {
        if (d().size() > 0) {
            byte[] byteArray = d().toByteArray();
            byteArray.getClass();
            e(byteArray, false);
        }
        try {
            this.f126463d.finish();
        } catch (Exception unused) {
        }
        try {
            this.f126462c.end();
        } catch (Exception unused2) {
        }
    }

    @Override // dz2.a
    public final void close() {
        this.f126461b.close();
    }

    public final ByteArrayOutputStream d() {
        return (ByteArrayOutputStream) this.f126464e.getValue();
    }

    public final void e(byte[] bArr, boolean z14) throws FileTransferException {
        InflaterOutputStream inflaterOutputStream = this.f126463d;
        if (z14) {
            try {
                if (bArr.length < 65536) {
                    if (d().size() > 65536) {
                        byte[] byteArray = d().toByteArray();
                        byteArray.getClass();
                        e(byteArray, false);
                        d().reset();
                    }
                    d().write(bArr);
                    return;
                }
            } catch (Exception e4) {
                int length = bArr.length;
                long size = this.f126461b.getSize();
                long j8 = this.f126465f;
                StringBuilder sbK = e0.k(size, "uncompTotal:", ", compTotal:");
                sbK.append(j8);
                sbK.append(", incoming:");
                sbK.append(length);
                String string = sbK.toString();
                String message = e4.getMessage();
                StringBuilder sbI = p6.b.i("Failed to decompress", "", StringUtils.SPACE, string, StringUtils.SPACE);
                sbI.append(z14);
                sbI.append(": ");
                sbI.append(message);
                f126460g.error(sbI.toString());
                if (!(e4 instanceof ZipException)) {
                    throw new FileTransferException(a0.j("Failed to decompress", "", ": ", e4.getMessage()), e4);
                }
                TransferStatusException.INSTANCE.getClass();
                throw new TransferStatusException(GDIFileAccess.TransferStatusRequest.FailureReason.COMPRESSION_FAILED, a0.j("Failed to decompress", "", ": ", e4.getMessage()), (ZipException) e4);
            }
        }
        inflaterOutputStream.write(bArr);
        this.f126465f += (long) bArr.length;
        inflaterOutputStream.flush();
    }

    @Override // dz2.a
    public final long getSize() {
        return this.f126461b.getSize();
    }

    @Override // dz2.a
    public final void write(byte[] bArr) throws FileTransferException {
        bArr.getClass();
        e(bArr, true);
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lnk2/b$a;", "", "<init>", "()V", "", "DEFAULT_BUFFER_SIZE", "I", "PACKET_BUFFER_SIZE", "Lorg/slf4j/Logger;", "LOGGER", "Lorg/slf4j/Logger;", "file-transfer-device_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        private a() {
        }
    }

    /* JADX INFO: renamed from: nk2.b$b, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lnk2/b$b;", "Ljava/io/OutputStream;", "<init>", "(Lnk2/b;)V", "file-transfer-device_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public final class C2432b extends OutputStream {
        public C2432b() {
        }

        @Override // java.io.OutputStream
        public final void write(byte[] bArr, int i14, int i15) {
            if (bArr != null) {
                b bVar = b.this;
                if (i14 == 0 && i15 == bArr.length) {
                    bVar.f126461b.write(bArr);
                } else if (i14 < bArr.length) {
                    bVar.f126461b.write(s.k(i14, Math.min(i15 + i14, bArr.length), bArr));
                }
            }
        }

        @Override // java.io.OutputStream
        public final void write(int i14) {
            b.this.f126461b.write(new byte[]{(byte) i14});
        }

        @Override // java.io.OutputStream
        public final void write(byte[] bArr) {
            if (bArr != null) {
                b.this.f126461b.write(bArr);
            }
        }
    }

    public /* synthetic */ b(dz2.a aVar, int i14, int i15, j jVar) {
        this(aVar, (i15 & 2) != 0 ? 131072 : i14);
    }
}
