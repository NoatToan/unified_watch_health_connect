package com.huawei.health.ecologydevice.ui.measure.fragment;

import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.text.format.DateUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.google.json.JsonSanitizer;
import com.huawei.ecologydevice.R;
import com.huawei.haf.design.pattern.Observer;
import com.huawei.haf.design.pattern.ObserverManagerUtil;
import com.huawei.haf.handler.HandlerExecutor;
import com.huawei.health.device.connectivity.comm.MeasurableDevice;
import com.huawei.health.device.datatype.IntermitentJumpData;
import com.huawei.health.device.model.DeviceExtra;
import com.huawei.health.ecologydevice.callback.PickerChooseCallback;
import com.huawei.health.ecologydevice.fitness.RopeFittingsClient;
import com.huawei.health.ecologydevice.fitness.datastruct.RopeModeSettingData;
import com.huawei.health.ecologydevice.manager.EcologyDevicePickerManager;
import com.huawei.health.ecologydevice.manager.HpkPermissionManager;
import com.huawei.health.ecologydevice.manager.ResourceManager;
import com.huawei.health.ecologydevice.manager.RopeCloudAuthManager;
import com.huawei.health.ecologydevice.ui.measure.adapter.SecondRopeItemAdapter;
import com.huawei.health.ecologydevice.ui.measure.fragment.ropefragment.RopeSkipIntermittentTrainingFragment;
import com.huawei.health.ecologydevice.ui.measure.fragment.ropefragment.RopeSkipSettingFragment;
import com.huawei.health.ecologydevice.ui.measure.fragment.ropefragment.mediamanager.MediaManager;
import com.huawei.health.ecologydevice.ui.measure.fragment.ropefragment.mediamanager.VoiceCourseFragment;
import com.huawei.healthcloud.plugintrack.ui.activity.TrackDetailActivity;
import com.huawei.hihealth.HiHealthData;
import com.huawei.hihealth.data.model.HiTrackMetaData;
import com.huawei.hihealth.util.HiJsonUtil;
import com.huawei.hms.hihealth.data.Scopes;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwcommonmodel.constants.AnalyticsValue;
import com.huawei.hwfoundationmodel.trackmodel.MotionPathSimplify;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.pluginmgr.hwwear.bean.DeviceFittingsBean;
import com.huawei.ui.commonui.adapter.BaseRecyclerAdapter;
import com.huawei.ui.commonui.adapter.RecyclerHolder;
import com.huawei.ui.commonui.base.BaseDialog;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.commonui.imageview.HealthImageView;
import com.huawei.ui.commonui.recycleview.HealthRecycleView;
import defpackage.dmg;
import defpackage.ehp;
import defpackage.elh;
import defpackage.emh;
import defpackage.eps;
import defpackage.era;
import defpackage.erj;
import defpackage.etn;
import defpackage.iov;
import defpackage.ive;
import defpackage.izn;
import defpackage.jaa;
import defpackage.jhl;
import defpackage.jpq;
import defpackage.lmf;
import defpackage.njy;
import defpackage.ofe;
import defpackage.piq;
import defpackage.pjc;
import defpackage.qqf;
import defpackage.qqz;
import defpackage.qrs;
import health.compact.a.CommonUtil;
import health.compact.a.CommonUtils;
import health.compact.a.LanguageUtil;
import health.compact.a.SharedPreferenceManager;
import health.compact.a.UnitUtil;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/* JADX INFO: loaded from: classes7.dex */
public class SecondRopeIntroductionFragment extends BaseRopeIntroductionFragment implements View.OnClickListener, BaseRecyclerAdapter.OnItemClickListener<eps> {
    private static final int ADD_FITTING_DEVICE = 0;
    private static final int CLICK_INTERVAL = 500;
    private static final int CONNECT_FITTING_DEVICE = 1;
    private static final int DEFAULT_MILLIS = 60;
    private static final int ENTRY_FITTING_SETTING = 2;
    private static final String FORMAT_HOUR_MIN = "HH:mm";
    private static final int GRID_COUNT = 2;
    private static final int MAXTIME_MILLIS_HIGH = 7200;
    private static final int MAXTIME_MILLIS_LOW = 5400;
    private static final int MAX_NUMBER = 10000;
    private static final int MEDIA_TYPE_COURSE = 0;
    private static final int MEDIA_TYPE_PLAYLISTS = 1;
    private static final int MINTIME_MILLIS = 30;
    private static final int MIN_NUMBER = 50;
    private static final int SECONDE_TO_MILLISECONDS = 1000;
    private static final int SPACING_DP = 6;
    private static final String TAG = "SecondRopeIntroductionFragment";
    private static final float TRANS_ALFA = 0.6f;
    private int mDefaultNum;
    private String mEnduranceAbility;
    private HealthImageView mFancyJumpIv;
    private LinearLayout mFancyJumpLayout;
    private HealthTextView mFancyJumpTv;
    private LinearLayout mFittingConnectLayout;
    private HealthImageView mFittingConnectStatusIcon;
    private HealthTextView mFittingConnectStatusView;
    private RelativeLayout mFittingItem;
    private String mFittingProductId;
    private elh mFittingProductInfo;
    private String mFittingUniqueId;
    private Typeface mFontFamilyMedium;
    private Typeface mFontFamilyRegular;
    private HealthImageView mFreeJumpIv;
    private LinearLayout mFreeJumpLayout;
    private HealthTextView mFreeJumpTv;
    private boolean mIsActive;
    private boolean mIsInitMoreMenuView;
    private boolean mIsInitSettingMenuView;
    private boolean mIsShowFittingItem;
    private SecondRopeItemAdapter mItemAdapter;
    private RelativeLayout mLastRopeLayout;
    private LinearLayout mModeChooseLayout;
    private LinearLayout mModeSelectLayout;
    private EcologyDevicePickerManager mNumberJumpDialog;
    private HealthImageView mNumberJumpIv;
    private LinearLayout mNumberJumpLayout;
    private HealthTextView mNumberJumpTv;
    private int mNumberSelectIndex;
    private HealthTextView mRopeAverageData;
    private RopeCloudAuthManager mRopeCloudAuthManager;
    private HealthTextView mRopeDataUnit;
    private HealthTextView mRopeLastCount;
    private HealthTextView mRopeLastDay;
    private HealthTextView mRopeLastMonth;
    private HealthTextView mRopeLastTime;
    private RelativeLayout mRopeModeLayout;
    private HealthTextView mRopeModeTv;
    private HealthTextView mRopeModeValueTv;
    private RelativeLayout mRopeMonthDataLayout;
    private HealthImageView mRopeMonthIconRightIv;
    private HealthTextView mRopeMonthTotalDesc;
    private HealthImageView mRopeStartIv;
    private HealthRecycleView mRvSecondRopeItem;
    private HealthTextView mSingleSkippingTime;
    private EcologyDevicePickerManager mTimeJumpDialog;
    private HealthImageView mTimeJumpIv;
    private LinearLayout mTimeJumpLayout;
    private HealthTextView mTimeJumpTv;
    private int mTimeSelectIndex;
    private static final int[] TIME_TARGET_LIST = {1, 3, 5, 10, 15, 30, 60};
    private static final int[] NUMBER_TARGET_LIST = {80, 100, 200, 300, 500, 1000, 2000, 3000, 5000};
    private int mCurrentTargetModle = 6;
    private int mTarget = 0;
    private int mDefaultTime = 60;
    private List<eps> mMenuItemBeans = new ArrayList(10);
    private String mFittingConnectStatus = "";
    private Observer mDeviceAssociateObserver = new Observer() { // from class: com.huawei.health.ecologydevice.ui.measure.fragment.SecondRopeIntroductionFragment.1
        @Override // com.huawei.haf.design.pattern.Observer
        public void notify(String str, Object... objArr) {
            LogUtil.a(SecondRopeIntroductionFragment.TAG, "notify, args = ", Arrays.toString(objArr));
            if (objArr.length == 0) {
                return;
            }
            Object obj = objArr[0];
            if (obj instanceof Integer) {
                int iIntValue = ((Integer) obj).intValue();
                if (iIntValue == 1) {
                    SecondRopeIntroductionFragment.this.checkUserAuthorization();
                    return;
                }
                if (iIntValue == 2) {
                    if (!TextUtils.isEmpty(SecondRopeIntroductionFragment.this.mFittingUniqueId)) {
                        emh.b().b(SecondRopeIntroductionFragment.this.mFittingUniqueId);
                    }
                    SecondRopeIntroductionFragment.this.mFittingConnectStatus = "STATUS_UNBIND";
                    SecondRopeIntroductionFragment.this.mFittingProductId = "";
                    SecondRopeIntroductionFragment.this.mFittingUniqueId = "";
                    SecondRopeIntroductionFragment.this.mFittingProductInfo = null;
                    SecondRopeIntroductionFragment.this.notifyFittingState();
                    return;
                }
                LogUtil.a(SecondRopeIntroductionFragment.TAG, "notify sendValue is other");
            }
        }
    };
    private RopeFittingsClient.FittingsMessageOrStateCallback mFittingsMessageOrStateCallback = new RopeFittingsClient.FittingsMessageOrStateCallback() { // from class: com.huawei.health.ecologydevice.ui.measure.fragment.SecondRopeIntroductionFragment.2
        @Override // com.huawei.health.ecologydevice.fitness.RopeFittingsClient.FittingsMessageOrStateCallback
        public void onNewMessage(String str, int i, Bundle bundle) {
            LogUtil.a(SecondRopeIntroductionFragment.TAG, "FittingsMessageOrStateCallback onNewMessage");
        }

        @Override // com.huawei.health.ecologydevice.fitness.RopeFittingsClient.FittingsMessageOrStateCallback
        public void onStateChange(String str, String str2) {
            LogUtil.a(SecondRopeIntroductionFragment.TAG, "FittingsMessageOrStateCallback onStateChange state =", str2);
            SecondRopeIntroductionFragment.this.mFittingConnectStatus = str2;
            SecondRopeIntroductionFragment.this.notifyFittingState();
        }
    };

