package com.fasterxml.jackson.core;

import com.huawei.operation.utils.Constants;
import defpackage.wm;
import defpackage.xx;
import java.io.Serializable;
import java.util.Arrays;
import org.apache.commons.io.IOUtils;

/* JADX INFO: loaded from: classes21.dex */
public final class Base64Variant implements Serializable {
    private static final long serialVersionUID = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final transient char[] f4070a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final transient byte[] f4071b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f4072c;
    public final String d;
    private final transient int[] e;
    private final boolean f;
    private final char i;
    private final PaddingReadBehaviour j;

    public enum PaddingReadBehaviour {
        PADDING_FORBIDDEN,
        PADDING_REQUIRED,
        PADDING_ALLOWED
    }

    public Base64Variant(String str, String str2, boolean z, char c2, int i) {
        int[] iArr = new int[128];
        this.e = iArr;
        char[] cArr = new char[64];
        this.f4070a = cArr;
        this.f4071b = new byte[64];
        this.d = str;
        this.f = z;
        this.i = c2;
        this.f4072c = i;
        int length = str2.length();
        if (length != 64) {
            throw new IllegalArgumentException("Base64Alphabet length must be exactly 64 (was " + length + Constants.RIGHT_BRACKET_ONLY);
        }
        str2.getChars(0, length, cArr, 0);
        Arrays.fill(iArr, -1);
        for (int i2 = 0; i2 < length; i2++) {
            char c3 = this.f4070a[i2];
            this.f4071b[i2] = (byte) c3;
            this.e[c3] = i2;
        }
        if (z) {
            this.e[c2] = -2;
        }
        this.j = z ? PaddingReadBehaviour.PADDING_REQUIRED : PaddingReadBehaviour.PADDING_FORBIDDEN;
    }

    public Base64Variant(Base64Variant base64Variant, String str, int i) {
        this(base64Variant, str, base64Variant.f, base64Variant.i, i);
    }

    public Base64Variant(Base64Variant base64Variant, String str, boolean z, char c2, int i) {
        this(base64Variant, str, z, c2, base64Variant.j, i);
    }

    private Base64Variant(Base64Variant base64Variant, String str, boolean z, char c2, PaddingReadBehaviour paddingReadBehaviour, int i) {
        int[] iArr = new int[128];
        this.e = iArr;
        char[] cArr = new char[64];
        this.f4070a = cArr;
        byte[] bArr = new byte[64];
        this.f4071b = bArr;
        this.d = str;
        byte[] bArr2 = base64Variant.f4071b;
        System.arraycopy(bArr2, 0, bArr, 0, bArr2.length);
        char[] cArr2 = base64Variant.f4070a;
        System.arraycopy(cArr2, 0, cArr, 0, cArr2.length);
        int[] iArr2 = base64Variant.e;
        System.arraycopy(iArr2, 0, iArr, 0, iArr2.length);
        this.f = z;
        this.i = c2;
        this.f4072c = i;
        this.j = paddingReadBehaviour;
    }

    protected Object readResolve() {
        Base64Variant base64VariantC = wm.c(this.d);
        boolean z = this.f;
        boolean z2 = base64VariantC.f;
        return (z == z2 && this.i == base64VariantC.i && this.j == base64VariantC.j && this.f4072c == base64VariantC.f4072c && z == z2) ? base64VariantC : new Base64Variant(base64VariantC, this.d, z, this.i, this.j, this.f4072c);
    }

    public String b() {
        return this.d;
    }

    public boolean h() {
        return this.f;
    }

    public boolean f() {
        return this.j == PaddingReadBehaviour.PADDING_REQUIRED;
    }

    public boolean e() {
        return this.j != PaddingReadBehaviour.PADDING_FORBIDDEN;
    }

    public boolean b(char c2) {
        return c2 == this.i;
    }

    public boolean b(int i) {
        return i == this.i;
    }

    public char j() {
        return this.i;
    }

    public int a() {
        return this.f4072c;
    }

    public int c(char c2) {
        if (c2 <= 127) {
            return this.e[c2];
        }
        return -1;
    }

    public int d(int i) {
        if (i <= 127) {
            return this.e[i];
        }
        return -1;
    }

