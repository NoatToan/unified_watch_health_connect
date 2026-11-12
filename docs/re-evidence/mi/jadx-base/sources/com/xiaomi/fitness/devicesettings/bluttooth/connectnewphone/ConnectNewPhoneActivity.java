package com.xiaomi.fitness.devicesettings.bluttooth.connectnewphone;

import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import com.xiaomi.fitness.baseui.common.CommonBaseActivity;
import com.xiaomi.fitness.baseui.common.FragmentParams;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.device.manager.export.DeviceManagerExtKt;
import com.xiaomi.fitness.device.manager.export.WearableDeviceManager;
import com.xiaomi.fitness.device.manager.export.WearableDeviceModel;
import defpackage.eui;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0018\u0000 \u000e2\u00020\u0001:\u0001\u000eB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0014J\b\u0010\f\u001a\u00020\rH\u0002R\u0014\u0010\u0004\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u000f"}, d2 = {"Lcom/xiaomi/fitness/devicesettings/bluttooth/connectnewphone/ConnectNewPhoneActivity;", "Lcom/xiaomi/fitness/baseui/common/CommonBaseActivity;", "<init>", "()V", "layoutId", "", "getLayoutId", "()I", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "supportConnectNewPhone", "", "Companion", "device-settings_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ConnectNewPhoneActivity extends CommonBaseActivity {

    @NotNull
    public static final String TAG = "ConnectNewPhoneActivity";

    private final boolean supportConnectNewPhone() {
        String did;
        WearableDeviceManager.Companion companion = WearableDeviceManager.INSTANCE;
        WearableDeviceModel wearableDeviceModel = (WearableDeviceModel) DeviceManagerExtKt.getInstance(companion).getCurrentDeviceModel();
        if (wearableDeviceModel == null || (did = wearableDeviceModel.getDid()) == null) {
            return false;
        }
        Logger.i(TAG, "supportConnectNewPhone = " + ((DeviceManagerExtKt.getInstance(companion).getDeviceCapability(did) & 262144) != 0));
        return (DeviceManagerExtKt.getInstance(companion).getDeviceCapability(did) & 262144) != 0;
    }

    @Override // com.xiaomi.fitness.baseui.common.CommonBaseActivity, com.xiaomi.fitness.baseui.ViewCreator
    public int getLayoutId() {
        return eui.f17078b;
    }

    @Override // com.xiaomi.fitness.baseui.common.CommonBaseActivity, com.xiaomi.fitness.baseui.common.Hilt_CommonBaseActivity, com.xiaomi.fitness.baseui.view.BaseBindingActivity, com.xiaomi.fitness.baseui.view.BaseViewModelActivity, com.xiaomi.fitness.baseui.view.BaseActivity, miuix.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.p004activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle savedInstanceState) {
        if (getIntent().getParcelableExtra("fragment_param") == null) {
            if (supportConnectNewPhone()) {
                getIntent().putExtra("fragment_param", (Parcelable) new FragmentParams.b().e(ConnectNewPhoneFragment.class).b());
                Intrinsics.checkNotNull(getIntent().putExtra("from", 1));
            } else {
                WearableDeviceManager.Companion companion = WearableDeviceManager.INSTANCE;
                WearableDeviceModel wearableDeviceModel = (WearableDeviceModel) DeviceManagerExtKt.getInstance(companion).getCurrentDeviceModel();
                String did = wearableDeviceModel != null ? wearableDeviceModel.getDid() : null;
                if (did == null) {
                    finish();
                } else {
                    DeviceManagerExtKt.getInstance(companion).setBindNewMode(did);
                    DeviceManagerExtKt.getInstance(companion).disconnectDevice(did);
                    finish();
                }
            }
        }
        if (Build.VERSION.SDK_INT != 26) {
            setRequestedOrientation(1);
        }
        super.onCreate(savedInstanceState);
    }
}
