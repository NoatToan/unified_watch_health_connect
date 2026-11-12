package com.huami.bluetooth.profile.channel.module.settings.entity.language;

import com.huami.bluetooth.profile.channel.module.settings.SettingsGroupType;
import com.huami.bluetooth.profile.channel.module.settings.entity.language.v2.SettingsLanguageV2;
import com.huami.bluetooth.profile.channel.module.settings.primarydata.EnumData;
import com.huami.bluetooth.profile.channel.module.settings.primarydata.Settings;
import com.smarthome.core.modelconfig.PluginDeviceInfo;
import defpackage.es;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\t\b&\u0018\u0000 \u000e2\u00020\u0001:\u0001\u000fB\u0007¢\u0006\u0004\b\f\u0010\rR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001a\u0010\b\u001a\u00020\u00078\u0016X\u0096D¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b¨\u0006\u0010"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/settings/entity/language/SettingsLanguage;", "Lcom/huami/bluetooth/profile/channel/module/settings/primarydata/Settings;", "Lcom/huami/bluetooth/profile/channel/module/settings/SettingsGroupType;", "groupType", "Lcom/huami/bluetooth/profile/channel/module/settings/SettingsGroupType;", "getGroupType", "()Lcom/huami/bluetooth/profile/channel/module/settings/SettingsGroupType;", "", "settingsGroupName", "Ljava/lang/String;", "getSettingsGroupName", "()Ljava/lang/String;", "<init>", "()V", "Companion", PluginDeviceInfo.FMODEL, "bluetooth_release"}, k = 1, mv = {1, 7, 1})
public abstract class SettingsLanguage extends Settings {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private final SettingsGroupType groupType = SettingsGroupType.LANGUAGE;

    @NotNull
    private final String settingsGroupName = "SettingsLanguage";

    /* JADX INFO: renamed from: com.huami.bluetooth.profile.channel.module.settings.entity.language.SettingsLanguage$a, reason: from kotlin metadata */
    @Metadata(bv = {}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0007¨\u0006\b"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/settings/entity/language/SettingsLanguage$a;", "", "Lcom/huami/bluetooth/profile/channel/module/settings/primarydata/Settings;", "settings", "Lcom/huami/bluetooth/profile/channel/module/settings/primarydata/EnumData;", PluginDeviceInfo.FMODEL, "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 7, 1})
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        @Nullable
        public final EnumData a(@Nullable Settings settings) {
            if (settings == null) {
                return null;
            }
            if (settings instanceof es) {
                return ((es) settings).getLanguage();
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
        return INSTANCE.a(settings);
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
