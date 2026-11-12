package m42;

import c83.a0;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.nimbusds.jose.jwk.JWKParameterNames;
import i83.o;
import i83.s;
import i83.t;
import o53.i0;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\bf\u0018\u00002\u00020\u0001J/\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u0004H'¢\u0006\u0004\b\t\u0010\nJ%\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\u00070\u00062\b\b\u0001\u0010\f\u001a\u00020\u000bH'¢\u0006\u0004\b\u000e\u0010\u000fJ%\u0010\u0011\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\u00070\u00062\b\b\u0001\u0010\u0010\u001a\u00020\u0002H'¢\u0006\u0004\b\u0011\u0010\u0012J/\u0010\u0015\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\u00070\u00062\b\b\u0001\u0010\u0010\u001a\u00020\u00022\b\b\u0001\u0010\u0014\u001a\u00020\u0013H'¢\u0006\u0004\b\u0015\u0010\u0016J%\u0010\u0018\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00170\u00070\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u0018\u0010\u0012J/\u0010\u001c\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001b0\u00070\u00062\b\b\u0001\u0010\u0019\u001a\u00020\u00022\b\b\u0001\u0010\u001a\u001a\u00020\u0002H'¢\u0006\u0004\b\u001c\u0010\u001dJ/\u0010\u001f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001e0\u00070\u00062\b\b\u0001\u0010\u0019\u001a\u00020\u00022\b\b\u0001\u0010\u001a\u001a\u00020\u0002H'¢\u0006\u0004\b\u001f\u0010\u001dJR\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00040\u00072\n\b\u0003\u0010!\u001a\u0004\u0018\u00010 2\n\b\u0003\u0010\"\u001a\u0004\u0018\u00010 2\n\b\u0003\u0010\u0019\u001a\u0004\u0018\u00010#2\n\b\u0003\u0010\u001a\u001a\u0004\u0018\u00010#2\n\b\u0003\u0010$\u001a\u0004\u0018\u00010\u0004H§@¢\u0006\u0004\b%\u0010&J \u0010(\u001a\b\u0012\u0004\u0012\u00020\u00040\u00072\b\b\u0001\u0010'\u001a\u00020\u0002H§@¢\u0006\u0004\b(\u0010)¨\u0006*À\u0006\u0003"}, d2 = {"Lm42/a;", "", "Lfz0/c;", "date", "", "ignorePriority", "Lo53/i0;", "Lc83/a0;", "Ll42/h;", "d", "(Lfz0/c;Z)Lo53/i0;", "Ll42/i;", "weightDate", "", "a", "(Ll42/i;)Lo53/i0;", "connectDate", "g", "(Lfz0/c;)Lo53/i0;", "", "selectedVersion", JWKParameterNames.RSA_EXPONENT, "(Lfz0/c;J)Lo53/i0;", "Ll42/a;", "b", "startDate", "endDate", "Ll42/k;", "f", "(Lfz0/c;Lfz0/c;)Lo53/i0;", "Ll42/e;", "c", "", "minWeight", "maxWeight", "", "hasBodyMetrics", IntegerTokenConverter.CONVERTER_KEY, "(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Lt13/d;)Ljava/lang/Object;", "calendarDate", "h", "(Lfz0/c;Lt13/d;)Ljava/lang/Object;", "data_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public interface a {
    @o("weight-service/user-weight")
    i0<a0<Unit>> a(@i83.a l42.i weightDate);

    @i83.f("weight-service/weight/dayview/{date}")
    i0<a0<l42.a>> b(@s("date") fz0.c date);

    @i83.f("weight-service/weight/weeklyRange/{startDate}/{endDate}")
    i0<a0<l42.e>> c(@s("startDate") fz0.c startDate, @s("endDate") fz0.c endDate);

    @i83.f("weight-service/weight/latest")
    i0<a0<l42.h>> d(@t("date") fz0.c date, @t("ignorePriority") boolean ignorePriority);

    @i83.b("weight-service/weight/{connectDate}/byversion/{selectedVersion}")
    i0<a0<Unit>> e(@s("connectDate") fz0.c connectDate, @s("selectedVersion") long selectedVersion);

    @i83.f("weight-service/weight/range/{startDate}/{endDate}")
    i0<a0<l42.k>> f(@s("startDate") fz0.c startDate, @s("endDate") fz0.c endDate);

    @i83.b("weight-service/weight/{connectDate}")
    i0<a0<Unit>> g(@s("connectDate") fz0.c connectDate);

    @i83.f("weight-service/weight/checkAllRecentWeightsFromIndexS1/{calendarDate}")
    Object h(@s("calendarDate") fz0.c cVar, t13.d<? super a0<Boolean>> dVar);

    @i83.f("weight-service/weight/checkWeightHistory")
    Object i(@t("minWeight") Integer num, @t("maxWeight") Integer num2, @t("startDate") String str, @t("endDate") String str2, @t("hasBodyMetrics") Boolean bool, t13.d<? super a0<Boolean>> dVar);
}
