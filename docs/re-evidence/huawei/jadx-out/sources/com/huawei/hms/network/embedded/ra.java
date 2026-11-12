package com.huawei.hms.network.embedded;

import androidx.media3.extractor.ts.PsExtractor;
import javax.security.auth.x500.X500Principal;

/* JADX INFO: loaded from: classes34.dex */
public final class ra {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f15305a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f15306b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f15307c;
    public int d;
    public int e;
    public int f;
    public char[] g;

    public String a(String str) {
        String strF;
        this.f15307c = 0;
        this.d = 0;
        this.e = 0;
        this.f = 0;
        this.g = this.f15305a.toCharArray();
        String strE = e();
        if (strE == null) {
            return null;
        }
        do {
            int i = this.f15307c;
            if (i == this.f15306b) {
                return null;
            }
            char c2 = this.g[i];
            if (c2 == '\"') {
                strF = f();
            } else if (c2 != '#') {
                strF = (c2 == '+' || c2 == ',' || c2 == ';') ? "" : a();
            } else {
                strF = d();
            }
            if (str.equalsIgnoreCase(strE)) {
                return strF;
            }
            int i2 = this.f15307c;
            if (i2 >= this.f15306b) {
                return null;
            }
            char c3 = this.g[i2];
            if (c3 != ',' && c3 != ';' && c3 != '+') {
                throw new IllegalStateException("Malformed DN: " + this.f15305a);
            }
            this.f15307c = i2 + 1;
            strE = e();
        } while (strE != null);
        throw new IllegalStateException("Malformed DN: " + this.f15305a);
    }

    private String f() {
        int i = this.f15307c + 1;
        this.f15307c = i;
        this.d = i;
        while (true) {
            this.e = i;
            int i2 = this.f15307c;
            if (i2 == this.f15306b) {
                throw new IllegalStateException("Unexpected end of DN: " + this.f15305a);
            }
            char[] cArr = this.g;
            char c2 = cArr[i2];
            if (c2 == '\"') {
                do {
                    i2++;
                    this.f15307c = i2;
                    if (i2 >= this.f15306b) {
                        break;
                    }
                } while (this.g[i2] == ' ');
                char[] cArr2 = this.g;
                int i3 = this.d;
                return new String(cArr2, i3, this.e - i3);
            }
            if (c2 == '\\') {
                cArr[i] = b();
            } else {
                cArr[i] = c2;
            }
            this.f15307c++;
            i = this.e + 1;
        }
    }

    private String e() {
        int i;
        int i2;
        int i3;
        char c2;
        char c3;
        char c4;
        int i4;
        int i5;
        char c5;
        char c6;
        while (true) {
            i = this.f15307c;
            i2 = this.f15306b;
            if (i >= i2 || this.g[i] != ' ') {
                break;
            }
            this.f15307c = i + 1;
        }
        if (i == i2) {
            return null;
        }
        this.d = i;
        do {
            i++;
            this.f15307c = i;
            i3 = this.f15306b;
            if (i >= i3 || (c6 = this.g[i]) == '=') {
                break;
            }
        } while (c6 != ' ');
        if (i >= i3) {
            throw new IllegalStateException("Unexpected end of DN: " + this.f15305a);
        }
        this.e = i;
        if (this.g[i] == ' ') {
            while (true) {
                i4 = this.f15307c;
                i5 = this.f15306b;
                if (i4 >= i5 || (c5 = this.g[i4]) == '=' || c5 != ' ') {
                    break;
                }
                this.f15307c = i4 + 1;
            }
            if (this.g[i4] != '=' || i4 == i5) {
                throw new IllegalStateException("Unexpected end of DN: " + this.f15305a);
            }
        }
        int i6 = this.f15307c;
        do {
            i6++;
            this.f15307c = i6;
            if (i6 >= this.f15306b) {
                break;
            }
        } while (this.g[i6] == ' ');
        int i7 = this.e;
        int i8 = this.d;
        if (i7 - i8 > 4) {
            char[] cArr = this.g;
            if (cArr[i8 + 3] == '.' && (((c2 = cArr[i8]) == 'O' || c2 == 'o') && (((c3 = cArr[i8 + 1]) == 'I' || c3 == 'i') && ((c4 = cArr[i8 + 2]) == 'D' || c4 == 'd')))) {
                this.d = i8 + 4;
            }
        }
        char[] cArr2 = this.g;
        int i9 = this.d;
        return new String(cArr2, i9, i7 - i9);
    }

    private String d() {
        char[] cArr;
        char c2;
        int i = this.f15307c;
        if (i + 4 >= this.f15306b) {
            throw new IllegalStateException("Unexpected end of DN: " + this.f15305a);
        }
        this.d = i;
        while (true) {
            i++;
            this.f15307c = i;
            if (i == this.f15306b || (c2 = (cArr = this.g)[i]) == '+' || c2 == ',' || c2 == ';') {
                this.e = i;
                break;
            }
            if (c2 == ' ') {
                this.e = i;
                do {
                    i++;
                    this.f15307c = i;
                    if (i >= this.f15306b) {
                        break;
                    }
                } while (this.g[i] == ' ');
            } else if (c2 >= 'A' && c2 <= 'F') {
                cArr[i] = (char) (c2 + ' ');
            }
        }
        int i2 = this.e;
        int i3 = this.d;
        int i4 = i2 - i3;
        if (i4 < 5 || (i4 & 1) == 0) {
            throw new IllegalStateException("Unexpected end of DN: " + this.f15305a);
        }
        int i5 = i4 / 2;
        byte[] bArr = new byte[i5];
        int i6 = i3 + 1;
        for (int i7 = 0; i7 < i5; i7++) {
            bArr[i7] = (byte) a(i6);
            i6 += 2;
        }
        return new String(this.g, this.d, i4);
    }

