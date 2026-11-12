package com.huawei.ucd.medal;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.opengl.GLES20;
import android.opengl.GLU;
import android.os.Handler;
import android.util.Log;
import android.view.MotionEvent;
import com.autonavi.amap.mapcore.AMapEngineUtils;
import com.huawei.ucd.gles.engine.Object3D;
import com.huawei.ucd.helper.gles.MVPMatrixAider;
import defpackage.qid;
import defpackage.qif;
import defpackage.qil;
import defpackage.qim;
import defpackage.qin;
import defpackage.qio;
import defpackage.qip;

/* JADX INFO: loaded from: classes43.dex */
public class Medal3D extends Object3D {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private float f23229a;
    private int aa;
    private int[] ab;
    private int ac;
    private float ad;
    private int ae;
    private int af;
    private float ag;
    private int ah;
    private int ai;
    private float al;
    private float am;
    private Runnable an;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private float f23230b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected MVPMatrixAider f23231c;
    boolean d;
    float e;
    private qip f;
    private float g;
    private float h;
    private float i;
    private float j;
    private boolean k;
    private Handler l;
    private int m;
    private qil n;
    private int o;
    private float p;
    private qil q;
    private qip r;
    private float s;
    private qip t;
    private int u;
    private float v;
    private qip w;
    private float x;
    private qip y;
    private int z;

    public Medal3D(Context context) {
        super(context);
        this.ai = -1;
        this.ah = -1;
        this.z = -1;
        this.aa = -1;
        this.af = -1;
        this.w = new qip(0.0f);
        this.x = 0.0f;
        this.p = 0.0f;
        this.v = 0.0f;
        this.y = new qip(0.0f, 0.0f, -80.0f);
        this.ab = new int[4];
        this.f23231c = new MVPMatrixAider();
        this.ae = -1;
        this.ac = -1;
        this.u = -1;
        this.o = -1;
        this.m = -1;
        this.ad = 0.5f;
        this.f23230b = 0.0f;
        this.j = 0.0f;
        this.f23229a = 0.0f;
        this.h = 4.0f;
        this.am = 0.02f;
        this.al = 1.0f;
        this.an = new Runnable() { // from class: com.huawei.ucd.medal.Medal3D.6
            @Override // java.lang.Runnable
            public void run() {
                int i = (((int) Medal3D.this.ag) / 360) * 360;
                int i2 = ((int) Medal3D.this.ag) % 360;
                if (i2 >= 0 && i2 <= 90) {
                    Medal3D medal3D = Medal3D.this;
                    medal3D.g = (i - medal3D.ag) * Medal3D.this.al;
                } else if (i2 > 90 && i2 < 270) {
                    Medal3D medal3D2 = Medal3D.this;
                    medal3D2.g = ((i + 180) - medal3D2.ag) * Medal3D.this.al;
                } else if (i2 >= 270 && i2 <= 360) {
                    Medal3D medal3D3 = Medal3D.this;
                    medal3D3.g = ((i + 360) - medal3D3.ag) * Medal3D.this.al;
                } else if (i2 >= -90 && i2 < 0) {
                    Medal3D medal3D4 = Medal3D.this;
                    medal3D4.g = (i - medal3D4.ag) * Medal3D.this.al;
                } else if (i2 < -90 && i2 > -270) {
                    Medal3D medal3D5 = Medal3D.this;
                    medal3D5.g = ((i + AMapEngineUtils.MIN_LONGITUDE_DEGREE) - medal3D5.ag) * Medal3D.this.al;
                } else if (i2 <= -270 && i2 >= -360) {
                    Medal3D medal3D6 = Medal3D.this;
                    medal3D6.g = ((i - 360) - medal3D6.ag) * Medal3D.this.al;
                }
                Medal3D medal3D7 = Medal3D.this;
                medal3D7.i = medal3D7.h * Medal3D.this.f23229a;
                Medal3D medal3D8 = Medal3D.this;
                medal3D8.f23230b = (medal3D8.g - Medal3D.this.i) / Medal3D.this.ad;
                Medal3D medal3D9 = Medal3D.this;
                medal3D9.j = medal3D9.f23229a + (Medal3D.this.f23230b * Medal3D.this.am);
                float f = Medal3D.this.am / 2.0f;
                float f2 = Medal3D.this.f23229a;
                float f3 = Medal3D.this.j;
                Medal3D.this.ag += f * (f2 + f3);
                if (Math.abs(Medal3D.this.ag) < 0.01f || Math.abs(Medal3D.this.f23230b) < 0.01f) {
                    return;
                }
                Medal3D medal3D10 = Medal3D.this;
                medal3D10.c(medal3D10.ag);
                Medal3D.this.requestRender();
                Medal3D medal3D11 = Medal3D.this;
                medal3D11.f23229a = medal3D11.j;
                Medal3D.this.l.postDelayed(Medal3D.this.an, 16L);
            }
        };
        this.k = false;
        this.mDefaultTextureOptions = new qio.c().d(9729).e();
        this.l = new Handler();
    }

