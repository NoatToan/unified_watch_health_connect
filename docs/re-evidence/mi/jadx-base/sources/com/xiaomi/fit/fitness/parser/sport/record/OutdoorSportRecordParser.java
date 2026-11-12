package com.xiaomi.fit.fitness.parser.sport.record;

import com.tencent.wcdb.FileUtils;
import com.xiaomi.fit.data.common.data.mi.FitnessDataId;
import com.xiaomi.fit.fitness.parser.base.FitnessDataBaseParser;
import com.xiaomi.fit.fitness.parser.data.FitnessBinaryData;
import com.xiaomi.fit.fitness.parser.data.SportRecord;
import com.xiaomi.fit.fitness.parser.sport.base.SportRecordBaseParser;
import com.xiaomi.fit.fitness.parser.sport.base.TriathlonSubRecordParser;
import java.nio.ByteBuffer;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0013\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\r0\u0006H\u0016¢\u0006\u0002\u0010\u0010J\u0018\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u00122\u0006\u0010\u0014\u001a\u00020\u0015H\u0016J&\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00130\u00122\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001cH\u0016J\u0013\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\r0\u0006H\u0016¢\u0006\u0002\u0010\u0010R\u0016\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\bR\u0016\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u0006X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u000bR\u0016\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0006X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u000e¨\u0006\u001e"}, d2 = {"Lcom/xiaomi/fit/fitness/parser/sport/record/OutdoorSportRecordParser;", "Lcom/xiaomi/fit/fitness/parser/sport/base/SportRecordBaseParser;", "Lcom/xiaomi/fit/fitness/parser/sport/base/TriathlonSubRecordParser;", "<init>", "()V", "fourDimenTypeArray", "", "Lcom/xiaomi/fit/fitness/parser/base/FitnessDataBaseParser$FourDimenType;", "[Lcom/xiaomi/fit/fitness/parser/base/FitnessDataBaseParser$FourDimenType;", "dataInfoArray", "Lcom/xiaomi/fit/fitness/parser/base/FitnessDataBaseParser$FourDimenDataInfo;", "[Lcom/xiaomi/fit/fitness/parser/base/FitnessDataBaseParser$FourDimenDataInfo;", "initDataTypeArray", "Lcom/xiaomi/fit/fitness/parser/base/FitnessDataBaseParser$OneDimenDataType;", "[Lcom/xiaomi/fit/fitness/parser/base/FitnessDataBaseParser$OneDimenDataType;", "getPauseInitialDataTypes", "()[Lcom/xiaomi/fit/fitness/parser/base/FitnessDataBaseParser$OneDimenDataType;", "parseRecord", "", "Lcom/xiaomi/fit/fitness/parser/data/SportRecord;", "binaryData", "Lcom/xiaomi/fit/fitness/parser/data/FitnessBinaryData;", "parseTriathlonRecord", "dataId", "Lcom/xiaomi/fit/data/common/data/mi/FitnessDataId;", "dataValid", "", "byteBuffer", "Ljava/nio/ByteBuffer;", "getITSummaryDataType", "fitness-parser_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class OutdoorSportRecordParser extends SportRecordBaseParser implements TriathlonSubRecordParser {

    @NotNull
    private final FitnessDataBaseParser.FourDimenDataInfo[] dataInfoArray;

    @NotNull
    private final FitnessDataBaseParser.FourDimenType[] fourDimenTypeArray;

    @NotNull
    private final FitnessDataBaseParser.OneDimenDataType[] initDataTypeArray;

    public OutdoorSportRecordParser() {
        FitnessDataBaseParser.FourDimenType[] fourDimenTypeArr = {new FitnessDataBaseParser.FourDimenType(2, 4, null, 4, null), new FitnessDataBaseParser.FourDimenType(5, null, null, 6, null), new FitnessDataBaseParser.FourDimenType(6, 7, 8), new FitnessDataBaseParser.FourDimenType(9, null, null, 6, null)};
        this.fourDimenTypeArray = fourDimenTypeArr;
        this.dataInfoArray = new FitnessDataBaseParser.FourDimenDataInfo[]{new FitnessDataBaseParser.FourDimenDataInfo(fourDimenTypeArr[0], 1, new FitnessDataBaseParser.DataItemLen(4, 4), new FitnessDataBaseParser.DataItemLen(0, 4), null, 1, null, false, null, FileUtils.S_IRWXU, null), new FitnessDataBaseParser.FourDimenDataInfo(fourDimenTypeArr[1], 1, new FitnessDataBaseParser.DataItemLen(1), null, null, 1, null, false, null, FileUtils.S_IRWXU, null), new FitnessDataBaseParser.FourDimenDataInfo(fourDimenTypeArr[2], 1, new FitnessDataBaseParser.DataItemLen(7, 1), new FitnessDataBaseParser.DataItemLen(6, 1), new FitnessDataBaseParser.DataItemLen(0, 6), 1, null, false, null, FileUtils.S_IRWXU, null), new FitnessDataBaseParser.FourDimenDataInfo(fourDimenTypeArr[3], 1, new FitnessDataBaseParser.DataItemLen(1), null, null, 1, null, false, null, FileUtils.S_IRWXU, null)};
        this.initDataTypeArray = new FitnessDataBaseParser.OneDimenDataType[]{new FitnessDataBaseParser.OneDimenDataType(0, 4, 1, true, null, false, null, 112, null)};
    }

    @Override // com.xiaomi.fit.fitness.parser.sport.base.SportRecordBaseParser
    @NotNull
    public FitnessDataBaseParser.OneDimenDataType[] getITSummaryDataType() {
        return new FitnessDataBaseParser.OneDimenDataType[]{new FitnessDataBaseParser.OneDimenDataType(41, 1, 2, false, null, false, null, 120, null)};
    }

    @Override // com.xiaomi.fit.fitness.parser.sport.base.SportRecordBaseParser
    @NotNull
    /* JADX INFO: renamed from: getPauseInitialDataTypes, reason: from getter */
    public FitnessDataBaseParser.OneDimenDataType[] getInitDataTypeArray() {
        return this.initDataTypeArray;
    }

    @Override // com.xiaomi.fit.fitness.parser.sport.base.SportRecordBaseParser
    @Nullable
    public List<SportRecord> parseRecord(@NotNull FitnessBinaryData binaryData) {
        Intrinsics.checkNotNullParameter(binaryData, "binaryData");
        return parseFourDimenData(binaryData, this.dataInfoArray);
    }

    @Override // com.xiaomi.fit.fitness.parser.sport.base.TriathlonSubRecordParser
    @NotNull
    public List<SportRecord> parseTriathlonRecord(@NotNull FitnessDataId dataId, @NotNull byte[] dataValid, @NotNull ByteBuffer byteBuffer) {
        Intrinsics.checkNotNullParameter(dataId, "dataId");
        Intrinsics.checkNotNullParameter(dataValid, "dataValid");
        Intrinsics.checkNotNullParameter(byteBuffer, "byteBuffer");
        return parseFourDimenData(dataId, dataValid, byteBuffer, this.dataInfoArray, true);
    }
}
