package com.huami.sleep.selectmainsource.viewmodel;

import androidx.arch.core.util.Function;
import androidx.p008lifecycle.CoroutineLiveDataKt;
import androidx.p008lifecycle.LiveData;
import androidx.p008lifecycle.LiveDataScope;
import androidx.p008lifecycle.MutableLiveData;
import androidx.p008lifecycle.Transformations;
import androidx.p008lifecycle.ViewModel;
import androidx.p008lifecycle.ViewModelKt;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.sleep.ext.KoinExtKt;
import com.huami.sleep.koin.IDeviceManager;
import com.huami.sleep.selectmainsource.viewmodel.SleepMainSourceViewModel.e;
import com.huami.sleep.selectmainsource.viewmodel.SleepMainSourceViewModel.g;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b'\u0010(J\u0016\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004J\u000e\u0010\b\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\t\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\n\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002R\"\u0010\u0011\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R#\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00020\u00128B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R#\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00040\u00128F@\u0006X\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0018\u0010\u0014\u001a\u0004\b\u0019\u0010\u0016R#\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00040\u00128F@\u0006X\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u001b\u0010\u0014\u001a\u0004\b\u001c\u0010\u0016R\u001f\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00020\u001e8\u0006@\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R\u001f\u0010&\u001a\b\u0012\u0004\u0012\u00020\u00020\u001e8\u0006@\u0006¢\u0006\f\n\u0004\b$\u0010 \u001a\u0004\b%\u0010\"¨\u0006)"}, d2 = {"Lcom/huami/sleep/selectmainsource/viewmodel/SleepMainSourceViewModel;", "Landroidx/lifecycle/ViewModel;", "", "date", "", "isEarbud", "", "changeDataSource", "startDataAnalysis", "setDate", "checkIsEarBud", "a", "Ljava/lang/String;", "getUserId", "()Ljava/lang/String;", "setUserId", "(Ljava/lang/String;)V", "userId", "Landroidx/lifecycle/MutableLiveData;", "b", "Lkotlin/Lazy;", "getDateLiveData", "()Landroidx/lifecycle/MutableLiveData;", "dateLiveData", "c", "getChangeResult", "changeResult", GoogleApiAvailabilityLight.a, "getMIsEarbud", "mIsEarbud", "Landroidx/lifecycle/LiveData;", "e", "Landroidx/lifecycle/LiveData;", "getMiliText", "()Landroidx/lifecycle/LiveData;", "miliText", "f", "getEarbudText", "earbudText", "<init>", "()V", "sleep_release"}, k = 1, mv = {1, 5, 1})
public final class SleepMainSourceViewModel extends ViewModel {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private String userId = "";

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final Lazy dateLiveData = LazyKt__LazyJVMKt.lazy(d.a);

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final Lazy changeResult = LazyKt__LazyJVMKt.lazy(b.a);

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private final Lazy mIsEarbud = LazyKt__LazyJVMKt.lazy(f.a);

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    private final LiveData<String> miliText = Transformations.switchMap(getDateLiveData(), new Function<String, LiveData<String>>() { // from class: com.huami.sleep.selectmainsource.viewmodel.SleepMainSourceViewModel$special$$inlined$switchMap$1
        @Override // androidx.arch.core.util.Function
        @NotNull
        public final LiveData<String> apply(String str) {
            return CoroutineLiveDataKt.liveData$default((CoroutineContext) null, 0L, this.a.new g(str, null), 3, (Object) null);
        }
    });

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    private final LiveData<String> earbudText = Transformations.switchMap(getDateLiveData(), new Function<String, LiveData<String>>() { // from class: com.huami.sleep.selectmainsource.viewmodel.SleepMainSourceViewModel$special$$inlined$switchMap$2
        @Override // androidx.arch.core.util.Function
        @NotNull
        public final LiveData<String> apply(String str) {
            return CoroutineLiveDataKt.liveData$default((CoroutineContext) null, 0L, this.a.new e(str, null), 3, (Object) null);
        }
    });

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.sleep.selectmainsource.viewmodel.SleepMainSourceViewModel$changeDataSource$1", f = "SleepMainSourceViewModel.kt", i = {}, l = {29}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ String c;
        public final /* synthetic */ boolean d;

