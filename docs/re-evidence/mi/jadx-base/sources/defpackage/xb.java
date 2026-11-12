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
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000¬\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0005\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b7\u00104JE\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\f2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0012\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\b¢\u0006\u0004\b\r\u0010\u000eJA\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00110\f2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010¢\u0006\u0004\b\r\u0010\u0012J9\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00130\f2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0007\u001a\u00020\u00062\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00130\b¢\u0006\u0004\b\r\u0010\u0015JI\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001c0\u001b0\f2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u000b\u001a\u00020\u001a¢\u0006\u0004\b\r\u0010\u001dJ9\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001f0\t0\f2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u001e¢\u0006\u0004\b\r\u0010 JC\u0010\"\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010!0\f2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0014\u0010\u000b\u001a\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010!0\t0\b¢\u0006\u0004\b\"\u0010\u000eJA\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020&0\t0\f2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010$\u001a\u00020#2\u0006\u0010\u000b\u001a\u00020%¢\u0006\u0004\b\r\u0010'JU\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020*0\t0\f2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020(2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010)\u001a\u00020#2\u0012\u0010+\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020*0\t0\b¢\u0006\u0004\b\r\u0010,JA\u0010\r\u001a\u00020/2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0012\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020.0\t0-¢\u0006\u0004\b\r\u00100J\u001d\u0010\r\u001a\u0002012\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\r\u00102J\r\u0010\"\u001a\u000203¢\u0006\u0004\b\"\u00104J\u000f\u0010\r\u001a\u0004\u0018\u000105¢\u0006\u0004\b\r\u00106¨\u00068"}, d2 = {"Lxb;", "", "Ljet;", "gattPeripheral", "Ljava/util/Calendar;", "startTime", "", "version", "Lcom/xiaomi/hm/health/bt/profile/gdsp/IHMDataCallback;", "", "Lcom/huami/bluetooth/profile/channel/module/openapp/entities/ActivityData;", "callback", "La5;", PluginDeviceInfo.FMODEL, "(Ljet;Ljava/util/Calendar;ILcom/xiaomi/hm/health/bt/profile/gdsp/IHMDataCallback;)La5;", "type", "Ldi;", "", "(Ljet;Ljava/util/Calendar;IILdi;)La5;", "Ljava/io/File;", "file", "(Ljet;Ljava/io/File;ILcom/xiaomi/hm/health/bt/profile/gdsp/IHMDataCallback;)La5;", "Lqd;", "source", "Lcom/xiaomi/hm/health/bt/profile/feature/Feature;", b.n, "Lzos;", "Lk3t;", "Li;", "(Ljet;Ljava/util/Calendar;ILqd;Lcom/xiaomi/hm/health/bt/profile/feature/Feature;Lzos;)La5;", "Lc0t;", "Lvzs;", "(Ljet;Ljava/util/Calendar;ILc0t;)La5;", "Ludt;", PluginDeviceInfo.FDESC, "", "isSingle", "Lki;", "Lcom/xiaomi/hm/health/bt/profile/gdsp/pressure/HMPressureData;", "(Ljet;Ljava/util/Calendar;IZLki;)La5;", "", "spo2SupportVersion", "Lcom/xiaomi/hm/health/bt/profile/gdsp/spo2/Spo2Data;", "mCallback", "(Ljet;Ljava/util/Calendar;BIZLcom/xiaomi/hm/health/bt/profile/gdsp/IHMDataCallback;)La5;", "Lcom/xiaomi/hm/health/bt/profile/gdsp/gps/SyncDataCallback;", "Lcom/xiaomi/hm/health/bt/profile/gdsp/gps/GpsRecord;", "Lcom/xiaomi/hm/health/bt/profile/gdsp/gps/HMSyncGpsDataTaskNew;", "(Ljet;Lqd;Ljava/util/Calendar;ILcom/xiaomi/hm/health/bt/profile/gdsp/gps/SyncDataCallback;)Lcom/xiaomi/hm/health/bt/profile/gdsp/gps/HMSyncGpsDataTaskNew;", "Lkc;", "(Ljet;I)Lkc;", "", "()V", "Lai;", "()Lai;", "<init>", "bluetooth_release"}, k = 1, mv = {1, 7, 1})
public final class xb {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final xb f38931a = new xb();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final Map<jet, kc> f38932b = new LinkedHashMap();

    @Nullable
    public static ai c;

    @NotNull
    public final a5<List<ActivityData>> a(@NotNull jet gattPeripheral, @NotNull Calendar startTime, int version, @NotNull IHMDataCallback<List<ActivityData>> callback) {
        Intrinsics.checkNotNullParameter(gattPeripheral, "gattPeripheral");
        Intrinsics.checkNotNullParameter(startTime, "startTime");
        Intrinsics.checkNotNullParameter(callback, "callback");
        return new a5<>(gattPeripheral, new n(startTime, version), T.b(callback));
    }

