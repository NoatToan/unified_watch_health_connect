package com.huami.wallet.accessdoor.fragment;

import android.animation.ValueAnimator;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ScaleDrawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.amap.api.mapcore.util.hl;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.nfc.base.PayResponse;
import com.huami.nfc.door.WorkerInfo;
import com.huami.viewbindingx.BindViewBinder;
import com.huami.viewbindingx.LifeViewBindingProperty;
import com.huami.viewbindingx.fragment.FragmentViewBindingKt;
import com.huami.wallet.accessdoor.R;
import com.huami.wallet.accessdoor.activity.SimulationFailureActivity;
import com.huami.wallet.accessdoor.activity.SimulationSuccessActivity;
import com.huami.wallet.accessdoor.activity.StartAccessLoadingActivity;
import com.huami.wallet.accessdoor.adapter.OpenBusCardInProgressIntroPagerAdapter;
import com.huami.wallet.accessdoor.databinding.FragmentStartAccessLoadingBinding;
import com.huami.wallet.accessdoor.di.koin.DoorKoinModuleKt;
import com.huami.wallet.accessdoor.entity.IntroPagerData;
import com.huami.wallet.accessdoor.fragment.StartAccessLoadingFragment;
import com.huami.wallet.accessdoor.helper.IconToastHelper;
import com.huami.wallet.accessdoor.helper.LiveDataExtensionKt;
import com.huami.wallet.accessdoor.helper.Resource;
import com.huami.wallet.accessdoor.helper.Status;
import com.huami.wallet.accessdoor.resource.IAccessDoorRes;
import com.huami.wallet.accessdoor.viewmodel.StartSimulationViewModel;
import com.huami.wallet.accessdoor.widget.CarouselViewPager;
import com.huami.wallet.accessdoor.widget.ScaleCircleNavigator;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;
import net.lucode.hackware.magicindicator.ViewPagerHelper;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.koin.androidx.viewmodel.ViewModelOwner;
import org.koin.androidx.viewmodel.ext.android.FragmentExtKt;
import org.koin.core.qualifier.Qualifier;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 &2\u00020\u0001:\u0001&B\u0007¢\u0006\u0004\b$\u0010%J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0004\u001a\u00020\u0002H\u0002J\b\u0010\u0005\u001a\u00020\u0002H\u0002J\b\u0010\u0006\u001a\u00020\u0002H\u0002J\b\u0010\u0007\u001a\u00020\u0002H\u0002J\b\u0010\b\u001a\u00020\u0002H\u0002J\u0014\u0010\u000b\u001a\u0004\u0018\u00010\t2\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0002J\u001a\u0010\u0010\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0016J\b\u0010\u0011\u001a\u00020\u0002H\u0016R\u0018\u0010\u0015\u001a\u0004\u0018\u00010\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0019\u001a\u00020\u00168\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u001d\u0010\u001e\u001a\u00020\u001a8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u001d\u0010#\u001a\u00020\u001f8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000b\u0010 \u001a\u0004\b!\u0010\"¨\u0006'"}, d2 = {"Lcom/huami/wallet/accessdoor/fragment/StartAccessLoadingFragment;", "Landroidx/fragment/app/Fragment;", "", hl.k, "l", "g", "i", "initViewModel", "c", "Landroid/graphics/drawable/Drawable;", "drawable", GoogleApiAvailabilityLight.a, "Landroid/view/View;", ViewHierarchyConstants.VIEW_KEY, "Landroid/os/Bundle;", "savedInstanceState", "onViewCreated", "onDestroy", "Landroid/animation/ValueAnimator;", "a", "Landroid/animation/ValueAnimator;", "progressAnimator", "Lcom/huami/wallet/accessdoor/adapter/OpenBusCardInProgressIntroPagerAdapter;", "b", "Lcom/huami/wallet/accessdoor/adapter/OpenBusCardInProgressIntroPagerAdapter;", "adapter", "Lcom/huami/wallet/accessdoor/viewmodel/StartSimulationViewModel;", "Lkotlin/Lazy;", "f", "()Lcom/huami/wallet/accessdoor/viewmodel/StartSimulationViewModel;", "viewModel", "Lcom/huami/wallet/accessdoor/databinding/FragmentStartAccessLoadingBinding;", "Lcom/huami/viewbindingx/LifeViewBindingProperty;", "e", "()Lcom/huami/wallet/accessdoor/databinding/FragmentStartAccessLoadingBinding;", "binding", "<init>", "()V", "Companion", "access-door_release"}, k = 1, mv = {1, 5, 1})
public final class StartAccessLoadingFragment extends Fragment {
    public static final int IMAGE_SIZE = 2;
    public static final int STATUS_RE_LOGIN_SUCCESS = 2;
    public static final /* synthetic */ KProperty<Object>[] e;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @Nullable
    private ValueAnimator progressAnimator;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private OpenBusCardInProgressIntroPagerAdapter adapter;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final Lazy viewModel;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private final LifeViewBindingProperty binding;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0005\u001a\u00020\u00042\u001a\u0010\u0003\u001a\u0016\u0012\u0004\u0012\u00020\u0001 \u0002*\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00000\u0000H\n"}, d2 = {"Lcom/huami/wallet/accessdoor/helper/Resource;", "", "kotlin.jvm.PlatformType", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function1<Resource<String>, Unit> {
        public a() {
            super(1);
        }

