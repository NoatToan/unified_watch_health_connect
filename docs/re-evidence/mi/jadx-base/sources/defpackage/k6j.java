package defpackage;

import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes4.dex */
public class k6j extends qhh {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f23525b = null;

    public int b(byte[] bArr) {
        if (bArr == null) {
            return -1;
        }
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr);
        byteBufferWrap.clear();
        try {
            int i = byteBufferWrap.getInt();
            if (i <= 0 || i + 4 > bArr.length) {
                this.f23525b = null;
                return 0;
            }
            this.f23525b = new String(bArr, 4, i);
            return 0;
        } catch (Exception e) {
            e.printStackTrace();
            return -1;
        }
    }
}
