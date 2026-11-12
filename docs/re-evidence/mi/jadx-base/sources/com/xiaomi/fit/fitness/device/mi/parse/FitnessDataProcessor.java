package com.xiaomi.fit.fitness.device.mi.parse;

import com.xiaomi.fit.data.common.data.mi.FitnessDataId;
import com.xiaomi.fit.data.common.data.sport.SportBasicReport;
import com.xiaomi.fit.data.common.log.FitnessLogUtils;
import com.xiaomi.fit.fitness.device.mi.parse.FitnessDataProcessor;
import com.xiaomi.fit.fitness.device.mi.parse.utils.MiParsedDataRecorder;
import com.xiaomi.fit.fitness.export.data.DataResult;
import com.xiaomi.fit.fitness.parser.FitnessDataParser;
import com.xiaomi.fit.fitness.parser.data.AbnormalRecord;
import com.xiaomi.fit.fitness.parser.data.AllDaySleepParseData;
import com.xiaomi.fit.fitness.parser.data.DaytimeSleepReport;
import com.xiaomi.fit.fitness.parser.data.EcgMeasureResult;
import com.xiaomi.fit.fitness.parser.data.FitnessParseResult;
import com.xiaomi.fit.fitness.parser.data.MeasureData;
import com.xiaomi.fit.fitness.parser.data.NightSleepReport;
import com.xiaomi.fit.fitness.parser.data.ParsedDailyRecord;
import com.xiaomi.fit.fitness.parser.data.ParsedDailyReport;
import com.xiaomi.fit.fitness.parser.data.WeightRecord;
import com.xiaomi.fitness.health.export.HealthPageExtKt;
import com.xiaomi.fitness.health.export.IHealthPage;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000 \u001f2\u00020\u0001:\u0001\u001fB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J&\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0086@¢\u0006\u0002\u0010\u0013J&\u0010\u0014\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0082@¢\u0006\u0002\u0010\u0013J&\u0010\u0015\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0082@¢\u0006\u0002\u0010\u0013J \u0010\u0016\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0002J \u0010\u0017\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0002J \u0010\u0018\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0002J.\u0010\u0019\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u001a\u001a\u00020\u00122\u0006\u0010\u001b\u001a\u00020\u001cH\u0082@¢\u0006\u0002\u0010\u001dJ \u0010\u001e\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u001b\u001a\u00020\u001cH\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082D¢\u0006\u0002\n\u0000R\u001b\u0010\u0006\u001a\u00020\u00078BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\b\u0010\t¨\u0006 "}, d2 = {"Lcom/xiaomi/fit/fitness/device/mi/parse/FitnessDataProcessor;", "", "<init>", "()V", "TAG", "", "recorder", "Lcom/xiaomi/fit/fitness/device/mi/parse/utils/MiParsedDataRecorder;", "getRecorder", "()Lcom/xiaomi/fit/fitness/device/mi/parse/utils/MiParsedDataRecorder;", "recorder$delegate", "Lkotlin/Lazy;", "parseAndRecord", "Lcom/xiaomi/fit/fitness/export/data/DataResult;", "sid", "dataId", "Lcom/xiaomi/fit/data/common/data/mi/FitnessDataId;", "byteArray", "", "(Ljava/lang/String;Lcom/xiaomi/fit/data/common/data/mi/FitnessDataId;[BLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "parseAndRecordFitnessData", "parseAndRecordDailyData", "parseAndRecordSportData", "recordFDSData", "parseAnRecordSportReport", "recordParsedDataResult", "data", "result", "Lcom/xiaomi/fit/fitness/parser/data/FitnessParseResult;", "(Ljava/lang/String;Lcom/xiaomi/fit/data/common/data/mi/FitnessDataId;[BLcom/xiaomi/fit/fitness/parser/data/FitnessParseResult;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "recordDailyData", "Companion", "fitness-sync_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class FitnessDataProcessor {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final FitnessDataProcessor instance = new FitnessDataProcessor();

    @NotNull
    private final String TAG = "FitnessDataProcessor";

    /* JADX INFO: renamed from: recorder$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy recorder = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: xp9
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return FitnessDataProcessor.recorder_delegate$lambda$0();
        }
    });

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/xiaomi/fit/fitness/device/mi/parse/FitnessDataProcessor$Companion;", "", "<init>", "()V", "instance", "Lcom/xiaomi/fit/fitness/device/mi/parse/FitnessDataProcessor;", "getInstance", "()Lcom/xiaomi/fit/fitness/device/mi/parse/FitnessDataProcessor;", "fitness-sync_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final FitnessDataProcessor getInstance() {
            return FitnessDataProcessor.instance;
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fit.fitness.device.mi.parse.FitnessDataProcessor$recordParsedDataResult$1, reason: invalid class name */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fit.fitness.device.mi.parse.FitnessDataProcessor", f = "FitnessDataProcessor.kt", i = {}, l = {162}, m = "recordParsedDataResult", n = {}, s = {})
    public static final class AnonymousClass1 extends ContinuationImpl {
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
            return FitnessDataProcessor.this.recordParsedDataResult(null, null, null, null, this);
        }
    }

    private FitnessDataProcessor() {
    }

    private final MiParsedDataRecorder getRecorder() {
        return (MiParsedDataRecorder) this.recorder.getValue();
    }

    private final DataResult parseAnRecordSportReport(String sid, FitnessDataId dataId, byte[] byteArray) {
        FitnessParseResult sportData = FitnessDataParser.INSTANCE.parseSportData(byteArray, dataId.getFileType());
        if (sportData != null && sportData.getDataInvalidVersion()) {
            String str = "data id Invalid Version " + dataId;
            FitnessLogUtils.w(this.TAG, str);
            return new DataResult(-2, str);
        }
        if ((sportData != null ? sportData.getSportReport() : null) != null) {
            MiParsedDataRecorder recorder = getRecorder();
            int tzOffsetInSec = dataId.getTzOffsetInSec();
            SportBasicReport sportReport = sportData.getSportReport();
            Intrinsics.checkNotNull(sportReport);
            return new DataResult(recorder.recordSportReport(sid, tzOffsetInSec, sportReport));
        }
        String str2 = "sport report parse failed " + dataId;
        FitnessLogUtils.w(this.TAG, str2);
        return new DataResult(-1, str2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object parseAndRecordDailyData(String str, FitnessDataId fitnessDataId, byte[] bArr, Continuation<? super DataResult> continuation) {
        FitnessParseResult dailyData = FitnessDataParser.INSTANCE.parseDailyData(bArr, fitnessDataId.getDailyType(), fitnessDataId.getFileType());
        if (dailyData != null && dailyData.getDataInvalidVersion()) {
            String str2 = "data id Invalid Version " + fitnessDataId;
            FitnessLogUtils.w(this.TAG, str2);
            return new DataResult(-2, str2);
        }
        if (dailyData != null) {
            return recordParsedDataResult(str, fitnessDataId, bArr, dailyData, continuation);
        }
        String str3 = "parse failed " + fitnessDataId;
        FitnessLogUtils.w(this.TAG, str3);
        return new DataResult(-1, str3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object parseAndRecordFitnessData(String str, FitnessDataId fitnessDataId, byte[] bArr, Continuation<? super DataResult> continuation) {
        return fitnessDataId.getDailyType() == 31 ? parseAndRecordSportData(str, fitnessDataId, bArr) : parseAndRecordDailyData(str, fitnessDataId, bArr, continuation);
    }

    private final DataResult parseAndRecordSportData(String sid, FitnessDataId dataId, byte[] byteArray) {
        int fileType = dataId.getFileType();
        if (fileType != 0) {
            if (fileType == 1) {
                return parseAnRecordSportReport(sid, dataId, byteArray);
            }
            if (fileType != 2 && fileType != 3) {
                return new DataResult(1, "not support dataId: " + dataId);
            }
        }
        return recordFDSData(sid, dataId, byteArray);
    }

    private final DataResult recordDailyData(String sid, FitnessDataId dataId, FitnessParseResult result) {
        DataResult dataResult;
        int fileType = dataId.getFileType();
        if (fileType != 0) {
            if (fileType != 1) {
                return new DataResult(-1, "not support dataId:(" + dataId + ")");
            }
            if (result.getDailyReport() == null) {
                String str = "daily report parse failed " + dataId;
                FitnessLogUtils.w(this.TAG, str);
                dataResult = new DataResult(-1, str);
            } else {
                MiParsedDataRecorder recorder = getRecorder();
                ParsedDailyReport dailyReport = result.getDailyReport();
                Intrinsics.checkNotNull(dailyReport);
                dataResult = new DataResult(recorder.recordDailyReport(sid, dataId, dailyReport));
            }
        } else if (result.getDailyRecordList() == null) {
            String str2 = "daily record parse failed " + dataId;
            FitnessLogUtils.w(this.TAG, str2);
            dataResult = new DataResult(-1, str2);
        } else {
            MiParsedDataRecorder recorder2 = getRecorder();
            List<ParsedDailyRecord> dailyRecordList = result.getDailyRecordList();
            Intrinsics.checkNotNull(dailyRecordList);
            dataResult = new DataResult(recorder2.recordDailyRecord(sid, dataId, dailyRecordList));
        }
        return dataResult;
    }

    private final DataResult recordFDSData(String sid, FitnessDataId dataId, byte[] byteArray) {
        FitnessParseResult recordValid = FitnessDataParser.INSTANCE.parseRecordValid(byteArray, dataId.getFileType());
        if (recordValid == null || !recordValid.getDataInvalidVersion()) {
            return new DataResult(MiParsedDataRecorder.recordFDSData$default(getRecorder(), sid, dataId, byteArray, false, 8, null));
        }
        String str = "data id Invalid Version " + dataId;
        FitnessLogUtils.w(this.TAG, str);
        return new DataResult(-2, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object recordParsedDataResult(String str, FitnessDataId fitnessDataId, byte[] bArr, FitnessParseResult fitnessParseResult, Continuation<? super DataResult> continuation) {
        AnonymousClass1 anonymousClass1;
        DataResult dataResult;
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
        Object objRecordSleepSegment = anonymousClass1.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = anonymousClass1.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objRecordSleepSegment);
            int dailyType = fitnessDataId.getDailyType();
            if (dailyType == 0) {
                return recordDailyData(str, fitnessDataId, fitnessParseResult);
            }
            if (dailyType != 6) {
                if (dailyType != 2) {
                    if (dailyType != 3) {
                        switch (dailyType) {
                            case 8:
                                AllDaySleepParseData allDaySleepReport = fitnessParseResult.getAllDaySleepReport();
                                if (allDaySleepReport == null || allDaySleepReport.getSleepSrcDataLen() < 0) {
                                    String str2 = "all day sleep parse failed " + fitnessDataId;
                                    FitnessLogUtils.w(this.TAG, str2);
                                    dataResult = new DataResult(-1, str2);
                                } else {
                                    MiParsedDataRecorder recorder = getRecorder();
                                    anonymousClass1.label = 1;
                                    objRecordSleepSegment = recorder.recordSleepSegment(str, fitnessDataId, allDaySleepReport, anonymousClass1);
                                    if (objRecordSleepSegment == coroutine_suspended) {
                                        return coroutine_suspended;
                                    }
                                }
                                break;
                            case 9:
                                List<AbnormalRecord> abnormalRecords = fitnessParseResult.getAbnormalRecords();
                                if (abnormalRecords != null) {
                                    dataResult = new DataResult(getRecorder().recordAbnormalRecords(str, fitnessDataId, abnormalRecords));
                                } else {
                                    String str3 = "abnormal record parse failed " + fitnessDataId;
                                    FitnessLogUtils.w(this.TAG, str3);
                                    dataResult = new DataResult(-1, str3);
                                }
                                break;
                            case 10:
                                List<WeightRecord> weightRecordList = fitnessParseResult.getWeightRecordList();
                                if (weightRecordList != null) {
                                    dataResult = new DataResult(getRecorder().recordWeightRecords(str, fitnessDataId, weightRecordList));
                                } else {
                                    String str4 = "weight record parse failed " + fitnessDataId;
                                    FitnessLogUtils.w(this.TAG, str4);
                                    dataResult = new DataResult(-1, str4);
                                }
                                break;
                            case 11:
                                EcgMeasureResult ecgMeasureResult = fitnessParseResult.getEcgMeasureResult();
                                if (ecgMeasureResult != null) {
                                    getRecorder().recordEcg(str, fitnessDataId, bArr, ecgMeasureResult);
                                    return new DataResult(true);
                                }
                                String str5 = "ecg measure record parse failed " + fitnessDataId;
                                FitnessLogUtils.w(this.TAG, str5);
                                dataResult = new DataResult(-1, str5);
                                break;
                                break;
                            case 12:
                                byte[] temperatureResult = fitnessParseResult.getTemperatureResult();
                                if (temperatureResult != null) {
                                    boolean zRecordTemperatureCharacter = getRecorder().recordTemperatureCharacter(str, fitnessDataId, bArr);
                                    FitnessLogUtils.i(this.TAG, "recordParsedDataResult recordTemperatureCharacter result:" + zRecordTemperatureCharacter);
                                    if (zRecordTemperatureCharacter) {
                                        getRecorder().saveTemperatureFile(fitnessDataId.getTimeStamp(), temperatureResult);
                                        HealthPageExtKt.getInstance(IHealthPage.INSTANCE).syncTemperatureFile(str);
                                    }
                                    return new DataResult(true);
                                }
                                String str6 = "temperature measure record parse failed " + fitnessDataId;
                                FitnessLogUtils.w(this.TAG, str6);
                                dataResult = new DataResult(-1, str6);
                                break;
                                break;
                            default:
                                return new DataResult(-1, "not support data(" + fitnessDataId + ")");
                        }
                    } else if (fitnessParseResult.getNightSleepReport() == null) {
                        String str7 = "night sleep parse failed " + fitnessDataId;
                        FitnessLogUtils.w(this.TAG, str7);
                        dataResult = new DataResult(-1, str7);
                    } else {
                        MiParsedDataRecorder recorder2 = getRecorder();
                        NightSleepReport nightSleepReport = fitnessParseResult.getNightSleepReport();
                        Intrinsics.checkNotNull(nightSleepReport);
                        dataResult = new DataResult(recorder2.recordNightSleepReport(str, fitnessDataId, nightSleepReport));
                    }
                } else if (fitnessParseResult.getDaytimeSleepReport() == null) {
                    String str8 = "day sleep parse failed " + fitnessDataId;
                    FitnessLogUtils.w(this.TAG, str8);
                    dataResult = new DataResult(-1, str8);
                } else {
                    MiParsedDataRecorder recorder3 = getRecorder();
                    DaytimeSleepReport daytimeSleepReport = fitnessParseResult.getDaytimeSleepReport();
                    Intrinsics.checkNotNull(daytimeSleepReport);
                    dataResult = new DataResult(recorder3.recordDaytimeSleepReport(str, fitnessDataId, daytimeSleepReport));
                }
            } else if (fitnessParseResult.getMeasureDataList() == null) {
                String str9 = "measure data parse failed " + fitnessDataId;
                FitnessLogUtils.w(this.TAG, str9);
                dataResult = new DataResult(-1, str9);
            } else {
                MiParsedDataRecorder recorder4 = getRecorder();
                List<MeasureData> measureDataList = fitnessParseResult.getMeasureDataList();
                Intrinsics.checkNotNull(measureDataList);
                dataResult = new DataResult(recorder4.recordMeasureData(str, fitnessDataId, measureDataList));
            }
            return dataResult;
        }
        if (i2 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(objRecordSleepSegment);
        dataResult = new DataResult(((Boolean) objRecordSleepSegment).booleanValue());
        return dataResult;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MiParsedDataRecorder recorder_delegate$lambda$0() {
        return new MiParsedDataRecorder();
    }

    @Nullable
    public final Object parseAndRecord(@NotNull String str, @NotNull FitnessDataId fitnessDataId, @NotNull byte[] bArr, @NotNull Continuation<? super DataResult> continuation) {
        int dataType = fitnessDataId.getDataType();
        if (dataType == 0) {
            return parseAndRecordFitnessData(str, fitnessDataId, bArr, continuation);
        }
        if (dataType == 1) {
            return parseAndRecordSportData(str, fitnessDataId, bArr);
        }
        return new DataResult(1, "not support dataId: " + fitnessDataId);
    }
}
