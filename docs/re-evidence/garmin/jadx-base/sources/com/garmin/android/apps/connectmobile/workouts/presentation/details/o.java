package com.garmin.android.apps.connectmobile.workouts.presentation.details;

import am.x0;
import androidx.lifecycle.v1;
import bs2.nv;
import bs2.sw;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.k1;
import java.util.ArrayList;
import java.util.List;
import o53.b0;
import o53.s0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p13.h0;
import p13.j0;
import ww1.i0;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", ""}, k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.workouts.presentation.details.WorkoutDetailsViewModel$loadWorkoutToDevice$2", f = "WorkoutDetailsViewModel.kt", l = {2063}, m = "invokeSuspend", v = 2)
public final class o extends v13.i implements e23.l<t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f48769a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f f48770b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f48771c;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.workouts.presentation.details.WorkoutDetailsViewModel$loadWorkoutToDevice$2$1", f = "WorkoutDetailsViewModel.kt", l = {2124}, m = "invokeSuspend", v = 2)
    public static final class a extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f48772a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f48773b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ m52.k f48774c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ List<d62.i> f48775d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ f f48776e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ long f48777f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(m52.k kVar, List<d62.i> list, f fVar, long j8, t13.d<? super a> dVar) {
            super(2, dVar);
            this.f48774c = kVar;
            this.f48775d = list;
            this.f48776e = fVar;
            this.f48777f = j8;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            a aVar = new a(this.f48774c, this.f48775d, this.f48776e, this.f48777f, dVar);
            aVar.f48773b = obj;
            return aVar;
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f48772a;
            if (i14 == 0) {
                o13.r.b(obj);
                StringBuilder sb3 = new StringBuilder("Workout sport type ");
                sb3.append(this.f48774c);
                sb3.append(" has compatible activity profiles: ");
                List<d62.i> list = this.f48775d;
                sb3.append(list);
                String string = sb3.toString();
                i2.a aVar2 = i2.f36769a;
                a2 a2Var = a2.GENERAL;
                aVar2.getClass();
                i2.a.b(a2Var, "WorkoutDetailsViewModel", string);
                q53.w<v52.c<? extends d>> wVar = this.f48776e.f48598k0;
                d.m mVar = new d.m(this.f48777f, list);
                this.f48773b = null;
                this.f48772a = 1;
                if (v52.d.d(wVar, mVar, this) == aVar) {
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

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\t\u0018\u00010\u0001¢\u0006\u0002\b\u0002*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo53/b0;", "Lsd2/f;", "Lkotlin/jvm/internal/EnhancedNullability;", "<anonymous>", "(Lo53/b0;)Lsd2/f;"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.workouts.presentation.details.WorkoutDetailsViewModel$loadWorkoutToDevice$2$device$1", f = "WorkoutDetailsViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class b extends v13.i implements e23.p<b0, t13.d<? super sd2.f>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ f f48778a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ long f48779b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(f fVar, long j8, t13.d<? super b> dVar) {
            super(2, dVar);
            this.f48778a = fVar;
            this.f48779b = j8;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new b(this.f48778a, this.f48779b, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super sd2.f> dVar) {
            return ((b) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            o13.r.b(obj);
            this.f48778a.f48596j.f152045a.getClass();
            return rd2.j.i(this.f48779b, null);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(f fVar, long j8, t13.d<? super o> dVar) {
        super(1, dVar);
        this.f48770b = fVar;
        this.f48771c = j8;
    }

    @Override // v13.a
    public final t13.d<Unit> create(t13.d<?> dVar) {
        return new o(this.f48770b, this.f48771c, dVar);
    }

    @Override // e23.l
    public final Object invoke(t13.d<? super Unit> dVar) {
        return ((o) create(dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:101:0x01da  */
    /* JADX WARN: Code duplicated, block: B:144:0x01dd A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:99:0x01d4  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v4, types: [java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r1v13, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r1v4, types: [p13.j0] */
    /* JADX WARN: Type inference failed for: r1v6, types: [p13.j0] */
    /* JADX WARN: Type inference failed for: r1v8, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v9 */
    @Override // v13.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        ?? C;
        Object next;
        int iIntValue;
        Object objE0;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f48769a;
        int i15 = 1;
        f fVar = this.f48770b;
        if (i14 == 0) {
            o13.r.b(obj);
            rt1.m mVar = fVar.f48590d;
            long j8 = this.f48771c;
            if (mVar.a(j8)) {
                m52.k kVarR4 = fVar.R4(fVar.f48605r, Boolean.FALSE);
                nv nvVar = kVarR4 != null ? kVarR4.f116768d : null;
                Integer num = nvVar != null ? new Integer(nvVar.f20362a) : null;
                boolean z14 = false;
                if (num != null && ((iIntValue = num.intValue()) == nv.RUNNING.f20362a || iIntValue == nv.CYCLING.f20362a)) {
                    z14 = true;
                }
                e eVar = (e) v52.d.b(fVar.Z);
                List<i0> listE = eVar != null ? eVar.E() : null;
                bv.b.f21239a.getClass();
                bv.b.a();
                boolean zL0 = k1.f37122a.l0();
                if (listE != null && !listE.isEmpty()) {
                    C = new ArrayList();
                    i0 i0VarP = w5.r.p(listE);
                    if (i0VarP != null) {
                        d62.j.a aVar2 = d62.j.f58018e;
                        x0 x0VarB = i0VarP.b();
                        aVar2.getClass();
                        d62.j jVarA = d62.j.a.a(x0VarB, zL0);
                        List<i0> listQ = w5.r.q(listE);
                        ArrayList arrayList = new ArrayList();
                        for (i0 i0Var : listQ) {
                            d62.j.a aVar3 = d62.j.f58018e;
                            x0 x0VarB2 = i0Var.b();
                            aVar3.getClass();
                            d62.j jVarA2 = d62.j.a.a(x0VarB2, zL0);
                            if (jVarA2 != null) {
                                arrayList.add(jVarA2);
                            }
                        }
                        if (arrayList.isEmpty()) {
                            arrayList = null;
                        }
                        if (jVarA != null) {
                            C.add(new d62.i(jVarA, arrayList != null ? h0.C0(p13.w.c(jVarA), arrayList) : null));
                        }
                    }
                    i0 i0VarJ = w5.r.j(listE);
                    if (i0VarJ != null) {
                        d62.j.a aVar4 = d62.j.f58018e;
                        x0 x0VarB3 = i0VarJ.b();
                        aVar4.getClass();
                        d62.j jVarA3 = d62.j.a.a(x0VarB3, zL0);
                        List<i0> listK = w5.r.k(listE);
                        ArrayList arrayList2 = new ArrayList();
                        for (i0 i0Var2 : listK) {
                            d62.j.a aVar5 = d62.j.f58018e;
                            x0 x0VarB4 = i0Var2.b();
                            aVar5.getClass();
                            d62.j jVarA4 = d62.j.a.a(x0VarB4, zL0);
                            if (jVarA4 != null) {
                                arrayList2.add(jVarA4);
                            }
                        }
                        if (arrayList2.isEmpty()) {
                            arrayList2 = null;
                        }
                        if (jVarA3 != null) {
                            C.add(new d62.i(jVarA3, arrayList2 != null ? h0.C0(p13.w.c(jVarA3), arrayList2) : null));
                        }
                    }
                    for (i0 i0Var3 : w5.r.m(listE)) {
                        d62.j.a aVar6 = d62.j.f58018e;
                        x0 x0VarB5 = i0Var3.b();
                        aVar6.getClass();
                        d62.j jVarA5 = d62.j.a.a(x0VarB5, zL0);
                        if (jVarA5 != null) {
                            C.add(new d62.i(jVarA5, null));
                        }
                    }
                } else if (nvVar == null || !z14) {
                    C = j0.f134944a;
                } else {
                    d62.j.f58018e.getClass();
                    w13.c cVar = d62.j.f58023j;
                    ArrayList arrayList3 = new ArrayList();
                    for (Object obj2 : cVar) {
                        d62.j jVar = (d62.j) obj2;
                        d62.j.f58018e.getClass();
                        int i16 = d62.j.a.C1237a.f58028a[jVar.f58024a.ordinal()];
                        if (i16 != i15) {
                            if (i16 != 2) {
                                if (jVar.f58024a == nvVar) {
                                    if (d62.j.a.b(jVar, zL0)) {
                                        arrayList3.add(obj2);
                                    }
                                }
                            } else if (nvVar == nv.WALKING) {
                                if (d62.j.a.b(jVar, zL0)) {
                                    arrayList3.add(obj2);
                                }
                            }
                        } else if (nvVar == nv.RUNNING) {
                            if (d62.j.a.b(jVar, zL0)) {
                                arrayList3.add(obj2);
                            }
                        }
                        i15 = 1;
                    }
                    w13.c cVar2 = d62.j.f58023j;
                    p13.c.b bVarN = com.airbnb.lottie.animation.keyframe.a.n(cVar2, cVar2);
                    while (true) {
                        if (!bVarN.hasNext()) {
                            next = null;
                            break;
                        }
                        next = bVarN.next();
                        d62.j jVar2 = (d62.j) next;
                        if (jVar2.f58024a == nvVar && jVar2.f58025b == sw.GENERIC) {
                            break;
                        }
                    }
                    d62.j jVar3 = (d62.j) next;
                    C = (arrayList3.isEmpty() || jVar3 == null) ? j0.f134944a : p13.w.c(new d62.i(jVar3, arrayList3));
                }
                ?? r14 = C;
                if (r14.isEmpty()) {
                    fVar.K4(new n(fVar, j8, num, null, null));
                } else {
                    ge1.b.T(v1.a(fVar), null, null, new a(kVarR4, r14, this.f48770b, this.f48771c, null), 3);
                }
                return Unit.INSTANCE;
            }
            x53.c cVar3 = s0.f129406a;
            x53.b bVar = x53.b.f189152a;
            b bVar2 = new b(fVar, j8, null);
            this.f48769a = 1;
            objE0 = ge1.b.e0(bVar, bVar2, this);
            if (objE0 == aVar) {
                return aVar;
            }
        } else {
            if (i14 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(obj);
            objE0 = obj;
        }
        sd2.f fVar2 = (sd2.f) objE0;
        fVar.f5(new com.garmin.android.apps.connectmobile.workouts.presentation.details.b.C0945b(fVar2 != null ? fVar2.getProductDisplayName() : null));
        return Unit.INSTANCE;
    }
}
