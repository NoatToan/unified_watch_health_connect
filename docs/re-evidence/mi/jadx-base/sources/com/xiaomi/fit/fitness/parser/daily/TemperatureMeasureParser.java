package com.xiaomi.fit.fitness.parser.daily;

import com.xiaomi.fit.data.common.data.mi.FitnessDataId;
import com.xiaomi.fit.data.common.log.FitnessLogUtils;
import com.xiaomi.fit.fitness.parser.base.FitnessDataBaseParser;
import com.xiaomi.fit.fitness.parser.base.OneDimenDataParser;
import com.xiaomi.fit.fitness.parser.data.FitnessBinaryData;
import com.xiaomi.fit.fitness.parser.data.FitnessParseResult;
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
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u0007\n\u0000\n\u0002\u0010$\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001:\u0001\u001aB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\f\u001a\u00020\rH\u0016J(\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\u0018\u0010\u0011\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00140\u00120\u000fH\u0002J=\u0010\u0015\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00140\u00120\u000f2\u0006\u0010\f\u001a\u00020\r2\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\u0017\u001a\u00020\u0018H\u0002¢\u0006\u0002\u0010\u0019R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082D¢\u0006\u0002\n\u0000R\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\t¨\u0006\u001b"}, d2 = {"Lcom/xiaomi/fit/fitness/parser/daily/TemperatureMeasureParser;", "Lcom/xiaomi/fit/fitness/parser/base/FitnessDataBaseParser;", "<init>", "()V", "TAG", "", "recordDataTypeArray", "", "Lcom/xiaomi/fit/fitness/parser/base/FitnessDataBaseParser$OneDimenDataType;", "[Lcom/xiaomi/fit/fitness/parser/base/FitnessDataBaseParser$OneDimenDataType;", "parse", "Lcom/xiaomi/fit/fitness/parser/data/FitnessParseResult;", "binaryData", "Lcom/xiaomi/fit/fitness/parser/data/FitnessBinaryData;", "processRecordData", "", "", "recordList", "", "", "Lcom/xiaomi/fit/fitness/parser/base/FitnessDataBaseParser$DataValueItem;", "parseRecordData", "recordDataTypes", "byteBuffer", "Ljava/nio/ByteBuffer;", "(Lcom/xiaomi/fit/fitness/parser/data/FitnessBinaryData;[Lcom/xiaomi/fit/fitness/parser/base/FitnessDataBaseParser$OneDimenDataType;Ljava/nio/ByteBuffer;)Ljava/util/List;", "DataType", "fitness-parser_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class TemperatureMeasureParser extends FitnessDataBaseParser {

    @NotNull
    private final String TAG = "TemperatureMeasureParser";

    @NotNull
    private final FitnessDataBaseParser.OneDimenDataType[] recordDataTypeArray = {new FitnessDataBaseParser.OneDimenDataType(0, 4, 1, false, null, false, null, 120, null)};

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/xiaomi/fit/fitness/parser/daily/TemperatureMeasureParser$DataType;", "", "<init>", "()V", "srcData", "", "fitness-parser_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class DataType {

        @NotNull
        public static final DataType INSTANCE = new DataType();
        public static final int srcData = 0;

        private DataType() {
        }
    }

    private final List<Map<Integer, FitnessDataBaseParser.DataValueItem>> parseRecordData(FitnessBinaryData binaryData, FitnessDataBaseParser.OneDimenDataType[] recordDataTypes, ByteBuffer byteBuffer) {
        HashMap map = new HashMap();
        for (FitnessDataBaseParser.OneDimenDataType oneDimenDataType : recordDataTypes) {
            map.put(Integer.valueOf(oneDimenDataType.getType()), Boolean.TRUE);
        }
        return OneDimenDataParser.INSTANCE.parseLoopRecord(recordDataTypes, binaryData.getDataId(), map, byteBuffer);
    }

    private final List<Float> processRecordData(List<? extends Map<Integer, FitnessDataBaseParser.DataValueItem>> recordList) {
        LinkedList linkedList = new LinkedList();
        for (Map<Integer, FitnessDataBaseParser.DataValueItem> map : recordList) {
            for (FitnessDataBaseParser.OneDimenDataType oneDimenDataType : this.recordDataTypeArray) {
                FitnessDataBaseParser.DataValueItem dataValueItem = map.get(Integer.valueOf(oneDimenDataType.getType()));
                if (dataValueItem == null) {
                    FitnessLogUtils.w(this.TAG, "processRecordData: null value(" + oneDimenDataType.getType() + ")");
                } else if (oneDimenDataType.getType() == 0) {
                    linkedList.add(Float.valueOf(dataValueItem.getValue().floatValue()));
                }
            }
        }
        return linkedList;
    }

    @Override // com.xiaomi.fit.fitness.parser.base.FitnessDataBaseParser
    @Nullable
    public FitnessParseResult parse(@NotNull FitnessBinaryData binaryData) {
        Intrinsics.checkNotNullParameter(binaryData, "binaryData");
        ByteBuffer byteBufferOrder = ByteBuffer.wrap(binaryData.getBodyData()).order(ByteOrder.LITTLE_ENDIAN);
        FitnessDataId dataId = binaryData.getDataId();
        FitnessLogUtils.i(this.TAG, "TemperatureMeasureResult(" + dataId + ")(" + byteBufferOrder + ")");
        FitnessParseResult.Builder builder = new FitnessParseResult.Builder();
        byte[] bArrArray = byteBufferOrder.array();
        Intrinsics.checkNotNullExpressionValue(bArrArray, "array(...)");
        return builder.temperatureResult(bArrArray).build();
    }
}
