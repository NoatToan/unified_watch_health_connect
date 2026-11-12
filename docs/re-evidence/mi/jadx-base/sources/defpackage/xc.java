package defpackage;

import com.xiaomi.smarthome.plugin.update.PluginPackageConstant;
import java.io.ByteArrayOutputStream;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import org.spongycastle.asn1.ASN1ParsingException;

/* JADX INFO: loaded from: classes3.dex */
public abstract class xc extends pe implements cf {
    public static final char[] c = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte[] f38958a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f38959b;

    public xc(byte[] bArr, int i) {
        if (bArr == null) {
            throw new NullPointerException("data cannot be null");
        }
        if (bArr.length == 0 && i != 0) {
            throw new IllegalArgumentException("zero length data with non-zero pad bits");
        }
        if (i > 7 || i < 0) {
            throw new IllegalArgumentException("pad bits cannot be greater than 7 or less than 0");
        }
        this.f38958a = wj1.d(bArr);
        this.f38959b = i;
    }

    public static byte[] o(byte[] bArr, int i) {
        byte[] bArrD = wj1.d(bArr);
        if (i > 0) {
            int length = bArr.length - 1;
            bArrD[length] = (byte) ((255 << i) & bArrD[length]);
        }
        return bArrD;
    }

    public static xc q(int i, InputStream inputStream) throws IOException {
        if (i < 1) {
            throw new IllegalArgumentException("truncated BIT STRING detected");
        }
        int i2 = inputStream.read();
        int i3 = i - 1;
        byte[] bArr = new byte[i3];
        if (i3 != 0) {
            if (gjo.c(inputStream, bArr) != i3) {
                throw new EOFException("EOF encountered in middle of BIT STRING");
            }
            if (i2 > 0 && i2 < 8) {
                byte b2 = bArr[i - 2];
                if (b2 != ((byte) ((255 << i2) & b2))) {
                    return new gi5(bArr, i2);
                }
            }
        }
        return new wf5(bArr, i2);
    }

    @Override // defpackage.pe
    public boolean g(pe peVar) {
        if (!(peVar instanceof xc)) {
            return false;
        }
        xc xcVar = (xc) peVar;
        return this.f38959b == xcVar.f38959b && wj1.a(r(), xcVar.r());
    }

    @Override // defpackage.cf
    public String getString() {
        StringBuffer stringBuffer = new StringBuffer(PluginPackageConstant.RN_SDK_TIMESTAMP_PREFIX);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            new oe(byteArrayOutputStream).j(this);
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

    @Override // defpackage.pe, defpackage.be
    public int hashCode() {
        return this.f38959b ^ wj1.k(r());
    }

    @Override // defpackage.pe
    public pe l() {
        return new wf5(this.f38958a, this.f38959b);
    }

    @Override // defpackage.pe
    public pe m() {
        return new gi5(this.f38958a, this.f38959b);
    }

    public byte[] r() {
        return o(this.f38958a, this.f38959b);
    }

    public byte[] t() {
        if (this.f38959b == 0) {
            return wj1.d(this.f38958a);
        }
        throw new IllegalStateException("attempt to get non-octet aligned data from BIT STRING");
    }

    public String toString() {
        return getString();
    }

    public int u() {
        return this.f38959b;
    }
}
