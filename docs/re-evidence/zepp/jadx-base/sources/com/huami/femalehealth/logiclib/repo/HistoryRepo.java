package com.huami.femalehealth.logiclib.repo;

import androidx.arch.core.util.Function;
import androidx.paging.DataSource;
import androidx.paging.LivePagedListBuilder;
import androidx.paging.PagedList;
import com.facebook.appevents.UserDataStore;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.android.vo.ApiResponse;
import com.huami.android.vo.ApiSuccessResponse;
import com.huami.discovery.bridge.bracelet.BraceletHandler;
import com.huami.femalehealth.logiclib.api.FemaleHealthWebApi;
import com.huami.femalehealth.logiclib.api.pojo.HistoryItemBean;
import com.huami.femalehealth.logiclib.api.pojo.Items;
import com.huami.femalehealth.logiclib.calculation.AidKt;
import com.huami.femalehealth.logiclib.db.FemaleHealthDb;
import com.huami.femalehealth.logiclib.db.dao.HistoryDao;
import com.huami.femalehealth.logiclib.db.po.MenstruationHistory;
import com.huami.femalehealth.logiclib.helper.AppExecutors;
import com.huami.femalehealth.logiclib.helper.DateHelper;
import com.huami.femalehealth.logiclib.helper.DateTriple;
import com.huami.femalehealth.logiclib.helper.ext.PoToVoKt;
import com.huami.femalehealth.logiclib.manager.DataCacheManager;
import com.huami.femalehealth.logiclib.repo.HistoryRepo;
import com.huami.femalehealth.logiclib.vo.HistoryItemVo;
import com.huami.femalehealth.logiclib.vo.Listing;
import com.huami.tools.log.HMLog;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\b\u0007\u0018\u0000 22\u00020\u0001:\u00012B\u001f\u0012\u0006\u0010\u001f\u001a\u00020\u001c\u0012\u0006\u0010#\u001a\u00020 \u0012\u0006\u0010'\u001a\u00020$¢\u0006\u0004\b0\u00101J=\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\b2\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0002¢\u0006\u0004\b\u000b\u0010\fJ2\u0010\u0015\u001a\u00020\u00132\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\b\b\u0002\u0010\u0011\u001a\u00020\u00102\u0010\b\u0002\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0012H\u0002J*\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00192\u0014\u0010\u0017\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00162\u0006\u0010\u0018\u001a\u00020\u0010R\u0016\u0010\u001f\u001a\u00020\u001c8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0016\u0010#\u001a\u00020 8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0016\u0010'\u001a\u00020$8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u0016\u0010+\u001a\u00020(8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u001e\u0010/\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010,8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u0010.¨\u00063"}, d2 = {"Lcom/huami/femalehealth/logiclib/repo/HistoryRepo;", "", "", "limit", "", "next", "", "filterTime", "Lcom/huami/android/vo/ApiResponse;", "Lcom/huami/femalehealth/logiclib/api/pojo/Items;", "Lcom/huami/femalehealth/logiclib/api/pojo/HistoryItemBean;", "o", "(ILjava/lang/String;Ljava/lang/Long;)Lcom/huami/android/vo/ApiResponse;", "", "Lcom/huami/femalehealth/logiclib/db/po/MenstruationHistory;", BraceletHandler.H5_PARAM_BACK_KEY_HISTORY, "", "clearDb", "Lkotlin/Function0;", "", "callback", "g", "Lkotlin/Pair;", "filter", "showCurrentMenstruation", "Lcom/huami/femalehealth/logiclib/vo/Listing;", "Lcom/huami/femalehealth/logiclib/vo/HistoryItemVo;", "loadHistory", "Lcom/huami/femalehealth/logiclib/helper/AppExecutors;", "a", "Lcom/huami/femalehealth/logiclib/helper/AppExecutors;", "appExecutors", "Lcom/huami/femalehealth/logiclib/api/FemaleHealthWebApi;", "b", "Lcom/huami/femalehealth/logiclib/api/FemaleHealthWebApi;", "webApi", "Lcom/huami/femalehealth/logiclib/db/FemaleHealthDb;", "c", "Lcom/huami/femalehealth/logiclib/db/FemaleHealthDb;", UserDataStore.DATE_OF_BIRTH, "Lcom/huami/femalehealth/logiclib/db/dao/HistoryDao;", GoogleApiAvailabilityLight.a, "Lcom/huami/femalehealth/logiclib/db/dao/HistoryDao;", "historyDao", "", "e", "Ljava/util/List;", "catch", "<init>", "(Lcom/huami/femalehealth/logiclib/helper/AppExecutors;Lcom/huami/femalehealth/logiclib/api/FemaleHealthWebApi;Lcom/huami/femalehealth/logiclib/db/FemaleHealthDb;)V", "Companion", "logiclib_release"}, k = 1, mv = {1, 5, 1})
public final class HistoryRepo {
    public static final int DEFAULT_DISTANCE = 5;
    public static final int DEFAULT_PAGE_SIZE = 150;

