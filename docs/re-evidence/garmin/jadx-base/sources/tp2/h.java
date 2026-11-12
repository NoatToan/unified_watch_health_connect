package tp2;

import e23.p;
import fo2.s;
import o13.r;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import ps2.n;
import ps2.w;
import zn2.g1;
import zn2.t;
import zn2.z0;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.feature.garminpay.providers.gpay.ui.managecard.FitPayCardDetailsViewModel$initViewModel$1", f = "FitPayCardDetailsViewModel.kt", l = {83, 85, 87}, m = "invokeSuspend", v = 2)
public final class h extends v13.i implements p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public g f165969a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f165970b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f165971c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public g f165972d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f165973e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f165974f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ g f165975g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ long f165976h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ String f165977i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(g gVar, long j8, String str, t13.d<? super h> dVar) {
        super(2, dVar);
        this.f165975g = gVar;
        this.f165976h = j8;
        this.f165977i = str;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new h(this.f165975g, this.f165976h, this.f165977i, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((h) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0078  */
    /* JADX WARN: Code duplicated, block: B:45:0x00ff A[Catch: Exception -> 0x0021, TryCatch #0 {Exception -> 0x0021, blocks: (B:8:0x001c, B:43:0x00fb, B:45:0x00ff, B:46:0x0101, B:15:0x0037, B:38:0x00d4, B:39:0x00de, B:18:0x004a, B:33:0x00b1, B:21:0x0062, B:23:0x006f, B:27:0x0079, B:29:0x0095, B:34:0x00bc), top: B:51:0x000a }] */
    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        ms2.d dVarG;
        g1 g1Var;
        g gVar;
        g gVar2;
        int i14;
        g gVar3;
        g gVar4;
        g gVar5;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = this.f165974f;
        g gVar6 = this.f165975g;
        try {
            if (i15 != 0) {
                if (i15 == 1) {
                    i14 = this.f165973e;
                    gVar3 = this.f165972d;
                    g1Var = (g1) this.f165971c;
                    gVar2 = this.f165969a;
                    r.b(obj);
                    yo2.b bVar = (yo2.b) obj;
                    gVar3.getClass();
                    bVar.getClass();
                    gVar3.f165964e = bVar;
                } else if (i15 == 2) {
                    i14 = this.f165973e;
                    gVar = (g) this.f165971c;
                    g1Var = (g1) this.f165970b;
                    gVar2 = this.f165969a;
                    r.b(obj);
                    yo2.b bVar2 = (yo2.b) obj;
                    gVar.getClass();
                    bVar2.getClass();
                    gVar.f165964e = bVar2;
                } else {
                    if (i15 != 3) {
                        vb.h.z("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    gVar4 = (g) this.f165971c;
                    gVar5 = this.f165969a;
                    r.b(obj);
                }
                vp2.d dVar = (vp2.d) obj;
                gVar4.f165966g = dVar != null ? dVar.f179419b : null;
                gVar5.f165967h = g.x4(gVar5, gVar5.y4());
                gVar5.f165960a.j(Boolean.TRUE);
                return Unit.INSTANCE;
            }
            r.b(obj);
            g.f165959j.debug("initViewModel");
            long j8 = this.f165976h;
            new Long(j8);
            gVar6.getClass();
            w wVar = w.f140538a;
            is2.b bVar3 = is2.b.FITPAY;
            wVar.getClass();
            n nVarI = w.i(j8);
            if (nVarI != null) {
                dVarG = nVarI.g(bVar3);
                if (!(dVarG instanceof t)) {
                    dVarG = null;
                }
            } else {
                dVarG = null;
            }
            gVar6.f165962c = (t) dVarG;
            ms2.g gVarA = wVar.a(bVar3);
            gVarA.getClass();
            gVar6.f165961b = (z0) gVarA;
            g1 g1Var2 = gVar6.z4().f205979a;
            String str = this.f165977i;
            t tVar = gVar6.f165962c;
            if (tVar != null) {
                s sVar = tVar.f205819e.f205629a;
                this.f165969a = gVar6;
                this.f165970b = str;
                this.f165971c = g1Var2;
                this.f165972d = gVar6;
                this.f165973e = 0;
                this.f165974f = 1;
                Object objA = g1Var2.A(str, sVar, true, this);
                if (objA != aVar) {
                    g1Var = g1Var2;
                    obj = objA;
                    gVar3 = gVar6;
                    gVar2 = gVar3;
                    i14 = 0;
                    yo2.b bVar4 = (yo2.b) obj;
                    gVar3.getClass();
                    bVar4.getClass();
                    gVar3.f165964e = bVar4;
                }
            } else {
                this.f165969a = gVar6;
                this.f165970b = g1Var2;
                this.f165971c = gVar6;
                this.f165972d = null;
                this.f165973e = 0;
                this.f165974f = 2;
                Object objB = g1Var2.B(str, this);
                if (objB != aVar) {
                    g1Var = g1Var2;
                    obj = objB;
                    gVar = gVar6;
                    gVar2 = gVar;
                    i14 = 0;
                    yo2.b bVar5 = (yo2.b) obj;
                    gVar.getClass();
                    bVar5.getClass();
                    gVar.f165964e = bVar5;
                }
            }
            return aVar;
            fo2.p transactionsLink = gVar2.y4().getTransactionsLink();
            this.f165969a = gVar2;
            this.f165970b = null;
            this.f165971c = gVar2;
            this.f165972d = null;
            this.f165973e = i14;
            this.f165974f = 3;
            obj = g1Var.v(transactionsLink, this);
            if (obj != aVar) {
                gVar4 = gVar2;
                gVar5 = gVar4;
                vp2.d dVar2 = (vp2.d) obj;
                gVar4.f165966g = dVar2 != null ? dVar2.f179419b : null;
                gVar5.f165967h = g.x4(gVar5, gVar5.y4());
                gVar5.f165960a.j(Boolean.TRUE);
                return Unit.INSTANCE;
            }
            return aVar;
        } catch (Exception e4) {
            g.f165959j.error("initViewModel: ", (Throwable) e4);
            gVar6.f165960a.j(Boolean.FALSE);
        }
    }
}
