package com.datatheorem.android.trustkit.pinning;

import io.netty.util.internal.StringUtil;
import javax.security.auth.x500.X500Principal;

/* JADX INFO: loaded from: classes2.dex */
final class b {
    private final String a;
    private final int b;
    private int c;
    private int d;
    private int e;
    private int f;
    private char[] g;

    public b(X500Principal x500Principal) {
        String name = x500Principal.getName("RFC2253");
        this.a = name;
        this.b = name.length();
    }

    private String a() {
        int i;
        int i2;
        int i3 = this.c;
        this.d = i3;
        this.e = i3;
        while (true) {
            int i4 = this.c;
            if (i4 >= this.b) {
                char[] cArr = this.g;
                int i5 = this.d;
                return new String(cArr, i5, this.e - i5);
            }
            char[] cArr2 = this.g;
            char c = cArr2[i4];
            if (c != ' ') {
                if (c != ';') {
                    if (c == '\\') {
                        int i6 = this.e;
                        this.e = i6 + 1;
                        cArr2[i6] = d();
                        this.c++;
                    } else if (c != '+' && c != ',') {
                        int i7 = this.e;
                        this.e = i7 + 1;
                        cArr2[i7] = cArr2[i4];
                        this.c = i4 + 1;
                    }
                }
                int i8 = this.d;
                return new String(cArr2, i8, this.e - i8);
            }
            int i9 = this.e;
            this.f = i9;
            this.c = i4 + 1;
            this.e = i9 + 1;
            cArr2[i9] = StringUtil.SPACE;
            while (true) {
                i = this.c;
                i2 = this.b;
                if (i >= i2) {
                    break;
                }
                char[] cArr3 = this.g;
                if (cArr3[i] != ' ') {
                    break;
                }
                int i10 = this.e;
                this.e = i10 + 1;
                cArr3[i10] = StringUtil.SPACE;
                this.c = i + 1;
            }
            if (i != i2) {
                char[] cArr4 = this.g;
                if (cArr4[i] == ',' || cArr4[i] == '+' || cArr4[i] == ';') {
                }
            }
            char[] cArr5 = this.g;
            int i11 = this.d;
            return new String(cArr5, i11, this.f - i11);
        }
    }

    private int c(int i) {
        int i2;
        int i3;
        int i4 = i + 1;
        if (i4 >= this.b) {
            throw new IllegalStateException("Malformed DN: " + this.a);
        }
        char[] cArr = this.g;
        char c = cArr[i];
        if (c >= '0' && c <= '9') {
            i2 = c - '0';
        } else if (c >= 'a' && c <= 'f') {
            i2 = c - 'W';
        } else {
            if (c < 'A' || c > 'F') {
                throw new IllegalStateException("Malformed DN: " + this.a);
            }
            i2 = c - '7';
        }
        char c2 = cArr[i4];
        if (c2 >= '0' && c2 <= '9') {
            i3 = c2 - '0';
        } else if (c2 >= 'a' && c2 <= 'f') {
            i3 = c2 - 'W';
        } else {
            if (c2 < 'A' || c2 > 'F') {
                throw new IllegalStateException("Malformed DN: " + this.a);
            }
            i3 = c2 - '7';
        }
        return (i2 << 4) + i3;
    }

    private char d() {
        int i = this.c + 1;
        this.c = i;
        if (i == this.b) {
            throw new IllegalStateException("Unexpected end of DN: " + this.a);
        }
        char[] cArr = this.g;
        char c = cArr[i];
        if (c != ' ' && c != '%' && c != '\\' && c != '_' && c != '\"' && c != '#') {
            switch (c) {
                case '*':
                case '+':
                case ',':
                    break;
                default:
                    switch (c) {
                        case ';':
                        case '<':
                        case '=':
                        case '>':
                            break;
                        default:
                            return e();
                    }
                    break;
            }
        }
        return cArr[i];
    }

    private char e() {
        int i;
        int i2;
        int iC = c(this.c);
        this.c++;
        if (iC < 128) {
            return (char) iC;
        }
        if (iC < 192 || iC > 247) {
            return '?';
        }
        if (iC <= 223) {
            i2 = iC & 31;
            i = 1;
        } else if (iC <= 239) {
            i = 2;
            i2 = iC & 15;
        } else {
            i = 3;
            i2 = iC & 7;
        }
        for (int i3 = 0; i3 < i; i3++) {
            int i4 = this.c + 1;
            this.c = i4;
            if (i4 == this.b || this.g[i4] != '\\') {
                return '?';
            }
            int i5 = i4 + 1;
            this.c = i5;
            int iC2 = c(i5);
            this.c++;
            if ((iC2 & 192) != 128) {
                return '?';
            }
            i2 = (i2 << 6) + (iC2 & 63);
        }
        return (char) i2;
    }

