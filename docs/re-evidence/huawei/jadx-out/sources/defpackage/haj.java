package defpackage;

import com.huawei.health.health.constants.ObserveLabels;
import com.huawei.health.servicesui.R;
import java.util.HashMap;

/* JADX INFO: loaded from: classes8.dex */
public class haj {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final HashMap<String, a> f36312c;

    static {
        HashMap<String, a> map = new HashMap<>();
        f36312c = map;
        map.put("TIME", new a(R.mipmap.clock_fill_select));
        map.put("OAL_TIME", new a(R.mipmap.clock_fill_select));
        map.put("CALORIES", new a(R.mipmap.sport_total_calories_select));
        map.put("ACTIVE_CALORIES", new a(R.mipmap.sport_active_calories_select));
        map.put(ObserveLabels.HEART_RATE, new a(R.mipmap.avg_heart_rate_select));
        map.put("DISTANCE", new a(R.mipmap.distance_fill_select));
        map.put("EXP_DISTANCE", new a(R.mipmap.distance_fill_select));
        map.put("EXP_AVERAGE_SPEED", new a(R.mipmap.average_speed_fill_select));
        map.put("ACTIVE_TIME", new a(R.mipmap.clock_fill_select));
        map.put("ACTIVE_TIME_RATIO", new a(R.mipmap.active_time_ratio_select));
        map.put("AVERAGE_PACE", new a(R.mipmap.average_pace_fill_select));
        map.put("AVERAGE_PACE_500", new a(R.mipmap.average_pace_fill_select));
        map.put("AVERAGE_SPEED", new a(R.mipmap.average_speed_fill_select));
        map.put("AVERAGE_POWER", new a(R.mipmap.average_power_select));
        map.put("AVERAGE_POWER_ANALOG", new a(R.mipmap.average_analog_power_select));
        map.put("AVERAGE_ANALOG_CADENCE", new a(R.drawable.average_analog_cadence_select));
        map.put("AVERAGE_SLOPE", new a(R.mipmap.max_slope_select, true));
        map.put("AVG_UP_SLOPE", new a(R.mipmap.up_slope_select, true));
        map.put("AVG_DOWN_SLOPE", new a(R.mipmap.down_slope_select, true));
        map.put("SLOPE_RANGE", new a(R.mipmap.slope_range_select));
        map.put("SCORE", new a(R.mipmap.score_select));
        map.put("GRADE_EVALUATION", new a(R.mipmap.grade_evaluation_select));
        map.put("AVERAGE_STROKE_RATE", new a(R.mipmap.average_stroke_rate));
        map.put("AVERAGE_SWOLF", new a(R.mipmap.swolf_select));
        map.put("AVERAGE_CADENCE", new a(R.mipmap.cadence_fill_select));
        map.put("AVERAGE_STEP_RATE", new a(R.mipmap.average_step_frequency_fill_select));
        map.put("PADDLE_FREQUENCY", new a(R.mipmap.paddle_frequency_select));
        map.put("TOTAL_PADDLE", new a(R.mipmap.total_paddle_select));
        map.put("STRIDE_ITEM", new a(R.mipmap.avg_stride_select));
        map.put("TOTAL_STEPS", new a(R.mipmap.steps_fill_select, true));
        map.put("TOTAL_CREEP", new a(R.mipmap.maximum_slope_select, true));
        map.put("TOTAL_DESCENT", new a(R.mipmap.total_descent_fill_select, true));
        map.put("STROKE_TYPE", new a(R.mipmap.main_swim_select));
        map.put("STROKE_TIMES", new a(R.mipmap.swolf_times_select));
        map.put("POOL_LENGTH", new a(R.mipmap.pool_width_select));
        map.put("LAPS", new a(R.mipmap.swimming_trips_select));
        map.put("GOAL_DETAIL", new a(R.mipmap.goal_detail_select));
        map.put("BASKETBALL_JUMP_HEIGHT", new a(R.mipmap.basketball_jump_height_select));
        map.put("BASKETBALL_JUMP_TIMES", new a(R.mipmap.basketball_jump_times_select));
        map.put("BASKETBALL_JUMP_TIME", new a(R.mipmap.basketball_jump_time_select));
        map.put("SKIPPING_ROPE_COUNT", new a(R.mipmap.figure_jumprope_select));
        map.put("SKIPPING_ROPE_AVERAGE_SPEED", new a(R.mipmap.average_speed_fill_select));
        map.put("SKIPPING_ROPE_INTERRUPT_TIMES", new a(R.mipmap.rope_interrupt_times_select));
        map.put("SKIPPING_ROPE_MAX_JUMPS", new a(R.mipmap.rope_jumps_select));
        map.put("SKIPPING_ROPE_SINGLE_MODE", new a(R.mipmap.rope_single_mode_select));
        map.put("SKIPPING_ROPE_DOUBLE_MODE", new a(R.mipmap.rope_double_mode_select));
        map.put("SWING_TOTAL_COUNT", new a(R.mipmap.golfclub_ball_select));
        map.put("AVERAGE_SWING_TEMPO", new a(R.mipmap.golf_swing_tempo_select));
        map.put("SWING_BACK_TIME", new a(R.mipmap.golf_swing_back_time_select));
        map.put("SWING_DOWN_TIME", new a(R.mipmap.golf_swing_down_time_select, false));
        map.put("AVERAGE_SWING_SPEED", new a(R.mipmap.golf_swing_average_speed_select));
        map.put("MAX_SWING_SPEED", new a(R.mipmap.golf_swing_max_speed_select));
        map.put("RIDE_TIME", new a(R.mipmap.clock_fill_select));
        map.put("SKI_TIME", new a(R.mipmap.clock_fill_select));
        map.put("AVERAGE_SKI_SPEED", new a(R.mipmap.average_speed_fill_select));
        map.put("SKI_LAPS", new a(R.mipmap.swimming_trips_select, true));
        map.put("MAX_SLOPE", new a(R.mipmap.max_slope_select, true));
        map.put("PEAK_WEIGHT", new a(R.mipmap.peak_weight_select));
        map.put("TOTAL_ACTION_GROUP", new a(R.mipmap.total_action_group_select));
        map.put("FINISHED_GROUPS", new a(R.mipmap.finish_group_select));
        map.put("TRAINING_ACTION_COUNT", new a(R.mipmap.training_action_count_select));
        map.put("FINISH_PERCENT", new a(R.mipmap.finish_percent));
        map.put("AVERAGE_DRIVE_DISTANCE", new a(R.mipmap.average_drive_distance, true));
        map.put("DRIVE_TIMES", new a(R.mipmap.drive_times, true));
        map.put("DRIVE_RATE", new a(R.mipmap.drive_rate, true));
        map.put("LOAD_PEAK", new a(R.mipmap.load_peak));
        map.put("RUNNING_ABILITY", new a(R.mipmap.single_running_power_share));
        map.put("AVG_SHOT_SPEED", new a(R.mipmap.ic_avg_shot_speed_select));
        map.put("MAX_SHOT_SPEED", new a(R.mipmap.ic_max_shot_speed_select));
        map.put("SHOTS", new a(R.mipmap.ic_shots_select));
        map.put("FOREHAND_STROKE", new a(R.mipmap.ic_forehand_stroke_select));
        map.put("BACKHAND_STROKE", new a(R.mipmap.ic_backhand_stroke_select));
        map.put("OVERHAND_STROKE", new a(R.mipmap.ic_overhand_stroke_select));
        map.put("UNDERHAND_STROKE", new a(R.mipmap.ic_underhand_stroke_select));
        map.put("SMASH", new a(R.mipmap.ic_smash_select));
        map.put("HIGH_CLEAR", new a(R.mipmap.ic_high_clear_select));
        map.put("BADMINTON_MAX_CONTINUOUS_RALLY", new a(R.mipmap.ic_max_continuous_rally_select_badminton));
        map.put("ACTION_COUNT", new a(R.mipmap.ic_action_count_select));
        map.put("RPE", new a(R.mipmap.ic_rpe_select));
        map.put("TOTAL_TRAINING_VOLUME", new a(R.mipmap.ic_total_training_volume_select));
        map.put("TOTAL_ACTION_GROUPS", new a(R.mipmap.ic_total_action_groups_select));
        map.put("FLOORS", new a(R.mipmap.ic_floors_select));
        map.put("AVG_FLOORS_SPEED", new a(R.mipmap.ic_avg_floor_speed_select));
        map.put("JUMP_TIMES", new a(R.mipmap.ic_jump_times_select));
        map.put("MAX_JUMP_HEIGHT", new a(R.mipmap.ic_max_jump_height_select));
        map.put("SPRINT_TIMES", new a(R.mipmap.ic_sprint_times_select));
        map.put("MAX_ACCELERATION", new a(R.mipmap.ic_max_acceleration_select));
        map.put("TURN_SPEEDUP_TIMES", new a(R.mipmap.ic_turn_speed_up_times_select));
        map.put("SWERVE_SPEEDUP_TIMES", new a(R.mipmap.ic_swerve_speed_up_times_select));
        map.put("PLAYER_POSITION", new a(R.mipmap.ic_player_position_select));
        map.put("GOALS_TIMES", new a(R.mipmap.ic_goals_times_select));
        map.put("ASSISTS_TIMES", new a(R.mipmap.ic_assists_times_select));
        map.put("SAVES_TIMES", new a(R.mipmap.ic_saves_times_select));
        map.put("SERVE", new a(R.mipmap.ic_serve_select));
        map.put("FOREHAND", new a(R.mipmap.ic_forehand_select));
        map.put("FOREHAND_TOPSPIN", new a(R.mipmap.ic_forehand_topspin_select));
        map.put("FOREHAND_FLAT", new a(R.mipmap.ic_forehand_flat_select));
        map.put("TENNIS_FOREHAND_BACKSPIN", new a(R.mipmap.ic_forehand_backspin_select_tennis));
        map.put("TENNIS_FOREHAND_VOLLEY", new a(R.mipmap.ic_forehand_volley_select_tennis));
        map.put("BACKHAND", new a(R.mipmap.ic_backhand_select));
        map.put("BACKHAND_TOPSPIN", new a(R.mipmap.ic_backhand_topspin_select));
        map.put("TENNIS_BACKHAND_BACKSPIN", new a(R.mipmap.ic_backhand_backspin_select_tennis));
        map.put("TENNIS_BACKHAND_VOLLEY", new a(R.mipmap.ic_backhand_volley_select_tennis));
        map.put("TENNIS_SWING_TIMES", new a(R.mipmap.ic_swing_times_select_tennis));
        map.put("TENNIS_MAX_CONTINUOUS_RALLY", new a(R.mipmap.ic_max_continuous_rally_select_tennis));
        map.put("PICKLE_BALL_FOREHAND", new a(R.mipmap.ic_forehand_select_pickleball));
        map.put("FOREHAND_DROP", new a(R.mipmap.ic_forehand_drop_select));
        map.put("FOREHAND_DRIVE", new a(R.mipmap.ic_forehand_drive_select));
        map.put("PICKLE_BALL_FOREHAND_BACKSPIN", new a(R.mipmap.ic_forehand_backspin_select_pickleball));
        map.put("PICKLE_BALL_FOREHAND_VOLLEY", new a(R.mipmap.ic_forehand_volley_select_pickleball));
        map.put("PICKLE_BALL_BACKHAND", new a(R.mipmap.ic_backhand_select_pickleball));
        map.put("BACKHAND_DROP", new a(R.mipmap.ic_backhand_drop_select));
        map.put("BACKHAND_DRIVE", new a(R.mipmap.ic_backhand_drive_select));
        map.put("PICKLE_BALL_BACKHAND_BACKSPIN", new a(R.mipmap.ic_backhand_backspin_select_pickleball));
        map.put("PICKLE_BALL_BACKHAND_VOLLEY", new a(R.mipmap.ic_backhand_volley_select_pickleball));
        map.put("SWING_SPEED", new a(R.mipmap.ic_swing_speed_select));
        map.put("PICKLE_BALL_SWING_TIMES", new a(R.mipmap.ic_swing_times_select_pickleball));
        map.put("PICKLE_BALL_MAX_CONTINUOUS_RALLY", new a(R.mipmap.ic_max_continuous_rally_select_pickleball));
        map.put("MAX_SPEED", new a(R.mipmap.ic_max_speed_select));
        map.put("TOTAL_TURN_NUMBER", new a(R.mipmap.ic_total_turn_number_select, true));
        map.put("TURN_FREQUENCY", new a(R.mipmap.ic_turn_frequency_select, true));
        map.put("LONG_RADIUS_TURN", new a(R.mipmap.ic_long_radius_turn_select, true));
        map.put("SHORT_RADIUS_TURN", new a(R.mipmap.ic_short_radius_turn_select, true));
        map.put("MAX_G_FORCE", new a(R.mipmap.ic_max_g_force_select));
        map.put("LEFT_TURN_COUNT", new a(R.mipmap.ic_left_turn_count_select));
        map.put("RIGHT_TURN_COUNT", new a(R.mipmap.ic_right_turn_count_select));
    }

    public static a c(String str) {
        return f36312c.get(str);
    }

    public static class a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private boolean f36313b;
        private int e;

        public a(int i, boolean z) {
            this.e = i;
            this.f36313b = z;
        }

        public a(int i) {
            this.e = i;
            this.f36313b = false;
        }

        public int e() {
            return this.e;
        }

        public boolean a() {
            return this.f36313b;
        }
    }
}
