package ta0;

import p005kotlin.Metadata;
import p005kotlin.Unit;
import p3.x1;
import r53.p2;

/* JADX INFO: loaded from: classes8.dex */
public final class x0 {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.device.setup.presentation.discovery.DeviceSelectionChecksKt$DeviceSelectionChecks$1$1$1", f = "DeviceSelectionChecks.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class a extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e23.l<l90.b, Unit> f163484a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ va0.b f163485b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ k0 f163486c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(e23.l<? super l90.b, Unit> lVar, va0.b bVar, k0 k0Var, t13.d<? super a> dVar) {
            super(2, dVar);
            this.f163484a = lVar;
            this.f163485b = bVar;
            this.f163486c = k0Var;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new a(this.f163484a, this.f163485b, this.f163486c, dVar);
        }

        @Override // e23.p
        public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            Object value;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            o13.r.b(obj);
            this.f163484a.invoke(((va0.b.a) this.f163485b).f176571a);
            p2 p2Var = this.f163486c.f163381c;
            do {
                value = p2Var.getValue();
            } while (!p2Var.b(value, null));
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Code duplicated, block: B:36:0x008d  */
    /* JADX WARN: Code duplicated, block: B:44:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:49:0x00e1  */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(k0 k0Var, e23.l<? super l90.b, Unit> lVar, p3.m mVar, int i14) {
        int i15;
        k0Var.getClass();
        lVar.getClass();
        p3.o0 o0VarE = mVar.E(-1010952060);
        if ((i14 & 6) == 0) {
            i15 = (o0VarE.r(k0Var) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= o0VarE.r(lVar) ? 32 : 16;
        }
        if (o0VarE.n(i15 & 1, (i15 & 19) != 18)) {
            x1 x1Var = p3.n.f135158a;
            va0.b bVar = (va0.b) s9.c.c(k0Var.f163382d, o0VarE).getF182175a();
            if (bVar == null) {
                o0VarE.C(-961879693);
                o0VarE.g0(false);
            } else {
                o0VarE.C(-961879692);
                boolean z14 = bVar instanceof va0.b.a;
                p3.m.a aVar = p3.m.f135153a;
                if (z14) {
                    o0VarE.C(1165556317);
                    Unit unit = Unit.INSTANCE;
                    boolean zB = o0VarE.B(bVar) | ((i15 & 112) == 32) | o0VarE.r(k0Var);
                    Object objQ = o0VarE.q();
                    if (zB) {
                        objQ = new a(lVar, bVar, k0Var, null);
                        o0VarE.K(objQ);
                    } else {
                        aVar.getClass();
                        if (objQ == p3.m.a.f135155b) {
                            objQ = new a(lVar, bVar, k0Var, null);
                            o0VarE.K(objQ);
                        }
                    }
                    p3.l0.e((e23.p) objQ, unit, o0VarE);
                    o0VarE.g0(false);
                } else {
                    if (!(bVar instanceof va0.b.C3294b)) {
                        throw kg.f.h(o0VarE, -1902065802, false);
                    }
                    o0VarE.C(1165810455);
                    l90.f fVar = ((va0.b.C3294b) bVar).f176572a;
                    boolean zR = o0VarE.r(k0Var) | o0VarE.B(bVar);
                    Object objQ2 = o0VarE.q();
                    if (zR) {
                        objQ2 = new sy.i(9, k0Var, bVar);
                        o0VarE.K(objQ2);
                    } else {
                        aVar.getClass();
                        if (objQ2 == p3.m.a.f135155b) {
                            objQ2 = new sy.i(9, k0Var, bVar);
                            o0VarE.K(objQ2);
                        }
                    }
                    e23.l lVar2 = (e23.l) objQ2;
                    boolean zR2 = o0VarE.r(k0Var);
                    Object objQ3 = o0VarE.q();
                    if (zR2) {
                        objQ3 = new sg0.w0(k0Var, 17);
                        o0VarE.K(objQ3);
                    } else {
                        aVar.getClass();
                        if (objQ3 == p3.m.a.f135155b) {
                            objQ3 = new sg0.w0(k0Var, 17);
                            o0VarE.K(objQ3);
                        }
                    }
                    r0.a(fVar, lVar2, (e23.a) objQ3, o0VarE, 0);
                    o0VarE.g0(false);
                }
                o0VarE.g0(false);
            }
        } else {
            o0VarE.e();
        }
        p3.p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new sg0.m(k0Var, lVar, i14, 15);
        }
    }
}
