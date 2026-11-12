package com.xiaomi.fitness.aggregation.db;

import com.xiaomi.fit.fitness.export.data.annotation.HomeDataType;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0007J\u0010\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0007¨\u0006\t"}, d2 = {"Lcom/xiaomi/fitness/aggregation/db/HomeDataTypeConvert;", "", "<init>", "()V", "homeDataToString", "", "dataType", "Lcom/xiaomi/fit/fitness/export/data/annotation/HomeDataType;", "typeStringToHomeDataType", "fitness-data-core_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class HomeDataTypeConvert {
    @NotNull
    public final String homeDataToString(@NotNull HomeDataType dataType) {
        Intrinsics.checkNotNullParameter(dataType, "dataType");
        return dataType.name();
    }

    @NotNull
    public final HomeDataType typeStringToHomeDataType(@NotNull String dataType) {
        Intrinsics.checkNotNullParameter(dataType, "dataType");
        return HomeDataType.valueOf(dataType);
    }
}
