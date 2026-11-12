package com.huami.bluetooth.profile.channel.module.settings;

import com.smarthome.core.modelconfig.PluginDeviceInfo;
import com.xiaomi.onetrack.api.c;
import com.xiaomi.wearable.hm.ChangeListenerImpl;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0005\n\u0002\b\u0015\b\u0086\u0001\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002:\u0001\u000bB\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\b\u0010\tR\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017¨\u0006\u0018"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/settings/SettingsGroupType;", "", "Ljava/io/Serializable;", "", "value", c.f13755a, "getValue", "()B", "<init>", "(Ljava/lang/String;IB)V", "Companion", PluginDeviceInfo.FMODEL, ChangeListenerImpl.SETTING_GROUP_TYPE_DEVICE_INFORMATION, ChangeListenerImpl.SETTING_GROUP_TYPE_DISPLAY, "NFC", ChangeListenerImpl.SETTING_GROUP_TYPE_SOUND_AND_VIBRATION, ChangeListenerImpl.SETTING_GROUP_TYPE_SCREEN_UNLOCK_AND_PASSWORD, ChangeListenerImpl.SETTING_GROUP_TYPE_WEARING, ChangeListenerImpl.SETTING_GROUP_TYPE_OFFLINE_VOICE, ChangeListenerImpl.SETTING_GROUP_TYPE_LANGUAGE, ChangeListenerImpl.SETTING_GROUP_TYPE_HEALTH, ChangeListenerImpl.SETTING_GROUP_TYPE_SPORT, ChangeListenerImpl.SETTING_GROUP_TYPE_GENERAL, ChangeListenerImpl.SETTING_GROUP_TYPE_CONNECTION, "bluetooth_release"}, k = 1, mv = {1, 7, 1})
public enum SettingsGroupType {
    DEVICE_INFORMATION((byte) 0),
    DISPLAY((byte) 1),
    NFC((byte) 2),
    SOUND_AND_VIBRATION((byte) 3),
    SCREEN_UNLOCK_AND_PASSWORD((byte) 4),
    WEARING((byte) 5),
    OFFLINE_VOICE((byte) 6),
    LANGUAGE((byte) 7),
    HEALTH((byte) 8),
    SPORT((byte) 9),
    GENERAL((byte) 10),
    CONNECTION((byte) 11);


    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private static final long serialVersionUID = 1;
    private final byte value;

    /* JADX INFO: renamed from: com.huami.bluetooth.profile.channel.module.settings.SettingsGroupType$a, reason: from kotlin metadata */
    @Metadata(bv = {}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0005\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\u000b"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/settings/SettingsGroupType$a;", "", "", "value", "Lcom/huami/bluetooth/profile/channel/module/settings/SettingsGroupType;", PluginDeviceInfo.FMODEL, "", "serialVersionUID", "J", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 7, 1})
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Nullable
        public final SettingsGroupType a(byte value) {
            for (SettingsGroupType settingsGroupType : SettingsGroupType.values()) {
                if (settingsGroupType.getValue() == value) {
                    return settingsGroupType;
                }
            }
            return null;
        }
    }

    SettingsGroupType(byte b2) {
        this.value = b2;
    }

    public final byte getValue() {
        return this.value;
    }
}
