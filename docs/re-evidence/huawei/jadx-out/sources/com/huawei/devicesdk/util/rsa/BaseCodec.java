package com.huawei.devicesdk.util.rsa;

import defpackage.cqc;
import defpackage.cqs;
import defpackage.cqt;

/* JADX INFO: loaded from: classes4.dex */
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

    protected abstract void decode(byte[] bArr, int i, int i2, c cVar);

    protected abstract void encode(byte[] bArr, int i, int i2, c cVar);

    protected int getDefaultBufferSize() {
        return 8192;
    }

    protected abstract boolean isInAlphabet(byte b2);

    public BaseCodec(int i, int i2, int i3, int i4) {
        this.unencodedBlockSize = i;
        this.encodedBlockSize = i2;
        this.lineLength = (i3 <= 0 || i4 <= 0 || i2 == 0) ? 0 : (i3 / i2) * i2;
        this.chunkSeparatorLength = i4;
    }

    int available(c cVar) {
        if (cVar.f5464c != null) {
            return cVar.j - cVar.f;
        }
        return 0;
    }

    private byte[] resizeBuffer(c cVar) {
        if (cVar.f5464c == null) {
            cVar.f5464c = new byte[getDefaultBufferSize()];
            cVar.j = 0;
            cVar.f = 0;
        } else {
            byte[] bArr = new byte[cVar.f5464c.length * 2];
            System.arraycopy(cVar.f5464c, 0, bArr, 0, cVar.f5464c.length);
            cVar.f5464c = bArr;
        }
        return cVar.f5464c;
    }

    protected byte[] ensureBufferSize(int i, c cVar) {
        if (cVar.f5464c == null || cVar.f5464c.length < cVar.j + i) {
            return resizeBuffer(cVar);
        }
        return cVar.f5464c;
    }

    int readResults(byte[] bArr, int i, int i2, c cVar) {
        if (cVar.f5464c == null) {
            return cVar.e ? -1 : 0;
        }
        int iMin = Math.min(available(cVar), i2);
        System.arraycopy(cVar.f5464c, cVar.f, bArr, i, iMin);
        cVar.f += iMin;
        if (cVar.f >= cVar.j) {
            cVar.f5464c = null;
        }
        return iMin;
    }

    @Override // com.huawei.devicesdk.util.rsa.BinaryEncoder
    public byte[] encode(byte[] bArr) {
        if (bArr == null || bArr.length == 0) {
            return bArr;
        }
        c cVar = new c();
        encode(bArr, 0, bArr.length, cVar);
        encode(bArr, 0, -1, cVar);
        int i = cVar.j - cVar.f;
        byte[] bArr2 = new byte[i];
        readResults(bArr2, 0, i, cVar);
        return bArr2;
    }

    @Override // com.huawei.devicesdk.util.rsa.Encoder
    public Object encode(Object obj) throws cqs {
        if (!(obj instanceof byte[])) {
            throw new cqs("Parameter supplied to Base-N encode is not a byte[]");
        }
        return encode((byte[]) obj);
    }

    public String encodeToString(byte[] bArr) {
        return cqc.c(encode(bArr));
    }

    @Override // com.huawei.devicesdk.util.rsa.Decoder
    public Object decode(Object obj) throws cqt {
        if (obj instanceof byte[]) {
            return decode((byte[]) obj);
        }
        if (obj instanceof String) {
            return decode((String) obj);
        }
        throw new cqt("Parameter supplied to Base-N decode is not a byte[] or a String");
    }

    public byte[] decode(String str) {
        return decode(cqc.a(str));
    }

    @Override // com.huawei.devicesdk.util.rsa.BinaryDecoder
    public byte[] decode(byte[] bArr) {
        if (bArr == null || bArr.length == 0) {
            return bArr;
        }
        c cVar = new c();
        decode(bArr, 0, bArr.length, cVar);
        decode(bArr, 0, -1, cVar);
        int i = cVar.j;
        byte[] bArr2 = new byte[i];
        readResults(bArr2, 0, i, cVar);
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
        int i;
        if (bArr == null || (i = this.unencodedBlockSize) == 0) {
            return 0L;
        }
        long length = ((long) (((bArr.length + i) - 1) / i)) * ((long) this.encodedBlockSize);
        int i2 = this.lineLength;
        if (i2 <= 0) {
            return length;
        }
        long j = i2;
        return length + ((((j + length) - 1) / j) * ((long) this.chunkSeparatorLength));
    }

    public static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f5462a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f5463b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        byte[] f5464c;
        public int d;
        public boolean e;
        int f;
        public int j;

        c() {
        }
    }
}
