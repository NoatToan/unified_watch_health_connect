package com.huami.bluetooth.profile.channel.module.settings;

import com.huami.bluetooth.profile.Request;
import com.huami.bluetooth.profile.ecf.EcfController;
import com.tekartik.sqflite.Constant;
import com.xiaomi.hm.health.bt.profile.base.HMNotifyResponse;
import com.xiaomi.hm.health.bt.profile.generic.HMGenericCommand;
import com.xiaomi.hm.health.bt.profile.generic.HMGenericResponse;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&J\u001c\u0010\u0007\u001a\u0004\u0018\u00010\n2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0006\u0010\t\u001a\u00020\bH&J\u0014\u0010\u0007\u001a\u0004\u0018\u00010\n2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004H&J\n\u0010\f\u001a\u0004\u0018\u00010\u000bH&J\u001a\u0010\u000e\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\r\u001a\u00020\bH&J\u0014\u0010\u0012\u001a\u0004\u0018\u00010\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH&¨\u0006\u0013"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/settings/EcfCmdProvider;", "", "Lcom/huami/bluetooth/profile/Request$Command;", Constant.h, "", "data", "", "sendECFCommand", "", "cmdLen", "Lcom/xiaomi/hm/health/bt/profile/base/HMNotifyResponse;", "Lcom/huami/bluetooth/profile/ecf/EcfController;", "getEcfController", "profileType", "patchWriteEcf", "Lcom/xiaomi/hm/health/bt/profile/generic/HMGenericCommand;", "command", "Lcom/xiaomi/hm/health/bt/profile/generic/HMGenericResponse;", "sendGenericCommand", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public interface EcfCmdProvider {
    @Nullable
    EcfController getEcfController();

    boolean patchWriteEcf(@Nullable byte[] data, int profileType);

    @Nullable
    HMNotifyResponse sendECFCommand(@Nullable byte[] cmd);

    @Nullable
    HMNotifyResponse sendECFCommand(@Nullable byte[] cmd, int cmdLen);

    boolean sendECFCommand(@NotNull Request.Command cmd, @NotNull byte[] data);

    @Nullable
    HMGenericResponse sendGenericCommand(@Nullable HMGenericCommand command);
}
