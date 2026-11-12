package po2;

import androidx.lifecycle.y0;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.garmin.feature.garminpay.providers.gpay.model.Links;
import com.garmin.feature.garminpay.providers.gpay.snowball.CurrencyValue;
import com.garmin.feature.garminpay.providers.gpay.snowball.exception.MaintenanceException;
import com.garmin.feature.garminpay.providers.unionpay.exception.NetworkException;
import com.nimbusds.jose.jwk.JWKParameterNames;
import java.util.List;
import org.joda.time.DateTime;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import uy2.c1;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\r\bf\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\n3456789:0;J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H§@¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bH§@¢\u0006\u0004\b\t\u0010\u0007J\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\bH'¢\u0006\u0004\b\f\u0010\rJ\u0018\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000eH§@¢\u0006\u0004\b\u0011\u0010\u0012J\u001c\u0010\u0015\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\u00140\u0013H§@¢\u0006\u0004\b\u0015\u0010\u0007J\u0010\u0010\u0016\u001a\u00020\u000bH§@¢\u0006\u0004\b\u0016\u0010\u0007J\u0018\u0010\u0018\u001a\u00020\u000b2\u0006\u0010\u0017\u001a\u00020\u0005H§@¢\u0006\u0004\b\u0018\u0010\u0019J\u0018\u0010\u001c\u001a\u00020\u000b2\u0006\u0010\u001b\u001a\u00020\u001aH§@¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u000bH§@¢\u0006\u0004\b\u001e\u0010\u0007J\u000f\u0010\u001f\u001a\u00020\u000bH'¢\u0006\u0004\b\u001f\u0010 R\u0014\u0010$\u001a\u00020!8'X¦\u0004¢\u0006\u0006\u001a\u0004\b\"\u0010#R\u001a\u0010'\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00048'X¦\u0004¢\u0006\u0006\u001a\u0004\b%\u0010&R\u0014\u0010*\u001a\u00020\u000e8'X¦\u0004¢\u0006\u0006\u001a\u0004\b(\u0010)R\u0014\u0010.\u001a\u00020+8'X¦\u0004¢\u0006\u0006\u001a\u0004\b,\u0010-R\u0014\u00102\u001a\u00020/8'X¦\u0004¢\u0006\u0006\u001a\u0004\b0\u00101¨\u0006<À\u0006\u0003"}, d2 = {"Lpo2/k;", "Lsy2/c;", "Lpo2/l;", "", "", "Lpo2/s;", "G0", "(Lt13/d;)Ljava/lang/Object;", "", "v", "phoneNumber", "", "b0", "(Ljava/lang/String;)V", "Lfo2/i;", "totalFee", "Lfo2/a0;", "C", "(Lfo2/i;Lt13/d;)Ljava/lang/Object;", "Landroidx/lifecycle/s0;", "Laq2/l;", "U", "r0", "snowballCard", "d0", "(Lpo2/s;Lt13/d;)Ljava/lang/Object;", "Lfo2/q;", "action", "m", "(Lfo2/q;Lt13/d;)Ljava/lang/Object;", "z0", "g0", "()V", "Lsd2/f;", "getDevice", "()Lsd2/f;", "device", "s", "()Ljava/util/List;", "chargeAmountCandidates", "H", "()Lfo2/i;", "activationFee", "Lfo2/x;", "c0", "()Lfo2/x;", "paymentChannel", "", "h", "()I", "ageBeforeDeletableDays", "c", "b", "a", "g", "d", "j", "f", IntegerTokenConverter.CONVERTER_KEY, JWKParameterNames.RSA_EXPONENT, "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public interface k extends sy2.c<l> {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lpo2/k$a;", "Lxy2/o;", "Lfo2/i;", "<init>", "()V", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a implements xy2.o<fo2.i> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ uy2.d f139240a;

        public a() {
            uy2.e eVar = uy2.e.f173458a;
            CurrencyValue.a aVar = CurrencyValue.f51217c;
            ko2.a.b bVar = ko2.a.f105768a;
            aVar.getClass();
            fo2.i iVar = new fo2.i(CurrencyValue.a.a(0L, bVar), new CurrencyValue(0L, bVar));
            eVar.getClass();
            this.f139240a = new uy2.d(iVar);
        }

        @Override // xy2.o
        /* JADX INFO: renamed from: getValue */
        public final fo2.i getF173457a() {
            return (fo2.i) this.f139240a.f173457a;
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lpo2/k$b;", "Lxy2/o;", "", "Lfo2/i;", "<init>", "()V", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class b implements xy2.o<List<? extends fo2.i>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ uy2.d f139241a;

        public b() {
            uy2.e eVar = uy2.e.f173458a;
            CurrencyValue.a aVar = CurrencyValue.f51217c;
            ko2.a.b bVar = ko2.a.f105768a;
            aVar.getClass();
            List listK = p13.x.k(new fo2.i(CurrencyValue.a.a(10L, bVar), new CurrencyValue(5L, bVar)), new fo2.i(new CurrencyValue(20L, bVar), new CurrencyValue(15L, bVar)), new fo2.i(new CurrencyValue(50L, bVar), new CurrencyValue(45L, bVar)), new fo2.i(new CurrencyValue(100L, bVar), new CurrencyValue(95L, bVar)));
            eVar.getClass();
            this.f139241a = new uy2.d(listK);
        }

        @Override // xy2.o
        /* JADX INFO: renamed from: getValue */
        public final List<? extends fo2.i> getF173457a() {
            return (List) this.f139241a.f173457a;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lpo2/k$c;", "Lxy2/o;", "Lsd2/f;", "<init>", "()V", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class c implements xy2.o<sd2.f> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ uy2.d f139242a;

        public c() {
            uy2.e eVar = uy2.e.f173458a;
            sd2.j jVar = new sd2.j();
            jVar.f158685b1 = "{DEVICE NAME}";
            Unit unit = Unit.INSTANCE;
            eVar.getClass();
            this.f139242a = new uy2.d(jVar);
        }

        @Override // xy2.o
        /* JADX INFO: renamed from: getValue */
        public final sd2.f getF173457a() {
            return (sd2.f) this.f139242a.f173457a;
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lpo2/k$d;", "Lxy2/o;", "", "Lpo2/s;", "<init>", "()V", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class d implements xy2.o<List<? extends s>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ uy2.d f139243a;

        public d() {
            uy2.e eVar = uy2.e.f173458a;
            p13.j0 j0Var = p13.j0.f134944a;
            eVar.getClass();
            this.f139243a = new uy2.d(j0Var);
        }

        @Override // xy2.o
        /* JADX INFO: renamed from: getValue */
        public final List<? extends s> getF173457a() {
            return (List) this.f139243a.f173457a;
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u00020\u0001B\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lpo2/k$e;", "Lxy2/o;", "Landroidx/lifecycle/s0;", "Laq2/l;", "", "<init>", "()V", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class e implements xy2.o<androidx.lifecycle.s0<aq2.l<? extends Unit>>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ uy2.d f139244a;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
        @v13.e(c = "com.garmin.feature.garminpay.providers.gpay.snowball.ui.ISnowballAddCardModel$ErrorProcessProvider$1$1", f = "ISnowballAddCardModel.kt", l = {153, 156}, m = "invokeSuspend", v = 2)
        public static final class a extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public int f139245a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public int f139246b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ y0<aq2.l<Unit>> f139247c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(y0<aq2.l<Unit>> y0Var, t13.d<? super a> dVar) {
                super(2, dVar);
                this.f139247c = y0Var;
            }

            @Override // v13.a
            public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
                return new a(this.f139247c, dVar);
            }

            @Override // e23.p
            public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
                return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
            }

            /* JADX WARN: Code duplicated, block: B:13:0x0030  */
            /* JADX WARN: Code duplicated, block: B:17:0x0047  */
            /* JADX WARN: Code restructure failed: missing block: B:14:0x003a, code lost:
            
                if (o53.m0.b(28, r7) == r0) goto L19;
             */
            /* JADX WARN: Code restructure failed: missing block: B:18:0x004f, code lost:
            
                if (o53.m0.b(500, r7) == r0) goto L19;
             */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:14:0x003a -> B:16:0x003d). Please report as a decompilation issue!!! */
            @Override // v13.a
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object invokeSuspend(Object obj) {
                int i14;
                u13.a aVar = u13.a.COROUTINE_SUSPENDED;
                int i15 = this.f139246b;
                y0<aq2.l<Unit>> y0Var = this.f139247c;
                if (i15 == 0) {
                    o13.r.b(obj);
                    y0Var.j(new aq2.l.c(0));
                    i14 = 1;
                    if (i14 < 71) {
                        this.f139245a = i14;
                        this.f139246b = 1;
                    } else {
                        this.f139246b = 2;
                    }
                    return aVar;
                }
                if (i15 == 1) {
                    i14 = this.f139245a;
                    o13.r.b(obj);
                    y0Var.j(new aq2.l.c(i14));
                    i14++;
                    if (i14 < 71) {
                        this.f139245a = i14;
                        this.f139246b = 1;
                    } else {
                        this.f139246b = 2;
                    }
                    return aVar;
                }
                if (i15 != 2) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                o13.r.b(obj);
                y0Var.j(new aq2.l.a(new IllegalStateException()));
                return Unit.INSTANCE;
            }
        }

        public e() {
            uy2.e eVar = uy2.e.f173458a;
            y0 y0Var = new y0(aq2.l.b.f12513a);
            ge1.b.T(o53.c0.a(o53.s0.f129406a), null, null, new a(y0Var, null), 3);
            Unit unit = Unit.INSTANCE;
            eVar.getClass();
            this.f139244a = new uy2.d(y0Var);
        }

        @Override // xy2.o
        /* JADX INFO: renamed from: getValue */
        public final androidx.lifecycle.s0<aq2.l<? extends Unit>> getF173457a() {
            return (androidx.lifecycle.s0) this.f139244a.f173457a;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lpo2/k$f;", "Lxy2/o;", "Lcom/garmin/feature/garminpay/providers/unionpay/exception/NetworkException;", "<init>", "()V", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class f implements xy2.o<NetworkException> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ uy2.d f139248a;

        public f() {
            uy2.e eVar = uy2.e.f173458a;
            NetworkException networkException = new NetworkException(NetworkException.a.CONNECT, "sample error");
            eVar.getClass();
            this.f139248a = new uy2.d(networkException);
        }

        @Override // xy2.o
        /* JADX INFO: renamed from: getValue */
        public final NetworkException getF173457a() {
            return (NetworkException) this.f139248a.f173457a;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lpo2/k$g;", "Lxy2/o;", "Lfo2/x;", "<init>", "()V", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class g implements xy2.o<fo2.x> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ uy2.d f139249a;

        public g() {
            uy2.e eVar = uy2.e.f173458a;
            fo2.x xVar = fo2.x.ALIPAY;
            eVar.getClass();
            this.f139249a = new uy2.d(xVar);
        }

        @Override // xy2.o
        /* JADX INFO: renamed from: getValue */
        public final fo2.x getF173457a() {
            return (fo2.x) this.f139249a.f173457a;
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u00020\u0001B\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lpo2/k$h;", "Lxy2/o;", "Landroidx/lifecycle/s0;", "Laq2/l;", "", "<init>", "()V", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class h implements xy2.o<androidx.lifecycle.s0<aq2.l<? extends Unit>>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ uy2.d f139250a;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
        @v13.e(c = "com.garmin.feature.garminpay.providers.gpay.snowball.ui.ISnowballAddCardModel$ProcessProvider$1$1", f = "ISnowballAddCardModel.kt", l = {137, 140, 142}, m = "invokeSuspend", v = 2)
        public static final class a extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public int f139251a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public int f139252b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ y0<aq2.l<Unit>> f139253c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(y0<aq2.l<Unit>> y0Var, t13.d<? super a> dVar) {
                super(2, dVar);
                this.f139253c = y0Var;
            }

            @Override // v13.a
            public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
                return new a(this.f139253c, dVar);
            }

            @Override // e23.p
            public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
                return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
            }

            /* JADX WARN: Code duplicated, block: B:15:0x0037  */
            /* JADX WARN: Code duplicated, block: B:19:0x004e  */
            /* JADX WARN: Code duplicated, block: B:22:0x0059  */
            /* JADX WARN: Code restructure failed: missing block: B:16:0x0041, code lost:
            
                if (o53.m0.b(28, r8) == r0) goto L24;
             */
            /* JADX WARN: Code restructure failed: missing block: B:23:0x006b, code lost:
            
                if (o53.m0.b(500, r8) == r0) goto L24;
             */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x0041 -> B:18:0x0044). Please report as a decompilation issue!!! */
            @Override // v13.a
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object invokeSuspend(Object obj) {
                int i14;
                u13.a aVar = u13.a.COROUTINE_SUSPENDED;
                int i15 = this.f139252b;
                y0<aq2.l<Unit>> y0Var = this.f139253c;
                if (i15 == 0) {
                    o13.r.b(obj);
                    y0Var.j(new aq2.l.c(0));
                    i14 = 1;
                    if (i14 < 71) {
                        this.f139251a = i14;
                        this.f139252b = 1;
                    } else {
                        this.f139252b = 2;
                        if (o53.m0.b(2000L, this) != aVar) {
                            y0Var.j(new aq2.l.c(100));
                            this.f139252b = 3;
                        }
                    }
                    return aVar;
                }
                if (i15 == 1) {
                    i14 = this.f139251a;
                    o13.r.b(obj);
                    y0Var.j(new aq2.l.c(i14));
                    i14++;
                    if (i14 < 71) {
                        this.f139251a = i14;
                        this.f139252b = 1;
                    } else {
                        this.f139252b = 2;
                        if (o53.m0.b(2000L, this) != aVar) {
                            y0Var.j(new aq2.l.c(100));
                            this.f139252b = 3;
                        }
                    }
                    return aVar;
                }
                if (i15 == 2) {
                    o13.r.b(obj);
                    y0Var.j(new aq2.l.c(100));
                    this.f139252b = 3;
                } else {
                    if (i15 != 3) {
                        vb.h.z("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    o13.r.b(obj);
                }
                Unit unit = Unit.INSTANCE;
                y0Var.j(new aq2.l.d(unit));
                return unit;
            }
        }

        public h() {
            uy2.e eVar = uy2.e.f173458a;
            y0 y0Var = new y0(aq2.l.b.f12513a);
            ge1.b.T(o53.c0.a(o53.s0.f129406a), null, null, new a(y0Var, null), 3);
            Unit unit = Unit.INSTANCE;
            eVar.getClass();
            this.f139250a = new uy2.d(y0Var);
        }

        @Override // xy2.o
        /* JADX INFO: renamed from: getValue */
        public final androidx.lifecycle.s0<aq2.l<? extends Unit>> getF173457a() {
            return (androidx.lifecycle.s0) this.f139250a.f173457a;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lpo2/k$i;", "Lxy2/o;", "Lfo2/a0;", "<init>", "()V", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class i implements xy2.o<fo2.a0> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ uy2.d f139254a;

        public i() {
            uy2.e eVar = uy2.e.f173458a;
            Links links = new Links(new o13.p[0]);
            fo2.x xVar = fo2.x.ALIPAY;
            CurrencyValue.a aVar = CurrencyValue.f51217c;
            ko2.a.b bVar = ko2.a.f105768a;
            aVar.getClass();
            CurrencyValue currencyValueA = CurrencyValue.a.a(10L, bVar);
            CurrencyValue currencyValue = new CurrencyValue(10L, bVar);
            long millis = DateTime.now().getMillis();
            DateTime dateTimeNow = DateTime.now();
            dateTimeNow.getClass();
            long millis2 = DateTime.now().getMillis();
            DateTime dateTimeNow2 = DateTime.now();
            dateTimeNow2.getClass();
            fo2.a0 a0Var = new fo2.a0(links, "samplePurchaseId", "transitCardId", "sampleType", "PENDING_PAYMENT", xVar, "sampleUserId", "sampleDeviceId", "sampleProductId", "sampleProviderId", currencyValueA, currencyValue, millis, dateTimeNow, millis2, dateTimeNow2, new fo2.c("sampleApplicationId", new fo2.c.b("sampleOrderNumber", "sampleSignedData")), "sampleCredentialId", "extOrderNumber", "extOrderStatus");
            eVar.getClass();
            this.f139254a = new uy2.d(a0Var);
        }

        @Override // xy2.o
        /* JADX INFO: renamed from: getValue */
        public final fo2.a0 getF173457a() {
            return (fo2.a0) this.f139254a.f173457a;
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lpo2/k$j;", "Lxy2/o;", "", "Lpo2/s;", "<init>", "()V", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class j implements xy2.o<List<? extends s>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ uy2.d f139255a;

        public j() {
            uy2.e eVar = uy2.e.f173458a;
            List listK = p13.x.k(new s("{Transit Card Name}", "https://api.qa.fitpay.ninja/assets?assetId=9f67e551a88ecdd165b49871f543a0575a6a25e3&adapterId=1131178c-aab5-438b-ab9d-a6572cb64c8c&adapterData=eyJ1cmwiOiJodHRwczovL2ZwY3RybC1xYS13ZWJyZXNvdXJjZXMtdXMtZWFzdC0xLnMzLmFtYXpvbmF3cy5jb20vcmVzb3VyY2VzL3NhbXBsZS10cmFuc2l0LWFzc2V0cy90X3VuaW9uX2NhcmQucG5nIn0", "https://api.qa.fitpay.ninja/users/87dc719f-4981-44df-a3fa-bd297444438a/credentials?transitCardId=701618e2-aadc-4ba0-a0d2-0d1ee3d9ed05", 50.0d), new s("{Transit Card Name}", "https://api.qa.fitpay.ninja/assets?assetId=9f67e551a88ecdd165b49871f543a0575a6a25e3&adapterId=1131178c-aab5-438b-ab9d-a6572cb64c8c&adapterData=eyJ1cmwiOiJodHRwczovL2ZwY3RybC1xYS13ZWJyZXNvdXJjZXMtdXMtZWFzdC0xLnMzLmFtYXpvbmF3cy5jb20vcmVzb3VyY2VzL3NhbXBsZS10cmFuc2l0LWFzc2V0cy90X3VuaW9uX2NhcmQucG5nIn0", "https://api.qa.fitpay.ninja/users/87dc719f-4981-44df-a3fa-bd297444438a/credentials?transitCardId=701618e2-aadc-4ba0-a0d2-0d1ee3d9ed05", 30.0d));
            eVar.getClass();
            this.f139255a = new uy2.d(listK);
        }

        @Override // xy2.o
        /* JADX INFO: renamed from: getValue */
        public final List<? extends s> getF173457a() {
            return (List) this.f139255a.f173457a;
        }
    }

    @uy2.j0(description = "API error", exceptionClass = Exception.class)
    @uy2.r(description = "Happy path", providerClass = i.class)
    Object C(fo2.i iVar, t13.d<? super fo2.a0> dVar);

    @uy2.o(description = "Two cards to shift in", providerClass = j.class)
    @uy2.o0(description = "Network error", providerClass = f.class)
    @uy2.r(description = "No card to shift in", providerClass = d.class)
    Object G0(t13.d<? super List<s>> dVar);

    @uy2.r(providerClass = a.class)
    fo2.i H();

    @uy2.o(description = "Error", providerClass = e.class)
    @uy2.r(description = "Happy path", providerClass = h.class)
    Object U(t13.d<? super androidx.lifecycle.s0<aq2.l<Unit>>> dVar);

    @Override // sy2.c
    @uy2.k
    /* synthetic */ void a(l lVar);

    /* synthetic */ Object b();

    @uy2.k(description = "Happy path")
    void b0(String phoneNumber);

    @uy2.r(providerClass = g.class)
    fo2.x c0();

    @uy2.f0("Beijing T-Union Transit Card")
    /* synthetic */ String d();

    @uy2.j0(description = "API call failed", exceptionClass = IllegalStateException.class)
    @uy2.k(description = "Happy path")
    Object d0(s sVar, t13.d<? super Unit> dVar);

    @uy2.k
    void g0();

    @uy2.r(providerClass = c.class)
    sd2.f getDevice();

    @uy2.y(30)
    int h();

    @uy2.f0("https://api.qa.fitpay.ninja/assets?assetId=9f67e551a88ecdd165b49871f543a0575a6a25e3&adapterId=1131178c-aab5-438b-ab9d-a6572cb64c8c&adapterData=eyJ1cmwiOiJodHRwczovL2ZwY3RybC1xYS13ZWJyZXNvdXJjZXMtdXMtZWFzdC0xLnMzLmFtYXpvbmF3cy5jb20vcmVzb3VyY2VzL3NhbXBsZS10cmFuc2l0LWFzc2V0cy90X3VuaW9uX2NhcmQucG5nIn0")
    /* synthetic */ String l();

    @uy2.j0(description = "In server maintenance time.", exceptionClass = MaintenanceException.class)
    @uy2.k(description = "Out of server maintenance time.")
    Object m(fo2.q qVar, t13.d<? super Unit> dVar);

    @uy2.j0(description = "Product incorrect", exceptionClass = IllegalArgumentException.class)
    @uy2.k(description = "Happy path")
    @uy2.h0(description = "Server in maintenance", exceptionClass = MaintenanceException.class)
    Object r0(t13.d<? super Unit> dVar);

    @uy2.r(providerClass = b.class)
    List<fo2.i> s();

    @c1
    @uy2.f0(description = "Succeeded to get TC text", value = "(Terms and Conditions)")
    @uy2.j0(description = "Failed to get TC text", exceptionClass = IllegalStateException.class)
    Object v(t13.d<? super String> dVar);

    @uy2.k
    Object z0(t13.d<? super Unit> dVar);
}
