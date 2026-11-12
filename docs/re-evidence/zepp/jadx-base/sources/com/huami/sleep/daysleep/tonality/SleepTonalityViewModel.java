package com.huami.sleep.daysleep.tonality;

import androidx.arch.core.util.Function;
import androidx.p008lifecycle.LiveData;
import androidx.p008lifecycle.MutableLiveData;
import androidx.p008lifecycle.Transformations;
import androidx.p008lifecycle.ViewModel;
import androidx.p008lifecycle.ViewModelKt;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.sleep.data.local.tonality.RatingCacheBean;
import com.huami.sleep.data.remote.tonality.IApiTonalityRating;
import com.huami.sleep.daysleep.tonality.bean.SleepTonalityBean;
import com.huami.sleep.daysleep.tonality.bean.TonalityDisplayDataInfo;
import com.huami.sleep.ext.KoinExtKt;
import com.huami.sleep.util.ChartTransmitUtil;
import com.huami.tools.log.HMLog;
import com.xiaomi.hm.health.baseutil.TimeUtils;
import com.xiaomi.hm.health.dataprocess.SleepInfo;
import com.xiaomi.hm.health.dataprocess.StageSleep;
import com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.language.CommonLanguageSettingFragment;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\r\b\u0000\u0018\u0000 ;2\u00020\u0001:\u0001;B\u001f\u0012\u0006\u0010\u0016\u001a\u00020\r\u0012\u0006\u0010\u0019\u001a\u00020\u0017\u0012\u0006\u0010\u001d\u001a\u00020\u001a¢\u0006\u0004\b9\u0010:J0\u0010\t\u001a\u0014\u0012\u0004\u0012\u00020\b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00040\u00072\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0002J\u0010\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\bH\u0002J\u000e\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rJ\u0006\u0010\u0010\u001a\u00020\u000bJ\u0010\u0010\u0012\u001a\u00020\u000b2\b\u0010\u0011\u001a\u0004\u0018\u00010\rJ\u000e\u0010\u0014\u001a\u00020\u000b2\u0006\u0010\u0013\u001a\u00020\bR\u0016\u0010\u0016\u001a\u00020\r8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u0015R\u0016\u0010\u0019\u001a\u00020\u00178\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0018R\u0016\u0010\u001d\u001a\u00020\u001a8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR#\u0010#\u001a\b\u0012\u0004\u0012\u00020\r0\u001e8F@\u0006X\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R!\u0010*\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010%0$8\u0006@\u0006¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)R%\u0010.\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010+0\u001e8F@\u0006X\u0086\u0084\u0002¢\u0006\f\n\u0004\b,\u0010 \u001a\u0004\b-\u0010\"R#\u00102\u001a\b\u0012\u0004\u0012\u00020/0\u001e8F@\u0006X\u0086\u0084\u0002¢\u0006\f\n\u0004\b0\u0010 \u001a\u0004\b1\u0010\"R#\u00105\u001a\b\u0012\u0004\u0012\u00020/0\u001e8F@\u0006X\u0086\u0084\u0002¢\u0006\f\n\u0004\b3\u0010 \u001a\u0004\b4\u0010\"R#\u00108\u001a\b\u0012\u0004\u0012\u00020/0\u001e8F@\u0006X\u0086\u0084\u0002¢\u0006\f\n\u0004\b6\u0010 \u001a\u0004\b7\u0010\"¨\u0006<"}, d2 = {"Lcom/huami/sleep/daysleep/tonality/SleepTonalityViewModel;", "Landroidx/lifecycle/ViewModel;", "", "baseTime", "", "Lcom/xiaomi/hm/health/dataprocess/StageSleep;", "stageSleepList", "Lkotlin/Pair;", "", "b", "score", "", "a", "", "keyDate", "triggerDataFetch", "fetchSleepTonalityData", "dateKey", "hadRatingByDateKey", "ratingScore", "reportRatingToCloud", "Ljava/lang/String;", "userId", "Lcom/huami/sleep/daysleep/tonality/ITonalityRepos;", "Lcom/huami/sleep/daysleep/tonality/ITonalityRepos;", CommonLanguageSettingFragment.KEY_REPO, "Lcom/huami/sleep/data/remote/tonality/IApiTonalityRating;", "c", "Lcom/huami/sleep/data/remote/tonality/IApiTonalityRating;", "iApiTonalityRating", "Landroidx/lifecycle/MutableLiveData;", GoogleApiAvailabilityLight.a, "Lkotlin/Lazy;", "getDayLiveData", "()Landroidx/lifecycle/MutableLiveData;", "dayLiveData", "Landroidx/lifecycle/LiveData;", "Lcom/xiaomi/hm/health/dataprocess/SleepInfo;", "e", "Landroidx/lifecycle/LiveData;", "getDaySportLiveData", "()Landroidx/lifecycle/LiveData;", "daySportLiveData", "Lcom/huami/sleep/daysleep/tonality/bean/SleepTonalityBean;", "f", "getSleepTonalityDataLiveData", "sleepTonalityDataLiveData", "", "g", "getShowSleepTonality", "showSleepTonality", "h", "getHadRating", "hadRating", "i", "getReportSuccess", "reportSuccess", "<init>", "(Ljava/lang/String;Lcom/huami/sleep/daysleep/tonality/ITonalityRepos;Lcom/huami/sleep/data/remote/tonality/IApiTonalityRating;)V", "Companion", "sleep_release"}, k = 1, mv = {1, 5, 1})
public final class SleepTonalityViewModel extends ViewModel {

