package aw1;

import androidx.lifecycle.y0;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.g3;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.v2;
import java.util.List;
import lc.u0;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.training.fbtap.wizardflow.FBTPlanWizardViewModel$createATP$1", f = "FBTPlanWizardViewModel.kt", l = {2163, 2173, 2178}, m = "invokeSuspend", v = 2)
public final class o extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public fg0.k f13518a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public jv1.m f13519b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public fu1.l f13520c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f13521d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public /* synthetic */ Object f13522e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ h f13523f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(h hVar, t13.d<? super o> dVar) {
        super(2, dVar);
        this.f13523f = hVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        o oVar = new o(this.f13523f, dVar);
        oVar.f13522e = obj;
        return oVar;
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((o) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:100:0x01bf  */
    /* JADX WARN: Code duplicated, block: B:103:0x01d5  */
    /* JADX WARN: Code duplicated, block: B:104:0x01f8  */
    /* JADX WARN: Code duplicated, block: B:112:0x0262  */
    /* JADX WARN: Code duplicated, block: B:114:0x0266  */
    /* JADX WARN: Code duplicated, block: B:115:0x0296  */
    /* JADX WARN: Code duplicated, block: B:24:0x0083  */
    /* JADX WARN: Code duplicated, block: B:25:0x0086  */
    /* JADX WARN: Code duplicated, block: B:28:0x008d  */
    /* JADX WARN: Code duplicated, block: B:29:0x0090  */
    /* JADX WARN: Code duplicated, block: B:32:0x009b  */
    /* JADX WARN: Code duplicated, block: B:39:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:41:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:42:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:48:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:51:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:52:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:60:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:62:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:63:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:71:0x0111  */
    /* JADX WARN: Code duplicated, block: B:77:0x0124  */
    /* JADX WARN: Code duplicated, block: B:83:0x013e  */
    /* JADX WARN: Code duplicated, block: B:89:0x0150  */
    /* JADX WARN: Code duplicated, block: B:93:0x01a7  */
    /* JADX WARN: Code duplicated, block: B:96:0x01af  */
    /* JADX WARN: Code duplicated, block: B:98:0x01b7 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:99:0x01b9  */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x0217, code lost:
    
        if (r1 == r2) goto L107;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0064, code lost:
    
        if (r3 == r2) goto L107;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // v13.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object objA5;
        jv1.s sVarI6;
        fg0.k kVar;
        jv1.s sVarI7;
        jv1.m mVar;
        jv1.s sVarI8;
        vt1.n nVar;
        Integer numValueOf;
        jv1.s sVarI9;
        int i14;
        jv1.s sVarI10;
        Integer num;
        jv1.s sVarI11;
        vt1.n nVar2;
        String strK5;
        jv1.s sVarI12;
        int iIntValue;
        jv1.s sVarI13;
        xw1.k kVarT1;
        List<String> listM5;
        String str;
        jv1.s sVarI14;
        Long workoutPlanId;
        Object objJ;
        fg0.k kVar2;
        jv1.m mVar2;
        xw1.h hVar;
        fg0.k kVar3;
        jv1.m mVar3;
        Integer numA;
        jv1.h hVar2;
        hv1.j jVar;
        jv1.h hVar3;
        v2 v2Var;
        fu1.l lVar;
        fg0.d dVarC;
        fg0.j eventCustomization;
        fg0.j jVar2;
        Object objV4;
        o53.b0 b0Var = (o53.b0) this.f13522e;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = this.f13521d;
        h hVar4 = this.f13523f;
        if (i15 != 0) {
            if (i15 == 1) {
                o13.r.b(obj);
                objA5 = obj;
            } else {
                if (i15 == 2) {
                    mVar2 = this.f13519b;
                    fg0.k kVar4 = this.f13518a;
                    o13.r.b(obj);
                    kVar2 = kVar4;
                    objJ = obj;
                    v2Var = (v2) objJ;
                    if (v2Var instanceof v2.b) {
                        lVar = (fu1.l) ((v2.b) v2Var).f47386a;
                        if (kVar2 != null) {
                            if (mVar2 != null) {
                                dVarC = mVar2.c();
                            } else {
                                dVarC = null;
                            }
                            this.f13522e = b0Var;
                            this.f13518a = null;
                            this.f13519b = null;
                            this.f13520c = lVar;
                            this.f13521d = 3;
                            int i16 = h.S1;
                            hVar4.getClass();
                            eventCustomization = kVar2.getEventCustomization();
                            if (eventCustomization == null) {
                                jVar2 = new fg0.j(null, null, null, null, null, null, null, null, null, null, null, null, null, 8191, null);
                            } else {
                                jVar2 = eventCustomization;
                            }
                            objV4 = hVar4.V4(fg0.k.d(kVar2, null, null, null, null, null, null, fg0.j.b(jVar2, dVarC, null, null, null, lVar.getAthletePlanId(), gg0.e.COACH_ATP, 7998), -16777217), this);
                        }
                        hVar4.f13387t1.add(hv1.h.PLAN_CREATED);
                        y0 y0Var = (y0) hVar4.X0.getValue();
                        g3.f35298f.getClass();
                        y0Var.j(g3.a.d(lVar));
                    } else {
                        if (!(v2Var instanceof v2.a)) {
                            u0.r();
                            return null;
                        }
                        int i17 = h.S1;
                        v2.a aVar2 = (v2.a) v2Var;
                        ((y0) hVar4.X0.getValue()).j(g3.a.a(g3.f35298f, aVar2.f47385c, aVar2.f47383a, null, null, 12));
                        String strN = fb1.c.n("createATP: ", aVar2.f47385c);
                        i2.a aVar3 = i2.f36769a;
                        a2 a2Var = a2.GENERAL;
                        aVar3.getClass();
                        i2.a.f(a2Var, "FBTPlanWizardViewModel", strN);
                    }
                    return Unit.INSTANCE;
                }
                if (i15 != 3) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                fu1.l lVar2 = this.f13520c;
                o13.r.b(obj);
                lVar = lVar2;
                objV4 = obj;
            }
            v2 v2Var2 = (v2) objV4;
            if (v2Var2 instanceof v2.a) {
                v2.a aVar4 = (v2.a) v2Var2;
                String str2 = "Error occurred while updating FBT details to event " + aVar4.f47384b + " :: " + aVar4.f47383a;
                i2.a aVar5 = i2.f36769a;
                a2 a2Var2 = a2.GENERAL;
                aVar5.getClass();
                i2.a.f(a2Var2, "FBTPlanWizardViewModel", str2);
            }
            hVar4.f13387t1.add(hv1.h.PLAN_CREATED);
            y0 y0Var2 = (y0) hVar4.X0.getValue();
            g3.f35298f.getClass();
            y0Var2.j(g3.a.d(lVar));
            return Unit.INSTANCE;
        }
        o13.r.b(obj);
        int i18 = h.S1;
        ((y0) hVar4.X0.getValue()).j(g3.a.c(g3.f35298f));
        if (hVar4.f13387t1.contains(hv1.h.EVENT_CREATED)) {
            int i19 = h.S1;
            sVarI6 = hVar4.i6();
            if (sVarI6 != null) {
                kVar = sVarI6.f101124c;
            } else {
                kVar = null;
            }
            sVarI7 = hVar4.i6();
            if (sVarI7 != null) {
                mVar = sVarI7.f101129h;
            } else {
                mVar = null;
            }
            if (!hVar4.f13387t1.contains(hv1.h.PLAN_CREATED)) {
                kv1.b bVar = hVar4.I;
                sVarI8 = hVar4.i6();
                if (sVarI8 == null && (hVar3 = sVarI8.f101127f) != null && (hVar3 instanceof jv1.g)) {
                    nVar = ((jv1.g) hVar3).f101054c;
                } else {
                    nVar = null;
                }
                if (nVar != null) {
                    numValueOf = Integer.valueOf(nVar.f180172b);
                } else {
                    numValueOf = null;
                }
                sVarI9 = hVar4.i6();
                if (sVarI9 != null || (jVar = sVarI9.f101143v) == null) {
                    i14 = hv1.j.ZERO.f85891c;
                } else {
                    i14 = jVar.f85891c;
                }
                sVarI10 = hVar4.i6();
                if (sVarI10 != null) {
                    num = sVarI10.f101144w;
                } else {
                    num = null;
                }
                sVarI11 = hVar4.i6();
                if (sVarI11 == null && (hVar2 = sVarI11.f101127f) != null && (hVar2 instanceof jv1.g)) {
                    nVar2 = ((jv1.g) hVar2).f101054c;
                } else {
                    nVar2 = null;
                }
                if (nVar2 != null) {
                    strK5 = hVar4.K5(nVar2);
                } else {
                    strK5 = null;
                }
                sVarI12 = hVar4.i6();
                if (sVarI12 != null || (mVar3 = sVarI12.f101129h) == null || (numA = mVar3.a()) == null) {
                    iIntValue = 0;
                } else {
                    iIntValue = numA.intValue();
                }
                sVarI13 = hVar4.i6();
                if (sVarI13 != null || (kVar3 = sVarI13.f101124c) == null) {
                    kVarT1 = null;
                } else {
                    kVarT1 = kVar3.t1();
                }
                List<String> listX5 = hVar4.x5();
                listM5 = hVar4.M5();
                if (listM5 != null || listM5.size() <= 0) {
                    str = null;
                } else {
                    str = listM5.get(0);
                }
                sVarI14 = hVar4.i6();
                if (sVarI14 != null || (hVar = sVarI14.f101130i) == null) {
                    workoutPlanId = null;
                } else {
                    workoutPlanId = hVar.getWorkoutPlanId();
                }
                int iQ5 = hVar4.Q5();
                fy1.i.f73924a.getClass();
                xw1.c cVar = new xw1.c(str, numValueOf, Integer.valueOf(i14), num, strK5, iIntValue, kVarT1, listX5, workoutPlanId, Integer.valueOf(iQ5), fy1.i.a.f(), 0, 0, 0, 0, null, null, null, 0, 0, null, null, null, null, null, 33552384, null);
                this.f13522e = b0Var;
                this.f13518a = kVar;
                this.f13519b = mVar;
                this.f13521d = 2;
                bVar.getClass();
                objJ = com.garmin.android.apps.connectmobile.f0.J(bVar, new kv1.c(bVar, cVar, null), this);
                if (objJ != aVar) {
                    kVar2 = kVar;
                    mVar2 = mVar;
                    v2Var = (v2) objJ;
                    if (v2Var instanceof v2.b) {
                        lVar = (fu1.l) ((v2.b) v2Var).f47386a;
                        if (kVar2 != null) {
                            if (mVar2 != null) {
                                dVarC = mVar2.c();
                            } else {
                                dVarC = null;
                            }
                            this.f13522e = b0Var;
                            this.f13518a = null;
                            this.f13519b = null;
                            this.f13520c = lVar;
                            this.f13521d = 3;
                            int i110 = h.S1;
                            hVar4.getClass();
                            eventCustomization = kVar2.getEventCustomization();
                            if (eventCustomization == null) {
                                jVar2 = new fg0.j(null, null, null, null, null, null, null, null, null, null, null, null, null, 8191, null);
                            } else {
                                jVar2 = eventCustomization;
                            }
                            objV4 = hVar4.V4(fg0.k.d(kVar2, null, null, null, null, null, null, fg0.j.b(jVar2, dVarC, null, null, null, lVar.getAthletePlanId(), gg0.e.COACH_ATP, 7998), -16777217), this);
                        }
                        hVar4.f13387t1.add(hv1.h.PLAN_CREATED);
                        y0 y0Var3 = (y0) hVar4.X0.getValue();
                        g3.f35298f.getClass();
                        y0Var3.j(g3.a.d(lVar));
                    } else {
                        if (!(v2Var instanceof v2.a)) {
                            u0.r();
                            return null;
                        }
                        int i111 = h.S1;
                        v2.a aVar6 = (v2.a) v2Var;
                        ((y0) hVar4.X0.getValue()).j(g3.a.a(g3.f35298f, aVar6.f47385c, aVar6.f47383a, null, null, 12));
                        String strN2 = fb1.c.n("createATP: ", aVar6.f47385c);
                        i2.a aVar7 = i2.f36769a;
                        a2 a2Var3 = a2.GENERAL;
                        aVar7.getClass();
                        i2.a.f(a2Var3, "FBTPlanWizardViewModel", strN2);
                    }
                }
            }
            return Unit.INSTANCE;
        }
        this.f13522e = b0Var;
        this.f13521d = 1;
        objA5 = h.a5(hVar4, this);
        return aVar;
        if (!((Boolean) objA5).booleanValue()) {
            return Unit.INSTANCE;
        }
        hVar4.f13387t1.add(hv1.h.EVENT_CREATED);
        int i112 = h.S1;
        sVarI6 = hVar4.i6();
        if (sVarI6 != null) {
            kVar = sVarI6.f101124c;
        } else {
            kVar = null;
        }
        sVarI7 = hVar4.i6();
        if (sVarI7 != null) {
            mVar = sVarI7.f101129h;
        } else {
            mVar = null;
        }
        if (!hVar4.f13387t1.contains(hv1.h.PLAN_CREATED)) {
            kv1.b bVar2 = hVar4.I;
            sVarI8 = hVar4.i6();
            if (sVarI8 == null) {
                nVar = null;
            } else {
                nVar = null;
            }
            if (nVar != null) {
                numValueOf = Integer.valueOf(nVar.f180172b);
            } else {
                numValueOf = null;
            }
            sVarI9 = hVar4.i6();
            if (sVarI9 != null) {
                i14 = hv1.j.ZERO.f85891c;
            } else {
                i14 = hv1.j.ZERO.f85891c;
            }
            sVarI10 = hVar4.i6();
            if (sVarI10 != null) {
                num = sVarI10.f101144w;
            } else {
                num = null;
            }
            sVarI11 = hVar4.i6();
            if (sVarI11 == null) {
                nVar2 = null;
            } else {
                nVar2 = null;
            }
            if (nVar2 != null) {
                strK5 = hVar4.K5(nVar2);
            } else {
                strK5 = null;
            }
            sVarI12 = hVar4.i6();
            if (sVarI12 != null) {
                iIntValue = 0;
            } else {
                iIntValue = 0;
            }
            sVarI13 = hVar4.i6();
            if (sVarI13 != null) {
                kVarT1 = null;
            } else {
                kVarT1 = null;
            }
            List<String> listX6 = hVar4.x5();
            listM5 = hVar4.M5();
            if (listM5 != null) {
                str = null;
            } else {
                str = null;
            }
            sVarI14 = hVar4.i6();
            if (sVarI14 != null) {
                workoutPlanId = null;
            } else {
                workoutPlanId = null;
            }
            int iQ6 = hVar4.Q5();
            fy1.i.f73924a.getClass();
            xw1.c cVar2 = new xw1.c(str, numValueOf, Integer.valueOf(i14), num, strK5, iIntValue, kVarT1, listX6, workoutPlanId, Integer.valueOf(iQ6), fy1.i.a.f(), 0, 0, 0, 0, null, null, null, 0, 0, null, null, null, null, null, 33552384, null);
            this.f13522e = b0Var;
            this.f13518a = kVar;
            this.f13519b = mVar;
            this.f13521d = 2;
            bVar2.getClass();
            objJ = com.garmin.android.apps.connectmobile.f0.J(bVar2, new kv1.c(bVar2, cVar2, null), this);
            if (objJ != aVar) {
                kVar2 = kVar;
                mVar2 = mVar;
                v2Var = (v2) objJ;
                if (v2Var instanceof v2.b) {
                    lVar = (fu1.l) ((v2.b) v2Var).f47386a;
                    if (kVar2 != null) {
                        if (mVar2 != null) {
                            dVarC = mVar2.c();
                        } else {
                            dVarC = null;
                        }
                        this.f13522e = b0Var;
                        this.f13518a = null;
                        this.f13519b = null;
                        this.f13520c = lVar;
                        this.f13521d = 3;
                        int i113 = h.S1;
                        hVar4.getClass();
                        eventCustomization = kVar2.getEventCustomization();
                        if (eventCustomization == null) {
                            jVar2 = new fg0.j(null, null, null, null, null, null, null, null, null, null, null, null, null, 8191, null);
                        } else {
                            jVar2 = eventCustomization;
                        }
                        objV4 = hVar4.V4(fg0.k.d(kVar2, null, null, null, null, null, null, fg0.j.b(jVar2, dVarC, null, null, null, lVar.getAthletePlanId(), gg0.e.COACH_ATP, 7998), -16777217), this);
                    }
                    hVar4.f13387t1.add(hv1.h.PLAN_CREATED);
                    y0 y0Var4 = (y0) hVar4.X0.getValue();
                    g3.f35298f.getClass();
                    y0Var4.j(g3.a.d(lVar));
                } else {
                    if (!(v2Var instanceof v2.a)) {
                        u0.r();
                        return null;
                    }
                    int i114 = h.S1;
                    v2.a aVar8 = (v2.a) v2Var;
                    ((y0) hVar4.X0.getValue()).j(g3.a.a(g3.f35298f, aVar8.f47385c, aVar8.f47383a, null, null, 12));
                    String strN3 = fb1.c.n("createATP: ", aVar8.f47385c);
                    i2.a aVar9 = i2.f36769a;
                    a2 a2Var4 = a2.GENERAL;
                    aVar9.getClass();
                    i2.a.f(a2Var4, "FBTPlanWizardViewModel", strN3);
                }
            }
            return aVar;
        }
        return Unit.INSTANCE;
    }
}
