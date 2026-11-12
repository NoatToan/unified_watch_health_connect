package com.huami.wallet.accessdoor.fragment;

import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.huami.viewbindingx.BindViewBinder;
import com.huami.viewbindingx.LifeViewBindingProperty;
import com.huami.viewbindingx.fragment.FragmentViewBindingKt;
import com.huami.wallet.accessdoor.R;
import com.huami.wallet.accessdoor.activity.StartAccessLoadingActivity;
import com.huami.wallet.accessdoor.activity.StartAccessTipActivity;
import com.huami.wallet.accessdoor.databinding.FragmentSupportsEmulationCardBinding;
import com.huami.wallet.accessdoor.fragment.SupportsEmulationCardFragment;
import kotlin.Metadata;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u000f\u0010\u0010J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\u001a\u0010\b\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016R\u001d\u0010\u000e\u001a\u00020\t8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u0011"}, d2 = {"Lcom/huami/wallet/accessdoor/fragment/SupportsEmulationCardFragment;", "Landroidx/fragment/app/Fragment;", "", "initView", "Landroid/view/View;", ViewHierarchyConstants.VIEW_KEY, "Landroid/os/Bundle;", "savedInstanceState", "onViewCreated", "Lcom/huami/wallet/accessdoor/databinding/FragmentSupportsEmulationCardBinding;", "a", "Lcom/huami/viewbindingx/LifeViewBindingProperty;", "c", "()Lcom/huami/wallet/accessdoor/databinding/FragmentSupportsEmulationCardBinding;", "binding", "<init>", "()V", "access-door_release"}, k = 1, mv = {1, 5, 1})
public final class SupportsEmulationCardFragment extends Fragment {
    public static final /* synthetic */ KProperty<Object>[] b = {Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(SupportsEmulationCardFragment.class), "binding", "getBinding()Lcom/huami/wallet/accessdoor/databinding/FragmentSupportsEmulationCardBinding;"))};

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final LifeViewBindingProperty binding;

    public SupportsEmulationCardFragment() {
        super(R.layout.fragment_supports_emulation_card);
        this.binding = FragmentViewBindingKt.viewBinding(new SupportsEmulationCardFragment$special$$inlined$viewBindingByBind$1(new BindViewBinder(FragmentSupportsEmulationCardBinding.class)));
    }

    private final FragmentSupportsEmulationCardBinding c() {
        return (FragmentSupportsEmulationCardBinding) this.binding.getValue(this, b[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(SupportsEmulationCardFragment supportsEmulationCardFragment, View view) {
        StartAccessTipActivity.INSTANCE.open(supportsEmulationCardFragment.requireActivity());
        supportsEmulationCardFragment.requireActivity().finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(SupportsEmulationCardFragment supportsEmulationCardFragment, View view) {
        StartAccessLoadingActivity.Companion.open$default(StartAccessLoadingActivity.INSTANCE, supportsEmulationCardFragment.requireContext(), null, 2, null);
        supportsEmulationCardFragment.requireActivity().finish();
    }

    private final void initView() {
        c().tvRetry.setOnClickListener(new View.OnClickListener() { // from class: oi7
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SupportsEmulationCardFragment.d(this.a, view);
            }
        });
        c().tvJustSimulation.setOnClickListener(new View.OnClickListener() { // from class: ni7
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SupportsEmulationCardFragment.e(this.a, view);
            }
        });
    }

    public void _$_clearFindViewByIdCache() {
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        initView();
    }
}
