package ey1;

import android.app.Activity;
import c22.a4;
import c22.j0;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.v2;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import o53.b0;
import o53.e1;
import o53.m0;
import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p13.h0;
import p13.y;
import r53.b2;
import r53.p2;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.training.stp.presentation.viewmodel.SetupStrengthTrainingPlanViewModel$createStrengthTrainingPlan$1", f = "SetupStrengthTrainingPlanViewModel.kt", l = {662, 707, 708, 726}, m = "invokeSuspend", v = 2)
public final class c extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public v2 f67302a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f67303b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ey1.a f67304c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ e23.a<Unit> f67305d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Activity f67306e;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.training.stp.presentation.viewmodel.SetupStrengthTrainingPlanViewModel$createStrengthTrainingPlan$1$1", f = "SetupStrengthTrainingPlanViewModel.kt", l = {720}, m = "invokeSuspend", v = 2)
    public static final class a extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f67307a;

        public a(t13.d<? super a> dVar) {
            super(2, dVar);
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new a(dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return new a(dVar).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f67307a;
            if (i14 == 0) {
                o13.r.b(obj);
                this.f67307a = 1;
                if (m0.b(2000L, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i14 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                o13.r.b(obj);
            }
            sn.a.o(f12.l.f68084a, true);
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(ey1.a aVar, e23.a<Unit> aVar2, Activity activity, t13.d<? super c> dVar) {
        super(2, dVar);
        this.f67304c = aVar;
        this.f67305d = aVar2;
        this.f67306e = activity;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new c(this.f67304c, this.f67305d, this.f67306e, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((c) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:104:0x01a1  */
    /* JADX WARN: Code duplicated, block: B:261:0x049f A[PHI: r2 r5
      0x049f: PHI (r2v13 com.garmin.android.apps.connectmobile.v2) = (r2v12 com.garmin.android.apps.connectmobile.v2), (r2v22 com.garmin.android.apps.connectmobile.v2) binds: [B:259:0x049c, B:11:0x0023] A[DONT_GENERATE, DONT_INLINE]
      0x049f: PHI (r5v41 ??) = (r5v40 ??), (r5v45 ??) binds: [B:259:0x049c, B:11:0x0023] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:263:0x04a3  */
    /* JADX WARN: Code duplicated, block: B:264:0x04be  */
    /* JADX WARN: Code duplicated, block: B:267:0x04e3  */
    /* JADX WARN: Code duplicated, block: B:52:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:78:0x0147  */
    /* JADX WARN: Code restructure failed: missing block: B:268:0x04e5, code lost:
    
        if (r2 == r1) goto L269;
     */
    /* JADX WARN: Type inference failed for: r5v40 */
    /* JADX WARN: Type inference failed for: r5v41, types: [android.os.Bundle, o53.d0, t13.d, t13.g] */
    /* JADX WARN: Type inference failed for: r5v45 */
    @Override // v13.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        String str;
        Object objM;
        mx1.e eVar;
        Object next;
        boolean z14;
        Object next2;
        boolean z15;
        Object next3;
        boolean z16;
        Object next4;
        o13.p<String, String> next5;
        Object next6;
        ArrayList arrayList;
        Object next7;
        ArrayList arrayListS;
        Object next8;
        String str2;
        ix1.j jVar;
        a4 a4Var;
        String str3;
        String str4;
        String str5;
        mx1.b bVar;
        dy1.u uVar;
        i53.c<dy1.h> cVar;
        dy1.h next9;
        dy1.u uVar2;
        i53.c<dy1.h> cVar2;
        dy1.h next10;
        dy1.u uVar3;
        i53.c<dy1.h> cVar3;
        dy1.h next11;
        v2 v2Var;
        ?? r14;
        Object objEmit;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f67303b;
        boolean z17 = true;
        ey1.a aVar2 = this.f67304c;
        if (i14 == 0) {
            o13.r.b(obj);
            p2 p2Var = aVar2.f67273e;
            Boolean bool = Boolean.TRUE;
            this.f67303b = 1;
            p2Var.k(null, bool);
            if (Unit.INSTANCE != aVar) {
            }
            return aVar;
        }
        if (i14 == 1) {
            o13.r.b(obj);
        } else {
            if (i14 == 2) {
                o13.r.b(obj);
                objM = obj;
                v2Var = (v2) objM;
                p2 p2Var2 = aVar2.f67273e;
                Boolean bool2 = Boolean.FALSE;
                this.f67302a = v2Var;
                this.f67303b = 3;
                r14 = 0;
                p2Var2.k(null, bool2);
                if (Unit.INSTANCE != aVar) {
                    if (v2Var instanceof v2.b) {
                        ht.a.f85464a.getClass();
                        ht.a.a(r14, "STPEndSetUp");
                        ge1.b.T(e1.f129333a, r14, r14, new a(r14), 3);
                        this.f67305d.invoke();
                    } else {
                        nx1.p pVar = aVar2.f67284p;
                        dy1.o oVar = new dy1.o(this.f67306e.getString(R.string.txt_error_occurred), null, null, 6, null);
                        this.f67302a = null;
                        this.f67303b = 4;
                        objEmit = pVar.f128251a.emit(oVar, this);
                        if (objEmit != u13.a.COROUTINE_SUSPENDED) {
                            objEmit = Unit.INSTANCE;
                        }
                    }
                }
                return aVar;
            }
            if (i14 == 3) {
                v2Var = this.f67302a;
                o13.r.b(obj);
                r14 = 0;
                if (v2Var instanceof v2.b) {
                    ht.a.f85464a.getClass();
                    ht.a.a(r14, "STPEndSetUp");
                    ge1.b.T(e1.f129333a, r14, r14, new a(r14), 3);
                    this.f67305d.invoke();
                } else {
                    nx1.p pVar2 = aVar2.f67284p;
                    dy1.o oVar2 = new dy1.o(this.f67306e.getString(R.string.txt_error_occurred), null, null, 6, null);
                    this.f67302a = null;
                    this.f67303b = 4;
                    objEmit = pVar2.f128251a.emit(oVar2, this);
                    if (objEmit != u13.a.COROUTINE_SUSPENDED) {
                        objEmit = Unit.INSTANCE;
                    }
                }
            } else {
                if (i14 != 4) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                o13.r.b(obj);
            }
        }
        return Unit.INSTANCE;
        b2 b2Var = aVar2.C;
        b2 b2Var2 = aVar2.f67289w;
        Iterable iterable = (Iterable) b2Var.f150540a.getValue();
        ArrayList<dy1.q> arrayList2 = new ArrayList();
        for (Object obj2 : iterable) {
            if (((dy1.q) obj2).f61607c != null) {
                arrayList2.add(obj2);
            }
        }
        int i15 = 10;
        ArrayList arrayList3 = new ArrayList(y.r(arrayList2, 10));
        for (dy1.q qVar : arrayList2) {
            boolean z18 = z17;
            b2 b2Var3 = aVar2.A;
            Iterator it = ((Iterable) b2Var3.f150540a.getValue()).iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (((dy1.v) next).f61640a != qVar.f61607c);
            dy1.v vVar = (dy1.v) next;
            if (vVar == null || (uVar3 = vVar.f61641b) == null || (cVar3 = uVar3.f61639a) == null) {
                z14 = false;
            } else {
                Iterator<dy1.h> it3 = cVar3.iterator();
                do {
                    if (!it3.hasNext()) {
                        next11 = null;
                        break;
                    }
                    next11 = it3.next();
                } while (!p005kotlin.jvm.internal.s.g(next11.f61556a, mx1.i.WARM_UP_CARDIO.f121446a));
                dy1.h hVar = next11;
                if (hVar == null || hVar.f61561f) {
                    z14 = false;
                } else {
                    z14 = z18;
                }
            }
            boolean z19 = !z14;
            Iterator it4 = ((Iterable) b2Var3.f150540a.getValue()).iterator();
            do {
                if (!it4.hasNext()) {
                    next2 = null;
                    break;
                }
                next2 = it4.next();
            } while (((dy1.v) next2).f61640a != qVar.f61607c);
            dy1.v vVar2 = (dy1.v) next2;
            if (vVar2 == null || (uVar2 = vVar2.f61641b) == null || (cVar2 = uVar2.f61639a) == null) {
                z15 = false;
            } else {
                Iterator<dy1.h> it5 = cVar2.iterator();
                do {
                    if (!it5.hasNext()) {
                        next10 = null;
                        break;
                    }
                    next10 = it5.next();
                } while (!p005kotlin.jvm.internal.s.g(next10.f61556a, mx1.i.MUSCLE_ACTIVATION.f121446a));
                dy1.h hVar2 = next10;
                if (hVar2 == null || hVar2.f61561f) {
                    z15 = false;
                } else {
                    z15 = z18;
                }
            }
            boolean z24 = !z15;
            Iterator it6 = ((Iterable) b2Var3.f150540a.getValue()).iterator();
            do {
                if (!it6.hasNext()) {
                    next3 = null;
                    break;
                }
                next3 = it6.next();
            } while (((dy1.v) next3).f61640a != qVar.f61607c);
            dy1.v vVar3 = (dy1.v) next3;
            if (vVar3 == null || (uVar = vVar3.f61643d) == null || (cVar = uVar.f61639a) == null) {
                z16 = false;
            } else {
                Iterator<dy1.h> it7 = cVar.iterator();
                do {
                    if (!it7.hasNext()) {
                        next9 = null;
                        break;
                    }
                    next9 = it7.next();
                } while (!p005kotlin.jvm.internal.s.g(next9.f61556a, mx1.i.COOLDOWN.f121446a));
                dy1.h hVar3 = next9;
                if (hVar3 == null || hVar3.f61561f) {
                    z16 = false;
                } else {
                    z16 = z18;
                }
            }
            boolean z25 = !z16;
            Iterator it8 = ((Iterable) b2Var3.f150540a.getValue()).iterator();
            do {
                if (!it8.hasNext()) {
                    next4 = null;
                    break;
                }
                next4 = it8.next();
            } while (((dy1.v) next4).f61640a != qVar.f61607c);
            dy1.v vVar4 = (dy1.v) next4;
            long j8 = vVar4 != null ? vVar4.f61645f : 0L;
            Iterator<o13.p<String, String>> it9 = ((dy1.p) b2Var2.f150540a.getValue()).f61604j.iterator();
            do {
                if (!it9.hasNext()) {
                    next5 = null;
                    break;
                }
                next5 = it9.next();
                str5 = next5.f128594a;
                bVar = qVar.f61607c;
            } while (!p005kotlin.jvm.internal.s.g(str5, bVar != null ? bVar.f121366a : null));
            o13.p<String, String> pVar3 = next5;
            String str6 = (pVar3 == null || (str4 = pVar3.f128595b) == null) ? "" : str4;
            a4 a4Var2 = qVar.f61605a;
            mx1.b bVar2 = qVar.f61607c;
            Iterator it10 = ((Iterable) b2Var3.f150540a.getValue()).iterator();
            do {
                if (!it10.hasNext()) {
                    next6 = null;
                    break;
                }
                next6 = it10.next();
            } while (((dy1.v) next6).f61640a != bVar2);
            dy1.v vVar5 = (dy1.v) next6;
            if (vVar5 != null) {
                i53.c<dy1.u> cVar4 = vVar5.f61642c;
                ArrayList<List> arrayList4 = new ArrayList(y.r(cVar4, i15));
                Iterator<dy1.u> it11 = cVar4.iterator();
                while (it11.hasNext()) {
                    i53.c<dy1.h> cVar5 = it11.next().f61639a;
                    ArrayList arrayList5 = new ArrayList();
                    for (dy1.h hVar4 : cVar5) {
                        if (hVar4.f61561f) {
                            arrayList5.add(hVar4);
                        }
                    }
                    arrayList4.add(arrayList5);
                }
                ArrayList arrayList6 = new ArrayList(y.r(arrayList4, 10));
                int size = 0;
                for (List list : arrayList4) {
                    Iterator it12 = list.iterator();
                    int i16 = 0;
                    while (true) {
                        if (!it12.hasNext()) {
                            a4Var = a4Var2;
                            i16 = -1;
                            break;
                        }
                        a4Var = a4Var2;
                        if (((dy1.h) it12.next()).f61558c) {
                            break;
                        }
                        i16++;
                        a4Var2 = a4Var;
                    }
                    int i17 = size + i16;
                    dy1.h hVar5 = (dy1.h) h0.e0(i16, list);
                    if (hVar5 == null || (str3 = hVar5.f61556a) == null) {
                        str3 = "";
                    }
                    ix1.i iVar = new ix1.i(i17, str3);
                    size += list.size();
                    arrayList6.add(iVar);
                    a4Var2 = a4Var;
                }
                arrayList = arrayList6;
            } else {
                arrayList = null;
            }
            a4 a4Var3 = a4Var2;
            Iterator it13 = ((Iterable) b2Var3.f150540a.getValue()).iterator();
            do {
                if (!it13.hasNext()) {
                    next7 = null;
                    break;
                }
                next7 = it13.next();
            } while (((dy1.v) next7).f61640a != bVar2);
            dy1.v vVar6 = (dy1.v) next7;
            if (vVar6 != null) {
                i53.c<dy1.u> cVar6 = vVar6.f61642c;
                ArrayList<List> arrayList7 = new ArrayList(y.r(cVar6, 10));
                Iterator<dy1.u> it14 = cVar6.iterator();
                while (it14.hasNext()) {
                    i53.c<dy1.h> cVar7 = it14.next().f61639a;
                    ArrayList arrayList8 = new ArrayList();
                    for (dy1.h hVar6 : cVar7) {
                        if (hVar6.f61561f) {
                            arrayList8.add(hVar6);
                        }
                    }
                    arrayList7.add(arrayList8);
                }
                ArrayList arrayList9 = new ArrayList(y.r(arrayList7, 10));
                int i18 = 0;
                for (List<dy1.h> list2 : arrayList7) {
                    Iterator it15 = list2.iterator();
                    do {
                        if (!it15.hasNext()) {
                            next8 = null;
                            break;
                        }
                        next8 = it15.next();
                    } while (!((dy1.h) next8).f61558c);
                    dy1.h hVar7 = (dy1.h) next8;
                    if (hVar7 == null || (str2 = hVar7.f61556a) == null) {
                        str2 = "";
                    }
                    ArrayList arrayList10 = new ArrayList();
                    for (dy1.h hVar8 : list2) {
                        if (hVar8.f61558c) {
                            i18++;
                            jVar = null;
                        } else {
                            int i19 = i18 + 1;
                            String str7 = hVar8.f61557b;
                            if (str7 == null) {
                                str7 = "";
                            }
                            jVar = new ix1.j(i18, str2, str7, hVar8.f61556a);
                            i18 = i19;
                        }
                        if (jVar != null) {
                            arrayList10.add(jVar);
                        }
                    }
                    arrayList9.add(arrayList10);
                }
                arrayListS = y.s(arrayList9);
            } else {
                arrayListS = null;
            }
            arrayList3.add(new ix1.f(a4Var3, str6, j8, arrayList, arrayListS, z19, z24, z25));
            z17 = z18;
            i15 = 10;
        }
        String str8 = ((dy1.p) b2Var2.f150540a.getValue()).f61603i;
        String str9 = str8 == null ? "" : str8;
        mx1.f fVar = ((dy1.p) b2Var2.f150540a.getValue()).f61598d;
        String str10 = fVar != null ? fVar.f121396b : "";
        mx1.f fVar2 = ((dy1.p) b2Var2.f150540a.getValue()).f61598d;
        if (fVar2 == null || (eVar = fVar2.f121399e) == null || (str = eVar.f121392a) == null) {
            str = "";
        }
        Long l14 = ((dy1.p) b2Var2.f150540a.getValue()).f61601g;
        long jLongValue = l14 != null ? l14.longValue() : 0L;
        DateTimeZone dateTimeZone = DateTimeZone.UTC;
        String strB = j0.b(new DateTime(jLongValue, dateTimeZone), "yyyy-MM-dd", dateTimeZone);
        if (strB == null) {
            strB = "";
        }
        Long l15 = ((dy1.p) b2Var2.f150540a.getValue()).f61602h;
        String strB2 = j0.b(new DateTime(l15 != null ? l15.longValue() : 0L, dateTimeZone), "yyyy-MM-dd", dateTimeZone);
        String str11 = strB2 == null ? "" : strB2;
        Boolean bool3 = ((dy1.p) b2Var2.f150540a.getValue()).f61599e;
        Boolean bool4 = Boolean.TRUE;
        ix1.h hVar9 = new ix1.h(str9, "Strength", str10, str, strB, str11, p005kotlin.jvm.internal.s.g(bool3, bool4), p005kotlin.jvm.internal.s.g(((dy1.p) b2Var2.f150540a.getValue()).f61600f, bool4), arrayList3);
        lx1.a aVar3 = aVar2.f67269a;
        this.f67303b = 2;
        objM = aVar3.m(hVar9, this);
        if (objM != aVar) {
            v2Var = (v2) objM;
            p2 p2Var3 = aVar2.f67273e;
            Boolean bool5 = Boolean.FALSE;
            this.f67302a = v2Var;
            this.f67303b = 3;
            r14 = 0;
            p2Var3.k(null, bool5);
            if (Unit.INSTANCE != aVar) {
                if (v2Var instanceof v2.b) {
                    ht.a.f85464a.getClass();
                    ht.a.a(r14, "STPEndSetUp");
                    ge1.b.T(e1.f129333a, r14, r14, new a(r14), 3);
                    this.f67305d.invoke();
                } else {
                    nx1.p pVar4 = aVar2.f67284p;
                    dy1.o oVar3 = new dy1.o(this.f67306e.getString(R.string.txt_error_occurred), null, null, 6, null);
                    this.f67302a = null;
                    this.f67303b = 4;
                    objEmit = pVar4.f128251a.emit(oVar3, this);
                    if (objEmit != u13.a.COROUTINE_SUSPENDED) {
                        objEmit = Unit.INSTANCE;
                    }
                }
                return Unit.INSTANCE;
            }
        }
        return aVar;
    }
}
