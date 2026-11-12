package com.google.common.io;

import com.fasterxml.jackson.core.Base64Variants;
import com.google.common.annotations.GwtCompatible;
import com.google.common.annotations.GwtIncompatible;
import com.google.common.base.Ascii;
import com.google.common.base.Objects;
import com.google.common.base.Preconditions;
import com.google.common.math.IntMath;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Reader;
import java.io.Writer;
import java.math.RoundingMode;
import java.util.Arrays;
import org.checkerframework.checker.nullness.compatqual.MonotonicNonNullDecl;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* JADX INFO: loaded from: classes3.dex */
@GwtCompatible(emulated = true)
public abstract class BaseEncoding {
    private static final BaseEncoding a;
    private static final BaseEncoding b;
    private static final BaseEncoding c;
    private static final BaseEncoding d;
    private static final BaseEncoding e;

    public static final class DecodingException extends IOException {
        public DecodingException(String str) {
            super(str);
        }

        public DecodingException(Throwable th) {
            super(th);
        }
    }

    public class a extends ByteSink {
        public final /* synthetic */ CharSink a;

        public a(CharSink charSink) {
            this.a = charSink;
        }

        @Override // com.google.common.io.ByteSink
        public OutputStream openStream() throws IOException {
            return BaseEncoding.this.encodingStream(this.a.openStream());
        }
    }

    public class b extends ByteSource {
        public final /* synthetic */ CharSource a;

        public b(CharSource charSource) {
            this.a = charSource;
        }

        @Override // com.google.common.io.ByteSource
        public InputStream openStream() throws IOException {
            return BaseEncoding.this.decodingStream(this.a.openStream());
        }
    }

    public static class e extends Writer {
        public final /* synthetic */ Appendable a;
        public final /* synthetic */ Writer b;

        public e(Appendable appendable, Writer writer) {
            this.a = appendable;
            this.b = writer;
        }

        @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            this.b.close();
        }

        @Override // java.io.Writer, java.io.Flushable
        public void flush() throws IOException {
            this.b.flush();
        }

        @Override // java.io.Writer
        public void write(int i) throws IOException {
            this.a.append((char) i);
        }

