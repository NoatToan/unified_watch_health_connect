package com.xiaomi.fitness.trail.data;

import com.xiaomi.fit.data.common.data.sport.SportBasicReport;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/xiaomi/fitness/trail/data/DimData;", "", "list", "", "Lcom/xiaomi/fit/data/common/data/sport/SportBasicReport;", "<init>", "(Ljava/util/List;)V", "getList", "()Ljava/util/List;", "sport-record_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class DimData {

    @NotNull
    private final List<SportBasicReport> list;

    public DimData(@NotNull List<SportBasicReport> list) {
        Intrinsics.checkNotNullParameter(list, "list");
        this.list = list;
    }

    @NotNull
    public final List<SportBasicReport> getList() {
        return this.list;
    }
}
