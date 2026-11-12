package com.huawei.indoorequip.doublescreen;

import android.app.Presentation;
import android.content.Context;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.huawei.health.sportservice.SportLifecycle;
import com.huawei.health.userprofilemgr.api.UserProfileMgrApi;
import com.huawei.healthcloud.plugintrack.ui.sporttypeconfig.bean.HwSportTypeInfo;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwcommonmodel.fitnessdatatype.HeartZoneConf;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.indoorequip.R;
import com.huawei.indoorequip.viewmodel.IndoorEquipViewModel;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import defpackage.hae;
import defpackage.jry;
import defpackage.nzc;
import defpackage.nzg;
import health.compact.a.Services;
import java.util.Map;

/* JADX INFO: loaded from: classes12.dex */
public abstract class IndoorTvBaseDisplay extends Presentation implements SportLifecycle {
    private static final float BACKGROUND_IMAGE_SIZE = 248.0f;
    private static final int BLUE = -11100428;
    private static final float BT_IMAGE_MARGIN_LEFT = 16.0f;
    private static final float BT_IMAGE_MARGIN_TOP = 4.0f;
    private static final float BT_IMAGE_SIZE = 40.0f;
    private static final float DEFAULT_DENSITY = 3.0f;
    public static final int DEFAULT_MARGIN = 0;
    private static final float DEFAULT_UX_WIDTH = 1920.0f;
    private static final int GREEN = -16722343;
    protected static final int INIT_DATA = 0;
    private static final float LOGO_IMAGE_SIZE = 20.5f;
    private static final float LOGO_LAYOUT_MARGIN_TOP = 29.5f;
    private static final float LOGO_MARGIN_END = 5.4f;
    private static final int MAX_HEART_RATE = 0;
    private static final int ORANGE = -1282048;
    private static final int RED = -58880;
    private static final float RUNWAY_HEIGHT = 55.8f;
    private static final String TAG = "Track_IndoorTvBaseDisplay";
    private static final int WHITE = -1;
    private static final int YELLOW = -602087;
    protected ImageView mBackground;
    protected ImageView mBtBoltConnectIcon;
    protected ImageView mBtIcon;
    private int mClassifyMethod;
    protected Context mContext;
    protected float mCurrentDisplayDensity;
    protected float mCurrentDisplayWidth;
    protected boolean mHasRunPostureDevice;
    protected boolean mHasWear;
    protected HealthTextView mHeartRate;
    private int mHeartRateAerobic;
    private int mHeartRateAnaerobic;
    protected ImageView mHeartRateImage;
    private int mHeartRateLimit;
    private int mHeartRateReduceFat;
    protected HealthTextView mHeartRateType;
    protected HealthTextView mHeartRateUnit;
    private int mHeartRateWarmUp;
    private volatile boolean mIsInitHeartZoneFinish;
    protected ImageView mLogoImage;
    protected LinearLayout mLogoLayout;
    public ImageView mRunway;
    protected ImageView mRunwayBackground;
    protected float mScale;
    protected nzg mTargetModeWithProgressViewHolder;
    protected IndoorEquipViewModel mViewModel;

    protected abstract void initNormalView();

    public abstract void setBtConnectState(String str);

    public abstract void updateProgress(int i);

    public abstract void updateUi(Map<Integer, Object> map);

    public IndoorTvBaseDisplay(Context context, Display display) {
        super(context, display);
        this.mHasRunPostureDevice = false;
        this.mHasWear = false;
        this.mScale = 1.0f;
        this.mIsInitHeartZoneFinish = false;
        this.mContext = context;
    }

    public IndoorTvBaseDisplay(Context context, Display display, int i) {
        super(context, display, i);
        this.mHasRunPostureDevice = false;
        this.mHasWear = false;
        this.mScale = 1.0f;
        this.mIsInitHeartZoneFinish = false;
    }

    protected void changeBtBoltIconSize() {
        ImageView imageView = this.mBtBoltConnectIcon;
        if (imageView == null || !(imageView.getLayoutParams() instanceof LinearLayout.LayoutParams)) {
            return;
        }
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.mBtBoltConnectIcon.getLayoutParams();
        layoutParams.width = (int) (this.mScale * dp2px(BT_IMAGE_SIZE));
        layoutParams.height = (int) (this.mScale * dp2px(BT_IMAGE_SIZE));
        layoutParams.setMargins(0, ((int) this.mScale) * dp2px(BT_IMAGE_MARGIN_TOP), 0, 0);
        layoutParams.setMarginStart(((int) this.mScale) * dp2px(BT_IMAGE_MARGIN_LEFT));
        this.mBtBoltConnectIcon.setLayoutParams(layoutParams);
    }

