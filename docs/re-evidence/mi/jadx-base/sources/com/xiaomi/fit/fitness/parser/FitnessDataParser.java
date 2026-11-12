package com.xiaomi.fit.fitness.parser;

import com.xiaomi.fit.data.common.constant.FitnessTestPref;
import com.xiaomi.fit.data.common.data.mi.FitnessDataHeader;
import com.xiaomi.fit.data.common.data.mi.FitnessDataId;
import com.xiaomi.fit.data.common.log.FitnessLogUtils;
import com.xiaomi.fit.fitness.parser.base.FitnessDataBaseParser;
import com.xiaomi.fit.fitness.parser.daily.AbnormalRecordParser;
import com.xiaomi.fit.fitness.parser.daily.AllDaySleepParser;
import com.xiaomi.fit.fitness.parser.daily.DailyRecordParser;
import com.xiaomi.fit.fitness.parser.daily.DailyReportParser;
import com.xiaomi.fit.fitness.parser.daily.DaytimeSleepParser;
import com.xiaomi.fit.fitness.parser.daily.EcgMeasureParser;
import com.xiaomi.fit.fitness.parser.daily.ManualMeasureParser;
import com.xiaomi.fit.fitness.parser.daily.NightSleepParser;
import com.xiaomi.fit.fitness.parser.daily.TemperatureMeasureParser;
import com.xiaomi.fit.fitness.parser.daily.UserProfileParser;
import com.xiaomi.fit.fitness.parser.daily.WeightRecordParser;
import com.xiaomi.fit.fitness.parser.data.AllDaySleepParseData;
import com.xiaomi.fit.fitness.parser.data.FitnessBinaryData;
import com.xiaomi.fit.fitness.parser.data.FitnessParseResult;
import com.xiaomi.fit.fitness.parser.data.GpsRecord;
import com.xiaomi.fit.fitness.parser.data.SportRecord;
import com.xiaomi.fit.fitness.parser.sport.base.SportRecordBaseParser;
import com.xiaomi.fit.fitness.parser.sport.base.SportReportBaseParser;
import com.xiaomi.fit.fitness.parser.sport.gps.SportGpsParser;
import com.xiaomi.fit.fitness.parser.sport.record.BasketballRecordParser;
import com.xiaomi.fit.fitness.parser.sport.record.DivingRecordParser;
import com.xiaomi.fit.fitness.parser.sport.record.EllipticalMachineRecordParser;
import com.xiaomi.fit.fitness.parser.sport.record.FreeTrainingRecordParser;
import com.xiaomi.fit.fitness.parser.sport.record.GolfRecordParser;
import com.xiaomi.fit.fitness.parser.sport.record.HITrainingRecordParser;
import com.xiaomi.fit.fitness.parser.sport.record.IndoorBikingRecordParser;
import com.xiaomi.fit.fitness.parser.sport.record.IndoorRunRecordParser;
import com.xiaomi.fit.fitness.parser.sport.record.OrdinaryBallRecordParser;
import com.xiaomi.fit.fitness.parser.sport.record.OutdoorBikingRecordParser;
import com.xiaomi.fit.fitness.parser.sport.record.OutdoorNoStepRecordParser;
import com.xiaomi.fit.fitness.parser.sport.record.OutdoorSportRecordParser;
import com.xiaomi.fit.fitness.parser.sport.record.OutdoorStepRecordParser;
import com.xiaomi.fit.fitness.parser.sport.record.RecoverRateRecordParser;
import com.xiaomi.fit.fitness.parser.sport.record.RockClimbingRecordParser;
import com.xiaomi.fit.fitness.parser.sport.record.RopeSkippingRecordParser;
import com.xiaomi.fit.fitness.parser.sport.record.RowingMachineRecordParser;
import com.xiaomi.fit.fitness.parser.sport.record.SkiRecordParser;
import com.xiaomi.fit.fitness.parser.sport.record.SwimmingRecordParser;
import com.xiaomi.fit.fitness.parser.sport.record.TriathlonRecordParser;
import com.xiaomi.fit.fitness.parser.sport.record.YogaRecordParser;
import com.xiaomi.fit.fitness.parser.sport.report.BasketballReportParser;
import com.xiaomi.fit.fitness.parser.sport.report.DivingReportParser;
import com.xiaomi.fit.fitness.parser.sport.report.EllipticalMachineReportParser;
import com.xiaomi.fit.fitness.parser.sport.report.FreeTrainingReportParser;
import com.xiaomi.fit.fitness.parser.sport.report.GolfReportParser;
import com.xiaomi.fit.fitness.parser.sport.report.HITrainingReportParser;
import com.xiaomi.fit.fitness.parser.sport.report.HikingReportParser;
import com.xiaomi.fit.fitness.parser.sport.report.IndoorBikingReportParser;
import com.xiaomi.fit.fitness.parser.sport.report.IndoorRunReportParser;
import com.xiaomi.fit.fitness.parser.sport.report.OrdinaryBallReportParser;
import com.xiaomi.fit.fitness.parser.sport.report.OutdoorBikingReportParser;
import com.xiaomi.fit.fitness.parser.sport.report.OutdoorNoStepReportParser;
import com.xiaomi.fit.fitness.parser.sport.report.OutdoorSportReportParser;
import com.xiaomi.fit.fitness.parser.sport.report.OutdoorStepReportParser;
import com.xiaomi.fit.fitness.parser.sport.report.RockClimbingReportParser;
import com.xiaomi.fit.fitness.parser.sport.report.RopeSkippingReportParser;
import com.xiaomi.fit.fitness.parser.sport.report.RowingMachineReportParser;
import com.xiaomi.fit.fitness.parser.sport.report.SkiReportParser;
import com.xiaomi.fit.fitness.parser.sport.report.SwimmingReportParser;
import com.xiaomi.fit.fitness.parser.sport.report.TriathlonReportParser;
import com.xiaomi.fit.fitness.parser.sport.report.YogaReportParser;
import com.xiaomi.fit.fitness.parser.utils.DailyRecordCsvUtils;
import com.xiaomi.fit.fitness.parser.utils.GpsRecordCsvUtils;
import com.xiaomi.fit.fitness.parser.utils.SportRecordCsvUtils;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J \u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000bJ\u0018\u0010\r\u001a\u0004\u0018\u00010\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bJ\u0018\u0010\u000e\u001a\u0004\u0018\u00010\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bJ\u0018\u0010\u000f\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\tJ\u0018\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0012\u001a\u00020\t2\u0006\u0010\u0015\u001a\u00020\u0016H\u0002J\u001a\u0010\u0017\u001a\u0004\u0018\u00010\u00182\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\tH\u0002J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\u001a2\u0006\u0010\u0010\u001a\u00020\u0011H\u0002J\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u001a2\u0006\u0010\u0010\u001a\u00020\u0011H\u0002J\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u001a2\u0006\u0010\u0010\u001a\u00020\u0011H\u0002J\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u001e2\u0006\u0010\u0010\u001a\u00020\u0011H\u0002J\u0012\u0010\u001f\u001a\u0004\u0018\u00010 2\u0006\u0010\u0010\u001a\u00020\u0011H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006!"}, d2 = {"Lcom/xiaomi/fit/fitness/parser/FitnessDataParser;", "", "<init>", "()V", "TAG", "", "parseDailyData", "Lcom/xiaomi/fit/fitness/parser/data/FitnessParseResult;", "byteArray", "", "dailyType", "", "fileType", "parseSportData", "parseRecordValid", "parse", "dataId", "Lcom/xiaomi/fit/data/common/data/mi/FitnessDataId;", "data", "splitAllDaySleepBytes", "", "sleepData", "Lcom/xiaomi/fit/fitness/parser/data/AllDaySleepParseData;", "parseBinaryData", "Lcom/xiaomi/fit/fitness/parser/data/FitnessBinaryData;", "getDataParserInstance", "Lcom/xiaomi/fit/fitness/parser/base/FitnessDataBaseParser;", "getDailyDataParserInstance", "getSportDataParserInstance", "getSportReportParserInstance", "Lcom/xiaomi/fit/fitness/parser/sport/base/SportReportBaseParser;", "getSportRecordParserInstance", "Lcom/xiaomi/fit/fitness/parser/sport/base/SportRecordBaseParser;", "fitness-parser_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nFitnessDataParser.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FitnessDataParser.kt\ncom/xiaomi/fit/fitness/parser/FitnessDataParser\n+ 2 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n*L\n1#1,252:1\n216#2,2:253\n216#2,2:255\n*S KotlinDebug\n*F\n+ 1 FitnessDataParser.kt\ncom/xiaomi/fit/fitness/parser/FitnessDataParser\n*L\n103#1:253,2\n110#1:255,2\n*E\n"})
public final class FitnessDataParser {

