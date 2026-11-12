package a20;

import c83.a0;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.nimbusds.jose.jwk.JWKParameterNames;
import d20.b;
import d20.c;
import d20.d;
import d20.e;
import i83.f;
import i83.i;
import i83.k;
import i83.o;
import i83.p;
import i83.s;
import java.util.List;
import o53.i0;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J%\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u0007\u0010\bJ!\u0010\u000b\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\u00050\u0004H'¢\u0006\u0004\b\u000b\u0010\fJ\u001b\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\u00050\u0004H'¢\u0006\u0004\b\u000e\u0010\fJ/\u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u00050\u00042\b\b\u0001\u0010\u000f\u001a\u00020\r2\b\b\u0001\u0010\u0010\u001a\u00020\u0002H'¢\u0006\u0004\b\u0012\u0010\u0013J/\u0010\u0017\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00160\u00050\u00042\b\b\u0001\u0010\u0014\u001a\u00020\u00022\b\b\u0003\u0010\u0015\u001a\u00020\u0002H'¢\u0006\u0004\b\u0017\u0010\u0018J/\u0010\u001b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00160\u00050\u00042\b\b\u0003\u0010\u0015\u001a\u00020\u00022\b\b\u0001\u0010\u001a\u001a\u00020\u0019H'¢\u0006\u0004\b\u001b\u0010\u001c¨\u0006\u001dÀ\u0006\u0003"}, d2 = {"La20/a;", "", "", "partnerType", "Lo53/i0;", "Lc83/a0;", "Ld20/d;", "h", "(Ljava/lang/String;)Lo53/i0;", "", "Ld20/b;", "j", "()Lo53/i0;", "Ld20/c;", "f", "consentLocationDTO", "localeHeader", "", "g", "(Ld20/c;Ljava/lang/String;)Lo53/i0;", "consentId", "approvalType", "Ld20/a;", JWKParameterNames.OCT_KEY_VALUE, "(Ljava/lang/String;Ljava/lang/String;)Lo53/i0;", "Ld20/e;", "consentRequest", IntegerTokenConverter.CONVERTER_KEY, "(Ljava/lang/String;Ld20/e;)Lo53/i0;", "gcm-consent_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public interface a {
    @f("/userprofile-service/userprofile/location")
    i0<a0<c>> f();

    @k({"Content-Type: application/json"})
    @p("/userprofile-service/userprofile/location")
    i0<a0<Unit>> g(@i83.a c consentLocationDTO, @i("locale") String localeHeader);

    @f("/partner-service/partner/consumer/{partnerType}")
    i0<a0<d>> h(@s("partnerType") String partnerType);

    @o("accountsharing-service/managed-accounts/parent-approval-request/{approvalType}")
    i0<a0<d20.a>> i(@s("approvalType") String approvalType, @i83.a e consentRequest);

    @f("/gdprconsent-service/country/list")
    i0<a0<List<b>>> j();

    @f("accountsharing-service/managed-accounts/parent-approval-request/{approvalType}/{consentId}")
    i0<a0<d20.a>> k(@s("consentId") String consentId, @s("approvalType") String approvalType);
}
