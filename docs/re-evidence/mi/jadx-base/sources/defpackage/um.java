package defpackage;

import com.huami.bluetooth.profile.channel.module.settings.SettingsGroupType;
import com.huami.bluetooth.profile.channel.module.settings.SettingsModule;
import com.huami.bluetooth.profile.channel.module.settings.entity.general.General;
import com.huami.bluetooth.profile.channel.module.settings.primarydata.Settings;
import com.smarthome.core.modelconfig.PluginDeviceInfo;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(bv = {}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¨\u0006\b"}, d2 = {"Lum;", "", "Lne;", "hmMiLiProDevice", "", PluginDeviceInfo.FMODEL, "<init>", "()V", "btData_wearRelease"}, k = 1, mv = {1, 7, 1})
public final class um {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final um f35921a = new um();

    public final boolean a(@NotNull ne hmMiLiProDevice) {
        Intrinsics.checkNotNullParameter(hmMiLiProDevice, "hmMiLiProDevice");
        if (!hmMiLiProDevice.a(10)) {
            return false;
        }
        SettingsModule settingsModule = (SettingsModule) hmMiLiProDevice.y(SettingsModule.class);
        Settings settingsQueryFieldsSync = settingsModule != null ? settingsModule.queryFieldsSync(false, SettingsGroupType.GENERAL, CollectionsKt__CollectionsKt.arrayListOf(Integer.valueOf(General.INSTANCE.v()))) : null;
        General general = settingsQueryFieldsSync instanceof General ? (General) settingsQueryFieldsSync : null;
        return (general != null ? general.getNightMode() : null) != null;
    }
}
