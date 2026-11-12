package com.huami.feedback.ui;

import android.content.DialogInterface;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import com.huami.android.design.dialog.AlertDialogFragment;
import com.huami.feedback.R;
import com.huami.feedback.ui.DialogUtilsKt;
import com.huami.tools.log.HMLog;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.StringCompanionObject;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u0016\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002\u001a&\u0010\n\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u00062\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\bH\u0000\"\u0016\u0010\u000b\u001a\u00020\u00068\u0000@\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Landroidx/fragment/app/FragmentActivity;", "activity", "Landroidx/fragment/app/FragmentManager;", "fragmentManager", "", "showExitDialog", "", "deviceName", "Lkotlin/Function0;", "fwUpgradeFunc", "showUpgradeDialog", "CANCEL_UPLOAD_DIALOG", "Ljava/lang/String;", "feedback-impl_release"}, k = 2, mv = {1, 5, 1})
public final class DialogUtilsKt {

    @NotNull
    public static final String CANCEL_UPLOAD_DIALOG = "cancel_upload_dialog";

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<String> {
        public final /* synthetic */ String a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str) {
            super(0);
            this.a = str;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return Intrinsics.stringPlus("提示升级固件的设备：", this.a);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(DialogInterface dialogInterface, int i) {
        dialogInterface.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(FragmentActivity fragmentActivity, DialogInterface dialogInterface, int i) {
        fragmentActivity.finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void f(Function0 function0, FragmentActivity fragmentActivity, DialogInterface dialogInterface, int i) {
        function0.invoke();
        fragmentActivity.finish();
    }

    public static final void showExitDialog(@NotNull final FragmentActivity fragmentActivity, @NotNull FragmentManager fragmentManager) {
        new AlertDialogFragment.Builder(fragmentActivity).setNegativeButton(fragmentActivity.getString(R.string.cancel), new DialogInterface.OnClickListener() { // from class: ha1
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                DialogUtilsKt.d(dialogInterface, i);
            }
        }).setPositiveButton(fragmentActivity.getString(R.string.confirm), new DialogInterface.OnClickListener() { // from class: fa1
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                DialogUtilsKt.e(fragmentActivity, dialogInterface, i);
            }
        }).setMessage(fragmentActivity.getString(R.string.feedback_discard)).setCancelable(false).show(fragmentManager).setGravity(17);
    }

    public static final void showUpgradeDialog(@NotNull final FragmentActivity fragmentActivity, @NotNull String str, @NotNull final Function0<Unit> function0) {
        HMLog.info("feedback", new a(str));
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        new AlertDialogFragment.Builder(fragmentActivity).setMessage(String.format(fragmentActivity.getString(R.string.dialog_upgrade_content_new), Arrays.copyOf(new Object[]{str}, 1))).setNegativeButton(R.string.got_it, (DialogInterface.OnClickListener) null).setPositiveButton(R.string.dialog_btn_upgrade, new DialogInterface.OnClickListener() { // from class: ga1
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                DialogUtilsKt.f(function0, fragmentActivity, dialogInterface, i);
            }
        }).show(fragmentActivity.getSupportFragmentManager()).setGravity(17);
    }
}
