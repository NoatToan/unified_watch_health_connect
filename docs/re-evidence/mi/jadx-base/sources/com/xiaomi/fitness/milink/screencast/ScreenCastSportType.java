package com.xiaomi.fitness.milink.screencast;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\n\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lcom/xiaomi/fitness/milink/screencast/ScreenCastSportType;", "", "<init>", "()V", "INVALID_TYPE", "", "TREADMILL", "EXERCISE_BIKE", "INTELLIGENT_ROPE", "INDOOR_RUNNING", "SPORT_OTHER", "ELLIPTICAL_MACHINE", "ROWING_MACHINE", "ROPE_SKIPPING", "HIGH_INTERVAL_TRAINING", "milink_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ScreenCastSportType {
    public static final int ELLIPTICAL_MACHINE = 5;
    public static final int EXERCISE_BIKE = 1;
    public static final int HIGH_INTERVAL_TRAINING = 8;
    public static final int INDOOR_RUNNING = 3;

    @NotNull
    public static final ScreenCastSportType INSTANCE = new ScreenCastSportType();
    public static final int INTELLIGENT_ROPE = 2;
    public static final int INVALID_TYPE = -1;
    public static final int ROPE_SKIPPING = 7;
    public static final int ROWING_MACHINE = 6;
    public static final int SPORT_OTHER = 4;
    public static final int TREADMILL = 0;

    private ScreenCastSportType() {
    }
}
