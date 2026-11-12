package org.apache.commons.codec.binary;

import am.j;
import com.google.common.base.Ascii;
import ds.e0;
import j20.x;
import java.util.Arrays;
import java.util.Objects;
import java.util.function.Supplier;
import org.apache.commons.codec.BinaryDecoder;
import org.apache.commons.codec.BinaryEncoder;
import org.apache.commons.codec.CodecPolicy;
import org.apache.commons.codec.DecoderException;
import org.apache.commons.codec.EncoderException;

/* JADX INFO: loaded from: classes3.dex */
public abstract class BaseNCodec implements BinaryEncoder, BinaryDecoder {
    private static final int DEFAULT_BUFFER_RESIZE_FACTOR = 2;
    private static final int DEFAULT_BUFFER_SIZE = 8192;
    static final int EOF = -1;
    protected static final int MASK_8BITS = 255;
    private static final int MAX_BUFFER_SIZE = 2147483639;
    public static final int MIME_CHUNK_SIZE = 76;
    protected static final byte PAD_DEFAULT = 61;
    public static final int PEM_CHUNK_SIZE = 64;

    @Deprecated
    protected final byte PAD;
    private final int chunkSeparatorLength;
    private final CodecPolicy decodingPolicy;
    private final int encodedBlockSize;
    protected final int lineLength;
    protected final byte pad;
    private final int unencodedBlockSize;
    protected static final CodecPolicy DECODING_POLICY_DEFAULT = CodecPolicy.LENIENT;
    static final byte[] CHUNK_SEPARATOR = {Ascii.CR, 10};

    public static abstract class AbstractBuilder<T, B extends AbstractBuilder<T, B>> implements Supplier<T> {
        private final byte[] defaultEncodeTable;
        private byte[] encodeTable;
        private int lineLength;
        private CodecPolicy decodingPolicy = BaseNCodec.DECODING_POLICY_DEFAULT;
        private byte[] lineSeparator = BaseNCodec.CHUNK_SEPARATOR;
        private byte padding = BaseNCodec.PAD_DEFAULT;

        public AbstractBuilder(byte[] bArr) {
            this.defaultEncodeTable = bArr;
            this.encodeTable = bArr;
        }

        public B asThis() {
            return this;
        }

        public CodecPolicy getDecodingPolicy() {
            return this.decodingPolicy;
        }

        public byte[] getEncodeTable() {
            return this.encodeTable;
        }

        public int getLineLength() {
            return this.lineLength;
        }

        public byte[] getLineSeparator() {
            return this.lineSeparator;
        }

        public byte getPadding() {
            return this.padding;
        }

        public B setDecodingPolicy(CodecPolicy codecPolicy) {
            if (codecPolicy == null) {
                codecPolicy = BaseNCodec.DECODING_POLICY_DEFAULT;
            }
            this.decodingPolicy = codecPolicy;
            return (B) asThis();
        }

        public B setEncodeTable(byte... bArr) {
            if (bArr == null) {
                bArr = this.defaultEncodeTable;
            }
            this.encodeTable = bArr;
            return (B) asThis();
        }

        public B setLineLength(int i14) {
            this.lineLength = Math.max(0, i14);
            return (B) asThis();
        }

        public B setLineSeparator(byte... bArr) {
            if (bArr == null) {
                bArr = BaseNCodec.CHUNK_SEPARATOR;
            }
            this.lineSeparator = bArr;
            return (B) asThis();
        }

        public B setPadding(byte b14) {
            this.padding = b14;
            return (B) asThis();
        }
    }

    public static class Context {
        byte[] buffer;
        int currentLinePos;
        boolean eof;
        int ibitWorkArea;
        long lbitWorkArea;
        int modulus;
        int pos;
        int readPos;

        public String toString() {
            String simpleName = getClass().getSimpleName();
            String string = Arrays.toString(this.buffer);
            int i14 = this.currentLinePos;
            boolean z14 = this.eof;
            int i15 = this.ibitWorkArea;
            long j8 = this.lbitWorkArea;
            int i16 = this.modulus;
            int i17 = this.pos;
            int i18 = this.readPos;
            StringBuilder sb3 = new StringBuilder();
            sb3.append(simpleName);
            sb3.append("[buffer=");
            sb3.append(string);
            sb3.append(", currentLinePos=");
            sb3.append(i14);
            sb3.append(", eof=");
            sb3.append(z14);
            sb3.append(", ibitWorkArea=");
            sb3.append(i15);
            x.j(j8, ", lbitWorkArea=", ", modulus=", sb3);
            e0.m(i16, i17, ", pos=", ", readPos=", sb3);
            return j.q(sb3, i18, "]");
        }
    }

    public BaseNCodec(int i14, int i15, int i16, int i17, byte b14, CodecPolicy codecPolicy) {
        this.PAD = PAD_DEFAULT;
        this.unencodedBlockSize = i14;
        this.encodedBlockSize = i15;
        this.lineLength = (i16 <= 0 || i17 <= 0) ? 0 : (i16 / i15) * i15;
        this.chunkSeparatorLength = i17;
        this.pad = b14;
        Objects.requireNonNull(codecPolicy, "codecPolicy");
        this.decodingPolicy = codecPolicy;
    }

    private static int createPositiveCapacity(int i14) {
        if (i14 >= 0) {
            return Math.max(i14, MAX_BUFFER_SIZE);
        }
        throw new OutOfMemoryError("Unable to allocate array size: " + (((long) i14) & 4294967295L));
    }

    public static byte[] getChunkSeparator() {
        return (byte[]) CHUNK_SEPARATOR.clone();
    }

    @Deprecated
    public static boolean isWhiteSpace(byte b14) {
        return Character.isWhitespace(b14);
    }

