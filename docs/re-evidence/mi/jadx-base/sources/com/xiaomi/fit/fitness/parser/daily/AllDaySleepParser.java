package com.xiaomi.fit.fitness.parser.daily;

import android.util.Log;
import com.xiaomi.fit.data.common.data.daily.SleepAssistItemInfo;
import com.xiaomi.fit.data.common.data.mi.FitnessDataId;
import com.xiaomi.fit.data.common.log.FitnessLogUtils;
import com.xiaomi.fit.fitness.parser.base.FitnessDataBaseParser;
import com.xiaomi.fit.fitness.parser.base.OneDimenDataParser;
import com.xiaomi.fit.fitness.parser.data.AllDaySleepParseData;
import com.xiaomi.fit.fitness.parser.data.FitnessBinaryData;
import com.xiaomi.fit.fitness.parser.data.FitnessParseResult;
import com.xiaomi.fit.fitness.parser.schema.DailyReportKey;
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
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001:\u0001&B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u000b\u001a\u0004\u0018\u00010\f2\u0006\u0010\r\u001a\u00020\u000eH\u0016J\u0010\u0010\u000f\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0002J$\u0010\u0010\u001a\u00020\u00112\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00150\u00132\u0006\u0010\u0016\u001a\u00020\u0017H\u0002J\u001a\u0010\u0018\u001a\u00020\u00112\b\u0010\u0019\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u0016\u001a\u00020\u0017H\u0002J4\u0010\u001a\u001a\u00020\u00112\u0006\u0010\u001b\u001a\u00020\u001c2\u0012\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u001e0\u00132\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u001f\u001a\u00020\u0014H\u0002J\"\u0010 \u001a\u00020\u00112\u0006\u0010!\u001a\u00020\u00142\b\u0010\"\u001a\u0004\u0018\u00010#2\u0006\u0010\u0016\u001a\u00020\u0017H\u0002J*\u0010$\u001a\u0004\u0018\u00010#2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001f\u001a\u00020\u00142\u0006\u0010%\u001a\u00020\b2\u0006\u0010\u0016\u001a\u00020\u0017H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082D¢\u0006\u0002\n\u0000R\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\tR\u0016\u0010\n\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\t¨\u0006'"}, d2 = {"Lcom/xiaomi/fit/fitness/parser/daily/AllDaySleepParser;", "Lcom/xiaomi/fit/fitness/parser/base/FitnessDataBaseParser;", "<init>", "()V", "TAG", "", "dataTypeArray", "", "Lcom/xiaomi/fit/fitness/parser/base/FitnessDataBaseParser$OneDimenDataType;", "[Lcom/xiaomi/fit/fitness/parser/base/FitnessDataBaseParser$OneDimenDataType;", "recordDataTypeArray", "parse", "Lcom/xiaomi/fit/fitness/parser/data/FitnessParseResult;", "binaryData", "Lcom/xiaomi/fit/fitness/parser/data/FitnessBinaryData;", "nativeParseAllDaySleep", "processSleepReportData", "", "resultMap", "", "", "Lcom/xiaomi/fit/fitness/parser/base/FitnessDataBaseParser$DataValueItem;", "sleepParseData", "Lcom/xiaomi/fit/fitness/parser/data/AllDaySleepParseData;", "setSleepReportData", "valueItem", "parseRecordSleepInfo", "byteBuffer", "Ljava/nio/ByteBuffer;", "validMap", "", "version", "setSleepRecordData", "dataType", "recordInfo", "Lcom/xiaomi/fit/data/common/data/daily/SleepAssistItemInfo;", "parseSleepAssistInfo", "dataTypeInfo", "DataType", "fitness-parser_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nAllDaySleepParser.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AllDaySleepParser.kt\ncom/xiaomi/fit/fitness/parser/daily/AllDaySleepParser\n+ 2 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,211:1\n37#2:212\n36#2,3:213\n*S KotlinDebug\n*F\n+ 1 AllDaySleepParser.kt\ncom/xiaomi/fit/fitness/parser/daily/AllDaySleepParser\n*L\n206#1:212\n206#1:213,3\n*E\n"})
public final class AllDaySleepParser extends FitnessDataBaseParser {

