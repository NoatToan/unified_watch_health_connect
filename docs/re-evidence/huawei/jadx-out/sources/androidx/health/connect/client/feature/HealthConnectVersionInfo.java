package androidx.health.connect.client.feature;

import com.huawei.hms.network.embedded.g4;
import com.huawei.watchface.utils.constants.WatchFaceConstant;
import defpackage.zcm;
import defpackage.zcp;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001B\u001b\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\tJ\t\u0010\u000e\u001a\u00020\u0005HÆ\u0003J$\u0010\u000f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001¢\u0006\u0002\u0010\u0010J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\n\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0018"}, d2 = {"Landroidx/health/connect/client/feature/HealthConnectVersionInfo;", "", "apkVersionCode", "", "platformVersion", "Landroidx/health/connect/client/feature/HealthConnectPlatformVersion;", "<init>", "(Ljava/lang/Long;Landroidx/health/connect/client/feature/HealthConnectPlatformVersion;)V", "getApkVersionCode", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getPlatformVersion", "()Landroidx/health/connect/client/feature/HealthConnectPlatformVersion;", "component1", "component2", "copy", "(Ljava/lang/Long;Landroidx/health/connect/client/feature/HealthConnectPlatformVersion;)Landroidx/health/connect/client/feature/HealthConnectVersionInfo;", "equals", "", "other", WatchFaceConstant.HASHCODE, "", "toString", "", "connect-client_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class HealthConnectVersionInfo {
    private final Long apkVersionCode;
    private final HealthConnectPlatformVersion platformVersion;

    public HealthConnectVersionInfo(Long l, HealthConnectPlatformVersion healthConnectPlatformVersion) {
        zcp.c(healthConnectPlatformVersion, "");
        this.apkVersionCode = l;
        this.platformVersion = healthConnectPlatformVersion;
    }

    public /* synthetic */ HealthConnectVersionInfo(Long l, HealthConnectPlatformVersion healthConnectPlatformVersion, int i, zcm zcmVar) {
        this((i & 1) != 0 ? null : l, healthConnectPlatformVersion);
    }

    public final Long getApkVersionCode() {
        return this.apkVersionCode;
    }

    public final HealthConnectPlatformVersion getPlatformVersion() {
        return this.platformVersion;
    }

    public String toString() {
        return "HealthConnectVersionInfo(apkVersionCode=" + this.apkVersionCode + ", platformVersion=" + this.platformVersion + g4.l;
    }

    public int hashCode() {
        Long l = this.apkVersionCode;
        return ((l == null ? 0 : l.hashCode()) * 31) + this.platformVersion.hashCode();
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HealthConnectVersionInfo)) {
            return false;
        }
        HealthConnectVersionInfo healthConnectVersionInfo = (HealthConnectVersionInfo) other;
        return zcp.b(this.apkVersionCode, healthConnectVersionInfo.apkVersionCode) && zcp.b(this.platformVersion, healthConnectVersionInfo.platformVersion);
    }

    public final HealthConnectVersionInfo copy(Long apkVersionCode, HealthConnectPlatformVersion platformVersion) {
        zcp.c(platformVersion, "");
        return new HealthConnectVersionInfo(apkVersionCode, platformVersion);
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final HealthConnectPlatformVersion getPlatformVersion() {
        return this.platformVersion;
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Long getApkVersionCode() {
        return this.apkVersionCode;
    }

    public static /* synthetic */ HealthConnectVersionInfo copy$default(HealthConnectVersionInfo healthConnectVersionInfo, Long l, HealthConnectPlatformVersion healthConnectPlatformVersion, int i, Object obj) {
        if ((i & 1) != 0) {
            l = healthConnectVersionInfo.apkVersionCode;
        }
        if ((i & 2) != 0) {
            healthConnectPlatformVersion = healthConnectVersionInfo.platformVersion;
        }
        return healthConnectVersionInfo.copy(l, healthConnectPlatformVersion);
    }
}
