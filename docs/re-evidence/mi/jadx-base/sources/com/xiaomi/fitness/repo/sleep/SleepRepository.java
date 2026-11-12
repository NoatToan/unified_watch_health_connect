package com.xiaomi.fitness.repo.sleep;

import android.text.TextUtils;
import androidx.lifecycle.FlowLiveDataConversions;
import androidx.lifecycle.LiveData;
import androidx.paging.PagingSource;
import com.xiaomi.fit.data.common.data.daily.SleepStateItem;
import com.xiaomi.fit.data.common.log.FitnessLogUtils;
import com.xiaomi.fit.data.common.util.FitnessDateUtils;
import com.xiaomi.fit.fitness.FitnessDataUtils;
import com.xiaomi.fit.fitness.export.api.FitnessDataRecorder;
import com.xiaomi.fit.fitness.export.api.repository.ISleepRepository;
import com.xiaomi.fit.fitness.export.api.repository.PagingSourceParams;
import com.xiaomi.fit.fitness.export.data.FitnessPersistKey;
import com.xiaomi.fit.fitness.export.data.aggregation.AllDaySleepReport;
import com.xiaomi.fit.fitness.export.data.aggregation.DailyBasicReport;
import com.xiaomi.fit.fitness.export.data.annotation.HomeDataType;
import com.xiaomi.fit.fitness.export.data.distribute.SleepDistributeConfig;
import com.xiaomi.fit.fitness.export.data.item.DailyRecordItem;
import com.xiaomi.fit.fitness.export.data.item.DayNightSleepReport;
import com.xiaomi.fit.fitness.export.data.item.LightValueItem;
import com.xiaomi.fit.fitness.export.data.item.SleepSegmentReport;
import com.xiaomi.fit.fitness.export.data.item.body;
import com.xiaomi.fit.fitness.export.data.project.SleepBedTimeReport;
import com.xiaomi.fit.fitness.export.data.project.SleepDiaryReport;
import com.xiaomi.fit.fitness.export.data.project.SleepProjectReport;
import com.xiaomi.fit.fitness.export.data.project.SleepRhythmReport;
import com.xiaomi.fit.fitness.export.data.project.SleepTimeReport;
import com.xiaomi.fit.fitness.export.data.project.SleepWakeTimeReport;
import com.xiaomi.fit.fitness.export.data.stat.SleepAnimalInsightReport;
import com.xiaomi.fit.fitness.export.data.stat.SleepAnimalReport;
import com.xiaomi.fit.fitness.parser.sport.base.SportReportBaseParser;
import com.xiaomi.fit.fitness.persist.db.internal.SleepSegmentEntity;
import com.xiaomi.fit.fitness.persist.db.utils.DailyRecordDaoUtils;
import com.xiaomi.fit.fitness.persist.db.utils.ItemEntityUtil;
import com.xiaomi.fit.fitness.persist.server.data.ProjectDataModel;
import com.xiaomi.fit.fitness.persist.server.data.ProjectPersistKey;
import com.xiaomi.fitness.aggregation.health.dao.FitnessDailyReportDaoProxy;
import com.xiaomi.fitness.aggregation.health.entity.CloudContract;
import com.xiaomi.fitness.common.extensions.ListExtKt;
import com.xiaomi.fitness.common.utils.TimeUtils;
import com.xiaomi.fitness.repo.BaseProcessBiz;
import com.xiaomi.fitness.repo.BaseRepository;
import com.xiaomi.fitness.repo.extradata.ExtraDataRepository;
import com.xiaomi.fitness.repo.sleep.SleepRepository;
import com.xiaomi.fitness.repo.sleep.net.ProjectDataRequest;
import com.xiaomi.fitness.repo.sleep.net.SleepStatDataRequest;
import com.xiaomi.fitness.repo.sleep.sp.SleepDataCorePreference;
import com.xiaomi.fitness.repo.sleep.utils.SleepAnimalInsightUtils;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.LongRange;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000Î\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0013\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00020\tH\u0010¢\u0006\u0002\b\nJ0\u0010\u0011\u001a\u00020\u00022\b\u0010\u0012\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u00162\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00020\u0018H\u0016J\u001c\u0010\u0019\u001a\u0004\u0018\u00010\u00022\b\u0010\u0012\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u001a\u001a\u00020\u0016H\u0016J\b\u0010\u001b\u001a\u00020\u001cH\u0016J\b\u0010\u001d\u001a\u00020\u001eH\u0016J\u001e\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020!0 2\b\u0010\"\u001a\u0004\u0018\u00010#H\u0016J\u001e\u0010$\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020%0 2\b\u0010\"\u001a\u0004\u0018\u00010#H\u0016J\u001e\u0010&\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020'0 2\b\u0010\"\u001a\u0004\u0018\u00010#H\u0016J\u001c\u0010(\u001a\u00020)2\f\u0010*\u001a\b\u0012\u0004\u0012\u00020'0\u0018H\u0096@¢\u0006\u0002\u0010+J\u001e\u0010,\u001a\u00020\u001e2\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010-\u001a\u00020'H\u0096@¢\u0006\u0002\u0010.J\b\u0010/\u001a\u00020)H\u0016J\u001c\u00100\u001a\u0004\u0018\u0001012\u0006\u0010\u001a\u001a\u00020\u00162\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0016J*\u00102\u001a\u0004\u0018\u0001032\u0006\u00104\u001a\u00020\u00162\u0006\u00105\u001a\u00020\u00162\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0096@¢\u0006\u0002\u00106J4\u00107\u001a\u0014\u0012\u0004\u0012\u00020\u0016\u0012\n\u0012\b\u0012\u0004\u0012\u0002H90\u001808\"\b\b\u0000\u00109*\u00020:2\u000e\u0010;\u001a\n\u0012\u0004\u0012\u0002H9\u0018\u00010\u0018H\u0002JD\u00107\u001a\u0014\u0012\u0004\u0012\u00020\u0016\u0012\n\u0012\b\u0012\u0004\u0012\u0002H90\u001808\"\b\b\u0000\u00109*\u00020:2\u000e\u0010;\u001a\n\u0012\u0004\u0012\u0002H9\u0018\u00010\u00182\u0006\u00104\u001a\u00020\u00162\u0006\u00105\u001a\u00020\u0016H\u0002J:\u0010<\u001a\u0014\u0012\u0004\u0012\u00020\u0016\u0012\n\u0012\b\u0012\u0004\u0012\u00020=0\u0018082\u000e\u0010;\u001a\n\u0012\u0004\u0012\u00020!\u0018\u00010\u00182\u0006\u0010>\u001a\u00020\u00162\u0006\u0010?\u001a\u00020\u0016H\u0002J:\u0010@\u001a\u0014\u0012\u0004\u0012\u00020\u0016\u0012\n\u0012\b\u0012\u0004\u0012\u00020A0\u0018082\u000e\u0010;\u001a\n\u0012\u0004\u0012\u00020!\u0018\u00010\u00182\u0006\u0010>\u001a\u00020\u00162\u0006\u0010?\u001a\u00020\u0016H\u0002J2\u0010B\u001a\u00020\u001e2\u0006\u00104\u001a\u00020\u00162\u0006\u00105\u001a\u00020\u00162\u0018\u0010C\u001a\u0014\u0012\u0004\u0012\u00020\u0016\u0012\n\u0012\b\u0012\u0004\u0012\u00020E0\u00180DH\u0002J2\u0010F\u001a\u00020\u001e2\u0006\u00104\u001a\u00020\u00162\u0006\u00105\u001a\u00020\u00162\u0018\u0010C\u001a\u0014\u0012\u0004\u0012\u00020\u0016\u0012\n\u0012\b\u0012\u0004\u0012\u00020A0\u00180DH\u0002J2\u0010G\u001a\u00020\u001e2\u0006\u00104\u001a\u00020\u00162\u0006\u00105\u001a\u00020\u00162\u0018\u0010C\u001a\u0014\u0012\u0004\u0012\u00020\u0016\u0012\n\u0012\b\u0012\u0004\u0012\u00020=0\u00180DH\u0002J\u001e\u0010H\u001a\u00020\u001e2\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010I\u001a\u000201H\u0096@¢\u0006\u0002\u0010JJ\u001c\u0010K\u001a\u00020\u001e2\f\u0010-\u001a\b\u0012\u0004\u0012\u0002010\u0018H\u0096@¢\u0006\u0002\u0010+J:\u0010L\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020M082\u0006\u00104\u001a\u00020\u00162\u0006\u00105\u001a\u00020\u00162\u0006\u0010N\u001a\u00020M2\u0006\u0010O\u001a\u00020)H\u0096@¢\u0006\u0002\u0010PJ$\u0010Q\u001a\b\u0012\u0004\u0012\u00020'0\u00182\u0006\u00104\u001a\u00020\u00162\u0006\u00105\u001a\u00020\u0016H\u0096@¢\u0006\u0002\u0010RJ$\u0010S\u001a\b\u0012\u0004\u0012\u0002010\u00182\u0006\u00104\u001a\u00020\u00162\u0006\u00105\u001a\u00020\u0016H\u0096@¢\u0006\u0002\u0010RJ\u0010\u0010T\u001a\n\u0012\u0006\u0012\u0004\u0018\u0001010UH\u0016J\u0010\u0010V\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010'0UH\u0016J\u0018\u0010W\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010'0U2\u0006\u0010\u001a\u001a\u00020\u0016H\u0016J\u001d\u0010X\u001a\u00020\u001e2\u000e\u0010Y\u001a\n\u0012\u0006\b\u0001\u0012\u00020:0ZH\u0014¢\u0006\u0002\u0010[J\u0018\u0010\\\u001a\u00020)2\u0006\u00104\u001a\u00020\u00162\u0006\u00105\u001a\u00020\u0016H\u0016J\u0010\u0010]\u001a\u00020\u001e2\u0006\u0010^\u001a\u00020:H\u0014J@\u0010_\u001a\u0014\u0012\u0004\u0012\u00020\u0016\u0012\n\u0012\b\u0012\u0004\u0012\u00020!0\u0018082\u0006\u00104\u001a\u00020\u00162\u0006\u00105\u001a\u00020\u00162\u0006\u0010N\u001a\u00020M2\u0006\u0010O\u001a\u00020)H\u0096@¢\u0006\u0002\u0010PJ\u0010\u0010`\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010%0UH\u0016J\n\u0010a\u001a\u0004\u0018\u00010%H\u0016J\u0010\u0010b\u001a\u0004\u0018\u00010%H\u0096@¢\u0006\u0002\u0010cJ\u001c\u0010d\u001a\u00020\u001e2\f\u0010e\u001a\b\u0012\u0004\u0012\u00020%0\u0018H\u0096@¢\u0006\u0002\u0010+J\b\u0010f\u001a\u00020\u001eH\u0016J\"\u0010g\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020h080U2\u0006\u0010i\u001a\u00020%H\u0016J\n\u0010j\u001a\u0004\u0018\u00010kH\u0016R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u001b\u0010\u000b\u001a\u00020\f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\r\u0010\u000e¨\u0006l"}, d2 = {"Lcom/xiaomi/fitness/repo/sleep/SleepRepository;", "Lcom/xiaomi/fitness/repo/BaseRepository;", "Lcom/xiaomi/fit/fitness/export/data/aggregation/AllDaySleepReport;", "Lcom/xiaomi/fit/fitness/export/api/repository/ISleepRepository;", "<init>", "()V", "sleepBiz", "Lcom/xiaomi/fitness/repo/sleep/SleepBiz;", "getBiz", "Lcom/xiaomi/fitness/repo/BaseProcessBiz;", "getBiz$fitness_data_core_chinaProductRelease", "extraDataRepo", "Lcom/xiaomi/fitness/repo/extradata/ExtraDataRepository;", "getExtraDataRepo", "()Lcom/xiaomi/fitness/repo/extradata/ExtraDataRepository;", "extraDataRepo$delegate", "Lkotlin/Lazy;", "mergeTargetReport", "sid", "", CloudContract.COL_VIEW_TAG, "startTimestamp", "", "srcReportList", "", "getReport", "time", "getDataType", "Lcom/xiaomi/fit/fitness/export/data/annotation/HomeDataType;", "dumpSleepRecord", "", "getAllRecordDetailPagingSource", "Landroidx/paging/PagingSource;", "Lcom/xiaomi/fit/fitness/export/data/item/SleepSegmentReport;", "params", "Lcom/xiaomi/fit/fitness/export/api/repository/PagingSourceParams;", "getSleepAnimalAllRecordPagingSource", "Lcom/xiaomi/fit/fitness/export/data/stat/SleepAnimalReport;", "getSleepRhyThmAllRecordPagingSource", "Lcom/xiaomi/fit/fitness/export/data/project/SleepRhythmReport;", "deleteSleepRhyThmReport", "", "sleepRhythmReport", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "addSleepRhyThmReport", "dataInfo", "(Ljava/lang/String;Lcom/xiaomi/fit/fitness/export/data/project/SleepRhythmReport;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getRhyThmDataValidByAllData", "getSleepDiaryReport", "Lcom/xiaomi/fit/fitness/export/data/project/SleepDiaryReport;", "getSleepProjectReport", "Lcom/xiaomi/fit/fitness/export/data/project/SleepProjectReport;", "startTime", "endTime", "(JJLjava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "covertToMapByList", "", "T", "Lcom/xiaomi/fit/fitness/export/data/item/DailyRecordItem;", "itemList", "covertToBedMapByList", "Lcom/xiaomi/fit/fitness/export/data/project/SleepBedTimeReport;", "circleStartTime", "circleEndTime", "covertToSleepTimeMapByList", "Lcom/xiaomi/fit/fitness/export/data/project/SleepWakeTimeReport;", "addSleepItemToMap", "map", "", "Lcom/xiaomi/fit/fitness/export/data/project/SleepTimeReport;", "addSleepItemToWakeMap", "addSleepItemToBedMap", "addSleepDiaryReport", "sleepDiaryInfo", "(Ljava/lang/String;Lcom/xiaomi/fit/fitness/export/data/project/SleepDiaryReport;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deleteSleepDiaryReport", "getSleepRhythmAndDiaryRecordStatus", "", "limit", "reverse", "(JJIZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getSleepRhythmRecords", "(JJLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getSleepDiaryRecords", "getLastSleepDiaryReport", "Landroidx/lifecycle/LiveData;", "getLastSleepRhythmReport", "getLastSleepRhythmReportBefore", "doDeleteRecord", "data", "", "([Lcom/xiaomi/fit/fitness/export/data/item/DailyRecordItem;)V", "hasSleepSegmentExits", "doRecordAdd", "record", "getSleepByMonthGroup", "getLatestSleepAnimal", "getLatestSleepAnimalSync", "triggerComputeSleepAnimal", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deleteSleepAnimal", "animalList", "pullSleepAnimalAsync", "getSleepAnimalInsightReport", "Lcom/xiaomi/fit/fitness/export/data/stat/SleepAnimalInsightReport;", "animalReport", "getSleepDistributeConfig", "Lcom/xiaomi/fit/fitness/export/data/distribute/SleepDistributeConfig;", "fitness-data-core_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nSleepRepository.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SleepRepository.kt\ncom/xiaomi/fitness/repo/sleep/SleepRepository\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n+ 4 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 5 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n+ 6 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt\n*L\n1#1,568:1\n1863#2,2:569\n1863#2,2:571\n1863#2,2:573\n1863#2:575\n1863#2,2:576\n1864#2:578\n1863#2,2:579\n126#3:581\n153#3,3:582\n126#3:585\n153#3,3:586\n53#4:589\n55#4:593\n53#4:594\n55#4:598\n53#4:599\n55#4:603\n50#5:590\n55#5:592\n50#5:595\n55#5:597\n50#5:600\n55#5:602\n107#6:591\n107#6:596\n107#6:601\n*S KotlinDebug\n*F\n+ 1 SleepRepository.kt\ncom/xiaomi/fitness/repo/sleep/SleepRepository\n*L\n244#1:569,2\n263#1:571,2\n284#1:573,2\n306#1:575\n309#1:576,2\n306#1:578\n406#1:579,2\n412#1:581\n412#1:582,3\n423#1:585\n423#1:586,3\n454#1:589\n454#1:593\n461#1:594\n461#1:598\n470#1:599\n470#1:603\n454#1:590\n454#1:592\n461#1:595\n461#1:597\n470#1:600\n470#1:602\n454#1:591\n461#1:596\n470#1:601\n*E\n"})
public final class SleepRepository extends BaseRepository<AllDaySleepReport> implements ISleepRepository {

    @NotNull
    private final SleepBiz sleepBiz = new SleepBiz();

    /* JADX INFO: renamed from: extraDataRepo$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy extraDataRepo = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: lrm
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return SleepRepository.extraDataRepo_delegate$lambda$0();
        }
    });

    /* JADX INFO: renamed from: com.xiaomi.fitness.repo.sleep.SleepRepository$deleteSleepRhyThmReport$1, reason: invalid class name */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.repo.sleep.SleepRepository", f = "SleepRepository.kt", i = {0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 3, 3, 3, 3}, l = {134, 139, 143, 147, 176}, m = "deleteSleepRhyThmReport", n = {"this", "sleepRhythmReport", "startTime", "endTime", "this", "sleepRhythmReport", "diaryReportList", "startTime", "endTime", "this", "sleepRhythmReport", "diaryReportList", "lightValueList", "this", "sleepRhythmReport", "lightValueList", "bodyMomentumList"}, s = {"L$0", "L$1", "J$0", "J$1", "L$0", "L$1", "L$3", "J$0", "J$1", "L$0", "L$1", "L$3", "L$4", "L$0", "L$1", "L$3", "L$4"})
    public static final class AnonymousClass1 extends ContinuationImpl {
        long J$0;
        long J$1;
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
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
            return SleepRepository.this.deleteSleepRhyThmReport(null, this);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.repo.sleep.SleepRepository$getSleepByMonthGroup$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.repo.sleep.SleepRepository", f = "SleepRepository.kt", i = {0}, l = {525}, m = "getSleepByMonthGroup", n = {"this"}, s = {"L$0"})
    public static final class C28471 extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public C28471(Continuation<? super C28471> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return SleepRepository.this.getSleepByMonthGroup(0L, 0L, 0, false, this);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.repo.sleep.SleepRepository$getSleepProjectReport$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.repo.sleep.SleepRepository", f = "SleepRepository.kt", i = {0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 3, 3, 3, 3, 3, 3, 3}, l = {200, 201, 205, 210}, m = "getSleepProjectReport", n = {"this", "sid", "startTime", "endTime", "this", "sid", "sleepDiaryInfoList", "startTime", "endTime", "this", "sid", "sleepDiaryInfoList", "map", "startTime", "endTime", "this", "sleepDiaryInfoList", "map", "lightValueList", "lightValueMap", "startTime", "endTime"}, s = {"L$0", "L$1", "J$0", "J$1", "L$0", "L$1", "L$2", "J$0", "J$1", "L$0", "L$1", "L$2", "L$3", "J$0", "J$1", "L$0", "L$1", "L$2", "L$3", "L$4", "J$0", "J$1"})
    public static final class C28481 extends ContinuationImpl {
        long J$0;
        long J$1;
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        int label;
        /* synthetic */ Object result;

        public C28481(Continuation<? super C28481> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return SleepRepository.this.getSleepProjectReport(0L, 0L, null, this);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.repo.sleep.SleepRepository$getSleepRhythmAndDiaryRecordStatus$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.repo.sleep.SleepRepository", f = "SleepRepository.kt", i = {0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 2, 2}, l = {404, 410, 411}, m = "getSleepRhythmAndDiaryRecordStatus", n = {"this", "startTime", "endTime", "limit", "reverse", "this", "dataMap", "startTime", "endTime", "limit", "reverse", "dataMap", "lightValueList"}, s = {"L$0", "J$0", "J$1", "I$0", "Z$0", "L$0", "L$1", "J$0", "J$1", "I$0", "Z$0", "L$0", "L$1"})
    public static final class C28491 extends ContinuationImpl {
        int I$0;
        long J$0;
        long J$1;
        Object L$0;
        Object L$1;
        boolean Z$0;
        int label;
        /* synthetic */ Object result;

        public C28491(Continuation<? super C28491> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return SleepRepository.this.getSleepRhythmAndDiaryRecordStatus(0L, 0L, 0, false, this);
        }
    }

    private final void addSleepItemToBedMap(long startTime, long endTime, Map<Long, List<SleepBedTimeReport>> map) {
        SleepBedTimeReport sleepBedTimeReport = new SleepBedTimeReport(startTime, endTime);
        FitnessLogUtils.i(getTAG(), "sleepTimeItem " + sleepBedTimeReport);
        long jChangeZeroOfTheDay = FitnessDateUtils.INSTANCE.changeZeroOfTheDay(startTime);
        List<SleepBedTimeReport> arrayList = map.get(Long.valueOf(jChangeZeroOfTheDay));
        if (arrayList == null) {
            arrayList = new ArrayList<>();
            map.put(Long.valueOf(jChangeZeroOfTheDay), arrayList);
        }
        ListExtKt.add(arrayList, sleepBedTimeReport);
    }

    private final void addSleepItemToMap(long startTime, long endTime, Map<Long, List<SleepTimeReport>> map) {
        SleepTimeReport sleepTimeReport = new SleepTimeReport(startTime, endTime);
        FitnessLogUtils.i(getTAG(), "sleepTimeItem " + sleepTimeReport);
        long jChangeZeroOfTheDay = FitnessDateUtils.INSTANCE.changeZeroOfTheDay(startTime);
        List<SleepTimeReport> arrayList = map.get(Long.valueOf(jChangeZeroOfTheDay));
        if (arrayList == null) {
            arrayList = new ArrayList<>();
            map.put(Long.valueOf(jChangeZeroOfTheDay), arrayList);
        }
        ListExtKt.add(arrayList, sleepTimeReport);
    }

    private final void addSleepItemToWakeMap(long startTime, long endTime, Map<Long, List<SleepWakeTimeReport>> map) {
        SleepWakeTimeReport sleepWakeTimeReport = new SleepWakeTimeReport(startTime, endTime);
        FitnessLogUtils.i(getTAG(), "sleepTimeItem " + sleepWakeTimeReport);
        long jChangeZeroOfTheDay = FitnessDateUtils.INSTANCE.changeZeroOfTheDay(startTime);
        List<SleepWakeTimeReport> arrayList = map.get(Long.valueOf(jChangeZeroOfTheDay));
        if (arrayList == null) {
            arrayList = new ArrayList<>();
            map.put(Long.valueOf(jChangeZeroOfTheDay), arrayList);
        }
        ListExtKt.add(arrayList, sleepWakeTimeReport);
    }

    private final Map<Long, List<SleepBedTimeReport>> covertToBedMapByList(List<SleepSegmentReport> itemList, long circleStartTime, long circleEndTime) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (itemList != null) {
            for (SleepSegmentReport sleepSegmentReport : itemList) {
                long bedTime = sleepSegmentReport.getBedTime();
                long wakeupTime = sleepSegmentReport.getWakeupTime();
                long jChangeZeroOfTheDay = FitnessDateUtils.INSTANCE.changeZeroOfTheDay(wakeupTime);
                if (bedTime >= jChangeZeroOfTheDay) {
                    addSleepItemToBedMap(bedTime, wakeupTime, linkedHashMap);
                } else {
                    if (circleStartTime <= bedTime && bedTime <= circleEndTime) {
                        addSleepItemToBedMap(bedTime, jChangeZeroOfTheDay, linkedHashMap);
                    }
                    addSleepItemToBedMap(jChangeZeroOfTheDay, wakeupTime, linkedHashMap);
                }
            }
        }
        return linkedHashMap;
    }

    private final <T extends DailyRecordItem> Map<Long, List<T>> covertToMapByList(List<? extends T> itemList) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (itemList != null) {
            Iterator<T> it = itemList.iterator();
            while (it.hasNext()) {
                DailyRecordItem dailyRecordItem = (DailyRecordItem) it.next();
                long jChangeZeroOfTheDay = FitnessDateUtils.INSTANCE.changeZeroOfTheDay(dailyRecordItem.getTimestamp());
                List arrayList = (List) linkedHashMap.get(Long.valueOf(jChangeZeroOfTheDay));
                if (arrayList == null) {
                    arrayList = new ArrayList();
                    linkedHashMap.put(Long.valueOf(jChangeZeroOfTheDay), arrayList);
                }
                ListExtKt.add(arrayList, dailyRecordItem);
            }
        }
        return linkedHashMap;
    }

    private final Map<Long, List<SleepWakeTimeReport>> covertToSleepTimeMapByList(List<SleepSegmentReport> itemList, long circleStartTime, long circleEndTime) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (itemList != null) {
            for (SleepSegmentReport sleepSegmentReport : itemList) {
                long bedTime = sleepSegmentReport.getBedTime();
                long wakeupTime = sleepSegmentReport.getWakeupTime();
                List<SleepStateItem> sleepItems = sleepSegmentReport.getSleepItems();
                if (sleepItems != null) {
                    for (SleepStateItem sleepStateItem : sleepItems) {
                        if (sleepStateItem.getSleepState() == 5) {
                            long startTime = sleepStateItem.getStartTime();
                            long jChangeZeroOfTheDay = FitnessDateUtils.INSTANCE.changeZeroOfTheDay(startTime);
                            if (bedTime < jChangeZeroOfTheDay) {
                                if (circleStartTime <= bedTime && bedTime <= circleEndTime) {
                                    addSleepItemToWakeMap(bedTime, jChangeZeroOfTheDay, linkedHashMap);
                                }
                                addSleepItemToWakeMap(jChangeZeroOfTheDay, startTime, linkedHashMap);
                            } else if (bedTime >= circleStartTime) {
                                addSleepItemToWakeMap(bedTime, startTime, linkedHashMap);
                            }
                            bedTime = sleepStateItem.getEndTime();
                        }
                    }
                }
                long jChangeZeroOfTheDay2 = FitnessDateUtils.INSTANCE.changeZeroOfTheDay(wakeupTime);
                if (bedTime >= jChangeZeroOfTheDay2) {
                    addSleepItemToWakeMap(bedTime, wakeupTime, linkedHashMap);
                } else {
                    if (circleStartTime <= bedTime && bedTime <= circleEndTime) {
                        addSleepItemToWakeMap(bedTime, jChangeZeroOfTheDay2, linkedHashMap);
                    }
                    addSleepItemToWakeMap(jChangeZeroOfTheDay2, wakeupTime, linkedHashMap);
                }
            }
        }
        return linkedHashMap;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ExtraDataRepository extraDataRepo_delegate$lambda$0() {
        return new ExtraDataRepository();
    }

    private final ExtraDataRepository getExtraDataRepo() {
        return (ExtraDataRepository) this.extraDataRepo.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int getSleepByMonthGroup$lambda$14(SleepSegmentReport sleepSegmentReport, SleepSegmentReport sleepSegmentReport2) {
        return (int) (sleepSegmentReport2.getTimestamp() - sleepSegmentReport.getTimestamp());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int getSleepByMonthGroup$lambda$15(Function2 tmp0, Object obj, Object obj2) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return ((Number) tmp0.invoke(obj, obj2)).intValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int getSleepProjectReport$lambda$1(SleepSegmentReport sleepSegmentReport, SleepSegmentReport sleepSegmentReport2) {
        return (int) (sleepSegmentReport2.getTimestamp() - sleepSegmentReport.getTimestamp());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int getSleepProjectReport$lambda$2(Function2 tmp0, Object obj, Object obj2) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return ((Number) tmp0.invoke(obj, obj2)).intValue();
    }

    @Override // com.xiaomi.fit.fitness.export.api.repository.ISleepRepository
    @Nullable
    public Object addSleepDiaryReport(@NotNull String str, @NotNull SleepDiaryReport sleepDiaryReport, @NotNull Continuation<? super Unit> continuation) {
        Object objAddSleepDiaryInfo = ProjectDataRequest.INSTANCE.getInstance().addSleepDiaryInfo(str, sleepDiaryReport, continuation);
        return objAddSleepDiaryInfo == IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objAddSleepDiaryInfo : Unit.INSTANCE;
    }

    @Override // com.xiaomi.fit.fitness.export.api.repository.ISleepRepository
    @Nullable
    public Object addSleepRhyThmReport(@NotNull String str, @NotNull SleepRhythmReport sleepRhythmReport, @NotNull Continuation<? super Unit> continuation) {
        Object objAddSleepRhyThmInfo = ProjectDataRequest.INSTANCE.getInstance().addSleepRhyThmInfo(str, sleepRhythmReport, continuation);
        return objAddSleepRhyThmInfo == IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objAddSleepRhyThmInfo : Unit.INSTANCE;
    }

    @Override // com.xiaomi.fit.fitness.export.api.repository.ISleepRepository
    @Nullable
    public Object deleteSleepAnimal(@NotNull List<SleepAnimalReport> list, @NotNull Continuation<? super Unit> continuation) {
        Object objDeleteSleepAnimal = SleepStatDataRequest.INSTANCE.getInstance().deleteSleepAnimal(list, continuation);
        return objDeleteSleepAnimal == IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objDeleteSleepAnimal : Unit.INSTANCE;
    }

    @Override // com.xiaomi.fit.fitness.export.api.repository.ISleepRepository
    @Nullable
    public Object deleteSleepDiaryReport(@NotNull List<SleepDiaryReport> list, @NotNull Continuation<? super Unit> continuation) {
        Object objDeleteSleepDiary = ProjectDataRequest.INSTANCE.getInstance().deleteSleepDiary(list, continuation);
        return objDeleteSleepDiary == IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objDeleteSleepDiary : Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:28:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:32:0x011d A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:33:0x011e  */
    /* JADX WARN: Code duplicated, block: B:36:0x0156 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:37:0x0157  */
    /* JADX WARN: Code duplicated, block: B:40:0x018b A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:41:0x018c  */
    /* JADX WARN: Code duplicated, block: B:44:0x01b3 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:45:0x01b4  */
    /* JADX WARN: Code duplicated, block: B:49:0x01d4  */
    /* JADX WARN: Code duplicated, block: B:51:0x01e0  */
    /* JADX WARN: Code duplicated, block: B:53:0x01fe  */
    /* JADX WARN: Code duplicated, block: B:57:0x020e  */
    /* JADX WARN: Code duplicated, block: B:71:0x0235 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:72:0x021b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:27:0x00d2 -> B:62:0x0243). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:29:0x00d8 -> B:62:0x0243). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:45:0x01b4 -> B:19:0x005e). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:37:0x0157
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // com.xiaomi.fit.fitness.export.api.repository.ISleepRepository
    @org.jetbrains.annotations.Nullable
    public java.lang.Object deleteSleepRhyThmReport(@org.jetbrains.annotations.NotNull java.util.List<com.xiaomi.fit.fitness.export.data.project.SleepRhythmReport> r30, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super java.lang.Boolean> r31) {
        /*
            Method dump skipped, instruction units count: 611
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xiaomi.fitness.repo.sleep.SleepRepository.deleteSleepRhyThmReport(java.util.List, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // com.xiaomi.fitness.repo.BaseRepository
    public void doDeleteRecord(@NotNull DailyRecordItem[] data) {
        Intrinsics.checkNotNullParameter(data, "data");
        getDbWriter().deleteSleepSegment((DailyRecordItem[]) Arrays.copyOf(data, data.length));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.xiaomi.fitness.repo.BaseRepository
    public void doRecordAdd(@NotNull DailyRecordItem record) {
        Intrinsics.checkNotNullParameter(record, "record");
        if (record instanceof SleepSegmentReport) {
            FitnessDataRecorder dbWriter = getDbWriter();
            String sid = record.getSid();
            Intrinsics.checkNotNull(sid);
            dbWriter.recordSleepSegment(sid, getRepoMgr$fitness_data_core_chinaProductRelease().getCurTimeZoneOffsetInSecond(), record);
        }
    }

    @Override // com.xiaomi.fit.fitness.export.api.repository.ISleepRepository
    public void dumpSleepRecord() {
        List<SleepSegmentEntity> listDumpSleepRecord = getDbInstance$fitness_data_core_chinaProductRelease().sleepSegmentDao().dumpSleepRecord(1000);
        ArrayList arrayList = new ArrayList();
        for (SleepSegmentEntity sleepSegmentEntity : listDumpSleepRecord) {
            if (TextUtils.equals("sleep", sleepSegmentEntity.getKey())) {
                arrayList.add(sleepSegmentEntity);
            }
        }
        Iterator it = ItemEntityUtil.convertEntityToItemList$default(ItemEntityUtil.INSTANCE, arrayList, SleepSegmentReport.class, null, 4, null).iterator();
        while (it.hasNext()) {
            FitnessLogUtils.i(getTAG(), String.valueOf((SleepSegmentReport) it.next()));
        }
    }

    @Override // com.xiaomi.fit.fitness.export.api.repository.IPagingSourceRepository
    @NotNull
    public PagingSource<Long, SleepSegmentReport> getAllRecordDetailPagingSource(@Nullable PagingSourceParams params) {
        return new SleepSegmentDataSource(params);
    }

    @Override // com.xiaomi.fitness.repo.BaseRepository
    @NotNull
    public BaseProcessBiz<AllDaySleepReport> getBiz$fitness_data_core_chinaProductRelease() {
        return this.sleepBiz;
    }

    @Override // com.xiaomi.fitness.repo.BaseRepository
    @NotNull
    public HomeDataType getDataType() {
        return HomeDataType.SLEEP;
    }

    @Override // com.xiaomi.fit.fitness.export.api.repository.ISleepRepository
    @NotNull
    public LiveData<SleepDiaryReport> getLastSleepDiaryReport() {
        final Flow<ProjectDataModel> lastDataByKey = ProjectDataRequest.INSTANCE.getInstance().getLastDataByKey(ProjectPersistKey.KEY_SLEEP_DIARY);
        return FlowLiveDataConversions.asLiveData$default(new Flow<SleepDiaryReport>() { // from class: com.xiaomi.fitness.repo.sleep.SleepRepository$getLastSleepDiaryReport$$inlined$map$1

            /* JADX INFO: renamed from: com.xiaomi.fitness.repo.sleep.SleepRepository$getLastSleepDiaryReport$$inlined$map$1$2, reason: invalid class name */
            @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u00032\u0006\u0010\u0004\u001a\u0002H\u0002H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"<anonymous>", "", "T", "R", "value", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1", "kotlinx/coroutines/flow/FlowKt__TransformKt$map$$inlined$unsafeTransform$1$2"}, k = 3, mv = {2, 0, 0}, xi = 48)
            @SourceDebugExtension({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 SleepRepository.kt\ncom/xiaomi/fitness/repo/sleep/SleepRepository\n*L\n1#1,222:1\n54#2:223\n455#3:224\n*E\n"})
            public static final class AnonymousClass2<T> implements FlowCollector {
                final /* synthetic */ FlowCollector $this_unsafeFlow;

                /* JADX INFO: renamed from: com.xiaomi.fitness.repo.sleep.SleepRepository$getLastSleepDiaryReport$$inlined$map$1$2$1, reason: invalid class name */
                @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
                @DebugMetadata(c = "com.xiaomi.fitness.repo.sleep.SleepRepository$getLastSleepDiaryReport$$inlined$map$1$2", f = "SleepRepository.kt", i = {}, l = {SportReportBaseParser.ReportType.targetValueNumber}, m = "emit", n = {}, s = {})
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

                public AnonymousClass2(FlowCollector flowCollector) {
                    this.$this_unsafeFlow = flowCollector;
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
                        SleepDiaryReport sleepDiaryReportConvertServerToLocalSleepDiaryReport = ProjectDataRequest.INSTANCE.getInstance().convertServerToLocalSleepDiaryReport((ProjectDataModel) obj);
                        anonymousClass1.label = 1;
                        if (flowCollector.emit(sleepDiaryReportConvertServerToLocalSleepDiaryReport, anonymousClass1) == coroutine_suspended) {
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
            public Object collect(@NotNull FlowCollector<? super SleepDiaryReport> flowCollector, @NotNull Continuation continuation) {
                Object objCollect = lastDataByKey.collect(new AnonymousClass2(flowCollector), continuation);
                return objCollect == IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
            }
        }, Dispatchers.getIO(), 0L, 2, (Object) null);
    }

    @Override // com.xiaomi.fit.fitness.export.api.repository.ISleepRepository
    @NotNull
    public LiveData<SleepRhythmReport> getLastSleepRhythmReport() {
        final Flow<ProjectDataModel> lastDataByKey = ProjectDataRequest.INSTANCE.getInstance().getLastDataByKey(ProjectPersistKey.KEY_SLEEP_RHYTHM);
        return FlowLiveDataConversions.asLiveData$default(new Flow<SleepRhythmReport>() { // from class: com.xiaomi.fitness.repo.sleep.SleepRepository$getLastSleepRhythmReport$$inlined$map$1

            /* JADX INFO: renamed from: com.xiaomi.fitness.repo.sleep.SleepRepository$getLastSleepRhythmReport$$inlined$map$1$2, reason: invalid class name */
            @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u00032\u0006\u0010\u0004\u001a\u0002H\u0002H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"<anonymous>", "", "T", "R", "value", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1", "kotlinx/coroutines/flow/FlowKt__TransformKt$map$$inlined$unsafeTransform$1$2"}, k = 3, mv = {2, 0, 0}, xi = 48)
            @SourceDebugExtension({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 SleepRepository.kt\ncom/xiaomi/fitness/repo/sleep/SleepRepository\n*L\n1#1,222:1\n54#2:223\n462#3:224\n*E\n"})
            public static final class AnonymousClass2<T> implements FlowCollector {
                final /* synthetic */ FlowCollector $this_unsafeFlow;

                /* JADX INFO: renamed from: com.xiaomi.fitness.repo.sleep.SleepRepository$getLastSleepRhythmReport$$inlined$map$1$2$1, reason: invalid class name */
                @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
                @DebugMetadata(c = "com.xiaomi.fitness.repo.sleep.SleepRepository$getLastSleepRhythmReport$$inlined$map$1$2", f = "SleepRepository.kt", i = {}, l = {SportReportBaseParser.ReportType.targetValueNumber}, m = "emit", n = {}, s = {})
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

                public AnonymousClass2(FlowCollector flowCollector) {
                    this.$this_unsafeFlow = flowCollector;
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
                        SleepRhythmReport sleepRhythmReportConvertServerToLocalSleepRhythmReport = ProjectDataRequest.INSTANCE.getInstance().convertServerToLocalSleepRhythmReport((ProjectDataModel) obj);
                        anonymousClass1.label = 1;
                        if (flowCollector.emit(sleepRhythmReportConvertServerToLocalSleepRhythmReport, anonymousClass1) == coroutine_suspended) {
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
            public Object collect(@NotNull FlowCollector<? super SleepRhythmReport> flowCollector, @NotNull Continuation continuation) {
                Object objCollect = lastDataByKey.collect(new AnonymousClass2(flowCollector), continuation);
                return objCollect == IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
            }
        }, Dispatchers.getIO(), 0L, 2, (Object) null);
    }

    @Override // com.xiaomi.fit.fitness.export.api.repository.ISleepRepository
    @NotNull
    public LiveData<SleepRhythmReport> getLastSleepRhythmReportBefore(long time) {
        final Flow<ProjectDataModel> latestDataBeforeTimeByKey = ProjectDataRequest.INSTANCE.getInstance().getLatestDataBeforeTimeByKey(ProjectPersistKey.KEY_SLEEP_RHYTHM, time);
        return FlowLiveDataConversions.asLiveData$default(new Flow<SleepRhythmReport>() { // from class: com.xiaomi.fitness.repo.sleep.SleepRepository$getLastSleepRhythmReportBefore$$inlined$map$1

            /* JADX INFO: renamed from: com.xiaomi.fitness.repo.sleep.SleepRepository$getLastSleepRhythmReportBefore$$inlined$map$1$2, reason: invalid class name */
            @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u00032\u0006\u0010\u0004\u001a\u0002H\u0002H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"<anonymous>", "", "T", "R", "value", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1", "kotlinx/coroutines/flow/FlowKt__TransformKt$map$$inlined$unsafeTransform$1$2"}, k = 3, mv = {2, 0, 0}, xi = 48)
            @SourceDebugExtension({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 SleepRepository.kt\ncom/xiaomi/fitness/repo/sleep/SleepRepository\n*L\n1#1,222:1\n54#2:223\n471#3:224\n*E\n"})
            public static final class AnonymousClass2<T> implements FlowCollector {
                final /* synthetic */ FlowCollector $this_unsafeFlow;

                /* JADX INFO: renamed from: com.xiaomi.fitness.repo.sleep.SleepRepository$getLastSleepRhythmReportBefore$$inlined$map$1$2$1, reason: invalid class name */
                @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
                @DebugMetadata(c = "com.xiaomi.fitness.repo.sleep.SleepRepository$getLastSleepRhythmReportBefore$$inlined$map$1$2", f = "SleepRepository.kt", i = {}, l = {SportReportBaseParser.ReportType.targetValueNumber}, m = "emit", n = {}, s = {})
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

                public AnonymousClass2(FlowCollector flowCollector) {
                    this.$this_unsafeFlow = flowCollector;
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
                        SleepRhythmReport sleepRhythmReportConvertServerToLocalSleepRhythmReport = ProjectDataRequest.INSTANCE.getInstance().convertServerToLocalSleepRhythmReport((ProjectDataModel) obj);
                        anonymousClass1.label = 1;
                        if (flowCollector.emit(sleepRhythmReportConvertServerToLocalSleepRhythmReport, anonymousClass1) == coroutine_suspended) {
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
            public Object collect(@NotNull FlowCollector<? super SleepRhythmReport> flowCollector, @NotNull Continuation continuation) {
                Object objCollect = latestDataBeforeTimeByKey.collect(new AnonymousClass2(flowCollector), continuation);
                return objCollect == IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
            }
        }, Dispatchers.getIO(), 0L, 2, (Object) null);
    }

    @Override // com.xiaomi.fit.fitness.export.api.repository.ISleepRepository
    @NotNull
    public LiveData<SleepAnimalReport> getLatestSleepAnimal() {
        return SleepStatDataRequest.INSTANCE.getInstance().getLatestSleepAnimal();
    }

    @Override // com.xiaomi.fit.fitness.export.api.repository.ISleepRepository
    @Nullable
    public SleepAnimalReport getLatestSleepAnimalSync() {
        return SleepStatDataRequest.INSTANCE.getInstance().getLatestSleepAnimalSync();
    }

    @Override // com.xiaomi.fit.fitness.export.api.repository.ISleepRepository
    public boolean getRhyThmDataValidByAllData() {
        return ProjectDataRequest.INSTANCE.getInstance().getRhyThmDataValidByAllData();
    }

    @Override // com.xiaomi.fit.fitness.export.api.repository.ISleepRepository
    @NotNull
    public PagingSource<Long, SleepAnimalReport> getSleepAnimalAllRecordPagingSource(@Nullable PagingSourceParams params) {
        return new SleepAnimalDataSource(params);
    }

    @Override // com.xiaomi.fit.fitness.export.api.repository.ISleepRepository
    @NotNull
    public LiveData<Map<String, SleepAnimalInsightReport>> getSleepAnimalInsightReport(@NotNull SleepAnimalReport animalReport) {
        Intrinsics.checkNotNullParameter(animalReport, "animalReport");
        return SleepAnimalInsightUtils.INSTANCE.getInsightReport(animalReport);
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0017  */
    @Override // com.xiaomi.fit.fitness.export.api.repository.ISleepRepository
    @Nullable
    public Object getSleepByMonthGroup(long j, long j2, int i, boolean z, @NotNull Continuation<? super Map<Long, ? extends List<SleepSegmentReport>>> continuation) {
        C28471 c28471;
        SleepRepository sleepRepository;
        if (continuation instanceof C28471) {
            c28471 = (C28471) continuation;
            int i2 = c28471.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c28471.label = i2 - Integer.MIN_VALUE;
            } else {
                c28471 = new C28471(continuation);
            }
        } else {
            c28471 = new C28471(continuation);
        }
        C28471 c28472 = c28471;
        Object limitedDataRecord = c28472.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = c28472.label;
        if (i3 == 0) {
            ResultKt.throwOnFailure(limitedDataRecord);
            DailyRecordDaoUtils dailyRecordDaoUtils = DailyRecordDaoUtils.INSTANCE;
            HomeDataType homeDataType = HomeDataType.SLEEP;
            int curTimeZoneOffsetInSecond = getRepoMgr$fitness_data_core_chinaProductRelease().getCurTimeZoneOffsetInSecond();
            c28472.L$0 = this;
            c28472.label = 1;
            limitedDataRecord = dailyRecordDaoUtils.getLimitedDataRecord(homeDataType, (String) null, j, j2, curTimeZoneOffsetInSecond, i, z, c28472);
            if (limitedDataRecord == coroutine_suspended) {
                return coroutine_suspended;
            }
            sleepRepository = this;
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            sleepRepository = (SleepRepository) c28472.L$0;
            ResultKt.throwOnFailure(limitedDataRecord);
        }
        Map<String, ? extends List<? extends DailyRecordItem>> map = (Map) limitedDataRecord;
        if (map.isEmpty()) {
            return MapsKt__MapsKt.emptyMap();
        }
        List<SleepSegmentReport> listConvertToSleepSegmentList = sleepRepository.sleepBiz.convertToSleepSegmentList(map);
        FitnessDataUtils.INSTANCE.sleepSegmentToLocalTime(listConvertToSleepSegmentList);
        final Function2 function2 = new Function2() { // from class: mrm
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return Integer.valueOf(SleepRepository.getSleepByMonthGroup$lambda$14((SleepSegmentReport) obj, (SleepSegmentReport) obj2));
            }
        };
        Collections.sort(listConvertToSleepSegmentList, new Comparator() { // from class: nrm
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return SleepRepository.getSleepByMonthGroup$lambda$15(function2, obj, obj2);
            }
        });
        return sleepRepository.getBiz$fitness_data_core_chinaProductRelease().groupByMonth(listConvertToSleepSegmentList);
    }

    @Override // com.xiaomi.fit.fitness.export.api.repository.ISleepRepository
    @Nullable
    public Object getSleepDiaryRecords(long j, long j2, @NotNull Continuation<? super List<SleepDiaryReport>> continuation) {
        return ProjectDataRequest.getSleepDiaryReportListSync$default(ProjectDataRequest.INSTANCE.getInstance(), j, j2, null, continuation, 4, null);
    }

    @Override // com.xiaomi.fit.fitness.export.api.repository.ISleepRepository
    @Nullable
    public SleepDiaryReport getSleepDiaryReport(long time, @Nullable String sid) {
        ProjectDataRequest.Companion companion = ProjectDataRequest.INSTANCE;
        SleepDiaryReport sleepDiaryReport = companion.getInstance().getSleepDiaryReport(time, sid);
        sleepDiaryReport.setLastMedicationBeforeBedtime(companion.getInstance().getSleepDiaryReport(time - 86400, sid).getMedicationBeforeBedtime());
        return sleepDiaryReport;
    }

    @Override // com.xiaomi.fit.fitness.export.api.repository.ISleepRepository
    @Nullable
    public SleepDistributeConfig getSleepDistributeConfig() {
        return SleepDataCorePreference.INSTANCE.getSleepDistributeConfig();
    }

    /* JADX WARN: Code duplicated, block: B:30:0x014d A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:31:0x014e  */
    /* JADX WARN: Code duplicated, block: B:34:0x019f A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:35:0x01a0  */
    /* JADX WARN: Code duplicated, block: B:49:0x0215 A[LOOP:0: B:47:0x020f->B:49:0x0215, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    @Override // com.xiaomi.fit.fitness.export.api.repository.ISleepRepository
    @Nullable
    public Object getSleepProjectReport(long j, long j2, @Nullable String str, @NotNull Continuation<? super SleepProjectReport> continuation) {
        C28481 c28481;
        String str2;
        long j3;
        Object sleepDiaryReportListSync;
        long j4;
        SleepRepository sleepRepository;
        String str3;
        SleepRepository sleepRepository2;
        List list;
        long j5;
        long j6;
        Map<String, ? extends List<? extends DailyRecordItem>> map;
        SleepRepository sleepRepository3;
        List list2;
        String str4;
        long j7;
        long j8;
        Object limitedDataRecord;
        Map<String, ? extends List<? extends DailyRecordItem>> map2;
        String str5;
        SleepRepository sleepRepository4;
        List list3;
        long j9;
        long j10;
        List list4;
        Map<Long, ? extends List<LightValueItem>> mapCovertToMapByList;
        Map<String, ? extends List<? extends DailyRecordItem>> map3;
        List list5;
        long j11;
        long j12;
        Object limitedDataRecord2;
        List list6;
        Map<Long, ? extends List<LightValueItem>> map4;
        List<SleepDiaryReport> list7;
        Map<String, ? extends List<? extends DailyRecordItem>> map5;
        long j13;
        List<SleepSegmentReport> listConvertToSleepSegmentList;
        LinkedHashMap linkedHashMap;
        if (continuation instanceof C28481) {
            c28481 = (C28481) continuation;
            int i = c28481.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c28481.label = i - Integer.MIN_VALUE;
            } else {
                c28481 = new C28481(continuation);
            }
        } else {
            c28481 = new C28481(continuation);
        }
        Object obj = c28481.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c28481.label;
        if (i2 != 0) {
            if (i2 == 1) {
                long j14 = c28481.J$1;
                long j15 = c28481.J$0;
                String str6 = (String) c28481.L$1;
                SleepRepository sleepRepository5 = (SleepRepository) c28481.L$0;
                ResultKt.throwOnFailure(obj);
                j3 = j15;
                sleepRepository = sleepRepository5;
                j4 = j14;
                sleepDiaryReportListSync = obj;
                str2 = str6;
            } else if (i2 == 2) {
                long j16 = c28481.J$1;
                long j17 = c28481.J$0;
                List list8 = (List) c28481.L$2;
                String str7 = (String) c28481.L$1;
                SleepRepository sleepRepository6 = (SleepRepository) c28481.L$0;
                ResultKt.throwOnFailure(obj);
                j6 = j17;
                sleepRepository2 = sleepRepository6;
                j5 = j16;
                str3 = str7;
                list = list8;
                map = (Map) obj;
                DailyRecordDaoUtils dailyRecordDaoUtils = DailyRecordDaoUtils.INSTANCE;
                int curTimeZoneOffsetInSecond = sleepRepository2.getRepoMgr$fitness_data_core_chinaProductRelease().getCurTimeZoneOffsetInSecond();
                c28481.L$0 = sleepRepository2;
                c28481.L$1 = str3;
                c28481.L$2 = list;
                c28481.L$3 = map;
                c28481.J$0 = j6;
                c28481.J$1 = j5;
                c28481.label = 3;
                sleepRepository3 = sleepRepository2;
                list2 = list;
                str4 = str3;
                j7 = j6;
                j8 = j5;
                limitedDataRecord = dailyRecordDaoUtils.getLimitedDataRecord("light_sensitivity_value", str3, j6, j5, curTimeZoneOffsetInSecond, 0, false, (Continuation<? super List<? extends DailyRecordItem>>) c28481);
                if (limitedDataRecord == coroutine_suspended) {
                    return coroutine_suspended;
                }
                map2 = map;
                obj = limitedDataRecord;
                str5 = str4;
                sleepRepository4 = sleepRepository3;
                list3 = list2;
                j9 = j8;
                j10 = j7;
                Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<com.xiaomi.fit.fitness.export.data.item.LightValueItem>");
                list4 = (List) obj;
                mapCovertToMapByList = sleepRepository4.covertToMapByList(list4);
                DailyRecordDaoUtils dailyRecordDaoUtils2 = DailyRecordDaoUtils.INSTANCE;
                int curTimeZoneOffsetInSecond2 = sleepRepository4.getRepoMgr$fitness_data_core_chinaProductRelease().getCurTimeZoneOffsetInSecond();
                c28481.L$0 = sleepRepository4;
                c28481.L$1 = list3;
                c28481.L$2 = map2;
                c28481.L$3 = list4;
                c28481.L$4 = mapCovertToMapByList;
                c28481.J$0 = j10;
                c28481.J$1 = j9;
                c28481.label = 4;
                map3 = map2;
                list5 = list3;
                j11 = j10;
                j12 = j9;
                limitedDataRecord2 = dailyRecordDaoUtils2.getLimitedDataRecord("body_momentum", str5, j10, j9, curTimeZoneOffsetInSecond2, 0, false, (Continuation<? super List<? extends DailyRecordItem>>) c28481);
                if (limitedDataRecord2 == coroutine_suspended) {
                    return coroutine_suspended;
                }
                list6 = list4;
                obj = limitedDataRecord2;
                map4 = mapCovertToMapByList;
                list7 = list5;
                map5 = map3;
                j13 = j11;
            } else if (i2 == 3) {
                long j18 = c28481.J$1;
                long j19 = c28481.J$0;
                Map<String, ? extends List<? extends DailyRecordItem>> map6 = (Map) c28481.L$3;
                List list9 = (List) c28481.L$2;
                String str8 = (String) c28481.L$1;
                SleepRepository sleepRepository7 = (SleepRepository) c28481.L$0;
                ResultKt.throwOnFailure(obj);
                j9 = j18;
                sleepRepository4 = sleepRepository7;
                j10 = j19;
                str5 = str8;
                list3 = list9;
                map2 = map6;
                Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<com.xiaomi.fit.fitness.export.data.item.LightValueItem>");
                list4 = (List) obj;
                mapCovertToMapByList = sleepRepository4.covertToMapByList(list4);
                DailyRecordDaoUtils dailyRecordDaoUtils3 = DailyRecordDaoUtils.INSTANCE;
                int curTimeZoneOffsetInSecond3 = sleepRepository4.getRepoMgr$fitness_data_core_chinaProductRelease().getCurTimeZoneOffsetInSecond();
                c28481.L$0 = sleepRepository4;
                c28481.L$1 = list3;
                c28481.L$2 = map2;
                c28481.L$3 = list4;
                c28481.L$4 = mapCovertToMapByList;
                c28481.J$0 = j10;
                c28481.J$1 = j9;
                c28481.label = 4;
                map3 = map2;
                list5 = list3;
                j11 = j10;
                j12 = j9;
                limitedDataRecord2 = dailyRecordDaoUtils3.getLimitedDataRecord("body_momentum", str5, j10, j9, curTimeZoneOffsetInSecond3, 0, false, (Continuation<? super List<? extends DailyRecordItem>>) c28481);
                if (limitedDataRecord2 == coroutine_suspended) {
                    return coroutine_suspended;
                }
                list6 = list4;
                obj = limitedDataRecord2;
                map4 = mapCovertToMapByList;
                list7 = list5;
                map5 = map3;
                j13 = j11;
            } else {
                if (i2 != 4) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                long j20 = c28481.J$1;
                j13 = c28481.J$0;
                map4 = (Map) c28481.L$4;
                list6 = (List) c28481.L$3;
                map5 = (Map) c28481.L$2;
                list7 = (List) c28481.L$1;
                SleepRepository sleepRepository8 = (SleepRepository) c28481.L$0;
                ResultKt.throwOnFailure(obj);
                sleepRepository4 = sleepRepository8;
                j12 = j20;
            }
            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<com.xiaomi.fit.fitness.export.data.item.BodyMomentumItem>");
            List list10 = (List) obj;
            Map<Long, ? extends List<body>> mapCovertToMapByList2 = sleepRepository4.covertToMapByList(list10);
            listConvertToSleepSegmentList = sleepRepository4.sleepBiz.convertToSleepSegmentList(map5);
            FitnessDataUtils.INSTANCE.sleepSegmentToLocalTime(listConvertToSleepSegmentList);
            final Function2 function2 = new Function2() { // from class: jrm
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    return Integer.valueOf(SleepRepository.getSleepProjectReport$lambda$1((SleepSegmentReport) obj2, (SleepSegmentReport) obj3));
                }
            };
            Collections.sort(listConvertToSleepSegmentList, new Comparator() { // from class: krm
                @Override // java.util.Comparator
                public final int compare(Object obj2, Object obj3) {
                    return SleepRepository.getSleepProjectReport$lambda$2(function2, obj2, obj3);
                }
            });
            if (!list7.isEmpty() && list6.isEmpty() && list10.isEmpty() && listConvertToSleepSegmentList.isEmpty()) {
                return null;
            }
            SleepRepository sleepRepository9 = sleepRepository4;
            long j21 = j13;
            long j22 = j12;
            Map<Long, ? extends List<SleepSegmentReport>> mapCovertToMapByList3 = sleepRepository9.covertToMapByList(listConvertToSleepSegmentList, j21, j22);
            Map<Long, List<SleepBedTimeReport>> mapCovertToBedMapByList = sleepRepository9.covertToBedMapByList(listConvertToSleepSegmentList, j21, j22);
            Map<Long, List<SleepWakeTimeReport>> mapCovertToSleepTimeMapByList = sleepRepository9.covertToSleepTimeMapByList(listConvertToSleepSegmentList, j21, j22);
            SleepProjectReport sleepProjectReport = new SleepProjectReport(FitnessDateUtils.INSTANCE.changeZeroOfTheDay(j13));
            linkedHashMap = new LinkedHashMap();
            for (SleepDiaryReport sleepDiaryReport : list7) {
                linkedHashMap.put(Boxing.boxLong(FitnessDateUtils.INSTANCE.changeZeroOfTheDay(sleepDiaryReport.getTime())), sleepDiaryReport);
            }
            sleepProjectReport.setSleepDiaryInfoList(linkedHashMap);
            sleepProjectReport.setSleepReport(mapCovertToMapByList3);
            sleepProjectReport.setLightValueList(map4);
            sleepProjectReport.setBodyMomentumList(mapCovertToMapByList2);
            sleepProjectReport.setBedTimeReport(mapCovertToBedMapByList);
            sleepProjectReport.setSleepTimeReport(mapCovertToSleepTimeMapByList);
            return sleepProjectReport;
        }
        ResultKt.throwOnFailure(obj);
        ProjectDataRequest companion = ProjectDataRequest.INSTANCE.getInstance();
        c28481.L$0 = this;
        str2 = str;
        c28481.L$1 = str2;
        j3 = j;
        c28481.J$0 = j3;
        c28481.J$1 = j2;
        c28481.label = 1;
        sleepDiaryReportListSync = companion.getSleepDiaryReportListSync(j, j2, str, c28481);
        if (sleepDiaryReportListSync == coroutine_suspended) {
            return coroutine_suspended;
        }
        j4 = j2;
        sleepRepository = this;
        List list11 = (List) sleepDiaryReportListSync;
        DailyRecordDaoUtils dailyRecordDaoUtils4 = DailyRecordDaoUtils.INSTANCE;
        HomeDataType homeDataType = HomeDataType.SLEEP;
        int curTimeZoneOffsetInSecond4 = sleepRepository.getRepoMgr$fitness_data_core_chinaProductRelease().getCurTimeZoneOffsetInSecond();
        c28481.L$0 = sleepRepository;
        c28481.L$1 = str2;
        c28481.L$2 = list11;
        c28481.J$0 = j3;
        c28481.J$1 = j4;
        c28481.label = 2;
        SleepRepository sleepRepository10 = sleepRepository;
        long j23 = j4;
        long j24 = j3;
        Object limitedDataRecord3 = dailyRecordDaoUtils4.getLimitedDataRecord(homeDataType, str2, j3, j4, curTimeZoneOffsetInSecond4, 0, false, (Continuation<? super Map<String, ? extends List<? extends DailyRecordItem>>>) c28481);
        if (limitedDataRecord3 == coroutine_suspended) {
            return coroutine_suspended;
        }
        str3 = str2;
        obj = limitedDataRecord3;
        sleepRepository2 = sleepRepository10;
        list = list11;
        j5 = j23;
        j6 = j24;
        map = (Map) obj;
        DailyRecordDaoUtils dailyRecordDaoUtils5 = DailyRecordDaoUtils.INSTANCE;
        int curTimeZoneOffsetInSecond5 = sleepRepository2.getRepoMgr$fitness_data_core_chinaProductRelease().getCurTimeZoneOffsetInSecond();
        c28481.L$0 = sleepRepository2;
        c28481.L$1 = str3;
        c28481.L$2 = list;
        c28481.L$3 = map;
        c28481.J$0 = j6;
        c28481.J$1 = j5;
        c28481.label = 3;
        sleepRepository3 = sleepRepository2;
        list2 = list;
        str4 = str3;
        j7 = j6;
        j8 = j5;
        limitedDataRecord = dailyRecordDaoUtils5.getLimitedDataRecord("light_sensitivity_value", str3, j6, j5, curTimeZoneOffsetInSecond5, 0, false, (Continuation<? super List<? extends DailyRecordItem>>) c28481);
        if (limitedDataRecord == coroutine_suspended) {
            return coroutine_suspended;
        }
        map2 = map;
        obj = limitedDataRecord;
        str5 = str4;
        sleepRepository4 = sleepRepository3;
        list3 = list2;
        j9 = j8;
        j10 = j7;
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<com.xiaomi.fit.fitness.export.data.item.LightValueItem>");
        list4 = (List) obj;
        mapCovertToMapByList = sleepRepository4.covertToMapByList(list4);
        DailyRecordDaoUtils dailyRecordDaoUtils6 = DailyRecordDaoUtils.INSTANCE;
        int curTimeZoneOffsetInSecond6 = sleepRepository4.getRepoMgr$fitness_data_core_chinaProductRelease().getCurTimeZoneOffsetInSecond();
        c28481.L$0 = sleepRepository4;
        c28481.L$1 = list3;
        c28481.L$2 = map2;
        c28481.L$3 = list4;
        c28481.L$4 = mapCovertToMapByList;
        c28481.J$0 = j10;
        c28481.J$1 = j9;
        c28481.label = 4;
        map3 = map2;
        list5 = list3;
        j11 = j10;
        j12 = j9;
        limitedDataRecord2 = dailyRecordDaoUtils6.getLimitedDataRecord("body_momentum", str5, j10, j9, curTimeZoneOffsetInSecond6, 0, false, (Continuation<? super List<? extends DailyRecordItem>>) c28481);
        if (limitedDataRecord2 == coroutine_suspended) {
            return coroutine_suspended;
        }
        list6 = list4;
        obj = limitedDataRecord2;
        map4 = mapCovertToMapByList;
        list7 = list5;
        map5 = map3;
        j13 = j11;
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<com.xiaomi.fit.fitness.export.data.item.BodyMomentumItem>");
        List list12 = (List) obj;
        Map<Long, ? extends List<body>> mapCovertToMapByList4 = sleepRepository4.covertToMapByList(list12);
        listConvertToSleepSegmentList = sleepRepository4.sleepBiz.convertToSleepSegmentList(map5);
        FitnessDataUtils.INSTANCE.sleepSegmentToLocalTime(listConvertToSleepSegmentList);
        final Function2 function3 = new Function2() { // from class: jrm
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                return Integer.valueOf(SleepRepository.getSleepProjectReport$lambda$1((SleepSegmentReport) obj2, (SleepSegmentReport) obj3));
            }
        };
        Collections.sort(listConvertToSleepSegmentList, new Comparator() { // from class: krm
            @Override // java.util.Comparator
            public final int compare(Object obj2, Object obj3) {
                return SleepRepository.getSleepProjectReport$lambda$2(function3, obj2, obj3);
            }
        });
        if (!list7.isEmpty()) {
        }
        SleepRepository sleepRepository11 = sleepRepository4;
        long j25 = j13;
        long j26 = j12;
        Map<Long, ? extends List<SleepSegmentReport>> mapCovertToMapByList5 = sleepRepository11.covertToMapByList(listConvertToSleepSegmentList, j25, j26);
        Map<Long, List<SleepBedTimeReport>> mapCovertToBedMapByList2 = sleepRepository11.covertToBedMapByList(listConvertToSleepSegmentList, j25, j26);
        Map<Long, List<SleepWakeTimeReport>> mapCovertToSleepTimeMapByList2 = sleepRepository11.covertToSleepTimeMapByList(listConvertToSleepSegmentList, j25, j26);
        SleepProjectReport sleepProjectReport2 = new SleepProjectReport(FitnessDateUtils.INSTANCE.changeZeroOfTheDay(j13));
        linkedHashMap = new LinkedHashMap();
        while (r6.hasNext()) {
            linkedHashMap.put(Boxing.boxLong(FitnessDateUtils.INSTANCE.changeZeroOfTheDay(sleepDiaryReport.getTime())), sleepDiaryReport);
        }
        sleepProjectReport2.setSleepDiaryInfoList(linkedHashMap);
        sleepProjectReport2.setSleepReport(mapCovertToMapByList5);
        sleepProjectReport2.setLightValueList(map4);
        sleepProjectReport2.setBodyMomentumList(mapCovertToMapByList4);
        sleepProjectReport2.setBedTimeReport(mapCovertToBedMapByList2);
        sleepProjectReport2.setSleepTimeReport(mapCovertToSleepTimeMapByList2);
        return sleepProjectReport2;
    }

    @Override // com.xiaomi.fit.fitness.export.api.repository.ISleepRepository
    @NotNull
    public PagingSource<Long, SleepRhythmReport> getSleepRhyThmAllRecordPagingSource(@Nullable PagingSourceParams params) {
        return new SleepRhythmDataSource(params);
    }

    /* JADX WARN: Code duplicated, block: B:32:0x0128 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:33:0x0129  */
    /* JADX WARN: Code duplicated, block: B:37:0x0145  */
    /* JADX WARN: Code duplicated, block: B:39:0x0163  */
    /* JADX WARN: Code duplicated, block: B:45:0x017f  */
    /* JADX WARN: Code duplicated, block: B:51:0x01a8  */
    /* JADX WARN: Code duplicated, block: B:53:0x01c6  */
    /* JADX WARN: Code duplicated, block: B:55:0x01d8  */
    /* JADX WARN: Code duplicated, block: B:56:0x01da  */
    /* JADX WARN: Code duplicated, block: B:67:0x0207  */
    /* JADX WARN: Code duplicated, block: B:72:0x018b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    @Override // com.xiaomi.fit.fitness.export.api.repository.ISleepRepository
    @Nullable
    public Object getSleepRhythmAndDiaryRecordStatus(long j, long j2, int i, boolean z, @NotNull Continuation<? super Map<Long, Integer>> continuation) {
        C28491 c28491;
        int i2;
        Object sleepDiaryReportListSync$default;
        long j3;
        long j4;
        boolean z2;
        SleepRepository sleepRepository;
        Map map;
        int i3;
        SleepRepository sleepRepository2;
        boolean z3;
        long j5;
        long j6;
        Map map2;
        Object bodyMomentumList;
        Map map3;
        Map map4;
        ArrayList arrayList;
        ArrayList arrayList2;
        long jLongValue;
        Integer num;
        int i4;
        long jLongValue2;
        Integer num2;
        int i5;
        if (continuation instanceof C28491) {
            c28491 = (C28491) continuation;
            int i6 = c28491.label;
            if ((i6 & Integer.MIN_VALUE) != 0) {
                c28491.label = i6 - Integer.MIN_VALUE;
            } else {
                c28491 = new C28491(continuation);
            }
        } else {
            c28491 = new C28491(continuation);
        }
        Object obj = c28491.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = c28491.label;
        int i8 = 2;
        if (i7 != 0) {
            if (i7 == 1) {
                boolean z4 = c28491.Z$0;
                int i9 = c28491.I$0;
                long j7 = c28491.J$1;
                long j8 = c28491.J$0;
                SleepRepository sleepRepository3 = (SleepRepository) c28491.L$0;
                ResultKt.throwOnFailure(obj);
                j3 = j8;
                sleepRepository = sleepRepository3;
                j4 = j7;
                z2 = z4;
                sleepDiaryReportListSync$default = obj;
                i2 = i9;
            } else if (i7 == 2) {
                boolean z5 = c28491.Z$0;
                int i10 = c28491.I$0;
                long j9 = c28491.J$1;
                long j10 = c28491.J$0;
                Map map5 = (Map) c28491.L$1;
                sleepRepository2 = (SleepRepository) c28491.L$0;
                ResultKt.throwOnFailure(obj);
                map = map5;
                z3 = z5;
                i3 = i10;
                j5 = j9;
                j6 = j10;
                map2 = (Map) obj;
                ExtraDataRepository extraDataRepo = sleepRepository2.getExtraDataRepo();
                c28491.L$0 = map;
                c28491.L$1 = map2;
                c28491.label = 3;
                bodyMomentumList = extraDataRepo.getBodyMomentumList(j6, j5, i3, z3, c28491);
                if (bodyMomentumList == coroutine_suspended) {
                    return coroutine_suspended;
                }
                map3 = map2;
                obj = bodyMomentumList;
                map4 = map;
            } else {
                if (i7 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                map3 = (Map) c28491.L$1;
                map4 = (Map) c28491.L$0;
                ResultKt.throwOnFailure(obj);
            }
            Map map6 = (Map) obj;
            arrayList = new ArrayList(map3.size());
            for (Map.Entry entry : map3.entrySet()) {
                jLongValue2 = ((Number) entry.getKey()).longValue();
                if (!((Collection) entry.getValue()).isEmpty()) {
                    long jChangeZeroOfTheDay = FitnessDateUtils.INSTANCE.changeZeroOfTheDay(jLongValue2);
                    num2 = (Integer) map4.get(Boxing.boxLong(jChangeZeroOfTheDay));
                    if (num2 == null && num2.intValue() == 2) {
                        i5 = 3;
                    } else {
                        i5 = 1;
                    }
                    map4.put(Boxing.boxLong(jChangeZeroOfTheDay), Boxing.boxInt(i5));
                }
                arrayList.add(Unit.INSTANCE);
            }
            arrayList2 = new ArrayList(map6.size());
            for (Map.Entry entry2 : map6.entrySet()) {
                jLongValue = ((Number) entry2.getKey()).longValue();
                if (!((Collection) entry2.getValue()).isEmpty()) {
                    long jChangeZeroOfTheDay2 = FitnessDateUtils.INSTANCE.changeZeroOfTheDay(jLongValue);
                    num = (Integer) map4.get(Boxing.boxLong(jChangeZeroOfTheDay2));
                    if (num == null) {
                        i4 = 3;
                    } else {
                        i4 = 3;
                        if (num.intValue() != 3) {
                        }
                        arrayList2.add(Unit.INSTANCE);
                    }
                    Integer num3 = (Integer) map4.get(Boxing.boxLong(jChangeZeroOfTheDay2));
                    map4.put(Boxing.boxLong(jChangeZeroOfTheDay2), Boxing.boxInt((num3 != null && num3.intValue() == 2) ? i4 : 1));
                    arrayList2.add(Unit.INSTANCE);
                }
                arrayList2.add(Unit.INSTANCE);
            }
            return map4;
        }
        ResultKt.throwOnFailure(obj);
        ProjectDataRequest companion = ProjectDataRequest.INSTANCE.getInstance();
        c28491.L$0 = this;
        c28491.J$0 = j;
        c28491.J$1 = j2;
        i2 = i;
        c28491.I$0 = i2;
        c28491.Z$0 = z;
        c28491.label = 1;
        sleepDiaryReportListSync$default = ProjectDataRequest.getSleepDiaryReportListSync$default(companion, j, j2, null, c28491, 4, null);
        if (sleepDiaryReportListSync$default == coroutine_suspended) {
            return coroutine_suspended;
        }
        j3 = j;
        j4 = j2;
        z2 = z;
        sleepRepository = this;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator it = ((List) sleepDiaryReportListSync$default).iterator();
        while (it.hasNext()) {
            linkedHashMap.put(Boxing.boxLong(FitnessDateUtils.INSTANCE.changeZeroOfTheDay(((SleepDiaryReport) it.next()).getTime())), Boxing.boxInt(2));
            i8 = 2;
        }
        ExtraDataRepository extraDataRepo2 = sleepRepository.getExtraDataRepo();
        c28491.L$0 = sleepRepository;
        c28491.L$1 = linkedHashMap;
        c28491.J$0 = j3;
        c28491.J$1 = j4;
        c28491.I$0 = i2;
        c28491.Z$0 = z2;
        c28491.label = i8;
        map = linkedHashMap;
        boolean z6 = z2;
        SleepRepository sleepRepository4 = sleepRepository;
        long j11 = j4;
        long j12 = j3;
        Object lightValueList = extraDataRepo2.getLightValueList(j3, j4, i2, z6, c28491);
        if (lightValueList == coroutine_suspended) {
            return coroutine_suspended;
        }
        i3 = i2;
        obj = lightValueList;
        sleepRepository2 = sleepRepository4;
        z3 = z6;
        j5 = j11;
        j6 = j12;
        map2 = (Map) obj;
        ExtraDataRepository extraDataRepo3 = sleepRepository2.getExtraDataRepo();
        c28491.L$0 = map;
        c28491.L$1 = map2;
        c28491.label = 3;
        bodyMomentumList = extraDataRepo3.getBodyMomentumList(j6, j5, i3, z3, c28491);
        if (bodyMomentumList == coroutine_suspended) {
            return coroutine_suspended;
        }
        map3 = map2;
        obj = bodyMomentumList;
        map4 = map;
        Map map7 = (Map) obj;
        arrayList = new ArrayList(map3.size());
        while (r3.hasNext()) {
            jLongValue2 = ((Number) entry.getKey()).longValue();
            if (!((Collection) entry.getValue()).isEmpty()) {
                long jChangeZeroOfTheDay3 = FitnessDateUtils.INSTANCE.changeZeroOfTheDay(jLongValue2);
                num2 = (Integer) map4.get(Boxing.boxLong(jChangeZeroOfTheDay3));
                if (num2 == null) {
                    i5 = 1;
                } else {
                    i5 = 3;
                }
                map4.put(Boxing.boxLong(jChangeZeroOfTheDay3), Boxing.boxInt(i5));
            }
            arrayList.add(Unit.INSTANCE);
        }
        arrayList2 = new ArrayList(map7.size());
        while (r1.hasNext()) {
            jLongValue = ((Number) entry2.getKey()).longValue();
            if (!((Collection) entry2.getValue()).isEmpty()) {
                long jChangeZeroOfTheDay4 = FitnessDateUtils.INSTANCE.changeZeroOfTheDay(jLongValue);
                num = (Integer) map4.get(Boxing.boxLong(jChangeZeroOfTheDay4));
                if (num == null) {
                    i4 = 3;
                } else {
                    i4 = 3;
                    if (num.intValue() != 3) {
                    }
                    arrayList2.add(Unit.INSTANCE);
                }
                Integer num4 = (Integer) map4.get(Boxing.boxLong(jChangeZeroOfTheDay4));
                if (num4 != null) {
                    map4.put(Boxing.boxLong(jChangeZeroOfTheDay4), Boxing.boxInt((num4 != null && num4.intValue() == 2) ? i4 : 1));
                    arrayList2.add(Unit.INSTANCE);
                }
                map4.put(Boxing.boxLong(jChangeZeroOfTheDay4), Boxing.boxInt((num4 != null && num4.intValue() == 2) ? i4 : 1));
                arrayList2.add(Unit.INSTANCE);
            }
            arrayList2.add(Unit.INSTANCE);
        }
        return map4;
    }

    @Override // com.xiaomi.fit.fitness.export.api.repository.ISleepRepository
    @Nullable
    public Object getSleepRhythmRecords(long j, long j2, @NotNull Continuation<? super List<SleepRhythmReport>> continuation) {
        return ProjectDataRequest.getSleepRhyThmReportList$default(ProjectDataRequest.INSTANCE.getInstance(), j, j2, null, 4, null);
    }

    /* JADX WARN: Code duplicated, block: B:36:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:41:0x0116  */
    /* JADX WARN: Code duplicated, block: B:68:0x0122 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:70:0x00ec A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    @Override // com.xiaomi.fit.fitness.export.api.repository.ISleepRepository
    public boolean hasSleepSegmentExits(long startTime, long endTime) {
        Iterator<DailyRecordItem> it;
        LongRange longRange;
        long j = 1000;
        Map<String, List<DailyRecordItem>> allDailyRecord = getDbGetter().getAllDailyRecord(HomeDataType.SLEEP, null, TimeUtils.getBeginOfDate(startTime * j) / j, TimeUtils.INSTANCE.getEndOfDate(endTime * j) / j, FitnessDateUtils.getCurrentTZOffsetInSec());
        FitnessLogUtils.i(getTAG(), "hasSleepSegmentExits: start = " + startTime + ", end = " + endTime + ", itemMap = " + allDailyRecord);
        for (Map.Entry<String, List<DailyRecordItem>> entry : allDailyRecord.entrySet()) {
            String key = entry.getKey();
            List<DailyRecordItem> value = entry.getValue();
            int iHashCode = key.hashCode();
            if (iHashCode == -376109039) {
                if (key.equals(FitnessPersistKey.DaytimeSleep)) {
                    Intrinsics.checkNotNull(value, "null cannot be cast to non-null type kotlin.collections.List<com.xiaomi.fit.fitness.export.data.item.DayNightSleepReport>");
                    it = value.iterator();
                    while (it.hasNext()) {
                        DayNightSleepReport dayNightSleepReport = (DayNightSleepReport) it.next();
                        longRange = new LongRange(dayNightSleepReport.getBedTime(), dayNightSleepReport.getWakeUpTime());
                        long first = longRange.getFirst();
                        if (startTime <= longRange.getLast()) {
                            long first2 = longRange.getFirst();
                            if (endTime <= longRange.getLast()) {
                            }
                        } else {
                            long first3 = longRange.getFirst();
                            if (endTime <= longRange.getLast()) {
                            }
                        }
                        return true;
                    }
                }
                continue;
            } else if (iHashCode != 109522647) {
                if (iHashCode == 1878059136 && key.equals(FitnessPersistKey.NightSleep)) {
                    Intrinsics.checkNotNull(value, "null cannot be cast to non-null type kotlin.collections.List<com.xiaomi.fit.fitness.export.data.item.DayNightSleepReport>");
                    it = value.iterator();
                    while (it.hasNext()) {
                        DayNightSleepReport dayNightSleepReport2 = (DayNightSleepReport) it.next();
                        longRange = new LongRange(dayNightSleepReport2.getBedTime(), dayNightSleepReport2.getWakeUpTime());
                        long first4 = longRange.getFirst();
                        if (startTime <= longRange.getLast() || first4 > startTime) {
                            long first5 = longRange.getFirst();
                            if (endTime <= longRange.getLast() || first5 > endTime) {
                            }
                        }
                        return true;
                    }
                }
            } else {
                if (key.equals("sleep")) {
                    Intrinsics.checkNotNull(value, "null cannot be cast to non-null type kotlin.collections.List<com.xiaomi.fit.fitness.export.data.item.SleepSegmentReport>");
                    Iterator<DailyRecordItem> it2 = value.iterator();
                    while (it2.hasNext()) {
                        SleepSegmentReport sleepSegmentReport = (SleepSegmentReport) it2.next();
                        LongRange longRange2 = new LongRange(sleepSegmentReport.getBedTime(), sleepSegmentReport.getWakeupTime());
                        long first6 = longRange2.getFirst();
                        if (startTime > longRange2.getLast() || first6 > startTime) {
                            long first7 = longRange2.getFirst();
                            if (endTime > longRange2.getLast() || first7 > endTime) {
                            }
                        }
                        return true;
                    }
                }
                continue;
            }
        }
        return false;
    }

    @Override // com.xiaomi.fitness.repo.BaseRepository
    public /* bridge */ /* synthetic */ DailyBasicReport mergeTargetReport(String str, String str2, long j, List list) {
        return mergeTargetReport(str, str2, j, (List<AllDaySleepReport>) list);
    }

    @Override // com.xiaomi.fit.fitness.export.api.repository.ISleepRepository
    public void pullSleepAnimalAsync() {
        SleepStatDataRequest.INSTANCE.getInstance().pullSleepAnimalData();
    }

    @Override // com.xiaomi.fit.fitness.export.api.repository.ISleepRepository
    @Nullable
    public Object triggerComputeSleepAnimal(@NotNull Continuation<? super SleepAnimalReport> continuation) {
        return SleepStatDataRequest.INSTANCE.getInstance().triggerComputeSleepAnimal(continuation);
    }

    @Override // com.xiaomi.fitness.repo.BaseRepository, com.xiaomi.fit.fitness.export.api.repository.IRepository
    @Nullable
    public AllDaySleepReport getReport(@Nullable String sid, long time) {
        return (AllDaySleepReport) FitnessDailyReportDaoProxy.INSTANCE.queryDailyReportEntitySync(getDataType(), time);
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0065, code lost:
    
        if (r5.equals("weeks") == false) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0081, code lost:
    
        if (r5.equals("months") == false) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x008f, code lost:
    
        return com.xiaomi.fitness.repo.sleep.utils.DaySleepReportUtils.INSTANCE.computeWeeklySleepReport(r8, r6, r5);
     */
    @Override // com.xiaomi.fitness.repo.BaseRepository
    @org.jetbrains.annotations.NotNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public com.xiaomi.fit.fitness.export.data.aggregation.AllDaySleepReport mergeTargetReport(@org.jetbrains.annotations.Nullable java.lang.String r4, @org.jetbrains.annotations.NotNull java.lang.String r5, long r6, @org.jetbrains.annotations.NotNull java.util.List<com.xiaomi.fit.fitness.export.data.aggregation.AllDaySleepReport> r8) throws java.lang.InterruptedException {
        /*
            r3 = this;
            java.lang.String r4 = "viewTag"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r4)
            java.lang.String r4 = "srcReportList"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r4)
            r4 = r8
            java.util.Collection r4 = (java.util.Collection) r4
            boolean r4 = r4.isEmpty()
            if (r4 == 0) goto L19
            com.xiaomi.fit.fitness.export.data.aggregation.AllDaySleepReport r4 = new com.xiaomi.fit.fitness.export.data.aggregation.AllDaySleepReport
            r4.<init>(r6, r5)
            return r4
        L19:
            java.util.Iterator r4 = r8.iterator()
        L1d:
            boolean r0 = r4.hasNext()
            java.lang.String r1 = "days"
            if (r0 == 0) goto L4b
            java.lang.Object r0 = r4.next()
            com.xiaomi.fit.fitness.export.data.aggregation.AllDaySleepReport r0 = (com.xiaomi.fit.fitness.export.data.aggregation.AllDaySleepReport) r0
            java.util.List r2 = r0.getSleepSegments()
            java.util.Collection r2 = (java.util.Collection) r2
            if (r2 == 0) goto L1d
            boolean r2 = r2.isEmpty()
            if (r2 == 0) goto L3a
            goto L1d
        L3a:
            com.xiaomi.fitness.repo.sleep.SleepBiz r2 = r3.sleepBiz
            java.util.List r0 = r0.getSleepSegments()
            kotlin.jvm.internal.Intrinsics.checkNotNull(r0)
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual(r5, r1)
            r2.getSleepSegAssistInfo(r0, r1)
            goto L1d
        L4b:
            int r4 = r5.hashCode()
            r0 = -1068487181(0xffffffffc0502df3, float:-3.2528045)
            if (r4 == r0) goto L7b
            r0 = 3076183(0x2ef057, float:4.31065E-39)
            if (r4 == r0) goto L68
            r0 = 113008383(0x6bc5eff, float:7.0857324E-35)
            if (r4 == r0) goto L5f
            goto L83
        L5f:
            java.lang.String r4 = "weeks"
            boolean r4 = r5.equals(r4)
            if (r4 != 0) goto L89
            goto L83
        L68:
            boolean r4 = r5.equals(r1)
            if (r4 == 0) goto L83
            r4 = 0
            java.lang.Object r4 = r8.get(r4)
            com.xiaomi.fit.fitness.export.data.aggregation.AllDaySleepReport r4 = (com.xiaomi.fit.fitness.export.data.aggregation.AllDaySleepReport) r4
            com.xiaomi.fitness.repo.sleep.SleepBiz r5 = r3.sleepBiz
            r5.checkSleepDailyReportUpgrade(r4)
            return r4
        L7b:
            java.lang.String r4 = "months"
            boolean r4 = r5.equals(r4)
            if (r4 != 0) goto L89
        L83:
            com.xiaomi.fit.fitness.export.data.aggregation.AllDaySleepReport r4 = new com.xiaomi.fit.fitness.export.data.aggregation.AllDaySleepReport
            r4.<init>(r6, r5)
            return r4
        L89:
            com.xiaomi.fitness.repo.sleep.utils.DaySleepReportUtils r4 = com.xiaomi.fitness.repo.sleep.utils.DaySleepReportUtils.INSTANCE
            com.xiaomi.fit.fitness.export.data.aggregation.AllDaySleepReport r4 = r4.computeWeeklySleepReport(r8, r6, r5)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xiaomi.fitness.repo.sleep.SleepRepository.mergeTargetReport(java.lang.String, java.lang.String, long, java.util.List):com.xiaomi.fit.fitness.export.data.aggregation.AllDaySleepReport");
    }

    private final <T extends DailyRecordItem> Map<Long, List<T>> covertToMapByList(List<? extends T> itemList, long startTime, long endTime) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (itemList != null) {
            Iterator<T> it = itemList.iterator();
            while (it.hasNext()) {
                DailyRecordItem dailyRecordItem = (DailyRecordItem) it.next();
                long jChangeZeroOfTheDay = FitnessDateUtils.INSTANCE.changeZeroOfTheDay(dailyRecordItem.getTimestamp());
                if (startTime <= jChangeZeroOfTheDay && jChangeZeroOfTheDay <= endTime) {
                    List arrayList = (List) linkedHashMap.get(Long.valueOf(jChangeZeroOfTheDay));
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                        linkedHashMap.put(Long.valueOf(jChangeZeroOfTheDay), arrayList);
                    }
                    ListExtKt.add(arrayList, dailyRecordItem);
                }
            }
        }
        return linkedHashMap;
    }
}
