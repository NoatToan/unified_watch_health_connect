package com.xiaomi.fitness.health.curse.data;

import com.xiaomi.hm.health.bt.profile.menstruation.MenstruationTotalRecord;
import defpackage.jv9;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0015\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0015\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/xiaomi/hm/health/bt/profile/menstruation/MenstruationTotalRecord;", "record", "Lcom/xiaomi/fitness/health/curse/data/CurseMixedRecord;", "genHuaMiRecord", "(Lcom/xiaomi/hm/health/bt/profile/menstruation/MenstruationTotalRecord;)Lcom/xiaomi/fitness/health/curse/data/CurseMixedRecord;", "Ljv9;", "genProtoRecord", "(Ljv9;)Lcom/xiaomi/fitness/health/curse/data/CurseMixedRecord;", "health_chinaProductRelease"}, k = 2, mv = {2, 0, 0})
public final class CurseMixedRecordKt {
    @NotNull
    public static final CurseMixedRecord genHuaMiRecord(@NotNull MenstruationTotalRecord record) {
        Intrinsics.checkNotNullParameter(record, "record");
        return new CurseMixedRecord(record, null, 2, null);
    }

    @NotNull
    public static final CurseMixedRecord genProtoRecord(@NotNull jv9 record) {
        Intrinsics.checkNotNullParameter(record, "record");
        return new CurseMixedRecord(null, record, 1, null);
    }
}