    @NotNull
    private final String TAG = "AllDaySleepParser";

    @NotNull
    private final FitnessDataBaseParser.OneDimenDataType[] dataTypeArray = {new FitnessDataBaseParser.OneDimenDataType(-1, 1, 1, false, null, false, null, 120, null), new FitnessDataBaseParser.OneDimenDataType(0, 4, 1, false, null, false, null, 120, null), new FitnessDataBaseParser.OneDimenDataType(1, 4, 1, false, null, false, null, 120, null), new FitnessDataBaseParser.OneDimenDataType(2, 1, 4, false, null, false, null, 120, null), new FitnessDataBaseParser.OneDimenDataType(6, 1, 5, false, null, false, null, 120, null), new FitnessDataBaseParser.OneDimenDataType(7, 4, 5, false, null, false, null, 120, null), new FitnessDataBaseParser.OneDimenDataType(8, 4, 5, false, null, false, null, 120, null), new FitnessDataBaseParser.OneDimenDataType(9, 4, 5, false, null, false, null, 120, null), new FitnessDataBaseParser.OneDimenDataType(10, 4, 5, false, null, false, null, 120, null), new FitnessDataBaseParser.OneDimenDataType(3, 0, 1, false, null, false, null, 120, null), new FitnessDataBaseParser.OneDimenDataType(4, 0, 1, false, null, false, null, 120, null), new FitnessDataBaseParser.OneDimenDataType(5, 0, 3, true, null, false, null, 112, null)};

    @NotNull
    private final FitnessDataBaseParser.OneDimenDataType[] recordDataTypeArray = {new FitnessDataBaseParser.OneDimenDataType(3, 1, 1, false, null, false, null, 120, null), new FitnessDataBaseParser.OneDimenDataType(4, 1, 1, false, null, false, null, 120, null), new FitnessDataBaseParser.OneDimenDataType(5, 4, 3, true, null, false, null, 112, null)};

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\f\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lcom/xiaomi/fit/fitness/parser/daily/AllDaySleepParser$DataType;", "", "<init>", "()V", "isSleepFinish", "", "bedTime", "wakeupTime", DailyReportKey.sleepQuality, "hr", "sp02", "snoreDecibel", DailyReportKey.sleepEfficiency, "entrySleepDuration", "linBedDuration", DailyReportKey.goBedTime, "leaveBedTime", "fitness-parser_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class DataType {

        @NotNull
        public static final DataType INSTANCE = new DataType();
        public static final int bedTime = 0;
        public static final int entrySleepDuration = 7;
        public static final int goBedTime = 9;
        public static final int hr = 3;
        public static final int isSleepFinish = -1;
        public static final int leaveBedTime = 10;
        public static final int linBedDuration = 8;
        public static final int sleepEfficiency = 6;
        public static final int sleepQuality = 2;
        public static final int snoreDecibel = 5;
        public static final int sp02 = 4;
        public static final int wakeupTime = 1;

        private DataType() {
        }
    }

