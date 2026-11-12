package com.huami.bluetooth.profile.channel.module.settings.entity.language.v2;

import com.huami.account.UserLegalInfoManager;
import com.huami.bluetooth.profile.channel.module.settings.SettingsParserKt;
import com.huami.bluetooth.profile.channel.module.settings.entity.IParser;
import com.huami.bluetooth.profile.channel.module.settings.primarydata.BooleanData;
import com.huami.bluetooth.profile.channel.module.settings.primarydata.EnumData;
import com.huami.bluetooth.profile.channel.module.settings.primarydata.IPrimaryData;
import com.huami.bluetooth.profile.channel.module.settings.utils.ByteBufferExtendsKt;
import com.xiaomi.hm.health.bt.debug.Debug;
import java.nio.ByteBuffer;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\nB\u0007¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\u0007\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¨\u0006\u000b"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/settings/entity/language/v2/LanguageV2Parser;", "Lcom/huami/bluetooth/profile/channel/module/settings/entity/IParser;", "Lcom/huami/bluetooth/profile/channel/module/settings/entity/language/v2/SettingsLanguageV2;", "Ljava/nio/ByteBuffer;", "byteBuffer", "", "groupVersion", "parse", "<init>", "()V", "Companion", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public final class LanguageV2Parser implements IParser<SettingsLanguageV2> {

    @NotNull
    private static final String a = "LanguageV2Parser";

    @Override // com.huami.bluetooth.profile.channel.module.settings.entity.IParser
    @Nullable
    public IPrimaryData parseUnSupport(@NotNull ByteBuffer byteBuffer, boolean z, int i) {
        return IParser.DefaultImpls.parseUnSupport(this, byteBuffer, z, i);
    }

    @Override // com.huami.bluetooth.profile.channel.module.settings.entity.IParser
    @Nullable
    public SettingsLanguageV2 parse(@NotNull ByteBuffer byteBuffer, int groupVersion) {
        SettingsLanguageV2 settingsLanguageV2 = new SettingsLanguageV2();
        settingsLanguageV2.setGroupVersion(groupVersion);
        boolean z = ByteBufferExtendsKt.getBoolean(byteBuffer);
        int uInt8ToInt = ByteBufferExtendsKt.getUInt8ToInt(byteBuffer);
        if (uInt8ToInt > 0) {
            int i = 0;
            do {
                i++;
                byte b = byteBuffer.get();
                SettingsLanguageV2.Companion companion = SettingsLanguageV2.INSTANCE;
                if (b == companion.getKEY_LANGUAGE()) {
                    EnumData enumDataCheckAndGetEnum = SettingsParserKt.checkAndGetEnum(byteBuffer, UserLegalInfoManager.KEY_LANGUAGE, z);
                    if (enumDataCheckAndGetEnum == null) {
                        return null;
                    }
                    settingsLanguageV2.setLanguage(enumDataCheckAndGetEnum);
                } else if (b == companion.getKEY_LANGUAGE_FOLLOW_MOBILE_PHONE_SWITCH()) {
                    BooleanData booleanDataCheckAndGetBoolean = SettingsParserKt.checkAndGetBoolean(byteBuffer, "languageFollowMobilePhoneSwitch");
                    if (booleanDataCheckAndGetBoolean == null) {
                        return null;
                    }
                    settingsLanguageV2.setLanguageFollowMobilePhoneSwitch(Boolean.valueOf(booleanDataCheckAndGetBoolean.getValue()));
                } else {
                    IPrimaryData unSupport = parseUnSupport(byteBuffer, z, b);
                    Debug.fi(a, "[WARNING] parseLanguageV2 unknown key: " + ((int) b) + ", position: " + byteBuffer.position() + ", parsed: " + unSupport);
                    if (unSupport == null) {
                        return null;
                    }
                }
            } while (i < uInt8ToInt);
        }
        return settingsLanguageV2;
    }
}
