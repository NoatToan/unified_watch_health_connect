package qr;

import com.garmin.android.apps.connectmobile.R;
import java.util.List;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.activity.details.presentation.ActivityDetailsViewModel$initMainDetailsCollector$1", f = "ActivityDetailsViewModel.kt", l = {2161}, m = "invokeSuspend", v = 2)
public final class t5 extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f146738a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ t f146739b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ am.x0 f146740c;

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0001\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\n\u001a\u00020\tH\n¢\u0006\u0004\b\f\u0010\r"}, d2 = {"Ljr/d;", "configuration", "Lnr/a;", "basicData", "Li53/c;", "Lc80/a;", "v2UsedGear", "Lnr/v;", "deviceInfo", "Lps/p;", "splits", "Lnr/t$f;", "<anonymous>", "(Ljr/d;Lnr/a;Li53/c;Lnr/v;Lps/p;)Lnr/t$f;"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.activity.details.presentation.ActivityDetailsViewModel$initMainDetailsCollector$1$1", f = "ActivityDetailsViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class a extends v13.i implements e23.t<jr.d, nr.a, i53.c<? extends c80.a>, nr.v, ps.p, t13.d<? super nr.t.f>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public /* synthetic */ jr.d f146741a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public /* synthetic */ nr.a f146742b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public /* synthetic */ i53.c f146743c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public /* synthetic */ nr.v f146744d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public /* synthetic */ ps.p f146745e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ t f146746f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final /* synthetic */ am.x0 f146747g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(t tVar, am.x0 x0Var, t13.d<? super a> dVar) {
            super(6, dVar);
            this.f146746f = tVar;
            this.f146747g = x0Var;
        }

        @Override // e23.t
        public final Object invoke(jr.d dVar, nr.a aVar, i53.c<? extends c80.a> cVar, nr.v vVar, ps.p pVar, t13.d<? super nr.t.f> dVar2) {
            a aVar2 = new a(this.f146746f, this.f146747g, dVar2);
            aVar2.f146741a = dVar;
            aVar2.f146742b = aVar;
            aVar2.f146743c = cVar;
            aVar2.f146744d = vVar;
            aVar2.f146745e = pVar;
            return aVar2.invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code duplicated, block: B:109:0x01c3  */
        /* JADX WARN: Code duplicated, block: B:154:0x0268  */
        /* JADX WARN: Code duplicated, block: B:176:0x02a4  */
        /* JADX WARN: Code duplicated, block: B:178:0x02a8  */
        /* JADX WARN: Code duplicated, block: B:191:0x02d0  */
        /* JADX WARN: Code duplicated, block: B:204:0x02f8  */
        /* JADX WARN: Code duplicated, block: B:38:0x008d  */
        /* JADX WARN: Code duplicated, block: B:85:0x0155  */
        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            am.x0 x0VarH;
            boolean z14;
            List<nr.k> listA;
            ps.n1 n1VarA;
            boolean z15;
            boolean z16;
            boolean z17;
            boolean z18;
            boolean z19;
            ps.a1 metadataDTO;
            boolean z24;
            boolean z25;
            boolean z26;
            Long activityId;
            am.x0 x0VarH2;
            ps.a1 metadataDTO2;
            ps.a1 metadataDTO3;
            String sessionResultType;
            r80.b bVarB;
            r80.b bVarB2;
            nr.o oVar;
            jr.d dVar = this.f146741a;
            nr.a aVar = this.f146742b;
            i53.c cVar = this.f146743c;
            nr.v vVar = this.f146744d;
            ps.p pVar = this.f146745e;
            u13.a aVar2 = u13.a.COROUTINE_SUSPENDED;
            o13.r.b(obj);
            ps.r rVar = (aVar == null || (oVar = aVar.f126975b) == null) ? null : oVar.f127269a;
            if (rVar == null || (x0VarH = rVar.h()) == null) {
                x0VarH = am.x0.f4346x;
            }
            boolean z27 = !cVar.isEmpty();
            ps.a1 metadataDTO4 = rVar != null ? rVar.getMetadataDTO() : null;
            mr.s0 s0Var = new mr.s0(x0VarH, dVar);
            int i14 = t.A2;
            t tVar = this.f146746f;
            r53.z1<ps.s0> z1VarK5 = tVar.k5();
            sr.b bVar = tVar.f146541n;
            ps.s0 value = z1VarK5.getValue();
            boolean z28 = (vVar == null || (bVarB2 = vVar.b()) == null || !bVarB2.f()) ? false : true;
            if (metadataDTO4 != null ? p005kotlin.jvm.internal.s.g(metadataDTO4.getIsManualActivity(), Boolean.TRUE) : false) {
                z14 = true;
            } else {
                if ((vVar == null || (bVarB = vVar.b()) == null || bVarB.f()) ? false : true) {
                    z14 = true;
                } else {
                    z14 = false;
                }
            }
            mr.r0 r0Var = new mr.r0(null, rVar, value, z27, z28, Boolean.valueOf(z14), pVar, 1, null);
            mr.d dVar2 = s0Var.f120305b.f120240b;
            if (dVar2 == null || (listA = dVar2.a(mr.r0.a(r0Var, s0Var.f120304a, 126))) == null) {
                listA = p13.j0.f134944a;
            }
            List<nr.k> list = listA;
            am.x0 x0Var = this.f146747g;
            String str = x0Var.f4358a;
            am.z0 z0Var = am.z0.f4390a;
            am.x0 x0Var2 = am.x0.D;
            boolean zB = am.z0.b(x0Var2, str);
            is.k.f94878a.getClass();
            if (rVar == null || (metadataDTO3 = rVar.getMetadataDTO()) == null || (sessionResultType = metadataDTO3.getSessionResultType()) == null) {
                n1VarA = null;
            } else {
                ps.n1.f139945b.getClass();
                n1VarA = ps.n1.a.a(sessionResultType);
            }
            if (n1VarA == ps.n1.EXCLUDED) {
                z15 = false;
            } else {
                if ((rVar == null || (metadataDTO2 = rVar.getMetadataDTO()) == null) ? false : p005kotlin.jvm.internal.s.g(metadataDTO2.getIsManualActivity(), Boolean.TRUE)) {
                    z15 = false;
                } else {
                    if (rVar != null ? p005kotlin.jvm.internal.s.g(rVar.getIsMultiSportParent(), Boolean.TRUE) : false) {
                        z15 = false;
                    } else {
                        if ((rVar != null ? rVar.getParentId() : null) != null) {
                            z15 = false;
                        } else {
                            if (!am.z0.R((rVar == null || (x0VarH2 = rVar.h()) == null) ? null : x0VarH2.f4358a) && oe2.f.J(rVar) && bo1.a.a().c().H0()) {
                                bv.b.f21239a.getClass();
                                bv.b.a();
                                if (com.garmin.android.apps.connectmobile.k1.f37122a.D()) {
                                    z15 = true;
                                } else {
                                    z15 = false;
                                }
                            } else {
                                z15 = false;
                            }
                        }
                    }
                }
            }
            long jLongValue = (rVar == null || (activityId = rVar.getActivityId()) == null) ? -1L : activityId.longValue();
            if (rVar == null || !p005kotlin.jvm.internal.s.g(rVar.getIsMultiSportParent(), Boolean.FALSE)) {
                z16 = false;
            } else {
                ps.a1 metadataDTO5 = rVar.getMetadataDTO();
                if (!(metadataDTO5 != null ? p005kotlin.jvm.internal.s.g(metadataDTO5.getHasPolyline(), Boolean.TRUE) : false)) {
                    z16 = false;
                } else if (am.z0.b(am.x0.f4317p1, rVar.h().f4358a)) {
                    z16 = false;
                } else if (am.z0.b(am.x0.O1, rVar.h().f4358a) || am.z0.b(x0Var2, rVar.h().f4358a) || am.z0.R(rVar.h().f4358a)) {
                    z16 = false;
                } else {
                    z16 = true;
                }
            }
            boolean z29 = (rVar != null ? rVar.getParentId() : null) != null;
            bVar.getClass();
            String strO = bVar.o(Integer.valueOf(z29 ? R.string.multisport_edit_leg_title : R.string.title_edit_activity));
            boolean z34 = rVar != null && oe2.f.G(rVar);
            bVar.getClass();
            String strO2 = bVar.o(Integer.valueOf(z34 ? R.string.activity_unfavorite_icon_title : R.string.activity_favorite_icon_title));
            boolean z35 = tVar.X1.d() && oe2.f.J(rVar) && !list.isEmpty() && !zB;
            boolean zJ = oe2.f.J(rVar);
            if (((am.d) KoinJavaComponent.get(am.d.class)).J() && oe2.f.L(rVar)) {
                z19 = true;
            } else {
                nr.o oVar2 = aVar != null ? aVar.f126975b : null;
                ps.r rVar2 = oVar2 != null ? oVar2.f127269a : null;
                if (bo1.a.a().c().H0()) {
                    bv.b.f21239a.getClass();
                    bv.b.a();
                    if (com.garmin.android.apps.connectmobile.k1.f37122a.D()) {
                        z17 = true;
                    } else {
                        z17 = false;
                    }
                } else {
                    z17 = false;
                }
                if ((rVar2 != null ? rVar2.getParentId() : null) != null) {
                    z18 = false;
                } else {
                    if (!(rVar2 != null ? p005kotlin.jvm.internal.s.g(rVar2.getIsMultiSportParent(), Boolean.TRUE) : false) && oe2.f.J(rVar2) && z17) {
                        if ((rVar2 == null || (metadataDTO = rVar2.getMetadataDTO()) == null || !metadataDTO.E0()) ? false : true) {
                            z18 = true;
                        } else {
                            z18 = false;
                        }
                    } else {
                        z18 = false;
                    }
                }
                if (z18) {
                    z19 = true;
                } else {
                    z19 = false;
                }
            }
            switch (am.s1.a.f4192a[x0Var.ordinal()]) {
                case 5:
                case 6:
                case 7:
                case 8:
                case 9:
                    z24 = true;
                    break;
                default:
                    z24 = false;
                    break;
            }
            if (oe2.f.J(rVar)) {
                if ((rVar != null ? rVar.getParentId() : null) == null) {
                    z25 = true;
                } else {
                    z25 = false;
                }
            } else {
                z25 = false;
            }
            Boolean isManualActivity = metadataDTO4 != null ? metadataDTO4.getIsManualActivity() : null;
            boolean zC0 = metadataDTO4 != null ? metadataDTO4.C0() : false;
            if (z15) {
                if (metadataDTO4 != null ? metadataDTO4.E0() : false) {
                    z26 = false;
                } else {
                    z26 = true;
                }
            } else {
                z26 = false;
            }
            l22.a aVar3 = bVar.f160541b;
            c22.x0.f23314a.getClass();
            c22.g2 g2VarB = c22.g2.b(c22.x0.f23562od);
            aVar3.getClass();
            return new nr.t.f(jLongValue, this.f146747g, list, z16, z35, zJ, z19, strO2, strO, dh.b.A(aVar3.f109162a, g2VarB), z24, false, z25, isManualActivity, zC0, zB, z26, 2048, null);
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lr53/j;", "Lnr/t$f;", "", "exception", "", "<anonymous>", "(Lr53/j;Ljava/lang/Throwable;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.activity.details.presentation.ActivityDetailsViewModel$initMainDetailsCollector$1$2", f = "ActivityDetailsViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class b extends v13.i implements e23.q<r53.j<? super nr.t.f>, Throwable, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public /* synthetic */ r53.j f146748a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public /* synthetic */ Throwable f146749b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ t f146750c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(t tVar, t13.d<? super b> dVar) {
            super(3, dVar);
            this.f146750c = tVar;
        }

        @Override // e23.q
        public final Object invoke(r53.j<? super nr.t.f> jVar, Throwable th3, t13.d<? super Unit> dVar) {
            b bVar = new b(this.f146750c, dVar);
            bVar.f146748a = jVar;
            bVar.f146749b = th3;
            return bVar.invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            Throwable th3 = this.f146749b;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            o13.r.b(obj);
            com.garmin.android.apps.connectmobile.a2 a2Var = com.garmin.android.apps.connectmobile.a2.ACTIVITIES;
            String strN = fb1.c.n("MainDetailsState ", th3.getMessage());
            com.garmin.android.apps.connectmobile.i2.f36769a.getClass();
            com.garmin.android.apps.connectmobile.i2.a.f(a2Var, "ActivityDetailsViewModel", strN);
            this.f146750c.L1.k(null, new nr.i(null, false, true, null, 11, null));
            return Unit.INSTANCE;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class c<T> implements r53.j {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ t f146751a;

        public c(t tVar) {
            this.f146751a = tVar;
        }

        @Override // r53.j
        public final Object emit(Object obj, t13.d dVar) {
            this.f146751a.J0.setValue((nr.t.f) obj);
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t5(t tVar, am.x0 x0Var, t13.d<? super t5> dVar) {
        super(2, dVar);
        this.f146739b = tVar;
        this.f146740c = x0Var;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new t5(this.f146739b, this.f146740c, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((t5) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f146738a;
        if (i14 == 0) {
            o13.r.b(obj);
            t tVar = this.f146739b;
            r53.w wVar = new r53.w(r53.s.n(tVar.F, tVar.L4(), tVar.f146562u2.f25296b, tVar.h5(), tVar.U4(), new a(tVar, this.f146740c, null)), new b(tVar, null));
            c cVar = new c(tVar);
            this.f146738a = 1;
            if (wVar.collect(cVar, this) == aVar) {
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
