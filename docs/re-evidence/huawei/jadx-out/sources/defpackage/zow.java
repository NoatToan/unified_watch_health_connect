package defpackage;

import androidx.media3.muxer.Mp4Utils;
import com.huawei.operation.utils.Constants;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import net.lingala.zip4j.exception.ZipException;
import net.lingala.zip4j.headers.HeaderSignature;
import net.lingala.zip4j.model.AbstractFileHeader;
import net.lingala.zip4j.model.enums.AesKeyStrength;
import net.lingala.zip4j.model.enums.AesVersion;
import net.lingala.zip4j.model.enums.CompressionMethod;
import net.lingala.zip4j.model.enums.EncryptionMethod;

/* JADX INFO: loaded from: classes20.dex */
public class zow {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final zqn f54414a = new zqn();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final byte[] f54415b = new byte[4];
    private zqh d;

    public zqh a(RandomAccessFile randomAccessFile, zqc zqcVar) throws IOException {
        if (randomAccessFile.length() == 0) {
            return new zqh();
        }
        if (randomAccessFile.length() < 22) {
            throw new ZipException("Zip file size less than minimum expected zip file size. Probably not a zip file or a corrupted zip file");
        }
        zqh zqhVar = new zqh();
        this.d = zqhVar;
        try {
            zqhVar.b(b(randomAccessFile, this.f54414a, zqcVar));
            if (this.d.e().j() == 0) {
                return this.d;
            }
            zqh zqhVar2 = this.d;
            zqhVar2.d(d(randomAccessFile, this.f54414a, zqhVar2.e().b()));
            if (this.d.h()) {
                this.d.c(b(randomAccessFile, this.f54414a));
                if (this.d.g() != null && this.d.g().a() > 0) {
                    this.d.b(true);
                } else {
                    this.d.b(false);
                }
            }
            this.d.d(b(randomAccessFile, this.f54414a, zqcVar.c()));
            return this.d;
        } catch (ZipException e) {
            throw e;
        } catch (IOException e2) {
            e2.printStackTrace();
            throw new ZipException("Zip headers not found. Probably not a zip file or a corrupted zip file", e2);
        }
    }

    private zpv b(RandomAccessFile randomAccessFile, zqn zqnVar, zqc zqcVar) throws IOException {
        long jE = e(randomAccessFile);
        c(randomAccessFile, 4 + jE);
        zpv zpvVar = new zpv();
        zpvVar.setSignature(HeaderSignature.END_OF_CENTRAL_DIRECTORY);
        zpvVar.a(zqnVar.c(randomAccessFile));
        zpvVar.c(zqnVar.c(randomAccessFile));
        zpvVar.b(zqnVar.c(randomAccessFile));
        zpvVar.d(zqnVar.c(randomAccessFile));
        zpvVar.e(zqnVar.b(randomAccessFile));
        zpvVar.c(jE);
        randomAccessFile.readFully(this.f54415b);
        zpvVar.b(zqnVar.e(this.f54415b, 0));
        zpvVar.a(c(randomAccessFile, zqnVar.c(randomAccessFile), zqcVar.c()));
        this.d.b(zpvVar.d() > 0);
        return zpvVar;
    }

