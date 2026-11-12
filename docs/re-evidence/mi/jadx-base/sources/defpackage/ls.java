package defpackage;

import com.huami.bluetooth.profile.channel.module.sleep.SleepData;
import com.smarthome.core.modelconfig.PluginDeviceInfo;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(bv = {}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\bf\u0018\u00002\u00020\u0001J\n\u0010\u0003\u001a\u0004\u0018\u00010\u0002H&J\n\u0010\u0005\u001a\u0004\u0018\u00010\u0004H&J\n\u0010\u0007\u001a\u0004\u0018\u00010\u0006H&J\u0010\u0010\u0005\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH&¨\u0006\u000b"}, d2 = {"Lls;", "", "Lyv;", "getVersion", "Ld5;", PluginDeviceInfo.FMODEL, "Lnx;", PluginDeviceInfo.FICONON, "Lcom/huami/bluetooth/profile/channel/module/sleep/SleepData;", "data", "", "bluetooth_release"}, k = 1, mv = {1, 7, 1})
public interface ls {
    @Nullable
    Config a();

    boolean a(@NotNull SleepData data);

    @Nullable
    WriteDataHistory c();

    @Nullable
    Version getVersion();
}