    @Override // com.huawei.ucd.gles.engine.Object3D, com.huawei.ucd.gles.engine.Actor, com.huawei.ucd.helper.gles.IGLActor
    public void onSurfaceCreated() {
        super.onSurfaceCreated();
        runOnceBeforeDraw(new Runnable() { // from class: com.huawei.ucd.medal.Medal3D.1
            @Override // java.lang.Runnable
            public void run() {
                GLES20.glClearColor(0.0f, 0.0f, 0.0f, 0.0f);
                GLES20.glEnable(2929);
                GLES20.glEnable(2884);
                GLES20.glCullFace(1029);
                GLES20.glEnable(3042);
                GLES20.glBlendFunc(770, 771);
            }
        });
    }

    @Override // com.huawei.ucd.gles.engine.Object3D, com.huawei.ucd.gles.engine.Actor, com.huawei.ucd.helper.gles.IGLActor
    public void onSurfaceChanged(int i, int i2) {
        super.onSurfaceChanged(i, i2);
        this.ab = new int[]{0, 0, i, i2};
        qip qipVar = new qip(0.0f, 0.0f, 0.0f);
        this.f = qipVar;
        setCamera(qipVar.f46280a, this.f.f46281b, this.f.f46282c, 0.0f, 0.0f, -1.0f, 0.0f, 1.0f, 0.0f);
        this.f23231c.e(-0.5f, 0.5f, -0.5f, 0.5f, 1.0f, 100.0f);
        this.f23231c.d(0.0f, 30.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -1.0f);
    }

    @Override // com.huawei.ucd.gles.engine.Object3D, com.huawei.ucd.gles.engine.Actor, com.huawei.ucd.helper.gles.IGLActor
    public void onDrawFrame() {
        if (this.d) {
            float f = this.x;
            float f2 = this.e;
            this.x = f + f2;
            if (f2 > 360.0f) {
                this.e = f2 - 360.0f;
            } else if (f2 < -360.0f) {
                this.e = f2 + 360.0f;
            }
        }
        this.mMatrixAider.h();
        translate(this.y);
        scale(this.w);
        rotate(this.x, 0.0f, 1.0f, 0.0f);
        rotate(this.p, 1.0f, 0.0f, 0.0f);
        rotate(this.v, 0.0f, 0.0f, 1.0f);
        this.f23231c.d(0.0f, 0.0f, -800.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f);
        super.onDrawFrame();
        this.mMatrixAider.g();
        GLES20.glUniformMatrix4fv(this.ae, 1, false, this.f23231c.f(), 0);
        if (this.o != -1) {
            float f3 = this.x % 360.0f;
            GLES20.glUniform1f(this.o, Math.abs(f3) > 90.0f && Math.abs(f3) < 270.0f ? 1.0f : 0.0f);
        }
    }

    @Override // com.huawei.ucd.gles.engine.Object3D, com.huawei.ucd.gles.engine.Actor
    public void onShaderLocationInit() {
        qid.e("Medal3D", qid.a());
        super.onShaderLocationInit();
        this.ai = getMaterialHandler("uLightLocation");
        this.ah = getMaterialHandler("uLight2Location");
        this.z = getMaterialHandler("uCamera");
        this.aa = getMaterialHandler("uLight1Intensity");
        this.af = getMaterialHandler("uLight2Intensity");
        this.ae = getMaterialHandler("uMVPMatrixGY");
        this.ac = getMaterialHandler("sLightImg");
        this.o = getMaterialHandler("isBg");
        this.m = getMaterialHandler("vContent");
    }

