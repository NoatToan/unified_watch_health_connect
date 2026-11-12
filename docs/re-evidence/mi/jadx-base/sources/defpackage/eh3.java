package defpackage;

import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.hardware.Camera;
import android.os.Handler;
import android.view.SurfaceHolder;
import androidx.annotation.FloatRange;
import java.io.IOException;

/* JADX INFO: loaded from: classes5.dex */
public final class eh3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f16634a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ag3 f16635b;
    public xah c;
    public ur1 d;
    public Rect e;
    public Rect f;
    public boolean g;
    public boolean h;
    public int i = -1;
    public int j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f16636k;
    public boolean l;
    public float m;
    public int n;
    public int o;
    public final v7i p;
    public b q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public a f16637r;
    public boolean s;

    public interface a {
        void a(boolean z, boolean z2, float f);
    }

    public interface b {
        void a(boolean z);
    }

    public eh3(Context context) {
        this.f16634a = context.getApplicationContext();
        ag3 ag3Var = new ag3(context);
        this.f16635b = ag3Var;
        this.p = new v7i(ag3Var);
    }

    public a0i a(byte[] bArr, int i, int i2) {
        if (e() == null) {
            return null;
        }
        if (this.l) {
            return new a0i(bArr, i, i2, 0, 0, i, i2, false);
        }
        int iMin = (int) (Math.min(i, i2) * this.m);
        return new a0i(bArr, i, i2, ((i - iMin) / 2) + this.o, ((i2 - iMin) / 2) + this.n, iMin, iMin, false);
    }

    public void b() {
        xah xahVar = this.c;
        if (xahVar != null) {
            xahVar.a().release();
            this.c = null;
            this.e = null;
            this.f = null;
        }
        this.s = false;
        b bVar = this.q;
        if (bVar != null) {
            bVar.a(false);
        }
    }

    public Point c() {
        return this.f16635b.b();
    }

    public synchronized Rect d() {
        try {
            if (this.e == null) {
                if (this.c == null) {
                    return null;
                }
                Point pointB = this.f16635b.b();
                if (pointB == null) {
                    return null;
                }
                int i = pointB.x;
                int i2 = pointB.y;
                if (this.l) {
                    this.e = new Rect(0, 0, i, i2);
                } else {
                    int iMin = (int) (Math.min(i, i2) * this.m);
                    int i3 = ((i - iMin) / 2) + this.o;
                    int i4 = ((i2 - iMin) / 2) + this.n;
                    this.e = new Rect(i3, i4, i3 + iMin, iMin + i4);
                }
            }
            return this.e;
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized Rect e() {
        if (this.f == null) {
            Rect rectD = d();
            if (rectD == null) {
                return null;
            }
            Rect rect = new Rect(rectD);
            Point pointB = this.f16635b.b();
            Point pointC = this.f16635b.c();
            if (pointB != null && pointC != null) {
                int i = rect.left;
                int i2 = pointB.y;
                int i3 = pointC.x;
                rect.left = (i * i2) / i3;
                rect.right = (rect.right * i2) / i3;
                int i4 = rect.top;
                int i5 = pointB.x;
                int i6 = pointC.y;
                rect.top = (i4 * i5) / i6;
                rect.bottom = (rect.bottom * i5) / i6;
                this.f = rect;
            }
            return null;
        }
        return this.f;
    }

    public xah f() {
        return this.c;
    }

    public Point g() {
        return this.f16635b.c();
    }

    public synchronized boolean h() {
        return this.c != null;
    }

    public void i(SurfaceHolder surfaceHolder) throws IOException {
        int i;
        xah xahVarA = this.c;
        if (xahVarA == null) {
            xahVarA = yah.a(this.i);
            if (xahVarA == null) {
                throw new IOException("Camera.open() failed to return object from driver");
            }
            this.c = xahVarA;
        }
        if (!this.g) {
            this.g = true;
            this.f16635b.e(xahVarA);
            int i2 = this.j;
            if (i2 > 0 && (i = this.f16636k) > 0) {
                p(i2, i);
                this.j = 0;
                this.f16636k = 0;
            }
        }
        Camera cameraA = xahVarA.a();
        Camera.Parameters parameters = cameraA.getParameters();
        String strFlatten = parameters == null ? null : parameters.flatten();
        try {
            this.f16635b.g(xahVarA, false);
        } catch (RuntimeException unused) {
            ipe.h("Camera rejected parameters. Setting only minimal safe-mode parameters");
            ipe.f("Resetting to saved camera params: " + strFlatten);
            if (strFlatten != null) {
                Camera.Parameters parameters2 = cameraA.getParameters();
                parameters2.unflatten(strFlatten);
                try {
                    cameraA.setParameters(parameters2);
                    this.f16635b.g(xahVarA, true);
                } catch (RuntimeException unused2) {
                    ipe.h("Camera rejected even safe-mode parameters! No configuration");
                }
            }
        }
        cameraA.setPreviewDisplay(surfaceHolder);
    }

    public synchronized void j(Handler handler, int i) {
        xah xahVar = this.c;
        if (xahVar != null && this.h) {
            this.p.a(handler, i);
            xahVar.a().setOneShotPreviewCallback(this.p);
        }
    }

    public void k(boolean z, float f) {
        a aVar = this.f16637r;
        if (aVar != null) {
            aVar.a(this.s, z, f);
        }
    }

    public void l(int i) {
        this.o = i;
    }

    public void m(@FloatRange(from = 0.0d, to = 1.0d) float f) {
        this.m = f;
    }

    public void n(int i) {
        this.n = i;
    }

    public void o(boolean z) {
        this.l = z;
    }

    public synchronized void p(int i, int i2) {
        try {
            if (this.g) {
                Point pointC = this.f16635b.c();
                int i3 = pointC.x;
                if (i > i3) {
                    i = i3;
                }
                int i4 = pointC.y;
                if (i2 > i4) {
                    i2 = i4;
                }
                int i5 = (i3 - i) / 2;
                int i6 = (i4 - i2) / 2;
                this.e = new Rect(i5, i6, i + i5, i2 + i6);
                ipe.a("Calculated manual framing rect: " + this.e);
                this.f = null;
            } else {
                this.j = i;
                this.f16636k = i2;
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized void q(boolean z) {
        try {
            xah xahVar = this.c;
            if (xahVar != null && z != this.f16635b.d(xahVar.a())) {
                ur1 ur1Var = this.d;
                boolean z2 = ur1Var != null;
                if (z2) {
                    ur1Var.d();
                    this.d = null;
                }
                this.s = z;
                this.f16635b.h(xahVar.a(), z);
                if (z2) {
                    ur1 ur1Var2 = new ur1(this.f16634a, xahVar.a());
                    this.d = ur1Var2;
                    ur1Var2.c();
                }
                b bVar = this.q;
                if (bVar != null) {
                    bVar.a(z);
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public void r() {
        xah xahVar = this.c;
        if (xahVar == null || this.h) {
            return;
        }
        xahVar.a().startPreview();
        this.h = true;
        this.d = new ur1(this.f16634a, xahVar.a());
    }

    public void s() {
        ur1 ur1Var = this.d;
        if (ur1Var != null) {
            ur1Var.d();
            this.d = null;
        }
        xah xahVar = this.c;
        if (xahVar == null || !this.h) {
            return;
        }
        xahVar.a().stopPreview();
        this.p.a(null, 0);
        this.h = false;
    }

    public void setOnSensorListener(a aVar) {
        this.f16637r = aVar;
    }

    public void setOnTorchListener(b bVar) {
        this.q = bVar;
    }
}
