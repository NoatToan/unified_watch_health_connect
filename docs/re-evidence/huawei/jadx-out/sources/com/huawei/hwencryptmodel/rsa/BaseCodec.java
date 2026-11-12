package com.huawei.hwencryptmodel.rsa;

import health.compact.a.DecoderException;
import health.compact.a.EncoderException;
import health.compact.a.StringUtils;

/* JADX INFO: loaded from: classes2.dex */
public abstract class BaseCodec implements BinaryEncoder, BinaryDecoder {
    public static final String BASE_ROOT_INFO = "67CeEsCdM8UbcYpdKUEGhxRdwBmol2/q";
    private static final int DEFAULT_BUFFER_RESIZE_FACTOR = 2;
    private static final int DEFAULT_BUFFER_SIZE = 8192;
    private static final int EOF = -1;
    protected static final int MASK_8BITS = 255;
    public static final int MIME_CHUNK_SIZE = 76;
    protected static final byte PAD = 61;
    private final int chunkSeparatorLength;
    private final int encodedBlockSize;
    protected final int lineLength;
    private final int unencodedBlockSize;

    protected abstract void decode(byte[] bArr, int i, int i2, e eVar);

    protected abstract void encode(byte[] bArr, int i, int i2, e eVar);

    protected int getDefaultBufferSize() {
        return 8192;
    }

    protected abstract boolean isInAlphabet(byte b2);

    public BaseCodec(int i, int i2, int i3, int i4) {
        this.unencodedBlockSize = i;
        this.encodedBlockSize = i2;
        this.lineLength = (i3 <= 0 || i4 <= 0) ? 0 : (i3 / i2) * i2;
        this.chunkSeparatorLength = i4;
    }

    int available(e eVar) {
        if (eVar.f17562a != null) {
            return eVar.i - eVar.g;
        }
        return 0;
    }

    private byte[] resizeBuffer(e eVar) {
        if (eVar.f17562a == null) {
            eVar.f17562a = new byte[getDefaultBufferSize()];
            eVar.i = 0;
            eVar.g = 0;
        } else {
            byte[] bArr = new byte[eVar.f17562a.length * 2];
            System.arraycopy(eVar.f17562a, 0, bArr, 0, eVar.f17562a.length);
            eVar.f17562a = bArr;
        }
        return eVar.f17562a;
    }

    protected byte[] ensureBufferSize(int i, e eVar) {
        if (eVar.f17562a == null || eVar.f17562a.length < eVar.i + i) {
            return resizeBuffer(eVar);
        }
        return eVar.f17562a;
    }

    int readResults(byte[] bArr, int i, int i2, e eVar) {
        if (eVar.f17562a == null) {
            return eVar.f17563b ? -1 : 0;
        }
        int iMin = Math.min(available(eVar), i2);
        System.arraycopy(eVar.f17562a, eVar.g, bArr, i, iMin);
        eVar.g += iMin;
        if (eVar.g >= eVar.i) {
            eVar.f17562a = null;
        }
        return iMin;
    }

    @Override // com.huawei.hwencryptmodel.rsa.BinaryEncoder
    public byte[] encode(byte[] bArr) {
        if (bArr == null || bArr.length == 0) {
            return bArr;
        }
        e eVar = new e();
        encode(bArr, 0, bArr.length, eVar);
        encode(bArr, 0, -1, eVar);
        int i = eVar.i - eVar.g;
        byte[] bArr2 = new byte[i];
        readResults(bArr2, 0, i, eVar);
        return bArr2;
    }

    @Override // com.huawei.hwencryptmodel.rsa.Encoder
    public Object encode(Object obj) throws EncoderException {
        if (!(obj instanceof byte[])) {
            throw new EncoderException("Parameter supplied to Base-N encode is not a byte[]");
        }
        return encode((byte[]) obj);
    }

    public String encodeToString(byte[] bArr) {
        return StringUtils.a(encode(bArr));
    }

    @Override // com.huawei.hwencryptmodel.rsa.Decoder
    public Object decode(Object obj) throws DecoderException {
        if (obj instanceof byte[]) {
            return decode((byte[]) obj);
        }
        if (obj instanceof String) {
            return decode((String) obj);
        }
        throw new DecoderException("Parameter supplied to Base-N decode is not a byte[] or a String");
    }

    public byte[] decode(String str) {
        return decode(StringUtils.d(str));
    }

    @Override // com.huawei.hwencryptmodel.rsa.BinaryDecoder
    public byte[] decode(byte[] bArr) {
        if (bArr == null || bArr.length == 0) {
            return bArr;
        }
        e eVar = new e();
        decode(bArr, 0, bArr.length, eVar);
        decode(bArr, 0, -1, eVar);
        int i = eVar.i;
        byte[] bArr2 = new byte[i];
        readResults(bArr2, 0, i, eVar);
        return bArr2;
    }

    protected boolean containsAlphabetOrPad(byte[] bArr) {
        if (bArr == null) {
            return false;
        }
        for (byte b2 : bArr) {
            if (b2 == 61 || isInAlphabet(b2)) {
                return true;
            }
        }
        return false;
    }

    public long getEncodedLength(byte[] bArr) {
        int length = bArr.length;
        int i = this.unencodedBlockSize;
        long j = ((long) (((length + i) - 1) / i)) * ((long) this.encodedBlockSize);
        int i2 = this.lineLength;
        if (i2 <= 0) {
            return j;
        }
        long j2 = i2;
        return j + ((((j2 + j) - 1) / j2) * ((long) this.chunkSeparatorLength));
    }

    public static class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        byte[] f17562a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public boolean f17563b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f17564c;
        public int d;
        public int e;
        int g;
        public int i;

        e() {
        }
    }
}
