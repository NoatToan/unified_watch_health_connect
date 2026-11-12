package j1;

import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.hardware.display.DisplayManager;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.util.Rational;
import android.util.Size;
import android.view.Display;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import android.view.Window;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.camera.core.impl.k0;
import androidx.camera.core.impl.l0;
import androidx.camera.view.internal.compat.quirk.SurfaceViewNotCroppedByParentQuirk;
import androidx.camera.view.internal.compat.quirk.SurfaceViewStretchedQuirk;
import androidx.core.view.s0;
import androidx.lifecycle.y0;
import androidx.room.a0;
import b0.d0;
import b0.g1;
import b0.k1;
import b0.u0;
import b0.v0;
import b0.w0;
import com.google.firebase.messaging.Constants;
import h0.r0;
import java.util.concurrent.atomic.AtomicReference;
import p005kotlin.math.MathKt;

/* JADX INFO: loaded from: classes.dex */
public final class k extends FrameLayout {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final c f96256p = c.PERFORMANCE;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public c f96257a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public l f96258b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final t f96259c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final j f96260d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f96261e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final y0<e> f96262f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final AtomicReference<i> f96263g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public j1.b f96264h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final m f96265i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final k1.a f96266j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public k0 f96267k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public MotionEvent f96268l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final b f96269m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final com.google.android.material.carousel.a f96270n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final a f96271o;

    public class a implements w0.c {
        public a() {
        }

        @Override // b0.w0.c
        public final void a(g1 g1Var) {
            if (!j0.u.b()) {
                a7.b.getMainExecutor(k.this.getContext()).execute(new r0(18, this, g1Var));
                return;
            }
            l0 l0Var = g1Var.f13909e;
            k.this.f96267k = l0Var.c();
            m mVar = k.this.f96265i;
            Rect rectT = l0Var.c().t();
            mVar.getClass();
            mVar.f14068a = new Rational(rectT.width(), rectT.height());
            synchronized (mVar) {
                mVar.f96294c = rectT;
            }
            g1Var.c(a7.b.getMainExecutor(k.this.getContext()), new a73.f(this, 22, l0Var, g1Var));
            k kVar = k.this;
            l lVar = kVar.f96258b;
            c cVar = kVar.f96257a;
            if (!(lVar instanceof w) || k.c(g1Var, cVar)) {
                k kVar2 = k.this;
                boolean zC = k.c(g1Var, kVar2.f96257a);
                k kVar3 = k.this;
                kVar2.f96258b = zC ? new z(kVar3, kVar3.f96260d) : new w(kVar3, kVar3.f96260d);
            }
            k0 k0VarC = l0Var.c();
            k kVar4 = k.this;
            i iVar = new i(k0VarC, kVar4.f96262f, kVar4.f96258b);
            k.this.f96263g.set(iVar);
            l0Var.getCameraState().d(a7.b.getMainExecutor(k.this.getContext()), iVar);
            k.this.f96258b.e(g1Var, new a73.f(this, 23, iVar, l0Var));
            k kVar5 = k.this;
            if (kVar5.indexOfChild(kVar5.f96259c) == -1) {
                k kVar6 = k.this;
                kVar6.addView(kVar6.f96259c);
            }
            k.this.getClass();
        }
    }

    public class b implements DisplayManager.DisplayListener {
        public b() {
        }

        @Override // android.hardware.display.DisplayManager.DisplayListener
        public final void onDisplayAdded(int i14) {
        }

        @Override // android.hardware.display.DisplayManager.DisplayListener
        public final void onDisplayChanged(int i14) {
            k kVar = k.this;
            Display defaultDisplay = kVar.getDefaultDisplay();
            if (defaultDisplay == null || defaultDisplay.getDisplayId() != i14) {
                return;
            }
            kVar.b();
        }

        @Override // android.hardware.display.DisplayManager.DisplayListener
        public final void onDisplayRemoved(int i14) {
        }
    }

    public enum c {
        PERFORMANCE(0),
        /* JADX INFO: Fake field, exist only in values array */
        COMPATIBLE(1);


        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f96276a;

        c(int i14) {
            this.f96276a = i14;
        }
    }

