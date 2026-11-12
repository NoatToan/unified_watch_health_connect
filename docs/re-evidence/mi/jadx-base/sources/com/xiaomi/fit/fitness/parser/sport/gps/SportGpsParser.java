package com.xiaomi.fit.fitness.parser.sport.gps;

import android.util.Log;
import com.xiaomi.fit.data.common.data.mi.FitnessDataId;
import com.xiaomi.fit.data.common.log.FitnessLogUtils;
import com.xiaomi.fit.fitness.parser.base.FitnessDataBaseParser;
import com.xiaomi.fit.fitness.parser.base.OneDimenDataParser;
import com.xiaomi.fit.fitness.parser.data.FitnessBinaryData;
import com.xiaomi.fit.fitness.parser.data.FitnessParseResult;
import com.xiaomi.fit.fitness.parser.data.GpsRecord;
import com.xiaomi.fit.fitness.parser.schema.FitnessGpsKey;
import com.xiaomi.fit.fitness.parser.schema.ParserWayControl;
import com.xiaomi.fit.fitness.parser.schema.gps.OutdoorHasStepGpsParser;
import com.xiaomi.fit.fitness.parser.schema.gps.SchemaGpsParser;
import com.xiaomi.fit.fitness.parser.utils.FitnessParserUtils;
import com.xiaomi.fit.fitness.parser.utils.ParserPreference;
import com.xiaomi.fitness.common.extensions.ListExtKt;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\b\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001:\u0002$%B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\f\u001a\u00020\rH\u0016J\u0010\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\rH\u0002J\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\f\u001a\u00020\rH\u0002J\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u00122\u0006\u0010\f\u001a\u00020\rH\u0002J\u0012\u0010\u0013\u001a\u0004\u0018\u00010\u00122\u0006\u0010\f\u001a\u00020\rH\u0002J$\u0010\u0014\u001a\u0016\u0012\u0004\u0012\u00020\u0016\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00180\u0017\u0018\u00010\u00152\u0006\u0010\f\u001a\u00020\rH\u0002J\u0018\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u0016H\u0002J>\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u00172\u0012\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u001f0\u00152\u0018\u0010 \u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020!0\u00150\u0017H\u0002J\u001c\u0010\"\u001a\u00020\u00182\u0012\u0010#\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020!0\u0015H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082D¢\u0006\u0002\n\u0000R\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\t¨\u0006&"}, d2 = {"Lcom/xiaomi/fit/fitness/parser/sport/gps/SportGpsParser;", "Lcom/xiaomi/fit/fitness/parser/base/FitnessDataBaseParser;", "<init>", "()V", "TAG", "", "dataTypeArray", "", "Lcom/xiaomi/fit/fitness/parser/base/FitnessDataBaseParser$OneDimenDataType;", "[Lcom/xiaomi/fit/fitness/parser/base/FitnessDataBaseParser$OneDimenDataType;", "parse", "Lcom/xiaomi/fit/fitness/parser/data/FitnessParseResult;", "binaryData", "Lcom/xiaomi/fit/fitness/parser/data/FitnessBinaryData;", "getSchemaGpsParser", "Lcom/xiaomi/fit/fitness/parser/schema/gps/SchemaGpsParser;", "nativeParseGps", "parseGps", "Lcom/xiaomi/fit/fitness/parser/base/FitnessDataBaseParser$RecordDataValue;", "parseTgcGps", "parseTriItemsGps", "", "", "", "Lcom/xiaomi/fit/fitness/parser/data/GpsRecord;", "convertSubSportType", "dataId", "Lcom/xiaomi/fit/data/common/data/mi/FitnessDataId;", "subType", "processRecordList", "dataValid", "", "recordValueList", "Lcom/xiaomi/fit/fitness/parser/base/FitnessDataBaseParser$DataValueItem;", "processOneRecordData", "oneRecord", "GpsFeatureType", "DataType", "fitness-parser_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class SportGpsParser extends FitnessDataBaseParser {

    @NotNull
    private final String TAG = "SportGpsParser";

    @NotNull
    private final FitnessDataBaseParser.OneDimenDataType[] dataTypeArray = {new FitnessDataBaseParser.OneDimenDataType(0, 4, 1, false, null, false, null, 120, null), new FitnessDataBaseParser.OneDimenDataType(1, 4, 1, true, null, false, null, 112, null), new FitnessDataBaseParser.OneDimenDataType(2, 4, 1, true, null, false, null, 112, null), new FitnessDataBaseParser.OneDimenDataType(3, 4, 2, true, null, false, null, 112, null), new FitnessDataBaseParser.OneDimenDataType(4, 2, 2, false, null, false, null, 120, null), new FitnessDataBaseParser.OneDimenDataType(5, 0, 2, false, null, false, null, 120, null), new FitnessDataBaseParser.OneDimenDataType(6, 4, 3, true, null, false, null, 112, null), new FitnessDataBaseParser.OneDimenDataType(7, 4, 3, true, null, false, null, 112, null)};

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\b\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/xiaomi/fit/fitness/parser/sport/gps/SportGpsParser$DataType;", "", "<init>", "()V", "time", "", "longitude", "latitude", "accuracy", "speed", FitnessGpsKey.gpsSource, "altitude", FitnessGpsKey.hdop, "fitness-parser_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class DataType {

        @NotNull
        public static final DataType INSTANCE = new DataType();
        public static final int accuracy = 3;
        public static final int altitude = 6;
        public static final int gpsSource = 5;
        public static final int hdop = 7;
        public static final int latitude = 2;
        public static final int longitude = 1;
        public static final int speed = 4;
        public static final int time = 0;

        private DataType() {
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/xiaomi/fit/fitness/parser/sport/gps/SportGpsParser$GpsFeatureType;", "", "<init>", "()V", "TGC", "", "fitness-parser_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class GpsFeatureType {

        @NotNull
        public static final GpsFeatureType INSTANCE = new GpsFeatureType();
        public static final int TGC = 1;

        private GpsFeatureType() {
        }
    }

    private final int convertSubSportType(FitnessDataId dataId, int subType) {
        if (dataId.getSportType() != 17) {
            return subType;
        }
        if (subType == 0) {
            return 10;
        }
        if (subType != 1) {
            return subType != 2 ? 0 : 1;
        }
        return 6;
    }

    private final SchemaGpsParser getSchemaGpsParser(FitnessBinaryData binaryData) {
        int sportType = binaryData.getDataId().getSportType();
        if ((sportType == 22 || sportType == 23) && binaryData.getDataId().getVersion() >= 4) {
            return new OutdoorHasStepGpsParser();
        }
        return new SchemaGpsParser();
    }

    private final FitnessParseResult nativeParseGps(FitnessBinaryData binaryData) {
        Map<Integer, List<GpsRecord>> triItemsGps;
        FitnessParseResult.Builder builder = new FitnessParseResult.Builder();
        int sportType = binaryData.getDataId().getSportType();
        if (sportType == 17 || sportType == 21) {
            triItemsGps = parseTriItemsGps(binaryData);
        } else {
            FitnessDataBaseParser.RecordDataValue gps = parseGps(binaryData);
            int sportType2 = binaryData.getDataId().getSportType();
            if (gps != null) {
                List<GpsRecord> listProcessRecordList = processRecordList(gps.getDataValid(), gps.getRecordList());
                List<GpsRecord> list = listProcessRecordList;
                if (list == null || list.isEmpty()) {
                    FitnessLogUtils.w(this.TAG, "parseGps: no gps record");
                    triItemsGps = null;
                } else {
                    if (gps.getTgcData() != null) {
                        byte[] tgcData = gps.getTgcData();
                        Intrinsics.checkNotNull(tgcData);
                        builder.gpsTgcData(tgcData);
                    }
                    triItemsGps = Collections.singletonMap(Integer.valueOf(sportType2), listProcessRecordList);
                }
            } else {
                triItemsGps = null;
            }
        }
        if (triItemsGps == null) {
            return null;
        }
        builder.gpsRecord(triItemsGps);
        return builder.build();
    }

    private final FitnessDataBaseParser.RecordDataValue parseGps(FitnessBinaryData binaryData) {
        FitnessDataBaseParser.RecordDataValue tgcGps = binaryData.getDataId().getVersion() >= 4 ? parseTgcGps(binaryData) : OneDimenDataParser.INSTANCE.parseRecordData(this.dataTypeArray, binaryData);
        if (tgcGps != null) {
            return tgcGps;
        }
        FitnessLogUtils.w(this.TAG, "parseGps failed");
        return null;
    }

    private final FitnessDataBaseParser.RecordDataValue parseTgcGps(FitnessBinaryData binaryData) {
        byte[] dataValid = binaryData.getDataValid();
        if (dataValid == null) {
            FitnessLogUtils.w(this.TAG, "not support data valid (" + binaryData.getDataId() + ")");
            return null;
        }
        FitnessDataId dataId = binaryData.getDataId();
        OneDimenDataParser oneDimenDataParser = OneDimenDataParser.INSTANCE;
        Map<Integer, Boolean> dataValid2 = oneDimenDataParser.parseDataValid(this.dataTypeArray, dataId, dataValid);
        ByteBuffer byteBufferOrder = ByteBuffer.wrap(binaryData.getBodyData()).order(ByteOrder.LITTLE_ENDIAN);
        FitnessParserUtils fitnessParserUtils = FitnessParserUtils.INSTANCE;
        Intrinsics.checkNotNull(byteBufferOrder);
        FitnessDataBaseParser.RecordDataValue recordDataValue = new FitnessDataBaseParser.RecordDataValue(dataValid2, oneDimenDataParser.parseLoopRecord(this.dataTypeArray, dataId, dataValid2, byteBufferOrder, FitnessParserUtils.getIntFor4Bytes$default(fitnessParserUtils, byteBufferOrder, false, 2, null)));
        recordDataValue.setGpsFeatureType(Integer.valueOf(FitnessParserUtils.getIntFor1Byte$default(fitnessParserUtils, byteBufferOrder, false, 2, null)));
        long intFor4Bytes$default = FitnessParserUtils.getIntFor4Bytes$default(fitnessParserUtils, byteBufferOrder, false, 2, null);
        FitnessLogUtils.i(this.TAG, "parseTgcGps gpsFeatureType (" + recordDataValue.getGpsFeatureType() + ") Data size " + intFor4Bytes$default);
        Integer gpsFeatureType = recordDataValue.getGpsFeatureType();
        if (gpsFeatureType != null && gpsFeatureType.intValue() == 1) {
            byte[] bArr = new byte[(int) intFor4Bytes$default];
            byteBufferOrder.get(bArr);
            recordDataValue.setTgcData(bArr);
        }
        return recordDataValue;
    }

    private final Map<Integer, List<GpsRecord>> parseTriItemsGps(FitnessBinaryData binaryData) {
        byte[] dataValid = binaryData.getDataValid();
        if (dataValid == null) {
            FitnessLogUtils.w(this.TAG, "not support data valid (" + binaryData.getDataId() + ")");
            return null;
        }
        FitnessDataId dataId = binaryData.getDataId();
        Map<Integer, Boolean> dataValid2 = OneDimenDataParser.INSTANCE.parseDataValid(this.dataTypeArray, dataId, dataValid);
        ByteBuffer byteBufferOrder = ByteBuffer.wrap(binaryData.getBodyData()).order(ByteOrder.LITTLE_ENDIAN);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        while (byteBufferOrder.position() + 2 <= byteBufferOrder.capacity()) {
            FitnessParserUtils fitnessParserUtils = FitnessParserUtils.INSTANCE;
            Intrinsics.checkNotNull(byteBufferOrder);
            int iConvertSubSportType = convertSubSportType(dataId, FitnessParserUtils.getIntFor1Byte$default(fitnessParserUtils, byteBufferOrder, false, 2, null));
            List<GpsRecord> listProcessRecordList = processRecordList(dataValid2, OneDimenDataParser.INSTANCE.parseLoopRecord(this.dataTypeArray, dataId, dataValid2, byteBufferOrder, FitnessParserUtils.getIntFor4Bytes$default(fitnessParserUtils, byteBufferOrder, false, 2, null)));
            if (listProcessRecordList != null) {
                FitnessLogUtils.i(this.TAG, "sub sport(" + iConvertSubSportType + ") record size = " + listProcessRecordList.size());
                List list = (List) linkedHashMap.get(Integer.valueOf(iConvertSubSportType));
                if (list == null) {
                    linkedHashMap.put(Integer.valueOf(iConvertSubSportType), listProcessRecordList);
                } else {
                    ListExtKt.addAll(list, listProcessRecordList);
                }
            }
        }
        return linkedHashMap;
    }

    private final GpsRecord processOneRecordData(Map<Integer, FitnessDataBaseParser.DataValueItem> oneRecord) {
        Number value;
        Number value2;
        Number value3;
        FitnessDataBaseParser.DataValueItem dataValueItem = oneRecord.get(0);
        Float fValueOf = null;
        Long lValueOf = (dataValueItem == null || (value3 = dataValueItem.getValue()) == null) ? null : Long.valueOf(value3.longValue());
        FitnessDataBaseParser.DataValueItem dataValueItem2 = oneRecord.get(2);
        Float fValueOf2 = (dataValueItem2 == null || (value2 = dataValueItem2.getValue()) == null) ? null : Float.valueOf(value2.floatValue());
        FitnessDataBaseParser.DataValueItem dataValueItem3 = oneRecord.get(1);
        if (dataValueItem3 != null && (value = dataValueItem3.getValue()) != null) {
            fValueOf = Float.valueOf(value.floatValue());
        }
        Intrinsics.checkNotNull(lValueOf);
        long jLongValue = lValueOf.longValue();
        Intrinsics.checkNotNull(fValueOf);
        float fFloatValue = fValueOf.floatValue();
        Intrinsics.checkNotNull(fValueOf2);
        GpsRecord gpsRecord = new GpsRecord(jLongValue, fFloatValue, fValueOf2.floatValue());
        FitnessDataBaseParser.DataValueItem dataValueItem4 = oneRecord.get(3);
        if (dataValueItem4 != null && dataValueItem4.getValid()) {
            gpsRecord.setAccuracy(Float.valueOf(dataValueItem4.getValue().floatValue()));
        }
        FitnessDataBaseParser.DataValueItem dataValueItem5 = oneRecord.get(4);
        if (dataValueItem5 != null && dataValueItem5.getValid()) {
            int iIntValue = dataValueItem5.getValue().intValue();
            float f = ((65520 & iIntValue) >> 4) / 10.0f;
            int i = iIntValue & 15;
            gpsRecord.setSpeed(Float.valueOf(f));
            FitnessDataBaseParser.DataValueItem dataValueItem6 = oneRecord.get(5);
            if (dataValueItem6 != null && dataValueItem6.getValid()) {
                gpsRecord.setGpsSource(Integer.valueOf(i));
            }
        }
        FitnessDataBaseParser.DataValueItem dataValueItem7 = oneRecord.get(6);
        if (dataValueItem7 != null && dataValueItem7.getValid()) {
            gpsRecord.setAltitude(Float.valueOf(dataValueItem7.getValue().floatValue()));
        }
        FitnessDataBaseParser.DataValueItem dataValueItem8 = oneRecord.get(7);
        if (dataValueItem8 != null && dataValueItem8.getValid()) {
            gpsRecord.setHdop(Float.valueOf(dataValueItem8.getValue().floatValue()));
        }
        return gpsRecord;
    }

    private final List<GpsRecord> processRecordList(Map<Integer, Boolean> dataValid, List<? extends Map<Integer, FitnessDataBaseParser.DataValueItem>> recordValueList) {
        Boolean bool = dataValid.get(0);
        Intrinsics.checkNotNull(bool);
        boolean zBooleanValue = bool.booleanValue();
        Boolean bool2 = dataValid.get(1);
        Intrinsics.checkNotNull(bool2);
        boolean zBooleanValue2 = bool2.booleanValue();
        Boolean bool3 = dataValid.get(2);
        Intrinsics.checkNotNull(bool3);
        boolean zBooleanValue3 = bool3.booleanValue();
        if (zBooleanValue && zBooleanValue2 && zBooleanValue3) {
            LinkedList linkedList = new LinkedList();
            Iterator<? extends Map<Integer, FitnessDataBaseParser.DataValueItem>> it = recordValueList.iterator();
            while (it.hasNext()) {
                linkedList.add(processOneRecordData(it.next()));
            }
            return linkedList;
        }
        FitnessLogUtils.w(this.TAG, "timeValid = " + zBooleanValue + ", latitudeValid = " + zBooleanValue3 + ", longitudeValid = " + zBooleanValue2);
        return null;
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
            FitnessLogUtils.i(str, "parse gps by native , isSwitch:" + parserPreference.getIS_USE_NATIVE_PARSER());
            if (parserPreference.getIS_USE_NATIVE_PARSER()) {
                return nativeParseGps(binaryData);
            }
        } else {
            try {
                FitnessLogUtils.i(this.TAG, "parse sport gps by schema");
                SchemaGpsParser schemaGpsParser = getSchemaGpsParser(binaryData);
                String schema2 = parserWayControl.getSchema(binaryData);
                Intrinsics.checkNotNull(schema2);
                return schemaGpsParser.parser(binaryData, schema2);
            } catch (Exception e) {
                FitnessLogUtils.i(this.TAG, "parse sport gps by schema error , e:" + e + " , trace:" + Log.getStackTraceString(e));
                if (ParserPreference.INSTANCE.getIS_USE_NATIVE_PARSER()) {
                    return nativeParseGps(binaryData);
                }
            }
        }
        return null;
    }
}
