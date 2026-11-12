package com.xiaomi.hm.health.device.setting.life.feature.inject;

import android.content.Context;
import com.huami.tools.analytics.DbUtils;
import com.xiaomi.hm.health.bt.device.HMBaseDevice;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\bf\u0018\u00002\u00020\u0001J\u001d\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H¦@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006J-\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u00072\b\u0010\n\u001a\u0004\u0018\u00010\tH¦@ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\fJ/\u0010\u000f\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\r\u001a\u00020\u00072\b\u0010\u000e\u001a\u0004\u0018\u00010\tH¦@ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\fJ7\u0010\u0011\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u000e\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0010\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0012\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0013"}, d2 = {"Lcom/xiaomi/hm/health/device/setting/life/feature/inject/FindPhoneApi;", "", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "", "onDeviceDisconnect", "(Landroid/content/Context;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "isIncall", "Lcom/xiaomi/hm/health/bt/device/HMBaseDevice;", "bleDevice", "startFindPhone", "(Landroid/content/Context;ZLcom/xiaomi/hm/health/bt/device/HMBaseDevice;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "fromDevice", "device", "stopFindPhone", "enable", "enableRing", "(Landroid/content/Context;Lcom/xiaomi/hm/health/bt/device/HMBaseDevice;ZZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public interface FindPhoneApi {

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public static final class DefaultImpls {
        @Nullable
        public static Object enableRing(@NotNull FindPhoneApi findPhoneApi, @Nullable Context context, @Nullable HMBaseDevice hMBaseDevice, boolean z, boolean z2, @NotNull Continuation<? super Unit> continuation) {
            return Unit.INSTANCE;
        }
    }

    @Nullable
    Object enableRing(@Nullable Context context, @Nullable HMBaseDevice hMBaseDevice, boolean z, boolean z2, @NotNull Continuation<? super Unit> continuation);

    @Nullable
    Object onDeviceDisconnect(@Nullable Context context, @NotNull Continuation<? super Unit> continuation);

    @Nullable
    Object startFindPhone(@NotNull Context context, boolean z, @Nullable HMBaseDevice hMBaseDevice, @NotNull Continuation<? super Unit> continuation);

    @Nullable
    Object stopFindPhone(@Nullable Context context, boolean z, @Nullable HMBaseDevice hMBaseDevice, @NotNull Continuation<? super Unit> continuation);
}
