package com.xiaomi.fitness.repo;

import com.xiaomi.smarthome.device.utils.DeviceTagInterface;
import java.util.Map;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010%\n\u0002\u0010\t\n\u0002\b\u0003\b`\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002J+\u0010\u0003\u001a\u00020\u00042\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00028\u00000\u00062\b\u0010\b\u001a\u0004\u0018\u00018\u0000H&¢\u0006\u0002\u0010\t¨\u0006\n"}, d2 = {"Lcom/xiaomi/fitness/repo/IDistinctListener;", "T", "", "distinct", "", "map", "", "", DeviceTagInterface.CUSTOM_TAG_TYPE, "(Ljava/util/Map;Ljava/lang/Object;)V", "fitness-data-core_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface IDistinctListener<T> {
    void distinct(@NotNull Map<Long, T> map, @Nullable T t);
}
