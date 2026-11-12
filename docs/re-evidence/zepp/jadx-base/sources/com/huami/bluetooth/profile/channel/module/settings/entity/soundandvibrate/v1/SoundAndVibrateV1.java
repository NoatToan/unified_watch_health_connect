package com.huami.bluetooth.profile.channel.module.settings.entity.soundandvibrate.v1;

import com.baidu.ocr.sdk.utils.LogUtil;
import com.huami.bluetooth.profile.channel.module.settings.entity.soundandvibrate.SoundAndVibrate;
import com.huami.bluetooth.profile.channel.module.settings.primarydata.EnumData;
import com.huami.bluetooth.profile.channel.module.settings.primarydata.IntData;
import java.io.Serializable;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0012\u0018\u0000 /2\u00020\u00012\u00020\u0002:\u0001/B\u0007¢\u0006\u0004\b-\u0010.J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0016R\"\u0010\r\u001a\u00020\u00038\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR(\u0010\u0014\u001a\u0004\u0018\u00010\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R(\u0010\u001a\u001a\u0004\u0018\u00010\u00152\b\u0010\u000f\u001a\u0004\u0018\u00010\u00158F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R(\u0010\u001d\u001a\u0004\u0018\u00010\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u001b\u0010\u0011\"\u0004\b\u001c\u0010\u0013R(\u0010#\u001a\u0004\u0018\u00010\u001e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u001e8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R(\u0010&\u001a\u0004\u0018\u00010\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b$\u0010\u0011\"\u0004\b%\u0010\u0013R(\u0010)\u001a\u0004\u0018\u00010\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b'\u0010\u0011\"\u0004\b(\u0010\u0013R(\u0010,\u001a\u0004\u0018\u00010\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b*\u0010\u0011\"\u0004\b+\u0010\u0013¨\u00060"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/settings/entity/soundandvibrate/v1/SoundAndVibrateV1;", "Lcom/huami/bluetooth/profile/channel/module/settings/entity/soundandvibrate/SoundAndVibrate;", "Ljava/io/Serializable;", "", "key", "", "keyToString", "e", LogUtil.I, "getGroupVersion", "()I", "setGroupVersion", "(I)V", "groupVersion", "", "value", "getMuteSwitch", "()Ljava/lang/Boolean;", "setMuteSwitch", "(Ljava/lang/Boolean;)V", "muteSwitch", "Lcom/huami/bluetooth/profile/channel/module/settings/primarydata/IntData;", "getVolume", "()Lcom/huami/bluetooth/profile/channel/module/settings/primarydata/IntData;", "setVolume", "(Lcom/huami/bluetooth/profile/channel/module/settings/primarydata/IntData;)V", "volume", "getNotificationVibrationSwitch", "setNotificationVibrationSwitch", "notificationVibrationSwitch", "Lcom/huami/bluetooth/profile/channel/module/settings/primarydata/EnumData;", "getNotificationVibrationStrength", "()Lcom/huami/bluetooth/profile/channel/module/settings/primarydata/EnumData;", "setNotificationVibrationStrength", "(Lcom/huami/bluetooth/profile/channel/module/settings/primarydata/EnumData;)V", "notificationVibrationStrength", "getSystemVibrationSwitch", "setSystemVibrationSwitch", "systemVibrationSwitch", "getCrownVibrationSwitch", "setCrownVibrationSwitch", "crownVibrationSwitch", "getRemindSwitch", "setRemindSwitch", "remindSwitch", "<init>", "()V", "Companion", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public final class SoundAndVibrateV1 extends SoundAndVibrate implements Serializable {

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
    private static final int k;
    private static final int l;
    private static final int m;
    private static final long serialVersionUID = 1;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private int groupVersion = 1;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\t\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u001e\u0010\u001fR5\u0010\u0006\u001a\u001e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002j\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004`\u00058\u0006@\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u0019\u0010\n\u001a\u00020\u00038\u0006@\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u0019\u0010\u000e\u001a\u00020\u00038\u0006@\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000b\u001a\u0004\b\u000f\u0010\rR\u0019\u0010\u0010\u001a\u00020\u00038\u0006@\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u000b\u001a\u0004\b\u0011\u0010\rR\u0019\u0010\u0012\u001a\u00020\u00038\u0006@\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u000b\u001a\u0004\b\u0013\u0010\rR\u0019\u0010\u0014\u001a\u00020\u00038\u0006@\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u000b\u001a\u0004\b\u0015\u0010\rR\u0019\u0010\u0016\u001a\u00020\u00038\u0006@\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u000b\u001a\u0004\b\u0017\u0010\rR\u0019\u0010\u0018\u001a\u00020\u00038\u0006@\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u000b\u001a\u0004\b\u0019\u0010\rR\u0016\u0010\u001a\u001a\u00020\u00038\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001a\u0010\u000bR\u0016\u0010\u001c\u001a\u00020\u001b8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001c\u0010\u001d¨\u0006 "}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/settings/entity/soundandvibrate/v1/SoundAndVibrateV1$Companion;", "", "Ljava/util/HashMap;", "", "", "Lkotlin/collections/HashMap;", "hashMap", "Ljava/util/HashMap;", "getHashMap", "()Ljava/util/HashMap;", "KEY_MUTE_SWITCH", LogUtil.I, "getKEY_MUTE_SWITCH", "()I", "KEY_VOLUME", "getKEY_VOLUME", "KEY_NOTIFICATION_VIBRATION_SWITCH", "getKEY_NOTIFICATION_VIBRATION_SWITCH", "KEY_NOTIFICATION_VIBRATION_STRENGTH", "getKEY_NOTIFICATION_VIBRATION_STRENGTH", "KEY_SYSTEM_VIBRATION_SWITCH", "getKEY_SYSTEM_VIBRATION_SWITCH", "KEY_CROWN_VIBRATION_SWITCH", "getKEY_CROWN_VIBRATION_SWITCH", "KEY_REMIND_SWITCH", "getKEY_REMIND_SWITCH", "GROUP_VERSION", "", "serialVersionUID", "J", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final HashMap<Integer, String> getHashMap() {
            return SoundAndVibrateV1.f;
        }

        public final int getKEY_CROWN_VIBRATION_SWITCH() {
            return SoundAndVibrateV1.l;
        }

        public final int getKEY_MUTE_SWITCH() {
            return SoundAndVibrateV1.g;
        }

        public final int getKEY_NOTIFICATION_VIBRATION_STRENGTH() {
            return SoundAndVibrateV1.j;
        }

        public final int getKEY_NOTIFICATION_VIBRATION_SWITCH() {
            return SoundAndVibrateV1.i;
        }

        public final int getKEY_REMIND_SWITCH() {
            return SoundAndVibrateV1.m;
        }

        public final int getKEY_SYSTEM_VIBRATION_SWITCH() {
            return SoundAndVibrateV1.k;
        }

        public final int getKEY_VOLUME() {
            return SoundAndVibrateV1.h;
        }
    }

    static {
        HashMap<Integer, String> map = new HashMap<>();
        f = map;
        map.put(1, "静音开关");
        g = 1;
        map.put(2, "音量");
        h = 2;
        map.put(3, "通知振动开关");
        i = 3;
        map.put(4, "通知振动强度");
        j = 4;
        map.put(5, "系统振动开关");
        k = 5;
        map.put(6, "表冠振动开关");
        l = 6;
        map.put(7, "铃声提醒开关");
        m = 7;
    }

    @Nullable
    public final Boolean getCrownVibrationSwitch() {
        return getBoolean(l);
    }

    @Override // com.huami.bluetooth.profile.channel.module.settings.primarydata.Settings
    public int getGroupVersion() {
        return this.groupVersion;
    }

    @Nullable
    public final Boolean getMuteSwitch() {
        return getBoolean(g);
    }

    @Nullable
    public final EnumData getNotificationVibrationStrength() {
        return getEnum(j);
    }

    @Nullable
    public final Boolean getNotificationVibrationSwitch() {
        return getBoolean(i);
    }

    @Nullable
    public final Boolean getRemindSwitch() {
        return getBoolean(m);
    }

    @Nullable
    public final Boolean getSystemVibrationSwitch() {
        return getBoolean(k);
    }

    @Nullable
    public final IntData getVolume() {
        return getInt(h);
    }

    @Override // com.huami.bluetooth.profile.channel.module.settings.primarydata.Settings
    @Nullable
    public String keyToString(int key) {
        return f.get(Integer.valueOf(key));
    }

    public final void setCrownVibrationSwitch(@Nullable Boolean bool) {
        setBoolean(bool, l);
    }

    @Override // com.huami.bluetooth.profile.channel.module.settings.primarydata.Settings
    public void setGroupVersion(int i2) {
        this.groupVersion = i2;
    }

    public final void setMuteSwitch(@Nullable Boolean bool) {
        setBoolean(bool, g);
    }

    public final void setNotificationVibrationStrength(@Nullable EnumData enumData) {
        setEnum(enumData, j);
    }

    public final void setNotificationVibrationSwitch(@Nullable Boolean bool) {
        setBoolean(bool, i);
    }

    public final void setRemindSwitch(@Nullable Boolean bool) {
        setBoolean(bool, m);
    }

    public final void setSystemVibrationSwitch(@Nullable Boolean bool) {
        setBoolean(bool, k);
    }

    public final void setVolume(@Nullable IntData intData) {
        setInt(intData, h);
    }
}
