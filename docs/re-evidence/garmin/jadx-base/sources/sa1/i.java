package sa1;

import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.nimbusds.jose.jwk.JWKParameterNames;
import java.util.List;
import o53.i0;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J!\u0010\u0006\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00030\u0002H'¢\u0006\u0004\b\u0006\u0010\u0007J+\u0010\n\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00030\u00022\b\b\u0001\u0010\t\u001a\u00020\bH'¢\u0006\u0004\b\n\u0010\u000bJ/\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\u00030\u00022\b\b\u0001\u0010\f\u001a\u00020\b2\b\b\u0001\u0010\r\u001a\u00020\bH'¢\u0006\u0004\b\u000f\u0010\u0010J%\u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u00030\u00022\b\b\u0001\u0010\f\u001a\u00020\bH'¢\u0006\u0004\b\u0012\u0010\u000bJ%\u0010\u0014\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u00030\u00022\b\b\u0001\u0010\u0013\u001a\u00020\u0011H'¢\u0006\u0004\b\u0014\u0010\u0015J/\u0010\u0016\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u00030\u00022\b\b\u0001\u0010\f\u001a\u00020\b2\b\b\u0001\u0010\u0013\u001a\u00020\u0011H'¢\u0006\u0004\b\u0016\u0010\u0017J%\u0010\u0018\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\u00030\u00022\b\b\u0001\u0010\f\u001a\u00020\bH'¢\u0006\u0004\b\u0018\u0010\u000bJ%\u0010\u0019\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\u00030\u00022\b\b\u0001\u0010\t\u001a\u00020\bH'¢\u0006\u0004\b\u0019\u0010\u000bJ!\u0010\u001b\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001a0\u00040\u00030\u0002H'¢\u0006\u0004\b\u001b\u0010\u0007¨\u0006\u001cÀ\u0006\u0003"}, d2 = {"Lsa1/i;", "", "Lo53/i0;", "Lc83/a0;", "", "Lab1/g;", "h", "()Lo53/i0;", "", "courseId", IntegerTokenConverter.CONVERTER_KEY, "(J)Lo53/i0;", "powerGuidanceId", "deviceId", "", "f", "(JJ)Lo53/i0;", "Lab1/d;", "d", "powerGuideDTO", "c", "(Lab1/d;)Lo53/i0;", JWKParameterNames.RSA_EXPONENT, "(JLab1/d;)Lo53/i0;", "g", "b", "Lab1/b;", "a", "gcm-domain-training_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public interface i {
    @i83.f("device-service/deviceregistration/devices")
    i0<c83.a0<List<ab1.b>>> a();

    @i83.b("/v1/powerguidances/course/{courseId}")
    i0<c83.a0<Unit>> b(@i83.s("courseId") long courseId);

    @i83.o("/v1/powerguidances")
    i0<c83.a0<ab1.d>> c(@i83.a ab1.d powerGuideDTO);

    @i83.f("/v1/powerguidances/{powerGuidanceId}")
    i0<c83.a0<ab1.d>> d(@i83.s("powerGuidanceId") long powerGuidanceId);

    @i83.p("/v1/powerguidances/{powerGuidanceId}")
    i0<c83.a0<ab1.d>> e(@i83.s("powerGuidanceId") long powerGuidanceId, @i83.a ab1.d powerGuideDTO);

    @i83.o("/v1/powerguidances/{powerGuidanceId}/device/{deviceId}")
    i0<c83.a0<Unit>> f(@i83.s("powerGuidanceId") long powerGuidanceId, @i83.s("deviceId") long deviceId);

    @i83.b("/v1/powerguidances/{powerGuidanceId}")
    i0<c83.a0<Unit>> g(@i83.s("powerGuidanceId") long powerGuidanceId);

    @i83.f("/v1/powerguidances/summaries")
    i0<c83.a0<List<ab1.g>>> h();

    @i83.f("/v1/powerguidances/summaries")
    i0<c83.a0<List<ab1.g>>> i(@i83.t("courseId") long courseId);
}
