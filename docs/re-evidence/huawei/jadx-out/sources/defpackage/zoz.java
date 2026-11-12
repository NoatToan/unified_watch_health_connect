package defpackage;

import androidx.media3.muxer.Mp4Utils;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.charset.Charset;
import java.util.Iterator;
import java.util.List;
import net.lingala.zip4j.exception.ZipException;
import net.lingala.zip4j.headers.HeaderSignature;
import net.lingala.zip4j.io.outputstream.OutputStreamWithSplitZipSupport;

/* JADX INFO: loaded from: classes20.dex */
public class zoz {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final zqn f54418b = new zqn();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final byte[] f54419c = new byte[8];

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final byte[] f54417a = new byte[4];

    public void a(zqh zqhVar, zpz zpzVar, OutputStream outputStream, Charset charset) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            this.f54418b.d(byteArrayOutputStream, (int) zpzVar.getSignature().getValue());
            this.f54418b.e(byteArrayOutputStream, zpzVar.getVersionNeededToExtract());
            byteArrayOutputStream.write(zpzVar.getGeneralPurposeFlag());
            this.f54418b.e(byteArrayOutputStream, zpzVar.getCompressionMethod().getCode());
            this.f54418b.d(this.f54419c, 0, zpzVar.getLastModifiedTime());
            byteArrayOutputStream.write(this.f54419c, 0, 4);
            this.f54418b.d(this.f54419c, 0, zpzVar.getCrc());
            byteArrayOutputStream.write(this.f54419c, 0, 4);
            boolean z = zpzVar.getCompressedSize() >= Mp4Utils.UNSIGNED_INT_MAX_VALUE || zpzVar.getUncompressedSize() >= Mp4Utils.UNSIGNED_INT_MAX_VALUE;
            if (z) {
                this.f54418b.d(this.f54419c, 0, Mp4Utils.UNSIGNED_INT_MAX_VALUE);
                byteArrayOutputStream.write(this.f54419c, 0, 4);
                byteArrayOutputStream.write(this.f54419c, 0, 4);
                zqhVar.c(true);
                zpzVar.d(true);
            } else {
                this.f54418b.d(this.f54419c, 0, zpzVar.getCompressedSize());
                byteArrayOutputStream.write(this.f54419c, 0, 4);
                this.f54418b.d(this.f54419c, 0, zpzVar.getUncompressedSize());
                byteArrayOutputStream.write(this.f54419c, 0, 4);
                zpzVar.d(false);
            }
            byte[] bArrA = new byte[0];
            if (zqp.c(zpzVar.getFileName())) {
                bArrA = zoy.a(zpzVar.getFileName(), charset);
            }
            this.f54418b.e(byteArrayOutputStream, bArrA.length);
            int i = z ? 20 : 0;
            if (zpzVar.getAesExtraDataRecord() != null) {
                i += 11;
            }
            this.f54418b.e(byteArrayOutputStream, i);
            if (bArrA.length > 0) {
                byteArrayOutputStream.write(bArrA);
            }
            if (z) {
                this.f54418b.e(byteArrayOutputStream, (int) HeaderSignature.ZIP64_EXTRA_FIELD_SIGNATURE.getValue());
                this.f54418b.e(byteArrayOutputStream, 16);
                this.f54418b.c(byteArrayOutputStream, zpzVar.getUncompressedSize());
                this.f54418b.c(byteArrayOutputStream, zpzVar.getCompressedSize());
            }
            if (zpzVar.getAesExtraDataRecord() != null) {
                zpp aesExtraDataRecord = zpzVar.getAesExtraDataRecord();
                this.f54418b.e(byteArrayOutputStream, (int) aesExtraDataRecord.getSignature().getValue());
                this.f54418b.e(byteArrayOutputStream, aesExtraDataRecord.d());
                this.f54418b.e(byteArrayOutputStream, aesExtraDataRecord.e().getVersionNumber());
                byteArrayOutputStream.write(zoy.a(aesExtraDataRecord.b(), charset));
                byteArrayOutputStream.write(new byte[]{(byte) aesExtraDataRecord.a().getRawCode()});
                this.f54418b.e(byteArrayOutputStream, aesExtraDataRecord.c().getCode());
            }
            outputStream.write(byteArrayOutputStream.toByteArray());
            byteArrayOutputStream.close();
        } catch (Throwable th) {
            try {
                byteArrayOutputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public void d(zpz zpzVar, OutputStream outputStream) throws IOException {
        if (zpzVar == null || outputStream == null) {
            throw new ZipException("input parameters is null, cannot write extended local header");
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            this.f54418b.d(byteArrayOutputStream, (int) HeaderSignature.EXTRA_DATA_RECORD.getValue());
            this.f54418b.d(this.f54419c, 0, zpzVar.getCrc());
            byteArrayOutputStream.write(this.f54419c, 0, 4);
            if (zpzVar.e()) {
                this.f54418b.c(byteArrayOutputStream, zpzVar.getCompressedSize());
                this.f54418b.c(byteArrayOutputStream, zpzVar.getUncompressedSize());
            } else {
                this.f54418b.d(this.f54419c, 0, zpzVar.getCompressedSize());
                byteArrayOutputStream.write(this.f54419c, 0, 4);
                this.f54418b.d(this.f54419c, 0, zpzVar.getUncompressedSize());
                byteArrayOutputStream.write(this.f54419c, 0, 4);
            }
            outputStream.write(byteArrayOutputStream.toByteArray());
            byteArrayOutputStream.close();
        } catch (Throwable th) {
            try {
                byteArrayOutputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public void b(zqh zqhVar, OutputStream outputStream, Charset charset) throws IOException {
        if (zqhVar == null || outputStream == null) {
            throw new ZipException("input parameters is null, cannot finalize zip file");
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            a(zqhVar, outputStream);
            long jE = e(zqhVar);
            d(zqhVar, byteArrayOutputStream, this.f54418b, charset);
            int size = byteArrayOutputStream.size();
            if (zqhVar.h() || jE >= Mp4Utils.UNSIGNED_INT_MAX_VALUE || zqhVar.c().b().size() >= 65535) {
                if (zqhVar.g() == null) {
                    zqhVar.c(new zqb());
                }
                if (zqhVar.a() == null) {
                    zqhVar.d(new zqd());
                }
                zqhVar.a().e(((long) size) + jE);
                if (c(outputStream)) {
                    int iD = d(outputStream);
                    zqhVar.a().c(iD);
                    zqhVar.a().a(iD + 1);
                } else {
                    zqhVar.a().c(0);
                    zqhVar.a().a(1);
                }
                zqb zqbVarC = c(zqhVar, size, jE);
                zqhVar.c(zqbVarC);
                b(zqbVarC, byteArrayOutputStream, this.f54418b);
                b(zqhVar.a(), byteArrayOutputStream, this.f54418b);
            }
            e(zqhVar, size, jE, byteArrayOutputStream, this.f54418b, charset);
            e(zqhVar, outputStream, byteArrayOutputStream.toByteArray(), charset);
            byteArrayOutputStream.close();
        } catch (Throwable th) {
            try {
                byteArrayOutputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public void a(zpy zpyVar, zqh zqhVar, zpl zplVar) throws IOException {
        zpl zplVar2;
        boolean z;
        String str;
        String str2;
        if (zpyVar == null || zqhVar == null) {
            throw new ZipException("invalid input parameters, cannot update local file header");
        }
        if (zpyVar.e() != zplVar.getCurrentSplitFileCounter()) {
            String parent = zqhVar.f().getParent();
            String strC = zqk.c(zqhVar.f().getName());
            if (parent == null) {
                str = "";
            } else {
                str = parent + System.getProperty("file.separator");
            }
            z = true;
            if (zpyVar.e() < 9) {
                str2 = str + strC + ".z0" + (zpyVar.e() + 1);
            } else {
                str2 = str + strC + ".z" + (zpyVar.e() + 1);
            }
            zplVar2 = new zpl(new File(str2));
        } else {
            zplVar2 = zplVar;
            z = false;
        }
        long filePointer = zplVar2.getFilePointer();
        zplVar2.a(zpyVar.a() + 14);
        this.f54418b.d(this.f54419c, 0, zpyVar.getCrc());
        zplVar2.write(this.f54419c, 0, 4);
        b(zplVar2, zpyVar);
        if (z) {
            zplVar2.close();
        } else {
            zplVar.a(filePointer);
        }
    }

    private void b(zpl zplVar, zpy zpyVar) throws IOException {
        if (zpyVar.getUncompressedSize() >= Mp4Utils.UNSIGNED_INT_MAX_VALUE) {
            this.f54418b.d(this.f54419c, 0, Mp4Utils.UNSIGNED_INT_MAX_VALUE);
            zplVar.write(this.f54419c, 0, 4);
            zplVar.write(this.f54419c, 0, 4);
            int fileNameLength = zpyVar.getFileNameLength() + 8;
            if (zplVar.a(fileNameLength) != fileNameLength) {
                throw new ZipException("Unable to skip " + fileNameLength + " bytes to update LFH");
            }
            this.f54418b.c(zplVar, zpyVar.getUncompressedSize());
            this.f54418b.c(zplVar, zpyVar.getCompressedSize());
            return;
        }
        this.f54418b.d(this.f54419c, 0, zpyVar.getCompressedSize());
        zplVar.write(this.f54419c, 0, 4);
        this.f54418b.d(this.f54419c, 0, zpyVar.getUncompressedSize());
        zplVar.write(this.f54419c, 0, 4);
    }

    private boolean c(OutputStream outputStream) {
        if (outputStream instanceof zpl) {
            return ((zpl) outputStream).e();
        }
        if (outputStream instanceof zpg) {
            return ((zpg) outputStream).e();
        }
        return false;
    }

    private int d(OutputStream outputStream) {
        if (outputStream instanceof zpl) {
            return ((zpl) outputStream).getCurrentSplitFileCounter();
        }
        return ((zpg) outputStream).getCurrentSplitFileCounter();
    }

    private void e(zqh zqhVar, OutputStream outputStream, byte[] bArr, Charset charset) throws IOException {
        if (bArr == null) {
            throw new ZipException("invalid buff to write as zip headers");
        }
        if ((outputStream instanceof zpg) && ((zpg) outputStream).e(bArr.length)) {
            b(zqhVar, outputStream, charset);
        } else {
            outputStream.write(bArr);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void a(zqh zqhVar, OutputStream outputStream) throws IOException {
        int currentSplitFileCounter;
        if (outputStream instanceof OutputStreamWithSplitZipSupport) {
            OutputStreamWithSplitZipSupport outputStreamWithSplitZipSupport = (OutputStreamWithSplitZipSupport) outputStream;
            zqhVar.e().b(outputStreamWithSplitZipSupport.getFilePointer());
            currentSplitFileCounter = outputStreamWithSplitZipSupport.getCurrentSplitFileCounter();
        } else {
            currentSplitFileCounter = 0;
        }
        if (zqhVar.h()) {
            if (zqhVar.g() == null) {
                zqhVar.c(new zqb());
            }
            if (zqhVar.a() == null) {
                zqhVar.d(new zqd());
            }
            zqhVar.g().e(zqhVar.e().e());
            zqhVar.a().c(currentSplitFileCounter);
            zqhVar.a().a(currentSplitFileCounter + 1);
        }
        zqhVar.e().a(currentSplitFileCounter);
        zqhVar.e().c(currentSplitFileCounter);
    }

    private void d(zqh zqhVar, ByteArrayOutputStream byteArrayOutputStream, zqn zqnVar, Charset charset) throws ZipException {
        if (zqhVar.c() == null || zqhVar.c().b() == null || zqhVar.c().b().size() <= 0) {
            return;
        }
        Iterator<zpy> it = zqhVar.c().b().iterator();
        while (it.hasNext()) {
            b(zqhVar, it.next(), byteArrayOutputStream, zqnVar, charset);
        }
    }

    private void b(zqh zqhVar, zpy zpyVar, ByteArrayOutputStream byteArrayOutputStream, zqn zqnVar, Charset charset) throws ZipException {
        if (zpyVar == null) {
            throw new ZipException("input parameters is null, cannot write local file header");
        }
        try {
            byte[] bArr = {0, 0};
            boolean zD = d(zpyVar);
            zqnVar.d(byteArrayOutputStream, (int) zpyVar.getSignature().getValue());
            zqnVar.e(byteArrayOutputStream, zpyVar.c());
            zqnVar.e(byteArrayOutputStream, zpyVar.getVersionNeededToExtract());
            byteArrayOutputStream.write(zpyVar.getGeneralPurposeFlag());
            zqnVar.e(byteArrayOutputStream, zpyVar.getCompressionMethod().getCode());
            zqnVar.d(this.f54419c, 0, zpyVar.getLastModifiedTime());
            byteArrayOutputStream.write(this.f54419c, 0, 4);
            zqnVar.d(this.f54419c, 0, zpyVar.getCrc());
            byteArrayOutputStream.write(this.f54419c, 0, 4);
            if (zD) {
                zqnVar.d(this.f54419c, 0, Mp4Utils.UNSIGNED_INT_MAX_VALUE);
                byteArrayOutputStream.write(this.f54419c, 0, 4);
                byteArrayOutputStream.write(this.f54419c, 0, 4);
                zqhVar.c(true);
            } else {
                zqnVar.d(this.f54419c, 0, zpyVar.getCompressedSize());
                byteArrayOutputStream.write(this.f54419c, 0, 4);
                zqnVar.d(this.f54419c, 0, zpyVar.getUncompressedSize());
                byteArrayOutputStream.write(this.f54419c, 0, 4);
            }
            byte[] bArrA = new byte[0];
            if (zqp.c(zpyVar.getFileName())) {
                bArrA = zoy.a(zpyVar.getFileName(), charset);
            }
            zqnVar.e(byteArrayOutputStream, bArrA.length);
            byte[] bArr2 = new byte[4];
            if (zD) {
                zqnVar.d(this.f54419c, 0, Mp4Utils.UNSIGNED_INT_MAX_VALUE);
                System.arraycopy(this.f54419c, 0, bArr2, 0, 4);
            } else {
                zqnVar.d(this.f54419c, 0, zpyVar.a());
                System.arraycopy(this.f54419c, 0, bArr2, 0, 4);
            }
            zqnVar.e(byteArrayOutputStream, e(zpyVar, zD));
            String strB = zpyVar.b();
            byte[] bArrA2 = new byte[0];
            if (zqp.c(strB)) {
                bArrA2 = zoy.a(strB, charset);
            }
            zqnVar.e(byteArrayOutputStream, bArrA2.length);
            if (zD) {
                zqnVar.d(this.f54417a, 0, 65535);
                byteArrayOutputStream.write(this.f54417a, 0, 2);
            } else {
                zqnVar.e(byteArrayOutputStream, zpyVar.e());
            }
            byteArrayOutputStream.write(bArr);
            byteArrayOutputStream.write(zpyVar.d());
            byteArrayOutputStream.write(bArr2);
            if (bArrA.length > 0) {
                byteArrayOutputStream.write(bArrA);
            }
            if (zD) {
                zqhVar.c(true);
                zqnVar.e(byteArrayOutputStream, (int) HeaderSignature.ZIP64_EXTRA_FIELD_SIGNATURE.getValue());
                zqnVar.e(byteArrayOutputStream, 28);
                zqnVar.c(byteArrayOutputStream, zpyVar.getUncompressedSize());
                zqnVar.c(byteArrayOutputStream, zpyVar.getCompressedSize());
                zqnVar.c(byteArrayOutputStream, zpyVar.a());
                zqnVar.d(byteArrayOutputStream, zpyVar.e());
            }
            if (zpyVar.getAesExtraDataRecord() != null) {
                zpp aesExtraDataRecord = zpyVar.getAesExtraDataRecord();
                zqnVar.e(byteArrayOutputStream, (int) aesExtraDataRecord.getSignature().getValue());
                zqnVar.e(byteArrayOutputStream, aesExtraDataRecord.d());
                zqnVar.e(byteArrayOutputStream, aesExtraDataRecord.e().getVersionNumber());
                byteArrayOutputStream.write(zoy.a(aesExtraDataRecord.b(), charset));
                byteArrayOutputStream.write(new byte[]{(byte) aesExtraDataRecord.a().getRawCode()});
                zqnVar.e(byteArrayOutputStream, aesExtraDataRecord.c().getCode());
            }
            a(zpyVar, byteArrayOutputStream);
            if (bArrA2.length > 0) {
                byteArrayOutputStream.write(bArrA2);
            }
        } catch (Exception e) {
            throw new ZipException(e);
        }
    }

    private int e(zpy zpyVar, boolean z) {
        int iC = z ? 32 : 0;
        if (zpyVar.getAesExtraDataRecord() != null) {
            iC += 11;
        }
        if (zpyVar.getExtraDataRecords() != null) {
            for (zpx zpxVar : zpyVar.getExtraDataRecords()) {
                if (zpxVar.a() != HeaderSignature.AES_EXTRA_DATA_RECORD.getValue() && zpxVar.a() != HeaderSignature.ZIP64_EXTRA_FIELD_SIGNATURE.getValue()) {
                    iC += zpxVar.c() + 4;
                }
            }
        }
        return iC;
    }

    private void a(zpy zpyVar, OutputStream outputStream) throws IOException {
        if (zpyVar.getExtraDataRecords() == null || zpyVar.getExtraDataRecords().size() == 0) {
            return;
        }
        for (zpx zpxVar : zpyVar.getExtraDataRecords()) {
            if (zpxVar.a() != HeaderSignature.AES_EXTRA_DATA_RECORD.getValue() && zpxVar.a() != HeaderSignature.ZIP64_EXTRA_FIELD_SIGNATURE.getValue()) {
                this.f54418b.e(outputStream, (int) zpxVar.a());
                this.f54418b.e(outputStream, zpxVar.c());
                if (zpxVar.c() > 0 && zpxVar.d() != null) {
                    outputStream.write(zpxVar.d());
                }
            }
        }
    }

    private void b(zqb zqbVar, ByteArrayOutputStream byteArrayOutputStream, zqn zqnVar) throws IOException {
        zqnVar.d(byteArrayOutputStream, (int) zqbVar.getSignature().getValue());
        zqnVar.c(byteArrayOutputStream, zqbVar.c());
        zqnVar.e(byteArrayOutputStream, zqbVar.f());
        zqnVar.e(byteArrayOutputStream, zqbVar.j());
        zqnVar.d(byteArrayOutputStream, zqbVar.a());
        zqnVar.d(byteArrayOutputStream, zqbVar.e());
        zqnVar.c(byteArrayOutputStream, zqbVar.h());
        zqnVar.c(byteArrayOutputStream, zqbVar.i());
        zqnVar.c(byteArrayOutputStream, zqbVar.b());
        zqnVar.c(byteArrayOutputStream, zqbVar.d());
    }

    private void b(zqd zqdVar, ByteArrayOutputStream byteArrayOutputStream, zqn zqnVar) throws IOException {
        zqnVar.d(byteArrayOutputStream, (int) HeaderSignature.ZIP64_END_CENTRAL_DIRECTORY_LOCATOR.getValue());
        zqnVar.d(byteArrayOutputStream, zqdVar.d());
        zqnVar.c(byteArrayOutputStream, zqdVar.c());
        zqnVar.d(byteArrayOutputStream, zqdVar.b());
    }

    private void e(zqh zqhVar, int i, long j, ByteArrayOutputStream byteArrayOutputStream, zqn zqnVar, Charset charset) throws IOException {
        byte[] bArr = new byte[8];
        zqnVar.d(byteArrayOutputStream, (int) HeaderSignature.END_OF_CENTRAL_DIRECTORY.getValue());
        zqnVar.e(byteArrayOutputStream, zqhVar.e().d());
        zqnVar.e(byteArrayOutputStream, zqhVar.e().c());
        long size = zqhVar.c().b().size();
        long jC = zqhVar.i() ? c(zqhVar.c().b(), zqhVar.e().d()) : size;
        if (jC > 65535) {
            jC = 65535;
        }
        zqnVar.e(byteArrayOutputStream, (int) jC);
        if (size > 65535) {
            size = 65535;
        }
        zqnVar.e(byteArrayOutputStream, (int) size);
        zqnVar.d(byteArrayOutputStream, i);
        if (j > Mp4Utils.UNSIGNED_INT_MAX_VALUE) {
            zqnVar.d(bArr, 0, Mp4Utils.UNSIGNED_INT_MAX_VALUE);
            byteArrayOutputStream.write(bArr, 0, 4);
        } else {
            zqnVar.d(bArr, 0, j);
            byteArrayOutputStream.write(bArr, 0, 4);
        }
        String strA = zqhVar.e().a();
        if (zqp.c(strA)) {
            byte[] bArrA = zoy.a(strA, charset);
            zqnVar.e(byteArrayOutputStream, bArrA.length);
            byteArrayOutputStream.write(bArrA);
            return;
        }
        zqnVar.e(byteArrayOutputStream, 0);
    }

    private long c(List<zpy> list, int i) throws ZipException {
        if (list == null) {
            throw new ZipException("file headers are null, cannot calculate number of entries on this disk");
        }
        Iterator<zpy> it = list.iterator();
        int i2 = 0;
        while (it.hasNext()) {
            if (it.next().e() == i) {
                i2++;
            }
        }
        return i2;
    }

    private boolean d(zpy zpyVar) {
        return zpyVar.getCompressedSize() >= Mp4Utils.UNSIGNED_INT_MAX_VALUE || zpyVar.getUncompressedSize() >= Mp4Utils.UNSIGNED_INT_MAX_VALUE || zpyVar.a() >= Mp4Utils.UNSIGNED_INT_MAX_VALUE || zpyVar.e() >= 65535;
    }

    private long e(zqh zqhVar) {
        if (zqhVar.h() && zqhVar.g() != null && zqhVar.g().d() != -1) {
            return zqhVar.g().d();
        }
        return zqhVar.e().e();
    }

    private zqb c(zqh zqhVar, int i, long j) throws ZipException {
        zqb zqbVar = new zqb();
        zqbVar.setSignature(HeaderSignature.ZIP64_END_CENTRAL_DIRECTORY_RECORD);
        zqbVar.d(44L);
        if (zqhVar.c() != null && zqhVar.c().b() != null && zqhVar.c().b().size() > 0) {
            zpy zpyVar = zqhVar.c().b().get(0);
            zqbVar.d(zpyVar.c());
            zqbVar.e(zpyVar.getVersionNeededToExtract());
        }
        zqbVar.c(zqhVar.e().d());
        zqbVar.b(zqhVar.e().c());
        long size = zqhVar.c().b().size();
        zqbVar.c(zqhVar.i() ? c(zqhVar.c().b(), zqhVar.e().d()) : size);
        zqbVar.a(size);
        zqbVar.b(i);
        zqbVar.e(j);
        return zqbVar;
    }
}
