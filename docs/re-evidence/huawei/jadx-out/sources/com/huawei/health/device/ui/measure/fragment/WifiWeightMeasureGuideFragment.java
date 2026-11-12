package com.huawei.health.device.ui.measure.fragment;

import android.content.BroadcastReceiver;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Message;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.TextAppearanceSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.media3.common.C;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.health.device.fatscale.multiusers.MultiUsersManager;
import com.huawei.health.device.model.HealthDevice;
import com.huawei.health.device.wifi.control.claim.ClaimWeightDataManager;
import com.huawei.health.device.wifi.lib.handler.StaticHandler;
import com.huawei.health.ecologydevice.manager.ResourceManager;
import com.huawei.health.ecologydevice.ui.BaseFragment;
import com.huawei.health.ecologydevice.ui.measure.fragment.device.DeviceSelectBindFragment;
import com.huawei.hihealth.HiAggregateOption;
import com.huawei.hihealth.HiHealthData;
import com.huawei.hihealth.HiSyncOption;
import com.huawei.hihealth.api.HiHealthManager;
import com.huawei.hihealth.api.HiHealthNativeApi;
import com.huawei.hihealth.data.listener.HiAggregateListener;
import com.huawei.hihealth.dictionary.utils.DicDataTypeUtil;
import com.huawei.hwcloudmodel.callback.ICloudOperationResult;
import com.huawei.hwcloudmodel.healthdatacloud.model.GetBindDeviceReq;
import com.huawei.hwcloudmodel.model.unite.WifiDeviceGetWifiDeviceInfoReq;
import com.huawei.hwcloudmodel.model.unite.WifiDeviceGetWifiDeviceInfoRsp;
import com.huawei.hwcloudmodel.model.userprofile.DeviceInfo;
import com.huawei.hwcloudmodel.model.userprofile.GetBindDeviceRsp;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.operation.ble.BleConstants;
import com.huawei.operation.utils.Constants;
import com.huawei.plugindevice.R;
import com.huawei.ui.commonui.base.BaseDialog;
import com.huawei.ui.commonui.dialog.NoTitleCustomAlertDialog;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import defpackage.dmp;
import defpackage.dso;
import defpackage.dst;
import defpackage.dxm;
import defpackage.dyg;
import defpackage.ean;
import defpackage.eby;
import defpackage.ecs;
import defpackage.elg;
import defpackage.elh;
import defpackage.elk;
import defpackage.elo;
import defpackage.ens;
import defpackage.epn;
import defpackage.eru;
import defpackage.lqo;
import defpackage.ltb;
import defpackage.njy;
import defpackage.qrs;
import defpackage.qsp;
import health.compact.a.BroadcastManagerUtil;
import health.compact.a.CommonUtil;
import health.compact.a.LocalBroadcast;
import health.compact.a.SharedPreferenceManager;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* JADX INFO: loaded from: classes7.dex */
public class WifiWeightMeasureGuideFragment extends BaseFragment {
    private static final int AGGREGATE_COUNT_ONE = 1;
    private static final int CLOUD_ERROR_CODE_SUCCESS = 0;
    private static final int GUIDE_IMAGE_VIEW_HEIGHT = 288;
    private static final int GUIDE_IMAGE_VIEW_HEIGHT_RATIO = 2;
    private static final int MSG_GET_NEW_WEIGHT_VALUE_FAILURE = 101;
    private static final int MSG_GET_NEW_WEIGHT_VALUE_SUCCESS = 100;
    private static final int MSG_NOT_EXIST_DEVICE = 104;
    private static final int MSG_UPDATE_NEW_WEIGHT_VALUE = 103;
    private static final int QUERY_OPPORTUNITY_FOUR = 110000;
    private static final int QUERY_OPPORTUNITY_ONE = 10000;
    private static final int QUERY_OPPORTUNITY_THREE = 80000;
    private static final int QUERY_OPPORTUNITY_TWO = 30000;
    private static final String TAG = "WifiWeightMeasureGuideFragment";
    private static final int TIMEOUT = 120000;
    private static final int WEIGHT_DATA_FAULT_TOLERANT_TIME = 15000;
    private static final int ZIP_MEASURE = 0;
    private static final int ZIP_MEASURE_NEW = 2;
    private ens mAnimationHandler;
    private ContentValues mDeviceInfo;
    private ImageView mGuideImageView;
    private HealthTextView mGuideTextView;
    private epn mMeasureModel;
    private LinearLayout mMessureGuideImageLayout;
    private elh mProductInfo;
    private MyHandler myHandler;
    private String mProductId = "";
    private String mUniqueId = "";
    private long mStartTime = 0;
    private long mEndTime = 0;
    private final BroadcastReceiver mWeightPushInfoReceiver = new BroadcastReceiver() { // from class: com.huawei.health.device.ui.measure.fragment.WifiWeightMeasureGuideFragment.1
        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            dyg.a(false, WifiWeightMeasureGuideFragment.TAG, "mWeightPushInfoReceiver onReceive");
            if (intent == null || !"com.huawei.health.action.ACTION_PUSH_DATA_DONE_ACTION".equals(intent.getAction())) {
                return;
            }
            dyg.a(false, WifiWeightMeasureGuideFragment.TAG, "receive push info,now get new weight measure data...");
            ThreadPoolManager.c().b(WifiWeightMeasureGuideFragment.TAG, new Runnable() { // from class: com.huawei.health.device.ui.measure.fragment.WifiWeightMeasureGuideFragment.1.1
                @Override // java.lang.Runnable
                public void run() {
                    WifiWeightMeasureGuideFragment.this.getMeasureWeightData();
                    ClaimWeightDataManager.INSTANCE.startSync();
                }
            });
        }
    };
    private View.OnClickListener negativeListener = new View.OnClickListener() { // from class: com.huawei.health.device.ui.measure.fragment.WifiWeightMeasureGuideFragment$$ExternalSyntheticLambda3
        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            this.f$0.m949xc7afc3b(view);
        }
    };
    private View.OnClickListener positiveListener = new View.OnClickListener() { // from class: com.huawei.health.device.ui.measure.fragment.WifiWeightMeasureGuideFragment$$ExternalSyntheticLambda4
        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            this.f$0.m950xd497abc(view);
        }
    };

    static class MyHandler extends StaticHandler<WifiWeightMeasureGuideFragment> {
        MyHandler(WifiWeightMeasureGuideFragment wifiWeightMeasureGuideFragment) {
            super(wifiWeightMeasureGuideFragment);
        }

        @Override // com.huawei.health.device.wifi.lib.handler.StaticHandler
        public void handleMessage(WifiWeightMeasureGuideFragment wifiWeightMeasureGuideFragment, Message message) {
            if (wifiWeightMeasureGuideFragment != null) {
                if (wifiWeightMeasureGuideFragment.isDestroy()) {
                    dyg.d(false, WifiWeightMeasureGuideFragment.TAG, "MyHandler activity is not exist");
                    return;
                }
                if (!wifiWeightMeasureGuideFragment.isAdded()) {
                    dyg.d(false, WifiWeightMeasureGuideFragment.TAG, "MyHandler mFragment is not add");
                    return;
                }
                if (message == null) {
                    dyg.d(false, WifiWeightMeasureGuideFragment.TAG, "MyHandler msg is null");
                    return;
                }
                dyg.a(false, WifiWeightMeasureGuideFragment.TAG, "MyHandler what:", Integer.valueOf(message.what));
                switch (message.what) {
                    case 100:
                        wifiWeightMeasureGuideFragment.myHandler.removeMessages(101);
                        if (message.obj instanceof dso) {
                            wifiWeightMeasureGuideFragment.goToResultPage((dso) message.obj);
                        }
                        break;
                    case 101:
                        wifiWeightMeasureGuideFragment.myHandler.removeMessages(100);
                        wifiWeightMeasureGuideFragment.showMeasureTimeoutDialog(wifiWeightMeasureGuideFragment.mainActivity);
                        break;
                    case 102:
                    default:
                        dyg.d(false, "MyHandler what is other", new Object[0]);
                        break;
                    case 103:
                        wifiWeightMeasureGuideFragment.syncNewWeightData();
                        break;
                    case 104:
                        wifiWeightMeasureGuideFragment.myHandler.removeMessages(101);
                        wifiWeightMeasureGuideFragment.showNoDeviceDialog(message.obj == null ? null : String.valueOf(message.obj));
                        break;
                }
            }
            dyg.d(false, WifiWeightMeasureGuideFragment.TAG, "MyHandler object is null");
        }
    }

    /* JADX INFO: renamed from: lambda$new$0$com-huawei-health-device-ui-measure-fragment-WifiWeightMeasureGuideFragment, reason: not valid java name */
    /* synthetic */ void m949xc7afc3b(View view) {
        this.mainActivity.finish();
    }

    /* JADX INFO: renamed from: lambda$new$1$com-huawei-health-device-ui-measure-fragment-WifiWeightMeasureGuideFragment, reason: not valid java name */
    /* synthetic */ void m950xd497abc(View view) {
        elk elkVarSwitchProductGroupItem = switchProductGroupItem(ResourceManager.c().b().d(), HealthDevice.HealthDeviceKind.HDK_WEIGHT.name());
        if (elkVarSwitchProductGroupItem != null) {
            dyg.a(false, TAG, "item = ", elkVarSwitchProductGroupItem.toString());
            DeviceSelectBindFragment deviceSelectBindFragment = new DeviceSelectBindFragment();
            Bundle bundle = new Bundle();
            bundle.putString("kind", elkVarSwitchProductGroupItem.e().name());
            bundle.putString("deviceType", this.mainActivity.getResources().getString(elo.d(elkVarSwitchProductGroupItem.c())));
            deviceSelectBindFragment.setArguments(bundle);
            switchFragment((Fragment) null, deviceSelectBindFragment);
            return;
        }
        dyg.d(false, TAG, "WEIGHT ProductGroup is error ");
    }

    private elk switchProductGroupItem(ArrayList<elk> arrayList, String str) {
        elk elkVar = null;
        for (elk elkVar2 : arrayList) {
            dyg.a(false, TAG, " item.kind.name() = ", elkVar2.e().name(), " device_Type = ", str);
            if (elkVar2.e().name().equals(str)) {
                elkVar = elkVar2;
            }
        }
        return elkVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void showNoDeviceDialog(String str) {
        this.myHandler.removeCallbacksAndMessages(null);
        ean.c(this.mainActivity, str, this.negativeListener, this.positiveListener);
    }

    @Override // com.huawei.health.ecologydevice.ui.BaseFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        dyg.a(false, TAG, "onCreate");
        this.myHandler = new MyHandler(this);
        SharedPreferenceManager.e(this.mainActivity, "wifi_weight_device", "weight_notify_key", "false", null);
        long jCurrentTimeMillis = System.currentTimeMillis();
        dyg.a(false, TAG, "currentTime: ", Long.valueOf(jCurrentTimeMillis));
        this.mStartTime = jCurrentTimeMillis - C.DEFAULT_SEEK_FORWARD_INCREMENT_MS;
        this.mEndTime = jCurrentTimeMillis + 120000;
    }

    @Override // com.huawei.health.ecologydevice.ui.BaseFragment, androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        dyg.a(false, TAG, "onCreateView");
        ViewGroup viewGroup2 = super.onCreateView(layoutInflater, viewGroup, bundle) instanceof ViewGroup ? (ViewGroup) super.onCreateView(layoutInflater, viewGroup, bundle) : null;
        this.child = layoutInflater.inflate(R.layout.wifi_weight_measure_layout, viewGroup, false);
        this.mGuideTextView = (HealthTextView) qsp.a(this.child, R.id.hw_wifi_device_measure_prompt);
        this.mMessureGuideImageLayout = (LinearLayout) qsp.a(this.child, R.id.hw_wifi_device_measure_image_view_layout);
        refreshImageLayout();
        ContentValues contentValues = (ContentValues) getArguments().getParcelable("commonDeviceInfo");
        this.mDeviceInfo = contentValues;
        if (contentValues != null) {
            this.mProductId = contentValues.getAsString("productId");
            this.mUniqueId = this.mDeviceInfo.getAsString("uniqueId");
        }
        this.mProductInfo = ResourceManager.c().d(this.mProductId);
        LogUtil.a(TAG, "productId: ", this.mProductId);
        epn mode = getMode();
        this.mMeasureModel = mode;
        if (mode == null) {
            dyg.a(false, TAG, "getMode() is null");
            Serializable serializable = getArguments().getSerializable("DeviceMeasureOperateModel");
            if (serializable == null) {
                dyg.d(false, TAG, "onCreateView serializable = null");
            } else {
                initView(serializable);
            }
        } else {
            dyg.a(false, TAG, "getMode() is not null");
            initView(this.mMeasureModel);
        }
        if (viewGroup2 != null) {
            viewGroup2.addView(this.child);
        }
        initTitle();
        checkDevice();
        dxm.au(this.mUniqueId);
        return viewGroup2;
    }

    private void initTitle() {
        if (this.mProductInfo == null) {
            return;
        }
        String strH = dxm.h(this.mUniqueId);
        if (TextUtils.isEmpty(strH)) {
            super.setTitle(elo.a(this.mProductId, this.mProductInfo.l().d()));
            return;
        }
        super.setTitle(elo.a(this.mProductId, this.mProductInfo.l().d()) + " - " + strH);
    }

    @Override // com.huawei.health.ecologydevice.ui.BaseFragment, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        registerPushInfoBroadcast();
        if (!CommonUtil.ab(this.mainActivity)) {
            showWiFiEnableDialog(this.mainActivity);
            return;
        }
        this.myHandler.sendEmptyMessageDelayed(103, 10000L);
        this.myHandler.sendEmptyMessageDelayed(103, 30000L);
        this.myHandler.sendEmptyMessageDelayed(103, 80000L);
        this.myHandler.sendEmptyMessageDelayed(103, 110000L);
        this.myHandler.sendEmptyMessageDelayed(101, 120000L);
    }

    @Override // com.huawei.health.ecologydevice.ui.BaseFragment, androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
        dyg.a(false, TAG, BaseDialog.LIFE_CYCLE_ON_PAUSE);
        unRegisterPushInfoBroadcast();
    }

    @Override // com.huawei.health.ecologydevice.ui.BaseFragment, androidx.fragment.app.Fragment
    public void onDestroy() {
        SharedPreferenceManager.e(this.mainActivity, "wifi_weight_device", "weight_notify_key", "true", null);
        super.onDestroy();
        MyHandler myHandler = this.myHandler;
        if (myHandler != null) {
            myHandler.removeCallbacks(null);
        }
        if (this.mAnimationHandler != null) {
            this.mAnimationHandler = null;
        }
    }

    @Override // com.huawei.health.ecologydevice.ui.BaseFragment
    public boolean onBackPressed() {
        if (dxm.ag(this.mProductId)) {
            popupFragment(HagridDeviceManagerFragment.class);
            return false;
        }
        popupFragment(WiFiProductIntroductionFragment.class);
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean isDestroy() {
        FragmentActivity activity = getActivity();
        if (activity == null) {
            dyg.d(false, TAG, "DeviceMainActivity is null");
            return true;
        }
        if (!activity.isFinishing() && !activity.isDestroyed()) {
            return false;
        }
        dyg.d(false, TAG, "DeviceMainActivity is Destroyed");
        return true;
    }

    private void initView(Object obj) {
        lightTheScreen();
        if (this.child == null || !(obj instanceof epn)) {
            return;
        }
        epn epnVar = (epn) obj;
        dyg.a(false, TAG, "initView");
        this.mGuideTextView.setText(epnVar.a());
        if (dxm.y(this.mProductId)) {
            initHagirdeView(epnVar);
        }
    }

    private void showWiFiEnableDialog(final Context context) {
        if (context == null) {
            LogUtil.j(TAG, "showWiFiEnableDialog context is null");
            return;
        }
        NoTitleCustomAlertDialog.Builder builder = new NoTitleCustomAlertDialog.Builder(context);
        String string = context.getResources().getString(R.string.IDS_device_wifi_device_product_name);
        builder.a(String.format(Locale.ENGLISH, context.getResources().getString(R.string.IDS_device_wifi_measure_no_network_msg), string)).a(R.string.IDS_settings_button_cancal, new View.OnClickListener() { // from class: com.huawei.health.device.ui.measure.fragment.WifiWeightMeasureGuideFragment$$ExternalSyntheticLambda0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f$0.m952x918a1014(view);
            }
        }).c(R.string.IDS_device_wifi_go_connect, new View.OnClickListener() { // from class: com.huawei.health.device.ui.measure.fragment.WifiWeightMeasureGuideFragment$$ExternalSyntheticLambda1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ecs.l(context);
            }
        });
        NoTitleCustomAlertDialog noTitleCustomAlertDialogC = builder.c();
        noTitleCustomAlertDialogC.setCancelable(false);
        noTitleCustomAlertDialogC.show();
    }

    /* JADX INFO: renamed from: lambda$showWiFiEnableDialog$2$com-huawei-health-device-ui-measure-fragment-WifiWeightMeasureGuideFragment, reason: not valid java name */
    /* synthetic */ void m952x918a1014(View view) {
        onBackPressed();
        LogUtil.a(TAG, "showWiFiEnableDialog: do nothing");
    }

    private SpannableString getSpannableString(String str, String str2) {
        if (str == null) {
            LogUtil.j(TAG, "getSpannableString guidePromptMain is null");
            str = "";
        }
        if (str2 == null) {
            LogUtil.j(TAG, "getSpannableString guidePromptSecond is null");
            str2 = "";
        }
        String str3 = str + System.lineSeparator() + System.lineSeparator() + str2;
        SpannableString spannableString = new SpannableString(str3);
        spannableString.setSpan(new TextAppearanceSpan(BaseApplication.getContext(), R.style.plugin_device_scale_guide_title_style), 0, str.length(), 33);
        spannableString.setSpan(new TextAppearanceSpan(BaseApplication.getContext(), R.style.plugin_device_scale_guide_description_style), str.length(), str3.length(), 33);
        return spannableString;
    }

    private void initHagirdeView(epn epnVar) {
        ImageView imageView = (ImageView) qsp.a(this.child, R.id.hw_wifi_device_measure_image_view);
        this.mGuideImageView = imageView;
        ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
        layoutParams.width = -1;
        layoutParams.height = qrs.d((Context) this.mainActivity, 288.0f);
        this.mGuideImageView.setLayoutParams(layoutParams);
        this.mGuideImageView.setBackgroundResource(0);
        Object obj = epnVar.d().get(0);
        if (obj instanceof Integer) {
            this.mGuideImageView.setImageResource(((Integer) obj).intValue());
        } else if (obj instanceof String) {
            this.mGuideImageView.setImageBitmap(elo.c((String) obj));
        } else {
            dyg.d(false, TAG, "initHagirdeView() imageResource is error");
        }
    }

    private void lightTheScreen() {
        this.mainActivity.getWindow().setFlags(128, 128);
    }

    private epn getMode() {
        dyg.a(false, TAG, "getmode()");
        elh elhVar = this.mProductInfo;
        if (elhVar == null || elhVar.s().size() <= 0) {
            return null;
        }
        ArrayList<elh.c> arrayListS = this.mProductInfo.s();
        if (njy.e(arrayListS)) {
            LogUtil.j(TAG, "getMode measureGuides is null or size is zero");
            return null;
        }
        epn epnVar = new epn();
        epnVar.c(getMeasureGuideImage(arrayListS));
        int i = arrayListS.size() > 3 ? 2 : 0;
        epnVar.d(getSpannableString(eru.c(arrayListS, this.mProductId, i), eru.c(arrayListS, this.mProductId, i + 1)));
        return epnVar;
    }

    private ArrayList<Object> getMeasureGuideImage(ArrayList<elh.c> arrayList) {
        LogUtil.a(TAG, " getMeasureGuideImage()");
        ArrayList<Object> arrayList2 = new ArrayList<>(10);
        Iterator<elh.c> it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(elg.e().d(this.mProductId, it.next().d()));
        }
        LogUtil.a(TAG, "guideImages:", Integer.valueOf(arrayList2.size()));
        return arrayList2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void showMeasureTimeoutDialog(Context context) {
        NoTitleCustomAlertDialog.Builder builder = new NoTitleCustomAlertDialog.Builder(context);
        builder.b(R.string.IDS_device_wifi_measure_timeout_prompt_msg).c(R.string.IDS_device_measureactivity_result_confirm, new View.OnClickListener() { // from class: com.huawei.health.device.ui.measure.fragment.WifiWeightMeasureGuideFragment$$ExternalSyntheticLambda5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f$0.m951x3a30dda1(view);
            }
        });
        NoTitleCustomAlertDialog noTitleCustomAlertDialogC = builder.c();
        noTitleCustomAlertDialogC.setCancelable(false);
        noTitleCustomAlertDialogC.show();
    }

    /* JADX INFO: renamed from: lambda$showMeasureTimeoutDialog$4$com-huawei-health-device-ui-measure-fragment-WifiWeightMeasureGuideFragment, reason: not valid java name */
    /* synthetic */ void m951x3a30dda1(View view) {
        popupFragment(WiFiProductIntroductionFragment.class);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void goToResultPage(dso dsoVar) {
        if (dsoVar != null) {
            Fragment fragmentE = dst.e(this.mProductId);
            if (dxm.y(this.mProductId)) {
                fragmentE = new WifiWeightResultFragment();
            }
            if (fragmentE == null) {
                dyg.d(false, TAG, "WeightMeasureGuideFragment handleDataChangedInUiThread fragment = null");
                return;
            }
            Bundle bundle = new Bundle();
            bundle.putSerializable("HealthData", dsoVar);
            bundle.putString("productId", this.mProductId);
            bundle.putParcelable("commonDeviceInfo", this.mDeviceInfo);
            fragmentE.setArguments(bundle);
            switchFragment(fragmentE);
            SharedPreferenceManager.e(BaseApplication.getContext(), "wifi_weight_device", "weight_notify_key", "true", null);
        }
    }

    private void registerPushInfoBroadcast() {
        dyg.a(false, TAG, "registerPushInfoBroadcast");
        IntentFilter intentFilter = new IntentFilter("com.huawei.health.action.ACTION_PUSH_DATA_DONE_ACTION");
        intentFilter.addAction("com.huawei.health.action.ACTION_PUSH_DATA_DONE_ACTION");
        BroadcastManagerUtil.d(this.mainActivity, this.mWeightPushInfoReceiver, intentFilter, LocalBroadcast.f36595c, null);
    }

    private void unRegisterPushInfoBroadcast() {
        dyg.a(false, TAG, "unRegisterPushInfoBroadcast");
        try {
            this.mainActivity.unregisterReceiver(this.mWeightPushInfoReceiver);
        } catch (IllegalArgumentException e) {
            dyg.c(false, TAG, "unRegisterPushInfoBroadcast ", e.getMessage());
        } catch (RuntimeException e2) {
            dyg.c(false, TAG, "unRegisterPushInfoBroadcast ", e2.getMessage());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void getMeasureWeightData() {
        dyg.a(false, TAG, "getMeasureWeightData mProductId is ", this.mProductId);
        eby ebyVar = !TextUtils.isEmpty(this.mUniqueId) ? (eby) dmp.d().b(this.mUniqueId, false) : null;
        long jB = ebyVar != null ? ebyVar.b() : 0L;
        dyg.a(false, TAG, "getMeasureWeightData deviceCode is:", Long.valueOf(jB));
        if (jB == 0) {
            dyg.d(false, TAG, "getMeasureWeightData deviceCode is zero");
            return;
        }
        GetBindDeviceReq getBindDeviceReq = new GetBindDeviceReq();
        getBindDeviceReq.setDeviceCode(Long.valueOf(jB));
        GetBindDeviceRsp getBindDeviceRspC = lqo.b(this.mainActivity).c(getBindDeviceReq);
        if (!checkCloudResponse(getBindDeviceRspC)) {
            dyg.d(false, TAG, "getMeasureWeightData checkCloudResponse error");
            return;
        }
        List<DeviceInfo> deviceInfos = getBindDeviceRspC.getDeviceInfos();
        if (deviceInfos == null || deviceInfos.isEmpty()) {
            dyg.d(false, TAG, "getMeasureWeightData deviceInfos is null");
            return;
        }
        String uniqueId = deviceInfos.get(0).getUniqueId();
        dyg.a(false, TAG, "getMeasureWeightData deviceUUID is:", CommonUtil.n(uniqueId));
        if (uniqueId == null) {
            dyg.d(false, TAG, "getMeasureWeightData error, deviceUUID is null");
        } else {
            dyg.a(false, TAG, "mStartTime:", Long.valueOf(this.mStartTime), "|mEndTime:", Long.valueOf(this.mEndTime));
            statisticHiHealthData(getHiAggregateOption(uniqueId, new int[]{10006}, new String[]{BleConstants.WEIGHT_KEY}));
        }
    }

    private boolean checkCloudResponse(GetBindDeviceRsp getBindDeviceRsp) {
        if (getBindDeviceRsp == null) {
            LogUtil.j(TAG, "checkCloudResponse response is null");
            return false;
        }
        Integer resultCode = getBindDeviceRsp.getResultCode();
        int iIntValue = resultCode.intValue();
        LogUtil.a(TAG, "checkCloudResponse response resultCode is,", resultCode);
        return iIntValue == 0;
    }

    private void statisticHiHealthData(HiAggregateOption hiAggregateOption) {
        HiHealthManager.d(this.mainActivity).aggregateHiHealthData(hiAggregateOption, new HiAggregateListener() { // from class: com.huawei.health.device.ui.measure.fragment.WifiWeightMeasureGuideFragment.2
            @Override // com.huawei.hihealth.data.listener.HiAggregateListener
            public void onResultIntent(int i, List<HiHealthData> list, int i2, int i3) {
            }

            @Override // com.huawei.hihealth.data.listener.HiAggregateListener
            public void onResult(List<HiHealthData> list, int i, int i2) {
                WifiWeightMeasureGuideFragment.this.handleWeightData(list);
            }
        });
    }

    private HiAggregateOption getHiAggregateOption(String str, int[] iArr, String[] strArr) {
        HiAggregateOption hiAggregateOption = new HiAggregateOption();
        hiAggregateOption.setTimeRange(this.mStartTime, this.mEndTime);
        hiAggregateOption.setType(iArr);
        hiAggregateOption.setGroupUnitType(0);
        hiAggregateOption.setAggregateType(1);
        hiAggregateOption.setSortOrder(1);
        hiAggregateOption.setFilter("");
        hiAggregateOption.setConstantsKey(strArr);
        hiAggregateOption.setCount(1);
        hiAggregateOption.setDeviceUuid(str);
        return hiAggregateOption;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void handleWeightData(List<HiHealthData> list) {
        if (njy.e(list)) {
            LogUtil.j(TAG, "handleWeightData datas is null or empty");
            return;
        }
        double d = list.get(0).getDouble("bodyWeight");
        double d2 = list.get(0).getDouble(BleConstants.BODY_FAT_RATE);
        String string = Long.toString(list.get(0).getStartTime());
        dso dsoVar = new dso();
        dsoVar.setWeight((float) d);
        dsoVar.setBodyFatRat((float) d2);
        dsoVar.b(string);
        String metaData = list.get(0).getMetaData();
        if (metaData == null || metaData.length() == 0) {
            metaData = MultiUsersManager.INSTANCE.getMainUser().i();
        }
        if (Constants.NULL.equalsIgnoreCase(metaData) || "0".equals(metaData)) {
            metaData = MultiUsersManager.INSTANCE.getMainUser().i();
        }
        if ("-1".equals(metaData)) {
            dsoVar.e(true);
            dsoVar.a("");
        } else {
            dsoVar.e(false);
            dsoVar.a(metaData);
        }
        Message messageObtain = Message.obtain();
        messageObtain.what = 100;
        messageObtain.obj = dsoVar;
        this.myHandler.sendMessage(messageObtain);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void syncNewWeightData() {
        HiSyncOption hiSyncOption = new HiSyncOption();
        hiSyncOption.setSyncModel(2);
        hiSyncOption.setSyncAction(2);
        hiSyncOption.setSyncDataType(DicDataTypeUtil.DataType.WEIGHT_BODYFAT_BROAD.value());
        hiSyncOption.setSyncScope(1);
        hiSyncOption.setSyncMethod(2);
        hiSyncOption.setPushAction(2);
        dyg.a(false, TAG, "processPushMsg, startSync,time:", ltb.d(new Date()));
        HiHealthNativeApi.a(this.mainActivity).synCloud(hiSyncOption, null);
    }

    private void checkDevice() {
        dyg.a(false, TAG, "checkDevice() checkDevice mProductId:", this.mProductId);
        if (dmp.d().b(this.mUniqueId, false) instanceof eby) {
            final eby ebyVar = (eby) dmp.d().b(this.mUniqueId, false);
            if (ebyVar == null) {
                dyg.a(false, TAG, "checkDevice() mWiFiDevice is null");
                Message messageObtain = Message.obtain();
                messageObtain.what = 104;
                this.myHandler.sendMessage(messageObtain);
                return;
            }
            WifiDeviceGetWifiDeviceInfoReq wifiDeviceGetWifiDeviceInfoReq = new WifiDeviceGetWifiDeviceInfoReq();
            wifiDeviceGetWifiDeviceInfoReq.setDevId(ebyVar.a().c());
            lqo.b(this.mainActivity).b(wifiDeviceGetWifiDeviceInfoReq, new ICloudOperationResult() { // from class: com.huawei.health.device.ui.measure.fragment.WifiWeightMeasureGuideFragment$$ExternalSyntheticLambda2
                @Override // com.huawei.hwcloudmodel.callback.ICloudOperationResult
                public final void operationResult(Object obj, String str, boolean z) {
                    this.f$0.m948xac4b51e(ebyVar, (WifiDeviceGetWifiDeviceInfoRsp) obj, str, z);
                }
            });
            return;
        }
        LogUtil.j(TAG, "DeviceManager.getInstance().getBondedDeviceByUniqueId(mUniqueId, false) not instanceof WiFiDevice");
    }

    /* JADX INFO: renamed from: lambda$checkDevice$5$com-huawei-health-device-ui-measure-fragment-WifiWeightMeasureGuideFragment, reason: not valid java name */
    /* synthetic */ void m948xac4b51e(eby ebyVar, WifiDeviceGetWifiDeviceInfoRsp wifiDeviceGetWifiDeviceInfoRsp, String str, boolean z) {
        if (!z) {
            handleDeviceNotExist(wifiDeviceGetWifiDeviceInfoRsp, ebyVar);
            return;
        }
        if (wifiDeviceGetWifiDeviceInfoRsp == null || wifiDeviceGetWifiDeviceInfoRsp.getDeviceDetailInfo() != null) {
            dyg.a(false, TAG, "checkDevice() device already exists");
            return;
        }
        dyg.a(false, TAG, "checkDevice() device already not exists");
        Message messageObtain = Message.obtain();
        messageObtain.obj = ebyVar.e();
        messageObtain.what = 104;
        this.myHandler.sendMessage(messageObtain);
    }

    private void handleDeviceNotExist(WifiDeviceGetWifiDeviceInfoRsp wifiDeviceGetWifiDeviceInfoRsp, eby ebyVar) {
        int iIntValue;
        String resultDesc;
        if (wifiDeviceGetWifiDeviceInfoRsp == null) {
            iIntValue = Constants.CODE_UNKNOWN_ERROR;
            resultDesc = "unknown error";
        } else {
            iIntValue = wifiDeviceGetWifiDeviceInfoRsp.getResultCode().intValue();
            resultDesc = wifiDeviceGetWifiDeviceInfoRsp.getResultDesc();
            if (iIntValue == 112000000) {
                dyg.a(false, TAG, "device already not exists");
                Message messageObtain = Message.obtain();
                messageObtain.obj = ebyVar.e();
                messageObtain.what = 104;
                this.myHandler.sendMessage(messageObtain);
            }
        }
        dyg.a(false, TAG, "handleCheckDeviceSuccess() errCode = ", Integer.valueOf(iIntValue), ",resultDesc:", resultDesc);
    }

    @Override // com.huawei.health.ecologydevice.ui.BaseFragment, androidx.fragment.app.Fragment, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        LogUtil.a(TAG, "onConfigurationChanged, refresh page");
        refreshImageLayout();
        super.onConfigurationChanged(configuration);
    }

    private void refreshImageLayout() {
        LinearLayout linearLayout = this.mMessureGuideImageLayout;
        if (linearLayout != null) {
            qrs.b(linearLayout, 2);
        }
    }
}
