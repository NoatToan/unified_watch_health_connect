package com.xiaomi.fitness.trail.model;

import com.xiaomi.fitness.baseui.BaseModel;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.ranges.IntRange;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/xiaomi/fitness/trail/model/ChooseSportTypeModel;", "Lcom/xiaomi/fitness/baseui/BaseModel;", "<init>", "()V", "timeRange", "", "", "getTimeRange", "()Ljava/util/List;", "sport-record_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ChooseSportTypeModel extends BaseModel {

    @NotNull
    private final List<Integer> timeRange = CollectionsKt___CollectionsKt.toList(new IntRange(1, 1440));

    @NotNull
    public final List<Integer> getTimeRange() {
        return this.timeRange;
    }
}
