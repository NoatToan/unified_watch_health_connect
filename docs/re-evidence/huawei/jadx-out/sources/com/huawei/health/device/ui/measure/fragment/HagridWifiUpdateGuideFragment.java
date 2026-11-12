package com.huawei.health.device.ui.measure.fragment;

import android.content.ContentValues;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.browser.customtabs.CustomTabsCallback;
import androidx.fragment.app.FragmentActivity;
import com.huawei.health.device.connectivity.comm.MeasurableDevice;
import com.huawei.health.device.wifi.lib.handler.StaticHandler;
import com.huawei.health.ecologydevice.manager.ResourceManager;
import com.huawei.health.ecologydevice.ui.BaseFragment;
import com.huawei.hwcloudmodel.callback.ICloudOperationResult;
import com.huawei.hwcloudmodel.model.unite.WifiDeviceGetDeviceStatusReq;
import com.huawei.hwcloudmodel.model.unite.WifiDeviceGetDeviceStatusRsp;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.plugindevice.R;
import com.huawei.ui.commonui.button.HealthButton;
import com.huawei.ui.commonui.dialog.CustomTextAlertDialog;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import defpackage.dmp;
import defpackage.dxm;
import defpackage.dys;
import defpackage.ean;
import defpackage.eas;
import defpackage.eby;
import defpackage.ecj;
import defpackage.elg;
import defpackage.elh;
import defpackage.elo;
import defpackage.era;
import defpackage.lqo;
import defpackage.qpx;
import defpackage.qre;
import defpackage.qsp;
import health.compact.a.SharedPreferenceManager;

/* JADX INFO: loaded from: classes7.dex */
public class HagridWifiUpdateGuideFragment extends BaseFragment {
    private static final String KEY_HAGRID_FIRST_UPGRADE_MARK = "hagride_first_update";
    private static final int MSG_GET_DEVICE_STATUS_FAIL = 2;
    private static final int MSG_GET_DEVICE_STATUS_SUCCESS = 1;
    private static final int MSG_SHOW_AUTO_UPGRADE_DIALOG = 3;
    private static final float NEXT_BUTTON = 0.3f;
    private static final String TAG = "HagridWifiUpdateGuideFragment";
    private static final String TAG_RELEASE = "R_Weight_HagridWifiUpdateGuideFragment";
    private String mDeviceId;
    private ContentValues mDeviceInfo;
    private ImageView mGuideLogo;
    private String mProductId = null;
    private eby mWiFiDevice = null;
    private Handler mWiFiHandler = null;
    private String mNewVer = null;
    private String mReleaseNote = null;
    private String mNowVersion = null;
    private HealthTextView mGuideNode = null;
    private HealthButton mNextBtn = null;

