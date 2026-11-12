package com.huami.bluetooth.profile.channel.module.settings.entity.connection;

import com.huami.bluetooth.profile.channel.module.settings.SettingsParserKt;
import com.huami.bluetooth.profile.channel.module.settings.entity.IParser;
import com.huami.bluetooth.profile.channel.module.settings.primarydata.BooleanData;
import com.huami.bluetooth.profile.channel.module.settings.primarydata.IPrimaryData;
import com.huami.bluetooth.profile.channel.module.settings.utils.ByteBufferExtendsKt;
import com.xiaomi.hm.health.bt.debug.Debug;
import java.nio.ByteBuffer;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\nB\u0007¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\u0007\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¨\u0006\u000b"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/settings/entity/connection/ConnectionParser;", "Lcom/huami/bluetooth/profile/channel/module/settings/entity/IParser;", "Lcom/huami/bluetooth/profile/channel/module/settings/entity/connection/Connection;", "Ljava/nio/ByteBuffer;", "byteBuffer", "", "groupVersion", "parse", "<init>", "()V", "Companion", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public final class ConnectionParser implements IParser<Connection> {

    @NotNull
    private static final String a = "ConnectionParser";

    @Override // com.huami.bluetooth.profile.channel.module.settings.entity.IParser
    @Nullable
    public IPrimaryData parseUnSupport(@NotNull ByteBuffer byteBuffer, boolean z, int i) {
        return IParser.DefaultImpls.parseUnSupport(this, byteBuffer, z, i);
    }

    @Override // com.huami.bluetooth.profile.channel.module.settings.entity.IParser
    @Nullable
    public Connection parse(@NotNull ByteBuffer byteBuffer, int groupVersion) {
        Connection connection = new Connection();
        connection.setGroupVersion(groupVersion);
        boolean z = ByteBufferExtendsKt.getBoolean(byteBuffer);
        byte b = byteBuffer.get();
        if (b > 0) {
            int i = 0;
            do {
                i++;
                byte b2 = byteBuffer.get();
                Connection.Companion companion = Connection.INSTANCE;
                if (b2 == companion.getKEY_MULTI_LINK_SWITCH()) {
                    BooleanData booleanDataCheckAndGetBoolean = SettingsParserKt.checkAndGetBoolean(byteBuffer, "multiLinkSwitch");
                    if (booleanDataCheckAndGetBoolean == null) {
                        return null;
                    }
                    connection.setMultiLinkSwitch(Boolean.valueOf(booleanDataCheckAndGetBoolean.getValue()));
                } else if (b2 == companion.getKEY_CONNECTED_ADV_SWITCH()) {
                    BooleanData booleanDataCheckAndGetBoolean2 = SettingsParserKt.checkAndGetBoolean(byteBuffer, "connectedAdvSwitch");
                    if (booleanDataCheckAndGetBoolean2 == null) {
                        return null;
                    }
                    connection.setConnectedAdvSwitch(Boolean.valueOf(booleanDataCheckAndGetBoolean2.getValue()));
                } else if (b2 == companion.getKEY_RESTRICTED_BINDING_SWITCH()) {
                    BooleanData booleanDataCheckAndGetBoolean3 = SettingsParserKt.checkAndGetBoolean(byteBuffer, "restrictedBindingSwitch");
                    if (booleanDataCheckAndGetBoolean3 == null) {
                        return null;
                    }
                    connection.setRestrictedBindingSwitch(Boolean.valueOf(booleanDataCheckAndGetBoolean3.getValue()));
                } else if (b2 == companion.getKEY_HID_SWITCH()) {
                    BooleanData booleanDataCheckAndGetBoolean4 = SettingsParserKt.checkAndGetBoolean(byteBuffer, "hidSwitch");
                    if (booleanDataCheckAndGetBoolean4 == null) {
                        return null;
                    }
                    connection.setHidSwitch(Boolean.valueOf(booleanDataCheckAndGetBoolean4.getValue()));
                } else {
                    IPrimaryData unSupport = parseUnSupport(byteBuffer, z, b2);
                    Debug.fi(a, "[WARNING] parseConnection unknown key: " + ((int) b2) + ", position: " + byteBuffer.position() + ", parsed: " + unSupport);
                    if (unSupport == null) {
                        return null;
                    }
                }
            } while (i < b);
        }
        return connection;
    }
}
