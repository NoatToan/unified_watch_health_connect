package androidx.health.connect.client.feature;

import android.os.Build;
import android.os.ext.SdkExtensions;
import androidx.health.connect.client.HealthConnectFeatures;
import com.huawei.phoneservice.faq.base.constants.TrackConstants$Events;
import defpackage.zcm;
import defpackage.zcp;
import java.util.Map;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\b\u0000\u0018\u0000 \u00072\u00020\u0001:\u0001\u0007B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¨\u0006\b"}, d2 = {"Landroidx/health/connect/client/feature/HealthConnectFeaturesPlatformImpl;", "Landroidx/health/connect/client/HealthConnectFeatures;", "<init>", "()V", "getFeatureStatus", "", TrackConstants$Events.FEATURE, "Companion", "connect-client_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class HealthConnectFeaturesPlatformImpl implements HealthConnectFeatures {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    @Override // androidx.health.connect.client.HealthConnectFeatures
    public int getFeatureStatus(int feature) {
        return INSTANCE.getFeatureStatus(feature);
    }

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005J%\u0010\u0004\u001a\u00020\u0005*\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0001¢\u0006\u0002\b\t¨\u0006\n"}, d2 = {"Landroidx/health/connect/client/feature/HealthConnectFeaturesPlatformImpl$Companion;", "", "<init>", "()V", "getFeatureStatus", "", TrackConstants$Events.FEATURE, "", "Landroidx/health/connect/client/feature/HealthConnectVersionInfo;", "getFeatureStatus$connect_client_release", "connect-client_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final int getFeatureStatus(int feature) {
            return getFeatureStatus$connect_client_release(HealthConnectFeatures.INSTANCE.getFEATURE_TO_VERSION_INFO_MAP$connect_client_release(), feature);
        }

        public final int getFeatureStatus$connect_client_release(Map<Integer, HealthConnectVersionInfo> map, int i) {
            HealthConnectPlatformVersion platformVersion;
            zcp.c(map, "");
            HealthConnectVersionInfo healthConnectVersionInfo = map.get(Integer.valueOf(i));
            if (healthConnectVersionInfo == null || (platformVersion = healthConnectVersionInfo.getPlatformVersion()) == null || platformVersion.getBuildVersionCode() > Build.VERSION.SDK_INT) {
                return 1;
            }
            return (platformVersion.getSdkExtensionVersion() != null && platformVersion.getSdkExtensionVersion().intValue() > SdkExtensions.getExtensionVersion(platformVersion.getBuildVersionCode())) ? 1 : 2;
        }

        public /* synthetic */ Companion(zcm zcmVar) {
            this();
        }
    }
}
