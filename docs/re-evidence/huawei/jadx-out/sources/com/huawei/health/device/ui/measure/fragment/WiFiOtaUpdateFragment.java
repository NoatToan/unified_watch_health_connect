package com.huawei.health.device.ui.measure.fragment;

import android.content.ContentValues;
import android.os.Bundle;
import android.os.Message;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.fragment.app.FragmentActivity;
import com.huawei.health.device.ui.util.RoundProgressView;
import com.huawei.health.device.wifi.interfaces.BaseCallbackInterface;
import com.huawei.health.device.wifi.interfaces.CommBaseCallbackInterface;
import com.huawei.health.device.wifi.lib.handler.StaticHandler;
import com.huawei.health.ecologydevice.ui.BaseFragment;
import com.huawei.hwcloudmodel.callback.ICloudOperationResult;
import com.huawei.hwcloudmodel.model.CloudCommonReponse;
import com.huawei.hwcloudmodel.model.unite.DeviceServiceInfo;
import com.huawei.hwcloudmodel.model.unite.WifiDeviceControlDataModelReq;
import com.huawei.plugindevice.R;
import com.huawei.ui.commonui.button.HealthButton;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import defpackage.dmp;
import defpackage.dyg;
import defpackage.dyj;
import defpackage.ean;
import defpackage.eas;
import defpackage.eby;
import defpackage.ecr;
import defpackage.lqo;
import defpackage.qpx;
import defpackage.qrs;
import defpackage.qsp;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes7.dex */
public class WiFiOtaUpdateFragment extends BaseFragment implements View.OnClickListener {
    private static final float ALPHA_FLOAT = 0.3f;
    private static final float ALPHA_FLOAT_1 = 1.0f;
    private static final int COLLECTION_DEFAULT_SIZE = 16;
    private static final int MSG_UPDATE_END = 4;
    private static final int MSG_UPDATE_FAIL = 3;
    private static final int MSG_UPDATE_SUCCESS = 2;
    private static final int MSG_UPDATING = 1;
    private static final String PRODUCT_ID = "productId";
    private static final String TAG = "WiFiOtaUpdateFragment";
    private BaseCallbackInterface mBaseCallback;
    private ImageView mVersionLogo;
    private String mProductId = null;
    private String mUniqueId = null;
    private ContentValues mDeviceInfo = null;
    private String mNewVer = null;
    private String mReleaseNote = null;
    private String mNowVersion = null;
    private boolean mIsFromProductView = false;
    private HealthTextView mNowVersionText = null;
    private HealthTextView mNoNewVersionText = null;
    private HealthTextView mNewVersionText = null;
    private LinearLayout mLatestVersionLayout = null;
    private LinearLayout mNowVersionLayout = null;
    private WifiHandler mHandler = null;
    private RoundProgressView mRoundProgress = null;
    private HealthButton mCheckVersionUpdate = null;
    private eby mWiFiDevice = null;

