package com.xiaomi.fit.fitness.parser.base;

import com.xiaomi.fit.data.common.data.mi.FitnessDataId;
import com.xiaomi.fit.data.common.log.FitnessLogUtils;
import com.xiaomi.fit.fitness.parser.data.FitnessBinaryData;
import com.xiaomi.fit.fitness.parser.utils.FitnessParserUtils;
import com.xiaomi.fitness.common.log.Logger;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0010$\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0002\b\u0005\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J;\u0010\u0006\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b0\u00072\u0006\u0010\u000b\u001a\u00020\f2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\u0006\u0010\u0010\u001a\u00020\u0011¢\u0006\u0002\u0010\u0012JO\u0010\u0006\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b0\u00072\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00150\b2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0010\u001a\u00020\u0011¢\u0006\u0002\u0010\u0018JC\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b2\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00150\b2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\u0006\u0010\u0016\u001a\u00020\u0017H\u0002¢\u0006\u0002\u0010\u001aJ6\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u000f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u00152\u0012\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0 2\u0006\u0010\u0016\u001a\u00020\u0017H\u0002J4\u0010!\u001a\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\u00152\u0006\u0010\"\u001a\u00020\u000f2\u0006\u0010\u0016\u001a\u00020\u00172\u0012\u0010#\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0 H\u0002J \u0010$\u001a\u00020\t2\u0006\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020\t2\u0006\u0010(\u001a\u00020\tH\u0002J\"\u0010)\u001a\u00020\t2\u0006\u0010*\u001a\u00020\u00172\u0006\u0010(\u001a\u00020\t2\b\b\u0002\u0010+\u001a\u00020,H\u0002J5\u0010-\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00150\b2\u0006\u0010.\u001a\u00020/2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\u0006\u0010\u001e\u001a\u000200¢\u0006\u0002\u00101J/\u00102\u001a\u00020\t2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\u0012\u00103\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00150\bH\u0002¢\u0006\u0002\u00104R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082D¢\u0006\u0002\n\u0000¨\u00065"}, d2 = {"Lcom/xiaomi/fit/fitness/parser/base/FourDimenDataParser;", "", "<init>", "()V", "TAG", "", "parseLoopRecord", "", "", "", "Lcom/xiaomi/fit/fitness/parser/base/FitnessDataBaseParser$DataValueItem;", "binaryData", "Lcom/xiaomi/fit/fitness/parser/data/FitnessBinaryData;", "dataInfoArray", "", "Lcom/xiaomi/fit/fitness/parser/base/FitnessDataBaseParser$FourDimenDataInfo;", "maxRecordCount", "", "(Lcom/xiaomi/fit/fitness/parser/data/FitnessBinaryData;[Lcom/xiaomi/fit/fitness/parser/base/FitnessDataBaseParser$FourDimenDataInfo;J)Ljava/util/List;", "dataValidMap", "Lcom/xiaomi/fit/fitness/parser/base/FitnessDataBaseParser$FourDimenType;", "Lcom/xiaomi/fit/fitness/parser/base/FitnessDataBaseParser$FourDimenDataValid;", "byteBuffer", "Ljava/nio/ByteBuffer;", "(Ljava/util/Map;[Lcom/xiaomi/fit/fitness/parser/base/FitnessDataBaseParser$FourDimenDataInfo;Ljava/nio/ByteBuffer;J)Ljava/util/List;", "parseOneRecord", "(Ljava/util/Map;[Lcom/xiaomi/fit/fitness/parser/base/FitnessDataBaseParser$FourDimenDataInfo;Ljava/nio/ByteBuffer;)Ljava/util/Map;", "processDynamicExistData", "", "dataInfo", "dataValid", "resultValueMap", "", "parseOneRecordItem", "recordItemInfo", "resultMap", "computeItemValue", "itemLen", "Lcom/xiaomi/fit/fitness/parser/base/FitnessDataBaseParser$DataItemLen;", "dataValue", "byteSize", "getByteData", "buffer", "isUnsigned", "", "parseDataValid", "dataId", "Lcom/xiaomi/fit/data/common/data/mi/FitnessDataId;", "", "(Lcom/xiaomi/fit/data/common/data/mi/FitnessDataId;[Lcom/xiaomi/fit/fitness/parser/base/FitnessDataBaseParser$FourDimenDataInfo;[B)Ljava/util/Map;", "getOneRecordLen", "validMap", "([Lcom/xiaomi/fit/fitness/parser/base/FitnessDataBaseParser$FourDimenDataInfo;Ljava/util/Map;)I", "fitness-parser_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nFourDimenDataParser.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FourDimenDataParser.kt\ncom/xiaomi/fit/fitness/parser/base/FourDimenDataParser\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,202:1\n1#2:203\n*E\n"})
public final class FourDimenDataParser {

