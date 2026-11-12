package com.xiaomi.fitness.devicesettings.base;

import android.os.Bundle;
import android.view.View;
import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.Observer;
import com.xiaomi.fitness.baseui.dialog.CircleProgressDialog;
import com.xiaomi.fitness.baseui.view.BaseBindingFragment;
import com.xiaomi.fitness.baseui.view.PageState;
import com.xiaomi.fitness.common.extensions.AnyExtKt;
import com.xiaomi.fitness.common.utils.ToastUtil;
import com.xiaomi.fitness.devicesettings.base.BaseLoadableBindingFragment;
import com.xiaomi.fitness.devicesettings.base.BaseLoadableBindingViewModel;
import defpackage.bw1;
import defpackage.wzi;
import java.lang.ref.WeakReference;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b&\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u0002*\b\b\u0001\u0010\u0003*\u00020\u00042\u000e\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u0002H\u00030\u0005B\u001f\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fB\t\b\u0016¢\u0006\u0004\b\u000b\u0010\rB\u0011\b\u0016\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\u000b\u0010\u000eB\u0019\b\u0016\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u000b\u0010\u000fJ\u001a\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0016J\u0010\u0010\u0016\u001a\u00020\u00112\u0006\u0010\u0017\u001a\u00020\u0007H\u0016J\u0012\u0010\u0018\u001a\u00020\u00112\b\b\u0001\u0010\u0019\u001a\u00020\u0007H\u0004J\b\u0010\u001a\u001a\u00020\u0011H\u0002¨\u0006\u001b"}, d2 = {"Lcom/xiaomi/fitness/devicesettings/base/BaseLoadableBindingFragment;", "VM", "Lcom/xiaomi/fitness/devicesettings/base/BaseLoadableBindingViewModel;", "VDB", "Landroidx/databinding/ViewDataBinding;", "Lcom/xiaomi/fitness/baseui/view/BaseBindingFragment;", "contentLayoutId", "", "viewModelId", "sharedViewModel", "", "<init>", "(IIZ)V", "()V", "(I)V", "(II)V", "onViewCreated", "", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "onLoadStatusChanged", "status", "dismissLoadingWithToast", "toastRes", "dismissAnyway", "device-settings_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class BaseLoadableBindingFragment<VM extends BaseLoadableBindingViewModel, VDB extends ViewDataBinding> extends BaseBindingFragment<VM, VDB> {
    public BaseLoadableBindingFragment(int i, int i2, boolean z) {
        super(i, i2, z);
    }

    private final void dismissAnyway() {
        hideLoading();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onViewCreated$lambda$0(BaseLoadableBindingFragment this$0, int i) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        AnyExtKt.main$default(null, new BaseLoadableBindingFragment$onViewCreated$1$1(this$0, i, null), 1, null);
    }

    public final void dismissLoadingWithToast(int toastRes) {
        dismissAnyway();
        ToastUtil.showShortToast(toastRes);
    }

    public void onLoadStatusChanged(int status) {
        CircleProgressDialog circleProgressDialog;
        if (status == 1) {
            PageState.DefaultImpls.showLoading$default(this, getMViewModel().getLoadingMsg(), 0, true, 2, null);
            return;
        }
        if (status == 2) {
            WeakReference<CircleProgressDialog> mLoadingDialog = getMLoadingDialog();
            if (mLoadingDialog == null || (circleProgressDialog = mLoadingDialog.get()) == null) {
                return;
            }
            circleProgressDialog.finish();
            return;
        }
        if (status == 3) {
            dismissLoadingWithToast(wzi.common_hint_unkonwn_error);
        } else {
            if (status != 5) {
                return;
            }
            dismissLoadingWithToast(wzi.common_set_error);
        }
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseBindingFragment, com.xiaomi.fitness.baseui.view.BaseViewModelFragment, com.xiaomi.fitness.baseui.view.BaseFragment, miuix.appcompat.app.Fragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        getMViewModel().observerLoadStatus(this, new Observer() { // from class: u82
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                BaseLoadableBindingFragment.onViewCreated$lambda$0(this.f35510a, ((Integer) obj).intValue());
            }
        });
    }

    public BaseLoadableBindingFragment() {
        this(-1);
    }

    public BaseLoadableBindingFragment(int i) {
        this(i, bw1.f);
    }

    public BaseLoadableBindingFragment(int i, int i2) {
        this(i, i2, false);
    }
}
