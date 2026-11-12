package com.huami.treadmill.data.source;

import androidx.arch.core.util.Function;
import androidx.exifinterface.media.ExifInterface;
import androidx.p008lifecycle.LiveData;
import androidx.p008lifecycle.MutableLiveData;
import androidx.p008lifecycle.Transformations;
import androidx.paging.DataSource;
import androidx.paging.LivePagedListBuilder;
import androidx.paging.PagedList;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.facebook.appevents.UserDataStore;
import com.huami.treadmill.api.ApiResponse;
import com.huami.treadmill.api.ApiResponseKt;
import com.huami.treadmill.api.Callback;
import com.huami.treadmill.api.TdmillApi;
import com.huami.treadmill.data.Items;
import com.huami.treadmill.data.Listing;
import com.huami.treadmill.data.NetworkState;
import com.huami.treadmill.data.TdLine;
import com.huami.treadmill.data.TdLineDetail;
import com.huami.treadmill.data.TdLineDetailRun;
import com.huami.treadmill.data.TdPromotionLine;
import com.huami.treadmill.data.TdRankingList;
import com.huami.treadmill.data.source.TdmillRepository;
import com.huami.treadmill.data.source.db.TdlineDao;
import com.huami.treadmill.data.source.db.TreadmillDb;
import com.huami.treadmill.paging.PageKey;
import com.huami.treadmill.paging.PagedListBoundaryCallback;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.Executor;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000¨\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 G2\u00020\u0001:\u0001GB3\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017\u0012\u0006\u00106\u001a\u000205\u0012\u0006\u00108\u001a\u000205\u0012\u0006\u0010:\u001a\u000209\u0012\b\b\u0002\u0010>\u001a\u00020\u001d¢\u0006\u0004\bD\u0010EB!\b\u0016\u0012\u0006\u00108\u001a\u000205\u0012\u0006\u00106\u001a\u000205\u0012\u0006\u0010:\u001a\u000209¢\u0006\u0004\bD\u0010FJ\u0018\u0010\u0006\u001a\u00020\u00052\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002H\u0002J\u0091\u0001\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0019\"\u0004\b\u0000\u0010\u0007\"\u000e\b\u0001\u0010\t*\b\u0012\u0004\u0012\u00028\u00000\b2)\u0010\u0010\u001a%\u0012\u0015\u0012\u0013\u0018\u00010\u000b¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u000f0\n2\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00020\u00050\n2\b\b\u0002\u0010\u0012\u001a\u00020\u000b2\b\b\u0002\u0010\u0013\u001a\u00020\u000b2\u0010\u0010\u0016\u001a\f\u0012\u0004\u0012\u00020\u00050\u0014j\u0002`\u00152\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017J\u0099\u0001\u0010 \u001a\b\u0012\u0004\u0012\u00028\u00000\u001f\"\u0004\b\u0000\u0010\u0007\"\u000e\b\u0001\u0010\t*\b\u0012\u0004\u0012\u00028\u00000\b2\u0012\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00028\u00000\u001c2\u0006\u0010\u0012\u001a\u00020\u000b2)\u0010\u0010\u001a%\u0012\u0015\u0012\u0013\u0018\u00010\u000b¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u000f0\n2\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00020\u00050\n2\u0010\u0010\u0016\u001a\f\u0012\u0004\u0012\u00020\u00050\u0014j\u0002`\u00152\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017J2\u0010(\u001a\u00020\u00052\u0006\u0010\"\u001a\u00020!2\u0006\u0010#\u001a\u00020!2\u0006\u0010$\u001a\u00020!2\u0012\u0010'\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020&0\b0%J\u001c\u0010*\u001a\u00020\u00052\u0006\u0010\"\u001a\u00020!2\f\u0010'\u001a\b\u0012\u0004\u0012\u00020)0%J\u001c\u0010,\u001a\u00020\u00052\u0006\u0010\"\u001a\u00020!2\f\u0010'\u001a\b\u0012\u0004\u0012\u00020+0%J\u001c\u0010-\u001a\u00020\u00052\u0006\u0010\"\u001a\u00020!2\f\u0010'\u001a\b\u0012\u0004\u0012\u00020+0%J\u001c\u0010/\u001a\u00020\u00052\u0006\u0010\"\u001a\u00020!2\f\u0010'\u001a\b\u0012\u0004\u0012\u00020.0%J \u00101\u001a\u000e\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00028\u00000\u001c\"\u0004\b\u0000\u0010\u00072\u0006\u00100\u001a\u00020\u000bR\u001b\u0010\u0018\u001a\u0004\u0018\u00010\u00178\u0006@\u0006¢\u0006\f\n\u0004\b\u0018\u00102\u001a\u0004\b3\u00104R\u0016\u00106\u001a\u0002058\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u00107R\u0016\u00108\u001a\u0002058\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u00107R\u0019\u0010:\u001a\u0002098\u0006@\u0006¢\u0006\f\n\u0004\b:\u0010;\u001a\u0004\b<\u0010=R\u0016\u0010>\u001a\u00020\u001d8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b>\u0010?R2\u0010B\u001a\u001e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000b0@j\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000b`A8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bB\u0010C¨\u0006H"}, d2 = {"Lcom/huami/treadmill/data/source/TdmillRepository;", "", "", "Lcom/huami/treadmill/data/TdLine;", "body", "", "insertResultLinesIntoDb", ExifInterface.GPS_DIRECTION_TRUE, "Lcom/huami/treadmill/data/Items;", "R", "Lkotlin/Function1;", "", "Lkotlin/ParameterName;", "name", "nextPageKey", "Lcom/huami/treadmill/api/ApiResponse;", "webRequest", "handleDb", "pagingKey", "currentKey", "Lkotlin/Function0;", "Lcom/huami/treadmill/paging/ClearDataInDb;", "clearDataInDb", "Lcom/huami/treadmill/data/source/db/TreadmillDb;", UserDataStore.DATE_OF_BIRTH, "Landroidx/lifecycle/LiveData;", "Lcom/huami/treadmill/data/NetworkState;", "refresh", "Landroidx/paging/DataSource$Factory;", "", "pagingDbSource", "Lcom/huami/treadmill/data/Listing;", "getListing", "", "id", "time", "next", "Lcom/huami/treadmill/api/Callback;", "Lcom/huami/treadmill/data/TdLineDetail;", "callback", "getLineDetail", "Lcom/huami/treadmill/data/TdLineDetailRun;", "getOriginLine", "Lcom/huami/treadmill/data/TdRankingList;", "getDiligentRank", "getSpeedRank", "Lcom/huami/treadmill/data/TdPromotionLine;", "getPromotionLinesDetail", "pageKey", "getPagingDbSource", "Lcom/huami/treadmill/data/source/db/TreadmillDb;", "getDb", "()Lcom/huami/treadmill/data/source/db/TreadmillDb;", "Ljava/util/concurrent/Executor;", "mainThread", "Ljava/util/concurrent/Executor;", "ioExecutor", "Lcom/huami/treadmill/api/TdmillApi;", "tdmillApi", "Lcom/huami/treadmill/api/TdmillApi;", "getTdmillApi", "()Lcom/huami/treadmill/api/TdmillApi;", "networkPageSize", LogUtil.I, "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", "pagingKeyCache", "Ljava/util/HashMap;", "<init>", "(Lcom/huami/treadmill/data/source/db/TreadmillDb;Ljava/util/concurrent/Executor;Ljava/util/concurrent/Executor;Lcom/huami/treadmill/api/TdmillApi;I)V", "(Ljava/util/concurrent/Executor;Ljava/util/concurrent/Executor;Lcom/huami/treadmill/api/TdmillApi;)V", "Companion", "treadmill_release"}, k = 1, mv = {1, 5, 1})
public final class TdmillRepository {
    private static final int DEFAULT_NETWORK_PAGE_SIZE = 15;

