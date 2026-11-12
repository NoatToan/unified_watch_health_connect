package com.huawei.uikit.hwdotspageindicator.widget;

import android.animation.TimeInterpolator;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.os.Handler;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Pair;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.core.content.ContextCompat;
import com.huawei.openalliance.ad.constant.Constants;
import com.huawei.uikit.hwdotspageindicator.R;
import com.huawei.uikit.hwviewpager.widget.HwPagerAdapter;
import com.huawei.uikit.hwviewpager.widget.HwViewPager;
import defpackage.xei;
import defpackage.xeo;
import defpackage.xep;
import defpackage.xft;
import java.util.Locale;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes20.dex */
public class HwDotsPageIndicator extends bzrwd implements HwViewPager.OnPageChangeListener, View.OnClickListener, HwDotsPageIndicatorAnimation.AnimationUpdateListener {
    private bfscp aa;
    private float ab;
    private g ac;
    private int ad;
    private RectF ae;
    private int af;
    private int ag;
    private e ah;
    private int ai;
    private RectF aj;
    private RectF ak;
    private int al;
    private RectF am;
    private int an;
    private int ao;
    private float ap;
    private RectF aq;
    private int ar;
    private final Runnable as;
    private float at;
    private int au;
    private int av;
    private int aw;
    private int ax;
    private int ay;
    private int az;
    private int ba;
    private int bb;
    private int bc;
    private float bd;
    private float be;
    private float bf;
    private int bg;
    private int bh;
    private float bi;
    private String bj;
    private int bk;
    private boolean bl;
    private boolean bm;
    private int bn;
    private boolean bo;
    private long bp;
    private boolean bq;
    private boolean br;
    private boolean bs;
    private boolean bt;
    private boolean bu;
    private boolean bv;
    private boolean bw;
    private HwViewPager.OnPageChangeListener bx;
    private Handler by;
    private boolean bz;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected HwViewPager f29404c;
    private boolean ca;
    private boolean cb;
    private Paint cc;
    private Paint cf;
    private boolean cg;
    protected boolean d;
    private Paint k;
    private boolean l;
    private int m;
    private Paint n;
    private boolean o;
    private boolean p;
    private Paint.FontMetrics q;
    private HwDotsPageIndicatorInteractor.OnClickListener r;
    private xep.c s;
    private boolean t;
    private int u;
    private HwDotsPageIndicatorInteractor.OnGestureListener v;
    private int w;
    private HwDotsPageIndicatorInteractor.OnMouseOperationListener x;
    private float y;
    private awsks z;

    class a extends HwDotsPageIndicatorAnimation.AnimationStateListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f29405b;

        a(boolean z) {
            this.f29405b = z;
        }

