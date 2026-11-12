package com.xiaomi.fitness.habit.bean;

import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0010\t\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0019\b\u0016\u0012\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\"\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\u0006¨\u0006\n"}, d2 = {"Lcom/xiaomi/fitness/habit/bean/DeleteHabitsReq;", "", "ids", "", "", "<init>", "(Ljava/util/List;)V", "getIds", "()Ljava/util/List;", "setIds", "habit_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class DeleteHabitsReq {

    @Nullable
    private List<Long> ids;

    public DeleteHabitsReq(@Nullable List<Long> list) {
        this.ids = list;
    }

    @Nullable
    public final List<Long> getIds() {
        return this.ids;
    }

    public final void setIds(@Nullable List<Long> list) {
        this.ids = list;
    }
}
