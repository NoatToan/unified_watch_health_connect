package com.huawei.health.ecologydevice.ui.measure.fragment;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.text.format.DateUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.LinearLayout;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.Fragment;
import com.huawei.ecologydevice.R;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.health.device.model.DeviceInformation;
import com.huawei.health.ecologydevice.callback.PickerChooseCallback;
import com.huawei.health.ecologydevice.manager.EcologyDevicePickerManager;
import com.huawei.health.ecologydevice.ui.measure.fragment.ropefragment.DeviceInfoFragment;
import com.huawei.health.ecologydevice.ui.measure.fragment.sportfragment.RateControlDescriptionFragment;
import com.huawei.health.ecologydevice.ui.measure.fragment.sportfragment.RateControlFragment;
import com.huawei.health.ecologydevice.ui.measure.presenter.SportIntroductionContentPresenter;
import com.huawei.health.ecologydevice.ui.measure.view.SportIntroductionContentView;
import com.huawei.health.sport.model.WorkoutRecord;
import com.huawei.health.suggestion.PluginSuggestion;
import com.huawei.healthcloud.plugintrack.ui.activity.TrackDetailActivity;
import com.huawei.hihealth.data.model.HiTrackMetaData;
import com.huawei.hihealthservice.old.model.OldToNewMotionPath;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwcommonmodel.constants.AnalyticsValue;
import com.huawei.hwfoundationmodel.trackmodel.MotionPathSimplify;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.profile.coordinator.ProfileRequestConstants;
import com.huawei.ui.commonui.adapter.BaseRecyclerAdapter;
import com.huawei.ui.commonui.adapter.RecyclerHolder;
import com.huawei.ui.commonui.base.BaseDialog;
import com.huawei.ui.commonui.dialog.CustomAlertDialog;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.commonui.imageview.HealthImageView;
import com.huawei.ui.commonui.progressbar.HealthProgressBar;
import com.huawei.ui.commonui.recycleview.HealthRecycleView;
import defpackage.ehp;
import defpackage.eps;
import defpackage.epw;
import defpackage.era;
import defpackage.erj;
import defpackage.esi;
import defpackage.esk;
import defpackage.etn;
import defpackage.iov;
import defpackage.lmf;
import defpackage.njy;
import defpackage.nkw;
import defpackage.nty;
import defpackage.pcd;
import defpackage.pea;
import defpackage.qqf;
import defpackage.qqz;
import defpackage.qrs;
import health.compact.a.LanguageUtil;
import health.compact.a.Services;
import health.compact.a.UnitUtil;
import health.compact.a.Utils;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.io.File;
import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/* JADX INFO: loaded from: classes7.dex */
public class SportIntroductionContentFragment extends SportDeviceIntroductionFragment implements SportIntroductionContentView, BaseRecyclerAdapter.OnItemClickListener<eps> {
    private static final String FORMAT_HOUR_MIN = "HH:mm";
    public static final int FULL_MARATHON_CODE = -3;
    public static final int HALF_MARATHON_CODE = -2;
    private static final float KILOMETERS_TO_METER = 1000.0f;
    private static final double MAX_BIKE_DISTANCE = 200.0d;
    private static final double MAX_DISTANCE = 100.0d;
    private static final int MAX_HEAT = 5000;
    private static final int MAX_TIME_MINUTES = 1080;
    private static final float MINUTE_TO_SECOND = 60.0f;
    private static final double MIN_DISTANCE = 0.1d;
    private static final int MIN_HEAT = 100;
    private static final int MIN_TIME_MINUTES = 10;
    private static final int RECONNECT_SHOW_DIALOG_COUNT = 3;
    private static final String RELEASE_TAG = "R_DEVMGR_SportContentFragment";
    private static final String ROPE_DEVICE_INFO = "rope_device_info";
    private static final String SPORT_TARGET_CAL = "sport_target_cal";
    private static final String SPORT_TARGET_DISTANCE = "sport_target_distance";
    private static final String SPORT_TARGET_TIME = "sport_target_time";
    private static final String TAG = "SportContentFragment";
    private static final float TRANS_ALPHA = 0.6f;
    private HealthTextView mAverageData;
    private HealthTextView mAverageDataUnit;
    private HealthTextView mBleConnectStateText;
    private LinearLayout mCalModeLayout;
    private int mCalSelectIndex;
    private View mControlByHeartRateLayout;
    private float mCurrentModeValue;
    private HealthTextView mDataUnit;
    private int mDefaultCal;
    private double mDefaultDistance;
    private CustomAlertDialog mDialogConnectFail;
    private HealthImageView mDistanceImage;
    private LinearLayout mDistanceModeLayout;
    private int mDistanceSelectIndex;
    private HealthTextView mDistanceText;
    private HealthImageView mFreeImage;
    private LinearLayout mFreeModeLayout;
    private HealthTextView mFreeText;
    private HealthImageView mHeatImage;
    private HealthTextView mHeatText;
    private View mHistoryView;
    private HealthTextView mKindName;
    private HealthTextView mLastCount;
    private HealthTextView mLastDay;
    private HealthTextView mLastMonth;
    private HealthTextView mLastTime;
    private esi mMenuItemAreaWidget;
    private LinearLayout mModeSelectLayout;
    private HealthTextView mMonthTotalDesc;
    private SportIntroductionContentPresenter mPresenter;
    private HealthTextView mReConnectTv;
    private HealthProgressBar mReconnectLoadingPb;
    private HealthTextView mSingleSkippingTime;
    private String mSmartProductId;
    private HealthImageView mSportTypeImage;
    private HealthImageView mStartImageView;
    private EcologyDevicePickerManager mTargetDistanceDialog;
    private EcologyDevicePickerManager mTargetHeatDialog;
    private EcologyDevicePickerManager mTargetTimeDialog;
    private HealthImageView mTimeImage;
    private LinearLayout mTimeModeLayout;
    private int mTimeSelectIndex;
    private HealthTextView mTimeText;
    private static final int[] HEAT_TARGET_LIST = {100, 200, 300, 500, 600, 800};
    private static final int[] DISTANCE_TARGET_LIST = {1, 3, 5, 10, -2, -3};
    private static final int[] DISTANCE_TARGET_BIKE_LIST = {1, 3, 5, 20, 30, 40, 120, 180};
    private static final int[] TIME_TARGET_LIST = {10, 20, 30, 60, 120, 180};
    private static final int[] TIME_TARGET_BIKE_LIST = {10, 20, 30, 60, 90, 120, 150, 180};
    private int mType = OldToNewMotionPath.SPORT_TYPE_INDOOR_BIKE;
    private int mCurrentTargetModel = 6;
    private int mDefaultTime = 10;
    private int mConnectCount = 0;

    @Override // com.huawei.health.ecologydevice.ui.measure.view.SportIntroductionContentView
    public void onMonthDataFail(int i) {
    }

    @Override // com.huawei.health.ecologydevice.ui.measure.view.SportIntroductionContentView
    public void queryTrackDetailDataFail() {
    }

    @Override // com.huawei.health.ecologydevice.ui.measure.fragment.SportDeviceIntroductionFragment, com.huawei.health.ecologydevice.ui.BaseFragment
    public boolean onBackPressed() {
        LogUtil.a(TAG, "onBackPressed");
        this.mIndoorEquipManagerApi.releaseResource();
        super.onBackPressed();
        return false;
    }