        public final void a(Resource<String> resource) {
            if (resource.status == Status.LOADING) {
                StartAccessLoadingFragment.this.i();
                return;
            }
            if (resource.data != null && resource.isSuccessful()) {
                SimulationSuccessActivity.INSTANCE.open(StartAccessLoadingFragment.this.requireContext(), resource.data, StartAccessLoadingFragment.this.f().getNfcTag() == null);
                FragmentActivity activity = StartAccessLoadingFragment.this.getActivity();
                if (activity == null) {
                    return;
                }
                activity.finish();
                return;
            }
            if (TextUtils.equals(resource.code, PayResponse.CODE_NETWORK_ERROR)) {
                IconToastHelper.showOrError(StartAccessLoadingFragment.this.requireContext(), StartAccessLoadingFragment.this.getResources().getString(R.string.access_no_network), resource);
                SimulationFailureActivity.INSTANCE.open(StartAccessLoadingFragment.this.requireContext(), "", "");
                FragmentActivity activity2 = StartAccessLoadingFragment.this.getActivity();
                if (activity2 == null) {
                    return;
                }
                activity2.finish();
                return;
            }
            if (TextUtils.equals(resource.code, "http401")) {
                return;
            }
            if (TextUtils.equals(resource.code, "w10000")) {
                SimulationFailureActivity.INSTANCE.open(StartAccessLoadingFragment.this.requireContext(), "", "");
            } else {
                SimulationFailureActivity.INSTANCE.open(StartAccessLoadingFragment.this.requireContext(), resource.code, resource.message);
            }
            FragmentActivity activity3 = StartAccessLoadingFragment.this.getActivity();
            if (activity3 == null) {
                return;
            }
            activity3.finish();
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Resource<String> resource) {
            a(resource);
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n"}, d2 = {"", "kotlin.jvm.PlatformType", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function1<Integer, Unit> {
        public b() {
            super(1);
        }

        public final void a(Integer num) {
            if (num != null && num.intValue() == 2) {
                SimulationFailureActivity.INSTANCE.open(StartAccessLoadingFragment.this.requireContext(), "", "");
                StartAccessLoadingFragment.this.requireActivity().finish();
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Integer num) {
            a(num);
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0005\u001a\u00020\u00042\u001a\u0010\u0003\u001a\u0016\u0012\u0004\u0012\u00020\u0001 \u0002*\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00000\u0000H\n"}, d2 = {"", "", "kotlin.jvm.PlatformType", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function1<List<? extends String>, Unit> {
        public c() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(List<? extends String> list) {
            invoke2((List<String>) list);
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(List<String> list) {
            StartAccessLoadingFragment.this.l();
        }
    }

    static {
        KProperty<Object>[] kPropertyArr = new KProperty[2];
        kPropertyArr[1] = Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(StartAccessLoadingFragment.class), "binding", "getBinding()Lcom/huami/wallet/accessdoor/databinding/FragmentStartAccessLoadingBinding;"));
        e = kPropertyArr;
        INSTANCE = new Companion(null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public StartAccessLoadingFragment() {
        super(R.layout.fragment_start_access_loading);
        final Function0<ViewModelOwner> function0 = new Function0<ViewModelOwner>() { // from class: com.huami.wallet.accessdoor.fragment.StartAccessLoadingFragment$special$$inlined$sharedViewModel$default$1
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            @NotNull
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final ViewModelOwner getA() {
                return ViewModelOwner.INSTANCE.from(this.requireActivity(), this.requireActivity());
            }
        };
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        final Qualifier qualifier = null;
        final Object[] objArr = 0 == true ? 1 : 0;
        this.viewModel = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyMode, (Function0) new Function0<StartSimulationViewModel>() { // from class: com.huami.wallet.accessdoor.fragment.StartAccessLoadingFragment$special$$inlined$sharedViewModel$default$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            /* JADX WARN: Type inference failed for: r0v1, types: [androidx.lifecycle.ViewModel, com.huami.wallet.accessdoor.viewmodel.StartSimulationViewModel] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            /* JADX INFO: renamed from: invoke */
            public final StartSimulationViewModel getA() {
                return FragmentExtKt.getSharedViewModel(this, qualifier, Reflection.getOrCreateKotlinClass(StartSimulationViewModel.class), function0, objArr);
            }
        });
        this.binding = FragmentViewBindingKt.viewBinding(new StartAccessLoadingFragment$special$$inlined$viewBindingByBind$1(new BindViewBinder(FragmentStartAccessLoadingBinding.class)));
    }

    private final void c() {
        ValueAnimator valueAnimator;
        ValueAnimator valueAnimator2 = this.progressAnimator;
        if (valueAnimator2 == null || !valueAnimator2.isRunning() || (valueAnimator = this.progressAnimator) == null) {
            return;
        }
        valueAnimator.cancel();
    }

    private final Drawable d(Drawable drawable) {
        if (drawable instanceof LayerDrawable) {
            LayerDrawable layerDrawable = (LayerDrawable) drawable;
            int numberOfLayers = layerDrawable.getNumberOfLayers();
            int i = 0;
            if (numberOfLayers > 0) {
                while (true) {
                    int i2 = i + 1;
                    Drawable drawable2 = layerDrawable.getDrawable(i);
                    if (drawable2 instanceof ScaleDrawable) {
                        drawable2.setLevel(1);
                    }
                    if (i2 >= numberOfLayers) {
                        break;
                    }
                    i = i2;
                }
            }
        } else if (drawable instanceof ScaleDrawable) {
            ((ScaleDrawable) drawable).setLevel(1);
        }
        return drawable;
    }

    private final FragmentStartAccessLoadingBinding e() {
        return (FragmentStartAccessLoadingBinding) this.binding.getValue(this, e[1]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final StartSimulationViewModel f() {
        return (StartSimulationViewModel) this.viewModel.getValue();
    }

    private final void g() {
        ScaleCircleNavigator scaleCircleNavigator = new ScaleCircleNavigator(requireContext());
        OpenBusCardInProgressIntroPagerAdapter openBusCardInProgressIntroPagerAdapter = this.adapter;
        Objects.requireNonNull(openBusCardInProgressIntroPagerAdapter);
        scaleCircleNavigator.setCircleCount(openBusCardInProgressIntroPagerAdapter.getPagerCount());
        scaleCircleNavigator.setNormalCircleColor(ContextCompat.getColor(requireContext(), R.color.wl_circle_pager_indicator_normal));
        scaleCircleNavigator.setSelectedCircleColor(ContextCompat.getColor(requireContext(), R.color.wl_circle_pager_indicator_selected));
        scaleCircleNavigator.setCircleClickListener(new ScaleCircleNavigator.OnCircleClickListener() { // from class: se7
            @Override // com.huami.wallet.accessdoor.widget.ScaleCircleNavigator.OnCircleClickListener
            public final void onClick(int i) {
                StartAccessLoadingFragment.h(this.a, i);
            }
        });
        e().magicIndicator.setNavigator(scaleCircleNavigator);
        ViewPagerHelper.bind(e().magicIndicator, e().viewPager);
        e().viewPager.startCyclicSwitch();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void h(StartAccessLoadingFragment startAccessLoadingFragment, int i) {
        startAccessLoadingFragment.e().viewPager.setCurrentItem(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void i() {
        c();
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(0, (int) (e().progressBar.getMax() * 0.9f));
        valueAnimatorOfInt.setDuration(30000L);
        valueAnimatorOfInt.setInterpolator(new AccelerateDecelerateInterpolator());
        valueAnimatorOfInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: re7
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                StartAccessLoadingFragment.j(this.a, valueAnimator);
            }
        });
        valueAnimatorOfInt.start();
        this.progressAnimator = valueAnimatorOfInt;
    }

    private final void initViewModel() {
        LiveDataExtensionKt.observeWithNotNull(f().getSimulationStatusLiveData(), this, new a());
        LiveDataExtensionKt.observeWithNotNull(f().getLoginStatusLiveData(), this, new b());
        LiveDataExtensionKt.observeWithNotNull(f().getImageUrlList(), this, new c());
        f().getDoorResUrl(DoorKoinModuleKt.getDoorRes().openDoorLoadingIntroPictureFirst(), DoorKoinModuleKt.getDoorRes().openDoorLoadingIntroPictureSecond());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void j(StartAccessLoadingFragment startAccessLoadingFragment, ValueAnimator valueAnimator) {
        Object animatedValue = valueAnimator.getAnimatedValue();
        Objects.requireNonNull(animatedValue, "null cannot be cast to non-null type kotlin.Int");
        startAccessLoadingFragment.e().progressBar.setProgress(((Integer) animatedValue).intValue());
    }

    private final void k() {
        IAccessDoorRes doorRes = DoorKoinModuleKt.getDoorRes();
        this.adapter = new OpenBusCardInProgressIntroPagerAdapter(CollectionsKt__CollectionsKt.listOf((Object[]) Arrays.copyOf(new IntroPagerData[]{new IntroPagerData("", getString(doorRes.openDoorLoadingIntroFirst())), new IntroPagerData("", getString(doorRes.openDoorLoadingIntroSecond()))}, 2)));
        CarouselViewPager carouselViewPager = e().viewPager;
        OpenBusCardInProgressIntroPagerAdapter openBusCardInProgressIntroPagerAdapter = this.adapter;
        Objects.requireNonNull(openBusCardInProgressIntroPagerAdapter);
        carouselViewPager.setAdapter(openBusCardInProgressIntroPagerAdapter);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void l() {
        List<String> value = f().getImageUrlList().getValue();
        if (value == null || value.size() != 2) {
            return;
        }
        IAccessDoorRes doorRes = DoorKoinModuleKt.getDoorRes();
        IntroPagerData[] introPagerDataArr = {new IntroPagerData(value.get(0), getString(doorRes.openDoorLoadingIntroFirst())), new IntroPagerData(value.get(1), getString(doorRes.openDoorLoadingIntroSecond()))};
        OpenBusCardInProgressIntroPagerAdapter openBusCardInProgressIntroPagerAdapter = this.adapter;
        Objects.requireNonNull(openBusCardInProgressIntroPagerAdapter);
        openBusCardInProgressIntroPagerAdapter.update(CollectionsKt__CollectionsKt.listOf((Object[]) Arrays.copyOf(introPagerDataArr, 2)));
    }

    public void _$_clearFindViewByIdCache() {
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        c();
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) throws Exception {
        super.onViewCreated(view, savedInstanceState);
        WorkerInfo workerInfo = (WorkerInfo) requireActivity().getIntent().getParcelableExtra(StartAccessLoadingActivity.FLAG_WORK);
        k();
        g();
        if (workerInfo == null) {
            f().startSimulation();
        } else {
            f().startWorkCardSimulation(workerInfo);
        }
        f().getLoginStatus();
        initViewModel();
    }
}
