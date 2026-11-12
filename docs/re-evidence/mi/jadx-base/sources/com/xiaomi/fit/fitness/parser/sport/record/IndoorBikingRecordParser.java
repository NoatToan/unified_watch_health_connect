package com.xiaomi.fit.fitness.parser.sport.record;

import com.tencent.wcdb.FileUtils;
import com.xiaomi.fit.fitness.parser.base.FitnessDataBaseParser;
import com.xiaomi.fit.fitness.parser.data.FitnessBinaryData;
import com.xiaomi.fit.fitness.parser.data.SportRecord;
import com.xiaomi.fit.fitness.parser.sport.base.SportRecordBaseParser;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000f2\u0006\u0010\u0011\u001a\u00020\u0012H\u0016J\u0013\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0016¢\u0006\u0002\u0010\u0014R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0007R\u0016\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0005X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\nR\u0016\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u0005X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\r¨\u0006\u0015"}, d2 = {"Lcom/xiaomi/fit/fitness/parser/sport/record/IndoorBikingRecordParser;", "Lcom/xiaomi/fit/fitness/parser/sport/base/SportRecordBaseParser;", "<init>", "()V", "v1DataTypeArray", "", "Lcom/xiaomi/fit/fitness/parser/base/FitnessDataBaseParser$OneDimenDataType;", "[Lcom/xiaomi/fit/fitness/parser/base/FitnessDataBaseParser$OneDimenDataType;", "fourDimenTypeArray", "Lcom/xiaomi/fit/fitness/parser/base/FitnessDataBaseParser$FourDimenType;", "[Lcom/xiaomi/fit/fitness/parser/base/FitnessDataBaseParser$FourDimenType;", "v2DataInfoArray", "Lcom/xiaomi/fit/fitness/parser/base/FitnessDataBaseParser$FourDimenDataInfo;", "[Lcom/xiaomi/fit/fitness/parser/base/FitnessDataBaseParser$FourDimenDataInfo;", "parseRecord", "", "Lcom/xiaomi/fit/fitness/parser/data/SportRecord;", "binaryData", "Lcom/xiaomi/fit/fitness/parser/data/FitnessBinaryData;", "getITSummaryDataType", "()[Lcom/xiaomi/fit/fitness/parser/base/FitnessDataBaseParser$OneDimenDataType;", "fitness-parser_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class IndoorBikingRecordParser extends SportRecordBaseParser {

    @NotNull
    private final FitnessDataBaseParser.FourDimenType[] fourDimenTypeArray;

    @NotNull
    private final FitnessDataBaseParser.OneDimenDataType[] v1DataTypeArray = {new FitnessDataBaseParser.OneDimenDataType(5, 1, 1, false, null, false, null, 120, null), new FitnessDataBaseParser.OneDimenDataType(2, 1, 1, false, null, false, null, 120, null)};

    @NotNull
    private final FitnessDataBaseParser.FourDimenDataInfo[] v2DataInfoArray;

    public IndoorBikingRecordParser() {
        FitnessDataBaseParser.FourDimenType[] fourDimenTypeArr = {new FitnessDataBaseParser.FourDimenType(2, 10, null, 4, null), new FitnessDataBaseParser.FourDimenType(5, null, null, 6, null), new FitnessDataBaseParser.FourDimenType(9, null, null, 6, null), new FitnessDataBaseParser.FourDimenType(23, null, null, 6, null), new FitnessDataBaseParser.FourDimenType(47, null, null, 6, null), new FitnessDataBaseParser.FourDimenType(51, null, null, 6, null), new FitnessDataBaseParser.FourDimenType(50, null, null, 6, null)};
        this.fourDimenTypeArray = fourDimenTypeArr;
        this.v2DataInfoArray = new FitnessDataBaseParser.FourDimenDataInfo[]{new FitnessDataBaseParser.FourDimenDataInfo(fourDimenTypeArr[0], 1, new FitnessDataBaseParser.DataItemLen(4, 4), new FitnessDataBaseParser.DataItemLen(0, 4), null, 2, null, false, null, FileUtils.S_IRWXU, null), new FitnessDataBaseParser.FourDimenDataInfo(fourDimenTypeArr[1], 1, new FitnessDataBaseParser.DataItemLen(1), null, null, 2, null, false, null, FileUtils.S_IRWXU, null), new FitnessDataBaseParser.FourDimenDataInfo(fourDimenTypeArr[2], 1, new FitnessDataBaseParser.DataItemLen(1), null, null, 2, null, false, null, FileUtils.S_IRWXU, null), new FitnessDataBaseParser.FourDimenDataInfo(fourDimenTypeArr[3], 1, new FitnessDataBaseParser.DataItemLen(1), null, null, 2, null, false, null, FileUtils.S_IRWXU, null), new FitnessDataBaseParser.FourDimenDataInfo(fourDimenTypeArr[4], 2, new FitnessDataBaseParser.DataItemLen(2), null, null, 5, null, false, null, FileUtils.S_IRWXU, null), new FitnessDataBaseParser.FourDimenDataInfo(fourDimenTypeArr[5], 2, new FitnessDataBaseParser.DataItemLen(2), null, null, 6, null, false, null, FileUtils.S_IRWXU, null), new FitnessDataBaseParser.FourDimenDataInfo(fourDimenTypeArr[6], 1, new FitnessDataBaseParser.DataItemLen(1), null, null, 6, null, false, null, FileUtils.S_IRWXU, null)};
    }

    @Override // com.xiaomi.fit.fitness.parser.sport.base.SportRecordBaseParser
    @NotNull
    public FitnessDataBaseParser.OneDimenDataType[] getITSummaryDataType() {
        return new FitnessDataBaseParser.OneDimenDataType[]{new FitnessDataBaseParser.OneDimenDataType(41, 1, 3, false, null, false, null, 120, null), new FitnessDataBaseParser.OneDimenDataType(43, 4, 4, false, null, false, null, 120, null)};
    }

    @Override // com.xiaomi.fit.fitness.parser.sport.base.SportRecordBaseParser
    @Nullable
    public List<SportRecord> parseRecord(@NotNull FitnessBinaryData binaryData) {
        Intrinsics.checkNotNullParameter(binaryData, "binaryData");
        return binaryData.getDataId().getVersion() == 1 ? parseOneDimenData(binaryData, this.v1DataTypeArray) : parseFourDimenData(binaryData, this.v2DataInfoArray);
    }
}
