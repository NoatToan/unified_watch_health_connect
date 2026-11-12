package com.xiaomi.fitness.eco.device.manager.ui.bind;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.method.LinkMovementMethod;
import android.view.View;
import com.xiaomi.fitness.baseui.dialog.CommonDialog;
import com.xiaomi.fitness.baseui.dialog.DialogParams;
import com.xiaomi.fitness.baseui.extension.LaunchExtensionKt;
import com.xiaomi.fitness.baseui.view.BaseBindingActivity;
import com.xiaomi.fitness.common.app.LifecycleConstantKt;
import com.xiaomi.fitness.common.extensions.MultiplePermissionsBuilder;
import com.xiaomi.fitness.common.extensions.StringExtKt;
import com.xiaomi.fitness.common.extensions.ToastExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.device.manager.export.BluetoothPermissionTool;
import com.xiaomi.fitness.device.manager.export.DeviceManagerExtKt;
import com.xiaomi.fitness.device.manager.export.DeviceTool;
import com.xiaomi.fitness.eco.device.manager.EcoDevicePreference;
import com.xiaomi.fitness.eco.device.manager.export.EcoDeviceManagerExtKt;
import com.xiaomi.fitness.eco.device.manager.export.EcoProductExtKt;
import com.xiaomi.fitness.eco.device.manager.export.EcoProductManager;
import com.xiaomi.fitness.eco.device.manager.export.bean.EcoAddDeviceInfo;
import com.xiaomi.fitness.eco.device.manager.export.bean.EcoBindDeviceInfo;
import com.xiaomi.fitness.eco.device.manager.export.bean.EcoProduct;
import com.xiaomi.fitness.eco.device.manager.export.bean.EcoScannedDeviceInfo;
import com.xiaomi.fitness.eco.device.manager.extensions.EcoBluetoothExtKt;
import com.xiaomi.fitness.eco.device.manager.extensions.EcoDeviceExtKt;
import com.xiaomi.fitness.eco.device.manager.extensions.EcoDeviceWebUrlsKt;
import com.xiaomi.fitness.eco.device.manager.ui.bind.EcoBindDeviceActivity;
import com.xiaomi.fitness.eco.device.manager.ui.bind.EcoBindViewModel;
import com.xiaomi.fitness.eco.device.manager.ui.scan.EcoUriDeviceInfo;
import com.xiaomi.fitness.sport_eco_manager_export.SportDeviceModel;
import com.xiaomi.fitness.user.info.export.MedicalIdSPContract;
import com.xiaomi.fitness.webview.WebViewUtilKt;
import defpackage.av6;
import defpackage.cw1;
import defpackage.dji;
import defpackage.fui;
import defpackage.xc7;
import defpackage.yzi;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0016\u0018\u0000 8*\b\b\u0000\u0010\u0002*\u00020\u00012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00040\u0003:\u00018B\u0007¢\u0006\u0004\b7\u0010\u000bJ\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\u000f\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u0011\u0010\u000bJ\u0019\u0010\u0014\u001a\u00020\u00072\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0014¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0013\u0010\u0019\u001a\u00020\u0007*\u00020\u0004H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u001b\u0010\u000bJ\u001f\u0010\u001e\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u001d\u001a\u00020\u001cH\u0014¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010 \u001a\u00020\u0007H\u0016¢\u0006\u0004\b \u0010\u000bJ\u000f\u0010!\u001a\u00020\u0007H\u0014¢\u0006\u0004\b!\u0010\u000bJ\u0017\u0010#\u001a\u00020\u00072\u0006\u0010\"\u001a\u00020\fH\u0014¢\u0006\u0004\b#\u0010$J\u000f\u0010%\u001a\u00020\u0007H\u0014¢\u0006\u0004\b%\u0010\u000bR\"\u0010&\u001a\u00020\u00168\u0004@\u0004X\u0084.¢\u0006\u0012\n\u0004\b&\u0010'\u001a\u0004\b(\u0010\u0018\"\u0004\b)\u0010*R(\u0010,\u001a\b\u0012\u0002\b\u0003\u0018\u00010+8\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/\"\u0004\b0\u00101R\u0014\u00104\u001a\u00020\u001c8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b2\u00103R\u0014\u00106\u001a\u00020\u001c8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b5\u00103¨\u00069"}, d2 = {"Lcom/xiaomi/fitness/eco/device/manager/ui/bind/EcoBindDeviceActivity;", "Lcom/xiaomi/fitness/eco/device/manager/ui/bind/EcoBindViewModel;", "VM", "Lcom/xiaomi/fitness/baseui/view/BaseBindingActivity;", "Lxc7;", "Landroid/view/View;", "bindingView", "", "scrollToCurrentView", "(Landroid/view/View;)V", "showCancelBindConfirmDialog", "()V", "", "message", "mac", "showErrorDialog", "(Ljava/lang/String;Ljava/lang/String;)V", "dismissBindConfirmDialog", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "Lcom/xiaomi/fitness/eco/device/manager/export/bean/EcoBindDeviceInfo;", "restoreBindDeviceInfo", "()Lcom/xiaomi/fitness/eco/device/manager/export/bean/EcoBindDeviceInfo;", "bindView", "(Lxc7;)V", "requestBindPermissionIfNeed", "", "status", "showFailedTip", "(Ljava/lang/String;I)V", "onBackPressed", "startBind", "oobNumber", "showBindConfirmDialog", "(Ljava/lang/String;)V", LifecycleConstantKt.ON_STOP, "mDeviceInfo", "Lcom/xiaomi/fitness/eco/device/manager/export/bean/EcoBindDeviceInfo;", "getMDeviceInfo", "setMDeviceInfo", "(Lcom/xiaomi/fitness/eco/device/manager/export/bean/EcoBindDeviceInfo;)V", "Lcom/xiaomi/fitness/baseui/dialog/CommonDialog;", "mBindConfirmDialog", "Lcom/xiaomi/fitness/baseui/dialog/CommonDialog;", "getMBindConfirmDialog", "()Lcom/xiaomi/fitness/baseui/dialog/CommonDialog;", "setMBindConfirmDialog", "(Lcom/xiaomi/fitness/baseui/dialog/CommonDialog;)V", "getViewModelId", "()I", "viewModelId", "getLayoutId", "layoutId", "<init>", "Companion", "eco-device-manager_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public class EcoBindDeviceActivity<VM extends EcoBindViewModel> extends BaseBindingActivity<VM, xc7> {
    public static final int BIND_FROM_AUTO_FIRST = 2;
    public static final int BIND_FROM_CLICK = 1;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    public static final int FROM_COMMON_SCAN = 1;
    public static final int FROM_NFC = 2;
    public static final int FROM_QR_CODE = 3;

    @NotNull
    public static final String KEY_SCAN_PAIRED = "key_scan_paired";

    @NotNull
    public static final String SCAN_ACTIVITY_CLASS = "com.xiaomi.fitness.device.manager.ui.scan.ScanDeviceActivity";

    @NotNull
    private static final String TAG = "EcoBindDevice";

    @Nullable
    private CommonDialog<?> mBindConfirmDialog;
    protected EcoBindDeviceInfo mDeviceInfo;

    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J-\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\tH\u0000¢\u0006\u0002\b\u0017R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\tX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\tX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\tX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\tX\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0018"}, d2 = {"Lcom/xiaomi/fitness/eco/device/manager/ui/bind/EcoBindDeviceActivity$Companion;", "", "<init>", "()V", "TAG", "", "SCAN_ACTIVITY_CLASS", "KEY_SCAN_PAIRED", "FROM_COMMON_SCAN", "", "FROM_NFC", "FROM_QR_CODE", "BIND_FROM_CLICK", "BIND_FROM_AUTO_FIRST", "launch", "", "context", "Landroid/content/Context;", "isMijiaProduct", "", "device", "Lcom/xiaomi/fitness/eco/device/manager/export/bean/EcoScannedDeviceInfo;", "from", "launch$eco_device_manager_chinaProductRelease", "eco-device-manager_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit launch$lambda$0(Bundle bundle, Intent it) {
            Intrinsics.checkNotNullParameter(bundle, "$bundle");
            Intrinsics.checkNotNullParameter(it, "it");
            it.putExtras(bundle);
            return Unit.INSTANCE;
        }

        public final void launch$eco_device_manager_chinaProductRelease(@NotNull Context context, boolean isMijiaProduct, @NotNull EcoScannedDeviceInfo device, int from) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(device, "device");
            Logger.i("EcoBindDevice", "start eco bind device (" + device.getBleMac() + "), model " + device.getModel() + "productId (" + device.getBleName() + "), isMijiaProduct (" + isMijiaProduct + "), from (" + (from == 2 ? MedicalIdSPContract.PREF_FIRST : "click") + ")");
            final Bundle bundle = new Bundle();
            bundle.putParcelable("key_device_info", device);
            LaunchExtensionKt.startActivity(context, (Class<?>) (isMijiaProduct ? BindMiHomeDeviceActivity.class : BindEcoDeviceDeviceActivity.class), (Function1<? super Intent, Unit>) new Function1() { // from class: rh7
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj) {
                    return EcoBindDeviceActivity.Companion.launch$lambda$0(bundle, (Intent) obj);
                }
            });
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final /* synthetic */ EcoBindViewModel access$getMViewModel(EcoBindDeviceActivity ecoBindDeviceActivity) {
        return (EcoBindViewModel) ecoBindDeviceActivity.getMViewModel();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit bindView$lambda$1(xc7 this_bindView, EcoBindDeviceActivity this$0, Integer num) {
        Intrinsics.checkNotNullParameter(this_bindView, "$this_bindView");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        EcoDeviceBindStatusView ecoDeviceBindStatusView = this_bindView.H;
        Intrinsics.checkNotNull(num);
        ecoDeviceBindStatusView.setStatus(num.intValue());
        if (num.intValue() == 102) {
            String string = this$0.getString(yzi.f40723r, EcoDeviceWebUrlsKt.getConnectHelpUrl(this$0.getMDeviceInfo().getModel()));
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            this$0.showFailedTip(string, num.intValue());
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit bindView$lambda$2(xc7 this_bindView, EcoBindDeviceActivity this$0, Integer num) {
        Intrinsics.checkNotNullParameter(this_bindView, "$this_bindView");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        EcoDeviceBindStatusView ecoDeviceBindStatusView = this_bindView.I;
        Intrinsics.checkNotNull(num);
        ecoDeviceBindStatusView.setStatus(num.intValue());
        if (num.intValue() == 100) {
            EcoDeviceBindStatusView deviceViewBindToPair = this_bindView.I;
            Intrinsics.checkNotNullExpressionValue(deviceViewBindToPair, "deviceViewBindToPair");
            this$0.scrollToCurrentView(deviceViewBindToPair);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit bindView$lambda$3(xc7 this_bindView, EcoBindDeviceActivity this$0, Integer num) {
        Intrinsics.checkNotNullParameter(this_bindView, "$this_bindView");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        EcoDeviceBindStatusView ecoDeviceBindStatusView = this_bindView.G;
        Intrinsics.checkNotNull(num);
        ecoDeviceBindStatusView.setStatus(num.intValue());
        if (num.intValue() == 100) {
            EcoDeviceBindStatusView deviceViewBindToBindAccount = this_bindView.G;
            Intrinsics.checkNotNullExpressionValue(deviceViewBindToBindAccount, "deviceViewBindToBindAccount");
            this$0.scrollToCurrentView(deviceViewBindToBindAccount);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit bindView$lambda$4(EcoBindDeviceActivity this$0, xc7 this_bindView, String str) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(this_bindView, "$this_bindView");
        if (str == null) {
            this$0.dismissBindConfirmDialog();
        } else {
            this$0.showBindConfirmDialog(str);
            EcoDeviceBindStatusView deviceViewBindToPair = this_bindView.I;
            Intrinsics.checkNotNullExpressionValue(deviceViewBindToPair, "deviceViewBindToPair");
            this$0.scrollToCurrentView(deviceViewBindToPair);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void bindView$lambda$5(EcoBindDeviceActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        ((EcoBindViewModel) this$0.getMViewModel()).getConnectDeviceStatus$eco_device_manager_chinaProductRelease().setValue(0);
        ((EcoBindViewModel) this$0.getMViewModel()).getPairDeviceStatus$eco_device_manager_chinaProductRelease().setValue(0);
        ((EcoBindViewModel) this$0.getMViewModel()).getBindAccountStatus$eco_device_manager_chinaProductRelease().setValue(0);
        ((EcoBindViewModel) this$0.getMViewModel()).getIsFail().set(8);
        this$0.startBind();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void bindView$lambda$6(EcoBindDeviceActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        DeviceTool deviceManagerExtKt = DeviceManagerExtKt.getInstance(DeviceTool.INSTANCE);
        EcoProduct ecoProduct = (EcoProduct) EcoDeviceManagerExtKt.getInstance(EcoProductManager.INSTANCE).getProductByModel(this$0.getMDeviceInfo().getModel());
        deviceManagerExtKt.launchToScanDevice(this$0, ecoProduct != null ? EcoProductExtKt.toDeviceProduct(ecoProduct) : null, true);
    }

    private final void dismissBindConfirmDialog() {
        CommonDialog<?> commonDialog = this.mBindConfirmDialog;
        if (commonDialog != null) {
            commonDialog.dismiss();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onCreate$lambda$0(EcoBindDeviceActivity this$0, Integer num) {
        String string;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (num != null && num.intValue() == 1) {
            string = this$0.getString(yzi.f40723r, EcoDeviceWebUrlsKt.getConnectHelpUrl(this$0.getMDeviceInfo().getModel()));
        } else if (num != null && num.intValue() == 3) {
            string = this$0.getString(yzi.B, EcoDeviceWebUrlsKt.getPairingFailHelpUrl(this$0.getMDeviceInfo().getModel()));
        } else {
            string = null;
            if (num != null && num.intValue() == 7) {
                String string2 = this$0.getString(yzi.Q);
                Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
                this$0.showErrorDialog(string2, this$0.getMDeviceInfo().getBleMac());
            } else if (num != null && num.intValue() == 5) {
                string = this$0.getString(yzi.A, EcoDeviceWebUrlsKt.getBindFailHelpUrl(this$0.getMDeviceInfo().getModel()));
            } else if (num != null && num.intValue() == 12) {
                string = this$0.getString(yzi.w);
            }
        }
        if (string != null && string.length() != 0) {
            Intrinsics.checkNotNull(num);
            this$0.showFailedTip(string, num.intValue());
            if (SportDeviceModel.INSTANCE.isJump()) {
                this$0.dismissBindConfirmDialog();
            }
        }
        this$0.dismissBindConfirmDialog();
        return Unit.INSTANCE;
    }

    private final void scrollToCurrentView(final View bindingView) {
        getMBinding().A.postDelayed(new Runnable() { // from class: ih7
            @Override // java.lang.Runnable
            public final void run() {
                EcoBindDeviceActivity.scrollToCurrentView$lambda$7(this.f21139a, bindingView);
            }
        }, 300L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void scrollToCurrentView$lambda$7(EcoBindDeviceActivity this$0, View bindingView) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(bindingView, "$bindingView");
        if (Build.VERSION.SDK_INT >= 29) {
            this$0.getMBinding().A.scrollToDescendant(bindingView);
        } else {
            this$0.getMBinding().A.scrollTo(0, bindingView.getBottom());
        }
    }

    private final void showCancelBindConfirmDialog() {
        String string = getString(yzi.C, getMDeviceInfo().getDeviceInfo().getName());
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        if (SportDeviceModel.INSTANCE.isJump()) {
            string = getString(yzi.D);
        }
        CommonDialog commonDialogCreate = new CommonDialog.c("cancel_bind_dialog").setDialogDescriptionString(new DialogParams.DialogDescriptionString(string)).setPositiveText(yzi.j).setNegativeText(yzi.i).create();
        commonDialogCreate.addDialogCallback(new av6(this) { // from class: com.xiaomi.fitness.eco.device.manager.ui.bind.EcoBindDeviceActivity.showCancelBindConfirmDialog.1
            final /* synthetic */ EcoBindDeviceActivity<VM> this$0;

            {
                this.this$0 = this;
            }

            @Override // defpackage.av6
            public void onDialogClick(String dialogName, DialogInterface dialog, int which) {
                if (dialog != null) {
                    dialog.dismiss();
                }
                if (which != -1) {
                    return;
                }
                this.this$0.finish();
            }
        });
        commonDialogCreate.showIfNeed(getSupportFragmentManager());
    }

    private final void showErrorDialog(String message, String mac) {
        CommonDialog commonDialogCreate = new CommonDialog.c("bind_error").setDialogTitle(yzi.P).setDialogDescriptionString(new DialogParams.DialogDescriptionString(yzi.O, new Object[0])).setPositiveText(yzi.j).create();
        commonDialogCreate.addDialogCallback(new av6(this) { // from class: com.xiaomi.fitness.eco.device.manager.ui.bind.EcoBindDeviceActivity.showErrorDialog.1
            final /* synthetic */ EcoBindDeviceActivity<VM> this$0;

            {
                this.this$0 = this;
            }

            @Override // defpackage.av6
            public void onDialogClick(String dialogName, DialogInterface dialog, int which) {
                if (dialog != null) {
                    dialog.dismiss();
                }
                this.this$0.finish();
            }
        });
        commonDialogCreate.showIfNeed(getSupportFragmentManager());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit showFailedTip$lambda$8(String str, String url) {
        Intrinsics.checkNotNullParameter(url, "url");
        WebViewUtilKt.startWebView$default(url, null, false, false, null, false, null, false, 254, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit startBind$lambda$12(final EcoBindDeviceActivity this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        BluetoothPermissionTool.DefaultImpls.requestBluetoothIfNeed$default(DeviceManagerExtKt.getInstance(BluetoothPermissionTool.INSTANCE), this$0, false, new Function1() { // from class: eh7
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return EcoBindDeviceActivity.startBind$lambda$12$lambda$11(this.f16640a, (MultiplePermissionsBuilder) obj);
            }
        }, 2, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit startBind$lambda$12$lambda$11(final EcoBindDeviceActivity this$0, MultiplePermissionsBuilder requestBluetoothIfNeed) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(requestBluetoothIfNeed, "$this$requestBluetoothIfNeed");
        requestBluetoothIfNeed.allGranted(new Function0() { // from class: gh7
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return EcoBindDeviceActivity.startBind$lambda$12$lambda$11$lambda$9(this.f18977a);
            }
        });
        requestBluetoothIfNeed.denied(new Function1() { // from class: hh7
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return EcoBindDeviceActivity.startBind$lambda$12$lambda$11$lambda$10(this.f20064a, (List) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit startBind$lambda$12$lambda$11$lambda$10(EcoBindDeviceActivity this$0, List it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        ((EcoBindViewModel) this$0.getMViewModel()).getConnectDeviceStatus$eco_device_manager_chinaProductRelease().postValue(102);
        ((EcoBindViewModel) this$0.getMViewModel()).getBindStatus$eco_device_manager_chinaProductRelease().postValue(1);
        ((EcoBindViewModel) this$0.getMViewModel()).getIsFail().set(0);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit startBind$lambda$12$lambda$11$lambda$9(EcoBindDeviceActivity this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        ((EcoBindViewModel) this$0.getMViewModel()).startBind(this$0.getMDeviceInfo());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit startBind$lambda$13(EcoBindDeviceActivity this$0, int i) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        ToastExtKt.toastShort(this$0, yzi.F);
        ((EcoBindViewModel) this$0.getMViewModel()).getConnectDeviceStatus$eco_device_manager_chinaProductRelease().setValue(102);
        ((EcoBindViewModel) this$0.getMViewModel()).getIsFail().set(0);
        return Unit.INSTANCE;
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseBindingActivity, com.xiaomi.fitness.baseui.view.ViewDataBinder
    public void bindView(@NotNull final xc7 xc7Var) {
        Intrinsics.checkNotNullParameter(xc7Var, "<this>");
        getMViewModel().getConnectDeviceStatus$eco_device_manager_chinaProductRelease().observe(this, new EcoBindDeviceActivity$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: jh7
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return EcoBindDeviceActivity.bindView$lambda$1(xc7Var, this, (Integer) obj);
            }
        }));
        getMViewModel().getPairDeviceStatus$eco_device_manager_chinaProductRelease().observe(this, new EcoBindDeviceActivity$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: kh7
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return EcoBindDeviceActivity.bindView$lambda$2(xc7Var, this, (Integer) obj);
            }
        }));
        getMViewModel().getBindAccountStatus$eco_device_manager_chinaProductRelease().observe(this, new EcoBindDeviceActivity$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: lh7
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return EcoBindDeviceActivity.bindView$lambda$3(xc7Var, this, (Integer) obj);
            }
        }));
        getMViewModel().getPairCode$eco_device_manager_chinaProductRelease().observe(this, new EcoBindDeviceActivity$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: mh7
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return EcoBindDeviceActivity.bindView$lambda$4(this.f26177a, xc7Var, (String) obj);
            }
        }));
        xc7Var.B.setOnClickListener(new View.OnClickListener() { // from class: nh7
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                EcoBindDeviceActivity.bindView$lambda$5(this.f27925a, view);
            }
        });
        xc7Var.C.setMovementMethod(LinkMovementMethod.getInstance());
        xc7Var.C.setAutoLinkMask(1);
        xc7Var.C.setHighlightColor(0);
        xc7Var.D.setOnClickListener(new View.OnClickListener() { // from class: oh7
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                EcoBindDeviceActivity.bindView$lambda$6(this.f29167a, view);
            }
        });
    }

    @Override // com.xiaomi.fitness.baseui.ViewCreator
    public int getLayoutId() {
        return fui.d;
    }

    @Nullable
    public final CommonDialog<?> getMBindConfirmDialog() {
        return this.mBindConfirmDialog;
    }

    @NotNull
    public final EcoBindDeviceInfo getMDeviceInfo() {
        EcoBindDeviceInfo ecoBindDeviceInfo = this.mDeviceInfo;
        if (ecoBindDeviceInfo != null) {
            return ecoBindDeviceInfo;
        }
        Intrinsics.throwUninitializedPropertyAccessException("mDeviceInfo");
        return null;
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseBindingActivity
    public int getViewModelId() {
        return cw1.f14792b;
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseActivity, androidx.p004activity.ComponentActivity, android.app.Activity
    /* JADX INFO: renamed from: onBackPressed */
    public void lambda$onCreate$0() {
        Integer value = getMViewModel().getBindStatus$eco_device_manager_chinaProductRelease().getValue();
        if ((value != null && value.intValue() == 0) || ((value != null && value.intValue() == 2) || (value != null && value.intValue() == 4))) {
            showCancelBindConfirmDialog();
        } else {
            super.lambda$onCreate$0();
        }
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseBindingActivity, com.xiaomi.fitness.baseui.view.BaseViewModelActivity, com.xiaomi.fitness.baseui.view.BaseActivity, miuix.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.p004activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setMDeviceInfo(restoreBindDeviceInfo());
        getMBinding().q0(cw1.f14791a, getMDeviceInfo().getDeviceInfo());
        setTitle(yzi.n);
        EcoDevicePreference.INSTANCE.setECO_CONNECTED_DEVICE_NAME(getMDeviceInfo().getDeviceInfo().getName());
        Intent intent = getIntent();
        getMViewModel().setFrom(intent != null ? intent.getIntExtra("from", 1) : 1);
        getMViewModel().start(getMDeviceInfo());
        requestBindPermissionIfNeed();
        getMViewModel().getBindStatus$eco_device_manager_chinaProductRelease().observe(this, new EcoBindDeviceActivity$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: dh7
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return EcoBindDeviceActivity.onCreate$lambda$0(this.f15528a, (Integer) obj);
            }
        }));
    }

    @Override // miuix.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStop() {
        super.onStop();
        CommonDialog<?> commonDialog = this.mBindConfirmDialog;
        if (commonDialog != null) {
            commonDialog.dismissAllowingStateLoss();
        }
        this.mBindConfirmDialog = null;
    }

    public void requestBindPermissionIfNeed() {
        if (getMDeviceInfo().isSportMachine()) {
            return;
        }
        startBind();
    }

    @NotNull
    public EcoBindDeviceInfo restoreBindDeviceInfo() {
        Intent intent = getIntent();
        EcoScannedDeviceInfo ecoScannedDeviceInfo = intent != null ? (EcoScannedDeviceInfo) intent.getParcelableExtra("key_device_info") : null;
        if (ecoScannedDeviceInfo != null) {
            return ecoScannedDeviceInfo;
        }
        Intent intent2 = getIntent();
        EcoProduct ecoProduct = intent2 != null ? (EcoProduct) intent2.getParcelableExtra("key_product_info") : null;
        Intrinsics.checkNotNull(ecoProduct);
        String stringExtra = getIntent().getStringExtra("key_device_name");
        String stringExtra2 = getIntent().getStringExtra("key_device_address");
        Intrinsics.checkNotNull(stringExtra2);
        String stringExtra3 = getIntent().getStringExtra("key_device_oob");
        String stringExtra4 = getIntent().getStringExtra("to");
        EcoAddDeviceInfo ecoAddDeviceInfo = EcoDeviceExtKt.toEcoAddDeviceInfo(ecoProduct);
        String model = ecoProduct.getModel();
        if (stringExtra == null) {
            stringExtra = "";
        }
        return new EcoUriDeviceInfo(stringExtra2, model, stringExtra, stringExtra3, "", "", "", "", ecoAddDeviceInfo, stringExtra4);
    }

    public final void setMBindConfirmDialog(@Nullable CommonDialog<?> commonDialog) {
        this.mBindConfirmDialog = commonDialog;
    }

    public final void setMDeviceInfo(@NotNull EcoBindDeviceInfo ecoBindDeviceInfo) {
        Intrinsics.checkNotNullParameter(ecoBindDeviceInfo, "<set-?>");
        this.mDeviceInfo = ecoBindDeviceInfo;
    }

    public void showBindConfirmDialog(@NotNull String oobNumber) {
        Intrinsics.checkNotNullParameter(oobNumber, "oobNumber");
        CommonDialog<?> commonDialogAddDialogCallback = new EcoPairCodeDialog.Builder(oobNumber).create().addDialogCallback(new av6(this) { // from class: com.xiaomi.fitness.eco.device.manager.ui.bind.EcoBindDeviceActivity.showBindConfirmDialog.1
            final /* synthetic */ EcoBindDeviceActivity<VM> this$0;

            {
                this.this$0 = this;
            }

            @Override // defpackage.av6
            public void onDialogClick(String dialogName, DialogInterface dialog, int which) throws RemoteException {
                super.onDialogClick(dialogName, dialog, which);
                if (which != -2) {
                    if (which != -1) {
                        return;
                    }
                    EcoBindDeviceActivity.access$getMViewModel(this.this$0).onConfirmResult(true);
                } else {
                    EcoBindDeviceActivity.access$getMViewModel(this.this$0).onConfirmResult(false);
                    if (dialog != null) {
                        dialog.dismiss();
                    }
                }
            }
        });
        this.mBindConfirmDialog = commonDialogAddDialogCallback;
        Intrinsics.checkNotNull(commonDialogAddDialogCallback);
        commonDialogAddDialogCallback.showIfNeed(getSupportFragmentManager());
    }

    public void showFailedTip(@NotNull String message, int status) {
        Intrinsics.checkNotNullParameter(message, "message");
        getMBinding().C.setText(StringExtKt.clickSpannable$default(message, null, dji.f15594b, 0, new Function2() { // from class: fh7
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return EcoBindDeviceActivity.showFailedTip$lambda$8((String) obj, (String) obj2);
            }
        }, 5, null));
    }

    public void startBind() {
        EcoBluetoothExtKt.openBluetooth(this, new Function0() { // from class: ph7
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return EcoBindDeviceActivity.startBind$lambda$12(this.f30389a);
            }
        }, new Function1() { // from class: qh7
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return EcoBindDeviceActivity.startBind$lambda$13(this.f31516a, ((Integer) obj).intValue());
            }
        });
    }
}
