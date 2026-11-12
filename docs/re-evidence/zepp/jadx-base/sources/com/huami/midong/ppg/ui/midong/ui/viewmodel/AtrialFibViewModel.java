package com.huami.midong.ppg.ui.midong.ui.viewmodel;

import androidx.p008lifecycle.MutableLiveData;
import androidx.p008lifecycle.ViewModel;
import androidx.p008lifecycle.ViewModelKt;
import com.huami.health.afppg.koin.KoinModuleKt;
import com.huami.health.afppg.model.AtrialFibrillation;
import com.huami.health.afppg.usecase.GetAfibListUseCase;
import com.huami.midong.ppg.ui.midong.ui.util.AtrialUtils;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collection;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.e;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.koin.core.qualifier.Qualifier;
import org.koin.core.scope.Scope;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 \u001d2\u00020\u0001:\u0001\u001dB\u0007¢\u0006\u0004\b\u001b\u0010\u001cJ2\u0010\u000b\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0018\u0010\n\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0004\u0012\u00020\t0\u0006H\u0002J\u000e\u0010\u000e\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\fJ\u000e\u0010\u000f\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u0002J\u0006\u0010\u000e\u001a\u00020\tJ\u0016\u0010\u000e\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0002R\u001d\u0010\u0016\u001a\u00020\u00128B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u0015R)\u0010\u001a\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u00178F@\u0006X\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u000b\u0010\u0014\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001e"}, d2 = {"Lcom/huami/midong/ppg/ui/midong/ui/viewmodel/AtrialFibViewModel;", "Landroidx/lifecycle/ViewModel;", "", "timestamp", "", "count", "Lkotlin/Function1;", "", "Lcom/huami/health/afppg/model/AtrialFibrillation;", "", "onFinished", "b", "Ljava/util/Calendar;", "date", "loadAtrialFib", "loadMore", "from", "to", "Lcom/huami/health/afppg/usecase/GetAfibListUseCase;", "a", "Lkotlin/Lazy;", "()Lcom/huami/health/afppg/usecase/GetAfibListUseCase;", "atrialRepo", "Landroidx/lifecycle/MutableLiveData;", "getFibItems", "()Landroidx/lifecycle/MutableLiveData;", "fibItems", "<init>", "()V", "Companion", "afppg-ui-midong_release"}, k = 1, mv = {1, 5, 1})
public final class AtrialFibViewModel extends ViewModel {
    public static final int LOAD_MORE_DEFAULT_LIMIT = 30;
    private static final int d = 300000;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final Lazy atrialRepo;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final Lazy fibItems;

