package com.huami.bloodpressure_core.p002const;

import com.amazon.identity.auth.map.device.token.MAPCookie;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.huami.android.zxing.Intents;
import com.huami.ecg.core.model.constant.MeasureContentType;
import com.huami.hmchartui.utils.Constant;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\r\bÆ\u0002\u0018\u00002\u00020\u0001:\u0007\u0010\u0011\u0012\u0013\u0014\u0015\u0016B\t\b\u0002¢\u0006\u0004\b\u000e\u0010\u000fR!\u0010\b\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007R\u0016\u0010\t\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\u0005R\u0016\u0010\u000b\u001a\u00020\n8\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0016\u0010\r\u001a\u00020\n8\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\r\u0010\f¨\u0006\u0017"}, d2 = {"Lcom/huami/bloodpressure_core/const/BloodPressureConst;", "", "", "kotlin.jvm.PlatformType", "a", "Ljava/lang/String;", "getTAG", "()Ljava/lang/String;", "TAG", "RESEARCH_PLANID", "", "UPLOAD_LIMIT_DEVICE", LogUtil.I, "UPLOAD_LIMIT_NIGHT", "<init>", "()V", "DataSource", "ParamKey", "ParamValue", MAPCookie.KEY_PATH, "RemoteDataSource", "SharedKey", "UserProperty", "bloodpressure-core_release"}, k = 1, mv = {1, 5, 1})
public final class BloodPressureConst {

    @NotNull
    public static final String RESEARCH_PLANID = "2";
    public static final int UPLOAD_LIMIT_DEVICE = 100;
    public static final int UPLOAD_LIMIT_NIGHT = 200;

    @NotNull
    public static final BloodPressureConst INSTANCE = new BloodPressureConst();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private static final String TAG = BloodPressureConst.class.getSimpleName();

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\b\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tR\u0016\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0016\u0010\u0005\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0016\u0010\u0006\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u0016\u0010\u0007\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0004¨\u0006\n"}, d2 = {"Lcom/huami/bloodpressure_core/const/BloodPressureConst$DataSource;", "", "", "BLOOD_PRESSURE_SOURCEV2", LogUtil.I, "BLOOD_PRESSURE_SOURCEV1", "BLOOD_PRESSURE_SOURCE_DEVICE", "BLOOD_PRESSURE_SOURCE_NIGHT", "<init>", "()V", "bloodpressure-core_release"}, k = 1, mv = {1, 5, 1})
    public static final class DataSource {
        public static final int BLOOD_PRESSURE_SOURCEV1 = 2;
        public static final int BLOOD_PRESSURE_SOURCEV2 = 0;
        public static final int BLOOD_PRESSURE_SOURCE_DEVICE = 1;
        public static final int BLOOD_PRESSURE_SOURCE_NIGHT = 3;

        @NotNull
        public static final DataSource INSTANCE = new DataSource();

