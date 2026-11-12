package defpackage;

import com.huami.bluetooth.profile.channel.module.amc.MusicControllerModule;
import com.smarthome.core.modelconfig.PluginDeviceInfo;
import com.xiaomi.hm.health.bt.profile.amc.HMMusicControl;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0001\u0005B\u000f\u0012\u0006\u0010\u0007\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0005\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0004J\u0019\u0010\u0005\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0005\u0010\t¨\u0006\r"}, d2 = {"Lvl;", "Luj;", "", PluginDeviceInfo.FDESC, "()V", PluginDeviceInfo.FMODEL, "Lkd;", "device", "Lwl;", "(Lkd;)Lwl;", "Ln1t;", "<init>", "(Ln1t;)V", "btData_wearRelease"}, k = 1, mv = {1, 7, 1})
public final class vl implements uj {

    @NotNull
    public static final a c = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final n1t f36990a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final c f36991b;

    @Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lvl$a;", "", "", "TAG", "Ljava/lang/String;", "<init>", "()V", "btData_wearRelease"}, k = 1, mv = {1, 7, 1})
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", PluginDeviceInfo.FMODEL, "()Ljava/lang/String;"}, k = 3, mv = {1, 7, 1})
    public static final class b extends Lambda implements Function0<String> {
        public static final b t = new b();

        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Device not support music";
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0006"}, d2 = {"vl$c", "Lzl;", "Lcom/xiaomi/hm/health/bt/profile/amc/HMMusicControl$DeviceCommand;", "cmd", "", PluginDeviceInfo.FMODEL, "btData_wearRelease"}, k = 1, mv = {1, 7, 1})
    public static final class c implements zl {
        public c() {
        }

        @Override // defpackage.zl
        public void a(@NotNull HMMusicControl.DeviceCommand cmd) {
            Intrinsics.checkNotNullParameter(cmd, "cmd");
            vl vlVar = vl.this;
            vlVar.a(vlVar.f36990a, ik.MUSIC_CONTROL, new byte[]{cmd.getValue()});
        }
    }

    public vl(@NotNull n1t device) {
        Intrinsics.checkNotNullParameter(device, "device");
        this.f36990a = device;
        this.f36991b = new c();
    }

    @Override // defpackage.uj
    public void b() {
        wl wlVarA;
        if (this.f36990a.F(MusicControllerModule.class) && (wlVarA = a(this.f36990a)) != null) {
            wlVarA.b(this.f36991b);
        }
    }

    @Override // defpackage.uj
    public void a(@NotNull kd kdVar, @NotNull ik ikVar, @Nullable byte[] bArr) {
        uj.a.a(this, kdVar, ikVar, bArr);
    }

    @Override // defpackage.uj
    public void a() {
        wl wlVarA = a(this.f36990a);
        if (wlVarA != null) {
            wlVarA.a(this.f36991b);
        }
    }

    public final wl a(kd device) {
        wl wlVarA = xl.f39223a.a(device);
        if (wlVarA != null) {
            return wlVarA;
        }
        le.c("MusicControllerAdapter", b.t);
        return null;
    }
}
