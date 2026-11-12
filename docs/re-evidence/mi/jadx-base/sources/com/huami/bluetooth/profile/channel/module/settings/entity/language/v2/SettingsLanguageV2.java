package com.huami.bluetooth.profile.channel.module.settings.entity.language.v2;

import com.huami.bluetooth.profile.channel.module.settings.entity.language.SettingsLanguage;
import com.huami.bluetooth.profile.channel.module.settings.primarydata.EnumData;
import com.smarthome.core.modelconfig.PluginDeviceInfo;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\n\u0018\u0000 \u001c2\u00020\u00012\u00020\u0002:\u0001\u001dB\u0007¢\u0006\u0004\b\u001a\u0010\u001bJ\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0016R\"\u0010\u0007\u001a\u00020\u00038\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR(\u0010\u0013\u001a\u0004\u0018\u00010\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\r8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R(\u0010\u0019\u001a\u0004\u0018\u00010\u00142\b\u0010\u000e\u001a\u0004\u0018\u00010\u00148F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018¨\u0006\u001e"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/settings/entity/language/v2/SettingsLanguageV2;", "Lcom/huami/bluetooth/profile/channel/module/settings/entity/language/SettingsLanguage;", "Ljava/io/Serializable;", "", "key", "", "keyToString", "groupVersion", "I", "getGroupVersion", "()I", "setGroupVersion", "(I)V", "Lcom/huami/bluetooth/profile/channel/module/settings/primarydata/EnumData;", "value", "getLanguage", "()Lcom/huami/bluetooth/profile/channel/module/settings/primarydata/EnumData;", "setLanguage", "(Lcom/huami/bluetooth/profile/channel/module/settings/primarydata/EnumData;)V", "language", "", "getLanguageFollowMobilePhoneSwitch", "()Ljava/lang/Boolean;", "setLanguageFollowMobilePhoneSwitch", "(Ljava/lang/Boolean;)V", "languageFollowMobilePhoneSwitch", "<init>", "()V", "Companion", PluginDeviceInfo.FMODEL, "bluetooth_release"}, k = 1, mv = {1, 7, 1})
public final class SettingsLanguageV2 extends SettingsLanguage {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    public static final int GROUP_VERSION = 2;
    private static final int KEY_LANGUAGE;
    private static final int KEY_LANGUAGE_FOLLOW_MOBILE_PHONE_SWITCH;

    @NotNull
    private static final HashMap<Integer, String> hashMap;
    private static final long serialVersionUID = 1;
    private int groupVersion = 2;

    /* JADX INFO: renamed from: com.huami.bluetooth.profile.channel.module.settings.entity.language.v2.SettingsLanguageV2$a, reason: from kotlin metadata */
    @Metadata(bv = {}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\t\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\r\u0010\u000eR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0004\u001a\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\u0004R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\u000f"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/settings/entity/language/v2/SettingsLanguageV2$a;", "", "", "KEY_LANGUAGE", "I", PluginDeviceInfo.FMODEL, "()I", "KEY_LANGUAGE_FOLLOW_MOBILE_PHONE_SWITCH", PluginDeviceInfo.FDESC, "GROUP_VERSION", "", "serialVersionUID", "J", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 7, 1})
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final int a() {
            return SettingsLanguageV2.KEY_LANGUAGE;
        }

        public final int b() {
            return SettingsLanguageV2.KEY_LANGUAGE_FOLLOW_MOBILE_PHONE_SWITCH;
        }
    }

    static {
        HashMap<Integer, String> map = new HashMap<>();
        hashMap = map;
        map.put(1, "语言");
        KEY_LANGUAGE = 1;
        map.put(2, "语言跟随手机");
        KEY_LANGUAGE_FOLLOW_MOBILE_PHONE_SWITCH = 2;
    }

    @Override // com.huami.bluetooth.profile.channel.module.settings.primarydata.Settings
    /* JADX INFO: renamed from: getGroupVersion, reason: from getter */
    public int getT() {
        return this.groupVersion;
    }

    @Nullable
    public final EnumData getLanguage() {
        return getEnum(KEY_LANGUAGE);
    }

    @Nullable
    public final Boolean getLanguageFollowMobilePhoneSwitch() {
        return getBoolean(KEY_LANGUAGE_FOLLOW_MOBILE_PHONE_SWITCH);
    }

    @Override // com.huami.bluetooth.profile.channel.module.settings.primarydata.Settings
    @Nullable
    public String keyToString(int key) {
        return hashMap.get(Integer.valueOf(key));
    }

    @Override // com.huami.bluetooth.profile.channel.module.settings.primarydata.Settings
    public void setGroupVersion(int i) {
        this.groupVersion = i;
    }

    public final void setLanguage(@Nullable EnumData enumData) {
        setEnum(enumData, KEY_LANGUAGE);
    }

    public final void setLanguageFollowMobilePhoneSwitch(@Nullable Boolean bool) {
        setBoolean(bool, KEY_LANGUAGE_FOLLOW_MOBILE_PHONE_SWITCH);
    }
}