    public int d(int i, char[] cArr, int i2) {
        char[] cArr2 = this.f4070a;
        cArr[i2] = cArr2[(i >> 18) & 63];
        cArr[i2 + 1] = cArr2[(i >> 12) & 63];
        cArr[i2 + 2] = cArr2[(i >> 6) & 63];
        cArr[i2 + 3] = cArr2[i & 63];
        return i2 + 4;
    }

    public void e(StringBuilder sb, int i) {
        sb.append(this.f4070a[(i >> 18) & 63]);
        sb.append(this.f4070a[(i >> 12) & 63]);
        sb.append(this.f4070a[(i >> 6) & 63]);
        sb.append(this.f4070a[i & 63]);
    }

    public int b(int i, int i2, char[] cArr, int i3) {
        char[] cArr2 = this.f4070a;
        cArr[i3] = cArr2[(i >> 18) & 63];
        int i4 = i3 + 2;
        cArr[i3 + 1] = cArr2[(i >> 12) & 63];
        if (h()) {
            cArr[i4] = i2 == 2 ? this.f4070a[(i >> 6) & 63] : this.i;
            cArr[i3 + 3] = this.i;
            return i3 + 4;
        }
        if (i2 != 2) {
            return i4;
        }
        cArr[i4] = this.f4070a[(i >> 6) & 63];
        return i3 + 3;
    }

    public void b(StringBuilder sb, int i, int i2) {
        sb.append(this.f4070a[(i >> 18) & 63]);
        sb.append(this.f4070a[(i >> 12) & 63]);
        if (h()) {
            sb.append(i2 == 2 ? this.f4070a[(i >> 6) & 63] : this.i);
            sb.append(this.i);
        } else if (i2 == 2) {
            sb.append(this.f4070a[(i >> 6) & 63]);
        }
    }

    public int c(int i, byte[] bArr, int i2) {
        byte[] bArr2 = this.f4071b;
        bArr[i2] = bArr2[(i >> 18) & 63];
        bArr[i2 + 1] = bArr2[(i >> 12) & 63];
        bArr[i2 + 2] = bArr2[(i >> 6) & 63];
        bArr[i2 + 3] = bArr2[i & 63];
        return i2 + 4;
    }

    public int d(int i, int i2, byte[] bArr, int i3) {
        byte[] bArr2 = this.f4071b;
        bArr[i3] = bArr2[(i >> 18) & 63];
        int i4 = i3 + 2;
        bArr[i3 + 1] = bArr2[(i >> 12) & 63];
        if (h()) {
            byte b2 = (byte) this.i;
            bArr[i4] = i2 == 2 ? this.f4071b[(i >> 6) & 63] : b2;
            bArr[i3 + 3] = b2;
            return i3 + 4;
        }
        if (i2 != 2) {
            return i4;
        }
        bArr[i4] = this.f4071b[(i >> 6) & 63];
        return i3 + 3;
    }

    public String d(byte[] bArr) {
        return e(bArr, false);
    }

    public String e(byte[] bArr, boolean z) {
        int length = bArr.length;
        StringBuilder sb = new StringBuilder((length >> 2) + length + (length >> 3));
        if (z) {
            sb.append('\"');
        }
        int iA = a() >> 2;
        int i = 0;
        while (i <= length - 3) {
            byte b2 = bArr[i];
            byte b3 = bArr[i + 1];
            int i2 = i + 3;
            e(sb, (bArr[i + 2] & 255) | (((b2 << 8) | (b3 & 255)) << 8));
            iA--;
            if (iA <= 0) {
                sb.append(IOUtils.DIR_SEPARATOR_WINDOWS);
                sb.append('n');
                iA = a() >> 2;
            }
            i = i2;
        }
        int i3 = length - i;
        if (i3 > 0) {
            int i4 = bArr[i] << 16;
            if (i3 == 2) {
                i4 |= (bArr[i + 1] & 255) << 8;
            }
            b(sb, i4, i3);
        }
        if (z) {
            sb.append('\"');
        }
        return sb.toString();
    }

    public byte[] b(String str) throws IllegalArgumentException {
        xx xxVar = new xx();
        b(str, xxVar);
        return xxVar.i();
    }

