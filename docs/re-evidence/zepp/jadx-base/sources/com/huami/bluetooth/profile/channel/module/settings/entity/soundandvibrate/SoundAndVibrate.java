package com.huami.bluetooth.profile.channel.module.settings.entity.soundandvibrate;

import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.bluetooth.profile.channel.module.settings.SettingsGroupType;
import com.huami.bluetooth.profile.channel.module.settings.entity.soundandvibrate.v1.SoundAndVibrateV1;
import com.huami.bluetooth.profile.channel.module.settings.entity.soundandvibrate.v2.SoundAndVibrateV2;
import com.huami.bluetooth.profile.channel.module.settings.primarydata.Settings;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\b&\u0018\u0000 \u00102\u00020\u0001:\u0001\u0010B\u0007¢\u0006\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0007\u001a\u00020\u00028\u0016@\u0016X\u0096D¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001c\u0010\r\u001a\u00020\b8\u0016@\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f¨\u0006\u0011"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/settings/entity/soundandvibrate/SoundAndVibrate;", "Lcom/huami/bluetooth/profile/channel/module/settings/primarydata/Settings;", "", "c", "Ljava/lang/String;", "getSettingsGroupName", "()Ljava/lang/String;", "settingsGroupName", "Lcom/huami/bluetooth/profile/channel/module/settings/SettingsGroupType;", GoogleApiAvailabilityLight.a, "Lcom/huami/bluetooth/profile/channel/module/settings/SettingsGroupType;", "getGroupType", "()Lcom/huami/bluetooth/profile/channel/module/settings/SettingsGroupType;", "groupType", "<init>", "()V", "Companion", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public abstract class SoundAndVibrate extends Settings {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final String settingsGroupName = "SoundAndVibrate";

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private final SettingsGroupType groupType = SettingsGroupType.SOUND_AND_VIBRATION;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¨\u0006\b"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/settings/entity/soundandvibrate/SoundAndVibrate$Companion;", "", "", "version", "Lcom/huami/bluetooth/profile/channel/module/settings/entity/soundandvibrate/SoundAndVibrate;", "createSoundAndVibrateByGroupVersion", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final SoundAndVibrate createSoundAndVibrateByGroupVersion(int version) {
            if (version == 1) {
                return new SoundAndVibrateV1();
            }
            if (version == 2) {
                return new SoundAndVibrateV2();
            }
            throw new IllegalArgumentException("SoundAndVibrate version" + version + " not support!");
        }
    }

    @Override // com.huami.bluetooth.profile.channel.module.settings.primarydata.Settings
    @NotNull
    public SettingsGroupType getGroupType() {
        return this.groupType;
    }

    @Override // com.huami.bluetooth.profile.channel.module.settings.primarydata.Settings
    @NotNull
    public String getSettingsGroupName() {
        return this.settingsGroupName;
    }
}
