package com.xiaomi.fitness.aggregation.health.dao;

import android.database.sqlite.SQLiteConstraintException;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.Transformations;
import com.xiaomi.fit.data.common.log.FitnessLogUtils;
import com.xiaomi.fit.data.common.util.FitnessDateUtils;
import com.xiaomi.fit.fitness.export.data.aggregation.DailyBasicReport;
import com.xiaomi.fit.fitness.export.data.annotation.HomeDataType;
import com.xiaomi.fit.fitness.export.data.annotation.HomeDataTypeKt;
import com.xiaomi.fit.fitness.export.data.item.RedDotItem;
import com.xiaomi.fit.fitness.parser.sport.base.SportReportBaseParser;
import com.xiaomi.fit.fitness.persist.db.utils.DailyRecordDaoUtils;
import com.xiaomi.fit.fitness.persist.utils.FitnessPersistUtils;
import com.xiaomi.fitness.aggregation.db.FitnessSummaryDatabase;
import com.xiaomi.fitness.aggregation.health.dao.FitnessDailyReportDaoProxy;
import com.xiaomi.fitness.aggregation.health.entity.CloudContract;
import com.xiaomi.fitness.aggregation.health.entity.FitnessDailyReportEntity;
import com.xiaomi.fitness.aggregation.health.entity.FitnessDeviceItemEntity;
import com.xiaomi.fitness.aggregation.health.entity.RedDotEntity;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.statistics.StatConstants;
import defpackage.gmf;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010!\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\f\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J)\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0012\u0010\u000e\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00100\u000f\"\u00020\u0010H\u0007¢\u0006\u0002\u0010\u0011J\u001e\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014H\u0002J\u001e\u0010\u0016\u001a\u00020\u000b2\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00150\u00142\u0006\u0010\u0018\u001a\u00020\u0019H\u0002J\u001e\u0010\u001a\u001a\u00020\u000b2\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00150\u00142\u0006\u0010\u0018\u001a\u00020\u0019H\u0002J\u001c\u0010\u001c\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00190\u001eJ0\u0010\u001f\u001a\b\u0012\u0004\u0012\u0002H!0 \"\b\b\u0000\u0010!*\u00020\u00102\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\"\u001a\u00020\u00192\b\b\u0002\u0010#\u001a\u00020$J'\u0010%\u001a\u0004\u0018\u0001H!\"\b\b\u0000\u0010!*\u00020\u00102\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\"\u001a\u00020\u0019¢\u0006\u0002\u0010&J.\u0010'\u001a\b\u0012\u0004\u0012\u0002H!0\u0014\"\b\b\u0000\u0010!*\u00020\u00102\u0006\u0010\f\u001a\u00020\r2\u0006\u0010(\u001a\u00020\u00192\u0006\u0010)\u001a\u00020\u0019J:\u0010*\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H!0\u00140+\"\b\b\u0000\u0010!*\u00020\u00102\u0006\u0010\f\u001a\u00020\r2\f\u0010,\u001a\b\u0012\u0004\u0012\u00020\u00190\u00142\u0006\u0010-\u001a\u00020.JJ\u0010/\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H!0\u00140+\"\b\b\u0000\u0010!*\u00020\u00102\n\b\u0002\u00100\u001a\u0004\u0018\u00010\u00052\u0006\u0010\f\u001a\u00020\r2\u0006\u00101\u001a\u00020\u00192\u0006\u00102\u001a\u00020\u00192\b\b\u0002\u0010#\u001a\u00020$J)\u00103\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u00104\u001a\u00020\u00192\n\b\u0002\u00105\u001a\u0004\u0018\u00010\u0019H\u0002¢\u0006\u0002\u00106J \u00107\u001a\u00020\u00152\u0006\u0010\f\u001a\u00020\r2\u0006\u00108\u001a\u00020\u00102\u0006\u0010\u0018\u001a\u00020\u0019H\u0002J$\u00109\u001a\b\u0012\u0004\u0012\u00020\u00100\u00142\u0006\u0010\f\u001a\u00020\r2\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082D¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\u00020\u00078BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\t¨\u0006:"}, d2 = {"Lcom/xiaomi/fitness/aggregation/health/dao/FitnessDailyReportDaoProxy;", "", "<init>", "()V", "TAG", "", "dao", "Lcom/xiaomi/fitness/aggregation/health/dao/FitnessDailyReportDao;", "getDao", "()Lcom/xiaomi/fitness/aggregation/health/dao/FitnessDailyReportDao;", "insert", "", "dataType", "Lcom/xiaomi/fit/fitness/export/data/annotation/HomeDataType;", "reports", "", "Lcom/xiaomi/fit/fitness/export/data/aggregation/DailyBasicReport;", "(Lcom/xiaomi/fit/fitness/export/data/annotation/HomeDataType;[Lcom/xiaomi/fit/fitness/export/data/aggregation/DailyBasicReport;)V", "deleteRedDotIfNeed", "deleteList", "", "Lcom/xiaomi/fitness/aggregation/health/entity/FitnessDailyReportEntity;", "insertInfoRedDotIfNeed", "insertList", "updateTime", "", "insertDeviceItemIfNeed", "entityList", "delete", "emptyDateList", "", "queryDailyReportEntity", "Landroidx/lifecycle/LiveData;", "R", "timeInSecond", "syncNet", "", "queryDailyReportEntitySync", "(Lcom/xiaomi/fit/fitness/export/data/annotation/HomeDataType;J)Lcom/xiaomi/fit/fitness/export/data/aggregation/DailyBasicReport;", "queryDailyReportListSync", "beginInSecond", "endInSecond", "queryDailyReportList", "Lkotlinx/coroutines/flow/Flow;", "timeList", CloudContract.COL_ZONE_OFFSET, "", "queryDailyReportEntityList", "sid", "begin", StatConstants.PARAM_END, "doRequestFromServer", "startTime", "endTime", "(Lcom/xiaomi/fit/fitness/export/data/annotation/HomeDataType;JLjava/lang/Long;)V", "toEntity", "report", "toReportList", "fitness-data-core_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nFitnessDailyReportDaoProxy.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FitnessDailyReportDaoProxy.kt\ncom/xiaomi/fitness/aggregation/health/dao/FitnessDailyReportDaoProxy\n+ 2 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 5 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 6 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n+ 7 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt\n*L\n1#1,298:1\n37#2:299\n36#2,3:300\n1#3:303\n1557#4:304\n1628#4,3:305\n1863#4,2:308\n53#5:310\n55#5:314\n53#5:315\n55#5:319\n50#6:311\n55#6:313\n50#6:316\n55#6:318\n107#7:312\n107#7:317\n*S KotlinDebug\n*F\n+ 1 FitnessDailyReportDaoProxy.kt\ncom/xiaomi/fitness/aggregation/health/dao/FitnessDailyReportDaoProxy\n*L\n53#1:299\n53#1:300,3\n200#1:304\n200#1:305,3\n212#1:308,2\n217#1:310\n217#1:314\n250#1:315\n250#1:319\n217#1:311\n217#1:313\n250#1:316\n250#1:318\n217#1:312\n250#1:317\n*E\n"})
public final class FitnessDailyReportDaoProxy {

