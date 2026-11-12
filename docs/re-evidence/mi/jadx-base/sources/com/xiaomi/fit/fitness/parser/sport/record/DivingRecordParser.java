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
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0005H\u0016¢\u0006\u0002\u0010\u000fJ\u0018\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u00112\u0006\u0010\u0013\u001a\u00020\u0014H\u0016R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0007R\u0016\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0005X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\nR\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Lcom/xiaomi/fit/fitness/parser/sport/record/DivingRecordParser;", "Lcom/xiaomi/fit/fitness/parser/sport/base/SportRecordBaseParser;", "<init>", "()V", "fourDimenTypeArray", "", "Lcom/xiaomi/fit/fitness/parser/base/FitnessDataBaseParser$FourDimenType;", "[Lcom/xiaomi/fit/fitness/parser/base/FitnessDataBaseParser$FourDimenType;", "dataInfoArray", "Lcom/xiaomi/fit/fitness/parser/base/FitnessDataBaseParser$FourDimenDataInfo;", "[Lcom/xiaomi/fit/fitness/parser/base/FitnessDataBaseParser$FourDimenDataInfo;", "sectionExistType", "Lcom/xiaomi/fit/fitness/parser/base/FitnessDataBaseParser$DependDataType;", "getITSummaryDataType", "Lcom/xiaomi/fit/fitness/parser/base/FitnessDataBaseParser$OneDimenDataType;", "()[Lcom/xiaomi/fit/fitness/parser/base/FitnessDataBaseParser$OneDimenDataType;", "parseRecord", "", "Lcom/xiaomi/fit/fitness/parser/data/SportRecord;", "binaryData", "Lcom/xiaomi/fit/fitness/parser/data/FitnessBinaryData;", "fitness-parser_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class DivingRecordParser extends SportRecordBaseParser {

    @NotNull
    private final FitnessDataBaseParser.FourDimenDataInfo[] dataInfoArray;

    @NotNull
    private final FitnessDataBaseParser.FourDimenType[] fourDimenTypeArray;

    @NotNull
    private final FitnessDataBaseParser.DependDataType sectionExistType;

    public DivingRecordParser() {
        FitnessDataBaseParser.FourDimenType[] fourDimenTypeArr = {new FitnessDataBaseParser.FourDimenType(70, null, null, 6, null), new FitnessDataBaseParser.FourDimenType(71, null, null, 6, null), new FitnessDataBaseParser.FourDimenType(72, null, null, 6, null), new FitnessDataBaseParser.FourDimenType(73, 74, null, 4, null)};
        this.fourDimenTypeArray = fourDimenTypeArr;
        this.dataInfoArray = new FitnessDataBaseParser.FourDimenDataInfo[]{new FitnessDataBaseParser.FourDimenDataInfo(fourDimenTypeArr[0], 1, new FitnessDataBaseParser.DataItemLen(1), null, null, 1, null, false, null, FileUtils.S_IRWXU, null), new FitnessDataBaseParser.FourDimenDataInfo(fourDimenTypeArr[1], 2, new FitnessDataBaseParser.DataItemLen(2), null, null, 1, null, false, null, FileUtils.S_IRWXU, null), new FitnessDataBaseParser.FourDimenDataInfo(fourDimenTypeArr[2], 2, new FitnessDataBaseParser.DataItemLen(2), null, null, 1, null, false, null, 320, null), new FitnessDataBaseParser.FourDimenDataInfo(fourDimenTypeArr[3], 2, new FitnessDataBaseParser.DataItemLen(14, 2), new FitnessDataBaseParser.DataItemLen(0, 14), null, 1, null, false, null, FileUtils.S_IRWXU, null)};
        this.sectionExistType = new FitnessDataBaseParser.DependDataType(64, new Integer[]{1});
    }

    @Override // com.xiaomi.fit.fitness.parser.sport.base.SportRecordBaseParser
    @NotNull
    public FitnessDataBaseParser.OneDimenDataType[] getITSummaryDataType() {
        return new FitnessDataBaseParser.OneDimenDataType[]{new FitnessDataBaseParser.OneDimenDataType(64, 1, 1, false, null, false, null, 120, null), new FitnessDataBaseParser.OneDimenDataType(65, 4, 1, this.sectionExistType), new FitnessDataBaseParser.OneDimenDataType(66, 4, 1, this.sectionExistType), new FitnessDataBaseParser.OneDimenDataType(67, 2, 1, this.sectionExistType), new FitnessDataBaseParser.OneDimenDataType(68, 2, 1, this.sectionExistType), new FitnessDataBaseParser.OneDimenDataType(69, 2, 1, false, this.sectionExistType, false, null, 64, null), new FitnessDataBaseParser.OneDimenDataType(75, 2, 2, false, this.sectionExistType, false, null, 64, null), new FitnessDataBaseParser.OneDimenDataType(76, 2, 2, this.sectionExistType), new FitnessDataBaseParser.OneDimenDataType(77, 2, 2, this.sectionExistType)};
    }

    @Override // com.xiaomi.fit.fitness.parser.sport.base.SportRecordBaseParser
    @Nullable
    public List<SportRecord> parseRecord(@NotNull FitnessBinaryData binaryData) {
        Intrinsics.checkNotNullParameter(binaryData, "binaryData");
        return parseFourDimenData(binaryData, this.dataInfoArray);
    }
}
