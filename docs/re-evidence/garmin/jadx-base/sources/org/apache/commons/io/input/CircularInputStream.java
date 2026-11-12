package org.apache.commons.io.input;

import com.google.common.primitives.UnsignedBytes;
import java.io.InputStream;
import java.util.Objects;
import vb.h;

/* JADX INFO: loaded from: classes3.dex */
public class CircularInputStream extends InputStream {
    private long byteCount;
    private int position = -1;
    private final byte[] repeatedContent;
    private final long targetByteCount;

    public CircularInputStream(byte[] bArr, long j8) {
        this.repeatedContent = validate(bArr);
        if (bArr.length != 0) {
            this.targetByteCount = j8;
        } else {
            h.s("repeatContent is empty.");
            throw null;
        }
    }

    private static byte[] validate(byte[] bArr) {
        Objects.requireNonNull(bArr, "repeatContent");
        for (byte b14 : bArr) {
            if (b14 == -1) {
                h.s("repeatContent contains the end-of-stream marker -1");
                return null;
            }
        }
        return bArr;
    }

    @Override // java.io.InputStream
    public int read() {
        long j8 = this.targetByteCount;
        if (j8 >= 0) {
            long j14 = this.byteCount;
            if (j14 == j8) {
                return -1;
            }
            this.byteCount = j14 + 1;
        }
        int i14 = this.position + 1;
        byte[] bArr = this.repeatedContent;
        int length = i14 % bArr.length;
        this.position = length;
        return bArr[length] & UnsignedBytes.MAX_VALUE;
    }
}