    @Override // com.huawei.ucd.gles.engine.Object3D
    public void k() {
        qil qilVar;
        qip qipVar;
        qil qilVar2;
        qip qipVar2;
        float f = this.y.f46280a;
        float f2 = this.y.f46281b;
        int i = this.z;
        if (i != -1) {
            GLES20.glUniform3f(i, this.f.f46280a + f, this.f.f46281b + f2, this.f.f46282c);
        }
        int i2 = this.ai;
        if (i2 != -1 && (qipVar2 = this.t) != null) {
            GLES20.glUniform3f(i2, qipVar2.f46280a + f, this.t.f46281b + f2, this.t.f46282c);
        }
        int i3 = this.aa;
        if (i3 != -1 && (qilVar2 = this.n) != null) {
            GLES20.glUniform4f(i3, qilVar2.d, this.n.f46272c, this.n.f46271b, this.n.e);
        }
        int i4 = this.ah;
        if (i4 != -1 && (qipVar = this.r) != null) {
            GLES20.glUniform3f(i4, qipVar.f46280a + f, this.r.f46281b + f2, this.r.f46282c);
        }
        int i5 = this.af;
        if (i5 != -1 && (qilVar = this.q) != null) {
            GLES20.glUniform4f(i5, qilVar.d, this.q.f46272c, this.q.f46271b, this.q.e);
        }
        if (this.u != -1) {
            GLES20.glUniform1f(this.m, 1.0f);
            GLES20.glActiveTexture(33986);
            GLES20.glBindTexture(3553, this.u);
            GLES20.glUniform1i(this.ac, 2);
            Log.d("Medal3D", "onDrawArraysPre:mTextureLight != -1");
            return;
        }
        GLES20.glUniform1f(this.m, 0.0f);
    }

    public void c(float f) {
        this.x = f;
    }

    public void a(float f) {
        this.p = f;
    }

    public void d(float f) {
        this.v = f;
    }

    public void b(float f, float f2, float f3) {
        this.y.f46280a = f;
        this.y.f46281b = f2;
        this.y.f46282c = f3;
    }

    public void c(float f, float f2, float f3) {
        this.w.f46280a = f;
        this.w.f46281b = f2;
        this.w.f46282c = f3;
    }

    public void c(final float f, final float f2, final float f3, final float f4) {
        runOnceBeforeDraw(new Runnable() { // from class: com.huawei.ucd.medal.Medal3D.3
            @Override // java.lang.Runnable
            public void run() {
                Medal3D.this.q = new qil(f, f2, f3, f4);
            }
        });
        requestRender();
    }

    public void a(final float f, final float f2, final float f3, final float f4) {
        runOnceBeforeDraw(new Runnable() { // from class: com.huawei.ucd.medal.Medal3D.5
            @Override // java.lang.Runnable
            public void run() {
                Medal3D.this.n = new qil(f, f2, f3, f4);
            }
        });
        requestRender();
    }

    public void d(final float f, final float f2, final float f3) {
        runOnceBeforeDraw(new Runnable() { // from class: com.huawei.ucd.medal.Medal3D.2
            @Override // java.lang.Runnable
            public void run() {
                Medal3D.this.r = new qip(f, f2, f3);
            }
        });
        requestRender();
    }

    public void e(final float f, final float f2, final float f3) {
        runOnceBeforeDraw(new Runnable() { // from class: com.huawei.ucd.medal.Medal3D.4
            @Override // java.lang.Runnable
            public void run() {
                Medal3D.this.t = new qip(f, f2, f3);
            }
        });
        requestRender();
    }

    @Override // com.huawei.ucd.gles.engine.Object3D
    public int b() {
        return getMaterialHandler("uMMatrix");
    }

