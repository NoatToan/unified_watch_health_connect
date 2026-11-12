package com.huawei.health.ecologydevice.ui.measure.fragment;

import android.bluetooth.BluetoothAdapter;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.ImageView;
import androidx.fragment.app.FragmentActivity;
import com.huawei.ecologydevice.R;
import com.huawei.health.device.PluginDeviceAdapter;
import com.huawei.health.device.api.DeviceMainActivityApi;
import com.huawei.health.device.api.PluginDeviceApi;
import com.huawei.health.ecologydevice.ui.BaseFragment;
import com.huawei.health.ecologydevice.ui.util.PermissionDialogHelper;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.pluginbase.PluginBaseAdapter;
import com.huawei.ui.commonui.button.HealthButton;
import defpackage.dxw;
import health.compact.a.LanguageUtil;
import health.compact.a.Services;

/* JADX INFO: loaded from: classes7.dex */
public class HeartRateDeviceRunGuide extends BaseFragment {
    private static final int MIN_TEXT_SIZE = 9;
    private static final int NORMAL_TEXT_SIZE = 15;
    private static final String TAG = "HeartRateDeviceRunGuide";
    private boolean isFromFitnessAdvice = false;
    private ImageView mBindSuccessImageView;
    private String mTitle;
    private HealthButton mToSportStackButton;

    @Override // com.huawei.health.ecologydevice.ui.BaseFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            try {
                this.mTitle = arguments.getString("title");
            } catch (Exception unused) {
                LogUtil.a(TAG, "jumpToProductIntroductionFragment Exception");
            }
        }
    }

    @Override // com.huawei.health.ecologydevice.ui.BaseFragment, androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        LogUtil.a(TAG, "HeartRateDeviceRunGuide onCreateView");
        if (layoutInflater == null) {
            LogUtil.a(TAG, "HeartRateDeviceRunGuide onCreateView inflater is null");
            return null;
        }
        View viewInflate = layoutInflater.inflate(R.layout.device_jabrabindsuccess_totrack, viewGroup, false);
        this.mBindSuccessImageView = (ImageView) viewInflate.findViewById(R.id.bind_success_info);
        this.mToSportStackButton = (HealthButton) viewInflate.findViewById(R.id.bind_success_toStack);
        if (!LanguageUtil.l(dxw.d())) {
            this.mBindSuccessImageView.setImageResource(R.drawable.device_jabra_bind_success_info_hw);
        } else {
            this.mBindSuccessImageView.setImageResource(R.drawable.device_jabra_bind_success_info);
        }
        stringTruncation(this.mToSportStackButton);
        Bundle bundleFromDeviceMainActivity = getBundleFromDeviceMainActivity();
        if (bundleFromDeviceMainActivity != null) {
            this.isFromFitnessAdvice = bundleFromDeviceMainActivity.getBoolean("isFromFitnessAdvice", false);
        }
        if (this.isFromFitnessAdvice) {
            this.mToSportStackButton.setVisibility(4);
        }
        clickToSportStackButton();
        ViewGroup viewGroup2 = super.onCreateView(layoutInflater, viewGroup, bundle) instanceof ViewGroup ? (ViewGroup) super.onCreateView(layoutInflater, viewGroup, bundle) : null;
        if (viewGroup2 != null) {
            viewGroup2.addView(viewInflate);
        }
        setTitle(this.mTitle);
        return viewGroup2;
    }

    private void clickToSportStackButton() {
        this.mToSportStackButton.setOnClickListener(new View.OnClickListener() { // from class: com.huawei.health.ecologydevice.ui.measure.fragment.HeartRateDeviceRunGuide$$ExternalSyntheticLambda0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f$0.m988xd64d46a4(view);
            }
        });
    }

    /* JADX INFO: renamed from: lambda$clickToSportStackButton$0$com-huawei-health-ecologydevice-ui-measure-fragment-HeartRateDeviceRunGuide, reason: not valid java name */
    /* synthetic */ void m988xd64d46a4(View view) {
        if (BluetoothAdapter.getDefaultAdapter() == null) {
            LogUtil.j(TAG, "clickToSportStackButton bluetoothAdapter is null");
        } else if (BluetoothAdapter.getDefaultAdapter().isEnabled() && PermissionDialogHelper.c(this.mainActivity)) {
            deviceToSportStrack();
        } else {
            PermissionDialogHelper.a(this, 1);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        LogUtil.a(TAG, "onActivityResult");
        if (i != 1 || i2 == 0) {
            return;
        }
        deviceToSportStrack();
    }

    private void deviceToSportStrack() {
        PluginBaseAdapter adapter = ((PluginDeviceApi) Services.b("PluginDevice", PluginDeviceApi.class)).getAdapter();
        PluginDeviceAdapter pluginDeviceAdapter = adapter instanceof PluginDeviceAdapter ? (PluginDeviceAdapter) adapter : null;
        if (pluginDeviceAdapter == null) {
            LogUtil.e(TAG, "PluginDeviceAdapter can not be null");
        } else {
            pluginDeviceAdapter.deviceToSportStrack(getActivity());
        }
    }

    private void stringTruncation(final HealthButton healthButton) {
        final int[] iArr = {15};
        healthButton.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: com.huawei.health.ecologydevice.ui.measure.fragment.HeartRateDeviceRunGuide.1
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public void onGlobalLayout() {
                if (healthButton.getLineCount() > 1) {
                    int[] iArr2 = iArr;
                    int i = iArr2[0] - 1;
                    iArr2[0] = i;
                    if (i >= 9) {
                        healthButton.setTextSize(1, i);
                        return;
                    }
                    return;
                }
                healthButton.getViewTreeObserver().removeOnGlobalLayoutListener(this);
            }
        });
    }

    @Override // com.huawei.health.ecologydevice.ui.BaseFragment
    public boolean onBackPressed() {
        Bundle arguments = getArguments();
        if (arguments == null) {
            return false;
        }
        if (arguments.getBoolean("isBindSuccess")) {
            popupFragment(null);
            return false;
        }
        FragmentActivity activity = getActivity();
        if (activity == null) {
            return false;
        }
        ((DeviceMainActivityApi) Services.b("PluginDevice", DeviceMainActivityApi.class)).popupMyDeviceFragment(activity);
        return false;
    }
}
