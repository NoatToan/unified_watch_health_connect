package defpackage;

import android.graphics.SurfaceTexture;
import android.media.MediaFormat;
import android.opengl.GLES20;
import android.opengl.Matrix;
import com.google.android.exoplayer2.Format;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes4.dex */
public final class vel implements arq, mh3 {
    public int i;
    public SurfaceTexture j;
    public byte[] m;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AtomicBoolean f36807a = new AtomicBoolean();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AtomicBoolean f36808b = new AtomicBoolean(true);
    public final edi c = new edi();
    public final joa d = new joa();
    public final kfp<Long> e = new kfp<>();
    public final kfp<cdi> f = new kfp<>();
    public final float[] g = new float[16];
    public final float[] h = new float[16];

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public volatile int f36809k = 0;
    public int l = -1;

    @Override // defpackage.arq
    public void a(long j, long j2, Format format, MediaFormat mediaFormat) {
        this.e.a(j2, Long.valueOf(j));
        i(format.v, format.w, j2);
    }

    @Override // defpackage.mh3
    public void c(long j, float[] fArr) {
        this.d.e(j, fArr);
    }

    @Override // defpackage.mh3
    public void d() {
        this.e.c();
        this.d.d();
        this.f36808b.set(true);
    }

    public void e(float[] fArr, boolean z) {
        GLES20.glClear(16384);
        yza.b();
        if (this.f36807a.compareAndSet(true, false)) {
            ((SurfaceTexture) rk1.e(this.j)).updateTexImage();
            yza.b();
            if (this.f36808b.compareAndSet(true, false)) {
                Matrix.setIdentityM(this.g, 0);
            }
            long timestamp = this.j.getTimestamp();
            Long lG = this.e.g(timestamp);
            if (lG != null) {
                this.d.c(this.g, lG.longValue());
            }
            cdi cdiVarJ = this.f.j(timestamp);
            if (cdiVarJ != null) {
                this.c.d(cdiVarJ);
            }
        }
        Matrix.multiplyMM(this.h, 0, fArr, 0, this.g, 0);
        this.c.a(this.i, this.h, z);
    }

    public SurfaceTexture f() {
        GLES20.glClearColor(0.5f, 0.5f, 0.5f, 1.0f);
        yza.b();
        this.c.b();
        yza.b();
        this.i = yza.g();
        SurfaceTexture surfaceTexture = new SurfaceTexture(this.i);
        this.j = surfaceTexture;
        surfaceTexture.setOnFrameAvailableListener(new SurfaceTexture.OnFrameAvailableListener() { // from class: uel
            @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
            public final void onFrameAvailable(SurfaceTexture surfaceTexture2) {
                this.f35690a.g(surfaceTexture2);
            }
        });
        return this.j;
    }

    public final /* synthetic */ void g(SurfaceTexture surfaceTexture) {
        this.f36807a.set(true);
    }

    public void h(int i) {
        this.f36809k = i;
    }

    public final void i(byte[] bArr, int i, long j) {
        byte[] bArr2 = this.m;
        int i2 = this.l;
        this.m = bArr;
        if (i == -1) {
            i = this.f36809k;
        }
        this.l = i;
        if (i2 == i && Arrays.equals(bArr2, this.m)) {
            return;
        }
        byte[] bArr3 = this.m;
        cdi cdiVarA = bArr3 != null ? ddi.a(bArr3, this.l) : null;
        if (cdiVarA == null || !edi.c(cdiVarA)) {
            cdiVarA = cdi.b(this.l);
        }
        this.f.a(j, cdiVarA);
    }
}