    @Nullable
    private final TreadmillDb db;

    @NotNull
    private final Executor ioExecutor;

    @NotNull
    private final Executor mainThread;
    private final int networkPageSize;

    @NotNull
    private final HashMap<String, String> pagingKeyCache;

    @NotNull
    private final TdmillApi tdmillApi;

    public TdmillRepository(@Nullable TreadmillDb treadmillDb, @NotNull Executor executor, @NotNull Executor executor2, @NotNull TdmillApi tdmillApi, int i) {
        this.db = treadmillDb;
        this.mainThread = executor;
        this.ioExecutor = executor2;
        this.tdmillApi = tdmillApi;
        this.networkPageSize = i;
        this.pagingKeyCache = new HashMap<>();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: getDiligentRank$lambda-7, reason: not valid java name */
    public static final void m3394getDiligentRank$lambda7(TdmillRepository tdmillRepository, long j, final Callback callback) {
        final ApiResponse<TdRankingList> diligentRank = tdmillRepository.getTdmillApi().getDiligentRank(j);
        tdmillRepository.mainThread.execute(new Runnable() { // from class: dm7
            @Override // java.lang.Runnable
            public final void run() {
                ApiResponseKt.enqueue(diligentRank, callback);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: getLineDetail$lambda-3, reason: not valid java name */
    public static final void m3396getLineDetail$lambda3(TdmillRepository tdmillRepository, long j, long j2, long j3, final Callback callback) {
        final ApiResponse<Items<TdLineDetail>> lineDetail = tdmillRepository.getTdmillApi().getLineDetail(j, j2, j3);
        tdmillRepository.mainThread.execute(new Runnable() { // from class: bm7
            @Override // java.lang.Runnable
            public final void run() {
                ApiResponseKt.enqueue(lineDetail, callback);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: getListing$lambda-1, reason: not valid java name */
    public static final LiveData m3398getListing$lambda1(TdmillRepository tdmillRepository, Function1 function1, Function1 function2, String str, Function0 function0, TreadmillDb treadmillDb, Unit unit) {
        return refresh$default(tdmillRepository, function1, function2, str, null, function0, treadmillDb, 8, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: getOriginLine$lambda-5, reason: not valid java name */
    public static final void m3399getOriginLine$lambda5(TdmillRepository tdmillRepository, long j, final Callback callback) {
        final ApiResponse<TdLineDetailRun> originLine = tdmillRepository.getTdmillApi().getOriginLine(j);
        tdmillRepository.mainThread.execute(new Runnable() { // from class: em7
            @Override // java.lang.Runnable
            public final void run() {
                ApiResponseKt.enqueue(originLine, callback);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: getPromotionLinesDetail$lambda-11, reason: not valid java name */
    public static final void m3401getPromotionLinesDetail$lambda11(TdmillRepository tdmillRepository, long j, final Callback callback) {
        final ApiResponse<TdPromotionLine> promotionLinesDetail = tdmillRepository.getTdmillApi().getPromotionLinesDetail(j);
        tdmillRepository.mainThread.execute(new Runnable() { // from class: fm7
            @Override // java.lang.Runnable
            public final void run() {
                ApiResponseKt.enqueue(promotionLinesDetail, callback);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: getSpeedRank$lambda-9, reason: not valid java name */
    public static final void m3403getSpeedRank$lambda9(TdmillRepository tdmillRepository, long j, final Callback callback) {
        final ApiResponse<TdRankingList> speedRank = tdmillRepository.getTdmillApi().getSpeedRank(j);
        tdmillRepository.mainThread.execute(new Runnable() { // from class: cm7
            @Override // java.lang.Runnable
            public final void run() {
                ApiResponseKt.enqueue(speedRank, callback);
            }
        });
    }

    private final void insertResultLinesIntoDb(List<TdLine> body) {
        TreadmillDb db;
        if (body == null || (db = getDb()) == null) {
            return;
        }
        TdlineDao tdlineDaoLines = db.lines();
        TdLine tdLineQueryLastLine = tdlineDaoLines.queryLastLine();
        int i = 0;
        int index = tdLineQueryLastLine == null ? 0 : tdLineQueryLastLine.getIndex();
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(body, 10));
        for (Object obj : body) {
            int i2 = i + 1;
            if (i < 0) {
                CollectionsKt__CollectionsKt.throwIndexOverflow();
            }
            TdLine tdLine = (TdLine) obj;
            if (index != 0) {
                i += index + 1;
            }
            tdLine.setIndex(i);
            arrayList.add(tdLine);
            i = i2;
        }
        tdlineDaoLines.insert(arrayList);
    }

    public static /* synthetic */ LiveData refresh$default(TdmillRepository tdmillRepository, Function1 function1, Function1 function2, String str, String str2, Function0 function0, TreadmillDb treadmillDb, int i, Object obj) {
        return tdmillRepository.refresh(function1, function2, (i & 4) != 0 ? "" : str, (i & 8) != 0 ? "" : str2, function0, treadmillDb);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: refresh$lambda-0, reason: not valid java name */
    public static final void m3405refresh$lambda0(Function1 function1, String str, TdmillRepository tdmillRepository, TreadmillDb treadmillDb, MutableLiveData mutableLiveData, Function0 function0, Function1 function2, String str2) {
        ApiResponseKt.enqueue((ApiResponse) function1.invoke(str), new TdmillRepository$refresh$1$1(tdmillRepository, treadmillDb, mutableLiveData, function0, function2, str2));
    }

    @Nullable
    public final TreadmillDb getDb() {
        return this.db;
    }

    public final void getDiligentRank(final long id, @NotNull final Callback<TdRankingList> callback) {
        this.ioExecutor.execute(new Runnable() { // from class: zl7
            @Override // java.lang.Runnable
            public final void run() {
                TdmillRepository.m3394getDiligentRank$lambda7(this.a, id, callback);
            }
        });
    }

    public final void getLineDetail(final long id, final long time, final long next, @NotNull final Callback<Items<TdLineDetail>> callback) {
        this.ioExecutor.execute(new Runnable() { // from class: gm7
            @Override // java.lang.Runnable
            public final void run() {
                TdmillRepository.m3396getLineDetail$lambda3(this.a, id, time, next, callback);
            }
        });
    }

    @NotNull
    public final <T, R extends Items<T>> Listing<T> getListing(@NotNull DataSource.Factory<Integer, T> pagingDbSource, @NotNull final String pagingKey, @NotNull final Function1<? super String, ? extends ApiResponse<R>> webRequest, @NotNull final Function1<? super R, Unit> handleDb, @NotNull final Function0<Unit> clearDataInDb, @Nullable final TreadmillDb db) {
        final PagedListBoundaryCallback pagedListBoundaryCallback = new PagedListBoundaryCallback("", pagingKey, this.pagingKeyCache, webRequest, handleDb, this.ioExecutor);
        final MutableLiveData mutableLiveData = new MutableLiveData();
        LiveData liveDataSwitchMap = Transformations.switchMap(mutableLiveData, new Function() { // from class: yl7
            @Override // androidx.arch.core.util.Function
            public final Object apply(Object obj) {
                return TdmillRepository.m3398getListing$lambda1(this.a, webRequest, handleDb, pagingKey, clearDataInDb, db, (Unit) obj);
            }
        });
        refresh$default(this, webRequest, handleDb, pagingKey, null, clearDataInDb, db, 8, null);
        return new Listing<>(new LivePagedListBuilder(pagingDbSource, new PagedList.Config.Builder().setEnablePlaceholders(false).setPageSize(this.networkPageSize).setInitialLoadSizeHint(this.networkPageSize * 2).setPrefetchDistance(5).build()).setBoundaryCallback(pagedListBoundaryCallback).setFetchExecutor(this.ioExecutor).build(), pagedListBoundaryCallback.getNetworkState(), liveDataSwitchMap, new Function0<Unit>() { // from class: com.huami.treadmill.data.source.TdmillRepository.getListing.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                mutableLiveData.setValue(null);
            }
        }, new Function0<Unit>() { // from class: com.huami.treadmill.data.source.TdmillRepository.getListing.2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                pagedListBoundaryCallback.getHelper().retryAllFailed();
            }
        });
    }

    public final void getOriginLine(final long id, @NotNull final Callback<TdLineDetailRun> callback) {
        this.ioExecutor.execute(new Runnable() { // from class: hm7
            @Override // java.lang.Runnable
            public final void run() {
                TdmillRepository.m3399getOriginLine$lambda5(this.a, id, callback);
            }
        });
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @NotNull
    public final <T> DataSource.Factory<Integer, T> getPagingDbSource(@NotNull String pageKey) {
        if (this.db == null) {
            throw new IllegalArgumentException("db is null");
        }
        switch (pageKey.hashCode()) {
            case -722248605:
                if (pageKey.equals(PageKey.TD_LINE)) {
                    return (DataSource.Factory<Integer, T>) this.db.lines().queryLines();
                }
                break;
            case 473765631:
                if (pageKey.equals(PageKey.TD_KING_DILIGENT)) {
                    return (DataSource.Factory<Integer, T>) this.db.kingsDiligent().queryKings();
                }
                break;
            case 1633531566:
                if (pageKey.equals(PageKey.TD_KING_SPEED)) {
                    return (DataSource.Factory<Integer, T>) this.db.kingsSpeed().queryKings();
                }
                break;
            case 1688462303:
                if (pageKey.equals(PageKey.TD_PROMOTION_LINE)) {
                    return (DataSource.Factory<Integer, T>) this.db.promotionLines().queryLines();
                }
                break;
        }
        throw new IllegalArgumentException(Intrinsics.stringPlus("Unknown ViewModel class: ", pageKey));
    }

    public final void getPromotionLinesDetail(final long id, @NotNull final Callback<TdPromotionLine> callback) {
        this.ioExecutor.execute(new Runnable() { // from class: jm7
            @Override // java.lang.Runnable
            public final void run() {
                TdmillRepository.m3401getPromotionLinesDetail$lambda11(this.a, id, callback);
            }
        });
    }

    public final void getSpeedRank(final long id, @NotNull final Callback<TdRankingList> callback) {
        this.ioExecutor.execute(new Runnable() { // from class: im7
            @Override // java.lang.Runnable
            public final void run() {
                TdmillRepository.m3403getSpeedRank$lambda9(this.a, id, callback);
            }
        });
    }

    @NotNull
    public final TdmillApi getTdmillApi() {
        return this.tdmillApi;
    }

    @NotNull
    public final <T, R extends Items<T>> LiveData<NetworkState> refresh(@NotNull final Function1<? super String, ? extends ApiResponse<R>> webRequest, @NotNull final Function1<? super R, Unit> handleDb, @NotNull final String pagingKey, @NotNull final String currentKey, @NotNull final Function0<Unit> clearDataInDb, @Nullable final TreadmillDb db) {
        final MutableLiveData mutableLiveData = new MutableLiveData();
        mutableLiveData.setValue(NetworkState.INSTANCE.getLOADING());
        this.ioExecutor.execute(new Runnable() { // from class: am7
            @Override // java.lang.Runnable
            public final void run() {
                TdmillRepository.m3405refresh$lambda0(webRequest, currentKey, this, db, mutableLiveData, clearDataInDb, handleDb, pagingKey);
            }
        });
        return mutableLiveData;
    }

    public /* synthetic */ TdmillRepository(TreadmillDb treadmillDb, Executor executor, Executor executor2, TdmillApi tdmillApi, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(treadmillDb, executor, executor2, tdmillApi, (i2 & 16) != 0 ? 15 : i);
    }

    public TdmillRepository(@NotNull Executor executor, @NotNull Executor executor2, @NotNull TdmillApi tdmillApi) {
        this(null, executor2, executor, tdmillApi, 0, 16, null);
    }
}
