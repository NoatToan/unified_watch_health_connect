package com.huami.respiratoryrate.bluetooth.device;

import androidx.exifinterface.media.ExifInterface;
import com.xiaomi.hm.health.bt.device.HMBaseDevice;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0010 \n\u0002\b\u0003\bf\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002J3\u0010\b\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0012\f\u0012\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00070\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H¦@ø\u0001\u0000¢\u0006\u0004\b\b\u0010\t\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\n"}, d2 = {"Lcom/huami/respiratoryrate/bluetooth/device/IDeviceApi;", ExifInterface.GPS_DIRECTION_TRUE, "", "Lcom/xiaomi/hm/health/bt/device/HMBaseDevice;", "device", "Lkotlin/Pair;", "", "", "syncRespRateFromDevice", "(Lcom/xiaomi/hm/health/bt/device/HMBaseDevice;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public interface IDeviceApi<T> {
    @Nullable
    Object syncRespRateFromDevice(@Nullable HMBaseDevice hMBaseDevice, @NotNull Continuation<? super Pair<Long, ? extends List<? extends T>>> continuation);
}
