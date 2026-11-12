package com.xiaomi.fit.fitness.parser.sport.record;

import android.util.Log;
import com.xiaomi.fit.data.common.data.mi.FitnessDataId;
import com.xiaomi.fit.data.common.data.sport.RecoverRateData;
import com.xiaomi.fit.data.common.log.FitnessLogUtils;
import com.xiaomi.fit.fitness.parser.base.FitnessDataBaseParser;
import com.xiaomi.fit.fitness.parser.base.OneDimenDataParser;
import com.xiaomi.fit.fitness.parser.data.FitnessBinaryData;
import com.xiaomi.fit.fitness.parser.data.FitnessParseResult;
import com.xiaomi.fit.fitness.parser.schema.ParserWayControl;
import com.xiaomi.fit.fitness.parser.schema.daily.SchemaRecoverRateParser;
import com.xiaomi.fit.fitness.parser.utils.FitnessParserUtils;
import com.xiaomi.fit.fitness.parser.utils.ParserPreference;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
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
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\b\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0017B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\f\u001a\u00020\rH\u0016J\u0010\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0002J>\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u00102\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00140\u00132\u0018\u0010\u0015\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00160\u00130\u0010H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082D¢\u0006\u0002\n\u0000R\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\t¨\u0006\u0018"}, d2 = {"Lcom/xiaomi/fit/fitness/parser/sport/record/RecoverRateRecordParser;", "Lcom/xiaomi/fit/fitness/parser/base/FitnessDataBaseParser;", "<init>", "()V", "TAG", "", "dataTypeArray", "", "Lcom/xiaomi/fit/fitness/parser/base/FitnessDataBaseParser$OneDimenDataType;", "[Lcom/xiaomi/fit/fitness/parser/base/FitnessDataBaseParser$OneDimenDataType;", "parse", "Lcom/xiaomi/fit/fitness/parser/data/FitnessParseResult;", "binaryData", "Lcom/xiaomi/fit/fitness/parser/data/FitnessBinaryData;", "nativeParseRecoverRate", "processRecordList", "", "", "dataValid", "", "", "recordValueList", "Lcom/xiaomi/fit/fitness/parser/base/FitnessDataBaseParser$DataValueItem;", "DataType", "fitness-parser_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class RecoverRateRecordParser extends FitnessDataBaseParser {

    @NotNull
    private final String TAG = "SportRecoverRateParser";

    @NotNull
    private final FitnessDataBaseParser.OneDimenDataType[] dataTypeArray = {new FitnessDataBaseParser.OneDimenDataType(0, 1, 1, false, null, false, null, 120, null)};

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/xiaomi/fit/fitness/parser/sport/record/RecoverRateRecordParser$DataType;", "", "<init>", "()V", "rate", "", "fitness-parser_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class DataType {

        @NotNull
        public static final DataType INSTANCE = new DataType();
        public static final int rate = 0;

        private DataType() {
        }
    }

    private final FitnessParseResult nativeParseRecoverRate(FitnessBinaryData binaryData) {
        FitnessLogUtils.i(this.TAG, "nativeParse recover rate");
        FitnessDataId dataId = binaryData.getDataId();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put(0, Boolean.TRUE);
        ByteBuffer byteBufferOrder = ByteBuffer.wrap(binaryData.getBodyData()).order(ByteOrder.LITTLE_ENDIAN);
        FitnessParserUtils fitnessParserUtils = FitnessParserUtils.INSTANCE;
        Intrinsics.checkNotNull(byteBufferOrder);
        long intFor4Bytes$default = FitnessParserUtils.getIntFor4Bytes$default(fitnessParserUtils, byteBufferOrder, false, 2, null);
        int intFor1Byte$default = FitnessParserUtils.getIntFor1Byte$default(fitnessParserUtils, byteBufferOrder, false, 2, null);
        float intFor1Byte$default2 = FitnessParserUtils.getIntFor1Byte$default(fitnessParserUtils, byteBufferOrder, false, 2, null) / 10.0f;
        long intFor2Bytes$default = FitnessParserUtils.getIntFor2Bytes$default(fitnessParserUtils, byteBufferOrder, false, 2, null);
        RecoverRateData recoverRateData = new RecoverRateData(intFor4Bytes$default, intFor1Byte$default, intFor1Byte$default2);
        List<Integer> listProcessRecordList = processRecordList(linkedHashMap, OneDimenDataParser.INSTANCE.parseLoopRecord(this.dataTypeArray, dataId, linkedHashMap, byteBufferOrder, intFor2Bytes$default));
        FitnessLogUtils.i(this.TAG, "rateCount (" + intFor2Bytes$default + ") record size = " + (listProcessRecordList != null ? Integer.valueOf(listProcessRecordList.size()) : null));
        recoverRateData.setRecoverRateList(listProcessRecordList);
        List<Integer> list = listProcessRecordList;
        if (list != null && !list.isEmpty()) {
            recoverRateData.setStartRate(listProcessRecordList.get(0));
            recoverRateData.setEndRate(listProcessRecordList.get(listProcessRecordList.size() - 1));
        }
        return new FitnessParseResult.Builder().recoverRateRecord(recoverRateData).build();
    }

    private final List<Integer> processRecordList(Map<Integer, Boolean> dataValid, List<? extends Map<Integer, FitnessDataBaseParser.DataValueItem>> recordValueList) {
        Number value;
        Boolean bool = dataValid.get(0);
        Intrinsics.checkNotNull(bool);
        if (!bool.booleanValue()) {
            FitnessLogUtils.w(this.TAG, "timeValid = false");
            return null;
        }
        LinkedList linkedList = new LinkedList();
        Iterator<? extends Map<Integer, FitnessDataBaseParser.DataValueItem>> it = recordValueList.iterator();
        while (it.hasNext()) {
            FitnessDataBaseParser.DataValueItem dataValueItem = it.next().get(0);
            linkedList.add(Integer.valueOf((dataValueItem == null || (value = dataValueItem.getValue()) == null) ? 0 : value.intValue()));
        }
        return linkedList;
    }

    @Override // com.xiaomi.fit.fitness.parser.base.FitnessDataBaseParser
    @Nullable
    public FitnessParseResult parse(@NotNull FitnessBinaryData binaryData) {
        Intrinsics.checkNotNullParameter(binaryData, "binaryData");
        if (binaryData.getDataValid() == null) {
            FitnessLogUtils.w(this.TAG, "not support data valid (" + binaryData.getDataId() + ")");
            return null;
        }
        ParserWayControl parserWayControl = ParserWayControl.INSTANCE;
        String schema = parserWayControl.getSchema(binaryData);
        if (schema == null || !(!StringsKt__StringsKt.isBlank(schema))) {
            FitnessLogUtils.i(this.TAG, "parse recover rate by native");
            if (ParserPreference.INSTANCE.getIS_USE_NATIVE_PARSER()) {
                return nativeParseRecoverRate(binaryData);
            }
        } else {
            try {
                FitnessLogUtils.i(this.TAG, "parse recover rate by schema");
                SchemaRecoverRateParser schemaRecoverRateParser = SchemaRecoverRateParser.INSTANCE;
                String schema2 = parserWayControl.getSchema(binaryData);
                Intrinsics.checkNotNull(schema2);
                return schemaRecoverRateParser.parser(binaryData, schema2);
            } catch (Exception e) {
                FitnessLogUtils.i(this.TAG, "parse recover rate by schema error , e:" + e + " ,trace:" + Log.getStackTraceString(e));
                if (ParserPreference.INSTANCE.getIS_USE_NATIVE_PARSER()) {
                    return nativeParseRecoverRate(binaryData);
                }
            }
        }
        return null;
    }
}
