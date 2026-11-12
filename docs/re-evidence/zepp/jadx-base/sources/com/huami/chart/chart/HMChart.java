package com.huami.chart.chart;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import com.huami.chart.cache.HMDataCacheCenter;
import com.huami.chart.chart.HMChart;
import com.huami.chart.data.ChartData;
import com.huami.chart.data.ChartDataManager;
import com.huami.chart.interact.HMTouchManager;
import com.huami.chart.interact.InteractiveManager;
import com.huami.chart.listener.IScrollListener;
import com.huami.chart.listener.ITouchListener;
import com.huami.chart.provider.DrawAreaManager;
import com.huami.chart.provider.RenderConfigManager;
import com.huami.chart.render.RenderFactory;
import com.huami.chart.util.ChartUtil;
import com.huami.tools.log.HMLog;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes6.dex */
public class HMChart extends View implements InteractiveManager.OnScrollStateChanged {
    public static final int INDED_DURATION = 50;
    public static final int SCALE_DURATION = 180;
    private static final String r = HMChart.class.getSimpleName();
    private Context a;
    private RenderFactory b;
    private IChartProvider c;
    private ChartDataManager d;
    private HMTouchManager e;
    private HMDataCacheCenter f;
    private InteractiveManager g;
    private RenderConfigManager h;
    private DrawAreaManager i;
    private boolean j;
    private int k;
    private int l;
    private IScrollListener m;
    private boolean n;
    private boolean o;
    private ValueAnimator p;
    private ValueAnimator q;