    @NotNull
    private static final String j = "SleepTonalityViewModel";
    private static final int k = 60;

    @NotNull
    private static final String l = "message";

    @NotNull
    private static final String m = "success";

    @NotNull
    private static final String n = "yyyy-MM-dd";

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final String userId;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final ITonalityRepos repo;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final IApiTonalityRating iApiTonalityRating;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private final Lazy dayLiveData = LazyKt__LazyJVMKt.lazy(b.a);

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    private final LiveData<SleepInfo> daySportLiveData = Transformations.switchMap(getDayLiveData(), new Function<String, LiveData<SleepInfo>>() { // from class: com.huami.sleep.daysleep.tonality.SleepTonalityViewModel$special$$inlined$switchMap$1
        @Override // androidx.arch.core.util.Function
        @NotNull
        public final LiveData<SleepInfo> apply(String str) {
            return this.a.repo.getSleepData(this.a.userId, str);
        }
    });

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    private final Lazy sleepTonalityDataLiveData = LazyKt__LazyJVMKt.lazy(m.a);

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    private final Lazy showSleepTonality = LazyKt__LazyJVMKt.lazy(l.a);

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @NotNull
    private final Lazy hadRating = LazyKt__LazyJVMKt.lazy(h.a);

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @NotNull
    private final Lazy reportSuccess = LazyKt__LazyJVMKt.lazy(k.a);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<String> {
        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "cacheCurRating dayLiveData value = " + ((Object) SleepTonalityViewModel.this.getDayLiveData().getValue());
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n"}, d2 = {"Landroidx/lifecycle/MutableLiveData;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<MutableLiveData<String>> {
        public static final b a = new b();

        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final MutableLiveData<String> getA() {
            return new MutableLiveData<>();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function0<String> {
        public final /* synthetic */ int a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(int i) {
            super(0);
            this.a = i;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "fetchIntoSleepList awakeTimeIndex = " + this.a;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class d extends Lambda implements Function0<String> {
        public final /* synthetic */ long a;
        public final /* synthetic */ int b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(long j, int i) {
            super(0);
            this.a = j;
            this.b = i;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "fetchIntoSleepList intoSleep = " + this.a + " - index = " + this.b;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class e extends Lambda implements Function0<String> {
        public final /* synthetic */ Ref.ObjectRef<StageSleep> a;
        public final /* synthetic */ StageSleep b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(Ref.ObjectRef<StageSleep> objectRef, StageSleep stageSleep) {
            super(0);
            this.a = objectRef;
            this.b = stageSleep;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "fetchIntoSleepList preStageSleep.start = " + this.a.element.start + " - stageSleep.start = " + this.b.start;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class f extends Lambda implements Function0<String> {
        public final /* synthetic */ long a;
        public final /* synthetic */ int b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(long j, int i) {
            super(0);
            this.a = j;
            this.b = i;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "fetchIntoSleepList intoSleep = " + this.a + " - index = " + this.b;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.sleep.daysleep.tonality.SleepTonalityViewModel$fetchSleepTonalityData$1", f = "SleepTonalityViewModel.kt", i = {}, l = {121}, m = "invokeSuspend", n = {}, s = {})
    public static final class g extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class a extends Lambda implements Function0<String> {
            public static final a a = new a();

            public a() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            @Nullable
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final String getA() {
                return "fetchSleepTonalityData daySportLiveData is null or no sleep data";
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
                return "fetchSleepTonalityData dayLiveData is null or empty";
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        @DebugMetadata(c = "com.huami.sleep.daysleep.tonality.SleepTonalityViewModel$fetchSleepTonalityData$1$3", f = "SleepTonalityViewModel.kt", i = {}, l = {198, 200}, m = "invokeSuspend", n = {}, s = {})
        public static final class c extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            public int a;
            public final /* synthetic */ String b;
            public final /* synthetic */ SleepInfo c;
            public final /* synthetic */ SleepTonalityViewModel d;

            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
            public static final class a extends Lambda implements Function0<String> {
                public static final a a = new a();

                public a() {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                @Nullable
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final String getA() {
                    return "fetchSleepTonalityData sleepStartTimeLong is -1 invalid";
                }
            }

            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
            public static final class b extends Lambda implements Function0<String> {
                public final /* synthetic */ String a;
                public final /* synthetic */ long b;
                public final /* synthetic */ Ref.LongRef c;
                public final /* synthetic */ int d;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public b(String str, long j, Ref.LongRef longRef, int i) {
                    super(0);
                    this.a = str;
                    this.b = j;
                    this.c = longRef;
                    this.d = i;
                }

                @Override // kotlin.jvm.functions.Function0
                @Nullable
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final String getA() {
                    return "fetchSleepTonalityData curSelectDate=" + this.a + " - curSelectTime=" + this.b + " - sleepStartTimeLong=" + this.c.element + " - intoSleepCount=" + this.d;
                }
            }

            /* JADX INFO: renamed from: com.huami.sleep.daysleep.tonality.SleepTonalityViewModel$g$c$c, reason: collision with other inner class name */
            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\u008a@"}, d2 = {"Lcom/huami/sleep/daysleep/tonality/bean/SleepTonalityBean;", "sleepTonalityBean", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
            @DebugMetadata(c = "com.huami.sleep.daysleep.tonality.SleepTonalityViewModel$fetchSleepTonalityData$1$3$5", f = "SleepTonalityViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
            public static final class C0576c extends SuspendLambda implements Function2<SleepTonalityBean, Continuation<? super Unit>, Object> {
                public int a;
                public /* synthetic */ Object b;
                public final /* synthetic */ SleepTonalityViewModel c;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C0576c(SleepTonalityViewModel sleepTonalityViewModel, Continuation<? super C0576c> continuation) {
                    super(2, continuation);
                    this.c = sleepTonalityViewModel;
                }

                @Override // kotlin.jvm.functions.Function2
                @Nullable
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final Object invoke(@Nullable SleepTonalityBean sleepTonalityBean, @Nullable Continuation<? super Unit> continuation) {
                    return ((C0576c) create(sleepTonalityBean, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @NotNull
                public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                    C0576c c0576c = new C0576c(this.c, continuation);
                    c0576c.b = obj;
                    return c0576c;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Nullable
                public final Object invokeSuspend(@NotNull Object obj) {
                    kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
                    if (this.a != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    SleepTonalityBean sleepTonalityBean = (SleepTonalityBean) this.b;
                    boolean z = false;
                    if (sleepTonalityBean != null && sleepTonalityBean.getRelaxChartDataList() != null && sleepTonalityBean.getRelaxChartDataList().getCount() > 0) {
                        z = true;
                    }
                    this.c.getShowSleepTonality().postValue(Boxing.boxBoolean(z));
                    if (z) {
                        this.c.getSleepTonalityDataLiveData().postValue(sleepTonalityBean);
                    }
                    return Unit.INSTANCE;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(String str, SleepInfo sleepInfo, SleepTonalityViewModel sleepTonalityViewModel, Continuation<? super c> continuation) {
                super(2, continuation);
                this.b = str;
                this.c = sleepInfo;
                this.d = sleepTonalityViewModel;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                return new c(this.b, this.c, this.d, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            @Nullable
            public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
                return ((c) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                long j;
                int i;
                int i2;
                Object objFetchSleepTonalityData;
                Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
                int i3 = this.a;
                if (i3 != 0) {
                    if (i3 == 1) {
                        ResultKt.throwOnFailure(obj);
                        objFetchSleepTonalityData = obj;
                    } else {
                        if (i3 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                    }
                    return Unit.INSTANCE;
                }
                ResultKt.throwOnFailure(obj);
                long stringToLong = TimeUtils.parseStringToLong("yyyy-MM-dd", this.b);
                Ref.LongRef longRef = new Ref.LongRef();
                longRef.element = -1L;
                ArrayList arrayList = new ArrayList();
                if (this.c.getHasSleep()) {
                    int intoSleepCount = this.c.getIntoSleepCount();
                    longRef.element = this.c.getStartDate().getTime();
                    long time = this.c.getStopDate().getTime();
                    Pair pairB = this.d.b(stringToLong, this.c.getStageSleep());
                    int iIntValue = ((Number) pairB.getFirst()).intValue();
                    arrayList.addAll((Collection) pairB.getSecond());
                    i2 = intoSleepCount;
                    j = time;
                    i = iIntValue;
                } else {
                    StageSleep stageSleep = (StageSleep) CollectionsKt.firstOrNull((List) this.c.getOddStageSleep());
                    if (stageSleep != null) {
                        longRef.element = ChartTransmitUtil.INSTANCE.transmitIndexToDateTime(stageSleep.start, stringToLong);
                    }
                    StageSleep stageSleep2 = (StageSleep) CollectionsKt.lastOrNull((List) this.c.getOddStageSleep());
                    long jTransmitIndexToDateTime = stageSleep2 == null ? -1L : ChartTransmitUtil.INSTANCE.transmitIndexToDateTime(stageSleep2.stop, stringToLong);
                    Pair pairB2 = this.d.b(stringToLong, this.c.getOddStageSleep());
                    int iIntValue2 = ((Number) pairB2.getFirst()).intValue();
                    arrayList.addAll((Collection) pairB2.getSecond());
                    j = jTransmitIndexToDateTime;
                    i = iIntValue2;
                    i2 = 10;
                }
                if (longRef.element == -1) {
                    HMLog.info(SleepTonalityViewModel.j, a.a);
                    this.d.getShowSleepTonality().postValue(Boxing.boxBoolean(false));
                    return Unit.INSTANCE;
                }
                HMLog.info(SleepTonalityViewModel.j, new b(this.b, stringToLong, longRef, i2));
                TonalityDisplayDataInfo tonalityDisplayDataInfo = new TonalityDisplayDataInfo(this.b, stringToLong, longRef.element, j, i2, this.c.getHasSleep(), arrayList, i);
                ITonalityRepos iTonalityRepos = this.d.repo;
                this.a = 1;
                objFetchSleepTonalityData = iTonalityRepos.fetchSleepTonalityData(tonalityDisplayDataInfo, this);
                if (objFetchSleepTonalityData == coroutine_suspended) {
                    return coroutine_suspended;
                }
                C0576c c0576c = new C0576c(this.d, null);
                this.a = 2;
                if (FlowKt.collectLatest((Flow) objFetchSleepTonalityData, c0576c, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                return Unit.INSTANCE;
            }
        }

        public g(Continuation<? super g> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return SleepTonalityViewModel.this.new g(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((g) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            int i = this.a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                SleepInfo value = SleepTonalityViewModel.this.getDaySportLiveData().getValue();
                if (value == null || (!value.getHasSleep() && value.getOddStageSleep().isEmpty())) {
                    HMLog.info(SleepTonalityViewModel.j, a.a);
                    SleepTonalityViewModel.this.getShowSleepTonality().setValue(Boxing.boxBoolean(false));
                    return Unit.INSTANCE;
                }
                String value2 = SleepTonalityViewModel.this.getDayLiveData().getValue();
                if (value2 == null || value2.length() == 0) {
                    HMLog.info(SleepTonalityViewModel.j, b.a);
                    SleepTonalityViewModel.this.getShowSleepTonality().setValue(Boxing.boxBoolean(false));
                    return Unit.INSTANCE;
                }
                CoroutineDispatcher io2 = Dispatchers.getIO();
                c cVar = new c(value2, value, SleepTonalityViewModel.this, null);
                this.a = 1;
                if (BuildersKt.withContext(io2, cVar, this) == coroutine_suspended) {
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
    public static final class h extends Lambda implements Function0<MutableLiveData<Boolean>> {
        public static final h a = new h();

        public h() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final MutableLiveData<Boolean> getA() {
            return new MutableLiveData<>();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.sleep.daysleep.tonality.SleepTonalityViewModel$hadRatingByDateKey$1", f = "SleepTonalityViewModel.kt", i = {}, l = {294}, m = "invokeSuspend", n = {}, s = {})
    public static final class i extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ String b;
        public final /* synthetic */ SleepTonalityViewModel c;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        @DebugMetadata(c = "com.huami.sleep.daysleep.tonality.SleepTonalityViewModel$hadRatingByDateKey$1$1", f = "SleepTonalityViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            public int a;
            public final /* synthetic */ String b;
            public final /* synthetic */ SleepTonalityViewModel c;

            /* JADX INFO: renamed from: com.huami.sleep.daysleep.tonality.SleepTonalityViewModel$i$a$a, reason: collision with other inner class name */
            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
            public static final class C0577a extends Lambda implements Function0<String> {
                public final /* synthetic */ RatingCacheBean a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C0577a(RatingCacheBean ratingCacheBean) {
                    super(0);
                    this.a = ratingCacheBean;
                }

                @Override // kotlin.jvm.functions.Function0
                @Nullable
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final String getA() {
                    return "hadRatingByDateKey ratingCacheBean = " + this.a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(String str, SleepTonalityViewModel sleepTonalityViewModel, Continuation<? super a> continuation) {
                super(2, continuation);
                this.b = str;
                this.c = sleepTonalityViewModel;
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
                RatingCacheBean ratingCacheBeanQueryRatingCacheBeanByKey = KoinExtKt.getSleepRoomDaoHelper().getRatingCacheDao().queryRatingCacheBeanByKey(this.b, this.c.userId);
                HMLog.info(SleepTonalityViewModel.j, new C0577a(ratingCacheBeanQueryRatingCacheBeanByKey));
                this.c.getHadRating().postValue(Boxing.boxBoolean(ratingCacheBeanQueryRatingCacheBeanByKey != null));
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(String str, SleepTonalityViewModel sleepTonalityViewModel, Continuation<? super i> continuation) {
            super(2, continuation);
            this.b = str;
            this.c = sleepTonalityViewModel;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new i(this.b, this.c, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((i) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            int i = this.a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                CoroutineDispatcher io2 = Dispatchers.getIO();
                a aVar = new a(this.b, this.c, null);
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

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.sleep.daysleep.tonality.SleepTonalityViewModel$reportRatingToCloud$1", f = "SleepTonalityViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class j extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ int c;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class a extends Lambda implements Function0<String> {
            public static final a a = new a();

            public a() {
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
        public j(int i, Continuation<? super j> continuation) {
            super(2, continuation);
            this.c = i;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return SleepTonalityViewModel.this.new j(this.c, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((j) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            if (this.a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            try {
                String strReportTonalityRating = SleepTonalityViewModel.this.iApiTonalityRating.reportTonalityRating(KoinExtKt.getAccountInfo().getUserId(), this.c);
                if (strReportTonalityRating == null) {
                    SleepTonalityViewModel.this.getReportSuccess().postValue(Boxing.boxBoolean(false));
                    return Unit.INSTANCE;
                }
                boolean zAreEqual = Intrinsics.areEqual(new JSONObject(strReportTonalityRating).getString("message"), "success");
                if (zAreEqual) {
                    SleepTonalityViewModel.this.a(this.c);
                }
                SleepTonalityViewModel.this.getReportSuccess().postValue(Boxing.boxBoolean(zAreEqual));
                return Unit.INSTANCE;
            } catch (Exception e) {
                HMLog.error$default(SleepTonalityViewModel.j, null, e, a.a, 2, null);
                SleepTonalityViewModel.this.getReportSuccess().postValue(Boxing.boxBoolean(false));
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n"}, d2 = {"Landroidx/lifecycle/MutableLiveData;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class k extends Lambda implements Function0<MutableLiveData<Boolean>> {
        public static final k a = new k();

        public k() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final MutableLiveData<Boolean> getA() {
            return new MutableLiveData<>();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n"}, d2 = {"Landroidx/lifecycle/MutableLiveData;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class l extends Lambda implements Function0<MutableLiveData<Boolean>> {
        public static final l a = new l();

        public l() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final MutableLiveData<Boolean> getA() {
            return new MutableLiveData<>();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0000H\n"}, d2 = {"Landroidx/lifecycle/MutableLiveData;", "Lcom/huami/sleep/daysleep/tonality/bean/SleepTonalityBean;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class m extends Lambda implements Function0<MutableLiveData<SleepTonalityBean>> {
        public static final m a = new m();

        public m() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final MutableLiveData<SleepTonalityBean> getA() {
            return new MutableLiveData<>();
        }
    }

    public SleepTonalityViewModel(@NotNull String str, @NotNull ITonalityRepos iTonalityRepos, @NotNull IApiTonalityRating iApiTonalityRating) {
        this.userId = str;
        this.repo = iTonalityRepos;
        this.iApiTonalityRating = iApiTonalityRating;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a(int score) {
        HMLog.info(j, new a());
        String value = getDayLiveData().getValue();
        if (value == null) {
            return;
        }
        KoinExtKt.getSleepRoomDaoHelper().getRatingCacheDao().insertOrReplaceRatingCacheBean(new RatingCacheBean(this.userId, value, score));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v2, types: [T, com.xiaomi.hm.health.dataprocess.StageSleep] */
    public final Pair<Integer, List<Long>> b(long baseTime, List<? extends StageSleep> stageSleepList) {
        int i2;
        StageSleep stageSleep = (StageSleep) CollectionsKt.lastOrNull((List) stageSleepList);
        int i3 = stageSleep == null ? 0 : stageSleep.stop;
        HMLog.info(j, new c(i3));
        ArrayList arrayList = new ArrayList();
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        int i4 = 0;
        boolean z = false;
        for (Object obj : stageSleepList) {
            int i5 = i4 + 1;
            if (i4 < 0) {
                CollectionsKt__CollectionsKt.throwIndexOverflow();
            }
            ?? r10 = (StageSleep) obj;
            if (i4 == 0) {
                long jTransmitIndexToDateTime = ChartTransmitUtil.INSTANCE.transmitIndexToDateTime(r10.start, baseTime);
                HMLog.info(j, new d(jTransmitIndexToDateTime, i4));
                arrayList.add(Long.valueOf(jTransmitIndexToDateTime));
            }
            T t = objectRef.element;
            if (t != 0 && Math.abs(((StageSleep) t).stop - r10.start) > 60) {
                HMLog.info(j, new e(objectRef, r10));
                z = true;
            }
            if (z && ((i2 = r10.mode) == 8 || i2 == 5 || i2 == 4)) {
                long jTransmitIndexToDateTime2 = ChartTransmitUtil.INSTANCE.transmitIndexToDateTime(r10.start, baseTime);
                HMLog.info(j, new f(jTransmitIndexToDateTime2, i4));
                arrayList.add(Long.valueOf(jTransmitIndexToDateTime2));
                z = false;
            }
            if (r10.mode == 7) {
                z = true;
            }
            objectRef.element = r10;
            i4 = i5;
        }
        return new Pair<>(Integer.valueOf(i3), arrayList);
    }

    public final void fetchSleepTonalityData() {
        kotlinx.coroutines.e.f(ViewModelKt.getViewModelScope(this), null, null, new g(null), 3, null);
    }

    @NotNull
    public final MutableLiveData<String> getDayLiveData() {
        return (MutableLiveData) this.dayLiveData.getValue();
    }

    @NotNull
    public final LiveData<SleepInfo> getDaySportLiveData() {
        return this.daySportLiveData;
    }

    @NotNull
    public final MutableLiveData<Boolean> getHadRating() {
        return (MutableLiveData) this.hadRating.getValue();
    }

    @NotNull
    public final MutableLiveData<Boolean> getReportSuccess() {
        return (MutableLiveData) this.reportSuccess.getValue();
    }

    @NotNull
    public final MutableLiveData<Boolean> getShowSleepTonality() {
        return (MutableLiveData) this.showSleepTonality.getValue();
    }

    @NotNull
    public final MutableLiveData<SleepTonalityBean> getSleepTonalityDataLiveData() {
        return (MutableLiveData) this.sleepTonalityDataLiveData.getValue();
    }

    public final void hadRatingByDateKey(@Nullable String dateKey) {
        if (dateKey == null) {
            return;
        }
        kotlinx.coroutines.e.f(ViewModelKt.getViewModelScope(this), null, null, new i(dateKey, this, null), 3, null);
    }

    public final void reportRatingToCloud(int ratingScore) {
        kotlinx.coroutines.e.f(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), null, new j(ratingScore, null), 2, null);
    }

    public final void triggerDataFetch(@NotNull String keyDate) {
        getDayLiveData().setValue(keyDate);
    }
}
