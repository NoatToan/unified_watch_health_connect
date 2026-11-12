package hj2;

import c83.a0;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.nimbusds.jose.jwk.JWKParameterNames;
import i83.o;
import i83.p;
import i83.y;
import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J&\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0007\u0010\bJ \u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\t\u0010\bJ \u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u000b\u0010\bJ*\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00060\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\r\u001a\u00020\fH§@¢\u0006\u0004\b\u000e\u0010\u000fJ*\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00060\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\r\u001a\u00020\fH§@¢\u0006\u0004\b\u0010\u0010\u000fJ&\u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0012\u0010\bJ \u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00110\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0013\u0010\bJ \u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\n0\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0014\u0010\bJ*\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00110\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0016\u001a\u00020\u0015H§@¢\u0006\u0004\b\u0017\u0010\u0018J*\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00110\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0016\u001a\u00020\u0015H§@¢\u0006\u0004\b\u0019\u0010\u0018J&\u0010\u001c\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001b0\u00050\u00042\b\b\u0001\u0010\u001a\u001a\u00020\u0002H§@¢\u0006\u0004\b\u001c\u0010\bJ&\u0010\u001e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001d0\u00050\u00042\b\b\u0001\u0010\u001a\u001a\u00020\u0002H§@¢\u0006\u0004\b\u001e\u0010\bJ&\u0010 \u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001f0\u00050\u00042\b\b\u0001\u0010\u001a\u001a\u00020\u0002H§@¢\u0006\u0004\b \u0010\bJ&\u0010\"\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020!0\u00050\u00042\b\b\u0001\u0010\u001a\u001a\u00020\u0002H§@¢\u0006\u0004\b\"\u0010\bJ*\u0010&\u001a\b\u0012\u0004\u0012\u00020%0\u00042\b\b\u0001\u0010\u001a\u001a\u00020\u00022\b\b\u0001\u0010$\u001a\u00020#H§@¢\u0006\u0004\b&\u0010'¨\u0006(À\u0006\u0003"}, d2 = {"Lhj2/b;", "", "", "customerBusinessServicesUrl", "Lc83/a0;", "", "Lfj2/a;", IntegerTokenConverter.CONVERTER_KEY, "(Ljava/lang/String;Lt13/d;)Ljava/lang/Object;", "g", "", "o", "Lgj2/a;", "addressRequestDto", "a", "(Ljava/lang/String;Lgj2/a;Lt13/d;)Ljava/lang/Object;", JWKParameterNames.OCT_KEY_VALUE, "Lfj2/h;", "j", "m", "h", "Lgj2/d;", "phoneNumberRequestDto", "b", "(Ljava/lang/String;Lgj2/d;Lt13/d;)Ljava/lang/Object;", "c", "geographyServicesUrl", "Lfj2/d;", JWKParameterNames.RSA_MODULUS, "Lfj2/k;", "d", "Lfj2/e;", "f", "Lfj2/l;", "l", "Lgj2/b;", "addressValidationRequestDto", "Lfj2/b;", JWKParameterNames.RSA_EXPONENT, "(Ljava/lang/String;Lgj2/b;Lt13/d;)Ljava/lang/Object;", "customer-management_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
public interface b {
    @o
    Object a(@y String str, @i83.a gj2.a aVar, t13.d<? super a0<fj2.a>> dVar);

    @o
    Object b(@y String str, @i83.a gj2.d dVar, t13.d<? super a0<fj2.h>> dVar2);

    @p
    Object c(@y String str, @i83.a gj2.d dVar, t13.d<? super a0<fj2.h>> dVar2);

    @i83.f
    Object d(@y String str, t13.d<? super a0<List<fj2.k>>> dVar);

    @o
    Object e(@y String str, @i83.a gj2.b bVar, t13.d<? super a0<fj2.b>> dVar);

    @i83.f
    Object f(@y String str, t13.d<? super a0<List<fj2.e>>> dVar);

    @i83.f
    Object g(@y String str, t13.d<? super a0<fj2.a>> dVar);

    @i83.b
    Object h(@y String str, t13.d<? super a0<Unit>> dVar);

    @i83.f
    Object i(@y String str, t13.d<? super a0<List<fj2.a>>> dVar);

    @i83.f
    Object j(@y String str, t13.d<? super a0<List<fj2.h>>> dVar);

    @p
    Object k(@y String str, @i83.a gj2.a aVar, t13.d<? super a0<fj2.a>> dVar);

    @i83.f
    Object l(@y String str, t13.d<? super a0<List<fj2.l>>> dVar);

    @i83.f
    Object m(@y String str, t13.d<? super a0<fj2.h>> dVar);

    @i83.f
    Object n(@y String str, t13.d<? super a0<List<fj2.d>>> dVar);

    @i83.b
    Object o(@y String str, t13.d<? super a0<Unit>> dVar);
}
