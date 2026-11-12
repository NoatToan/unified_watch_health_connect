package com.huawei.health.device.ui.measure.fragment;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.text.SpannableString;
import android.text.style.TextAppearanceSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.view.GravityCompat;
import com.huawei.health.device.callback.ScaleDialogCallback;
import com.huawei.health.device.fatscale.multiusers.MultiUsersManager;
import com.huawei.health.device.model.HealthDevice;
import com.huawei.health.device.open.data.model.HealthData;
import com.huawei.health.device.ui.DeviceMainActivity;
import com.huawei.health.ecologydevice.manager.ResourceManager;
import com.huawei.health.ecologydevice.ui.BaseFragment;
import com.huawei.health.ecologydevice.ui.measure.fragment.BluetoothMeasureFragment;
import com.huawei.health.ecologydevice.ui.measure.fragment.ProductIntroductionFragment;
import com.huawei.hihealth.device.open.data.MeasureResult;
import com.huawei.hms.support.feature.result.CommonConstant;
import com.huawei.hwbasemgr.WeightBaseResponseCallback;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwcommonmodel.utils.PermissionUtil;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.login.ui.login.LoginInit;
import com.huawei.plugindevice.R;
import com.huawei.ui.commonui.utils.CustomPermissionAction;
import defpackage.dmp;
import defpackage.dnb;
import defpackage.dnj;
import defpackage.doq;
import defpackage.drw;
import defpackage.dsq;
import defpackage.dst;
import defpackage.dti;
import defpackage.dxm;
import defpackage.dxx;
import defpackage.dyj;
import defpackage.dys;
import defpackage.efx;
import defpackage.elg;
import defpackage.elh;
import defpackage.elo;
import defpackage.epn;
import defpackage.eqv;
import defpackage.eru;
import defpackage.njy;
import defpackage.qrs;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes7.dex */
public class WeightMeasureGuideFragment extends BluetoothMeasureFragment {
    private static final int GET_NETWORK_USER_INFO = 2;
    private static final String GO_BACK = "goback";
    private static final String GUEST_MEASURE = "guest_measure";
    private static final String GUEST_USER = "guest_user";
    private static final String HONOUR_DEVICE = "honour_device";
    private static final double LAST_BODY_FAT = 0.5d;
    private static final String PRODUCT_ID = "productId";
    private static final String TAG = "PluginDevice_WeightMeasureGuideFragment";
    private static final String TYPE = "type";
    private static final int USER_INFO = 1;
    private static final int WATER_RATE_LIMIT = 100;
    private static final String WEIGHT_BEAN = "weightBean";
    private static final int ZIP_MEASURE = 0;
    private static final int ZIP_MEASURE_NEW = 2;
    private Handler mHandler;
    private boolean mIsGotoAppSetting;
    private elh mProductInfo;
    private View mView;
    private dti mWeightInteractor;
    private BaseFragment mWeightResultFragment;
    private boolean mIsGuestMeasure = false;
    private dnj mUser = MultiUsersManager.INSTANCE.getCurrentUser();

    @Override // com.huawei.health.ecologydevice.ui.measure.fragment.device.DeviceMeasureGuideFragment
    public epn getMode() {
        LogUtil.a(TAG, "WeightMeasureGuideFragment getmode()");
        elh elhVarD = ResourceManager.c().d(this.mProductId);
        this.mProductInfo = elhVarD;
        if (elhVarD == null) {
            LogUtil.j(TAG, "getMode mProductInfo is null");
            return null;
        }
        ArrayList<elh.c> arrayListS = elhVarD.s();
        if (njy.e(arrayListS)) {
            LogUtil.j(TAG, "getMode measureGuides is null or size is zero");
            return null;
        }
        epn epnVar = new epn();
        epnVar.c(getMeasure(arrayListS));
        int i = arrayListS.size() > 3 ? 2 : 0;
        epnVar.d(getSpannableString(eru.c(arrayListS, this.mProductId, i), eru.c(arrayListS, this.mProductId, i + 1)));
        epnVar.e(getMeasureListForString());
        epnVar.a(GravityCompat.START);
        epnVar.b(true);
        epnVar.a(true);
        super.setTitle(elo.a(this.mProductId, this.mProductInfo.l().d()));
        return epnVar;
    }