    private zpt b(RandomAccessFile randomAccessFile, zqn zqnVar, Charset charset) throws IOException {
        zpt zptVar = new zpt();
        ArrayList arrayList = new ArrayList();
        long jB = zoy.b(this.d);
        long jE = e(this.d);
        randomAccessFile.seek(jB);
        int i = 2;
        byte[] bArr = new byte[2];
        byte[] bArr2 = new byte[4];
        int i2 = 0;
        int i3 = 0;
        while (i3 < jE) {
            zpy zpyVar = new zpy();
            byte[] bArr3 = bArr2;
            if (zqnVar.b(randomAccessFile) != HeaderSignature.CENTRAL_DIRECTORY.getValue()) {
                throw new ZipException("Expected central directory entry not found (#" + (i3 + 1) + Constants.RIGHT_BRACKET_ONLY);
            }
            zpyVar.setSignature(HeaderSignature.CENTRAL_DIRECTORY);
            zpyVar.c(zqnVar.c(randomAccessFile));
            zpyVar.setVersionNeededToExtract(zqnVar.c(randomAccessFile));
            byte[] bArr4 = new byte[i];
            randomAccessFile.readFully(bArr4);
            zpyVar.setEncrypted(zqg.a(bArr4[i2], i2));
            zpyVar.setDataDescriptorExists(zqg.a(bArr4[i2], 3));
            zpyVar.setFileNameUTF8Encoded(zqg.a(bArr4[1], 3));
            zpyVar.setGeneralPurposeFlag((byte[]) bArr4.clone());
            zpyVar.setCompressionMethod(CompressionMethod.getCompressionMethodFromCode(zqnVar.c(randomAccessFile)));
            zpyVar.setLastModifiedTime(zqnVar.b(randomAccessFile));
            randomAccessFile.readFully(bArr3);
            zpyVar.setCrc(zqnVar.e(bArr3, i2));
            int i4 = i3;
            zpyVar.setCompressedSize(zqnVar.e(randomAccessFile, 4));
            zpyVar.setUncompressedSize(zqnVar.e(randomAccessFile, 4));
            int iC = zqnVar.c(randomAccessFile);
            zpyVar.setFileNameLength(iC);
            zpyVar.setExtraFieldLength(zqnVar.c(randomAccessFile));
            int iC2 = zqnVar.c(randomAccessFile);
            zpyVar.a(iC2);
            zpyVar.d(zqnVar.c(randomAccessFile));
            randomAccessFile.readFully(bArr);
            zpyVar.d((byte[]) bArr.clone());
            randomAccessFile.readFully(bArr3);
            zpyVar.c((byte[]) bArr3.clone());
            randomAccessFile.readFully(bArr3);
            long j = jE;
            byte[] bArr5 = bArr;
            zpyVar.e(zqnVar.e(bArr3, 0));
            if (iC > 0) {
                byte[] bArr6 = new byte[iC];
                randomAccessFile.readFully(bArr6);
                zpyVar.setFileName(zoy.a(bArr6, zpyVar.isFileNameUTF8Encoded(), charset));
                zpyVar.setDirectory(c(zpyVar.d(), zpyVar.getFileName()));
                d(randomAccessFile, zpyVar);
                e(zpyVar, zqnVar);
                c(zpyVar, zqnVar);
                if (iC2 > 0) {
                    byte[] bArr7 = new byte[iC2];
                    randomAccessFile.readFully(bArr7);
                    zpyVar.b(zoy.a(bArr7, zpyVar.isFileNameUTF8Encoded(), charset));
                }
                if (zpyVar.isEncrypted()) {
                    if (zpyVar.getAesExtraDataRecord() != null) {
                        zpyVar.setEncryptionMethod(EncryptionMethod.AES);
                    } else {
                        zpyVar.setEncryptionMethod(EncryptionMethod.ZIP_STANDARD);
                    }
                }
                arrayList.add(zpyVar);
                bArr2 = bArr3;
                i2 = 0;
                i = 2;
                i3 = i4 + 1;
                bArr = bArr5;
                jE = j;
            } else {
                throw new ZipException("Invalid entry name in file header");
            }
        }
        zptVar.b(arrayList);
        zpu zpuVar = new zpu();
        if (zqnVar.b(randomAccessFile) == HeaderSignature.DIGITAL_SIGNATURE.getValue()) {
            zpuVar.setSignature(HeaderSignature.DIGITAL_SIGNATURE);
            zpuVar.c(zqnVar.c(randomAccessFile));
            if (zpuVar.b() > 0) {
                byte[] bArr8 = new byte[zpuVar.b()];
                randomAccessFile.readFully(bArr8);
                zpuVar.b(new String(bArr8));
            }
        }
        return zptVar;
    }

