package po2;

import androidx.lifecycle.z0;
import com.garmin.feature.garminpay.providers.gpay.snowball.exception.MaintenanceException;
import com.garmin.feature.garminpay.providers.gpay.snowball.exception.ProviderErrorCodeException;
import com.garmin.feature.garminpay.providers.gpay.snowball.exception.UserCancellationException;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import java.util.Iterator;
import java.util.List;
import org.slf4j.Logger;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004:\u0001\u0007B\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"Lpo2/r;", "Lpo2/b;", "Lpo2/k;", "Lcom/garmin/feature/garminpay/providers/gpay/snowball/ui/a;", "Lpo2/l;", "<init>", "()V", "a", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class r extends po2.b<k, com.garmin.feature.garminpay.providers.gpay.snowball.ui.a> implements l {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Logger f139345c;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.feature.garminpay.providers.gpay.snowball.ui.SnowballAddCardPresenter$onCardToShiftInClicked$1", f = "SnowballAddCardPresenter.kt", l = {69, 70, 71}, m = "invokeSuspend", v = 2)
    public static final class b extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public r f139346a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public s f139347b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f139348c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f139349d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public /* synthetic */ Object f139350e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final /* synthetic */ s f139352g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(s sVar, t13.d<? super b> dVar) {
            super(2, dVar);
            this.f139352g = sVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            b bVar = r.this.new b(this.f139352g, dVar);
            bVar.f139350e = obj;
            return bVar;
        }

        @Override // e23.p
        public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
            return ((b) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:30:0x0098, code lost:
        
            if (r10.d0(r2, r9) == r0) goto L31;
         */
        @Override // v13.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            Object bVar;
            s sVar;
            r rVar;
            int i14;
            s sVar2;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i15 = this.f139349d;
            r rVar2 = r.this;
            try {
                if (i15 == 0) {
                    o13.r.b(obj);
                    sVar = this.f139352g;
                    int i16 = o13.q.f128596b;
                    vq2.e eVar = (vq2.e) rVar2.getView();
                    int i17 = vq2.e.f179461z0;
                    eVar.S5(null, null);
                    k kVar = (k) rVar2.f0();
                    this.f139350e = null;
                    this.f139346a = rVar2;
                    this.f139347b = sVar;
                    this.f139348c = 0;
                    this.f139349d = 1;
                    if (kVar.z0(this) != aVar) {
                        rVar = rVar2;
                        i14 = 0;
                    }
                    return aVar;
                }
                if (i15 == 1) {
                    i14 = this.f139348c;
                    s sVar3 = this.f139347b;
                    r rVar3 = this.f139346a;
                    o13.r.b(obj);
                    sVar = sVar3;
                    rVar = rVar3;
                } else if (i15 == 2) {
                    i14 = this.f139348c;
                    sVar2 = this.f139347b;
                    rVar = this.f139346a;
                    o13.r.b(obj);
                    k kVar2 = (k) rVar.f0();
                    this.f139350e = null;
                    this.f139346a = null;
                    this.f139347b = null;
                    this.f139348c = i14;
                    this.f139349d = 3;
                } else {
                    if (i15 != 3) {
                        vb.h.z("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    o13.r.b(obj);
                }
                bVar = Unit.INSTANCE;
                int i18 = o13.q.f128596b;
                if (!(bVar instanceof o13.q.b)) {
                    ((com.garmin.feature.garminpay.providers.gpay.snowball.ui.a) rVar2.getView()).hideProgressOverlay();
                    ((com.garmin.feature.garminpay.providers.gpay.snowball.ui.a) rVar2.getView()).r3();
                }
                Throwable thB = o13.q.b(bVar);
                if (thB != null) {
                    r.f139345c.error("onCardToShiftInClicked", thB);
                    ((com.garmin.feature.garminpay.providers.gpay.snowball.ui.a) rVar2.getView()).hideProgressOverlay();
                    r.g0(rVar2, thB);
                }
                return Unit.INSTANCE;
                k kVar3 = (k) rVar.f0();
                fo2.q qVar = fo2.q.RESTORE;
                this.f139350e = null;
                this.f139346a = rVar;
                this.f139347b = sVar;
                this.f139348c = i14;
                this.f139349d = 2;
                if (kVar3.m(qVar, this) != aVar) {
                    sVar2 = sVar;
                    k kVar4 = (k) rVar.f0();
                    this.f139350e = null;
                    this.f139346a = null;
                    this.f139347b = null;
                    this.f139348c = i14;
                    this.f139349d = 3;
                }
                return aVar;
            } catch (Throwable th3) {
                int i19 = o13.q.f128596b;
                bVar = new o13.q.b(th3);
            }
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.feature.garminpay.providers.gpay.snowball.ui.SnowballAddCardPresenter$onEnteringDownloadCardView$1", f = "SnowballAddCardPresenter.kt", l = {ModuleDescriptor.MODULE_VERSION}, m = "invokeSuspend", v = 2)
    public static final class c extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f139353a;

        public c(t13.d<? super c> dVar) {
            super(2, dVar);
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return r.this.new c(dVar);
        }

        @Override // e23.p
        public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
            return ((c) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f139353a;
            r rVar = r.this;
            if (i14 == 0) {
                o13.r.b(obj);
                r.f139345c.debug("Observe download Card");
                ((k) rVar.f0()).g0();
                k kVar = (k) rVar.f0();
                this.f139353a = 1;
                obj = kVar.U(this);
                if (obj == aVar) {
                    return aVar;
                }
            } else {
                if (i14 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                o13.r.b(obj);
            }
            ((androidx.lifecycle.s0) obj).f(((com.garmin.feature.garminpay.providers.gpay.snowball.ui.a) rVar.getView()).getF52032a(), new g(new q(rVar, 5)));
            return Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.feature.garminpay.providers.gpay.snowball.ui.SnowballAddCardPresenter$onInitialChargePayClicked$1", f = "SnowballAddCardPresenter.kt", l = {111}, m = "invokeSuspend", v = 2)
    public static final class d extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f139355a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f139356b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ fo2.i f139358d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(fo2.i iVar, t13.d<? super d> dVar) {
            super(2, dVar);
            this.f139358d = iVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            d dVar2 = r.this.new d(this.f139358d, dVar);
            dVar2.f139356b = obj;
            return dVar2;
        }

        @Override // e23.p
        public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
            return ((d) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            Object bVar;
            fo2.c.b payload;
            String signedData;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f139355a;
            r rVar = r.this;
            try {
                if (i14 == 0) {
                    o13.r.b(obj);
                    vq2.e eVar = (vq2.e) rVar.getView();
                    int i15 = vq2.e.f179461z0;
                    eVar.S5(null, null);
                    fo2.i iVar = this.f139358d;
                    int i16 = o13.q.f128596b;
                    k kVar = (k) rVar.f0();
                    this.f139356b = null;
                    this.f139355a = 1;
                    obj = kVar.C(iVar, this);
                    if (obj == aVar) {
                        return aVar;
                    }
                } else {
                    if (i14 != 1) {
                        vb.h.z("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    o13.r.b(obj);
                }
                bVar = (fo2.a0) obj;
                int i17 = o13.q.f128596b;
            } catch (Throwable th3) {
                int i18 = o13.q.f128596b;
                bVar = new o13.q.b(th3);
            }
            if (!(bVar instanceof o13.q.b)) {
                fo2.a0 a0Var = (fo2.a0) bVar;
                r.f139345c.debug("Make purchase done.");
                aq2.j.f12491a.getClass();
                wr2.p.f186870a.getClass();
                if (wr2.p.b("dynamic_feature_app", "SHOULD_BYPASS_ALIPAY", false)) {
                    ((com.garmin.feature.garminpay.providers.gpay.snowball.ui.a) rVar.getView()).r3();
                } else {
                    com.garmin.feature.garminpay.providers.gpay.snowball.ui.a aVar2 = (com.garmin.feature.garminpay.providers.gpay.snowball.ui.a) rVar.getView();
                    fo2.c appToAppContext = a0Var.getAppToAppContext();
                    if (appToAppContext == null || (payload = appToAppContext.getPayload()) == null || (signedData = payload.getSignedData()) == null) {
                        p6.b.p(a0Var, "No appToAppContext in ");
                        return null;
                    }
                    aVar2.X2(signedData);
                }
            }
            Throwable thB = o13.q.b(bVar);
            if (thB != null) {
                r.g0(rVar, thB);
            }
            ((com.garmin.feature.garminpay.providers.gpay.snowball.ui.a) rVar.getView()).hideProgressOverlay();
            return Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.feature.garminpay.providers.gpay.snowball.ui.SnowballAddCardPresenter$onIntroductionNextClicked$1", f = "SnowballAddCardPresenter.kt", l = {85}, m = "invokeSuspend", v = 2)
    public static final class e extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public com.garmin.feature.garminpay.providers.gpay.snowball.ui.a f139359a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f139360b;

        public e(t13.d<? super e> dVar) {
            super(2, dVar);
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return r.this.new e(dVar);
        }

        @Override // e23.p
        public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
            return ((e) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            com.garmin.feature.garminpay.providers.gpay.snowball.ui.a aVar;
            u13.a aVar2 = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f139360b;
            r rVar = r.this;
            try {
                if (i14 == 0) {
                    o13.r.b(obj);
                    vq2.e eVar = (vq2.e) rVar.getView();
                    int i15 = vq2.e.f179461z0;
                    eVar.S5(null, null);
                    com.garmin.feature.garminpay.providers.gpay.snowball.ui.a aVar3 = (com.garmin.feature.garminpay.providers.gpay.snowball.ui.a) rVar.getView();
                    k kVar = (k) rVar.f0();
                    this.f139359a = aVar3;
                    this.f139360b = 1;
                    Object objV = kVar.v(this);
                    if (objV == aVar2) {
                        return aVar2;
                    }
                    aVar = aVar3;
                    obj = objV;
                } else {
                    if (i14 != 1) {
                        vb.h.z("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    aVar = this.f139359a;
                    o13.r.b(obj);
                }
                aVar.N2((String) obj);
            } catch (Throwable th3) {
                try {
                    r.f139345c.error("Failed to show T&C", th3);
                    r.g0(rVar, th3);
                } finally {
                    ((com.garmin.feature.garminpay.providers.gpay.snowball.ui.a) rVar.getView()).hideProgressOverlay();
                }
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.feature.garminpay.providers.gpay.snowball.ui.SnowballAddCardPresenter$onMVPReady$1", f = "SnowballAddCardPresenter.kt", l = {24, 35}, m = "invokeSuspend", v = 2)
    public static final class f extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f139362a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f139363b;

        public f(t13.d<? super f> dVar) {
            super(2, dVar);
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            f fVar = r.this.new f(dVar);
            fVar.f139363b = obj;
            return fVar;
        }

        @Override // e23.p
        public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
            return ((f) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code duplicated, block: B:39:0x00ac  */
        /* JADX WARN: Code duplicated, block: B:41:0x00b5  */
        /* JADX WARN: Code duplicated, block: B:42:0x00c9  */
        /* JADX WARN: Code duplicated, block: B:44:0x0102  */
        /* JADX WARN: Code duplicated, block: B:47:0x0117 A[LOOP:0: B:45:0x0111->B:47:0x0117, LOOP_END] */
        /* JADX WARN: Code duplicated, block: B:49:0x0138  */
        /* JADX WARN: Code duplicated, block: B:53:0x0142  */
        /* JADX WARN: Code restructure failed: missing block: B:31:0x0097, code lost:
        
            if (r15 == r1) goto L32;
         */
        @Override // v13.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            Object bVar;
            Object bVar2;
            Throwable thB;
            List<s> list;
            com.garmin.feature.garminpay.providers.gpay.snowball.ui.a aVar;
            String strD;
            String strL;
            fo2.x xVarC0;
            Iterator<T> it;
            double dA;
            o53.b0 b0Var = (o53.b0) this.f139363b;
            u13.a aVar2 = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f139362a;
            r rVar = r.this;
            try {
                try {
                    if (i14 == 0) {
                        o13.r.b(obj);
                        Logger logger = r.f139345c;
                        rVar.getClass();
                        vq2.e eVar = (vq2.e) rVar.getView();
                        int i15 = vq2.e.f179461z0;
                        eVar.S5(null, null);
                        int i16 = o13.q.f128596b;
                        k kVar = (k) rVar.f0();
                        this.f139363b = b0Var;
                        this.f139362a = 1;
                        if (kVar.r0(this) == aVar2) {
                        }
                        return aVar2;
                    }
                    if (i14 == 1) {
                        o13.r.b(obj);
                    } else {
                        if (i14 != 2) {
                            vb.h.z("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        o13.r.b(obj);
                    }
                    bVar = (List) obj;
                    int i17 = o13.q.f128596b;
                    if (!(bVar instanceof o13.q.b)) {
                        list = (List) bVar;
                        if (list.isEmpty()) {
                            aVar = (com.garmin.feature.garminpay.providers.gpay.snowball.ui.a) rVar.getView();
                            strD = ((k) rVar.f0()).d();
                            strL = ((k) rVar.f0()).l();
                            xVarC0 = ((k) rVar.f0()).c0();
                            it = ((k) rVar.f0()).s().iterator();
                            if (it.hasNext()) {
                                c22.t.g();
                                return null;
                            }
                            dA = ((fo2.i) it.next()).getTotalCredit().a();
                            while (it.hasNext()) {
                                dA = Math.min(dA, ((fo2.i) it.next()).getTotalCredit().a());
                            }
                            aVar.a7(strD, strL, xVarC0, dA, ((k) rVar.f0()).h());
                        } else {
                            ((com.garmin.feature.garminpay.providers.gpay.snowball.ui.a) rVar.getView()).J2(((k) rVar.f0()).d(), list);
                        }
                    }
                    thB = o13.q.b(bVar);
                    if (thB != null) {
                        r.g0(rVar, thB);
                    }
                    ((com.garmin.feature.garminpay.providers.gpay.snowball.ui.a) rVar.getView()).hideProgressOverlay();
                    return Unit.INSTANCE;
                    bVar2 = Unit.INSTANCE;
                    int i18 = o13.q.f128596b;
                } catch (Throwable th3) {
                    int i19 = o13.q.f128596b;
                    bVar2 = new o13.q.b(th3);
                }
                Throwable thB2 = o13.q.b(bVar2);
                if (thB2 != null) {
                    ((com.garmin.feature.garminpay.providers.gpay.snowball.ui.a) rVar.getView()).hideProgressOverlay();
                    r.g0(rVar, thB2);
                    return Unit.INSTANCE;
                }
                aq2.j.f12491a.getClass();
                wr2.p.f186870a.getClass();
                if (wr2.p.b("dynamic_feature_app", "SKIP_SHIFTED_OUT_CARDS_CHECK", false)) {
                    bVar = p13.j0.f134944a;
                } else {
                    k kVar2 = (k) rVar.f0();
                    this.f139363b = null;
                    this.f139362a = 2;
                    obj = kVar2.G0(this);
                }
                int i110 = o13.q.f128596b;
                if (!(bVar instanceof o13.q.b)) {
                    list = (List) bVar;
                    if (list.isEmpty()) {
                        ((com.garmin.feature.garminpay.providers.gpay.snowball.ui.a) rVar.getView()).J2(((k) rVar.f0()).d(), list);
                    } else {
                        aVar = (com.garmin.feature.garminpay.providers.gpay.snowball.ui.a) rVar.getView();
                        strD = ((k) rVar.f0()).d();
                        strL = ((k) rVar.f0()).l();
                        xVarC0 = ((k) rVar.f0()).c0();
                        it = ((k) rVar.f0()).s().iterator();
                        if (it.hasNext()) {
                            c22.t.g();
                            return null;
                        }
                        dA = ((fo2.i) it.next()).getTotalCredit().a();
                        while (it.hasNext()) {
                            dA = Math.min(dA, ((fo2.i) it.next()).getTotalCredit().a());
                        }
                        aVar.a7(strD, strL, xVarC0, dA, ((k) rVar.f0()).h());
                    }
                }
                thB = o13.q.b(bVar);
                if (thB != null) {
                    r.g0(rVar, thB);
                }
                ((com.garmin.feature.garminpay.providers.gpay.snowball.ui.a) rVar.getView()).hideProgressOverlay();
                return Unit.INSTANCE;
            } catch (Throwable th4) {
                int i24 = o13.q.f128596b;
                bVar = new o13.q.b(th4);
            }
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class g implements z0, p005kotlin.jvm.internal.n {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e23.l f139365a;

        public g(e23.l lVar) {
            lVar.getClass();
            this.f139365a = lVar;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof z0) && (obj instanceof p005kotlin.jvm.internal.n)) {
                return p005kotlin.jvm.internal.s.g(getFunctionDelegate(), ((p005kotlin.jvm.internal.n) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // p005kotlin.jvm.internal.n
        public final o13.h<?> getFunctionDelegate() {
            return this.f139365a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.lifecycle.z0
        public final /* synthetic */ void onChanged(Object obj) {
            this.f139365a.invoke(obj);
        }
    }

    static {
        new a(null);
        int i14 = gt2.c.f79010a;
        f139345c = gt2.b.f79005a.h("PAY#SB#AddCardPresenter");
    }

    public static final void g0(r rVar, Throwable th3) {
        rVar.getClass();
        f139345c.error("A general error happens", th3);
        if (th3 instanceof MaintenanceException) {
            ((com.garmin.feature.garminpay.providers.gpay.snowball.ui.a) rVar.getView()).c2(new q(rVar, 0));
        } else if (th3 instanceof ProviderErrorCodeException) {
            ((com.garmin.feature.garminpay.providers.gpay.snowball.ui.a) rVar.getView()).s5(((k) rVar.f0()).d(), ((ProviderErrorCodeException) th3).getErrorCode(), new q(rVar, 1));
        } else {
            ((com.garmin.feature.garminpay.providers.gpay.snowball.ui.a) rVar.getView()).s5(((k) rVar.f0()).d(), null, new q(rVar, 2));
        }
    }

    @Override // po2.l
    public final void B(String str) {
        str.getClass();
        ((k) f0()).b0(str);
        f139345c.debug("Phone number is " + str + ".");
        ((com.garmin.feature.garminpay.providers.gpay.snowball.ui.a) getView()).M5();
    }

    @Override // po2.l
    public final void C() {
        gl.b.I(((com.garmin.feature.garminpay.providers.gpay.snowball.ui.a) getView()).getF51231i(), null, new e(null), 3);
    }

    @Override // po2.l
    public final void H() {
        ((com.garmin.feature.garminpay.providers.gpay.snowball.ui.a) getView()).c();
    }

    @Override // po2.l
    public final void T() {
        ((com.garmin.feature.garminpay.providers.gpay.snowball.ui.a) getView()).P2(((k) f0()).d());
    }

    @Override // po2.l
    public final void V(s sVar) {
        gl.b.I(((com.garmin.feature.garminpay.providers.gpay.snowball.ui.a) getView()).getF51231i(), null, new b(sVar, null), 3);
    }

    @Override // po2.l
    public final void a() {
        gl.b.I(((com.garmin.feature.garminpay.providers.gpay.snowball.ui.a) getView()).getF51231i(), null, new c(null), 3);
    }

    @Override // sy2.d
    public final void a0() {
        gl.b.I(((com.garmin.feature.garminpay.providers.gpay.snowball.ui.a) getView()).getF51231i(), null, new f(null), 3);
    }

    @Override // po2.l
    public final void d(lo2.c cVar) {
        Logger logger = f139345c;
        cVar.getClass();
        try {
            logger.info("Alipay returns: " + cVar);
            cVar.a();
            ((com.garmin.feature.garminpay.providers.gpay.snowball.ui.a) getView()).r3();
        } catch (UserCancellationException e4) {
            logger.warn("User canceled the payment in onPayDone", (Throwable) e4);
            ((com.garmin.feature.garminpay.providers.gpay.snowball.ui.a) getView()).l7(new q(this, 3));
        } catch (Throwable th3) {
            logger.warn("Exception occurs in onPayDone", th3);
            ((com.garmin.feature.garminpay.providers.gpay.snowball.ui.a) getView()).s5(((k) f0()).d(), null, new q(this, 4));
        }
    }

    @Override // po2.l
    public final void f() {
        ((com.garmin.feature.garminpay.providers.gpay.snowball.ui.a) getView()).W7(((k) f0()).d(), ((k) f0()).l(), ((k) f0()).s(), ((k) f0()).H());
    }

    @Override // po2.l
    public final void s(fo2.i iVar) {
        iVar.getClass();
        gl.b.I(((com.garmin.feature.garminpay.providers.gpay.snowball.ui.a) getView()).getF51231i(), null, new d(iVar, null), 3);
    }

    @Override // po2.l
    public final void z() {
        ((com.garmin.feature.garminpay.providers.gpay.snowball.ui.a) getView()).c();
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lpo2/r$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "Lorg/slf4j/Logger;", "logger", "Lorg/slf4j/Logger;", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
