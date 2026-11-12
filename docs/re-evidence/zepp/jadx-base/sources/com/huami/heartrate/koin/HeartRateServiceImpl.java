package com.huami.heartrate.koin;

import android.content.Context;
import androidx.exifinterface.media.ExifInterface;
import com.amap.api.mapcore.util.hl;
import com.baseflow.permissionhandler.m;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.account.service.AnonymousService;
import com.huami.heartrate.repository.entity.HeartRateData;
import com.huami.heartrate.repository.entity.HeartRateEntity;
import com.huami.heartrate.repository.entity.RemoteHeartRateData;
import com.huami.heartrate.repository.entity.RemoteHeartRateItem;
import com.huami.heartrate.repository.local.KvHelper;
import com.huami.heartrate.service.HeartRate;
import com.huami.heartrate.service.HeartRateInfo;
import com.huami.heartrate.service.IHeartRateService;
import com.huami.heartrate.usecase.FetchRemoteMeasureHrUseCase;
import com.huami.heartrate.usecase.GetLocalMeasureHRDataUseCase;
import com.huami.heartrate.usecase.GetWholeDayHrDataUseCase;
import com.huami.heartrate.usecase.HeartRateBigDataUseCase;
import com.huami.heartrate.usecase.QueryHeartRateUseCase;
import com.huami.heartrate.usecase.QueryManualHeartRateUseCase;
import com.huami.heartrate.usecase.QueryRestHeartRateByDayUseCase;
import com.huami.heartrate.utils.ExtensionUtilsKt;
import com.huami.heartrate.utils.HeartRateTimeUtils;
import com.huami.heartrate.view.AbsHeartRateChartView;
import com.huami.heartrate.view.HeartRateChartView;
import com.huami.heartrate.viewmodel.MeasureHrViewModelKt;
import com.huami.tools.analytics.DbUtils;
import com.huami.tools.log.HMLog;
import com.huami.widget.wheelview.Constant;
import com.loc.z;
import java.util.Date;
import java.util.List;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.koin.core.qualifier.Qualifier;
import org.koin.core.scope.Scope;
import org.koin.java.KoinJavaComponent;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0092\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 E2\u00020\u0001:\u0001EB\u0017\u0012\u0006\u0010\u001b\u001a\u00020\u0019\u0012\u0006\u0010\u001d\u001a\u00020\u0002¢\u0006\u0004\bC\u0010DJ\u001b\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0082@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006J\u0015\u0010\u0007\u001a\u0004\u0018\u00010\u0002H\u0082@ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\n\u001a\u0004\u0018\u00010\tH\u0082@ø\u0001\u0000¢\u0006\u0004\b\n\u0010\bJ\u0015\u0010\u000b\u001a\u0004\u0018\u00010\u0002H\u0082@ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\bJ\u0015\u0010\f\u001a\u0004\u0018\u00010\u0002H\u0082@ø\u0001\u0000¢\u0006\u0004\b\f\u0010\bJ\u0010\u0010\u000f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\rH\u0016J\u0010\u0010\u0011\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00100\rH\u0016J\u0018\u0010\u0014\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00100\r2\u0006\u0010\u0013\u001a\u00020\u0012H\u0016J\u0010\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0016\u001a\u00020\u0015H\u0016R\u0016\u0010\u001b\u001a\u00020\u00198\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u001aR\u0016\u0010\u001d\u001a\u00020\u00028\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u001cR\u001d\u0010\"\u001a\u00020\u001e8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000b\u0010\u001f\u001a\u0004\b \u0010!R\u001d\u0010&\u001a\u00020#8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\u001f\u001a\u0004\b$\u0010%R\u001d\u0010+\u001a\u00020'8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b(\u0010\u001f\u001a\u0004\b)\u0010*R\u001d\u00100\u001a\u00020,8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b-\u0010\u001f\u001a\u0004\b.\u0010/R\u001d\u00104\u001a\u0002018B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b)\u0010\u001f\u001a\u0004\b2\u00103R\u001d\u00108\u001a\u0002058B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b.\u0010\u001f\u001a\u0004\b6\u00107R\u001d\u0010<\u001a\u0002098B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b:\u0010\u001f\u001a\u0004\b(\u0010;R\u001d\u0010?\u001a\u00020=8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b6\u0010\u001f\u001a\u0004\b:\u0010>R\u001d\u0010B\u001a\u00020@8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b$\u0010\u001f\u001a\u0004\b-\u0010A\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006F"}, d2 = {"Lcom/huami/heartrate/koin/HeartRateServiceImpl;", "Lcom/huami/heartrate/service/IHeartRateService;", "", "time", "", "m", "(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "b", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/huami/heartrate/repository/entity/HeartRateData;", "a", "c", GoogleApiAvailabilityLight.a, "Lkotlinx/coroutines/flow/Flow;", "Lcom/huami/heartrate/service/HeartRate;", "loadLatestManualHeartRate", "Lcom/huami/heartrate/service/HeartRateInfo;", "loadLatestHeartRateInfo", "Ljava/util/Date;", "date", "loadHeartRateInfo", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "Lcom/huami/heartrate/view/AbsHeartRateChartView;", "buildHeartRateChartView", "", "Ljava/lang/String;", "userId", "J", "registerTime", "Lorg/koin/core/scope/Scope;", "Lkotlin/Lazy;", GoogleApiAvailabilityLight.b, "()Lorg/koin/core/scope/Scope;", "scope", "Lcom/huami/heartrate/usecase/QueryManualHeartRateUseCase;", hl.k, "()Lcom/huami/heartrate/usecase/QueryManualHeartRateUseCase;", "queryManualHeartRateUseCase", "Lcom/huami/heartrate/usecase/GetLocalMeasureHRDataUseCase;", "e", "g", "()Lcom/huami/heartrate/usecase/GetLocalMeasureHRDataUseCase;", "getLocalMeasureHRDataUseCase", "Lcom/huami/heartrate/usecase/GetWholeDayHrDataUseCase;", "f", "h", "()Lcom/huami/heartrate/usecase/GetWholeDayHrDataUseCase;", "getWholeDayHrDataUseCase", "Lcom/huami/heartrate/usecase/QueryRestHeartRateByDayUseCase;", "l", "()Lcom/huami/heartrate/usecase/QueryRestHeartRateByDayUseCase;", "restHrUseCase", "Lcom/huami/heartrate/usecase/QueryHeartRateUseCase;", z.j, "()Lcom/huami/heartrate/usecase/QueryHeartRateUseCase;", "queryHeartRateUseCase", "Lcom/huami/heartrate/usecase/HeartRateBigDataUseCase;", "i", "()Lcom/huami/heartrate/usecase/HeartRateBigDataUseCase;", "bigDataUseCase", "Lcom/huami/heartrate/repository/local/KvHelper;", "()Lcom/huami/heartrate/repository/local/KvHelper;", "kvHelper", "Lcom/huami/heartrate/usecase/FetchRemoteMeasureHrUseCase;", "()Lcom/huami/heartrate/usecase/FetchRemoteMeasureHrUseCase;", "fetchRemoteMeasureHrUseCase", "<init>", "(Ljava/lang/String;J)V", "Companion", "heartrate_release"}, k = 1, mv = {1, 5, 1})
public final class HeartRateServiceImpl implements IHeartRateService {