    @NotNull
    public static final FitnessDataParser INSTANCE = new FitnessDataParser();

    @NotNull
    private static final String TAG = "FitnessDataParser";

    private FitnessDataParser() {
    }

    private final FitnessDataBaseParser getDailyDataParserInstance(FitnessDataId dataId) {
        int dailyType = dataId.getDailyType();
        if (dailyType == 0) {
            int fileType = dataId.getFileType();
            if (fileType == 0) {
                return new DailyRecordParser();
            }
            if (fileType != 1) {
                return null;
            }
            return new DailyReportParser();
        }
        if (dailyType == 2) {
            return new DaytimeSleepParser();
        }
        if (dailyType == 3) {
            return new NightSleepParser();
        }
        if (dailyType == 5) {
            return new UserProfileParser();
        }
        if (dailyType == 6) {
            return new ManualMeasureParser();
        }
        switch (dailyType) {
            case 8:
                return new AllDaySleepParser();
            case 9:
                return new AbnormalRecordParser();
            case 10:
                return new WeightRecordParser();
            case 11:
                return new EcgMeasureParser();
            case 12:
                return new TemperatureMeasureParser();
            default:
                return null;
        }
    }

    private final FitnessDataBaseParser getDataParserInstance(FitnessDataId dataId) {
        int dataType = dataId.getDataType();
        if (dataType == 0) {
            return getDailyDataParserInstance(dataId);
        }
        if (dataType != 1) {
            return null;
        }
        return getSportDataParserInstance(dataId);
    }

