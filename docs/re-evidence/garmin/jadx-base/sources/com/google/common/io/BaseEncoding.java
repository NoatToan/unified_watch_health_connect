package com.google.common.io;

import am.j;
import com.google.common.annotations.GwtCompatible;
import com.google.common.annotations.GwtIncompatible;
import com.google.common.annotations.J2ktIncompatible;
import com.google.common.base.Ascii;
import com.google.common.base.Preconditions;
import com.google.common.math.IntMath;
import com.google.common.primitives.UnsignedBytes;
import com.google.errorprone.annotations.concurrent.LazyInit;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Reader;
import java.io.Writer;
import java.math.RoundingMode;
import java.util.Arrays;
import java.util.Objects;
import tn.k;
import vb.h;
import yc.l2;

/* JADX INFO: loaded from: classes14.dex */
@ElementTypesAreNonnullByDefault
@GwtCompatible(emulated = true)
public abstract class BaseEncoding {
    private static final BaseEncoding BASE64 = new Base64Encoding("base64()", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/", '=');
    private static final BaseEncoding BASE64_URL = new Base64Encoding("base64Url()", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789-_", '=');
    private static final BaseEncoding BASE32 = new StandardBaseEncoding("base32()", "ABCDEFGHIJKLMNOPQRSTUVWXYZ234567", '=');
    private static final BaseEncoding BASE32_HEX = new StandardBaseEncoding("base32Hex()", "0123456789ABCDEFGHIJKLMNOPQRSTUV", '=');
    private static final BaseEncoding BASE16 = new Base16Encoding("base16()", "0123456789ABCDEF");

    public static final class DecodingException extends IOException {
        public DecodingException(String str) {
            super(str);
        }
    }

    public static final class SeparatedBaseEncoding extends BaseEncoding {
        private final int afterEveryChars;
        private final BaseEncoding delegate;
        private final String separator;

        public SeparatedBaseEncoding(BaseEncoding baseEncoding, String str, int i14) {
            this.delegate = (BaseEncoding) Preconditions.checkNotNull(baseEncoding);
            this.separator = (String) Preconditions.checkNotNull(str);
            this.afterEveryChars = i14;
            Preconditions.checkArgument(i14 > 0, "Cannot add a separator after every %s chars", i14);
        }

        @Override // com.google.common.io.BaseEncoding
        public boolean canDecode(CharSequence charSequence) {
            StringBuilder sb3 = new StringBuilder();
            for (int i14 = 0; i14 < charSequence.length(); i14++) {
                char cCharAt = charSequence.charAt(i14);
                if (this.separator.indexOf(cCharAt) < 0) {
                    sb3.append(cCharAt);
                }
            }
            return this.delegate.canDecode(sb3);
        }

        @Override // com.google.common.io.BaseEncoding
        public int decodeTo(byte[] bArr, CharSequence charSequence) {
            StringBuilder sb3 = new StringBuilder(charSequence.length());
            for (int i14 = 0; i14 < charSequence.length(); i14++) {
                char cCharAt = charSequence.charAt(i14);
                if (this.separator.indexOf(cCharAt) < 0) {
                    sb3.append(cCharAt);
                }
            }
            return this.delegate.decodeTo(bArr, sb3);
        }

        @Override // com.google.common.io.BaseEncoding
        @J2ktIncompatible
        @GwtIncompatible
        public InputStream decodingStream(Reader reader) {
            return this.delegate.decodingStream(BaseEncoding.ignoringReader(reader, this.separator));
        }

        @Override // com.google.common.io.BaseEncoding
        public void encodeTo(Appendable appendable, byte[] bArr, int i14, int i15) {
            this.delegate.encodeTo(BaseEncoding.separatingAppendable(appendable, this.separator, this.afterEveryChars), bArr, i14, i15);
        }

        @Override // com.google.common.io.BaseEncoding
        @J2ktIncompatible
        @GwtIncompatible
        public OutputStream encodingStream(Writer writer) {
            return this.delegate.encodingStream(BaseEncoding.separatingWriter(writer, this.separator, this.afterEveryChars));
        }

        @Override // com.google.common.io.BaseEncoding
        public BaseEncoding ignoreCase() {
            return this.delegate.ignoreCase().withSeparator(this.separator, this.afterEveryChars);
        }

        @Override // com.google.common.io.BaseEncoding
        public BaseEncoding lowerCase() {
            return this.delegate.lowerCase().withSeparator(this.separator, this.afterEveryChars);
        }

        @Override // com.google.common.io.BaseEncoding
        public int maxDecodedSize(int i14) {
            return this.delegate.maxDecodedSize(i14);
        }

        @Override // com.google.common.io.BaseEncoding
        public int maxEncodedSize(int i14) {
            int iMaxEncodedSize = this.delegate.maxEncodedSize(i14);
            return (IntMath.divide(Math.max(0, iMaxEncodedSize - 1), this.afterEveryChars, RoundingMode.FLOOR) * this.separator.length()) + iMaxEncodedSize;
        }

        @Override // com.google.common.io.BaseEncoding
        public BaseEncoding omitPadding() {
            return this.delegate.omitPadding().withSeparator(this.separator, this.afterEveryChars);
        }

        public String toString() {
            StringBuilder sb3 = new StringBuilder();
            sb3.append(this.delegate);
            sb3.append(".withSeparator(\"");
            sb3.append(this.separator);
            sb3.append("\", ");
            return j.q(sb3, this.afterEveryChars, ")");
        }

        @Override // com.google.common.io.BaseEncoding
        public CharSequence trimTrailingPadding(CharSequence charSequence) {
            return this.delegate.trimTrailingPadding(charSequence);
        }

        @Override // com.google.common.io.BaseEncoding
        public BaseEncoding upperCase() {
            return this.delegate.upperCase().withSeparator(this.separator, this.afterEveryChars);
        }

        @Override // com.google.common.io.BaseEncoding
        public BaseEncoding withPadChar(char c14) {
            return this.delegate.withPadChar(c14).withSeparator(this.separator, this.afterEveryChars);
        }

        @Override // com.google.common.io.BaseEncoding
        public BaseEncoding withSeparator(String str, int i14) {
            throw new UnsupportedOperationException("Already have a separator");
        }
    }

    public static BaseEncoding base16() {
        return BASE16;
    }

    public static BaseEncoding base32() {
        return BASE32;
    }

    public static BaseEncoding base32Hex() {
        return BASE32_HEX;
    }

    public static BaseEncoding base64() {
        return BASE64;
    }

    public static BaseEncoding base64Url() {
        return BASE64_URL;
    }

    private static byte[] extract(byte[] bArr, int i14) {
        if (i14 == bArr.length) {
            return bArr;
        }
        byte[] bArr2 = new byte[i14];
        System.arraycopy(bArr, 0, bArr2, 0, i14);
        return bArr2;
    }

    @J2ktIncompatible
    @GwtIncompatible
    public static Reader ignoringReader(final Reader reader, final String str) {
        Preconditions.checkNotNull(reader);
        Preconditions.checkNotNull(str);
        return new Reader() { // from class: com.google.common.io.BaseEncoding.3
            @Override // java.io.Reader, java.io.Closeable, java.lang.AutoCloseable
            public void close() throws IOException {
                reader.close();
            }

            @Override // java.io.Reader
            public int read() throws IOException {
                int i14;
                do {
                    i14 = reader.read();
                    if (i14 == -1) {
                        break;
                    }
                } while (str.indexOf((char) i14) >= 0);
                return i14;
            }

            @Override // java.io.Reader
            public int read(char[] cArr, int i14, int i15) {
                throw new UnsupportedOperationException();
            }
        };
    }

    public static Appendable separatingAppendable(Appendable appendable, String str, int i14) {
        Preconditions.checkNotNull(appendable);
        Preconditions.checkNotNull(str);
        Preconditions.checkArgument(i14 > 0);
        return new Appendable(i14, appendable, str) { // from class: com.google.common.io.BaseEncoding.4
            int charsUntilSeparator;
            final /* synthetic */ int val$afterEveryChars;
            final /* synthetic */ Appendable val$delegate;
            final /* synthetic */ String val$separator;

            {
                this.val$afterEveryChars = i14;
                this.val$delegate = appendable;
                this.val$separator = str;
                this.charsUntilSeparator = i14;
            }

            @Override // java.lang.Appendable
            public Appendable append(char c14) throws IOException {
                if (this.charsUntilSeparator == 0) {
                    this.val$delegate.append(this.val$separator);
                    this.charsUntilSeparator = this.val$afterEveryChars;
                }
                this.val$delegate.append(c14);
                this.charsUntilSeparator--;
                return this;
            }

            @Override // java.lang.Appendable
            public Appendable append(CharSequence charSequence, int i15, int i16) {
                throw new UnsupportedOperationException();
            }

            @Override // java.lang.Appendable
            public Appendable append(CharSequence charSequence) {
                throw new UnsupportedOperationException();
            }
        };
    }

    @J2ktIncompatible
    @GwtIncompatible
    public static Writer separatingWriter(final Writer writer, String str, int i14) {
        final Appendable appendableSeparatingAppendable = separatingAppendable(writer, str, i14);
        return new Writer() { // from class: com.google.common.io.BaseEncoding.5
            @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
            public void close() throws IOException {
                writer.close();
            }

            @Override // java.io.Writer, java.io.Flushable
            public void flush() throws IOException {
                writer.flush();
            }

            @Override // java.io.Writer
            public void write(int i15) throws IOException {
                appendableSeparatingAppendable.append((char) i15);
            }

            @Override // java.io.Writer
            public void write(char[] cArr, int i15, int i16) {
                throw new UnsupportedOperationException();
            }
        };
    }

    public abstract boolean canDecode(CharSequence charSequence);

    public final byte[] decode(CharSequence charSequence) {
        try {
            return decodeChecked(charSequence);
        } catch (DecodingException e4) {
            l2.t(e4);
            return null;
        }
    }

    public final byte[] decodeChecked(CharSequence charSequence) {
        CharSequence charSequenceTrimTrailingPadding = trimTrailingPadding(charSequence);
        byte[] bArr = new byte[maxDecodedSize(charSequenceTrimTrailingPadding.length())];
        return extract(bArr, decodeTo(bArr, charSequenceTrimTrailingPadding));
    }

    public abstract int decodeTo(byte[] bArr, CharSequence charSequence);

    @J2ktIncompatible
    @GwtIncompatible
    public final ByteSource decodingSource(final CharSource charSource) {
        Preconditions.checkNotNull(charSource);
        return new ByteSource(this) { // from class: com.google.common.io.BaseEncoding.2
            final /* synthetic */ BaseEncoding this$0;

            {
                this.this$0 = this;
            }

            @Override // com.google.common.io.ByteSource
            public InputStream openStream() {
                return this.this$0.decodingStream(charSource.openStream());
            }
        };
    }

    @J2ktIncompatible
    @GwtIncompatible
    public abstract InputStream decodingStream(Reader reader);

    public final String encode(byte[] bArr, int i14, int i15) {
        Preconditions.checkPositionIndexes(i14, i14 + i15, bArr.length);
        StringBuilder sb3 = new StringBuilder(maxEncodedSize(i15));
        try {
            encodeTo(sb3, bArr, i14, i15);
            return sb3.toString();
        } catch (IOException e4) {
            h.q(e4);
            return null;
        }
    }

    public abstract void encodeTo(Appendable appendable, byte[] bArr, int i14, int i15);

    @J2ktIncompatible
    @GwtIncompatible
    public final ByteSink encodingSink(final CharSink charSink) {
        Preconditions.checkNotNull(charSink);
        return new ByteSink(this) { // from class: com.google.common.io.BaseEncoding.1
            final /* synthetic */ BaseEncoding this$0;

            {
                this.this$0 = this;
            }

            @Override // com.google.common.io.ByteSink
            public OutputStream openStream() {
                return this.this$0.encodingStream(charSink.openStream());
            }
        };
    }

    @J2ktIncompatible
    @GwtIncompatible
    public abstract OutputStream encodingStream(Writer writer);

    public abstract BaseEncoding ignoreCase();

    public abstract BaseEncoding lowerCase();

    public abstract int maxDecodedSize(int i14);

    public abstract int maxEncodedSize(int i14);

    public abstract BaseEncoding omitPadding();

    public CharSequence trimTrailingPadding(CharSequence charSequence) {
        return (CharSequence) Preconditions.checkNotNull(charSequence);
    }

    public abstract BaseEncoding upperCase();

    public abstract BaseEncoding withPadChar(char c14);

    public abstract BaseEncoding withSeparator(String str, int i14);

    public static final class Base64Encoding extends StandardBaseEncoding {
        private Base64Encoding(Alphabet alphabet, Character ch3) {
            super(alphabet, ch3);
            Preconditions.checkArgument(alphabet.chars.length == 64);
        }

        @Override // com.google.common.io.BaseEncoding.StandardBaseEncoding, com.google.common.io.BaseEncoding
        public int decodeTo(byte[] bArr, CharSequence charSequence) throws DecodingException {
            Preconditions.checkNotNull(bArr);
            CharSequence charSequenceTrimTrailingPadding = trimTrailingPadding(charSequence);
            if (!this.alphabet.isValidPaddingStartPosition(charSequenceTrimTrailingPadding.length())) {
                b.a(charSequenceTrimTrailingPadding.length(), "Invalid input length ");
                return 0;
            }
            int i14 = 0;
            int i15 = 0;
            while (i14 < charSequenceTrimTrailingPadding.length()) {
                int i16 = i14 + 2;
                int iDecode = (this.alphabet.decode(charSequenceTrimTrailingPadding.charAt(i14)) << 18) | (this.alphabet.decode(charSequenceTrimTrailingPadding.charAt(i14 + 1)) << 12);
                int i17 = i15 + 1;
                bArr[i15] = (byte) (iDecode >>> 16);
                if (i16 < charSequenceTrimTrailingPadding.length()) {
                    int i18 = i14 + 3;
                    int iDecode2 = iDecode | (this.alphabet.decode(charSequenceTrimTrailingPadding.charAt(i16)) << 6);
                    int i19 = i15 + 2;
                    bArr[i17] = (byte) ((iDecode2 >>> 8) & 255);
                    if (i18 < charSequenceTrimTrailingPadding.length()) {
                        i14 += 4;
                        i15 += 3;
                        bArr[i19] = (byte) ((iDecode2 | this.alphabet.decode(charSequenceTrimTrailingPadding.charAt(i18))) & 255);
                    } else {
                        i15 = i19;
                        i14 = i18;
                    }
                } else {
                    i15 = i17;
                    i14 = i16;
                }
            }
            return i15;
        }

        @Override // com.google.common.io.BaseEncoding.StandardBaseEncoding, com.google.common.io.BaseEncoding
        public void encodeTo(Appendable appendable, byte[] bArr, int i14, int i15) throws IOException {
            Preconditions.checkNotNull(appendable);
            int i16 = i14 + i15;
            Preconditions.checkPositionIndexes(i14, i16, bArr.length);
            while (i15 >= 3) {
                int i17 = i14 + 2;
                int i18 = ((bArr[i14 + 1] & UnsignedBytes.MAX_VALUE) << 8) | ((bArr[i14] & UnsignedBytes.MAX_VALUE) << 16);
                i14 += 3;
                int i19 = i18 | (bArr[i17] & UnsignedBytes.MAX_VALUE);
                appendable.append(this.alphabet.encode(i19 >>> 18));
                appendable.append(this.alphabet.encode((i19 >>> 12) & 63));
                appendable.append(this.alphabet.encode((i19 >>> 6) & 63));
                appendable.append(this.alphabet.encode(i19 & 63));
                i15 -= 3;
            }
            if (i14 < i16) {
                encodeChunkTo(appendable, bArr, i14, i16 - i14);
            }
        }

        @Override // com.google.common.io.BaseEncoding.StandardBaseEncoding
        public BaseEncoding newInstance(Alphabet alphabet, Character ch3) {
            return new Base64Encoding(alphabet, ch3);
        }

        public Base64Encoding(String str, String str2, Character ch3) {
            this(new Alphabet(str, str2.toCharArray()), ch3);
        }
    }

    public String encode(byte[] bArr) {
        return encode(bArr, 0, bArr.length);
    }

    public static class StandardBaseEncoding extends BaseEncoding {
        final Alphabet alphabet;

        @LazyInit
        private volatile BaseEncoding ignoreCase;

        @LazyInit
        private volatile BaseEncoding lowerCase;
        final Character paddingChar;

        @LazyInit
        private volatile BaseEncoding upperCase;

        public StandardBaseEncoding(Alphabet alphabet, Character ch3) {
            this.alphabet = (Alphabet) Preconditions.checkNotNull(alphabet);
            Preconditions.checkArgument(ch3 == null || !alphabet.matches(ch3.charValue()), "Padding character %s was already in alphabet", ch3);
            this.paddingChar = ch3;
        }

        @Override // com.google.common.io.BaseEncoding
        public boolean canDecode(CharSequence charSequence) {
            Preconditions.checkNotNull(charSequence);
            CharSequence charSequenceTrimTrailingPadding = trimTrailingPadding(charSequence);
            if (!this.alphabet.isValidPaddingStartPosition(charSequenceTrimTrailingPadding.length())) {
                return false;
            }
            for (int i14 = 0; i14 < charSequenceTrimTrailingPadding.length(); i14++) {
                if (!this.alphabet.canDecode(charSequenceTrimTrailingPadding.charAt(i14))) {
                    return false;
                }
            }
            return true;
        }

        @Override // com.google.common.io.BaseEncoding
        public int decodeTo(byte[] bArr, CharSequence charSequence) throws DecodingException {
            Alphabet alphabet;
            Preconditions.checkNotNull(bArr);
            CharSequence charSequenceTrimTrailingPadding = trimTrailingPadding(charSequence);
            if (!this.alphabet.isValidPaddingStartPosition(charSequenceTrimTrailingPadding.length())) {
                b.a(charSequenceTrimTrailingPadding.length(), "Invalid input length ");
                return 0;
            }
            int i14 = 0;
            int i15 = 0;
            while (i14 < charSequenceTrimTrailingPadding.length()) {
                long jDecode = 0;
                int i16 = 0;
                int i17 = 0;
                while (true) {
                    alphabet = this.alphabet;
                    if (i16 >= alphabet.charsPerChunk) {
                        break;
                    }
                    jDecode <<= alphabet.bitsPerChar;
                    if (i14 + i16 < charSequenceTrimTrailingPadding.length()) {
                        jDecode |= (long) this.alphabet.decode(charSequenceTrimTrailingPadding.charAt(i17 + i14));
                        i17++;
                    }
                    i16++;
                }
                int i18 = alphabet.bytesPerChunk;
                int i19 = (i18 * 8) - (i17 * alphabet.bitsPerChar);
                int i24 = (i18 - 1) * 8;
                while (i24 >= i19) {
                    bArr[i15] = (byte) ((jDecode >>> i24) & 255);
                    i24 -= 8;
                    i15++;
                }
                i14 += this.alphabet.charsPerChunk;
            }
            return i15;
        }

        @Override // com.google.common.io.BaseEncoding
        @J2ktIncompatible
        @GwtIncompatible
        public InputStream decodingStream(final Reader reader) {
            Preconditions.checkNotNull(reader);
            return new InputStream(this) { // from class: com.google.common.io.BaseEncoding.StandardBaseEncoding.2
                final /* synthetic */ StandardBaseEncoding this$0;
                int bitBuffer = 0;
                int bitBufferLength = 0;
                int readChars = 0;
                boolean hitPadding = false;

                {
                    this.this$0 = this;
                }

                @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
                public void close() throws IOException {
                    reader.close();
                }

                @Override // java.io.InputStream
                public int read() throws IOException {
                    int i14;
                    while (true) {
                        int i15 = reader.read();
                        if (i15 == -1) {
                            if (this.hitPadding || this.this$0.alphabet.isValidPaddingStartPosition(this.readChars)) {
                                return -1;
                            }
                            b.a(this.readChars, "Invalid input length ");
                            return 0;
                        }
                        this.readChars++;
                        char c14 = (char) i15;
                        Character ch3 = this.this$0.paddingChar;
                        if (ch3 == null || ch3.charValue() != c14) {
                            if (this.hitPadding) {
                                throw new DecodingException("Expected padding character but found '" + c14 + "' at index " + this.readChars);
                            }
                            int i16 = this.bitBuffer;
                            Alphabet alphabet = this.this$0.alphabet;
                            int i17 = i16 << alphabet.bitsPerChar;
                            this.bitBuffer = i17;
                            int iDecode = alphabet.decode(c14) | i17;
                            this.bitBuffer = iDecode;
                            int i18 = this.bitBufferLength + this.this$0.alphabet.bitsPerChar;
                            this.bitBufferLength = i18;
                            if (i18 >= 8) {
                                int i19 = i18 - 8;
                                this.bitBufferLength = i19;
                                return (iDecode >> i19) & 255;
                            }
                        } else {
                            if (!this.hitPadding && ((i14 = this.readChars) == 1 || !this.this$0.alphabet.isValidPaddingStartPosition(i14 - 1))) {
                                b.a(this.readChars, "Padding cannot start at index ");
                                return 0;
                            }
                            this.hitPadding = true;
                        }
                    }
                }

                @Override // java.io.InputStream
                public int read(byte[] bArr, int i14, int i15) throws IOException {
                    int i16 = i15 + i14;
                    Preconditions.checkPositionIndexes(i14, i16, bArr.length);
                    int i17 = i14;
                    while (i17 < i16) {
                        int i18 = read();
                        if (i18 == -1) {
                            int i19 = i17 - i14;
                            if (i19 == 0) {
                                return -1;
                            }
                            return i19;
                        }
                        bArr[i17] = (byte) i18;
                        i17++;
                    }
                    return i17 - i14;
                }
            };
        }

        public void encodeChunkTo(Appendable appendable, byte[] bArr, int i14, int i15) throws IOException {
            Preconditions.checkNotNull(appendable);
            Preconditions.checkPositionIndexes(i14, i14 + i15, bArr.length);
            int i16 = 0;
            Preconditions.checkArgument(i15 <= this.alphabet.bytesPerChunk);
            long j8 = 0;
            for (int i17 = 0; i17 < i15; i17++) {
                j8 = (j8 | ((long) (bArr[i14 + i17] & UnsignedBytes.MAX_VALUE))) << 8;
            }
            int i18 = ((i15 + 1) * 8) - this.alphabet.bitsPerChar;
            while (i16 < i15 * 8) {
                Alphabet alphabet = this.alphabet;
                appendable.append(alphabet.encode(((int) (j8 >>> (i18 - i16))) & alphabet.mask));
                i16 += this.alphabet.bitsPerChar;
            }
            if (this.paddingChar != null) {
                while (i16 < this.alphabet.bytesPerChunk * 8) {
                    appendable.append(this.paddingChar.charValue());
                    i16 += this.alphabet.bitsPerChar;
                }
            }
        }

        @Override // com.google.common.io.BaseEncoding
        public void encodeTo(Appendable appendable, byte[] bArr, int i14, int i15) throws IOException {
            Preconditions.checkNotNull(appendable);
            Preconditions.checkPositionIndexes(i14, i14 + i15, bArr.length);
            int i16 = 0;
            while (i16 < i15) {
                encodeChunkTo(appendable, bArr, i14 + i16, Math.min(this.alphabet.bytesPerChunk, i15 - i16));
                i16 += this.alphabet.bytesPerChunk;
            }
        }

        @Override // com.google.common.io.BaseEncoding
        @J2ktIncompatible
        @GwtIncompatible
        public OutputStream encodingStream(final Writer writer) {
            Preconditions.checkNotNull(writer);
            return new OutputStream(this) { // from class: com.google.common.io.BaseEncoding.StandardBaseEncoding.1
                final /* synthetic */ StandardBaseEncoding this$0;
                int bitBuffer = 0;
                int bitBufferLength = 0;
                int writtenChars = 0;

                {
                    this.this$0 = this;
                }

                @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
                public void close() throws IOException {
                    int i14 = this.bitBufferLength;
                    if (i14 > 0) {
                        int i15 = this.bitBuffer;
                        Alphabet alphabet = this.this$0.alphabet;
                        writer.write(alphabet.encode((i15 << (alphabet.bitsPerChar - i14)) & alphabet.mask));
                        this.writtenChars++;
                        if (this.this$0.paddingChar != null) {
                            while (true) {
                                int i16 = this.writtenChars;
                                StandardBaseEncoding standardBaseEncoding = this.this$0;
                                if (i16 % standardBaseEncoding.alphabet.charsPerChunk == 0) {
                                    break;
                                }
                                writer.write(standardBaseEncoding.paddingChar.charValue());
                                this.writtenChars++;
                            }
                        }
                    }
                    writer.close();
                }

                @Override // java.io.OutputStream, java.io.Flushable
                public void flush() throws IOException {
                    writer.flush();
                }

                @Override // java.io.OutputStream
                public void write(int i14) throws IOException {
                    this.bitBuffer = (i14 & 255) | (this.bitBuffer << 8);
                    this.bitBufferLength += 8;
                    while (true) {
                        int i15 = this.bitBufferLength;
                        Alphabet alphabet = this.this$0.alphabet;
                        int i16 = alphabet.bitsPerChar;
                        if (i15 < i16) {
                            return;
                        }
                        writer.write(alphabet.encode((this.bitBuffer >> (i15 - i16)) & alphabet.mask));
                        this.writtenChars++;
                        this.bitBufferLength -= this.this$0.alphabet.bitsPerChar;
                    }
                }
            };
        }

        public boolean equals(Object obj) {
            if (obj instanceof StandardBaseEncoding) {
                StandardBaseEncoding standardBaseEncoding = (StandardBaseEncoding) obj;
                if (this.alphabet.equals(standardBaseEncoding.alphabet) && Objects.equals(this.paddingChar, standardBaseEncoding.paddingChar)) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            return this.alphabet.hashCode() ^ Objects.hashCode(this.paddingChar);
        }

        @Override // com.google.common.io.BaseEncoding
        public BaseEncoding ignoreCase() {
            BaseEncoding baseEncodingNewInstance = this.ignoreCase;
            if (baseEncodingNewInstance == null) {
                Alphabet alphabetIgnoreCase = this.alphabet.ignoreCase();
                baseEncodingNewInstance = alphabetIgnoreCase == this.alphabet ? this : newInstance(alphabetIgnoreCase, this.paddingChar);
                this.ignoreCase = baseEncodingNewInstance;
            }
            return baseEncodingNewInstance;
        }

        @Override // com.google.common.io.BaseEncoding
        public BaseEncoding lowerCase() {
            BaseEncoding baseEncodingNewInstance = this.lowerCase;
            if (baseEncodingNewInstance == null) {
                Alphabet alphabetLowerCase = this.alphabet.lowerCase();
                baseEncodingNewInstance = alphabetLowerCase == this.alphabet ? this : newInstance(alphabetLowerCase, this.paddingChar);
                this.lowerCase = baseEncodingNewInstance;
            }
            return baseEncodingNewInstance;
        }

        @Override // com.google.common.io.BaseEncoding
        public int maxDecodedSize(int i14) {
            return (int) (((((long) this.alphabet.bitsPerChar) * ((long) i14)) + 7) / 8);
        }

        @Override // com.google.common.io.BaseEncoding
        public int maxEncodedSize(int i14) {
            Alphabet alphabet = this.alphabet;
            return IntMath.divide(i14, alphabet.bytesPerChunk, RoundingMode.CEILING) * alphabet.charsPerChunk;
        }

        public BaseEncoding newInstance(Alphabet alphabet, Character ch3) {
            return new StandardBaseEncoding(alphabet, ch3);
        }

        @Override // com.google.common.io.BaseEncoding
        public BaseEncoding omitPadding() {
            return this.paddingChar == null ? this : newInstance(this.alphabet, null);
        }

        public String toString() {
            StringBuilder sb3 = new StringBuilder("BaseEncoding.");
            sb3.append(this.alphabet);
            if (8 % this.alphabet.bitsPerChar != 0) {
                if (this.paddingChar == null) {
                    sb3.append(".omitPadding()");
                } else {
                    sb3.append(".withPadChar('");
                    sb3.append(this.paddingChar);
                    sb3.append("')");
                }
            }
            return sb3.toString();
        }

        @Override // com.google.common.io.BaseEncoding
        public CharSequence trimTrailingPadding(CharSequence charSequence) {
            Preconditions.checkNotNull(charSequence);
            Character ch3 = this.paddingChar;
            if (ch3 == null) {
                return charSequence;
            }
            char cCharValue = ch3.charValue();
            int length = charSequence.length() - 1;
            while (length >= 0 && charSequence.charAt(length) == cCharValue) {
                length--;
            }
            return charSequence.subSequence(0, length + 1);
        }

        @Override // com.google.common.io.BaseEncoding
        public BaseEncoding upperCase() {
            BaseEncoding baseEncodingNewInstance = this.upperCase;
            if (baseEncodingNewInstance == null) {
                Alphabet alphabetUpperCase = this.alphabet.upperCase();
                baseEncodingNewInstance = alphabetUpperCase == this.alphabet ? this : newInstance(alphabetUpperCase, this.paddingChar);
                this.upperCase = baseEncodingNewInstance;
            }
            return baseEncodingNewInstance;
        }

        @Override // com.google.common.io.BaseEncoding
        public BaseEncoding withPadChar(char c14) {
            Character ch3;
            return (8 % this.alphabet.bitsPerChar == 0 || ((ch3 = this.paddingChar) != null && ch3.charValue() == c14)) ? this : newInstance(this.alphabet, Character.valueOf(c14));
        }

        @Override // com.google.common.io.BaseEncoding
        public BaseEncoding withSeparator(String str, int i14) {
            for (int i15 = 0; i15 < str.length(); i15++) {
                Preconditions.checkArgument(!this.alphabet.matches(str.charAt(i15)), "Separator (%s) cannot contain alphabet characters", str);
            }
            Character ch3 = this.paddingChar;
            if (ch3 != null) {
                Preconditions.checkArgument(str.indexOf(ch3.charValue()) < 0, "Separator (%s) cannot contain padding character", str);
            }
            return new SeparatedBaseEncoding(this, str, i14);
        }

        public StandardBaseEncoding(String str, String str2, Character ch3) {
            this(new Alphabet(str, str2.toCharArray()), ch3);
        }
    }

    public static final class Base16Encoding extends StandardBaseEncoding {
        final char[] encoding;

        private Base16Encoding(Alphabet alphabet) {
            super(alphabet, null);
            this.encoding = new char[512];
            Preconditions.checkArgument(alphabet.chars.length == 16);
            for (int i14 = 0; i14 < 256; i14++) {
                this.encoding[i14] = alphabet.encode(i14 >>> 4);
                this.encoding[i14 | 256] = alphabet.encode(i14 & 15);
            }
        }

        @Override // com.google.common.io.BaseEncoding.StandardBaseEncoding, com.google.common.io.BaseEncoding
        public int decodeTo(byte[] bArr, CharSequence charSequence) throws DecodingException {
            Preconditions.checkNotNull(bArr);
            if (charSequence.length() % 2 == 1) {
                b.a(charSequence.length(), "Invalid input length ");
                return 0;
            }
            int i14 = 0;
            int i15 = 0;
            while (i14 < charSequence.length()) {
                bArr[i15] = (byte) ((this.alphabet.decode(charSequence.charAt(i14)) << 4) | this.alphabet.decode(charSequence.charAt(i14 + 1)));
                i14 += 2;
                i15++;
            }
            return i15;
        }

        @Override // com.google.common.io.BaseEncoding.StandardBaseEncoding, com.google.common.io.BaseEncoding
        public void encodeTo(Appendable appendable, byte[] bArr, int i14, int i15) throws IOException {
            Preconditions.checkNotNull(appendable);
            Preconditions.checkPositionIndexes(i14, i14 + i15, bArr.length);
            for (int i16 = 0; i16 < i15; i16++) {
                int i17 = bArr[i14 + i16] & UnsignedBytes.MAX_VALUE;
                appendable.append(this.encoding[i17]);
                appendable.append(this.encoding[i17 | 256]);
            }
        }

        @Override // com.google.common.io.BaseEncoding.StandardBaseEncoding
        public BaseEncoding newInstance(Alphabet alphabet, Character ch3) {
            return new Base16Encoding(alphabet);
        }

        public Base16Encoding(String str, String str2) {
            this(new Alphabet(str, str2.toCharArray()));
        }
    }

    public static final class Alphabet {
        final int bitsPerChar;
        final int bytesPerChunk;
        private final char[] chars;
        final int charsPerChunk;
        private final byte[] decodabet;
        private final boolean ignoreCase;
        final int mask;
        private final String name;
        private final boolean[] validPadding;

        private Alphabet(String str, char[] cArr, byte[] bArr, boolean z14) {
            this.name = (String) Preconditions.checkNotNull(str);
            this.chars = (char[]) Preconditions.checkNotNull(cArr);
            try {
                int iLog2 = IntMath.log2(cArr.length, RoundingMode.UNNECESSARY);
                this.bitsPerChar = iLog2;
                int iNumberOfTrailingZeros = Integer.numberOfTrailingZeros(iLog2);
                int i14 = 1 << (3 - iNumberOfTrailingZeros);
                this.charsPerChunk = i14;
                this.bytesPerChunk = iLog2 >> iNumberOfTrailingZeros;
                this.mask = cArr.length - 1;
                this.decodabet = bArr;
                boolean[] zArr = new boolean[i14];
                for (int i15 = 0; i15 < this.bytesPerChunk; i15++) {
                    zArr[IntMath.divide(i15 * 8, this.bitsPerChar, RoundingMode.CEILING)] = true;
                }
                this.validPadding = zArr;
                this.ignoreCase = z14;
            } catch (ArithmeticException e4) {
                throw new IllegalArgumentException("Illegal alphabet length " + cArr.length, e4);
            }
        }

        private static byte[] decodabetFor(char[] cArr) {
            byte[] bArr = new byte[128];
            Arrays.fill(bArr, (byte) -1);
            for (int i14 = 0; i14 < cArr.length; i14++) {
                char c14 = cArr[i14];
                boolean z14 = true;
                Preconditions.checkArgument(c14 < 128, "Non-ASCII character: %s", c14);
                if (bArr[c14] != -1) {
                    z14 = false;
                }
                Preconditions.checkArgument(z14, "Duplicate character: %s", c14);
                bArr[c14] = (byte) i14;
            }
            return bArr;
        }

        private boolean hasLowerCase() {
            for (char c14 : this.chars) {
                if (Ascii.isLowerCase(c14)) {
                    return true;
                }
            }
            return false;
        }

        private boolean hasUpperCase() {
            for (char c14 : this.chars) {
                if (Ascii.isUpperCase(c14)) {
                    return true;
                }
            }
            return false;
        }

        public boolean canDecode(char c14) {
            return c14 <= 127 && this.decodabet[c14] != -1;
        }

        public int decode(char c14) throws DecodingException {
            if (c14 > 127) {
                throw new DecodingException("Unrecognized character: 0x" + Integer.toHexString(c14));
            }
            byte b14 = this.decodabet[c14];
            if (b14 != -1) {
                return b14;
            }
            if (c14 > ' ' && c14 != 127) {
                throw new DecodingException(k.f("Unrecognized character: ", c14));
            }
            throw new DecodingException("Unrecognized character: 0x" + Integer.toHexString(c14));
        }

        public char encode(int i14) {
            return this.chars[i14];
        }

        public boolean equals(Object obj) {
            if (obj instanceof Alphabet) {
                Alphabet alphabet = (Alphabet) obj;
                if (this.ignoreCase == alphabet.ignoreCase && Arrays.equals(this.chars, alphabet.chars)) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            return Arrays.hashCode(this.chars) + (this.ignoreCase ? 1231 : 1237);
        }

        public Alphabet ignoreCase() {
            if (this.ignoreCase) {
                return this;
            }
            byte[] bArr = this.decodabet;
            byte[] bArrCopyOf = Arrays.copyOf(bArr, bArr.length);
            int i14 = 65;
            while (true) {
                if (i14 > 90) {
                    return new Alphabet(j.o(this.name, ".ignoreCase()", new StringBuilder()), this.chars, bArrCopyOf, true);
                }
                int i15 = i14 | 32;
                byte[] bArr2 = this.decodabet;
                byte b14 = bArr2[i14];
                byte b15 = bArr2[i15];
                if (b14 == -1) {
                    bArrCopyOf[i14] = b15;
                } else {
                    Preconditions.checkState(b15 == -1, "Can't ignoreCase() since '%s' and '%s' encode different values", (char) i14, (char) i15);
                    bArrCopyOf[i15] = b14;
                }
                i14++;
            }
        }

        public boolean isValidPaddingStartPosition(int i14) {
            return this.validPadding[i14 % this.charsPerChunk];
        }

        public Alphabet lowerCase() {
            if (!hasUpperCase()) {
                return this;
            }
            Preconditions.checkState(!hasLowerCase(), "Cannot call lowerCase() on a mixed-case alphabet");
            char[] cArr = new char[this.chars.length];
            int i14 = 0;
            while (true) {
                char[] cArr2 = this.chars;
                if (i14 >= cArr2.length) {
                    break;
                }
                cArr[i14] = Ascii.toLowerCase(cArr2[i14]);
                i14++;
            }
            Alphabet alphabet = new Alphabet(j.o(this.name, ".lowerCase()", new StringBuilder()), cArr);
            return this.ignoreCase ? alphabet.ignoreCase() : alphabet;
        }

        public boolean matches(char c14) {
            byte[] bArr = this.decodabet;
            return c14 < bArr.length && bArr[c14] != -1;
        }

        public String toString() {
            return this.name;
        }

        public Alphabet upperCase() {
            if (!hasLowerCase()) {
                return this;
            }
            Preconditions.checkState(!hasUpperCase(), "Cannot call upperCase() on a mixed-case alphabet");
            char[] cArr = new char[this.chars.length];
            int i14 = 0;
            while (true) {
                char[] cArr2 = this.chars;
                if (i14 >= cArr2.length) {
                    break;
                }
                cArr[i14] = Ascii.toUpperCase(cArr2[i14]);
                i14++;
            }
            Alphabet alphabet = new Alphabet(j.o(this.name, ".upperCase()", new StringBuilder()), cArr);
            return this.ignoreCase ? alphabet.ignoreCase() : alphabet;
        }

        public Alphabet(String str, char[] cArr) {
            this(str, cArr, decodabetFor(cArr), false);
        }
    }
}
