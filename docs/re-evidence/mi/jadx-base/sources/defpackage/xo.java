package defpackage;

import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.smarthome.core.modelconfig.PluginDeviceInfo;
import com.xiaomi.hm.health.bt.device.HMCallback;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(bv = {}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u001e\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004H&J\u0016\u0010\b\u001a\u00020\u00062\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004H&J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH&¨\u0006\u000b"}, d2 = {"Lxo;", "", "", "isMute", "Lcom/xiaomi/hm/health/bt/device/HMCallback;", "callback", "", PluginDeviceInfo.FMODEL, PluginDeviceInfo.FDESC, "Lap;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "bluetooth_release"}, k = 1, mv = {1, 7, 1})
public interface xo {
    void a(@NotNull ap listener);

    void a(boolean isMute, @NotNull HMCallback<Boolean> callback);

    void b(@NotNull HMCallback<Boolean> callback);
}
