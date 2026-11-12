package com.huami.phn.coach.ui.dialog;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import com.huami.android.design.dialog.AlertDialogFragment;
import com.huami.android.design.dialog.DialogParams;
import com.huami.phn.coach.R;
import com.huami.phn.coach.koin.PHNProjectModuleKt;
import com.huami.phn.coach.ui.activity.PHNTerminationPlanActivity;
import com.huami.phn.coach.ui.dialog.MoreEditsDialog;
import com.huami.phn.core.device.DeviceManager;
import kotlin.Metadata;
import kotlin.jvm.internal.Reflection;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\f\u001a\u00020\t¢\u0006\u0004\b\u0010\u0010\u0011J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0005\u001a\u00020\u0004H\u0002J\u0012\u0010\b\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016R\u0016\u0010\f\u001a\u00020\t8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0018\u0010\u000f\u001a\u0004\u0018\u00010\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0005\u0010\u000e¨\u0006\u0012"}, d2 = {"Lcom/huami/phn/coach/ui/dialog/MoreEditsDialog;", "Lcom/huami/android/design/dialog/AlertDialogFragment;", "Landroid/view/View;", "getContentView", "", "i", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "Landroidx/fragment/app/FragmentManager;", "h", "Landroidx/fragment/app/FragmentManager;", "manager", "Lcom/huami/phn/coach/ui/dialog/DeviceDisconnectedDialog;", "Lcom/huami/phn/coach/ui/dialog/DeviceDisconnectedDialog;", "deviceDisconnectedDialog", "<init>", "(Landroidx/fragment/app/FragmentManager;)V", "phn_coach_release"}, k = 1, mv = {1, 5, 1})
public final class MoreEditsDialog extends AlertDialogFragment {

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @NotNull
    private final FragmentManager manager;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @Nullable
    private DeviceDisconnectedDialog deviceDisconnectedDialog;

    public MoreEditsDialog(@NotNull FragmentManager fragmentManager) {
        this.manager = fragmentManager;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void g(DeviceManager deviceManager, MoreEditsDialog moreEditsDialog, View view) {
        if (!deviceManager.isActiveDeviceConnected() || !deviceManager.isActiveDeviceSupportPhn()) {
            moreEditsDialog.i();
            return;
        }
        ModifyRestDaysDialog modifyRestDaysDialog = new ModifyRestDaysDialog(moreEditsDialog.manager);
        FragmentTransaction fragmentTransactionBeginTransaction = moreEditsDialog.manager.beginTransaction();
        fragmentTransactionBeginTransaction.setTransition(4099);
        modifyRestDaysDialog.show(fragmentTransactionBeginTransaction, "vdf_mrd");
        moreEditsDialog.dismiss();
    }

    private final View getContentView() {
        View viewInflate = View.inflate(getContext(), R.layout.phn_dialog_more_edits, null);
        TextView textView = (TextView) viewInflate.findViewById(R.id.tv_modify_rest_days);
        TextView textView2 = (TextView) viewInflate.findViewById(R.id.tv_termination_plan);
        final DeviceManager deviceManager = (DeviceManager) PHNProjectModuleKt.getPhnProjectKoinScope().get(Reflection.getOrCreateKotlinClass(DeviceManager.class), null, null);
        textView.setOnClickListener(new View.OnClickListener() { // from class: c85
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MoreEditsDialog.g(deviceManager, this, view);
            }
        });
        textView2.setOnClickListener(new View.OnClickListener() { // from class: b85
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MoreEditsDialog.h(deviceManager, this, view);
            }
        });
        return viewInflate;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void h(DeviceManager deviceManager, MoreEditsDialog moreEditsDialog, View view) {
        if (!deviceManager.isActiveDeviceConnected() || !deviceManager.isActiveDeviceSupportPhn()) {
            moreEditsDialog.i();
        } else {
            PHNTerminationPlanActivity.INSTANCE.start(moreEditsDialog.requireContext());
            moreEditsDialog.dismiss();
        }
    }

    private final void i() {
        DeviceDisconnectedDialog deviceDisconnectedDialog = this.deviceDisconnectedDialog;
        boolean z = false;
        if (deviceDisconnectedDialog != null && deviceDisconnectedDialog.isVisible()) {
            z = true;
        }
        if (z) {
            return;
        }
        if (this.deviceDisconnectedDialog == null) {
            this.deviceDisconnectedDialog = new DeviceDisconnectedDialog();
        }
        DeviceDisconnectedDialog deviceDisconnectedDialog2 = this.deviceDisconnectedDialog;
        if (deviceDisconnectedDialog2 == null) {
            return;
        }
        deviceDisconnectedDialog2.showAllowingStateLoss(this.manager, "tvModifyRestDays");
    }

    @Override // com.huami.android.design.dialog.AlertDialogFragment, com.huami.android.design.dialog.BaseDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        DialogParams dialogParams = new DialogParams();
        dialogParams.title = "";
        dialogParams.contentView = getContentView();
        setParams(dialogParams);
    }
}
