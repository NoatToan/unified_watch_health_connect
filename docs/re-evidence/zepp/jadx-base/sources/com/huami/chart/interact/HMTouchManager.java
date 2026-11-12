package com.huami.chart.interact;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;
import android.widget.Scroller;
import com.huami.chart.chart.HMChart;
import com.huami.chart.interact.HMTouchManager;
import com.huami.chart.listener.IScrollListener;
import com.huami.chart.listener.ITouchListener;
import com.huami.chart.style.BarStyle;
import com.huami.chart.style.InteractiveLineStyle;
import com.huami.chart.style.LineJoinStyle;
import com.huami.chart.style.LineStyle;
import com.huami.chart.style.SectionLineStyle;
import com.huami.chart.util.ChartUtil;
import com.huami.chart.util.Index;
import com.huami.tools.log.HMLog;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes6.dex */
public class HMTouchManager {
    private static final String A = "HMTouchManager";
    private static final int B = 100;
    private static final int C = 2;
    public static final int MAX_COUNT = 300;
    private Context a;
    private VelocityTracker b;
    private final int c;
    private final int d;
    private final int e;
    private ScaleGestureDetector f;
    private Scroller i;
    private HMChart j;
    private ITouchListener l;
    private IScrollListener m;
    private float s;
    private float t;
    private ValueAnimator x;
    private float g = 1.0f;
    private float h = 1.0f;
    private long k = 0;
    private float[] n = {6.0f, 3.6f, 1.8f, 1.5f, 0.8f, 0.4f, 0.25f, 0.125f, 0.07f, 0.04f, 0.03f, 0.025f};
    private float[] o = {4.0f, 2.6f, 1.2f, 1.1f, 0.7f, 0.3f, 0.2f, 0.1f, 0.05f, 0.04f, 0.03f, 0.01f};
    private float p = 0.0f;
    private int q = 0;
    private int r = -1;
    private boolean u = false;
    private float v = 0.0f;
    private float w = 0.0f;
    private boolean y = true;
    private float z = 0.0f;

    public class a implements ScaleGestureDetector.OnScaleGestureListener {
        public a() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ String e() {
            return "onScaleBegin...";
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ String f() {
            return "lastCurrentIndex " + HMTouchManager.this.j.getInteractiveManager().getCurrentIndex();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ String g() {
            return "lastOffset " + HMTouchManager.this.j.getInteractiveManager().getxOffset();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ String h() {
            return "onScaleEnd...";
        }

        @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
        public boolean onScale(ScaleGestureDetector scaleGestureDetector) {
            float scaleFactor = scaleGestureDetector.getScaleFactor();
            float f = HMTouchManager.this.n[0];
            float f2 = HMTouchManager.this.n[HMTouchManager.this.n.length - 1];
            if (scaleFactor > 1.0f && HMTouchManager.this.g >= f) {
                return true;
            }
            if (scaleFactor < 1.0f && HMTouchManager.this.g <= f2) {
                return true;
            }
            HMTouchManager.this.g *= scaleFactor;
            HMTouchManager hMTouchManager = HMTouchManager.this;
            hMTouchManager.g = Math.max(f2, Math.min(f, hMTouchManager.g));
            HMTouchManager hMTouchManager2 = HMTouchManager.this;
            int iL = hMTouchManager2.L(hMTouchManager2.n, HMTouchManager.this.g);
            float f3 = HMTouchManager.this.n[iL];
            float f4 = HMTouchManager.this.o[iL];
            HMTouchManager.this.j.getInteractiveManager().setScaleFactorX(f3);
            HMTouchManager.this.r0((HMTouchManager.this.j.getHmDataCacheCenter().getPositionByPosIndex(HMTouchManager.this.j.getInteractiveManager().getCurrentIndex().getPosiIndex().getIndex()) * HMTouchManager.this.j.getInteractiveManager().getScaleFactorX()) - (HMTouchManager.this.j.getInteractiveManager().isAnchorCenter() ? (HMTouchManager.this.j.getDrawAreaManager().getRight() - HMTouchManager.this.j.getDrawAreaManager().getLeft()) / 2.0f : 0.0f));
            HMTouchManager.this.j.invalidate();
            return true;
        }

        @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
        public boolean onScaleBegin(ScaleGestureDetector scaleGestureDetector) {
            HMLog.verbose(HMTouchManager.A, new Function0() { // from class: com.huami.chart.interact.d
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return HMTouchManager.a.e();
                }
            });
            HMLog.verbose(HMTouchManager.A, new Function0() { // from class: com.huami.chart.interact.a
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return this.a.f();
                }
            });
            HMLog.verbose(HMTouchManager.A, new Function0() { // from class: com.huami.chart.interact.b
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return this.a.g();
                }
            });
            HMTouchManager.this.j.getInteractiveManager().setScaling(true);
            return true;
        }