    private void d(RandomAccessFile randomAccessFile, zpy zpyVar) throws IOException {
        int extraFieldLength = zpyVar.getExtraFieldLength();
        if (extraFieldLength <= 0) {
            return;
        }
        zpyVar.setExtraDataRecords(c(randomAccessFile, extraFieldLength));
    }

    private void d(InputStream inputStream, zpz zpzVar) throws IOException {
        int extraFieldLength = zpzVar.getExtraFieldLength();
        if (extraFieldLength <= 0) {
            return;
        }
        zpzVar.setExtraDataRecords(e(inputStream, extraFieldLength));
    }

    private List<zpx> c(RandomAccessFile randomAccessFile, int i) throws IOException {
        if (i < 4) {
            if (i <= 0) {
                return null;
            }
            randomAccessFile.skipBytes(i);
            return null;
        }
        byte[] bArr = new byte[i];
        randomAccessFile.read(bArr);
        try {
            return c(bArr, i);
        } catch (Exception unused) {
            return Collections.EMPTY_LIST;
        }
    }

    private List<zpx> e(InputStream inputStream, int i) throws IOException {
        if (i < 4) {
            if (i <= 0) {
                return null;
            }
            inputStream.skip(i);
            return null;
        }
        byte[] bArr = new byte[i];
        zqp.a(inputStream, bArr);
        try {
            return c(bArr, i);
        } catch (Exception unused) {
            return Collections.EMPTY_LIST;
        }
    }

    private List<zpx> c(byte[] bArr, int i) {
        ArrayList arrayList = new ArrayList();
        int i2 = 0;
        while (i2 < i) {
            zpx zpxVar = new zpx();
            zpxVar.b(this.f54414a.b(bArr, i2));
            int iB = this.f54414a.b(bArr, i2 + 2);
            zpxVar.b(iB);
            int i3 = i2 + 4;
            if (iB > 0) {
                byte[] bArr2 = new byte[iB];
                System.arraycopy(bArr, i3, bArr2, 0, iB);
                zpxVar.e(bArr2);
            }
            i2 = i3 + iB;
            arrayList.add(zpxVar);
        }
        if (arrayList.size() > 0) {
            return arrayList;
        }
        return null;
    }

    private zqd d(RandomAccessFile randomAccessFile, zqn zqnVar, long j) throws IOException {
        zqd zqdVar = new zqd();
        e(randomAccessFile, j);
        if (zqnVar.b(randomAccessFile) == HeaderSignature.ZIP64_END_CENTRAL_DIRECTORY_LOCATOR.getValue()) {
            this.d.c(true);
            zqdVar.setSignature(HeaderSignature.ZIP64_END_CENTRAL_DIRECTORY_LOCATOR);
            zqdVar.c(zqnVar.b(randomAccessFile));
            zqdVar.e(zqnVar.e(randomAccessFile));
            zqdVar.a(zqnVar.b(randomAccessFile));
            return zqdVar;
        }
        this.d.c(false);
        return null;
    }

    private zqb b(RandomAccessFile randomAccessFile, zqn zqnVar) throws IOException {
        if (this.d.a() == null) {
            throw new ZipException("invalid zip64 end of central directory locator");
        }
        long jC = this.d.a().c();
        if (jC < 0) {
            throw new ZipException("invalid offset for start of end of central directory record");
        }
        randomAccessFile.seek(jC);
        zqb zqbVar = new zqb();
        if (zqnVar.b(randomAccessFile) != HeaderSignature.ZIP64_END_CENTRAL_DIRECTORY_RECORD.getValue()) {
            throw new ZipException("invalid signature for zip64 end of central directory record");
        }
        zqbVar.setSignature(HeaderSignature.ZIP64_END_CENTRAL_DIRECTORY_RECORD);
        zqbVar.d(zqnVar.e(randomAccessFile));
        zqbVar.d(zqnVar.c(randomAccessFile));
        zqbVar.e(zqnVar.c(randomAccessFile));
        zqbVar.c(zqnVar.b(randomAccessFile));
        zqbVar.b(zqnVar.b(randomAccessFile));
        zqbVar.c(zqnVar.e(randomAccessFile));
        zqbVar.a(zqnVar.e(randomAccessFile));
        zqbVar.b(zqnVar.e(randomAccessFile));
        zqbVar.e(zqnVar.e(randomAccessFile));
        long jC2 = zqbVar.c() - 44;
        if (jC2 > 0) {
            byte[] bArr = new byte[(int) jC2];
            randomAccessFile.readFully(bArr);
            zqbVar.a(bArr);
        }
        return zqbVar;
    }

