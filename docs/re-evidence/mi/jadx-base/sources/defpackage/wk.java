package defpackage;

import com.smarthome.core.modelconfig.PluginDeviceInfo;
import com.xiaomi.hm.health.bt.device.HMCallback;
import com.xiaomi.hm.health.bt.profile.gdsp.spo2.LowOsaNotificationData;
import java.util.Calendar;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(bv = {}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\f\u0010\rJ.\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0016\u0010\t\u001a\u0012\u0012\u000e\u0012\f\u0012\u0006\u0012\u0004\u0018\u00010\b\u0018\u00010\u00070\u0006¨\u0006\u000e"}, d2 = {"Lwk;", "", "Lne;", "hmMiLiProDevice", "Ljava/util/Calendar;", "startTime", "Lcom/xiaomi/hm/health/bt/device/HMCallback;", "", "Lcom/xiaomi/hm/health/bt/profile/gdsp/spo2/LowOsaNotificationData;", "callback", "", PluginDeviceInfo.FMODEL, "<init>", "()V", "btData_wearRelease"}, k = 1, mv = {1, 7, 1})
public final class wk {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final wk f38046a = new wk();

    public final void a(@NotNull ne hmMiLiProDevice, @NotNull Calendar startTime, @NotNull HMCallback<List<LowOsaNotificationData>> callback) {
        Intrinsics.checkNotNullParameter(hmMiLiProDevice, "hmMiLiProDevice");
        Intrinsics.checkNotNullParameter(startTime, "startTime");
        Intrinsics.checkNotNullParameter(callback, "callback");
        hmMiLiProDevice.I2(new uk(startTime), callback);
    }
}