    @NotNull
    public static final FitnessDailyReportDaoProxy INSTANCE = new FitnessDailyReportDaoProxy();

    @NotNull
    private static final String TAG = "DailyReportDao";

    private FitnessDailyReportDaoProxy() {
    }

    private final void deleteRedDotIfNeed(HomeDataType dataType, List<FitnessDailyReportEntity> deleteList) {
        ArrayList arrayList = new ArrayList();
        Iterator<FitnessDailyReportEntity> it = deleteList.iterator();
        while (it.hasNext()) {
            arrayList.add(Long.valueOf(it.next().getTimeInZero()));
        }
        RedDotDaoProxy.INSTANCE.updateDelete(dataType, arrayList);
    }

    private final void doRequestFromServer(HomeDataType dataType, long startTime, Long endTime) {
        DailyRecordDaoUtils.INSTANCE.requestFromServer(dataType, startTime, endTime);
    }

    public static /* synthetic */ void doRequestFromServer$default(FitnessDailyReportDaoProxy fitnessDailyReportDaoProxy, HomeDataType homeDataType, long j, Long l, int i, Object obj) {
        if ((i & 4) != 0) {
            l = null;
        }
        fitnessDailyReportDaoProxy.doRequestFromServer(homeDataType, j, l);
    }

    private final FitnessDailyReportDao getDao() {
        return FitnessSummaryDatabase.INSTANCE.getInstance().getFitnessDailyReportDao();
    }

