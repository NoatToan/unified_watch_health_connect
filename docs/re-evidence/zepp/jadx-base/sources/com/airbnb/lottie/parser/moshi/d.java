package com.airbnb.lottie.parser.moshi;

import androidx.annotation.Nullable;
import com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper;
import java.io.EOFException;
import java.io.IOException;
import java.util.Objects;
import okio.Buffer;
import okio.BufferedSource;
import okio.ByteString;

/* JADX INFO: loaded from: classes2.dex */
final class d extends JsonReader {
    private static final int A = 7;
    private static final int B = 8;
    private static final int C = 9;
    private static final int D = 10;
    private static final int E = 11;
    private static final int F = 12;
    private static final int G = 13;
    private static final int H = 14;
    private static final int I = 15;
    private static final int J = 16;
    private static final int K = 17;
    private static final int L = 18;
    private static final int M = 0;
    private static final int N = 1;
    private static final int O = 2;
    private static final int P = 3;
    private static final int Q = 4;
    private static final int R = 5;
    private static final int S = 6;
    private static final int T = 7;
    private static final long n = -922337203685477580L;
    private static final ByteString o = ByteString.encodeUtf8("'\\");
    private static final ByteString p = ByteString.encodeUtf8("\"\\");
    private static final ByteString q = ByteString.encodeUtf8("{}[]:, \n\t\r\f/\\;#=");
    private static final ByteString r = ByteString.encodeUtf8("\n\r");
    private static final ByteString s = ByteString.encodeUtf8("*/");
    private static final int t = 0;
    private static final int u = 1;
    private static final int v = 2;
    private static final int w = 3;
    private static final int x = 4;
    private static final int y = 5;
    private static final int z = 6;
    private final BufferedSource h;
    private final Buffer i;
    private int j = 0;
    private long k;
    private int l;

    @Nullable
    private String m;

    public d(BufferedSource bufferedSource) {
        Objects.requireNonNull(bufferedSource, "source == null");
        this.h = bufferedSource;
        this.i = bufferedSource.buffer();
        b(6);
    }

    private void e() throws IOException {
        if (!this.e) {
            throw d("Use JsonReader.setLenient(true) to accept malformed JSON");
        }
    }

