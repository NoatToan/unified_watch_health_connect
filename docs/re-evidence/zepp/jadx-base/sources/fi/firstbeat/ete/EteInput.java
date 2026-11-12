package fi.firstbeat.ete;

import fi.firstbeat.common.FbtFixedMath;

/* JADX INFO: loaded from: classes22.dex */
public class EteInput {
    public static final int UNKNOWN_HR = 0;
    public static final int UNKNOWN_HR_QUALITY = -1;
    public static final int UNKNOWN_POWER = 0;
    public static final int UNKNOWN_RRI = 0;
    public static final int UNKNOWN_SPEED = 0;
    public static final int UNKNOWN_STEP_RATE = 0;
    public static final int UNKNOWN_ALTITUDE = FbtFixedMath.itofx(20000);
    public static final AltitudeSource UNKNOWN_ALTITUDE_SOURCE = AltitudeSource.DEFAULT;
    public static final UserState UNKNOWN_USER_STATE = UserState.NOT_AVAILABLE;
    public int rri = 0;
    public int hr = 0;
    public int hrQuality = -1;
    public AltitudeSource altitudeSource = UNKNOWN_ALTITUDE_SOURCE;
    public UserState userState = UNKNOWN_USER_STATE;
    public int speed = 0;
    public int altitude = UNKNOWN_ALTITUDE;
    public int power = 0;
    public int stepRate = 0;

    public enum AltitudeSource {
        DEFAULT,
        BAROMETER
    }

    public enum UserState {
        NOT_AVAILABLE,
        RUNNING,
        CYCLING,
        STRENGTH_TRAINING,
        EXERCISE,
        SLEEP
    }
}
