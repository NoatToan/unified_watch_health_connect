package com.xiaomi.fit.fitness;

import com.mi.health.course.export.CourseApi;
import com.mi.health.course.export.CourseApiKt;
import com.mi.health.course.export.data.CourseInfoItem;
import com.mi.health.course.export.data.CourseItem;
import com.xiaomi.fit.data.common.data.sport.SportBasicReport;
import com.xiaomi.fit.data.common.log.FitnessLogUtils;
import com.xiaomi.fit.data.common.util.FitnessDateUtils;
import com.xiaomi.fit.fitness.export.data.FitnessPersistKey;
import com.xiaomi.fit.fitness.export.data.SportReportKey;
import com.xiaomi.fit.fitness.export.data.item.DailyRecordItem;
import com.xiaomi.fit.fitness.persist.db.utils.SportReportDaoUtils;
import com.xiaomi.fitness.training_plan_export.manager.ITrainingManager;
import com.xiaomi.fitness.training_plan_export.manager.TrainingManagerExtKt;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u0018\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u00022\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u001a \u0010\u0005\u001a\u0004\u0018\u00010\u0006*\u00020\u00072\u0006\u0010\b\u001a\u00020\u00042\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u001a\u0010\u0010\n\u001a\u0004\u0018\u00010\u0002H\u0086@¢\u0006\u0002\u0010\u000b\"\u000e\u0010\t\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"toSportDBKey", "Lcom/xiaomi/fit/fitness/SportDBKey;", "Lcom/xiaomi/fit/data/common/data/sport/SportBasicReport;", "sid", "", "toFitnessDBKey", "Lcom/xiaomi/fit/fitness/FitnessDBKey;", "Lcom/xiaomi/fit/fitness/export/data/item/DailyRecordItem;", "persistKey", "TAG", "getLatestSportReport", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "fitness-data-core_chinaProductRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class DataExtKt {

    @NotNull
    public static final String TAG = "DataExt";

    /* JADX INFO: renamed from: com.xiaomi.fit.fitness.DataExtKt$getLatestSportReport$1, reason: invalid class name */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fit.fitness.DataExtKt", f = "DataExt.kt", i = {0}, l = {199}, m = "getLatestSportReport", n = {"report"}, s = {"L$0"})
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
            return DataExtKt.getLatestSportReport(this);
        }
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0067  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public static final Object getLatestSportReport(@NotNull Continuation<? super SportBasicReport> continuation) {
        AnonymousClass1 anonymousClass1;
        long jLongValue;
        SportBasicReport sportBasicReport;
        Exception e;
        Long cloudCourseId;
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
            SportBasicReport recentOneSport = SportReportDaoUtils.INSTANCE.getRecentOneSport(FitnessDateUtils.getTodayZeroTimeInSec() + TimeUnit.DAYS.toSeconds(1L), FitnessDateUtils.getCurrentTZOffsetInSec());
            if (recentOneSport == null) {
                jLongValue = 0;
                return recentOneSport == null ? recentOneSport : recentOneSport;
            }
            try {
                Long trainingPlanId = recentOneSport.getTrainingPlanId();
                if (trainingPlanId != null) {
                    jLongValue = trainingPlanId.longValue();
                } else {
                    jLongValue = 0;
                }
                if (recentOneSport == null && (cloudCourseId = recentOneSport.getCloudCourseId()) != null) {
                    long jLongValue2 = cloudCourseId.longValue();
                    if (jLongValue2 <= 0) {
                        return recentOneSport;
                    }
                    Integer cloudCourseSource = recentOneSport.getCloudCourseSource();
                    int iIntValue = cloudCourseSource != null ? cloudCourseSource.intValue() : 0;
                    if (jLongValue > 0 && TrainingManagerExtKt.getInstance(ITrainingManager.INSTANCE).isCourseIdInAbilityRange(jLongValue2)) {
                        iIntValue = 3;
                    }
                    CourseItem courseItem = new CourseItem(iIntValue, String.valueOf(jLongValue2));
                    CourseApi courseApi = CourseApiKt.getCourseApi();
                    anonymousClass1.L$0 = recentOneSport;
                    anonymousClass1.label = 1;
                    Object courseInfo = courseApi.getCourseInfo(courseItem, anonymousClass1);
                    if (courseInfo == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    sportBasicReport = recentOneSport;
                    obj = courseInfo;
                }
            } catch (Exception e2) {
                sportBasicReport = recentOneSport;
                e = e2;
                FitnessLogUtils.i(TAG, "CourseInfo: " + e.getMessage());
            }
            return sportBasicReport;
        }
        if (i2 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        sportBasicReport = (SportBasicReport) anonymousClass1.L$0;
        try {
            ResultKt.throwOnFailure(obj);
        } catch (Exception e3) {
            e = e3;
            FitnessLogUtils.i(TAG, "CourseInfo: " + e.getMessage());
        }
        sportBasicReport.setCourseName(((CourseInfoItem) obj).getCourseInfoItem().getCourseName());
        return sportBasicReport;
    }

    @Nullable
    public static final FitnessDBKey toFitnessDBKey(@NotNull DailyRecordItem dailyRecordItem, @NotNull String persistKey, @Nullable String str) {
        Intrinsics.checkNotNullParameter(dailyRecordItem, "<this>");
        Intrinsics.checkNotNullParameter(persistKey, "persistKey");
        if (str == null) {
            str = dailyRecordItem.getSid();
        }
        if (str != null) {
            String dbKey = dailyRecordItem.getDbKey();
            if (dbKey != null) {
                persistKey = dbKey;
            }
            Long dbTime = dailyRecordItem.getDbTime();
            return new FitnessDBKey(str, persistKey, dbTime != null ? dbTime.longValue() : dailyRecordItem.getTimestamp());
        }
        FitnessLogUtils.w("SportReportDaoUtils", "no sid(" + dailyRecordItem + ")");
        return null;
    }

    public static /* synthetic */ FitnessDBKey toFitnessDBKey$default(DailyRecordItem dailyRecordItem, String str, String str2, int i, Object obj) {
        if ((i & 2) != 0) {
            str2 = null;
        }
        return toFitnessDBKey(dailyRecordItem, str, str2);
    }

    @Nullable
    public static final SportDBKey toSportDBKey(@NotNull SportBasicReport sportBasicReport, @Nullable String str) {
        Intrinsics.checkNotNullParameter(sportBasicReport, "<this>");
        if (str == null) {
            str = sportBasicReport.getSid();
        }
        String str2 = str;
        if (str2 == null) {
            FitnessLogUtils.w("SportReportDaoUtils", "no sid(sportType=" + sportBasicReport.getSportType() + ")");
            return null;
        }
        SportReportKey sportReportKey = FitnessPersistKey.INSTANCE.getSportReportKey(sportBasicReport.getSportType());
        if (sportReportKey != null) {
            Long dbKeyTime = sportBasicReport.getDbKeyTime();
            return new SportDBKey(str2, dbKeyTime != null ? dbKeyTime.longValue() : sportBasicReport.getStartTime(), sportBasicReport.getSportType(), sportReportKey.getKey(), sportReportKey.getCategory(), FitnessDateUtils.getTzOffsetInSecBy15min(sportBasicReport.getTzIn15Min()));
        }
        FitnessLogUtils.w("SportReportDaoUtils", "not support key(sportType=" + sportBasicReport.getSportType() + ")");
        return null;
    }

    public static /* synthetic */ SportDBKey toSportDBKey$default(SportBasicReport sportBasicReport, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        return toSportDBKey(sportBasicReport, str);
    }
}