    private final void insertDeviceItemIfNeed(List<FitnessDailyReportEntity> entityList, long updateTime) {
        ArrayList arrayList = new ArrayList();
        for (FitnessDailyReportEntity fitnessDailyReportEntity : entityList) {
            HomeDataType dataType = fitnessDailyReportEntity.getDataType();
            if (HomeDataTypeKt.needCareSid(dataType)) {
                arrayList.add(new FitnessDeviceItemEntity(fitnessDailyReportEntity.getSid(), dataType, updateTime, fitnessDailyReportEntity.getTimeInZero()));
            }
        }
        if (!arrayList.isEmpty()) {
            FitnessLogUtils.i(TAG, "insertDeviceItemIfNeed: " + arrayList);
            FitnessDevicesListProxy.INSTANCE.insert(arrayList);
        }
    }

    private final void insertInfoRedDotIfNeed(List<FitnessDailyReportEntity> insertList, long updateTime) {
        ArrayList arrayList = new ArrayList();
        for (FitnessDailyReportEntity fitnessDailyReportEntity : insertList) {
            arrayList.add(new RedDotEntity("default", fitnessDailyReportEntity.getDataType(), updateTime, fitnessDailyReportEntity.getTimeInZero()));
        }
        RedDotDaoProxy.INSTANCE.insert(arrayList);
    }

