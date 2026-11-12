package com.huawei.health.knit.section.homesection;

import android.content.Context;
import android.graphics.Typeface;
import android.graphics.drawable.BitmapDrawable;
import android.text.SpannableString;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.ForegroundColorSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.core.content.ContextCompat;
import androidx.core.view.GravityCompat;
import com.huawei.haf.design.pattern.ObserverManagerUtil;
import com.huawei.health.knit.section.view.BaseSection;
import com.huawei.health.servicesui.R;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.cardview.HealthCardView;
import com.huawei.ui.commonui.columnsystem.HealthColumnSystem;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import defpackage.fsg;
import defpackage.lrd;
import defpackage.qli;
import defpackage.qqp;
import defpackage.qqs;
import defpackage.qqw;
import defpackage.qqz;
import defpackage.qre;
import defpackage.qrr;
import defpackage.qrs;
import defpackage.qsk;
import defpackage.qsp;
import health.compact.a.CommonUtil;
import health.compact.a.LanguageUtil;
import health.compact.a.ReleaseLogUtil;
import health.compact.a.UnitUtil;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes7.dex */
public abstract class ModelBaseCardSection extends BaseSection {
    private static final int BOTTOM_MARGIN_16 = 16;
    private static final int EIGHT = 8;
    private static final int MARGIN_CIRCLE_BETWEEN_DATA = 24;
    private static final int MARGIN_END_DATA_LAYOUT = 48;
    private static final int MIN_FIVE = -5;
    private static final String TAG = "ModelBaseCardSection";
    private static final int THIRTY_TWO = 32;
    private static final String THREE_LEAF_CIRCLE_LAYOUT_FLAG = "threeLeafCircleLayoutFlag";
    private static final int TWF = 12;
    protected View itemView;
    protected HealthTextView mActivityHoursText;
    protected ImageView mActivityIcon;
    protected RelativeLayout mActivityLayout;
    protected LinearLayout mActivityLayoutMiddle;
    protected HealthTextView mActivityTextUnit;
    protected HealthTextView mActivityTitleText;
    private RelativeLayout mBetaTipLayout;
    protected LinearLayout mBottomCapsuleLayout;
    protected LinearLayout mBottomCapsuleLayout2;
    protected ImageView mBottomIcon;
    protected HealthTextView mBottomText;
    protected ImageView mBottomTipIcon;
    protected LinearLayout mBottomTipLayout;
    protected HealthTextView mBottomValue;
    protected HealthTextView mBreathCountValue;
    protected HealthTextView mBubbleText;
    protected HealthCardView mCardViewForChinese;
    private LinearLayout mCircleAndDataLayout;
    protected int mColumnNum;
    protected HealthColumnSystem mColumnSystem;
    protected Context mContext;
    protected int[] mCurrentThreeCircleData;
    private LinearLayout mDataLayout;
    protected fsg mDefaultMsgInfo;
    protected ImageView mFitnessDataOriginIcon2;
    protected LinearLayout mFitnessDataOriginIcon2Layout;
    protected int[] mGoalValue;
    protected ImageView mHeatIcon;
    protected RelativeLayout mHeatLayout;
    protected HealthTextView mHeatText;
    protected HealthTextView mHeatTextView;
    protected HealthTextView mHeatUnit;
    protected LinearLayout mHeatValueLayout;
    private LinearLayout mMarketingLayout;
    protected HealthTextView mMessageRedDot;
    private View mOverlayView;
    private HealthTextView mPressureValue;
    private FrameLayout mRootViewLayout;
    protected LinearLayout mSleepArrayLayout;
    protected ImageView mSportIntensityIcon;
    protected HealthTextView mSportIntensityText;
    protected LinearLayout mStepLayoutMiddle;
    protected LinearLayout mStepStrenActivityLayout;
    protected LinearLayout mStrengthLayoutMiddle;
    private RelativeLayout mThreeCircleCardLayout;
    protected LinearLayout mThreeCircleLayoutContainer;
    protected ImageView mThreeLeafIcon;
    protected ImageView mThreeLeafIconBackground;
    protected RelativeLayout mTimeStrengthLayout;
    protected HealthTextView mTimeText;
    protected HealthTextView mTimeTextRight;
    private LinearLayout mTwoModelSwitchArea;