    private final FitnessParseResult nativeParseAllDaySleep(FitnessBinaryData binaryData) {
        FitnessLogUtils.i(this.TAG, "native parse allDaySleep");
        OneDimenDataParser oneDimenDataParser = OneDimenDataParser.INSTANCE;
        FitnessDataBaseParser.OneDimenDataType[] oneDimenDataTypeArr = this.dataTypeArray;
        FitnessDataId dataId = binaryData.getDataId();
        byte[] dataValid = binaryData.getDataValid();
        Intrinsics.checkNotNull(dataValid);
        Map<Integer, Boolean> dataValid2 = oneDimenDataParser.parseDataValid(oneDimenDataTypeArr, dataId, dataValid);
        ByteBuffer byteBufferOrder = ByteBuffer.wrap(binaryData.getBodyData()).order(ByteOrder.LITTLE_ENDIAN);
        FitnessDataBaseParser.OneDimenDataType[] oneDimenDataTypeArr2 = this.dataTypeArray;
        FitnessDataId dataId2 = binaryData.getDataId();
        Intrinsics.checkNotNull(byteBufferOrder);
        Map<Integer, FitnessDataBaseParser.DataValueItem> oneRecord = oneDimenDataParser.parseOneRecord(oneDimenDataTypeArr2, dataId2, dataValid2, byteBufferOrder);
        AllDaySleepParseData allDaySleepParseData = new AllDaySleepParseData();
        processSleepReportData(oneRecord, allDaySleepParseData);
        parseRecordSleepInfo(byteBufferOrder, dataValid2, allDaySleepParseData, binaryData.getDataId().getVersion());
        allDaySleepParseData.setSleepSrcDataLen(byteBufferOrder.capacity() - byteBufferOrder.position());
        FitnessLogUtils.i(this.TAG, "sleepReport(" + allDaySleepParseData + ")");
        return new FitnessParseResult.Builder().allDaySleep(allDaySleepParseData).build();
    }

    private final void parseRecordSleepInfo(ByteBuffer byteBuffer, Map<Integer, Boolean> validMap, AllDaySleepParseData sleepParseData, int version) {
        for (FitnessDataBaseParser.OneDimenDataType oneDimenDataType : this.recordDataTypeArray) {
            if (validMap.get(Integer.valueOf(oneDimenDataType.getType())) != null) {
                Boolean bool = validMap.get(Integer.valueOf(oneDimenDataType.getType()));
                Intrinsics.checkNotNull(bool);
                if (bool.booleanValue()) {
                    setSleepRecordData(oneDimenDataType.getType(), parseSleepAssistInfo(byteBuffer, version, oneDimenDataType, sleepParseData), sleepParseData);
                }
            }
        }
    }

    private final SleepAssistItemInfo parseSleepAssistInfo(ByteBuffer byteBuffer, int version, FitnessDataBaseParser.OneDimenDataType dataTypeInfo, AllDaySleepParseData sleepParseData) {
        int iCapacity = byteBuffer.capacity();
        if (byteBuffer.position() + 4 > iCapacity) {
            FitnessLogUtils.w(this.TAG, "parseSleepAssistInfo: invalid  dataLen");
            return null;
        }
        FitnessParserUtils fitnessParserUtils = FitnessParserUtils.INSTANCE;
        short intFor2Bytes$default = (short) FitnessParserUtils.getIntFor2Bytes$default(fitnessParserUtils, byteBuffer, false, 2, null);
        short intFor2Bytes$default2 = (short) FitnessParserUtils.getIntFor2Bytes$default(fitnessParserUtils, byteBuffer, false, 2, null);
        if (intFor2Bytes$default2 <= 0) {
            return null;
        }
        int byteCount = dataTypeInfo.getByteCount() * intFor2Bytes$default2;
        if (version >= 2) {
            byteCount += 4;
        }
        if (byteBuffer.position() + byteCount > iCapacity) {
            FitnessLogUtils.w(this.TAG, "parseSleepAssistInfo: recordCount = " + ((int) intFor2Bytes$default2) + ", cap = " + iCapacity);
            return null;
        }
        Long deviceBedTime = sleepParseData.getDeviceBedTime();
        long intFor4Bytes$default = version >= 2 ? FitnessParserUtils.getIntFor4Bytes$default(fitnessParserUtils, byteBuffer, false, 2, null) : deviceBedTime != null ? deviceBedTime.longValue() : 0L;
        ArrayList arrayList = new ArrayList();
        if (1 <= intFor2Bytes$default2) {
            int i = 1;
            while (true) {
                arrayList.add(OneDimenDataParser.parseDataValue$default(OneDimenDataParser.INSTANCE, byteBuffer, dataTypeInfo, true, 0, 8, null).getValue());
                if (i == intFor2Bytes$default2) {
                    break;
                }
                i++;
            }
        }
        return new SleepAssistItemInfo(intFor4Bytes$default, intFor2Bytes$default, intFor2Bytes$default2, (Number[]) arrayList.toArray(new Number[0]));
    }

