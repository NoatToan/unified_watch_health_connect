package com.xiaomi.fitness.repo;

import com.xiaomi.fit.fitness.export.data.item.DailyRecordItem;
import com.xiaomi.smarthome.device.utils.DeviceTagInterface;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010%\n\u0002\u0010\t\n\u0002\b\u0003\b\u0000\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J+\u0010\u0006\u001a\u00020\u00072\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00028\u00000\t2\b\u0010\u000b\u001a\u0004\u0018\u00018\u0000H\u0016¢\u0006\u0002\u0010\f¨\u0006\r"}, d2 = {"Lcom/xiaomi/fitness/repo/OneItemDistinct;", "T", "Lcom/xiaomi/fit/fitness/export/data/item/DailyRecordItem;", "Lcom/xiaomi/fitness/repo/IDistinctListener;", "<init>", "()V", "distinct", "", "map", "", "", DeviceTagInterface.CUSTOM_TAG_TYPE, "(Ljava/util/Map;Lcom/xiaomi/fit/fitness/export/data/item/DailyRecordItem;)V", "fitness-data-core_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class OneItemDistinct<T extends DailyRecordItem> implements IDistinctListener<T> {
    @Override // com.xiaomi.fitness.repo.IDistinctListener
    public /* bridge */ /* synthetic */ void distinct(Map map, Object obj) {
        distinct((Map<Long, DailyRecordItem>) map, (DailyRecordItem) obj);
    }

    public void distinct(@NotNull Map<Long, T> map, @Nullable T t) {
        Intrinsics.checkNotNullParameter(map, "map");
        if (t != null) {
            map.put(Long.valueOf(t.getTimestamp()), t);
        }
    }
}
