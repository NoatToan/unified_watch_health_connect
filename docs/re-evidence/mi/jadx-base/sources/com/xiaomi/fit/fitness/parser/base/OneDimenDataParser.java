package com.xiaomi.fit.fitness.parser.base;

import com.miui.tsmclient.net.TSMAuthContants;
import com.xiaomi.fit.data.common.data.mi.FitnessDataId;
import com.xiaomi.fit.data.common.log.FitnessLogUtils;
import com.xiaomi.fit.fitness.parser.data.FitnessBinaryData;
import com.xiaomi.fit.fitness.parser.utils.FitnessParserUtils;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010%\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u0012\n\u0002\b\n\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J/\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u00072\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u0006\u0010\r\u001a\u00020\u000e¢\u0006\u0002\u0010\u000fJ#\u0010\u0010\u001a\u0004\u0018\u00010\u00112\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u0006\u0010\r\u001a\u00020\u000e¢\u0006\u0002\u0010\u0012JI\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u00072\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u0006\u0010\u0014\u001a\u00020\u00152\u0012\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00170\u00072\u0006\u0010\u0018\u001a\u00020\u0019¢\u0006\u0002\u0010\u001aJ,\u0010\u001b\u001a\u00020\u00172\u0006\u0010\u001c\u001a\u00020\f2\u0006\u0010\u0014\u001a\u00020\u00152\u0012\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u001eH\u0002JO\u0010\u001f\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u00070 2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u0006\u0010\u0014\u001a\u00020\u00152\u0012\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00170\u00072\u0006\u0010\u0018\u001a\u00020\u0019¢\u0006\u0002\u0010!JW\u0010\u001f\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u00070 2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u0006\u0010\u0014\u001a\u00020\u00152\u0012\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00170\u00072\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\"\u001a\u00020#¢\u0006\u0002\u0010$J5\u0010%\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00170\u00072\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010&\u001a\u00020'¢\u0006\u0002\u0010(J(\u0010)\u001a\u00020\t2\u0006\u0010*\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\f2\u0006\u0010+\u001a\u00020\u00172\b\b\u0002\u0010,\u001a\u00020\bJ%\u0010-\u001a\u00020\b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u0006\u0010.\u001a\u00020\bH\u0000¢\u0006\u0004\b/\u00100R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u00061"}, d2 = {"Lcom/xiaomi/fit/fitness/parser/base/OneDimenDataParser;", "", "<init>", "()V", "TAG", "", "parseReportData", "", "", "Lcom/xiaomi/fit/fitness/parser/base/FitnessDataBaseParser$DataValueItem;", "dataTypes", "", "Lcom/xiaomi/fit/fitness/parser/base/FitnessDataBaseParser$OneDimenDataType;", "binaryData", "Lcom/xiaomi/fit/fitness/parser/data/FitnessBinaryData;", "([Lcom/xiaomi/fit/fitness/parser/base/FitnessDataBaseParser$OneDimenDataType;Lcom/xiaomi/fit/fitness/parser/data/FitnessBinaryData;)Ljava/util/Map;", "parseRecordData", "Lcom/xiaomi/fit/fitness/parser/base/FitnessDataBaseParser$RecordDataValue;", "([Lcom/xiaomi/fit/fitness/parser/base/FitnessDataBaseParser$OneDimenDataType;Lcom/xiaomi/fit/fitness/parser/data/FitnessBinaryData;)Lcom/xiaomi/fit/fitness/parser/base/FitnessDataBaseParser$RecordDataValue;", "parseOneRecord", "dataId", "Lcom/xiaomi/fit/data/common/data/mi/FitnessDataId;", "validMap", "", "dataBuffer", "Ljava/nio/ByteBuffer;", "([Lcom/xiaomi/fit/fitness/parser/base/FitnessDataBaseParser$OneDimenDataType;Lcom/xiaomi/fit/data/common/data/mi/FitnessDataId;Ljava/util/Map;Ljava/nio/ByteBuffer;)Ljava/util/Map;", "isDataExist", "dataType", "resultValueMap", "", "parseLoopRecord", "", "([Lcom/xiaomi/fit/fitness/parser/base/FitnessDataBaseParser$OneDimenDataType;Lcom/xiaomi/fit/data/common/data/mi/FitnessDataId;Ljava/util/Map;Ljava/nio/ByteBuffer;)Ljava/util/List;", "recordCount", "", "([Lcom/xiaomi/fit/fitness/parser/base/FitnessDataBaseParser$OneDimenDataType;Lcom/xiaomi/fit/data/common/data/mi/FitnessDataId;Ljava/util/Map;Ljava/nio/ByteBuffer;J)Ljava/util/List;", "parseDataValid", "dataValid", "", "([Lcom/xiaomi/fit/fitness/parser/base/FitnessDataBaseParser$OneDimenDataType;Lcom/xiaomi/fit/data/common/data/mi/FitnessDataId;[B)Ljava/util/Map;", "parseDataValue", "buffer", TSMAuthContants.PARAM_VALID, "bytesCount", "getOneRecordLeastDataLen", "version", "getOneRecordLeastDataLen$fitness_parser_release", "([Lcom/xiaomi/fit/fitness/parser/base/FitnessDataBaseParser$OneDimenDataType;I)I", "fitness-parser_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nOneDimenDataParser.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OneDimenDataParser.kt\ncom/xiaomi/fit/fitness/parser/base/OneDimenDataParser\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,224:1\n1#2:225\n*E\n"})
public final class OneDimenDataParser {

