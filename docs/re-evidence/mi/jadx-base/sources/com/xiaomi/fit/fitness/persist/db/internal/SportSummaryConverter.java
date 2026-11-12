package com.xiaomi.fit.fitness.persist.db.internal;

import com.xiaomi.fit.data.common.data.sport.SportSummary;
import com.xiaomi.fit.fitness.di.FitnessDataSingleModuleKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0007J\u0012\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0007¨\u0006\t"}, d2 = {"Lcom/xiaomi/fit/fitness/persist/db/internal/SportSummaryConverter;", "", "<init>", "()V", "fromJson", "Lcom/xiaomi/fit/data/common/data/sport/SportSummary;", "value", "", "toJson", "fitness-data-core_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nSportSummaryDao.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SportSummaryDao.kt\ncom/xiaomi/fit/fitness/persist/db/internal/SportSummaryConverter\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,63:1\n1#2:64\n*E\n"})
public final class SportSummaryConverter {
    @Nullable
    public final SportSummary fromJson(@NotNull String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        return (SportSummary) FitnessDataSingleModuleKt.getGson().fromJson(value, SportSummary.class);
    }

    @NotNull
    public final String toJson(@Nullable SportSummary value) {
        String json;
        return (value == null || (json = FitnessDataSingleModuleKt.getGson().toJson(value)) == null) ? "{}" : json;
    }
}
