package com.xiaomi.hm.health.bt.utils;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.zip.CRC32;
import java.util.zip.CheckedInputStream;
import kotlin.Metadata;
import kotlin.io.CloseableKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0007\u001a\u000e\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000\u001a\u0016\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0004\u001a\u0018\u0010\b\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002\u001a\u0018\u0010\f\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\u0004\u001a\u000e\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u0004\"\u0016\u0010\u000f\u001a\u00020\u00008\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u000e¨\u0006\u0010"}, d2 = {"", "path", "", "getCrc32", "", "size", "Ljava/io/InputStream;", "inputStream", "a", "", "data", "len", "getCRC32", "value", "Ljava/lang/String;", "TAG", "bluetooth_release"}, k = 2, mv = {1, 5, 1})
public final class CRCUtilsKt {

    @NotNull
    private static final String a = "CRCUtils";

    private static final long a(InputStream inputStream, int i) throws IOException {
        CRC32 crc32 = new CRC32();
        CheckedInputStream checkedInputStream = new CheckedInputStream(inputStream, crc32);
        try {
            checkedInputStream.skip(i);
            CloseableKt.closeFinally(checkedInputStream, null);
            return crc32.getValue();
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                CloseableKt.closeFinally(checkedInputStream, th);
                throw th2;
            }
        }
    }

    public static final long getCRC32(@NotNull byte[] bArr, int i) {
        CRC32 crc32 = new CRC32();
        crc32.update(bArr, 0, i);
        return crc32.getValue();
    }

    public static /* synthetic */ long getCRC32$default(byte[] bArr, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = bArr.length;
        }
        return getCRC32(bArr, i);
    }

    public static final long getCrc32(@NotNull String str) throws IOException {
        BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(str));
        return a(bufferedInputStream, bufferedInputStream.available());
    }

    public static final long getCrc32(@NotNull String str, int i) throws IOException {
        return a(new BufferedInputStream(new FileInputStream(str)), i);
    }

    public static final long getCRC32(int i) {
        CRC32 crc32 = new CRC32();
        crc32.update(i);
        return crc32.getValue();
    }
}