    private final FitnessDataBaseParser getSportDataParserInstance(FitnessDataId dataId) {
        int fileType = dataId.getFileType();
        if (fileType == 0) {
            return getSportRecordParserInstance(dataId);
        }
        if (fileType == 1) {
            return getSportReportParserInstance(dataId);
        }
        if (fileType == 2) {
            return new SportGpsParser();
        }
        if (fileType != 3) {
            return null;
        }
        return new RecoverRateRecordParser();
    }

    private final SportRecordBaseParser getSportRecordParserInstance(FitnessDataId dataId) {
        switch (dataId.getSportType()) {
            case 1:
            case 2:
            case 4:
            case 5:
            case 15:
                return new OutdoorSportRecordParser();
            case 3:
                return new IndoorRunRecordParser();
            case 6:
                return new OutdoorBikingRecordParser();
            case 7:
                return new IndoorBikingRecordParser();
            case 8:
                return new FreeTrainingRecordParser();
            case 9:
            case 10:
                return new SwimmingRecordParser();
            case 11:
                return new EllipticalMachineRecordParser();
            case 12:
                return new YogaRecordParser();
            case 13:
                return new RowingMachineRecordParser();
            case 14:
                return new RopeSkippingRecordParser();
            case 16:
                return new HITrainingRecordParser();
            case 17:
                return new TriathlonRecordParser();
            case 18:
                return new OrdinaryBallRecordParser();
            case 19:
                return new BasketballRecordParser();
            case 20:
                return new GolfRecordParser();
            case 21:
                return new SkiRecordParser();
            case 22:
                return new OutdoorStepRecordParser();
            case 23:
                return new OutdoorNoStepRecordParser();
            case 24:
                return new RockClimbingRecordParser();
            case 25:
                return new DivingRecordParser();
            default:
                return null;
        }
    }

