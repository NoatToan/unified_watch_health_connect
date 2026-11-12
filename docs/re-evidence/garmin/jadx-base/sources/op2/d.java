package op2;

import com.garmin.feature.garminpay.providers.gpay.model.Links;
import com.garmin.feature.garminpay.providers.gpay.model.Product;
import com.garmin.feature.garminpay.providers.gpay.snowball.CurrencyValue;
import com.nimbusds.jose.jwk.JWKParameterNames;
import fo2.l0;
import fo2.y;
import java.util.Currency;
import java.util.List;
import java.util.Locale;
import org.joda.time.DateTime;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p13.j0;
import p13.x;
import uy2.r;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\bf\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0003\u0014\u0015\u0016J\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u0002H§@¢\u0006\u0004\b\u0003\u0010\u0004J\u0016\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H§@¢\u0006\u0004\b\u0007\u0010\u0004R\u001c\u0010\r\u001a\u00020\b8'@'X¦\u000e¢\u0006\f\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001e\u0010\u0013\u001a\u0004\u0018\u00010\u000e8'@&X¦\u000e¢\u0006\f\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012¨\u0006\u0017À\u0006\u0003"}, d2 = {"Lop2/d;", "Lry2/a;", "Lsd2/f;", "m0", "(Lt13/d;)Ljava/lang/Object;", "", "Lfo2/l0;", JWKParameterNames.ELLIPTIC_CURVE_Y_COORDINATE, "", "getDeviceUnitId", "()J", "T0", "(J)V", "deviceUnitId", "Lcom/garmin/feature/garminpay/providers/gpay/model/Product;", "v1", "()Lcom/garmin/feature/garminpay/providers/gpay/model/Product;", "h1", "(Lcom/garmin/feature/garminpay/providers/gpay/model/Product;)V", "product", "a", "c", "b", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public interface d extends ry2.a<d> {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lop2/d$a;", "Lxy2/o;", "Lsd2/f;", "<init>", "()V", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a implements xy2.o<sd2.f> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ uy2.d f133184a;

        public a() {
            uy2.e eVar = uy2.e.f173458a;
            sd2.j jVar = new sd2.j();
            jVar.f158685b1 = "Garmin Forerunner 620";
            jVar.O0 = "Garmin Forerunner 620";
            jVar.f158688d = System.currentTimeMillis();
            jVar.f158683a1 = "Garmin Forerunner 620";
            jVar.Z0 = "123";
            jVar.Y0 = "006-B1929-00";
            jVar.L0 = "http://static.garmincdn.com/com.garmin.connect/content/images/device-images/forerunner-620.png";
            jVar.X0 = 1;
            jVar.f158707m = true;
            Unit unit = Unit.INSTANCE;
            eVar.getClass();
            this.f133184a = new uy2.d(jVar);
        }

        @Override // xy2.o
        /* JADX INFO: renamed from: getValue */
        public final sd2.f getF173457a() {
            return (sd2.f) this.f133184a.f173457a;
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lop2/d$b;", "Lxy2/o;", "", "Lfo2/l0;", "<init>", "()V", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class b implements xy2.o<List<? extends l0>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ uy2.d f133185a;

        public b() {
            uy2.e eVar = uy2.e.f173458a;
            j0 j0Var = j0.f134944a;
            eVar.getClass();
            this.f133185a = new uy2.d(j0Var);
        }

        @Override // xy2.o
        /* JADX INFO: renamed from: getValue */
        public final List<? extends l0> getF173457a() {
            return (List) this.f133185a.f173457a;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lop2/d$c;", "Lxy2/o;", "Lcom/garmin/feature/garminpay/providers/gpay/model/Product;", "<init>", "()V", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class c implements xy2.o<Product> {
        @Override // xy2.o
        /* JADX INFO: renamed from: getValue */
        public final Product getF173457a() {
            Links links = new Links(new o13.p("self", new fo2.p("https://api.qa.fitpay.ninja/products?limit=10&offset=0", false)));
            y yVar = y.TRANSIT;
            Currency currency = Currency.getInstance(Locale.CHINA);
            DateTime dateTimeNow = DateTime.now();
            long millis = DateTime.now().getMillis();
            ko2.a.C2036a c2036a = ko2.a.f105769b;
            fo2.i iVar = new fo2.i(new CurrencyValue(25L, c2036a), new CurrencyValue(19L, c2036a));
            return new Product(links, "8518e6f5-4d86-4b16-aabd-73eb95b13ad3", yVar, "All Maintenance Product", "110c25cc-1d09-465b-86f1-73e7ab9a99f9", "99x Simulated Provider", "99xGarminPayTransit", currency, x.k(new fo2.i(new CurrencyValue(25L, c2036a), new CurrencyValue(21L, c2036a)), new fo2.i(new CurrencyValue(50L, c2036a), new CurrencyValue(40L, c2036a))), iVar, 100.0d, 1, 30, null, dateTimeNow, Long.valueOf(millis), new fo2.d(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null), j0.f134944a);
        }
    }

    @uy2.k
    void T0(long j8);

    @uy2.y(1)
    long getDeviceUnitId();

    void h1(Product product);

    @uy2.j0(description = "Db exception", exceptionClass = Exception.class)
    @r(description = "Happy path", providerClass = a.class)
    Object m0(t13.d<? super sd2.f> dVar);

    @r(description = "Happy path", providerClass = c.class)
    /* JADX INFO: renamed from: v1 */
    Product getProduct();

    @r(providerClass = b.class)
    Object y(t13.d<? super List<l0>> dVar);
}