    private void e(zpy zpyVar, zqn zqnVar) {
        zqi zqiVarC;
        if (zpyVar.getExtraDataRecords() == null || zpyVar.getExtraDataRecords().size() <= 0 || (zqiVarC = c(zpyVar.getExtraDataRecords(), zqnVar, zpyVar.getUncompressedSize(), zpyVar.getCompressedSize(), zpyVar.a(), zpyVar.e())) == null) {
            return;
        }
        zpyVar.setZip64ExtendedInfo(zqiVarC);
        if (zqiVarC.c() != -1) {
            zpyVar.setUncompressedSize(zqiVarC.c());
        }
        if (zqiVarC.b() != -1) {
            zpyVar.setCompressedSize(zqiVarC.b());
        }
        if (zqiVarC.e() != -1) {
            zpyVar.e(zqiVarC.e());
        }
        if (zqiVarC.a() != -1) {
            zpyVar.d(zqiVarC.a());
        }
    }

    private void a(zpz zpzVar, zqn zqnVar) throws ZipException {
        zqi zqiVarC;
        if (zpzVar == null) {
            throw new ZipException("file header is null in reading Zip64 Extended Info");
        }
        if (zpzVar.getExtraDataRecords() == null || zpzVar.getExtraDataRecords().size() <= 0 || (zqiVarC = c(zpzVar.getExtraDataRecords(), zqnVar, zpzVar.getUncompressedSize(), zpzVar.getCompressedSize(), 0L, 0)) == null) {
            return;
        }
        zpzVar.setZip64ExtendedInfo(zqiVarC);
        if (zqiVarC.c() != -1) {
            zpzVar.setUncompressedSize(zqiVarC.c());
        }
        if (zqiVarC.b() != -1) {
            zpzVar.setCompressedSize(zqiVarC.b());
        }
    }

    private zqi c(List<zpx> list, zqn zqnVar, long j, long j2, long j3, int i) {
        for (zpx zpxVar : list) {
            if (zpxVar != null && HeaderSignature.ZIP64_EXTRA_FIELD_SIGNATURE.getValue() == zpxVar.a()) {
                zqi zqiVar = new zqi();
                byte[] bArrD = zpxVar.d();
                if (zpxVar.c() <= 0) {
                    return null;
                }
                int i2 = 0;
                if (zpxVar.c() > 0 && j == Mp4Utils.UNSIGNED_INT_MAX_VALUE) {
                    zqiVar.c(zqnVar.e(bArrD, 0));
                    i2 = 8;
                }
                if (i2 < zpxVar.c() && j2 == Mp4Utils.UNSIGNED_INT_MAX_VALUE) {
                    zqiVar.d(zqnVar.e(bArrD, i2));
                    i2 += 8;
                }
                if (i2 < zpxVar.c() && j3 == Mp4Utils.UNSIGNED_INT_MAX_VALUE) {
                    zqiVar.b(zqnVar.e(bArrD, i2));
                    i2 += 8;
                }
                if (i2 < zpxVar.c() && i == 65535) {
                    zqiVar.e(zqnVar.c(bArrD, i2));
                }
                return zqiVar;
            }
        }
        return null;
    }

    private void e(RandomAccessFile randomAccessFile, long j) throws IOException {
        c(randomAccessFile, j - 20);
    }

