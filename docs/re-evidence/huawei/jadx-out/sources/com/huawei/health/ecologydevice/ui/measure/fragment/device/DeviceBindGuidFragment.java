package com.huawei.health.ecologydevice.ui.measure.fragment.device;

import android.bluetooth.BluetoothAdapter;
import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.huawei.ecologydevice.R;
import com.huawei.health.device.api.HealthDeviceEntryApi;
import com.huawei.health.ecologydevice.manager.ResourceManager;
import com.huawei.health.ecologydevice.ui.BaseFragment;
import com.huawei.hwbtsdk.btcommon.BTDeviceMgrUtil;
import com.huawei.hwbtsdk.btdatatype.callback.BtSwitchStateCallback;
import com.huawei.hwcommonmodel.utils.PermissionUtil;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.dialog.NoTitleCustomAlertDialog;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import defpackage.elg;
import defpackage.elh;
import defpackage.elo;
import defpackage.njy;
import defpackage.qpx;
import health.compact.a.LanguageUtil;
import health.compact.a.Services;
import java.util.Locale;

/* JADX INFO: loaded from: classes7.dex */
public class DeviceBindGuidFragment extends BaseFragment {
    private static final String TAG = "DeviceBindGuidFragment";
    private String mProductId;
    private elh mProductInfo;
    private String mTitle;
    private int mGuideIndex = 0;
    private BtSwitchStateCallback mBtSwitchStateCallback = new BtSwitchStateCallback() { // from class: com.huawei.health.ecologydevice.ui.measure.fragment.device.DeviceBindGuidFragment.1
        @Override // com.huawei.hwbtsdk.btdatatype.callback.BtSwitchStateCallback
        public void onBtSwitchStateCallback(int i) {
            LogUtil.a(DeviceBindGuidFragment.TAG, "onBtSwitchStateCallback", Integer.valueOf(i));
            if (i == 3) {
                BTDeviceMgrUtil.c().e(this);
                DeviceBindGuidFragment.this.switchToDeviceScanning();
            }
        }
    };

    static /* synthetic */ void lambda$showBlueToothDialog$2(View view) {
    }

