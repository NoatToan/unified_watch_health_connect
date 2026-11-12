package com.huami.bluetooth.profile.channel.module.obsolete;

import com.tekartik.sqflite.Constant;
import com.xiaomi.hm.health.bt.profile.base.HMNotifyResponse;
import com.xiaomi.hm.health.bt.profile.generic.HMGenericCommand;
import com.xiaomi.hm.health.bt.profile.generic.HMGenericResponse;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u001a\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&J\u0018\u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u0004H&J\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\r\u001a\u00020\fH&J\u0010\u0010\u0010\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u0002H&¨\u0006\u0011"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/obsolete/ObsoleteApi;", "", "", Constant.h, "", "cmdLen", "Lcom/xiaomi/hm/health/bt/profile/base/HMNotifyResponse;", "sendECFCommand", "data", "type", "", "sendPieceData", "Lcom/xiaomi/hm/health/bt/profile/generic/HMGenericCommand;", "command", "Lcom/xiaomi/hm/health/bt/profile/generic/HMGenericResponse;", "sendGenericCommand", "sendIASCommand", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public interface ObsoleteApi {
    @Nullable
    HMNotifyResponse sendECFCommand(@NotNull byte[] cmd, int cmdLen);

    @Nullable
    HMGenericResponse sendGenericCommand(@NotNull HMGenericCommand command);

    boolean sendIASCommand(@NotNull byte[] command);

    boolean sendPieceData(@NotNull byte[] data, int type);
}
