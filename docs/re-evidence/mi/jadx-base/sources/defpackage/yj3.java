package defpackage;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Bitmap;
import android.hardware.Camera;
import android.view.MotionEvent;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.amap.api.maps.utils.SpatialRelationUtil;
import com.google.zxing.BarcodeFormat;
import com.google.zxing.DecodeHintType;
import com.xiaomi.fitness.widget.view.ViewfinderView;
import java.io.IOException;
import java.util.Collection;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
public class yj3 implements SurfaceHolder.Callback {
    public float A;
    public int B;
    public int C;
    public float D;
    public float E;
    public r7h F;
    public boolean G;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Activity f40230a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public sj3 f40231b;
    public s7h c;
    public eh3 d;
    public f7d e;
    public ai2 f;
    public b71 g;
    public SurfaceView h;
    public ViewfinderView i;
    public SurfaceHolder j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public View f40232k;
    public Collection<BarcodeFormat> l;
    public Map<DecodeHintType, Object> m;
    public String n;
    public boolean o;
    public boolean p;
    public float q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f40233r;
    public boolean s;
    public boolean t;
    public boolean u;
    public boolean v;
    public boolean w;
    public boolean x;
    public boolean y;
    public boolean z;

    public yj3(Fragment fragment, SurfaceView surfaceView, ViewfinderView viewfinderView, View view) {
        this(fragment.getActivity(), surfaceView, viewfinderView, view);
    }

    public final float f(MotionEvent motionEvent) {
        float x = motionEvent.getX(0) - motionEvent.getX(1);
        float y = motionEvent.getY(0) - motionEvent.getY(1);
        return (float) Math.sqrt((x * x) + (y * y));
    }

    public eh3 g() {
        return this.d;
    }

    public final void h(boolean z, Camera camera) {
        Camera.Parameters parameters = camera.getParameters();
        if (!parameters.isZoomSupported()) {
            ipe.f("zoom not supported");
            return;
        }
        int maxZoom = parameters.getMaxZoom();
        int zoom = parameters.getZoom();
        if (z && zoom < maxZoom) {
            zoom++;
        } else if (zoom > 0) {
            zoom--;
        }
        parameters.setZoom(zoom);
        camera.setParameters(parameters);
    }

    public final void i(SurfaceHolder surfaceHolder) {
        if (surfaceHolder == null) {
            throw new IllegalStateException("No SurfaceHolder provided");
        }
        if (this.d.h()) {
            ipe.h("initCamera() while already open -- late SurfaceView callback?");
            return;
        }
        try {
            this.d.i(surfaceHolder);
            if (this.f40231b == null) {
                sj3 sj3Var = new sj3(this.f40230a, this.i, this.c, this.l, this.m, this.n, this.d);
                this.f40231b = sj3Var;
                sj3Var.k(this.x);
                this.f40231b.h(this.y);
                this.f40231b.i(this.f40233r);
                this.f40231b.j(this.s);
            }
        } catch (IOException e) {
            ipe.j(e);
        } catch (RuntimeException e2) {
            ipe.i("Unexpected error initializing camera", e2);
        }
    }

