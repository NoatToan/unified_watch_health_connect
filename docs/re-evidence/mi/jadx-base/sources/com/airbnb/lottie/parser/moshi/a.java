package com.airbnb.lottie.parser.moshi;

import defpackage.csd;
import defpackage.gsd;
import io.netty.util.internal.StringUtil;
import java.io.EOFException;
import java.io.IOException;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import okio.Buffer;
import okio.BufferedSource;
import okio.ByteString;
import okio.internal._BufferKt;

/* JADX INFO: loaded from: classes.dex */
public final class a extends JsonReader {
    public static final ByteString n = ByteString.encodeUtf8("'\\");
    public static final ByteString o = ByteString.encodeUtf8("\"\\");
    public static final ByteString p = ByteString.encodeUtf8("{}[]:, \n\t\r\f/\\;#=");
    public static final ByteString q = ByteString.encodeUtf8("\n\r");

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final ByteString f5707r = ByteString.encodeUtf8("*/");
    public final BufferedSource h;
    public final Buffer i;
    public int j = 0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public long f5708k;
    public int l;
    public String m;

    public a(BufferedSource bufferedSource) {
        if (bufferedSource == null) {
            throw new NullPointerException("source == null");
        }
        this.h = bufferedSource;
        this.i = bufferedSource.getBufferField();
        o(6);
    }

    public final void E() throws IOException {
        if (!this.e) {
            throw D("Use JsonReader.setLenient(true) to accept malformed JSON");
        }
    }

    public final int J() throws IOException {
        int[] iArr = this.f5704b;
        int i = this.f5703a;
        int i2 = iArr[i - 1];
        if (i2 == 1) {
            iArr[i - 1] = 2;
        } else if (i2 == 2) {
            int iN = N(true);
            this.i.readByte();
            if (iN != 44) {
                if (iN != 59) {
                    if (iN != 93) {
                        throw D("Unterminated array");
                    }
                    this.j = 4;
                    return 4;
                }
                E();
            }
        } else {
            if (i2 == 3 || i2 == 5) {
                iArr[i - 1] = 4;
                if (i2 == 5) {
                    int iN2 = N(true);
                    this.i.readByte();
                    if (iN2 != 44) {
                        if (iN2 != 59) {
                            if (iN2 != 125) {
                                throw D("Unterminated object");
                            }
                            this.j = 2;
                            return 2;
                        }
                        E();
                    }
                }
                int iN3 = N(true);
                if (iN3 == 34) {
                    this.i.readByte();
                    this.j = 13;
                    return 13;
                }
                if (iN3 == 39) {
                    this.i.readByte();
                    E();
                    this.j = 12;
                    return 12;
                }
                if (iN3 != 125) {
                    E();
                    if (!M((char) iN3)) {
                        throw D("Expected name");
                    }
                    this.j = 14;
                    return 14;
                }
                if (i2 == 5) {
                    throw D("Expected name");
                }
                this.i.readByte();
                this.j = 2;
                return 2;
            }
            if (i2 == 4) {
                iArr[i - 1] = 5;
                int iN4 = N(true);
                this.i.readByte();
                if (iN4 != 58) {
                    if (iN4 != 61) {
                        throw D("Expected ':'");
                    }
                    E();
                    if (this.h.request(1L) && this.i.getByte(0L) == 62) {
                        this.i.readByte();
                    }
                }
            } else if (i2 == 6) {
                iArr[i - 1] = 7;
            } else if (i2 == 7) {
                if (N(false) == -1) {
                    this.j = 18;
                    return 18;
                }
                E();
            } else if (i2 == 8) {
                throw new IllegalStateException("JsonReader is closed");
            }
        }
        int iN5 = N(true);
        if (iN5 == 34) {
            this.i.readByte();
            this.j = 9;
            return 9;
        }
        if (iN5 == 39) {
            E();
            this.i.readByte();
            this.j = 8;
            return 8;
        }
        if (iN5 != 44 && iN5 != 59) {
            if (iN5 == 91) {
                this.i.readByte();
                this.j = 3;
                return 3;
            }
            if (iN5 != 93) {
                if (iN5 == 123) {
                    this.i.readByte();
                    this.j = 1;
                    return 1;
                }
                int iQ = Q();
                if (iQ != 0) {
                    return iQ;
                }
                int iR = R();
                if (iR != 0) {
                    return iR;
                }
                if (!M(this.i.getByte(0L))) {
                    throw D("Expected value");
                }
                E();
                this.j = 10;
                return 10;
            }
            if (i2 == 1) {
                this.i.readByte();
                this.j = 4;
                return 4;
            }
        }
        if (i2 != 1 && i2 != 2) {
            throw D("Unexpected value");
        }
        E();
        this.j = 7;
        return 7;
    }

