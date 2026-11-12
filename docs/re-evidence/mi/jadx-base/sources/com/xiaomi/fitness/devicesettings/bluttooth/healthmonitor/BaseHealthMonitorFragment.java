package com.xiaomi.fitness.devicesettings.bluttooth.healthmonitor;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import androidx.databinding.ViewDataBinding;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.Observer;
import com.xiaomi.fitness.baseui.dialog.CommonDialog;
import com.xiaomi.fitness.baseui.view.BaseSpringBackBindingFragment;
import com.xiaomi.fitness.common.extensions.ToastExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.devicesettings.bluttooth.healthmonitor.BaseHealthMonitorFragment;
import com.xiaomi.fitness.devicesettings.bluttooth.healthmonitor.BaseHealthMonitorViewModel;
import defpackage.av6;
import defpackage.bw1;
import defpackage.wzi;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\b&\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u0002*\b\b\u0001\u0010\u0003*\u00020\u00042\u000e\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u0002H\u00030\u0005B\u000f\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0016J\u0010\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u0007H\u0016JP\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\u0013\u001a\u00020\u00072\u0006\u0010\u0014\u001a\u00020\u00072\b\b\u0002\u0010\u0015\u001a\u00020\u00072\b\b\u0002\u0010\u0016\u001a\u00020\u00072\u0010\b\u0002\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u00182\u0010\b\u0002\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u0018H\u0004J\b\u0010\u001a\u001a\u00020\u000bH\u0004¨\u0006\u001b"}, d2 = {"Lcom/xiaomi/fitness/devicesettings/bluttooth/healthmonitor/BaseHealthMonitorFragment;", "VM", "Lcom/xiaomi/fitness/devicesettings/bluttooth/healthmonitor/BaseHealthMonitorViewModel;", "VDB", "Landroidx/databinding/ViewDataBinding;", "Lcom/xiaomi/fitness/baseui/view/BaseSpringBackBindingFragment;", "contentLayoutId", "", "<init>", "(I)V", "onViewCreated", "", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "onLoadStatusChanged", "status", "showAlertDialog", "titleRes", "msgRes", "positiveBtnRes", "negativeBtnRes", "positiveCallback", "Lkotlin/Function0;", "negativeCallback", "receivedErrorCode", "device-settings_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class BaseHealthMonitorFragment<VM extends BaseHealthMonitorViewModel, VDB extends ViewDataBinding> extends BaseSpringBackBindingFragment<VM, VDB> {
    public BaseHealthMonitorFragment(int i) {
        super(i, bw1.f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onViewCreated$lambda$0(BaseHealthMonitorFragment this$0, int i) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.onLoadStatusChanged(i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void showAlertDialog$default(BaseHealthMonitorFragment baseHealthMonitorFragment, int i, int i2, int i3, int i4, Function0 function0, Function0 function1, int i5, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: showAlertDialog");
        }
        if ((i5 & 4) != 0) {
            i3 = wzi.g;
        }
        int i6 = i3;
        if ((i5 & 8) != 0) {
            i4 = wzi.e;
        }
        baseHealthMonitorFragment.showAlertDialog(i, i2, i6, i4, (i5 & 16) != 0 ? null : function0, (i5 & 32) != 0 ? null : function1);
    }

    public void onLoadStatusChanged(int status) {
        String simpleName = getClass().getSimpleName();
        Intrinsics.checkNotNullExpressionValue(simpleName, "getSimpleName(...)");
        Logger.d(simpleName, "onLoadStatusChanged " + status);
        if (status == 1) {
            showLoading();
            return;
        }
        if (status == 2) {
            hideLoading();
            return;
        }
        if (status != 3) {
            return;
        }
        dismissDialogForce();
        FragmentActivity mActivity = getMActivity();
        if (mActivity != null) {
            ToastExtKt.toastShort(mActivity, wzi.common_hint_unkonwn_error);
        }
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseBindingFragment, com.xiaomi.fitness.baseui.view.BaseViewModelFragment, com.xiaomi.fitness.baseui.view.BaseFragment, miuix.appcompat.app.Fragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        getMViewModel().observerLoadStatus(this, new Observer() { // from class: v72
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                BaseHealthMonitorFragment.onViewCreated$lambda$0(this.f36579a, ((Integer) obj).intValue());
            }
        });
    }

    public final void receivedErrorCode() {
        hideLoading();
        FragmentActivity mActivity = getMActivity();
        if (mActivity != null) {
            ToastExtKt.toastShort(mActivity, wzi.common_hint_unkonwn_error);
        }
    }

    public final void showAlertDialog(int titleRes, int msgRes, int positiveBtnRes, int negativeBtnRes, @Nullable final Function0<Unit> positiveCallback, @Nullable final Function0<Unit> negativeCallback) {
        CommonDialog commonDialogCreate = new CommonDialog.c("alert").setDialogTitle(titleRes).setDialogDescription(msgRes).setPositiveText(positiveBtnRes).setNegativeText(negativeBtnRes).create();
        commonDialogCreate.addDialogCallback(new av6() { // from class: com.xiaomi.fitness.devicesettings.bluttooth.healthmonitor.BaseHealthMonitorFragment.showAlertDialog.1
            @Override // defpackage.av6
            public void onDialogClick(String dialogName, DialogInterface dialog, int which) {
                Function0<Unit> function0;
                super.onDialogClick(dialogName, dialog, which);
                if (which != -2) {
                    if (which == -1 && (function0 = positiveCallback) != null) {
                        function0.invoke();
                        return;
                    }
                    return;
                }
                Function0<Unit> function1 = negativeCallback;
                if (function1 != null) {
                    function1.invoke();
                }
            }
        });
        commonDialogCreate.showIfNeed(getParentFragmentManager());
    }
}
