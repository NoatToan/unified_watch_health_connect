package com.huawei.ui.commonui.interval;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.huawei.haf.application.BaseApplication;
import com.huawei.openalliance.ad.constant.VastTag;
import com.huawei.ui.commonui.R;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.commonui.view.FlowingLight;
import com.huawei.ui.commonui.view.FlowingLightSurface;
import com.huawei.ui.commonui.view.GradientShadow;
import defpackage.qlm;
import defpackage.qlq;
import defpackage.qqn;
import defpackage.qre;
import health.compact.a.LogUtil;
import health.compact.a.ReleaseLogUtil;
import health.compact.a.UnitUtil;
import java.util.List;

/* JADX INFO: loaded from: classes16.dex */
public class IntervalCard extends FrameLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Drawable f23571a;
    private float aa;
    private String ac;
    private float ad;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private HealthTextView f23572b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private View f23573c;
    private IntervalCardData.CardType d;
    private Context e;
    private FlowingLight f;
    private final int[] g;
    private float h;
    private FlowingLightSurface i;
    private HealthTextView j;
    private float k;
    private boolean l;
    private float m;
    private Interval n;
    private GradientShadow o;
    private boolean p;
    private boolean q;
    private boolean r;
    private int s;
    private boolean t;
    private final int[] u;
    private final int[] v;
    private final int[] w;
    private float x;
    private final int[] y;
    private float z;

    public IntervalCard(Context context) {
        super(context);
        this.w = new int[4];
        this.g = new int[4];
        this.y = new int[3];
        this.u = new int[2];
        this.v = new int[4];
        e(context, (AttributeSet) null);
    }

    public IntervalCard(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.w = new int[4];
        this.g = new int[4];
        this.y = new int[3];
        this.u = new int[2];
        this.v = new int[4];
        e(context, attributeSet);
    }

    public IntervalCard(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.w = new int[4];
        this.g = new int[4];
        this.y = new int[3];
        this.u = new int[2];
        this.v = new int[4];
        e(context, attributeSet);
    }

    private void e(Context context, AttributeSet attributeSet) {
        a(context, attributeSet);
        a(getView());
        this.f23571a = qre.d(this.e, R.drawable.icon_cursor_triangle_down);
    }

    private void a(Context context, AttributeSet attributeSet) {
        if (context == null || attributeSet == null) {
            return;
        }
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.IntervalCard);
        this.f23571a = typedArrayObtainStyledAttributes.getDrawable(R.styleable.IntervalCard_intervalCardCursorDrawable);
        this.h = typedArrayObtainStyledAttributes.getDimension(R.styleable.IntervalCard_intervalCardCursorVerticalOffset, 0.0f);
        this.x = typedArrayObtainStyledAttributes.getDimension(R.styleable.IntervalCard_intervalCardSingleIntervalHeight, 0.0f);
        this.k = typedArrayObtainStyledAttributes.getDimension(R.styleable.IntervalCard_intervalCardIntervalShadowHeight, 0.0f);
        this.m = typedArrayObtainStyledAttributes.getDimension(R.styleable.IntervalCard_intervalCardIntervalRoundCornerRadius, 0.0f);
        this.ad = typedArrayObtainStyledAttributes.getDimension(R.styleable.IntervalCard_intervalCardTextBackgroundHeight, 0.0f);
        this.aa = typedArrayObtainStyledAttributes.getDimension(R.styleable.IntervalCard_intervalCardTextBackgroundVerticalOffset, 0.0f);
        this.z = typedArrayObtainStyledAttributes.getDimension(R.styleable.IntervalCard_intervalCardTextBackgroundRoundCornerRadius, 0.0f);
        this.ac = typedArrayObtainStyledAttributes.getString(R.styleable.IntervalCard_intervalCardTransitionName);
        typedArrayObtainStyledAttributes.recycle();
    }

    private View getView() {
        int i = R.layout.layout_interval_card_small;
        if (this.d != null) {
            int i2 = AnonymousClass2.f23574a[this.d.ordinal()];
            if (i2 == 1) {
                i = R.layout.layout_interval_card_large;
            } else if (i2 == 2) {
                i = R.layout.layout_interval_card_medium;
            }
        }
        return qre.a(BaseApplication.b(), i, this);
    }

    /* JADX INFO: renamed from: com.huawei.ui.commonui.interval.IntervalCard$2, reason: invalid class name */
    static /* synthetic */ class AnonymousClass2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f23574a;

        static {
            int[] iArr = new int[IntervalCardData.CardType.values().length];
            f23574a = iArr;
            try {
                iArr[IntervalCardData.CardType.LARGE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f23574a[IntervalCardData.CardType.MEDIUM.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    private void a(View view) {
        if (view == null) {
            ReleaseLogUtil.d("R_IntervalCard", "initView view is null this ", this);
            return;
        }
        setTransitionName("IntervalCard" + this.ac);
        View viewFindViewById = view.findViewById(R.id.interval_card_background);
        this.f23573c = viewFindViewById;
        viewFindViewById.setTransitionName("Background" + this.ac);
        Interval interval = (Interval) view.findViewById(R.id.interval_card_interval);
        this.n = interval;
        interval.setTransitionName("Interval" + this.ac);
        HealthTextView healthTextView = (HealthTextView) view.findViewById(R.id.interval_card_content);
        this.f23572b = healthTextView;
        healthTextView.setTransitionName("Content" + this.ac);
        HealthTextView healthTextView2 = (HealthTextView) view.findViewById(R.id.interval_card_description);
        this.j = healthTextView2;
        healthTextView2.setTransitionName(VastTag.DESCRIPTION + this.ac);
        this.o = null;
        View viewFindViewById2 = view.findViewById(R.id.interval_card_shadow);
        viewFindViewById2.setTransitionName("Shadow" + this.ac);
        if (viewFindViewById2 instanceof GradientShadow) {
            this.o = (GradientShadow) viewFindViewById2;
        }
        this.f = null;
        this.i = null;
        View viewFindViewById3 = view.findViewById(R.id.interval_card_flowing_light);
        viewFindViewById3.setTransitionName("FlowingLight" + this.ac);
        if (viewFindViewById3 instanceof FlowingLight) {
            this.f = (FlowingLight) viewFindViewById3;
        } else if (viewFindViewById3 instanceof FlowingLightSurface) {
            this.i = (FlowingLightSurface) viewFindViewById3;
        }
    }

    private void e() {
        View view = this.f23573c;
        if (view == null) {
            ReleaseLogUtil.d("R_IntervalCard", "setBackground mBackground is null this ", this);
            return;
        }
        Drawable background = view.getBackground();
        if (background == null) {
            ReleaseLogUtil.d("R_IntervalCard", "setBackground drawable is null this ", this);
            return;
        }
        Drawable drawableMutate = background.mutate();
        setShapeBackground(drawableMutate);
        setShapeGradient(drawableMutate);
    }

    private GradientDrawable c(Drawable drawable, int i) {
        if (!(drawable instanceof LayerDrawable)) {
            return null;
        }
        Drawable drawableFindDrawableByLayerId = ((LayerDrawable) drawable).findDrawableByLayerId(i);
        if (drawableFindDrawableByLayerId instanceof GradientDrawable) {
            return (GradientDrawable) drawableFindDrawableByLayerId;
        }
        return null;
    }

    private void setShapeBackground(Drawable drawable) {
        GradientDrawable gradientDrawableC = c(drawable, R.id.interval_card_shape_background);
        if (gradientDrawableC == null) {
            ReleaseLogUtil.d("R_IntervalCard", "setShapeBackground shapeBackground is null this ", this);
            return;
        }
        int i = R.color.interval_card_shape_background;
        int i2 = R.dimen.health_common_16dp;
        if (this.r) {
            i = R.color.interval_card_shape_background_large;
            i2 = R.dimen.health_common_32dp;
        }
        gradientDrawableC.setColor(qre.e(this.e, i));
        gradientDrawableC.setCornerRadius(qre.a(i2));
    }

    private void setShapeGradient(Drawable drawable) {
        int[] iArr;
        int[] iArr2;
        GradientDrawable gradientDrawableC = c(drawable, R.id.interval_card_shape_gradient);
        if (gradientDrawableC == null) {
            ReleaseLogUtil.d("R_IntervalCard", "setShapeGradient shapeGradient is null this ", this);
            return;
        }
        int i = R.dimen.health_common_16dp;
        if (this.r) {
            i = R.dimen.health_common_32dp;
            if (this.l) {
                iArr = this.y;
                iArr[0] = 0;
                iArr[1] = 0;
                iArr[2] = 0;
            } else {
                int iD = qqn.d(this.s, 0.08f);
                int iD2 = qqn.d(this.s, 0.02f);
                if (Build.VERSION.SDK_INT < 29) {
                    iArr2 = this.y;
                    iArr2[0] = iD;
                    iArr2[1] = iD;
                    iArr2[2] = iD2;
                } else {
                    iArr2 = this.v;
                    iArr2[0] = iD;
                    iArr2[1] = iD;
                    iArr2[2] = iD2;
                    iArr2[3] = iD2;
                }
                iArr = iArr2;
            }
        } else if (this.l) {
            int iD3 = qqn.d(this.s, 0.2f);
            int iD4 = qqn.d(this.s, 0.0f);
            if (Build.VERSION.SDK_INT < 29) {
                iArr2 = this.y;
                iArr2[0] = iD3;
                iArr2[1] = iD3;
                iArr2[2] = iD4;
            } else {
                iArr2 = this.u;
                iArr2[0] = iD3;
                iArr2[1] = iD4;
            }
            iArr = iArr2;
        } else {
            int iD5 = qqn.d(this.s, 0.1f);
            int iD6 = qqn.d(this.s, 0.05f);
            int[] iArr3 = this.y;
            iArr3[0] = iD5;
            iArr3[1] = iD5;
            iArr3[2] = iD6;
            iArr = iArr3;
        }
        gradientDrawableC.setColors(iArr);
        gradientDrawableC.setCornerRadius(qre.a(i));
    }

    private void h() {
        int iD;
        int iD2;
        GradientShadow gradientShadow = this.o;
        if (gradientShadow == null) {
            return;
        }
        gradientShadow.setVisibility(this.p ? 0 : 4);
        if (this.l) {
            iD = this.s;
            iD2 = qqn.d(-1, 0.6f);
        } else {
            iD = qqn.d(this.s, 0.6f);
            iD2 = qqn.d(this.s, 0.1f);
        }
        int[] iArr = this.w;
        iArr[0] = iD;
        iArr[1] = iD2;
        iArr[2] = iD2;
        iArr[3] = iD;
        this.o.setColorArray(iArr);
    }

    private void c() {
        int iD;
        int iD2;
        int i;
        int iD3;
        if (this.l) {
            iD = this.s;
            i = -1;
            if (this.r) {
                iD3 = qqn.d(-1, 0.5f);
            } else {
                iD2 = qqn.d(-1, 0.0f);
            }
            int[] iArr = this.g;
            iArr[0] = iD;
            iArr[1] = iD3;
            iArr[2] = i;
            iArr[3] = iD;
        }
        iD = qqn.d(this.s, 0.9f);
        iD2 = qqn.d(this.s, 0.1f);
        i = iD2;
        iD3 = i;
        int[] iArr2 = this.g;
        iArr2[0] = iD;
        iArr2[1] = iD3;
        iArr2[2] = i;
        iArr2[3] = iD;
    }

    private void d() {
        if (this.f == null) {
            return;
        }
        c();
        this.f.setVisibility(this.t ? 0 : 4);
        this.f.setColorArray(this.g);
    }

    private void j() {
        if (this.i == null) {
            return;
        }
        c();
        this.i.setVisibility(this.t ? 0 : 4);
        this.i.setColorArray(this.g);
    }

    private void d(HealthTextView healthTextView, CharSequence charSequence) {
        if (healthTextView == null) {
            ReleaseLogUtil.d("R_IntervalCard", "setContext view is null this ", this);
        } else {
            healthTextView.setText(charSequence);
            healthTextView.setTextColor(this.s);
        }
    }

    private void e(HealthTextView healthTextView, CharSequence charSequence) {
        if (healthTextView == null) {
            ReleaseLogUtil.d("R_IntervalCard", "setDescription view is null this ", this);
        } else {
            healthTextView.setText(charSequence);
            healthTextView.setTextColor(qre.e(this.e, R.color.textColorSecondary));
        }
    }

    private void setSingleIntervalHeight(IntervalData intervalData) {
        if (this.x <= 0.0f || intervalData.a() > 0.0f) {
            return;
        }
        intervalData.c(this.x);
    }

    private void setIntervalShadowHeight(IntervalData intervalData) {
        if (this.k <= 0.0f || intervalData.e() > 0.0f) {
            return;
        }
        intervalData.a(this.k);
    }

    private void setIntervalRoundCornerRadius(IntervalData intervalData) {
        if (this.m <= 0.0f || intervalData.c() > 0.0f) {
            return;
        }
        intervalData.e(this.m);
    }

    private void setCursorVerticalOffset(qlm qlmVar) {
        if (this.h == 0.0f || qlmVar == null || qlmVar.b() != 0.0f) {
            return;
        }
        qlmVar.e(this.h);
    }

    private void setTextBackgroundColor(qlq qlqVar) {
        int i = this.s;
        if (i == 0 || qlqVar == null) {
            return;
        }
        qlqVar.b(i);
    }

    private void setTextBackgroundHeight(qlq qlqVar) {
        if (this.ad <= 0.0f || qlqVar == null || qlqVar.a() > 0.0f) {
            return;
        }
        qlqVar.a(this.ad);
    }

    private void setTextBackgroundVerticalOffset(qlq qlqVar) {
        if (this.aa == 0.0f || qlqVar == null || qlqVar.b() != 0.0f) {
            return;
        }
        qlqVar.d(this.aa);
    }

    private void setTextBackgroundRoundCornerRadius(qlq qlqVar) {
        if (this.z <= 0.0f || qlqVar == null || qlqVar.e() <= 0.0f) {
            return;
        }
        qlqVar.b(this.z);
    }

    private void setIntervalDataList(IntervalCardData intervalCardData) {
        if (this.n == null) {
            ReleaseLogUtil.d("R_IntervalCard", "setIntervalDataList mInterval is null this ", this);
            return;
        }
        int iE = qre.e(this.e, R.color.common_white_0alpha);
        List<IntervalData> listC = intervalCardData.c();
        for (IntervalData intervalData : listC) {
            if (intervalData != null) {
                setSingleIntervalHeight(intervalData);
                setIntervalShadowHeight(intervalData);
                setIntervalRoundCornerRadius(intervalData);
                intervalData.a(qqn.d(intervalData.d(this.e), 0.25f));
                intervalData.e(iE);
                qlm qlmVarB = intervalData.b();
                if (qlmVarB != null) {
                    qlmVarB.e(this.f23571a);
                }
                setCursorVerticalOffset(qlmVarB);
                qlq qlqVarF = intervalData.f();
                if (qlqVarF != null) {
                    qlqVarF.d(this.r);
                }
                setTextBackgroundColor(qlqVarF);
                setTextBackgroundHeight(qlqVarF);
                setTextBackgroundVerticalOffset(qlqVarF);
                setTextBackgroundRoundCornerRadius(qlqVarF);
            }
        }
        this.n.setIntervalDataList(this.e, listC);
    }

    public void setData(boolean z, Context context, IntervalCardData intervalCardData) {
        String str;
        if (context == null || intervalCardData == null) {
            ReleaseLogUtil.d("R_IntervalCard", "setData context ", context, " data ", intervalCardData, " isDarkMode ", Boolean.valueOf(z), " mIsDarkMode ", Boolean.valueOf(this.l), " this ", this);
            return;
        }
        Context context2 = this.e;
        boolean z2 = context2 != context;
        if (z2) {
            str = "IntervalCard";
            LogUtil.b(str, "setData mIsDarkMode ", Boolean.valueOf(this.l), " isDarkMode ", Boolean.valueOf(z), " mContext ", context2, " context ", context, " this ", this);
            this.e = context;
        } else {
            str = "IntervalCard";
        }
        this.l = z;
        this.s = intervalCardData.b(this.e);
        IntervalCardData.CardType cardTypeD = intervalCardData.d();
        boolean z3 = (cardTypeD == null || this.d == cardTypeD) ? false : true;
        if (z3) {
            LogUtil.b(str, "setData mCardType ", this.d, " cardType ", cardTypeD, " this ", this);
            removeAllViews();
            this.d = cardTypeD;
            a(getView());
        }
        this.q = IntervalCardData.CardType.MEDIUM == this.d;
        boolean z4 = IntervalCardData.CardType.LARGE == this.d;
        this.r = z4;
        if (z2 || z3 || this.f23571a == null) {
            LogUtil.b(str, "setData mIsLargeCardType ", Boolean.valueOf(z4), " mCursorDrawable ", this.f23571a, " this ", this);
            if (this.r) {
                this.f23571a = qre.d(this.e, R.drawable.icon_cursor_triangle_up);
            } else {
                this.f23571a = qre.d(this.e, R.drawable.icon_cursor_triangle_down);
            }
        }
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams != null) {
            int iD = (int) UnitUtil.d(intervalCardData.f(), 0);
            int i = layoutParams.width;
            if (iD > 0 && i != iD) {
                LogUtil.b(str, "setData currentWidth ", Integer.valueOf(i), " width ", Integer.valueOf(iD), " this ", this);
                layoutParams.width = iD;
            }
            int iD2 = (int) UnitUtil.d(intervalCardData.a(), 0);
            int i2 = layoutParams.height;
            if (iD2 > 0 && i2 != iD2) {
                LogUtil.b(str, "setData currentHeight ", Integer.valueOf(i2), " height ", Integer.valueOf(iD2), " this ", this);
                layoutParams.height = iD2;
            }
        }
        e();
        h();
        d();
        j();
        d(this.f23572b, intervalCardData.b());
        e(this.j, intervalCardData.e());
        setIntervalDataList(intervalCardData);
    }

    public void setShadowVisibility(boolean z) {
        this.p = z;
        GradientShadow gradientShadow = this.o;
        if (gradientShadow != null) {
            gradientShadow.setVisibility(z ? 0 : 4);
        }
    }

    public void setFlowingLightVisibility(boolean z) {
        this.t = z;
        FlowingLight flowingLight = this.f;
        if (flowingLight != null) {
            flowingLight.setVisibility(z ? 0 : 4);
        }
        FlowingLightSurface flowingLightSurface = this.i;
        if (flowingLightSurface != null) {
            flowingLightSurface.setVisibility(this.t ? 0 : 4);
        }
    }

    public void a() {
        FlowingLight flowingLight = this.f;
        if (flowingLight != null && flowingLight.getVisibility() == 0) {
            this.f.a();
        }
        GradientShadow gradientShadow = this.o;
        if (gradientShadow != null && gradientShadow.getVisibility() == 0) {
            this.o.d();
        }
        FlowingLightSurface flowingLightSurface = this.i;
        if (flowingLightSurface == null || flowingLightSurface.getVisibility() != 0) {
            return;
        }
        this.i.d();
    }

    public void b() {
        float f;
        if (this.r) {
            f = 0.0f;
        } else {
            f = this.q ? 50.0f : 15.0f;
        }
        FlowingLight flowingLight = this.f;
        if (flowingLight != null) {
            flowingLight.e();
            this.f.setAngle(f);
        }
        GradientShadow gradientShadow = this.o;
        if (gradientShadow != null) {
            gradientShadow.c();
            this.o.setAngle(f);
        }
        FlowingLightSurface flowingLightSurface = this.i;
        if (flowingLightSurface != null) {
            flowingLightSurface.c();
            this.i.setRotateDegrees(f);
        }
    }
}
