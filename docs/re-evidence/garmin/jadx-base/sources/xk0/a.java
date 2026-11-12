package xk0;

import c83.a0;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.nimbusds.jose.jwk.JWKParameterNames;
import i83.p;
import i83.s;
import java.util.List;
import o53.i0;
import org.joda.time.DateTime;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import zk0.h;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J%\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u0007\u0010\bJ+\u0010\r\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\u00050\u00042\b\b\u0001\u0010\n\u001a\u00020\tH'¢\u0006\u0004\b\r\u0010\u000eJ/\u0010\u0010\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u00050\u00042\b\b\u0001\u0010\u000f\u001a\u00020\t2\b\b\u0001\u0010\n\u001a\u00020\tH'¢\u0006\u0004\b\u0010\u0010\u0011J9\u0010\u0013\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u00050\u00042\b\b\u0001\u0010\u000f\u001a\u00020\t2\b\b\u0001\u0010\n\u001a\u00020\t2\b\b\u0001\u0010\u0012\u001a\u00020\fH'¢\u0006\u0004\b\u0013\u0010\u0014J%\u0010\u0017\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00160\u00050\u00042\b\b\u0001\u0010\n\u001a\u00020\u0015H'¢\u0006\u0004\b\u0017\u0010\u0018J/\u0010\u0019\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00160\u00050\u00042\b\b\u0001\u0010\n\u001a\u00020\u00152\b\b\u0001\u0010\u0012\u001a\u00020\u0016H'¢\u0006\u0004\b\u0019\u0010\u001aJ/\u0010\u001e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001d0\u00050\u00042\b\b\u0001\u0010\u001b\u001a\u00020\u00152\b\b\u0001\u0010\u001c\u001a\u00020\u0015H'¢\u0006\u0004\b\u001e\u0010\u001fJ/\u0010#\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020!0\u00050\u00042\b\b\u0001\u0010\n\u001a\u00020 2\b\b\u0001\u0010\"\u001a\u00020!H'¢\u0006\u0004\b#\u0010$J%\u0010%\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020!0\u00050\u00042\b\b\u0001\u0010\n\u001a\u00020\u0015H'¢\u0006\u0004\b%\u0010\u0018¨\u0006&À\u0006\u0003"}, d2 = {"Lxk0/a;", "", "", "userGoalPk", "Lo53/i0;", "Lc83/a0;", "", "g", "(J)Lo53/i0;", "", "date", "", "Lzk0/h;", "c", "(Ljava/lang/String;)Lo53/i0;", "userGoalType", "f", "(Ljava/lang/String;Ljava/lang/String;)Lo53/i0;", "goal", "a", "(Ljava/lang/String;Ljava/lang/String;Lzk0/h;)Lo53/i0;", "Lfz0/c;", "Lzk0/c;", IntegerTokenConverter.CONVERTER_KEY, "(Lfz0/c;)Lo53/i0;", "h", "(Lfz0/c;Lzk0/c;)Lo53/i0;", "startDate", "endDate", "Lzk0/g;", JWKParameterNames.RSA_EXPONENT, "(Lfz0/c;Lfz0/c;)Lo53/i0;", "Lorg/joda/time/DateTime;", "Lzk0/a;", "baseGoalDTO", "d", "(Lorg/joda/time/DateTime;Lzk0/a;)Lo53/i0;", "b", "gcm-domain-wellness_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public interface a {
    @p("goal-service/goal/user/effective/{userGoalType}/{date}")
    i0<a0<h>> a(@s("userGoalType") String userGoalType, @s("date") String date, @i83.a h goal);

    @i83.f("wellness-service/wellness/wellness-goals/consolidated/pushes/{date}")
    i0<a0<zk0.a>> b(@s("date") fz0.c date);

    @i83.f("goal-service/goal/user/effective/{date}")
    i0<a0<List<h>>> c(@s("date") String date);

    @p("wellness-service/wellness/wellness-goals/consolidated/{date}")
    i0<a0<zk0.a>> d(@s("date") DateTime date, @i83.a zk0.a baseGoalDTO);

    @i83.f("/goal-service/goal/user/effective/weightgoal/{startDate}/{endDate}")
    i0<a0<zk0.g>> e(@s("startDate") fz0.c startDate, @s("endDate") fz0.c endDate);

    @i83.f("goal-service/goal/user/effective/{userGoalType}/{date}")
    i0<a0<h>> f(@s("userGoalType") String userGoalType, @s("date") String date);

    @i83.b("goal-service/goal/user/{userGoalPk}")
    i0<a0<Unit>> g(@s("userGoalPk") long userGoalPk);

    @p("wellness-service/wellness/wellness-goals/consolidated/steps/{date}")
    i0<a0<zk0.c>> h(@s("date") fz0.c date, @i83.a zk0.c goal);

    @i83.f("wellness-service/wellness/wellness-goals/consolidated/steps/{date}")
    i0<a0<zk0.c>> i(@s("date") fz0.c date);
}
