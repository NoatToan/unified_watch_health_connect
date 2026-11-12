package com.xiaomi.fit.fitness.persist.db.utils;

import android.text.TextUtils;
import com.miui.tsmclient.model.ErrorCode;
import com.xiaomi.fit.data.common.log.FitnessLogUtils;
import com.xiaomi.fit.fitness.persist.db.FitnessDatabase;
import com.xiaomi.fit.fitness.persist.db.internal.ServerRequestDao;
import com.xiaomi.fit.fitness.persist.db.internal.ServerRequestEntity;
import com.xiaomi.fitness.login.export.RegionExtKt;
import com.xiaomi.fitness.login.export.RegionManager;
import com.xiaomi.fitness.login.region.RegionManagerImpl;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010 \n\u0002\b\u001c\n\u0002\u0010\u0011\n\u0002\b\u0002\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J \u0010\n\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\f\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u0005H\u0086@¢\u0006\u0002\u0010\u000eJ&\u0010\u000f\u001a\u00020\u00102\u0006\u0010\f\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u000bH\u0086@¢\u0006\u0002\u0010\u0012J(\u0010\u0013\u001a\u00020\u00102\u0006\u0010\f\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u00052\b\u0010\u0014\u001a\u0004\u0018\u00010\u0005H\u0086@¢\u0006\u0002\u0010\u0015J \u0010\u0016\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\u00052\b\u0010\u0014\u001a\u0004\u0018\u00010\u0005H\u0086@¢\u0006\u0002\u0010\u000eJ \u0010\u0017\u001a\u0004\u0018\u00010\u00182\u0006\u0010\f\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u0005H\u0086@¢\u0006\u0002\u0010\u000eJ\u0018\u0010\u0019\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u0005H\u0002J\u0010\u0010\u001a\u001a\u0004\u0018\u00010\u000bH\u0086@¢\u0006\u0002\u0010\u001bJ\u0010\u0010\u001c\u001a\u0004\u0018\u00010\u000bH\u0086@¢\u0006\u0002\u0010\u001bJ\u0010\u0010\u001d\u001a\u0004\u0018\u00010\u000bH\u0086@¢\u0006\u0002\u0010\u001bJ\u0010\u0010\u001e\u001a\u0004\u0018\u00010\u000bH\u0086@¢\u0006\u0002\u0010\u001bJ\u0010\u0010\u001f\u001a\u0004\u0018\u00010\u000bH\u0086@¢\u0006\u0002\u0010\u001bJ\u0010\u0010 \u001a\u0004\u0018\u00010\u000bH\u0086@¢\u0006\u0002\u0010\u001bJ\u0018\u0010!\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\"\u001a\u00020\u0005H\u0082@¢\u0006\u0002\u0010#J\u0010\u0010$\u001a\u0004\u0018\u00010\u0018H\u0086@¢\u0006\u0002\u0010\u001bJ\u0010\u0010%\u001a\u0004\u0018\u00010\u0018H\u0086@¢\u0006\u0002\u0010\u001bJ\u0018\u0010&\u001a\u0004\u0018\u00010\u00182\u0006\u0010\"\u001a\u00020\u0005H\u0082@¢\u0006\u0002\u0010#J\u0018\u0010'\u001a\u0004\u0018\u00010\u00182\u0006\u0010\"\u001a\u00020\u0005H\u0086@¢\u0006\u0002\u0010#J\u0018\u0010(\u001a\u0004\u0018\u00010\u00182\u0006\u0010\"\u001a\u00020\u0005H\u0086@¢\u0006\u0002\u0010#J\u001c\u0010)\u001a\b\u0012\u0004\u0012\u00020\u00180*2\u0006\u0010\"\u001a\u00020\u0005H\u0086@¢\u0006\u0002\u0010#J\u0016\u0010+\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u000bH\u0086@¢\u0006\u0002\u0010,J\u0016\u0010-\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u000bH\u0086@¢\u0006\u0002\u0010,J\u0016\u0010.\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u000bH\u0086@¢\u0006\u0002\u0010,J\u0016\u0010/\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u000bH\u0086@¢\u0006\u0002\u0010,J\u0016\u00100\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u000bH\u0086@¢\u0006\u0002\u0010,J\u0016\u00101\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u000bH\u0086@¢\u0006\u0002\u0010,J\u001e\u00102\u001a\u00020\u00102\u0006\u0010\"\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u000bH\u0082@¢\u0006\u0002\u00103J\u0018\u00104\u001a\u00020\u00102\b\u0010\u0014\u001a\u0004\u0018\u00010\u0005H\u0086@¢\u0006\u0002\u0010#J\u0018\u00105\u001a\u00020\u00102\b\u0010\u0014\u001a\u0004\u0018\u00010\u0005H\u0086@¢\u0006\u0002\u0010#J\u0016\u00106\u001a\u00020\u00102\u0006\u0010\"\u001a\u00020\u0005H\u0086@¢\u0006\u0002\u0010#J0\u00107\u001a\u00020\u00102\u0006\u00108\u001a\u00020\u00052\u0006\u00109\u001a\u00020\u000b2\u0006\u0010:\u001a\u00020\u000b2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0005H\u0086@¢\u0006\u0002\u0010;J0\u0010<\u001a\u00020\u00102\u0006\u00108\u001a\u00020\u00052\u0006\u00109\u001a\u00020\u000b2\u0006\u0010:\u001a\u00020\u000b2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0005H\u0086@¢\u0006\u0002\u0010;J8\u0010=\u001a\u00020\u00102\u0006\u00108\u001a\u00020\u00052\u0006\u0010\"\u001a\u00020\u00052\u0006\u00109\u001a\u00020\u000b2\u0006\u0010:\u001a\u00020\u000b2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0005H\u0086@¢\u0006\u0002\u0010>J0\u0010?\u001a\u00020\u00102\u0006\u0010\"\u001a\u00020\u00052\u0006\u00109\u001a\u00020\u000b2\u0006\u0010:\u001a\u00020\u000b2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0005H\u0082@¢\u0006\u0002\u0010;J8\u0010@\u001a\u00020\u00102\u0006\u00108\u001a\u00020\u00052\u0006\u0010\"\u001a\u00020\u00052\u0006\u00109\u001a\u00020\u000b2\u0006\u0010:\u001a\u00020\u000b2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0005H\u0082@¢\u0006\u0002\u0010>J,\u0010A\u001a\u00020\u00102\u0006\u0010\"\u001a\u00020\u00052\u0006\u0010B\u001a\u00020\u00182\f\u0010C\u001a\b\u0012\u0004\u0012\u00020\u00180*H\u0082@¢\u0006\u0002\u0010DJ\"\u0010E\u001a\u00020\u00102\u0012\u0010F\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00180G\"\u00020\u0018H\u0082@¢\u0006\u0002\u0010HR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u00078BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\t¨\u0006I"}, d2 = {"Lcom/xiaomi/fit/fitness/persist/db/utils/ServerRequestDaoUtils;", "", "<init>", "()V", "TAG", "", "serverRequestDao", "Lcom/xiaomi/fit/fitness/persist/db/internal/ServerRequestDao;", "getServerRequestDao", "()Lcom/xiaomi/fit/fitness/persist/db/internal/ServerRequestDao;", "getStatDataMaxWatermark", "", "tag", "key", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "updateStatMaxWatermark", "", "watermark", "(Ljava/lang/String;Ljava/lang/String;JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "updateStatDataTimeRequest", "nextKey", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "updateProjectDataTimeRequest", "getStatDataTimeRequest", "Lcom/xiaomi/fit/fitness/persist/db/internal/ServerRequestEntity;", "genStatPersistKey", "getSportMaxWatermark", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getFitnessMaxWatermark", "getMedicalMaxWatermark", "getRedDotMaxWatermark", "getRainbowMaxWatermark", "getProjectMaxWatermark", "getMaxWatermark", "requestKey", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getRainbowPullRequest", "getRedDotPullRequest", "getOneTimePullRequest", "getRecentOneYearPullRequest", "getFullPullRequest", "getCrossYearPullRequest", "", "updateSportMaxWatermark", "(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "updateFitnessMaxWatermark", "updateMedicalMaxWatermark", "updateRedDotMaxWatermark", "updateRainbowMaxWatermark", "updateProjectMaxWatermark", "updateMaxWatermark", "(Ljava/lang/String;JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "updateRainBowPullRequest", "updateRedDotPullRequest", "insertLatestPullRequest", "insertSportTimePullRequest", "requestAction", "startTime", "endTime", "(Ljava/lang/String;JJLjava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "insertProjectTimePullRequest", "insertFitnessTimePullRequest", "(Ljava/lang/String;Ljava/lang/String;JJLjava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "insertCrossYearPullRequest", "insertTimePullServerRequest", "mergeCrossYearPullRequest", "curRequest", "requestList", "(Ljava/lang/String;Lcom/xiaomi/fit/fitness/persist/db/internal/ServerRequestEntity;Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deleteServerRequest", "entity", "", "([Lcom/xiaomi/fit/fitness/persist/db/internal/ServerRequestEntity;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "fitness-data-core_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ServerRequestDaoUtils {

    @NotNull
    public static final ServerRequestDaoUtils INSTANCE = new ServerRequestDaoUtils();

    @NotNull
    private static final String TAG = "ServerRequestDaoUtils";

    /* JADX INFO: renamed from: com.xiaomi.fit.fitness.persist.db.utils.ServerRequestDaoUtils$getCrossYearPullRequest$1, reason: invalid class name */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fit.fitness.persist.db.utils.ServerRequestDaoUtils", f = "ServerRequestDaoUtils.kt", i = {}, l = {112}, m = "getCrossYearPullRequest", n = {}, s = {})
    public static final class AnonymousClass1 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        public AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ServerRequestDaoUtils.this.getCrossYearPullRequest(null, this);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fit.fitness.persist.db.utils.ServerRequestDaoUtils$getMaxWatermark$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fit.fitness.persist.db.utils.ServerRequestDaoUtils", f = "ServerRequestDaoUtils.kt", i = {}, l = {84}, m = "getMaxWatermark", n = {}, s = {})
    public static final class C16061 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        public C16061(Continuation<? super C16061> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ServerRequestDaoUtils.this.getMaxWatermark(null, this);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fit.fitness.persist.db.utils.ServerRequestDaoUtils$insertTimePullServerRequest$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fit.fitness.persist.db.utils.ServerRequestDaoUtils", f = "ServerRequestDaoUtils.kt", i = {0, 0, 0, 0, 0, 1, 1, 1}, l = {210, 215, 216}, m = "insertTimePullServerRequest", n = {"this", "requestAction", "requestKey", "nextKey", "requestEntity", "this", "requestKey", "requestEntity"}, s = {"L$0", "L$1", "L$2", "L$3", "L$4", "L$0", "L$1", "L$2"})
    public static final class C16071 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        int label;
        /* synthetic */ Object result;

        public C16071(Continuation<? super C16071> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ServerRequestDaoUtils.this.insertTimePullServerRequest(null, null, 0L, 0L, null, this);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fit.fitness.persist.db.utils.ServerRequestDaoUtils$mergeCrossYearPullRequest$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fit.fitness.persist.db.utils.ServerRequestDaoUtils", f = "ServerRequestDaoUtils.kt", i = {0, 0, 0, 1, 1, 1, 2, 2, 2, 2, 3, 3, 3, 4, 4, 4, 4, 5, 5, 5}, l = {228, ErrorCode.ERROR_SP_NOTICE_INCOMPATIBLE, 236, 237, 241, 242}, m = "mergeCrossYearPullRequest", n = {"this", "requestKey", "curRequest", "this", "requestKey", "curRequest", "this", "requestKey", "curRequest", "request", "this", "requestKey", "curRequest", "this", "requestKey", "curRequest", "request", "this", "requestKey", "curRequest"}, s = {"L$0", "L$1", "L$2", "L$0", "L$1", "L$2", "L$0", "L$1", "L$2", "L$4", "L$0", "L$1", "L$2", "L$0", "L$1", "L$2", "L$4", "L$0", "L$1", "L$2"})
    public static final class C16081 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        int label;
        /* synthetic */ Object result;

        public C16081(Continuation<? super C16081> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ServerRequestDaoUtils.this.mergeCrossYearPullRequest(null, null, null, this);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fit.fitness.persist.db.utils.ServerRequestDaoUtils$updateMaxWatermark$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fit.fitness.persist.db.utils.ServerRequestDaoUtils", f = "ServerRequestDaoUtils.kt", i = {0, 0, 0}, l = {142, 147, 151}, m = "updateMaxWatermark", n = {"this", "requestKey", "watermark"}, s = {"L$0", "L$1", "J$0"})
    public static final class C16091 extends ContinuationImpl {
        long J$0;
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public C16091(Continuation<? super C16091> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ServerRequestDaoUtils.this.updateMaxWatermark(null, 0L, this);
        }
    }

    private ServerRequestDaoUtils() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object deleteServerRequest(ServerRequestEntity[] serverRequestEntityArr, Continuation<? super Unit> continuation) {
        Object objDelete;
        ServerRequestDao serverRequestDao = getServerRequestDao();
        return (serverRequestDao == null || (objDelete = serverRequestDao.delete((ServerRequestEntity[]) Arrays.copyOf(serverRequestEntityArr, serverRequestEntityArr.length), continuation)) != IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED()) ? Unit.INSTANCE : objDelete;
    }

    private final String genStatPersistKey(String tag, String key) {
        return "stat_" + tag + RegionManagerImpl.LOCALE_REPORTED_SERVER_SEPARATOR + key;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object getMaxWatermark(String str, Continuation<? super Long> continuation) {
        C16061 c16061;
        if (continuation instanceof C16061) {
            c16061 = (C16061) continuation;
            int i = c16061.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c16061.label = i - Integer.MIN_VALUE;
            } else {
                c16061 = new C16061(continuation);
            }
        } else {
            c16061 = new C16061(continuation);
        }
        Object theServerRequest = c16061.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c16061.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(theServerRequest);
            ServerRequestDao serverRequestDao = getServerRequestDao();
            if (serverRequestDao == null) {
                return null;
            }
            c16061.label = 1;
            theServerRequest = serverRequestDao.getTheServerRequest("incremental_pull", str, c16061);
            if (theServerRequest == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(theServerRequest);
        }
        ServerRequestEntity serverRequestEntity = (ServerRequestEntity) theServerRequest;
        if (serverRequestEntity == null) {
            return null;
        }
        return Boxing.boxLong(serverRequestEntity.getWatermark());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object getOneTimePullRequest(String str, Continuation<? super ServerRequestEntity> continuation) {
        ServerRequestDao serverRequestDao = getServerRequestDao();
        if (serverRequestDao != null) {
            return serverRequestDao.getTheServerRequest("onetime_pull", str, continuation);
        }
        return null;
    }

    private final ServerRequestDao getServerRequestDao() {
        RegionManager regionExtKt = RegionExtKt.getInstance(RegionManager.INSTANCE);
        if (regionExtKt != null && RegionExtKt.isRegionSelected(regionExtKt)) {
            return FitnessDatabase.INSTANCE.getInstance().serverRequestDao();
        }
        FitnessLogUtils.i(TAG, "serverRequestDao: region not selected");
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object insertCrossYearPullRequest(String str, long j, long j2, String str2, Continuation<? super Unit> continuation) {
        Object objInsertTimePullServerRequest = insertTimePullServerRequest("cross_year_pull", str, j, j2, str2, continuation);
        return objInsertTimePullServerRequest == IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objInsertTimePullServerRequest : Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:34:0x00d5 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x001c  */
    public final Object insertTimePullServerRequest(String str, String str2, long j, long j2, String str3, Continuation<? super Unit> continuation) {
        C16071 c16071;
        ServerRequestDaoUtils serverRequestDaoUtils;
        String str4;
        ServerRequestEntity serverRequestEntity;
        ServerRequestDaoUtils serverRequestDaoUtils2;
        String str5 = str2;
        String str6 = str3;
        if (continuation instanceof C16071) {
            c16071 = (C16071) continuation;
            int i = c16071.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c16071.label = i - Integer.MIN_VALUE;
            } else {
                c16071 = new C16071(continuation);
            }
        } else {
            c16071 = new C16071(continuation);
        }
        Object crossYearPullRequest = c16071.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c16071.label;
        if (i2 != 0) {
            if (i2 == 1) {
                serverRequestEntity = (ServerRequestEntity) c16071.L$4;
                String str7 = (String) c16071.L$3;
                String str8 = (String) c16071.L$2;
                str4 = (String) c16071.L$1;
                serverRequestDaoUtils = (ServerRequestDaoUtils) c16071.L$0;
                ResultKt.throwOnFailure(crossYearPullRequest);
                str6 = str7;
                str5 = str8;
            } else if (i2 == 2) {
                serverRequestEntity = (ServerRequestEntity) c16071.L$2;
                str5 = (String) c16071.L$1;
                serverRequestDaoUtils2 = (ServerRequestDaoUtils) c16071.L$0;
                ResultKt.throwOnFailure(crossYearPullRequest);
                c16071.L$0 = null;
                c16071.L$1 = null;
                c16071.L$2 = null;
                c16071.label = 3;
                if (serverRequestDaoUtils2.mergeCrossYearPullRequest(str5, serverRequestEntity, (List) crossYearPullRequest, c16071) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i2 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(crossYearPullRequest);
            }
            return Unit.INSTANCE;
        }
        ResultKt.throwOnFailure(crossYearPullRequest);
        ServerRequestEntity serverRequestEntity2 = new ServerRequestEntity(str, str5);
        serverRequestEntity2.setStartTime(j);
        serverRequestEntity2.setEndTime(j2);
        serverRequestEntity2.setNextKey(str6);
        ServerRequestDao serverRequestDao = getServerRequestDao();
        if (serverRequestDao != null) {
            c16071.L$0 = this;
            c16071.L$1 = str;
            c16071.L$2 = str5;
            c16071.L$3 = str6;
            c16071.L$4 = serverRequestEntity2;
            c16071.label = 1;
            if (serverRequestDao.insert(new ServerRequestEntity[]{serverRequestEntity2}, c16071) == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        serverRequestDaoUtils = this;
        str4 = str;
        serverRequestEntity = serverRequestEntity2;
        if (!TextUtils.equals(str4, "cross_year_pull") || !TextUtils.isEmpty(str6)) {
            return Unit.INSTANCE;
        }
        c16071.L$0 = serverRequestDaoUtils;
        c16071.L$1 = str5;
        c16071.L$2 = serverRequestEntity;
        c16071.L$3 = null;
        c16071.L$4 = null;
        c16071.label = 2;
        crossYearPullRequest = serverRequestDaoUtils.getCrossYearPullRequest(str5, c16071);
        if (crossYearPullRequest == coroutine_suspended) {
            return coroutine_suspended;
        }
        serverRequestDaoUtils2 = serverRequestDaoUtils;
        c16071.L$0 = null;
        c16071.L$1 = null;
        c16071.L$2 = null;
        c16071.label = 3;
        if (serverRequestDaoUtils2.mergeCrossYearPullRequest(str5, serverRequestEntity, (List) crossYearPullRequest, c16071) == coroutine_suspended) {
            return coroutine_suspended;
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:18:0x0097  */
    /* JADX WARN: Code duplicated, block: B:23:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:30:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:37:0x0112  */
    /* JADX WARN: Code duplicated, block: B:45:0x015d A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:57:0x01b9 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:61:0x00aa A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:62:0x00d8 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:67:0x0106 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:70:0x016e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:74:0x0091 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:75:0x0091 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:44:0x015b -> B:46:0x015e). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:54:0x0192 -> B:55:0x0198). Please report as a decompilation issue!!! */
    public final Object mergeCrossYearPullRequest(String str, ServerRequestEntity serverRequestEntity, List<ServerRequestEntity> list, Continuation<? super Unit> continuation) {
        C16081 c16081;
        ServerRequestDaoUtils serverRequestDaoUtils;
        Iterator<ServerRequestEntity> it;
        C16081 c16082;
        ServerRequestDaoUtils serverRequestDaoUtils2;
        String str2;
        ServerRequestEntity serverRequestEntity2;
        ServerRequestEntity serverRequestEntity3;
        ServerRequestEntity serverRequestEntity4;
        long startTime;
        long endTime;
        ServerRequestEntity next;
        ServerRequestEntity serverRequestEntity5;
        long startTime2;
        long endTime2;
        if (continuation instanceof C16081) {
            c16081 = (C16081) continuation;
            int i = c16081.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c16081.label = i - Integer.MIN_VALUE;
                serverRequestDaoUtils = this;
            } else {
                serverRequestDaoUtils = this;
                c16081 = serverRequestDaoUtils.new C16081(continuation);
            }
        } else {
            serverRequestDaoUtils = this;
            c16081 = serverRequestDaoUtils.new C16081(continuation);
        }
        Object obj = c16081.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch (c16081.label) {
            case 0:
                ResultKt.throwOnFailure(obj);
                it = list.iterator();
                c16082 = c16081;
                serverRequestDaoUtils2 = serverRequestDaoUtils;
                str2 = str;
                serverRequestEntity2 = serverRequestEntity;
                while (it.hasNext()) {
                    next = it.next();
                    if (next.getEndTime() != serverRequestEntity2.getEndTime()) {
                        if (serverRequestEntity2.getStartTime() < next.getStartTime() && serverRequestEntity2.getEndTime() < next.getEndTime()) {
                            c16082.L$0 = serverRequestDaoUtils2;
                            c16082.L$1 = str2;
                            c16082.L$2 = serverRequestEntity2;
                            c16082.L$3 = it;
                            c16082.label = 1;
                            if (serverRequestDaoUtils2.deleteServerRequest(new ServerRequestEntity[]{serverRequestEntity2}, c16082) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                        } else if (serverRequestEntity2.getStartTime() > next.getStartTime() && serverRequestEntity2.getEndTime() > next.getEndTime()) {
                            c16082.L$0 = serverRequestDaoUtils2;
                            c16082.L$1 = str2;
                            c16082.L$2 = serverRequestEntity2;
                            c16082.L$3 = it;
                            c16082.label = 2;
                            if (serverRequestDaoUtils2.deleteServerRequest(new ServerRequestEntity[]{next}, c16082) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                        } else if (serverRequestEntity2.getStartTime() > next.getEndTime() && serverRequestEntity2.getEndTime() > next.getEndTime()) {
                            c16082.L$0 = serverRequestDaoUtils2;
                            c16082.L$1 = str2;
                            c16082.L$2 = serverRequestEntity2;
                            c16082.L$3 = it;
                            c16082.L$4 = next;
                            c16082.label = 3;
                            if (serverRequestDaoUtils2.deleteServerRequest(new ServerRequestEntity[]{serverRequestEntity2, next}, c16082) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            serverRequestEntity4 = serverRequestEntity2;
                            c16081 = c16082;
                            serverRequestEntity3 = next;
                            startTime = serverRequestEntity3.getStartTime();
                            endTime = serverRequestEntity4.getEndTime();
                            c16081.L$0 = serverRequestDaoUtils2;
                            c16081.L$1 = str2;
                            c16081.L$2 = serverRequestEntity4;
                            c16081.L$3 = it;
                            c16081.L$4 = null;
                            c16081.label = 4;
                            if (serverRequestDaoUtils2.insertCrossYearPullRequest(str2, startTime, endTime, null, c16081) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            c16082 = c16081;
                            serverRequestEntity2 = serverRequestEntity4;
                            while (it.hasNext()) {
                                next = it.next();
                                if (next.getEndTime() != serverRequestEntity2.getEndTime()) {
                                    if (serverRequestEntity2.getStartTime() < next.getStartTime()) {
                                    }
                                    if (serverRequestEntity2.getStartTime() > next.getStartTime()) {
                                    }
                                    if (serverRequestEntity2.getStartTime() > next.getEndTime()) {
                                    }
                                    if (serverRequestEntity2.getStartTime() < next.getStartTime()) {
                                        continue;
                                    }
                                }
                            }
                        } else if (serverRequestEntity2.getStartTime() < next.getStartTime() && serverRequestEntity2.getEndTime() >= next.getStartTime()) {
                            c16082.L$0 = serverRequestDaoUtils2;
                            c16082.L$1 = str2;
                            c16082.L$2 = serverRequestEntity2;
                            c16082.L$3 = it;
                            c16082.L$4 = next;
                            c16082.label = 5;
                            if (serverRequestDaoUtils2.deleteServerRequest(new ServerRequestEntity[]{serverRequestEntity2, next}, c16082) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            serverRequestEntity4 = serverRequestEntity2;
                            c16081 = c16082;
                            serverRequestEntity5 = next;
                            startTime2 = serverRequestEntity4.getStartTime();
                            endTime2 = serverRequestEntity5.getEndTime();
                            c16081.L$0 = serverRequestDaoUtils2;
                            c16081.L$1 = str2;
                            c16081.L$2 = serverRequestEntity4;
                            c16081.L$3 = it;
                            c16081.L$4 = null;
                            c16081.label = 6;
                            if (serverRequestDaoUtils2.insertCrossYearPullRequest(str2, startTime2, endTime2, null, c16081) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            c16082 = c16081;
                            serverRequestEntity2 = serverRequestEntity4;
                            while (it.hasNext()) {
                                next = it.next();
                                if (next.getEndTime() != serverRequestEntity2.getEndTime()) {
                                    if (serverRequestEntity2.getStartTime() < next.getStartTime()) {
                                    }
                                    if (serverRequestEntity2.getStartTime() > next.getStartTime()) {
                                    }
                                    if (serverRequestEntity2.getStartTime() > next.getEndTime()) {
                                    }
                                    if (serverRequestEntity2.getStartTime() < next.getStartTime()) {
                                        continue;
                                    }
                                }
                            }
                        }
                    }
                }
                return Unit.INSTANCE;
            case 1:
            case 2:
            case 4:
            case 6:
                Iterator<ServerRequestEntity> it2 = (Iterator) c16081.L$3;
                ServerRequestEntity serverRequestEntity6 = (ServerRequestEntity) c16081.L$2;
                String str3 = (String) c16081.L$1;
                serverRequestDaoUtils2 = (ServerRequestDaoUtils) c16081.L$0;
                ResultKt.throwOnFailure(obj);
                str2 = str3;
                c16082 = c16081;
                serverRequestEntity2 = serverRequestEntity6;
                it = it2;
                while (it.hasNext()) {
                    next = it.next();
                    if (next.getEndTime() != serverRequestEntity2.getEndTime()) {
                        if (serverRequestEntity2.getStartTime() < next.getStartTime()) {
                        }
                        if (serverRequestEntity2.getStartTime() > next.getStartTime()) {
                        }
                        if (serverRequestEntity2.getStartTime() > next.getEndTime()) {
                        }
                        if (serverRequestEntity2.getStartTime() < next.getStartTime()) {
                            continue;
                        }
                        break;
                    }
                }
                return Unit.INSTANCE;
            case 3:
                serverRequestEntity3 = (ServerRequestEntity) c16081.L$4;
                it = (Iterator) c16081.L$3;
                serverRequestEntity4 = (ServerRequestEntity) c16081.L$2;
                String str4 = (String) c16081.L$1;
                ServerRequestDaoUtils serverRequestDaoUtils3 = (ServerRequestDaoUtils) c16081.L$0;
                ResultKt.throwOnFailure(obj);
                str2 = str4;
                serverRequestDaoUtils2 = serverRequestDaoUtils3;
                startTime = serverRequestEntity3.getStartTime();
                endTime = serverRequestEntity4.getEndTime();
                c16081.L$0 = serverRequestDaoUtils2;
                c16081.L$1 = str2;
                c16081.L$2 = serverRequestEntity4;
                c16081.L$3 = it;
                c16081.L$4 = null;
                c16081.label = 4;
                if (serverRequestDaoUtils2.insertCrossYearPullRequest(str2, startTime, endTime, null, c16081) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                c16082 = c16081;
                serverRequestEntity2 = serverRequestEntity4;
                while (it.hasNext()) {
                    next = it.next();
                    if (next.getEndTime() != serverRequestEntity2.getEndTime()) {
                        if (serverRequestEntity2.getStartTime() < next.getStartTime()) {
                        }
                        if (serverRequestEntity2.getStartTime() > next.getStartTime()) {
                        }
                        if (serverRequestEntity2.getStartTime() > next.getEndTime()) {
                        }
                        if (serverRequestEntity2.getStartTime() < next.getStartTime()) {
                            continue;
                        }
                        break;
                    }
                }
                return Unit.INSTANCE;
            case 5:
                serverRequestEntity5 = (ServerRequestEntity) c16081.L$4;
                it = (Iterator) c16081.L$3;
                serverRequestEntity4 = (ServerRequestEntity) c16081.L$2;
                String str5 = (String) c16081.L$1;
                ServerRequestDaoUtils serverRequestDaoUtils4 = (ServerRequestDaoUtils) c16081.L$0;
                ResultKt.throwOnFailure(obj);
                str2 = str5;
                serverRequestDaoUtils2 = serverRequestDaoUtils4;
                startTime2 = serverRequestEntity4.getStartTime();
                endTime2 = serverRequestEntity5.getEndTime();
                c16081.L$0 = serverRequestDaoUtils2;
                c16081.L$1 = str2;
                c16081.L$2 = serverRequestEntity4;
                c16081.L$3 = it;
                c16081.L$4 = null;
                c16081.label = 6;
                if (serverRequestDaoUtils2.insertCrossYearPullRequest(str2, startTime2, endTime2, null, c16081) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                c16082 = c16081;
                serverRequestEntity2 = serverRequestEntity4;
                while (it.hasNext()) {
                    next = it.next();
                    if (next.getEndTime() != serverRequestEntity2.getEndTime()) {
                        if (serverRequestEntity2.getStartTime() < next.getStartTime()) {
                        }
                        if (serverRequestEntity2.getStartTime() > next.getStartTime()) {
                        }
                        if (serverRequestEntity2.getStartTime() > next.getEndTime()) {
                        }
                        if (serverRequestEntity2.getStartTime() < next.getStartTime()) {
                            continue;
                        }
                        break;
                    }
                }
                return Unit.INSTANCE;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:27:0x006d  */
    /* JADX WARN: Code duplicated, block: B:29:0x007b  */
    /* JADX WARN: Code duplicated, block: B:31:0x008b A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:34:0x008f  */
    /* JADX WARN: Code duplicated, block: B:36:0x0097  */
    /* JADX WARN: Code duplicated, block: B:38:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:40:0x00b0 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object updateMaxWatermark(String str, long j, Continuation<? super Unit> continuation) {
        C16091 c16091;
        ServerRequestDaoUtils serverRequestDaoUtils;
        ServerRequestEntity serverRequestEntity;
        ServerRequestDao serverRequestDao;
        ServerRequestEntity serverRequestEntity2;
        ServerRequestDao serverRequestDao2;
        if (continuation instanceof C16091) {
            c16091 = (C16091) continuation;
            int i = c16091.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c16091.label = i - Integer.MIN_VALUE;
            } else {
                c16091 = new C16091(continuation);
            }
        } else {
            c16091 = new C16091(continuation);
        }
        Object theServerRequest = c16091.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c16091.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(theServerRequest);
            ServerRequestDao serverRequestDao3 = getServerRequestDao();
            if (serverRequestDao3 != null) {
                c16091.L$0 = this;
                c16091.L$1 = str;
                c16091.J$0 = j;
                c16091.label = 1;
                theServerRequest = serverRequestDao3.getTheServerRequest("incremental_pull", str, c16091);
                if (theServerRequest == coroutine_suspended) {
                    return coroutine_suspended;
                }
                serverRequestDaoUtils = this;
            } else {
                serverRequestDaoUtils = this;
                serverRequestEntity = null;
            }
            if (serverRequestEntity == null) {
                serverRequestEntity2 = new ServerRequestEntity("incremental_pull", str);
                serverRequestEntity2.setWatermark(j);
                serverRequestDao2 = serverRequestDaoUtils.getServerRequestDao();
                if (serverRequestDao2 != null) {
                    c16091.L$0 = null;
                    c16091.L$1 = null;
                    c16091.label = 2;
                    if (serverRequestDao2.insert(new ServerRequestEntity[]{serverRequestEntity2}, c16091) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    return Unit.INSTANCE;
                }
            } else if (j > serverRequestEntity.getWatermark()) {
                serverRequestEntity.setWatermark(j);
                serverRequestDao = serverRequestDaoUtils.getServerRequestDao();
                if (serverRequestDao != null) {
                    c16091.L$0 = null;
                    c16091.L$1 = null;
                    c16091.label = 3;
                    if (serverRequestDao.update(new ServerRequestEntity[]{serverRequestEntity}, c16091) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    return Unit.INSTANCE;
                }
            }
            return Unit.INSTANCE;
        }
        if (i2 != 1) {
            if (i2 == 2) {
                ResultKt.throwOnFailure(theServerRequest);
                return Unit.INSTANCE;
            }
            if (i2 != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(theServerRequest);
            return Unit.INSTANCE;
        }
        j = c16091.J$0;
        str = (String) c16091.L$1;
        serverRequestDaoUtils = (ServerRequestDaoUtils) c16091.L$0;
        ResultKt.throwOnFailure(theServerRequest);
        serverRequestEntity = (ServerRequestEntity) theServerRequest;
        if (serverRequestEntity == null) {
            serverRequestEntity2 = new ServerRequestEntity("incremental_pull", str);
            serverRequestEntity2.setWatermark(j);
            serverRequestDao2 = serverRequestDaoUtils.getServerRequestDao();
            if (serverRequestDao2 != null) {
                c16091.L$0 = null;
                c16091.L$1 = null;
                c16091.label = 2;
                if (serverRequestDao2.insert(new ServerRequestEntity[]{serverRequestEntity2}, c16091) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                return Unit.INSTANCE;
            }
        } else if (j > serverRequestEntity.getWatermark()) {
            serverRequestEntity.setWatermark(j);
            serverRequestDao = serverRequestDaoUtils.getServerRequestDao();
            if (serverRequestDao != null) {
                c16091.L$0 = null;
                c16091.L$1 = null;
                c16091.label = 3;
                if (serverRequestDao.update(new ServerRequestEntity[]{serverRequestEntity}, c16091) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                return Unit.INSTANCE;
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object getCrossYearPullRequest(@NotNull String str, @NotNull Continuation<? super List<ServerRequestEntity>> continuation) {
        AnonymousClass1 anonymousClass1;
        if (continuation instanceof AnonymousClass1) {
            anonymousClass1 = (AnonymousClass1) continuation;
            int i = anonymousClass1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                anonymousClass1.label = i - Integer.MIN_VALUE;
            } else {
                anonymousClass1 = new AnonymousClass1(continuation);
            }
        } else {
            anonymousClass1 = new AnonymousClass1(continuation);
        }
        Object serverRequestList = anonymousClass1.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = anonymousClass1.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(serverRequestList);
            ServerRequestDao serverRequestDao = getServerRequestDao();
            if (serverRequestDao != null) {
                anonymousClass1.label = 1;
                serverRequestList = serverRequestDao.getServerRequestList("cross_year_pull", str, anonymousClass1);
                if (serverRequestList == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            return CollectionsKt__CollectionsKt.emptyList();
        }
        if (i2 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(serverRequestList);
        List list = (List) serverRequestList;
        if (list != null) {
            return list;
        }
        return CollectionsKt__CollectionsKt.emptyList();
    }

    @Nullable
    public final Object getFitnessMaxWatermark(@NotNull Continuation<? super Long> continuation) {
        return getMaxWatermark("fitness_data", continuation);
    }

    @Nullable
    public final Object getFullPullRequest(@NotNull String str, @NotNull Continuation<? super ServerRequestEntity> continuation) {
        ServerRequestDao serverRequestDao = getServerRequestDao();
        if (serverRequestDao != null) {
            return serverRequestDao.getTheServerRequest("full_pull", str, continuation);
        }
        return null;
    }

    @Nullable
    public final Object getMedicalMaxWatermark(@NotNull Continuation<? super Long> continuation) {
        return getMaxWatermark("medical_data", continuation);
    }

    @Nullable
    public final Object getProjectMaxWatermark(@NotNull Continuation<? super Long> continuation) {
        return getMaxWatermark("project_data", continuation);
    }

    @Nullable
    public final Object getRainbowMaxWatermark(@NotNull Continuation<? super Long> continuation) {
        return getMaxWatermark("rainbow", continuation);
    }

    @Nullable
    public final Object getRainbowPullRequest(@NotNull Continuation<? super ServerRequestEntity> continuation) {
        return getOneTimePullRequest("rainbow", continuation);
    }

    @Nullable
    public final Object getRecentOneYearPullRequest(@NotNull String str, @NotNull Continuation<? super ServerRequestEntity> continuation) {
        ServerRequestDao serverRequestDao = getServerRequestDao();
        if (serverRequestDao != null) {
            return serverRequestDao.getTheServerRequest("recent_one_year_pull", str, continuation);
        }
        return null;
    }

    @Nullable
    public final Object getRedDotMaxWatermark(@NotNull Continuation<? super Long> continuation) {
        return getMaxWatermark("red_dot", continuation);
    }

    @Nullable
    public final Object getRedDotPullRequest(@NotNull Continuation<? super ServerRequestEntity> continuation) {
        return getOneTimePullRequest("red_dot", continuation);
    }

    @Nullable
    public final Object getSportMaxWatermark(@NotNull Continuation<? super Long> continuation) {
        return getMaxWatermark("sport_report", continuation);
    }

    @Nullable
    public final Object getStatDataMaxWatermark(@NotNull String str, @NotNull String str2, @NotNull Continuation<? super Long> continuation) {
        return getMaxWatermark(genStatPersistKey(str, str2), continuation);
    }

    @Nullable
    public final Object getStatDataTimeRequest(@NotNull String str, @NotNull String str2, @NotNull Continuation<? super ServerRequestEntity> continuation) {
        return getOneTimePullRequest(genStatPersistKey(str, str2), continuation);
    }

    @Nullable
    public final Object insertFitnessTimePullRequest(@NotNull String str, @NotNull String str2, long j, long j2, @Nullable String str3, @NotNull Continuation<? super Unit> continuation) {
        Object objInsertTimePullServerRequest = insertTimePullServerRequest(str, str2, j, j2, str3, continuation);
        return objInsertTimePullServerRequest == IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objInsertTimePullServerRequest : Unit.INSTANCE;
    }

    @Nullable
    public final Object insertLatestPullRequest(@NotNull String str, @NotNull Continuation<? super Unit> continuation) {
        Object objInsertTimePullServerRequest = insertTimePullServerRequest("latest_time_pull", str, 0L, 0L, null, continuation);
        return objInsertTimePullServerRequest == IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objInsertTimePullServerRequest : Unit.INSTANCE;
    }

    @Nullable
    public final Object insertProjectTimePullRequest(@NotNull String str, long j, long j2, @Nullable String str2, @NotNull Continuation<? super Unit> continuation) {
        Object objInsertTimePullServerRequest = insertTimePullServerRequest(str, "project_data", j, j2, str2, continuation);
        return objInsertTimePullServerRequest == IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objInsertTimePullServerRequest : Unit.INSTANCE;
    }

    @Nullable
    public final Object insertSportTimePullRequest(@NotNull String str, long j, long j2, @Nullable String str2, @NotNull Continuation<? super Unit> continuation) {
        Object objInsertTimePullServerRequest = insertTimePullServerRequest(str, "sport_report", j, j2, str2, continuation);
        return objInsertTimePullServerRequest == IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objInsertTimePullServerRequest : Unit.INSTANCE;
    }

    @Nullable
    public final Object updateFitnessMaxWatermark(long j, @NotNull Continuation<? super Unit> continuation) {
        Object objUpdateMaxWatermark = updateMaxWatermark("fitness_data", j, continuation);
        return objUpdateMaxWatermark == IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objUpdateMaxWatermark : Unit.INSTANCE;
    }

    @Nullable
    public final Object updateMedicalMaxWatermark(long j, @NotNull Continuation<? super Unit> continuation) {
        Object objUpdateMaxWatermark = updateMaxWatermark("medical_data", j, continuation);
        return objUpdateMaxWatermark == IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objUpdateMaxWatermark : Unit.INSTANCE;
    }

    @Nullable
    public final Object updateProjectDataTimeRequest(@NotNull String str, @Nullable String str2, @NotNull Continuation<? super Unit> continuation) {
        Object objInsertTimePullServerRequest = insertTimePullServerRequest("onetime_pull", str, 0L, 0L, str2, continuation);
        return objInsertTimePullServerRequest == IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objInsertTimePullServerRequest : Unit.INSTANCE;
    }

    @Nullable
    public final Object updateProjectMaxWatermark(long j, @NotNull Continuation<? super Unit> continuation) {
        Object objUpdateMaxWatermark = updateMaxWatermark("project_data", j, continuation);
        return objUpdateMaxWatermark == IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objUpdateMaxWatermark : Unit.INSTANCE;
    }

    @Nullable
    public final Object updateRainBowPullRequest(@Nullable String str, @NotNull Continuation<? super Unit> continuation) {
        Object objInsertTimePullServerRequest = insertTimePullServerRequest("onetime_pull", "rainbow", 0L, 0L, str, continuation);
        return objInsertTimePullServerRequest == IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objInsertTimePullServerRequest : Unit.INSTANCE;
    }

    @Nullable
    public final Object updateRainbowMaxWatermark(long j, @NotNull Continuation<? super Unit> continuation) {
        Object objUpdateMaxWatermark = updateMaxWatermark("rainbow", j, continuation);
        return objUpdateMaxWatermark == IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objUpdateMaxWatermark : Unit.INSTANCE;
    }

    @Nullable
    public final Object updateRedDotMaxWatermark(long j, @NotNull Continuation<? super Unit> continuation) {
        Object objUpdateMaxWatermark = updateMaxWatermark("red_dot", j, continuation);
        return objUpdateMaxWatermark == IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objUpdateMaxWatermark : Unit.INSTANCE;
    }

    @Nullable
    public final Object updateRedDotPullRequest(@Nullable String str, @NotNull Continuation<? super Unit> continuation) {
        Object objInsertTimePullServerRequest = insertTimePullServerRequest("onetime_pull", "red_dot", 0L, 0L, str, continuation);
        return objInsertTimePullServerRequest == IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objInsertTimePullServerRequest : Unit.INSTANCE;
    }

    @Nullable
    public final Object updateSportMaxWatermark(long j, @NotNull Continuation<? super Unit> continuation) {
        Object objUpdateMaxWatermark = updateMaxWatermark("sport_report", j, continuation);
        return objUpdateMaxWatermark == IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objUpdateMaxWatermark : Unit.INSTANCE;
    }

    @Nullable
    public final Object updateStatDataTimeRequest(@NotNull String str, @NotNull String str2, @Nullable String str3, @NotNull Continuation<? super Unit> continuation) {
        Object objInsertTimePullServerRequest = insertTimePullServerRequest("onetime_pull", genStatPersistKey(str, str2), 0L, 0L, str3, continuation);
        return objInsertTimePullServerRequest == IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objInsertTimePullServerRequest : Unit.INSTANCE;
    }

    @Nullable
    public final Object updateStatMaxWatermark(@NotNull String str, @NotNull String str2, long j, @NotNull Continuation<? super Unit> continuation) {
        Object objUpdateMaxWatermark = updateMaxWatermark(genStatPersistKey(str, str2), j, continuation);
        return objUpdateMaxWatermark == IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objUpdateMaxWatermark : Unit.INSTANCE;
    }
}
