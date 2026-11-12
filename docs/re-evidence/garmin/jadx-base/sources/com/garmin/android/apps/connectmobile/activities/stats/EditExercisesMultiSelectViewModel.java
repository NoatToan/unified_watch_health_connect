package com.garmin.android.apps.connectmobile.activities.stats;

import am.j;
import am.x0;
import androidx.lifecycle.u1;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.x1;
import androidx.lifecycle.y0;
import aq.b1;
import aq.c1;
import aq.d1;
import aq.e1;
import aq.f1;
import aq.g1;
import aq.h1;
import aq.i1;
import aq.j1;
import aq.k1;
import aq.l1;
import aq.m1;
import aq.u0;
import aq.w0;
import aq.x;
import aq.z0;
import c22.l2;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.g3;
import com.garmin.android.apps.connectmobile.repcounting.model.ExerciseSetsDTO;
import com.garmin.android.apps.connectmobile.repcounting.model.c;
import com.garmin.android.apps.connectmobile.repcounting.model.d;
import com.garmin.android.apps.connectmobile.repcounting.model.e;
import cw.s;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import o13.m;
import o13.p;
import o13.r;
import o13.t;
import o53.s0;
import o53.t1;
import okhttp3.internal.Util;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p13.h0;
import p13.j0;
import p13.y;
import ss.f;
import u53.o;
import vb.h;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001:\u0004\u0010\u0011\u0012\u0013BA\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\b\u0002\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0014"}, d2 = {"Lcom/garmin/android/apps/connectmobile/activities/stats/EditExercisesMultiSelectViewModel;", "Landroidx/lifecycle/u1;", "", "activityId", "Lam/x0;", "activityType", "Lcom/garmin/android/apps/connectmobile/repcounting/model/ExerciseSetsDTO;", "exercisesSetsDTO", "Lcom/garmin/android/apps/connectmobile/repcounting/model/c;", "exerciseListDTO", "Lcom/garmin/android/apps/connectmobile/repcounting/model/d;", "addedExerciseListItemDTO", "Lcw/s;", "repCountingRepo", "<init>", "(JLam/x0;Lcom/garmin/android/apps/connectmobile/repcounting/model/ExerciseSetsDTO;Lcom/garmin/android/apps/connectmobile/repcounting/model/c;Lcom/garmin/android/apps/connectmobile/repcounting/model/d;Lcw/s;)V", "b", "NoNetworkAvailableException", "UnableToSaveException", "a", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class EditExercisesMultiSelectViewModel extends u1 {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final /* synthetic */ int f29788p = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f29789a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final x0 f29790b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ExerciseSetsDTO f29791c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final c f29792d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final d f29793e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final s f29794f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final t f29795g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f29796h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final l2<Integer> f29797i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final l2<List<x>> f29798j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final y0<g3<ExerciseSetsDTO>> f29799k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Object f29800l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public ExerciseSetsDTO f29801m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final y0<List<u0>> f29802n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public List<u0> f29803o;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00060\u0001j\u0002`\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/garmin/android/apps/connectmobile/activities/stats/EditExercisesMultiSelectViewModel$NoNetworkAvailableException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "<init>", "()V", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class NoNetworkAvailableException extends Exception {
        public static final int $stable = 8;
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00060\u0001j\u0002`\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/garmin/android/apps/connectmobile/activities/stats/EditExercisesMultiSelectViewModel$UnableToSaveException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "<init>", "()V", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class UnableToSaveException extends Exception {
        public static final int $stable = 8;
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lcom/garmin/android/apps/connectmobile/activities/stats/EditExercisesMultiSelectViewModel$b;", "Landroidx/lifecycle/x1$c;", "", "activityId", "Lam/x0;", "activityType", "Lcom/garmin/android/apps/connectmobile/repcounting/model/ExerciseSetsDTO;", "exercisesSetsDTO", "Lcom/garmin/android/apps/connectmobile/repcounting/model/c;", "exerciseListDTO", "Lcom/garmin/android/apps/connectmobile/repcounting/model/d;", "addedExerciseListItemDTO", "<init>", "(JLam/x0;Lcom/garmin/android/apps/connectmobile/repcounting/model/ExerciseSetsDTO;Lcom/garmin/android/apps/connectmobile/repcounting/model/c;Lcom/garmin/android/apps/connectmobile/repcounting/model/d;)V", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class b implements x1.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f29804a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final x0 f29805b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final ExerciseSetsDTO f29806c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final c f29807d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final d f29808e;

        public b(long j8, x0 x0Var, ExerciseSetsDTO exerciseSetsDTO, c cVar, d dVar) {
            this.f29804a = j8;
            this.f29805b = x0Var;
            this.f29806c = exerciseSetsDTO;
            this.f29807d = cVar;
            this.f29808e = dVar;
        }

        @Override // androidx.lifecycle.x1.c
        public final <T extends u1> T create(Class<T> cls, CreationExtras creationExtras) {
            return new EditExercisesMultiSelectViewModel(this.f29804a, this.f29805b, this.f29806c, this.f29807d, this.f29808e, null, 32, null);
        }
    }

    static {
        new a(null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v1, types: [p13.j0] */
    /* JADX WARN: Type inference failed for: r3v3, types: [java.util.ArrayList] */
    public EditExercisesMultiSelectViewModel(long j8, x0 x0Var, ExerciseSetsDTO exerciseSetsDTO, c cVar, d dVar, s sVar) {
        Object arrayList;
        d[] dVarArrF;
        sVar.getClass();
        this.f29789a = j8;
        this.f29790b = x0Var;
        this.f29791c = exerciseSetsDTO;
        this.f29792d = cVar;
        this.f29793e = dVar;
        this.f29794f = sVar;
        this.f29795g = m.b(new ak0.t(12));
        this.f29797i = new l2<>();
        this.f29798j = new l2<>();
        this.f29799k = new y0<>();
        if (cVar == null || (dVarArrF = cVar.F()) == null) {
            arrayList = j0.f134944a;
        } else {
            arrayList = new ArrayList(dVarArrF.length);
            for (d dVar2 : dVarArrF) {
                arrayList.add(dVar2);
            }
        }
        this.f29800l = arrayList;
        this.f29802n = new y0<>();
        this.f29803o = Util.immutableListOf(new u0[0]);
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, java.util.List] */
    public final d A4(d dVar) {
        return zf.b.n(dVar != null ? dVar.f41102a : null, dVar != null ? dVar.f41104c : null, this.f29800l);
    }

    public final int B4() {
        List<u0> list = this.f29803o;
        int i14 = 0;
        if (list != null && list.isEmpty()) {
            return 0;
        }
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            if (((u0) it.next()).f12254c && (i14 = i14 + 1) < 0) {
                p13.x.p();
                throw null;
            }
        }
        return i14;
    }

    public final Object C4(v13.c cVar) throws Throwable {
        List<u0> list = this.f29803o;
        ArrayList arrayList = new ArrayList(y.r(list, 10));
        int i14 = 0;
        for (Object obj : list) {
            int i15 = i14 + 1;
            if (i14 < 0) {
                p13.x.q();
                throw null;
            }
            arrayList.add(u0.a((u0) obj, null, false, i14 % 2 == 0 ? R.color.gcm_surface_2 : R.color.gcm_background, 7));
            i14 = i15;
        }
        this.f29803o = arrayList;
        x53.c cVar2 = s0.f129406a;
        Object objE0 = ge1.b.e0(o.f168762a, new z0(this, null), cVar);
        return objE0 == u13.a.COROUTINE_SUSPENDED ? objE0 : Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0084, code lost:
    
        if (C4(r0) == r1) goto L31;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object D4(List list, v13.c cVar) {
        b1 b1Var;
        if (cVar instanceof b1) {
            b1Var = (b1) cVar;
            int i14 = b1Var.f11834c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                b1Var.f11834c = i14 - Integer.MIN_VALUE;
            } else {
                b1Var = new b1(this, cVar);
            }
        } else {
            b1Var = new b1(this, cVar);
        }
        Object obj = b1Var.f11832a;
        Object obj2 = u13.a.COROUTINE_SUSPENDED;
        int i15 = b1Var.f11834c;
        if (i15 != 0) {
            if (i15 == 1) {
                r.b(obj);
            } else {
                if (i15 != 2) {
                    h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r.b(obj);
            }
            return Unit.INSTANCE;
        }
        r.b(obj);
        ArrayList arrayListD1 = h0.d1(this.f29803o);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            int iIntValue = ((Number) it.next()).intValue();
            if (iIntValue < 0 || iIntValue >= this.f29803o.size()) {
                h.x(j.h(iIntValue, "Invalid index found: "));
                return null;
            }
            arrayListD1.remove(iIntValue);
        }
        this.f29803o = arrayListD1;
        x53.c cVar2 = s0.f129406a;
        t1 t1Var = o.f168762a;
        c1 c1Var = new c1(this, null);
        b1Var.f11834c = 1;
        if (ge1.b.e0(t1Var, c1Var, b1Var) != obj2) {
        }
        return obj2;
        b1Var.f11834c = 2;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object E4(v13.c cVar) {
        d1 d1Var;
        if (cVar instanceof d1) {
            d1Var = (d1) cVar;
            int i14 = d1Var.f11902c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                d1Var.f11902c = i14 - Integer.MIN_VALUE;
            } else {
                d1Var = new d1(this, cVar);
            }
        } else {
            d1Var = new d1(this, cVar);
        }
        Object obj = d1Var.f11900a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = d1Var.f11902c;
        if (i15 == 0) {
            r.b(obj);
            List<u0> list = this.f29803o;
            ArrayList arrayList = new ArrayList(y.r(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(u0.a((u0) it.next(), null, true, 0, 11));
            }
            this.f29803o = arrayList;
            x53.c cVar2 = s0.f129406a;
            t1 t1Var = o.f168762a;
            e1 e1Var = new e1(this, null);
            d1Var.f11902c = 1;
            if (ge1.b.e0(t1Var, e1Var, d1Var) == aVar) {
                return aVar;
            }
        } else {
            if (i15 != 1) {
                h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r.b(obj);
        }
        this.f29797i.j(Integer.valueOf(B4()));
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0097, code lost:
    
        if (x4(r0) == r1) goto L27;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object F4(int i14, int i15, boolean z14, v13.c cVar) {
        f1 f1Var;
        if (cVar instanceof f1) {
            f1Var = (f1) cVar;
            int i16 = f1Var.f11936f;
            if ((i16 & Integer.MIN_VALUE) != 0) {
                f1Var.f11936f = i16 - Integer.MIN_VALUE;
            } else {
                f1Var = new f1(this, cVar);
            }
        } else {
            f1Var = new f1(this, cVar);
        }
        Object obj = f1Var.f11934d;
        Object obj2 = u13.a.COROUTINE_SUSPENDED;
        int i17 = f1Var.f11936f;
        if (i17 != 0) {
            if (i17 == 1) {
                z14 = f1Var.f11933c;
                i15 = f1Var.f11932b;
                i14 = f1Var.f11931a;
                r.b(obj);
            } else {
                if (i17 != 2) {
                    h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r.b(obj);
            }
            return Unit.INSTANCE;
        }
        r.b(obj);
        if (i14 < 0 || i14 >= this.f29803o.size()) {
            h.x(j.h(i14, "Invalid index found: "));
            return null;
        }
        u0 u0Var = this.f29803o.get(i14);
        e eVarC = u0Var.f12253b.C();
        eVarC.g0(new Double(i15));
        ArrayList arrayListD1 = h0.d1(this.f29803o);
        arrayListD1.set(i14, u0.a(u0Var, eVarC, false, 0, 13));
        this.f29803o = arrayListD1;
        if (!z14) {
            return Unit.INSTANCE;
        }
        x53.c cVar2 = s0.f129406a;
        t1 t1Var = o.f168762a;
        g1 g1Var = new g1(this, null);
        f1Var.f11931a = i14;
        f1Var.f11932b = i15;
        f1Var.f11933c = z14;
        f1Var.f11936f = 1;
        if (ge1.b.e0(t1Var, g1Var, f1Var) != obj2) {
        }
        return obj2;
        f1Var.f11931a = i14;
        f1Var.f11932b = i15;
        f1Var.f11933c = z14;
        f1Var.f11936f = 2;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001f  */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0152, code lost:
    
        if (x4(r6) == r7) goto L66;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object G4(int i14, Long l14, d dVar, boolean z14, v13.c cVar) {
        h1 h1Var;
        d dVarA4;
        p pVar;
        long jLongValue;
        boolean z15;
        int i15 = i14;
        if (cVar instanceof h1) {
            h1Var = (h1) cVar;
            int i16 = h1Var.f11978f;
            if ((i16 & Integer.MIN_VALUE) != 0) {
                h1Var.f11978f = i16 - Integer.MIN_VALUE;
            } else {
                h1Var = new h1(this, cVar);
            }
        } else {
            h1Var = new h1(this, cVar);
        }
        Object obj = h1Var.f11976d;
        Object obj2 = u13.a.COROUTINE_SUSPENDED;
        int i17 = h1Var.f11978f;
        if (i17 != 0) {
            if (i17 == 1) {
                long j8 = h1Var.f11975c;
                z15 = h1Var.f11974b;
                int i18 = h1Var.f11973a;
                r.b(obj);
                jLongValue = j8;
                i15 = i18;
            } else {
                if (i17 != 2) {
                    h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r.b(obj);
            }
            return Unit.INSTANCE;
        }
        r.b(obj);
        if (i15 < 0 || i15 >= this.f29803o.size()) {
            h.x(j.h(i15, "Invalid index found: "));
            return null;
        }
        u0 u0Var = this.f29803o.get(i15);
        e eVar = u0Var.f12253b;
        eVar.getClass();
        if (dVar == null || !p005kotlin.jvm.internal.s.g(eVar.f41115e, dVar.f41102a) || (!p005kotlin.jvm.internal.s.g(eVar.f41116f, dVar.f41106e) && !p005kotlin.jvm.internal.s.g(eVar.f41116f, dVar.f41104c))) {
            ((ht.a) this.f29795g.getValue()).getClass();
            ht.a.a(null, "ExerciseEdited");
        }
        boolean z16 = dVar != null ? dVar.f41105d : false;
        if (l14 != null) {
            pVar = new p(dVar, l14);
        } else {
            Long lZ = eVar.Z();
            if (lZ == null || lZ.longValue() <= 0.0d) {
                lZ = null;
            }
            if (lZ == null) {
                pVar = new p(dVar, Long.valueOf(z16 ? -1L : -2L));
            } else {
                pVar = (z16 && (dVarA4 = A4(dVar)) != null) ? new p(dVarA4, lZ) : new p(dVar, lZ);
            }
        }
        d dVar2 = (d) pVar.f128594a;
        jLongValue = ((Number) pVar.f128595b).longValue();
        e eVarP = dVar2 != null ? gl.b.P(dVar2) : eVar.C();
        eVarP.g0(eVar.D());
        eVarP.i0(eVar.H());
        eVarP.j0(eVar.I());
        eVarP.n0(new Long(jLongValue));
        ArrayList arrayListD1 = h0.d1(this.f29803o);
        arrayListD1.set(i15, u0.a(u0Var, eVarP, false, 0, 13));
        this.f29803o = arrayListD1;
        if (!z14) {
            return Unit.INSTANCE;
        }
        x53.c cVar2 = s0.f129406a;
        t1 t1Var = o.f168762a;
        i1 i1Var = new i1(this, null);
        h1Var.f11973a = i15;
        h1Var.f11974b = z14;
        h1Var.f11975c = jLongValue;
        h1Var.f11978f = 1;
        if (ge1.b.e0(t1Var, i1Var, h1Var) != obj2) {
            z15 = z14;
        }
        return obj2;
        h1Var.f11973a = i15;
        h1Var.f11974b = z15;
        h1Var.f11975c = jLongValue;
        h1Var.f11978f = 2;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00c1, code lost:
    
        if (x4(r0) == r1) goto L33;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object H4(int i14, long j8, boolean z14, v13.c cVar) {
        j1 j1Var;
        if (cVar instanceof j1) {
            j1Var = (j1) cVar;
            int i15 = j1Var.f12023f;
            if ((i15 & Integer.MIN_VALUE) != 0) {
                j1Var.f12023f = i15 - Integer.MIN_VALUE;
            } else {
                j1Var = new j1(this, cVar);
            }
        } else {
            j1Var = new j1(this, cVar);
        }
        Object obj = j1Var.f12021d;
        Object obj2 = u13.a.COROUTINE_SUSPENDED;
        int i16 = j1Var.f12023f;
        if (i16 != 0) {
            if (i16 == 1) {
                z14 = j1Var.f12020c;
                j8 = j1Var.f12019b;
                i14 = j1Var.f12018a;
                r.b(obj);
            } else {
                if (i16 != 2) {
                    h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r.b(obj);
            }
            return Unit.INSTANCE;
        }
        r.b(obj);
        if (i14 < 0 || i14 >= this.f29803o.size()) {
            h.x(j.h(i14, "Invalid index found: "));
            return null;
        }
        Long lH = this.f29803o.get(i14).f12253b.H();
        if (lH == null || lH.longValue() != j8) {
            ((ht.a) this.f29795g.getValue()).getClass();
            ht.a.a(null, "ExerciseRepEdited");
        }
        u0 u0Var = this.f29803o.get(i14);
        e eVarC = u0Var.f12253b.C();
        eVarC.i0(new Long(j8));
        ArrayList arrayListD1 = h0.d1(this.f29803o);
        arrayListD1.set(i14, u0.a(u0Var, eVarC, false, 0, 13));
        this.f29803o = arrayListD1;
        if (!z14) {
            return Unit.INSTANCE;
        }
        x53.c cVar2 = s0.f129406a;
        t1 t1Var = o.f168762a;
        k1 k1Var = new k1(this, null);
        j1Var.f12018a = i14;
        j1Var.f12019b = j8;
        j1Var.f12020c = z14;
        j1Var.f12023f = 1;
        if (ge1.b.e0(t1Var, k1Var, j1Var) != obj2) {
        }
        return obj2;
        j1Var.f12018a = i14;
        j1Var.f12019b = j8;
        j1Var.f12020c = z14;
        j1Var.f12023f = 2;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object I4(int i14, boolean z14, v13.c cVar) {
        l1 l1Var;
        if (cVar instanceof l1) {
            l1Var = (l1) cVar;
            int i15 = l1Var.f12040c;
            if ((i15 & Integer.MIN_VALUE) != 0) {
                l1Var.f12040c = i15 - Integer.MIN_VALUE;
            } else {
                l1Var = new l1(this, cVar);
            }
        } else {
            l1Var = new l1(this, cVar);
        }
        Object obj = l1Var.f12038a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i16 = l1Var.f12040c;
        if (i16 == 0) {
            r.b(obj);
            if (i14 < 0 || i14 >= this.f29803o.size()) {
                h.x(j.h(i14, "Invalid index found: "));
                return null;
            }
            ArrayList arrayListD1 = h0.d1(this.f29803o);
            arrayListD1.set(i14, u0.a((u0) arrayListD1.get(i14), null, z14, 0, 11));
            this.f29803o = arrayListD1;
            x53.c cVar2 = s0.f129406a;
            t1 t1Var = o.f168762a;
            m1 m1Var = new m1(this, null);
            l1Var.f12040c = 1;
            if (ge1.b.e0(t1Var, m1Var, l1Var) == aVar) {
                return aVar;
            }
        } else {
            if (i16 != 1) {
                h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r.b(obj);
        }
        this.f29797i.j(Integer.valueOf(B4()));
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object x4(v13.c cVar) {
        w0 w0Var;
        if (cVar instanceof w0) {
            w0Var = (w0) cVar;
            int i14 = w0Var.f12278c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                w0Var.f12278c = i14 - Integer.MIN_VALUE;
            } else {
                w0Var = new w0(this, cVar);
            }
        } else {
            w0Var = new w0(this, cVar);
        }
        Object obj = w0Var.f12276a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = w0Var.f12278c;
        if (i15 == 0) {
            r.b(obj);
            List<u0> list = this.f29803o;
            ArrayList arrayList = new ArrayList(y.r(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(u0.a((u0) it.next(), null, false, 0, 11));
            }
            this.f29803o = arrayList;
            x53.c cVar2 = s0.f129406a;
            t1 t1Var = o.f168762a;
            aq.x0 x0Var = new aq.x0(this, null);
            w0Var.f12278c = 1;
            if (ge1.b.e0(t1Var, x0Var, w0Var) == aVar) {
                return aVar;
            }
        } else {
            if (i15 != 1) {
                h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r.b(obj);
        }
        this.f29797i.j(Integer.valueOf(B4()));
        return Unit.INSTANCE;
    }

    public final void y4() {
        List arrayList;
        e[] eVarArr;
        ExerciseSetsDTO exerciseSetsDTO = this.f29801m;
        if (exerciseSetsDTO == null || (eVarArr = exerciseSetsDTO.f41089a) == null) {
            arrayList = j0.f134944a;
        } else {
            arrayList = new ArrayList();
            for (e eVar : eVarArr) {
                if (!eVar.f0()) {
                    arrayList.add(eVar);
                }
            }
        }
        List<u0> list = this.f29803o;
        ArrayList arrayList2 = new ArrayList(y.r(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList2.add(((u0) it.next()).f12253b);
        }
        if (arrayList.size() != arrayList2.size()) {
            this.f29796h = true;
            return;
        }
        int i14 = 0;
        for (Object obj : arrayList) {
            int i15 = i14 + 1;
            if (i14 < 0) {
                p13.x.q();
                throw null;
            }
            e eVar2 = (e) obj;
            e eVar3 = (e) arrayList2.get(i14);
            double dA = f.a(eVar2.Z());
            double dA2 = f.a(eVar3.Z());
            if (!p005kotlin.jvm.internal.s.g(eVar2.f41115e, eVar3.f41115e) || !p005kotlin.jvm.internal.s.g(eVar2.f41116f, eVar3.f41116f) || !p005kotlin.jvm.internal.s.d(eVar2.D(), eVar3.D()) || !p005kotlin.jvm.internal.s.g(eVar2.H(), eVar3.H()) || dA != dA2) {
                this.f29796h = true;
                return;
            } else {
                this.f29796h = false;
                i14 = i15;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0086  */
    /* JADX WARN: Code duplicated, block: B:27:0x0094  */
    /* JADX WARN: Code duplicated, block: B:67:0x0178  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:64:0x016e -> B:65:0x0171). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:66:0x0175 -> B:68:0x017a). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object z4(java.util.List r18, v13.c r19) {
        /*
            Method dump skipped, instruction units count: 415
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.garmin.android.apps.connectmobile.activities.stats.EditExercisesMultiSelectViewModel.z4(java.util.List, v13.c):java.lang.Object");
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/garmin/android/apps/connectmobile/activities/stats/EditExercisesMultiSelectViewModel$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }

    public /* synthetic */ EditExercisesMultiSelectViewModel(long j8, x0 x0Var, ExerciseSetsDTO exerciseSetsDTO, c cVar, d dVar, s sVar, int i14, p005kotlin.jvm.internal.j jVar) {
        this(j8, x0Var, exerciseSetsDTO, cVar, dVar, (i14 & 32) != 0 ? s.a.a(s.f55945b) : sVar);
    }
}