    @Override // com.huawei.health.ecologydevice.ui.BaseFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.mProductId = getArguments().getString("productId");
        this.mTitle = getArguments().getString("title");
        this.mProductInfo = ResourceManager.c().d(this.mProductId);
    }

    @Override // com.huawei.health.ecologydevice.ui.BaseFragment, androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        LogUtil.a(TAG, "DeviceBindGuidFragment onCreateView");
        ViewGroup viewGroup2 = super.onCreateView(layoutInflater, viewGroup, bundle) instanceof ViewGroup ? (ViewGroup) super.onCreateView(layoutInflater, viewGroup, bundle) : null;
        if (layoutInflater == null) {
            LogUtil.a(TAG, "DeviceBindGuidFragment onCreateView inflater is null");
            return viewGroup2;
        }
        View viewInflate = layoutInflater.inflate(R.layout.device_bind_guide, viewGroup, false);
        if (viewGroup2 != null) {
            viewGroup2.addView(viewInflate);
        }
        if (LanguageUtil.ba(getActivity())) {
            ImageView imageView = (ImageView) viewInflate.findViewById(R.id.device_bind_guid_iv_back);
            ImageView imageView2 = (ImageView) viewInflate.findViewById(R.id.device_bind_guid_iv_next);
            imageView.setImageResource(R.drawable.ic_arrows_right_black);
            imageView2.setImageResource(R.drawable.ic_arrows_left_black);
        }
        HealthTextView healthTextView = (HealthTextView) viewInflate.findViewById(R.id.device_bind_guid_tv_back);
        HealthTextView healthTextView2 = (HealthTextView) viewInflate.findViewById(R.id.device_bind_guid_tv_next);
        healthTextView.setText(getActivity().getResources().getString(R.string.IDS_startup_last).toUpperCase(Locale.ENGLISH));
        healthTextView2.setText(getActivity().getResources().getString(R.string.IDS_startup_next).toUpperCase(Locale.ENGLISH));
        HealthTextView healthTextView3 = (HealthTextView) viewInflate.findViewById(R.id.device_bind_guid_tv);
        ImageView imageView3 = (ImageView) viewInflate.findViewById(R.id.device_bind_guid_img);
        loadGuide(healthTextView3, imageView3, this.mGuideIndex);
        clickNextButton((LinearLayout) viewInflate.findViewById(R.id.device_bind_guid_ll_next), healthTextView3, imageView3);
        clickBack((LinearLayout) viewInflate.findViewById(R.id.device_bind_guid_ll_back), healthTextView3, imageView3);
        setTitle(this.mTitle);
        return viewGroup2;
    }

    private void clickNextButton(LinearLayout linearLayout, final HealthTextView healthTextView, final ImageView imageView) {
        linearLayout.setOnClickListener(new View.OnClickListener() { // from class: com.huawei.health.ecologydevice.ui.measure.fragment.device.DeviceBindGuidFragment$$ExternalSyntheticLambda1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f$0.m1054x7d33d35e(healthTextView, imageView, view);
            }
        });
    }

    /* JADX INFO: renamed from: lambda$clickNextButton$0$com-huawei-health-ecologydevice-ui-measure-fragment-device-DeviceBindGuidFragment, reason: not valid java name */
    /* synthetic */ void m1054x7d33d35e(HealthTextView healthTextView, ImageView imageView, View view) {
        if (this.mGuideIndex + 1 > this.mProductInfo.c().size() - 1) {
            LogUtil.d(TAG, "mProductId:" + this.mProductId);
            if (((HealthDeviceEntryApi) Services.b("PluginDevice", HealthDeviceEntryApi.class)).isDeviceKitUniversal(this.mProductId)) {
                LogUtil.a(TAG, "error branch,only am16 use universal interface");
                return;
            } else {
                onClickNext();
                return;
            }
        }
        int i = this.mGuideIndex + 1;
        this.mGuideIndex = i;
        loadGuide(healthTextView, imageView, i);
    }

    private void onClickNext() {
        if (BluetoothAdapter.getDefaultAdapter().getState() == 10) {
            if (Build.VERSION.SDK_INT > 30 && PermissionUtil.e(this.mainActivity, PermissionUtil.PermissionType.SCAN) != PermissionUtil.PermissionResult.GRANTED) {
                LogUtil.j(TAG, "no scan Permission");
                qpx.e(this.mainActivity, R.string.IDS_nearby_permission_exception);
                return;
            } else {
                showBlueToothDialog();
                return;
            }
        }
        switchToDeviceScanning();
    }

    private void showBlueToothDialog() {
        NoTitleCustomAlertDialog.Builder builder = new NoTitleCustomAlertDialog.Builder(getActivity());
        builder.b(R.string.IDS_device_bluetooth_open_request);
        builder.c(R.string.IDS_device_ui_dialog_yes, new View.OnClickListener() { // from class: com.huawei.health.ecologydevice.ui.measure.fragment.device.DeviceBindGuidFragment$$ExternalSyntheticLambda2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f$0.m1055xd8c90eab(view);
            }
        });
        builder.a(R.string.IDS_device_ui_dialog_no, new View.OnClickListener() { // from class: com.huawei.health.ecologydevice.ui.measure.fragment.device.DeviceBindGuidFragment$$ExternalSyntheticLambda3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DeviceBindGuidFragment.lambda$showBlueToothDialog$2(view);
            }
        });
        NoTitleCustomAlertDialog noTitleCustomAlertDialogC = builder.c();
        noTitleCustomAlertDialogC.setCancelable(false);
        noTitleCustomAlertDialogC.show();
    }

    /* JADX INFO: renamed from: lambda$showBlueToothDialog$1$com-huawei-health-ecologydevice-ui-measure-fragment-device-DeviceBindGuidFragment, reason: not valid java name */
    /* synthetic */ void m1055xd8c90eab(View view) {
        BTDeviceMgrUtil.c().c(this.mBtSwitchStateCallback);
    }

    @Override // com.huawei.health.ecologydevice.ui.BaseFragment, androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        BTDeviceMgrUtil.c().e(this.mBtSwitchStateCallback);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void switchToDeviceScanning() {
        DeviceScanningFragment deviceScanningFragment = new DeviceScanningFragment();
        Bundle bundle = new Bundle();
        bundle.putString("productId", this.mProductId);
        bundle.putString("title", this.mTitle);
        deviceScanningFragment.setArguments(bundle);
        switchFragment(deviceScanningFragment);
    }

    private void clickBack(LinearLayout linearLayout, final HealthTextView healthTextView, final ImageView imageView) {
        linearLayout.setOnClickListener(new View.OnClickListener() { // from class: com.huawei.health.ecologydevice.ui.measure.fragment.device.DeviceBindGuidFragment$$ExternalSyntheticLambda0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f$0.m1053xe03948c3(healthTextView, imageView, view);
            }
        });
    }

    /* JADX INFO: renamed from: lambda$clickBack$3$com-huawei-health-ecologydevice-ui-measure-fragment-device-DeviceBindGuidFragment, reason: not valid java name */
    /* synthetic */ void m1053xe03948c3(HealthTextView healthTextView, ImageView imageView, View view) {
        int i = this.mGuideIndex;
        if (i - 1 < 0) {
            this.mainActivity.onBackPressed();
            return;
        }
        int i2 = i - 1;
        this.mGuideIndex = i2;
        loadGuide(healthTextView, imageView, i2);
    }

    private void loadGuide(HealthTextView healthTextView, ImageView imageView, int i) {
        if (healthTextView == null || imageView == null) {
            LogUtil.j(TAG, "operationGuidePrompt or operationGuideImg is null");
        } else if (!njy.c(this.mProductInfo.c(), i)) {
            LogUtil.j(TAG, "index is", Integer.valueOf(i));
        } else {
            healthTextView.setText(elo.a(this.mProductId, this.mProductInfo.c().get(i).c()));
            imageView.setImageBitmap(elo.c(elg.e().d(this.mProductId, this.mProductInfo.c().get(i).d())));
        }
    }
}
