package com.xiaomi.fit.fitness.parser.daily;

import com.xiaomi.fit.data.common.data.daily.SleepStateItem;
import com.xiaomi.fit.data.common.data.mi.FitnessDataId;
import com.xiaomi.fit.data.common.log.FitnessLogUtils;
import com.xiaomi.fit.fitness.parser.base.FitnessDataBaseParser;
import com.xiaomi.fit.fitness.parser.base.OneDimenDataParser;
import com.xiaomi.fit.fitness.parser.data.FitnessBinaryData;
import com.xiaomi.fit.fitness.parser.data.FitnessParseResult;
import com.xiaomi.fit.fitness.parser.data.NightSleepReport;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001:\u0001'B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u000b\u001a\u0004\u0018\u00010\f2\u0006\u0010\r\u001a\u00020\u000eH\u0016J7\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u00102\u0006\u0010\r\u001a\u00020\u000e2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\u0014\u001a\u00020\u0015¢\u0006\u0002\u0010\u0016J;\u0010\u0017\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00120\u00100\u00182\u0006\u0010\r\u001a\u00020\u000e2\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\u0014\u001a\u00020\u0015¢\u0006\u0002\u0010\u001aJ$\u0010\u001b\u001a\u00020\u001c2\u0012\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00120\u00102\u0006\u0010\u001e\u001a\u00020\u001fH\u0002J,\u0010 \u001a\u00020\u001c2\u0012\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00120\u00102\u0006\u0010!\u001a\u00020\u00112\u0006\u0010\u001e\u001a\u00020\u001fH\u0002J6\u0010\"\u001a\b\u0012\u0004\u0012\u00020#0\u00182\u0006\u0010$\u001a\u00020\u00112\u0006\u0010%\u001a\u00020\u00112\u0018\u0010&\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00120\u00100\u0018R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082D¢\u0006\u0002\n\u0000R\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\tR\u0016\u0010\n\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\t¨\u0006("}, d2 = {"Lcom/xiaomi/fit/fitness/parser/daily/NightSleepParser;", "Lcom/xiaomi/fit/fitness/parser/base/FitnessDataBaseParser;", "<init>", "()V", "TAG", "", "reportDataTypeArray", "", "Lcom/xiaomi/fit/fitness/parser/base/FitnessDataBaseParser$OneDimenDataType;", "[Lcom/xiaomi/fit/fitness/parser/base/FitnessDataBaseParser$OneDimenDataType;", "recordDataTypeArray", "parse", "Lcom/xiaomi/fit/fitness/parser/data/FitnessParseResult;", "binaryData", "Lcom/xiaomi/fit/fitness/parser/data/FitnessBinaryData;", "parseReportData", "", "", "Lcom/xiaomi/fit/fitness/parser/base/FitnessDataBaseParser$DataValueItem;", "reportDataTypes", "byteBuffer", "Ljava/nio/ByteBuffer;", "(Lcom/xiaomi/fit/fitness/parser/data/FitnessBinaryData;[Lcom/xiaomi/fit/fitness/parser/base/FitnessDataBaseParser$OneDimenDataType;Ljava/nio/ByteBuffer;)Ljava/util/Map;", "parseRecordData", "", "recordDataTypes", "(Lcom/xiaomi/fit/fitness/parser/data/FitnessBinaryData;[Lcom/xiaomi/fit/fitness/parser/base/FitnessDataBaseParser$OneDimenDataType;Ljava/nio/ByteBuffer;)Ljava/util/List;", "processSleepReportData", "", "reportData", "sleepReport", "Lcom/xiaomi/fit/fitness/parser/data/NightSleepReport;", "setSleepReportData", "dataType", "processSleepState", "Lcom/xiaomi/fit/data/common/data/daily/SleepStateItem;", "timeType", "stateType", "recordList", "DataType", "fitness-parser_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class NightSleepParser extends FitnessDataBaseParser {

    @NotNull
    private final String TAG = "NightSleepParser";

    @NotNull
    private final FitnessDataBaseParser.OneDimenDataType[] reportDataTypeArray = {new FitnessDataBaseParser.OneDimenDataType(0, 1, 1, false, null, false, null, 120, null), new FitnessDataBaseParser.OneDimenDataType(1, 1, 1, false, null, false, null, 120, null), new FitnessDataBaseParser.OneDimenDataType(2, 1, 1, false, null, false, null, 120, null), new FitnessDataBaseParser.OneDimenDataType(3, 1, 1, false, null, false, null, 120, null), new FitnessDataBaseParser.OneDimenDataType(4, 1, 1, false, null, false, null, 120, null), new FitnessDataBaseParser.OneDimenDataType(5, 2, 1, false, null, false, null, 120, null), new FitnessDataBaseParser.OneDimenDataType(6, 4, 1, false, null, false, null, 120, null), new FitnessDataBaseParser.OneDimenDataType(7, 4, 1, false, null, false, null, 120, null), new FitnessDataBaseParser.OneDimenDataType(8, 1, 1, false, null, false, null, 120, null), new FitnessDataBaseParser.OneDimenDataType(9, 1, 1, false, null, false, null, 120, null), new FitnessDataBaseParser.OneDimenDataType(10, 1, 1, false, null, false, null, 120, null), new FitnessDataBaseParser.OneDimenDataType(11, 2, 1, false, null, false, null, 120, null), new FitnessDataBaseParser.OneDimenDataType(12, 2, 1, false, null, false, null, 120, null), new FitnessDataBaseParser.OneDimenDataType(13, 2, 1, false, null, false, null, 120, null), new FitnessDataBaseParser.OneDimenDataType(14, 2, 1, false, null, false, null, 120, null), new FitnessDataBaseParser.OneDimenDataType(15, 1, 2, false, null, false, null, 120, null)};

    @NotNull
    private final FitnessDataBaseParser.OneDimenDataType[] recordDataTypeArray = {new FitnessDataBaseParser.OneDimenDataType(16, 4, 1, false, null, false, null, 120, null), new FitnessDataBaseParser.OneDimenDataType(17, 1, 1, false, null, false, null, 120, null)};

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0012\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0017"}, d2 = {"Lcom/xiaomi/fit/fitness/parser/daily/NightSleepParser$DataType;", "", "<init>", "()V", "totalScore", "", "qualityScore", "durationScore", "summary", "advice", "sleepDuration", "bedTime", "wakeupTime", "recoveryScore", "nervousScore", "awakeCount", "deepDuration", "lightDuration", "remDuration", "awakeDuration", "friendlyTotalScore", "sleepTime", "sleepState", "fitness-parser_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class DataType {

        @NotNull
        public static final DataType INSTANCE = new DataType();
        public static final int advice = 4;
        public static final int awakeCount = 10;
        public static final int awakeDuration = 14;
        public static final int bedTime = 6;
        public static final int deepDuration = 11;
        public static final int durationScore = 2;
        public static final int friendlyTotalScore = 15;
        public static final int lightDuration = 12;
        public static final int nervousScore = 9;
        public static final int qualityScore = 1;
        public static final int recoveryScore = 8;
        public static final int remDuration = 13;
        public static final int sleepDuration = 5;
        public static final int sleepState = 17;
        public static final int sleepTime = 16;
        public static final int summary = 3;
        public static final int totalScore = 0;
        public static final int wakeupTime = 7;

        private DataType() {
        }
    }

    private final void processSleepReportData(Map<Integer, FitnessDataBaseParser.DataValueItem> reportData, NightSleepReport sleepReport) {
        for (FitnessDataBaseParser.OneDimenDataType oneDimenDataType : this.reportDataTypeArray) {
            setSleepReportData(reportData, oneDimenDataType.getType(), sleepReport);
        }
    }

    private final void setSleepReportData(Map<Integer, FitnessDataBaseParser.DataValueItem> reportData, int dataType, NightSleepReport sleepReport) {
        FitnessDataBaseParser.DataValueItem dataValueItem = reportData.get(Integer.valueOf(dataType));
        if (dataValueItem == null || !dataValueItem.getValid()) {
            return;
        }
        switch (dataType) {
            case 0:
                sleepReport.setTotalScore(Integer.valueOf(dataValueItem.getValue().intValue()));
                break;
            case 1:
                sleepReport.setQualityScore(Integer.valueOf(dataValueItem.getValue().intValue()));
                break;
            case 2:
                sleepReport.setDurationScore(Integer.valueOf(dataValueItem.getValue().intValue()));
                break;
            case 3:
                sleepReport.setSleepSummary(Integer.valueOf(dataValueItem.getValue().intValue()));
                break;
            case 4:
                sleepReport.setSleepAdvice(Integer.valueOf(dataValueItem.getValue().intValue()));
                break;
            case 5:
                sleepReport.setSleepDuration(dataValueItem.getValue().intValue());
                break;
            case 6:
                sleepReport.setBedTime(dataValueItem.getValue().longValue());
                break;
            case 7:
                sleepReport.setWakeUpTime(dataValueItem.getValue().longValue());
                break;
            case 8:
                sleepReport.setRecoveryScore(Integer.valueOf(dataValueItem.getValue().intValue()));
                break;
            case 9:
                sleepReport.setNervousScore(Integer.valueOf(dataValueItem.getValue().intValue()));
                break;
            case 10:
                sleepReport.setAwakeCount(Integer.valueOf(dataValueItem.getValue().intValue()));
                break;
            case 11:
                sleepReport.setDeepDuration(Integer.valueOf(dataValueItem.getValue().intValue()));
                break;
            case 12:
                sleepReport.setLightDuration(Integer.valueOf(dataValueItem.getValue().intValue()));
                break;
            case 13:
                sleepReport.setRemDuration(Integer.valueOf(dataValueItem.getValue().intValue()));
                break;
            case 14:
                sleepReport.setAwakeDuration(Integer.valueOf(dataValueItem.getValue().intValue()));
                break;
            case 15:
                sleepReport.setFriendlyTotalScore(Integer.valueOf(dataValueItem.getValue().intValue()));
                break;
        }
    }

    @Override // com.xiaomi.fit.fitness.parser.base.FitnessDataBaseParser
    @Nullable
    public FitnessParseResult parse(@NotNull FitnessBinaryData binaryData) {
        Intrinsics.checkNotNullParameter(binaryData, "binaryData");
        ByteBuffer byteBufferOrder = ByteBuffer.wrap(binaryData.getBodyData()).order(ByteOrder.LITTLE_ENDIAN);
        FitnessDataBaseParser.OneDimenDataType[] oneDimenDataTypeArr = this.reportDataTypeArray;
        Intrinsics.checkNotNull(byteBufferOrder);
        Map<Integer, FitnessDataBaseParser.DataValueItem> reportData = parseReportData(binaryData, oneDimenDataTypeArr, byteBufferOrder);
        if (reportData == null) {
            return null;
        }
        List<Map<Integer, FitnessDataBaseParser.DataValueItem>> recordData = parseRecordData(binaryData, this.recordDataTypeArray, byteBufferOrder);
        NightSleepReport nightSleepReport = new NightSleepReport(binaryData.getDataId().getTzIn15Min());
        processSleepReportData(reportData, nightSleepReport);
        nightSleepReport.setSleepItems(processSleepState(16, 17, recordData));
        FitnessLogUtils.i(this.TAG, "nightSleepReport(" + getMGson().toJson(nightSleepReport) + ")");
        return new FitnessParseResult.Builder().nightSleepReport(nightSleepReport).build();
    }

    @NotNull
    public final List<Map<Integer, FitnessDataBaseParser.DataValueItem>> parseRecordData(@NotNull FitnessBinaryData binaryData, @NotNull FitnessDataBaseParser.OneDimenDataType[] recordDataTypes, @NotNull ByteBuffer byteBuffer) {
        Intrinsics.checkNotNullParameter(binaryData, "binaryData");
        Intrinsics.checkNotNullParameter(recordDataTypes, "recordDataTypes");
        Intrinsics.checkNotNullParameter(byteBuffer, "byteBuffer");
        HashMap map = new HashMap();
        for (FitnessDataBaseParser.OneDimenDataType oneDimenDataType : recordDataTypes) {
            map.put(Integer.valueOf(oneDimenDataType.getType()), Boolean.TRUE);
        }
        return OneDimenDataParser.INSTANCE.parseLoopRecord(recordDataTypes, binaryData.getDataId(), map, byteBuffer);
    }

    @Nullable
    public final Map<Integer, FitnessDataBaseParser.DataValueItem> parseReportData(@NotNull FitnessBinaryData binaryData, @NotNull FitnessDataBaseParser.OneDimenDataType[] reportDataTypes, @NotNull ByteBuffer byteBuffer) {
        Intrinsics.checkNotNullParameter(binaryData, "binaryData");
        Intrinsics.checkNotNullParameter(reportDataTypes, "reportDataTypes");
        Intrinsics.checkNotNullParameter(byteBuffer, "byteBuffer");
        FitnessDataId dataId = binaryData.getDataId();
        if (binaryData.getDataValid() != null) {
            OneDimenDataParser oneDimenDataParser = OneDimenDataParser.INSTANCE;
            return oneDimenDataParser.parseOneRecord(reportDataTypes, dataId, oneDimenDataParser.parseDataValid(reportDataTypes, dataId, binaryData.getDataValid()), byteBuffer);
        }
        FitnessLogUtils.w(this.TAG, "not support parse " + dataId);
        return null;
    }

    @NotNull
    public final List<SleepStateItem> processSleepState(int timeType, int stateType, @NotNull List<? extends Map<Integer, FitnessDataBaseParser.DataValueItem>> recordList) {
        Intrinsics.checkNotNullParameter(recordList, "recordList");
        LinkedList linkedList = new LinkedList();
        Long lValueOf = null;
        Integer numValueOf = null;
        for (Map<Integer, FitnessDataBaseParser.DataValueItem> map : recordList) {
            FitnessDataBaseParser.DataValueItem dataValueItem = map.get(Integer.valueOf(timeType));
            FitnessDataBaseParser.DataValueItem dataValueItem2 = map.get(Integer.valueOf(stateType));
            if (dataValueItem == null || dataValueItem2 == null) {
                FitnessLogUtils.w(this.TAG, "parseSleepState: null state");
            } else {
                if (lValueOf != null && numValueOf != null) {
                    linkedList.add(new SleepStateItem(lValueOf.longValue(), dataValueItem.getValue().longValue(), numValueOf.intValue()));
                }
                lValueOf = Long.valueOf(dataValueItem.getValue().longValue());
                numValueOf = Integer.valueOf(dataValueItem2.getValue().intValue());
            }
        }
        return linkedList;
    }
}
