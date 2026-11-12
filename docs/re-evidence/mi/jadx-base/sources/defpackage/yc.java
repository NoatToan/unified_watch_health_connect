package defpackage;

import com.xiaomi.smarthome.plugin.update.PluginPackageConstant;
import java.io.ByteArrayOutputStream;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import org.bouncycastle.asn1.ASN1ParsingException;

/* JADX INFO: loaded from: classes3.dex */
public abstract class yc extends re implements df {
    public static final char[] c = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte[] f40027a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f40028b;

    public yc(byte[] bArr, int i) {
        if (bArr == null) {
            throw new NullPointerException("data cannot be null");
        }
        if (bArr.length == 0 && i != 0) {
            throw new IllegalArgumentException("zero length data with non-zero pad bits");
        }
        if (i > 7 || i < 0) {
            throw new IllegalArgumentException("pad bits cannot be greater than 7 or less than 0");
        }
        this.f40027a = vj1.e(bArr);
        this.f40028b = i;
    }

    public static byte[] o(byte[] bArr, int i) {
        byte[] bArrE = vj1.e(bArr);
        if (i > 0) {
            int length = bArr.length - 1;
            bArrE[length] = (byte) ((255 << i) & bArrE[length]);
        }
        return bArrE;
    }

    public static yc q(int i, InputStream inputStream) throws IOException {
        if (i < 1) {
            throw new IllegalArgumentException("truncated BIT STRING detected");
        }
        int i2 = inputStream.read();
        int i3 = i - 1;
        byte[] bArr = new byte[i3];
        if (i3 != 0) {
            if (hjo.c(inputStream, bArr) != i3) {
                throw new EOFException("EOF encountered in middle of BIT STRING");
            }
            if (i2 > 0 && i2 < 8) {
                byte b2 = bArr[i - 2];
                if (b2 != ((byte) ((255 << i2) & b2))) {
                    return new hi5(bArr, i2);
                }
            }
        }
        return new xf5(bArr, i2);
    }

    @Override // defpackage.re
    public boolean g(re reVar) {
        if (!(reVar instanceof yc)) {
            return false;
        }
        yc ycVar = (yc) reVar;
        return this.f40028b == ycVar.f40028b && vj1.a(r(), ycVar.r());
    }

    @Override // defpackage.df
    public String getString() {
        StringBuffer stringBuffer = new StringBuffer(PluginPackageConstant.RN_SDK_TIMESTAMP_PREFIX);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            new ke(byteArrayOutputStream).j(this);
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            for (int i = 0; i != byteArray.length; i++) {
                char[] cArr = c;
                stringBuffer.append(cArr[(byteArray[i] >>> 4) & 15]);
                stringBuffer.append(cArr[byteArray[i] & 15]);
            }
            return stringBuffer.toString();
        } catch (IOException e) {
            throw new ASN1ParsingException("Internal error encoding BitString: " + e.getMessage(), e);
        }
    }

    @Override // defpackage.re, defpackage.de
    public int hashCode() {
        return this.f40028b ^ vj1.q(r());
    }

    @Override // defpackage.re
    public re l() {
        return new xf5(this.f40027a, this.f40028b);
    }

    @Override // defpackage.re
    public re m() {
        return new hi5(this.f40027a, this.f40028b);
    }

    public byte[] r() {
        return o(this.f40027a, this.f40028b);
    }

    public byte[] t() {
        if (this.f40028b == 0) {
            return vj1.e(this.f40027a);
        }
        throw new IllegalStateException("attempt to get non-octet aligned data from BIT STRING");
    }

    public String toString() {
        return getString();
    }

    public int u() {
        return this.f40028b;
    }
}
