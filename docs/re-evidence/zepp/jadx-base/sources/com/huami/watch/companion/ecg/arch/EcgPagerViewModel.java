package com.huami.watch.companion.ecg.arch;

import android.app.Application;
import androidx.p008lifecycle.AndroidViewModel;
import androidx.p008lifecycle.MediatorLiveData;
import androidx.p008lifecycle.MutableLiveData;
import androidx.p008lifecycle.ViewModelKt;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.ecg.EcgDataRepo;
import com.huami.ecg.core.db.EcgDataBase;
import com.huami.ecg.core.db.dao.EcgDao;
import com.huami.ecg.core.db.entity.EcgData;
import com.huami.ecg.core.model.EcgWebUrlKey;
import com.huami.watch.companion.arch.Result;
import com.huami.watch.companion.ecg.analytics.EcgAnalyticsManagerKt;
import com.huami.watch.companion.ecg.ui.activity.MeDongAuthActivity;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes16.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010>\u001a\u00020=¢\u0006\u0004\b?\u0010@J\b\u0010\u0003\u001a\u00020\u0002H\u0002J;\u0010\n\u001a\u00020\u00022'\u0010\t\u001a#\b\u0001\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0004¢\u0006\u0002\b\bH\u0002ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000bJ\u000e\u0010\u000e\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\fJ\u000e\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u000fJ\u000e\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u0012J\u000e\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u0015J\u0006\u0010\u0018\u001a\u00020\u0002R\u001d\u0010\u001d\u001a\u00020\u00198B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0003\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001d\u0010!\u001a\u00020\u001e8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001b\u0010\u001a\u001a\u0004\b\u001f\u0010 R%\u0010'\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150#0\"8\u0006@\u0006¢\u0006\f\n\u0004\b\u001f\u0010$\u001a\u0004\b%\u0010&R\u0016\u0010*\u001a\u00020\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u0010)R\u001f\u0010/\u001a\b\u0012\u0004\u0012\u00020\f0+8\u0006@\u0006¢\u0006\f\n\u0004\b\n\u0010,\u001a\u0004\b-\u0010.R\u001f\u00102\u001a\b\u0012\u0004\u0012\u00020\u000f0+8\u0006@\u0006¢\u0006\f\n\u0004\b0\u0010,\u001a\u0004\b1\u0010.R\u001f\u00105\u001a\b\u0012\u0004\u0012\u00020\u000f0+8\u0006@\u0006¢\u0006\f\n\u0004\b3\u0010,\u001a\u0004\b4\u0010.R\u001f\u00108\u001a\b\u0012\u0004\u0012\u00020\u00150+8\u0006@\u0006¢\u0006\f\n\u0004\b6\u0010,\u001a\u0004\b7\u0010.R\u001f\u0010<\u001a\b\u0012\u0004\u0012\u0002090\"8\u0006@\u0006¢\u0006\f\n\u0004\b:\u0010$\u001a\u0004\b;\u0010&\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006A"}, d2 = {"Lcom/huami/watch/companion/ecg/arch/EcgPagerViewModel;", "Landroidx/lifecycle/AndroidViewModel;", "", "a", "Lkotlin/Function2;", "Lkotlinx/coroutines/CoroutineScope;", "Lkotlin/coroutines/Continuation;", "", "Lkotlin/ExtensionFunctionType;", "func", "e", "(Lkotlin/jvm/functions/Function2;)V", "", "index", "setCurrentIndex", "", "isPre", "switchPage", "", MeDongAuthActivity.ARGS_ECG, "setEcgId", "Lcom/huami/ecg/core/db/entity/EcgData;", EcgAnalyticsManagerKt.ECG, "deleteEcg", "analysisEcg", "Lcom/huami/ecg/core/db/dao/EcgDao;", "Lkotlin/Lazy;", "b", "()Lcom/huami/ecg/core/db/dao/EcgDao;", "ecgDao", "Lcom/huami/ecg/EcgDataRepo;", "c", "()Lcom/huami/ecg/EcgDataRepo;", "mEcgRepo", "Landroidx/lifecycle/MutableLiveData;", "Lcom/huami/watch/companion/arch/Result;", "Landroidx/lifecycle/MutableLiveData;", "getDeleteEcgLiveData", "()Landroidx/lifecycle/MutableLiveData;", "deleteEcgLiveData", GoogleApiAvailabilityLight.a, "J", "mCurrentEcgId", "Landroidx/lifecycle/MediatorLiveData;", "Landroidx/lifecycle/MediatorLiveData;", "getCurrentIndexData", "()Landroidx/lifecycle/MediatorLiveData;", "currentIndexData", "f", "getHasPreData", "hasPreData", "g", "getHasNextData", "hasNextData", "h", "getCurrentEcgData", "currentEcgData", "", "i", "getAnalysisUrl", "analysisUrl", "Landroid/app/Application;", "app", "<init>", "(Landroid/app/Application;)V", "ecg-companion_release"}, k = 1, mv = {1, 5, 1})
public final class EcgPagerViewModel extends AndroidViewModel {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final Lazy ecgDao;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final Lazy mEcgRepo;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final MutableLiveData<Result<EcgData>> deleteEcgLiveData;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private long mCurrentEcgId;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    private final MediatorLiveData<Integer> currentIndexData;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    private final MediatorLiveData<Boolean> hasPreData;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    private final MediatorLiveData<Boolean> hasNextData;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @NotNull
    private final MediatorLiveData<EcgData> currentEcgData;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @NotNull
    private final MutableLiveData<String> analysisUrl;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.watch.companion.ecg.arch.EcgPagerViewModel$analysisEcg$1", f = "EcgPagerViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;

