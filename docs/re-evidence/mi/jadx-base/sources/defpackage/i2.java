package defpackage;

import com.smarthome.core.modelconfig.PluginDeviceInfo;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0003\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0003\u0010\bJ!\u0010\u0003\u001a\u0004\u0018\u00010\f2\u0006\u0010\t\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0003\u0010\rJ\u001f\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0003\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\u00072\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0003\u0010\u0013J\u0017\u0010\u0003\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0003\u0010\u0014¨\u0006\u0019"}, d2 = {"Li2;", "Lso;", "Lsft;", PluginDeviceInfo.FMODEL, "()Lsft;", "Ln4;", "transferMethod", "Ln2;", "(Ln4;)Ln2;", "characteristic", "", "cmd", "Lqe;", "(Ln2;[B)Lqe;", "", PluginDeviceInfo.FDESC, "(Ln2;[B)Z", "Lw5;", "callback", "(Ln2;Lw5;)Z", "(Ln2;)Z", "Ljet;", "gattPeripheral", "<init>", "(Ljet;)V", "bluetooth_release"}, k = 1, mv = {1, 7, 1})
public final class i2 implements so {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final jet f20678a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final Map<n4, n2> f20679b;

    public i2(@NotNull jet gattPeripheral) {
        Intrinsics.checkNotNullParameter(gattPeripheral, "gattPeripheral");
        this.f20678a = gattPeripheral;
        this.f20679b = new LinkedHashMap();
    }

    @Override // defpackage.so
    @NotNull
    public sft a() {
        sft sftVarY0 = this.f20678a.y0();
        Intrinsics.checkNotNullExpressionValue(sftVarY0, "gattPeripheral.mtu");
        return sftVarY0;
    }

    @Override // defpackage.so
    public boolean b(@NotNull n2 characteristic, @NotNull byte[] cmd) {
        Intrinsics.checkNotNullParameter(characteristic, "characteristic");
        Intrinsics.checkNotNullParameter(cmd, "cmd");
        return characteristic.b(cmd);
    }

    @Override // defpackage.so
    @NotNull
    public n2 a(@NotNull n4 transferMethod) {
        Intrinsics.checkNotNullParameter(transferMethod, "transferMethod");
        n2 n2Var = this.f20679b.get(transferMethod);
        if (n2Var != null) {
            return n2Var;
        }
        jet jetVar = this.f20678a;
        UUID UUID_SERVICE_MILI_SERVICE = a6t.UUID_SERVICE_MILI_SERVICE;
        Intrinsics.checkNotNullExpressionValue(UUID_SERVICE_MILI_SERVICE, "UUID_SERVICE_MILI_SERVICE");
        nd ndVar = new nd(jetVar, UUID_SERVICE_MILI_SERVICE, transferMethod.getU());
        this.f20679b.put(transferMethod, ndVar);
        return ndVar;
    }

    @Override // defpackage.so
    @Nullable
    public qe a(@NotNull n2 characteristic, @NotNull byte[] cmd) {
        Intrinsics.checkNotNullParameter(characteristic, "characteristic");
        Intrinsics.checkNotNullParameter(cmd, "cmd");
        return characteristic.c(cmd);
    }

    @Override // defpackage.so
    public boolean a(@NotNull n2 characteristic, @NotNull w5 callback) {
        Intrinsics.checkNotNullParameter(characteristic, "characteristic");
        Intrinsics.checkNotNullParameter(callback, "callback");
        return characteristic.a(callback);
    }

    @Override // defpackage.so
    public boolean a(@NotNull n2 characteristic) {
        Intrinsics.checkNotNullParameter(characteristic, "characteristic");
        return characteristic.d();
    }
}
