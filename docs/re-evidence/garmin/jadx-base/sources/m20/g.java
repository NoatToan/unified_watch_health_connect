package m20;

import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.nimbusds.jose.jwk.JWKParameterNames;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\bf\u0018\u00002\u00020\u0001J\u001b\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0002H'¢\u0006\u0004\b\u0005\u0010\u0006J%\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u00022\b\b\u0001\u0010\b\u001a\u00020\u0007H'¢\u0006\u0004\b\t\u0010\nJ\u001b\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\u00030\u0002H'¢\u0006\u0004\b\f\u0010\u0006J\u001b\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\u00030\u0002H'¢\u0006\u0004\b\u000e\u0010\u0006J\u001b\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\u00030\u0002H'¢\u0006\u0004\b\u000f\u0010\u0006J/\u0010\u0014\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\u00030\u00022\b\b\u0001\u0010\u0010\u001a\u00020\u00072\b\b\u0001\u0010\u0012\u001a\u00020\u0011H'¢\u0006\u0004\b\u0014\u0010\u0015J%\u0010\u0018\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00170\u00030\u00022\b\b\u0001\u0010\u0016\u001a\u00020\rH'¢\u0006\u0004\b\u0018\u0010\u0019J%\u0010\u001b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001a0\u00030\u00022\b\b\u0001\u0010\u0012\u001a\u00020\u0011H'¢\u0006\u0004\b\u001b\u0010\u001cJ%\u0010\u001d\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001a0\u00030\u00022\b\b\u0001\u0010\u0012\u001a\u00020\u0011H'¢\u0006\u0004\b\u001d\u0010\u001cJ%\u0010 \u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001f0\u00030\u00022\b\b\u0001\u0010\u001e\u001a\u00020\u0007H'¢\u0006\u0004\b \u0010\nJ%\u0010!\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001f0\u00030\u00022\b\b\u0001\u0010\u001e\u001a\u00020\u0007H'¢\u0006\u0004\b!\u0010\nJ/\u0010$\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\"0\u00030\u00022\b\b\u0001\u0010\b\u001a\u00020\u00072\b\b\u0001\u0010#\u001a\u00020\"H'¢\u0006\u0004\b$\u0010%J%\u0010'\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\u00030\u00022\b\b\u0001\u0010&\u001a\u00020\u000bH'¢\u0006\u0004\b'\u0010(J%\u0010)\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\"0\u00030\u00022\b\b\u0001\u0010#\u001a\u00020\"H'¢\u0006\u0004\b)\u0010*¨\u0006+À\u0006\u0003"}, d2 = {"Lm20/g;", "", "Lo53/i0;", "Lc83/a0;", "", IntegerTokenConverter.CONVERTER_KEY, "()Lo53/i0;", "", "contactId", JWKParameterNames.OCT_KEY_VALUE, "(Ljava/lang/String;)Lo53/i0;", "Ll20/r;", JWKParameterNames.RSA_MODULUS, "Ltj1/e;", "l", JWKParameterNames.RSA_EXPONENT, "featureName", "", "contactInfoPrimaryKey", "Ll20/c;", "m", "(Ljava/lang/String;J)Lo53/i0;", "contactsDTO", "", "c", "(Ltj1/e;)Lo53/i0;", "Ltj1/r;", "h", "(J)Lo53/i0;", "j", "token", "Lm20/f;", "f", "g", "Ll20/a;", "contactDTO", "b", "(Ljava/lang/String;Ll20/a;)Lo53/i0;", "userContactsDTO", "d", "(Ll20/r;)Lo53/i0;", "a", "(Ll20/a;)Lo53/i0;", "gcm-contacts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public interface g {
    @i83.o("/usercontact-service/contacts")
    o53.i0<c83.a0<l20.a>> a(@i83.a l20.a contactDTO);

    @i83.p("/usercontact-service/contacts/{id}")
    o53.i0<c83.a0<l20.a>> b(@i83.s(TtmlNode.ATTR_ID) String contactId, @i83.a l20.a contactDTO);

    @i83.p("usercontact-service/contacts/ECC")
    o53.i0<c83.a0<Unit>> c(@i83.a tj1.e contactsDTO);

    @i83.k({"Content-Type: application/json"})
    @i83.p("/usercontact-service/contacts/upsert")
    o53.i0<c83.a0<l20.r>> d(@i83.a l20.r userContactsDTO);

    @i83.f("usercontact-service/contacts")
    o53.i0<c83.a0<l20.r>> e();

    @i83.o("usercontact-service/emergencyContact/confirmation/{token}/pending")
    o53.i0<c83.a0<f>> f(@i83.s("token") String token);

    @i83.o("usercontact-service/livetrack/confirmation/{token}/pending")
    o53.i0<c83.a0<f>> g(@i83.s("token") String token);

    @i83.f("usercontact-service/emergencyContact/confirmation/{contactInfoPk}/initialize")
    o53.i0<c83.a0<tj1.r>> h(@i83.s("contactInfoPk") long contactInfoPrimaryKey);

    @i83.k({"Content-Type: application/json"})
    @i83.b("/usercontact-service/contacts/all")
    o53.i0<c83.a0<Boolean>> i();

    @i83.f("usercontact-service/livetrack/confirmation/{contactInfoPk}/initialize")
    o53.i0<c83.a0<tj1.r>> j(@i83.s("contactInfoPk") long contactInfoPrimaryKey);

    @i83.k({"Content-Type: application/json"})
    @i83.b("/usercontact-service/contacts/{id}")
    o53.i0<c83.a0<Boolean>> k(@i83.s(TtmlNode.ATTR_ID) String contactId);

    @i83.f("usercontact-service/contacts/ECC")
    o53.i0<c83.a0<tj1.e>> l();

    @i83.o("usercontact-service/livetrack-management/{featureName}/confirmation/{contactInfoPk}/messenger-invite")
    o53.i0<c83.a0<l20.c>> m(@i83.s("featureName") String featureName, @i83.s("contactInfoPk") long contactInfoPrimaryKey);

    @i83.f("usercontact-service/contacts/live-event-sharing")
    o53.i0<c83.a0<l20.r>> n();
}
