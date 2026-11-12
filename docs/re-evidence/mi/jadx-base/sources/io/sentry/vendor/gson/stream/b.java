package io.sentry.vendor.gson.stream;

import java.io.Closeable;
import java.io.Flushable;
import java.io.IOException;
import java.io.Writer;
import java.util.Arrays;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@ApiStatus.Internal
public class b implements Closeable, Flushable {
    public static final String[] j = new String[128];

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final String[] f21916k;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Writer f21917a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int[] f21918b = new int[32];
    public int c = 0;
    public String d;
    public String e;
    public boolean f;
    public boolean g;
    public String h;
    public boolean i;

    static {
        for (int i = 0; i <= 31; i++) {
            j[i] = String.format("\\u%04x", Integer.valueOf(i));
        }
        String[] strArr = j;
        strArr[34] = "\\\"";
        strArr[92] = "\\\\";
        strArr[9] = "\\t";
        strArr[8] = "\\b";
        strArr[10] = "\\n";
        strArr[13] = "\\r";
        strArr[12] = "\\f";
        String[] strArr2 = (String[]) strArr.clone();
        f21916k = strArr2;
        strArr2[60] = "\\u003c";
        strArr2[62] = "\\u003e";
        strArr2[38] = "\\u0026";
        strArr2[61] = "\\u003d";
        strArr2[39] = "\\u0027";
    }

    public b(Writer writer) {
        J(6);
        this.e = ":";
        this.i = true;
        if (writer == null) {
            throw new NullPointerException("out == null");
        }
        this.f21917a = writer;
    }

    public final b D(int i, char c) throws IOException {
        b();
        J(i);
        this.f21917a.write(c);
        return this;
    }

    public final int E() {
        int i = this.c;
        if (i != 0) {
            return this.f21918b[i - 1];
        }
        throw new IllegalStateException("JsonWriter is closed.");
    }

    public final void J(int i) {
        int i2 = this.c;
        int[] iArr = this.f21918b;
        if (i2 == iArr.length) {
            this.f21918b = Arrays.copyOf(iArr, i2 * 2);
        }
        int[] iArr2 = this.f21918b;
        int i3 = this.c;
        this.c = i3 + 1;
        iArr2[i3] = i;
    }

    public final void K(int i) {
        this.f21918b[this.c - 1] = i;
    }

