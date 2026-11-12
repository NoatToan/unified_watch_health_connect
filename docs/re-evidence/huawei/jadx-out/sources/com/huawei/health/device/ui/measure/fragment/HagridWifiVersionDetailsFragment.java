package com.huawei.health.device.ui.measure.fragment;

import android.content.ContentValues;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.huawei.health.ecologydevice.manager.ResourceManager;
import com.huawei.health.ecologydevice.ui.BaseFragment;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.plugindevice.R;
import com.huawei.ui.commonui.button.HealthButton;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import defpackage.dmp;
import defpackage.eby;
import defpackage.elh;
import defpackage.era;
import defpackage.qre;
import defpackage.qsp;

/* JADX INFO: loaded from: classes7.dex */
public class HagridWifiVersionDetailsFragment extends BaseFragment {
    private static final String TAG = "HagridWifiVersionDetailsFragment";
    private static final String TAG_RELEASE = "R_Weight_HagridWifiVersionDetailsFragment";
    private ImageView mVersionLogo;
    private elh mProductInfo = null;
    private String mProductId = null;
    private String mNewVersion = null;
    private String mReleaseNote = null;
    private String mNowVersion = null;
    private HealthTextView mVersionTv = null;
    private HealthTextView mUpdateNodesTv = null;
    private HealthButton mUpgradeBtn = null;
    private eby mWiFiDevice = null;
    private ContentValues mDeviceInfo = null;

    @Override // com.huawei.health.ecologydevice.ui.BaseFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
    }

    @Override // com.huawei.health.ecologydevice.ui.BaseFragment, androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.child = layoutInflater.inflate(R.layout.wifi_version_details_layout, viewGroup, false);
        View viewOnCreateView = super.onCreateView(layoutInflater, viewGroup, bundle);
        initView();
        initData();
        if (viewOnCreateView instanceof ViewGroup) {
            ((ViewGroup) viewOnCreateView).addView(this.child);
        }
        return viewOnCreateView;
    }

    private void initView() {
        setTitle(this.mainActivity.getString(R.string.IDS_device_scale_device_firmware_version));
        this.mVersionTv = (HealthTextView) qsp.a(this.child, R.id.version_tv);
        this.mUpdateNodesTv = (HealthTextView) qsp.a(this.child, R.id.update_nodes_tv);
        this.mUpgradeBtn = (HealthButton) qsp.a(this.child, R.id.upgrade_btn);
        this.mVersionLogo = (ImageView) qsp.a(this.child, R.id.image_logo);
        this.mUpgradeBtn.setOnClickListener(new View.OnClickListener() { // from class: com.huawei.health.device.ui.measure.fragment.HagridWifiVersionDetailsFragment$$ExternalSyntheticLambda1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f$0.m896x7f6f401d(view);
            }
        });
    }

    /* JADX INFO: renamed from: lambda$initView$0$com-huawei-health-device-ui-measure-fragment-HagridWifiVersionDetailsFragment, reason: not valid java name */
    /* synthetic */ void m896x7f6f401d(View view) {
        Bundle bundle = new Bundle();
        bundle.putString("productId", this.mProductId);
        bundle.putString("version", this.mNewVersion);
        bundle.putString("cer_version", this.mNowVersion);
        bundle.putString("update_nodes", this.mReleaseNote);
        bundle.putString("devId", this.mWiFiDevice.e());
        bundle.putParcelable("commonDeviceInfo", this.mDeviceInfo);
        HagridWifiUpdateGuideFragment hagridWifiUpdateGuideFragment = new HagridWifiUpdateGuideFragment();
        hagridWifiUpdateGuideFragment.setArguments(bundle);
        switchFragment(hagridWifiUpdateGuideFragment);
    }

    private void setRightTitleButton() {
        this.mCustomTitleBar.setRightButtonDrawable(getResources().getDrawable(R.drawable.haiger_ota_setting), qre.f(R.string.IDS_main_btn_state_settings));
        this.mCustomTitleBar.setRightButtonClickable(true);
        this.mCustomTitleBar.setRightButtonVisibility(0);
        this.mCustomTitleBar.setRightButtonOnClickListener(new View.OnClickListener() { // from class: com.huawei.health.device.ui.measure.fragment.HagridWifiVersionDetailsFragment$$ExternalSyntheticLambda0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f$0.m897x51ce705f(view);
            }
        });
    }

    /* JADX INFO: renamed from: lambda$setRightTitleButton$1$com-huawei-health-device-ui-measure-fragment-HagridWifiVersionDetailsFragment, reason: not valid java name */
    /* synthetic */ void m897x51ce705f(View view) {
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

    private void initData() {
        if (getArguments() != null) {
            this.mProductId = getArguments().getString("productId");
            ContentValues contentValues = (ContentValues) getArguments().getParcelable("commonDeviceInfo");
            this.mDeviceInfo = contentValues;
            if (contentValues != null) {
                this.mProductId = contentValues.getAsString("productId");
            }
            ContentValues contentValues2 = this.mDeviceInfo;
            if (contentValues2 != null && !TextUtils.isEmpty(contentValues2.getAsString("uniqueId")) && (dmp.d().b(this.mDeviceInfo.getAsString("uniqueId"), false) instanceof eby)) {
                this.mWiFiDevice = (eby) dmp.d().b(this.mDeviceInfo.getAsString("uniqueId"), false);
            }
            if (!TextUtils.isEmpty(this.mProductId)) {
                LogUtil.d(TAG, "mWiFiDevice is ", this.mWiFiDevice, ". mProductId: ", this.mProductId);
                elh elhVarD = ResourceManager.c().d(this.mProductId);
                this.mProductInfo = elhVarD;
                if (elhVarD == null) {
                    LogUtil.j(TAG_RELEASE, "ProductInfo is null, can't get version");
                }
            } else {
                LogUtil.j(TAG_RELEASE, "productId is empty, can't get ProductInfo");
            }
            this.mNewVersion = getArguments().getString("version");
            this.mNowVersion = getArguments().getString("cer_version");
            this.mReleaseNote = getArguments().getString("update_nodes");
            this.mVersionTv.setText(this.mainActivity.getString(R.string.IDS_device_wifi_ota_latest_version) + this.mNewVersion);
            this.mUpdateNodesTv.setText(this.mReleaseNote);
            if (getArguments().getBoolean("show_update")) {
                this.mUpgradeBtn.setVisibility(0);
            } else {
                this.mUpgradeBtn.setVisibility(8);
            }
            era.d(this.mVersionLogo, this.mProductId);
        } else {
            LogUtil.j(TAG_RELEASE, "Arguments is null");
        }
        if (this.mWiFiDevice != null) {
            setRightTitleButton();
        }
    }
}
