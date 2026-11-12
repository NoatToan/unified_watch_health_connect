package vo1;

import c83.a0;
import com.nimbusds.jose.jwk.JWKParameterNames;
import i83.s;
import i83.t;
import java.util.List;
import o53.i0;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u001b\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0002H'¢\u0006\u0004\b\u0005\u0010\u0006J%\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u00030\u00022\b\b\u0001\u0010\b\u001a\u00020\u0007H'¢\u0006\u0004\b\n\u0010\u000bJ5\u0010\u0011\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u000f0\u00030\u00022\b\b\u0001\u0010\r\u001a\u00020\f2\b\b\u0001\u0010\u000e\u001a\u00020\fH'¢\u0006\u0004\b\u0011\u0010\u0012J!\u0010\u0014\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\u000f0\u00030\u0002H'¢\u0006\u0004\b\u0014\u0010\u0006J;\u0010\u0019\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00180\u00030\u00022\b\b\u0001\u0010\b\u001a\u00020\u00072\b\b\u0001\u0010\u0015\u001a\u00020\u00072\n\b\u0001\u0010\u0017\u001a\u0004\u0018\u00010\u0016H'¢\u0006\u0004\b\u0019\u0010\u001aJ1\u0010\u001c\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001b0\u00030\u00022\b\b\u0001\u0010\b\u001a\u00020\u00072\n\b\u0001\u0010\u0017\u001a\u0004\u0018\u00010\u0016H'¢\u0006\u0004\b\u001c\u0010\u001dJ+\u0010\u001f\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001e0\u000f0\u00030\u00022\b\b\u0001\u0010\u0015\u001a\u00020\u0007H'¢\u0006\u0004\b\u001f\u0010\u000b¨\u0006 À\u0006\u0003"}, d2 = {"Lvo1/a;", "", "Lo53/i0;", "Lc83/a0;", "Lyo1/l;", "f", "()Lo53/i0;", "", "groupRideUUID", "", "g", "(Ljava/lang/String;)Lo53/i0;", "Lfz0/c;", "startDate", "endDate", "", "Lyo1/k;", "b", "(Lfz0/c;Lfz0/c;)Lo53/i0;", "Lyo1/a;", "a", "locale", "", "activityId", "Lyo1/j;", "c", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;)Lo53/i0;", "Lyo1/f;", "d", "(Ljava/lang/String;Ljava/lang/Long;)Lo53/i0;", "Lyo1/c;", JWKParameterNames.RSA_EXPONENT, "gcm-domain-social_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public interface a {
    @i83.f("device-service/deviceregistration/devices")
    i0<a0<List<yo1.a>>> a();

    @i83.f("socialgroupride-service/socialGroupRide/userRides")
    i0<a0<List<yo1.k>>> b(@t("startDate") fz0.c startDate, @t("endDate") fz0.c endDate);

    @i83.f("socialgroupride-service/v2/social-group-ride/{groupRideUUID}")
    i0<a0<yo1.j>> c(@s("groupRideUUID") String groupRideUUID, @t("locale") String locale, @t("activityId") Long activityId);

    @i83.f("socialgroupride-service/v2/social-group-ride/{groupRideUUID}/allCompetitions")
    i0<a0<yo1.f>> d(@s("groupRideUUID") String groupRideUUID, @t("activityId") Long activityId);

    @i83.f("socialgroupride-service/socialGroupRide/awards")
    i0<a0<List<yo1.c>>> e(@t("locale") String locale);

    @i83.f("userpreference-service/Activity.userHasGroupRides")
    i0<a0<yo1.l>> f();

    @i83.b("socialgroupride-service/socialGroupRide/{groupRideUUID}")
    i0<a0<Unit>> g(@s("groupRideUUID") String groupRideUUID);
}
