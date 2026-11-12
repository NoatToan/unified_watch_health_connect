package defpackage;

import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.CharacterCodingException;
import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;

/* JADX INFO: loaded from: classes4.dex */
public class qci {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CharsetDecoder f31372a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public byte[] f31373b = null;

    public qci(Charset charset) {
        this.f31372a = charset.newDecoder();
    }

    public String a(byte[] bArr, int i) {
        byte[] bArr2 = this.f31373b;
        if (bArr2 != null) {
            byte[] bArr3 = new byte[bArr2.length + i];
            System.arraycopy(bArr2, 0, bArr3, 0, bArr2.length);
            System.arraycopy(bArr, 0, bArr3, this.f31373b.length, i);
            i += this.f31373b.length;
            bArr = bArr3;
        }
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr, 0, i);
        boolean z = false;
        int i2 = 0;
        CharBuffer charBufferDecode = null;
        while (!z && i2 < 4) {
            try {
                charBufferDecode = this.f31372a.decode(byteBufferWrap);
                z = true;
            } catch (CharacterCodingException unused) {
                i2++;
                byteBufferWrap = ByteBuffer.wrap(bArr, 0, i - i2);
            }
        }
        if (!z || i2 <= 0) {
            this.f31373b = null;
        } else {
            byte[] bArr4 = new byte[i2];
            this.f31373b = bArr4;
            System.arraycopy(bArr, i - i2, bArr4, 0, i2);
        }
        if (z) {
            return new String(charBufferDecode.array(), 0, charBufferDecode.length());
        }
        cm8.C("ReactNative", "failed to decode string from byte array");
        return "";
    }
}
