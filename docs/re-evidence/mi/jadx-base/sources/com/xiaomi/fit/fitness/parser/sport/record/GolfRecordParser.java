package com.xiaomi.fit.fitness.parser.sport.record;

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
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t2\u0006\u0010\u000b\u001a\u00020\fH\u0016R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0007¨\u0006\r"}, d2 = {"Lcom/xiaomi/fit/fitness/parser/sport/record/GolfRecordParser;", "Lcom/xiaomi/fit/fitness/parser/sport/base/SportRecordBaseParser;", "<init>", "()V", "dataTypeArray", "", "Lcom/xiaomi/fit/fitness/parser/base/FitnessDataBaseParser$OneDimenDataType;", "[Lcom/xiaomi/fit/fitness/parser/base/FitnessDataBaseParser$OneDimenDataType;", "parseRecord", "", "Lcom/xiaomi/fit/fitness/parser/data/SportRecord;", "binaryData", "Lcom/xiaomi/fit/fitness/parser/data/FitnessBinaryData;", "fitness-parser_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class GolfRecordParser extends SportRecordBaseParser {

    @NotNull
    private final FitnessDataBaseParser.OneDimenDataType[] dataTypeArray = {new FitnessDataBaseParser.OneDimenDataType(1, 4, 1, false, null, false, null, 120, null), new FitnessDataBaseParser.OneDimenDataType(2, 2, 1, false, null, false, null, 120, null), new FitnessDataBaseParser.OneDimenDataType(3, 2, 1, false, null, false, null, 120, null), new FitnessDataBaseParser.OneDimenDataType(31, 2, 1, false, null, false, null, 120, null), new FitnessDataBaseParser.OneDimenDataType(32, 2, 1, false, null, false, null, 120, null), new FitnessDataBaseParser.OneDimenDataType(33, 2, 1, false, null, false, null, 120, null), new FitnessDataBaseParser.OneDimenDataType(34, 2, 1, false, null, false, null, 120, null)};

    @Override // com.xiaomi.fit.fitness.parser.sport.base.SportRecordBaseParser
    @Nullable
    public List<SportRecord> parseRecord(@NotNull FitnessBinaryData binaryData) {
        Intrinsics.checkNotNullParameter(binaryData, "binaryData");
        return parseOneDimenData(binaryData, this.dataTypeArray);
    }
}
