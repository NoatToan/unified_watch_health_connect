package com.huami.bluetooth.profile.channel.module.settings.entity.screenlock;

import com.huami.bluetooth.profile.channel.module.settings.SettingsParserKt;
import com.huami.bluetooth.profile.channel.module.settings.entity.IParser;
import com.huami.bluetooth.profile.channel.module.settings.primarydata.BooleanData;
import com.huami.bluetooth.profile.channel.module.settings.primarydata.IPrimaryData;
import com.huami.bluetooth.profile.channel.module.settings.primarydata.StringData;
import com.huami.bluetooth.profile.channel.module.settings.utils.ByteBufferExtendsKt;
import com.huami.sky.lib.constant.WebConstant;
import com.xiaomi.hm.health.bt.debug.Debug;
import java.nio.ByteBuffer;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\nB\u0007¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\u0007\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¨\u0006\u000b"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/settings/entity/screenlock/ScreenLockAndPasswordParser;", "Lcom/huami/bluetooth/profile/channel/module/settings/entity/IParser;", "Lcom/huami/bluetooth/profile/channel/module/settings/entity/screenlock/ScreenLockAndPassword;", "Ljava/nio/ByteBuffer;", "byteBuffer", "", "groupVersion", "parse", "<init>", "()V", "Companion", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public final class ScreenLockAndPasswordParser implements IParser<ScreenLockAndPassword> {

    @NotNull
    private static final String a = "ScreenLockAndPasswordParser";

    @Override // com.huami.bluetooth.profile.channel.module.settings.entity.IParser
    @Nullable
    public IPrimaryData parseUnSupport(@NotNull ByteBuffer byteBuffer, boolean z, int i) {
        return IParser.DefaultImpls.parseUnSupport(this, byteBuffer, z, i);
    }

    @Override // com.huami.bluetooth.profile.channel.module.settings.entity.IParser
    @Nullable
    public ScreenLockAndPassword parse(@NotNull ByteBuffer byteBuffer, int groupVersion) {
        ScreenLockAndPassword screenLockAndPassword = new ScreenLockAndPassword();
        screenLockAndPassword.setGroupVersion(groupVersion);
        boolean z = ByteBufferExtendsKt.getBoolean(byteBuffer);
        int uInt8ToInt = ByteBufferExtendsKt.getUInt8ToInt(byteBuffer);
        if (uInt8ToInt > 0) {
            int i = 0;
            do {
                i++;
                byte b = byteBuffer.get();
                ScreenLockAndPassword.Companion companion = ScreenLockAndPassword.INSTANCE;
                if (b == companion.getKEY_SWITCH()) {
                    BooleanData booleanDataCheckAndGetBoolean = SettingsParserKt.checkAndGetBoolean(byteBuffer, WebConstant.QueryParam.SWITCH);
                    if (booleanDataCheckAndGetBoolean == null) {
                        return null;
                    }
                    screenLockAndPassword.setSwitch(Boolean.valueOf(booleanDataCheckAndGetBoolean.getValue()));
                } else if (b == companion.getKEY_PASSWORD()) {
                    StringData stringDataCheckAndGetStringData = SettingsParserKt.checkAndGetStringData(byteBuffer, "password", z);
                    if (stringDataCheckAndGetStringData == null) {
                        return null;
                    }
                    screenLockAndPassword.setPassword(stringDataCheckAndGetStringData);
                } else {
                    IPrimaryData unSupport = parseUnSupport(byteBuffer, z, b);
                    Debug.fi(a, "[WARNING] parseScreenLockAndPassword unknown key: " + ((int) b) + ", position: " + byteBuffer.position() + ", parsed: " + unSupport);
                    if (unSupport == null) {
                        return null;
                    }
                }
            } while (i < uInt8ToInt);
        }
        return screenLockAndPassword;
    }
}