    @NotNull
    private static final String f = "HistoryRepo";

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final AppExecutors appExecutors;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final FemaleHealthWebApi webApi;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final FemaleHealthDb db;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private final HistoryDao historyDao;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @Nullable
    private List<MenstruationHistory> catch;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: com.huami.femalehealth.logiclib.repo.HistoryRepo$a$a, reason: collision with other inner class name */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        @DebugMetadata(c = "com.huami.femalehealth.logiclib.repo.HistoryRepo$loadHistory$1$1", f = "HistoryRepo.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class C0400a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            public int a;
            public final /* synthetic */ HistoryRepo b;

            /* JADX INFO: renamed from: com.huami.femalehealth.logiclib.repo.HistoryRepo$a$a$a, reason: collision with other inner class name */
            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
            public static final class C0401a extends Lambda implements Function0<String> {
                public static final C0401a a = new C0401a();

                public C0401a() {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                @Nullable
                public final String invoke() {
                    return "initRefresh";
                }
            }

            /* JADX INFO: renamed from: com.huami.femalehealth.logiclib.repo.HistoryRepo$a$a$b */
            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
            public static final class b extends Lambda implements Function0<String> {
                public final /* synthetic */ List<MenstruationHistory> a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public b(List<MenstruationHistory> list) {
                    super(0);
                    this.a = list;
                }

                @Override // kotlin.jvm.functions.Function0
                @Nullable
                public final String invoke() {
                    return Intrinsics.stringPlus("catch:", this.a);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0400a(HistoryRepo historyRepo, Continuation<? super C0400a> continuation) {
                super(2, continuation);
                this.b = historyRepo;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                return new C0400a(this.b, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            @Nullable
            public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
                return ((C0400a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
                if (this.a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                HMLog.info("xys_HistoryRepo", C0401a.a);
                HistoryRepo.h(this.b, CollectionsKt__CollectionsKt.emptyList(), true, null, 4, null);
                HistoryRepo historyRepo = this.b;
                List arrayList = historyRepo.catch;
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                List<MenstruationHistory> listFindAllEntity = this.b.historyDao.findAllEntity();
                HMLog.info("xys_HistoryRepo", new b(listFindAllEntity));
                arrayList.addAll(listFindAllEntity);
                Unit unit = Unit.INSTANCE;
                historyRepo.catch = arrayList;
                return unit;
            }
        }

        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() throws InterruptedException {
            invoke2();
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() throws InterruptedException {
            BuildersKt.runBlocking(Dispatchers.getIO(), new C0400a(HistoryRepo.this, null));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0000H\n"}, d2 = {"", "Lcom/huami/femalehealth/logiclib/db/po/MenstruationHistory;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<List<MenstruationHistory>> {
        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final List<MenstruationHistory> invoke() {
            return HistoryRepo.this.catch;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\b\u001a\u00020\u00062\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005H\n"}, d2 = {"", "Lcom/huami/femalehealth/logiclib/db/po/MenstruationHistory;", BraceletHandler.H5_PARAM_BACK_KEY_HISTORY, "", "clearDb", "Lkotlin/Function0;", "", "callback", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function3<List<? extends MenstruationHistory>, Boolean, Function0<? extends Unit>, Unit> {
        public c() {
            super(3);
        }

        public final void a(@NotNull List<MenstruationHistory> list, boolean z, @Nullable Function0<Unit> function0) {
            HistoryRepo.this.g(list, z, function0);
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(List<? extends MenstruationHistory> list, Boolean bool, Function0<? extends Unit> function0) {
            a(list, bool.booleanValue(), function0);
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\t\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u0007\u0018\u00010\u00062\u0006\u0010\u0001\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\n"}, d2 = {"", "size", "", "next", "", "filterTime", "Lcom/huami/android/vo/ApiResponse;", "Lcom/huami/femalehealth/logiclib/api/pojo/Items;", "Lcom/huami/femalehealth/logiclib/api/pojo/HistoryItemBean;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class d extends Lambda implements Function3<Integer, String, Long, ApiResponse<Items<HistoryItemBean>>> {
        public d() {
            super(3);
        }

        @Nullable
        public final ApiResponse<Items<HistoryItemBean>> a(int i, @Nullable String str, @Nullable Long l) {
            return HistoryRepo.this.o(i, str, l);
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ ApiResponse<Items<HistoryItemBean>> invoke(Integer num, String str, Long l) {
            return a(num.intValue(), str, l);
        }
    }

    public HistoryRepo(@NotNull AppExecutors appExecutors, @NotNull FemaleHealthWebApi femaleHealthWebApi, @NotNull FemaleHealthDb femaleHealthDb) {
        this.appExecutors = appExecutors;
        this.webApi = femaleHealthWebApi;
        this.db = femaleHealthDb;
        this.historyDao = femaleHealthDb.historyDao();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void g(final List<MenstruationHistory> history, final boolean clearDb, final Function0<Unit> callback) {
        this.appExecutors.getNetworkIO().execute(new Runnable() { // from class: z14
            @Override // java.lang.Runnable
            public final void run() {
                HistoryRepo.i(this.a, callback, clearDb, history);
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void h(HistoryRepo historyRepo, List list, boolean z, Function0 function0, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        if ((i & 4) != 0) {
            function0 = null;
        }
        historyRepo.g(list, z, function0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void i(final HistoryRepo historyRepo, Function0 function0, final boolean z, final List list) {
        historyRepo.db.runInTransaction(new Runnable() { // from class: a24
            @Override // java.lang.Runnable
            public final void run() {
                HistoryRepo.j(z, historyRepo, list);
            }
        });
        if (function0 == null) {
            return;
        }
        function0.invoke();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void j(boolean z, HistoryRepo historyRepo, List list) {
        if (z) {
            historyRepo.historyDao.deleteAll();
        }
        historyRepo.historyDao.insertAll(list);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final HistoryItemVo k(MenstruationHistory menstruationHistory) {
        return PoToVoKt.toHistoryItemVo(menstruationHistory);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final HistoryItemVo l(MenstruationHistory menstruationHistory) {
        return PoToVoKt.toHistoryItemVo(menstruationHistory);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final HistoryItemVo m(MenstruationHistory menstruationHistory) {
        return PoToVoKt.toHistoryItemVo(menstruationHistory);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final HistoryItemVo n(MenstruationHistory menstruationHistory) {
        return PoToVoKt.toHistoryItemVo(menstruationHistory);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ApiResponse<Items<HistoryItemBean>> o(int limit, String next, Long filterTime) {
        ApiResponse<Items<HistoryItemBean>> apiResponseLoadHistory$default = DataCacheManager.loadHistory$default(DataCacheManager.INSTANCE, limit, next, filterTime, false, 8, null);
        if (!(apiResponseLoadHistory$default instanceof ApiSuccessResponse)) {
            return apiResponseLoadHistory$default;
        }
        long jResetZeroHour = AidKt.resetZeroHour(DateHelper.INSTANCE.today().getTime().getTime());
        ArrayList arrayList = new ArrayList();
        ApiSuccessResponse apiSuccessResponse = (ApiSuccessResponse) apiResponseLoadHistory$default;
        for (HistoryItemBean historyItemBean : ((Items) apiSuccessResponse.getBody()).getItems()) {
            if (historyItemBean.getEnd() == 0) {
                Long menstrualEndTime = historyItemBean.getMenstrualEndTime();
                if ((menstrualEndTime == null ? Long.MAX_VALUE : menstrualEndTime.longValue()) < jResetZeroHour) {
                    this.webApi.menstruationEndClick(historyItemBean.getId(), true);
                    arrayList.add(historyItemBean.copy((127 & 1) != 0 ? historyItemBean.id : null, (127 & 2) != 0 ? historyItemBean.cycle : 0, (127 & 4) != 0 ? historyItemBean.menstrualPeriod : 0L, (127 & 8) != 0 ? historyItemBean.menstrualEndTime : null, (127 & 16) != 0 ? historyItemBean.month : 0L, (127 & 32) != 0 ? historyItemBean.userId : null, (127 & 64) != 0 ? historyItemBean.updateTime : null, (127 & 128) != 0 ? historyItemBean.end : 1));
                }
            }
            arrayList.add(historyItemBean);
        }
        return new ApiSuccessResponse(new Items(arrayList, ((Items) apiSuccessResponse.getBody()).getNext()));
    }

    public static /* synthetic */ ApiResponse p(HistoryRepo historyRepo, int i, String str, Long l, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 150;
        }
        if ((i2 & 2) != 0) {
            str = null;
        }
        if ((i2 & 4) != 0) {
            l = null;
        }
        return historyRepo.o(i, str, l);
    }

    @NotNull
    public final Listing<HistoryItemVo> loadHistory(@Nullable Pair<Integer, Integer> filter, boolean showCurrentMenstruation) {
        DataSource.Factory map;
        e eVar = new e(this.appExecutors, filter == null ? null : Long.valueOf(AidKt.toDate(new DateTriple(filter.getFirst().intValue(), filter.getSecond().intValue(), 1)).getTime()), new b(), new c(), new d());
        PagedList.Config configBuild = new PagedList.Config.Builder().setEnablePlaceholders(true).setPageSize(150).setInitialLoadSizeHint(150).setPrefetchDistance(5).build();
        if (filter == null) {
            map = showCurrentMenstruation ? this.historyDao.findAll().map(new Function() { // from class: v14
                @Override // androidx.arch.core.util.Function
                public final Object apply(Object obj) {
                    return HistoryRepo.k((MenstruationHistory) obj);
                }
            }) : this.historyDao.findEndingAll().map(new Function() { // from class: x14
                @Override // androidx.arch.core.util.Function
                public final Object apply(Object obj) {
                    return HistoryRepo.l((MenstruationHistory) obj);
                }
            });
        } else {
            map = showCurrentMenstruation ? HistoryDao.DefaultImpls.findByMonth$default(this.historyDao, filter.getFirst().intValue(), filter.getSecond().intValue(), 0L, 4, null).map(new Function() { // from class: y14
                @Override // androidx.arch.core.util.Function
                public final Object apply(Object obj) {
                    return HistoryRepo.m((MenstruationHistory) obj);
                }
            }) : HistoryDao.DefaultImpls.findEndingByMonth$default(this.historyDao, filter.getFirst().intValue(), filter.getSecond().intValue(), 0L, 4, null).map(new Function() { // from class: w14
                @Override // androidx.arch.core.util.Function
                public final Object apply(Object obj) {
                    return HistoryRepo.n((MenstruationHistory) obj);
                }
            });
        }
        return new Listing<>(new LivePagedListBuilder(map, configBuild).setBoundaryCallback(eVar).setFetchExecutor(this.appExecutors.getDiskIO()).build(), null, null, null, new a(), 14, null);
    }
}
