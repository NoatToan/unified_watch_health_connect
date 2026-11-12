package vn2;

import android.app.Activity;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.garmin.feature.garminpay.providers.felica.exception.HasBeenPunchedException;
import com.google.android.exoplayer2.metadata.icy.IcyHeaders;
import com.google.android.gms.common.Scopes;
import com.google.common.base.Optional;
import com.nimbusds.jose.jwk.JWKParameterNames;
import java.io.File;
import java.util.List;
import org.joda.time.DateTime;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0084\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\bf\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\u00020\u0003:\t89\u000e\u0011:;<=>J\u0015\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H'¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0004H'¢\u0006\u0004\b\t\u0010\u0007J+\u0010\u000e\u001a\u001e\u0012\u001a\u0012\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\f0\u000bj\b\u0012\u0004\u0012\u00020\f`\r0\n0\u0004H'¢\u0006\u0004\b\u000e\u0010\u0007J+\u0010\u000f\u001a\u001e\u0012\u001a\u0012\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\f0\u000bj\b\u0012\u0004\u0012\u00020\f`\r0\n0\u0004H'¢\u0006\u0004\b\u000f\u0010\u0007J\u000f\u0010\u0011\u001a\u00020\u0010H'¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H'¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u0013H'¢\u0006\u0004\b\u0016\u0010\u0015J+\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u0018\u001a\u00020\u00172\u0012\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u001b0\u0019H'¢\u0006\u0004\b\u001e\u0010\u001fJ#\u0010 \u001a\u00020\u001d2\u0012\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u001b0\u0019H'¢\u0006\u0004\b \u0010!J\u000f\u0010\"\u001a\u00020\u001dH'¢\u0006\u0004\b\"\u0010#J\u0015\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00100\u0004H'¢\u0006\u0004\b$\u0010\u0007J\u0015\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00170\u0004H'¢\u0006\u0004\b%\u0010\u0007J\u001d\u0010(\u001a\b\u0012\u0004\u0012\u00020'0\u00042\u0006\u0010&\u001a\u00020\u0010H'¢\u0006\u0004\b(\u0010)J#\u0010*\u001a\u00020\u001d2\u0012\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u001b0\u0019H'¢\u0006\u0004\b*\u0010!J\u000f\u0010+\u001a\u00020\u001dH'¢\u0006\u0004\b+\u0010#J-\u00100\u001a \u0012\u001c\u0012\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00020.0-\u0012\n\u0012\b\u0012\u0004\u0012\u00020/0\n0,0\u0004H&¢\u0006\u0004\b0\u0010\u0007J\u0015\u00102\u001a\b\u0012\u0004\u0012\u0002010\u0004H&¢\u0006\u0004\b2\u0010\u0007R\u0014\u00105\u001a\u00020\u001a8'X¦\u0004¢\u0006\u0006\u001a\u0004\b3\u00104R\u0014\u00107\u001a\u00020\u00138'X¦\u0004¢\u0006\u0006\u001a\u0004\b6\u0010\u0015¨\u0006?À\u0006\u0003"}, d2 = {"Lvn2/z0;", "Lsy2/c;", "Lvn2/a1;", "", "Lq03/r;", "Lpn2/e;", "t0", "()Lq03/r;", "Lvn2/z0$b;", JWKParameterNames.RSA_SECOND_PRIME_FACTOR, "Lcom/google/common/base/Optional;", "Las2/b;", "", "Lcom/garmin/feature/garminpay/util/transit/BalanceInfo;", "f", "j", "", "c", "()Z", "", "getDeviceName", "()Ljava/lang/String;", JWKParameterNames.RSA_OTHER_PRIMES__PRIME_FACTOR, "Lvn2/z0$e;", "cardRemovalState", "Lkotlin/Function1;", "", "", "longWaitingCallback", "Lq03/b;", "B", "(Lvn2/z0$e;Le23/l;)Lq03/b;", JWKParameterNames.ELLIPTIC_CURVE_Y_COORDINATE, "(Le23/l;)Lq03/b;", "v0", "()Lq03/b;", "E0", "p0", "force", "Ltn2/y0$c;", "D", "(Z)Lq03/r;", "k0", "W", "Lo13/p;", "", "Lvr2/q;", "Lhs2/c;", "P", "Ljava/io/File;", "o0", "getDeviceUnitId", "()J", "deviceUnitId", "V", "cid", "b", "g", "a", JWKParameterNames.RSA_EXPONENT, IntegerTokenConverter.CONVERTER_KEY, "h", "d", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public interface z0 extends sy2.c<a1> {

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u001e\u0012\u001a\u0012\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u00040\u0003j\b\u0012\u0004\u0012\u00020\u0004`\u00050\u00020\u0001B\u0007¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lvn2/z0$a;", "Lxy2/o;", "Lcom/google/common/base/Optional;", "Las2/b;", "", "Lcom/garmin/feature/garminpay/util/transit/BalanceInfo;", "<init>", "()V", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a implements xy2.o<Optional<as2.b<Integer>>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ uy2.d f178972a;

        public a() {
            uy2.e eVar = uy2.e.f173458a;
            Optional optionalOf = Optional.of(new as2.b(1000, DateTime.now().getMillis()));
            eVar.getClass();
            this.f178972a = new uy2.d(optionalOf);
        }

        @Override // xy2.o
        /* JADX INFO: renamed from: getValue */
        public final Optional<as2.b<Integer>> getF173457a() {
            return (Optional) this.f178972a.f173457a;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lvn2/z0$c;", "Lxy2/o;", "Lvn2/z0$b;", "<init>", "()V", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class c implements xy2.o<b> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ uy2.d f178977a;

        public c() {
            uy2.e eVar = uy2.e.f173458a;
            b bVar = new b(new rn2.i("CID012345678901234567890123456789012345678901234567890123456789", "AID", "serviceI", "spId0123", "cardType0123", "cardCate", new rn2.l("ACTIVE", new rn2.t("finish", false, false, false), "Enabled"), new rn2.a(new rn2.n("ThisIsCardArtImageId11111111112222222222333"), new rn2.u(new rn2.k("ThisIsDisplayName22233333333334444444444555555555566666666667777", "1111111111222222222233333333334444444444555555555566666666667777"))), null, new pn2.r(null, null, null, null, null)), (pn2.e) new f().f178981a.f173457a, null, new as2.b(1000, DateTime.now().getMillis()));
            eVar.getClass();
            this.f178977a = new uy2.d(bVar);
        }

        @Override // xy2.o
        /* JADX INFO: renamed from: getValue */
        public final b getF173457a() {
            return (b) this.f178977a.f173457a;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lvn2/z0$d;", "Lxy2/o;", "Ltn2/y0$c;", "<init>", "()V", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class d implements xy2.o<tn2.y0.c> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ uy2.d f178978a;

        public d() {
            uy2.e eVar = uy2.e.f173458a;
            tn2.y0.c cVar = new tn2.y0.c(new rn2.i("C100008SV90003510B3EBC632D144DFBCB149ACF7A30259014062DCBA98765C", "FF", "01234567", "11111111", "222222222222", "CATEGORY", new rn2.l("Active", new rn2.t("", false, false, false), "Enabled"), new rn2.a(new rn2.n("{card_art_image_id_01234567890123456789012}"), new rn2.u(new rn2.k("{display_name_0123456789012345678901234567890123456789012345678}", "{card_number_01234567890123456789012345678901234567890123456789}"))), null, new pn2.r(null, null, null, null, new pn2.g())), false, null);
            eVar.getClass();
            this.f178978a = new uy2.d(cVar);
        }

        @Override // xy2.o
        /* JADX INFO: renamed from: getValue */
        public final tn2.y0.c getF173457a() {
            return (tn2.y0.c) this.f178978a.f173457a;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lvn2/z0$f;", "Lxy2/o;", "Lpn2/e;", "<init>", "()V", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class f implements xy2.o<pn2.e> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ uy2.d f178981a;

        public f() {
            uy2.e eVar = uy2.e.f173458a;
            String string = DateTime.now().toString("yyyyMMdd");
            string.getClass();
            pn2.f fVar = new pn2.f(IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE, IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE, new pn2.k(string, "入", "出", "田町", "品川", "19737", "-133"), null);
            String string2 = DateTime.now().toString("yyyyMMdd");
            string2.getClass();
            pn2.f fVar2 = new pn2.f("2", IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE, new pn2.k(string2, null, "定", null, "品川", "19737", "-133"), null);
            String string3 = DateTime.now().minusMonths(1).toString("yyyyMMdd");
            string3.getClass();
            pn2.f fVar3 = new pn2.f("3", IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE, new pn2.k(string3, "現金", null, "田町", null, "19737", "-133"), null);
            String string4 = DateTime.now().minusMonths(1).toString("yyyyMMdd");
            string4.getClass();
            pn2.f fVar4 = new pn2.f("4", IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE, new pn2.k(string4, "購", null, "大宮", "大船", "19737", "-1330"), null);
            String string5 = DateTime.now().minusMonths(2).toString("yyyyMMdd");
            string5.getClass();
            pn2.f fVar5 = new pn2.f("5", IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE, new pn2.k(string5, null, null, "大宮", null, "1500", "0"), null);
            String string6 = DateTime.now().minusMonths(2).toString("yyyyMMdd");
            string6.getClass();
            pn2.e eVar2 = new pn2.e(p13.x.m(fVar, fVar2, fVar3, fVar4, fVar5, new pn2.f("6", IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE, new pn2.k(string6, "現金", null, null, null, "19737", "-1330"), null), new pn2.f("7", "0", null, "一部が表示できません")));
            eVar.getClass();
            this.f178981a = new uy2.d(eVar2);
        }

        @Override // xy2.o
        /* JADX INFO: renamed from: getValue */
        public final pn2.e getF173457a() {
            return (pn2.e) this.f178981a.f173457a;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lvn2/z0$g;", "Lxy2/o;", "Lpn2/e;", "<init>", "()V", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class g implements xy2.o<pn2.e> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ uy2.d f178982a;

        public g() {
            uy2.e eVar = uy2.e.f173458a;
            pn2.e eVar2 = new pn2.e(p13.h0.d1(p13.j0.f134944a));
            eVar.getClass();
            this.f178982a = new uy2.d(eVar2);
        }

        @Override // xy2.o
        /* JADX INFO: renamed from: getValue */
        public final pn2.e getF173457a() {
            return (pn2.e) this.f178982a.f173457a;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lvn2/z0$h;", "Lxy2/o;", "Lvn2/z0$e;", "<init>", "()V", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class h implements xy2.o<e> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ uy2.d f178983a;

        public h() {
            uy2.e eVar = uy2.e.f173458a;
            e.b bVar = new e.b("{email}", 1000);
            eVar.getClass();
            this.f178983a = new uy2.d(bVar);
        }

        @Override // xy2.o
        /* JADX INFO: renamed from: getValue */
        public final e getF173457a() {
            return (e) this.f178983a.f173457a;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lvn2/z0$i;", "Lxy2/o;", "Lvn2/z0$e;", "<init>", "()V", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class i implements xy2.o<e> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ uy2.d f178984a;

        public i() {
            uy2.e eVar = uy2.e.f173458a;
            e.c cVar = new e.c(100);
            eVar.getClass();
            this.f178984a = new uy2.d(cVar);
        }

        @Override // xy2.o
        /* JADX INFO: renamed from: getValue */
        public final e getF173457a() {
            return (e) this.f178984a.f173457a;
        }
    }

    @uy2.j0(description = "Fails to remove card", exceptionClass = Exception.class)
    @uy2.k(description = "Happy path")
    q03.b B(e cardRemovalState, e23.l<? super Long, Unit> longWaitingCallback);

    @uy2.j0(description = "Error on sync", exceptionClass = Exception.class)
    @uy2.r(description = "Happy path", providerClass = d.class)
    q03.r<tn2.y0.c> D(boolean force);

    @uy2.g0
    q03.r<Boolean> E0();

    q03.r<o13.p<List<vr2.q>, Optional<hs2.c>>> P();

    @uy2.f0("CID")
    /* JADX INFO: renamed from: V */
    String getCid();

    @uy2.k
    q03.b W();

    @Override // sy2.c
    @uy2.k
    /* synthetic */ void a(a1 a1Var);

    /* synthetic */ Object b();

    @uy2.g0(description = "Device connected")
    @uy2.v(description = "Device disconnected")
    boolean c();

    @uy2.o0(description = "Daily maintenance", providerClass = yn2.f.class)
    @uy2.k(description = "Not in maintenance")
    @uy2.k0(description = "10M before daily maintenance", providerClass = yn2.e.class)
    @uy2.l0(description = "Monthly maintenance", providerClass = yn2.h.class)
    @uy2.m0(description = "10M before monthly maintenance", providerClass = yn2.g.class)
    /* synthetic */ q03.b e(tn2.f0.a aVar);

    @uy2.r(providerClass = a.class)
    q03.r<Optional<as2.b<Integer>>> f();

    @uy2.f0("vivoactive 4")
    String getDeviceName();

    @uy2.b0(1)
    long getDeviceUnitId();

    @uy2.k(description = "GooglePay is ready")
    default q03.b i(Activity activity) {
        activity.getClass();
        tr2.b bVar = new tr2.b(new un2.a(activity, pn2.a.d.f138714a), 13);
        int i14 = w03.b.f181178a;
        return new z03.c(bVar);
    }

    @uy2.r(providerClass = a.class)
    q03.r<Optional<as2.b<Integer>>> j();

    @uy2.k(description = "Happy path")
    q03.b k0(e23.l<? super Long, Unit> longWaitingCallback);

    q03.r<File> o0();

    @uy2.o(description = "Greater than 220", providerClass = h.class)
    @uy2.r(description = "Not greater than 220 (Refund not needed)", providerClass = i.class)
    q03.r<e> p0();

    @uy2.r(providerClass = c.class)
    q03.r<b> q();

    @uy2.f0("https://static.garmincdn.com/en/products/010-02174-01/v/cf-lg-a7a42f50-df93-4f76-b5a0-55dfa6f849ca.jpg")
    String r();

    @uy2.o(description = "All kinds of records", providerClass = f.class)
    @uy2.r(description = "No records", providerClass = g.class)
    q03.r<pn2.e> t0();

    @uy2.j0(description = "In gate", exceptionClass = HasBeenPunchedException.class)
    @uy2.k(description = "Not in gate")
    q03.b v0();

    @uy2.k
    q03.b y(e23.l<? super Long, Unit> longWaitingCallback);

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\u0006\u0007\bB\u0011\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005\u0082\u0001\u0003\t\n\u000b¨\u0006\f"}, d2 = {"Lvn2/z0$e;", "", "", "balance", "<init>", "(I)V", "c", "b", "a", "Lvn2/z0$e$a;", "Lvn2/z0$e$b;", "Lvn2/z0$e$c;", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static abstract class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f178979a;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lvn2/z0$e$a;", "Lvn2/z0$e;", "<init>", "()V", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class a extends e {
            public a() {
                super(-1, null);
            }
        }

        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lvn2/z0$e$b;", "Lvn2/z0$e;", "", Scopes.EMAIL, "", "balance", "<init>", "(Ljava/lang/String;I)V", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class b extends e {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final String f178980b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(String str, int i14) {
                super(i14, null);
                str.getClass();
                this.f178980b = str;
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lvn2/z0$e$c;", "Lvn2/z0$e;", "", "balance", "<init>", "(I)V", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class c extends e {
            public c(int i14) {
                super(i14, null);
            }
        }

        private e(int i14) {
            this.f178979a = i14;
        }

        public /* synthetic */ e(int i14, p005kotlin.jvm.internal.j jVar) {
            this(i14);
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001BC\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u001a\u0010\u000b\u001a\u0016\u0012\u0004\u0012\u00020\t\u0018\u00010\bj\n\u0012\u0004\u0012\u00020\t\u0018\u0001`\n¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lvn2/z0$b;", "", "Lrn2/i;", "cardInfo", "Lpn2/e;", "history", "", "historyUnavailableReason", "Las2/b;", "", "Lcom/garmin/feature/garminpay/util/transit/BalanceInfo;", "balanceInfo", "<init>", "(Lrn2/i;Lpn2/e;Ljava/lang/Throwable;Las2/b;)V", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final rn2.i f178973a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final pn2.e f178974b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Throwable f178975c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final as2.b<Integer> f178976d;

        public b(rn2.i iVar, pn2.e eVar, Throwable th3, as2.b<Integer> bVar) {
            iVar.getClass();
            this.f178973a = iVar;
            this.f178974b = eVar;
            this.f178975c = th3;
            this.f178976d = bVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return p005kotlin.jvm.internal.s.g(this.f178973a, bVar.f178973a) && p005kotlin.jvm.internal.s.g(this.f178974b, bVar.f178974b) && p005kotlin.jvm.internal.s.g(this.f178975c, bVar.f178975c) && p005kotlin.jvm.internal.s.g(this.f178976d, bVar.f178976d);
        }

        public final int hashCode() {
            int iHashCode = this.f178973a.hashCode() * 31;
            pn2.e eVar = this.f178974b;
            int iHashCode2 = (iHashCode + (eVar == null ? 0 : eVar.hashCode())) * 31;
            Throwable th3 = this.f178975c;
            int iHashCode3 = (iHashCode2 + (th3 == null ? 0 : th3.hashCode())) * 31;
            as2.b<Integer> bVar = this.f178976d;
            return iHashCode3 + (bVar != null ? bVar.hashCode() : 0);
        }

        public final String toString() {
            return "CardDetail(cardInfo=" + this.f178973a + ", history=" + this.f178974b + ", historyUnavailableReason=" + this.f178975c + ", balanceInfo=" + this.f178976d + ")";
        }

        public /* synthetic */ b(rn2.i iVar, pn2.e eVar, Throwable th3, as2.b bVar, int i14, p005kotlin.jvm.internal.j jVar) {
            this(iVar, (i14 & 2) != 0 ? null : eVar, (i14 & 4) != 0 ? null : th3, bVar);
        }
    }
}
