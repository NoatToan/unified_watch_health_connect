package com.xiaomi.fitness.util;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010\u000e\n\u0002\b\u000b\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0003\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0004\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0005\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0006\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0007\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\b\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\t\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\n\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u000b\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\f\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\r\u001a\u00020\u000eX\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u000f\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0010\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0011\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0012\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0013\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0014\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0015\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0016\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0017\u001a\u00020\u000eX\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0018\u001a\u00020\u000eX\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0019"}, d2 = {"TRAIL_SPORT_RUN_INDOOR", "", "TRAIL_SPORT_RUN_OUTDOOR", "TRAIL_SPORT_WALK", "TRAIL_SPORT_RIDE", "TRAIL_SPORT_CLIMB_STAIRS", "TRAIL_SPORT_FREE_TRAIN", "TRAIL_SPORT_FREESTYLE", "TRAIL_SPORT_BUTTERFLY_STROKE", "TRAIL_SPORT_BREASTSTROKE", "TRAIL_SPORT_MEDLEY_STROKE", "TRAIL_SPORT_BACKSTROKE", "TRAIL_SPORT_SWIM", "UNKNOWN_USER", "", "WALK_SLOW_STEP_PER_MINUTE", "WALK_FAST_STEP_PER_MINUTE", "RUN_SLOW_STEP_PER_MINUTE", "RUN_FAST_STEP_PER_MINUTE", "STAIR_CLIMB_PER_MINUTE", "RIDDING_SLOW_STEP_PER_MINUTE", "RIDDING_FAST_STEP_PER_MINUTE", "SWIMMING_SPEED", "TRAIL_ADD_MORE_TYPE", "TRAIL_ADD_MORE_RECORD", "sport-record_chinaProductRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class AddTrailHelperKt {
    private static final int RIDDING_FAST_STEP_PER_MINUTE = 80;
    private static final int RIDDING_SLOW_STEP_PER_MINUTE = 70;
    private static final int RUN_FAST_STEP_PER_MINUTE = 170;
    private static final int RUN_SLOW_STEP_PER_MINUTE = 140;
    private static final int STAIR_CLIMB_PER_MINUTE = 80;
    public static final int SWIMMING_SPEED = 42;

    @NotNull
    public static final String TRAIL_ADD_MORE_RECORD = "trail_add_more_duration";

    @NotNull
    public static final String TRAIL_ADD_MORE_TYPE = "trail_add_more_type";
    public static final int TRAIL_SPORT_BACKSTROKE = 10;
    public static final int TRAIL_SPORT_BREASTSTROKE = 8;
    public static final int TRAIL_SPORT_BUTTERFLY_STROKE = 7;
    public static final int TRAIL_SPORT_CLIMB_STAIRS = 4;
    public static final int TRAIL_SPORT_FREESTYLE = 6;
    public static final int TRAIL_SPORT_FREE_TRAIN = 5;
    public static final int TRAIL_SPORT_MEDLEY_STROKE = 9;
    public static final int TRAIL_SPORT_RIDE = 3;
    public static final int TRAIL_SPORT_RUN_INDOOR = 1;
    public static final int TRAIL_SPORT_RUN_OUTDOOR = 12;
    public static final int TRAIL_SPORT_SWIM = 11;
    public static final int TRAIL_SPORT_WALK = 2;

    @NotNull
    public static final String UNKNOWN_USER = "unknown_user";
    private static final int WALK_FAST_STEP_PER_MINUTE = 130;
    private static final int WALK_SLOW_STEP_PER_MINUTE = 80;
}
