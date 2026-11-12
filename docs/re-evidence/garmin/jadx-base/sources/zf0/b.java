package zf0;

import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.mapbox.maps.MapboxMap;
import com.nimbusds.jose.jwk.JWKParameterNames;
import java.util.List;
import okhttp3.MultipartBody;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000¤\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J%\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u0006\u0010\u0007J/\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\t\u001a\u00020\bH'¢\u0006\u0004\b\n\u0010\u000bJ/\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\u00050\u00042\b\b\u0001\u0010\r\u001a\u00020\f2\b\b\u0001\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u000f\u0010\u0010J%\u0010\u0011\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00050\u00042\b\b\u0001\u0010\r\u001a\u00020\fH'¢\u0006\u0004\b\u0011\u0010\u0012J/\u0010\u0014\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00050\u00042\b\b\u0001\u0010\u0013\u001a\u00020\f2\b\b\u0001\u0010\r\u001a\u00020\fH'¢\u0006\u0004\b\u0014\u0010\u0015J%\u0010\u0018\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00050\u00042\b\b\u0001\u0010\u0017\u001a\u00020\u0016H'¢\u0006\u0004\b\u0018\u0010\u0019J%\u0010\u001c\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001b0\u00050\u00042\b\b\u0001\u0010\u001a\u001a\u00020\fH'¢\u0006\u0004\b\u001c\u0010\u0012J5\u0010!\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020 0\u00050\u00042\b\b\u0001\u0010\r\u001a\u00020\f2\u000e\b\u0001\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001e0\u001dH'¢\u0006\u0004\b!\u0010\"J/\u0010%\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\u00050\u00042\b\b\u0001\u0010\u0017\u001a\u00020\u00162\b\b\u0001\u0010$\u001a\u00020#H'¢\u0006\u0004\b%\u0010&J%\u0010'\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\u00050\u00042\b\b\u0001\u0010\r\u001a\u00020\fH'¢\u0006\u0004\b'\u0010\u0012J/\u0010(\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\u00050\u00042\b\b\u0001\u0010\r\u001a\u00020\f2\b\b\u0001\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b(\u0010\u0010J/\u0010+\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\u00050\u00042\b\b\u0001\u0010\u0017\u001a\u00020\u00162\b\b\u0001\u0010*\u001a\u00020)H'¢\u0006\u0004\b+\u0010,JA\u00101\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u001d0\u00050\u00042\b\b\u0001\u0010.\u001a\u00020-2\b\b\u0001\u0010/\u001a\u00020-2\n\b\u0003\u00100\u001a\u0004\u0018\u00010\u0016H'¢\u0006\u0004\b1\u00102J\u001b\u00104\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002030\u00050\u0004H'¢\u0006\u0004\b4\u00105J%\u00106\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\u00050\u00042\b\b\u0001\u0010\r\u001a\u00020\fH'¢\u0006\u0004\b6\u0010\u0012J%\u00107\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\u00050\u00042\b\b\u0001\u0010\u0017\u001a\u00020\u0016H'¢\u0006\u0004\b7\u0010\u0019J%\u00108\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\u00050\u00042\b\b\u0001\u0010\u0017\u001a\u00020\u0016H'¢\u0006\u0004\b8\u0010\u0019J%\u0010;\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020:0\u00050\u00042\b\b\u0001\u00109\u001a\u00020\u0016H'¢\u0006\u0004\b;\u0010\u0019J!\u0010=\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020<0\u001d0\u00050\u0004H'¢\u0006\u0004\b=\u00105J+\u0010@\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\u00050\u00042\u000e\b\u0001\u0010?\u001a\b\u0012\u0004\u0012\u00020>0\u001dH'¢\u0006\u0004\b@\u0010AJ%\u0010D\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\u00050\u00042\b\b\u0001\u0010C\u001a\u00020BH'¢\u0006\u0004\bD\u0010EJW\u0010J\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u001d0\u00050\u00042\b\b\u0001\u0010F\u001a\u00020\u00162\b\b\u0001\u0010G\u001a\u00020\u00162\b\b\u0003\u0010H\u001a\u00020\u00162\n\b\u0003\u0010I\u001a\u0004\u0018\u00010\u00162\n\b\u0003\u0010/\u001a\u0004\u0018\u00010-H'¢\u0006\u0004\bJ\u0010KJ5\u0010M\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u001d0\u00050\u00042\b\b\u0001\u0010L\u001a\u00020\f2\b\b\u0001\u0010F\u001a\u00020\u0016H'¢\u0006\u0004\bM\u0010NJ/\u0010Q\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020P0\u00050\u00042\b\b\u0001\u0010\r\u001a\u00020\f2\b\b\u0001\u0010O\u001a\u00020\u0016H'¢\u0006\u0004\bQ\u0010NJ\u001b\u0010R\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\u00050\u0004H'¢\u0006\u0004\bR\u00105J/\u0010U\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\u00050\u00042\b\b\u0001\u0010\u0017\u001a\u00020\u00162\b\b\u0001\u0010T\u001a\u00020SH'¢\u0006\u0004\bU\u0010VJ/\u0010W\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\u00050\u00042\b\b\u0001\u0010\r\u001a\u00020\u00162\b\b\u0001\u0010T\u001a\u00020SH'¢\u0006\u0004\bW\u0010VJ%\u0010X\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\u00050\u00042\b\b\u0001\u0010\r\u001a\u00020\fH'¢\u0006\u0004\bX\u0010\u0012J%\u0010Y\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\u00050\u00042\b\b\u0001\u0010\u0017\u001a\u00020\u0016H'¢\u0006\u0004\bY\u0010\u0019J?\u0010\\\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u001d0\u00050\u00042\b\b\u0001\u0010F\u001a\u00020\u00162\b\b\u0001\u0010G\u001a\u00020\u00162\b\b\u0003\u0010[\u001a\u00020ZH'¢\u0006\u0004\b\\\u0010]¨\u0006^À\u0006\u0003"}, d2 = {"Lzf0/b;", "", "Lfg0/k;", "eventDTO", "Lo53/i0;", "Lc83/a0;", JWKParameterNames.RSA_OTHER_PRIMES__PRIME_FACTOR, "(Lfg0/k;)Lo53/i0;", "Lgg0/c;", "flowType", "A", "(Lfg0/k;Lgg0/c;)Lo53/i0;", "", "eventId", "", "m", "(JLfg0/k;)Lo53/i0;", "u", "(J)Lo53/i0;", "groupId", "c", "(JJ)Lo53/i0;", "", "eventUuid", JWKParameterNames.ELLIPTIC_CURVE_Y_COORDINATE, "(Ljava/lang/String;)Lo53/i0;", "courseId", "Lcom/garmin/android/apps/connectmobile/courses/model/e;", "b", "", "Lokhttp3/MultipartBody$Part;", "files", "Lfg0/m;", "s", "(JLjava/util/List;)Lo53/i0;", "Lfg0/w;", "flagEventImageDTO", "D", "(Ljava/lang/String;Lfg0/w;)Lo53/i0;", JWKParameterNames.RSA_EXPONENT, "p", "Lfg0/j;", "eventCustomizationDTO", "j", "(Ljava/lang/String;Lfg0/j;)Lo53/i0;", "", "numDays", MapboxMap.QFE_LIMIT, "calendarOwnerGuid", "v", "(IILjava/lang/String;)Lo53/i0;", "Lfg0/z;", "g", "()Lo53/i0;", "E", "d", "w", "url", "Lfg0/s;", "f", "Lfg0/i;", "a", "Lfg0/q;", "eventSendToDeviceDTO", JWKParameterNames.RSA_SECOND_PRIME_FACTOR, "(Ljava/util/List;)Lo53/i0;", "Lfg0/b;", "badgeDTO", "l", "(Lfg0/b;)Lo53/i0;", "startDate", "endDate", "sortOrder", "eventType", "h", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)Lo53/i0;", "trainingPlanID", "C", "(JLjava/lang/String;)Lo53/i0;", "eventImageUUID", "Lfg0/a0;", "x", IntegerTokenConverter.CONVERTER_KEY, "Lj61/f;", "courseProfileDTO", "o", "(Ljava/lang/String;Lj61/f;)Lo53/i0;", "z", JWKParameterNames.RSA_OTHER_PRIMES__FACTOR_CRT_COEFFICIENT, JWKParameterNames.OCT_KEY_VALUE, "", "onlyTrainingEvents", JWKParameterNames.RSA_MODULUS, "(Ljava/lang/String;Ljava/lang/String;Z)Lo53/i0;", "gcm-domain-training_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public interface b {
    static /* synthetic */ o53.i0 B(b bVar, String str, String str2, String str3, String str4, Integer num, int i14) {
        if ((i14 & 4) != 0) {
            str3 = "";
        }
        return bVar.h(str, str2, str3, (i14 & 8) != 0 ? null : str4, (i14 & 16) != 0 ? null : num);
    }

    @i83.o("calendar-service/event?")
    o53.i0<c83.a0<fg0.k>> A(@i83.a fg0.k eventDTO, @i83.t("eventCreatorFlow") gg0.c flowType);

    @i83.f("calendar-service/events")
    o53.i0<c83.a0<List<fg0.k>>> C(@i83.t("trainingPlanId") long trainingPlanID, @i83.t("startDate") String startDate);

    @i83.p("calendar-service/event/{eventUuid}/flag-image")
    o53.i0<c83.a0<Unit>> D(@i83.s("eventUuid") String eventUuid, @i83.a fg0.w flagEventImageDTO);

    @i83.b("calendar-service/event/{eventId}")
    o53.i0<c83.a0<Unit>> E(@i83.s("eventId") long eventId);

    @i83.f("device-service/deviceregistration/devices?overwritePulseOxCapabilities=false")
    o53.i0<c83.a0<List<fg0.i>>> a();

    @i83.f("mobile-gateway/course/{courseId}")
    o53.i0<c83.a0<com.garmin.android.apps.connectmobile.courses.model.e>> b(@i83.s("courseId") long courseId);

    @i83.f("calendar-service/group/{groupId}/event/{eventId}")
    o53.i0<c83.a0<fg0.k>> c(@i83.s("groupId") long groupId, @i83.s("eventId") long eventId);

    @i83.o("calendar-service/event/{eventUuid}/subscription")
    o53.i0<c83.a0<Unit>> d(@i83.s("eventUuid") String eventUuid);

    @i83.b("calendar-service/event/{eventId}/image")
    o53.i0<c83.a0<Unit>> e(@i83.s("eventId") long eventId);

    @i83.o("url-validation/validation/url")
    o53.i0<c83.a0<fg0.s>> f(@i83.a String url);

    @i83.f("calendar-service/event/primary")
    o53.i0<c83.a0<fg0.z>> g();

    @i83.f("calendar-service/events")
    o53.i0<c83.a0<List<fg0.k>>> h(@i83.t("startDate") String startDate, @i83.t("endDate") String endDate, @i83.t("sortOrder") String sortOrder, @i83.t("eventType") String eventType, @i83.t(MapboxMap.QFE_LIMIT) Integer limit);

    @i83.b("calendar-service/events/priority")
    o53.i0<c83.a0<Unit>> i();

    @i83.p("calendar-service/event/{eventUuid}/customization")
    o53.i0<c83.a0<Unit>> j(@i83.s("eventUuid") String eventUuid, @i83.a fg0.j eventCustomizationDTO);

    @i83.b("/calendar-service/event/{eventUuId}/subscription/course-details")
    o53.i0<c83.a0<Unit>> k(@i83.s("eventUuId") String eventUuid);

    @i83.o("badge-service/badge/earn")
    o53.i0<c83.a0<Unit>> l(@i83.a fg0.b badgeDTO);

    @i83.p("calendar-service/event/{eventId}")
    o53.i0<c83.a0<Unit>> m(@i83.s("eventId") long eventId, @i83.a fg0.k eventDTO);

    @i83.f("calendar-service/events")
    o53.i0<c83.a0<List<fg0.k>>> n(@i83.t("startDate") String startDate, @i83.t("endDate") String endDate, @i83.t("onlyTrainingEvents") boolean onlyTrainingEvents);

    @i83.p("/calendar-service/event/{eventUuid}/customization/course-details")
    o53.i0<c83.a0<Unit>> o(@i83.s("eventUuid") String eventUuid, @i83.a j61.f courseProfileDTO);

    @i83.p("calendar-service/event/{eventId}")
    o53.i0<c83.a0<Unit>> p(@i83.s("eventId") long eventId, @i83.a fg0.k eventDTO);

    @i83.o("device-service/devicemessage/messages")
    o53.i0<c83.a0<Unit>> q(@i83.a List<fg0.q> eventSendToDeviceDTO);

    @i83.o("calendar-service/event")
    o53.i0<c83.a0<fg0.k>> r(@i83.a fg0.k eventDTO);

    @i83.o("calendar-service/event/{eventId}/image")
    @i83.l
    o53.i0<c83.a0<fg0.m>> s(@i83.s("eventId") long eventId, @i83.q List<MultipartBody.Part> files);

    @i83.b("/calendar-service/event/{eventId}/customization/course-details")
    o53.i0<c83.a0<Unit>> t(@i83.s("eventId") long eventId);

    @i83.f("calendar-service/event/{eventId}")
    o53.i0<c83.a0<fg0.k>> u(@i83.s("eventId") long eventId);

    @i83.f("calendar-service/events/upcoming?")
    o53.i0<c83.a0<List<fg0.k>>> v(@i83.t("numDaysForward") int numDays, @i83.t(MapboxMap.QFE_LIMIT) int limit, @i83.t("calendarOwnerGuid") String calendarOwnerGuid);

    @i83.b("/calendar-service/event/{eventUuid}/subscription")
    o53.i0<c83.a0<Unit>> w(@i83.s("eventUuid") String eventUuid);

    @i83.f("calendar-service/event/{eventId}/image/{eventImageUUID}")
    o53.i0<c83.a0<fg0.a0>> x(@i83.s("eventId") long eventId, @i83.s("eventImageUUID") String eventImageUUID);

    @i83.f("calendar-service/event/{eventUuid}/shareable")
    o53.i0<c83.a0<fg0.k>> y(@i83.s("eventUuid") String eventUuid);

    @i83.p("/calendar-service/event/{eventId}/course-details")
    o53.i0<c83.a0<Unit>> z(@i83.s("eventId") String eventId, @i83.a j61.f courseProfileDTO);
}
