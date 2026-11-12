package nv0;

import c83.a0;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.google.firebase.perf.FirebasePerformance;
import com.nimbusds.jose.jwk.JWKParameterNames;
import i83.f;
import i83.o;
import i83.p;
import i83.s;
import java.util.List;
import o53.i0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import pv0.d;
import pv0.g;
import pv0.h;
import pv0.q;
import pv0.v;
import pv0.z;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J+\u0010\b\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\b\u0010\tJ/\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00050\u00042\b\b\u0001\u0010\u000b\u001a\u00020\n2\b\b\u0001\u0010\f\u001a\u00020\u0007H'¢\u0006\u0004\b\r\u0010\u000eJ%\u0010\u0010\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u00050\u00042\b\b\u0001\u0010\u000b\u001a\u00020\nH'¢\u0006\u0004\b\u0010\u0010\u0011J%\u0010\u0014\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u00050\u00042\b\b\u0001\u0010\u0013\u001a\u00020\u0012H'¢\u0006\u0004\b\u0014\u0010\u0015J1\u0010\u0017\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u00050\u00042\u000e\b\u0001\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H'¢\u0006\u0004\b\u0017\u0010\u0018J%\u0010\u001b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00190\u00050\u00042\b\b\u0001\u0010\u001a\u001a\u00020\u0019H'¢\u0006\u0004\b\u001b\u0010\u001cJ9\u0010\u001f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u00050\u00042\b\b\u0001\u0010\u000b\u001a\u00020\n2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u001e\u001a\u00020\u001dH'¢\u0006\u0004\b\u001f\u0010 J/\u0010!\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u00050\u00042\b\b\u0001\u0010\u000b\u001a\u00020\n2\b\b\u0001\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b!\u0010\"J%\u0010$\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020#0\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b$\u0010\tJ9\u0010*\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020)0\u00050\u00042\b\b\u0001\u0010&\u001a\u00020%2\b\b\u0001\u0010'\u001a\u00020\u00022\b\b\u0001\u0010(\u001a\u00020\u0002H'¢\u0006\u0004\b*\u0010+JC\u0010-\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020,0\u00050\u00042\b\b\u0001\u0010\u000b\u001a\u00020\n2\b\b\u0001\u0010&\u001a\u00020%2\b\b\u0001\u0010'\u001a\u00020\u00022\b\b\u0001\u0010(\u001a\u00020\u0002H'¢\u0006\u0004\b-\u0010.JC\u00101\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020,0\u00050\u00042\b\b\u0001\u0010\u000b\u001a\u00020\n2\b\b\u0001\u0010&\u001a\u00020%2\b\b\u0001\u0010(\u001a\u00020\u00022\b\b\u0001\u00100\u001a\u00020/H'¢\u0006\u0004\b1\u00102¨\u00063À\u0006\u0003"}, d2 = {"Lnv0/a;", "", "Lfz0/c;", "calendarDate", "Lo53/i0;", "Lc83/a0;", "", "Lpv0/d;", JWKParameterNames.RSA_EXPONENT, "(Lfz0/c;)Lo53/i0;", "", "behaviourId", "behaviour", IntegerTokenConverter.CONVERTER_KEY, "(JLpv0/d;)Lo53/i0;", "", "g", "(J)Lo53/i0;", "Lpv0/g;", "behaviourIds", "d", "(Lpv0/g;)Lo53/i0;", "behaviours", "l", "(Ljava/util/List;)Lo53/i0;", "Lpv0/a0;", "trackedBehaviours", "j", "(Lpv0/a0;)Lo53/i0;", "Lpv0/h;", "dailyLog", "c", "(JLfz0/c;Lpv0/h;)Lo53/i0;", "b", "(JLfz0/c;)Lo53/i0;", "Lpv0/q;", "a", "", "metricId", "startDate", "endDate", "Lpv0/v;", "f", "(Ljava/lang/String;Lfz0/c;Lfz0/c;)Lo53/i0;", "Lpv0/z;", JWKParameterNames.OCT_KEY_VALUE, "(JLjava/lang/String;Lfz0/c;Lfz0/c;)Lo53/i0;", "", "numOfWeeks", "h", "(JLjava/lang/String;Lfz0/c;I)Lo53/i0;", "data_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public interface a {
    @f("/lifestylelogging-service/dailyLog/{calendarDate}")
    i0<a0<q>> a(@s("calendarDate") fz0.c calendarDate);

    @i83.b("/lifestylelogging-service/dailyLog/{behaviourId}/{calendarDate}")
    i0<a0<Unit>> b(@s("behaviourId") long behaviourId, @s("calendarDate") fz0.c calendarDate);

    @p("/lifestylelogging-service/dailyLog/{behaviourId}/{calendarDate}")
    i0<a0<Unit>> c(@s("behaviourId") long behaviourId, @s("calendarDate") fz0.c calendarDate, @i83.a h dailyLog);

    @i83.h(hasBody = true, method = FirebasePerformance.HttpMethod.DELETE, path = "/lifestylelogging-service/behaviours/batchDelete")
    i0<a0<Unit>> d(@i83.a g behaviourIds);

    @f("/lifestylelogging-service/behaviours/{calendarDate}")
    i0<a0<List<d>>> e(@s("calendarDate") fz0.c calendarDate);

    @f("/lifestylelogging-service/stats/daily/{metricId}/{startDate}/{endDate}")
    i0<a0<v>> f(@s("metricId") String metricId, @s("startDate") fz0.c startDate, @s("endDate") fz0.c endDate);

    @i83.b("/lifestylelogging-service/behaviours/{behaviourId}")
    i0<a0<Unit>> g(@s("behaviourId") long behaviourId);

    @f("/lifestylelogging-service/stats/weekly/{behaviourId}/{metricId}/{endDate}/{numOfWeeks}")
    i0<a0<z>> h(@s("behaviourId") long behaviourId, @s("metricId") String metricId, @s("endDate") fz0.c endDate, @s("numOfWeeks") int numOfWeeks);

    @p("/lifestylelogging-service/behaviours/{behaviourId}")
    i0<a0<d>> i(@s("behaviourId") long behaviourId, @i83.a d behaviour);

    @p("/lifestylelogging-service/trackedBehaviours")
    i0<a0<pv0.a0>> j(@i83.a pv0.a0 trackedBehaviours);

    @f("/lifestylelogging-service/stats/daily/{behaviourId}/{metricId}/{startDate}/{endDate}")
    i0<a0<z>> k(@s("behaviourId") long behaviourId, @s("metricId") String metricId, @s("startDate") fz0.c startDate, @s("endDate") fz0.c endDate);

    @o("/lifestylelogging-service/behaviours/batch")
    i0<a0<List<d>>> l(@i83.a List<d> behaviours);
}
