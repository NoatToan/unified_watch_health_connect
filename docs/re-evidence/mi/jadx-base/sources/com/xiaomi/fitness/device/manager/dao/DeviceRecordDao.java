package com.xiaomi.fitness.device.manager.dao;

import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import com.xiaomi.fitness.database.BaseDao;
import com.xiaomi.fitness.device.manager.export.bean.DeviceRecord;
import com.xiaomi.smarthome.device.utils.DeviceTagInterface;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u000f\bg\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004H§@¢\u0006\u0002\u0010\u0005J\"\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004H§@¢\u0006\u0002\u0010\nJ\u000e\u0010\u000b\u001a\u00020\fH§@¢\u0006\u0002\u0010\u0005J\u001c\u0010\r\u001a\u00020\f2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004H§@¢\u0006\u0002\u0010\nJ\"\u0010\r\u001a\u00020\u000e2\u0012\u0010\u000f\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00020\u0007\"\u00020\u0002H§@¢\u0006\u0002\u0010\u0010J4\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\u0015\u001a\u00020\u000eH§@¢\u0006\u0002\u0010\u0016J4\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00020\u00042\u0006\u0010\u0018\u001a\u00020\b2\u0006\u0010\u0019\u001a\u00020\b2\u0006\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\u0015\u001a\u00020\u000eH§@¢\u0006\u0002\u0010\u001aJ$\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\u0015\u001a\u00020\u000eH§@¢\u0006\u0002\u0010\u001c¨\u0006\u001d"}, d2 = {"Lcom/xiaomi/fitness/device/manager/dao/DeviceRecordDao;", "Lcom/xiaomi/fitness/database/BaseDao;", "Lcom/xiaomi/fitness/device/manager/export/bean/DeviceRecord;", "getAllDeviceRecord", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "insertAll", "", "", "list", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deleteAll", "", "delete", "", DeviceTagInterface.CUSTOM_TAG_TYPE, "([Lcom/xiaomi/fitness/device/manager/export/bean/DeviceRecord;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "queryRecordByDeviceId", "startRecordID", "endRecordID", "limit", "offset", "(IIIILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "queryPagedDeviceRecordOverTime", "systemTime", "overTime", "(JJIILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "queryPagedDeviceRecord", "(IILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "device-manager_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface DeviceRecordDao extends BaseDao<DeviceRecord> {
    @Delete
    @Nullable
    Object delete(@NotNull List<DeviceRecord> list, @NotNull Continuation<? super Unit> continuation);

    @Delete
    @Nullable
    Object delete(@NotNull DeviceRecord[] deviceRecordArr, @NotNull Continuation<? super Integer> continuation);

    @Query("DELETE FROM device_record")
    @Nullable
    Object deleteAll(@NotNull Continuation<? super Unit> continuation);

    @Query("SELECT * FROM device_record")
    @Nullable
    Object getAllDeviceRecord(@NotNull Continuation<? super List<DeviceRecord>> continuation);

    @Insert(onConflict = 1)
    @Nullable
    Object insertAll(@NotNull List<DeviceRecord> list, @NotNull Continuation<? super Long[]> continuation);

    @Query("SELECT * FROM device_record LIMIT :offset,:limit")
    @Nullable
    Object queryPagedDeviceRecord(int i, int i2, @NotNull Continuation<? super List<DeviceRecord>> continuation);

    @Query("SELECT * FROM device_record WHERE (:systemTime - record_time) > :overTime AND need_check = 1 LIMIT :offset,:limit")
    @Nullable
    Object queryPagedDeviceRecordOverTime(long j, long j2, int i, int i2, @NotNull Continuation<? super List<DeviceRecord>> continuation);

    @Query("SELECT * FROM device_record WHERE deviceRecordId >= :startRecordID AND deviceRecordId <= :endRecordID LIMIT :offset,:limit")
    @Nullable
    Object queryRecordByDeviceId(int i, int i2, int i3, int i4, @NotNull Continuation<? super List<DeviceRecord>> continuation);
}
