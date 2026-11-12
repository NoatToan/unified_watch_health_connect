package com.xiaomi.fit.fitness.parser.daily;

import android.util.Log;
import com.xiaomi.fit.data.common.log.FitnessLogUtils;
import com.xiaomi.fit.fitness.parser.base.FitnessDataBaseParser;
import com.xiaomi.fit.fitness.parser.base.OneDimenDataParser;
import com.xiaomi.fit.fitness.parser.data.FitnessBinaryData;
import com.xiaomi.fit.fitness.parser.data.FitnessParseResult;
import com.xiaomi.fit.fitness.parser.data.WeightRecord;
import com.xiaomi.fit.fitness.parser.schema.ParserWayControl;
import com.xiaomi.fit.fitness.parser.schema.daily.SchemaDailyParser;
import com.xiaomi.fit.fitness.parser.utils.ParserPreference;
import com.xiaomi.fit.fitness.persist.db.internal.WeightRecordDaoKt;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0019B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\f\u001a\u00020\rH\u0016J\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\f\u001a\u00020\rH\u0002J\u0016\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\u0006\u0010\u0012\u001a\u00020\u0013H\u0002J\u0018\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0011H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082D¢\u0006\u0002\n\u0000R\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\t¨\u0006\u001a"}, d2 = {"Lcom/xiaomi/fit/fitness/parser/daily/WeightRecordParser;", "Lcom/xiaomi/fit/fitness/parser/base/FitnessDataBaseParser;", "<init>", "()V", "TAG", "", "recordDataTypeArray", "", "Lcom/xiaomi/fit/fitness/parser/base/FitnessDataBaseParser$OneDimenDataType;", "[Lcom/xiaomi/fit/fitness/parser/base/FitnessDataBaseParser$OneDimenDataType;", "parse", "Lcom/xiaomi/fit/fitness/parser/data/FitnessParseResult;", "binaryData", "Lcom/xiaomi/fit/fitness/parser/data/FitnessBinaryData;", "nativeParseWeight", "processWeightRecordDetail", "", "Lcom/xiaomi/fit/fitness/parser/data/WeightRecord;", "recordData", "Lcom/xiaomi/fit/fitness/parser/base/FitnessDataBaseParser$RecordDataValue;", "setWeightRecordItem", "", "valueItem", "Lcom/xiaomi/fit/fitness/parser/base/FitnessDataBaseParser$DataValueItem;", "record", "DataType", "fitness-parser_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nWeightRecordParser.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WeightRecordParser.kt\ncom/xiaomi/fit/fitness/parser/daily/WeightRecordParser\n+ 2 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n*L\n1#1,131:1\n216#2,2:132\n*S KotlinDebug\n*F\n+ 1 WeightRecordParser.kt\ncom/xiaomi/fit/fitness/parser/daily/WeightRecordParser\n*L\n100#1:132,2\n*E\n"})
public final class WeightRecordParser extends FitnessDataBaseParser {

    @NotNull
    private final String TAG = "WeightRecordParser";

    @NotNull
    private final FitnessDataBaseParser.OneDimenDataType[] recordDataTypeArray = {new FitnessDataBaseParser.OneDimenDataType(0, 4, 1, false, null, false, null, 120, null), new FitnessDataBaseParser.OneDimenDataType(1, 2, 1, false, null, false, null, 120, null), new FitnessDataBaseParser.OneDimenDataType(2, 2, 1, false, null, false, null, 120, null), new FitnessDataBaseParser.OneDimenDataType(3, 2, 1, false, null, false, null, 120, null), new FitnessDataBaseParser.OneDimenDataType(4, 2, 1, false, null, false, null, 120, null), new FitnessDataBaseParser.OneDimenDataType(5, 2, 1, false, null, false, null, 120, null), new FitnessDataBaseParser.OneDimenDataType(6, 2, 1, false, null, false, null, 120, null), new FitnessDataBaseParser.OneDimenDataType(8, 2, 1, false, null, false, null, 120, null), new FitnessDataBaseParser.OneDimenDataType(9, 2, 1, false, null, false, null, 120, null), new FitnessDataBaseParser.OneDimenDataType(10, 2, 1, false, null, false, null, 120, null), new FitnessDataBaseParser.OneDimenDataType(11, 2, 1, false, null, false, null, 120, null), new FitnessDataBaseParser.OneDimenDataType(12, 2, 1, false, null, false, null, 120, null)};

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\f\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lcom/xiaomi/fit/fitness/parser/daily/WeightRecordParser$DataType;", "", "<init>", "()V", "time", "", "weight", "bmi", "bodyMoistureRate", "boneSaltRate", WeightRecordDaoKt.COL_PROTEIN_RATE, WeightRecordDaoKt.COL_BODY_FAT_RATE, "bodyFatMass", WeightRecordDaoKt.COL_MUSCLE_RATE, WeightRecordDaoKt.COL_BONE_MASS, "proteinMass", WeightRecordDaoKt.COL_BASAL_METABOLISM, "fitness-parser_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class DataType {

        @NotNull
        public static final DataType INSTANCE = new DataType();
        public static final int basalMetabolism = 12;
        public static final int bmi = 2;
        public static final int bodyFatMass = 8;
        public static final int bodyFatRate = 6;
        public static final int bodyMoistureRate = 3;
        public static final int boneMass = 10;
        public static final int boneSaltRate = 4;
        public static final int muscleMass = 9;
        public static final int proteinMass = 11;
        public static final int proteinRate = 5;
        public static final int time = 0;
        public static final int weight = 1;

        private DataType() {
        }
    }

    private final FitnessParseResult nativeParseWeight(FitnessBinaryData binaryData) {
        List<Map<Integer, FitnessDataBaseParser.DataValueItem>> recordList;
        FitnessLogUtils.i(this.TAG, "nativeParse weight");
        FitnessDataBaseParser.RecordDataValue recordData = OneDimenDataParser.INSTANCE.parseRecordData(this.recordDataTypeArray, binaryData);
        if (recordData == null || (recordList = recordData.getRecordList()) == null || recordList.isEmpty()) {
            FitnessLogUtils.w(this.TAG, "parse failed (" + binaryData + ".dataId)");
            return null;
        }
        List<WeightRecord> listProcessWeightRecordDetail = processWeightRecordDetail(recordData);
        FitnessLogUtils.i(this.TAG, "weight list size = " + listProcessWeightRecordDetail.size());
        return new FitnessParseResult.Builder().weightRecordList(listProcessWeightRecordDetail).build();
    }

    private final List<WeightRecord> processWeightRecordDetail(FitnessDataBaseParser.RecordDataValue recordData) {
        ArrayList arrayList = new ArrayList();
        for (Map<Integer, FitnessDataBaseParser.DataValueItem> map : recordData.getRecordList()) {
            WeightRecord weightRecord = new WeightRecord();
            Iterator<Map.Entry<Integer, FitnessDataBaseParser.DataValueItem>> it = map.entrySet().iterator();
            while (it.hasNext()) {
                setWeightRecordItem(it.next().getValue(), weightRecord);
            }
            arrayList.add(weightRecord);
        }
        return arrayList;
    }

    private final void setWeightRecordItem(FitnessDataBaseParser.DataValueItem valueItem, WeightRecord record) {
        if (valueItem.getValid()) {
            switch (valueItem.getType()) {
                case 0:
                    record.setTime(valueItem.getValue().longValue());
                    break;
                case 1:
                    record.setWeight(valueItem.getValue().intValue() / 10.0f);
                    break;
                case 2:
                    record.setBmi(Float.valueOf(valueItem.getValue().intValue() / 10.0f));
                    break;
                case 3:
                    record.setMoistureRate(Float.valueOf(valueItem.getValue().intValue() / 10.0f));
                    break;
                case 4:
                    record.setBoneSaltRate(Float.valueOf(valueItem.getValue().intValue() / 10.0f));
                    break;
                case 5:
                    record.setProteinRate(Float.valueOf(valueItem.getValue().intValue() / 10.0f));
                    break;
                case 6:
                    record.setBodyFatRate(Float.valueOf(valueItem.getValue().intValue() / 10.0f));
                    break;
                case 7:
                default:
                    FitnessLogUtils.w(this.TAG, "no support type = " + valueItem.getType());
                    break;
                case 8:
                    record.setFatMass(Float.valueOf(valueItem.getValue().intValue() / 10.0f));
                    break;
                case 9:
                    record.setMuscleMass(Float.valueOf(valueItem.getValue().intValue() / 10.0f));
                    break;
                case 10:
                    record.setBoneMass(Float.valueOf(valueItem.getValue().intValue() / 10.0f));
                    break;
                case 11:
                    record.setProteinMass(Float.valueOf(valueItem.getValue().intValue() / 10.0f));
                    break;
                case 12:
                    record.setBasalMetabolism(Integer.valueOf(valueItem.getValue().intValue()));
                    break;
            }
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
            FitnessLogUtils.i(this.TAG, "parse weight by native");
            if (ParserPreference.INSTANCE.getIS_USE_NATIVE_PARSER()) {
                return nativeParseWeight(binaryData);
            }
        } else {
            try {
                FitnessLogUtils.i(this.TAG, "parse weight by schema");
                SchemaDailyParser schemaDailyParser = SchemaDailyParser.INSTANCE;
                String schema2 = parserWayControl.getSchema(binaryData);
                Intrinsics.checkNotNull(schema2);
                return schemaDailyParser.parser(binaryData, schema2);
            } catch (Exception e) {
                FitnessLogUtils.i(this.TAG, "parse weight by schema error , e:" + e + " ,trace:" + Log.getStackTraceString(e));
                if (ParserPreference.INSTANCE.getIS_USE_NATIVE_PARSER()) {
                    return nativeParseWeight(binaryData);
                }
            }
        }
        return null;
    }
}
