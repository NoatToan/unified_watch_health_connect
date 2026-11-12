package com.xiaomi.fit.fitness.parser.data;

import com.xiaomi.fit.data.common.data.sport.RecoverRateData;
import com.xiaomi.fit.data.common.data.sport.SportBasicReport;
import com.xiaomi.onetrack.OneTrack;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u009e\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\u0012\n\u0002\b\b\u0018\u00002\u00020\u0001:\u0001OB\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0019\u0010\n\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0010¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\u0013\u001a\u0004\u0018\u00010\u0014¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0013\u0010\u0017\u001a\u0004\u0018\u00010\u0018¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0019\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\u001c\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u000eR\u0013\u0010\u001e\u001a\u0004\u0018\u00010\u001f¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R%\u0010\"\u001a\u0016\u0012\u0004\u0012\u00020$\u0012\n\u0012\b\u0012\u0004\u0012\u00020%0\u000b\u0018\u00010#¢\u0006\b\n\u0000\u001a\u0004\b&\u0010'R%\u0010(\u001a\u0016\u0012\u0004\u0012\u00020$\u0012\n\u0012\b\u0012\u0004\u0012\u00020)0\u000b\u0018\u00010#¢\u0006\b\n\u0000\u001a\u0004\b*\u0010'R\u0013\u0010+\u001a\u0004\u0018\u00010,¢\u0006\b\n\u0000\u001a\u0004\b-\u0010.R\u0019\u0010/\u001a\n\u0012\u0004\u0012\u000200\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b1\u0010\u000eR\u0019\u00102\u001a\n\u0012\u0004\u0012\u000203\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b4\u0010\u000eR\u0013\u00105\u001a\u0004\u0018\u000106¢\u0006\b\n\u0000\u001a\u0004\b7\u00108R\u0013\u00109\u001a\u0004\u0018\u00010:¢\u0006\b\n\u0000\u001a\u0004\b;\u0010<R\u0011\u0010=\u001a\u00020>¢\u0006\b\n\u0000\u001a\u0004\b?\u0010@R\u001e\u0010A\u001a\u0004\u0018\u00010$X\u0086\u000e¢\u0006\u0010\n\u0002\u0010F\u001a\u0004\bB\u0010C\"\u0004\bD\u0010ER\u001c\u0010G\u001a\u0004\u0018\u00010HX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bI\u0010J\"\u0004\bK\u0010LR\u0013\u0010M\u001a\u0004\u0018\u00010H¢\u0006\b\n\u0000\u001a\u0004\bN\u0010J¨\u0006P"}, d2 = {"Lcom/xiaomi/fit/fitness/parser/data/FitnessParseResult;", "", "builder", "Lcom/xiaomi/fit/fitness/parser/data/FitnessParseResult$Builder;", "<init>", "(Lcom/xiaomi/fit/fitness/parser/data/FitnessParseResult$Builder;)V", "dailyReport", "Lcom/xiaomi/fit/fitness/parser/data/ParsedDailyReport;", "getDailyReport", "()Lcom/xiaomi/fit/fitness/parser/data/ParsedDailyReport;", "dailyRecordList", "", "Lcom/xiaomi/fit/fitness/parser/data/ParsedDailyRecord;", "getDailyRecordList", "()Ljava/util/List;", "nightSleepReport", "Lcom/xiaomi/fit/fitness/parser/data/NightSleepReport;", "getNightSleepReport", "()Lcom/xiaomi/fit/fitness/parser/data/NightSleepReport;", "daytimeSleepReport", "Lcom/xiaomi/fit/fitness/parser/data/DaytimeSleepReport;", "getDaytimeSleepReport", "()Lcom/xiaomi/fit/fitness/parser/data/DaytimeSleepReport;", "userInfo", "Lcom/xiaomi/fit/fitness/parser/data/FitnessUserInfo;", "getUserInfo", "()Lcom/xiaomi/fit/fitness/parser/data/FitnessUserInfo;", "measureDataList", "Lcom/xiaomi/fit/fitness/parser/data/MeasureData;", "getMeasureDataList", "sportReport", "Lcom/xiaomi/fit/data/common/data/sport/SportBasicReport;", "getSportReport", "()Lcom/xiaomi/fit/data/common/data/sport/SportBasicReport;", "gpsRecord", "", "", "Lcom/xiaomi/fit/fitness/parser/data/GpsRecord;", "getGpsRecord", "()Ljava/util/Map;", "sportRecord", "Lcom/xiaomi/fit/fitness/parser/data/SportRecord;", "getSportRecord", "allDaySleepReport", "Lcom/xiaomi/fit/fitness/parser/data/AllDaySleepParseData;", "getAllDaySleepReport", "()Lcom/xiaomi/fit/fitness/parser/data/AllDaySleepParseData;", "abnormalRecords", "Lcom/xiaomi/fit/fitness/parser/data/AbnormalRecord;", "getAbnormalRecords", "weightRecordList", "Lcom/xiaomi/fit/fitness/parser/data/WeightRecord;", "getWeightRecordList", "ecgMeasureResult", "Lcom/xiaomi/fit/fitness/parser/data/EcgMeasureResult;", "getEcgMeasureResult", "()Lcom/xiaomi/fit/fitness/parser/data/EcgMeasureResult;", "recoverRateData", "Lcom/xiaomi/fit/data/common/data/sport/RecoverRateData;", "getRecoverRateData", "()Lcom/xiaomi/fit/data/common/data/sport/RecoverRateData;", "dataInvalidVersion", "", "getDataInvalidVersion", "()Z", "dataIdVersion", "getDataIdVersion", "()Ljava/lang/Integer;", "setDataIdVersion", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "gpsTgcData", "", "getGpsTgcData", "()[B", "setGpsTgcData", "([B)V", "temperatureResult", "getTemperatureResult", "Builder", "fitness-parser_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class FitnessParseResult {

    @Nullable
    private final List<AbnormalRecord> abnormalRecords;

    @Nullable
    private final AllDaySleepParseData allDaySleepReport;

    @Nullable
    private final List<ParsedDailyRecord> dailyRecordList;

    @Nullable
    private final ParsedDailyReport dailyReport;

    @Nullable
    private Integer dataIdVersion;
    private final boolean dataInvalidVersion;

    @Nullable
    private final DaytimeSleepReport daytimeSleepReport;

    @Nullable
    private final EcgMeasureResult ecgMeasureResult;

    @Nullable
    private final Map<Integer, List<GpsRecord>> gpsRecord;

    @Nullable
    private byte[] gpsTgcData;

    @Nullable
    private final List<MeasureData> measureDataList;

    @Nullable
    private final NightSleepReport nightSleepReport;

    @Nullable
    private final RecoverRateData recoverRateData;

    @Nullable
    private final Map<Integer, List<SportRecord>> sportRecord;

    @Nullable
    private final SportBasicReport sportReport;

    @Nullable
    private final byte[] temperatureResult;

    @Nullable
    private final FitnessUserInfo userInfo;

    @Nullable
    private final List<WeightRecord> weightRecordList;

    @Metadata(d1 = {"\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0012\n\u0002\b!\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010)\u001a\u0004\u0018\u00010(J\u000e\u0010'\u001a\u00020\u00002\u0006\u0010*\u001a\u00020(J\b\u0010,\u001a\u0004\u0018\u00010\u0005J\u000e\u0010-\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007J\b\u0010.\u001a\u0004\u0018\u00010\nJ\b\u0010/\u001a\u0004\u0018\u00010\fJ\b\u00100\u001a\u0004\u0018\u00010\u000eJ\u000e\u00101\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u0007J\b\u00102\u001a\u0004\u0018\u00010\u0012J\u001a\u00103\u001a\u0016\u0012\u0004\u0012\u00020\u0015\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00180\u0007\u0018\u00010\u0014J\u001a\u00104\u001a\u0016\u0012\u0004\u0012\u00020\u0015\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00160\u0007\u0018\u00010\u0014J\b\u00105\u001a\u0004\u0018\u00010\u001aJ\u000e\u00106\u001a\n\u0012\u0004\u0012\u00020\u001c\u0018\u00010\u0007J\u000e\u00107\u001a\n\u0012\u0004\u0012\u00020\u001e\u0018\u00010\u0007J\b\u00108\u001a\u0004\u0018\u00010 J\b\u00109\u001a\u0004\u0018\u00010\"J\u0006\u0010:\u001a\u00020$J\b\u0010;\u001a\u0004\u0018\u00010(J\u0014\u0010\u001b\u001a\u00020\u00002\f\u0010<\u001a\b\u0012\u0004\u0012\u00020\u001c0\u0007J\u000e\u0010=\u001a\u00020\u00002\u0006\u0010>\u001a\u00020\u0005J\u0014\u0010?\u001a\u00020\u00002\f\u0010@\u001a\b\u0012\u0004\u0012\u00020\b0\u0007J\u000e\u0010\t\u001a\u00020\u00002\u0006\u0010>\u001a\u00020\nJ\u000e\u0010\u000b\u001a\u00020\u00002\u0006\u0010>\u001a\u00020\fJ\u000e\u0010\r\u001a\u00020\u00002\u0006\u0010A\u001a\u00020\u000eJ\u0014\u0010B\u001a\u00020\u00002\f\u0010C\u001a\b\u0012\u0004\u0012\u00020\u00100\u0007J\u000e\u0010\u0011\u001a\u00020\u00002\u0006\u0010>\u001a\u00020\u0012J \u0010\u0017\u001a\u00020\u00002\u0018\u0010D\u001a\u0014\u0012\u0004\u0012\u00020\u0015\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00180\u00070\u0014J \u0010\u0013\u001a\u00020\u00002\u0018\u0010D\u001a\u0014\u0012\u0004\u0012\u00020\u0015\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00160\u00070\u0014J\u000e\u0010!\u001a\u00020\u00002\u0006\u0010D\u001a\u00020\"J\u000e\u0010E\u001a\u00020\u00002\u0006\u0010>\u001a\u00020\u001aJ\u0014\u0010\u001d\u001a\u00020\u00002\f\u0010@\u001a\b\u0012\u0004\u0012\u00020\u001e0\u0007J\u000e\u0010\u001f\u001a\u00020\u00002\u0006\u0010F\u001a\u00020 J\u000e\u0010#\u001a\u00020\u00002\u0006\u0010G\u001a\u00020$J\u000e\u0010+\u001a\u00020\u00002\u0006\u0010H\u001a\u00020(J\u0006\u0010I\u001a\u00020JR\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u0082\u000e¢\u0006\u0002\n\u0000R\"\u0010\u0013\u001a\u0016\u0012\u0004\u0012\u00020\u0015\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00160\u0007\u0018\u00010\u0014X\u0082\u000e¢\u0006\u0002\n\u0000R\"\u0010\u0017\u001a\u0016\u0012\u0004\u0012\u00020\u0015\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00180\u0007\u0018\u00010\u0014X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0019\u001a\u0004\u0018\u00010\u001aX\u0082\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\u001c\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\u001e\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u001f\u001a\u0004\u0018\u00010 X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010!\u001a\u0004\u0018\u00010\"X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010#\u001a\u00020$X\u0082\u000e¢\u0006\u0002\n\u0000R\u0012\u0010%\u001a\u0004\u0018\u00010\u0015X\u0082\u000e¢\u0006\u0004\n\u0002\u0010&R\u0010\u0010'\u001a\u0004\u0018\u00010(X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010+\u001a\u0004\u0018\u00010(X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006K"}, d2 = {"Lcom/xiaomi/fit/fitness/parser/data/FitnessParseResult$Builder;", "", "<init>", "()V", "dailyReport", "Lcom/xiaomi/fit/fitness/parser/data/ParsedDailyReport;", "dailyRecordList", "", "Lcom/xiaomi/fit/fitness/parser/data/ParsedDailyRecord;", "nightSleepReport", "Lcom/xiaomi/fit/fitness/parser/data/NightSleepReport;", "daytimeSleepReport", "Lcom/xiaomi/fit/fitness/parser/data/DaytimeSleepReport;", "userInfo", "Lcom/xiaomi/fit/fitness/parser/data/FitnessUserInfo;", "measureDataList", "Lcom/xiaomi/fit/fitness/parser/data/MeasureData;", "sportReport", "Lcom/xiaomi/fit/data/common/data/sport/SportBasicReport;", "gpsRecord", "", "", "Lcom/xiaomi/fit/fitness/parser/data/GpsRecord;", "sportRecord", "Lcom/xiaomi/fit/fitness/parser/data/SportRecord;", "allDaySleepReport", "Lcom/xiaomi/fit/fitness/parser/data/AllDaySleepParseData;", "abnormalRecords", "Lcom/xiaomi/fit/fitness/parser/data/AbnormalRecord;", "weightRecordList", "Lcom/xiaomi/fit/fitness/parser/data/WeightRecord;", "ecgMeasureResult", "Lcom/xiaomi/fit/fitness/parser/data/EcgMeasureResult;", "recoverRateRecord", "Lcom/xiaomi/fit/data/common/data/sport/RecoverRateData;", "dataInvalidVersion", "", "dataIdVersion", "Ljava/lang/Integer;", "gpsTgcData", "", "getGpsTgcData", "data", "temperatureResult", "getDailyReport", "getDailyRecord", "getNightSleepReport", "getDaytimeSleepReport", "getUserInfo", "getMeasureData", "getSportReport", "getSportRecord", "getGpsRecord", "getAllDaySleepData", "getAbnormalRecords", "getWeightRecordList", "getEcgMeasureResult", "getRecoverRateData", "getDataInvalidVersion", "getTemperatureResult", "list", "dailyDataReport", "report", "dailyDataRecord", "recordList", "info", "measureData", "dataList", "record", "allDaySleep", "ecgResult", "invalid", "tempResult", OneTrack.Param.BUILD, "Lcom/xiaomi/fit/fitness/parser/data/FitnessParseResult;", "fitness-parser_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Builder {

        @Nullable
        private List<AbnormalRecord> abnormalRecords;

        @Nullable
        private AllDaySleepParseData allDaySleepReport;

        @Nullable
        private List<ParsedDailyRecord> dailyRecordList;

        @Nullable
        private ParsedDailyReport dailyReport;

        @Nullable
        private Integer dataIdVersion;
        private boolean dataInvalidVersion;

        @Nullable
        private DaytimeSleepReport daytimeSleepReport;

        @Nullable
        private EcgMeasureResult ecgMeasureResult;

        @Nullable
        private Map<Integer, ? extends List<GpsRecord>> gpsRecord;

        @Nullable
        private byte[] gpsTgcData;

        @Nullable
        private List<MeasureData> measureDataList;

        @Nullable
        private NightSleepReport nightSleepReport;

        @Nullable
        private RecoverRateData recoverRateRecord;

        @Nullable
        private Map<Integer, ? extends List<SportRecord>> sportRecord;

        @Nullable
        private SportBasicReport sportReport;

        @Nullable
        private byte[] temperatureResult;

        @Nullable
        private FitnessUserInfo userInfo;

        @Nullable
        private List<WeightRecord> weightRecordList;

        @NotNull
        public final Builder abnormalRecords(@NotNull List<AbnormalRecord> list) {
            Intrinsics.checkNotNullParameter(list, "list");
            this.abnormalRecords = list;
            return this;
        }

        @NotNull
        public final Builder allDaySleep(@NotNull AllDaySleepParseData report) {
            Intrinsics.checkNotNullParameter(report, "report");
            this.allDaySleepReport = report;
            return this;
        }

        @NotNull
        public final FitnessParseResult build() {
            return new FitnessParseResult(this, null);
        }

        @NotNull
        public final Builder dailyDataRecord(@NotNull List<ParsedDailyRecord> recordList) {
            Intrinsics.checkNotNullParameter(recordList, "recordList");
            this.dailyRecordList = recordList;
            return this;
        }

        @NotNull
        public final Builder dailyDataReport(@NotNull ParsedDailyReport report) {
            Intrinsics.checkNotNullParameter(report, "report");
            this.dailyReport = report;
            return this;
        }

        @NotNull
        public final Builder dataInvalidVersion(boolean invalid) {
            this.dataInvalidVersion = invalid;
            return this;
        }

        @NotNull
        public final Builder daytimeSleepReport(@NotNull DaytimeSleepReport report) {
            Intrinsics.checkNotNullParameter(report, "report");
            this.daytimeSleepReport = report;
            return this;
        }

        @NotNull
        public final Builder ecgMeasureResult(@NotNull EcgMeasureResult ecgResult) {
            Intrinsics.checkNotNullParameter(ecgResult, "ecgResult");
            this.ecgMeasureResult = ecgResult;
            return this;
        }

        @Nullable
        public final List<AbnormalRecord> getAbnormalRecords() {
            return this.abnormalRecords;
        }

        @Nullable
        /* JADX INFO: renamed from: getAllDaySleepData, reason: from getter */
        public final AllDaySleepParseData getAllDaySleepReport() {
            return this.allDaySleepReport;
        }

        @Nullable
        public final List<ParsedDailyRecord> getDailyRecord() {
            return this.dailyRecordList;
        }

        @Nullable
        public final ParsedDailyReport getDailyReport() {
            return this.dailyReport;
        }

        public final boolean getDataInvalidVersion() {
            return this.dataInvalidVersion;
        }

        @Nullable
        public final DaytimeSleepReport getDaytimeSleepReport() {
            return this.daytimeSleepReport;
        }

        @Nullable
        public final EcgMeasureResult getEcgMeasureResult() {
            return this.ecgMeasureResult;
        }

        @Nullable
        public final Map<Integer, List<GpsRecord>> getGpsRecord() {
            return this.gpsRecord;
        }

        @Nullable
        public final byte[] getGpsTgcData() {
            return this.gpsTgcData;
        }

        @Nullable
        public final List<MeasureData> getMeasureData() {
            return this.measureDataList;
        }

        @Nullable
        public final NightSleepReport getNightSleepReport() {
            return this.nightSleepReport;
        }

        @Nullable
        /* JADX INFO: renamed from: getRecoverRateData, reason: from getter */
        public final RecoverRateData getRecoverRateRecord() {
            return this.recoverRateRecord;
        }

        @Nullable
        public final Map<Integer, List<SportRecord>> getSportRecord() {
            return this.sportRecord;
        }

        @Nullable
        public final SportBasicReport getSportReport() {
            return this.sportReport;
        }

        @Nullable
        public final byte[] getTemperatureResult() {
            return this.temperatureResult;
        }

        @Nullable
        public final FitnessUserInfo getUserInfo() {
            return this.userInfo;
        }

        @Nullable
        public final List<WeightRecord> getWeightRecordList() {
            return this.weightRecordList;
        }

        @NotNull
        public final Builder gpsRecord(@NotNull Map<Integer, ? extends List<GpsRecord>> record) {
            Intrinsics.checkNotNullParameter(record, "record");
            this.gpsRecord = record;
            return this;
        }

        @NotNull
        public final Builder gpsTgcData(@NotNull byte[] data) {
            Intrinsics.checkNotNullParameter(data, "data");
            this.gpsTgcData = data;
            return this;
        }

        @NotNull
        public final Builder measureData(@NotNull List<MeasureData> dataList) {
            Intrinsics.checkNotNullParameter(dataList, "dataList");
            this.measureDataList = dataList;
            return this;
        }

        @NotNull
        public final Builder nightSleepReport(@NotNull NightSleepReport report) {
            Intrinsics.checkNotNullParameter(report, "report");
            this.nightSleepReport = report;
            return this;
        }

        @NotNull
        public final Builder recoverRateRecord(@NotNull RecoverRateData record) {
            Intrinsics.checkNotNullParameter(record, "record");
            this.recoverRateRecord = record;
            return this;
        }

        @NotNull
        public final Builder sportRecord(@NotNull Map<Integer, ? extends List<SportRecord>> record) {
            Intrinsics.checkNotNullParameter(record, "record");
            this.sportRecord = record;
            return this;
        }

        @NotNull
        public final Builder sportReport(@NotNull SportBasicReport report) {
            Intrinsics.checkNotNullParameter(report, "report");
            this.sportReport = report;
            return this;
        }

        @NotNull
        public final Builder temperatureResult(@NotNull byte[] tempResult) {
            Intrinsics.checkNotNullParameter(tempResult, "tempResult");
            this.temperatureResult = tempResult;
            return this;
        }

        @NotNull
        public final Builder userInfo(@NotNull FitnessUserInfo info) {
            Intrinsics.checkNotNullParameter(info, "info");
            this.userInfo = info;
            return this;
        }

        @NotNull
        public final Builder weightRecordList(@NotNull List<WeightRecord> recordList) {
            Intrinsics.checkNotNullParameter(recordList, "recordList");
            this.weightRecordList = recordList;
            return this;
        }
    }

    public /* synthetic */ FitnessParseResult(Builder builder, DefaultConstructorMarker defaultConstructorMarker) {
        this(builder);
    }

    @Nullable
    public final List<AbnormalRecord> getAbnormalRecords() {
        return this.abnormalRecords;
    }

    @Nullable
    public final AllDaySleepParseData getAllDaySleepReport() {
        return this.allDaySleepReport;
    }

    @Nullable
    public final List<ParsedDailyRecord> getDailyRecordList() {
        return this.dailyRecordList;
    }

    @Nullable
    public final ParsedDailyReport getDailyReport() {
        return this.dailyReport;
    }

    @Nullable
    public final Integer getDataIdVersion() {
        return this.dataIdVersion;
    }

    public final boolean getDataInvalidVersion() {
        return this.dataInvalidVersion;
    }

    @Nullable
    public final DaytimeSleepReport getDaytimeSleepReport() {
        return this.daytimeSleepReport;
    }

    @Nullable
    public final EcgMeasureResult getEcgMeasureResult() {
        return this.ecgMeasureResult;
    }

    @Nullable
    public final Map<Integer, List<GpsRecord>> getGpsRecord() {
        return this.gpsRecord;
    }

    @Nullable
    public final byte[] getGpsTgcData() {
        return this.gpsTgcData;
    }

    @Nullable
    public final List<MeasureData> getMeasureDataList() {
        return this.measureDataList;
    }

    @Nullable
    public final NightSleepReport getNightSleepReport() {
        return this.nightSleepReport;
    }

    @Nullable
    public final RecoverRateData getRecoverRateData() {
        return this.recoverRateData;
    }

    @Nullable
    public final Map<Integer, List<SportRecord>> getSportRecord() {
        return this.sportRecord;
    }

    @Nullable
    public final SportBasicReport getSportReport() {
        return this.sportReport;
    }

    @Nullable
    public final byte[] getTemperatureResult() {
        return this.temperatureResult;
    }

    @Nullable
    public final FitnessUserInfo getUserInfo() {
        return this.userInfo;
    }

    @Nullable
    public final List<WeightRecord> getWeightRecordList() {
        return this.weightRecordList;
    }

    public final void setDataIdVersion(@Nullable Integer num) {
        this.dataIdVersion = num;
    }

    public final void setGpsTgcData(@Nullable byte[] bArr) {
        this.gpsTgcData = bArr;
    }

    private FitnessParseResult(Builder builder) {
        this.dailyReport = builder.getDailyReport();
        this.dailyRecordList = builder.getDailyRecord();
        this.nightSleepReport = builder.getNightSleepReport();
        this.daytimeSleepReport = builder.getDaytimeSleepReport();
        this.userInfo = builder.getUserInfo();
        this.measureDataList = builder.getMeasureData();
        this.sportReport = builder.getSportReport();
        this.sportRecord = builder.getSportRecord();
        this.gpsRecord = builder.getGpsRecord();
        this.allDaySleepReport = builder.getAllDaySleepReport();
        this.abnormalRecords = builder.getAbnormalRecords();
        this.weightRecordList = builder.getWeightRecordList();
        this.ecgMeasureResult = builder.getEcgMeasureResult();
        this.recoverRateData = builder.getRecoverRateRecord();
        this.dataInvalidVersion = builder.getDataInvalidVersion();
        this.gpsTgcData = builder.getGpsTgcData();
        this.temperatureResult = builder.getTemperatureResult();
    }
}
