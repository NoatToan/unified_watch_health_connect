package com.xiaomi.fitness.trail;

import android.app.ActivityOptions;
import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import android.view.ViewStub;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.recyclerview.widget.RecyclerView;
import com.mi.health.course.export.CourseApiKt;
import com.xiaomi.fit.data.common.data.annotation.SportCategory;
import com.xiaomi.fit.data.common.data.sport.SportBasicReport;
import com.xiaomi.fit.data.common.data.sport.SportCategoryData;
import com.xiaomi.fit.data.common.data.sport.SportSummary;
import com.xiaomi.fit.fitness.export.api.FitnessDataGetter;
import com.xiaomi.fit.fitness.export.di.FitnessDataExtKt;
import com.xiaomi.fit.fitness.parser.data.DivingOutInPosition;
import com.xiaomi.fit.fitness.parser.data.DivingPosition;
import com.xiaomi.fit.fitness.parser.data.OneDivingIdReport;
import com.xiaomi.fitness.baseui.recyclerview.decoration.LinearItemSpace;
import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.common.extensions.ListExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.ExtUtilsKt;
import com.xiaomi.fitness.common.utils.TimeDateUtil;
import com.xiaomi.fitness.extensions.ViewExtKt;
import com.xiaomi.fitness.request.SportHttpRequest;
import com.xiaomi.fitness.trail.DimenTotalFragment;
import com.xiaomi.fitness.trail.adapter.DurationAdapter;
import com.xiaomi.fitness.trail.adapter.RecordBestAdapter;
import com.xiaomi.fitness.trail.data.DimTotalData;
import com.xiaomi.fitness.trail.data.RecordUtilKt;
import com.xiaomi.fitness.trail.data.SportPercent;
import com.xiaomi.fitness.trail.data.ValueType;
import com.xiaomi.fitness.trail.export.SportRecordApi;
import com.xiaomi.fitness.trail.export.SportRecordApiKt;
import com.xiaomi.fitness.trail.holder.DivingTotalHolder;
import com.xiaomi.fitness.trail.viewmodel.DimTotalVM;
import com.xiaomi.fitness.trail.viewmodel.RecordMainVM;
import com.xiaomi.fitness.util.DiveStatisticsExtKt;
import defpackage.byi;
import defpackage.ivi;
import defpackage.ixq;
import defpackage.j1j;
import defpackage.krp;
import defpackage.lp5;
import defpackage.mrp;
import defpackage.pz6;
import defpackage.sk5;
import defpackage.vpp;
import defpackage.wc0;
import defpackage.xpp;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.KotlinNothingValueException;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.MutableStateFlow;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0086\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 F2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001FB\u0007¢\u0006\u0004\bE\u0010\u000eJ\u0019\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\r\u0010\u000eJ5\u0010\u0016\u001a\u00020\u00062\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00112\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u0011H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u001a\u001a\u00020\u00062\u0006\u0010\u0019\u001a\u00020\u0018H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001c\u001a\u00020\u00062\u0006\u0010\u0019\u001a\u00020\u0018H\u0002¢\u0006\u0004\b\u001c\u0010\u001bJ\u0017\u0010\u001d\u001a\u00020\u00062\u0006\u0010\u0019\u001a\u00020\u0018H\u0002¢\u0006\u0004\b\u001d\u0010\u001bJ\u000f\u0010\u001e\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u001e\u0010\u000eJ\u000f\u0010\u001f\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u001f\u0010\u000eJ!\u0010\"\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u000f2\b\u0010!\u001a\u0004\u0018\u00010 H\u0016¢\u0006\u0004\b\"\u0010#J\u0017\u0010%\u001a\u00020\u00062\u0006\u0010$\u001a\u00020\u0004H\u0016¢\u0006\u0004\b%\u0010\bR\u0016\u0010'\u001a\u00020&8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b'\u0010(R\u0018\u0010*\u001a\u0004\u0018\u00010)8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b*\u0010+R\u0018\u0010-\u001a\u0004\u0018\u00010,8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u0010.R\u0018\u00100\u001a\u0004\u0018\u00010/8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b0\u00101R\u0018\u00102\u001a\u0004\u0018\u00010\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b2\u00103R\u0018\u0010\n\u001a\u0004\u0018\u00010\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\n\u00104R\u001b\u0010:\u001a\u0002058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b6\u00107\u001a\u0004\b8\u00109R\u001b\u0010?\u001a\u00020;8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b<\u00107\u001a\u0004\b=\u0010>R\u001b\u0010D\u001a\u00020@8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bA\u00107\u001a\u0004\bB\u0010C¨\u0006G"}, d2 = {"Lcom/xiaomi/fitness/trail/DimenTotalFragment;", "Lcom/xiaomi/fitness/baseui/view/BaseBindingFragment;", "Lcom/xiaomi/fitness/trail/viewmodel/DimTotalVM;", "Lkrp;", "", "force", "", "reqData", "(Z)V", "Lcom/xiaomi/fitness/trail/data/DimTotalData;", "data", "setViewData", "(Lcom/xiaomi/fitness/trail/data/DimTotalData;)V", "showDivingTotalPageIfNeed", "()V", "Landroid/view/View;", "view", "", "Lcom/xiaomi/fit/data/common/data/sport/SportBasicReport;", "divingReports", "", "divingPointIdSet", "requestDivingPointNames", "(Landroid/view/View;Ljava/util/List;Ljava/util/List;)V", "Lcom/xiaomi/fit/data/common/data/sport/SportSummary$SummaryData;", "summary", "setSpecificData", "(Lcom/xiaomi/fit/data/common/data/sport/SportSummary$SummaryData;)V", "setCountAllData", "setAllData", "showAllView", "showSpecificView", "Landroid/os/Bundle;", "savedInstanceState", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "visible", "onVisibilityChanged", "", "preCategory", "Ljava/lang/String;", "Lvpp;", "allBinding", "Lvpp;", "Lxpp;", "specificBinding", "Lxpp;", "Lcom/xiaomi/fitness/trail/holder/DivingTotalHolder;", "divingTotalHolder", "Lcom/xiaomi/fitness/trail/holder/DivingTotalHolder;", "mostFreqDivingPointId", "Ljava/lang/Integer;", "Lcom/xiaomi/fitness/trail/data/DimTotalData;", "Lcom/xiaomi/fitness/trail/viewmodel/RecordMainVM;", "activityVM$delegate", "Lkotlin/Lazy;", "getActivityVM", "()Lcom/xiaomi/fitness/trail/viewmodel/RecordMainVM;", "activityVM", "Lcom/xiaomi/fitness/trail/adapter/DurationAdapter;", "durationAdapter$delegate", "getDurationAdapter", "()Lcom/xiaomi/fitness/trail/adapter/DurationAdapter;", "durationAdapter", "Lcom/xiaomi/fitness/trail/adapter/RecordBestAdapter;", "bestAdapter$delegate", "getBestAdapter", "()Lcom/xiaomi/fitness/trail/adapter/RecordBestAdapter;", "bestAdapter", "<init>", "Companion", "sport-record_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nDimenTotalFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DimenTotalFragment.kt\ncom/xiaomi/fitness/trail/DimenTotalFragment\n+ 2 FragmentViewModelLazy.kt\nandroidx/fragment/app/FragmentViewModelLazyKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,331:1\n106#2,15:332\n1557#3:347\n1628#3,3:348\n1611#3,9:351\n1863#3:360\n1864#3:362\n1620#3:363\n774#3:364\n865#3,2:365\n1863#3,2:367\n1#4:361\n*S KotlinDebug\n*F\n+ 1 DimenTotalFragment.kt\ncom/xiaomi/fitness/trail/DimenTotalFragment\n*L\n77#1:332,15\n94#1:347\n94#1:348,3\n205#1:351,9\n205#1:360\n205#1:362\n205#1:363\n206#1:364\n206#1:365,2\n210#1:367,2\n205#1:361\n*E\n"})
public final class DimenTotalFragment extends Hilt_DimenTotalFragment<DimTotalVM, krp> {
    public static final boolean SHOULD_RE_REQUEST_DIVE_POINT_AREA_ID = true;