    private final SportReportBaseParser getSportReportParserInstance(FitnessDataId dataId) {
        switch (dataId.getSportType()) {
            case 1:
            case 2:
            case 4:
            case 5:
                return new OutdoorSportReportParser();
            case 3:
                return new IndoorRunReportParser();
            case 6:
                return new OutdoorBikingReportParser();
            case 7:
                return new IndoorBikingReportParser();
            case 8:
                return new FreeTrainingReportParser();
            case 9:
            case 10:
                return new SwimmingReportParser();
            case 11:
                return new EllipticalMachineReportParser();
            case 12:
                return new YogaReportParser();
            case 13:
                return new RowingMachineReportParser();
            case 14:
                return new RopeSkippingReportParser();
            case 15:
                return new HikingReportParser();
            case 16:
                return new HITrainingReportParser();
            case 17:
                return new TriathlonReportParser();
            case 18:
                return new OrdinaryBallReportParser();
            case 19:
                return new BasketballReportParser();
            case 20:
                return new GolfReportParser();
            case 21:
                return new SkiReportParser();
            case 22:
                return new OutdoorStepReportParser();
            case 23:
                return new OutdoorNoStepReportParser();
            case 24:
                return new RockClimbingReportParser();
            case 25:
                return new DivingReportParser();
            default:
                return null;
        }
    }

    private final FitnessBinaryData parseBinaryData(FitnessDataId dataId, byte[] data) {
        FitnessDataHeader dataHeader = FitnessDataHeader.INSTANCE.parseDataHeader(dataId, data);
        if (dataHeader == null) {
            return null;
        }
        if (dataHeader.getDataInvalidVersion()) {
            return new FitnessBinaryData(dataId, null, new byte[0]);
        }
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(data);
        byteBufferWrap.position(dataHeader.getHeaderLen());
        byte[] bArr = new byte[byteBufferWrap.capacity() - dataHeader.getHeaderLen()];
        byteBufferWrap.get(bArr);
        return new FitnessBinaryData(dataId, dataHeader.getDataValid(), bArr);
    }

    private final void splitAllDaySleepBytes(byte[] data, AllDaySleepParseData sleepData) {
        if (sleepData.getSleepSrcDataLen() <= 0) {
            return;
        }
        byte[] bArr = new byte[data.length - sleepData.getSleepSrcDataLen()];
        byte[] bArr2 = new byte[sleepData.getSleepSrcDataLen()];
        ByteBuffer byteBufferOrder = ByteBuffer.wrap(data).order(ByteOrder.LITTLE_ENDIAN);
        byteBufferOrder.get(bArr);
        byteBufferOrder.get(bArr2);
        sleepData.setAssistInfoBytes(bArr);
        sleepData.setSleepSrcBytes(bArr2);
    }