    @NotNull
    public static final FourDimenDataParser INSTANCE = new FourDimenDataParser();

    @NotNull
    private static final String TAG = "FourDimenDataParser";

    private FourDimenDataParser() {
    }

    private final int computeItemValue(FitnessDataBaseParser.DataItemLen itemLen, int dataValue, int byteSize) {
        return itemLen.getByteSize() == byteSize ? dataValue : (dataValue & (((int) (((float) Math.pow(2.0f, itemLen.getBitSize())) - 1)) << itemLen.getStartBitIndex())) >>> itemLen.getStartBitIndex();
    }

    private final int getByteData(ByteBuffer buffer, int byteSize, boolean isUnsigned) {
        if (byteSize == 1 || byteSize == 2 || byteSize == 4) {
            if (byteSize != 1) {
                return byteSize != 2 ? (int) FitnessParserUtils.INSTANCE.getIntFor4Bytes(buffer, isUnsigned) : FitnessParserUtils.INSTANCE.getIntFor2Bytes(buffer, isUnsigned);
            }
            return FitnessParserUtils.INSTANCE.getIntFor1Byte(buffer, isUnsigned);
        }
        throw new IllegalArgumentException((TAG + " not support byteSize = " + byteSize).toString());
    }

    public static /* synthetic */ int getByteData$default(FourDimenDataParser fourDimenDataParser, ByteBuffer byteBuffer, int i, boolean z, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            z = true;
        }
        return fourDimenDataParser.getByteData(byteBuffer, i, z);
    }

    private final int getOneRecordLen(FitnessDataBaseParser.FourDimenDataInfo[] dataInfoArray, Map<FitnessDataBaseParser.FourDimenType, FitnessDataBaseParser.FourDimenDataValid> validMap) {
        int byteSize = 0;
        for (FitnessDataBaseParser.FourDimenDataInfo fourDimenDataInfo : dataInfoArray) {
            FitnessDataBaseParser.FourDimenDataValid fourDimenDataValid = validMap.get(fourDimenDataInfo.getDataType());
            if (fourDimenDataValid != null && fourDimenDataValid.getExist()) {
                byteSize += fourDimenDataInfo.getByteSize();
            }
        }
        return byteSize;
    }

    private final Map<Integer, FitnessDataBaseParser.DataValueItem> parseOneRecord(Map<FitnessDataBaseParser.FourDimenType, FitnessDataBaseParser.FourDimenDataValid> dataValidMap, FitnessDataBaseParser.FourDimenDataInfo[] dataInfoArray, ByteBuffer byteBuffer) {
        HashMap map = new HashMap();
        for (FitnessDataBaseParser.FourDimenDataInfo fourDimenDataInfo : dataInfoArray) {
            if (fourDimenDataInfo.getDynamicDataType() != null) {
                processDynamicExistData(fourDimenDataInfo, dataValidMap.get(fourDimenDataInfo.getDataType()), map, byteBuffer);
            } else {
                if (fourDimenDataInfo.getDataType() == null) {
                    throw new IllegalArgumentException((TAG + " dataType should not be null").toString());
                }
                FitnessDataBaseParser.FourDimenDataValid fourDimenDataValid = dataValidMap.get(fourDimenDataInfo.getDataType());
                if (fourDimenDataValid != null && fourDimenDataValid.getExist()) {
                    if (byteBuffer.position() + fourDimenDataInfo.getByteSize() > byteBuffer.capacity()) {
                        FitnessLogUtils.i(TAG, "no available byteSize(" + fourDimenDataInfo.getDataType().getHigh() + ")");
                        break;
                    }
                    parseOneRecordItem(fourDimenDataValid, fourDimenDataInfo, byteBuffer, map);
                }
            }
        }
        return map;
    }

    private final void parseOneRecordItem(FitnessDataBaseParser.FourDimenDataValid dataValid, FitnessDataBaseParser.FourDimenDataInfo recordItemInfo, ByteBuffer byteBuffer, Map<Integer, FitnessDataBaseParser.DataValueItem> resultMap) {
        FitnessDataBaseParser.FourDimenType dataType = recordItemInfo.getDataType();
        Intrinsics.checkNotNull(dataType);
        int byteSize = recordItemInfo.getByteSize();
        int byteData = getByteData(byteBuffer, byteSize, recordItemInfo.isUnsigned());
        if (recordItemInfo.getHigh() != null && dataValid.getHigh()) {
            resultMap.put(Integer.valueOf(dataType.getHigh()), new FitnessDataBaseParser.DataValueItem(dataType.getHigh(), dataValid.getHigh(), Long.valueOf(computeItemValue(recordItemInfo.getHigh(), byteData, byteSize)), false, null, 24, null));
        }
        if (recordItemInfo.getMiddle() != null && dataValid.getMiddle()) {
            int iComputeItemValue = computeItemValue(recordItemInfo.getMiddle(), byteData, byteSize);
            Integer middle = dataType.getMiddle();
            Intrinsics.checkNotNull(middle);
            resultMap.put(middle, new FitnessDataBaseParser.DataValueItem(dataType.getMiddle().intValue(), dataValid.getMiddle(), Long.valueOf(iComputeItemValue), false, null, 24, null));
        }
        if (recordItemInfo.getLow() == null || !dataValid.getLow()) {
            return;
        }
        int iComputeItemValue2 = computeItemValue(recordItemInfo.getLow(), byteData, byteSize);
        Integer low = dataType.getLow();
        Intrinsics.checkNotNull(low);
        resultMap.put(low, new FitnessDataBaseParser.DataValueItem(dataType.getLow().intValue(), dataValid.getLow(), Long.valueOf(iComputeItemValue2), false, null, 24, null));
    }

    private final void processDynamicExistData(FitnessDataBaseParser.FourDimenDataInfo dataInfo, FitnessDataBaseParser.FourDimenDataValid dataValid, Map<Integer, FitnessDataBaseParser.DataValueItem> resultValueMap, ByteBuffer byteBuffer) {
        FitnessDataBaseParser.DynamicValidDataType dynamicDataType = dataInfo.getDynamicDataType();
        if (dynamicDataType == null) {
            return;
        }
        boolean z = false;
        boolean z2 = dataInfo.getDataType() == null || dataValid == null || (dataValid.getExist() && dataValid.getHigh());
        FitnessDataBaseParser.DataValueItem dataValueItem = resultValueMap.get(Integer.valueOf(dynamicDataType.getDependType()));
        if (dataValueItem != null && dataValueItem.getValue().intValue() == dynamicDataType.getExistValue()) {
            z = true;
        }
        if (z2 && z) {
            int byteData$default = getByteData$default(this, byteBuffer, dataInfo.getByteSize(), false, 4, null);
            int dataType = dynamicDataType.getDataType();
            resultValueMap.put(Integer.valueOf(dataType), new FitnessDataBaseParser.DataValueItem(dataType, true, Long.valueOf(byteData$default), false, null, 24, null));
        }
    }

    @NotNull
    public final Map<FitnessDataBaseParser.FourDimenType, FitnessDataBaseParser.FourDimenDataValid> parseDataValid(@NotNull FitnessDataId dataId, @NotNull FitnessDataBaseParser.FourDimenDataInfo[] dataInfoArray, @NotNull byte[] dataValid) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        Intrinsics.checkNotNullParameter(dataId, "dataId");
        Intrinsics.checkNotNullParameter(dataInfoArray, "dataInfoArray");
        Intrinsics.checkNotNullParameter(dataValid, "dataValid");
        HashMap map = new HashMap();
        int length = dataValid.length;
        int i = 0;
        for (FitnessDataBaseParser.FourDimenDataInfo fourDimenDataInfo : dataInfoArray) {
            if (fourDimenDataInfo.getDataType() != null) {
                int i2 = i / 2;
                if (fourDimenDataInfo.getMaxSupportVersion() == null || fourDimenDataInfo.getMaxSupportVersion().intValue() >= dataId.getVersion()) {
                    if (fourDimenDataInfo.getSupportVersion() <= dataId.getVersion() && i2 < length) {
                        int i3 = i % 2;
                        byte b2 = dataValid[i2];
                        int i4 = i3 == 0 ? (b2 & 240) >>> 4 : b2 & 15;
                        z = (i4 & 8) > 0;
                        z2 = (i4 & 4) > 0;
                        z3 = (i4 & 2) > 0;
                        z4 = (i4 & 1) > 0;
                        i++;
                    }
                    map.put(fourDimenDataInfo.getDataType(), new FitnessDataBaseParser.FourDimenDataValid(z, z2, z3, z4));
                } else {
                    Logger.i("parseDataValid", "maxSupportVersion " + fourDimenDataInfo.getMaxSupportVersion() + ", dataIdVersion " + dataId.getVersion() + " ");
                }
                z = false;
                z4 = false;
                z2 = false;
                z3 = false;
                map.put(fourDimenDataInfo.getDataType(), new FitnessDataBaseParser.FourDimenDataValid(z, z2, z3, z4));
            }
        }
        return map;
    }

    @NotNull
    public final List<Map<Integer, FitnessDataBaseParser.DataValueItem>> parseLoopRecord(@NotNull FitnessBinaryData binaryData, @NotNull FitnessDataBaseParser.FourDimenDataInfo[] dataInfoArray, long maxRecordCount) {
        Intrinsics.checkNotNullParameter(binaryData, "binaryData");
        Intrinsics.checkNotNullParameter(dataInfoArray, "dataInfoArray");
        if (binaryData.getDataValid() == null) {
            FitnessLogUtils.w(TAG, "empty data valid");
            return new ArrayList();
        }
        Map<FitnessDataBaseParser.FourDimenType, FitnessDataBaseParser.FourDimenDataValid> dataValid = parseDataValid(binaryData.getDataId(), dataInfoArray, binaryData.getDataValid());
        ByteBuffer byteBufferOrder = ByteBuffer.wrap(binaryData.getBodyData()).order(ByteOrder.LITTLE_ENDIAN);
        Intrinsics.checkNotNull(byteBufferOrder);
        return parseLoopRecord(dataValid, dataInfoArray, byteBufferOrder, maxRecordCount);
    }

    @NotNull
    public final List<Map<Integer, FitnessDataBaseParser.DataValueItem>> parseLoopRecord(@NotNull Map<FitnessDataBaseParser.FourDimenType, FitnessDataBaseParser.FourDimenDataValid> dataValidMap, @NotNull FitnessDataBaseParser.FourDimenDataInfo[] dataInfoArray, @NotNull ByteBuffer byteBuffer, long maxRecordCount) {
        Intrinsics.checkNotNullParameter(dataValidMap, "dataValidMap");
        Intrinsics.checkNotNullParameter(dataInfoArray, "dataInfoArray");
        Intrinsics.checkNotNullParameter(byteBuffer, "byteBuffer");
        ArrayList arrayList = new ArrayList();
        int oneRecordLen = getOneRecordLen(dataInfoArray, dataValidMap);
        for (int i = 0; i < maxRecordCount && byteBuffer.position() + oneRecordLen <= byteBuffer.capacity(); i++) {
            arrayList.add(parseOneRecord(dataValidMap, dataInfoArray, byteBuffer));
        }
        return arrayList;
    }
}
