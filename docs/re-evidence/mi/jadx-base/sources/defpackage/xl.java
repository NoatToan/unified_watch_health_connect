package defpackage;

import com.huami.bluetooth.profile.channel.module.amc.MusicControllerModule;
import com.smarthome.core.modelconfig.PluginDeviceInfo;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(bv = {}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002¨\u0006\b"}, d2 = {"Lxl;", "", "Lkd;", "device", "Lwl;", PluginDeviceInfo.FMODEL, "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 7, 1})
public final class xl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final xl f39223a = new xl();

    /* JADX WARN: Multi-variable type inference failed */
    @Nullable
    public final wl a(@NotNull kd device) {
        Intrinsics.checkNotNullParameter(device, "device");
        if (!device.F(MusicControllerModule.class)) {
            if (device instanceof wl) {
                return (wl) device;
            }
            return null;
        }
        MusicControllerModule musicControllerModule = (MusicControllerModule) device.y(MusicControllerModule.class);
        if (musicControllerModule == null) {
            return null;
        }
        return musicControllerModule.loadApi();
    }
}
