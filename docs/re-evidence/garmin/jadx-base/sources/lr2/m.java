package lr2;

import com.garmin.garminpay.wallet.exception.ExpressCardSettingException;
import com.nimbusds.jose.jwk.JWKParameterNames;
import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import uy2.b0;
import uy2.f0;
import uy2.k0;
import uy2.l0;
import uy2.o0;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\bf\u0018\u0000 \u00172\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0006\u0018\u0019\u001a\u001b\u001c\u001dJ\u001a\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H§@¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00078'X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0014\u0010\u000e\u001a\u00020\u000b8'X¦\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u001a\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00020\u000f8'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0016\u001a\u0004\u0018\u00010\u00138'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u001eÀ\u0006\u0003"}, d2 = {"Llr2/m;", "Lry2/a;", "Lvr2/q;", "newRapidPass", "", "p0", "(Lvr2/q;Lt13/d;)Ljava/lang/Object;", "", "getDeviceUnitId", "()J", "deviceUnitId", "", "getDeviceName", "()Ljava/lang/String;", "deviceName", "", "r2", "()Ljava/util/List;", "cardList", "Lhs2/c;", "o3", "()Lhs2/c;", "currentRapidPass", "f0", "c", "b", "d", "f", "a", JWKParameterNames.RSA_EXPONENT, "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public interface m extends ry2.a<m> {

    /* JADX INFO: renamed from: f0, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = Companion.f114410a;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Llr2/m$a;", "Lxy2/o;", "Lcom/garmin/garminpay/wallet/exception/ExpressCardSettingException;", "<init>", "()V", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a implements xy2.o<ExpressCardSettingException> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ uy2.d f114408a;

        public a() {
            uy2.e eVar = uy2.e.f173458a;
            ExpressCardSettingException expressCardSettingException = new ExpressCardSettingException(ExpressCardSettingException.a.DEVICE_IS_BUSY, "message");
            eVar.getClass();
            this.f114408a = new uy2.d(expressCardSettingException);
        }

        @Override // xy2.o
        /* JADX INFO: renamed from: getValue */
        public final ExpressCardSettingException getF173457a() {
            return (ExpressCardSettingException) this.f114408a.f173457a;
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Llr2/m$b;", "Lxy2/o;", "", "Lvr2/q;", "<init>", "()V", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class b implements xy2.o<List<? extends vr2.q>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ uy2.d f114409a;

        public b() {
            uy2.e eVar = uy2.e.f173458a;
            m.INSTANCE.getClass();
            List listC = p13.w.c(Companion.f114412c);
            eVar.getClass();
            this.f114409a = new uy2.d(listC);
        }

        @Override // xy2.o
        /* JADX INFO: renamed from: getValue */
        public final List<? extends vr2.q> getF173457a() {
            return (List) this.f114409a.f173457a;
        }
    }

    /* JADX INFO: renamed from: lr2.m$c, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Llr2/m$c;", "", "<init>", "()V", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ Companion f114410a = new Companion();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final fs2.a f114411b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final vr2.q f114412c;

        static {
            fs2.a aVar = new fs2.a();
            aVar.f73429d = "Beijing T-Union Transit Card";
            aVar.f73426a = kg.f.c();
            aVar.f73427b = is2.b.FITPAY;
            aVar.f73428c = qs2.a.f147388q;
            aVar.f73433h = qs2.f.ACTIVE;
            f114411b = aVar;
            f114412c = new vr2.q(aVar.f73429d, "https://api.qa.fitpay.ninja/assets?assetId=9f67e551a88ecdd165b49871f543a0575a6a25e3&adapterId=1131178c-aab5-438b-ab9d-a6572cb64c8c&adapterData=eyJ1cmwiOiJodHRwczovL2ZwY3RybC1xYS13ZWJyZXNvdXJjZXMtdXMtZWFzdC0xLnMzLmFtYXpvbmF3cy5jb20vcmVzb3VyY2VzL3NhbXBsZS10cmFuc2l0LWFzc2V0cy90X3VuaW9uX2NhcmQucG5nIn0", null, null, aVar);
        }

        private Companion() {
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Llr2/m$d;", "Lxy2/o;", "Lhs2/c;", "<init>", "()V", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class d implements xy2.o<hs2.c> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ uy2.d f114413a;

        public d() {
            uy2.e eVar = uy2.e.f173458a;
            mr2.d.Companion eVar2 = mr2.d.INSTANCE;
            m.INSTANCE.getClass();
            fs2.a aVar = Companion.f114411b;
            eVar2.getClass();
            hs2.c cVarA = mr2.d.Companion.a(aVar);
            eVar.getClass();
            this.f114413a = new uy2.d(cVarA);
        }

        @Override // xy2.o
        /* JADX INFO: renamed from: getValue */
        public final hs2.c getF173457a() {
            return (hs2.c) this.f114413a.f173457a;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Llr2/m$e;", "Lxy2/o;", "Lcom/garmin/garminpay/wallet/exception/ExpressCardSettingException;", "<init>", "()V", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class e implements xy2.o<ExpressCardSettingException> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ uy2.d f114414a;

        public e() {
            uy2.e eVar = uy2.e.f173458a;
            ExpressCardSettingException expressCardSettingException = new ExpressCardSettingException(ExpressCardSettingException.a.GENERAL_ERROR, "message");
            eVar.getClass();
            this.f114414a = new uy2.d(expressCardSettingException);
        }

        @Override // xy2.o
        /* JADX INFO: renamed from: getValue */
        public final ExpressCardSettingException getF173457a() {
            return (ExpressCardSettingException) this.f114414a.f173457a;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Llr2/m$f;", "Lxy2/o;", "Lcom/garmin/garminpay/wallet/exception/ExpressCardSettingException;", "<init>", "()V", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class f implements xy2.o<ExpressCardSettingException> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ uy2.d f114415a;

        public f() {
            uy2.e eVar = uy2.e.f173458a;
            ExpressCardSettingException expressCardSettingException = new ExpressCardSettingException(ExpressCardSettingException.a.DEVICE_NOT_CONNECTED, "message");
            eVar.getClass();
            this.f114415a = new uy2.d(expressCardSettingException);
        }

        @Override // xy2.o
        /* JADX INFO: renamed from: getValue */
        public final ExpressCardSettingException getF173457a() {
            return (ExpressCardSettingException) this.f114415a.f173457a;
        }
    }

    @f0("{device name}")
    String getDeviceName();

    @b0(1)
    long getDeviceUnitId();

    @uy2.r(providerClass = d.class)
    /* JADX INFO: renamed from: o3 */
    hs2.c getCurrentRapidPass();

    @o0(description = "Device not connected", providerClass = f.class)
    @uy2.k(description = "Happy path")
    @k0(description = "Device is busy", providerClass = a.class)
    @l0(description = "General error", providerClass = e.class)
    Object p0(vr2.q qVar, t13.d<? super Unit> dVar);

    @uy2.r(providerClass = b.class)
    List<vr2.q> r2();
}
