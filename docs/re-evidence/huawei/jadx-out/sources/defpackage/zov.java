package defpackage;

import java.nio.charset.Charset;
import net.lingala.zip4j.exception.ZipException;
import net.lingala.zip4j.headers.HeaderSignature;
import net.lingala.zip4j.model.ZipParameters;
import net.lingala.zip4j.model.enums.AesKeyStrength;
import net.lingala.zip4j.model.enums.CompressionLevel;
import net.lingala.zip4j.model.enums.CompressionMethod;
import net.lingala.zip4j.model.enums.EncryptionMethod;

/* JADX INFO: loaded from: classes20.dex */
public class zov {
    public zpy d(ZipParameters zipParameters, boolean z, int i, Charset charset, zqn zqnVar) throws ZipException {
        zpy zpyVar = new zpy();
        zpyVar.setSignature(HeaderSignature.CENTRAL_DIRECTORY);
        zpyVar.c(zqo.b(zipParameters, zqnVar));
        zpyVar.setVersionNeededToExtract(zqo.a(zipParameters).getCode());
        if (zipParameters.k() && zipParameters.g() == EncryptionMethod.AES) {
            zpyVar.setCompressionMethod(CompressionMethod.AES_INTERNAL_ONLY);
            zpyVar.setAesExtraDataRecord(e(zipParameters));
            zpyVar.setExtraFieldLength(zpyVar.getExtraFieldLength() + 11);
        } else {
            zpyVar.setCompressionMethod(zipParameters.a());
        }
        if (zipParameters.k()) {
            if (zipParameters.g() == null || zipParameters.g() == EncryptionMethod.NONE) {
                throw new ZipException("Encryption method has to be set when encryptFiles flag is set in zip parameters");
            }
            zpyVar.setEncrypted(true);
            zpyVar.setEncryptionMethod(zipParameters.g());
        }
        String strA = a(zipParameters.m());
        zpyVar.setFileName(strA);
        zpyVar.setFileNameLength(c(strA, charset));
        if (!z) {
            i = 0;
        }
        zpyVar.d(i);
        zpyVar.setLastModifiedTime(zqp.d(zipParameters.l()));
        boolean zA = zqk.a(strA);
        zpyVar.setDirectory(zA);
        zpyVar.c(zqk.c(zA));
        if (zipParameters.v() && zipParameters.j() == -1) {
            zpyVar.setUncompressedSize(0L);
        } else {
            zpyVar.setUncompressedSize(zipParameters.j());
        }
        if (zipParameters.k() && zipParameters.g() == EncryptionMethod.ZIP_STANDARD) {
            zpyVar.setCrc(zipParameters.f());
        }
        zpyVar.setGeneralPurposeFlag(d(zpyVar.isEncrypted(), zipParameters, charset));
        zpyVar.setDataDescriptorExists(zipParameters.v());
        zpyVar.b(zipParameters.h());
        return zpyVar;
    }

    public zpz d(zpy zpyVar) {
        zpz zpzVar = new zpz();
        zpzVar.setSignature(HeaderSignature.LOCAL_FILE_HEADER);
        zpzVar.setVersionNeededToExtract(zpyVar.getVersionNeededToExtract());
        zpzVar.setCompressionMethod(zpyVar.getCompressionMethod());
        zpzVar.setLastModifiedTime(zpyVar.getLastModifiedTime());
        zpzVar.setUncompressedSize(zpyVar.getUncompressedSize());
        zpzVar.setFileNameLength(zpyVar.getFileNameLength());
        zpzVar.setFileName(zpyVar.getFileName());
        zpzVar.setEncrypted(zpyVar.isEncrypted());
        zpzVar.setEncryptionMethod(zpyVar.getEncryptionMethod());
        zpzVar.setAesExtraDataRecord(zpyVar.getAesExtraDataRecord());
        zpzVar.setCrc(zpyVar.getCrc());
        zpzVar.setCompressedSize(zpyVar.getCompressedSize());
        zpzVar.setGeneralPurposeFlag((byte[]) zpyVar.getGeneralPurposeFlag().clone());
        zpzVar.setDataDescriptorExists(zpyVar.isDataDescriptorExists());
        zpzVar.setExtraFieldLength(zpyVar.getExtraFieldLength());
        return zpzVar;
    }

    private byte[] d(boolean z, ZipParameters zipParameters, Charset charset) {
        byte[] bArr = new byte[2];
        bArr[0] = b(z, zipParameters);
        if (charset != null && !zql.d.equals(charset)) {
            return bArr;
        }
        bArr[1] = zqg.e(bArr[1], 3);
        return bArr;
    }

    private byte b(boolean z, ZipParameters zipParameters) {
        byte bE = z ? zqg.e((byte) 0, 0) : (byte) 0;
        if (CompressionMethod.DEFLATE.equals(zipParameters.a())) {
            if (CompressionLevel.NORMAL.equals(zipParameters.c())) {
                bE = zqg.c(zqg.c(bE, 1), 2);
            } else if (CompressionLevel.MAXIMUM.equals(zipParameters.c())) {
                bE = zqg.c(zqg.e(bE, 1), 2);
            } else if (CompressionLevel.FAST.equals(zipParameters.c())) {
                bE = zqg.e(zqg.c(bE, 1), 2);
            } else if (CompressionLevel.FASTEST.equals(zipParameters.c()) || CompressionLevel.ULTRA.equals(zipParameters.c())) {
                bE = zqg.e(zqg.e(bE, 1), 2);
            }
        }
        return zipParameters.v() ? zqg.e(bE, 3) : bE;
    }

    private String a(String str) throws ZipException {
        if (zqp.c(str)) {
            return str;
        }
        throw new ZipException("fileNameInZip is null or empty");
    }

    private zpp e(ZipParameters zipParameters) throws ZipException {
        zpp zppVar = new zpp();
        if (zipParameters.e() != null) {
            zppVar.e(zipParameters.e());
        }
        if (zipParameters.b() == AesKeyStrength.KEY_STRENGTH_128) {
            zppVar.a(AesKeyStrength.KEY_STRENGTH_128);
        } else if (zipParameters.b() == AesKeyStrength.KEY_STRENGTH_192) {
            zppVar.a(AesKeyStrength.KEY_STRENGTH_192);
        } else if (zipParameters.b() == AesKeyStrength.KEY_STRENGTH_256) {
            zppVar.a(AesKeyStrength.KEY_STRENGTH_256);
        } else {
            throw new ZipException("invalid AES key strength");
        }
        zppVar.d(zipParameters.a());
        return zppVar;
    }

    private int c(String str, Charset charset) {
        return zoy.a(str, charset).length;
    }
}
