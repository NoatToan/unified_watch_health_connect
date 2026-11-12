package com.xiaomi.fitness.repo.curse;

import android.app.Application;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.os.Build;
import androidx.sqlite.db.SupportSQLiteDatabase;
import com.facebook.react.bridge.BaseJavaModule;
import com.mibi.sdk.component.Constants;
import com.xiaomi.fit.data.common.constant.FitnessDataConstants;
import com.xiaomi.fit.fitness.export.api.CurseApiKt;
import com.xiaomi.fit.fitness.export.api.FitnessDataRecorder;
import com.xiaomi.fit.fitness.export.data.aggregation.CurseRecordKt;
import com.xiaomi.fit.fitness.export.data.aggregation.Record;
import com.xiaomi.fit.fitness.export.data.item.DailyRecordItem;
import com.xiaomi.fit.fitness.export.data.item.WomenHealthStatus;
import com.xiaomi.fit.fitness.export.data.item.WomenHealthSymptoms;
import com.xiaomi.fit.fitness.export.di.FitnessDataExtKt;
import com.xiaomi.fit.fitness.parser.schema.EcgReportKey;
import com.xiaomi.fit.fitness.persist.db.FitnessDatabase;
import com.xiaomi.fit.fitness.persist.db.internal.CurseObserver;
import com.xiaomi.fit.fitness.persist.db.internal.CurseObserverDao;
import com.xiaomi.fit.fitness.persist.db.utils.DailyRecordDaoUtils;
import com.xiaomi.fitness.account.extensions.AccountManagerExtKt;
import com.xiaomi.fitness.account.manager.AccountManager;
import com.xiaomi.fitness.aggregation.health.entity.CurseRecordDao;
import com.xiaomi.fitness.aggregation.health.entity.CurseRecordEntity;
import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.AppUtil;
import com.xiaomi.fitness.common.utils.FileUtils;
import com.xiaomi.fitness.net.extensions.ScopeExtKt;
import com.xiaomi.fitness.repo.curse.CurseRepo;
import com.xiaomi.fitness.settingitem.DeviceSettingManager;
import com.xiaomi.fitness.settingitem.settingitem.CurseSetting;
import com.xiaomi.smarthome.framework.api.UserConfig;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.flow.Flow;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u008c\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 N2\u00020\u0001:\u0001NB\u0011\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000e\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0019J\u0006\u0010\u001a\u001a\u00020\u0017J\u0010\u0010\u001d\u001a\u00020\u00172\b\b\u0002\u0010\u001e\u001a\u00020\u001cJ\u001a\u0010!\u001a\u00020\u00172\u0012\u0010\"\u001a\u000e\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u00170#J\u001c\u0010$\u001a\b\u0012\u0004\u0012\u00020&0%2\u0006\u0010'\u001a\u00020(2\u0006\u0010)\u001a\u00020(J\u001c\u0010*\u001a\b\u0012\u0004\u0012\u00020&0%2\u0006\u0010+\u001a\u00020,2\u0006\u0010-\u001a\u00020(J\u001c\u0010.\u001a\b\u0012\u0004\u0012\u00020&0%2\u0006\u0010+\u001a\u00020,2\u0006\u0010-\u001a\u00020(J\u001c\u0010/\u001a\b\u0012\u0004\u0012\u00020&0%2\u0006\u0010+\u001a\u00020,2\u0006\u00100\u001a\u00020,J\u0010\u00101\u001a\u0004\u0018\u00010&2\u0006\u00102\u001a\u00020,J\u0010\u00103\u001a\u0004\u0018\u00010&2\u0006\u00102\u001a\u00020,J\u000e\u00104\u001a\u00020\u001c2\u0006\u00105\u001a\u00020&J\u000e\u00106\u001a\u00020\u001c2\u0006\u00105\u001a\u00020&J$\u00107\u001a\u00020\u001c2\u0006\u00108\u001a\u00020&2\u0006\u00109\u001a\u00020&2\f\u0010:\u001a\b\u0012\u0004\u0012\u00020,0%J\u0016\u0010;\u001a\u00020\u00172\f\u0010<\u001a\b\u0012\u0004\u0012\u00020,0%H\u0002J\u0016\u0010=\u001a\u00020\u00172\f\u0010<\u001a\b\u0012\u0004\u0012\u00020,0%H\u0002JT\u0010>\u001a\u00020\u001c2\f\u0010?\u001a\b\u0012\u0004\u0012\u00020&0%2\f\u0010@\u001a\b\u0012\u0004\u0012\u00020&0%2\f\u0010A\u001a\b\u0012\u0004\u0012\u00020&0%2\u0014\u0010B\u001a\u0010\u0012\u0004\u0012\u00020&\u0012\u0004\u0012\u00020&\u0018\u00010C2\f\u0010:\u001a\b\u0012\u0004\u0012\u00020,0%J\u000e\u0010D\u001a\u00020\u001c2\u0006\u0010E\u001a\u00020FJ\u0010\u0010G\u001a\u0004\u0018\u00010F2\u0006\u00102\u001a\u00020,J\u001c\u0010G\u001a\b\u0012\u0004\u0012\u00020F0%2\u0006\u0010+\u001a\u00020,2\u0006\u00100\u001a\u00020,J\f\u0010H\u001a\b\u0012\u0004\u0012\u00020(0IJ\u001c\u0010J\u001a\b\u0012\u0004\u0012\u00020K0%2\u0006\u0010L\u001a\u00020,2\u0006\u0010M\u001a\u00020,R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u001b\u0010\u0006\u001a\u00020\u00078BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\b\u0010\tR\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\u00020\u000f8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u00138BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015R\u000e\u0010\u001b\u001a\u00020\u001cX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u001f\u001a\u0004\u0018\u00010 X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006O"}, d2 = {"Lcom/xiaomi/fitness/repo/curse/CurseRepo;", "", "aggregation", "Lcom/xiaomi/fitness/repo/curse/CurseAggregation;", "<init>", "(Lcom/xiaomi/fitness/repo/curse/CurseAggregation;)V", "oriRecordDao", "Lcom/xiaomi/fit/fitness/export/api/FitnessDataRecorder;", "getOriRecordDao", "()Lcom/xiaomi/fit/fitness/export/api/FitnessDataRecorder;", "oriRecordDao$delegate", "Lkotlin/Lazy;", "settingManager", "Lcom/xiaomi/fitness/settingitem/DeviceSettingManager;", "observerDao", "Lcom/xiaomi/fit/fitness/persist/db/internal/CurseObserverDao;", "getObserverDao", "()Lcom/xiaomi/fit/fitness/persist/db/internal/CurseObserverDao;", "dao", "Lcom/xiaomi/fitness/aggregation/health/entity/CurseRecordDao;", "getDao", "()Lcom/xiaomi/fitness/aggregation/health/entity/CurseRecordDao;", "init", "", "db", "Landroidx/sqlite/db/SupportSQLiteDatabase;", "migrateSettings", "syncing", "", "aggregateData", "force", "scopeOnline", "Lkotlinx/coroutines/CoroutineScope;", BaseJavaModule.METHOD_TYPE_SYNC, Constants.KEY_PAY_RESULT_RET, "Lkotlin/Function1;", "getLatestByPage", "", "Lcom/xiaomi/fit/fitness/export/data/aggregation/CurseRecord;", "page", "", "pageNum", "getLatestEnded", "start0TZ", "", "limit", "getLatest", "getRecord", "end0TZ", "getFirstAfterRecord", "time0TZ", "getFirstBeforeRecord", "insert", "record", "delete", "updateRecord", "pre", "dest", "deleteSymptoms", "deleteMenstruationStatus", "timeList", "deleteMenstruationSymptoms", "batchActionRecord", "updateSummary", "deleteToggle", "insertToggle", "updateOri", "Lkotlin/Pair;", "saveSymptom", EcgReportKey.symptom, "Lcom/xiaomi/fit/fitness/export/data/item/WomenHealthSymptoms;", "getSymptom", "observerReportChange", "Lkotlinx/coroutines/flow/Flow;", "getCurseTimeItemList", "Lcom/xiaomi/fitness/repo/curse/CurseTimeItem;", "start0TZSec", "end0TZSec", "Companion", "fitness-data-core_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nCurseRepo.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CurseRepo.kt\ncom/xiaomi/fitness/repo/curse/CurseRepo\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,308:1\n1#2:309\n1863#3,2:310\n1863#3,2:316\n37#4:312\n36#4,3:313\n37#4:318\n36#4,3:319\n37#4:322\n36#4,3:323\n37#4:326\n36#4,3:327\n37#4:330\n36#4,3:331\n37#4:334\n36#4,3:335\n37#4:338\n36#4,3:339\n37#4:342\n36#4,3:343\n37#4:346\n36#4,3:347\n*S KotlinDebug\n*F\n+ 1 CurseRepo.kt\ncom/xiaomi/fitness/repo/curse/CurseRepo\n*L\n229#1:310,2\n239#1:316,2\n234#1:312\n234#1:313,3\n244#1:318\n244#1:319,3\n185#1:322\n185#1:323,3\n218#1:326\n218#1:327,3\n266#1:330\n266#1:331,3\n267#1:334\n267#1:335,3\n268#1:338\n268#1:339,3\n278#1:342\n278#1:343,3\n285#1:346\n285#1:347,3\n*E\n"})
public final class CurseRepo {

