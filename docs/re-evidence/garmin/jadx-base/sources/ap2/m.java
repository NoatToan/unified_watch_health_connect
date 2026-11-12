package ap2;

import ds.e0;
import o53.b0;
import o53.j0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.r0;
import zn2.g1;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.feature.garminpay.providers.gpay.ui.addcard.FitPayAddCardViewModel$createCreditCard$4", f = "FitPayAddCardViewModel.kt", l = {456, 469, 476}, m = "invokeSuspend", v = 2)
public final class m extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public r0 f11738a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f11739b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f11740c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ h f11741d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ io2.a f11742e;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)Ljava/lang/Object;"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.feature.garminpay.providers.gpay.ui.addcard.FitPayAddCardViewModel$createCreditCard$4$creditCardResp$1", f = "FitPayAddCardViewModel.kt", l = {450}, m = "invokeSuspend", v = 2)
    public static final class a extends v13.i implements e23.p<b0, t13.d<? super Object>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f11743a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ h f11744b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ io2.a f11745c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ r0<Exception> f11746d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(h hVar, io2.a aVar, r0<Exception> r0Var, t13.d<? super a> dVar) {
            super(2, dVar);
            this.f11744b = hVar;
            this.f11745c = aVar;
            this.f11746d = r0Var;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new a(this.f11744b, this.f11745c, this.f11746d, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Object> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Type inference failed for: r5v1, types: [T, java.lang.Exception, java.lang.Throwable] */
        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f11743a;
            try {
                if (i14 != 0) {
                    if (i14 == 1) {
                        o13.r.b(obj);
                        return obj;
                    }
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                o13.r.b(obj);
                g1 g1Var = this.f11744b.E4().f205979a;
                io2.a aVar2 = this.f11745c;
                ep2.l lVar = ep2.l.SE;
                this.f11743a = 1;
                Object objL = g1Var.l(aVar2, lVar, this);
                return objL == aVar ? aVar : objL;
            } catch (Exception e4) {
                e0.v("createCreditCard(DPP) - credit card exception: ", e4.getLocalizedMessage(), h.a.a(h.f11695y));
                this.f11746d.f105810a = e4;
                return null;
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(h hVar, io2.a aVar, t13.d<? super m> dVar) {
        super(2, dVar);
        this.f11741d = hVar;
        this.f11742e = aVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        m mVar = new m(this.f11741d, this.f11742e, dVar);
        mVar.f11740c = obj;
        return mVar;
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((m) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:29:0x00a1  */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00ab, code lost:
    
        if (ap2.h.y4(r6, r11) == r1) goto L31;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // v13.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        r0 r0Var;
        Exception exc;
        b0 b0Var = (b0) this.f11740c;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f11739b;
        h hVar = this.f11741d;
        if (i14 == 0) {
            o13.r.b(obj);
            h.a.a(h.f11695y).debug("createCreditCard(DPP)");
            r0 r0Var2 = new r0();
            j0 j0VarJ = ge1.b.j(b0Var, null, null, new a(hVar, this.f11742e, r0Var2, null), 3);
            this.f11740c = null;
            this.f11738a = r0Var2;
            this.f11739b = 1;
            Object objC = j0VarJ.C(this);
            if (objC != aVar) {
                r0Var = r0Var2;
                obj = objC;
            }
            return aVar;
        }
        if (i14 == 1) {
            r0Var = this.f11738a;
            o13.r.b(obj);
        } else if (i14 == 2) {
            r0Var = this.f11738a;
            o13.r.b(obj);
            exc = (Exception) r0Var.f105810a;
            if (exc != null) {
                this.f11740c = null;
                this.f11738a = null;
                this.f11739b = 3;
            }
        } else {
            if (i14 != 3) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(obj);
        }
        return Unit.INSTANCE;
        if (obj != null) {
            yo2.b bVar = (yo2.b) obj;
            hVar.f11707k.set(bVar);
            if (p005kotlin.jvm.internal.s.g(bVar.getCardState(), "NEW")) {
                String link = bVar.getCreditCardLink().getLink();
                if (link == null) {
                    h.a.a(h.f11695y).error("createCreditCard(DPP): missing creditCard link from the card");
                    return Unit.INSTANCE;
                }
                this.f11740c = null;
                this.f11738a = r0Var;
                this.f11739b = 2;
                if (hVar.H4(link) != aVar) {
                }
                return aVar;
            }
            h.A4(hVar, bVar);
            Unit unit = Unit.INSTANCE;
        }
        exc = (Exception) r0Var.f105810a;
        if (exc != null) {
            this.f11740c = null;
            this.f11738a = null;
            this.f11739b = 3;
        }
        return Unit.INSTANCE;
    }
}
