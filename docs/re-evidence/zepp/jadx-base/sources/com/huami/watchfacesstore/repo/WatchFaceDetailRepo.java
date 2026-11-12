package com.huami.watchfacesstore.repo;

import com.facebook.appevents.UserDataStore;
import com.huami.watchfacesstore.api.HomeApi;
import com.huami.watchfacesstore.bean.Metas;
import com.huami.watchfacesstore.bean.Publisher;
import com.huami.watchfacesstore.bean.WatchFaceDetailBean;
import com.huami.watchfacesstore.repo.WatchFaceDetailRepo;
import com.huami.watchfacesstore.room.WatchFaceDao;
import com.huami.watchfacesstore.room.WatchFaceDataBase;
import com.huami.watchfacesstore.room.WatchFaceInfo;
import com.huami.watchfacesstore.room.publisher.PublisherInfo;
import com.huami.watchfacesstore.ui.store.detail.WatchFaceDetailActivity;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010&\u001a\u00020#\u0012\u0006\u0010)\u001a\u00020'¢\u0006\u0004\b*\u0010+J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J \u0010\f\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\u0006J%\u0010\r\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0086@ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000eJ\u0016\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0006J\u0016\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0006J)\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u00132\u0006\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u0006H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u0016J\u0016\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u0006J \u0010\u001b\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0006J'\u0010\u001d\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\b\u0010\u001c\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u001d\u0010\u001eJ\u0018\u0010!\u001a\u00020\u00042\u0006\u0010 \u001a\u00020\u001f2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002J\u000e\u0010\"\u001a\u00020\u00042\u0006\u0010 \u001a\u00020\u001fR\u0016\u0010&\u001a\u00020#8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0016\u0010)\u001a\u00020'8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010(\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006,"}, d2 = {"Lcom/huami/watchfacesstore/repo/WatchFaceDetailRepo;", "", "Lcom/huami/watchfacesstore/room/publisher/PublisherInfo;", "publisher", "", "b", "", "device", "", WatchFaceDetailActivity.WATCH_FACE_ID, "styles", "Lcom/huami/watchfacesstore/bean/WatchFaceDetailBean;", "getWatchFaceDetailByOnline", "getWatchFaceDetailByLocal", "(Ljava/lang/String;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "collectWatchFace", "deleteCollectWatchFace", "deviceId", "builtinIds", "", "Lcom/huami/watchfacesstore/bean/MyWatchFaceBean;", "getMyWatchList", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "ids", "", "reportDownload", "newBgPath", "updateWatchFaceBgPath", "selectColor", "updateWatchFaceColor", "(Ljava/lang/String;ILjava/lang/Integer;)I", "Lcom/huami/watchfacesstore/room/WatchFaceInfo;", "info", "insertWatchInfo", "updateWatchFaceInfo", "Lcom/huami/watchfacesstore/api/HomeApi;", "a", "Lcom/huami/watchfacesstore/api/HomeApi;", "api", "Lcom/huami/watchfacesstore/room/WatchFaceDataBase;", "Lcom/huami/watchfacesstore/room/WatchFaceDataBase;", UserDataStore.DATE_OF_BIRTH, "<init>", "(Lcom/huami/watchfacesstore/api/HomeApi;Lcom/huami/watchfacesstore/room/WatchFaceDataBase;)V", "lib_release"}, k = 1, mv = {1, 5, 1})
public final class WatchFaceDetailRepo {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final HomeApi api;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final WatchFaceDataBase db;

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.watchfacesstore.repo.WatchFaceDetailRepo", f = "WatchFaceDetailRepo.kt", i = {0, 0, 0, 0}, l = {63}, m = "getMyWatchList", n = {"this", "deviceId", "res", "item"}, s = {"L$0", "L$1", "L$2", "L$4"})
    public static final class a extends ContinuationImpl {
        public Object a;
        public Object b;
        public Object c;
        public Object d;
        public Object e;
        public /* synthetic */ Object f;
        public int h;

