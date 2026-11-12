package com.huami.bluetooth.profile.channel.module.settings.entity.language;

import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.bluetooth.profile.channel.module.settings.SettingsGroupType;
import com.huami.bluetooth.profile.channel.module.settings.entity.language.v1.SettingsLanguageV1;
import com.huami.bluetooth.profile.channel.module.settings.entity.language.v2.SettingsLanguageV2;
import com.huami.bluetooth.profile.channel.module.settings.primarydata.EnumData;
import com.huami.bluetooth.profile.channel.module.settings.primarydata.Settings;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\t\b&\u0018\u0000 \u00102\u00020\u0001:\u0001\u0010B\u0007¢\u0006\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0007\u001a\u00020\u00028\u0016@\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001c\u0010\r\u001a\u00020\b8\u0016@\u0016X\u0096D¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f¨\u0006\u0011"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/settings/entity/language/SettingsLanguage;", "Lcom/huami/bluetooth/profile/channel/module/settings/primarydata/Settings;", "Lcom/huami/bluetooth/profile/channel/module/settings/SettingsGroupType;", "c", "Lcom/huami/bluetooth/profile/channel/module/settings/SettingsGroupType;", "getGroupType", "()Lcom/huami/bluetooth/profile/channel/module/settings/SettingsGroupType;", "groupType", "", GoogleApiAvailabilityLight.a, "Ljava/lang/String;", "getSettingsGroupName", "()Ljava/lang/String;", "settingsGroupName", "<init>", "()V", "Companion", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public abstract class SettingsLanguage extends Settings {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final SettingsGroupType groupType = SettingsGroupType.LANGUAGE;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private final String settingsGroupName = "SettingsLanguage";

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u0014\u0010\t\u001a\u0004\u0018\u00010\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0007¨\u0006\f"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/settings/entity/language/SettingsLanguage$Companion;", "", "", "version", "Lcom/huami/bluetooth/profile/channel/module/settings/entity/language/SettingsLanguage;", "createSettingsLanguageByGroupVersion", "Lcom/huami/bluetooth/profile/channel/module/settings/primarydata/Settings;", "settings", "Lcom/huami/bluetooth/profile/channel/module/settings/primarydata/EnumData;", "getLanguageEnum", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final SettingsLanguage createSettingsLanguageByGroupVersion(int version) {
            if (version == 1) {
                return new SettingsLanguageV1();
            }
            if (version == 2) {
                return new SettingsLanguageV2();
            }
            throw new IllegalArgumentException("SettingsLanguage version" + version + " not support!");
        }

        @JvmStatic
        @Nullable
        public final EnumData getLanguageEnum(@Nullable Settings settings) {
            if (settings == null) {
                return null;
            }
            if (settings instanceof SettingsLanguageV1) {
                return ((SettingsLanguageV1) settings).getLanguage();
            }
            if (settings instanceof SettingsLanguageV2) {
                return ((SettingsLanguageV2) settings).getLanguage();
            }
            return null;
        }
    }

    @JvmStatic
    @Nullable
    public static final EnumData getLanguageEnum(@Nullable Settings settings) {
        return INSTANCE.getLanguageEnum(settings);
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
