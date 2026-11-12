package bs2;

/* JADX INFO: loaded from: classes11.dex */
public class qb extends bk {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final bk f20429e;

    static {
        bk bkVar = new bk("exercise_title", 264);
        f20429e = bkVar;
        bkVar.e(new rc("message_index", 254, 132, 1.0d, 0.0d, "", false, zn.MESSAGE_INDEX));
        bkVar.e(new rc("exercise_category", 0, 132, 1.0d, 0.0d, "", false, zn.EXERCISE_CATEGORY));
        zn znVar = zn.UINT16;
        bkVar.e(new rc("exercise_name", 1, 132, 1.0d, 0.0d, "", false, znVar));
        bkVar.f19753c.get(2).f20460i.add(new pw("bench_press_exercise_name", 132, 1.0d, 0.0d, ""));
        bkVar.f19753c.get(2).f20460i.get(0).b(0, 0L);
        bkVar.f19753c.get(2).f20460i.add(new pw("calf_raise_exercise_name", 132, 1.0d, 0.0d, ""));
        bkVar.f19753c.get(2).f20460i.get(1).b(0, 1L);
        bkVar.f19753c.get(2).f20460i.add(new pw("cardio_exercise_name", 132, 1.0d, 0.0d, ""));
        bkVar.f19753c.get(2).f20460i.get(2).b(0, 2L);
        bkVar.f19753c.get(2).f20460i.add(new pw("carry_exercise_name", 132, 1.0d, 0.0d, ""));
        bkVar.f19753c.get(2).f20460i.get(3).b(0, 3L);
        bkVar.f19753c.get(2).f20460i.add(new pw("chop_exercise_name", 132, 1.0d, 0.0d, ""));
        bkVar.f19753c.get(2).f20460i.get(4).b(0, 4L);
        bkVar.f19753c.get(2).f20460i.add(new pw("core_exercise_name", 132, 1.0d, 0.0d, ""));
        bkVar.f19753c.get(2).f20460i.get(5).b(0, 5L);
        bkVar.f19753c.get(2).f20460i.add(new pw("crunch_exercise_name", 132, 1.0d, 0.0d, ""));
        bkVar.f19753c.get(2).f20460i.get(6).b(0, 6L);
        bkVar.f19753c.get(2).f20460i.add(new pw("curl_exercise_name", 132, 1.0d, 0.0d, ""));
        bkVar.f19753c.get(2).f20460i.get(7).b(0, 7L);
        bkVar.f19753c.get(2).f20460i.add(new pw("deadlift_exercise_name", 132, 1.0d, 0.0d, ""));
        bkVar.f19753c.get(2).f20460i.get(8).b(0, 8L);
        bkVar.f19753c.get(2).f20460i.add(new pw("flye_exercise_name", 132, 1.0d, 0.0d, ""));
        bkVar.f19753c.get(2).f20460i.get(9).b(0, 9L);
        bkVar.f19753c.get(2).f20460i.add(new pw("hip_raise_exercise_name", 132, 1.0d, 0.0d, ""));
        bkVar.f19753c.get(2).f20460i.get(10).b(0, 10L);
        bkVar.f19753c.get(2).f20460i.add(new pw("hip_stability_exercise_name", 132, 1.0d, 0.0d, ""));
        bkVar.f19753c.get(2).f20460i.get(11).b(0, 11L);
        bkVar.f19753c.get(2).f20460i.add(new pw("hip_swing_exercise_name", 132, 1.0d, 0.0d, ""));
        bkVar.f19753c.get(2).f20460i.get(12).b(0, 12L);
        bkVar.f19753c.get(2).f20460i.add(new pw("hyperextension_exercise_name", 132, 1.0d, 0.0d, ""));
        bkVar.f19753c.get(2).f20460i.get(13).b(0, 13L);
        bkVar.f19753c.get(2).f20460i.add(new pw("lateral_raise_exercise_name", 132, 1.0d, 0.0d, ""));
        bkVar.f19753c.get(2).f20460i.get(14).b(0, 14L);
        bkVar.f19753c.get(2).f20460i.add(new pw("leg_curl_exercise_name", 132, 1.0d, 0.0d, ""));
        bkVar.f19753c.get(2).f20460i.get(15).b(0, 15L);
        bkVar.f19753c.get(2).f20460i.add(new pw("leg_raise_exercise_name", 132, 1.0d, 0.0d, ""));
        bkVar.f19753c.get(2).f20460i.get(16).b(0, 16L);
        bkVar.f19753c.get(2).f20460i.add(new pw("lunge_exercise_name", 132, 1.0d, 0.0d, ""));
        bkVar.f19753c.get(2).f20460i.get(17).b(0, 17L);
        bkVar.f19753c.get(2).f20460i.add(new pw("olympic_lift_exercise_name", 132, 1.0d, 0.0d, ""));
        bkVar.f19753c.get(2).f20460i.get(18).b(0, 18L);
        bkVar.f19753c.get(2).f20460i.add(new pw("plank_exercise_name", 132, 1.0d, 0.0d, ""));
        bkVar.f19753c.get(2).f20460i.get(19).b(0, 19L);
        bkVar.f19753c.get(2).f20460i.add(new pw("plyo_exercise_name", 132, 1.0d, 0.0d, ""));
        bkVar.f19753c.get(2).f20460i.get(20).b(0, 20L);
        bkVar.f19753c.get(2).f20460i.add(new pw("pull_up_exercise_name", 132, 1.0d, 0.0d, ""));
        bkVar.f19753c.get(2).f20460i.get(21).b(0, 21L);
        bkVar.f19753c.get(2).f20460i.add(new pw("push_up_exercise_name", 132, 1.0d, 0.0d, ""));
        bkVar.f19753c.get(2).f20460i.get(22).b(0, 22L);
        bkVar.f19753c.get(2).f20460i.add(new pw("row_exercise_name", 132, 1.0d, 0.0d, ""));
        bkVar.f19753c.get(2).f20460i.get(23).b(0, 23L);
        bkVar.f19753c.get(2).f20460i.add(new pw("shoulder_press_exercise_name", 132, 1.0d, 0.0d, ""));
        bkVar.f19753c.get(2).f20460i.get(24).b(0, 24L);
        bkVar.f19753c.get(2).f20460i.add(new pw("shoulder_stability_exercise_name", 132, 1.0d, 0.0d, ""));
        bkVar.f19753c.get(2).f20460i.get(25).b(0, 25L);
        bkVar.f19753c.get(2).f20460i.add(new pw("shrug_exercise_name", 132, 1.0d, 0.0d, ""));
        bkVar.f19753c.get(2).f20460i.get(26).b(0, 26L);
        bkVar.f19753c.get(2).f20460i.add(new pw("sit_up_exercise_name", 132, 1.0d, 0.0d, ""));
        bkVar.f19753c.get(2).f20460i.get(27).b(0, 27L);
        bkVar.f19753c.get(2).f20460i.add(new pw("squat_exercise_name", 132, 1.0d, 0.0d, ""));
        bkVar.f19753c.get(2).f20460i.get(28).b(0, 28L);
        bkVar.f19753c.get(2).f20460i.add(new pw("total_body_exercise_name", 132, 1.0d, 0.0d, ""));
        bkVar.f19753c.get(2).f20460i.get(29).b(0, 29L);
        bkVar.f19753c.get(2).f20460i.add(new pw("triceps_extension_exercise_name", 132, 1.0d, 0.0d, ""));
        bkVar.f19753c.get(2).f20460i.get(30).b(0, 30L);
        bkVar.f19753c.get(2).f20460i.add(new pw("warm_up_exercise_name", 132, 1.0d, 0.0d, ""));
        bkVar.f19753c.get(2).f20460i.get(31).b(0, 31L);
        bkVar.f19753c.get(2).f20460i.add(new pw("run_exercise_name", 132, 1.0d, 0.0d, ""));
        bkVar.f19753c.get(2).f20460i.get(32).b(0, 32L);
        bkVar.f19753c.get(2).f20460i.add(new pw("bike_exercise_name", 132, 1.0d, 0.0d, ""));
        bkVar.f19753c.get(2).f20460i.get(33).b(0, 33L);
        bkVar.f19753c.get(2).f20460i.add(new pw("cardio_sensors_exercise_name", 132, 1.0d, 0.0d, ""));
        bkVar.f19753c.get(2).f20460i.get(34).b(0, 34L);
        bkVar.f19753c.get(2).f20460i.add(new pw("move_exercise_name", 132, 1.0d, 0.0d, ""));
        bkVar.f19753c.get(2).f20460i.get(35).b(0, 35L);
        bkVar.f19753c.get(2).f20460i.add(new pw("pose_exercise_name", 132, 1.0d, 0.0d, ""));
        bkVar.f19753c.get(2).f20460i.get(36).b(0, 36L);
        bkVar.f19753c.get(2).f20460i.add(new pw("banded_exercises_exercise_name", 132, 1.0d, 0.0d, ""));
        bkVar.f19753c.get(2).f20460i.get(37).b(0, 37L);
        bkVar.f19753c.get(2).f20460i.add(new pw("battle_rope_exercise_name", 132, 1.0d, 0.0d, ""));
        bkVar.f19753c.get(2).f20460i.get(38).b(0, 38L);
        bkVar.f19753c.get(2).f20460i.add(new pw("elliptical_exercise_name", 132, 1.0d, 0.0d, ""));
        bkVar.f19753c.get(2).f20460i.get(39).b(0, 39L);
        bkVar.f19753c.get(2).f20460i.add(new pw("floor_climb_exercise_name", 132, 1.0d, 0.0d, ""));
        bkVar.f19753c.get(2).f20460i.get(40).b(0, 40L);
        bkVar.f19753c.get(2).f20460i.add(new pw("indoor_bike_exercise_name", 132, 1.0d, 0.0d, ""));
        bkVar.f19753c.get(2).f20460i.get(41).b(0, 41L);
        bkVar.f19753c.get(2).f20460i.add(new pw("indoor_row_exercise_name", 132, 1.0d, 0.0d, ""));
        bkVar.f19753c.get(2).f20460i.get(42).b(0, 42L);
        bkVar.f19753c.get(2).f20460i.add(new pw("ladder_exercise_name", 132, 1.0d, 0.0d, ""));
        bkVar.f19753c.get(2).f20460i.get(43).b(0, 43L);
        bkVar.f19753c.get(2).f20460i.add(new pw("sandbag_exercise_name", 132, 1.0d, 0.0d, ""));
        bkVar.f19753c.get(2).f20460i.get(44).b(0, 44L);
        bkVar.f19753c.get(2).f20460i.add(new pw("sled_exercise_name", 132, 1.0d, 0.0d, ""));
        bkVar.f19753c.get(2).f20460i.get(45).b(0, 45L);
        bkVar.f19753c.get(2).f20460i.add(new pw("sledge_hammer_exercise_name", 132, 1.0d, 0.0d, ""));
        bkVar.f19753c.get(2).f20460i.get(46).b(0, 46L);
        bkVar.f19753c.get(2).f20460i.add(new pw("stair_stepper_exercise_name", 132, 1.0d, 0.0d, ""));
        bkVar.f19753c.get(2).f20460i.get(47).b(0, 47L);
        bkVar.f19753c.get(2).f20460i.add(new pw("stretch_exercise_name", 132, 1.0d, 0.0d, ""));
        bkVar.f19753c.get(2).f20460i.get(48).b(0, 48L);
        bkVar.f19753c.get(2).f20460i.add(new pw("suspension_exercise_name", 132, 1.0d, 0.0d, ""));
        bkVar.f19753c.get(2).f20460i.get(49).b(0, 49L);
        bkVar.f19753c.get(2).f20460i.add(new pw("tire_exercise_name", 132, 1.0d, 0.0d, ""));
        bkVar.f19753c.get(2).f20460i.get(50).b(0, 50L);
        bkVar.f19753c.get(2).f20460i.add(new pw("treadmill_exercise_name", 132, 1.0d, 0.0d, ""));
        bkVar.f19753c.get(2).f20460i.get(51).b(0, 51L);
        bkVar.f19753c.get(2).f20460i.add(new pw("run_indoor_exercise_name", 132, 1.0d, 0.0d, ""));
        bkVar.f19753c.get(2).f20460i.get(52).b(0, 52L);
        bkVar.f19753c.get(2).f20460i.add(new pw("bike_outdoor_exercise_name", 132, 1.0d, 0.0d, ""));
        bkVar.f19753c.get(2).f20460i.get(53).b(0, 53L);
        bkVar.e(new rc("wkt_step_name", 2, 7, 1.0d, 0.0d, "", false, zn.STRING));
        bkVar.e(new rc("workout_index", 3, 132, 1.0d, 0.0d, "", false, znVar));
        bkVar.e(new rc("checksum", 252, 2, 1.0d, 0.0d, "", false, zn.CHECKSUM));
        bkVar.e(new rc("pad", 251, 13, 1.0d, 0.0d, "", false, zn.BYTE));
    }

    public qb() {
        super(wb.b(264));
    }

    public qb(bk bkVar) {
        super(bkVar);
    }
}
