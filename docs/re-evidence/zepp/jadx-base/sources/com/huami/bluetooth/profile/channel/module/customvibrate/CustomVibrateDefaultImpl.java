package com.huami.bluetooth.profile.channel.module.customvibrate;

import com.huami.bluetooth.profile.channel.module.settings.EcfCmdProvider;
import com.xiaomi.hm.health.bt.debug.Debug;
import com.xiaomi.hm.health.bt.model.HMVibrateInfo;
import java.io.ByteArrayOutputStream;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
public class CustomVibrateDefaultImpl implements CustomVibrateApi {
    private static final String b = "CustomVibrateDefaultImpl";

    @Nullable
    private EcfCmdProvider a;

    public CustomVibrateDefaultImpl(@Nullable EcfCmdProvider ecfCmdProvider) {
        this.a = ecfCmdProvider;
    }

    @Override // com.huami.bluetooth.profile.channel.module.customvibrate.CustomVibrateApi
    @Nullable
    public Byte queryVersion() {
        Debug.fi(b, "queryVersion not support!");
        return null;
    }

    @Override // com.huami.bluetooth.profile.channel.module.customvibrate.CustomVibrateApi
    public boolean setCustomVibrate(@NotNull HMVibrateInfo vibrateInfo) {
        if (this.a == null) {
            return false;
        }
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            byteArrayOutputStream.write(32);
            byteArrayOutputStream.write(vibrateInfo.toBleBytes());
            boolean zPatchWriteEcf = this.a.patchWriteEcf(byteArrayOutputStream.toByteArray(), 2);
            Debug.fi(b, "setCustomVibrate: " + zPatchWriteEcf);
            return zPatchWriteEcf;
        } catch (Exception e) {
            Debug.fi(b, "setCustomVibrate: " + e.toString());
            return false;
        }
    }
}