    @Override // com.huawei.ucd.gles.engine.Object3D
    public int i() {
        return getMaterialHandler("sTexture");
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0038  */
    public void d(MotionEvent motionEvent) {
        float x = motionEvent.getX();
        int action = motionEvent.getAction();
        if (action == 0) {
            l();
        } else if (action == 1) {
            o();
        } else if (action == 2) {
            float f = this.x + ((x - this.s) * 0.25f);
            this.x = f;
            if (f >= 360.0f) {
                this.x = f - 360.0f;
            }
            float f2 = this.x;
            if (f2 <= -360.0f) {
                this.x = f2 + 360.0f;
            }
            requestRender();
        } else if (action == 3) {
            o();
        }
        this.s = x;
    }

    private void n() {
        this.f23230b = 0.0f;
        this.j = 0.0f;
        this.f23229a = 0.0f;
        this.ag = this.x;
        this.h = 1.2f;
        this.al = 4.0f;
    }

    public void m() {
        this.l.post(this.an);
    }

    public void l() {
        this.k = false;
        this.l.removeCallbacks(this.an);
    }

    private void o() {
        if (this.k) {
            return;
        }
        n();
        m();
    }

    public qim d(float f, float f2) {
        float[] fArr = new float[4];
        GLU.gluUnProject(f, this.ab[3] - f2, 1.0f, getViewMatrix(), 0, getProjectMatrix(), 0, this.ab, 0, fArr, 0);
        float f3 = fArr[3];
        if (f3 == 0.0f) {
            qid.e("Medal3D", qid.a() + "mWinPosToGlPos[3] == 0.0f");
            return null;
        }
        float f4 = fArr[0] / f3;
        fArr[0] = f4;
        float f5 = fArr[1] / f3;
        fArr[1] = f5;
        return new qim(f4 * 0.08f, f5 * 0.08f);
    }

    @Override // com.huawei.ucd.gles.engine.Object3D, com.huawei.ucd.gles.engine.Actor
    public void onDestroy() {
        this.f = null;
        this.t = null;
        this.r = null;
        this.n = null;
        this.q = null;
        this.w = null;
        this.y = null;
        this.ab = null;
        l();
        super.onDestroy();
    }

    public void b(float f) {
        this.k = true;
        n();
        this.f23229a = f / 10.0f;
        m();
    }

    public void b(MedalBackContent medalBackContent) {
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        int width = medalBackContent.f23246c.getWidth();
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(width, medalBackContent.f23246c.getHeight(), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        canvas.drawBitmap(medalBackContent.f23246c, 0.0f, 0.0f, new Paint());
        paint.setColor(medalBackContent.j);
        String str = medalBackContent.f23245b[0];
        float f = 46;
        paint.setTextSize(f);
        float f2 = width;
        canvas.drawText(str, ((f2 - qif.e(str, f)) / 2.0f) + medalBackContent.f23244a.d, medalBackContent.f23244a.f46273c, paint);
        String str2 = medalBackContent.f23245b[1];
        float f3 = 32;
        paint.setTextSize(f3);
        canvas.drawText(str2, ((f2 - qif.e(str2, f3)) / 2.0f) + medalBackContent.i.d, medalBackContent.i.f46273c + f, paint);
        qid.e("Medal3D", qid.a());
        a(bitmapCreateBitmap);
    }

    public void a(MedalBackContent medalBackContent, Bitmap bitmap) {
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        int width = medalBackContent.f23246c.getWidth();
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(width, medalBackContent.f23246c.getHeight(), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        canvas.drawBitmap(medalBackContent.f23246c, 0.0f, 0.0f, new Paint());
        if (bitmap == null) {
            paint.setColor(medalBackContent.j);
            String str = medalBackContent.f23245b[0];
            float f = 46;
            paint.setTextSize(f);
            float f2 = width;
            canvas.drawText(str, ((f2 - qif.e(str, f)) / 2.0f) + medalBackContent.f23244a.d, medalBackContent.f23244a.f46273c, paint);
            String str2 = medalBackContent.f23245b[1];
            float f3 = 32;
            paint.setTextSize(f3);
            canvas.drawText(str2, ((f2 - qif.e(str2, f3)) / 2.0f) + medalBackContent.i.d, medalBackContent.i.f46273c + f, paint);
        }
        qid.e("Medal3D", qid.a());
        a(bitmapCreateBitmap);
    }

    public void a(final Bitmap bitmap) {
        runOnceBeforeDraw(new Runnable() { // from class: com.huawei.ucd.medal.Medal3D.8
            @Override // java.lang.Runnable
            public void run() {
                if (Medal3D.this.u == -1) {
                    Medal3D.this.u = qin.b(bitmap, qio.d(), true);
                }
            }
        });
    }

    public void e(float f) {
        this.e = f;
    }

    public void b(boolean z) {
        this.d = z;
    }
}
