package ap2;

import androidx.lifecycle.v1;
import o53.b0;
import o53.s0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import zn2.z0;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.feature.garminpay.providers.gpay.ui.addcard.FitPayAddCardViewModel$initViewModel$1", f = "FitPayAddCardViewModel.kt", l = {146, 151}, m = "invokeSuspend", v = 2)
public final class q extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f11768a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ h f11769b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Long f11770c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ gp2.g f11771d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ String f11772e;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.feature.garminpay.providers.gpay.ui.addcard.FitPayAddCardViewModel$initViewModel$1$2", f = "FitPayAddCardViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class a extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ h f11773a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(h hVar, t13.d<? super a> dVar) {
            super(2, dVar);
            this.f11773a = hVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new a(this.f11773a, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            o13.r.b(obj);
            h.a aVar2 = h.f11695y;
            h hVar = this.f11773a;
            hVar.getClass();
            h.a.a(h.f11695y).debug("registerListeners");
            hVar.f11706j.g(hVar.f11717w);
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(h hVar, Long l14, gp2.g gVar, String str, t13.d<? super q> dVar) {
        super(2, dVar);
        this.f11769b = hVar;
        this.f11770c = l14;
        this.f11771d = gVar;
        this.f11772e = str;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new q(this.f11769b, this.f11770c, this.f11771d, this.f11772e, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((q) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:22:0x006e  */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00c2, code lost:
    
        if (ap2.h.B4(r5, r8) == r0) goto L40;
     */
    @Override // v13.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        ms2.d dVarG;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f11768a;
        h hVar = this.f11769b;
        try {
            if (i14 != 0) {
                if (i14 == 1) {
                    o13.r.b(obj);
                } else {
                    if (i14 != 2) {
                        vb.h.z("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    o13.r.b(obj);
                }
                hVar.f11705i.j(Boolean.TRUE);
                return Unit.INSTANCE;
            }
            o13.r.b(obj);
            h.a.a(h.f11695y).debug("initViewModel");
            hVar.getClass();
            hVar.f11700d.set(this.f11771d);
            hVar.f11701e.set(this.f11772e);
            hVar.f11718x.set(Boolean.FALSE);
            ps2.w wVar = ps2.w.f140538a;
            is2.b bVar = is2.b.FITPAY;
            ms2.g gVarA = wVar.a(bVar);
            gVarA.getClass();
            hVar.f11697a = (z0) gVarA;
            Long l14 = this.f11770c;
            if (l14 != null) {
                ps2.n nVarI = ps2.w.i(l14.longValue());
                if (nVarI != null) {
                    dVarG = nVarI.g(bVar);
                    if (!(dVarG instanceof zn2.t)) {
                        dVarG = null;
                    }
                } else {
                    dVarG = null;
                }
                zn2.t tVar = (zn2.t) dVarG;
                fo2.s sVar = tVar != null ? tVar.f205819e.f205629a : null;
                hVar.f11703g = sVar;
                hVar.f11704h = sVar != null ? sVar.f73101a : null;
            }
            t13.g gVar = v1.a(hVar).f183565a;
            x53.c cVar = s0.f129406a;
            t13.g gVarPlus = gVar.plus(u53.o.f168762a);
            a aVar2 = new a(hVar, null);
            this.f11768a = 1;
            if (ge1.b.e0(gVarPlus, aVar2, this) == aVar) {
            }
            return aVar;
            h.a aVar3 = h.f11695y;
            hVar.getClass();
            h.a.a(h.f11695y).debug("registerForStreamEvents");
            String str = hVar.f11704h;
            if (str != null) {
                hVar.E4().f205982d.i(str, hVar);
            }
            this.f11768a = 2;
        } catch (Exception e4) {
            h.a.a(h.f11695y).error("initViewModel: ", (Throwable) e4);
            hVar.f11705i.j(Boolean.FALSE);
        }
    }
}
