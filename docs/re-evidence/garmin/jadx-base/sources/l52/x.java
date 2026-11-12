package l52;

import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.garmin.android.apps.connectmobile.workouts.data.model.TrainingPlanSearchResultsDTO;
import com.garmin.android.apps.connectmobile.workouts.data.model.WorkoutDTO;
import com.garmin.android.apps.connectmobile.workouts.data.model.WorkoutDetailsDTO;
import com.garmin.android.apps.connectmobile.workouts.data.model.WorkoutScheduleDTO;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.mapbox.maps.MapboxMap;
import com.nimbusds.jose.jwk.JWKParameterNames;
import java.util.List;
import okhttp3.MultipartBody;
import okhttp3.RequestBody;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000¬\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J%\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u0006\u0010\u0007J%\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\u00050\u00042\b\b\u0001\u0010\t\u001a\u00020\bH'¢\u0006\u0004\b\u000b\u0010\fJ/\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\u00050\u00042\b\b\u0001\u0010\t\u001a\u00020\b2\b\b\u0001\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\r\u0010\u000eJ1\u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u00050\u00042\b\b\u0001\u0010\t\u001a\u00020\b2\n\b\u0001\u0010\u0010\u001a\u0004\u0018\u00010\u000fH'¢\u0006\u0004\b\u0012\u0010\u0013J%\u0010\u0015\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\u00050\u00042\b\b\u0001\u0010\u0014\u001a\u00020\bH'¢\u0006\u0004\b\u0015\u0010\fJ/\u0010\u0017\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00050\u00042\b\b\u0001\u0010\t\u001a\u00020\b2\b\b\u0001\u0010\u0016\u001a\u00020\u000fH'¢\u0006\u0004\b\u0017\u0010\u0013J'\u0010\u001b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001a0\u00050\u00042\n\b\u0001\u0010\u0019\u001a\u0004\u0018\u00010\u0018H'¢\u0006\u0004\b\u001b\u0010\u001cJ;\u0010\u001f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u00050\u00042\b\b\u0001\u0010\u001d\u001a\u00020\b2\b\b\u0001\u0010\u0014\u001a\u00020\b2\n\b\u0001\u0010\u001e\u001a\u0004\u0018\u00010\u0018H'¢\u0006\u0004\b\u001f\u0010 J/\u0010!\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\u00050\u00042\b\b\u0001\u0010\u001d\u001a\u00020\b2\b\b\u0001\u0010\u0014\u001a\u00020\bH'¢\u0006\u0004\b!\u0010\"J\u0015\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00180#H'¢\u0006\u0004\b$\u0010%J\u001b\u0010(\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020'0&0\u0004H'¢\u0006\u0004\b(\u0010)J\u001b\u0010*\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020'0&0\u0004H'¢\u0006\u0004\b*\u0010)JE\u00100\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020/0&0\u00050\u00042\u000e\b\u0001\u0010+\u001a\b\u0012\u0004\u0012\u00020\u00180&2\b\b\u0001\u0010-\u001a\u00020,2\b\b\u0001\u0010.\u001a\u00020,H'¢\u0006\u0004\b0\u00101J5\u00102\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020/0&0\u00050\u00042\b\b\u0001\u0010-\u001a\u00020,2\b\b\u0001\u0010.\u001a\u00020,H'¢\u0006\u0004\b2\u00103J5\u00106\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020&0\u00050\u00042\b\b\u0001\u00104\u001a\u00020\u00182\b\b\u0001\u00105\u001a\u00020\u0018H'¢\u0006\u0004\b6\u00107J!\u00108\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020/0&0\u00050\u0004H'¢\u0006\u0004\b8\u0010)J)\u0010;\u001a\b\u0012\u0004\u0012\u00020\u00020\u00042\b\b\u0001\u0010\t\u001a\u00020\u00182\b\b\u0001\u0010:\u001a\u000209H'¢\u0006\u0004\b;\u0010<J)\u0010>\u001a\b\u0012\u0004\u0012\u00020\u00110\u00042\b\b\u0001\u0010=\u001a\u00020\u00182\b\b\u0001\u0010:\u001a\u000209H'¢\u0006\u0004\b>\u0010<J)\u0010@\u001a\b\u0012\u0004\u0012\u00020\u00020\u00042\b\b\u0001\u0010?\u001a\u00020\u00182\b\b\u0001\u0010:\u001a\u000209H'¢\u0006\u0004\b@\u0010<J%\u0010C\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020B0\u00050\u00042\b\b\u0001\u0010A\u001a\u00020\u0018H'¢\u0006\u0004\bC\u0010\u001cJ%\u0010D\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020B0\u00050\u00042\b\b\u0001\u0010A\u001a\u00020\u0018H'¢\u0006\u0004\bD\u0010\u001cJ%\u0010E\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020B0\u00050\u00042\b\b\u0001\u0010A\u001a\u00020\u0018H'¢\u0006\u0004\bE\u0010\u001cJ%\u0010F\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020B0\u00050\u00042\b\b\u0001\u0010A\u001a\u00020\u0018H'¢\u0006\u0004\bF\u0010\u001cJ/\u0010H\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00050\u00042\b\b\u0001\u0010A\u001a\u00020\u00182\b\b\u0001\u0010G\u001a\u00020\u0018H'¢\u0006\u0004\bH\u00107J/\u0010I\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00050\u00042\b\b\u0001\u0010A\u001a\u00020\u00182\b\b\u0001\u0010G\u001a\u00020\u0018H'¢\u0006\u0004\bI\u00107J/\u0010J\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00050\u00042\b\b\u0001\u0010A\u001a\u00020\u00182\b\b\u0001\u0010G\u001a\u00020\u0018H'¢\u0006\u0004\bJ\u00107J9\u0010N\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020M0\u00050\u00042\b\b\u0001\u0010A\u001a\u00020\u00182\b\b\u0001\u0010K\u001a\u00020\u00182\b\b\u0001\u0010L\u001a\u00020\u0018H'¢\u0006\u0004\bN\u0010OJ\u0015\u0010P\u001a\b\u0012\u0004\u0012\u00020\u00180\u0004H'¢\u0006\u0004\bP\u0010)J\u0015\u0010Q\u001a\b\u0012\u0004\u0012\u00020\u00180\u0004H'¢\u0006\u0004\bQ\u0010)J!\u0010S\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020R0&0\u00050\u0004H'¢\u0006\u0004\bS\u0010)J%\u0010U\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020,0\u00050\u00042\b\b\u0001\u0010T\u001a\u00020RH'¢\u0006\u0004\bU\u0010VJ1\u0010X\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020R0&0\u00050\u00042\u000e\b\u0001\u0010W\u001a\b\u0012\u0004\u0012\u00020R0&H'¢\u0006\u0004\bX\u0010YJ/\u0010[\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\u00050\u00042\b\b\u0001\u0010Z\u001a\u00020\b2\b\b\u0001\u0010T\u001a\u00020RH'¢\u0006\u0004\b[\u0010\\J%\u0010]\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\u00050\u00042\b\b\u0001\u0010Z\u001a\u00020\bH'¢\u0006\u0004\b]\u0010\fJ!\u0010_\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020^0&0\u00050\u0004H'¢\u0006\u0004\b_\u0010)J%\u0010b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020a0\u00050\u00042\b\b\u0001\u0010`\u001a\u00020\u0018H'¢\u0006\u0004\bb\u0010\u001cJ%\u0010f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020e0\u00050\u00042\b\b\u0001\u0010d\u001a\u00020cH'¢\u0006\u0004\bf\u0010gJ+\u0010i\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\u00050\u00042\u000e\b\u0001\u0010h\u001a\b\u0012\u0004\u0012\u00020\u00180&H'¢\u0006\u0004\bi\u0010YJ\u001b\u0010k\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020j0\u00050\u0004H'¢\u0006\u0004\bk\u0010)¨\u0006lÀ\u0006\u0003"}, d2 = {"Ll52/x;", "", "Lcom/garmin/android/apps/connectmobile/workouts/data/model/WorkoutDetailsDTO;", "workoutDetailsDTO", "Lo53/i0;", "Lc83/a0;", JWKParameterNames.RSA_MODULUS, "(Lcom/garmin/android/apps/connectmobile/workouts/data/model/WorkoutDetailsDTO;)Lo53/i0;", "", "workoutId", "", "v", "(J)Lo53/i0;", JWKParameterNames.RSA_OTHER_PRIMES__FACTOR_CRT_COEFFICIENT, "(JLcom/garmin/android/apps/connectmobile/workouts/data/model/WorkoutDetailsDTO;)Lo53/i0;", "Lokhttp3/RequestBody;", "dateTime", "Lcom/garmin/android/apps/connectmobile/workouts/data/model/WorkoutScheduleDTO;", JWKParameterNames.RSA_EXPONENT, "(JLokhttp3/RequestBody;)Lo53/i0;", "scheduleWorkoutId", "o", "workoutName", "h", "", "startDate", "Lcom/garmin/android/apps/connectmobile/workouts/data/model/TrainingPlanSearchResultsDTO;", "C", "(Ljava/lang/String;)Lo53/i0;", "trainingPlanId", "scheduleDate", "B", "(JJLjava/lang/String;)Lo53/i0;", "w", "(JJ)Lo53/i0;", "Lc83/d;", "c", "()Lc83/d;", "", "Lcom/garmin/android/apps/connectmobile/workouts/data/model/i0;", "H", "()Lo53/i0;", "p", "sportType", "", TtmlNode.START, MapboxMap.QFE_LIMIT, "Lcom/garmin/android/apps/connectmobile/workouts/data/model/WorkoutDTO;", "E", "(Ljava/util/List;II)Lo53/i0;", IntegerTokenConverter.CONVERTER_KEY, "(II)Lo53/i0;", "provider", "sourceId", "F", "(Ljava/lang/String;Ljava/lang/String;)Lo53/i0;", "D", "", "includeAudioNotes", JWKParameterNames.RSA_OTHER_PRIMES__PRIME_FACTOR, "(Ljava/lang/String;Z)Lo53/i0;", "workoutScheduleId", "z", "workoutUuid", JWKParameterNames.ELLIPTIC_CURVE_Y_COORDINATE, "locale", "Lcom/garmin/android/apps/connectmobile/workouts/data/model/s;", "l", "J", "d", "u", "workoutSourceId", "L", "M", "I", "category", "name", "Lcom/garmin/android/apps/connectmobile/workouts/data/model/o;", "j", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lo53/i0;", "b", "K", "Lcom/garmin/android/apps/connectmobile/workouts/data/model/b;", "G", "benchmark", "f", "(Lcom/garmin/android/apps/connectmobile/workouts/data/model/b;)Lo53/i0;", "benchmarks", "a", "(Ljava/util/List;)Lo53/i0;", "benchmarkId", "m", "(JLcom/garmin/android/apps/connectmobile/workouts/data/model/b;)Lo53/i0;", "g", "Lcom/garmin/android/apps/connectmobile/workouts/data/model/v;", "A", "activityType", "Lcom/garmin/android/apps/connectmobile/workouts/data/model/j;", JWKParameterNames.RSA_SECOND_PRIME_FACTOR, "Lokhttp3/MultipartBody$Part;", "note", "Lcom/garmin/android/apps/connectmobile/workouts/data/model/a;", JWKParameterNames.OCT_KEY_VALUE, "(Lokhttp3/MultipartBody$Part;)Lo53/i0;", "audioNoteUuids", "s", "Lww1/h0;", "x", "gcm-workouts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public interface x {
    @i83.f("/fitnessstats-service/powerCurve/workoutTargets")
    o53.i0<c83.a0<List<com.garmin.android.apps.connectmobile.workouts.data.model.v>>> A();

    @i83.o("/trainingplan-service/trainingplan/addWorkoutTask/{trainingPlanId}")
    @i83.e
    o53.i0<c83.a0<WorkoutScheduleDTO>> B(@i83.s("trainingPlanId") long trainingPlanId, @i83.c("workoutSchedulePk") long scheduleWorkoutId, @i83.c("scheduleDate") String scheduleDate);

    @i83.f("/trainingplan-service/trainingplan/active-plans")
    o53.i0<c83.a0<TrainingPlanSearchResultsDTO>> C(@i83.t("startDate") String startDate);

    @i83.f("/workout-service/workouts")
    o53.i0<c83.a0<List<WorkoutDTO>>> D();

    @i83.f("/workout-service/workouts?includeAtp=false&orderBy=UPDATE_DATE")
    o53.i0<c83.a0<List<WorkoutDTO>>> E(@i83.t("sportTypeKey") List<String> sportType, @i83.t(TtmlNode.START) int start, @i83.t(MapboxMap.QFE_LIMIT) int limit);

    @i83.f("/workout-service/workout/{provider}/{sourceId}")
    o53.i0<c83.a0<List<WorkoutDetailsDTO>>> F(@i83.s("provider") String provider, @i83.s("sourceId") String sourceId);

    @i83.f("/workout-service/benchmarks")
    o53.i0<c83.a0<List<com.garmin.android.apps.connectmobile.workouts.data.model.b>>> G();

    @i83.f("/workout-service/workout/types/sport")
    o53.i0<List<com.garmin.android.apps.connectmobile.workouts.data.model.i0>> H();

    @i83.f("/web-data/workouts/{locale}/{workoutSourceId}_06_26_971bd970-fe27-467d-9499-e5f5a9c444c8.json")
    o53.i0<c83.a0<WorkoutDetailsDTO>> I(@i83.s("locale") String locale, @i83.s("workoutSourceId") String workoutSourceId);

    @i83.f("/web-data/workouts/{locale}/index_07_2024_9be99be9-75d3-4158-97d0-46e4a8a972c5.json")
    o53.i0<c83.a0<com.garmin.android.apps.connectmobile.workouts.data.model.s>> J(@i83.s("locale") String locale);

    @i83.f("/web-data/workouts/msnExercises_06_26_971bd970-fe27-467d-9499-e5f5a9c444c8.json.json")
    o53.i0<String> K();

    @i83.f("/web-data/workouts/{locale}/{workoutSourceId}.json")
    o53.i0<c83.a0<WorkoutDetailsDTO>> L(@i83.s("locale") String locale, @i83.s("workoutSourceId") String workoutSourceId);

    @i83.f("/web-data/workouts/{locale}/{workoutSourceId}_07_2024_9be99be9-75d3-4158-97d0-46e4a8a972c5.json")
    o53.i0<c83.a0<WorkoutDetailsDTO>> M(@i83.s("locale") String locale, @i83.s("workoutSourceId") String workoutSourceId);

    @i83.o("/workout-service/benchmarks/bulk")
    o53.i0<c83.a0<List<com.garmin.android.apps.connectmobile.workouts.data.model.b>>> a(@i83.a List<com.garmin.android.apps.connectmobile.workouts.data.model.b> benchmarks);

    @i83.f("/web-data/workouts/msnExercises.json")
    o53.i0<String> b();

    @i83.p("/workout-service/schedule/sendtodevices")
    c83.d<String> c();

    @i83.f("/web-data/workouts/{locale}/index_wheelchair_12_2024_3a5e3d62-6ea4-43ad-b562-16f1604d9fe1.json")
    o53.i0<c83.a0<com.garmin.android.apps.connectmobile.workouts.data.model.s>> d(@i83.s("locale") String locale);

    @i83.o("/workout-service/schedule/{workoutId}")
    o53.i0<c83.a0<WorkoutScheduleDTO>> e(@i83.s("workoutId") long workoutId, @i83.a RequestBody dateTime);

    @i83.o("/workout-service/benchmarks")
    o53.i0<c83.a0<Integer>> f(@i83.a com.garmin.android.apps.connectmobile.workouts.data.model.b benchmark);

    @i83.b("/workout-service/benchmarks/{benchmarkId}")
    o53.i0<c83.a0<Unit>> g(@i83.s("benchmarkId") long benchmarkId);

    @i83.o("/workout-service/workout/copy/{workoutId}")
    o53.i0<c83.a0<WorkoutDetailsDTO>> h(@i83.s("workoutId") long workoutId, @i83.a RequestBody workoutName);

    @i83.f("/workout-service/workouts?includeAtp=false&orderBy=UPDATE_DATE")
    o53.i0<c83.a0<List<WorkoutDTO>>> i(@i83.t(TtmlNode.START) int start, @i83.t(MapboxMap.QFE_LIMIT) int limit);

    @i83.f("/web-data/exercises/{locale}/{category}/{name}.json")
    o53.i0<c83.a0<com.garmin.android.apps.connectmobile.workouts.data.model.o>> j(@i83.s("locale") String locale, @i83.s("category") String category, @i83.s("name") String name);

    @i83.o("/workout-service/workout/audionote/upload")
    @i83.l
    o53.i0<c83.a0<com.garmin.android.apps.connectmobile.workouts.data.model.a>> k(@i83.q MultipartBody.Part note);

    @i83.f("/web-data/workouts/{locale}/index.json")
    o53.i0<c83.a0<com.garmin.android.apps.connectmobile.workouts.data.model.s>> l(@i83.s("locale") String locale);

    @i83.p("/workout-service/benchmarks/{benchmarkId}")
    o53.i0<c83.a0<Unit>> m(@i83.s("benchmarkId") long benchmarkId, @i83.a com.garmin.android.apps.connectmobile.workouts.data.model.b benchmark);

    @i83.o("/workout-service/workout")
    o53.i0<c83.a0<WorkoutDetailsDTO>> n(@i83.a WorkoutDetailsDTO workoutDetailsDTO);

    @i83.b("/workout-service/schedule/{scheduleWorkoutId}")
    o53.i0<c83.a0<Unit>> o(@i83.s("scheduleWorkoutId") long scheduleWorkoutId);

    @i83.f("/workout-service/workouts/sport-types")
    o53.i0<List<com.garmin.android.apps.connectmobile.workouts.data.model.i0>> p();

    @i83.f("/fitnessstats-service/activity/userAvgSpeed")
    o53.i0<c83.a0<com.garmin.android.apps.connectmobile.workouts.data.model.j>> q(@i83.t("activityType") String activityType);

    @i83.f("/workout-service/workout/{workoutId}")
    o53.i0<WorkoutDetailsDTO> r(@i83.s("workoutId") String workoutId, @i83.t("includeAudioNotes") boolean includeAudioNotes);

    @i83.b("/workout-service/workout/audionote")
    o53.i0<c83.a0<Unit>> s(@i83.t("audiouuid") List<String> audioNoteUuids);

    @i83.p("/workout-service/workout/{workoutId}")
    o53.i0<c83.a0<Unit>> t(@i83.s("workoutId") long workoutId, @i83.a WorkoutDetailsDTO workoutDetailsDTO);

    @i83.f("/web-data/workouts/{locale}/index_06_26_971bd970-fe27-467d-9499-e5f5a9c444c8.json")
    o53.i0<c83.a0<com.garmin.android.apps.connectmobile.workouts.data.model.s>> u(@i83.s("locale") String locale);

    @i83.b("/workout-service/workout/{workoutId}")
    o53.i0<c83.a0<Unit>> v(@i83.s("workoutId") long workoutId);

    @i83.b("/trainingplan-service/trainingplan/workoutTask/{trainingPlanId}/{scheduleWorkoutId}")
    o53.i0<c83.a0<Unit>> w(@i83.s("trainingPlanId") long trainingPlanId, @i83.s("scheduleWorkoutId") long scheduleWorkoutId);

    @i83.f("/web-data/dsw/workouts/compatibleActivities.json")
    o53.i0<c83.a0<ww1.h0>> x();

    @i83.f("/workout-service/fbt-adaptive/{workoutUuid}")
    o53.i0<WorkoutDetailsDTO> y(@i83.s("workoutUuid") String workoutUuid, @i83.t("includeAudioNotes") boolean includeAudioNotes);

    @i83.f("/workout-service/schedule/{workoutScheduleId}")
    o53.i0<WorkoutScheduleDTO> z(@i83.s("workoutScheduleId") String workoutScheduleId, @i83.t("includeAudioNotes") boolean includeAudioNotes);
}
