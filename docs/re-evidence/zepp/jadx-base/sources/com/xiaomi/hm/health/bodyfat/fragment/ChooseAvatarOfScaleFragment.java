package com.xiaomi.hm.health.bodyfat.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.p008lifecycle.Observer;
import androidx.p008lifecycle.ViewModelProviders;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.xiaomi.hm.health.bodyfat.R;
import com.xiaomi.hm.health.bodyfat.databinding.FragmentChooseAvatarOfScaleBinding;
import com.xiaomi.hm.health.bodyfat.fragment.ChooseAvatarOfScaleDialog;
import com.xiaomi.hm.health.bodyfat.fragment.ChooseAvatarOfScaleFragment;
import com.xiaomi.hm.health.bodyfat.viewmodel.SettingOfScaleViewModel;
import java.util.Objects;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0018\u0010\u0019J\b\u0010\u0003\u001a\u00020\u0002H\u0002J$\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016J\u001a\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016R\u0016\u0010\u0011\u001a\u00020\u000e8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0017\u001a\u00020\u00128F@\u0006X\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u001a"}, d2 = {"Lcom/xiaomi/hm/health/bodyfat/fragment/ChooseAvatarOfScaleFragment;", "Landroidx/fragment/app/Fragment;", "", "initView", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", ViewHierarchyConstants.VIEW_KEY, "onViewCreated", "Lcom/xiaomi/hm/health/bodyfat/databinding/FragmentChooseAvatarOfScaleBinding;", "a", "Lcom/xiaomi/hm/health/bodyfat/databinding/FragmentChooseAvatarOfScaleBinding;", "binding", "Lcom/xiaomi/hm/health/bodyfat/viewmodel/SettingOfScaleViewModel;", "b", "Lkotlin/Lazy;", "getViewModel", "()Lcom/xiaomi/hm/health/bodyfat/viewmodel/SettingOfScaleViewModel;", "viewModel", "<init>", "()V", "bodyfat_midongRelease"}, k = 1, mv = {1, 5, 1})
public final class ChooseAvatarOfScaleFragment extends Fragment {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private FragmentChooseAvatarOfScaleBinding binding;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final Lazy viewModel = LazyKt__LazyJVMKt.lazy(new a());

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/xiaomi/hm/health/bodyfat/viewmodel/SettingOfScaleViewModel;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<SettingOfScaleViewModel> {
        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final SettingOfScaleViewModel getA() {
            return (SettingOfScaleViewModel) ViewModelProviders.of(ChooseAvatarOfScaleFragment.this.requireActivity()).get(SettingOfScaleViewModel.class);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(ChooseAvatarOfScaleFragment chooseAvatarOfScaleFragment, View view) {
        FragmentActivity activity = chooseAvatarOfScaleFragment.getActivity();
        if (activity == null) {
            return;
        }
        activity.finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void f(ChooseAvatarOfScaleFragment chooseAvatarOfScaleFragment, View view) {
        ChooseAvatarOfScaleDialog chooseAvatarOfScaleDialog = new ChooseAvatarOfScaleDialog();
        FragmentActivity activity = chooseAvatarOfScaleFragment.getActivity();
        chooseAvatarOfScaleDialog.show(activity == null ? null : activity.getSupportFragmentManager());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void g(ChooseAvatarOfScaleFragment chooseAvatarOfScaleFragment, View view) {
        FragmentManager supportFragmentManager;
        FragmentActivity activity = chooseAvatarOfScaleFragment.getActivity();
        if (activity == null || (supportFragmentManager = activity.getSupportFragmentManager()) == null) {
            return;
        }
        supportFragmentManager.beginTransaction().setTransition(4097).addToBackStack(null).replace(R.id.fragment_container, new ChooseTypeOfScaleFragment()).commit();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void h(ChooseAvatarOfScaleFragment chooseAvatarOfScaleFragment, ChooseAvatarOfScaleDialog.AvatarInfo avatarInfo) {
        FragmentChooseAvatarOfScaleBinding fragmentChooseAvatarOfScaleBinding = chooseAvatarOfScaleFragment.binding;
        Objects.requireNonNull(fragmentChooseAvatarOfScaleBinding);
        fragmentChooseAvatarOfScaleBinding.ivChange.setImageResource(avatarInfo.getResId());
    }

    private final void initView() {
        FragmentChooseAvatarOfScaleBinding fragmentChooseAvatarOfScaleBinding = this.binding;
        Objects.requireNonNull(fragmentChooseAvatarOfScaleBinding);
        fragmentChooseAvatarOfScaleBinding.ibBack.setOnClickListener(new View.OnClickListener() { // from class: ho0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ChooseAvatarOfScaleFragment.e(this.a, view);
            }
        });
        getViewModel().getChooseAvatarId().setValue(getViewModel().getDefaultAvatar());
        FragmentChooseAvatarOfScaleBinding fragmentChooseAvatarOfScaleBinding2 = this.binding;
        Objects.requireNonNull(fragmentChooseAvatarOfScaleBinding2);
        fragmentChooseAvatarOfScaleBinding2.layoutAvatar.setOnClickListener(new View.OnClickListener() { // from class: go0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ChooseAvatarOfScaleFragment.f(this.a, view);
            }
        });
        FragmentChooseAvatarOfScaleBinding fragmentChooseAvatarOfScaleBinding3 = this.binding;
        Objects.requireNonNull(fragmentChooseAvatarOfScaleBinding3);
        fragmentChooseAvatarOfScaleBinding3.btnNextStep.setOnClickListener(new View.OnClickListener() { // from class: fo0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ChooseAvatarOfScaleFragment.g(this.a, view);
            }
        });
        getViewModel().getChooseAvatarId().observe(getViewLifecycleOwner(), new Observer() { // from class: io0
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                ChooseAvatarOfScaleFragment.h(this.a, (ChooseAvatarOfScaleDialog.AvatarInfo) obj);
            }
        });
    }

    public void _$_clearFindViewByIdCache() {
    }

    @NotNull
    public final SettingOfScaleViewModel getViewModel() {
        return (SettingOfScaleViewModel) this.viewModel.getValue();
    }

    @Override // androidx.fragment.app.Fragment
    @NotNull
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        FragmentChooseAvatarOfScaleBinding fragmentChooseAvatarOfScaleBindingInflate = FragmentChooseAvatarOfScaleBinding.inflate(inflater);
        this.binding = fragmentChooseAvatarOfScaleBindingInflate;
        Objects.requireNonNull(fragmentChooseAvatarOfScaleBindingInflate);
        return fragmentChooseAvatarOfScaleBindingInflate.getRoot();
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        initView();
    }
}
