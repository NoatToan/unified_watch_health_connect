package defpackage;

import com.smarthome.core.modelconfig.PluginDeviceInfo;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(bv = {}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u000f\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0018B\u0007¢\u0006\u0004\b\u001a\u0010\u001bJ\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0016R\"\u0010\u0007\u001a\u00020\u00038\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR(\u0010\u0013\u001a\u0004\u0018\u00010\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\r8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R(\u0010\u0016\u001a\u0004\u0018\u00010\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\r8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0014\u0010\u0010\"\u0004\b\u0015\u0010\u0012R(\u0010\u0019\u001a\u0004\u0018\u00010\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\r8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0017\u0010\u0010\"\u0004\b\u0018\u0010\u0012¨\u0006\u001c"}, d2 = {"Lnn;", "Lmn;", "Ljava/io/Serializable;", "", "key", "", "keyToString", "groupVersion", "I", "getGroupVersion", "()I", "setGroupVersion", "(I)V", "", "value", "getActiveWithIn5SByTurningWristSwitch", "()Ljava/lang/Boolean;", PluginDeviceInfo.FDESC, "(Ljava/lang/Boolean;)V", "activeWithIn5SByTurningWristSwitch", "getActiveWithIn5SWhenScreenOnSwitch", PluginDeviceInfo.FICONON, "activeWithIn5SWhenScreenOnSwitch", "getActiveDuringScreenOnSwitch", PluginDeviceInfo.FMODEL, "activeDuringScreenOnSwitch", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 7, 1})
public final class nn extends mn {
    public static final int A;
    public static final int B;
    private static final long serialVersionUID = 1;

    @NotNull
    public static final a x = new a(null);

    @NotNull
    public static final HashMap<Integer, String> y;
    public static final int z;
    public int w = 1;

    @Metadata(bv = {}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\t\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0004\u001a\u0004\b\b\u0010\u0006R\u0017\u0010\t\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\u0004\u001a\u0004\b\n\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0004R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u0011"}, d2 = {"Lnn$a;", "", "", "KEY_ACTIVE_WITH_IN_5S_BY_TURNING_WRIST_SWITCH", "I", PluginDeviceInfo.FDESC, "()I", "KEY_ACTIVE_WITH_IN_5S_WHEN_SCREEN_ON_SWITCH", PluginDeviceInfo.FICONON, "KEY_ACTIVE_DURING_SCREEN_ON_SWITCH", PluginDeviceInfo.FMODEL, "GROUP_VERSION", "", "serialVersionUID", "J", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 7, 1})
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final int a() {
            return nn.B;
        }

        public final int b() {
            return nn.z;
        }

        public final int c() {
            return nn.A;
        }
    }

    static {
        HashMap<Integer, String> map = new HashMap<>();
        y = map;
        map.put(1, "转腕后5s内响应开关");
        z = 1;
        map.put(2, "亮屏后5s内响应开关");
        A = 2;
        map.put(3, "亮屏期间响应开关");
        B = 3;
    }

    @Override // com.huami.bluetooth.profile.channel.module.settings.primarydata.Settings
    /* JADX INFO: renamed from: getGroupVersion, reason: from getter */
    public int getW() {
        return this.w;
    }

    @Override // com.huami.bluetooth.profile.channel.module.settings.primarydata.Settings
    @Nullable
    public String keyToString(int key) {
        return y.get(Integer.valueOf(key));
    }

    @Override // com.huami.bluetooth.profile.channel.module.settings.primarydata.Settings
    public void setGroupVersion(int i) {
        this.w = i;
    }

    public final void a(@Nullable Boolean bool) {
        setBoolean(bool, B);
    }

    public final void b(@Nullable Boolean bool) {
        setBoolean(bool, z);
    }

    public final void c(@Nullable Boolean bool) {
        setBoolean(bool, A);
    }
}
