package zh;

import com.apollographql.apollo3.exception.JsonDataException;
import com.google.common.base.Ascii;
import com.google.maps.android.BuildConfig;
import org.apache.commons.lang3.BooleanUtils;
import org.apache.commons.text.StringSubstitutor;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p13.h0;
import vh.v0;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0001\bB\u001d\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Lzh/c;", "Lzh/g;", "Lw63/f;", "sink", "", "indent", "<init>", "(Lw63/f;Ljava/lang/String;)V", "a", "apollo-api"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class c implements g {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final a f204718h = new a(null);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final String[] f204719i;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final w63.f f204720a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f204721b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f204722c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int[] f204723d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String[] f204724e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int[] f204725f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public String f204726g;

    static {
        String[] strArr = new String[128];
        for (int i14 = 0; i14 < 32; i14++) {
            byte b14 = (byte) i14;
            f204718h.getClass();
            StringBuilder sb3 = new StringBuilder();
            sb3.append("0123456789abcdef".charAt(b14 >>> 4));
            sb3.append("0123456789abcdef".charAt(b14 & Ascii.SI));
            strArr[i14] = "\\u00".concat(sb3.toString());
        }
        strArr[34] = "\\\"";
        strArr[92] = "\\\\";
        strArr[9] = "\\t";
        strArr[8] = "\\b";
        strArr[10] = "\\n";
        strArr[13] = "\\r";
        f204719i = strArr;
    }

    public c(w63.f fVar, String str) {
        fVar.getClass();
        this.f204720a = fVar;
        this.f204721b = str;
        this.f204723d = new int[256];
        this.f204724e = new String[256];
        this.f204725f = new int[256];
        k(6);
    }

    @Override // zh.g
    public final g A() {
        c(3, 5, StringSubstitutor.DEFAULT_VAR_END);
        return this;
    }

    @Override // zh.g
    public final g P0(long j8) {
        e(String.valueOf(j8));
        return this;
    }

    @Override // zh.g
    public final g R0(int i14) {
        e(String.valueOf(i14));
        return this;
    }

    @Override // zh.g
    public final g S0(double d14) {
        if (!Double.isNaN(d14) && !Double.isInfinite(d14)) {
            e(String.valueOf(d14));
            return this;
        }
        throw new IllegalArgumentException(("Numeric values must be finite, but was " + d14).toString());
    }

    @Override // zh.g
    public final g U1(e eVar) {
        eVar.getClass();
        e(eVar.f204742a);
        return this;
    }

    public final void a() {
        int iJ = j();
        int[] iArr = this.f204723d;
        if (iJ == 1) {
            iArr[this.f204722c - 1] = 2;
            f();
            return;
        }
        w63.f fVar = this.f204720a;
        if (iJ == 2) {
            fVar.writeByte(44);
            f();
            return;
        }
        if (iJ == 4) {
            String str = this.f204721b;
            fVar.h1((str == null || str.length() == 0) ? ":" : ": ");
            iArr[this.f204722c - 1] = 5;
        } else if (iJ == 6) {
            iArr[this.f204722c - 1] = 7;
        } else if (iJ != 7) {
            vb.h.z("Nesting problem.");
        } else {
            vb.h.z("JSON must have only one top-level value.");
        }
    }

    public final void c(int i14, int i15, String str) {
        int iJ = j();
        if (iJ != i15 && iJ != i14) {
            vb.h.z("Nesting problem.");
            return;
        }
        if (this.f204726g != null) {
            o2.c.s(this.f204726g, "Dangling name: ");
            return;
        }
        int i16 = this.f204722c;
        int i17 = i16 - 1;
        this.f204722c = i17;
        this.f204724e[i17] = null;
        int i18 = i16 - 2;
        int[] iArr = this.f204725f;
        iArr[i18] = iArr[i18] + 1;
        if (iJ == i15) {
            f();
        }
        this.f204720a.h1(str);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f204720a.close();
        int i14 = this.f204722c;
        if (i14 > 1 || (i14 == 1 && this.f204723d[i14 - 1] != 7)) {
            vb.h.C("Incomplete document");
        } else {
            this.f204722c = 0;
        }
    }

    public final void e(String str) {
        str.getClass();
        l();
        a();
        this.f204720a.h1(str);
        int i14 = this.f204722c - 1;
        int[] iArr = this.f204725f;
        iArr[i14] = iArr[i14] + 1;
    }

    @Override // zh.g
    public final g e1(boolean z14) {
        e(z14 ? BooleanUtils.TRUE : BooleanUtils.FALSE);
        return this;
    }

    public final void f() {
        String str = this.f204721b;
        if (str == null) {
            return;
        }
        w63.f fVar = this.f204720a;
        fVar.writeByte(10);
        int i14 = this.f204722c;
        for (int i15 = 1; i15 < i14; i15++) {
            fVar.h1(str);
        }
    }

    @Override // zh.g
    public final g g() {
        c(1, 2, "]");
        return this;
    }

    @Override // zh.g
    public final String getPath() {
        ai.b bVar = ai.b.f3307a;
        int i14 = this.f204722c;
        bVar.getClass();
        return h0.k0(ai.b.a(i14, this.f204723d, this.f204724e, this.f204725f), ".", null, null, null, 62);
    }

    public final int j() {
        int i14 = this.f204722c;
        if (i14 != 0) {
            return this.f204723d[i14 - 1];
        }
        vb.h.z("JsonWriter is closed.");
        return 0;
    }

    public final void k(int i14) {
        int i15 = this.f204722c;
        int[] iArr = this.f204723d;
        if (i15 != iArr.length) {
            this.f204722c = i15 + 1;
            iArr[i15] = i14;
        } else {
            throw new JsonDataException("Nesting too deep at " + getPath() + ": circular reference?");
        }
    }

    @Override // zh.g
    public final g k0(v0 v0Var) {
        v0Var.getClass();
        l4();
        return this;
    }

    public final void l() {
        if (this.f204726g != null) {
            int iJ = j();
            w63.f fVar = this.f204720a;
            if (iJ == 5) {
                fVar.writeByte(44);
            } else if (iJ != 3) {
                vb.h.z("Nesting problem.");
                return;
            }
            f();
            this.f204723d[this.f204722c - 1] = 4;
            String str = this.f204726g;
            str.getClass();
            f204718h.getClass();
            a.a(fVar, str);
            this.f204726g = null;
        }
    }

    @Override // zh.g
    public final g l4() {
        e(BuildConfig.TRAVIS);
        return this;
    }

    @Override // zh.g
    public final g n0(String str) {
        str.getClass();
        l();
        a();
        f204718h.getClass();
        a.a(this.f204720a, str);
        int i14 = this.f204722c - 1;
        int[] iArr = this.f204725f;
        iArr[i14] = iArr[i14] + 1;
        return this;
    }

    @Override // zh.g
    public final g q() {
        l();
        a();
        k(1);
        this.f204725f[this.f204722c - 1] = 0;
        this.f204720a.h1("[");
        return this;
    }

    @Override // zh.g
    public final g v1(String str) {
        str.getClass();
        int i14 = this.f204722c;
        if (i14 == 0) {
            vb.h.z("JsonWriter is closed.");
            return null;
        }
        if (this.f204726g != null) {
            vb.h.z("Nesting problem.");
            return null;
        }
        this.f204726g = str;
        this.f204724e[i14 - 1] = str;
        return this;
    }

    @Override // zh.g
    public final g y() {
        l();
        a();
        k(3);
        this.f204725f[this.f204722c - 1] = 0;
        this.f204720a.h1("{");
        return this;
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u001c\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lzh/c$a;", "", "<init>", "()V", "", "HEX_ARRAY", "Ljava/lang/String;", "", "REPLACEMENT_CHARS", "[Ljava/lang/String;", "apollo-api"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        /* JADX WARN: Code duplicated, block: B:16:0x0031  */
        public static void a(w63.f fVar, String str) {
            String str2;
            fVar.getClass();
            str.getClass();
            String[] strArr = c.f204719i;
            fVar.writeByte(34);
            int length = str.length();
            int i14 = 0;
            for (int i15 = 0; i15 < length; i15++) {
                char cCharAt = str.charAt(i15);
                if (cCharAt < 128) {
                    str2 = strArr[cCharAt];
                    if (str2 != null) {
                        if (i14 < i15) {
                            fVar.d4(i14, i15, str);
                        }
                        fVar.h1(str2);
                        i14 = i15 + 1;
                    }
                } else {
                    if (cCharAt == 8232) {
                        str2 = "\\u2028";
                    } else if (cCharAt == 8233) {
                        str2 = "\\u2029";
                    }
                    if (i14 < i15) {
                        fVar.d4(i14, i15, str);
                    }
                    fVar.h1(str2);
                    i14 = i15 + 1;
                }
            }
            if (i14 < length) {
                fVar.d4(i14, length, str);
            }
            fVar.writeByte(34);
        }

        private a() {
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public c(w63.f fVar) {
        this(fVar, null, 2, 0 == true ? 1 : 0);
        fVar.getClass();
    }

    public /* synthetic */ c(w63.f fVar, String str, int i14, j jVar) {
        this(fVar, (i14 & 2) != 0 ? null : str);
    }
}