    protected void initWindowConfig() {
        if (getWindow() != null) {
            getWindow().setStatusBarColor(0);
            getWindow().getDecorView().setSystemUiVisibility(1024);
            getWindow().addFlags(134217728);
            getWindow().setFlags(1024, 1024);
        }
        setCancelable(false);
        setCanceledOnTouchOutside(false);
        Display display = getDisplay();
        DisplayMetrics displayMetrics = new DisplayMetrics();
        display.getMetrics(displayMetrics);
        float f = displayMetrics.density;
        this.mCurrentDisplayDensity = f;
        LogUtil.a(TAG, "mCurrentDisplayDensity", Float.valueOf(f));
        LogUtil.a(TAG, "mContext.getResources().getDisplayMetrics().density", Float.valueOf(this.mContext.getResources().getDisplayMetrics().density));
        float f2 = displayMetrics.widthPixels;
        this.mCurrentDisplayWidth = f2;
        float f3 = this.mCurrentDisplayDensity;
        if (f3 != 0.0f) {
            this.mScale = (3.0f / f3) * (f2 / DEFAULT_UX_WIDTH);
        }
        LogUtil.a(TAG, "scale = ", Float.valueOf(this.mScale), " ,mCurrentDisplayDensity = ", Float.valueOf(displayMetrics.density), " ,mCurrentDisplayWidth = ", Integer.valueOf(displayMetrics.widthPixels), " ,mCurrentDisplayHeight = ", Integer.valueOf(displayMetrics.heightPixels));
    }

    protected void changeBtIconSize() {
        ImageView imageView = this.mBtIcon;
        if (imageView == null || !(imageView.getLayoutParams() instanceof LinearLayout.LayoutParams)) {
            return;
        }
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.mBtIcon.getLayoutParams();
        layoutParams.width = (int) (this.mScale * dp2px(BT_IMAGE_SIZE));
        layoutParams.height = (int) (this.mScale * dp2px(BT_IMAGE_SIZE));
        layoutParams.setMargins(0, ((int) this.mScale) * dp2px(BT_IMAGE_MARGIN_TOP), 0, 0);
        layoutParams.setMarginStart(((int) this.mScale) * dp2px(BT_IMAGE_MARGIN_LEFT));
        this.mBtIcon.setLayoutParams(layoutParams);
    }

