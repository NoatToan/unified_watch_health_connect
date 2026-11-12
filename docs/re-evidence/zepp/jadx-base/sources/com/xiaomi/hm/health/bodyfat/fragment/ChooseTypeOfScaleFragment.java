package com.xiaomi.hm.health.bodyfat.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.p008lifecycle.ViewModelProvider;
import androidx.view.OnBackPressedCallback;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.xiaomi.hm.health.bodyfat.R;
import com.xiaomi.hm.health.bodyfat.databinding.FragmentChooseTypeOfScaleBinding;
import com.xiaomi.hm.health.bodyfat.fragment.ChooseTypeOfScaleFragment;
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
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b \u0010!J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\"\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0002H\u0016J$\u0010\u0013\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0016J\u001a\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0016R\u0016\u0010\u0019\u001a\u00020\u00168\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u001d\u0010\u001f\u001a\u00020\u001a8F@\u0006X\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e¨\u0006\""}, d2 = {"Lcom/xiaomi/hm/health/bodyfat/fragment/ChooseTypeOfScaleFragment;", "Landroidx/fragment/app/Fragment;", "", "type", "", GoogleApiAvailabilityLight.a, "transit", "", "enter", "nextAnim", "Landroid/view/animation/Animation;", "onCreateAnimation", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", ViewHierarchyConstants.VIEW_KEY, "onViewCreated", "Lcom/xiaomi/hm/health/bodyfat/databinding/FragmentChooseTypeOfScaleBinding;", "a", "Lcom/xiaomi/hm/health/bodyfat/databinding/FragmentChooseTypeOfScaleBinding;", "binding", "Lcom/xiaomi/hm/health/bodyfat/viewmodel/SettingOfScaleViewModel;", "b", "Lkotlin/Lazy;", "getViewModel", "()Lcom/xiaomi/hm/health/bodyfat/viewmodel/SettingOfScaleViewModel;", "viewModel", "<init>", "()V", "bodyfat_midongRelease"}, k = 1, mv = {1, 5, 1})
public final class ChooseTypeOfScaleFragment extends Fragment {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private FragmentChooseTypeOfScaleBinding binding;

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
        public final SettingOfScaleViewModel invoke() {
            return (SettingOfScaleViewModel) new ViewModelProvider(ChooseTypeOfScaleFragment.this.requireActivity()).get(SettingOfScaleViewModel.class);
        }
    }

    private final void d(int type) {
        FragmentManager supportFragmentManager;
        getViewModel().getMeasureMode().postValue(Integer.valueOf(type));
        FragmentActivity activity = getActivity();
        if (activity == null || (supportFragmentManager = activity.getSupportFragmentManager()) == null) {
            return;
        }
        supportFragmentManager.popBackStack();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(ChooseTypeOfScaleFragment chooseTypeOfScaleFragment, View view) {
        FragmentManager supportFragmentManager;
        FragmentActivity activity = chooseTypeOfScaleFragment.getActivity();
        if (activity == null || (supportFragmentManager = activity.getSupportFragmentManager()) == null) {
            return;
        }
        supportFragmentManager.popBackStack();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void f(ChooseTypeOfScaleFragment chooseTypeOfScaleFragment, View view) {
        chooseTypeOfScaleFragment.d(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void g(ChooseTypeOfScaleFragment chooseTypeOfScaleFragment, View view) {
        chooseTypeOfScaleFragment.d(1);
    }

    public void _$_clearFindViewByIdCache() {
    }

    @NotNull
    public final SettingOfScaleViewModel getViewModel() {
        return (SettingOfScaleViewModel) this.viewModel.getValue();
    }

    @Override // androidx.fragment.app.Fragment
    @Nullable
    public Animation onCreateAnimation(int transit, boolean enter, int nextAnim) {
        if (transit == 4097) {
            return enter ? AnimationUtils.loadAnimation(getActivity(), R.anim.anim_right_in) : AnimationUtils.loadAnimation(getActivity(), R.anim.anim_right_out);
        }
        if (transit != 8194) {
            return super.onCreateAnimation(transit, enter, nextAnim);
        }
        return enter ? AnimationUtils.loadAnimation(getActivity(), R.anim.anim_right_in) : AnimationUtils.loadAnimation(getActivity(), R.anim.anim_right_out);
    }

    @Override // androidx.fragment.app.Fragment
    @NotNull
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        FragmentChooseTypeOfScaleBinding fragmentChooseTypeOfScaleBindingInflate = FragmentChooseTypeOfScaleBinding.inflate(inflater);
        this.binding = fragmentChooseTypeOfScaleBindingInflate;
        Objects.requireNonNull(fragmentChooseTypeOfScaleBindingInflate);
        return fragmentChooseTypeOfScaleBindingInflate.getRoot();
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        FragmentChooseTypeOfScaleBinding fragmentChooseTypeOfScaleBinding = this.binding;
        Objects.requireNonNull(fragmentChooseTypeOfScaleBinding);
        fragmentChooseTypeOfScaleBinding.ibBack.setOnClickListener(new View.OnClickListener() { // from class: oo0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                ChooseTypeOfScaleFragment.e(this.a, view2);
            }
        });
        FragmentChooseTypeOfScaleBinding fragmentChooseTypeOfScaleBinding2 = this.binding;
        Objects.requireNonNull(fragmentChooseTypeOfScaleBinding2);
        fragmentChooseTypeOfScaleBinding2.btnNormalType.setOnClickListener(new View.OnClickListener() { // from class: no0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                ChooseTypeOfScaleFragment.f(this.a, view2);
            }
        });
        FragmentChooseTypeOfScaleBinding fragmentChooseTypeOfScaleBinding3 = this.binding;
        Objects.requireNonNull(fragmentChooseTypeOfScaleBinding3);
        fragmentChooseTypeOfScaleBinding3.btnSportType.setOnClickListener(new View.OnClickListener() { // from class: po0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                ChooseTypeOfScaleFragment.g(this.a, view2);
            }
        });
        requireActivity().getOnBackPressedDispatcher().addCallback(getViewLifecycleOwner(), new OnBackPressedCallback() { // from class: com.xiaomi.hm.health.bodyfat.fragment.ChooseTypeOfScaleFragment.onViewCreated.4
            {
                super(true);
            }

            @Override // androidx.view.OnBackPressedCallback
            public void handleOnBackPressed() {
                FragmentManager supportFragmentManager;
                FragmentActivity activity = ChooseTypeOfScaleFragment.this.getActivity();
                if (activity == null || (supportFragmentManager = activity.getSupportFragmentManager()) == null) {
                    return;
                }
                supportFragmentManager.popBackStack();
            }
        });
    }
}
