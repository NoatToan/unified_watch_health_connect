package com.huawei.health.knit.section.view;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Pair;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.LinearLayout;
import com.huawei.haf.common.exception.ExceptionUtils;
import com.huawei.health.health.utils.vippage.ViewTreeVisibilityListener;
import com.huawei.health.servicesui.R;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwcommonmodel.constants.AnalyticsValue;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.base.BaseActivity;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import defpackage.lmf;
import defpackage.qqz;
import defpackage.qsp;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.lang.ref.WeakReference;
import java.util.HashMap;

/* JADX INFO: loaded from: classes7.dex */
public class SectionSleepInterpretations extends BaseSection {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private SleepInterpretationsTextview f7932a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private View f7933b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private SleepInterpretationsTextview f7934c;
    private boolean d;
    private SleepInterpretationsTextview e;
    private c h;
    private HealthTextView i;

    public SectionSleepInterpretations(Context context) {
        super(context);
        this.d = false;
    }

    public SectionSleepInterpretations(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.d = false;
    }

    public SectionSleepInterpretations(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.d = false;
    }

    @Override // com.huawei.health.knit.section.view.BaseSection
    public View onCreateView(Context context) {
        try {
            View viewInflate = LayoutInflater.from(context).inflate(R.layout.section_sleep_interpretation, (ViewGroup) this, false);
            this.i = (HealthTextView) viewInflate.findViewById(R.id.section_title);
            this.f7934c = (SleepInterpretationsTextview) viewInflate.findViewById(R.id.daily_quality_desc);
            this.f7932a = (SleepInterpretationsTextview) viewInflate.findViewById(R.id.daily_problem_impact);
            this.e = (SleepInterpretationsTextview) viewInflate.findViewById(R.id.daily_advice);
            this.f7933b = viewInflate.findViewById(R.id.daily_advice_card_view);
            c();
            return viewInflate;
        } catch (NullPointerException e) {
            ReleaseLogUtil.a("SectionSleepInterpretations", "Exception msg = ", ExceptionUtils.c(e));
            return new View(context);
        }
    }

    private void c() {
        addOnAttachStateChangeListener(new View.OnAttachStateChangeListener() { // from class: com.huawei.health.knit.section.view.SectionSleepInterpretations.3
            @Override // android.view.View.OnAttachStateChangeListener
            public void onViewAttachedToWindow(View view) {
                LogUtil.a("SectionSleepInterpretations", "addOnScrollChangedListener onAttachedToWindow");
                if (SectionSleepInterpretations.this.h == null) {
                    SectionSleepInterpretations sectionSleepInterpretations = SectionSleepInterpretations.this;
                    sectionSleepInterpretations.h = new c(sectionSleepInterpretations);
                }
                SectionSleepInterpretations sectionSleepInterpretations2 = SectionSleepInterpretations.this;
                qsp.a((View) sectionSleepInterpretations2, (ViewTreeObserver.OnScrollChangedListener) sectionSleepInterpretations2.h);
            }

            @Override // android.view.View.OnAttachStateChangeListener
            public void onViewDetachedFromWindow(View view) {
                LogUtil.a("SectionSleepInterpretations", "addOnScrollChangedListener detached from window");
                SectionSleepInterpretations.this.removeOnAttachStateChangeListener(this);
            }
        });
    }