    @NotNull
    public static final OneDimenDataParser INSTANCE = new OneDimenDataParser();

    @NotNull
    private static final String TAG = "OneDimenDataParser";

    private OneDimenDataParser() {
    }

    private final boolean isDataExist(FitnessDataBaseParser.OneDimenDataType dataType, FitnessDataId dataId, Map<Integer, FitnessDataBaseParser.DataValueItem> resultValueMap) {
        if (dataType.getSupportVersion() > dataId.getVersion()) {
            return false;
        }
        FitnessDataBaseParser.DependDataType dependData = dataType.getDependData();
        if (dependData == null) {
            return true;
        }
        FitnessDataBaseParser.DataValueItem dataValueItem = resultValueMap.get(Integer.valueOf(dependData.getType()));
        if (dataValueItem != null && dataValueItem.getValid()) {
            for (Integer num : dependData.getValues()) {
                if (dataValueItem.getValue().intValue() == num.intValue()) {
                    return true;
                }
            }
        }
        return false;
    }

    public static /* synthetic */ FitnessDataBaseParser.DataValueItem parseDataValue$default(OneDimenDataParser oneDimenDataParser, ByteBuffer byteBuffer, FitnessDataBaseParser.OneDimenDataType oneDimenDataType, boolean z, int i, int i2, Object obj) {
        if ((i2 & 8) != 0) {
            i = -1;
        }
        return oneDimenDataParser.parseDataValue(byteBuffer, oneDimenDataType, z, i);
    }

    public final int getOneRecordLeastDataLen$fitness_parser_release(@NotNull FitnessDataBaseParser.OneDimenDataType[] dataTypes, int version) {
        Intrinsics.checkNotNullParameter(dataTypes, "dataTypes");
        int byteCount = 0;
        for (FitnessDataBaseParser.OneDimenDataType oneDimenDataType : dataTypes) {
            if (oneDimenDataType.getType() >= 0 && oneDimenDataType.getSupportVersion() <= version && oneDimenDataType.getDependData() == null) {
                byteCount += oneDimenDataType.getByteCount();
            }
        }
        return byteCount;
    }

    @NotNull
    public final Map<Integer, Boolean> parseDataValid(@NotNull FitnessDataBaseParser.OneDimenDataType[] dataTypes, @NotNull FitnessDataId dataId, @NotNull byte[] dataValid) {
        boolean z;
        Intrinsics.checkNotNullParameter(dataTypes, "dataTypes");
        Intrinsics.checkNotNullParameter(dataId, "dataId");
        Intrinsics.checkNotNullParameter(dataValid, "dataValid");
        int length = dataValid.length;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        int i = 0;
        for (FitnessDataBaseParser.OneDimenDataType oneDimenDataType : dataTypes) {
            if (oneDimenDataType.getType() >= 0) {
                int i2 = i / 8;
                int i3 = i % 8;
                if (oneDimenDataType.getSupportVersion() > dataId.getVersion()) {
                    z = false;
                } else {
                    if (length <= i2) {
                        throw new IllegalArgumentException(("parseDataValid: validSize = " + length + ", quotient = " + i2).toString());
                    }
                    z = (dataValid[i2] & (1 << (7 - i3))) > 0;
                    i++;
                }
                linkedHashMap.put(Integer.valueOf(oneDimenDataType.getType()), Boolean.valueOf(z));
            }
        }
        return linkedHashMap;
    }

