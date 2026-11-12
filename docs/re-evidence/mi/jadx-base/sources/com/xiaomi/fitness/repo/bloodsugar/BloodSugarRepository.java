package com.xiaomi.fitness.repo.bloodsugar;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.Transformations;
import com.xiaomi.fit.data.common.util.FitnessDateUtils;
import com.xiaomi.fit.fitness.export.api.FitnessDataRecorder;
import com.xiaomi.fit.fitness.export.api.repository.IBloodSugarRepository;
import com.xiaomi.fit.fitness.export.data.FitnessPersistKey;
import com.xiaomi.fit.fitness.export.data.aggregation.BloodSugarGMIAndAGPResult;
import com.xiaomi.fit.fitness.export.data.aggregation.DailyBasicReport;
import com.xiaomi.fit.fitness.export.data.aggregation.DailyBloodSugarReport;
import com.xiaomi.fit.fitness.export.data.annotation.BloodSugarLevel;
import com.xiaomi.fit.fitness.export.data.annotation.HomeDataType;
import com.xiaomi.fit.fitness.export.data.item.BloodSugarItem;
import com.xiaomi.fit.fitness.export.data.item.DailyRecordItem;
import com.xiaomi.fit.fitness.export.utils.BloodSugarComputeUtil;
import com.xiaomi.fit.fitness.export.utils.BloodSugarTargetRange;
import com.xiaomi.fit.fitness.parser.sport.base.SportReportBaseParser;
import com.xiaomi.fit.fitness.persist.db.utils.DailyRecordDaoUtils;
import com.xiaomi.fitness.aggregation.health.entity.CloudContract;
import com.xiaomi.fitness.repo.BaseProcessBiz;
import com.xiaomi.fitness.repo.BaseRepository;
import com.xiaomi.fitness.repo.RepositoryManager;
import com.xiaomi.fitness.repo.bloodsugar.BloodSugarRepository;
import com.xiaomi.fitness.repo.bloodsugar.utils.BloodSugarAggregateUtil;
import com.xiaomi.fitness.repo.bloodsugar.utils.BloodSugarAnalyzer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0088\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\n\n\u0002\u0010!\n\u0002\b\u0002\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0014J\u001d\u0010\u0010\u001a\u00020\r2\u000e\u0010\u0011\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u000f0\u0012H\u0014¢\u0006\u0002\u0010\u0013JF\u0010\u0014\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00160\u00152\b\u0010\u0017\u001a\u0004\u0018\u00010\u00182\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001f\u001a\u00020 H\u0016J0\u0010!\u001a\u00020\u00022\b\u0010\u0017\u001a\u0004\u0018\u00010\u00182\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\"\u001a\u00020\u001b2\f\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00020\u0016H\u0016J\u0010\u0010$\u001a\u00020\u00022\u0006\u0010%\u001a\u00020\u001bH\u0002J\u0013\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00020&H\u0010¢\u0006\u0002\b'J\b\u0010(\u001a\u00020)H\u0016J\u0016\u0010*\u001a\u00020+2\u0006\u0010,\u001a\u00020\u001bH\u0096@¢\u0006\u0002\u0010-J\u001e\u0010.\u001a\b\u0012\u0004\u0012\u00020/0\u00162\u0006\u0010,\u001a\u00020\u001b2\u0006\u00100\u001a\u00020\u001dH\u0016J@\u00101\u001a\u0014\u0012\u0004\u0012\u00020\u001b\u0012\n\u0012\b\u0012\u0004\u0012\u00020/0\u0016022\u0006\u00103\u001a\u00020\u001b2\u0006\u00104\u001a\u00020\u001b2\u0006\u00105\u001a\u00020\u001d2\u0006\u00106\u001a\u00020 H\u0096@¢\u0006\u0002\u00107J@\u00108\u001a\u0014\u0012\u0004\u0012\u00020\u001b\u0012\n\u0012\b\u0012\u0004\u0012\u00020/0\u0016022\u0006\u00103\u001a\u00020\u001b2\u0006\u00104\u001a\u00020\u001b2\u0006\u00105\u001a\u00020\u001d2\u0006\u00106\u001a\u00020 H\u0096@¢\u0006\u0002\u00107J@\u00109\u001a\u0014\u0012\u0004\u0012\u00020\u001b\u0012\n\u0012\b\u0012\u0004\u0012\u00020/0\u0016022\u0006\u00103\u001a\u00020\u001b2\u0006\u00104\u001a\u00020\u001b2\u0006\u00105\u001a\u00020\u001d2\u0006\u00106\u001a\u00020 H\u0096@¢\u0006\u0002\u00107JF\u0010:\u001a\u00020\r2\b\b\u0001\u0010;\u001a\u00020\u001d2\u0006\u00103\u001a\u00020\u001b2\u0006\u00104\u001a\u00020\u001b2\u0006\u00105\u001a\u00020\u001d2\u0006\u00106\u001a\u00020 2\f\u0010<\u001a\b\u0012\u0004\u0012\u00020/0=H\u0082@¢\u0006\u0002\u0010>R\u001b\u0010\u0006\u001a\u00020\u00078BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\b\u0010\t¨\u0006?"}, d2 = {"Lcom/xiaomi/fitness/repo/bloodsugar/BloodSugarRepository;", "Lcom/xiaomi/fitness/repo/BaseRepository;", "Lcom/xiaomi/fit/fitness/export/data/aggregation/DailyBloodSugarReport;", "Lcom/xiaomi/fit/fitness/export/api/repository/IBloodSugarRepository;", "<init>", "()V", "biz", "Lcom/xiaomi/fitness/repo/bloodsugar/BloodSugarBiz;", "getBiz", "()Lcom/xiaomi/fitness/repo/bloodsugar/BloodSugarBiz;", "biz$delegate", "Lkotlin/Lazy;", "doRecordAdd", "", "record", "Lcom/xiaomi/fit/fitness/export/data/item/DailyRecordItem;", "doDeleteRecord", "records", "", "([Lcom/xiaomi/fit/fitness/export/data/item/DailyRecordItem;)V", "getReportList", "Landroidx/lifecycle/LiveData;", "", "sid", "", CloudContract.COL_VIEW_TAG, "beginInSecond", "", "leftOffset", "", "rightOffset", "syncNet", "", "mergeTargetReport", "startTimestamp", "srcReportList", "getPreDailyBloodSugarReport", "curDate0Time", "Lcom/xiaomi/fitness/repo/BaseProcessBiz;", "getBiz$fitness_data_core_chinaProductRelease", "getDataType", "Lcom/xiaomi/fit/fitness/export/data/annotation/HomeDataType;", "getTheGMIAndAGP", "Lcom/xiaomi/fit/fitness/export/data/aggregation/BloodSugarGMIAndAGPResult;", "time", "(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getTheManualBloodSugarItem", "Lcom/xiaomi/fit/fitness/export/data/item/BloodSugarItem;", "period", "getManualBloodSugarByMonthGroup", "", "startTime", "endTime", "limit", "reverse", "(JJIZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getLowBloodSugarByMonthGroup", "getHighBloodSugarByMonthGroup", "getLimitedAbnormalBloodSugar", "targetLevel", "resultList", "", "(IJJIZLjava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "fitness-data-core_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nBloodSugarRepository.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BloodSugarRepository.kt\ncom/xiaomi/fitness/repo/bloodsugar/BloodSugarRepository\n+ 2 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,228:1\n216#2,2:229\n216#2:233\n217#2:236\n216#2:237\n216#2,2:238\n217#2:240\n216#2,2:241\n1863#3,2:231\n1863#3,2:234\n*S KotlinDebug\n*F\n+ 1 BloodSugarRepository.kt\ncom/xiaomi/fitness/repo/bloodsugar/BloodSugarRepository\n*L\n134#1:229,2\n206#1:233\n206#1:236\n53#1:237\n55#1:238,2\n53#1:240\n62#1:241,2\n155#1:231,2\n207#1:234,2\n*E\n"})
public final class BloodSugarRepository extends BaseRepository<DailyBloodSugarReport> implements IBloodSugarRepository {

    /* JADX INFO: renamed from: biz$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy biz = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: u13
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return BloodSugarRepository.biz_delegate$lambda$0();
        }
    });

    /* JADX INFO: renamed from: com.xiaomi.fitness.repo.bloodsugar.BloodSugarRepository$getHighBloodSugarByMonthGroup$1, reason: invalid class name */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.repo.bloodsugar.BloodSugarRepository", f = "BloodSugarRepository.kt", i = {0, 0}, l = {SportReportBaseParser.ReportType.avgDescentRate}, m = "getHighBloodSugarByMonthGroup", n = {"this", "resultList"}, s = {"L$0", "L$1"})
    public static final class AnonymousClass1 extends ContinuationImpl {
        Object L$0;
        Object L$1;
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
            return BloodSugarRepository.this.getHighBloodSugarByMonthGroup(0L, 0L, 0, false, this);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.repo.bloodsugar.BloodSugarRepository$getLimitedAbnormalBloodSugar$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.repo.bloodsugar.BloodSugarRepository", f = "BloodSugarRepository.kt", i = {0, 0, 0, 0, 0, 0, 0}, l = {SportReportBaseParser.ReportType.algorithmDataSource, 218}, m = "getLimitedAbnormalBloodSugar", n = {"this", "resultList", "targetLevel", "startTime", "endTime", "limit", "reverse"}, s = {"L$0", "L$1", "I$0", "J$0", "J$1", "I$1", "Z$0"})
    public static final class C28011 extends ContinuationImpl {
        int I$0;
        int I$1;
        long J$0;
        long J$1;
        Object L$0;
        Object L$1;
        boolean Z$0;
        int label;
        /* synthetic */ Object result;

        public C28011(Continuation<? super C28011> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return BloodSugarRepository.this.getLimitedAbnormalBloodSugar(0, 0L, 0L, 0, false, null, this);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.repo.bloodsugar.BloodSugarRepository$getLowBloodSugarByMonthGroup$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.repo.bloodsugar.BloodSugarRepository", f = "BloodSugarRepository.kt", i = {0, 0}, l = {178}, m = "getLowBloodSugarByMonthGroup", n = {"this", "resultList"}, s = {"L$0", "L$1"})
    public static final class C28021 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public C28021(Continuation<? super C28021> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return BloodSugarRepository.this.getLowBloodSugarByMonthGroup(0L, 0L, 0, false, this);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.repo.bloodsugar.BloodSugarRepository$getManualBloodSugarByMonthGroup$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.repo.bloodsugar.BloodSugarRepository", f = "BloodSugarRepository.kt", i = {0}, l = {166}, m = "getManualBloodSugarByMonthGroup", n = {"this"}, s = {"L$0"})
    public static final class C28031 extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public C28031(Continuation<? super C28031> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return BloodSugarRepository.this.getManualBloodSugarByMonthGroup(0L, 0L, 0, false, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BloodSugarBiz biz_delegate$lambda$0() {
        return new BloodSugarBiz();
    }

    private final BloodSugarBiz getBiz() {
        return (BloodSugarBiz) this.biz.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Multi-variable type inference failed */
    public final Object getLimitedAbnormalBloodSugar(@BloodSugarLevel int i, long j, long j2, int i2, boolean z, List<BloodSugarItem> list, Continuation<? super Unit> continuation) {
        C28011 c28011;
        int i3;
        long j3;
        long j4;
        int i4;
        boolean z2;
        List list2;
        BloodSugarRepository bloodSugarRepository;
        if (continuation instanceof C28011) {
            c28011 = (C28011) continuation;
            int i5 = c28011.label;
            if ((i5 & Integer.MIN_VALUE) != 0) {
                c28011.label = i5 - Integer.MIN_VALUE;
            } else {
                c28011 = new C28011(continuation);
            }
        } else {
            c28011 = new C28011(continuation);
        }
        Object limitedDataRecord = c28011.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i6 = c28011.label;
        if (i6 != 0) {
            if (i6 == 1) {
                boolean z3 = c28011.Z$0;
                int i7 = c28011.I$1;
                j4 = c28011.J$1;
                j3 = c28011.J$0;
                int i8 = c28011.I$0;
                List list3 = (List) c28011.L$1;
                BloodSugarRepository bloodSugarRepository2 = (BloodSugarRepository) c28011.L$0;
                ResultKt.throwOnFailure(limitedDataRecord);
                z2 = z3;
                bloodSugarRepository = bloodSugarRepository2;
                list2 = list3;
                i4 = i7;
                i3 = i8;
            } else {
                if (i6 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(limitedDataRecord);
            }
            return Unit.INSTANCE;
        }
        ResultKt.throwOnFailure(limitedDataRecord);
        DailyRecordDaoUtils dailyRecordDaoUtils = DailyRecordDaoUtils.INSTANCE;
        HomeDataType homeDataType = HomeDataType.BLOOD_SUGAR;
        int curTimeZoneOffsetInSecond = getRepoMgr$fitness_data_core_chinaProductRelease().getCurTimeZoneOffsetInSecond();
        c28011.L$0 = this;
        c28011.L$1 = list;
        c28011.I$0 = i;
        c28011.J$0 = j;
        c28011.J$1 = j2;
        c28011.I$1 = i2;
        c28011.Z$0 = z;
        c28011.label = 1;
        limitedDataRecord = dailyRecordDaoUtils.getLimitedDataRecord(homeDataType, (String) null, j, j2, curTimeZoneOffsetInSecond, i2, z, c28011);
        if (limitedDataRecord == coroutine_suspended) {
            return coroutine_suspended;
        }
        i3 = i;
        j3 = j;
        j4 = j2;
        i4 = i2;
        z2 = z;
        list2 = list;
        bloodSugarRepository = this;
        Map map = (Map) limitedDataRecord;
        if (map.isEmpty()) {
            return Unit.INSTANCE;
        }
        BloodSugarTargetRange bloodSugarTargetRange = BloodSugarComputeUtil.INSTANCE.getBloodSugarTargetRange();
        Ref.LongRef longRef = new Ref.LongRef();
        longRef.element = j3;
        Ref.LongRef longRef2 = new Ref.LongRef();
        longRef2.element = j4;
        Iterator it = map.entrySet().iterator();
        while (it.hasNext()) {
            for (DailyRecordItem dailyRecordItem : (Iterable) ((Map.Entry) it.next()).getValue()) {
                Iterator it2 = it;
                Intrinsics.checkNotNull(dailyRecordItem, "null cannot be cast to non-null type com.xiaomi.fit.fitness.export.data.item.BloodSugarItem");
                BloodSugarItem bloodSugarItem = (BloodSugarItem) dailyRecordItem;
                long j5 = j4;
                if (i3 == bloodSugarItem.getTargetLevel(bloodSugarTargetRange)) {
                    list2.add(dailyRecordItem);
                }
                long j6 = j3;
                if (bloodSugarItem.getTime() > longRef.element) {
                    longRef.element = bloodSugarItem.getTime();
                }
                long time = bloodSugarItem.getTime();
                long j7 = longRef2.element;
                if (time < j7 || j7 == 0) {
                    longRef2.element = bloodSugarItem.getTime();
                }
                if (list2.size() == i4) {
                    return Unit.INSTANCE;
                }
                it = it2;
                j4 = j5;
                j3 = j6;
            }
        }
        long j8 = j4;
        long j9 = z2 ? j3 : longRef.element + 1;
        long j10 = z2 ? longRef2.element : j8;
        c28011.L$0 = null;
        c28011.L$1 = null;
        c28011.label = 2;
        if (bloodSugarRepository.getLimitedAbnormalBloodSugar(i3, j9, j10, i4, z2, list2, c28011) == coroutine_suspended) {
            return coroutine_suspended;
        }
        return Unit.INSTANCE;
    }

    private final DailyBloodSugarReport getPreDailyBloodSugarReport(long curDate0Time) {
        long j = curDate0Time - ((long) RepositoryManager.GAP_A_DAY);
        return getBiz().splitDailyReport((String) null, "days", j, (Map<String, ? extends List<? extends DailyRecordItem>>) getDbGetter().getTheDailyItems(null, j, curDate0Time, getRepoMgr$fitness_data_core_chinaProductRelease().getCurTimeZoneOffsetInSecond(), "blood_sugar"));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List getReportList$lambda$4(BloodSugarRepository this$0, String str, String viewTag, BaseRepository.TimeRange timeRange, Map itemMap) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(viewTag, "$viewTag");
        Intrinsics.checkNotNullParameter(timeRange, "$timeRange");
        Intrinsics.checkNotNullParameter(itemMap, "itemMap");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : itemMap.entrySet()) {
            for (Map.Entry entry2 : BaseProcessBiz.groupByDay$default(this$0.getBiz(), timeRange.getStartTime(), (List) entry.getValue(), null, 4, null).entrySet()) {
                Map linkedHashMap2 = (Map) linkedHashMap.get(entry2.getKey());
                if (linkedHashMap2 == null) {
                    linkedHashMap2 = new LinkedHashMap();
                }
                linkedHashMap2.put(entry.getKey(), entry2.getValue());
                linkedHashMap.put(entry2.getKey(), linkedHashMap2);
            }
        }
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry3 : linkedHashMap.entrySet()) {
            arrayList.add(this$0.getBiz().splitDailyReport((String) null, "days", ((Number) entry3.getKey()).longValue(), (Map<String, ? extends List<? extends DailyRecordItem>>) entry3.getValue()));
        }
        return this$0.mergeReportList$fitness_data_core_chinaProductRelease(str, viewTag, arrayList, timeRange.getRangeList());
    }

    @Override // com.xiaomi.fitness.repo.BaseRepository
    public void doDeleteRecord(@NotNull DailyRecordItem[] records) {
        Intrinsics.checkNotNullParameter(records, "records");
        getDbWriter().deleteBloodSugar(ArraysKt___ArraysKt.toList(records));
    }

    @Override // com.xiaomi.fitness.repo.BaseRepository
    public void doRecordAdd(@NotNull DailyRecordItem record) {
        Intrinsics.checkNotNullParameter(record, "record");
        if (record instanceof BloodSugarItem) {
            FitnessDataRecorder dbWriter = getDbWriter();
            String sid = record.getSid();
            Intrinsics.checkNotNull(sid);
            int curTimeZoneOffsetInSecond = getRepoMgr$fitness_data_core_chinaProductRelease().getCurTimeZoneOffsetInSecond();
            List<BloodSugarItem> listSingletonList = Collections.singletonList(record);
            Intrinsics.checkNotNullExpressionValue(listSingletonList, "singletonList(...)");
            dbWriter.recordManualBloodSugar(sid, curTimeZoneOffsetInSecond, listSingletonList);
        }
    }

    @Override // com.xiaomi.fitness.repo.BaseRepository
    @NotNull
    public BaseProcessBiz<DailyBloodSugarReport> getBiz$fitness_data_core_chinaProductRelease() {
        return getBiz();
    }

    @Override // com.xiaomi.fitness.repo.BaseRepository
    @NotNull
    public HomeDataType getDataType() {
        return HomeDataType.BLOOD_SUGAR;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0017  */
    @Override // com.xiaomi.fit.fitness.export.api.repository.IBloodSugarRepository
    @Nullable
    public Object getHighBloodSugarByMonthGroup(long j, long j2, int i, boolean z, @NotNull Continuation<? super Map<Long, ? extends List<BloodSugarItem>>> continuation) {
        AnonymousClass1 anonymousClass1;
        BloodSugarRepository bloodSugarRepository;
        List list;
        if (continuation instanceof AnonymousClass1) {
            anonymousClass1 = (AnonymousClass1) continuation;
            int i2 = anonymousClass1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                anonymousClass1.label = i2 - Integer.MIN_VALUE;
            } else {
                anonymousClass1 = new AnonymousClass1(continuation);
            }
        } else {
            anonymousClass1 = new AnonymousClass1(continuation);
        }
        AnonymousClass1 anonymousClass2 = anonymousClass1;
        Object obj = anonymousClass2.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = anonymousClass2.label;
        if (i3 == 0) {
            ResultKt.throwOnFailure(obj);
            ArrayList arrayList = new ArrayList();
            anonymousClass2.L$0 = this;
            anonymousClass2.L$1 = arrayList;
            anonymousClass2.label = 1;
            if (getLimitedAbnormalBloodSugar(2, j, j2, i, z, arrayList, anonymousClass2) == coroutine_suspended) {
                return coroutine_suspended;
            }
            bloodSugarRepository = this;
            list = arrayList;
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            List list2 = (List) anonymousClass2.L$1;
            bloodSugarRepository = (BloodSugarRepository) anonymousClass2.L$0;
            ResultKt.throwOnFailure(obj);
            list = list2;
        }
        Object objGroupByMonth = bloodSugarRepository.getBiz$fitness_data_core_chinaProductRelease().groupByMonth(list);
        Intrinsics.checkNotNull(objGroupByMonth, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.Long, kotlin.collections.List<com.xiaomi.fit.fitness.export.data.item.BloodSugarItem>>");
        return objGroupByMonth;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0017  */
    @Override // com.xiaomi.fit.fitness.export.api.repository.IBloodSugarRepository
    @Nullable
    public Object getLowBloodSugarByMonthGroup(long j, long j2, int i, boolean z, @NotNull Continuation<? super Map<Long, ? extends List<BloodSugarItem>>> continuation) {
        C28021 c28021;
        BloodSugarRepository bloodSugarRepository;
        List list;
        if (continuation instanceof C28021) {
            c28021 = (C28021) continuation;
            int i2 = c28021.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c28021.label = i2 - Integer.MIN_VALUE;
            } else {
                c28021 = new C28021(continuation);
            }
        } else {
            c28021 = new C28021(continuation);
        }
        C28021 c28022 = c28021;
        Object obj = c28022.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = c28022.label;
        if (i3 == 0) {
            ResultKt.throwOnFailure(obj);
            ArrayList arrayList = new ArrayList();
            c28022.L$0 = this;
            c28022.L$1 = arrayList;
            c28022.label = 1;
            if (getLimitedAbnormalBloodSugar(3, j, j2, i, z, arrayList, c28022) == coroutine_suspended) {
                return coroutine_suspended;
            }
            bloodSugarRepository = this;
            list = arrayList;
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            List list2 = (List) c28022.L$1;
            bloodSugarRepository = (BloodSugarRepository) c28022.L$0;
            ResultKt.throwOnFailure(obj);
            list = list2;
        }
        Object objGroupByMonth = bloodSugarRepository.getBiz$fitness_data_core_chinaProductRelease().groupByMonth(list);
        Intrinsics.checkNotNull(objGroupByMonth, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.Long, kotlin.collections.List<com.xiaomi.fit.fitness.export.data.item.BloodSugarItem>>");
        return objGroupByMonth;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0017  */
    @Override // com.xiaomi.fit.fitness.export.api.repository.IBloodSugarRepository
    @Nullable
    public Object getManualBloodSugarByMonthGroup(long j, long j2, int i, boolean z, @NotNull Continuation<? super Map<Long, ? extends List<BloodSugarItem>>> continuation) {
        C28031 c28031;
        BloodSugarRepository bloodSugarRepository;
        if (continuation instanceof C28031) {
            c28031 = (C28031) continuation;
            int i2 = c28031.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c28031.label = i2 - Integer.MIN_VALUE;
            } else {
                c28031 = new C28031(continuation);
            }
        } else {
            c28031 = new C28031(continuation);
        }
        C28031 c28032 = c28031;
        Object limitedDataRecord = c28032.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = c28032.label;
        if (i3 == 0) {
            ResultKt.throwOnFailure(limitedDataRecord);
            DailyRecordDaoUtils dailyRecordDaoUtils = DailyRecordDaoUtils.INSTANCE;
            int curTimeZoneOffsetInSecond = getRepoMgr$fitness_data_core_chinaProductRelease().getCurTimeZoneOffsetInSecond();
            c28032.L$0 = this;
            c28032.label = 1;
            limitedDataRecord = dailyRecordDaoUtils.getLimitedDataRecord(FitnessPersistKey.ManualBloodSugar, (String) null, j, j2, curTimeZoneOffsetInSecond, i, z, c28032);
            if (limitedDataRecord == coroutine_suspended) {
                return coroutine_suspended;
            }
            bloodSugarRepository = this;
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bloodSugarRepository = (BloodSugarRepository) c28032.L$0;
            ResultKt.throwOnFailure(limitedDataRecord);
        }
        Object objGroupByMonth = bloodSugarRepository.getBiz$fitness_data_core_chinaProductRelease().groupByMonth((List) limitedDataRecord);
        Intrinsics.checkNotNull(objGroupByMonth, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.Long, kotlin.collections.List<com.xiaomi.fit.fitness.export.data.item.BloodSugarItem>>");
        return objGroupByMonth;
    }

    @Override // com.xiaomi.fitness.repo.BaseRepository, com.xiaomi.fit.fitness.export.api.repository.IRepository
    @NotNull
    public LiveData<List<DailyBloodSugarReport>> getReportList(@Nullable final String sid, @NotNull final String viewTag, long beginInSecond, int leftOffset, int rightOffset, boolean syncNet) {
        Intrinsics.checkNotNullParameter(viewTag, "viewTag");
        final BaseRepository.TimeRange timeRangeDivideTimeRangeByTag = divideTimeRangeByTag(viewTag, beginInSecond, leftOffset, rightOffset);
        return Transformations.map(getDbGetter().getAllDailyRecordAsync(getDataType(), null, timeRangeDivideTimeRangeByTag.getStartTime(), timeRangeDivideTimeRangeByTag.getEndTime(), getRepoMgr$fitness_data_core_chinaProductRelease().getCurTimeZoneOffsetInSecond()), new Function1() { // from class: t13
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return BloodSugarRepository.getReportList$lambda$4(this.f34192a, sid, viewTag, timeRangeDivideTimeRangeByTag, (Map) obj);
            }
        });
    }

    @Override // com.xiaomi.fit.fitness.export.api.repository.IBloodSugarRepository
    @Nullable
    public Object getTheGMIAndAGP(long j, @NotNull Continuation<? super BloodSugarGMIAndAGPResult> continuation) {
        long jChangeZeroOfTheDay = FitnessDateUtils.INSTANCE.changeZeroOfTheDay(j);
        long j2 = jChangeZeroOfTheDay - ((long) 2505600);
        List<DailyRecordItem> list = getDbGetter().getTheDailyItems(null, j2, jChangeZeroOfTheDay + ((long) RepositoryManager.GAP_A_DAY), getRepoMgr$fitness_data_core_chinaProductRelease().getCurTimeZoneOffsetInSecond(), "blood_sugar").get("blood_sugar");
        List<DailyRecordItem> list2 = list;
        if (list2 == null || list2.isEmpty()) {
            return new BloodSugarGMIAndAGPResult(j2, jChangeZeroOfTheDay, null, null, 12, null);
        }
        Map mapGroupByDay$default = BaseProcessBiz.groupByDay$default(getBiz(), j2, list, null, 4, null);
        ArrayList arrayList = new ArrayList();
        long time = jChangeZeroOfTheDay;
        for (Map.Entry entry : mapGroupByDay$default.entrySet()) {
            BloodSugarBiz biz = getBiz();
            long jLongValue = ((Number) entry.getKey()).longValue();
            Map<String, ? extends List<? extends DailyRecordItem>> mapSingletonMap = Collections.singletonMap("blood_sugar", entry.getValue());
            Intrinsics.checkNotNullExpressionValue(mapSingletonMap, "singletonMap(...)");
            DailyBloodSugarReport dailyBloodSugarReportSplitDailyReport = biz.splitDailyReport((String) null, "days", jLongValue, mapSingletonMap);
            if (!dailyBloodSugarReportSplitDailyReport.isEmpty()) {
                if (dailyBloodSugarReportSplitDailyReport.getTime() < time) {
                    time = dailyBloodSugarReportSplitDailyReport.getTime();
                }
                arrayList.add(dailyBloodSugarReportSplitDailyReport);
            }
        }
        return BloodSugarAnalyzer.INSTANCE.analyzeBloodSugarGMIAndAGP(time, jChangeZeroOfTheDay, arrayList);
    }

    @Override // com.xiaomi.fit.fitness.export.api.repository.IBloodSugarRepository
    @NotNull
    public List<BloodSugarItem> getTheManualBloodSugarItem(long time, int period) {
        Integer measurePeriod;
        long jChangeZeroOfTheDay = FitnessDateUtils.INSTANCE.changeZeroOfTheDay(time);
        Map<String, List<DailyRecordItem>> theDailyItems = getDbGetter().getTheDailyItems("xiaomiwear_app_manually", jChangeZeroOfTheDay, jChangeZeroOfTheDay + ((long) RepositoryManager.GAP_A_DAY), getRepoMgr$fitness_data_core_chinaProductRelease().getCurTimeZoneOffsetInSecond(), FitnessPersistKey.ManualBloodSugar);
        ArrayList arrayList = new ArrayList();
        List<DailyRecordItem> list = theDailyItems.get(FitnessPersistKey.ManualBloodSugar);
        if (list != null) {
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                BloodSugarItem bloodSugarItem = (BloodSugarItem) it.next();
                if (time == bloodSugarItem.getTime() || (period != 9 && (measurePeriod = bloodSugarItem.getMeasurePeriod()) != null && period == measurePeriod.intValue())) {
                    arrayList.add(bloodSugarItem);
                }
            }
        }
        return arrayList;
    }

    @Override // com.xiaomi.fitness.repo.BaseRepository
    public /* bridge */ /* synthetic */ DailyBasicReport mergeTargetReport(String str, String str2, long j, List list) {
        return mergeTargetReport(str, str2, j, (List<DailyBloodSugarReport>) list);
    }

    @Override // com.xiaomi.fitness.repo.BaseRepository
    @NotNull
    public DailyBloodSugarReport mergeTargetReport(@Nullable String sid, @NotNull String viewTag, long startTimestamp, @NotNull List<DailyBloodSugarReport> srcReportList) {
        Intrinsics.checkNotNullParameter(viewTag, "viewTag");
        Intrinsics.checkNotNullParameter(srcReportList, "srcReportList");
        if (srcReportList.isEmpty()) {
            return new DailyBloodSugarReport(startTimestamp, viewTag);
        }
        if (Intrinsics.areEqual(viewTag, "weeks") || Intrinsics.areEqual(viewTag, "months")) {
            DailyBloodSugarReport dailyBloodSugarReport = new DailyBloodSugarReport(startTimestamp, viewTag);
            DailyBloodSugarReport preDailyBloodSugarReport = getPreDailyBloodSugarReport(startTimestamp);
            BloodSugarAggregateUtil bloodSugarAggregateUtil = BloodSugarAggregateUtil.INSTANCE;
            bloodSugarAggregateUtil.aggregateWeekContinuousBloodSugar(srcReportList, dailyBloodSugarReport);
            bloodSugarAggregateUtil.computeDayBloodSugarTrend(dailyBloodSugarReport, preDailyBloodSugarReport);
            return bloodSugarAggregateUtil.aggregateWeekFingerBloodSugar(srcReportList, dailyBloodSugarReport);
        }
        DailyBloodSugarReport dailyBloodSugarReport2 = srcReportList.get(0);
        DailyBloodSugarReport preDailyBloodSugarReport2 = getPreDailyBloodSugarReport(startTimestamp);
        BloodSugarAggregateUtil bloodSugarAggregateUtil2 = BloodSugarAggregateUtil.INSTANCE;
        bloodSugarAggregateUtil2.computeDayBloodSugarTrend(dailyBloodSugarReport2, preDailyBloodSugarReport2);
        BloodSugarAnalyzer bloodSugarAnalyzer = BloodSugarAnalyzer.INSTANCE;
        dailyBloodSugarReport2.setSportDataList(bloodSugarAnalyzer.analyzeDaySportBloodSugar(getDbGetter(), dailyBloodSugarReport2));
        dailyBloodSugarReport2.setSleepDataList(bloodSugarAnalyzer.analyzeDaySleepBloodSugar(dailyBloodSugarReport2, preDailyBloodSugarReport2));
        bloodSugarAggregateUtil2.computeDayFingerBSDifference(dailyBloodSugarReport2);
        return dailyBloodSugarReport2;
    }
}