    @NotNull
    public final a5<udt> b(@NotNull jet gattPeripheral, @NotNull Calendar startTime, int version, @NotNull IHMDataCallback<List<udt>> callback) {
        Intrinsics.checkNotNullParameter(gattPeripheral, "gattPeripheral");
        Intrinsics.checkNotNullParameter(startTime, "startTime");
        Intrinsics.checkNotNullParameter(callback, "callback");
        return new a5<>(gattPeripheral, dc.f15358a.a(version, startTime), T.a(callback));
    }

    public final void b() {
        f38932b.clear();
    }

    @NotNull
    public final a5<byte[]> a(@NotNull jet gattPeripheral, @NotNull Calendar startTime, int type, int version, @NotNull di<byte[]> callback) {
        Intrinsics.checkNotNullParameter(gattPeripheral, "gattPeripheral");
        Intrinsics.checkNotNullParameter(startTime, "startTime");
        Intrinsics.checkNotNullParameter(callback, "callback");
        return new a5<>(gattPeripheral, dc.f15358a.a(startTime, type, version), callback);
    }

    @NotNull
    public final a5<File> a(@NotNull jet gattPeripheral, @NotNull File file, int version, @NotNull IHMDataCallback<File> callback) {
        Intrinsics.checkNotNullParameter(gattPeripheral, "gattPeripheral");
        Intrinsics.checkNotNullParameter(file, "file");
        Intrinsics.checkNotNullParameter(callback, "callback");
        return new a5<>(gattPeripheral, dc.f15358a.a(version, file), T.a(callback, file));
    }

    @NotNull
    public final a5<k3t<i>> a(@NotNull jet gattPeripheral, @NotNull Calendar startTime, int version, @NotNull qd source, @NotNull Feature feature, @NotNull zos callback) {
        Intrinsics.checkNotNullParameter(gattPeripheral, "gattPeripheral");
        Intrinsics.checkNotNullParameter(startTime, "startTime");
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(feature, "feature");
        Intrinsics.checkNotNullParameter(callback, "callback");
        return new a5<>(gattPeripheral, dc.f15358a.a(version, startTime, source, feature), T.a(callback));
    }

    @NotNull
    public final a5<List<vzs>> a(@NotNull jet gattPeripheral, @NotNull Calendar startTime, int version, @NotNull c0t callback) {
        Intrinsics.checkNotNullParameter(gattPeripheral, "gattPeripheral");
        Intrinsics.checkNotNullParameter(startTime, "startTime");
        Intrinsics.checkNotNullParameter(callback, "callback");
        return new a5<>(gattPeripheral, dc.f15358a.b(version, startTime), T.a(callback));
    }

    @NotNull
    public final a5<List<HMPressureData>> a(@NotNull jet gattPeripheral, @NotNull Calendar startTime, int version, boolean isSingle, @NotNull ki callback) {
        Intrinsics.checkNotNullParameter(gattPeripheral, "gattPeripheral");
        Intrinsics.checkNotNullParameter(startTime, "startTime");
        Intrinsics.checkNotNullParameter(callback, "callback");
        return new a5<>(gattPeripheral, dc.f15358a.a(isSingle, startTime, version), T.a(callback));
    }

    @NotNull
    public final a5<List<Spo2Data>> a(@NotNull jet gattPeripheral, @NotNull Calendar startTime, byte type, int version, boolean spo2SupportVersion, @NotNull IHMDataCallback<List<Spo2Data>> mCallback) {
        Intrinsics.checkNotNullParameter(gattPeripheral, "gattPeripheral");
        Intrinsics.checkNotNullParameter(startTime, "startTime");
        Intrinsics.checkNotNullParameter(mCallback, "mCallback");
        return new a5<>(gattPeripheral, dc.f15358a.a(startTime, type & 255, spo2SupportVersion, version), T.b(mCallback));
    }

    @NotNull
    public final HMSyncGpsDataTaskNew a(@NotNull jet gattPeripheral, @NotNull qd source, @NotNull Calendar startTime, int version, @NotNull SyncDataCallback<? super List<? extends GpsRecord>> callback) {
        Intrinsics.checkNotNullParameter(gattPeripheral, "gattPeripheral");
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(startTime, "startTime");
        Intrinsics.checkNotNullParameter(callback, "callback");
        return new HMSyncGpsDataTaskNew(gattPeripheral, source, startTime, version, callback);
    }

    @NotNull
    public final synchronized kc a(@NotNull jet gattPeripheral, int version) {
        kc lcVar;
        try {
            Intrinsics.checkNotNullParameter(gattPeripheral, "gattPeripheral");
            Map<jet, kc> map = f38932b;
            lcVar = map.get(gattPeripheral);
            if (lcVar == null) {
                lcVar = new lc(gattPeripheral, version);
                map.clear();
                map.put(gattPeripheral, lcVar);
            }
        } catch (Throwable th) {
            throw th;
        }
        return lcVar;
    }

    @Nullable
    public final ai a() {
        return c;
    }
}