    @Override // com.huawei.health.ecologydevice.ui.BaseFragment, androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        ViewGroup viewGroup2 = super.onCreateView(layoutInflater, viewGroup, bundle) instanceof ViewGroup ? (ViewGroup) super.onCreateView(layoutInflater, viewGroup, bundle) : null;
        this.child = layoutInflater.inflate(R.layout.wifi_upgrade_layout, viewGroup, false);
        initView();
        initData();
        if (viewGroup2 != null) {
            viewGroup2.addView(this.child);
        }
        return viewGroup2;
    }

    private void initView() {
        setTitle(this.mainActivity.getString(R.string.IDS_device_wear_home_device_ota_upgrade));
        this.mNowVersionText = (HealthTextView) qsp.a(this.child, R.id.now_version_nodes_tv);
        this.mNoNewVersionText = (HealthTextView) qsp.a(this.child, R.id.no_new_version_tv);
        this.mNewVersionText = (HealthTextView) qsp.a(this.child, R.id.new_version_tv);
        this.mVersionLogo = (ImageView) qsp.a(this.child, R.id.image_logo);
        this.mLatestVersionLayout = (LinearLayout) qsp.a(this.child, R.id.latest_version_button);
        this.mRoundProgress = (RoundProgressView) qsp.a(this.child, R.id.version_update_anim);
        this.mCheckVersionUpdate = (HealthButton) qsp.a(this.child, R.id.check_version_update);
        LinearLayout linearLayout = (LinearLayout) qsp.a(this.child, R.id.now_version_layout);
        this.mNowVersionLayout = linearLayout;
        linearLayout.setEnabled(false);
        this.mLatestVersionLayout.setOnClickListener(this);
        this.mCheckVersionUpdate.setOnClickListener(this);
        this.mLatestVersionLayout.setVisibility(0);
        this.mCheckVersionUpdate.setText(R.string.IDS_update_new_version_ok);
    }

    private void initData() {
        this.mBaseCallback = new OtaStatusCallback(this);
        this.mHandler = new WifiHandler();
        if (getArguments() != null) {
            ContentValues contentValues = (ContentValues) getArguments().getParcelable("commonDeviceInfo");
            this.mDeviceInfo = contentValues;
            if (contentValues != null) {
                this.mProductId = contentValues.getAsString("productId");
                this.mUniqueId = this.mDeviceInfo.getAsString("uniqueId");
            }
            this.mNewVer = getArguments().getString("version");
            this.mNowVersion = getArguments().getString("cer_version");
            this.mReleaseNote = getArguments().getString("update_nodes");
            this.mNewVersionText.setText(this.mNewVer);
            this.mNowVersionText.setText(this.mNowVersion);
            this.mIsFromProductView = getArguments().getBoolean("fromProductView");
            if (!TextUtils.isEmpty(this.mProductId)) {
                if (dmp.d().b(this.mUniqueId, false) instanceof eby) {
                    this.mWiFiDevice = (eby) dmp.d().b(this.mUniqueId, false);
                }
            } else {
                dyg.a(false, TAG, "productId is empty, can't get WiFiDevice");
            }
            if (this.mWiFiDevice == null) {
                dyg.a(false, TAG, "initData WiFiDevice is empty");
                popupFragment(WiFiProductIntroductionFragment.class);
            } else {
                if ("a8ba095d-4123-43c4-a30a-0240011c58de".equals(this.mProductId)) {
                    this.mVersionLogo.setImageResource(R.drawable.wifi_device_honor_ota_logo);
                }
                isFromProductView();
            }
        }
    }

    private void isFromProductView() {
        if (this.mIsFromProductView) {
            Map<String, String> mapC = eas.b().c(this.mWiFiDevice.e());
            String str = mapC != null ? mapC.get("status") : null;
            if ("3".equals(str)) {
                Message messageObtain = Message.obtain();
                messageObtain.what = 4;
                this.mHandler.sendMessage(messageObtain);
                return;
            } else {
                if ("2".equals(str)) {
                    dyg.a(false, TAG, "start update");
                    this.mLatestVersionLayout.setEnabled(false);
                    dyj.h();
                    setCheckVersionUpdateEnable(1);
                    ecr.a(this.mainActivity.getApplicationContext()).a(this.mUniqueId, this.mBaseCallback);
                    this.mRoundProgress.e();
                    return;
                }
                dyg.d(false, TAG, "initData default");
                return;
            }
        }
        startUpgrade();
    }

    private void startUpgrade() {
        dyg.a(false, TAG, "start update");
        this.mLatestVersionLayout.setEnabled(false);
        dyj.h();
        setCheckVersionUpdateEnable(1);
        this.mRoundProgress.e();
        updatingVersion("CH");
    }

    private void updatingVersion(String str) {
        WifiDeviceControlDataModelReq wifiDeviceControlDataModelReq = new WifiDeviceControlDataModelReq();
        ArrayList arrayList = new ArrayList(16);
        HashMap map = new HashMap(16);
        wifiDeviceControlDataModelReq.setDeviceServiceInfo(arrayList);
        eby ebyVar = this.mWiFiDevice;
        if (ebyVar != null && ebyVar.a() != null) {
            wifiDeviceControlDataModelReq.setDevId(this.mWiFiDevice.a().c());
            dyg.e(false, TAG, "update device id: ", dyg.d(this.mWiFiDevice.a().c()));
        } else {
            dyg.e(false, TAG, "update device id is null");
        }
        map.put("event", "2");
        map.put("version", str);
        DeviceServiceInfo deviceServiceInfo = new DeviceServiceInfo();
        deviceServiceInfo.setData(map);
        deviceServiceInfo.setSid("setDevParam");
        arrayList.add(deviceServiceInfo);
        dyg.a(false, TAG, "version: ", map.get("version"), ", event: ", map.get("event"), ", sid: ", deviceServiceInfo.getSid());
        lqo.b(this.mainActivity.getApplicationContext()).e(wifiDeviceControlDataModelReq, new ICloudOperationResult() { // from class: com.huawei.health.device.ui.measure.fragment.WiFiOtaUpdateFragment$$ExternalSyntheticLambda0
            @Override // com.huawei.hwcloudmodel.callback.ICloudOperationResult
            public final void operationResult(Object obj, String str2, boolean z) {
                this.f$0.m922xb17d466e((CloudCommonReponse) obj, str2, z);
            }
        });
    }

    /* JADX INFO: renamed from: lambda$updatingVersion$0$com-huawei-health-device-ui-measure-fragment-WiFiOtaUpdateFragment, reason: not valid java name */
    /* synthetic */ void m922xb17d466e(CloudCommonReponse cloudCommonReponse, String str, boolean z) {
        dyg.a(false, TAG, "send update version. cloudCommonReponse: ", cloudCommonReponse, ", text: ", str, ", is success: ", Boolean.valueOf(z));
        Message messageObtain = Message.obtain();
        if (z) {
            messageObtain.what = 2;
        } else {
            messageObtain.what = 3;
        }
        this.mHandler.sendMessage(messageObtain);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean isDestroy() {
        FragmentActivity activity = getActivity();
        if (activity != null && !activity.isFinishing() && !activity.isDestroyed()) {
            return false;
        }
        dyg.c(false, TAG, "DeviceMainActivity is Destroyed");
        return true;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (view.getId() == R.id.latest_version_button) {
            Bundle bundle = new Bundle();
            bundle.putString("productId", this.mProductId);
            bundle.putString("version", this.mNewVer);
            bundle.putString("cer_version", this.mNowVersion);
            bundle.putString("update_nodes", this.mReleaseNote);
            WiFiVersionDetailsFragment wiFiVersionDetailsFragment = new WiFiVersionDetailsFragment();
            bundle.putParcelable("commonDeviceInfo", this.mDeviceInfo);
            wiFiVersionDetailsFragment.setArguments(bundle);
            switchFragment(wiFiVersionDetailsFragment);
            return;
        }
        if (view.getId() == R.id.check_version_update) {
            if (view.getTag() != null) {
                if (qrs.a(view.getTag().toString()) == 1) {
                    dyg.a(false, TAG, "updating...");
                    return;
                }
                if (qrs.a(view.getTag().toString()) == 3) {
                    dyg.a(false, TAG, "update fail...");
                    startUpgrade();
                    return;
                } else if (qrs.a(view.getTag().toString()) == 2) {
                    dyg.a(false, TAG, "update success...");
                    onBackPressed();
                    return;
                } else {
                    dyg.d(false, TAG, "onClick default");
                    return;
                }
            }
            startUpgrade();
            return;
        }
        dyg.a(false, TAG, "--------no click------");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCheckVersionUpdateEnable(int i) {
        if (i == 1) {
            this.mNoNewVersionText.setText(R.string.IDS_app_update_updating);
            this.mCheckVersionUpdate.setAlpha(ALPHA_FLOAT);
            this.mCheckVersionUpdate.setEnabled(false);
            this.mCheckVersionUpdate.setText(R.string.IDS_ota_update_state_upgrading);
        } else if (i == 2) {
            this.mNoNewVersionText.setText(R.string.IDS_settings_firmware_upgrade_talk_band_succeed);
            this.mCheckVersionUpdate.setAlpha(1.0f);
            this.mCheckVersionUpdate.setEnabled(true);
            this.mCheckVersionUpdate.setText(R.string.IDS_device_show_complete);
        } else if (i == 3) {
            this.mNoNewVersionText.setText(R.string.IDS_settings_firmware_upgrade_talk_band_failed);
            this.mCheckVersionUpdate.setAlpha(1.0f);
            this.mCheckVersionUpdate.setEnabled(true);
            this.mCheckVersionUpdate.setText(R.string.IDS_retry);
        } else {
            dyg.a(false, TAG, "check is empty");
        }
        this.mCheckVersionUpdate.setTag(Integer.valueOf(i));
    }

    static class WifiHandler extends StaticHandler<WiFiOtaUpdateFragment> {
        private WifiHandler(WiFiOtaUpdateFragment wiFiOtaUpdateFragment) {
            super(wiFiOtaUpdateFragment);
        }

        @Override // com.huawei.health.device.wifi.lib.handler.StaticHandler
        public void handleMessage(WiFiOtaUpdateFragment wiFiOtaUpdateFragment, Message message) {
            if (wiFiOtaUpdateFragment.isDestroy()) {
                return;
            }
            if (!wiFiOtaUpdateFragment.isAdded()) {
                dyg.c(false, WiFiOtaUpdateFragment.TAG, "WifiHandler mFragment is not add");
                return;
            }
            dyg.a(false, WiFiOtaUpdateFragment.TAG, "WifiHandler what: " + message.what);
            int i = message.what;
            if (i == 1) {
                wiFiOtaUpdateFragment.mRoundProgress.a();
                wiFiOtaUpdateFragment.setCheckVersionUpdateEnable(1);
                return;
            }
            if (i == 2) {
                wiFiOtaUpdateFragment.checkUpdateResult();
                return;
            }
            if (i == 3) {
                wiFiOtaUpdateFragment.mLatestVersionLayout.setEnabled(true);
                wiFiOtaUpdateFragment.mRoundProgress.a();
                wiFiOtaUpdateFragment.setCheckVersionUpdateEnable(3);
            } else {
                if (i == 4) {
                    eas.b().c(wiFiOtaUpdateFragment.mWiFiDevice.e(), false);
                    wiFiOtaUpdateFragment.mLatestVersionLayout.setEnabled(true);
                    wiFiOtaUpdateFragment.mLatestVersionLayout.setVisibility(8);
                    wiFiOtaUpdateFragment.mNowVersionText.setText(wiFiOtaUpdateFragment.mNewVer);
                    wiFiOtaUpdateFragment.mRoundProgress.a();
                    wiFiOtaUpdateFragment.setCheckVersionUpdateEnable(2);
                    Map<String, String> mapC = eas.b().c(wiFiOtaUpdateFragment.mWiFiDevice.e());
                    mapC.put("status", "1");
                    eas.b().a(wiFiOtaUpdateFragment.mWiFiDevice.e(), mapC);
                    ean.c(wiFiOtaUpdateFragment.mWiFiDevice.e(), (CommBaseCallbackInterface) null);
                    return;
                }
                dyg.d(false, WiFiOtaUpdateFragment.TAG, "WifiHandler what is other");
            }
        }
    }

    @Override // com.huawei.health.ecologydevice.ui.BaseFragment
    public boolean onBackPressed() {
        Bundle bundle = new Bundle();
        bundle.putString("productId", this.mProductId);
        WiFiProductIntroductionFragment wiFiProductIntroductionFragment = new WiFiProductIntroductionFragment();
        bundle.putParcelable("commonDeviceInfo", this.mDeviceInfo);
        wiFiProductIntroductionFragment.setArguments(bundle);
        switchFragment(wiFiProductIntroductionFragment);
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void checkUpdateResult() {
        ecr.a(this.mainActivity.getApplicationContext()).c(this.mUniqueId, this.mBaseCallback);
    }

    class OtaStatusCallback implements BaseCallbackInterface {
        private WeakReference<WiFiOtaUpdateFragment> mActivity;

        private OtaStatusCallback(WiFiOtaUpdateFragment wiFiOtaUpdateFragment) {
            this.mActivity = new WeakReference<>(wiFiOtaUpdateFragment);
        }

        @Override // com.huawei.health.device.wifi.interfaces.BaseCallbackInterface
        public void onSuccess(Object obj) {
            if (isDestory() && obj != null && "3".equals(obj)) {
                Message messageObtain = Message.obtain();
                messageObtain.what = 4;
                WiFiOtaUpdateFragment.this.mHandler.sendMessage(messageObtain);
            }
        }

        private boolean isDestory() {
            WiFiOtaUpdateFragment wiFiOtaUpdateFragment;
            WeakReference<WiFiOtaUpdateFragment> weakReference = this.mActivity;
            return (weakReference == null || (wiFiOtaUpdateFragment = weakReference.get()) == null || wiFiOtaUpdateFragment.isDestory()) ? false : true;
        }

        @Override // com.huawei.health.device.wifi.interfaces.BaseCallbackInterface
        public void onFailure(int i) {
            Message messageObtain = Message.obtain();
            messageObtain.what = 3;
            WiFiOtaUpdateFragment.this.mHandler.sendMessage(messageObtain);
        }

        @Override // com.huawei.health.device.wifi.interfaces.BaseCallbackInterface
        public void onStatus(int i) {
            if (WiFiOtaUpdateFragment.this.mainActivity != null) {
                WiFiOtaUpdateFragment.this.mainActivity.runOnUiThread(new Runnable() { // from class: com.huawei.health.device.ui.measure.fragment.WiFiOtaUpdateFragment.OtaStatusCallback.1
                    @Override // java.lang.Runnable
                    public void run() {
                        qpx.e(WiFiOtaUpdateFragment.this.mainActivity, R.string.IDS_device_wifi_not_network);
                    }
                });
            }
            Message messageObtain = Message.obtain();
            messageObtain.what = 3;
            WiFiOtaUpdateFragment.this.mHandler.sendMessage(messageObtain);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean isDestory() {
        FragmentActivity activity = getActivity();
        if (activity == null || activity.isFinishing() || activity.isDestroyed()) {
            dyg.c(false, TAG, "DeviceMainActivity is Destroyed");
            return true;
        }
        if (!isAdded()) {
            dyg.c(false, TAG, "MyHandler mFragment is not add");
        }
        return false;
    }
}