    public enum d {
        FILL_START(0),
        FILL_CENTER(1),
        FILL_END(2),
        FIT_START(3),
        FIT_CENTER(4),
        FIT_END(5);


        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f96284a;

        d(int i14) {
            this.f96284a = i14;
        }
    }

    public enum e {
        IDLE,
        STREAMING
    }

    public k(Context context, AttributeSet attributeSet, int i14, int i15) {
        super(context, attributeSet, i14, i15);
        c cVar = f96256p;
        this.f96257a = cVar;
        j jVar = new j();
        this.f96260d = jVar;
        this.f96261e = true;
        this.f96262f = new y0<>(e.IDLE);
        this.f96263g = new AtomicReference<>();
        this.f96265i = new m(jVar);
        this.f96269m = new b();
        this.f96270n = new com.google.android.material.carousel.a(this, 3);
        this.f96271o = new a();
        j0.u.a();
        Resources.Theme theme = context.getTheme();
        int[] iArr = p.f96297a;
        TypedArray typedArrayObtainStyledAttributes = theme.obtainStyledAttributes(attributeSet, iArr, i14, i15);
        s0.q(this, context, iArr, attributeSet, typedArrayObtainStyledAttributes, i14, i15);
        try {
            int integer = typedArrayObtainStyledAttributes.getInteger(1, jVar.f96254h.f96284a);
            for (d dVar : d.values()) {
                if (dVar.f96284a == integer) {
                    setScaleType(dVar);
                    int integer2 = typedArrayObtainStyledAttributes.getInteger(0, cVar.f96276a);
                    for (c cVar2 : c.values()) {
                        if (cVar2.f96276a == integer2) {
                            setImplementationMode(cVar2);
                            typedArrayObtainStyledAttributes.recycle();
                            this.f96266j = new k1.a(context, new hy.d(this, 5));
                            if (getBackground() == null) {
                                setBackgroundColor(a7.b.getColor(getContext(), R.color.black));
                            }
                            t tVar = new t(context);
                            this.f96259c = tVar;
                            tVar.setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
                            return;
                        }
                    }
                    throw new IllegalArgumentException("Unknown implementation mode id " + integer2);
                }
            }
            throw new IllegalArgumentException("Unknown scale type id " + integer);
        } catch (Throwable th3) {
            typedArrayObtainStyledAttributes.recycle();
            throw th3;
        }
    }

    public static boolean c(g1 g1Var, c cVar) {
        boolean zEquals = g1Var.f13909e.c().o().equals("androidx.camera.camera2.legacy");
        boolean z14 = (m1.a.f115757a.b(SurfaceViewStretchedQuirk.class) == null && m1.a.f115757a.b(SurfaceViewNotCroppedByParentQuirk.class) == null) ? false : true;
        if (!zEquals && !z14) {
            int iOrdinal = cVar.ordinal();
            if (iOrdinal == 0) {
                return false;
            }
            if (iOrdinal != 1) {
                com.google.firebase.messaging.l.j(cVar, "Invalid implementation mode: ");
                return false;
            }
        }
        return true;
    }

    private DisplayManager getDisplayManager() {
        Context context = getContext();
        if (context == null) {
            return null;
        }
        return (DisplayManager) context.getSystemService(Constants.ScionAnalytics.MessageType.DISPLAY_NOTIFICATION);
    }

    private b0.l0.j getScreenFlashInternal() {
        return this.f96259c.getScreenFlash();
    }

    private int getViewPortScaleType() {
        int iOrdinal = getScaleType().ordinal();
        if (iOrdinal == 0) {
            return 0;
        }
        int i14 = 1;
        if (iOrdinal != 1) {
            i14 = 2;
            if (iOrdinal != 2) {
                i14 = 3;
                if (iOrdinal != 3 && iOrdinal != 4 && iOrdinal != 5) {
                    a0.s(getScaleType(), "Unexpected scale type: ");
                    return 0;
                }
            }
        }
        return i14;
    }