    private String f() {
        int i = this.c;
        if (i + 4 >= this.b) {
            throw new IllegalStateException("Unexpected end of DN: " + this.a);
        }
        this.d = i;
        this.c = i + 1;
        while (true) {
            int i2 = this.c;
            if (i2 != this.b) {
                char[] cArr = this.g;
                if (cArr[i2] != '+' && cArr[i2] != ',' && cArr[i2] != ';') {
                    if (cArr[i2] == ' ') {
                        this.e = i2;
                        this.c = i2 + 1;
                        while (true) {
                            int i3 = this.c;
                            if (i3 >= this.b || this.g[i3] != ' ') {
                                break;
                            }
                            this.c = i3 + 1;
                        }
                    } else {
                        if (cArr[i2] >= 'A' && cArr[i2] <= 'F') {
                            cArr[i2] = (char) (cArr[i2] + StringUtil.SPACE);
                        }
                        this.c = i2 + 1;
                    }
                }
            }
            this.e = i2;
            break;
        }
        int i4 = this.e;
        int i5 = this.d;
        int i6 = i4 - i5;
        if (i6 < 5 || (i6 & 1) == 0) {
            throw new IllegalStateException("Unexpected end of DN: " + this.a);
        }
        int i7 = i6 / 2;
        byte[] bArr = new byte[i7];
        int i8 = i5 + 1;
        for (int i9 = 0; i9 < i7; i9++) {
            bArr[i9] = (byte) c(i8);
            i8 += 2;
        }
        return new String(this.g, this.d, i6);
    }

    private String g() {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        while (true) {
            i = this.c;
            i2 = this.b;
            if (i >= i2 || this.g[i] != ' ') {
                break;
            }
            this.c = i + 1;
        }
        if (i == i2) {
            return null;
        }
        this.d = i;
        this.c = i + 1;
        while (true) {
            i3 = this.c;
            i4 = this.b;
            if (i3 >= i4) {
                break;
            }
            char[] cArr = this.g;
            if (cArr[i3] == '=' || cArr[i3] == ' ') {
                break;
            }
            this.c = i3 + 1;
        }
        if (i3 >= i4) {
            throw new IllegalStateException("Unexpected end of DN: " + this.a);
        }
        this.e = i3;
        if (this.g[i3] == ' ') {
            while (true) {
                i5 = this.c;
                i6 = this.b;
                if (i5 >= i6) {
                    break;
                }
                char[] cArr2 = this.g;
                if (cArr2[i5] == '=' || cArr2[i5] != ' ') {
                    break;
                }
                this.c = i5 + 1;
            }
            if (this.g[i5] != '=' || i5 == i6) {
                throw new IllegalStateException("Unexpected end of DN: " + this.a);
            }
        }
        this.c++;
        while (true) {
            int i7 = this.c;
            if (i7 >= this.b || this.g[i7] != ' ') {
                break;
            }
            this.c = i7 + 1;
        }
        int i8 = this.e;
        int i9 = this.d;
        if (i8 - i9 > 4) {
            char[] cArr3 = this.g;
            if (cArr3[i9 + 3] == '.' && ((cArr3[i9] == 'O' || cArr3[i9] == 'o') && ((cArr3[i9 + 1] == 'I' || cArr3[i9 + 1] == 'i') && (cArr3[i9 + 2] == 'D' || cArr3[i9 + 2] == 'd')))) {
                this.d = i9 + 4;
            }
        }
        char[] cArr4 = this.g;
        int i10 = this.d;
        return new String(cArr4, i10, i8 - i10);
    }

    private String h() {
        int i = this.c + 1;
        this.c = i;
        this.d = i;
        this.e = i;
        while (true) {
            int i2 = this.c;
            if (i2 == this.b) {
                throw new IllegalStateException("Unexpected end of DN: " + this.a);
            }
            char[] cArr = this.g;
            if (cArr[i2] == '\"') {
                this.c = i2 + 1;
                while (true) {
                    int i3 = this.c;
                    if (i3 >= this.b || this.g[i3] != ' ') {
                        break;
                    }
                    this.c = i3 + 1;
                }
                char[] cArr2 = this.g;
                int i4 = this.d;
                return new String(cArr2, i4, this.e - i4);
            }
            if (cArr[i2] == '\\') {
                cArr[this.e] = d();
            } else {
                cArr[this.e] = cArr[i2];
            }
            this.c++;
            this.e++;
        }
    }

    public String b(String str) {
        String strH;
        this.c = 0;
        this.d = 0;
        this.e = 0;
        this.f = 0;
        this.g = this.a.toCharArray();
        String strG = g();
        if (strG == null) {
            return null;
        }
        do {
            int i = this.c;
            if (i == this.b) {
                return null;
            }
            char c = this.g[i];
            if (c == '\"') {
                strH = h();
            } else if (c != '#') {
                strH = (c == '+' || c == ',' || c == ';') ? "" : a();
            } else {
                strH = f();
            }
            if (str.equalsIgnoreCase(strG)) {
                return strH;
            }
            int i2 = this.c;
            if (i2 >= this.b) {
                return null;
            }
            char[] cArr = this.g;
            if (cArr[i2] != ',' && cArr[i2] != ';' && cArr[i2] != '+') {
                throw new IllegalStateException("Malformed DN: " + this.a);
            }
            this.c = i2 + 1;
            strG = g();
        } while (strG != null);
        throw new IllegalStateException("Malformed DN: " + this.a);
    }
}