    @NotNull
    private static final String c = "AtrialFibViewModel";

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\n"}, d2 = {"Landroidx/lifecycle/MutableLiveData;", "", "Lcom/huami/health/afppg/model/AtrialFibrillation;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<MutableLiveData<List<? extends AtrialFibrillation>>> {
        public static final a a = new a();

        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final MutableLiveData<List<AtrialFibrillation>> invoke() {
            return new MutableLiveData<>();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.midong.ppg.ui.midong.ui.viewmodel.AtrialFibViewModel$loadAtrialFib$1", f = "AtrialFibViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class b extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n"}, d2 = {"", "Lcom/huami/health/afppg/model/AtrialFibrillation;", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class a extends Lambda implements Function1<List<? extends AtrialFibrillation>, Unit> {
            public final /* synthetic */ List<AtrialFibrillation> a;
            public final /* synthetic */ AtrialFibViewModel b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(List<AtrialFibrillation> list, AtrialFibViewModel atrialFibViewModel) {
                super(1);
                this.a = list;
                this.b = atrialFibViewModel;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(List<? extends AtrialFibrillation> list) {
                invoke2((List<AtrialFibrillation>) list);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull List<AtrialFibrillation> list) {
                this.a.addAll(list);
                this.b.getFibItems().postValue(this.a);
            }
        }

        public b(Continuation<? super b> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return AtrialFibViewModel.this.new b(continuation);
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
            List<AtrialFibrillation> value = AtrialFibViewModel.this.getFibItems().getValue();
            List mutableList = value == null ? null : CollectionsKt___CollectionsKt.toMutableList((Collection) value);
            if (mutableList == null) {
                mutableList = new ArrayList();
            }
            AtrialFibViewModel.this.a().execute(0L, AtrialUtils.INSTANCE.currentTimeStamp(), Integer.MAX_VALUE, new a(mutableList, AtrialFibViewModel.this));
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.midong.ppg.ui.midong.ui.viewmodel.AtrialFibViewModel$loadAtrialFib$2", f = "AtrialFibViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class c extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ long c;
        public final /* synthetic */ long d;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n"}, d2 = {"", "Lcom/huami/health/afppg/model/AtrialFibrillation;", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class a extends Lambda implements Function1<List<? extends AtrialFibrillation>, Unit> {
            public final /* synthetic */ List<AtrialFibrillation> a;
            public final /* synthetic */ AtrialFibViewModel b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(List<AtrialFibrillation> list, AtrialFibViewModel atrialFibViewModel) {
                super(1);
                this.a = list;
                this.b = atrialFibViewModel;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(List<? extends AtrialFibrillation> list) {
                invoke2((List<AtrialFibrillation>) list);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull List<AtrialFibrillation> list) {
                this.a.addAll(list);
                this.b.getFibItems().postValue(this.a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(long j, long j2, Continuation<? super c> continuation) {
            super(2, continuation);
            this.c = j;
            this.d = j2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return AtrialFibViewModel.this.new c(this.c, this.d, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((c) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            if (this.a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            List<AtrialFibrillation> value = AtrialFibViewModel.this.getFibItems().getValue();
            List mutableList = value == null ? null : CollectionsKt___CollectionsKt.toMutableList((Collection) value);
            if (mutableList == null) {
                mutableList = new ArrayList();
            }
            AtrialFibViewModel.this.a().execute(this.c, this.d, Integer.MAX_VALUE, new a(mutableList, AtrialFibViewModel.this));
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.midong.ppg.ui.midong.ui.viewmodel.AtrialFibViewModel$loadMore$1", f = "AtrialFibViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class d extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ long c;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n"}, d2 = {"", "Lcom/huami/health/afppg/model/AtrialFibrillation;", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class a extends Lambda implements Function1<List<? extends AtrialFibrillation>, Unit> {
            public final /* synthetic */ List<AtrialFibrillation> a;
            public final /* synthetic */ AtrialFibViewModel b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(List<AtrialFibrillation> list, AtrialFibViewModel atrialFibViewModel) {
                super(1);
                this.a = list;
                this.b = atrialFibViewModel;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(List<? extends AtrialFibrillation> list) {
                invoke2((List<AtrialFibrillation>) list);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull List<AtrialFibrillation> list) {
                this.a.addAll(list);
                this.b.getFibItems().postValue(this.a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(long j, Continuation<? super d> continuation) {
            super(2, continuation);
            this.c = j;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return AtrialFibViewModel.this.new d(this.c, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((d) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            if (this.a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            List<AtrialFibrillation> value = AtrialFibViewModel.this.getFibItems().getValue();
            List mutableList = value == null ? null : CollectionsKt___CollectionsKt.toMutableList((Collection) value);
            if (mutableList == null) {
                mutableList = new ArrayList();
            }
            AtrialFibViewModel.this.a().execute(0L, this.c, 30, new a(mutableList, AtrialFibViewModel.this));
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AtrialFibViewModel() {
        final Scope scopePpgScope = KoinModuleKt.ppgScope();
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.SYNCHRONIZED;
        final Qualifier qualifier = null;
        final Object[] objArr = 0 == true ? 1 : 0;
        this.atrialRepo = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyMode, (Function0) new Function0<GetAfibListUseCase>() { // from class: com.huami.midong.ppg.ui.midong.ui.viewmodel.AtrialFibViewModel$special$$inlined$inject$default$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v1, types: [com.huami.health.afppg.usecase.GetAfibListUseCase, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final GetAfibListUseCase invoke() {
                return scopePpgScope.get(Reflection.getOrCreateKotlinClass(GetAfibListUseCase.class), qualifier, objArr);
            }
        });
        this.fibItems = LazyKt__LazyJVMKt.lazy(a.a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final GetAfibListUseCase a() {
        return (GetAfibListUseCase) this.atrialRepo.getValue();
    }

    private final void b(long timestamp, int count, Function1<? super List<AtrialFibrillation>, Unit> onFinished) {
        a().execute(timestamp, timestamp, count, onFinished);
    }

    @NotNull
    public final MutableLiveData<List<AtrialFibrillation>> getFibItems() {
        return (MutableLiveData) this.fibItems.getValue();
    }

    public final void loadAtrialFib(@NotNull Calendar date) {
        AtrialUtils atrialUtils = AtrialUtils.INSTANCE;
        long j = 300000;
        loadAtrialFib(atrialUtils.dayBegin(date) - j, atrialUtils.dayEnd(date) + j);
    }

    public final void loadMore(long timestamp) {
        e.f(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), null, new d(timestamp, null), 2, null);
    }

    public final void loadAtrialFib() {
        e.f(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), null, new b(null), 2, null);
    }

    public final void loadAtrialFib(long from, long to) {
        e.f(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), null, new c(from, to, null), 2, null);
    }
}
