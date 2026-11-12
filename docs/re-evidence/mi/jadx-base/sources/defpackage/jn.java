package defpackage;

import com.smarthome.core.modelconfig.PluginDeviceInfo;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J!\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\f\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u0004H&¢\u0006\u0004\b\f\u0010\rJ\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u000f\u001a\u00020\u000eH&¢\u0006\u0004\b\u0007\u0010\u0011J\u0017\u0010\u0007\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u0002H&¢\u0006\u0004\b\u0007\u0010\u0012¨\u0006\u0013"}, d2 = {"Ljn;", "", "", "cmd", "", "cmdLen", "Lqe;", PluginDeviceInfo.FMODEL, "([BI)Lqe;", "data", "type", "", PluginDeviceInfo.FDESC, "([BI)Z", "Lgks;", "command", "Ltss;", "(Lgks;)Ltss;", "([B)Z", "bluetooth_release"}, k = 1, mv = {1, 7, 1})
public interface jn {
    @Nullable
    qe a(@NotNull byte[] cmd, int cmdLen);

    @Nullable
    tss a(@NotNull gks command);

    boolean a(@NotNull byte[] command);

    boolean b(@NotNull byte[] data, int type);
}