    public final void j() {
        eh3 eh3Var = new eh3(this.f40230a);
        this.d = eh3Var;
        eh3Var.o(this.z);
        this.d.m(this.A);
        this.d.n(this.B);
        this.d.l(this.C);
        View view = this.f40232k;
        if (view == null || !this.G) {
            return;
        }
        view.setOnClickListener(new View.OnClickListener() { // from class: vj3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f36943a.k(view2);
            }
        });
        this.d.setOnSensorListener(new eh3.a() { // from class: wj3
            @Override // eh3.a
            public final void a(boolean z, boolean z2, float f) {
                this.f38022a.l(z, z2, f);
            }
        });
        this.d.setOnTorchListener(new eh3.b() { // from class: xj3
            @Override // eh3.b
            public final void a(boolean z) {
                this.f39175a.m(z);
            }
        });
    }

    public final /* synthetic */ void k(View view) {
        eh3 eh3Var = this.d;
        if (eh3Var != null) {
            eh3Var.q(!this.f40232k.isSelected());
        }
    }

    public final /* synthetic */ void l(boolean z, boolean z2, float f) {
        if (z2) {
            if (this.f40232k.getVisibility() != 0) {
                this.f40232k.setVisibility(0);
            }
        } else {
            if (z || this.f40232k.getVisibility() != 0) {
                return;
            }
            this.f40232k.setVisibility(4);
        }
    }

    public final /* synthetic */ void m(boolean z) {
        this.f40232k.setSelected(z);
    }

    public final /* synthetic */ void n(wsk wskVar, Bitmap bitmap, float f) {
        this.e.c();
        this.f.b();
        t(wskVar, bitmap, f);
    }

    public final /* synthetic */ void o(String str) {
        r7h r7hVar = this.F;
        if (r7hVar == null || !r7hVar.onResultCallback(str)) {
            Intent intent = new Intent();
            intent.putExtra("scan_result", str);
            this.f40230a.setResult(-1, intent);
            this.f40230a.finish();
        }
    }

    public void p() {
        this.j = this.h.getHolder();
        this.o = false;
        this.e = new f7d(this.f40230a);
        this.f = new ai2(this.f40230a);
        this.g = new b71(this.f40230a);
        this.G = this.f40230a.getPackageManager().hasSystemFeature("android.hardware.camera.flash");
        j();
        this.c = new s7h() { // from class: tj3
            @Override // defpackage.s7h
            public final void a(wsk wskVar, Bitmap bitmap, float f) {
                this.f34756a.n(wskVar, bitmap, f);
            }
        };
        this.f.c(this.v);
        this.f.d(this.w);
        this.g.b(this.D);
        this.g.a(this.E);
    }

    public void q() {
        this.e.f();
    }

    public void r() {
        sj3 sj3Var = this.f40231b;
        if (sj3Var != null) {
            sj3Var.f();
            this.f40231b = null;
        }
        this.e.d();
        this.g.d();
        this.f.close();
        this.d.b();
        if (!this.o) {
            this.j.removeCallback(this);
        }
        View view = this.f40232k;
        if (view == null || view.getVisibility() != 0) {
            return;
        }
        this.f40232k.setSelected(false);
        this.f40232k.setVisibility(4);
    }

    public void s(wsk wskVar) {
        sj3 sj3Var;
        final String strF = wskVar.f();
        if (this.t) {
            r7h r7hVar = this.F;
            if (r7hVar != null) {
                r7hVar.onResultCallback(strF);
            }
            if (this.u) {
                w();
                return;
            }
            return;
        }
        if (this.v && (sj3Var = this.f40231b) != null) {
            sj3Var.postDelayed(new Runnable() { // from class: uj3
                @Override // java.lang.Runnable
                public final void run() {
                    this.f35809a.o(strF);
                }
            }, 100L);
            return;
        }
        r7h r7hVar2 = this.F;
        if (r7hVar2 == null || !r7hVar2.onResultCallback(strF)) {
            Intent intent = new Intent();
            intent.putExtra("scan_result", strF);
            this.f40230a.setResult(-1, intent);
            this.f40230a.finish();
        }
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceCreated(SurfaceHolder surfaceHolder) {
        if (surfaceHolder == null) {
            ipe.h("*** WARNING *** surfaceCreated() gave us a null surface!");
        }
        if (this.o) {
            return;
        }
        this.o = true;
        i(surfaceHolder);
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        this.o = false;
    }

    public void t(wsk wskVar, Bitmap bitmap, float f) {
        s(wskVar);
    }

    public void u() {
        this.f.m();
        this.e.e();
        if (this.o) {
            i(this.j);
        } else {
            this.j.addCallback(this);
        }
        this.g.c(this.d);
    }

    public boolean v(MotionEvent motionEvent) {
        Camera cameraA;
        if (!this.p || !this.d.h() || (cameraA = this.d.f().a()) == null || motionEvent.getPointerCount() <= 1) {
            return false;
        }
        int action = motionEvent.getAction() & 255;
        if (action == 2) {
            float f = f(motionEvent);
            float f2 = this.q;
            if (f > f2 + 6.0f) {
                h(true, cameraA);
            } else if (f < f2 - 6.0f) {
                h(false, cameraA);
            }
            this.q = f;
        } else if (action == 5) {
            this.q = f(motionEvent);
        }
        return true;
    }

    public void w() {
        sj3 sj3Var = this.f40231b;
        if (sj3Var != null) {
            sj3Var.g();
        }
    }

    /* JADX WARN: Code duplicated, block: B:9:0x0020  */
    public void x(int i) {
        int i2;
        ipe.a("rotation:" + i);
        if (i == 0) {
            i2 = 0;
        } else if (i == 1) {
            i2 = 90;
        } else if (i == 2) {
            i2 = 180;
        } else if (i != 3) {
            i2 = 0;
        } else {
            i2 = 270;
        }
        Camera.CameraInfo cameraInfo = new Camera.CameraInfo();
        Camera.getCameraInfo(0, cameraInfo);
        int i3 = cameraInfo.facing == 1 ? (360 - ((cameraInfo.orientation + i2) % SpatialRelationUtil.A_CIRCLE_DEGREE)) % SpatialRelationUtil.A_CIRCLE_DEGREE : ((cameraInfo.orientation - i2) + SpatialRelationUtil.A_CIRCLE_DEGREE) % SpatialRelationUtil.A_CIRCLE_DEGREE;
        ipe.a("result:" + i3);
        Camera cameraA = this.d.f().a();
        if (cameraA != null) {
            cameraA.setDisplayOrientation(i3);
        } else {
            ipe.h("setDisplayOrientation but camera is null");
        }
    }

    public yj3 y(r7h r7hVar) {
        this.F = r7hVar;
        return this;
    }

    public yj3(Activity activity, SurfaceView surfaceView, ViewfinderView viewfinderView, View view) {
        this.p = true;
        this.f40233r = true;
        this.s = false;
        this.t = false;
        this.u = true;
        this.A = 0.9f;
        this.D = 45.0f;
        this.E = 100.0f;
        this.f40230a = activity;
        this.h = surfaceView;
        this.i = viewfinderView;
        this.f40232k = view;
    }
}
