package defpackage;

import com.smarthome.core.modelconfig.PluginDeviceInfo;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\t\u0010\nJ!\u0010\u0007\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b¨\u0006\u000b"}, d2 = {"Ln0;", "", "Lxct;", "authInfo", "Ln1t;", "bleDevice", "Leh;", PluginDeviceInfo.FMODEL, "(Lxct;Ln1t;)Leh;", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 7, 1})
public final class n0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final n0 f27393a = new n0();

    /* JADX WARN: Code duplicated, block: B:7:0x000f  */
    @JvmStatic
    @NotNull
    public static final eh a(@Nullable xct authInfo, @NotNull n1t bleDevice) {
        boolean z;
        Intrinsics.checkNotNullParameter(bleDevice, "bleDevice");
        if (authInfo != null) {
            z = authInfo.f();
        }
        return (wbt.j && z && (bleDevice instanceof ne)) ? new zq() : new vm();
    }
}
