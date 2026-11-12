package com.huami.bluetooth.profile.channel.module.settings.entity.offlinevoice.v1;

import com.huami.bluetooth.profile.channel.module.settings.SettingsParserKt;
import com.huami.bluetooth.profile.channel.module.settings.entity.IParser;
import com.huami.bluetooth.profile.channel.module.settings.primarydata.BooleanData;
import com.huami.bluetooth.profile.channel.module.settings.primarydata.IPrimaryData;
import com.huami.bluetooth.profile.channel.module.settings.utils.ByteBufferExtendsKt;
import com.xiaomi.hm.health.bt.debug.Debug;
import java.nio.ByteBuffer;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\nB\u0007¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\u0007\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¨\u0006\u000b"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/settings/entity/offlinevoice/v1/OfflineVoiceV1Parser;", "Lcom/huami/bluetooth/profile/channel/module/settings/entity/IParser;", "Lcom/huami/bluetooth/profile/channel/module/settings/entity/offlinevoice/v1/OfflineVoiceV1;", "Ljava/nio/ByteBuffer;", "byteBuffer", "", "groupVersion", "parse", "<init>", "()V", "a", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public final class OfflineVoiceV1Parser implements IParser<OfflineVoiceV1> {

    @Deprecated
    @NotNull
    public static final String TAG = "OfflineVoiceV1Parser";

    @NotNull
    private static final a a = new a(null);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0016\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"com/huami/bluetooth/profile/channel/module/settings/entity/offlinevoice/v1/OfflineVoiceV1Parser$a", "", "", "TAG", "Ljava/lang/String;", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Override // com.huami.bluetooth.profile.channel.module.settings.entity.IParser
    @Nullable
    public IPrimaryData parseUnSupport(@NotNull ByteBuffer byteBuffer, boolean z, int i) {
        return IParser.DefaultImpls.parseUnSupport(this, byteBuffer, z, i);
    }

    @Override // com.huami.bluetooth.profile.channel.module.settings.entity.IParser
    @Nullable
    public OfflineVoiceV1 parse(@NotNull ByteBuffer byteBuffer, int groupVersion) {
        OfflineVoiceV1 offlineVoiceV1 = new OfflineVoiceV1();
        offlineVoiceV1.setGroupVersion(groupVersion);
        boolean z = ByteBufferExtendsKt.getBoolean(byteBuffer);
        int uInt8ToInt = ByteBufferExtendsKt.getUInt8ToInt(byteBuffer);
        if (uInt8ToInt > 0) {
            int i = 0;
            do {
                i++;
                byte b = byteBuffer.get();
                OfflineVoiceV1.Companion companion = OfflineVoiceV1.INSTANCE;
                if (b == companion.getKEY_ACTIVE_WITH_IN_5S_BY_TURNING_WRIST_SWITCH()) {
                    BooleanData booleanDataCheckAndGetBoolean = SettingsParserKt.checkAndGetBoolean(byteBuffer, "activeWithIn5SByTurningWristSwitch");
                    if (booleanDataCheckAndGetBoolean == null) {
                        return null;
                    }
                    offlineVoiceV1.setActiveWithIn5SByTurningWristSwitch(Boolean.valueOf(booleanDataCheckAndGetBoolean.getValue()));
                } else if (b == companion.getKEY_ACTIVE_WITH_IN_5S_WHEN_SCREEN_ON_SWITCH()) {
                    BooleanData booleanDataCheckAndGetBoolean2 = SettingsParserKt.checkAndGetBoolean(byteBuffer, "activeWithIn5SWhenScreenOnSwitch");
                    if (booleanDataCheckAndGetBoolean2 == null) {
                        return null;
                    }
                    offlineVoiceV1.setActiveWithIn5SWhenScreenOnSwitch(Boolean.valueOf(booleanDataCheckAndGetBoolean2.getValue()));
                } else if (b == companion.getKEY_ACTIVE_DURING_SCREEN_ON_SWITCH()) {
                    BooleanData booleanDataCheckAndGetBoolean3 = SettingsParserKt.checkAndGetBoolean(byteBuffer, "activeDuringScreenOnSwitch");
                    if (booleanDataCheckAndGetBoolean3 == null) {
                        return null;
                    }
                    offlineVoiceV1.setActiveDuringScreenOnSwitch(Boolean.valueOf(booleanDataCheckAndGetBoolean3.getValue()));
                } else {
                    IPrimaryData unSupport = parseUnSupport(byteBuffer, z, b);
                    Debug.fi(TAG, "[WARNING] parseOfflineVoiceV1 unknown key: " + ((int) b) + ", position: " + byteBuffer.position() + ", parsed: " + unSupport);
                    if (unSupport == null) {
                        return null;
                    }
                }
            } while (i < uInt8ToInt);
        }
        return offlineVoiceV1;
    }
}
