package com.huawei.health.knit.section.homesection;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import android.view.View;
import android.view.ViewStub;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.core.content.ContextCompat;
import androidx.core.graphics.drawable.DrawableCompat;
import com.huawei.haf.handler.HandlerExecutor;
import com.huawei.health.servicesui.R;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.threecircle.manager.WheelChairStateManager;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.commonui.view.threeCircle.ThreeCircleView;
import defpackage.fft;
import defpackage.fsb;
import defpackage.ieg;
import defpackage.lrd;
import defpackage.lua;
import defpackage.qho;
import defpackage.qqw;
import defpackage.qqz;
import defpackage.qre;
import defpackage.qsp;
import health.compact.a.LanguageUtil;
import health.compact.a.ReleaseLogUtil;
import health.compact.a.UnitUtil;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes7.dex */
public class ThreeCircleCardSection extends ModelBaseCardSection {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private ThreeCircleView f7515a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Map<Integer, Integer> f7516c;
    private HealthTextView d;

    @Override // com.huawei.health.knit.section.view.BaseSection, android.view.View.OnClickListener
    public void onClick(View view) {
    }

    public ThreeCircleCardSection(Context context) {
        super(context);
        this.f7516c = new HashMap(10);
    }

    @Override // com.huawei.health.knit.section.homesection.ModelBaseCardSection, com.huawei.health.knit.section.view.BaseSection
    public View onCreateView(Context context) {
        super.onCreateView(context);
        f();
        i();
        return this.itemView;
    }

    @Override // com.huawei.health.knit.section.view.BaseSection
    public String getLogTag() {
        return "ThreeCircleCardSection";
    }

    @Override // com.huawei.health.knit.section.homesection.ModelBaseCardSection
    protected void initModel(View view) {
        View viewFindViewById;
        ViewStub viewStub = (ViewStub) view.findViewById(R.id.three_circle_layout);
        if (viewStub.getParent() != null) {
            viewFindViewById = viewStub.inflate();
        } else {
            viewFindViewById = view.findViewById(R.id.three_circle_layout_inflated);
        }
        if (viewFindViewById instanceof FrameLayout) {
            FrameLayout frameLayout = (FrameLayout) viewFindViewById;
            frameLayout.setVisibility(0);
            this.f7515a = (ThreeCircleView) frameLayout.findViewById(R.id.circleProgressBar);
        }
    }

    @Override // com.huawei.health.knit.section.homesection.ModelBaseCardSection
    public void updateBottomData(int i, int i2) {
        initBottomStepLayout();
        if (WheelChairStateManager.a().d()) {
            String strE = UnitUtil.e(Math.max(i, 0), 1, 0);
            String strE2 = qre.e(R.plurals.IDS_wheel_chair_value_unit, Math.max(i, 0), strE);
            this.mBottomValue.setText(lightBottomCurrentText(strE2, strE));
            lrd.b(this.mBottomValue, strE2);
        } else {
            c(i, i2);
        }
        checkBottomLayoutNeedLine(this.mBottomCapsuleLayout);
    }

    private void c(int i, int i2) {
        String string;
        if (i > -1) {
            string = UnitUtil.e(i, 1, 0);
        } else {
            string = getContext().getString(R.string.IDS_hw_health_show_healthdata_nodata_symbol);
        }
        String strE = qre.e(R.plurals.IDS_single_circle_walk_target_desc, i2, UnitUtil.e(i2, 1, 0));
        this.mBottomValue.setText(lightBottomCurrentText(getContext().getResources().getString(R.string.IDS_current_total_time, string, strE), string));
        lrd.b(this.mBottomValue, qre.a(R.string.IDS_settings_alarm_comma, string, qre.a(R.string.IDS_current_target, strE.replaceAll(",", ""))));
    }

