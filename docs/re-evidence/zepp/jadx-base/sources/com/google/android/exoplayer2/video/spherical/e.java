package com.google.android.exoplayer2.video.spherical;

import android.graphics.SurfaceTexture;
import android.media.MediaFormat;
import android.opengl.GLES20;
import android.opengl.Matrix;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.GlUtil;
import com.google.android.exoplayer2.util.TimedValueQueue;
import com.google.android.exoplayer2.video.VideoFrameMetadataListener;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes3.dex */
final class e implements VideoFrameMetadataListener, CameraMotionListener {
    private int i;
    private SurfaceTexture j;

    @Nullable
    private byte[] m;
    private final AtomicBoolean a = new AtomicBoolean();
    private final AtomicBoolean b = new AtomicBoolean(true);
    private final c c = new c();
    private final a d = new a();
    private final TimedValueQueue<Long> e = new TimedValueQueue<>();
    private final TimedValueQueue<Projection> f = new TimedValueQueue<>();
    private final float[] g = new float[16];
    private final float[] h = new float[16];
    private volatile int k = 0;
    private int l = -1;

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void d(SurfaceTexture surfaceTexture) {
        this.a.set(true);
    }

    private void f(@Nullable byte[] projectionData, int stereoMode, long timeNs) {
        byte[] bArr = this.m;
        int i = this.l;
        this.m = projectionData;
        if (stereoMode == -1) {
            stereoMode = this.k;
        }
        this.l = stereoMode;
        if (i == stereoMode && Arrays.equals(bArr, this.m)) {
            return;
        }
        byte[] bArr2 = this.m;
        Projection projectionA = bArr2 != null ? b.a(bArr2, this.l) : null;
        if (projectionA == null || !c.c(projectionA)) {
            projectionA = Projection.b(this.l);
        }
        this.f.add(timeNs, projectionA);
    }

    public void b(float[] viewProjectionMatrix, boolean rightEye) {
        GLES20.glClear(16384);
        GlUtil.checkGlError();
        if (this.a.compareAndSet(true, false)) {
            ((SurfaceTexture) Assertions.checkNotNull(this.j)).updateTexImage();
            GlUtil.checkGlError();
            if (this.b.compareAndSet(true, false)) {
                Matrix.setIdentityM(this.g, 0);
            }
            long timestamp = this.j.getTimestamp();
            Long lPoll = this.e.poll(timestamp);
            if (lPoll != null) {
                this.d.c(this.g, lPoll.longValue());
            }
            Projection projectionPollFloor = this.f.pollFloor(timestamp);
            if (projectionPollFloor != null) {
                this.c.d(projectionPollFloor);
            }
        }
        Matrix.multiplyMM(this.h, 0, viewProjectionMatrix, 0, this.g, 0);
        this.c.a(this.i, this.h, rightEye);
    }

    public SurfaceTexture c() {
        GLES20.glClearColor(0.5f, 0.5f, 0.5f, 1.0f);
        GlUtil.checkGlError();
        this.c.b();
        GlUtil.checkGlError();
        this.i = GlUtil.createExternalTexture();
        SurfaceTexture surfaceTexture = new SurfaceTexture(this.i);
        this.j = surfaceTexture;
        surfaceTexture.setOnFrameAvailableListener(new SurfaceTexture.OnFrameAvailableListener() { // from class: com.google.android.exoplayer2.video.spherical.d
            @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
            public final void onFrameAvailable(SurfaceTexture surfaceTexture2) {
                this.a.d(surfaceTexture2);
            }
        });
        return this.j;
    }

    public void e(int stereoMode) {
        this.k = stereoMode;
    }

    public void g() {
        this.c.e();
    }

    @Override // com.google.android.exoplayer2.video.spherical.CameraMotionListener
    public void onCameraMotion(long timeUs, float[] rotation) {
        this.d.e(timeUs, rotation);
    }

    @Override // com.google.android.exoplayer2.video.spherical.CameraMotionListener
    public void onCameraMotionReset() {
        this.e.clear();
        this.d.d();
        this.b.set(true);
    }

    @Override // com.google.android.exoplayer2.video.VideoFrameMetadataListener
    public void onVideoFrameAboutToBeRendered(long presentationTimeUs, long releaseTimeNs, Format format, @Nullable MediaFormat mediaFormat) {
        this.e.add(releaseTimeNs, Long.valueOf(presentationTimeUs));
        f(format.projectionData, format.stereoMode, releaseTimeNs);
    }
}
