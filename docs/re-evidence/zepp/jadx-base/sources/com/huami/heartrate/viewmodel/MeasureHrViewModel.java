package com.huami.heartrate.viewmodel;

import android.content.Context;
import androidx.core.content.ContextCompat;
import androidx.core.content.res.ResourcesCompat;
import androidx.p008lifecycle.LiveData;
import androidx.p008lifecycle.MutableLiveData;
import androidx.p008lifecycle.ViewModel;
import androidx.p008lifecycle.ViewModelKt;
import com.amap.api.mapcore.util.hl;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.heartrate.R;
import com.huami.heartrate.koin.HeartRateScopeKt;
import com.huami.heartrate.repository.entity.HeartRateEntity;
import com.huami.heartrate.repository.entity.PagingRemoteHeartRateData;
import com.huami.heartrate.repository.entity.RemoteHeartRateData;
import com.huami.heartrate.repository.entity.RemoteHeartRateItem;
import com.huami.heartrate.repository.local.KvHelper;
import com.huami.heartrate.ui.HistoryListValueData;
import com.huami.heartrate.ui.HistoryViewTypeData;
import com.huami.heartrate.ui.ListData;
import com.huami.heartrate.ui.TitleData;
import com.huami.heartrate.usecase.FetchRemoteMeasureHrUseCase;
import com.huami.heartrate.usecase.GetLocalMeasureHRDataUseCase;
import com.huami.heartrate.usecase.InsertMeasureHrToDbUseCase;
import com.huami.heartrate.usecase.QueryEarliestSyncedHeartRateUseCase;
import com.huami.heartrate.utils.CoroutinueExtKt;
import com.huami.heartrate.utils.ExtensionUtilsKt;
import com.huami.heartrate.utils.HeartRateTimeUtils;
import com.huami.heartrate.utils.SpannableStringKt;
import com.huami.heartrate.utils.UIUtilsKt;
import com.huami.hmdateformat.date.HMDataFormatKt;
import com.huami.hmdateformat.date.HMPattern;
import com.huami.tools.analytics.DbUtils;
import com.loc.z;
import com.xiaomi.hm.health.timeutil.TimeUtils;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.koin.core.Koin;
import org.koin.core.component.KoinComponent;
import org.koin.core.qualifier.Qualifier;
import org.koin.core.scope.Scope;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u008c\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u0000 Q2\u00020\u00012\u00020\u0002:\u0001QB\u000f\u0012\u0006\u0010N\u001a\u00020M¢\u0006\u0004\bO\u0010PJ\u0013\u0010\u0004\u001a\u00020\u0003H\u0082@ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005J\u001b\u0010\b\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0006H\u0082@ø\u0001\u0000¢\u0006\u0004\b\b\u0010\tJ\u001b\u0010\n\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0006H\u0082@ø\u0001\u0000¢\u0006\u0004\b\n\u0010\tJ#\u0010\u000e\u001a\u00020\u00032\u000e\u0010\r\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000bH\u0082@ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000fJ\u0019\u0010\u0012\u001a\u00020\u00032\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J \u0010\u0014\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u00062\u000e\u0010\r\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000bH\u0002J\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u000bJ\u0016\u0010\u0019\u001a\u00020\u00032\u0006\u0010\u0017\u001a\u00020\u00102\u0006\u0010\u0018\u001a\u00020\u0010J\u000e\u0010\u001a\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0006J\u0006\u0010\u001b\u001a\u00020\u0003R+\u0010!\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b0\u001c8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R#\u0010$\u001a\b\u0012\u0004\u0012\u00020\f0\u001c8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\"\u0010\u001e\u001a\u0004\b#\u0010 R\u001c\u0010'\u001a\b\u0012\u0004\u0012\u00020%0\u001c8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010&R&\u0010,\u001a\u0012\u0012\u0004\u0012\u00020\u00150(j\b\u0012\u0004\u0012\u00020\u0015`)8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u001d\u00101\u001a\u00020-8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b.\u0010\u001e\u001a\u0004\b/\u00100R\u001d\u00104\u001a\u0002028B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\n\u0010\u001e\u001a\u0004\b.\u00103R\u001d\u00108\u001a\u0002058B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b/\u0010\u001e\u001a\u0004\b6\u00107R\u001d\u0010;\u001a\u0002098B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b6\u0010\u001e\u001a\u0004\b\u001d\u0010:R\u001d\u0010>\u001a\u00020<8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001f\u0010\u001e\u001a\u0004\b\"\u0010=R\u0018\u0010@\u001a\u0004\u0018\u00010\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010?R\u0016\u0010B\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\b\u0010AR\u0016\u0010E\u001a\u00020%8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bC\u0010DR\u0019\u0010I\u001a\b\u0012\u0004\u0012\u00020\f0F8F@\u0006¢\u0006\u0006\u001a\u0004\bG\u0010HR!\u0010K\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b0F8F@\u0006¢\u0006\u0006\u001a\u0004\bJ\u0010HR\u0019\u0010L\u001a\b\u0012\u0004\u0012\u00020%0F8F@\u0006¢\u0006\u0006\u001a\u0004\bL\u0010H\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006R"}, d2 = {"Lcom/huami/heartrate/viewmodel/MeasureHrViewModel;", "Landroidx/lifecycle/ViewModel;", "Lorg/koin/core/component/KoinComponent;", "", "m", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, hl.k, "(Landroid/content/Context;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "f", "", "Lcom/huami/heartrate/repository/entity/HeartRateEntity;", "list", GoogleApiAvailabilityLight.b, "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "nextSeconds", "o", "(Ljava/lang/Long;)V", z.j, "Lcom/huami/heartrate/ui/HistoryViewTypeData;", "getHistoryViewTypeDataList", "dateFrom", "dateEnd", "fetchMeasureHr", "fetchMeasureHrByPaging", "queryLatestSyncedMeasureHr", "Landroidx/lifecycle/MutableLiveData;", "a", "Lkotlin/Lazy;", "i", "()Landroidx/lifecycle/MutableLiveData;", "remoteMeasureMutableLiveData", "b", "c", "latestSyncedMeasureHrMutableLiveData", "", "Landroidx/lifecycle/MutableLiveData;", "isNoMoreDataMutableLiveData", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", GoogleApiAvailabilityLight.a, "Ljava/util/ArrayList;", "historyViewTypeDataList", "Lcom/huami/heartrate/usecase/FetchRemoteMeasureHrUseCase;", "e", "g", "()Lcom/huami/heartrate/usecase/FetchRemoteMeasureHrUseCase;", "measureHrUseCase", "Lcom/huami/heartrate/usecase/GetLocalMeasureHRDataUseCase;", "()Lcom/huami/heartrate/usecase/GetLocalMeasureHRDataUseCase;", "localMeasureHrUseCase", "Lcom/huami/heartrate/usecase/QueryEarliestSyncedHeartRateUseCase;", "h", "()Lcom/huami/heartrate/usecase/QueryEarliestSyncedHeartRateUseCase;", "queryRestHeartRateByDayUseCase", "Lcom/huami/heartrate/usecase/InsertMeasureHrToDbUseCase;", "()Lcom/huami/heartrate/usecase/InsertMeasureHrToDbUseCase;", "insertMeasureHrToDbUseCase", "Lcom/huami/heartrate/repository/local/KvHelper;", "()Lcom/huami/heartrate/repository/local/KvHelper;", "kvHelper", "Ljava/lang/Long;", "mToHrTime", "J", "mFromHrTime", "l", "Z", "isLoading", "Landroidx/lifecycle/LiveData;", "getLatestSyncedMeasureHrLiveData", "()Landroidx/lifecycle/LiveData;", "latestSyncedMeasureHrLiveData", "getRemoteMeasureLiveData", "remoteMeasureLiveData", "isNoMoreDataLiveData", "", "userId", "<init>", "(Ljava/lang/String;)V", "Companion", "heartrate_release"}, k = 1, mv = {1, 5, 1})
public final class MeasureHrViewModel extends ViewModel implements KoinComponent {
    public static final int MEASURE_HR_LIMIT = 100;
    public static final int TYPE_WATCH = 1;

