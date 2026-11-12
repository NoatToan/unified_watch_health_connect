package com.xiaomi.fit.fitness.parser.daily;

import android.util.Log;
import com.xiaomi.fit.data.common.data.mi.FitnessDataId;
import com.xiaomi.fit.data.common.log.FitnessLogUtils;
import com.xiaomi.fit.fitness.parser.base.FitnessDataBaseParser;
import com.xiaomi.fit.fitness.parser.base.OneDimenDataParser;
import com.xiaomi.fit.fitness.parser.data.EcgMeasureResult;
import com.xiaomi.fit.fitness.parser.data.FitnessBinaryData;
import com.xiaomi.fit.fitness.parser.data.FitnessParseResult;
import com.xiaomi.fit.fitness.parser.schema.EcgReportKey;
import com.xiaomi.fit.fitness.parser.schema.ParserWayControl;
import com.xiaomi.fit.fitness.parser.schema.daily.SchemaDailyParser;
import com.xiaomi.fit.fitness.parser.utils.ParserPreference;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001:\u0001%B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u000b\u001a\u0004\u0018\u00010\f2\u0006\u0010\r\u001a\u00020\u000eH\u0016J\u0012\u0010\u000f\u001a\u0004\u0018\u00010\f2\u0006\u0010\r\u001a\u00020\u000eH\u0002J,\u0010\u0010\u001a\u00020\u00112\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00150\u00132\u0006\u0010\u0016\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0018H\u0002J(\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001a2\u0018\u0010\u001c\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00150\u00130\u001aH\u0002J9\u0010\u001d\u001a\u0010\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u00132\u0006\u0010\r\u001a\u00020\u000e2\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\u001f\u001a\u00020 H\u0002¢\u0006\u0002\u0010!J=\u0010\"\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00150\u00130\u001a2\u0006\u0010\r\u001a\u00020\u000e2\f\u0010#\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\u001f\u001a\u00020 H\u0002¢\u0006\u0002\u0010$R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082D¢\u0006\u0002\n\u0000R\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\tR\u0016\u0010\n\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\t¨\u0006&"}, d2 = {"Lcom/xiaomi/fit/fitness/parser/daily/EcgMeasureParser;", "Lcom/xiaomi/fit/fitness/parser/base/FitnessDataBaseParser;", "<init>", "()V", "TAG", "", "reportDataTypeArray", "", "Lcom/xiaomi/fit/fitness/parser/base/FitnessDataBaseParser$OneDimenDataType;", "[Lcom/xiaomi/fit/fitness/parser/base/FitnessDataBaseParser$OneDimenDataType;", "recordDataTypeArray", "parse", "Lcom/xiaomi/fit/fitness/parser/data/FitnessParseResult;", "binaryData", "Lcom/xiaomi/fit/fitness/parser/data/FitnessBinaryData;", "nativeParseEcgMeasure", "setReportData", "", "reportData", "", "", "Lcom/xiaomi/fit/fitness/parser/base/FitnessDataBaseParser$DataValueItem;", "dataType", "measureResult", "Lcom/xiaomi/fit/fitness/parser/data/EcgMeasureResult;", "processRecordData", "", "", "recordList", "parseReportData", "reportDataTypes", "byteBuffer", "Ljava/nio/ByteBuffer;", "(Lcom/xiaomi/fit/fitness/parser/data/FitnessBinaryData;[Lcom/xiaomi/fit/fitness/parser/base/FitnessDataBaseParser$OneDimenDataType;Ljava/nio/ByteBuffer;)Ljava/util/Map;", "parseRecordData", "recordDataTypes", "(Lcom/xiaomi/fit/fitness/parser/data/FitnessBinaryData;[Lcom/xiaomi/fit/fitness/parser/base/FitnessDataBaseParser$OneDimenDataType;Ljava/nio/ByteBuffer;)Ljava/util/List;", "DataType", "fitness-parser_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class EcgMeasureParser extends FitnessDataBaseParser {

    @NotNull
    private final String TAG = "EcgMeasureParser";

    @NotNull
    private final FitnessDataBaseParser.OneDimenDataType[] reportDataTypeArray = {new FitnessDataBaseParser.OneDimenDataType(-3, 4, 1, false, null, false, null, 120, null), new FitnessDataBaseParser.OneDimenDataType(-2, 1, 1, false, null, false, null, 120, null), new FitnessDataBaseParser.OneDimenDataType(-1, 2, 1, false, null, false, null, 120, null), new FitnessDataBaseParser.OneDimenDataType(0, 1, 1, false, null, false, null, 120, null), new FitnessDataBaseParser.OneDimenDataType(2, 1, 2, false, null, false, null, 120, null), new FitnessDataBaseParser.OneDimenDataType(3, 4, 2, false, null, false, null, 120, null), new FitnessDataBaseParser.OneDimenDataType(-4, 1, 2, false, null, false, null, 120, null)};

    @NotNull
    private final FitnessDataBaseParser.OneDimenDataType[] recordDataTypeArray = {new FitnessDataBaseParser.OneDimenDataType(1, 4, 1, true, null, false, null, 112, null)};

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\b\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/xiaomi/fit/fitness/parser/daily/EcgMeasureParser$DataType;", "", "<init>", "()V", "startTime", "", "measureDuration", "sampleFreq", "avgHr", "srcData", "analysisResult", "symptomValue", EcgReportKey.dataSource, "fitness-parser_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class DataType {

        @NotNull
        public static final DataType INSTANCE = new DataType();
        public static final int analysisResult = 2;
        public static final int avgHr = 0;
        public static final int dataSource = -4;
        public static final int measureDuration = -2;
        public static final int sampleFreq = -1;
        public static final int srcData = 1;
        public static final int startTime = -3;
        public static final int symptomValue = 3;

        private DataType() {
        }
    }

    private final FitnessParseResult nativeParseEcgMeasure(FitnessBinaryData binaryData) {
        FitnessLogUtils.i(this.TAG, "native parse ecg measure");
        ByteBuffer byteBufferOrder = ByteBuffer.wrap(binaryData.getBodyData()).order(ByteOrder.LITTLE_ENDIAN);
        FitnessDataBaseParser.OneDimenDataType[] oneDimenDataTypeArr = this.reportDataTypeArray;
        Intrinsics.checkNotNull(byteBufferOrder);
        Map<Integer, FitnessDataBaseParser.DataValueItem> reportData = parseReportData(binaryData, oneDimenDataTypeArr, byteBufferOrder);
        if (reportData == null) {
            return null;
        }
        List<Map<Integer, FitnessDataBaseParser.DataValueItem>> recordData = parseRecordData(binaryData, this.recordDataTypeArray, byteBufferOrder);
        FitnessDataId dataId = binaryData.getDataId();
        EcgMeasureResult ecgMeasureResult = new EcgMeasureResult(dataId.getTimeStamp(), dataId.getTzIn15Min());
        for (FitnessDataBaseParser.OneDimenDataType oneDimenDataType : this.reportDataTypeArray) {
            setReportData(reportData, oneDimenDataType.getType(), ecgMeasureResult);
        }
        ecgMeasureResult.setSrcData(processRecordData(recordData));
        FitnessLogUtils.i(this.TAG, "EcgMeasureResult(" + dataId + ")(" + ecgMeasureResult + ")");
        return new FitnessParseResult.Builder().ecgMeasureResult(ecgMeasureResult).build();
    }

    private final List<Map<Integer, FitnessDataBaseParser.DataValueItem>> parseRecordData(FitnessBinaryData binaryData, FitnessDataBaseParser.OneDimenDataType[] recordDataTypes, ByteBuffer byteBuffer) {
        HashMap map = new HashMap();
        for (FitnessDataBaseParser.OneDimenDataType oneDimenDataType : recordDataTypes) {
            map.put(Integer.valueOf(oneDimenDataType.getType()), Boolean.TRUE);
        }
        return OneDimenDataParser.INSTANCE.parseLoopRecord(recordDataTypes, binaryData.getDataId(), map, byteBuffer);
    }

    private final Map<Integer, FitnessDataBaseParser.DataValueItem> parseReportData(FitnessBinaryData binaryData, FitnessDataBaseParser.OneDimenDataType[] reportDataTypes, ByteBuffer byteBuffer) {
        FitnessDataId dataId = binaryData.getDataId();
        if (binaryData.getDataValid() != null) {
            OneDimenDataParser oneDimenDataParser = OneDimenDataParser.INSTANCE;
            return oneDimenDataParser.parseOneRecord(reportDataTypes, dataId, oneDimenDataParser.parseDataValid(reportDataTypes, dataId, binaryData.getDataValid()), byteBuffer);
        }
        FitnessLogUtils.w(this.TAG, "not support parse " + dataId);
        return null;
    }

    private final List<Float> processRecordData(List<? extends Map<Integer, FitnessDataBaseParser.DataValueItem>> recordList) {
        LinkedList linkedList = new LinkedList();
        for (Map<Integer, FitnessDataBaseParser.DataValueItem> map : recordList) {
            for (FitnessDataBaseParser.OneDimenDataType oneDimenDataType : this.recordDataTypeArray) {
                FitnessDataBaseParser.DataValueItem dataValueItem = map.get(Integer.valueOf(oneDimenDataType.getType()));
                if (dataValueItem == null) {
                    FitnessLogUtils.w(this.TAG, "processRecordData: null value(" + oneDimenDataType.getType() + ")");
                } else if (oneDimenDataType.getType() == 1) {
                    linkedList.add(Float.valueOf(dataValueItem.getValue().floatValue()));
                }
            }
        }
        return linkedList;
    }

    private final void setReportData(Map<Integer, FitnessDataBaseParser.DataValueItem> reportData, int dataType, EcgMeasureResult measureResult) {
        FitnessDataBaseParser.DataValueItem dataValueItem = reportData.get(Integer.valueOf(dataType));
        if (dataValueItem == null || !dataValueItem.getValid()) {
            return;
        }
        if (dataType == -4) {
            measureResult.setDataSource(dataValueItem.getValue().intValue());
            return;
        }
        if (dataType == -3) {
            measureResult.setStartMeasureTime(dataValueItem.getValue().longValue());
            return;
        }
        if (dataType == -2) {
            measureResult.setMeasureDuration(dataValueItem.getValue().intValue());
            return;
        }
        if (dataType == -1) {
            measureResult.setSampleFrequency(dataValueItem.getValue().intValue());
            return;
        }
        if (dataType == 0) {
            measureResult.setAvgHr(Integer.valueOf(dataValueItem.getValue().intValue()));
        } else if (dataType == 2) {
            measureResult.setAnalysisResult(Integer.valueOf(dataValueItem.getValue().intValue()));
        } else {
            if (dataType != 3) {
                return;
            }
            measureResult.setSymptomValue(Long.valueOf(dataValueItem.getValue().longValue()));
        }
    }

    @Override // com.xiaomi.fit.fitness.parser.base.FitnessDataBaseParser
    @Nullable
    public FitnessParseResult parse(@NotNull FitnessBinaryData binaryData) {
        Intrinsics.checkNotNullParameter(binaryData, "binaryData");
        if (binaryData.getDataValid() == null) {
            FitnessLogUtils.w(this.TAG, "not support parse " + binaryData.getDataId());
            return null;
        }
        ParserWayControl parserWayControl = ParserWayControl.INSTANCE;
        String schema = parserWayControl.getSchema(binaryData);
        if (schema == null || !(!StringsKt__StringsKt.isBlank(schema))) {
            FitnessLogUtils.i(this.TAG, "parse ecg measure by native");
            if (ParserPreference.INSTANCE.getIS_USE_NATIVE_PARSER()) {
                return nativeParseEcgMeasure(binaryData);
            }
        } else {
            try {
                FitnessLogUtils.i(this.TAG, "parse ecg measure by schema");
                SchemaDailyParser schemaDailyParser = SchemaDailyParser.INSTANCE;
                String schema2 = parserWayControl.getSchema(binaryData);
                Intrinsics.checkNotNull(schema2);
                return schemaDailyParser.parser(binaryData, schema2);
            } catch (Exception e) {
                FitnessLogUtils.i(this.TAG, "parse ecg measure by schema error , e:" + e + " , trace:" + Log.getStackTraceString(e));
                if (ParserPreference.INSTANCE.getIS_USE_NATIVE_PARSER()) {
                    return nativeParseEcgMeasure(binaryData);
                }
            }
        }
        return null;
    }
}
