package com.xiaomi.fit.fitness.parser.sport.record;

import com.xiaomi.fit.fitness.parser.base.FitnessDataBaseParser;
import com.xiaomi.fit.fitness.parser.data.FitnessBinaryData;
import com.xiaomi.fit.fitness.parser.data.SportRecord;
import com.xiaomi.fit.fitness.parser.sport.base.GroupSportRecordParser;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t2\u0006\u0010\u000b\u001a\u00020\fH\u0016J\u0013\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0016¢\u0006\u0002\u0010\u000eR\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0007¨\u0006\u000f"}, d2 = {"Lcom/xiaomi/fit/fitness/parser/sport/record/HITrainingRecordParser;", "Lcom/xiaomi/fit/fitness/parser/sport/base/GroupSportRecordParser;", "<init>", "()V", "dataTypeArray", "", "Lcom/xiaomi/fit/fitness/parser/base/FitnessDataBaseParser$OneDimenDataType;", "[Lcom/xiaomi/fit/fitness/parser/base/FitnessDataBaseParser$OneDimenDataType;", "parseRecord", "", "Lcom/xiaomi/fit/fitness/parser/data/SportRecord;", "binaryData", "Lcom/xiaomi/fit/fitness/parser/data/FitnessBinaryData;", "getITSummaryDataType", "()[Lcom/xiaomi/fit/fitness/parser/base/FitnessDataBaseParser$OneDimenDataType;", "fitness-parser_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class HITrainingRecordParser extends GroupSportRecordParser {

    @NotNull
    private final FitnessDataBaseParser.OneDimenDataType[] dataTypeArray = {new FitnessDataBaseParser.OneDimenDataType(5, 1, 1, false, null, false, null, 120, null), new FitnessDataBaseParser.OneDimenDataType(2, 1, 1, false, null, false, null, 120, null)};

    @Override // com.xiaomi.fit.fitness.parser.sport.base.SportRecordBaseParser
    @NotNull
    public FitnessDataBaseParser.OneDimenDataType[] getITSummaryDataType() {
        return new FitnessDataBaseParser.OneDimenDataType[]{new FitnessDataBaseParser.OneDimenDataType(41, 1, 2, false, null, false, null, 120, null)};
    }

    @Override // com.xiaomi.fit.fitness.parser.sport.base.SportRecordBaseParser
    @Nullable
    public List<SportRecord> parseRecord(@NotNull FitnessBinaryData binaryData) {
        Intrinsics.checkNotNullParameter(binaryData, "binaryData");
        return parseOneDimenData(binaryData, this.dataTypeArray);
    }
}