    private void setScreenFlashUiInfo(b0.l0.j jVar) {
        j1.b bVar = this.f96264h;
        if (bVar == null) {
            return;
        }
        l1.a aVar = new l1.a(l1.a.EnumC2071a.PREVIEW_VIEW, jVar);
        l1.a aVarH = bVar.h();
        bVar.D.put(aVar.f108045a, aVar);
        l1.a aVarH2 = bVar.h();
        if (aVarH2 == null || aVarH2.equals(aVarH)) {
            return;
        }
        l1.a aVarH3 = bVar.h();
        b0.l0 l0Var = bVar.f96205d;
        p005kotlin.jvm.internal.j jVar2 = null;
        if (aVarH3 == null) {
            j1.b.a aVar2 = j1.b.F;
            l0Var.getClass();
            m0.h.f115497e.getClass();
            m0.h hVar = new m0.h(aVar2, jVar2);
            l0Var.f14020w = hVar;
            l0Var.d().k(hVar);
            return;
        }
        b0.l0.j jVar3 = aVarH3.f108046b;
        l0Var.getClass();
        m0.h.f115497e.getClass();
        m0.h hVar2 = new m0.h(jVar3, jVar2);
        l0Var.f14020w = hVar2;
        l0Var.d().k(hVar2);
        aVarH3.f108045a.name();
    }

    public final void a(boolean z14) {
        j0.u.a();
        k1 viewPort = getViewPort();
        if (this.f96264h == null || viewPort == null || !isAttachedToWindow()) {
            return;
        }
        try {
            this.f96264h.a(getSurfaceProvider(), viewPort);
        } catch (IllegalStateException e4) {
            if (!z14) {
                throw e4;
            }
            e4.toString();
        }
    }

