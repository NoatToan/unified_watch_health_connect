package com.huami.sky.ui.realtime.recommendelement;

import android.content.ComponentCallbacks;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.p008lifecycle.Observer;
import androidx.p008lifecycle.ViewModelStoreOwner;
import androidx.p012savedstate.SavedStateRegistryOwner;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.module.ktx.I18nKt;
import com.huami.module.ktx.TimeExtKt;
import com.huami.sky.ui.R;
import com.huami.sky.ui.databinding.FragmentRecommendElementBinding;
import com.huami.sky.ui.ext.SkyExtKt;
import com.huami.sky.ui.realtime.recommendelement.RecommendElementFragment;
import com.huami.sky.ui.realtime.recommendelement.RecommendElementStyle;
import com.huami.viewbindingx.BindViewBinder;
import com.huami.viewbindingx.LifeViewBindingProperty;
import com.huami.viewbindingx.fragment.FragmentViewBindingKt;
import java.util.Locale;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.koin.androidx.viewmodel.ViewModelOwner;
import org.koin.androidx.viewmodel.ext.android.ComponentCallbackExtKt;
import org.koin.core.qualifier.Qualifier;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0016\u0010\u0017J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0004\u001a\u00020\u0002H\u0002J\u001a\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016R\u001d\u0010\u000f\u001a\u00020\n8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001d\u0010\u0015\u001a\u00020\u00108B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0018"}, d2 = {"Lcom/huami/sky/ui/realtime/recommendelement/RecommendElementFragment;", "Landroidx/fragment/app/Fragment;", "", "h", GoogleApiAvailabilityLight.b, "Landroid/view/View;", ViewHierarchyConstants.VIEW_KEY, "Landroid/os/Bundle;", "savedInstanceState", "onViewCreated", "Lcom/huami/sky/ui/databinding/FragmentRecommendElementBinding;", "a", "Lcom/huami/viewbindingx/LifeViewBindingProperty;", "f", "()Lcom/huami/sky/ui/databinding/FragmentRecommendElementBinding;", "binding", "Lcom/huami/sky/ui/realtime/recommendelement/RecommendElementViewModel;", "b", "Lkotlin/Lazy;", "g", "()Lcom/huami/sky/ui/realtime/recommendelement/RecommendElementViewModel;", "recommendViewModel", "<init>", "()V", "sky-ui_release"}, k = 1, mv = {1, 5, 1})
public final class RecommendElementFragment extends Fragment {
    public static final /* synthetic */ KProperty<Object>[] c;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final LifeViewBindingProperty binding;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final Lazy recommendViewModel;

    static {
        KProperty<Object>[] kPropertyArr = new KProperty[2];
        kPropertyArr[0] = Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(RecommendElementFragment.class), "binding", "getBinding()Lcom/huami/sky/ui/databinding/FragmentRecommendElementBinding;"));
        c = kPropertyArr;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public RecommendElementFragment() {
        super(R.layout.fragment_recommend_element);
        this.binding = FragmentViewBindingKt.viewBinding(new RecommendElementFragment$special$$inlined$viewBindingByBind$1(new BindViewBinder(FragmentRecommendElementBinding.class)));
        final Function0<ViewModelOwner> function0 = new Function0<ViewModelOwner>() { // from class: com.huami.sky.ui.realtime.recommendelement.RecommendElementFragment$special$$inlined$viewModel$default$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            @NotNull
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final ViewModelOwner getA() {
                ViewModelOwner.Companion companion = ViewModelOwner.INSTANCE;
                ComponentCallbacks componentCallbacks = this;
                return companion.from((ViewModelStoreOwner) componentCallbacks, componentCallbacks instanceof SavedStateRegistryOwner ? (SavedStateRegistryOwner) componentCallbacks : null);
            }
        };
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        final Qualifier qualifier = null;
        final Object[] objArr = 0 == true ? 1 : 0;
        this.recommendViewModel = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyMode, (Function0) new Function0<RecommendElementViewModel>() { // from class: com.huami.sky.ui.realtime.recommendelement.RecommendElementFragment$special$$inlined$viewModel$default$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            /* JADX WARN: Type inference failed for: r0v1, types: [androidx.lifecycle.ViewModel, com.huami.sky.ui.realtime.recommendelement.RecommendElementViewModel] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            /* JADX INFO: renamed from: invoke */
            public final RecommendElementViewModel getA() {
                return ComponentCallbackExtKt.getViewModel(this, qualifier, Reflection.getOrCreateKotlinClass(RecommendElementViewModel.class), function0, objArr);
            }
        });
    }

    private final FragmentRecommendElementBinding f() {
        return (FragmentRecommendElementBinding) this.binding.getValue(this, c[0]);
    }

    private final RecommendElementViewModel g() {
        return (RecommendElementViewModel) this.recommendViewModel.getValue();
    }

    private final void h() {
        g().getStyleLiveData().observe(getViewLifecycleOwner(), new Observer() { // from class: e96
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                RecommendElementFragment.i(this.a, (RecommendElementStyle) obj);
            }
        });
        g().getRestHrLiveData().observe(getViewLifecycleOwner(), new Observer() { // from class: f96
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                RecommendElementFragment.j(this.a, (Integer) obj);
            }
        });
        g().getStepLiveData().observe(getViewLifecycleOwner(), new Observer() { // from class: g96
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                RecommendElementFragment.k(this.a, (Integer) obj);
            }
        });
        g().getWakeUpLiveData().observe(getViewLifecycleOwner(), new Observer() { // from class: i96
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                RecommendElementFragment.l(this.a, (Long) obj);
            }
        });
        g().getSleepLiveData().observe(getViewLifecycleOwner(), new Observer() { // from class: h96
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                RecommendElementFragment.m(this.a, (Long) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void i(RecommendElementFragment recommendElementFragment, RecommendElementStyle recommendElementStyle) {
        if (!(recommendElementStyle instanceof ValueRecommendElementStyle)) {
            boolean z = recommendElementStyle instanceof TitleRecommendElementStyle;
            return;
        }
        recommendElementFragment.f().tvSleepElementValue.setVisibility(0);
        recommendElementFragment.f().tvStepElementValue.setVisibility(0);
        recommendElementFragment.f().tvWakeupElementValue.setVisibility(0);
        recommendElementFragment.f().tvResthrElementValue.setVisibility(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void j(RecommendElementFragment recommendElementFragment, Integer num) {
        recommendElementFragment.f().tvResthrElementValue.setText(I18nKt.i18n(num.intValue()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void k(RecommendElementFragment recommendElementFragment, Integer num) {
        recommendElementFragment.f().tvStepElementValue.setText(I18nKt.i18n(num.intValue()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void l(RecommendElementFragment recommendElementFragment, Long l) {
        recommendElementFragment.f().tvWakeupElementValue.setText(TimeExtKt.toTimeString$default(l.longValue(), "HH:mm", (Locale) null, 2, (Object) null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void m(RecommendElementFragment recommendElementFragment, Long l) {
        recommendElementFragment.f().tvSleepElementValue.setText(TimeExtKt.toTimeString$default(l.longValue(), "HH:mm", (Locale) null, 2, (Object) null));
    }

    private final void n() {
        SkyExtKt.setStyle(f().tvResthrElementTitle, R.style.Rainbow_TextAppearance_Body5);
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        n();
        h();
    }
}
