package com.huami.wallet.accessdoor.fragment;

import android.content.ComponentCallbacks;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.TranslateAnimation;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.p008lifecycle.ViewModelStoreOwner;
import androidx.p012savedstate.SavedStateRegistryOwner;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.viewbindingx.BindViewBinder;
import com.huami.viewbindingx.LifeViewBindingProperty;
import com.huami.viewbindingx.fragment.FragmentViewBindingKt;
import com.huami.wallet.accessdoor.R;
import com.huami.wallet.accessdoor.activity.StartAccessTipActivity;
import com.huami.wallet.accessdoor.api.FunctionsConfig;
import com.huami.wallet.accessdoor.databinding.FragmentStartDetectionBinding;
import com.huami.wallet.accessdoor.di.koin.DoorKoinModuleKt;
import com.huami.wallet.accessdoor.helper.LiveDataExtensionKt;
import com.huami.wallet.accessdoor.helper.Resource;
import com.huami.wallet.accessdoor.utils.WebUrlHelper;
import com.huami.wallet.accessdoor.viewmodel.StartDetectionViewModel;
import com.huami.wallet.common.helper.ViewExtensionKt;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.koin.androidx.viewmodel.ViewModelOwner;
import org.koin.androidx.viewmodel.ext.android.ComponentCallbackExtKt;
import org.koin.core.Koin;
import org.koin.core.component.KoinComponent;
import org.koin.core.qualifier.Qualifier;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0007¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\b\u0010\b\u001a\u00020\u0006H\u0002J\b\u0010\t\u001a\u00020\u0006H\u0002J\b\u0010\n\u001a\u00020\u0006H\u0002J\u001a\u0010\r\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0016J\u0010\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016R\u001d\u0010\u0014\u001a\u00020\u000f8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001d\u0010\u0019\u001a\u00020\u00158B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0012\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u001c"}, d2 = {"Lcom/huami/wallet/accessdoor/fragment/StartDetectionFragment;", "Landroidx/fragment/app/Fragment;", "Landroid/view/View$OnClickListener;", "Lorg/koin/core/component/KoinComponent;", "Landroid/view/View;", ViewHierarchyConstants.VIEW_KEY, "", "initView", "initViewModel", "e", GoogleApiAvailabilityLight.a, "Landroid/os/Bundle;", "savedInstanceState", "onViewCreated", "onClick", "Lcom/huami/wallet/accessdoor/databinding/FragmentStartDetectionBinding;", "a", "Lcom/huami/viewbindingx/LifeViewBindingProperty;", "b", "()Lcom/huami/wallet/accessdoor/databinding/FragmentStartDetectionBinding;", "binding", "Lcom/huami/wallet/accessdoor/viewmodel/StartDetectionViewModel;", "Lkotlin/Lazy;", "c", "()Lcom/huami/wallet/accessdoor/viewmodel/StartDetectionViewModel;", "startDetectViewModel", "<init>", "()V", "access-door_release"}, k = 1, mv = {1, 5, 1})
public final class StartDetectionFragment extends Fragment implements View.OnClickListener, KoinComponent {
    public static final /* synthetic */ KProperty<Object>[] c;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final LifeViewBindingProperty binding;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final Lazy startDetectViewModel;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n"}, d2 = {"Lcom/huami/wallet/accessdoor/helper/Resource;", "", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function1<Resource<String>, Unit> {
        public a() {
            super(1);
        }

