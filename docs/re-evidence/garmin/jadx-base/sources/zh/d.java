package zh;

import ch.qos.logback.core.joran.action.ActionConst;
import com.apollographql.apollo3.exception.JsonDataException;
import com.apollographql.apollo3.exception.JsonEncodingException;
import com.google.firebase.messaging.l;
import com.google.maps.android.BuildConfig;
import java.io.EOFException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.apache.commons.lang3.BooleanUtils;
import org.apache.commons.lang3.CharUtils;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;
import p13.h0;
import v.e0;
import yc.l2;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0001\u0006B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lzh/d;", "Lzh/f;", "Lw63/g;", "source", "<init>", "(Lw63/g;)V", "a", "apollo-api"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class d implements f {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final w63.h f204727m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final w63.h f204728n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final w63.h f204729o;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final w63.g f204730a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final w63.e f204731b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f204732c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f204733d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f204734e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f204735f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int[] f204736g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f204737h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final String[] f204738i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int[] f204739j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final int[] f204740k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f204741l;

    static {
        new a(null);
        w63.h.f183361d.getClass();
        f204727m = w63.h.a.c("'\\");
        f204728n = w63.h.a.c("\"\\");
        f204729o = w63.h.a.c("{}[]:, \n\t\r/\\;#=");
    }

    public d(w63.g gVar) {
        gVar.getClass();
        this.f204730a = gVar;
        this.f204731b = gVar.getF183329b();
        int[] iArr = new int[256];
        iArr[0] = 6;
        this.f204736g = iArr;
        this.f204737h = 1;
        this.f204738i = new String[256];
        this.f204739j = new int[256];
        int[] iArr2 = new int[256];
        iArr2[0] = 0;
        this.f204740k = iArr2;
        this.f204741l = 1;
    }

    @Override // zh.f
    public final f A() {
        Integer numValueOf = Integer.valueOf(this.f204732c);
        if (numValueOf.intValue() == 0) {
            numValueOf = null;
        }
        if ((numValueOf != null ? numValueOf.intValue() : a()) != 2) {
            StringBuilder sb3 = new StringBuilder("Expected END_OBJECT but was ");
            sb3.append(getF204759c());
            l2.o(sb3, c());
            return null;
        }
        int i14 = this.f204737h;
        int i15 = i14 - 1;
        this.f204737h = i15;
        this.f204738i[i15] = null;
        int i16 = i14 - 2;
        int[] iArr = this.f204739j;
        iArr[i16] = iArr[i16] + 1;
        this.f204732c = 0;
        this.f204741l--;
        return this;
    }

    @Override // zh.f
    public final int S1(List<String> list) throws EOFException {
        list.getClass();
        if (list.isEmpty()) {
            return -1;
        }
        while (hasNext()) {
            String strNextName = nextName();
            int i14 = this.f204741l - 1;
            int[] iArr = this.f204740k;
            int i15 = iArr[i14];
            if (s.g(list.get(i15), strNextName)) {
                int i16 = this.f204741l;
                iArr[i16 - 1] = i15 + 1;
                if (iArr[i16 - 1] == list.size()) {
                    iArr[this.f204741l - 1] = 0;
                }
                return i15;
            }
            int i17 = i15;
            while (true) {
                i17++;
                if (i17 == list.size()) {
                    i17 = 0;
                }
                if (i17 == i15) {
                    break;
                }
                if (s.g(list.get(i17), strNextName)) {
                    int i18 = this.f204741l;
                    iArr[i18 - 1] = i17 + 1;
                    if (iArr[i18 - 1] == list.size()) {
                        iArr[this.f204741l - 1] = 0;
                    }
                    return i17;
                }
            }
            skipValue();
        }
        return -1;
    }

    /* JADX WARN: Code duplicated, block: B:112:0x0185 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:113:0x0186  */
    /* JADX WARN: Code duplicated, block: B:116:0x0197  */
    /* JADX WARN: Code duplicated, block: B:118:0x01a0 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:119:0x01a2  */
    /* JADX WARN: Code duplicated, block: B:124:0x01ad  */
    /* JADX WARN: Code duplicated, block: B:125:0x01b0  */
    /* JADX WARN: Code duplicated, block: B:127:0x01b6 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:129:0x01b9  */
    /* JADX WARN: Code duplicated, block: B:142:0x01d1 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:143:0x01d3  */
    /* JADX WARN: Code duplicated, block: B:144:0x01d5  */
    /* JADX WARN: Code duplicated, block: B:185:0x023c  */
    /* JADX WARN: Code duplicated, block: B:195:0x0257 A[DONT_INVERT, PHI: r3
      0x0257: PHI (r3v16 char) = (r3v15 char), (r3v17 char) binds: [B:184:0x023a, B:190:0x0247] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:196:0x0259  */
    /* JADX WARN: Code duplicated, block: B:202:0x0267 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:203:0x0268  */
    /* JADX WARN: Code duplicated, block: B:205:0x0275  */
    /* JADX WARN: Code duplicated, block: B:207:0x027b  */
    /* JADX WARN: Code duplicated, block: B:212:0x01a6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:216:0x0237 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:217:0x01a6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:218:0x01a6 A[SYNTHETIC] */
    public final int a() throws EOFException {
        String str;
        String str2;
        int i14;
        byte bJ;
        boolean z14;
        int i15;
        char c14;
        boolean z15;
        long j8;
        char c15;
        char c16;
        char c17;
        int i16;
        byte bJ2;
        char c18;
        byte b14;
        boolean z16;
        int i17 = this.f204737h - 1;
        int[] iArr = this.f204736g;
        int i18 = iArr[i17];
        char c19 = 5;
        w63.e eVar = this.f204731b;
        switch (i18) {
            case 1:
                iArr[i17] = 2;
                break;
            case 2:
                int iF = f(true);
                eVar.readByte();
                char c23 = (char) iF;
                if (c23 == ']') {
                    this.f204732c = 4;
                    return 4;
                }
                if (c23 != ',') {
                    s("Unterminated array");
                    throw null;
                }
                break;
            case 3:
            case 5:
                iArr[i17] = 4;
                if (i18 == 5) {
                    int iF2 = f(true);
                    eVar.readByte();
                    char c24 = (char) iF2;
                    if (c24 == '}') {
                        this.f204732c = 2;
                        return 2;
                    }
                    if (c24 != ',') {
                        s("Unterminated object");
                        throw null;
                    }
                }
                char cF = (char) f(true);
                if (cF == '\"') {
                    eVar.readByte();
                    this.f204732c = 13;
                    return 13;
                }
                if (cF != '}') {
                    s("Unexpected character: " + cF);
                    throw null;
                }
                if (i18 == 5) {
                    s("Expected name");
                    throw null;
                }
                eVar.readByte();
                this.f204732c = 2;
                return 2;
            case 4:
                iArr[i17] = 5;
                int iF3 = f(true);
                eVar.readByte();
                if (((char) iF3) != ':') {
                    s("Expected ':'");
                    throw null;
                }
                break;
            case 6:
                iArr[i17] = 7;
                break;
            case 7:
                if (f(false) == -1) {
                    this.f204732c = 17;
                    return 17;
                }
                s("Malformed JSON");
                throw null;
            default:
                if (i18 == 8) {
                    vb.h.z("JsonReader is closed");
                    return 0;
                }
                break;
        }
        char cF2 = (char) f(true);
        if (cF2 == ']') {
            if (i18 != 1) {
                s("Unexpected value");
                throw null;
            }
            eVar.readByte();
            this.f204732c = 4;
            return 4;
        }
        if (cF2 == ';' || cF2 == ',' || cF2 == '\'') {
            s("Unexpected value");
            throw null;
        }
        if (cF2 == '\"') {
            eVar.readByte();
            this.f204732c = 9;
            return 9;
        }
        if (cF2 == '[') {
            eVar.readByte();
            this.f204732c = 3;
            return 3;
        }
        if (cF2 == '{') {
            eVar.readByte();
            this.f204732c = 1;
            return 1;
        }
        long j14 = 0;
        byte bJ3 = eVar.j(0L);
        byte b15 = (byte) 116;
        w63.g gVar = this.f204730a;
        if (bJ3 == b15 || bJ3 == ((byte) 84)) {
            str = BooleanUtils.TRUE;
            str2 = "TRUE";
            i14 = 5;
        } else {
            if (bJ3 != ((byte) 102) && bJ3 != ((byte) 70)) {
                if (bJ3 == ((byte) 110) || bJ3 == ((byte) 78)) {
                    str = BuildConfig.TRAVIS;
                    str2 = ActionConst.NULL;
                    i14 = 7;
                } else {
                    j14 = 0;
                }
                i14 = 0;
                if (i14 != 0) {
                    return i14;
                }
                z14 = true;
                long j15 = j14;
                i15 = 0;
                c14 = 0;
                z15 = false;
                while (true) {
                    j8 = i15;
                    c15 = c14;
                    if (gVar.b(j8 + 1)) {
                        bJ2 = eVar.j(j8);
                        c18 = (char) bJ2;
                        if (c18 == '-') {
                            c16 = c15;
                            if (c18 == '+') {
                                if (c16 != c19) {
                                }
                                c14 = 6;
                                z16 = true;
                            } else if (c18 == 'e' || c18 == 'E') {
                                if (c16 != 2 || c16 == 4) {
                                    c14 = c19;
                                    z16 = true;
                                }
                            } else if (c18 == '.') {
                                b14 = (byte) 48;
                                if (bJ2 >= b14 || bJ2 > ((byte) 57)) {
                                    if (!e(c18)) {
                                    }
                                    if (i16 != 0) {
                                        return i16;
                                    }
                                    if (e((char) eVar.j(j14))) {
                                        s("Malformed JSON");
                                        throw null;
                                    }
                                    s("Expected value");
                                    throw null;
                                }
                                z16 = true;
                                if (c16 == 0 || c16 == 1) {
                                    j15 = -(bJ2 - b14);
                                    c14 = 2;
                                } else {
                                    if (c16 != 2) {
                                        if (c16 == 3) {
                                            c14 = 4;
                                        } else if (c16 == 5 || c16 == 6) {
                                            c14 = 7;
                                        }
                                    } else if (j15 != j14) {
                                        long j16 = (((long) 10) * j15) - ((long) (bJ2 - b14));
                                        z14 = (z14 && ((j15 > (-922337203685477580L) ? 1 : (j15 == (-922337203685477580L) ? 0 : -1)) > 0)) || (j15 == -922337203685477580L && j16 < j15);
                                        j15 = j16;
                                    }
                                    c14 = c16;
                                }
                            } else if (c16 == 2) {
                                c14 = 3;
                                z16 = true;
                            }
                            i16 = 0;
                            if (i16 != 0) {
                                return i16;
                            }
                            if (e((char) eVar.j(j14))) {
                                s("Expected value");
                                throw null;
                            }
                            s("Malformed JSON");
                            throw null;
                        }
                        if (c15 != 0) {
                            if (c15 != c19) {
                                i16 = 0;
                                if (i16 != 0) {
                                    return i16;
                                }
                                if (e((char) eVar.j(j14))) {
                                    s("Expected value");
                                    throw null;
                                }
                                s("Malformed JSON");
                                throw null;
                            }
                            c14 = 6;
                        } else {
                            c14 = 1;
                            z15 = true;
                        }
                        z16 = true;
                        i15++;
                        c19 = 5;
                    } else {
                        c16 = c15;
                    }
                    c17 = 2;
                    if (c16 != 2) {
                        if (c16 != c17 || c16 == 4 || c16 == 7) {
                            this.f204734e = i15;
                            i16 = 16;
                            this.f204732c = 16;
                        } else {
                            i16 = 0;
                        }
                    } else if (z14 || (j15 == Long.MIN_VALUE && !z15)) {
                        c17 = 2;
                        if (c16 != c17) {
                        }
                        this.f204734e = i15;
                        i16 = 16;
                        this.f204732c = 16;
                    } else {
                        if (!z15) {
                            j15 = -j15;
                        }
                        this.f204733d = j15;
                        eVar.skip(j8);
                        i16 = 15;
                        this.f204732c = 15;
                    }
                    if (i16 != 0) {
                        return i16;
                    }
                    if (e((char) eVar.j(j14))) {
                        s("Expected value");
                        throw null;
                    }
                    s("Malformed JSON");
                    throw null;
                }
            }
            str = BooleanUtils.FALSE;
            str2 = "FALSE";
            i14 = 6;
        }
        int length = str.length();
        int i19 = 1;
        while (true) {
            if (i19 < length) {
                long j17 = i19;
                if (gVar.b(j17 + 1) && ((bJ = eVar.j(j17)) == ((byte) str.charAt(i19)) || bJ == ((byte) str2.charAt(i19)))) {
                    i19++;
                }
            } else {
                long j18 = length;
                if (!gVar.b(j18 + 1) || !e((char) eVar.j(j18))) {
                    eVar.skip(j18);
                    this.f204732c = i14;
                }
            }
            i14 = 0;
        }
        if (i14 != 0) {
            return i14;
        }
        z14 = true;
        long j19 = j14;
        i15 = 0;
        c14 = 0;
        z15 = false;
        while (true) {
            j8 = i15;
            c15 = c14;
            if (gVar.b(j8 + 1)) {
                bJ2 = eVar.j(j8);
                c18 = (char) bJ2;
                if (c18 == '-') {
                    c16 = c15;
                    if (c18 == '+') {
                        if (c16 != c19) {
                        }
                        c14 = 6;
                        z16 = true;
                    } else {
                        if (c18 == 'e') {
                            if (c18 == '.') {
                                b14 = (byte) 48;
                                if (bJ2 >= b14) {
                                }
                                if (!e(c18)) {
                                }
                                if (i16 != 0) {
                                    return i16;
                                }
                                if (e((char) eVar.j(j14))) {
                                    s("Expected value");
                                    throw null;
                                }
                                s("Malformed JSON");
                                throw null;
                            }
                            if (c16 == 2) {
                                c14 = 3;
                                z16 = true;
                            }
                        }
                        if (c16 != 2) {
                        }
                        c14 = c19;
                        z16 = true;
                    }
                    i16 = 0;
                    if (i16 != 0) {
                        return i16;
                    }
                    if (e((char) eVar.j(j14))) {
                        s("Expected value");
                        throw null;
                    }
                    s("Malformed JSON");
                    throw null;
                }
                if (c15 != 0) {
                    if (c15 != c19) {
                        i16 = 0;
                        if (i16 != 0) {
                            return i16;
                        }
                        if (e((char) eVar.j(j14))) {
                            s("Expected value");
                            throw null;
                        }
                        s("Malformed JSON");
                        throw null;
                    }
                    c14 = 6;
                } else {
                    c14 = 1;
                    z15 = true;
                }
                z16 = true;
                i15++;
                c19 = 5;
            } else {
                c16 = c15;
            }
            c17 = 2;
            if (c16 != 2) {
                if (c16 != c17) {
                }
                this.f204734e = i15;
                i16 = 16;
                this.f204732c = 16;
            } else {
                if (z14) {
                }
                c17 = 2;
                if (c16 != c17) {
                }
                this.f204734e = i15;
                i16 = 16;
                this.f204732c = 16;
            }
            if (i16 != 0) {
                return i16;
            }
            if (e((char) eVar.j(j14))) {
                s("Expected value");
                throw null;
            }
            s("Malformed JSON");
            throw null;
        }
    }

    @Override // zh.f
    public final e a3() throws EOFException {
        String strNextString = nextString();
        strNextString.getClass();
        return new e(strNextString);
    }

    public final String c() {
        return h0.k0(getPath(), ".", null, null, null, 62);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.f204732c = 0;
        this.f204736g[0] = 8;
        this.f204737h = 1;
        this.f204731b.a();
        this.f204730a.close();
    }

    public final boolean e(char c14) {
        if (c14 != '/' && c14 != '\\' && c14 != ';' && c14 != '#' && c14 != '=') {
            return !(c14 == '{' || c14 == '}' || c14 == '[' || c14 == ']' || c14 == ':' || c14 == ',' || c14 == ' ' || c14 == '\t' || c14 == '\r' || c14 == '\n');
        }
        s("Unexpected character: " + c14);
        throw null;
    }

    public final int f(boolean z14) throws EOFException {
        int i14 = 0;
        while (true) {
            long j8 = i14;
            w63.g gVar = this.f204730a;
            if (!gVar.b(j8 + 1)) {
                if (z14) {
                    throw new EOFException("End of input");
                }
                return -1;
            }
            i14++;
            w63.e eVar = this.f204731b;
            byte bJ = eVar.j(j8);
            if (bJ != 10 && bJ != 32 && bJ != 13 && bJ != 9) {
                eVar.skip(((long) i14) - 1);
                if (bJ == 47) {
                    if (gVar.b(2L)) {
                        s("Malformed JSON");
                        throw null;
                    }
                } else if (bJ == 35) {
                    s("Malformed JSON");
                    throw null;
                }
                return bJ;
            }
        }
    }

    @Override // zh.f
    public final f g() {
        Integer numValueOf = Integer.valueOf(this.f204732c);
        if (numValueOf.intValue() == 0) {
            numValueOf = null;
        }
        if ((numValueOf != null ? numValueOf.intValue() : a()) != 4) {
            StringBuilder sb3 = new StringBuilder("Expected END_ARRAY but was ");
            sb3.append(getF204759c());
            l2.o(sb3, c());
            return null;
        }
        int i14 = this.f204737h;
        this.f204737h = i14 - 1;
        int i15 = i14 - 2;
        int[] iArr = this.f204739j;
        iArr[i15] = iArr[i15] + 1;
        this.f204732c = 0;
        return this;
    }

    @Override // zh.f
    public final ArrayList getPath() {
        ai.b bVar = ai.b.f3307a;
        int i14 = this.f204737h;
        bVar.getClass();
        return ai.b.a(i14, this.f204736g, this.f204738i, this.f204739j);
    }

    @Override // zh.f
    public final boolean hasNext() {
        Integer numValueOf = Integer.valueOf(this.f204732c);
        if (numValueOf.intValue() == 0) {
            numValueOf = null;
        }
        int iIntValue = numValueOf != null ? numValueOf.intValue() : a();
        return (iIntValue == 2 || iIntValue == 4) ? false : true;
    }

    public final String j(w63.h hVar) throws EOFException {
        StringBuilder sb3 = null;
        while (true) {
            long jT1 = this.f204730a.t1(hVar);
            if (jT1 == -1) {
                s("Unterminated string");
                throw null;
            }
            w63.e eVar = this.f204731b;
            if (eVar.j(jT1) != ((byte) 92)) {
                if (sb3 == null) {
                    String strW = eVar.w(jT1, d53.c.f57666b);
                    eVar.readByte();
                    return strW;
                }
                sb3.append(eVar.w(jT1, d53.c.f57666b));
                eVar.readByte();
                return sb3.toString();
            }
            if (sb3 == null) {
                sb3 = new StringBuilder();
            }
            sb3.append(eVar.w(jT1, d53.c.f57666b));
            eVar.readByte();
            sb3.append(n());
        }
    }

    public final String k() {
        long jT1 = this.f204730a.t1(f204729o);
        w63.e eVar = this.f204731b;
        if (jT1 == -1) {
            return eVar.x();
        }
        eVar.getClass();
        return eVar.w(jT1, d53.c.f57666b);
    }

    public final void l(int i14) {
        int i15 = this.f204737h;
        int[] iArr = this.f204736g;
        if (i15 != iArr.length) {
            this.f204737h = i15 + 1;
            iArr[i15] = i14;
        } else {
            throw new JsonDataException("Nesting too deep at " + getPath());
        }
    }

    public final char n() throws EOFException {
        int i14;
        w63.g gVar = this.f204730a;
        if (!gVar.b(1L)) {
            s("Unterminated escape sequence");
            throw null;
        }
        w63.e eVar = this.f204731b;
        char c14 = (char) eVar.readByte();
        if (c14 != 'u') {
            if (c14 == 't') {
                return '\t';
            }
            if (c14 == 'b') {
                return '\b';
            }
            if (c14 == 'n') {
                return '\n';
            }
            if (c14 == 'r') {
                return CharUtils.CR;
            }
            if (c14 == 'f') {
                return '\f';
            }
            if (c14 == '\n' || c14 == '\'' || c14 == '\"' || c14 == '\\' || c14 == '/') {
                return c14;
            }
            s("Invalid escape sequence: \\" + c14);
            throw null;
        }
        if (!gVar.b(4L)) {
            l.p(getPath(), "Unterminated escape sequence at path ");
            return (char) 0;
        }
        char c15 = (char) 0;
        for (int i15 = 0; i15 < 4; i15++) {
            byte bJ = eVar.j(i15);
            char c16 = (char) (c15 << 4);
            byte b14 = (byte) 48;
            if (bJ < b14 || bJ > ((byte) 57)) {
                byte b15 = (byte) 97;
                if ((bJ < b15 || bJ > ((byte) 102)) && (bJ < (b15 = (byte) 65) || bJ > ((byte) 70))) {
                    s("\\u".concat(eVar.w(4L, d53.c.f57666b)));
                    throw null;
                }
                i14 = (bJ - b15) + 10;
            } else {
                i14 = bJ - b14;
            }
            c15 = (char) (c16 + i14);
        }
        eVar.skip(4L);
        return c15;
    }

    @Override // zh.f
    public final boolean nextBoolean() {
        Integer numValueOf = Integer.valueOf(this.f204732c);
        if (numValueOf.intValue() == 0) {
            numValueOf = null;
        }
        int iIntValue = numValueOf != null ? numValueOf.intValue() : a();
        int[] iArr = this.f204739j;
        if (iIntValue == 5) {
            this.f204732c = 0;
            int i14 = this.f204737h - 1;
            iArr[i14] = iArr[i14] + 1;
            return true;
        }
        if (iIntValue == 6) {
            this.f204732c = 0;
            int i15 = this.f204737h - 1;
            iArr[i15] = iArr[i15] + 1;
            return false;
        }
        StringBuilder sb3 = new StringBuilder("Expected a boolean but was ");
        sb3.append(getF204759c());
        l2.o(sb3, c());
        return false;
    }

    @Override // zh.f
    public final double nextDouble() {
        Integer numValueOf = Integer.valueOf(this.f204732c);
        if (numValueOf.intValue() == 0) {
            numValueOf = null;
        }
        int iIntValue = numValueOf != null ? numValueOf.intValue() : a();
        int[] iArr = this.f204739j;
        if (iIntValue == 15) {
            this.f204732c = 0;
            int i14 = this.f204737h - 1;
            iArr[i14] = iArr[i14] + 1;
            return this.f204733d;
        }
        if (iIntValue == 16) {
            long j8 = this.f204734e;
            w63.e eVar = this.f204731b;
            eVar.getClass();
            this.f204735f = eVar.w(j8, d53.c.f57666b);
        } else if (iIntValue == 9) {
            this.f204735f = j(f204728n);
        } else if (iIntValue == 8) {
            this.f204735f = j(f204727m);
        } else if (iIntValue == 10) {
            this.f204735f = k();
        } else if (iIntValue != 11) {
            StringBuilder sb3 = new StringBuilder("Expected a double but was ");
            sb3.append(getF204759c());
            l2.o(sb3, c());
            return 0.0d;
        }
        this.f204732c = 11;
        try {
            String str = this.f204735f;
            str.getClass();
            double d14 = Double.parseDouble(str);
            if (Double.isNaN(d14) || Double.isInfinite(d14)) {
                StringBuilder sbA = com.airbnb.lottie.parser.moshi.a.a("JSON forbids NaN and infinities: ", d14, " at path ");
                sbA.append(c());
                throw new JsonEncodingException(sbA.toString());
            }
            this.f204735f = null;
            this.f204732c = 0;
            int i15 = this.f204737h - 1;
            iArr[i15] = iArr[i15] + 1;
            return d14;
        } catch (NumberFormatException unused) {
            l2.s("Expected a double but was ", this.f204735f, c());
            return 0.0d;
        }
    }

    @Override // zh.f
    public final int nextInt() throws EOFException {
        int i14 = this.f204732c;
        Integer numValueOf = Integer.valueOf(i14);
        if (i14 == 0) {
            numValueOf = null;
        }
        int iIntValue = numValueOf != null ? numValueOf.intValue() : a();
        int[] iArr = this.f204739j;
        if (iIntValue == 15) {
            long j8 = this.f204733d;
            int i15 = (int) j8;
            if (j8 == i15) {
                this.f204732c = 0;
                int i16 = this.f204737h - 1;
                iArr[i16] = iArr[i16] + 1;
                return i15;
            }
            throw new JsonDataException("Expected an int but was " + this.f204733d + " at path " + getPath());
        }
        if (iIntValue == 16) {
            long j14 = this.f204734e;
            w63.e eVar = this.f204731b;
            eVar.getClass();
            this.f204735f = eVar.w(j14, d53.c.f57666b);
        } else if (iIntValue == 9 || iIntValue == 8) {
            String strJ = j(iIntValue == 9 ? f204728n : f204727m);
            this.f204735f = strJ;
            try {
                int i17 = Integer.parseInt(strJ);
                this.f204732c = 0;
                int i18 = this.f204737h - 1;
                iArr[i18] = iArr[i18] + 1;
                return i17;
            } catch (NumberFormatException unused) {
            }
        } else if (iIntValue != 11) {
            StringBuilder sb3 = new StringBuilder("Expected an int but was ");
            sb3.append(getF204759c());
            l2.o(sb3, c());
            return 0;
        }
        this.f204732c = 11;
        try {
            String str = this.f204735f;
            str.getClass();
            double d14 = Double.parseDouble(str);
            int i19 = (int) d14;
            if (i19 != d14) {
                l2.s("Expected an int but was ", this.f204735f, c());
                return 0;
            }
            this.f204735f = null;
            this.f204732c = 0;
            int i24 = this.f204737h - 1;
            iArr[i24] = iArr[i24] + 1;
            return i19;
        } catch (NumberFormatException unused2) {
            l2.s("Expected an int but was ", this.f204735f, c());
            return 0;
        }
    }

    @Override // zh.f
    public final long nextLong() throws EOFException {
        Integer numValueOf = Integer.valueOf(this.f204732c);
        if (numValueOf.intValue() == 0) {
            numValueOf = null;
        }
        int iIntValue = numValueOf != null ? numValueOf.intValue() : a();
        int[] iArr = this.f204739j;
        if (iIntValue == 15) {
            this.f204732c = 0;
            int i14 = this.f204737h - 1;
            iArr[i14] = iArr[i14] + 1;
            return this.f204733d;
        }
        if (iIntValue == 16) {
            long j8 = this.f204734e;
            w63.e eVar = this.f204731b;
            eVar.getClass();
            this.f204735f = eVar.w(j8, d53.c.f57666b);
        } else if (iIntValue == 9 || iIntValue == 8) {
            String strJ = j(iIntValue == 9 ? f204728n : f204727m);
            this.f204735f = strJ;
            try {
                long j14 = Long.parseLong(strJ);
                this.f204732c = 0;
                int i15 = this.f204737h - 1;
                iArr[i15] = iArr[i15] + 1;
                return j14;
            } catch (NumberFormatException unused) {
            }
        } else if (iIntValue != 11) {
            StringBuilder sb3 = new StringBuilder("Expected a long but was ");
            sb3.append(getF204759c());
            l2.o(sb3, c());
            return 0L;
        }
        this.f204732c = 11;
        try {
            String str = this.f204735f;
            str.getClass();
            double d14 = Double.parseDouble(str);
            long j15 = (long) d14;
            if (j15 != d14) {
                l2.s("Expected a long but was ", this.f204735f, c());
                return 0L;
            }
            this.f204735f = null;
            this.f204732c = 0;
            int i16 = this.f204737h - 1;
            iArr[i16] = iArr[i16] + 1;
            return j15;
        } catch (NumberFormatException unused2) {
            l2.s("Expected a long but was ", this.f204735f, c());
            return 0L;
        }
    }

    @Override // zh.f
    public final String nextName() throws EOFException {
        String strJ;
        Integer numValueOf = Integer.valueOf(this.f204732c);
        if (numValueOf.intValue() == 0) {
            numValueOf = null;
        }
        switch (numValueOf != null ? numValueOf.intValue() : a()) {
            case 12:
                strJ = j(f204727m);
                break;
            case 13:
                strJ = j(f204728n);
                break;
            case 14:
                strJ = k();
                break;
            default:
                StringBuilder sb3 = new StringBuilder("Expected a name but was ");
                sb3.append(getF204759c());
                l2.o(sb3, c());
                return null;
        }
        this.f204732c = 0;
        this.f204738i[this.f204737h - 1] = strJ;
        return strJ;
    }

    @Override // zh.f
    public final void nextNull() {
        int i14 = this.f204732c;
        Integer numValueOf = Integer.valueOf(i14);
        if (i14 == 0) {
            numValueOf = null;
        }
        if ((numValueOf != null ? numValueOf.intValue() : a()) != 7) {
            StringBuilder sb3 = new StringBuilder("Expected null but was ");
            sb3.append(getF204759c());
            l2.o(sb3, c());
        } else {
            this.f204732c = 0;
            int i15 = this.f204737h - 1;
            int[] iArr = this.f204739j;
            iArr[i15] = iArr[i15] + 1;
        }
    }

    @Override // zh.f
    public final String nextString() throws EOFException {
        Integer numValueOf = Integer.valueOf(this.f204732c);
        String strValueOf = null;
        if (numValueOf.intValue() == 0) {
            numValueOf = null;
        }
        int iIntValue = numValueOf != null ? numValueOf.intValue() : a();
        if (iIntValue == 15) {
            strValueOf = String.valueOf(this.f204733d);
        } else if (iIntValue != 16) {
            switch (iIntValue) {
                case 8:
                    strValueOf = j(f204727m);
                    break;
                case 9:
                    strValueOf = j(f204728n);
                    break;
                case 10:
                    strValueOf = k();
                    break;
                case 11:
                    String str = this.f204735f;
                    if (str != null) {
                        this.f204735f = null;
                        strValueOf = str;
                    }
                    break;
                default:
                    StringBuilder sb3 = new StringBuilder("Expected a string but was ");
                    sb3.append(getF204759c());
                    l2.o(sb3, c());
                    return null;
            }
        } else {
            long j8 = this.f204734e;
            w63.e eVar = this.f204731b;
            eVar.getClass();
            strValueOf = eVar.w(j8, d53.c.f57666b);
        }
        this.f204732c = 0;
        int i14 = this.f204737h - 1;
        int[] iArr = this.f204739j;
        iArr[i14] = iArr[i14] + 1;
        return strValueOf;
    }

    public final void p(w63.h hVar) throws EOFException {
        while (true) {
            long jT1 = this.f204730a.t1(hVar);
            if (jT1 == -1) {
                s("Unterminated string");
                throw null;
            }
            w63.e eVar = this.f204731b;
            if (eVar.j(jT1) != ((byte) 92)) {
                eVar.skip(jT1 + 1);
                return;
            } else {
                eVar.skip(jT1 + 1);
                n();
            }
        }
    }

    @Override // zh.f
    /* JADX INFO: renamed from: peek */
    public final f.a getF204759c() {
        Integer numValueOf = Integer.valueOf(this.f204732c);
        if (numValueOf.intValue() == 0) {
            numValueOf = null;
        }
        switch (numValueOf != null ? numValueOf.intValue() : a()) {
            case 1:
                return f.a.BEGIN_OBJECT;
            case 2:
                return f.a.END_OBJECT;
            case 3:
                return f.a.BEGIN_ARRAY;
            case 4:
                return f.a.END_ARRAY;
            case 5:
            case 6:
                return f.a.BOOLEAN;
            case 7:
                return f.a.NULL;
            case 8:
            case 9:
            case 10:
            case 11:
                return f.a.STRING;
            case 12:
            case 13:
            case 14:
                return f.a.NAME;
            case 15:
                return f.a.LONG;
            case 16:
                return f.a.NUMBER;
            case 17:
                return f.a.END_DOCUMENT;
            default:
                e0.l();
                return null;
        }
    }

    @Override // zh.f
    public final f q() {
        Integer numValueOf = Integer.valueOf(this.f204732c);
        if (numValueOf.intValue() == 0) {
            numValueOf = null;
        }
        if ((numValueOf != null ? numValueOf.intValue() : a()) == 3) {
            l(1);
            this.f204739j[this.f204737h - 1] = 0;
            this.f204732c = 0;
            return this;
        }
        StringBuilder sb3 = new StringBuilder("Expected BEGIN_ARRAY but was ");
        sb3.append(getF204759c());
        l2.o(sb3, c());
        return null;
    }

    @Override // zh.f
    public final void rewind() {
        throw new IllegalStateException("BufferedSourceJsonReader cannot rewind.");
    }

    public final void s(String str) {
        StringBuilder sbI = sn.a.i(str, " at path ");
        sbI.append(getPath());
        throw new JsonEncodingException(sbI.toString());
    }

    @Override // zh.f
    public final void skipValue() throws EOFException {
        int i14 = 0;
        do {
            int i15 = this.f204732c;
            Integer numValueOf = Integer.valueOf(i15);
            if (i15 == 0) {
                numValueOf = null;
            }
            int iIntValue = numValueOf != null ? numValueOf.intValue() : a();
            w63.e eVar = this.f204731b;
            switch (iIntValue) {
                case 1:
                    l(3);
                    i14++;
                    break;
                case 2:
                    this.f204737h--;
                    i14--;
                    break;
                case 3:
                    l(1);
                    i14++;
                    break;
                case 4:
                    this.f204737h--;
                    i14--;
                    break;
                case 8:
                case 12:
                    p(f204727m);
                    break;
                case 9:
                case 13:
                    p(f204728n);
                    break;
                case 10:
                case 14:
                    long jT1 = this.f204730a.t1(f204729o);
                    if (jT1 == -1) {
                        jT1 = eVar.f183349b;
                    }
                    eVar.skip(jT1);
                    break;
                case 16:
                    eVar.skip(this.f204734e);
                    break;
            }
            this.f204732c = 0;
        } while (i14 != 0);
        int i16 = this.f204737h - 1;
        int[] iArr = this.f204739j;
        iArr[i16] = iArr[i16] + 1;
        this.f204738i[i16] = BuildConfig.TRAVIS;
    }

    @Override // zh.f
    public final f y() {
        Integer numValueOf = Integer.valueOf(this.f204732c);
        if (numValueOf.intValue() == 0) {
            numValueOf = null;
        }
        if ((numValueOf != null ? numValueOf.intValue() : a()) != 1) {
            StringBuilder sb3 = new StringBuilder("Expected BEGIN_OBJECT but was ");
            sb3.append(getF204759c());
            l2.o(sb3, c());
            return null;
        }
        l(3);
        this.f204732c = 0;
        int i14 = this.f204741l;
        this.f204741l = i14 + 1;
        this.f204740k[i14] = 0;
        return this;
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u001f\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0000X\u0080T¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\tR\u0014\u0010\u000e\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000e\u0010\tR\u0014\u0010\u000f\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000f\u0010\tR\u0014\u0010\u0010\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0010\u0010\tR\u0014\u0010\u0011\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0011\u0010\tR\u0014\u0010\u0012\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\tR\u0014\u0010\u0013\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0013\u0010\tR\u0014\u0010\u0014\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0014\u0010\tR\u0014\u0010\u0015\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0015\u0010\tR\u0014\u0010\u0016\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0016\u0010\tR\u0014\u0010\u0017\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0017\u0010\tR\u0014\u0010\u0018\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0018\u0010\tR\u0014\u0010\u0019\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0019\u0010\tR\u0014\u0010\u001a\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001a\u0010\tR\u0014\u0010\u001b\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001b\u0010\tR\u0014\u0010\u001c\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001c\u0010\tR\u0014\u0010\u001d\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001d\u0010\tR\u0014\u0010\u001e\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001e\u0010\tR\u0014\u0010\u001f\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001f\u0010\tR\u0014\u0010 \u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b \u0010\tR\u0014\u0010!\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b!\u0010\tR\u0014\u0010\"\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\"\u0010\tR\u0014\u0010#\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b#\u0010\tR\u0014\u0010$\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b$\u0010\tR\u0014\u0010%\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b%\u0010\tR\u0014\u0010&\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b&\u0010\tR\u0014\u0010'\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010\u0006R\u0014\u0010(\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010\u0006¨\u0006)"}, d2 = {"Lzh/d$a;", "", "<init>", "()V", "Lw63/h;", "DOUBLE_QUOTE_OR_SLASH", "Lw63/h;", "", "MAX_STACK_SIZE", "I", "", "MIN_INCOMPLETE_INTEGER", "J", "NUMBER_CHAR_DECIMAL", "NUMBER_CHAR_DIGIT", "NUMBER_CHAR_EXP_DIGIT", "NUMBER_CHAR_EXP_E", "NUMBER_CHAR_EXP_SIGN", "NUMBER_CHAR_FRACTION_DIGIT", "NUMBER_CHAR_NONE", "NUMBER_CHAR_SIGN", "PEEKED_BEGIN_ARRAY", "PEEKED_BEGIN_OBJECT", "PEEKED_BUFFERED", "PEEKED_DOUBLE_QUOTED", "PEEKED_DOUBLE_QUOTED_NAME", "PEEKED_END_ARRAY", "PEEKED_END_OBJECT", "PEEKED_EOF", "PEEKED_FALSE", "PEEKED_LONG", "PEEKED_NONE", "PEEKED_NULL", "PEEKED_NUMBER", "PEEKED_SINGLE_QUOTED", "PEEKED_SINGLE_QUOTED_NAME", "PEEKED_TRUE", "PEEKED_UNQUOTED", "PEEKED_UNQUOTED_NAME", "SINGLE_QUOTE_OR_SLASH", "UNQUOTED_STRING_TERMINALS", "apollo-api"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        private a() {
        }
    }
}
