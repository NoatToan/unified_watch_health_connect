package com.huami.phn.coach.usecase;

import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.phn.coach.usecase.impl.PHNProjectRecordKt;
import com.huami.phn.core.model.DefaultUnInitCardData;
import com.huami.phn.core.model.PHNCardData;
import com.huami.phn.core.model.PHNProjectRecord;
import com.huami.phn.core.source.LocalDataSource;
import com.huami.phn.core.source.LocalKeeper;
import com.huami.phn.core.source.RemoteDataSource;
import com.huami.phn.core.webapi.RemoteResult;
import com.huami.phn.util.AppSettingHelper;
import com.huami.tools.log.HMLog;
import com.tekartik.sqflite.Constant;
import com.xiaomi.hm.health.keeper.HMKeeperConstant;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0007\u0018\u0000 \u001f2\u00020\u0001:\u0001\u001fB'\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\u0006\u0010\f\u001a\u00020\t\u0012\u0006\u0010\u0010\u001a\u00020\r\u0012\u0006\u0010\u0014\u001a\u00020\u0011¢\u0006\u0004\b\u001d\u0010\u001eJ\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002R\u0016\u0010\b\u001a\u00020\u00058\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0016\u0010\f\u001a\u00020\t8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0016\u0010\u0010\u001a\u00020\r8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0014\u001a\u00020\u00118\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0018\u001a\u00020\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0018\u0010\u001c\u001a\u0004\u0018\u00010\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u001b¨\u0006 "}, d2 = {"Lcom/huami/phn/coach/usecase/GetPHNPlanUseCase;", "", "Lkotlinx/coroutines/flow/Flow;", "Lcom/huami/phn/core/model/PHNCardData;", Constant.METHOD_EXECUTE, "Lcom/huami/phn/core/source/LocalDataSource;", "a", "Lcom/huami/phn/core/source/LocalDataSource;", "local", "Lcom/huami/phn/core/source/RemoteDataSource;", "b", "Lcom/huami/phn/core/source/RemoteDataSource;", "remote", "Lcom/huami/phn/core/source/LocalKeeper;", "c", "Lcom/huami/phn/core/source/LocalKeeper;", HMKeeperConstant.KEEP_XML, "Lcom/huami/phn/coach/usecase/GetPHNDailyAnalysisResultUseCase;", GoogleApiAvailabilityLight.a, "Lcom/huami/phn/coach/usecase/GetPHNDailyAnalysisResultUseCase;", "getDailyResultUseCase", "", "e", "Z", "firstQueryPHNFromWeb", "", "f", "Ljava/lang/String;", "linkUrl", "<init>", "(Lcom/huami/phn/core/source/LocalDataSource;Lcom/huami/phn/core/source/RemoteDataSource;Lcom/huami/phn/core/source/LocalKeeper;Lcom/huami/phn/coach/usecase/GetPHNDailyAnalysisResultUseCase;)V", "Companion", "phn_coach_release"}, k = 1, mv = {1, 5, 1})
public final class GetPHNPlanUseCase {

    @NotNull
    private static final String g = "GetPHNPlanUseCase";

    @NotNull
    private static final String h = "phn-support-device";

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final LocalDataSource local;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final RemoteDataSource remote;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final LocalKeeper keeper;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private final GetPHNDailyAnalysisResultUseCase getDailyResultUseCase;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private boolean firstQueryPHNFromWeb = true;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @Nullable
    private String linkUrl;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00010\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/flow/FlowCollector;", "", "Lcom/huami/phn/core/model/PHNProjectRecord;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.phn.coach.usecase.GetPHNPlanUseCase$execute$1", f = "GetPHNPlanUseCase.kt", i = {}, l = {64}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements Function2<FlowCollector<? super List<? extends PHNProjectRecord>>, Continuation<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ List<PHNProjectRecord> c;