    public final void b() {
        Rect rect;
        Display defaultDisplay;
        k0 k0Var;
        j0.u.a();
        if (this.f96258b != null) {
            if (this.f96261e && (defaultDisplay = getDefaultDisplay()) != null && (k0Var = this.f96267k) != null) {
                j jVar = this.f96260d;
                int iR = k0Var.r(defaultDisplay.getRotation());
                int rotation = defaultDisplay.getRotation();
                if (jVar.f96253g) {
                    jVar.f96249c = iR;
                    jVar.f96251e = rotation;
                }
            }
            this.f96258b.f();
        }
        m mVar = this.f96265i;
        Size size = new Size(getWidth(), getHeight());
        int layoutDirection = getLayoutDirection();
        mVar.getClass();
        j0.u.a();
        synchronized (mVar) {
            try {
                if (size.getWidth() == 0 || size.getHeight() == 0 || (rect = mVar.f96294c) == null) {
                    mVar.f96295d = null;
                } else {
                    mVar.f96295d = mVar.f96293b.a(size, layoutDirection, rect);
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
        j1.b bVar = this.f96264h;
        if (bVar != null) {
            Matrix sensorToViewTransform = getSensorToViewTransform();
            j0.u.a();
            y0.b bVar2 = bVar.f96207f;
            if (bVar2 != null && bVar2.f192978b == 1) {
                if (sensorToViewTransform == null) {
                    bVar2.f192981e = null;
                } else {
                    bVar2.getClass();
                    bVar2.f192981e = new Matrix(sensorToViewTransform);
                }
            }
        }
    }

    public Bitmap getBitmap() {
        j0.u.a();
        l lVar = this.f96258b;
        if (lVar == null) {
            return null;
        }
        FrameLayout frameLayout = lVar.f96289b;
        Bitmap bitmapB = lVar.b();
        if (bitmapB == null) {
            return null;
        }
        j jVar = lVar.f96290c;
        Size size = new Size(frameLayout.getWidth(), frameLayout.getHeight());
        int layoutDirection = frameLayout.getLayoutDirection();
        if (!jVar.f()) {
            return bitmapB;
        }
        Matrix matrixD = jVar.d();
        RectF rectFE = jVar.e(size, layoutDirection);
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(size.getWidth(), size.getHeight(), bitmapB.getConfig());
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        Matrix matrix = new Matrix();
        matrix.postConcat(matrixD);
        matrix.postScale(rectFE.width() / jVar.f96247a.getWidth(), rectFE.height() / jVar.f96247a.getHeight());
        matrix.postTranslate(rectFE.left, rectFE.top);
        canvas.drawBitmap(bitmapB, matrix, new Paint(7));
        return bitmapCreateBitmap;
    }

    public j1.b getController() {
        j0.u.a();
        return this.f96264h;
    }

    public Display getDefaultDisplay() {
        if (getDisplay() == null) {
            return null;
        }
        Display display = getDisplayManager().getDisplay(0);
        return display != null ? display : getDisplay();
    }

    public c getImplementationMode() {
        j0.u.a();
        return this.f96257a;
    }

    public v0 getMeteringPointFactory() {
        j0.u.a();
        return this.f96265i;
    }

    public n1.b getOutputTransform() {
        Matrix matrixC;
        j jVar = this.f96260d;
        j0.u.a();
        try {
            matrixC = jVar.c(new Size(getWidth(), getHeight()), getLayoutDirection());
        } catch (IllegalStateException unused) {
            matrixC = null;
        }
        Rect rect = jVar.f96248b;
        if (matrixC == null || rect == null) {
            return null;
        }
        RectF rectF = j0.v.f95963a;
        RectF rectF2 = new RectF(rect);
        Matrix matrix = new Matrix();
        matrix.setRectToRect(j0.v.f95963a, rectF2, Matrix.ScaleToFit.FILL);
        matrixC.preConcat(matrix);
        if (this.f96258b instanceof z) {
            matrixC.postConcat(getMatrix());
        } else {
            getMatrix().isIdentity();
        }
        return new n1.b(matrixC, new Size(rect.width(), rect.height()));
    }

    public androidx.lifecycle.s0<e> getPreviewStreamState() {
        return this.f96262f;
    }

    public d getScaleType() {
        j0.u.a();
        return this.f96260d.f96254h;
    }

    public b0.l0.j getScreenFlash() {
        return getScreenFlashInternal();
    }

    public Matrix getSensorToViewTransform() {
        j0.u.a();
        if (getWidth() == 0 || getHeight() == 0) {
            return null;
        }
        Size size = new Size(getWidth(), getHeight());
        int layoutDirection = getLayoutDirection();
        j jVar = this.f96260d;
        if (!jVar.f()) {
            return null;
        }
        Matrix matrix = new Matrix(jVar.f96250d);
        matrix.postConcat(jVar.c(size, layoutDirection));
        return matrix;
    }

    public w0.c getSurfaceProvider() {
        j0.u.a();
        return this.f96271o;
    }

    public k1 getViewPort() {
        j0.u.a();
        Display defaultDisplay = getDefaultDisplay();
        if (defaultDisplay == null) {
            return null;
        }
        int rotation = defaultDisplay.getRotation();
        j0.u.a();
        if (getWidth() == 0 || getHeight() == 0) {
            return null;
        }
        k1.a aVar = new k1.a(new Rational(getWidth(), getHeight()), rotation);
        aVar.f14003a = getViewPortScaleType();
        aVar.f14006d = getLayoutDirection();
        Rational rational = aVar.f14004b;
        k7.h.e(rational, "The crop aspect ratio must be set.");
        return new k1(aVar.f14003a, rational, aVar.f14005c, aVar.f14006d);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        DisplayManager displayManager;
        super.onAttachedToWindow();
        if (!isInEditMode() && (displayManager = getDisplayManager()) != null) {
            displayManager.registerDisplayListener(this.f96269m, new Handler(Looper.getMainLooper()));
        }
        addOnLayoutChangeListener(this.f96270n);
        l lVar = this.f96258b;
        if (lVar != null) {
            lVar.c();
        }
        a(true);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        DisplayManager displayManager;
        super.onDetachedFromWindow();
        removeOnLayoutChangeListener(this.f96270n);
        l lVar = this.f96258b;
        if (lVar != null) {
            lVar.d();
        }
        j1.b bVar = this.f96264h;
        if (bVar != null) {
            bVar.b();
        }
        if (isInEditMode() || (displayManager = getDisplayManager()) == null) {
            return;
        }
        displayManager.unregisterDisplayListener(this.f96269m);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int i14;
        float f14;
        float f15;
        if (this.f96264h == null) {
            return super.onTouchEvent(motionEvent);
        }
        boolean z14 = motionEvent.getPointerCount() == 1;
        boolean z15 = motionEvent.getAction() == 1;
        boolean z16 = motionEvent.getEventTime() - motionEvent.getDownTime() < ((long) ViewConfiguration.getLongPressTimeout());
        if (z14 && z15 && z16) {
            this.f96268l = motionEvent;
            performClick();
            return true;
        }
        k1.a aVar = this.f96266j;
        int i15 = aVar.f102124a;
        int i16 = aVar.f102125b;
        k1.a.b bVar = aVar.f102126c;
        aVar.f102133j = motionEvent.getEventTime();
        int actionMasked = motionEvent.getActionMasked();
        if (aVar.f102129f) {
            aVar.f102139p.onTouchEvent(motionEvent);
        }
        int pointerCount = motionEvent.getPointerCount();
        boolean z17 = (motionEvent.getButtonState() & 32) != 0;
        boolean z18 = aVar.f102138o == 2 && !z17;
        boolean z19 = actionMasked == 1 || actionMasked == 3 || z18;
        float f16 = 0.0f;
        if (actionMasked == 0 || z19) {
            if (aVar.f102134k) {
                i14 = i15;
                ((hy.d) bVar).d(new k1.a.c.b(aVar.f102133j, aVar.f102127d, aVar.f102128e, aVar.a()));
                aVar.f102134k = false;
                aVar.f102135l = 0.0f;
                aVar.f102138o = 0;
            } else {
                i14 = i15;
                if (aVar.b() && z19) {
                    aVar.f102134k = false;
                    aVar.f102135l = 0.0f;
                    aVar.f102138o = 0;
                }
            }
            if (!z19) {
            }
            return true;
        }
        i14 = i15;
        if (!aVar.f102134k && aVar.f102130g && !aVar.b() && !z19 && z17) {
            aVar.f102136m = motionEvent.getX();
            aVar.f102137n = motionEvent.getY();
            aVar.f102138o = 2;
            aVar.f102135l = 0.0f;
        }
        boolean z24 = actionMasked == 0 || actionMasked == 6 || actionMasked == 5 || z18;
        boolean z25 = actionMasked == 6;
        int actionIndex = z25 ? motionEvent.getActionIndex() : -1;
        int i17 = z25 ? pointerCount - 1 : pointerCount;
        if (aVar.b()) {
            f15 = aVar.f102136m;
            f14 = aVar.f102137n;
            aVar.f102140q = motionEvent.getY() < f14;
        } else {
            float x14 = 0.0f;
            float y14 = 0.0f;
            for (int i18 = 0; i18 < pointerCount; i18++) {
                if (actionIndex != i18) {
                    x14 += motionEvent.getX(i18);
                    y14 += motionEvent.getY(i18);
                }
            }
            float f17 = i17;
            float f18 = x14 / f17;
            f14 = y14 / f17;
            f15 = f18;
        }
        float fAbs = 0.0f;
        for (int i19 = 0; i19 < pointerCount; i19++) {
            if (actionIndex != i19) {
                float fAbs2 = Math.abs(motionEvent.getX(i19) - f15) + f16;
                fAbs = Math.abs(motionEvent.getY(i19) - f14) + fAbs;
                f16 = fAbs2;
            }
        }
        float f19 = i17;
        float f22 = f16 / f19;
        float f24 = fAbs / f19;
        float f25 = 2;
        float f26 = f22 * f25;
        float fHypot = f24 * f25;
        if (!aVar.b()) {
            fHypot = (float) Math.hypot(f26, fHypot);
        }
        boolean z26 = aVar.f102134k;
        aVar.f102127d = MathKt.c(f15);
        aVar.f102128e = MathKt.c(f14);
        if (!aVar.b() && aVar.f102134k && (fHypot < i16 || z24)) {
            ((hy.d) bVar).d(new k1.a.c.b(aVar.f102133j, aVar.f102127d, aVar.f102128e, aVar.a()));
            aVar.f102134k = false;
            aVar.f102135l = fHypot;
        }
        if (z24) {
            aVar.f102131h = fHypot;
            aVar.f102132i = fHypot;
            aVar.f102135l = fHypot;
        }
        if (aVar.b()) {
            i16 = i14;
        }
        if (!aVar.f102134k && fHypot >= i16 && (z26 || Math.abs(fHypot - aVar.f102135l) > i14)) {
            aVar.f102131h = fHypot;
            aVar.f102132i = fHypot;
            ((hy.d) bVar).d(new k1.a.c.C1960a(aVar.f102133j, aVar.f102127d, aVar.f102128e));
            aVar.f102134k = true;
        }
        if (actionMasked == 2) {
            aVar.f102131h = fHypot;
            if (aVar.f102134k) {
                ((hy.d) bVar).d(new k1.a.c.C1961c(aVar.f102133j, aVar.f102127d, aVar.f102128e, aVar.a()));
            }
            aVar.f102132i = aVar.f102131h;
            return true;
        }
        return true;
    }

    @Override // android.view.View
    public final boolean performClick() {
        if (this.f96264h != null) {
            MotionEvent motionEvent = this.f96268l;
            float x14 = motionEvent != null ? motionEvent.getX() : getWidth() / 2.0f;
            MotionEvent motionEvent2 = this.f96268l;
            float y14 = motionEvent2 != null ? motionEvent2.getY() : getHeight() / 2.0f;
            j1.b bVar = this.f96264h;
            m mVar = this.f96265i;
            y0<x> y0Var = bVar.f96226y;
            long j8 = bVar.E;
            if (bVar.j() && bVar.f96222u) {
                PointF pointF = new PointF(x14, y14);
                PointF pointFA = mVar.a(pointF.x, pointF.y);
                u0 u0Var = new u0(pointFA.x, pointFA.y, 0.16666667f, mVar.f14068a);
                PointF pointFA2 = mVar.a(pointF.x, pointF.y);
                u0 u0Var2 = new u0(pointFA2.x, pointFA2.y, 0.25f, mVar.f14068a);
                d0.a aVar = new d0.a(u0Var, 1);
                aVar.a(u0Var2, 2);
                if (j8 > 0) {
                    k7.h.b(j8 >= 1, "autoCancelDuration must be at least 1");
                    aVar.f13872d = j8 / 1000000;
                } else {
                    aVar.f13872d = 0L;
                }
                d0 d0Var = new d0(aVar);
                j1.b.C1840b c1840b = bVar.f96223v;
                if (c1840b != null) {
                    synchronized (c1840b.f96231d) {
                        c1840b.f96228a = true;
                    }
                }
                y0Var.j(new x(1, pointF));
                j1.b.C1840b c1840b2 = new j1.b.C1840b(pointF, y0Var);
                bVar.f96223v = c1840b2;
                l0.j.a(bVar.f96214m.a().l(d0Var), c1840b2, k0.b.a());
                long j14 = j8 / 1000000;
                if (j14 > 0) {
                    new Handler(Looper.getMainLooper()).postDelayed(new eh2.b(c1840b2, 22), j14);
                }
            }
        }
        this.f96268l = null;
        return super.performClick();
    }

    public void setController(j1.b bVar) {
        j0.u.a();
        j1.b bVar2 = this.f96264h;
        if (bVar2 != null && bVar2 != bVar) {
            bVar2.b();
            setScreenFlashUiInfo(null);
        }
        this.f96264h = bVar;
        a(false);
        setScreenFlashUiInfo(getScreenFlashInternal());
    }

    public void setImplementationMode(c cVar) {
        j0.u.a();
        this.f96257a = cVar;
        c cVar2 = c.PERFORMANCE;
    }

    public void setScaleType(d dVar) {
        j0.u.a();
        this.f96260d.f96254h = dVar;
        b();
        a(false);
    }

    public void setScreenFlashOverlayColor(int i14) {
        this.f96259c.setBackgroundColor(i14);
    }

    public void setScreenFlashWindow(Window window) {
        j0.u.a();
        this.f96259c.setScreenFlashWindow(window);
        setScreenFlashUiInfo(getScreenFlashInternal());
    }

    public k(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public k(Context context, AttributeSet attributeSet, int i14) {
        this(context, attributeSet, i14, 0);
    }

    public k(Context context) {
        this(context, null);
    }
}