        public final void a(@NotNull Resource<String> resource) {
            ViewExtensionKt.loadImage$default(StartDetectionFragment.this.b().ivBand, resource.data, 0, 2, null);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Resource<String> resource) {
            a(resource);
            return Unit.INSTANCE;
        }
    }

    static {
        KProperty<Object>[] kPropertyArr = new KProperty[2];
        kPropertyArr[0] = Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(StartDetectionFragment.class), "binding", "getBinding()Lcom/huami/wallet/accessdoor/databinding/FragmentStartDetectionBinding;"));
        c = kPropertyArr;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public StartDetectionFragment() {
        super(R.layout.fragment_start_detection);
        this.binding = FragmentViewBindingKt.viewBinding(new StartDetectionFragment$special$$inlined$viewBindingByBind$1(new BindViewBinder(FragmentStartDetectionBinding.class)));
        final Function0<ViewModelOwner> function0 = new Function0<ViewModelOwner>() { // from class: com.huami.wallet.accessdoor.fragment.StartDetectionFragment$special$$inlined$viewModel$default$1
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
        this.startDetectViewModel = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyMode, (Function0) new Function0<StartDetectionViewModel>() { // from class: com.huami.wallet.accessdoor.fragment.StartDetectionFragment$special$$inlined$viewModel$default$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            /* JADX WARN: Type inference failed for: r0v1, types: [androidx.lifecycle.ViewModel, com.huami.wallet.accessdoor.viewmodel.StartDetectionViewModel] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            /* JADX INFO: renamed from: invoke */
            public final StartDetectionViewModel getA() {
                return ComponentCallbackExtKt.getViewModel(this, qualifier, Reflection.getOrCreateKotlinClass(StartDetectionViewModel.class), function0, objArr);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final FragmentStartDetectionBinding b() {
        return (FragmentStartDetectionBinding) this.binding.getValue(this, c[0]);
    }

    private final StartDetectionViewModel c() {
        return (StartDetectionViewModel) this.startDetectViewModel.getValue();
    }

    private final void d() {
        final TranslateAnimation translateAnimation = new TranslateAnimation(180.0f, 180.0f, 0.0f, 0.0f);
        translateAnimation.setDuration(2000L);
        b().ivTranslation.startAnimation(translateAnimation);
        final TranslateAnimation translateAnimation2 = new TranslateAnimation(0.0f, 180.0f, 0.0f, 0.0f);
        translateAnimation2.setDuration(1500L);
        b().ivTranslation.startAnimation(translateAnimation2);
        translateAnimation.setAnimationListener(new Animation.AnimationListener() { // from class: com.huami.wallet.accessdoor.fragment.StartDetectionFragment$startAnimation$1
            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationEnd(@NotNull Animation animation) {
                this.a.b().ivTranslation.startAnimation(translateAnimation2);
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationRepeat(@NotNull Animation animation) {
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationStart(@NotNull Animation animation) {
            }
        });
        translateAnimation2.setAnimationListener(new Animation.AnimationListener() { // from class: com.huami.wallet.accessdoor.fragment.StartDetectionFragment$startAnimation$2
            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationEnd(@NotNull Animation animation) {
                this.a.b().ivTranslation.startAnimation(translateAnimation);
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationRepeat(@NotNull Animation animation) {
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationStart(@NotNull Animation animation) {
            }
        });
        translateAnimation2.start();
    }

    private final void e() {
        b().tvFeature.setText(getString(DoorKoinModuleKt.getDoorRes().startDetectionMessage()));
    }

    private final void initView(View view) {
        b().tvButton.setOnClickListener(this);
        b().tvSupport.setOnClickListener(this);
    }

    private final void initViewModel() throws Exception {
        LiveDataExtensionKt.observeResourceWithNotNull(c().getDoorResUrlLiveData(), this, new a());
        c().getDoorImageUrl(DoorKoinModuleKt.getDoorRes().startDetectionDrawable());
    }

    public void _$_clearFindViewByIdCache() {
    }

    @Override // org.koin.core.component.KoinComponent
    @NotNull
    public Koin getKoin() {
        return KoinComponent.DefaultImpls.getKoin(this);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(@NotNull View view) {
        int id = view.getId();
        if (id != R.id.tv_button) {
            if (id == R.id.tv_support) {
                FunctionsConfig.getOpenWebUrl().invoke(WebUrlHelper.DOOR_CARD_SUPPORT_RANGE);
            }
        } else {
            StartAccessTipActivity.INSTANCE.open(requireContext());
            FragmentActivity activity = getActivity();
            if (activity == null) {
                return;
            }
            activity.finish();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) throws Exception {
        super.onViewCreated(view, savedInstanceState);
        initView(view);
        initViewModel();
        e();
        d();
    }
}
