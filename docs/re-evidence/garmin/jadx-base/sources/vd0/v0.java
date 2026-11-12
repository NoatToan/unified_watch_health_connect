package vd0;

import com.google.android.exoplayer2.source.ProgressiveMediaSource;
import i3.e5;
import java.text.DateFormatSymbols;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Iterator;
import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p3.p2;

/* JADX INFO: loaded from: classes8.dex */
public final class v0 {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.dogs.presentation.DogDatePickerKt$DogDatePickerWithNullDay$5$1", f = "DogDatePicker.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class a extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ i53.c<Integer> f177408a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Calendar f177409b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ boolean f177410c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ p3.n1 f177411d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ Calendar f177412e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ Calendar f177413f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final /* synthetic */ p3.p1<List<Integer>> f177414g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final /* synthetic */ p3.n1 f177415h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final /* synthetic */ p3.p1<List<Object>> f177416i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final /* synthetic */ p3.n1 f177417j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(i53.c<Integer> cVar, Calendar calendar, boolean z14, p3.n1 n1Var, Calendar calendar2, Calendar calendar3, p3.p1<List<Integer>> p1Var, p3.n1 n1Var2, p3.p1<List<Object>> p1Var2, p3.n1 n1Var3, t13.d<? super a> dVar) {
            super(2, dVar);
            this.f177408a = cVar;
            this.f177409b = calendar;
            this.f177410c = z14;
            this.f177411d = n1Var;
            this.f177412e = calendar2;
            this.f177413f = calendar3;
            this.f177414g = p1Var;
            this.f177415h = n1Var2;
            this.f177416i = p1Var2;
            this.f177417j = n1Var3;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new a(this.f177408a, this.f177409b, this.f177410c, this.f177411d, this.f177412e, this.f177413f, this.f177414g, this.f177415h, this.f177416i, this.f177417j, dVar);
        }

