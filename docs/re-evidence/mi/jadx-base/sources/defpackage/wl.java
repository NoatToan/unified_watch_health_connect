package defpackage;

import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.smarthome.core.modelconfig.PluginDeviceInfo;
import com.xiaomi.hm.health.bt.profile.amc.HMMusicControl;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(bv = {}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&J\u0010\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H&J\u0010\u0010\u0005\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H&¨\u0006\n"}, d2 = {"Lwl;", "", "Lcom/xiaomi/hm/health/bt/profile/amc/HMMusicControl;", "control", "", PluginDeviceInfo.FMODEL, "Lzl;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "", PluginDeviceInfo.FDESC, "bluetooth_release"}, k = 1, mv = {1, 7, 1})
public interface wl {
    void a(@NotNull zl listener);

    boolean a(@NotNull HMMusicControl control);

    void b(@NotNull zl listener);
}