    protected void initTargetLayout() {
        ViewStub viewStub = (ViewStub) findViewById(R.id.view_stub_target_mode_with_progress);
        if (viewStub == null) {
            return;
        }
        View viewInflate = viewStub.inflate();
        nzg nzgVar = new nzg(viewInflate, this.mViewModel);
        this.mTargetModeWithProgressViewHolder = nzgVar;
        nzgVar.a(this.mHasWear);
        this.mTargetModeWithProgressViewHolder.b(this.mScale);
        if (viewInflate instanceof RelativeLayout) {
            RelativeLayout relativeLayout = (RelativeLayout) viewInflate;
            RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) relativeLayout.getLayoutParams();
            layoutParams.addRule(13);
            relativeLayout.setLayoutParams(layoutParams);
        }
    }

    protected void changeLogoMargin() {
        if (this.mLogoLayout.getLayoutParams() instanceof RelativeLayout.LayoutParams) {
            RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.mLogoLayout.getLayoutParams();
            layoutParams.setMargins(0, (int) (this.mScale * dp2px(LOGO_LAYOUT_MARGIN_TOP)), 0, 0);
            layoutParams.setMarginEnd(((int) this.mScale) * dp2px(LOGO_MARGIN_END));
            this.mLogoLayout.setLayoutParams(layoutParams);
        }
    }

    protected void changeBackgroundSize() {
        if (this.mBackground.getLayoutParams() instanceof RelativeLayout.LayoutParams) {
            RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.mBackground.getLayoutParams();
            layoutParams.height = (int) (this.mScale * dp2px(BACKGROUND_IMAGE_SIZE));
            layoutParams.width = (int) (this.mScale * dp2px(BACKGROUND_IMAGE_SIZE));
            this.mBackground.setLayoutParams(layoutParams);
        }
    }

    protected int dp2px(float f) {
        return (int) (((double) (f * this.mCurrentDisplayDensity)) + 0.5d);
    }

    protected void initHeartRateZone(int i) {
        HwSportTypeInfo hwSportTypeInfoB = jry.a(BaseApplication.getContext()).b(i);
        int heartPostureType = hwSportTypeInfoB == null ? 1 : hwSportTypeInfoB.getHeartPostureType();
        UserProfileMgrApi userProfileMgrApi = (UserProfileMgrApi) Services.d("HWUserProfileMgr", UserProfileMgrApi.class);
        if (userProfileMgrApi == null) {
            LogUtil.j(TAG, "userProfileMgrApi is null.");
            return;
        }
        HeartZoneConf heartZoneConfA = hae.a(heartPostureType, userProfileMgrApi.getLocalUserInfo().getAgeOrDefaultValue());
        this.mClassifyMethod = heartZoneConfA.getClassifyMethod();
        boolean zIsWarningEnble = heartZoneConfA.isWarningEnble();
        int warningLimitHR = heartZoneConfA.getWarningLimitHR();
        int maxThreshold = heartZoneConfA.getMaxThreshold();
        int i2 = this.mClassifyMethod;
        if (i2 == 0) {
            this.mHeartRateLimit = heartZoneConfA.getAnaerobicThreshold();
            this.mHeartRateAnaerobic = heartZoneConfA.getAerobicThreshold();
            this.mHeartRateAerobic = heartZoneConfA.getFatBurnThreshold();
            this.mHeartRateReduceFat = heartZoneConfA.getWarmUpThreshold();
            this.mHeartRateWarmUp = heartZoneConfA.getFitnessThreshold();
        } else if (i2 == 1) {
            this.mHeartRateLimit = heartZoneConfA.getAnaerobicAdvanceThreshold();
            this.mHeartRateAnaerobic = heartZoneConfA.getAnaerobicBaseThreshold();
            this.mHeartRateAerobic = heartZoneConfA.getLacticAcidThreshold();
            this.mHeartRateReduceFat = heartZoneConfA.getAerobicAdvanceThreshold();
            this.mHeartRateWarmUp = heartZoneConfA.getAerobicBaseThreshold();
        } else if (i2 == 3) {
            this.mHeartRateLimit = heartZoneConfA.getLthrAnaerobicInterval();
            this.mHeartRateAnaerobic = heartZoneConfA.getLthrLactateThreshold();
            this.mHeartRateAerobic = heartZoneConfA.getLthrAerobicHighZone();
            this.mHeartRateReduceFat = heartZoneConfA.getLthrAerobicLowZone();
            this.mHeartRateWarmUp = heartZoneConfA.getLthrRecoveryInterval();
        }
        this.mIsInitHeartZoneFinish = true;
        LogUtil.a(TAG, "======initData====ClassifyMethod: ", Integer.valueOf(this.mClassifyMethod), "isHeartRateMaxAlarmOn:", Boolean.valueOf(zIsWarningEnble), " mmHeartRateUpLimit", Integer.valueOf(warningLimitHR), " heartRateMax", Integer.valueOf(maxThreshold), " mHeartRateLimit", Integer.valueOf(this.mHeartRateLimit), " mHeartRateAnaerobic", Integer.valueOf(this.mHeartRateAnaerobic), " mHeartRateAerobic", Integer.valueOf(this.mHeartRateAerobic), " mHeartRateReduceFat", Integer.valueOf(this.mHeartRateReduceFat), " mHeartRateWarmUp", Integer.valueOf(this.mHeartRateWarmUp));
    }

    protected void setHeartRateImage(int i) {
        if (!this.mIsInitHeartZoneFinish) {
            this.mHeartRateImage.setImageDrawable(getResources().getDrawable(R.drawable.heartrate1));
            this.mHeartRateType.setText("");
            this.mHeartRate.setTextColor(-1);
            return;
        }
        int i2 = this.mHeartRateLimit;
        if (i >= i2 && i < 255) {
            this.mHeartRateImage.setImageDrawable(getResources().getDrawable(R.drawable.heartrate6));
            this.mHeartRate.setTextColor(RED);
            heartRateTypeText(this.mContext.getString(R.string.IDS_motiontrack_detail_fm_heart_limit), this.mContext.getString(R.string.IDS_rate_zone_hrr_anaerobicAdvance_threshold), this.mContext.getString(R.string.IDS_lactate_subHeader_top7));
            return;
        }
        int i3 = this.mHeartRateAnaerobic;
        if (i >= i3 && i < i2) {
            this.mHeartRateImage.setImageDrawable(getResources().getDrawable(R.drawable.heartrate5));
            this.mHeartRate.setTextColor(ORANGE);
            heartRateTypeText(this.mContext.getString(R.string.IDS_motiontrack_detail_fm_heart_wynl), this.mContext.getString(R.string.IDS_rate_zone_hrr_anaerobicBase_threshold), this.mContext.getString(R.string.IDS_rate_zone_hrr_lacticAcid_threshold));
            return;
        }
        int i4 = this.mHeartRateAerobic;
        if (i >= i4 && i < i3) {
            this.mHeartRateImage.setImageDrawable(getResources().getDrawable(R.drawable.heartrate4));
            this.mHeartRate.setTextColor(YELLOW);
            heartRateTypeText(this.mContext.getString(R.string.IDS_motiontrack_detail_fm_heart_yynl), this.mContext.getString(R.string.IDS_rate_zone_hrr_lacticAcid_threshold), this.mContext.getString(R.string.IDS_rate_zone_hrr_aerobicAdvance_threshold));
            return;
        }
        int i5 = this.mHeartRateReduceFat;
        if (i >= i5 && i < i4) {
            this.mHeartRateImage.setImageDrawable(getResources().getDrawable(R.drawable.heartrate3));
            this.mHeartRate.setTextColor(GREEN);
            heartRateTypeText(this.mContext.getString(R.string.IDS_motiontrack_detail_fm_heart_burn), this.mContext.getString(R.string.IDS_rate_zone_hrr_aerobicAdvance_threshold), this.mContext.getString(R.string.IDS_rate_zone_hrr_aerobicBase_threshold));
        } else if (i >= this.mHeartRateWarmUp && i < i5) {
            this.mHeartRateImage.setImageDrawable(getResources().getDrawable(R.drawable.heartrate2));
            this.mHeartRate.setTextColor(BLUE);
            heartRateTypeText(this.mContext.getString(R.string.IDS_motiontrack_detail_fm_heart_hot), this.mContext.getString(R.string.IDS_rate_zone_hrr_aerobicBase_threshold), this.mContext.getString(R.string.IDS_lactate_subHeader_top8));
        } else {
            this.mHeartRateImage.setImageDrawable(getResources().getDrawable(R.drawable.heartrate1));
            this.mHeartRateType.setText("");
            this.mHeartRate.setTextColor(-1);
        }
    }

    private void heartRateTypeText(String str, String str2, String str3) {
        int i = this.mClassifyMethod;
        if (i == 0) {
            this.mHeartRateType.setText(str);
            return;
        }
        if (i == 1) {
            this.mHeartRateType.setText(str2);
        } else if (i == 3) {
            this.mHeartRateType.setText(str3);
        } else {
            LogUtil.e(TAG, "error mClassifyMethod= ", Integer.valueOf(i));
        }
    }

    protected boolean isTargetType() {
        IndoorEquipViewModel indoorEquipViewModel = this.mViewModel;
        return indoorEquipViewModel != null && indoorEquipViewModel.b();
    }

    protected void changeLogoSize() {
        ViewGroup.LayoutParams layoutParams = this.mLogoImage.getLayoutParams();
        layoutParams.width = (int) (this.mScale * dp2px(LOGO_IMAGE_SIZE));
        layoutParams.height = (int) (this.mScale * dp2px(LOGO_IMAGE_SIZE));
        this.mLogoImage.setLayoutParams(layoutParams);
    }

    protected void updateHeartRate(int i) {
        if (i <= 0 || i > 220) {
            LogUtil.a(TAG, "heartrate <= 0 or heartrate > 220, heartrate = ", Integer.valueOf(i));
            this.mHeartRate.setText(getResources().getString(R.string.ie_motiontrack_detail_heartrate_default));
            this.mHeartRateUnit.setText(nzc.a(0, this.mContext));
        } else {
            this.mHeartRate.setText(nzc.b(i, 1, 0));
            this.mHeartRateUnit.setText(nzc.a(i, this.mContext));
        }
        setHeartRateImage(i);
    }

    protected void changeRunwaySize() {
        if (this.mRunway.getLayoutParams() instanceof RelativeLayout.LayoutParams) {
            RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.mRunway.getLayoutParams();
            layoutParams.height = (int) (this.mScale * dp2px(RUNWAY_HEIGHT));
            this.mRunway.setLayoutParams(layoutParams);
        }
        if (this.mRunwayBackground.getLayoutParams() instanceof RelativeLayout.LayoutParams) {
            RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) this.mRunwayBackground.getLayoutParams();
            layoutParams2.height = (int) (this.mScale * dp2px(RUNWAY_HEIGHT));
            this.mRunwayBackground.setLayoutParams(layoutParams2);
        }
    }
}
