package defpackage;

import com.airbnb.lottie.parser.moshi.JsonReader;
import com.huawei.healthcloud.plugintrack.golf.bean.GolfCourseInfo;
import com.huawei.operation.utils.Constants;
import java.io.EOFException;
import java.io.IOException;
import okio.Buffer;
import okio.BufferedSource;
import okio.ByteString;

/* JADX INFO: loaded from: classes21.dex */
public final class is extends JsonReader {
    private String f;
    private int g;
    private int h = 0;
    private final Buffer i;
    private long j;
    private final BufferedSource k;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final ByteString f38029b = ByteString.encodeUtf8("'\\");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final ByteString f38030c = ByteString.encodeUtf8("\"\\");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final ByteString f38028a = ByteString.encodeUtf8("{}[]:, \n\t\r\f/\\;#=");
    private static final ByteString e = ByteString.encodeUtf8("\n\r");
    private static final ByteString d = ByteString.encodeUtf8("*/");

    public is(BufferedSource bufferedSource) {
        if (bufferedSource == null) {
            throw new NullPointerException("source == null");
        }
        this.k = bufferedSource;
        this.i = bufferedSource.getBufferField();
        pushScope(6);
    }

    @Override // com.airbnb.lottie.parser.moshi.JsonReader
    public void beginArray() throws IOException {
        int iD = this.h;
        if (iD == 0) {
            iD = d();
        }
        if (iD == 3) {
            pushScope(1);
            this.pathIndices[this.stackSize - 1] = 0;
            this.h = 0;
        } else {
            throw new iq("Expected BEGIN_ARRAY but was " + peek() + " at path " + getPath());
        }
    }

    @Override // com.airbnb.lottie.parser.moshi.JsonReader
    public void endArray() throws IOException {
        int iD = this.h;
        if (iD == 0) {
            iD = d();
        }
        if (iD == 4) {
            this.stackSize--;
            int[] iArr = this.pathIndices;
            int i = this.stackSize - 1;
            iArr[i] = iArr[i] + 1;
            this.h = 0;
            return;
        }
        throw new iq("Expected END_ARRAY but was " + peek() + " at path " + getPath());
    }

    @Override // com.airbnb.lottie.parser.moshi.JsonReader
    public void beginObject() throws IOException {
        int iD = this.h;
        if (iD == 0) {
            iD = d();
        }
        if (iD == 1) {
            pushScope(3);
            this.h = 0;
        } else {
            throw new iq("Expected BEGIN_OBJECT but was " + peek() + " at path " + getPath());
        }
    }

    @Override // com.airbnb.lottie.parser.moshi.JsonReader
    public void endObject() throws IOException {
        int iD = this.h;
        if (iD == 0) {
            iD = d();
        }
        if (iD == 2) {
            this.stackSize--;
            this.pathNames[this.stackSize] = null;
            int[] iArr = this.pathIndices;
            int i = this.stackSize - 1;
            iArr[i] = iArr[i] + 1;
            this.h = 0;
            return;
        }
        throw new iq("Expected END_OBJECT but was " + peek() + " at path " + getPath());
    }

    @Override // com.airbnb.lottie.parser.moshi.JsonReader
    public boolean hasNext() throws IOException {
        int iD = this.h;
        if (iD == 0) {
            iD = d();
        }
        return (iD == 2 || iD == 4 || iD == 18) ? false : true;
    }