    @NotNull
    private static final String m = "MeasureHrViewModel";

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final Lazy remoteMeasureMutableLiveData = LazyKt__LazyJVMKt.lazy(i.a);

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final Lazy latestSyncedMeasureHrMutableLiveData = LazyKt__LazyJVMKt.lazy(e.a);

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final MutableLiveData<Boolean> isNoMoreDataMutableLiveData = new MutableLiveData<>();

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private final ArrayList<HistoryViewTypeData> historyViewTypeDataList = new ArrayList<>();

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    private final Lazy measureHrUseCase;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    private final Lazy localMeasureHrUseCase;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    private final Lazy queryRestHeartRateByDayUseCase;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @NotNull
    private final Lazy insertMeasureHrToDbUseCase;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @NotNull
    private final Lazy kvHelper;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    @Nullable
    private volatile Long mToHrTime;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    private volatile long mFromHrTime;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    private volatile boolean isLoading;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.heartrate.viewmodel.MeasureHrViewModel$fetchMeasureHr$1", f = "MeasureHrViewModel.kt", i = {}, l = {109, 119}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ long c;
        public final /* synthetic */ long d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(long j, long j2, Continuation<? super a> continuation) {
            super(2, continuation);
            this.c = j;
            this.d = j2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return MeasureHrViewModel.this.new a(this.c, this.d, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            List<RemoteHeartRateItem> items;
            Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            int i = this.a;
            boolean z = true;
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
            FetchRemoteMeasureHrUseCase fetchRemoteMeasureHrUseCaseG = MeasureHrViewModel.this.g();
            long j = this.c;
            long j2 = this.d;
            this.a = 1;
            obj = fetchRemoteMeasureHrUseCaseG.fetchRemoteMeasureHrUseCase(j, j2, (4 & 4) != 0 ? 100 : 0, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
            RemoteHeartRateData remoteHeartRateData = (RemoteHeartRateData) obj;
            List<HeartRateEntity> listConvertHeartRate = null;
            if (remoteHeartRateData != null && (items = remoteHeartRateData.getItems()) != null) {
                listConvertHeartRate = MeasureHrViewModelKt.convertHeartRate(items);
            }
            MeasureHrViewModel.this.i().postValue(listConvertHeartRate);
            if (listConvertHeartRate != null && !listConvertHeartRate.isEmpty()) {
                z = false;
            }
            if (!z && MeasureHrViewModel.this.getRemoteMeasureLiveData().hasActiveObservers()) {
                InsertMeasureHrToDbUseCase insertMeasureHrToDbUseCaseA = MeasureHrViewModel.this.a();
                List<HeartRateEntity> listSorted = CollectionsKt___CollectionsKt.sorted(listConvertHeartRate);
                this.a = 2;
                if (insertMeasureHrToDbUseCaseA.insertHeartRateList(listSorted, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            return Unit.INSTANCE;
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
        public final String invoke() {
            return "load from remote measure hr ";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function0<String> {
        public static final c a = new c();

        public c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "load from local measure hr ";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.heartrate.viewmodel.MeasureHrViewModel", f = "MeasureHrViewModel.kt", i = {0, 0}, l = {165}, m = "getMeasureHrFromDb", n = {"this", DbUtils.Const.Table.CONTEXT}, s = {"L$0", "L$1"})
    public static final class d extends ContinuationImpl {
        public Object a;
        public Object b;
        public /* synthetic */ Object c;
        public int e;

        public d(Continuation<? super d> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.c = obj;
            this.e |= Integer.MIN_VALUE;
            return MeasureHrViewModel.this.f(null, this);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n"}, d2 = {"Landroidx/lifecycle/MutableLiveData;", "Lcom/huami/heartrate/repository/entity/HeartRateEntity;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class e extends Lambda implements Function0<MutableLiveData<HeartRateEntity>> {
        public static final e a = new e();

        public e() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final MutableLiveData<HeartRateEntity> invoke() {
            return new MutableLiveData<>();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.heartrate.viewmodel.MeasureHrViewModel", f = "MeasureHrViewModel.kt", i = {0, 0}, l = {152}, m = "loadPagingHrFromDb", n = {"this", DbUtils.Const.Table.CONTEXT}, s = {"L$0", "L$1"})
    public static final class f extends ContinuationImpl {
        public Object a;
        public Object b;
        public /* synthetic */ Object c;
        public int e;

        public f(Continuation<? super f> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.c = obj;
            this.e |= Integer.MIN_VALUE;
            return MeasureHrViewModel.this.k(null, this);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.heartrate.viewmodel.MeasureHrViewModel", f = "MeasureHrViewModel.kt", i = {0, 1, 1}, l = {146, 147}, m = "loadPagingHrFromRemote", n = {"this", "this", "pagingRemoteHeartRateData"}, s = {"L$0", "L$0", "L$1"})
    public static final class g extends ContinuationImpl {
        public Object a;
        public Object b;
        public /* synthetic */ Object c;
        public int e;

        public g(Continuation<? super g> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.c = obj;
            this.e |= Integer.MIN_VALUE;
            return MeasureHrViewModel.this.m(this);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.heartrate.viewmodel.MeasureHrViewModel$queryLatestSyncedMeasureHr$1", f = "MeasureHrViewModel.kt", i = {}, l = {180}, m = "invokeSuspend", n = {}, s = {})
    public static final class h extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;

        public h(Continuation<? super h> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return MeasureHrViewModel.this.new h(continuation);
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
                QueryEarliestSyncedHeartRateUseCase queryEarliestSyncedHeartRateUseCaseH = MeasureHrViewModel.this.h();
                this.a = 1;
                obj = queryEarliestSyncedHeartRateUseCaseH.queryEarliestSyncedHeartRate(this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            HeartRateEntity heartRateEntity = (HeartRateEntity) obj;
            if (heartRateEntity != null) {
                MeasureHrViewModel.this.c().postValue(heartRateEntity);
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00010\u0000H\n"}, d2 = {"Landroidx/lifecycle/MutableLiveData;", "", "Lcom/huami/heartrate/repository/entity/HeartRateEntity;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class i extends Lambda implements Function0<MutableLiveData<List<? extends HeartRateEntity>>> {
        public static final i a = new i();

        public i() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final MutableLiveData<List<HeartRateEntity>> invoke() {
            return new MutableLiveData<>();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public MeasureHrViewModel(@NotNull String str) {
        final Scope hrScopeByUserId = HeartRateScopeKt.getHrScopeByUserId(str);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.SYNCHRONIZED;
        final Qualifier qualifier = null;
        final Object[] objArr = 0 == true ? 1 : 0;
        this.measureHrUseCase = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyMode, (Function0) new Function0<FetchRemoteMeasureHrUseCase>() { // from class: com.huami.heartrate.viewmodel.MeasureHrViewModel$special$$inlined$inject$default$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v1, types: [com.huami.heartrate.usecase.FetchRemoteMeasureHrUseCase, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final FetchRemoteMeasureHrUseCase invoke() {
                return hrScopeByUserId.get(Reflection.getOrCreateKotlinClass(FetchRemoteMeasureHrUseCase.class), qualifier, objArr);
            }
        });
        final Scope hrScopeByUserId2 = HeartRateScopeKt.getHrScopeByUserId(str);
        final Object[] objArr2 = 0 == true ? 1 : 0;
        final Object[] objArr3 = 0 == true ? 1 : 0;
        this.localMeasureHrUseCase = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyMode, (Function0) new Function0<GetLocalMeasureHRDataUseCase>() { // from class: com.huami.heartrate.viewmodel.MeasureHrViewModel$special$$inlined$inject$default$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v1, types: [com.huami.heartrate.usecase.GetLocalMeasureHRDataUseCase, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final GetLocalMeasureHRDataUseCase invoke() {
                return hrScopeByUserId2.get(Reflection.getOrCreateKotlinClass(GetLocalMeasureHRDataUseCase.class), objArr2, objArr3);
            }
        });
        final Scope hrScopeByUserId3 = HeartRateScopeKt.getHrScopeByUserId(str);
        final Object[] objArr4 = 0 == true ? 1 : 0;
        final Object[] objArr5 = 0 == true ? 1 : 0;
        this.queryRestHeartRateByDayUseCase = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyMode, (Function0) new Function0<QueryEarliestSyncedHeartRateUseCase>() { // from class: com.huami.heartrate.viewmodel.MeasureHrViewModel$special$$inlined$inject$default$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v1, types: [com.huami.heartrate.usecase.QueryEarliestSyncedHeartRateUseCase, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final QueryEarliestSyncedHeartRateUseCase invoke() {
                return hrScopeByUserId3.get(Reflection.getOrCreateKotlinClass(QueryEarliestSyncedHeartRateUseCase.class), objArr4, objArr5);
            }
        });
        final Scope hrScopeByUserId4 = HeartRateScopeKt.getHrScopeByUserId(str);
        final Object[] objArr6 = 0 == true ? 1 : 0;
        final Object[] objArr7 = 0 == true ? 1 : 0;
        this.insertMeasureHrToDbUseCase = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyMode, (Function0) new Function0<InsertMeasureHrToDbUseCase>() { // from class: com.huami.heartrate.viewmodel.MeasureHrViewModel$special$$inlined$inject$default$4
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v1, types: [com.huami.heartrate.usecase.InsertMeasureHrToDbUseCase, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final InsertMeasureHrToDbUseCase invoke() {
                return hrScopeByUserId4.get(Reflection.getOrCreateKotlinClass(InsertMeasureHrToDbUseCase.class), objArr6, objArr7);
            }
        });
        final Scope hrScopeByUserId5 = HeartRateScopeKt.getHrScopeByUserId(str);
        final Object[] objArr8 = 0 == true ? 1 : 0;
        final Object[] objArr9 = 0 == true ? 1 : 0;
        this.kvHelper = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyMode, (Function0) new Function0<KvHelper>() { // from class: com.huami.heartrate.viewmodel.MeasureHrViewModel$special$$inlined$inject$default$5
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v1, types: [com.huami.heartrate.repository.local.KvHelper, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final KvHelper invoke() {
                return hrScopeByUserId5.get(Reflection.getOrCreateKotlinClass(KvHelper.class), objArr8, objArr9);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final InsertMeasureHrToDbUseCase a() {
        return (InsertMeasureHrToDbUseCase) this.insertMeasureHrToDbUseCase.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final KvHelper b() {
        return (KvHelper) this.kvHelper.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final MutableLiveData<HeartRateEntity> c() {
        return (MutableLiveData) this.latestSyncedMeasureHrMutableLiveData.getValue();
    }

    private final GetLocalMeasureHRDataUseCase e() {
        return (GetLocalMeasureHRDataUseCase) this.localMeasureHrUseCase.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object f(Context context, Continuation<? super Unit> continuation) throws Exception {
        d dVar;
        MeasureHrViewModel measureHrViewModel;
        HeartRateEntity heartRateEntity;
        Long lBoxLong;
        if (continuation instanceof d) {
            dVar = (d) continuation;
            int i2 = dVar.e;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                dVar.e = i2 - Integer.MIN_VALUE;
            } else {
                dVar = new d(continuation);
            }
        } else {
            dVar = new d(continuation);
        }
        d dVar2 = dVar;
        Object localMeasureHRData = dVar2.c;
        Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
        int i3 = dVar2.e;
        if (i3 == 0) {
            ResultKt.throwOnFailure(localMeasureHRData);
            GetLocalMeasureHRDataUseCase getLocalMeasureHRDataUseCaseE = e();
            long j = this.mFromHrTime;
            Long l = this.mToHrTime;
            long jMillsToSecond = l == null ? ExtensionUtilsKt.millsToSecond(System.currentTimeMillis()) : l.longValue();
            dVar2.a = this;
            dVar2.b = context;
            dVar2.e = 1;
            localMeasureHRData = getLocalMeasureHRDataUseCaseE.getLocalMeasureHRData(j, jMillsToSecond - 1, dVar2);
            if (localMeasureHRData == coroutine_suspended) {
                return coroutine_suspended;
            }
            measureHrViewModel = this;
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            context = (Context) dVar2.b;
            measureHrViewModel = (MeasureHrViewModel) dVar2.a;
            ResultKt.throwOnFailure(localMeasureHRData);
        }
        List<HeartRateEntity> list = (List) localMeasureHRData;
        if (list == null || (heartRateEntity = (HeartRateEntity) CollectionsKt.lastOrNull((List) list)) == null || (lBoxLong = Boxing.boxLong(heartRateEntity.getTime())) == null) {
            lBoxLong = Boxing.boxLong(0L);
        }
        measureHrViewModel.mToHrTime = lBoxLong;
        measureHrViewModel.j(context, list);
        Long lastSyncSeconds = measureHrViewModel.b().getLastSyncSeconds();
        if (lastSyncSeconds != null && lastSyncSeconds.longValue() == 0) {
            measureHrViewModel.isNoMoreDataMutableLiveData.postValue(Boxing.boxBoolean(true));
        } else {
            measureHrViewModel.isNoMoreDataMutableLiveData.postValue(Boxing.boxBoolean(false));
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final FetchRemoteMeasureHrUseCase g() {
        return (FetchRemoteMeasureHrUseCase) this.measureHrUseCase.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final QueryEarliestSyncedHeartRateUseCase h() {
        return (QueryEarliestSyncedHeartRateUseCase) this.queryRestHeartRateByDayUseCase.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final MutableLiveData<List<HeartRateEntity>> i() {
        return (MutableLiveData) this.remoteMeasureMutableLiveData.getValue();
    }

    private final void j(Context context, List<HeartRateEntity> list) throws Exception {
        boolean zAdd;
        if (list == null) {
            return;
        }
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
        for (HeartRateEntity heartRateEntity : list) {
            Date date = new Date(ExtensionUtilsKt.secondToMills(heartRateEntity.getTime()));
            String year = HeartRateTimeUtils.INSTANCE.formatYear(context, date);
            String formatTime$default = HMDataFormatKt.getFormatTime$default(date, HMPattern.ABBR_MONTH_DAY, (Locale) null, 2, (Object) null);
            HistoryListValueData historyListValueData = new HistoryListValueData(year, formatTime$default, TimeUtils.formatTime(context, date), SpannableStringKt.getDigitsSpannableStringBuilder(UIUtilsKt.stringFormat(ExtensionUtilsKt.formatIntOrDefaultText(heartRateEntity.getHr()), context.getString(R.string.heart_rate_unit_bpm)), ResourcesCompat.getFont(context, R.font.maisonneue), UIUtilsKt.spToPx(context, 20.0f), ContextCompat.getColor(context, R.color.s1)));
            HistoryViewTypeData historyViewTypeData = (HistoryViewTypeData) CollectionsKt.lastOrNull((List) this.historyViewTypeDataList);
            if (historyViewTypeData != null) {
                if (historyViewTypeData instanceof ListData) {
                    ListData listData = (ListData) historyViewTypeData;
                    ArrayList<HistoryListValueData> list2 = listData.getList();
                    if (!(list2 == null || list2.isEmpty())) {
                        HistoryListValueData historyListValueData2 = (HistoryListValueData) CollectionsKt.last((List) listData.getList());
                        if (!Intrinsics.areEqual(historyListValueData2.getYear(), historyListValueData.getYear())) {
                            this.historyViewTypeDataList.add(new TitleData(year, formatTime$default, false, 4, null));
                            zAdd = this.historyViewTypeDataList.add(new ListData(CollectionsKt__CollectionsKt.arrayListOf(historyListValueData)));
                        } else if (Intrinsics.areEqual(historyListValueData2.getDate(), historyListValueData.getDate())) {
                            zAdd = listData.getList().add(historyListValueData);
                        } else {
                            this.historyViewTypeDataList.add(new TitleData(year, formatTime$default, false));
                            zAdd = this.historyViewTypeDataList.add(new ListData(CollectionsKt__CollectionsKt.arrayListOf(historyListValueData)));
                        }
                    }
                }
                throw new Exception("historyViewTypeDataList data type error");
            }
            this.historyViewTypeDataList.add(new TitleData(year, formatTime$default, false, 4, null));
            zAdd = this.historyViewTypeDataList.add(new ListData(CollectionsKt__CollectionsKt.arrayListOf(historyListValueData)));
            arrayList.add(Boolean.valueOf(zAdd));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object k(Context context, Continuation<? super Unit> continuation) throws Exception {
        f fVar;
        MeasureHrViewModel measureHrViewModel;
        HeartRateEntity heartRateEntity;
        Long lBoxLong;
        if (continuation instanceof f) {
            fVar = (f) continuation;
            int i2 = fVar.e;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                fVar.e = i2 - Integer.MIN_VALUE;
            } else {
                fVar = new f(continuation);
            }
        } else {
            fVar = new f(continuation);
        }
        f fVar2 = fVar;
        Object objQueryLocalMeasureHrByLimit$default = fVar2.c;
        Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
        int i3 = fVar2.e;
        if (i3 == 0) {
            ResultKt.throwOnFailure(objQueryLocalMeasureHrByLimit$default);
            GetLocalMeasureHRDataUseCase getLocalMeasureHRDataUseCaseE = e();
            Long l = this.mToHrTime;
            long jMillsToSecond = l == null ? ExtensionUtilsKt.millsToSecond(System.currentTimeMillis()) : l.longValue();
            fVar2.a = this;
            fVar2.b = context;
            fVar2.e = 1;
            objQueryLocalMeasureHrByLimit$default = GetLocalMeasureHRDataUseCase.queryLocalMeasureHrByLimit$default(getLocalMeasureHRDataUseCaseE, jMillsToSecond - 1, 0, fVar2, 2, null);
            if (objQueryLocalMeasureHrByLimit$default == coroutine_suspended) {
                return coroutine_suspended;
            }
            measureHrViewModel = this;
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            context = (Context) fVar2.b;
            measureHrViewModel = (MeasureHrViewModel) fVar2.a;
            ResultKt.throwOnFailure(objQueryLocalMeasureHrByLimit$default);
        }
        List<HeartRateEntity> list = (List) objQueryLocalMeasureHrByLimit$default;
        measureHrViewModel.mToHrTime = (list == null || (heartRateEntity = (HeartRateEntity) CollectionsKt.lastOrNull((List) list)) == null || (lBoxLong = Boxing.boxLong(heartRateEntity.getTime())) == null) ? Boxing.boxLong(0L) : lBoxLong;
        measureHrViewModel.j(context, list);
        if (list == null || list.size() < 100) {
            measureHrViewModel.isNoMoreDataMutableLiveData.postValue(Boxing.boxBoolean(true));
        } else {
            measureHrViewModel.isNoMoreDataMutableLiveData.postValue(Boxing.boxBoolean(false));
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:33:0x0082  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object m(Continuation<? super Unit> continuation) {
        g gVar;
        MeasureHrViewModel measureHrViewModel;
        List<RemoteHeartRateItem> items;
        MeasureHrViewModel measureHrViewModel2;
        PagingRemoteHeartRateData pagingRemoteHeartRateData;
        if (continuation instanceof g) {
            gVar = (g) continuation;
            int i2 = gVar.e;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                gVar.e = i2 - Integer.MIN_VALUE;
            } else {
                gVar = new g(continuation);
            }
        } else {
            gVar = new g(continuation);
        }
        Object objFetchRemoteMeasureHrByPaging$default = gVar.c;
        Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
        int i3 = gVar.e;
        if (i3 != 0) {
            if (i3 == 1) {
                measureHrViewModel = (MeasureHrViewModel) gVar.a;
                ResultKt.throwOnFailure(objFetchRemoteMeasureHrByPaging$default);
            } else {
                if (i3 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                pagingRemoteHeartRateData = (PagingRemoteHeartRateData) gVar.b;
                measureHrViewModel2 = (MeasureHrViewModel) gVar.a;
                ResultKt.throwOnFailure(objFetchRemoteMeasureHrByPaging$default);
            }
            measureHrViewModel2.o(pagingRemoteHeartRateData != null ? pagingRemoteHeartRateData.getNext() : null);
            return Unit.INSTANCE;
        }
        ResultKt.throwOnFailure(objFetchRemoteMeasureHrByPaging$default);
        FetchRemoteMeasureHrUseCase fetchRemoteMeasureHrUseCaseG = g();
        Long l = this.mToHrTime;
        gVar.a = this;
        gVar.e = 1;
        objFetchRemoteMeasureHrByPaging$default = FetchRemoteMeasureHrUseCase.fetchRemoteMeasureHrByPaging$default(fetchRemoteMeasureHrUseCaseG, l, 0, gVar, 2, null);
        if (objFetchRemoteMeasureHrByPaging$default == coroutine_suspended) {
            return coroutine_suspended;
        }
        measureHrViewModel = this;
        PagingRemoteHeartRateData pagingRemoteHeartRateData2 = (PagingRemoteHeartRateData) objFetchRemoteMeasureHrByPaging$default;
        List<HeartRateEntity> listConvertHeartRate = (pagingRemoteHeartRateData2 == null || (items = pagingRemoteHeartRateData2.getItems()) == null) ? null : MeasureHrViewModelKt.convertHeartRate(items);
        gVar.a = measureHrViewModel;
        gVar.b = pagingRemoteHeartRateData2;
        gVar.e = 2;
        if (measureHrViewModel.n(listConvertHeartRate, gVar) == coroutine_suspended) {
            return coroutine_suspended;
        }
        measureHrViewModel2 = measureHrViewModel;
        pagingRemoteHeartRateData = pagingRemoteHeartRateData2;
        measureHrViewModel2.o(pagingRemoteHeartRateData != null ? pagingRemoteHeartRateData.getNext() : null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object n(List<HeartRateEntity> list, Continuation<? super Unit> continuation) {
        if ((list == null || list.isEmpty()) || !isNoMoreDataLiveData().hasActiveObservers()) {
            return Unit.INSTANCE;
        }
        Object objInsertHeartRateList = a().insertHeartRateList(CollectionsKt___CollectionsKt.sorted(list), continuation);
        return objInsertHeartRateList == kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED() ? objInsertHeartRateList : Unit.INSTANCE;
    }

    private final void o(Long nextSeconds) {
        this.mFromHrTime = nextSeconds == null ? 0L : nextSeconds.longValue();
        KvHelper kvHelperB = b();
        if (nextSeconds == null) {
            nextSeconds = 0L;
        }
        kvHelperB.setLastSyncSeconds(nextSeconds);
    }

    public final void fetchMeasureHr(long dateFrom, long dateEnd) {
        kotlinx.coroutines.e.f(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), null, new a(dateFrom, dateEnd, null), 2, null);
    }

    public final void fetchMeasureHrByPaging(@NotNull Context context) {
        kotlinx.coroutines.e.f(ViewModelKt.getViewModelScope(this), CoroutinueExtKt.getExceptionHandler().plus(Dispatchers.getIO()), null, new MeasureHrViewModel$fetchMeasureHrByPaging$$inlined$safeLaunch$1(null, this, context), 2, null);
    }

    @NotNull
    public final List<HistoryViewTypeData> getHistoryViewTypeDataList() {
        return this.historyViewTypeDataList;
    }

    @Override // org.koin.core.component.KoinComponent
    @NotNull
    public Koin getKoin() {
        return KoinComponent.DefaultImpls.getKoin(this);
    }

    @NotNull
    public final LiveData<HeartRateEntity> getLatestSyncedMeasureHrLiveData() {
        return c();
    }

    @NotNull
    public final LiveData<List<HeartRateEntity>> getRemoteMeasureLiveData() {
        return i();
    }

    @NotNull
    public final LiveData<Boolean> isNoMoreDataLiveData() {
        return this.isNoMoreDataMutableLiveData;
    }

    public final void queryLatestSyncedMeasureHr() {
        kotlinx.coroutines.e.f(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), null, new h(null), 2, null);
    }
}