    public final int K(String str, JsonReader.a aVar) {
        int length = aVar.f5705a.length;
        for (int i = 0; i < length; i++) {
            if (str.equals(aVar.f5705a[i])) {
                this.j = 0;
                this.c[this.f5703a - 1] = str;
                return i;
            }
        }
        return -1;
    }

    public final boolean M(int i) throws IOException {
        if (i == 9 || i == 10 || i == 12 || i == 13 || i == 32) {
            return false;
        }
        if (i != 35) {
            if (i == 44) {
                return false;
            }
            if (i != 47 && i != 61) {
                if (i == 123 || i == 125 || i == 58) {
                    return false;
                }
                if (i != 59) {
                    switch (i) {
                        case 91:
                        case 93:
                            return false;
                        case 92:
                            break;
                        default:
                            return true;
                    }
                }
            }
        }
        E();
        return false;
    }

    public final int N(boolean z) throws IOException {
        byte b2;
        while (true) {
            int i = 0;
            while (true) {
                int i2 = i + 1;
                if (!this.h.request(i2)) {
                    if (z) {
                        throw new EOFException("End of input");
                    }
                    return -1;
                }
                b2 = this.i.getByte(i);
                if (b2 == 10 || b2 == 32 || b2 == 13 || b2 == 9) {
                    i = i2;
                }
            }
            this.i.skip(i);
            if (b2 == 47) {
                if (!this.h.request(2L)) {
                    return b2;
                }
                E();
                byte b3 = this.i.getByte(1L);
                if (b3 == 42) {
                    this.i.readByte();
                    this.i.readByte();
                    if (!U()) {
                        throw D("Unterminated comment");
                    }
                } else {
                    if (b3 != 47) {
                        return b2;
                    }
                    this.i.readByte();
                    this.i.readByte();
                    Z();
                }
            } else {
                if (b2 != 35) {
                    return b2;
                }
                E();
                Z();
            }
        }
    }

    public final String O(ByteString byteString) throws IOException {
        StringBuilder sb = null;
        while (true) {
            long jIndexOfElement = this.h.indexOfElement(byteString);
            if (jIndexOfElement == -1) {
                throw D("Unterminated string");
            }
            if (this.i.getByte(jIndexOfElement) != 92) {
                if (sb == null) {
                    String utf8 = this.i.readUtf8(jIndexOfElement);
                    this.i.readByte();
                    return utf8;
                }
                sb.append(this.i.readUtf8(jIndexOfElement));
                this.i.readByte();
                return sb.toString();
            }
            if (sb == null) {
                sb = new StringBuilder();
            }
            sb.append(this.i.readUtf8(jIndexOfElement));
            this.i.readByte();
            sb.append(S());
        }
    }

