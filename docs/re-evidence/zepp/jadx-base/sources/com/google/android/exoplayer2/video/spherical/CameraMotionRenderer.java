package com.google.android.exoplayer2.video.spherical;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.BaseRenderer;
import com.google.android.exoplayer2.ExoPlaybackException;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.decoder.DecoderInputBuffer;
import com.google.android.exoplayer2.q0;
import com.google.android.exoplayer2.util.MimeTypes;
import com.google.android.exoplayer2.util.ParsableByteArray;
import com.google.android.exoplayer2.util.Util;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes3.dex */
public final class CameraMotionRenderer extends BaseRenderer {
    private static final String r = "CameraMotionRenderer";
    private static final int s = 100000;
    private final DecoderInputBuffer m;
    private final ParsableByteArray n;
    private long o;

    @Nullable
    private CameraMotionListener p;
    private long q;

    public CameraMotionRenderer() {
        super(6);
        this.m = new DecoderInputBuffer(1);
        this.n = new ParsableByteArray();
    }

    @Nullable
    private float[] a(ByteBuffer data) {
        if (data.remaining() != 16) {
            return null;
        }
        this.n.reset(data.array(), data.limit());
        this.n.setPosition(data.arrayOffset() + 4);
        float[] fArr = new float[3];
        for (int i = 0; i < 3; i++) {
            fArr[i] = Float.intBitsToFloat(this.n.readLittleEndianInt());
        }
        return fArr;
    }

    private void b() {
        CameraMotionListener cameraMotionListener = this.p;
        if (cameraMotionListener != null) {
            cameraMotionListener.onCameraMotionReset();
        }
    }

    @Override // com.google.android.exoplayer2.Renderer, com.google.android.exoplayer2.RendererCapabilities
    public String getName() {
        return r;
    }

    @Override // com.google.android.exoplayer2.BaseRenderer, com.google.android.exoplayer2.PlayerMessage.Target
    public void handleMessage(int messageType, @Nullable Object message) throws ExoPlaybackException {
        if (messageType == 7) {
            this.p = (CameraMotionListener) message;
        } else {
            super.handleMessage(messageType, message);
        }
    }

    @Override // com.google.android.exoplayer2.Renderer
    public boolean isEnded() {
        return hasReadStreamToEnd();
    }

    @Override // com.google.android.exoplayer2.Renderer
    public boolean isReady() {
        return true;
    }

    @Override // com.google.android.exoplayer2.BaseRenderer
    public void onDisabled() {
        b();
    }

    @Override // com.google.android.exoplayer2.BaseRenderer
    public void onPositionReset(long positionUs, boolean joining) {
        this.q = Long.MIN_VALUE;
        b();
    }

    @Override // com.google.android.exoplayer2.BaseRenderer
    public void onStreamChanged(Format[] formats, long startPositionUs, long offsetUs) {
        this.o = offsetUs;
    }

    @Override // com.google.android.exoplayer2.Renderer
    public void render(long positionUs, long elapsedRealtimeUs) {
        while (!hasReadStreamToEnd() && this.q < com.google.android.exoplayer2.extractor.mp3.b.e + positionUs) {
            this.m.clear();
            if (readSource(getFormatHolder(), this.m, 0) != -4 || this.m.isEndOfStream()) {
                return;
            }
            DecoderInputBuffer decoderInputBuffer = this.m;
            this.q = decoderInputBuffer.timeUs;
            if (this.p != null && !decoderInputBuffer.isDecodeOnly()) {
                this.m.flip();
                float[] fArrA = a((ByteBuffer) Util.castNonNull(this.m.data));
                if (fArrA != null) {
                    ((CameraMotionListener) Util.castNonNull(this.p)).onCameraMotion(this.q - this.o, fArrA);
                }
            }
        }
    }

    @Override // com.google.android.exoplayer2.RendererCapabilities
    public int supportsFormat(Format format) {
        return MimeTypes.APPLICATION_CAMERA_MOTION.equals(format.sampleMimeType) ? q0.a(4) : q0.a(0);
    }
}