        /* JADX INFO: renamed from: com.huami.sleep.selectmainsource.viewmodel.SleepMainSourceViewModel$a$a, reason: collision with other inner class name */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        @DebugMetadata(c = "com.huami.sleep.selectmainsource.viewmodel.SleepMainSourceViewModel$changeDataSource$1$1", f = "SleepMainSourceViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class C0582a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            public int a;
            public final /* synthetic */ SleepMainSourceViewModel b;
            public final /* synthetic */ String c;
            public final /* synthetic */ boolean d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0582a(SleepMainSourceViewModel sleepMainSourceViewModel, String str, boolean z, Continuation<? super C0582a> continuation) {
                super(2, continuation);
                this.b = sleepMainSourceViewModel;
                this.c = str;
                this.d = z;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                return new C0582a(this.b, this.c, this.d, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            @Nullable
            public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
                return ((C0582a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
                if (this.a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                this.b.getChangeResult().postValue(Boxing.boxBoolean(KoinExtKt.getAppCacheSlpData().changeDataSource(this.b.getUserId(), this.c, this.d)));
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str, boolean z, Continuation<? super a> continuation) {
            super(2, continuation);
            this.c = str;
            this.d = z;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return SleepMainSourceViewModel.this.new a(this.c, this.d, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            int i = this.a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                CoroutineDispatcher io2 = Dispatchers.getIO();
                C0582a c0582a = new C0582a(SleepMainSourceViewModel.this, this.c, this.d, null);
                this.a = 1;
                if (BuildersKt.withContext(io2, c0582a, this) == coroutine_suspended) {
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

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n"}, d2 = {"Landroidx/lifecycle/MutableLiveData;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<MutableLiveData<Boolean>> {
        public static final b a = new b();

        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final MutableLiveData<Boolean> invoke() {
            return new MutableLiveData<>();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.sleep.selectmainsource.viewmodel.SleepMainSourceViewModel$checkIsEarBud$1", f = "SleepMainSourceViewModel.kt", i = {}, l = {64}, m = "invokeSuspend", n = {}, s = {})
    public static final class c extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ String c;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        @DebugMetadata(c = "com.huami.sleep.selectmainsource.viewmodel.SleepMainSourceViewModel$checkIsEarBud$1$1", f = "SleepMainSourceViewModel.kt", i = {}, l = {65}, m = "invokeSuspend", n = {}, s = {})
        public static final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            public Object a;
            public int b;
            public final /* synthetic */ SleepMainSourceViewModel c;
            public final /* synthetic */ String d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(SleepMainSourceViewModel sleepMainSourceViewModel, String str, Continuation<? super a> continuation) {
                super(2, continuation);
                this.c = sleepMainSourceViewModel;
                this.d = str;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                return new a(this.c, this.d, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            @Nullable
            public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
                return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                MutableLiveData mutableLiveData;
                Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
                int i = this.b;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    MutableLiveData<Boolean> mIsEarbud = this.c.getMIsEarbud();
                    IDeviceManager deviceManager = KoinExtKt.getDeviceManager();
                    String userId = this.c.getUserId();
                    String str = this.d;
                    this.a = mIsEarbud;
                    this.b = 1;
                    Object objIsEarbud = deviceManager.isEarbud(userId, str, this);
                    if (objIsEarbud == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    mutableLiveData = mIsEarbud;
                    obj = objIsEarbud;
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    mutableLiveData = (MutableLiveData) this.a;
                    ResultKt.throwOnFailure(obj);
                }
                mutableLiveData.postValue(obj);
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(String str, Continuation<? super c> continuation) {
            super(2, continuation);
            this.c = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return SleepMainSourceViewModel.this.new c(this.c, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((c) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            int i = this.a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                CoroutineDispatcher io2 = Dispatchers.getIO();
                a aVar = new a(SleepMainSourceViewModel.this, this.c, null);
                this.a = 1;
                if (BuildersKt.withContext(io2, aVar, this) == coroutine_suspended) {
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

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n"}, d2 = {"Landroidx/lifecycle/MutableLiveData;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class d extends Lambda implements Function0<MutableLiveData<String>> {
        public static final d a = new d();

        public d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final MutableLiveData<String> invoke() {
            return new MutableLiveData<>();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@"}, d2 = {"Landroidx/lifecycle/LiveDataScope;", "", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.sleep.selectmainsource.viewmodel.SleepMainSourceViewModel$earbudText$1$1", f = "SleepMainSourceViewModel.kt", i = {}, l = {52, 52}, m = "invokeSuspend", n = {}, s = {})
    public static final class e extends SuspendLambda implements Function2<LiveDataScope<String>, Continuation<? super Unit>, Object> {
        public int a;
        private /* synthetic */ Object b;
        public final /* synthetic */ String d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(String str, Continuation<? super e> continuation) {
            super(2, continuation);
            this.d = str;
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@NotNull LiveDataScope<String> liveDataScope, @Nullable Continuation<? super Unit> continuation) {
            return ((e) create(liveDataScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            e eVar = SleepMainSourceViewModel.this.new e(this.d, continuation);
            eVar.b = obj;
            return eVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            LiveDataScope liveDataScope;
            Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            int i = this.a;
            if (i != 0) {
                if (i == 1) {
                    liveDataScope = (LiveDataScope) this.b;
                    ResultKt.throwOnFailure(obj);
                } else {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            }
            ResultKt.throwOnFailure(obj);
            liveDataScope = (LiveDataScope) this.b;
            IDeviceManager deviceManager = KoinExtKt.getDeviceManager();
            String userId = SleepMainSourceViewModel.this.getUserId();
            String str = this.d;
            this.b = liveDataScope;
            this.a = 1;
            obj = deviceManager.getDeviceDesc(userId, true, str, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
            this.b = null;
            this.a = 2;
            if (liveDataScope.emit(obj, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n"}, d2 = {"Landroidx/lifecycle/MutableLiveData;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class f extends Lambda implements Function0<MutableLiveData<Boolean>> {
        public static final f a = new f();

        public f() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final MutableLiveData<Boolean> invoke() {
            return new MutableLiveData<>();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@"}, d2 = {"Landroidx/lifecycle/LiveDataScope;", "", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.sleep.selectmainsource.viewmodel.SleepMainSourceViewModel$miliText$1$1", f = "SleepMainSourceViewModel.kt", i = {}, l = {46, 46}, m = "invokeSuspend", n = {}, s = {})
    public static final class g extends SuspendLambda implements Function2<LiveDataScope<String>, Continuation<? super Unit>, Object> {
        public int a;
        private /* synthetic */ Object b;
        public final /* synthetic */ String d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(String str, Continuation<? super g> continuation) {
            super(2, continuation);
            this.d = str;
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@NotNull LiveDataScope<String> liveDataScope, @Nullable Continuation<? super Unit> continuation) {
            return ((g) create(liveDataScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            g gVar = SleepMainSourceViewModel.this.new g(this.d, continuation);
            gVar.b = obj;
            return gVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            LiveDataScope liveDataScope;
            Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            int i = this.a;
            if (i != 0) {
                if (i == 1) {
                    liveDataScope = (LiveDataScope) this.b;
                    ResultKt.throwOnFailure(obj);
                } else {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            }
            ResultKt.throwOnFailure(obj);
            liveDataScope = (LiveDataScope) this.b;
            IDeviceManager deviceManager = KoinExtKt.getDeviceManager();
            String userId = SleepMainSourceViewModel.this.getUserId();
            String str = this.d;
            this.b = liveDataScope;
            this.a = 1;
            obj = deviceManager.getDeviceDesc(userId, false, str, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
            this.b = null;
            this.a = 2;
            if (liveDataScope.emit(obj, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.sleep.selectmainsource.viewmodel.SleepMainSourceViewModel$startDataAnalysis$1", f = "SleepMainSourceViewModel.kt", i = {}, l = {38}, m = "invokeSuspend", n = {}, s = {})
    public static final class h extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ String c;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        @DebugMetadata(c = "com.huami.sleep.selectmainsource.viewmodel.SleepMainSourceViewModel$startDataAnalysis$1$1", f = "SleepMainSourceViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            public int a;
            public final /* synthetic */ SleepMainSourceViewModel b;
            public final /* synthetic */ String c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(SleepMainSourceViewModel sleepMainSourceViewModel, String str, Continuation<? super a> continuation) {
                super(2, continuation);
                this.b = sleepMainSourceViewModel;
                this.c = str;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                return new a(this.b, this.c, continuation);
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
                KoinExtKt.getSleepDataManager().startAnalysis(this.b.getUserId(), this.c);
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(String str, Continuation<? super h> continuation) {
            super(2, continuation);
            this.c = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return SleepMainSourceViewModel.this.new h(this.c, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((h) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            int i = this.a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                CoroutineDispatcher io2 = Dispatchers.getIO();
                a aVar = new a(SleepMainSourceViewModel.this, this.c, null);
                this.a = 1;
                if (BuildersKt.withContext(io2, aVar, this) == coroutine_suspended) {
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

    private final MutableLiveData<String> getDateLiveData() {
        return (MutableLiveData) this.dateLiveData.getValue();
    }

    public final void changeDataSource(@NotNull String date, boolean isEarbud) {
        kotlinx.coroutines.e.f(ViewModelKt.getViewModelScope(this), null, null, new a(date, isEarbud, null), 3, null);
    }

    public final void checkIsEarBud(@NotNull String date) {
        kotlinx.coroutines.e.f(ViewModelKt.getViewModelScope(this), null, null, new c(date, null), 3, null);
    }

    @NotNull
    public final MutableLiveData<Boolean> getChangeResult() {
        return (MutableLiveData) this.changeResult.getValue();
    }

    @NotNull
    public final LiveData<String> getEarbudText() {
        return this.earbudText;
    }

    @NotNull
    public final MutableLiveData<Boolean> getMIsEarbud() {
        return (MutableLiveData) this.mIsEarbud.getValue();
    }

    @NotNull
    public final LiveData<String> getMiliText() {
        return this.miliText;
    }

    @NotNull
    public final String getUserId() {
        return this.userId;
    }

    public final void setDate(@NotNull String date) {
        getDateLiveData().setValue(date);
    }

    public final void setUserId(@NotNull String str) {
        this.userId = str;
    }

    public final void startDataAnalysis(@NotNull String date) {
        kotlinx.coroutines.e.f(ViewModelKt.getViewModelScope(this), null, null, new h(date, null), 3, null);
    }
}