        @Override // com.huawei.uikit.hwdotspageindicator.widget.HwDotsPageIndicatorAnimation.AnimationStateListener
        void b() {
            if (this.f29405b) {
                HwDotsPageIndicator.this.r();
            }
        }
    }

    enum awsks {
        DEFAULT,
        TARGET,
        SLIDE
    }

    class b extends DataSetObserver {
        b() {
        }

        @Override // android.database.DataSetObserver
        public void onChanged() {
            HwDotsPageIndicator hwDotsPageIndicator = HwDotsPageIndicator.this;
            hwDotsPageIndicator.setPageCount(hwDotsPageIndicator.f29404c.getAdapter().getCount());
        }
    }

    enum bfscp {
        COMMON,
        VISIBLE,
        MOUSE_ON_DOT
    }

    class c extends HwDotsPageIndicatorAnimation.AnimationStateListener {
        c() {
        }

        @Override // com.huawei.uikit.hwdotspageindicator.widget.HwDotsPageIndicatorAnimation.AnimationStateListener
        void a(float f) {
            if (HwDotsPageIndicator.this.x != null) {
                HwDotsPageIndicator.this.x.onFocusAnimationProgress(f);
            }
        }
    }

    class d extends HwDotsPageIndicatorAnimation.AnimationStateListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f29414a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ HwDotsPageIndicatorAnimation.AnimationStateListener f29415b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ float f29416c;
        final /* synthetic */ boolean d;
        final /* synthetic */ float e;

        d(float f, boolean z, int i, float f2, HwDotsPageIndicatorAnimation.AnimationStateListener animationStateListener) {
            this.f29416c = f;
            this.d = z;
            this.f29414a = i;
            this.e = f2;
            this.f29415b = animationStateListener;
        }

        @Override // com.huawei.uikit.hwdotspageindicator.widget.HwDotsPageIndicatorAnimation.AnimationStateListener
        void a(float f) {
            if (f < this.f29416c || HwDotsPageIndicator.this.i()) {
                return;
            }
            HwDotsPageIndicator.this.f29450a.j();
            HwDotsPageIndicatorAnimation.d dVarD = new HwDotsPageIndicatorAnimation.d.b().a(this.d ? HwDotsPageIndicator.this.e.s() : HwDotsPageIndicator.this.e.p()).d(this.e).e(HwDotsPageIndicator.this.h).c(xep.d(HwDotsPageIndicator.this.f29451b, this.f29414a)).c(HwDotsPageIndicator.this).c(this.f29415b).d();
            HwDotsPageIndicator hwDotsPageIndicator = HwDotsPageIndicator.this;
            hwDotsPageIndicator.f29450a.e(hwDotsPageIndicator.bq, dVarD);
        }
    }

    class e implements Runnable {
        private e() {
        }

        @Override // java.lang.Runnable
        public void run() {
            HwDotsPageIndicator.this.e(false);
        }

        /* synthetic */ e(HwDotsPageIndicator hwDotsPageIndicator, f fVar) {
            this();
        }
    }

    class f implements Runnable {
        f() {
        }

        @Override // java.lang.Runnable
        public void run() {
            HwViewPager hwViewPager = HwDotsPageIndicator.this.f29404c;
            if (hwViewPager == null || hwViewPager.getAdapter() == null) {
                Log.w("HwDotsPageIndicator", "HwViewPager or adapter is illegal.");
                return;
            }
            HwPagerAdapter adapter = HwDotsPageIndicator.this.f29404c.getAdapter();
            if (adapter.getCount() < 2) {
                Log.w("HwDotsPageIndicator", "Auto play but pager count is less than two.");
                return;
            }
            int currentItem = HwDotsPageIndicator.this.f29404c.getCurrentItem();
            HwDotsPageIndicator.this.f29404c.setCurrentItem((HwDotsPageIndicator.this.f29404c.isSupportLoop() || currentItem < adapter.getCount() - 1) ? currentItem + 1 : 0, true);
            if (HwDotsPageIndicator.this.bv) {
                HwDotsPageIndicator.this.by.postDelayed(HwDotsPageIndicator.this.as, HwDotsPageIndicator.this.bn);
            }
        }
    }

    class g implements Runnable {
        private g() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (HwDotsPageIndicator.this.v != null && HwDotsPageIndicator.this.ca) {
                HwDotsPageIndicator.this.v.onLongPress(1);
            }
            HwDotsPageIndicator.this.d(true);
        }

        /* synthetic */ g(HwDotsPageIndicator hwDotsPageIndicator, f fVar) {
            this();
        }
    }

    class i extends HwDotsPageIndicatorAnimation.AnimationStateListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ float f29419a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ float f29420b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f29421c;
        final /* synthetic */ float e;

        i(float f, boolean z, float f2, float f3) {
            this.e = f;
            this.f29421c = z;
            this.f29420b = f2;
            this.f29419a = f3;
        }

        @Override // com.huawei.uikit.hwdotspageindicator.widget.HwDotsPageIndicatorAnimation.AnimationStateListener
        void a(float f) {
            if (f <= this.e || HwDotsPageIndicator.this.i()) {
                return;
            }
            HwDotsPageIndicator.this.f29450a.j();
            HwDotsPageIndicator hwDotsPageIndicator = HwDotsPageIndicator.this;
            boolean z = hwDotsPageIndicator.bq;
            float fS = this.f29421c ? HwDotsPageIndicator.this.e.s() : HwDotsPageIndicator.this.e.p();
            float f2 = this.f29421c ? this.f29420b : this.f29419a;
            HwDotsPageIndicator hwDotsPageIndicator2 = HwDotsPageIndicator.this;
            hwDotsPageIndicator.b(z, fS, f2, hwDotsPageIndicator2.h, hwDotsPageIndicator2.f29451b);
        }
    }

    class j extends HwDotsPageIndicatorAnimation.AnimationStateListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f29422b;

        j(boolean z) {
            this.f29422b = z;
        }

        @Override // com.huawei.uikit.hwdotspageindicator.widget.HwDotsPageIndicatorAnimation.AnimationStateListener
        void b() {
            HwDotsPageIndicator.this.s.e(HwDotsPageIndicator.this.bi);
            if (this.f29422b && HwDotsPageIndicator.this.v != null) {
                HwDotsPageIndicator.this.v.onLongPress(2);
            }
            if (this.f29422b || HwDotsPageIndicator.this.x == null) {
                return;
            }
            HwDotsPageIndicator.this.x.onMoveInHotZone(2);
        }
    }

    public HwDotsPageIndicator(Context context) {
        this(context, null);
    }

    private void aa() {
        if (this.aq == null) {
            return;
        }
        if (this.ae == null) {
            this.ae = new RectF();
        }
        int i2 = this.bk;
        if (i2 == 0) {
            this.ae = new RectF();
            return;
        }
        this.ae.left = this.p ? this.e.j(i2) + (this.ad / 2.0f) : this.aq.left;
        RectF rectF = this.ae;
        RectF rectF2 = this.aq;
        rectF.top = rectF2.top;
        rectF.right = this.p ? rectF2.right : this.e.j(this.bk) - (this.ad / 2.0f);
        this.ae.bottom = this.aq.bottom;
    }

    private void ab() {
        this.e.c(this.p);
        this.e.h(this.at - this.y);
        this.e.o(this.at + this.y);
        xeo xeoVar = this.e;
        xeoVar.f(xeoVar.j(this.bk));
        xeo xeoVar2 = this.e;
        xeoVar2.j(xeoVar2.c(this.bk));
        this.e.a(this.y);
        this.e.m(this.y);
        this.e.t(this.aw);
        this.e.c(this.e.i(this.bk));
        this.e.c(this.at);
        this.e.b(this.am);
    }

    private void ac() {
        Paint paint = new Paint(1);
        this.cf = paint;
        paint.setColor(this.ag);
        Paint paint2 = new Paint(1);
        this.cc = paint2;
        paint2.setColor(this.ai);
        Paint paint3 = new Paint(1);
        this.k = paint3;
        paint3.setColor(this.av);
    }

    private void ad() {
        float paddingLeft = getPaddingLeft() + (((getWidth() - getPaddingRight()) - getScaledWidth()) / 2.0f) + this.az;
        this.e.e(paddingLeft);
        float f2 = paddingLeft - this.az;
        this.aj = new RectF(f2, this.at - (this.ba / 2.0f), getScaledWidth() + f2, this.at + (this.ba / 2.0f));
    }

    private boolean ae() {
        return this.aa == bfscp.COMMON;
    }

    private boolean af() {
        return getLayoutDirection() == 1;
    }

    private void ag() {
        if (this.ac == null) {
            g gVar = new g(this, null);
            this.ac = gVar;
            postDelayed(gVar, 300L);
        }
    }

    private boolean ah() {
        return (!this.o || this.ca || this.bv) ? false : true;
    }

    private void ai() {
        e eVar = this.ah;
        if (eVar != null) {
            removeCallbacks(eVar);
        }
    }

    private void aj() {
        String str;
        HwViewPager hwViewPager = this.f29404c;
        boolean z = false;
        int currentItem = hwViewPager != null ? hwViewPager.getCurrentItem() : 0;
        this.bk = currentItem;
        this.e.r(currentItem);
        if (this.o) {
            if (this.bl && g()) {
                z = true;
            }
            this.p = z;
            this.e.c(z);
            return;
        }
        if (g()) {
            str = this.bh + "/" + (this.bk + 1);
        } else {
            str = (this.bk + 1) + "/" + this.bh;
        }
        this.bj = str;
    }

    private void an() {
        xeo xeoVar = this.e;
        xeoVar.f(xeoVar.e(ae(), this.bk));
        xeo xeoVar2 = this.e;
        xeoVar2.j(xeoVar2.d(ae(), this.bk));
        this.e.h(this.at - (this.w / 2.0f));
        this.e.o(this.at + (this.w / 2.0f));
        this.e.b(false);
    }

    private int getDesiredWidth() {
        float f2 = this.az;
        int i2 = this.ad;
        int i3 = this.bh - 1;
        return (int) ((f2 * 2.0f) + (i2 * i3) + (this.u * i3) + this.ar);
    }

    private int getDistanceProper() {
        int i2;
        int i3;
        if (ae()) {
            i2 = this.ad;
            i3 = this.u;
        } else {
            i2 = this.af;
            i3 = this.w;
        }
        return i2 + i3;
    }

    private int getScaledWidth() {
        float f2 = this.az;
        int i2 = this.af;
        int i3 = this.bh - 1;
        return (int) ((f2 * 2.0f) + (i2 * i3) + (this.w * i3) + this.au);
    }

    private void l() {
        Handler handler = this.by;
        if (handler != null) {
            handler.removeCallbacks(this.as);
        }
        this.by = null;
    }

    private void setCurrentItemIndirect(int i2) {
        HwViewPager hwViewPager = this.f29404c;
        if (hwViewPager == null || hwViewPager.getAdapter() == null || this.f29404c.getAdapter().getCount() < 2 || i2 < 0 || i2 >= this.bh) {
            return;
        }
        this.f29404c.setCurrentItem(i2, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPageCount(int i2) {
        this.bh = i2;
        this.e.s(i2);
        this.i.e(this.bh);
        if (this.d) {
            a();
            return;
        }
        o();
        requestLayout();
        invalidate();
    }

    private void settleToTarget(int i2) {
        this.s.e(this.bi);
        this.s.b(this.bi);
        this.s.d(true);
        setCurrentItemIndirect(i2);
        if (isHapticFeedbackEnabled()) {
            xei.c(this, 7, 0);
        }
        b(1.0f, 3, i2);
    }

    private void v() {
        this.by = new Handler();
    }

    private void w() {
        if (this.aq == null) {
            return;
        }
        if (this.ak == null) {
            this.ak = new RectF();
        }
        int i2 = this.bk;
        if (i2 == this.bh - 1) {
            this.ak = new RectF();
            return;
        }
        this.ak.left = this.p ? this.aq.left : this.e.c(i2) + (this.ad / 2.0f);
        RectF rectF = this.ak;
        RectF rectF2 = this.aq;
        rectF.top = rectF2.top;
        rectF.right = this.p ? this.e.c(this.bk) - (this.ad / 2.0f) : rectF2.right;
        this.ak.bottom = this.aq.bottom;
    }

    private xeo y() {
        xeo xeoVarI = this.e.i();
        xeoVarI.a(this.y);
        xeoVarI.t(this.aw);
        xeoVarI.c(this.e.i(this.bk));
        xeoVarI.c(this.e.f());
        xeoVarI.b(this.am);
        xeoVarI.h(this.at - this.y);
        xeoVarI.f(this.e.j(this.bk));
        xeoVarI.j(this.e.c(this.bk));
        xeoVarI.o(this.at + this.y);
        return xeoVarI;
    }

    private xeo z() {
        xeo xeoVarI = this.e.i();
        xeoVarI.a(this.w / 2.0f);
        xeoVarI.t(this.av);
        xeoVarI.c(this.e.o(this.bk));
        xeoVarI.c(this.e.f());
        xeoVarI.b(this.aj);
        xeoVarI.h(this.at - (this.w / 2.0f));
        xeoVarI.o(this.at + (this.w / 2.0f));
        xeoVarI.f(this.e.g(this.bk));
        xeoVarI.j(this.e.f(this.bk));
        return xeoVarI;
    }

    protected void a() {
        Log.i("HwDotsPageIndicator", "initWatchOptions");
    }

    @Override // com.huawei.uikit.hwdotspageindicator.widget.bzrwd
    public /* bridge */ /* synthetic */ void a(float f2, float f3, HwDotsPageIndicatorAnimation.AnimationUpdateListener animationUpdateListener, HwDotsPageIndicatorAnimation.AnimationStateListener animationStateListener) {
        super.a(f2, f3, animationUpdateListener, animationStateListener);
    }

    @Override // com.huawei.uikit.hwdotspageindicator.widget.bzrwd
    public /* bridge */ /* synthetic */ void a(int i2, float f2, HwDotsPageIndicatorAnimation.AnimationUpdateListener animationUpdateListener) {
        super.a(i2, f2, animationUpdateListener);
    }

    @Override // com.huawei.uikit.hwdotspageindicator.widget.bzrwd
    public /* bridge */ /* synthetic */ void a(boolean z, xeo xeoVar, View view, HwDotsPageIndicatorAnimation.AnimationUpdateListener animationUpdateListener) {
        super.a(z, xeoVar, view, animationUpdateListener);
    }

    public void b(int i2) {
        this.bv = true;
        this.bz = false;
        this.bn = i2;
        if (this.by == null) {
            v();
        }
        this.by.removeCallbacks(this.as);
        this.by.postDelayed(this.as, i2);
    }

    protected boolean b() {
        return this.cg;
    }

    @Override // com.huawei.uikit.hwdotspageindicator.widget.bzrwd
    public /* bridge */ /* synthetic */ void c(RectF rectF, HwDotsPageIndicatorAnimation.AnimationUpdateListener animationUpdateListener) {
        super.c(rectF, animationUpdateListener);
    }

    @Override // com.huawei.uikit.hwdotspageindicator.widget.bzrwd
    public /* bridge */ /* synthetic */ void c(String str) {
        super.c(str);
    }

    @Override // com.huawei.uikit.hwdotspageindicator.widget.bzrwd
    public /* bridge */ /* synthetic */ void c(float[] fArr, HwDotsPageIndicatorAnimation.AnimationUpdateListener animationUpdateListener) {
        super.c(fArr, animationUpdateListener);
    }

    public boolean c() {
        return this.cb;
    }

    public void d() {
        this.bv = false;
        l();
    }

    @Override // com.huawei.uikit.hwdotspageindicator.widget.bzrwd
    public /* bridge */ /* synthetic */ void d(float f2, float f3, HwDotsPageIndicatorAnimation.AnimationUpdateListener animationUpdateListener, HwDotsPageIndicatorAnimation.AnimationStateListener animationStateListener) {
        super.d(f2, f3, animationUpdateListener, animationStateListener);
    }

    public void d(Canvas canvas, int i2) {
        if (this.k == null || this.e.w() == null) {
            return;
        }
        float f2 = (this.e.w().bottom - this.e.w().top) / 2.0f;
        this.k.setColor(i2);
        canvas.drawRoundRect(this.e.w(), f2, f2, this.k);
    }

    @Override // com.huawei.uikit.hwdotspageindicator.widget.bzrwd
    public /* bridge */ /* synthetic */ void d(RectF rectF, HwDotsPageIndicatorAnimation.AnimationUpdateListener animationUpdateListener) {
        super.d(rectF, animationUpdateListener);
    }

    @Override // com.huawei.uikit.hwdotspageindicator.widget.bzrwd
    public /* bridge */ /* synthetic */ void d(bzrwd.d dVar, HwDotsPageIndicatorAnimation.AnimationUpdateListener animationUpdateListener) {
        super.d(dVar, animationUpdateListener);
    }

    @Override // com.huawei.uikit.hwdotspageindicator.widget.bzrwd
    public /* bridge */ /* synthetic */ void d(xeo xeoVar, boolean z, HwDotsPageIndicatorAnimation.AnimationUpdateListener animationUpdateListener, HwDotsPageIndicatorAnimation.AnimationStateListener animationStateListener) {
        super.d(xeoVar, z, animationUpdateListener, animationStateListener);
    }

    protected void d(boolean z) {
        HwDotsPageIndicatorInteractor.OnMouseOperationListener onMouseOperationListener;
        HwDotsPageIndicatorInteractor.OnMouseOperationListener onMouseOperationListener2;
        HwDotsPageIndicatorInteractor.OnGestureListener onGestureListener;
        xeo xeoVarZ = z();
        if (!this.ca) {
            this.e = xeoVarZ;
            invalidate();
            this.aa = bfscp.VISIBLE;
            this.s.e(this.bi);
            if (z && (onGestureListener = this.v) != null) {
                onGestureListener.onLongPress(2);
            }
            if (z || (onMouseOperationListener2 = this.x) == null) {
                return;
            }
            onMouseOperationListener2.onMoveInHotZone(2);
            return;
        }
        HwDotsPageIndicatorAnimation hwDotsPageIndicatorAnimation = this.f29450a;
        if (hwDotsPageIndicatorAnimation == null || hwDotsPageIndicatorAnimation.g()) {
            return;
        }
        this.f29450a.m();
        j();
        j jVar = new j(z);
        if (!z && (onMouseOperationListener = this.x) != null) {
            onMouseOperationListener.onMoveInHotZone(1);
        }
        d(xeoVarZ, z, this, jVar);
        this.aa = bfscp.VISIBLE;
    }

    @Override // com.huawei.uikit.hwdotspageindicator.widget.bzrwd
    public /* bridge */ /* synthetic */ void e(float f2, float f3, HwDotsPageIndicatorAnimation.AnimationUpdateListener animationUpdateListener) {
        super.e(f2, f3, animationUpdateListener);
    }

    @Override // com.huawei.uikit.hwdotspageindicator.widget.bzrwd
    public /* bridge */ /* synthetic */ void e(int i2, View view, HwDotsPageIndicatorAnimation.AnimationUpdateListener animationUpdateListener) {
        super.e(i2, view, animationUpdateListener);
    }

    public void e(Canvas canvas, RectF rectF) {
        Paint paint = new Paint(1);
        paint.setStrokeWidth(this.ap);
        paint.setColor(this.ao);
        paint.setStyle(Paint.Style.STROKE);
        RectF rectF2 = new RectF();
        if (!this.o) {
            float fMeasureText = this.n.measureText(this.bj);
            rectF2.left = ((getWidth() - fMeasureText) / 2.0f) - this.bg;
            rectF2.top = this.ap / 2.0f;
            rectF2.right = ((getWidth() + fMeasureText) / 2.0f) + this.bg;
            rectF2.bottom = getHeight() - (this.ap / 2.0f);
            float height = (getHeight() - this.ap) / 2.0f;
            canvas.drawRoundRect(rectF2, height, height, paint);
            return;
        }
        RectF rectF3 = this.aq;
        if (rectF3 != null) {
            if (rectF == null) {
                rectF = rectF3;
            }
            float f2 = rectF.left;
            float f3 = this.ap;
            float f4 = f3 / 2.0f;
            rectF2.left = f2 + f4;
            rectF2.top = rectF.top + f4;
            rectF2.right = rectF.right - f4;
            rectF2.bottom = rectF.bottom - f4;
            float f5 = (this.ba - f3) / 2.0f;
            canvas.drawRoundRect(rectF2, f5, f5, paint);
        }
    }

    protected void e(boolean z) {
        xeo xeoVarY = y();
        if (!this.ca) {
            this.e = xeoVarY;
            invalidate();
            this.aa = bfscp.COMMON;
            this.m = 0;
            this.e.q(-1);
            this.e.g();
            return;
        }
        HwDotsPageIndicatorAnimation hwDotsPageIndicatorAnimation = this.f29450a;
        if (hwDotsPageIndicatorAnimation == null || hwDotsPageIndicatorAnimation.b()) {
            return;
        }
        this.f29450a.l();
        j();
        a(z, xeoVarY, this, this);
        this.aa = bfscp.COMMON;
        this.m = 0;
    }

    @Override // com.huawei.uikit.hwdotspageindicator.widget.bzrwd
    public /* bridge */ /* synthetic */ boolean e() {
        return super.e();
    }

    protected void f() {
        int i2 = this.bk;
        if (i2 == this.bh - 1) {
            if (this.f29404c.isSupportLoop()) {
                b(0, false);
                b(this.bk, 0);
                return;
            }
            return;
        }
        b(i2, i2 + 1);
        if (this.o && this.ca) {
            b(true);
        } else {
            this.f29404c.nextPage();
        }
    }

    protected boolean g() {
        String language = Locale.getDefault().getLanguage();
        return (language.contains("ar") || language.contains("fa") || language.contains("iw")) || (language.contains("ug") || language.contains(Constants.URDU_LANG)) || af();
    }

    @Override // com.huawei.uikit.hwdotspageindicator.widget.bzrwd
    public TimeInterpolator getAccelerateInterpolator() {
        return super.getAccelerateInterpolator();
    }

    @Override // com.huawei.uikit.hwdotspageindicator.widget.bzrwd
    public TimeInterpolator getAlphaInterpolator() {
        return super.getAlphaInterpolator();
    }

    protected int getBgFocusSelectedDotColor() {
        return this.an;
    }

    protected int getBgFocusUnSelectedDotColor() {
        return this.al;
    }

    public int getCurrentBgColor() {
        return this.e.ad();
    }

    @Override // com.huawei.uikit.hwdotspageindicator.widget.bzrwd
    public TimeInterpolator getDecelerateInterpolator() {
        return super.getDecelerateInterpolator();
    }

    protected int getDesiredHeight() {
        return this.ba;
    }

    public int getDotColor() {
        return this.ag;
    }

    public int getFocusBoxColor() {
        return this.ao;
    }

    public int getFocusDotColor() {
        return this.ai;
    }

    protected RectF getHotZoneRectF() {
        return this.e.w();
    }

    @Override // com.huawei.uikit.hwdotspageindicator.widget.bzrwd
    public /* bridge */ /* synthetic */ float getMaxDiffFraction() {
        return super.getMaxDiffFraction();
    }

    @Override // com.huawei.uikit.hwdotspageindicator.widget.bzrwd
    public /* bridge */ /* synthetic */ TimeInterpolator getNavigationPointInterpolator() {
        return super.getNavigationPointInterpolator();
    }

    public int getNumTextColor() {
        return this.bb;
    }

    public int getPressedStateColor() {
        return this.av;
    }

    @Override // com.huawei.uikit.hwdotspageindicator.widget.bzrwd
    public TimeInterpolator getScaleInterpolator() {
        return super.getScaleInterpolator();
    }

    protected int getStartBgColor() {
        return this.aw;
    }

    @Override // com.huawei.uikit.hwdotspageindicator.widget.bzrwd
    public /* bridge */ /* synthetic */ TimeInterpolator getWatchAccelerateInterpolator() {
        return super.getWatchAccelerateInterpolator();
    }

    @Override // com.huawei.uikit.hwdotspageindicator.widget.bzrwd
    public /* bridge */ /* synthetic */ TimeInterpolator getWatchDecelerateInterpolator() {
        return super.getWatchDecelerateInterpolator();
    }

    @Override // com.huawei.uikit.hwdotspageindicator.widget.bzrwd
    public /* bridge */ /* synthetic */ TimeInterpolator getWatchDotTouchAndSlideInterpolator() {
        return super.getWatchDotTouchAndSlideInterpolator();
    }

    @Override // com.huawei.uikit.hwdotspageindicator.widget.bzrwd
    public /* bridge */ /* synthetic */ TimeInterpolator getWatchTouchFocusAccelerateInterpolator() {
        return super.getWatchTouchFocusAccelerateInterpolator();
    }

    @Override // com.huawei.uikit.hwdotspageindicator.widget.bzrwd
    public /* bridge */ /* synthetic */ TimeInterpolator getWatchTouchFocusDecelerateInterpolator() {
        return super.getWatchTouchFocusDecelerateInterpolator();
    }

    protected void h() {
        int i2 = this.bk;
        if (i2 == 0) {
            if (this.f29404c.isSupportLoop()) {
                b(this.bh - 1, false);
                b(this.bk, this.bh - 1);
                return;
            }
            return;
        }
        b(i2, i2 - 1);
        if (this.o && this.ca) {
            b(false);
        } else {
            this.f29404c.prePage();
        }
    }

    @Override // com.huawei.uikit.hwdotspageindicator.widget.bzrwd
    public /* bridge */ /* synthetic */ boolean i() {
        return super.i();
    }

    @Override // com.huawei.uikit.hwdotspageindicator.widget.bzrwd
    public /* bridge */ /* synthetic */ void j() {
        super.j();
    }

    @Override // com.huawei.uikit.hwdotspageindicator.widget.HwDotsPageIndicatorAnimation.AnimationUpdateListener
    public void onAnimationUpdate(xeo xeoVar) {
        if (xeoVar == null) {
            return;
        }
        this.e.b(xeoVar.w());
        this.e.t(xeoVar.ad());
        this.e.c(xeoVar.j());
        this.e.a(xeoVar.m());
        this.e.a(xeoVar.r());
        invalidate();
    }

    @Override // android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.bu = true;
        this.bm = true;
        if (this.bv) {
            b(this.bn);
        }
        if (this.l) {
            this.bt = hasFocus();
            boolean zHasWindowFocus = hasWindowFocus();
            this.bw = zHasWindowFocus;
            setIndicatorFocusChanged(this.bt && zHasWindowFocus);
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (this.o && !this.bv && this.bz) {
            if ((e() && i()) || this.aa != bfscp.MOUSE_ON_DOT || this.e.c() == -1) {
                return;
            }
            HwDotsPageIndicatorInteractor.OnMouseOperationListener onMouseOperationListener = this.x;
            if (onMouseOperationListener != null) {
                onMouseOperationListener.onDotClick(this.bk, this.e.c());
            }
            b(this.e.c(), true);
            a(this.e.c());
            this.e.q(-1);
        }
    }

    @Override // android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.bm = false;
        if (this.bv) {
            l();
        }
    }

    @Override // com.huawei.uikit.hwdotspageindicator.widget.HwDotsPageIndicatorAnimation.AnimationUpdateListener
    public void onDotCenterChanged(float[] fArr) {
        this.e.c(fArr);
        invalidate();
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        if (canvas == null || this.bh <= 0) {
            return;
        }
        if (!this.o) {
            a(canvas);
        } else {
            e(canvas);
            c(canvas);
        }
    }

    @Override // android.view.View
    protected void onFocusChanged(boolean z, int i2, Rect rect) {
        super.onFocusChanged(z, i2, rect);
        if (this.l) {
            if (!z || this.aa == bfscp.COMMON) {
                if (c(z, this.bw)) {
                    setIndicatorFocusChanged(z);
                }
                this.bt = z;
                invalidate();
            }
        }
    }

    @Override // com.huawei.uikit.hwdotspageindicator.widget.HwDotsPageIndicatorAnimation.AnimationUpdateListener
    public void onFocusDotChanged(boolean z, float f2) {
        if (z) {
            if (this.bq) {
                this.e.j(f2);
            } else {
                this.e.f(f2);
            }
        } else if (this.bq) {
            if (!i()) {
                this.e.f(f2);
            }
        } else if (!i()) {
            this.e.j(f2);
        }
        invalidate();
    }

    @Override // com.huawei.uikit.hwdotspageindicator.widget.HwDotsPageIndicatorAnimation.AnimationUpdateListener
    public void onFocusSingleScaled(RectF rectF) {
        if (rectF == null) {
            return;
        }
        this.e.f(this.p ? rectF.right : rectF.left);
        this.e.j(this.p ? rectF.left : rectF.right);
        this.e.h(rectF.top);
        this.e.o(rectF.bottom);
        invalidate();
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        if (motionEvent == null) {
            return false;
        }
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        if (!c(motionEvent.getAction(), x, y)) {
            return super.onHoverEvent(motionEvent);
        }
        if (this.aa != bfscp.COMMON) {
            a(x, y);
            return super.onHoverEvent(motionEvent);
        }
        if (this.br) {
            ai();
            d(false);
        }
        return super.onHoverEvent(motionEvent);
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        if (accessibilityNodeInfo != null) {
            super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
            accessibilityNodeInfo.setClickable(false);
            accessibilityNodeInfo.removeAction(AccessibilityNodeInfo.AccessibilityAction.ACTION_CLICK);
            Resources resources = getContext().getResources();
            int i2 = R.plurals.page_progress;
            int i3 = this.bk + 1;
            String quantityString = resources.getQuantityString(i2, i3, Integer.valueOf(i3));
            Resources resources2 = getContext().getResources();
            int i4 = R.plurals.total_page;
            int i5 = this.bh;
            String quantityString2 = resources2.getQuantityString(i4, i5, Integer.valueOf(i5));
            accessibilityNodeInfo.setContentDescription(String.format(Locale.ROOT, getContext().getString(R.string.page), quantityString, quantityString2));
        }
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i2, KeyEvent keyEvent) {
        if (keyEvent == null) {
            return false;
        }
        if (!this.bz && this.o) {
            return false;
        }
        if (this.bh <= 1 || !this.cb || (i2 != 21 && i2 != 22)) {
            return super.onKeyDown(i2, keyEvent);
        }
        if (!(i2 == 21 && this.p) && (i2 != 22 || this.p)) {
            h();
        } else {
            f();
        }
        return true;
    }

    @Override // android.view.View
    protected void onLayout(boolean z, int i2, int i3, int i4, int i5) {
        if (z || this.t) {
            o();
            this.t = false;
        }
        this.bu = false;
    }

    @Override // android.view.View
    protected void onMeasure(int i2, int i3) {
        Pair<Integer, Integer> pairA = xep.a(i2, i3, this.o ? xep.e(this.bh, getScaledWidth()) : View.MeasureSpec.getSize(i2), getDesiredHeight());
        setMeasuredDimension(((Integer) pairA.first).intValue(), ((Integer) pairA.second).intValue());
    }

    @Override // com.huawei.uikit.hwviewpager.widget.HwViewPager.OnPageChangeListener
    public void onPageScrollStateChanged(int i2) {
        HwViewPager.OnPageChangeListener onPageChangeListener = this.bx;
        if (onPageChangeListener != null) {
            onPageChangeListener.onPageScrollStateChanged(i2);
        }
        d(i2);
        this.m = i2;
        boolean z = true;
        if (i2 == 1 && this.aa == bfscp.COMMON) {
            j();
            HwDotsPageIndicatorAnimation hwDotsPageIndicatorAnimation = this.f29450a;
            if (hwDotsPageIndicatorAnimation != null && (hwDotsPageIndicatorAnimation.d() || this.f29450a.c())) {
                this.f29450a.f();
                this.f29450a.j();
                this.z = awsks.DEFAULT;
            }
        }
        if (this.m != 0) {
            k();
        }
        if (this.m == 0) {
            HwDotsPageIndicatorAnimation hwDotsPageIndicatorAnimation2 = this.f29450a;
            if (hwDotsPageIndicatorAnimation2 == null || (!hwDotsPageIndicatorAnimation2.g() && !this.f29450a.b())) {
                z = false;
            }
            if (!e() && !z) {
                boolean zB = this.e.b(ae(), this.bk, this.e.s(), this.e.p());
                if (this.o && !zB) {
                    j();
                    xeo xeoVar = this.e;
                    xeoVar.f(xeoVar.e(ae(), this.bk));
                    xeo xeoVar2 = this.e;
                    xeoVar2.j(xeoVar2.d(ae(), this.bk));
                    invalidate();
                }
            }
            this.z = awsks.DEFAULT;
            this.e.r(this.bk);
            if (!this.o || z) {
                return;
            }
            a(ae());
        }
    }

    @Override // com.huawei.uikit.hwviewpager.widget.HwViewPager.OnPageChangeListener
    public void onPageScrolled(int i2, float f2, int i3) {
        HwViewPager.OnPageChangeListener onPageChangeListener = this.bx;
        if (onPageChangeListener != null) {
            onPageChangeListener.onPageScrolled(i2, f2, i3);
        }
        if (this.m == 1) {
            this.bo = i2 == this.bk;
        }
        if (b(i2, f2)) {
            c(i2, f2);
        }
    }

    @Override // com.huawei.uikit.hwviewpager.widget.HwViewPager.OnPageChangeListener
    public void onPageSelected(int i2) {
        HwViewPager.OnPageChangeListener onPageChangeListener = this.bx;
        if (onPageChangeListener != null) {
            onPageChangeListener.onPageSelected(i2);
        }
        if (!this.bm) {
            aj();
            return;
        }
        if (!this.o || !this.ca) {
            setSelectedPage(i2);
            return;
        }
        xep.b(this.z == awsks.DEFAULT);
        if (xep.m()) {
            j();
            setSelectedPage(i2);
            ab();
            invalidate();
            return;
        }
        if ((this.bv ? e(i2) : h(i2)) && !this.cb) {
            HwDotsPageIndicatorAnimation hwDotsPageIndicatorAnimation = this.f29450a;
            if (hwDotsPageIndicatorAnimation != null) {
                hwDotsPageIndicatorAnimation.f();
                this.f29450a.j();
                j();
            }
            b(i2, false);
        }
        setSelectedPage(i2);
    }

    @Override // com.huawei.uikit.hwdotspageindicator.widget.HwDotsPageIndicatorAnimation.AnimationUpdateListener
    public void onSingleScaled(boolean z, int i2, float f2) {
        if (z) {
            this.e.m(f2);
        }
        this.e.b(i2, f2);
        invalidate();
    }

    @Override // android.view.View
    protected void onSizeChanged(int i2, int i3, int i4, int i5) {
        setMeasuredDimension(i2, i3);
        o();
        if (i2 == i4 && i3 == i5) {
            return;
        }
        this.bu = true;
    }

    @Override // com.huawei.uikit.hwdotspageindicator.widget.HwDotsPageIndicatorAnimation.AnimationUpdateListener
    public void onSpringAnimationUpdate(boolean z, float f2) {
        if (this.m == 1 || xep.m()) {
            return;
        }
        if (z) {
            this.e.f(f2);
        } else {
            this.e.j(f2);
        }
        invalidate();
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent == null) {
            return false;
        }
        if (!this.o || this.bh == 0 || this.bv || !this.bz) {
            return super.onTouchEvent(motionEvent);
        }
        int actionIndex = motionEvent.getActionIndex();
        float x = motionEvent.getX(actionIndex);
        float y = motionEvent.getY(actionIndex);
        int action = motionEvent.getAction() & 255;
        if (this.aa == bfscp.MOUSE_ON_DOT) {
            ai();
            ag();
            return super.onTouchEvent(motionEvent);
        }
        if (action == 0 || action == 5) {
            p();
            if (this.bp == 0) {
                this.bp = SystemClock.uptimeMillis();
            }
            this.bi = x;
        } else if (action == 1 || action == 6) {
            if (SystemClock.uptimeMillis() - this.bp < 300) {
                d(x, y);
            }
            x();
        } else if (action == 2) {
            a(x);
            this.bi = x;
        } else {
            if (action != 3) {
                return super.onTouchEvent(motionEvent);
            }
            x();
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        if (this.l) {
            if (c(this.bt, z)) {
                setIndicatorFocusChanged(z);
            }
            this.bw = z;
            invalidate();
        }
    }

    @Override // com.huawei.uikit.hwdotspageindicator.widget.bzrwd
    public void setAlphaInterpolator(TimeInterpolator timeInterpolator) {
        super.setAlphaInterpolator(timeInterpolator);
    }

    public void setAnimationEnable(boolean z) {
        this.ca = z;
        if (z && this.f29450a == null) {
            this.f29450a = new HwDotsPageIndicatorAnimation();
        }
    }

    public void setDotColor(int i2) {
        c("setDotColor");
        if (this.ag != i2) {
            this.ag = i2;
            Paint paint = this.cf;
            if (paint == null || !this.o) {
                return;
            }
            paint.setColor(i2);
            invalidate();
        }
    }

    @Override // com.huawei.uikit.hwdotspageindicator.widget.bzrwd
    public void setDragAccelerateInterpolator(TimeInterpolator timeInterpolator) {
        super.setDragAccelerateInterpolator(timeInterpolator);
    }

    @Override // com.huawei.uikit.hwdotspageindicator.widget.bzrwd
    public void setDragDecelerateInterpolator(TimeInterpolator timeInterpolator) {
        super.setDragDecelerateInterpolator(timeInterpolator);
    }

    public void setFocusBoxColor(int i2) {
        this.ao = i2;
    }

    protected void setFocusConfirm(boolean z) {
        this.cg = z;
    }

    public void setFocusDotColor(int i2) {
        c("setFocusDotColor");
        if (this.ai != i2) {
            this.ai = i2;
            Paint paint = this.cc;
            if (paint == null || !this.o) {
                return;
            }
            paint.setColor(i2);
            invalidate();
        }
    }

    public void setGestureEnable(boolean z) {
        if (this.bv) {
            return;
        }
        this.bz = z;
    }

    protected void setIndicatorFocusChanged(boolean z) {
        this.cb = z;
    }

    public void setNumTextColor(int i2) {
        c("setNumTextColor");
        if (this.bb != i2) {
            this.bb = i2;
            Paint paint = this.n;
            if (paint == null || this.o) {
                return;
            }
            paint.setColor(i2);
            invalidate();
        }
    }

    public void setOnIndicatorClickListener(HwDotsPageIndicatorInteractor.OnClickListener onClickListener) {
        this.r = onClickListener;
    }

    public void setOnIndicatorGestureListener(HwDotsPageIndicatorInteractor.OnGestureListener onGestureListener) {
        this.v = onGestureListener;
    }

    public void setOnIndicatorMouseOperatorListener(HwDotsPageIndicatorInteractor.OnMouseOperationListener onMouseOperationListener) {
        this.x = onMouseOperationListener;
    }

    public void setOnPageChangeListener(HwViewPager.OnPageChangeListener onPageChangeListener) {
        this.bx = onPageChangeListener;
    }

    public void setPressedStateColor(int i2) {
        c("setPressedStateColor");
        this.av = i2;
        if (ae() || !this.o) {
            return;
        }
        this.e.t(this.av);
        invalidate();
    }

    public void setRtlEnable(boolean z) {
        this.bl = z;
        invalidate();
    }

    @Override // com.huawei.uikit.hwdotspageindicator.widget.bzrwd
    public void setScaleInterpolator(TimeInterpolator timeInterpolator) {
        super.setScaleInterpolator(timeInterpolator);
    }

    public void setSelectedPage(int i2) {
        if (i2 == this.bk || this.bh == 0) {
            return;
        }
        aj();
        if (ah()) {
            if (ae()) {
                ab();
            } else {
                this.e.c(this.e.c(false, this.bk));
                xeo xeoVar = this.e;
                xeoVar.f(xeoVar.g(this.bk));
                xeo xeoVar2 = this.e;
                xeoVar2.j(xeoVar2.f(this.bk));
            }
        }
        invalidate();
    }

    public void setShowAsDot(boolean z) {
        c("setShowAsDot");
        if (this.o == z) {
            return;
        }
        this.o = z;
        this.t = true;
        requestLayout();
    }

    @Override // com.huawei.uikit.hwdotspageindicator.widget.bzrwd
    public void setSpringAnimationDamping(float f2) {
        super.setSpringAnimationDamping(f2);
    }

    @Override // com.huawei.uikit.hwdotspageindicator.widget.bzrwd
    public void setSpringAnimationStiffness(float f2) {
        super.setSpringAnimationStiffness(f2);
    }

    public void setViewPager(HwViewPager hwViewPager) {
        if (hwViewPager == null || hwViewPager.getAdapter() == null) {
            return;
        }
        this.f29404c = hwViewPager;
        setPageCount(hwViewPager.getAdapter().getCount());
        hwViewPager.getAdapter().registerDataSetObserver(new b());
        hwViewPager.addOnPageChangeListener(this);
        aj();
    }

    public HwDotsPageIndicator(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.hwDotsPageIndicatorStyle);
    }

    private void a(Context context, AttributeSet attributeSet, int i2) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.HwDotsPageIndicator, i2, 0);
        this.w = typedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.HwDotsPageIndicator_hwUnSelectedScaleDiameter, R.dimen.hwdotspageindicator_unselected_zoom_in_diameter);
        this.ab = typedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.HwDotsPageIndicator_hwUnSelectedSecondScaleDiameter, R.dimen.hwdotspageindicator_unselected_zoom_in_second_diameter);
        this.u = typedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.HwDotsPageIndicator_hwUnSelectedDiameter, R.dimen.hwdotspageindicator_unselected_diameter);
        this.ad = typedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.HwDotsPageIndicator_hwDotGap, R.dimen.hwdotspageindicator_default_gap);
        this.af = typedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.HwDotsPageIndicator_hwDotScaleGap, R.dimen.hwdotspageindicator_zoom_in_gap);
        this.ar = typedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.HwDotsPageIndicator_hwSelectedLength, R.dimen.hwdotspageindicator_selected_width);
        this.ba = typedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.HwDotsPageIndicator_hwTotalHeight, R.dimen.hwdotspageindicator_total_height);
        this.au = typedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.HwDotsPageIndicator_hwSelectedScaleLength, R.dimen.hwdotspageindicator_selected_zoom_in_length);
        this.ap = typedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.HwDotsPageIndicator_hwFocusBoxWidth, R.dimen.hwdotspageindicator_focus_box_width);
        this.ax = typedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.HwDotsPageIndicator_hwHotZoneHeight, R.dimen.hwdotspageindicator_default_zone_height);
        this.az = typedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.HwDotsPageIndicator_hwMarginStartAndEnd, R.dimen.hwdotspageindicator_margin_start_end);
        this.bc = typedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.HwDotsPageIndicator_hwHotZoneMarginStartAndEnd, R.dimen.hwdotspageindicator_hot_zone_margin_start_end);
        typedArrayObtainStyledAttributes.recycle();
        Resources resources = getResources();
        float dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.hwdotspageindicator_touch_move_response_length);
        float dimensionPixelOffset = resources.getDimensionPixelOffset(R.dimen.hwdotspageindicator_touch_move_valid_length);
        float dimensionPixelOffset2 = resources.getDimensionPixelOffset(R.dimen.hwdotspageindicator_touch_bottom_max_scale_distance);
        this.s.a(dimensionPixelSize);
        this.s.c(dimensionPixelOffset);
        this.s.d(dimensionPixelOffset2);
        this.e.a(this.u / 2.0f);
        this.e.n(this.ad);
        this.e.p(this.af);
        this.e.i(this.ar);
        this.e.g(this.au);
        this.e.d(this.w);
        this.y = this.u / 2.0f;
        ac();
    }

    private void c(int i2, float f2, int i3) {
        if (this.bo) {
            a(i2, f2, i3);
            return;
        }
        float fD = this.e.d(ae(), this.bk);
        float f3 = 1.0f - f2;
        this.e.j(this.p ? fD + (e(f3) * i3) : fD - (e(f3) * i3));
        float fS = this.e.s();
        float fE = this.e.e(ae(), i2 + 1);
        if (i()) {
            return;
        }
        this.bq = true;
        b(true, fS, fE, this.h, this.f29451b);
    }

    private void c(Context context, AttributeSet attributeSet, int i2) {
        d(context, attributeSet, i2);
        boolean z = xft.d(context) == 8;
        this.d = z;
        if (this.bv) {
            this.bz = false;
        }
        if (!this.o) {
            this.bz = false;
            this.ca = false;
        }
        if (this.ca) {
            if (z) {
                this.g = new HwWatchDotsPageIndicatorAnimation();
            } else {
                this.f29450a = new HwDotsPageIndicatorAnimation();
            }
        }
        if (isInEditMode()) {
            this.bh = 3;
            this.e.s(3);
            this.i.e(this.bh);
        }
        a(context, attributeSet, i2);
        e(context, attributeSet, i2);
        if (this.bv) {
            v();
        }
        setOnClickListener(this);
    }

    private void e(Context context, AttributeSet attributeSet, int i2) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.HwDotsPageIndicator, i2, 0);
        this.bd = typedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.HwDotsPageIndicator_hwTextFont, R.dimen.emui_text_size_body2);
        this.bg = typedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.HwDotsPageIndicator_hwHotZoneNumMargin, R.dimen.hwdotspageindocator_hot_zone_num_margin);
        this.ap = typedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.HwDotsPageIndicator_hwFocusBoxWidth, R.dimen.hwdotspageindicator_focus_box_width);
        typedArrayObtainStyledAttributes.recycle();
        Paint paint = new Paint(1);
        this.n = paint;
        paint.setTextSize(this.bd);
        this.n.setColor(this.bb);
        this.n.setTextAlign(Paint.Align.CENTER);
        this.n.setTypeface(Typeface.create(getResources().getString(R.string.emui_text_font_family_regular), 0));
        this.q = this.n.getFontMetrics();
    }

    private void h(int i2, float f2, int i3) {
        if (!this.bo) {
            e(i2, f2, i3);
            return;
        }
        float fE = this.e.e(ae(), i2);
        this.e.f(this.p ? fE - (e(f2) * i3) : fE + (e(f2) * i3));
        float fP = this.e.p();
        float fD = this.e.d(ae(), i2);
        if (i()) {
            return;
        }
        this.bq = false;
        b(false, fP, fD, this.h, this.f29451b);
    }

    private void p() {
        HwDotsPageIndicatorInteractor.OnGestureListener onGestureListener;
        if (!this.bz || (onGestureListener = this.v) == null || this.cb) {
            return;
        }
        onGestureListener.onLongPress(0);
        ag();
    }

    private void q() {
        if (!this.bz || this.f29450a == null || !this.e.e() || this.f29450a.g() || this.f29450a.e()) {
            return;
        }
        this.f29450a.i();
        float fQ = this.w - (this.e.q() - this.e.t());
        if (this.ca) {
            float f2 = fQ / 2.0f;
            d(new RectF(this.e.s() - fQ, this.e.t() - f2, this.e.p() + fQ, this.e.q() + f2), this);
            this.aa = bfscp.VISIBLE;
            return;
        }
        xeo xeoVar = this.e;
        float f3 = fQ / 2.0f;
        xeoVar.h(xeoVar.t() - f3);
        xeo xeoVar2 = this.e;
        xeoVar2.o(xeoVar2.q() + f3);
        float fS = this.e.s();
        float fP = this.e.p();
        this.e.f(this.p ? fS + fQ : fS - fQ);
        this.e.j(this.p ? fP - fQ : fP + fQ);
        this.aa = bfscp.VISIBLE;
        this.e.b(false);
        invalidate();
    }

    private void s() {
        if (!this.bz || this.v == null) {
            return;
        }
        g gVar = this.ac;
        if (gVar != null) {
            removeCallbacks(gVar);
            this.ac = null;
        }
        if (ae()) {
            return;
        }
        e(true);
        if (this.z == awsks.SLIDE) {
            this.z = awsks.DEFAULT;
        }
        this.s.e(0.0f);
    }

    private void u() {
        int paddingLeft = getPaddingLeft();
        int width = getWidth();
        int paddingRight = getPaddingRight();
        float desiredWidth = getDesiredWidth();
        float f2 = paddingLeft + (((width - paddingRight) - desiredWidth) / 2.0f) + this.az;
        float f3 = this.ba / 2.0f;
        this.at = f3;
        this.e.c(f3);
        this.e.b(f2);
        float f4 = f2 - this.az;
        float f5 = this.at;
        float f6 = this.ax / 2.0f;
        float f7 = desiredWidth + f4;
        this.am = new RectF(f4, f5 - f6, f7, f5 + f6);
        float f8 = this.bc - this.az;
        float f9 = this.at;
        float f10 = this.ba / 2.0f;
        this.aq = new RectF(f4 - f8, f9 - f10, f7 + f8, f9 + f10);
    }

    private void x() {
        this.bp = 0L;
        this.s.d(true);
        s();
    }

    public HwDotsPageIndicator(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.bn = 5000;
        this.bu = true;
        this.m = 0;
        this.p = false;
        this.bl = true;
        this.bp = 0L;
        this.br = false;
        this.bo = false;
        this.bq = true;
        this.bs = false;
        this.s = new xep.c();
        this.aa = bfscp.COMMON;
        this.z = awsks.DEFAULT;
        this.as = new f();
        c(super.getContext(), attributeSet, i2);
        setOnClickListener(this);
        setFocusable(true);
        setDefaultFocusHighlightEnabled(false);
    }

    private void d(Context context, AttributeSet attributeSet, int i2) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.HwDotsPageIndicator, i2, 0);
        this.bv = typedArrayObtainStyledAttributes.getBoolean(R.styleable.HwDotsPageIndicator_hwIsAutoPlay, false);
        this.ag = typedArrayObtainStyledAttributes.getColor(R.styleable.HwDotsPageIndicator_hwUnselectedDotColor, ContextCompat.getColor(getContext(), R.color.emui_control_normal));
        this.ai = typedArrayObtainStyledAttributes.getColor(R.styleable.HwDotsPageIndicator_hwSelectedDotColor, ContextCompat.getColor(getContext(), R.color.emui_control_focused));
        this.av = typedArrayObtainStyledAttributes.getColor(R.styleable.HwDotsPageIndicator_hwBgEndColor, ContextCompat.getColor(getContext(), R.color.emui_clickeffic_default_color));
        int color = typedArrayObtainStyledAttributes.getColor(R.styleable.HwDotsPageIndicator_hwBgStartColor, ContextCompat.getColor(getContext(), R.color.emui_clickeffic_default_color));
        this.aw = color;
        this.e.l(color);
        this.e.k(this.av);
        this.ao = typedArrayObtainStyledAttributes.getColor(R.styleable.HwDotsPageIndicator_hwFocusBoxColor, ContextCompat.getColor(getContext(), R.color.emui_control_focused_outline));
        this.o = typedArrayObtainStyledAttributes.getBoolean(R.styleable.HwDotsPageIndicator_hwIsShowAsDot, true);
        this.ca = typedArrayObtainStyledAttributes.getBoolean(R.styleable.HwDotsPageIndicator_hwHasAnimation, true);
        this.bz = typedArrayObtainStyledAttributes.getBoolean(R.styleable.HwDotsPageIndicator_hwIsOperable, true);
        this.bb = typedArrayObtainStyledAttributes.getColor(R.styleable.HwDotsPageIndicator_hwNumTextColor, ContextCompat.getColor(getContext(), R.color.emui_selector_text_secondary));
        this.ay = typedArrayObtainStyledAttributes.getColor(R.styleable.HwDotsPageIndicator_hwNumFocusTextColor, ContextCompat.getColor(getContext(), R.color.emui_functional_blue));
        this.al = typedArrayObtainStyledAttributes.getColor(R.styleable.HwDotsPageIndicator_hwBgFocusUnSelectedDotColor, ContextCompat.getColor(getContext(), R.color.hwdotspageindicator_unselected_focus_color));
        this.an = typedArrayObtainStyledAttributes.getColor(R.styleable.HwDotsPageIndicator_hwBgFocusSelectedDotColor, ContextCompat.getColor(getContext(), R.color.emui_control_focused));
        this.l = typedArrayObtainStyledAttributes.getBoolean(R.styleable.HwDotsPageIndicator_hwBgFocusEnable, false);
        typedArrayObtainStyledAttributes.recycle();
    }

    private float e(float f2) {
        return getDecelerateInterpolator().getInterpolation(f2);
    }

    private void t() {
        if (!this.bz || this.f29450a == null || this.m != 0 || this.e.e() || this.f29450a.g() || this.f29450a.a()) {
            return;
        }
        this.f29450a.k();
        float fQ = this.ab - (this.e.q() - this.e.t());
        if (!this.ca) {
            xeo xeoVar = this.e;
            float f2 = fQ / 2.0f;
            xeoVar.h(xeoVar.t() - f2);
            xeo xeoVar2 = this.e;
            xeoVar2.o(xeoVar2.q() + f2);
            float fP = this.e.p();
            float fS = this.e.s();
            this.e.f(this.p ? fS + fQ : fS - fQ);
            this.e.j(this.p ? fP - fQ : fP + fQ);
            this.e.b(true);
            invalidate();
            return;
        }
        float f3 = fQ / 2.0f;
        c(new RectF(this.e.s() - fQ, this.e.t() - f3, this.e.p() + fQ, this.e.q() + f3), this);
        this.aa = bfscp.MOUSE_ON_DOT;
    }

    private boolean h(int i2) {
        HwViewPager hwViewPager = this.f29404c;
        return ae() && (hwViewPager != null && hwViewPager.isSupportLoop()) && e(i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void r() {
        if (this.br) {
            return;
        }
        e(false);
    }

    private void b(int i2, float f2, int i3) {
        boolean z = this.bk != i2;
        if (!this.bs) {
            if (z) {
                c(i2, f2, i3);
                return;
            } else {
                h(i2, f2, i3);
                return;
            }
        }
        if (xep.m()) {
            return;
        }
        if (z) {
            a(i2, f2, i3);
        } else {
            e(i2, f2, i3);
        }
    }

    private void c(int i2, float f2) {
        if (this.m == 0 && Float.compare(f2, 0.0f) == 0) {
            this.bk = i2;
            onPageScrollStateChanged(this.m);
            return;
        }
        int distanceProper = getDistanceProper();
        if (this.m == 2) {
            b(i2, f2, distanceProper);
        } else {
            d(i2, f2, distanceProper);
        }
        d(i2, f2);
    }

    private float c(float f2) {
        return getAccelerateInterpolator().getInterpolation(f2);
    }

    private boolean e(int i2) {
        return (i2 == 0 && this.bk == this.bh - 1 && (this.bs || this.bo)) || ((i2 == this.bh - 1 && this.bk == 0 && (this.bs || !this.bo)) && !this.bu);
    }

    private void k() {
        HwDotsPageIndicatorAnimation hwDotsPageIndicatorAnimation = this.f29450a;
        if (hwDotsPageIndicatorAnimation != null && hwDotsPageIndicatorAnimation.a()) {
            this.f29450a.i();
            an();
        }
        if (this.e.e()) {
            an();
        }
    }

    private void h(float f2) {
        j();
        if (this.bh - 1 <= 0 || this.s.b() <= 0.0f || this.s.e() <= 0.0f) {
            return;
        }
        float fC = f2 - this.s.c();
        boolean z = fC > 0.0f && !this.p;
        boolean z2 = fC < 0.0f && this.p;
        float fMin = Math.min(Math.abs(fC), this.s.e()) / this.s.e();
        HwDotsPageIndicatorInteractor.OnGestureListener onGestureListener = this.v;
        if (onGestureListener != null) {
            onGestureListener.onOverDrag(fMin);
        }
        Pair<Float, Float> pairD = xep.d(getScaleInterpolator(), fMin, this.bh, getScaledWidth(), this.ba);
        float fFloatValue = ((Float) pairD.first).floatValue();
        float fFloatValue2 = ((Float) pairD.second).floatValue();
        RectF rectF = this.aj;
        float f3 = rectF.top;
        float f4 = (this.ba - fFloatValue2) / 2.0f;
        b(z2, z, fFloatValue, f3 + f4, rectF.bottom - f4);
    }

    private void e(int i2, float f2, int i3) {
        float fC;
        int i4 = i2 + 1;
        float fE = this.e.e(ae(), i4);
        xeo xeoVar = this.e;
        if (this.p) {
            fC = fE + (c(1.0f - f2) * i3);
        } else {
            fC = fE - (c(1.0f - f2) * i3);
        }
        xeoVar.f(fC);
        float f3 = 1.0f - f2;
        if (f3 < getMaxDiffFraction()) {
            float fD = this.e.d(ae(), i4);
            this.e.j(this.p ? fD + (e(f3) * i3) : fD - (e(f3) * i3));
            return;
        }
        float fP = this.e.p();
        float fD2 = this.e.d(ae(), i2);
        if (i()) {
            return;
        }
        this.bq = false;
        b(false, fP, fD2, this.h, this.f29451b);
    }

    private void a(float f2, float f3) {
        if (!this.br) {
            e(false);
            return;
        }
        if (xep.a(this.e, this.p, f2, f3)) {
            t();
            a(this.e.c());
            this.e.q(-1);
            return;
        }
        q();
        int iE = xep.e(this.e, this.ab / 2.0f, (this.w + this.af) / 2.0f, f2, f3);
        if (iE == this.bk) {
            return;
        }
        if (iE == -1) {
            if (this.e.c() != -1) {
                a(this.e.c());
                this.e.q(-1);
                return;
            }
            return;
        }
        if (iE == this.e.c()) {
            return;
        }
        a(this.e.c());
        this.e.q(-1);
        if (c(iE)) {
            this.e.q(iE);
        }
    }

    private void a(int i2, float f2, int i3) {
        float fD = this.e.d(ae(), i2);
        this.e.j(this.p ? fD - (c(f2) * i3) : fD + (c(f2) * i3));
        if (!xep.l() && f2 >= getMaxDiffFraction()) {
            float fS = this.e.s();
            float fE = this.e.e(ae(), i2 + 1);
            if (i()) {
                return;
            }
            this.bq = true;
            b(true, fS, fE, this.h, this.f29451b);
            return;
        }
        float fE2 = this.e.e(ae(), i2);
        this.e.f(this.p ? fE2 - (e(f2) * i3) : fE2 + (e(f2) * i3));
    }

    private boolean b(int i2, float f2) {
        HwDotsPageIndicatorAnimation hwDotsPageIndicatorAnimation;
        return this.o && this.ca && this.z != awsks.TARGET && ((hwDotsPageIndicatorAnimation = this.f29450a) == null || !(hwDotsPageIndicatorAnimation.g() || this.f29450a.b())) && i2 + 1 <= this.bh - 1 && Float.compare(f2, 0.0f) >= 0;
    }

    private void d(int i2, float f2, int i3) {
        if (this.bo) {
            float fE = this.e.e(ae(), i2);
            float fD = this.e.d(ae(), i2);
            this.e.f(this.p ? fE - (e(f2) * i3) : fE + (e(f2) * i3));
            this.e.j(this.p ? fD - (c(f2) * i3) : fD + (c(f2) * i3));
            return;
        }
        int i4 = i2 + 1;
        float fE2 = this.e.e(ae(), i4);
        float fD2 = this.e.d(ae(), i4);
        this.e.f(this.p ? fE2 + (c(1.0f - f2) * i3) : fE2 - (c(1.0f - f2) * i3));
        float f3 = 1.0f - f2;
        this.e.j(this.p ? fD2 + (e(f3) * i3) : fD2 - (e(f3) * i3));
    }

    private void n() {
        int paddingLeft = getPaddingLeft();
        this.be = paddingLeft + (((getWidth() - getPaddingRight()) - paddingLeft) / 2.0f);
        float height = getHeight();
        Paint.FontMetrics fontMetrics = this.q;
        float f2 = fontMetrics.descent;
        float f3 = fontMetrics.ascent;
        this.bf = ((height - (f2 - f3)) / 2.0f) - f3;
        aj();
    }

    private boolean c(int i2) {
        HwDotsPageIndicatorAnimation hwDotsPageIndicatorAnimation;
        if (!this.bz || (hwDotsPageIndicatorAnimation = this.f29450a) == null || hwDotsPageIndicatorAnimation.g() || this.f29450a.b() || this.f29450a.b(i2) || this.e.c() == i2) {
            return false;
        }
        if (!this.ca) {
            this.e.b(i2, this.ab / 2.0f);
            this.aa = bfscp.MOUSE_ON_DOT;
            invalidate();
            return true;
        }
        a(i2, this.ab / 2.0f, this);
        this.aa = bfscp.MOUSE_ON_DOT;
        return true;
    }

    private void d(int i2, float f2) {
        float fD = this.e.d(ae());
        float fA = this.e.a(ae(), i2);
        if (!this.p) {
            this.e.a(i2, fA - (fD * f2));
            int i3 = i2 + 1;
            if (i3 < this.bh) {
                xeo xeoVar = this.e;
                xeoVar.a(i3, xeoVar.a(ae(), i3) + (fD * (1.0f - f2)));
            }
        } else {
            this.e.a(i2, fA + (fD * f2));
            int i4 = i2 + 1;
            if (i4 < this.bh) {
                xeo xeoVar2 = this.e;
                xeoVar2.a(i4, xeoVar2.a(ae(), i4) - (fD * (1.0f - f2)));
            }
        }
        invalidate();
    }

    private void o() {
        if (this.o) {
            m();
        } else {
            n();
        }
    }

    private void d(float f2, float f3) {
        if (this.r == null || !isInTouchMode()) {
            return;
        }
        RectF rectF = this.ak;
        if (rectF != null && rectF.contains(f2, f3)) {
            f();
            return;
        }
        RectF rectF2 = this.ae;
        if (rectF2 == null || !rectF2.contains(f2, f3)) {
            return;
        }
        h();
    }

    /* JADX WARN: Code duplicated, block: B:9:0x000f  */
    private void d(int i2) {
        boolean z;
        if (this.z == awsks.DEFAULT) {
            z = this.m != 1 && i2 == 2;
        }
        this.bs = z;
    }

    private void a(boolean z) {
        xeo xeoVar = this.e;
        if (xeoVar.e(z, this.bk, xeoVar.j())) {
            return;
        }
        xeo xeoVar2 = this.e;
        xeoVar2.c(xeoVar2.b(z, this.bk));
        invalidate();
    }

    private boolean b(float f2) {
        HwDotsPageIndicatorAnimation hwDotsPageIndicatorAnimation;
        if (this.bh <= 1 || !this.bz || ae() || ((hwDotsPageIndicatorAnimation = this.f29450a) != null && hwDotsPageIndicatorAnimation.g())) {
            return false;
        }
        xep.c cVar = this.s;
        boolean z = this.p;
        int i2 = this.bk;
        return xep.d(cVar, f2, z, i2 > 0, i2 < this.bh - 1);
    }

    private void m() {
        HwViewPager hwViewPager = this.f29404c;
        this.bk = hwViewPager != null ? hwViewPager.getCurrentItem() : 0;
        if (this.bh < 1) {
            return;
        }
        u();
        ad();
        ab();
        aj();
    }

    private void a(int i2) {
        HwDotsPageIndicatorAnimation hwDotsPageIndicatorAnimation;
        if (!this.bz || (hwDotsPageIndicatorAnimation = this.f29450a) == null || i2 == -1 || hwDotsPageIndicatorAnimation.c(i2)) {
            return;
        }
        if (!this.ca) {
            this.e.m(i2);
            invalidate();
        } else {
            e(i2, this, this);
            this.aa = bfscp.VISIBLE;
        }
    }

    private void c(int i2, int i3, float f2) {
        if (Float.compare(f2, 1.0f) >= 0) {
            d(i2, i3);
            return;
        }
        e(i2, i3, f2);
        a(i2, i3 > i2);
        this.m = 1;
        invalidate();
    }

    private boolean c(boolean z, boolean z2) {
        boolean z3 = this.bt && this.bw;
        boolean z4 = z && z2;
        return (z3 && !z4) || (!z3 && z4);
    }

    private boolean c(int i2, float f2, float f3) {
        if (this.bv || !this.bz || this.x == null || this.cb || this.e.w() == null || !this.o || this.bh == 0) {
            return false;
        }
        boolean zE = e();
        if (i2 == 10 && !zE) {
            if (this.ah == null) {
                this.ah = new e(this, null);
            }
            postDelayed(this.ah, 100L);
        }
        this.br = this.e.w().contains(f2, f3);
        return !zE;
    }

    private void c(Canvas canvas) {
        float fQ = (this.e.q() - this.e.t()) / 2.0f;
        canvas.drawRoundRect(this.e.r(), fQ, fQ, this.cc);
        aa();
        w();
    }

    private void b(int i2, boolean z) {
        HwViewPager hwViewPager = this.f29404c;
        if (hwViewPager == null || hwViewPager.getAdapter() == null || this.f29404c.getAdapter().getCount() < 2 || i2 < 0 || i2 >= this.bh || i2 == this.bk || e()) {
            return;
        }
        this.z = awsks.TARGET;
        this.e.r(this.bk);
        float[] fArrC = this.e.c(ae(), i2);
        float fE = this.e.e(ae(), i2);
        float fD = this.e.d(ae(), i2);
        if (!this.ca) {
            this.e.f(fE);
            this.e.j(fD);
            b(fArrC);
            this.f29404c.setCurrentItem(i2, false);
            HwDotsPageIndicatorInteractor.OnMouseOperationListener onMouseOperationListener = this.x;
            if (onMouseOperationListener != null) {
                onMouseOperationListener.onFocusAnimationProgress(1.0f);
                return;
            }
            return;
        }
        j();
        xeo xeoVarI = this.e.i();
        xeoVarI.r(i2);
        xeoVarI.f(fE);
        xeoVarI.j(fD);
        boolean z2 = xeoVarI.ab() > this.e.ab();
        float fP = z2 ? this.e.p() : this.e.s();
        float fP2 = z2 ? xeoVarI.p() : xeoVarI.s();
        a(i2, z2, z2 ? this.e.s() : this.e.p(), z2 ? xeoVarI.s() : xeoVarI.p(), z);
        b(fP, fP2);
        this.bq = xeoVarI.ab() > this.e.ab();
        b(fArrC);
        this.f29404c.setCurrentItem(i2);
    }

    private void a(float f2) {
        if (!this.bz || this.v == null || this.s.a() <= 0.0f) {
            return;
        }
        if (d(f2)) {
            h(f2);
            return;
        }
        if (!b(f2)) {
            this.s.d(true);
            return;
        }
        if (this.s.h()) {
            this.s.b(this.bi);
            this.s.d(false);
        }
        float fD = f2 - this.s.d();
        float fAbs = Math.abs(fD) / this.s.a();
        int i2 = ((fD <= 0.0f || this.p) && (fD >= 0.0f || !this.p)) ? this.bk - 1 : this.bk + 1;
        this.z = awsks.SLIDE;
        int i3 = this.bk;
        if (this.ca) {
            c(i3, i2, fAbs);
        } else if (Float.compare(fAbs, 1.0f) >= 0) {
            this.bk = i2;
            this.e = z();
            invalidate();
            settleToTarget(i2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(boolean z, float f2, float f3, float f4, float f5) {
        d(new bzrwd.d(z, f2, f3, f4, f5), this);
    }

    private void b(float[] fArr) {
        if (!this.ca) {
            this.e.c(fArr);
            invalidate();
        } else {
            c(fArr, this);
        }
    }

    private void c(float f2, float f3) {
        e(f2, f3, this);
    }

    private boolean d(float f2) {
        HwDotsPageIndicatorAnimation hwDotsPageIndicatorAnimation;
        if (this.bh <= 1 || !this.bz || !this.ca || ae() || ((hwDotsPageIndicatorAnimation = this.f29450a) != null && (hwDotsPageIndicatorAnimation.g() || e()))) {
            return false;
        }
        xep.c cVar = this.s;
        boolean z = this.p;
        int i2 = this.bk;
        return xep.a(cVar, f2, z, i2 == 0, i2 == this.bh - 1);
    }

    private void a(int i2, boolean z) {
        this.e.a(i2, z ? this.e.a(i2) : this.e.b(i2));
    }

    private void e(int i2, int i3, float f2) {
        if (i2 == i3 || i3 > this.bh - 1 || i3 < 0) {
            return;
        }
        boolean z = i3 > i2;
        b(f2, 1, i2);
        float interpolation = getAccelerateInterpolator().getInterpolation(f2);
        float interpolation2 = getDecelerateInterpolator().getInterpolation(f2);
        j();
        float fD = this.e.d(ae(), i2);
        float fD2 = this.e.d(ae(), i3);
        float fE = this.e.e(ae(), i2);
        float fE2 = this.e.e(ae(), i3);
        float f3 = z ? interpolation2 : interpolation;
        if (!z) {
            interpolation = interpolation2;
        }
        this.e.f(fE + ((fE2 - fE) * f3));
        this.e.j(fD + ((fD2 - fD) * interpolation));
    }

    private void a(Canvas canvas) {
        if (this.bj == null || this.n == null) {
            return;
        }
        if (b() && this.cb) {
            this.n.setColor(this.ay);
        } else {
            this.n.setColor(this.bb);
        }
        canvas.drawText(this.bj, this.be, this.bf, this.n);
    }

    private void b(float f2, float f3) {
        d(f2, f3, this, new c());
    }

    private void d(int i2, int i3) {
        float f2 = this.e.f(i3);
        this.e.f(this.e.g(i3));
        this.e.j(f2);
        boolean z = i3 > i2;
        float fA = this.e.a(i2);
        float fB = this.e.b(i2);
        float fE = this.e.e(i3);
        if (!z) {
            fA = fB;
        }
        this.e.a(i2, fA);
        this.e.a(i3, fE);
        invalidate();
        settleToTarget(i3);
    }

    private void b(int i2, int i3) {
        HwDotsPageIndicatorInteractor.OnClickListener onClickListener = this.r;
        if (onClickListener != null) {
            onClickListener.onClick(i2, i3);
        }
    }

    private void b(boolean z) {
        if (e()) {
            return;
        }
        j();
        this.z = awsks.TARGET;
        int i2 = z ? this.bk + 1 : this.bk - 1;
        float fE = this.e.e(ae(), i2);
        float fD = this.e.d(ae(), i2);
        xeo xeoVarI = this.e.i();
        xeoVarI.f(fE);
        xeoVarI.j(fD);
        int iAb = this.e.ab();
        xeoVarI.r(z ? iAb + 1 : iAb - 1);
        float maxDiffFraction = getMaxDiffFraction();
        this.bq = xeoVarI.ab() > iAb;
        c(z ? this.e.p() : this.e.s(), z ? xeoVarI.p() : xeoVarI.s());
        a(z ? this.e.s() : this.e.p(), z ? xeoVarI.s() : xeoVarI.p(), this, new i(maxDiffFraction, z, fE, fD));
        this.bk = i2;
        b(this.e.c(ae(), this.bk));
        if (z) {
            this.f29404c.nextPage();
        } else {
            this.f29404c.prePage();
        }
    }

    private void b(boolean z, boolean z2, float f2, float f3, float f4) {
        float f5;
        int i2;
        float f6;
        float f7;
        float f8;
        int i3;
        int i4;
        float f9 = this.az;
        float f10 = this.au;
        int i5 = this.w;
        int i6 = this.bh;
        int i7 = i6 - 1;
        float f11 = (((f2 - (f9 * 2.0f)) - f10) - (i5 * i7)) / i7;
        float[] fArr = new float[i6];
        boolean z3 = this.p;
        int i8 = 0;
        boolean z4 = z3 && z;
        boolean z5 = z3 && !z;
        boolean z6 = (z3 || z2) ? false : true;
        if (!z4 && !z6) {
            f7 = this.aj.left;
            f6 = f7 + f2;
            while (true) {
                i4 = this.bh;
                if (i8 >= i4) {
                    break;
                }
                int i9 = this.p ? (i4 - 1) - i8 : i8;
                float f12 = this.az;
                int i10 = this.w;
                fArr[i9] = f12 + f7 + (i8 * f11) + (i10 / 2.0f) + (i10 * i8);
                i8++;
            }
            if (z5) {
                f8 = fArr[1] + (this.w / 2.0f) + f11;
                i3 = this.au;
                f5 = i3 + f8;
            } else {
                f5 = f11 + fArr[i4 - 2] + (this.w / 2.0f);
                i2 = this.au;
                f8 = i2 + f5;
            }
        } else {
            float f13 = this.aj.right;
            float f14 = f13 - f2;
            while (i7 >= 0) {
                int i11 = (this.bh - 1) - i7;
                int i12 = this.p ? i11 : i7;
                float f15 = this.az;
                int i13 = this.w;
                fArr[i12] = (((f13 - f15) - (i11 * f11)) - (i13 / 2.0f)) - (i11 * i13);
                i7--;
            }
            if (z4) {
                f8 = this.az + f14;
                i3 = this.au;
                f6 = f13;
                f7 = f14;
                f5 = i3 + f8;
            } else {
                f5 = this.az + f14;
                i2 = this.au;
                f6 = f13;
                f7 = f14;
                f8 = i2 + f5;
            }
        }
        this.e.d(f7, f3, f6, f4);
        this.e.c(fArr);
        this.e.f(f5);
        this.e.j(f8);
        invalidate();
    }

    private void e(Canvas canvas) {
        Paint paint;
        ConcurrentHashMap<Integer, Float> concurrentHashMapB = this.e.b();
        float[] fArrJ = this.e.j();
        for (int i2 = 0; i2 < this.bh; i2++) {
            float fM = this.e.m();
            if (concurrentHashMapB != null && concurrentHashMapB.get(Integer.valueOf(i2)) != null && i2 != this.bk) {
                fM = concurrentHashMapB.get(Integer.valueOf(i2)).floatValue();
            }
            if (fArrJ != null && i2 < fArrJ.length && (paint = this.cf) != null) {
                canvas.drawCircle(fArrJ[i2], this.at, fM, paint);
            }
        }
    }

    private void a(int i2, boolean z, float f2, float f3, boolean z2) {
        a(f2, f3, this, new d(getMaxDiffFraction(), z, Math.abs(i2 - this.bk), f3, new a(z2)));
    }

    private void b(float f2, int i2, int i3) {
        HwDotsPageIndicatorInteractor.OnGestureListener onGestureListener = this.v;
        if (onGestureListener != null) {
            onGestureListener.onDragging(f2, i2, i3);
        }
    }
}
