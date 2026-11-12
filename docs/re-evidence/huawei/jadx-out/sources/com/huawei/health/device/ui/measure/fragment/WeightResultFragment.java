package com.huawei.health.device.ui.measure.fragment;

import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Message;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import androidx.fragment.app.FragmentActivity;
import com.apprichtap.haptic.base.PrebakedEffectId;
import com.huawei.haf.common.exception.ExceptionUtils;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.health.device.callback.WeightInsertStatusCallback;
import com.huawei.health.device.connectivity.comm.MeasurableDevice;
import com.huawei.health.device.fatscale.multiusers.MultiUsersManager;
import com.huawei.health.device.model.HealthDevice;
import com.huawei.health.device.open.MeasureController;
import com.huawei.health.device.open.MeasureKit;
import com.huawei.health.device.open.data.model.HealthData;
import com.huawei.health.device.ui.DeviceMainActivity;
import com.huawei.health.device.ui.measure.adapter.WeightResultConfirmAdapter;
import com.huawei.health.device.util.EventBus;
import com.huawei.health.device.wifi.lib.handler.StaticHandler;
import com.huawei.health.ecologydevice.manager.ResourceManager;
import com.huawei.health.ecologydevice.ui.BaseFragment;
import com.huawei.health.ecologydevice.ui.measure.fragment.ProductIntroductionFragment;
import com.huawei.hihealth.HiHealthData;
import com.huawei.hihealth.HiSyncOption;
import com.huawei.hihealth.HiUserPreference;
import com.huawei.hihealth.api.HiHealthManager;
import com.huawei.hihealth.api.HiHealthNativeApi;
import com.huawei.hihealth.data.listener.HiAggregateListener;
import com.huawei.hihealth.data.listener.HiCommonListener;
import com.huawei.hihealth.data.type.HiSyncType;
import com.huawei.hihealth.util.HiJsonUtil;
import com.huawei.hms.support.api.entity.pay.HwPayConstant;
import com.huawei.hms.support.feature.result.CommonConstant;
import com.huawei.hwbasemgr.ResponseCallback;
import com.huawei.hwbasemgr.WeightBaseResponseCallback;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwcommonmodel.constants.AnalyticsValue;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.login.ui.login.LoginInit;
import com.huawei.openalliance.ad.constant.Constants;
import com.huawei.operation.ble.BleConstants;
import com.huawei.plugindevice.R;
import com.huawei.ui.commonui.button.HealthButton;
import com.huawei.ui.commonui.dialog.NoTitleCustomAlertDialog;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import defpackage.buh;
import defpackage.dmp;
import defpackage.dne;
import defpackage.dnj;
import defpackage.dof;
import defpackage.dog;
import defpackage.dop;
import defpackage.doq;
import defpackage.dor;
import defpackage.drk;
import defpackage.drw;
import defpackage.dso;
import defpackage.dst;
import defpackage.dwd;
import defpackage.dxm;
import defpackage.dxw;
import defpackage.dyc;
import defpackage.dyj;
import defpackage.dyq;
import defpackage.elh;
import defpackage.enw;
import defpackage.eny;
import defpackage.era;
import defpackage.etn;
import defpackage.idy;
import defpackage.iun;
import defpackage.lsy;
import defpackage.njy;
import defpackage.nkf;
import defpackage.qrs;
import health.compact.a.CommonUtil;
import health.compact.a.LanguageUtil;
import health.compact.a.SharedPreferenceManager;
import health.compact.a.StorageParams;
import health.compact.a.UnitUtil;
import health.compact.a.Utils;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.io.Serializable;
import java.text.NumberFormat;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public class WeightResultFragment extends BaseFragment {
    private static final String ADD_OR_EDIT_USER_ACTIVITY = "com.huawei.ui.main.stories.health.activity.healthdata.AddOrEditWeightUserActivity";
    private static final String ARGUMENTS_KEY = "HealthData";
    private static final double BODY_FAT_DIFFERENCE_TEN = 10.0d;
    private static final double BODY_FAT_DIFFERENCE_THREE = 3.0d;
    private static final int CREATE_NEW_USER_SUCCESS = 101;
    private static final int CREATE_USER_REQUEST_CODE = 0;
    private static final int CREATE_USER_RESULT_CODE = 1;
    private static final int DEFAULT_PADDING = 0;
    private static final String DEVICE_AVAILABLE = "com.huawei.health.action.DEVICE_AVAILABLE";
    private static final int DIALOG_HEAD_AND_BOTTOM_HEIGHT = 84;
    private static final int GET_CURRENT_USER_SUCCESS = 102;
    private static final int GET_TARGET_WEIGHT_SUCCESS = 103;
    private static final int MAX_USER_NUMBER = 10;
    private static final String MEASURE_FOR_PLAN = "measure_weight_for_plan";
    private static final int MEASURE_RESULT_LAGER = 100;
    private static final int MEASURE_RESULT_TYPE_ALL = 2;
    private static final int MEASURE_RESULT_TYPE_ONLY_WEIGHT = 0;
    private static final String TAG = "WeightResultFragment";
    private static final String TAG_RELEASE = "R_Weight_WeightResultFragment";
    private static final String TYPE = "type";
    private static final double WEIGHT_DIFFERENCE_FIVE_KG = 5.0d;
    private static final double WEIGHT_DIFFERENCE_THREE_KG = 3.0d;
    private FrameLayout mAllFrameLayout;
    private HealthTextView mBetweenGoal;
    private HealthTextView mBodyFatResult;
    private NoTitleCustomAlertDialog mCommonTextAlertDialog;
    private Context mContext;
    private dnj mCurrentUser;
    private LinearLayout mCurrentUserLayout;
    private ContentValues mDeviceInfo;
    private View.OnClickListener mDeviceMeasureOnClick;
    private View mDialogView;
    private double mFatRatValue;
    private MyHandler mHandler;
    private HealthData mHealthData;
    private boolean mIsDataException;
    private boolean mIsGotoBaseActivity;
    private volatile boolean mIsSaveData;
    private dnj mNewCreateUser;
    private String mProductId;
    private Resources mResources;
    private LinearLayout mResultLinearLayout;
    private LinearLayout mSelectUserLayout;
    private double mTargetWeightValue;
    private int mType;
    private String mUniqueId;
    private WeightResultConfirmAdapter mUserAdapter;
    private LinearLayout mUserLayout;
    private List<dnj> mUserList;
    private ListView mUserListView;
    private HealthTextView mUserName;
    private ImageView mUserPhoto;
    private double mWeight;

    public WeightResultFragment() {
        Context context = BaseApplication.getContext();
        this.mContext = context;
        this.mResources = context.getResources();
        this.mTargetWeightValue = 0.0d;
        this.mIsGotoBaseActivity = false;
        this.mIsDataException = false;
        this.mHandler = new MyHandler(this);
        this.mDeviceMeasureOnClick = new View.OnClickListener() { // from class: com.huawei.health.device.ui.measure.fragment.WeightResultFragment$$ExternalSyntheticLambda7
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f$0.m915x999a8c25(view);
            }
        };
    }

    /* JADX INFO: renamed from: lambda$new$0$com-huawei-health-device-ui-measure-fragment-WeightResultFragment, reason: not valid java name */
    /* synthetic */ void m915x999a8c25(View view) {
        if (view == null) {
            LogUtil.a(TAG_RELEASE, "WeightResultFragment onClick view is null");
            return;
        }
        if (R.id.bt_device_measure_result_save == view.getId()) {
            if (qrs.r()) {
                LogUtil.a(TAG_RELEASE, "WeightResultFragment saveWeightBtn click too fast");
                return;
            } else {
                saveWeightData(this.mNewCreateUser);
                return;
            }
        }
        if (view.getId() == R.id.weight_result_current_measure_user_right_layout) {
            showConfirmResultDialog(this.mResources.getString(R.string.IDS_hw_device_hygride_select_current_measure_user));
        } else if (view.getId() != R.id.weight_measure_result_confrim_add_new_user_text) {
            LogUtil.j(TAG_RELEASE, "WeightResultFragment mDeviceMeasureOnClick else");
        } else {
            enterAddNewUser();
        }
    }

    @Override // com.huawei.health.ecologydevice.ui.BaseFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        MeasurableDevice measurableDeviceC;
        LogUtil.a(TAG, "WeightResultFragment onCreate");
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.mType = arguments.getInt("type");
            ContentValues contentValues = (ContentValues) getArguments().getParcelable("commonDeviceInfo");
            this.mDeviceInfo = contentValues;
            if (contentValues != null) {
                this.mProductId = contentValues.getAsString("productId");
                this.mUniqueId = this.mDeviceInfo.getAsString("uniqueId");
            } else {
                LogUtil.j(TAG, "initData mDeviceInfo is empty");
            }
            if (TextUtils.isEmpty(this.mProductId)) {
                LogUtil.j(TAG, "initData mProductId is empty");
                this.mProductId = getArguments().getString("productId");
            }
            if (!TextUtils.isEmpty(this.mProductId) && TextUtils.isEmpty(this.mUniqueId) && (measurableDeviceC = dmp.d().c(this.mProductId, false)) != null) {
                this.mUniqueId = measurableDeviceC.getUniqueId();
            }
            if (TextUtils.isEmpty(this.mProductId)) {
                this.mProductId = getArguments().getString("productId");
            }
            if (TextUtils.isEmpty(this.mProductId) || TextUtils.isEmpty(this.mUniqueId)) {
                LogUtil.j(TAG, "initData mProductId or mUniqueId is empty");
            }
        }
        lsy.a(new Runnable() { // from class: com.huawei.health.device.ui.measure.fragment.WeightResultFragment$$ExternalSyntheticLambda10
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.m916x8a1d6e1b();
            }
        });
        getCurGoalInfo();
    }

    /* JADX INFO: renamed from: lambda$onCreate$1$com-huawei-health-device-ui-measure-fragment-WeightResultFragment, reason: not valid java name */
    /* synthetic */ void m916x8a1d6e1b() {
        HiUserPreference userPreference = HiHealthManager.d(this.mContext).getUserPreference("custom.start_weight_base");
        if (userPreference != null) {
            MultiUsersManager.INSTANCE.getMainUser().a(CommonUtil.f(userPreference.getValue()));
        }
    }

    private void getCurGoalInfo() {
        nkf.a().a(new ResponseCallback<Float>() { // from class: com.huawei.health.device.ui.measure.fragment.WeightResultFragment.1
            @Override // com.huawei.hwbasemgr.ResponseCallback
            public void onResponse(int i, Float f) {
                LogUtil.j(WeightResultFragment.TAG, "getCurGoalInfo data ", f);
                if (f == null) {
                    return;
                }
                try {
                    WeightResultFragment.this.mTargetWeightValue = Double.parseDouble(String.valueOf(f));
                } catch (NumberFormatException e) {
                    ReleaseLogUtil.d(WeightResultFragment.TAG, "getCurGoalInfo NumberFormatException: ", ExceptionUtils.c(e));
                }
                WeightResultFragment.this.mHandler.sendEmptyMessage(103);
            }
        });
    }

    private void getCurrentUserInfo() {
        MultiUsersManager.INSTANCE.setIsCheckMainUser(true);
        FragmentActivity activity = getActivity();
        if ((activity instanceof DeviceMainActivity) && ((DeviceMainActivity) activity).g()) {
            ThreadPoolManager.c().execute(new Runnable() { // from class: com.huawei.health.device.ui.measure.fragment.WeightResultFragment$$ExternalSyntheticLambda4
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.m911xd6e22add();
                }
            });
        } else {
            MultiUsersManager.INSTANCE.getCurrentUser(new WeightBaseResponseCallback() { // from class: com.huawei.health.device.ui.measure.fragment.WeightResultFragment$$ExternalSyntheticLambda5
                @Override // com.huawei.hwbasemgr.WeightBaseResponseCallback
                public final void onResponse(int i, Object obj) {
                    this.f$0.m912xb2a3a69e(i, (dnj) obj);
                }
            });
        }
    }

    /* JADX INFO: renamed from: lambda$getCurrentUserInfo$2$com-huawei-health-device-ui-measure-fragment-WeightResultFragment, reason: not valid java name */
    /* synthetic */ void m911xd6e22add() {
        this.mCurrentUser = MultiUsersManager.INSTANCE.getMainUser();
        MultiUsersManager.INSTANCE.setCurrentUser(this.mCurrentUser);
        this.mHandler.sendEmptyMessage(102);
    }

    /* JADX INFO: renamed from: lambda$getCurrentUserInfo$3$com-huawei-health-device-ui-measure-fragment-WeightResultFragment, reason: not valid java name */
    /* synthetic */ void m912xb2a3a69e(int i, dnj dnjVar) {
        if (dnjVar != null && i == 0) {
            this.mCurrentUser = dnjVar;
            this.mHandler.sendEmptyMessage(102);
        } else {
            LogUtil.j(TAG, "WeightResultFragment getCurrentUserInfo getCurrentUser fail, errorCode:", Integer.valueOf(i));
        }
    }

    @Override // com.huawei.health.ecologydevice.ui.BaseFragment, androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.mIsSaveData = false;
        if (this.mainActivity != null) {
            this.mainActivity.getWindow().clearFlags(128);
        }
        if (layoutInflater == null || viewGroup == null) {
            LogUtil.j(TAG_RELEASE, "InterruptedException onCreateView inflater is null");
            return null;
        }
        ViewGroup viewGroup2 = super.onCreateView(layoutInflater, viewGroup, bundle) instanceof ViewGroup ? (ViewGroup) super.onCreateView(layoutInflater, viewGroup, bundle) : null;
        this.child = layoutInflater.inflate(R.layout.device_weight_measure_result, viewGroup, false);
        if (viewGroup2 != null) {
            viewGroup2.addView(this.child);
        }
        if (getArguments() != null && (getArguments().getSerializable(ARGUMENTS_KEY) instanceof HealthData)) {
            this.mHealthData = (HealthData) getArguments().getSerializable(ARGUMENTS_KEY);
        }
        initChildView();
        LogUtil.d(TAG, "WeightResultFragment onCreateView productId is ", this.mProductId);
        if (this.mProductId != null) {
            initProdInfo();
        }
        String string = getArguments().getString("title");
        if (!TextUtils.isEmpty(string) && string.indexOf(" - ") == -1) {
            String strH = dxm.h(this.mUniqueId);
            if (!TextUtils.isEmpty(strH)) {
                string = string + Constants.LINK + strH;
            }
        }
        setTitle(string);
        if (dxm.ar(this.mProductId) && !Utils.k()) {
            getUserLastData();
        }
        return viewGroup2;
    }

    private void initProdInfo() {
        dyj.c(this.mProductId);
        LogUtil.a(TAG, "blue test sendWeightDetailSyncSuccessBroadcast");
        dxm.c(dxw.d(), this.mProductId, this.mUniqueId);
    }

    private void initChildView() {
        if (this.child != null) {
            this.mAllFrameLayout = (FrameLayout) this.child.findViewById(R.id.device_measure_result_top_circle);
            this.mResultLinearLayout = (LinearLayout) this.child.findViewById(R.id.tv_weight_measure_result);
            this.mCurrentUserLayout = (LinearLayout) this.child.findViewById(R.id.weight_result_user_layout);
            this.mSelectUserLayout = (LinearLayout) this.child.findViewById(R.id.weight_result_current_measure_user_right_layout);
            this.mUserPhoto = (ImageView) this.child.findViewById(R.id.weight_result_current_measure_user_photo);
            this.mUserName = (HealthTextView) this.child.findViewById(R.id.weight_result_current_measure_user_name);
            this.mBetweenGoal = (HealthTextView) this.child.findViewById(R.id.tv_sugar_measure_result_msg);
            this.mBodyFatResult = (HealthTextView) this.child.findViewById(R.id.tv_body_fat_value);
            HealthButton healthButton = (HealthButton) this.child.findViewById(R.id.bt_device_measure_result_remeasure);
            healthButton.setVisibility(8);
            healthButton.setOnClickListener(this.mDeviceMeasureOnClick);
            HealthButton healthButton2 = (HealthButton) this.child.findViewById(R.id.bt_device_measure_result_save);
            healthButton2.setText(R.string.IDS_device_show_complete);
            healthButton2.setOnClickListener(this.mDeviceMeasureOnClick);
            getCurrentUserInfo();
        }
    }

    private dwd parseData(HealthData healthData) {
        String string;
        dwd dwdVar = new dwd();
        if (healthData instanceof dso) {
            dso dsoVar = (dso) healthData;
            this.mWeight = CommonUtil.a("" + dsoVar.getWeight());
            this.mFatRatValue = CommonUtil.a("" + dsoVar.getBodyFatRat());
        }
        dwdVar.b(UnitUtil.e(this.mWeight, 1, 2));
        if (this.mFatRatValue <= 0.0d) {
            string = this.mResources.getString(R.string.IDS_device_measure_weight_defualt_value);
            dwdVar.a(this.mResources.getColor(R.color.hw_device_measure_weight_bodyfat_zero_result));
        } else {
            NumberFormat percentInstance = NumberFormat.getPercentInstance();
            percentInstance.setMinimumFractionDigits(1);
            string = percentInstance.format(this.mFatRatValue / 100.0d);
            dwdVar.a(this.mResources.getColor(R.color.hw_device_measure_bottom_inside_circle_msg_color));
        }
        dwdVar.a(string);
        LogUtil.d(TAG, "WeightResultFragment parseData mTargetWeightValue is ", Double.valueOf(this.mTargetWeightValue));
        showViewValue(dwdVar);
        return dwdVar;
    }

    private void showViewValue(dwd dwdVar) {
        String quantityString;
        if (eny.a().e() > 3) {
            dwdVar.d("");
            return;
        }
        double d = this.mTargetWeightValue;
        double d2 = this.mWeight;
        double dAbs = Math.abs(UnitUtil.d(d2, dyq.b(d2, this.mProductId)) - d);
        if (UnitUtil.f()) {
            double dH = UnitUtil.h(dAbs);
            quantityString = this.mResources.getQuantityString(R.plurals.IDS_lb_string, UnitUtil.e(dH), UnitUtil.e(dH, 1, dyq.b(UnitUtil.h(this.mWeight), this.mProductId)));
        } else {
            quantityString = this.mResources.getQuantityString(R.plurals.IDS_kg_string, UnitUtil.e(dAbs), UnitUtil.e(dAbs, 1, dyq.b(this.mWeight, this.mProductId)));
        }
        String str = quantityString;
        dnj dnjVar = this.mCurrentUser;
        if (dnjVar == null) {
            LogUtil.j(TAG, "showViewValue mCurrentUser is null");
        } else {
            dwdVar.d(etn.d(this.mWeight, dnjVar.f(), d, str));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void initViewData() {
        if (this.mHealthData == null) {
            LogUtil.j(TAG, "initViewData mHealthData is null");
            return;
        }
        dnj dnjVar = this.mCurrentUser;
        if (dnjVar == null || dnjVar.m() != 1) {
            setViewData(parseData(this.mHealthData));
        } else if (MultiUsersManager.INSTANCE.getMainUser().f() > 0.0f) {
            setViewData(parseData(this.mHealthData));
        } else {
            lsy.a(new Runnable() { // from class: com.huawei.health.device.ui.measure.fragment.WeightResultFragment$$ExternalSyntheticLambda6
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.m914x5daaca03();
                }
            });
        }
    }

    /* JADX INFO: renamed from: lambda$initViewData$5$com-huawei-health-device-ui-measure-fragment-WeightResultFragment, reason: not valid java name */
    /* synthetic */ void m914x5daaca03() {
        HiUserPreference userPreference = HiHealthManager.d(this.mContext).getUserPreference("custom.start_weight_base");
        if (userPreference != null) {
            MultiUsersManager.INSTANCE.getMainUser().a(CommonUtil.f(userPreference.getValue()));
        }
        if (this.mainActivity == null) {
            LogUtil.j(TAG, "initViewData mainActivity is null");
        } else {
            this.mainActivity.runOnUiThread(new Runnable() { // from class: com.huawei.health.device.ui.measure.fragment.WeightResultFragment$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.m913x81e94e42();
                }
            });
        }
    }

    /* JADX INFO: renamed from: lambda$initViewData$4$com-huawei-health-device-ui-measure-fragment-WeightResultFragment, reason: not valid java name */
    /* synthetic */ void m913x81e94e42() {
        setViewData(parseData(this.mHealthData));
    }

    private void setViewData(dwd dwdVar) {
        if (dwdVar != null) {
            setWeightResultText();
            this.mBetweenGoal.setText(dwdVar.b());
            this.mBodyFatResult.setText(dwdVar.e());
            this.mBodyFatResult.setTextColor(dwdVar.d());
            dnj dnjVar = this.mCurrentUser;
            if (dnjVar == null || dnjVar.m() != 1) {
                this.mBetweenGoal.setVisibility(8);
            } else {
                this.mBetweenGoal.setVisibility(0);
            }
            if (this.mTargetWeightValue == 0.0d) {
                this.mBetweenGoal.setVisibility(8);
            }
            setUserNameAndPhoto();
        }
        initViewTahiti();
        initMirrorView();
        if (!dxm.ar(this.mProductId) || Utils.k()) {
            this.mCurrentUserLayout.setVisibility(8);
        }
    }

    private void setUserNameAndPhoto() {
        LogUtil.a(TAG, "setUserNameAndPhoto enter");
        if (this.mCurrentUser == null) {
            LogUtil.j(TAG, "setUserNameAndPhoto mCurrentUser is null");
            this.mSelectUserLayout.setVisibility(8);
        } else {
            this.mSelectUserLayout.setVisibility(0);
            dyc.c(this.mCurrentUser, this.mUserName, this.mUserPhoto);
        }
    }

    private void setWeightResultText() {
        HealthTextView healthTextView = (HealthTextView) this.child.findViewById(R.id.tv_weight_mearsure_result_value);
        HealthTextView healthTextView2 = (HealthTextView) this.child.findViewById(R.id.tv_weight_mearsure_result_value_unit);
        HealthTextView healthTextView3 = (HealthTextView) this.child.findViewById(R.id.tv_weight_mearsure_result_value_unit_sw);
        if (UnitUtil.f()) {
            showAfterUnit(healthTextView3, healthTextView2);
            healthTextView.setText(UnitUtil.e(UnitUtil.h(this.mWeight), 1, dyq.b(this.mWeight, this.mProductId)));
            healthTextView2.setText(R.string.IDS_device_measure_weight_value_unit_eng);
            return;
        }
        double d = this.mWeight;
        String strE = UnitUtil.e(d, 1, dyq.b(d, this.mProductId));
        String strTrim = this.mContext.getResources().getQuantityString(R.plurals.IDS_kg_string, (int) this.mWeight, strE).replace(strE, "").trim();
        if (healthTextView == null) {
            LogUtil.j(TAG, "setWeightResultText weightResult is null");
        } else {
            healthTextView.setText(strE);
        }
        if (healthTextView2 == null) {
            LogUtil.j(TAG, "setWeightResultText weightResultUnit is null");
        } else {
            healthTextView2.setText(strTrim);
        }
        if (healthTextView3 == null) {
            LogUtil.j(TAG, "setWeightResultText weightResultUnitSw is null");
        } else {
            healthTextView3.setText(strTrim);
        }
        if (LanguageUtil.aj(this.mContext)) {
            showBeforeUnit(healthTextView3, healthTextView2);
        } else {
            showAfterUnit(healthTextView3, healthTextView2);
        }
    }

    private void showBeforeUnit(HealthTextView healthTextView, HealthTextView healthTextView2) {
        healthTextView.setVisibility(0);
        healthTextView2.setVisibility(8);
    }

    private void showAfterUnit(HealthTextView healthTextView, HealthTextView healthTextView2) {
        if (healthTextView == null) {
            LogUtil.j(TAG, "showAfterUnit beforeValue is null");
        } else {
            healthTextView.setVisibility(8);
        }
        if (healthTextView2 == null) {
            LogUtil.j(TAG, "showAfterUnit afterValue is null");
        } else {
            healthTextView2.setVisibility(0);
        }
    }

    private void initMirrorView() {
        ImageView imageView = (ImageView) this.child.findViewById(R.id.weight_result_current_measure_user_right_img);
        if (imageView != null) {
            if (LanguageUtil.ba(this.mContext)) {
                imageView.setBackground(this.mResources.getDrawable(R.drawable.common_ui_arrow_left));
            } else {
                imageView.setBackground(this.mResources.getDrawable(R.drawable.common_ui_arrow_right));
            }
            imageView.setVisibility(8);
        }
    }

    @Override // com.huawei.health.ecologydevice.ui.BaseFragment
    public void initViewTahiti() {
        super.initViewTahiti();
        if (qrs.af(this.mContext)) {
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, 0, 0.5f);
            layoutParams.gravity = 1;
            this.mResultLinearLayout.setLayoutParams(layoutParams);
            this.mAllFrameLayout.setLayoutParams(layoutParams);
        }
    }

    private void saveWeightData(dnj dnjVar) {
        LogUtil.a(TAG, "WeightResultFragment click saveWeightBtn and save data");
        Bundle arguments = getArguments();
        if (arguments == null) {
            LogUtil.j(TAG_RELEASE, "WeightResultFragment saveWeightData argumentBundle is null");
            return;
        }
        MeasurableDevice measurableDeviceB = dmp.d().b(this.mUniqueId, true);
        if (measurableDeviceB == null) {
            LogUtil.a(TAG_RELEASE, "saveWeightData Failed device null");
            return;
        }
        String strE = buh.e(MEASURE_FOR_PLAN);
        if (strE != null && strE.equals("true")) {
            dyj.b();
            buh.c(MEASURE_FOR_PLAN);
        }
        setUserInfo(dnjVar);
        if (TextUtils.isEmpty(this.mProductId)) {
            LogUtil.a(TAG, "saveWeightData Failed mProductId null");
            return;
        }
        saveWeightData(this.mProductId, arguments, measurableDeviceB, refreshUserAge(dnjVar));
        elh elhVarD = ResourceManager.c().d(this.mProductId);
        if (elhVarD == null) {
            LogUtil.j(TAG, "productInfo is null");
            return;
        }
        MeasureKit measureKitI = drw.e().i(elhVarD.q());
        if (measureKitI != null) {
            MeasureController measureController = measureKitI.getMeasureController();
            Bundle bundle = new Bundle();
            bundle.putString("productId", this.mProductId);
            bundle.putInt("type", this.mType);
            if (measureController != null) {
                measureController.prepare(measurableDeviceB, null, bundle);
            }
        } else {
            LogUtil.j(TAG, "saveWeightData kit is null");
        }
        drw.e().d(this.mProductId, this.mUniqueId, this.mType);
    }

    private dnj refreshUserAge(dnj dnjVar) {
        if (dnjVar != null) {
            dnjVar.e(dor.a(dnjVar.j(), dnjVar.c()));
            return dnjVar;
        }
        if (this.mCurrentUser == null) {
            return MultiUsersManager.INSTANCE.getCurrentUser();
        }
        dnj singleUserById = MultiUsersManager.INSTANCE.getSingleUserById(this.mCurrentUser.i());
        if (singleUserById != null) {
            singleUserById.e(dor.a(singleUserById.j(), singleUserById.c()));
        }
        return singleUserById;
    }

    private void setUserInfo(dnj dnjVar) {
        if (dnjVar == null) {
            LogUtil.a(TAG, "setUserInfo : user is null send to currentUser");
            MultiUsersManager.INSTANCE.getCurrentUser(new WeightBaseResponseCallback() { // from class: com.huawei.health.device.ui.measure.fragment.WeightResultFragment$$ExternalSyntheticLambda8
                @Override // com.huawei.hwbasemgr.WeightBaseResponseCallback
                public final void onResponse(int i, Object obj) {
                    this.f$0.m918xc0ceae26(i, (dnj) obj);
                }
            });
        } else {
            processUserInfo(dnjVar);
        }
    }

    /* JADX INFO: renamed from: lambda$setUserInfo$6$com-huawei-health-device-ui-measure-fragment-WeightResultFragment, reason: not valid java name */
    /* synthetic */ void m918xc0ceae26(int i, dnj dnjVar) {
        if (dnjVar != null && i == 0) {
            processUserInfo(dnjVar);
        } else {
            LogUtil.j(TAG, "setUserInfo : currentUser is null return");
        }
    }

    private void processUserInfo(dnj dnjVar) {
        String strK;
        String accountInfo;
        if (Utils.h()) {
            accountInfo = LoginInit.getInstance(BaseApplication.getContext()).getAccountInfo(1011);
            strK = dnjVar.i();
        } else {
            strK = doq.e().k();
            accountInfo = "0";
        }
        Bundle bundle = new Bundle();
        bundle.putString("huid", accountInfo);
        bundle.putString("uid", strK);
        bundle.putInt("height", dnjVar.e());
        bundle.putInt(CommonConstant.KEY_GENDER, dnjVar.d());
        bundle.putInt("age", dnjVar.c());
        bundle.putInt("birthday", dnjVar.j());
        double d = this.mWeight;
        bundle.putFloat("weight", CommonUtil.f(UnitUtil.e(d, 1, dyq.b(d, this.mProductId))));
        if (drk.b(this.mUniqueId, 43)) {
            if (this.mFatRatValue <= 0.0d) {
                bundle.putInt("guestUser", 0);
            } else {
                bundle.putInt("guestUser", 2);
            }
        }
        LogUtil.d(TAG, bundle.toString());
        EventBus.a(new EventBus.d("weight_measure_set_user", bundle));
    }

    private void saveWeightData(String str, Bundle bundle, HealthDevice healthDevice, final dnj dnjVar) {
        enw enwVar;
        if (dnjVar == null) {
            LogUtil.j(TAG, "saveWeightData user is null");
            enwVar = new enw(10006);
        } else {
            MultiUsersManager.INSTANCE.setCurrentUser(dnjVar);
            enwVar = new enw(dnjVar, 10006);
        }
        if (healthDevice instanceof MeasurableDevice) {
            ((MeasurableDevice) healthDevice).setProductId(this.mProductId);
        }
        if (bundle == null) {
            LogUtil.j(TAG, "WeightResultFragment saveWeightData argumentBundle is null");
            return;
        }
        Serializable serializable = bundle.getSerializable(ARGUMENTS_KEY);
        if (serializable instanceof HealthData) {
            final HealthData healthData = (HealthData) serializable;
            final long jCurrentTimeMillis = System.currentTimeMillis();
            enwVar.e(new WeightInsertStatusCallback() { // from class: com.huawei.health.device.ui.measure.fragment.WeightResultFragment$$ExternalSyntheticLambda9
                @Override // com.huawei.health.device.callback.WeightInsertStatusCallback
                public final void isSuccess(boolean z) {
                    this.f$0.m917x358478c5(healthData, dnjVar, jCurrentTimeMillis, z);
                }
            });
            enwVar.onDataChanged(healthDevice, healthData);
            saveHagrideMeasureTime(str, healthData);
            sendBiEvent(dnjVar);
            return;
        }
        ReleaseLogUtil.e(TAG_RELEASE, "WeightResultFragment serializable is error");
        goWeightManagementPage();
    }

    /* JADX INFO: renamed from: lambda$saveWeightData$7$com-huawei-health-device-ui-measure-fragment-WeightResultFragment, reason: not valid java name */
    /* synthetic */ void m917x358478c5(HealthData healthData, dnj dnjVar, long j, boolean z) {
        if (!z) {
            ReleaseLogUtil.e(TAG_RELEASE, "WeightResultFragment insert data fail");
        } else {
            syncData();
            drw.e().c(this.mProductId, DEVICE_AVAILABLE);
        }
        if (this.mIsSaveData) {
            return;
        }
        this.mIsSaveData = true;
        goMeasurementDataPage(healthData, dnjVar);
        ReleaseLogUtil.d(TAG_RELEASE, "save end totalTime = ", Long.valueOf(System.currentTimeMillis() - j));
    }

    private void goMeasurementDataPage(HealthData healthData, dnj dnjVar) {
        Bundle extras;
        if (dnjVar == null) {
            LogUtil.j(TAG, "goMeasurementDataPage user is null");
            dnjVar = MultiUsersManager.INSTANCE.getCurrentUser();
        }
        HashMap map = new HashMap();
        map.put("isFromMeasureResult", true);
        map.put("isTripartiteDevice", Boolean.valueOf(checkIsTripartiteDevice()));
        map.put("startTime", Long.valueOf(healthData.getStartTime()));
        map.put("endTime", Long.valueOf(healthData.getEndTime()));
        map.put("metadata", dne.d(dnjVar.i()) ? "" : dnjVar.i());
        FragmentActivity activity = getActivity();
        if (activity != null && activity.getIntent() != null && (extras = activity.getIntent().getExtras()) != null && extras.getBoolean("isForResult", false)) {
            map.put("uniqueId", this.mUniqueId);
            map.put("productId", this.mProductId);
            Intent intent = new Intent();
            String strD = HiJsonUtil.d(map);
            intent.putExtra("result", strD);
            activity.setResult(-1, intent);
            ReleaseLogUtil.d(TAG, "goMeasurementDataPage onActivityResult json: ", strD);
            activity.finish();
            return;
        }
        iun.d(map);
        ReleaseLogUtil.d(TAG, "goMeasurementDataPage goToWeightDataPage map: ", String.valueOf(map));
        this.mIsGotoBaseActivity = true;
    }

    private void goWeightManagementPage() {
        String str;
        Intent intent = new Intent();
        intent.setPackage(BaseApplication.getAppPackage());
        intent.putExtra("healthdata", "MyHealthData_jump_mainActivity");
        intent.putExtra("base_health_data_type_key", 1);
        intent.putExtra("type", this.mType);
        intent.putExtra("weight_user_id", MultiUsersManager.INSTANCE.getCurrentUser().i());
        intent.putExtra("isFromMeasureResult", true);
        intent.putExtra("isTripartiteDevice", checkIsTripartiteDevice());
        DeviceMainActivity deviceMainActivity = (DeviceMainActivity) getActivity();
        if (deviceMainActivity != null && deviceMainActivity.g()) {
            str = "6";
            idy.a(AnalyticsValue.HEALTH_HOME_WIGHT_DETAIL_2010023.value(), "6");
        } else {
            str = "";
        }
        this.mIsGotoBaseActivity = true;
        LogUtil.a(TAG, "goWeightManagementPage");
        iun.d(str, intent);
    }

    private boolean checkIsTripartiteDevice() {
        if (this.mProductId == null) {
            return true;
        }
        elh elhVarD = ResourceManager.c().d(this.mProductId);
        if (elhVarD == null || elhVarD.l() == null) {
            LogUtil.j(TAG, "checkIsTripartiteDevice productInfo is null or productInfo.getManifest is null");
            return true;
        }
        String strC = elhVarD.l().c();
        if (!"huawei".equalsIgnoreCase(strC) && !"honor".equalsIgnoreCase(strC) && !"hygride".equalsIgnoreCase(strC)) {
            return true;
        }
        LogUtil.a(TAG, "isHuaweiOrHonor");
        return false;
    }

    private void saveHagrideMeasureTime(String str, HealthData healthData) {
        if (TextUtils.isEmpty(str)) {
            LogUtil.j(TAG_RELEASE, "saveHagrideMeasureTime productId is null");
            return;
        }
        LogUtil.a(TAG, "saveHagrideMeasureTime productId:", str);
        if (!dxm.ar(str) || healthData.getStartTime() == 0) {
            return;
        }
        LogUtil.a(TAG, "saveHagrideMeasureTime time:", Long.valueOf(healthData.getStartTime()));
        SharedPreferenceManager.e(BaseApplication.getContext(), Integer.toString(PrebakedEffectId.RT_HEARTBEAT), "health_wifi_notify_TIMESTAMP", String.valueOf(healthData.getStartTime()), new StorageParams());
    }

    @Override // com.huawei.health.ecologydevice.ui.BaseFragment, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        DeviceMainActivity deviceMainActivity = (DeviceMainActivity) getActivity();
        if (!this.mIsGotoBaseActivity || deviceMainActivity == null) {
            return;
        }
        popupFragment(deviceMainActivity.e());
    }

    @Override // com.huawei.health.ecologydevice.ui.BaseFragment, androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
        if (this.mIsGotoBaseActivity) {
            popupFragment(HagridDeviceManagerFragment.class);
            this.mIsGotoBaseActivity = false;
        }
    }

    private void writeDataBack() {
        LogUtil.a(TAG, "WeightResultFragment writeDataBack..");
        MultiUsersManager.INSTANCE.getCurrentUser(new WeightBaseResponseCallback() { // from class: com.huawei.health.device.ui.measure.fragment.WeightResultFragment$$ExternalSyntheticLambda1
            @Override // com.huawei.hwbasemgr.WeightBaseResponseCallback
            public final void onResponse(int i, Object obj) {
                this.f$0.m921xcd82997d(i, (dnj) obj);
            }
        });
    }

    /* JADX INFO: renamed from: lambda$writeDataBack$8$com-huawei-health-device-ui-measure-fragment-WeightResultFragment, reason: not valid java name */
    /* synthetic */ void m921xcd82997d(int i, dnj dnjVar) {
        if (dnjVar != null && i == 0) {
            writeUserInfoBean(dnjVar);
        } else {
            LogUtil.j(TAG, "writeDataBack : currentUser is null return");
            dof.d().b(dog.a(new dop()));
        }
    }

    private void writeUserInfoBean(dnj dnjVar) {
        dop dopVar = new dop();
        dopVar.b(dnjVar.i());
        dopVar.a(dnjVar.c());
        dopVar.d(dnjVar.e());
        if (dnjVar.r() > 0.0f) {
            dopVar.b(dnjVar.r());
        } else {
            dopVar.b(60.0f);
        }
        if (dnjVar.d() == 1 || dnjVar.d() == 2) {
            dopVar.c(0);
        } else {
            dopVar.c(1);
        }
        dof.d().b(dog.a(dopVar));
    }

    @Override // com.huawei.health.ecologydevice.ui.BaseFragment
    public void saveResultData() {
        super.saveResultData();
        saveWeightData(this.mNewCreateUser);
    }

    @Override // com.huawei.health.ecologydevice.ui.BaseFragment
    public void release() {
        super.release();
        DeviceMainActivity deviceMainActivity = (DeviceMainActivity) getActivity();
        String str = this.mProductId;
        if (str != null && dxm.ab(str) && !dxm.ag(this.mProductId)) {
            writeDataBack();
        }
        if (this.mType == -1 && deviceMainActivity != null) {
            popupFragment(deviceMainActivity.e());
        } else {
            popupFragment(ProductIntroductionFragment.class);
        }
        onDestroy();
    }

    @Override // com.huawei.health.ecologydevice.ui.BaseFragment
    public boolean onBackPressed() {
        return super.showCustomAlertDialog(R.string.IDS_device_cancel_save_data);
    }

    private void syncData() {
        HiSyncOption hiSyncOption = new HiSyncOption();
        hiSyncOption.setSyncModel(2);
        hiSyncOption.setSyncAction(0);
        hiSyncOption.setSyncDataType(HiSyncType.HiSyncDataType.f12263a);
        hiSyncOption.setSyncScope(1);
        hiSyncOption.setSyncMethod(2);
        HiHealthNativeApi.a(dxw.d()).synCloud(hiSyncOption, new HiCommonListener() { // from class: com.huawei.health.device.ui.measure.fragment.WeightResultFragment.2
            @Override // com.huawei.hihealth.data.listener.HiCommonListener
            public void onSuccess(int i, Object obj) {
                LogUtil.a(WeightResultFragment.TAG, "syncDataStart onSuccess");
            }

            @Override // com.huawei.hihealth.data.listener.HiCommonListener
            public void onFailure(int i, Object obj) {
                LogUtil.a(WeightResultFragment.TAG_RELEASE, "syncDataStart onFailure");
            }
        });
    }

    private void getUserLastData() {
        dne.d(this.mCurrentUser, new HiAggregateListener() { // from class: com.huawei.health.device.ui.measure.fragment.WeightResultFragment.3
            @Override // com.huawei.hihealth.data.listener.HiAggregateListener
            public void onResult(List<HiHealthData> list, int i, int i2) {
                LogUtil.a(WeightResultFragment.TAG, "getUserLastData onResult called errorCode:", Integer.valueOf(i));
                WeightResultFragment.this.compareWeightData(list);
            }

            @Override // com.huawei.hihealth.data.listener.HiAggregateListener
            public void onResultIntent(int i, List<HiHealthData> list, int i2, int i3) {
                LogUtil.a(WeightResultFragment.TAG, "getUserLastData onResultIntent called errorCode:", Integer.valueOf(i2));
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void compareWeightData(List<HiHealthData> list) {
        double d;
        double d2;
        if (list == null || list.isEmpty()) {
            LogUtil.j(TAG_RELEASE, "compareWeightData getWeight no data");
            return;
        }
        HiHealthData hiHealthData = list.get(0);
        double d3 = hiHealthData.getDouble("bodyWeight");
        double d4 = hiHealthData.getDouble(BleConstants.BODY_FAT_RATE);
        LogUtil.a(TAG, "compareWeightData weight = ", Double.valueOf(d3), " bodyfat = ", Double.valueOf(d4));
        HealthData healthData = this.mHealthData;
        if (healthData instanceof dso) {
            dso dsoVar = (dso) healthData;
            LogUtil.a(TAG, "compareWeightData healthData.getWeight() = ", Float.valueOf(dsoVar.getWeight()));
            if (drk.b(this.mUniqueId, 43)) {
                d = 3.0d;
                d2 = 3.0d;
            } else {
                d = 5.0d;
                d2 = 10.0d;
            }
            if (d3 > 0.0d && Math.abs(((double) dsoVar.getWeight()) - d3) > d) {
                LogUtil.a(TAG, "compareWeightData weight more than 5kg");
                this.mHandler.sendEmptyMessage(100);
                this.mIsDataException = true;
                return;
            }
            LogUtil.a(TAG, "compareWeightData healthData.getBodyFatRat() = ", Float.valueOf(dsoVar.getBodyFatRat()));
            if (d4 <= 0.0d || dsoVar.getBodyFatRat() <= 0.0f || Math.abs(((double) dsoVar.getBodyFatRat()) - d4) < d2) {
                return;
            }
            LogUtil.a(TAG, "compareWeightData body fat more than 10%");
            this.mHandler.sendEmptyMessage(100);
            this.mIsDataException = true;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void showConfirmResultDialog(String str) {
        if (getActivity() == null) {
            LogUtil.j(TAG_RELEASE, "showConfirmResultDialog getActivity is null");
            return;
        }
        initUserData();
        initDialogView();
        NoTitleCustomAlertDialog.Builder builder = new NoTitleCustomAlertDialog.Builder(getActivity());
        builder.a(str).c(R.string.measure_result_dialog_confirm, new View.OnClickListener() { // from class: com.huawei.health.device.ui.measure.fragment.WeightResultFragment$$ExternalSyntheticLambda2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f$0.m920x45e4f536(view);
            }
        }).a(R.string.measure_result_dialog_not_me, new View.OnClickListener() { // from class: com.huawei.health.device.ui.measure.fragment.WeightResultFragment$$ExternalSyntheticLambda3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f$0.m919x26ccc1ae(view);
            }
        });
        NoTitleCustomAlertDialog noTitleCustomAlertDialogC = builder.c();
        this.mCommonTextAlertDialog = noTitleCustomAlertDialogC;
        noTitleCustomAlertDialogC.setCancelable(false);
        showDialog();
    }

    /* JADX INFO: renamed from: lambda$showConfirmResultDialog$9$com-huawei-health-device-ui-measure-fragment-WeightResultFragment, reason: not valid java name */
    /* synthetic */ void m920x45e4f536(View view) {
        this.mCommonTextAlertDialog.dismiss();
        int iC = this.mUserAdapter.c();
        if (njy.c(this.mUserList, iC)) {
            saveWeightData(this.mUserList.get(iC));
        } else {
            LogUtil.e(TAG, "showConfirmResultDialog out mUserList bound:", Integer.valueOf(iC));
        }
    }

    /* JADX INFO: renamed from: lambda$showConfirmResultDialog$10$com-huawei-health-device-ui-measure-fragment-WeightResultFragment, reason: not valid java name */
    /* synthetic */ void m919x26ccc1ae(View view) {
        this.mCommonTextAlertDialog.dismiss();
        gotoGuestMeasureFragment();
    }

    private void gotoGuestMeasureFragment() {
        BaseFragment baseFragmentC = dst.c(GuestUserInfoGuideFragment.class.getName());
        if (baseFragmentC != null) {
            Bundle bundle = new Bundle();
            bundle.putString("productId", this.mProductId);
            bundle.putParcelable("commonDeviceInfo", this.mDeviceInfo);
            bundle.putBoolean("deviceMgrMeasure", false);
            bundle.putSerializable(ARGUMENTS_KEY, getArguments().getSerializable(ARGUMENTS_KEY));
            baseFragmentC.setArguments(bundle);
            switchFragment(baseFragmentC);
        }
    }

    private void showDialog() {
        NoTitleCustomAlertDialog noTitleCustomAlertDialog = this.mCommonTextAlertDialog;
        if (noTitleCustomAlertDialog != null && !noTitleCustomAlertDialog.isShowing()) {
            ViewGroup.LayoutParams layoutParams = this.mUserLayout.getLayoutParams();
            layoutParams.height = getDialogHeight(this.mUserListView);
            layoutParams.width = -1;
            this.mUserLayout.setLayoutParams(layoutParams);
            this.mCommonTextAlertDialog.show();
            return;
        }
        LogUtil.j(TAG, "showDialog: mCommonTextAlertDialog is null | isShowing.");
    }

    private void initDialogView() {
        if (getActivity() != null) {
            this.mDialogView = LayoutInflater.from(getActivity()).inflate(R.layout.weight_measure_result_confirm_dialog_view, (ViewGroup) null, false);
        }
        View view = this.mDialogView;
        if (view != null) {
            this.mUserListView = (ListView) view.findViewById(R.id.weight_measure_result_confrim_user_list);
            this.mUserLayout = (LinearLayout) this.mDialogView.findViewById(R.id.weight_measure_result_confrim_list_layout);
            HealthTextView healthTextView = (HealthTextView) this.mDialogView.findViewById(R.id.weight_measure_result_confrim_add_new_user_text);
            this.mUserListView.setAdapter((ListAdapter) this.mUserAdapter);
            if (this.mUserAdapter.getCount() >= 10) {
                healthTextView.setVisibility(8);
            }
            healthTextView.setOnClickListener(this.mDeviceMeasureOnClick);
        }
    }

    private void initUserData() {
        List<dnj> allUser = MultiUsersManager.INSTANCE.getAllUser();
        this.mUserList = allUser;
        LogUtil.a(TAG, "initUserData: user number:", Integer.valueOf(allUser.size()));
        this.mUserAdapter = new WeightResultConfirmAdapter(this.mContext, this.mUserList);
        String strI = MultiUsersManager.INSTANCE.getCurrentUser().i();
        if (TextUtils.isEmpty(strI)) {
            LogUtil.j(TAG, "initUserData: uuid is empty");
            return;
        }
        for (int i = 0; i < this.mUserList.size(); i++) {
            dnj dnjVar = this.mUserList.get(i);
            if (dnjVar == null) {
                LogUtil.j(TAG, "initUserData: tmpUser is null");
                return;
            } else {
                if (strI.equals(dnjVar.i())) {
                    this.mUserAdapter.e(i);
                    return;
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void refreshCurrentMeasureUser() {
        dyc.c(this.mNewCreateUser, this.mUserName, this.mUserPhoto);
    }

    private void enterAddNewUser() {
        Intent intent = new Intent();
        intent.setPackage(BaseApplication.getAppPackage());
        intent.setClassName(BaseApplication.getAppPackage(), ADD_OR_EDIT_USER_ACTIVITY);
        intent.putExtra("weight_user_id_key", "");
        intent.putExtra("claimWeightData", true);
        startActivityForResult(intent, 0);
    }

    private int getDialogHeight(ListView listView) {
        int iE = era.e(listView);
        if (getActivity() == null) {
            LogUtil.j(TAG_RELEASE, "getDialogHeight getActivity is null");
            return 0;
        }
        if (!(getActivity().getSystemService(Constants.NATIVE_WINDOW_SUB_DIR) instanceof WindowManager)) {
            return 0;
        }
        int height = (((WindowManager) getActivity().getSystemService(Constants.NATIVE_WINDOW_SUB_DIR)).getDefaultDisplay().getHeight() / 2) - era.c(BaseApplication.getContext(), 84.0f);
        return iE < height ? iE : height;
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        NoTitleCustomAlertDialog noTitleCustomAlertDialog = this.mCommonTextAlertDialog;
        if (noTitleCustomAlertDialog != null && noTitleCustomAlertDialog.isShowing()) {
            this.mCommonTextAlertDialog.dismiss();
        }
        if (intent == null) {
            LogUtil.j(TAG_RELEASE, "WeightResultFragment onActivityResult intent is null");
            return;
        }
        if (i2 == 1) {
            String stringExtra = intent.getStringExtra(HwPayConstant.KEY_USER_ID);
            if (TextUtils.isEmpty(stringExtra)) {
                LogUtil.j(TAG_RELEASE, "WeightResultFragment onActivityResult userId is null");
                return;
            }
            this.mNewCreateUser = MultiUsersManager.INSTANCE.getSingleUserById(stringExtra);
            this.mUserAdapter.a(MultiUsersManager.INSTANCE.getAllUser());
            if (this.mNewCreateUser == null) {
                LogUtil.j(TAG_RELEASE, "WeightResultFragment onActivityResult user is null");
                return;
            }
            MyHandler myHandler = this.mHandler;
            if (myHandler != null) {
                myHandler.sendEmptyMessage(101);
            }
        }
    }

    private void sendBiEvent(dnj dnjVar) {
        if (dnjVar == null || this.mCurrentUser == null) {
            LogUtil.j(TAG_RELEASE, "WeightResultFragment Confirm save to the current user, not need biEvent");
        } else if (!this.mIsDataException) {
            LogUtil.j(TAG, "WeightResultFragment weight data not exception, not need biEvent");
        } else {
            if (dnjVar.i().equals(this.mCurrentUser.i())) {
                return;
            }
            dyj.e();
        }
    }

    static class MyHandler extends StaticHandler<WeightResultFragment> {
        MyHandler(WeightResultFragment weightResultFragment) {
            super(weightResultFragment);
        }

        @Override // com.huawei.health.device.wifi.lib.handler.StaticHandler
        public void handleMessage(WeightResultFragment weightResultFragment, Message message) {
            if (weightResultFragment == null) {
                LogUtil.j(WeightResultFragment.TAG_RELEASE, "WeightResultFragment MyHandler object is null");
                return;
            }
            if (message != null) {
                switch (message.what) {
                    case 100:
                        weightResultFragment.showConfirmResultDialog(weightResultFragment.mResources.getString(R.string.measure_result_dialog_content));
                        break;
                    case 101:
                        weightResultFragment.refreshCurrentMeasureUser();
                        break;
                    case 102:
                    case 103:
                        weightResultFragment.initViewData();
                        break;
                    default:
                        LogUtil.j(WeightResultFragment.TAG_RELEASE, "WeightResultFragment MyHandler default");
                        break;
                }
                return;
            }
            LogUtil.j(WeightResultFragment.TAG_RELEASE, "WeightResultFragment MyHandler msg is null");
        }
    }

    @Override // com.huawei.health.ecologydevice.ui.BaseFragment, androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        MultiUsersManager.INSTANCE.setIsCheckMainUser(false);
        MyHandler myHandler = this.mHandler;
        if (myHandler != null) {
            myHandler.removeCallbacksAndMessages(null);
        }
    }
}
