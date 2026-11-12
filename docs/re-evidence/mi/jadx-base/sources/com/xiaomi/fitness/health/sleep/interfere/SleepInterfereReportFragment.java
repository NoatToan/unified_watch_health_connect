package com.xiaomi.fitness.health.sleep.interfere;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.appbar.AppBarLayout;
import com.xiaomi.fitness.base.EmptyBasicDataViewModel;
import com.xiaomi.fitness.baseui.common.FragmentParams;
import com.xiaomi.fitness.baseui.utils.ViewUiUtils;
import com.xiaomi.fitness.baseui.view.BaseFragment;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.ExtUtilsKt;
import com.xiaomi.fitness.extensions.ViewExtKt;
import com.xiaomi.fitness.health.sleep.interfere.SleepInterfereReportFragment;
import com.xiaomi.fitness.health.sleep.interfere.net.SleepInterferePlan;
import com.xiaomi.fitness.health.sleep.interfere.report.SleepInterfereReportAdapter;
import defpackage.a4i;
import defpackage.aca;
import defpackage.aje;
import defpackage.c0j;
import defpackage.dih;
import defpackage.eri;
import defpackage.jui;
import defpackage.nuf;
import defpackage.nwi;
import defpackage.p7h;
import java.time.Instant;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import kotlin.KotlinNothingValueException;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.StateFlow;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\b\u0007\u0018\u0000 '2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001'B\u0007¢\u0006\u0004\b&\u0010\u0006J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\u0006J\u0019\u0010\n\u001a\u00020\u00042\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\n\u0010\u000bJ!\u0010\u000e\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\f2\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ#\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u00102\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00040\u0012¢\u0006\u0004\b\u0014\u0010\u0015R\u0016\u0010\u0017\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u001b\u0010\u001e\u001a\u00020\u00198BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0018\u0010 \u001a\u0004\u0018\u00010\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010!R\u0014\u0010%\u001a\u00020\"8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b#\u0010$¨\u0006("}, d2 = {"Lcom/xiaomi/fitness/health/sleep/interfere/SleepInterfereReportFragment;", "Lcom/xiaomi/fitness/baseui/view/BaseBindingFragment;", "Lcom/xiaomi/fitness/base/EmptyBasicDataViewModel;", "Laca;", "", "initToolBar", "()V", "initContent", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "Landroid/view/View;", "view", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "Landroidx/fragment/app/Fragment;", "fragment", "Lkotlin/Function0;", "action", "setBackPressedFragment", "(Landroidx/fragment/app/Fragment;Lkotlin/jvm/functions/Function0;)V", "", "planId", "J", "Lcom/xiaomi/fitness/health/sleep/interfere/SleepInterfereReportViewModel;", "sleepInterfereReportViewModel$delegate", "Lkotlin/Lazy;", "getSleepInterfereReportViewModel", "()Lcom/xiaomi/fitness/health/sleep/interfere/SleepInterfereReportViewModel;", "sleepInterfereReportViewModel", "Lcom/xiaomi/fitness/health/sleep/interfere/report/SleepInterfereReportAdapter;", "reportAdapter", "Lcom/xiaomi/fitness/health/sleep/interfere/report/SleepInterfereReportAdapter;", "", "getLayoutId", "()I", "layoutId", "<init>", "Companion", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nSleepInterfereReportFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SleepInterfereReportFragment.kt\ncom/xiaomi/fitness/health/sleep/interfere/SleepInterfereReportFragment\n+ 2 FragmentViewModelLazy.kt\nandroidx/fragment/app/FragmentViewModelLazyKt\n+ 3 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,266:1\n106#2,15:267\n65#3,2:282\n326#3,4:284\n68#3:288\n37#3:289\n53#3:290\n72#3:291\n*S KotlinDebug\n*F\n+ 1 SleepInterfereReportFragment.kt\ncom/xiaomi/fitness/health/sleep/interfere/SleepInterfereReportFragment\n*L\n72#1:267,15\n119#1:282,2\n125#1:284,4\n119#1:288\n119#1:289\n119#1:290\n119#1:291\n*E\n"})
public final class SleepInterfereReportFragment extends Hilt_SleepInterfereReportFragment<EmptyBasicDataViewModel, aca> {

