package com.xiaomi.hm.health.device.alarm;

import com.huami.watch.transport.httpsupport.model.DataItem;
import com.xiaomi.hm.health.databases.model.Alarm;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J\u000e\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H&J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0006\u001a\u00020\u0005H&J\u0010\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0003H&J\u0016\u0010\f\u001a\u00020\t2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H&J\u0016\u0010\r\u001a\u00020\t2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H&¨\u0006\u000e"}, d2 = {"Lcom/xiaomi/hm/health/device/alarm/AlarmCached;", "", "", "Lcom/xiaomi/hm/health/databases/model/Alarm;", "getAll", "", "index", "get", "alarm", "", DataItem.HTTP_METHOD_PUT, "alarms", "putAll", "replaceAll", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public interface AlarmCached {
    @Nullable
    Alarm get(int index);

    @NotNull
    List<Alarm> getAll();

    void put(@NotNull Alarm alarm);

    void putAll(@NotNull List<? extends Alarm> alarms);

    void replaceAll(@NotNull List<? extends Alarm> alarms);
}