    private int f() throws IOException {
        int[] iArr = this.b;
        int i = this.a;
        int i2 = iArr[i - 1];
        if (i2 == 1) {
            iArr[i - 1] = 2;
        } else if (i2 == 2) {
            int iJ = j(true);
            this.i.readByte();
            if (iJ != 44) {
                if (iJ != 59) {
                    if (iJ != 93) {
                        throw d("Unterminated array");
                    }
                    this.j = 4;
                    return 4;
                }
                e();
            }
        } else {
            if (i2 == 3 || i2 == 5) {
                iArr[i - 1] = 4;
                if (i2 == 5) {
                    int iJ2 = j(true);
                    this.i.readByte();
                    if (iJ2 != 44) {
                        if (iJ2 != 59) {
                            if (iJ2 != 125) {
                                throw d("Unterminated object");
                            }
                            this.j = 2;
                            return 2;
                        }
                        e();
                    }
                }
                int iJ3 = j(true);
                if (iJ3 == 34) {
                    this.i.readByte();
                    this.j = 13;
                    return 13;
                }
                if (iJ3 == 39) {
                    this.i.readByte();
                    e();
                    this.j = 12;
                    return 12;
                }
                if (iJ3 != 125) {
                    e();
                    if (!i((char) iJ3)) {
                        throw d("Expected name");
                    }
                    this.j = 14;
                    return 14;
                }
                if (i2 == 5) {
                    throw d("Expected name");
                }
                this.i.readByte();
                this.j = 2;
                return 2;
            }
            if (i2 == 4) {
                iArr[i - 1] = 5;
                int iJ4 = j(true);
                this.i.readByte();
                if (iJ4 != 58) {
                    if (iJ4 != 61) {
                        throw d("Expected ':'");
                    }
                    e();
                    if (this.h.request(1L) && this.i.getByte(0L) == 62) {
                        this.i.readByte();
                    }
                }
            } else if (i2 == 6) {
                iArr[i - 1] = 7;
            } else if (i2 == 7) {
                if (j(false) == -1) {
                    this.j = 18;
                    return 18;
                }
                e();
            } else if (i2 == 8) {
                throw new IllegalStateException("JsonReader is closed");
            }
        }
        int iJ5 = j(true);
        if (iJ5 == 34) {
            this.i.readByte();
            this.j = 9;
            return 9;
        }
        if (iJ5 == 39) {
            e();
            this.i.readByte();
            this.j = 8;
            return 8;
        }
        if (iJ5 != 44 && iJ5 != 59) {
            if (iJ5 == 91) {
                this.i.readByte();
                this.j = 3;
                return 3;
            }
            if (iJ5 != 93) {
                if (iJ5 == 123) {
                    this.i.readByte();
                    this.j = 1;
                    return 1;
                }
                int iM = m();
                if (iM != 0) {
                    return iM;
                }
                int iN = n();
                if (iN != 0) {
                    return iN;
                }
                if (!i(this.i.getByte(0L))) {
                    throw d("Expected value");
                }
                e();
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
            throw d("Unexpected value");
        }
        e();
        this.j = 7;
        return 7;
    }

    private int g(String str, JsonReader.Options options) {
        int length = options.a.length;
        for (int i = 0; i < length; i++) {
            if (str.equals(options.a[i])) {
                this.j = 0;
                this.c[this.a - 1] = str;
                return i;
            }
        }
        return -1;
    }

    private int h(String str, JsonReader.Options options) {
        int length = options.a.length;
        for (int i = 0; i < length; i++) {
            if (str.equals(options.a[i])) {
                this.j = 0;
                int[] iArr = this.d;
                int i2 = this.a - 1;
                iArr[i2] = iArr[i2] + 1;
                return i;
            }
        }
        return -1;
    }

    private boolean i(int i) throws IOException {
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
        e();
        return false;
    }

    private int j(boolean z2) throws IOException {
        int i;
        int i2;
        byte b;
        while (true) {
            while (true) {
                i2 = i + 1;
                if (!this.h.request(i2)) {
                    if (z2) {
                        throw new EOFException("End of input");
                    }
                    return -1;
                }
                b = this.i.getByte(i);
                i = (b == 10 || b == 32 || b == 13 || b == 9) ? i2 : 0;
            }
            this.i.skip(i2 - 1);
            if (b == 47) {
                if (!this.h.request(2L)) {
                    return b;
                }
                e();
                byte b2 = this.i.getByte(1L);
                if (b2 == 42) {
                    this.i.readByte();
                    this.i.readByte();
                    if (!q()) {
                        throw d("Unterminated comment");
                    }
                } else {
                    if (b2 != 47) {
                        return b;
                    }
                    this.i.readByte();
                    this.i.readByte();
                    r();
                }
            } else {
                if (b != 35) {
                    return b;
                }
                e();
                r();
            }
        }
    }

    private String k(ByteString byteString) throws IOException {
        StringBuilder sb = null;
        while (true) {
            long jIndexOfElement = this.h.indexOfElement(byteString);
            if (jIndexOfElement == -1) {
                throw d("Unterminated string");
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
            sb.append(o());
        }
    }

    private String l() throws IOException {
        long jIndexOfElement = this.h.indexOfElement(q);
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
    private int m() throws IOException {
        int i;
        String str;
        String str2;
        byte b = this.i.getByte(0L);
        if (b == 116 || b == 84) {
            i = 5;
            str = "true";
            str2 = "TRUE";
        } else if (b == 102 || b == 70) {
            i = 6;
            str = "false";
            str2 = "FALSE";
        } else {
            if (b != 110 && b != 78) {
                return 0;
            }
            i = 7;
            str = "null";
            str2 = "NULL";
        }
        int length = str.length();
        int i2 = 1;
        while (i2 < length) {
            int i3 = i2 + 1;
            if (!this.h.request(i3)) {
                return 0;
            }
            byte b2 = this.i.getByte(i2);
            if (b2 != str.charAt(i2) && b2 != str2.charAt(i2)) {
                return 0;
            }
            i2 = i3;
        }
        if (this.h.request(length + 1) && i(this.i.getByte(length))) {
            return 0;
        }
        this.i.skip(length);
        this.j = i;
        return i;
    }

    private int n() throws IOException {
        boolean z2 = true;
        int i = 0;
        long j = 0;
        int i2 = 0;
        char c = 0;
        boolean z3 = true;
        boolean z4 = false;
        while (true) {
            int i3 = i2 + 1;
            if (!this.h.request(i3)) {
                break;
            }
            byte b = this.i.getByte(i2);
            if (b != 43) {
                if (b == 69 || b == 101) {
                    if (c != 2 && c != 4) {
                        return i;
                    }
                    c = 5;
                } else if (b != 45) {
                    if (b != 46) {
                        if (b < 48 || b > 57) {
                            if (!i(b)) {
                                break;
                            }
                            return 0;
                        }
                        if (c == z2 || c == 0) {
                            j = -(b - 48);
                            i = 0;
                            c = 2;
                        } else {
                            if (c == 2) {
                                if (j == 0) {
                                    return i;
                                }
                                long j2 = (10 * j) - ((long) (b - 48));
                                z3 &= j > n || (j == n && j2 < j);
                                j = j2;
                            } else if (c == 3) {
                                i = 0;
                                c = 4;
                            } else if (c == 5 || c == 6) {
                                i = 0;
                                c = 7;
                            }
                            i = 0;
                        }
                    } else {
                        if (c != 2) {
                            return i;
                        }
                        c = 3;
                    }
                } else if (c == 0) {
                    c = 1;
                    z4 = true;
                } else if (c != 5) {
                    return i;
                }
                i2 = i3;
                z2 = true;
            } else if (c != 5) {
                return i;
            }
            c = 6;
            i2 = i3;
            z2 = true;
        }
        if (c == 2 && z3 && ((j != Long.MIN_VALUE || z4) && (j != 0 || !z4))) {
            if (!z4) {
                j = -j;
            }
            this.k = j;
            this.i.skip(i2);
            this.j = 16;
            return 16;
        }
        if (c != 2 && c != 4 && c != 7) {
            return 0;
        }
        this.l = i2;
        this.j = 17;
        return 17;
    }

    private char o() throws IOException {
        int i;
        int i2;
        if (!this.h.request(1L)) {
            throw d("Unterminated escape sequence");
        }
        byte b = this.i.readByte();
        if (b == 10 || b == 34 || b == 39 || b == 47 || b == 92) {
            return (char) b;
        }
        if (b == 98) {
            return '\b';
        }
        if (b == 102) {
            return '\f';
        }
        if (b == 110) {
            return '\n';
        }
        if (b == 114) {
            return '\r';
        }
        if (b == 116) {
            return '\t';
        }
        if (b != 117) {
            if (this.e) {
                return (char) b;
            }
            throw d("Invalid escape sequence: \\" + ((char) b));
        }
        if (!this.h.request(4L)) {
            throw new EOFException("Unterminated escape sequence at path " + getPath());
        }
        char c = 0;
        for (int i3 = 0; i3 < 4; i3++) {
            byte b2 = this.i.getByte(i3);
            char c2 = (char) (c << 4);
            if (b2 < 48 || b2 > 57) {
                if (b2 >= 97 && b2 <= 102) {
                    i = b2 - 97;
                } else {
                    if (b2 < 65 || b2 > 70) {
                        throw d("\\u" + this.i.readUtf8(4L));
                    }
                    i = b2 + ByteSourceJsonBootstrapper.UTF8_BOM_3;
                }
                i2 = i + 10;
            } else {
                i2 = b2 - 48;
            }
            c = (char) (c2 + i2);
        }
        this.i.skip(4L);
        return c;
    }

    private void p(ByteString byteString) throws IOException {
        while (true) {
            long jIndexOfElement = this.h.indexOfElement(byteString);
            if (jIndexOfElement == -1) {
                throw d("Unterminated string");
            }
            if (this.i.getByte(jIndexOfElement) != 92) {
                this.i.skip(jIndexOfElement + 1);
                return;
            } else {
                this.i.skip(jIndexOfElement + 1);
                o();
            }
        }
    }

    private boolean q() throws IOException {
        BufferedSource bufferedSource = this.h;
        ByteString byteString = s;
        long jIndexOf = bufferedSource.indexOf(byteString);
        boolean z2 = jIndexOf != -1;
        Buffer buffer = this.i;
        buffer.skip(z2 ? jIndexOf + ((long) byteString.size()) : buffer.size());
        return z2;
    }

    private void r() throws IOException {
        long jIndexOfElement = this.h.indexOfElement(r);
        Buffer buffer = this.i;
        buffer.skip(jIndexOfElement != -1 ? jIndexOfElement + 1 : buffer.size());
    }

    private void s() throws IOException {
        long jIndexOfElement = this.h.indexOfElement(q);
        Buffer buffer = this.i;
        if (jIndexOfElement == -1) {
            jIndexOfElement = buffer.size();
        }
        buffer.skip(jIndexOfElement);
    }

    @Override // com.airbnb.lottie.parser.moshi.JsonReader
    public void beginArray() throws IOException {
        int iF = this.j;
        if (iF == 0) {
            iF = f();
        }
        if (iF == 3) {
            b(1);
            this.d[this.a - 1] = 0;
            this.j = 0;
        } else {
            throw new a("Expected BEGIN_ARRAY but was " + peek() + " at path " + getPath());
        }
    }

    @Override // com.airbnb.lottie.parser.moshi.JsonReader
    public void beginObject() throws IOException {
        int iF = this.j;
        if (iF == 0) {
            iF = f();
        }
        if (iF == 1) {
            b(3);
            this.j = 0;
            return;
        }
        throw new a("Expected BEGIN_OBJECT but was " + peek() + " at path " + getPath());
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.j = 0;
        this.b[0] = 8;
        this.a = 1;
        this.i.clear();
        this.h.close();
    }

    @Override // com.airbnb.lottie.parser.moshi.JsonReader
    public void endArray() throws IOException {
        int iF = this.j;
        if (iF == 0) {
            iF = f();
        }
        if (iF != 4) {
            throw new a("Expected END_ARRAY but was " + peek() + " at path " + getPath());
        }
        int i = this.a - 1;
        this.a = i;
        int[] iArr = this.d;
        int i2 = i - 1;
        iArr[i2] = iArr[i2] + 1;
        this.j = 0;
    }

    @Override // com.airbnb.lottie.parser.moshi.JsonReader
    public void endObject() throws IOException {
        int iF = this.j;
        if (iF == 0) {
            iF = f();
        }
        if (iF != 2) {
            throw new a("Expected END_OBJECT but was " + peek() + " at path " + getPath());
        }
        int i = this.a - 1;
        this.a = i;
        this.c[i] = null;
        int[] iArr = this.d;
        int i2 = i - 1;
        iArr[i2] = iArr[i2] + 1;
        this.j = 0;
    }

    @Override // com.airbnb.lottie.parser.moshi.JsonReader
    public boolean hasNext() throws IOException {
        int iF = this.j;
        if (iF == 0) {
            iF = f();
        }
        return (iF == 2 || iF == 4 || iF == 18) ? false : true;
    }

    @Override // com.airbnb.lottie.parser.moshi.JsonReader
    public boolean nextBoolean() throws IOException {
        int iF = this.j;
        if (iF == 0) {
            iF = f();
        }
        if (iF == 5) {
            this.j = 0;
            int[] iArr = this.d;
            int i = this.a - 1;
            iArr[i] = iArr[i] + 1;
            return true;
        }
        if (iF == 6) {
            this.j = 0;
            int[] iArr2 = this.d;
            int i2 = this.a - 1;
            iArr2[i2] = iArr2[i2] + 1;
            return false;
        }
        throw new a("Expected a boolean but was " + peek() + " at path " + getPath());
    }

    @Override // com.airbnb.lottie.parser.moshi.JsonReader
    public double nextDouble() throws IOException {
        int iF = this.j;
        if (iF == 0) {
            iF = f();
        }
        if (iF == 16) {
            this.j = 0;
            int[] iArr = this.d;
            int i = this.a - 1;
            iArr[i] = iArr[i] + 1;
            return this.k;
        }
        if (iF == 17) {
            this.m = this.i.readUtf8(this.l);
        } else if (iF == 9) {
            this.m = k(p);
        } else if (iF == 8) {
            this.m = k(o);
        } else if (iF == 10) {
            this.m = l();
        } else if (iF != 11) {
            throw new a("Expected a double but was " + peek() + " at path " + getPath());
        }
        this.j = 11;
        try {
            double d = Double.parseDouble(this.m);
            if (this.e || !(Double.isNaN(d) || Double.isInfinite(d))) {
                this.m = null;
                this.j = 0;
                int[] iArr2 = this.d;
                int i2 = this.a - 1;
                iArr2[i2] = iArr2[i2] + 1;
                return d;
            }
            throw new b("JSON forbids NaN and infinities: " + d + " at path " + getPath());
        } catch (NumberFormatException unused) {
            throw new a("Expected a double but was " + this.m + " at path " + getPath());
        }
    }

    @Override // com.airbnb.lottie.parser.moshi.JsonReader
    public int nextInt() throws IOException {
        int iF = this.j;
        if (iF == 0) {
            iF = f();
        }
        if (iF == 16) {
            long j = this.k;
            int i = (int) j;
            if (j == i) {
                this.j = 0;
                int[] iArr = this.d;
                int i2 = this.a - 1;
                iArr[i2] = iArr[i2] + 1;
                return i;
            }
            throw new a("Expected an int but was " + this.k + " at path " + getPath());
        }
        if (iF == 17) {
            this.m = this.i.readUtf8(this.l);
        } else if (iF == 9 || iF == 8) {
            String strK = iF == 9 ? k(p) : k(o);
            this.m = strK;
            try {
                int i3 = Integer.parseInt(strK);
                this.j = 0;
                int[] iArr2 = this.d;
                int i4 = this.a - 1;
                iArr2[i4] = iArr2[i4] + 1;
                return i3;
            } catch (NumberFormatException unused) {
            }
        } else if (iF != 11) {
            throw new a("Expected an int but was " + peek() + " at path " + getPath());
        }
        this.j = 11;
        try {
            double d = Double.parseDouble(this.m);
            int i5 = (int) d;
            if (i5 == d) {
                this.m = null;
                this.j = 0;
                int[] iArr3 = this.d;
                int i6 = this.a - 1;
                iArr3[i6] = iArr3[i6] + 1;
                return i5;
            }
            throw new a("Expected an int but was " + this.m + " at path " + getPath());
        } catch (NumberFormatException unused2) {
            throw new a("Expected an int but was " + this.m + " at path " + getPath());
        }
    }

    @Override // com.airbnb.lottie.parser.moshi.JsonReader
    public String nextName() throws IOException {
        String strK;
        int iF = this.j;
        if (iF == 0) {
            iF = f();
        }
        if (iF == 14) {
            strK = l();
        } else if (iF == 13) {
            strK = k(p);
        } else if (iF == 12) {
            strK = k(o);
        } else {
            if (iF != 15) {
                throw new a("Expected a name but was " + peek() + " at path " + getPath());
            }
            strK = this.m;
        }
        this.j = 0;
        this.c[this.a - 1] = strK;
        return strK;
    }

    @Override // com.airbnb.lottie.parser.moshi.JsonReader
    public String nextString() throws IOException {
        String utf8;
        int iF = this.j;
        if (iF == 0) {
            iF = f();
        }
        if (iF == 10) {
            utf8 = l();
        } else if (iF == 9) {
            utf8 = k(p);
        } else if (iF == 8) {
            utf8 = k(o);
        } else if (iF == 11) {
            utf8 = this.m;
            this.m = null;
        } else if (iF == 16) {
            utf8 = Long.toString(this.k);
        } else {
            if (iF != 17) {
                throw new a("Expected a string but was " + peek() + " at path " + getPath());
            }
            utf8 = this.i.readUtf8(this.l);
        }
        this.j = 0;
        int[] iArr = this.d;
        int i = this.a - 1;
        iArr[i] = iArr[i] + 1;
        return utf8;
    }

    @Override // com.airbnb.lottie.parser.moshi.JsonReader
    public JsonReader.Token peek() throws IOException {
        int iF = this.j;
        if (iF == 0) {
            iF = f();
        }
        switch (iF) {
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
    public int selectName(JsonReader.Options options) throws IOException {
        int iF = this.j;
        if (iF == 0) {
            iF = f();
        }
        if (iF < 12 || iF > 15) {
            return -1;
        }
        if (iF == 15) {
            return g(this.m, options);
        }
        int iSelect = this.h.select(options.b);
        if (iSelect != -1) {
            this.j = 0;
            this.c[this.a - 1] = options.a[iSelect];
            return iSelect;
        }
        String str = this.c[this.a - 1];
        String strNextName = nextName();
        int iG = g(strNextName, options);
        if (iG == -1) {
            this.j = 15;
            this.m = strNextName;
            this.c[this.a - 1] = str;
        }
        return iG;
    }

    @Override // com.airbnb.lottie.parser.moshi.JsonReader
    public void skipName() throws IOException {
        if (this.f) {
            throw new a("Cannot skip unexpected " + peek() + " at " + getPath());
        }
        int iF = this.j;
        if (iF == 0) {
            iF = f();
        }
        if (iF == 14) {
            s();
        } else if (iF == 13) {
            p(p);
        } else if (iF == 12) {
            p(o);
        } else if (iF != 15) {
            throw new a("Expected a name but was " + peek() + " at path " + getPath());
        }
        this.j = 0;
        this.c[this.a - 1] = "null";
    }

    @Override // com.airbnb.lottie.parser.moshi.JsonReader
    public void skipValue() throws IOException {
        if (this.f) {
            throw new a("Cannot skip unexpected " + peek() + " at " + getPath());
        }
        int i = 0;
        do {
            int iF = this.j;
            if (iF == 0) {
                iF = f();
            }
            if (iF == 3) {
                b(1);
            } else {
                if (iF == 1) {
                    b(3);
                } else if (iF == 4) {
                    i--;
                    if (i < 0) {
                        throw new a("Expected a value but was " + peek() + " at path " + getPath());
                    }
                    this.a--;
                } else if (iF == 2) {
                    i--;
                    if (i < 0) {
                        throw new a("Expected a value but was " + peek() + " at path " + getPath());
                    }
                    this.a--;
                } else if (iF == 14 || iF == 10) {
                    s();
                } else if (iF == 9 || iF == 13) {
                    p(p);
                } else if (iF == 8 || iF == 12) {
                    p(o);
                } else if (iF == 17) {
                    this.i.skip(this.l);
                } else if (iF == 18) {
                    throw new a("Expected a value but was " + peek() + " at path " + getPath());
                }
                this.j = 0;
            }
            i++;
            this.j = 0;
        } while (i != 0);
        int[] iArr = this.d;
        int i2 = this.a;
        int i3 = i2 - 1;
        iArr[i3] = iArr[i3] + 1;
        this.c[i2 - 1] = "null";
    }

    public String toString() {
        return "JsonReader(" + this.h + ")";
    }
}
