package com.xiaomi.fitness.eco.device.manager.dao;

import androidx.room.Query;
import com.xiaomi.fit.eco.device.extensions.EcoDeviceModelExtKt;
import com.xiaomi.fitness.database.BaseDao;
import com.xiaomi.fitness.eco.device.manager.export.bean.EcoDevice;
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
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\bg\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u001c\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H§@¢\u0006\u0002\u0010\u0007J\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004H§@¢\u0006\u0002\u0010\tJ\u000e\u0010\n\u001a\u00020\u000bH§@¢\u0006\u0002\u0010\tJ\u0016\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u0006H§@¢\u0006\u0002\u0010\u0007J\u0016\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH§@¢\u0006\u0002\u0010\u000eJ\u001c\u0010\u000f\u001a\u00020\u000b2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004H\u0097@¢\u0006\u0002\u0010\u0011¨\u0006\u0012"}, d2 = {"Lcom/xiaomi/fitness/eco/device/manager/dao/EcoDeviceDao;", "Lcom/xiaomi/fitness/database/BaseDao;", "Lcom/xiaomi/fitness/eco/device/manager/export/bean/EcoDevice;", "queryDevices", "", "status", "", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "queryAllDevices", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "delete", "", "did", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "updateBindDeviceList", "ecoDevices", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "eco-device-manager_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface EcoDeviceDao extends BaseDao<EcoDevice> {

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @SourceDebugExtension({"SMAP\nEcoDeviceDao.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EcoDeviceDao.kt\ncom/xiaomi/fitness/eco/device/manager/dao/EcoDeviceDao$DefaultImpls\n+ 2 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,42:1\n37#2:43\n36#2,3:44\n*S KotlinDebug\n*F\n+ 1 EcoDeviceDao.kt\ncom/xiaomi/fitness/eco/device/manager/dao/EcoDeviceDao$DefaultImpls\n*L\n40#1:43\n40#1:44,3\n*E\n"})
    public static final class DefaultImpls {
        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        @Nullable
        public static Object updateBindDeviceList(@NotNull EcoDeviceDao ecoDeviceDao, @NotNull List<? extends EcoDevice> list, @NotNull Continuation<? super Unit> continuation) {
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
                    ecoDeviceDao = (EcoDeviceDao) anonymousClass1.L$0;
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
            EcoDeviceModelExtKt.logi("update eco bind device's size is " + list.size() + ", instance " + ecoDeviceDao);
            anonymousClass1.L$0 = ecoDeviceDao;
            anonymousClass1.L$1 = list;
            anonymousClass1.label = 1;
            if (ecoDeviceDao.delete(1, anonymousClass1) == coroutine_suspended) {
                return coroutine_suspended;
            }
            if (list.isEmpty()) {
                return Unit.INSTANCE;
            }
            EcoDevice[] ecoDeviceArr = (EcoDevice[]) list.toArray(new EcoDevice[0]);
            Object[] objArrCopyOf = Arrays.copyOf(ecoDeviceArr, ecoDeviceArr.length);
            anonymousClass1.L$0 = null;
            anonymousClass1.L$1 = null;
            anonymousClass1.label = 2;
            if (ecoDeviceDao.insert(objArrCopyOf, anonymousClass1) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.eco.device.manager.dao.EcoDeviceDao$updateBindDeviceList$1, reason: invalid class name */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.eco.device.manager.dao.EcoDeviceDao$DefaultImpls", f = "EcoDeviceDao.kt", i = {0, 0}, l = {38, 40}, m = "updateBindDeviceList", n = {"$this", "ecoDevices"}, s = {"L$0", "L$1"})
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

    @Query("DELETE FROM eco_device WHERE status = :status")
    @Nullable
    Object delete(int i, @NotNull Continuation<? super Unit> continuation);

    @Query("DELETE FROM eco_device WHERE did = :did")
    @Nullable
    Object delete(@NotNull String str, @NotNull Continuation<? super Unit> continuation);

    @Query("DELETE FROM eco_device")
    @Nullable
    Object delete(@NotNull Continuation<? super Unit> continuation);

    @Query("SELECT * FROM eco_device")
    @Nullable
    Object queryAllDevices(@NotNull Continuation<? super List<? extends EcoDevice>> continuation);

    @Query("SELECT * FROM eco_device WHERE status = :status")
    @Nullable
    Object queryDevices(int i, @NotNull Continuation<? super List<? extends EcoDevice>> continuation);

    @Nullable
    Object updateBindDeviceList(@NotNull List<? extends EcoDevice> list, @NotNull Continuation<? super Unit> continuation);
}
