package com.xiaomi.fitness.device.manager.ui.manager;

import android.content.DialogInterface;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.PopupWindow;
import androidx.recyclerview.widget.RecyclerView;
import com.xiaomi.fitness.baseui.dialog.CommonDialog;
import com.xiaomi.fitness.baseui.dialog.DialogParams;
import com.xiaomi.fitness.baseui.recyclerview.decoration.LinearItemSpace;
import com.xiaomi.fitness.baseui.view.IActionBar;
import com.xiaomi.fitness.baseui.view.PageState;
import com.xiaomi.fitness.blood_sugar.BloodSugarExtKt;
import com.xiaomi.fitness.blood_sugar.BloodSugarManager;
import com.xiaomi.fitness.common.app.LifecycleConstantKt;
import com.xiaomi.fitness.common.extensions.AnyExtKt;
import com.xiaomi.fitness.common.extensions.NetworkExtKt;
import com.xiaomi.fitness.common.extensions.ResourceExtKt;
import com.xiaomi.fitness.common.extensions.ToastExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.AppUtil;
import com.xiaomi.fitness.component.StandardComponentEvent;
import com.xiaomi.fitness.device.manager.DeviceManager;
import com.xiaomi.fitness.device.manager.DeviceModelExtKt;
import com.xiaomi.fitness.device.manager.export.WearableDeviceModel;
import com.xiaomi.fitness.device.manager.extensions.BluetoothExtKt;
import com.xiaomi.fitness.device.manager.extensions.OhterExtKt;
import com.xiaomi.fitness.device.manager.l;
import com.xiaomi.fitness.device.manager.ui.DeviceDetail;
import com.xiaomi.fitness.device.manager.ui.manager.ManagerActivity;
import com.xiaomi.fitness.extensions.ViewExtKt;
import com.xiaomi.fitness.sleep.trace.analyze.SleepAnalyzerAlpha;
import defpackage.av6;
import defpackage.bji;
import defpackage.dui;
import defpackage.eli;
import defpackage.f9q;
import defpackage.hni;
import defpackage.m16;
import defpackage.ogi;
import defpackage.uzi;
import defpackage.wc0;
import defpackage.xqi;
import defpackage.zv1;
import java.lang.ref.WeakReference;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\t\b\u0007\u0018\u0000 72\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u000287B\u0007¢\u0006\u0004\b6\u0010\u0006J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\u0006J\u0017\u0010\n\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\u0010\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u001a\u001a\u00020\u00042\u0006\u0010\u0019\u001a\u00020\u0018H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u001f\u0010\u001d\u001a\u00020\u00042\u0006\u0010\u001c\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u0018H\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u0019\u0010!\u001a\u00020\u00042\b\u0010 \u001a\u0004\u0018\u00010\u001fH\u0014¢\u0006\u0004\b!\u0010\"J\u0013\u0010#\u001a\u00020\u0004*\u00020\u0003H\u0016¢\u0006\u0004\b#\u0010$J\u0017\u0010'\u001a\u00020\b2\u0006\u0010&\u001a\u00020%H\u0016¢\u0006\u0004\b'\u0010(J\u0017\u0010+\u001a\u00020\u00042\u0006\u0010*\u001a\u00020)H\u0016¢\u0006\u0004\b+\u0010,J\u000f\u0010-\u001a\u00020\u0004H\u0016¢\u0006\u0004\b-\u0010\u0006R\u0016\u0010.\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b.\u0010/R\u0014\u00103\u001a\u0002008VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b1\u00102R\u0014\u00105\u001a\u0002008VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b4\u00102¨\u00069"}, d2 = {"Lcom/xiaomi/fitness/device/manager/ui/manager/ManagerActivity;", "Lcom/xiaomi/fitness/baseui/view/BaseBindingActivity;", "Lcom/xiaomi/fitness/device/manager/ui/manager/ManagerViewModel;", "Lm16;", "", "onTitleBarStartViewClicked", "()V", "onTitleBarEndViewClicked", "", "editMode", "changeDisplayMode", "(Z)V", "Landroid/view/View;", "itemView", "Lcom/xiaomi/fitness/device/manager/ui/DeviceDetail;", "deviceDetail", "showUnbindWindow", "(Landroid/view/View;Lcom/xiaomi/fitness/device/manager/ui/DeviceDetail;)V", "", SleepAnalyzerAlpha.NAME_ALPHA, "setWindowAlpha", "(F)V", "confirmUnbound", "(Lcom/xiaomi/fitness/device/manager/ui/DeviceDetail;)V", "", "did", "unbind", "(Ljava/lang/String;)V", "deviceName", "confirmSwitchDevice", "(Ljava/lang/String;Ljava/lang/String;)V", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "bindView", "(Lm16;)V", "Landroid/view/MenuItem;", "item", "onOptionsItemSelected", "(Landroid/view/MenuItem;)Z", "Landroid/content/res/Configuration;", StandardComponentEvent.KEY_NEW_CONFIG, "onConfigurationChanged", "(Landroid/content/res/Configuration;)V", "onBackPressed", "launchFromDeviceTabV4", "Z", "", "getViewModelId", "()I", "viewModelId", "getLayoutId", "layoutId", "<init>", "Companion", "UnBindHelper", "device-manager_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class ManagerActivity extends Hilt_ManagerActivity<ManagerViewModel, m16> {

    @NotNull
    public static final String LAUNCH_fROM_V4 = "launch_from_v4";
    private boolean launchFromDeviceTabV4;

    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0018\u001a\u00020\u0013\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\n\u0010\fR\u0017\u0010\u000e\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001d\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u00128\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u001b"}, d2 = {"Lcom/xiaomi/fitness/device/manager/ui/manager/ManagerActivity$UnBindHelper;", "Lcom/xiaomi/fitness/device/manager/l$a;", "", "onSuccess", "()V", "", "code", "onFail", "(I)V", "", "isWearOs", "Z", "()Z", "", "did", "Ljava/lang/String;", "getDid", "()Ljava/lang/String;", "Ljava/lang/ref/WeakReference;", "Lcom/xiaomi/fitness/device/manager/ui/manager/ManagerActivity;", "ref", "Ljava/lang/ref/WeakReference;", "getRef", "()Ljava/lang/ref/WeakReference;", LifecycleConstantKt.TYPE_ACTIVITY, "<init>", "(Lcom/xiaomi/fitness/device/manager/ui/manager/ManagerActivity;ZLjava/lang/String;)V", "device-manager_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
    public static final class UnBindHelper extends l.a {

        @NotNull
        private final String did;
        private final boolean isWearOs;

        @NotNull
        private final WeakReference<ManagerActivity> ref;

        public UnBindHelper(@NotNull ManagerActivity activity, boolean z, @NotNull String did) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            Intrinsics.checkNotNullParameter(did, "did");
            this.isWearOs = z;
            this.did = did;
            this.ref = new WeakReference<>(activity);
        }

        @NotNull
        public final String getDid() {
            return this.did;
        }

        @NotNull
        public final WeakReference<ManagerActivity> getRef() {
            return this.ref;
        }

        /* JADX INFO: renamed from: isWearOs, reason: from getter */
        public final boolean getIsWearOs() {
            return this.isWearOs;
        }

        @Override // com.xiaomi.fitness.device.manager.l
        public void onFail(int code) {
            AnyExtKt.main$default(null, new ManagerActivity$UnBindHelper$onFail$1(this, null), 1, null);
        }

        @Override // com.xiaomi.fitness.device.manager.l
        public void onSuccess() {
            AnyExtKt.main$default(null, new ManagerActivity$UnBindHelper$onSuccess$1(this, null), 1, null);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final /* synthetic */ ManagerViewModel access$getMViewModel(ManagerActivity managerActivity) {
        return (ManagerViewModel) managerActivity.getMViewModel();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit bindView$lambda$4(final ManagerActivity this$0, DeviceDetail deviceDetail, int i, View itemView) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(deviceDetail, "deviceDetail");
        Intrinsics.checkNotNullParameter(itemView, "itemView");
        if (!Intrinsics.areEqual(deviceDetail.getDid(), ManagerViewModel.ADD_NEW_DID)) {
            if (itemView.getId() == xqi.N) {
                if (Intrinsics.areEqual(deviceDetail.getName(), "欧态易测")) {
                    BloodSugarExtKt.getInstance(BloodSugarManager.INSTANCE).goBloodSugarDevice(this$0);
                    return Unit.INSTANCE;
                }
                if (deviceDetail.getIsCurrent() || deviceDetail.getIsAccessory()) {
                    BluetoothExtKt.openBluetooth(this$0, new Function0() { // from class: e3f
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return ManagerActivity.bindView$lambda$4$lambda$2(this.f16221a);
                        }
                    }, new Function1() { // from class: f3f
                        @Override // kotlin.jvm.functions.Function1
                        /* JADX INFO: renamed from: invoke */
                        public final Object invoke2(Object obj) {
                            return ManagerActivity.bindView$lambda$4$lambda$3(((Integer) obj).intValue());
                        }
                    });
                } else {
                    this$0.confirmSwitchDevice(deviceDetail.getName(), deviceDetail.getDid());
                }
            } else if (itemView.getId() == xqi.f39369r) {
                this$0.confirmUnbound(deviceDetail);
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit bindView$lambda$4$lambda$2(ManagerActivity this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        DeviceManager.DefaultImpls.connectDevice$default(((ManagerViewModel) this$0.getMViewModel()).getDeviceManager(), null, 1, null);
        this$0.finish();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit bindView$lambda$4$lambda$3(int i) {
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final boolean bindView$lambda$5(ManagerActivity this$0, DeviceDetail deviceDetail, int i, View itemView) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(deviceDetail, "deviceDetail");
        Intrinsics.checkNotNullParameter(itemView, "itemView");
        if (Intrinsics.areEqual(deviceDetail.getDid(), ManagerViewModel.ADD_NEW_DID) || ((ManagerViewModel) this$0.getMViewModel()).isEditMode()) {
            return false;
        }
        this$0.showUnbindWindow(itemView, deviceDetail);
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void changeDisplayMode(boolean editMode) {
        View endView;
        View endView2;
        wc0 miuiActionBar = getMiuiActionBar();
        if (miuiActionBar != null && (endView2 = miuiActionBar.getEndView()) != null) {
            endView2.setBackgroundResource(editMode ? hni.H : hni.g);
        }
        wc0 miuiActionBar2 = getMiuiActionBar();
        if (miuiActionBar2 != null && (endView = miuiActionBar2.getEndView()) != null) {
            endView.setContentDescription(getString(editMode ? uzi.d : uzi.common_delete));
        }
        ((ManagerViewModel) getMViewModel()).changeMode(editMode);
    }

    private final void confirmSwitchDevice(String deviceName, final String did) {
        CommonDialog commonDialogCreate = new CommonDialog.c("switch").setDialogTitle(uzi.J1).setDialogDescriptionString(new DialogParams.DialogDescriptionString(uzi.K1, deviceName)).setPositiveText(uzi.d).setNegativeText(uzi.c).create();
        commonDialogCreate.addDialogCallback(new av6() { // from class: com.xiaomi.fitness.device.manager.ui.manager.ManagerActivity.confirmSwitchDevice.1
            @Override // defpackage.av6
            public void onDialogClick(String dialogName, DialogInterface dialog, int which) {
                if (dialog != null) {
                    dialog.dismiss();
                }
                if (which == -1) {
                    ManagerActivity.access$getMViewModel(ManagerActivity.this).getDeviceManager().switchDevice(ManagerActivity.access$getMViewModel(ManagerActivity.this).getDeviceManager().getDeviceModel(did));
                    ManagerActivity.this.finish();
                }
            }
        });
        commonDialogCreate.showIfNeed(getSupportFragmentManager());
    }

    private final void confirmUnbound(final DeviceDetail deviceDetail) {
        CommonDialog commonDialogCreate = new CommonDialog.c("unbind").setDialogTitle(new DialogParams.DialogDescriptionString(uzi.j0, deviceDetail.getName())).setDialogDescriptionString(new DialogParams.DialogDescriptionString(uzi.i0, deviceDetail.getName())).setPositiveText(uzi.d).setNegativeText(uzi.c).create();
        commonDialogCreate.addDialogCallback(new av6() { // from class: com.xiaomi.fitness.device.manager.ui.manager.ManagerActivity.confirmUnbound.1
            @Override // defpackage.av6
            public void onDialogClick(String dialogName, DialogInterface dialog, int which) {
                if (dialog != null) {
                    dialog.dismiss();
                }
                if (which == -1) {
                    if (NetworkExtKt.isNetworkAvailable()) {
                        ManagerActivity.this.unbind(deviceDetail.getDid());
                    } else {
                        ToastExtKt.toastShort(ManagerActivity.this, uzi.common_hint_network_unavailable);
                    }
                }
            }
        });
        commonDialogCreate.showIfNeed(getSupportFragmentManager());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onCreate$lambda$0(ManagerActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.onTitleBarEndViewClicked();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onCreate$lambda$1(ManagerActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.lambda$onCreate$0();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void onTitleBarEndViewClicked() {
        if (((ManagerViewModel) getMViewModel()).isEditMode()) {
            changeDisplayMode(false);
        } else if (((ManagerViewModel) getMViewModel()).getAdapter().getItemCount() > 1) {
            changeDisplayMode(true);
        } else {
            Logger.w("current no device", new Object[0]);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void onTitleBarStartViewClicked() {
        if (((ManagerViewModel) getMViewModel()).isEditMode()) {
            changeDisplayMode(false);
        } else {
            lambda$onCreate$0();
        }
    }

    private final void setWindowAlpha(float alpha) {
        Window window = getWindow();
        if (window == null) {
            return;
        }
        WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.alpha = alpha;
        window.addFlags(2);
        window.setAttributes(attributes);
    }

    private final void showUnbindWindow(View itemView, final DeviceDetail deviceDetail) {
        try {
            final f9q f9qVar = new f9q(this, uzi.Y1);
            f9qVar.setOnBtnClickListener(new View.OnClickListener() { // from class: c3f
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    ManagerActivity.showUnbindWindow$lambda$8$lambda$6(f9qVar, this, deviceDetail, view);
                }
            });
            f9qVar.setOnDismissListener(new PopupWindow.OnDismissListener() { // from class: d3f
                @Override // android.widget.PopupWindow.OnDismissListener
                public final void onDismiss() {
                    ManagerActivity.showUnbindWindow$lambda$8$lambda$7(this.f15034a);
                }
            });
            setWindowAlpha(0.3f);
            int[] iArr = new int[2];
            itemView.getLocationOnScreen(iArr);
            Logger.d("showUnbindWindow " + iArr[0] + iArr[1], new Object[0]);
            f9qVar.showAtLocation(itemView, (AppUtil.isRTLDirection() ? 8388611 : 8388613) | 48, OhterExtKt.dp2Px(15), iArr[1] + OhterExtKt.dp2Px(10));
        } catch (Exception e) {
            Logger.e("showUnbindWindow error ", e);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void showUnbindWindow$lambda$8$lambda$6(f9q this_apply, ManagerActivity this$0, DeviceDetail deviceDetail, View view) {
        Intrinsics.checkNotNullParameter(this_apply, "$this_apply");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(deviceDetail, "$deviceDetail");
        this_apply.dismiss();
        this$0.confirmUnbound(deviceDetail);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void showUnbindWindow$lambda$8$lambda$7(ManagerActivity this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.setWindowAlpha(1.0f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final void unbind(String did) {
        boolean z = false;
        PageState.DefaultImpls.showLoading$default(this, uzi.Z1, false, 2, null);
        WearableDeviceModel wearableDeviceModel = (WearableDeviceModel) ((ManagerViewModel) getMViewModel()).getDeviceManager().getDeviceModel(did);
        if (wearableDeviceModel != null && DeviceModelExtKt.isWearOS(wearableDeviceModel)) {
            z = true;
        }
        ((ManagerViewModel) getMViewModel()).unbindDevice(did, new UnBindHelper(this, z, did));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.xiaomi.fitness.baseui.view.BaseBindingActivity, com.xiaomi.fitness.baseui.view.ViewDataBinder
    public void bindView(@NotNull m16 m16Var) {
        Intrinsics.checkNotNullParameter(m16Var, "<this>");
        m16Var.A.addItemDecoration(new LinearItemSpace((int) ResourceExtKt.getDimen(this, eli.e), false, false, 6, null));
        ((ManagerViewModel) getMViewModel()).getAdapter().setOnChildClickListener(new Function3() { // from class: g3f
            @Override // kotlin.jvm.functions.Function3
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                return ManagerActivity.bindView$lambda$4(this.f18549a, (DeviceDetail) obj, ((Integer) obj2).intValue(), (View) obj3);
            }
        });
        ((ManagerViewModel) getMViewModel()).getAdapter().setOnItemLongClickListener(new Function3() { // from class: h3f
            @Override // kotlin.jvm.functions.Function3
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                return Boolean.valueOf(ManagerActivity.bindView$lambda$5(this.f19645a, (DeviceDetail) obj, ((Integer) obj2).intValue(), (View) obj3));
            }
        });
    }

    @Override // com.xiaomi.fitness.baseui.ViewCreator
    public int getLayoutId() {
        return dui.e;
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseBindingActivity
    public int getViewModelId() {
        return zv1.f41707k;
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseActivity, androidx.p004activity.ComponentActivity, android.app.Activity
    /* JADX INFO: renamed from: onBackPressed */
    public void lambda$onCreate$0() {
        finish();
        if (this.launchFromDeviceTabV4) {
            overridePendingTransition(ogi.c, ogi.f29147b);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.xiaomi.fitness.baseui.view.BaseBindingActivity, com.xiaomi.fitness.baseui.view.BaseActivity, miuix.appcompat.app.AppCompatActivity, androidx.p004activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(@NotNull Configuration newConfig) {
        Intrinsics.checkNotNullParameter(newConfig, "newConfig");
        super.onConfigurationChanged(newConfig);
        int dimen = (int) ResourceExtKt.getDimen(this, eli.h);
        RecyclerView deviceRvDeviceManager = ((m16) getMBinding()).A;
        Intrinsics.checkNotNullExpressionValue(deviceRvDeviceManager, "deviceRvDeviceManager");
        ViewExtKt.setNewPadding$default(deviceRvDeviceManager, dimen, 0, dimen, 0, 10, null);
    }

    @Override // com.xiaomi.fitness.device.manager.ui.manager.Hilt_ManagerActivity, com.xiaomi.fitness.baseui.view.BaseBindingActivity, com.xiaomi.fitness.baseui.view.BaseViewModelActivity, com.xiaomi.fitness.baseui.view.BaseActivity, miuix.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.p004activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setActionBarNormalTitleMode();
        setTitle(uzi.H0);
        setTitleBackground(bji.e);
        this.launchFromDeviceTabV4 = getIntent().getBooleanExtra(LAUNCH_fROM_V4, false);
        IActionBar.DefaultImpls.setEndView$default(this, 0, hni.g, getString(uzi.common_delete), new View.OnClickListener() { // from class: i3f
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ManagerActivity.onCreate$lambda$0(this.f20737a, view);
            }
        }, 1, null);
        if (this.launchFromDeviceTabV4) {
            hideBack();
            IActionBar.DefaultImpls.setStartView$default(this, 0, hni.C, getString(uzi.f36321b), new View.OnClickListener() { // from class: j3f
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    ManagerActivity.onCreate$lambda$1(this.f22378a, view);
                }
            }, 1, null);
        }
    }

    @Override // android.app.Activity
    public boolean onOptionsItemSelected(@NotNull MenuItem item) {
        Intrinsics.checkNotNullParameter(item, "item");
        if (item.getItemId() != 16908332) {
            return super.onOptionsItemSelected(item);
        }
        onTitleBarStartViewClicked();
        return true;
    }
}