    private void i() {
        if (this.mThreeLeafIcon == null) {
            LogUtil.a("ThreeCircleCardSection", "getViewHolder() is null.");
            return;
        }
        this.mThreeLeafIcon.setVisibility(0);
        long jD = lua.d(fft.f34005c, "perfect_three_leaf", 0L);
        int iB = ieg.b(new Date(jD));
        int iB2 = ieg.b(new Date());
        LogUtil.a("ThreeCircleCardSection", "getPerfectTimeMills:", Long.valueOf(jD), " perfectDate:", Integer.valueOf(iB), " todayDate:", Integer.valueOf(iB2));
        if (jD != 0 && iB == iB2) {
            this.mThreeLeafIcon.setBackground(this.mContext.getDrawable(R.drawable.perfect_three_leaf_icon));
        } else {
            this.mThreeLeafIcon.setBackground(this.mContext.getDrawable(R.drawable.three_leaf_icon));
        }
        this.mThreeLeafIcon.setContentDescription(this.mContext.getResources().getString(R.string.IDS_health_clover_title));
    }

    @Override // com.huawei.health.knit.section.homesection.ModelBaseCardSection
    public void initBottomStepLayout() {
        if (WheelChairStateManager.a().d()) {
            qsp.c(this.mBottomIcon, qqz.c(getContext(), R.drawable.wheel_chair_push));
            this.mBottomText.setText(R.string.IDS_three_card_wheelchair_title);
        } else {
            a(R.string.IDS_three_card_step_title, R.drawable.health_life_icon_task_step, R.color.color_64bb5c);
        }
    }

    private void a(int i, int i2, int i3) {
        Drawable drawableWrap = DrawableCompat.wrap(ContextCompat.getDrawable(getContext(), i2));
        DrawableCompat.setTint(drawableWrap, qre.e(i3));
        Drawable drawableE = e(drawableWrap);
        this.mBottomText.setText(getContext().getString(i));
        this.mBottomIcon.setBackground(drawableE);
    }

    private Drawable e(Drawable drawable) {
        return LanguageUtil.ba(getContext()) ? qqz.e(getContext(), drawable) : drawable;
    }

    public void setBottomClickListener(View.OnClickListener onClickListener) {
        this.mBottomCapsuleLayout.setOnClickListener(onClickListener);
        if (this.mBottomValue == null) {
            ReleaseLogUtil.d("ThreeCircleCardSection", "setBottomClickListener mBottomValue is null");
        } else {
            this.mBottomValue.setOnClickListener(onClickListener);
        }
    }

    @Override // com.huawei.health.knit.section.homesection.ModelBaseCardSection
    protected void initActivityContentVisible(LinearLayout linearLayout, LinearLayout linearLayout2, LinearLayout linearLayout3, LinearLayout linearLayout4) {
        linearLayout.setVisibility(0);
        linearLayout2.setVisibility(8);
        linearLayout3.setVisibility(8);
        linearLayout4.setVisibility(8);
    }

    @Override // com.huawei.health.knit.section.homesection.ModelBaseCardSection
    protected void initStrengthLayoutVisible(LinearLayout linearLayout) {
        linearLayout.setVisibility(0);
    }

    @Override // com.huawei.health.knit.section.homesection.ModelBaseCardSection
    protected void refreshActivityLayout() {
        setLayoutParamsThreeLine(this.mActivityLayoutMiddle, this.mActivityTextUnit, false);
    }

    public void setThreeCircleDataListener(int i, View.OnClickListener onClickListener) {
        if (i == 0) {
            this.mHeatLayout.setOnClickListener(onClickListener);
        } else if (i == 1) {
            this.mTimeStrengthLayout.setOnClickListener(onClickListener);
        } else {
            if (i != 2) {
                return;
            }
            this.mActivityLayout.setOnClickListener(onClickListener);
        }
    }

