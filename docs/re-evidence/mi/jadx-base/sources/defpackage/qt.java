package defpackage;

import com.smarthome.core.modelconfig.PluginDeviceInfo;
import com.xiaomi.hm.health.bt.profile.sport.SportCommand;
import java.util.Map;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010\u0005\n\u0002\b\u0006\u001a \u0010\u0004\u001a\u0004\u0018\u00010\u0001*\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002\"#\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u00008\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0004\u0010\u0007¨\u0006\b"}, d2 = {"", "Lcom/xiaomi/hm/health/bt/profile/sport/SportCommand;", "", "value", PluginDeviceInfo.FMODEL, "controlCommandMap", "Ljava/util/Map;", "()Ljava/util/Map;", "bluetooth_release"}, k = 2, mv = {1, 7, 1})
public final class qt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final Map<SportCommand, Byte> f31812a = MapsKt__MapsKt.mapOf(TuplesKt.to(SportCommand.START, (byte) 1), TuplesKt.to(SportCommand.PAUSE, (byte) 2), TuplesKt.to(SportCommand.RESUME, (byte) 3), TuplesKt.to(SportCommand.STOP, (byte) 4));

    @NotNull
    public static final Map<SportCommand, Byte> a() {
        return f31812a;
    }

    @Nullable
    public static final SportCommand a(@NotNull Map<SportCommand, Byte> map, byte b2) {
        Intrinsics.checkNotNullParameter(map, "<this>");
        SportCommand key = null;
        for (Map.Entry<SportCommand, Byte> entry : map.entrySet()) {
            if (entry.getValue().byteValue() == b2) {
                key = entry.getKey();
            }
        }
        return key;
    }
}
