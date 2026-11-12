package androidx.health.connect.client;

import androidx.health.connect.client.feature.FeatureUtilsKt;
import androidx.health.connect.client.feature.HealthConnectPlatformVersion;
import androidx.health.connect.client.feature.HealthConnectVersionInfo;
import com.huawei.phoneservice.faq.base.constants.TrackConstants$Events;
import defpackage.yyz;
import defpackage.zae;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Map;
import kotlin.Metadata;
import kotlin.annotation.AnnotationRetention;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\bf\u0018\u0000 \u00052\u00020\u0001:\u0001\u0005J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0003H&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0006À\u0006\u0001"}, d2 = {"Landroidx/health/connect/client/HealthConnectFeatures;", "", "getFeatureStatus", "", TrackConstants$Events.FEATURE, "Companion", "connect-client_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface HealthConnectFeatures {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = Companion.$$INSTANCE;
    public static final int FEATURE_MINDFULNESS_SESSION = 5;
    public static final int FEATURE_PERSONAL_HEALTH_RECORD = 6;
    public static final int FEATURE_PLANNED_EXERCISE = 3;
    public static final int FEATURE_READ_HEALTH_DATA_HISTORY = 4;
    public static final int FEATURE_READ_HEALTH_DATA_IN_BACKGROUND = 1;
    public static final int FEATURE_SKIN_TEMPERATURE = 2;
    public static final int FEATURE_STATUS_AVAILABLE = 2;
    public static final int FEATURE_STATUS_UNAVAILABLE = 1;

    int getFeatureStatus(int feature);

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001:\u0002\u0019\u001aB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u0016\u0010\t\u001a\u00020\u00058\u0006X\u0087T¢\u0006\b\n\u0000\u0012\u0004\b\n\u0010\u0003R\u0016\u0010\u000b\u001a\u00020\u00058\u0006X\u0087T¢\u0006\b\n\u0000\u0012\u0004\b\f\u0010\u0003R\u000e\u0010\r\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R&\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00150\u0014X\u0080\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0016\u0010\u0003\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u001b"}, d2 = {"Landroidx/health/connect/client/HealthConnectFeatures$Companion;", "", "<init>", "()V", "FEATURE_READ_HEALTH_DATA_IN_BACKGROUND", "", "FEATURE_SKIN_TEMPERATURE", "FEATURE_PLANNED_EXERCISE", "FEATURE_READ_HEALTH_DATA_HISTORY", "FEATURE_MINDFULNESS_SESSION", "getFEATURE_MINDFULNESS_SESSION$annotations", FeatureUtilsKt.FEATURE_CONSTANT_NAME_PHR, "getFEATURE_PERSONAL_HEALTH_RECORD$annotations", "FEATURE_STATUS_UNAVAILABLE", "FEATURE_STATUS_AVAILABLE", "SDK_EXT_13_PLATFORM_VERSION", "Landroidx/health/connect/client/feature/HealthConnectPlatformVersion;", "SDK_EXT_15_PLATFORM_VERSION", "SDK_EXT_16_PLATFORM_VERSION", "FEATURE_TO_VERSION_INFO_MAP", "", "Landroidx/health/connect/client/feature/HealthConnectVersionInfo;", "getFEATURE_TO_VERSION_INFO_MAP$connect_client_release$annotations", "getFEATURE_TO_VERSION_INFO_MAP$connect_client_release", "()Ljava/util/Map;", "Feature", "FeatureStatus", "connect-client_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();
        public static final int FEATURE_MINDFULNESS_SESSION = 5;
        public static final int FEATURE_PERSONAL_HEALTH_RECORD = 6;
        public static final int FEATURE_PLANNED_EXERCISE = 3;
        public static final int FEATURE_READ_HEALTH_DATA_HISTORY = 4;
        public static final int FEATURE_READ_HEALTH_DATA_IN_BACKGROUND = 1;
        public static final int FEATURE_SKIN_TEMPERATURE = 2;
        public static final int FEATURE_STATUS_AVAILABLE = 2;
        public static final int FEATURE_STATUS_UNAVAILABLE = 1;
        private static final Map<Integer, HealthConnectVersionInfo> FEATURE_TO_VERSION_INFO_MAP;
        private static final HealthConnectPlatformVersion SDK_EXT_13_PLATFORM_VERSION;
        private static final HealthConnectPlatformVersion SDK_EXT_15_PLATFORM_VERSION;
        private static final HealthConnectPlatformVersion SDK_EXT_16_PLATFORM_VERSION;

        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0000\b\u0087\u0002\u0018\u00002\u00020\u0001B\u0000¨\u0006\u0002"}, d2 = {"Landroidx/health/connect/client/HealthConnectFeatures$Companion$Feature;", "", "connect-client_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        @Retention(RetentionPolicy.SOURCE)
        @kotlin.annotation.Retention(AnnotationRetention.SOURCE)
        public @interface Feature {
        }

        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0000\b\u0087\u0002\u0018\u00002\u00020\u0001B\u0000¨\u0006\u0002"}, d2 = {"Landroidx/health/connect/client/HealthConnectFeatures$Companion$FeatureStatus;", "", "connect-client_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        @Retention(RetentionPolicy.SOURCE)
        @kotlin.annotation.Retention(AnnotationRetention.SOURCE)
        public @interface FeatureStatus {
        }

        public static /* synthetic */ void getFEATURE_MINDFULNESS_SESSION$annotations() {
        }

        public static /* synthetic */ void getFEATURE_PERSONAL_HEALTH_RECORD$annotations() {
        }

        public static /* synthetic */ void getFEATURE_TO_VERSION_INFO_MAP$connect_client_release$annotations() {
        }

        private Companion() {
        }

        static {
            HealthConnectPlatformVersion healthConnectPlatformVersion = new HealthConnectPlatformVersion(34, 13);
            SDK_EXT_13_PLATFORM_VERSION = healthConnectPlatformVersion;
            HealthConnectPlatformVersion healthConnectPlatformVersion2 = new HealthConnectPlatformVersion(34, 15);
            SDK_EXT_15_PLATFORM_VERSION = healthConnectPlatformVersion2;
            HealthConnectPlatformVersion healthConnectPlatformVersion3 = new HealthConnectPlatformVersion(34, 16);
            SDK_EXT_16_PLATFORM_VERSION = healthConnectPlatformVersion3;
            FEATURE_TO_VERSION_INFO_MAP = zae.e(yyz.c(1, new HealthConnectVersionInfo(171302L, healthConnectPlatformVersion)), yyz.c(2, new HealthConnectVersionInfo(null, healthConnectPlatformVersion, 1, null)), yyz.c(4, new HealthConnectVersionInfo(171302L, healthConnectPlatformVersion)), yyz.c(3, new HealthConnectVersionInfo(null, healthConnectPlatformVersion, 1, null)), yyz.c(5, new HealthConnectVersionInfo(null, healthConnectPlatformVersion2, 1, null)), yyz.c(6, new HealthConnectVersionInfo(null, healthConnectPlatformVersion3, 1, null)));
        }

        public final Map<Integer, HealthConnectVersionInfo> getFEATURE_TO_VERSION_INFO_MAP$connect_client_release() {
            return FEATURE_TO_VERSION_INFO_MAP;
        }
    }
}