    public zpz c(InputStream inputStream, Charset charset) throws IOException {
        zpz zpzVar = new zpz();
        byte[] bArr = new byte[4];
        int iD = this.f54414a.d(inputStream);
        if (iD == HeaderSignature.TEMPORARY_SPANNING_MARKER.getValue()) {
            iD = this.f54414a.d(inputStream);
        }
        if (iD != HeaderSignature.LOCAL_FILE_HEADER.getValue()) {
            return null;
        }
        zpzVar.setSignature(HeaderSignature.LOCAL_FILE_HEADER);
        zpzVar.setVersionNeededToExtract(this.f54414a.b(inputStream));
        byte[] bArr2 = new byte[2];
        if (zqp.a(inputStream, bArr2) != 2) {
            throw new ZipException("Could not read enough bytes for generalPurposeFlags");
        }
        zpzVar.setEncrypted(zqg.a(bArr2[0], 0));
        zpzVar.setDataDescriptorExists(zqg.a(bArr2[0], 3));
        boolean z = true;
        zpzVar.setFileNameUTF8Encoded(zqg.a(bArr2[1], 3));
        zpzVar.setGeneralPurposeFlag((byte[]) bArr2.clone());
        zpzVar.setCompressionMethod(CompressionMethod.getCompressionMethodFromCode(this.f54414a.b(inputStream)));
        zpzVar.setLastModifiedTime(this.f54414a.d(inputStream));
        zqp.a(inputStream, bArr);
        zpzVar.setCrc(this.f54414a.e(bArr, 0));
        zpzVar.setCompressedSize(this.f54414a.d(inputStream, 4));
        zpzVar.setUncompressedSize(this.f54414a.d(inputStream, 4));
        int iB = this.f54414a.b(inputStream);
        zpzVar.setFileNameLength(iB);
        zpzVar.setExtraFieldLength(this.f54414a.b(inputStream));
        if (iB > 0) {
            byte[] bArr3 = new byte[iB];
            zqp.a(inputStream, bArr3);
            String strA = zoy.a(bArr3, zpzVar.isFileNameUTF8Encoded(), charset);
            zpzVar.setFileName(strA);
            if (!strA.endsWith("/") && !strA.endsWith("\\")) {
                z = false;
            }
            zpzVar.setDirectory(z);
            d(inputStream, zpzVar);
            a(zpzVar, this.f54414a);
            c(zpzVar, this.f54414a);
            if (zpzVar.isEncrypted() && zpzVar.getEncryptionMethod() != EncryptionMethod.AES) {
                if (zqg.a(zpzVar.getGeneralPurposeFlag()[0], 6)) {
                    zpzVar.setEncryptionMethod(EncryptionMethod.ZIP_STANDARD_VARIANT_STRONG);
                    return zpzVar;
                }
                zpzVar.setEncryptionMethod(EncryptionMethod.ZIP_STANDARD);
            }
            return zpzVar;
        }
        throw new ZipException("Invalid entry name in local file header");
    }

    public zpw e(InputStream inputStream, boolean z) throws IOException {
        zpw zpwVar = new zpw();
        byte[] bArr = new byte[4];
        zqp.a(inputStream, bArr);
        long jE = this.f54414a.e(bArr, 0);
        if (jE == HeaderSignature.EXTRA_DATA_RECORD.getValue()) {
            zpwVar.setSignature(HeaderSignature.EXTRA_DATA_RECORD);
            zqp.a(inputStream, bArr);
            zpwVar.c(this.f54414a.e(bArr, 0));
        } else {
            zpwVar.c(jE);
        }
        if (z) {
            zpwVar.d(this.f54414a.a(inputStream));
            zpwVar.a(this.f54414a.a(inputStream));
            return zpwVar;
        }
        zpwVar.d(this.f54414a.d(inputStream));
        zpwVar.a(this.f54414a.d(inputStream));
        return zpwVar;
    }

