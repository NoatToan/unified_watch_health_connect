package rt1;

import am.x0;
import androidx.lifecycle.y0;
import com.garmin.android.apps.connectmobile.f0;
import com.garmin.android.apps.connectmobile.g3;
import com.garmin.android.apps.connectmobile.v2;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import lc.u0;
import o53.b0;
import o53.s0;
import org.joda.time.DateTime;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p13.y;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.training.CompletedTrainingPlansViewModel$getCompletedTrainingPlans$1", f = "CompletedTrainingPlansViewModel.kt", l = {37}, m = "invokeSuspend", v = 2)
public final class h extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f154528a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ y0<g3<List<ww1.r>>> f154529b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ i f154530c;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.training.CompletedTrainingPlansViewModel$getCompletedTrainingPlans$1$1", f = "CompletedTrainingPlansViewModel.kt", l = {39, 62, 67}, m = "invokeSuspend", v = 2)
    public static final class a extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public List f154531a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public List f154532b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public List f154533c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public List f154534d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public v2.b f154535e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f154536f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final /* synthetic */ i f154537g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final /* synthetic */ y0<g3<List<ww1.r>>> f154538h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(i iVar, y0<g3<List<ww1.r>>> y0Var, t13.d<? super a> dVar) {
            super(2, dVar);
            this.f154537g = iVar;
            this.f154538h = y0Var;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new a(this.f154537g, this.f154538h, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code duplicated, block: B:126:0x02a5  */
        /* JADX WARN: Code duplicated, block: B:128:0x02b2  */
        /* JADX WARN: Code duplicated, block: B:131:0x02da  */
        /* JADX WARN: Code duplicated, block: B:134:0x02e2  */
        /* JADX WARN: Code duplicated, block: B:137:0x02fb  */
        /* JADX WARN: Code duplicated, block: B:144:0x032e  */
        /* JADX WARN: Code duplicated, block: B:146:0x0332  */
        /* JADX WARN: Code duplicated, block: B:147:0x0339  */
        /* JADX WARN: Code duplicated, block: B:150:0x03a1  */
        /* JADX WARN: Code duplicated, block: B:152:0x03a5  */
        /* JADX WARN: Code duplicated, block: B:153:0x03b9  */
        /* JADX WARN: Code duplicated, block: B:155:0x03bd  */
        /* JADX WARN: Code duplicated, block: B:156:0x03dd  */
        /* JADX WARN: Code duplicated, block: B:158:0x03e1  */
        /* JADX WARN: Code duplicated, block: B:159:0x03f5  */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r17v20 */
        /* JADX WARN: Type inference failed for: r17v23 */
        /* JADX WARN: Type inference failed for: r17v25 */
        /* JADX WARN: Type inference failed for: r23v10, types: [boolean] */
        /* JADX WARN: Type inference failed for: r23v11 */
        /* JADX WARN: Type inference failed for: r23v9 */
        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            Object objB;
            ArrayList arrayList;
            char c14;
            ArrayList arrayList2;
            boolean z14;
            ArrayList arrayList3;
            ArrayList arrayList4;
            Object objJ;
            List list;
            List list2;
            x0 x0VarB;
            vt1.o oVarB;
            x0 x0VarB2;
            x0 x0VarB3;
            boolean z15;
            List list3;
            List list4;
            v2 v2Var;
            v2.b bVar;
            Object objJ2;
            List list5;
            v2 v2Var2;
            ?? r17;
            List list6;
            v2 v2Var3;
            ArrayList arrayList5;
            ?? r24;
            DateTime dateTimeR;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f154536f;
            char c15 = 3;
            y0<g3<List<ww1.r>>> y0Var = this.f154538h;
            boolean z16 = true;
            i iVar = this.f154537g;
            if (i14 == 0) {
                o13.r.b(obj);
                uw1.b bVar2 = iVar.f154539a;
                this.f154536f = 1;
                objB = bVar2.b(this);
                if (objB != aVar) {
                }
                return aVar;
            }
            if (i14 == 1) {
                o13.r.b(obj);
                objB = obj;
            } else {
                if (i14 == 2) {
                    List list7 = this.f154534d;
                    list2 = this.f154533c;
                    List list8 = this.f154532b;
                    list = this.f154531a;
                    o13.r.b(obj);
                    z15 = true;
                    list3 = list8;
                    c14 = 0;
                    objJ = obj;
                    list4 = list7;
                    v2Var = (v2) objJ;
                    if (v2Var instanceof v2.b) {
                        bVar = (v2.b) v2Var;
                        if (!((Collection) bVar.f47386a).isEmpty()) {
                            fy1.i.f73924a.getClass();
                            String strF = fy1.i.a.f();
                            gu1.b bVar3 = iVar.f154540b;
                            this.f154531a = list;
                            this.f154532b = list3;
                            this.f154533c = list2;
                            this.f154534d = list4;
                            this.f154535e = bVar;
                            this.f154536f = 3;
                            bVar3.getClass();
                            objJ2 = f0.J(bVar3, new gu1.h(bVar3, strF, null), this);
                            if (objJ2 != aVar) {
                                list5 = list3;
                                v2Var2 = v2Var;
                                list6 = list4;
                                r17 = z15;
                            }
                            return aVar;
                        }
                        g3.a aVar2 = g3.f35298f;
                        List[] listArr = new List[4];
                        listArr[c14] = list;
                        listArr[z15 ? 1 : 0] = list3;
                        listArr[2] = list2;
                        listArr[3] = list4;
                        ArrayList arrayListX4 = i.x4(iVar, listArr);
                        aVar2.getClass();
                        y0Var.j(g3.a.d(arrayListX4));
                    } else {
                        if (v2Var instanceof v2.a) {
                            u0.r();
                            return null;
                        }
                        y0Var.j(g3.a.a(g3.f35298f, null, ((v2.a) v2Var).f47383a, null, null, 13));
                    }
                    return Unit.INSTANCE;
                }
                if (i14 != 3) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                v2Var2 = this.f154535e;
                List list9 = this.f154534d;
                list2 = this.f154533c;
                List list10 = this.f154532b;
                list = this.f154531a;
                o13.r.b(obj);
                r17 = 1;
                c14 = 0;
                objJ2 = obj;
                list6 = list9;
                list5 = list10;
            }
            v2Var3 = (v2) objJ2;
            if (v2Var3 instanceof v2.b) {
                Iterable<xw1.d> iterable = (Iterable) ((v2.b) v2Var2).f47386a;
                arrayList5 = new ArrayList(y.r(iterable, 10));
                for (xw1.d dVar : iterable) {
                    iVar.getClass();
                    long athletePlanId = dVar.getAthletePlanId();
                    vt1.a.C3360a c3360a = vt1.a.f180073b;
                    char c16 = c15;
                    int workoutPlanId = (int) dVar.getWorkoutPlanId();
                    c3360a.getClass();
                    String strA = vt1.a.C3360a.a(workoutPlanId);
                    if (dVar.a0() || dVar.M() || dVar.e0()) {
                        r24 = c14;
                    } else {
                        r24 = r17;
                    }
                    if (r24 != 0) {
                        dateTimeR = dVar.r();
                    } else {
                        dateTimeR = null;
                    }
                    int iA = dVar.A(((f12.l) KoinJavaComponent.get$default(f12.l.class, null, null, 6, null)).e1().f77271c);
                    r.a aVar3 = r.f154555d;
                    int workoutPlanTypeId = dVar.getWorkoutPlanTypeId();
                    aVar3.getClass();
                    arrayList5.add(new ww1.m(athletePlanId, strA, r24, vt1.a.C3360a.b((int) dVar.getWorkoutPlanId(), ((wt1.a) KoinJavaComponent.get$default(wt1.a.class, null, null, 6, null)).b()), r.a.b(workoutPlanTypeId), dateTimeR, x0.f4308n, iA));
                    c15 = c16;
                }
                g3.a aVar4 = g3.f35298f;
                List[] listArr2 = new List[5];
                listArr2[c14] = list;
                listArr2[r17] = arrayList5;
                listArr2[2] = list5;
                listArr2[c15] = list2;
                listArr2[4] = list6;
                ArrayList arrayListX5 = i.x4(iVar, listArr2);
                aVar4.getClass();
                y0Var.j(g3.a.d(arrayListX5));
            } else {
                if (v2Var3 instanceof v2.a) {
                    u0.r();
                    return null;
                }
                y0Var.j(g3.a.a(g3.f35298f, null, ((v2.a) v2Var3).f47383a, null, null, 13));
            }
            return Unit.INSTANCE;
            v2 v2Var4 = (v2) objB;
            if (v2Var4 instanceof v2.b) {
                tw1.o oVar = (tw1.o) ((v2.b) v2Var4).f47386a;
                List<tw1.m> listA = oVar.a();
                if (listA != null) {
                    ArrayList<tw1.m> arrayList6 = new ArrayList();
                    for (Object obj2 : listA) {
                        tw1.m mVar = (tw1.m) obj2;
                        if (mVar.e0() && mVar.n0()) {
                            arrayList6.add(obj2);
                        }
                    }
                    arrayList = new ArrayList(y.r(arrayList6, 10));
                    for (tw1.m mVar2 : arrayList6) {
                        iVar.getClass();
                        long trainingPlanId = mVar2.getTrainingPlanId();
                        String trainingPlanName = mVar2.getTrainingPlanName();
                        arrayList.add(new ww1.o(trainingPlanId, trainingPlanName == null ? "" : trainingPlanName, mVar2.o(), x0.f4312o, tw1.m.z(mVar2)));
                    }
                } else {
                    arrayList = null;
                }
                List<tw1.m> listA2 = oVar.a();
                if (listA2 != null) {
                    ArrayList<tw1.m> arrayList7 = new ArrayList();
                    for (Object obj3 : listA2) {
                        tw1.m mVar3 = (tw1.m) obj3;
                        if (mVar3.e0() && mVar3.h0()) {
                            arrayList7.add(obj3);
                        }
                    }
                    c14 = 0;
                    arrayList2 = new ArrayList(y.r(arrayList7, 10));
                    for (tw1.m mVar4 : arrayList7) {
                        iVar.getClass();
                        long trainingPlanId2 = mVar4.getTrainingPlanId();
                        String trainingPlanName2 = mVar4.getTrainingPlanName();
                        String str = trainingPlanName2 == null ? "" : trainingPlanName2;
                        DateTime dateTimeO = mVar4.o();
                        tw1.n trainingPlanType = mVar4.getTrainingPlanType();
                        tw1.n trainingPlanType2 = mVar4.getTrainingPlanType();
                        vt1.o oVarB2 = trainingPlanType2 != null ? trainingPlanType2.b() : null;
                        if (oVarB2 == null || (x0VarB3 = oVarB2.b()) == null) {
                            x0VarB3 = x0.f4308n;
                        }
                        arrayList2.add(new ww1.n(trainingPlanId2, str, dateTimeO, trainingPlanType, oVarB2, x0VarB3, tw1.m.z(mVar4)));
                    }
                } else {
                    c14 = 0;
                    arrayList2 = null;
                }
                List<tw1.m> listA3 = oVar.a();
                if (listA3 != null) {
                    ArrayList<tw1.m> arrayList8 = new ArrayList();
                    for (Object obj4 : listA3) {
                        boolean z17 = z16;
                        tw1.m mVar5 = (tw1.m) obj4;
                        if (mVar5.e0() && mVar5.p0()) {
                            arrayList8.add(obj4);
                        }
                        z16 = z17;
                    }
                    z14 = z16;
                    arrayList3 = new ArrayList(y.r(arrayList8, 10));
                    for (tw1.m mVar6 : arrayList8) {
                        iVar.getClass();
                        long trainingPlanId3 = mVar6.getTrainingPlanId();
                        String trainingPlanName3 = mVar6.getTrainingPlanName();
                        String str2 = trainingPlanName3 == null ? "" : trainingPlanName3;
                        DateTime dateTimeO2 = mVar6.o();
                        tw1.n trainingPlanType3 = mVar6.getTrainingPlanType();
                        tw1.n trainingPlanType4 = mVar6.getTrainingPlanType();
                        vt1.o oVarB3 = trainingPlanType4 != null ? trainingPlanType4.b() : null;
                        if (oVarB3 == null || (x0VarB2 = oVarB3.b()) == null) {
                            x0VarB2 = x0.f4309n1;
                        }
                        arrayList3.add(new ww1.p(trainingPlanId3, str2, dateTimeO2, trainingPlanType3, oVarB3, x0VarB2, mVar6.getDurationInWeeks()));
                    }
                } else {
                    z14 = true;
                    arrayList3 = null;
                }
                List<tw1.m> listA4 = oVar.a();
                if (listA4 != null) {
                    ArrayList<tw1.m> arrayList9 = new ArrayList();
                    for (Object obj5 : listA4) {
                        tw1.m mVar7 = (tw1.m) obj5;
                        if (mVar7.e0() && mVar7.o0()) {
                            arrayList9.add(obj5);
                        }
                    }
                    arrayList4 = new ArrayList(y.r(arrayList9, 10));
                    for (tw1.m mVar8 : arrayList9) {
                        iVar.getClass();
                        long trainingPlanId4 = mVar8.getTrainingPlanId();
                        String trainingPlanName4 = mVar8.getTrainingPlanName();
                        if (trainingPlanName4 == null) {
                            trainingPlanName4 = "";
                        }
                        DateTime dateTimeO3 = mVar8.o();
                        tw1.n trainingPlanType5 = mVar8.getTrainingPlanType();
                        if (trainingPlanType5 == null || (oVarB = trainingPlanType5.b()) == null || (x0VarB = oVarB.b()) == null) {
                            x0VarB = x0.f4308n;
                        }
                        arrayList4.add(new ww1.q(trainingPlanId4, trainingPlanName4, dateTimeO3, x0VarB, tw1.m.z(mVar8)));
                    }
                } else {
                    arrayList4 = null;
                }
                gu1.b bVar4 = iVar.f154540b;
                this.f154531a = arrayList;
                this.f154532b = arrayList2;
                this.f154533c = arrayList3;
                this.f154534d = arrayList4;
                this.f154536f = 2;
                bVar4.getClass();
                objJ = f0.J(bVar4, new gu1.f(bVar4, null), this);
                if (objJ != aVar) {
                    list = arrayList;
                    list2 = arrayList3;
                    list4 = arrayList4;
                    list3 = arrayList2;
                    z15 = z14;
                    v2Var = (v2) objJ;
                    if (v2Var instanceof v2.b) {
                        bVar = (v2.b) v2Var;
                        if (!((Collection) bVar.f47386a).isEmpty()) {
                            fy1.i.f73924a.getClass();
                            String strF2 = fy1.i.a.f();
                            gu1.b bVar5 = iVar.f154540b;
                            this.f154531a = list;
                            this.f154532b = list3;
                            this.f154533c = list2;
                            this.f154534d = list4;
                            this.f154535e = bVar;
                            this.f154536f = 3;
                            bVar5.getClass();
                            objJ2 = f0.J(bVar5, new gu1.h(bVar5, strF2, null), this);
                            if (objJ2 != aVar) {
                                list5 = list3;
                                v2Var2 = v2Var;
                                list6 = list4;
                                r17 = z15;
                                v2Var3 = (v2) objJ2;
                                if (v2Var3 instanceof v2.b) {
                                    Iterable<xw1.d> iterable2 = (Iterable) ((v2.b) v2Var2).f47386a;
                                    arrayList5 = new ArrayList(y.r(iterable2, 10));
                                    while (r1.hasNext()) {
                                        iVar.getClass();
                                        long athletePlanId2 = dVar.getAthletePlanId();
                                        vt1.a.C3360a c3360a2 = vt1.a.f180073b;
                                        char c17 = c15;
                                        int workoutPlanId2 = (int) dVar.getWorkoutPlanId();
                                        c3360a2.getClass();
                                        String strA2 = vt1.a.C3360a.a(workoutPlanId2);
                                        if (dVar.a0()) {
                                            r24 = c14;
                                        } else {
                                            r24 = c14;
                                        }
                                        if (r24 != 0) {
                                            dateTimeR = dVar.r();
                                        } else {
                                            dateTimeR = null;
                                        }
                                        int iA2 = dVar.A(((f12.l) KoinJavaComponent.get$default(f12.l.class, null, null, 6, null)).e1().f77271c);
                                        r.a aVar5 = r.f154555d;
                                        int workoutPlanTypeId2 = dVar.getWorkoutPlanTypeId();
                                        aVar5.getClass();
                                        arrayList5.add(new ww1.m(athletePlanId2, strA2, r24, vt1.a.C3360a.b((int) dVar.getWorkoutPlanId(), ((wt1.a) KoinJavaComponent.get$default(wt1.a.class, null, null, 6, null)).b()), r.a.b(workoutPlanTypeId2), dateTimeR, x0.f4308n, iA2));
                                        c15 = c17;
                                    }
                                    g3.a aVar6 = g3.f35298f;
                                    List[] listArr3 = new List[5];
                                    listArr3[c14] = list;
                                    listArr3[r17] = arrayList5;
                                    listArr3[2] = list5;
                                    listArr3[c15] = list2;
                                    listArr3[4] = list6;
                                    ArrayList arrayListX6 = i.x4(iVar, listArr3);
                                    aVar6.getClass();
                                    y0Var.j(g3.a.d(arrayListX6));
                                } else {
                                    if (v2Var3 instanceof v2.a) {
                                        u0.r();
                                        return null;
                                    }
                                    y0Var.j(g3.a.a(g3.f35298f, null, ((v2.a) v2Var3).f47383a, null, null, 13));
                                }
                            }
                        } else {
                            g3.a aVar7 = g3.f35298f;
                            List[] listArr4 = new List[4];
                            listArr4[c14] = list;
                            listArr4[z15 ? 1 : 0] = list3;
                            listArr4[2] = list2;
                            listArr4[3] = list4;
                            ArrayList arrayListX7 = i.x4(iVar, listArr4);
                            aVar7.getClass();
                            y0Var.j(g3.a.d(arrayListX7));
                        }
                    } else {
                        if (v2Var instanceof v2.a) {
                            u0.r();
                            return null;
                        }
                        y0Var.j(g3.a.a(g3.f35298f, null, ((v2.a) v2Var).f47383a, null, null, 13));
                    }
                }
                return aVar;
            }
            if (!(v2Var4 instanceof v2.a)) {
                u0.r();
                return null;
            }
            y0Var.j(g3.a.a(g3.f35298f, null, ((v2.a) v2Var4).f47383a, null, null, 13));
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(y0<g3<List<ww1.r>>> y0Var, i iVar, t13.d<? super h> dVar) {
        super(2, dVar);
        this.f154529b = y0Var;
        this.f154530c = iVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new h(this.f154529b, this.f154530c, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((h) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f154528a;
        if (i14 == 0) {
            o13.r.b(obj);
            g3<List<ww1.r>> g3VarC = g3.a.c(g3.f35298f);
            y0<g3<List<ww1.r>>> y0Var = this.f154529b;
            y0Var.m(g3VarC);
            x53.c cVar = s0.f129406a;
            x53.b bVar = x53.b.f189152a;
            a aVar2 = new a(this.f154530c, y0Var, null);
            this.f154528a = 1;
            if (ge1.b.e0(bVar, aVar2, this) == aVar) {
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