    @Override // com.huawei.health.knit.section.view.BaseSection
    protected void configLayoutParameters(LinearLayout.LayoutParams layoutParams) {
        if (isSupportSafeRegion()) {
            int dimensionPixelSize = BaseApplication.getContext().getResources().getDimensionPixelSize(com.huawei.ui.commonui.R.dimen.defaultPaddingStart);
            int dimensionPixelSize2 = BaseApplication.getContext().getResources().getDimensionPixelSize(com.huawei.ui.commonui.R.dimen.defaultPaddingEnd);
            Pair<Integer, Integer> safeRegionWidth = BaseActivity.getSafeRegionWidth();
            layoutParams.setMarginStart(dimensionPixelSize + ((Integer) safeRegionWidth.first).intValue());
            layoutParams.setMarginEnd(dimensionPixelSize2 + ((Integer) safeRegionWidth.second).intValue());
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        qsp.c(this, this.h);
    }

    @Override // com.huawei.health.knit.section.view.BaseSection
    public String getLogTag() {
        return getClass().getSimpleName();
    }

    @Override // com.huawei.health.knit.section.view.BaseSection
    protected void bindParamsToView(HashMap<String, Object> map) {
        HealthTextView healthTextView;
        Object obj = map.get("DAILY_SLEEP_INTERPRETATIONS_TITLE");
        if ((obj instanceof String) && (healthTextView = this.i) != null) {
            healthTextView.setText((String) obj);
        }
        Object obj2 = map.get("DAILY_SLEEP_INTERPRETATIONS");
        Object obj3 = map.get("DAILY_SLEEP_PROBLEM_FACTOR");
        if (this.f7934c == null) {
            ReleaseLogUtil.e("SectionSleepInterpretations", "mDailyQualityDesc is null");
            return;
        }
        if (!(obj3 instanceof String) || TextUtils.isEmpty((String) obj3)) {
            this.f7934c.setupDrawable(null);
        } else {
            this.f7934c.d();
        }
        a(obj2, this.f7934c);
        a(obj3, this.f7932a);
        Object obj4 = map.get("DAILY_SLEEP_ADVICE");
        if (obj4 instanceof String) {
            String str = (String) obj4;
            if (!TextUtils.isEmpty(str)) {
                Drawable drawableC = qqz.c(getContextRef(), R.drawable.ic_sleep_daily_advice);
                if (drawableC != null) {
                    int dimension = (int) getContextRef().getResources().getDimension(R.dimen.health_common_16dp);
                    drawableC.setBounds(0, 0, dimension, dimension);
                }
                this.e.setupDrawable(drawableC);
                this.e.setupTextView(str);
                this.f7933b.setVisibility(0);
                return;
            }
        }
        this.f7933b.setVisibility(8);
    }

    private void a(Object obj, SleepInterpretationsTextview sleepInterpretationsTextview) {
        if (obj instanceof String) {
            String str = (String) obj;
            if (!TextUtils.isEmpty(str)) {
                sleepInterpretationsTextview.setupTextView(str);
                sleepInterpretationsTextview.setVisibility(0);
                return;
            }
        }
        sleepInterpretationsTextview.setVisibility(8);
    }

    @Override // com.huawei.health.knit.section.view.BaseSection, com.huawei.health.health.utils.vippage.ViewTreeVisibilityListener.ViewTreeListenee
    public void checkVisibilityAndSetBiEvent() {
        if (!ViewTreeVisibilityListener.c(this) || this.d) {
            return;
        }
        biEvent();
        this.d = true;
    }

    @Override // com.huawei.health.knit.section.view.BaseSection, com.huawei.health.health.utils.vippage.ViewTreeVisibilityListener.ViewTreeListenee
    public void biEvent() {
        HashMap map = new HashMap();
        map.put("click", "1");
        lmf.d().c(getContextRef(), AnalyticsValue.SLEEP_INTERPRETATIONS_2030112.value(), map, 0);
    }

    static class c implements ViewTreeObserver.OnGlobalLayoutListener, ViewTreeObserver.OnScrollChangedListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final WeakReference<SectionSleepInterpretations> f7935a;

        public c(SectionSleepInterpretations sectionSleepInterpretations) {
            this.f7935a = new WeakReference<>(sectionSleepInterpretations);
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            SectionSleepInterpretations sectionSleepInterpretations = this.f7935a.get();
            if (sectionSleepInterpretations == null) {
                return;
            }
            if (sectionSleepInterpretations.d) {
                qsp.b(sectionSleepInterpretations, this);
            } else {
                sectionSleepInterpretations.checkVisibilityAndSetBiEvent();
            }
        }

        @Override // android.view.ViewTreeObserver.OnScrollChangedListener
        public void onScrollChanged() {
            SectionSleepInterpretations sectionSleepInterpretations = this.f7935a.get();
            if (sectionSleepInterpretations == null) {
                return;
            }
            if (sectionSleepInterpretations.d) {
                qsp.c(sectionSleepInterpretations, this);
            } else {
                sectionSleepInterpretations.checkVisibilityAndSetBiEvent();
            }
        }
    }
}
