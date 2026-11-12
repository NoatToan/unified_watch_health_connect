package com.google.common.io;

import com.google.common.base.Ascii;
import com.google.common.base.Preconditions;
import com.google.errorprone.annotations.concurrent.LazyInit;
import com.huawei.operation.utils.Constants;
import defpackage.apn;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Reader;
import java.io.Writer;
import java.math.RoundingMode;
import java.util.Arrays;
import java.util.Objects;
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes21.dex */
@ElementTypesAreNonnullByDefault
public abstract class BaseEncoding {
    private static final BaseEncoding BASE64 = new e("base64()", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/", '=');
    private static final BaseEncoding BASE64_URL = new e("base64Url()", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789-_", '=');
    private static final BaseEncoding BASE32 = new i("base32()", "ABCDEFGHIJKLMNOPQRSTUVWXYZ234567", '=');
    private static final BaseEncoding BASE32_HEX = new i("base32Hex()", "0123456789ABCDEFGHIJKLMNOPQRSTUV", '=');
    private static final BaseEncoding BASE16 = new d("base16()", "0123456789ABCDEF");

    public abstract boolean canDecode(CharSequence charSequence);

    abstract int decodeTo(byte[] bArr, CharSequence charSequence) throws b;

    public abstract InputStream decodingStream(Reader reader);

    abstract void encodeTo(Appendable appendable, byte[] bArr, int i2, int i3) throws IOException;

    public abstract OutputStream encodingStream(Writer writer);

    public abstract BaseEncoding ignoreCase();

    public abstract BaseEncoding lowerCase();

    abstract int maxDecodedSize(int i2);

    abstract int maxEncodedSize(int i2);

    public abstract BaseEncoding omitPadding();

    public abstract BaseEncoding upperCase();

    public abstract BaseEncoding withPadChar(char c2);

    public abstract BaseEncoding withSeparator(String str, int i2);

    BaseEncoding() {
    }

    public static final class b extends IOException {
        b(String str) {
            super(str);
        }
    }

    public String encode(byte[] bArr) {
        return encode(bArr, 0, bArr.length);
    }

    public final String encode(byte[] bArr, int i2, int i3) {
        Preconditions.checkPositionIndexes(i2, i2 + i3, bArr.length);
        StringBuilder sb = new StringBuilder(maxEncodedSize(i3));
        try {
            encodeTo(sb, bArr, i2, i3);
            return sb.toString();
        } catch (IOException e2) {
            throw new AssertionError(e2);
        }
    }

    public final ByteSink encodingSink(final CharSink charSink) {
        Preconditions.checkNotNull(charSink);
        return new ByteSink() { // from class: com.google.common.io.BaseEncoding.1
            @Override // com.google.common.io.ByteSink
            public OutputStream openStream() throws IOException {
                return BaseEncoding.this.encodingStream(charSink.openStream());
            }
        };
    }

    private static byte[] extract(byte[] bArr, int i2) {
        if (i2 == bArr.length) {
            return bArr;
        }
        byte[] bArr2 = new byte[i2];
        System.arraycopy(bArr, 0, bArr2, 0, i2);
        return bArr2;
    }

    public final byte[] decode(CharSequence charSequence) {
        try {
            return decodeChecked(charSequence);
        } catch (b e2) {
            throw new IllegalArgumentException(e2);
        }
    }

    final byte[] decodeChecked(CharSequence charSequence) throws b {
        CharSequence charSequenceTrimTrailingPadding = trimTrailingPadding(charSequence);
        byte[] bArr = new byte[maxDecodedSize(charSequenceTrimTrailingPadding.length())];
        return extract(bArr, decodeTo(bArr, charSequenceTrimTrailingPadding));
    }

    public final ByteSource decodingSource(final CharSource charSource) {
        Preconditions.checkNotNull(charSource);
        return new ByteSource() { // from class: com.google.common.io.BaseEncoding.4
            @Override // com.google.common.io.ByteSource
            public InputStream openStream() throws IOException {
                return BaseEncoding.this.decodingStream(charSource.openStream());
            }
        };
    }

    CharSequence trimTrailingPadding(CharSequence charSequence) {
        return (CharSequence) Preconditions.checkNotNull(charSequence);
    }

    public static BaseEncoding base64() {
        return BASE64;
    }

    public static BaseEncoding base64Url() {
        return BASE64_URL;
    }

    public static BaseEncoding base32() {
        return BASE32;
    }

    public static BaseEncoding base32Hex() {
        return BASE32_HEX;
    }

    public static BaseEncoding base16() {
        return BASE16;
    }

    static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final char[] f4583a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final int f4584b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final int f4585c;
        final int d;
        final int e;
        private final String f;
        private final boolean h;
        private final byte[] i;
        private final boolean[] j;

        a(String str, char[] cArr) {
            this(str, cArr, b(cArr), false);
        }

        private a(String str, char[] cArr, byte[] bArr, boolean z) {
            this.f = (String) Preconditions.checkNotNull(str);
            this.f4583a = (char[]) Preconditions.checkNotNull(cArr);
            try {
                int iB = apn.b(cArr.length, RoundingMode.UNNECESSARY);
                this.d = iB;
                int iNumberOfTrailingZeros = Integer.numberOfTrailingZeros(iB);
                int i = 1 << (3 - iNumberOfTrailingZeros);
                this.e = i;
                this.f4584b = iB >> iNumberOfTrailingZeros;
                this.f4585c = cArr.length - 1;
                this.i = bArr;
                boolean[] zArr = new boolean[i];
                for (int i2 = 0; i2 < this.f4584b; i2++) {
                    zArr[apn.d(i2 * 8, this.d, RoundingMode.CEILING)] = true;
                }
                this.j = zArr;
                this.h = z;
            } catch (ArithmeticException e) {
                throw new IllegalArgumentException("Illegal alphabet length " + cArr.length, e);
            }
        }

        private static byte[] b(char[] cArr) {
            byte[] bArr = new byte[128];
            Arrays.fill(bArr, (byte) -1);
            for (int i = 0; i < cArr.length; i++) {
                char c2 = cArr[i];
                boolean z = true;
                Preconditions.checkArgument(c2 < 128, "Non-ASCII character: %s", c2);
                if (bArr[c2] != -1) {
                    z = false;
                }
                Preconditions.checkArgument(z, "Duplicate character: %s", c2);
                bArr[c2] = (byte) i;
            }
            return bArr;
        }

        a a() {
            if (this.h) {
                return this;
            }
            byte[] bArr = this.i;
            byte[] bArrCopyOf = Arrays.copyOf(bArr, bArr.length);
            int i = 65;
            while (true) {
                if (i <= 90) {
                    int i2 = i | 32;
                    byte[] bArr2 = this.i;
                    byte b2 = bArr2[i];
                    byte b3 = bArr2[i2];
                    if (b2 == -1) {
                        bArrCopyOf[i] = b3;
                    } else {
                        Preconditions.checkState(b3 == -1, "Can't ignoreCase() since '%s' and '%s' encode different values", (char) i, (char) i2);
                        bArrCopyOf[i2] = b2;
                    }
                    i++;
                } else {
                    return new a(this.f + ".ignoreCase()", this.f4583a, bArrCopyOf, true);
                }
            }
        }

        char a(int i) {
            return this.f4583a[i];
        }

        boolean b(int i) {
            return this.j[i % this.e];
        }

        boolean a(char c2) {
            return c2 <= 127 && this.i[c2] != -1;
        }

        int b(char c2) throws b {
            if (c2 > 127) {
                throw new b("Unrecognized character: 0x" + Integer.toHexString(c2));
            }
            byte b2 = this.i[c2];
            if (b2 != -1) {
                return b2;
            }
            if (c2 <= ' ' || c2 == 127) {
                throw new b("Unrecognized character: 0x" + Integer.toHexString(c2));
            }
            throw new b("Unrecognized character: " + c2);
        }

        private boolean c() {
            for (char c2 : this.f4583a) {
                if (Ascii.isLowerCase(c2)) {
                    return true;
                }
            }
            return false;
        }

        private boolean d() {
            for (char c2 : this.f4583a) {
                if (Ascii.isUpperCase(c2)) {
                    return true;
                }
            }
            return false;
        }

        a b() {
            if (!c()) {
                return this;
            }
            Preconditions.checkState(!d(), "Cannot call upperCase() on a mixed-case alphabet");
            char[] cArr = new char[this.f4583a.length];
            int i = 0;
            while (true) {
                char[] cArr2 = this.f4583a;
                if (i >= cArr2.length) {
                    break;
                }
                cArr[i] = Ascii.toUpperCase(cArr2[i]);
                i++;
            }
            a aVar = new a(this.f + ".upperCase()", cArr);
            return this.h ? aVar.a() : aVar;
        }

        a e() {
            if (!d()) {
                return this;
            }
            Preconditions.checkState(!c(), "Cannot call lowerCase() on a mixed-case alphabet");
            char[] cArr = new char[this.f4583a.length];
            int i = 0;
            while (true) {
                char[] cArr2 = this.f4583a;
                if (i >= cArr2.length) {
                    break;
                }
                cArr[i] = Ascii.toLowerCase(cArr2[i]);
                i++;
            }
            a aVar = new a(this.f + ".lowerCase()", cArr);
            return this.h ? aVar.a() : aVar;
        }

        public boolean e(char c2) {
            byte[] bArr = this.i;
            return c2 < bArr.length && bArr[c2] != -1;
        }

        public String toString() {
            return this.f;
        }

        public boolean equals(@CheckForNull Object obj) {
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.h == aVar.h && Arrays.equals(this.f4583a, aVar.f4583a);
        }

        public int hashCode() {
            return Arrays.hashCode(this.f4583a) + (this.h ? 1231 : 1237);
        }
    }

    static class i extends BaseEncoding {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @CheckForNull
        @LazyInit
        private volatile BaseEncoding f4588a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final a f4589b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @CheckForNull
        final Character f4590c;

        @CheckForNull
        @LazyInit
        private volatile BaseEncoding d;

        @CheckForNull
        @LazyInit
        private volatile BaseEncoding e;

        i(String str, String str2, @CheckForNull Character ch) {
            this(new a(str, str2.toCharArray()), ch);
        }

        i(a aVar, @CheckForNull Character ch) {
            this.f4589b = (a) Preconditions.checkNotNull(aVar);
            Preconditions.checkArgument(ch == null || !aVar.e(ch.charValue()), "Padding character %s was already in alphabet", ch);
            this.f4590c = ch;
        }

        @Override // com.google.common.io.BaseEncoding
        int maxEncodedSize(int i) {
            return this.f4589b.e * apn.d(i, this.f4589b.f4584b, RoundingMode.CEILING);
        }

        @Override // com.google.common.io.BaseEncoding
        public OutputStream encodingStream(final Writer writer) {
            Preconditions.checkNotNull(writer);
            return new OutputStream() { // from class: com.google.common.io.BaseEncoding.i.4

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                int f4595b = 0;
                int d = 0;

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                int f4594a = 0;

                @Override // java.io.OutputStream
                public void write(int i) throws IOException {
                    this.f4595b = (i & 255) | (this.f4595b << 8);
                    this.d += 8;
                    while (this.d >= i.this.f4589b.d) {
                        writer.write(i.this.f4589b.a((this.f4595b >> (this.d - i.this.f4589b.d)) & i.this.f4589b.f4585c));
                        this.f4594a++;
                        this.d -= i.this.f4589b.d;
                    }
                }

                @Override // java.io.OutputStream, java.io.Flushable
                public void flush() throws IOException {
                    writer.flush();
                }

                @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
                public void close() throws IOException {
                    if (this.d > 0) {
                        writer.write(i.this.f4589b.a((this.f4595b << (i.this.f4589b.d - this.d)) & i.this.f4589b.f4585c));
                        this.f4594a++;
                        if (i.this.f4590c != null) {
                            while (this.f4594a % i.this.f4589b.e != 0) {
                                writer.write(i.this.f4590c.charValue());
                                this.f4594a++;
                            }
                        }
                    }
                    writer.close();
                }
            };
        }

        @Override // com.google.common.io.BaseEncoding
        void encodeTo(Appendable appendable, byte[] bArr, int i, int i2) throws IOException {
            Preconditions.checkNotNull(appendable);
            Preconditions.checkPositionIndexes(i, i + i2, bArr.length);
            int i3 = 0;
            while (i3 < i2) {
                a(appendable, bArr, i + i3, Math.min(this.f4589b.f4584b, i2 - i3));
                i3 += this.f4589b.f4584b;
            }
        }

        void a(Appendable appendable, byte[] bArr, int i, int i2) throws IOException {
            Preconditions.checkNotNull(appendable);
            Preconditions.checkPositionIndexes(i, i + i2, bArr.length);
            int i3 = 0;
            Preconditions.checkArgument(i2 <= this.f4589b.f4584b);
            long j = 0;
            for (int i4 = 0; i4 < i2; i4++) {
                j = (j | ((long) (bArr[i + i4] & 255))) << 8;
            }
            int i5 = this.f4589b.d;
            while (i3 < i2 * 8) {
                appendable.append(this.f4589b.a(((int) (j >>> ((((i2 + 1) * 8) - i5) - i3))) & this.f4589b.f4585c));
                i3 += this.f4589b.d;
            }
            if (this.f4590c != null) {
                while (i3 < this.f4589b.f4584b * 8) {
                    appendable.append(this.f4590c.charValue());
                    i3 += this.f4589b.d;
                }
            }
        }

        @Override // com.google.common.io.BaseEncoding
        int maxDecodedSize(int i) {
            return (int) (((((long) this.f4589b.d) * ((long) i)) + 7) / 8);
        }

        @Override // com.google.common.io.BaseEncoding
        CharSequence trimTrailingPadding(CharSequence charSequence) {
            Preconditions.checkNotNull(charSequence);
            Character ch = this.f4590c;
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

        @Override // com.google.common.io.BaseEncoding
        public boolean canDecode(CharSequence charSequence) {
            Preconditions.checkNotNull(charSequence);
            CharSequence charSequenceTrimTrailingPadding = trimTrailingPadding(charSequence);
            if (!this.f4589b.b(charSequenceTrimTrailingPadding.length())) {
                return false;
            }
            for (int i = 0; i < charSequenceTrimTrailingPadding.length(); i++) {
                if (!this.f4589b.a(charSequenceTrimTrailingPadding.charAt(i))) {
                    return false;
                }
            }
            return true;
        }

        @Override // com.google.common.io.BaseEncoding
        int decodeTo(byte[] bArr, CharSequence charSequence) throws b {
            Preconditions.checkNotNull(bArr);
            CharSequence charSequenceTrimTrailingPadding = trimTrailingPadding(charSequence);
            if (!this.f4589b.b(charSequenceTrimTrailingPadding.length())) {
                throw new b("Invalid input length " + charSequenceTrimTrailingPadding.length());
            }
            int i = 0;
            int i2 = 0;
            while (i < charSequenceTrimTrailingPadding.length()) {
                long jB = 0;
                int i3 = 0;
                for (int i4 = 0; i4 < this.f4589b.e; i4++) {
                    jB <<= this.f4589b.d;
                    if (i + i4 < charSequenceTrimTrailingPadding.length()) {
                        jB |= (long) this.f4589b.b(charSequenceTrimTrailingPadding.charAt(i3 + i));
                        i3++;
                    }
                }
                int i5 = this.f4589b.f4584b;
                int i6 = this.f4589b.d;
                int i7 = (this.f4589b.f4584b - 1) * 8;
                while (i7 >= (i5 * 8) - (i3 * i6)) {
                    bArr[i2] = (byte) ((jB >>> i7) & 255);
                    i7 -= 8;
                    i2++;
                }
                i += this.f4589b.e;
            }
            return i2;
        }

        @Override // com.google.common.io.BaseEncoding
        public InputStream decodingStream(final Reader reader) {
            Preconditions.checkNotNull(reader);
            return new InputStream() { // from class: com.google.common.io.BaseEncoding.i.3

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                int f4593c = 0;
                int d = 0;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                int f4592b = 0;
                boolean e = false;

                @Override // java.io.InputStream
                public int read() throws IOException {
                    while (true) {
                        int i = reader.read();
                        if (i == -1) {
                            if (this.e || i.this.f4589b.b(this.f4592b)) {
                                return -1;
                            }
                            throw new b("Invalid input length " + this.f4592b);
                        }
                        this.f4592b++;
                        char c2 = (char) i;
                        if (i.this.f4590c != null && i.this.f4590c.charValue() == c2) {
                            if (!this.e && (this.f4592b == 1 || !i.this.f4589b.b(this.f4592b - 1))) {
                                throw new b("Padding cannot start at index " + this.f4592b);
                            }
                            this.e = true;
                        } else {
                            if (this.e) {
                                throw new b("Expected padding character but found '" + c2 + "' at index " + this.f4592b);
                            }
                            int i2 = this.f4593c << i.this.f4589b.d;
                            this.f4593c = i2;
                            this.f4593c = i.this.f4589b.b(c2) | i2;
                            int i3 = this.d + i.this.f4589b.d;
                            this.d = i3;
                            if (i3 >= 8) {
                                int i4 = i3 - 8;
                                this.d = i4;
                                return (this.f4593c >> i4) & 255;
                            }
                        }
                    }
                }

                @Override // java.io.InputStream
                public int read(byte[] bArr, int i, int i2) throws IOException {
                    int i3 = i2 + i;
                    Preconditions.checkPositionIndexes(i, i3, bArr.length);
                    int i4 = i;
                    while (i4 < i3) {
                        int i5 = read();
                        if (i5 == -1) {
                            int i6 = i4 - i;
                            if (i6 == 0) {
                                return -1;
                            }
                            return i6;
                        }
                        bArr[i4] = (byte) i5;
                        i4++;
                    }
                    return i4 - i;
                }

                @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
                public void close() throws IOException {
                    reader.close();
                }
            };
        }

        @Override // com.google.common.io.BaseEncoding
        public BaseEncoding omitPadding() {
            return this.f4590c == null ? this : c(this.f4589b, null);
        }

        @Override // com.google.common.io.BaseEncoding
        public BaseEncoding withPadChar(char c2) {
            Character ch;
            return (8 % this.f4589b.d == 0 || ((ch = this.f4590c) != null && ch.charValue() == c2)) ? this : c(this.f4589b, Character.valueOf(c2));
        }

        @Override // com.google.common.io.BaseEncoding
        public BaseEncoding withSeparator(String str, int i) {
            for (int i2 = 0; i2 < str.length(); i2++) {
                Preconditions.checkArgument(!this.f4589b.e(str.charAt(i2)), "Separator (%s) cannot contain alphabet characters", str);
            }
            Character ch = this.f4590c;
            if (ch != null) {
                Preconditions.checkArgument(str.indexOf(ch.charValue()) < 0, "Separator (%s) cannot contain padding character", str);
            }
            return new c(this, str, i);
        }

        @Override // com.google.common.io.BaseEncoding
        public BaseEncoding upperCase() {
            BaseEncoding baseEncodingC = this.d;
            if (baseEncodingC == null) {
                a aVarB = this.f4589b.b();
                baseEncodingC = aVarB == this.f4589b ? this : c(aVarB, this.f4590c);
                this.d = baseEncodingC;
            }
            return baseEncodingC;
        }

        @Override // com.google.common.io.BaseEncoding
        public BaseEncoding lowerCase() {
            BaseEncoding baseEncodingC = this.e;
            if (baseEncodingC == null) {
                a aVarE = this.f4589b.e();
                baseEncodingC = aVarE == this.f4589b ? this : c(aVarE, this.f4590c);
                this.e = baseEncodingC;
            }
            return baseEncodingC;
        }

        @Override // com.google.common.io.BaseEncoding
        public BaseEncoding ignoreCase() {
            BaseEncoding baseEncodingC = this.f4588a;
            if (baseEncodingC == null) {
                a aVarA = this.f4589b.a();
                baseEncodingC = aVarA == this.f4589b ? this : c(aVarA, this.f4590c);
                this.f4588a = baseEncodingC;
            }
            return baseEncodingC;
        }

        BaseEncoding c(a aVar, @CheckForNull Character ch) {
            return new i(aVar, ch);
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("BaseEncoding.");
            sb.append(this.f4589b);
            if (8 % this.f4589b.d != 0) {
                if (this.f4590c == null) {
                    sb.append(".omitPadding()");
                } else {
                    sb.append(".withPadChar('");
                    sb.append(this.f4590c);
                    sb.append(Constants.RIGHT_BRACKET);
                }
            }
            return sb.toString();
        }

        public boolean equals(@CheckForNull Object obj) {
            if (!(obj instanceof i)) {
                return false;
            }
            i iVar = (i) obj;
            return this.f4589b.equals(iVar.f4589b) && Objects.equals(this.f4590c, iVar.f4590c);
        }

        public int hashCode() {
            return this.f4589b.hashCode() ^ Objects.hashCode(this.f4590c);
        }
    }

    static final class d extends i {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final char[] f4587a;

        d(String str, String str2) {
            this(new a(str, str2.toCharArray()));
        }

        private d(a aVar) {
            super(aVar, null);
            this.f4587a = new char[512];
            Preconditions.checkArgument(aVar.f4583a.length == 16);
            for (int i = 0; i < 256; i++) {
                this.f4587a[i] = aVar.a(i >>> 4);
                this.f4587a[i | 256] = aVar.a(i & 15);
            }
        }

        @Override // com.google.common.io.BaseEncoding.i, com.google.common.io.BaseEncoding
        void encodeTo(Appendable appendable, byte[] bArr, int i, int i2) throws IOException {
            Preconditions.checkNotNull(appendable);
            Preconditions.checkPositionIndexes(i, i + i2, bArr.length);
            for (int i3 = 0; i3 < i2; i3++) {
                int i4 = bArr[i + i3] & 255;
                appendable.append(this.f4587a[i4]);
                appendable.append(this.f4587a[i4 | 256]);
            }
        }

        @Override // com.google.common.io.BaseEncoding.i, com.google.common.io.BaseEncoding
        int decodeTo(byte[] bArr, CharSequence charSequence) throws b {
            Preconditions.checkNotNull(bArr);
            if (charSequence.length() % 2 == 1) {
                throw new b("Invalid input length " + charSequence.length());
            }
            int i = 0;
            int i2 = 0;
            while (i < charSequence.length()) {
                bArr[i2] = (byte) ((this.f4589b.b(charSequence.charAt(i)) << 4) | this.f4589b.b(charSequence.charAt(i + 1)));
                i += 2;
                i2++;
            }
            return i2;
        }

        @Override // com.google.common.io.BaseEncoding.i
        BaseEncoding c(a aVar, @CheckForNull Character ch) {
            return new d(aVar);
        }
    }

    static final class e extends i {
        e(String str, String str2, @CheckForNull Character ch) {
            this(new a(str, str2.toCharArray()), ch);
        }

        private e(a aVar, @CheckForNull Character ch) {
            super(aVar, ch);
            Preconditions.checkArgument(aVar.f4583a.length == 64);
        }

        @Override // com.google.common.io.BaseEncoding.i, com.google.common.io.BaseEncoding
        void encodeTo(Appendable appendable, byte[] bArr, int i, int i2) throws IOException {
            Preconditions.checkNotNull(appendable);
            int i3 = i + i2;
            Preconditions.checkPositionIndexes(i, i3, bArr.length);
            while (i2 >= 3) {
                int i4 = i + 3;
                int i5 = (bArr[i + 2] & 255) | ((bArr[i] & 255) << 16) | ((bArr[i + 1] & 255) << 8);
                appendable.append(this.f4589b.a(i5 >>> 18));
                appendable.append(this.f4589b.a((i5 >>> 12) & 63));
                appendable.append(this.f4589b.a((i5 >>> 6) & 63));
                appendable.append(this.f4589b.a(i5 & 63));
                i2 -= 3;
                i = i4;
            }
            if (i < i3) {
                a(appendable, bArr, i, i3 - i);
            }
        }

        @Override // com.google.common.io.BaseEncoding.i, com.google.common.io.BaseEncoding
        int decodeTo(byte[] bArr, CharSequence charSequence) throws b {
            Preconditions.checkNotNull(bArr);
            CharSequence charSequenceTrimTrailingPadding = trimTrailingPadding(charSequence);
            if (!this.f4589b.b(charSequenceTrimTrailingPadding.length())) {
                throw new b("Invalid input length " + charSequenceTrimTrailingPadding.length());
            }
            int i = 0;
            int i2 = 0;
            while (i < charSequenceTrimTrailingPadding.length()) {
                int i3 = i + 2;
                int iB = (this.f4589b.b(charSequenceTrimTrailingPadding.charAt(i)) << 18) | (this.f4589b.b(charSequenceTrimTrailingPadding.charAt(i + 1)) << 12);
                int i4 = i2 + 1;
                bArr[i2] = (byte) (iB >>> 16);
                if (i3 < charSequenceTrimTrailingPadding.length()) {
                    int i5 = i + 3;
                    int iB2 = iB | (this.f4589b.b(charSequenceTrimTrailingPadding.charAt(i3)) << 6);
                    int i6 = i2 + 2;
                    bArr[i4] = (byte) ((iB2 >>> 8) & 255);
                    if (i5 < charSequenceTrimTrailingPadding.length()) {
                        i += 4;
                        i2 += 3;
                        bArr[i6] = (byte) ((iB2 | this.f4589b.b(charSequenceTrimTrailingPadding.charAt(i5))) & 255);
                    } else {
                        i2 = i6;
                        i = i5;
                    }
                } else {
                    i2 = i4;
                    i = i3;
                }
            }
            return i2;
        }

        @Override // com.google.common.io.BaseEncoding.i
        BaseEncoding c(a aVar, @CheckForNull Character ch) {
            return new e(aVar, ch);
        }
    }

    static Reader ignoringReader(final Reader reader, final String str) {
        Preconditions.checkNotNull(reader);
        Preconditions.checkNotNull(str);
        return new Reader() { // from class: com.google.common.io.BaseEncoding.5
            @Override // java.io.Reader
            public int read() throws IOException {
                int i2;
                do {
                    i2 = reader.read();
                    if (i2 == -1) {
                        break;
                    }
                } while (str.indexOf((char) i2) >= 0);
                return i2;
            }

            @Override // java.io.Reader
            public int read(char[] cArr, int i2, int i3) throws IOException {
                throw new UnsupportedOperationException();
            }

            @Override // java.io.Reader, java.io.Closeable, java.lang.AutoCloseable
            public void close() throws IOException {
                reader.close();
            }
        };
    }

    static Appendable separatingAppendable(Appendable appendable, String str, int i2) {
        Preconditions.checkNotNull(appendable);
        Preconditions.checkNotNull(str);
        Preconditions.checkArgument(i2 > 0);
        return new Appendable(i2, appendable, str) { // from class: com.google.common.io.BaseEncoding.3

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            int f4579b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ int f4580c;
            final /* synthetic */ String d;
            final /* synthetic */ Appendable e;

            {
                this.f4580c = i2;
                this.e = appendable;
                this.d = str;
                this.f4579b = i2;
            }

            @Override // java.lang.Appendable
            public Appendable append(char c2) throws IOException {
                if (this.f4579b == 0) {
                    this.e.append(this.d);
                    this.f4579b = this.f4580c;
                }
                this.e.append(c2);
                this.f4579b--;
                return this;
            }

            @Override // java.lang.Appendable
            public Appendable append(@CheckForNull CharSequence charSequence, int i3, int i4) {
                throw new UnsupportedOperationException();
            }

            @Override // java.lang.Appendable
            public Appendable append(@CheckForNull CharSequence charSequence) {
                throw new UnsupportedOperationException();
            }
        };
    }

    static Writer separatingWriter(final Writer writer, String str, int i2) {
        final Appendable appendableSeparatingAppendable = separatingAppendable(writer, str, i2);
        return new Writer() { // from class: com.google.common.io.BaseEncoding.2
            @Override // java.io.Writer
            public void write(int i3) throws IOException {
                appendableSeparatingAppendable.append((char) i3);
            }

            @Override // java.io.Writer
            public void write(char[] cArr, int i3, int i4) throws IOException {
                throw new UnsupportedOperationException();
            }

            @Override // java.io.Writer, java.io.Flushable
            public void flush() throws IOException {
                writer.flush();
            }

            @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
            public void close() throws IOException {
                writer.close();
            }
        };
    }

    static final class c extends BaseEncoding {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final BaseEncoding f4586b;
        private final String d;
        private final int e;

        c(BaseEncoding baseEncoding, String str, int i) {
            this.f4586b = (BaseEncoding) Preconditions.checkNotNull(baseEncoding);
            this.d = (String) Preconditions.checkNotNull(str);
            this.e = i;
            Preconditions.checkArgument(i > 0, "Cannot add a separator after every %s chars", i);
        }

        @Override // com.google.common.io.BaseEncoding
        CharSequence trimTrailingPadding(CharSequence charSequence) {
            return this.f4586b.trimTrailingPadding(charSequence);
        }

        @Override // com.google.common.io.BaseEncoding
        int maxEncodedSize(int i) {
            int iMaxEncodedSize = this.f4586b.maxEncodedSize(i);
            return iMaxEncodedSize + (this.d.length() * apn.d(Math.max(0, iMaxEncodedSize - 1), this.e, RoundingMode.FLOOR));
        }

        @Override // com.google.common.io.BaseEncoding
        public OutputStream encodingStream(Writer writer) {
            return this.f4586b.encodingStream(separatingWriter(writer, this.d, this.e));
        }

        @Override // com.google.common.io.BaseEncoding
        void encodeTo(Appendable appendable, byte[] bArr, int i, int i2) throws IOException {
            this.f4586b.encodeTo(separatingAppendable(appendable, this.d, this.e), bArr, i, i2);
        }

        @Override // com.google.common.io.BaseEncoding
        int maxDecodedSize(int i) {
            return this.f4586b.maxDecodedSize(i);
        }

        @Override // com.google.common.io.BaseEncoding
        public boolean canDecode(CharSequence charSequence) {
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < charSequence.length(); i++) {
                char cCharAt = charSequence.charAt(i);
                if (this.d.indexOf(cCharAt) < 0) {
                    sb.append(cCharAt);
                }
            }
            return this.f4586b.canDecode(sb);
        }

        @Override // com.google.common.io.BaseEncoding
        int decodeTo(byte[] bArr, CharSequence charSequence) throws b {
            StringBuilder sb = new StringBuilder(charSequence.length());
            for (int i = 0; i < charSequence.length(); i++) {
                char cCharAt = charSequence.charAt(i);
                if (this.d.indexOf(cCharAt) < 0) {
                    sb.append(cCharAt);
                }
            }
            return this.f4586b.decodeTo(bArr, sb);
        }

        @Override // com.google.common.io.BaseEncoding
        public InputStream decodingStream(Reader reader) {
            return this.f4586b.decodingStream(ignoringReader(reader, this.d));
        }

        @Override // com.google.common.io.BaseEncoding
        public BaseEncoding omitPadding() {
            return this.f4586b.omitPadding().withSeparator(this.d, this.e);
        }

        @Override // com.google.common.io.BaseEncoding
        public BaseEncoding withPadChar(char c2) {
            return this.f4586b.withPadChar(c2).withSeparator(this.d, this.e);
        }

        @Override // com.google.common.io.BaseEncoding
        public BaseEncoding withSeparator(String str, int i) {
            throw new UnsupportedOperationException("Already have a separator");
        }

        @Override // com.google.common.io.BaseEncoding
        public BaseEncoding upperCase() {
            return this.f4586b.upperCase().withSeparator(this.d, this.e);
        }

        @Override // com.google.common.io.BaseEncoding
        public BaseEncoding lowerCase() {
            return this.f4586b.lowerCase().withSeparator(this.d, this.e);
        }

        @Override // com.google.common.io.BaseEncoding
        public BaseEncoding ignoreCase() {
            return this.f4586b.ignoreCase().withSeparator(this.d, this.e);
        }

        public String toString() {
            return this.f4586b + ".withSeparator(\"" + this.d + "\", " + this.e + Constants.RIGHT_BRACKET_ONLY;
        }
    }
}
