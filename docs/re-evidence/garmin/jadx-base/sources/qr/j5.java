package qr;

import android.util.SparseArray;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.activity.details.presentation.ActivityDetailsViewModel$getWorkoutComparisonData$1", f = "ActivityDetailsViewModel.kt", l = {3636}, m = "invokeSuspend", v = 2)
public final class j5 extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f146270a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ t f146271b;

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00052\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"", "Lcom/garmin/android/apps/connectmobile/activities/newmodel/j;", "workouts", "Lps/p;", "splits", "Landroid/util/SparseArray;", "Lcom/garmin/android/apps/connectmobile/activities/newmodel/q0;", "<anonymous>", "(Ljava/util/List;Lps/p;)Landroid/util/SparseArray;"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.activity.details.presentation.ActivityDetailsViewModel$getWorkoutComparisonData$1$1", f = "ActivityDetailsViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class a extends v13.i implements e23.q<List<? extends com.garmin.android.apps.connectmobile.activities.newmodel.j>, ps.p, t13.d<? super SparseArray<com.garmin.android.apps.connectmobile.activities.newmodel.q0>>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public /* synthetic */ List f146272a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public /* synthetic */ ps.p f146273b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ t f146274c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(t tVar, t13.d<? super a> dVar) {
            super(3, dVar);
            this.f146274c = tVar;
        }

        @Override // e23.q
        public final Object invoke(List<? extends com.garmin.android.apps.connectmobile.activities.newmodel.j> list, ps.p pVar, t13.d<? super SparseArray<com.garmin.android.apps.connectmobile.activities.newmodel.q0>> dVar) {
            a aVar = new a(this.f146274c, dVar);
            aVar.f146272a = list;
            aVar.f146273b = pVar;
            return aVar.invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code duplicated, block: B:79:0x01f9  */
        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            List list;
            Iterator it;
            ps.x0 x0Var;
            boolean z14;
            HashMap map;
            ps.x0 x0Var2;
            com.garmin.android.apps.connectmobile.activities.newmodel.h0 h0Var;
            double dB;
            ps.x0 x0Var3;
            boolean z15;
            List list2 = this.f146272a;
            ps.p pVar = this.f146273b;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            o13.r.b(obj);
            if (list2.isEmpty()) {
                return null;
            }
            SparseArray sparseArray = new SparseArray(aq.r3.f12189n.getF134973e());
            List<ps.x0> listG = pVar.g();
            if (listG != null) {
                Iterator it3 = listG.iterator();
                while (it3.hasNext()) {
                    ps.x0 x0Var4 = (ps.x0) it3.next();
                    if (x0Var4.E3()) {
                        com.garmin.android.apps.connectmobile.activities.newmodel.h0 h0VarD = am.r1.d(x0Var4.getWorkoutStepIndex(), ((com.garmin.android.apps.connectmobile.activities.newmodel.j) list2.get(x0Var4.getWorkoutIndex())).d());
                        if (h0VarD != null) {
                            String strF = h0VarD.f();
                            if (strF != null) {
                                aq.r3.f12178c.getClass();
                                aq.r3 r3Var = aq.r3.SPEED;
                                if (p13.u.z(r3Var.f12191b, strF)) {
                                    map = new HashMap(2);
                                    map.put(Integer.valueOf(r3Var.f12190a), r3Var);
                                    aq.r3 r3Var2 = aq.r3.PACE;
                                    map.put(Integer.valueOf(r3Var2.f12190a), r3Var2);
                                } else {
                                    aq.r3 r3Var3 = aq.r3.POWER;
                                    if (p13.u.z(r3Var3.f12191b, strF)) {
                                        map = new HashMap(4);
                                        map.put(Integer.valueOf(r3Var3.f12190a), r3Var3);
                                        aq.r3 r3Var4 = aq.r3.POWER_PER_KG;
                                        map.put(Integer.valueOf(r3Var4.f12190a), r3Var4);
                                        aq.r3 r3Var5 = aq.r3.SPLIT_AVG_POWER;
                                        map.put(Integer.valueOf(r3Var5.f12190a), r3Var5);
                                        aq.r3 r3Var6 = aq.r3.SPLIT_AVG_POWER_PER_KG;
                                        map.put(Integer.valueOf(r3Var6.f12190a), r3Var6);
                                    } else {
                                        map = new HashMap(1);
                                        for (aq.r3 r3Var7 : aq.r3.values()) {
                                            if (p13.u.z(r3Var7.f12191b, strF)) {
                                                map.put(Integer.valueOf(r3Var7.f12190a), r3Var7);
                                                break;
                                            }
                                        }
                                    }
                                }
                                Iterator<Integer> it4 = p13.x.i(aq.r3.f12189n).iterator();
                                z14 = false;
                                while (((j23.k) it4).f96801c) {
                                    int iNextInt = ((p13.p0) it4).nextInt();
                                    com.garmin.android.apps.connectmobile.activities.newmodel.p0 p0Var = new com.garmin.android.apps.connectmobile.activities.newmodel.p0();
                                    Double duration = x0Var4.getDuration();
                                    p0Var.f29631a = duration != null ? duration.doubleValue() : Double.NaN;
                                    Double distance = x0Var4.getDistance();
                                    p0Var.f29632b = distance != null ? distance.doubleValue() : Double.NaN;
                                    com.garmin.android.apps.connectmobile.activities.newmodel.q0 q0Var = (com.garmin.android.apps.connectmobile.activities.newmodel.q0) sparseArray.get(iNextInt);
                                    if (q0Var == null) {
                                        q0Var = new com.garmin.android.apps.connectmobile.activities.newmodel.q0();
                                    }
                                    Object obj2 = map.get(new Integer(iNextInt));
                                    if (obj2 != null || strF.equals("OPEN")) {
                                        Double dH = h0VarD.h();
                                        Double dI = h0VarD.i();
                                        Double dG = h0VarD.g();
                                        aq.r3 r3Var8 = (aq.r3) obj2;
                                        if (dH == null || dI == null) {
                                            x0Var2 = x0Var4;
                                            h0Var = h0VarD;
                                            dB = dG != null ? com.garmin.android.apps.connectmobile.activities.newmodel.p0.b(dG.doubleValue(), r3Var8) : 0.0d;
                                        } else {
                                            double dB2 = com.garmin.android.apps.connectmobile.activities.newmodel.p0.b(dI.doubleValue(), r3Var8) + com.garmin.android.apps.connectmobile.activities.newmodel.p0.b(dH.doubleValue(), r3Var8);
                                            x0Var2 = x0Var4;
                                            h0Var = h0VarD;
                                            dB = dB2 / ((double) 2);
                                        }
                                        if (r3Var8 == aq.r3.PACE) {
                                            x0Var3 = x0Var2;
                                            double d14 = 10;
                                            c22.l3.f23124b.getClass();
                                            dB = c22.l3.a.V1(dB / d14) * d14;
                                        } else {
                                            x0Var3 = x0Var2;
                                            if (r3Var8 == aq.r3.SPEED) {
                                                c22.l3.f23124b.getClass();
                                                z15 = true;
                                                dB = c22.l3.a.T1(dB, 1);
                                            }
                                            p0Var.f29633c = dB;
                                        }
                                        z15 = true;
                                        p0Var.f29633c = dB;
                                    } else {
                                        p0Var.f29633c = 0.0d;
                                        x0Var3 = x0Var4;
                                        h0Var = h0VarD;
                                        z15 = true;
                                    }
                                    aq.r3 r3Var9 = aq.r3.PACE;
                                    boolean z16 = (obj2 == r3Var9 || aq.r3.f12189n.get(iNextInt) == r3Var9) ? z15 : false;
                                    if (p0Var.f29633c == 0.0d && z16) {
                                        p0Var.f29633c = 1000000.0d;
                                    }
                                    q0Var.g(p0Var, (aq.r3) obj2);
                                    sparseArray.put(iNextInt, q0Var);
                                    z14 = z15;
                                    list2 = list2;
                                    it3 = it3;
                                    h0VarD = h0Var;
                                    x0Var4 = x0Var3;
                                }
                            } else {
                                z14 = false;
                            }
                            list = list2;
                            it = it3;
                            x0Var = x0Var4;
                        } else {
                            list = list2;
                            it = it3;
                            x0Var = x0Var4;
                            z14 = false;
                        }
                    } else {
                        list = list2;
                        it = it3;
                        x0Var = x0Var4;
                        z14 = false;
                    }
                    if (!z14) {
                        int i14 = t.A2;
                        this.f146274c.getClass();
                        int f134973e = aq.r3.f12189n.getF134973e();
                        for (int i15 = 0; i15 < f134973e; i15++) {
                            com.garmin.android.apps.connectmobile.activities.newmodel.p0 p0Var2 = new com.garmin.android.apps.connectmobile.activities.newmodel.p0();
                            Double duration2 = x0Var.getDuration();
                            p0Var2.f29631a = duration2 != null ? duration2.doubleValue() : Double.NaN;
                            Double distance2 = x0Var.getDistance();
                            p0Var2.f29632b = distance2 != null ? distance2.doubleValue() : Double.NaN;
                            com.garmin.android.apps.connectmobile.activities.newmodel.q0 q0Var2 = (com.garmin.android.apps.connectmobile.activities.newmodel.q0) sparseArray.get(i15);
                            if (q0Var2 == null) {
                                q0Var2 = new com.garmin.android.apps.connectmobile.activities.newmodel.q0();
                            }
                            if (i15 == aq.r3.PACE.f12190a) {
                                p0Var2.f29633c = 1000000.0d;
                            } else {
                                p0Var2.f29633c = 0.0d;
                            }
                            q0Var2.g(p0Var2, (aq.r3) aq.r3.f12189n.get(i15));
                            sparseArray.put(i15, q0Var2);
                        }
                    }
                    list2 = list;
                    it3 = it;
                }
            }
            return sparseArray;
        }
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005*\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00010\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lr53/j;", "Landroid/util/SparseArray;", "Lcom/garmin/android/apps/connectmobile/activities/newmodel/q0;", "", "exception", "", "<anonymous>", "(Lr53/j;Ljava/lang/Throwable;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.activity.details.presentation.ActivityDetailsViewModel$getWorkoutComparisonData$1$2", f = "ActivityDetailsViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class b extends v13.i implements e23.q<r53.j<? super SparseArray<com.garmin.android.apps.connectmobile.activities.newmodel.q0>>, Throwable, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public /* synthetic */ r53.j f146275a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public /* synthetic */ Throwable f146276b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ t f146277c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(t tVar, t13.d<? super b> dVar) {
            super(3, dVar);
            this.f146277c = tVar;
        }

        @Override // e23.q
        public final Object invoke(r53.j<? super SparseArray<com.garmin.android.apps.connectmobile.activities.newmodel.q0>> jVar, Throwable th3, t13.d<? super Unit> dVar) {
            b bVar = new b(this.f146277c, dVar);
            bVar.f146275a = jVar;
            bVar.f146276b = th3;
            return bVar.invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            Throwable th3 = this.f146276b;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            o13.r.b(obj);
            com.garmin.android.apps.connectmobile.a2 a2Var = com.garmin.android.apps.connectmobile.a2.ACTIVITIES;
            String strN = fb1.c.n("Workout comparison data ", th3.getMessage());
            com.garmin.android.apps.connectmobile.i2.f36769a.getClass();
            com.garmin.android.apps.connectmobile.i2.a.f(a2Var, "ActivityDetailsViewModel", strN);
            ((r53.z1) this.f146277c.f146551q1.getValue()).setValue(null);
            return Unit.INSTANCE;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class c<T> implements r53.j {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ t f146278a;

        public c(t tVar) {
            this.f146278a = tVar;
        }

        @Override // r53.j
        public final Object emit(Object obj, t13.d dVar) {
            ((r53.z1) this.f146278a.f146551q1.getValue()).setValue((SparseArray) obj);
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j5(t tVar, t13.d<? super j5> dVar) {
        super(2, dVar);
        this.f146271b = tVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new j5(this.f146271b, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((j5) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f146270a;
        if (i14 == 0) {
            o13.r.b(obj);
            int i15 = t.A2;
            t tVar = this.f146271b;
            r53.w wVar = new r53.w(new r53.u1(tVar.Y4(), tVar.U4(), new a(tVar, null)), new b(tVar, null));
            c cVar = new c(tVar);
            this.f146270a = 1;
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
