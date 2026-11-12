package com.huami.sleep.viewmodel.breathquality;

import android.content.Context;
import androidx.p008lifecycle.MutableLiveData;
import androidx.p008lifecycle.ViewModel;
import androidx.p008lifecycle.ViewModelKt;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.sleep.daysleep.sleepstagechart.vo.Resource;
import com.huami.sleep.repo.IBreathQualityRepo;
import com.huami.sleep.util.SleepTimeUtil;
import com.huami.sleep.vo.BreathQualityDayOdVo;
import com.huami.snore.core.ext.KoinExtKt;
import com.huami.tools.log.HMLog;
import com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.language.CommonLanguageSettingFragment;
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
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.ExperimentalCoroutinesApi;
import kotlinx.coroutines.e;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\u0018\u0000 \u001f2\u00020\u0001:\u0001\u001fB\u000f\u0012\u0006\u0010\r\u001a\u00020\b¢\u0006\u0004\b\u001d\u0010\u001eJ\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0007R\u0019\u0010\r\u001a\u00020\b8\u0006@\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR#\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e8F@\u0006X\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R)\u0010\u0018\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00150\u000e8F@\u0006X\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0016\u0010\u0011\u001a\u0004\b\u0017\u0010\u0013R#\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00190\u000e8F@\u0006X\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u001a\u0010\u0011\u001a\u0004\b\u001b\u0010\u0013¨\u0006 "}, d2 = {"Lcom/huami/sleep/viewmodel/breathquality/BreathQualityDayOdViewModel;", "Landroidx/lifecycle/ViewModel;", "", "userId", "", "timeStamp", "", "getOdShowData", "Lcom/huami/sleep/repo/IBreathQualityRepo;", "a", "Lcom/huami/sleep/repo/IBreathQualityRepo;", "getRepo", "()Lcom/huami/sleep/repo/IBreathQualityRepo;", CommonLanguageSettingFragment.KEY_REPO, "Landroidx/lifecycle/MutableLiveData;", "Lcom/huami/sleep/vo/BreathQualityDayOdVo;", "b", "Lkotlin/Lazy;", "getScoreShowLifeData", "()Landroidx/lifecycle/MutableLiveData;", "scoreShowLifeData", "Lcom/huami/sleep/daysleep/sleepstagechart/vo/Resource;", "c", "getDataLoadingResult", "dataLoadingResult", "", GoogleApiAvailabilityLight.a, "getEmptyLiveData", "emptyLiveData", "<init>", "(Lcom/huami/sleep/repo/IBreathQualityRepo;)V", "Companion", "sleep_release"}, k = 1, mv = {1, 5, 1})
public final class BreathQualityDayOdViewModel extends ViewModel {
    private static final long e = 3600000;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final IBreathQualityRepo repo;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final Lazy scoreShowLifeData = LazyKt__LazyJVMKt.lazy(d.a);

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final Lazy dataLoadingResult = LazyKt__LazyJVMKt.lazy(a.a);

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private final Lazy emptyLiveData = LazyKt__LazyJVMKt.lazy(b.a);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\n"}, d2 = {"Landroidx/lifecycle/MutableLiveData;", "Lcom/huami/sleep/daysleep/sleepstagechart/vo/Resource;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<MutableLiveData<Resource<? extends String>>> {
        public static final a a = new a();

        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final MutableLiveData<Resource<String>> invoke() {
            return new MutableLiveData<>();
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
    @DebugMetadata(c = "com.huami.sleep.viewmodel.breathquality.BreathQualityDayOdViewModel$getOdShowData$1", f = "BreathQualityDayOdViewModel.kt", i = {}, l = {50, 59}, m = "invokeSuspend", n = {}, s = {})
    public static final class c extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ String c;
        public final /* synthetic */ long d;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/flow/FlowCollector;", "Lcom/huami/sleep/vo/BreathQualityDayOdVo;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        @DebugMetadata(c = "com.huami.sleep.viewmodel.breathquality.BreathQualityDayOdViewModel$getOdShowData$1$1", f = "BreathQualityDayOdViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class a extends SuspendLambda implements Function2<FlowCollector<? super BreathQualityDayOdVo>, Continuation<? super Unit>, Object> {
            public int a;
            public final /* synthetic */ BreathQualityDayOdViewModel b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(BreathQualityDayOdViewModel breathQualityDayOdViewModel, Continuation<? super a> continuation) {
                super(2, continuation);
                this.b = breathQualityDayOdViewModel;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                return new a(this.b, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            @Nullable
            public final Object invoke(@NotNull FlowCollector<? super BreathQualityDayOdVo> flowCollector, @Nullable Continuation<? super Unit> continuation) {
                return ((a) create(flowCollector, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
                if (this.a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                this.b.getDataLoadingResult().postValue(Resource.INSTANCE.loading(""));
                return Unit.INSTANCE;
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u008a@"}, d2 = {"Lkotlinx/coroutines/flow/FlowCollector;", "Lcom/huami/sleep/vo/BreathQualityDayOdVo;", "", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        @DebugMetadata(c = "com.huami.sleep.viewmodel.breathquality.BreathQualityDayOdViewModel$getOdShowData$1$2", f = "BreathQualityDayOdViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class b extends SuspendLambda implements Function3<FlowCollector<? super BreathQualityDayOdVo>, Throwable, Continuation<? super Unit>, Object> {
            public int a;
            public final /* synthetic */ BreathQualityDayOdViewModel b;
            public final /* synthetic */ long c;

            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
            public static final class a extends Lambda implements Function0<String> {
                public final /* synthetic */ long a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public a(long j) {
                    super(0);
                    this.a = j;
                }

                @Override // kotlin.jvm.functions.Function0
                @Nullable
                public final String invoke() {
                    return SleepTimeUtil.INSTANCE.formatTimeYMD(this.a) + " 数据异常";
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(BreathQualityDayOdViewModel breathQualityDayOdViewModel, long j, Continuation<? super b> continuation) {
                super(3, continuation);
                this.b = breathQualityDayOdViewModel;
                this.c = j;
            }

            @Override // kotlin.jvm.functions.Function3
            @Nullable
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(@NotNull FlowCollector<? super BreathQualityDayOdVo> flowCollector, @NotNull Throwable th, @Nullable Continuation<? super Unit> continuation) {
                return new b(this.b, this.c, continuation).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
                if (this.a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                this.b.getDataLoadingResult().postValue(Resource.Companion.error$default(Resource.INSTANCE, "", null, 2, null));
                HMLog.error$default(null, null, null, new a(this.c), 7, null);
                return Unit.INSTANCE;
            }
        }

        /* JADX INFO: renamed from: com.huami.sleep.viewmodel.breathquality.BreathQualityDayOdViewModel$c$c, reason: collision with other inner class name */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"Lcom/huami/sleep/vo/BreathQualityDayOdVo;", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        @DebugMetadata(c = "com.huami.sleep.viewmodel.breathquality.BreathQualityDayOdViewModel$getOdShowData$1$3", f = "BreathQualityDayOdViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class C0588c extends SuspendLambda implements Function2<BreathQualityDayOdVo, Continuation<? super Unit>, Object> {
            public int a;
            public /* synthetic */ Object b;
            public final /* synthetic */ BreathQualityDayOdViewModel c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0588c(BreathQualityDayOdViewModel breathQualityDayOdViewModel, Continuation<? super C0588c> continuation) {
                super(2, continuation);
                this.c = breathQualityDayOdViewModel;
            }

            @Override // kotlin.jvm.functions.Function2
            @Nullable
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(@NotNull BreathQualityDayOdVo breathQualityDayOdVo, @Nullable Continuation<? super Unit> continuation) {
                return ((C0588c) create(breathQualityDayOdVo, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                C0588c c0588c = new C0588c(this.c, continuation);
                c0588c.b = obj;
                return c0588c;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
                if (this.a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                BreathQualityDayOdVo breathQualityDayOdVo = (BreathQualityDayOdVo) this.b;
                this.c.getDataLoadingResult().postValue(Resource.INSTANCE.success(""));
                this.c.getEmptyLiveData().postValue(Boxing.boxBoolean(breathQualityDayOdVo.getEmpty()));
                if (!breathQualityDayOdVo.getEmpty()) {
                    this.c.getScoreShowLifeData().postValue(breathQualityDayOdVo);
                }
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(String str, long j, Continuation<? super c> continuation) {
            super(2, continuation);
            this.c = str;
            this.d = j;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return BreathQualityDayOdViewModel.this.new c(this.c, this.d, continuation);
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
            if (i != 0) {
                if (i == 1) {
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
            IBreathQualityRepo repo = BreathQualityDayOdViewModel.this.getRepo();
            Context appContext = KoinExtKt.getAppContext();
            String str = this.c;
            long j = this.d;
            this.a = 1;
            obj = repo.getOdiShowInfo(appContext, str, j, 3600000L, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
            Flow flowM4456catch = FlowKt.m4456catch(FlowKt.onStart((Flow) obj, new a(BreathQualityDayOdViewModel.this, null)), new b(BreathQualityDayOdViewModel.this, this.d, null));
            C0588c c0588c = new C0588c(BreathQualityDayOdViewModel.this, null);
            this.a = 2;
            if (FlowKt.collectLatest(flowM4456catch, c0588c, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n"}, d2 = {"Landroidx/lifecycle/MutableLiveData;", "Lcom/huami/sleep/vo/BreathQualityDayOdVo;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class d extends Lambda implements Function0<MutableLiveData<BreathQualityDayOdVo>> {
        public static final d a = new d();

        public d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final MutableLiveData<BreathQualityDayOdVo> invoke() {
            return new MutableLiveData<>();
        }
    }

    public BreathQualityDayOdViewModel(@NotNull IBreathQualityRepo iBreathQualityRepo) {
        this.repo = iBreathQualityRepo;
    }

    @NotNull
    public final MutableLiveData<Resource<String>> getDataLoadingResult() {
        return (MutableLiveData) this.dataLoadingResult.getValue();
    }

    @NotNull
    public final MutableLiveData<Boolean> getEmptyLiveData() {
        return (MutableLiveData) this.emptyLiveData.getValue();
    }

    @ExperimentalCoroutinesApi
    public final void getOdShowData(@NotNull String userId, long timeStamp) {
        e.f(ViewModelKt.getViewModelScope(this), null, null, new c(userId, timeStamp, null), 3, null);
    }

    @NotNull
    public final IBreathQualityRepo getRepo() {
        return this.repo;
    }

    @NotNull
    public final MutableLiveData<BreathQualityDayOdVo> getScoreShowLifeData() {
        return (MutableLiveData) this.scoreShowLifeData.getValue();
    }
}
