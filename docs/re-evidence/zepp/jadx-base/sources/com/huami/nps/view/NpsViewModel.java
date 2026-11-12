package com.huami.nps.view;

import androidx.p008lifecycle.MutableLiveData;
import androidx.p008lifecycle.ViewModel;
import androidx.p008lifecycle.ViewModelKt;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.fitness.data.WorkoutExercises;
import com.huami.nps.api.AdExtension;
import com.huami.nps.api.INpsApi;
import com.huami.nps.api.NpsVo;
import com.huami.nps.di.KoinExKt;
import com.huami.nps.sharedpreference.ISharedPref;
import com.huami.tools.log.HMLog;
import java.util.List;
import java.util.Objects;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.MainCoroutineDispatcher;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 ,2\u00020\u0001:\u0001,B\u000f\u0012\u0006\u0010\u0015\u001a\u00020\u0012¢\u0006\u0004\b*\u0010+J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u001a\u0010\t\u001a\u0004\u0018\u00010\u00072\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006H\u0002J\u000e\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u0002J\u000e\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rJ\u0006\u0010\u0010\u001a\u00020\u000bJ\u0006\u0010\u0011\u001a\u00020\u000bR\u0016\u0010\u0015\u001a\u00020\u00128\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u001c\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00070\u00168\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0017R\"\u0010\u0019\u001a\u00020\u00028\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\"\u0010\u001f\u001a\u00020\u00028\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u001f\u0010\u001a\u001a\u0004\b \u0010\u001c\"\u0004\b!\u0010\u001eR#\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00040\u00168F@\u0006X\u0086\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\"\u001a\u0004\b#\u0010$R\u001d\u0010)\u001a\u00020&8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b'\u0010\"\u001a\u0004\b\u0013\u0010(¨\u0006-"}, d2 = {"Lcom/huami/nps/view/NpsViewModel;", "Landroidx/lifecycle/ViewModel;", "", "id", "", "b", "", "Lcom/huami/nps/api/NpsVo;", "list", "c", "type", "", "loadNpsByType", "", "ratingScore", "reportRatingToCloud", "saveShowedNpsId", WorkoutExercises.CLEAN, "Lcom/huami/nps/sharedpreference/ISharedPref;", "a", "Lcom/huami/nps/sharedpreference/ISharedPref;", "sharedPref", "Landroidx/lifecycle/MutableLiveData;", "Landroidx/lifecycle/MutableLiveData;", "_npsResult", "serveyUrl", "Ljava/lang/String;", "getServeyUrl", "()Ljava/lang/String;", "setServeyUrl", "(Ljava/lang/String;)V", "userId", "getUserId", "setUserId", "Lkotlin/Lazy;", "getShowNps", "()Landroidx/lifecycle/MutableLiveData;", "showNps", "Lcom/huami/nps/api/INpsApi;", GoogleApiAvailabilityLight.a, "()Lcom/huami/nps/api/INpsApi;", "npsApi", "<init>", "(Lcom/huami/nps/sharedpreference/ISharedPref;)V", "Companion", "nps_release"}, k = 1, mv = {1, 5, 1})
public final class NpsViewModel extends ViewModel {

    @NotNull
    private static final String e = "NpsViewModel";

    @NotNull
    private static final String f = "message";

