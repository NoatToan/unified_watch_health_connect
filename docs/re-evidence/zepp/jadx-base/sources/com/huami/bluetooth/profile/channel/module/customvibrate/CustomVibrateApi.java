package com.huami.bluetooth.profile.channel.module.customvibrate;

import com.xiaomi.hm.health.bt.model.HMVibrateInfo;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0005\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&J\u0011\u0010\u0007\u001a\u0004\u0018\u00010\u0006H&¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/customvibrate/CustomVibrateApi;", "", "Lcom/xiaomi/hm/health/bt/model/HMVibrateInfo;", "vibrateInfo", "", "setCustomVibrate", "", "queryVersion", "()Ljava/lang/Byte;", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public interface CustomVibrateApi {
    @Nullable
    Byte queryVersion();

    boolean setCustomVibrate(@NotNull HMVibrateInfo vibrateInfo);
}
