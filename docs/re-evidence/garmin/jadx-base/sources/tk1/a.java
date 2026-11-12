package tk1;

import c83.a0;
import com.garmin.android.apps.connectmobile.settings.user.PowerZonesDTO;
import com.nimbusds.jose.jwk.JWKParameterNames;
import i83.f;
import i83.k;
import i83.p;
import i83.s;
import i83.t;
import java.util.List;
import o53.i0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import vk1.b;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u001b\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0002H'¢\u0006\u0004\b\u0005\u0010\u0006J!\u0010\t\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u00030\u0002H'¢\u0006\u0004\b\t\u0010\u0006J%\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\u00030\u00022\b\b\u0001\u0010\n\u001a\u00020\u0004H'¢\u0006\u0004\b\f\u0010\rJ%\u0010\u0010\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u00022\b\b\u0003\u0010\u000f\u001a\u00020\u000eH'¢\u0006\u0004\b\u0010\u0010\u0011J/\u0010\u0013\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u00022\b\b\u0001\u0010\u0012\u001a\u00020\u00042\b\b\u0003\u0010\u000f\u001a\u00020\u000eH'¢\u0006\u0004\b\u0013\u0010\u0014J%\u0010\u0015\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u00022\b\b\u0001\u0010\u0012\u001a\u00020\u0004H'¢\u0006\u0004\b\u0015\u0010\rJ%\u0010\u0018\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00170\u00030\u00022\b\b\u0001\u0010\u0016\u001a\u00020\bH'¢\u0006\u0004\b\u0018\u0010\u0019¨\u0006\u001aÀ\u0006\u0003"}, d2 = {"Ltk1/a;", "", "Lo53/i0;", "Lc83/a0;", "", JWKParameterNames.RSA_EXPONENT, "()Lo53/i0;", "", "Lcom/garmin/android/apps/connectmobile/settings/user/PowerZonesDTO;", "f", "jsonToSave", "Lvk1/b;", "c", "(Ljava/lang/String;)Lo53/i0;", "", "generateDefaults", "d", "(Z)Lo53/i0;", "sport", "g", "(Ljava/lang/String;Z)Lo53/i0;", "b", "powerZones", "", "a", "(Lcom/garmin/android/apps/connectmobile/settings/user/PowerZonesDTO;)Lo53/i0;", "gcm-domain-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public interface a {
    @p("/biometric-service/powerZones/")
    i0<a0<Unit>> a(@i83.a PowerZonesDTO powerZones);

    @f("/biometric-service/powerZones/sport/{sport}")
    i0<a0<String>> b(@s("sport") String sport);

    @k({"Content-Type: application/json"})
    @p("/biometric-service/heartRateZones")
    i0<a0<b>> c(@i83.a String jsonToSave);

    @f("/biometric-service/heartRateZones")
    i0<a0<String>> d(@t("generateDefaults") boolean generateDefaults);

    @f("/biometric-service/heartRateZones")
    i0<a0<String>> e();

    @f("/biometric-service/powerZones/sports/all")
    i0<a0<List<PowerZonesDTO>>> f();

    @f("/biometric-service/powerZones/sport/{sport}")
    i0<a0<String>> g(@s("sport") String sport, @t("generateDefaults") boolean generateDefaults);
}
