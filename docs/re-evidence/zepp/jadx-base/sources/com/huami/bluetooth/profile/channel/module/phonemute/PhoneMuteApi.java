package com.huami.bluetooth.profile.channel.module.phonemute;

import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.xiaomi.hm.health.bt.device.HMCallback;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u001e\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004H&J\u0016\u0010\b\u001a\u00020\u00062\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004H&J\u0010\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH&J\u0010\u0010\f\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH&¨\u0006\r"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/phonemute/PhoneMuteApi;", "", "", "isMute", "Lcom/xiaomi/hm/health/bt/device/HMCallback;", "callback", "", "phoneMute", "phoneMutePermissionMiss", "Lcom/huami/bluetooth/profile/channel/module/phonemute/PhoneMuteListener;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "registerPhoneMuteListener", "unregisterPhoneMuteListener", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public interface PhoneMuteApi {
    void phoneMute(boolean isMute, @NotNull HMCallback<Boolean> callback);

    void phoneMutePermissionMiss(@NotNull HMCallback<Boolean> callback);

    void registerPhoneMuteListener(@NotNull PhoneMuteListener listener);

    void unregisterPhoneMuteListener(@NotNull PhoneMuteListener listener);
}
