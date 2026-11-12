package com.huawei.health.suggestion.ui.fitness.module;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import androidx.core.content.ContextCompat;
import com.huawei.health.suggestion.R;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.commonui.titlebar.CustomTitleBar;
import com.huawei.ui.commonui.viewpager.HealthPagerAdapter;
import com.huawei.ui.commonui.viewpager.HealthViewPager;
import defpackage.qqz;
import defpackage.qre;
import defpackage.qrs;
import health.compact.a.LanguageUtil;
import health.compact.a.UnitUtil;

/* JADX INFO: loaded from: classes9.dex */
public class TrainActionIntro extends RelativeLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private SlideDownLayout f9421a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private HealthViewPager f9422b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private ImageView f9423c;
    public ImageView d;
    private ImageView e;
    private int f;
    private HealthTextView g;
    private HealthTextView h;
    private CustomTitleBar i;
    private int j;

    public TrainActionIntro(Context context) {
        super(context);
        this.j = 0;
    }

    public TrainActionIntro(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.j = 0;
        a(context, attributeSet);
    }

    public TrainActionIntro(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.j = 0;
        a(context, attributeSet);
    }

    private void a(Context context, AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.ActionIntro);
        this.f = typedArrayObtainStyledAttributes.getInteger(R.styleable.ActionIntro_intro, 0);
        typedArrayObtainStyledAttributes.recycle();
        int i = R.layout.sug_traindetail_action_intro;
        if (this.f == 1) {
            i = R.layout.sug_coach_action_intro;
        }
        setClickable(true);
        View viewInflate = LayoutInflater.from(getContext()).inflate(i, this);
        this.f9421a = (SlideDownLayout) viewInflate.findViewById(R.id.sug_coach_ll_yaodian);
        HealthViewPager healthViewPager = (HealthViewPager) viewInflate.findViewById(R.id.sug_coach_vp_action_yaodian);
        this.f9422b = healthViewPager;
        healthViewPager.setIsScroll(false);
        this.g = (HealthTextView) viewInflate.findViewById(R.id.sug_coach_intro_motionc);
        this.h = (HealthTextView) viewInflate.findViewById(R.id.sug_coach_intro_totle);
        this.e = (ImageView) viewInflate.findViewById(R.id.sug_coach_iv_action_pre);
        this.f9423c = (ImageView) viewInflate.findViewById(R.id.sug_coach_iv_action_nex);
        if (LanguageUtil.ba(context)) {
            this.e.setImageDrawable(qqz.e(context, R.drawable.sug_coach_show_last));
            this.f9423c.setImageDrawable(qqz.e(context, R.drawable.sug_coach_show_next));
        }
        if (this.f == 1) {
            this.d = (ImageView) viewInflate.findViewById(R.id.sug_coachiv_close);
        }
        b(viewInflate);
    }

    public void d() {
        if (this.i != null && (this.f9422b.getLayoutParams() instanceof RelativeLayout.LayoutParams)) {
            RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.f9422b.getLayoutParams();
            if (qrs.af(BaseApplication.getContext())) {
                layoutParams.topMargin = this.j;
            } else {
                layoutParams.topMargin = 0;
            }
            this.f9422b.setLayoutParams(layoutParams);
        }
    }

    private void b(View view) {
        if (this.f == 1) {
            return;
        }
        CustomTitleBar customTitleBar = (CustomTitleBar) view.findViewById(R.id.sug_action_title_bar);
        this.i = customTitleBar;
        if (customTitleBar == null) {
            return;
        }
        customTitleBar.setTitleBarBackgroundColor(getResources().getColor(com.huawei.health.servicesui.R.color.transparent));
        this.i.setLeftButtonVisibility(0);
        this.i.setLeftButtonDrawable(ContextCompat.getDrawable(getContext(), com.huawei.ui.commonui.R.drawable.ic_health_navbar_close_black), qre.f(com.huawei.ui.commonui.R.string.accessibility_close));
        this.i.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: hmi
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public final void onGlobalLayout() {
                this.f36914b.e();
            }
        });
    }

    public /* synthetic */ void e() {
        this.j = this.i.getHeight();
        d();
    }

    public void setAdapter(HealthPagerAdapter healthPagerAdapter) {
        this.f9422b.setAdapter(healthPagerAdapter);
    }

    public void setOnSlidingListener(OnSlidingListener onSlidingListener) {
        if (onSlidingListener != null) {
            this.f9421a.setOnSlidingListener(onSlidingListener);
        }
    }

    public int getCurrentIndex() {
        try {
            return Integer.parseInt(this.g.getText().toString().trim());
        } catch (NumberFormatException e) {
            LogUtil.e("Suggestion_TrainActionIntro", e.getMessage());
            return 0;
        }
    }

    public void setCurrentIndex(int i) {
        this.g.setText(UnitUtil.e(i, 1, 0));
    }

    public void setCurrentIndex(String str) {
        this.g.setText(str);
    }

    public void d(String str, String str2) {
        this.g.setText(str);
        this.h.setText(str2);
    }

    public void e(int i, int i2) {
        this.g.setText(UnitUtil.e(i, 1, 0));
        this.h.setText(UnitUtil.e(i2, 1, 0));
    }

    public ImageView getPreAction() {
        return this.e;
    }

    public ImageView getNextAction() {
        return this.f9423c;
    }

    public CustomTitleBar getTitleBar() {
        return this.i;
    }
}
