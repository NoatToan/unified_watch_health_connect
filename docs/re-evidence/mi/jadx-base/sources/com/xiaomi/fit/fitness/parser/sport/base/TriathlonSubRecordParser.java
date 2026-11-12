package com.xiaomi.fit.fitness.parser.sport.base;

import com.xiaomi.fit.data.common.data.mi.FitnessDataId;
import com.xiaomi.fit.fitness.parser.data.SportRecord;
import java.nio.ByteBuffer;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0000\b`\u0018\u00002\u00020\u0001J&\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH&¨\u0006\u000b"}, d2 = {"Lcom/xiaomi/fit/fitness/parser/sport/base/TriathlonSubRecordParser;", "", "parseTriathlonRecord", "", "Lcom/xiaomi/fit/fitness/parser/data/SportRecord;", "dataId", "Lcom/xiaomi/fit/data/common/data/mi/FitnessDataId;", "dataValid", "", "byteBuffer", "Ljava/nio/ByteBuffer;", "fitness-parser_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface TriathlonSubRecordParser {
    @NotNull
    List<SportRecord> parseTriathlonRecord(@NotNull FitnessDataId dataId, @NotNull byte[] dataValid, @NotNull ByteBuffer byteBuffer);
}