        public a(Continuation<? super a> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f = obj;
            this.h |= Integer.MIN_VALUE;
            return WatchFaceDetailRepo.this.getMyWatchList(null, null, this);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.watchfacesstore.repo.WatchFaceDetailRepo", f = "WatchFaceDetailRepo.kt", i = {0}, l = {35}, m = "getWatchFaceDetailByLocal", n = {"this"}, s = {"L$0"})
    public static final class b extends ContinuationImpl {
        public Object a;
        public /* synthetic */ Object b;
        public int d;

        public b(Continuation<? super b> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.b = obj;
            this.d |= Integer.MIN_VALUE;
            return WatchFaceDetailRepo.this.getWatchFaceDetailByLocal(null, 0, this);
        }
    }

    public WatchFaceDetailRepo(@NotNull HomeApi homeApi, @NotNull WatchFaceDataBase watchFaceDataBase) {
        this.api = homeApi;
        this.db = watchFaceDataBase;
    }

    private final void b(PublisherInfo publisher) {
        if (this.db.publisherDao().getPublisherInfo(publisher.getId()) == null) {
            this.db.publisherDao().insertPublisher(publisher);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(WatchFaceDetailRepo watchFaceDetailRepo, WatchFaceInfo watchFaceInfo, PublisherInfo publisherInfo) {
        watchFaceDetailRepo.db.watchFaceDao().insertWatchInfo(watchFaceInfo);
        if (publisherInfo == null) {
            return;
        }
        watchFaceDetailRepo.b(publisherInfo);
    }

    public static /* synthetic */ WatchFaceDetailBean getWatchFaceDetailByOnline$default(WatchFaceDetailRepo watchFaceDetailRepo, String str, int i, String str2, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            str2 = "enable";
        }
        return watchFaceDetailRepo.getWatchFaceDetailByOnline(str, i, str2);
    }

    public final void collectWatchFace(@NotNull String device, @NotNull String watchFaceId) {
        this.api.collectWatchFace(device, watchFaceId);
    }

    public final void deleteCollectWatchFace(@NotNull String device, @NotNull String watchFaceId) {
        this.api.deleteCollectWatchFace(device, watchFaceId);
    }

    /* JADX WARN: Code duplicated, block: B:17:0x005b  */
    /* JADX WARN: Code duplicated, block: B:21:0x0083 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:22:0x0084  */
    /* JADX WARN: Code duplicated, block: B:34:0x0067 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:36:? A[LOOP:0: B:15:0x0055->B:36:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0084 -> B:23:0x0088). Please report as a decompilation issue!!! */
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
            boolean r0 = r11 instanceof com.huami.watchfacesstore.repo.WatchFaceDetailRepo.a
            if (r0 == 0) goto L13
            r0 = r11
            com.huami.watchfacesstore.repo.WatchFaceDetailRepo$a r0 = (com.huami.watchfacesstore.repo.WatchFaceDetailRepo.a) r0
            int r1 = r0.h
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.h = r1
            goto L18
        L13:
            com.huami.watchfacesstore.repo.WatchFaceDetailRepo$a r0 = new com.huami.watchfacesstore.repo.WatchFaceDetailRepo$a
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
            com.huami.watchfacesstore.repo.WatchFaceDetailRepo r5 = (com.huami.watchfacesstore.repo.WatchFaceDetailRepo) r5
            kotlin.ResultKt.throwOnFailure(r11)
            goto L88
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
            if (r11 == 0) goto La0
            java.lang.Object r11 = r10.next()
            com.huami.watchfacesstore.bean.MyWatchFaceBean r11 = (com.huami.watchfacesstore.bean.MyWatchFaceBean) r11
            java.lang.String r4 = r11.getTransparentBackground()
            if (r4 == 0) goto L55
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
            if (r4 != r1) goto L84
            return r1
        L84:
            r7 = r4
            r4 = r9
            r9 = r11
            r11 = r7
        L88:
            com.huami.watchfacesstore.room.WatchFaceInfo r11 = (com.huami.watchfacesstore.room.WatchFaceInfo) r11
            if (r11 != 0) goto L8d
            goto L9e
        L8d:
            java.lang.String r6 = r11.getBgPath()
            if (r6 != 0) goto L94
            goto L97
        L94:
            r9.setImage(r6)
        L97:
            java.lang.Integer r11 = r11.getColor()
            r9.setColor(r11)
        L9e:
            r9 = r4
            goto L55
        La0:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huami.watchfacesstore.repo.WatchFaceDetailRepo.getMyWatchList(java.lang.String, java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    @Nullable
    public final Object getWatchFaceDetailByLocal(@NotNull String str, int i, @NotNull Continuation<? super WatchFaceDetailBean> continuation) {
        b bVar;
        WatchFaceDetailRepo watchFaceDetailRepo;
        if (continuation instanceof b) {
            bVar = (b) continuation;
            int i2 = bVar.d;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                bVar.d = i2 - Integer.MIN_VALUE;
            } else {
                bVar = new b(continuation);
            }
        } else {
            bVar = new b(continuation);
        }
        Object watchFaceDetailInfo = bVar.b;
        Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
        int i3 = bVar.d;
        if (i3 == 0) {
            ResultKt.throwOnFailure(watchFaceDetailInfo);
            WatchFaceDao watchFaceDao = this.db.watchFaceDao();
            bVar.a = this;
            bVar.d = 1;
            watchFaceDetailInfo = watchFaceDao.getWatchFaceDetailInfo(str, i, bVar);
            if (watchFaceDetailInfo == coroutine_suspended) {
                return coroutine_suspended;
            }
            watchFaceDetailRepo = this;
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            watchFaceDetailRepo = (WatchFaceDetailRepo) bVar.a;
            ResultKt.throwOnFailure(watchFaceDetailInfo);
        }
        WatchFaceInfo watchFaceInfo = (WatchFaceInfo) watchFaceDetailInfo;
        Publisher publisher = null;
        if (watchFaceInfo == null) {
            return null;
        }
        Integer publisherId = watchFaceInfo.getPublisherId();
        if (publisherId != null) {
            PublisherInfo publisherInfo = watchFaceDetailRepo.db.publisherDao().getPublisherInfo(publisherId.intValue());
            if (publisherInfo != null) {
                publisher = new Publisher(publisherInfo.getId(), publisherInfo.getName(), publisherInfo.getIcon(), publisherInfo.getDescription());
            }
        }
        return new WatchFaceDetailBean(watchFaceInfo.getId(), watchFaceInfo.getName(), watchFaceInfo.getDescription(), watchFaceInfo.getRealPrice(), watchFaceInfo.getRating(), watchFaceInfo.getCustomizable(), false, watchFaceInfo.getThumbnailImgPath(), watchFaceInfo.getDialPath(), false, watchFaceInfo.isFree(), new Metas(watchFaceInfo.getGifPath(), watchFaceInfo.getMinimumFirmwareVersion(), watchFaceInfo.getTransBackgroundPath(), null, null), null, null, watchFaceInfo.getSize(), watchFaceInfo.getBgPath(), publisher, false, false, null, null, watchFaceInfo.getVersion(), null, null, null, 31326208, null);
    }

    @NotNull
    public final WatchFaceDetailBean getWatchFaceDetailByOnline(@NotNull String device, int watchFaceId, @NotNull String styles) {
        return this.api.getWatchFaceDetail(device, watchFaceId, styles);
    }

    public final void insertWatchInfo(@NotNull final WatchFaceInfo info, @Nullable final PublisherInfo publisher) {
        this.db.runInTransaction(new Runnable() { // from class: lf8
            @Override // java.lang.Runnable
            public final void run() {
                WatchFaceDetailRepo.c(this.a, info, publisher);
            }
        });
    }

    public final boolean reportDownload(@NotNull String device, @NotNull String ids) {
        return this.api.reportDownLoad(device, ids);
    }

    public final int updateWatchFaceBgPath(@NotNull String device, int watchFaceId, @Nullable String newBgPath) {
        return this.db.watchFaceDao().updateWatchFaceBgPath(device, watchFaceId, newBgPath);
    }

    public final int updateWatchFaceColor(@NotNull String device, int watchFaceId, @Nullable Integer selectColor) {
        return this.db.watchFaceDao().updateWatchFaceColor(device, watchFaceId, selectColor);
    }

    public final void updateWatchFaceInfo(@NotNull WatchFaceInfo info) {
        this.db.watchFaceDao().updateWatchFaceInfo(info);
    }
}
