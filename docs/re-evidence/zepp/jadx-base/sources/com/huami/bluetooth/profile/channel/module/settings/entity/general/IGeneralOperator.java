package com.huami.bluetooth.profile.channel.module.settings.entity.general;

import com.huami.bluetooth.profile.channel.module.settings.DeviceNotSupportStartDeviceException;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\b\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H&J\u0011\u0010\u0005\u001a\u0004\u0018\u00010\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H&J\u0011\u0010\b\u001a\u0004\u0018\u00010\u0002H&¢\u0006\u0004\b\b\u0010\u0006J\b\u0010\t\u001a\u00020\u0002H&¨\u0006\n"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/settings/entity/general/IGeneralOperator;", "", "", "enable", "setInComingCallDisplayContacts", "readInComingCallDisplayContacts", "()Ljava/lang/Boolean;", "setSmsDisplayContacts", "readSmsDisplayContacts", "startDevice", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public interface IGeneralOperator {
    @Nullable
    Boolean readInComingCallDisplayContacts();

    @Nullable
    Boolean readSmsDisplayContacts();

    boolean setInComingCallDisplayContacts(boolean enable);

    boolean setSmsDisplayContacts(boolean enable);

    boolean startDevice() throws DeviceNotSupportStartDeviceException;
}
