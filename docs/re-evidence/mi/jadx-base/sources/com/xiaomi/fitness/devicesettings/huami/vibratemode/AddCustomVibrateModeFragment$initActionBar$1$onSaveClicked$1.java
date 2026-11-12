package com.xiaomi.fitness.devicesettings.huami.vibratemode;

import android.content.DialogInterface;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import androidx.fragment.app.FragmentActivity;
import com.xiaomi.fitness.baseui.dialog.CommonDialog;
import com.xiaomi.fitness.common.extensions.AnyExtKt;
import com.xiaomi.fitness.common.extensions.ToastExtKt;
import com.xiaomi.fitness.common.viewbinding.ViewBindingUtilKt;
import com.xiaomi.fitness.devicesettings.huami.vibratemode.AddCustomVibrateModeFragment$initActionBar$1$onSaveClicked$1;
import defpackage.av6;
import defpackage.b1e;
import defpackage.cn6;
import defpackage.wzi;
import defpackage.zqi;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J+\u0010\t\u001a\u00020\b2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"com/xiaomi/fitness/devicesettings/huami/vibratemode/AddCustomVibrateModeFragment$initActionBar$1$onSaveClicked$1", "Lav6;", "", "dialogName", "Landroid/content/DialogInterface;", "dialog", "", "which", "", "onDialogClick", "(Ljava/lang/String;Landroid/content/DialogInterface;I)V", "device-settings_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class AddCustomVibrateModeFragment$initActionBar$1$onSaveClicked$1 extends av6 {
    final /* synthetic */ cn6 $binding;
    final /* synthetic */ CommonDialog $mDialog;
    final /* synthetic */ AddCustomVibrateModeFragment this$0;

    public AddCustomVibrateModeFragment$initActionBar$1$onSaveClicked$1(CommonDialog commonDialog, AddCustomVibrateModeFragment addCustomVibrateModeFragment, cn6 cn6Var) {
        this.$mDialog = commonDialog;
        this.this$0 = addCustomVibrateModeFragment;
        this.$binding = cn6Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onDialogClick$lambda$0(AddCustomVibrateModeFragment this$0, String name, DialogInterface dialogInterface, Boolean bool) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(name, "$name");
        AnyExtKt.main$default(null, new AddCustomVibrateModeFragment$initActionBar$1$onSaveClicked$1$onDialogClick$1$1(bool, this$0, name, dialogInterface, null), 1, null);
        return Unit.INSTANCE;
    }

    @Override // defpackage.av6
    public void onDialogClick(String dialogName, final DialogInterface dialog, int which) {
        super.onDialogClick(dialogName, dialog, which);
        if (which != -2) {
            if (which == -1) {
                CommonDialog commonDialog = this.$mDialog;
                Intrinsics.checkNotNull(commonDialog);
                View rootView = ViewBindingUtilKt.getRootView(commonDialog, zqi.C5);
                Intrinsics.checkNotNull(rootView, "null cannot be cast to non-null type android.widget.EditText");
                final String string = ((EditText) rootView).getText().toString();
                if (TextUtils.isEmpty(string)) {
                    FragmentActivity mActivity = this.this$0.getMActivity();
                    if (mActivity != null) {
                        ToastExtKt.toastShort(mActivity, wzi.D);
                        return;
                    }
                    return;
                }
                VibrateModeAddViewModel vibrateModeAddViewModelAccess$getMViewModel = AddCustomVibrateModeFragment.access$getMViewModel(this.this$0);
                final AddCustomVibrateModeFragment addCustomVibrateModeFragment = this.this$0;
                vibrateModeAddViewModelAccess$getMViewModel.isNameHas(string, new Function1() { // from class: dq0
                    @Override // kotlin.jvm.functions.Function1
                    /* JADX INFO: renamed from: invoke */
                    public final Object invoke2(Object obj) {
                        return AddCustomVibrateModeFragment$initActionBar$1$onSaveClicked$1.onDialogClick$lambda$0(addCustomVibrateModeFragment, string, dialog, (Boolean) obj);
                    }
                });
            }
        } else if (dialog != null) {
            dialog.dismiss();
        }
        b1e.b(this.$binding.A);
    }
}