    @NotNull
    public final FitnessDataBaseParser.DataValueItem parseDataValue(@NotNull ByteBuffer buffer, @NotNull FitnessDataBaseParser.OneDimenDataType dataType, boolean valid, int bytesCount) {
        Intrinsics.checkNotNullParameter(buffer, "buffer");
        Intrinsics.checkNotNullParameter(dataType, "dataType");
        Number numberValueOf = 0;
        if (bytesCount >= 0) {
            return new FitnessDataBaseParser.DataValueItem(dataType.getType(), valid, Integer.valueOf(bytesCount), dataType.isFloat(), FitnessParserUtils.INSTANCE.getBytes(buffer, dataType.getByteCount() * bytesCount));
        }
        int byteCount = dataType.getByteCount();
        byte[] bytes = null;
        if (byteCount != 0) {
            if (byteCount == 1) {
                numberValueOf = Integer.valueOf(FitnessParserUtils.INSTANCE.getIntFor1Byte(buffer, dataType.isUnsigned()));
            } else if (byteCount == 2) {
                numberValueOf = Integer.valueOf(FitnessParserUtils.INSTANCE.getIntFor2Bytes(buffer, dataType.isUnsigned()));
            } else if (byteCount == 4) {
                numberValueOf = dataType.isFloat() ? Float.valueOf(FitnessParserUtils.INSTANCE.getFloatFor4Bytes(buffer)) : Long.valueOf(FitnessParserUtils.INSTANCE.getIntFor4Bytes(buffer, dataType.isUnsigned()));
            } else if (byteCount != 8) {
                bytes = FitnessParserUtils.INSTANCE.getBytes(buffer, dataType.getByteCount());
            } else {
                numberValueOf = Long.valueOf(buffer.getLong());
            }
        }
        return new FitnessDataBaseParser.DataValueItem(dataType.getType(), valid, numberValueOf, dataType.isFloat(), bytes);
    }

    @NotNull
    public final List<Map<Integer, FitnessDataBaseParser.DataValueItem>> parseLoopRecord(@NotNull FitnessDataBaseParser.OneDimenDataType[] dataTypes, @NotNull FitnessDataId dataId, @NotNull Map<Integer, Boolean> validMap, @NotNull ByteBuffer dataBuffer) {
        Intrinsics.checkNotNullParameter(dataTypes, "dataTypes");
        Intrinsics.checkNotNullParameter(dataId, "dataId");
        Intrinsics.checkNotNullParameter(validMap, "validMap");
        Intrinsics.checkNotNullParameter(dataBuffer, "dataBuffer");
        return parseLoopRecord(dataTypes, dataId, validMap, dataBuffer, dataBuffer.capacity());
    }

    @NotNull
    public final Map<Integer, FitnessDataBaseParser.DataValueItem> parseOneRecord(@NotNull FitnessDataBaseParser.OneDimenDataType[] dataTypes, @NotNull FitnessDataId dataId, @NotNull Map<Integer, Boolean> validMap, @NotNull ByteBuffer dataBuffer) {
        FitnessDataBaseParser.DataValueItem dataValue$default;
        Number value;
        Intrinsics.checkNotNullParameter(dataTypes, "dataTypes");
        Intrinsics.checkNotNullParameter(dataId, "dataId");
        Intrinsics.checkNotNullParameter(validMap, "validMap");
        Intrinsics.checkNotNullParameter(dataBuffer, "dataBuffer");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (FitnessDataBaseParser.OneDimenDataType oneDimenDataType : dataTypes) {
            if (isDataExist(oneDimenDataType, dataId, linkedHashMap)) {
                if (dataBuffer.position() + oneDimenDataType.getByteCount() > dataBuffer.capacity()) {
                    FitnessLogUtils.w(TAG, "dataType(" + oneDimenDataType.getType() + ") no available bytes");
                    break;
                }
                Boolean bool = validMap.get(Integer.valueOf(oneDimenDataType.getType()));
                boolean zBooleanValue = bool != null ? bool.booleanValue() : true;
                if (oneDimenDataType.getCountsType() != null) {
                    FitnessDataBaseParser.DataValueItem dataValueItem = linkedHashMap.get(oneDimenDataType.getCountsType());
                    dataValue$default = parseDataValue(dataBuffer, oneDimenDataType, zBooleanValue, (dataValueItem == null || (value = dataValueItem.getValue()) == null) ? 0 : value.intValue());
                } else {
                    dataValue$default = parseDataValue$default(this, dataBuffer, oneDimenDataType, zBooleanValue, 0, 8, null);
                }
                linkedHashMap.put(Integer.valueOf(oneDimenDataType.getType()), dataValue$default);
            }
        }
        return linkedHashMap;
    }

