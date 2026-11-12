package com.huawei.hms.scankit;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.SurfaceTexture;
import android.os.Build;
import android.os.Bundle;
import android.os.Process;
import android.os.RemoteException;
import android.util.Log;
import android.view.MotionEvent;
import android.view.TextureView;
import com.huawei.hms.feature.dynamic.IObjectWrapper;
import com.huawei.hms.feature.dynamic.ObjectWrapper;
import com.huawei.hms.hmsscankit.api.IOnErrorCallback;
import com.huawei.hms.hmsscankit.api.IOnResultCallback;
import com.huawei.hms.ml.scan.HmsScan;
import com.huawei.hms.scankit.p.e0;
import com.huawei.hms.scankit.p.e5;
import com.huawei.hms.scankit.p.f5;
import com.huawei.hms.scankit.p.j0;
import com.huawei.hms.scankit.p.k0;
import com.huawei.hms.scankit.p.m0;
import com.huawei.hms.scankit.p.o4;
import com.huawei.hms.scankit.p.v3;
import com.huawei.hms.scankit.p.w3;
import com.huawei.hms.scankit.p.w7;
import com.tencent.open.apireq.BaseResp;
import java.math.BigDecimal;
import java.util.Collection;
import java.util.Collections;
import java.util.Map;

/* JADX INFO: loaded from: classes34.dex */
public class b {
    public static final String H = "b";
    public static volatile v3 I;
    public static volatile w3 J;
    private IOnErrorCallback D;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Rect f15916a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f15917b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f15918c;
    private Context d;
    private com.huawei.hms.scankit.a e;
    private f5 f;
    private j0 g;
    private ViewfinderView h;
    public TextureView i;
    private TextureView.SurfaceTextureListener j;
    private Collection k;
    private Map l;
    private String m;
    private String o;
    private float q;
    private boolean u;
    private boolean v;
    private boolean w;
    private IObjectWrapper x;
    private e5 y;
    private IOnResultCallback z;
    private boolean p = true;
    private boolean r = true;
    private boolean s = false;
    private boolean t = true;
    private boolean A = false;
    private boolean B = false;
    private boolean E = true;
    private boolean F = false;
    private boolean G = false;
    private boolean n = false;
    private boolean C = false;

    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            b.this.g.m();
        }
    }

    /* JADX INFO: renamed from: com.huawei.hms.scankit.b$b, reason: collision with other inner class name */
    class C0171b implements j0.c {
        C0171b() {
        }

        @Override // com.huawei.hms.scankit.p.j0.c
        public void a() {
        }

        @Override // com.huawei.hms.scankit.p.j0.c
        public void b() {
            if (b.this.D != null) {
                try {
                    b.this.D.onError(-1000);
                } catch (RemoteException unused) {
                    o4.b(b.H, "RemoteException");
                }
            }
        }

        @Override // com.huawei.hms.scankit.p.j0.c
        public void c() {
        }
    }

    class c implements TextureView.SurfaceTextureListener {
        c() {
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
            b.this.B = false;
            if (surfaceTexture == null) {
                o4.b(b.H, "*** WARNING *** surfaceCreated() gave us a null surface!");
            }
            if (b.this.n) {
                return;
            }
            b.this.n = true;
            if (b.this.d.checkPermission("android.permission.CAMERA", Process.myPid(), Process.myUid()) == 0) {
                b bVar = b.this;
                bVar.a(bVar.i);
            } else {
                if (b.this.G || !(b.this.d instanceof Activity)) {
                    return;
                }
                b.this.B = true;
                ((Activity) b.this.d).requestPermissions(new String[]{"android.permission.CAMERA"}, 1);
            }
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
            b.this.n = false;
            return true;
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        }
    }

    class d implements f5 {
        d() {
        }

        @Override // com.huawei.hms.scankit.p.f5
        public void a(HmsScan[] hmsScanArr, Bitmap bitmap, float f) {
            b.this.a(hmsScanArr, bitmap);
        }
    }

    public b(Context context, TextureView textureView, ViewfinderView viewfinderView, Rect rect, int i, IObjectWrapper iObjectWrapper, boolean z, String str, boolean z2) {
        this.d = context;
        this.h = viewfinderView;
        this.x = iObjectWrapper;
        this.i = textureView;
        this.f15916a = rect;
        this.f15917b = i;
        this.f15918c = z;
        this.o = str;
        this.v = z2;
    }

    private void j() {
        com.huawei.hms.scankit.a aVar = this.e;
        if (aVar != null) {
            aVar.e();
            this.e = null;
        }
        this.g.l();
    }

    public void f() {
        TextureView textureView;
        TextureView textureView2;
        this.C = false;
        try {
            I = new v3((Bundle) ObjectWrapper.unwrap(this.x), this.o);
            I.h();
        } catch (RuntimeException unused) {
            o4.b(H, "RuntimeException");
        } catch (Exception unused2) {
            o4.b(H, "Exception");
        }
        if (!this.A && !this.n && (textureView2 = this.i) != null) {
            textureView2.setSurfaceTextureListener(this.j);
            if (this.n) {
                a(this.i);
            } else {
                this.i.setSurfaceTextureListener(this.j);
            }
        }
        if (this.B && this.d.checkPermission("android.permission.CAMERA", Process.myPid(), Process.myUid()) == 0 && (textureView = this.i) != null) {
            this.B = false;
            a(textureView);
        }
    }

    public void g() {
        this.C = false;
        TextureView textureView = this.i;
        if (textureView != null) {
            textureView.setSurfaceTextureListener(this.j);
            this.A = true;
            if (this.n) {
                a(this.i);
            } else {
                this.i.setSurfaceTextureListener(this.j);
            }
        }
    }

    public void h() {
        this.C = true;
        if (I != null) {
            I.i();
        }
        I = null;
        if (this.A) {
            j();
        }
    }

    public void i() {
        try {
            j0 j0Var = this.g;
            if (j0Var != null) {
                j0Var.d(1);
            }
        } catch (RuntimeException unused) {
            o4.b(H, "RuntimeException in reset zoomValue");
        } catch (Exception unused2) {
            o4.b(H, "Exception in reset zoomValue");
        }
    }

    public void c() {
        this.C = false;
        try {
            J = new w3((Bundle) ObjectWrapper.unwrap(this.x), this.o);
            J.a("single");
        } catch (RuntimeException unused) {
            o4.b(H, "RuntimeException");
        } catch (Exception unused2) {
            o4.b(H, "Exception");
        }
        if (this.d.getPackageManager() != null && !this.d.getPackageManager().hasSystemFeature("android.hardware.camera")) {
            Log.e("scankit", "has no camera");
            return;
        }
        e0 e0VarA = a(this.d);
        Log.i(H, "onCreate: CameraManageOncreate");
        this.g = new j0(this.d, e0VarA);
        new Thread(new a()).start();
        this.g.a(new C0171b());
        this.j = new c();
        this.f = new d();
    }

    public void d() {
        this.C = true;
        this.i.setSurfaceTextureListener(null);
        this.g.k();
        J.l.b();
        J = null;
    }

    public void e() {
        this.C = true;
        if (this.A) {
            return;
        }
        j();
    }

    public boolean b(MotionEvent motionEvent) {
        j0 j0Var = this.g;
        if (j0Var == null || !this.p || j0Var.f().b() < j0.b.CAMERA_OPENED.b() || motionEvent.getPointerCount() <= 1) {
            return false;
        }
        int action = motionEvent.getAction() & 255;
        if (action == 2) {
            float fA = a(motionEvent);
            float f = this.q;
            if (fA > f + 6.0f) {
                a(true, this.g);
            } else if (fA < f - 6.0f) {
                a(false, this.g);
            } else {
                o4.d("CaptureHelper", "MotionEvent.ACTION_MOVE no handleZoom");
            }
            this.q = fA;
        } else if (action == 5) {
            this.q = a(motionEvent);
        }
        return true;
    }

    public void b(boolean z) {
        this.E = z;
    }

    public boolean b() {
        return this.F;
    }

    public void c(boolean z) {
        this.G = z;
    }

    public j0 a() {
        return this.g;
    }

    private void a(boolean z, j0 j0Var) {
        try {
            m0 m0VarG = j0Var.g();
            if (j0Var.j()) {
                int iC = m0VarG.c();
                int iB = m0VarG.b();
                if (z && iB < iC) {
                    iB++;
                } else if (iB > 0) {
                    iB--;
                } else {
                    o4.d(H, "handleZoom  zoom not change");
                }
                j0Var.d(iB);
                return;
            }
            o4.d(H, "zoom not supported");
        } catch (RuntimeException unused) {
            Log.e(H, "handleZoom: RuntimeException");
        }
    }

    private e0 a(Context context) {
        e0 e0VarA;
        Activity activity = (Activity) context;
        int rotation = activity.getWindowManager().getDefaultDisplay().getRotation();
        Log.i(H, "initCameraConfig:falserotation" + rotation);
        if (rotation == 0) {
            e0VarA = new e0.b().a(new Point(1920, 1080)).a(1).b(90).b(false).a(true).a();
        } else if (rotation == 1) {
            e0VarA = new e0.b().a(new Point(1920, 1080)).a(1).b(0).b(false).a(true).a();
        } else if (rotation == 2) {
            e0VarA = new e0.b().a(new Point(1920, 1080)).a(1).b(270).b(false).a(true).a();
        } else if (rotation != 3) {
            e0VarA = new e0.b().a(new Point(1920, 1080)).a(1).b(90).b(false).a(true).a();
        } else {
            e0VarA = new e0.b().a(new Point(1920, 1080)).a(1).b(180).b(false).a(true).a();
        }
        if (w7.f(context) || w7.b(activity) || w7.e(context)) {
            e0VarA.a(new Point(1080, 1080));
            this.F = true;
        }
        if ("ceres-c3".equals(Build.DEVICE)) {
            e0VarA = new e0.b().a(new Point(1080, 1920)).a(1).b(false).a(true).a();
        }
        boolean zB = w7.b();
        boolean zE = w7.e();
        if ((!w7.e(context) || zB) && (!w7.b(activity) || zE)) {
            return e0VarA;
        }
        e0 e0VarA2 = new e0.b().a(new Point(1080, 1080)).a(1).b(90).b(false).a(true).a();
        this.F = true;
        return e0VarA2;
    }

    public b a(e5 e5Var) {
        this.y = e5Var;
        return this;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(TextureView textureView) {
        if (textureView != null && textureView.getSurfaceTexture() != null) {
            try {
                this.g.a(textureView);
                this.g.a(Collections.singletonList(new k0.a(new Rect(-150, -150, 150, 150), 1000)));
                try {
                    this.g.n();
                } catch (Exception unused) {
                    o4.b(H, "initCamera() get exception");
                }
                if (this.e == null) {
                    com.huawei.hms.scankit.a aVar = new com.huawei.hms.scankit.a(this.d, this.h, this.f, this.k, this.l, this.m, this.g, this.f15916a, this.f15917b, this.v, this.E);
                    this.e = aVar;
                    aVar.c(this.u);
                    this.e.a(this.w);
                    this.e.b(this.r);
                    this.e.a(this.y);
                    return;
                }
                return;
            } catch (Exception e) {
                if (I != null) {
                    I.c(BaseResp.CODE_UNSUPPORTED_BRANCH);
                }
                o4.a(H, "initCamera IOException", e);
                return;
            }
        }
        o4.e(H, "initCamera() no surface view");
    }

    private float a(MotionEvent motionEvent) {
        float x = motionEvent.getX(0) - motionEvent.getX(1);
        float y = motionEvent.getY(0) - motionEvent.getY(1);
        double dSqrt = Math.sqrt((x * x) + (y * y));
        if (Double.isInfinite(dSqrt) || Double.isNaN(dSqrt)) {
            return 0.0f;
        }
        return BigDecimal.valueOf(dSqrt).floatValue();
    }

    public void a(HmsScan[] hmsScanArr, Bitmap bitmap) {
        o4.a("scan-time", "decode time:" + System.currentTimeMillis());
        try {
            String str = H;
            o4.d(str, "result onResult");
            if (this.y.a()) {
                o4.d(str, "result intercepted");
                return;
            }
            if (I != null) {
                I.a(hmsScanArr);
            }
            if (!this.f15918c) {
                hmsScanArr = w7.a(hmsScanArr);
            }
            if (this.y != null) {
                if (this.h != null && hmsScanArr.length > 0 && hmsScanArr[0] != null) {
                    o4.d(str, "result draw result point");
                    if (this.d instanceof Activity) {
                        this.h.a(hmsScanArr[0].getBorderRect(), w7.c((Activity) this.d), this.g.e());
                    }
                    this.C = false;
                }
                this.y.a(hmsScanArr);
            }
            if (this.z != null) {
                try {
                    o4.d(str, "result callback end: pauseStatus" + this.C);
                    if (this.C) {
                        return;
                    }
                    if (this.w && hmsScanArr != null && hmsScanArr.length > 0 && hmsScanArr[0] != null) {
                        Context context = this.d;
                        if (context instanceof Activity) {
                            hmsScanArr[0].originalBitmap = w7.a(bitmap, ((Activity) context).getWindowManager().getDefaultDisplay().getRotation());
                        }
                    }
                    this.z.onResult(hmsScanArr);
                } catch (RemoteException e) {
                    if (I != null) {
                        I.c(BaseResp.CODE_PERMISSION_NOT_GRANTED);
                    }
                    o4.e("CaptureHelper", "onResult  RemoteException  e:" + e);
                }
            }
        } catch (RuntimeException e2) {
            Log.e(H, "onResult:RuntimeException " + e2);
        } catch (Exception e3) {
            Log.e(H, "onResult:Exception: " + e3);
        }
    }

    public b a(boolean z) {
        this.w = z;
        com.huawei.hms.scankit.a aVar = this.e;
        if (aVar != null) {
            aVar.a(z);
        }
        return this;
    }

    public void a(IOnResultCallback iOnResultCallback) {
        this.z = iOnResultCallback;
    }

    public void a(IOnErrorCallback iOnErrorCallback) {
        this.D = iOnErrorCallback;
    }
}