    @NotNull
    public static final String TAG = "HeartRateServiceImpl";

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final String userId;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final long registerTime;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final Lazy scope = LazyKt__LazyJVMKt.lazy(new j());

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private final Lazy queryManualHeartRateUseCase;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    private final Lazy getLocalMeasureHRDataUseCase;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    private final Lazy getWholeDayHrDataUseCase;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    private final Lazy restHrUseCase;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @NotNull
    private final Lazy queryHeartRateUseCase;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @NotNull
    private final Lazy bigDataUseCase;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    @NotNull
    private final Lazy kvHelper;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @NotNull
    private final Lazy fetchRemoteMeasureHrUseCase;

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.heartrate.koin.HeartRateServiceImpl", f = "HeartRateServiceImpl.kt", i = {}, l = {164, 171}, m = "findLatestHrDataFromServe", n = {}, s = {})
    public static final class a extends ContinuationImpl {
        public Object a;
        public Object b;
        public /* synthetic */ Object c;
        public int e;

        public a(Continuation<? super a> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.c = obj;
            this.e |= Integer.MIN_VALUE;
            return HeartRateServiceImpl.this.a(this);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<String> {
        public final /* synthetic */ HeartRateData a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(HeartRateData heartRateData) {
            super(0);
            this.a = heartRateData;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "latest hr generate data from kv : " + this.a;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function0<String> {
        public final /* synthetic */ Long a;
        public final /* synthetic */ HeartRateData b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Long l, HeartRateData heartRateData) {
            super(0);
            this.a = l;
            this.b = heartRateData;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "latest hr generate time is " + this.a + " , hrdata is " + this.b;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.heartrate.koin.HeartRateServiceImpl", f = "HeartRateServiceImpl.kt", i = {0, 1}, l = {143, 144}, m = "findLatestHrGenerateTime", n = {"this", "bigDataGenerateTime"}, s = {"L$0", "L$0"})
    public static final class d extends ContinuationImpl {
        public Object a;
        public /* synthetic */ Object b;
        public int d;

        public d(Continuation<? super d> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.b = obj;
            this.d |= Integer.MIN_VALUE;
            return HeartRateServiceImpl.this.b(this);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class e extends Lambda implements Function0<String> {
        public final /* synthetic */ Long a;
        public final /* synthetic */ Long b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(Long l, Long l2) {
            super(0);
            this.a = l;
            this.b = l2;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "latest hr generate time from big data component is " + this.a + " ,manual is " + this.b;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.heartrate.koin.HeartRateServiceImpl$findLatestHrGenerateTimeFromBigDataComponent$2", f = "HeartRateServiceImpl.kt", i = {}, l = {Constant.WEIGHT_DEFAULT_IMPERIAL}, m = "invokeSuspend", n = {}, s = {})
    public static final class f extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Long>, Object> {
        public Object a;
        public Object b;
        public Object c;
        public Object d;
        public int e;
        public int f;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class a extends Lambda implements Function0<String> {
            public final /* synthetic */ HeartRateServiceImpl a;
            public final /* synthetic */ int b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(HeartRateServiceImpl heartRateServiceImpl, int i) {
                super(0);
                this.a = heartRateServiceImpl;
                this.b = i;
            }

            @Override // kotlin.jvm.functions.Function0
            @Nullable
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final String getA() {
                return "registerTime:" + this.a.registerTime + ",yearDiffer:" + this.b;
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class b extends Lambda implements Function0<String> {
            public final /* synthetic */ long a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(long j) {
                super(0);
                this.a = j;
            }

            @Override // kotlin.jvm.functions.Function0
            @Nullable
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final String getA() {
                return "big data component call back hr data:" + this.a;
            }
        }

        public f(Continuation<? super f> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return HeartRateServiceImpl.this.new f(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Long> continuation) {
            return ((f) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code duplicated, block: B:11:0x0075  */
        /* JADX WARN: Code duplicated, block: B:13:0x007d  */
        /* JADX WARN: Code duplicated, block: B:16:0x00b3 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:17:0x00b4  */
        /* JADX WARN: Code duplicated, block: B:20:0x00be  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x00b4 -> B:18:0x00ba). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @org.jetbrains.annotations.Nullable
        public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r15) {
            /*
                Method dump skipped, instruction units count: 228
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.huami.heartrate.koin.HeartRateServiceImpl.f.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.heartrate.koin.HeartRateServiceImpl$findLatestManualHrGenerateTime$2", f = "HeartRateServiceImpl.kt", i = {}, l = {m.c}, m = "invokeSuspend", n = {}, s = {})
    public static final class g extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Long>, Object> {
        public int a;
        public final /* synthetic */ long c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(long j, Continuation<? super g> continuation) {
            super(2, continuation);
            this.c = j;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return HeartRateServiceImpl.this.new g(this.c, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Long> continuation) {
            return ((g) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            List<RemoteHeartRateItem> items;
            Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            int i = this.a;
            boolean z = true;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                FetchRemoteMeasureHrUseCase fetchRemoteMeasureHrUseCaseF = HeartRateServiceImpl.this.f();
                long j = HeartRateServiceImpl.this.registerTime;
                long j2 = this.c;
                this.a = 1;
                obj = fetchRemoteMeasureHrUseCaseF.fetchRemoteMeasureHrUseCase(j, j2, 100, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            RemoteHeartRateData remoteHeartRateData = (RemoteHeartRateData) obj;
            List<HeartRateEntity> listConvertHeartRate = (remoteHeartRateData == null || (items = remoteHeartRateData.getItems()) == null) ? null : MeasureHrViewModelKt.convertHeartRate(items);
            if (listConvertHeartRate != null && !listConvertHeartRate.isEmpty()) {
                z = false;
            }
            if (z) {
                return null;
            }
            return Boxing.boxLong(ExtensionUtilsKt.secondToMills(listConvertHeartRate.get(0).getTime()));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.heartrate.koin.HeartRateServiceImpl$getRestingHrData$2", f = "HeartRateServiceImpl.kt", i = {}, l = {129}, m = "invokeSuspend", n = {}, s = {})
    public static final class h extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Integer>, Object> {
        public int a;
        public final /* synthetic */ long c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(long j, Continuation<? super h> continuation) {
            super(2, continuation);
            this.c = j;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return HeartRateServiceImpl.this.new h(this.c, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Integer> continuation) {
            return ((h) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            int i = this.a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                QueryRestHeartRateByDayUseCase queryRestHeartRateByDayUseCaseL = HeartRateServiceImpl.this.l();
                String chinaDateString = HeartRateTimeUtils.INSTANCE.getChinaDateString(this.c);
                this.a = 1;
                obj = queryRestHeartRateByDayUseCaseL.getRestHeartRateByDate(chinaDateString, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return obj;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\b\u001a\u0004\u0018\u00010\u00072\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00002\u0014\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0003H\u008a@"}, d2 = {"", "Lcom/huami/heartrate/repository/entity/HeartRateEntity;", "measureHrData", "", "", "", "wholeDayHrData", "Lcom/huami/heartrate/service/HeartRateInfo;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.heartrate.koin.HeartRateServiceImpl$loadHeartRateInfo$1", f = "HeartRateServiceImpl.kt", i = {0, 0}, l = {114, 116}, m = "invokeSuspend", n = {"measureHrData", "wholeDayHrData"}, s = {"L$0", "L$1"})
    public static final class i extends SuspendLambda implements Function3<List<? extends HeartRateEntity>, Map<String, ? extends byte[]>, Continuation<? super HeartRateInfo>, Object> {
        public int a;
        public /* synthetic */ Object b;
        public /* synthetic */ Object c;
        public final /* synthetic */ long e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(long j, Continuation<? super i> continuation) {
            super(3, continuation);
            this.e = j;
        }

        @Override // kotlin.jvm.functions.Function3
        @Nullable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@Nullable List<HeartRateEntity> list, @Nullable Map<String, byte[]> map, @Nullable Continuation<? super HeartRateInfo> continuation) {
            i iVar = HeartRateServiceImpl.this.new i(this.e, continuation);
            iVar.b = list;
            iVar.c = map;
            return iVar.invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Map map;
            List list;
            Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            int i = this.a;
            if (i != 0) {
                if (i == 1) {
                    map = (Map) this.c;
                    List list2 = (List) this.b;
                    ResultKt.throwOnFailure(obj);
                    list = list2;
                } else {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
            }
            ResultKt.throwOnFailure(obj);
            List list3 = (List) this.b;
            map = (Map) this.c;
            HeartRateServiceImpl heartRateServiceImpl = HeartRateServiceImpl.this;
            long j = this.e;
            this.b = list3;
            this.c = map;
            this.a = 1;
            Object objM = heartRateServiceImpl.m(j, this);
            if (objM == coroutine_suspended) {
                return coroutine_suspended;
            }
            list = list3;
            obj = objM;
            int iIntValue = ((Number) obj).intValue();
            long j2 = this.e;
            HeartRateData heartRateData = new HeartRateData(j2, iIntValue, list, map == null ? null : (byte[]) map.get(HeartRateTimeUtils.INSTANCE.getChinaDateString(j2)));
            this.b = null;
            this.c = null;
            this.a = 2;
            obj = HeartRateServiceImplKt.getHeartRateInfo(heartRateData, this);
            return obj == coroutine_suspended ? coroutine_suspended : obj;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lorg/koin/core/scope/Scope;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class j extends Lambda implements Function0<Scope> {
        public j() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Scope getA() {
            return HeartRateScopeKt.getHrScopeByUserId(HeartRateServiceImpl.this.userId);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public HeartRateServiceImpl(@NotNull String str, long j2) {
        this.userId = str;
        this.registerTime = j2;
        final Scope scopeN = n();
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.SYNCHRONIZED;
        final Qualifier qualifier = null;
        final Object[] objArr = 0 == true ? 1 : 0;
        this.queryManualHeartRateUseCase = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyMode, (Function0) new Function0<QueryManualHeartRateUseCase>() { // from class: com.huami.heartrate.koin.HeartRateServiceImpl$special$$inlined$inject$default$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v1, types: [com.huami.heartrate.usecase.QueryManualHeartRateUseCase, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            /* JADX INFO: renamed from: invoke */
            public final QueryManualHeartRateUseCase getA() {
                return scopeN.get(Reflection.getOrCreateKotlinClass(QueryManualHeartRateUseCase.class), qualifier, objArr);
            }
        });
        final Scope scopeN2 = n();
        final Object[] objArr2 = 0 == true ? 1 : 0;
        final Object[] objArr3 = 0 == true ? 1 : 0;
        this.getLocalMeasureHRDataUseCase = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyMode, (Function0) new Function0<GetLocalMeasureHRDataUseCase>() { // from class: com.huami.heartrate.koin.HeartRateServiceImpl$special$$inlined$inject$default$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v1, types: [com.huami.heartrate.usecase.GetLocalMeasureHRDataUseCase, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            /* JADX INFO: renamed from: invoke */
            public final GetLocalMeasureHRDataUseCase getA() {
                return scopeN2.get(Reflection.getOrCreateKotlinClass(GetLocalMeasureHRDataUseCase.class), objArr2, objArr3);
            }
        });
        final Scope scopeN3 = n();
        final Object[] objArr4 = 0 == true ? 1 : 0;
        final Object[] objArr5 = 0 == true ? 1 : 0;
        this.getWholeDayHrDataUseCase = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyMode, (Function0) new Function0<GetWholeDayHrDataUseCase>() { // from class: com.huami.heartrate.koin.HeartRateServiceImpl$special$$inlined$inject$default$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v1, types: [com.huami.heartrate.usecase.GetWholeDayHrDataUseCase, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            /* JADX INFO: renamed from: invoke */
            public final GetWholeDayHrDataUseCase getA() {
                return scopeN3.get(Reflection.getOrCreateKotlinClass(GetWholeDayHrDataUseCase.class), objArr4, objArr5);
            }
        });
        final Scope scopeN4 = n();
        final Object[] objArr6 = 0 == true ? 1 : 0;
        final Object[] objArr7 = 0 == true ? 1 : 0;
        this.restHrUseCase = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyMode, (Function0) new Function0<QueryRestHeartRateByDayUseCase>() { // from class: com.huami.heartrate.koin.HeartRateServiceImpl$special$$inlined$inject$default$4
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v1, types: [com.huami.heartrate.usecase.QueryRestHeartRateByDayUseCase, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            /* JADX INFO: renamed from: invoke */
            public final QueryRestHeartRateByDayUseCase getA() {
                return scopeN4.get(Reflection.getOrCreateKotlinClass(QueryRestHeartRateByDayUseCase.class), objArr6, objArr7);
            }
        });
        final Scope scopeN5 = n();
        final Object[] objArr8 = 0 == true ? 1 : 0;
        final Object[] objArr9 = 0 == true ? 1 : 0;
        this.queryHeartRateUseCase = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyMode, (Function0) new Function0<QueryHeartRateUseCase>() { // from class: com.huami.heartrate.koin.HeartRateServiceImpl$special$$inlined$inject$default$5
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v1, types: [com.huami.heartrate.usecase.QueryHeartRateUseCase, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            /* JADX INFO: renamed from: invoke */
            public final QueryHeartRateUseCase getA() {
                return scopeN5.get(Reflection.getOrCreateKotlinClass(QueryHeartRateUseCase.class), objArr8, objArr9);
            }
        });
        final Scope scopeN6 = n();
        final Object[] objArr10 = 0 == true ? 1 : 0;
        final Object[] objArr11 = 0 == true ? 1 : 0;
        this.bigDataUseCase = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyMode, (Function0) new Function0<HeartRateBigDataUseCase>() { // from class: com.huami.heartrate.koin.HeartRateServiceImpl$special$$inlined$inject$default$6
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v1, types: [com.huami.heartrate.usecase.HeartRateBigDataUseCase, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            /* JADX INFO: renamed from: invoke */
            public final HeartRateBigDataUseCase getA() {
                return scopeN6.get(Reflection.getOrCreateKotlinClass(HeartRateBigDataUseCase.class), objArr10, objArr11);
            }
        });
        final Scope scopeN7 = n();
        final Object[] objArr12 = 0 == true ? 1 : 0;
        final Object[] objArr13 = 0 == true ? 1 : 0;
        this.kvHelper = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyMode, (Function0) new Function0<KvHelper>() { // from class: com.huami.heartrate.koin.HeartRateServiceImpl$special$$inlined$inject$default$7
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v1, types: [com.huami.heartrate.repository.local.KvHelper, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            /* JADX INFO: renamed from: invoke */
            public final KvHelper getA() {
                return scopeN7.get(Reflection.getOrCreateKotlinClass(KvHelper.class), objArr12, objArr13);
            }
        });
        final Scope scopeN8 = n();
        final Object[] objArr14 = 0 == true ? 1 : 0;
        final Object[] objArr15 = 0 == true ? 1 : 0;
        this.fetchRemoteMeasureHrUseCase = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyMode, (Function0) new Function0<FetchRemoteMeasureHrUseCase>() { // from class: com.huami.heartrate.koin.HeartRateServiceImpl$special$$inlined$inject$default$8
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v1, types: [com.huami.heartrate.usecase.FetchRemoteMeasureHrUseCase, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            /* JADX INFO: renamed from: invoke */
            public final FetchRemoteMeasureHrUseCase getA() {
                return scopeN8.get(Reflection.getOrCreateKotlinClass(FetchRemoteMeasureHrUseCase.class), objArr14, objArr15);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(Continuation<? super HeartRateData> continuation) {
        a aVar;
        HeartRateServiceImpl heartRateServiceImpl;
        Long l;
        HeartRateServiceImpl heartRateServiceImpl2;
        if (continuation instanceof a) {
            aVar = (a) continuation;
            int i2 = aVar.e;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                aVar.e = i2 - Integer.MIN_VALUE;
            } else {
                aVar = new a(continuation);
            }
        } else {
            aVar = new a(continuation);
        }
        Object objB = aVar.c;
        Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
        int i3 = aVar.e;
        if (i3 != 0) {
            if (i3 == 1) {
                heartRateServiceImpl = (HeartRateServiceImpl) aVar.a;
                ResultKt.throwOnFailure(objB);
            } else {
                if (i3 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                l = (Long) aVar.b;
                heartRateServiceImpl2 = (HeartRateServiceImpl) aVar.a;
                ResultKt.throwOnFailure(objB);
            }
            HeartRateData heartRateData = (HeartRateData) objB;
            heartRateServiceImpl2.i().setRemoteLatestHr(heartRateData);
            HMLog.info(TAG, new c(l, heartRateData));
            return objB;
        }
        ResultKt.throwOnFailure(objB);
        if (i().getRemoteLatestHr() != null) {
            HeartRateData remoteLatestHr = i().getRemoteLatestHr();
            HMLog.info(TAG, new b(remoteLatestHr));
            return remoteLatestHr;
        }
        aVar.a = this;
        aVar.e = 1;
        objB = b(aVar);
        if (objB == coroutine_suspended) {
            return coroutine_suspended;
        }
        heartRateServiceImpl = this;
        Long l2 = (Long) objB;
        if (l2 == null) {
            heartRateServiceImpl.i().setRemoteLatestHr(KvHelper.INSTANCE.getDEFAULT_HEART_RATE_DATA());
            return null;
        }
        QueryHeartRateUseCase queryHeartRateUseCaseJ = heartRateServiceImpl.j();
        long jLongValue = l2.longValue();
        aVar.a = heartRateServiceImpl;
        aVar.b = l2;
        aVar.e = 2;
        Object objFetchHeartRateInDay = queryHeartRateUseCaseJ.fetchHeartRateInDay(jLongValue, aVar);
        if (objFetchHeartRateInDay == coroutine_suspended) {
            return coroutine_suspended;
        }
        l = l2;
        objB = objFetchHeartRateInDay;
        heartRateServiceImpl2 = heartRateServiceImpl;
        HeartRateData heartRateData2 = (HeartRateData) objB;
        heartRateServiceImpl2.i().setRemoteLatestHr(heartRateData2);
        HMLog.info(TAG, new c(l, heartRateData2));
        return objB;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:29:0x0082  */
    /* JADX WARN: Code duplicated, block: B:32:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object b(Continuation<? super Long> continuation) {
        d dVar;
        HeartRateServiceImpl heartRateServiceImpl;
        Long l;
        Long l2;
        if (continuation instanceof d) {
            dVar = (d) continuation;
            int i2 = dVar.d;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                dVar.d = i2 - Integer.MIN_VALUE;
            } else {
                dVar = new d(continuation);
            }
        } else {
            dVar = new d(continuation);
        }
        Object objC = dVar.b;
        Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
        int i3 = dVar.d;
        if (i3 != 0) {
            if (i3 == 1) {
                heartRateServiceImpl = (HeartRateServiceImpl) dVar.a;
                ResultKt.throwOnFailure(objC);
            } else {
                if (i3 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                l = (Long) dVar.a;
                ResultKt.throwOnFailure(objC);
            }
            l2 = (Long) objC;
            HMLog.info(TAG, new e(l, l2));
            if (l == null && l2 != null) {
                return Boxing.boxLong(Math.max(l.longValue(), l2.longValue()));
            }
            if (l == null) {
                return l2;
            }
            return l;
        }
        ResultKt.throwOnFailure(objC);
        dVar.a = this;
        dVar.d = 1;
        objC = c(dVar);
        if (objC == coroutine_suspended) {
            return coroutine_suspended;
        }
        heartRateServiceImpl = this;
        Long l3 = (Long) objC;
        dVar.a = l3;
        dVar.d = 2;
        Object objD = heartRateServiceImpl.d(dVar);
        if (objD == coroutine_suspended) {
            return coroutine_suspended;
        }
        l = l3;
        objC = objD;
        l2 = (Long) objC;
        HMLog.info(TAG, new e(l, l2));
        if (l == null) {
        }
        if (l == null) {
            return l2;
        }
        return l;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object c(Continuation<? super Long> continuation) {
        if (((AnonymousService) KoinJavaComponent.getKoin().getScopeRegistry().getRootScope().get(Reflection.getOrCreateKotlinClass(AnonymousService.class), null, null)).isAnonymousUser()) {
            return null;
        }
        return BuildersKt.withContext(Dispatchers.getIO(), new f(null), continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object d(Continuation<? super Long> continuation) {
        return BuildersKt.withContext(Dispatchers.getIO(), new g(ExtensionUtilsKt.millsToSecond(System.currentTimeMillis()), null), continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final HeartRateBigDataUseCase e() {
        return (HeartRateBigDataUseCase) this.bigDataUseCase.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final FetchRemoteMeasureHrUseCase f() {
        return (FetchRemoteMeasureHrUseCase) this.fetchRemoteMeasureHrUseCase.getValue();
    }

    private final GetLocalMeasureHRDataUseCase g() {
        return (GetLocalMeasureHRDataUseCase) this.getLocalMeasureHRDataUseCase.getValue();
    }

    private final GetWholeDayHrDataUseCase h() {
        return (GetWholeDayHrDataUseCase) this.getWholeDayHrDataUseCase.getValue();
    }

    private final KvHelper i() {
        return (KvHelper) this.kvHelper.getValue();
    }

    private final QueryHeartRateUseCase j() {
        return (QueryHeartRateUseCase) this.queryHeartRateUseCase.getValue();
    }

    private final QueryManualHeartRateUseCase k() {
        return (QueryManualHeartRateUseCase) this.queryManualHeartRateUseCase.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final QueryRestHeartRateByDayUseCase l() {
        return (QueryRestHeartRateByDayUseCase) this.restHrUseCase.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object m(long j2, Continuation<? super Integer> continuation) {
        return BuildersKt.withContext(Dispatchers.getIO(), new h(j2, null), continuation);
    }

    private final Scope n() {
        return (Scope) this.scope.getValue();
    }

    @Override // com.huami.heartrate.service.IHeartRateService
    @NotNull
    public AbsHeartRateChartView buildHeartRateChartView(@NotNull Context context) {
        return new HeartRateChartView(context, null, 0, 6, null);
    }

    @Override // com.huami.heartrate.service.IHeartRateService
    @NotNull
    public Flow<HeartRateInfo> loadHeartRateInfo(@NotNull Date date) {
        long time = date.getTime();
        GetLocalMeasureHRDataUseCase getLocalMeasureHRDataUseCaseG = g();
        HeartRateTimeUtils heartRateTimeUtils = HeartRateTimeUtils.INSTANCE;
        return FlowKt.flowCombine(getLocalMeasureHRDataUseCaseG.observeHeartRateLiveDataList(heartRateTimeUtils.getDayStartTime(time), heartRateTimeUtils.getDayEndTime(time)), h().observeWholeDayHeartRate(date, date), new i(time, null));
    }

    @Override // com.huami.heartrate.service.IHeartRateService
    @NotNull
    public Flow<HeartRateInfo> loadLatestHeartRateInfo() {
        final Flow<HeartRateData> flowQueryLatestHeartRateRawData = j().queryLatestHeartRateRawData();
        return new Flow<HeartRateInfo>() { // from class: com.huami.heartrate.koin.HeartRateServiceImpl$loadLatestHeartRateInfo$$inlined$map$1

            /* JADX INFO: renamed from: com.huami.heartrate.koin.HeartRateServiceImpl$loadLatestHeartRateInfo$$inlined$map$1$2, reason: invalid class name */
            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001b\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00028\u0000H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0006¸\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/FlowKt__CollectKt$collect$3", "Lkotlinx/coroutines/flow/FlowCollector;", "value", "", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-core", "kotlinx/coroutines/flow/FlowKt__TransformKt$map$$inlined$unsafeTransform$1$2"}, k = 1, mv = {1, 5, 1})
            public static final class AnonymousClass2 implements FlowCollector<HeartRateData> {
                public final /* synthetic */ FlowCollector a;
                public final /* synthetic */ HeartRateServiceImpl$loadLatestHeartRateInfo$$inlined$map$1 b;

                /* JADX INFO: renamed from: com.huami.heartrate.koin.HeartRateServiceImpl$loadLatestHeartRateInfo$$inlined$map$1$2$1, reason: invalid class name */
                @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0001\u001a\u00028\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0096@¨\u0006\u0006"}, d2 = {ExifInterface.GPS_DIRECTION_TRUE, "value", "Lkotlin/coroutines/Continuation;", "", "continuation", "", "kotlinx/coroutines/flow/FlowKt__TransformKt$map$$inlined$unsafeTransform$1$2$1", "emit"}, k = 3, mv = {1, 5, 1})
                @DebugMetadata(c = "com.huami.heartrate.koin.HeartRateServiceImpl$loadLatestHeartRateInfo$$inlined$map$1$2", f = "HeartRateServiceImpl.kt", i = {}, l = {135, 135, 135}, m = "emit", n = {}, s = {})
                public static final class AnonymousClass1 extends ContinuationImpl {
                    public /* synthetic */ Object a;
                    public int b;
                    public Object c;
                    public Object d;
                    public Object e;
                    public Object f;
                    public Object g;
                    public Object h;
                    public Object i;
                    public Object j;

                    public AnonymousClass1(Continuation continuation) {
                        super(continuation);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    @Nullable
                    public final Object invokeSuspend(@NotNull Object obj) {
                        this.a = obj;
                        this.b |= Integer.MIN_VALUE;
                        return AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(FlowCollector flowCollector, HeartRateServiceImpl$loadLatestHeartRateInfo$$inlined$map$1 heartRateServiceImpl$loadLatestHeartRateInfo$$inlined$map$1) {
                    this.a = flowCollector;
                    this.b = heartRateServiceImpl$loadLatestHeartRateInfo$$inlined$map$1;
                }

                /* JADX WARN: Code duplicated, block: B:28:0x0072 A[RETURN] */
                /* JADX WARN: Code duplicated, block: B:31:0x007e A[RETURN] */
                /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                @Override // kotlinx.coroutines.flow.FlowCollector
                @Nullable
                public Object emit(HeartRateData heartRateData, @NotNull Continuation continuation) {
                    AnonymousClass1 anonymousClass1;
                    HeartRateData heartRateData2;
                    FlowCollector flowCollector;
                    if (continuation instanceof AnonymousClass1) {
                        anonymousClass1 = (AnonymousClass1) continuation;
                        int i = anonymousClass1.b;
                        if ((i & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.b = i - Integer.MIN_VALUE;
                        } else {
                            anonymousClass1 = new AnonymousClass1(continuation);
                        }
                    } else {
                        anonymousClass1 = new AnonymousClass1(continuation);
                    }
                    Object heartRateInfo = anonymousClass1.a;
                    Object coroutine_suspended = a.getCOROUTINE_SUSPENDED();
                    int i2 = anonymousClass1.b;
                    if (i2 != 0) {
                        if (i2 == 1) {
                            flowCollector = (FlowCollector) anonymousClass1.c;
                            ResultKt.throwOnFailure(heartRateInfo);
                        } else if (i2 == 2) {
                            flowCollector = (FlowCollector) anonymousClass1.c;
                            ResultKt.throwOnFailure(heartRateInfo);
                            anonymousClass1.c = null;
                            anonymousClass1.b = 3;
                            if (flowCollector.emit(heartRateInfo, anonymousClass1) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                        } else {
                            if (i2 != 3) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            ResultKt.throwOnFailure(heartRateInfo);
                        }
                        return Unit.INSTANCE;
                    }
                    ResultKt.throwOnFailure(heartRateInfo);
                    FlowCollector flowCollector2 = this.a;
                    HeartRateData heartRateData3 = heartRateData;
                    if (heartRateData3 == null) {
                        HeartRateServiceImpl heartRateServiceImpl = this;
                        anonymousClass1.c = flowCollector2;
                        anonymousClass1.b = 1;
                        Object objA = heartRateServiceImpl.a(anonymousClass1);
                        if (objA == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        heartRateInfo = objA;
                        flowCollector = flowCollector2;
                    } else {
                        heartRateData2 = heartRateData3;
                        flowCollector = flowCollector2;
                    }
                    anonymousClass1.c = flowCollector;
                    anonymousClass1.b = 2;
                    heartRateInfo = HeartRateServiceImplKt.getHeartRateInfo(heartRateData2, anonymousClass1);
                    if (heartRateInfo == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    anonymousClass1.c = null;
                    anonymousClass1.b = 3;
                    if (flowCollector.emit(heartRateInfo, anonymousClass1) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    return Unit.INSTANCE;
                    heartRateData2 = (HeartRateData) heartRateInfo;
                    anonymousClass1.c = flowCollector;
                    anonymousClass1.b = 2;
                    heartRateInfo = HeartRateServiceImplKt.getHeartRateInfo(heartRateData2, anonymousClass1);
                    if (heartRateInfo == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    anonymousClass1.c = null;
                    anonymousClass1.b = 3;
                    if (flowCollector.emit(heartRateInfo, anonymousClass1) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    return Unit.INSTANCE;
                }
            }

            @Override // kotlinx.coroutines.flow.Flow
            @Nullable
            public Object collect(@NotNull FlowCollector<? super HeartRateInfo> flowCollector, @NotNull Continuation continuation) {
                Object objCollect = flowQueryLatestHeartRateRawData.collect(new AnonymousClass2(flowCollector, this), continuation);
                return objCollect == a.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
            }
        };
    }

    @Override // com.huami.heartrate.service.IHeartRateService
    @NotNull
    public Flow<HeartRate> loadLatestManualHeartRate() {
        final Flow<HeartRateEntity> flowObserveLatestHeartRate = k().observeLatestHeartRate();
        return new Flow<HeartRate>() { // from class: com.huami.heartrate.koin.HeartRateServiceImpl$loadLatestManualHeartRate$$inlined$map$1

            /* JADX INFO: renamed from: com.huami.heartrate.koin.HeartRateServiceImpl$loadLatestManualHeartRate$$inlined$map$1$2, reason: invalid class name */
            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001b\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00028\u0000H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0006¸\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/FlowKt__CollectKt$collect$3", "Lkotlinx/coroutines/flow/FlowCollector;", "value", "", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-core", "kotlinx/coroutines/flow/FlowKt__TransformKt$map$$inlined$unsafeTransform$1$2"}, k = 1, mv = {1, 5, 1})
            public static final class AnonymousClass2 implements FlowCollector<HeartRateEntity> {
                public final /* synthetic */ FlowCollector a;
                public final /* synthetic */ HeartRateServiceImpl$loadLatestManualHeartRate$$inlined$map$1 b;

                /* JADX INFO: renamed from: com.huami.heartrate.koin.HeartRateServiceImpl$loadLatestManualHeartRate$$inlined$map$1$2$1, reason: invalid class name */
                @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0001\u001a\u00028\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0096@¨\u0006\u0006"}, d2 = {ExifInterface.GPS_DIRECTION_TRUE, "value", "Lkotlin/coroutines/Continuation;", "", "continuation", "", "kotlinx/coroutines/flow/FlowKt__TransformKt$map$$inlined$unsafeTransform$1$2$1", "emit"}, k = 3, mv = {1, 5, 1})
                @DebugMetadata(c = "com.huami.heartrate.koin.HeartRateServiceImpl$loadLatestManualHeartRate$$inlined$map$1$2", f = "HeartRateServiceImpl.kt", i = {}, l = {135}, m = "emit", n = {}, s = {})
                public static final class AnonymousClass1 extends ContinuationImpl {
                    public /* synthetic */ Object a;
                    public int b;
                    public Object c;
                    public Object d;
                    public Object e;
                    public Object f;
                    public Object g;
                    public Object h;
                    public Object i;
                    public Object j;

                    public AnonymousClass1(Continuation continuation) {
                        super(continuation);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    @Nullable
                    public final Object invokeSuspend(@NotNull Object obj) {
                        this.a = obj;
                        this.b |= Integer.MIN_VALUE;
                        return AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(FlowCollector flowCollector, HeartRateServiceImpl$loadLatestManualHeartRate$$inlined$map$1 heartRateServiceImpl$loadLatestManualHeartRate$$inlined$map$1) {
                    this.a = flowCollector;
                    this.b = heartRateServiceImpl$loadLatestManualHeartRate$$inlined$map$1;
                }

                /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                @Override // kotlinx.coroutines.flow.FlowCollector
                @Nullable
                public Object emit(HeartRateEntity heartRateEntity, @NotNull Continuation continuation) {
                    AnonymousClass1 anonymousClass1;
                    if (continuation instanceof AnonymousClass1) {
                        anonymousClass1 = (AnonymousClass1) continuation;
                        int i = anonymousClass1.b;
                        if ((i & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.b = i - Integer.MIN_VALUE;
                        } else {
                            anonymousClass1 = new AnonymousClass1(continuation);
                        }
                    } else {
                        anonymousClass1 = new AnonymousClass1(continuation);
                    }
                    Object obj = anonymousClass1.a;
                    Object coroutine_suspended = a.getCOROUTINE_SUSPENDED();
                    int i2 = anonymousClass1.b;
                    if (i2 == 0) {
                        ResultKt.throwOnFailure(obj);
                        FlowCollector flowCollector = this.a;
                        HeartRateEntity heartRateEntity2 = heartRateEntity;
                        HeartRate heartRateC = heartRateEntity2 == null ? null : HeartRateServiceImplKt.c(heartRateEntity2);
                        anonymousClass1.b = 1;
                        if (flowCollector.emit(heartRateC, anonymousClass1) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i2 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                    }
                    return Unit.INSTANCE;
                }
            }

            @Override // kotlinx.coroutines.flow.Flow
            @Nullable
            public Object collect(@NotNull FlowCollector<? super HeartRate> flowCollector, @NotNull Continuation continuation) {
                Object objCollect = flowObserveLatestHeartRate.collect(new AnonymousClass2(flowCollector, this), continuation);
                return objCollect == a.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
            }
        };
    }
}
