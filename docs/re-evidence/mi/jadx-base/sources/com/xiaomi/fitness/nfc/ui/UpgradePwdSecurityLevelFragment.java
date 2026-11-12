package com.xiaomi.fitness.nfc.ui;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.lifecycle.Observer;
import com.mibi.sdk.common.account.AccountInteractActivity;
import com.xiaomi.fitness.baseui.common.BaseFragmentExKt;
import com.xiaomi.fitness.baseui.view.BaseBindingFragment;
import com.xiaomi.fitness.device.manager.DeviceModelExtKt;
import com.xiaomi.fitness.device.manager.export.DeviceManagerExtKt;
import com.xiaomi.fitness.device.manager.export.WearableDeviceManager;
import com.xiaomi.fitness.device.manager.export.WearableDeviceModel;
import com.xiaomi.fitness.nfc.ui.UpgradePwdSecurityLevelFragment;
import com.xiaomi.fitness.nfc.ui.issued.MasterCardListFragment;
import com.xiaomi.fitness.nfc.widget.DeviceImageView;
import defpackage.jtg;
import defpackage.o0j;
import defpackage.sui;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u0000 \u001e2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u001eB\u0007¢\u0006\u0004\b\u001d\u0010\u0006J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J!\u0010\u000b\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\b\u000b\u0010\fJ)\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\r2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u001d\u0010\u0019\u001a\u0004\u0018\u00010\u00148BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001c\u001a\u00020\r8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001f"}, d2 = {"Lcom/xiaomi/fitness/nfc/ui/UpgradePwdSecurityLevelFragment;", "Lcom/xiaomi/fitness/baseui/view/BaseBindingFragment;", "Lcom/xiaomi/fitness/nfc/ui/UpgradePwdSecurityLvViewModel;", "Ljtg;", "", "upgradePwdSecurityLevel", "()V", "Landroid/view/View;", "view", "Landroid/os/Bundle;", "savedInstanceState", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "", AccountInteractActivity.KEY_REQUEST_CODE, "resultCode", "Landroid/content/Intent;", "data", "onActivityResult", "(IILandroid/content/Intent;)V", "Lcom/xiaomi/fitness/device/manager/export/WearableDeviceModel;", "mDeviceModel$delegate", "Lkotlin/Lazy;", "getMDeviceModel", "()Lcom/xiaomi/fitness/device/manager/export/WearableDeviceModel;", "mDeviceModel", "getLayoutId", "()I", "layoutId", "<init>", "Companion", "nfc_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class UpgradePwdSecurityLevelFragment extends BaseBindingFragment<UpgradePwdSecurityLvViewModel, jtg> {
    public static final float HUAMI_PROGRESS_SCALE = 0.5f;

    @NotNull
    public static final String TAG = "UpgradePwdSecurityLevelFragment";
    public static final int sRequestFail = 10;

    /* JADX INFO: renamed from: mDeviceModel$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy mDeviceModel = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: mcq
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return UpgradePwdSecurityLevelFragment.mDeviceModel_delegate$lambda$0();
        }
    });

    private final WearableDeviceModel getMDeviceModel() {
        return (WearableDeviceModel) this.mDeviceModel.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final WearableDeviceModel mDeviceModel_delegate$lambda$0() {
        return (WearableDeviceModel) DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getCurrentDeviceModel();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onViewCreated$lambda$1(UpgradePwdSecurityLevelFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.hideBack();
        this$0.upgradePwdSecurityLevel();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onViewCreated$lambda$2(UpgradePwdSecurityLevelFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onViewCreated$lambda$3(UpgradePwdSecurityLevelFragment this$0, Integer num) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.showBack();
        Bundle bundle = new Bundle();
        if (num != null && num.intValue() == 2) {
            BaseFragmentExKt.gotoPage(this$0, MasterCardListFragment.class, bundle);
            this$0.finish();
        } else {
            if (num == null || num.intValue() != 0) {
                BaseFragmentExKt.gotoPageForResult(this$0, UpdateResultFragment.class, 10);
                return;
            }
            bundle.putBoolean(UpdateResultFragment.sIsSuccess, true);
            BaseFragmentExKt.gotoPage(this$0, UpdateResultFragment.class, bundle);
            this$0.finish();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void upgradePwdSecurityLevel() {
        getMBinding().G.setVisibility(0);
        getMBinding().G.setText(o0j.B6);
        getMBinding().E.setText(o0j.C6);
        getMBinding().C.setVisibility(0);
        getMBinding().D.setVisibility(8);
        getMBinding().A.setVisibility(8);
        getMBinding().B.setVisibility(8);
        ((UpgradePwdSecurityLvViewModel) getMViewModel()).upgradePwdSecurityLevel();
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseFragment, com.xiaomi.fitness.baseui.ViewCreator
    public int getLayoutId() {
        return sui.M0;
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == 10) {
            if (resultCode == -1) {
                upgradePwdSecurityLevel();
            } else {
                finish();
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.xiaomi.fitness.baseui.view.BaseBindingFragment, com.xiaomi.fitness.baseui.view.BaseViewModelFragment, com.xiaomi.fitness.baseui.view.BaseFragment, miuix.appcompat.app.Fragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        setTitle(o0j.D6);
        if (getMDeviceModel() != null) {
            WearableDeviceModel mDeviceModel = getMDeviceModel();
            Intrinsics.checkNotNull(mDeviceModel);
            if (DeviceModelExtKt.isHuaMi(mDeviceModel)) {
                getMBinding().C.setScaleX(0.5f);
            } else {
                getMBinding().C.setScaleY(0.5f);
            }
        }
        DeviceImageView deviceImageView = getMBinding().H;
        WearableDeviceModel mDeviceModel2 = getMDeviceModel();
        Intrinsics.checkNotNull(mDeviceModel2);
        deviceImageView.show(mDeviceModel2);
        getMBinding().A.setOnClickListener(new View.OnClickListener() { // from class: ncq
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                UpgradePwdSecurityLevelFragment.onViewCreated$lambda$1(this.f27793a, view2);
            }
        });
        getMBinding().B.setOnClickListener(new View.OnClickListener() { // from class: ocq
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                UpgradePwdSecurityLevelFragment.onViewCreated$lambda$2(this.f29014a, view2);
            }
        });
        ((UpgradePwdSecurityLvViewModel) getMViewModel()).getResultCode().observe(getViewLifecycleOwner(), new Observer() { // from class: pcq
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                UpgradePwdSecurityLevelFragment.onViewCreated$lambda$3(this.f30259a, (Integer) obj);
            }
        });
    }
}
