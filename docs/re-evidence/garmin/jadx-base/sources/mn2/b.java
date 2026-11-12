package mn2;

import c83.a0;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.nimbusds.jose.jwk.JWKParameterNames;
import okhttp3.ResponseBody;
import p005kotlin.Metadata;
import qn2.v;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000¬\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001JK\u0010\r\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\n0\t2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u00022\u0014\b\u0001\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005H'¢\u0006\u0004\b\r\u0010\u000eJU\u0010\u0013\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u000b0\n0\t2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u00022\b\b\u0001\u0010\u000f\u001a\u00020\u00022\u0014\b\u0001\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00110\u0005H'¢\u0006\u0004\b\u0013\u0010\u0014JK\u0010\u0017\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00160\u000b0\n0\t2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u00022\u0014\b\u0001\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00150\u0005H'¢\u0006\u0004\b\u0017\u0010\u000eJK\u0010\u0019\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00180\u000b0\n0\t2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u00022\u0014\b\u0001\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00160\u0005H'¢\u0006\u0004\b\u0019\u0010\u000eJU\u0010\u001b\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00160\u000b0\n0\t2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u00022\b\b\u0001\u0010\u000f\u001a\u00020\u00022\u0014\b\u0001\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u001a0\u0005H'¢\u0006\u0004\b\u001b\u0010\u0014JU\u0010\u001d\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00180\u000b0\n0\t2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u00022\b\b\u0001\u0010\u000f\u001a\u00020\u00022\u0014\b\u0001\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u001c0\u0005H'¢\u0006\u0004\b\u001d\u0010\u0014JU\u0010\u001e\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00180\u000b0\n0\t2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u00022\b\b\u0001\u0010\u000f\u001a\u00020\u00022\u0014\b\u0001\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00160\u0005H'¢\u0006\u0004\b\u001e\u0010\u0014JU\u0010!\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020 0\u000b0\n0\t2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u00022\b\b\u0001\u0010\u000f\u001a\u00020\u00022\u0014\b\u0001\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u001f0\u0005H'¢\u0006\u0004\b!\u0010\u0014JU\u0010#\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\"0\u000b0\n0\t2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u00022\b\b\u0001\u0010\u000f\u001a\u00020\u00022\u0014\b\u0001\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00160\u0005H'¢\u0006\u0004\b#\u0010\u0014JU\u0010%\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00160\u000b0\n0\t2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u00022\b\b\u0001\u0010\u000f\u001a\u00020\u00022\u0014\b\u0001\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020$0\u0005H'¢\u0006\u0004\b%\u0010\u0014JU\u0010&\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00180\u000b0\n0\t2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u00022\b\b\u0001\u0010\u000f\u001a\u00020\u00022\u0014\b\u0001\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00160\u0005H'¢\u0006\u0004\b&\u0010\u0014JU\u0010'\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00160\u000b0\n0\t2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u00022\b\b\u0001\u0010\u000f\u001a\u00020\u00022\u0014\b\u0001\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020$0\u0005H'¢\u0006\u0004\b'\u0010\u0014JU\u0010)\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020(0\u000b0\n0\t2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u00022\b\b\u0001\u0010\u000f\u001a\u00020\u00022\u0014\b\u0001\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00160\u0005H'¢\u0006\u0004\b)\u0010\u0014JU\u0010+\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020*0\u000b0\n0\t2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u00022\b\b\u0001\u0010\u000f\u001a\u00020\u00022\u0014\b\u0001\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u001a0\u0005H'¢\u0006\u0004\b+\u0010\u0014JU\u0010-\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020(0\u000b0\n0\t2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u00022\b\b\u0001\u0010\u000f\u001a\u00020\u00022\u0014\b\u0001\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020,\u0012\u0004\u0012\u00020\u00160\u0005H'¢\u0006\u0004\b-\u0010\u0014JU\u0010/\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020.0\u000b0\n0\t2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u00022\b\b\u0001\u0010\u000f\u001a\u00020\u00022\u0014\b\u0001\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020$0\u0005H'¢\u0006\u0004\b/\u0010\u0014J\u001b\u00101\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002000\n0\tH'¢\u0006\u0004\b1\u00102JU\u00104\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002030\u000b0\n0\t2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u00022\b\b\u0001\u0010\u000f\u001a\u00020\u00022\u0014\b\u0001\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u001a0\u0005H'¢\u0006\u0004\b4\u0010\u0014JO\u00106\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002050\n0\t2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u00022\b\b\u0001\u0010\u000f\u001a\u00020\u00022\u0014\b\u0001\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u001a0\u0005H'¢\u0006\u0004\b6\u0010\u0014J\u001b\u00108\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002070\n0\tH'¢\u0006\u0004\b8\u00102¨\u00069À\u0006\u0003"}, d2 = {"Lmn2/b;", "", "", "deviceId", "seId", "Lpn2/m;", "Lqn2/t;", "Lqn2/i;", TtmlNode.TAG_BODY, "Lq03/r;", "Lc83/a0;", "Lpn2/p;", "Lrn2/j;", "c", "(Ljava/lang/String;Ljava/lang/String;Lpn2/m;)Lq03/r;", "serviceId", "Lqn2/s;", "Lqn2/n;", "Lrn2/b;", IntegerTokenConverter.CONVERTER_KEY, "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lpn2/m;)Lq03/r;", "Lqn2/c;", "Lrn2/e;", "m", "Lrn2/r;", "f", "Lqn2/f;", "a", "Lqn2/j;", "h", JWKParameterNames.RSA_OTHER_PRIMES__PRIME_FACTOR, "Lqn2/d;", "Lrn2/c;", JWKParameterNames.RSA_OTHER_PRIMES__FACTOR_CRT_COEFFICIENT, "Lrn2/p;", JWKParameterNames.RSA_EXPONENT, "Lqn2/e;", "g", "l", "b", "Lrn2/q;", "s", "Lrn2/d;", JWKParameterNames.RSA_SECOND_PRIME_FACTOR, "Lqn2/v;", JWKParameterNames.RSA_MODULUS, "Lpn2/d;", JWKParameterNames.OCT_KEY_VALUE, "Lpn2/t;", "p", "()Lq03/r;", "Lrn2/m;", "j", "Lokhttp3/ResponseBody;", "d", "Lrn2/v;", "o", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public interface b {
    @i83.k({"User-Agent: GarminPay App", "Content-Type: application/json"})
    @i83.o("/nfc-service/suica/beginDeleteCard/{deviceId}/{seId}/{serviceId}")
    q03.r<a0<pn2.p<rn2.e>>> a(@i83.s("deviceId") String deviceId, @i83.s("seId") String seId, @i83.s("serviceId") String serviceId, @i83.a pn2.m<qn2.t, qn2.f> body);

    @i83.k({"User-Agent: GarminPay App", "Content-Type: application/json"})
    @i83.o("/nfc-service/suica/beginPermanentDeleteCard/{deviceId}/{seId}/{serviceId}")
    q03.r<a0<pn2.p<rn2.e>>> b(@i83.s("deviceId") String deviceId, @i83.s("seId") String seId, @i83.s("serviceId") String serviceId, @i83.a pn2.m<qn2.t, qn2.e> body);

    @i83.k({"User-Agent: GarminPay App", "Content-Type: application/json"})
    @i83.o("/nfc-service/suica/getCardList/{deviceId}/{seId}")
    q03.r<a0<pn2.p<rn2.j>>> c(@i83.s("deviceId") String deviceId, @i83.s("seId") String seId, @i83.a pn2.m<qn2.t, qn2.i> body);

    @i83.k({"User-Agent: GarminPay App", "Content-Type: application/json", "Accept: application/pdf"})
    @i83.o("/nfc-service/suica/getCardUsageHistory/{deviceId}/{seId}/{serviceId}")
    q03.r<a0<ResponseBody>> d(@i83.s("deviceId") String deviceId, @i83.s("seId") String seId, @i83.s("serviceId") String serviceId, @i83.a pn2.m<qn2.t, qn2.f> body);

    @i83.k({"User-Agent: GarminPay App", "Content-Type: application/json"})
    @i83.o("/nfc-service/suica/endIssueCard/{deviceId}/{seId}/{serviceId}")
    q03.r<a0<pn2.p<rn2.p>>> e(@i83.s("deviceId") String deviceId, @i83.s("seId") String seId, @i83.s("serviceId") String serviceId, @i83.a pn2.m<qn2.t, rn2.e> body);

    @i83.k({"User-Agent: GarminPay App", "Content-Type: application/json"})
    @i83.o("/nfc-service/suica/endInitializeChip/{deviceId}/{seId}")
    q03.r<a0<pn2.p<rn2.r>>> f(@i83.s("deviceId") String deviceId, @i83.s("seId") String seId, @i83.a pn2.m<qn2.t, rn2.e> body);

    @i83.k({"User-Agent: GarminPay App", "Content-Type: application/json"})
    @i83.o("/nfc-service/suica/beginAccessCard/{deviceId}/{seId}/{serviceId}")
    q03.r<a0<pn2.p<rn2.e>>> g(@i83.s("deviceId") String deviceId, @i83.s("seId") String seId, @i83.s("serviceId") String serviceId, @i83.a pn2.m<qn2.t, qn2.e> body);

    @i83.k({"User-Agent: GarminPay App", "Content-Type: application/json"})
    @i83.o("/nfc-service/suica/endDeleteCard/{deviceId}/{seId}/{serviceId}")
    q03.r<a0<pn2.p<rn2.r>>> h(@i83.s("deviceId") String deviceId, @i83.s("seId") String seId, @i83.s("serviceId") String serviceId, @i83.a pn2.m<qn2.t, qn2.j> body);

    @i83.k({"User-Agent: GarminPay App", "Content-Type: application/json"})
    @i83.o("/nfc-service/suica/getScript/{deviceId}/{seId}/{serviceId}")
    q03.r<a0<pn2.p<rn2.b>>> i(@i83.s("deviceId") String deviceId, @i83.s("seId") String seId, @i83.s("serviceId") String serviceId, @i83.a pn2.m<qn2.s, qn2.n> body);

    @i83.k({"User-Agent: GarminPay App", "Content-Type: application/json", "Accept: application/json"})
    @i83.o("/nfc-service/suica/getCardUsageHistory/{deviceId}/{seId}/{serviceId}")
    q03.r<a0<pn2.p<rn2.m>>> j(@i83.s("deviceId") String deviceId, @i83.s("seId") String seId, @i83.s("serviceId") String serviceId, @i83.a pn2.m<qn2.t, qn2.f> body);

    @i83.k({"User-Agent: GarminPay App", "Content-Type: application/json"})
    @i83.o("/nfc-service/suica/updateCardInfo/{deviceId}/{seId}/{serviceId}")
    q03.r<a0<pn2.p<pn2.d>>> k(@i83.s("deviceId") String deviceId, @i83.s("seId") String seId, @i83.s("serviceId") String serviceId, @i83.a pn2.m<qn2.t, qn2.e> body);

    @i83.k({"User-Agent: GarminPay App", "Content-Type: application/json"})
    @i83.o("/nfc-service/suica/endAccessCard/{deviceId}/{seId}/{serviceId}")
    q03.r<a0<pn2.p<rn2.r>>> l(@i83.s("deviceId") String deviceId, @i83.s("seId") String seId, @i83.s("serviceId") String serviceId, @i83.a pn2.m<qn2.t, rn2.e> body);

    @i83.k({"User-Agent: GarminPay App", "Content-Type: application/json"})
    @i83.o("/nfc-service/suica/beginInitializeChip/{deviceId}/{seId}")
    q03.r<a0<pn2.p<rn2.e>>> m(@i83.s("deviceId") String deviceId, @i83.s("seId") String seId, @i83.a pn2.m<qn2.t, qn2.c> body);

    @i83.k({"User-Agent: GarminPay App", "Content-Type: application/json"})
    @i83.o("/nfc-service/suica/endRecoverCard/{deviceId}/{seId}/{serviceId}")
    q03.r<a0<pn2.p<rn2.q>>> n(@i83.s("deviceId") String deviceId, @i83.s("seId") String seId, @i83.s("serviceId") String serviceId, @i83.a pn2.m<v, rn2.e> body);

    @i83.k({"User-Agent: GarminPay App", "Content-Type: application/json"})
    @i83.f("userprofile-service/userprofile/email")
    q03.r<a0<rn2.v>> o();

    @i83.k({"User-Agent: GarminPay App", "Content-Type: application/json"})
    @i83.f("/nfc-service/suica/customerInfo")
    q03.r<a0<pn2.t>> p();

    @i83.k({"User-Agent: GarminPay App", "Content-Type: application/json"})
    @i83.o("/nfc-service/suica/beginRecoverCard/{deviceId}/{seId}/{serviceId}")
    q03.r<a0<pn2.p<rn2.d>>> q(@i83.s("deviceId") String deviceId, @i83.s("seId") String seId, @i83.s("serviceId") String serviceId, @i83.a pn2.m<qn2.t, qn2.f> body);

    @i83.k({"User-Agent: GarminPay App", "Content-Type: application/json"})
    @i83.o("/nfc-service/suica/endDeleteCard/{deviceId}/{seId}/{serviceId}")
    q03.r<a0<pn2.p<rn2.r>>> r(@i83.s("deviceId") String deviceId, @i83.s("seId") String seId, @i83.s("serviceId") String serviceId, @i83.a pn2.m<qn2.t, rn2.e> body);

    @i83.k({"User-Agent: GarminPay App", "Content-Type: application/json"})
    @i83.o("/nfc-service/suica/endPermanentDeleteCard/{deviceId}/{seId}/{serviceId}")
    q03.r<a0<pn2.p<rn2.q>>> s(@i83.s("deviceId") String deviceId, @i83.s("seId") String seId, @i83.s("serviceId") String serviceId, @i83.a pn2.m<qn2.t, rn2.e> body);

    @i83.k({"User-Agent: GarminPay App", "Content-Type: application/json"})
    @i83.o("/nfc-service/suica/beginIssueCard/{deviceId}/{seId}/{serviceId}")
    q03.r<a0<pn2.p<rn2.c>>> t(@i83.s("deviceId") String deviceId, @i83.s("seId") String seId, @i83.s("serviceId") String serviceId, @i83.a pn2.m<qn2.t, qn2.d> body);
}
