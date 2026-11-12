package com.huami.sky.lib.api;

import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.account.service.AccountService;
import com.huami.account.service.AccountServiceExtKt;
import com.huami.sky.lib.entity.MusicTags;
import com.huami.sky.lib.entity.RelaxDataResponse;
import com.huami.sky.lib.entity.RelaxInfo;
import com.huami.sky.lib.entity.UserMusicTag;
import com.huami.sky.lib.room.MusicTagDao;
import com.huami.sky.service.RelaxData;
import com.huami.sky.service.RelaxDataService;
import com.huami.sky.service.RelaxScore;
import com.huami.tools.log.HMLog;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.e;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\r\u001a\u00020\u000b\u0012\u0006\u0010\u0011\u001a\u00020\u000e\u0012\u0006\u0010\u0015\u001a\u00020\u0012¢\u0006\u0004\b\u001e\u0010\u001fJ\u0018\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0002J+\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\t\u0010\nR\u0016\u0010\r\u001a\u00020\u000b8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\fR\u0016\u0010\u0011\u001a\u00020\u000e8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0015\u001a\u00020\u00128\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0019\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0016\u0010\u001d\u001a\u00020\u001a8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001c\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006 "}, d2 = {"Lcom/huami/sky/lib/api/RelaxDataServiceImpl;", "Lcom/huami/sky/service/RelaxDataService;", "", "sleepStartTime", "sleepEndTime", "", "a", "Lkotlinx/coroutines/flow/Flow;", "Lcom/huami/sky/service/RelaxData;", "getRelaxData", "(JJLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/huami/account/service/AccountService;", "Lcom/huami/account/service/AccountService;", "userApi", "Lcom/huami/sky/lib/api/RelaxDataApi;", "b", "Lcom/huami/sky/lib/api/RelaxDataApi;", "relaxDataApi", "Lcom/huami/sky/lib/room/MusicTagDao;", "c", "Lcom/huami/sky/lib/room/MusicTagDao;", "musicTagDao", "", GoogleApiAvailabilityLight.a, "Z", "isFetchData", "Lkotlinx/coroutines/CoroutineScope;", "e", "Lkotlinx/coroutines/CoroutineScope;", "coroutineScope", "<init>", "(Lcom/huami/account/service/AccountService;Lcom/huami/sky/lib/api/RelaxDataApi;Lcom/huami/sky/lib/room/MusicTagDao;)V", "sky-lib_release"}, k = 1, mv = {1, 5, 1})
public final class RelaxDataServiceImpl implements RelaxDataService {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final AccountService userApi;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final RelaxDataApi relaxDataApi;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final MusicTagDao musicTagDao;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private boolean isFetchData;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    private final CoroutineScope coroutineScope = CoroutineScopeKt.CoroutineScope(Dispatchers.getIO());

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.sky.lib.api.RelaxDataServiceImpl$syncDataFromServer$1", f = "RelaxDataServiceImpl.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ long c;
        public final /* synthetic */ long d;

        /* JADX INFO: renamed from: com.huami.sky.lib.api.RelaxDataServiceImpl$a$a, reason: collision with other inner class name */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class C0552a extends Lambda implements Function0<String> {
            public final /* synthetic */ RelaxDataResponse a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0552a(RelaxDataResponse relaxDataResponse) {
                super(0);
                this.a = relaxDataResponse;
            }

            @Override // kotlin.jvm.functions.Function0
            @Nullable
            public final String invoke() {
                return String.valueOf(this.a);
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class b extends Lambda implements Function0<String> {
            public final /* synthetic */ Exception a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(Exception exc) {
                super(0);
                this.a = exc;
            }

            @Override // kotlin.jvm.functions.Function0
            @Nullable
            public final String invoke() {
                return "syncDataFromServer error " + this.a.getMessage();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(long j, long j2, Continuation<? super a> continuation) {
            super(2, continuation);
            this.c = j;
            this.d = j2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return RelaxDataServiceImpl.this.new a(this.c, this.d, continuation);
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
            try {
                String strUserIdOrThrow = RelaxDataServiceImpl.this.userApi.userIdOrThrow();
                RelaxDataResponse relaxScoreAndTags = RelaxDataServiceImpl.this.relaxDataApi.getRelaxScoreAndTags(this.c, this.d);
                if (relaxScoreAndTags == null) {
                    return Unit.INSTANCE;
                }
                HMLog.info("RelaxDataApiImpl", new C0552a(relaxScoreAndTags));
                RelaxDataServiceImpl.this.musicTagDao.insert(new UserMusicTag(strUserIdOrThrow, this.c, relaxScoreAndTags.getTags(), relaxScoreAndTags.getRelaxations(), relaxScoreAndTags.getDaysOfContinuous()));
                return Unit.INSTANCE;
            } catch (Exception e) {
                HMLog.info("RelaxDataApiImpl", new b(e));
                e.printStackTrace();
            }
        }
    }

    public RelaxDataServiceImpl(@NotNull AccountService accountService, @NotNull RelaxDataApi relaxDataApi, @NotNull MusicTagDao musicTagDao) {
        this.userApi = accountService;
        this.relaxDataApi = relaxDataApi;
        this.musicTagDao = musicTagDao;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a(long sleepStartTime, long sleepEndTime) {
        e.f(this.coroutineScope, null, null, new a(sleepStartTime, sleepEndTime, null), 3, null);
    }

    @Override // com.huami.sky.service.RelaxDataService
    @Nullable
    public Object getRelaxData(final long j, final long j2, @NotNull Continuation<? super Flow<RelaxData>> continuation) {
        this.isFetchData = false;
        String strUserId = AccountServiceExtKt.userId(this.userApi);
        if (strUserId == null) {
            return FlowKt.emptyFlow();
        }
        final Flow<UserMusicTag> musicTag = this.musicTagDao.getMusicTag(strUserId, j);
        return FlowKt.flowOn(new Flow<RelaxData>() { // from class: com.huami.sky.lib.api.RelaxDataServiceImpl$getRelaxData$$inlined$map$1

            /* JADX INFO: renamed from: com.huami.sky.lib.api.RelaxDataServiceImpl$getRelaxData$$inlined$map$1$2, reason: invalid class name */
            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001b\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00028\u0000H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0006¸\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/FlowKt__CollectKt$collect$3", "Lkotlinx/coroutines/flow/FlowCollector;", "value", "", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-core", "kotlinx/coroutines/flow/FlowKt__TransformKt$map$$inlined$unsafeTransform$1$2"}, k = 1, mv = {1, 5, 1})
            public static final class AnonymousClass2 implements FlowCollector<UserMusicTag> {
                public final /* synthetic */ FlowCollector a;
                public final /* synthetic */ RelaxDataServiceImpl b;
                public final /* synthetic */ long c;
                public final /* synthetic */ long d;

                /* JADX INFO: renamed from: com.huami.sky.lib.api.RelaxDataServiceImpl$getRelaxData$$inlined$map$1$2$1, reason: invalid class name */
                @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
                @DebugMetadata(c = "com.huami.sky.lib.api.RelaxDataServiceImpl$getRelaxData$$inlined$map$1$2", f = "RelaxDataServiceImpl.kt", i = {}, l = {137}, m = "emit", n = {}, s = {})
                public static final class AnonymousClass1 extends ContinuationImpl {
                    public /* synthetic */ Object a;
                    public int b;
                    public Object c;

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

                public AnonymousClass2(FlowCollector flowCollector, RelaxDataServiceImpl relaxDataServiceImpl, long j, long j2) {
                    this.a = flowCollector;
                    this.b = relaxDataServiceImpl;
                    this.c = j;
                    this.d = j2;
                }

                /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                @Override // kotlinx.coroutines.flow.FlowCollector
                @Nullable
                public Object emit(UserMusicTag userMusicTag, @NotNull Continuation continuation) {
                    AnonymousClass1 anonymousClass1;
                    RelaxData relaxData;
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
                        UserMusicTag userMusicTag2 = userMusicTag;
                        if (userMusicTag2 == null) {
                            if (!this.b.isFetchData) {
                                this.b.isFetchData = true;
                                this.b.a(this.c, this.d);
                            }
                            relaxData = null;
                        } else {
                            List<MusicTags> musicTags = userMusicTag2.getMusicTags();
                            ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(musicTags, 10));
                            Iterator<T> it2 = musicTags.iterator();
                            while (it2.hasNext()) {
                                arrayList.add(((MusicTags) it2.next()).getName());
                            }
                            List<RelaxInfo> scores = userMusicTag2.getScores();
                            ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(scores, 10));
                            for (RelaxInfo relaxInfo : scores) {
                                arrayList2.add(new RelaxScore(relaxInfo.getValue(), relaxInfo.getCreatedAt()));
                            }
                            relaxData = new RelaxData(arrayList, arrayList2, userMusicTag2.getDaysOfContinuous());
                        }
                        anonymousClass1.b = 1;
                        if (flowCollector.emit(relaxData, anonymousClass1) == coroutine_suspended) {
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
            public Object collect(@NotNull FlowCollector<? super RelaxData> flowCollector, @NotNull Continuation continuation2) {
                Object objCollect = musicTag.collect(new AnonymousClass2(flowCollector, this, j, j2), continuation2);
                return objCollect == a.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
            }
        }, Dispatchers.getIO());
    }
}