    protected void initActivityContentVisible(LinearLayout linearLayout, LinearLayout linearLayout2, LinearLayout linearLayout3, LinearLayout linearLayout4) {
    }

    public void initBottomStepLayout() {
    }

    protected void initModel(View view) {
    }

    protected void initStrengthLayoutVisible(LinearLayout linearLayout) {
    }

    protected void refreshActivityLayout() {
    }

    public void refreshUiForVisible() {
    }

    public void setFitnessDataOriginIcon2Visible(int i) {
    }

    public void updateBottomData(int i, int i2) {
    }

    @Override // android.view.View
    public String getTag() {
        return TAG;
    }

    public boolean updateLayout() {
        LogUtil.a(TAG, "updateLayout");
        this.mColumnSystem.b(getContext());
        if (this.mColumnNum == this.mColumnSystem.j()) {
            return true;
        }
        this.mColumnNum = this.mColumnSystem.j();
        updateMarketingLayout();
        if (isUpWideScreen()) {
            return showWideScreen();
        }
        return showSingleScreen();
    }

    private void updateMarketingLayout() {
        LinearLayout linearLayout = this.mMarketingLayout;
        if (linearLayout == null || this.mThreeCircleCardLayout == null || linearLayout.getVisibility() != 0) {
            LogUtil.j(TAG, "updateMarketingLayout mMarketingLayout not show");
        } else {
            this.mThreeCircleCardLayout.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: com.huawei.health.knit.section.homesection.ModelBaseCardSection.4
                @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
                public void onGlobalLayout() {
                    LogUtil.a(ModelBaseCardSection.TAG, "updateMarketingLayout onGlobalLayout");
                    ModelBaseCardSection modelBaseCardSection = ModelBaseCardSection.this;
                    modelBaseCardSection.loadMarketingView(modelBaseCardSection.mOverlayView);
                    ModelBaseCardSection.this.mThreeCircleCardLayout.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                }
            });
        }
    }

    private boolean showWideScreen() {
        LogUtil.a(TAG, "open to wide screen");
        ViewGroup.LayoutParams layoutParams = this.mCircleAndDataLayout.getLayoutParams();
        if (!(layoutParams instanceof RelativeLayout.LayoutParams)) {
            return false;
        }
        RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) layoutParams;
        layoutParams2.setMargins(0, qqp.a(getContext(), 12.0f), 0, 0);
        this.mCircleAndDataLayout.setLayoutParams(layoutParams2);
        this.mCircleAndDataLayout.setOrientation(0);
        this.mCircleAndDataLayout.setGravity(16);
        ViewGroup.LayoutParams layoutParams3 = this.mCardViewForChinese.getLayoutParams();
        if (!(layoutParams3 instanceof LinearLayout.LayoutParams)) {
            return false;
        }
        LinearLayout.LayoutParams layoutParams4 = (LinearLayout.LayoutParams) layoutParams3;
        layoutParams4.setMargins(0, qqp.a(getContext(), 16.0f), 0, 0);
        this.mCardViewForChinese.setLayoutParams(layoutParams4);
        ViewGroup.LayoutParams layoutParams5 = this.mThreeCircleLayoutContainer.getLayoutParams();
        if (!(layoutParams5 instanceof LinearLayout.LayoutParams)) {
            return false;
        }
        LinearLayout.LayoutParams layoutParams6 = (LinearLayout.LayoutParams) layoutParams5;
        layoutParams6.width = -2;
        layoutParams6.height = -2;
        layoutParams6.gravity = 16;
        layoutParams6.setMargins(qqp.a(getContext(), 32.0f), 0, qqp.a(getContext(), 24.0f), 0);
        this.mThreeCircleLayoutContainer.setLayoutParams(layoutParams6);
        ViewGroup.LayoutParams layoutParams7 = this.mDataLayout.getLayoutParams();
        if (!(layoutParams7 instanceof LinearLayout.LayoutParams)) {
            return false;
        }
        LinearLayout.LayoutParams layoutParams8 = (LinearLayout.LayoutParams) layoutParams7;
        layoutParams8.width = -1;
        layoutParams8.height = -2;
        layoutParams8.gravity = 16;
        layoutParams8.setMargins(0, 0, qqp.a(getContext(), 48.0f), 0);
        this.mDataLayout.setLayoutParams(layoutParams8);
        this.mDataLayout.setOrientation(0);
        this.mDataLayout.setGravity(16);
        return true;
    }

    private boolean showSingleScreen() {
        LogUtil.a(TAG, "close to single screen");
        ViewGroup.LayoutParams layoutParams = this.mCircleAndDataLayout.getLayoutParams();
        if (!(layoutParams instanceof RelativeLayout.LayoutParams)) {
            return false;
        }
        RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) layoutParams;
        layoutParams2.setMargins(0, 0, 0, 0);
        this.mCircleAndDataLayout.setLayoutParams(layoutParams2);
        this.mCircleAndDataLayout.setOrientation(1);
        this.mCircleAndDataLayout.setGravity(1);
        ViewGroup.LayoutParams layoutParams3 = this.mCardViewForChinese.getLayoutParams();
        if (!(layoutParams3 instanceof LinearLayout.LayoutParams)) {
            return false;
        }
        LinearLayout.LayoutParams layoutParams4 = (LinearLayout.LayoutParams) layoutParams3;
        layoutParams4.setMargins(0, qqp.a(getContext(), 8.0f), 0, 0);
        this.mCardViewForChinese.setLayoutParams(layoutParams4);
        ViewGroup.LayoutParams layoutParams5 = this.mThreeCircleLayoutContainer.getLayoutParams();
        if (!(layoutParams5 instanceof LinearLayout.LayoutParams)) {
            return false;
        }
        LinearLayout.LayoutParams layoutParams6 = (LinearLayout.LayoutParams) layoutParams5;
        layoutParams6.width = -1;
        layoutParams6.height = -2;
        layoutParams6.gravity = 1;
        layoutParams6.setMargins(0, 0, 0, qqp.a(getContext(), -5.0f));
        this.mThreeCircleLayoutContainer.setLayoutParams(layoutParams6);
        ViewGroup.LayoutParams layoutParams7 = this.mDataLayout.getLayoutParams();
        if (!(layoutParams7 instanceof LinearLayout.LayoutParams)) {
            return false;
        }
        LinearLayout.LayoutParams layoutParams8 = (LinearLayout.LayoutParams) layoutParams7;
        layoutParams8.width = -1;
        layoutParams8.height = -2;
        layoutParams8.gravity = 1;
        layoutParams8.setMargins(0, 0, 0, 0);
        this.mDataLayout.setLayoutParams(layoutParams8);
        this.mDataLayout.setOrientation(1);
        this.mDataLayout.setGravity(1);
        return true;
    }

    private void addDetailView() {
        View viewInflate = LayoutInflater.from(getContext()).inflate(qsk.c(R.layout.home_item_layout_three_circle), (ViewGroup) null);
        this.itemView = viewInflate;
        viewInflate.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: com.huawei.health.knit.section.homesection.ModelBaseCardSection.5
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public void onGlobalLayout() {
                if (ModelBaseCardSection.this.itemView.getMeasuredWidth() <= 0) {
                    return;
                }
                ObserverManagerUtil.e(ModelBaseCardSection.THREE_LEAF_CIRCLE_LAYOUT_FLAG, ModelBaseCardSection.this.getContext());
                ModelBaseCardSection.this.itemView.getViewTreeObserver().removeOnGlobalLayoutListener(this);
            }
        });
    }

    private boolean isUpWideScreen() {
        return this.mColumnNum >= 8;
    }

    private void initView(Context context) {
        findView();
        refreshBigScaleAndOverseaLayoutParams();
        displayOverseaLayout(context);
        initBottomStepLayout();
        Typeface typefaceCreateFromAsset = Typeface.createFromAsset(context.getAssets(), "font/HarmonyOSCondensedClockProportional-Medium.ttf");
        this.mHeatText.setTypeface(typefaceCreateFromAsset);
        this.mTimeText.setTypeface(typefaceCreateFromAsset);
        this.mActivityHoursText.setTypeface(typefaceCreateFromAsset);
        this.mPressureValue.setTypeface(typefaceCreateFromAsset);
        this.mHeatText.setText(localNumberFormat(getContext(), 0, 1, 0));
        this.mTimeText.setText(localNumberFormat(getContext(), 0, 1, 0));
        this.mActivityHoursText.setText(localNumberFormat(getContext(), 0, 1, 0));
        this.mPressureValue.setText(localNumberFormat(getContext(), 0, 1, 0));
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (CommonUtil.ap() && CommonUtil.d() <= jCurrentTimeMillis && jCurrentTimeMillis <= CommonUtil.b()) {
            this.mBetaTipLayout.setVisibility(0);
        } else {
            this.mBetaTipLayout.setVisibility(8);
        }
    }

    private static String localNumberFormat(Context context, int i, int i2, int i3) {
        if (context == null) {
            return "";
        }
        if (LanguageUtil.l(context)) {
            return String.valueOf(i);
        }
        return UnitUtil.e(i, i2, i3);
    }

    private void findView() {
        this.mRootViewLayout = (FrameLayout) this.itemView.findViewById(R.id.home_item_three_circle_card_layout);
        this.mThreeCircleCardLayout = (RelativeLayout) this.itemView.findViewById(R.id.three_circle_card_layout);
        this.mMarketingLayout = (LinearLayout) this.itemView.findViewById(R.id.marketing_layout);
        this.mThreeCircleLayoutContainer = (LinearLayout) this.itemView.findViewById(R.id.three_circle_layout_container);
        this.mHeatLayout = (RelativeLayout) this.itemView.findViewById(R.id.stepLayout);
        this.mHeatIcon = (ImageView) this.itemView.findViewById(R.id.iv_steps_icon);
        this.mHeatTextView = (HealthTextView) this.itemView.findViewById(R.id.tv_steps);
        if (LanguageUtil.bi(getContext()) || LanguageUtil.ao(getContext())) {
            this.mHeatTextView.setMaxLines(1);
            this.mHeatTextView.setTextSize(2, 10.0f);
        }
        this.mHeatTextView.setText(getContext().getString(R.string.IDS_active_caloric));
        this.mHeatText = (HealthTextView) this.itemView.findViewById(R.id.stepsText);
        this.mHeatUnit = (HealthTextView) this.itemView.findViewById(R.id.hw_health_steps);
        this.mHeatValueLayout = (LinearLayout) this.itemView.findViewById(R.id.data_layout_step_layout);
        this.mSleepArrayLayout = (LinearLayout) this.itemView.findViewById(R.id.data_layout_sleep_array);
        this.mMessageRedDot = (HealthTextView) this.itemView.findViewById(R.id.message_count_new);
        initSleepLayout();
        initModel(this.itemView);
        ImageView imageView = (ImageView) this.itemView.findViewById(R.id.hw_health_fitness_data_origin_icon2);
        this.mFitnessDataOriginIcon2 = imageView;
        lrd.b(imageView, qre.f(R.string.IDS_lactate_tittlebar_top));
        this.mFitnessDataOriginIcon2Layout = (LinearLayout) this.itemView.findViewById(R.id.hw_health_fitness_data_origin_icon2_layout);
        this.mThreeLeafIconBackground = (ImageView) this.itemView.findViewById(R.id.three_circle_icon_background);
        this.mTwoModelSwitchArea = (LinearLayout) this.itemView.findViewById(R.id.switch_button_area);
        if (LanguageUtil.ba(getContext())) {
            this.mThreeLeafIconBackground.setBackground(qqz.e(getContext(), R.drawable.three_leaf_background));
        } else {
            this.mThreeLeafIconBackground.setBackgroundResource(R.drawable.three_leaf_background);
        }
        lrd.b(this.mThreeLeafIconBackground, qre.f(R.string.IDS_health_clover_title));
        this.mThreeLeafIcon = (ImageView) this.itemView.findViewById(R.id.three_circle_icon);
        this.mBubbleText = (HealthTextView) this.itemView.findViewById(R.id.switch_bubble_text);
        initActivityStrengthView();
        this.mActivityLayoutMiddle = (LinearLayout) this.itemView.findViewById(R.id.data_layout_activity);
        initActivityContentVisible(this.mActivityLayoutMiddle, (LinearLayout) this.itemView.findViewById(R.id.data_layout_emotion_pressure), (LinearLayout) this.itemView.findViewById(R.id.data_layout_emotion_breath_count), (LinearLayout) this.itemView.findViewById(R.id.data_layout_emotion_breath_array));
        initBottomLayout();
        initExtraView();
        initTwoModelSwitch();
    }

    private void initActivityStrengthView() {
        this.mTimeStrengthLayout = (RelativeLayout) this.itemView.findViewById(R.id.time_strength_layout);
        this.mSportIntensityIcon = (ImageView) this.itemView.findViewById(R.id.sport_intensity_icon);
        HealthTextView healthTextView = (HealthTextView) this.itemView.findViewById(R.id.tv_sport_intensity);
        this.mSportIntensityText = healthTextView;
        healthTextView.setText(getContext().getString(R.string.IDS_active_workout));
        this.mTimeText = (HealthTextView) this.itemView.findViewById(R.id.timeText);
        HealthTextView healthTextView2 = (HealthTextView) this.itemView.findViewById(R.id.timeTextRight);
        this.mTimeTextRight = healthTextView2;
        healthTextView2.setText(getContext().getString(R.string.IDS_settings_steps_unit));
        LinearLayout linearLayout = (LinearLayout) this.itemView.findViewById(R.id.step_strength_activity_layout);
        this.mStepStrenActivityLayout = linearLayout;
        initStrengthLayoutVisible(linearLayout);
        this.mActivityLayout = (RelativeLayout) this.itemView.findViewById(R.id.activityLayout);
        this.mActivityHoursText = (HealthTextView) this.itemView.findViewById(R.id.activity_hours_value);
        this.mActivityTextUnit = (HealthTextView) this.itemView.findViewById(R.id.activity_hours_unit);
        this.mActivityIcon = (ImageView) this.itemView.findViewById(R.id.activity_icon);
        this.mPressureValue = (HealthTextView) this.itemView.findViewById(R.id.pressure_value);
        this.mActivityTitleText = (HealthTextView) this.itemView.findViewById(R.id.activity_hours);
    }

    private void initBottomLayout() {
        this.mCardViewForChinese = (HealthCardView) this.itemView.findViewById(R.id.distance_heat_floor_layout_for_chinese);
        LinearLayout linearLayout = (LinearLayout) this.itemView.findViewById(R.id.bottom_step_layout);
        this.mBottomCapsuleLayout = linearLayout;
        this.mBottomIcon = (ImageView) linearLayout.findViewById(R.id.bottom_step_icon);
        this.mBottomText = (HealthTextView) this.mBottomCapsuleLayout.findViewById(R.id.bottom_step_text);
        this.mBottomValue = (HealthTextView) this.mBottomCapsuleLayout.findViewById(R.id.bottom_step_value);
        this.mBottomTipIcon = (ImageView) this.itemView.findViewById(R.id.bottom_step_tip_icon);
        this.mBottomTipLayout = (LinearLayout) this.itemView.findViewById(R.id.bottom_step_tip_layout);
        if (qqs.e(getContext())) {
            this.mCardViewForChinese.setCardBackgroundColor(getContext().getColor(R.color.common_white_5alpha));
            this.mDefaultMsgInfo.d(R.color.common_white_5alpha);
        } else {
            this.mCardViewForChinese.setCardBackgroundColor(getContext().getColor(R.color.common_black_5alpha));
            this.mDefaultMsgInfo.d(R.color.common_black_5alpha);
        }
        if (!LanguageUtil.an(BaseApplication.getContext())) {
            ViewGroup.LayoutParams layoutParams = this.mBottomText.getLayoutParams();
            if (layoutParams instanceof LinearLayout.LayoutParams) {
                ((LinearLayout.LayoutParams) layoutParams).setMarginEnd(getContext().getResources().getDimensionPixelOffset(R.dimen.health_common_6dp));
            }
        }
        this.mBottomCapsuleLayout2 = (LinearLayout) this.itemView.findViewById(R.id.bottom_step_layout_2);
    }

    private void refreshBigScaleAndOverseaLayoutParams() {
        LinearLayout linearLayout = (LinearLayout) this.itemView.findViewById(R.id.stepLayout_middle);
        this.mStepLayoutMiddle = linearLayout;
        setLayoutParamsThreeLine(linearLayout, this.mHeatUnit, false);
        LinearLayout linearLayout2 = (LinearLayout) this.itemView.findViewById(R.id.time_strength_layout_middle);
        this.mStrengthLayoutMiddle = linearLayout2;
        setLayoutParamsThreeLine(linearLayout2, this.mTimeTextRight, false);
        refreshActivityLayout();
    }

    protected void setLayoutParamsThreeLine(LinearLayout linearLayout, HealthTextView healthTextView, boolean z) {
        if (healthTextView.getLayoutParams() instanceof LinearLayout.LayoutParams) {
            if (qrs.u() || !LanguageUtil.f(getContext()) || z) {
                linearLayout.setOrientation(1);
                this.mHeatValueLayout.setOrientation(1);
                LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) healthTextView.getLayoutParams();
                layoutParams.setMargins(0, qqp.a(getContext(), 2.0f), 0, 0);
                layoutParams.setMarginStart(0);
                healthTextView.setLayoutParams(layoutParams);
                healthTextView.setGravity(GravityCompat.START);
                return;
            }
            linearLayout.setOrientation(0);
            this.mHeatValueLayout.setOrientation(0);
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) healthTextView.getLayoutParams();
            layoutParams2.setMargins(qqp.a(getContext(), 2.0f), 0, 0, qqp.a(getContext(), 2.0f));
            healthTextView.setLayoutParams(layoutParams2);
            healthTextView.setGravity(80);
        }
    }

    private void initTwoModelSwitch() {
        this.mCircleAndDataLayout = (LinearLayout) this.itemView.findViewById(R.id.model_and_data);
        this.mDataLayout = (LinearLayout) this.itemView.findViewById(R.id.data_layout);
    }

    protected void initSleepLayout() {
        this.mHeatValueLayout.setVisibility(0);
        this.mSleepArrayLayout.setVisibility(8);
    }

    private void initExtraView() {
        this.mBetaTipLayout = (RelativeLayout) this.itemView.findViewById(R.id.hw_health_home_dameon_beta_version_no_expire);
    }

    private void displayOverseaLayout(Context context) {
        if (LanguageUtil.ba(context)) {
            this.mBetaTipLayout.setBackgroundResource(R.drawable.ic_beta_tip_logo);
        }
    }

    public ImageView getFitnessDataOriginIcon() {
        return this.mBottomTipIcon;
    }

    public LinearLayout getFitnessDataOriginIconLayout() {
        return this.mBottomTipLayout;
    }

    public RelativeLayout getThreeCircleCardLayout() {
        return this.mThreeCircleCardLayout;
    }

    protected boolean checkBottomLayoutNeedLine(LinearLayout linearLayout) {
        HealthTextView healthTextView = (HealthTextView) linearLayout.findViewById(R.id.bottom_step_text);
        HealthTextView healthTextView2 = (HealthTextView) linearLayout.findViewById(R.id.bottom_step_value);
        ImageView imageView = (ImageView) linearLayout.findViewById(R.id.bottom_step_tip_icon);
        if (healthTextView2 == null || imageView == null) {
            LogUtil.j(TAG, "checkBottomLayoutNeedLine bottomValue is null ,return");
            return false;
        }
        int width = linearLayout.getWidth();
        int measureWidth = (int) healthTextView.getMeasureWidth();
        int width2 = healthTextView2.getWidth();
        if (width <= 0 || measureWidth <= 0 || width2 <= 0) {
            LogUtil.j(TAG, "updateBottomLayoutOrientation Width = 0 return");
            return false;
        }
        float dimension = imageView.getVisibility() == 0 ? getContext().getResources().getDimension(R.dimen.health_common_30dp) : 0.0f;
        int dimensionPixelOffset = width - getContext().getResources().getDimensionPixelOffset(R.dimen.health_common_52dp);
        LogUtil.a(TAG, " titleWidth=" + measureWidth, " stepWidth=" + width2, " tipWidth=", Float.valueOf(dimension), " containerWidth=", Integer.valueOf(dimensionPixelOffset));
        if (measureWidth + dimension + width2 >= dimensionPixelOffset) {
            linearLayout.setOrientation(1);
            return true;
        }
        linearLayout.setOrientation(0);
        return false;
    }

    protected SpannableString lightBottomCurrentText(String str, String str2) {
        SpannableString spannableString = new SpannableString(str);
        int iIndexOf = spannableString.toString().indexOf(str2);
        if (iIndexOf != -1) {
            spannableString.setSpan(new ForegroundColorSpan(ContextCompat.getColor(getContext(), R.color.textColorPrimary)), iIndexOf, str2.length() + iIndexOf, 33);
            spannableString.setSpan(new AbsoluteSizeSpan(getContext().getResources().getDimensionPixelSize(R.dimen.textSizeSubTitle1)), iIndexOf, str2.length() + iIndexOf, 33);
            spannableString.setSpan(new qli(qrr.e()), iIndexOf, str2.length() + iIndexOf, 17);
        }
        return spannableString;
    }

    public void updateMsgRedDotVisibility(int i) {
        this.mMessageRedDot.setVisibility(i);
    }

    public void showMarketingLayout(View view) {
        LogUtil.a(TAG, "showMarketingLayout");
        if (this.mMarketingLayout == null || this.mThreeCircleCardLayout == null) {
            ReleaseLogUtil.d(TAG, "showMarketingLayout mMarketingLayout is null");
            return;
        }
        setOverlayView(view);
        if (view == null) {
            this.mMarketingLayout.removeAllViews();
            this.mMarketingLayout.setVisibility(8);
            return;
        }
        this.mMarketingLayout.setVisibility(0);
        if (this.mThreeCircleCardLayout.getHeight() == 0) {
            LogUtil.a(TAG, "showMarketingLayout mCircleAndDataLayout height is 0");
            updateMarketingLayout();
        } else {
            loadMarketingView(view);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void loadMarketingView(View view) {
        if (view.getParent() instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view.getParent();
            viewGroup.removeView(view);
            viewGroup.setVisibility(8);
        }
        int height = this.mThreeCircleCardLayout.getHeight();
        this.mMarketingLayout.removeAllViews();
        this.mMarketingLayout.addView(view, -1, height);
        this.mMarketingLayout.setVisibility(0);
        LogUtil.a(TAG, "updateMarketingLayout height :", Integer.valueOf(height));
    }

    public void setOverlayView(View view) {
        this.mOverlayView = view;
    }

    public View getOverlayView() {
        return this.mOverlayView;
    }

    public ModelBaseCardSection(Context context) {
        super(context);
        this.mDefaultMsgInfo = new fsg();
        this.mColumnNum = 0;
        this.itemView = null;
        this.mCurrentThreeCircleData = new int[]{0, 0, 0, 0, 0, 0, 0};
        this.mGoalValue = new int[]{270, 25, 12, 10000};
        this.mContext = context;
    }

    @Override // com.huawei.health.knit.section.view.BaseSection
    public View onCreateView(Context context) {
        this.mContext = context;
        HealthColumnSystem healthColumnSystem = new HealthColumnSystem(getContext(), 1);
        this.mColumnSystem = healthColumnSystem;
        this.mColumnNum = healthColumnSystem.j();
        addDetailView();
        initView(context);
        if (isUpWideScreen()) {
            showWideScreen();
        }
        return this.itemView;
    }

    @Override // com.huawei.health.knit.section.view.BaseSection
    public void bindParamsToView(HashMap<String, Object> map) {
        LogUtil.a(TAG, "bindParamsToView");
        if (map == null || map.isEmpty()) {
            LogUtil.a(TAG, "no need to bind");
            return;
        }
        int[] iArr = (int[]) qqw.a(map, "CURRENT_THREE_CIRCLE_DATA", (Class<Object>) int[].class, (Object) null);
        if (iArr != null) {
            this.mCurrentThreeCircleData = iArr;
        }
        int[] iArr2 = (int[]) qqw.a(map, "GOAL_THREE_CIRCLE_DATA", (Class<Object>) int[].class, (Object) null);
        if (iArr2 != null) {
            this.mGoalValue = iArr2;
        }
        setTextAndListener(map);
        setResource(map);
        execFunction(map);
    }

    protected void execFunction(HashMap<String, Object> map) {
        if (qqw.a(map, "IS_SHOW_STEP_ICON", false)) {
            showStepIconImage();
        }
    }

    protected void setResource(HashMap<String, Object> map) {
        int iC = qqw.c(map, "SET_BACKGROUND_RESOURCE", -1);
        if (iC != -1) {
            getFitnessDataOriginIcon().setBackgroundResource(iC);
        }
        int iC2 = qqw.c(map, "SET_FITNESS_DATA_ORIGIN_ICON2VISIBLE", -1);
        if (iC2 != -1) {
            setFitnessDataOriginIcon2Visible(iC2);
        }
        int iC3 = qqw.c(map, "UPDATE_MSG_RED_DOT_VISIBILITY", -1);
        if (iC3 != -1) {
            updateMsgRedDotVisibility(iC3);
        }
    }

    protected void setTextAndListener(HashMap<String, Object> map) {
        qsp.b(this.mHeatUnit, qqw.d((Map) map, "HEALTH_SHOW_TIME_UNIT", ""));
        View.OnClickListener onClickListener = (View.OnClickListener) qqw.a(map, "SHOW_FITNESS_LISTENER", (Class<Object>) View.OnClickListener.class, (Object) null);
        if (onClickListener != null) {
            this.mFitnessDataOriginIcon2Layout.setOnClickListener(onClickListener);
        }
        View.OnClickListener onClickListener2 = (View.OnClickListener) qqw.a(map, "BOTTOM_STEP_LISTENER", (Class<Object>) View.OnClickListener.class, (Object) null);
        if (onClickListener2 != null) {
            this.mBottomTipLayout.setOnClickListener(onClickListener2);
        }
        final View.OnClickListener onClickListener3 = (View.OnClickListener) qqw.a(map, "TWO_MODEL_SWITCH", (Class<Object>) View.OnClickListener.class, (Object) null);
        LinearLayout linearLayout = this.mTwoModelSwitchArea;
        if (linearLayout != null && onClickListener3 != null) {
            linearLayout.setOnClickListener(new View.OnClickListener() { // from class: frw
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.e.m1119xcf45b673(onClickListener3, view);
                }
            });
        }
        String strD = qqw.d((Map) map, "SET_MSG_RED_DOT_TEXT", (String) null);
        if (strD != null) {
            this.mMessageRedDot.setText(strD);
        }
    }

    /* JADX INFO: renamed from: lambda$setTextAndListener$0$com-huawei-health-knit-section-homesection-ModelBaseCardSection, reason: not valid java name */
    public /* synthetic */ void m1119xcf45b673(View.OnClickListener onClickListener, View view) {
        onClickListener.onClick(view);
        HealthTextView healthTextView = this.mBubbleText;
        if (healthTextView != null) {
            healthTextView.setVisibility(8);
        }
    }

    private void showStepIconImage() {
        if (this.mContext == null) {
            health.compact.a.hwlogsmodel.ReleaseLogUtil.e(TAG, "isShowIconImage obj is null");
            return;
        }
        int i = R.drawable.ic_health_information_new;
        if (LanguageUtil.ba(this.mContext)) {
            BitmapDrawable bitmapDrawableE = qqz.e(this.mContext, i);
            if (bitmapDrawableE == null) {
                getFitnessDataOriginIcon().setBackgroundResource(i);
                return;
            } else {
                getFitnessDataOriginIcon().setBackground(bitmapDrawableE);
                return;
            }
        }
        getFitnessDataOriginIcon().setBackgroundResource(i);
    }
}
