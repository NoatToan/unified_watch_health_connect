package com.xiaomi.fit.fitness.export.api;

import androidx.lifecycle.LiveData;
import com.mi.health.course.export.data.CourseInfoItem;
import com.mi.health.course.export.data.CourseItem;
import com.xiaomi.fit.data.common.data.mi.FitnessDataId;
import com.xiaomi.fit.data.common.data.sport.Location;
import com.xiaomi.fit.data.common.data.sport.RecoverRateData;
import com.xiaomi.fit.data.common.data.sport.SportBasicReport;
import com.xiaomi.fit.data.common.data.sport.SportRecordKey;
import com.xiaomi.fit.data.common.util.FitnessDateUtils;
import com.xiaomi.fit.fitness.export.data.annotation.HomeDataType;
import com.xiaomi.fit.fitness.export.data.item.AlgoCurseItem;
import com.xiaomi.fit.fitness.export.data.item.DailyRecordItem;
import com.xiaomi.fit.fitness.export.data.item.EcgMedicalItemReport;
import com.xiaomi.fit.fitness.export.data.item.SwitchSongItem;
import com.xiaomi.fit.fitness.export.data.item.TemperatureCharacterItem;
import com.xiaomi.fit.fitness.export.data.item.TemperatureTrendItem;
import com.xiaomi.fit.fitness.parser.schema.DailyRecordKey;
import com.xiaomi.fitness.sport_eco.SportConstants;
import com.xiaomi.onetrack.OneTrack;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Triple;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.Flow;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000Ø\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0007\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0002\b\u0005\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\bf\u0018\u0000 j2\u00020\u0001:\u0001jJ\"\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH&J\"\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\tH&J\u001e\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00030\f2\u0006\u0010\r\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\tH&J&\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00030\f2\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\tH&J,\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00030\f2\u0006\u0010\u0011\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\tH¦@¢\u0006\u0002\u0010\u0012JD\u0010\u0013\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150\f0\u00142\u0006\u0010\u0016\u001a\u00020\u00172\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\r\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\t2\u0006\u0010\u0018\u001a\u00020\u0007H&JJ\u0010\u0019\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150\f0\u00140\u001a2\u0006\u0010\u0016\u001a\u00020\u00172\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\r\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\t2\u0006\u0010\u0018\u001a\u00020\u0007H&J>\u0010\u001b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150\f0\u001a2\u0006\u0010\u001c\u001a\u00020\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\r\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\t2\u0006\u0010\u0018\u001a\u00020\u0007H&JU\u0010\u001d\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150\f0\u00142\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\r\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\t2\u0006\u0010\u0018\u001a\u00020\u00072\u0012\u0010\u001e\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00050\u001f\"\u00020\u0005H&¢\u0006\u0002\u0010 J(\u0010!\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u001c\u001a\u00020\u00052\b\b\u0002\u0010\u000e\u001a\u00020\t2\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005H&J4\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00050\f2\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\r\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\t2\u0006\u0010\u0018\u001a\u00020\u0007H¦@¢\u0006\u0002\u0010#J \u0010$\u001a\u0004\u0018\u00010%2\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010&\u001a\u00020'H¦@¢\u0006\u0002\u0010(J<\u0010)\u001a \u0012\u0004\u0012\u00020\u0007\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020*\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\f0\u00140\u00142\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010+\u001a\u00020\u0003H¦@¢\u0006\u0002\u0010,J<\u0010-\u001a \u0012\u0004\u0012\u00020\u0007\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020*\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\f0\u00140\u00142\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010+\u001a\u00020\u0003H¦@¢\u0006\u0002\u0010,J(\u0010.\u001a\n\u0012\u0004\u0012\u00020/\u0018\u00010\f2\b\u00100\u001a\u0004\u0018\u00010\u00052\u0006\u00101\u001a\u00020\u0005H¦@¢\u0006\u0002\u00102J\u0018\u00103\u001a\u0004\u0018\u00010\u00052\u0006\u00100\u001a\u00020\u0005H¦@¢\u0006\u0002\u00104J \u00105\u001a\u0004\u0018\u0001062\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010+\u001a\u00020\u0003H¦@¢\u0006\u0002\u0010,J\u0016\u00107\u001a\b\u0012\u0004\u0012\u00020\u0007082\u0006\u00109\u001a\u00020\tH&J(\u0010:\u001a\u0004\u0018\u00010;2\u0006\u0010<\u001a\u00020=2\u0006\u0010>\u001a\u00020\u00072\u0006\u0010?\u001a\u00020\u0007H¦@¢\u0006\u0002\u0010@J8\u0010A\u001a$\u0012\f\u0012\n\u0012\u0004\u0012\u00020%\u0018\u00010C\u0012\f\u0012\n\u0012\u0004\u0012\u00020\t\u0018\u00010\f\u0012\u0004\u0012\u00020\t0B2\u0006\u0010D\u001a\u00020\tH¦@¢\u0006\u0002\u0010EJ,\u0010F\u001a\b\u0012\u0004\u0012\u00020G0\f2\u0006\u0010H\u001a\u00020\t2\u0006\u0010I\u001a\u00020\t2\u0006\u0010J\u001a\u00020\u0007H¦@¢\u0006\u0002\u0010KJ8\u0010L\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020M0\f0\u00142\u0006\u0010H\u001a\u00020\t2\u0006\u0010I\u001a\u00020\t2\u0006\u0010J\u001a\u00020\u0007H¦@¢\u0006\u0002\u0010KJ1\u0010N\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u001c\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\t2\b\u0010O\u001a\u0004\u0018\u00010\u0007H&¢\u0006\u0002\u0010PJ2\u0010Q\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\f2\u0006\u0010R\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\t2\b\b\u0002\u0010\u0018\u001a\u00020\u0007H&J\u001c\u0010S\u001a\b\u0012\u0004\u0012\u00020T0\f2\u0006\u0010U\u001a\u00020\tH¦@¢\u0006\u0002\u0010EJ,\u0010V\u001a\u0010\u0012\u0004\u0012\u00020%\u0012\u0004\u0012\u00020\u0005\u0018\u00010W2\u0006\u00100\u001a\u00020\u00052\u0006\u00101\u001a\u00020\u0005H¦@¢\u0006\u0002\u00102J \u0010X\u001a\u0004\u0018\u00010%2\u0006\u00100\u001a\u00020\u00052\u0006\u00101\u001a\u00020\u0005H¦@¢\u0006\u0002\u00102J\u000e\u0010Y\u001a\u00020ZH¦@¢\u0006\u0002\u0010[J\u0016\u0010\\\u001a\u00020]2\u0006\u0010^\u001a\u00020_H¦@¢\u0006\u0002\u0010`J\u000e\u0010a\u001a\b\u0012\u0004\u0012\u00020b0\fH&J\u0016\u0010c\u001a\u00020d2\u0006\u0010e\u001a\u00020bH¦@¢\u0006\u0002\u0010fJ\b\u0010g\u001a\u00020dH&J\u0016\u0010h\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0007\u0018\u00010WH&J\b\u0010i\u001a\u00020\u0007H&¨\u0006k"}, d2 = {"Lcom/xiaomi/fit/fitness/export/api/FitnessDataGetter;", "", "getTheSportReport", "Lcom/xiaomi/fit/data/common/data/sport/SportBasicReport;", "sid", "", DailyRecordKey.sportType, "", "time", "", "key", "getSportReport", "", "startTime", "endTime", "getSportReportByType", "getSportReportByCategory", "category", "(Ljava/lang/String;JJLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getAllDailyRecord", "", "Lcom/xiaomi/fit/fitness/export/data/item/DailyRecordItem;", "dataType", "Lcom/xiaomi/fit/fitness/export/data/annotation/HomeDataType;", "zoneOffsetInSec", "getAllDailyRecordAsync", "Landroidx/lifecycle/LiveData;", "getDailyRecordAsync", "persistKey", "getTheDailyItems", "keys", "", "(Ljava/lang/String;JJI[Ljava/lang/String;)Ljava/util/Map;", "getRecentOneData", "getTheRecordSource", "(Lcom/xiaomi/fit/fitness/export/data/annotation/HomeDataType;JJILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getFDSStoreData", "", "dataId", "Lcom/xiaomi/fit/data/common/data/mi/FitnessDataId;", "(Ljava/lang/String;Lcom/xiaomi/fit/data/common/data/mi/FitnessDataId;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getSportGpsData", "Lcom/xiaomi/fit/data/common/data/sport/SportRecordKey;", "report", "(Ljava/lang/String;Lcom/xiaomi/fit/data/common/data/sport/SportBasicReport;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getSportRecordData", "getRouteGpsData", "Lcom/xiaomi/fit/data/common/data/sport/Location;", "url", "routeName", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getPixelStringData", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getRecoverRateData", "Lcom/xiaomi/fit/data/common/data/sport/RecoverRateData;", "observerRecentCount", "Lkotlinx/coroutines/flow/Flow;", "startSec", "getEcgRecordData", "", "ecgRecord", "Lcom/xiaomi/fit/fitness/export/data/item/EcgMedicalItemReport;", "durationInSec", "sparsePoints", "(Lcom/xiaomi/fit/fitness/export/data/item/EcgMedicalItemReport;IILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getTempFileData", "Lkotlin/Triple;", "", "startDateSec", "(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getTempTrendData", "Lcom/xiaomi/fit/fitness/export/data/item/TemperatureTrendItem;", "startDate", "endDate", OneTrack.Param.TZ, "(JJILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getTempCharacterRecordData", "Lcom/xiaomi/fit/fitness/export/data/item/TemperatureCharacterItem;", "getTheDailyRecord", "toZoneOffsetInSec", "(Ljava/lang/String;Ljava/lang/String;JLjava/lang/Integer;)Lcom/xiaomi/fit/fitness/export/data/item/DailyRecordItem;", "getCgmBloodSugar", "did", "getSwitchSong", "Lcom/xiaomi/fit/fitness/export/data/item/SwitchSongItem;", SportConstants.KEY_TIMESTAMP, "getTrackRawData", "Lkotlin/Pair;", "getTrackByteData", "getPullRecentOneYearDataResult", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getCourseInfo", "Lcom/mi/health/course/export/data/CourseInfoItem;", "reqItem", "Lcom/mi/health/course/export/data/CourseItem;", "(Lcom/mi/health/course/export/data/CourseItem;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getAlgoCurseData", "Lcom/xiaomi/fit/fitness/export/data/item/AlgoCurseItem;", "insertAlgoCurseData", "", "item", "(Lcom/xiaomi/fit/fitness/export/data/item/AlgoCurseItem;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "cleanAlgoCurseData", "getAlgoCursePeriod", "getAlgoCurseStatus", "Companion", "fitness-data-export_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface FitnessDataGetter {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/xiaomi/fit/fitness/export/api/FitnessDataGetter$Companion;", "", "<init>", "()V", "fitness-data-export_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class DefaultImpls {
        public static /* synthetic */ List getCgmBloodSugar$default(FitnessDataGetter fitnessDataGetter, String str, long j, long j2, int i, int i2, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getCgmBloodSugar");
            }
            if ((i2 & 8) != 0) {
                i = FitnessDateUtils.getCurrentTZOffsetInSec();
            }
            return fitnessDataGetter.getCgmBloodSugar(str, j, j2, i);
        }

        public static /* synthetic */ DailyRecordItem getRecentOneData$default(FitnessDataGetter fitnessDataGetter, String str, long j, String str2, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getRecentOneData");
            }
            if ((i & 2) != 0) {
                j = 0;
            }
            if ((i & 4) != 0) {
                str2 = null;
            }
            return fitnessDataGetter.getRecentOneData(str, j, str2);
        }
    }

    void cleanAlgoCurseData();

    @NotNull
    List<AlgoCurseItem> getAlgoCurseData();

    @Nullable
    Pair<Integer, Integer> getAlgoCursePeriod();

    int getAlgoCurseStatus();

    @NotNull
    Map<String, List<DailyRecordItem>> getAllDailyRecord(@NotNull HomeDataType dataType, @Nullable String sid, long startTime, long endTime, int zoneOffsetInSec);

    @NotNull
    LiveData<Map<String, List<DailyRecordItem>>> getAllDailyRecordAsync(@NotNull HomeDataType dataType, @Nullable String sid, long startTime, long endTime, int zoneOffsetInSec);

    @Nullable
    List<DailyRecordItem> getCgmBloodSugar(@NotNull String did, long startTime, long endTime, int zoneOffsetInSec);

    @Nullable
    Object getCourseInfo(@NotNull CourseItem courseItem, @NotNull Continuation<? super CourseInfoItem> continuation);

    @NotNull
    LiveData<List<DailyRecordItem>> getDailyRecordAsync(@NotNull String persistKey, @Nullable String sid, long startTime, long endTime, int zoneOffsetInSec);

    @Nullable
    Object getEcgRecordData(@NotNull EcgMedicalItemReport ecgMedicalItemReport, int i, int i2, @NotNull Continuation<? super float[]> continuation);

    @Nullable
    Object getFDSStoreData(@NotNull String str, @NotNull FitnessDataId fitnessDataId, @NotNull Continuation<? super byte[]> continuation);

    @Nullable
    Object getPixelStringData(@NotNull String str, @NotNull Continuation<? super String> continuation);

    @Nullable
    Object getPullRecentOneYearDataResult(@NotNull Continuation<? super Boolean> continuation);

    @Nullable
    DailyRecordItem getRecentOneData(@NotNull String persistKey, long endTime, @Nullable String sid);

    @Nullable
    Object getRecoverRateData(@NotNull String str, @NotNull SportBasicReport sportBasicReport, @NotNull Continuation<? super RecoverRateData> continuation);

    @Nullable
    Object getRouteGpsData(@Nullable String str, @NotNull String str2, @NotNull Continuation<? super List<? extends Location>> continuation);

    @Nullable
    Object getSportGpsData(@NotNull String str, @NotNull SportBasicReport sportBasicReport, @NotNull Continuation<? super Map<Integer, ? extends Map<SportRecordKey, ? extends List<? extends Object>>>> continuation);

    @Nullable
    Object getSportRecordData(@NotNull String str, @NotNull SportBasicReport sportBasicReport, @NotNull Continuation<? super Map<Integer, ? extends Map<SportRecordKey, ? extends List<? extends Object>>>> continuation);

    @NotNull
    List<SportBasicReport> getSportReport(long startTime, long endTime);

    @Nullable
    Object getSportReportByCategory(@NotNull String str, long j, long j2, @NotNull Continuation<? super List<SportBasicReport>> continuation);

    @NotNull
    List<SportBasicReport> getSportReportByType(int sportType, long startTime, long endTime);

    @Nullable
    Object getSwitchSong(long j, @NotNull Continuation<? super List<SwitchSongItem>> continuation);

    @Nullable
    Object getTempCharacterRecordData(long j, long j2, int i, @NotNull Continuation<? super Map<String, ? extends List<TemperatureCharacterItem>>> continuation);

    @Nullable
    Object getTempFileData(long j, @NotNull Continuation<? super Triple<? extends List<byte[]>, ? extends List<Long>, Long>> continuation);

    @Nullable
    Object getTempTrendData(long j, long j2, int i, @NotNull Continuation<? super List<TemperatureTrendItem>> continuation);

    @NotNull
    Map<String, List<DailyRecordItem>> getTheDailyItems(@Nullable String sid, long startTime, long endTime, int zoneOffsetInSec, @NotNull String... keys);

    @Nullable
    DailyRecordItem getTheDailyRecord(@NotNull String persistKey, @NotNull String sid, long time, @Nullable Integer toZoneOffsetInSec);

    @Nullable
    Object getTheRecordSource(@NotNull HomeDataType homeDataType, long j, long j2, int i, @NotNull Continuation<? super List<String>> continuation);

    @Nullable
    SportBasicReport getTheSportReport(@NotNull String sid, int sportType, long time);

    @Nullable
    SportBasicReport getTheSportReport(@NotNull String sid, @NotNull String key, long time);

    @Nullable
    Object getTrackByteData(@NotNull String str, @NotNull String str2, @NotNull Continuation<? super byte[]> continuation);

    @Nullable
    Object getTrackRawData(@NotNull String str, @NotNull String str2, @NotNull Continuation<? super Pair<byte[], String>> continuation);

    @Nullable
    Object insertAlgoCurseData(@NotNull AlgoCurseItem algoCurseItem, @NotNull Continuation<? super Unit> continuation);

    @NotNull
    Flow<Integer> observerRecentCount(long startSec);
}