    private SpannableString getSpannableString(String str, String str2) {
        if (str == null) {
            LogUtil.j(TAG, "getSpannableString guidePromptMain is null");
            str = "";
        }
        if (str2 == null || str.equals(str2)) {
            LogUtil.j(TAG, "getSpannableString guidePromptSecond is null");
            str2 = "";
        }
        String str3 = str + System.lineSeparator() + System.lineSeparator() + str2;
        SpannableString spannableString = new SpannableString(str3);
        spannableString.setSpan(new TextAppearanceSpan(BaseApplication.getContext(), R.style.plugin_device_scale_guide_title_style), 0, str.length(), 33);
        spannableString.setSpan(new TextAppearanceSpan(BaseApplication.getContext(), R.style.plugin_device_scale_guide_description_style), str.length(), str3.length(), 33);
        return spannableString;
    }

    private ArrayList<Object> getMeasure(ArrayList<elh.c> arrayList) {
        LogUtil.a(TAG, "WeightMeasureGuideFragment getMeasure()");
        ArrayList<Object> arrayList2 = new ArrayList<>(10);
        Iterator<elh.c> it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(elg.e().d(this.mProductId, it.next().d()));
        }
        LogUtil.a(TAG, "imgList = " + arrayList2.size());
        return arrayList2;
    }

    private ArrayList<String> getMeasureListForString() {
        ArrayList<String> arrayList = new ArrayList<>(10);
        Iterator<elh.c> it = this.mProductInfo.s().iterator();
        while (it.hasNext()) {
            arrayList.add(elo.a(this.mProductId, it.next().c()));
        }
        LogUtil.a(TAG, "imageListForString.size() = ", Integer.valueOf(arrayList.size()));
        return arrayList;
    }

    @Override // com.huawei.health.ecologydevice.ui.measure.fragment.device.DeviceMeasureGuideFragment, com.huawei.health.ecologydevice.ui.BaseFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        LogUtil.a(TAG, "WeightMeasureGuideFragment onCreate");
        super.onCreate(bundle);
    }

    @Override // com.huawei.health.ecologydevice.ui.measure.fragment.device.DeviceMeasureGuideFragment, com.huawei.health.ecologydevice.ui.BaseFragment, androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        LogUtil.a(TAG, "onCreateView");
        if (this.mView == null) {
            this.mView = super.onCreateView(layoutInflater, viewGroup, bundle);
            this.mWeightInteractor = dti.d(this.mProductId, this.mUniqueId);
            if (dmp.d().b(this.mUniqueId, true) instanceof efx) {
                LogUtil.a(TAG, "init WeightInteractor and init Handler");
                this.mWeightInteractor.d();
            } else {
                LogUtil.a(TAG, "is not bleDevice");
            }
            if (this.mainActivity instanceof DeviceMainActivity) {
                ((DeviceMainActivity) this.mainActivity).d(this.mProductId);
            }
            initData();
            if (dxm.ax(this.mProductId)) {
                dxm.au(this.mUniqueId);
            } else {
                LogUtil.a(TAG, "onCreateView device is ble");
            }
            return this.mView;
        }
        LogUtil.j(TAG, "onCreateView mView has already created");
        return this.mView;
    }

    private void initData() {
        this.child.findViewById(R.id.bt_device_measure_guide_next).setVisibility(8);
        this.mHandler = new Handler() { // from class: com.huawei.health.device.ui.measure.fragment.WeightMeasureGuideFragment.1
            @Override // android.os.Handler
            public void handleMessage(Message message) {
                super.handleMessage(message);
                int i = message.what;
                if (i == 1) {
                    LogUtil.a(WeightMeasureGuideFragment.TAG, "WeightMeasureGuideFragment receive msg");
                    WeightMeasureGuideFragment.this.checkBluetoothPermissions();
                } else {
                    if (i == 2) {
                        LogUtil.a(WeightMeasureGuideFragment.TAG, "WeightMeasureGuideFragment startMeasure");
                        if (message.obj instanceof dnj) {
                            WeightMeasureGuideFragment.this.mUser = (dnj) message.obj;
                            WeightMeasureGuideFragment.this.fillUserInfoAndSendMsg();
                            return;
                        }
                        return;
                    }
                    LogUtil.j(WeightMeasureGuideFragment.TAG, "handleMessage default");
                }
            }
        };
        if (getArguments() != null) {
            this.mIsGuestMeasure = getArguments().getBoolean(GUEST_MEASURE, false);
        }
        dyj.d(this.mProductId);
        initByGuestMode();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void checkBluetoothPermissions() {
        if (Build.VERSION.SDK_INT > 30 && PermissionUtil.e(this.mainActivity, PermissionUtil.PermissionType.SCAN) != PermissionUtil.PermissionResult.GRANTED) {
            PermissionUtil.d(this.mainActivity, PermissionUtil.PermissionType.SCAN, new AnonymousClass2(this.mainActivity));
        } else {
            startMeasure();
        }
    }

    /* JADX INFO: renamed from: com.huawei.health.device.ui.measure.fragment.WeightMeasureGuideFragment$2, reason: invalid class name */
    class AnonymousClass2 extends CustomPermissionAction {
        AnonymousClass2(Context context) {
            super(context);
        }

        @Override // com.huawei.hwcommonmodel.utils.permission.PermissionsResultAction
        public void onGranted() {
            LogUtil.a(WeightMeasureGuideFragment.TAG, "startMeasure doActionWithPermissions onGranted");
            WeightMeasureGuideFragment.this.startMeasure();
        }

        @Override // com.huawei.ui.commonui.utils.CustomPermissionAction, com.huawei.hwcommonmodel.utils.permission.PermissionsResultAction
        public void onDenied(String str) {
            showAppSettingGuide();
        }

        @Override // com.huawei.ui.commonui.utils.CustomPermissionAction, com.huawei.hwcommonmodel.utils.permission.PermissionsResultAction
        public void onForeverDenied(PermissionUtil.PermissionType permissionType) {
            showAppSettingGuide();
        }

        private void showAppSettingGuide() {
            qrs.b(WeightMeasureGuideFragment.this.mainActivity, PermissionUtil.PermissionType.SCAN, new View.OnClickListener() { // from class: com.huawei.health.device.ui.measure.fragment.WeightMeasureGuideFragment$2$$ExternalSyntheticLambda0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f$0.m909xbac25b44(view);
                }
            }, new View.OnClickListener() { // from class: com.huawei.health.device.ui.measure.fragment.WeightMeasureGuideFragment$2$$ExternalSyntheticLambda1
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f$0.m910xee708605(view);
                }
            });
        }

        /* JADX INFO: renamed from: lambda$showAppSettingGuide$0$com-huawei-health-device-ui-measure-fragment-WeightMeasureGuideFragment$2, reason: not valid java name */
        /* synthetic */ void m909xbac25b44(View view) {
            WeightMeasureGuideFragment.this.mIsGotoAppSetting = true;
        }

        /* JADX INFO: renamed from: lambda$showAppSettingGuide$1$com-huawei-health-device-ui-measure-fragment-WeightMeasureGuideFragment$2, reason: not valid java name */
        /* synthetic */ void m910xee708605(View view) {
            WeightMeasureGuideFragment.this.onBackPressed();
        }
    }

    @Override // com.huawei.health.ecologydevice.ui.BaseFragment, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        if (this.mIsGotoAppSetting) {
            this.mIsGotoAppSetting = false;
            checkBluetoothPermissions();
        }
    }

    private void initByGuestMode() {
        if (this.mArgs == null) {
            LogUtil.e(TAG, "mArgs is null");
            return;
        }
        this.mArgs.clear();
        if (!this.mIsGuestMeasure) {
            MultiUsersManager.INSTANCE.getCurrentUser(new WeightBaseResponseCallback() { // from class: com.huawei.health.device.ui.measure.fragment.WeightMeasureGuideFragment$$ExternalSyntheticLambda0
                @Override // com.huawei.hwbasemgr.WeightBaseResponseCallback
                public final void onResponse(int i, Object obj) {
                    this.f$0.m908x4abb07fa(i, (dnj) obj);
                }
            });
        } else {
            if (isGuestUserEffective()) {
                dnj dnjVar = (dnj) getArguments().getSerializable(GUEST_USER);
                this.mUser = dnjVar;
                if (dnjVar != null) {
                    this.mArgs.putString("uid", this.mUser.i());
                    this.mArgs.putInt(CommonConstant.KEY_GENDER, this.mUser.d());
                    this.mArgs.putInt("height", this.mUser.e());
                    this.mArgs.putInt("sex", this.mUser.d());
                    this.mArgs.putInt("age", this.mUser.c());
                    this.mArgs.putInt("birthday", this.mUser.j());
                } else {
                    LogUtil.j(TAG, "user is null");
                }
            }
            this.mArgs.putInt("guestUser", 1);
            String accountInfo = LoginInit.getInstance(BaseApplication.getContext()).getAccountInfo(1011);
            if (accountInfo != null) {
                this.mArgs.putString("huid", accountInfo);
            }
            this.mArgs.putString("productId", this.mProductId);
            this.mArgs.putInt("type", -4);
            this.mArgs.putBoolean("activeMeasure", true);
        }
        LogUtil.a(TAG, "WeightMeasureGuideFragment send msg");
        this.mHandler.sendEmptyMessage(1);
        dxx.d().j(this.mProductId);
    }

    /* JADX INFO: renamed from: lambda$initByGuestMode$0$com-huawei-health-device-ui-measure-fragment-WeightMeasureGuideFragment, reason: not valid java name */
    /* synthetic */ void m908x4abb07fa(int i, dnj dnjVar) {
        if (dnjVar == null || i != 0) {
            return;
        }
        Message messageObtain = Message.obtain();
        messageObtain.what = 2;
        messageObtain.obj = dnjVar;
        this.mHandler.sendMessage(messageObtain);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void fillUserInfoAndSendMsg() {
        this.mArgs.putInt("height", this.mUser.e());
        this.mArgs.putInt("sex", this.mUser.d());
        this.mArgs.putInt("age", this.mUser.c());
        this.mArgs.putString("productId", this.mProductId);
        this.mArgs.putInt("type", -4);
        this.mArgs.putBoolean("activeMeasure", true);
        LogUtil.a(TAG, "fillUserInfoAndSendMsg onSuccess");
    }

    @Override // androidx.fragment.app.Fragment
    public void onStart() {
        LogUtil.a(TAG, "WeightMeasureGuideFragment onStart");
        super.onStart();
        LogUtil.a(TAG, "WeightMeasureGuideFragment productId is " + this.mProductId);
    }

    @Override // com.huawei.health.ecologydevice.ui.measure.fragment.device.DeviceMeasureGuideFragment
    public void handleDataChangedInUiThread(HealthDevice healthDevice, HealthData healthData, boolean z) {
        if (healthData != null) {
            if (this.mIsGuestMeasure) {
                if (healthDevice == null) {
                    LogUtil.a(TAG, "saveWeightData Failed device null");
                    return;
                } else {
                    gotoWeightDetailActivity(dsq.d(healthDevice, healthData, this.mUser, 10006), this.mUser);
                    LogUtil.a(TAG, "Guest measure,jump to WeightDeatilActivity");
                    return;
                }
            }
            if (this.mWeightResultFragment != null) {
                LogUtil.j(TAG, "WeightResultFragment is showing");
                return;
            }
            BaseFragment baseFragmentE = dst.e(this.mKind);
            if (baseFragmentE == null) {
                LogUtil.j(TAG, "WeightMeasureGuideFragment handleDataChangedInUiThread fragment = null");
                return;
            }
            if (isAdded()) {
                Bundle bundle = new Bundle();
                if (getArguments() != null && HONOUR_DEVICE.equals(getArguments().getString(GO_BACK, ""))) {
                    bundle.putString(GO_BACK, HONOUR_DEVICE);
                }
                bundle.putString("title", elo.a(this.mProductId, this.mProductInfo.l().d()));
                bundle.putInt("content", R.string.IDS_device_importing_data);
                bundle.putSerializable("HealthData", healthData);
                bundle.putString("productId", this.mProductId);
                bundle.putInt("type", this.mType);
                bundle.putParcelable("commonDeviceInfo", this.mDeviceInfo);
                baseFragmentE.setArguments(bundle);
                jumpToResultFragment(baseFragmentE);
            }
        }
    }

    private void jumpToResultFragment(BaseFragment baseFragment) {
        switchFragment(baseFragment);
        this.mWeightResultFragment = baseFragment;
    }

    @Override // com.huawei.health.ecologydevice.ui.measure.fragment.device.DeviceMeasureGuideFragment
    public void handleDataChangedInUiThreadUniversal(MeasureResult measureResult, boolean z) {
        if (measureResult == null) {
            return;
        }
        BaseFragment baseFragmentE = dst.e(this.mKind);
        if (baseFragmentE == null) {
            LogUtil.j(TAG, "WeightMeasureGuideFragment handleDataChangedInUiThread fragment = null");
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putInt("content", R.string.IDS_device_importing_data);
        bundle.putSerializable("HealthData", eqv.d().e(measureResult));
        bundle.putString("productId", this.mProductId);
        bundle.putInt("type", this.mType);
        bundle.putParcelable("commonDeviceInfo", this.mDeviceInfo);
        bundle.putString("title", elo.a(this.mProductId, this.mProductInfo.l().d()));
        baseFragmentE.setArguments(bundle);
        switchFragment(baseFragmentE);
    }

    /* JADX INFO: renamed from: lambda$handleStatusChangedInUiThread$1$com-huawei-health-device-ui-measure-fragment-WeightMeasureGuideFragment, reason: not valid java name */
    /* synthetic */ void m907x419b4364(int i) {
        LogUtil.a(TAG, "showWeightMeasureFailedDialog result: ", Integer.valueOf(i));
        if (i == 0) {
            if (getArguments() != null && getArguments().getString(GO_BACK, "").equals(HONOUR_DEVICE)) {
                onBackPressed();
                return;
            } else {
                popupFragment(ProductIntroductionFragment.class);
                return;
            }
        }
        LogUtil.a(TAG, "showWeightMeasureFailedDialog negative");
    }

    @Override // com.huawei.health.ecologydevice.ui.measure.fragment.device.DeviceMeasureGuideFragment
    public void handleStatusChangedInUiThread(HealthDevice healthDevice, int i) {
        if (i == 9 || i == 8) {
            dys.a().d(this.mainActivity, new ScaleDialogCallback() { // from class: com.huawei.health.device.ui.measure.fragment.WeightMeasureGuideFragment$$ExternalSyntheticLambda1
                @Override // com.huawei.health.device.callback.ScaleDialogCallback
                public final void operationResult(int i2) {
                    this.f$0.m907x419b4364(i2);
                }
            });
            return;
        }
        if (i == 15) {
            LogUtil.j(TAG, "WeightMeasureGuideFragment status: ", 15);
            if (dxm.ag(this.mProductId)) {
                doq.e().d(-2);
                drw.e().d(this.mProductId, this.mUniqueId, -2);
            }
            if (!(this.mainActivity instanceof DeviceMainActivity)) {
                LogUtil.j(TAG, "DeviceMainActivity is not active");
                return;
            } else {
                ((DeviceMainActivity) this.mainActivity).c(this.mUniqueId);
                ((DeviceMainActivity) this.mainActivity).b(this.mProductId);
                return;
            }
        }
        if (i == 1) {
            LogUtil.a(TAG, "WeightInterator set status: ", Integer.valueOf(i));
            if (dxm.ag(this.mProductId)) {
                dti.d(this.mProductId, this.mUniqueId);
                return;
            }
            return;
        }
        LogUtil.j(TAG, "WeightInterator set status: ", Integer.valueOf(i));
        if (dxm.ag(this.mProductId)) {
            this.mWeightInteractor.f();
        }
    }

    @Override // com.huawei.health.ecologydevice.ui.measure.fragment.device.DeviceMeasureGuideFragment
    public void handleStatusChangedInUiThreadUniversal(int i) {
        LogUtil.a(TAG, "WeightMeasureGuideFragment handleStatusChangedInUiThreadUniversal");
    }

    @Override // com.huawei.health.ecologydevice.ui.measure.fragment.device.DeviceMeasureGuideFragment
    public void handleFailedEventInUiThread(int i) {
        LogUtil.a(TAG, "WeightMeasureGuideFragment handleFailedEventInUiThread");
    }

    @Override // com.huawei.health.ecologydevice.ui.measure.fragment.BluetoothMeasureFragment, com.huawei.health.ecologydevice.ui.measure.fragment.device.DeviceMeasureGuideFragment, com.huawei.health.ecologydevice.ui.BaseFragment, androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        if (this.mWeightInteractor != null) {
            LogUtil.j(TAG, "mWeightInteractor destroy");
            this.mWeightInteractor.b();
        }
    }

    @Override // com.huawei.health.ecologydevice.ui.measure.fragment.device.DeviceMeasureGuideFragment, com.huawei.health.ecologydevice.ui.BaseFragment
    public boolean onBackPressed() {
        if (getArguments() != null && getArguments().getString(GO_BACK, "").equals(HONOUR_DEVICE)) {
            popupFragment(HonourDeviceFragment.class);
            return false;
        }
        if (getArguments() != null && "hygride".equals(getArguments().getString(GO_BACK, ""))) {
            if (this.mIsGuestMeasure) {
                popupFragment(GuestUserInfoGuideFragment.class);
            } else {
                popupFragment(HagridDeviceManagerFragment.class);
            }
            return false;
        }
        return super.onBackPressed();
    }

    private void gotoWeightDetailActivity(dnb dnbVar, dnj dnjVar) {
        if (dnbVar == null) {
            LogUtil.a(TAG, "gotoWeightDetailActivity bean is null");
            return;
        }
        double dB = dnbVar.b();
        Intent intent = new Intent();
        intent.setClassName(BaseApplication.getAppPackage(), "com.huawei.ui.main.stories.health.activity.healthdata.WeightDetailActivity");
        LogUtil.a(TAG, "checkWeightDataValidation : true");
        constructIntentForWeight(dnbVar, dnjVar, dB, intent);
        if (BaseApplication.getActivity() == null) {
            LogUtil.j(TAG, "gotoWeightDetailActivity BaseApplication.getActivity() is null");
        } else {
            try {
                BaseApplication.getActivity().startActivity(intent);
            } catch (ActivityNotFoundException unused) {
                LogUtil.e(TAG, "gotoWeightDetailActivity ActivityNotFoundException");
            }
        }
        popupFragment(HagridDeviceManagerFragment.class);
    }

    private void constructIntentForWeight(dnb dnbVar, dnj dnjVar, double d, Intent intent) {
        dnbVar.d(dxm.h.get(this.mProductId).intValue());
        dnbVar.c(this.mUniqueId);
        intent.putExtra(WEIGHT_BEAN, dnbVar);
        intent.putExtra(GUEST_MEASURE, true);
        intent.putExtra("weight", dnbVar.av());
        intent.putExtra("bodyFat", d);
        intent.putExtra("weightTime", dnbVar.ax());
        intent.putExtra("deleteTime", dnbVar.ax());
        if (dnbVar.aq() > 0.0d && dnbVar.aq() <= 100.0d) {
            intent.putExtra("water", dnbVar.aq());
        } else {
            intent.putExtra("water", dnbVar.ak());
        }
        intent.putExtra("deleteEndTime", dnbVar.aw());
        intent.putExtra("BITag", 1);
        intent.putExtra("resistance", dnbVar.ag());
        if (dnbVar.r() > 0) {
            intent.putExtra("userHeight", dnbVar.r());
        } else {
            intent.putExtra("userHeight", dnjVar.e());
        }
        intent.putExtra("isShowBodyFat", d >= 0.5d);
        intent.putExtra("isShowInput", false);
        intent.putExtra("dataType", dnbVar.o());
    }

    private boolean isGuestUserEffective() {
        return getArguments() != null && (getArguments().getSerializable(GUEST_USER) instanceof dnj);
    }
}