    @Override // com.huawei.health.ecologydevice.ui.BaseFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
    }

    @Override // com.huawei.health.ecologydevice.ui.BaseFragment, androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) throws Throwable {
        ViewGroup viewGroup2 = super.onCreateView(layoutInflater, viewGroup, bundle) instanceof ViewGroup ? (ViewGroup) super.onCreateView(layoutInflater, viewGroup, bundle) : null;
        this.child = layoutInflater.inflate(R.layout.wifi_update_guide_layout, viewGroup, false);
        initView();
        initData();
        if (viewGroup2 != null) {
            viewGroup2.addView(this.child);
        }
        return viewGroup2;
    }

    private void initView() {
        setTitle(this.mainActivity.getString(R.string.IDS_device_scale_device_firmware_version));
        HealthTextView healthTextView = (HealthTextView) qsp.a(this.child, R.id.wifi_guide_node);
        this.mGuideNode = healthTextView;
        healthTextView.setText(R.string.IDS_device_wifi_ota_update_prompt_msg);
        this.mNextBtn = (HealthButton) qsp.a(this.child, R.id.next_btn);
        this.mGuideLogo = (ImageView) qsp.a(this.child, R.id.wifi_device_logo);
        final Context context = BaseApplication.getContext();
        this.mNextBtn.setOnClickListener(new View.OnClickListener() { // from class: com.huawei.health.device.ui.measure.fragment.HagridWifiUpdateGuideFragment$$ExternalSyntheticLambda5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f$0.m891x21c51ff(context, view);
            }
        });
    }

    /* JADX INFO: renamed from: lambda$initView$1$com-huawei-health-device-ui-measure-fragment-HagridWifiUpdateGuideFragment, reason: not valid java name */
    /* synthetic */ void m891x21c51ff(Context context, View view) {
        if (!ecj.b(context)) {
            LogUtil.j(TAG_RELEASE, "upgrade network disconnected");
            qpx.e(context, R.string.IDS_device_wifi_not_network);
            return;
        }
        this.mNextBtn.setAlpha(NEXT_BUTTON);
        this.mNextBtn.setEnabled(false);
        WifiDeviceGetDeviceStatusReq wifiDeviceGetDeviceStatusReq = new WifiDeviceGetDeviceStatusReq();
        wifiDeviceGetDeviceStatusReq.setDevId(getDevId());
        lqo.b(context).c(wifiDeviceGetDeviceStatusReq, new ICloudOperationResult() { // from class: com.huawei.health.device.ui.measure.fragment.HagridWifiUpdateGuideFragment$$ExternalSyntheticLambda1
            @Override // com.huawei.hwcloudmodel.callback.ICloudOperationResult
            public final void operationResult(Object obj, String str, boolean z) {
                this.f$0.m890xc00524a0((WifiDeviceGetDeviceStatusRsp) obj, str, z);
            }
        });
    }

    /* JADX INFO: renamed from: lambda$initView$0$com-huawei-health-device-ui-measure-fragment-HagridWifiUpdateGuideFragment, reason: not valid java name */
    /* synthetic */ void m890xc00524a0(WifiDeviceGetDeviceStatusRsp wifiDeviceGetDeviceStatusRsp, String str, boolean z) {
        LogUtil.a(TAG, "get device status: ", wifiDeviceGetDeviceStatusRsp, ", text: ", str, ", is success: ", Boolean.valueOf(z));
        Message messageObtain = Message.obtain();
        if (wifiDeviceGetDeviceStatusRsp != null && !TextUtils.isEmpty(wifiDeviceGetDeviceStatusRsp.getStatus()) && wifiDeviceGetDeviceStatusRsp.getStatus().equals(CustomTabsCallback.ONLINE_EXTRAS_KEY)) {
            if (isFirstUpgtade() && !isOpenAutoUpgrade()) {
                messageObtain.what = 3;
            } else {
                messageObtain.what = 1;
            }
        } else {
            messageObtain.what = 2;
        }
        this.mWiFiHandler.sendMessage(messageObtain);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void showAutoUpgtadeDialog() {
        CustomTextAlertDialog.Builder builder = new CustomTextAlertDialog.Builder(this.mainActivity);
        builder.a(R.string.IDS_device_scale_hygride_wlan_ota_auto_title).b(R.string.IDS_device_scale_hygride_wlan_ota_auto_content).e(R.string.IDS_device_hygride_button_cancel, new View.OnClickListener() { // from class: com.huawei.health.device.ui.measure.fragment.HagridWifiUpdateGuideFragment$$ExternalSyntheticLambda3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f$0.m894x6749aa17(view);
            }
        }).a(R.string.IDS_device_scale_hygride_wlan_ota_auto_open, new View.OnClickListener() { // from class: com.huawei.health.device.ui.measure.fragment.HagridWifiUpdateGuideFragment$$ExternalSyntheticLambda4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f$0.m895xa960d776(view);
            }
        });
        CustomTextAlertDialog customTextAlertDialogB = builder.b();
        customTextAlertDialogB.setCancelable(false);
        customTextAlertDialogB.show();
    }

    /* JADX INFO: renamed from: lambda$showAutoUpgtadeDialog$2$com-huawei-health-device-ui-measure-fragment-HagridWifiUpdateGuideFragment, reason: not valid java name */
    /* synthetic */ void m894x6749aa17(View view) {
        setFirstUpgtadeMark();
        this.mWiFiHandler.sendEmptyMessage(1);
    }

    /* JADX INFO: renamed from: lambda$showAutoUpgtadeDialog$3$com-huawei-health-device-ui-measure-fragment-HagridWifiUpdateGuideFragment, reason: not valid java name */
    /* synthetic */ void m895xa960d776(View view) {
        openAutoUpgrade();
        setFirstUpgtadeMark();
        this.mWiFiHandler.sendEmptyMessage(1);
    }

    private void openAutoUpgrade() {
        eby ebyVar = this.mWiFiDevice;
        if (ebyVar == null) {
            LogUtil.j(TAG_RELEASE, "openAutoUpgrade mWiFiDevice is null");
        } else {
            ean.c(ebyVar.e(), "1", new ICloudOperationResult() { // from class: com.huawei.health.device.ui.measure.fragment.HagridWifiUpdateGuideFragment$$ExternalSyntheticLambda0
                @Override // com.huawei.hwcloudmodel.callback.ICloudOperationResult
                public final void operationResult(Object obj, String str, boolean z) {
                    this.f$0.m892x44952cc8(obj, str, z);
                }
            });
        }
    }

    /* JADX INFO: renamed from: lambda$openAutoUpgrade$4$com-huawei-health-device-ui-measure-fragment-HagridWifiUpdateGuideFragment, reason: not valid java name */
    /* synthetic */ void m892x44952cc8(Object obj, String str, boolean z) {
        if (z) {
            eas.b(this.mWiFiDevice.e(), "1");
        }
        LogUtil.a(TAG, "openAutoUpgrade isSuccess:", Boolean.valueOf(z));
    }

    private String getDevId() {
        eby ebyVar = this.mWiFiDevice;
        if (ebyVar != null && ebyVar.a() != null) {
            LogUtil.a(TAG, "device info");
            String strC = this.mWiFiDevice.a().c();
            if (!TextUtils.isEmpty(strC)) {
                return strC;
            }
            LogUtil.j(TAG, "getDevId deviceId isEmpty");
            return this.mDeviceId;
        }
        LogUtil.j(TAG, "device id is null");
        return null;
    }

    private void initData() throws Throwable {
        this.mWiFiHandler = new WifiHandler();
        if (getArguments() != null) {
            this.mNewVer = getArguments().getString("version");
            this.mNowVersion = getArguments().getString("cer_version");
            this.mReleaseNote = getArguments().getString("update_nodes");
            this.mDeviceId = getArguments().getString("devId");
            ContentValues contentValues = (ContentValues) getArguments().getParcelable("commonDeviceInfo");
            this.mDeviceInfo = contentValues;
            if (contentValues != null) {
                this.mProductId = contentValues.getAsString("productId");
            }
            ContentValues contentValues2 = this.mDeviceInfo;
            if (contentValues2 != null && !TextUtils.isEmpty(contentValues2.getAsString("uniqueId"))) {
                MeasurableDevice measurableDeviceB = dmp.d().b(this.mDeviceInfo.getAsString("uniqueId"), false);
                if (measurableDeviceB instanceof eby) {
                    this.mWiFiDevice = (eby) measurableDeviceB;
                } else {
                    LogUtil.j(TAG, "measurableDevice not instanceof WiFiDevice");
                }
            } else {
                LogUtil.j(TAG_RELEASE, "productId is empty, can't get WiFiDevice");
            }
        } else {
            LogUtil.j(TAG_RELEASE, "Arguments is null");
        }
        if (dxm.y(this.mProductId)) {
            if (dxm.u(this.mProductId)) {
                showGuideVersionLogo();
            } else if ("b29df4e3-b1f7-4e40-960d-4cfb63ccca05".equals(this.mProductId)) {
                era.d(this.mGuideLogo, this.mProductId);
            } else {
                this.mGuideLogo.setImageResource(R.drawable.hagrid_device_ota_upgrade_guide_img);
            }
        } else {
            era.d(this.mGuideLogo, this.mProductId);
        }
        if (this.mWiFiDevice != null) {
            setRightTitleButton();
        }
    }

    private void showGuideVersionLogo() throws Throwable {
        elh elhVarD = ResourceManager.c().d(this.mProductId);
        if (elhVarD != null) {
            String strC = elhVarD.c("device_ota_img");
            if (TextUtils.isEmpty(strC)) {
                LogUtil.j(TAG, "initData img = null");
                return;
            }
            String strD = elg.e().d(this.mProductId, strC);
            LogUtil.a(TAG, "set Device img image = ", strD);
            if (TextUtils.isEmpty(strD)) {
                return;
            }
            Bitmap bitmapC = elo.c(strD);
            if (bitmapC != null) {
                LogUtil.a(TAG, "initData bitmap != null");
                this.mGuideLogo.setImageBitmap(bitmapC);
            } else {
                LogUtil.j(TAG, "initData bitmap = null");
            }
        }
    }

    private void setRightTitleButton() {
        this.mCustomTitleBar.setRightButtonDrawable(getResources().getDrawable(R.drawable.haiger_ota_setting), qre.f(R.string.IDS_main_btn_state_settings));
        this.mCustomTitleBar.setRightButtonClickable(true);
        this.mCustomTitleBar.setRightButtonVisibility(0);
        this.mCustomTitleBar.setRightButtonOnClickListener(new View.OnClickListener() { // from class: com.huawei.health.device.ui.measure.fragment.HagridWifiUpdateGuideFragment$$ExternalSyntheticLambda2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f$0.m893x22a0611a(view);
            }
        });
    }

    /* JADX INFO: renamed from: lambda$setRightTitleButton$5$com-huawei-health-device-ui-measure-fragment-HagridWifiUpdateGuideFragment, reason: not valid java name */
    /* synthetic */ void m893x22a0611a(View view) {
        if (this.mWiFiDevice != null) {
            HagridOtaSettingFragment hagridOtaSettingFragment = new HagridOtaSettingFragment();
            Bundle bundle = new Bundle();
            bundle.putString("deviceId", this.mWiFiDevice.e());
            hagridOtaSettingFragment.setArguments(bundle);
            switchFragment(hagridOtaSettingFragment);
            return;
        }
        LogUtil.j(TAG_RELEASE, "setRightTitleButton mWiFiDevice is null");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean isDestroy() {
        FragmentActivity activity = getActivity();
        return activity == null || activity.isFinishing() || activity.isDestroyed();
    }

    static class WifiHandler extends StaticHandler<HagridWifiUpdateGuideFragment> {
        private WifiHandler(HagridWifiUpdateGuideFragment hagridWifiUpdateGuideFragment) {
            super(hagridWifiUpdateGuideFragment);
        }

        @Override // com.huawei.health.device.wifi.lib.handler.StaticHandler
        public void handleMessage(HagridWifiUpdateGuideFragment hagridWifiUpdateGuideFragment, Message message) {
            if (hagridWifiUpdateGuideFragment == null) {
                LogUtil.j(HagridWifiUpdateGuideFragment.TAG, "object is null.");
                return;
            }
            if (message != null) {
                if (hagridWifiUpdateGuideFragment.isDestroy()) {
                    return;
                }
                if (!hagridWifiUpdateGuideFragment.isAdded()) {
                    LogUtil.j(HagridWifiUpdateGuideFragment.TAG, "WifiHandler mFragment is not add");
                    return;
                } else {
                    LogUtil.a(HagridWifiUpdateGuideFragment.TAG, "WifiHandler what: ", Integer.valueOf(message.what));
                    processHandler(hagridWifiUpdateGuideFragment, message);
                    return;
                }
            }
            LogUtil.j(HagridWifiUpdateGuideFragment.TAG, "msg is null.");
        }

        private void processHandler(HagridWifiUpdateGuideFragment hagridWifiUpdateGuideFragment, Message message) {
            int i = message.what;
            if (i != 1) {
                if (i == 2) {
                    hagridWifiUpdateGuideFragment.mNextBtn.setAlpha(1.0f);
                    hagridWifiUpdateGuideFragment.mNextBtn.setEnabled(true);
                    dys.a().d((Context) hagridWifiUpdateGuideFragment.mainActivity);
                    return;
                } else if (i == 3) {
                    hagridWifiUpdateGuideFragment.showAutoUpgtadeDialog();
                    return;
                } else {
                    LogUtil.j(HagridWifiUpdateGuideFragment.TAG_RELEASE, "Handler what is other");
                    return;
                }
            }
            hagridWifiUpdateGuideFragment.mNextBtn.setAlpha(1.0f);
            hagridWifiUpdateGuideFragment.mNextBtn.setEnabled(true);
            Bundle bundle = new Bundle();
            bundle.putString("productId", hagridWifiUpdateGuideFragment.mProductId);
            bundle.putParcelable("commonDeviceInfo", hagridWifiUpdateGuideFragment.mDeviceInfo);
            bundle.putString("version", hagridWifiUpdateGuideFragment.mNewVer);
            bundle.putString("cer_version", hagridWifiUpdateGuideFragment.mNowVersion);
            bundle.putString("update_nodes", hagridWifiUpdateGuideFragment.mReleaseNote);
            HagridWiFiOtaUpdateFragment hagridWiFiOtaUpdateFragment = new HagridWiFiOtaUpdateFragment();
            hagridWiFiOtaUpdateFragment.setArguments(bundle);
            hagridWifiUpdateGuideFragment.switchFragment(hagridWiFiOtaUpdateFragment);
        }
    }

    private boolean isOpenAutoUpgrade() {
        return "1".equals(eas.e(this.mWiFiDevice.e()));
    }

    private boolean isFirstUpgtade() {
        if (this.mWiFiDevice == null) {
            return false;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(this.mWiFiDevice.e());
        sb.append(KEY_HAGRID_FIRST_UPGRADE_MARK);
        return TextUtils.isEmpty(SharedPreferenceManager.e(BaseApplication.getContext(), String.valueOf(10000), sb.toString()));
    }

    private void setFirstUpgtadeMark() {
        LogUtil.a(TAG, "setFirstUpgtadeMark result:", Integer.valueOf(SharedPreferenceManager.e(BaseApplication.getContext(), String.valueOf(10000), this.mWiFiDevice.e() + KEY_HAGRID_FIRST_UPGRADE_MARK, String.valueOf(System.currentTimeMillis()), null)));
    }
}
