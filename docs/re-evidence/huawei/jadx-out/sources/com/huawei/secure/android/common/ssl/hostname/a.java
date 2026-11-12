package com.huawei.secure.android.common.ssl.hostname;

import androidx.media3.extractor.ts.PsExtractor;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import javax.security.auth.x500.X500Principal;

/* JADX INFO: loaded from: classes3.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f22893a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f22894b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f22895c;
    private int d;
    private int e;
    private int f;
    private char[] g;

    public a(X500Principal x500Principal) {
        String name = x500Principal.getName("RFC2253");
        this.f22893a = name;
        this.f22894b = name.length();
    }

    private String a() {
        int i;
        int i2;
        char c2;
        int i3 = this.f22895c;
        this.d = i3;
        this.e = i3;
        while (true) {
            int i4 = this.f22895c;
            if (i4 >= this.f22894b) {
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
                        this.f22895c++;
                    } else if (c3 != '+' && c3 != ',') {
                        int i7 = this.e;
                        this.e = i7 + 1;
                        cArr2[i7] = c3;
                        this.f22895c = i4 + 1;
                    }
                }
                int i8 = this.d;
                return new String(cArr2, i8, this.e - i8);
            }
            int i9 = this.e;
            this.f = i9;
            this.f22895c = i4 + 1;
            this.e = i9 + 1;
            cArr2[i9] = ' ';
            while (true) {
                i = this.f22895c;
                i2 = this.f22894b;
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
                this.f22895c = i + 1;
            }
            if (i == i2 || (c2 = this.g[i]) == ',' || c2 == '+' || c2 == ';') {
                char[] cArr4 = this.g;
                int i11 = this.d;
                return new String(cArr4, i11, this.f - i11);
            }
        }
    }

    private char b() {
        int i = this.f22895c + 1;
        this.f22895c = i;
        if (i == this.f22894b) {
            throw new IllegalStateException("Unexpected end of DN: " + this.f22893a);
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

    private char c() {
        int i;
        int i2;
        int iA = a(this.f22895c);
        this.f22895c++;
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
            int i4 = this.f22895c;
            int i5 = i4 + 1;
            this.f22895c = i5;
            if (i5 == this.f22894b || this.g[i5] != '\\') {
                return '?';
            }
            int i6 = i4 + 2;
            this.f22895c = i6;
            int iA2 = a(i6);
            this.f22895c++;
            if ((iA2 & PsExtractor.AUDIO_STREAM) != 128) {
                return '?';
            }
            i = (i << 6) + (iA2 & 63);
        }
        return (char) i;
    }

    private String d() {
        char[] cArr;
        char c2;
        int i = this.f22895c;
        if (i + 4 >= this.f22894b) {
            throw new IllegalStateException("Unexpected end of DN: " + this.f22893a);
        }
        this.d = i;
        this.f22895c = i + 1;
        while (true) {
            int i2 = this.f22895c;
            if (i2 == this.f22894b || (c2 = (cArr = this.g)[i2]) == '+' || c2 == ',' || c2 == ';') {
                this.e = i2;
                break;
            }
            if (c2 == ' ') {
                this.e = i2;
                this.f22895c = i2 + 1;
                while (true) {
                    int i3 = this.f22895c;
                    if (i3 >= this.f22894b || this.g[i3] != ' ') {
                        break;
                    }
                    this.f22895c = i3 + 1;
                }
            } else {
                if (c2 >= 'A' && c2 <= 'F') {
                    cArr[i2] = (char) (c2 + ' ');
                }
                this.f22895c = i2 + 1;
            }
        }
        int i4 = this.e;
        int i5 = this.d;
        int i6 = i4 - i5;
        if (i6 < 5 || (i6 & 1) == 0) {
            throw new IllegalStateException("Unexpected end of DN: " + this.f22893a);
        }
        int i7 = i6 / 2;
        byte[] bArr = new byte[i7];
        int i8 = i5 + 1;
        for (int i9 = 0; i9 < i7; i9++) {
            bArr[i9] = (byte) a(i8);
            i8 += 2;
        }
        return new String(this.g, this.d, i6);
    }

    private String e() {
        int i;
        int i2;
        int i3;
        int i4;
        char c2;
        char c3;
        char c4;
        int i5;
        int i6;
        char c5;
        char c6;
        while (true) {
            i = this.f22895c;
            i2 = this.f22894b;
            if (i >= i2 || this.g[i] != ' ') {
                break;
            }
            this.f22895c = i + 1;
        }
        if (i == i2) {
            return null;
        }
        this.d = i;
        this.f22895c = i + 1;
        while (true) {
            i3 = this.f22895c;
            i4 = this.f22894b;
            if (i3 >= i4 || (c6 = this.g[i3]) == '=' || c6 == ' ') {
                break;
            }
            this.f22895c = i3 + 1;
        }
        if (i3 >= i4) {
            throw new IllegalStateException("Unexpected end of DN: " + this.f22893a);
        }
        this.e = i3;
        if (this.g[i3] == ' ') {
            while (true) {
                i5 = this.f22895c;
                i6 = this.f22894b;
                if (i5 >= i6 || (c5 = this.g[i5]) == '=' || c5 != ' ') {
                    break;
                }
                this.f22895c = i5 + 1;
            }
            if (this.g[i5] != '=' || i5 == i6) {
                throw new IllegalStateException("Unexpected end of DN: " + this.f22893a);
            }
        }
        this.f22895c++;
        while (true) {
            int i7 = this.f22895c;
            if (i7 >= this.f22894b || this.g[i7] != ' ') {
                break;
            }
            this.f22895c = i7 + 1;
        }
        int i8 = this.e;
        int i9 = this.d;
        if (i8 - i9 > 4) {
            char[] cArr = this.g;
            if (cArr[i9 + 3] == '.' && (((c2 = cArr[i9]) == 'O' || c2 == 'o') && (((c3 = cArr[i9 + 1]) == 'I' || c3 == 'i') && ((c4 = cArr[i9 + 2]) == 'D' || c4 == 'd')))) {
                this.d = i9 + 4;
            }
        }
        char[] cArr2 = this.g;
        int i10 = this.d;
        return new String(cArr2, i10, i8 - i10);
    }

    private String f() {
        int i = this.f22895c + 1;
        this.f22895c = i;
        this.d = i;
        this.e = i;
        while (true) {
            int i2 = this.f22895c;
            if (i2 == this.f22894b) {
                throw new IllegalStateException("Unexpected end of DN: " + this.f22893a);
            }
            char[] cArr = this.g;
            char c2 = cArr[i2];
            if (c2 == '\"') {
                this.f22895c = i2 + 1;
                while (true) {
                    int i3 = this.f22895c;
                    if (i3 >= this.f22894b || this.g[i3] != ' ') {
                        break;
                    }
                    this.f22895c = i3 + 1;
                }
                char[] cArr2 = this.g;
                int i4 = this.d;
                return new String(cArr2, i4, this.e - i4);
            }
            if (c2 == '\\') {
                cArr[this.e] = b();
            } else {
                cArr[this.e] = c2;
            }
            this.f22895c++;
            this.e++;
        }
    }

    public List<String> b(String str) {
        String strF;
        this.f22895c = 0;
        this.d = 0;
        this.e = 0;
        this.f = 0;
        this.g = this.f22893a.toCharArray();
        List<String> arrayList = Collections.EMPTY_LIST;
        String strE = e();
        if (strE == null) {
            return arrayList;
        }
        do {
            int i = this.f22895c;
            if (i >= this.f22894b) {
                return arrayList;
            }
            char c2 = this.g[i];
            if (c2 == '\"') {
                strF = f();
            } else if (c2 == '#') {
                strF = d();
            } else if (c2 != '+' && c2 != ',' && c2 != ';') {
                strF = a();
            } else {
                strF = "";
            }
            if (str.equalsIgnoreCase(strE)) {
                if (arrayList.isEmpty()) {
                    arrayList = new ArrayList<>();
                }
                arrayList.add(strF);
            }
            int i2 = this.f22895c;
            if (i2 >= this.f22894b) {
                return arrayList;
            }
            char c3 = this.g[i2];
            if (c3 != ',' && c3 != ';' && c3 != '+') {
                throw new IllegalStateException("Malformed DN: " + this.f22893a);
            }
            this.f22895c = i2 + 1;
            strE = e();
        } while (strE != null);
        throw new IllegalStateException("Malformed DN: " + this.f22893a);
    }

    private int a(int i) {
        int i2;
        int i3;
        int i4 = i + 1;
        if (i4 < this.f22894b) {
            char[] cArr = this.g;
            char c2 = cArr[i];
            if (c2 >= '0' && c2 <= '9') {
                i2 = c2 - '0';
            } else if (c2 >= 'a' && c2 <= 'f') {
                i2 = c2 - 'W';
            } else {
                if (c2 < 'A' || c2 > 'F') {
                    throw new IllegalStateException("Malformed DN: " + this.f22893a);
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
                    throw new IllegalStateException("Malformed DN: " + this.f22893a);
                }
                i3 = c3 - '7';
            }
            return (i2 << 4) + i3;
        }
        throw new IllegalStateException("Malformed DN: " + this.f22893a);
    }

    public String a(String str) {
        String strF;
        this.f22895c = 0;
        this.d = 0;
        this.e = 0;
        this.f = 0;
        this.g = this.f22893a.toCharArray();
        String strE = e();
        if (strE == null) {
            return null;
        }
        do {
            int i = this.f22895c;
            if (i == this.f22894b) {
                return null;
            }
            char c2 = this.g[i];
            if (c2 == '\"') {
                strF = f();
            } else if (c2 == '#') {
                strF = d();
            } else if (c2 != '+' && c2 != ',' && c2 != ';') {
                strF = a();
            } else {
                strF = "";
            }
            if (str.equalsIgnoreCase(strE)) {
                return strF;
            }
            int i2 = this.f22895c;
            if (i2 >= this.f22894b) {
                return null;
            }
            char c3 = this.g[i2];
            if (c3 != ',' && c3 != ';' && c3 != '+') {
                throw new IllegalStateException("Malformed DN: " + this.f22893a);
            }
            this.f22895c = i2 + 1;
            strE = e();
        } while (strE != null);
        throw new IllegalStateException("Malformed DN: " + this.f22893a);
    }
}
