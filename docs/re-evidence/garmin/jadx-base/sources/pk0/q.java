package pk0;

import c80.u;
import com.garmin.android.apps.connectmobile.R;
import gl1.y;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p3.l0;
import p3.o0;
import p3.p0;
import p3.p2;
import p3.x1;

/* JADX INFO: loaded from: classes8.dex */
public final class q {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.gear.presentation.brand.ModelSelectionScreenKt$ModelSelectionScreen$1$1", f = "ModelSelectionScreen.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class a extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e23.l<String, Unit> f138265a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(e23.l<? super String, Unit> lVar, t13.d<? super a> dVar) {
            super(2, dVar);
            this.f138265a = lVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new a(this.f138265a, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            o13.r.b(obj);
            this.f138265a.invoke("");
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Code duplicated, block: B:48:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:59:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:79:0x0148  */
    /* JADX WARN: Code duplicated, block: B:87:0x0169  */
    public static final void a(final u uVar, final String str, final o oVar, final String str2, final e23.a<Unit> aVar, final e23.l<? super String, Unit> lVar, final e23.l<? super String, Unit> lVar2, p3.m mVar, final int i14) {
        u uVar2;
        p2 p2VarI0;
        e23.p<? super p3.m, ? super Integer, Unit> pVar;
        boolean z14;
        uVar.getClass();
        str.getClass();
        oVar.getClass();
        aVar.getClass();
        lVar.getClass();
        lVar2.getClass();
        o0 o0VarE = mVar.E(-1934842190);
        int i15 = i14 | (o0VarE.k(uVar.ordinal()) ? 4 : 2) | (o0VarE.B(str) ? 32 : 16) | (o0VarE.B(oVar) ? 256 : 128) | (o0VarE.B(str2) ? 2048 : 1024) | (o0VarE.r(aVar) ? 16384 : 8192) | (o0VarE.r(lVar) ? 131072 : 65536) | (o0VarE.r(lVar2) ? 1048576 : 524288);
        if (o0VarE.n(i15 & 1, (599187 & i15) != 599186)) {
            x1 x1Var = p3.n.f135158a;
            int i16 = i15 & 14;
            boolean z15 = ((i15 & 112) == 32) | (i16 == 4);
            Object objQ = o0VarE.q();
            p3.m.a aVar2 = p3.m.f135153a;
            if (z15) {
                objQ = oVar.R(str, uVar);
                o0VarE.K(objQ);
            } else {
                aVar2.getClass();
                if (objQ == p3.m.a.f135155b) {
                    objQ = oVar.R(str, uVar);
                    o0VarE.K(objQ);
                }
            }
            i53.c cVar = (i53.c) objQ;
            if (cVar.isEmpty()) {
                o0VarE.C(1872792113);
                boolean z16 = (i15 & 3670016) == 1048576;
                Object objQ2 = o0VarE.q();
                if (z16) {
                    objQ2 = new a(lVar2, null);
                    o0VarE.K(objQ2);
                } else {
                    aVar2.getClass();
                    if (objQ2 == p3.m.a.f135155b) {
                        objQ2 = new a(lVar2, null);
                        o0VarE.K(objQ2);
                    }
                }
                l0.e((e23.p) objQ2, cVar, o0VarE);
                o0VarE.g0(false);
                p2VarI0 = o0VarE.i0();
                if (p2VarI0 == null) {
                    return;
                }
                final int i17 = 0;
                pVar = new e23.p(uVar, str, oVar, str2, aVar, lVar, lVar2, i14, i17) { // from class: pk0.p

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public final /* synthetic */ int f138257a;

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ u f138258b;

                    /* JADX INFO: renamed from: c, reason: collision with root package name */
                    public final /* synthetic */ String f138259c;

                    /* JADX INFO: renamed from: d, reason: collision with root package name */
                    public final /* synthetic */ o f138260d;

                    /* JADX INFO: renamed from: e, reason: collision with root package name */
                    public final /* synthetic */ String f138261e;

                    /* JADX INFO: renamed from: f, reason: collision with root package name */
                    public final /* synthetic */ e23.a f138262f;

                    /* JADX INFO: renamed from: g, reason: collision with root package name */
                    public final /* synthetic */ e23.l f138263g;

                    /* JADX INFO: renamed from: h, reason: collision with root package name */
                    public final /* synthetic */ e23.l f138264h;

                    {
                        this.f138257a = i17;
                    }

                    @Override // e23.p
                    public final Object invoke(Object obj, Object obj2) {
                        switch (this.f138257a) {
                            case 0:
                                ((Integer) obj2).getClass();
                                int iT = p0.t(1);
                                q.a(this.f138258b, this.f138259c, this.f138260d, this.f138261e, this.f138262f, this.f138263g, this.f138264h, (p3.m) obj, iT);
                                break;
                            default:
                                ((Integer) obj2).getClass();
                                int iT2 = p0.t(1);
                                q.a(this.f138258b, this.f138259c, this.f138260d, this.f138261e, this.f138262f, this.f138263g, this.f138264h, (p3.m) obj, iT2);
                                break;
                        }
                        return Unit.INSTANCE;
                    }
                };
            } else {
                uVar2 = uVar;
                o0VarE.C(1872883408);
                o0VarE.g0(false);
                String strP = y.P(R.string.select_placeholder_model, new Object[]{str}, o0VarE);
                String strP2 = y.P(R.string.search_placeholder_models, new Object[]{str}, o0VarE);
                boolean z17 = (i16 == 4) | ((i15 & 3670016) == 1048576);
                Object objQ3 = o0VarE.q();
                if (z17) {
                    z14 = true;
                    objQ3 = new h(uVar2, lVar2, 1);
                    o0VarE.K(objQ3);
                } else {
                    aVar2.getClass();
                    if (objQ3 == p3.m.a.f135155b) {
                        z14 = true;
                        objQ3 = new h(uVar2, lVar2, 1);
                        o0VarE.K(objQ3);
                    } else {
                        z14 = true;
                    }
                }
                e23.p pVar2 = (e23.p) objQ3;
                boolean z18 = (i15 & 458752) == 131072 ? z14 : false;
                Object objQ4 = o0VarE.q();
                if (z18) {
                    objQ4 = new na0.l(lVar, 24);
                    o0VarE.K(objQ4);
                } else {
                    aVar2.getClass();
                    if (objQ4 == p3.m.a.f135155b) {
                        objQ4 = new na0.l(lVar, 24);
                        o0VarE.K(objQ4);
                    }
                }
                n.a(strP, strP2, cVar, str2, pVar2, aVar, (e23.l) objQ4, o0VarE, (i15 & 7168) | ((i15 << 3) & 458752));
            }
            p2VarI0.f135219d = pVar;
        }
        uVar2 = uVar;
        o0VarE.e();
        p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            final int i18 = 1;
            final u uVar3 = uVar2;
            pVar = new e23.p(uVar3, str, oVar, str2, aVar, lVar, lVar2, i14, i18) { // from class: pk0.p

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final /* synthetic */ int f138257a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ u f138258b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final /* synthetic */ String f138259c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                public final /* synthetic */ o f138260d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                public final /* synthetic */ String f138261e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                public final /* synthetic */ e23.a f138262f;

                /* JADX INFO: renamed from: g, reason: collision with root package name */
                public final /* synthetic */ e23.l f138263g;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                public final /* synthetic */ e23.l f138264h;

                {
                    this.f138257a = i18;
                }

                @Override // e23.p
                public final Object invoke(Object obj, Object obj2) {
                    switch (this.f138257a) {
                        case 0:
                            ((Integer) obj2).getClass();
                            int iT = p0.t(1);
                            q.a(this.f138258b, this.f138259c, this.f138260d, this.f138261e, this.f138262f, this.f138263g, this.f138264h, (p3.m) obj, iT);
                            break;
                        default:
                            ((Integer) obj2).getClass();
                            int iT2 = p0.t(1);
                            q.a(this.f138258b, this.f138259c, this.f138260d, this.f138261e, this.f138262f, this.f138263g, this.f138264h, (p3.m) obj, iT2);
                            break;
                    }
                    return Unit.INSTANCE;
                }
            };
            p2VarI0.f135219d = pVar;
        }
    }
}
