package vr2;

import androidx.lifecycle.s0;
import androidx.lifecycle.y0;
import com.garmin.feature.garminpay.providers.gpay.snowball.exception.CardRefundFailedException;
import com.google.android.exoplayer2.metadata.icy.IcyHeaders;
import com.nimbusds.jose.jwk.JWKParameterNames;
import java.util.ArrayList;
import java.util.List;
import o53.b0;
import o53.m0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p13.j0;
import p13.w;
import p13.x;
import uy2.o0;
import uy2.p0;
import uy2.v;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\f\bf\u0018\u0000 \u00182\b\u0012\u0004\u0012\u00020\u00000\u0001:\b\u0019\u001a\u001b\u001c\u001d\u001e\u001f J\u000f\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0005\u001a\u00020\u0002H'¢\u0006\u0004\b\u0005\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\b\u001a\u00020\u0002H'¢\u0006\u0004\b\b\u0010\u0004R\u001a\u0010\r\u001a\b\u0012\u0004\u0012\u00020\n0\t8'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR \u0010\u0011\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u000e0\t8'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\fR \u0010\u0014\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u000e0\t8'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\fR\u001a\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00150\t8'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\f¨\u0006!À\u0006\u0003"}, d2 = {"Lvr2/e;", "Lry2/a;", "", "d0", "()V", "U2", "m", "(Lt13/d;)Ljava/lang/Object;", "l", "Landroidx/lifecycle/s0;", "Lwr2/f;", JWKParameterNames.RSA_MODULUS, "()Landroidx/lifecycle/s0;", "cardOperationNotification", "", "Lfs2/a;", "X3", "walletItemList", "Lvr2/q;", "getData", "data", "", "H", "isLoadingInProgress", "B0", "c", JWKParameterNames.RSA_EXPONENT, "d", "a", "g", "h", "f", "b", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public interface e extends ry2.a<e> {

    /* JADX INFO: renamed from: B0, reason: from kotlin metadata */
    public static final Companion INSTANCE = Companion.f179579a;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lvr2/e$a;", "Lxy2/o;", "Landroidx/lifecycle/s0;", "Lwr2/f;", "<init>", "()V", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a implements xy2.o<s0<wr2.f>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ uy2.d f179577a;

        public a() {
            uy2.e eVar = uy2.e.f173458a;
            wr2.e eVar2 = wr2.e.f186838m;
            eVar.getClass();
            this.f179577a = new uy2.d(eVar2);
        }

        @Override // xy2.o
        /* JADX INFO: renamed from: getValue */
        public final s0<wr2.f> getF173457a() {
            return (s0) this.f179577a.f173457a;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lvr2/e$b;", "Lxy2/o;", "Lcom/garmin/feature/garminpay/providers/gpay/snowball/exception/CardRefundFailedException;", "<init>", "()V", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class b implements xy2.o<CardRefundFailedException> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ uy2.d f179578a;

        public b() {
            uy2.e eVar = uy2.e.f173458a;
            CardRefundFailedException cardRefundFailedException = new CardRefundFailedException("Beijing T-Union Transit Card", "userId", "refundId");
            eVar.getClass();
            this.f179578a = new uy2.d(cardRefundFailedException);
        }

        @Override // xy2.o
        /* JADX INFO: renamed from: getValue */
        public final CardRefundFailedException getF173457a() {
            return (CardRefundFailedException) this.f179578a.f173457a;
        }
    }

    /* JADX INFO: renamed from: vr2.e$c, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lvr2/e$c;", "", "<init>", "()V", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ Companion f179579a = new Companion();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final fs2.a f179580b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final q f179581c;

        static {
            fs2.a aVar = new fs2.a();
            aVar.f73429d = "Beijing T-Union Transit Card";
            aVar.f73426a = "CARD_ID_1";
            aVar.f73427b = is2.b.FITPAY;
            aVar.f73428c = qs2.a.f147388q;
            aVar.f73433h = qs2.f.ACTIVE;
            f179580b = aVar;
            lr2.m.Companion cVar = lr2.m.INSTANCE;
            cVar.getClass();
            fs2.a aVar2 = lr2.m.Companion.f114411b;
            String str = aVar2.f73429d;
            cVar.getClass();
            f179581c = new q(str, "https://api.qa.fitpay.ninja/assets?assetId=9f67e551a88ecdd165b49871f543a0575a6a25e3&adapterId=1131178c-aab5-438b-ab9d-a6572cb64c8c&adapterData=eyJ1cmwiOiJodHRwczovL2ZwY3RybC1xYS13ZWJyZXNvdXJjZXMtdXMtZWFzdC0xLnMzLmFtYXpvbmF3cy5jb20vcmVzb3VyY2VzL3NhbXBsZS10cmFuc2l0LWFzc2V0cy90X3VuaW9uX2NhcmQucG5nIn0", null, null, aVar2);
        }

        private Companion() {
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u00020\u0001B\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lvr2/e$d;", "Lxy2/o;", "Landroidx/lifecycle/s0;", "", "Lfs2/a;", "<init>", "()V", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class d implements xy2.o<s0<List<? extends fs2.a>>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ uy2.d f179582a;

        public d() {
            uy2.e eVar = uy2.e.f173458a;
            y0 y0Var = new y0(j0.f134944a);
            eVar.getClass();
            this.f179582a = new uy2.d(y0Var);
        }

        @Override // xy2.o
        /* JADX INFO: renamed from: getValue */
        public final s0<List<? extends fs2.a>> getF173457a() {
            return (s0) this.f179582a.f173457a;
        }
    }

    /* JADX INFO: renamed from: vr2.e$e, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u00020\u0001B\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lvr2/e$e;", "Lxy2/o;", "Landroidx/lifecycle/s0;", "", "Lfs2/a;", "<init>", "()V", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class C3354e implements xy2.o<s0<List<? extends fs2.a>>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ uy2.d f179583a;

        public C3354e() {
            uy2.e eVar = uy2.e.f173458a;
            e.INSTANCE.getClass();
            y0 y0Var = new y0(w.c(Companion.f179580b));
            eVar.getClass();
            this.f179583a = new uy2.d(y0Var);
        }

        @Override // xy2.o
        /* JADX INFO: renamed from: getValue */
        public final s0<List<? extends fs2.a>> getF173457a() {
            return (s0) this.f179583a.f173457a;
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0007\u0018\u00002\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lvr2/e$f;", "Luy2/b;", "Landroidx/lifecycle/y0;", "", "<init>", "()V", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class f implements uy2.b<y0<Boolean>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ b f179584a;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
        @v13.e(c = "com.garmin.feature.garminpay.ui.userwallet.viewmodels.IUserWalletViewModel$LoadingStateProvider$1$1", f = "IUserWalletViewModel.kt", l = {85}, m = "invokeSuspend", v = 2)
        public static final class a extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public int f179585a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ y0<Boolean> f179586b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(y0<Boolean> y0Var, t13.d<? super a> dVar) {
                super(2, dVar);
                this.f179586b = y0Var;
            }

            @Override // v13.a
            public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
                return new a(this.f179586b, dVar);
            }

            @Override // e23.p
            public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
                return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // v13.a
            public final Object invokeSuspend(Object obj) {
                u13.a aVar = u13.a.COROUTINE_SUSPENDED;
                int i14 = this.f179585a;
                if (i14 == 0) {
                    o13.r.b(obj);
                    this.f179586b.j(Boolean.TRUE);
                    this.f179585a = 1;
                    if (m0.b(2000L, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i14 != 1) {
                        vb.h.z("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    o13.r.b(obj);
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

        public f() {
            int i14 = uy2.h.f173460a;
            this.f179584a = new b();
        }

        @Override // uy2.b
        public final void a(y0<Boolean> y0Var, Object[] objArr) throws Throwable {
            this.f179584a.a(y0Var, objArr);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lvr2/e$g;", "Lxy2/o;", "", "Lvr2/q;", "<init>", "()V", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class g implements xy2.o<List<q>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ uy2.d f179587a;

        public g() {
            uy2.e eVar = uy2.e.f173458a;
            e.INSTANCE.getClass();
            ArrayList arrayListM = x.m(Companion.f179581c);
            eVar.getClass();
            this.f179587a = new uy2.d(arrayListM);
        }

        @Override // xy2.o
        /* JADX INFO: renamed from: getValue */
        public final List<q> getF173457a() {
            return (List) this.f179587a.f173457a;
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u00020\u0001B\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lvr2/e$h;", "Luy2/b;", "Landroidx/lifecycle/y0;", "", "Lvr2/q;", "<init>", "()V", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class h implements uy2.b<y0<List<q>>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ b f179588a;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
        @v13.e(c = "com.garmin.feature.garminpay.ui.userwallet.viewmodels.IUserWalletViewModel$UserWalletCardItemModelListReevaluater$1$1", f = "IUserWalletViewModel.kt", l = {73}, m = "invokeSuspend", v = 2)
        public static final class a extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public int f179589a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ y0<List<q>> f179590b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(y0<List<q>> y0Var, t13.d<? super a> dVar) {
                super(2, dVar);
                this.f179590b = y0Var;
            }

            @Override // v13.a
            public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
                return new a(this.f179590b, dVar);
            }

            @Override // e23.p
            public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
                return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // v13.a
            public final Object invokeSuspend(Object obj) {
                u13.a aVar = u13.a.COROUTINE_SUSPENDED;
                int i14 = this.f179589a;
                if (i14 == 0) {
                    o13.r.b(obj);
                    e.INSTANCE.getClass();
                    this.f179590b.j(x.m(Companion.f179581c));
                    this.f179589a = 1;
                    if (m0.b(500L, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i14 != 1) {
                        vb.h.z("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    o13.r.b(obj);
                }
                return Unit.INSTANCE;
            }
        }

        @Metadata(d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00020\u0001¨\u0006\u0003¸\u0006\u0000"}, d2 = {"uy2/g", "Luy2/b;", "Landroidx/lifecycle/y0;", "ui-synthesizer_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class b implements uy2.b<y0<List<q>>> {
            @Override // uy2.b
            public final void a(y0<List<q>> y0Var, Object[] objArr) throws Throwable {
                ge1.b.W(t13.h.f161748a, new a(y0Var, null));
            }
        }

        public h() {
            int i14 = uy2.h.f173460a;
            this.f179588a = new b();
        }

        @Override // uy2.b
        public final void a(y0<List<q>> y0Var, Object[] objArr) throws Throwable {
            this.f179588a.a(y0Var, objArr);
        }
    }

    @uy2.s0(providerClass = f.class)
    @uy2.j(keys = {"loading"})
    @v
    s0<Boolean> H();

    @uy2.k
    @p0(keys = {"loading"})
    void U2();

    @uy2.o(description = "No cards", providerClass = d.class)
    @uy2.r(description = "Have cards", providerClass = C3354e.class)
    s0<List<fs2.a>> X3();

    @uy2.k(description = "Happy path")
    @p0(keys = {"updateData"})
    void d0();

    @uy2.s0(providerClass = h.class)
    @uy2.j(keys = {"updateData"})
    @uy2.r(description = IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE, providerClass = g.class)
    s0<List<q>> getData();

    @uy2.k
    void l();

    @uy2.k(description = "No refund failed cards")
    @o0(description = "Has refund failed card", providerClass = b.class)
    Object m(t13.d<? super Unit> dVar);

    @uy2.f(providerClass = a.class)
    s0<wr2.f> n();
}
