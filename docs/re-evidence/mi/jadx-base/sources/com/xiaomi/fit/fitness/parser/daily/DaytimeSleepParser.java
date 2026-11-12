package com.xiaomi.fit.fitness.parser.daily;

import com.xiaomi.fit.data.common.data.mi.FitnessDataId;
import com.xiaomi.fit.data.common.log.FitnessLogUtils;
import com.xiaomi.fit.fitness.parser.base.FitnessDataBaseParser;
import com.xiaomi.fit.fitness.parser.data.DaytimeSleepReport;
import com.xiaomi.fit.fitness.parser.data.FitnessBinaryData;
import com.xiaomi.fit.fitness.parser.data.FitnessParseResult;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001:\u0001\u000fB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u000b\u001a\u0004\u0018\u00010\f2\u0006\u0010\r\u001a\u00020\u000eH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082D¢\u0006\u0002\n\u0000R\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\tR\u0016\u0010\n\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\t¨\u0006\u0010"}, d2 = {"Lcom/xiaomi/fit/fitness/parser/daily/DaytimeSleepParser;", "Lcom/xiaomi/fit/fitness/parser/base/FitnessDataBaseParser;", "<init>", "()V", "TAG", "", "reportDataTypeArray", "", "Lcom/xiaomi/fit/fitness/parser/base/FitnessDataBaseParser$OneDimenDataType;", "[Lcom/xiaomi/fit/fitness/parser/base/FitnessDataBaseParser$OneDimenDataType;", "recordDataTypeArray", "parse", "Lcom/xiaomi/fit/fitness/parser/data/FitnessParseResult;", "binaryData", "Lcom/xiaomi/fit/fitness/parser/data/FitnessBinaryData;", "DataType", "fitness-parser_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class DaytimeSleepParser extends FitnessDataBaseParser {

    @NotNull
    private final String TAG = "DaytimeSleepParser";

    @NotNull
    private final FitnessDataBaseParser.OneDimenDataType[] reportDataTypeArray = {new FitnessDataBaseParser.OneDimenDataType(0, 2, 1, false, null, false, null, 120, null)};

    @NotNull
    private final FitnessDataBaseParser.OneDimenDataType[] recordDataTypeArray = {new FitnessDataBaseParser.OneDimenDataType(1, 4, 1, false, null, false, null, 120, null), new FitnessDataBaseParser.OneDimenDataType(2, 1, 1, false, null, false, null, 120, null)};

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lcom/xiaomi/fit/fitness/parser/daily/DaytimeSleepParser$DataType;", "", "<init>", "()V", "sleepDuration", "", "sleepTime", "sleepState", "fitness-parser_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class DataType {

        @NotNull
        public static final DataType INSTANCE = new DataType();
        public static final int sleepDuration = 0;
        public static final int sleepState = 2;
        public static final int sleepTime = 1;

        private DataType() {
        }
    }

    @Override // com.xiaomi.fit.fitness.parser.base.FitnessDataBaseParser
    @Nullable
    public FitnessParseResult parse(@NotNull FitnessBinaryData binaryData) {
        Intrinsics.checkNotNullParameter(binaryData, "binaryData");
        FitnessDataId dataId = binaryData.getDataId();
        if (dataId.getVersion() == 1) {
            FitnessLogUtils.w(this.TAG, "invalid version, not parse (" + dataId + ")");
            return null;
        }
        NightSleepParser nightSleepParser = new NightSleepParser();
        ByteBuffer byteBufferOrder = ByteBuffer.wrap(binaryData.getBodyData()).order(ByteOrder.LITTLE_ENDIAN);
        FitnessDataBaseParser.OneDimenDataType[] oneDimenDataTypeArr = this.reportDataTypeArray;
        Intrinsics.checkNotNull(byteBufferOrder);
        Map<Integer, FitnessDataBaseParser.DataValueItem> reportData = nightSleepParser.parseReportData(binaryData, oneDimenDataTypeArr, byteBufferOrder);
        if (reportData == null) {
            return null;
        }
        List<Map<Integer, FitnessDataBaseParser.DataValueItem>> recordData = nightSleepParser.parseRecordData(binaryData, this.recordDataTypeArray, byteBufferOrder);
        DaytimeSleepReport daytimeSleepReport = new DaytimeSleepReport(dataId.getTzIn15Min());
        FitnessDataBaseParser.DataValueItem dataValueItem = reportData.get(0);
        if (dataValueItem != null && dataValueItem.getValid()) {
            daytimeSleepReport.setSleepDuration(dataValueItem.getValue().intValue());
        }
        daytimeSleepReport.setSleepItems(nightSleepParser.processSleepState(1, 2, recordData));
        FitnessLogUtils.i(this.TAG, "daytimeSleepReport(" + getMGson().toJson(daytimeSleepReport) + ")");
        return new FitnessParseResult.Builder().daytimeSleepReport(daytimeSleepReport).build();
    }
}
