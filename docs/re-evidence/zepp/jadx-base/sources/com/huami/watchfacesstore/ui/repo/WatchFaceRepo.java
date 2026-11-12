package com.huami.watchfacesstore.ui.repo;

import com.facebook.appevents.UserDataStore;
import com.huami.tools.log.HMLog;
import com.huami.watchfacesstore.api.HomeApi;
import com.huami.watchfacesstore.bean.HomePageBean;
import com.huami.watchfacesstore.bean.Metas;
import com.huami.watchfacesstore.bean.RankingBean;
import com.huami.watchfacesstore.bean.WatchData;
import com.huami.watchfacesstore.bean.WatchListBean;
import com.huami.watchfacesstore.room.WatchFaceDao;
import com.huami.watchfacesstore.room.WatchFaceDataBase;
import com.huami.watchfacesstore.room.WatchFaceInfo;
import com.huami.watchfacesstore.ui.WatchFaceManager;
import com.ximalaya.ting.android.opensdk.constants.DTransferConstants;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.h;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.flow.Flow;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010-\u001a\u00020*\u0012\u0006\u00101\u001a\u00020.¢\u0006\u0004\b2\u00103J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J \u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u0006J\"\u0010\f\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\u000b\u001a\u00020\u0006J!\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\u0006\u0010\u0003\u001a\u00020\u0002H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010J(\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u0006J(\u0010\u0015\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u0006J\u0014\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\u0006\u0010\u0003\u001a\u00020\u0002J)\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\r2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u0002H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0019\u0010\u001aJ\u001c\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u000e0\rJ/\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001f0\r2\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00060\rH\u0086@ø\u0001\u0000¢\u0006\u0004\b \u0010!J\u001c\u0010\"\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00060\rJ(\u0010%\u001a\u00020\t2\u0006\u0010#\u001a\u00020\u00062\u0006\u0010$\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u0006J\u0016\u0010'\u001a\u00020\t2\u0006\u0010&\u001a\u00020\u00062\u0006\u0010$\u001a\u00020\u0002J\u001a\u0010)\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001f0\r0(2\u0006\u0010\u0003\u001a\u00020\u0002R\u0016\u0010-\u001a\u00020*8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\u0016\u00101\u001a\u00020.8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00100\u0082\u0002\u0004\n\u0002\b\u0019¨\u00064"}, d2 = {"Lcom/huami/watchfacesstore/ui/repo/WatchFaceRepo;", "", "", "deviceId", "Lcom/huami/watchfacesstore/bean/HomePageBean;", "getHomeList", "", DTransferConstants.PAGE, "perPage", "Lcom/huami/watchfacesstore/bean/WatchListBean;", "getWatchFaceList", "prePage", "getCollectionLists", "", "Lcom/huami/watchfacesstore/bean/WatchData;", "getLocalWatchFaceInfoList", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "rankType", "Lcom/huami/watchfacesstore/bean/RankingBean;", "getRankLists", "categoryId", "getCategoryList", "getNewWatchList", "builtinIds", "Lcom/huami/watchfacesstore/bean/MyWatchFaceBean;", "getMyWatchList", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "data", "", "deleteLocalWatchFaceInfo", "ids", "Lcom/huami/watchfacesstore/room/WatchFaceInfo;", "queryLocalInfoByIds", "(Ljava/lang/String;Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deleteLocalInfoByIds", "publisherId", "device", "getPublisherWatchList", "id", "getCoolSpecialList", "Lkotlinx/coroutines/flow/Flow;", "getLocalDataFlow", "Lcom/huami/watchfacesstore/api/HomeApi;", "a", "Lcom/huami/watchfacesstore/api/HomeApi;", "api", "Lcom/huami/watchfacesstore/room/WatchFaceDataBase;", "b", "Lcom/huami/watchfacesstore/room/WatchFaceDataBase;", UserDataStore.DATE_OF_BIRTH, "<init>", "(Lcom/huami/watchfacesstore/api/HomeApi;Lcom/huami/watchfacesstore/room/WatchFaceDataBase;)V", "lib_release"}, k = 1, mv = {1, 5, 1})
public final class WatchFaceRepo {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final HomeApi api;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final WatchFaceDataBase db;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<String> {
        public final /* synthetic */ List<String> a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(List<String> list) {
            super(0);
            this.a = list;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return this.a.toString();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<String> {
        public final /* synthetic */ List<Integer> a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(List<Integer> list) {
            super(0);
            this.a = list;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return this.a.toString();
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
        public final String invoke() {
            return "watchInfo delete success effect " + this.a + " row";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class d extends Lambda implements Function0<String> {
        public final /* synthetic */ Exception a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(Exception exc) {
            super(0);
            this.a = exc;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "delete fail " + this.a.getMessage();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.watchfacesstore.ui.repo.WatchFaceRepo", f = "WatchFaceRepo.kt", i = {}, l = {41}, m = "getLocalWatchFaceInfoList", n = {}, s = {})
    public static final class e extends ContinuationImpl {
        public /* synthetic */ Object a;
        public int c;

        public e(Continuation<? super e> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.a = obj;
            this.c |= Integer.MIN_VALUE;
            return WatchFaceRepo.this.getLocalWatchFaceInfoList(null, this);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.watchfacesstore.ui.repo.WatchFaceRepo", f = "WatchFaceRepo.kt", i = {0, 0, 0}, l = {92}, m = "getMyWatchList", n = {"this", "deviceId", "res"}, s = {"L$0", "L$1", "L$2"})
    public static final class f extends ContinuationImpl {
        public Object a;
        public Object b;
        public Object c;
        public Object d;
        public Object e;
        public /* synthetic */ Object f;
        public int h;

        public f(Continuation<? super f> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f = obj;
            this.h |= Integer.MIN_VALUE;
            return WatchFaceRepo.this.getMyWatchList(null, null, this);
        }
    }

    public WatchFaceRepo(@NotNull HomeApi homeApi, @NotNull WatchFaceDataBase watchFaceDataBase) {
        this.api = homeApi;
        this.db = watchFaceDataBase;
    }

    public static /* synthetic */ WatchListBean getCategoryList$default(WatchFaceRepo watchFaceRepo, String str, int i, int i2, int i3, int i4, Object obj) {
        if ((i4 & 8) != 0) {
            i3 = 10;
        }
        return watchFaceRepo.getCategoryList(str, i, i2, i3);
    }

    public static /* synthetic */ WatchListBean getCollectionLists$default(WatchFaceRepo watchFaceRepo, String str, int i, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i = 1;
        }
        if ((i3 & 4) != 0) {
            i2 = 10;
        }
        return watchFaceRepo.getCollectionLists(str, i, i2);
    }

    public static /* synthetic */ WatchListBean getPublisherWatchList$default(WatchFaceRepo watchFaceRepo, int i, String str, int i2, int i3, int i4, Object obj) {
        if ((i4 & 8) != 0) {
            i3 = 10;
        }
        return watchFaceRepo.getPublisherWatchList(i, str, i2, i3);
    }

    public static /* synthetic */ RankingBean getRankLists$default(WatchFaceRepo watchFaceRepo, String str, String str2, int i, int i2, int i3, Object obj) {
        if ((i3 & 8) != 0) {
            i2 = 10;
        }
        return watchFaceRepo.getRankLists(str, str2, i, i2);
    }

    public static /* synthetic */ WatchListBean getWatchFaceList$default(WatchFaceRepo watchFaceRepo, String str, int i, int i2, int i3, Object obj) {
        if ((i3 & 4) != 0) {
            i2 = 10;
        }
        return watchFaceRepo.getWatchFaceList(str, i, i2);
    }

    public final int deleteLocalInfoByIds(@NotNull String deviceId, @NotNull List<Integer> ids) {
        return this.db.watchFaceDao().deleteWatchFaceInfoByIds(deviceId, CollectionsKt___CollectionsKt.toIntArray(ids));
    }

    public final boolean deleteLocalWatchFaceInfo(@NotNull String deviceId, @NotNull List<WatchData> data) {
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(data, 10));
        Iterator<T> it2 = data.iterator();
        while (it2.hasNext()) {
            arrayList.add(new File(((WatchData) it2.next()).getDialPath()).getParent());
        }
        ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(data, 10));
        Iterator<T> it3 = data.iterator();
        while (it3.hasNext()) {
            arrayList2.add(Integer.valueOf(((WatchData) it3.next()).getId()));
        }
        HMLog.info("watchRepo", new a(arrayList));
        HMLog.info("watchRepo", new b(arrayList2));
        try {
            Iterator it4 = arrayList.iterator();
            while (it4.hasNext()) {
                WatchFaceManager.INSTANCE.delete((String) it4.next());
            }
            int iDeleteWatchFaceInfoByIds = this.db.watchFaceDao().deleteWatchFaceInfoByIds(deviceId, CollectionsKt___CollectionsKt.toIntArray(arrayList2));
            HMLog.info("watchRepo", new c(iDeleteWatchFaceInfoByIds));
            return iDeleteWatchFaceInfoByIds > 0;
        } catch (Exception e2) {
            HMLog.info("watchRepo", new d(e2));
            return false;
        }
    }

    @NotNull
    public final WatchListBean getCategoryList(@NotNull String deviceId, int categoryId, int page, int perPage) {
        return this.api.getCategoryList(deviceId, categoryId, page, perPage);
    }

    @NotNull
    public final WatchListBean getCollectionLists(@NotNull String deviceId, int page, int prePage) {
        return this.api.getCollectionList(deviceId, page, prePage);
    }

    @NotNull
    public final WatchListBean getCoolSpecialList(int id, @NotNull String device) {
        return this.api.getCoolSpecialList(id, device);
    }

    @NotNull
    public final HomePageBean getHomeList(@NotNull String deviceId) {
        return this.api.getHomePageList(deviceId);
    }

    @NotNull
    public final Flow<List<WatchFaceInfo>> getLocalDataFlow(@NotNull String deviceId) {
        return this.db.watchFaceDao().getWatchFaceInfoFlow(deviceId);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    @Nullable
    public final Object getLocalWatchFaceInfoList(@NotNull String str, @NotNull Continuation<? super List<WatchData>> continuation) {
        e eVar;
        if (continuation instanceof e) {
            eVar = (e) continuation;
            int i = eVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                eVar.c = i - Integer.MIN_VALUE;
            } else {
                eVar = new e(continuation);
            }
        } else {
            eVar = new e(continuation);
        }
        Object watchFaceInfo = eVar.a;
        Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
        int i2 = eVar.c;
        if (i2 == 0) {
            ResultKt.throwOnFailure(watchFaceInfo);
            WatchFaceDao watchFaceDao = this.db.watchFaceDao();
            eVar.c = 1;
            watchFaceInfo = watchFaceDao.getWatchFaceInfo(str, eVar);
            if (watchFaceInfo == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(watchFaceInfo);
        }
        ArrayList<WatchFaceInfo> arrayList = new ArrayList();
        for (Object obj : (List) watchFaceInfo) {
            WatchFaceInfo watchFaceInfo2 = (WatchFaceInfo) obj;
            if (Boxing.boxBoolean(new File(watchFaceInfo2.getDialPath()).exists() && new File(watchFaceInfo2.getThumbnailImgPath()).exists()).booleanValue()) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (WatchFaceInfo watchFaceInfo3 : arrayList) {
            Boolean boolBoxBoolean = Boxing.boxBoolean(watchFaceInfo3.getCustomizable());
            int id = watchFaceInfo3.getId();
            String bgPath = watchFaceInfo3.getBgPath();
            if (bgPath == null) {
                bgPath = watchFaceInfo3.getThumbnailImgPath();
            }
            h.addAll(arrayList2, kotlin.collections.e.listOf(new WatchData(boolBoxBoolean, id, bgPath, Boxing.boxBoolean(watchFaceInfo3.isFree()), new Metas(null, null, watchFaceInfo3.getTransBackgroundPath(), null, null, 27, null), watchFaceInfo3.getName(), Boxing.boxFloat(watchFaceInfo3.getRealPrice()), Boxing.boxFloat(watchFaceInfo3.getRating()), null, watchFaceInfo3.getColor(), 0, watchFaceInfo3.getDialPath(), watchFaceInfo3.getPublisherId(), null, null, watchFaceInfo3.getVersion(), null, null, null, 484352, null)));
        }
        return arrayList2;
    }

    /* JADX WARN: Code duplicated, block: B:17:0x005b  */
    /* JADX WARN: Code duplicated, block: B:22:0x0084 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:23:0x0085  */
    /* JADX WARN: Code duplicated, block: B:35:0x0068 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:37:? A[LOOP:0: B:15:0x0055->B:37:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x0085 -> B:24:0x0089). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object getMyWatchList(@org.jetbrains.annotations.NotNull java.lang.String r9, @org.jetbrains.annotations.NotNull java.lang.String r10, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super java.util.List<com.huami.watchfacesstore.bean.MyWatchFaceBean>> r11) throws com.huami.http.HttpError {
        /*
            r8 = this;
            boolean r0 = r11 instanceof com.huami.watchfacesstore.ui.repo.WatchFaceRepo.f
            if (r0 == 0) goto L13
            r0 = r11
            com.huami.watchfacesstore.ui.repo.WatchFaceRepo$f r0 = (com.huami.watchfacesstore.ui.repo.WatchFaceRepo.f) r0
            int r1 = r0.h
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.h = r1
            goto L18
        L13:
            com.huami.watchfacesstore.ui.repo.WatchFaceRepo$f r0 = new com.huami.watchfacesstore.ui.repo.WatchFaceRepo$f
            r0.<init>(r11)
        L18:
            java.lang.Object r11 = r0.f
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.h
            r3 = 1
            if (r2 == 0) goto L45
            if (r2 != r3) goto L3d
            java.lang.Object r9 = r0.e
            com.huami.watchfacesstore.bean.MyWatchFaceBean r9 = (com.huami.watchfacesstore.bean.MyWatchFaceBean) r9
            java.lang.Object r10 = r0.d
            java.util.Iterator r10 = (java.util.Iterator) r10
            java.lang.Object r2 = r0.c
            java.util.List r2 = (java.util.List) r2
            java.lang.Object r4 = r0.b
            java.lang.String r4 = (java.lang.String) r4
            java.lang.Object r5 = r0.a
            com.huami.watchfacesstore.ui.repo.WatchFaceRepo r5 = (com.huami.watchfacesstore.ui.repo.WatchFaceRepo) r5
            kotlin.ResultKt.throwOnFailure(r11)
            goto L89
        L3d:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L45:
            kotlin.ResultKt.throwOnFailure(r11)
            com.huami.watchfacesstore.api.HomeApi r11 = r8.api
            java.util.List r10 = r11.getMyWatchList(r9, r10)
            java.util.Iterator r11 = r10.iterator()
            r5 = r8
            r2 = r10
            r10 = r11
        L55:
            boolean r11 = r10.hasNext()
            if (r11 == 0) goto La1
            java.lang.Object r11 = r10.next()
            com.huami.watchfacesstore.bean.MyWatchFaceBean r11 = (com.huami.watchfacesstore.bean.MyWatchFaceBean) r11
            java.lang.String r4 = r11.getTransparentBackground()
            if (r4 != 0) goto L68
            goto L55
        L68:
            com.huami.watchfacesstore.room.WatchFaceDataBase r4 = r5.db
            com.huami.watchfacesstore.room.WatchFaceDao r4 = r4.watchFaceDao()
            int r6 = r11.getId()
            r0.a = r5
            r0.b = r9
            r0.c = r2
            r0.d = r10
            r0.e = r11
            r0.h = r3
            java.lang.Object r4 = r4.getWatchFaceDetailInfo(r9, r6, r0)
            if (r4 != r1) goto L85
            return r1
        L85:
            r7 = r4
            r4 = r9
            r9 = r11
            r11 = r7
        L89:
            com.huami.watchfacesstore.room.WatchFaceInfo r11 = (com.huami.watchfacesstore.room.WatchFaceInfo) r11
            if (r11 != 0) goto L8e
            goto L9f
        L8e:
            java.lang.String r6 = r11.getBgPath()
            if (r6 != 0) goto L95
            goto L98
        L95:
            r9.setImage(r6)
        L98:
            java.lang.Integer r11 = r11.getColor()
            r9.setColor(r11)
        L9f:
            r9 = r4
            goto L55
        La1:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huami.watchfacesstore.ui.repo.WatchFaceRepo.getMyWatchList(java.lang.String, java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @NotNull
    public final List<WatchData> getNewWatchList(@NotNull String deviceId) {
        return this.api.getNewWatchList(deviceId);
    }

    @NotNull
    public final WatchListBean getPublisherWatchList(int publisherId, @NotNull String device, int page, int perPage) {
        return this.api.getPublisherWatchList(publisherId, device, page, perPage);
    }

    @NotNull
    public final RankingBean getRankLists(@NotNull String deviceId, @NotNull String rankType, int page, int perPage) {
        return this.api.getRankingList(deviceId, rankType, page, perPage);
    }

    @NotNull
    public final WatchListBean getWatchFaceList(@NotNull String deviceId, int page, int perPage) {
        return this.api.getHomeWatchList(deviceId, page, perPage);
    }

    @Nullable
    public final Object queryLocalInfoByIds(@NotNull String str, @NotNull List<Integer> list, @NotNull Continuation<? super List<WatchFaceInfo>> continuation) {
        return this.db.watchFaceDao().queryInfoByIds(str, list, continuation);
    }
}