    @NotNull
    private static final String CLOSE_ACTION = "action.close_sleep_interfere_report";

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final String KEY_PLAN_ID = "key.plan_id";

    @NotNull
    public static final String TAG = "SleepInterfereReportFragment";
    private long planId = -10;

    @Nullable
    private SleepInterfereReportAdapter reportAdapter;

    /* JADX INFO: renamed from: sleepInterfereReportViewModel$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy sleepInterfereReportViewModel;

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rR\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lcom/xiaomi/fitness/health/sleep/interfere/SleepInterfereReportFragment$Companion;", "", "<init>", "()V", "TAG", "", "CLOSE_ACTION", "KEY_PLAN_ID", "launch", "", "ctx", "Landroid/content/Context;", "planId", "", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final void launch(@NotNull Context ctx, long planId) {
            Intrinsics.checkNotNullParameter(ctx, "ctx");
            dih dihVarA = dih.a();
            FragmentParams.b bVarE = new FragmentParams.b().e(SleepInterfereReportFragment.class);
            Bundle bundle = new Bundle();
            bundle.putLong(SleepInterfereReportFragment.KEY_PLAN_ID, planId);
            Unit unit = Unit.INSTANCE;
            dihVarA.e(ctx, bVarE.c(bundle).b());
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.health.sleep.interfere.SleepInterfereReportFragment$initContent$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.health.sleep.interfere.SleepInterfereReportFragment$initContent$1", f = "SleepInterfereReportFragment.kt", i = {}, l = {244}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ TextView $dateTitle;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(TextView textView, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$dateTitle = textView;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return SleepInterfereReportFragment.this.new AnonymousClass1(this.$dateTitle, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                SleepInterfereReportFragment.this.showLoading(c0j.yq, true);
                StateFlow<SleepInterferePlan> planStateFlow = SleepInterfereReportFragment.this.getSleepInterfereReportViewModel().getPlanStateFlow();
                final TextView textView = this.$dateTitle;
                final SleepInterfereReportFragment sleepInterfereReportFragment = SleepInterfereReportFragment.this;
                FlowCollector<? super SleepInterferePlan> flowCollector = new FlowCollector() { // from class: com.xiaomi.fitness.health.sleep.interfere.SleepInterfereReportFragment.initContent.1.1
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                        return emit((SleepInterferePlan) obj2, (Continuation<? super Unit>) continuation);
                    }

                    public final Object emit(SleepInterferePlan sleepInterferePlan, Continuation<? super Unit> continuation) {
                        if (sleepInterferePlan == null) {
                            return Unit.INSTANCE;
                        }
                        ZoneId zoneIdOf = ZoneId.of("UTC");
                        DateTimeFormatter dateTimeFormatterOfPattern = DateTimeFormatter.ofPattern("yyyy.MM.dd", Locale.getDefault());
                        textView.setText(sleepInterfereReportFragment.getString(c0j.common_format_time_window_from_to, Instant.ofEpochSecond(sleepInterferePlan.getStartDate()).atZone(zoneIdOf).toLocalDate().format(dateTimeFormatterOfPattern), Instant.ofEpochSecond(sleepInterferePlan.getEndDate()).atZone(zoneIdOf).toLocalDate().format(dateTimeFormatterOfPattern)));
                        sleepInterfereReportFragment.dismissDialogForce();
                        SleepInterfereReportAdapter sleepInterfereReportAdapter = sleepInterfereReportFragment.reportAdapter;
                        if (sleepInterfereReportAdapter != null) {
                            sleepInterfereReportAdapter.updatePlan(sleepInterferePlan);
                        }
                        return Unit.INSTANCE;
                    }
                };
                this.label = 1;
                if (planStateFlow.collect(flowCollector, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            throw new KotlinNothingValueException();
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.health.sleep.interfere.SleepInterfereReportFragment$initToolBar$3, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.health.sleep.interfere.SleepInterfereReportFragment$initToolBar$3", f = "SleepInterfereReportFragment.kt", i = {}, l = {153}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ MenuItem $restartPlanView;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(MenuItem menuItem, Continuation<? super AnonymousClass3> continuation) {
            super(2, continuation);
            this.$restartPlanView = menuItem;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return SleepInterfereReportFragment.this.new AnonymousClass3(this.$restartPlanView, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                StateFlow<Boolean> hasOngoingPlanStateFlow = SleepInterfereReportFragment.this.getSleepInterfereReportViewModel().getHasOngoingPlanStateFlow();
                final MenuItem menuItem = this.$restartPlanView;
                FlowCollector<? super Boolean> flowCollector = new FlowCollector() { // from class: com.xiaomi.fitness.health.sleep.interfere.SleepInterfereReportFragment.initToolBar.3.1
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                        return emit((Boolean) obj2, (Continuation<? super Unit>) continuation);
                    }

                    public final Object emit(Boolean bool, Continuation<? super Unit> continuation) {
                        if (bool == null || Intrinsics.areEqual(bool, Boxing.boxBoolean(true))) {
                            menuItem.setVisible(false);
                        } else {
                            if (!Intrinsics.areEqual(bool, Boxing.boxBoolean(false))) {
                                throw new NoWhenBranchMatchedException();
                            }
                            menuItem.setVisible(true);
                        }
                        return Unit.INSTANCE;
                    }
                };
                this.label = 1;
                if (hasOngoingPlanStateFlow.collect(flowCollector, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            throw new KotlinNothingValueException();
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass3) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    public SleepInterfereReportFragment() {
        final Function0<Fragment> function0 = new Function0<Fragment>() { // from class: com.xiaomi.fitness.health.sleep.interfere.SleepInterfereReportFragment$special$$inlined$viewModels$default$1
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final Fragment invoke() {
                return this;
            }
        };
        final Lazy lazy = LazyKt__LazyJVMKt.lazy(LazyThreadSafetyMode.NONE, (Function0) new Function0<ViewModelStoreOwner>() { // from class: com.xiaomi.fitness.health.sleep.interfere.SleepInterfereReportFragment$special$$inlined$viewModels$default$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final ViewModelStoreOwner invoke() {
                return (ViewModelStoreOwner) function0.invoke();
            }
        });
        final Function0 function1 = null;
        this.sleepInterfereReportViewModel = FragmentViewModelLazyKt.createViewModelLazy(this, Reflection.getOrCreateKotlinClass(SleepInterfereReportViewModel.class), new Function0<ViewModelStore>() { // from class: com.xiaomi.fitness.health.sleep.interfere.SleepInterfereReportFragment$special$$inlined$viewModels$default$3
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final ViewModelStore invoke() {
                ViewModelStore viewModelStore = FragmentViewModelLazyKt.m39viewModels$lambda1(lazy).getViewModelStore();
                Intrinsics.checkNotNullExpressionValue(viewModelStore, "owner.viewModelStore");
                return viewModelStore;
            }
        }, new Function0<CreationExtras>() { // from class: com.xiaomi.fitness.health.sleep.interfere.SleepInterfereReportFragment$special$$inlined$viewModels$default$4
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final CreationExtras invoke() {
                CreationExtras creationExtras;
                Function0 function2 = function1;
                if (function2 != null && (creationExtras = (CreationExtras) function2.invoke()) != null) {
                    return creationExtras;
                }
                ViewModelStoreOwner viewModelStoreOwnerM39viewModels$lambda1 = FragmentViewModelLazyKt.m39viewModels$lambda1(lazy);
                HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory = viewModelStoreOwnerM39viewModels$lambda1 instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) viewModelStoreOwnerM39viewModels$lambda1 : null;
                CreationExtras defaultViewModelCreationExtras = hasDefaultViewModelProviderFactory != null ? hasDefaultViewModelProviderFactory.getDefaultViewModelCreationExtras() : null;
                return defaultViewModelCreationExtras == null ? CreationExtras.Empty.INSTANCE : defaultViewModelCreationExtras;
            }
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.xiaomi.fitness.health.sleep.interfere.SleepInterfereReportFragment$special$$inlined$viewModels$default$5
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final ViewModelProvider.Factory invoke() {
                ViewModelProvider.Factory defaultViewModelProviderFactory;
                ViewModelStoreOwner viewModelStoreOwnerM39viewModels$lambda1 = FragmentViewModelLazyKt.m39viewModels$lambda1(lazy);
                HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory = viewModelStoreOwnerM39viewModels$lambda1 instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) viewModelStoreOwnerM39viewModels$lambda1 : null;
                if (hasDefaultViewModelProviderFactory == null || (defaultViewModelProviderFactory = hasDefaultViewModelProviderFactory.getDefaultViewModelProviderFactory()) == null) {
                    defaultViewModelProviderFactory = this.getDefaultViewModelProviderFactory();
                }
                Intrinsics.checkNotNullExpressionValue(defaultViewModelProviderFactory, "(owner as? HasDefaultVie…tViewModelProviderFactory");
                return defaultViewModelProviderFactory;
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final /* synthetic */ aca access$getMBinding(SleepInterfereReportFragment sleepInterfereReportFragment) {
        return (aca) sleepInterfereReportFragment.getMBinding();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final SleepInterfereReportViewModel getSleepInterfereReportViewModel() {
        return (SleepInterfereReportViewModel) this.sleepInterfereReportViewModel.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void initContent() {
        RecyclerView contentRecyclerView = ((aca) getMBinding()).E;
        Intrinsics.checkNotNullExpressionValue(contentRecyclerView, "contentRecyclerView");
        contentRecyclerView.setLayoutManager(new LinearLayoutManager(requireContext()));
        Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        SleepInterfereReportAdapter sleepInterfereReportAdapter = new SleepInterfereReportAdapter(contextRequireContext, this, getSleepInterfereReportViewModel());
        this.reportAdapter = sleepInterfereReportAdapter;
        contentRecyclerView.setAdapter(sleepInterfereReportAdapter);
        TextView dateTitle = ((aca) getMBinding()).F;
        Intrinsics.checkNotNullExpressionValue(dateTitle, "dateTitle");
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new AnonymousClass1(dateTitle, null), 3, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void initToolBar() {
        ViewUiUtils.fitFullScreen$default(ViewUiUtils.INSTANCE, this, ((aca) getMBinding()).K, (View) null, (Function2) null, 6, (Object) null);
        setBackPressedFragment(this, new Function0() { // from class: dom
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SleepInterfereReportFragment.initToolBar$lambda$2(this.f15745a);
            }
        });
        ViewExtKt.clickWithTrigger$default(((aca) getMBinding()).B, 0L, new Function1() { // from class: eom
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return SleepInterfereReportFragment.initToolBar$lambda$3(this.f16886a, (ImageView) obj);
            }
        }, 1, null);
        nuf.f(((aca) getMBinding()).B);
        final a4i a4iVar = new a4i(requireActivity(), ((aca) getMBinding()).I);
        a4iVar.f(nwi.u);
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new AnonymousClass3(a4iVar.d().findItem(eri.ae), null), 3, null);
        a4iVar.setOnMenuItemClickListener(new a4i.c() { // from class: fom
            @Override // a4i.c
            public final boolean onMenuItemClick(MenuItem menuItem) {
                return SleepInterfereReportFragment.initToolBar$lambda$4(this.f18006a, menuItem);
            }
        });
        ViewExtKt.clickWithTrigger$default(((aca) getMBinding()).I, 0L, new Function1() { // from class: gom
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return SleepInterfereReportFragment.initToolBar$lambda$5(a4iVar, (ImageView) obj);
            }
        }, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit initToolBar$lambda$2(SleepInterfereReportFragment this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.requireActivity().finish();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit initToolBar$lambda$3(SleepInterfereReportFragment this$0, ImageView it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        this$0.requireActivity().getOnBackPressedDispatcher().d();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean initToolBar$lambda$4(SleepInterfereReportFragment this$0, MenuItem menuItem) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        int itemId = menuItem.getItemId();
        if (itemId == eri.ae) {
            BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this$0), null, null, new SleepInterfereReportFragment$initToolBar$4$1(this$0, null), 3, null);
            return true;
        }
        if (itemId != eri.Mc) {
            return true;
        }
        SleepInterfereHistoryFragment.Companion companion = SleepInterfereHistoryFragment.INSTANCE;
        FragmentActivity fragmentActivityRequireActivity = this$0.requireActivity();
        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
        companion.launch(fragmentActivityRequireActivity);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit initToolBar$lambda$5(a4i popMenu, ImageView it) {
        Intrinsics.checkNotNullParameter(popMenu, "$popMenu");
        Intrinsics.checkNotNullParameter(it, "it");
        popMenu.g();
        return Unit.INSTANCE;
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseFragment, com.xiaomi.fitness.baseui.ViewCreator
    public int getLayoutId() {
        return jui.Q0;
    }

    @Override // miuix.appcompat.app.Fragment, androidx.fragment.app.Fragment
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSleepInterfereReportViewModel().updateHasOngoingPlan();
        Bundle arguments = getArguments();
        long j = arguments != null ? arguments.getLong(KEY_PLAN_ID) : -1L;
        if (j > 0 && this.planId != j) {
            this.planId = j;
            getSleepInterfereReportViewModel().updateCurrentplanById(this.planId);
        }
        aje.b(requireContext()).d(new Intent(CLOSE_ACTION));
        aje.b(requireContext()).c(new BroadcastReceiver() { // from class: com.xiaomi.fitness.health.sleep.interfere.SleepInterfereReportFragment.onCreate.1
            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context, Intent intent) {
                try {
                    SleepInterfereReportFragment.this.requireActivity().finish();
                } catch (Exception unused) {
                    Logger.e(BaseFragment.TAG, "close activity exception!!");
                }
            }
        }, new IntentFilter(CLOSE_ACTION));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.xiaomi.fitness.baseui.view.BaseBindingFragment, com.xiaomi.fitness.baseui.view.BaseViewModelFragment, com.xiaomi.fitness.baseui.view.BaseFragment, miuix.appcompat.app.Fragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        setActionBarDisplayable(false);
        initToolBar();
        AppBarLayout appBar = ((aca) getMBinding()).A;
        Intrinsics.checkNotNullExpressionValue(appBar, "appBar");
        if (!appBar.isLaidOut() || appBar.isLayoutRequested()) {
            appBar.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: com.xiaomi.fitness.health.sleep.interfere.SleepInterfereReportFragment$onViewCreated$$inlined$doOnLayout$1
                @Override // android.view.View.OnLayoutChangeListener
                public void onLayoutChange(@NotNull View view2, int left, int top, int right, int bottom, int oldLeft, int oldTop, int oldRight, int oldBottom) {
                    view2.removeOnLayoutChangeListener(this);
                    ImageView backgroundGradient = SleepInterfereReportFragment.access$getMBinding(this.this$0).C;
                    Intrinsics.checkNotNullExpressionValue(backgroundGradient, "backgroundGradient");
                    LinearLayout titleLayout = SleepInterfereReportFragment.access$getMBinding(this.this$0).J;
                    Intrinsics.checkNotNullExpressionValue(titleLayout, "titleLayout");
                    int bottom2 = (backgroundGradient.getBottom() - titleLayout.getBottom()) - ExtUtilsKt.getDp(28);
                    if (bottom2 > 0) {
                        ViewGroup.LayoutParams layoutParams = backgroundGradient.getLayoutParams();
                        if (layoutParams == null) {
                            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                        }
                        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                        marginLayoutParams.bottomMargin = -bottom2;
                        backgroundGradient.setLayoutParams(marginLayoutParams);
                    }
                }
            });
        } else {
            ImageView backgroundGradient = access$getMBinding(this).C;
            Intrinsics.checkNotNullExpressionValue(backgroundGradient, "backgroundGradient");
            LinearLayout titleLayout = access$getMBinding(this).J;
            Intrinsics.checkNotNullExpressionValue(titleLayout, "titleLayout");
            int bottom = (backgroundGradient.getBottom() - titleLayout.getBottom()) - ExtUtilsKt.getDp(28);
            if (bottom > 0) {
                ViewGroup.LayoutParams layoutParams = backgroundGradient.getLayoutParams();
                if (layoutParams == null) {
                    throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                }
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                marginLayoutParams.bottomMargin = -bottom;
                backgroundGradient.setLayoutParams(marginLayoutParams);
            }
        }
        initContent();
    }

    public final void setBackPressedFragment(@NotNull Fragment fragment, @NotNull final Function0<Unit> action) {
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        Intrinsics.checkNotNullParameter(action, "action");
        requireActivity().getOnBackPressedDispatcher().b(fragment.getViewLifecycleOwner(), new p7h() { // from class: com.xiaomi.fitness.health.sleep.interfere.SleepInterfereReportFragment.setBackPressedFragment.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(true);
            }

            @Override // defpackage.p7h
            public void handleOnBackPressed() {
                action.invoke();
            }
        });
    }
}
