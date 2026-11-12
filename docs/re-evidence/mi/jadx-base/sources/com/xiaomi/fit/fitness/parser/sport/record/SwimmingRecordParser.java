package com.xiaomi.fit.fitness.parser.sport.record;

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
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\b\u0010\u0010\u001a\u00020\u0011H\u0016J&\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0018H\u0016J\b\u0010\u0019\u001a\u00020\u001aH\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0082\u0004¢\u0006\u0004\n\u0002\u0010\n¨\u0006\u001b"}, d2 = {"Lcom/xiaomi/fit/fitness/parser/sport/record/SwimmingRecordParser;", "Lcom/xiaomi/fit/fitness/parser/sport/base/SportRecordBaseParser;", "Lcom/xiaomi/fit/fitness/parser/sport/base/TriathlonSubRecordParser;", "<init>", "()V", "sectionExistType", "Lcom/xiaomi/fit/fitness/parser/base/FitnessDataBaseParser$DependDataType;", "dataTypeArray", "", "Lcom/xiaomi/fit/fitness/parser/base/FitnessDataBaseParser$OneDimenDataType;", "[Lcom/xiaomi/fit/fitness/parser/base/FitnessDataBaseParser$OneDimenDataType;", "parseRecord", "", "Lcom/xiaomi/fit/fitness/parser/data/SportRecord;", "binaryData", "Lcom/xiaomi/fit/fitness/parser/data/FitnessBinaryData;", "getDistanceRecordTimes", "", "parseTriathlonRecord", "dataId", "Lcom/xiaomi/fit/data/common/data/mi/FitnessDataId;", "dataValid", "", "byteBuffer", "Ljava/nio/ByteBuffer;", "isSwimmingSport", "", "fitness-parser_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class SwimmingRecordParser extends SportRecordBaseParser implements TriathlonSubRecordParser {

    @NotNull
    private final FitnessDataBaseParser.OneDimenDataType[] dataTypeArray;

    @NotNull
    private final FitnessDataBaseParser.DependDataType sectionExistType;

    public SwimmingRecordParser() {
        FitnessDataBaseParser.DependDataType dependDataType = new FitnessDataBaseParser.DependDataType(-1, new Integer[]{0});
        this.sectionExistType = dependDataType;
        this.dataTypeArray = new FitnessDataBaseParser.OneDimenDataType[]{new FitnessDataBaseParser.OneDimenDataType(-1, 1, 1, false, null, false, null, 120, null), new FitnessDataBaseParser.OneDimenDataType(1, 4, 1, false, null, false, null, 120, null), new FitnessDataBaseParser.OneDimenDataType(11, 1, 1, false, null, false, null, 120, null), new FitnessDataBaseParser.OneDimenDataType(12, 2, 1, false, null, false, null, 120, null), new FitnessDataBaseParser.OneDimenDataType(13, 2, 1, false, null, false, null, 120, null), new FitnessDataBaseParser.OneDimenDataType(9, 2, 1, dependDataType), new FitnessDataBaseParser.OneDimenDataType(2, 2, 1, dependDataType), new FitnessDataBaseParser.OneDimenDataType(16, 2, 1, dependDataType), new FitnessDataBaseParser.OneDimenDataType(10, 2, 1, dependDataType), new FitnessDataBaseParser.OneDimenDataType(17, 1, 1, dependDataType), new FitnessDataBaseParser.OneDimenDataType(18, 1, 1, dependDataType), new FitnessDataBaseParser.OneDimenDataType(19, 1, 1, dependDataType), new FitnessDataBaseParser.OneDimenDataType(20, 1, 1, dependDataType), new FitnessDataBaseParser.OneDimenDataType(21, 1, 1, dependDataType), new FitnessDataBaseParser.OneDimenDataType(22, 1, 1, dependDataType), new FitnessDataBaseParser.OneDimenDataType(3, 2, 2, dependDataType), new FitnessDataBaseParser.OneDimenDataType(81, 1, 3, dependDataType), new FitnessDataBaseParser.OneDimenDataType(82, 1, 3, dependDataType), new FitnessDataBaseParser.OneDimenDataType(83, 1, 3, dependDataType), new FitnessDataBaseParser.OneDimenDataType(84, 2, 3, dependDataType), new FitnessDataBaseParser.OneDimenDataType(85, 4, 3, dependDataType), new FitnessDataBaseParser.OneDimenDataType(86, 1, 3, false, dependDataType, false, 85, 40, null)};
    }

    @Override // com.xiaomi.fit.fitness.parser.sport.base.SportRecordBaseParser
    public int getDistanceRecordTimes() {
        return 1;
    }

    @Override // com.xiaomi.fit.fitness.parser.sport.base.SportRecordBaseParser
    public boolean isSwimmingSport() {
        return true;
    }

    @Override // com.xiaomi.fit.fitness.parser.sport.base.SportRecordBaseParser
    @Nullable
    public List<SportRecord> parseRecord(@NotNull FitnessBinaryData binaryData) {
        Intrinsics.checkNotNullParameter(binaryData, "binaryData");
        return parseOneDimenData(binaryData, this.dataTypeArray);
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