    @Override // com.huawei.health.ecologydevice.ui.measure.fragment.BaseRopeIntroductionFragment, com.huawei.health.ecologydevice.ui.BaseFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        LogUtil.a(TAG, "in onCreate");
        this.mRopeCloudAuthManager = new RopeCloudAuthManager(this.mainActivity, this.mProductId, this.mUniqueId);
        ObserverManagerUtil.d(this.mDeviceAssociateObserver, "H5_PAGE_EXIT");
        ObserverManagerUtil.d(this.mDeviceAssociateObserver, "H5_UNBIND_DEVICE");
        downloadCoursesAndMusicsProfile();
        this.mRopeCloudAuthManager.a(this.mProductId, new RopeCloudAuthManager.DonwHkpListen() { // from class: com.huawei.health.ecologydevice.ui.measure.fragment.SecondRopeIntroductionFragment$$ExternalSyntheticLambda3
            @Override // com.huawei.health.ecologydevice.manager.RopeCloudAuthManager.DonwHkpListen
            public final void downHpkSuccessReSend() {
                this.f$0.m1031xfa2387ed();
            }
        });
    }

    /* JADX INFO: renamed from: lambda$onCreate$0$com-huawei-health-ecologydevice-ui-measure-fragment-SecondRopeIntroductionFragment, reason: not valid java name */
    /* synthetic */ void m1031xfa2387ed() {
        if (this.mRopeDeviceDataManager == null || this.mRopeCloudAuthManager == null) {
            return;
        }
        this.mRopeCloudAuthManager.c(this.mRopeDeviceDataManager.c() == 2);
    }

    @Override // com.huawei.health.ecologydevice.ui.measure.fragment.BaseRopeIntroductionFragment
    protected int getLayoutId() {
        return R.layout.second_rope_introduction_layout;
    }

    @Override // com.huawei.health.ecologydevice.ui.measure.fragment.BaseRopeIntroductionFragment
    protected void initChildView() {
        if (this.child == null) {
            LogUtil.j(TAG, "initChildView child is null");
            return;
        }
        initData();
        initLayout();
        initRecyclerView();
        refreshRopeModeLayoutUi();
        initRtLanguageView();
        initTypface();
        initFittingData();
    }

    @Override // com.huawei.health.ecologydevice.ui.measure.fragment.BaseRopeIntroductionFragment
    protected void initUxConfig(ehp ehpVar) {
        ehp.e eVarA;
        boolean zG;
        ehp.d dVarB;
        super.initUxConfig(ehpVar);
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
        if (zG) {
            this.mRopeHistoryLayout = (ViewGroup) this.child.findViewById(R.id.rope_history_layout);
        }
        initRecyclerViewData(eVarA);
        initMoreMenuData(dVarB);
        initFittingsView(ehpVar);
    }

    private void controlModeLayoutByUxConfig(ehp.c cVar) {
        boolean zD = cVar.d();
        boolean zH = cVar.h();
        boolean zE = cVar.e();
        boolean zC = cVar.c();
        this.mModeSelectLayout.removeAllViews();
        if (zD) {
            this.mModeSelectLayout.addView(this.mFreeJumpLayout);
            this.mFreeJumpLayout.setVisibility(0);
        }
        if (zH) {
            this.mModeSelectLayout.addView(this.mTimeJumpLayout);
            this.mTimeJumpLayout.setVisibility(0);
        }
        if (zE) {
            this.mModeSelectLayout.addView(this.mNumberJumpLayout);
            this.mNumberJumpLayout.setVisibility(0);
        }
        if (zC) {
            this.mModeSelectLayout.addView(this.mFancyJumpLayout);
            this.mFancyJumpLayout.setVisibility(0);
        }
        if (this.mModeSelectLayout.getChildCount() < 2) {
            this.mModeChooseLayout.setVisibility(8);
            this.mRopeModeTv.setVisibility(8);
        }
    }

    private void initLayout() {
        this.mRopeModeLayout = (RelativeLayout) this.child.findViewById(R.id.rope_mode_layout);
        HealthImageView healthImageView = (HealthImageView) this.child.findViewById(R.id.rope_start_iv);
        this.mRopeStartIv = healthImageView;
        healthImageView.setOnClickListener(this);
        this.mRopeModeTv = (HealthTextView) this.child.findViewById(R.id.rope_mode_tv);
        this.mRopeModeValueTv = (HealthTextView) this.child.findViewById(R.id.rope_mode_value_tv);
        this.mModeChooseLayout = (LinearLayout) this.child.findViewById(R.id.mode_choose_layout);
        this.mModeSelectLayout = (LinearLayout) this.child.findViewById(R.id.sport_mode_select_ll);
        LinearLayout linearLayout = (LinearLayout) this.child.findViewById(R.id.free_jump_layout);
        this.mFreeJumpLayout = linearLayout;
        linearLayout.setOnClickListener(this);
        LinearLayout linearLayout2 = (LinearLayout) this.child.findViewById(R.id.time_jump_layout);
        this.mTimeJumpLayout = linearLayout2;
        linearLayout2.setOnClickListener(this);
        LinearLayout linearLayout3 = (LinearLayout) this.child.findViewById(R.id.number_jump_layout);
        this.mNumberJumpLayout = linearLayout3;
        linearLayout3.setOnClickListener(this);
        LinearLayout linearLayout4 = (LinearLayout) this.child.findViewById(R.id.fancy_jump_layout);
        this.mFancyJumpLayout = linearLayout4;
        linearLayout4.setOnClickListener(this);
        this.mFancyJumpLayout.setVisibility(era.j(this.mProductId) ? 0 : 8);
        this.mFreeJumpIv = (HealthImageView) this.child.findViewById(R.id.free_jump_iv);
        this.mFreeJumpTv = (HealthTextView) this.child.findViewById(R.id.free_jump_tv);
        this.mTimeJumpIv = (HealthImageView) this.child.findViewById(R.id.time_jump_iv);
        this.mTimeJumpTv = (HealthTextView) this.child.findViewById(R.id.time_jump_tv);
        this.mNumberJumpIv = (HealthImageView) this.child.findViewById(R.id.number_jump_iv);
        this.mNumberJumpTv = (HealthTextView) this.child.findViewById(R.id.number_jump_tv);
        this.mFancyJumpIv = (HealthImageView) this.child.findViewById(R.id.fancy_jump_iv);
        this.mFancyJumpTv = (HealthTextView) this.child.findViewById(R.id.fancy_jump_tv);
        RelativeLayout relativeLayout = (RelativeLayout) this.child.findViewById(R.id.sport_month_data_layout);
        this.mRopeMonthDataLayout = relativeLayout;
        relativeLayout.setOnClickListener(this);
        RelativeLayout relativeLayout2 = (RelativeLayout) this.child.findViewById(R.id.last_activity_layout);
        this.mLastRopeLayout = relativeLayout2;
        relativeLayout2.setOnClickListener(this);
        this.mRopeLastMonth = (HealthTextView) this.child.findViewById(R.id.activity_last_month);
        this.mRopeMonthTotalDesc = (HealthTextView) this.child.findViewById(R.id.activity_month_total_desc);
        this.mRopeLastDay = (HealthTextView) this.child.findViewById(R.id.activity_last_day);
        this.mRopeLastTime = (HealthTextView) this.child.findViewById(R.id.activity_last_time);
        this.mRopeLastCount = (HealthTextView) this.child.findViewById(R.id.activity_last_count);
        this.mRopeDataUnit = (HealthTextView) this.child.findViewById(R.id.activity_data_unit);
        this.mSingleSkippingTime = (HealthTextView) this.child.findViewById(R.id.single_skipping_time);
        this.mRopeAverageData = (HealthTextView) this.child.findViewById(R.id.activity_average_data);
        this.mRopeMonthIconRightIv = (HealthImageView) this.child.findViewById(R.id.rope_month_icon_right_iv);
        this.mRvSecondRopeItem = (HealthRecycleView) this.child.findViewById(R.id.rv_second_menu_item);
    }

    private void initFittingsView(ehp ehpVar) {
        this.mFittingItem = (RelativeLayout) this.child.findViewById(R.id.fitting_item);
        this.mFittingConnectLayout = (LinearLayout) this.child.findViewById(R.id.fitting_connect_layout);
        this.mFittingConnectStatusView = (HealthTextView) this.child.findViewById(R.id.fitting_connect_status);
        this.mFittingConnectStatusIcon = (HealthImageView) this.child.findViewById(R.id.fitting_connect_status_icon);
        this.mFittingItem.setOnClickListener(this);
        this.mFittingConnectLayout.setOnClickListener(this);
        List<pjc> listC = piq.e().c(this.mProductId);
        if (njy.e(listC)) {
            return;
        }
        List<DeviceFittingsBean> listE = listC.get(0).e();
        if (ehpVar != null) {
            this.mIsShowFittingItem = ehpVar.f();
        } else {
            this.mIsShowFittingItem = njy.b(listE);
        }
        if (this.mIsShowFittingItem) {
            this.mFittingItem.setVisibility(0);
            this.mFittingConnectStatusView.setTextColor(getResources().getColor(R.color.rope_mode_text_selector));
            this.mFittingConnectStatusIcon.setImageResource(qrs.x(getContext()) ? R.drawable.fittings_luminous_rope_disconnect_status_dark_mode : R.drawable.fittings_luminous_rope_disconnect_status);
            if (TextUtils.isEmpty(this.mFittingUniqueId)) {
                LogUtil.j(TAG, "initFittingData mFittingUniqueId is is empty");
                this.mFittingConnectStatusView.setText(this.mainActivity.getResources().getString(R.string.IDS_fittings_unbound));
                return;
            } else {
                this.mFittingConnectStatusView.setText(this.mainActivity.getResources().getString(R.string.IDS_device_rope_device_not_connected));
                return;
            }
        }
        this.mFittingItem.setVisibility(8);
    }

    private void initFittingData() {
        MeasurableDevice bondedDeviceByUniqueId = dmg.a().getBondedDeviceByUniqueId(this.mUniqueId, false);
        if (bondedDeviceByUniqueId == null) {
            LogUtil.j(TAG, "initFittingData device is null");
            return;
        }
        DeviceExtra deviceExtra = (DeviceExtra) HiJsonUtil.d(bondedDeviceByUniqueId.getExtra(), DeviceExtra.class);
        if (deviceExtra == null || !njy.b(deviceExtra.getFittings())) {
            LogUtil.a(TAG, "initFittingData fittingsList is empty");
            this.mFittingConnectStatus = "STATUS_UNBIND";
            return;
        }
        List<DeviceExtra.DeviceData> fittings = deviceExtra.getFittings();
        this.mFittingProductId = fittings.get(0).getProductId();
        this.mFittingUniqueId = fittings.get(0).getUniqueId();
        this.mFittingProductInfo = ResourceManager.c().d(this.mFittingProductId);
        this.mFittingConnectStatus = "STATUS_DIS_CONNECT";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void notifyFittingState() {
        HandlerExecutor.b(new Runnable() { // from class: com.huawei.health.ecologydevice.ui.measure.fragment.SecondRopeIntroductionFragment$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.m1029x90fd6b0c();
            }
        });
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:45:0x00a6  */
    /* JADX INFO: renamed from: lambda$notifyFittingState$1$com-huawei-health-ecologydevice-ui-measure-fragment-SecondRopeIntroductionFragment, reason: not valid java name */
    /* synthetic */ void m1029x90fd6b0c() {
        if (this.mainActivity == null) {
            LogUtil.j(TAG, "notifyFittingState mainActivity is null");
        }
        LogUtil.a(TAG, "notifyFittingState mFittingConnectStatus = ", this.mFittingConnectStatus);
        this.mFittingConnectStatusIcon.setImageResource(qrs.x(getContext()) ? R.drawable.fittings_luminous_rope_disconnect_status_dark_mode : R.drawable.fittings_luminous_rope_disconnect_status);
        this.mFittingConnectStatusView.setTextColor(this.mainActivity.getResources().getColor(R.color.rope_mode_text_selector));
        String str = this.mFittingConnectStatus;
        str.hashCode();
        switch (str) {
            case "REQUEST_RECONNECT_DEVICE":
            case "STATUS_GATT_STATE_CONNECTING":
                this.mFittingConnectStatusView.setText(this.mainActivity.getResources().getString(R.string.IDS_device_rope_device_connecting));
                break;
            case "GET_SERVICE_SUCCESS":
                this.mFittingConnectStatusIcon.setImageResource(R.drawable.fittings_luminous_rope_connected_status);
                this.mFittingConnectStatusView.setText(this.mainActivity.getResources().getString(R.string.IDS_device_rope_device_connected));
                break;
            case "STATUS_UNBIND":
                this.mFittingConnectStatusView.setText(this.mainActivity.getResources().getString(R.string.IDS_fittings_unbound));
                break;
            case "STATUS_DISCOVERY_SERVICE_FAIL":
            case "GATT_ERROR":
                if (!TextUtils.isEmpty(this.mFittingUniqueId)) {
                    emh.b().b(this.mFittingUniqueId);
                }
                this.mFittingConnectStatusView.setText(this.mainActivity.getResources().getString(R.string.IDS_device_rope_device_reconnect));
                this.mFittingConnectStatusView.setTextColor(this.mainActivity.getResources().getColor(R.color.card_device_view_color3));
                break;
            case "STATUS_CONNECT_FAIL":
                this.mFittingConnectStatusView.setText(this.mainActivity.getResources().getString(R.string.IDS_device_rope_device_reconnect));
                this.mFittingConnectStatusView.setTextColor(this.mainActivity.getResources().getColor(R.color.card_device_view_color3));
                break;
            case "STATUS_DIS_CONNECT":
                this.mFittingConnectStatusView.setText(this.mainActivity.getResources().getString(R.string.IDS_device_rope_device_not_connected));
                break;
        }
    }

    private void initData() {
        String strB = SharedPreferenceManager.b("second_rope_target", "rope_skipping_picker_number", "");
        if (!TextUtils.isEmpty(strB)) {
            Map<String, Integer> map = (Map) izn.d(strB, new TypeToken<Map<String, Integer>>() { // from class: com.huawei.health.ecologydevice.ui.measure.fragment.SecondRopeIntroductionFragment.3
            });
            this.mDefaultNum = getCacheValue(map, "target_cache_value");
            this.mNumberSelectIndex = getCacheValue(map, "target_cache_select_index");
        }
        String strB2 = SharedPreferenceManager.b("second_rope_target", "rope_skipping_picker_time", "");
        if (TextUtils.isEmpty(strB2)) {
            return;
        }
        Map<String, Integer> map2 = (Map) izn.d(strB2, new TypeToken<Map<String, Integer>>() { // from class: com.huawei.health.ecologydevice.ui.measure.fragment.SecondRopeIntroductionFragment.4
        });
        this.mDefaultTime = getCacheValue(map2, "target_cache_value");
        this.mTimeSelectIndex = getCacheValue(map2, "target_cache_select_index");
    }

    private int getCacheValue(Map<String, Integer> map, String str) {
        if (map == null) {
            LogUtil.j(TAG, "getCacheValue() targetMap is null");
            return 0;
        }
        Integer num = map.get(str);
        if (num != null) {
            return num.intValue();
        }
        return 0;
    }

    private void initRecyclerView() {
        GridLayoutManager gridLayoutManager = new GridLayoutManager(this.mainActivity, 2);
        gridLayoutManager.setOrientation(1);
        this.mRvSecondRopeItem.setLayoutManager(gridLayoutManager);
        SecondRopeItemAdapter secondRopeItemAdapter = new SecondRopeItemAdapter(this.mMenuItemBeans);
        this.mItemAdapter = secondRopeItemAdapter;
        secondRopeItemAdapter.setOnItemClickListener(this);
        this.mRvSecondRopeItem.setAdapter(this.mItemAdapter);
        this.mRvSecondRopeItem.setIsScroll(false);
        this.mRvSecondRopeItem.addItemDecoration(new RecyclerView.ItemDecoration() { // from class: com.huawei.health.ecologydevice.ui.measure.fragment.SecondRopeIntroductionFragment.5
            @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
            public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.State state) {
                super.getItemOffsets(rect, view, recyclerView, state);
                int childAdapterPosition = recyclerView.getChildAdapterPosition(view);
                int iC = jhl.c(SecondRopeIntroductionFragment.this.mainActivity, 6.0f);
                boolean zBa = LanguageUtil.ba(SecondRopeIntroductionFragment.this.mainActivity);
                int i = childAdapterPosition % 2;
                if ((i == 0 && !zBa) || (i == 1 && zBa)) {
                    rect.right = iC;
                } else {
                    rect.left = iC;
                }
            }
        });
    }

    private void initRecyclerViewData(ehp.e eVar) {
        boolean z;
        boolean z2;
        boolean zC;
        boolean zG;
        boolean zE;
        boolean zF;
        if (this.mIsInitSettingMenuView) {
            LogUtil.j(TAG, "initRecyclerViewData is not init again ");
            return;
        }
        if (eVar != null) {
            zF = eVar.f();
            if (eVar.b() && jaa.f(BaseApplication.getContext())) {
                CommonUtil.bh();
            }
            boolean zA = eVar.a();
            boolean zD = eVar.d();
            z = zA;
            z2 = zD;
            zC = eVar.c();
            zG = eVar.g();
            zE = eVar.e();
        } else {
            if (jaa.f(BaseApplication.getContext())) {
                CommonUtil.bh();
            }
            boolean zJ = era.j(this.mProductId);
            boolean zJ2 = era.j(this.mProductId);
            boolean zEquals = "true".equals(era.a("isSupportIntermit", this.mProductId));
            boolean zD2 = era.d(this.mProductId);
            z = zJ;
            z2 = zJ2;
            zC = zEquals;
            zG = !zD2;
            zE = zD2;
            zF = true;
        }
        if (LanguageUtil.l(BaseApplication.getContext()) && zF) {
            convertItemData(R.string.IDS_hwh_motiontrack_warm_up_activation, R.drawable.hw_health_device_warm_up_activation, 0, true, false);
            convertItemData(R.string.IDS_hwh_motiontrack_stretch_relax, R.drawable.hw_health_device_stretch_relax, 7, true, false);
        }
        if (z) {
            convertItemData(R.string.IDS_rope_voicecourse_voice_course, R.drawable.hw_health_device_voice_course, 4, false, true);
        }
        if (z2) {
            convertItemData(R.string.IDS_rope_exclusive_playlists, R.drawable.hw_health_device_exclusive_playlists, 5, false, true);
        }
        if (zC) {
            convertItemData(R.string.IDS_indoor_skipper_interval_training, R.drawable.hw_health_device_interval_training, 2, false, true);
        }
        if (zG) {
            convertItemData(R.string.IDS_indoor_skipper_skipping_setting, R.drawable.hw_health_device_setting, 3, false, true);
        }
        if (zE) {
            convertItemData(R.string.IDS_indoor_skipper_athletics, R.drawable.hw_health_device_multi_player_competition, 6, false, true);
        }
        this.mIsInitSettingMenuView = true;
    }

    private void updateRecyclerViewData(boolean z) {
        if (njy.e(this.mMenuItemBeans)) {
            LogUtil.j(TAG, "updateRecyclerViewData mMenuItemBeans is empty");
            return;
        }
        for (eps epsVar : this.mMenuItemBeans) {
            if (epsVar.f()) {
                epsVar.d(z);
            }
        }
    }

    private void downloadCoursesAndMusicsProfile() {
        if (era.j(this.mProductId)) {
            MediaManager mediaManager = new MediaManager();
            mediaManager.downloadJsonFile(0, true, null);
            mediaManager.downloadJsonFile(1, true, null);
        }
    }

    private void convertItemData(int i, int i2, int i3, boolean z, boolean z2) {
        eps epsVar = new eps();
        epsVar.b(getResources().getString(i));
        epsVar.b(i2);
        epsVar.e(i3);
        epsVar.d(z);
        epsVar.e(z2);
        this.mMenuItemBeans.add(epsVar);
    }

    @Override // com.huawei.ui.commonui.adapter.BaseRecyclerAdapter.OnItemClickListener
    public void onItemClicked(RecyclerHolder recyclerHolder, int i, eps epsVar) {
        if (qrs.r()) {
            LogUtil.j(TAG, "onItemClicked click too fast");
        }
        int iB = epsVar.b();
        if (iB == 0) {
            erj.a(this.mainActivity, this.mCurrentTargetModle, this.mTarget, "Y044");
            tickBiRopeLevel2PageBrowsing(this.mainActivity, "warm_up");
            return;
        }
        switch (iB) {
            case 2:
                if (epsVar.a()) {
                    addFragment(new RopeSkipIntermittentTrainingFragment());
                    tickBiRopeLevel2PageBrowsing(this.mainActivity, "intermittent_setting");
                }
                break;
            case 3:
                if (epsVar.a()) {
                    addFragment(new RopeSkipSettingFragment());
                    tickBiRopeLevel2PageBrowsing(this.mainActivity, "skip_settting");
                }
                break;
            case 4:
                goToVoiceCourseFragment(epsVar.a(), 0);
                break;
            case 5:
                goToVoiceCourseFragment(epsVar.a(), 1);
                break;
            case 6:
                if (epsVar.a()) {
                    etn.c(getContext(), this.mProductId, this.mUniqueId, "#/?type=challengeOthersPage");
                    tickBiRopeLevel2PageBrowsing(this.mainActivity, "multi_player_competition");
                }
                break;
            case 7:
                erj.a(this.mainActivity, this.mCurrentTargetModle, this.mTarget, "Y045");
                tickBiRopeLevel2PageBrowsing(this.mainActivity, "stretch_relax");
                break;
        }
    }

    private void goToVoiceCourseFragment(boolean z, int i) {
        if (z) {
            Bundle bundle = new Bundle();
            VoiceCourseFragment voiceCourseFragment = new VoiceCourseFragment();
            bundle.putInt(MediaManager.KEY_MEDIA_TYPE, i);
            voiceCourseFragment.setArguments(bundle);
            addFragment(voiceCourseFragment);
            tickBiRopeLevel2PageBrowsing(this.mainActivity, i == 0 ? "voice_course" : "exclusive_playlists");
        }
    }

    private void initTypface() {
        if (this.mFontFamilyRegular == null) {
            this.mFontFamilyRegular = Typeface.create(getString(R.string.textFontFamilyRegular), 0);
        }
        if (this.mFontFamilyMedium == null) {
            this.mFontFamilyMedium = Typeface.create(getString(R.string.textFontFamilyMedium), 0);
        }
    }

    private void initMoreMenuData(ehp.d dVar) {
        boolean zEquals;
        boolean zEquals2;
        boolean zD;
        boolean zA;
        boolean z;
        if (this.mIsInitMoreMenuView) {
            LogUtil.a(TAG, "initMoreMenuData is not init again");
            return;
        }
        if (dVar != null) {
            zD = dVar.d();
            zA = dVar.a();
            zEquals2 = dVar.e();
            z = false;
            zEquals = dVar.b() != null;
            if (zEquals && dVar.b().d()) {
                z = true;
            }
        } else {
            zEquals = "yes".equals(era.a("ota", this.mProductId));
            zEquals2 = "true".equals(era.a("isSupportWeight", this.mProductId));
            zD = true;
            zA = true;
            z = true;
        }
        if (zD) {
            this.mMoreMenuList.add(getResources().getString(R.string.IDS_device_wear_home_delete_device));
        }
        if (zEquals) {
            this.mMoreMenuList.add(getResources().getString(R.string.IDS_device_wear_home_device_ota_upgrade));
        }
        if (zA) {
            this.mMoreMenuList.add(getResources().getString(R.string.IDS_device_rope_device_info));
        }
        if (zEquals2) {
            this.mMoreMenuList.add(getResources().getString(R.string.IDS_home_rope_device_authorization));
        }
        if (era.j(this.mProductId) && CommonUtil.ap()) {
            this.mMoreMenuList.add(getResources().getString(R.string.IDS_indoor_skipper_log_collection));
        }
        setOtaRedPoint(z);
        if (njy.e(this.mMoreMenuList)) {
            this.mCustomTitleBar.setRightButtonVisibility(8);
        }
        this.mIsInitMoreMenuView = true;
    }

    @Override // com.huawei.health.ecologydevice.ui.BaseFragment, androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
        LogUtil.a(TAG, "onpause");
        this.mIsActive = false;
    }

    @Override // com.huawei.health.ecologydevice.ui.BaseFragment, androidx.fragment.app.Fragment
    public void onHiddenChanged(boolean z) {
        super.onHiddenChanged(z);
        LogUtil.a(TAG, "onHiddenChanged: ", Boolean.valueOf(z));
        this.mIsActive = !z;
    }

    @Override // com.huawei.health.ecologydevice.ui.measure.fragment.BaseRopeIntroductionFragment
    protected void onDeviceStateChanged() {
        super.onDeviceStateChanged();
        if (this.mRopeDeviceDataManager == null || checkMacAddress()) {
            return;
        }
        boolean z = this.mRopeDeviceDataManager.c() == 2;
        setViewClickable(z);
        if (this.mItemAdapter != null) {
            updateRecyclerViewData(z);
            this.mItemAdapter.refreshDataChange(this.mMenuItemBeans);
        }
        LogUtil.a(TAG, "loadH5SignIn in onDeviceStateChanged");
        this.mRopeCloudAuthManager.c(z);
        fittingDeviceConnect(z);
    }

    private void fittingDeviceConnect(boolean z) {
        if (!this.mIsShowFittingItem) {
            LogUtil.a(TAG, "fittingDeviceConnect mIsShowFittingItem is false");
            return;
        }
        if (TextUtils.isEmpty(this.mFittingUniqueId)) {
            LogUtil.a(TAG, "fittingDeviceConnect mFittingUniqueId is empty");
            initFittingData();
        }
        if (z) {
            if ("STATUS_UNBIND".equals(this.mFittingConnectStatus) || "STATUS_GATT_STATE_CONNECTING".equals(this.mFittingConnectStatus) || emh.b().d(this.mFittingUniqueId)) {
                LogUtil.a(TAG, "fittingDeviceConnect fitting device connected or unbind");
                return;
            }
            LogUtil.a(TAG, "fittingDeviceConnect fitting device connecting");
            this.mFittingConnectStatus = "STATUS_GATT_STATE_CONNECTING";
            emh.b().a(this.mFittingUniqueId, this.mFittingsMessageOrStateCallback);
            biEventForFittingDevice(1);
        } else if (TextUtils.isEmpty(this.mFittingUniqueId)) {
            this.mFittingConnectStatus = "STATUS_UNBIND";
        } else {
            this.mFittingConnectStatus = "STATUS_DIS_CONNECT";
            emh.b().b(this.mFittingUniqueId);
        }
        notifyFittingState();
    }

    @Override // com.huawei.health.ecologydevice.ui.measure.fragment.BaseRopeIntroductionFragment
    protected void selectingAuthorizationFunction() {
        if (this.mRopeDeviceDataManager != null) {
            this.mRopeCloudAuthManager.d();
        }
    }

    @Override // com.huawei.health.ecologydevice.ui.measure.fragment.BaseRopeIntroductionFragment
    protected void updataRopeConfigSetting() {
        super.updataRopeConfigSetting();
        LogUtil.a(TAG, "updataRopeConfigSetting");
        if (this.mRopeDeviceDataManager == null) {
            LogUtil.j(TAG, "updataRopeConfigSetting mRopeDeviceDataManager is null");
        } else {
            this.mRopeCloudAuthManager.c(this.mRopeDeviceDataManager.n());
        }
    }

    @Override // com.huawei.health.ecologydevice.ui.measure.fragment.BaseRopeIntroductionFragment, com.huawei.health.ecologydevice.ui.measure.fragment.ProductFragment, com.huawei.health.ecologydevice.ui.BaseFragment, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        LogUtil.a(TAG, BaseDialog.LIFE_CYCLE_ON_RESUME);
        if (isHidden()) {
            return;
        }
        this.mIsActive = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void checkUserAuthorization() {
        if (this.mRopeDeviceDataManager == null) {
            LogUtil.j(TAG, "onResume mRopeDeviceDataManager is null");
        } else {
            this.mRopeCloudAuthManager.c(this.mRopeDeviceDataManager.c() == 2, this.mRopeDeviceDataManager.n());
        }
    }

    private void setViewClickable(boolean z) {
        this.mRopeStartIv.setClickable(z);
        this.mFreeJumpLayout.setClickable(z);
        this.mNumberJumpLayout.setClickable(z);
        this.mTimeJumpLayout.setClickable(z);
        this.mFancyJumpLayout.setClickable(z);
        float f = z ? 1.0f : TRANS_ALFA;
        this.mRopeModeLayout.setAlpha(f);
        this.mRopeModeLayout.setClickable(z);
        this.mModeChooseLayout.setAlpha(f);
        this.mModeChooseLayout.setClickable(z);
        this.mFittingItem.setAlpha(f);
        this.mFittingItem.setClickable(z);
        this.mFittingConnectLayout.setClickable(z);
    }

    private void initRtLanguageView() {
        if (LanguageUtil.ba(getActivity())) {
            this.mRopeMonthIconRightIv.setBackgroundResource(R.drawable.common_ui_arrow_left);
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (this.mainActivity == null) {
            return;
        }
        if (qrs.c(500)) {
            LogUtil.j(TAG, "onClick click too fast");
            return;
        }
        if (view == this.mRopeStartIv) {
            erj.b(this.mainActivity, this.mCurrentTargetModle, this.mTarget, null, this.mProductId);
            ive.c().d(this.mCurrentTargetModle, this.mTarget);
            return;
        }
        if (view == this.mFreeJumpLayout) {
            freeJumpClick();
            return;
        }
        if (view == this.mTimeJumpLayout) {
            timeJumpClick();
            return;
        }
        if (view == this.mNumberJumpLayout) {
            numberJumpClick();
            return;
        }
        if (view == this.mFancyJumpLayout) {
            fancyJumpClick();
            return;
        }
        if (view == this.mRopeMonthDataLayout) {
            erj.d(this.mainActivity, 283);
            tickBiRopeLevel2PageBrowsing(this.mainActivity, "history_list");
            return;
        }
        if (view == this.mLastRopeLayout) {
            gotoTrackDetailActivity();
            tickBiRopeLevel2PageBrowsing(this.mainActivity, "history_detail");
            biEventForPerformanceDetail();
        } else {
            if (view == this.mFittingItem) {
                String serialNumber = this.mRopeDeviceDataManager.b() == null ? "" : this.mRopeDeviceDataManager.b().getSerialNumber();
                if (TextUtils.isEmpty(this.mFittingProductId)) {
                    erj.b(this.mainActivity, this.mProductId, serialNumber);
                    biEventForFittingDevice(0);
                    return;
                } else {
                    emh.b().b(this.mFittingUniqueId);
                    etn.b(this.mainActivity, this.mFittingProductInfo, this.mFittingProductId, this.mFittingUniqueId, serialNumber);
                    biEventForFittingDevice(2);
                    return;
                }
            }
            if (view == this.mFittingConnectLayout) {
                fittingConnectStatusClick();
            } else {
                LogUtil.j(TAG, "onclick else");
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:25:0x0056  */
    private void fittingConnectStatusClick() {
        byte b2;
        LogUtil.a(TAG, "fittingConnectStatusClick mFittingConnectStatus = ", this.mFittingConnectStatus);
        String str = this.mFittingConnectStatus;
        str.hashCode();
        switch (str) {
            case "STATUS_UNBIND":
                b2 = 0;
                break;
            case "STATUS_DISCOVERY_SERVICE_FAIL":
                b2 = 1;
                break;
            case "STATUS_CONNECT_FAIL":
                b2 = 2;
                break;
            case "STATUS_DIS_CONNECT":
                b2 = 3;
                break;
            case "GATT_ERROR":
                b2 = 4;
                break;
            default:
                b2 = -1;
                break;
        }
        if (b2 == 0) {
            erj.b(this.mainActivity, this.mProductId, this.mRopeDeviceDataManager.b() == null ? "" : this.mRopeDeviceDataManager.b().getSerialNumber());
            biEventForFittingDevice(0);
        } else {
            if (b2 == 1 || b2 == 2 || b2 == 3 || b2 == 4) {
                this.mFittingConnectStatus = "STATUS_GATT_STATE_CONNECTING";
                notifyFittingState();
                emh.b().a(this.mFittingUniqueId, this.mFittingsMessageOrStateCallback);
                biEventForFittingDevice(1);
                return;
            }
            LogUtil.a(TAG, "fittingConnectStatusClick mFittingConnectStatus is other");
        }
    }

    private void biEventForFittingDevice(int i) {
        HashMap map = new HashMap(1);
        map.put("click_type", Integer.valueOf(i));
        lmf.d().c(getContext(), AnalyticsValue.CLICK_FITTING_LIGHT_EFFECT_SETTING.value(), map, 0);
    }

    private void biEventForPerformanceDetail() {
        if (TextUtils.isEmpty(this.mEnduranceAbility)) {
            LogUtil.a(TAG, "biEventForPerformanceDetail mEnduranceAbility is null");
            return;
        }
        try {
            if (Float.parseFloat(this.mEnduranceAbility) > 0.0f) {
                tickBiRopeLevel2PageBrowsing(this.mainActivity, "rope_performance_detail");
            }
        } catch (NumberFormatException unused) {
            LogUtil.e(TAG, "biEventForPerformanceDetail NumberFormatException");
        }
    }

    private void gotoTrackDetailActivity() {
        if (this.mRopeDeviceDataManager == null) {
            return;
        }
        HiHealthData hiHealthDataE = this.mRopeDeviceDataManager.e();
        if (hiHealthDataE == null) {
            LogUtil.a(TAG, "gotoTrackDetailActivity historyData is null");
        } else {
            this.mRopeDeviceDataManager.e(hiHealthDataE.getStartTime(), hiHealthDataE.getEndTime());
        }
    }

    private void fancyJumpClick() {
        if (this.mRopeDeviceDataManager != null) {
            LogUtil.a(TAG, "fancy jump click");
            this.mRopeDeviceDataManager.e(4, new int[0]);
        }
    }

    private void numberJumpClick() {
        if (this.mNumberJumpDialog == null) {
            this.mNumberJumpDialog = new EcologyDevicePickerManager.Builder(this.mainActivity).a(50.0d).e(10000.0d).b(this.mDefaultNum).a(this.mainActivity.getString(R.string.IDS_indoor_skipper_count_jump)).c(R.string.IDS_indoor_skipper_number_target).e(new PickerChooseCallback() { // from class: com.huawei.health.ecologydevice.ui.measure.fragment.SecondRopeIntroductionFragment$$ExternalSyntheticLambda0
                @Override // com.huawei.health.ecologydevice.callback.PickerChooseCallback
                public final void onValueSelected(Object obj, int i) {
                    this.f$0.m1030x1d69684f((Integer) obj, i);
                }
            }).e();
        }
        this.mNumberJumpDialog.e(NUMBER_TARGET_LIST, 5, R.plurals.IDS_indoor_skipper_number_unit_value, this.mNumberSelectIndex);
    }

    /* JADX INFO: renamed from: lambda$numberJumpClick$2$com-huawei-health-ecologydevice-ui-measure-fragment-SecondRopeIntroductionFragment, reason: not valid java name */
    /* synthetic */ void m1030x1d69684f(Integer num, int i) {
        saveTargetData(num.intValue(), i, "rope_skipping_picker_number");
        if (this.mRopeDeviceDataManager != null) {
            LogUtil.a(TAG, "set jumpCount = ", num);
            this.mRopeDeviceDataManager.e(3, new int[]{num.intValue()});
        }
    }

    private void timeJumpClick() {
        if (this.mTimeJumpDialog == null) {
            this.mTimeJumpDialog = new EcologyDevicePickerManager.Builder(this.mainActivity).a(this.mainActivity.getString(R.string.IDS_indoor_skipper_time_jump)).e(era.j(this.mProductId) ? MAXTIME_MILLIS_HIGH : MAXTIME_MILLIS_LOW).a(30).d(this.mDefaultTime).e(new PickerChooseCallback() { // from class: com.huawei.health.ecologydevice.ui.measure.fragment.SecondRopeIntroductionFragment$$ExternalSyntheticLambda2
                @Override // com.huawei.health.ecologydevice.callback.PickerChooseCallback
                public final void onValueSelected(Object obj, int i) {
                    this.f$0.m1032xbab0aa72((Integer) obj, i);
                }
            }).e();
        }
        this.mTimeJumpDialog.e(TIME_TARGET_LIST, 0, R.plurals.IDS_indoor_skipper_time_minute_value, this.mTimeSelectIndex);
    }

    /* JADX INFO: renamed from: lambda$timeJumpClick$3$com-huawei-health-ecologydevice-ui-measure-fragment-SecondRopeIntroductionFragment, reason: not valid java name */
    /* synthetic */ void m1032xbab0aa72(Integer num, int i) {
        saveTargetData(num.intValue(), i, "rope_skipping_picker_time");
        if (this.mRopeDeviceDataManager != null) {
            LogUtil.a(TAG, "set jumpTime = ", num);
            this.mRopeDeviceDataManager.e(2, new int[]{num.intValue()});
        }
    }

    private void saveTargetData(int i, int i2, String str) {
        HashMap map = new HashMap();
        map.put("target_cache_value", Integer.valueOf(i));
        map.put("target_cache_select_index", Integer.valueOf(i2));
        SharedPreferenceManager.c("second_rope_target", str, ofe.c((Object) map));
    }

    private void freeJumpClick() {
        if (this.mRopeDeviceDataManager != null) {
            LogUtil.a(TAG, "free jump click");
            this.mRopeDeviceDataManager.e(1, new int[0]);
        }
    }

    @Override // com.huawei.health.ecologydevice.ui.measure.fragment.BaseRopeIntroductionFragment
    protected void initDefaultRopeView() {
        LogUtil.a(TAG, "initDefaultRopeView()");
        if (this.mRopeHistoryLayout != null) {
            this.mRopeHistoryLayout.setVisibility(8);
        }
    }

    @Override // com.huawei.health.ecologydevice.ui.measure.fragment.BaseRopeIntroductionFragment
    protected void refreshLastRopeDataUi() {
        LogUtil.a(TAG, "refreshLastRopeDataUi()");
        if (this.mRopeHistoryLayout == null) {
            LogUtil.a(TAG, "is not show history record View");
            return;
        }
        if (this.mRopeDeviceDataManager != null) {
            HiHealthData hiHealthDataE = this.mRopeDeviceDataManager.e();
            HiTrackMetaData hiTrackMetaData = (HiTrackMetaData) new Gson().fromJson(JsonSanitizer.sanitize(hiHealthDataE.getMetaData()), HiTrackMetaData.class);
            if (hiTrackMetaData == null) {
                LogUtil.j(TAG, "refreshLastRopeDataUi trackMetaData is null");
                return;
            }
            Map<String, String> extendTrackMap = hiTrackMetaData.getExtendTrackMap();
            if (extendTrackMap == null || extendTrackMap.size() == 0) {
                return;
            }
            this.mRopeHistoryLayout.setVisibility(0);
            String str = extendTrackMap.get("skipSpeed");
            String str2 = extendTrackMap.get("skipNum");
            this.mEnduranceAbility = extendTrackMap.get("enduranceAbilityRank");
            this.mRopeLastCount.setText(UnitUtil.e(CommonUtils.j(str2), 1, 0));
            this.mRopeDataUnit.setText(this.mainActivity.getResources().getQuantityString(R.plurals.IDS_indoor_skipper_number_unit_value, 0, ""));
            this.mRopeAverageData.setText(UnitUtil.e(CommonUtils.j(str), 1, 0));
            this.mSingleSkippingTime.setText(UnitUtil.e((int) (hiTrackMetaData.getTotalTime() / 1000)));
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat(FORMAT_HOUR_MIN, Locale.getDefault());
            long startTime = hiHealthDataE.getStartTime();
            this.mRopeLastTime.setText(simpleDateFormat.format(Long.valueOf(startTime)));
            this.mRopeLastDay.setText(DateUtils.formatDateTime(this.mainActivity, startTime, 8));
            this.mRopeDeviceDataManager.a(this.mainActivity, calNaturalMonthStartTime(startTime, 0), calNaturalMonthStartTime(startTime, 1) - 1000, 283);
        }
    }

    private long calNaturalMonthStartTime(long j, int i) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(new Date(j));
        calendar.add(2, i);
        calendar.set(5, 1);
        calendar.set(11, 0);
        calendar.set(12, 0);
        calendar.set(13, 0);
        return calendar.getTimeInMillis();
    }

    @Override // com.huawei.health.ecologydevice.ui.measure.fragment.BaseRopeIntroductionFragment
    protected void refreshMonthDataUi() {
        LogUtil.a(TAG, "refreshMonthDataUi()");
        if (this.mRopeDeviceDataManager != null) {
            HiHealthData hiHealthDataM = this.mRopeDeviceDataManager.m();
            this.mRopeMonthTotalDesc.setText(formatMonthSumStr(hiHealthDataM));
            this.mRopeLastMonth.setText(DateUtils.formatDateTime(this.mainActivity, hiHealthDataM.getStartTime(), 52));
        }
    }

    private String formatMonthSumStr(HiHealthData hiHealthData) {
        String string;
        double d = hiHealthData.getDouble("Track_Walk_Calorie_Sum");
        double d2 = hiHealthData.getDouble("Track_Walk_Duration_Sum");
        double d3 = hiHealthData.getDouble("Track_Walk_Count_Sum");
        double d4 = hiHealthData.getDouble("Track_Walk_Step_Sum");
        String quantityString = this.mainActivity.getResources().getQuantityString(R.plurals.IDS_indoor_skipper_number_unit_value, (int) d4, UnitUtil.e(d4, 1, 0));
        String quantityString2 = this.mainActivity.getResources().getQuantityString(R.plurals.IDS_details_sleep_latency_times, (int) d3, UnitUtil.e(d3, 1, 0));
        double d5 = d2 / 60000.0d;
        if (d5 > 60.0d) {
            string = this.mainActivity.getResources().getQuantityString(com.huawei.healthcloud.plugintrack.R.plurals.IDS_hour_string, (int) d5, UnitUtil.e(d5 / 60.0d, 1, 1));
        } else {
            string = this.mainActivity.getResources().getString(R.string.IDS_hw_show_set_target_sport_time_unit, UnitUtil.e(d5, 1, 2));
        }
        return this.mainActivity.getResources().getString(R.string.IDS_history_desc_four, quantityString, string, quantityString2, jpq.d(d / 1000.0d));
    }

    @Override // com.huawei.health.ecologydevice.ui.measure.fragment.BaseRopeIntroductionFragment
    protected void updateRopeMode() {
        if (!this.mIsActive) {
            LogUtil.j(TAG, "updateRopeMode the fragment is not active");
            return;
        }
        if (this.mRopeDeviceDataManager == null || this.mainActivity == null) {
            LogUtil.j(TAG, "updateRopeMode mRopeDeviceDataManager is null or mainActivity is null");
            return;
        }
        RopeModeSettingData ropeModeSettingDataJ = this.mRopeDeviceDataManager.j();
        LogUtil.a(TAG, "updateRopeMode code is ", Integer.valueOf(ropeModeSettingDataJ.getOpCode()));
        int opCode = ropeModeSettingDataJ.getOpCode();
        if (opCode == 1) {
            this.mTarget = 0;
            this.mCurrentTargetModle = 6;
            refreshRopeModeLayoutUi();
            return;
        }
        if (opCode == 2) {
            this.mTarget = ropeModeSettingDataJ.getConfigTimeJumpTime();
            this.mCurrentTargetModle = 0;
            refreshRopeModeLayoutUi();
        } else if (opCode == 3) {
            this.mTarget = ropeModeSettingDataJ.getConfigNumberJumpCount();
            this.mCurrentTargetModle = 5;
            refreshRopeModeLayoutUi();
        } else {
            if (opCode != 4) {
                return;
            }
            this.mTarget = 0;
            this.mCurrentTargetModle = 7;
            refreshRopeModeLayoutUi();
        }
    }

    @Override // com.huawei.health.ecologydevice.ui.measure.fragment.BaseRopeIntroductionFragment, com.huawei.health.ecologydevice.callback.RopeDeviceDataListener
    public void onQuaryTrackDetailDataSuccess() {
        MotionPathSimplify motionPathSimplifyI = this.mRopeDeviceDataManager.i();
        if (TextUtils.isEmpty(this.mRopeDeviceDataManager.k())) {
            LogUtil.j(TAG, "gotoTrackDetailActivity fileUrl is null");
            return;
        }
        ive.c().init(BaseApplication.getContext());
        Bundle bundle = new Bundle();
        bundle.putSerializable("simplifyDatakey", motionPathSimplifyI);
        bundle.putString("contentpath", this.mRopeDeviceDataManager.k());
        bundle.putBoolean("isAfterSport", false);
        bundle.putBoolean("isNotNeedDeleteFile", false);
        Intent intent = new Intent(BaseApplication.getContext(), (Class<?>) TrackDetailActivity.class);
        intent.putExtras(bundle);
        intent.addFlags(268435456);
        iov.d(BaseApplication.getContext(), intent);
    }

    @Override // com.huawei.health.ecologydevice.callback.RopeDeviceDataListener
    public void onRopeSportStatusChange(int i) {
        if (i == 1000) {
            checkPermission(this.mFittingProductId);
        } else if (i == 1001) {
            emh.b().b(false);
        } else {
            LogUtil.a(TAG, "sportStatus ", Integer.valueOf(i));
        }
    }

    private void checkPermission(final String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        new HpkPermissionManager(str).a(Scopes.HEALTHKIT_EXTEND_SPORT_READ, new HpkPermissionManager.PermissionAuthenticationListener() { // from class: com.huawei.health.ecologydevice.ui.measure.fragment.SecondRopeIntroductionFragment$$ExternalSyntheticLambda4
            @Override // com.huawei.health.ecologydevice.manager.HpkPermissionManager.PermissionAuthenticationListener
            public final void onResult(boolean z) {
                SecondRopeIntroductionFragment.lambda$checkPermission$4(str, z);
            }
        });
    }

    static /* synthetic */ void lambda$checkPermission$4(String str, boolean z) {
        SharedPreferenceManager.a("ecology_device_module", str, z);
        emh.b().b(z);
    }

    private void refreshRopeModeLayoutUi() {
        LogUtil.a(TAG, "refreshRopeModeLayoutUi currentTargetModle is ", Integer.valueOf(this.mCurrentTargetModle));
        if (this.mCurrentTargetModle == 6) {
            this.mRopeModeValueTv.setVisibility(8);
            this.mRopeModeTv.setText(this.mainActivity.getResources().getString(R.string.IDS_indoor_skipper_free_jump));
            this.mFreeJumpIv.setImageResource(R.drawable.model_device_ic_free_selected);
        } else {
            this.mFreeJumpIv.setImageDrawable(getTintDrawable(R.drawable.rope_device_ic_free_regular, R.color.rope_icon_tint));
        }
        if (this.mCurrentTargetModle == 0) {
            this.mRopeModeValueTv.setVisibility(0);
            this.mRopeModeValueTv.setText(R.string.IDS_indoor_skipper_time_jump);
            this.mRopeModeTv.setText(UnitUtil.e(this.mTarget));
            this.mTimeJumpIv.setImageResource(R.drawable.model_device_ic_time_selected);
        } else {
            this.mTimeJumpIv.setImageDrawable(getTintDrawable(R.drawable.rope_device_ic_time_regular, R.color.rope_icon_tint));
        }
        if (this.mCurrentTargetModle == 5) {
            this.mRopeModeValueTv.setVisibility(0);
            this.mRopeModeValueTv.setText(R.string.IDS_indoor_skipper_count_jump);
            HealthTextView healthTextView = this.mRopeModeTv;
            Resources resources = this.mainActivity.getResources();
            int i = R.plurals.IDS_indoor_skipper_number_value;
            int i2 = this.mTarget;
            healthTextView.setText(resources.getQuantityString(i, i2, Integer.valueOf(i2)));
            this.mNumberJumpIv.setImageResource(R.drawable.model_device_ic_count_selected);
        } else {
            this.mNumberJumpIv.setImageDrawable(getTintDrawable(R.drawable.rope_device_ic_count_regular, R.color.rope_icon_tint));
        }
        if (this.mCurrentTargetModle == 7) {
            this.mRopeModeValueTv.setVisibility(8);
            this.mRopeModeTv.setText(this.mainActivity.getResources().getString(R.string.IDS_indoor_skipper_fancy_jump));
            this.mFancyJumpIv.setImageResource(R.drawable.rope_device_ic_fancy_selected);
        } else {
            this.mFancyJumpIv.setImageDrawable(getTintDrawable(R.drawable.rope_device_ic_fancy_regular, R.color.rope_icon_tint));
        }
        this.mFreeJumpTv.setTypeface(this.mCurrentTargetModle == 6 ? this.mFontFamilyMedium : this.mFontFamilyRegular);
        this.mTimeJumpTv.setTypeface(this.mCurrentTargetModle == 0 ? this.mFontFamilyMedium : this.mFontFamilyRegular);
        this.mNumberJumpTv.setTypeface(this.mCurrentTargetModle == 5 ? this.mFontFamilyMedium : this.mFontFamilyRegular);
        this.mFancyJumpTv.setTypeface(this.mCurrentTargetModle == 7 ? this.mFontFamilyMedium : this.mFontFamilyRegular);
    }

    private Drawable getTintDrawable(int i, int i2) {
        Drawable drawableC = qqf.c(getResources().getDrawable(i), this.mainActivity.getResources().getColor(i2));
        return LanguageUtil.ba(this.mainActivity) ? qqz.e(this.mainActivity, drawableC) : drawableC;
    }

    @Override // com.huawei.health.ecologydevice.ui.measure.fragment.BaseRopeIntroductionFragment
    protected void startReverseControl() {
        if (!this.mIsActive) {
            LogUtil.j(TAG, "startReverseControl the fragment is not active");
        }
        if (this.mainActivity == null || this.mRopeDeviceDataManager == null) {
            LogUtil.j(TAG, "startReverseControl mainActivity is null or mRopeDeviceDataManager is null");
            return;
        }
        LogUtil.a(TAG, "startReverseControl() mode:", Integer.valueOf(this.mCurrentTargetModle), " target:", Integer.valueOf(this.mTarget));
        if (checkMacAddress()) {
            LogUtil.a(TAG, "The current device details page does not belong to this device.");
            return;
        }
        RopeModeSettingData ropeModeSettingDataJ = this.mRopeDeviceDataManager.j();
        switch (ropeModeSettingDataJ.getOpCode()) {
            case 1:
            case 2:
            case 3:
            case 4:
                erj.b(this.mainActivity, this.mCurrentTargetModle, this.mTarget, null, this.mProductId);
                break;
            case 5:
                IntermitentJumpData intermitentJumpData = new IntermitentJumpData();
                intermitentJumpData.setIntermittentJumpMode(ropeModeSettingDataJ.getConfigIntermittentJumpTime() == 0 ? 0 : 1);
                intermitentJumpData.setIntermittentJumpExerciseTime(ropeModeSettingDataJ.getConfigIntermittentJumpTime());
                intermitentJumpData.setIntermittentJumpExerciseNum(ropeModeSettingDataJ.getConfigIntermittentJumpSingleCount());
                intermitentJumpData.setIntermittentJumpBreakTime(ropeModeSettingDataJ.getConfigIntermittentJumpResetTime());
                intermitentJumpData.setIntermittentJumpGroups(ropeModeSettingDataJ.getConfigIntermittentJumpCount());
                erj.b(this.mainActivity, 8, 0, intermitentJumpData, this.mProductId);
                break;
            case 6:
                erj.b(this.mainActivity, 10, ropeModeSettingDataJ.getCourseId(), null, this.mProductId);
                break;
            case 7:
                erj.b(this.mainActivity, 11, ropeModeSettingDataJ.getMusicId(), null, this.mProductId);
                break;
        }
    }

    @Override // com.huawei.health.ecologydevice.ui.measure.fragment.BaseRopeIntroductionFragment, com.huawei.health.ecologydevice.ui.BaseFragment, androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        Observer observer = this.mDeviceAssociateObserver;
        if (observer != null) {
            ObserverManagerUtil.a(observer, "H5_PAGE_EXIT");
            ObserverManagerUtil.a(this.mDeviceAssociateObserver, "H5_UNBIND_DEVICE");
            this.mDeviceAssociateObserver = null;
        }
        RopeCloudAuthManager ropeCloudAuthManager = this.mRopeCloudAuthManager;
        if (ropeCloudAuthManager != null) {
            ropeCloudAuthManager.e();
        }
        if (TextUtils.isEmpty(this.mFittingUniqueId)) {
            return;
        }
        emh.b().b(this.mFittingUniqueId);
    }
}
