package com.xiaomi.fitness.devicesettings.guide;

import android.os.Bundle;
import android.view.View;
import com.mi.fitness.checkupdate.ui.huami.HuamiUpgradeFragment;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.device.manager.DeviceModelExtKt;
import com.xiaomi.fitness.device.manager.export.DeviceManagerExtKt;
import com.xiaomi.fitness.device.manager.export.TempManager;
import com.xiaomi.fitness.device.manager.export.TempManagerExtKt;
import com.xiaomi.fitness.device.manager.export.WearableDeviceManager;
import com.xiaomi.fitness.device.manager.export.WearableDeviceModel;
import com.xiaomi.fitness.device.manager.export.bean.Feature;
import com.xiaomi.fitness.devicesettings.guide.GuideWearInstructionFragment;
import com.xiaomi.fitness.ubox.export.GuideNavigator;
import defpackage.eui;
import defpackage.wzi;
import defpackage.yg6;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0007\b\u0007\u0018\u0000 \u00182\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0018B\u0007¢\u0006\u0004\b\u0016\u0010\u0017J!\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\t\u0010\nR\"\u0010\f\u001a\u00020\u000b8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0015\u001a\u00020\u00128VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0019"}, d2 = {"Lcom/xiaomi/fitness/devicesettings/guide/GuideWearInstructionFragment;", "Lcom/xiaomi/fitness/baseui/view/BaseBindingFragment;", "Lcom/xiaomi/fitness/devicesettings/guide/GuideWearInstructionViewModel;", "Lyg6;", "Landroid/view/View;", "view", "Landroid/os/Bundle;", "savedInstanceState", "", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "Lcom/xiaomi/fitness/ubox/export/GuideNavigator;", "guideNavigator", "Lcom/xiaomi/fitness/ubox/export/GuideNavigator;", "getGuideNavigator", "()Lcom/xiaomi/fitness/ubox/export/GuideNavigator;", "setGuideNavigator", "(Lcom/xiaomi/fitness/ubox/export/GuideNavigator;)V", "", "getLayoutId", "()I", "layoutId", "<init>", "()V", "Companion", "device-settings_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class GuideWearInstructionFragment extends Hilt_GuideWearInstructionFragment<GuideWearInstructionViewModel, yg6> {

    @NotNull
    public static final String sTag = "GuideWearInstructionFragment";
    public GuideNavigator guideNavigator;

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onViewCreated$lambda$0(GuideWearInstructionFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        WearableDeviceModel wearableDeviceModel = (WearableDeviceModel) DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getCurrentDeviceModel();
        Boolean boolValueOf = wearableDeviceModel != null ? Boolean.valueOf(DeviceModelExtKt.isSupportFeature(wearableDeviceModel, Feature.NO_BEGINNER_GUIDE)) : null;
        Logger.i(sTag, "isSupportLyra=" + TempManagerExtKt.getInstance(TempManager.INSTANCE).isSupportOs2() + " hasBeginGuide:" + boolValueOf);
        if (Intrinsics.areEqual(boolValueOf, Boolean.FALSE)) {
            this$0.getGuideNavigator().navigate("beginnerGuide");
        } else {
            this$0.getGuideNavigator().navigate(HuamiUpgradeFragment.DONE_TAG);
        }
    }

    @NotNull
    public final GuideNavigator getGuideNavigator() {
        GuideNavigator guideNavigator = this.guideNavigator;
        if (guideNavigator != null) {
            return guideNavigator;
        }
        Intrinsics.throwUninitializedPropertyAccessException("guideNavigator");
        return null;
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseFragment, com.xiaomi.fitness.baseui.ViewCreator
    public int getLayoutId() {
        return eui.g0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.xiaomi.fitness.baseui.view.BaseBindingFragment, com.xiaomi.fitness.baseui.view.BaseViewModelFragment, com.xiaomi.fitness.baseui.view.BaseFragment, miuix.appcompat.app.Fragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        setTitle(wzi.M4);
        hideBack();
        ((yg6) getMBinding()).A.setOnClickListener(new View.OnClickListener() { // from class: u9b
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                GuideWearInstructionFragment.onViewCreated$lambda$0(this.f35546a, view2);
            }
        });
    }

    public final void setGuideNavigator(@NotNull GuideNavigator guideNavigator) {
        Intrinsics.checkNotNullParameter(guideNavigator, "<set-?>");
        this.guideNavigator = guideNavigator;
    }
}
