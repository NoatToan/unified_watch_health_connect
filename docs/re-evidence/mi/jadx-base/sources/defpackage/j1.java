package defpackage;

import com.huami.bluetooth.profile.channel.module.battery.BatteryModule;
import com.smarthome.core.modelconfig.PluginDeviceInfo;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(bv = {}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lj1;", "", PluginDeviceInfo.FMODEL, "bluetooth_release"}, k = 1, mv = {1, 7, 1})
public final class j1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final a f22316a = new a(null);

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\f"}, d2 = {"Lj1$a;", "", "Lyus;", "baseProfile", "Li1;", PluginDeviceInfo.FMODEL, "(Lyus;)Li1;", "", "VERSION_1", "I", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 7, 1})
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Nullable
        public final i1 a(@NotNull yus baseProfile) {
            Integer version;
            Intrinsics.checkNotNullParameter(baseProfile, "baseProfile");
            if (!baseProfile.q1(BatteryModule.class)) {
                return baseProfile;
            }
            BatteryModule batteryModule = (BatteryModule) baseProfile.i1(BatteryModule.class);
            if (batteryModule == null || (version = batteryModule.getVersion()) == null || version.intValue() != 1) {
                return null;
            }
            return new k1(batteryModule);
        }
    }
}
