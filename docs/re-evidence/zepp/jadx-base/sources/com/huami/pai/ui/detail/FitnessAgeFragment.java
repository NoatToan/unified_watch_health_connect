package com.huami.pai.ui.detail;

import android.content.ComponentCallbacks;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.SeekBar;
import androidx.fragment.app.Fragment;
import androidx.p008lifecycle.LifecycleOwnerKt;
import androidx.p008lifecycle.Observer;
import androidx.p008lifecycle.ViewModelProvider;
import androidx.p008lifecycle.ViewModelStoreOwner;
import androidx.p012savedstate.SavedStateRegistryOwner;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.pai.db.PaiDb;
import com.huami.pai.ext.I18nKt;
import com.huami.pai.ext.ViewExKt;
import com.huami.pai.koin.PaiQualifierNames;
import com.huami.pai.koin.ScopesAndQualifersKt;
import com.huami.pai.lib.R;
import com.huami.pai.lib.databinding.PaiFragmentFitnessAgeBinding;
import com.huami.pai.navigate.ExternalNavigator;
import com.huami.pai.repository.Resource;
import com.huami.pai.ui.detail.FitnessAgeFragment;
import com.huami.pai.ui.detail.FitnessAgeFragment.b;
import com.huami.pai.ui.history.PAIHistoryViewModel;
import com.huami.pai.vo.AgeChangeState;
import com.huami.pai.vo.ChartDataVo;
import com.huami.pai.vo.PAIDataVo;
import com.huami.pai.vo.PAIDataVoKt;
import com.huami.viewbindingx.InflateViewBinder;
import com.huami.viewbindingx.LifeViewBindingProperty;
import com.huami.viewbindingx.fragment.FragmentViewBindingKt;
import com.xiaomi.hm.health.dataprocess.SportDay;
import java.util.Arrays;
import java.util.Locale;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.reflect.KProperty;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.e;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.koin.androidx.viewmodel.ViewModelOwner;
import org.koin.androidx.viewmodel.ext.android.ComponentCallbackExtKt;
import org.koin.core.qualifier.Qualifier;
import org.koin.core.qualifier.QualifierKt;
import org.koin.core.qualifier.StringQualifier;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b+\u0010,J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0004\u001a\u00020\u0002H\u0002J$\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0006\u001a\u00020\u00052\b\u0010\b\u001a\u0004\u0018\u00010\u00072\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0016J\u001a\u0010\u000e\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0016J\b\u0010\u000f\u001a\u00020\u0002H\u0016R\u001d\u0010\u0015\u001a\u00020\u00108B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001d\u0010\u0019\u001a\u00020\u00168B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0004\u0010\u0012\u001a\u0004\b\u0017\u0010\u0018R\u001d\u0010\u001e\u001a\u00020\u001a8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001b\u0010\u0012\u001a\u0004\b\u001c\u0010\u001dR\u001d\u0010\"\u001a\u00020\u001f8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0017\u0010\u0012\u001a\u0004\b \u0010!R\u001d\u0010&\u001a\u00020#8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001c\u0010\u0012\u001a\u0004\b$\u0010%R\u001d\u0010*\u001a\u00020'8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b$\u0010(\u001a\u0004\b\u001b\u0010)¨\u0006-"}, d2 = {"Lcom/huami/pai/ui/detail/FitnessAgeFragment;", "Landroidx/fragment/app/Fragment;", "", "i", "b", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", ViewHierarchyConstants.VIEW_KEY, "onViewCreated", "onResume", "Lcom/huami/pai/ui/detail/FitnessAgeViewModel;", "a", "Lkotlin/Lazy;", "h", "()Lcom/huami/pai/ui/detail/FitnessAgeViewModel;", "viewModel", "Lcom/huami/pai/ui/detail/ChartHelper;", GoogleApiAvailabilityLight.a, "()Lcom/huami/pai/ui/detail/ChartHelper;", "chartHelper", "Lcom/huami/pai/navigate/ExternalNavigator;", "c", "e", "()Lcom/huami/pai/navigate/ExternalNavigator;", "externalNavigator", "", "g", "()Ljava/lang/String;", "questionnaireUrl", "Lcom/huami/pai/db/PaiDb;", "f", "()Lcom/huami/pai/db/PaiDb;", "parDb", "Lcom/huami/pai/lib/databinding/PaiFragmentFitnessAgeBinding;", "Lcom/huami/viewbindingx/LifeViewBindingProperty;", "()Lcom/huami/pai/lib/databinding/PaiFragmentFitnessAgeBinding;", "binding", "<init>", "()V", "lib_release"}, k = 1, mv = {1, 5, 1})
public final class FitnessAgeFragment extends Fragment {
    public static final /* synthetic */ KProperty<Object>[] g;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final Lazy viewModel;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final Lazy chartHelper;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final Lazy externalNavigator;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private final Lazy questionnaireUrl;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    private final Lazy parDb;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    private final LifeViewBindingProperty binding;

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[AgeChangeState.values().length];
            iArr[AgeChangeState.INCREASED.ordinal()] = 1;
            iArr[AgeChangeState.DECREASED.ordinal()] = 2;
            iArr[AgeChangeState.HOLD.ordinal()] = 3;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/huami/pai/ui/detail/ChartHelper;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<ChartHelper> {
        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final ChartHelper getA() {
            return new ChartHelper(FitnessAgeFragment.this.requireContext());
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.pai.ui.detail.FitnessAgeFragment$onViewCreated$1$1", f = "FitnessAgeFragment.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class b extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ PAIDataVo c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(PAIDataVo pAIDataVo, Continuation<? super b> continuation) {
            super(2, continuation);
            this.c = pAIDataVo;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return FitnessAgeFragment.this.new b(this.c, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((b) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            if (this.a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            FitnessAgeFragment.this.f().paiDao().insertPai(PAIDataVoKt.toPai(this.c));
            return Unit.INSTANCE;
        }
    }

    static {
        KProperty<Object>[] kPropertyArr = new KProperty[6];
        kPropertyArr[5] = Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(FitnessAgeFragment.class), "binding", "getBinding()Lcom/huami/pai/lib/databinding/PaiFragmentFitnessAgeBinding;"));
        g = kPropertyArr;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public FitnessAgeFragment() {
        final Function0<ViewModelOwner> function0 = new Function0<ViewModelOwner>() { // from class: com.huami.pai.ui.detail.FitnessAgeFragment$special$$inlined$viewModel$default$1
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
        this.viewModel = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyMode, (Function0) new Function0<FitnessAgeViewModel>() { // from class: com.huami.pai.ui.detail.FitnessAgeFragment$special$$inlined$viewModel$default$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            /* JADX WARN: Type inference failed for: r0v1, types: [androidx.lifecycle.ViewModel, com.huami.pai.ui.detail.FitnessAgeViewModel] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            /* JADX INFO: renamed from: invoke */
            public final FitnessAgeViewModel getA() {
                return ComponentCallbackExtKt.getViewModel(this, qualifier, Reflection.getOrCreateKotlinClass(FitnessAgeViewModel.class), function0, objArr);
            }
        });
        this.chartHelper = LazyKt__LazyJVMKt.lazy(new a());
        final Object[] objArr2 = 0 == true ? 1 : 0;
        final Object[] objArr3 = 0 == true ? 1 : 0;
        this.externalNavigator = LazyKt__LazyJVMKt.lazy(new Function0<ExternalNavigator>() { // from class: com.huami.pai.ui.detail.FitnessAgeFragment$special$$inlined$injectInPai$default$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v3, types: [com.huami.pai.navigate.ExternalNavigator, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            /* JADX INFO: renamed from: invoke */
            public final ExternalNavigator getA() {
                return ScopesAndQualifersKt.paiScope(org.koin.android.ext.android.ComponentCallbackExtKt.getKoin(this)).get(Reflection.getOrCreateKotlinClass(ExternalNavigator.class), objArr2, objArr3);
            }
        });
        final StringQualifier stringQualifierNamed = QualifierKt.named(PaiQualifierNames.FITNESS_AGE_QUESTIONNAIRE);
        final Object[] objArr4 = 0 == true ? 1 : 0;
        this.questionnaireUrl = LazyKt__LazyJVMKt.lazy(new Function0<String>() { // from class: com.huami.pai.ui.detail.FitnessAgeFragment$special$$inlined$injectInPai$default$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, java.lang.String] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            /* JADX INFO: renamed from: invoke */
            public final String getA() {
                return ScopesAndQualifersKt.paiScope(org.koin.android.ext.android.ComponentCallbackExtKt.getKoin(this)).get(Reflection.getOrCreateKotlinClass(String.class), stringQualifierNamed, objArr4);
            }
        });
        final Object[] objArr5 = 0 == true ? 1 : 0;
        final Object[] objArr6 = 0 == true ? 1 : 0;
        this.parDb = LazyKt__LazyJVMKt.lazy(new Function0<PaiDb>() { // from class: com.huami.pai.ui.detail.FitnessAgeFragment$special$$inlined$injectInPai$default$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v3, types: [com.huami.pai.db.PaiDb, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            /* JADX INFO: renamed from: invoke */
            public final PaiDb getA() {
                return ScopesAndQualifersKt.paiScope(org.koin.android.ext.android.ComponentCallbackExtKt.getKoin(this)).get(Reflection.getOrCreateKotlinClass(PaiDb.class), objArr5, objArr6);
            }
        });
        this.binding = FragmentViewBindingKt.viewBinding(new FitnessAgeFragment$special$$inlined$viewBinding$1(new InflateViewBinder(PaiFragmentFitnessAgeBinding.class)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void b() {
        h().calculateFitnessAge(c().soughtPaiSeekbar.getProgress(), c().insistDaysSeekbar.getProgress());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final PaiFragmentFitnessAgeBinding c() {
        return (PaiFragmentFitnessAgeBinding) this.binding.getValue(this, g[5]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ChartHelper d() {
        return (ChartHelper) this.chartHelper.getValue();
    }

    private final ExternalNavigator e() {
        return (ExternalNavigator) this.externalNavigator.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final PaiDb f() {
        return (PaiDb) this.parDb.getValue();
    }

    private final String g() {
        return (String) this.questionnaireUrl.getValue();
    }

    private final FitnessAgeViewModel h() {
        return (FitnessAgeViewModel) this.viewModel.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void i() {
        c().soughtPaiSeekbar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() { // from class: com.huami.pai.ui.detail.FitnessAgeFragment$initAgeViews$1
            @Override // android.widget.SeekBar.OnSeekBarChangeListener
            public void onProgressChanged(@Nullable SeekBar seekBar, int progress, boolean fromUser) {
                this.a.c().soughtPai.setText(I18nKt.i18nString(progress));
                this.a.b();
            }

            @Override // android.widget.SeekBar.OnSeekBarChangeListener
            public void onStartTrackingTouch(@Nullable SeekBar seekBar) {
            }

            @Override // android.widget.SeekBar.OnSeekBarChangeListener
            public void onStopTrackingTouch(@Nullable SeekBar seekBar) {
            }
        });
        c().insistDaysSeekbar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() { // from class: com.huami.pai.ui.detail.FitnessAgeFragment$initAgeViews$2
            @Override // android.widget.SeekBar.OnSeekBarChangeListener
            public void onProgressChanged(@Nullable SeekBar seekBar, int progress, boolean fromUser) {
                this.a.c().insistDays.setText(I18nKt.i18nString(progress));
                this.a.b();
            }

            @Override // android.widget.SeekBar.OnSeekBarChangeListener
            public void onStartTrackingTouch(@Nullable SeekBar seekBar) {
            }

            @Override // android.widget.SeekBar.OnSeekBarChangeListener
            public void onStopTrackingTouch(@Nullable SeekBar seekBar) {
            }
        });
        c().soughtPaiSeekbar.setMax(150);
        c().soughtPaiSeekbar.setProgress(100);
        c().soughtPai.setText(I18nKt.i18nString(c().soughtPaiSeekbar.getProgress()));
        c().insistDaysSeekbar.setMax(90);
        c().insistDaysSeekbar.setProgress(90);
        c().insistDays.setText(I18nKt.i18nString(c().insistDaysSeekbar.getProgress()));
        b();
        h().getPredictedFitnessAge().observe(getViewLifecycleOwner(), new Observer<T>() { // from class: com.huami.pai.ui.detail.FitnessAgeFragment$initAgeViews$$inlined$observe$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(T t) {
                StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                this.a.c().predictedAgeTitle.setText(String.format(Locale.getDefault(), "%s %s", Arrays.copyOf(new Object[]{this.a.getString(R.string.pai_predicted_age_title), String.format(this.a.getResources().getString(R.string.pai_x_ages, (Integer) t), Arrays.copyOf(new Object[0], 0))}, 2)));
            }
        });
        h().getCurrentAge().observe(getViewLifecycleOwner(), new Observer<T>() { // from class: com.huami.pai.ui.detail.FitnessAgeFragment$initAgeViews$$inlined$observe$2
            /* JADX WARN: Multi-variable type inference failed */
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(T t) {
                Integer num = (Integer) t;
                if (num != null) {
                    this.a.c().currentAge.setText(I18nKt.i18nString(num.intValue()));
                }
            }
        });
        h().getAgeChange().observe(getViewLifecycleOwner(), new Observer<T>() { // from class: com.huami.pai.ui.detail.FitnessAgeFragment$initAgeViews$$inlined$observe$3
            /* JADX WARN: Multi-variable type inference failed */
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(T t) {
                int i;
                AgeChangeState ageChangeState = (AgeChangeState) t;
                if (ageChangeState == null) {
                    i = 0;
                } else {
                    int i2 = FitnessAgeFragment.WhenMappings.$EnumSwitchMapping$0[ageChangeState.ordinal()];
                    if (i2 == 1) {
                        i = R.drawable.pai_increase;
                    } else if (i2 == 2) {
                        i = R.drawable.pai_decrease;
                    } else {
                        if (i2 != 3) {
                            throw new NoWhenBranchMatchedException();
                        }
                        i = R.drawable.pai_hold;
                    }
                }
                this.a.c().currentAge.setCompoundDrawablesRelativeWithIntrinsicBounds(0, 0, i, 0);
            }
        });
        h().getPoints().observe(getViewLifecycleOwner(), new Observer<T>() { // from class: com.huami.pai.ui.detail.FitnessAgeFragment$initAgeViews$$inlined$observe$4
            /* JADX WARN: Multi-variable type inference failed */
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(T t) {
                Resource resource = (Resource) t;
                if (resource.getData() != null) {
                    this.a.d().refreshChart(this.a.c().ageChartContainer, (ChartDataVo) resource.getData());
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void j(FitnessAgeFragment fitnessAgeFragment, View view) {
        fitnessAgeFragment.e().navigateToWeb(view.getContext(), fitnessAgeFragment.g());
    }

    @Override // androidx.fragment.app.Fragment
    @NotNull
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return c().getRoot();
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        h().refreshAges();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        ((PAIHistoryViewModel) new ViewModelProvider(requireActivity()).get(PAIHistoryViewModel.class)).getCurrentSelectData().observe(getViewLifecycleOwner(), new Observer<T>() { // from class: com.huami.pai.ui.detail.FitnessAgeFragment$onViewCreated$$inlined$observe$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(T t) {
                PAIDataVo pAIDataVo = (PAIDataVo) t;
                if (pAIDataVo != null) {
                    boolean zIsToday = SportDay.fromString(pAIDataVo.getDate()).isToday();
                    ViewExKt.setVisible(this.a.c().rootFitage, zIsToday);
                    if (zIsToday) {
                        e.f(LifecycleOwnerKt.getLifecycleScope(this.a), Dispatchers.getIO(), null, this.a.new b(pAIDataVo, null), 2, null);
                    }
                }
            }
        });
        c().questionnaireBg.setOnClickListener(new View.OnClickListener() { // from class: q82
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                FitnessAgeFragment.j(this.a, view2);
            }
        });
        ViewExKt.setVisible(c().questionnaire, false);
        ViewExKt.setVisible(c().ageChartArea, false);
        ViewExKt.setVisible(c().ageSeekbarArea, false);
        h().getShowQuestionnaire().observe(getViewLifecycleOwner(), new Observer<T>() { // from class: com.huami.pai.ui.detail.FitnessAgeFragment$onViewCreated$$inlined$observe$2
            /* JADX WARN: Multi-variable type inference failed */
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(T t) {
                ViewExKt.setVisible(this.a.c().questionnaire, ((Boolean) t).booleanValue());
            }
        });
        h().getShowPredictedAges().observe(getViewLifecycleOwner(), new Observer<T>() { // from class: com.huami.pai.ui.detail.FitnessAgeFragment$onViewCreated$$inlined$observe$3
            /* JADX WARN: Multi-variable type inference failed */
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(T t) {
                boolean zBooleanValue = ((Boolean) t).booleanValue();
                ViewExKt.setVisible(this.a.c().ageChartArea, zBooleanValue);
                ViewExKt.setVisible(this.a.c().ageSeekbarArea, zBooleanValue);
            }
        });
        i();
    }
}
