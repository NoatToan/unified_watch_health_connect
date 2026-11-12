package com.huami.bluetooth.profile.channel.module.settings.entity.language.v2;

import com.baidu.ocr.sdk.utils.LogUtil;
import com.huami.account.UserLegalInfoManager;
import com.huami.bluetooth.profile.channel.module.settings.entity.language.SettingsLanguage;
import com.huami.bluetooth.profile.channel.module.settings.primarydata.EnumData;
import java.io.Serializable;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\t\u0018\u0000 \u001d2\u00020\u00012\u00020\u0002:\u0001\u001dB\u0007¢\u0006\u0004\b\u001b\u0010\u001cJ\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0016R\"\u0010\r\u001a\u00020\u00038\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR(\u0010\u0014\u001a\u0004\u0018\u00010\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R(\u0010\u001a\u001a\u0004\u0018\u00010\u00152\b\u0010\u000f\u001a\u0004\u0018\u00010\u00158F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019¨\u0006\u001e"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/settings/entity/language/v2/SettingsLanguageV2;", "Lcom/huami/bluetooth/profile/channel/module/settings/entity/language/SettingsLanguage;", "Ljava/io/Serializable;", "", "key", "", "keyToString", "e", LogUtil.I, "getGroupVersion", "()I", "setGroupVersion", "(I)V", "groupVersion", "Lcom/huami/bluetooth/profile/channel/module/settings/primarydata/EnumData;", "value", "getLanguage", "()Lcom/huami/bluetooth/profile/channel/module/settings/primarydata/EnumData;", "setLanguage", "(Lcom/huami/bluetooth/profile/channel/module/settings/primarydata/EnumData;)V", UserLegalInfoManager.KEY_LANGUAGE, "", "getLanguageFollowMobilePhoneSwitch", "()Ljava/lang/Boolean;", "setLanguageFollowMobilePhoneSwitch", "(Ljava/lang/Boolean;)V", "languageFollowMobilePhoneSwitch", "<init>", "()V", "Companion", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public final class SettingsLanguageV2 extends SettingsLanguage implements Serializable {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    public static final int GROUP_VERSION = 2;

    @NotNull
    private static final HashMap<Integer, String> f;
    private static final int g;
    private static final int h;
    private static final long serialVersionUID = 1;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private int groupVersion = 2;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\t\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0014\u0010\u0015R5\u0010\u0006\u001a\u001e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002j\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004`\u00058\u0006@\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u0019\u0010\n\u001a\u00020\u00038\u0006@\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u0019\u0010\u000e\u001a\u00020\u00038\u0006@\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000b\u001a\u0004\b\u000f\u0010\rR\u0016\u0010\u0010\u001a\u00020\u00038\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0010\u0010\u000bR\u0016\u0010\u0012\u001a\u00020\u00118\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0016"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/settings/entity/language/v2/SettingsLanguageV2$Companion;", "", "Ljava/util/HashMap;", "", "", "Lkotlin/collections/HashMap;", "hashMap", "Ljava/util/HashMap;", "getHashMap", "()Ljava/util/HashMap;", "KEY_LANGUAGE", LogUtil.I, "getKEY_LANGUAGE", "()I", "KEY_LANGUAGE_FOLLOW_MOBILE_PHONE_SWITCH", "getKEY_LANGUAGE_FOLLOW_MOBILE_PHONE_SWITCH", "GROUP_VERSION", "", "serialVersionUID", "J", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final HashMap<Integer, String> getHashMap() {
            return SettingsLanguageV2.f;
        }

        public final int getKEY_LANGUAGE() {
            return SettingsLanguageV2.g;
        }

        public final int getKEY_LANGUAGE_FOLLOW_MOBILE_PHONE_SWITCH() {
            return SettingsLanguageV2.h;
        }
    }

    static {
        HashMap<Integer, String> map = new HashMap<>();
        f = map;
        map.put(1, "语言");
        g = 1;
        map.put(2, "语言跟随手机");
        h = 2;
    }

    @Override // com.huami.bluetooth.profile.channel.module.settings.primarydata.Settings
    public int getGroupVersion() {
        return this.groupVersion;
    }

    @Nullable
    public final EnumData getLanguage() {
        return getEnum(g);
    }

    @Nullable
    public final Boolean getLanguageFollowMobilePhoneSwitch() {
        return getBoolean(h);
    }

    @Override // com.huami.bluetooth.profile.channel.module.settings.primarydata.Settings
    @Nullable
    public String keyToString(int key) {
        return f.get(Integer.valueOf(key));
    }

    @Override // com.huami.bluetooth.profile.channel.module.settings.primarydata.Settings
    public void setGroupVersion(int i) {
        this.groupVersion = i;
    }

    public final void setLanguage(@Nullable EnumData enumData) {
        setEnum(enumData, g);
    }

    public final void setLanguageFollowMobilePhoneSwitch(@Nullable Boolean bool) {
        setBoolean(bool, h);
    }
}