        public a(Continuation<? super a> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return EcgPagerViewModel.this.new a(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            if (this.a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            EcgData value = EcgPagerViewModel.this.getCurrentEcgData().getValue();
            if (value != null) {
                EcgPagerViewModel ecgPagerViewModel = EcgPagerViewModel.this;
                ecgPagerViewModel.getAnalysisUrl().postValue(EcgDataRepo.getEcgAnalysisUrl$default(ecgPagerViewModel.c(), value.getTimestamp(), EcgWebUrlKey.ZeppEcgAnalysis.INSTANCE, null, 4, null));
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.watch.companion.ecg.arch.EcgPagerViewModel$deleteEcg$1", f = "EcgPagerViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class b extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ EcgData c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(EcgData ecgData, Continuation<? super b> continuation) {
            super(2, continuation);
            this.c = ecgData;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return EcgPagerViewModel.this.new b(this.c, continuation);
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
            EcgPagerViewModel.this.getDeleteEcgLiveData().postValue(Result.loading());
            if (EcgPagerViewModel.this.c().deleteEcg(this.c)) {
                EcgPagerViewModel.this.getDeleteEcgLiveData().postValue(Result.success(this.c));
            } else {
                EcgPagerViewModel.this.getDeleteEcgLiveData().postValue(Result.error());
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/huami/ecg/core/db/dao/EcgDao;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function0<EcgDao> {
        public static final c a = new c();

        public c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final EcgDao invoke() {
            return EcgDataBase.INSTANCE.getInstance().ecgDao();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/huami/ecg/EcgDataRepo;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class d extends Lambda implements Function0<EcgDataRepo> {
        public static final d a = new d();

        public d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final EcgDataRepo invoke() {
            return new EcgDataRepo();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.watch.companion.ecg.arch.EcgPagerViewModel$safeLaunch$1", f = "EcgPagerViewModel.kt", i = {}, l = {96}, m = "invokeSuspend", n = {}, s = {})
    public static final class e extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;
        private /* synthetic */ Object b;
        public final /* synthetic */ Function2<CoroutineScope, Continuation<? super Unit>, Object> c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public e(Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object> function2, Continuation<? super e> continuation) {
            super(2, continuation);
            this.c = function2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            e eVar = new e(this.c, continuation);
            eVar.b = obj;
            return eVar;
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((e) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            int i = this.a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                CoroutineScope coroutineScope = (CoroutineScope) this.b;
                Function2<CoroutineScope, Continuation<? super Unit>, Object> function2 = this.c;
                this.a = 1;
                if (function2.invoke(coroutineScope, this) == coroutine_suspended) {
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
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.watch.companion.ecg.arch.EcgPagerViewModel$setEcgId$1", f = "EcgPagerViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class f extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;

        public f(Continuation<? super f> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return EcgPagerViewModel.this.new f(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((f) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            if (this.a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            EcgPagerViewModel.this.getCurrentEcgData().postValue(EcgDataRepo.getEcg$default(EcgPagerViewModel.this.c(), EcgPagerViewModel.this.mCurrentEcgId, null, 2, null));
            return Unit.INSTANCE;
        }
    }

    public EcgPagerViewModel(@NotNull Application application) {
        super(application);
        this.ecgDao = LazyKt__LazyJVMKt.lazy(c.a);
        this.mEcgRepo = LazyKt__LazyJVMKt.lazy(d.a);
        this.deleteEcgLiveData = new MutableLiveData<>();
        this.mCurrentEcgId = -1L;
        this.currentIndexData = new MediatorLiveData<>();
        this.hasPreData = new MediatorLiveData<>();
        this.hasNextData = new MediatorLiveData<>();
        this.currentEcgData = new MediatorLiveData<>();
        this.analysisUrl = new MutableLiveData<>();
    }

    private final void a() {
    }

    private final EcgDao b() {
        return (EcgDao) this.ecgDao.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final EcgDataRepo c() {
        return (EcgDataRepo) this.mEcgRepo.getValue();
    }

    private final void e(Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object> func) {
        kotlinx.coroutines.e.f(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), null, new e(func, null), 2, null);
    }

    public final void analysisEcg() {
        e(new a(null));
    }

    public final void deleteEcg(@NotNull EcgData ecg) {
        e(new b(ecg, null));
    }

    @NotNull
    public final MutableLiveData<String> getAnalysisUrl() {
        return this.analysisUrl;
    }

    @NotNull
    public final MediatorLiveData<EcgData> getCurrentEcgData() {
        return this.currentEcgData;
    }

    @NotNull
    public final MediatorLiveData<Integer> getCurrentIndexData() {
        return this.currentIndexData;
    }

    @NotNull
    public final MutableLiveData<Result<EcgData>> getDeleteEcgLiveData() {
        return this.deleteEcgLiveData;
    }

    @NotNull
    public final MediatorLiveData<Boolean> getHasNextData() {
        return this.hasNextData;
    }

    @NotNull
    public final MediatorLiveData<Boolean> getHasPreData() {
        return this.hasPreData;
    }

    public final void setCurrentIndex(int index) {
        this.currentIndexData.postValue(Integer.valueOf(index));
    }

    public final void setEcgId(long ecgId) {
        this.mCurrentEcgId = ecgId;
        e(new f(null));
    }

    public final void switchPage(boolean isPre) {
        Integer value = this.currentIndexData.getValue();
        if (value == null) {
            return;
        }
        if (!Intrinsics.areEqual((isPre ? getHasPreData() : getHasNextData()).getValue(), Boolean.TRUE)) {
            value = null;
        }
        if (value == null) {
            return;
        }
        getCurrentIndexData().postValue(Integer.valueOf(isPre ? value.intValue() - 1 : value.intValue() + 1));
    }
}
