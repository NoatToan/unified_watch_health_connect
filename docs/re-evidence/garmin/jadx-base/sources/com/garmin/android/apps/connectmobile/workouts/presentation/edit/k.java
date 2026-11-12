package com.garmin.android.apps.connectmobile.workouts.presentation.edit;

import com.garmin.android.apps.connectmobile.R;
import ew1.c2;
import ew1.r1;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p3.o0;
import p3.p2;
import p3.x1;
import w52.c1;
import w52.f1;
import w52.l0;
import w52.x0;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004B\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/garmin/android/apps/connectmobile/workouts/presentation/edit/k;", "Lr52/b;", "Lcom/garmin/android/apps/connectmobile/workouts/presentation/edit/q;", "Lcom/garmin/android/apps/connectmobile/workouts/presentation/edit/p;", "Lw52/x0;", "<init>", "()V", "gcm-workouts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class k implements r52.b<q, p>, x0 {

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class a extends p005kotlin.jvm.internal.q implements e23.q<String, String, e23.a<? extends Unit>, Unit> {
        public a(Object obj) {
            super(3, obj, p.class, "downloadAudioNote", "downloadAudioNote(Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V", 0);
        }

        @Override // e23.q
        public final Unit invoke(String str, String str2, e23.a<? extends Unit> aVar) {
            String str3 = str;
            String str4 = str2;
            e23.a<? extends Unit> aVar2 = aVar;
            str3.getClass();
            str4.getClass();
            aVar2.getClass();
            ((p) this.receiver).t(aVar2, str3, str4);
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Code duplicated, block: B:102:0x021b  */
    /* JADX WARN: Code duplicated, block: B:104:0x0222  */
    /* JADX WARN: Code duplicated, block: B:128:0x0288  */
    /* JADX WARN: Code duplicated, block: B:143:0x02d4  */
    /* JADX WARN: Code duplicated, block: B:85:0x01e5  */
    /* JADX WARN: Code duplicated, block: B:88:0x01ec  */
    /* JADX WARN: Code duplicated, block: B:90:0x01f3  */
    /* JADX WARN: Code duplicated, block: B:99:0x020f  */
    @Override // r52.b
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final void a(final p pVar, final q qVar, p3.m mVar, final int i14) {
        int i15;
        q qVar2;
        p pVar2;
        p2 p2VarI0;
        e23.p<? super p3.m, ? super Integer, Unit> pVar3;
        char c14;
        int i16;
        int i17;
        com.garmin.android.apps.connectmobile.workouts.data.model.a aVar;
        com.garmin.android.apps.connectmobile.workouts.data.model.a aVar2;
        int i18;
        boolean z14;
        Object objQ;
        boolean z15;
        boolean zR;
        Object objQ2;
        pVar.getClass();
        qVar.getClass();
        g gVar = qVar.f49263s;
        m52.k kVar = qVar.f49245a;
        f62.o oVar = qVar.f49262r;
        o0 o0VarE = mVar.E(126133325);
        if ((i14 & 6) == 0) {
            i15 = ((i14 & 8) == 0 ? o0VarE.B(pVar) : o0VarE.r(pVar) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= o0VarE.r(qVar) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            i15 |= o0VarE.B(this) ? 256 : 128;
        }
        int i19 = i15;
        if (o0VarE.n(i19 & 1, (i19 & 147) != 146)) {
            x1 x1Var = p3.n.f135158a;
            if (qVar.f49269y) {
                o0VarE.C(-458388501);
                w52.a0.a(this, gl1.y.Q(o0VarE, R.string.workout_procedure_title), null, null, o0VarE, (i19 >> 6) & 14, 6);
                o0VarE.g0(false);
                p2VarI0 = o0VarE.i0();
                if (p2VarI0 == null) {
                    return;
                }
                final int i24 = 0;
                pVar3 = new e23.p(this) { // from class: f62.s

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ com.garmin.android.apps.connectmobile.workouts.presentation.edit.k f69326b;

                    {
                        this.f69326b = this;
                    }

                    @Override // e23.p
                    public final Object invoke(Object obj, Object obj2) {
                        int i25 = i24;
                        p3.m mVar2 = (p3.m) obj;
                        ((Integer) obj2).getClass();
                        switch (i25) {
                            case 0:
                                this.f69326b.a(pVar, qVar, mVar2, p3.p0.t(i14 | 1));
                                break;
                            default:
                                this.f69326b.a(pVar, qVar, mVar2, p3.p0.t(i14 | 1));
                                break;
                        }
                        return Unit.INSTANCE;
                    }
                };
            } else {
                qVar2 = qVar;
                pVar2 = pVar;
                o0VarE.C(-458286635);
                o0VarE.g0(false);
                if (kVar == m52.k.f116754n || kVar == m52.k.f116755o) {
                    o0VarE.C(955053573);
                    z52.a aVar3 = qVar2.f49268x;
                    if (aVar3 == null) {
                        o0VarE.C(-458110308);
                        o0VarE.g0(false);
                        c14 = R.string.workout_procedure_title;
                    } else {
                        o0VarE.C(-458110307);
                        h4.r rVarG = c2.l.g(h4.r.S, 2.840909f);
                        d92.b.f58623a.getClass();
                        d92.b.f58625c.getClass();
                        h4.r rVarY = c2.l.y(rVarG, j92.b.f97899b.f97920e);
                        m52.k kVar2 = qVar2.f49245a;
                        l52.i<com.garmin.android.apps.connectmobile.workouts.data.model.j0> iVar = qVar2.f49250f;
                        c14 = R.string.workout_procedure_title;
                        f1.b(rVarY, kVar2, iVar, aVar3, o0VarE, 0);
                        o0VarE = o0VarE;
                        o0VarE.g0(false);
                    }
                    o0VarE.g0(false);
                } else {
                    o0VarE.C(-457739051);
                    o0VarE.g0(false);
                    c14 = R.string.workout_procedure_title;
                }
                Integer num = oVar.f69291a;
                m52.b bVar = oVar.f69293c;
                v52.e.a aVarE = v52.e.e(num, oVar.f69292b, bVar);
                int i25 = (i19 >> 6) & 14;
                boolean z16 = false;
                w52.a0.a(this, gl1.y.Q(o0VarE, R.string.lbl_overview), null, null, o0VarE, i25, 6);
                if (aVarE == v52.e.a.TIME) {
                    o0VarE.C(-457248414);
                    l0.e(this, oVar.f69291a, bVar, o0VarE, i25);
                    o0VarE.g0(false);
                } else {
                    o0VarE.C(-457107147);
                    o0VarE.g0(false);
                }
                if (aVarE == v52.e.a.DISTANCE) {
                    o0VarE.C(-457024098);
                    l0.c(this, oVar.f69292b, oVar.f69293c, oVar.f69294d, o0VarE, i25);
                    o0VarE.g0(false);
                } else {
                    o0VarE.C(-456817483);
                    o0VarE.g0(false);
                }
                if (aVarE == v52.e.a.BOTH) {
                    o0VarE.C(-456736790);
                    o0 o0Var = o0VarE;
                    l0.i(this, oVar.f69291a, oVar.f69292b, oVar.f69293c, oVar.f69294d, o0Var, i25);
                    o0VarE = o0Var;
                    i16 = i25;
                    o0VarE.g0(false);
                } else {
                    i16 = i25;
                    o0VarE.C(-456480203);
                    o0VarE.g0(false);
                }
                boolean zG = p005kotlin.jvm.internal.s.g(gVar, g.b.f48995a);
                p3.m.a aVar4 = p3.m.f135153a;
                if (zG) {
                    o0VarE.C(-456397774);
                    o13.t tVar = k52.g.f102952a;
                    if (kVar != m52.k.f116758r && k52.g.d()) {
                        aVar = qVar2.f49265u;
                        if (aVar == null) {
                            aVar2 = new com.garmin.android.apps.connectmobile.workouts.data.model.a(null, null, null, 7, null);
                        }
                        String str = qVar2.f49258n;
                        String str2 = qVar2.f49266v;
                        i18 = i19 & 14;
                        if (i18 != 4 || ((i19 & 8) != 0 && o0VarE.r(pVar2))) {
                            z14 = true;
                        } else {
                            z14 = false;
                        }
                        objQ = o0VarE.q();
                        if (z14) {
                            objQ = new a(pVar2);
                            o0VarE.K(objQ);
                        } else {
                            aVar4.getClass();
                            if (objQ == p3.m.a.f135155b) {
                                objQ = new a(pVar2);
                                o0VarE.K(objQ);
                            }
                        }
                        e23.q qVar3 = (e23.q) ((k23.g) objQ);
                        if (i18 != 4 || ((i19 & 8) != 0 && o0VarE.r(pVar2))) {
                            z15 = true;
                        } else {
                            z15 = false;
                        }
                        zR = z15 | o0VarE.r(qVar2);
                        objQ2 = o0VarE.q();
                        if (zR) {
                            objQ2 = new r1(9, pVar2, qVar2);
                            o0VarE.K(objQ2);
                        } else {
                            aVar4.getClass();
                            if (objQ2 == p3.m.a.f135155b) {
                                objQ2 = new r1(9, pVar2, qVar2);
                                o0VarE.K(objQ2);
                            }
                        }
                        o0 o0Var2 = o0VarE;
                        c1.a(this, str, aVar2, str2, qVar3, (e23.p) objQ2, o0Var2, i16 | (com.garmin.android.apps.connectmobile.workouts.data.model.a.f48070d << 6));
                        o0VarE = o0Var2;
                        o0VarE.g0(false);
                    } else {
                        aVar = null;
                    }
                    aVar2 = aVar;
                    String str3 = qVar2.f49258n;
                    String str4 = qVar2.f49266v;
                    i18 = i19 & 14;
                    if (i18 != 4) {
                        z14 = true;
                    } else {
                        z14 = true;
                    }
                    objQ = o0VarE.q();
                    if (z14) {
                        aVar4.getClass();
                        if (objQ == p3.m.a.f135155b) {
                            objQ = new a(pVar2);
                            o0VarE.K(objQ);
                        }
                    } else {
                        objQ = new a(pVar2);
                        o0VarE.K(objQ);
                    }
                    e23.q qVar4 = (e23.q) ((k23.g) objQ);
                    if (i18 != 4) {
                        z15 = true;
                    } else {
                        z15 = true;
                    }
                    zR = z15 | o0VarE.r(qVar2);
                    objQ2 = o0VarE.q();
                    if (zR) {
                        aVar4.getClass();
                        if (objQ2 == p3.m.a.f135155b) {
                            objQ2 = new r1(9, pVar2, qVar2);
                            o0VarE.K(objQ2);
                        }
                    } else {
                        objQ2 = new r1(9, pVar2, qVar2);
                        o0VarE.K(objQ2);
                    }
                    o0 o0Var3 = o0VarE;
                    c1.a(this, str3, aVar2, str4, qVar4, (e23.p) objQ2, o0Var3, i16 | (com.garmin.android.apps.connectmobile.workouts.data.model.a.f48070d << 6));
                    o0VarE = o0Var3;
                    o0VarE.g0(false);
                } else {
                    o0VarE.C(-455902859);
                    o0VarE.g0(false);
                }
                if (kVar == m52.k.f116758r) {
                    o0VarE.C(-455812401);
                    d dVar = qVar2.f49260p;
                    boolean z17 = (gVar instanceof g.a) && ((g.a) gVar).f48994c;
                    boolean zR2 = ((i19 & 14) == 4 || ((i19 & 8) != 0 && o0VarE.r(pVar2))) | o0VarE.r(qVar2);
                    Object objQ3 = o0VarE.q();
                    if (zR2) {
                        objQ3 = new c2(11, pVar2, qVar2);
                        o0VarE.K(objQ3);
                    } else {
                        aVar4.getClass();
                        if (objQ3 == p3.m.a.f135155b) {
                            objQ3 = new c2(11, pVar2, qVar2);
                            o0VarE.K(objQ3);
                        }
                    }
                    i17 = i16;
                    w52.z.b(this, dVar, (e23.a) objQ3, z17, o0VarE, i17);
                    o0VarE.g0(false);
                } else {
                    i17 = i16;
                    o0VarE.C(-455550699);
                    o0VarE.g0(false);
                }
                String strQ = gl1.y.Q(o0VarE, R.string.workout_procedure_title);
                String strQ2 = gl1.y.Q(o0VarE, R.string.lbl_reorder);
                if ((i19 & 14) == 4 || ((i19 & 8) != 0 && o0VarE.r(pVar2))) {
                    z16 = true;
                }
                Object objQ4 = o0VarE.q();
                if (z16) {
                    objQ4 = new e40.d(pVar2, 24);
                    o0VarE.K(objQ4);
                } else {
                    aVar4.getClass();
                    if (objQ4 == p3.m.a.f135155b) {
                        objQ4 = new e40.d(pVar2, 24);
                        o0VarE.K(objQ4);
                    }
                }
                w52.a0.a(this, strQ, strQ2, (e23.a) objQ4, o0VarE, i17, 0);
            }
            p2VarI0.f135219d = pVar3;
        }
        qVar2 = qVar;
        pVar2 = pVar;
        o0VarE.e();
        p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            final int i26 = 1;
            final p pVar4 = pVar2;
            final q qVar5 = qVar2;
            pVar3 = new e23.p(this) { // from class: f62.s

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ com.garmin.android.apps.connectmobile.workouts.presentation.edit.k f69326b;

                {
                    this.f69326b = this;
                }

                @Override // e23.p
                public final Object invoke(Object obj, Object obj2) {
                    int i27 = i26;
                    p3.m mVar2 = (p3.m) obj;
                    ((Integer) obj2).getClass();
                    switch (i27) {
                        case 0:
                            this.f69326b.a(pVar4, qVar5, mVar2, p3.p0.t(i14 | 1));
                            break;
                        default:
                            this.f69326b.a(pVar4, qVar5, mVar2, p3.p0.t(i14 | 1));
                            break;
                    }
                    return Unit.INSTANCE;
                }
            };
            p2VarI0.f135219d = pVar3;
        }
    }
}
