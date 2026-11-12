package gu1;

import c83.a0;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.nimbusds.jose.jwk.JWKParameterNames;
import fu1.r;
import i83.o;
import i83.s;
import i83.t;
import java.util.List;
import o53.i0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import xw1.p;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\u0010\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J!\u0010\u0006\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00030\u0002H'¢\u0006\u0004\b\u0006\u0010\u0007J!\u0010\b\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00030\u0002H'¢\u0006\u0004\b\b\u0010\u0007J)\u0010\r\u001a\b\u0012\u0004\u0012\u00020\t0\f2\b\b\u0001\u0010\n\u001a\u00020\t2\b\b\u0001\u0010\u000b\u001a\u00020\tH'¢\u0006\u0004\b\r\u0010\u000eJ+\u0010\u0010\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u00040\u00030\u00022\b\b\u0001\u0010\u000b\u001a\u00020\tH'¢\u0006\u0004\b\u0010\u0010\u0011J%\u0010\u0014\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\u00030\u00022\b\b\u0001\u0010\n\u001a\u00020\u0012H'¢\u0006\u0004\b\u0014\u0010\u0015J)\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\t0\f2\b\b\u0001\u0010\u0016\u001a\u00020\u00122\b\b\u0001\u0010\u0017\u001a\u00020\tH'¢\u0006\u0004\b\u0018\u0010\u0019J3\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\t0\f2\b\b\u0001\u0010\n\u001a\u00020\t2\b\b\u0001\u0010\u001a\u001a\u00020\t2\b\b\u0001\u0010\u001b\u001a\u00020\tH'¢\u0006\u0004\b\u001c\u0010\u001dJ)\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\t0\f2\b\b\u0001\u0010\n\u001a\u00020\t2\b\b\u0001\u0010\u001e\u001a\u00020\tH'¢\u0006\u0004\b\u001f\u0010\u000eJ\u001f\u0010\"\u001a\b\u0012\u0004\u0012\u00020\t0\f2\b\b\u0001\u0010!\u001a\u00020 H'¢\u0006\u0004\b\"\u0010#J\u001f\u0010%\u001a\b\u0012\u0004\u0012\u00020\t0\f2\b\b\u0001\u0010$\u001a\u00020\tH'¢\u0006\u0004\b%\u0010&J\u001f\u0010'\u001a\b\u0012\u0004\u0012\u00020\t0\f2\b\b\u0001\u0010$\u001a\u00020\tH'¢\u0006\u0004\b'\u0010&J)\u0010)\u001a\b\u0012\u0004\u0012\u00020\t0\f2\b\b\u0001\u0010(\u001a\u00020\t2\b\b\u0001\u0010$\u001a\u00020\tH'¢\u0006\u0004\b)\u0010\u000eJ)\u0010,\u001a\b\u0012\u0004\u0012\u00020\t0\f2\b\b\u0001\u0010$\u001a\u00020\t2\b\b\u0001\u0010+\u001a\u00020*H'¢\u0006\u0004\b,\u0010-J)\u0010.\u001a\b\u0012\u0004\u0012\u00020\t0\f2\b\b\u0001\u0010\u0016\u001a\u00020\u00122\b\b\u0001\u0010\u0017\u001a\u00020\tH'¢\u0006\u0004\b.\u0010\u0019J\u001f\u0010/\u001a\b\u0012\u0004\u0012\u00020\t0\f2\b\b\u0001\u0010\u0017\u001a\u00020\tH'¢\u0006\u0004\b/\u0010&J=\u00102\u001a\b\u0012\u0004\u0012\u00020\t0\f2\b\b\u0001\u0010$\u001a\u00020\u00122\b\b\u0001\u00100\u001a\u00020\t2\b\b\u0001\u00101\u001a\u00020\t2\b\b\u0001\u0010\u0017\u001a\u00020\tH'¢\u0006\u0004\b2\u00103J=\u00108\u001a\b\u0012\u0004\u0012\u00020\t0\f2\b\b\u0001\u00105\u001a\u0002042\b\b\u0001\u0010\u0017\u001a\u00020\t2\b\b\u0001\u00106\u001a\u0002042\b\b\u0001\u00107\u001a\u000204H'¢\u0006\u0004\b8\u00109J3\u0010:\u001a\b\u0012\u0004\u0012\u00020\t0\f2\b\b\u0001\u00105\u001a\u0002042\b\b\u0001\u00106\u001a\u0002042\b\b\u0001\u00107\u001a\u000204H'¢\u0006\u0004\b:\u0010;J=\u0010<\u001a\b\u0012\u0004\u0012\u00020\t0\f2\b\b\u0001\u00105\u001a\u0002042\b\b\u0001\u00106\u001a\u0002042\b\b\u0001\u00107\u001a\u0002042\b\b\u0001\u0010\u0016\u001a\u00020\u0012H'¢\u0006\u0004\b<\u0010=J\u001f\u0010>\u001a\b\u0012\u0004\u0012\u00020\t0\f2\b\b\u0001\u0010$\u001a\u00020\u0012H'¢\u0006\u0004\b>\u0010?J\u001f\u0010B\u001a\b\u0012\u0004\u0012\u00020\t0\f2\b\b\u0001\u0010A\u001a\u00020@H'¢\u0006\u0004\bB\u0010CJ3\u0010E\u001a\b\u0012\u0004\u0012\u00020\t0\f2\b\b\u0001\u0010$\u001a\u0002042\b\b\u0001\u0010D\u001a\u00020\t2\b\b\u0001\u0010\u0017\u001a\u00020\tH'¢\u0006\u0004\bE\u0010FJ=\u0010H\u001a\b\u0012\u0004\u0012\u00020\t0\f2\b\b\u0001\u0010$\u001a\u0002042\b\b\u0001\u0010D\u001a\u00020\t2\b\b\u0001\u0010G\u001a\u0002042\b\b\u0001\u0010\u0017\u001a\u00020\tH'¢\u0006\u0004\bH\u0010IJK\u0010K\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020J0\u00040\u00030\u00022\b\b\u0001\u0010$\u001a\u00020\u00122\b\b\u0001\u0010D\u001a\u00020\t2\n\b\u0001\u0010G\u001a\u0004\u0018\u0001042\b\b\u0001\u0010\u0017\u001a\u00020\tH'¢\u0006\u0004\bK\u0010LJ/\u0010M\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020*0\u00030\u00022\b\b\u0001\u0010$\u001a\u00020\u00122\b\b\u0001\u0010+\u001a\u00020*H'¢\u0006\u0004\bM\u0010NJ%\u0010O\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\u00030\u00022\b\b\u0001\u0010$\u001a\u00020\u0012H'¢\u0006\u0004\bO\u0010\u0015Je\u0010P\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020J0\u00040\u00030\u00022\b\b\u0001\u00105\u001a\u0002042\n\b\u0003\u0010D\u001a\u0004\u0018\u00010\t2\n\b\u0003\u0010G\u001a\u0004\u0018\u0001042\n\b\u0003\u00106\u001a\u0004\u0018\u0001042\n\b\u0003\u00107\u001a\u0004\u0018\u0001042\b\b\u0001\u0010\u0017\u001a\u00020\tH'¢\u0006\u0004\bP\u0010QJ%\u0010R\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u00030\u00022\b\b\u0001\u0010!\u001a\u00020 H'¢\u0006\u0004\bR\u0010SJ%\u0010U\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020T0\u00030\u00022\b\b\u0001\u0010+\u001a\u00020*H'¢\u0006\u0004\bU\u0010VJ9\u0010X\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020W0\u00030\u00022\b\b\u0001\u00105\u001a\u0002042\b\b\u0001\u00106\u001a\u0002042\b\b\u0001\u00107\u001a\u000204H'¢\u0006\u0004\bX\u0010Y¨\u0006ZÀ\u0006\u0003"}, d2 = {"Lgu1/a;", "", "Lo53/i0;", "Lc83/a0;", "", "Lxw1/d;", "a", "()Lo53/i0;", "A", "", "planId", "language", "Lc83/d;", JWKParameterNames.RSA_OTHER_PRIMES__PRIME_FACTOR, "(Ljava/lang/String;Ljava/lang/String;)Lc83/d;", "Lxw1/p;", "d", "(Ljava/lang/String;)Lo53/i0;", "", "", "f", "(J)Lo53/i0;", "workoutPlanId", "lang", "C", "(JLjava/lang/String;)Lc83/d;", "scheduleWorkoutId", "newDate", "g", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lc83/d;", "workoutId", "o", "Lfu1/k;", "request", "p", "(Lfu1/k;)Lc83/d;", "athletePlanId", JWKParameterNames.RSA_MODULUS, "(Ljava/lang/String;)Lc83/d;", JWKParameterNames.OCT_KEY_VALUE, "reason", JWKParameterNames.RSA_EXPONENT, "Lxw1/c;", "trainingPlan", "x", "(Ljava/lang/String;Lxw1/c;)Lc83/d;", JWKParameterNames.RSA_OTHER_PRIMES__FACTOR_CRT_COEFFICIENT, "v", "startDate", "endDate", JWKParameterNames.RSA_SECOND_PRIME_FACTOR, "(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lc83/d;", "", "planTypeId", "prePlanWeeklyMileage", "prePlanTrainingPace", IntegerTokenConverter.CONVERTER_KEY, "(ILjava/lang/String;II)Lc83/d;", "B", "(III)Lc83/d;", "m", "(IIIJ)Lc83/d;", "h", "(J)Lc83/d;", "Lfu1/i;", "athleteReaction", "u", "(Lfu1/i;)Lc83/d;", "goal", "D", "(ILjava/lang/String;Ljava/lang/String;)Lc83/d;", "raceGoalTime", "z", "(ILjava/lang/String;ILjava/lang/String;)Lc83/d;", "Lxw1/h;", "c", "(JLjava/lang/String;Ljava/lang/Integer;Ljava/lang/String;)Lo53/i0;", JWKParameterNames.ELLIPTIC_CURVE_Y_COORDINATE, "(JLxw1/c;)Lo53/i0;", "b", "l", "(ILjava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;)Lo53/i0;", "j", "(Lfu1/k;)Lo53/i0;", "Lfu1/j;", "w", "(Lxw1/c;)Lo53/i0;", "Lfu1/r;", "s", "(III)Lo53/i0;", "gcm-training-plans_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public interface a {
    @i83.f("/atp/athlete/completed")
    i0<a0<List<xw1.d>>> A();

    @i83.f("/atp/setup/paceTimes")
    c83.d<String> B(@t("planTypeId") int planTypeId, @t("prePlanWeeklyMileage") int prePlanWeeklyMileage, @t("prePlanTrainingPace") int prePlanTrainingPace);

    @i83.f("/atp/setup/plan")
    c83.d<String> C(@t("workoutPlanId") long workoutPlanId, @t("lang") String lang);

    @i83.f("/atp/setup/plans/change")
    c83.d<String> D(@t("athletePlanId") int athletePlanId, @t("goal") String goal, @t("lang") String lang);

    @i83.f("/atp/athlete/active")
    i0<a0<List<xw1.d>>> a();

    @o("/atp/athlete/quit")
    i0<a0<Unit>> b(@t("athletePlanId") long athletePlanId);

    @i83.f("/atp/setup/plans/change")
    i0<a0<List<xw1.h>>> c(@t("athletePlanId") long athletePlanId, @t("goal") String goal, @t("raceGoalTime") Integer raceGoalTime, @t("lang") String lang);

    @i83.f("/atp/types/")
    i0<a0<List<p>>> d(@t("lang") String language);

    @o("/atp/athlete/unpause/{reason}")
    c83.d<String> e(@s("reason") String reason, @t("athletePlanId") String athletePlanId);

    @o("/atp/athlete/completed/hide")
    i0<a0<Unit>> f(@t("athletePlanId") long planId);

    @i83.p("/atp/athlete/plan/reschedule")
    c83.d<String> g(@t("athletePlanId") String planId, @t("scheduleWorkoutId") String scheduleWorkoutId, @t("newDate") String newDate);

    @i83.f("/atp/athlete/nextWorkout")
    c83.d<String> h(@t("athletePlanId") long athletePlanId);

    @i83.f("/atp/setup/goals")
    c83.d<String> i(@t("planTypeId") int planTypeId, @t("lang") String lang, @t("prePlanWeeklyMileage") int prePlanWeeklyMileage, @t("prePlanTrainingPace") int prePlanTrainingPace);

    @i83.k({"Content-Type: application/json"})
    @o("/gateway/graph-atp/graphql")
    i0<a0<String>> j(@i83.a fu1.k request);

    @o("/atp/athlete/quit")
    c83.d<String> k(@t("athletePlanId") String athletePlanId);

    @i83.f("/atp/setup/plans")
    i0<a0<List<xw1.h>>> l(@t("planTypeId") int planTypeId, @t("goal") String goal, @t("raceGoalTime") Integer raceGoalTime, @t("prePlanWeeklyMileage") Integer prePlanWeeklyMileage, @t("prePlanTrainingPace") Integer prePlanTrainingPace, @t("lang") String lang);

    @i83.f("/atp/setup/paceTimes")
    c83.d<String> m(@t("planTypeId") int planTypeId, @t("prePlanWeeklyMileage") int prePlanWeeklyMileage, @t("prePlanTrainingPace") int prePlanTrainingPace, @t("workoutPlanId") long workoutPlanId);

    @o("/atp/athlete/pause/")
    c83.d<String> n(@t("athletePlanId") String athletePlanId);

    @i83.b("/atp/athlete/plan/schedule/{athletePlanId}/{workoutId}")
    c83.d<String> o(@s("athletePlanId") String planId, @s("workoutId") String workoutId);

    @i83.k({"Content-Type: application/json"})
    @o("/gateway/graph-atp/graphql")
    c83.d<String> p(@i83.a fu1.k request);

    @i83.f("/atp/athlete/calendar")
    c83.d<String> q(@t("athletePlanId") long athletePlanId, @t("startDate") String startDate, @t("endDate") String endDate, @t("lang") String lang);

    @i83.f("/atp/athlete/plan")
    c83.d<String> r(@t("athletePlanId") String planId, @t("lang") String language);

    @i83.f("/atp/setup/paceTimes")
    i0<a0<r>> s(@t("planTypeId") int planTypeId, @t("prePlanWeeklyMileage") int prePlanWeeklyMileage, @t("prePlanTrainingPace") int prePlanTrainingPace);

    @i83.f("/atp/athlete/feed")
    c83.d<String> t(@t("athletePlanId") long workoutPlanId, @t("lang") String lang);

    @o("/atp/athlete/react")
    c83.d<String> u(@i83.a fu1.i athleteReaction);

    @i83.f("/atp/types/")
    c83.d<String> v(@t("lang") String lang);

    @o("/atp/setup/coachCaution")
    i0<a0<fu1.j>> w(@i83.a xw1.c trainingPlan);

    @i83.k({"Content-Type: application/json"})
    @i83.p("/atp/setup/update/{id}")
    c83.d<String> x(@s(TtmlNode.ATTR_ID) String athletePlanId, @i83.a xw1.c trainingPlan);

    @i83.p("/atp/setup/update/{id}")
    i0<a0<xw1.c>> y(@s(TtmlNode.ATTR_ID) long athletePlanId, @i83.a xw1.c trainingPlan);

    @i83.f("/atp/setup/plans/change")
    c83.d<String> z(@t("athletePlanId") int athletePlanId, @t("goal") String goal, @t("raceGoalTime") int raceGoalTime, @t("lang") String lang);
}
