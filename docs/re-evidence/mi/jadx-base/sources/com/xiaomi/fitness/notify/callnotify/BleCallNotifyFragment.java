package com.xiaomi.fitness.notify.callnotify;

import android.os.Bundle;
import android.view.View;
import com.example.statistics.export.IOnetrack;
import com.example.statistics.export.OneTrackExtKt;
import com.example.statistics.export.OneTrackStatBean;
import com.google.gson.Gson;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.device.manager.DeviceModelExtKt;
import com.xiaomi.fitness.device.manager.export.DeviceManagerExtKt;
import com.xiaomi.fitness.device.manager.export.WearableDeviceManager;
import com.xiaomi.fitness.device.manager.export.WearableDeviceModel;
import com.xiaomi.fitness.notify.BleNotifyModel;
import com.xiaomi.fitness.notify.util.NotifyPreference;
import defpackage.q0j;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0016J\u001a\u0010\n\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\f2\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0016J\b\u0010\r\u001a\u00020\u0007H\u0014J\b\u0010\u000e\u001a\u00020\u0007H\u0014J\b\u0010\u000f\u001a\u00020\u0010H\u0014J\b\u0010\u0013\u001a\u00020\u0007H\u0014J\b\u0010\u0014\u001a\u00020\u0007H\u0014R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Lcom/xiaomi/fitness/notify/callnotify/BleCallNotifyFragment;", "Lcom/xiaomi/fitness/notify/callnotify/BaseCallNotifyFragment;", "<init>", "()V", "deviceModel", "Lcom/xiaomi/fitness/device/manager/export/WearableDeviceModel;", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onViewCreated", "view", "Landroid/view/View;", "loadInCallConfig", "updateInCallConfig", "getDid", "", "mBleCallNotifyFragmentVisibleTime", "", "onVisible", "onInvisible", "notify_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class BleCallNotifyFragment extends BaseCallNotifyFragment {

    @Nullable
    private WearableDeviceModel deviceModel;
    private long mBleCallNotifyFragmentVisibleTime;

    @Override // com.xiaomi.fitness.notify.callnotify.BaseCallNotifyFragment
    @NotNull
    public String getDid() {
        String did;
        WearableDeviceModel wearableDeviceModel = this.deviceModel;
        return (wearableDeviceModel == null || (did = wearableDeviceModel.getDid()) == null) ? "" : did;
    }

    @Override // com.xiaomi.fitness.notify.callnotify.BaseCallNotifyFragment
    public void loadInCallConfig() {
        setInCall(BleNotifyModel.INSTANCE.getInCallResult(getDid()));
        onGetInCallConfig();
    }

    @Override // miuix.appcompat.app.Fragment, androidx.fragment.app.Fragment
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        WearableDeviceModel wearableDeviceModel = (WearableDeviceModel) DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getCurrentDeviceModel();
        this.deviceModel = wearableDeviceModel;
        if (wearableDeviceModel == null) {
            finish();
        }
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseFragment
    public void onInvisible() {
        super.onInvisible();
        WearableDeviceModel wearableDeviceModel = (WearableDeviceModel) DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getCurrentDeviceModel();
        if (wearableDeviceModel == null) {
            this.mBleCallNotifyFragmentVisibleTime = 0L;
        } else {
            OneTrackExtKt.getInstance(IOnetrack.INSTANCE).reportData(new OneTrackStatBean("c_pa_v3", "56.51.1.1.21561"), "name", "call_reminder_detail_page", "title", getString(q0j.l), "duration_sec", Long.valueOf((System.currentTimeMillis() - this.mBleCallNotifyFragmentVisibleTime) / ((long) 1000)), "device_model", DeviceModelExtKt.getModel(wearableDeviceModel));
        }
    }

    @Override // com.xiaomi.fitness.notify.callnotify.BaseCallNotifyFragment, com.xiaomi.fitness.baseui.view.BaseBindingFragment, com.xiaomi.fitness.baseui.view.BaseViewModelFragment, com.xiaomi.fitness.baseui.view.BaseFragment, miuix.appcompat.app.Fragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseFragment
    public void onVisible() {
        super.onVisible();
        this.mBleCallNotifyFragmentVisibleTime = System.currentTimeMillis();
    }

    @Override // com.xiaomi.fitness.notify.callnotify.BaseCallNotifyFragment
    public void updateInCallConfig() {
        String json = new Gson().toJson(getInCall());
        Logger.d(BaseCallNotifyFragment.TAG, "updateInCallConfig configStr=" + json);
        NotifyPreference.INSTANCE.setInCallNotifyConfig(getDid(), json);
    }
}