    private final void processSleepReportData(Map<Integer, FitnessDataBaseParser.DataValueItem> resultMap, AllDaySleepParseData sleepParseData) {
        for (FitnessDataBaseParser.OneDimenDataType oneDimenDataType : this.dataTypeArray) {
            setSleepReportData(resultMap.get(Integer.valueOf(oneDimenDataType.getType())), sleepParseData);
        }
    }

    private final void setSleepRecordData(int dataType, SleepAssistItemInfo recordInfo, AllDaySleepParseData sleepParseData) {
        if (recordInfo == null) {
            return;
        }
        if (dataType == 3) {
            sleepParseData.setHrInfo(recordInfo);
        } else if (dataType == 4) {
            sleepParseData.setSpo2Info(recordInfo);
        } else {
            if (dataType != 5) {
                return;
            }
            sleepParseData.setSnoreDecibelInfo(recordInfo);
        }
    }

    private final void setSleepReportData(FitnessDataBaseParser.DataValueItem valueItem, AllDaySleepParseData sleepParseData) {
        if (valueItem == null || !valueItem.getValid()) {
            return;
        }
        int type = valueItem.getType();
        if (type == -1) {
            sleepParseData.setSleepFinish(Intrinsics.compare(valueItem.getValue().intValue(), 1) == 0);
        }
        if (type == 0) {
            sleepParseData.setDeviceBedTime(Long.valueOf(valueItem.getValue().longValue()));
            return;
        }
        if (type == 1) {
            sleepParseData.setDeviceWakeupTime(Long.valueOf(valueItem.getValue().longValue()));
            return;
        }
        if (type == 2) {
            sleepParseData.setSleepQuality(Integer.valueOf(valueItem.getValue().intValue()));
            return;
        }
        switch (type) {
            case 6:
                sleepParseData.setSleepEfficiency(Integer.valueOf(valueItem.getValue().intValue()));
                break;
            case 7:
                sleepParseData.setEntrySleepDuration(Long.valueOf(valueItem.getValue().longValue()));
                break;
            case 8:
                sleepParseData.setLinBedDuration(Long.valueOf(valueItem.getValue().longValue()));
                break;
            case 9:
                sleepParseData.setGoBedTime(Long.valueOf(valueItem.getValue().longValue()));
                break;
            case 10:
                sleepParseData.setLeaveBedTime(Long.valueOf(valueItem.getValue().longValue()));
                break;
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
            FitnessLogUtils.i(this.TAG, "parse allDaySleep by native");
            if (ParserPreference.INSTANCE.getIS_USE_NATIVE_PARSER()) {
                return nativeParseAllDaySleep(binaryData);
            }
        } else {
            try {
                FitnessLogUtils.i(this.TAG, "parse allDaySleep by schema");
                SchemaDailyParser schemaDailyParser = SchemaDailyParser.INSTANCE;
                String schema2 = parserWayControl.getSchema(binaryData);
                Intrinsics.checkNotNull(schema2);
                return schemaDailyParser.parser(binaryData, schema2);
            } catch (Exception e) {
                FitnessLogUtils.i(this.TAG, "parse allDaySleep by schema error , e:" + e + " , trace:" + Log.getStackTraceString(e));
                if (ParserPreference.INSTANCE.getIS_USE_NATIVE_PARSER()) {
                    return nativeParseAllDaySleep(binaryData);
                }
            }
        }
        return null;
    }
}
