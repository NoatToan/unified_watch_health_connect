package com.xiaomi.fit.fitness.remote;

import android.os.RemoteException;
import com.xiaomi.fit.fitness.DailyRecordItemModel;
import com.xiaomi.fit.fitness.DataExtKt;
import com.xiaomi.fit.fitness.FitnessDBKey;
import com.xiaomi.fit.fitness.SportDBKey;
import com.xiaomi.fit.fitness.a;
import com.xiaomi.fit.fitness.b;
import com.xiaomi.fit.fitness.c;
import com.xiaomi.fit.fitness.persist.dailyreport.CloudRainbowHelper;
import com.xiaomi.fit.fitness.persist.dailyreport.CloudRedDotHelper;
import com.xiaomi.fit.fitness.persist.db.utils.DailyRecordDaoUtils;
import com.xiaomi.fit.fitness.persist.db.utils.SportReportDaoUtils;
import com.xiaomi.fit.fitness.persist.db.utils.TrainingPlanCurDateDaoUtils;
import com.xiaomi.fit.fitness.persist.db.utils.TrainingPlanWeekDaoUtils;
import com.xiaomi.fit.fitness.remote.FitnessDataRemoteImpl;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.net.extensions.ScopeExtKt;
import com.xiaomi.fitness.repo.healthconnect.HealthConnectDataSyncedReceiver;
import com.xiaomi.fitness.repo.healthconnect.biz.HealthConnectPreference;
import com.xiaomi.fitness.repo.healthconnect.utils.HealthConnectDBTriggerUtils;
import com.xiaomi.fitness.watch.face.edit.entity.DialWidgetType;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0002\b\n\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 N2\u00020\u0001:\u0001NB\t\b\u0007¢\u0006\u0004\bM\u0010\u0015J)\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\u000e\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ/\u0010\u0012\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000b2\u000e\u0010\u0011\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00040\u0010H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0016\u0010\u0015J\u0017\u0010\u0017\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J-\u0010\u001e\u001a\u00020\u00022\u0006\u0010\u0019\u001a\u00020\u00042\u0006\u0010\u001a\u001a\u00020\u00042\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001bH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u001f\u0010#\u001a\u00020\u00022\u0006\u0010!\u001a\u00020 2\u0006\u0010\"\u001a\u00020\u0004H\u0016¢\u0006\u0004\b#\u0010$J%\u0010'\u001a\u00020\u00022\u0006\u0010\u0019\u001a\u00020\u00042\f\u0010&\u001a\b\u0012\u0004\u0012\u00020%0\u001bH\u0016¢\u0006\u0004\b'\u0010(J\u001d\u0010*\u001a\u00020\u00022\f\u0010)\u001a\b\u0012\u0004\u0012\u00020 0\u001bH\u0016¢\u0006\u0004\b*\u0010+J)\u0010/\u001a\u00020\b2\u0006\u0010,\u001a\u00020\u000b2\u0006\u0010.\u001a\u00020-2\b\u0010\"\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b/\u00100J\u000f\u00101\u001a\u00020\bH\u0016¢\u0006\u0004\b1\u0010\u0015J\u0019\u00103\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u000102H\u0016¢\u0006\u0004\b3\u00104J'\u00108\u001a\u00020\b2\u0006\u00105\u001a\u00020\u000b2\u0006\u00106\u001a\u00020-2\u0006\u00107\u001a\u00020\u0004H\u0016¢\u0006\u0004\b8\u00100J\u0019\u00109\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u000102H\u0016¢\u0006\u0004\b9\u00104J1\u0010<\u001a\u00020\b2\u0006\u00106\u001a\u00020-2\u0006\u00105\u001a\u00020\u000b2\u0006\u0010:\u001a\u00020\u000b2\b\u0010;\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b<\u0010=J\u0017\u0010>\u001a\u00020\b2\u0006\u00105\u001a\u00020\u000bH\u0016¢\u0006\u0004\b>\u0010?J\u000f\u0010@\u001a\u00020\bH\u0016¢\u0006\u0004\b@\u0010\u0015J\u000f\u0010A\u001a\u00020\bH\u0016¢\u0006\u0004\bA\u0010\u0015R\u001b\u0010G\u001a\u00020B8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bC\u0010D\u001a\u0004\bE\u0010FR\u001b\u0010L\u001a\u00020H8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bI\u0010D\u001a\u0004\bJ\u0010K¨\u0006O"}, d2 = {"Lcom/xiaomi/fit/fitness/remote/FitnessDataRemoteImpl;", "Lcom/xiaomi/fit/fitness/a$a;", "", "forceSync", "", "triggerSource", "Lcom/xiaomi/fit/fitness/b;", "callback", "", "syncWithServer", "(ZLjava/lang/String;Lcom/xiaomi/fit/fitness/b;)V", "", "startTime", "endTime", "pullSportServerData", "(JJ)V", "", "keys", "pullFitnessServerData", "(JJ[Ljava/lang/String;)V", "pullAndPushRainbowData", "()V", "pullRedDotData", "syncMedicalDataWithServer", "(Ljava/lang/String;)V", "persistKey", "sid", "", "Lcom/xiaomi/fit/fitness/DailyRecordItemModel;", "recordList", "recordDailyRecordToDB", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)Z", "Lcom/xiaomi/fit/fitness/SportDBKey;", "sportKey", "value", "recordSportReportToDB", "(Lcom/xiaomi/fit/fitness/SportDBKey;Ljava/lang/String;)Z", "Lcom/xiaomi/fit/fitness/FitnessDBKey;", "dataList", "deleteDailyRecord", "(Ljava/lang/String;Ljava/util/List;)Z", "sportList", "deleteSportReport", "(Ljava/util/List;)Z", "time", "", "playerId", "insertSwitchSongRecord", "(JILjava/lang/String;)V", "syncSwitchSongRecordWithServer", "Lcom/xiaomi/fit/fitness/c;", "getCurWeekPlan", "(Lcom/xiaomi/fit/fitness/c;)V", "planId", "type", "weekPlan", "updateWeekPlan", "getLocalCurDatePlanInfo", DialWidgetType.DATE, "planInfo", "syncCurDatePlanInfo", "(IJJLjava/lang/String;)V", "deleteCurDataByPlanId", "(J)V", "startSyncDataToHealthConnect", "disconnectHealthConnect", "Lcom/xiaomi/fit/fitness/remote/FitnessServerIncSync;", "incSyncManager$delegate", "Lkotlin/Lazy;", "getIncSyncManager", "()Lcom/xiaomi/fit/fitness/remote/FitnessServerIncSync;", "incSyncManager", "Lcom/xiaomi/fit/fitness/remote/FitnessServerHistorySync;", "historySyncManager$delegate", "getHistorySyncManager", "()Lcom/xiaomi/fit/fitness/remote/FitnessServerHistorySync;", "historySyncManager", "<init>", "Companion", "fitness-data-core_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class FitnessDataRemoteImpl extends a.AbstractBinderC0362a {

    @NotNull
    public static final String BINDER_NAME = "mRemoteSyncMgr";
    public static final int KEY_FITNESS_DB_DATA_BINDER = 12;

    /* JADX INFO: renamed from: incSyncManager$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy incSyncManager = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: zp9
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return FitnessDataRemoteImpl.incSyncManager_delegate$lambda$0();
        }
    });

    /* JADX INFO: renamed from: historySyncManager$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy historySyncManager = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: aq9
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return FitnessDataRemoteImpl.historySyncManager_delegate$lambda$1();
        }
    });

    /* JADX INFO: renamed from: com.xiaomi.fit.fitness.remote.FitnessDataRemoteImpl$deleteCurDataByPlanId$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fit.fitness.remote.FitnessDataRemoteImpl$deleteCurDataByPlanId$1", f = "FitnessDataRemoteImpl.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ long $planId;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(long j, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$planId = j;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.$planId, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            TrainingPlanCurDateDaoUtils.INSTANCE.deleteInfoByPlanId(this.$planId);
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fit.fitness.remote.FitnessDataRemoteImpl$getCurWeekPlan$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fit.fitness.remote.FitnessDataRemoteImpl$getCurWeekPlan$1", f = "FitnessDataRemoteImpl.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class C16991 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ c $callback;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C16991(c cVar, Continuation<? super C16991> continuation) {
            super(2, continuation);
            this.$callback = cVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C16991(this.$callback, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws RemoteException {
            String second;
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            Pair<Integer, String> curWeekPlan = TrainingPlanWeekDaoUtils.INSTANCE.getCurWeekPlan();
            c cVar = this.$callback;
            if (cVar != null) {
                int iIntValue = curWeekPlan != null ? curWeekPlan.getFirst().intValue() : 0;
                if (curWeekPlan == null || (second = curWeekPlan.getSecond()) == null) {
                    second = "";
                }
                cVar.onResult(iIntValue, second);
            }
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C16991) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fit.fitness.remote.FitnessDataRemoteImpl$getLocalCurDatePlanInfo$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fit.fitness.remote.FitnessDataRemoteImpl$getLocalCurDatePlanInfo$1", f = "FitnessDataRemoteImpl.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class C17001 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ c $callback;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C17001(c cVar, Continuation<? super C17001> continuation) {
            super(2, continuation);
            this.$callback = cVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C17001(this.$callback, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws RemoteException {
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            Pair<Integer, String> localCurDatePlanInfo = TrainingPlanCurDateDaoUtils.INSTANCE.getLocalCurDatePlanInfo();
            c cVar = this.$callback;
            if (cVar != null) {
                cVar.onResult(localCurDatePlanInfo.getFirst().intValue(), localCurDatePlanInfo.getSecond());
            }
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C17001) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fit.fitness.remote.FitnessDataRemoteImpl$startSyncDataToHealthConnect$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fit.fitness.remote.FitnessDataRemoteImpl$startSyncDataToHealthConnect$1", f = "FitnessDataRemoteImpl.kt", i = {}, l = {121}, m = "invokeSuspend", n = {}, s = {})
    public static final class C17011 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        public C17011(Continuation<? super C17011> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C17011(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            try {
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    HealthConnectDBTriggerUtils healthConnectDBTriggerUtils = HealthConnectDBTriggerUtils.INSTANCE;
                    this.label = 1;
                    if (healthConnectDBTriggerUtils.updateTriggersIfNeeded(this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                HealthConnectDataSyncedReceiver.INSTANCE.register();
                Logger.i(DataExtKt.TAG, "startSyncDataToHealthConnect:" + HealthConnectPreference.INSTANCE.getKEY_LAST_START_SYNC_TIME());
            } catch (Exception e) {
                Logger.e(DataExtKt.TAG, "startSyncDataToHealthConnect exception:" + e.getMessage(), e);
            }
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C17011) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fit.fitness.remote.FitnessDataRemoteImpl$syncCurDatePlanInfo$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fit.fitness.remote.FitnessDataRemoteImpl$syncCurDatePlanInfo$1", f = "FitnessDataRemoteImpl.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class C17021 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ long $date;
        final /* synthetic */ long $planId;
        final /* synthetic */ String $planInfo;
        final /* synthetic */ int $type;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C17021(int i, long j, long j2, String str, Continuation<? super C17021> continuation) {
            super(2, continuation);
            this.$type = i;
            this.$planId = j;
            this.$date = j2;
            this.$planInfo = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C17021(this.$type, this.$planId, this.$date, this.$planInfo, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            TrainingPlanCurDateDaoUtils.INSTANCE.syncCurDatePlanInfo(this.$type, this.$planId, this.$date, this.$planInfo);
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C17021) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fit.fitness.remote.FitnessDataRemoteImpl$updateWeekPlan$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fit.fitness.remote.FitnessDataRemoteImpl$updateWeekPlan$1", f = "FitnessDataRemoteImpl.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class C17031 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ long $planId;
        final /* synthetic */ int $type;
        final /* synthetic */ String $weekPlan;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C17031(long j, int i, String str, Continuation<? super C17031> continuation) {
            super(2, continuation);
            this.$planId = j;
            this.$type = i;
            this.$weekPlan = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C17031(this.$planId, this.$type, this.$weekPlan, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            TrainingPlanWeekDaoUtils.INSTANCE.updateWeekPlan(this.$planId, this.$type, this.$weekPlan);
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C17031) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    private final FitnessServerHistorySync getHistorySyncManager() {
        return (FitnessServerHistorySync) this.historySyncManager.getValue();
    }

    private final FitnessServerIncSync getIncSyncManager() {
        return (FitnessServerIncSync) this.incSyncManager.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final FitnessServerHistorySync historySyncManager_delegate$lambda$1() {
        return FitnessServerHistorySync.INSTANCE.getInstance();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final FitnessServerIncSync incSyncManager_delegate$lambda$0() {
        return FitnessServerIncSync.INSTANCE.getInstance();
    }

    @Override // com.xiaomi.fit.fitness.a
    public void deleteCurDataByPlanId(long planId) {
        ScopeExtKt.scope(Dispatchers.getIO(), new AnonymousClass1(planId, null));
    }

    @Override // com.xiaomi.fit.fitness.a
    public boolean deleteDailyRecord(@NotNull String persistKey, @NotNull List<FitnessDBKey> dataList) {
        Intrinsics.checkNotNullParameter(persistKey, "persistKey");
        Intrinsics.checkNotNullParameter(dataList, "dataList");
        return DailyRecordDaoUtils.INSTANCE.softDeleteDailyRecord(persistKey, dataList);
    }

    @Override // com.xiaomi.fit.fitness.a
    public boolean deleteSportReport(@NotNull List<SportDBKey> sportList) {
        Intrinsics.checkNotNullParameter(sportList, "sportList");
        return SportReportDaoUtils.INSTANCE.softDeleteSportReport(sportList);
    }

    @Override // com.xiaomi.fit.fitness.a
    public void disconnectHealthConnect() {
        try {
            HealthConnectPreference.INSTANCE.setKEY_LAST_START_SYNC_TIME(0L);
            HealthConnectDBTriggerUtils.INSTANCE.removeTriggers();
            HealthConnectDataSyncedReceiver.INSTANCE.unregister();
        } catch (Exception e) {
            Logger.e(DataExtKt.TAG, "disconnectHealthConnect exception:" + e.getMessage(), e);
        }
    }

    @Override // com.xiaomi.fit.fitness.a
    public void getCurWeekPlan(@Nullable c callback) {
        ScopeExtKt.scope(Dispatchers.getIO(), new C16991(callback, null));
    }

    @Override // com.xiaomi.fit.fitness.a
    public void getLocalCurDatePlanInfo(@Nullable c callback) {
        ScopeExtKt.scope(Dispatchers.getIO(), new C17001(callback, null));
    }

    @Override // com.xiaomi.fit.fitness.a
    public void insertSwitchSongRecord(long time, int playerId, @Nullable String value) {
        getIncSyncManager().insertSwitchSongRecord(time, playerId, value);
    }

    @Override // com.xiaomi.fit.fitness.a
    public void pullAndPushRainbowData() {
        CloudRainbowHelper.INSTANCE.pullAndPushRainbowData();
    }

    @Override // com.xiaomi.fit.fitness.a
    public void pullFitnessServerData(long startTime, long endTime, @NotNull String[] keys) {
        Intrinsics.checkNotNullParameter(keys, "keys");
        getHistorySyncManager().pullFitnessData(startTime, endTime, ArraysKt___ArraysKt.toList(keys));
    }

    @Override // com.xiaomi.fit.fitness.a
    public void pullRedDotData() {
        CloudRedDotHelper.INSTANCE.pullRedDotData();
    }

    @Override // com.xiaomi.fit.fitness.a
    public void pullSportServerData(long startTime, long endTime) {
        getHistorySyncManager().pullSportReport(startTime, endTime);
    }

    @Override // com.xiaomi.fit.fitness.a
    public boolean recordDailyRecordToDB(@NotNull String persistKey, @NotNull String sid, @NotNull List<DailyRecordItemModel> recordList) {
        Intrinsics.checkNotNullParameter(persistKey, "persistKey");
        Intrinsics.checkNotNullParameter(sid, "sid");
        Intrinsics.checkNotNullParameter(recordList, "recordList");
        return DailyRecordDaoUtils.INSTANCE.recordDailyRecordToDB(persistKey, sid, recordList);
    }

    @Override // com.xiaomi.fit.fitness.a
    public boolean recordSportReportToDB(@NotNull SportDBKey sportKey, @NotNull String value) {
        Intrinsics.checkNotNullParameter(sportKey, "sportKey");
        Intrinsics.checkNotNullParameter(value, "value");
        return SportReportDaoUtils.INSTANCE.recordSportReportToDB(sportKey, value);
    }

    @Override // com.xiaomi.fit.fitness.a
    public void startSyncDataToHealthConnect() {
        ScopeExtKt.scope(Dispatchers.getIO(), new C17011(null));
    }

    @Override // com.xiaomi.fit.fitness.a
    public void syncCurDatePlanInfo(int type, long planId, long date, @Nullable String planInfo) {
        ScopeExtKt.scope(Dispatchers.getIO(), new C17021(type, planId, date, planInfo, null));
    }

    @Override // com.xiaomi.fit.fitness.a
    public void syncMedicalDataWithServer(@NotNull String triggerSource) {
        Intrinsics.checkNotNullParameter(triggerSource, "triggerSource");
        getIncSyncManager().syncMedicalDataWithServer(triggerSource);
    }

    @Override // com.xiaomi.fit.fitness.a
    public void syncSwitchSongRecordWithServer() {
        getIncSyncManager().syncSwitchSongRecordWithServer();
    }

    @Override // com.xiaomi.fit.fitness.a
    public void syncWithServer(boolean forceSync, @NotNull String triggerSource, @Nullable b callback) {
        Intrinsics.checkNotNullParameter(triggerSource, "triggerSource");
        getIncSyncManager().triggerSyncWithServer(forceSync, triggerSource, callback);
        getHistorySyncManager().pullRecentLeastOneYearData();
    }

    @Override // com.xiaomi.fit.fitness.a
    public void updateWeekPlan(long planId, int type, @NotNull String weekPlan) {
        Intrinsics.checkNotNullParameter(weekPlan, "weekPlan");
        ScopeExtKt.scope(Dispatchers.getIO(), new C17031(planId, type, weekPlan, null));
    }
}
