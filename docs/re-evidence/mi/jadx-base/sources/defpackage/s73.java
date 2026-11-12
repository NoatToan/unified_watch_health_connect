package defpackage;

import com.fasterxml.jackson.core.JsonEncoding;
import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.format.MatchStrength;
import java.io.ByteArrayInputStream;
import java.io.CharConversionException;
import java.io.DataInput;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

/* JADX INFO: loaded from: classes4.dex */
public final class s73 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xuc f33362a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final InputStream f33363b;
    public final byte[] c;
    public int d;
    public int e;
    public final boolean f;
    public boolean g;
    public int h;

    public s73(xuc xucVar, InputStream inputStream) {
        this.g = true;
        this.f33362a = xucVar;
        this.f33363b = inputStream;
        this.c = xucVar.g();
        this.d = 0;
        this.e = 0;
        this.f = true;
    }

    public static MatchStrength h(rad radVar) throws IOException {
        if (!radVar.a()) {
            return MatchStrength.INCONCLUSIVE;
        }
        byte bNextByte = radVar.nextByte();
        if (bNextByte == -17) {
            if (!radVar.a()) {
                return MatchStrength.INCONCLUSIVE;
            }
            if (radVar.nextByte() != -69) {
                return MatchStrength.NO_MATCH;
            }
            if (!radVar.a()) {
                return MatchStrength.INCONCLUSIVE;
            }
            if (radVar.nextByte() != -65) {
                return MatchStrength.NO_MATCH;
            }
            if (!radVar.a()) {
                return MatchStrength.INCONCLUSIVE;
            }
            bNextByte = radVar.nextByte();
        }
        int iK = k(radVar, bNextByte);
        if (iK < 0) {
            return MatchStrength.INCONCLUSIVE;
        }
        if (iK == 123) {
            int iJ = j(radVar);
            if (iJ < 0) {
                return MatchStrength.INCONCLUSIVE;
            }
            return (iJ == 34 || iJ == 125) ? MatchStrength.SOLID_MATCH : MatchStrength.NO_MATCH;
        }
        if (iK == 91) {
            int iJ2 = j(radVar);
            if (iJ2 < 0) {
                return MatchStrength.INCONCLUSIVE;
            }
            return (iJ2 == 93 || iJ2 == 91) ? MatchStrength.SOLID_MATCH : MatchStrength.SOLID_MATCH;
        }
        MatchStrength matchStrength = MatchStrength.WEAK_MATCH;
        if (iK == 34) {
            return matchStrength;
        }
        if (iK <= 57 && iK >= 48) {
            return matchStrength;
        }
        if (iK == 45) {
            int iJ3 = j(radVar);
            if (iJ3 < 0) {
                return MatchStrength.INCONCLUSIVE;
            }
            return (iJ3 > 57 || iJ3 < 48) ? MatchStrength.NO_MATCH : matchStrength;
        }
        if (iK == 110) {
            return m(radVar, "ull", matchStrength);
        }
        if (iK == 116) {
            return m(radVar, "rue", matchStrength);
        }
        return iK == 102 ? m(radVar, "alse", matchStrength) : MatchStrength.NO_MATCH;
    }

    public static int j(rad radVar) throws IOException {
        if (radVar.a()) {
            return k(radVar, radVar.nextByte());
        }
        return -1;
    }

    public static int k(rad radVar, byte b2) throws IOException {
        while (true) {
            int i = b2 & 255;
            if (i != 32 && i != 13 && i != 10 && i != 9) {
                return i;
            }
            if (!radVar.a()) {
                return -1;
            }
            b2 = radVar.nextByte();
        }
    }

    public static int l(DataInput dataInput) throws IOException {
        int unsignedByte = dataInput.readUnsignedByte();
        if (unsignedByte != 239) {
            return unsignedByte;
        }
        int unsignedByte2 = dataInput.readUnsignedByte();
        if (unsignedByte2 != 187) {
            throw new IOException("Unexpected byte 0x" + Integer.toHexString(unsignedByte2) + " following 0xEF; should get 0xBB as part of UTF-8 BOM");
        }
        int unsignedByte3 = dataInput.readUnsignedByte();
        if (unsignedByte3 == 191) {
            return dataInput.readUnsignedByte();
        }
        throw new IOException("Unexpected byte 0x" + Integer.toHexString(unsignedByte3) + " following 0xEF 0xBB; should get 0xBF as part of UTF-8 BOM");
    }

    public static MatchStrength m(rad radVar, String str, MatchStrength matchStrength) throws IOException {
        int length = str.length();
        for (int i = 0; i < length; i++) {
            if (!radVar.a()) {
                return MatchStrength.INCONCLUSIVE;
            }
            if (radVar.nextByte() != str.charAt(i)) {
                return MatchStrength.NO_MATCH;
            }
        }
        return matchStrength;
    }

    public final boolean a(int i) {
        if ((65280 & i) == 0) {
            this.g = true;
        } else {
            if ((i & 255) != 0) {
                return false;
            }
            this.g = false;
        }
        this.h = 2;
        return true;
    }

    public final boolean b(int i) throws IOException {
        if ((i >> 8) == 0) {
            this.g = true;
        } else if ((16777215 & i) == 0) {
            this.g = false;
        } else if (((-16711681) & i) == 0) {
            i("3412");
        } else {
            if ((i & (-65281)) != 0) {
                return false;
            }
            i("2143");
        }
        this.h = 4;
        return true;
    }

    public JsonParser c(int i, v3h v3hVar, r73 r73Var, zt3 zt3Var, int i2) throws IOException {
        if (e() != JsonEncoding.UTF8 || !JsonFactory.Feature.CANONICALIZE_FIELD_NAMES.enabledIn(i2)) {
            return new tgj(this.f33362a, i, d(), v3hVar, zt3Var.q(i2));
        }
        return new i8q(this.f33362a, i, this.f33363b, v3hVar, r73Var.G(i2), this.c, this.d, this.e, this.f);
    }

    public Reader d() throws IOException {
        JsonEncoding jsonEncodingL = this.f33362a.l();
        int iBits = jsonEncodingL.bits();
        if (iBits != 8 && iBits != 16) {
            if (iBits != 32) {
                throw new RuntimeException("Internal error");
            }
            xuc xucVar = this.f33362a;
            return new f8q(xucVar, this.f33363b, this.c, this.d, this.e, xucVar.l().isBigEndian());
        }
        InputStream vqfVar = this.f33363b;
        if (vqfVar == null) {
            vqfVar = new ByteArrayInputStream(this.c, this.d, this.e);
        } else if (this.d < this.e) {
            vqfVar = new vqf(this.f33362a, vqfVar, this.c, this.d, this.e);
        }
        return new InputStreamReader(vqfVar, jsonEncodingL.getJavaName());
    }

    /* JADX WARN: Code duplicated, block: B:17:0x005d  */
    /* JADX WARN: Code duplicated, block: B:19:0x0061 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:20:0x0063 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:21:0x0065  */
    /* JADX WARN: Code duplicated, block: B:23:0x0069  */
    /* JADX WARN: Code duplicated, block: B:24:0x006c  */
    /* JADX WARN: Code duplicated, block: B:25:0x006f  */
    /* JADX WARN: Code duplicated, block: B:27:0x0077  */
    /* JADX WARN: Code duplicated, block: B:29:0x007b  */
    /* JADX WARN: Code duplicated, block: B:30:0x007e  */
    /* JADX WARN: Code duplicated, block: B:31:0x0081  */
    public JsonEncoding e() throws IOException {
        int i;
        JsonEncoding jsonEncoding;
        if (f(4)) {
            byte[] bArr = this.c;
            int i2 = this.d;
            int i3 = (bArr[i2 + 3] & 255) | (bArr[i2] << 24) | ((bArr[i2 + 1] & 255) << 16) | ((bArr[i2 + 2] & 255) << 8);
            if (g(i3) || b(i3) || a(i3 >>> 16)) {
                i = this.h;
                if (i != 1) {
                    jsonEncoding = JsonEncoding.UTF8;
                } else if (i != 2) {
                    if (i == 4) {
                        throw new RuntimeException("Internal error");
                    }
                    if (this.g) {
                        jsonEncoding = JsonEncoding.UTF32_BE;
                    } else {
                        jsonEncoding = JsonEncoding.UTF32_LE;
                    }
                } else if (this.g) {
                    jsonEncoding = JsonEncoding.UTF16_BE;
                } else {
                    jsonEncoding = JsonEncoding.UTF16_LE;
                }
            } else {
                jsonEncoding = JsonEncoding.UTF8;
            }
        } else {
            if (f(2)) {
                byte[] bArr2 = this.c;
                int i4 = this.d;
                if (a((bArr2[i4 + 1] & 255) | ((bArr2[i4] & 255) << 8))) {
                    i = this.h;
                    if (i != 1) {
                        jsonEncoding = JsonEncoding.UTF8;
                    } else if (i != 2) {
                        if (i == 4) {
                            throw new RuntimeException("Internal error");
                        }
                        if (this.g) {
                            jsonEncoding = JsonEncoding.UTF32_BE;
                        } else {
                            jsonEncoding = JsonEncoding.UTF32_LE;
                        }
                    } else if (this.g) {
                        jsonEncoding = JsonEncoding.UTF16_BE;
                    } else {
                        jsonEncoding = JsonEncoding.UTF16_LE;
                    }
                }
            }
            jsonEncoding = JsonEncoding.UTF8;
        }
        this.f33362a.u(jsonEncoding);
        return jsonEncoding;
    }

    public boolean f(int i) throws IOException {
        int i2;
        int i3 = this.e - this.d;
        while (i3 < i) {
            InputStream inputStream = this.f33363b;
            if (inputStream == null) {
                i2 = -1;
            } else {
                byte[] bArr = this.c;
                int i4 = this.e;
                i2 = inputStream.read(bArr, i4, bArr.length - i4);
            }
            if (i2 < 1) {
                return false;
            }
            this.e += i2;
            i3 += i2;
        }
        return true;
    }

    public final boolean g(int i) throws IOException {
        if (i == -16842752) {
            i("3412");
        } else {
            if (i == -131072) {
                this.d += 4;
                this.h = 4;
                this.g = false;
                return true;
            }
            if (i == 65279) {
                this.g = true;
                this.d += 4;
                this.h = 4;
                return true;
            }
            if (i == 65534) {
                i("2143");
            }
        }
        int i2 = i >>> 16;
        if (i2 == 65279) {
            this.d += 2;
            this.h = 2;
            this.g = true;
            return true;
        }
        if (i2 == 65534) {
            this.d += 2;
            this.h = 2;
            this.g = false;
            return true;
        }
        if ((i >>> 8) != 15711167) {
            return false;
        }
        this.d += 3;
        this.h = 1;
        this.g = true;
        return true;
    }

    public final void i(String str) throws IOException {
        throw new CharConversionException("Unsupported UCS-4 endianness (" + str + ") detected");
    }

    public s73(xuc xucVar, byte[] bArr, int i, int i2) {
        this.g = true;
        this.f33362a = xucVar;
        this.f33363b = null;
        this.c = bArr;
        this.d = i;
        this.e = i + i2;
        this.f = false;
    }
}
