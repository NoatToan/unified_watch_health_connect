package com.xiaomi.fitness.repo.sleep.net;

import com.xiaomi.fit.data.common.log.FitnessLogUtils;
import com.xiaomi.fit.data.common.util.FitnessDateUtils;
import com.xiaomi.fit.fitness.export.data.project.SleepDiaryReport;
import com.xiaomi.fit.fitness.export.data.project.SleepMedicationDetail;
import com.xiaomi.fit.fitness.export.data.project.SleepNapSituation;
import com.xiaomi.fit.fitness.export.data.project.SleepRhythmReport;
import com.xiaomi.fit.fitness.persist.server.data.ProjectDataModel;
import com.xiaomi.fit.fitness.persist.server.data.ProjectPersistKey;
import com.xiaomi.fit.fitness.persist.server.data.SleepDiaryInfo;
import com.xiaomi.fit.fitness.persist.server.data.SleepRhythm;
import com.xiaomi.fit.fitness.persist.server.data.SleepSeverMedicationDetail;
import com.xiaomi.fit.fitness.persist.server.data.SleepSeverNapSituation;
import com.xiaomi.fit.fitness.persist.utils.FitnessPersistUtils;
import com.xiaomi.fitness.aggregation.health.dao.ProjectEntityDaoProxy;
import com.xiaomi.fitness.aggregation.health.entity.CloudContract;
import com.xiaomi.fitness.repo.RepositoryManager;
import java.util.ArrayList;
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
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.flow.Flow;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 82\u00020\u0001:\u00018B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001c\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0086@¢\u0006\u0002\u0010\tJ\u001c\u0010\n\u001a\u00020\u000b2\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\f0\u0007H\u0086@¢\u0006\u0002\u0010\tJ\u001e\u0010\r\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\bH\u0086@¢\u0006\u0002\u0010\u0011J\u001e\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\fH\u0086@¢\u0006\u0002\u0010\u0013J\u0006\u0010\u0014\u001a\u00020\u0005J<\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u0005H\u0086@¢\u0006\u0002\u0010\u001dJ\u0018\u0010\u001e\u001a\u00020\f2\u0006\u0010\u001f\u001a\u00020\u00172\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fJ0\u0010 \u001a\b\u0012\u0004\u0012\u00020\f0\u00072\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00172\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0086@¢\u0006\u0002\u0010!J\u0016\u0010\"\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010$0#2\u0006\u0010%\u001a\u00020\u000fJ\u001e\u0010&\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010$0#2\u0006\u0010%\u001a\u00020\u000f2\u0006\u0010\u001f\u001a\u00020\u0017J(\u0010'\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00172\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000fJ\u001c\u0010(\u001a\b\u0012\u0004\u0012\u00020\f0\u00072\f\u0010)\u001a\b\u0012\u0004\u0012\u00020$0\u0007H\u0002J\u001e\u0010*\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u000e\u0010)\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010$0\u0007H\u0002J\u0012\u0010+\u001a\u0004\u0018\u00010\b2\b\u0010,\u001a\u0004\u0018\u00010$J\u0012\u0010-\u001a\u0004\u0018\u00010\f2\b\u0010,\u001a\u0004\u0018\u00010$J(\u0010.\u001a\n\u0012\u0004\u0012\u00020/\u0018\u00010\u00072\u000e\u00100\u001a\n\u0012\u0004\u0012\u000201\u0018\u00010\u00072\u0006\u00102\u001a\u00020\u001aH\u0002J \u00103\u001a\n\u0012\u0004\u0012\u000201\u0018\u00010\u00072\u000e\u00100\u001a\n\u0012\u0004\u0012\u00020/\u0018\u00010\u0007H\u0002J \u00104\u001a\n\u0012\u0004\u0012\u000205\u0018\u00010\u00072\u000e\u00100\u001a\n\u0012\u0004\u0012\u000206\u0018\u00010\u0007H\u0002J(\u00107\u001a\n\u0012\u0004\u0012\u000206\u0018\u00010\u00072\u000e\u00100\u001a\n\u0012\u0004\u0012\u000205\u0018\u00010\u00072\u0006\u00102\u001a\u00020\u001aH\u0002¨\u00069"}, d2 = {"Lcom/xiaomi/fitness/repo/sleep/net/ProjectDataRequest;", "", "<init>", "()V", "deleteSleepRhyThm", "", "list", "", "Lcom/xiaomi/fit/fitness/export/data/project/SleepRhythmReport;", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deleteSleepDiary", "", "Lcom/xiaomi/fit/fitness/export/data/project/SleepDiaryReport;", "addSleepRhyThmInfo", "sid", "", "dataInfo", "(Ljava/lang/String;Lcom/xiaomi/fit/fitness/export/data/project/SleepRhythmReport;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "addSleepDiaryInfo", "(Ljava/lang/String;Lcom/xiaomi/fit/fitness/export/data/project/SleepDiaryReport;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getRhyThmDataValidByAllData", "getLimitedSleepRhythm", "startTime", "", "endTime", CloudContract.COL_ZONE_OFFSET, "", "limit", "reverse", "(JJIIZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getSleepDiaryReport", "time", "getSleepDiaryReportListSync", "(JJLjava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getLastDataByKey", "Lkotlinx/coroutines/flow/Flow;", "Lcom/xiaomi/fit/fitness/persist/server/data/ProjectDataModel;", "key", "getLatestDataBeforeTimeByKey", "getSleepRhyThmReportList", "toSleepDiaryReportList", "entityList", "toSleepRhyThmReportList", "convertServerToLocalSleepRhythmReport", "data", "convertServerToLocalSleepDiaryReport", "severToLocalListByNapSituation", "Lcom/xiaomi/fit/fitness/export/data/project/SleepNapSituation;", "napSituation", "Lcom/xiaomi/fit/fitness/persist/server/data/SleepSeverNapSituation;", "zoneOffsetDiff", "localToSeverListByNapSituation", "localToSeverListByMedication", "Lcom/xiaomi/fit/fitness/persist/server/data/SleepSeverMedicationDetail;", "Lcom/xiaomi/fit/fitness/export/data/project/SleepMedicationDetail;", "severToLocalListByMedication", "Companion", "fitness-data-core_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nProjectDataRequest.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ProjectDataRequest.kt\ncom/xiaomi/fitness/repo/sleep/net/ProjectDataRequest\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,294:1\n1863#2,2:295\n1863#2,2:297\n1863#2,2:299\n*S KotlinDebug\n*F\n+ 1 ProjectDataRequest.kt\ncom/xiaomi/fitness/repo/sleep/net/ProjectDataRequest\n*L\n23#1:295,2\n33#1:297,2\n82#1:299,2\n*E\n"})
public final class ProjectDataRequest {

