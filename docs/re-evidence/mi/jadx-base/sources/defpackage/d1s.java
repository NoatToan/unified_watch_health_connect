package defpackage;

import java.util.zip.ZipException;
import org.apache.commons.compress.archivers.zip.ZipShort;

/* JADX INFO: loaded from: classes3.dex */
public interface d1s {
    ZipShort getHeaderId();

    void parseFromCentralDirectoryData(byte[] bArr, int i, int i2) throws ZipException;

    void parseFromLocalFileData(byte[] bArr, int i, int i2) throws ZipException;
}