    @Nullable
    public final FitnessParseResult parse(@NotNull FitnessDataId dataId, @NotNull byte[] data) {
        Intrinsics.checkNotNullParameter(dataId, "dataId");
        Intrinsics.checkNotNullParameter(data, "data");
        FitnessLogUtils.i(TAG, "parse dataId(" + dataId + ")");
        FitnessBinaryData binaryData = parseBinaryData(dataId, data);
        FitnessLogUtils.d(TAG, "binaryData:" + binaryData);
        if (binaryData == null) {
            FitnessLogUtils.w(TAG, "no support dataHeader " + dataId);
            return null;
        }
        FitnessLogUtils.d(TAG, "binaryData:" + binaryData.getDataValid());
        if (binaryData.getDataValid() == null) {
            return new FitnessParseResult.Builder().dataInvalidVersion(true).build();
        }
        FitnessDataBaseParser dataParserInstance = getDataParserInstance(dataId);
        FitnessLogUtils.d(TAG, "dataParser:" + dataParserInstance);
        if (dataParserInstance == null) {
            FitnessLogUtils.w(TAG, "no support dataParser " + dataId);
            return null;
        }
        FitnessParseResult fitnessParseResult = dataParserInstance.parse(binaryData);
        if ((fitnessParseResult != null ? fitnessParseResult.getAllDaySleepReport() : null) != null) {
            splitAllDaySleepBytes(data, fitnessParseResult.getAllDaySleepReport());
        } else if ((fitnessParseResult != null ? fitnessParseResult.getDailyRecordList() : null) == null) {
            if ((fitnessParseResult != null ? fitnessParseResult.getSportRecord() : null) == null) {
                if ((fitnessParseResult != null ? fitnessParseResult.getGpsRecord() : null) != null && FitnessTestPref.INSTANCE.getENABLE_PRINT_SPORT_GPS()) {
                    for (Map.Entry<Integer, List<GpsRecord>> entry : fitnessParseResult.getGpsRecord().entrySet()) {
                        GpsRecordCsvUtils.INSTANCE.writeFile(dataId, entry.getKey().intValue(), entry.getValue());
                    }
                }
            } else if (FitnessTestPref.INSTANCE.getENABLE_PRINT_SPORT_RECORD()) {
                for (Map.Entry<Integer, List<SportRecord>> entry2 : fitnessParseResult.getSportRecord().entrySet()) {
                    SportRecordCsvUtils.INSTANCE.writeFile(dataId, entry2.getKey().intValue(), entry2.getValue());
                }
            }
        } else if (FitnessTestPref.INSTANCE.getENABLE_PRINT_DAILY_RECORD()) {
            DailyRecordCsvUtils.INSTANCE.writeFile(dataId, fitnessParseResult.getDailyRecordList());
        }
        if (fitnessParseResult != null) {
            fitnessParseResult.setDataIdVersion(Integer.valueOf(dataId.getVersion()));
        }
        return fitnessParseResult;
    }

    @Nullable
    public final FitnessParseResult parseDailyData(@NotNull byte[] byteArray, int dailyType, int fileType) {
        Intrinsics.checkNotNullParameter(byteArray, "byteArray");
        if (byteArray.length != 0) {
            FitnessDataId dailyDataId = FitnessDataHeader.INSTANCE.getDailyDataId(byteArray, dailyType, fileType);
            if (dailyDataId != null) {
                return parse(dailyDataId, byteArray);
            }
            FitnessLogUtils.w(TAG, "getDailyDataId failed");
            return null;
        }
        FitnessLogUtils.w(TAG, "data is empty, dailyType = " + dailyType + ", fileType = " + fileType);
        return null;
    }

    @Nullable
    public final FitnessParseResult parseRecordValid(@NotNull byte[] byteArray, int fileType) {
        Intrinsics.checkNotNullParameter(byteArray, "byteArray");
        FitnessDataId sportDataId = FitnessDataHeader.INSTANCE.getSportDataId(byteArray, fileType);
        if (sportDataId == null) {
            FitnessLogUtils.w(TAG, "getSportDataId failed");
            return null;
        }
        FitnessBinaryData binaryData = parseBinaryData(sportDataId, byteArray);
        if (binaryData != null) {
            return binaryData.getDataValid() == null ? new FitnessParseResult.Builder().dataInvalidVersion(true).build() : new FitnessParseResult.Builder().dataInvalidVersion(false).build();
        }
        FitnessLogUtils.w(TAG, "no support dataHeader " + sportDataId);
        return null;
    }

    @Nullable
    public final FitnessParseResult parseSportData(@NotNull byte[] byteArray, int fileType) {
        Intrinsics.checkNotNullParameter(byteArray, "byteArray");
        FitnessDataId sportDataId = FitnessDataHeader.INSTANCE.getSportDataId(byteArray, fileType);
        if (sportDataId != null) {
            return parse(sportDataId, byteArray);
        }
        FitnessLogUtils.w(TAG, "getSportDataId failed");
        return null;
    }
}
