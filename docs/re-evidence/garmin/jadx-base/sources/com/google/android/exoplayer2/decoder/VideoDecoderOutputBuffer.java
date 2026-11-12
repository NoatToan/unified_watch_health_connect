package com.google.android.exoplayer2.decoder;

import com.google.android.exoplayer2.Format;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes13.dex */
public class VideoDecoderOutputBuffer extends DecoderOutputBuffer {
    public static final int COLORSPACE_BT2020 = 3;
    public static final int COLORSPACE_BT601 = 1;
    public static final int COLORSPACE_BT709 = 2;
    public static final int COLORSPACE_UNKNOWN = 0;
    public int colorspace;
    public ByteBuffer data;
    public int decoderPrivate;
    public Format format;
    public int height;
    public int mode;
    private final DecoderOutputBuffer.Owner<VideoDecoderOutputBuffer> owner;
    public ByteBuffer supplementalData;
    public int width;
    public ByteBuffer[] yuvPlanes;
    public int[] yuvStrides;

    public VideoDecoderOutputBuffer(DecoderOutputBuffer.Owner<VideoDecoderOutputBuffer> owner) {
        this.owner = owner;
    }

    private static boolean isSafeToMultiply(int i14, int i15) {
        if (i14 < 0 || i15 < 0) {
            return false;
        }
        return i15 <= 0 || i14 < Integer.MAX_VALUE / i15;
    }

    public void init(long j8, int i14, ByteBuffer byteBuffer) {
        this.timeUs = j8;
        this.mode = i14;
        if (byteBuffer == null || !byteBuffer.hasRemaining()) {
            this.supplementalData = null;
            return;
        }
        addFlag(268435456);
        int iLimit = byteBuffer.limit();
        ByteBuffer byteBuffer2 = this.supplementalData;
        if (byteBuffer2 == null || byteBuffer2.capacity() < iLimit) {
            this.supplementalData = ByteBuffer.allocate(iLimit);
        } else {
            this.supplementalData.clear();
        }
        this.supplementalData.put(byteBuffer);
        this.supplementalData.flip();
        byteBuffer.position(0);
    }

    public void initForPrivateFrame(int i14, int i15) {
        this.width = i14;
        this.height = i15;
    }

    public boolean initForYuvFrame(int i14, int i15, int i16, int i17, int i18) {
        this.width = i14;
        this.height = i15;
        this.colorspace = i18;
        int i19 = (int) ((((long) i15) + 1) / 2);
        if (isSafeToMultiply(i16, i15) && isSafeToMultiply(i17, i19)) {
            int i24 = i15 * i16;
            int i25 = i19 * i17;
            int i26 = (i25 * 2) + i24;
            if (isSafeToMultiply(i25, 2) && i26 >= i24) {
                ByteBuffer byteBuffer = this.data;
                if (byteBuffer == null || byteBuffer.capacity() < i26) {
                    this.data = ByteBuffer.allocateDirect(i26);
                } else {
                    this.data.position(0);
                    this.data.limit(i26);
                }
                if (this.yuvPlanes == null) {
                    this.yuvPlanes = new ByteBuffer[3];
                }
                ByteBuffer byteBuffer2 = this.data;
                ByteBuffer[] byteBufferArr = this.yuvPlanes;
                ByteBuffer byteBufferSlice = byteBuffer2.slice();
                byteBufferArr[0] = byteBufferSlice;
                byteBufferSlice.limit(i24);
                byteBuffer2.position(i24);
                ByteBuffer byteBufferSlice2 = byteBuffer2.slice();
                byteBufferArr[1] = byteBufferSlice2;
                byteBufferSlice2.limit(i25);
                byteBuffer2.position(i24 + i25);
                ByteBuffer byteBufferSlice3 = byteBuffer2.slice();
                byteBufferArr[2] = byteBufferSlice3;
                byteBufferSlice3.limit(i25);
                if (this.yuvStrides == null) {
                    this.yuvStrides = new int[3];
                }
                int[] iArr = this.yuvStrides;
                iArr[0] = i16;
                iArr[1] = i17;
                iArr[2] = i17;
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.exoplayer2.decoder.DecoderOutputBuffer
    public void release() {
        this.owner.releaseOutputBuffer(this);
    }
}