    @Override // com.huawei.health.ecologydevice.ui.measure.fragment.SportDeviceIntroductionFragment, com.huawei.health.ecologydevice.ui.BaseFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        LogUtil.a(TAG, "onCreate");
        this.mNeedOpenBlueTooth = true;
        int i = this.mSportDataManager.i();
        this.mType = i;
        epw epwVar = new epw(i, this.mUniqueId);
        this.mPresenter = epwVar;
        epwVar.onCreate(this);
        LogUtil.d(TAG, "mType:", Integer.valueOf(this.mType));
        ThreadPoolManager.c().execute(new Runnable() { // from class: com.huawei.health.ecologydevice.ui.measure.fragment.SportIntroductionContentFragment$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.m1048x9b3365d8();
            }
        });
    }

    /* JADX INFO: renamed from: lambda$onCreate$0$com-huawei-health-ecologydevice-ui-measure-fragment-SportIntroductionContentFragment, reason: not valid java name */
    /* synthetic */ void m1048x9b3365d8() {
        this.mSmartProductId = era.b(this.mProductId);
    }

    @Override // com.huawei.health.ecologydevice.ui.measure.fragment.SportDeviceIntroductionFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        view.findViewById(R.id.layout_device_data).setVisibility(8);
        this.mDeviceManualsLayout.setVisibility(8);
        initMenuItem((ViewStub) view.findViewById(R.id.viewstub_item_layout));
        initModel((ViewStub) view.findViewById(R.id.viewstub_model_layout));
        super.onViewCreated(view, bundle);
    }

    @Override // com.huawei.health.ecologydevice.ui.measure.fragment.SportDeviceIntroductionFragment
    protected void initView(View view) {
        super.initView(view);
        this.mStartTv.setVisibility(8);
        HealthTextView healthTextView = (HealthTextView) view.findViewById(R.id.sport_tv_reconnect);
        this.mReConnectTv = healthTextView;
        healthTextView.setOnClickListener(this);
        this.mBleConnectStateText = (HealthTextView) view.findViewById(R.id.sport_connect_state_text);
        this.mReconnectLoadingPb = (HealthProgressBar) view.findViewById(R.id.device_reconnect_pb);
        HealthImageView healthImageView = (HealthImageView) view.findViewById(R.id.sport_start_iv);
        this.mStartImageView = healthImageView;
        healthImageView.setOnClickListener(this);
    }

    @Override // com.huawei.health.ecologydevice.ui.measure.fragment.SportDeviceIntroductionFragment
    protected void initUxConfig(ehp ehpVar) {
        ehp.e eVarA;
        boolean zG;
        ehp.d dVarB;
        super.initUxConfig(ehpVar);
        LogUtil.a(TAG, "entry initUxConfig");
        if (ehpVar != null) {
            controlModeLayoutByUxConfig(ehpVar.e());
            eVarA = ehpVar.a();
            dVarB = ehpVar.b();
            zG = ehpVar.g();
        } else {
            eVarA = null;
            zG = true;
            dVarB = null;
        }
        this.mMenuItemAreaWidget.d(initMenu(eVarA));
        initControlByHeartRate(((ViewStub) this.child.findViewById(R.id.viewstub_control_by_heart_rate)).inflate(), ehpVar);
        initMoreMenuData(dVarB);
        if (zG) {
            initHistoryLayout();
        }
    }

    private void initMoreMenuData(ehp.d dVar) {
        boolean zEquals;
        boolean z;
        boolean z2 = true;
        if (dVar != null) {
            boolean zA = dVar.a();
            zEquals = dVar.b() != null;
            z = zEquals && dVar.b().d();
            z2 = zA;
        } else {
            zEquals = "yes".equals(era.a("ota", this.mProductId));
            z = true;
        }
        if (z2) {
            this.mMoreMenuList.add(getResources().getString(R.string.IDS_device_rope_device_info));
        }
        if (zEquals) {
            this.mMoreMenuList.add(getResources().getString(R.string.IDS_device_wear_home_device_ota_upgrade));
        }
        if (z) {
            setOtaRedPoint();
        }
        if (njy.e(this.mMoreMenuList)) {
            this.mCustomTitleBar.setRightButtonVisibility(8);
            LogUtil.j(TAG, "mMoreMenuList is empty");
        }
    }

    private void controlModeLayoutByUxConfig(ehp.c cVar) {
        boolean zH;
        boolean zB;
        boolean zA;
        boolean z;
        LogUtil.a(TAG, "controlModeLayoutByUxConfig mType is", Integer.valueOf(this.mType));
        int i = this.mType;
        if (i == 265 || i == 264) {
            boolean zD = cVar.d();
            zH = cVar.h();
            zB = cVar.b();
            zA = cVar.a();
            z = zD;
        } else {
            LogUtil.a(TAG, "controlModeLayoutByUxConfig is other type");
            z = true;
            zA = true;
            zH = true;
            zB = true;
        }
        this.mModeSelectLayout.removeAllViews();
        if (z) {
            this.mModeSelectLayout.addView(this.mFreeModeLayout);
            this.mFreeModeLayout.setVisibility(0);
        }
        if (zH) {
            this.mModeSelectLayout.addView(this.mTimeModeLayout);
            this.mTimeModeLayout.setVisibility(0);
        }
        if (zB) {
            this.mModeSelectLayout.addView(this.mDistanceModeLayout);
            this.mDistanceModeLayout.setVisibility(0);
        }
        if (zA) {
            this.mModeSelectLayout.addView(this.mCalModeLayout);
            this.mCalModeLayout.setVisibility(0);
        }
        if (this.mModeSelectLayout.getChildCount() < 2) {
            this.child.findViewById(R.id.mode_choose_layout).setVisibility(8);
            this.mModeValueTv.setVisibility(8);
        }
    }

    @Override // com.huawei.health.ecologydevice.ui.measure.fragment.SportDeviceIntroductionFragment, com.huawei.health.ecologydevice.ui.measure.fragment.ProductFragment, com.huawei.health.ecologydevice.ui.BaseFragment, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        LogUtil.a(TAG, BaseDialog.LIFE_CYCLE_ON_RESUME);
        if (this.mHistoryView != null) {
            this.mPresenter.getLastSportRecord(this.mType);
        }
    }

    private void initModel(ViewStub viewStub) {
        this.mModeLayout.setVisibility(0);
        View viewInflate = viewStub.inflate();
        this.mFreeImage = (HealthImageView) viewInflate.findViewById(R.id.free_jump_iv);
        this.mFreeText = (HealthTextView) viewInflate.findViewById(R.id.free_jump_tv);
        this.mModeSelectLayout = (LinearLayout) viewInflate.findViewById(R.id.sport_mode_select_ll);
        LinearLayout linearLayout = (LinearLayout) viewInflate.findViewById(R.id.free_jump_layout);
        this.mFreeModeLayout = linearLayout;
        linearLayout.setOnClickListener(new View.OnClickListener() { // from class: com.huawei.health.ecologydevice.ui.measure.fragment.SportIntroductionContentFragment$$ExternalSyntheticLambda8
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f$0.m1044x4b6d0893(view);
            }
        });
        this.mFreeText.setText(this.mType == 265 ? R.string.IDS_target_free_ride : R.string.IDS_target_free_run);
        this.mTimeImage = (HealthImageView) viewInflate.findViewById(R.id.time_jump_iv);
        this.mTimeText = (HealthTextView) viewInflate.findViewById(R.id.time_jump_tv);
        LinearLayout linearLayout2 = (LinearLayout) viewInflate.findViewById(R.id.time_jump_layout);
        this.mTimeModeLayout = linearLayout2;
        linearLayout2.setOnClickListener(new View.OnClickListener() { // from class: com.huawei.health.ecologydevice.ui.measure.fragment.SportIntroductionContentFragment$$ExternalSyntheticLambda9
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f$0.m1045x910e4b32(view);
            }
        });
        this.mTimeText.setText(this.mType == 265 ? R.string.IDS_target_time_ride : R.string.IDS_target_time_run);
        this.mDistanceImage = (HealthImageView) viewInflate.findViewById(R.id.number_jump_iv);
        this.mDistanceText = (HealthTextView) viewInflate.findViewById(R.id.number_jump_tv);
        LinearLayout linearLayout3 = (LinearLayout) viewInflate.findViewById(R.id.number_jump_layout);
        this.mDistanceModeLayout = linearLayout3;
        linearLayout3.setOnClickListener(new View.OnClickListener() { // from class: com.huawei.health.ecologydevice.ui.measure.fragment.SportIntroductionContentFragment$$ExternalSyntheticLambda10
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f$0.m1046xd6af8dd1(view);
            }
        });
        this.mDistanceText.setText(this.mType == 265 ? R.string.IDS_target_distance_ride : R.string.IDS_target_distance_run);
        this.mHeatImage = (HealthImageView) viewInflate.findViewById(R.id.heat_jump_iv);
        this.mHeatText = (HealthTextView) viewInflate.findViewById(R.id.heat_jump_tv);
        LinearLayout linearLayout4 = (LinearLayout) viewInflate.findViewById(R.id.heat_jump_layout);
        this.mCalModeLayout = linearLayout4;
        linearLayout4.setVisibility(0);
        this.mCalModeLayout.setOnClickListener(new View.OnClickListener() { // from class: com.huawei.health.ecologydevice.ui.measure.fragment.SportIntroductionContentFragment$$ExternalSyntheticLambda11
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f$0.m1047x1c50d070(view);
            }
        });
        this.mHeatText.setText(this.mType == 265 ? R.string.IDS_target_heat_ride : R.string.IDS_target_heat_run);
        refreshRopeModeLayoutUi(6, "");
    }

    /* JADX INFO: renamed from: lambda$initModel$1$com-huawei-health-ecologydevice-ui-measure-fragment-SportIntroductionContentFragment, reason: not valid java name */
    /* synthetic */ void m1044x4b6d0893(View view) {
        LogUtil.d(TAG, "自由跑模式");
        refreshRopeModeLayoutUi(6, "");
        this.mPresenter.setModeSelectBiEvent(this.mProductId, 0, "0", this.mType);
    }

    /* JADX INFO: renamed from: lambda$initModel$2$com-huawei-health-ecologydevice-ui-measure-fragment-SportIntroductionContentFragment, reason: not valid java name */
    /* synthetic */ void m1045x910e4b32(View view) {
        timeModelClick();
    }

    /* JADX INFO: renamed from: lambda$initModel$3$com-huawei-health-ecologydevice-ui-measure-fragment-SportIntroductionContentFragment, reason: not valid java name */
    /* synthetic */ void m1046xd6af8dd1(View view) {
        distanceModelClick();
    }

    /* JADX INFO: renamed from: lambda$initModel$4$com-huawei-health-ecologydevice-ui-measure-fragment-SportIntroductionContentFragment, reason: not valid java name */
    /* synthetic */ void m1047x1c50d070(View view) {
        heatModelClick();
    }

    @Override // com.huawei.health.ecologydevice.ui.measure.fragment.ProductFragment, androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        LogUtil.a(TAG, "onStart");
    }

    @Override // androidx.fragment.app.Fragment
    public void onDetach() {
        this.mPresenter.onDetach();
        super.onDetach();
    }

    @Override // com.huawei.health.ecologydevice.ui.BaseFragment, androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        LogUtil.a(TAG, "onDestroy");
        esk.b().c();
    }

    private void refreshRopeModeLayoutUi(int i, String str) {
        this.mCurrentTargetModel = i;
        LogUtil.a(TAG, "refreshRopeModeLayoutUi currentTargetModle is ", Integer.valueOf(i));
        if (this.mCurrentTargetModel == 6) {
            this.mModeTv.setVisibility(8);
            this.mModeValueTv.setText(getString(this.mType == 265 ? R.string.IDS_target_free_ride : R.string.IDS_target_free_run));
            this.mFreeImage.setImageResource(this.mType == 265 ? R.drawable.ic_sport_mode_free_ride_checked : R.drawable.ic_sport_mode_free_run_checked);
        } else {
            this.mModeTv.setVisibility(0);
            this.mModeValueTv.setText(str);
            this.mFreeImage.setImageDrawable(getTintDrawable(this.mType == 265 ? R.drawable.ic_sport_mode_free_ride : R.drawable.ic_sport_mode_free_run, R.color.rope_icon_tint));
        }
        if (this.mCurrentTargetModel == 0) {
            this.mModeTv.setText(getString(this.mType == 265 ? R.string.IDS_target_time_ride : R.string.IDS_target_time_run));
            this.mTimeImage.setImageResource(R.drawable.ic_sport_mode_time_checked);
        } else {
            this.mTimeImage.setImageDrawable(getTintDrawable(R.drawable.ic_sport_mode_time, R.color.rope_icon_tint));
        }
        if (this.mCurrentTargetModel == 1) {
            this.mModeTv.setText(getString(this.mType == 265 ? R.string.IDS_target_distance_ride : R.string.IDS_target_distance_run));
            this.mDistanceImage.setImageResource(R.drawable.ic_sport_mode_distance_checked);
        } else {
            this.mDistanceImage.setImageDrawable(getTintDrawable(R.drawable.ic_sport_mode_distance, R.color.rope_icon_tint));
        }
        if (this.mCurrentTargetModel == 2) {
            this.mModeTv.setText(getString(this.mType == 265 ? R.string.IDS_target_heat_ride : R.string.IDS_target_heat_run));
            this.mHeatImage.setImageResource(R.drawable.ic_sport_mode_heat_checked);
        } else {
            this.mHeatImage.setImageDrawable(getTintDrawable(R.drawable.ic_sport_mode_heat, R.color.rope_icon_tint));
        }
    }

    private Drawable getTintDrawable(int i, int i2) {
        Drawable drawableC = qqf.c(ContextCompat.getDrawable(this.mainActivity, i), ContextCompat.getColor(this.mainActivity, i2));
        return LanguageUtil.ba(this.mainActivity) ? qqz.e(this.mainActivity, drawableC) : drawableC;
    }

    @Override // com.huawei.health.ecologydevice.ui.measure.fragment.SportDeviceIntroductionFragment
    protected Intent createEquipConnectIntent(Bundle bundle) {
        LogUtil.a(TAG, "createEquipConnectIntent.");
        Intent intentCreateEquipConnectIntent = super.createEquipConnectIntent(bundle);
        intentCreateEquipConnectIntent.putExtra(WorkoutRecord.Extend.COURSE_TARGET_TYPE, this.mCurrentTargetModel);
        intentCreateEquipConnectIntent.putExtra(WorkoutRecord.Extend.COURSE_TARGET_VALUE, this.mCurrentModeValue);
        DeviceInformation deviceInformation = this.mPresenter.getDeviceInformation();
        intentCreateEquipConnectIntent.putExtra("sn", deviceInformation.getSerialNumber());
        intentCreateEquipConnectIntent.putExtra(ProfileRequestConstants.MANU, deviceInformation.getManufacturerString());
        intentCreateEquipConnectIntent.putExtra("model", deviceInformation.getModelString());
        intentCreateEquipConnectIntent.putExtras(bundle);
        return intentCreateEquipConnectIntent;
    }

    private void initMenuItem(ViewStub viewStub) {
        esi esiVar = new esi((HealthRecycleView) viewStub.inflate().findViewById(R.id.rv_second_menu_item));
        this.mMenuItemAreaWidget = esiVar;
        esiVar.d(this);
    }

    private void heatModelClick() {
        if (this.mTargetHeatDialog == null) {
            this.mDefaultCal = this.mPresenter.getTargetCacheValue(SPORT_TARGET_CAL).intValue();
            int i = 0;
            this.mCalSelectIndex = 0;
            while (true) {
                int[] iArr = HEAT_TARGET_LIST;
                if (i >= iArr.length) {
                    break;
                }
                if (this.mDefaultCal == iArr[i]) {
                    this.mCalSelectIndex = i + 1;
                    break;
                }
                i++;
            }
            this.mTargetHeatDialog = new EcologyDevicePickerManager.Builder(this.mainActivity).e(5000.0d).a(100.0d).b(this.mDefaultCal).a(this.mainActivity.getString(this.mType == 265 ? R.string.IDS_target_heat_ride : R.string.IDS_target_heat_run)).c(R.string.IDS_hwh_motiontrack_set_target).e(new PickerChooseCallback() { // from class: com.huawei.health.ecologydevice.ui.measure.fragment.SportIntroductionContentFragment$$ExternalSyntheticLambda12
                @Override // com.huawei.health.ecologydevice.callback.PickerChooseCallback
                public final void onValueSelected(Object obj, int i2) {
                    this.f$0.m1040xb765ffff((Integer) obj, i2);
                }
            }).e();
        }
        this.mTargetHeatDialog.e(HEAT_TARGET_LIST, 2, R.plurals.IDS_hw_cal_unit, this.mCalSelectIndex);
    }

    /* JADX INFO: renamed from: lambda$heatModelClick$5$com-huawei-health-ecologydevice-ui-measure-fragment-SportIntroductionContentFragment, reason: not valid java name */
    /* synthetic */ void m1040xb765ffff(Integer num, int i) {
        LogUtil.d(TAG, "热量跑模式", num, ",", Integer.valueOf(i));
        this.mPresenter.saveTargetData(String.valueOf(num), SPORT_TARGET_CAL);
        refreshRopeModeLayoutUi(2, getResources().getQuantityString(R.plurals.IDS_hw_cal_unit, num.intValue(), String.valueOf(num)));
        this.mCurrentModeValue = num.intValue();
        this.mDefaultCal = num.intValue();
        this.mPresenter.setModeSelectBiEvent(this.mProductId, 3, String.valueOf(num), this.mType);
    }

    private void distanceModelClick() {
        if (this.mTargetDistanceDialog == null) {
            setDefaultDistanceValue();
            this.mTargetDistanceDialog = new EcologyDevicePickerManager.Builder(this.mainActivity).e(this.mType == 265 ? 200.0d : 100.0d).a(0.1d).b(this.mDefaultDistance).a(this.mainActivity.getString(this.mType == 265 ? R.string.IDS_target_distance_ride : R.string.IDS_target_distance_run)).c(R.string.IDS_hwh_motiontrack_set_target).e(new PickerChooseCallback() { // from class: com.huawei.health.ecologydevice.ui.measure.fragment.SportIntroductionContentFragment$$ExternalSyntheticLambda5
                @Override // com.huawei.health.ecologydevice.callback.PickerChooseCallback
                public final void onValueSelected(Object obj, int i) {
                    this.f$0.m1039x5d7797b9((Double) obj, i);
                }
            }).e();
        }
        this.mTargetDistanceDialog.e(this.mType == 265 ? DISTANCE_TARGET_BIKE_LIST : DISTANCE_TARGET_LIST, 1, R.plurals.IDS_indoor_run_km, this.mDistanceSelectIndex);
    }

    /* JADX INFO: renamed from: lambda$distanceModelClick$6$com-huawei-health-ecologydevice-ui-measure-fragment-SportIntroductionContentFragment, reason: not valid java name */
    /* synthetic */ void m1039x5d7797b9(Double d, int i) {
        String string;
        LogUtil.d(TAG, "距离跑模式", d, ",", Integer.valueOf(i));
        if (d.doubleValue() == -2.0d || d.doubleValue() == 21.0975d) {
            this.mCurrentModeValue = new BigDecimal(21.0975d).floatValue();
            string = getString(R.string.IDS_start_track_show_distance_half_marathon);
        } else if (d.doubleValue() == -3.0d || d.doubleValue() == 42.195d) {
            this.mCurrentModeValue = new BigDecimal(42.195d).floatValue();
            string = getString(R.string.IDS_start_track_show_distance_marathon);
        } else {
            this.mCurrentModeValue = d.floatValue();
            string = getResources().getQuantityString(R.plurals.IDS_indoor_run_km, d.intValue(), String.valueOf(d));
        }
        this.mDefaultDistance = d.doubleValue();
        this.mPresenter.setModeSelectBiEvent(this.mProductId, 2, String.valueOf(this.mCurrentModeValue), this.mType);
        this.mCurrentModeValue *= 1000.0f;
        this.mPresenter.saveTargetData(String.valueOf(this.mDefaultDistance), SPORT_TARGET_DISTANCE);
        refreshRopeModeLayoutUi(1, string);
    }

    private void setDefaultDistanceValue() {
        this.mDefaultDistance = this.mPresenter.getTargetCacheValue(SPORT_TARGET_DISTANCE).doubleValue();
        this.mDistanceSelectIndex = 0;
        int[] iArr = this.mType == 265 ? DISTANCE_TARGET_BIKE_LIST : DISTANCE_TARGET_LIST;
        for (int i = 0; i < iArr.length; i++) {
            if (this.mDefaultDistance == iArr[i]) {
                this.mDistanceSelectIndex = i + 1;
                break;
            }
        }
        double d = this.mDefaultDistance;
        if (d == -2.0d) {
            this.mDefaultDistance = 21.0975d;
        } else if (d == -3.0d) {
            this.mDefaultDistance = 42.195d;
        } else {
            LogUtil.d(TAG, "setDefaultDistanceValue else");
        }
    }

    private void timeModelClick() {
        if (this.mTargetTimeDialog == null) {
            this.mDefaultTime = this.mPresenter.getTargetCacheValue(SPORT_TARGET_TIME).intValue();
            this.mTimeSelectIndex = 0;
            int[] iArr = this.mType == 265 ? TIME_TARGET_BIKE_LIST : TIME_TARGET_LIST;
            for (int i = 0; i < iArr.length; i++) {
                if (this.mDefaultTime == iArr[i]) {
                    this.mTimeSelectIndex = i + 1;
                    break;
                }
            }
            this.mTargetTimeDialog = new EcologyDevicePickerManager.Builder(this.mainActivity).a(this.mainActivity.getString(this.mType == 265 ? R.string.IDS_target_time_ride : R.string.IDS_target_time_run)).c(R.string.IDS_hwh_motiontrack_set_target).e(1080.0d).a(10.0d).b(this.mDefaultTime).e(new PickerChooseCallback() { // from class: com.huawei.health.ecologydevice.ui.measure.fragment.SportIntroductionContentFragment$$ExternalSyntheticLambda0
                @Override // com.huawei.health.ecologydevice.callback.PickerChooseCallback
                public final void onValueSelected(Object obj, int i2) {
                    this.f$0.m1051x16583800((Integer) obj, i2);
                }
            }).e();
        }
        this.mTargetTimeDialog.e(this.mType == 265 ? TIME_TARGET_BIKE_LIST : TIME_TARGET_LIST, 5, R.plurals.IDS_min_unit, this.mTimeSelectIndex);
    }

    /* JADX INFO: renamed from: lambda$timeModelClick$7$com-huawei-health-ecologydevice-ui-measure-fragment-SportIntroductionContentFragment, reason: not valid java name */
    /* synthetic */ void m1051x16583800(Integer num, int i) {
        LogUtil.j(TAG, "timeJumpClick value", num, ",", Integer.valueOf(i));
        this.mPresenter.saveTargetData(String.valueOf(num), SPORT_TARGET_TIME);
        refreshRopeModeLayoutUi(0, UnitUtil.e(num.intValue() * 60));
        this.mCurrentModeValue = num.intValue() * 60.0f;
        this.mDefaultTime = num.intValue();
        this.mPresenter.setModeSelectBiEvent(this.mProductId, 1, String.valueOf(num), this.mType);
    }

    private eps convertItemData(int i, int i2, int i3) {
        eps epsVar = new eps();
        epsVar.b(getResources().getString(i));
        epsVar.b(i2);
        epsVar.e(i3);
        epsVar.d(true);
        return epsVar;
    }

    private List<eps> initMenu(ehp.e eVar) {
        boolean zF;
        if (eVar != null) {
            zF = eVar.f();
            eVar.b();
        } else {
            zF = true;
        }
        ArrayList arrayList = new ArrayList();
        if (LanguageUtil.l(BaseApplication.getContext()) && zF) {
            arrayList.add(convertItemData(R.string.IDS_hwh_motiontrack_warm_up_activation, R.drawable.hw_health_device_warm_up_activation, 0));
            arrayList.add(convertItemData(R.string.IDS_hwh_motiontrack_stretch_relax, R.drawable.hw_health_device_stretch_relax, 3));
        }
        return arrayList;
    }

    private void initControlByHeartRate(View view, ehp ehpVar) {
        boolean zEquals;
        if (ehpVar != null) {
            zEquals = ehpVar.c();
        } else {
            zEquals = "true".equals(this.mProductInfo.c("isSupportControl"));
        }
        if (zEquals) {
            this.mControlByHeartRateLayout = view.findViewById(R.id.second_rope_item_layout);
            HealthTextView healthTextView = (HealthTextView) view.findViewById(R.id.second_rope_item_title);
            HealthTextView healthTextView2 = (HealthTextView) view.findViewById(R.id.second_rope_item_description);
            HealthImageView healthImageView = (HealthImageView) view.findViewById(R.id.second_rope_item_img);
            healthTextView.setText(getResources().getString(this.mType == 265 ? R.string.IDS_rate_control_ride : R.string.IDS_rate_control_running));
            healthTextView2.setText(getResources().getString(R.string.IDS_rate_control_tip));
            healthTextView2.setVisibility(0);
            healthImageView.setBackgroundResource(R.drawable.common_ui_arrow_right);
            view.setOnClickListener(new View.OnClickListener() { // from class: com.huawei.health.ecologydevice.ui.measure.fragment.SportIntroductionContentFragment$$ExternalSyntheticLambda4
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    this.f$0.m1041xf4051229(view2);
                }
            });
            return;
        }
        view.setVisibility(8);
    }

    /* JADX INFO: renamed from: lambda$initControlByHeartRate$8$com-huawei-health-ecologydevice-ui-measure-fragment-SportIntroductionContentFragment, reason: not valid java name */
    /* synthetic */ void m1041xf4051229(View view) {
        jumpToRateControl();
        this.mPresenter.setSubPageBiEvent(this.mProductId, this.mUniqueId, "hrmode", this.mType);
    }

    @Override // com.huawei.health.ecologydevice.ui.measure.fragment.SportDeviceIntroductionFragment
    protected void handleMoreMenuClick(int i) {
        super.handleMoreMenuClick(i);
        String str = this.mMoreMenuList.get(i);
        if (TextUtils.equals(str, getResources().getString(R.string.IDS_device_rope_device_info))) {
            goToDeviceInfoFragment();
        } else {
            if (TextUtils.equals(str, getResources().getString(R.string.IDS_device_wear_home_device_ota_upgrade))) {
                etn.c(this.mainActivity, this.mProductInfo, this.mProductId, this.mUniqueId);
                LogUtil.a(TAG, "handleMoreMenuClick disconnect device");
                this.mPresenter.disconnect(false);
                return;
            }
            LogUtil.j(TAG, "handleMoreMenuClick item is other");
        }
    }

    private void setOtaRedPoint() {
        if (njy.e(this.mMoreMenuList)) {
            LogUtil.e(TAG, "setOtaRedPoint mMoreMenuList is empty");
        } else if (hasNewOtaVersion()) {
            if (!this.mMoreMenuList.contains(File.separator)) {
                this.mMoreMenuList.add(File.separator);
            }
            this.mMoreMenuList.add(getResources().getString(R.string.IDS_device_wear_home_device_ota_upgrade));
        }
    }

    private boolean hasNewOtaVersion() {
        DeviceInformation deviceInformation = this.mPresenter.getDeviceInformation();
        if (this.mProductInfo != null && deviceInformation != null) {
            int otaVersion = getOtaVersion(deviceInformation.getSoftwareVersion());
            String strC = this.mProductInfo.c("otaVersion");
            if (TextUtils.isEmpty(strC)) {
                return false;
            }
            ReleaseLogUtil.d(RELEASE_TAG, "softwareVersion = ", Integer.valueOf(otaVersion), " productInfoOtaVersion = ", strC);
            if (otaVersion < getOtaVersion(strC)) {
                return true;
            }
        }
        return false;
    }

    private int getOtaVersion(String str) {
        return qrs.a(str.toLowerCase(Locale.ENGLISH).replace("v", "").replace(".", ""));
    }

    private void goToDeviceInfoFragment() {
        DeviceInformation deviceInformation = this.mPresenter.getDeviceInformation();
        com.huawei.health.ecologydevice.fitness.datastruct.DeviceInformation deviceInformation2 = new com.huawei.health.ecologydevice.fitness.datastruct.DeviceInformation();
        deviceInformation2.setManufacturerString(deviceInformation.getManufacturerString());
        deviceInformation2.setSerialNumber(deviceInformation.getSerialNumber());
        deviceInformation2.setSoftwareVersion(deviceInformation.getSoftwareVersion());
        deviceInformation2.setModelString(deviceInformation.getModelString());
        Bundle bundle = new Bundle();
        bundle.putParcelable(ROPE_DEVICE_INFO, deviceInformation2);
        bundle.putString("productId", this.mProductId);
        bundle.putString("uniqueId", this.mUniqueId);
        Fragment deviceInfoFragment = new DeviceInfoFragment();
        deviceInfoFragment.setArguments(bundle);
        addFragment(deviceInfoFragment);
    }

    @Override // com.huawei.ui.commonui.adapter.BaseRecyclerAdapter.OnItemClickListener
    public void onItemClicked(RecyclerHolder recyclerHolder, int i, eps epsVar) {
        if (qrs.r()) {
            LogUtil.j(TAG, "onItemClicked click too fast");
            return;
        }
        int iB = epsVar.b();
        if (iB == 0) {
            gotoCourseDetail(getContext(), this.mType, this.mCurrentTargetModel, this.mCurrentModeValue, this.mType == 265 ? "R011" : "R001");
            this.mPresenter.setSubPageBiEvent(this.mProductId, this.mUniqueId, "warm_up", this.mType);
        } else if (iB == 2) {
            jumpToRateControl();
            this.mPresenter.setSubPageBiEvent(this.mProductId, this.mUniqueId, "hrmode", this.mType);
        } else {
            if (iB != 3) {
                return;
            }
            gotoCourseDetail(getContext(), this.mType, this.mCurrentTargetModel, this.mCurrentModeValue, this.mType == 265 ? "C601" : "R002");
            this.mPresenter.setSubPageBiEvent(this.mProductId, this.mUniqueId, "stretch_relax", this.mType);
        }
    }

    private void gotoCourseDetail(Context context, int i, int i2, float f, String str) {
        LogUtil.a(TAG, "gotoWarmUp, sportType = ", Integer.valueOf(i));
        PluginSuggestion pluginSuggestion = (PluginSuggestion) Services.d("PluginFitnessAdvice", PluginSuggestion.class);
        if (pluginSuggestion != null && pluginSuggestion.isInitComplete() && Utils.j()) {
            if (context == null) {
                LogUtil.j(TAG, "gotoWarmUp context is null");
                return;
            }
            pcd pcdVar = new pcd(str);
            pcdVar.b(R.anim.left_enter_short);
            pcdVar.d(R.anim.activity_no_animation_short);
            pcdVar.f(false);
            pcdVar.d(false);
            pcdVar.c(1);
            pea.b(context, pcdVar, getWorkoutRecordList(str));
            HashMap map = new HashMap(2);
            map.put("click", 1);
            map.put("type", 0);
            lmf.d().c(BaseApplication.getContext(), AnalyticsValue.MOTION_TRACK_1040021.value(), map, 0);
        }
    }

    private ArrayList<WorkoutRecord> getWorkoutRecordList(String str) {
        WorkoutRecord workoutRecord = new WorkoutRecord();
        workoutRecord.saveVersion(null);
        workoutRecord.saveExerciseTime(new Date().getTime());
        workoutRecord.saveWorkoutId(str);
        workoutRecord.savePlanId("");
        ArrayList<WorkoutRecord> arrayList = new ArrayList<>(1);
        arrayList.add(workoutRecord);
        return arrayList;
    }

    private void jumpToRateControl() {
        Bundle bundle = new Bundle();
        bundle.putString("productId", this.mProductId);
        bundle.putString("name", this.mDeviceName);
        bundle.putString("uniqueId", this.mUniqueId);
        bundle.putInt("deviceType", this.mType);
        DeviceInformation deviceInformation = this.mPresenter.getDeviceInformation();
        bundle.putString("sn", deviceInformation.getSerialNumber());
        bundle.putString(ProfileRequestConstants.MANU, deviceInformation.getManufacturerString());
        bundle.putString("model", deviceInformation.getModelString());
        bundle.putString("productId", this.mSmartProductId);
        if (this.mPresenter.isNeedShowDescription(this.mUniqueId)) {
            RateControlDescriptionFragment rateControlDescriptionFragment = new RateControlDescriptionFragment();
            rateControlDescriptionFragment.setArguments(bundle);
            addFragment(rateControlDescriptionFragment);
        } else {
            RateControlFragment rateControlFragment = new RateControlFragment();
            rateControlFragment.setArguments(bundle);
            addFragment(rateControlFragment);
        }
    }

    @Override // com.huawei.health.ecologydevice.ui.measure.fragment.SportDeviceIntroductionFragment, android.view.View.OnClickListener
    public void onClick(View view) {
        super.onClick(view);
        if (view == this.mStartImageView) {
            LogUtil.d(TAG, "onClick mStartImageView start training.");
            startIndoorEquipActivity();
        } else if (view == this.mReConnectTv) {
            connectToDevice();
        } else {
            LogUtil.d(TAG, "onClick unknown view");
        }
    }

    @Override // com.huawei.health.ecologydevice.ui.measure.fragment.SportDeviceIntroductionFragment
    protected void unBindDeviceSuccess(Map<String, Object> map) {
        this.mPresenter.removeNoShowDescriptionMac(this.mUniqueId);
        this.mPresenter.removeModeCache();
        this.mIndoorEquipManagerApi.releaseResource();
        super.unBindDeviceSuccess(map);
    }

    @Override // com.huawei.health.ecologydevice.ui.measure.view.SportIntroductionContentView
    public void onGetLastHistoryDataFail(int i) {
        View view;
        if (i != 0 || (view = this.mHistoryView) == null) {
            return;
        }
        view.setVisibility(8);
    }

    @Override // com.huawei.health.ecologydevice.ui.measure.view.SportIntroductionContentView
    public void onGetLastHistoryDataSuccess(HiTrackMetaData hiTrackMetaData, long j) {
        if (!isAdded()) {
            LogUtil.j(TAG, "onGetLastHistoryDataSuccess isAdded is false");
            return;
        }
        if (this.mHistoryView == null) {
            LogUtil.j(TAG, "onGetLastHistoryDataSuccess mHistoryView is null");
            return;
        }
        if (hiTrackMetaData == null) {
            LogUtil.j(TAG, "refreshLastDataUi trackMetaData is null");
            return;
        }
        Map<String, String> extendTrackMap = hiTrackMetaData.getExtendTrackMap();
        if (extendTrackMap == null || extendTrackMap.size() == 0) {
            LogUtil.j(TAG, "onGetLastHistoryDataSuccess extendTrackDataMap is null or size is 0");
            return;
        }
        if (this.mHistoryView.getVisibility() != 0) {
            this.mHistoryView.setVisibility(0);
        }
        if (hiTrackMetaData.getAvgPace() <= 0.0f) {
            this.mAverageData.setText("--");
        } else {
            this.mAverageData.setText(UnitUtil.e(nkw.d(false, 3, (1.0f / hiTrackMetaData.getAvgPace()) * 3600.0f), 1, 2));
        }
        this.mAverageDataUnit.setText(getString(R.string.IDS_motiontrack_show_detail_average_speed));
        this.mLastCount.setText(UnitUtil.e(((double) hiTrackMetaData.getTotalDistance()) / 1000.0d, 1, 2));
        this.mDataUnit.setText(this.mainActivity.getResources().getQuantityString(R.plurals.IDS_indoor_run_km, 0, ""));
        this.mSingleSkippingTime.setText(UnitUtil.e((int) (hiTrackMetaData.getTotalTime() / 1000)));
        this.mLastTime.setText(new SimpleDateFormat(FORMAT_HOUR_MIN, Locale.getDefault()).format(Long.valueOf(j)));
        this.mLastDay.setText(DateUtils.formatDateTime(this.mainActivity, j, 8));
        this.mSportTypeImage.setBackground(qqf.c(getResources().getDrawable(R.drawable.sport_icon_bg), getResources().getColor(R.color.pie_sector_running_level_color_b)));
        this.mSportTypeImage.setImageResource(this.mType == 265 ? R.drawable.ic_health_list_indoor_riding : R.drawable.ic_health_list_indoor_running);
        this.mKindName.setText(this.mType == 265 ? R.string.IDS_hwh_motiontrack_indoor_cycling : R.string.IDS_start_track_sport_type_indoor_run);
        this.mPresenter.getLastMonthRecord(this.mType, j);
    }

    private void initHistoryLayout() {
        View viewInflate = ((ViewStub) this.child.findViewById(R.id.viewstub_last_record_layout)).inflate();
        this.mHistoryView = viewInflate;
        this.mLastCount = (HealthTextView) viewInflate.findViewById(R.id.activity_last_count);
        this.mDataUnit = (HealthTextView) this.mHistoryView.findViewById(R.id.activity_data_unit);
        this.mAverageData = (HealthTextView) this.mHistoryView.findViewById(R.id.activity_average_data);
        this.mSingleSkippingTime = (HealthTextView) this.mHistoryView.findViewById(R.id.single_skipping_time);
        this.mSportTypeImage = (HealthImageView) this.mHistoryView.findViewById(R.id.activity_img);
        this.mLastTime = (HealthTextView) this.mHistoryView.findViewById(R.id.activity_last_time);
        this.mLastDay = (HealthTextView) this.mHistoryView.findViewById(R.id.activity_last_day);
        this.mMonthTotalDesc = (HealthTextView) this.mHistoryView.findViewById(R.id.activity_month_total_desc);
        this.mLastMonth = (HealthTextView) this.mHistoryView.findViewById(R.id.activity_last_month);
        this.mAverageDataUnit = (HealthTextView) this.mHistoryView.findViewById(R.id.activity_average_data_unit);
        this.mKindName = (HealthTextView) this.mHistoryView.findViewById(R.id.kind_name);
        this.child.findViewById(R.id.last_activity_layout).setOnClickListener(new View.OnClickListener() { // from class: com.huawei.health.ecologydevice.ui.measure.fragment.SportIntroductionContentFragment$$ExternalSyntheticLambda2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f$0.m1043x35515b36(view);
            }
        });
        this.child.findViewById(R.id.sport_month_data_layout).setOnClickListener(new View.OnClickListener() { // from class: com.huawei.health.ecologydevice.ui.measure.fragment.SportIntroductionContentFragment$$ExternalSyntheticLambda3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f$0.m1042xf56e478a(view);
            }
        });
    }

    /* JADX INFO: renamed from: lambda$initHistoryLayout$9$com-huawei-health-ecologydevice-ui-measure-fragment-SportIntroductionContentFragment, reason: not valid java name */
    /* synthetic */ void m1043x35515b36(View view) {
        this.mPresenter.queryTrackDetailData();
    }

    /* JADX INFO: renamed from: lambda$initHistoryLayout$10$com-huawei-health-ecologydevice-ui-measure-fragment-SportIntroductionContentFragment, reason: not valid java name */
    /* synthetic */ void m1042xf56e478a(View view) {
        erj.d(this.mainActivity, this.mType);
        this.mPresenter.setSubPageBiEvent(this.mProductId, this.mUniqueId, "history_list", this.mType);
    }

    @Override // com.huawei.health.ecologydevice.ui.measure.view.SportIntroductionContentView
    public String getProductId() {
        return this.mProductId;
    }

    @Override // com.huawei.health.ecologydevice.ui.measure.view.SportIntroductionContentView
    public void onMonthDataSuccess(String str, String str2) {
        this.mMonthTotalDesc.setText(str);
        this.mLastMonth.setText(str2);
    }

    @Override // com.huawei.health.ecologydevice.ui.measure.view.SportIntroductionContentView
    public void queryTrackDetailDataSuccess(MotionPathSimplify motionPathSimplify, String str) {
        goToTrackDetailActivity(motionPathSimplify, str);
        this.mPresenter.setSubPageBiEvent(this.mProductId, this.mUniqueId, "history_detail", this.mType);
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0060  */
    /* JADX WARN: Code duplicated, block: B:23:0x007a  */
    @Override // com.huawei.health.ecologydevice.ui.measure.view.SportIntroductionContentView
    public void onDeviceBleStateChanged(int i) {
        if (getContext() == null) {
            LogUtil.j(TAG, "onDeviceBleStateChanged getContext  is null");
            return;
        }
        if (isRemoving() || isDetached()) {
            LogUtil.j(TAG, "onDeviceBleStateChanged isRemoving");
            return;
        }
        boolean z = false;
        if (i == 0) {
            this.mBleConnectStateText.setText(R.string.IDS_device_rope_device_not_connected);
            this.mReConnectTv.setVisibility(0);
            this.mStartImageView.setVisibility(8);
            this.mReconnectLoadingPb.setVisibility(8);
            if (this.mConnectCount == 3) {
                showReconnectCountDialog();
            }
        } else if (i == 1) {
            this.mBleConnectStateText.setText(R.string.IDS_device_rope_device_connecting);
            this.mReConnectTv.setVisibility(8);
            this.mStartImageView.setVisibility(8);
            this.mReconnectLoadingPb.setVisibility(0);
        } else if (i == 2) {
            this.mBleConnectStateText.setText(R.string.IDS_device_rope_device_connected);
            this.mReConnectTv.setVisibility(8);
            this.mStartImageView.setVisibility(0);
            this.mReconnectLoadingPb.setVisibility(8);
            this.mConnectCount = 0;
            z = true;
        } else if (i == 3) {
            this.mBleConnectStateText.setText(R.string.IDS_device_rope_device_not_connected);
            this.mReConnectTv.setVisibility(0);
            this.mStartImageView.setVisibility(8);
            this.mReconnectLoadingPb.setVisibility(8);
            if (this.mConnectCount == 3) {
                showReconnectCountDialog();
            }
        }
        setViewClickable(z);
        View view = this.mControlByHeartRateLayout;
        if (view != null) {
            view.setAlpha(z ? 1.0f : TRANS_ALPHA);
            this.mControlByHeartRateLayout.setClickable(z);
        } else {
            LogUtil.j(TAG, "mControlByHeartRateLayout is null");
        }
    }

    @Override // com.huawei.health.ecologydevice.ui.measure.fragment.SportDeviceIntroductionFragment, com.huawei.health.ecologydevice.ui.measure.fragment.ProductFragment
    protected void updateUIDisconnect() {
        super.updateUIDisconnect();
        LogUtil.a(TAG, "updateUIDisconnect");
        this.mBleConnectStateText.setText(R.string.IDS_device_rope_device_not_connected);
        this.mReConnectTv.setVisibility(0);
        this.mStartImageView.setVisibility(8);
        this.mReconnectLoadingPb.setVisibility(8);
        setViewClickable(false);
    }

    private void showReconnectCountDialog() {
        if (getContext() == null) {
            LogUtil.j(TAG, "showReconnectCountDialog getContext() is null");
            return;
        }
        View viewInflate = LayoutInflater.from(this.mainActivity).inflate(R.layout.dialog_sport_connect_fail, (ViewGroup) null);
        ((HealthTextView) viewInflate.findViewById(R.id.tv_connect_fail_close_device)).setText(getString(R.string.IDS_connect_fail_close_to_device, "10"));
        CustomAlertDialog.Builder builder = new CustomAlertDialog.Builder(getContext());
        builder.d(R.string.IDS_device_common_err_connect_fail_tips).a(viewInflate).d(R.string.IDS_hw_health_wear_connect_device_connect_button, new DialogInterface.OnClickListener() { // from class: com.huawei.health.ecologydevice.ui.measure.fragment.SportIntroductionContentFragment$$ExternalSyntheticLambda6
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                this.f$0.m1049xfb0ba952(dialogInterface, i);
            }
        }).a(R.string.IDS_my_track_detail_i_go_it, new DialogInterface.OnClickListener() { // from class: com.huawei.health.ecologydevice.ui.measure.fragment.SportIntroductionContentFragment$$ExternalSyntheticLambda7
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                this.f$0.m1050x40acebf1(dialogInterface, i);
            }
        });
        CustomAlertDialog customAlertDialogB = builder.b();
        this.mDialogConnectFail = customAlertDialogB;
        customAlertDialogB.setCancelable(false);
        this.mDialogConnectFail.show();
    }

    /* JADX INFO: renamed from: lambda$showReconnectCountDialog$11$com-huawei-health-ecologydevice-ui-measure-fragment-SportIntroductionContentFragment, reason: not valid java name */
    /* synthetic */ void m1049xfb0ba952(DialogInterface dialogInterface, int i) {
        if (this.mDialogConnectFail != null) {
            this.mConnectCount = 0;
            connectToDevice();
            this.mDialogConnectFail.dismiss();
            this.mDialogConnectFail = null;
            return;
        }
        LogUtil.j(TAG, "showReconnectCountDialog setPositiveButton null");
    }

    /* JADX INFO: renamed from: lambda$showReconnectCountDialog$12$com-huawei-health-ecologydevice-ui-measure-fragment-SportIntroductionContentFragment, reason: not valid java name */
    /* synthetic */ void m1050x40acebf1(DialogInterface dialogInterface, int i) {
        CustomAlertDialog customAlertDialog = this.mDialogConnectFail;
        if (customAlertDialog != null) {
            this.mConnectCount = 0;
            customAlertDialog.dismiss();
            this.mDialogConnectFail = null;
            return;
        }
        LogUtil.j(TAG, "showReconnectCountDialog setPositiveButton null");
    }

    private void setViewClickable(boolean z) {
        this.mStartImageView.setClickable(z);
        this.mFreeModeLayout.setClickable(z);
        this.mTimeModeLayout.setClickable(z);
        this.mDistanceModeLayout.setClickable(z);
        this.mCalModeLayout.setClickable(z);
        float f = z ? 1.0f : TRANS_ALPHA;
        this.mStartImageView.setAlpha(f);
        this.mStartImageView.setClickable(z);
        this.mModeSelectLayout.setAlpha(f);
        this.mModeSelectLayout.setClickable(z);
    }

    private void goToTrackDetailActivity(MotionPathSimplify motionPathSimplify, String str) {
        Bundle bundle = new Bundle();
        bundle.putSerializable("simplifyDatakey", motionPathSimplify);
        bundle.putString("contentpath", str);
        bundle.putBoolean("isAfterSport", false);
        bundle.putBoolean("isNotNeedDeleteFile", false);
        Intent intent = new Intent(BaseApplication.getContext(), (Class<?>) TrackDetailActivity.class);
        intent.putExtras(bundle);
        intent.addFlags(268435456);
        iov.d(BaseApplication.getContext(), intent);
    }

    private void connectToDevice() {
        int iB = esk.b().b(this.mainActivity);
        if (iB == 0) {
            popupFragment(null);
            return;
        }
        if (this.mIsBtEnableShowing) {
            LogUtil.a(TAG, "connectToDevice cancle mIsBtEnableShowing =", Boolean.valueOf(this.mIsBtEnableShowing));
            return;
        }
        if (!checkPermission()) {
            LogUtil.a(TAG, "checkPermission cancle mIsBtEnableShowing =", Boolean.valueOf(this.mIsBtEnableShowing));
            return;
        }
        if (iB != 1) {
            LogUtil.a(TAG, "judgeBlueTooth cancle mIsBtEnableShowing =", Boolean.valueOf(this.mIsBtEnableShowing));
            openBlueTooth(101);
        } else {
            this.mConnectCount++;
            onDeviceBleStateChanged(1);
            this.mPresenter.connectDevice(this.mType, this.mProductInfo);
        }
    }

    @Override // com.huawei.health.ecologydevice.ui.measure.view.SportIntroductionContentView
    public void startSport() {
        LogUtil.a(TAG, "startSport.");
        if (nty.d()) {
            LogUtil.j(TAG, "this activity not auto start sport");
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putInt(WorkoutRecord.Extend.COURSE_TARGET_TYPE, 6);
        bundle.putBoolean("sendVoice", false);
        startIndoorEquipActivity(bundle);
    }

    @Override // com.huawei.health.ecologydevice.ui.measure.fragment.SportDeviceIntroductionFragment, com.huawei.health.ecologydevice.ui.measure.fragment.ProductFragment
    protected void autoConnectDevice() {
        if (this.mIndoorEquipManagerApi.isDeviceBtConnected() && !TextUtils.isEmpty(this.mUniqueId) && this.mUniqueId.equals(this.mIndoorEquipManagerApi.getCurrentMacAddress())) {
            onDeviceBleStateChanged(2);
            LogUtil.a(TAG, "isDeviceBtConnected");
            return;
        }
        onDeviceBleStateChanged(0);
        if (this.mIndoorEquipManagerApi.isDeviceBtConnected()) {
            this.mIndoorEquipManagerApi.disconnect(false);
        }
        LogUtil.a(TAG, "connectToDevice");
        this.mConnectCount++;
        onDeviceBleStateChanged(1);
        this.mPresenter.connectDevice(this.mType, this.mProductInfo);
    }

    @Override // com.huawei.health.ecologydevice.ui.measure.fragment.ProductFragment, androidx.fragment.app.Fragment
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        LogUtil.a(TAG, "onActivityResult requestCode", Integer.valueOf(i), " resultCode", Integer.valueOf(i2));
        if (i == 101) {
            this.mIsBtEnableShowing = false;
            if (i2 == -1) {
                autoConnectDevice();
            } else {
                popupFragment(null);
            }
        }
    }
}
