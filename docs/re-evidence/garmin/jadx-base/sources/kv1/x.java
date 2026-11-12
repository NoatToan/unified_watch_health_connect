package kv1;

import java.util.List;
import jv1.e0;
import o53.i0;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J%\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u0007\u0010\bJ\u001b\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00050\u0004H'¢\u0006\u0004\b\t\u0010\nJ%\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00042\b\b\u0001\u0010\f\u001a\u00020\u000bH'¢\u0006\u0004\b\r\u0010\u000eJ!\u0010\u0010\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\u000f0\u00050\u0004H'¢\u0006\u0004\b\u0010\u0010\n¨\u0006\u0011À\u0006\u0003"}, d2 = {"Lkv1/x;", "", "Ljv1/e0;", "userSettings", "Lo53/i0;", "Lc83/a0;", "", "d", "(Ljv1/e0;)Lo53/i0;", "a", "()Lo53/i0;", "Ljv1/b;", "adaptiveCoachingWorkout", "b", "(Ljv1/b;)Lo53/i0;", "", "c", "gcm-training-plans_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public interface x {
    @i83.f("/userprofile-service/userprofile/adaptive-coaching-plan-user-setting")
    i0<c83.a0<e0>> a();

    @i83.p("userprofile-service/userprofile/adaptive-coaching-workout")
    i0<c83.a0<Unit>> b(@i83.a jv1.b adaptiveCoachingWorkout);

    @i83.f("/userprofile-service/userprofile/adaptive-coaching-workouts")
    i0<c83.a0<List<jv1.b>>> c();

    @i83.p("/userprofile-service/userprofile/adaptive-coaching-plan-user-setting")
    i0<c83.a0<Unit>> d(@i83.a e0 userSettings);
}