    @Nullable
    public final FitnessDataBaseParser.RecordDataValue parseRecordData(@NotNull FitnessDataBaseParser.OneDimenDataType[] dataTypes, @NotNull FitnessBinaryData binaryData) {
        Intrinsics.checkNotNullParameter(dataTypes, "dataTypes");
        Intrinsics.checkNotNullParameter(binaryData, "binaryData");
        FitnessDataId dataId = binaryData.getDataId();
        byte[] dataValid = binaryData.getDataValid();
        if (dataValid != null) {
            ByteBuffer byteBufferOrder = ByteBuffer.wrap(binaryData.getBodyData()).order(ByteOrder.LITTLE_ENDIAN);
            Map<Integer, Boolean> dataValid2 = parseDataValid(dataTypes, dataId, dataValid);
            Intrinsics.checkNotNull(byteBufferOrder);
            return new FitnessDataBaseParser.RecordDataValue(dataValid2, parseLoopRecord(dataTypes, dataId, dataValid2, byteBufferOrder));
        }
        FitnessLogUtils.w(TAG, "not support data valid (" + dataId + ")");
        return null;
    }

    @Nullable
    public final Map<Integer, FitnessDataBaseParser.DataValueItem> parseReportData(@NotNull FitnessDataBaseParser.OneDimenDataType[] dataTypes, @NotNull FitnessBinaryData binaryData) {
        Intrinsics.checkNotNullParameter(dataTypes, "dataTypes");
        Intrinsics.checkNotNullParameter(binaryData, "binaryData");
        FitnessDataId dataId = binaryData.getDataId();
        byte[] dataValid = binaryData.getDataValid();
        if (dataValid != null) {
            ByteBuffer byteBufferOrder = ByteBuffer.wrap(binaryData.getBodyData()).order(ByteOrder.LITTLE_ENDIAN);
            Map<Integer, Boolean> dataValid2 = parseDataValid(dataTypes, dataId, dataValid);
            Intrinsics.checkNotNull(byteBufferOrder);
            return parseOneRecord(dataTypes, dataId, dataValid2, byteBufferOrder);
        }
        FitnessLogUtils.w(TAG, "not support data valid (" + dataId + ")");
        return null;
    }

    @NotNull
    public final List<Map<Integer, FitnessDataBaseParser.DataValueItem>> parseLoopRecord(@NotNull FitnessDataBaseParser.OneDimenDataType[] dataTypes, @NotNull FitnessDataId dataId, @NotNull Map<Integer, Boolean> validMap, @NotNull ByteBuffer dataBuffer, long recordCount) {
        Intrinsics.checkNotNullParameter(dataTypes, "dataTypes");
        Intrinsics.checkNotNullParameter(dataId, "dataId");
        Intrinsics.checkNotNullParameter(validMap, "validMap");
        Intrinsics.checkNotNullParameter(dataBuffer, "dataBuffer");
        int oneRecordLeastDataLen$fitness_parser_release = getOneRecordLeastDataLen$fitness_parser_release(dataTypes, dataId.getVersion());
        LinkedList linkedList = new LinkedList();
        for (int i = 0; i < recordCount && dataBuffer.position() + oneRecordLeastDataLen$fitness_parser_release <= dataBuffer.capacity(); i++) {
            linkedList.add(parseOneRecord(dataTypes, dataId, validMap, dataBuffer));
        }
        return linkedList;
    }
}
