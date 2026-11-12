package kotlin;

import android.annotation.SuppressLint;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RenderEffect;
import android.os.Build;
import android.view.View;
import android.view.ViewOutlineProvider;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import e23.p;
import g6.k;
import h5.n1;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import n4.e;
import n4.f;
import o4.a1;
import o4.b1;
import o4.c0;
import o4.f0;
import o4.f1;
import o4.h;
import o4.i;
import o4.m;
import o4.m1;
import o4.n0;
import o4.o1;
import o4.y;
import o4.z;
import o4.z1;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;
import p005kotlin.jvm.internal.w;

/* JADX INFO: loaded from: classes.dex */
@p005kotlin.Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0002>?BA\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u001a\u0010\f\u001a\u0016\u0012\u0004\u0012\u00020\t\u0012\u0006\u0012\u0004\u0018\u00010\n\u0012\u0004\u0012\u00020\u000b0\b\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000b0\r¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R*\u0010\u001d\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u00198\u0006@BX\u0086\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\"\u0010(\u001a\u00020!8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'R\u001a\u0010.\u001a\u00020)8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-R\u0014\u00102\u001a\u00020/8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b0\u00101R\"\u00103\u001a\u00020\u00198\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b3\u0010\u001c\u001a\u0004\b3\u0010\u001e\"\u0004\b4\u0010 R\u0014\u00106\u001a\u00020)8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b5\u0010-R$\u00109\u001a\u00020!2\u0006\u0010\u001a\u001a\u00020!8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b7\u0010%\"\u0004\b8\u0010'R\u0016\u0010=\u001a\u0004\u0018\u00010:8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b;\u0010<¨\u0006@"}, d2 = {"Li5/b4;", "Landroid/view/View;", "Lh5/n1;", "", "Li5/m;", "ownerView", "Li5/a2;", TtmlNode.RUBY_CONTAINER, "Lkotlin/Function2;", "Lo4/y;", "Lr4/c;", "", "drawBlock", "Lkotlin/Function0;", "invalidateParentLayer", "<init>", "(Li5/m;Li5/a2;Le23/p;Le23/a;)V", "a", "Li5/m;", "getOwnerView", "()Li5/m;", "b", "Li5/a2;", "getContainer", "()Li5/a2;", "", "value", "h", "Z", "isInvalidated", "()Z", "setInvalidated", "(Z)V", "", "m", "F", "getFrameRate", "()F", "setFrameRate", "(F)V", "frameRate", "", "p", "J", "getLayerId", "()J", "layerId", "Lo4/a1;", "getUnderlyingMatrix-sQKQjiQ", "()[F", "underlyingMatrix", "isFrameRateFromParent", "setFrameRateFromParent", "getOwnerViewId", "ownerViewId", "getCameraDistancePx", "setCameraDistancePx", "cameraDistancePx", "Lo4/f1;", "getManualClipPath", "()Lo4/f1;", "manualClipPath", "d", "c", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SuppressLint({"ViewConstructor"})
public final class b4 extends View implements n1 {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final c f91091r = new c(null);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final b f91092t = b.f91115a;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final a f91093v = new a();

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static Method f91094w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static Field f91095x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static boolean f91096y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static boolean f91097z;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public final m ownerView;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public final a2 container;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public p<? super y, ? super r4.c, p005kotlin.Unit> f91100c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public e23.a<p005kotlin.Unit> f91101d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final y2 f91102e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f91103f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Rect f91104g;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    public boolean isInvalidated;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public h f91106i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f91107j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final z f91108k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final o2<View> f91109l;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    public float frameRate;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public long f91111n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f91112o;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    public final long layerId;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f91114q;

    @p005kotlin.Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"i5/b4$a", "Landroid/view/ViewOutlineProvider;", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a extends ViewOutlineProvider {
        @Override // android.view.ViewOutlineProvider
        public final void getOutline(View view2, Outline outline) {
            view2.getClass();
            y2 y2Var = ((b4) view2).f91102e;
            y2Var.a();
            Outline outline2 = (y2Var.f91662m && y2Var.f91650a) ? y2Var.f91651b : null;
            outline2.getClass();
            outline.set(outline2);
        }
    }

    @p005kotlin.Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "view", "Landroid/view/View;", "matrix", "Landroid/graphics/Matrix;", "invoke"}, k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class b extends w implements p<View, Matrix, p005kotlin.Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f91115a = new b();

        public b() {
            super(2);
        }

        @Override // e23.p
        public final p005kotlin.Unit invoke(View view2, Matrix matrix) {
            matrix.set(view2.getMatrix());
            return p005kotlin.Unit.INSTANCE;
        }
    }

    @p005kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÃ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Li5/b4$d;", "", "<init>", "()V", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int f91116a = 0;

        static {
            new d();
        }

        private d() {
        }
    }

    public b4(m mVar, a2 a2Var, p<? super y, ? super r4.c, p005kotlin.Unit> pVar, e23.a<p005kotlin.Unit> aVar) {
        super(mVar.getContext());
        this.ownerView = mVar;
        this.container = a2Var;
        this.f91100c = pVar;
        this.f91101d = aVar;
        this.f91102e = new y2();
        this.f91108k = new z();
        this.f91109l = new o2<>(f91092t);
        z1.f129046b.getClass();
        this.f91111n = z1.f129047c;
        this.f91112o = true;
        setWillNotDraw(false);
        a2Var.addView(this);
        this.layerId = View.generateViewId();
    }

    private final f1 getManualClipPath() {
        if (!getClipToOutline()) {
            return null;
        }
        y2 y2Var = this.f91102e;
        if (!y2Var.f91656g) {
            return null;
        }
        y2Var.a();
        return y2Var.f91654e;
    }

    private final void setInvalidated(boolean z14) {
        if (z14 != this.isInvalidated) {
            this.isInvalidated = z14;
            this.ownerView.b0(this, z14);
        }
    }

    @Override // h5.n1
    public final void a(y yVar, r4.c cVar) {
        boolean z14 = getElevation() > 0.0f;
        this.f91107j = z14;
        if (z14) {
            yVar.t();
        }
        this.container.a(yVar, this, getDrawingTime());
        if (this.f91107j) {
            yVar.e();
        }
    }

    @Override // h5.n1
    public final void b(float[] fArr) {
        a1.h(fArr, this.f91109l.b(this));
    }

    @Override // h5.n1
    public final long c(long j8, boolean z14) {
        o2<View> o2Var = this.f91109l;
        if (!z14) {
            return !o2Var.f91372h ? a1.c(j8, o2Var.b(this)) : j8;
        }
        float[] fArrA = o2Var.a(this);
        if (fArrA != null) {
            return !o2Var.f91372h ? a1.c(j8, fArrA) : j8;
        }
        n4.c.f123541b.getClass();
        return n4.c.f123542c;
    }

    @Override // h5.n1
    public final void d(e23.a aVar, p pVar) {
        this.container.addView(this);
        o2<View> o2Var = this.f91109l;
        o2Var.f91369e = false;
        o2Var.f91370f = false;
        o2Var.f91372h = true;
        o2Var.f91371g = true;
        a1.e(o2Var.f91367c);
        a1.e(o2Var.f91368d);
        this.f91103f = false;
        this.f91107j = false;
        z1.f129046b.getClass();
        this.f91111n = z1.f129047c;
        this.f91100c = pVar;
        this.f91101d = aVar;
        setInvalidated(false);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // h5.n1
    public final void destroy() {
        q3.c<Reference<T>> cVar;
        Object objPoll;
        setInvalidated(false);
        m mVar = this.ownerView;
        mVar.N0 = true;
        this.f91100c = null;
        this.f91101d = null;
        g4<n1> g4Var = mVar.f91302u1;
        do {
            ReferenceQueue<n1> referenceQueue = g4Var.f91196b;
            cVar = g4Var.f91195a;
            objPoll = referenceQueue.poll();
            if (objPoll != null) {
                cVar.j((Reference<T>) objPoll);
            }
        } while (objPoll != null);
        cVar.b(new WeakReference(this, g4Var.f91196b));
        mVar.I.k(this);
        this.container.removeViewInLayout(this);
    }

    /* JADX WARN: Code duplicated, block: B:31:0x009b  */
    /* JADX WARN: Code duplicated, block: B:34:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:35:0x00fa  */
    @Override // android.view.View
    public final void dispatchDraw(Canvas canvas) {
        char c14;
        long j8;
        boolean z14;
        z zVar = this.f91108k;
        o4.c cVar = zVar.f129040a;
        Canvas canvas2 = cVar.f128816a;
        cVar.f128816a = canvas;
        if (getManualClipPath() == null && canvas.isHardwareAccelerated()) {
            z14 = false;
        } else {
            cVar.l();
            y2 y2Var = this.f91102e;
            y2Var.a();
            f1 f1Var = y2Var.f91654e;
            if (f1Var != null) {
                y.h(cVar, f1Var);
            } else {
                float f14 = y2Var.f91659j;
                if (f14 > 0.0f) {
                    f1 f1VarA = y2Var.f91657h;
                    e eVar = y2Var.f91658i;
                    if (f1VarA != null) {
                        long j14 = y2Var.f91660k;
                        long j15 = y2Var.f91661l;
                        if (eVar == null || !f.d(eVar)) {
                            c14 = ' ';
                            j8 = 4294967295L;
                        } else {
                            c14 = ' ';
                            j8 = 4294967295L;
                            int i14 = (int) (j14 >> 32);
                            if (eVar.f123551a == Float.intBitsToFloat(i14)) {
                                int i15 = (int) (j14 & 4294967295L);
                                if (eVar.f123552b == Float.intBitsToFloat(i15)) {
                                    if (eVar.f123553c == Float.intBitsToFloat((int) (j15 >> 32)) + Float.intBitsToFloat(i14)) {
                                        if (eVar.f123554d != Float.intBitsToFloat((int) (j15 & 4294967295L)) + Float.intBitsToFloat(i15) || Float.intBitsToFloat((int) (eVar.f123555e >> 32)) != f14) {
                                        }
                                    }
                                }
                            }
                        }
                        float fIntBitsToFloat = Float.intBitsToFloat((int) (y2Var.f91660k >> c14));
                        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (y2Var.f91660k & j8));
                        float fIntBitsToFloat3 = Float.intBitsToFloat((int) (y2Var.f91661l >> c14)) + Float.intBitsToFloat((int) (y2Var.f91660k >> c14));
                        float fIntBitsToFloat4 = Float.intBitsToFloat((int) (y2Var.f91661l & j8)) + Float.intBitsToFloat((int) (y2Var.f91660k & j8));
                        float f15 = y2Var.f91659j;
                        long jFloatToRawIntBits = Float.floatToRawIntBits(f15);
                        long jFloatToRawIntBits2 = ((long) Float.floatToRawIntBits(f15)) & j8;
                        n4.a.C2318a c2318a = n4.a.f123535b;
                        e eVarC = f.c(fIntBitsToFloat, fIntBitsToFloat2, fIntBitsToFloat3, fIntBitsToFloat4, jFloatToRawIntBits2 | (jFloatToRawIntBits << c14));
                        if (f1VarA == null) {
                            f1VarA = m.a();
                        } else {
                            f1VarA.reset();
                        }
                        f1VarA.k(eVarC, f1.b.CounterClockwise);
                        y2Var.f91658i = eVarC;
                        y2Var.f91657h = f1VarA;
                    } else {
                        c14 = ' ';
                        j8 = 4294967295L;
                        float fIntBitsToFloat5 = Float.intBitsToFloat((int) (y2Var.f91660k >> c14));
                        float fIntBitsToFloat6 = Float.intBitsToFloat((int) (y2Var.f91660k & j8));
                        float fIntBitsToFloat7 = Float.intBitsToFloat((int) (y2Var.f91661l >> c14)) + Float.intBitsToFloat((int) (y2Var.f91660k >> c14));
                        float fIntBitsToFloat8 = Float.intBitsToFloat((int) (y2Var.f91661l & j8)) + Float.intBitsToFloat((int) (y2Var.f91660k & j8));
                        float f16 = y2Var.f91659j;
                        long jFloatToRawIntBits3 = Float.floatToRawIntBits(f16);
                        long jFloatToRawIntBits4 = ((long) Float.floatToRawIntBits(f16)) & j8;
                        n4.a.C2318a c2318a2 = n4.a.f123535b;
                        e eVarC2 = f.c(fIntBitsToFloat5, fIntBitsToFloat6, fIntBitsToFloat7, fIntBitsToFloat8, jFloatToRawIntBits4 | (jFloatToRawIntBits3 << c14));
                        if (f1VarA == null) {
                            f1VarA = m.a();
                        } else {
                            f1VarA.reset();
                        }
                        f1VarA.k(eVarC2, f1.b.CounterClockwise);
                        y2Var.f91658i = eVarC2;
                        y2Var.f91657h = f1VarA;
                    }
                    y.h(cVar, f1VarA);
                } else {
                    float fIntBitsToFloat9 = Float.intBitsToFloat((int) (y2Var.f91660k >> 32));
                    float fIntBitsToFloat10 = Float.intBitsToFloat((int) (y2Var.f91660k & 4294967295L));
                    float fIntBitsToFloat11 = Float.intBitsToFloat((int) (y2Var.f91661l >> 32)) + Float.intBitsToFloat((int) (y2Var.f91660k >> 32));
                    float fIntBitsToFloat12 = Float.intBitsToFloat((int) (y2Var.f91660k & 4294967295L)) + Float.intBitsToFloat((int) (y2Var.f91661l & 4294967295L));
                    c0.f128819b.getClass();
                    cVar.a(fIntBitsToFloat9, fIntBitsToFloat10, fIntBitsToFloat11, fIntBitsToFloat12, c0.f128820c);
                }
            }
            z14 = true;
        }
        p<? super y, ? super r4.c, p005kotlin.Unit> pVar = this.f91100c;
        if (pVar != null) {
            pVar.invoke(cVar, null);
        }
        if (z14) {
            cVar.i();
        }
        zVar.f129040a.f128816a = canvas2;
        setInvalidated(false);
    }

    @Override // h5.n1
    public final boolean e(long j8) {
        b1 b1Var;
        int i14 = (int) (j8 >> 32);
        float fIntBitsToFloat = Float.intBitsToFloat(i14);
        int i15 = (int) (j8 & 4294967295L);
        float fIntBitsToFloat2 = Float.intBitsToFloat(i15);
        if (this.f91103f) {
            return 0.0f <= fIntBitsToFloat && fIntBitsToFloat < ((float) getWidth()) && 0.0f <= fIntBitsToFloat2 && fIntBitsToFloat2 < ((float) getHeight());
        }
        if (!getClipToOutline()) {
            return true;
        }
        y2 y2Var = this.f91102e;
        if (y2Var.f91662m && (b1Var = y2Var.f91652c) != null) {
            return l3.a(b1Var, Float.intBitsToFloat(i14), Float.intBitsToFloat(i15));
        }
        return true;
    }

    @Override // h5.n1
    public final void f(float[] fArr) {
        float[] fArrA = this.f91109l.a(this);
        if (fArrA != null) {
            a1.h(fArr, fArrA);
        }
    }

    @Override // android.view.View
    public final void forceLayout() {
    }

    @Override // h5.n1
    public final void g(long j8) {
        k.a aVar = k.f76003b;
        int i14 = (int) (j8 >> 32);
        int left = getLeft();
        o2<View> o2Var = this.f91109l;
        if (i14 != left) {
            offsetLeftAndRight(i14 - getLeft());
            o2Var.f91369e = true;
            o2Var.f91370f = true;
        }
        int i15 = (int) (j8 & 4294967295L);
        if (i15 != getTop()) {
            offsetTopAndBottom(i15 - getTop());
            o2Var.f91369e = true;
            o2Var.f91370f = true;
        }
    }

    public final float getCameraDistancePx() {
        return getCameraDistance() / getResources().getDisplayMetrics().densityDpi;
    }

    public final a2 getContainer() {
        return this.container;
    }

    public float getFrameRate() {
        return this.frameRate;
    }

    public long getLayerId() {
        return this.layerId;
    }

    public final m getOwnerView() {
        return this.ownerView;
    }

    public long getOwnerViewId() {
        if (Build.VERSION.SDK_INT < 29) {
            return -1L;
        }
        int i14 = d.f91116a;
        return this.ownerView.getUniqueDrawingId();
    }

    @Override // h5.n1
    /* JADX INFO: renamed from: getUnderlyingMatrix-sQKQjiQ */
    public float[] mo322getUnderlyingMatrixsQKQjiQ() {
        return this.f91109l.b(this);
    }

    @Override // h5.n1
    public final void h() {
        if (!this.isInvalidated || f91097z) {
            return;
        }
        f91091r.getClass();
        try {
            if (!f91096y) {
                f91096y = true;
                f91094w = (Method) Class.class.getDeclaredMethod("getDeclaredMethod", String.class, new Class[0].getClass()).invoke(View.class, "updateDisplayListIfDirty", new Class[0]);
                f91095x = (Field) Class.class.getDeclaredMethod("getDeclaredField", String.class).invoke(View.class, "mRecreateDisplayList");
                Method method = f91094w;
                if (method != null) {
                    method.setAccessible(true);
                }
                Field field = f91095x;
                if (field != null) {
                    field.setAccessible(true);
                }
            }
            Field field2 = f91095x;
            if (field2 != null) {
                field2.setBoolean(this, true);
            }
            Method method2 = f91094w;
            if (method2 != null) {
                method2.invoke(this, null);
            }
        } catch (Throwable unused) {
            f91097z = true;
        }
        setInvalidated(false);
    }

    @Override // android.view.View
    public final boolean hasOverlappingRendering() {
        return this.f91112o;
    }

    @Override // h5.n1
    public final void i(o1 o1Var) {
        int i14;
        RenderEffect renderEffectA;
        e23.a<p005kotlin.Unit> aVar;
        int i15 = o1Var.f128902a | this.f91114q;
        if ((i15 & 4096) != 0) {
            long j8 = o1Var.f128915n;
            this.f91111n = j8;
            z1.a aVar2 = z1.f129046b;
            setPivotX(Float.intBitsToFloat((int) (j8 >> 32)) * getWidth());
            setPivotY(Float.intBitsToFloat((int) (this.f91111n & 4294967295L)) * getHeight());
        }
        if ((i15 & 1) != 0) {
            setScaleX(o1Var.f128903b);
        }
        if ((i15 & 2) != 0) {
            setScaleY(o1Var.f128904c);
        }
        if ((i15 & 4) != 0) {
            setAlpha(o1Var.f128905d);
        }
        if ((i15 & 8) != 0) {
            setTranslationX(o1Var.f128906e);
        }
        if ((i15 & 16) != 0) {
            setTranslationY(o1Var.f128907f);
        }
        if ((i15 & 32) != 0) {
            setElevation(o1Var.f128908g);
        }
        if ((i15 & 1024) != 0) {
            setRotation(o1Var.f128913l);
        }
        if ((i15 & 256) != 0) {
            setRotationX(o1Var.f128911j);
        }
        if ((i15 & 512) != 0) {
            setRotationY(o1Var.f128912k);
        }
        if ((i15 & 2048) != 0) {
            setCameraDistancePx(o1Var.f128914m);
        }
        boolean z14 = false;
        boolean z15 = getManualClipPath() != null;
        boolean z16 = o1Var.f128917p;
        boolean z17 = z16 && o1Var.f128916o != m1.f128891a;
        if ((i15 & 24576) != 0) {
            this.f91103f = z16 && o1Var.f128916o == m1.f128891a;
            l();
            setClipToOutline(z17);
        }
        b1 b1Var = o1Var.f128925z;
        float f14 = o1Var.f128905d;
        float f15 = o1Var.f128908g;
        long j14 = o1Var.f128919r;
        y2 y2Var = this.f91102e;
        y2Var.f91651b.setAlpha(f14);
        boolean zG = s.g(y2Var.f91652c, b1Var);
        if (!zG) {
            y2Var.f91652c = b1Var;
            y2Var.f91655f = true;
        }
        y2Var.f91661l = j14;
        boolean z18 = b1Var != null && (z17 || f15 > 0.0f);
        if (y2Var.f91662m != z18) {
            y2Var.f91662m = z18;
            y2Var.f91655f = true;
        }
        Paint paintA = null;
        if (y2Var.f91655f) {
            y2Var.a();
            setOutlineProvider(((!y2Var.f91662m || !y2Var.f91650a) ? null : y2Var.f91651b) != null ? f91093v : null);
        }
        boolean z19 = getManualClipPath() != null;
        if (z15 != z19 || (z19 && !zG)) {
            invalidate();
        }
        if (!this.f91107j && getElevation() > 0.0f && (aVar = this.f91101d) != null) {
            aVar.invoke();
        }
        if ((i15 & 7963) != 0) {
            o2<View> o2Var = this.f91109l;
            o2Var.f91369e = true;
            o2Var.f91370f = true;
        }
        if ((i15 & 64) != 0) {
            c4 c4Var = c4.f91125a;
            int iJ = f0.j(o1Var.f128909h);
            c4Var.getClass();
            setOutlineAmbientShadowColor(iJ);
        }
        if ((i15 & 128) != 0) {
            c4 c4Var2 = c4.f91125a;
            int iJ2 = f0.j(o1Var.f128910i);
            c4Var2.getClass();
            setOutlineSpotShadowColor(iJ2);
        }
        if (Build.VERSION.SDK_INT >= 31 && (131072 & i15) != 0) {
            d4 d4Var = d4.f91137a;
            o4.n1 n1Var = o1Var.f128922w;
            d4Var.getClass();
            if (n1Var != null) {
                renderEffectA = n1Var.f128896a;
                if (renderEffectA == null) {
                    renderEffectA = n1Var.a();
                    n1Var.f128896a = renderEffectA;
                }
            } else {
                renderEffectA = null;
            }
            setRenderEffect(renderEffectA);
        }
        boolean z24 = ((262144 & i15) == 0 && (524288 & i15) == 0) ? false : true;
        if ((i15 & 32768) != 0 || z24) {
            if (z24) {
                n0.f128892b.getClass();
                i14 = n0.f128893c;
            } else {
                i14 = o1Var.f128918q;
            }
            n0.f128892b.getClass();
            if (i14 == n0.f128893c) {
                if (z24) {
                    h hVar = this.f91106i;
                    if (hVar == null) {
                        hVar = new h();
                        this.f91106i = hVar;
                    }
                    hVar.d(o1Var.f128923x);
                    hVar.k(o1Var.f128924y);
                    paintA = i.a(hVar);
                }
                setLayerType(2, paintA);
            } else {
                if (i14 == n0.f128894d) {
                    setLayerType(0, null);
                } else {
                    setLayerType(0, null);
                }
                this.f91112o = z14;
            }
            z14 = true;
            this.f91112o = z14;
        }
        this.f91114q = o1Var.f128902a;
    }

    @Override // android.view.View, h5.n1
    public final void invalidate() {
        if (this.isInvalidated) {
            return;
        }
        setInvalidated(true);
        super.invalidate();
        this.ownerView.invalidate();
    }

    @Override // h5.n1
    public final void j(n4.b bVar, boolean z14) {
        o2<View> o2Var = this.f91109l;
        if (!z14) {
            float[] fArrB = o2Var.b(this);
            if (o2Var.f91372h) {
                return;
            }
            a1.d(fArrB, bVar);
            return;
        }
        float[] fArrA = o2Var.a(this);
        if (fArrA != null) {
            if (o2Var.f91372h) {
                return;
            }
            a1.d(fArrA, bVar);
        } else {
            bVar.f123537a = 0.0f;
            bVar.f123538b = 0.0f;
            bVar.f123539c = 0.0f;
            bVar.f123540d = 0.0f;
        }
    }

    @Override // h5.n1
    public final void k(long j8) {
        int i14 = (int) (j8 >> 32);
        int i15 = (int) (j8 & 4294967295L);
        if (i14 == getWidth() && i15 == getHeight()) {
            return;
        }
        long j14 = this.f91111n;
        z1.a aVar = z1.f129046b;
        setPivotX(Float.intBitsToFloat((int) (j14 >> 32)) * i14);
        setPivotY(Float.intBitsToFloat((int) (4294967295L & this.f91111n)) * i15);
        y2 y2Var = this.f91102e;
        y2Var.a();
        setOutlineProvider(((!y2Var.f91662m || !y2Var.f91650a) ? null : y2Var.f91651b) != null ? f91093v : null);
        layout(getLeft(), getTop(), getLeft() + i14, getTop() + i15);
        l();
        o2<View> o2Var = this.f91109l;
        o2Var.f91369e = true;
        o2Var.f91370f = true;
    }

    public final void l() {
        Rect rect;
        if (this.f91103f) {
            Rect rect2 = this.f91104g;
            if (rect2 == null) {
                this.f91104g = new Rect(0, 0, getWidth(), getHeight());
            } else {
                rect2.getClass();
                rect2.set(0, 0, getWidth(), getHeight());
            }
            rect = this.f91104g;
        } else {
            rect = null;
        }
        setClipBounds(rect);
    }

    @Override // android.view.View
    public final void onLayout(boolean z14, int i14, int i15, int i16, int i17) {
    }

    public final void setCameraDistancePx(float f14) {
        setCameraDistance(f14 * getResources().getDisplayMetrics().densityDpi);
    }

    public void setFrameRate(float f14) {
        this.frameRate = f14;
    }

    public void setFrameRateFromParent(boolean z14) {
    }

    @p005kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R&\u0010\b\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0018\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0018\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Li5/b4$c;", "", "<init>", "()V", "Lkotlin/Function2;", "Landroid/view/View;", "Landroid/graphics/Matrix;", "", "getMatrix", "Le23/p;", "Ljava/lang/reflect/Method;", "updateDisplayListIfDirtyMethod", "Ljava/lang/reflect/Method;", "Ljava/lang/reflect/Field;", "recreateDisplayList", "Ljava/lang/reflect/Field;", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class c {
        public /* synthetic */ c(j jVar) {
            this();
        }

        private c() {
        }
    }
}
