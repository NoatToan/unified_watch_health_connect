package defpackage;

import com.smarthome.core.modelconfig.PluginDeviceInfo;
import com.xiaomi.hm.health.bt.profile.gdsp.activity.HMProSyncDataBaseProfile;
import com.xiaomi.hm.health.bt.sdk.ISpO2Callback;
import java.util.Calendar;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u001e\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¨\u0006\f"}, d2 = {"Lbt;", "", "Lne;", "device", "Ljava/util/Calendar;", "calendar", "Lcom/xiaomi/hm/health/bt/sdk/ISpO2Callback;", "callback", "", PluginDeviceInfo.FMODEL, "<init>", "()V", "btData_wearRelease"}, k = 1, mv = {1, 7, 1})
public final class bt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final bt f4578a = new bt();

    public final void a(@NotNull ne device, @NotNull Calendar calendar, @NotNull ISpO2Callback callback) {
        Intrinsics.checkNotNullParameter(device, "device");
        Intrinsics.checkNotNullParameter(calendar, "calendar");
        Intrinsics.checkNotNullParameter(callback, "callback");
        device.L2(calendar, HMProSyncDataBaseProfile.DATA_SPO2_POINT, new zs(callback));
    }
}
