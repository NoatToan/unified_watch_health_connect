package com.xiaomi.fitness.devicesettings.huami.blbroadcast;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import androidx.lifecycle.Observer;
import com.xiaomi.fitness.baseui.dialog.CommonDialog;
import com.xiaomi.fitness.devicesettings.base.BaseLoadableBindingFragment;
import com.xiaomi.fitness.devicesettings.huami.blbroadcast.BLTBroadCastFragment;
import com.xiaomi.fitness.widget.SwitchButtonTwoLineTextView;
import com.xiaomi.fitness.widget.button.ISwitchButton;
import defpackage.av6;
import defpackage.eg6;
import defpackage.eui;
import defpackage.wzi;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0011\u0010\fJ!\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\bH\u0014¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0010\u001a\u00020\r8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0012"}, d2 = {"Lcom/xiaomi/fitness/devicesettings/huami/blbroadcast/BLTBroadCastFragment;", "Lcom/xiaomi/fitness/devicesettings/base/BaseLoadableBindingFragment;", "Lcom/xiaomi/fitness/devicesettings/huami/blbroadcast/BLTBroadCastViewModel;", "Leg6;", "Landroid/view/View;", "view", "Landroid/os/Bundle;", "savedInstanceState", "", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "setListener", "()V", "", "getLayoutId", "()I", "layoutId", "<init>", "device-settings_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class BLTBroadCastFragment extends BaseLoadableBindingFragment<BLTBroadCastViewModel, eg6> {
    /* JADX WARN: Multi-variable type inference failed */
    public static final /* synthetic */ eg6 access$getMBinding(BLTBroadCastFragment bLTBroadCastFragment) {
        return (eg6) bLTBroadCastFragment.getMBinding();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final /* synthetic */ BLTBroadCastViewModel access$getMViewModel(BLTBroadCastFragment bLTBroadCastFragment) {
        return (BLTBroadCastViewModel) bLTBroadCastFragment.getMViewModel();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void onViewCreated$lambda$0(BLTBroadCastFragment this$0, Boolean bool) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        SwitchButtonTwoLineTextView switchButtonTwoLineTextView = ((eg6) this$0.getMBinding()).A;
        Intrinsics.checkNotNull(bool);
        switchButtonTwoLineTextView.setSwitch(bool.booleanValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void setListener$lambda$1(final BLTBroadCastFragment this$0, final boolean z, ISwitchButton iSwitchButton) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (z) {
            new CommonDialog.c("bluetoothSwitchDialog").setDialogDescription(wzi.e1).setNegativeText(wzi.e).setPositiveText(wzi.f38514b).create().addDialogCallback(new av6() { // from class: com.xiaomi.fitness.devicesettings.huami.blbroadcast.BLTBroadCastFragment$setListener$1$1
                @Override // defpackage.av6
                public void onDialogClick(String dialogName, DialogInterface dialog, int which) {
                    super.onDialogClick(dialogName, dialog, which);
                    if (which == -2) {
                        BLTBroadCastFragment.access$getMBinding(this.this$0).A.setSwitch(!z);
                        if (dialog != null) {
                            dialog.dismiss();
                            return;
                        }
                        return;
                    }
                    if (which != -1) {
                        return;
                    }
                    BLTBroadCastFragment.access$getMViewModel(this.this$0).handleBluetoothBroadcastChecked(true);
                    if (dialog != null) {
                        dialog.dismiss();
                    }
                }
            }).show(this$0.getChildFragmentManager(), "");
        } else {
            ((BLTBroadCastViewModel) this$0.getMViewModel()).handleBluetoothBroadcastChecked(false);
        }
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseFragment, com.xiaomi.fitness.baseui.ViewCreator
    public int getLayoutId() {
        return eui.W;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.xiaomi.fitness.devicesettings.base.BaseLoadableBindingFragment, com.xiaomi.fitness.baseui.view.BaseBindingFragment, com.xiaomi.fitness.baseui.view.BaseViewModelFragment, com.xiaomi.fitness.baseui.view.BaseFragment, miuix.appcompat.app.Fragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        setTitle(wzi.d1);
        ((BLTBroadCastViewModel) getMViewModel()).isBlueToothEnable().observe(getViewLifecycleOwner(), new Observer() { // from class: qu1
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                BLTBroadCastFragment.onViewCreated$lambda$0(this.f31844a, (Boolean) obj);
            }
        });
        ((BLTBroadCastViewModel) getMViewModel()).getConnectedAdvStatus();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.xiaomi.fitness.baseui.view.BaseBindingFragment
    public void setListener() {
        super.setListener();
        ((eg6) getMBinding()).A.setOnCheckedChangeCallback(new ISwitchButton.a() { // from class: pu1
            @Override // com.xiaomi.fitness.widget.button.ISwitchButton.a
            public final void onCheckedChanged(boolean z, ISwitchButton iSwitchButton) {
                BLTBroadCastFragment.setListener$lambda$1(this.f30769a, z, iSwitchButton);
            }
        });
    }
}
