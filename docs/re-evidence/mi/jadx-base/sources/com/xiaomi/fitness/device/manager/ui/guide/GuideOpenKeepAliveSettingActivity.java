package com.xiaomi.fitness.device.manager.ui.guide;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import com.xiaomi.fitness.baseui.dialog.CommonDialog;
import com.xiaomi.fitness.baseui.view.BaseBindingActivity;
import com.xiaomi.fitness.common.utils.AppUtil;
import com.xiaomi.fitness.device.manager.DeviceModelExtKt;
import com.xiaomi.fitness.device.manager.export.DeviceManagerExtKt;
import com.xiaomi.fitness.device.manager.export.WearableDeviceManager;
import com.xiaomi.fitness.device.manager.export.WearableDeviceModel;
import com.xiaomi.fitness.device.manager.export.bean.Feature;
import com.xiaomi.fitness.device.manager.ui.guide.GuideOpenKeepAliveSettingActivity;
import com.xiaomi.fitness.devicesettings.export.SettingsPageUtilExtKt;
import com.xiaomi.fitness.notify.export.NotificationManagerExportInter;
import com.xiaomi.fitness.notify.export.NotifyHelperExtKt;
import com.xiaomi.fitness.webview.WebViewUtilKt;
import defpackage.av6;
import defpackage.dui;
import defpackage.k16;
import defpackage.uzi;
import defpackage.zv1;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\n\u0018\u0000 \u00172\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0017B\u0011\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0019\u0010\t\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0014¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u000b\u0010\u0006J\u0013\u0010\f\u001a\u00020\u0004*\u00020\u0003H\u0016¢\u0006\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\u00020\u000e8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0014\u001a\u00020\u000e8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0012¨\u0006\u0018"}, d2 = {"Lcom/xiaomi/fitness/device/manager/ui/guide/GuideOpenKeepAliveSettingActivity;", "Lcom/xiaomi/fitness/baseui/view/BaseBindingActivity;", "Lcom/xiaomi/fitness/device/manager/ui/guide/GuideOpenKeepAliveSettingViewModel;", "Lk16;", "", "showDialog", "()V", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "onBackPressed", "bindView", "(Lk16;)V", "", "viewModelId", "I", "getViewModelId", "()I", "getLayoutId", "layoutId", "<init>", "(I)V", "Companion", "device-manager_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class GuideOpenKeepAliveSettingActivity extends BaseBindingActivity<GuideOpenKeepAliveSettingViewModel, k16> {

    @NotNull
    public static final String KEY_DEVICE_GUIDE_PATH = "key_device_path";

    @NotNull
    private static final String TAG = "GuideOpenKeepAliveSettingActivity";
    private final int viewModelId;

    public GuideOpenKeepAliveSettingActivity() {
        this(0, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void bindView$lambda$1(GuideOpenKeepAliveSettingActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.showDialog();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void bindView$lambda$2(View view) {
        SettingsPageUtilExtKt.getSettingsPageUtil().gotoDeviceKeepAliveGuideActivity(true);
    }

    private final void showDialog() {
        new CommonDialog.c("commonDialog").setDialogTitle(uzi.Q0).setDialogDescription(uzi.P0).setNegativeText(uzi.N0).setPositiveText(uzi.O0).setCanceledOnBackPressed(false).create().addDialogCallback(new av6() { // from class: com.xiaomi.fitness.device.manager.ui.guide.GuideOpenKeepAliveSettingActivity.showDialog.1
            @Override // defpackage.av6
            public void onDialogClick(String dialogName, DialogInterface dialog, int which) {
                if (which == -2) {
                    if (dialog != null) {
                        dialog.dismiss();
                        return;
                    }
                    return;
                }
                if (which != -1) {
                    return;
                }
                WearableDeviceModel wearableDeviceModel = (WearableDeviceModel) DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getCurrentDeviceModel();
                if (wearableDeviceModel == null || !DeviceModelExtKt.isSupportFeature(wearableDeviceModel, Feature.NO_BEGINNER_GUIDE)) {
                    String stringExtra = GuideOpenKeepAliveSettingActivity.this.getIntent().getStringExtra(GuideOpenKeepAliveSettingActivity.KEY_DEVICE_GUIDE_PATH);
                    if (stringExtra == null || stringExtra.length() == 0) {
                        return;
                    } else {
                        WebViewUtilKt.startWebView$default(stringExtra, null, false, false, null, false, null, false, 250, null);
                    }
                } else if (DeviceModelExtKt.isSupportFeature(wearableDeviceModel, "notification")) {
                    SettingsPageUtilExtKt.getSettingsPageUtil().gotoGuideSettingPage(GuideOpenKeepAliveSettingActivity.this);
                } else {
                    NotifyHelperExtKt.getNotificationManagerExport().toGoalPage(GuideOpenKeepAliveSettingActivity.this);
                }
                if (dialog != null) {
                    dialog.dismiss();
                }
            }
        }).show(getSupportFragmentManager(), "");
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseBindingActivity, com.xiaomi.fitness.baseui.view.ViewDataBinder
    public void bindView(@NotNull k16 k16Var) {
        Intrinsics.checkNotNullParameter(k16Var, "<this>");
        NotificationManagerExportInter notificationManagerExport = NotifyHelperExtKt.getNotificationManagerExport();
        Intrinsics.checkNotNull(this, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
        notificationManagerExport.showNotificationNeedSettingDialog(this, true, new Function0() { // from class: v6b
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Unit.INSTANCE;
            }
        });
        k16Var.H.setOnClickListener(new View.OnClickListener() { // from class: w6b
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                GuideOpenKeepAliveSettingActivity.bindView$lambda$1(this.f37654a, view);
            }
        });
        k16Var.I.setOnClickListener(new View.OnClickListener() { // from class: x6b
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                GuideOpenKeepAliveSettingActivity.bindView$lambda$2(view);
            }
        });
    }

    @Override // com.xiaomi.fitness.baseui.ViewCreator
    public int getLayoutId() {
        return dui.d;
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseBindingActivity
    public int getViewModelId() {
        return this.viewModelId;
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseActivity, androidx.p004activity.ComponentActivity, android.app.Activity
    /* JADX INFO: renamed from: onBackPressed */
    public void lambda$onCreate$0() {
        if (AppUtil.INSTANCE.isDevChannel()) {
            finish();
        }
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseBindingActivity, com.xiaomi.fitness.baseui.view.BaseViewModelActivity, com.xiaomi.fitness.baseui.view.BaseActivity, miuix.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.p004activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setActionBarResizeable(false);
        hideBack();
    }

    public /* synthetic */ GuideOpenKeepAliveSettingActivity(int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? zv1.f41707k : i);
    }

    public GuideOpenKeepAliveSettingActivity(int i) {
        this.viewModelId = i;
    }
}
