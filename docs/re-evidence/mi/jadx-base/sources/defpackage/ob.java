package defpackage;

import com.huami.bluetooth.profile.channel.module.openapp.entities.ActivityData;
import com.smarthome.core.modelconfig.PluginDeviceInfo;
import com.xiaomi.hm.health.bt.profile.feature.Feature;
import com.xiaomi.hm.health.bt.profile.gdsp.IHMDataCallback;
import com.xiaomi.hm.health.bt.profile.gdsp.gps.GpsRecord;
import com.xiaomi.hm.health.bt.profile.gdsp.gps.HMSyncGpsDataTaskNew;
import com.xiaomi.hm.health.bt.profile.gdsp.gps.SyncDataCallback;
import com.xiaomi.hm.health.bt.profile.gdsp.pressure.HMPressureData;
import com.xiaomi.hm.health.bt.profile.gdsp.spo2.Spo2Data;
import com.xiaomi.onetrack.api.b;
import java.io.File;
import java.util.Calendar;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000¢\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0005\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010/\u001a\u00020.\u0012\u0006\u00100\u001a\u00020\u000b¢\u0006\u0004\b1\u00102B\u0011\b\u0016\u0012\u0006\u00104\u001a\u000203¢\u0006\u0004\b1\u00105J5\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0012\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u0004¢\u0006\u0004\b\t\u0010\nJ1\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000e0\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b2\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u000e0\r¢\u0006\u0004\b\t\u0010\u000fJ)\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00100\b2\u0006\u0010\u0011\u001a\u00020\u00102\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00100\u0004¢\u0006\u0004\b\t\u0010\u0012J9\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00190\u00180\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0007\u001a\u00020\u0017¢\u0006\u0004\b\t\u0010\u001aJ)\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001c0\u00050\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u001b¢\u0006\u0004\b\t\u0010\u001dJ3\u0010\u001f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001e0\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0014\u0010\u0007\u001a\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u001e0\u00050\u0004¢\u0006\u0004\b\u001f\u0010\nJ1\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020#0\u00050\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010!\u001a\u00020 2\u0006\u0010\u0007\u001a\u00020\"¢\u0006\u0004\b\t\u0010$JE\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020'0\u00050\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020%2\u0006\u0010&\u001a\u00020 2\u0012\u0010(\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020'0\u00050\u0004¢\u0006\u0004\b\t\u0010)J1\u0010\t\u001a\u00020,2\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0003\u001a\u00020\u00022\u0012\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020+0\u00050*¢\u0006\u0004\b\t\u0010-¨\u00066"}, d2 = {"Lob;", "", "Ljava/util/Calendar;", "startTime", "Lcom/xiaomi/hm/health/bt/profile/gdsp/IHMDataCallback;", "", "Lcom/huami/bluetooth/profile/channel/module/openapp/entities/ActivityData;", "callback", "La5;", PluginDeviceInfo.FMODEL, "(Ljava/util/Calendar;Lcom/xiaomi/hm/health/bt/profile/gdsp/IHMDataCallback;)La5;", "", "type", "Ldi;", "", "(Ljava/util/Calendar;ILdi;)La5;", "Ljava/io/File;", "file", "(Ljava/io/File;Lcom/xiaomi/hm/health/bt/profile/gdsp/IHMDataCallback;)La5;", "Lqd;", "source", "Lcom/xiaomi/hm/health/bt/profile/feature/Feature;", b.n, "Lzos;", "Lk3t;", "Li;", "(Ljava/util/Calendar;Lqd;Lcom/xiaomi/hm/health/bt/profile/feature/Feature;Lzos;)La5;", "Lc0t;", "Lvzs;", "(Ljava/util/Calendar;Lc0t;)La5;", "Ludt;", PluginDeviceInfo.FDESC, "", "isSingle", "Lki;", "Lcom/xiaomi/hm/health/bt/profile/gdsp/pressure/HMPressureData;", "(Ljava/util/Calendar;ZLki;)La5;", "", "spo2SupportVersion", "Lcom/xiaomi/hm/health/bt/profile/gdsp/spo2/Spo2Data;", "mCallback", "(Ljava/util/Calendar;BZLcom/xiaomi/hm/health/bt/profile/gdsp/IHMDataCallback;)La5;", "Lcom/xiaomi/hm/health/bt/profile/gdsp/gps/SyncDataCallback;", "Lcom/xiaomi/hm/health/bt/profile/gdsp/gps/GpsRecord;", "Lcom/xiaomi/hm/health/bt/profile/gdsp/gps/HMSyncGpsDataTaskNew;", "(Lqd;Ljava/util/Calendar;Lcom/xiaomi/hm/health/bt/profile/gdsp/gps/SyncDataCallback;)Lcom/xiaomi/hm/health/bt/profile/gdsp/gps/HMSyncGpsDataTaskNew;", "Ljet;", "gattPeripheral", "gdspVersion", "<init>", "(Ljet;I)V", "Ln1t;", "device", "(Ln1t;)V", "bluetooth_release"}, k = 1, mv = {1, 7, 1})
public final class ob {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final jet f28946a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f28947b;