    public static /* synthetic */ LiveData queryDailyReportEntity$default(FitnessDailyReportDaoProxy fitnessDailyReportDaoProxy, HomeDataType homeDataType, long j, boolean z, int i, Object obj) {
        if ((i & 4) != 0) {
            z = true;
        }
        return fitnessDailyReportDaoProxy.queryDailyReportEntity(homeDataType, j, z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit queryDailyReportEntity$lambda$1$lambda$0(gmf this_apply, FitnessDailyReportEntity fitnessDailyReportEntity) {
        Intrinsics.checkNotNullParameter(this_apply, "$this_apply");
        if (fitnessDailyReportEntity != null) {
            this_apply.setValue(fitnessDailyReportEntity);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DailyBasicReport queryDailyReportEntity$lambda$3(HomeDataType dataType, long j, FitnessDailyReportEntity entity) {
        Intrinsics.checkNotNullParameter(dataType, "$dataType");
        Intrinsics.checkNotNullParameter(entity, "entity");
        FitnessLogUtils.i(TAG, "queryEntity: dataType = " + dataType + ", time = " + j + ", entity = " + entity);
        DailyBasicReport report = FitnessDailyReportDaoUtil.INSTANCE.toReport(dataType, entity);
        Intrinsics.checkNotNull(report, "null cannot be cast to non-null type R of com.xiaomi.fitness.aggregation.health.dao.FitnessDailyReportDaoProxy.queryDailyReportEntity$lambda$3$lambda$2");
        return report;
    }

    private final FitnessDailyReportEntity toEntity(HomeDataType dataType, DailyBasicReport report, long updateTime) {
        report.setTimeInZero(null);
        report.setUpdateTime(null);
        String json = FitnessPersistUtils.INSTANCE.toJson(report, FitnessDailyUtil.INSTANCE.getReportClass(dataType));
        String sid = report.getSid();
        if (sid == null) {
            sid = "default";
        }
        return new FitnessDailyReportEntity(sid, dataType, updateTime, report.getTime(), report.getTag(), json);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final List<DailyBasicReport> toReportList(HomeDataType dataType, List<FitnessDailyReportEntity> entityList) {
        ArrayList arrayList = new ArrayList();
        Iterator<FitnessDailyReportEntity> it = entityList.iterator();
        while (it.hasNext()) {
            DailyBasicReport report = FitnessDailyReportDaoUtil.INSTANCE.toReport(dataType, it.next());
            FitnessLogUtils.i(TAG, "toReportList: " + report.simpleInfo());
            if (!report.isEmpty()) {
                arrayList.add(report);
            }
        }
        return arrayList;
    }

    public final void delete(@NotNull HomeDataType dataType, @NotNull List<Long> emptyDateList) {
        Intrinsics.checkNotNullParameter(dataType, "dataType");
        Intrinsics.checkNotNullParameter(emptyDateList, "emptyDateList");
        if (HomeDataTypeKt.canDeleteData(dataType)) {
            ArrayList arrayList = new ArrayList();
            Iterator<Long> it = emptyDateList.iterator();
            while (it.hasNext()) {
                arrayList.add(new RedDotItem(dataType, it.next().longValue(), 0L, 4, null));
            }
            getDao().delete(dataType, emptyDateList);
            RedDotDaoProxy.INSTANCE.updateDelete(dataType, emptyDateList);
            if (HomeDataTypeKt.needCareSid(dataType)) {
                FitnessDevicesListProxy.INSTANCE.delete(dataType, emptyDateList);
            }
        }
    }

    public final void insert(@NotNull HomeDataType dataType, @NotNull DailyBasicReport... reports) {
        Intrinsics.checkNotNullParameter(dataType, "dataType");
        Intrinsics.checkNotNullParameter(reports, "reports");
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        long jCurrentTimeMillis = System.currentTimeMillis();
        for (DailyBasicReport dailyBasicReport : reports) {
            FitnessDailyReportEntity entity = toEntity(dataType, dailyBasicReport, jCurrentTimeMillis);
            if (dailyBasicReport.isEmpty()) {
                arrayList2.add(entity);
            } else {
                arrayList.add(entity);
            }
        }
        try {
            if (HomeDataTypeKt.needSaveDailyReport(dataType)) {
                FitnessDailyReportDao dao = getDao();
                FitnessDailyReportEntity[] fitnessDailyReportEntityArr = (FitnessDailyReportEntity[]) arrayList.toArray(new FitnessDailyReportEntity[0]);
                dao.insert((FitnessDailyReportEntity[]) Arrays.copyOf(fitnessDailyReportEntityArr, fitnessDailyReportEntityArr.length));
            }
            insertDeviceItemIfNeed(arrayList, jCurrentTimeMillis);
            insertInfoRedDotIfNeed(arrayList, jCurrentTimeMillis);
        } catch (SQLiteConstraintException e) {
            Logger.i("insertInfoDailyBasicReport", "error " + e);
        }
        if (HomeDataTypeKt.canDeleteData(dataType)) {
            for (FitnessDailyReportEntity fitnessDailyReportEntity : arrayList2) {
                getDao().delete(fitnessDailyReportEntity.getDataType(), fitnessDailyReportEntity.getSid(), fitnessDailyReportEntity.getTimeInZero(), fitnessDailyReportEntity.getViewTag());
            }
            deleteRedDotIfNeed(dataType, arrayList2);
        }
    }

    @NotNull
    public final <R extends DailyBasicReport> LiveData<R> queryDailyReportEntity(@NotNull final HomeDataType dataType, final long timeInSecond, boolean syncNet) {
        Intrinsics.checkNotNullParameter(dataType, "dataType");
        long jNormalizeTime = TimeZoneUtil.INSTANCE.normalizeTime(timeInSecond);
        FitnessLogUtils.i(TAG, ">> queryEntity: dataType = " + dataType + ", time = " + timeInSecond);
        LiveData<FitnessDailyReportEntity> liveDataQueryDailyReportEntity = getDao().queryDailyReportEntity(dataType, jNormalizeTime);
        if (syncNet) {
            doRequestFromServer$default(this, dataType, jNormalizeTime, null, 4, null);
        }
        final gmf gmfVar = new gmf();
        gmfVar.addSource(liveDataQueryDailyReportEntity, new FitnessDailyReportDaoProxy$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: zo9
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return FitnessDailyReportDaoProxy.queryDailyReportEntity$lambda$1$lambda$0(gmfVar, (FitnessDailyReportEntity) obj);
            }
        }));
        return Transformations.map(gmfVar, new Function1() { // from class: ap9
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return FitnessDailyReportDaoProxy.queryDailyReportEntity$lambda$3(dataType, timeInSecond, (FitnessDailyReportEntity) obj);
            }
        });
    }

    @NotNull
    public final <R extends DailyBasicReport> Flow<List<R>> queryDailyReportEntityList(@Nullable String sid, @NotNull final HomeDataType dataType, final long begin, final long end, boolean syncNet) {
        Flow<List<FitnessDailyReportEntity>> flowQueryDailyReportEntityList;
        Intrinsics.checkNotNullParameter(dataType, "dataType");
        Pair<Long, Long> pairNormalizeTime = TimeZoneUtil.INSTANCE.normalizeTime(begin, end);
        long jLongValue = pairNormalizeTime.getFirst().longValue();
        long jLongValue2 = pairNormalizeTime.getSecond().longValue();
        FitnessLogUtils.i(TAG, ">> queryDailyList: dataType = " + dataType + ", begin = " + begin + ", end = " + end + ", realStart = " + jLongValue + ", realEnd = " + jLongValue2);
        if (HomeDataTypeKt.needCareSid(dataType)) {
            FitnessDailyReportDao dao = getDao();
            Intrinsics.checkNotNull(sid);
            flowQueryDailyReportEntityList = dao.queryDailyReportEntityListBySid(sid, dataType, jLongValue, jLongValue2);
        } else {
            flowQueryDailyReportEntityList = getDao().queryDailyReportEntityList(dataType, jLongValue, jLongValue2);
        }
        final Flow<List<FitnessDailyReportEntity>> flow = flowQueryDailyReportEntityList;
        if (syncNet) {
            doRequestFromServer(dataType, jLongValue, Long.valueOf(jLongValue2));
        }
        return (Flow<List<R>>) new Flow<List<? extends R>>() { // from class: com.xiaomi.fitness.aggregation.health.dao.FitnessDailyReportDaoProxy$queryDailyReportEntityList$$inlined$map$1

            /* JADX INFO: renamed from: com.xiaomi.fitness.aggregation.health.dao.FitnessDailyReportDaoProxy$queryDailyReportEntityList$$inlined$map$1$2, reason: invalid class name */
            @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u00032\u0006\u0010\u0004\u001a\u0002H\u0002H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"<anonymous>", "", "T", "R", "value", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1", "kotlinx/coroutines/flow/FlowKt__TransformKt$map$$inlined$unsafeTransform$1$2"}, k = 3, mv = {2, 0, 0}, xi = 48)
            @SourceDebugExtension({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 FitnessDailyReportDaoProxy.kt\ncom/xiaomi/fitness/aggregation/health/dao/FitnessDailyReportDaoProxy\n*L\n1#1,222:1\n54#2:223\n252#3,2:224\n251#3,9:226\n*E\n"})
            public static final class AnonymousClass2<T> implements FlowCollector {
                final /* synthetic */ long $begin$inlined;
                final /* synthetic */ HomeDataType $dataType$inlined;
                final /* synthetic */ long $end$inlined;
                final /* synthetic */ FlowCollector $this_unsafeFlow;

                /* JADX INFO: renamed from: com.xiaomi.fitness.aggregation.health.dao.FitnessDailyReportDaoProxy$queryDailyReportEntityList$$inlined$map$1$2$1, reason: invalid class name */
                @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
                @DebugMetadata(c = "com.xiaomi.fitness.aggregation.health.dao.FitnessDailyReportDaoProxy$queryDailyReportEntityList$$inlined$map$1$2", f = "FitnessDailyReportDaoProxy.kt", i = {}, l = {SportReportBaseParser.ReportType.targetValueNumber}, m = "emit", n = {}, s = {})
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

                public AnonymousClass2(FlowCollector flowCollector, HomeDataType homeDataType, long j, long j2) {
                    this.$this_unsafeFlow = flowCollector;
                    this.$dataType$inlined = homeDataType;
                    this.$begin$inlined = j;
                    this.$end$inlined = j2;
                }

                /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                @Override // kotlinx.coroutines.flow.FlowCollector
                @Nullable
                public final Object emit(Object obj, @NotNull Continuation continuation) {
                    AnonymousClass1 anonymousClass1;
                    List reportList;
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
                        List list = (List) obj;
                        FitnessLogUtils.i(FitnessDailyReportDaoProxy.TAG, "queryDailyList:dataType = " + this.$dataType$inlined + ",  begin = " + this.$begin$inlined + ", end = " + this.$end$inlined + ", size = " + list.size());
                        if (list.isEmpty()) {
                            reportList = CollectionsKt__CollectionsKt.emptyList();
                        } else {
                            reportList = FitnessDailyReportDaoProxy.INSTANCE.toReportList(this.$dataType$inlined, list);
                            Intrinsics.checkNotNull(reportList, "null cannot be cast to non-null type kotlin.collections.List<R of com.xiaomi.fitness.aggregation.health.dao.FitnessDailyReportDaoProxy.queryDailyReportEntityList$lambda$8>");
                        }
                        anonymousClass1.label = 1;
                        if (flowCollector.emit(reportList, anonymousClass1) == coroutine_suspended) {
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
                Object objCollect = flow.collect(new AnonymousClass2(flowCollector, dataType, begin, end), continuation);
                return objCollect == IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
            }
        };
    }

    @Nullable
    public final <R extends DailyBasicReport> R queryDailyReportEntitySync(@NotNull HomeDataType dataType, long timeInSecond) {
        Intrinsics.checkNotNullParameter(dataType, "dataType");
        FitnessDailyReportEntity fitnessDailyReportEntityQueryDailyReportEntitySync = getDao().queryDailyReportEntitySync(dataType, TimeZoneUtil.INSTANCE.normalizeTime(timeInSecond));
        FitnessLogUtils.i(TAG, ">> queryDailyReportEntitySync: dataType = " + dataType + ", time = " + timeInSecond + ", entity = " + fitnessDailyReportEntityQueryDailyReportEntitySync);
        if (fitnessDailyReportEntityQueryDailyReportEntitySync == null) {
            return null;
        }
        R r2 = (R) FitnessDailyReportDaoUtil.INSTANCE.toReport(dataType, fitnessDailyReportEntityQueryDailyReportEntitySync);
        Intrinsics.checkNotNull(r2, "null cannot be cast to non-null type R of com.xiaomi.fitness.aggregation.health.dao.FitnessDailyReportDaoProxy.queryDailyReportEntitySync$lambda$4");
        return r2;
    }

    @NotNull
    public final <R extends DailyBasicReport> Flow<List<R>> queryDailyReportList(@NotNull final HomeDataType dataType, @NotNull final List<Long> timeList, final int zoneOffset) {
        Intrinsics.checkNotNullParameter(dataType, "dataType");
        Intrinsics.checkNotNullParameter(timeList, "timeList");
        final ArrayList arrayList = new ArrayList();
        Iterator<T> it = timeList.iterator();
        while (it.hasNext()) {
            arrayList.add(Long.valueOf(FitnessDateUtils.INSTANCE.changeTo0TimeIn0TzOneDay(((Number) it.next()).longValue(), zoneOffset)));
        }
        final Flow<List<FitnessDailyReportEntity>> flowQueryDailyReportEntityList = getDao().queryDailyReportEntityList(dataType, arrayList);
        return (Flow<List<R>>) new Flow<List<? extends R>>() { // from class: com.xiaomi.fitness.aggregation.health.dao.FitnessDailyReportDaoProxy$queryDailyReportList$$inlined$map$1

            /* JADX INFO: renamed from: com.xiaomi.fitness.aggregation.health.dao.FitnessDailyReportDaoProxy$queryDailyReportList$$inlined$map$1$2, reason: invalid class name */
            @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u00032\u0006\u0010\u0004\u001a\u0002H\u0002H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"<anonymous>", "", "T", "R", "value", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1", "kotlinx/coroutines/flow/FlowKt__TransformKt$map$$inlined$unsafeTransform$1$2"}, k = 3, mv = {2, 0, 0}, xi = 48)
            @SourceDebugExtension({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 FitnessDailyReportDaoProxy.kt\ncom/xiaomi/fitness/aggregation/health/dao/FitnessDailyReportDaoProxy\n*L\n1#1,222:1\n54#2:223\n219#3:224\n218#3,4:225\n*E\n"})
            public static final class AnonymousClass2<T> implements FlowCollector {
                final /* synthetic */ List $daoTimeList$inlined;
                final /* synthetic */ HomeDataType $dataType$inlined;
                final /* synthetic */ FlowCollector $this_unsafeFlow;
                final /* synthetic */ List $timeList$inlined;
                final /* synthetic */ int $zoneOffset$inlined;

                /* JADX INFO: renamed from: com.xiaomi.fitness.aggregation.health.dao.FitnessDailyReportDaoProxy$queryDailyReportList$$inlined$map$1$2$1, reason: invalid class name */
                @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
                @DebugMetadata(c = "com.xiaomi.fitness.aggregation.health.dao.FitnessDailyReportDaoProxy$queryDailyReportList$$inlined$map$1$2", f = "FitnessDailyReportDaoProxy.kt", i = {}, l = {SportReportBaseParser.ReportType.targetValueNumber}, m = "emit", n = {}, s = {})
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

                public AnonymousClass2(FlowCollector flowCollector, HomeDataType homeDataType, List list, int i, List list2) {
                    this.$this_unsafeFlow = flowCollector;
                    this.$dataType$inlined = homeDataType;
                    this.$timeList$inlined = list;
                    this.$zoneOffset$inlined = i;
                    this.$daoTimeList$inlined = list2;
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
                        List list = (List) obj;
                        FitnessLogUtils.i(FitnessDailyReportDaoProxy.TAG, "queryDailyReportList: dataType=" + this.$dataType$inlined + ", timeList=" + this.$timeList$inlined + ", zoneOffset=" + this.$zoneOffset$inlined + ", daoTime=" + this.$daoTimeList$inlined + ", entityList=" + list);
                        List reportList = FitnessDailyReportDaoProxy.INSTANCE.toReportList(this.$dataType$inlined, list);
                        Intrinsics.checkNotNull(reportList, "null cannot be cast to non-null type kotlin.collections.List<R of com.xiaomi.fitness.aggregation.health.dao.FitnessDailyReportDaoProxy.queryDailyReportList$lambda$7>");
                        anonymousClass1.label = 1;
                        if (flowCollector.emit(reportList, anonymousClass1) == coroutine_suspended) {
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
                Object objCollect = flowQueryDailyReportEntityList.collect(new AnonymousClass2(flowCollector, dataType, timeList, zoneOffset, arrayList), continuation);
                return objCollect == IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
            }
        };
    }

    @NotNull
    public final <R extends DailyBasicReport> List<R> queryDailyReportListSync(@NotNull HomeDataType dataType, long beginInSecond, long endInSecond) {
        Intrinsics.checkNotNullParameter(dataType, "dataType");
        TimeZoneUtil timeZoneUtil = TimeZoneUtil.INSTANCE;
        long jNormalizeTime = timeZoneUtil.normalizeTime(beginInSecond);
        long jNormalizeTime2 = timeZoneUtil.normalizeTime(endInSecond);
        List<FitnessDailyReportEntity> listQueryDailyReportEntityListSync = getDao().queryDailyReportEntityListSync(dataType, jNormalizeTime, jNormalizeTime2);
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(listQueryDailyReportEntityListSync, 10));
        Iterator<T> it = listQueryDailyReportEntityListSync.iterator();
        while (it.hasNext()) {
            DailyBasicReport report = FitnessDailyReportDaoUtil.INSTANCE.toReport(dataType, (FitnessDailyReportEntity) it.next());
            Intrinsics.checkNotNull(report, "null cannot be cast to non-null type R of com.xiaomi.fitness.aggregation.health.dao.FitnessDailyReportDaoProxy.queryDailyReportListSync$lambda$5");
            arrayList.add(report);
        }
        FitnessLogUtils.i(TAG, ">> queryDailyReportListSync: dataType = " + dataType + ", begin = " + jNormalizeTime + ", end = " + jNormalizeTime2 + " ,entity = " + arrayList);
        return arrayList;
    }
}