    @NotNull
    public static final String TAG = "DimenTotalFragment";

    /* JADX INFO: renamed from: activityVM$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy activityVM;

    @Nullable
    private vpp allBinding;

    /* JADX INFO: renamed from: bestAdapter$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy bestAdapter;

    @Nullable
    private DimTotalData data;

    @Nullable
    private DivingTotalHolder divingTotalHolder;

    /* JADX INFO: renamed from: durationAdapter$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy durationAdapter;

    @Nullable
    private Integer mostFreqDivingPointId;

    @NotNull
    private String preCategory;

    @Nullable
    private xpp specificBinding;

    /* JADX INFO: renamed from: com.xiaomi.fitness.trail.DimenTotalFragment$onViewCreated$5, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", ""}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.trail.DimenTotalFragment$onViewCreated$5", f = "DimenTotalFragment.kt", i = {}, l = {118}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass5 extends SuspendLambda implements Function1<Continuation<? super Unit>, Object> {
        int label;

        public AnonymousClass5(Continuation<? super AnonymousClass5> continuation) {
            super(1, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Continuation<?> continuation) {
            return DimenTotalFragment.this.new AnonymousClass5(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                MutableStateFlow<String> categoryEmitter = DimenTotalFragment.this.getActivityVM().getCategoryEmitter();
                final DimenTotalFragment dimenTotalFragment = DimenTotalFragment.this;
                FlowCollector<? super String> flowCollector = new FlowCollector() { // from class: com.xiaomi.fitness.trail.DimenTotalFragment.onViewCreated.5.1
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                        return emit((String) obj2, (Continuation<? super Unit>) continuation);
                    }

                    public final Object emit(String str, Continuation<? super Unit> continuation) {
                        if (dimenTotalFragment.isVisible()) {
                            DimenTotalFragment.reqData$default(dimenTotalFragment, false, 1, null);
                        }
                        return Unit.INSTANCE;
                    }
                };
                this.label = 1;
                if (categoryEmitter.collect(flowCollector, this) == coroutine_suspended) {
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

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(Continuation<? super Unit> continuation) {
            return ((AnonymousClass5) create(continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.trail.DimenTotalFragment$onViewCreated$6, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", ""}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.trail.DimenTotalFragment$onViewCreated$6", f = "DimenTotalFragment.kt", i = {}, l = {122}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass6 extends SuspendLambda implements Function1<Continuation<? super Unit>, Object> {
        int label;

        public AnonymousClass6(Continuation<? super AnonymousClass6> continuation) {
            super(1, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Continuation<?> continuation) {
            return DimenTotalFragment.this.new AnonymousClass6(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                final Ref.BooleanRef booleanRef = new Ref.BooleanRef();
                booleanRef.element = true;
                Flow<Integer> flowObserverRecentCount = FitnessDataExtKt.getInstance(FitnessDataGetter.INSTANCE).observerRecentCount(CourseApiKt.getCOURSE_TAG_TIME_SEC());
                final DimenTotalFragment dimenTotalFragment = DimenTotalFragment.this;
                FlowCollector<? super Integer> flowCollector = new FlowCollector() { // from class: com.xiaomi.fitness.trail.DimenTotalFragment.onViewCreated.6.1
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                        return emit(((Number) obj2).intValue(), (Continuation<? super Unit>) continuation);
                    }

                    public final Object emit(int i2, Continuation<? super Unit> continuation) {
                        Logger.i("SRecordDimTotalFra", "tab report count = " + i2 + " , first = " + booleanRef.element);
                        Ref.BooleanRef booleanRef2 = booleanRef;
                        if (booleanRef2.element) {
                            booleanRef2.element = false;
                        } else {
                            dimenTotalFragment.reqData(true);
                        }
                        return Unit.INSTANCE;
                    }
                };
                this.label = 1;
                if (flowObserverRecentCount.collect(flowCollector, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(Continuation<? super Unit> continuation) {
            return ((AnonymousClass6) create(continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    public DimenTotalFragment() {
        super(ivi.H2);
        this.preCategory = "";
        final Function0 function0 = new Function0() { // from class: ww6
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return DimenTotalFragment.activityVM_delegate$lambda$0(this.f38419a);
            }
        };
        final Lazy lazy = LazyKt__LazyJVMKt.lazy(LazyThreadSafetyMode.NONE, (Function0) new Function0<ViewModelStoreOwner>() { // from class: com.xiaomi.fitness.trail.DimenTotalFragment$special$$inlined$viewModels$default$1
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
        this.activityVM = FragmentViewModelLazyKt.createViewModelLazy(this, Reflection.getOrCreateKotlinClass(RecordMainVM.class), new Function0<ViewModelStore>() { // from class: com.xiaomi.fitness.trail.DimenTotalFragment$special$$inlined$viewModels$default$2
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
        }, new Function0<CreationExtras>() { // from class: com.xiaomi.fitness.trail.DimenTotalFragment$special$$inlined$viewModels$default$3
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.xiaomi.fitness.trail.DimenTotalFragment$special$$inlined$viewModels$default$4
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
        this.durationAdapter = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: xw6
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return DimenTotalFragment.durationAdapter_delegate$lambda$1();
            }
        });
        this.bestAdapter = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: yw6
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return DimenTotalFragment.bestAdapter_delegate$lambda$3(this.f40635a);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ViewModelStoreOwner activityVM_delegate$lambda$0(DimenTotalFragment this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        FragmentActivity fragmentActivityRequireActivity = this$0.requireActivity();
        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
        return fragmentActivityRequireActivity;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final RecordBestAdapter bestAdapter_delegate$lambda$3(final DimenTotalFragment this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Context contextRequireContext = this$0.requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        return new RecordBestAdapter(contextRequireContext, new Function1() { // from class: ax6
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return DimenTotalFragment.bestAdapter_delegate$lambda$3$lambda$2(this.f3534a, (SportSummary.MaxData) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit bestAdapter_delegate$lambda$3$lambda$2(DimenTotalFragment this$0, SportSummary.MaxData data) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(data, "data");
        if (data.report == null || data.key == null) {
            return Unit.INSTANCE;
        }
        Bundle bundle = new Bundle();
        bundle.putLong("time_stamp", data.key.time);
        bundle.putSerializable("sport_report", data.report);
        bundle.putInt("sport_type", lp5.a(data.report));
        bundle.putString("sport_source", "workout_list_page");
        SportRecordApi sportRecordApi = SportRecordApiKt.getSportRecordApi();
        Context contextRequireContext = this$0.requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        SportBasicReport report = data.report;
        Intrinsics.checkNotNullExpressionValue(report, "report");
        sportRecordApi.goSportDetail(contextRequireContext, bundle, (ActivityOptions) null, report);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DurationAdapter durationAdapter_delegate$lambda$1() {
        return new DurationAdapter();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final RecordMainVM getActivityVM() {
        return (RecordMainVM) this.activityVM.getValue();
    }

    private final RecordBestAdapter getBestAdapter() {
        return (RecordBestAdapter) this.bestAdapter.getValue();
    }

    private final DurationAdapter getDurationAdapter() {
        return (DurationAdapter) this.durationAdapter.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onViewCreated$lambda$6(DimenTotalFragment this$0, ViewStub viewStub, View view) {
        RecyclerView recyclerView;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        vpp vppVar = (vpp) sk5.c(view);
        this$0.allBinding = vppVar;
        if (vppVar == null || (recyclerView = vppVar.B) == null) {
            return;
        }
        recyclerView.addItemDecoration(new LinearItemSpace(ExtUtilsKt.getDp(10), false, false, 2, null));
        recyclerView.setAdapter(this$0.getDurationAdapter());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onViewCreated$lambda$7(DimenTotalFragment this$0, ViewStub viewStub, View view) {
        RecyclerView recyclerView;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.specificBinding = (xpp) sk5.c(view);
        this$0.getBestAdapter().setCategory(this$0.getActivityVM().getCategory());
        xpp xppVar = this$0.specificBinding;
        if (xppVar == null || (recyclerView = xppVar.B) == null) {
            return;
        }
        recyclerView.setAdapter(this$0.getBestAdapter());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$8(DimenTotalFragment this$0, DimTotalData dimTotalData) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNull(dimTotalData);
        this$0.setViewData(dimTotalData);
        this$0.data = dimTotalData;
        this$0.showDivingTotalPageIfNeed();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$9(DimenTotalFragment this$0, Boolean bool) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        reqData$default(this$0, false, 1, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final void reqData(boolean force) {
        LinearLayout contentView = ((krp) getMBinding()).D;
        Intrinsics.checkNotNullExpressionValue(contentView, "contentView");
        ViewExtKt.invisible(contentView);
        Logger.d("SRecordDimTotalFra", "reqData: " + getActivityVM().getCategory());
        ((DimTotalVM) getMViewModel()).getSummaryData(getActivityVM().getCategory(), force);
        Logger.i(TAG, "onViewCreated category=" + getActivityVM().getCategory());
        this.preCategory = getActivityVM().getCategory();
    }

    public static /* synthetic */ void reqData$default(DimenTotalFragment dimenTotalFragment, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        dimenTotalFragment.reqData(z);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void requestDivingPointNames(View view, final List<SportBasicReport> divingReports, List<Integer> divingPointIdSet) {
        if (view == null) {
            return;
        }
        ((DimTotalVM) getMViewModel()).getDivingPointDetailMapLiveData(divingPointIdSet).observe(getViewLifecycleOwner(), new DimenTotalFragmentKt$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: rw6
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return DimenTotalFragment.requestDivingPointNames$lambda$18(divingReports, this, (Map) obj);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit requestDivingPointNames$lambda$18(List divingReports, final DimenTotalFragment this$0, Map map) {
        String string;
        Intrinsics.checkNotNullParameter(divingReports, "$divingReports");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Logger.i(TAG, "getDivingPointDetailMapLiveData map=" + map);
        int size = divingReports.size();
        float maxDivingDepth = DiveStatisticsExtKt.getMaxDivingDepth(divingReports);
        int visitedDivingPointCount = DiveStatisticsExtKt.getVisitedDivingPointCount(divingReports);
        int visitedRegionCount = DiveStatisticsExtKt.getVisitedRegionCount(divingReports);
        int mostFrequentlyVisitedDivingPointId = DiveStatisticsExtKt.getMostFrequentlyVisitedDivingPointId(divingReports);
        DivingTotalHolder divingTotalHolder = this$0.divingTotalHolder;
        if (divingTotalHolder != null) {
            if (map == null || (string = (String) map.get(Integer.valueOf(mostFrequentlyVisitedDivingPointId))) == null) {
                string = this$0.getString(j1j.Aa);
                Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            }
            String str = string;
            FragmentActivity fragmentActivityRequireActivity = this$0.requireActivity();
            Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
            divingTotalHolder.initHolder(size, maxDivingDepth, visitedRegionCount, visitedDivingPointCount, str, fragmentActivityRequireActivity, new Function1() { // from class: zw6
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj) {
                    return DimenTotalFragment.requestDivingPointNames$lambda$18$lambda$17(this.f41741a, (SportBasicReport) obj);
                }
            });
        }
        DivingTotalHolder divingTotalHolder2 = this$0.divingTotalHolder;
        if (divingTotalHolder2 != null) {
            divingTotalHolder2.refreshAdapterData(divingReports, map);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit requestDivingPointNames$lambda$18$lambda$17(DimenTotalFragment this$0, SportBasicReport it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        ((DimTotalVM) this$0.getMViewModel()).deleteDivingRecord(it);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void setAllData(SportSummary.SummaryData summary) {
        TextView totalLabel2 = ((krp) getMBinding()).O;
        Intrinsics.checkNotNullExpressionValue(totalLabel2, "totalLabel2");
        ViewExtKt.visible(totalLabel2);
        TextView totalView2 = ((krp) getMBinding()).Q;
        Intrinsics.checkNotNullExpressionValue(totalView2, "totalView2");
        ViewExtKt.visible(totalView2);
        ((krp) getMBinding()).N.setText(j1j.pa);
        ((krp) getMBinding()).O.setText(j1j.na);
        TextView totalView1 = ((krp) getMBinding()).P;
        Intrinsics.checkNotNullExpressionValue(totalView1, "totalView1");
        String distanceStrWithoutUnit = RecordUtilKt.getDistanceStrWithoutUnit(summary.total_distance, 1);
        String strG = pz6.g(summary.total_distance);
        Intrinsics.checkNotNullExpressionValue(strG, "getDistanceUnit(...)");
        RecordUtilKt.setDataFormat(totalView1, distanceStrWithoutUnit, strG, 14);
        TextView totalView3 = ((krp) getMBinding()).Q;
        Intrinsics.checkNotNullExpressionValue(totalView3, "totalView2");
        RecordUtilKt.setDataStr$default(totalView3, ValueType.CALORIE.INSTANCE, String.valueOf(summary.total_calorie), 14, 0, 16, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void setCountAllData(SportSummary.SummaryData summary) {
        TextView totalLabel2 = ((krp) getMBinding()).O;
        Intrinsics.checkNotNullExpressionValue(totalLabel2, "totalLabel2");
        ViewExtKt.visible(totalLabel2);
        TextView totalView2 = ((krp) getMBinding()).Q;
        Intrinsics.checkNotNullExpressionValue(totalView2, "totalView2");
        ViewExtKt.visible(totalView2);
        ((krp) getMBinding()).N.setText(j1j.oa);
        ((krp) getMBinding()).O.setText(j1j.na);
        TextView totalView1 = ((krp) getMBinding()).P;
        Intrinsics.checkNotNullExpressionValue(totalView1, "totalView1");
        String strValueOf = String.valueOf(summary.total_accessory_count);
        String quantityString = getResources().getQuantityString(byi.v, summary.total_accessory_count, "");
        Intrinsics.checkNotNullExpressionValue(quantityString, "getQuantityString(...)");
        RecordUtilKt.setDataFormat(totalView1, strValueOf, quantityString, 14);
        TextView totalView3 = ((krp) getMBinding()).Q;
        Intrinsics.checkNotNullExpressionValue(totalView3, "totalView2");
        RecordUtilKt.setDataStr$default(totalView3, ValueType.CALORIE.INSTANCE, String.valueOf(summary.total_calorie), 14, 0, 16, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void setSpecificData(SportSummary.SummaryData summary) {
        SportCategory.Companion companion = SportCategory.INSTANCE;
        if (companion.showDistance(getActivityVM().getCategory())) {
            setAllData(summary);
            return;
        }
        if (companion.showCount(getActivityVM().getCategory())) {
            setCountAllData(summary);
            return;
        }
        TextView totalLabel2 = ((krp) getMBinding()).O;
        Intrinsics.checkNotNullExpressionValue(totalLabel2, "totalLabel2");
        ViewExtKt.gone(totalLabel2);
        TextView totalView2 = ((krp) getMBinding()).Q;
        Intrinsics.checkNotNullExpressionValue(totalView2, "totalView2");
        ViewExtKt.gone(totalView2);
        ((krp) getMBinding()).N.setText(j1j.na);
        TextView totalView1 = ((krp) getMBinding()).P;
        Intrinsics.checkNotNullExpressionValue(totalView1, "totalView1");
        RecordUtilKt.setDataStr$default(totalView1, ValueType.CALORIE.INSTANCE, String.valueOf(summary.total_calorie), 14, 0, 16, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void setViewData(DimTotalData data) {
        View root;
        View root2;
        View root3;
        View root4;
        SportSummary.SummaryData summaryData;
        SportSummary summary = data.getSummary();
        if ((summary != null ? summary.info : null) == null) {
            LinearLayout contentView = ((krp) getMBinding()).D;
            Intrinsics.checkNotNullExpressionValue(contentView, "contentView");
            ViewExtKt.invisible(contentView);
            return;
        }
        LinearLayout contentView2 = ((krp) getMBinding()).D;
        Intrinsics.checkNotNullExpressionValue(contentView2, "contentView");
        ViewExtKt.visible(contentView2);
        String category = getActivityVM().getCategory();
        boolean zAreEqual = Intrinsics.areEqual(category, "sport_stats_all");
        SportSummary summary2 = data.getSummary();
        if (summary2 != null && (summaryData = summary2.info) != null) {
            TextView textView = ((krp) getMBinding()).I;
            Resources resources = getResources();
            int i = byi.W;
            int i2 = summaryData.total_count;
            textView.setText(resources.getQuantityString(i, i2, Integer.valueOf(i2)));
            ((krp) getMBinding()).F.setText(RecordUtilKt.formatDuration(summaryData.total_duration));
            ((krp) getMBinding()).F.setContentDescription(TimeDateUtil.getDurationHrMinSecInMills(ApplicationExtKt.getApplication(), summaryData.total_duration * ((long) 1000)));
            if (zAreEqual) {
                setAllData(summaryData);
            } else {
                setSpecificData(summaryData);
            }
        }
        if (!zAreEqual) {
            vpp vppVar = this.allBinding;
            if (vppVar != null && (root2 = vppVar.getRoot()) != null) {
                ViewExtKt.gone(root2);
            }
            xpp xppVar = this.specificBinding;
            if (xppVar != null && (root = xppVar.getRoot()) != null) {
                ViewExtKt.gone(root);
            }
            SportSummary summary3 = data.getSummary();
            List<SportSummary.MaxData> maxList = RecordUtilKt.getMaxList(summary3 != null ? summary3.info : null, category);
            if (!maxList.isEmpty()) {
                getBestAdapter().setData(maxList);
                showSpecificView();
                return;
            }
            return;
        }
        xpp xppVar2 = this.specificBinding;
        if (xppVar2 != null && (root4 = xppVar2.getRoot()) != null) {
            ViewExtKt.gone(root4);
        }
        vpp vppVar2 = this.allBinding;
        if (vppVar2 != null && (root3 = vppVar2.getRoot()) != null) {
            ViewExtKt.gone(root3);
        }
        List<SportPercent> durationList = data.getDurationList();
        List<SportPercent> list = durationList;
        if (list == null || list.isEmpty()) {
            return;
        }
        showAllView();
        getDurationAdapter().setData(durationList);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void showAllView() {
        View root;
        ixq ixqVar = ((krp) getMBinding()).B;
        if (!ixqVar.i()) {
            ViewStub viewStubH = ixqVar.h();
            if (viewStubH != null) {
                viewStubH.inflate();
                return;
            }
            return;
        }
        vpp vppVar = this.allBinding;
        if (vppVar == null || (root = vppVar.getRoot()) == null) {
            return;
        }
        ViewExtKt.visible(root);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void showDivingTotalPageIfNeed() {
        if (!Intrinsics.areEqual(getActivityVM().getCategory(), "diving")) {
            View root = ((krp) getMBinding()).M.getRoot();
            Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
            ViewExtKt.gone(root);
            LinearLayout commonLayout = ((krp) getMBinding()).C;
            Intrinsics.checkNotNullExpressionValue(commonLayout, "commonLayout");
            ViewExtKt.visible(commonLayout);
            return;
        }
        View root2 = ((krp) getMBinding()).M.getRoot();
        Intrinsics.checkNotNullExpressionValue(root2, "getRoot(...)");
        ViewExtKt.visible(root2);
        LinearLayout commonLayout2 = ((krp) getMBinding()).C;
        Intrinsics.checkNotNullExpressionValue(commonLayout2, "commonLayout");
        ViewExtKt.gone(commonLayout2);
        Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        mrp totalDivingView = ((krp) getMBinding()).M;
        Intrinsics.checkNotNullExpressionValue(totalDivingView, "totalDivingView");
        this.divingTotalHolder = new DivingTotalHolder(contextRequireContext, totalDivingView);
        ((DimTotalVM) getMViewModel()).getAllSportReportByCategory("diving");
        ((DimTotalVM) getMViewModel()).getDivingReportListLiveData().observe(getViewLifecycleOwner(), new DimenTotalFragmentKt$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: sw6
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return DimenTotalFragment.showDivingTotalPageIfNeed$lambda$16(this.f34049a, (List) obj);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit showDivingTotalPageIfNeed$lambda$16(final DimenTotalFragment this$0, final List list) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNull(list);
        List list2 = list;
        ArrayList arrayList = new ArrayList();
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            Integer divingAreaId = ((SportBasicReport) it.next()).getDivingAreaId();
            if (divingAreaId != null) {
                arrayList.add(divingAreaId);
            }
        }
        final List<Integer> listDistinct = CollectionsKt___CollectionsKt.distinct(arrayList);
        ArrayList<SportBasicReport> arrayList2 = new ArrayList();
        for (Object obj : list2) {
            if (((SportBasicReport) obj).getDivingAreaId() == null) {
                arrayList2.add(obj);
            }
        }
        Logger.i(TAG, "divingPointIdSet=" + listDistinct + " unrecognizedIdReports=" + arrayList2);
        if (!arrayList2.isEmpty()) {
            for (final SportBasicReport sportBasicReport : arrayList2) {
                Float waterInletLatitude = sportBasicReport.getWaterInletLatitude();
                float fFloatValue = -1.0f;
                float fFloatValue2 = waterInletLatitude != null ? waterInletLatitude.floatValue() : -1.0f;
                Float waterInletLongitude = sportBasicReport.getWaterInletLongitude();
                DivingPosition divingPosition = new DivingPosition(fFloatValue2, waterInletLongitude != null ? waterInletLongitude.floatValue() : -1.0f);
                Float waterOutletLatitude = sportBasicReport.getWaterOutletLatitude();
                float fFloatValue3 = waterOutletLatitude != null ? waterOutletLatitude.floatValue() : -1.0f;
                Float waterOutletLongitude = sportBasicReport.getWaterOutletLongitude();
                if (waterOutletLongitude != null) {
                    fFloatValue = waterOutletLongitude.floatValue();
                }
                new SportHttpRequest().getDivingIDData(new DivingOutInPosition(divingPosition, new DivingPosition(fFloatValue3, fFloatValue)), new Function1() { // from class: bx6
                    @Override // kotlin.jvm.functions.Function1
                    /* JADX INFO: renamed from: invoke */
                    public final Object invoke2(Object obj2) {
                        return DimenTotalFragment.showDivingTotalPageIfNeed$lambda$16$lambda$15$lambda$13(sportBasicReport, listDistinct, this$0, list, (OneDivingIdReport) obj2);
                    }
                }, new Function1() { // from class: qw6
                    @Override // kotlin.jvm.functions.Function1
                    /* JADX INFO: renamed from: invoke */
                    public final Object invoke2(Object obj2) {
                        return DimenTotalFragment.showDivingTotalPageIfNeed$lambda$16$lambda$15$lambda$14(this.f31903a, list, listDistinct, (String) obj2);
                    }
                });
            }
        } else {
            this$0.requestDivingPointNames(this$0.getView(), list, listDistinct);
        }
        Logger.i(TAG, "getAllSportReportByCategoryLiveData mostFreqDivingPointId=" + this$0.mostFreqDivingPointId);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit showDivingTotalPageIfNeed$lambda$16$lambda$15$lambda$13(SportBasicReport report, List divingPointIdSet, DimenTotalFragment this$0, List list, OneDivingIdReport it) {
        Intrinsics.checkNotNullParameter(report, "$report");
        Intrinsics.checkNotNullParameter(divingPointIdSet, "$divingPointIdSet");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        report.setDivingAreaId(Integer.valueOf(it.getDiveAreaId()));
        report.setDivingCountryId(Integer.valueOf(it.getDiveCountryId()));
        ListExtKt.add(divingPointIdSet, Integer.valueOf(it.getDiveAreaId()));
        View view = this$0.getView();
        Intrinsics.checkNotNull(list);
        this$0.requestDivingPointNames(view, list, divingPointIdSet);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit showDivingTotalPageIfNeed$lambda$16$lambda$15$lambda$14(DimenTotalFragment this$0, List list, List divingPointIdSet, String it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(divingPointIdSet, "$divingPointIdSet");
        Intrinsics.checkNotNullParameter(it, "it");
        View view = this$0.getView();
        Intrinsics.checkNotNull(list);
        this$0.requestDivingPointNames(view, list, divingPointIdSet);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void showSpecificView() {
        View root;
        ixq ixqVar = ((krp) getMBinding()).K;
        if (!ixqVar.i()) {
            ViewStub viewStubH = ixqVar.h();
            if (viewStubH != null) {
                viewStubH.inflate();
                return;
            }
            return;
        }
        xpp xppVar = this.specificBinding;
        if (xppVar == null || (root = xppVar.getRoot()) == null) {
            return;
        }
        ViewExtKt.visible(root);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.xiaomi.fitness.baseui.view.BaseBindingFragment, com.xiaomi.fitness.baseui.view.BaseViewModelFragment, com.xiaomi.fitness.baseui.view.BaseFragment, miuix.appcompat.app.Fragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        DimTotalVM dimTotalVM = (DimTotalVM) getMViewModel();
        List<SportCategoryData> categoryList = getActivityVM().getCategoryList();
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(categoryList, 10));
        Iterator<T> it = categoryList.iterator();
        while (it.hasNext()) {
            arrayList.add(((SportCategoryData) it.next()).getKey());
        }
        dimTotalVM.setCategoryList(arrayList);
        wc0 miuiActionBar = getMiuiActionBar();
        if (miuiActionBar != null) {
            miuiActionBar.hide();
        }
        ((krp) getMBinding()).L.setText(getString(j1j.la, TimeDateUtil.getDateYYYYMMddLocalFormat(getActivityVM().getStartMills())));
        ((krp) getMBinding()).B.setOnInflateListener(new ViewStub.OnInflateListener() { // from class: pw6
            @Override // android.view.ViewStub.OnInflateListener
            public final void onInflate(ViewStub viewStub, View view2) {
                DimenTotalFragment.onViewCreated$lambda$6(this.f30852a, viewStub, view2);
            }
        });
        ((krp) getMBinding()).K.setOnInflateListener(new ViewStub.OnInflateListener() { // from class: tw6
            @Override // android.view.ViewStub.OnInflateListener
            public final void onInflate(ViewStub viewStub, View view2) {
                DimenTotalFragment.onViewCreated$lambda$7(this.f35123a, viewStub, view2);
            }
        });
        ((DimTotalVM) getMViewModel()).getEmitter().observe(getViewLifecycleOwner(), new DimenTotalFragmentKt$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: uw6
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return DimenTotalFragment.onViewCreated$lambda$8(this.f36208a, (DimTotalData) obj);
            }
        }));
        launchOnLifecycleScope(new AnonymousClass5(null));
        launchOnLifecycleScope(new AnonymousClass6(null));
        ((DimTotalVM) getMViewModel()).getDeleteResult().observe(getViewLifecycleOwner(), new DimenTotalFragmentKt$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: vw6
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return DimenTotalFragment.onViewCreated$lambda$9(this.f37297a, (Boolean) obj);
            }
        }));
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseFragment, miuix.appcompat.app.Fragment
    public void onVisibilityChanged(boolean visible) {
        super.onVisibilityChanged(visible);
        if (!visible || Intrinsics.areEqual(this.preCategory, getActivityVM().getCategory())) {
            return;
        }
        Logger.d("SRecordDimTotalFra", "onHiddenChanged: category changed: " + getActivityVM().getCategory());
        getBestAdapter().setCategory(getActivityVM().getCategory());
        reqData$default(this, false, 1, null);
    }
}