        @Override // e23.p
        public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            o13.r.b(obj);
            Calendar calendar = this.f177409b;
            this.f177411d.t(v0.e(calendar.get(1), this.f177408a));
            int i14 = calendar.get(1);
            Calendar calendar2 = this.f177412e;
            Calendar calendar3 = this.f177413f;
            List<Integer> listC = v0.c(calendar2, calendar3, i14);
            p3.p1<List<Integer>> p1Var = this.f177414g;
            p1Var.setValue(listC);
            this.f177415h.t(v0.e(calendar.get(2), p1Var.getF182175a()));
            ArrayList arrayListB = v0.b(calendar2, calendar3, calendar.get(1), calendar.get(2));
            p3.p1<List<Object>> p1Var2 = this.f177416i;
            p1Var2.setValue(arrayListB);
            int iE = 0;
            if (!this.f177410c) {
                List<Object> f182175a = p1Var2.getF182175a();
                iE = j23.t.e(f182175a.indexOf(new Integer(calendar.get(5))), 0, f182175a.size() - 1);
            }
            this.f177417j.t(iE);
            return Unit.INSTANCE;
        }
    }

    public static final void a(h4.r rVar, List<String> list, Calendar calendar, e23.l<? super Calendar, Unit> lVar, e23.p<? super Calendar, ? super String, Unit> pVar, Calendar calendar2, Calendar calendar3, boolean z14, p3.m mVar, int i14, int i15) {
        boolean z15;
        int i16;
        h4.r rVar2;
        List<String> listI0;
        boolean z16;
        int i17;
        Object aVar;
        Boolean bool;
        p3.n1 n1Var;
        i53.c cVar;
        Calendar calendar4;
        boolean z17;
        p3.n1 n1Var2;
        p3.p1 p1Var;
        Calendar calendar5;
        int iE;
        p3.o0 o0VarE = mVar.E(1912599846);
        int i18 = i14 | 16 | (o0VarE.r(calendar) ? 256 : 128) | (o0VarE.r(lVar) ? 2048 : 1024) | (o0VarE.r(pVar) ? 16384 : 8192) | (o0VarE.r(calendar2) ? 131072 : 65536) | (o0VarE.r(calendar3) ? ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288);
        int i19 = i15 & 128;
        if (i19 != 0) {
            i16 = i18 | 12582912;
            z15 = z14;
        } else {
            z15 = z14;
            i16 = i18 | (o0VarE.h(z15) ? 8388608 : 4194304);
        }
        int i24 = 1;
        if (o0VarE.n(i16 & 1, (4793491 & i16) != 4793490)) {
            o0VarE.G0();
            if ((i14 & 1) == 0 || o0VarE.o0()) {
                String[] shortMonths = new DateFormatSymbols().getShortMonths();
                shortMonths.getClass();
                listI0 = p13.u.i0(shortMonths);
                i17 = i16 & (-113);
                if (i19 != 0) {
                    z15 = false;
                }
            } else {
                o0VarE.e();
                i17 = i16 & (-113);
                listI0 = list;
            }
            o0VarE.h0();
            p3.x1 x1Var = p3.n.f135158a;
            if (listI0.size() != 12) {
                vb.h.s("Failed requirement.");
                return;
            }
            if (calendar2.compareTo(calendar3) > 0) {
                vb.h.s("Failed requirement.");
                return;
            }
            Object objQ = o0VarE.q();
            p3.m.f135153a.getClass();
            p3.m.a.C2565a c2565a = p3.m.a.f135155b;
            if (objQ == c2565a) {
                Object objClone = calendar.clone();
                objClone.getClass();
                objQ = (Calendar) objClone;
                lVar.invoke(objQ);
                o0VarE.K(objQ);
            }
            Calendar calendar6 = (Calendar) objQ;
            Object objQ2 = o0VarE.q();
            if (objQ2 == c2565a) {
                objQ2 = p3.p0.n(c(calendar2, calendar3, calendar.get(1)));
                o0VarE.K(objQ2);
            }
            p3.p1 p1Var2 = (p3.p1) objQ2;
            Object objQ3 = o0VarE.q();
            if (objQ3 == c2565a) {
                objQ3 = p3.p0.n(b(calendar2, calendar3, calendar.get(1), calendar.get(2)));
                o0VarE.K(objQ3);
            }
            p3.p1 p1Var3 = (p3.p1) objQ3;
            Object objQ4 = o0VarE.q();
            if (objQ4 == c2565a) {
                objQ4 = i53.a.e(new j23.l(calendar2.get(1), calendar3.get(1)));
                o0VarE.K(objQ4);
            }
            i53.c cVar2 = (i53.c) objQ4;
            Object objQ5 = o0VarE.q();
            if (objQ5 == c2565a) {
                objQ5 = e5.o(e(calendar.get(2), (List) p1Var2.getF182175a()), o0VarE);
            }
            p3.n1 n1Var3 = (p3.n1) objQ5;
            Object objQ6 = o0VarE.q();
            if (objQ6 == c2565a) {
                if (z15) {
                    iE = 0;
                } else {
                    List list2 = (List) p1Var3.getF182175a();
                    iE = j23.t.e(list2.indexOf(Integer.valueOf(calendar.get(5))), 0, list2.size() - 1);
                }
                objQ6 = e5.o(iE, o0VarE);
            } else {
                n1Var3 = n1Var3;
                i24 = 1;
            }
            p3.n1 n1Var4 = (p3.n1) objQ6;
            Object objQ7 = o0VarE.q();
            if (objQ7 == c2565a) {
                objQ7 = e5.o(e(calendar.get(i24), cVar2), o0VarE);
            }
            p3.n1 n1Var5 = (p3.n1) objQ7;
            Boolean boolValueOf = Boolean.valueOf(z15);
            boolean zR = o0VarE.r(calendar) | o0VarE.r(calendar2) | o0VarE.r(calendar3) | ((i17 & 29360128) == 8388608);
            Object objQ8 = o0VarE.q();
            if (zR || objQ8 == c2565a) {
                boolean z18 = z15;
                bool = boolValueOf;
                n1Var = n1Var3;
                aVar = new a(cVar2, calendar, z18, n1Var5, calendar2, calendar3, p1Var2, n1Var, p1Var3, n1Var4, null);
                cVar = cVar2;
                calendar4 = calendar;
                z17 = z18;
                n1Var2 = n1Var5;
                p1Var = p1Var2;
                o0VarE.K(aVar);
            } else {
                aVar = objQ8;
                calendar4 = calendar;
                n1Var2 = n1Var5;
                z17 = z15;
                bool = boolValueOf;
                cVar = cVar2;
                n1Var = n1Var3;
                p1Var = p1Var2;
            }
            p3.l0.f(calendar4, bool, (e23.p) aVar, o0VarE);
            Object objQ9 = o0VarE.q();
            if (objQ9 == c2565a) {
                p3.n1 n1Var6 = n1Var;
                calendar5 = calendar6;
                objQ9 = new u0(n1Var6, cVar, calendar5, lVar, pVar, n1Var2, calendar2, calendar3, p1Var, p1Var3, n1Var4);
                n1Var = n1Var6;
                o0VarE.K(objQ9);
            } else {
                calendar5 = calendar6;
            }
            e23.l lVar2 = (e23.l) objQ9;
            Object objQ10 = o0VarE.q();
            if (objQ10 == c2565a) {
                p3.n1 n1Var7 = n1Var;
                objQ10 = new u0(n1Var4, cVar, calendar5, lVar, pVar, n1Var2, calendar2, calendar3, p1Var, n1Var7, p1Var3);
                n1Var = n1Var7;
                p1Var3 = p1Var3;
                n1Var4 = n1Var4;
                o0VarE.K(objQ10);
            }
            e23.l lVar3 = (e23.l) objQ10;
            Object objQ11 = o0VarE.q();
            if (objQ11 == c2565a) {
                p3.p1 p1Var4 = p1Var;
                p3.n1 n1Var8 = n1Var;
                p3.n1 n1Var9 = n1Var2;
                objQ11 = new u0(n1Var9, cVar, calendar5, lVar, pVar, calendar2, calendar3, p1Var4, n1Var8, p1Var3, n1Var4);
                p1Var = p1Var4;
                n1Var = n1Var8;
                n1Var2 = n1Var9;
                o0VarE.K(objQ11);
            }
            e23.l lVar4 = (e23.l) objQ11;
            List list3 = (List) p1Var.getF182175a();
            ArrayList arrayList = new ArrayList(p13.y.r(list3, 10));
            Iterator it = list3.iterator();
            while (it.hasNext()) {
                arrayList.add(listI0.get(((Number) it.next()).intValue()));
            }
            i53.c cVarE = i53.a.e(arrayList);
            int intValue = n1Var.getIntValue();
            q0.f177361a.getClass();
            r82.p pVar2 = new r82.p(cVarE, intValue, null, null, q0.f177362b, 0.0f, false, false, null, null, lVar2, 1004, null);
            List list4 = (List) p1Var3.getF182175a();
            ArrayList arrayList2 = new ArrayList(p13.y.r(list4, 10));
            for (Object obj : list4) {
                String string = "--";
                if (!p005kotlin.jvm.internal.s.g(obj, "--")) {
                    string = obj.toString();
                }
                arrayList2.add(string);
            }
            i53.c cVarE2 = i53.a.e(arrayList2);
            int intValue2 = n1Var4.getIntValue();
            q0.f177361a.getClass();
            i53.c cVar3 = cVar;
            rVar2 = rVar;
            r82.k.c(rVar2, i53.a.a(pVar2, new r82.p(cVarE2, intValue2, null, null, q0.f177363c, 0.0f, false, false, null, null, lVar3, 1004, null), new r82.p(cVar3, n1Var2.getIntValue(), null, null, null, 0.0f, false, false, null, null, lVar4, 1020, null)), o0VarE, 6, 0);
            p3.x1 x1Var2 = p3.n.f135158a;
            z16 = z17;
        } else {
            rVar2 = rVar;
            o0VarE.e();
            listI0 = list;
            z16 = z15;
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new e52.d(rVar2, listI0, calendar, lVar, pVar, calendar2, calendar3, z16, i14, i15);
        }
    }

    public static final ArrayList b(Calendar calendar, Calendar calendar2, int i14, int i15) {
        int actualMaximum;
        int i16 = (i14 == calendar.get(1) && i15 == calendar.get(2)) ? calendar.get(5) : 1;
        if (i14 == calendar2.get(1) && i15 == calendar2.get(2)) {
            actualMaximum = calendar2.get(5);
        } else {
            Calendar calendar3 = Calendar.getInstance();
            calendar3.set(i14, i15, 1);
            actualMaximum = calendar3.getActualMaximum(5);
        }
        return p13.h0.C0(p13.w.c("--"), p13.h0.b1(new j23.l(i16, actualMaximum)));
    }

    public static final List<Integer> c(Calendar calendar, Calendar calendar2, int i14) {
        return p13.h0.b1(new j23.l(i14 == calendar.get(1) ? calendar.get(2) : 0, i14 == calendar2.get(1) ? calendar2.get(2) : 11));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void d(p3.n1 n1Var, i53.c cVar, Calendar calendar, e23.l lVar, e23.p pVar, Calendar calendar2, Calendar calendar3, p3.p1 p1Var, p3.n1 n1Var2, p3.p1 p1Var2, p3.n1 n1Var3) {
        String str;
        p1Var.setValue(c(calendar2, calendar3, ((Number) cVar.get(n1Var.getIntValue())).intValue()));
        n1Var2.t(j23.t.e(n1Var2.getIntValue(), 0, ((List) p1Var.getF182175a()).size() - 1));
        p1Var2.setValue(b(calendar2, calendar3, ((Number) cVar.get(n1Var.getIntValue())).intValue(), ((Number) ((List) p1Var.getF182175a()).get(n1Var2.getIntValue())).intValue()));
        n1Var3.t(j23.t.e(n1Var3.getIntValue(), 0, ((List) p1Var2.getF182175a()).size() - 1));
        int iIntValue = ((Number) ((List) p1Var.getF182175a()).get(n1Var2.getIntValue())).intValue();
        Object obj = ((List) p1Var2.getF182175a()).get(n1Var3.getIntValue());
        int iIntValue2 = ((Number) cVar.get(n1Var.getIntValue())).intValue();
        if (p005kotlin.jvm.internal.s.g(obj, "--")) {
            calendar.set(iIntValue2, iIntValue, 1);
            str = "MONTH";
        } else {
            if ((obj instanceof Integer) && (iIntValue2 != calendar.get(1) || iIntValue != calendar.get(2) || !obj.equals(Integer.valueOf(calendar.get(5))))) {
                calendar.set(iIntValue2, iIntValue, ((Number) obj).intValue());
            }
            str = "DAY";
        }
        lVar.invoke(calendar);
        pVar.invoke(calendar, str);
    }

    public static final int e(int i14, List list) {
        return j23.t.e(list.indexOf(Integer.valueOf(i14)), 0, list.size() - 1);
    }
}
