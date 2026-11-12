package com.xiaomi.fit.fitness.parser.daily;

import android.util.Log;
import com.tencent.wcdb.FileUtils;
import com.xiaomi.fit.data.common.log.FitnessLogUtils;
import com.xiaomi.fit.fitness.parser.base.FitnessDataBaseParser;
import com.xiaomi.fit.fitness.parser.base.FourDimenDataParser;
import com.xiaomi.fit.fitness.parser.data.FitnessBinaryData;
import com.xiaomi.fit.fitness.parser.data.FitnessParseResult;
import com.xiaomi.fit.fitness.parser.data.ParsedDailyRecord;
import com.xiaomi.fit.fitness.parser.schema.DailyRecordKey;
import com.xiaomi.fit.fitness.parser.schema.ParserWayControl;
import com.xiaomi.fit.fitness.parser.schema.daily.SchemaDailyParser;
import com.xiaomi.fit.fitness.parser.utils.ParserPreference;
import com.xiaomi.smarthome.library.common.util.DateTimeHelper;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001:\u0001#B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0016J\u0010\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0002J\u001b\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00072\u0006\u0010\u0014\u001a\u00020\u0015H\u0002¢\u0006\u0002\u0010\u0016J8\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00190\u00182\u0006\u0010\u0014\u001a\u00020\u00152\u0018\u0010\u001a\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u001c0\u001b0\u00182\u0006\u0010\u001d\u001a\u00020\u001eH\u0002J\"\u0010\u001f\u001a\u00020 2\u0006\u0010\u0014\u001a\u00020\u00152\b\u0010!\u001a\u0004\u0018\u00010\u001c2\u0006\u0010\"\u001a\u00020\u0019H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082D¢\u0006\u0002\n\u0000R\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\tR\u0016\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0007X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\fR\u0016\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0007X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\f¨\u0006$"}, d2 = {"Lcom/xiaomi/fit/fitness/parser/daily/DailyRecordParser;", "Lcom/xiaomi/fit/fitness/parser/base/FitnessDataBaseParser;", "<init>", "()V", "TAG", "", "fourDimenTypeArray", "", "Lcom/xiaomi/fit/fitness/parser/base/FitnessDataBaseParser$FourDimenType;", "[Lcom/xiaomi/fit/fitness/parser/base/FitnessDataBaseParser$FourDimenType;", "v1DataInfoArray", "Lcom/xiaomi/fit/fitness/parser/base/FitnessDataBaseParser$FourDimenDataInfo;", "[Lcom/xiaomi/fit/fitness/parser/base/FitnessDataBaseParser$FourDimenDataInfo;", "v2DataInfoArray", "parse", "Lcom/xiaomi/fit/fitness/parser/data/FitnessParseResult;", "binaryData", "Lcom/xiaomi/fit/fitness/parser/data/FitnessBinaryData;", "nativeParseDailyRecord", "getDataInfoArray", "version", "", "(I)[Lcom/xiaomi/fit/fitness/parser/base/FitnessDataBaseParser$FourDimenDataInfo;", "processDailyRecordList", "", "Lcom/xiaomi/fit/fitness/parser/data/ParsedDailyRecord;", "mapList", "", "Lcom/xiaomi/fit/fitness/parser/base/FitnessDataBaseParser$DataValueItem;", "startRecordTime", "", "setDailyRecordData", "", "valueItem", "dailyRecord", "DataItemType", "fitness-parser_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class DailyRecordParser extends FitnessDataBaseParser {

    @NotNull
    private final String TAG = "DailyRecordParser";

    @NotNull
    private final FitnessDataBaseParser.FourDimenType[] fourDimenTypeArray;

    @NotNull
    private final FitnessDataBaseParser.FourDimenDataInfo[] v1DataInfoArray;

    @NotNull
    private final FitnessDataBaseParser.FourDimenDataInfo[] v2DataInfoArray;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0013\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0018"}, d2 = {"Lcom/xiaomi/fit/fitness/parser/daily/DailyRecordParser$DataItemType;", "", "<init>", "()V", "includeSleep", "", "includeAbHr", "steps", "activityType", "calories", "activityHILevel", DailyRecordKey.sportType, "distance", "hr", "energy", "sleepMode", "totalCal", "energyState", "energyStateValue", "spo2", "pressure", "hrPreAbnormal", "lightValue", "bodyMomentum", "fitness-parser_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class DataItemType {

        @NotNull
        public static final DataItemType INSTANCE = new DataItemType();
        public static final int activityHILevel = 5;
        public static final int activityType = 3;
        public static final int bodyMomentum = 18;
        public static final int calories = 4;
        public static final int distance = 7;
        public static final int energy = 9;
        public static final int energyState = 12;
        public static final int energyStateValue = 13;
        public static final int hr = 8;
        public static final int hrPreAbnormal = 16;
        public static final int includeAbHr = 1;
        public static final int includeSleep = 0;
        public static final int lightValue = 17;
        public static final int pressure = 15;
        public static final int sleepMode = 10;
        public static final int spo2 = 14;
        public static final int sportType = 6;
        public static final int steps = 2;
        public static final int totalCal = 11;

        private DataItemType() {
        }
    }

    public DailyRecordParser() {
        FitnessDataBaseParser.FourDimenType[] fourDimenTypeArr = {new FitnessDataBaseParser.FourDimenType(0, 1, 2), new FitnessDataBaseParser.FourDimenType(3, 4, null, 4, null), new FitnessDataBaseParser.FourDimenType(5, 6, null, 4, null), new FitnessDataBaseParser.FourDimenType(7, null, null, 6, null), new FitnessDataBaseParser.FourDimenType(8, null, null, 6, null), new FitnessDataBaseParser.FourDimenType(9, null, null, 6, null), new FitnessDataBaseParser.FourDimenType(10, 12, 13), new FitnessDataBaseParser.FourDimenType(11, 12, 13), new FitnessDataBaseParser.FourDimenType(14, null, null, 6, null), new FitnessDataBaseParser.FourDimenType(15, null, null, 6, null), new FitnessDataBaseParser.FourDimenType(16, null, null, 6, null), new FitnessDataBaseParser.FourDimenType(17, null, null, 6, null), new FitnessDataBaseParser.FourDimenType(18, null, null, 6, null)};
        this.fourDimenTypeArray = fourDimenTypeArr;
        this.v1DataInfoArray = new FitnessDataBaseParser.FourDimenDataInfo[]{new FitnessDataBaseParser.FourDimenDataInfo(fourDimenTypeArr[0], 2, new FitnessDataBaseParser.DataItemLen(15, 1), new FitnessDataBaseParser.DataItemLen(14, 1), new FitnessDataBaseParser.DataItemLen(0, 14), 1, null, false, null, FileUtils.S_IRWXU, null), new FitnessDataBaseParser.FourDimenDataInfo(fourDimenTypeArr[1], 1, new FitnessDataBaseParser.DataItemLen(4, 4), new FitnessDataBaseParser.DataItemLen(0, 4), null, 1, null, false, null, FileUtils.S_IRWXU, null), new FitnessDataBaseParser.FourDimenDataInfo(fourDimenTypeArr[2], 1, new FitnessDataBaseParser.DataItemLen(5, 3), new FitnessDataBaseParser.DataItemLen(0, 5), null, 1, null, false, null, FileUtils.S_IRWXU, null), new FitnessDataBaseParser.FourDimenDataInfo(fourDimenTypeArr[3], 2, new FitnessDataBaseParser.DataItemLen(2), null, null, 1, null, false, null, FileUtils.S_IRWXU, null), new FitnessDataBaseParser.FourDimenDataInfo(fourDimenTypeArr[4], 1, new FitnessDataBaseParser.DataItemLen(1), null, null, 1, null, false, null, FileUtils.S_IRWXU, null), new FitnessDataBaseParser.FourDimenDataInfo(fourDimenTypeArr[5], 1, new FitnessDataBaseParser.DataItemLen(1), null, null, 1, null, false, null, FileUtils.S_IRWXU, null), new FitnessDataBaseParser.FourDimenDataInfo(fourDimenTypeArr[6], 2, new FitnessDataBaseParser.DataItemLen(13, 3), new FitnessDataBaseParser.DataItemLen(11, 2), new FitnessDataBaseParser.DataItemLen(0, 11), 1, null, false, null, FileUtils.S_IRWXU, null), new FitnessDataBaseParser.FourDimenDataInfo(fourDimenTypeArr[10], 1, new FitnessDataBaseParser.DataItemLen(1), null, null, 1, new FitnessDataBaseParser.DynamicValidDataType(16, 1, 1), false, null, 384, null)};
        this.v2DataInfoArray = new FitnessDataBaseParser.FourDimenDataInfo[]{new FitnessDataBaseParser.FourDimenDataInfo(fourDimenTypeArr[0], 2, null, new FitnessDataBaseParser.DataItemLen(14, 1), new FitnessDataBaseParser.DataItemLen(0, 14), 2, null, false, null, FileUtils.S_IRWXU, null), new FitnessDataBaseParser.FourDimenDataInfo(fourDimenTypeArr[1], 1, new FitnessDataBaseParser.DataItemLen(6, 2), new FitnessDataBaseParser.DataItemLen(0, 6), null, 2, null, false, null, FileUtils.S_IRWXU, null), new FitnessDataBaseParser.FourDimenDataInfo(fourDimenTypeArr[2], 1, new FitnessDataBaseParser.DataItemLen(5, 3), new FitnessDataBaseParser.DataItemLen(0, 5), null, 2, null, false, null, FileUtils.S_IRWXU, null), new FitnessDataBaseParser.FourDimenDataInfo(fourDimenTypeArr[3], 2, new FitnessDataBaseParser.DataItemLen(2), null, null, 2, null, false, null, FileUtils.S_IRWXU, null), new FitnessDataBaseParser.FourDimenDataInfo(fourDimenTypeArr[4], 1, new FitnessDataBaseParser.DataItemLen(1), null, null, 2, null, false, null, FileUtils.S_IRWXU, null), new FitnessDataBaseParser.FourDimenDataInfo(fourDimenTypeArr[5], 1, new FitnessDataBaseParser.DataItemLen(1), null, null, 2, null, false, null, FileUtils.S_IRWXU, null), new FitnessDataBaseParser.FourDimenDataInfo(fourDimenTypeArr[7], 2, new FitnessDataBaseParser.DataItemLen(10, 6), new FitnessDataBaseParser.DataItemLen(8, 2), new FitnessDataBaseParser.DataItemLen(0, 8), 2, null, false, null, FileUtils.S_IRWXU, null), new FitnessDataBaseParser.FourDimenDataInfo(fourDimenTypeArr[8], 1, new FitnessDataBaseParser.DataItemLen(1), null, null, 3, null, false, null, FileUtils.S_IRWXU, null), new FitnessDataBaseParser.FourDimenDataInfo(fourDimenTypeArr[9], 1, new FitnessDataBaseParser.DataItemLen(1), null, null, 3, null, false, null, FileUtils.S_IRWXU, null), new FitnessDataBaseParser.FourDimenDataInfo(null, 1, new FitnessDataBaseParser.DataItemLen(1), null, null, 2, new FitnessDataBaseParser.DynamicValidDataType(16, 1, 1), false, null, 384, null), new FitnessDataBaseParser.FourDimenDataInfo(fourDimenTypeArr[11], 2, new FitnessDataBaseParser.DataItemLen(2), null, null, 4, null, false, null, FileUtils.S_IRWXU, null), new FitnessDataBaseParser.FourDimenDataInfo(fourDimenTypeArr[12], 2, new FitnessDataBaseParser.DataItemLen(2), null, null, 4, null, false, null, FileUtils.S_IRWXU, null)};
    }

    private final FitnessDataBaseParser.FourDimenDataInfo[] getDataInfoArray(int version) {
        return version == 1 ? this.v1DataInfoArray : this.v2DataInfoArray;
    }

    private final FitnessParseResult nativeParseDailyRecord(FitnessBinaryData binaryData) {
        FitnessLogUtils.i(this.TAG, "native parse daily record");
        int version = binaryData.getDataId().getVersion();
        List<Map<Integer, FitnessDataBaseParser.DataValueItem>> loopRecord = FourDimenDataParser.INSTANCE.parseLoopRecord(binaryData, getDataInfoArray(version), DateTimeHelper.sDayInMinutes);
        long timeStamp = binaryData.getDataId().getTimeStamp();
        List<ParsedDailyRecord> listProcessDailyRecordList = processDailyRecordList(version, loopRecord, timeStamp);
        FitnessLogUtils.i(this.TAG, "startTime = " + timeStamp + ", record size = " + listProcessDailyRecordList.size());
        return new FitnessParseResult.Builder().dailyDataRecord(listProcessDailyRecordList).build();
    }

    private final List<ParsedDailyRecord> processDailyRecordList(int version, List<? extends Map<Integer, FitnessDataBaseParser.DataValueItem>> mapList, long startRecordTime) {
        LinkedList linkedList = new LinkedList();
        long j = 60;
        long j2 = (startRecordTime / j) * j;
        for (Map<Integer, FitnessDataBaseParser.DataValueItem> map : mapList) {
            ParsedDailyRecord parsedDailyRecord = new ParsedDailyRecord(j2);
            for (FitnessDataBaseParser.FourDimenType fourDimenType : this.fourDimenTypeArray) {
                setDailyRecordData(version, map.get(Integer.valueOf(fourDimenType.getHigh())), parsedDailyRecord);
                if (fourDimenType.getMiddle() != null) {
                    setDailyRecordData(version, map.get(fourDimenType.getMiddle()), parsedDailyRecord);
                }
                if (fourDimenType.getLow() != null) {
                    setDailyRecordData(version, map.get(fourDimenType.getLow()), parsedDailyRecord);
                }
            }
            linkedList.add(parsedDailyRecord);
            j2 += j;
        }
        return linkedList;
    }

    private final void setDailyRecordData(int version, FitnessDataBaseParser.DataValueItem valueItem, ParsedDailyRecord dailyRecord) {
        if (valueItem == null || !valueItem.getValid()) {
            return;
        }
        int iIntValue = valueItem.getValue().intValue();
        switch (valueItem.getType()) {
            case 1:
                dailyRecord.setAbnormalHr(Boolean.valueOf(iIntValue > 0));
                break;
            case 2:
                dailyRecord.setSteps(Integer.valueOf(iIntValue));
                break;
            case 3:
                dailyRecord.setActivityType(Integer.valueOf(iIntValue));
                break;
            case 4:
                dailyRecord.setCalories(Integer.valueOf(iIntValue));
                break;
            case 5:
                if (version >= 3) {
                    dailyRecord.setActivityHILevel(Integer.valueOf(iIntValue));
                }
                break;
            case 6:
                dailyRecord.setSportType(Integer.valueOf(iIntValue));
                break;
            case 7:
                dailyRecord.setDistance(Integer.valueOf(iIntValue));
                break;
            case 8:
                dailyRecord.setHr(Integer.valueOf(iIntValue));
                break;
            case 9:
                dailyRecord.setEnergy(Integer.valueOf(iIntValue));
                break;
            case 11:
                dailyRecord.setTotalCal(Integer.valueOf(iIntValue));
                break;
            case 12:
                dailyRecord.setEnergyState(Integer.valueOf(iIntValue));
                break;
            case 13:
                dailyRecord.setEnergyStateValue(Integer.valueOf(((iIntValue & 128) <= 0 ? -1 : 1) * (iIntValue & 127)));
                break;
            case 14:
                dailyRecord.setSpo2(Integer.valueOf(iIntValue));
                break;
            case 15:
                dailyRecord.setStress(Integer.valueOf(iIntValue));
                break;
            case 16:
                dailyRecord.setHrPreAbnormal(Integer.valueOf(iIntValue));
                break;
            case 17:
                dailyRecord.setLightValue(Integer.valueOf(iIntValue));
                break;
            case 18:
                dailyRecord.setBodyMomentum(Integer.valueOf(iIntValue));
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
            String str = this.TAG;
            ParserPreference parserPreference = ParserPreference.INSTANCE;
            FitnessLogUtils.i(str, "parse daily record by native , isUseNative:" + parserPreference.getIS_USE_NATIVE_PARSER());
            if (parserPreference.getIS_USE_NATIVE_PARSER()) {
                return nativeParseDailyRecord(binaryData);
            }
        } else {
            try {
                FitnessLogUtils.i(this.TAG, "parse daily record by schema");
                SchemaDailyParser schemaDailyParser = SchemaDailyParser.INSTANCE;
                String schema2 = parserWayControl.getSchema(binaryData);
                Intrinsics.checkNotNull(schema2);
                return schemaDailyParser.parser(binaryData, schema2);
            } catch (Exception e) {
                String str2 = this.TAG;
                ParserPreference parserPreference2 = ParserPreference.INSTANCE;
                FitnessLogUtils.i(str2, "isUseNative:" + parserPreference2.getIS_USE_NATIVE_PARSER() + " , parse daily record by schema error , e:" + e + " , trace:" + Log.getStackTraceString(e) + " ");
                if (parserPreference2.getIS_USE_NATIVE_PARSER()) {
                    return nativeParseDailyRecord(binaryData);
                }
            }
        }
        return null;
    }
}
