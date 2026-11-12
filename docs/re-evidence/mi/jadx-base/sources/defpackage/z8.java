package defpackage;

import com.smarthome.core.modelconfig.PluginDeviceInfo;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u0007\u0010\bJ#\u0010\u0007\u001a\u0004\u0018\u00010\u000b2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0006\u0010\n\u001a\u00020\tH&¢\u0006\u0004\b\u0007\u0010\fJ\u001b\u0010\r\u001a\u0004\u0018\u00010\u000b2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004H&¢\u0006\u0004\b\r\u0010\u000eJ\u0011\u0010\u0010\u001a\u0004\u0018\u00010\u000fH&¢\u0006\u0004\b\u0010\u0010\u0011J!\u0010\u0013\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0012\u001a\u00020\tH&¢\u0006\u0004\b\u0013\u0010\u0014J\u001b\u0010\u0007\u001a\u0004\u0018\u00010\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H&¢\u0006\u0004\b\u0007\u0010\u0018¨\u0006\u0019"}, d2 = {"Lz8;", "", "Ljq$a;", "cmd", "", "data", "", PluginDeviceInfo.FMODEL, "(Ljq$a;[B)Z", "", "cmdLen", "Lqe;", "([BI)Lqe;", PluginDeviceInfo.FDESC, "([B)Lqe;", "Lb9;", PluginDeviceInfo.FBLUETOOTHPAIR, "()Lb9;", "profileType", PluginDeviceInfo.FICONON, "([BI)Z", "Lgks;", "command", "Ltss;", "(Lgks;)Ltss;", "bluetooth_release"}, k = 1, mv = {1, 7, 1})
public interface z8 {
    @Nullable
    qe a(@Nullable byte[] cmd, int cmdLen);

    @Nullable
    tss a(@Nullable gks command);

    boolean a(@NotNull jq.a cmd, @NotNull byte[] data);

    @Nullable
    qe b(@Nullable byte[] cmd);

    boolean c(@Nullable byte[] data, int profileType);

    @Nullable
    b9 f();
}
