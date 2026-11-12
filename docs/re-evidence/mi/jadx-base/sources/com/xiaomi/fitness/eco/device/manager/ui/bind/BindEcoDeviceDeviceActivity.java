package com.xiaomi.fitness.eco.device.manager.ui.bind;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.xiaomi.fitness.baseui.dialog.CommonDialog;
import com.xiaomi.fitness.baseui.dialog.DialogParams;
import com.xiaomi.fitness.common.app.AppManager;
import com.xiaomi.fitness.common.extensions.LinkSpanHelper;
import com.xiaomi.fitness.common.extensions.MultiplePermissionsBuilder;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.LocaleUtil;
import com.xiaomi.fitness.device.manager.export.BluetoothPermissionTool;
import com.xiaomi.fitness.device.manager.export.DeviceManagerExtKt;
import com.xiaomi.fitness.device.manager.export.DeviceTool;
import com.xiaomi.fitness.device.manager.ui.scan.ScanDeviceActivity;
import com.xiaomi.fitness.eco.device.manager.export.EcoDeviceManagerExtKt;
import com.xiaomi.fitness.eco.device.manager.export.EcoProductExtKt;
import com.xiaomi.fitness.eco.device.manager.export.EcoProductManager;
import com.xiaomi.fitness.eco.device.manager.export.bean.EcoAddDeviceInfo;
import com.xiaomi.fitness.eco.device.manager.export.bean.EcoBindDeviceInfo;
import com.xiaomi.fitness.eco.device.manager.export.bean.EcoProduct;
import com.xiaomi.fitness.eco.device.manager.export.bean.EcoScannedDeviceInfo;
import com.xiaomi.fitness.eco.device.manager.extensions.EcoDeviceExtKt;
import com.xiaomi.fitness.eco.device.manager.extensions.EcoDeviceWebUrlsKt;
import com.xiaomi.fitness.eco.device.manager.ui.bind.BindEcoDeviceDeviceActivity;
import com.xiaomi.fitness.eco.device.manager.ui.scan.EcoUriDeviceInfo;
import com.xiaomi.fitness.electronic.scale.export.ElectronicScaleManager;
import com.xiaomi.fitness.electronic.scale.export.ElectronicScaleManagerExtKt;
import com.xiaomi.fitness.login.export.RegionExtKt;
import com.xiaomi.fitness.login.export.RegionManager;
import com.xiaomi.fitness.webview.WebViewUtilKt;
import defpackage.ari;
import defpackage.av6;
import defpackage.dji;
import defpackage.fui;
import defpackage.xc7;
import defpackage.yzi;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Route(path = EcoDeviceManagerExtKt.BIND_ECO_DEVICE_PATH)
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0017\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b+\u0010\tJ\u0017\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\b\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\n\u0010\tJ\u000f\u0010\u000b\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u000b\u0010\tJ\u000f\u0010\f\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\f\u0010\tJ\u001b\u0010\u000f\u001a\u00020\u00052\n\u0010\u000e\u001a\u0006\u0012\u0002\b\u00030\rH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0014\u001a\u00020\u00052\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0019\u0010\u0018\u001a\u00020\u00052\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016H\u0014¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u001a\u0010\tJ\u000f\u0010\u001c\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001f\u001a\u00020\u001eH\u0016¢\u0006\u0004\b\u001f\u0010 J\u0013\u0010\"\u001a\u00020\u0005*\u00020!H\u0016¢\u0006\u0004\b\"\u0010#J\u000f\u0010$\u001a\u00020\u0005H\u0016¢\u0006\u0004\b$\u0010\tJ\u000f\u0010%\u001a\u00020\u0005H\u0014¢\u0006\u0004\b%\u0010\tR(\u0010&\u001a\b\u0012\u0002\b\u0003\u0018\u00010\r8\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)\"\u0004\b*\u0010\u0010¨\u0006,"}, d2 = {"Lcom/xiaomi/fitness/eco/device/manager/ui/bind/BindEcoDeviceDeviceActivity;", "Lcom/xiaomi/fitness/eco/device/manager/ui/bind/EcoBindDeviceActivity;", "Lcom/xiaomi/fitness/eco/device/manager/ui/bind/BindEcoViewModel;", "Landroid/view/View;", "bindingView", "", "scrollToCurrentView", "(Landroid/view/View;)V", "showCancelBindConfirmDialog", "()V", "dismissOOBConfirmDialog", "dismissBindConfirmDialog", "showPolicyDialog", "Lcom/xiaomi/fitness/baseui/dialog/CommonDialog;", "dialog", "addPolicyDialogCallback", "(Lcom/xiaomi/fitness/baseui/dialog/CommonDialog;)V", "", "message", "mac", "showErrorDialog", "(Ljava/lang/String;Ljava/lang/String;)V", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "requestBindPermissionIfNeed", "Lcom/xiaomi/fitness/eco/device/manager/export/bean/EcoBindDeviceInfo;", "restoreBindDeviceInfo", "()Lcom/xiaomi/fitness/eco/device/manager/export/bean/EcoBindDeviceInfo;", "", "onNavigateUp", "()Z", "Lxc7;", "bindView", "(Lxc7;)V", "onBackPressed", "showOOBConfirmDialog", "mOObConfirmDialog", "Lcom/xiaomi/fitness/baseui/dialog/CommonDialog;", "getMOObConfirmDialog", "()Lcom/xiaomi/fitness/baseui/dialog/CommonDialog;", "setMOObConfirmDialog", "<init>", "eco-device-manager_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public class BindEcoDeviceDeviceActivity extends Hilt_BindEcoDeviceDeviceActivity<BindEcoViewModel> {

    @Nullable
    private CommonDialog<?> mOObConfirmDialog;

    /* JADX INFO: renamed from: com.xiaomi.fitness.eco.device.manager.ui.bind.BindEcoDeviceDeviceActivity$addPolicyDialogCallback$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J+\u0010\t\u001a\u00020\b2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"com/xiaomi/fitness/eco/device/manager/ui/bind/BindEcoDeviceDeviceActivity$addPolicyDialogCallback$1", "Lav6;", "", "dialogName", "Landroid/content/DialogInterface;", "dialog", "", "which", "", "onDialogClick", "(Ljava/lang/String;Landroid/content/DialogInterface;I)V", "eco-device-manager_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
    public static final class AnonymousClass1 extends av6 {
        public AnonymousClass1() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit onDialogClick$lambda$2(final BindEcoDeviceDeviceActivity this$0, MultiplePermissionsBuilder requestBluetoothIfNeed) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            Intrinsics.checkNotNullParameter(requestBluetoothIfNeed, "$this$requestBluetoothIfNeed");
            requestBluetoothIfNeed.allGranted(new Function0() { // from class: gl2
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return BindEcoDeviceDeviceActivity.AnonymousClass1.onDialogClick$lambda$2$lambda$0(this$0);
                }
            });
            requestBluetoothIfNeed.denied(new Function1() { // from class: hl2
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj) {
                    return BindEcoDeviceDeviceActivity.AnonymousClass1.onDialogClick$lambda$2$lambda$1(this$0, (List) obj);
                }
            });
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit onDialogClick$lambda$2$lambda$0(BindEcoDeviceDeviceActivity this$0) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            this$0.startBind();
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit onDialogClick$lambda$2$lambda$1(BindEcoDeviceDeviceActivity this$0, List it) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            Intrinsics.checkNotNullParameter(it, "it");
            BindEcoDeviceDeviceActivity.access$getMViewModel(this$0).getConnectDeviceStatus$eco_device_manager_chinaProductRelease().postValue(102);
            BindEcoDeviceDeviceActivity.access$getMViewModel(this$0).getBindStatus$eco_device_manager_chinaProductRelease().postValue(1);
            BindEcoDeviceDeviceActivity.access$getMViewModel(this$0).getIsFail().set(0);
            return Unit.INSTANCE;
        }

        @Override // defpackage.av6
        public void onDialogClick(String dialogName, DialogInterface dialog, int which) {
            if (dialog != null) {
                dialog.dismiss();
            }
            if (which == -2) {
                BindEcoDeviceDeviceActivity.this.finish();
            } else {
                if (which != -1) {
                    return;
                }
                BluetoothPermissionTool deviceManagerExtKt = DeviceManagerExtKt.getInstance(BluetoothPermissionTool.INSTANCE);
                final BindEcoDeviceDeviceActivity bindEcoDeviceDeviceActivity = BindEcoDeviceDeviceActivity.this;
                BluetoothPermissionTool.DefaultImpls.requestBluetoothIfNeed$default(deviceManagerExtKt, bindEcoDeviceDeviceActivity, false, new Function1() { // from class: il2
                    @Override // kotlin.jvm.functions.Function1
                    /* JADX INFO: renamed from: invoke */
                    public final Object invoke2(Object obj) {
                        return BindEcoDeviceDeviceActivity.AnonymousClass1.onDialogClick$lambda$2(bindEcoDeviceDeviceActivity, (MultiplePermissionsBuilder) obj);
                    }
                }, 2, null);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final /* synthetic */ BindEcoViewModel access$getMViewModel(BindEcoDeviceDeviceActivity bindEcoDeviceDeviceActivity) {
        return (BindEcoViewModel) bindEcoDeviceDeviceActivity.getMViewModel();
    }

    private final void addPolicyDialogCallback(CommonDialog<?> dialog) {
        dialog.addDialogCallback(new AnonymousClass1());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit bindView$lambda$1(xc7 this_bindView, BindEcoDeviceDeviceActivity this$0, Integer num) {
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
    public static final Unit bindView$lambda$2(xc7 this_bindView, BindEcoDeviceDeviceActivity this$0, Integer num) {
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
    public static final Unit bindView$lambda$3(xc7 this_bindView, BindEcoDeviceDeviceActivity this$0, Integer num) {
        Intrinsics.checkNotNullParameter(this_bindView, "$this_bindView");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Logger.i("bindAccountStatus start", new Object[0]);
        EcoDeviceBindStatusView ecoDeviceBindStatusView = this_bindView.G;
        Intrinsics.checkNotNull(num);
        ecoDeviceBindStatusView.setStatus(num.intValue());
        if (num.intValue() == 100) {
            EcoDeviceBindStatusView deviceViewBindToBindAccount = this_bindView.G;
            Intrinsics.checkNotNullExpressionValue(deviceViewBindToBindAccount, "deviceViewBindToBindAccount");
            this$0.scrollToCurrentView(deviceViewBindToBindAccount);
        } else if (num.intValue() == 101) {
            if (this$0.getMDeviceInfo().isEcoScale()) {
                return Unit.INSTANCE;
            }
            if (!this$0.getMDeviceInfo().isSportMachine()) {
                WebViewUtilKt.startWebView$default(EcoDeviceWebUrlsKt.getUserGuideUrl(this$0.getMDeviceInfo().getModel()), null, false, false, null, false, null, false, 250, null);
            }
            this$0.finish();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit bindView$lambda$4(BindEcoDeviceDeviceActivity this$0, xc7 this_bindView, String str) {
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
    public static final Unit bindView$lambda$5(BindEcoDeviceDeviceActivity this$0, Integer num) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (num != null && num.intValue() == 104) {
            this$0.dismissOOBConfirmDialog();
        } else {
            this$0.showOOBConfirmDialog();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void bindView$lambda$6(BindEcoDeviceDeviceActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        ((BindEcoViewModel) this$0.getMViewModel()).getConnectDeviceStatus$eco_device_manager_chinaProductRelease().setValue(0);
        ((BindEcoViewModel) this$0.getMViewModel()).getPairDeviceStatus$eco_device_manager_chinaProductRelease().setValue(0);
        ((BindEcoViewModel) this$0.getMViewModel()).getBindAccountStatus$eco_device_manager_chinaProductRelease().setValue(0);
        ((BindEcoViewModel) this$0.getMViewModel()).getIsFail().set(8);
        this$0.startBind();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void bindView$lambda$7(BindEcoDeviceDeviceActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        DeviceTool deviceManagerExtKt = DeviceManagerExtKt.getInstance(DeviceTool.INSTANCE);
        EcoProduct ecoProduct = (EcoProduct) EcoDeviceManagerExtKt.getInstance(EcoProductManager.INSTANCE).getProductByModel(this$0.getMDeviceInfo().getModel());
        deviceManagerExtKt.launchToScanDevice(this$0, ecoProduct != null ? EcoProductExtKt.toDeviceProduct(ecoProduct) : null, true);
        this$0.finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void bindView$lambda$8(BindEcoDeviceDeviceActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Logger.i("tvFinish connected : " + ((BindEcoViewModel) this$0.getMViewModel()).getDid() + "mac :" + this$0.getMDeviceInfo().getBleMac(), new Object[0]);
        Context applicationContext = this$0.getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
        String did = ((BindEcoViewModel) this$0.getMViewModel()).getDid();
        Intrinsics.checkNotNull(did);
        ElectronicScaleManagerExtKt.launchToElectronicScaleUserInfoActivity(applicationContext, did, this$0.getMDeviceInfo().getBleMac(), true);
        this$0.finish();
        AppManager companion = AppManager.INSTANCE.getInstance();
        ScanDeviceActivity.Companion companion2 = ScanDeviceActivity.INSTANCE;
        Intrinsics.checkNotNullExpressionValue(ScanDeviceActivity.class, "forName(...)");
        companion.killActivity(ScanDeviceActivity.class);
    }

    private final void dismissBindConfirmDialog() {
        CommonDialog<?> mBindConfirmDialog = getMBindConfirmDialog();
        if (mBindConfirmDialog != null) {
            mBindConfirmDialog.dismiss();
        }
    }

    private final void dismissOOBConfirmDialog() {
        CommonDialog<?> commonDialog = this.mOObConfirmDialog;
        if (commonDialog != null) {
            commonDialog.dismiss();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onCreate$lambda$0(BindEcoDeviceDeviceActivity this$0, Integer num) {
        String string;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Logger.i("bindStatus start", new Object[0]);
        if (num != null && num.intValue() == 1) {
            string = this$0.getString(yzi.f40723r, EcoDeviceWebUrlsKt.getConnectHelpUrl(this$0.getMDeviceInfo().getModel()));
        } else if (num != null && num.intValue() == 3) {
            string = this$0.getString(yzi.B, EcoDeviceWebUrlsKt.getPairingFailHelpUrl(this$0.getMDeviceInfo().getModel()));
        } else {
            if (num != null && num.intValue() == 7) {
                String string2 = this$0.getString(yzi.Q);
                Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
                this$0.showErrorDialog(string2, this$0.getMDeviceInfo().getBleMac());
            } else if (num != null && num.intValue() == 5) {
                string = this$0.getString(yzi.A, EcoDeviceWebUrlsKt.getBindFailHelpUrl(this$0.getMDeviceInfo().getModel()));
            } else if (num != null && num.intValue() == 12) {
                string = this$0.getString(yzi.w);
            } else if (num != null && num.intValue() == 6) {
                this$0.getMBinding().J.setVisibility(this$0.getMDeviceInfo().isEcoScale() ? 0 : 8);
            }
            string = null;
        }
        if (string != null && string.length() != 0) {
            Intrinsics.checkNotNull(num);
            this$0.showFailedTip(string, num.intValue());
        }
        return Unit.INSTANCE;
    }

    private final void scrollToCurrentView(final View bindingView) {
        getMBinding().A.postDelayed(new Runnable() { // from class: wk2
            @Override // java.lang.Runnable
            public final void run() {
                BindEcoDeviceDeviceActivity.scrollToCurrentView$lambda$9(this.f38049a, bindingView);
            }
        }, 300L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void scrollToCurrentView$lambda$9(BindEcoDeviceDeviceActivity this$0, View bindingView) {
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
        CommonDialog commonDialogCreate = new CommonDialog.c("cancel_bind_dialog").setDialogDescriptionString(new DialogParams.DialogDescriptionString(string)).setPositiveText(yzi.j).setNegativeText(yzi.i).create();
        commonDialogCreate.addDialogCallback(new av6() { // from class: com.xiaomi.fitness.eco.device.manager.ui.bind.BindEcoDeviceDeviceActivity.showCancelBindConfirmDialog.1
            @Override // defpackage.av6
            public void onDialogClick(String dialogName, DialogInterface dialog, int which) {
                if (dialog != null) {
                    dialog.dismiss();
                }
                if (which != -1) {
                    return;
                }
                BindEcoDeviceDeviceActivity.this.finish();
            }
        });
        commonDialogCreate.showIfNeed(getSupportFragmentManager());
    }

    private final void showErrorDialog(String message, String mac) {
        CommonDialog commonDialogCreate = new CommonDialog.c("bind_error").setDialogTitle(yzi.P).setDialogDescriptionString(new DialogParams.DialogDescriptionString(yzi.O, new Object[0])).setPositiveText(yzi.j).create();
        commonDialogCreate.addDialogCallback(new av6() { // from class: com.xiaomi.fitness.eco.device.manager.ui.bind.BindEcoDeviceDeviceActivity.showErrorDialog.1
            @Override // defpackage.av6
            public void onDialogClick(String dialogName, DialogInterface dialog, int which) {
                if (dialog != null) {
                    dialog.dismiss();
                }
                BindEcoDeviceDeviceActivity.this.finish();
            }
        });
        commonDialogCreate.showIfNeed(getSupportFragmentManager());
    }

    private final void showPolicyDialog() {
        String currentLocale = LocaleUtil.getCurrentLocale();
        String lowerCase = RegionExtKt.getInstance(RegionManager.INSTANCE).getCurrentRegion().toLowerCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        CommonDialog<?> commonDialogCreate = new CommonDialog.c("policy_dialog").setDialogTitle(yzi.v).setPositiveText(yzi.p).setNegativeText(yzi.i).setDialogDescriptionString(new DialogParams.DialogDescriptionString(LinkSpanHelper.a(this, getString(yzi.Z, ElectronicScaleManagerExtKt.getInstance(ElectronicScaleManager.INSTANCE).getScalePrivacyUrl(true, lowerCase, currentLocale)), Integer.valueOf(dji.f15593a), new LinkSpanHelper.a() { // from class: vk2
            @Override // com.xiaomi.fitness.common.extensions.LinkSpanHelper.a
            public final void onLinkClicked(View view, String str) {
                BindEcoDeviceDeviceActivity.showPolicyDialog$lambda$10(view, str);
            }
        }))).create();
        Intrinsics.checkNotNull(commonDialogCreate);
        addPolicyDialogCallback(commonDialogCreate);
        commonDialogCreate.showIfNeed(getSupportFragmentManager());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void showPolicyDialog$lambda$10(View view, String str) {
        Intrinsics.checkNotNull(str);
        WebViewUtilKt.startWebView$default(str, null, false, false, null, false, null, false, 254, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.xiaomi.fitness.eco.device.manager.ui.bind.EcoBindDeviceActivity, com.xiaomi.fitness.baseui.view.BaseBindingActivity, com.xiaomi.fitness.baseui.view.ViewDataBinder
    public void bindView(@NotNull final xc7 xc7Var) {
        Intrinsics.checkNotNullParameter(xc7Var, "<this>");
        ((BindEcoViewModel) getMViewModel()).getConnectDeviceStatus$eco_device_manager_chinaProductRelease().observe(this, new BindEcoDeviceDeviceActivity$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: xk2
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return BindEcoDeviceDeviceActivity.bindView$lambda$1(xc7Var, this, (Integer) obj);
            }
        }));
        ((BindEcoViewModel) getMViewModel()).getPairDeviceStatus$eco_device_manager_chinaProductRelease().observe(this, new BindEcoDeviceDeviceActivity$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: yk2
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return BindEcoDeviceDeviceActivity.bindView$lambda$2(xc7Var, this, (Integer) obj);
            }
        }));
        ((BindEcoViewModel) getMViewModel()).getBindAccountStatus$eco_device_manager_chinaProductRelease().observe(this, new BindEcoDeviceDeviceActivity$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: zk2
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return BindEcoDeviceDeviceActivity.bindView$lambda$3(xc7Var, this, (Integer) obj);
            }
        }));
        ((BindEcoViewModel) getMViewModel()).getPairCode$eco_device_manager_chinaProductRelease().observe(this, new BindEcoDeviceDeviceActivity$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: al2
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return BindEcoDeviceDeviceActivity.bindView$lambda$4(this.f1155a, xc7Var, (String) obj);
            }
        }));
        ((BindEcoViewModel) getMViewModel()).getOobStatus$eco_device_manager_chinaProductRelease().observe(this, new BindEcoDeviceDeviceActivity$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: bl2
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return BindEcoDeviceDeviceActivity.bindView$lambda$5(this.f4327a, (Integer) obj);
            }
        }));
        xc7Var.B.setOnClickListener(new View.OnClickListener() { // from class: cl2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                BindEcoDeviceDeviceActivity.bindView$lambda$6(this.f5444a, view);
            }
        });
        xc7Var.C.setMovementMethod(LinkMovementMethod.getInstance());
        xc7Var.C.setAutoLinkMask(1);
        xc7Var.C.setHighlightColor(0);
        xc7Var.D.setOnClickListener(new View.OnClickListener() { // from class: dl2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                BindEcoDeviceDeviceActivity.bindView$lambda$7(this.f15645a, view);
            }
        });
        xc7Var.J.setOnClickListener(new View.OnClickListener() { // from class: el2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                BindEcoDeviceDeviceActivity.bindView$lambda$8(this.f16752a, view);
            }
        });
    }

    @Nullable
    public final CommonDialog<?> getMOObConfirmDialog() {
        return this.mOObConfirmDialog;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.xiaomi.fitness.eco.device.manager.ui.bind.EcoBindDeviceActivity, com.xiaomi.fitness.baseui.view.BaseActivity, androidx.p004activity.ComponentActivity, android.app.Activity
    /* JADX INFO: renamed from: onBackPressed */
    public void lambda$onCreate$0() {
        Integer value = ((BindEcoViewModel) getMViewModel()).getBindStatus$eco_device_manager_chinaProductRelease().getValue();
        if ((value != null && value.intValue() == 0) || ((value != null && value.intValue() == 2) || (value != null && value.intValue() == 4))) {
            showCancelBindConfirmDialog();
            return;
        }
        if (value != null && value.intValue() == 6) {
            Context applicationContext = getApplicationContext();
            Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
            String did = ((BindEcoViewModel) getMViewModel()).getDid();
            Intrinsics.checkNotNull(did);
            ElectronicScaleManagerExtKt.launchToElectronicScaleUserInfoActivity(applicationContext, did, getMDeviceInfo().getBleMac(), true);
            AppManager companion = AppManager.INSTANCE.getInstance();
            ScanDeviceActivity.Companion companion2 = ScanDeviceActivity.INSTANCE;
            Intrinsics.checkNotNullExpressionValue(ScanDeviceActivity.class, "forName(...)");
            companion.killActivity(ScanDeviceActivity.class);
        }
        super.lambda$onCreate$0();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.xiaomi.fitness.eco.device.manager.ui.bind.Hilt_BindEcoDeviceDeviceActivity, com.xiaomi.fitness.eco.device.manager.ui.bind.EcoBindDeviceActivity, com.xiaomi.fitness.baseui.view.BaseBindingActivity, com.xiaomi.fitness.baseui.view.BaseViewModelActivity, com.xiaomi.fitness.baseui.view.BaseActivity, miuix.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.p004activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ((BindEcoViewModel) getMViewModel()).getBindStatus$eco_device_manager_chinaProductRelease().observe(this, new BindEcoDeviceDeviceActivity$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: fl2
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return BindEcoDeviceDeviceActivity.onCreate$lambda$0(this.f17882a, (Integer) obj);
            }
        }));
    }

    @Override // android.app.Activity
    public boolean onNavigateUp() {
        lambda$onCreate$0();
        return true;
    }

    @Override // com.xiaomi.fitness.eco.device.manager.ui.bind.EcoBindDeviceActivity
    public void requestBindPermissionIfNeed() {
        showPolicyDialog();
    }

    @Override // com.xiaomi.fitness.eco.device.manager.ui.bind.EcoBindDeviceActivity
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
        String stringExtra4 = getIntent().getStringExtra("KEY_SHARE_ID");
        String stringExtra5 = getIntent().getStringExtra("KEY_SHARE_USER_ID");
        String stringExtra6 = getIntent().getStringExtra("KEY_SHARE_DID");
        String stringExtra7 = getIntent().getStringExtra("KEY_SHARE_MODEL");
        String stringExtra8 = getIntent().getStringExtra("to");
        EcoAddDeviceInfo ecoAddDeviceInfo = EcoDeviceExtKt.toEcoAddDeviceInfo(ecoProduct);
        String model = ecoProduct.getModel();
        if (stringExtra == null) {
            stringExtra = "";
        }
        return new EcoUriDeviceInfo(stringExtra2, model, stringExtra, stringExtra3, stringExtra4, stringExtra5, stringExtra6, stringExtra7, ecoAddDeviceInfo, stringExtra8);
    }

    public final void setMOObConfirmDialog(@Nullable CommonDialog<?> commonDialog) {
        this.mOObConfirmDialog = commonDialog;
    }

    public void showOOBConfirmDialog() {
        View viewInflate = LayoutInflater.from(this).inflate(fui.f18254k, (ViewGroup) null);
        ElectronicScaleManager electronicScaleManagerExtKt = ElectronicScaleManagerExtKt.getInstance(ElectronicScaleManager.INSTANCE);
        View viewFindViewById = viewInflate.findViewById(ari.m);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        electronicScaleManagerExtKt.loadImageFromNet((ImageView) viewFindViewById, ElectronicScaleManagerExtKt.IMAGE_ELECTRONIC_SCALE_PAIR, ElectronicScaleManagerExtKt.IMAGE_ELECTRONIC_SCALE_PAIR_NIGHT);
        CommonDialog<?> commonDialogCreate = new CommonDialog.c("oob_dialog").setDialogTitle(yzi.H0).setDialogDescription(yzi.I0).setCancelable(false).setCanceledOnTouchOutside(false).setCanceledOnBackPressed(false).setCustomView(viewInflate).create();
        this.mOObConfirmDialog = commonDialogCreate;
        if (commonDialogCreate != null) {
            commonDialogCreate.showIfNeed(getSupportFragmentManager());
        }
    }
}
