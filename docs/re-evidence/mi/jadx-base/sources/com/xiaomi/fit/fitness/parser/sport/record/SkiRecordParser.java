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
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\f0\u0005H\u0016¢\u0006\u0002\u0010\u000fJ\b\u0010\u0010\u001a\u00020\u0011H\u0016J\u0018\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u00132\u0006\u0010\u0015\u001a\u00020\u0016H\u0016J\u0013\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\f0\u0005H\u0016¢\u0006\u0002\u0010\u000fR\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0007R\u0016\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0005X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\nR\u0016\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u0005X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\r¨\u0006\u0018"}, d2 = {"Lcom/xiaomi/fit/fitness/parser/sport/record/SkiRecordParser;", "Lcom/xiaomi/fit/fitness/parser/sport/base/SportRecordBaseParser;", "<init>", "()V", "fourDimenTypeArray", "", "Lcom/xiaomi/fit/fitness/parser/base/FitnessDataBaseParser$FourDimenType;", "[Lcom/xiaomi/fit/fitness/parser/base/FitnessDataBaseParser$FourDimenType;", "dataInfoArray", "Lcom/xiaomi/fit/fitness/parser/base/FitnessDataBaseParser$FourDimenDataInfo;", "[Lcom/xiaomi/fit/fitness/parser/base/FitnessDataBaseParser$FourDimenDataInfo;", "initDataTypeArray", "Lcom/xiaomi/fit/fitness/parser/base/FitnessDataBaseParser$OneDimenDataType;", "[Lcom/xiaomi/fit/fitness/parser/base/FitnessDataBaseParser$OneDimenDataType;", "getPauseInitialDataTypes", "()[Lcom/xiaomi/fit/fitness/parser/base/FitnessDataBaseParser$OneDimenDataType;", "getDistanceRecordTimes", "", "parseRecord", "", "Lcom/xiaomi/fit/fitness/parser/data/SportRecord;", "binaryData", "Lcom/xiaomi/fit/fitness/parser/data/FitnessBinaryData;", "getITSummaryDataType", "fitness-parser_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class SkiRecordParser extends SportRecordBaseParser {

    @NotNull
    private final FitnessDataBaseParser.FourDimenDataInfo[] dataInfoArray;

    @NotNull
    private final FitnessDataBaseParser.FourDimenType[] fourDimenTypeArray;

    @NotNull
    private final FitnessDataBaseParser.OneDimenDataType[] initDataTypeArray;

    public SkiRecordParser() {
        FitnessDataBaseParser.FourDimenType[] fourDimenTypeArr = {new FitnessDataBaseParser.FourDimenType(2, null, null, 6, null), new FitnessDataBaseParser.FourDimenType(5, null, null, 6, null), new FitnessDataBaseParser.FourDimenType(7, 8, null, 4, null), new FitnessDataBaseParser.FourDimenType(9, null, null, 6, null), new FitnessDataBaseParser.FourDimenType(51, null, null, 6, null), new FitnessDataBaseParser.FourDimenType(87, null, null, 6, null), new FitnessDataBaseParser.FourDimenType(88, null, null, 6, null)};
        this.fourDimenTypeArray = fourDimenTypeArr;
        this.dataInfoArray = new FitnessDataBaseParser.FourDimenDataInfo[]{new FitnessDataBaseParser.FourDimenDataInfo(fourDimenTypeArr[0], 1, new FitnessDataBaseParser.DataItemLen(1), null, null, 1, null, false, null, FileUtils.S_IRWXU, null), new FitnessDataBaseParser.FourDimenDataInfo(fourDimenTypeArr[1], 1, new FitnessDataBaseParser.DataItemLen(1), null, null, 1, null, false, null, FileUtils.S_IRWXU, null), new FitnessDataBaseParser.FourDimenDataInfo(fourDimenTypeArr[5], 4, new FitnessDataBaseParser.DataItemLen(4), null, null, 4, null, false, null, 320, null), new FitnessDataBaseParser.FourDimenDataInfo(fourDimenTypeArr[6], 2, new FitnessDataBaseParser.DataItemLen(2), null, null, 4, null, false, null, FileUtils.S_IRWXU, null), new FitnessDataBaseParser.FourDimenDataInfo(fourDimenTypeArr[2], 1, new FitnessDataBaseParser.DataItemLen(7, 1), new FitnessDataBaseParser.DataItemLen(0, 7), null, 1, null, false, 3, 192, null), new FitnessDataBaseParser.FourDimenDataInfo(fourDimenTypeArr[3], 1, new FitnessDataBaseParser.DataItemLen(1), null, null, 1, null, false, 3, 192, null), new FitnessDataBaseParser.FourDimenDataInfo(fourDimenTypeArr[4], 2, new FitnessDataBaseParser.DataItemLen(2), null, null, 2, null, false, null, FileUtils.S_IRWXU, null)};
        this.initDataTypeArray = new FitnessDataBaseParser.OneDimenDataType[]{new FitnessDataBaseParser.OneDimenDataType(-2, 1, 1, false, null, false, null, 120, null), new FitnessDataBaseParser.OneDimenDataType(0, 4, 1, true, null, false, null, 112, null)};
    }

    @Override // com.xiaomi.fit.fitness.parser.sport.base.SportRecordBaseParser
    public int getDistanceRecordTimes() {
        return 1;
    }

    @Override // com.xiaomi.fit.fitness.parser.sport.base.SportRecordBaseParser
    @NotNull
    public FitnessDataBaseParser.OneDimenDataType[] getITSummaryDataType() {
        return new FitnessDataBaseParser.OneDimenDataType[]{new FitnessDataBaseParser.OneDimenDataType(59, 4, 3, false, null, false, null, 120, null), new FitnessDataBaseParser.OneDimenDataType(60, 4, 3, false, null, false, null, 120, null), new FitnessDataBaseParser.OneDimenDataType(61, 2, 3, false, null, false, null, 120, null), new FitnessDataBaseParser.OneDimenDataType(62, 2, 3, false, null, false, null, 120, null), new FitnessDataBaseParser.OneDimenDataType(63, 1, 3, false, null, false, null, 120, null)};
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
}
