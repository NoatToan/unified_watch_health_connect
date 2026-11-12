package androidx.health.connect.client.records;

import defpackage.yyz;
import defpackage.zae;
import java.util.Map;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010$\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0011X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0011X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0011X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0011X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0011X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0011X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0011X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u0011X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u0011X\u0080T¢\u0006\u0002\n\u0000R\u001c\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00050\u001c8\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00110\u001c8\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001e"}, d2 = {"Landroidx/health/connect/client/records/BodyTemperatureMeasurementLocation;", "", "<init>", "()V", "MEASUREMENT_LOCATION_UNKNOWN", "", "MEASUREMENT_LOCATION_ARMPIT", "MEASUREMENT_LOCATION_FINGER", "MEASUREMENT_LOCATION_FOREHEAD", "MEASUREMENT_LOCATION_MOUTH", "MEASUREMENT_LOCATION_RECTUM", "MEASUREMENT_LOCATION_TEMPORAL_ARTERY", "MEASUREMENT_LOCATION_TOE", "MEASUREMENT_LOCATION_EAR", "MEASUREMENT_LOCATION_WRIST", "MEASUREMENT_LOCATION_VAGINA", "ARMPIT", "", "FINGER", "FOREHEAD", "MOUTH", "RECTUM", "TEMPORAL_ARTERY", "TOE", "EAR", "WRIST", "VAGINA", "MEASUREMENT_LOCATION_STRING_TO_INT_MAP", "", "MEASUREMENT_LOCATION_INT_TO_STRING_MAP", "connect-client_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class BodyTemperatureMeasurementLocation {
    public static final String ARMPIT = "armpit";
    public static final String EAR = "ear";
    public static final String FINGER = "finger";
    public static final String FOREHEAD = "forehead";
    public static final BodyTemperatureMeasurementLocation INSTANCE = new BodyTemperatureMeasurementLocation();
    public static final int MEASUREMENT_LOCATION_ARMPIT = 1;
    public static final int MEASUREMENT_LOCATION_EAR = 8;
    public static final int MEASUREMENT_LOCATION_FINGER = 2;
    public static final int MEASUREMENT_LOCATION_FOREHEAD = 3;
    public static final Map<Integer, String> MEASUREMENT_LOCATION_INT_TO_STRING_MAP;
    public static final int MEASUREMENT_LOCATION_MOUTH = 4;
    public static final int MEASUREMENT_LOCATION_RECTUM = 5;
    public static final Map<String, Integer> MEASUREMENT_LOCATION_STRING_TO_INT_MAP;
    public static final int MEASUREMENT_LOCATION_TEMPORAL_ARTERY = 6;
    public static final int MEASUREMENT_LOCATION_TOE = 7;
    public static final int MEASUREMENT_LOCATION_UNKNOWN = 0;
    public static final int MEASUREMENT_LOCATION_VAGINA = 10;
    public static final int MEASUREMENT_LOCATION_WRIST = 9;
    public static final String MOUTH = "mouth";
    public static final String RECTUM = "rectum";
    public static final String TEMPORAL_ARTERY = "temporal_artery";
    public static final String TOE = "toe";
    public static final String VAGINA = "vagina";
    public static final String WRIST = "wrist";

    private BodyTemperatureMeasurementLocation() {
    }

    static {
        Map<String, Integer> mapE = zae.e(yyz.c(ARMPIT, 1), yyz.c(FINGER, 2), yyz.c(FOREHEAD, 3), yyz.c(MOUTH, 4), yyz.c(RECTUM, 5), yyz.c(TEMPORAL_ARTERY, 6), yyz.c(TOE, 7), yyz.c(EAR, 8), yyz.c(WRIST, 9), yyz.c(VAGINA, 10));
        MEASUREMENT_LOCATION_STRING_TO_INT_MAP = mapE;
        MEASUREMENT_LOCATION_INT_TO_STRING_MAP = UtilsKt.reverse(mapE);
    }
}
