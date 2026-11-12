package defpackage;

import com.huami.bluetooth.profile.channel.module.customvibrate.MotorVibrateModule;
import com.smarthome.core.modelconfig.PluginDeviceInfo;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(bv = {}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lt5;", "", PluginDeviceInfo.FMODEL, "bluetooth_release"}, k = 1, mv = {1, 7, 1})
public final class t5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final a f34318a = new a(null);

    @Metadata(bv = {}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¨\u0006\b"}, d2 = {"Lt5$a;", "", "Lkd;", "baseDevice", "Lr5;", PluginDeviceInfo.FMODEL, "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 7, 1})
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        @Nullable
        public final r5 a(@NotNull kd baseDevice) {
            Intrinsics.checkNotNullParameter(baseDevice, "baseDevice");
            if (baseDevice.F(MotorVibrateModule.class)) {
                return (r5) baseDevice.y(MotorVibrateModule.class);
            }
            ne neVar = baseDevice instanceof ne ? (ne) baseDevice : null;
            yus yusVarA4 = neVar != null ? neVar.A4() : null;
            return new get(yusVarA4 instanceof z8 ? (z8) yusVarA4 : null);
        }
    }

    @JvmStatic
    @Nullable
    public static final r5 a(@NotNull kd kdVar) {
        return f34318a.a(kdVar);
    }
}
