package com.mi.fitness.persist.server.data;

import com.xiaomi.fit.fitness.export.data.item.EcgMedicalItemReport;
import com.xiaomi.fit.fitness.export.data.item.PpgMedicalItemReport;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0014\u0010\u0004\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u0007\"\u0011\u0010\u0000\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0003¨\u0006\b"}, d2 = {"ONE_DAY_TIME_IN_SEC", "", "getONE_DAY_TIME_IN_SEC", "()J", "getProjectDataModelValueRawClass", "Ljava/lang/Class;", "record", "Lcom/mi/fitness/persist/server/data/ProjectDataModel;", "health_chinaProductRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class ResearchProjectModelKt {
    private static final long ONE_DAY_TIME_IN_SEC = TimeUnit.DAYS.toSeconds(1);

    public static final long getONE_DAY_TIME_IN_SEC() {
        return ONE_DAY_TIME_IN_SEC;
    }

    @Nullable
    public static final Class<?> getProjectDataModelValueRawClass(@NotNull ProjectDataModel record) {
        Intrinsics.checkNotNullParameter(record, "record");
        if (Intrinsics.areEqual(record.getKey(), "ppg")) {
            return PpgMedicalItemReport.class;
        }
        if (Intrinsics.areEqual(record.getKey(), "ecg")) {
            return EcgMedicalItemReport.class;
        }
        return null;
    }
}
