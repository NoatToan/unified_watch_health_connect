package defpackage;

import com.smarthome.core.modelconfig.PluginDeviceInfo;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(bv = {}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\b"}, d2 = {"Liq;", "", "", "data", "Lk4;", PluginDeviceInfo.FMODEL, "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 7, 1})
public final class iq {
    @Nullable
    public ChannelReplyPacket a(@NotNull byte[] data) {
        Intrinsics.checkNotNullParameter(data, "data");
        if (data.length != 5) {
            return null;
        }
        w2 w2Var = new w2(data, 0, 2, null);
        return new ChannelReplyPacket(w2Var.c(), w2Var.c(), w2Var.c(), w2Var.c(), w2Var.c());
    }
}