        @Override // java.io.Writer
        public void write(char[] cArr, int i, int i2) throws IOException {
            throw new UnsupportedOperationException();
        }
    }

    public static final class f {
        private final String a;
        private final char[] b;
        public final int c;
        public final int d;
        public final int e;
        public final int f;
        private final byte[] g;
        private final boolean[] h;

        public f(String str, char[] cArr) {
            this.a = (String) Preconditions.checkNotNull(str);
            this.b = (char[]) Preconditions.checkNotNull(cArr);
            try {
                int iLog2 = IntMath.log2(cArr.length, RoundingMode.UNNECESSARY);
                this.d = iLog2;
                int iMin = Math.min(8, Integer.lowestOneBit(iLog2));
                try {
                    this.e = 8 / iMin;
                    this.f = iLog2 / iMin;
                    this.c = cArr.length - 1;
                    byte[] bArr = new byte[128];
                    Arrays.fill(bArr, (byte) -1);
                    for (int i = 0; i < cArr.length; i++) {
                        char c = cArr[i];
                        Preconditions.checkArgument(c < 128, "Non-ASCII character: %s", c);
                        Preconditions.checkArgument(bArr[c] == -1, "Duplicate character: %s", c);
                        bArr[c] = (byte) i;
                    }
                    this.g = bArr;
                    boolean[] zArr = new boolean[this.e];
                    for (int i2 = 0; i2 < this.f; i2++) {
                        zArr[IntMath.divide(i2 * 8, this.d, RoundingMode.CEILING)] = true;
                    }
                    this.h = zArr;
                } catch (ArithmeticException e) {
                    throw new IllegalArgumentException("Illegal alphabet " + new String(cArr), e);
                }
            } catch (ArithmeticException e2) {
                throw new IllegalArgumentException("Illegal alphabet length " + cArr.length, e2);
            }
        }

        private boolean e() {
            for (char c : this.b) {
                if (Ascii.isLowerCase(c)) {
                    return true;
                }
            }
            return false;
        }

        private boolean f() {
            for (char c : this.b) {
                if (Ascii.isUpperCase(c)) {
                    return true;
                }
            }
            return false;
        }

        public boolean b(char c) {
            return c <= 127 && this.g[c] != -1;
        }

        public int c(char c) throws DecodingException {
            if (c > 127) {
                throw new DecodingException("Unrecognized character: 0x" + Integer.toHexString(c));
            }
            byte b = this.g[c];
            if (b != -1) {
                return b;
            }
            if (c <= ' ' || c == 127) {
                throw new DecodingException("Unrecognized character: 0x" + Integer.toHexString(c));
            }
            throw new DecodingException("Unrecognized character: " + c);
        }

        public char d(int i) {
            return this.b[i];
        }

        public boolean equals(@NullableDecl Object obj) {
            if (obj instanceof f) {
                return Arrays.equals(this.b, ((f) obj).b);
            }
            return false;
        }

        public boolean g(int i) {
            return this.h[i % this.e];
        }

        public f h() {
            if (!f()) {
                return this;
            }
            Preconditions.checkState(!e(), "Cannot call lowerCase() on a mixed-case alphabet");
            char[] cArr = new char[this.b.length];
            int i = 0;
            while (true) {
                char[] cArr2 = this.b;
                if (i >= cArr2.length) {
                    return new f(this.a + ".lowerCase()", cArr);
                }
                cArr[i] = Ascii.toLowerCase(cArr2[i]);
                i++;
            }
        }

        public int hashCode() {
            return Arrays.hashCode(this.b);
        }

        public boolean i(char c) {
            byte[] bArr = this.g;
            return c < bArr.length && bArr[c] != -1;
        }

        public f j() {
            if (!e()) {
                return this;
            }
            Preconditions.checkState(!f(), "Cannot call upperCase() on a mixed-case alphabet");
            char[] cArr = new char[this.b.length];
            int i = 0;
            while (true) {
                char[] cArr2 = this.b;
                if (i >= cArr2.length) {
                    return new f(this.a + ".upperCase()", cArr);
                }
                cArr[i] = Ascii.toUpperCase(cArr2[i]);
                i++;
            }
        }

        public String toString() {
            return this.a;
        }
    }

    public static final class g extends j {
        public final char[] j;

        public g(String str, String str2) {
            this(new f(str, str2.toCharArray()));
        }

        @Override // com.google.common.io.BaseEncoding.j, com.google.common.io.BaseEncoding
        public int b(byte[] bArr, CharSequence charSequence) throws DecodingException {
            Preconditions.checkNotNull(bArr);
            if (charSequence.length() % 2 == 1) {
                throw new DecodingException("Invalid input length " + charSequence.length());
            }
            int i = 0;
            int i2 = 0;
            while (i < charSequence.length()) {
                bArr[i2] = (byte) ((this.f.c(charSequence.charAt(i)) << 4) | this.f.c(charSequence.charAt(i + 1)));
                i += 2;
                i2++;
            }
            return i2;
        }

        @Override // com.google.common.io.BaseEncoding.j, com.google.common.io.BaseEncoding
        public void c(Appendable appendable, byte[] bArr, int i, int i2) throws IOException {
            Preconditions.checkNotNull(appendable);
            Preconditions.checkPositionIndexes(i, i + i2, bArr.length);
            for (int i3 = 0; i3 < i2; i3++) {
                int i4 = bArr[i + i3] & 255;
                appendable.append(this.j[i4]);
                appendable.append(this.j[i4 | 256]);
            }
        }

        @Override // com.google.common.io.BaseEncoding.j
        public BaseEncoding l(f fVar, @NullableDecl Character ch) {
            return new g(fVar);
        }

        private g(f fVar) {
            super(fVar, null);
            this.j = new char[512];
            Preconditions.checkArgument(fVar.b.length == 16);
            for (int i = 0; i < 256; i++) {
                this.j[i] = fVar.d(i >>> 4);
                this.j[i | 256] = fVar.d(i & 15);
            }
        }
    }

    public static final class h extends j {
        public h(String str, String str2, @NullableDecl Character ch) {
            this(new f(str, str2.toCharArray()), ch);
        }

        @Override // com.google.common.io.BaseEncoding.j, com.google.common.io.BaseEncoding
        public int b(byte[] bArr, CharSequence charSequence) throws DecodingException {
            Preconditions.checkNotNull(bArr);
            CharSequence charSequenceJ = j(charSequence);
            if (!this.f.g(charSequenceJ.length())) {
                throw new DecodingException("Invalid input length " + charSequenceJ.length());
            }
            int i = 0;
            int i2 = 0;
            while (i < charSequenceJ.length()) {
                int i3 = i + 1;
                int i4 = i3 + 1;
                int iC = (this.f.c(charSequenceJ.charAt(i)) << 18) | (this.f.c(charSequenceJ.charAt(i3)) << 12);
                int i5 = i2 + 1;
                bArr[i2] = (byte) (iC >>> 16);
                if (i4 < charSequenceJ.length()) {
                    int i6 = i4 + 1;
                    int iC2 = iC | (this.f.c(charSequenceJ.charAt(i4)) << 6);
                    i2 = i5 + 1;
                    bArr[i5] = (byte) ((iC2 >>> 8) & 255);
                    if (i6 < charSequenceJ.length()) {
                        i4 = i6 + 1;
                        i5 = i2 + 1;
                        bArr[i2] = (byte) ((iC2 | this.f.c(charSequenceJ.charAt(i6))) & 255);
                    } else {
                        i = i6;
                    }
                }
                i2 = i5;
                i = i4;
            }
            return i2;
        }

        @Override // com.google.common.io.BaseEncoding.j, com.google.common.io.BaseEncoding
        public void c(Appendable appendable, byte[] bArr, int i, int i2) throws IOException {
            Preconditions.checkNotNull(appendable);
            int i3 = i + i2;
            Preconditions.checkPositionIndexes(i, i3, bArr.length);
            while (i2 >= 3) {
                int i4 = i + 1;
                int i5 = i4 + 1;
                int i6 = ((bArr[i] & 255) << 16) | ((bArr[i4] & 255) << 8) | (bArr[i5] & 255);
                appendable.append(this.f.d(i6 >>> 18));
                appendable.append(this.f.d((i6 >>> 12) & 63));
                appendable.append(this.f.d((i6 >>> 6) & 63));
                appendable.append(this.f.d(i6 & 63));
                i2 -= 3;
                i = i5 + 1;
            }
            if (i < i3) {
                k(appendable, bArr, i, i3 - i);
            }
        }

        @Override // com.google.common.io.BaseEncoding.j
        public BaseEncoding l(f fVar, @NullableDecl Character ch) {
            return new h(fVar, ch);
        }

        private h(f fVar, @NullableDecl Character ch) {
            super(fVar, ch);
            Preconditions.checkArgument(fVar.b.length == 64);
        }
    }

    public static final class i extends BaseEncoding {
        private final BaseEncoding f;
        private final String g;
        private final int h;

        public i(BaseEncoding baseEncoding, String str, int i) {
            this.f = (BaseEncoding) Preconditions.checkNotNull(baseEncoding);
            this.g = (String) Preconditions.checkNotNull(str);
            this.h = i;
            Preconditions.checkArgument(i > 0, "Cannot add a separator after every %s chars", i);
        }

        @Override // com.google.common.io.BaseEncoding
        public int b(byte[] bArr, CharSequence charSequence) throws DecodingException {
            StringBuilder sb = new StringBuilder(charSequence.length());
            for (int i = 0; i < charSequence.length(); i++) {
                char cCharAt = charSequence.charAt(i);
                if (this.g.indexOf(cCharAt) < 0) {
                    sb.append(cCharAt);
                }
            }
            return this.f.b(bArr, sb);
        }

        @Override // com.google.common.io.BaseEncoding
        public void c(Appendable appendable, byte[] bArr, int i, int i2) throws IOException {
            this.f.c(BaseEncoding.h(appendable, this.g, this.h), bArr, i, i2);
        }

        @Override // com.google.common.io.BaseEncoding
        public boolean canDecode(CharSequence charSequence) {
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < charSequence.length(); i++) {
                char cCharAt = charSequence.charAt(i);
                if (this.g.indexOf(cCharAt) < 0) {
                    sb.append(cCharAt);
                }
            }
            return this.f.canDecode(sb);
        }

        @Override // com.google.common.io.BaseEncoding
        @GwtIncompatible
        public InputStream decodingStream(Reader reader) {
            return this.f.decodingStream(BaseEncoding.e(reader, this.g));
        }

        @Override // com.google.common.io.BaseEncoding
        @GwtIncompatible
        public OutputStream encodingStream(Writer writer) {
            return this.f.encodingStream(BaseEncoding.i(writer, this.g, this.h));
        }

        @Override // com.google.common.io.BaseEncoding
        public int f(int i) {
            return this.f.f(i);
        }

        @Override // com.google.common.io.BaseEncoding
        public int g(int i) {
            int iG = this.f.g(i);
            return iG + (this.g.length() * IntMath.divide(Math.max(0, iG - 1), this.h, RoundingMode.FLOOR));
        }

        @Override // com.google.common.io.BaseEncoding
        public CharSequence j(CharSequence charSequence) {
            return this.f.j(charSequence);
        }

        @Override // com.google.common.io.BaseEncoding
        public BaseEncoding lowerCase() {
            return this.f.lowerCase().withSeparator(this.g, this.h);
        }

        @Override // com.google.common.io.BaseEncoding
        public BaseEncoding omitPadding() {
            return this.f.omitPadding().withSeparator(this.g, this.h);
        }

        public String toString() {
            return this.f + ".withSeparator(\"" + this.g + "\", " + this.h + ")";
        }

        @Override // com.google.common.io.BaseEncoding
        public BaseEncoding upperCase() {
            return this.f.upperCase().withSeparator(this.g, this.h);
        }

        @Override // com.google.common.io.BaseEncoding
        public BaseEncoding withPadChar(char c) {
            return this.f.withPadChar(c).withSeparator(this.g, this.h);
        }

        @Override // com.google.common.io.BaseEncoding
        public BaseEncoding withSeparator(String str, int i) {
            throw new UnsupportedOperationException("Already have a separator");
        }
    }

    public static class j extends BaseEncoding {
        public final f f;

        @NullableDecl
        public final Character g;

        @MonotonicNonNullDecl
        private transient BaseEncoding h;

        @MonotonicNonNullDecl
        private transient BaseEncoding i;

        public class a extends OutputStream {
            public int a = 0;
            public int b = 0;
            public int c = 0;
            public final /* synthetic */ Writer d;

            public a(Writer writer) {
                this.d = writer;
            }

            @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
            public void close() throws IOException {
                int i = this.b;
                if (i > 0) {
                    int i2 = this.a;
                    f fVar = j.this.f;
                    this.d.write(fVar.d((i2 << (fVar.d - i)) & fVar.c));
                    this.c++;
                    if (j.this.g != null) {
                        while (true) {
                            int i3 = this.c;
                            j jVar = j.this;
                            if (i3 % jVar.f.e == 0) {
                                break;
                            }
                            this.d.write(jVar.g.charValue());
                            this.c++;
                        }
                    }
                }
                this.d.close();
            }

            @Override // java.io.OutputStream, java.io.Flushable
            public void flush() throws IOException {
                this.d.flush();
            }

            @Override // java.io.OutputStream
            public void write(int i) throws IOException {
                int i2 = this.a << 8;
                this.a = i2;
                this.a = (i & 255) | i2;
                this.b += 8;
                while (true) {
                    int i3 = this.b;
                    f fVar = j.this.f;
                    int i4 = fVar.d;
                    if (i3 < i4) {
                        return;
                    }
                    this.d.write(fVar.d((this.a >> (i3 - i4)) & fVar.c));
                    this.c++;
                    this.b -= j.this.f.d;
                }
            }
        }

        public class b extends InputStream {
            public int a = 0;
            public int b = 0;
            public int c = 0;
            public boolean d = false;
            public final /* synthetic */ Reader e;

            public b(Reader reader) {
                this.e = reader;
            }

            @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
            public void close() throws IOException {
                this.e.close();
            }

            @Override // java.io.InputStream
            public int read() throws IOException {
                int i;
                while (true) {
                    int i2 = this.e.read();
                    if (i2 == -1) {
                        if (this.d || j.this.f.g(this.c)) {
                            return -1;
                        }
                        throw new DecodingException("Invalid input length " + this.c);
                    }
                    this.c++;
                    char c = (char) i2;
                    Character ch = j.this.g;
                    if (ch == null || ch.charValue() != c) {
                        if (this.d) {
                            throw new DecodingException("Expected padding character but found '" + c + "' at index " + this.c);
                        }
                        int i3 = this.a;
                        f fVar = j.this.f;
                        int i4 = i3 << fVar.d;
                        this.a = i4;
                        int iC = fVar.c(c) | i4;
                        this.a = iC;
                        int i5 = this.b + j.this.f.d;
                        this.b = i5;
                        if (i5 >= 8) {
                            int i6 = i5 - 8;
                            this.b = i6;
                            return (iC >> i6) & 255;
                        }
                    } else {
                        if (!this.d && ((i = this.c) == 1 || !j.this.f.g(i - 1))) {
                            throw new DecodingException("Padding cannot start at index " + this.c);
                        }
                        this.d = true;
                    }
                }
            }
        }

        public j(String str, String str2, @NullableDecl Character ch) {
            this(new f(str, str2.toCharArray()), ch);
        }

        @Override // com.google.common.io.BaseEncoding
        public int b(byte[] bArr, CharSequence charSequence) throws DecodingException {
            f fVar;
            Preconditions.checkNotNull(bArr);
            CharSequence charSequenceJ = j(charSequence);
            if (!this.f.g(charSequenceJ.length())) {
                throw new DecodingException("Invalid input length " + charSequenceJ.length());
            }
            int i = 0;
            int i2 = 0;
            while (i < charSequenceJ.length()) {
                long jC = 0;
                int i3 = 0;
                int i4 = 0;
                while (true) {
                    fVar = this.f;
                    if (i3 >= fVar.e) {
                        break;
                    }
                    jC <<= fVar.d;
                    if (i + i3 < charSequenceJ.length()) {
                        jC |= (long) this.f.c(charSequenceJ.charAt(i4 + i));
                        i4++;
                    }
                    i3++;
                }
                int i5 = fVar.f;
                int i6 = (i5 * 8) - (i4 * fVar.d);
                int i7 = (i5 - 1) * 8;
                while (i7 >= i6) {
                    bArr[i2] = (byte) ((jC >>> i7) & 255);
                    i7 -= 8;
                    i2++;
                }
                i += this.f.e;
            }
            return i2;
        }

        @Override // com.google.common.io.BaseEncoding
        public void c(Appendable appendable, byte[] bArr, int i, int i2) throws IOException {
            Preconditions.checkNotNull(appendable);
            Preconditions.checkPositionIndexes(i, i + i2, bArr.length);
            int i3 = 0;
            while (i3 < i2) {
                k(appendable, bArr, i + i3, Math.min(this.f.f, i2 - i3));
                i3 += this.f.f;
            }
        }

        @Override // com.google.common.io.BaseEncoding
        public boolean canDecode(CharSequence charSequence) {
            Preconditions.checkNotNull(charSequence);
            CharSequence charSequenceJ = j(charSequence);
            if (!this.f.g(charSequenceJ.length())) {
                return false;
            }
            for (int i = 0; i < charSequenceJ.length(); i++) {
                if (!this.f.b(charSequenceJ.charAt(i))) {
                    return false;
                }
            }
            return true;
        }

        @Override // com.google.common.io.BaseEncoding
        @GwtIncompatible
        public InputStream decodingStream(Reader reader) {
            Preconditions.checkNotNull(reader);
            return new b(reader);
        }

        @Override // com.google.common.io.BaseEncoding
        @GwtIncompatible
        public OutputStream encodingStream(Writer writer) {
            Preconditions.checkNotNull(writer);
            return new a(writer);
        }

        public boolean equals(@NullableDecl Object obj) {
            if (!(obj instanceof j)) {
                return false;
            }
            j jVar = (j) obj;
            return this.f.equals(jVar.f) && Objects.equal(this.g, jVar.g);
        }

        @Override // com.google.common.io.BaseEncoding
        public int f(int i) {
            return (int) (((((long) this.f.d) * ((long) i)) + 7) / 8);
        }

        @Override // com.google.common.io.BaseEncoding
        public int g(int i) {
            f fVar = this.f;
            return fVar.e * IntMath.divide(i, fVar.f, RoundingMode.CEILING);
        }

        public int hashCode() {
            return this.f.hashCode() ^ Objects.hashCode(this.g);
        }

        @Override // com.google.common.io.BaseEncoding
        public CharSequence j(CharSequence charSequence) {
            Preconditions.checkNotNull(charSequence);
            Character ch = this.g;
            if (ch == null) {
                return charSequence;
            }
            char cCharValue = ch.charValue();
            int length = charSequence.length() - 1;
            while (length >= 0 && charSequence.charAt(length) == cCharValue) {
                length--;
            }
            return charSequence.subSequence(0, length + 1);
        }

        public void k(Appendable appendable, byte[] bArr, int i, int i2) throws IOException {
            Preconditions.checkNotNull(appendable);
            Preconditions.checkPositionIndexes(i, i + i2, bArr.length);
            int i3 = 0;
            Preconditions.checkArgument(i2 <= this.f.f);
            long j = 0;
            for (int i4 = 0; i4 < i2; i4++) {
                j = (j | ((long) (bArr[i + i4] & 255))) << 8;
            }
            int i5 = ((i2 + 1) * 8) - this.f.d;
            while (i3 < i2 * 8) {
                f fVar = this.f;
                appendable.append(fVar.d(((int) (j >>> (i5 - i3))) & fVar.c));
                i3 += this.f.d;
            }
            if (this.g != null) {
                while (i3 < this.f.f * 8) {
                    appendable.append(this.g.charValue());
                    i3 += this.f.d;
                }
            }
        }

        public BaseEncoding l(f fVar, @NullableDecl Character ch) {
            return new j(fVar, ch);
        }

        @Override // com.google.common.io.BaseEncoding
        public BaseEncoding lowerCase() {
            BaseEncoding baseEncodingL = this.i;
            if (baseEncodingL == null) {
                f fVarH = this.f.h();
                baseEncodingL = fVarH == this.f ? this : l(fVarH, this.g);
                this.i = baseEncodingL;
            }
            return baseEncodingL;
        }

        @Override // com.google.common.io.BaseEncoding
        public BaseEncoding omitPadding() {
            return this.g == null ? this : l(this.f, null);
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("BaseEncoding.");
            sb.append(this.f.toString());
            if (8 % this.f.d != 0) {
                if (this.g == null) {
                    sb.append(".omitPadding()");
                } else {
                    sb.append(".withPadChar('");
                    sb.append(this.g);
                    sb.append("')");
                }
            }
            return sb.toString();
        }

        @Override // com.google.common.io.BaseEncoding
        public BaseEncoding upperCase() {
            BaseEncoding baseEncodingL = this.h;
            if (baseEncodingL == null) {
                f fVarJ = this.f.j();
                baseEncodingL = fVarJ == this.f ? this : l(fVarJ, this.g);
                this.h = baseEncodingL;
            }
            return baseEncodingL;
        }

        @Override // com.google.common.io.BaseEncoding
        public BaseEncoding withPadChar(char c) {
            Character ch;
            return (8 % this.f.d == 0 || ((ch = this.g) != null && ch.charValue() == c)) ? this : l(this.f, Character.valueOf(c));
        }

        @Override // com.google.common.io.BaseEncoding
        public BaseEncoding withSeparator(String str, int i) {
            for (int i2 = 0; i2 < str.length(); i2++) {
                Preconditions.checkArgument(!this.f.i(str.charAt(i2)), "Separator (%s) cannot contain alphabet characters", str);
            }
            Character ch = this.g;
            if (ch != null) {
                Preconditions.checkArgument(str.indexOf(ch.charValue()) < 0, "Separator (%s) cannot contain padding character", str);
            }
            return new i(this, str, i);
        }

        public j(f fVar, @NullableDecl Character ch) {
            this.f = (f) Preconditions.checkNotNull(fVar);
            Preconditions.checkArgument(ch == null || !fVar.i(ch.charValue()), "Padding character %s was already in alphabet", ch);
            this.g = ch;
        }
    }

    static {
        Character chValueOf = Character.valueOf(com.alipay.sdk.m.n.a.h);
        a = new h("base64()", Base64Variants.STD_BASE64_ALPHABET, chValueOf);
        b = new h("base64Url()", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789-_", chValueOf);
        c = new j("base32()", "ABCDEFGHIJKLMNOPQRSTUVWXYZ234567", chValueOf);
        d = new j("base32Hex()", "0123456789ABCDEFGHIJKLMNOPQRSTUV", chValueOf);
        e = new g("base16()", "0123456789ABCDEF");
    }

    public static BaseEncoding base16() {
        return e;
    }

    public static BaseEncoding base32() {
        return c;
    }

    public static BaseEncoding base32Hex() {
        return d;
    }

    public static BaseEncoding base64() {
        return a;
    }

    public static BaseEncoding base64Url() {
        return b;
    }

    private static byte[] d(byte[] bArr, int i2) {
        if (i2 == bArr.length) {
            return bArr;
        }
        byte[] bArr2 = new byte[i2];
        System.arraycopy(bArr, 0, bArr2, 0, i2);
        return bArr2;
    }

    @GwtIncompatible
    public static Reader e(Reader reader, String str) {
        Preconditions.checkNotNull(reader);
        Preconditions.checkNotNull(str);
        return new c(reader, str);
    }

    public static Appendable h(Appendable appendable, String str, int i2) {
        Preconditions.checkNotNull(appendable);
        Preconditions.checkNotNull(str);
        Preconditions.checkArgument(i2 > 0);
        return new d(i2, appendable, str);
    }

    @GwtIncompatible
    public static Writer i(Writer writer, String str, int i2) {
        return new e(h(writer, str, i2), writer);
    }

    public final byte[] a(CharSequence charSequence) throws DecodingException {
        CharSequence charSequenceJ = j(charSequence);
        byte[] bArr = new byte[f(charSequenceJ.length())];
        return d(bArr, b(bArr, charSequenceJ));
    }

    public abstract int b(byte[] bArr, CharSequence charSequence) throws DecodingException;

    public abstract void c(Appendable appendable, byte[] bArr, int i2, int i3) throws IOException;

    public abstract boolean canDecode(CharSequence charSequence);

    public final byte[] decode(CharSequence charSequence) {
        try {
            return a(charSequence);
        } catch (DecodingException e2) {
            throw new IllegalArgumentException(e2);
        }
    }

    @GwtIncompatible
    public final ByteSource decodingSource(CharSource charSource) {
        Preconditions.checkNotNull(charSource);
        return new b(charSource);
    }

    @GwtIncompatible
    public abstract InputStream decodingStream(Reader reader);

    public String encode(byte[] bArr) {
        return encode(bArr, 0, bArr.length);
    }

    @GwtIncompatible
    public final ByteSink encodingSink(CharSink charSink) {
        Preconditions.checkNotNull(charSink);
        return new a(charSink);
    }

    @GwtIncompatible
    public abstract OutputStream encodingStream(Writer writer);

    public abstract int f(int i2);

    public abstract int g(int i2);

    public CharSequence j(CharSequence charSequence) {
        return (CharSequence) Preconditions.checkNotNull(charSequence);
    }

    public abstract BaseEncoding lowerCase();

    public abstract BaseEncoding omitPadding();

    public abstract BaseEncoding upperCase();

    public abstract BaseEncoding withPadChar(char c2);

    public abstract BaseEncoding withSeparator(String str, int i2);

    public static class c extends Reader {
        public final /* synthetic */ Reader a;
        public final /* synthetic */ String b;

        public c(Reader reader, String str) {
            this.a = reader;
            this.b = str;
        }

        @Override // java.io.Reader, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            this.a.close();
        }

        @Override // java.io.Reader
        public int read() throws IOException {
            int i;
            do {
                i = this.a.read();
                if (i == -1) {
                    break;
                }
            } while (this.b.indexOf((char) i) >= 0);
            return i;
        }

        @Override // java.io.Reader
        public int read(char[] cArr, int i, int i2) throws IOException {
            throw new UnsupportedOperationException();
        }
    }

    public final String encode(byte[] bArr, int i2, int i3) {
        Preconditions.checkPositionIndexes(i2, i2 + i3, bArr.length);
        StringBuilder sb = new StringBuilder(g(i3));
        try {
            c(sb, bArr, i2, i3);
            return sb.toString();
        } catch (IOException e2) {
            throw new AssertionError(e2);
        }
    }

    public static class d implements Appendable {
        public int a;
        public final /* synthetic */ int b;
        public final /* synthetic */ Appendable c;
        public final /* synthetic */ String d;

        public d(int i, Appendable appendable, String str) {
            this.b = i;
            this.c = appendable;
            this.d = str;
            this.a = i;
        }

        @Override // java.lang.Appendable
        public Appendable append(char c) throws IOException {
            if (this.a == 0) {
                this.c.append(this.d);
                this.a = this.b;
            }
            this.c.append(c);
            this.a--;
            return this;
        }

        @Override // java.lang.Appendable
        public Appendable append(@NullableDecl CharSequence charSequence, int i, int i2) throws IOException {
            throw new UnsupportedOperationException();
        }

        @Override // java.lang.Appendable
        public Appendable append(@NullableDecl CharSequence charSequence) throws IOException {
            throw new UnsupportedOperationException();
        }
    }
}
