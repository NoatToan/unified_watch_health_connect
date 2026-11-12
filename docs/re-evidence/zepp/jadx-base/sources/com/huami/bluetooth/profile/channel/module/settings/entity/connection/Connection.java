package com.huami.bluetooth.profile.channel.module.settings.entity.connection;

import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.bluetooth.profile.channel.module.settings.SettingsGroupType;
import com.huami.bluetooth.profile.channel.module.settings.primarydata.Settings;
import java.io.Serializable;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0013\u0018\u0000 +2\u00020\u00012\u00020\u0002:\u0001+B\u0007¢\u0006\u0004\b)\u0010*J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0016R\u001c\u0010\u000b\u001a\u00020\u00058\u0016@\u0016X\u0096D¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nR\"\u0010\u0012\u001a\u00020\u00038\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0018\u001a\u00020\u00138\u0016@\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R(\u0010\u001f\u001a\u0004\u0018\u00010\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u00198F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR(\u0010\"\u001a\u0004\u0018\u00010\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u00198F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b \u0010\u001c\"\u0004\b!\u0010\u001eR(\u0010%\u001a\u0004\u0018\u00010\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u00198F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b#\u0010\u001c\"\u0004\b$\u0010\u001eR(\u0010(\u001a\u0004\u0018\u00010\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u00198F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b&\u0010\u001c\"\u0004\b'\u0010\u001e¨\u0006,"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/settings/entity/connection/Connection;", "Lcom/huami/bluetooth/profile/channel/module/settings/primarydata/Settings;", "Ljava/io/Serializable;", "", "key", "", "keyToString", "c", "Ljava/lang/String;", "getSettingsGroupName", "()Ljava/lang/String;", "settingsGroupName", GoogleApiAvailabilityLight.a, LogUtil.I, "getGroupVersion", "()I", "setGroupVersion", "(I)V", "groupVersion", "Lcom/huami/bluetooth/profile/channel/module/settings/SettingsGroupType;", "e", "Lcom/huami/bluetooth/profile/channel/module/settings/SettingsGroupType;", "getGroupType", "()Lcom/huami/bluetooth/profile/channel/module/settings/SettingsGroupType;", "groupType", "", "value", "getMultiLinkSwitch", "()Ljava/lang/Boolean;", "setMultiLinkSwitch", "(Ljava/lang/Boolean;)V", "multiLinkSwitch", "getConnectedAdvSwitch", "setConnectedAdvSwitch", "connectedAdvSwitch", "getRestrictedBindingSwitch", "setRestrictedBindingSwitch", "restrictedBindingSwitch", "getHidSwitch", "setHidSwitch", "hidSwitch", "<init>", "()V", "Companion", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public final class Connection extends Settings implements Serializable {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    public static final int GROUP_VERSION = 1;

    @NotNull
    private static final HashMap<Integer, String> f;
    private static final int g;
    private static final int h;
    private static final int i;
    private static final int j;
    private static final long serialVersionUID = 1;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final String settingsGroupName = "Connection";

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private int groupVersion = 1;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    private final SettingsGroupType groupType = SettingsGroupType.CONNECTION;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\t\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0018\u0010\u0019R5\u0010\u0006\u001a\u001e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002j\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004`\u00058\u0006@\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u0019\u0010\n\u001a\u00020\u00038\u0006@\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u0019\u0010\u000e\u001a\u00020\u00038\u0006@\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000b\u001a\u0004\b\u000f\u0010\rR\u0019\u0010\u0010\u001a\u00020\u00038\u0006@\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u000b\u001a\u0004\b\u0011\u0010\rR\u0019\u0010\u0012\u001a\u00020\u00038\u0006@\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u000b\u001a\u0004\b\u0013\u0010\rR\u0016\u0010\u0014\u001a\u00020\u00038\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0014\u0010\u000bR\u0016\u0010\u0016\u001a\u00020\u00158\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017¨\u0006\u001a"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/settings/entity/connection/Connection$Companion;", "", "Ljava/util/HashMap;", "", "", "Lkotlin/collections/HashMap;", "hashMap", "Ljava/util/HashMap;", "getHashMap", "()Ljava/util/HashMap;", "KEY_MULTI_LINK_SWITCH", LogUtil.I, "getKEY_MULTI_LINK_SWITCH", "()I", "KEY_CONNECTED_ADV_SWITCH", "getKEY_CONNECTED_ADV_SWITCH", "KEY_RESTRICTED_BINDING_SWITCH", "getKEY_RESTRICTED_BINDING_SWITCH", "KEY_HID_SWITCH", "getKEY_HID_SWITCH", "GROUP_VERSION", "", "serialVersionUID", "J", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final HashMap<Integer, String> getHashMap() {
            return Connection.f;
        }

        public final int getKEY_CONNECTED_ADV_SWITCH() {
            return Connection.h;
        }

        public final int getKEY_HID_SWITCH() {
            return Connection.j;
        }

        public final int getKEY_MULTI_LINK_SWITCH() {
            return Connection.g;
        }

        public final int getKEY_RESTRICTED_BINDING_SWITCH() {
            return Connection.i;
        }
    }

    static {
        HashMap<Integer, String> map = new HashMap<>();
        f = map;
        map.put(1, "多连接开关");
        g = 1;
        map.put(2, "连接中广播开关");
        h = 2;
        map.put(3, "限制绑定开关");
        i = 3;
        map.put(4, "HID连接开关");
        j = 4;
    }

    @Nullable
    public final Boolean getConnectedAdvSwitch() {
        return getBoolean(h);
    }

    @Override // com.huami.bluetooth.profile.channel.module.settings.primarydata.Settings
    @NotNull
    public SettingsGroupType getGroupType() {
        return this.groupType;
    }

    @Override // com.huami.bluetooth.profile.channel.module.settings.primarydata.Settings
    public int getGroupVersion() {
        return this.groupVersion;
    }

    @Nullable
    public final Boolean getHidSwitch() {
        return getBoolean(j);
    }

    @Nullable
    public final Boolean getMultiLinkSwitch() {
        return getBoolean(g);
    }

    @Nullable
    public final Boolean getRestrictedBindingSwitch() {
        return getBoolean(i);
    }

    @Override // com.huami.bluetooth.profile.channel.module.settings.primarydata.Settings
    @NotNull
    public String getSettingsGroupName() {
        return this.settingsGroupName;
    }

    @Override // com.huami.bluetooth.profile.channel.module.settings.primarydata.Settings
    @Nullable
    public String keyToString(int key) {
        return f.get(Integer.valueOf(key));
    }

    public final void setConnectedAdvSwitch(@Nullable Boolean bool) {
        setBoolean(bool, h);
    }

    @Override // com.huami.bluetooth.profile.channel.module.settings.primarydata.Settings
    public void setGroupVersion(int i2) {
        this.groupVersion = i2;
    }

    public final void setHidSwitch(@Nullable Boolean bool) {
        setBoolean(bool, j);
    }

    public final void setMultiLinkSwitch(@Nullable Boolean bool) {
        setBoolean(bool, g);
    }

    public final void setRestrictedBindingSwitch(@Nullable Boolean bool) {
        setBoolean(bool, i);
    }
}