        /* JADX INFO: renamed from: com.huami.phn.coach.usecase.GetPHNPlanUseCase$a$a, reason: collision with other inner class name */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class C0535a extends Lambda implements Function0<String> {
            public final /* synthetic */ RemoteResult<List<PHNProjectRecord>> a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0535a(RemoteResult<List<PHNProjectRecord>> remoteResult) {
                super(0);
                this.a = remoteResult;
            }

            @Override // kotlin.jvm.functions.Function0
            @Nullable
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final String getA() {
                return "Fetch remote phn success! - " + ((List) ((RemoteResult.Success) this.a).getData()).size();
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class b extends Lambda implements Function0<String> {
            public final /* synthetic */ RemoteResult<List<PHNProjectRecord>> a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(RemoteResult<List<PHNProjectRecord>> remoteResult) {
                super(0);
                this.a = remoteResult;
            }

            @Override // kotlin.jvm.functions.Function0
            @Nullable
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final String getA() {
                return "Fetch remote phn failed! - " + ((RemoteResult.Failed) this.a).getCode();
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        @DebugMetadata(c = "com.huami.phn.coach.usecase.GetPHNPlanUseCase$execute$1$2", f = "GetPHNPlanUseCase.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class c extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            public int a;
            public final /* synthetic */ GetPHNPlanUseCase b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(GetPHNPlanUseCase getPHNPlanUseCase, Continuation<? super c> continuation) {
                super(2, continuation);
                this.b = getPHNPlanUseCase;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                return new c(this.b, continuation);
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
                this.b.linkUrl = AppSettingHelper.INSTANCE.getAppSettings(GetPHNPlanUseCase.h);
                String str = this.b.linkUrl;
                if (str != null) {
                    this.b.keeper.setPHNSupportDeviceUrl(str);
                }
                HMLog.i(GetPHNPlanUseCase.g, "phn support-device-url:" + this.b.linkUrl, new Object[0]);
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(List<PHNProjectRecord> list, Continuation<? super a> continuation) {
            super(2, continuation);
            this.c = list;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return GetPHNPlanUseCase.this.new a(this.c, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(FlowCollector<? super List<? extends PHNProjectRecord>> flowCollector, Continuation<? super Unit> continuation) {
            return invoke2((FlowCollector<? super List<PHNProjectRecord>>) flowCollector, continuation);
        }

        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(@NotNull FlowCollector<? super List<PHNProjectRecord>> flowCollector, @Nullable Continuation<? super Unit> continuation) {
            return ((a) create(flowCollector, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            int i = this.a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                if (GetPHNPlanUseCase.this.firstQueryPHNFromWeb) {
                    GetPHNPlanUseCase.this.firstQueryPHNFromWeb = false;
                    RemoteResult<List<PHNProjectRecord>> pHNProjectRecord = GetPHNPlanUseCase.this.remote.getPHNProjectRecord();
                    List<PHNProjectRecord> list = this.c;
                    GetPHNPlanUseCase getPHNPlanUseCase = GetPHNPlanUseCase.this;
                    if (pHNProjectRecord instanceof RemoteResult.Success) {
                        HMLog.info(GetPHNPlanUseCase.g, new C0535a(pHNProjectRecord));
                        list.addAll((Collection) ((RemoteResult.Success) pHNProjectRecord).getData());
                        if (!list.isEmpty()) {
                            getPHNPlanUseCase.local.saveProjectFromWeb(CollectionsKt___CollectionsKt.toList(list));
                        }
                    } else if (pHNProjectRecord instanceof RemoteResult.Failed) {
                        HMLog.error$default(GetPHNPlanUseCase.g, null, null, new b(pHNProjectRecord), 6, null);
                    }
                }
                String str = GetPHNPlanUseCase.this.linkUrl;
                if (str == null || str.length() == 0) {
                    CoroutineDispatcher io2 = Dispatchers.getIO();
                    c cVar = new c(GetPHNPlanUseCase.this, null);
                    this.a = 1;
                    if (BuildersKt.withContext(io2, cVar, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            if (!(!GetPHNPlanUseCase.this.local.queryDailyResult(1, null).isEmpty())) {
                HMLog.i(GetPHNPlanUseCase.g, "try get daily results", new Object[0]);
                GetPHNPlanUseCase.this.getDailyResultUseCase.load(null, -1);
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<String> {
        public final /* synthetic */ List<PHNProjectRecord> a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(List<PHNProjectRecord> list) {
            super(0);
            this.a = list;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "Fetch record size == " + this.a.size();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function0<String> {
        public final /* synthetic */ PHNCardData a;
        public final /* synthetic */ GetPHNPlanUseCase b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(PHNCardData pHNCardData, GetPHNPlanUseCase getPHNPlanUseCase) {
            super(0);
            this.a = pHNCardData;
            this.b = getPHNPlanUseCase;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            Calendar update = this.a.getUpdate();
            long timeInMillis = update == null ? 0L : update.getTimeInMillis();
            String str = this.b.linkUrl;
            if (str == null) {
                str = "";
            }
            return "cardData == " + timeInMillis + ", link=" + str;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class d extends Lambda implements Function0<String> {
        public final /* synthetic */ DefaultUnInitCardData a;
        public final /* synthetic */ GetPHNPlanUseCase b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(DefaultUnInitCardData defaultUnInitCardData, GetPHNPlanUseCase getPHNPlanUseCase) {
            super(0);
            this.a = defaultUnInitCardData;
            this.b = getPHNPlanUseCase;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            Calendar update = this.a.getUpdate();
            long timeInMillis = update == null ? 0L : update.getTimeInMillis();
            String str = this.b.linkUrl;
            if (str == null) {
                str = "";
            }
            return "defaultUnInitCard cardData == " + timeInMillis + ", link=" + str;
        }
    }

    public GetPHNPlanUseCase(@NotNull LocalDataSource localDataSource, @NotNull RemoteDataSource remoteDataSource, @NotNull LocalKeeper localKeeper, @NotNull GetPHNDailyAnalysisResultUseCase getPHNDailyAnalysisResultUseCase) {
        this.local = localDataSource;
        this.remote = remoteDataSource;
        this.keeper = localKeeper;
        this.getDailyResultUseCase = getPHNDailyAnalysisResultUseCase;
    }

    @NotNull
    public final Flow<PHNCardData> execute() {
        final Flow flowOnStart = FlowKt.onStart(this.local.queryLatestProjectAsFlow(), new a(new ArrayList(), null));
        return new Flow<PHNCardData>() { // from class: com.huami.phn.coach.usecase.GetPHNPlanUseCase$execute$$inlined$map$1
            @Override // kotlinx.coroutines.flow.Flow
            @Nullable
            public Object collect(@NotNull final FlowCollector<? super PHNCardData> flowCollector, @NotNull Continuation continuation) {
                Object objCollect = flowOnStart.collect(new FlowCollector<List<? extends PHNProjectRecord>>() { // from class: com.huami.phn.coach.usecase.GetPHNPlanUseCase$execute$$inlined$map$1.2
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    @Nullable
                    public Object emit(List<? extends PHNProjectRecord> list, @NotNull Continuation continuation2) {
                        Object obj;
                        FlowCollector flowCollector2 = flowCollector;
                        List<? extends PHNProjectRecord> list2 = list;
                        HMLog.info("GetPHNPlanUseCase", new GetPHNPlanUseCase.b(list2));
                        PHNProjectRecord pHNProjectRecord = (PHNProjectRecord) CollectionsKt.firstOrNull((List) list2);
                        PHNCardData planCardData = pHNProjectRecord == null ? null : PHNProjectRecordKt.toPlanCardData(pHNProjectRecord);
                        if (planCardData != null) {
                            String str = this.linkUrl;
                            planCardData.setLinkUrl(str != null ? str : "");
                            HMLog.info("GetPHNPlanUseCase", new GetPHNPlanUseCase.c(planCardData, this));
                            obj = planCardData;
                        } else {
                            DefaultUnInitCardData defaultUnInitCardData = new DefaultUnInitCardData();
                            String str2 = this.linkUrl;
                            defaultUnInitCardData.setLinkUrl(str2 != null ? str2 : "");
                            HMLog.info("GetPHNPlanUseCase", new GetPHNPlanUseCase.d(defaultUnInitCardData, this));
                            obj = defaultUnInitCardData;
                        }
                        Object objEmit = flowCollector2.emit(obj, continuation2);
                        return objEmit == a.getCOROUTINE_SUSPENDED() ? objEmit : Unit.INSTANCE;
                    }
                }, continuation);
                return objCollect == a.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
            }
        };
    }
}
