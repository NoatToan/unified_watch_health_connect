package com.xiaomi.hm.health.device.setting.ui.subview;

import com.huami.bluetooth.profile.channel.module.settings.ChangeListener;
import com.huami.bluetooth.profile.channel.module.settings.SettingsGroupType;
import com.huami.bluetooth.profile.channel.module.settings.entity.offlinevoice.v2.OfflineVoiceV2;
import com.huami.bluetooth.profile.channel.module.settings.primarydata.EnumData;
import com.huami.bluetooth.profile.channel.module.settings.primarydata.Settings;
import com.huami.tools.log.HMLog;
import com.xiaomi.hm.health.device.setting.network.WatchSettingsManager;
import com.xiaomi.hm.health.device.setting.network.bean.OfflineVoice;
import com.xiaomi.hm.health.device.setting.network.bean.WatchSettings;
import com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.WatchSettingExtsKt;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 \u00192\u00020\u0001:\u0001\u0019B/\u0012&\u0010\u0012\u001a\"\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0004j\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0018\u0001`\u0007¢\u0006\u0004\b\u0017\u0010\u0018J6\u0010\n\u001a\u00020\t2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\"\u0010\b\u001a\u001e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004j\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006`\u0007H\u0002J\u0016\u0010\r\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u0001J,\u0010\u000e\u001a\u00020\t2\"\u0010\b\u001a\u001e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004j\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006`\u0007H\u0016R9\u0010\u0012\u001a\"\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0004j\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0018\u0001`\u00078\u0006@\u0006¢\u0006\f\n\u0004\b\n\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\"\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00010\u00138\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015¨\u0006\u001a"}, d2 = {"Lcom/xiaomi/hm/health/device/setting/ui/subview/WatchSettingsChangeListener;", "Lcom/huami/bluetooth/profile/channel/module/settings/ChangeListener;", "Lcom/huami/bluetooth/profile/channel/module/settings/entity/offlinevoice/v2/OfflineVoiceV2;", "offlineVoice", "Ljava/util/HashMap;", "Lcom/huami/bluetooth/profile/channel/module/settings/SettingsGroupType;", "Lcom/huami/bluetooth/profile/channel/module/settings/primarydata/Settings;", "Lkotlin/collections/HashMap;", "settings", "", "a", "groupType", "changeListener", "addListener", "onChange", "Ljava/util/HashMap;", "getCurrentSettings", "()Ljava/util/HashMap;", "currentSettings", "Ljava/util/concurrent/ConcurrentHashMap;", "b", "Ljava/util/concurrent/ConcurrentHashMap;", "settingsChangeListeners", "<init>", "(Ljava/util/HashMap;)V", "Companion", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public final class WatchSettingsChangeListener implements ChangeListener {

    @NotNull
    private static final String c = "WatchSettingsChangeListener";

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @Nullable
    private final HashMap<SettingsGroupType, Settings> currentSettings;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final ConcurrentHashMap<SettingsGroupType, ChangeListener> settingsChangeListeners = new ConcurrentHashMap<>();

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[SettingsGroupType.values().length];
            iArr[SettingsGroupType.OFFLINE_VOICE.ordinal()] = 1;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<String> {
        public static final a a = new a();

        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "settings null";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<String> {
        public static final b a = new b();

        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "device v2 null";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function0<String> {
        public static final c a = new c();

        public c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "v2 null";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n"}, d2 = {"Lcom/xiaomi/hm/health/device/setting/network/bean/WatchSettings;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class d extends Lambda implements Function1<WatchSettings, Unit> {
        public final /* synthetic */ boolean a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(boolean z) {
            super(1);
            this.a = z;
        }

        public final void a(@NotNull WatchSettings watchSettings) {
            OfflineVoice offlineVoice = watchSettings.getOfflineVoice();
            if (offlineVoice == null) {
                return;
            }
            offlineVoice.setActiveWithInFiveSecondsByTurningWristSwitch(Boolean.valueOf(this.a));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(WatchSettings watchSettings) {
            a(watchSettings);
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n"}, d2 = {"Lcom/xiaomi/hm/health/device/setting/network/bean/WatchSettings;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class e extends Lambda implements Function1<WatchSettings, Unit> {
        public final /* synthetic */ boolean a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(boolean z) {
            super(1);
            this.a = z;
        }

        public final void a(@NotNull WatchSettings watchSettings) {
            OfflineVoice offlineVoice = watchSettings.getOfflineVoice();
            if (offlineVoice == null) {
                return;
            }
            offlineVoice.setActiveWithInFiveSecondsWhenScreenOnSwitch(Boolean.valueOf(this.a));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(WatchSettings watchSettings) {
            a(watchSettings);
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n"}, d2 = {"Lcom/xiaomi/hm/health/device/setting/network/bean/WatchSettings;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class f extends Lambda implements Function1<WatchSettings, Unit> {
        public final /* synthetic */ boolean a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(boolean z) {
            super(1);
            this.a = z;
        }

        public final void a(@NotNull WatchSettings watchSettings) {
            OfflineVoice offlineVoice = watchSettings.getOfflineVoice();
            if (offlineVoice == null) {
                return;
            }
            offlineVoice.setActiveDuringScreenOnSwitch(Boolean.valueOf(this.a));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(WatchSettings watchSettings) {
            a(watchSettings);
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n"}, d2 = {"Lcom/xiaomi/hm/health/device/setting/network/bean/WatchSettings;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class g extends Lambda implements Function1<WatchSettings, Unit> {
        public final /* synthetic */ EnumData a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(EnumData enumData) {
            super(1);
            this.a = enumData;
        }

        public final void a(@NotNull WatchSettings watchSettings) {
            OfflineVoice offlineVoice = watchSettings.getOfflineVoice();
            if (offlineVoice == null) {
                return;
            }
            offlineVoice.setOfflineVoiceLanguage(Integer.valueOf(this.a.getValue()));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(WatchSettings watchSettings) {
            a(watchSettings);
            return Unit.INSTANCE;
        }
    }

    public WatchSettingsChangeListener(@Nullable HashMap<SettingsGroupType, Settings> map) {
        this.currentSettings = map;
    }

    private final void a(OfflineVoiceV2 offlineVoice, HashMap<SettingsGroupType, Settings> settings) {
        if (offlineVoice == null) {
            HMLog.error$default(c, null, null, b.a, 6, null);
            return;
        }
        HashMap<SettingsGroupType, Settings> map = this.currentSettings;
        Settings settings2 = map == null ? null : map.get(SettingsGroupType.OFFLINE_VOICE);
        OfflineVoiceV2 offlineVoiceV2 = settings2 instanceof OfflineVoiceV2 ? (OfflineVoiceV2) settings2 : null;
        if (offlineVoiceV2 == null) {
            HMLog.error$default(c, null, null, c.a, 6, null);
            return;
        }
        Boolean activeWithIn5SByTurningWristSwitch = offlineVoice.getActiveWithIn5SByTurningWristSwitch();
        if (activeWithIn5SByTurningWristSwitch != null) {
            boolean zBooleanValue = activeWithIn5SByTurningWristSwitch.booleanValue();
            offlineVoiceV2.setActiveWithIn5SByTurningWristSwitch(Boolean.valueOf(zBooleanValue));
            WatchSettingsManager.modify$default(WatchSettingExtsKt.getWatchSettingManager(), false, new d(zBooleanValue), 1, null);
        }
        Boolean activeWithIn5SWhenScreenOnSwitch = offlineVoice.getActiveWithIn5SWhenScreenOnSwitch();
        if (activeWithIn5SWhenScreenOnSwitch != null) {
            boolean zBooleanValue2 = activeWithIn5SWhenScreenOnSwitch.booleanValue();
            offlineVoiceV2.setActiveWithIn5SWhenScreenOnSwitch(Boolean.valueOf(zBooleanValue2));
            WatchSettingsManager.modify$default(WatchSettingExtsKt.getWatchSettingManager(), false, new e(zBooleanValue2), 1, null);
        }
        Boolean activeDuringScreenOnSwitch = offlineVoice.getActiveDuringScreenOnSwitch();
        if (activeDuringScreenOnSwitch != null) {
            boolean zBooleanValue3 = activeDuringScreenOnSwitch.booleanValue();
            offlineVoiceV2.setActiveDuringScreenOnSwitch(Boolean.valueOf(zBooleanValue3));
            WatchSettingsManager.modify$default(WatchSettingExtsKt.getWatchSettingManager(), false, new f(zBooleanValue3), 1, null);
        }
        EnumData language = offlineVoice.getLanguage();
        if (language != null) {
            EnumData language2 = offlineVoiceV2.getLanguage();
            if (language2 != null) {
                language2.setValue(language.getValue());
            }
            WatchSettingsManager.modify$default(WatchSettingExtsKt.getWatchSettingManager(), false, new g(language), 1, null);
        }
        ChangeListener changeListener = this.settingsChangeListeners.get(SettingsGroupType.OFFLINE_VOICE);
        if (changeListener == null) {
            return;
        }
        changeListener.onChange(settings);
    }

    public final void addListener(@NotNull SettingsGroupType groupType, @NotNull ChangeListener changeListener) {
        this.settingsChangeListeners.put(groupType, changeListener);
    }

    @Nullable
    public final HashMap<SettingsGroupType, Settings> getCurrentSettings() {
        return this.currentSettings;
    }

    @Override // com.huami.bluetooth.profile.channel.module.settings.ChangeListener
    public void onChange(@NotNull HashMap<SettingsGroupType, Settings> settings) {
        if (settings.isEmpty()) {
            HMLog.error$default(c, null, null, a.a, 6, null);
            return;
        }
        for (Map.Entry<SettingsGroupType, Settings> entry : settings.entrySet()) {
            if (WhenMappings.$EnumSwitchMapping$0[entry.getKey().ordinal()] == 1) {
                Settings value = entry.getValue();
                a(value instanceof OfflineVoiceV2 ? (OfflineVoiceV2) value : null, settings);
            }
        }
    }
}