    @NotNull
    public static final String TAG = "CurseRepo";

    @NotNull
    private final CurseAggregation aggregation;

    /* JADX INFO: renamed from: oriRecordDao$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy oriRecordDao;

    @Nullable
    private CoroutineScope scopeOnline;

    @NotNull
    private final DeviceSettingManager settingManager;
    private boolean syncing;

    /* JADX INFO: renamed from: com.xiaomi.fitness.repo.curse.CurseRepo$sync$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.repo.curse.CurseRepo$sync$1", f = "CurseRepo.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    @SourceDebugExtension({"SMAP\nCurseRepo.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CurseRepo.kt\ncom/xiaomi/fitness/repo/curse/CurseRepo$sync$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,308:1\n774#2:309\n865#2,2:310\n37#3:312\n36#3,3:313\n*S KotlinDebug\n*F\n+ 1 CurseRepo.kt\ncom/xiaomi/fitness/repo/curse/CurseRepo$sync$1\n*L\n144#1:309\n144#1:310,2\n156#1:312\n156#1:313,3\n*E\n"})
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Function1<Boolean, Unit> $ret;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass1(Function1<? super Boolean, Unit> function1, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$ret = function1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void invokeSuspend$lambda$1(CurseRepo curseRepo, List list) {
            curseRepo.getDao().clear();
            CurseRecordDao dao = curseRepo.getDao();
            CurseRecordEntity[] curseRecordEntityArr = (CurseRecordEntity[]) list.toArray(new CurseRecordEntity[0]);
            dao.insert((CurseRecordEntity[]) Arrays.copyOf(curseRecordEntityArr, curseRecordEntityArr.length));
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return CurseRepo.this.new AnonymousClass1(this.$ret, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            List<CurseTimeItem> allCurseRecord = DailyRecordDaoUtils.INSTANCE.getAllCurseRecord();
            Logger.i(CurseRepo.TAG, "sync originPointList: " + allCurseRecord);
            long jCurrentTimeMillis = System.currentTimeMillis() / ((long) 1000);
            ArrayList arrayList = new ArrayList();
            for (Object obj2 : allCurseRecord) {
                if (((CurseTimeItem) obj2).getTime() < jCurrentTimeMillis) {
                    arrayList.add(obj2);
                }
            }
            List<CurseRecordEntity> listConvertPointToSegmentRecord = CurseRepo.this.aggregation.convertPointToSegmentRecord(arrayList);
            if (listConvertPointToSegmentRecord.isEmpty()) {
                CurseRepo.this.getDao().clear();
                this.$ret.invoke2(Boxing.boxBoolean(true));
                return Unit.INSTANCE;
            }
            Logger.i(CurseRepo.TAG, "sync convertPointToSegmentRecords: " + listConvertPointToSegmentRecord);
            final List<CurseRecordEntity> listCommonAggregationSegmentRecords = CurseRepo.this.aggregation.commonAggregationSegmentRecords(listConvertPointToSegmentRecord);
            Logger.i(CurseRepo.TAG, "mergeList result = " + listCommonAggregationSegmentRecords);
            FitnessDatabase companion = FitnessDatabase.INSTANCE.getInstance();
            final CurseRepo curseRepo = CurseRepo.this;
            companion.runInTransaction(new Runnable() { // from class: com.xiaomi.fitness.repo.curse.a
                @Override // java.lang.Runnable
                public final void run() {
                    CurseRepo.AnonymousClass1.invokeSuspend$lambda$1(curseRepo, listCommonAggregationSegmentRecords);
                }
            });
            this.$ret.invoke2(Boxing.boxBoolean(true));
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    public CurseRepo(@NotNull CurseAggregation aggregation) {
        Intrinsics.checkNotNullParameter(aggregation, "aggregation");
        this.aggregation = aggregation;
        this.oriRecordDao = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: ia5
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return CurseRepo.oriRecordDao_delegate$lambda$0();
            }
        });
        this.settingManager = DeviceSettingManager.INSTANCE.getInstance();
    }

    public static /* synthetic */ void aggregateData$default(CurseRepo curseRepo, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        curseRepo.aggregateData(z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit aggregateData$lambda$5(CurseRepo this$0, boolean z) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Logger.i(TAG, "******* onReportSynced: finish = " + z + " *******");
        if (z) {
            this$0.getObserverDao().clear();
        }
        this$0.syncing = false;
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void batchActionRecord$lambda$12(List updateSummary, List deleteToggle, List insertToggle, Pair pair, CurseRepo this$0, List deleteSymptoms) {
        Intrinsics.checkNotNullParameter(updateSummary, "$updateSummary");
        Intrinsics.checkNotNullParameter(deleteToggle, "$deleteToggle");
        Intrinsics.checkNotNullParameter(insertToggle, "$insertToggle");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(deleteSymptoms, "$deleteSymptoms");
        Logger.i(TAG, "batchActionRecord: updateSize = " + updateSummary.size() + "; deleteSize = " + deleteToggle.size() + ", insert = " + insertToggle.size() + ", update  first= " + (pair != null ? (Record) pair.getFirst() : null) + " second=" + (pair != null ? (Record) pair.getSecond() : null));
        CurseRecordDao dao = this$0.getDao();
        CurseRecordEntity[] curseRecordEntityArr = (CurseRecordEntity[]) CurseUtilKt.toEntities(updateSummary).toArray(new CurseRecordEntity[0]);
        dao.update((CurseRecordEntity[]) Arrays.copyOf(curseRecordEntityArr, curseRecordEntityArr.length));
        CurseRecordDao dao2 = this$0.getDao();
        CurseRecordEntity[] curseRecordEntityArr2 = (CurseRecordEntity[]) CurseUtilKt.toEntities(deleteToggle).toArray(new CurseRecordEntity[0]);
        dao2.delete((CurseRecordEntity[]) Arrays.copyOf(curseRecordEntityArr2, curseRecordEntityArr2.length));
        CurseRecordDao dao3 = this$0.getDao();
        CurseRecordEntity[] curseRecordEntityArr3 = (CurseRecordEntity[]) CurseUtilKt.toEntities(insertToggle).toArray(new CurseRecordEntity[0]);
        dao3.insert((CurseRecordEntity[]) Arrays.copyOf(curseRecordEntityArr3, curseRecordEntityArr3.length));
        if (pair != null) {
            Record record = (Record) pair.getFirst();
            Record record2 = (Record) pair.getSecond();
            this$0.deleteMenstruationStatus(CurseRecordKt.toDeleteKey(record));
            this$0.deleteMenstruationStatus(CurseRecordKt.toDeleteKey((List<Record>) deleteToggle));
            FitnessDataRecorder oriRecordDao = this$0.getOriRecordDao();
            WomenHealthStatus[] womenHealthStatusArr = (WomenHealthStatus[]) CurseUtilKt.toStatus(record2).toArray(new WomenHealthStatus[0]);
            oriRecordDao.recordWomenHealthStatus("xiaomiwear_app_manually", 0, (WomenHealthStatus[]) Arrays.copyOf(womenHealthStatusArr, womenHealthStatusArr.length));
        }
        this$0.deleteMenstruationStatus(CurseRecordKt.toDeleteKey((List<Record>) deleteToggle));
        FitnessDataRecorder oriRecordDao2 = this$0.getOriRecordDao();
        WomenHealthStatus[] womenHealthStatusArr2 = (WomenHealthStatus[]) CurseUtilKt.toStatus((List<Record>) insertToggle).toArray(new WomenHealthStatus[0]);
        oriRecordDao2.recordWomenHealthStatus("xiaomiwear_app_manually", 0, (WomenHealthStatus[]) Arrays.copyOf(womenHealthStatusArr2, womenHealthStatusArr2.length));
        this$0.deleteMenstruationSymptoms(deleteSymptoms);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void delete$lambda$7(CurseRepo this$0, Record record) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(record, "$record");
        this$0.getDao().delete(record.getId());
        List<Long> deleteKey = CurseRecordKt.toDeleteKey(record);
        this$0.deleteMenstruationSymptoms(deleteKey);
        this$0.deleteMenstruationStatus(deleteKey);
    }

    private final void deleteMenstruationStatus(List<Long> timeList) {
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = timeList.iterator();
        while (it.hasNext()) {
            WomenHealthStatus womenHealthStatus = new WomenHealthStatus(((Number) it.next()).longValue(), 3, 0L);
            womenHealthStatus.setSid("xiaomiwear_app_manually");
            arrayList.add(womenHealthStatus);
        }
        FitnessDataRecorder oriRecordDao = getOriRecordDao();
        WomenHealthStatus[] womenHealthStatusArr = (WomenHealthStatus[]) arrayList.toArray(new WomenHealthStatus[0]);
        oriRecordDao.deleteMenstruation((DailyRecordItem[]) Arrays.copyOf(womenHealthStatusArr, womenHealthStatusArr.length));
    }

    private final void deleteMenstruationSymptoms(List<Long> timeList) {
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = timeList.iterator();
        while (it.hasNext()) {
            WomenHealthSymptoms womenHealthSymptoms = new WomenHealthSymptoms(((Number) it.next()).longValue());
            womenHealthSymptoms.setSid("xiaomiwear_app_manually");
            arrayList.add(womenHealthSymptoms);
        }
        FitnessDataRecorder oriRecordDao = getOriRecordDao();
        WomenHealthSymptoms[] womenHealthSymptomsArr = (WomenHealthSymptoms[]) arrayList.toArray(new WomenHealthSymptoms[0]);
        oriRecordDao.deleteMenstruationSymptoms((DailyRecordItem[]) Arrays.copyOf(womenHealthSymptomsArr, womenHealthSymptomsArr.length));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final CurseRecordDao getDao() {
        return FitnessDatabase.INSTANCE.getInstance().curseRecordDao();
    }

    private final CurseObserverDao getObserverDao() {
        return FitnessDatabase.INSTANCE.getInstance().curseRecordObserverDao();
    }

    private final FitnessDataRecorder getOriRecordDao() {
        return (FitnessDataRecorder) this.oriRecordDao.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void insert$lambda$6(CurseRepo this$0, Record record) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(record, "$record");
        this$0.getDao().insert(CurseUtilKt.toEntity(record));
        FitnessDataRecorder oriRecordDao = this$0.getOriRecordDao();
        WomenHealthStatus[] womenHealthStatusArr = (WomenHealthStatus[]) CurseUtilKt.toStatus(record).toArray(new WomenHealthStatus[0]);
        oriRecordDao.recordWomenHealthStatus("xiaomiwear_app_manually", 0, (WomenHealthStatus[]) Arrays.copyOf(womenHealthStatusArr, womenHealthStatusArr.length));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final FitnessDataRecorder oriRecordDao_delegate$lambda$0() {
        return FitnessDataExtKt.getInstance(FitnessDataRecorder.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void updateRecord$lambda$8(CurseRepo this$0, Record dest, Record pre, List deleteSymptoms) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(dest, "$dest");
        Intrinsics.checkNotNullParameter(pre, "$pre");
        Intrinsics.checkNotNullParameter(deleteSymptoms, "$deleteSymptoms");
        this$0.getDao().update(CurseUtilKt.toEntity(dest));
        this$0.deleteMenstruationStatus(CurseRecordKt.toDeleteKey(pre));
        this$0.deleteMenstruationSymptoms(deleteSymptoms);
        FitnessDataRecorder oriRecordDao = this$0.getOriRecordDao();
        WomenHealthStatus[] womenHealthStatusArr = (WomenHealthStatus[]) CurseUtilKt.toStatus(dest).toArray(new WomenHealthStatus[0]);
        oriRecordDao.recordWomenHealthStatus("xiaomiwear_app_manually", 0, (WomenHealthStatus[]) Arrays.copyOf(womenHealthStatusArr, womenHealthStatusArr.length));
    }

    public final synchronized void aggregateData(boolean force) {
        if (!AccountManagerExtKt.getInstance(AccountManager.INSTANCE).isLogin() && !force) {
            Logger.i(TAG, "not login");
            return;
        }
        int count = getObserverDao().getCount();
        Logger.i(TAG, "curseSync: count = " + count + ", force = " + force + ", syncing = " + this.syncing);
        if (force || count > 0) {
            this.syncing = true;
            sync(new Function1() { // from class: ha5
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj) {
                    return CurseRepo.aggregateData$lambda$5(this.f19856a, ((Boolean) obj).booleanValue());
                }
            });
        }
    }

    public final boolean batchActionRecord(@NotNull final List<Record> updateSummary, @NotNull final List<Record> deleteToggle, @NotNull final List<Record> insertToggle, @Nullable final Pair<Record, Record> updateOri, @NotNull final List<Long> deleteSymptoms) {
        Intrinsics.checkNotNullParameter(updateSummary, "updateSummary");
        Intrinsics.checkNotNullParameter(deleteToggle, "deleteToggle");
        Intrinsics.checkNotNullParameter(insertToggle, "insertToggle");
        Intrinsics.checkNotNullParameter(deleteSymptoms, "deleteSymptoms");
        try {
            FitnessDatabase.INSTANCE.getInstance().runInTransaction(new Runnable() { // from class: ma5
                @Override // java.lang.Runnable
                public final void run() {
                    CurseRepo.batchActionRecord$lambda$12(updateSummary, deleteToggle, insertToggle, updateOri, this, deleteSymptoms);
                }
            });
            return true;
        } catch (Exception e) {
            Logger.e(TAG, "batchActionRecord failed. error=" + e);
            return false;
        }
    }

    public final boolean delete(@NotNull final Record record) {
        Intrinsics.checkNotNullParameter(record, "record");
        Logger.i(TAG, "delete: entity = " + record);
        try {
            FitnessDatabase.INSTANCE.getInstance().runInTransaction(new Runnable() { // from class: la5
                @Override // java.lang.Runnable
                public final void run() {
                    CurseRepo.delete$lambda$7(this.f24822a, record);
                }
            });
            return true;
        } catch (Exception e) {
            Logger.i(TAG, "delete failed.error=" + e);
            return false;
        }
    }

    @NotNull
    public final List<CurseTimeItem> getCurseTimeItemList(long start0TZSec, long end0TZSec) {
        return DailyRecordDaoUtils.getCurseTimeItemList$default(DailyRecordDaoUtils.INSTANCE, start0TZSec, end0TZSec, false, 4, null);
    }

    @Nullable
    public final Record getFirstAfterRecord(long time0TZ) {
        CurseRecordEntity firstAfter$default = CurseRecordDao.DefaultImpls.getFirstAfter$default(getDao(), time0TZ, 0L, 2, null);
        if (firstAfter$default != null) {
            return CurseUtilKt.toRecord(firstAfter$default);
        }
        return null;
    }

    @Nullable
    public final Record getFirstBeforeRecord(long time0TZ) {
        CurseRecordEntity firstBefore = getDao().getFirstBefore(time0TZ);
        if (firstBefore != null) {
            return CurseUtilKt.toRecord(firstBefore);
        }
        return null;
    }

    @NotNull
    public final List<Record> getLatest(long start0TZ, int limit) {
        return CurseUtilKt.toRecords(CurseRecordDao.DefaultImpls.getLatest$default(getDao(), start0TZ, limit, 0L, 4, null));
    }

    @NotNull
    public final List<Record> getLatestByPage(int page, int pageNum) {
        return CurseUtilKt.toRecords(CurseRecordDao.DefaultImpls.getLatestByPage$default(getDao(), page * pageNum, pageNum, 0L, 4, null));
    }

    @NotNull
    public final List<Record> getLatestEnded(long start0TZ, int limit) {
        return CurseUtilKt.toRecords(CurseRecordDao.DefaultImpls.getLatestEnded$default(getDao(), start0TZ, limit, 0L, 4, null));
    }

    @NotNull
    public final List<Record> getRecord(long start0TZ, long end0TZ) {
        return CurseUtilKt.toRecords(getDao().getByRange(start0TZ, end0TZ));
    }

    @Nullable
    public final WomenHealthSymptoms getSymptom(long time0TZ) {
        return DailyRecordDaoUtils.INSTANCE.getSymptom(time0TZ);
    }

    public final void init(@NotNull final SupportSQLiteDatabase db) {
        Intrinsics.checkNotNullParameter(db, "db");
        Logger.i(TAG, "init database: ");
        final Ref.BooleanRef booleanRef = new Ref.BooleanRef();
        booleanRef.element = CurseObserver.INSTANCE.createTrigger(db);
        BroadcastReceiver broadcastReceiver = new BroadcastReceiver() { // from class: com.xiaomi.fitness.repo.curse.CurseRepo$init$receiver$1
            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context, Intent intent) {
                Logger.i(CurseRepo.TAG, "on receive " + intent);
                Ref.BooleanRef booleanRef2 = booleanRef;
                if (!booleanRef2.element) {
                    booleanRef2.element = CurseObserver.INSTANCE.createTrigger(db);
                }
                Logger.i(CurseRepo.TAG, "received sync sign observer = " + booleanRef.element);
                CurseRepo.aggregateData$default(this, false, 1, null);
            }
        };
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("recent_data_changed_broadcast");
        intentFilter.addAction(FitnessDataConstants.BROADCAST_ACTION_HISTORY_FITNESS_DATA_CHANGED);
        if (Build.VERSION.SDK_INT >= 33) {
            ApplicationExtKt.getApplication().registerReceiver(broadcastReceiver, intentFilter, 2);
        } else {
            ApplicationExtKt.getApplication().registerReceiver(broadcastReceiver, intentFilter);
        }
        AppUtil.getApp().sendBroadcast(new Intent(CurseApiKt.ACTION_CURSE_INIT));
    }

    public final boolean insert(@NotNull final Record record) {
        Intrinsics.checkNotNullParameter(record, "record");
        Logger.i(TAG, "insert: entity = " + record);
        try {
            FitnessDatabase.INSTANCE.getInstance().runInTransaction(new Runnable() { // from class: ka5
                @Override // java.lang.Runnable
                public final void run() {
                    CurseRepo.insert$lambda$6(this.f23650a, record);
                }
            });
            return true;
        } catch (Exception e) {
            Logger.i(TAG, "insert failed. error=" + e);
            return false;
        }
    }

    public final void migrateSettings() {
        Application application = ApplicationExtKt.getApplication();
        if (new File(FileUtils.INSTANCE.getSharedPrefDir(application), "pref:menstruation.cloud_pref.xml").exists()) {
            SharedPreferences sharedPreferences = application.getSharedPreferences("pref:menstruation.cloud_pref", 0);
            if (sharedPreferences.getAll().isEmpty()) {
                return;
            }
            Object objValueToObject = this.settingManager.readSettingItem("xiaomiwear_app", "curse").valueToObject(CurseSetting.class);
            CurseSetting curseSetting = objValueToObject instanceof CurseSetting ? (CurseSetting) objValueToObject : null;
            CurseSetting curseSetting2 = curseSetting == null ? new CurseSetting() : curseSetting;
            Logger.i(TAG, "migration saved = " + curseSetting);
            String string = sharedPreferences.getString("cycle_days", "28");
            if (string != null) {
                curseSetting2.setMenstrualCycle(Integer.parseInt(string));
            }
            String string2 = sharedPreferences.getString("menstruation_days", UserConfig.KEY_DEVICE_LITE_SORT_GROUP);
            if (string2 != null) {
                curseSetting2.setEstimatedMenstrualDays(Integer.parseInt(string2));
            }
            String string3 = sharedPreferences.getString("enable_remind_record", "false");
            if (string3 != null) {
                curseSetting2.setAppPush(Boolean.parseBoolean(string3));
            }
            curseSetting2.setLastMenstrualTime(sharedPreferences.getLong("menstruation_latest_begin", CurseUtilKt.getToday0TZ() * ((long) 1000)));
            curseSetting2.enablePredict(true);
            curseSetting2.setFirst(false);
            Logger.i(TAG, "migration new = " + curseSetting2);
            this.settingManager.saveDeviceSetItem(false, "xiaomiwear_app", "curse", curseSetting2);
            sharedPreferences.edit().clear().apply();
            application.deleteSharedPreferences("pref:menstruation.cloud_pref");
            AppUtil.getApp().sendBroadcast(new Intent(CurseApiKt.ACTION_CURSE_INIT));
        }
    }

    @NotNull
    public final Flow<Integer> observerReportChange() {
        return getDao().observerChange();
    }

    public final boolean saveSymptom(@NotNull WomenHealthSymptoms symptom) {
        Intrinsics.checkNotNullParameter(symptom, "symptom");
        Logger.i(TAG, "saveSymptom: " + symptom);
        return getOriRecordDao().recordWomenHealthSymptoms("xiaomiwear_app_manually", CurseUtilKt.getCurTZOffset(), symptom);
    }

    public final void sync(@NotNull Function1<? super Boolean, Unit> ret) {
        Intrinsics.checkNotNullParameter(ret, "ret");
        Logger.i(TAG, "******* start sync *******");
        CoroutineScope coroutineScope = this.scopeOnline;
        if (coroutineScope != null) {
            CoroutineScopeKt.cancel$default(coroutineScope, null, 1, null);
        }
        this.scopeOnline = ScopeExtKt.scope(Dispatchers.getIO(), new AnonymousClass1(ret, null));
    }

    public final boolean updateRecord(@NotNull final Record pre, @NotNull final Record dest, @NotNull final List<Long> deleteSymptoms) {
        Intrinsics.checkNotNullParameter(pre, "pre");
        Intrinsics.checkNotNullParameter(dest, "dest");
        Intrinsics.checkNotNullParameter(deleteSymptoms, "deleteSymptoms");
        Logger.i(TAG, "updateRecord: pre = " + pre + ", dest = " + dest);
        try {
            FitnessDatabase.INSTANCE.getInstance().runInTransaction(new Runnable() { // from class: ja5
                @Override // java.lang.Runnable
                public final void run() {
                    CurseRepo.updateRecord$lambda$8(this.f22582a, dest, pre, deleteSymptoms);
                }
            });
            return true;
        } catch (Exception e) {
            Logger.i(TAG, "updateRecord failed. error=" + e);
            return false;
        }
    }

    @NotNull
    public final List<WomenHealthSymptoms> getSymptom(long start0TZ, long end0TZ) {
        return DailyRecordDaoUtils.INSTANCE.getSymptom(start0TZ, end0TZ);
    }
}
