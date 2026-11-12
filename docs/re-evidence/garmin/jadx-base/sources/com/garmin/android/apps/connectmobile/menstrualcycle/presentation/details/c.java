package com.garmin.android.apps.connectmobile.menstrualcycle.presentation.details;

import androidx.lifecycle.y0;
import c22.h0;
import e23.p;
import hx0.o;
import hx0.s0;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import o13.r;
import o53.b0;
import o53.c2;
import o53.f0;
import org.joda.time.LocalDate;
import org.joda.time.ReadablePartial;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import ww0.l;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.menstrualcycle.presentation.details.MenstrualCycleCalendarViewModel$getCyclesForRange$1$1", f = "MenstrualCycleCalendarViewModel.kt", l = {106}, m = "invokeSuspend", v = 2)
public final class c extends v13.i implements p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f38898a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b f38899b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ h0 f38900c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ y0<cx0.a<b.a>> f38901d;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.menstrualcycle.presentation.details.MenstrualCycleCalendarViewModel$getCyclesForRange$1$1$1", f = "MenstrualCycleCalendarViewModel.kt", l = {108, 109}, m = "invokeSuspend", v = 2)
    public static final class a extends v13.i implements p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f38902a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ b f38903b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ h0 f38904c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ y0<cx0.a<b.a>> f38905d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(b bVar, h0 h0Var, y0<cx0.a<b.a>> y0Var, t13.d<? super a> dVar) {
            super(2, dVar);
            this.f38903b = bVar;
            this.f38904c = h0Var;
            this.f38905d = y0Var;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new a(this.f38903b, this.f38904c, this.f38905d, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:21:0x0045, code lost:
        
            if (r2 == r0) goto L22;
         */
        @Override // v13.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            Object objG;
            xw0.a aVar;
            boolean z14;
            LocalDate key;
            u13.a aVar2 = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f38902a;
            y0<cx0.a<b.a>> y0Var = this.f38905d;
            h0 h0Var = this.f38904c;
            boolean z15 = true;
            b bVar = this.f38903b;
            try {
                if (i14 == 0) {
                    r.b(obj);
                    c2 c2Var = bVar.f38891j;
                    if (c2Var != null) {
                        this.f38902a = 1;
                        if (c2Var.P(this) == aVar2) {
                        }
                    }
                    return aVar2;
                }
                if (i14 == 1) {
                    r.b(obj);
                } else {
                    if (i14 != 2) {
                        vb.h.z("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    r.b(obj);
                    objG = obj;
                }
                xw0.a aVar3 = (xw0.a) objG;
                if (aVar3 == null || !aVar3.h()) {
                    y0Var.j(new cx0.a<>(null, new IllegalArgumentException("Invalid summary."), null, false, 12, null));
                } else {
                    LocalDate localDate = h0Var.f23061a;
                    LocalDate localDate2 = h0Var.f23062b;
                    bVar.getClass();
                    HashMap<LocalDate, s0> map = bVar.f38884c;
                    if (localDate2.compareTo((ReadablePartial) localDate) >= 0) {
                        Iterator<LocalDate> it = f0.I(localDate, localDate2).iterator();
                        while (true) {
                            h0.a aVar4 = (h0.a) it;
                            if (!aVar4.hasNext()) {
                                break;
                            }
                            LocalDate localDate3 = (LocalDate) aVar4.next();
                            map.put(localDate3, new s0(localDate3, null, null, null, false, null, false, false, 254, null));
                        }
                    }
                    List<l> listB = aVar3.b();
                    if (listB != null) {
                        b.x4(bVar, listB);
                        Iterator it3 = listB.iterator();
                        while (it3.hasNext()) {
                            l lVar = (l) it3.next();
                            if ((lVar != null ? lVar.getStartDate() : null) != null) {
                                if (s.g(lVar.getPregnancyCycle(), Boolean.TRUE)) {
                                    LocalDate localDateH = lVar.getStartDate();
                                    Integer numY = lVar.getPeriodLength();
                                    s0 s0VarY4 = bVar.y4(localDateH);
                                    hx0.e eVar = hx0.e.Pregnancy;
                                    eVar.getClass();
                                    s0VarY4.f86169f = eVar;
                                    s0VarY4.f86168e = z15;
                                    if (numY != null && numY.intValue() > 0) {
                                        s0VarY4.b(o.Period);
                                    }
                                } else {
                                    bVar.y4(lVar.getStartDate()).b(o.Period);
                                }
                                if (lVar.getStartDate().isBefore(h0Var.f23061a)) {
                                    bVar.f38894m = lVar.getStartDate();
                                }
                                h0 h0VarZ = lVar.z();
                                h0 h0VarQ = lVar.q();
                                h0 h0VarF = lVar.F();
                                h0 h0VarU = lVar.u();
                                LocalDate localDateC = lVar.getPredictedOvulationDate();
                                Map.Entry<LocalDate, h0> entryHigherEntry = bVar.f38887f.higherEntry(lVar.getStartDate());
                                LocalDate localDateJ = (entryHigherEntry == null || (key = entryHigherEntry.getKey()) == null) ? null : jg.b.J(key);
                                if (localDateJ == null) {
                                    localDateJ = localDate2;
                                }
                                Iterator<LocalDate> it4 = f0.I(lVar.getStartDate(), localDateJ).iterator();
                                while (true) {
                                    h0.a aVar5 = (h0.a) it4;
                                    if (!aVar5.hasNext()) {
                                        break;
                                    }
                                    Iterator it5 = it3;
                                    LocalDate localDate4 = (LocalDate) aVar5.next();
                                    xw0.a aVar6 = aVar3;
                                    if (!s.g(lVar.getPregnancyCycle(), Boolean.TRUE)) {
                                        boolean zEquals = localDate4.equals(localDateC);
                                        boolean zIsBefore = localDateJ.isBefore(LocalDate.now());
                                        s0 s0VarY5 = bVar.y4(localDate4);
                                        if (h0VarQ != null && j23.g.a.a(h0VarQ, localDate4) && (com.garmin.android.apps.connectmobile.menstrualcycle.presentation.settings.b.a.c(com.garmin.android.apps.connectmobile.menstrualcycle.presentation.settings.b.f39089a) || zIsBefore)) {
                                            s0VarY5.b(o.Fertile);
                                        }
                                        if (j23.g.a.a(h0VarZ, localDate4)) {
                                            s0VarY5.b(o.Period);
                                        }
                                        if (zEquals) {
                                            s0VarY5.b(o.Ovulation);
                                        }
                                    }
                                    if (h0VarF != null) {
                                        s0 s0VarY6 = bVar.y4(localDate4);
                                        if (j23.g.a.a(h0VarF, localDate4)) {
                                            s0VarY6.f86170g = true;
                                        }
                                    }
                                    if (h0VarU != null) {
                                        s0 s0VarY7 = bVar.y4(localDate4);
                                        if (j23.g.a.a(h0VarU, localDate4)) {
                                            s0VarY7.b(o.Period);
                                            s0VarY7.f86171h = true;
                                        }
                                    }
                                    it3 = it5;
                                    aVar3 = aVar6;
                                }
                                aVar = aVar3;
                                z14 = true;
                            } else {
                                aVar = aVar3;
                                z14 = z15;
                            }
                            it3 = it3;
                            z15 = z14;
                            aVar3 = aVar;
                        }
                    }
                    xw0.a aVar7 = aVar3;
                    List<LocalDate> listF = aVar7.f();
                    if (listF != null) {
                        Iterator it6 = p13.h0.Z(listF).iterator();
                        while (it6.hasNext()) {
                            bVar.y4((LocalDate) it6.next()).f86166c.add(hx0.d.Ovulation);
                        }
                    }
                    List<LocalDate> listG = aVar7.g();
                    if (listG != null) {
                        Iterator it7 = p13.h0.Z(listG).iterator();
                        while (it7.hasNext()) {
                            bVar.y4((LocalDate) it7.next()).f86166c.add(hx0.d.Symptoms);
                        }
                    }
                    List<LocalDate> listD = aVar7.d();
                    if (listD != null) {
                        Iterator it8 = p13.h0.Z(listD).iterator();
                        while (it8.hasNext()) {
                            bVar.y4((LocalDate) it8.next()).f86166c.add(hx0.d.Notes);
                        }
                    }
                    y0Var.j(new cx0.a<>(new b.a(map, h0Var), null, null, false, 12, null));
                }
                return Unit.INSTANCE;
                yw0.a aVar8 = bVar.f38882a;
                LocalDate localDate5 = h0Var.f23061a;
                LocalDate localDate6 = h0Var.f23062b;
                this.f38902a = 2;
                objG = aVar8.g(localDate5, localDate6, this);
            } catch (Throwable th3) {
                y0Var.j(new cx0.a<>(null, th3, null, false, 12, null));
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(b bVar, h0 h0Var, y0<cx0.a<b.a>> y0Var, t13.d<? super c> dVar) {
        super(2, dVar);
        this.f38899b = bVar;
        this.f38900c = h0Var;
        this.f38901d = y0Var;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new c(this.f38899b, this.f38900c, this.f38901d, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((c) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f38898a;
        if (i14 == 0) {
            r.b(obj);
            a aVar2 = new a(this.f38899b, this.f38900c, this.f38901d, null);
            this.f38898a = 1;
            if (ge1.b.Y(aVar2, this) == aVar) {
                return aVar;
            }
        } else {
            if (i14 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r.b(obj);
        }
        return Unit.INSTANCE;
    }
}
