package com.xiaomi.fitness.device.manager.ui.guide;

import android.content.DialogInterface;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.mi.fitness.checkupdate.ui.huami.HuamiUpgradeFragment;
import com.xiaomi.fitness.baseui.dialog.CommonDialog;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.device.manager.DeviceModelExtKt;
import com.xiaomi.fitness.device.manager.export.DeviceManagerExtKt;
import com.xiaomi.fitness.device.manager.export.WearableDeviceManager;
import com.xiaomi.fitness.device.manager.export.WearableDeviceModel;
import com.xiaomi.fitness.device.manager.export.bean.Feature;
import com.xiaomi.fitness.device.manager.ui.guide.GuideOpenKeepAliveSettingFragment;
import com.xiaomi.fitness.devicesettings.export.SettingsPageUtilExtKt;
import com.xiaomi.fitness.notify.export.NotificationManagerExportInter;
import com.xiaomi.fitness.notify.export.NotifyHelperExtKt;
import com.xiaomi.fitness.ubox.export.GuideNavigator;
import defpackage.av6;
import defpackage.dui;
import defpackage.k16;
import defpackage.uzi;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u0000 \u00112\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0011B\u0007¢\u0006\u0004\b\u0010\u0010\u0006J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0013\u0010\u0007\u001a\u00020\u0004*\u00020\u0003H\u0016¢\u0006\u0004\b\u0007\u0010\bR\"\u0010\n\u001a\u00020\t8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f¨\u0006\u0012"}, d2 = {"Lcom/xiaomi/fitness/device/manager/ui/guide/GuideOpenKeepAliveSettingFragment;", "Lcom/xiaomi/fitness/baseui/view/BaseBindingFragment;", "Lcom/xiaomi/fitness/device/manager/ui/guide/GuideOpenKeepAliveSettingViewModel;", "Lk16;", "", "showDialog", "()V", "bindView", "(Lk16;)V", "Lcom/xiaomi/fitness/ubox/export/GuideNavigator;", "guideNavigator", "Lcom/xiaomi/fitness/ubox/export/GuideNavigator;", "getGuideNavigator", "()Lcom/xiaomi/fitness/ubox/export/GuideNavigator;", "setGuideNavigator", "(Lcom/xiaomi/fitness/ubox/export/GuideNavigator;)V", "<init>", "Companion", "device-manager_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class GuideOpenKeepAliveSettingFragment extends Hilt_GuideOpenKeepAliveSettingFragment<GuideOpenKeepAliveSettingViewModel, k16> {

    @NotNull
    public static final String sTag = "GuideOpenKeepAliveSettingFragment";
    public GuideNavigator guideNavigator;

    public GuideOpenKeepAliveSettingFragment() {
        super(dui.d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void bindView$lambda$1(GuideOpenKeepAliveSettingFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.showDialog();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void bindView$lambda$2(View view) {
        SettingsPageUtilExtKt.getSettingsPageUtil().gotoDeviceKeepAliveGuideActivity(true);
    }

    private final void showDialog() {
        new CommonDialog.c("commonDialog").setDialogTitle(uzi.Q0).setDialogDescription(uzi.P0).setNegativeText(uzi.N0).setPositiveText(uzi.O0).setCanceledOnBackPressed(false).create().addDialogCallback(new av6() { // from class: com.xiaomi.fitness.device.manager.ui.guide.GuideOpenKeepAliveSettingFragment.showDialog.1
            @Override // defpackage.av6
            public void onDialogClick(String dialogName, DialogInterface dialog, int which) {
                if (which == -2) {
                    if (dialog != null) {
                        dialog.dismiss();
                    }
                } else {
                    if (which != -1) {
                        return;
                    }
                    WearableDeviceModel wearableDeviceModel = (WearableDeviceModel) DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getCurrentDeviceModel();
                    Boolean boolValueOf = wearableDeviceModel != null ? Boolean.valueOf(DeviceModelExtKt.isSupportFeature(wearableDeviceModel, Feature.NO_BEGINNER_GUIDE)) : null;
                    Logger.i(GuideOpenKeepAliveSettingFragment.sTag, "hasBeginGuide:" + boolValueOf);
                    if (Intrinsics.areEqual(boolValueOf, Boolean.FALSE)) {
                        GuideOpenKeepAliveSettingFragment.this.getGuideNavigator().navigate("beginnerGuide");
                    } else {
                        GuideOpenKeepAliveSettingFragment.this.getGuideNavigator().navigate(HuamiUpgradeFragment.DONE_TAG);
                    }
                    if (dialog != null) {
                        dialog.dismiss();
                    }
                }
            }
        }).show(getParentFragmentManager(), "");
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseBindingFragment, com.xiaomi.fitness.baseui.view.ViewDataBinder
    public void bindView(@NotNull k16 k16Var) {
        Intrinsics.checkNotNullParameter(k16Var, "<this>");
        setTitle(uzi.R0);
        hideBack();
        NotificationManagerExportInter notificationManagerExport = NotifyHelperExtKt.getNotificationManagerExport();
        FragmentActivity fragmentActivityRequireActivity = requireActivity();
        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
        notificationManagerExport.showNotificationNeedSettingDialog(fragmentActivityRequireActivity, true, new Function0() { // from class: y6b
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Unit.INSTANCE;
            }
        });
        k16Var.H.setOnClickListener(new View.OnClickListener() { // from class: z6b
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                GuideOpenKeepAliveSettingFragment.bindView$lambda$1(this.f40947a, view);
            }
        });
        k16Var.I.setOnClickListener(new View.OnClickListener() { // from class: a7b
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                GuideOpenKeepAliveSettingFragment.bindView$lambda$2(view);
            }
        });
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

    public final void setGuideNavigator(@NotNull GuideNavigator guideNavigator) {
        Intrinsics.checkNotNullParameter(guideNavigator, "<set-?>");
        this.guideNavigator = guideNavigator;
    }
}
