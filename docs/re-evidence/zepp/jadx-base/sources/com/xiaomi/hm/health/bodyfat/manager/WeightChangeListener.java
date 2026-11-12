package com.xiaomi.hm.health.bodyfat.manager;

import com.xiaomi.hm.health.databases.model.WeightInfos;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J#\u0010\u0006\u001a\u00020\u00052\u0012\u0010\u0004\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00030\u0002\"\u00020\u0003H&¢\u0006\u0004\b\u0006\u0010\u0007J#\u0010\b\u001a\u00020\u00052\u0012\u0010\u0004\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00030\u0002\"\u00020\u0003H&¢\u0006\u0004\b\b\u0010\u0007J#\u0010\t\u001a\u00020\u00052\u0012\u0010\u0004\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00030\u0002\"\u00020\u0003H&¢\u0006\u0004\b\t\u0010\u0007¨\u0006\n"}, d2 = {"Lcom/xiaomi/hm/health/bodyfat/manager/WeightChangeListener;", "", "", "Lcom/xiaomi/hm/health/databases/model/WeightInfos;", "info", "", "onInsert", "([Lcom/xiaomi/hm/health/databases/model/WeightInfos;)V", "onDelete", "onUpdate", "bodyfat_midongRelease"}, k = 1, mv = {1, 5, 1})
public interface WeightChangeListener {
    void onDelete(@NotNull WeightInfos... info);

    void onInsert(@NotNull WeightInfos... info);

    void onUpdate(@NotNull WeightInfos... info);
}