    @NotNull
    private static final String TAG = "ProjectStatDataRequest";

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final ProjectDataRequest instance = new ProjectDataRequest();

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/xiaomi/fitness/repo/sleep/net/ProjectDataRequest$Companion;", "", "<init>", "()V", "TAG", "", "instance", "Lcom/xiaomi/fitness/repo/sleep/net/ProjectDataRequest;", "getInstance", "()Lcom/xiaomi/fitness/repo/sleep/net/ProjectDataRequest;", "fitness-data-core_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final ProjectDataRequest getInstance() {
            return ProjectDataRequest.instance;
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.repo.sleep.net.ProjectDataRequest$deleteSleepDiary$1, reason: invalid class name */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.repo.sleep.net.ProjectDataRequest", f = "ProjectDataRequest.kt", i = {0}, l = {36}, m = "deleteSleepDiary", n = {"deleteList"}, s = {"L$0"})
    public static final class AnonymousClass1 extends ContinuationImpl {
        Object L$0;
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
            return ProjectDataRequest.this.deleteSleepDiary(null, this);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.repo.sleep.net.ProjectDataRequest$deleteSleepRhyThm$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.repo.sleep.net.ProjectDataRequest", f = "ProjectDataRequest.kt", i = {0}, l = {26}, m = "deleteSleepRhyThm", n = {"deleteList"}, s = {"L$0"})
    public static final class C28501 extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public C28501(Continuation<? super C28501> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ProjectDataRequest.this.deleteSleepRhyThm(null, this);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.repo.sleep.net.ProjectDataRequest$getLimitedSleepRhythm$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.repo.sleep.net.ProjectDataRequest", f = "ProjectDataRequest.kt", i = {0}, l = {75}, m = "getLimitedSleepRhythm", n = {"this"}, s = {"L$0"})
    public static final class C28511 extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public C28511(Continuation<? super C28511> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ProjectDataRequest.this.getLimitedSleepRhythm(0L, 0L, 0, 0, false, this);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.repo.sleep.net.ProjectDataRequest$getSleepDiaryReportListSync$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.repo.sleep.net.ProjectDataRequest", f = "ProjectDataRequest.kt", i = {0}, l = {113}, m = "getSleepDiaryReportListSync", n = {"this"}, s = {"L$0"})
    public static final class C28521 extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public C28521(Continuation<? super C28521> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ProjectDataRequest.this.getSleepDiaryReportListSync(0L, 0L, null, this);
        }
    }

    private ProjectDataRequest() {
    }

    public static /* synthetic */ Object getSleepDiaryReportListSync$default(ProjectDataRequest projectDataRequest, long j, long j2, String str, Continuation continuation, int i, Object obj) {
        if ((i & 4) != 0) {
            str = null;
        }
        return projectDataRequest.getSleepDiaryReportListSync(j, j2, str, continuation);
    }

    public static /* synthetic */ List getSleepRhyThmReportList$default(ProjectDataRequest projectDataRequest, long j, long j2, String str, int i, Object obj) {
        if ((i & 4) != 0) {
            str = null;
        }
        return projectDataRequest.getSleepRhyThmReportList(j, j2, str);
    }

    private final List<SleepSeverMedicationDetail> localToSeverListByMedication(List<SleepMedicationDetail> napSituation) {
        if (napSituation == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (SleepMedicationDetail sleepMedicationDetail : napSituation) {
            arrayList.add(new SleepSeverMedicationDetail(sleepMedicationDetail.getMedicationName(), Long.valueOf(sleepMedicationDetail.getMedicationSchedule() + ((long) FitnessDateUtils.getCurrentTZOffsetInSec())), Integer.valueOf(sleepMedicationDetail.getMedicationCount())));
        }
        return arrayList;
    }

    private final List<SleepSeverNapSituation> localToSeverListByNapSituation(List<SleepNapSituation> napSituation) {
        if (napSituation == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        int currentTZOffsetInSec = FitnessDateUtils.getCurrentTZOffsetInSec();
        for (SleepNapSituation sleepNapSituation : napSituation) {
            long j = currentTZOffsetInSec;
            arrayList.add(new SleepSeverNapSituation(Long.valueOf(sleepNapSituation.getBedtime() + j), Long.valueOf(sleepNapSituation.getWakeUpTime() + j)));
        }
        return arrayList;
    }

    private final List<SleepMedicationDetail> severToLocalListByMedication(List<SleepSeverMedicationDetail> napSituation, int zoneOffsetDiff) {
        if (napSituation == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (SleepSeverMedicationDetail sleepSeverMedicationDetail : napSituation) {
            Long lValueOf = sleepSeverMedicationDetail.getMedicationSchedule() != null ? Long.valueOf(sleepSeverMedicationDetail.getMedicationSchedule().longValue() + ((long) zoneOffsetDiff)) : null;
            if (!sleepSeverMedicationDetail.isEmpty()) {
                String medicationName = sleepSeverMedicationDetail.getMedicationName();
                if (medicationName == null) {
                    medicationName = "";
                }
                long jLongValue = lValueOf != null ? lValueOf.longValue() : 0L;
                Integer medicationCount = sleepSeverMedicationDetail.getMedicationCount();
                arrayList.add(new SleepMedicationDetail(medicationName, jLongValue, medicationCount != null ? medicationCount.intValue() : 0));
            }
        }
        return arrayList;
    }

    private final List<SleepNapSituation> severToLocalListByNapSituation(List<SleepSeverNapSituation> napSituation, int zoneOffsetDiff) {
        if (napSituation == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (SleepSeverNapSituation sleepSeverNapSituation : napSituation) {
            if (!sleepSeverNapSituation.isEmpty() && sleepSeverNapSituation.getBedtime() != null && sleepSeverNapSituation.getWakeUpTime() != null) {
                long j = zoneOffsetDiff;
                arrayList.add(new SleepNapSituation(sleepSeverNapSituation.getBedtime().longValue() + j, sleepSeverNapSituation.getWakeUpTime().longValue() + j));
            }
        }
        return arrayList;
    }

    private final List<SleepDiaryReport> toSleepDiaryReportList(List<ProjectDataModel> entityList) {
        ArrayList arrayList = new ArrayList();
        Iterator<ProjectDataModel> it = entityList.iterator();
        while (it.hasNext()) {
            SleepDiaryReport sleepDiaryReportConvertServerToLocalSleepDiaryReport = convertServerToLocalSleepDiaryReport(it.next());
            if (sleepDiaryReportConvertServerToLocalSleepDiaryReport != null) {
                arrayList.add(sleepDiaryReportConvertServerToLocalSleepDiaryReport);
            }
        }
        return arrayList;
    }

    private final List<SleepRhythmReport> toSleepRhyThmReportList(List<ProjectDataModel> entityList) {
        ArrayList arrayList = new ArrayList();
        Iterator<ProjectDataModel> it = entityList.iterator();
        while (it.hasNext()) {
            SleepRhythmReport sleepRhythmReportConvertServerToLocalSleepRhythmReport = convertServerToLocalSleepRhythmReport(it.next());
            if (sleepRhythmReportConvertServerToLocalSleepRhythmReport != null) {
                arrayList.add(sleepRhythmReportConvertServerToLocalSleepRhythmReport);
            }
        }
        return arrayList;
    }

    @Nullable
    public final Object addSleepDiaryInfo(@NotNull String str, @NotNull SleepDiaryReport sleepDiaryReport, @NotNull Continuation<? super Unit> continuation) {
        Long lBoxLong;
        Long lBoxLong2;
        int currentTZOffsetInSec = FitnessDateUtils.getCurrentTZOffsetInSec();
        Long lBoxLong3 = null;
        if (sleepDiaryReport.getPreSleepRoutineTime() != null) {
            Long preSleepRoutineTime = sleepDiaryReport.getPreSleepRoutineTime();
            Intrinsics.checkNotNull(preSleepRoutineTime);
            lBoxLong = Boxing.boxLong(preSleepRoutineTime.longValue() + ((long) currentTZOffsetInSec));
        } else {
            lBoxLong = null;
        }
        if (sleepDiaryReport.getMorningWakeUpTime() != null) {
            Long morningWakeUpTime = sleepDiaryReport.getMorningWakeUpTime();
            Intrinsics.checkNotNull(morningWakeUpTime);
            lBoxLong2 = Boxing.boxLong(morningWakeUpTime.longValue() + ((long) currentTZOffsetInSec));
        } else {
            lBoxLong2 = null;
        }
        if (sleepDiaryReport.getMorningGettingUpTime() != null) {
            Long morningGettingUpTime = sleepDiaryReport.getMorningGettingUpTime();
            Intrinsics.checkNotNull(morningGettingUpTime);
            lBoxLong3 = Boxing.boxLong(morningGettingUpTime.longValue() + ((long) currentTZOffsetInSec));
        }
        SleepDiaryInfo sleepDiaryInfo = new SleepDiaryInfo(localToSeverListByNapSituation(sleepDiaryReport.getNapSituation()), localToSeverListByMedication(sleepDiaryReport.getMedicationBeforeBedtime()), lBoxLong, sleepDiaryReport.getFallAsleepDuration(), sleepDiaryReport.getAwakeCount(), sleepDiaryReport.getFallAsleepAgainDuration(), lBoxLong2, lBoxLong3, sleepDiaryReport.getInsomniaDifficulty(), sleepDiaryReport.getSleepQuality());
        ProjectEntityDaoProxy projectEntityDaoProxy = ProjectEntityDaoProxy.INSTANCE;
        Long dbTime = sleepDiaryReport.getDbTime();
        long jLongValue = dbTime != null ? dbTime.longValue() : sleepDiaryReport.getTime();
        Integer dbZoneOffset = sleepDiaryReport.getDbZoneOffset();
        Object objInsertDiaryDataFromLocal = projectEntityDaoProxy.insertDiaryDataFromLocal(str, jLongValue, sleepDiaryInfo, dbZoneOffset != null ? dbZoneOffset.intValue() : FitnessDateUtils.getCurrentTZOffsetInSec(), continuation);
        return objInsertDiaryDataFromLocal == IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objInsertDiaryDataFromLocal : Unit.INSTANCE;
    }

    @Nullable
    public final Object addSleepRhyThmInfo(@NotNull String str, @NotNull SleepRhythmReport sleepRhythmReport, @NotNull Continuation<? super Unit> continuation) {
        SleepRhythm sleepRhythm = new SleepRhythm(sleepRhythmReport.getCycleDay(), sleepRhythmReport.getType());
        ProjectEntityDaoProxy projectEntityDaoProxy = ProjectEntityDaoProxy.INSTANCE;
        Long dbTime = sleepRhythmReport.getDbTime();
        long jLongValue = dbTime != null ? dbTime.longValue() : sleepRhythmReport.getTime();
        Integer dbZoneOffset = sleepRhythmReport.getDbZoneOffset();
        Object objInsertRhyThmDataFromLocal = projectEntityDaoProxy.insertRhyThmDataFromLocal(str, jLongValue, sleepRhythm, dbZoneOffset != null ? dbZoneOffset.intValue() : FitnessDateUtils.getCurrentTZOffsetInSec(), continuation);
        return objInsertRhyThmDataFromLocal == IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objInsertRhyThmDataFromLocal : Unit.INSTANCE;
    }

    @Nullable
    public final SleepDiaryReport convertServerToLocalSleepDiaryReport(@Nullable ProjectDataModel data) {
        int currentTZOffsetInSec = FitnessDateUtils.getCurrentTZOffsetInSec();
        SleepDiaryInfo sleepDiaryInfo = (SleepDiaryInfo) FitnessPersistUtils.INSTANCE.fromJson(data != null ? data.getValue() : null, SleepDiaryInfo.class);
        if (sleepDiaryInfo == null) {
            FitnessLogUtils.w(TAG, "rhythmInfo: empty rhythmInfo(" + (data != null ? data.getValue() : null) + ")");
            return null;
        }
        Integer numValueOf = data != null ? Integer.valueOf(data.getZoneOffset()) : null;
        Intrinsics.checkNotNull(numValueOf);
        int iIntValue = numValueOf.intValue() - currentTZOffsetInSec;
        long j = iIntValue;
        SleepDiaryReport sleepDiaryReport = new SleepDiaryReport(data.getTime() + j);
        sleepDiaryReport.setDbTime(Long.valueOf(data.getTime()));
        sleepDiaryReport.setDbZoneOffset(Integer.valueOf(data.getZoneOffset()));
        sleepDiaryReport.setNapSituation(severToLocalListByNapSituation(sleepDiaryInfo.getNapSituation(), iIntValue));
        sleepDiaryReport.setMedicationBeforeBedtime(severToLocalListByMedication(sleepDiaryInfo.getMedicationBeforeBedtime(), iIntValue));
        sleepDiaryReport.setPreSleepRoutineTime(sleepDiaryInfo.getPreSleepRoutineTime() != null ? Long.valueOf(sleepDiaryInfo.getPreSleepRoutineTime().longValue() + j) : null);
        sleepDiaryReport.setAwakeCount(sleepDiaryInfo.getAwakeCount());
        sleepDiaryReport.setFallAsleepDuration(sleepDiaryInfo.getFallAsleepDuration());
        sleepDiaryReport.setFallAsleepAgainDuration(sleepDiaryInfo.getFallAsleepAgainDuration());
        sleepDiaryReport.setInsomniaDifficulty(sleepDiaryInfo.getInsomniaDifficulty());
        sleepDiaryReport.setMorningGettingUpTime(sleepDiaryInfo.getMorningGettingUpTime() != null ? Long.valueOf(sleepDiaryInfo.getMorningGettingUpTime().longValue() + j) : null);
        sleepDiaryReport.setMorningWakeUpTime(sleepDiaryInfo.getMorningWakeUpTime() != null ? Long.valueOf(sleepDiaryInfo.getMorningWakeUpTime().longValue() + j) : null);
        sleepDiaryReport.setSleepQuality(sleepDiaryInfo.getSleepQuality());
        sleepDiaryReport.setSid(data.getSid());
        return sleepDiaryReport;
    }

    @Nullable
    public final SleepRhythmReport convertServerToLocalSleepRhythmReport(@Nullable ProjectDataModel data) {
        int currentTZOffsetInSec = FitnessDateUtils.getCurrentTZOffsetInSec();
        SleepRhythm sleepRhythm = (SleepRhythm) FitnessPersistUtils.INSTANCE.fromJson(data != null ? data.getValue() : null, SleepRhythm.class);
        if (sleepRhythm == null || sleepRhythm.getCycleDay() <= 0) {
            FitnessLogUtils.w(TAG, "rhythmInfo: empty rhythmInfo(" + (data != null ? data.getValue() : null) + ")");
            return null;
        }
        Integer numValueOf = data != null ? Integer.valueOf(data.getZoneOffset()) : null;
        Intrinsics.checkNotNull(numValueOf);
        SleepRhythmReport sleepRhythmReport = new SleepRhythmReport(sleepRhythm.getType(), sleepRhythm.getCycleDay(), data.getTime() + ((long) (numValueOf.intValue() - currentTZOffsetInSec)));
        sleepRhythmReport.setDbTime(Long.valueOf(data.getTime()));
        sleepRhythmReport.setDbZoneOffset(Integer.valueOf(data.getZoneOffset()));
        sleepRhythmReport.setSid(data.getSid());
        return sleepRhythmReport;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object deleteSleepDiary(@NotNull List<SleepDiaryReport> list, @NotNull Continuation<? super Unit> continuation) {
        AnonymousClass1 anonymousClass1;
        List list2;
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
        Object obj = anonymousClass1.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = anonymousClass1.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(obj);
            ArrayList arrayList = new ArrayList();
            for (SleepDiaryReport sleepDiaryReport : list) {
                if (sleepDiaryReport.getDbTime() != null) {
                    Long dbTime = sleepDiaryReport.getDbTime();
                    Intrinsics.checkNotNull(dbTime);
                    arrayList.add(dbTime);
                }
            }
            ProjectEntityDaoProxy projectEntityDaoProxy = ProjectEntityDaoProxy.INSTANCE;
            anonymousClass1.L$0 = arrayList;
            anonymousClass1.label = 1;
            if (projectEntityDaoProxy.markDelete(ProjectPersistKey.KEY_SLEEP_DIARY, arrayList, anonymousClass1) == coroutine_suspended) {
                return coroutine_suspended;
            }
            list2 = arrayList;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            list2 = (List) anonymousClass1.L$0;
            ResultKt.throwOnFailure(obj);
        }
        FitnessLogUtils.i(TAG, "deleteSleepRhyThm, delete size(" + list2.size() + ")");
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object deleteSleepRhyThm(@NotNull List<SleepRhythmReport> list, @NotNull Continuation<? super Boolean> continuation) {
        C28501 c28501;
        List list2;
        if (continuation instanceof C28501) {
            c28501 = (C28501) continuation;
            int i = c28501.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c28501.label = i - Integer.MIN_VALUE;
            } else {
                c28501 = new C28501(continuation);
            }
        } else {
            c28501 = new C28501(continuation);
        }
        Object obj = c28501.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c28501.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(obj);
            ArrayList arrayList = new ArrayList();
            for (SleepRhythmReport sleepRhythmReport : list) {
                if (sleepRhythmReport.getDbTime() != null) {
                    Long dbTime = sleepRhythmReport.getDbTime();
                    Intrinsics.checkNotNull(dbTime);
                    arrayList.add(dbTime);
                }
            }
            ProjectEntityDaoProxy projectEntityDaoProxy = ProjectEntityDaoProxy.INSTANCE;
            c28501.L$0 = arrayList;
            c28501.label = 1;
            if (projectEntityDaoProxy.markDelete(ProjectPersistKey.KEY_SLEEP_RHYTHM, arrayList, c28501) == coroutine_suspended) {
                return coroutine_suspended;
            }
            list2 = arrayList;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            list2 = (List) c28501.L$0;
            ResultKt.throwOnFailure(obj);
        }
        FitnessLogUtils.i(TAG, "deleteSleepRhyThm, delete size(" + list2.size() + ")");
        return Boxing.boxBoolean(true);
    }

    @NotNull
    public final Flow<ProjectDataModel> getLastDataByKey(@NotNull String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        return ProjectEntityDaoProxy.INSTANCE.getLatestData(key);
    }

    @NotNull
    public final Flow<ProjectDataModel> getLatestDataBeforeTimeByKey(@NotNull String key, long time) {
        Intrinsics.checkNotNullParameter(key, "key");
        return ProjectEntityDaoProxy.INSTANCE.getLatestDataBefore(key, time);
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0017  */
    @Nullable
    public final Object getLimitedSleepRhythm(long j, long j2, int i, int i2, boolean z, @NotNull Continuation<? super List<SleepRhythmReport>> continuation) {
        C28511 c28511;
        ProjectDataRequest projectDataRequest;
        if (continuation instanceof C28511) {
            c28511 = (C28511) continuation;
            int i3 = c28511.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                c28511.label = i3 - Integer.MIN_VALUE;
            } else {
                c28511 = new C28511(continuation);
            }
        } else {
            c28511 = new C28511(continuation);
        }
        C28511 c28512 = c28511;
        Object limitDataList = c28512.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i4 = c28512.label;
        if (i4 == 0) {
            ResultKt.throwOnFailure(limitDataList);
            ProjectEntityDaoProxy projectEntityDaoProxy = ProjectEntityDaoProxy.INSTANCE;
            c28512.L$0 = this;
            c28512.label = 1;
            limitDataList = projectEntityDaoProxy.getLimitDataList(ProjectPersistKey.KEY_SLEEP_RHYTHM, j, j2, i, i2, z, c28512);
            if (limitDataList == coroutine_suspended) {
                return coroutine_suspended;
            }
            projectDataRequest = this;
        } else {
            if (i4 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            projectDataRequest = (ProjectDataRequest) c28512.L$0;
            ResultKt.throwOnFailure(limitDataList);
        }
        List list = (List) limitDataList;
        FitnessLogUtils.i(TAG, "getLimitedSleepRhythm: model size(" + list.size() + ")");
        if (list.isEmpty()) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            SleepRhythmReport sleepRhythmReportConvertServerToLocalSleepRhythmReport = projectDataRequest.convertServerToLocalSleepRhythmReport((ProjectDataModel) it.next());
            if (sleepRhythmReportConvertServerToLocalSleepRhythmReport != null) {
                arrayList.add(sleepRhythmReportConvertServerToLocalSleepRhythmReport);
            }
        }
        return arrayList;
    }

    public final boolean getRhyThmDataValidByAllData() {
        return ProjectEntityDaoProxy.INSTANCE.getDataValidByAllData(ProjectPersistKey.KEY_SLEEP_RHYTHM);
    }

    @NotNull
    public final SleepDiaryReport getSleepDiaryReport(long time, @Nullable String sid) {
        SleepDiaryReport sleepDiaryReportConvertServerToLocalSleepDiaryReport;
        long jChangeZeroOfTheDay = FitnessDateUtils.INSTANCE.changeZeroOfTheDay(time);
        List<ProjectDataModel> dataProjectList = ProjectEntityDaoProxy.INSTANCE.getDataProjectList(ProjectPersistKey.KEY_SLEEP_DIARY, jChangeZeroOfTheDay, jChangeZeroOfTheDay + ((long) RepositoryManager.GAP_A_DAY), sid);
        FitnessLogUtils.i(TAG, "getSleepDiaryReport: model size(" + dataProjectList + ")");
        return (dataProjectList.isEmpty() || (sleepDiaryReportConvertServerToLocalSleepDiaryReport = convertServerToLocalSleepDiaryReport(dataProjectList.get(0))) == null) ? new SleepDiaryReport(jChangeZeroOfTheDay) : sleepDiaryReportConvertServerToLocalSleepDiaryReport;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    @Nullable
    public final Object getSleepDiaryReportListSync(long j, long j2, @Nullable String str, @NotNull Continuation<? super List<SleepDiaryReport>> continuation) {
        C28521 c28521;
        ProjectDataRequest projectDataRequest;
        if (continuation instanceof C28521) {
            c28521 = (C28521) continuation;
            int i = c28521.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c28521.label = i - Integer.MIN_VALUE;
            } else {
                c28521 = new C28521(continuation);
            }
        } else {
            c28521 = new C28521(continuation);
        }
        C28521 c28522 = c28521;
        Object projectReportListSync = c28522.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c28522.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(projectReportListSync);
            ProjectEntityDaoProxy projectEntityDaoProxy = ProjectEntityDaoProxy.INSTANCE;
            c28522.L$0 = this;
            c28522.label = 1;
            projectReportListSync = projectEntityDaoProxy.getProjectReportListSync(ProjectPersistKey.KEY_SLEEP_DIARY, j, j2, str, c28522);
            if (projectReportListSync == coroutine_suspended) {
                return coroutine_suspended;
            }
            projectDataRequest = this;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            projectDataRequest = (ProjectDataRequest) c28522.L$0;
            ResultKt.throwOnFailure(projectReportListSync);
        }
        return projectDataRequest.toSleepDiaryReportList((List) projectReportListSync);
    }

    @NotNull
    public final List<SleepRhythmReport> getSleepRhyThmReportList(long startTime, long endTime, @Nullable String sid) {
        List<ProjectDataModel> dataProjectList = ProjectEntityDaoProxy.INSTANCE.getDataProjectList(ProjectPersistKey.KEY_SLEEP_RHYTHM, startTime, endTime, sid);
        return dataProjectList.isEmpty() ? CollectionsKt__CollectionsKt.emptyList() : toSleepRhyThmReportList(dataProjectList);
    }
}