        @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
        public void onScaleEnd(ScaleGestureDetector scaleGestureDetector) {
            HMTouchManager.this.j.getInteractiveManager().setScaling(false);
            HMLog.verbose(HMTouchManager.A, new Function0() { // from class: com.huami.chart.interact.c
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return HMTouchManager.a.h();
                }
            });
        }
    }

    public class b implements ValueAnimator.AnimatorUpdateListener {
        public b() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ String b(float f) {
            return "setCurrentOffset " + f;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            if (HMTouchManager.this.u) {
                return;
            }
            final float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            HMLog.verbose(HMTouchManager.A, new Function0() { // from class: com.huami.chart.interact.e
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return HMTouchManager.b.b(fFloatValue);
                }
            });
            HMTouchManager.this.setCurrentOffset(fFloatValue);
            HMTouchManager.this.j.invalidate();
        }
    }

    public class c implements Animator.AnimatorListener {
        public c() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ String b() {
            return "onAnimationEnd";
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (HMTouchManager.this.j.getiScrollListener() != null) {
                HMLog.verbose(HMTouchManager.A, new Function0() { // from class: com.huami.chart.interact.f
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return HMTouchManager.c.b();
                    }
                });
                HMTouchManager.this.j.getiScrollListener().onStopIndex(HMTouchManager.this.j.getInteractiveManager().getCurrentIndex());
                HMTouchManager.this.j.onScrollStoped();
            }
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
        }
    }

    public HMTouchManager(HMChart hMChart) {
        this.a = hMChart.getContext();
        this.j = hMChart;
        this.i = new Scroller(this.a);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(this.a);
        this.c = viewConfiguration.getScaledTouchSlop();
        this.d = viewConfiguration.getScaledMinimumFlingVelocity();
        this.e = viewConfiguration.getScaledMaximumFlingVelocity();
        R(this.a);
    }

    private void H(float f) {
        Index currentIndex = this.j.getInteractiveManager().getCurrentIndex();
        if (currentIndex.getPosiIndex() != null) {
            f = P(currentIndex.getPosiIndex().getIndex());
        }
        if (currentIndex.getDataIndex() == -1) {
            Index indexByPosition = this.j.getHmDataCacheCenter().getIndexByPosition(f, -1.0f);
            if (P(indexByPosition.getPosiIndex().getIndex()) < this.j.getHmDataCacheCenter().getFirstDataIndexPositionX()) {
                indexByPosition = this.j.getHmDataCacheCenter().getIndexByPosition(this.j.getHmDataCacheCenter().getFirstDataIndexPositionX(), 0.0f);
            } else if (P(indexByPosition.getPosiIndex().getIndex()) > this.j.getHmDataCacheCenter().getLastDataIndexPositionX()) {
                indexByPosition = this.j.getHmDataCacheCenter().getIndexByPosition(this.j.getHmDataCacheCenter().getLastDataIndexPositionX(), 0.0f);
            }
            if (indexByPosition == null || indexByPosition.getDataIndex() == -1) {
                return;
            }
            this.j.getInteractiveManager().setCurrentIndex(indexByPosition);
        }
    }

    private void I() {
        ValueAnimator valueAnimator = this.x;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            this.u = true;
            this.x.cancel();
        }
        if (this.j.getIndexAnimator() != null && this.j.getIndexAnimator().isRunning()) {
            this.j.setIndexAnimatorCancel(true);
            this.j.getIndexAnimator().cancel();
        }
        if (this.j.getScaleAnimator() != null && this.j.getScaleAnimator().isRunning()) {
            this.j.setScaleAnimatorcancel(true);
            this.j.getScaleAnimator().cancel();
        }
        this.j.setIndexAnimatorCancel(true);
        this.j.setScaleAnimatorcancel(true);
    }

    private void J(MotionEvent motionEvent, int i, int i2) {
        this.b.computeCurrentVelocity(1000, this.e);
        final int xVelocity = (int) this.b.getXVelocity();
        String str = A;
        HMLog.verbose(str, new Function0() { // from class: ok3
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return this.a.V(xVelocity);
            }
        });
        if (Math.abs(xVelocity) >= this.d) {
            final int iAbs = (int) (Math.abs(this.j.getHmDataCacheCenter().getPositionByPosIndex(this.j.getChartDataManager().getChartDataList().getStart() + 1) - this.j.getHmDataCacheCenter().getPositionByPosIndex(this.j.getChartDataManager().getChartDataList().getStart())) * 300.0f * this.j.getInteractiveManager().getScaleFactorX());
            HMLog.verbose(str, new Function0() { // from class: kk3
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return this.a.W();
                }
            });
            HMLog.verbose(str, new Function0() { // from class: zk3
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return HMTouchManager.X(iAbs);
                }
            });
            HMLog.verbose(str, new Function0() { // from class: fl3
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return this.a.Y();
                }
            });
            I();
            Scroller scroller = this.i;
            scroller.fling(scroller.getCurrX(), 0, -xVelocity, 0, -iAbs, 0, 0, 0);
            return;
        }
        HMLog.verbose(str, new Function0() { // from class: dl3
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return this.a.Z();
            }
        });
        if (this.i.isFinished()) {
            if (this.j.getInteractiveManager().isEnableScroll()) {
                q0(i, i2);
            } else {
                this.j.getInteractiveManager().setCurrentDownX(Float.NaN);
                this.j.getInteractiveManager().setCurrentDownY(Float.NaN);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0026  */
    /* JADX WARN: Code duplicated, block: B:9:0x0028  */
    private Index K(Index index, float f, InteractiveLineStyle interactiveLineStyle) {
        int i;
        if (!interactiveLineStyle.isShowVerticalLineOnlyInRange()) {
            return index;
        }
        float minIndexPositionX = this.j.getHmDataCacheCenter().getMinIndexPositionX();
        float maxIndexPositionX = this.j.getHmDataCacheCenter().getMaxIndexPositionX();
        if (f < minIndexPositionX) {
            if (ChartUtil.isRtl(this.j)) {
                i = (int) maxIndexPositionX;
            } else {
                i = (int) minIndexPositionX;
            }
            f = i;
        } else if (f > maxIndexPositionX) {
            if (ChartUtil.isRtl(this.j)) {
                i = (int) minIndexPositionX;
            } else {
                i = (int) maxIndexPositionX;
            }
            f = i;
        }
        Index indexByPosition = this.j.getHmDataCacheCenter().getIndexByPosition((this.j.getInteractiveManager().getxOffset() + f) / this.j.getInteractiveManager().getScaleFactorX(), 0.0f);
        indexByPosition.setCenterX(f);
        this.j.getInteractiveManager().setCurrentIndex(indexByPosition);
        this.j.getInteractiveManager().setDownX(f);
        this.j.getInteractiveManager().setCurrentDownX(f);
        return indexByPosition;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int L(float[] fArr, float f) {
        int length = fArr.length - 1;
        int i = (length + 0) >> 1;
        int i2 = 0;
        do {
            if (f >= fArr[i] && f < fArr[i - 1]) {
                break;
            }
            if (f >= fArr[i - 1]) {
                length = i;
            } else {
                i2 = i + 1;
            }
            i = (i2 + length) >> 1;
            if (i2 >= length) {
                break;
            }
        } while (i != 0);
        return i;
    }

    private float M() {
        return this.j.getInteractiveManager().getDownX() + this.j.getInteractiveManager().getxOffset();
    }

    private float N() {
        return ChartUtil.isRtl(this.j) ? this.j.getHmDataCacheCenter().getFirstDataIndexPositionX() : this.j.getHmDataCacheCenter().getLastDataIndexPositionX();
    }

    private float O() {
        return ChartUtil.isRtl(this.j) ? this.j.getHmDataCacheCenter().getMinIndexPositionX() : this.j.getHmDataCacheCenter().getMaxIndexPositionX();
    }

    private float P(int i) {
        return this.j.getHmDataCacheCenter().getPositionByPosIndex(i) * this.j.getInteractiveManager().getScaleFactorX();
    }

    private float Q() {
        return ChartUtil.isRtl(this.j) ? this.j.getHmDataCacheCenter().getLastDataIndexPositionX() : this.j.getHmDataCacheCenter().getFirstDataIndexPositionX();
    }

    private void R(Context context) {
        this.f = new ScaleGestureDetector(context, new a());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ String S() {
        return "mScroll.getCurrX() " + this.i.getCurrX() + " lastX " + this.z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String T(float f) {
        return "scroll listener call back , offset: " + f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ String U() {
        return "computeScroll stoped" + this.y;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ String V(int i) {
        return "xVeloccity " + i + " MIN_VELOCITY " + this.d;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ String W() {
        return "fling " + this.i.getCurrX() + " factor  " + this.j.getInteractiveManager().getScaleFactorX();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String X(int i) {
        return "maxDistance " + i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ String Y() {
        return "mScroller.getCur X " + this.i.getCurrX();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ String Z() {
        return "scroller " + this.i.isFinished();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ String a0() {
        return "ACTION_CANCEL || ACTION_UP " + this.j.getInteractiveManager().isScaling();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ String b0() {
        return "onUp " + this.j.getInteractiveManager().getCurrentIndex();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String c0() {
        return "barStyle.isDownSameCancel is true ";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String d0(Index index) {
        return "action down same index " + index;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String e0() {
        return "lineJoinStyle.isDownSameCancel is true ";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String f0(Index index) {
        return "action down same index " + index;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String g0(Index index) {
        return "setCurrentIndex" + index;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String h0(Index index) {
        return "onDown " + index;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String i0() {
        return "onUpAndMoveToRightPlace";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ String j0() {
        return "currentIndex " + this.j.getInteractiveManager().getCurrentIndex();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String k0(float f) {
        return "destination " + f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ String l0(float f) {
        return "reCalOffset " + f + " index " + this.j.getInteractiveManager().getCurrentIndex() + " scaleFactor " + this.j.getInteractiveManager().getScaleFactorX();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ String m0() {
        return "scale " + this.j.getInteractiveManager().getScaleFactorX() + " lastPosition " + N();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ String n0(float f, float f2, float f3) {
        return "range (" + this.v + ",  " + f + ")  offset   (" + f2 + ", " + f3 + ") index " + this.j.getInteractiveManager().getCurrentIndex();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String o0(Index index) {
        return "setCurrentOffset " + index;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String p0(float f) {
        return "realOffset " + f;
    }

    private void q0(int i, int i2) {
        String str = A;
        HMLog.verbose(str, new Function0() { // from class: wk3
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return HMTouchManager.i0();
            }
        });
        float f = this.j.getInteractiveManager().getxOffset();
        float right = this.j.getInteractiveManager().isAnchorCenter() ? (this.j.getDrawAreaManager().getRight() - this.j.getDrawAreaManager().getLeft()) / 2.0f : 0.0f;
        HMLog.verbose(str, new Function0() { // from class: jk3
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return this.a.j0();
            }
        });
        final float left = (this.j.getDrawAreaManager().getLeft() + (this.j.getHmDataCacheCenter().getPositionByPosIndex(this.j.getInteractiveManager().getCurrentIndex().getPosiIndex().getIndex()) * this.j.getInteractiveManager().getScaleFactorX())) - right;
        HMLog.verbose(str, new Function0() { // from class: tk3
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return HMTouchManager.k0(left);
            }
        });
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(f, left);
        this.x = valueAnimatorOfFloat;
        valueAnimatorOfFloat.setDuration(50L);
        this.u = false;
        this.x.start();
        this.x.addUpdateListener(new b());
        this.x.addListener(new c());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void r0(float f) {
        s0(f, true);
    }

    private void s0(final float f, boolean z) {
        float scaleFactorX;
        float fO;
        String str = A;
        HMLog.verbose(str, new Function0() { // from class: mk3
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return this.a.l0(f);
            }
        });
        float right = (this.j.getDrawAreaManager().getRight() - this.j.getDrawAreaManager().getLeft()) / 2.0f;
        if (this.j.getInteractiveManager().isAnchorCenter()) {
            HMLog.verbose(str, new Function0() { // from class: al3
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return this.a.m0();
                }
            });
            scaleFactorX = this.j.getInteractiveManager().getScaleFactorX();
            fO = N();
        } else {
            scaleFactorX = this.j.getInteractiveManager().getScaleFactorX();
            fO = O();
        }
        final float f2 = (scaleFactorX * fO) - right;
        if (this.j.getInteractiveManager().isAnchorCenter()) {
            this.v = (this.j.getInteractiveManager().getScaleFactorX() * Q()) - right;
        } else {
            this.v = this.j.getInteractiveManager().getScaleFactorX() * Q();
        }
        float f3 = this.v;
        if (f2 < f3) {
            f2 = f3;
        }
        if (f < f3) {
            f = f3;
        } else if (f > f2) {
            f = f2;
        }
        this.j.getInteractiveManager().setxOffset(f);
        if (z) {
            final float scaleFactorX2 = (right + f) / this.j.getInteractiveManager().getScaleFactorX();
            this.j.getInteractiveManager().setCurrentIndex(this.j.getHmDataCacheCenter().getIndexByPosition(this.j.getDrawAreaManager().getLeft() + scaleFactorX2, 0.0f));
            HMLog.verbose(str, new Function0() { // from class: nk3
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return this.a.n0(f2, f, scaleFactorX2);
                }
            });
        }
    }

    public void clear() {
    }

    public void computeScroll() {
        if (this.j.getInteractiveManager().isEnableInteractive() && this.j.getInteractiveManager().isEnableScroll()) {
            if (!this.i.computeScrollOffset()) {
                HMLog.verbose(A, new Function0() { // from class: el3
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return this.a.U();
                    }
                });
                if (this.y) {
                    return;
                }
                this.j.getInteractiveManager().setMoving(false);
                this.j.getInteractiveManager().setScrollStoped();
                this.y = true;
                return;
            }
            this.y = false;
            String str = A;
            HMLog.verbose(str, new Function0() { // from class: lk3
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return this.a.S();
                }
            });
            s0((this.j.getInteractiveManager().getxOffset() + this.i.getCurrX()) - this.z, false);
            this.z = this.i.getCurrX();
            if (this.m != null) {
                final float currX = this.i.getCurrX() - this.z;
                HMLog.verbose(str, new Function0() { // from class: yk3
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return HMTouchManager.T(currX);
                    }
                });
                this.m.offset(this.j.getInteractiveManager().getxOffset() - currX);
            }
            this.j.postInvalidateOnAnimation();
        }
    }

    public float getAnchorOffset() {
        return this.w;
    }

    public boolean isInteractiveLineTouchable() {
        if (!this.j.getRenderConfigManager().getRenderConfig().getInteractiveLineStyle().isShowVerticalLineOnlyInRange()) {
            return true;
        }
        if (ChartUtil.isRtl(this.j)) {
            return ((double) M()) > Math.floor((double) this.j.getHmDataCacheCenter().getMaxIndexPositionX()) && ((double) M()) < Math.ceil((double) this.j.getHmDataCacheCenter().getMinIndexPositionX());
        }
        return ((double) M()) > Math.floor((double) this.j.getHmDataCacheCenter().getMinIndexPositionX()) && ((double) M()) < Math.ceil((double) this.j.getHmDataCacheCenter().getMaxIndexPositionX());
    }

    /* JADX WARN: Code duplicated, block: B:38:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:40:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:42:0x0103  */
    /* JADX WARN: Code duplicated, block: B:44:0x0110  */
    /* JADX WARN: Code duplicated, block: B:46:0x0174  */
    /* JADX WARN: Code duplicated, block: B:47:0x018d  */
    /* JADX WARN: Code duplicated, block: B:56:0x01b4  */
    /* JADX WARN: Code duplicated, block: B:58:0x01bc  */
    /* JADX WARN: Code duplicated, block: B:60:0x01e0  */
    /* JADX WARN: Code duplicated, block: B:62:0x01e6 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:67:0x01f2  */
    /* JADX WARN: Code duplicated, block: B:70:0x01fc  */
    /* JADX WARN: Code duplicated, block: B:72:0x0200  */
    /* JADX WARN: Code duplicated, block: B:74:0x0206  */
    /* JADX WARN: Code duplicated, block: B:75:0x020c  */
    /* JADX WARN: Code duplicated, block: B:77:0x0221  */
    /* JADX WARN: Code duplicated, block: B:79:0x0237  */
    /* JADX WARN: Code duplicated, block: B:81:0x025b  */
    /* JADX WARN: Code duplicated, block: B:83:0x0293  */
    /* JADX WARN: Code duplicated, block: B:84:0x0295  */
    /* JADX WARN: Code duplicated, block: B:86:0x029f  */
    /* JADX WARN: Code duplicated, block: B:90:0x02c1  */
    public boolean onTouchEvent(MotionEvent motionEvent) {
        String str;
        Index currentIndex;
        int index;
        int start;
        int end;
        Index indexByPosition;
        int[] iArr;
        float f;
        BarStyle barStyle;
        LineStyle lineStyle;
        ITouchListener iTouchListener;
        float f2;
        IScrollListener iScrollListener;
        if (!this.j.getInteractiveManager().isEnableInteractive()) {
            return false;
        }
        int action = motionEvent.getAction();
        float x = motionEvent.getX();
        int y = (int) motionEvent.getY();
        InteractiveLineStyle interactiveLineStyle = this.j.getRenderConfigManager().getRenderConfig().getInteractiveLineStyle();
        if (this.b == null) {
            this.b = VelocityTracker.obtain();
        }
        this.b.addMovement(motionEvent);
        if (this.j.getInteractiveManager().isEnableScale()) {
            this.f.onTouchEvent(motionEvent);
        }
        float f3 = Float.NaN;
        if (action == 0) {
            this.s = x;
            float f4 = y;
            this.t = f4;
            this.k = System.currentTimeMillis();
            this.i.forceFinished(true);
            I();
            this.j.getInteractiveManager().setCurrentDownX(x);
            this.j.getInteractiveManager().setCurrentDownY(f4);
            this.j.getInteractiveManager().setDownX(x);
            this.j.getInteractiveManager().setDownY(f4);
            this.j.invalidate();
            if (!this.j.getInteractiveManager().isEnableScroll()) {
                final Index indexByPosition2 = this.j.getHmDataCacheCenter().getIndexByPosition((this.j.getInteractiveManager().getxOffset() + x) / this.j.getInteractiveManager().getScaleFactorX(), 0.0f);
                BarStyle barStyle2 = this.j.getRenderConfigManager().getRenderConfig().getBarStyle();
                if (barStyle2 != null && barStyle2.isDownSameCancel()) {
                    String str2 = A;
                    HMLog.verbose(str2, new Function0() { // from class: vk3
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return HMTouchManager.c0();
                        }
                    });
                    if (indexByPosition2.getDataIndex() == this.j.getInteractiveManager().getCurrentIndex().getDataIndex()) {
                        HMLog.verbose(str2, new Function0() { // from class: qk3
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return HMTouchManager.d0(indexByPosition2);
                            }
                        });
                        indexByPosition2 = Index.INVALID_INDEX;
                    }
                }
                LineJoinStyle lineJoinStyle = this.j.getRenderConfigManager().getRenderConfig().getLineJoinStyle();
                if (lineJoinStyle != null && lineJoinStyle.isDownSameCancel()) {
                    String str3 = A;
                    HMLog.verbose(str3, new Function0() { // from class: xk3
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return HMTouchManager.e0();
                        }
                    });
                    if (indexByPosition2.getDataIndex() == this.j.getInteractiveManager().getCurrentIndex().getDataIndex()) {
                        HMLog.verbose(str3, new Function0() { // from class: sk3
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return HMTouchManager.f0(indexByPosition2);
                            }
                        });
                        indexByPosition2 = Index.INVALID_INDEX;
                    }
                }
                this.j.getInteractiveManager().setCurrentIndex(indexByPosition2);
                int[] iArr2 = new int[2];
                this.j.getLocationOnScreen(iArr2);
                if (indexByPosition2.getDataIndex() != -1) {
                    RectF cacheRectByDataIndex = this.j.getHmDataCacheCenter().getCacheRectByDataIndex(indexByPosition2.getDataIndex());
                    f3 = ((cacheRectByDataIndex.left + cacheRectByDataIndex.right) / 2.0f) + iArr2[0];
                }
                indexByPosition2.setCenterX(f3);
                this.r = indexByPosition2.getDataIndex();
                String str4 = A;
                HMLog.verbose(str4, new Function0() { // from class: pk3
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return HMTouchManager.g0(indexByPosition2);
                    }
                });
                if (this.l != null) {
                    HMLog.verbose(str4, new Function0() { // from class: uk3
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return HMTouchManager.h0(indexByPosition2);
                        }
                    });
                    if (interactiveLineStyle == null || isInteractiveLineTouchable()) {
                        this.l.onDown(indexByPosition2);
                    } else {
                        this.l.onTouchOutOfRange();
                        this.l.onDown(K(indexByPosition2, x, interactiveLineStyle));
                    }
                }
                this.j.invalidate();
            }
        } else if (action == 1) {
            str = A;
            HMLog.verbose(str, new Function0() { // from class: cl3
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return this.a.a0();
                }
            });
            if (!this.j.getInteractiveManager().isScaling()) {
                this.k = 0L;
                this.r = -1;
                this.j.getInteractiveManager().setCurrentDownX(Float.NaN);
                this.j.getInteractiveManager().setCurrentDownY(Float.NaN);
                if (this.j.getInteractiveManager().isEnableAutoAdjust()) {
                    currentIndex = this.j.getInteractiveManager().getCurrentIndex();
                    index = currentIndex.getPosiIndex().getIndex();
                    start = this.j.getChartDataManager().getChartDataList().getStart();
                    end = this.j.getChartDataManager().getChartDataList().getEnd();
                    if (currentIndex.getPosiIndex().getIndex() < start) {
                        index = start;
                    } else if (currentIndex.getPosiIndex().getIndex() > end) {
                        index = end;
                    }
                    this.j.getInteractiveManager().setCurrentIndex(this.j.getHmDataCacheCenter().getIndexByPosition(this.j.getHmDataCacheCenter().getPositionByPosIndex(index), 0.0f));
                }
                if (this.l != null) {
                    HMLog.verbose(str, new Function0() { // from class: bl3
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return this.a.b0();
                        }
                    });
                    this.l.onUp(this.j.getInteractiveManager().getCurrentIndex());
                }
                J(motionEvent, (int) x, y);
                this.j.invalidate();
            }
            this.j.getInteractiveManager().setMoving(false);
        } else if (action != 2) {
            if (action == 3) {
                str = A;
                HMLog.verbose(str, new Function0() { // from class: cl3
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return this.a.a0();
                    }
                });
                if (!this.j.getInteractiveManager().isScaling()) {
                    this.k = 0L;
                    this.r = -1;
                    this.j.getInteractiveManager().setCurrentDownX(Float.NaN);
                    this.j.getInteractiveManager().setCurrentDownY(Float.NaN);
                    if (this.j.getInteractiveManager().isEnableAutoAdjust()) {
                        currentIndex = this.j.getInteractiveManager().getCurrentIndex();
                        index = currentIndex.getPosiIndex().getIndex();
                        start = this.j.getChartDataManager().getChartDataList().getStart();
                        end = this.j.getChartDataManager().getChartDataList().getEnd();
                        if (currentIndex.getPosiIndex().getIndex() < start) {
                            index = start;
                        } else if (currentIndex.getPosiIndex().getIndex() > end) {
                            index = end;
                        }
                        this.j.getInteractiveManager().setCurrentIndex(this.j.getHmDataCacheCenter().getIndexByPosition(this.j.getHmDataCacheCenter().getPositionByPosIndex(index), 0.0f));
                    }
                    if (this.l != null) {
                        HMLog.verbose(str, new Function0() { // from class: bl3
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return this.a.b0();
                            }
                        });
                        this.l.onUp(this.j.getInteractiveManager().getCurrentIndex());
                    }
                    J(motionEvent, (int) x, y);
                    this.j.invalidate();
                }
                this.j.getInteractiveManager().setMoving(false);
            } else if (action == 5) {
                this.j.getInteractiveManager().setScaling(true);
                this.j.getInteractiveManager().setMoving(false);
            } else if (action == 6) {
                this.j.getInteractiveManager().setScaling(false);
            }
        } else if (!this.j.getInteractiveManager().isScaling() && motionEvent.getPointerCount() == 1) {
            int i = (int) (x - this.p);
            if (!this.j.getInteractiveManager().isMoving()) {
                int i2 = y - this.q;
                if (Math.abs(x - this.s) > this.c && Math.abs(i) > Math.abs(i2)) {
                    this.j.getInteractiveManager().setMoving(true);
                    if (this.j.getInteractiveManager().isEnableScroll()) {
                        f2 = x - this.p;
                        iScrollListener = this.m;
                        if (iScrollListener != null) {
                            iScrollListener.offset(this.j.getInteractiveManager().getxOffset() - f2);
                        }
                        r0(this.j.getInteractiveManager().getxOffset() - f2);
                        this.j.invalidate();
                    } else if (System.currentTimeMillis() - this.k >= 100) {
                        this.j.getParent().requestDisallowInterceptTouchEvent(true);
                        this.j.getInteractiveManager().setCurrentDownX(x);
                        float f5 = y;
                        this.j.getInteractiveManager().setCurrentDownY(f5);
                        this.j.getInteractiveManager().setDownX(x);
                        this.j.getInteractiveManager().setDownY(f5);
                        indexByPosition = this.j.getHmDataCacheCenter().getIndexByPosition(this.j.getInteractiveManager().getxOffset() + x, f5 + this.j.getInteractiveManager().getyOffset());
                        this.j.getInteractiveManager().setCurrentIndex(indexByPosition);
                        iArr = new int[2];
                        this.j.getLocationOnScreen(iArr);
                        if (indexByPosition.getDataIndex() != -1) {
                            RectF cacheRectByDataIndex2 = this.j.getHmDataCacheCenter().getCacheRectByDataIndex(indexByPosition.getDataIndex());
                            f = ((cacheRectByDataIndex2.left + cacheRectByDataIndex2.right) / 2.0f) + iArr[0];
                        } else {
                            f = x;
                        }
                        indexByPosition.setCenterX(f);
                        barStyle = this.j.getRenderConfigManager().getRenderConfig().getBarStyle();
                        if (barStyle == null && barStyle.isInteractiveSlide()) {
                            ITouchListener iTouchListener2 = this.l;
                            if (iTouchListener2 != null) {
                                iTouchListener2.onDown(indexByPosition);
                            }
                            this.j.invalidate();
                        } else if (this.r != indexByPosition.getDataIndex()) {
                            this.r = indexByPosition.getDataIndex();
                            lineStyle = this.j.getRenderConfigManager().getRenderConfig().getLineStyle();
                            SectionLineStyle sectionLineStyle = this.j.getRenderConfigManager().getRenderConfig().getSectionLineStyle();
                            if ((lineStyle == null && lineStyle.isInteractiveSlide()) || (sectionLineStyle != null && sectionLineStyle.isInteractiveSlide())) {
                                iTouchListener = this.l;
                                if (iTouchListener != null) {
                                    iTouchListener.onDown(indexByPosition);
                                }
                                this.j.invalidate();
                            }
                        }
                        if (interactiveLineStyle != null) {
                            if (this.l != null) {
                                if (isInteractiveLineTouchable()) {
                                    this.l.onDown(indexByPosition);
                                } else {
                                    this.l.onTouchOutOfRange();
                                    this.l.onDown(K(indexByPosition, x, interactiveLineStyle));
                                }
                            }
                            this.j.invalidate();
                        }
                    }
                }
            } else if (this.j.getInteractiveManager().isEnableScroll()) {
                f2 = x - this.p;
                iScrollListener = this.m;
                if (iScrollListener != null) {
                    iScrollListener.offset(this.j.getInteractiveManager().getxOffset() - f2);
                }
                r0(this.j.getInteractiveManager().getxOffset() - f2);
                this.j.invalidate();
            } else if (System.currentTimeMillis() - this.k >= 100) {
                this.j.getParent().requestDisallowInterceptTouchEvent(true);
                this.j.getInteractiveManager().setCurrentDownX(x);
                float f6 = y;
                this.j.getInteractiveManager().setCurrentDownY(f6);
                this.j.getInteractiveManager().setDownX(x);
                this.j.getInteractiveManager().setDownY(f6);
                indexByPosition = this.j.getHmDataCacheCenter().getIndexByPosition(this.j.getInteractiveManager().getxOffset() + x, f6 + this.j.getInteractiveManager().getyOffset());
                this.j.getInteractiveManager().setCurrentIndex(indexByPosition);
                iArr = new int[2];
                this.j.getLocationOnScreen(iArr);
                if (indexByPosition.getDataIndex() != -1) {
                    RectF cacheRectByDataIndex3 = this.j.getHmDataCacheCenter().getCacheRectByDataIndex(indexByPosition.getDataIndex());
                    f = ((cacheRectByDataIndex3.left + cacheRectByDataIndex3.right) / 2.0f) + iArr[0];
                } else {
                    f = x;
                }
                indexByPosition.setCenterX(f);
                barStyle = this.j.getRenderConfigManager().getRenderConfig().getBarStyle();
                if (barStyle == null) {
                    if (this.r != indexByPosition.getDataIndex()) {
                        this.r = indexByPosition.getDataIndex();
                        lineStyle = this.j.getRenderConfigManager().getRenderConfig().getLineStyle();
                        SectionLineStyle sectionLineStyle2 = this.j.getRenderConfigManager().getRenderConfig().getSectionLineStyle();
                        if (lineStyle == null) {
                            iTouchListener = this.l;
                            if (iTouchListener != null) {
                                iTouchListener.onDown(indexByPosition);
                            }
                            this.j.invalidate();
                        } else {
                            iTouchListener = this.l;
                            if (iTouchListener != null) {
                                iTouchListener.onDown(indexByPosition);
                            }
                            this.j.invalidate();
                        }
                    }
                } else if (this.r != indexByPosition.getDataIndex()) {
                    this.r = indexByPosition.getDataIndex();
                    lineStyle = this.j.getRenderConfigManager().getRenderConfig().getLineStyle();
                    SectionLineStyle sectionLineStyle3 = this.j.getRenderConfigManager().getRenderConfig().getSectionLineStyle();
                    if (lineStyle == null) {
                        iTouchListener = this.l;
                        if (iTouchListener != null) {
                            iTouchListener.onDown(indexByPosition);
                        }
                        this.j.invalidate();
                    } else {
                        iTouchListener = this.l;
                        if (iTouchListener != null) {
                            iTouchListener.onDown(indexByPosition);
                        }
                        this.j.invalidate();
                    }
                }
                if (interactiveLineStyle != null) {
                    if (this.l != null) {
                        if (isInteractiveLineTouchable()) {
                            this.l.onDown(indexByPosition);
                        } else {
                            this.l.onTouchOutOfRange();
                            this.l.onDown(K(indexByPosition, x, interactiveLineStyle));
                        }
                    }
                    this.j.invalidate();
                }
            }
        }
        this.p = x;
        this.q = y;
        return true;
    }

    public void setChartScrollListener(IScrollListener iScrollListener) {
        this.m = iScrollListener;
    }

    public void setChartTouchListener(ITouchListener iTouchListener) {
        this.l = iTouchListener;
    }

    public void setCurrentOffset(float f) {
        r0(f);
        this.j.invalidate();
    }

    public void setCurrentOffset(final Index index) {
        if (index == null || index.isInvalidate() || index.getPosiIndex() == null || index.getPosiIndex().getIndex() < 0) {
            return;
        }
        String str = A;
        HMLog.verbose(str, new Function0() { // from class: rk3
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return HMTouchManager.o0(index);
            }
        });
        final float scaleFactorX = (this.j.getInteractiveManager().getScaleFactorX() * this.j.getHmDataCacheCenter().getPositionByPosIndex(index.getPosiIndex().getIndex())) - ((this.j.getDrawAreaManager().getRight() - this.j.getDrawAreaManager().getLeft()) / 2.0f);
        HMLog.verbose(str, new Function0() { // from class: ik3
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return HMTouchManager.p0(scaleFactorX);
            }
        });
        this.w = scaleFactorX;
        this.j.getInteractiveManager().setCurrentIndex(index);
        if (this.j.getInteractiveManager().isEnableScroll()) {
            r0(scaleFactorX);
        }
        this.j.invalidate();
    }
}