    public void b(String str, xx xxVar) throws IllegalArgumentException {
        int length = str.length();
        int i = 0;
        while (i < length) {
            int i2 = i + 1;
            char cCharAt = str.charAt(i);
            if (cCharAt > ' ') {
                int iC = c(cCharAt);
                if (iC < 0) {
                    d(cCharAt, 0, (String) null);
                }
                if (i2 >= length) {
                    c();
                }
                int i3 = i + 2;
                char cCharAt2 = str.charAt(i2);
                int iC2 = c(cCharAt2);
                if (iC2 < 0) {
                    d(cCharAt2, 1, (String) null);
                }
                int i4 = (iC << 6) | iC2;
                if (i3 >= length) {
                    if (!f()) {
                        xxVar.c(i4 >> 4);
                        return;
                    }
                    c();
                }
                int i5 = i + 3;
                char cCharAt3 = str.charAt(i3);
                int iC3 = c(cCharAt3);
                if (iC3 < 0) {
                    if (iC3 != -2) {
                        d(cCharAt3, 2, (String) null);
                    }
                    if (!e()) {
                        d();
                    }
                    if (i5 >= length) {
                        c();
                    }
                    i += 4;
                    char cCharAt4 = str.charAt(i5);
                    if (!b(cCharAt4)) {
                        d(cCharAt4, 3, "expected padding character '" + j() + "'");
                    }
                    xxVar.c(i4 >> 4);
                } else {
                    int i6 = (i4 << 6) | iC3;
                    if (i5 >= length) {
                        if (!f()) {
                            xxVar.e(i6 >> 2);
                            return;
                        }
                        c();
                    }
                    i += 4;
                    char cCharAt5 = str.charAt(i5);
                    int iC4 = c(cCharAt5);
                    if (iC4 < 0) {
                        if (iC4 != -2) {
                            d(cCharAt5, 3, (String) null);
                        }
                        if (!e()) {
                            d();
                        }
                        xxVar.e(i6 >> 2);
                    } else {
                        xxVar.d((i6 << 6) | iC4);
                    }
                }
            } else {
                i = i2;
            }
        }
    }

    public String toString() {
        return this.d;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || obj.getClass() != getClass()) {
            return false;
        }
        Base64Variant base64Variant = (Base64Variant) obj;
        return base64Variant.i == this.i && base64Variant.f4072c == this.f4072c && base64Variant.f == this.f && base64Variant.j == this.j && this.d.equals(base64Variant.d);
    }

    public int hashCode() {
        return this.d.hashCode();
    }

    protected void d(char c2, int i, String str) throws IllegalArgumentException {
        String str2;
        if (c2 <= ' ') {
            str2 = "Illegal white space character (code 0x" + Integer.toHexString(c2) + ") as character #" + (i + 1) + " of 4-char base64 unit: can only used between units";
        } else if (b(c2)) {
            str2 = "Unexpected padding character ('" + j() + "') as character #" + (i + 1) + " of 4-char base64 unit: padding only legal as 3rd or 4th character";
        } else if (!Character.isDefined(c2) || Character.isISOControl(c2)) {
            str2 = "Illegal character (code 0x" + Integer.toHexString(c2) + ") in base64 content";
        } else {
            str2 = "Illegal character '" + c2 + "' (code 0x" + Integer.toHexString(c2) + ") in base64 content";
        }
        if (str != null) {
            str2 = str2 + ": " + str;
        }
        throw new IllegalArgumentException(str2);
    }

    protected void c() throws IllegalArgumentException {
        throw new IllegalArgumentException(g());
    }

    protected void d() throws IllegalArgumentException {
        throw new IllegalArgumentException(i());
    }

    protected String i() {
        return String.format("Unexpected end of base64-encoded String: base64 variant '%s' expects no padding at the end while decoding. This Base64Variant might have been incorrectly configured", b());
    }

    public String g() {
        return String.format("Unexpected end of base64-encoded String: base64 variant '%s' expects padding (one or more '%c' characters) at the end. This Base64Variant might have been incorrectly configured", b(), Character.valueOf(j()));
    }
}