    public final void M(String str) {
        if (str.length() == 0) {
            this.d = null;
            this.e = ":";
        } else {
            this.d = str;
            this.e = ": ";
        }
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0034  */
    public final void N(String str) throws IOException {
        String str2;
        String[] strArr = this.g ? f21916k : j;
        this.f21917a.write(34);
        int length = str.length();
        int i = 0;
        for (int i2 = 0; i2 < length; i2++) {
            char cCharAt = str.charAt(i2);
            if (cCharAt < 128) {
                str2 = strArr[cCharAt];
                if (str2 != null) {
                    if (i < i2) {
                        this.f21917a.write(str, i, i2 - i);
                    }
                    this.f21917a.write(str2);
                    i = i2 + 1;
                }
            } else {
                if (cCharAt == 8232) {
                    str2 = "\\u2028";
                } else if (cCharAt == 8233) {
                    str2 = "\\u2029";
                }
                if (i < i2) {
                    this.f21917a.write(str, i, i2 - i);
                }
                this.f21917a.write(str2);
                i = i2 + 1;
            }
        }
        if (i < length) {
            this.f21917a.write(str, i, length - i);
        }
        this.f21917a.write(34);
    }

    public b O(double d) throws IOException {
        U();
        if (this.f || !(Double.isNaN(d) || Double.isInfinite(d))) {
            b();
            this.f21917a.append((CharSequence) Double.toString(d));
            return this;
        }
        throw new IllegalArgumentException("Numeric values must be finite, but was " + d);
    }

    public b P(long j2) throws IOException {
        U();
        b();
        this.f21917a.write(Long.toString(j2));
        return this;
    }

    public b Q(@Nullable Boolean bool) throws IOException {
        if (bool == null) {
            return y();
        }
        U();
        b();
        this.f21917a.write(bool.booleanValue() ? "true" : "false");
        return this;
    }

    public b R(@Nullable Number number) throws IOException {
        if (number == null) {
            return y();
        }
        U();
        String string = number.toString();
        if (this.f || !(string.equals("-Infinity") || string.equals("Infinity") || string.equals("NaN"))) {
            b();
            this.f21917a.append((CharSequence) string);
            return this;
        }
        throw new IllegalArgumentException("Numeric values must be finite, but was " + number);
    }

    public b S(@Nullable String str) throws IOException {
        if (str == null) {
            return y();
        }
        U();
        b();
        N(str);
        return this;
    }

    public b T(boolean z) throws IOException {
        U();
        b();
        this.f21917a.write(z ? "true" : "false");
        return this;
    }

    public final void U() throws IOException {
        if (this.h != null) {
            a();
            N(this.h);
            this.h = null;
        }
    }

    public final void a() throws IOException {
        int iE = E();
        if (iE == 5) {
            this.f21917a.write(44);
        } else if (iE != 3) {
            throw new IllegalStateException("Nesting problem.");
        }
        s();
        K(4);
    }

    public final void b() throws IOException {
        int iE = E();
        if (iE == 1) {
            K(2);
            s();
            return;
        }
        if (iE == 2) {
            this.f21917a.append(',');
            s();
        } else {
            if (iE == 4) {
                this.f21917a.append((CharSequence) this.e);
                K(5);
                return;
            }
            if (iE != 6) {
                if (iE != 7) {
                    throw new IllegalStateException("Nesting problem.");
                }
                if (!this.f) {
                    throw new IllegalStateException("JSON must have only one top-level value.");
                }
            }
            K(7);
        }
    }

    public b c() throws IOException {
        U();
        return D(1, AbstractJsonLexerKt.BEGIN_LIST);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f21917a.close();
        int i = this.c;
        if (i > 1 || (i == 1 && this.f21918b[i - 1] != 7)) {
            throw new IOException("Incomplete document");
        }
        this.c = 0;
    }

    public b d() throws IOException {
        U();
        return D(3, AbstractJsonLexerKt.BEGIN_OBJ);
    }

    @Override // java.io.Flushable
    public void flush() throws IOException {
        if (this.c == 0) {
            throw new IllegalStateException("JsonWriter is closed.");
        }
        this.f21917a.flush();
    }

    public final b l(int i, int i2, char c) throws IOException {
        int iE = E();
        if (iE != i2 && iE != i) {
            throw new IllegalStateException("Nesting problem.");
        }
        if (this.h != null) {
            throw new IllegalStateException("Dangling name: " + this.h);
        }
        this.c--;
        if (iE == i2) {
            s();
        }
        this.f21917a.write(c);
        return this;
    }

    public b m() throws IOException {
        return l(1, 2, AbstractJsonLexerKt.END_LIST);
    }

    public b n() throws IOException {
        return l(3, 5, AbstractJsonLexerKt.END_OBJ);
    }

    public b o(@Nullable String str) throws IOException {
        if (str == null) {
            return y();
        }
        U();
        b();
        this.f21917a.append((CharSequence) str);
        return this;
    }

    public b p(String str) throws IOException {
        if (str == null) {
            throw new NullPointerException("name == null");
        }
        if (this.h != null) {
            throw new IllegalStateException();
        }
        if (this.c == 0) {
            throw new IllegalStateException("JsonWriter is closed.");
        }
        this.h = str;
        return this;
    }

    public final void s() throws IOException {
        if (this.d == null) {
            return;
        }
        this.f21917a.write(10);
        int i = this.c;
        for (int i2 = 1; i2 < i; i2++) {
            this.f21917a.write(this.d);
        }
    }

    public final void setLenient(boolean z) {
        this.f = z;
    }

    public b y() throws IOException {
        if (this.h != null) {
            if (!this.i) {
                this.h = null;
                return this;
            }
            U();
        }
        b();
        this.f21917a.write(AbstractJsonLexerKt.NULL);
        return this;
    }
}
