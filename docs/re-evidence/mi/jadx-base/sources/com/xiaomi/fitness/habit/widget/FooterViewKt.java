package com.xiaomi.fitness.habit.widget;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u000e\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003¨\u0006\u0004"}, d2 = {"canLoadMore", "", "status", "Lcom/xiaomi/fitness/habit/widget/Status;", "habit_chinaProductRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class FooterViewKt {
    public static final boolean canLoadMore(@NotNull Status status) {
        Intrinsics.checkNotNullParameter(status, "status");
        return (status == Status.LOADING || status == Status.DONE) ? false : true;
    }
}
