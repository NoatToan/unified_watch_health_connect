package defpackage;

import com.smarthome.core.modelconfig.PluginDeviceInfo;
import com.xiaomi.hm.health.bt.profile.feature.Feature;
import com.xiaomi.hm.health.bt.profile.gdsp.gps.SportDetail;
import com.xiaomi.hm.health.bt.profile.gdsp.gps.SportSummary;
import com.xiaomi.hm.health.bt.profile.gdsp.pressure.HMPressureData;
import com.xiaomi.hm.health.bt.profile.gdsp.spo2.Spo2Data;
import com.xiaomi.onetrack.api.b;
import java.io.File;
import java.util.Calendar;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b&\u0010'J+\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\t\u0010\nJ#\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00072\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\t\u0010\rJ9\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\u00120\u00072\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\t\u0010\u0014J)\u0010\u0017\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00160\u00150\u00072\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0017\u0010\u0018J%\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00190\u00072\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\u0018J1\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001c0\u00150\u00072\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\t\u0010\u001dJ9\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001f0\u00150\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u001e\u001a\u00020\u001a2\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\t\u0010 J-\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010!0\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\t\u0010\"J5\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010$0\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010#\u001a\u00020!2\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\t\u0010%¨\u0006("}, d2 = {"Ldc;", "", "Ljava/util/Calendar;", "startTime", "", "type", "version", "Lf1;", "", PluginDeviceInfo.FMODEL, "(Ljava/util/Calendar;II)Lf1;", "Ljava/io/File;", "file", "(ILjava/io/File;)Lf1;", "Lqd;", "source", "Lcom/xiaomi/hm/health/bt/profile/feature/Feature;", b.n, "Lk3t;", "Li;", "(ILjava/util/Calendar;Lqd;Lcom/xiaomi/hm/health/bt/profile/feature/Feature;)Lf1;", "", "Lvzs;", PluginDeviceInfo.FDESC, "(ILjava/util/Calendar;)Lf1;", "Ludt;", "", "isSingle", "Lcom/xiaomi/hm/health/bt/profile/gdsp/pressure/HMPressureData;", "(ZLjava/util/Calendar;I)Lf1;", "supportSpo2Version", "Lcom/xiaomi/hm/health/bt/profile/gdsp/spo2/Spo2Data;", "(Ljava/util/Calendar;IZI)Lf1;", "Lcom/xiaomi/hm/health/bt/profile/gdsp/gps/SportSummary;", "(Ljava/util/Calendar;Lqd;I)Lf1;", "summary", "Lcom/xiaomi/hm/health/bt/profile/gdsp/gps/SportDetail;", "(Ljava/util/Calendar;Lqd;Lcom/xiaomi/hm/health/bt/profile/gdsp/gps/SportSummary;I)Lf1;", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 7, 1})
public final class dc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final dc f15358a = new dc();

    @NotNull
    public final f1<byte[]> a(@NotNull Calendar startTime, int type, int version) {
        Intrinsics.checkNotNullParameter(startTime, "startTime");
        return new ub(startTime, type, version);
    }

    @NotNull
    public final f1<List<vzs>> b(int version, @NotNull Calendar startTime) {
        Intrinsics.checkNotNullParameter(startTime, "startTime");
        return new hc(startTime, version);
    }

    @NotNull
    public final f1<File> a(int version, @NotNull File file) {
        Intrinsics.checkNotNullParameter(file, "file");
        Calendar calendar = Calendar.getInstance();
        Intrinsics.checkNotNullExpressionValue(calendar, "getInstance()");
        return new bc(calendar, file, version);
    }

    @NotNull
    public final f1<k3t<i>> a(int version, @NotNull Calendar startTime, @NotNull qd source, @NotNull Feature feature) {
        Intrinsics.checkNotNullParameter(startTime, "startTime");
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(feature, "feature");
        return new gc(startTime, source, feature, version);
    }

    @NotNull
    public final f1<udt> a(int version, @NotNull Calendar startTime) {
        Intrinsics.checkNotNullParameter(startTime, "startTime");
        return new cc(startTime, version);
    }

    @NotNull
    public final f1<List<HMPressureData>> a(boolean isSingle, @NotNull Calendar startTime, int version) {
        Intrinsics.checkNotNullParameter(startTime, "startTime");
        return new fc(startTime, isSingle, version);
    }

    @NotNull
    public final f1<List<Spo2Data>> a(@NotNull Calendar startTime, int type, boolean supportSpo2Version, int version) {
        Intrinsics.checkNotNullParameter(startTime, "startTime");
        return new jc(startTime, type, supportSpo2Version, version);
    }

    @NotNull
    public final f1<SportSummary> a(@NotNull Calendar startTime, @NotNull qd source, int version) {
        Intrinsics.checkNotNullParameter(startTime, "startTime");
        Intrinsics.checkNotNullParameter(source, "source");
        return new zb(startTime, source, version);
    }

    @NotNull
    public final f1<SportDetail> a(@NotNull Calendar startTime, @NotNull qd source, @NotNull SportSummary summary, int version) {
        Intrinsics.checkNotNullParameter(startTime, "startTime");
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(summary, "summary");
        return new yb(startTime, summary, source, version);
    }
}
