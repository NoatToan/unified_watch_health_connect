package com.xiaomi.fitness.devicesettings.common.lock;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.mibi.sdk.common.account.AccountInteractActivity;
import com.xiaomi.fitness.baseui.common.BaseFragmentExKt;
import com.xiaomi.fitness.baseui.dialog.CommonDialog;
import com.xiaomi.fitness.baseui.view.BaseBindingFragment;
import com.xiaomi.fitness.baseui.view.PageState;
import com.xiaomi.fitness.common.extensions.ToastExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.device.manager.export.DeviceManagerExtKt;
import com.xiaomi.fitness.device.manager.export.WearableDeviceManager;
import com.xiaomi.fitness.device.manager.export.WearableDeviceModel;
import com.xiaomi.fitness.devicesettings.common.lock.UnWearSettingFragment;
import defpackage.av6;
import defpackage.cj6;
import defpackage.eui;
import defpackage.wzi;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\u0018\u0000 %2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001%B\u0007¢\u0006\u0004\b$\u0010\u0006J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0019\u0010\r\u001a\u00020\u00042\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0013\u0010\u000f\u001a\u00020\u0004*\u00020\u0003H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u0011\u0010\u0006J)\u0010\u0017\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u00122\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0016¢\u0006\u0004\b\u0017\u0010\u0018R\u001d\u0010\u001e\u001a\u0004\u0018\u00010\u00198BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0016\u0010\u001f\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010#\u001a\u00020\u00128VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b!\u0010\"¨\u0006&"}, d2 = {"Lcom/xiaomi/fitness/devicesettings/common/lock/UnWearSettingFragment;", "Lcom/xiaomi/fitness/baseui/view/BaseBindingFragment;", "Lcom/xiaomi/fitness/devicesettings/common/lock/UnWearSettingViewModel;", "Lcj6;", "", "loadLockStatus", "()V", "", "enable", "refreshUI", "(Z)V", "Landroid/os/Bundle;", "args", "setArguments", "(Landroid/os/Bundle;)V", "bindView", "(Lcj6;)V", "setListener", "", AccountInteractActivity.KEY_REQUEST_CODE, "resultCode", "Landroid/content/Intent;", "data", "onActivityResult", "(IILandroid/content/Intent;)V", "Lcom/xiaomi/fitness/device/manager/export/WearableDeviceModel;", "mDeviceModel$delegate", "Lkotlin/Lazy;", "getMDeviceModel", "()Lcom/xiaomi/fitness/device/manager/export/WearableDeviceModel;", "mDeviceModel", "isNFCNeed", "Z", "getLayoutId", "()I", "layoutId", "<init>", "Companion", "device-settings_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class UnWearSettingFragment extends BaseBindingFragment<UnWearSettingViewModel, cj6> {

    @NotNull
    public static final String IS_NFC_NEED = "sIsNeedSync";
    public static final int sRequestCodeSetPwd = 10;
    private boolean isNFCNeed;

    /* JADX INFO: renamed from: mDeviceModel$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy mDeviceModel = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: c9q
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return UnWearSettingFragment.mDeviceModel_delegate$lambda$0();
        }
    });

    /* JADX WARN: Multi-variable type inference failed */
    public static final /* synthetic */ UnWearSettingViewModel access$getMViewModel(UnWearSettingFragment unWearSettingFragment) {
        return (UnWearSettingViewModel) unWearSettingFragment.getMViewModel();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final WearableDeviceModel getMDeviceModel() {
        return (WearableDeviceModel) this.mDeviceModel.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final void loadLockStatus() {
        PageState.DefaultImpls.showLoading$default(this, null, 0, false, 5, null);
        ((UnWearSettingViewModel) getMViewModel()).getUnWearSettings(new Function1() { // from class: x8q
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return UnWearSettingFragment.loadLockStatus$lambda$1(this.f38869a, ((Boolean) obj).booleanValue());
            }
        }, new Function0() { // from class: y8q
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return UnWearSettingFragment.loadLockStatus$lambda$2(this.f39939a);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit loadLockStatus$lambda$1(UnWearSettingFragment this$0, boolean z) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.hideLoading();
        this$0.refreshUI(z);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit loadLockStatus$lambda$2(final UnWearSettingFragment this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (this$0.isInvalid()) {
            return Unit.INSTANCE;
        }
        this$0.hideLoading();
        new CommonDialog.c("unWear_dialog_load_status_fail").setDialogDescription(wzi.R8).setNegativeText(wzi.e).setPositiveText(wzi.common_retry).setCancelable(false).create().addDialogCallback(new av6() { // from class: com.xiaomi.fitness.devicesettings.common.lock.UnWearSettingFragment$loadLockStatus$2$1
            @Override // defpackage.av6
            public void onDialogClick(String dialogName, DialogInterface dialog, int which) {
                super.onDialogClick(dialogName, dialog, which);
                if (which == -2) {
                    if (dialog != null) {
                        dialog.dismiss();
                    }
                    this.this$0.finish();
                } else {
                    if (which != -1) {
                        return;
                    }
                    this.this$0.loadLockStatus();
                    if (dialog != null) {
                        dialog.dismiss();
                    }
                }
            }
        }).showIfNeed(this$0.getParentFragmentManager());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final WearableDeviceModel mDeviceModel_delegate$lambda$0() {
        return (WearableDeviceModel) DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getCurrentDeviceModel();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void refreshUI(boolean enable) {
        if (enable) {
            getMBinding().C.setVisibility(0);
            getMBinding().F.setVisibility(8);
        } else {
            getMBinding().C.setVisibility(8);
            getMBinding().F.setVisibility(0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void setListener$lambda$3(UnWearSettingFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (((UnWearSettingViewModel) this$0.getMViewModel()).isCanDeletePwd()) {
            new CommonDialog.c("unWear_dialog").setDialogTitle(wzi.Q8).setDialogDescription(wzi.P8).setNegativeText(wzi.e).setPositiveText(wzi.g).create().addDialogCallback(new UnWearSettingFragment$setListener$1$1(this$0)).showIfNeed(this$0.getParentFragmentManager());
            return;
        }
        FragmentActivity mActivity = this$0.getMActivity();
        Intrinsics.checkNotNull(mActivity);
        ToastExtKt.toastShort(mActivity, wzi.Ga);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void setListener$lambda$4(UnWearSettingFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Bundle bundle = new Bundle();
        bundle.putBoolean(IS_NFC_NEED, this$0.isNFCNeed);
        bundle.putBoolean(SetUnWearPwdFragment.sIsRequired, ((UnWearSettingViewModel) this$0.getMViewModel()).getIsRequired());
        BaseFragmentExKt.gotoPageForResult(this$0, (Class<?>) SetUnWearPwdFragment.class, bundle, 10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setListener$lambda$5(UnWearSettingFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Bundle bundle = new Bundle();
        bundle.putBoolean(IS_NFC_NEED, this$0.isNFCNeed);
        BaseFragmentExKt.gotoPageForResult(this$0, (Class<?>) SetUnWearPwdFragment.class, bundle, 10);
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseBindingFragment, com.xiaomi.fitness.baseui.view.ViewDataBinder
    public void bindView(@NotNull cj6 cj6Var) {
        Intrinsics.checkNotNullParameter(cj6Var, "<this>");
        setTitle(wzi.r5);
        getMBinding().A.show(getMDeviceModel());
        loadLockStatus();
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseFragment, com.xiaomi.fitness.baseui.ViewCreator
    public int getLayoutId() {
        return eui.H0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.fragment.app.Fragment
    public void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == 10 && resultCode == -1) {
            if (this.isNFCNeed) {
                finish();
            } else {
                ((UnWearSettingViewModel) getMViewModel()).getWearSetting().setPassword(data != null ? data.getStringExtra(SetUnWearPwdFragment.sPassWord) : null);
                refreshUI(true);
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void setArguments(@Nullable Bundle args) {
        super.setArguments(args);
        if (args != null) {
            boolean z = args.getBoolean(IS_NFC_NEED);
            this.isNFCNeed = z;
            Logger.d("isNFCNeed isNeedSync:" + z, new Object[0]);
        }
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseBindingFragment
    public void setListener() {
        getMBinding().B.setOnClickListener(new View.OnClickListener() { // from class: z8q
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                UnWearSettingFragment.setListener$lambda$3(this.f41033a, view);
            }
        });
        getMBinding().G.setOnClickListener(new View.OnClickListener() { // from class: a9q
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                UnWearSettingFragment.setListener$lambda$4(this.f807a, view);
            }
        });
        getMBinding().E.setOnClickListener(new View.OnClickListener() { // from class: b9q
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                UnWearSettingFragment.setListener$lambda$5(this.f3959a, view);
            }
        });
    }
}