    public ob(@NotNull jet gattPeripheral, int i) {
        Intrinsics.checkNotNullParameter(gattPeripheral, "gattPeripheral");
        this.f28946a = gattPeripheral;
        this.f28947b = i;
    }

    @NotNull
    public final a5<List<ActivityData>> a(@NotNull Calendar startTime, @NotNull IHMDataCallback<List<ActivityData>> callback) {
        Intrinsics.checkNotNullParameter(startTime, "startTime");
        Intrinsics.checkNotNullParameter(callback, "callback");
        return xb.f38931a.a(this.f28946a, startTime, this.f28947b, callback);
    }

    @NotNull
    public final a5<udt> b(@NotNull Calendar startTime, @NotNull IHMDataCallback<List<udt>> callback) {
        Intrinsics.checkNotNullParameter(startTime, "startTime");
        Intrinsics.checkNotNullParameter(callback, "callback");
        return xb.f38931a.b(this.f28946a, startTime, this.f28947b, callback);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public ob(@NotNull n1t device) {
        Intrinsics.checkNotNullParameter(device, "device");
        yus yusVarA1 = device.a1();
        Intrinsics.checkNotNullExpressionValue(yusVarA1, "device.baseProfile");
        this(yusVarA1, device.d1());
    }

    @NotNull
    public final a5<byte[]> a(@NotNull Calendar startTime, int type, @NotNull di<byte[]> callback) {
        Intrinsics.checkNotNullParameter(startTime, "startTime");
        Intrinsics.checkNotNullParameter(callback, "callback");
        return xb.f38931a.a(this.f28946a, startTime, type, this.f28947b, callback);
    }

    @NotNull
    public final a5<File> a(@NotNull File file, @NotNull IHMDataCallback<File> callback) {
        Intrinsics.checkNotNullParameter(file, "file");
        Intrinsics.checkNotNullParameter(callback, "callback");
        return xb.f38931a.a(this.f28946a, file, this.f28947b, callback);
    }

    @NotNull
    public final a5<k3t<i>> a(@NotNull Calendar startTime, @NotNull qd source, @NotNull Feature feature, @NotNull zos callback) {
        Intrinsics.checkNotNullParameter(startTime, "startTime");
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(feature, "feature");
        Intrinsics.checkNotNullParameter(callback, "callback");
        return xb.f38931a.a(this.f28946a, startTime, this.f28947b, source, feature, callback);
    }

    @NotNull
    public final a5<List<vzs>> a(@NotNull Calendar startTime, @NotNull c0t callback) {
        Intrinsics.checkNotNullParameter(startTime, "startTime");
        Intrinsics.checkNotNullParameter(callback, "callback");
        return xb.f38931a.a(this.f28946a, startTime, this.f28947b, callback);
    }

    @NotNull
    public final a5<List<HMPressureData>> a(@NotNull Calendar startTime, boolean isSingle, @NotNull ki callback) {
        Intrinsics.checkNotNullParameter(startTime, "startTime");
        Intrinsics.checkNotNullParameter(callback, "callback");
        return xb.f38931a.a(this.f28946a, startTime, this.f28947b, isSingle, callback);
    }

    @NotNull
    public final a5<List<Spo2Data>> a(@NotNull Calendar startTime, byte type, boolean spo2SupportVersion, @NotNull IHMDataCallback<List<Spo2Data>> mCallback) {
        Intrinsics.checkNotNullParameter(startTime, "startTime");
        Intrinsics.checkNotNullParameter(mCallback, "mCallback");
        return xb.f38931a.a(this.f28946a, startTime, type, this.f28947b, spo2SupportVersion, mCallback);
    }

    @NotNull
    public final HMSyncGpsDataTaskNew a(@NotNull qd source, @NotNull Calendar startTime, @NotNull SyncDataCallback<? super List<? extends GpsRecord>> callback) {
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(startTime, "startTime");
        Intrinsics.checkNotNullParameter(callback, "callback");
        return xb.f38931a.a(this.f28946a, source, startTime, this.f28947b, callback);
    }
}
