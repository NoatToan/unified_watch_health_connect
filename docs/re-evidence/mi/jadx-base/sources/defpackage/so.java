package defpackage;

import com.smarthome.core.modelconfig.PluginDeviceInfo;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0003\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H&¢\u0006\u0004\b\u0003\u0010\bJ!\u0010\u0003\u001a\u0004\u0018\u00010\f2\u0006\u0010\t\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\nH&¢\u0006\u0004\b\u0003\u0010\rJ\u001f\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\nH&¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0003\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\u00072\u0006\u0010\u0012\u001a\u00020\u0011H&¢\u0006\u0004\b\u0003\u0010\u0013J\u0017\u0010\u0003\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0003\u0010\u0014¨\u0006\u0015"}, d2 = {"Lso;", "", "Lsft;", PluginDeviceInfo.FMODEL, "()Lsft;", "Ln4;", "transferMethod", "Ln2;", "(Ln4;)Ln2;", "characteristic", "", "cmd", "Lqe;", "(Ln2;[B)Lqe;", "", PluginDeviceInfo.FDESC, "(Ln2;[B)Z", "Lw5;", "callback", "(Ln2;Lw5;)Z", "(Ln2;)Z", "bluetooth_release"}, k = 1, mv = {1, 7, 1})
public interface so {
    @NotNull
    n2 a(@NotNull n4 transferMethod);

    @Nullable
    qe a(@NotNull n2 characteristic, @NotNull byte[] cmd);

    @NotNull
    sft a();

    boolean a(@NotNull n2 characteristic);

    boolean a(@NotNull n2 characteristic, @NotNull w5 callback);

    boolean b(@NotNull n2 characteristic, @NotNull byte[] cmd);
}
