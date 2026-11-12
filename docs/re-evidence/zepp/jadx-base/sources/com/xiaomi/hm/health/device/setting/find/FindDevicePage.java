package com.xiaomi.hm.health.device.setting.find;

import android.view.View;
import androidx.fragment.app.FragmentManager;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.devicex.R;
import com.huami.tools.log.HMLog;
import com.xiaomi.hm.health.device.setting.find.FindDevicePage;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 \u001e2\u00020\u0001:\u0001\u000fB\u000f\u0012\u0006\u0010\u0011\u001a\u00020\u000e¢\u0006\u0004\b\u001c\u0010\u001dJ\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016J\b\u0010\u0006\u001a\u00020\u0004H\u0016J\u0012\u0010\u0007\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016J\b\u0010\b\u001a\u00020\u0004H\u0016J\u0012\u0010\u000b\u001a\u00020\u00042\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0016J\b\u0010\f\u001a\u00020\u0004H\u0016J\b\u0010\r\u001a\u00020\u0004H\u0016R\u0016\u0010\u0011\u001a\u00020\u000e8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0018\u0010\u0015\u001a\u0004\u0018\u00010\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0018\u0010\u0017\u001a\u0004\u0018\u00010\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0014R\u0018\u0010\u001b\u001a\u0004\u0018\u00010\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a¨\u0006\u001f"}, d2 = {"Lcom/xiaomi/hm/health/device/setting/find/FindDevicePage;", "Lcom/xiaomi/hm/health/device/setting/find/IFindDevicePage;", "Lcom/xiaomi/hm/health/device/setting/find/IDialogActionHandler;", "action", "", "showDeviceAlertDialog", "dismissDeviceAlertDialog", "showDeviceShakeDialog", "dismissDeviceShakeDialog", "Lcom/xiaomi/hm/health/device/setting/find/IAlertDialogChooseHandler;", "chooseHandler", "showDeviceConHeadsetDialog", "dismissDeviceConHeadsetDialog", "showFindDeviceFailed", "Landroidx/fragment/app/FragmentManager;", "a", "Landroidx/fragment/app/FragmentManager;", "manager", "Lcom/xiaomi/hm/health/device/setting/find/FindDeviceAnimateDialog;", "b", "Lcom/xiaomi/hm/health/device/setting/find/FindDeviceAnimateDialog;", "deviceAlertDialog", "c", "deviceShakeDialog", "Lcom/xiaomi/hm/health/device/setting/find/ConnectHeadsetAlertDialog;", GoogleApiAvailabilityLight.a, "Lcom/xiaomi/hm/health/device/setting/find/ConnectHeadsetAlertDialog;", "deviceConHeadSetDialog", "<init>", "(Landroidx/fragment/app/FragmentManager;)V", "e", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public final class FindDevicePage implements IFindDevicePage {

    @NotNull
    private static final a e = new a(null);

    @Deprecated
    private static final long f = 60000;

    @Deprecated
    @NotNull
    private static final String g = "FindDevicePage";

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final FragmentManager manager;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    private FindDeviceAnimateDialog deviceAlertDialog;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @Nullable
    private FindDeviceAnimateDialog deviceShakeDialog;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @Nullable
    private ConnectHeadsetAlertDialog deviceConHeadSetDialog;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tR\u0016\u0010\u0003\u001a\u00020\u00028\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0016\u0010\u0006\u001a\u00020\u00058\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007¨\u0006\n"}, d2 = {"com/xiaomi/hm/health/device/setting/find/FindDevicePage$a", "", "", "MINUTE", "J", "", "TAG", "Ljava/lang/String;", "<init>", "()V", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<String> {
        public static final b a = new b();

        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "find device failed";
        }
    }

    public FindDevicePage(@NotNull FragmentManager fragmentManager) {
        this.manager = fragmentManager;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(IDialogActionHandler iDialogActionHandler, View view) {
        if (iDialogActionHandler == null) {
            return;
        }
        iDialogActionHandler.onCancel();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void f(IAlertDialogChooseHandler iAlertDialogChooseHandler, View view) {
        if (iAlertDialogChooseHandler == null) {
            return;
        }
        iAlertDialogChooseHandler.needAlert(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void g(IAlertDialogChooseHandler iAlertDialogChooseHandler, View view) {
        if (iAlertDialogChooseHandler == null) {
            return;
        }
        iAlertDialogChooseHandler.needAlert(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void h(IDialogActionHandler iDialogActionHandler, View view) {
        if (iDialogActionHandler == null) {
            return;
        }
        iDialogActionHandler.onCancel();
    }

    @Override // com.xiaomi.hm.health.device.setting.find.IFindDevicePage
    public void dismissDeviceAlertDialog() {
        FindDeviceAnimateDialog findDeviceAnimateDialog = this.deviceAlertDialog;
        if (findDeviceAnimateDialog != null) {
            findDeviceAnimateDialog.dismissAllowingStateLoss();
        }
        this.deviceAlertDialog = null;
    }

    @Override // com.xiaomi.hm.health.device.setting.find.IFindDevicePage
    public void dismissDeviceConHeadsetDialog() {
        ConnectHeadsetAlertDialog connectHeadsetAlertDialog = this.deviceConHeadSetDialog;
        if (connectHeadsetAlertDialog != null) {
            connectHeadsetAlertDialog.dismissAllowingStateLoss();
        }
        this.deviceConHeadSetDialog = null;
    }

    @Override // com.xiaomi.hm.health.device.setting.find.IFindDevicePage
    public void dismissDeviceShakeDialog() {
        FindDeviceAnimateDialog findDeviceAnimateDialog = this.deviceShakeDialog;
        if (findDeviceAnimateDialog != null) {
            findDeviceAnimateDialog.dismissAllowingStateLoss();
        }
        this.deviceShakeDialog = null;
    }

    @Override // com.xiaomi.hm.health.device.setting.find.IFindDevicePage
    public void showDeviceAlertDialog(@Nullable final IDialogActionHandler action) {
        FindDeviceAnimateDialog findDeviceAnimateDialogBuild = new FindDeviceAnimateDialog.Builder().tipRes(R.string.device_is_alert).durationInMill(60000L).animationPath("animate/find_device_alert.json").cancelListener(new View.OnClickListener() { // from class: w62
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                FindDevicePage.e(action, view);
            }
        }).build();
        this.deviceAlertDialog = findDeviceAnimateDialogBuild;
        if (findDeviceAnimateDialogBuild == null) {
            return;
        }
        findDeviceAnimateDialogBuild.show(this.manager);
    }

    @Override // com.xiaomi.hm.health.device.setting.find.IFindDevicePage
    public void showDeviceConHeadsetDialog(@Nullable final IAlertDialogChooseHandler chooseHandler) {
        ConnectHeadsetAlertDialog cancelListener = new ConnectHeadsetAlertDialog().setConfirmListener(new View.OnClickListener() { // from class: v62
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                FindDevicePage.f(chooseHandler, view);
            }
        }).setCancelListener(new View.OnClickListener() { // from class: u62
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                FindDevicePage.g(chooseHandler, view);
            }
        });
        this.deviceConHeadSetDialog = cancelListener;
        if (cancelListener == null) {
            return;
        }
        cancelListener.show(this.manager);
    }

    @Override // com.xiaomi.hm.health.device.setting.find.IFindDevicePage
    public void showDeviceShakeDialog(@Nullable final IDialogActionHandler action) {
        FindDeviceAnimateDialog findDeviceAnimateDialogBuild = new FindDeviceAnimateDialog.Builder().tipRes(R.string.device_is_shaking).durationInMill(60000L).animationPath("animate/find_device_shake.json").cancelListener(new View.OnClickListener() { // from class: x62
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                FindDevicePage.h(action, view);
            }
        }).build();
        this.deviceShakeDialog = findDeviceAnimateDialogBuild;
        if (findDeviceAnimateDialogBuild == null) {
            return;
        }
        findDeviceAnimateDialogBuild.show(this.manager);
    }

    @Override // com.xiaomi.hm.health.device.setting.find.IFindDevicePage
    public void showFindDeviceFailed() {
        HMLog.info(g, b.a);
    }
}
