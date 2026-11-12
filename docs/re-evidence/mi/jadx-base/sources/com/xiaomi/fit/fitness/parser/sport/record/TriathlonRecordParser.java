package com.xiaomi.fit.fitness.parser.sport.record;

import com.xiaomi.fit.data.common.data.mi.FitnessDataId;
import com.xiaomi.fit.data.common.data.mi.FitnessDataValidity;
import com.xiaomi.fit.data.common.log.FitnessLogUtils;
import com.xiaomi.fit.fitness.parser.base.FitnessDataBaseParser;
import com.xiaomi.fit.fitness.parser.data.FitnessBinaryData;
import com.xiaomi.fit.fitness.parser.data.FitnessParseResult;
import com.xiaomi.fit.fitness.parser.data.SportRecord;
import com.xiaomi.fit.fitness.parser.schema.DailyRecordKey;
import com.xiaomi.fit.fitness.parser.sport.base.SportRecordBaseParser;
import com.xiaomi.fit.fitness.parser.sport.base.TriathlonSubRecordParser;
import com.xiaomi.fit.fitness.parser.utils.FitnessParserUtils;
import com.xiaomi.fitness.common.extensions.ListExtKt;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.NotImplementedError;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010%\n\u0002\u0010\b\n\u0002\b\n\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J&\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016H\u0016J\u0012\u0010\u0017\u001a\u0004\u0018\u00010\u00182\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J8\u0010\u0019\u001a\u00020\u001a2\u0018\u0010\u001b\u001a\u0014\u0012\u0004\u0012\u00020\u001d\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f0\u001c2\u0006\u0010\u001e\u001a\u00020\u001d2\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\r0\fH\u0002J\u0010\u0010 \u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001dH\u0002J\u0010\u0010!\u001a\u00020\u00022\u0006\u0010\u001e\u001a\u00020\u001dH\u0002J\u001f\u0010\"\u001a\u0004\u0018\u00010\u001d2\u0006\u0010#\u001a\u00020\u001d2\u0006\u0010$\u001a\u00020\u001dH\u0002¢\u0006\u0002\u0010%J \u0010&\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010$\u001a\u00020\u001dH\u0002R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082D¢\u0006\u0002\n\u0000R\u0016\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0082\u0004¢\u0006\u0004\n\u0002\u0010\n¨\u0006'"}, d2 = {"Lcom/xiaomi/fit/fitness/parser/sport/record/TriathlonRecordParser;", "Lcom/xiaomi/fit/fitness/parser/sport/base/SportRecordBaseParser;", "Lcom/xiaomi/fit/fitness/parser/sport/base/TriathlonSubRecordParser;", "<init>", "()V", "TAG", "", "dataTypeArray", "", "Lcom/xiaomi/fit/fitness/parser/base/FitnessDataBaseParser$OneDimenDataType;", "[Lcom/xiaomi/fit/fitness/parser/base/FitnessDataBaseParser$OneDimenDataType;", "parseRecord", "", "Lcom/xiaomi/fit/fitness/parser/data/SportRecord;", "binaryData", "Lcom/xiaomi/fit/fitness/parser/data/FitnessBinaryData;", "parseTriathlonRecord", "dataId", "Lcom/xiaomi/fit/data/common/data/mi/FitnessDataId;", "dataValid", "", "byteBuffer", "Ljava/nio/ByteBuffer;", "parse", "Lcom/xiaomi/fit/fitness/parser/data/FitnessParseResult;", "addRecordToMap", "", "recordMap", "", "", DailyRecordKey.sportType, "subRecordList", "getResultSportTypeKey", "getSubRecordParser", "convertSubSportType", "subType", "version", "(II)Ljava/lang/Integer;", "createSubSportType", "fitness-parser_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class TriathlonRecordParser extends SportRecordBaseParser implements TriathlonSubRecordParser {

    @NotNull
    private final String TAG = "TriathlonRecordParser";

    @NotNull
    private final FitnessDataBaseParser.OneDimenDataType[] dataTypeArray = {new FitnessDataBaseParser.OneDimenDataType(5, 1, 1, false, null, false, null, 120, null), new FitnessDataBaseParser.OneDimenDataType(2, 1, 1, false, null, false, null, 120, null)};

    private final void addRecordToMap(Map<Integer, List<SportRecord>> recordMap, int sportType, List<SportRecord> subRecordList) {
        int resultSportTypeKey = getResultSportTypeKey(sportType);
        List<SportRecord> list = recordMap.get(Integer.valueOf(resultSportTypeKey));
        if (list == null) {
            recordMap.put(Integer.valueOf(resultSportTypeKey), subRecordList);
        } else {
            ListExtKt.addAll(list, subRecordList);
        }
    }

    private final Integer convertSubSportType(int subType, int version) {
        if (subType == 0) {
            return 10;
        }
        if (subType == 1) {
            return Integer.valueOf(version >= 2 ? 23 : 6);
        }
        if (subType != 2) {
            return subType != 3 ? null : 0;
        }
        return Integer.valueOf(version >= 2 ? 22 : 1);
    }

    private final FitnessDataId createSubSportType(FitnessDataId dataId, int sportType, int version) {
        return dataId.copy().sportType(sportType).version(version).fileType(0).build();
    }

    private final int getResultSportTypeKey(int sportType) {
        if (sportType == 22) {
            return 1;
        }
        if (sportType != 23) {
            return sportType;
        }
        return 6;
    }

    private final TriathlonSubRecordParser getSubRecordParser(int sportType) {
        if (sportType == 1) {
            return new OutdoorSportRecordParser();
        }
        if (sportType == 6) {
            return new OutdoorBikingRecordParser();
        }
        if (sportType == 10) {
            return new SwimmingRecordParser();
        }
        if (sportType != 22) {
            return sportType != 23 ? new TriathlonRecordParser() : new OutdoorNoStepRecordParser();
        }
        return new OutdoorStepRecordParser();
    }

    @Override // com.xiaomi.fit.fitness.parser.sport.base.SportRecordBaseParser, com.xiaomi.fit.fitness.parser.base.FitnessDataBaseParser
    @Nullable
    public FitnessParseResult parse(@NotNull FitnessBinaryData binaryData) {
        Intrinsics.checkNotNullParameter(binaryData, "binaryData");
        ByteBuffer byteBufferOrder = ByteBuffer.wrap(binaryData.getBodyData()).order(ByteOrder.LITTLE_ENDIAN);
        HashMap map = new HashMap();
        while (byteBufferOrder.position() + 2 < byteBufferOrder.capacity()) {
            FitnessParserUtils fitnessParserUtils = FitnessParserUtils.INSTANCE;
            Intrinsics.checkNotNull(byteBufferOrder);
            int intFor1Byte$default = FitnessParserUtils.getIntFor1Byte$default(fitnessParserUtils, byteBufferOrder, false, 2, null);
            int intFor1Byte$default2 = FitnessParserUtils.getIntFor1Byte$default(fitnessParserUtils, byteBufferOrder, false, 2, null);
            Integer numConvertSubSportType = convertSubSportType(intFor1Byte$default, binaryData.getDataId().getVersion());
            if (numConvertSubSportType == null) {
                FitnessLogUtils.w(this.TAG, "not support subSportType = " + intFor1Byte$default);
                break;
            }
            FitnessDataId fitnessDataIdCreateSubSportType = createSubSportType(binaryData.getDataId(), numConvertSubSportType.intValue(), intFor1Byte$default2);
            FitnessDataValidity fitnessDataValidity = FitnessDataValidity.INSTANCE;
            int dataValidityLen = fitnessDataValidity.getDataValidityLen(fitnessDataIdCreateSubSportType);
            if (!fitnessDataValidity.checkSupport(dataValidityLen)) {
                FitnessLogUtils.i(this.TAG, "not support sport(" + numConvertSubSportType + "),version=" + intFor1Byte$default2);
                break;
            }
            if (byteBufferOrder.position() + dataValidityLen > byteBufferOrder.capacity()) {
                FitnessLogUtils.w(this.TAG, "no available dataValidLen(" + dataValidityLen + ")");
                break;
            }
            byte[] bArr = new byte[dataValidityLen];
            byteBufferOrder.get(bArr);
            TriathlonSubRecordParser subRecordParser = getSubRecordParser(numConvertSubSportType.intValue());
            FitnessLogUtils.i(this.TAG, "parse sub sport(" + numConvertSubSportType + "), version(" + intFor1Byte$default2 + ")");
            addRecordToMap(map, numConvertSubSportType.intValue(), subRecordParser.parseTriathlonRecord(fitnessDataIdCreateSubSportType, bArr, byteBufferOrder));
        }
        return new FitnessParseResult.Builder().sportRecord(map).build();
    }

    @Override // com.xiaomi.fit.fitness.parser.sport.base.SportRecordBaseParser
    @Nullable
    public List<SportRecord> parseRecord(@NotNull FitnessBinaryData binaryData) {
        Intrinsics.checkNotNullParameter(binaryData, "binaryData");
        throw new NotImplementedError("An operation is not implemented: Not yet implemented");
    }

    @Override // com.xiaomi.fit.fitness.parser.sport.base.TriathlonSubRecordParser
    @NotNull
    public List<SportRecord> parseTriathlonRecord(@NotNull FitnessDataId dataId, @NotNull byte[] dataValid, @NotNull ByteBuffer byteBuffer) {
        Intrinsics.checkNotNullParameter(dataId, "dataId");
        Intrinsics.checkNotNullParameter(dataValid, "dataValid");
        Intrinsics.checkNotNullParameter(byteBuffer, "byteBuffer");
        return parseOneDimenData(dataId, dataValid, byteBuffer, this.dataTypeArray, true);
    }
}
