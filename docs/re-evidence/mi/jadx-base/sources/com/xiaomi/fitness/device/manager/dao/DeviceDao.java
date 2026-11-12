package com.xiaomi.fitness.device.manager.dao;

import androidx.room.Delete;
import androidx.room.Query;
import com.xiaomi.fit.device.extensions.DeviceModelExtKt;
import com.xiaomi.fitness.database.BaseDao;
import com.xiaomi.fitness.device.manager.export.bean.WearableDevice;
import com.xiaomi.smarthome.device.utils.DeviceTagInterface;
import java.util.Arrays;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0005\bg\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u001c\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H§@¢\u0006\u0002\u0010\u0007J\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004H§@¢\u0006\u0002\u0010\tJ\u000e\u0010\n\u001a\u00020\u000bH§@¢\u0006\u0002\u0010\tJ\u0016\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u0006H§@¢\u0006\u0002\u0010\u0007J\u0016\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH§@¢\u0006\u0002\u0010\u000eJ\"\u0010\n\u001a\u00020\u00062\u0012\u0010\u000f\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00020\u0010\"\u00020\u0002H§@¢\u0006\u0002\u0010\u0011J\u001c\u0010\u0012\u001a\u00020\u000b2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004H\u0097@¢\u0006\u0002\u0010\u0014¨\u0006\u0015"}, d2 = {"Lcom/xiaomi/fitness/device/manager/dao/DeviceDao;", "Lcom/xiaomi/fitness/database/BaseDao;", "Lcom/xiaomi/fitness/device/manager/export/bean/WearableDevice;", "queryDevices", "", "status", "", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "queryAllDevices", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "delete", "", "did", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", DeviceTagInterface.CUSTOM_TAG_TYPE, "", "([Lcom/xiaomi/fitness/device/manager/export/bean/WearableDevice;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "updateBindDeviceList", "devices", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "device-manager_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface DeviceDao extends BaseDao<WearableDevice> {

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @SourceDebugExtension({"SMAP\nDeviceDao.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DeviceDao.kt\ncom/xiaomi/fitness/device/manager/dao/DeviceDao$DefaultImpls\n+ 2 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,47:1\n37#2:48\n36#2,3:49\n*S KotlinDebug\n*F\n+ 1 DeviceDao.kt\ncom/xiaomi/fitness/device/manager/dao/DeviceDao$DefaultImpls\n*L\n45#1:48\n45#1:49,3\n*E\n"})
    public static final class DefaultImpls {
        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        @Nullable
        public static Object updateBindDeviceList(@NotNull DeviceDao deviceDao, @NotNull List<? extends WearableDevice> list, @NotNull Continuation<? super Unit> continuation) {
            AnonymousClass1 anonymousClass1;
            if (continuation instanceof AnonymousClass1) {
                anonymousClass1 = (AnonymousClass1) continuation;
                int i = anonymousClass1.label;
                if ((i & Integer.MIN_VALUE) != 0) {
                    anonymousClass1.label = i - Integer.MIN_VALUE;
                } else {
                    anonymousClass1 = new AnonymousClass1(continuation);
                }
            } else {
                anonymousClass1 = new AnonymousClass1(continuation);
            }
            Object obj = anonymousClass1.result;
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = anonymousClass1.label;
            if (i2 != 0) {
                if (i2 == 1) {
                    list = (List) anonymousClass1.L$1;
                    deviceDao = (DeviceDao) anonymousClass1.L$0;
                    ResultKt.throwOnFailure(obj);
                } else {
                    if (i2 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            }
            ResultKt.throwOnFailure(obj);
            DeviceModelExtKt.logi("update bind device's size is " + list.size() + ", instance " + deviceDao);
            anonymousClass1.L$0 = deviceDao;
            anonymousClass1.L$1 = list;
            anonymousClass1.label = 1;
            if (deviceDao.delete(1, anonymousClass1) == coroutine_suspended) {
                return coroutine_suspended;
            }
            if (list.isEmpty()) {
                return Unit.INSTANCE;
            }
            WearableDevice[] wearableDeviceArr = (WearableDevice[]) list.toArray(new WearableDevice[0]);
            Object[] objArrCopyOf = Arrays.copyOf(wearableDeviceArr, wearableDeviceArr.length);
            anonymousClass1.L$0 = null;
            anonymousClass1.L$1 = null;
            anonymousClass1.label = 2;
            if (deviceDao.insert(objArrCopyOf, anonymousClass1) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.device.manager.dao.DeviceDao$updateBindDeviceList$1, reason: invalid class name */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.device.manager.dao.DeviceDao$DefaultImpls", f = "DeviceDao.kt", i = {0, 0}, l = {42, 45}, m = "updateBindDeviceList", n = {"$this", "devices"}, s = {"L$0", "L$1"})
    public static final class AnonymousClass1 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return DefaultImpls.updateBindDeviceList(null, null, this);
        }
    }

    @Query("DELETE FROM device WHERE status = :status")
    @Nullable
    Object delete(int i, @NotNull Continuation<? super Unit> continuation);

    @Query("DELETE FROM device WHERE did = :did")
    @Nullable
    Object delete(@NotNull String str, @NotNull Continuation<? super Unit> continuation);

    @Query("DELETE FROM device")
    @Nullable
    Object delete(@NotNull Continuation<? super Unit> continuation);

    @Delete
    @Nullable
    Object delete(@NotNull WearableDevice[] wearableDeviceArr, @NotNull Continuation<? super Integer> continuation);

    @Query("SELECT * FROM device")
    @Nullable
    Object queryAllDevices(@NotNull Continuation<? super List<? extends WearableDevice>> continuation);

    @Query("SELECT * FROM device WHERE status = :status")
    @Nullable
    Object queryDevices(int i, @NotNull Continuation<? super List<? extends WearableDevice>> continuation);

    @Nullable
    Object updateBindDeviceList(@NotNull List<? extends WearableDevice> list, @NotNull Continuation<? super Unit> continuation);
}