        private DataSource() {
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0013\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0016\u0010\u0005\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0016\u0010\u0006\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u0016\u0010\u0007\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0004R\u0016\u0010\b\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0004R\u0016\u0010\t\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\u0004R\u0016\u0010\n\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u0004R\u0016\u0010\u000b\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0004R\u0016\u0010\f\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\u0004R\u0016\u0010\r\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\r\u0010\u0004R\u0016\u0010\u000e\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000e\u0010\u0004R\u0016\u0010\u000f\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000f\u0010\u0004R\u0016\u0010\u0010\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0010\u0010\u0004R\u0016\u0010\u0011\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0011\u0010\u0004R\u0016\u0010\u0012\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0004¨\u0006\u0015"}, d2 = {"Lcom/huami/bloodpressure_core/const/BloodPressureConst$ParamKey;", "", "", "SUB_TYPE", "Ljava/lang/String;", "EVENT_TYPE", "FROM", "TO", "NEXT", "LIMIT", "REVERSE", Constant.USER_ID, "TIMESTAMP", "CONTENT_TYPE", "PLANID", "TODATE", "DAYS", "MEASURETIME", Intents.WifiConnect.TYPE, "<init>", "()V", "bloodpressure-core_release"}, k = 1, mv = {1, 5, 1})
    public static final class ParamKey {

        @NotNull
        public static final String CONTENT_TYPE = "Content-Type";

        @NotNull
        public static final String DAYS = "days";

        @NotNull
        public static final String EVENT_TYPE = "eventType";

        @NotNull
        public static final String FROM = "from";

        @NotNull
        public static final ParamKey INSTANCE = new ParamKey();

        @NotNull
        public static final String LIMIT = "limit";

        @NotNull
        public static final String MEASURETIME = "measureTime";

        @NotNull
        public static final String NEXT = "next";

        @NotNull
        public static final String PLANID = "planId";

        @NotNull
        public static final String REVERSE = "reverse";

        @NotNull
        public static final String SUB_TYPE = "subType";

        @NotNull
        public static final String TIMESTAMP = "timestamp";

        @NotNull
        public static final String TO = "to";

        @NotNull
        public static final String TODATE = "toDate";

        @NotNull
        public static final String TYPE = "type";

        @NotNull
        public static final String USER_ID = "userId";

        private ParamKey() {
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\n\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\n\u0010\u000bR\u0016\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0016\u0010\u0005\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0016\u0010\u0006\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u0016\u0010\u0007\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0004R\u0016\u0010\b\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0004R\u0016\u0010\t\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\u0004¨\u0006\f"}, d2 = {"Lcom/huami/bloodpressure_core/const/BloodPressureConst$ParamValue;", "", "", MeasureContentType.BLOOD_PRESSURE, "Ljava/lang/String;", "HEALTH_DATA", "REAL_DATA", "MANUALLY_ADD_DATA", "ALL_DAY", "CONTENT_TYPE_VALUE", "<init>", "()V", "bloodpressure-core_release"}, k = 1, mv = {1, 5, 1})
    public static final class ParamValue {

        @NotNull
        public static final String ALL_DAY = "all_day";

        @NotNull
        public static final String BLOOD_PRESSURE = "blood_pressure";

        @NotNull
        public static final String CONTENT_TYPE_VALUE = "application/x-www-form-urlencoded";

        @NotNull
        public static final String HEALTH_DATA = "health_data";

        @NotNull
        public static final ParamValue INSTANCE = new ParamValue();

        @NotNull
        public static final String MANUALLY_ADD_DATA = "manually_add_data";

        @NotNull
        public static final String REAL_DATA = "real_data";

        private ParamValue() {
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\t\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\t\u0010\nR\u0016\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0016\u0010\u0005\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0016\u0010\u0006\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u0016\u0010\u0007\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0004R\u0016\u0010\b\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0004¨\u0006\u000b"}, d2 = {"Lcom/huami/bloodpressure_core/const/BloodPressureConst$Path;", "", "", "USER_EVENTS", "Ljava/lang/String;", "USER_EVENTS_V2", "USER_EVENTS_NIGHT", "DELETE_USER_EVENT", "RESEARCH_EVENT", "<init>", "()V", "bloodpressure-core_release"}, k = 1, mv = {1, 5, 1})
    public static final class Path {

        @NotNull
        public static final String DELETE_USER_EVENT = "users/{userId}/event/{eventType}";

        @NotNull
        public static final Path INSTANCE = new Path();

        @NotNull
        public static final String RESEARCH_EVENT = "health/research/plan/{planId}";

        @NotNull
        public static final String USER_EVENTS = "users/{userId}/events";

        @NotNull
        public static final String USER_EVENTS_NIGHT = "users/me/bloodPressure";

        @NotNull
        public static final String USER_EVENTS_V2 = "v2/users/me/events";

        private Path() {
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007R\u0016\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0016\u0010\u0005\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004¨\u0006\b"}, d2 = {"Lcom/huami/bloodpressure_core/const/BloodPressureConst$RemoteDataSource;", "", "", "BLOOD_PRESSURE_TIME", LogUtil.I, "BLOOD_PRESSURE_NIGHT", "<init>", "()V", "bloodpressure-core_release"}, k = 1, mv = {1, 5, 1})
    public static final class RemoteDataSource {
        public static final int BLOOD_PRESSURE_NIGHT = 1;
        public static final int BLOOD_PRESSURE_TIME = 0;

        @NotNull
        public static final RemoteDataSource INSTANCE = new RemoteDataSource();

        private RemoteDataSource() {
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0016\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0016\u0010\u0005\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0016\u0010\u0006\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004¨\u0006\t"}, d2 = {"Lcom/huami/bloodpressure_core/const/BloodPressureConst$SharedKey;", "", "", SharedKey.SHARED_TIMESTAMP_V1, "Ljava/lang/String;", SharedKey.SHARED_TIMESTAMP_V2, SharedKey.SHARED_TIMESTAMP_DEVICE, "<init>", "()V", "bloodpressure-core_release"}, k = 1, mv = {1, 5, 1})
    public static final class SharedKey {

        @NotNull
        public static final SharedKey INSTANCE = new SharedKey();

        @NotNull
        public static final String SHARED_TIMESTAMP_DEVICE = "SHARED_TIMESTAMP_DEVICE";

        @NotNull
        public static final String SHARED_TIMESTAMP_V1 = "SHARED_TIMESTAMP_V1";

        @NotNull
        public static final String SHARED_TIMESTAMP_V2 = "SHARED_TIMESTAMP_V2";

        private SharedKey() {
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\b\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tR\u0016\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0016\u0010\u0005\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0016\u0010\u0006\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u0016\u0010\u0007\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0004¨\u0006\n"}, d2 = {"Lcom/huami/bloodpressure_core/const/BloodPressureConst$UserProperty;", "", "", "KEY_MEASURED_DATA", "Ljava/lang/String;", "KEY_MEASURED_RAW_DATA", "KEY_CALIBRATION_DATA", "KEY_CALIBRATION_FEATURE_DATA", "<init>", "()V", "bloodpressure-core_release"}, k = 1, mv = {1, 5, 1})
    public static final class UserProperty {

        @NotNull
        public static final UserProperty INSTANCE = new UserProperty();

        @NotNull
        public static final String KEY_CALIBRATION_DATA = "huami.mifit.user.settings.healthData.bloodPressure.calibrationData.time";

        @NotNull
        public static final String KEY_CALIBRATION_FEATURE_DATA = "huami.mifit.user.settings.healthData.bloodPressure.calibrationFeaturesData.time";

        @NotNull
        public static final String KEY_MEASURED_DATA = "huami.mifit.user.settings.healthData.bloodPressure.measuredData.time";

        @NotNull
        public static final String KEY_MEASURED_RAW_DATA = "huami.mifit.user.settings.healthData.bloodPressure.measuredRawData.time";

        private UserProperty() {
        }
    }

    private BloodPressureConst() {
    }

    public final String getTAG() {
        return TAG;
    }
}
