package com.xiaomi.fitness.devicesettings.guide;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import com.xiaomi.fitness.baseui.common.BaseFragmentExKt;
import com.xiaomi.fitness.common.app.LifecycleConstantKt;
import com.xiaomi.fitness.device.manager.export.DeviceManagerExtKt;
import com.xiaomi.fitness.device.manager.export.WearableDeviceManager;
import com.xiaomi.fitness.device.manager.export.WearableDeviceModel;
import com.xiaomi.fitness.devicesettings.guide.GuideOpenNotificationRemindFragment;
import com.xiaomi.fitness.notify.export.NotifyHelperExtKt;
import defpackage.c1h;
import defpackage.eui;
import defpackage.wzi;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\b\u0007\u0018\u0000 \u001b2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u001bB\u0007¢\u0006\u0004\b\u001a\u0010\u0006J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\u0006J\u0019\u0010\n\u001a\u00020\u00042\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\n\u0010\u000bJ!\u0010\u000e\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\f2\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0010\u0010\u0006J\u0013\u0010\u0011\u001a\u00020\u0004*\u00020\u0003H\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0014\u001a\u0004\u0018\u00010\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0019\u001a\u00020\u00168VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u001c"}, d2 = {"Lcom/xiaomi/fitness/devicesettings/guide/GuideOpenNotificationRemindFragment;", "Lcom/xiaomi/fitness/devicesettings/base/BaseLoadableBindingFragment;", "Lcom/xiaomi/fitness/devicesettings/guide/GuideNotificationViewModel;", "Lc1h;", "", "onNextPage", "()V", "toCallSettingPage", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "Landroid/view/View;", "view", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", LifecycleConstantKt.ON_RESUME, "bindView", "(Lc1h;)V", "Lcom/xiaomi/fitness/device/manager/export/WearableDeviceModel;", "mDeviceModel", "Lcom/xiaomi/fitness/device/manager/export/WearableDeviceModel;", "", "getLayoutId", "()I", "layoutId", "<init>", "Companion", "device-settings_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class GuideOpenNotificationRemindFragment extends Hilt_GuideOpenNotificationRemindFragment<GuideNotificationViewModel, c1h> {

    @NotNull
    private static final String TAG = "OpenNotifyRemindActivity";

    @Nullable
    private final WearableDeviceModel mDeviceModel = (WearableDeviceModel) DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getCurrentDeviceModel();

    /* JADX INFO: Access modifiers changed from: private */
    public static final void bindView$lambda$0(GuideOpenNotificationRemindFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (NotifyHelperExtKt.getNotificationManagerExport().isNotificationListenersEnabled()) {
            this$0.onNextPage();
        } else {
            NotifyHelperExtKt.getNotificationManagerExport().gotoNotificationAccessSetting();
        }
    }

    private final void onNextPage() {
        requireActivity().setResult(-1, new Intent());
        finish();
    }

    private final void toCallSettingPage() {
        BaseFragmentExKt.gotoPage(this, GuideOpenPhoneCallFragment.class, null);
        finish();
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseBindingFragment, com.xiaomi.fitness.baseui.view.ViewDataBinder
    public void bindView(@NotNull c1h c1hVar) {
        Intrinsics.checkNotNullParameter(c1hVar, "<this>");
        c1hVar.E.setOnClickListener(new View.OnClickListener() { // from class: m7b
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                GuideOpenNotificationRemindFragment.bindView$lambda$0(this.f25836a, view);
            }
        });
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseFragment, com.xiaomi.fitness.baseui.ViewCreator
    public int getLayoutId() {
        return eui.m3;
    }

    @Override // miuix.appcompat.app.Fragment, androidx.fragment.app.Fragment
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseFragment, miuix.appcompat.app.Fragment, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        if (NotifyHelperExtKt.getNotificationManagerExport().isNotificationListenersEnabled()) {
            onNextPage();
        }
    }

    @Override // com.xiaomi.fitness.devicesettings.base.BaseLoadableBindingFragment, com.xiaomi.fitness.baseui.view.BaseBindingFragment, com.xiaomi.fitness.baseui.view.BaseViewModelFragment, com.xiaomi.fitness.baseui.view.BaseFragment, miuix.appcompat.app.Fragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        setTitle(wzi.Te);
        setActionBarResizeable(true);
    }
}
