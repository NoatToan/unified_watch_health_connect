package com.huawei.health.knit.section.view;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.graphics.LinearGradient;
import android.graphics.Shader;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.animation.LinearInterpolator;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.media3.common.C;
import com.huawei.health.plan.aicoach.AICoachOnClickListener;
import com.huawei.health.plan.aicoach.ControlTypeEnum;
import com.huawei.health.servicesui.R;
import com.huawei.hihealth.util.HiJsonUtil;
import com.huawei.ui.commonui.button.HealthButton;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.commonui.imageview.HealthImageView;
import defpackage.gfg;
import defpackage.gfn;
import defpackage.gfo;
import defpackage.gfs;
import defpackage.gfv;
import defpackage.gfw;
import defpackage.gfz;
import defpackage.njy;
import defpackage.qqw;
import defpackage.qre;
import defpackage.qrr;
import defpackage.qrs;
import defpackage.qta;
import health.compact.a.UnitUtil;
import health.compact.a.util.LogUtil;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public class SectionAICoach extends BaseSection {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private HealthTextView f7699b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private HealthImageView f7700c;
    private HealthImageView e;
    private HealthImageView f;
    private int g;
    private View h;
    private ValueAnimator i;
    private int j;
    private boolean m;
    private HealthTextView n;
    private View o;
    private static final int[] d = {-22151, -35034, -40115, -39820, -3966209, -11165212};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final float[] f7698a = {0.0f, 0.24f, 0.43f, 0.62f, 0.81f, 1.0f};

    public SectionAICoach(Context context) {
        super(context);
        this.g = 0;
        this.j = 0;
        this.m = false;
    }

    public SectionAICoach(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.g = 0;
        this.j = 0;
        this.m = false;
    }

    public SectionAICoach(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.g = 0;
        this.j = 0;
        this.m = false;
    }

    @Override // com.huawei.health.knit.section.view.BaseSection
    public View onCreateView(Context context) {
        View viewInflate = LayoutInflater.from(context).inflate(R.layout.section_ai_coach_layout, (ViewGroup) this, false);
        this.o = viewInflate;
        this.n = (HealthTextView) viewInflate.findViewById(R.id.progress_text_view);
        this.h = this.o.findViewById(R.id.input_guide_text_control_layout);
        this.f7700c = (HealthImageView) this.o.findViewById(R.id.parallel_control_icon);
        this.f7699b = (HealthTextView) this.o.findViewById(R.id.parallel_control_title);
        this.e = (HealthImageView) this.o.findViewById(R.id.parallel_control_close);
        this.f = (HealthImageView) this.o.findViewById(R.id.erase_mask);
        this.o.setBackground(new qta());
        this.o.setVisibility(8);
        return this.o;
    }

    @Override // com.huawei.health.knit.section.view.BaseSection
    public String getLogTag() {
        return "SectionAICoach";
    }

    @Override // com.huawei.health.knit.section.view.BaseSection
    protected void bindParamsToView(HashMap<String, Object> map) {
        if (map == null) {
            this.o.setVisibility(8);
            LogUtil.a("SectionAICoach", "currentParams is null");
            return;
        }
        Object obj = map.get("LAYOUT_CONTENT");
        Object obj2 = map.get("CLICK_EVENT_LISTENER");
        boolean zA = qqw.a(map, "TIME_OUT_FLAG", false);
        LogUtil.a("SectionAICoach", "bindParamsToView isTimeOut is ", Boolean.valueOf(zA));
        if (zA && !this.m) {
            j();
            return;
        }
        gfn gfnVar = new gfn();
        if (obj instanceof gfn) {
            gfnVar = (gfn) obj;
        }
        AICoachOnClickListener aICoachOnClickListener = obj2 instanceof AICoachOnClickListener ? (AICoachOnClickListener) obj2 : null;
        List<gfo> listC = gfnVar.c();
        if (njy.e(listC)) {
            this.o.setVisibility(8);
            LogUtil.a("SectionAICoach", "controlDatas is null");
            return;
        }
        boolean zE = false;
        for (gfo gfoVar : listC) {
            String strA = gfoVar.a();
            String strC = gfoVar.c();
            if (!TextUtils.isEmpty(strC)) {
                if (d(strA, strC)) {
                    this.o.setVisibility(8);
                    return;
                }
                zE = e(strA, listC, strC, aICoachOnClickListener, zE);
            }
        }
        if (zE) {
            this.o.setVisibility(0);
            c();
        } else {
            this.o.setVisibility(8);
        }
    }

    private boolean e(String str, List<gfo> list, String str2, AICoachOnClickListener aICoachOnClickListener, boolean z) {
        if (ControlTypeEnum.PARALLEL_CONTROL.getControlType().equals(str)) {
            b(list, str2, aICoachOnClickListener);
            return true;
        }
        if (!ControlTypeEnum.INPUT_GUIDE_TEXT_CONTROL.getControlType().equals(str)) {
            return z;
        }
        c(list, str2, aICoachOnClickListener);
        return true;
    }

    private void c() {
        if (this.m) {
            d();
            this.n.setVisibility(8);
            this.f7700c.setVisibility(0);
            this.f7699b.setVisibility(0);
            this.e.setVisibility(0);
            this.h.setVisibility(0);
            b();
        }
    }

    private void b() {
        if (this.o == null || this.f == null) {
            LogUtil.c("SectionAICoach", "View is null");
            return;
        }
        this.f.setBackground(getGradientDrawable());
        this.f.setVisibility(8);
        final ViewGroup.LayoutParams layoutParams = this.o.getLayoutParams();
        final int i = layoutParams.height;
        layoutParams.height = 0;
        this.o.setLayoutParams(layoutParams);
        final int paddingTop = this.o.getPaddingTop();
        final int i2 = this.f.getLayoutParams().height;
        this.o.post(new Runnable() { // from class: fuw
            @Override // java.lang.Runnable
            public final void run() {
                this.f34599c.e(layoutParams, i, i2, paddingTop);
            }
        });
    }

    public /* synthetic */ void e(ViewGroup.LayoutParams layoutParams, int i, int i2, int i3) {
        this.o.measure(View.MeasureSpec.makeMeasureSpec(this.o.getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(0, 0));
        int measuredHeight = this.o.getMeasuredHeight();
        if (measuredHeight <= 0) {
            LogUtil.c("SectionAICoach", "showCardAnimation get targetHeight error");
            layoutParams.height = i;
            this.o.setLayoutParams(layoutParams);
            this.f.setVisibility(8);
            return;
        }
        d(measuredHeight, i2, i3);
    }

    private void d(int i, final int i2, final int i3) {
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(0, i);
        valueAnimatorOfInt.setDuration(500L);
        valueAnimatorOfInt.setInterpolator(new LinearInterpolator());
        valueAnimatorOfInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: fuz
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.d.d(i2, i3, valueAnimator);
            }
        });
        valueAnimatorOfInt.addListener(new Animator.AnimatorListener() { // from class: com.huawei.health.knit.section.view.SectionAICoach.4
            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationRepeat(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                ViewGroup.LayoutParams layoutParams = SectionAICoach.this.o.getLayoutParams();
                layoutParams.height = -2;
                SectionAICoach.this.o.setLayoutParams(layoutParams);
                SectionAICoach.this.f.setVisibility(8);
                SectionAICoach.this.m = false;
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animator) {
                ViewGroup.LayoutParams layoutParams = SectionAICoach.this.o.getLayoutParams();
                layoutParams.height = -2;
                SectionAICoach.this.o.setLayoutParams(layoutParams);
                SectionAICoach.this.f.setVisibility(8);
                SectionAICoach.this.m = false;
            }
        });
        valueAnimatorOfInt.start();
    }

    public /* synthetic */ void d(int i, int i2, ValueAnimator valueAnimator) {
        int iIntValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
        ViewGroup.LayoutParams layoutParams = this.o.getLayoutParams();
        layoutParams.height = iIntValue;
        this.o.setLayoutParams(layoutParams);
        if (iIntValue > i + i2) {
            this.f.setVisibility(0);
            ConstraintLayout.LayoutParams layoutParams2 = (ConstraintLayout.LayoutParams) this.f.getLayoutParams();
            layoutParams2.topMargin = i2;
            layoutParams2.bottomToBottom = 0;
            this.f.setLayoutParams(layoutParams2);
            return;
        }
        this.f.setVisibility(8);
    }

    private GradientDrawable getGradientDrawable() {
        int currentPageBackgroundColor = getCurrentPageBackgroundColor();
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setColors(new int[]{0, currentPageBackgroundColor});
        gradientDrawable.setOrientation(GradientDrawable.Orientation.TOP_BOTTOM);
        return gradientDrawable;
    }

    private int getCurrentPageBackgroundColor() {
        Context context = this.o.getContext();
        if (context instanceof Activity) {
            View decorView = ((Activity) context).getWindow().getDecorView();
            if (decorView.getBackground() != null && (decorView.getBackground() instanceof ColorDrawable)) {
                return ((ColorDrawable) decorView.getBackground()).getColor();
            }
        }
        LogUtil.c("SectionAICoach", "getCurrentPageBackgroundColor error");
        return 0;
    }

    private void j() {
        if (this.m) {
            LogUtil.a("SectionAICoach", "Animation already run");
            return;
        }
        this.g = 0;
        this.m = true;
        this.o.setVisibility(0);
        this.n.setVisibility(0);
        this.f7700c.setVisibility(8);
        this.f7699b.setVisibility(8);
        this.e.setVisibility(8);
        this.h.setVisibility(8);
        i();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void i() {
        int iCeil = this.g + ((int) Math.ceil(((double) (100 - this.g)) * 0.5d));
        if (iCeil > 99) {
            iCeil = 99;
        }
        LogUtil.a("SectionAICoach", "startPrecisePhaseProgress is run. currentPercent: " + this.g + "targetPercent: " + iCeil);
        a(this.g, iCeil);
    }

    private void a(int i, final int i2) {
        if (this.n == null) {
            LogUtil.c("SectionAICoach", "mProgressTextView is null");
            this.m = false;
            return;
        }
        d();
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(i, i2);
        this.i = valueAnimatorOfInt;
        valueAnimatorOfInt.setDuration(C.DEFAULT_MAX_SEEK_TO_PREVIOUS_POSITION_MS);
        this.i.setInterpolator(new LinearInterpolator());
        this.i.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: fux
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.f34600b.e(valueAnimator);
            }
        });
        this.i.addListener(new Animator.AnimatorListener() { // from class: com.huawei.health.knit.section.view.SectionAICoach.1
            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationRepeat(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                SectionAICoach.this.g = i2;
                if (SectionAICoach.this.g >= 99) {
                    return;
                }
                SectionAICoach.this.i();
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animator) {
                LogUtil.a("SectionAICoach", "showAICoachProgressAnim: animation canceled, release lock");
                SectionAICoach.this.m = false;
            }
        });
        this.i.start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public void e(ValueAnimator valueAnimator) {
        int iIntValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
        if (this.n == null) {
            LogUtil.c("SectionAICoach", "mProgressTextView is null");
            return;
        }
        if (this.j == iIntValue) {
            return;
        }
        this.j = iIntValue;
        String strA = qre.a(R.string.IDS_train_plan_aiChat_coach_analysis, UnitUtil.e(iIntValue, 2, 0));
        String string = this.n.getText().toString();
        this.n.setText(strA);
        if (TextUtils.isEmpty(string)) {
            setTextViewColor(this.n);
        }
        if (TextUtils.isEmpty(strA) || TextUtils.isEmpty(string) || strA.length() == string.length()) {
            return;
        }
        setTextViewColor(this.n);
    }

    private void d() {
        ValueAnimator valueAnimator = this.i;
        if (valueAnimator == null) {
            return;
        }
        valueAnimator.removeAllUpdateListeners();
        this.i.removeAllListeners();
        if (this.i.isRunning()) {
            this.i.cancel();
        }
        this.i = null;
    }

    private boolean d(String str, String str2) {
        return ControlTypeEnum.CONTROL_RESULT.getControlType().equals(str) && ((gfw) HiJsonUtil.d(str2, gfw.class)).d() == 27001;
    }

    private void b(final List<gfo> list, String str, final AICoachOnClickListener aICoachOnClickListener) {
        HealthTextView healthTextView = (HealthTextView) this.o.findViewById(R.id.parallel_control_title);
        HealthImageView healthImageView = (HealthImageView) this.o.findViewById(R.id.parallel_control_close);
        gfz gfzVar = (gfz) HiJsonUtil.d(str, gfz.class);
        healthTextView.setText(gfzVar.a());
        setTextViewColor(healthTextView);
        if (gfzVar.b()) {
            healthImageView.setVisibility(0);
            healthImageView.setOnClickListener(new View.OnClickListener() { // from class: com.huawei.health.knit.section.view.SectionAICoach.5
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    if (qrs.e(1000, view)) {
                        LogUtil.a("SectionAICoach", "fast click");
                        return;
                    }
                    AICoachOnClickListener aICoachOnClickListener2 = aICoachOnClickListener;
                    if (aICoachOnClickListener2 != null) {
                        aICoachOnClickListener2.onClick(new gfg(list, null));
                    }
                    LogUtil.a("SectionAICoach", "click close button");
                }
            });
        } else {
            healthImageView.setVisibility(8);
        }
    }

    private void c(List<gfo> list, String str, AICoachOnClickListener aICoachOnClickListener) {
        HealthTextView healthTextView = (HealthTextView) this.o.findViewById(R.id.input_guide_text_control_text);
        HealthButton healthButton = (HealthButton) this.o.findViewById(R.id.input_guide_text_control_button1);
        HealthButton healthButton2 = (HealthButton) this.o.findViewById(R.id.input_guide_text_control_button2);
        healthButton.setVisibility(8);
        healthButton2.setVisibility(8);
        List<HealthButton> listAsList = Arrays.asList(healthButton, healthButton2);
        gfv gfvVar = (gfv) HiJsonUtil.d(str, gfv.class);
        healthTextView.setTypeface(qrr.c());
        healthTextView.setText(gfvVar.e());
        b(list, gfvVar.a(), listAsList, aICoachOnClickListener);
    }

    private void b(List<gfo> list, List<gfs> list2, List<HealthButton> list3, AICoachOnClickListener aICoachOnClickListener) {
        if (njy.e(list2)) {
            return;
        }
        for (int i = 0; i < list2.size(); i++) {
            gfs gfsVar = list2.get(i);
            if (i < list3.size()) {
                HealthButton healthButton = list3.get(i);
                b(list, gfsVar, healthButton, aICoachOnClickListener);
                healthButton.setText(gfsVar.b());
                healthButton.setVisibility(0);
            }
        }
    }

    private void setTextViewColor(final TextView textView) {
        textView.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: com.huawei.health.knit.section.view.SectionAICoach.3
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public void onGlobalLayout() {
                textView.getPaint().setShader(new LinearGradient(0.0f, 0.0f, textView.getWidth(), textView.getHeight(), SectionAICoach.d, SectionAICoach.f7698a, Shader.TileMode.REPEAT));
                textView.invalidate();
                textView.getViewTreeObserver().removeOnGlobalLayoutListener(this);
            }
        });
    }

    private void b(final List<gfo> list, final gfs gfsVar, TextView textView, final AICoachOnClickListener aICoachOnClickListener) {
        textView.setOnClickListener(new View.OnClickListener() { // from class: com.huawei.health.knit.section.view.SectionAICoach.2
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (qrs.e(1000, view)) {
                    LogUtil.a("SectionAICoach", "fast click");
                    return;
                }
                AICoachOnClickListener aICoachOnClickListener2 = aICoachOnClickListener;
                if (aICoachOnClickListener2 != null) {
                    aICoachOnClickListener2.onClick(new gfg(list, gfsVar));
                }
                LogUtil.a("SectionAICoach", "click ai coach button ", gfsVar.b());
            }
        });
    }
}
