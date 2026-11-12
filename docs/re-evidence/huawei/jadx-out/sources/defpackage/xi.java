package defpackage;

import com.fasterxml.jackson.core.JsonEncoding;
import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.ObjectCodec;
import com.fasterxml.jackson.core.format.InputAccessor;
import com.fasterxml.jackson.core.format.MatchStrength;
import com.google.common.base.Ascii;
import java.io.ByteArrayInputStream;
import java.io.CharConversionException;
import java.io.DataInput;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

/* JADX INFO: loaded from: classes21.dex */
public final class xi {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f53021a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f53022b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final InputStream f53023c;
    private final xa d;
    private final boolean e;
    private final byte[] f;
    private int h;
    private int j;

    public xi(xa xaVar, InputStream inputStream) {
        this.f53022b = true;
        this.d = xaVar;
        this.f53023c = inputStream;
        this.f = xaVar.d();
        this.j = 0;
        this.h = 0;
        this.e = true;
    }

    public xi(xa xaVar, byte[] bArr, int i, int i2) {
        this.f53022b = true;
        this.d = xaVar;
        this.f53023c = null;
        this.f = bArr;
        this.j = i;
        this.h = i + i2;
        this.e = false;
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
    public JsonEncoding c() throws IOException {
        int i;
        JsonEncoding jsonEncoding;
        if (c(4)) {
            byte[] bArr = this.f;
            int i2 = this.j;
            int i3 = (bArr[i2 + 3] & 255) | (bArr[i2] << Ascii.CAN) | ((bArr[i2 + 1] & 255) << 16) | ((bArr[i2 + 2] & 255) << 8);
            if (!b(i3) && !e(i3) && !d(i3 >>> 16)) {
                jsonEncoding = JsonEncoding.UTF8;
            } else {
                i = this.f53021a;
                if (i != 1) {
                    jsonEncoding = JsonEncoding.UTF8;
                } else if (i != 2) {
                    if (i == 4) {
                        if (this.f53022b) {
                            jsonEncoding = JsonEncoding.UTF32_BE;
                        } else {
                            jsonEncoding = JsonEncoding.UTF32_LE;
                        }
                    } else {
                        throw new RuntimeException("Internal error");
                    }
                } else if (this.f53022b) {
                    jsonEncoding = JsonEncoding.UTF16_BE;
                } else {
                    jsonEncoding = JsonEncoding.UTF16_LE;
                }
            }
        } else {
            if (c(2)) {
                byte[] bArr2 = this.f;
                int i4 = this.j;
                if (d((bArr2[i4 + 1] & 255) | ((bArr2[i4] & 255) << 8))) {
                    i = this.f53021a;
                    if (i != 1) {
                        jsonEncoding = JsonEncoding.UTF8;
                    } else if (i != 2) {
                        if (i == 4) {
                            if (this.f53022b) {
                                jsonEncoding = JsonEncoding.UTF32_BE;
                            } else {
                                jsonEncoding = JsonEncoding.UTF32_LE;
                            }
                        } else {
                            throw new RuntimeException("Internal error");
                        }
                    } else if (this.f53022b) {
                        jsonEncoding = JsonEncoding.UTF16_BE;
                    } else {
                        jsonEncoding = JsonEncoding.UTF16_LE;
                    }
                }
            }
            jsonEncoding = JsonEncoding.UTF8;
        }
        this.d.a(jsonEncoding);
        return jsonEncoding;
    }

    public static int e(DataInput dataInput) throws IOException {
        int unsignedByte = dataInput.readUnsignedByte();
        if (unsignedByte != 239) {
            return unsignedByte;
        }
        int unsignedByte2 = dataInput.readUnsignedByte();
        if (unsignedByte2 != 187) {
            throw new IOException("Unexpected byte 0x" + Integer.toHexString(unsignedByte2) + " following 0xEF; should get 0xBB as part of UTF-8 BOM");
        }
        int unsignedByte3 = dataInput.readUnsignedByte();
        if (unsignedByte3 != 191) {
            throw new IOException("Unexpected byte 0x" + Integer.toHexString(unsignedByte3) + " following 0xEF 0xBB; should get 0xBF as part of UTF-8 BOM");
        }
        return dataInput.readUnsignedByte();
    }

    public Reader e() throws IOException {
        JsonEncoding jsonEncodingF = this.d.f();
        int iBits = jsonEncodingF.bits();
        if (iBits != 8 && iBits != 16) {
            if (iBits == 32) {
                xa xaVar = this.d;
                return new xg(xaVar, this.f53023c, this.f, this.j, this.h, xaVar.f().isBigEndian());
            }
            throw new RuntimeException("Internal error");
        }
        InputStream xeVar = this.f53023c;
        if (xeVar == null) {
            xeVar = new ByteArrayInputStream(this.f, this.j, this.h);
        } else if (this.j < this.h) {
            xeVar = new xe(this.d, xeVar, this.f, this.j, this.h);
        }
        return new InputStreamReader(xeVar, jsonEncodingF.getJavaName());
    }

    public JsonParser c(int i, ObjectCodec objectCodec, xt xtVar, xr xrVar, int i2) throws IOException {
        int i3 = this.j;
        JsonEncoding jsonEncodingC = c();
        int i4 = this.j;
        if (jsonEncodingC == JsonEncoding.UTF8 && JsonFactory.Feature.CANONICALIZE_FIELD_NAMES.enabledIn(i2)) {
            return new xs(this.d, i, this.f53023c, objectCodec, xtVar.d(i2), this.f, this.j, this.h, i4 - i3, this.e);
        }
        return new xl(this.d, i, e(), objectCodec, xrVar.a(i2));
    }

    public static MatchStrength b(InputAccessor inputAccessor) throws IOException {
        if (!inputAccessor.hasMoreBytes()) {
            return MatchStrength.INCONCLUSIVE;
        }
        byte bNextByte = inputAccessor.nextByte();
        if (bNextByte == -17) {
            if (!inputAccessor.hasMoreBytes()) {
                return MatchStrength.INCONCLUSIVE;
            }
            if (inputAccessor.nextByte() != -69) {
                return MatchStrength.NO_MATCH;
            }
            if (!inputAccessor.hasMoreBytes()) {
                return MatchStrength.INCONCLUSIVE;
            }
            if (inputAccessor.nextByte() != -65) {
                return MatchStrength.NO_MATCH;
            }
            if (!inputAccessor.hasMoreBytes()) {
                return MatchStrength.INCONCLUSIVE;
            }
            bNextByte = inputAccessor.nextByte();
        }
        int iC = c(inputAccessor, bNextByte);
        if (iC < 0) {
            return MatchStrength.INCONCLUSIVE;
        }
        if (iC == 123) {
            int iC2 = c(inputAccessor);
            if (iC2 < 0) {
                return MatchStrength.INCONCLUSIVE;
            }
            if (iC2 == 34 || iC2 == 125) {
                return MatchStrength.SOLID_MATCH;
            }
            return MatchStrength.NO_MATCH;
        }
        if (iC == 91) {
            int iC3 = c(inputAccessor);
            if (iC3 < 0) {
                return MatchStrength.INCONCLUSIVE;
            }
            if (iC3 == 93 || iC3 == 91) {
                return MatchStrength.SOLID_MATCH;
            }
            return MatchStrength.SOLID_MATCH;
        }
        MatchStrength matchStrength = MatchStrength.WEAK_MATCH;
        if (iC != 34 && (iC > 57 || iC < 48)) {
            if (iC != 45) {
                if (iC == 110) {
                    return b(inputAccessor, "ull", matchStrength);
                }
                if (iC == 116) {
                    return b(inputAccessor, "rue", matchStrength);
                }
                if (iC == 102) {
                    return b(inputAccessor, "alse", matchStrength);
                }
                return MatchStrength.NO_MATCH;
            }
            int iC4 = c(inputAccessor);
            if (iC4 < 0) {
                return MatchStrength.INCONCLUSIVE;
            }
            if (iC4 > 57 || iC4 < 48) {
                return MatchStrength.NO_MATCH;
            }
        }
        return matchStrength;
    }

    private static MatchStrength b(InputAccessor inputAccessor, String str, MatchStrength matchStrength) throws IOException {
        int length = str.length();
        for (int i = 0; i < length; i++) {
            if (!inputAccessor.hasMoreBytes()) {
                return MatchStrength.INCONCLUSIVE;
            }
            if (inputAccessor.nextByte() != str.charAt(i)) {
                return MatchStrength.NO_MATCH;
            }
        }
        return matchStrength;
    }

    private static int c(InputAccessor inputAccessor) throws IOException {
        if (inputAccessor.hasMoreBytes()) {
            return c(inputAccessor, inputAccessor.nextByte());
        }
        return -1;
    }

    private static int c(InputAccessor inputAccessor, byte b2) throws IOException {
        while (true) {
            int i = b2 & 255;
            if (i != 32 && i != 13 && i != 10 && i != 9) {
                return i;
            }
            if (!inputAccessor.hasMoreBytes()) {
                return -1;
            }
            b2 = inputAccessor.nextByte();
        }
    }

    private boolean b(int i) throws IOException {
        if (i == -16842752) {
            c("3412");
        } else {
            if (i == -131072) {
                this.j += 4;
                this.f53021a = 4;
                this.f53022b = false;
                return true;
            }
            if (i == 65279) {
                this.f53022b = true;
                this.j += 4;
                this.f53021a = 4;
                return true;
            }
            if (i == 65534) {
                c("2143");
            }
        }
        int i2 = i >>> 16;
        if (i2 == 65279) {
            this.j += 2;
            this.f53021a = 2;
            this.f53022b = true;
            return true;
        }
        if (i2 == 65534) {
            this.j += 2;
            this.f53021a = 2;
            this.f53022b = false;
            return true;
        }
        if ((i >>> 8) != 15711167) {
            return false;
        }
        this.j += 3;
        this.f53021a = 1;
        this.f53022b = true;
        return true;
    }

    private boolean e(int i) throws IOException {
        if ((i >> 8) == 0) {
            this.f53022b = true;
        } else if ((16777215 & i) == 0) {
            this.f53022b = false;
        } else if (((-16711681) & i) == 0) {
            c("3412");
        } else {
            if ((i & (-65281)) != 0) {
                return false;
            }
            c("2143");
        }
        this.f53021a = 4;
        return true;
    }

    private boolean d(int i) {
        if ((65280 & i) == 0) {
            this.f53022b = true;
        } else {
            if ((i & 255) != 0) {
                return false;
            }
            this.f53022b = false;
        }
        this.f53021a = 2;
        return true;
    }

    private void c(String str) throws IOException {
        throw new CharConversionException("Unsupported UCS-4 endianness (" + str + ") detected");
    }

    protected boolean c(int i) throws IOException {
        int i2;
        int i3 = this.h - this.j;
        while (i3 < i) {
            InputStream inputStream = this.f53023c;
            if (inputStream == null) {
                i2 = -1;
            } else {
                byte[] bArr = this.f;
                int i4 = this.h;
                i2 = inputStream.read(bArr, i4, bArr.length - i4);
            }
            if (i2 < 1) {
                return false;
            }
            this.h += i2;
            i3 += i2;
        }
        return true;
    }
}
