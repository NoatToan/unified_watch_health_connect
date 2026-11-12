package com.huami.bluetooth.profile.channel.module.settings.entity.offlinevoice.v2;

import com.baidu.ocr.sdk.utils.LogUtil;
import com.huami.account.UserLegalInfoManager;
import com.huami.bluetooth.profile.channel.module.settings.entity.offlinevoice.OfflineVoice;
import com.huami.bluetooth.profile.channel.module.settings.primarydata.EnumData;
import java.io.Serializable;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 #2\u00020\u00012\u00020\u0002:\u0001#B\u0007¢\u0006\u0004\b!\u0010\"J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0016R\"\u0010\r\u001a\u00020\u00038\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR(\u0010\u0014\u001a\u0004\u0018\u00010\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R(\u0010\u0017\u001a\u0004\u0018\u00010\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0015\u0010\u0011\"\u0004\b\u0016\u0010\u0013R(\u0010\u001a\u001a\u0004\u0018\u00010\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0018\u0010\u0011\"\u0004\b\u0019\u0010\u0013R(\u0010 \u001a\u0004\u0018\u00010\u001b2\b\u0010\u000f\u001a\u0004\u0018\u00010\u001b8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001f¨\u0006$"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/settings/entity/offlinevoice/v2/OfflineVoiceV2;", "Lcom/huami/bluetooth/profile/channel/module/settings/entity/offlinevoice/OfflineVoice;", "Ljava/io/Serializable;", "", "key", "", "keyToString", "e", LogUtil.I, "getGroupVersion", "()I", "setGroupVersion", "(I)V", "groupVersion", "", "value", "getActiveWithIn5SByTurningWristSwitch", "()Ljava/lang/Boolean;", "setActiveWithIn5SByTurningWristSwitch", "(Ljava/lang/Boolean;)V", "activeWithIn5SByTurningWristSwitch", "getActiveWithIn5SWhenScreenOnSwitch", "setActiveWithIn5SWhenScreenOnSwitch", "activeWithIn5SWhenScreenOnSwitch", "getActiveDuringScreenOnSwitch", "setActiveDuringScreenOnSwitch", "activeDuringScreenOnSwitch", "Lcom/huami/bluetooth/profile/channel/module/settings/primarydata/EnumData;", "getLanguage", "()Lcom/huami/bluetooth/profile/channel/module/settings/primarydata/EnumData;", "setLanguage", "(Lcom/huami/bluetooth/profile/channel/module/settings/primarydata/EnumData;)V", UserLegalInfoManager.KEY_LANGUAGE, "<init>", "()V", "Companion", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public final class OfflineVoiceV2 extends OfflineVoice implements Serializable {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    public static final int GROUP_VERSION = 2;

    @NotNull
    private static final HashMap<Integer, String> f;
    private static final int g;
    private static final int h;
    private static final int i;
    private static final int j;
    private static final long serialVersionUID = 1;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private int groupVersion = 2;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\t\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0018\u0010\u0019R5\u0010\u0006\u001a\u001e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002j\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004`\u00058\u0006@\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u0019\u0010\n\u001a\u00020\u00038\u0006@\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u0019\u0010\u000e\u001a\u00020\u00038\u0006@\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000b\u001a\u0004\b\u000f\u0010\rR\u0019\u0010\u0010\u001a\u00020\u00038\u0006@\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u000b\u001a\u0004\b\u0011\u0010\rR\u0019\u0010\u0012\u001a\u00020\u00038\u0006@\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u000b\u001a\u0004\b\u0013\u0010\rR\u0016\u0010\u0014\u001a\u00020\u00038\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0014\u0010\u000bR\u0016\u0010\u0016\u001a\u00020\u00158\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017¨\u0006\u001a"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/settings/entity/offlinevoice/v2/OfflineVoiceV2$Companion;", "", "Ljava/util/HashMap;", "", "", "Lkotlin/collections/HashMap;", "hashMap", "Ljava/util/HashMap;", "getHashMap", "()Ljava/util/HashMap;", "KEY_ACTIVE_WITH_IN_5S_BY_TURNING_WRIST_SWITCH", LogUtil.I, "getKEY_ACTIVE_WITH_IN_5S_BY_TURNING_WRIST_SWITCH", "()I", "KEY_ACTIVE_WITH_IN_5S_WHEN_SCREEN_ON_SWITCH", "getKEY_ACTIVE_WITH_IN_5S_WHEN_SCREEN_ON_SWITCH", "KEY_ACTIVE_DURING_SCREEN_ON_SWITCH", "getKEY_ACTIVE_DURING_SCREEN_ON_SWITCH", "KEY_LANGUAGE", "getKEY_LANGUAGE", "GROUP_VERSION", "", "serialVersionUID", "J", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final HashMap<Integer, String> getHashMap() {
            return OfflineVoiceV2.f;
        }

        public final int getKEY_ACTIVE_DURING_SCREEN_ON_SWITCH() {
            return OfflineVoiceV2.i;
        }

        public final int getKEY_ACTIVE_WITH_IN_5S_BY_TURNING_WRIST_SWITCH() {
            return OfflineVoiceV2.g;
        }

        public final int getKEY_ACTIVE_WITH_IN_5S_WHEN_SCREEN_ON_SWITCH() {
            return OfflineVoiceV2.h;
        }

        public final int getKEY_LANGUAGE() {
            return OfflineVoiceV2.j;
        }
    }

    static {
        HashMap<Integer, String> map = new HashMap<>();
        f = map;
        map.put(1, "转腕后5s内响应开关");
        g = 1;
        map.put(2, "亮屏后5s内响应开关");
        h = 2;
        map.put(3, "亮屏期间响应开关");
        i = 3;
        map.put(4, "离线语音语言");
        j = 4;
    }

    @Nullable
    public final Boolean getActiveDuringScreenOnSwitch() {
        return getBoolean(i);
    }

    @Nullable
    public final Boolean getActiveWithIn5SByTurningWristSwitch() {
        return getBoolean(g);
    }

    @Nullable
    public final Boolean getActiveWithIn5SWhenScreenOnSwitch() {
        return getBoolean(h);
    }

    @Override // com.huami.bluetooth.profile.channel.module.settings.primarydata.Settings
    public int getGroupVersion() {
        return this.groupVersion;
    }

    @Nullable
    public final EnumData getLanguage() {
        return getEnum(j);
    }

    @Override // com.huami.bluetooth.profile.channel.module.settings.primarydata.Settings
    @Nullable
    public String keyToString(int key) {
        return f.get(Integer.valueOf(key));
    }

    public final void setActiveDuringScreenOnSwitch(@Nullable Boolean bool) {
        setBoolean(bool, i);
    }

    public final void setActiveWithIn5SByTurningWristSwitch(@Nullable Boolean bool) {
        setBoolean(bool, g);
    }

    public final void setActiveWithIn5SWhenScreenOnSwitch(@Nullable Boolean bool) {
        setBoolean(bool, h);
    }

    @Override // com.huami.bluetooth.profile.channel.module.settings.primarydata.Settings
    public void setGroupVersion(int i2) {
        this.groupVersion = i2;
    }

    public final void setLanguage(@Nullable EnumData enumData) {
        setEnum(enumData, j);
    }
}
