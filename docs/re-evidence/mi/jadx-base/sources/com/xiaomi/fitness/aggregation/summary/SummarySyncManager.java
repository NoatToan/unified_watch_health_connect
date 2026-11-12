package com.xiaomi.fitness.aggregation.summary;

import android.content.Intent;
import android.os.Handler;
import android.os.Message;
import androidx.sqlite.db.SupportSQLiteDatabase;
import androidx.sqlite.db.SupportSQLiteOpenHelper;
import com.xiaomi.fit.data.common.constant.FitnessDataConstants;
import com.xiaomi.fit.data.common.log.FitnessLogUtils;
import com.xiaomi.fit.data.common.util.FitnessDateUtils;
import com.xiaomi.fit.fitness.export.api.FitnessServerSyncer;
import com.xiaomi.fit.fitness.export.api.ISummarySyncManager;
import com.xiaomi.fit.fitness.export.data.aggregation.DailyGoalReport;
import com.xiaomi.fit.fitness.export.data.annotation.HomeDataType;
import com.xiaomi.fit.fitness.export.di.FitnessDataExtKt;
import com.xiaomi.fit.fitness.export.sp.FitnessDataPreference;
import com.xiaomi.fit.fitness.persist.dailyreport.CloudDailyHelper;
import com.xiaomi.fit.fitness.persist.dailyreport.CloudRedDotHelper;
import com.xiaomi.fit.fitness.persist.dailyreport.api.PullRainbowDataApi;
import com.xiaomi.fit.fitness.persist.db.FitnessDBConstants;
import com.xiaomi.fit.fitness.persist.db.FitnessDatabase;
import com.xiaomi.fit.fitness.persist.utils.FitnessServerSyncTracker;
import com.xiaomi.fitness.account.extensions.AccountManagerExtKt;
import com.xiaomi.fitness.account.extensions.OnRegularGoalChange;
import com.xiaomi.fitness.account.extensions.UserProfileExtKt;
import com.xiaomi.fitness.account.user.UserInfoManager;
import com.xiaomi.fitness.aggregation.health.dao.RainbowDaoProxy;
import com.xiaomi.fitness.aggregation.health.updater.CommonSummaryUpdater;
import com.xiaomi.fitness.common.extensions.AnyExtKt;
import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.common.utils.TimeUtils;
import defpackage.aje;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010#\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0012\b\u0001\u0018\u0000 +2\u00020\u00012\u00020\u00022\u00020\u0003:\u0001+B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0016\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\b2\u0006\u0010\u0016\u001a\u00020\u0017J\u0010\u0010\u0018\u001a\u00020\u00142\u0006\u0010\u0019\u001a\u00020\u001aH\u0007J\u0006\u0010\u001b\u001a\u00020\u0014J\u0018\u0010\u001c\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\b2\u0006\u0010\u0019\u001a\u00020\u001aH\u0002J\u0018\u0010\u001d\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\b2\u0006\u0010\u0019\u001a\u00020\u001aH\u0002J\b\u0010\u001e\u001a\u00020\u0014H\u0002J\b\u0010\u001f\u001a\u00020\u0014H\u0002J\u000e\u0010 \u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\bJ\u0016\u0010!\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\b2\u0006\u0010\"\u001a\u00020\u0012J\u0012\u0010#\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0015\u001a\u00020\bH\u0002J\u001c\u0010$\u001a\u00020\u00142\b\u0010%\u001a\u0004\u0018\u00010\b2\b\u0010\u0019\u001a\u0004\u0018\u00010\bH\u0016J\u0010\u0010&\u001a\u00020\b2\u0006\u0010\u0019\u001a\u00020\u001aH\u0002J\u0010\u0010'\u001a\u00020\u00142\u0006\u0010(\u001a\u00020\nH\u0016J\b\u0010)\u001a\u00020\u0014H\u0016J\b\u0010*\u001a\u00020\u0014H\u0002R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00120\u0011X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006,"}, d2 = {"Lcom/xiaomi/fitness/aggregation/summary/SummarySyncManager;", "Lcom/xiaomi/fit/fitness/export/api/ISummarySyncManager;", "Lcom/xiaomi/fit/fitness/persist/dailyreport/api/PullRainbowDataApi;", "Lcom/xiaomi/fitness/account/extensions/OnRegularGoalChange;", "<init>", "()V", "databaseSet", "", "", "inited", "", "isSyncing", "userInfoMgr", "Lcom/xiaomi/fitness/account/user/UserInfoManager;", "jobHandler", "Landroid/os/Handler;", "connectorMap", "Ljava/util/LinkedHashMap;", "Lcom/xiaomi/fitness/aggregation/summary/SummaryConnector;", "initSyncTable", "", "databaseName", "db", "Landroidx/sqlite/db/SupportSQLiteDatabase;", "startUpdate", "reason", "", "cancelUpdate", "doSync", "updateForDataChanged", "updateForRainbowTargetChanged", "onSyncFinished", "addRegisterDatabase", "registerSummaryConnector", "connector", "getSummaryConnector", "doSummarySync", "action", "getReason", FitnessDBConstants.COL_IS_SLEEP_COMPLETE, "complete", "regularGoalChange", "trackPreDayRainbowReport", "Companion", "fitness-data-core_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nSummarySyncManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SummarySyncManager.kt\ncom/xiaomi/fitness/aggregation/summary/SummarySyncManager\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,272:1\n1863#2,2:273\n1863#2,2:275\n1863#2,2:277\n*S KotlinDebug\n*F\n+ 1 SummarySyncManager.kt\ncom/xiaomi/fitness/aggregation/summary/SummarySyncManager\n*L\n102#1:273,2\n144#1:275,2\n181#1:277,2\n*E\n"})
public final class SummarySyncManager implements ISummarySyncManager, PullRainbowDataApi, OnRegularGoalChange {