    private void f() {
        LogUtil.a("ThreeCircleCardSection", "initSwitchBubble");
        if (fsb.d()) {
            LogUtil.j("ThreeCircleCardSection", "already switch before");
            return;
        }
        HealthTextView healthTextView = this.mBubbleText;
        this.d = healthTextView;
        if (healthTextView == null) {
            LogUtil.j("ThreeCircleCardSection", "bubble is null");
            return;
        }
        healthTextView.setText(this.mContext.getResources().getString(R.string.IDS_health_life_bubble_common_text));
        lrd.d(this.d, qre.f(R.string.IDS_health_life_bubble_common_text), false);
        if (LanguageUtil.ba(this.mContext)) {
            this.d.setBackgroundResource(R.drawable.sleep_toast_bg);
        } else {
            this.d.setBackgroundResource(R.drawable.toast_bg_right);
        }
        this.d.setOnClickListener(new View.OnClickListener() { // from class: com.huawei.health.knit.section.homesection.ThreeCircleCardSection.2
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                LogUtil.a("ThreeCircleCardSection", "bubble is clicked");
            }
        });
    }

    @Override // com.huawei.health.knit.section.homesection.ModelBaseCardSection
    public void setFitnessDataOriginIcon2Visible(int i) {
        this.mBottomTipIcon.setVisibility(i);
        checkBottomLayoutNeedLine(this.mBottomCapsuleLayout);
    }

    protected void a() {
        b();
        lrd.b(this.mThreeLeafIconBackground, 8);
        updateMsgRedDotVisibility(8);
    }

    public void b() {
        a(0, this.mHeatText, this.mHeatUnit);
        a(1, this.mTimeText, this.mTimeTextRight);
        a(2, this.mActivityHoursText, this.mActivityTextUnit);
    }

    private void a(int i, HealthTextView healthTextView, HealthTextView healthTextView2) {
        int measuredWidth = this.mStepStrenActivityLayout.getMeasuredWidth() / 3;
        int measureWidth = (int) healthTextView.getMeasureWidth();
        int measureWidth2 = (int) healthTextView2.getMeasureWidth();
        if (measuredWidth <= 0 || measureWidth <= 0 || measureWidth2 <= 0) {
            LogUtil.j("ThreeCircleCardSection", "updateCurValueTextByIndex Width = 0 return");
            return;
        }
        int dimensionPixelOffset = getContext().getResources().getDimensionPixelOffset(R.dimen.health_common_6dp);
        LogUtil.a("ThreeCircleCardSection", "updateCurValueTextByIndex targetWidth=" + measureWidth2, " valueWidth=" + measureWidth, " marginWidth=", Integer.valueOf(dimensionPixelOffset), " itemWidth=", Integer.valueOf(measuredWidth));
        if (measureWidth2 + measureWidth + dimensionPixelOffset > measuredWidth) {
            this.f7516c.put(Integer.valueOf(i), Integer.valueOf(i));
        } else {
            this.f7516c.remove(Integer.valueOf(i));
        }
        b(this.f7516c);
    }

    private void g() {
        d();
        e();
    }

    public void e() {
        if (this.mActivityTitleText == null) {
            return;
        }
        this.mActivityTitleText.setText(qho.e(R.string.IDS_three_circle_card_activity_hours));
    }

    public void e(int i, int i2, int i3, boolean z) {
        this.f7515a.setIsAnimator(z);
        if (i == 0) {
            this.f7515a.a("firstCircle", i2, i3);
        } else if (i == 1) {
            this.f7515a.a("secondCircle", i2, i3);
        } else {
            if (i != 2) {
                return;
            }
            this.f7515a.a("thirdCircle", i2, i3);
        }
    }

    public void setTextByPosition(int i, int i2, int i3) {
        if (i == 0) {
            a(i, this.mHeatText, this.mHeatUnit, i2, i3, R.plurals.IDS_kcalories_unit, this.mHeatValueLayout);
        } else if (i == 1) {
            a(i, this.mTimeText, this.mTimeTextRight, i2, i3, R.plurals.IDS_single_circle_intensity_target_desc, this.mStrengthLayoutMiddle);
        } else {
            if (i != 2) {
                return;
            }
            a(i, this.mActivityHoursText, this.mActivityTextUnit, i2, i3, R.plurals.IDS_hour_unit, this.mActivityLayoutMiddle);
        }
    }

    private void a(int i, HealthTextView healthTextView, HealthTextView healthTextView2, int i2, int i3, int i4, View view) {
        LogUtil.a("ThreeCircleCardSection", " curValue=" + i2, " targetValue=" + i3, " index=", Integer.valueOf(i));
        String strE = UnitUtil.e((double) i2, 1, 0);
        healthTextView.setText(strE);
        String strE2 = qre.e(i4, i3, UnitUtil.e(i3, 1, 0));
        String string = getContext().getResources().getString(R.string.IDS_current_total_time, "", strE2);
        healthTextView2.setText(string);
        lrd.b(view, qre.a(R.string.IDS_settings_alarm_comma, strE, qre.a(R.string.IDS_current_target, strE2)));
        int measuredWidth = this.mStepStrenActivityLayout.getMeasuredWidth() / 3;
        if (measuredWidth == 0) {
            LogUtil.j("ThreeCircleCardSection", "showCycleTextData itemWidth is 0 ");
            return;
        }
        TextPaint paint = healthTextView2.getPaint();
        paint.setTextSize(healthTextView2.getTextSize());
        int iMeasureText = (int) paint.measureText(string);
        TextPaint paint2 = healthTextView.getPaint();
        paint2.setTextSize(healthTextView.getTextSize());
        int iMeasureText2 = (int) paint2.measureText(strE);
        int dimensionPixelOffset = getContext().getResources().getDimensionPixelOffset(R.dimen.health_common_6dp);
        LogUtil.a("ThreeCircleCardSection", " targetWidth=" + iMeasureText, " valueWidth=" + iMeasureText2, " marginWidth=", Integer.valueOf(dimensionPixelOffset), " itemWidth=", Integer.valueOf(measuredWidth));
        if (iMeasureText + iMeasureText2 + dimensionPixelOffset > measuredWidth) {
            this.f7516c.put(Integer.valueOf(i), Integer.valueOf(i));
        } else {
            this.f7516c.remove(Integer.valueOf(i));
        }
        b(this.f7516c);
    }

    private void b(Map<Integer, Integer> map) {
        if (map.size() > 0) {
            setLayoutParamsThreeLine(this.mStepLayoutMiddle, this.mHeatUnit, true);
            setLayoutParamsThreeLine(this.mStrengthLayoutMiddle, this.mTimeTextRight, true);
            setLayoutParamsThreeLine(this.mActivityLayoutMiddle, this.mActivityTextUnit, true);
        } else {
            setLayoutParamsThreeLine(this.mStepLayoutMiddle, this.mHeatUnit, false);
            setLayoutParamsThreeLine(this.mStrengthLayoutMiddle, this.mTimeTextRight, false);
            setLayoutParamsThreeLine(this.mActivityLayoutMiddle, this.mActivityTextUnit, false);
        }
    }

    public void d() {
        if (this.f7515a == null) {
            LogUtil.a("ThreeCircleCardSection", "updateThreeCireIcon mCircleProgressBar == null");
        } else if (WheelChairStateManager.a().d()) {
            this.f7515a.a("secondCircle", R.drawable.wheel_excise_icon);
            this.f7515a.a("thirdCircle", R.drawable.wheel_activity_icon);
        } else {
            this.f7515a.a("secondCircle", R.drawable.ic_time_xxxhdpi);
            this.f7515a.a("thirdCircle", R.drawable.ic_excise_xxxhdpi);
        }
    }

    public void setThreeCircleLayoutListener(View.OnClickListener onClickListener) {
        this.f7515a.setOnClickListener(onClickListener);
    }

    @Override // android.view.View
    protected void onConfigurationChanged(Configuration configuration) {
        LogUtil.a("ThreeCircleCardSection", "oonConfigurationChanged");
        super.onConfigurationChanged(configuration);
        updateLayout();
        HandlerExecutor.c(new Runnable() { // from class: frz
            @Override // java.lang.Runnable
            public final void run() {
                this.f34461b.b();
            }
        }, 100L);
    }

    @Override // com.huawei.health.knit.section.homesection.ModelBaseCardSection, com.huawei.health.knit.section.view.BaseSection
    public void bindParamsToView(HashMap<String, Object> map) {
        super.bindParamsToView(map);
    }

    @Override // com.huawei.health.knit.section.homesection.ModelBaseCardSection
    protected void setTextAndListener(HashMap<String, Object> map) {
        super.setTextAndListener(map);
        View.OnClickListener onClickListener = (View.OnClickListener) qqw.a(map, "THREE_CIRCLE_OUTSIDE_LISTENER", (Class<Object>) View.OnClickListener.class, (Object) null);
        if (onClickListener != null) {
            setThreeCircleDataListener(0, onClickListener);
        }
        View.OnClickListener onClickListener2 = (View.OnClickListener) qqw.a(map, "THREE_CIRCLE_MIDDLE_LISTENER", (Class<Object>) View.OnClickListener.class, (Object) null);
        if (onClickListener2 != null) {
            setThreeCircleDataListener(1, onClickListener2);
        }
        View.OnClickListener onClickListener3 = (View.OnClickListener) qqw.a(map, "THREE_CIRCLE_INSIDE_LISTENER", (Class<Object>) View.OnClickListener.class, (Object) null);
        if (onClickListener3 != null) {
            setThreeCircleDataListener(2, onClickListener3);
        }
        View.OnClickListener onClickListener4 = (View.OnClickListener) qqw.a(map, "HOME_STEP_CARD_CLICK_LISTENER", (Class<Object>) View.OnClickListener.class, (Object) null);
        if (onClickListener4 != null) {
            setThreeCircleLayoutListener(onClickListener4);
        }
        View.OnClickListener onClickListener5 = (View.OnClickListener) qqw.a(map, "STEP_CLICK_LISTENER", (Class<Object>) View.OnClickListener.class, (Object) null);
        if (onClickListener5 != null) {
            setBottomClickListener(onClickListener5);
            setFitnessDataOriginIcon2Visible(8);
        }
    }

    @Override // com.huawei.health.knit.section.homesection.ModelBaseCardSection
    protected void setResource(HashMap<String, Object> map) {
        HealthTextView healthTextView;
        super.setResource(map);
        int iC = qqw.c(map, "BUBBLE_VISIBLE", -1);
        if (iC == -1 || (healthTextView = this.d) == null) {
            return;
        }
        healthTextView.setVisibility(iC);
    }

    @Override // com.huawei.health.knit.section.homesection.ModelBaseCardSection
    protected void execFunction(HashMap<String, Object> map) {
        super.execFunction(map);
        if (qqw.a(map, "UPDATE_THREE_CIRCLE_LAYOUT", false)) {
            g();
        }
        if (qqw.a(map, "RESET_ANIMATION", false)) {
            c();
        }
        if (qqw.a(map, "RESET_TEXT_BY_POSITION", false)) {
            h();
        }
        if (qqw.a(map, "UPDATE_THREE_CIRCLE_DATA", false)) {
            j();
        }
        if (qqw.a(map, "SET_THREE_LEAF_ICON", false)) {
            i();
        }
        if (qqw.a(map, "AFTER_STEP_CARD_CHANGE", false)) {
            a();
        }
        List listA = qqw.a((Map) map, "UPDATE_BOTTOM_DATA_THREE_CIRCLE", Integer.class, (List) null);
        if (listA == null || listA.size() < 2) {
            return;
        }
        updateBottomData(((Integer) listA.get(0)).intValue(), ((Integer) listA.get(1)).intValue());
    }

    private void j() {
        for (int i = 0; i < 3; i++) {
            e(i, this.mCurrentThreeCircleData[i], this.mGoalValue[i], false);
            LogUtil.a("ThreeCircleCardSection", "updateThreeCircle , update goal", Integer.valueOf(this.mGoalValue[i]), "value", Integer.valueOf(this.mCurrentThreeCircleData[i]));
            setTextByPosition(i, this.mCurrentThreeCircleData[i], this.mGoalValue[i]);
        }
    }

    private void h() {
        for (int i = 0; i < 3; i++) {
            setTextByPosition(i, 0, this.mGoalValue[i]);
        }
    }

    public void c() {
        for (int i = 0; i < 3; i++) {
            e(i, 0, this.mGoalValue[i], false);
        }
    }
}
