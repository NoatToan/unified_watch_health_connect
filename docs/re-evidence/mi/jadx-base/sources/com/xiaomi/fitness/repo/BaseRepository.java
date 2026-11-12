package com.xiaomi.fitness.repo;

import android.text.TextUtils;
import androidx.annotation.IntRange;
import androidx.lifecycle.FlowLiveDataConversions;
import androidx.lifecycle.LiveData;
import com.xiaomi.fit.data.common.constant.FitnessDataChangedSource;
import com.xiaomi.fit.data.common.constant.FitnessDataChangedUtils;
import com.xiaomi.fit.data.common.log.FitnessLogUtils;
import com.xiaomi.fit.data.common.util.FitnessDateUtils;
import com.xiaomi.fit.fitness.export.api.FitnessDataGetter;
import com.xiaomi.fit.fitness.export.api.FitnessDataRecorder;
import com.xiaomi.fit.fitness.export.api.FitnessServerSyncer;
import com.xiaomi.fit.fitness.export.api.repository.IRepository;
import com.xiaomi.fit.fitness.export.data.CloudDataResult;
import com.xiaomi.fit.fitness.export.data.FitnessPersistKey;
import com.xiaomi.fit.fitness.export.data.aggregation.DailyBasicReport;
import com.xiaomi.fit.fitness.export.data.aggregation.DailyHrReport;
import com.xiaomi.fit.fitness.export.data.aggregation.DailySpo2Report;
import com.xiaomi.fit.fitness.export.data.annotation.HomeDataType;
import com.xiaomi.fit.fitness.export.data.annotation.HomeDataTypeKt;
import com.xiaomi.fit.fitness.export.data.item.DailyRecordItem;
import com.xiaomi.fit.fitness.export.data.item.SegmentItem;
import com.xiaomi.fit.fitness.export.di.FitnessDataExtKt;
import com.xiaomi.fit.fitness.parser.sport.base.SportReportBaseParser;
import com.xiaomi.fit.fitness.persist.db.FitnessDatabase;
import com.xiaomi.fit.fitness.persist.db.utils.ItemEntityUtil;
import com.xiaomi.fit.fitness.persist.server.data.RelativeDataModel;
import com.xiaomi.fitness.aggregation.health.dao.FitnessDailyReportDaoProxy;
import com.xiaomi.fitness.aggregation.health.dao.convert.ReportConvertor;
import com.xiaomi.fitness.aggregation.health.entity.CloudContract;
import com.xiaomi.fitness.common.utils.TimeUtils;
import com.xiaomi.fitness.repo.BaseRepository;
import com.xiaomi.fitness.repo.relative.RelativeDataRequest;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.NotImplementedError;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__MutableCollectionsJVMKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.comparisons.ComparisonsKt__ComparisonsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.LongProgression;
import kotlin.ranges.RangesKt___RangesKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000ª\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0011\n\u0002\b\b\n\u0002\u0010$\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b \u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0003:\u0001dB\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0016\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020$H\u0096@¢\u0006\u0002\u0010%J\u0010\u0010&\u001a\u00020\"2\u0006\u0010#\u001a\u00020$H\u0014J\u0010\u0010'\u001a\u00020\"2\u0006\u0010#\u001a\u00020$H\u0002JJ\u0010(\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000*0)2\b\u0010+\u001a\u0004\u0018\u00010\u00072\u0006\u0010,\u001a\u00020\u00072\u0006\u0010-\u001a\u00020\u000b2\b\b\u0001\u0010.\u001a\u00020/2\b\b\u0001\u00100\u001a\u00020/2\u0006\u00101\u001a\u000202H\u0016J0\u00103\u001a\b\u0012\u0004\u0012\u00028\u00000*2\b\u0010+\u001a\u0004\u0018\u00010\u00072\u0006\u0010-\u001a\u00020\u000b2\u0006\u0010.\u001a\u00020/2\u0006\u00100\u001a\u00020/H\u0016JB\u00104\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000*050)2\u0006\u00106\u001a\u00020\u000b2\u0006\u0010,\u001a\u00020\u00072\u0006\u0010-\u001a\u00020\u000b2\u0006\u0010.\u001a\u00020/2\u0006\u00100\u001a\u00020/H\u0016J4\u00107\u001a\b\u0012\u0004\u0012\u00028\u00000*2\f\u00108\u001a\b\u0012\u0004\u0012\u0002090*2\u0006\u0010,\u001a\u00020\u00072\u0006\u0010:\u001a\u00020/2\u0006\u0010;\u001a\u000202H\u0002JD\u0010<\u001a\u00020\"2\f\u0010=\u001a\b\u0012\u0004\u0012\u00028\u00000*2\u0006\u00106\u001a\u00020\u000b2\u0006\u0010,\u001a\u00020\u00072\u0006\u0010>\u001a\u00020\u000b2\u0006\u0010?\u001a\u00020\u000b2\u0006\u0010:\u001a\u00020/H\u0082@¢\u0006\u0002\u0010@J\u0010\u0010A\u001a\u0002022\u0006\u0010,\u001a\u00020\u0007H\u0002J\b\u0010B\u001a\u000202H\u0002J,\u0010C\u001a\u00020D2\u0006\u0010,\u001a\u00020\u00072\u0006\u0010-\u001a\u00020\u000b2\b\b\u0001\u0010.\u001a\u00020/2\b\b\u0001\u00100\u001a\u00020/H\u0004JM\u0010E\u001a\b\u0012\u0004\u0012\u00028\u00000*2\b\u0010+\u001a\u0004\u0018\u00010\u00072\u0006\u0010,\u001a\u00020\u00072\f\u0010=\u001a\b\u0012\u0004\u0012\u00028\u00000*2\u0018\u0010F\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000b0G0*H\u0010¢\u0006\u0002\bHJ5\u0010I\u001a\u00028\u00002\b\u0010+\u001a\u0004\u0018\u00010\u00072\u0006\u0010,\u001a\u00020\u00072\u0006\u0010J\u001a\u00020\u000b2\f\u0010K\u001a\b\u0012\u0004\u0012\u00028\u00000*H&¢\u0006\u0002\u0010LJ0\u0010M\u001a\b\u0012\u0004\u0012\u00028\u00000*2\b\u0010+\u001a\u0004\u0018\u00010\u00072\u0006\u0010,\u001a\u00020\u00072\u0006\u0010-\u001a\u00020\u000b2\u0006\u0010N\u001a\u00020\u000bH\u0016J0\u0010(\u001a\b\u0012\u0004\u0012\u00028\u00000*2\b\u0010+\u001a\u0004\u0018\u00010\u00072\u0006\u0010,\u001a\u00020\u00072\u0006\u0010-\u001a\u00020\u000b2\u0006\u0010N\u001a\u00020\u000bH\u0002J\b\u0010O\u001a\u000202H\u0002J\"\u0010P\u001a\u00020\"2\u0012\u0010#\u001a\n\u0012\u0006\b\u0001\u0012\u00020$0Q\"\u00020$H\u0096@¢\u0006\u0002\u0010RJ\u001d\u0010S\u001a\u00020\"2\u000e\u0010T\u001a\n\u0012\u0006\b\u0001\u0012\u00020$0QH\u0014¢\u0006\u0002\u0010UJ\u001d\u0010V\u001a\u00020\"2\u000e\u0010W\u001a\n\u0012\u0006\b\u0001\u0012\u00020$0QH\u0002¢\u0006\u0002\u0010UJ\b\u0010X\u001a\u00020\"H\u0002JI\u0010Y\u001a\u0014\u0012\u0004\u0012\u00020\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u00020$0*0Z2\b\u0010+\u001a\u0004\u0018\u00010\u00072\u0006\u0010,\u001a\u00020\u00072\u0006\u0010-\u001a\u00020\u000b2\u0006\u0010N\u001a\u00020\u000b2\u0006\u0010[\u001a\u00020/H\u0010¢\u0006\u0002\b\\JO\u0010]\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u00020$0*0Z0)2\b\u0010+\u001a\u0004\u0018\u00010\u00072\u0006\u0010,\u001a\u00020\u00072\u0006\u0010-\u001a\u00020\u000b2\u0006\u0010N\u001a\u00020\u000b2\u0006\u0010[\u001a\u00020/H\u0010¢\u0006\u0002\b^J\u0013\u0010_\u001a\b\u0012\u0004\u0012\u00028\u00000`H ¢\u0006\u0002\baJ\b\u0010b\u001a\u00020cH&R\u0014\u0010\u0006\u001a\u00020\u0007X\u0084D¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u001b\u0010\f\u001a\u00020\r8@X\u0080\u0084\u0002¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u000e\u0010\u000fR\u001b\u0010\u0012\u001a\u00020\u00138@X\u0080\u0084\u0002¢\u0006\f\n\u0004\b\u0016\u0010\u0011\u001a\u0004\b\u0014\u0010\u0015R\u001b\u0010\u0017\u001a\u00020\u00188DX\u0084\u0084\u0002¢\u0006\f\n\u0004\b\u001b\u0010\u0011\u001a\u0004\b\u0019\u0010\u001aR\u001b\u0010\u001c\u001a\u00020\u001d8DX\u0084\u0084\u0002¢\u0006\f\n\u0004\b \u0010\u0011\u001a\u0004\b\u001e\u0010\u001f¨\u0006e"}, d2 = {"Lcom/xiaomi/fitness/repo/BaseRepository;", "Report", "Lcom/xiaomi/fit/fitness/export/data/aggregation/DailyBasicReport;", "Lcom/xiaomi/fit/fitness/export/api/repository/IRepository;", "<init>", "()V", "TAG", "", "getTAG", "()Ljava/lang/String;", "ONE_DAY_SECOND", "", "dbInstance", "Lcom/xiaomi/fit/fitness/persist/db/FitnessDatabase;", "getDbInstance$fitness_data_core_chinaProductRelease", "()Lcom/xiaomi/fit/fitness/persist/db/FitnessDatabase;", "dbInstance$delegate", "Lkotlin/Lazy;", "repoMgr", "Lcom/xiaomi/fitness/repo/RepositoryManager;", "getRepoMgr$fitness_data_core_chinaProductRelease", "()Lcom/xiaomi/fitness/repo/RepositoryManager;", "repoMgr$delegate", "dbGetter", "Lcom/xiaomi/fit/fitness/export/api/FitnessDataGetter;", "getDbGetter", "()Lcom/xiaomi/fit/fitness/export/api/FitnessDataGetter;", "dbGetter$delegate", "dbWriter", "Lcom/xiaomi/fit/fitness/export/api/FitnessDataRecorder;", "getDbWriter", "()Lcom/xiaomi/fit/fitness/export/api/FitnessDataRecorder;", "dbWriter$delegate", "addRecord", "", "record", "Lcom/xiaomi/fit/fitness/export/data/item/DailyRecordItem;", "(Lcom/xiaomi/fit/fitness/export/data/item/DailyRecordItem;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "doRecordAdd", "afterRecordAdded", "getReportList", "Landroidx/lifecycle/LiveData;", "", "sid", CloudContract.COL_VIEW_TAG, "beginInSecond", "leftOffset", "", "rightOffset", "syncNet", "", "getDailyReportListSync", "getRelativeReportList", "Lcom/xiaomi/fit/fitness/export/data/CloudDataResult;", "relativeId", "aggregateRelativeReportByServerData", "modelList", "Lcom/xiaomi/fit/fitness/persist/server/data/RelativeDataModel;", "curTzOffset", "isGetSrcData", "addAbnormalRecordToReport", "reportList", "startTime", "endTime", "(Ljava/util/List;JLjava/lang/String;JJILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "supportGetAbnormalRecord", "isGetRelativeSrcData", "divideTimeRangeByTag", "Lcom/xiaomi/fitness/repo/BaseRepository$TimeRange;", "mergeReportList", "dateRangeList", "Lkotlin/Pair;", "mergeReportList$fitness_data_core_chinaProductRelease", "mergeTargetReport", "startTimestamp", "srcReportList", "(Ljava/lang/String;Ljava/lang/String;JLjava/util/List;)Lcom/xiaomi/fit/fitness/export/data/aggregation/DailyBasicReport;", "getReportListForSummary", "endInSecond", "needGroupedById", "deleteRecord", "", "([Lcom/xiaomi/fit/fitness/export/data/item/DailyRecordItem;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "doDeleteRecord", "records", "([Lcom/xiaomi/fit/fitness/export/data/item/DailyRecordItem;)V", "afterRecordDelete", "params", "syncAfterDataChanged", "queryDataItems", "", "zoneOffsetInSec", "queryDataItems$fitness_data_core_chinaProductRelease", "queryDataItemsAsync", "queryDataItemsAsync$fitness_data_core_chinaProductRelease", "getBiz", "Lcom/xiaomi/fitness/repo/BaseProcessBiz;", "getBiz$fitness_data_core_chinaProductRelease", "getDataType", "Lcom/xiaomi/fit/fitness/export/data/annotation/HomeDataType;", "TimeRange", "fitness-data-core_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nBaseRepository.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BaseRepository.kt\ncom/xiaomi/fitness/repo/BaseRepository\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n+ 4 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt\n+ 5 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 6 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n*L\n1#1,416:1\n53#2:417\n55#2:421\n53#2:422\n55#2:426\n50#3:418\n55#3:420\n50#3:423\n55#3:425\n107#4:419\n107#4:424\n1863#5,2:427\n1863#5,2:429\n1863#5,2:432\n1010#5,2:435\n216#6:431\n217#6:434\n*S KotlinDebug\n*F\n+ 1 BaseRepository.kt\ncom/xiaomi/fitness/repo/BaseRepository\n*L\n89#1:417\n89#1:421\n122#1:422\n122#1:426\n89#1:418\n89#1:420\n122#1:423\n122#1:425\n89#1:419\n122#1:424\n152#1:427,2\n159#1:429,2\n184#1:432,2\n308#1:435,2\n179#1:431\n179#1:434\n*E\n"})
public abstract class BaseRepository<Report extends DailyBasicReport> implements IRepository<Report> {

    @NotNull
    private final String TAG = "Data_repo";
    private final long ONE_DAY_SECOND = TimeUnit.DAYS.toSeconds(1);

    /* JADX INFO: renamed from: dbInstance$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy dbInstance = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: eb2
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return BaseRepository.dbInstance_delegate$lambda$0();
        }
    });

    /* JADX INFO: renamed from: repoMgr$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy repoMgr = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: fb2
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return BaseRepository.repoMgr_delegate$lambda$1();
        }
    });

    /* JADX INFO: renamed from: dbGetter$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy dbGetter = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: gb2
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return BaseRepository.dbGetter_delegate$lambda$2();
        }
    });

    /* JADX INFO: renamed from: dbWriter$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy dbWriter = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: hb2
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return BaseRepository.dbWriter_delegate$lambda$3();
        }
    });

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0018\u0010\u0005\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00070\u0006¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\u001b\u0010\u0011\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00070\u0006HÆ\u0003J9\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u001a\b\u0002\u0010\u0005\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00070\u0006HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR#\u0010\u0005\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00070\u0006¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u001a"}, d2 = {"Lcom/xiaomi/fitness/repo/BaseRepository$TimeRange;", "", "startTime", "", "endTime", "rangeList", "", "Lkotlin/Pair;", "<init>", "(JJLjava/util/List;)V", "getStartTime", "()J", "getEndTime", "getRangeList", "()Ljava/util/List;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "", "fitness-data-core_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class TimeRange {
        private final long endTime;

        @NotNull
        private final List<Pair<Long, Long>> rangeList;
        private final long startTime;

        public TimeRange(long j, long j2, @NotNull List<Pair<Long, Long>> rangeList) {
            Intrinsics.checkNotNullParameter(rangeList, "rangeList");
            this.startTime = j;
            this.endTime = j2;
            this.rangeList = rangeList;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ TimeRange copy$default(TimeRange timeRange, long j, long j2, List list, int i, Object obj) {
            if ((i & 1) != 0) {
                j = timeRange.startTime;
            }
            long j3 = j;
            if ((i & 2) != 0) {
                j2 = timeRange.endTime;
            }
            long j4 = j2;
            if ((i & 4) != 0) {
                list = timeRange.rangeList;
            }
            return timeRange.copy(j3, j4, list);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final long getStartTime() {
            return this.startTime;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final long getEndTime() {
            return this.endTime;
        }

        @NotNull
        public final List<Pair<Long, Long>> component3() {
            return this.rangeList;
        }

        @NotNull
        public final TimeRange copy(long startTime, long endTime, @NotNull List<Pair<Long, Long>> rangeList) {
            Intrinsics.checkNotNullParameter(rangeList, "rangeList");
            return new TimeRange(startTime, endTime, rangeList);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof TimeRange)) {
                return false;
            }
            TimeRange timeRange = (TimeRange) other;
            return this.startTime == timeRange.startTime && this.endTime == timeRange.endTime && Intrinsics.areEqual(this.rangeList, timeRange.rangeList);
        }

        public final long getEndTime() {
            return this.endTime;
        }

        @NotNull
        public final List<Pair<Long, Long>> getRangeList() {
            return this.rangeList;
        }

        public final long getStartTime() {
            return this.startTime;
        }

        public int hashCode() {
            return (((Long.hashCode(this.startTime) * 31) + Long.hashCode(this.endTime)) * 31) + this.rangeList.hashCode();
        }

        @NotNull
        public String toString() {
            return "TimeRange(startTime=" + this.startTime + ", endTime=" + this.endTime + ", rangeList=" + this.rangeList + ")";
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[HomeDataType.values().length];
            try {
                iArr[HomeDataType.BLOOD_PRESSURE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[HomeDataType.WEIGHT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[HomeDataType.WOMEN_HEALTH.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.repo.BaseRepository$addAbnormalRecordToReport$1, reason: invalid class name */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.repo.BaseRepository", f = "BaseRepository.kt", i = {0, 0, 0, 0}, l = {173}, m = "addAbnormalRecordToReport", n = {"this", "reportList", "startTime", "curTzOffset"}, s = {"L$0", "L$1", "J$0", "I$0"})
    public static final class AnonymousClass1 extends ContinuationImpl {
        int I$0;
        long J$0;
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ BaseRepository<Report> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(BaseRepository<Report> baseRepository, Continuation<? super AnonymousClass1> continuation) {
            super(continuation);
            this.this$0 = baseRepository;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.addAbnormalRecordToReport(null, 0L, null, 0L, 0L, 0, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:8:0x0019  */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public final Object addAbnormalRecordToReport(List<? extends Report> list, long j, String str, long j2, long j3, int i, Continuation<? super Unit> continuation) {
        AnonymousClass1 anonymousClass1;
        BaseRepository<Report> baseRepository;
        List<? extends Report> list2;
        int i2;
        long j4;
        if (continuation instanceof AnonymousClass1) {
            anonymousClass1 = (AnonymousClass1) continuation;
            int i3 = anonymousClass1.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                anonymousClass1.label = i3 - Integer.MIN_VALUE;
            } else {
                anonymousClass1 = new AnonymousClass1(this, continuation);
            }
        } else {
            anonymousClass1 = new AnonymousClass1(this, continuation);
        }
        AnonymousClass1 anonymousClass2 = anonymousClass1;
        Object obj = anonymousClass2.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i4 = anonymousClass2.label;
        if (i4 == 0) {
            ResultKt.throwOnFailure(obj);
            if (supportGetAbnormalRecord(str) && (!list.isEmpty())) {
                RelativeDataRequest companion = RelativeDataRequest.INSTANCE.getInstance();
                HomeDataType dataType = getDataType();
                anonymousClass2.L$0 = this;
                anonymousClass2.L$1 = list;
                anonymousClass2.J$0 = j2;
                anonymousClass2.I$0 = i;
                anonymousClass2.label = 1;
                Object abnormalFitnessData = companion.getAbnormalFitnessData(j, dataType, j2, j3, i, anonymousClass2);
                if (abnormalFitnessData == coroutine_suspended) {
                    return coroutine_suspended;
                }
                baseRepository = this;
                list2 = list;
                i2 = i;
                obj = abnormalFitnessData;
                j4 = j2;
            }
            return Unit.INSTANCE;
        }
        if (i4 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        i2 = anonymousClass2.I$0;
        j4 = anonymousClass2.J$0;
        list2 = (List) anonymousClass2.L$1;
        baseRepository = (BaseRepository) anonymousClass2.L$0;
        ResultKt.throwOnFailure(obj);
        List<RelativeDataModel> list3 = (List) obj;
        if (list3 != null && (!list3.isEmpty())) {
            for (Map.Entry<String, List<DailyRecordItem>> entry : ItemEntityUtil.INSTANCE.convertRelativeDataToItem(list3, i2).entrySet()) {
                Map<Long, List<T>> mapGroupByDay = baseRepository.getBiz$fitness_data_core_chinaProductRelease().groupByDay(j4, entry.getValue(), null);
                if (mapGroupByDay != 0 && !mapGroupByDay.isEmpty()) {
                    Iterator<T> it = list2.iterator();
                    while (it.hasNext()) {
                        DailyBasicReport dailyBasicReport = (DailyBasicReport) it.next();
                        List<SegmentItem> list4 = (List) mapGroupByDay.get(Boxing.boxLong(dailyBasicReport.getTime()));
                        String key = entry.getKey();
                        switch (key.hashCode()) {
                            case -1823210805:
                                if (key.equals("low_spo2")) {
                                    Intrinsics.checkNotNull(dailyBasicReport, "null cannot be cast to non-null type com.xiaomi.fit.fitness.export.data.aggregation.DailySpo2Report");
                                    ((DailySpo2Report) dailyBasicReport).setAbnormalSpo2Records(list4);
                                }
                                break;
                            case -269725706:
                                if (key.equals("high_heart_rate")) {
                                    Intrinsics.checkNotNull(dailyBasicReport, "null cannot be cast to non-null type com.xiaomi.fit.fitness.export.data.aggregation.DailyHrReport");
                                    ((DailyHrReport) dailyBasicReport).setAbnormalHrHighRecords(list4);
                                }
                                break;
                            case -68983036:
                                if (key.equals(FitnessPersistKey.AbnormalHrLow)) {
                                    Intrinsics.checkNotNull(dailyBasicReport, "null cannot be cast to non-null type com.xiaomi.fit.fitness.export.data.aggregation.DailyHrReport");
                                    ((DailyHrReport) dailyBasicReport).setAbnormalHrLowRecords(list4);
                                }
                                break;
                            case 642188390:
                                if (key.equals("abnormal_heart_beat")) {
                                    Intrinsics.checkNotNull(dailyBasicReport, "null cannot be cast to non-null type com.xiaomi.fit.fitness.export.data.aggregation.DailyHrReport");
                                    ((DailyHrReport) dailyBasicReport).setAbnormalFibRecords(list4);
                                }
                                break;
                        }
                    }
                }
            }
        }
        return Unit.INSTANCE;
    }

    public static /* synthetic */ <Report extends DailyBasicReport> Object addRecord$suspendImpl(BaseRepository<Report> baseRepository, DailyRecordItem dailyRecordItem, Continuation<? super Unit> continuation) {
        FitnessLogUtils.i(((BaseRepository) baseRepository).TAG, "addRecord: " + dailyRecordItem);
        baseRepository.doRecordAdd(dailyRecordItem);
        baseRepository.afterRecordAdded(dailyRecordItem);
        return Unit.INSTANCE;
    }

    private final void afterRecordAdded(DailyRecordItem record) {
        syncAfterDataChanged();
    }

    private final void afterRecordDelete(DailyRecordItem[] params) {
        syncAfterDataChanged();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final List<Report> aggregateRelativeReportByServerData(List<RelativeDataModel> modelList, String viewTag, int curTzOffset, boolean isGetSrcData) {
        List<RelativeDataModel> list = modelList;
        if (list == null || list.isEmpty()) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        if (!isGetSrcData) {
            ArrayList arrayList = new ArrayList();
            for (RelativeDataModel relativeDataModel : modelList) {
                arrayList.add(getBiz$fitness_data_core_chinaProductRelease().convertServerAggregateReport((relativeDataModel.getTime() + ((long) relativeDataModel.getZoneOffsetInSec())) - ((long) curTzOffset), viewTag, relativeDataModel));
            }
            return arrayList;
        }
        List<Report> listSplitDailyReports = getBiz$fitness_data_core_chinaProductRelease().splitDailyReports(null, viewTag, ItemEntityUtil.INSTANCE.convertRelativeDataToItem(modelList, 0));
        ArrayList arrayList2 = new ArrayList();
        for (Report report : listSplitDailyReports) {
            arrayList2.add(ReportConvertor.INSTANCE.convertReport(getDataType(), report, report.getTime()));
        }
        return arrayList2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final FitnessDataGetter dbGetter_delegate$lambda$2() {
        return FitnessDataExtKt.getInstance(FitnessDataGetter.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final FitnessDatabase dbInstance_delegate$lambda$0() {
        return FitnessDatabase.INSTANCE.getInstance();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final FitnessDataRecorder dbWriter_delegate$lambda$3() {
        return FitnessDataExtKt.getInstance(FitnessDataRecorder.INSTANCE);
    }

    public static /* synthetic */ <Report extends DailyBasicReport> Object deleteRecord$suspendImpl(BaseRepository<Report> baseRepository, DailyRecordItem[] dailyRecordItemArr, Continuation<? super Unit> continuation) {
        for (DailyRecordItem dailyRecordItem : dailyRecordItemArr) {
            FitnessLogUtils.i(((BaseRepository) baseRepository).TAG, "deleteRecord: " + dailyRecordItem);
        }
        baseRepository.doDeleteRecord(dailyRecordItemArr);
        baseRepository.afterRecordDelete(dailyRecordItemArr);
        return Unit.INSTANCE;
    }

    private final boolean isGetRelativeSrcData() {
        int i = WhenMappings.$EnumSwitchMapping$0[getDataType().ordinal()];
        return i == 1 || i == 2 || i == 3;
    }

    private final boolean needGroupedById() {
        return HomeDataTypeKt.needCareSid(getDataType());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final RepositoryManager repoMgr_delegate$lambda$1() {
        return RepositoryManager.INSTANCE.getInstance();
    }

    private final boolean supportGetAbnormalRecord(String viewTag) {
        HomeDataType dataType = getDataType();
        return Intrinsics.areEqual("days", viewTag) || dataType == HomeDataType.HR || dataType == HomeDataType.SPO2;
    }

    private final void syncAfterDataChanged() {
        FitnessDataChangedUtils.sendRecentDataChangedBroadcast$default(FitnessDataChangedUtils.INSTANCE, FitnessDataChangedSource.ManualRecord, true, null, null, false, 28, null);
        FitnessServerSyncer.DefaultImpls.syncWithServer$default(FitnessDataExtKt.getInstance(FitnessServerSyncer.INSTANCE), false, "add_or_delete", null, 4, null);
    }

    @Override // com.xiaomi.fit.fitness.export.api.repository.IRepository
    @Nullable
    public Object addRecord(@NotNull DailyRecordItem dailyRecordItem, @NotNull Continuation<? super Unit> continuation) {
        return addRecord$suspendImpl(this, dailyRecordItem, continuation);
    }

    @Override // com.xiaomi.fit.fitness.export.api.repository.IRepository
    @Nullable
    public Object deleteRecord(@NotNull DailyRecordItem[] dailyRecordItemArr, @NotNull Continuation<? super Unit> continuation) {
        return deleteRecord$suspendImpl(this, dailyRecordItemArr, continuation);
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0068  */
    /* JADX WARN: Code duplicated, block: B:18:0x0072 A[LOOP:1: B:17:0x0070->B:18:0x0072, LOOP_END] */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @NotNull
    public final TimeRange divideTimeRangeByTag(@NotNull String viewTag, long beginInSecond, @IntRange(from = 0) int leftOffset, @IntRange(from = 0) int rightOffset) {
        long jLongValue;
        long jLongValue2;
        int i;
        int i2;
        Intrinsics.checkNotNullParameter(viewTag, "viewTag");
        ArrayList arrayList = new ArrayList();
        Calendar calendar = Calendar.getInstance();
        long j = 1000;
        calendar.setTimeInMillis(beginInSecond * j);
        TimeUtils.setToZeroOClock(calendar);
        switch (viewTag.hashCode()) {
            case -1068487181:
                if (viewTag.equals("months")) {
                    calendar.add(2, -leftOffset);
                    int i3 = leftOffset + rightOffset + 1;
                    for (int i4 = 0; i4 < i3; i4++) {
                        long timeInMillis = calendar.getTimeInMillis();
                        calendar.add(2, 1);
                        arrayList.add(new Pair(Long.valueOf(timeInMillis / j), Long.valueOf(calendar.getTimeInMillis() / j)));
                    }
                }
                break;
            case 3076183:
                if (viewTag.equals("days")) {
                    calendar.add(5, -leftOffset);
                    i = leftOffset + rightOffset + 1;
                    for (i2 = 0; i2 < i; i2++) {
                        long timeInMillis2 = calendar.getTimeInMillis();
                        calendar.add(5, 1);
                        arrayList.add(new Pair(Long.valueOf(timeInMillis2 / j), Long.valueOf(calendar.getTimeInMillis() / j)));
                    }
                }
                break;
            case 99469071:
                if (viewTag.equals("hours")) {
                    calendar.add(5, -leftOffset);
                    i = leftOffset + rightOffset + 1;
                    while (i2 < i) {
                        long timeInMillis3 = calendar.getTimeInMillis();
                        calendar.add(5, 1);
                        arrayList.add(new Pair(Long.valueOf(timeInMillis3 / j), Long.valueOf(calendar.getTimeInMillis() / j)));
                    }
                }
                break;
            case 113008383:
                if (viewTag.equals("weeks")) {
                    calendar.add(3, -leftOffset);
                    int i5 = leftOffset + rightOffset + 1;
                    for (int i6 = 0; i6 < i5; i6++) {
                        long timeInMillis4 = calendar.getTimeInMillis();
                        calendar.add(3, 1);
                        arrayList.add(new Pair(Long.valueOf(timeInMillis4 / j), Long.valueOf(calendar.getTimeInMillis() / j)));
                    }
                }
                break;
        }
        if (arrayList.isEmpty()) {
            jLongValue = 0;
            jLongValue2 = 0;
        } else {
            jLongValue = ((Number) ((Pair) arrayList.get(0)).getFirst()).longValue();
            jLongValue2 = ((Number) ((Pair) CollectionsKt___CollectionsKt.last((List) arrayList)).getSecond()).longValue();
        }
        return new TimeRange(jLongValue, jLongValue2, arrayList);
    }

    public void doDeleteRecord(@NotNull DailyRecordItem[] records) {
        Intrinsics.checkNotNullParameter(records, "records");
        throw new NotImplementedError("An operation is not implemented: Not yet implemented");
    }

    public void doRecordAdd(@NotNull DailyRecordItem record) {
        Intrinsics.checkNotNullParameter(record, "record");
        throw new NotImplementedError("An operation is not implemented: Not yet implemented");
    }

    @NotNull
    public abstract BaseProcessBiz<Report> getBiz$fitness_data_core_chinaProductRelease();

    @Override // com.xiaomi.fit.fitness.export.api.repository.IRepository
    @NotNull
    public List<Report> getDailyReportListSync(@Nullable String sid, long beginInSecond, int leftOffset, int rightOffset) {
        TimeRange timeRangeDivideTimeRangeByTag = divideTimeRangeByTag("days", beginInSecond, leftOffset, rightOffset);
        return FitnessDailyReportDaoProxy.INSTANCE.queryDailyReportListSync(getDataType(), timeRangeDivideTimeRangeByTag.getStartTime(), timeRangeDivideTimeRangeByTag.getEndTime());
    }

    @NotNull
    public abstract HomeDataType getDataType();

    @NotNull
    public final FitnessDataGetter getDbGetter() {
        return (FitnessDataGetter) this.dbGetter.getValue();
    }

    @NotNull
    public final FitnessDatabase getDbInstance$fitness_data_core_chinaProductRelease() {
        return (FitnessDatabase) this.dbInstance.getValue();
    }

    @NotNull
    public final FitnessDataRecorder getDbWriter() {
        return (FitnessDataRecorder) this.dbWriter.getValue();
    }

    @Override // com.xiaomi.fit.fitness.export.api.repository.IRepository
    @NotNull
    public LiveData<CloudDataResult<List<Report>>> getRelativeReportList(final long relativeId, @NotNull final String viewTag, long beginInSecond, int leftOffset, int rightOffset) {
        Intrinsics.checkNotNullParameter(viewTag, "viewTag");
        final boolean zIsGetRelativeSrcData = isGetRelativeSrcData();
        final int currentTZOffsetInSec = FitnessDateUtils.getCurrentTZOffsetInSec();
        TimeRange timeRangeDivideTimeRangeByTag = divideTimeRangeByTag(viewTag, beginInSecond, leftOffset, rightOffset);
        final long startTime = timeRangeDivideTimeRangeByTag.getStartTime();
        final long endTime = timeRangeDivideTimeRangeByTag.getEndTime();
        final List<Pair<Long, Long>> rangeList = timeRangeDivideTimeRangeByTag.getRangeList();
        final Flow<CloudDataResult<List<RelativeDataModel>>> fitnessData = RelativeDataRequest.INSTANCE.getInstance().getFitnessData(relativeId, getDataType(), startTime, endTime, currentTZOffsetInSec, zIsGetRelativeSrcData);
        return FlowLiveDataConversions.asLiveData$default(new Flow<CloudDataResult<List<? extends Report>>>() { // from class: com.xiaomi.fitness.repo.BaseRepository$getRelativeReportList$$inlined$map$1

            /* JADX INFO: renamed from: com.xiaomi.fitness.repo.BaseRepository$getRelativeReportList$$inlined$map$1$2, reason: invalid class name */
            @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u00032\u0006\u0010\u0004\u001a\u0002H\u0002H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"<anonymous>", "", "T", "R", "value", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1", "kotlinx/coroutines/flow/FlowKt__TransformKt$map$$inlined$unsafeTransform$1$2"}, k = 3, mv = {2, 0, 0}, xi = 48)
            @SourceDebugExtension({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 BaseRepository.kt\ncom/xiaomi/fitness/repo/BaseRepository\n*L\n1#1,222:1\n54#2:223\n123#3,16:224\n*E\n"})
            public static final class AnonymousClass2<T> implements FlowCollector {
                final /* synthetic */ int $curTZOffset$inlined;
                final /* synthetic */ long $endTime$inlined;
                final /* synthetic */ boolean $isGetSrcData$inlined;
                final /* synthetic */ List $rangeList$inlined;
                final /* synthetic */ long $relativeId$inlined;
                final /* synthetic */ long $startTime$inlined;
                final /* synthetic */ FlowCollector $this_unsafeFlow;
                final /* synthetic */ String $viewTag$inlined;
                final /* synthetic */ BaseRepository this$0;

                /* JADX INFO: renamed from: com.xiaomi.fitness.repo.BaseRepository$getRelativeReportList$$inlined$map$1$2$1, reason: invalid class name */
                @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
                @DebugMetadata(c = "com.xiaomi.fitness.repo.BaseRepository$getRelativeReportList$$inlined$map$1$2", f = "BaseRepository.kt", i = {0, 0}, l = {234, SportReportBaseParser.ReportType.targetValueNumber}, m = "emit", n = {"this", "tempReportList"}, s = {"L$0", "L$2"})
                public static final class AnonymousClass1 extends ContinuationImpl {
                    Object L$0;
                    Object L$1;
                    Object L$2;
                    int label;
                    /* synthetic */ Object result;

                    public AnonymousClass1(Continuation continuation) {
                        super(continuation);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    @Nullable
                    public final Object invokeSuspend(@NotNull Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(FlowCollector flowCollector, BaseRepository baseRepository, String str, int i, boolean z, long j, long j2, long j3, List list) {
                    this.$this_unsafeFlow = flowCollector;
                    this.this$0 = baseRepository;
                    this.$viewTag$inlined = str;
                    this.$curTZOffset$inlined = i;
                    this.$isGetSrcData$inlined = z;
                    this.$relativeId$inlined = j;
                    this.$startTime$inlined = j2;
                    this.$endTime$inlined = j3;
                    this.$rangeList$inlined = list;
                }

                /* JADX WARN: Code duplicated, block: B:26:0x00ce A[RETURN] */
                /* JADX WARN: Code duplicated, block: B:7:0x0017  */
                @Override // kotlinx.coroutines.flow.FlowCollector
                @Nullable
                public final Object emit(Object obj, @NotNull Continuation continuation) {
                    AnonymousClass1 anonymousClass1;
                    FlowCollector flowCollector;
                    String str;
                    AnonymousClass2<T> anonymousClass2;
                    FlowCollector flowCollector2;
                    List list;
                    CloudDataResult cloudDataResult;
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
                    Object obj2 = anonymousClass1.result;
                    Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i2 = anonymousClass1.label;
                    if (i2 != 0) {
                        if (i2 == 1) {
                            list = (List) anonymousClass1.L$2;
                            flowCollector2 = (FlowCollector) anonymousClass1.L$1;
                            anonymousClass2 = (AnonymousClass2) anonymousClass1.L$0;
                            ResultKt.throwOnFailure(obj2);
                            str = null;
                        } else {
                            if (i2 != 2) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            ResultKt.throwOnFailure(obj2);
                        }
                        return Unit.INSTANCE;
                    }
                    ResultKt.throwOnFailure(obj2);
                    flowCollector = this.$this_unsafeFlow;
                    CloudDataResult cloudDataResult2 = (CloudDataResult) obj;
                    if (cloudDataResult2.getData() == null) {
                        cloudDataResult = new CloudDataResult(CollectionsKt__CollectionsKt.emptyList(), cloudDataResult2.getErrorCode(), cloudDataResult2.getErrorMsg());
                        str = null;
                    } else {
                        Object data = cloudDataResult2.getData();
                        Intrinsics.checkNotNull(data);
                        List listAggregateRelativeReportByServerData = this.this$0.aggregateRelativeReportByServerData((List) data, this.$viewTag$inlined, this.$curTZOffset$inlined, this.$isGetSrcData$inlined);
                        BaseRepository baseRepository = this.this$0;
                        long j = this.$relativeId$inlined;
                        String str2 = this.$viewTag$inlined;
                        long j2 = this.$startTime$inlined;
                        long j3 = this.$endTime$inlined;
                        int i3 = this.$curTZOffset$inlined;
                        anonymousClass1.L$0 = this;
                        anonymousClass1.L$1 = flowCollector;
                        anonymousClass1.L$2 = listAggregateRelativeReportByServerData;
                        anonymousClass1.label = 1;
                        str = null;
                        if (baseRepository.addAbnormalRecordToReport(listAggregateRelativeReportByServerData, j, str2, j2, j3, i3, anonymousClass1) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        anonymousClass2 = this;
                        flowCollector2 = flowCollector;
                        list = listAggregateRelativeReportByServerData;
                    }
                    anonymousClass1.L$0 = str;
                    anonymousClass1.L$1 = str;
                    anonymousClass1.L$2 = str;
                    anonymousClass1.label = 2;
                    if (flowCollector.emit(cloudDataResult, anonymousClass1) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    return Unit.INSTANCE;
                    FlowCollector flowCollector3 = flowCollector2;
                    cloudDataResult = new CloudDataResult(anonymousClass2.this$0.mergeReportList$fitness_data_core_chinaProductRelease(str, anonymousClass2.$viewTag$inlined, list, anonymousClass2.$rangeList$inlined), 0, null, 6, null);
                    flowCollector = flowCollector3;
                    anonymousClass1.L$0 = str;
                    anonymousClass1.L$1 = str;
                    anonymousClass1.L$2 = str;
                    anonymousClass1.label = 2;
                    if (flowCollector.emit(cloudDataResult, anonymousClass1) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    return Unit.INSTANCE;
                }
            }

            @Override // kotlinx.coroutines.flow.Flow
            @Nullable
            public Object collect(@NotNull FlowCollector flowCollector, @NotNull Continuation continuation) {
                Object objCollect = fitnessData.collect(new AnonymousClass2(flowCollector, this, viewTag, currentTZOffsetInSec, zIsGetRelativeSrcData, relativeId, startTime, endTime, rangeList), continuation);
                return objCollect == IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
            }
        }, Dispatchers.getIO(), 0L, 2, (Object) null);
    }

    @NotNull
    public final RepositoryManager getRepoMgr$fitness_data_core_chinaProductRelease() {
        return (RepositoryManager) this.repoMgr.getValue();
    }

    @Override // com.xiaomi.fit.fitness.export.api.repository.IRepository
    @Nullable
    public Report getReport(@Nullable String str, long j) {
        return (Report) IRepository.DefaultImpls.getReport(this, str, j);
    }

    @Override // com.xiaomi.fit.fitness.export.api.repository.IRepository
    @NotNull
    public LiveData<List<Report>> getReportList(@Nullable final String sid, @NotNull final String viewTag, long beginInSecond, @IntRange(from = 0) int leftOffset, @IntRange(from = 0) int rightOffset, boolean syncNet) {
        Intrinsics.checkNotNullParameter(viewTag, "viewTag");
        final TimeRange timeRangeDivideTimeRangeByTag = divideTimeRangeByTag(viewTag, beginInSecond, leftOffset, rightOffset);
        final Flow flowQueryDailyReportEntityList = FitnessDailyReportDaoProxy.INSTANCE.queryDailyReportEntityList(sid, getDataType(), timeRangeDivideTimeRangeByTag.getStartTime(), timeRangeDivideTimeRangeByTag.getEndTime(), syncNet);
        return FlowLiveDataConversions.asLiveData$default(new Flow<List<? extends Report>>() { // from class: com.xiaomi.fitness.repo.BaseRepository$getReportList$$inlined$map$1

            /* JADX INFO: renamed from: com.xiaomi.fitness.repo.BaseRepository$getReportList$$inlined$map$1$2, reason: invalid class name */
            @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u00032\u0006\u0010\u0004\u001a\u0002H\u0002H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"<anonymous>", "", "T", "R", "value", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1", "kotlinx/coroutines/flow/FlowKt__TransformKt$map$$inlined$unsafeTransform$1$2"}, k = 3, mv = {2, 0, 0}, xi = 48)
            @SourceDebugExtension({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 BaseRepository.kt\ncom/xiaomi/fitness/repo/BaseRepository\n*L\n1#1,222:1\n54#2:223\n90#3:224\n*E\n"})
            public static final class AnonymousClass2<T> implements FlowCollector {
                final /* synthetic */ String $sid$inlined;
                final /* synthetic */ FlowCollector $this_unsafeFlow;
                final /* synthetic */ BaseRepository.TimeRange $timeRange$inlined;
                final /* synthetic */ String $viewTag$inlined;
                final /* synthetic */ BaseRepository this$0;

                /* JADX INFO: renamed from: com.xiaomi.fitness.repo.BaseRepository$getReportList$$inlined$map$1$2$1, reason: invalid class name */
                @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
                @DebugMetadata(c = "com.xiaomi.fitness.repo.BaseRepository$getReportList$$inlined$map$1$2", f = "BaseRepository.kt", i = {}, l = {SportReportBaseParser.ReportType.targetValueNumber}, m = "emit", n = {}, s = {})
                public static final class AnonymousClass1 extends ContinuationImpl {
                    Object L$0;
                    int label;
                    /* synthetic */ Object result;

                    public AnonymousClass1(Continuation continuation) {
                        super(continuation);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    @Nullable
                    public final Object invokeSuspend(@NotNull Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(FlowCollector flowCollector, BaseRepository baseRepository, String str, String str2, BaseRepository.TimeRange timeRange) {
                    this.$this_unsafeFlow = flowCollector;
                    this.this$0 = baseRepository;
                    this.$sid$inlined = str;
                    this.$viewTag$inlined = str2;
                    this.$timeRange$inlined = timeRange;
                }

                /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                @Override // kotlinx.coroutines.flow.FlowCollector
                @Nullable
                public final Object emit(Object obj, @NotNull Continuation continuation) {
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
                    Object obj2 = anonymousClass1.result;
                    Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i2 = anonymousClass1.label;
                    if (i2 == 0) {
                        ResultKt.throwOnFailure(obj2);
                        FlowCollector flowCollector = this.$this_unsafeFlow;
                        List listMergeReportList$fitness_data_core_chinaProductRelease = this.this$0.mergeReportList$fitness_data_core_chinaProductRelease(this.$sid$inlined, this.$viewTag$inlined, (List) obj, this.$timeRange$inlined.getRangeList());
                        anonymousClass1.label = 1;
                        if (flowCollector.emit(listMergeReportList$fitness_data_core_chinaProductRelease, anonymousClass1) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i2 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj2);
                    }
                    return Unit.INSTANCE;
                }
            }

            @Override // kotlinx.coroutines.flow.Flow
            @Nullable
            public Object collect(@NotNull FlowCollector flowCollector, @NotNull Continuation continuation) {
                Object objCollect = flowQueryDailyReportEntityList.collect(new AnonymousClass2(flowCollector, this, sid, viewTag, timeRangeDivideTimeRangeByTag), continuation);
                return objCollect == IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
            }
        }, Dispatchers.getIO(), 0L, 2, (Object) null);
    }

    @Override // com.xiaomi.fit.fitness.export.api.repository.IRepository
    @NotNull
    public List<Report> getReportListForSummary(@Nullable String sid, @NotNull String viewTag, long beginInSecond, long endInSecond) {
        Intrinsics.checkNotNullParameter(viewTag, "viewTag");
        return getReportList(sid, viewTag, beginInSecond, endInSecond);
    }

    @NotNull
    public final String getTAG() {
        return this.TAG;
    }

    @NotNull
    public List<Report> mergeReportList$fitness_data_core_chinaProductRelease(@Nullable String sid, @NotNull String viewTag, @NotNull List<? extends Report> reportList, @NotNull List<Pair<Long, Long>> dateRangeList) {
        Intrinsics.checkNotNullParameter(viewTag, "viewTag");
        Intrinsics.checkNotNullParameter(reportList, "reportList");
        Intrinsics.checkNotNullParameter(dateRangeList, "dateRangeList");
        ArrayList arrayList = new ArrayList();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Report report : reportList) {
            DailyBasicReport dailyBasicReport = (DailyBasicReport) linkedHashMap.get(Long.valueOf(report.getTime()));
            if (dailyBasicReport == null) {
                linkedHashMap.put(Long.valueOf(report.getTime()), report);
            } else if (!TextUtils.equals(dailyBasicReport.getSid(), "default")) {
                linkedHashMap.put(Long.valueOf(report.getTime()), report);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (Pair<Long, Long> pair : dateRangeList) {
            long jLongValue = pair.component1().longValue();
            long jLongValue2 = pair.component2().longValue();
            arrayList2.clear();
            LongProgression longProgressionStep = RangesKt___RangesKt.step(RangesKt___RangesKt.until(jLongValue, jLongValue2), this.ONE_DAY_SECOND);
            long first = longProgressionStep.getFirst();
            long last = longProgressionStep.getLast();
            long step = longProgressionStep.getStep();
            if ((step > 0 && first <= last) || (step < 0 && last <= first)) {
                while (true) {
                    DailyBasicReport dailyBasicReport2 = (DailyBasicReport) linkedHashMap.get(Long.valueOf(first));
                    if (dailyBasicReport2 != null) {
                        arrayList2.add(dailyBasicReport2);
                    }
                    if (first == last) {
                        break;
                    }
                    first += step;
                }
            }
            if (!arrayList2.isEmpty()) {
                if (arrayList2.size() > 1) {
                    CollectionsKt__MutableCollectionsJVMKt.sortWith(arrayList2, new Comparator() { // from class: com.xiaomi.fitness.repo.BaseRepository$mergeReportList$$inlined$sortBy$1
                        /* JADX WARN: Multi-variable type inference failed */
                        @Override // java.util.Comparator
                        public final int compare(T t, T t2) {
                            return ComparisonsKt__ComparisonsKt.compareValues(Long.valueOf(((DailyBasicReport) t).getTime()), Long.valueOf(((DailyBasicReport) t2).getTime()));
                        }
                    });
                }
                arrayList.add(mergeTargetReport(sid, viewTag, jLongValue, arrayList2));
            }
        }
        return arrayList;
    }

    @NotNull
    public abstract Report mergeTargetReport(@Nullable String sid, @NotNull String viewTag, long startTimestamp, @NotNull List<? extends Report> srcReportList);

    @NotNull
    public Map<String, List<DailyRecordItem>> queryDataItems$fitness_data_core_chinaProductRelease(@Nullable String sid, @NotNull String viewTag, long beginInSecond, long endInSecond, int zoneOffsetInSec) {
        Intrinsics.checkNotNullParameter(viewTag, "viewTag");
        return getDbGetter().getAllDailyRecord(getDataType(), sid, beginInSecond, endInSecond, zoneOffsetInSec);
    }

    @NotNull
    public LiveData<Map<String, List<DailyRecordItem>>> queryDataItemsAsync$fitness_data_core_chinaProductRelease(@Nullable String sid, @NotNull String viewTag, long beginInSecond, long endInSecond, int zoneOffsetInSec) {
        Intrinsics.checkNotNullParameter(viewTag, "viewTag");
        return getDbGetter().getAllDailyRecordAsync(getDataType(), sid, beginInSecond, endInSecond, zoneOffsetInSec);
    }

    private final List<Report> getReportList(String sid, String viewTag, long beginInSecond, long endInSecond) {
        ArrayList arrayList = new ArrayList();
        Map<String, List<DailyRecordItem>> mapQueryDataItems$fitness_data_core_chinaProductRelease = queryDataItems$fitness_data_core_chinaProductRelease(sid, viewTag, beginInSecond, endInSecond, 0);
        if (mapQueryDataItems$fitness_data_core_chinaProductRelease.isEmpty()) {
            return arrayList;
        }
        if (needGroupedById()) {
            for (Map.Entry<String, Map<String, List<DailyRecordItem>>> entry : RepoUtils.INSTANCE.groupedBySid(mapQueryDataItems$fitness_data_core_chinaProductRelease).entrySet()) {
                String key = entry.getKey();
                Map<String, List<DailyRecordItem>> value = entry.getValue();
                if (key != null && key.length() != 0) {
                    arrayList.addAll(getBiz$fitness_data_core_chinaProductRelease().splitDailyReports(key, viewTag, value));
                } else {
                    FitnessLogUtils.i(this.TAG, "getReportList: targetSid is nullOrEmpty ");
                }
            }
        } else {
            arrayList.addAll(getBiz$fitness_data_core_chinaProductRelease().splitDailyReports(sid, viewTag, mapQueryDataItems$fitness_data_core_chinaProductRelease));
        }
        return arrayList;
    }
}
