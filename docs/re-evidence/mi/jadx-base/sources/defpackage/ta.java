package defpackage;

import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.smarthome.core.modelconfig.PluginDeviceInfo;
import com.xiaomi.hm.health.bt.device.HMCallback;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(bv = {}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H&J\u0014\u0010\u0007\u001a\u00020\u00062\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u0004H&J\u0014\u0010\u0003\u001a\u00020\u00062\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u0004H&J\u0010\u0010\n\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH&J\u0010\u0010\u0003\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH&¨\u0006\u000b"}, d2 = {"Lta;", "", "", PluginDeviceInfo.FMODEL, "Lcom/xiaomi/hm/health/bt/device/HMCallback;", "callback", "", PluginDeviceInfo.FICONON, "Lbb;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, PluginDeviceInfo.FDESC, "bluetooth_release"}, k = 1, mv = {1, 7, 1})
public interface ta {
    void a(@NotNull bb listener);

    void a(@NotNull HMCallback<?> callback);

    boolean a();

    void b(@NotNull bb listener);

    void c(@NotNull HMCallback<?> callback);
}
