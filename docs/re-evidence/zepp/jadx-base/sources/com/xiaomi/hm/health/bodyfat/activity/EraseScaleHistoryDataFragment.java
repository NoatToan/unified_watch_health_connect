package com.xiaomi.hm.health.bodyfat.activity;

import android.content.ComponentCallbacks;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.p008lifecycle.Observer;
import androidx.p008lifecycle.ViewModelStoreOwner;
import androidx.p012savedstate.SavedStateRegistryOwner;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.android.design.dialog.AlertDialogFragment;
import com.huami.android.design.dialog.loading.LoadingDialog;
import com.huami.widget.toast.IconToast;
import com.twitter.sdk.android.tweetcomposer.g;
import com.xiaomi.hm.health.bodyfat.R;
import com.xiaomi.hm.health.bodyfat.activity.EraseScaleHistoryDataFragment;
import com.xiaomi.hm.health.bodyfat.databinding.FragmentEraseScaleHistoryDataBinding;
import java.util.Objects;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Reflection;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.koin.androidx.viewmodel.ViewModelOwner;
import org.koin.androidx.viewmodel.ext.android.ComponentCallbackExtKt;
import org.koin.core.qualifier.Qualifier;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\"\u0010#J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\b\u0010\u0007\u001a\u00020\u0002H\u0002J\b\u0010\b\u001a\u00020\u0002H\u0002J$\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\n\u001a\u00020\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0016J\u001a\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0016J\b\u0010\u0013\u001a\u00020\u0002H\u0016R\u0016\u0010\u0017\u001a\u00020\u00148\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0018\u0010\u001b\u001a\u0004\u0018\u00010\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u001d\u0010!\u001a\u00020\u001c8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 ¨\u0006$"}, d2 = {"Lcom/xiaomi/hm/health/bodyfat/activity/EraseScaleHistoryDataFragment;", "Landroidx/fragment/app/Fragment;", "", "h", "", "result", GoogleApiAvailabilityLight.b, "showLoadingDialog", "l", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", ViewHierarchyConstants.VIEW_KEY, "onViewCreated", "onResume", "Lcom/xiaomi/hm/health/bodyfat/databinding/FragmentEraseScaleHistoryDataBinding;", "a", "Lcom/xiaomi/hm/health/bodyfat/databinding/FragmentEraseScaleHistoryDataBinding;", "binding", "Lcom/huami/android/design/dialog/loading/LoadingDialog;", "b", "Lcom/huami/android/design/dialog/loading/LoadingDialog;", "loadingDialog", "Lcom/xiaomi/hm/health/bodyfat/activity/EraseScaleDataViewModel;", "c", "Lkotlin/Lazy;", "m", "()Lcom/xiaomi/hm/health/bodyfat/activity/EraseScaleDataViewModel;", "viewModel", "<init>", "()V", "bodyfat_midongRelease"}, k = 1, mv = {1, 5, 1})
public final class EraseScaleHistoryDataFragment extends Fragment {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private FragmentEraseScaleHistoryDataBinding binding;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    private LoadingDialog loadingDialog;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final Lazy viewModel;

    /* JADX WARN: Multi-variable type inference failed */
    public EraseScaleHistoryDataFragment() {
        final Function0<ViewModelOwner> function0 = new Function0<ViewModelOwner>() { // from class: com.xiaomi.hm.health.bodyfat.activity.EraseScaleHistoryDataFragment$special$$inlined$viewModel$default$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final ViewModelOwner invoke() {
                ViewModelOwner.Companion companion = ViewModelOwner.INSTANCE;
                ComponentCallbacks componentCallbacks = this;
                return companion.from((ViewModelStoreOwner) componentCallbacks, componentCallbacks instanceof SavedStateRegistryOwner ? (SavedStateRegistryOwner) componentCallbacks : null);
            }
        };
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        final Qualifier qualifier = null;
        final Object[] objArr = 0 == true ? 1 : 0;
        this.viewModel = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyMode, (Function0) new Function0<EraseScaleDataViewModel>() { // from class: com.xiaomi.hm.health.bodyfat.activity.EraseScaleHistoryDataFragment$special$$inlined$viewModel$default$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            /* JADX WARN: Type inference failed for: r0v1, types: [androidx.lifecycle.ViewModel, com.xiaomi.hm.health.bodyfat.activity.EraseScaleDataViewModel] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final EraseScaleDataViewModel invoke() {
                return ComponentCallbackExtKt.getViewModel(this, qualifier, Reflection.getOrCreateKotlinClass(EraseScaleDataViewModel.class), function0, objArr);
            }
        });
    }

    private final synchronized void h() {
        AlertDialogFragment alertDialogFragmentCreate = new AlertDialogFragment.Builder(getContext()).setNegativeButton(getString(R.string.cancel), new DialogInterface.OnClickListener() { // from class: so1
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                EraseScaleHistoryDataFragment.i(dialogInterface, i);
            }
        }).setPositiveButton(getString(R.string.confirm), new DialogInterface.OnClickListener() { // from class: ro1
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                EraseScaleHistoryDataFragment.j(this.a, dialogInterface, i);
            }
        }).setMessage(R.string.sure_to_erase_scale_history_record).setCancelable(false).setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: to1
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                EraseScaleHistoryDataFragment.k(dialogInterface);
            }
        }).create();
        FragmentActivity activity = getActivity();
        alertDialogFragmentCreate.show(activity == null ? null : activity.getSupportFragmentManager());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void i(DialogInterface dialogInterface, int i) {
        System.out.println((Object) g.g);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void j(EraseScaleHistoryDataFragment eraseScaleHistoryDataFragment, DialogInterface dialogInterface, int i) {
        eraseScaleHistoryDataFragment.m().getConfirmLiveData().postValue(Boolean.TRUE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void k(DialogInterface dialogInterface) {
    }

    private final void l() {
        LoadingDialog loadingDialog = this.loadingDialog;
        if (loadingDialog == null) {
            return;
        }
        loadingDialog.dismiss();
    }

    private final EraseScaleDataViewModel m() {
        return (EraseScaleDataViewModel) this.viewModel.getValue();
    }

    private final void n(boolean result) {
        if (result) {
            IconToast.showSuccess(getContext(), R.string.erase_scale_history_data_success);
            FragmentActivity activity = getActivity();
            if (activity != null) {
                activity.setResult(-1);
            }
            FragmentActivity activity2 = getActivity();
            if (activity2 != null) {
                activity2.finish();
            }
        } else {
            IconToast.showError(getContext(), R.string.erase_scale_history_data_failure);
        }
        l();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void o(EraseScaleHistoryDataFragment eraseScaleHistoryDataFragment, Boolean bool) {
        if (bool.booleanValue()) {
            eraseScaleHistoryDataFragment.showLoadingDialog();
            eraseScaleHistoryDataFragment.m().eraseHistoryData();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void p(EraseScaleHistoryDataFragment eraseScaleHistoryDataFragment, Boolean bool) {
        eraseScaleHistoryDataFragment.n(bool.booleanValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void q(EraseScaleHistoryDataFragment eraseScaleHistoryDataFragment, View view) {
        FragmentActivity activity = eraseScaleHistoryDataFragment.getActivity();
        if (activity == null) {
            return;
        }
        activity.finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void r(EraseScaleHistoryDataFragment eraseScaleHistoryDataFragment, View view) {
        eraseScaleHistoryDataFragment.h();
    }

    private final void showLoadingDialog() {
        if (this.loadingDialog == null) {
            this.loadingDialog = LoadingDialog.showDialog(getContext());
        }
        LoadingDialog loadingDialog = this.loadingDialog;
        if (loadingDialog != null) {
            loadingDialog.setCancelable(false);
        }
        LoadingDialog loadingDialog2 = this.loadingDialog;
        if (loadingDialog2 == null) {
            return;
        }
        loadingDialog2.show();
    }

    public void _$_clearFindViewByIdCache() {
    }

    @Override // androidx.fragment.app.Fragment
    @NotNull
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        FragmentEraseScaleHistoryDataBinding fragmentEraseScaleHistoryDataBindingInflate = FragmentEraseScaleHistoryDataBinding.inflate(inflater);
        this.binding = fragmentEraseScaleHistoryDataBindingInflate;
        Objects.requireNonNull(fragmentEraseScaleHistoryDataBindingInflate);
        return fragmentEraseScaleHistoryDataBindingInflate.getRoot();
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        m().getConfirmLiveData().observe(this, new Observer() { // from class: xo1
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                EraseScaleHistoryDataFragment.o(this.a, (Boolean) obj);
            }
        });
        m().getEraseResultLiveData().observe(this, new Observer() { // from class: wo1
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                EraseScaleHistoryDataFragment.p(this.a, (Boolean) obj);
            }
        });
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        FragmentEraseScaleHistoryDataBinding fragmentEraseScaleHistoryDataBinding = this.binding;
        Objects.requireNonNull(fragmentEraseScaleHistoryDataBinding);
        fragmentEraseScaleHistoryDataBinding.leftBtn.setOnClickListener(new View.OnClickListener() { // from class: vo1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                EraseScaleHistoryDataFragment.q(this.a, view2);
            }
        });
        FragmentEraseScaleHistoryDataBinding fragmentEraseScaleHistoryDataBinding2 = this.binding;
        Objects.requireNonNull(fragmentEraseScaleHistoryDataBinding2);
        fragmentEraseScaleHistoryDataBinding2.rightBtn.setOnClickListener(new View.OnClickListener() { // from class: uo1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                EraseScaleHistoryDataFragment.r(this.a, view2);
            }
        });
    }
}