    private static byte[] resizeBuffer(Context context, int i14) {
        int length = context.buffer.length * 2;
        if (Integer.compareUnsigned(length, i14) < 0) {
            length = i14;
        }
        if (Integer.compareUnsigned(length, MAX_BUFFER_SIZE) > 0) {
            length = createPositiveCapacity(i14);
        }
        byte[] bArrCopyOf = Arrays.copyOf(context.buffer, length);
        context.buffer = bArrCopyOf;
        return bArrCopyOf;
    }

    public static int toLength(byte[] bArr) {
        if (bArr == null) {
            return 0;
        }
        return bArr.length;
    }

    public int available(Context context) {
        if (hasData(context)) {
            return context.pos - context.readPos;
        }
        return 0;
    }

    public boolean containsAlphabetOrPad(byte[] bArr) {
        if (bArr != null) {
            for (byte b14 : bArr) {
                if (this.pad == b14 || isInAlphabet(b14)) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // org.apache.commons.codec.Decoder
    public Object decode(Object obj) throws DecoderException {
        if (obj instanceof byte[]) {
            return decode((byte[]) obj);
        }
        if (obj instanceof String) {
            return decode((String) obj);
        }
        throw new DecoderException("Parameter supplied to Base-N decode is not a byte[] or a String");
    }

    public abstract void decode(byte[] bArr, int i14, int i15, Context context);

    public abstract void encode(byte[] bArr, int i14, int i15, Context context);

    public byte[] encode(byte[] bArr, int i14, int i15) {
        if (BinaryCodec.isEmpty(bArr)) {
            return bArr;
        }
        Context context = new Context();
        encode(bArr, i14, i15, context);
        encode(bArr, i14, -1, context);
        int i16 = context.pos - context.readPos;
        byte[] bArr2 = new byte[i16];
        readResults(bArr2, 0, i16, context);
        return bArr2;
    }

    public String encodeAsString(byte[] bArr) {
        return StringUtils.newStringUtf8(encode(bArr));
    }

    public String encodeToString(byte[] bArr) {
        return StringUtils.newStringUtf8(encode(bArr));
    }

    public byte[] ensureBufferSize(int i14, Context context) {
        byte[] bArr = context.buffer;
        if (bArr == null) {
            context.buffer = new byte[Math.max(i14, getDefaultBufferSize())];
            context.pos = 0;
            context.readPos = 0;
        } else {
            int i15 = context.pos;
            if ((i15 + i14) - bArr.length > 0) {
                return resizeBuffer(context, i15 + i14);
            }
        }
        return context.buffer;
    }

    public CodecPolicy getCodecPolicy() {
        return this.decodingPolicy;
    }

    public int getDefaultBufferSize() {
        return 8192;
    }

    public long getEncodedLength(byte[] bArr) {
        int length = bArr.length;
        int i14 = this.unencodedBlockSize;
        long j8 = ((long) (((length + i14) - 1) / i14)) * ((long) this.encodedBlockSize);
        int i15 = this.lineLength;
        return i15 > 0 ? ((((((long) i15) + j8) - 1) / ((long) i15)) * ((long) this.chunkSeparatorLength)) + j8 : j8;
    }

    public boolean hasData(Context context) {
        return context.pos > context.readPos;
    }

    public abstract boolean isInAlphabet(byte b14);

    public boolean isInAlphabet(byte[] bArr, boolean z14) {
        for (byte b14 : bArr) {
            if (!isInAlphabet(b14) && (!z14 || (b14 != this.pad && !Character.isWhitespace(b14)))) {
                return false;
            }
        }
        return true;
    }

    public boolean isStrictDecoding() {
        return this.decodingPolicy == CodecPolicy.STRICT;
    }

    public int readResults(byte[] bArr, int i14, int i15, Context context) {
        if (!hasData(context)) {
            return context.eof ? -1 : 0;
        }
        int iMin = Math.min(available(context), i15);
        System.arraycopy(context.buffer, context.readPos, bArr, i14, iMin);
        context.readPos += iMin;
        if (!hasData(context)) {
            context.readPos = 0;
            context.pos = 0;
        }
        return iMin;
    }

    @Override // org.apache.commons.codec.BinaryDecoder
    public byte[] decode(byte[] bArr) {
        if (BinaryCodec.isEmpty(bArr)) {
            return bArr;
        }
        Context context = new Context();
        decode(bArr, 0, bArr.length, context);
        decode(bArr, 0, -1, context);
        int i14 = context.pos;
        byte[] bArr2 = new byte[i14];
        readResults(bArr2, 0, i14, context);
        return bArr2;
    }

    @Override // org.apache.commons.codec.BinaryEncoder
    public byte[] encode(byte[] bArr) {
        return BinaryCodec.isEmpty(bArr) ? bArr : encode(bArr, 0, bArr.length);
    }

    public boolean isInAlphabet(String str) {
        return isInAlphabet(StringUtils.getBytesUtf8(str), true);
    }

    public BaseNCodec(int i14, int i15, int i16, int i17, byte b14) {
        this(i14, i15, i16, i17, b14, DECODING_POLICY_DEFAULT);
    }

    @Override // org.apache.commons.codec.Encoder
    public Object encode(Object obj) throws EncoderException {
        if (obj instanceof byte[]) {
            return encode((byte[]) obj);
        }
        throw new EncoderException("Parameter supplied to Base-N encode is not a byte[]");
    }

    public BaseNCodec(int i14, int i15, int i16, int i17) {
        this(i14, i15, i16, i17, PAD_DEFAULT);
    }

    public byte[] decode(String str) {
        return decode(StringUtils.getBytesUtf8(str));
    }
}
