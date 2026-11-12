package defpackage;

import android.view.MotionEvent;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.pluginsocialshare.view.stickerview.MultiTouchObject;
import com.huawei.pluginsocialshare.view.stickerview.MultiTouchObjectCanvas;
import com.huawei.pluginsocialshare.view.stickerview.StickerImageView;
import java.lang.reflect.Method;
import java.util.Iterator;

/* JADX INFO: loaded from: classes42.dex */
public class pph<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static Method f45763a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static Method f45764b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static Method f45765c = null;
    private static Method d = null;
    private static Method e = null;
    private static final boolean g;
    private static Method h = null;
    private static Method i = null;
    private static Method j = null;
    private static int n = 6;
    private static int o = 8;
    private MultiTouchObjectCanvas<T> aa;
    private long ab;
    private ppf ac;
    private long ad;
    private float ae;
    private float af;
    private float ag;
    private T ah;
    private float ai;
    private float aj;
    private float ak;
    private float p;
    private boolean q;
    private float r;
    private ppf s;
    private float t;
    private float u;
    private boolean v;
    private float w;
    private final ppm x;
    private float y;
    private int z;
    private static final float[] k = new float[20];
    private static final float[] l = new float[20];
    private static final float[] m = new float[20];
    private static final int[] f = new int[20];

    static {
        boolean z = false;
        try {
            f45765c = MotionEvent.class.getMethod("getPointerCount", new Class[0]);
            d = MotionEvent.class.getMethod("getPointerId", Integer.TYPE);
            i = MotionEvent.class.getMethod("getPressure", Integer.TYPE);
            e = MotionEvent.class.getMethod("getHistoricalX", Integer.TYPE, Integer.TYPE);
            f45763a = MotionEvent.class.getMethod("getHistoricalY", Integer.TYPE, Integer.TYPE);
            f45764b = MotionEvent.class.getMethod("getHistoricalPressure", Integer.TYPE, Integer.TYPE);
            h = MotionEvent.class.getMethod("getX", Integer.TYPE);
            j = MotionEvent.class.getMethod("getY", Integer.TYPE);
            z = true;
        } catch (Exception e2) {
            LogUtil.e("MultiTouchController", "static initializer failed", e2);
        }
        g = z;
        if (z) {
            try {
                n = MotionEvent.class.getField("ACTION_POINTER_UP").getInt(null);
                o = MotionEvent.class.getField("ACTION_POINTER_INDEX_SHIFT").getInt(null);
            } catch (Exception unused) {
            }
        }
    }

    public pph(MultiTouchObjectCanvas<T> multiTouchObjectCanvas, boolean z) {
        this.ah = null;
        this.x = new ppm();
        this.v = false;
        this.z = 0;
        this.q = z;
        this.aa = multiTouchObjectCanvas;
        this.s = new ppf();
        this.ac = new ppf();
    }

    public pph(MultiTouchObjectCanvas<T> multiTouchObjectCanvas) {
        this(multiTouchObjectCanvas, true);
    }

    private void b() {
        this.w = this.s.g();
        this.y = this.s.j();
        this.t = Math.max(21.3f, !this.x.j() ? 0.0f : this.s.a());
        this.u = Math.max(30.0f, !this.x.i() ? 0.0f : this.s.i());
        this.p = Math.max(30.0f, !this.x.i() ? 0.0f : this.s.e());
        this.r = this.x.g() ? this.s.d() : 0.0f;
    }

    public boolean e(StickerImageView stickerImageView, MotionEvent motionEvent) {
        if (!f()) {
            return false;
        }
        try {
            int iIntValue = g ? ((Integer) f45765c.invoke(motionEvent, new Object[0])).intValue() : 1;
            if (e() == 0 && !this.q && iIntValue == 1) {
                return false;
            }
            d(motionEvent, iIntValue);
            Iterator<MultiTouchObject> it = stickerImageView.getImages().iterator();
            while (it.hasNext()) {
                if (it.next().isSelected()) {
                    return true;
                }
            }
            return false;
        } catch (Exception e2) {
            LogUtil.e("MultiTouchController", "onTouchEvent() failed", e2);
            return false;
        }
    }

    private boolean f() {
        return (f45765c == null || d == null || f45763a == null || f45764b == null) ? false : true;
    }

    private void d(MotionEvent motionEvent, int i2) {
        int action = motionEvent.getAction();
        int historySize = motionEvent.getHistorySize() / i2;
        int i3 = 0;
        while (i3 <= historySize) {
            d(motionEvent, i2, i3 < historySize, i3, action);
            i3++;
        }
    }

    private void d(MotionEvent motionEvent, int i2, boolean z, int i3, int i4) {
        long eventTime;
        Object objInvoke;
        Object objInvoke2;
        Object objInvoke3;
        try {
            boolean z2 = true;
            if (!g || i2 == 1) {
                k[0] = z ? motionEvent.getHistoricalX(i3) : motionEvent.getX();
                l[0] = z ? motionEvent.getHistoricalY(i3) : motionEvent.getY();
                m[0] = z ? motionEvent.getHistoricalPressure(i3) : motionEvent.getPressure();
            } else {
                int iMin = Math.min(i2, 20);
                for (int i5 = 0; i5 < iMin; i5++) {
                    f[i5] = ((Integer) d.invoke(motionEvent, Integer.valueOf(i5))).intValue();
                    float[] fArr = k;
                    if (z) {
                        objInvoke = e.invoke(motionEvent, Integer.valueOf(i5), Integer.valueOf(i3));
                    } else {
                        objInvoke = h.invoke(motionEvent, Integer.valueOf(i5));
                    }
                    fArr[i5] = ((Float) objInvoke).floatValue();
                    float[] fArr2 = l;
                    if (z) {
                        objInvoke2 = f45763a.invoke(motionEvent, Integer.valueOf(i5), Integer.valueOf(i3));
                    } else {
                        objInvoke2 = j.invoke(motionEvent, Integer.valueOf(i5));
                    }
                    fArr2[i5] = ((Float) objInvoke2).floatValue();
                    float[] fArr3 = m;
                    if (z) {
                        objInvoke3 = f45764b.invoke(motionEvent, Integer.valueOf(i5), Integer.valueOf(i3));
                    } else {
                        objInvoke3 = i.invoke(motionEvent, Integer.valueOf(i5));
                    }
                    fArr3[i5] = ((Float) objInvoke3).floatValue();
                }
            }
            float[] fArr4 = k;
            float[] fArr5 = l;
            float[] fArr6 = m;
            int[] iArr = f;
            int i6 = z ? 2 : i4;
            if (!z && (i4 == 1 || (((1 << o) - 1) & i4) == n || i4 == 3)) {
                z2 = false;
            }
            if (z) {
                eventTime = motionEvent.getHistoricalEventTime(i3);
            } else {
                eventTime = motionEvent.getEventTime();
            }
            e(i2, fArr4, fArr5, fArr6, iArr, i6, z2, eventTime);
        } catch (Exception e2) {
            LogUtil.e("MultiTouchController", "onTouchEvent() failed", e2);
        }
    }

    private void e(int i2, float[] fArr, float[] fArr2, float[] fArr3, int[] iArr, int i3, boolean z, long j2) {
        ppf ppfVar = this.ac;
        this.ac = this.s;
        this.s = ppfVar;
        ppfVar.d(i2, fArr, fArr2, fArr3, iArr, i3, z, j2);
        j();
    }

    private void c() {
        T t = this.ah;
        if (t == null) {
            return;
        }
        this.aa.getPositionAndScale(t, this.x);
        float fE = 1.0f / ((this.x.j() && this.x.e() != 0.0f) ? this.x.e() : 1.0f);
        b();
        this.ai = (this.w - this.x.d()) * fE;
        this.ae = (this.y - this.x.f()) * fE;
        this.ag = this.x.e() / this.t;
        this.aj = this.x.c() / this.u;
        this.ak = this.x.a() / this.p;
        this.af = this.x.b() - this.r;
    }

    private void h() {
        float fE;
        if (this.ah == null) {
            return;
        }
        float fE2 = (this.x.j() && this.x.e() != 0.0f) ? this.x.e() : 1.0f;
        b();
        float f2 = this.w;
        float f3 = this.ai;
        float f4 = this.y;
        float f5 = this.ae;
        float fG = this.s.g() - this.ac.g();
        float fJ = this.s.j() - this.ac.j();
        if (e() == 3) {
            if (fG < 0.0f || fJ < 0.0f) {
                fE = this.x.e() - 0.04f;
            } else {
                fE = this.x.e() + 0.04f;
            }
            if (fE < 0.35f) {
                return;
            }
        } else {
            fE = this.ag * this.t;
        }
        float f6 = fE;
        if (this.v || e(Math.abs(fG), Math.abs(fJ), f6)) {
            this.x.c(f2 - (f3 * fE2), f4 - (f5 * fE2), f6, this.aj * this.u, this.ak * this.p, this.af + this.r);
            this.aa.setPositionAndScale(this.ah, this.x, this.s);
            this.v = true;
        }
    }

    private boolean e(float f2, float f3, float f4) {
        if (f2 < 3.0f && f3 < 3.0f && f4 == this.x.e()) {
            this.v = false;
            return false;
        }
        this.v = true;
        return true;
    }

    private void j() {
        int i2 = this.z;
        if (i2 == 0) {
            a();
            return;
        }
        if (i2 == 1) {
            d();
        } else if (i2 == 2) {
            i();
        } else {
            if (i2 != 3) {
                return;
            }
            g();
        }
    }

    private void a() {
        if (this.s.f()) {
            T draggableObjectAtPoint = this.aa.getDraggableObjectAtPoint(this.s);
            this.ah = draggableObjectAtPoint;
            if (draggableObjectAtPoint != null) {
                this.aa.deselectAll();
                ((ppg) this.ah).setSelected(true);
                if (this.aa.pointInObjectGrabArea(this.s, this.ah)) {
                    d(3);
                    this.aa.selectObject(this.ah, this.s);
                    c();
                    long jC = this.s.c();
                    this.ad = jC;
                    this.ab = jC;
                    return;
                }
                d(1);
                this.aa.selectObject(this.ah, this.s);
                c();
                long jC2 = this.s.c();
                this.ad = jC2;
                this.ab = jC2;
                return;
            }
            return;
        }
        this.aa.canvasTouched(this.s);
    }

    private void d() {
        if (!this.s.f()) {
            d(0);
            MultiTouchObjectCanvas<T> multiTouchObjectCanvas = this.aa;
            this.ah = null;
            multiTouchObjectCanvas.selectObject(null, this.s);
            this.v = false;
            return;
        }
        if (!this.s.l()) {
            if (this.s.c() < this.ad) {
                c();
                return;
            } else {
                h();
                return;
            }
        }
        d(2);
        c();
        long jC = this.s.c();
        this.ab = jC;
        this.ad = jC + 20;
    }

    private void g() {
        if (!this.s.f()) {
            d(0);
            MultiTouchObjectCanvas<T> multiTouchObjectCanvas = this.aa;
            this.ah = null;
            multiTouchObjectCanvas.selectObject(null, this.s);
            this.v = false;
            return;
        }
        h();
    }

    private void i() {
        if (!this.s.l() || !this.s.f()) {
            if (!this.s.f()) {
                d(0);
                MultiTouchObjectCanvas<T> multiTouchObjectCanvas = this.aa;
                this.ah = null;
                multiTouchObjectCanvas.selectObject(null, this.s);
                return;
            }
            d(1);
            c();
            long jC = this.s.c();
            this.ab = jC;
            this.ad = jC + 20;
            return;
        }
        if (Math.abs(this.s.g() - this.ac.g()) > 30.0f || Math.abs(this.s.j() - this.ac.j()) > 30.0f || Math.abs(this.s.i() - this.ac.i()) * 0.5f > 40.0f || Math.abs(this.s.e() - this.ac.e()) * 0.5f > 40.0f) {
            c();
            long jC2 = this.s.c();
            this.ab = jC2;
            this.ad = jC2 + 20;
            return;
        }
        if (this.s.c() < this.ad) {
            c();
        } else {
            h();
        }
    }

    public void d(int i2) {
        this.z = i2;
    }

    public int e() {
        return this.z;
    }
}
