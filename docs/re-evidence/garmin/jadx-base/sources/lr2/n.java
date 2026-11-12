package lr2;

import com.garmin.garminpay.wallet.exception.ExpressCardSettingException;
import com.nimbusds.jose.jwk.JWKParameterNames;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import uy2.b0;
import uy2.f0;
import uy2.k0;
import uy2.l0;
import uy2.o0;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\bf\u0018\u0000 \u00172\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0006\u0018\u0019\u001a\u001b\u001c\u001dJ\u0018\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00078'X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0014\u0010\u000e\u001a\u00020\u000b8'X¦\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u0014\u0010\u0012\u001a\u00020\u000f8'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0016\u001a\u0004\u0018\u00010\u00138'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u001eÀ\u0006\u0003"}, d2 = {"Llr2/n;", "Lry2/a;", "", "balanceThreshold", "", "L1", "(FLt13/d;)Ljava/lang/Object;", "", "getDeviceUnitId", "()J", "deviceUnitId", "", "getDeviceName", "()Ljava/lang/String;", "deviceName", "Lhs2/c;", "o", "()Lhs2/c;", "expressCard", "Lvr2/q;", "U3", "()Lvr2/q;", "currentUserWalletCardItem", "g0", "b", JWKParameterNames.RSA_EXPONENT, "a", "d", "c", "f", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public interface n extends ry2.a<n> {

    /* JADX INFO: renamed from: g0, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = Companion.f114418a;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Llr2/n$a;", "Lxy2/o;", "Lvr2/q;", "<init>", "()V", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a implements xy2.o<vr2.q> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ uy2.d f114417a;

        public a() {
            uy2.e eVar = uy2.e.f173458a;
            n.INSTANCE.getClass();
            vr2.q qVar = Companion.f114420c;
            eVar.getClass();
            this.f114417a = new uy2.d(qVar);
        }

        @Override // xy2.o
        /* JADX INFO: renamed from: getValue */
        public final vr2.q getF173457a() {
            return (vr2.q) this.f114417a.f173457a;
        }
    }

    /* JADX INFO: renamed from: lr2.n$b, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Llr2/n$b;", "", "<init>", "()V", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ Companion f114418a = new Companion();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final fs2.a f114419b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final vr2.q f114420c;

        static {
            fs2.a aVar = new fs2.a();
            aVar.f73429d = "Beijing T-Union Transit Card";
            aVar.f73426a = kg.f.c();
            aVar.f73427b = is2.b.FITPAY;
            aVar.f73428c = qs2.a.f147388q;
            aVar.f73433h = qs2.f.ACTIVE;
            f114419b = aVar;
            f114420c = new vr2.q(aVar.f73429d, "https://api.qa.fitpay.ninja/assets?assetId=9f67e551a88ecdd165b49871f543a0575a6a25e3&adapterId=1131178c-aab5-438b-ab9d-a6572cb64c8c&adapterData=eyJ1cmwiOiJodHRwczovL2ZwY3RybC1xYS13ZWJyZXNvdXJjZXMtdXMtZWFzdC0xLnMzLmFtYXpvbmF3cy5jb20vcmVzb3VyY2VzL3NhbXBsZS10cmFuc2l0LWFzc2V0cy90X3VuaW9uX2NhcmQucG5nIn0", null, null, aVar);
        }

        private Companion() {
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Llr2/n$c;", "Lxy2/o;", "Lcom/garmin/garminpay/wallet/exception/ExpressCardSettingException;", "<init>", "()V", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class c implements xy2.o<ExpressCardSettingException> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ uy2.d f114421a;

        public c() {
            uy2.e eVar = uy2.e.f173458a;
            ExpressCardSettingException expressCardSettingException = new ExpressCardSettingException(ExpressCardSettingException.a.DEVICE_IS_BUSY, "message");
            eVar.getClass();
            this.f114421a = new uy2.d(expressCardSettingException);
        }

        @Override // xy2.o
        /* JADX INFO: renamed from: getValue */
        public final ExpressCardSettingException getF173457a() {
            return (ExpressCardSettingException) this.f114421a.f173457a;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Llr2/n$d;", "Lxy2/o;", "Lcom/garmin/garminpay/wallet/exception/ExpressCardSettingException;", "<init>", "()V", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class d implements xy2.o<ExpressCardSettingException> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ uy2.d f114422a;

        public d() {
            uy2.e eVar = uy2.e.f173458a;
            ExpressCardSettingException expressCardSettingException = new ExpressCardSettingException(ExpressCardSettingException.a.DEVICE_NOT_CONNECTED, "message");
            eVar.getClass();
            this.f114422a = new uy2.d(expressCardSettingException);
        }

        @Override // xy2.o
        /* JADX INFO: renamed from: getValue */
        public final ExpressCardSettingException getF173457a() {
            return (ExpressCardSettingException) this.f114422a.f173457a;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Llr2/n$e;", "Lxy2/o;", "Lhs2/c;", "<init>", "()V", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class e implements xy2.o<hs2.c> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ uy2.d f114423a;

        public e() {
            uy2.e eVar = uy2.e.f173458a;
            mr2.d.Companion companion = mr2.d.INSTANCE;
            n.INSTANCE.getClass();
            fs2.a aVar = Companion.f114419b;
            companion.getClass();
            hs2.c cVarA = mr2.d.Companion.a(aVar);
            eVar.getClass();
            this.f114423a = new uy2.d(cVarA);
        }

        @Override // xy2.o
        /* JADX INFO: renamed from: getValue */
        public final hs2.c getF173457a() {
            return (hs2.c) this.f114423a.f173457a;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Llr2/n$f;", "Lxy2/o;", "Lcom/garmin/garminpay/wallet/exception/ExpressCardSettingException;", "<init>", "()V", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class f implements xy2.o<ExpressCardSettingException> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ uy2.d f114424a;

        public f() {
            uy2.e eVar = uy2.e.f173458a;
            ExpressCardSettingException expressCardSettingException = new ExpressCardSettingException(ExpressCardSettingException.a.GENERAL_ERROR, "message");
            eVar.getClass();
            this.f114424a = new uy2.d(expressCardSettingException);
        }

        @Override // xy2.o
        /* JADX INFO: renamed from: getValue */
        public final ExpressCardSettingException getF173457a() {
            return (ExpressCardSettingException) this.f114424a.f173457a;
        }
    }

    @o0(description = "Device not connected", providerClass = d.class)
    @uy2.k(description = "Happy path")
    @k0(description = "Device is busy", providerClass = c.class)
    @l0(description = "General error", providerClass = f.class)
    Object L1(float f14, t13.d<? super Unit> dVar);

    @uy2.r(providerClass = a.class)
    vr2.q U3();

    @f0("{device name}")
    String getDeviceName();

    @b0(1)
    long getDeviceUnitId();

    @uy2.r(providerClass = e.class)
    hs2.c o();
}
