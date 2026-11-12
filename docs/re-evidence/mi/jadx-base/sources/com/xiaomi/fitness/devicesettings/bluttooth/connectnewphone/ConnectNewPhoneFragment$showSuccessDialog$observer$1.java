package com.xiaomi.fitness.devicesettings.bluttooth.connectnewphone;

import android.app.Dialog;
import android.content.DialogInterface;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.LifecycleOwner;
import com.miui.tsmclient.entity.CardInfo;
import com.xiaomi.fitness.baseui.dialog.CommonDialog;
import com.xiaomi.fitness.common.app.LifecycleConstantKt;
import com.xiaomi.fitness.devicesettings.bluttooth.connectnewphone.ConnectNewPhoneFragment$showSuccessDialog$observer$1;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import miuix.appcompat.app.c;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/xiaomi/fitness/devicesettings/bluttooth/connectnewphone/ConnectNewPhoneFragment$showSuccessDialog$observer$1", "Landroidx/lifecycle/DefaultLifecycleObserver;", LifecycleConstantKt.ON_RESUME, "", CardInfo.KEY_OWNER, "Landroidx/lifecycle/LifecycleOwner;", "device-settings_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ConnectNewPhoneFragment$showSuccessDialog$observer$1 implements DefaultLifecycleObserver {
    final /* synthetic */ CommonDialog $switchDialog;
    final /* synthetic */ ConnectNewPhoneFragment this$0;

    public ConnectNewPhoneFragment$showSuccessDialog$observer$1(CommonDialog commonDialog, ConnectNewPhoneFragment connectNewPhoneFragment) {
        this.$switchDialog = commonDialog;
        this.this$0 = connectNewPhoneFragment;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onResume$lambda$0(ConnectNewPhoneFragment this$0, DialogInterface dialogInterface) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        FragmentActivity mActivity = this$0.getMActivity();
        if (mActivity == null) {
            mActivity = this$0.requireActivity();
        }
        mActivity.finish();
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onResume(LifecycleOwner owner) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        super.onResume(owner);
        Dialog dialog = this.$switchDialog.getDialog();
        Intrinsics.checkNotNull(dialog, "null cannot be cast to non-null type miuix.appcompat.app.AlertDialog");
        final ConnectNewPhoneFragment connectNewPhoneFragment = this.this$0;
        ((c) dialog).setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: he4
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                ConnectNewPhoneFragment$showSuccessDialog$observer$1.onResume$lambda$0(connectNewPhoneFragment, dialogInterface);
            }
        });
    }
}