    public final String P() throws IOException {
        long jIndexOfElement = this.h.indexOfElement(p);
        return jIndexOfElement != -1 ? this.i.readUtf8(jIndexOfElement) : this.i.readUtf8();
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final int Q() throws IOException {
        String str;
        String str2;
        int i;
        byte b2 = this.i.getByte(0L);
        if (b2 == 116 || b2 == 84) {
            str = "true";
            str2 = "TRUE";
            i = 5;
        } else if (b2 == 102 || b2 == 70) {
            str = "false";
            str2 = "FALSE";
            i = 6;
        } else {
            if (b2 != 110 && b2 != 78) {
                return 0;
            }
            str = AbstractJsonLexerKt.NULL;
            str2 = "NULL";
            i = 7;
        }
        int length = str.length();
        int i2 = 1;
        while (i2 < length) {
            int i3 = i2 + 1;
            if (!this.h.request(i3)) {
                return 0;
            }
            byte b3 = this.i.getByte(i2);
            if (b3 != str.charAt(i2) && b3 != str2.charAt(i2)) {
                return 0;
            }
            i2 = i3;
        }
        if (this.h.request(length + 1) && M(this.i.getByte(length))) {
            return 0;
        }
        this.i.skip(length);
        this.j = i;
        return i;
    }

    public final int R() throws IOException {
        char c;
        boolean z = true;
        long j = 0;
        int i = 0;
        char c2 = 0;
        boolean z2 = false;
        boolean z3 = true;
        while (true) {
            int i2 = i + 1;
            if (!this.h.request(i2)) {
                break;
            }
            byte b2 = this.i.getByte(i);
            if (b2 != 43) {
                if (b2 == 69 || b2 == 101) {
                    if (c2 != 2 && c2 != 4) {
                        return 0;
                    }
                    c2 = 5;
                } else if (b2 == 45) {
                    c = 6;
                    if (c2 == 0) {
                        c2 = 1;
                        z2 = true;
                    } else if (c2 != 5) {
                        return 0;
                    }
                } else if (b2 != 46) {
                    if (b2 < 48 || b2 > 57) {
                        if (!M(b2)) {
                            break;
                        }
                        return 0;
                    }
                    if (c2 == z || c2 == 0) {
                        j = -(b2 - 48);
                        c2 = 2;
                    } else if (c2 == 2) {
                        if (j == 0) {
                            return 0;
                        }
                        long j2 = (10 * j) - ((long) (b2 - 48));
                        z3 &= j > _BufferKt.OVERFLOW_ZONE || (j == _BufferKt.OVERFLOW_ZONE && j2 < j);
                        j = j2;
                    } else if (c2 == 3) {
                        c2 = 4;
                    } else if (c2 == 5 || c2 == 6) {
                        c2 = 7;
                    }
                } else {
                    if (c2 != 2) {
                        return 0;
                    }
                    c2 = 3;
                }
                i = i2;
                z = true;
            } else {
                c = 6;
                if (c2 != 5) {
                    return 0;
                }
            }
            c2 = c;
            i = i2;
            z = true;
        }
        if (c2 == 2 && z3 && ((j != Long.MIN_VALUE || z2) && (j != 0 || !z2))) {
            if (!z2) {
                j = -j;
            }
            this.f5708k = j;
            this.i.skip(i);
            this.j = 16;
            return 16;
        }
        if (c2 != 2 && c2 != 4 && c2 != 7) {
            return 0;
        }
        this.l = i;
        this.j = 17;
        return 17;
    }

    public final char S() throws IOException {
        int i;
        if (!this.h.request(1L)) {
            throw D("Unterminated escape sequence");
        }
        byte b2 = this.i.readByte();
        if (b2 == 10 || b2 == 34 || b2 == 39 || b2 == 47 || b2 == 92) {
            return (char) b2;
        }
        if (b2 == 98) {
            return '\b';
        }
        if (b2 == 102) {
            return '\f';
        }
        if (b2 == 110) {
            return '\n';
        }
        if (b2 == 114) {
            return StringUtil.CARRIAGE_RETURN;
        }
        if (b2 == 116) {
            return '\t';
        }
        if (b2 != 117) {
            if (this.e) {
                return (char) b2;
            }
            throw D("Invalid escape sequence: \\" + ((char) b2));
        }
        if (!this.h.request(4L)) {
            throw new EOFException("Unterminated escape sequence at path " + getPath());
        }
        char c = 0;
        for (int i2 = 0; i2 < 4; i2++) {
            byte b3 = this.i.getByte(i2);
            char c2 = (char) (c << 4);
            if (b3 >= 48 && b3 <= 57) {
                i = b3 - 48;
            } else if (b3 >= 97 && b3 <= 102) {
                i = b3 - 87;
            } else {
                if (b3 < 65 || b3 > 70) {
                    throw D("\\u" + this.i.readUtf8(4L));
                }
                i = b3 - 55;
            }
            c = (char) (c2 + i);
        }
        this.i.skip(4L);
        return c;
    }

    public final void T(ByteString byteString) throws IOException {
        while (true) {
            long jIndexOfElement = this.h.indexOfElement(byteString);
            if (jIndexOfElement == -1) {
                throw D("Unterminated string");
            }
            if (this.i.getByte(jIndexOfElement) != 92) {
                this.i.skip(jIndexOfElement + 1);
                return;
            } else {
                this.i.skip(jIndexOfElement + 1);
                S();
            }
        }
    }

    public final boolean U() throws IOException {
        BufferedSource bufferedSource = this.h;
        ByteString byteString = f5707r;
        long jIndexOf = bufferedSource.indexOf(byteString);
        boolean z = jIndexOf != -1;
        Buffer buffer = this.i;
        buffer.skip(z ? jIndexOf + ((long) byteString.size()) : buffer.size());
        return z;
    }

    public final void Z() throws IOException {
        long jIndexOfElement = this.h.indexOfElement(q);
        Buffer buffer = this.i;
        buffer.skip(jIndexOfElement != -1 ? jIndexOfElement + 1 : buffer.size());
    }

    @Override // com.airbnb.lottie.parser.moshi.JsonReader
    public void b() throws IOException {
        int iJ = this.j;
        if (iJ == 0) {
            iJ = J();
        }
        if (iJ == 3) {
            o(1);
            this.d[this.f5703a - 1] = 0;
            this.j = 0;
        } else {
            throw new csd("Expected BEGIN_ARRAY but was " + n() + " at path " + getPath());
        }
    }

    public final void b0() throws IOException {
        long jIndexOfElement = this.h.indexOfElement(p);
        Buffer buffer = this.i;
        if (jIndexOfElement == -1) {
            jIndexOfElement = buffer.size();
        }
        buffer.skip(jIndexOfElement);
    }

    @Override // com.airbnb.lottie.parser.moshi.JsonReader
    public void beginObject() throws IOException {
        int iJ = this.j;
        if (iJ == 0) {
            iJ = J();
        }
        if (iJ == 1) {
            o(3);
            this.j = 0;
            return;
        }
        throw new csd("Expected BEGIN_OBJECT but was " + n() + " at path " + getPath());
    }

    @Override // com.airbnb.lottie.parser.moshi.JsonReader
    public void c() throws IOException {
        int iJ = this.j;
        if (iJ == 0) {
            iJ = J();
        }
        if (iJ != 4) {
            throw new csd("Expected END_ARRAY but was " + n() + " at path " + getPath());
        }
        int i = this.f5703a;
        this.f5703a = i - 1;
        int[] iArr = this.d;
        int i2 = i - 2;
        iArr[i2] = iArr[i2] + 1;
        this.j = 0;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.j = 0;
        this.f5704b[0] = 8;
        this.f5703a = 1;
        this.i.clear();
        this.h.close();
    }

    @Override // com.airbnb.lottie.parser.moshi.JsonReader
    public boolean d() throws IOException {
        int iJ = this.j;
        if (iJ == 0) {
            iJ = J();
        }
        return (iJ == 2 || iJ == 4 || iJ == 18) ? false : true;
    }

    @Override // com.airbnb.lottie.parser.moshi.JsonReader
    public void endObject() throws IOException {
        int iJ = this.j;
        if (iJ == 0) {
            iJ = J();
        }
        if (iJ != 2) {
            throw new csd("Expected END_OBJECT but was " + n() + " at path " + getPath());
        }
        int i = this.f5703a;
        int i2 = i - 1;
        this.f5703a = i2;
        this.c[i2] = null;
        int[] iArr = this.d;
        int i3 = i - 2;
        iArr[i3] = iArr[i3] + 1;
        this.j = 0;
    }

    @Override // com.airbnb.lottie.parser.moshi.JsonReader
    public boolean l() throws IOException {
        int iJ = this.j;
        if (iJ == 0) {
            iJ = J();
        }
        if (iJ == 5) {
            this.j = 0;
            int[] iArr = this.d;
            int i = this.f5703a - 1;
            iArr[i] = iArr[i] + 1;
            return true;
        }
        if (iJ == 6) {
            this.j = 0;
            int[] iArr2 = this.d;
            int i2 = this.f5703a - 1;
            iArr2[i2] = iArr2[i2] + 1;
            return false;
        }
        throw new csd("Expected a boolean but was " + n() + " at path " + getPath());
    }

    @Override // com.airbnb.lottie.parser.moshi.JsonReader
    public JsonReader.Token n() throws IOException {
        int iJ = this.j;
        if (iJ == 0) {
            iJ = J();
        }
        switch (iJ) {
            case 1:
                return JsonReader.Token.BEGIN_OBJECT;
            case 2:
                return JsonReader.Token.END_OBJECT;
            case 3:
                return JsonReader.Token.BEGIN_ARRAY;
            case 4:
                return JsonReader.Token.END_ARRAY;
            case 5:
            case 6:
                return JsonReader.Token.BOOLEAN;
            case 7:
                return JsonReader.Token.NULL;
            case 8:
            case 9:
            case 10:
            case 11:
                return JsonReader.Token.STRING;
            case 12:
            case 13:
            case 14:
            case 15:
                return JsonReader.Token.NAME;
            case 16:
            case 17:
                return JsonReader.Token.NUMBER;
            case 18:
                return JsonReader.Token.END_DOCUMENT;
            default:
                throw new AssertionError();
        }
    }

    @Override // com.airbnb.lottie.parser.moshi.JsonReader
    public double nextDouble() throws IOException {
        int iJ = this.j;
        if (iJ == 0) {
            iJ = J();
        }
        if (iJ == 16) {
            this.j = 0;
            int[] iArr = this.d;
            int i = this.f5703a - 1;
            iArr[i] = iArr[i] + 1;
            return this.f5708k;
        }
        if (iJ == 17) {
            this.m = this.i.readUtf8(this.l);
        } else if (iJ == 9) {
            this.m = O(o);
        } else if (iJ == 8) {
            this.m = O(n);
        } else if (iJ == 10) {
            this.m = P();
        } else if (iJ != 11) {
            throw new csd("Expected a double but was " + n() + " at path " + getPath());
        }
        this.j = 11;
        try {
            double d = Double.parseDouble(this.m);
            if (this.e || !(Double.isNaN(d) || Double.isInfinite(d))) {
                this.m = null;
                this.j = 0;
                int[] iArr2 = this.d;
                int i2 = this.f5703a - 1;
                iArr2[i2] = iArr2[i2] + 1;
                return d;
            }
            throw new gsd("JSON forbids NaN and infinities: " + d + " at path " + getPath());
        } catch (NumberFormatException unused) {
            throw new csd("Expected a double but was " + this.m + " at path " + getPath());
        }
    }

    @Override // com.airbnb.lottie.parser.moshi.JsonReader
    public int nextInt() throws IOException {
        int iJ = this.j;
        if (iJ == 0) {
            iJ = J();
        }
        if (iJ == 16) {
            long j = this.f5708k;
            int i = (int) j;
            if (j == i) {
                this.j = 0;
                int[] iArr = this.d;
                int i2 = this.f5703a - 1;
                iArr[i2] = iArr[i2] + 1;
                return i;
            }
            throw new csd("Expected an int but was " + this.f5708k + " at path " + getPath());
        }
        if (iJ == 17) {
            this.m = this.i.readUtf8(this.l);
        } else if (iJ == 9 || iJ == 8) {
            String strO = iJ == 9 ? O(o) : O(n);
            this.m = strO;
            try {
                int i3 = Integer.parseInt(strO);
                this.j = 0;
                int[] iArr2 = this.d;
                int i4 = this.f5703a - 1;
                iArr2[i4] = iArr2[i4] + 1;
                return i3;
            } catch (NumberFormatException unused) {
            }
        } else if (iJ != 11) {
            throw new csd("Expected an int but was " + n() + " at path " + getPath());
        }
        this.j = 11;
        try {
            double d = Double.parseDouble(this.m);
            int i5 = (int) d;
            if (i5 == d) {
                this.m = null;
                this.j = 0;
                int[] iArr3 = this.d;
                int i6 = this.f5703a - 1;
                iArr3[i6] = iArr3[i6] + 1;
                return i5;
            }
            throw new csd("Expected an int but was " + this.m + " at path " + getPath());
        } catch (NumberFormatException unused2) {
            throw new csd("Expected an int but was " + this.m + " at path " + getPath());
        }
    }

    @Override // com.airbnb.lottie.parser.moshi.JsonReader
    public String nextName() throws IOException {
        String strO;
        int iJ = this.j;
        if (iJ == 0) {
            iJ = J();
        }
        if (iJ == 14) {
            strO = P();
        } else if (iJ == 13) {
            strO = O(o);
        } else if (iJ == 12) {
            strO = O(n);
        } else {
            if (iJ != 15) {
                throw new csd("Expected a name but was " + n() + " at path " + getPath());
            }
            strO = this.m;
        }
        this.j = 0;
        this.c[this.f5703a - 1] = strO;
        return strO;
    }

    @Override // com.airbnb.lottie.parser.moshi.JsonReader
    public String nextString() throws IOException {
        String utf8;
        int iJ = this.j;
        if (iJ == 0) {
            iJ = J();
        }
        if (iJ == 10) {
            utf8 = P();
        } else if (iJ == 9) {
            utf8 = O(o);
        } else if (iJ == 8) {
            utf8 = O(n);
        } else if (iJ == 11) {
            utf8 = this.m;
            this.m = null;
        } else if (iJ == 16) {
            utf8 = Long.toString(this.f5708k);
        } else {
            if (iJ != 17) {
                throw new csd("Expected a string but was " + n() + " at path " + getPath());
            }
            utf8 = this.i.readUtf8(this.l);
        }
        this.j = 0;
        int[] iArr = this.d;
        int i = this.f5703a - 1;
        iArr[i] = iArr[i] + 1;
        return utf8;
    }

    @Override // com.airbnb.lottie.parser.moshi.JsonReader
    public int p(JsonReader.a aVar) throws IOException {
        int iJ = this.j;
        if (iJ == 0) {
            iJ = J();
        }
        if (iJ < 12 || iJ > 15) {
            return -1;
        }
        if (iJ == 15) {
            return K(this.m, aVar);
        }
        int iSelect = this.h.select(aVar.f5706b);
        if (iSelect != -1) {
            this.j = 0;
            this.c[this.f5703a - 1] = aVar.f5705a[iSelect];
            return iSelect;
        }
        String str = this.c[this.f5703a - 1];
        String strNextName = nextName();
        int iK = K(strNextName, aVar);
        if (iK == -1) {
            this.j = 15;
            this.m = strNextName;
            this.c[this.f5703a - 1] = str;
        }
        return iK;
    }

    @Override // com.airbnb.lottie.parser.moshi.JsonReader
    public void s() throws IOException {
        if (this.f) {
            throw new csd("Cannot skip unexpected " + n() + " at " + getPath());
        }
        int iJ = this.j;
        if (iJ == 0) {
            iJ = J();
        }
        if (iJ == 14) {
            b0();
        } else if (iJ == 13) {
            T(o);
        } else if (iJ == 12) {
            T(n);
        } else if (iJ != 15) {
            throw new csd("Expected a name but was " + n() + " at path " + getPath());
        }
        this.j = 0;
        this.c[this.f5703a - 1] = AbstractJsonLexerKt.NULL;
    }

    @Override // com.airbnb.lottie.parser.moshi.JsonReader
    public void skipValue() throws IOException {
        if (this.f) {
            throw new csd("Cannot skip unexpected " + n() + " at " + getPath());
        }
        int i = 0;
        do {
            int iJ = this.j;
            if (iJ == 0) {
                iJ = J();
            }
            if (iJ == 3) {
                o(1);
            } else {
                if (iJ == 1) {
                    o(3);
                } else if (iJ == 4) {
                    i--;
                    if (i < 0) {
                        throw new csd("Expected a value but was " + n() + " at path " + getPath());
                    }
                    this.f5703a--;
                } else if (iJ == 2) {
                    i--;
                    if (i < 0) {
                        throw new csd("Expected a value but was " + n() + " at path " + getPath());
                    }
                    this.f5703a--;
                } else if (iJ == 14 || iJ == 10) {
                    b0();
                } else if (iJ == 9 || iJ == 13) {
                    T(o);
                } else if (iJ == 8 || iJ == 12) {
                    T(n);
                } else if (iJ == 17) {
                    this.i.skip(this.l);
                } else if (iJ == 18) {
                    throw new csd("Expected a value but was " + n() + " at path " + getPath());
                }
                this.j = 0;
            }
            i++;
            this.j = 0;
        } while (i != 0);
        int[] iArr = this.d;
        int i2 = this.f5703a;
        int i3 = i2 - 1;
        iArr[i3] = iArr[i3] + 1;
        this.c[i2 - 1] = AbstractJsonLexerKt.NULL;
    }

    public String toString() {
        return "JsonReader(" + this.h + ")";
    }
}
