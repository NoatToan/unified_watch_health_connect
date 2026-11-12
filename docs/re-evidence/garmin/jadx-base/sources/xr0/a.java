package xr0;

import c83.a0;
import com.nimbusds.jose.jwk.JWKParameterNames;
import fz0.c;
import i83.b;
import i83.f;
import i83.p;
import i83.s;
import java.util.List;
import o53.i0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import yr0.o;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J!\u0010\u0006\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00030\u0002H'¢\u0006\u0004\b\u0006\u0010\u0007J%\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00030\u00022\b\b\u0001\u0010\b\u001a\u00020\u0005H'¢\u0006\u0004\b\t\u0010\nJ%\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00030\u00022\b\b\u0001\u0010\b\u001a\u00020\u0005H'¢\u0006\u0004\b\u000b\u0010\nJ%\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\u00030\u00022\b\b\u0001\u0010\r\u001a\u00020\fH'¢\u0006\u0004\b\u000f\u0010\u0010J%\u0010\u0014\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\u00030\u00022\b\b\u0001\u0010\u0012\u001a\u00020\u0011H'¢\u0006\u0004\b\u0014\u0010\u0015¨\u0006\u0016À\u0006\u0003"}, d2 = {"Lxr0/a;", "", "Lo53/i0;", "Lc83/a0;", "", "Lyr0/o;", "a", "()Lo53/i0;", "trip", JWKParameterNames.RSA_EXPONENT, "(Lyr0/o;)Lo53/i0;", "d", "", "tripId", "", "b", "(J)Lo53/i0;", "Lfz0/c;", "date", "Lyr0/f;", "c", "(Lfz0/c;)Lo53/i0;", "gcm-jet-lag_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public interface a {
    @f("/jetlag-service/jetlag/trip/all")
    i0<a0<List<o>>> a();

    @b("/jetlag-service/jetlag/trip/{tripId}")
    i0<a0<Unit>> b(@s("tripId") long tripId);

    @f("/jetlag-service/jetlag/status/daily/{calendarDate}")
    i0<a0<yr0.f>> c(@s("calendarDate") c date);

    @p("/jetlag-service/jetlag/trip")
    i0<a0<o>> d(@i83.a o trip);

    @i83.o("/jetlag-service/jetlag/trip")
    i0<a0<o>> e(@i83.a o trip);
}
