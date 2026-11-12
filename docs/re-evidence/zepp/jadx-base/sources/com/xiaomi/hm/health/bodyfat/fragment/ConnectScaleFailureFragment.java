package com.xiaomi.hm.health.bodyfat.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.p008lifecycle.ViewModelProvider;
import androidx.p008lifecycle.ViewModelStore;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.xiaomi.hm.health.bodyfat.databinding.FragmentConnectScaleTimeoutBinding;
import com.xiaomi.hm.health.bodyfat.fragment.ConnectScaleFailureFragment;
import com.xiaomi.hm.health.bodyfat.viewmodel.ConnectScaleViewModel;
import java.util.Objects;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Reflection;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0017\u0010\u0018J$\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016J\u001a\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016R\u0016\u0010\u0010\u001a\u00020\r8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u001d\u0010\u0016\u001a\u00020\u00118F@\u0006X\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0019"}, d2 = {"Lcom/xiaomi/hm/health/bodyfat/fragment/ConnectScaleFailureFragment;", "Landroidx/fragment/app/Fragment;", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", ViewHierarchyConstants.VIEW_KEY, "", "onViewCreated", "Lcom/xiaomi/hm/health/bodyfat/databinding/FragmentConnectScaleTimeoutBinding;", "a", "Lcom/xiaomi/hm/health/bodyfat/databinding/FragmentConnectScaleTimeoutBinding;", "binding", "Lcom/xiaomi/hm/health/bodyfat/viewmodel/ConnectScaleViewModel;", "b", "Lkotlin/Lazy;", "getViewModel", "()Lcom/xiaomi/hm/health/bodyfat/viewmodel/ConnectScaleViewModel;", "viewModel", "<init>", "()V", "bodyfat_midongRelease"}, k = 1, mv = {1, 5, 1})
public final class ConnectScaleFailureFragment extends Fragment {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private FragmentConnectScaleTimeoutBinding binding;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final Lazy viewModel = FragmentViewModelLazyKt.createViewModelLazy(this, Reflection.getOrCreateKotlinClass(ConnectScaleViewModel.class), new Function0<ViewModelStore>() { // from class: com.xiaomi.hm.health.bodyfat.fragment.ConnectScaleFailureFragment$special$$inlined$activityViewModels$default$1
        {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final ViewModelStore invoke() {
            return this.requireActivity().getViewModelStore();
        }
    }, new Function0<ViewModelProvider.Factory>() { // from class: com.xiaomi.hm.health.bodyfat.fragment.ConnectScaleFailureFragment$special$$inlined$activityViewModels$default$2
        {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final ViewModelProvider.Factory invoke() {
            return this.requireActivity().getDefaultViewModelProviderFactory();
        }
    });

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(ConnectScaleFailureFragment connectScaleFailureFragment, View view) {
        connectScaleFailureFragment.getViewModel().getConnectPage().setValue(Boolean.TRUE);
    }

    public void _$_clearFindViewByIdCache() {
    }

    @NotNull
    public final ConnectScaleViewModel getViewModel() {
        return (ConnectScaleViewModel) this.viewModel.getValue();
    }

    @Override // androidx.fragment.app.Fragment
    @NotNull
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        FragmentConnectScaleTimeoutBinding fragmentConnectScaleTimeoutBindingInflate = FragmentConnectScaleTimeoutBinding.inflate(inflater);
        this.binding = fragmentConnectScaleTimeoutBindingInflate;
        Objects.requireNonNull(fragmentConnectScaleTimeoutBindingInflate);
        return fragmentConnectScaleTimeoutBindingInflate.getRoot();
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        FragmentConnectScaleTimeoutBinding fragmentConnectScaleTimeoutBinding = this.binding;
        Objects.requireNonNull(fragmentConnectScaleTimeoutBinding);
        fragmentConnectScaleTimeoutBinding.btnReconnect.setOnClickListener(new View.OnClickListener() { // from class: gz0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                ConnectScaleFailureFragment.b(this.a, view2);
            }
        });
    }
}
