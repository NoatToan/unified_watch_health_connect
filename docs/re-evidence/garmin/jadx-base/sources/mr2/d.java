package mr2;

import androidx.lifecycle.s0;
import androidx.lifecycle.y0;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.garmin.feature.garminpay.providers.gpay.model.Links;
import com.garmin.feature.garminpay.providers.gpay.snowball.CurrencyValue;
import com.garmin.feature.garminpay.providers.gpay.snowball.exception.CardRefundFailedException;
import com.github.mikephil.chartingv2.BuildConfig;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.google.common.base.Optional;
import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.nimbusds.jose.jwk.JWKParameterNames;
import fo2.i0;
import fo2.j0;
import fo2.l0;
import fo2.y;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import js2.e;
import o13.p;
import o13.r;
import o53.m0;
import org.joda.time.DateTime;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p13.w;
import uy2.c0;
import uy2.f0;
import uy2.g0;
import uy2.o0;
import uy2.p0;
import uy2.v;
import vr2.q;
import w02.b0;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\bf\u0018\u0000 @2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u000fAB.CDEFG0\u001cH\u0003\u001dIJJ\u000f\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005H§@¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH'¢\u0006\u0004\b\t\u0010\nJ)\u0010\u0011\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0010\u001a\u00020\u000fH'¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u0013H'¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u0002H'¢\u0006\u0004\b\u0017\u0010\u0004J\u000f\u0010\u0018\u001a\u00020\u0002H'¢\u0006\u0004\b\u0018\u0010\u0004J\u000f\u0010\u0019\u001a\u00020\u0002H'¢\u0006\u0004\b\u0019\u0010\u0004J\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u001aH§@¢\u0006\u0004\b\u001b\u0010\u0007J\u0010\u0010\u001c\u001a\u00020\u0002H§@¢\u0006\u0004\b\u001c\u0010\u0007J\u000f\u0010\u001d\u001a\u00020\u0002H'¢\u0006\u0004\b\u001d\u0010\u0004J\u000f\u0010\u001e\u001a\u00020\u0005H'¢\u0006\u0004\b\u001e\u0010\u001fR\u0014\u0010\u000e\u001a\u00020\r8'X¦\u0004¢\u0006\u0006\u001a\u0004\b \u0010!R\u0014\u0010$\u001a\u00020\u000f8'X¦\u0004¢\u0006\u0006\u001a\u0004\b\"\u0010#R\u0014\u0010&\u001a\u00020\u000f8'X¦\u0004¢\u0006\u0006\u001a\u0004\b%\u0010#R \u0010,\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020)0(0'8'X¦\u0004¢\u0006\u0006\u001a\u0004\b*\u0010+R\u001a\u0010/\u001a\b\u0012\u0004\u0012\u00020-0'8'X¦\u0004¢\u0006\u0006\u001a\u0004\b.\u0010+R\u0014\u00101\u001a\u00020\u00058'X¦\u0004¢\u0006\u0006\u001a\u0004\b0\u0010\u001fR\u001a\u00104\u001a\b\u0012\u0004\u0012\u0002020'8'X¦\u0004¢\u0006\u0006\u001a\u0004\b3\u0010+R \u00108\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u000206050'8'X¦\u0004¢\u0006\u0006\u001a\u0004\b7\u0010+R\u001a\u00109\u001a\b\u0012\u0004\u0012\u00020\u00050'8'X¦\u0004¢\u0006\u0006\u001a\u0004\b9\u0010+R\u001a\u0010<\u001a\b\u0012\u0004\u0012\u00020:0'8'X¦\u0004¢\u0006\u0006\u001a\u0004\b;\u0010+R\u001a\u0010?\u001a\b\u0012\u0004\u0012\u00020=0'8'X¦\u0004¢\u0006\u0006\u001a\u0004\b>\u0010+¨\u0006KÀ\u0006\u0003"}, d2 = {"Lmr2/d;", "Lry2/a;", "", "h", "()V", "", "N", "(Lt13/d;)Ljava/lang/Object;", "Lbr2/f;", "h4", "()Lbr2/f;", "Lvr2/q;", "userWalletItem", "", "deviceUnitId", "", "watchName", "O3", "(Lvr2/q;Ljava/lang/Long;Ljava/lang/String;)V", "Lcr2/a;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "V3", "(Lcr2/a;)V", "I", "Y", "B", "Lhs2/e$a;", "Y0", "m", "l", "l1", "()Z", "getDeviceUnitId", "()J", JWKParameterNames.RSA_OTHER_PRIMES__PRIME_FACTOR, "()Ljava/lang/String;", "deviceImageUrl", "getDeviceName", "deviceName", "Landroidx/lifecycle/s0;", "Lns2/a;", "Lms2/e;", "g4", "()Landroidx/lifecycle/s0;", "operators", "Lwr2/f;", JWKParameterNames.RSA_MODULUS, "cardOperationNotification", "f", "isPhoneBluetoothTurnedOn", "Ljs2/e;", "c1", "walletPasscodeState", "Lcom/google/common/base/Optional;", "Lhs2/c;", "y2", "walletExpressCard", "isLoading", "Lmr2/b;", "r4", "associatedCardsModel", "Lbr2/d;", "p4", "deviceConnectionStatusLiveData", "h0", "b", "c", "o", "a", JWKParameterNames.OCT_KEY_VALUE, IntegerTokenConverter.CONVERTER_KEY, "j", "g", "d", JWKParameterNames.RSA_EXPONENT, "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public interface d extends ry2.a<d> {

    /* JADX INFO: renamed from: h0, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = Companion.f120436a;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lmr2/d$a;", "Lxy2/o;", "Ljs2/e;", "<init>", "()V", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a implements xy2.o<e> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ uy2.d f120432a;

        public a() {
            uy2.e eVar = uy2.e.f173458a;
            e eVar2 = e.BLOCKED_WALLET;
            eVar.getClass();
            this.f120432a = new uy2.d(eVar2);
        }

        @Override // xy2.o
        /* JADX INFO: renamed from: getValue */
        public final e getF173457a() {
            return (e) this.f120432a.f173457a;
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lmr2/d$b;", "Lxy2/o;", "Lns2/a;", "Lms2/e;", "<init>", "()V", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class b implements xy2.o<ns2.a<? extends ms2.e>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ uy2.d f120433a;

        public b() {
            uy2.e eVar = uy2.e.f173458a;
            ns2.a aVarQ = gg.b.q(false);
            eVar.getClass();
            this.f120433a = new uy2.d(aVarQ);
        }

        @Override // xy2.o
        /* JADX INFO: renamed from: getValue */
        public final ns2.a<? extends ms2.e> getF173457a() {
            return (ns2.a) this.f120433a.f173457a;
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lmr2/d$c;", "Lxy2/o;", "Landroidx/lifecycle/s0;", "Lwr2/f;", "<init>", "()V", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class c implements xy2.o<s0<wr2.f>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ uy2.d f120434a;

        public c() {
            uy2.e eVar = uy2.e.f173458a;
            wr2.e eVar2 = wr2.e.f186838m;
            eVar.getClass();
            this.f120434a = new uy2.d(eVar2);
        }

        @Override // xy2.o
        /* JADX INFO: renamed from: getValue */
        public final s0<wr2.f> getF173457a() {
            return (s0) this.f120434a.f173457a;
        }
    }

    /* JADX INFO: renamed from: mr2.d$d, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lmr2/d$d;", "Lxy2/o;", "Lcom/garmin/feature/garminpay/providers/gpay/snowball/exception/CardRefundFailedException;", "<init>", "()V", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class C2285d implements xy2.o<CardRefundFailedException> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ uy2.d f120435a;

        public C2285d() {
            uy2.e eVar = uy2.e.f173458a;
            CardRefundFailedException cardRefundFailedException = new CardRefundFailedException("Beijing T-Union Transit Card", "userId", "refundId");
            eVar.getClass();
            this.f120435a = new uy2.d(cardRefundFailedException);
        }

        @Override // xy2.o
        /* JADX INFO: renamed from: getValue */
        public final CardRefundFailedException getF173457a() {
            return (CardRefundFailedException) this.f120435a.f173457a;
        }
    }

    /* JADX INFO: renamed from: mr2.d$e, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lmr2/d$e;", "", "<init>", "()V", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ Companion f120436a = new Companion();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final fs2.a f120437b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final mr2.b f120438c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final br2.f f120439d;

        static {
            fs2.a aVar = new fs2.a();
            aVar.f73429d = "Beijing T-Union Transit Card";
            aVar.f73426a = kg.f.c();
            aVar.f73427b = is2.b.FITPAY;
            aVar.f73428c = qs2.a.f147388q;
            aVar.f73433h = qs2.f.ACTIVE;
            aq2.j.f12491a.getClass();
            Gson gsonD = aq2.j.d();
            Links links = new Links(new p[0]);
            String str = aVar.f73426a;
            fo2.e eVar = fo2.e.ACTIVE;
            List listC = w.c(y.TRANSIT);
            List listC2 = w.c(ep2.a.NFC);
            JsonObject jsonObject = new JsonObject();
            DateTime dateTimeNow = DateTime.now();
            dateTimeNow.getClass();
            long jCurrentTimeMillis = System.currentTimeMillis();
            DateTime dateTimeNow2 = DateTime.now();
            dateTimeNow2.getClass();
            long jCurrentTimeMillis2 = System.currentTimeMillis();
            Links links2 = new Links(new p[0]);
            j0 j0Var = j0.RESTORE_AVAILABLE;
            long jCurrentTimeMillis3 = System.currentTimeMillis();
            DateTime dateTimeNow3 = DateTime.now();
            dateTimeNow3.getClass();
            long jCurrentTimeMillis4 = System.currentTimeMillis();
            DateTime dateTimeNow4 = DateTime.now();
            dateTimeNow4.getClass();
            l0 l0Var = new l0(links, str, "userId", "deviceId", eVar, listC, listC2, jsonObject, dateTimeNow, jCurrentTimeMillis, dateTimeNow2, jCurrentTimeMillis2, new i0(links2, "transitCardId", "productId", "BJTU", "Beijing T-Union Transit Card", j0Var, "providerName", "CARD_ID_2", "userId", "cardNumber", jCurrentTimeMillis3, dateTimeNow3, jCurrentTimeMillis4, dateTimeNow4, Double.valueOf(10.0d), 30, Boolean.TRUE, new fo2.d(null, null, null, null, null, null, null, null, null, null, null, null, null, null, w.c(new fo2.m(new Links(new p("self", new fo2.p("https://asset-cache-prod-cn-northwest-1.s3.cn-northwest-1.amazonaws.com.cn/20210608/accac9ea06313cb7ab9bdb8b47fc62f758773a4a532e817f00c7b18ed25a098b", false, 2, null))), "image/png")), null, null)), null);
            CurrencyValue.a aVar2 = CurrencyValue.f51217c;
            ko2.a.b bVar = ko2.a.f105768a;
            aVar2.getClass();
            String json = gsonD.toJson(new as2.g(l0Var, new as2.b(CurrencyValue.a.a(10L, bVar), System.currentTimeMillis())));
            json.getClass();
            aVar.f73435j = json;
            f120437b = aVar;
            List<fs2.a> listC3 = w.c(aVar);
            ArrayList arrayList = new ArrayList(p13.y.r(listC3, 10));
            for (fs2.a aVar3 : listC3) {
                is2.b bVar2 = aVar3.f73427b;
                yq2.b bVarA = bVar2 != null ? yr2.m.a(bVar2) : null;
                bVarA.getClass();
                arrayList.add(bVarA.a(aVar3));
            }
            f120438c = new mr2.b(arrayList, p13.j0.f134944a);
            f120439d = new br2.f(1L, "{device name}", "https://static.garmincdn.com/en/products/010-02410-14/v/cf-lg-8beb21e8-4285-4569-ab2b-0b6dfbb47e84.jpg", br2.d.CONNECTED, BuildConfig.VERSION_NAME, BuildConfig.VERSION_NAME, false, false, 192, null);
        }

        private Companion() {
        }

        public static hs2.c a(fs2.a aVar) {
            aVar.getClass();
            UUID uuidFromString = UUID.fromString(aVar.f73426a);
            uuidFromString.getClass();
            byte[] bArrA = b0.A(uuidFromString);
            qs2.a aVar2 = aVar.f73428c;
            String str = aVar2 != null ? aVar2.f147399d : null;
            str.getClass();
            return new hs2.c(bArrA, str, Float.POSITIVE_INFINITY);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lmr2/d$f;", "Lxy2/o;", "Lmr2/b;", "<init>", "()V", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class f implements xy2.o<mr2.b> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ uy2.d f120440a;

        public f() {
            uy2.e eVar = uy2.e.f173458a;
            d.INSTANCE.getClass();
            mr2.b bVar = Companion.f120438c;
            eVar.getClass();
            this.f120440a = new uy2.d(bVar);
        }

        @Override // xy2.o
        /* JADX INFO: renamed from: getValue */
        public final mr2.b getF173457a() {
            return (mr2.b) this.f120440a.f173457a;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lmr2/d$g;", "Lxy2/o;", "Lbr2/d;", "<init>", "()V", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class g implements xy2.o<br2.d> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ uy2.d f120441a;

        public g() {
            uy2.e eVar = uy2.e.f173458a;
            br2.d dVar = br2.d.CONNECTED;
            eVar.getClass();
            this.f120441a = new uy2.d(dVar);
        }

        @Override // xy2.o
        /* JADX INFO: renamed from: getValue */
        public final br2.d getF173457a() {
            return (br2.d) this.f120441a.f173457a;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lmr2/d$h;", "Lxy2/o;", "Lbr2/f;", "<init>", "()V", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class h implements xy2.o<br2.f> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ uy2.d f120442a;

        public h() {
            uy2.e eVar = uy2.e.f173458a;
            d.INSTANCE.getClass();
            br2.f fVar = Companion.f120439d;
            eVar.getClass();
            this.f120442a = new uy2.d(fVar);
        }

        @Override // xy2.o
        /* JADX INFO: renamed from: getValue */
        public final br2.f getF173457a() {
            return (br2.f) this.f120442a.f173457a;
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lmr2/d$i;", "Lxy2/o;", "Lcom/google/common/base/Optional;", "Lhs2/c;", "<init>", "()V", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class i implements xy2.o<Optional<hs2.c>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ uy2.d f120443a;

        public i() {
            uy2.e eVar = uy2.e.f173458a;
            d.INSTANCE.getClass();
            Optional optionalOf = Optional.of(Companion.a(Companion.f120437b));
            eVar.getClass();
            this.f120443a = new uy2.d(optionalOf);
        }

        @Override // xy2.o
        /* JADX INFO: renamed from: getValue */
        public final Optional<hs2.c> getF173457a() {
            return (Optional) this.f120443a.f173457a;
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0007\u0018\u00002\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lmr2/d$j;", "Luy2/b;", "Landroidx/lifecycle/y0;", "", "<init>", "()V", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class j implements uy2.b<y0<Boolean>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ b f120444a;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
        @v13.e(c = "com.garmin.feature.garminpay.ui.devicesettings.viewmodels.IDeviceDetailsViewModel$LoadingStateProvider$1$1", f = "IDeviceDetailsViewModel.kt", l = {120}, m = "invokeSuspend", v = 2)
        public static final class a extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public int f120445a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ y0<Boolean> f120446b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(y0<Boolean> y0Var, t13.d<? super a> dVar) {
                super(2, dVar);
                this.f120446b = y0Var;
            }

            @Override // v13.a
            public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
                return new a(this.f120446b, dVar);
            }

            @Override // e23.p
            public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
                return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // v13.a
            public final Object invokeSuspend(Object obj) {
                u13.a aVar = u13.a.COROUTINE_SUSPENDED;
                int i14 = this.f120445a;
                if (i14 == 0) {
                    r.b(obj);
                    this.f120446b.j(Boolean.TRUE);
                    this.f120445a = 1;
                    if (m0.b(2000L, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i14 != 1) {
                        vb.h.z("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    r.b(obj);
                }
                return Unit.INSTANCE;
            }
        }

        @Metadata(d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00020\u0001¨\u0006\u0003¸\u0006\u0000"}, d2 = {"uy2/g", "Luy2/b;", "Landroidx/lifecycle/y0;", "ui-synthesizer_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class b implements uy2.b<y0<Boolean>> {
            @Override // uy2.b
            public final void a(y0<Boolean> y0Var, Object[] objArr) throws Throwable {
                ge1.b.W(t13.h.f161748a, new a(y0Var, null));
            }
        }

        public j() {
            int i14 = uy2.h.f173460a;
            this.f120444a = new b();
        }

        @Override // uy2.b
        public final void a(y0<Boolean> y0Var, Object[] objArr) throws Throwable {
            this.f120444a.a(y0Var, objArr);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lmr2/d$k;", "Lxy2/o;", "Ljs2/e;", "<init>", "()V", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class k implements xy2.o<e> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ uy2.d f120447a;

        public k() {
            uy2.e eVar = uy2.e.f173458a;
            e eVar2 = e.LOCKED_WALLET;
            eVar.getClass();
            this.f120447a = new uy2.d(eVar2);
        }

        @Override // xy2.o
        /* JADX INFO: renamed from: getValue */
        public final e getF173457a() {
            return (e) this.f120447a.f173457a;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lmr2/d$l;", "Lxy2/o;", "Lhs2/e$a;", "<init>", "()V", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class l implements xy2.o<hs2.e.a> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ uy2.d f120448a;

        public l() {
            uy2.e eVar = uy2.e.f173458a;
            hs2.e.a aVar = hs2.e.a.NFC_STACK_FAILED;
            eVar.getClass();
            this.f120448a = new uy2.d(aVar);
        }

        @Override // xy2.o
        /* JADX INFO: renamed from: getValue */
        public final hs2.e.a getF173457a() {
            return (hs2.e.a) this.f120448a.f173457a;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lmr2/d$m;", "Lxy2/o;", "Lmr2/b;", "<init>", "()V", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class m implements xy2.o<mr2.b> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ uy2.d f120449a;

        public m() {
            uy2.e eVar = uy2.e.f173458a;
            p13.j0 j0Var = p13.j0.f134944a;
            mr2.b bVar = new mr2.b(j0Var, j0Var);
            eVar.getClass();
            this.f120449a = new uy2.d(bVar);
        }

        @Override // xy2.o
        /* JADX INFO: renamed from: getValue */
        public final mr2.b getF173457a() {
            return (mr2.b) this.f120449a.f173457a;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lmr2/d$n;", "Lxy2/o;", "Ljs2/e;", "<init>", "()V", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class n implements xy2.o<e> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ uy2.d f120450a;

        public n() {
            uy2.e eVar = uy2.e.f173458a;
            e eVar2 = e.NO_PASSCODE_SET;
            eVar.getClass();
            this.f120450a = new uy2.d(eVar2);
        }

        @Override // xy2.o
        /* JADX INFO: renamed from: getValue */
        public final e getF173457a() {
            return (e) this.f120450a.f173457a;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lmr2/d$o;", "Lxy2/o;", "Ljs2/e;", "<init>", "()V", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class o implements xy2.o<e> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ uy2.d f120451a;

        public o() {
            uy2.e eVar = uy2.e.f173458a;
            e eVar2 = e.PASSCODE_SET;
            eVar.getClass();
            this.f120451a = new uy2.d(eVar2);
        }

        @Override // xy2.o
        /* JADX INFO: renamed from: getValue */
        public final e getF173457a() {
            return (e) this.f120451a.f173457a;
        }
    }

    @uy2.k
    @p0(keys = {"rapid_pass"})
    void B();

    @uy2.k
    void I();

    @g0(description = "Device is connected")
    @v(description = "Device is disconnected")
    Object N(t13.d<? super Boolean> dVar);

    @uy2.k
    @p0(keys = {"loading"})
    void O3(q userWalletItem, Long deviceUnitId, String watchName);

    @uy2.k
    void V3(cr2.a listener);

    @uy2.k
    @p0(keys = {"passcode"})
    void Y();

    @c0(description = "No specific error")
    @uy2.r(description = "NFC not connected", providerClass = l.class)
    Object Y0(t13.d<? super hs2.e.a> dVar);

    @uy2.o(description = "Passcode set", providerClass = o.class)
    @uy2.p(description = "Wallet blocked", providerClass = a.class)
    @uy2.q(description = "Wallet locked", providerClass = k.class)
    @uy2.j(keys = {"passcode"})
    @uy2.r(description = "No passcode", providerClass = n.class)
    s0<e> c1();

    @g0
    boolean f();

    @uy2.j(keys = {"card_selection_items"})
    @uy2.r(providerClass = b.class)
    s0<ns2.a<ms2.e>> g4();

    @f0("{device name}")
    String getDeviceName();

    @uy2.b0(1)
    long getDeviceUnitId();

    @uy2.k
    @p0(keys = {"loading"})
    void h();

    @uy2.r(providerClass = h.class)
    br2.f h4();

    @uy2.s0(providerClass = j.class)
    @uy2.j(keys = {"loading"})
    @v
    s0<Boolean> isLoading();

    @uy2.k
    void l();

    @g0
    boolean l1();

    @uy2.k(description = "No refund failed cards")
    @o0(description = "Has refund failed card", providerClass = C2285d.class)
    Object m(t13.d<? super Unit> dVar);

    @uy2.f(providerClass = c.class)
    s0<wr2.f> n();

    @uy2.o(providerClass = g.class)
    @uy2.j(keys = {"device_connectivity"})
    s0<br2.d> p4();

    @f0("https://static.garmincdn.com/en/products/010-02158-13/v/cf-lg-a836df96-628f-4aa8-8bc0-3d6ecaf0e1f4.jpg")
    /* JADX INFO: renamed from: r */
    String getDeviceImageUrl();

    @uy2.o(description = "Have cards", providerClass = f.class)
    @uy2.j(keys = {"cards"})
    @uy2.r(description = "No card", providerClass = m.class)
    s0<mr2.b> r4();

    @uy2.j(keys = {"rapid_pass"})
    @uy2.r(description = "none", providerClass = i.class)
    s0<Optional<hs2.c>> y2();
}
