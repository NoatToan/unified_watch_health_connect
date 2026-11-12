package defpackage;

import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes11.dex */
public class tcd {
    public static int a(byte[] bArr, int i) {
        if (i + 4 > bArr.length) {
            return 0;
        }
        return ByteBuffer.wrap(bArr, i, 4).getInt();
    }
}
