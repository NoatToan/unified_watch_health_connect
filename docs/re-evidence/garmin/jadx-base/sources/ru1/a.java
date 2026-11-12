package ru1;

import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.nimbusds.jose.jwk.JWKParameterNames;
import i83.k;
import i83.s;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0011\bf\u0018\u00002\u00020\u0001J\u0015\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H'¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H'¢\u0006\u0004\b\u0006\u0010\u0005J\u0015\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H'¢\u0006\u0004\b\u0007\u0010\u0005J\u0015\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H'¢\u0006\u0004\b\b\u0010\u0005J\u0015\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H'¢\u0006\u0004\b\t\u0010\u0005J\u0015\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H'¢\u0006\u0004\b\n\u0010\u0005J\u0015\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H'¢\u0006\u0004\b\u000b\u0010\u0005J\u0015\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H'¢\u0006\u0004\b\f\u0010\u0005J\u001f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0003\u0010\r\u001a\u00020\u0003H'¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0003\u0010\r\u001a\u00020\u0003H'¢\u0006\u0004\b\u0010\u0010\u000fJ\u001f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0003\u0010\r\u001a\u00020\u0003H'¢\u0006\u0004\b\u0011\u0010\u000fJ\u001f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0003\u0010\r\u001a\u00020\u0003H'¢\u0006\u0004\b\u0012\u0010\u000fJ\u0015\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H'¢\u0006\u0004\b\u0013\u0010\u0005¨\u0006\u0014À\u0006\u0003"}, d2 = {"Lru1/a;", "", "Lc83/d;", "", "f", "()Lc83/d;", "l", JWKParameterNames.RSA_EXPONENT, IntegerTokenConverter.CONVERTER_KEY, JWKParameterNames.OCT_KEY_VALUE, "h", "d", "a", "language", "b", "(Ljava/lang/String;)Lc83/d;", "m", "c", "j", "g", "gcm-domain-training_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public interface a {
    @k({"X-garmin-client-id:garminConnect", "Cache-Control: max-age=86400, max-stale=86400, min-fresh=86400"})
    @i83.f("/web-data/exercises/ExercisesWithWheelchair.json")
    c83.d<String> a();

    @k({"X-garmin-client-id:garminConnect", "Cache-Control: max-age=86400, max-stale=86400, min-fresh=86400"})
    @i83.f("/web-translations/yoga-pilates/yoga-pilates{language}.properties")
    c83.d<String> b(@s("language") String language);

    @k({"X-garmin-client-id:garminConnect", "Cache-Control: max-age=86400, max-stale=86400, min-fresh=86400"})
    @i83.f("/web-translations/yoga/yoga{language}.properties")
    c83.d<String> c(@s("language") String language);

    @k({"X-garmin-client-id:garminConnect", "Cache-Control: max-age=86400, max-stale=86400, min-fresh=86400"})
    @i83.f("/web-data/exercises/MobilityWithWheelchair.json")
    c83.d<String> d();

    @k({"X-garmin-client-id:garminConnect", "Cache-Control: max-age=86400, max-stale=86400, min-fresh=86400"})
    @i83.f("/web-data/exercises/Mobility.json")
    c83.d<String> e();

    @k({"X-garmin-client-id:garminConnect", "Cache-Control: max-age=86400, max-stale=86400, min-fresh=86400"})
    @i83.f("/web-data/exercises/Yoga.json")
    c83.d<String> f();

    @i83.f("/web-data/exercises/ExercisePriorityList.json")
    c83.d<String> g();

    @k({"X-garmin-client-id:garminConnect", "Cache-Control: max-age=86400, max-stale=86400, min-fresh=86400"})
    @i83.f("/web-data/exercises/PilatesWithWheelchair.json")
    c83.d<String> h();

    @k({"X-garmin-client-id:garminConnect", "Cache-Control: max-age=86400, max-stale=86400, min-fresh=86400"})
    @i83.f("/web-data/exercises/Exercises.json")
    c83.d<String> i();

    @k({"X-garmin-client-id:garminConnect", "Cache-Control: max-age=86400, max-stale=86400, min-fresh=86400"})
    @i83.f("/web-translations/exercise_types/exercise_types{language}.properties")
    c83.d<String> j(@s("language") String language);

    @k({"X-garmin-client-id:garminConnect", "Cache-Control: max-age=86400, max-stale=86400, min-fresh=86400"})
    @i83.f("/web-data/exercises/YogaWithWheelchair.json")
    c83.d<String> k();

    @k({"X-garmin-client-id:garminConnect", "Cache-Control: max-age=86400, max-stale=86400, min-fresh=86400"})
    @i83.f("/web-data/exercises/Pilates.json")
    c83.d<String> l();

    @k({"X-garmin-client-id:garminConnect", "Cache-Control: max-age=86400, max-stale=86400, min-fresh=86400"})
    @i83.f("/web-translations/pilates/pilates{language}.properties")
    c83.d<String> m(@s("language") String language);
}
