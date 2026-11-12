package com.xiaomi.fitness.device.manager.report;

import com.xiaomi.fitness.device.manager.dao.DeviceRecordDao;
import com.xiaomi.fitness.device.manager.dao.DeviceRecordDatabase;
import com.xiaomi.fitness.device.manager.export.bean.DeviceRecord;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0007\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0086@¢\u0006\u0002\u0010\nJ\u001c\u0010\u000b\u001a\u00020\u00072\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\t0\rH\u0086@¢\u0006\u0002\u0010\u000eJ\u001c\u0010\u000f\u001a\u00020\u00072\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\t0\rH\u0086@¢\u0006\u0002\u0010\u000eJ\u0016\u0010\u0010\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0086@¢\u0006\u0002\u0010\nJ\u0014\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\t0\rH\u0086@¢\u0006\u0002\u0010\u0012J4\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\t0\r2\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u0018H\u0086@¢\u0006\u0002\u0010\u001aJ4\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\t0\r2\u0006\u0010\u001c\u001a\u00020\u00182\u0006\u0010\u001d\u001a\u00020\u00182\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u0018H\u0086@¢\u0006\u0002\u0010\u001eJ$\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\t0\r2\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u0018H\u0086@¢\u0006\u0002\u0010 R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006!"}, d2 = {"Lcom/xiaomi/fitness/device/manager/report/DeviceRecordReport;", "", "<init>", "()V", "mDeviceRecordDao", "Lcom/xiaomi/fitness/device/manager/dao/DeviceRecordDao;", "saveDeviceRecord", "", "deviceRecord", "Lcom/xiaomi/fitness/device/manager/export/bean/DeviceRecord;", "(Lcom/xiaomi/fitness/device/manager/export/bean/DeviceRecord;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "saveAllDeviceRecord", "deviceRecordList", "", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deleteDeviceRecordList", "deleteDeviceRecord", "getDeviceRecord", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "queryPagedDeviceRecordOverTime", "systemTime", "", "overTime", "limit", "", "offset", "(JJIILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "queryRecordByDeviceId", "startRecordID", "endRecordID", "(IIIILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "queryPagedDeviceRecord", "(IILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "device-manager_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class DeviceRecordReport {

    @NotNull
    private final DeviceRecordDao mDeviceRecordDao = DeviceRecordDatabase.INSTANCE.getInstance().getDeviceRecordDao();

    @Nullable
    public final Object deleteDeviceRecord(@NotNull DeviceRecord deviceRecord, @NotNull Continuation<? super Unit> continuation) {
        Object objDelete = this.mDeviceRecordDao.delete(new DeviceRecord[]{deviceRecord}, (Continuation<? super Integer>) continuation);
        return objDelete == IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objDelete : Unit.INSTANCE;
    }

    @Nullable
    public final Object deleteDeviceRecordList(@NotNull List<DeviceRecord> list, @NotNull Continuation<? super Unit> continuation) {
        Object objDelete = this.mDeviceRecordDao.delete(list, continuation);
        return objDelete == IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objDelete : Unit.INSTANCE;
    }

    @Nullable
    public final Object getDeviceRecord(@NotNull Continuation<? super List<DeviceRecord>> continuation) {
        return this.mDeviceRecordDao.getAllDeviceRecord(continuation);
    }

    @Nullable
    public final Object queryPagedDeviceRecord(int i, int i2, @NotNull Continuation<? super List<DeviceRecord>> continuation) {
        return this.mDeviceRecordDao.queryPagedDeviceRecord(i, i2, continuation);
    }

    @Nullable
    public final Object queryPagedDeviceRecordOverTime(long j, long j2, int i, int i2, @NotNull Continuation<? super List<DeviceRecord>> continuation) {
        return this.mDeviceRecordDao.queryPagedDeviceRecordOverTime(j, j2, i, i2, continuation);
    }

    @Nullable
    public final Object queryRecordByDeviceId(int i, int i2, int i3, int i4, @NotNull Continuation<? super List<DeviceRecord>> continuation) {
        return this.mDeviceRecordDao.queryRecordByDeviceId(i, i2, i3, i4, continuation);
    }

    @Nullable
    public final Object saveAllDeviceRecord(@NotNull List<DeviceRecord> list, @NotNull Continuation<? super Unit> continuation) {
        Object objInsertAll = this.mDeviceRecordDao.insertAll(list, continuation);
        return objInsertAll == IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objInsertAll : Unit.INSTANCE;
    }

    @Nullable
    public final Object saveDeviceRecord(@NotNull DeviceRecord deviceRecord, @NotNull Continuation<? super Unit> continuation) {
        Object objInsert = this.mDeviceRecordDao.insert(new DeviceRecord[]{deviceRecord}, continuation);
        return objInsert == IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objInsert : Unit.INSTANCE;
    }
}
