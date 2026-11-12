package defpackage;

import androidx.media3.muxer.Mp4Utils;
import net.lingala.zip4j.headers.VersionMadeBy;
import net.lingala.zip4j.headers.VersionNeededToExtract;
import net.lingala.zip4j.model.ZipParameters;
import net.lingala.zip4j.model.enums.CompressionMethod;
import net.lingala.zip4j.model.enums.EncryptionMethod;

/* JADX INFO: loaded from: classes20.dex */
public class zqo {
    public static int b(ZipParameters zipParameters, zqn zqnVar) {
        byte[] bArr = {VersionMadeBy.SPECIFICATION_VERSION.getCode(), VersionMadeBy.UNIX.getCode()};
        if (zqk.c() && !zipParameters.q()) {
            bArr[1] = VersionMadeBy.WINDOWS.getCode();
        }
        return zqnVar.b(bArr, 0);
    }

    public static VersionNeededToExtract a(ZipParameters zipParameters) {
        VersionNeededToExtract versionNeededToExtract = VersionNeededToExtract.DEFAULT;
        if (zipParameters.a() == CompressionMethod.DEFLATE) {
            versionNeededToExtract = VersionNeededToExtract.DEFLATE_COMPRESSED;
        }
        if (zipParameters.j() > Mp4Utils.UNSIGNED_INT_MAX_VALUE) {
            versionNeededToExtract = VersionNeededToExtract.ZIP_64_FORMAT;
        }
        return (zipParameters.k() && zipParameters.g().equals(EncryptionMethod.AES)) ? VersionNeededToExtract.AES_ENCRYPTED : versionNeededToExtract;
    }
}