    public class a implements ValueAnimator.AnimatorUpdateListener {
        public a() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            if (HMChart.this.o) {
                return;
            }
            HMChart.this.g.setCurrentScale(((Float) valueAnimator.getAnimatedValue()).floatValue());
            HMChart.this.invalidate();
        }
    }

    public class b implements ValueAnimator.AnimatorUpdateListener {
        public b() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            if (HMChart.this.n) {
                return;
            }
            HMChart.this.e.setCurrentOffset(((Float) valueAnimator.getAnimatedValue()).floatValue());
            HMChart.this.invalidate();
        }
    }

    public class c implements Animator.AnimatorListener {
        public c() {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (HMChart.this.m != null) {
                HMChart.this.m.onStopIndex(HMChart.this.g.getCurrentIndex());
            }
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
        }
    }

    public HMChart(Context context) {
        this(context, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String A() {
        return "refershData...";
    }

    private float getDrawAreaEnd() {
        return ChartUtil.isRtl(this) ? getDrawAreaManager().getLeft() : getDrawAreaManager().getRight();
    }

    private float getDrawAreaStart() {
        return ChartUtil.isRtl(this) ? getDrawAreaManager().getRight() : getDrawAreaManager().getLeft();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String q(float f) {
        return "destination " + f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String r() {
        return "onScrollStoped ";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String s() {
        return "return no data count";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ String t() {
        return "end " + this.l + " factorX " + this.g.getScaleFactorX();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ String u() {
        return "start " + this.k + " end " + this.l + " totalcount " + this.d.getChartDataList().getCount();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ String v(float f) {
        return "dataMax " + this.d.getChartDataList().getMaxDataValue() + " curMax " + f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ String w(float f) {
        return "from " + this.g.getCurrentScale() + "  to " + f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String x(float f) {
        return "currentOffset " + f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ String y() {
        return "currentIndex " + this.g.getCurrentIndex();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String z() {
        return "refershData...";
    }

    @Override // android.view.View
    public void computeScroll() {
        this.e.computeScroll();
    }

    public HMChart getChart() {
        return this;
    }

    public ChartDataManager getChartDataManager() {
        return this.d;
    }

    public IChartProvider getChartProvider() {
        return this.c;
    }

    public DrawAreaManager getDrawAreaManager() {
        return this.i;
    }

    public HMDataCacheCenter getHmDataCacheCenter() {
        return this.f;
    }

    public HMTouchManager getHmTouchManager() {
        return this.e;
    }

    public ValueAnimator getIndexAnimator() {
        return this.p;
    }

    public InteractiveManager getInteractiveManager() {
        return this.g;
    }

    public RenderConfigManager getRenderConfigManager() {
        return this.h;
    }

    public ValueAnimator getScaleAnimator() {
        return this.q;
    }

    public IScrollListener getiScrollListener() {
        return this.m;
    }

    public boolean isIgnoreRTL() {
        return this.j;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        this.b.render(canvas, this.k, this.l, this.g.getCurrentScale());
    }

    @Override // com.huami.chart.interact.InteractiveManager.OnScrollStateChanged
    public void onScrollStoped() {
        float scaleFactorX;
        float right;
        String str = r;
        HMLog.verbose(str, new Function0() { // from class: op2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return HMChart.r();
            }
        });
        if (this.d.getChartDataList().getCount() == 0) {
            HMLog.verbose(str, new Function0() { // from class: wp2
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return HMChart.s();
                }
            });
            return;
        }
        if (this.g.isEnableScale()) {
            int start = this.f.getIndexByPosition((this.g.getxOffset() + getDrawAreaStart()) / this.g.getScaleFactorX(), 0.0f).getPosiIndex().getStart();
            this.k = start;
            int i = start - 1;
            this.k = i;
            if (i < 0) {
                i = 0;
            }
            this.k = i;
            int start2 = this.f.getIndexByPosition((this.g.getxOffset() + getDrawAreaEnd()) / this.g.getScaleFactorX(), 0.0f).getPosiIndex().getStart();
            this.l = start2;
            this.l = start2 + 1;
            HMLog.verbose(str, new Function0() { // from class: sp2
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return this.a.t();
                }
            });
            this.l = Math.min(this.l, this.d.getChartDataList().getEnd());
            final float sumValue = Float.MIN_VALUE;
            HMLog.verbose(str, new Function0() { // from class: rp2
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return this.a.u();
                }
            });
            for (int i2 = this.k - 1; i2 <= this.l; i2++) {
                ChartData dataByPositionIndex = this.d.getDataByPositionIndex(i2);
                if (dataByPositionIndex != null && dataByPositionIndex.getSumValue() > sumValue) {
                    sumValue = dataByPositionIndex.getSumValue();
                }
            }
            final float maxDataValue = this.d.getChartDataList().getMaxDataValue() / sumValue;
            String str2 = r;
            HMLog.verbose(str2, new Function0() { // from class: up2
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return this.a.v(sumValue);
                }
            });
            HMLog.verbose(str2, new Function0() { // from class: tp2
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return this.a.w(maxDataValue);
                }
            });
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(this.g.getCurrentScale(), maxDataValue);
            this.q = valueAnimatorOfFloat;
            valueAnimatorOfFloat.setDuration(180L);
            this.o = false;
            this.q.start();
            this.q.addUpdateListener(new a());
        }
        final float f = this.g.getxOffset();
        if (this.g.isAnchorCenter()) {
            right = (this.i.getRight() - this.i.getLeft()) / 2.0f;
            scaleFactorX = (f + right) / this.g.getScaleFactorX();
        } else {
            scaleFactorX = f;
            right = 0.0f;
        }
        this.g.setCurrentIndex(this.f.getIndexByPosition(scaleFactorX, 0.0f));
        String str3 = r;
        HMLog.verbose(str3, new Function0() { // from class: pp2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return HMChart.x(f);
            }
        });
        HMLog.verbose(str3, new Function0() { // from class: qp2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return this.a.y();
            }
        });
        final float positionByPosIndex = (this.f.getPositionByPosIndex(this.g.getCurrentIndex().getPosiIndex().getIndex()) * this.g.getScaleFactorX()) - right;
        HMLog.verbose(str3, new Function0() { // from class: np2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return HMChart.q(positionByPosIndex);
            }
        });
        ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(f, positionByPosIndex);
        this.p = valueAnimatorOfFloat2;
        valueAnimatorOfFloat2.setDuration(50L);
        this.n = false;
        this.p.start();
        this.p.addUpdateListener(new b());
        this.p.addListener(new c());
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        return this.e.onTouchEvent(motionEvent);
    }

    public void refreshData(boolean z, IChartProvider iChartProvider) {
        this.c = iChartProvider;
        this.d.setChartDataList(iChartProvider.getChartDataList());
        if (this.c.getMultiChartDataList() != null) {
            this.d.setMultiChartDataList(this.c.getMultiChartDataList());
        }
        if (this.c.getPointChartDataList() != null) {
            this.d.setPointChartDataList(this.c.getPointChartDataList());
        }
        this.g.setScrollStateChangeListener(this);
        if (!z) {
            this.g.setCurrentScale(1.0f);
        }
        this.h.setRenderConfig(this.c.getRenderConfig());
        this.i.setDrawConfig(this.c.getDrawConfig());
        this.g.setCurrentIndex(iChartProvider.getCurrentIndex());
        HMLog.verbose(r, new Function0() { // from class: xp2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return HMChart.z();
            }
        });
        this.f.calculate();
        this.e.setCurrentOffset(iChartProvider.getCurrentIndex());
        this.b = this.b.init(this).with(this.h.getRenderConfig().getLineStyle()).with(this.h.getRenderConfig().getBarStyle()).with(this.h.getRenderConfig().getAxisStyle()).with(this.h.getRenderConfig().getBackgroundStyle()).with(this.h.getRenderConfig().getValueStyle()).with(this.h.getRenderConfig().getGoalLineStyle()).with(this.h.getRenderConfig().getLineJoinStyle()).with(this.h.getRenderConfig().getPointStyle()).with(this.h.getRenderConfig().getMultiLineStyle()).with(this.h.getRenderConfig().getNoDataStyle()).with(this.h.getRenderConfig().getInteractiveLineStyle()).with(this.h.getRenderConfig().getSectionLineStyle());
        postInvalidate();
    }

    public void registerTouchListener(ITouchListener iTouchListener) {
        this.e.setChartTouchListener(iTouchListener);
    }

    public void setAnchorCenter(boolean z) {
        this.g.setAnchorCenter(z);
    }

    public void setEnableAutoAdjust(boolean z) {
        this.g.setEnableAutoAdjust(z);
    }

    public void setEnableScale(boolean z) {
        this.g.setEnableScale(z);
    }

    public void setIScrollListener(IScrollListener iScrollListener) {
        this.m = iScrollListener;
        this.e.setChartScrollListener(iScrollListener);
    }

    public void setIgnoreRTL(boolean z) {
        this.j = z;
    }

    public void setIndexAnimatorCancel(boolean z) {
        this.n = z;
    }

    public void setInteractive(boolean z, boolean z2, boolean z3) {
        this.g.setEnableInteractive(z);
        this.g.setEnableScroll(z2);
        this.g.setEnableAutoAdjust(z3);
    }

    public void setScaleAnimatorcancel(boolean z) {
        this.o = z;
    }

    public void setScaleFactorX(float f) {
        InteractiveManager interactiveManager = this.g;
        if (interactiveManager != null) {
            interactiveManager.setScaleFactorX(f);
            invalidate();
        }
    }

    public void startPreAnim() {
    }

    public void startRefreshingAnim() {
    }

    public HMChart(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public HMChart(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.j = false;
        this.k = -1;
        this.l = -1;
        this.n = false;
        this.o = false;
        this.a = context;
        setLayerType(1, null);
        this.b = new RenderFactory();
        this.d = new ChartDataManager(this);
        this.e = new HMTouchManager(this);
        this.i = new DrawAreaManager(this);
        this.f = new HMDataCacheCenter(this);
        this.g = new InteractiveManager(this);
        this.h = new RenderConfigManager(this);
    }

    public void setInteractive(boolean z, boolean z2) {
        this.g.setEnableInteractive(z);
        this.g.setEnableScroll(z2);
    }

    public void refreshData(IChartProvider iChartProvider) {
        this.c = iChartProvider;
        this.d.setChartDataList(iChartProvider.getChartDataList());
        if (this.c.getMultiChartDataList() != null) {
            this.d.setMultiChartDataList(this.c.getMultiChartDataList());
        }
        if (this.c.getPointChartDataList() != null) {
            this.d.setPointChartDataList(this.c.getPointChartDataList());
        }
        this.g.setScrollStateChangeListener(this);
        this.h.setRenderConfig(this.c.getRenderConfig());
        this.i.setDrawConfig(this.c.getDrawConfig());
        this.g.setCurrentIndex(iChartProvider.getCurrentIndex());
        HMLog.verbose(r, new Function0() { // from class: vp2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return HMChart.A();
            }
        });
        this.f.calculate();
        this.e.setCurrentOffset(iChartProvider.getCurrentIndex());
        this.b = this.b.init(this).with(this.h.getRenderConfig().getLineStyle()).with(this.h.getRenderConfig().getBarStyle()).with(this.h.getRenderConfig().getAxisStyle()).with(this.h.getRenderConfig().getBackgroundStyle()).with(this.h.getRenderConfig().getValueStyle()).with(this.h.getRenderConfig().getGoalLineStyle()).with(this.h.getRenderConfig().getLineJoinStyle()).with(this.h.getRenderConfig().getPointStyle()).with(this.h.getRenderConfig().getMultiLineStyle()).with(this.h.getRenderConfig().getNoDataStyle()).with(this.h.getRenderConfig().getInteractiveLineStyle()).with(this.h.getRenderConfig().getSectionLineStyle());
        postInvalidate();
    }
}