    @NotNull
    public static final String ACTION_SUMMARY_SYNCED = "fitness.action.SUMMARY_SYNCED";
    public static final int MSG_UPDATE = 1;
    public static final int REASON_COMMON_UPDATE = 20;
    public static final int REASON_DATA_SYNC_UPDATE = 22;
    public static final int REASON_FORCE_UPDATE = 30;
    public static final int REASON_RAINBOW_UPDATE = 23;
    public static final int REASON_USER_INFO_UPDATE = 21;

    @NotNull
    public static final String TAG_SYNC = "Summary_Sync";
    private volatile boolean inited;
    private volatile boolean isSyncing;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final SummarySyncManager instance = new SummarySyncManager();

    @NotNull
    private final Set<String> databaseSet = new LinkedHashSet();

    @NotNull
    private final UserInfoManager userInfoMgr = AccountManagerExtKt.getInstance(UserInfoManager.INSTANCE);

    @NotNull
    private final Handler jobHandler = SummaryWorker.INSTANCE.obtainWorkerHandler(new Handler.Callback() { // from class: com.xiaomi.fitness.aggregation.summary.SummarySyncManager$jobHandler$1
        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message msg) {
            Intrinsics.checkNotNullParameter(msg, "msg");
            if (this.this$0.isSyncing) {
                return true;
            }
            if (msg.what != 1) {
                return false;
            }
            this.this$0.isSyncing = true;
            Object obj = msg.obj;
            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.String");
            this.this$0.doSync((String) obj, msg.arg1);
            this.this$0.isSyncing = false;
            return true;
        }
    });

    @NotNull
    private final LinkedHashMap<String, SummaryConnector> connectorMap = new LinkedHashMap<>();

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u0011\u0010\u000e\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lcom/xiaomi/fitness/aggregation/summary/SummarySyncManager$Companion;", "", "<init>", "()V", "TAG_SYNC", "", "MSG_UPDATE", "", "REASON_COMMON_UPDATE", "REASON_USER_INFO_UPDATE", "REASON_DATA_SYNC_UPDATE", "REASON_RAINBOW_UPDATE", "REASON_FORCE_UPDATE", "ACTION_SUMMARY_SYNCED", "instance", "Lcom/xiaomi/fitness/aggregation/summary/SummarySyncManager;", "getInstance", "()Lcom/xiaomi/fitness/aggregation/summary/SummarySyncManager;", "fitness-data-core_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final SummarySyncManager getInstance() {
            return SummarySyncManager.instance;
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.aggregation.summary.SummarySyncManager$startUpdate$2, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.aggregation.summary.SummarySyncManager$startUpdate$2", f = "SummarySyncManager.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ int $reason;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(int i, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.$reason = i;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return SummarySyncManager.this.new AnonymousClass2(this.$reason, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            SummarySyncManager.this.inited = true;
            FitnessDatabase.INSTANCE.getInstance().sleepSegmentDao();
            SummarySyncManager.this.startUpdate(this.$reason);
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void doSync(String databaseName, int reason) {
        if (reason == 21) {
            updateForRainbowTargetChanged();
        } else {
            updateForDataChanged(databaseName, reason);
        }
    }

    private final String getReason(int reason) {
        if (reason == 30) {
            return "Force Update";
        }
        switch (reason) {
            case 20:
                return "Common Update";
            case 21:
                return "UserInfo Update";
            case 22:
                return "Data Synced";
            case 23:
                return "Rainbow Update";
            default:
                return "Unknown";
        }
    }

    private final SummaryConnector getSummaryConnector(String databaseName) {
        return this.connectorMap.get(databaseName);
    }

    private final void onSyncFinished() {
        FitnessLogUtils.e(TAG_SYNC, "fitness DailyView,RedDot,Rainbow sync finished, start upload");
        CloudRedDotHelper.INSTANCE.pushRedDotUpCloud();
        FitnessDataExtKt.getInstance(FitnessServerSyncer.INSTANCE).pullAndPushRainbowData();
        CloudDailyHelper.INSTANCE.fitnessDailyDataUpCloud();
        ApplicationExtKt.getApplication();
        aje.b(ApplicationExtKt.getApplication()).d(new Intent("fitness.action.SUMMARY_SYNCED"));
        trackPreDayRainbowReport();
    }

    private final void trackPreDayRainbowReport() {
        DailyGoalReport dailyGoalReportQueryDailyGoalReport$default;
        Calendar calendar = Calendar.getInstance();
        calendar.add(5, -1);
        TimeUtils.setToZeroOClock(calendar);
        long timeInMillis = (calendar.getTimeInMillis() / ((long) 1000)) + ((long) FitnessDateUtils.getCurrentTZOffsetInSec());
        FitnessDataPreference fitnessDataPreference = FitnessDataPreference.INSTANCE;
        if (fitnessDataPreference.getLAST_RAINBOW_TRACK_TIME() == timeInMillis || (dailyGoalReportQueryDailyGoalReport$default = RainbowDaoProxy.queryDailyGoalReport$default(RainbowDaoProxy.INSTANCE, timeInMillis, false, 2, null)) == null) {
            return;
        }
        FitnessLogUtils.i(TAG_SYNC, "add rainbow track(" + timeInMillis + ")");
        FitnessServerSyncTracker.INSTANCE.getInstance().trackDailyRainbowReport(dailyGoalReportQueryDailyGoalReport$default);
        fitnessDataPreference.setLAST_RAINBOW_TRACK_TIME(timeInMillis);
    }

    private final void updateForDataChanged(String databaseName, int reason) {
        SummaryConnector summaryConnector = getSummaryConnector(databaseName);
        if (summaryConnector == null) {
            FitnessLogUtils.e(TAG_SYNC, "updateForDataChanged, empty connector");
            return;
        }
        List<TableMapping> validateTableMapper = summaryConnector.getValidateTableMapper();
        if (validateTableMapper.isEmpty()) {
            FitnessLogUtils.e(TAG_SYNC, "no table to sync summary");
        }
        SupportSQLiteOpenHelper databaseOpenHelper = summaryConnector.getDatabaseOpenHelper();
        for (TableMapping tableMapping : validateTableMapper) {
            String tableName = tableMapping.getTableName();
            if (Intrinsics.areEqual(tableName, FitnessDBConstants.TABLE_BP_MEDICAL_TABLE)) {
                FitnessLogUtils.i(TAG_SYNC, "not support (" + tableName + ")");
            } else {
                FitnessLogUtils.i(TAG_SYNC, ">>>> start doSync table " + tableName + ", reason:" + getReason(reason));
                boolean z = false;
                do {
                    SummaryDraftTable summaryDraftTable = SummaryDraftTable.INSTANCE;
                    Pair<List<Long>, List<Long>> pairQueryTimeList = summaryDraftTable.queryTimeList(databaseOpenHelper, tableMapping);
                    List<Long> first = pairQueryTimeList.getFirst();
                    List<Long> list = first;
                    if (list == null || list.isEmpty()) {
                        z = true;
                    }
                    FitnessLogUtils.i(TAG_SYNC, tableName + ": sync update count=" + first.size());
                    CommonSummaryUpdater.INSTANCE.getInstance().doUpdate(tableMapping.getDataType(), first);
                    summaryDraftTable.deleteOnID(databaseOpenHelper, tableMapping, pairQueryTimeList.getSecond());
                } while (!z);
                FitnessLogUtils.i(TAG_SYNC, "<<<< finished doSync table " + tableName);
            }
        }
        onSyncFinished();
    }

    private final void updateForRainbowTargetChanged() {
        FitnessLogUtils.i(TAG_SYNC, "updateForRainbowTargetChanged");
        long jChangeToDestZeroTimeOneDay = FitnessDateUtils.changeToDestZeroTimeOneDay(System.currentTimeMillis() / ((long) 1000), FitnessDateUtils.getCurrentTZOffsetInSec(), 0);
        ArrayList arrayList = new ArrayList();
        arrayList.add(Long.valueOf(jChangeToDestZeroTimeOneDay));
        Iterator<T> it = UserProfileExtKt.getRainbowItemTypes(this.userInfoMgr.getUserProfile(false)).iterator();
        while (it.hasNext()) {
            int iIntValue = ((Number) it.next()).intValue();
            if (iIntValue == 3) {
                FitnessLogUtils.i(TAG_SYNC, "rainbow-stand target changed");
                CommonSummaryUpdater.INSTANCE.getInstance().doUpdate(HomeDataType.VALID_STAND, arrayList);
            } else if (iIntValue == 4) {
                FitnessLogUtils.i(TAG_SYNC, "rainbow-strength target changed");
                CommonSummaryUpdater.INSTANCE.getInstance().doUpdate(HomeDataType.MH_STRENGTH, arrayList);
            }
        }
    }

    public final void addRegisterDatabase(@NotNull String databaseName) {
        Intrinsics.checkNotNullParameter(databaseName, "databaseName");
        this.databaseSet.add(databaseName);
    }

    public final void cancelUpdate() {
        SummaryWorker.INSTANCE.stopWorker();
    }

    @Override // com.xiaomi.fit.fitness.export.api.ISummarySyncManager
    public void doSummarySync(@Nullable String action, @Nullable String reason) {
        FitnessLogUtils.e(TAG_SYNC, ">>> start update summary, action: " + action + ", reason: " + reason);
        if (Intrinsics.areEqual(action, "recent_data_changed_broadcast") || Intrinsics.areEqual(action, FitnessDataConstants.BROADCAST_ACTION_HISTORY_FITNESS_DATA_CHANGED)) {
            startUpdate(20);
            return;
        }
        FitnessLogUtils.e(TAG_SYNC, "doSummarySync: unknown action:" + action);
    }

    public final void initSyncTable(@NotNull String databaseName, @NotNull SupportSQLiteDatabase db) {
        Intrinsics.checkNotNullParameter(databaseName, "databaseName");
        Intrinsics.checkNotNullParameter(db, "db");
        SummaryConnector summaryConnector = getSummaryConnector(databaseName);
        if (summaryConnector != null) {
            summaryConnector.initSummaryConnector(db);
        }
    }

    @Override // com.xiaomi.fit.fitness.persist.dailyreport.api.PullRainbowDataApi
    public void isComplete(boolean complete) {
        FitnessLogUtils.i(TAG_SYNC, ">>> Rainbow download finished, do Rainbow Sync");
    }

    public final void registerSummaryConnector(@NotNull String databaseName, @NotNull SummaryConnector connector) {
        Intrinsics.checkNotNullParameter(databaseName, "databaseName");
        Intrinsics.checkNotNullParameter(connector, "connector");
        this.connectorMap.put(databaseName, connector);
    }

    @Override // com.xiaomi.fitness.account.extensions.OnRegularGoalChange
    public void regularGoalChange() {
        FitnessLogUtils.w(TAG_SYNC, "regularGoalChange: user goal changed, do rainbow summary sync");
        startUpdate(21);
    }

    public final void startUpdate(int reason) {
        if (!(!this.databaseSet.isEmpty())) {
            FitnessLogUtils.e(TAG_SYNC, "no database to update");
            if (this.inited) {
                return;
            }
            AnyExtKt.io$default(null, new AnonymousClass2(reason, null), 1, null);
            return;
        }
        for (String str : this.databaseSet) {
            Message messageObtain = Message.obtain();
            messageObtain.what = 1;
            messageObtain.arg1 = reason;
            messageObtain.obj = str;
            this.jobHandler.removeMessages(1, str);
            this.jobHandler.sendMessage(messageObtain);
            FitnessLogUtils.i(TAG_SYNC, "update database " + str);
        }
    }
}
