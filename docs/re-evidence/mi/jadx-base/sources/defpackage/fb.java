package defpackage;

import com.smarthome.core.modelconfig.PluginDeviceInfo;
import com.xiaomi.hm.health.bt.profile.base.ProfileUtils;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0015\u0010\u0005\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u0005\u0010\t¨\u0006\f"}, d2 = {"Lfb;", "", "Lg4s;", "deviceInfo", "", PluginDeviceInfo.FMODEL, "(Lg4s;)Z", "Lqd;", "deviceSource", "(Lqd;)Z", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 7, 1})
public final class fb {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final fb f17619a = new fb();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final HashMap<qd, String> f17620b;

    static {
        HashMap<qd, String> map = new HashMap<>();
        map.put(qd.l0, "4.1.4.03");
        f17620b = map;
    }

    public final boolean a(@Nullable g4s deviceInfo) {
        Integer numValueOf = deviceInfo != null ? Integer.valueOf(deviceInfo.U()) : null;
        Integer num = (numValueOf == null || numValueOf.intValue() != -1) ? numValueOf : null;
        if (num == null) {
            return false;
        }
        int iIntValue = num.intValue();
        HashMap<qd, String> map = f17620b;
        Intrinsics.checkNotNull(deviceInfo);
        return iIntValue >= ProfileUtils.getVersionCodeFromVersionName(map.get(deviceInfo.I()));
    }

    public final boolean a(@NotNull qd deviceSource) {
        Intrinsics.checkNotNullParameter(deviceSource, "deviceSource");
        return f17620b.containsKey(deviceSource);
    }
}