    private void c(AbstractFileHeader abstractFileHeader, zqn zqnVar) throws ZipException {
        zpp zppVarD;
        if (abstractFileHeader.getExtraDataRecords() == null || abstractFileHeader.getExtraDataRecords().size() <= 0 || (zppVarD = d(abstractFileHeader.getExtraDataRecords(), zqnVar)) == null) {
            return;
        }
        abstractFileHeader.setAesExtraDataRecord(zppVarD);
        abstractFileHeader.setEncryptionMethod(EncryptionMethod.AES);
    }

    private zpp d(List<zpx> list, zqn zqnVar) throws ZipException {
        if (list == null) {
            return null;
        }
        for (zpx zpxVar : list) {
            if (zpxVar != null && zpxVar.a() == HeaderSignature.AES_EXTRA_DATA_RECORD.getValue()) {
                byte[] bArrD = zpxVar.d();
                if (bArrD == null || bArrD.length != 7) {
                    throw new ZipException("corrupt AES extra data records");
                }
                zpp zppVar = new zpp();
                zppVar.setSignature(HeaderSignature.AES_EXTRA_DATA_RECORD);
                zppVar.e(zpxVar.c());
                byte[] bArrD2 = zpxVar.d();
                zppVar.e(AesVersion.getFromVersionNumber(zqnVar.b(bArrD2, 0)));
                byte[] bArr = new byte[2];
                System.arraycopy(bArrD2, 2, bArr, 0, 2);
                zppVar.a(new String(bArr));
                zppVar.a(AesKeyStrength.getAesKeyStrengthFromRawCode(bArrD2[4] & 255));
                zppVar.d(CompressionMethod.getCompressionMethodFromCode(zqnVar.b(bArrD2, 5)));
                return zppVar;
            }
        }
        return null;
    }

    private long e(zqh zqhVar) {
        if (zqhVar.h()) {
            return zqhVar.g().i();
        }
        return zqhVar.e().j();
    }

    private long e(RandomAccessFile randomAccessFile) throws IOException {
        long length = randomAccessFile.length();
        if (length < 22) {
            throw new ZipException("Zip file size less than size of zip headers. Probably not a zip file.");
        }
        long j = length - 22;
        c(randomAccessFile, j);
        return ((long) this.f54414a.b(randomAccessFile)) == HeaderSignature.END_OF_CENTRAL_DIRECTORY.getValue() ? j : a(randomAccessFile);
    }

    private long a(RandomAccessFile randomAccessFile) throws IOException {
        long length = randomAccessFile.length() - 22;
        for (long length2 = randomAccessFile.length() < 65536 ? randomAccessFile.length() : 65536L; length2 > 0 && length > 0; length2--) {
            length--;
            c(randomAccessFile, length);
            if (this.f54414a.b(randomAccessFile) == HeaderSignature.END_OF_CENTRAL_DIRECTORY.getValue()) {
                return length;
            }
        }
        throw new ZipException("Zip headers not found. Probably not a zip file");
    }

    private void c(RandomAccessFile randomAccessFile, long j) throws IOException {
        if (randomAccessFile instanceof zpc) {
            ((zpc) randomAccessFile).b(j);
        } else {
            randomAccessFile.seek(j);
        }
    }

    private String c(RandomAccessFile randomAccessFile, int i, Charset charset) {
        if (i <= 0) {
            return null;
        }
        try {
            byte[] bArr = new byte[i];
            randomAccessFile.readFully(bArr);
            if (charset == null) {
                charset = zql.f54483c;
            }
            return zoy.a(bArr, false, charset);
        } catch (IOException unused) {
            return null;
        }
    }

    public boolean c(byte[] bArr, String str) {
        byte b2 = bArr[0];
        if (b2 != 0 && zqg.a(b2, 4)) {
            return true;
        }
        byte b3 = bArr[3];
        if (b3 == 0 || !zqg.a(b3, 6)) {
            return str != null && (str.endsWith("/") || str.endsWith("\\"));
        }
        return true;
    }
}
