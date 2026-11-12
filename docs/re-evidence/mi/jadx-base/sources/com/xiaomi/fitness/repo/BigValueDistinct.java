package com.xiaomi.fitness.repo;

import com.xiaomi.fit.fitness.export.data.item.DailyRecordItem;
import com.xiaomi.fit.fitness.export.data.item.IPointTimeData;
import com.xiaomi.smarthome.device.utils.DeviceTagInterface;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010%\n\u0002\u0010\t\n\u0002\b\u0003\b\u0000\u0018\u0000*\f\b\u0000\u0010\u0001*\u00020\u0002*\u00020\u00032\b\u0012\u0004\u0012\u0002H\u00010\u0004B\u0007¢\u0006\u0004\b\u0005\u0010\u0006J+\u0010\u0007\u001a\u00020\b2\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00028\u00000\n2\b\u0010\f\u001a\u0004\u0018\u00018\u0000H\u0016¢\u0006\u0002\u0010\r¨\u0006\u000e"}, d2 = {"Lcom/xiaomi/fitness/repo/BigValueDistinct;", "T", "Lcom/xiaomi/fit/fitness/export/data/item/DailyRecordItem;", "Lcom/xiaomi/fit/fitness/export/data/item/IPointTimeData;", "Lcom/xiaomi/fitness/repo/IDistinctListener;", "<init>", "()V", "distinct", "", "map", "", "", DeviceTagInterface.CUSTOM_TAG_TYPE, "(Ljava/util/Map;Lcom/xiaomi/fit/fitness/export/data/item/DailyRecordItem;)V", "fitness-data-core_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class BigValueDistinct<T extends DailyRecordItem & IPointTimeData> implements IDistinctListener<T> {
    @Override // com.xiaomi.fitness.repo.IDistinctListener
    public /* bridge */ /* synthetic */ void distinct(Map map, Object obj) {
        distinct((Map<Long, DailyRecordItem>) map, (DailyRecordItem) obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void distinct(@NotNull Map<Long, T> map, @Nullable T t) {
        Intrinsics.checkNotNullParameter(map, "map");
        if (t == 0) {
            return;
        }
        long timestamp = t.getTimestamp();
        T t2 = map.get(Long.valueOf(timestamp));
        if (t2 == null) {
            map.put(Long.valueOf(timestamp), t);
        } else if (t2.getPrimaryValue().intValue() < t.getPrimaryValue().intValue()) {
            map.put(Long.valueOf(timestamp), t);
        }
    }
}
