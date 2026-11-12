package com.xiaomi.fit.fitness.parser.daily;

import android.util.Log;
import com.xiaomi.fit.data.common.data.mi.FitnessDataId;
import com.xiaomi.fit.data.common.log.FitnessLogUtils;
import com.xiaomi.fit.fitness.parser.base.FitnessDataBaseParser;
import com.xiaomi.fit.fitness.parser.base.OneDimenDataParser;
import com.xiaomi.fit.fitness.parser.data.AbnormalRecord;
import com.xiaomi.fit.fitness.parser.data.FitnessBinaryData;
import com.xiaomi.fit.fitness.parser.data.FitnessParseResult;
import com.xiaomi.fit.fitness.parser.data.RecordItem;
import com.xiaomi.fit.fitness.parser.schema.ParserWayControl;
import com.xiaomi.fit.fitness.parser.schema.daily.SchemaDailyParser;
import com.xiaomi.fit.fitness.parser.utils.FitnessParserUtils;
import com.xiaomi.fit.fitness.parser.utils.ParserPreference;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0019B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\f\u001a\u00020\rH\u0016J\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\f\u001a\u00020\rH\u0002J\u0018\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0002J\u001a\u0010\u0015\u001a\u00020\u00102\b\u0010\u0016\u001a\u0004\u0018\u00010\u00172\u0006\u0010\u0018\u001a\u00020\u0012H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082D¢\u0006\u0002\n\u0000R\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\t¨\u0006\u001a"}, d2 = {"Lcom/xiaomi/fit/fitness/parser/daily/AbnormalRecordParser;", "Lcom/xiaomi/fit/fitness/parser/base/FitnessDataBaseParser;", "<init>", "()V", "TAG", "", "dataTypeArray", "", "Lcom/xiaomi/fit/fitness/parser/base/FitnessDataBaseParser$OneDimenDataType;", "[Lcom/xiaomi/fit/fitness/parser/base/FitnessDataBaseParser$OneDimenDataType;", "parse", "Lcom/xiaomi/fit/fitness/parser/data/FitnessParseResult;", "binaryData", "Lcom/xiaomi/fit/fitness/parser/data/FitnessBinaryData;", "nativeParseAbnormal", "parseAbnormalRecord", "", "record", "Lcom/xiaomi/fit/fitness/parser/data/AbnormalRecord;", "byteBuffer", "Ljava/nio/ByteBuffer;", "setAbnormalReportData", "valueItem", "Lcom/xiaomi/fit/fitness/parser/base/FitnessDataBaseParser$DataValueItem;", "abnormalRecordParseData", "DataType", "fitness-parser_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class AbnormalRecordParser extends FitnessDataBaseParser {

    @NotNull
    private final String TAG = "AbnormalRecordParser";

    @NotNull
    private final FitnessDataBaseParser.OneDimenDataType[] dataTypeArray = {new FitnessDataBaseParser.OneDimenDataType(-1, 4, 1, false, null, false, null, 120, null), new FitnessDataBaseParser.OneDimenDataType(-2, 4, 1, false, null, false, null, 120, null), new FitnessDataBaseParser.OneDimenDataType(-3, 1, 1, false, null, false, null, 120, null), new FitnessDataBaseParser.OneDimenDataType(-4, 1, 2, false, null, false, null, 120, null), new FitnessDataBaseParser.OneDimenDataType(-5, 2, 1, false, null, false, null, 120, null)};

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/xiaomi/fit/fitness/parser/daily/AbnormalRecordParser$DataType;", "", "<init>", "()V", "startTime", "", "endTime", "abnormalType", "abnormalSetValue", "recordCount", "fitness-parser_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class DataType {

        @NotNull
        public static final DataType INSTANCE = new DataType();
        public static final int abnormalSetValue = -4;
        public static final int abnormalType = -3;
        public static final int endTime = -2;
        public static final int recordCount = -5;
        public static final int startTime = -1;

        private DataType() {
        }
    }

    private final FitnessParseResult nativeParseAbnormal(FitnessBinaryData binaryData) {
        FitnessLogUtils.i(this.TAG, "native parse abnormal");
        OneDimenDataParser oneDimenDataParser = OneDimenDataParser.INSTANCE;
        FitnessDataBaseParser.OneDimenDataType[] oneDimenDataTypeArr = this.dataTypeArray;
        FitnessDataId dataId = binaryData.getDataId();
        byte[] dataValid = binaryData.getDataValid();
        Intrinsics.checkNotNull(dataValid);
        Map<Integer, Boolean> dataValid2 = oneDimenDataParser.parseDataValid(oneDimenDataTypeArr, dataId, dataValid);
        ByteBuffer byteBufferOrder = ByteBuffer.wrap(binaryData.getBodyData()).order(ByteOrder.LITTLE_ENDIAN);
        int iCapacity = byteBufferOrder.capacity();
        if (iCapacity < 11) {
            FitnessLogUtils.e(this.TAG, "invalid data len(" + iCapacity + ") " + binaryData.getDataId());
            return null;
        }
        ArrayList arrayList = new ArrayList();
        int iCapacity2 = byteBufferOrder.capacity();
        for (int iPosition = byteBufferOrder.position(); iCapacity2 - iPosition >= 11; iPosition = byteBufferOrder.position()) {
            AbnormalRecord abnormalRecord = new AbnormalRecord();
            OneDimenDataParser oneDimenDataParser2 = OneDimenDataParser.INSTANCE;
            FitnessDataBaseParser.OneDimenDataType[] oneDimenDataTypeArr2 = this.dataTypeArray;
            FitnessDataId dataId2 = binaryData.getDataId();
            Intrinsics.checkNotNull(byteBufferOrder);
            Map<Integer, FitnessDataBaseParser.DataValueItem> oneRecord = oneDimenDataParser2.parseOneRecord(oneDimenDataTypeArr2, dataId2, dataValid2, byteBufferOrder);
            for (FitnessDataBaseParser.OneDimenDataType oneDimenDataType : this.dataTypeArray) {
                setAbnormalReportData(oneRecord.get(Integer.valueOf(oneDimenDataType.getType())), abnormalRecord);
            }
            parseAbnormalRecord(abnormalRecord, byteBufferOrder);
            arrayList.add(abnormalRecord);
            iCapacity2 = byteBufferOrder.capacity();
        }
        return new FitnessParseResult.Builder().abnormalRecords(arrayList).build();
    }

    private final void parseAbnormalRecord(AbnormalRecord record, ByteBuffer byteBuffer) {
        int i;
        int recordCount = record.getRecordCount();
        if (recordCount <= 0) {
            FitnessLogUtils.e(this.TAG, "invalid count(" + record + "), ignore parse");
            return;
        }
        int iCapacity = byteBuffer.capacity() - byteBuffer.position();
        ArrayList arrayList = new ArrayList();
        while (true) {
            i = recordCount - 1;
            if (recordCount <= 0 || iCapacity < 5) {
                break;
            }
            FitnessParserUtils fitnessParserUtils = FitnessParserUtils.INSTANCE;
            arrayList.add(new RecordItem(FitnessParserUtils.getIntFor4Bytes$default(fitnessParserUtils, byteBuffer, false, 2, null), FitnessParserUtils.getIntFor1Byte$default(fitnessParserUtils, byteBuffer, false, 2, null)));
            iCapacity = byteBuffer.capacity() - byteBuffer.position();
            recordCount = i;
        }
        record.setRecordList(arrayList);
        if (arrayList.size() != record.getRecordCount()) {
            FitnessLogUtils.e(this.TAG, "dataList.size != record.recordCount(" + record + ")");
        }
        if (i > 0) {
            FitnessLogUtils.e(this.TAG, "have no bytes to parse (" + i + ") record,(" + record + ")");
        }
    }

    private final void setAbnormalReportData(FitnessDataBaseParser.DataValueItem valueItem, AbnormalRecord abnormalRecordParseData) {
        if (valueItem == null || !valueItem.getValid()) {
            return;
        }
        int type = valueItem.getType();
        if (type == -5) {
            abnormalRecordParseData.setRecordCount(valueItem.getValue().intValue());
            return;
        }
        if (type == -4) {
            abnormalRecordParseData.setAbnormalSetValue(valueItem.getValue().intValue());
            return;
        }
        if (type == -3) {
            abnormalRecordParseData.setAbnormalType(valueItem.getValue().intValue());
        } else if (type == -2) {
            abnormalRecordParseData.setEndTime(valueItem.getValue().longValue());
        } else {
            if (type != -1) {
                return;
            }
            abnormalRecordParseData.setStartTime(valueItem.getValue().longValue());
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
            FitnessLogUtils.i(this.TAG, "parse abnormal by native");
            if (ParserPreference.INSTANCE.getIS_USE_NATIVE_PARSER()) {
                return nativeParseAbnormal(binaryData);
            }
        } else {
            try {
                FitnessLogUtils.i(this.TAG, "parse abnormal by schema");
                SchemaDailyParser schemaDailyParser = SchemaDailyParser.INSTANCE;
                String schema2 = parserWayControl.getSchema(binaryData);
                Intrinsics.checkNotNull(schema2);
                return schemaDailyParser.parser(binaryData, schema2);
            } catch (Exception e) {
                FitnessLogUtils.i(this.TAG, "parse abnormal by schema error , e:" + e + " , trace:" + Log.getStackTraceString(e));
                if (ParserPreference.INSTANCE.getIS_USE_NATIVE_PARSER()) {
                    return nativeParseAbnormal(binaryData);
                }
            }
        }
        return null;
    }
}