    private char c() {
        int i;
        int i2;
        int iA = a(this.f15307c);
        this.f15307c++;
        if (iA < 128) {
            return (char) iA;
        }
        if (iA < 192 || iA > 247) {
            return '?';
        }
        if (iA <= 223) {
            i = iA & 31;
            i2 = 1;
        } else if (iA <= 239) {
            i = iA & 15;
            i2 = 2;
        } else {
            i = iA & 7;
            i2 = 3;
        }
        for (int i3 = 0; i3 < i2; i3++) {
            int i4 = this.f15307c;
            int i5 = i4 + 1;
            this.f15307c = i5;
            if (i5 == this.f15306b || this.g[i5] != '\\') {
                return '?';
            }
            int i6 = i4 + 2;
            this.f15307c = i6;
            int iA2 = a(i6);
            this.f15307c++;
            if ((iA2 & PsExtractor.AUDIO_STREAM) != 128) {
                return '?';
            }
            i = (i << 6) + (iA2 & 63);
        }
        return (char) i;
    }

    private char b() {
        int i = this.f15307c + 1;
        this.f15307c = i;
        if (i == this.f15306b) {
            throw new IllegalStateException("Unexpected end of DN: " + this.f15305a);
        }
        char c2 = this.g[i];
        if (c2 == ' ' || c2 == '%' || c2 == '\\' || c2 == '_' || c2 == '\"' || c2 == '#') {
            return c2;
        }
        switch (c2) {
            case '*':
            case '+':
            case ',':
                return c2;
            default:
                switch (c2) {
                    case ';':
                    case '<':
                    case '=':
                    case '>':
                        return c2;
                    default:
                        return c();
                }
        }
    }

    private String a() {
        int i;
        int i2;
        char c2;
        int i3 = this.f15307c;
        this.d = i3;
        this.e = i3;
        while (true) {
            int i4 = this.f15307c;
            if (i4 >= this.f15306b) {
                char[] cArr = this.g;
                int i5 = this.d;
                return new String(cArr, i5, this.e - i5);
            }
            char[] cArr2 = this.g;
            char c3 = cArr2[i4];
            if (c3 != ' ') {
                if (c3 != ';') {
                    if (c3 == '\\') {
                        int i6 = this.e;
                        this.e = i6 + 1;
                        cArr2[i6] = b();
                        i4 = this.f15307c;
                    } else if (c3 != '+' && c3 != ',') {
                        int i7 = this.e;
                        this.e = i7 + 1;
                        cArr2[i7] = c3;
                    }
                    this.f15307c = i4 + 1;
                }
                int i8 = this.d;
                return new String(cArr2, i8, this.e - i8);
            }
            int i9 = this.e;
            this.f = i9;
            this.f15307c = i4 + 1;
            this.e = i9 + 1;
            cArr2[i9] = ' ';
            while (true) {
                i = this.f15307c;
                i2 = this.f15306b;
                if (i >= i2) {
                    break;
                }
                char[] cArr3 = this.g;
                if (cArr3[i] != ' ') {
                    break;
                }
                int i10 = this.e;
                this.e = i10 + 1;
                cArr3[i10] = ' ';
                this.f15307c = i + 1;
            }
            if (i == i2 || (c2 = this.g[i]) == ',' || c2 == '+' || c2 == ';') {
                char[] cArr4 = this.g;
                int i11 = this.d;
                return new String(cArr4, i11, this.f - i11);
            }
        }
    }

    private int a(int i) {
        int i2;
        int i3;
        int i4 = i + 1;
        if (i4 >= this.f15306b) {
            throw new IllegalStateException("Malformed DN: " + this.f15305a);
        }
        char[] cArr = this.g;
        char c2 = cArr[i];
        if (c2 >= '0' && c2 <= '9') {
            i2 = c2 - '0';
        } else if (c2 >= 'a' && c2 <= 'f') {
            i2 = c2 - 'W';
        } else {
            if (c2 < 'A' || c2 > 'F') {
                throw new IllegalStateException("Malformed DN: " + this.f15305a);
            }
            i2 = c2 - '7';
        }
        char c3 = cArr[i4];
        if (c3 >= '0' && c3 <= '9') {
            i3 = c3 - '0';
        } else if (c3 >= 'a' && c3 <= 'f') {
            i3 = c3 - 'W';
        } else {
            if (c3 < 'A' || c3 > 'F') {
                throw new IllegalStateException("Malformed DN: " + this.f15305a);
            }
            i3 = c3 - '7';
        }
        return (i2 << 4) + i3;
    }

    public ra(X500Principal x500Principal) {
        String name = x500Principal.getName("RFC2253");
        this.f15305a = name;
        this.f15306b = name.length();
    }
}
