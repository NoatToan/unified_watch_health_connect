package com.garmin.android.apps.connectmobile.workouts.presentation.edit;

import com.garmin.android.apps.connectmobile.R;
import java.util.Iterator;
import lc.u0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p3.o0;
import p3.p2;
import p3.x1;
import w52.r0;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/garmin/android/apps/connectmobile/workouts/presentation/edit/i;", "Lr52/b;", "Lcom/garmin/android/apps/connectmobile/workouts/presentation/edit/q;", "Lcom/garmin/android/apps/connectmobile/workouts/presentation/edit/p;", "<init>", "()V", "gcm-workouts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class i implements r52.b<q, p> {

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class a extends p005kotlin.jvm.internal.q implements e23.a<Unit> {
        public a(Object obj) {
            super(0, obj, p.class, "addStep", "addStep()V", 0);
        }

        @Override // e23.a
        public final Unit invoke() {
            ((p) this.receiver).f1();
            return Unit.INSTANCE;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class b extends p005kotlin.jvm.internal.q implements e23.a<Unit> {
        public b(Object obj) {
            super(0, obj, p.class, "addRepeat", "addRepeat()V", 0);
        }

        @Override // e23.a
        public final Unit invoke() {
            ((p) this.receiver).A0();
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Code duplicated, block: B:73:0x012a  */
    /* JADX WARN: Code duplicated, block: B:93:0x0174  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // r52.b
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final void a(final p pVar, final q qVar, p3.m mVar, final int i14) {
        int i15;
        p pVar2;
        q qVar2;
        p2 p2VarI0;
        e23.p<? super p3.m, ? super Integer, Unit> pVar3;
        int i16;
        int i17;
        o13.p pVar4;
        int i18;
        pVar.getClass();
        qVar.getClass();
        m52.k kVar = qVar.f49245a;
        o0 o0VarE = mVar.E(-373061273);
        if ((i14 & 6) == 0) {
            i15 = i14 | ((i14 & 8) == 0 ? o0VarE.B(pVar) : o0VarE.r(pVar) ? 4 : 2);
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= o0VarE.r(qVar) ? 32 : 16;
        }
        boolean z14 = false;
        if (o0VarE.n(i15 & 1, (i15 & 19) != 18)) {
            x1 x1Var = p3.n.f135158a;
            if (qVar.f49269y) {
                p2VarI0 = o0VarE.i0();
                if (p2VarI0 == null) {
                    return;
                }
                final int i19 = 0;
                pVar3 = new e23.p(this) { // from class: f62.q

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ com.garmin.android.apps.connectmobile.workouts.presentation.edit.i f69305b;

                    {
                        this.f69305b = this;
                    }

                    @Override // e23.p
                    public final Object invoke(Object obj, Object obj2) {
                        int i24 = i19;
                        p3.m mVar2 = (p3.m) obj;
                        ((Integer) obj2).getClass();
                        switch (i24) {
                            case 0:
                                this.f69305b.a(pVar, qVar, mVar2, p3.p0.t(i14 | 1));
                                break;
                            default:
                                this.f69305b.a(pVar, qVar, mVar2, p3.p0.t(i14 | 1));
                                break;
                        }
                        return Unit.INSTANCE;
                    }
                };
            } else {
                pVar2 = pVar;
                qVar2 = qVar;
                l52.i<com.garmin.android.apps.connectmobile.workouts.data.model.j0> iVar = qVar2.f49250f;
                g gVar = qVar2.f49263s;
                k0.a aVar = qVar2.f49251g;
                iVar.getClass();
                kVar.getClass();
                gVar.getClass();
                aVar.getClass();
                int iD = l52.o.d(iVar);
                int i24 = kVar.f116775k;
                if (gVar instanceof g.b) {
                    i17 = iD;
                    i16 = i24;
                } else if (!(gVar instanceof g.a)) {
                    u0.r();
                    return;
                } else {
                    i16 = m52.k.A.f116775k;
                    i17 = ((g.a) gVar).f48993b + iD;
                }
                Iterator<l52.e.b<com.garmin.android.apps.connectmobile.workouts.data.model.j0>> it = aVar.h().iterator();
                int iD2 = 0;
                while (it.hasNext()) {
                    iD2 += l52.o.d(it.next());
                }
                Iterator<l52.e.b<com.garmin.android.apps.connectmobile.workouts.data.model.j0>> it3 = aVar.a().iterator();
                int iD3 = 0;
                while (it3.hasNext()) {
                    iD3 += l52.o.d(it3.next());
                }
                if (i17 + iD3 > i16 || iD3 + iD > i24) {
                    Boolean bool = Boolean.FALSE;
                    pVar4 = new o13.p(bool, bool);
                } else if (i17 + iD2 > i16 || iD + iD2 > i24) {
                    pVar4 = new o13.p(Boolean.TRUE, Boolean.FALSE);
                } else {
                    Boolean bool2 = Boolean.TRUE;
                    pVar4 = new o13.p(bool2, bool2);
                }
                boolean zBooleanValue = ((Boolean) pVar4.f128594a).booleanValue();
                boolean zBooleanValue2 = ((Boolean) pVar4.f128595b).booleanValue();
                int i25 = i15 & 14;
                boolean z15 = i25 == 4 || ((i15 & 8) != 0 && o0VarE.r(pVar2));
                Object objQ = o0VarE.q();
                p3.m.a aVar2 = p3.m.f135153a;
                if (z15) {
                    objQ = new a(pVar2);
                    o0VarE.K(objQ);
                } else {
                    aVar2.getClass();
                    if (objQ == p3.m.a.f135155b) {
                        objQ = new a(pVar2);
                        o0VarE.K(objQ);
                    }
                }
                e23.a aVar3 = (e23.a) ((k23.g) objQ);
                o13.t tVar = k52.g.f102952a;
                switch (k52.g.a.f102955a[kVar.ordinal()]) {
                    case 1:
                    case 2:
                    case 3:
                    case 6:
                        i18 = R.string.workout_add_round;
                        break;
                    case 4:
                        i18 = R.string.workout_add_sets;
                        break;
                    case 5:
                        i18 = R.string.workout_add_circuit;
                        break;
                    case 7:
                    case 8:
                    case 9:
                    case 10:
                    case 11:
                    case 12:
                    case 13:
                        i18 = R.string.workout_lbl_add_repeat;
                        break;
                    default:
                        u0.r();
                        return;
                }
                String strQ = gl1.y.Q(o0VarE, i18);
                if (i25 == 4 || ((i15 & 8) != 0 && o0VarE.r(pVar2))) {
                    z14 = true;
                }
                Object objQ2 = o0VarE.q();
                if (z14) {
                    objQ2 = new b(pVar2);
                    o0VarE.K(objQ2);
                } else {
                    aVar2.getClass();
                    if (objQ2 == p3.m.a.f135155b) {
                        objQ2 = new b(pVar2);
                        o0VarE.K(objQ2);
                    }
                }
                r0.c(0, aVar3, (e23.a) ((k23.g) objQ2), strQ, o0VarE, zBooleanValue, zBooleanValue2);
                x1 x1Var2 = p3.n.f135158a;
            }
            p2VarI0.f135219d = pVar3;
        }
        pVar2 = pVar;
        qVar2 = qVar;
        o0VarE.e();
        p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            final int i26 = 1;
            final p pVar5 = pVar2;
            final q qVar3 = qVar2;
            pVar3 = new e23.p(this) { // from class: f62.q

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ com.garmin.android.apps.connectmobile.workouts.presentation.edit.i f69305b;

                {
                    this.f69305b = this;
                }

                @Override // e23.p
                public final Object invoke(Object obj, Object obj2) {
                    int i27 = i26;
                    p3.m mVar2 = (p3.m) obj;
                    ((Integer) obj2).getClass();
                    switch (i27) {
                        case 0:
                            this.f69305b.a(pVar5, qVar3, mVar2, p3.p0.t(i14 | 1));
                            break;
                        default:
                            this.f69305b.a(pVar5, qVar3, mVar2, p3.p0.t(i14 | 1));
                            break;
                    }
                    return Unit.INSTANCE;
                }
            };
            p2VarI0.f135219d = pVar3;
        }
    }
}