    @Override // com.airbnb.lottie.parser.moshi.JsonReader
    public JsonReader.Token peek() throws IOException {
        int iD = this.h;
        if (iD == 0) {
            iD = d();
        }
        switch (iD) {
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

    private int d() throws IOException {
        int i = this.scopes[this.stackSize - 1];
        if (i == 1) {
            this.scopes[this.stackSize - 1] = 2;
        } else if (i == 2) {
            int iD = d(true);
            this.i.readByte();
            if (iD != 44) {
                if (iD != 59) {
                    if (iD == 93) {
                        this.h = 4;
                        return 4;
                    }
                    throw syntaxError("Unterminated array");
                }
                b();
            }
        } else {
            if (i == 3 || i == 5) {
                this.scopes[this.stackSize - 1] = 4;
                if (i == 5) {
                    int iD2 = d(true);
                    this.i.readByte();
                    if (iD2 != 44) {
                        if (iD2 != 59) {
                            if (iD2 == 125) {
                                this.h = 2;
                                return 2;
                            }
                            throw syntaxError("Unterminated object");
                        }
                        b();
                    }
                }
                int iD3 = d(true);
                if (iD3 == 34) {
                    this.i.readByte();
                    this.h = 13;
                    return 13;
                }
                if (iD3 == 39) {
                    this.i.readByte();
                    b();
                    this.h = 12;
                    return 12;
                }
                if (iD3 != 125) {
                    b();
                    if (a((char) iD3)) {
                        this.h = 14;
                        return 14;
                    }
                    throw syntaxError("Expected name");
                }
                if (i != 5) {
                    this.i.readByte();
                    this.h = 2;
                    return 2;
                }
                throw syntaxError("Expected name");
            }
            if (i == 4) {
                this.scopes[this.stackSize - 1] = 5;
                int iD4 = d(true);
                this.i.readByte();
                if (iD4 != 58) {
                    if (iD4 == 61) {
                        b();
                        if (this.k.request(1L) && this.i.getByte(0L) == 62) {
                            this.i.readByte();
                        }
                    } else {
                        throw syntaxError("Expected ':'");
                    }
                }
            } else if (i == 6) {
                this.scopes[this.stackSize - 1] = 7;
            } else if (i == 7) {
                if (d(false) == -1) {
                    this.h = 18;
                    return 18;
                }
                b();
            } else if (i == 8) {
                throw new IllegalStateException("JsonReader is closed");
            }
        }
        int iD5 = d(true);
        if (iD5 == 34) {
            this.i.readByte();
            this.h = 9;
            return 9;
        }
        if (iD5 == 39) {
            b();
            this.i.readByte();
            this.h = 8;
            return 8;
        }
        if (iD5 != 44 && iD5 != 59) {
            if (iD5 == 91) {
                this.i.readByte();
                this.h = 3;
                return 3;
            }
            if (iD5 != 93) {
                if (iD5 == 123) {
                    this.i.readByte();
                    this.h = 1;
                    return 1;
                }
                int iC = c();
                if (iC != 0) {
                    return iC;
                }
                int iE = e();
                if (iE != 0) {
                    return iE;
                }
                if (!a(this.i.getByte(0L))) {
                    throw syntaxError("Expected value");
                }
                b();
                this.h = 10;
                return 10;
            }
            if (i == 1) {
                this.i.readByte();
                this.h = 4;
                return 4;
            }
        }
        if (i == 1 || i == 2) {
            b();
            this.h = 7;
            return 7;
        }
        throw syntaxError("Unexpected value");
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
    private int c() throws IOException {
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
            str = Constants.NULL;
            str2 = "NULL";
            i = 7;
        }
        int length = str.length();
        int i2 = 1;
        while (i2 < length) {
            int i3 = i2 + 1;
            if (!this.k.request(i3)) {
                return 0;
            }
            byte b3 = this.i.getByte(i2);
            if (b3 != str.charAt(i2) && b3 != str2.charAt(i2)) {
                return 0;
            }
            i2 = i3;
        }
        if (this.k.request(length + 1) && a(this.i.getByte(length))) {
            return 0;
        }
        this.i.skip(length);
        this.h = i;
        return i;
    }

    private int e() throws IOException {
        char c2;
        boolean z = true;
        int i = 0;
        boolean z2 = true;
        int i2 = 0;
        char c3 = 0;
        boolean z3 = false;
        long j = 0;
        while (true) {
            int i3 = i2 + 1;
            if (!this.k.request(i3)) {
                break;
            }
            byte b2 = this.i.getByte(i2);
            if (b2 != 43) {
                if (b2 == 69 || b2 == 101) {
                    if (c3 != 2 && c3 != 4) {
                        return i;
                    }
                    c3 = 5;
                } else if (b2 == 45) {
                    c2 = 6;
                    if (c3 == 0) {
                        c3 = 1;
                        z3 = true;
                    } else if (c3 != 5) {
                        return i;
                    }
                } else if (b2 != 46) {
                    if (b2 < 48 || b2 > 57) {
                        if (!a(b2)) {
                            break;
                        }
                        return 0;
                    }
                    if (c3 == z || c3 == 0) {
                        j = -(b2 - 48);
                        c3 = 2;
                    } else if (c3 == 2) {
                        if (j == 0) {
                            return i;
                        }
                        long j2 = (10 * j) - ((long) (b2 - 48));
                        z2 &= j > okio.internal.Buffer.OVERFLOW_ZONE || (j == okio.internal.Buffer.OVERFLOW_ZONE && j2 < j);
                        j = j2;
                    } else if (c3 == 3) {
                        i = 0;
                        c3 = 4;
                    } else if (c3 == 5 || c3 == 6) {
                        i = 0;
                        c3 = 7;
                    }
                    i = 0;
                } else {
                    if (c3 != 2) {
                        return i;
                    }
                    c3 = 3;
                }
                i2 = i3;
                z = true;
            } else {
                c2 = 6;
                if (c3 != 5) {
                    return i;
                }
            }
            c3 = c2;
            i2 = i3;
            z = true;
        }
        if (c3 == 2 && z2 && ((j != Long.MIN_VALUE || z3) && (j != 0 || !z3))) {
            if (!z3) {
                j = -j;
            }
            this.j = j;
            this.i.skip(i2);
            this.h = 16;
            return 16;
        }
        if (c3 != 2 && c3 != 4 && c3 != 7) {
            return 0;
        }
        this.g = i2;
        this.h = 17;
        return 17;
    }

    private boolean a(int i) throws IOException {
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
                        case GolfCourseInfo.DATA_LENGTH /* 92 */:
                            break;
                        default:
                            return true;
                    }
                }
            }
        }
        b();
        return false;
    }

    @Override // com.airbnb.lottie.parser.moshi.JsonReader
    public String nextName() throws IOException {
        String strE;
        int iD = this.h;
        if (iD == 0) {
            iD = d();
        }
        if (iD == 14) {
            strE = a();
        } else if (iD == 13) {
            strE = e(f38030c);
        } else if (iD == 12) {
            strE = e(f38029b);
        } else if (iD == 15) {
            strE = this.f;
        } else {
            throw new iq("Expected a name but was " + peek() + " at path " + getPath());
        }
        this.h = 0;
        this.pathNames[this.stackSize - 1] = strE;
        return strE;
    }

    @Override // com.airbnb.lottie.parser.moshi.JsonReader
    public int selectName(JsonReader.d dVar) throws IOException {
        int iD = this.h;
        if (iD == 0) {
            iD = d();
        }
        if (iD < 12 || iD > 15) {
            return -1;
        }
        if (iD == 15) {
            return a(this.f, dVar);
        }
        int iSelect = this.k.select(dVar.f1952b);
        if (iSelect != -1) {
            this.h = 0;
            this.pathNames[this.stackSize - 1] = dVar.e[iSelect];
            return iSelect;
        }
        String str = this.pathNames[this.stackSize - 1];
        String strNextName = nextName();
        int iA = a(strNextName, dVar);
        if (iA == -1) {
            this.h = 15;
            this.f = strNextName;
            this.pathNames[this.stackSize - 1] = str;
        }
        return iA;
    }

    @Override // com.airbnb.lottie.parser.moshi.JsonReader
    public void skipName() throws IOException {
        if (this.failOnUnknown) {
            throw new iq("Cannot skip unexpected " + peek() + " at " + getPath());
        }
        int iD = this.h;
        if (iD == 0) {
            iD = d();
        }
        if (iD == 14) {
            f();
        } else if (iD == 13) {
            d(f38030c);
        } else if (iD == 12) {
            d(f38029b);
        } else if (iD != 15) {
            throw new iq("Expected a name but was " + peek() + " at path " + getPath());
        }
        this.h = 0;
        this.pathNames[this.stackSize - 1] = Constants.NULL;
    }

    private int a(String str, JsonReader.d dVar) {
        int length = dVar.e.length;
        for (int i = 0; i < length; i++) {
            if (str.equals(dVar.e[i])) {
                this.h = 0;
                this.pathNames[this.stackSize - 1] = str;
                return i;
            }
        }
        return -1;
    }

    @Override // com.airbnb.lottie.parser.moshi.JsonReader
    public String nextString() throws IOException {
        String utf8;
        int iD = this.h;
        if (iD == 0) {
            iD = d();
        }
        if (iD == 10) {
            utf8 = a();
        } else if (iD == 9) {
            utf8 = e(f38030c);
        } else if (iD == 8) {
            utf8 = e(f38029b);
        } else if (iD == 11) {
            utf8 = this.f;
            this.f = null;
        } else if (iD == 16) {
            utf8 = Long.toString(this.j);
        } else if (iD == 17) {
            utf8 = this.i.readUtf8(this.g);
        } else {
            throw new iq("Expected a string but was " + peek() + " at path " + getPath());
        }
        this.h = 0;
        int[] iArr = this.pathIndices;
        int i = this.stackSize - 1;
        iArr[i] = iArr[i] + 1;
        return utf8;
    }

    @Override // com.airbnb.lottie.parser.moshi.JsonReader
    public boolean nextBoolean() throws IOException {
        int iD = this.h;
        if (iD == 0) {
            iD = d();
        }
        if (iD == 5) {
            this.h = 0;
            int[] iArr = this.pathIndices;
            int i = this.stackSize - 1;
            iArr[i] = iArr[i] + 1;
            return true;
        }
        if (iD == 6) {
            this.h = 0;
            int[] iArr2 = this.pathIndices;
            int i2 = this.stackSize - 1;
            iArr2[i2] = iArr2[i2] + 1;
            return false;
        }
        throw new iq("Expected a boolean but was " + peek() + " at path " + getPath());
    }

    @Override // com.airbnb.lottie.parser.moshi.JsonReader
    public double nextDouble() throws IOException {
        int iD = this.h;
        if (iD == 0) {
            iD = d();
        }
        if (iD == 16) {
            this.h = 0;
            int[] iArr = this.pathIndices;
            int i = this.stackSize - 1;
            iArr[i] = iArr[i] + 1;
            return this.j;
        }
        if (iD == 17) {
            this.f = this.i.readUtf8(this.g);
        } else if (iD == 9) {
            this.f = e(f38030c);
        } else if (iD == 8) {
            this.f = e(f38029b);
        } else if (iD == 10) {
            this.f = a();
        } else if (iD != 11) {
            throw new iq("Expected a double but was " + peek() + " at path " + getPath());
        }
        this.h = 11;
        try {
            double d2 = Double.parseDouble(this.f);
            if (!this.lenient && (Double.isNaN(d2) || Double.isInfinite(d2))) {
                throw new it("JSON forbids NaN and infinities: " + d2 + " at path " + getPath());
            }
            this.f = null;
            this.h = 0;
            int[] iArr2 = this.pathIndices;
            int i2 = this.stackSize - 1;
            iArr2[i2] = iArr2[i2] + 1;
            return d2;
        } catch (NumberFormatException unused) {
            throw new iq("Expected a double but was " + this.f + " at path " + getPath());
        }
    }

    private String e(ByteString byteString) throws IOException {
        StringBuilder sb = null;
        while (true) {
            long jIndexOfElement = this.k.indexOfElement(byteString);
            if (jIndexOfElement == -1) {
                throw syntaxError("Unterminated string");
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
            sb.append(h());
        }
    }

    private String a() throws IOException {
        long jIndexOfElement = this.k.indexOfElement(f38028a);
        return jIndexOfElement != -1 ? this.i.readUtf8(jIndexOfElement) : this.i.readUtf8();
    }

    private void d(ByteString byteString) throws IOException {
        while (true) {
            long jIndexOfElement = this.k.indexOfElement(byteString);
            if (jIndexOfElement == -1) {
                throw syntaxError("Unterminated string");
            }
            if (this.i.getByte(jIndexOfElement) == 92) {
                this.i.skip(jIndexOfElement + 1);
                h();
            } else {
                this.i.skip(jIndexOfElement + 1);
                return;
            }
        }
    }

    private void f() throws IOException {
        long jIndexOfElement = this.k.indexOfElement(f38028a);
        Buffer buffer = this.i;
        if (jIndexOfElement == -1) {
            jIndexOfElement = buffer.size();
        }
        buffer.skip(jIndexOfElement);
    }

    @Override // com.airbnb.lottie.parser.moshi.JsonReader
    public int nextInt() throws IOException {
        String strE;
        int iD = this.h;
        if (iD == 0) {
            iD = d();
        }
        if (iD == 16) {
            long j = this.j;
            int i = (int) j;
            if (j != i) {
                throw new iq("Expected an int but was " + this.j + " at path " + getPath());
            }
            this.h = 0;
            int[] iArr = this.pathIndices;
            int i2 = this.stackSize - 1;
            iArr[i2] = iArr[i2] + 1;
            return i;
        }
        if (iD == 17) {
            this.f = this.i.readUtf8(this.g);
        } else if (iD == 9 || iD == 8) {
            if (iD == 9) {
                strE = e(f38030c);
            } else {
                strE = e(f38029b);
            }
            this.f = strE;
            try {
                int i3 = Integer.parseInt(strE);
                this.h = 0;
                int[] iArr2 = this.pathIndices;
                int i4 = this.stackSize - 1;
                iArr2[i4] = iArr2[i4] + 1;
                return i3;
            } catch (NumberFormatException unused) {
            }
        } else if (iD != 11) {
            throw new iq("Expected an int but was " + peek() + " at path " + getPath());
        }
        this.h = 11;
        try {
            double d2 = Double.parseDouble(this.f);
            int i5 = (int) d2;
            if (i5 != d2) {
                throw new iq("Expected an int but was " + this.f + " at path " + getPath());
            }
            this.f = null;
            this.h = 0;
            int[] iArr3 = this.pathIndices;
            int i6 = this.stackSize - 1;
            iArr3[i6] = iArr3[i6] + 1;
            return i5;
        } catch (NumberFormatException unused2) {
            throw new iq("Expected an int but was " + this.f + " at path " + getPath());
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.h = 0;
        this.scopes[0] = 8;
        this.stackSize = 1;
        this.i.clear();
        this.k.close();
    }

    @Override // com.airbnb.lottie.parser.moshi.JsonReader
    public void skipValue() throws IOException {
        if (this.failOnUnknown) {
            throw new iq("Cannot skip unexpected " + peek() + " at " + getPath());
        }
        int i = 0;
        do {
            int iD = this.h;
            if (iD == 0) {
                iD = d();
            }
            if (iD == 3) {
                pushScope(1);
            } else {
                if (iD == 1) {
                    pushScope(3);
                } else if (iD == 4) {
                    i--;
                    if (i < 0) {
                        throw new iq("Expected a value but was " + peek() + " at path " + getPath());
                    }
                    this.stackSize--;
                } else if (iD == 2) {
                    i--;
                    if (i < 0) {
                        throw new iq("Expected a value but was " + peek() + " at path " + getPath());
                    }
                    this.stackSize--;
                } else if (iD == 14 || iD == 10) {
                    f();
                } else if (iD == 9 || iD == 13) {
                    d(f38030c);
                } else if (iD == 8 || iD == 12) {
                    d(f38029b);
                } else if (iD == 17) {
                    this.i.skip(this.g);
                } else if (iD == 18) {
                    throw new iq("Expected a value but was " + peek() + " at path " + getPath());
                }
                this.h = 0;
            }
            i++;
            this.h = 0;
        } while (i != 0);
        int[] iArr = this.pathIndices;
        int i2 = this.stackSize - 1;
        iArr[i2] = iArr[i2] + 1;
        this.pathNames[this.stackSize - 1] = Constants.NULL;
    }

    private int d(boolean z) throws IOException {
        int i;
        long j;
        byte b2;
        while (true) {
            while (true) {
                int i2 = i + 1;
                if (!this.k.request(i2)) {
                    if (z) {
                        throw new EOFException("End of input");
                    }
                    return -1;
                }
                j = i;
                b2 = this.i.getByte(j);
                i = (b2 == 10 || b2 == 32 || b2 == 13 || b2 == 9) ? i2 : 0;
            }
            this.i.skip(j);
            if (b2 == 47) {
                if (this.k.request(2L)) {
                    b();
                    byte b3 = this.i.getByte(1L);
                    if (b3 == 42) {
                        this.i.readByte();
                        this.i.readByte();
                        if (!g()) {
                            throw syntaxError("Unterminated comment");
                        }
                    } else if (b3 == 47) {
                        this.i.readByte();
                        this.i.readByte();
                        i();
                    }
                }
                return b2;
            }
            if (b2 != 35) {
                return b2;
            }
            b();
            i();
        }
    }

    private void b() throws IOException {
        if (!this.lenient) {
            throw syntaxError("Use JsonReader.setLenient(true) to accept malformed JSON");
        }
    }

    private void i() throws IOException {
        long jIndexOfElement = this.k.indexOfElement(e);
        Buffer buffer = this.i;
        buffer.skip(jIndexOfElement != -1 ? jIndexOfElement + 1 : buffer.size());
    }

    private boolean g() throws IOException {
        BufferedSource bufferedSource = this.k;
        ByteString byteString = d;
        long jIndexOf = bufferedSource.indexOf(byteString);
        boolean z = jIndexOf != -1;
        Buffer buffer = this.i;
        buffer.skip(z ? jIndexOf + ((long) byteString.size()) : buffer.size());
        return z;
    }

    public String toString() {
        return "JsonReader(" + this.k + Constants.RIGHT_BRACKET_ONLY;
    }

    private char h() throws IOException {
        int i;
        if (!this.k.request(1L)) {
            throw syntaxError("Unterminated escape sequence");
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
            return '\r';
        }
        if (b2 == 116) {
            return '\t';
        }
        if (b2 == 117) {
            if (!this.k.request(4L)) {
                throw new EOFException("Unterminated escape sequence at path " + getPath());
            }
            char c2 = 0;
            for (int i2 = 0; i2 < 4; i2++) {
                byte b3 = this.i.getByte(i2);
                char c3 = (char) (c2 << 4);
                if (b3 >= 48 && b3 <= 57) {
                    i = b3 - 48;
                } else if (b3 >= 97 && b3 <= 102) {
                    i = b3 - 87;
                } else {
                    if (b3 < 65 || b3 > 70) {
                        throw syntaxError("\\u" + this.i.readUtf8(4L));
                    }
                    i = b3 - 55;
                }
                c2 = (char) (c3 + i);
            }
            this.i.skip(4L);
            return c2;
        }
        if (this.lenient) {
            return (char) b2;
        }
        throw syntaxError("Invalid escape sequence: \\" + ((char) b2));
    }
}