    @NotNull
    private static final String g = "success";

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final ISharedPref sharedPref;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final MutableLiveData<NpsVo> _npsResult = new MutableLiveData<>();

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final Lazy showNps = LazyKt__LazyJVMKt.lazy(f.a);

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private final Lazy npsApi = LazyKt__LazyJVMKt.lazy(d.a);
    public String serveyUrl;
    public String userId;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00010\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/flow/FlowCollector;", "", "Lcom/huami/nps/api/NpsVo;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.nps.view.NpsViewModel$loadNpsByType$1", f = "NpsViewModel.kt", i = {}, l = {45, 45}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements Function2<FlowCollector<? super List<? extends NpsVo>>, Continuation<? super Unit>, Object> {
        public int a;
        private /* synthetic */ Object b;
        public final /* synthetic */ String d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str, Continuation<? super a> continuation) {
            super(2, continuation);
            this.d = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            a aVar = NpsViewModel.this.new a(this.d, continuation);
            aVar.b = obj;
            return aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(FlowCollector<? super List<? extends NpsVo>> flowCollector, Continuation<? super Unit> continuation) {
            return invoke2((FlowCollector<? super List<NpsVo>>) flowCollector, continuation);
        }

        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(@NotNull FlowCollector<? super List<NpsVo>> flowCollector, @Nullable Continuation<? super Unit> continuation) {
            return ((a) create(flowCollector, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            FlowCollector flowCollector;
            Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            int i = this.a;
            if (i != 0) {
                if (i == 1) {
                    flowCollector = (FlowCollector) this.b;
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
            flowCollector = (FlowCollector) this.b;
            INpsApi iNpsApiA = NpsViewModel.this.a();
            String str = this.d;
            this.b = flowCollector;
            this.a = 1;
            obj = iNpsApiA.getNps(str, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
            this.b = null;
            this.a = 2;
            if (flowCollector.emit(obj, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0000H\u008a@"}, d2 = {"", "Lcom/huami/nps/api/NpsVo;", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.nps.view.NpsViewModel$loadNpsByType$2", f = "NpsViewModel.kt", i = {}, l = {47}, m = "invokeSuspend", n = {}, s = {})
    public static final class b extends SuspendLambda implements Function2<List<? extends NpsVo>, Continuation<? super Unit>, Object> {
        public int a;
        public /* synthetic */ Object b;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        @DebugMetadata(c = "com.huami.nps.view.NpsViewModel$loadNpsByType$2$1", f = "NpsViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            public int a;
            public final /* synthetic */ NpsViewModel b;
            public final /* synthetic */ List<NpsVo> c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(NpsViewModel npsViewModel, List<NpsVo> list, Continuation<? super a> continuation) {
                super(2, continuation);
                this.b = npsViewModel;
                this.c = list;
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
                NpsVo npsVoC = this.b.c(this.c);
                if (npsVoC != null) {
                    NpsViewModel npsViewModel = this.b;
                    npsViewModel._npsResult.postValue(npsVoC);
                    npsViewModel.setServeyUrl(String.valueOf(npsVoC.getTarget()));
                    npsViewModel.getShowNps().setValue(Boxing.boxBoolean(true));
                }
                return Unit.INSTANCE;
            }
        }

        public b(Continuation<? super b> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@Nullable List<NpsVo> list, @Nullable Continuation<? super Unit> continuation) {
            return ((b) create(list, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            b bVar = NpsViewModel.this.new b(continuation);
            bVar.b = obj;
            return bVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            int i = this.a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                List list = (List) this.b;
                MainCoroutineDispatcher main = Dispatchers.getMain();
                a aVar = new a(NpsViewModel.this, list, null);
                this.a = 1;
                if (BuildersKt.withContext(main, aVar, this) == coroutine_suspended) {
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

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0006\u001a\u00020\u0005*\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00010\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\u008a@"}, d2 = {"Lkotlinx/coroutines/flow/FlowCollector;", "", "Lcom/huami/nps/api/NpsVo;", "", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.nps.view.NpsViewModel$loadNpsByType$3", f = "NpsViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class c extends SuspendLambda implements Function3<FlowCollector<? super List<? extends NpsVo>>, Throwable, Continuation<? super Unit>, Object> {
        public int a;

        public c(Continuation<? super c> continuation) {
            super(3, continuation);
        }

        @Override // kotlin.jvm.functions.Function3
        @Nullable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@NotNull FlowCollector<? super List<NpsVo>> flowCollector, @NotNull Throwable th, @Nullable Continuation<? super Unit> continuation) {
            return NpsViewModel.this.new c(continuation).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            if (this.a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            NpsViewModel.this.getShowNps().setValue(Boxing.boxBoolean(false));
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/huami/nps/api/INpsApi;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class d extends Lambda implements Function0<INpsApi> {
        public static final d a = new d();

        public d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final INpsApi getA() {
            return (INpsApi) KoinExKt.npsScope(KoinExKt.npsScope().getKoin()).get(Reflection.getOrCreateKotlinClass(INpsApi.class), null, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.nps.view.NpsViewModel$reportRatingToCloud$1", f = "NpsViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class e extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ int c;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class a extends Lambda implements Function0<String> {
            public final /* synthetic */ boolean a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(boolean z) {
                super(0);
                this.a = z;
            }

            @Override // kotlin.jvm.functions.Function0
            @Nullable
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final String getA() {
                return "isSuccess = " + this.a;
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class b extends Lambda implements Function0<String> {
            public static final b a = new b();

            public b() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            @Nullable
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final String getA() {
                return "reportRatingToCloud json parse error";
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(int i, Continuation<? super e> continuation) {
            super(2, continuation);
            this.c = i;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return NpsViewModel.this.new e(this.c, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((e) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            if (this.a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            try {
                String userId = NpsViewModel.this.getUserId();
                NpsViewModel npsViewModel = NpsViewModel.this;
                String strReportRating = npsViewModel.a().reportRating(userId, this.c, (NpsVo) npsViewModel._npsResult.getValue());
                if (strReportRating == null) {
                    return Unit.INSTANCE;
                }
                HMLog.info("NpsViewModel", new a(Intrinsics.areEqual(new JSONObject(strReportRating).getString("message"), "success")));
                return Unit.INSTANCE;
            } catch (Exception e) {
                HMLog.error$default("NpsViewModel", null, e, b.a, 2, null);
            }
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
        public final MutableLiveData<Boolean> getA() {
            return new MutableLiveData<>();
        }
    }

    public NpsViewModel(@NotNull ISharedPref iSharedPref) {
        this.sharedPref = iSharedPref;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final INpsApi a() {
        return (INpsApi) this.npsApi.getValue();
    }

    private final boolean b(String id) {
        return this.sharedPref.getBoolean(id, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final NpsVo c(List<NpsVo> list) {
        if (list == null || list.isEmpty()) {
            return null;
        }
        long jCurrentTimeMillis = System.currentTimeMillis() / ((long) 1000);
        for (NpsVo npsVo : list) {
            if (!b(npsVo.getId())) {
                AdExtension extensions = npsVo.getExtensions();
                if (jCurrentTimeMillis > (extensions == null ? null : extensions.getStarttime()).longValue() && jCurrentTimeMillis < npsVo.getExtensions().getEndtime().longValue()) {
                    return npsVo;
                }
            }
        }
        return null;
    }

    public final void clean() {
        this.sharedPref.clean();
    }

    @NotNull
    public final String getServeyUrl() {
        String str = this.serveyUrl;
        Objects.requireNonNull(str);
        return str;
    }

    @NotNull
    public final MutableLiveData<Boolean> getShowNps() {
        return (MutableLiveData) this.showNps.getValue();
    }

    @NotNull
    public final String getUserId() {
        String str = this.userId;
        Objects.requireNonNull(str);
        return str;
    }

    public final void loadNpsByType(@NotNull String type) {
        FlowKt.launchIn(FlowKt.m4456catch(FlowKt.flowOn(FlowKt.onEach(FlowKt.flow(new a(type, null)), new b(null)), Dispatchers.getIO()), new c(null)), ViewModelKt.getViewModelScope(this));
    }

    public final void reportRatingToCloud(int ratingScore) {
        kotlinx.coroutines.e.f(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), null, new e(ratingScore, null), 2, null);
    }

    public final void saveShowedNpsId() {
        NpsVo value = this._npsResult.getValue();
        if (value == null) {
            return;
        }
        this.sharedPref.saveBoolean(value.getId(), true);
    }

    public final void setServeyUrl(@NotNull String str) {
        this.serveyUrl = str;
    }

    public final void setUserId(@NotNull String str) {
        this.userId = str;
    }
}
