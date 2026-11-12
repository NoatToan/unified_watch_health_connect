package ab;

import android.graphics.SurfaceTexture;
import android.media.MediaFormat;
import android.opengl.GLES20;
import androidx.media3.common.q;
import androidx.media3.common.util.GlUtil;
import fa.r;
import fa.v;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes.dex */
public final class i implements za.f, a {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f2470i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public SurfaceTexture f2471j;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public byte[] f2474m;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AtomicBoolean f2462a = new AtomicBoolean();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AtomicBoolean f2463b = new AtomicBoolean(true);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final g f2464c = new g();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final c f2465d = new c();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final v<Long> f2466e = new v<>();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final v<e> f2467f = new v<>();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final float[] f2468g = new float[16];

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final float[] f2469h = new float[16];

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public volatile int f2472k = 0;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f2473l = -1;

    @Override // za.f
    public final void a(long j8, long j14, q qVar, MediaFormat mediaFormat) {
        int i14;
        ArrayList<e.a> arrayListA;
        this.f2466e.a(j14, Long.valueOf(j8));
        byte[] bArr = qVar.f8398z;
        int i15 = qVar.A;
        byte[] bArr2 = this.f2474m;
        int i16 = this.f2473l;
        this.f2474m = bArr;
        if (i15 == -1) {
            i15 = this.f2472k;
        }
        this.f2473l = i15;
        if (i16 == i15 && Arrays.equals(bArr2, this.f2474m)) {
            return;
        }
        byte[] bArr3 = this.f2474m;
        e eVar = null;
        if (bArr3 != null) {
            int i17 = this.f2473l;
            r rVar = new r(bArr3);
            try {
                rVar.H(4);
                int iG = rVar.g();
                rVar.G(0);
                if (iG == 1886547818) {
                    rVar.H(8);
                    int i18 = rVar.f70055b;
                    int i19 = rVar.f70056c;
                    while (true) {
                        if (i18 < i19) {
                            int iG2 = rVar.g() + i18;
                            if (iG2 > i18 && iG2 <= i19) {
                                int iG3 = rVar.g();
                                if (iG3 != 2037673328 && iG3 != 1836279920) {
                                    rVar.G(iG2);
                                    i18 = iG2;
                                }
                                rVar.F(iG2);
                                arrayListA = f.a(rVar);
                            }
                        }
                        arrayListA = null;
                    }
                } else {
                    arrayListA = f.a(rVar);
                }
            } catch (ArrayIndexOutOfBoundsException unused) {
            }
            if (arrayListA != null) {
                int size = arrayListA.size();
                if (size == 1) {
                    eVar = new e(arrayListA.get(0), i17);
                } else if (size == 2) {
                    eVar = new e(arrayListA.get(0), arrayListA.get(1), i17);
                }
            }
        }
        if (eVar == null || !g.b(eVar)) {
            int i24 = this.f2473l;
            float radians = (float) Math.toRadians(180.0f);
            float radians2 = (float) Math.toRadians(360.0f);
            float f14 = radians / 36;
            float f15 = radians2 / 72;
            float[] fArr = new float[15984];
            float[] fArr2 = new float[10656];
            int i25 = 0;
            int i26 = 0;
            int i27 = 0;
            for (int i28 = 36; i25 < i28; i28 = 36) {
                float f16 = radians / 2.0f;
                float f17 = (i25 * f14) - f16;
                int i29 = i25 + 1;
                float f18 = (i29 * f14) - f16;
                int i30 = 0;
                while (i30 < 73) {
                    int i34 = i29;
                    float f19 = f18;
                    float f22 = radians;
                    int i35 = i26;
                    int i36 = i27;
                    int i37 = 0;
                    int i38 = 2;
                    while (i37 < i38) {
                        float f24 = i37 == 0 ? f17 : f19;
                        float f25 = radians2;
                        float f26 = i30 * f15;
                        float f27 = f17;
                        float f28 = f14;
                        double d14 = 50.0f;
                        double d15 = (f26 + 3.1415927f) - (f25 / 2.0f);
                        double d16 = f24;
                        fArr[i35] = -((float) (Math.cos(d16) * Math.sin(d15) * d14));
                        fArr[i35 + 1] = (float) (Math.sin(d16) * d14);
                        int i39 = i35 + 3;
                        fArr[i35 + 2] = (float) (Math.cos(d16) * Math.cos(d15) * d14);
                        fArr2[i36] = f26 / f25;
                        int i44 = i36 + 2;
                        fArr2[i36 + 1] = ((i25 + i37) * f28) / f22;
                        if ((i30 == 0 && i37 == 0) || (i30 == 72 && i37 == 1)) {
                            System.arraycopy(fArr, i35, fArr, i39, 3);
                            i35 += 6;
                            i14 = 2;
                            System.arraycopy(fArr2, i36, fArr2, i44, 2);
                            i36 += 4;
                        } else {
                            i14 = 2;
                            i35 = i39;
                            i36 = i44;
                        }
                        i37++;
                        i38 = i14;
                        radians2 = f25;
                        f17 = f27;
                        f14 = f28;
                    }
                    i30++;
                    i26 = i35;
                    i27 = i36;
                    i29 = i34;
                    f18 = f19;
                    radians = f22;
                    radians2 = radians2;
                    f14 = f14;
                }
                i25 = i29;
            }
            eVar = new e(new e.a(new e.b(0, fArr, fArr2, 1)), i24);
        }
        this.f2467f.a(j14, eVar);
    }

    public final SurfaceTexture b() {
        try {
            GLES20.glClearColor(0.5f, 0.5f, 0.5f, 1.0f);
            GlUtil.b();
            this.f2464c.a();
            GlUtil.b();
            int[] iArr = new int[1];
            GLES20.glGenTextures(1, iArr, 0);
            GlUtil.b();
            int i14 = iArr[0];
            GlUtil.a(36197, i14);
            this.f2470i = i14;
        } catch (GlUtil.GlException e4) {
            fa.k.d("Failed to initialize the renderer", e4);
        }
        SurfaceTexture surfaceTexture = new SurfaceTexture(this.f2470i);
        this.f2471j = surfaceTexture;
        surfaceTexture.setOnFrameAvailableListener(new SurfaceTexture.OnFrameAvailableListener() { // from class: ab.h
            @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
            public final void onFrameAvailable(SurfaceTexture surfaceTexture2) {
                this.f2461a.f2462a.set(true);
            }
        });
        return this.f2471j;
    }

    @Override // ab.a
    public final void onCameraMotion(long j8, float[] fArr) {
        this.f2465d.f2428c.a(j8, fArr);
    }

    @Override // ab.a
    public final void onCameraMotionReset() {
        this.f2466e.b();
        c cVar = this.f2465d;
        cVar.f2428c.b();
        cVar.f2429d = false;
        this.f2463b.set(true);
    }
}
