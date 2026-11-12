package androidx.health.connect.client.feature;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import androidx.core.content.pm.PackageInfoCompat;
import androidx.health.connect.client.HealthConnectFeatures;
import com.huawei.openalliance.ad.constant.ParamConstants;
import com.huawei.phoneservice.faq.base.constants.TrackConstants$Events;
import defpackage.zcm;
import defpackage.zcp;
import java.util.Map;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\b\u0000\u0018\u0000 \u000b2\u00020\u0001:\u0001\u000bB\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\tH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Landroidx/health/connect/client/feature/HealthConnectFeaturesApkImpl;", "Landroidx/health/connect/client/HealthConnectFeatures;", ParamConstants.Param.CONTEXT, "Landroid/content/Context;", "providerPackageName", "", "<init>", "(Landroid/content/Context;Ljava/lang/String;)V", "getFeatureStatus", "", TrackConstants$Events.FEATURE, "Companion", "connect-client_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class HealthConnectFeaturesApkImpl implements HealthConnectFeatures {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final Context context;
    private final String providerPackageName;

    public HealthConnectFeaturesApkImpl(Context context, String str) {
        zcp.c(context, "");
        zcp.c(str, "");
        this.context = context;
        this.providerPackageName = str;
    }

    @Override // androidx.health.connect.client.HealthConnectFeatures
    public int getFeatureStatus(int feature) {
        return INSTANCE.getFeatureStatus$connect_client_release(HealthConnectFeatures.INSTANCE.getFEATURE_TO_VERSION_INFO_MAP$connect_client_release(), this.context, this.providerPackageName, feature);
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0081\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J5\u0010\u0004\u001a\u00020\u0005*\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0005H\u0001¢\u0006\u0002\b\r¨\u0006\u000e"}, d2 = {"Landroidx/health/connect/client/feature/HealthConnectFeaturesApkImpl$Companion;", "", "<init>", "()V", "getFeatureStatus", "", "", "Landroidx/health/connect/client/feature/HealthConnectVersionInfo;", ParamConstants.Param.CONTEXT, "Landroid/content/Context;", "providerPackageName", "", TrackConstants$Events.FEATURE, "getFeatureStatus$connect_client_release", "connect-client_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final int getFeatureStatus$connect_client_release(Map<Integer, HealthConnectVersionInfo> map, Context context, String str, int i) {
            zcp.c(map, "");
            zcp.c(context, "");
            zcp.c(str, "");
            try {
                PackageInfo packageInfo = context.getPackageManager().getPackageInfo(str, 0);
                zcp.e(packageInfo);
                long longVersionCode = PackageInfoCompat.getLongVersionCode(packageInfo);
                HealthConnectVersionInfo healthConnectVersionInfo = map.get(Integer.valueOf(i));
                Long apkVersionCode = healthConnectVersionInfo != null ? healthConnectVersionInfo.getApkVersionCode() : null;
                return (apkVersionCode == null || apkVersionCode.longValue() > longVersionCode) ? 1 : 2;
            } catch (PackageManager.NameNotFoundException unused) {
                throw new IllegalStateException("Provider APK not installed!".toString());
            }
        }

        public /* synthetic */ Companion(zcm zcmVar) {
            this();
        }
    }
}
