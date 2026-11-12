package com.xiaomi.fitness.device.manager.dao;

import androidx.room.Delete;
import androidx.room.Query;
import com.xiaomi.fitness.database.BaseDao;
import com.xiaomi.fitness.device.manager.export.bean.LocalDevice;
import com.xiaomi.smarthome.device.utils.DeviceTagInterface;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0002\bg\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0016\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0005H§@¢\u0006\u0002\u0010\u0006J\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\bH§@¢\u0006\u0002\u0010\tJ\u000e\u0010\n\u001a\u00020\u000bH§@¢\u0006\u0002\u0010\tJ\"\u0010\f\u001a\u00020\r2\u0012\u0010\u000e\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00020\u000f\"\u00020\u0002H§@¢\u0006\u0002\u0010\u0010¨\u0006\u0011"}, d2 = {"Lcom/xiaomi/fitness/device/manager/dao/LocalDeviceDao;", "Lcom/xiaomi/fitness/database/BaseDao;", "Lcom/xiaomi/fitness/device/manager/export/bean/LocalDevice;", "queryLocalDevices", "deviceId", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "queryAllLocalDevices", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deleteAll", "", "delete", "", DeviceTagInterface.CUSTOM_TAG_TYPE, "", "([Lcom/xiaomi/fitness/device/manager/export/bean/LocalDevice;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "device-manager_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface LocalDeviceDao extends BaseDao<LocalDevice> {
    @Delete
    @Nullable
    Object delete(@NotNull LocalDevice[] localDeviceArr, @NotNull Continuation<? super Integer> continuation);

    @Query("DELETE FROM local_device")
    @Nullable
    Object deleteAll(@NotNull Continuation<? super Unit> continuation);

    @Query("SELECT * FROM local_device")
    @Nullable
    Object queryAllLocalDevices(@NotNull Continuation<? super List<LocalDevice>> continuation);

    @Query("SELECT * FROM local_device WHERE app_device_id = :deviceId")
    @Nullable
    Object queryLocalDevices(@NotNull String str, @NotNull Continuation<? super LocalDevice> continuation);
}
