package po2;

import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.garmin.android.gncs.NotificationConstants;
import com.garmin.feature.garminpay.providers.felica.exception.DeviceNotConnectedException;
import com.garmin.feature.garminpay.providers.gpay.model.Links;
import com.garmin.feature.garminpay.providers.gpay.snowball.CurrencyValue;
import com.garmin.feature.garminpay.providers.gpay.snowball.exception.AppletExpiredException;
import com.garmin.feature.garminpay.providers.gpay.snowball.exception.CardBalanceExceededException;
import com.garmin.feature.garminpay.providers.gpay.snowball.exception.CardInProcessingException;
import com.garmin.feature.garminpay.providers.gpay.snowball.exception.CardRetryFailedException;
import com.garmin.feature.garminpay.providers.gpay.snowball.exception.InTransitException;
import com.garmin.feature.garminpay.providers.gpay.snowball.exception.InvalidAppletException;
import com.garmin.feature.garminpay.providers.gpay.snowball.exception.MaintenanceException;
import com.garmin.feature.garminpay.providers.gpay.snowball.exception.NotAbleToDeleteCardException;
import com.garmin.feature.garminpay.providers.gpay.snowball.exception.ProviderErrorCodeException;
import com.garmin.feature.garminpay.providers.unionpay.exception.DeviceException;
import com.garmin.feature.garminpay.providers.unionpay.exception.NetworkException;
import com.nimbusds.jose.jwk.JWKParameterNames;
import java.util.List;
import org.joda.time.DateTime;
import org.joda.time.LocalDate;
import org.joda.time.LocalTime;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import uy2.c1;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0015\bf\u0018\u0000 62\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0013789\u001b:;<=>?@AB6C'DEFJ\u0010\u0010\u0005\u001a\u00020\u0004H§@¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0004H§@¢\u0006\u0004\b\u0007\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0004H§@¢\u0006\u0004\b\b\u0010\u0006J\u0010\u0010\n\u001a\u00020\tH§@¢\u0006\u0004\b\n\u0010\u0006J\u0010\u0010\f\u001a\u00020\u000bH§@¢\u0006\u0004\b\f\u0010\u0006J\u0018\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\rH§@¢\u0006\u0004\b\u000f\u0010\u0006J\u0010\u0010\u0010\u001a\u00020\u000eH§@¢\u0006\u0004\b\u0010\u0010\u0006J\u0010\u0010\u0011\u001a\u00020\u0004H§@¢\u0006\u0004\b\u0011\u0010\u0006J\u0010\u0010\u0012\u001a\u00020\u0004H§@¢\u0006\u0004\b\u0012\u0010\u0006J\u0018\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u000eH§@¢\u0006\u0004\b\u0014\u0010\u0015J\u0016\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u0016H§@¢\u0006\u0004\b\u0018\u0010\u0006J\u0018\u0010\u001b\u001a\u00020\u00042\u0006\u0010\u001a\u001a\u00020\u0019H§@¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0004H§@¢\u0006\u0004\b\u001d\u0010\u0006J\u0010\u0010\u001e\u001a\u00020\u0004H§@¢\u0006\u0004\b\u001e\u0010\u0006J\u0010\u0010\u001f\u001a\u00020\u0004H§@¢\u0006\u0004\b\u001f\u0010\u0006J\u0018\u0010#\u001a\u00020\"2\u0006\u0010!\u001a\u00020 H§@¢\u0006\u0004\b#\u0010$J\u0010\u0010%\u001a\u00020\u0004H§@¢\u0006\u0004\b%\u0010\u0006J\u000f\u0010'\u001a\u00020&H'¢\u0006\u0004\b'\u0010(J\u0010\u0010)\u001a\u00020\u0004H§@¢\u0006\u0004\b)\u0010\u0006J\u0016\u0010*\u001a\b\u0012\u0004\u0012\u00020\"0\u0016H§@¢\u0006\u0004\b*\u0010\u0006J\u000f\u0010+\u001a\u00020\u0004H'¢\u0006\u0004\b+\u0010,R\u001a\u00101\u001a\b\u0012\u0004\u0012\u00020.0-8'X¦\u0004¢\u0006\u0006\u001a\u0004\b/\u00100R\u0014\u00105\u001a\u0002028'X¦\u0004¢\u0006\u0006\u001a\u0004\b3\u00104¨\u0006GÀ\u0006\u0003"}, d2 = {"Lpo2/m;", "Lsy2/c;", "Lpo2/n;", "", "", "C0", "(Lt13/d;)Ljava/lang/Object;", "l0", "h0", "Lpo2/t;", "u0", "Lpo2/g0;", "I", "Las2/b;", "Lcom/garmin/feature/garminpay/providers/gpay/snowball/CurrencyValue;", "F", "R", "J", JWKParameterNames.RSA_OTHER_PRIMES__FACTOR_CRT_COEFFICIENT, "expectedBalance", "G", "(Lcom/garmin/feature/garminpay/providers/gpay/snowball/CurrencyValue;Lt13/d;)Ljava/lang/Object;", "", "Lfo2/i;", "A", "Lfo2/q;", "action", "m", "(Lfo2/q;Lt13/d;)Ljava/lang/Object;", "m0", "X", "e0", "Lfo2/b0;", "purchaseRequest", "Lfo2/a0;", "L", "(Lfo2/b0;Lt13/d;)Ljava/lang/Object;", "O", "", "h", "()I", "T", "D0", "Y", "()V", "Lo53/i0;", "", "w0", "()Lo53/i0;", "cardChargingAsync", "Lsd2/f;", "getDevice", "()Lsd2/f;", "device", "a", JWKParameterNames.RSA_OTHER_PRIMES__PRIME_FACTOR, "g", "l", JWKParameterNames.RSA_MODULUS, "o", "p", "b", IntegerTokenConverter.CONVERTER_KEY, "c", JWKParameterNames.OCT_KEY_VALUE, JWKParameterNames.RSA_SECOND_PRIME_FACTOR, "f", "d", "j", "s", JWKParameterNames.RSA_EXPONENT, "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public interface m extends sy2.c<po2.n> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = Companion.f139278a;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lpo2/m$a;", "Lxy2/o;", "", "<init>", "()V", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a implements xy2.o<Throwable> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ uy2.d f139274a;

        public a() {
            uy2.e eVar = uy2.e.f173458a;
            CardBalanceExceededException cardBalanceExceededException = new CardBalanceExceededException(20.0d, "");
            eVar.getClass();
            this.f139274a = new uy2.d(cardBalanceExceededException);
        }

        @Override // xy2.o
        /* JADX INFO: renamed from: getValue */
        public final Throwable getF173457a() {
            return (Throwable) this.f139274a.f173457a;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lpo2/m$b;", "Lxy2/o;", "Lpo2/t;", "<init>", "()V", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class b implements xy2.o<t> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ uy2.d f139275a;

        public b() {
            uy2.e eVar = uy2.e.f173458a;
            LocalDate localDatePlusYears = LocalDate.now().plusYears(2);
            localDatePlusYears.getClass();
            t tVar = new t("Beijing T-Union Transit Card", "https://api.qa.fitpay.ninja/assets?assetId=9f67e551a88ecdd165b49871f543a0575a6a25e3&adapterId=1131178c-aab5-438b-ab9d-a6572cb64c8c&adapterData=eyJ1cmwiOiJodHRwczovL2ZwY3RybC1xYS13ZWJyZXNvdXJjZXMtdXMtZWFzdC0xLnMzLmFtYXpvbmF3cy5jb20vcmVzb3VyY2VzL3NhbXBsZS10cmFuc2l0LWFzc2V0cy90X3VuaW9uX2NhcmQucG5nIn0", "6666666666666666666", "https://www.garmin.com.tw/mobile/", "123456789", localDatePlusYears);
            eVar.getClass();
            this.f139275a = new uy2.d(tVar);
        }

        @Override // xy2.o
        /* JADX INFO: renamed from: getValue */
        public final t getF173457a() {
            return (t) this.f139275a.f173457a;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lpo2/m$c;", "Lxy2/o;", "Lpo2/g0;", "<init>", "()V", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class c implements xy2.o<g0> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ uy2.d f139276a;

        public c() {
            uy2.e eVar = uy2.e.f173458a;
            g0 g0Var = new g0((List<h0>) p13.x.k(new h0(i0.TOP_UP, 10.0d, new LocalDate(2021, 12, 10), new LocalTime(12, 30)), new h0(i0.PAY, 4.99d, new LocalDate(2021, 12, 15), new LocalTime(18, 43))));
            eVar.getClass();
            this.f139276a = new uy2.d(g0Var);
        }

        @Override // xy2.o
        /* JADX INFO: renamed from: getValue */
        public final g0 getF173457a() {
            return (g0) this.f139276a.f173457a;
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lpo2/m$d;", "Lxy2/o;", "", "Lfo2/i;", "<init>", "()V", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class d implements xy2.o<List<? extends fo2.i>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ uy2.d f139277a;

        public d() {
            uy2.e eVar = uy2.e.f173458a;
            CurrencyValue.a aVar = CurrencyValue.f51217c;
            ko2.a.b bVar = ko2.a.f105768a;
            aVar.getClass();
            List listK = p13.x.k(new fo2.i(CurrencyValue.a.a(10L, bVar), new CurrencyValue(10L, bVar)), new fo2.i(new CurrencyValue(20L, bVar), new CurrencyValue(20L, bVar)), new fo2.i(new CurrencyValue(50L, bVar), new CurrencyValue(50L, bVar)), new fo2.i(new CurrencyValue(100L, bVar), new CurrencyValue(100L, bVar)), new fo2.i(new CurrencyValue(200L, bVar), new CurrencyValue(200L, bVar)));
            eVar.getClass();
            this.f139277a = new uy2.d(listK);
        }

        @Override // xy2.o
        /* JADX INFO: renamed from: getValue */
        public final List<? extends fo2.i> getF173457a() {
            return (List) this.f139277a.f173457a;
        }
    }

    /* JADX INFO: renamed from: po2.m$e, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lpo2/m$e;", "", "<init>", "()V", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ Companion f139278a = new Companion();

        private Companion() {
        }

        public static fo2.a0 a(String str, String str2, CurrencyValue currencyValue, DateTime dateTime, String str3) {
            return new fo2.a0(new Links(new o13.p[0]), "purchaseId", null, str, "Active", fo2.x.ALIPAY, "userId", "deviceId", "producrId", "providerId", currencyValue, currencyValue, dateTime.getMillis(), dateTime, dateTime.getMillis(), dateTime, null, "credentialId", str3, str2);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lpo2/m$f;", "Lxy2/o;", "Lcom/garmin/feature/garminpay/providers/gpay/snowball/CurrencyValue;", "<init>", "()V", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class f implements xy2.o<CurrencyValue> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ uy2.d f139279a;

        public f() {
            uy2.e eVar = uy2.e.f173458a;
            CurrencyValue.a aVar = CurrencyValue.f51217c;
            ko2.a.b bVar = ko2.a.f105768a;
            aVar.getClass();
            CurrencyValue currencyValueA = CurrencyValue.a.a(100L, bVar);
            eVar.getClass();
            this.f139279a = new uy2.d(currencyValueA);
        }

        @Override // xy2.o
        /* JADX INFO: renamed from: getValue */
        public final CurrencyValue getF173457a() {
            return (CurrencyValue) this.f139279a.f173457a;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lpo2/m$g;", "Lxy2/o;", "Lsd2/f;", "<init>", "()V", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class g implements xy2.o<sd2.f> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ uy2.d f139280a;

        public g() {
            uy2.e eVar = uy2.e.f173458a;
            sd2.j jVar = new sd2.j();
            jVar.f158685b1 = "{DEVICE NAME}";
            jVar.L0 = "https://static.garmincdn.com/en/products/010-02174-01/v/cf-lg-a7a42f50-df93-4f76-b5a0-55dfa6f849ca.jpg";
            Unit unit = Unit.INSTANCE;
            eVar.getClass();
            this.f139280a = new uy2.d(jVar);
        }

        @Override // xy2.o
        /* JADX INFO: renamed from: getValue */
        public final sd2.f getF173457a() {
            return (sd2.f) this.f139280a.f173457a;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lpo2/m$h;", "Lxy2/o;", "Lfo2/a0;", "<init>", "()V", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class h implements xy2.o<fo2.a0> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ uy2.d f139281a;

        public h() {
            uy2.e eVar = uy2.e.f173458a;
            Links links = new Links(new o13.p[0]);
            fo2.x xVar = fo2.x.ALIPAY;
            CurrencyValue.a aVar = CurrencyValue.f51217c;
            ko2.a.b bVar = ko2.a.f105768a;
            aVar.getClass();
            CurrencyValue currencyValueA = CurrencyValue.a.a(10L, bVar);
            CurrencyValue currencyValue = new CurrencyValue(10L, bVar);
            DateTime dateTimeNow = DateTime.now();
            dateTimeNow.getClass();
            DateTime dateTimeNow2 = DateTime.now();
            dateTimeNow2.getClass();
            fo2.a0 a0Var = new fo2.a0(links, "purchaseId", "transitCardId", NotificationConstants.KEY_DATA_MIME_TYPE, "PENDING_PAYMENT", xVar, "userId", "deviceId", "productId", "providerId", currencyValueA, currencyValue, 0L, dateTimeNow, 0L, dateTimeNow2, new fo2.c("applicationId", new fo2.c.b("snbOrderNo", "signedData")), "credentialId", "extOrderNumber", "extOrderStatus");
            eVar.getClass();
            this.f139281a = new uy2.d(a0Var);
        }

        @Override // xy2.o
        /* JADX INFO: renamed from: getValue */
        public final fo2.a0 getF173457a() {
            return (fo2.a0) this.f139281a.f173457a;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lpo2/m$i;", "Lxy2/o;", "Lpo2/g0;", "<init>", "()V", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class i implements xy2.o<g0> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ uy2.d f139282a;

        public i() {
            uy2.e eVar = uy2.e.f173458a;
            g0 g0Var = new g0(p13.j0.f134944a);
            eVar.getClass();
            this.f139282a = new uy2.d(g0Var);
        }

        @Override // xy2.o
        /* JADX INFO: renamed from: getValue */
        public final g0 getF173457a() {
            return (g0) this.f139282a.f173457a;
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lpo2/m$j;", "Lxy2/o;", "", "Lfo2/a0;", "<init>", "()V", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class j implements xy2.o<List<? extends fo2.a0>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ uy2.d f139283a;

        public j() {
            uy2.e eVar = uy2.e.f173458a;
            p13.j0 j0Var = p13.j0.f134944a;
            eVar.getClass();
            this.f139283a = new uy2.d(j0Var);
        }

        @Override // xy2.o
        /* JADX INFO: renamed from: getValue */
        public final List<? extends fo2.a0> getF173457a() {
            return (List) this.f139283a.f173457a;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lpo2/m$k;", "Lxy2/o;", "Lpo2/g0;", "<init>", "()V", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class k implements xy2.o<g0> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ uy2.d f139284a;

        public k() {
            uy2.e eVar = uy2.e.f173458a;
            g0 g0Var = new g0(new Exception());
            eVar.getClass();
            this.f139284a = new uy2.d(g0Var);
        }

        @Override // xy2.o
        /* JADX INFO: renamed from: getValue */
        public final g0 getF173457a() {
            return (g0) this.f139284a.f173457a;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lpo2/m$l;", "Lxy2/o;", "", "<init>", "()V", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class l implements xy2.o<Throwable> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ uy2.d f139285a;

        public l() {
            uy2.e eVar = uy2.e.f173458a;
            InvalidAppletException invalidAppletException = new InvalidAppletException(InvalidAppletException.a.CARD_ERROR);
            eVar.getClass();
            this.f139285a = new uy2.d(invalidAppletException);
        }

        @Override // xy2.o
        /* JADX INFO: renamed from: getValue */
        public final Throwable getF173457a() {
            return (Throwable) this.f139285a.f173457a;
        }
    }

    /* JADX INFO: renamed from: po2.m$m, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lpo2/m$m;", "Lxy2/o;", "", "<init>", "()V", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class C2633m implements xy2.o<Throwable> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ uy2.d f139286a;

        public C2633m() {
            uy2.e eVar = uy2.e.f173458a;
            InvalidAppletException invalidAppletException = new InvalidAppletException(InvalidAppletException.a.BLACKLISTED);
            eVar.getClass();
            this.f139286a = new uy2.d(invalidAppletException);
        }

        @Override // xy2.o
        /* JADX INFO: renamed from: getValue */
        public final Throwable getF173457a() {
            return (Throwable) this.f139286a.f173457a;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lpo2/m$n;", "Lxy2/o;", "", "<init>", "()V", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class n implements xy2.o<Throwable> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ uy2.d f139287a;

        public n() {
            uy2.e eVar = uy2.e.f173458a;
            InvalidAppletException invalidAppletException = new InvalidAppletException(InvalidAppletException.a.UNEXPECTED_ISSUER);
            eVar.getClass();
            this.f139287a = new uy2.d(invalidAppletException);
        }

        @Override // xy2.o
        /* JADX INFO: renamed from: getValue */
        public final Throwable getF173457a() {
            return (Throwable) this.f139287a.f173457a;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lpo2/m$o;", "Lxy2/o;", "", "<init>", "()V", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class o implements xy2.o<Throwable> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ uy2.d f139288a;

        public o() {
            uy2.e eVar = uy2.e.f173458a;
            InvalidAppletException invalidAppletException = new InvalidAppletException(InvalidAppletException.a.INVALID_EXPIRATION);
            eVar.getClass();
            this.f139288a = new uy2.d(invalidAppletException);
        }

        @Override // xy2.o
        /* JADX INFO: renamed from: getValue */
        public final Throwable getF173457a() {
            return (Throwable) this.f139288a.f173457a;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lpo2/m$p;", "Lxy2/o;", "", "<init>", "()V", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class p implements xy2.o<Throwable> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ uy2.d f139289a;

        public p() {
            uy2.e eVar = uy2.e.f173458a;
            InvalidAppletException invalidAppletException = new InvalidAppletException(InvalidAppletException.a.INACTIVATED);
            eVar.getClass();
            this.f139289a = new uy2.d(invalidAppletException);
        }

        @Override // xy2.o
        /* JADX INFO: renamed from: getValue */
        public final Throwable getF173457a() {
            return (Throwable) this.f139289a.f173457a;
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00020\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lpo2/m$q;", "Lxy2/o;", "Las2/b;", "Lcom/garmin/feature/garminpay/providers/gpay/snowball/CurrencyValue;", "<init>", "()V", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class q implements xy2.o<as2.b<CurrencyValue>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ uy2.d f139290a;

        public q() {
            uy2.e eVar = uy2.e.f173458a;
            CurrencyValue.a aVar = CurrencyValue.f51217c;
            ko2.a.b bVar = ko2.a.f105768a;
            aVar.getClass();
            as2.b bVar2 = new as2.b(CurrencyValue.a.a(100L, bVar), System.currentTimeMillis());
            eVar.getClass();
            this.f139290a = new uy2.d(bVar2);
        }

        @Override // xy2.o
        /* JADX INFO: renamed from: getValue */
        public final as2.b<CurrencyValue> getF173457a() {
            return (as2.b) this.f139290a.f173457a;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lpo2/m$r;", "Lxy2/o;", "Lcom/garmin/feature/garminpay/providers/gpay/snowball/exception/ProviderErrorCodeException;", "<init>", "()V", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class r implements xy2.o<ProviderErrorCodeException> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ uy2.d f139291a;

        public r() {
            uy2.e eVar = uy2.e.f173458a;
            ProviderErrorCodeException providerErrorCodeException = new ProviderErrorCodeException("01-2345");
            eVar.getClass();
            this.f139291a = new uy2.d(providerErrorCodeException);
        }

        @Override // xy2.o
        /* JADX INFO: renamed from: getValue */
        public final ProviderErrorCodeException getF173457a() {
            return (ProviderErrorCodeException) this.f139291a.f173457a;
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lpo2/m$s;", "Lxy2/o;", "", "Lfo2/a0;", "<init>", "()V", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class s implements xy2.o<List<? extends fo2.a0>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ uy2.d f139292a;

        public s() {
            uy2.e eVar = uy2.e.f173458a;
            Companion companion = m.INSTANCE;
            CurrencyValue.a aVar = CurrencyValue.f51217c;
            ko2.a.C2036a c2036a = ko2.a.f105769b;
            aVar.getClass();
            CurrencyValue currencyValueA = CurrencyValue.a.a(350L, c2036a);
            DateTime dateTime = new DateTime(2022, 9, 18, 18, 0);
            companion.getClass();
            fo2.a0 a0VarA = Companion.a("TOPUP", "1007", currencyValueA, dateTime, "63029005022021110115192689330854");
            ko2.a.b bVar = ko2.a.f105768a;
            List listK = p13.x.k(a0VarA, Companion.a("TOPUP", "0000", CurrencyValue.a.a(20L, bVar), new DateTime(2022, 9, 18, 18, 0), "63029005022021110115192689330853"), Companion.a("TOPUP", "0000", new CurrencyValue(20L, bVar), new DateTime(2022, 9, 16, 18, 0), "63029005022021110115192689330852"), Companion.a("TOPUP", "0000", new CurrencyValue(50L, bVar), new DateTime(2022, 8, 10, 18, 0), "63029005022021110115192689330851"), Companion.a("TOPUP", "0000", new CurrencyValue(50L, bVar), new DateTime(2022, 7, 10, 18, 0), "63029005022021110115192689330850"), Companion.a("TOPUP", "0000", new CurrencyValue(50L, bVar), new DateTime(2022, 6, 10, 18, 0), "63029005022021110115192689330849"), Companion.a("TOPUP", "1002", new CurrencyValue(321L, c2036a), new DateTime(2022, 4, 30, 22, 37), "63029005022021110115192689330848"), Companion.a("ISSUE", "1000", new CurrencyValue(123L, c2036a), new DateTime(2022, 2, 28, 8, 37), "63029005022021110115192689330847"), Companion.a("ISSUE", "1001", new CurrencyValue(123L, c2036a), new DateTime(2022, 2, 28, 8, 37), "63029005022021110115192689330846"), Companion.a("ISSUE", "1003", new CurrencyValue(123L, c2036a), new DateTime(2022, 2, 28, 8, 37), "63029005022021110115192689330845"), Companion.a("ISSUE", "1004", new CurrencyValue(123L, c2036a), new DateTime(2022, 2, 28, 8, 37), "63029005022021110115192689330844"), Companion.a("ISSUE", "1005", new CurrencyValue(123L, c2036a), new DateTime(2022, 2, 28, 8, 37), "63029005022021110115192689330843"), Companion.a("ISSUE", "1006", new CurrencyValue(123L, c2036a), new DateTime(2022, 2, 28, 8, 37), "63029005022021110115192689330842"), Companion.a("ISSUE", "1007", new CurrencyValue(123L, c2036a), new DateTime(2022, 2, 28, 8, 37), "63029005022021110115192689330841"), Companion.a("ISSUE", "1008", new CurrencyValue(123L, c2036a), new DateTime(2022, 2, 28, 8, 37), "63029005022021110115192689330840"));
            eVar.getClass();
            this.f139292a = new uy2.d(listK);
        }

        @Override // xy2.o
        /* JADX INFO: renamed from: getValue */
        public final List<? extends fo2.a0> getF173457a() {
            return (List) this.f139292a.f173457a;
        }
    }

    @uy2.j0(description = "Network error", exceptionClass = NetworkException.class)
    @uy2.r(description = "Happy path", providerClass = d.class)
    Object A(t13.d<? super List<fo2.i>> dVar);

    @uy2.h0(description = "Credential.state = PENDING_CUSTOMER_SUPPORT or JobStatus.state = FAILED", exceptionClass = CardRetryFailedException.class)
    @uy2.i0(description = "Credential.state = DELETED or JobStatus.state = COMPLETED or PROCESSING", exceptionClass = CardInProcessingException.class)
    @uy2.j0(description = "Credential.state = PENDING_PERSO or PENDING_DELETE and JobStatus.state = PAUSED", exceptionClass = MaintenanceException.class)
    @uy2.k(description = "Active card")
    Object C0(t13.d<? super Unit> dVar);

    @uy2.o(description = "sample orders", providerClass = s.class)
    @uy2.r(description = "empty order", providerClass = j.class)
    Object D0(t13.d<? super List<fo2.a0>> dVar);

    @uy2.r(providerClass = q.class)
    Object F(t13.d<? super as2.b<CurrencyValue>> dVar);

    @uy2.o0(description = "Exceeds the maximum balance", providerClass = a.class)
    @uy2.h0(description = "Network error", exceptionClass = NetworkException.class)
    @uy2.j0(description = "Device error", exceptionClass = DeviceException.class)
    @uy2.k(description = "Happy path")
    Object G(CurrencyValue currencyValue, t13.d<? super Unit> dVar);

    @uy2.o(description = "1 topup and 1 purchase", providerClass = c.class)
    @uy2.p(description = "Failed to get transactions", providerClass = k.class)
    @uy2.r(description = "Empty transactions", providerClass = i.class)
    Object I(t13.d<? super g0> dVar);

    @uy2.j0(description = "Device is disconnected", exceptionClass = DeviceNotConnectedException.class)
    @uy2.k(description = "Device is connected")
    Object J(t13.d<? super Unit> dVar);

    @uy2.h0(description = "Recharge card failed", exceptionClass = Exception.class)
    @c1
    @uy2.j0(description = "In server maintenance time.", exceptionClass = MaintenanceException.class)
    @uy2.r(description = "Happy path", providerClass = h.class)
    Object L(fo2.b0 b0Var, t13.d<? super fo2.a0> dVar);

    @uy2.j0(description = "Restricted by server (within 30 days)", exceptionClass = NotAbleToDeleteCardException.class)
    @uy2.k(description = "Happy path")
    Object O(t13.d<? super Unit> dVar);

    @uy2.r(providerClass = f.class)
    Object R(t13.d<? super CurrencyValue> dVar);

    @uy2.j0(description = "Applet is expired", exceptionClass = AppletExpiredException.class)
    @uy2.k(description = "Applet is unexpired")
    Object T(t13.d<? super Unit> dVar);

    @c1
    @uy2.j0(description = "Shift out card failed", exceptionClass = Exception.class)
    @uy2.k(description = "Happy path")
    Object X(t13.d<? super Unit> dVar);

    @uy2.k
    void Y();

    @Override // sy2.c
    @uy2.k
    /* synthetic */ void a(po2.n nVar);

    /* synthetic */ Object b();

    @uy2.f0("Beijing T-Union Transit Card")
    /* synthetic */ String d();

    @c1
    @uy2.j0(description = "Remove card failed", exceptionClass = Exception.class)
    @uy2.k(description = "Happy path")
    Object e0(t13.d<? super Unit> dVar);

    @uy2.r(providerClass = g.class)
    sd2.f getDevice();

    @uy2.y(description = "Days before deletable", value = 30)
    int h();

    @uy2.k
    Object h0(t13.d<? super Unit> dVar);

    @uy2.f0("https://api.qa.fitpay.ninja/assets?assetId=9f67e551a88ecdd165b49871f543a0575a6a25e3&adapterId=1131178c-aab5-438b-ab9d-a6572cb64c8c&adapterData=eyJ1cmwiOiJodHRwczovL2ZwY3RybC1xYS13ZWJyZXNvdXJjZXMtdXMtZWFzdC0xLnMzLmFtYXpvbmF3cy5jb20vcmVzb3VyY2VzL3NhbXBsZS10cmFuc2l0LWFzc2V0cy90X3VuaW9uX2NhcmQucG5nIn0")
    /* synthetic */ String l();

    @uy2.n0(description = "Unactivated", providerClass = p.class)
    @uy2.o0(description = "Card Error", providerClass = l.class)
    @uy2.k(description = "Active applet")
    @uy2.k0(description = "Black Listed", providerClass = C2633m.class)
    @uy2.l0(description = "Unexpected Issuer", providerClass = n.class)
    @uy2.m0(description = "Invalid expiration", providerClass = o.class)
    Object l0(t13.d<? super Unit> dVar);

    @uy2.j0(description = "In server maintenance time.", exceptionClass = MaintenanceException.class)
    @uy2.k(description = "Out of server maintenance time.")
    Object m(fo2.q qVar, t13.d<? super Unit> dVar);

    @uy2.j0(description = "In station", exceptionClass = InTransitException.class)
    @uy2.k(description = "Out of station.")
    Object m0(t13.d<? super Unit> dVar);

    @uy2.o0(description = "Exceeds the maximum balance", providerClass = a.class)
    @uy2.h0(description = "Network error", exceptionClass = NetworkException.class)
    @uy2.j0(description = "Device error", exceptionClass = DeviceException.class)
    @uy2.k(description = "Happy path")
    Object t(t13.d<? super Unit> dVar);

    @uy2.r(description = "Happy path", providerClass = b.class)
    Object u0(t13.d<? super t> dVar);

    @uy2.o0(description = "Failed with error code", providerClass = r.class)
    @uy2.u(description = "Succeeded to topup", value = 10.0d)
    o53.i0<Double> w0();
}
