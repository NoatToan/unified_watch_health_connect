package androidx.health.connect.client.feature;

import androidx.health.connect.client.HealthConnectFeatures;
import com.huawei.phoneservice.faq.base.constants.TrackConstants$Events;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¨\u0006\u0007"}, d2 = {"Landroidx/health/connect/client/feature/HealthConnectFeaturesUnavailableImpl;", "Landroidx/health/connect/client/HealthConnectFeatures;", "<init>", "()V", "getFeatureStatus", "", TrackConstants$Events.FEATURE, "connect-client_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class HealthConnectFeaturesUnavailableImpl implements HealthConnectFeatures {
    public static final HealthConnectFeaturesUnavailableImpl INSTANCE = new HealthConnectFeaturesUnavailableImpl();

    @Override // androidx.health.connect.client.HealthConnectFeatures
    public int getFeatureStatus(int feature) {
        return 1;
    }

    private HealthConnectFeaturesUnavailableImpl() {
    }
}
