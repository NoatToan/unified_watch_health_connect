package com.mi.fitness.checkupdate.ui;

import android.os.Bundle;
import android.view.View;
import com.mi.fitness.checkupdate.ui.UpgradeSettingFragment;
import com.mi.fitness.checkupdate.util.CheckUpdatePreferenceSupport;
import com.xiaomi.fitness.baseui.view.BaseBindingFragment;
import com.xiaomi.fitness.device.manager.export.DeviceManagerExtKt;
import com.xiaomi.fitness.device.manager.export.WearableDeviceManager;
import com.xiaomi.fitness.device.manager.export.WearableDeviceModel;
import com.xiaomi.fitness.widget.SwitchButtonTwoLineTextView;
import com.xiaomi.fitness.widget.button.ISwitchButton;
import defpackage.kma;
import defpackage.lwi;
import defpackage.yyi;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0014\u0010\fJ!\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\bH\u0014¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0013\u001a\u00020\u00108VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0015"}, d2 = {"Lcom/mi/fitness/checkupdate/ui/UpgradeSettingFragment;", "Lcom/xiaomi/fitness/baseui/view/BaseBindingFragment;", "Lcom/mi/fitness/checkupdate/ui/UpgradeSettingViewModel;", "Lkma;", "Landroid/view/View;", "view", "Landroid/os/Bundle;", "savedInstanceState", "", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "setListener", "()V", "", "did", "Ljava/lang/String;", "", "getLayoutId", "()I", "layoutId", "<init>", "checkupdate_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class UpgradeSettingFragment extends BaseBindingFragment<UpgradeSettingViewModel, kma> {

    @NotNull
    private final String did;

    public UpgradeSettingFragment() {
        String did;
        WearableDeviceModel wearableDeviceModel = (WearableDeviceModel) DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getCurrentDeviceModel();
        this.did = (wearableDeviceModel == null || (did = wearableDeviceModel.getDid()) == null) ? "" : did;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setListener$lambda$0(UpgradeSettingFragment this$0, boolean z, ISwitchButton iSwitchButton) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        CheckUpdatePreferenceSupport.INSTANCE.setSilentDownloadOnlyWifi(this$0.did, !z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setListener$lambda$1(UpgradeSettingFragment this$0, boolean z, ISwitchButton iSwitchButton) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        CheckUpdatePreferenceSupport.INSTANCE.setSilentUpgradeOpen(this$0.did, z);
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseFragment, com.xiaomi.fitness.baseui.ViewCreator
    public int getLayoutId() {
        return lwi.f25499b;
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseBindingFragment, com.xiaomi.fitness.baseui.view.BaseViewModelFragment, com.xiaomi.fitness.baseui.view.BaseFragment, miuix.appcompat.app.Fragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        setTitle(yyi.p0);
        SwitchButtonTwoLineTextView switchButtonTwoLineTextView = getMBinding().A;
        CheckUpdatePreferenceSupport checkUpdatePreferenceSupport = CheckUpdatePreferenceSupport.INSTANCE;
        switchButtonTwoLineTextView.setSwitch(!checkUpdatePreferenceSupport.isSilentDownloadOnlyWifi(this.did));
        getMBinding().B.setSwitch(checkUpdatePreferenceSupport.isSilentUpgradeOpen(this.did));
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseBindingFragment
    public void setListener() {
        getMBinding().A.setOnCheckedChangeCallback(new ISwitchButton.a() { // from class: rcq
            @Override // com.xiaomi.fitness.widget.button.ISwitchButton.a
            public final void onCheckedChanged(boolean z, ISwitchButton iSwitchButton) {
                UpgradeSettingFragment.setListener$lambda$0(this.f32423a, z, iSwitchButton);
            }
        });
        getMBinding().B.setOnCheckedChangeCallback(new ISwitchButton.a() { // from class: scq
            @Override // com.xiaomi.fitness.widget.button.ISwitchButton.a
            public final void onCheckedChanged(boolean z, ISwitchButton iSwitchButton) {
                UpgradeSettingFragment.setListener$lambda$1(this.f33513a, z, iSwitchButton);
            }
        });
    }
}
