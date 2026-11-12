package defpackage;

import com.huami.bluetooth.profile.channel.module.settings.SettingsGroupType;
import com.huami.bluetooth.profile.channel.module.settings.primarydata.Settings;
import com.smarthome.core.modelconfig.PluginDeviceInfo;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(bv = {}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\b&\u0018\u00002\u00020\u0001:\u0001\u000eB\u0007¢\u0006\u0004\b\f\u0010\rR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096D¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001a\u0010\b\u001a\u00020\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b¨\u0006\u000f"}, d2 = {"Lus;", "Lcom/huami/bluetooth/profile/channel/module/settings/primarydata/Settings;", "", "settingsGroupName", "Ljava/lang/String;", "getSettingsGroupName", "()Ljava/lang/String;", "Lcom/huami/bluetooth/profile/channel/module/settings/SettingsGroupType;", "groupType", "Lcom/huami/bluetooth/profile/channel/module/settings/SettingsGroupType;", "getGroupType", "()Lcom/huami/bluetooth/profile/channel/module/settings/SettingsGroupType;", "<init>", "()V", PluginDeviceInfo.FMODEL, "bluetooth_release"}, k = 1, mv = {1, 7, 1})
public abstract class us extends Settings {

    @NotNull
    public static final a v = new a(null);

    @NotNull
    public final String t = "SoundAndVibrate";

    @NotNull
    public final SettingsGroupType u = SettingsGroupType.SOUND_AND_VIBRATION;

    @Metadata(bv = {}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lus$a;", "", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 7, 1})
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Override // com.huami.bluetooth.profile.channel.module.settings.primarydata.Settings
    @NotNull
    /* JADX INFO: renamed from: getGroupType, reason: from getter */
    public SettingsGroupType getU() {
        return this.u;
    }

    @Override // com.huami.bluetooth.profile.channel.module.settings.primarydata.Settings
    @NotNull
    /* JADX INFO: renamed from: getSettingsGroupName, reason: from getter */
    public String getT() {
        return this.t;
    }
}
