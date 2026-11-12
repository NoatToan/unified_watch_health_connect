package ho;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.u1;
import c2.q1;
import c2.q2;
import c2.s2;
import c2.u2;
import c2.x2;
import com.garmin.android.apps.connectmobile.R;
import com.google.android.exoplayer2.source.ProgressiveMediaSource;
import com.google.android.gms.auth.api.proxy.AuthApiStatusCodes;
import f5.z0;
import i3.mc;
import java.util.ArrayList;
import l72.f0;
import lc.u0;
import o4.m1;
import org.joda.time.DateTimeConstants;
import org.koin.bundle.CreationExtrasExtKt;
import org.koin.bundle.GetViewModelKt;
import org.koin.compose.KoinApplicationKt;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s0;
import p13.h0;
import p3.b4;
import p3.i2;
import p3.l0;
import p3.o0;
import p3.p0;
import p3.p1;
import p3.x1;
import p3.x3;
import r1.g0;
import r53.p2;

/* JADX INFO: loaded from: classes7.dex */
public final class w {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.activities.history.presentation.filtering.FilterBottomSheetKt$FilterBottomSheet$1$1", f = "FilterBottomSheet.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class a extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ a0 f84678a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ String f84679b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ i53.c<jo.c> f84680c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(a0 a0Var, String str, i53.c<? extends jo.c> cVar, t13.d<? super a> dVar) {
            super(2, dVar);
            this.f84678a = a0Var;
            this.f84679b = str;
            this.f84680c = cVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new a(this.f84678a, this.f84679b, this.f84680c, dVar);
        }

        @Override // e23.p
        public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            Object value;
            y yVar;
            i53.c cVarX4;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            o13.r.b(obj);
            a0 a0Var = this.f84678a;
            a0Var.getClass();
            String str = this.f84679b;
            str.getClass();
            p2 p2Var = a0Var.f84578j;
            do {
                value = p2Var.getValue();
                yVar = (y) value;
                cVarX4 = this.f84680c;
                if (cVarX4 == null) {
                    cVarX4 = a0Var.x4();
                }
                a0Var.f84573e.getClass();
            } while (!p2Var.b(value, y.a(yVar, cVarX4, false, co.a.a(cVarX4), null, null, false, str, 58)));
            return Unit.INSTANCE;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class b extends p005kotlin.jvm.internal.q implements e23.a<Unit> {
        public b(Object obj) {
            super(0, obj, a0.class, "onClearAllFilters", "onClearAllFilters()V", 0);
        }

        @Override // e23.a
        public final Unit invoke() {
            Object value;
            a0 a0Var = (a0) this.receiver;
            a0Var.getClass();
            zn.a.c.f205375b.a();
            p2 p2Var = a0Var.f84578j;
            do {
                value = p2Var.getValue();
            } while (!p2Var.b(value, y.a((y) value, a0Var.x4(), false, false, null, null, false, null, 124)));
            return Unit.INSTANCE;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class c extends p005kotlin.jvm.internal.q implements e23.q<Integer, jo.c, eo.e, Unit> {
        public c(Object obj) {
            super(3, obj, a0.class, "onUpdateRangeData", "onUpdateRangeData(ILcom/garmin/android/apps/connectmobile/activities/history/presentation/model/FilterData;Lcom/garmin/android/apps/connectmobile/activities/history/domain/model/InputType;)V", 0);
        }

        /* JADX WARN: Code duplicated, block: B:32:0x00fe  */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // e23.q
        public final Unit invoke(Integer num, jo.c cVar, eo.e eVar) {
            Object value;
            y yVar;
            jo.c cVarF;
            o13.p pVar;
            int iIntValue = num.intValue();
            jo.c cVar2 = cVar;
            eo.e eVar2 = eVar;
            cVar2.getClass();
            a0 a0Var = (a0) this.receiver;
            a0Var.getClass();
            new zn.a.C3839a(cVar2.f99698a).a();
            p2 p2Var = a0Var.f84578j;
            do {
                value = p2Var.getValue();
                yVar = (y) value;
                jo.c cVar3 = (jo.c) h0.e0(iIntValue, yVar.f84690a);
                a0Var.f84572d.getClass();
                if (p005kotlin.jvm.internal.s.g(cVar3, cVar2)) {
                    cVarF = cVar2;
                } else {
                    boolean z14 = cVar2 instanceof jo.c.a.C1917c;
                    if (z14) {
                        jo.c.a.C1917c c1917c = (jo.c.a.C1917c) cVar2;
                        Integer num2 = c1917c.f99706c;
                        Integer num3 = c1917c.f99707d;
                        jo.c.b bVar = jo.c.f99697b;
                        boolean z15 = c1917c.f99708e;
                        bVar.getClass();
                        pVar = co.l.a(eVar2, num2, num3, z15 ? 150 : 100);
                    } else if (cVar2 instanceof jo.c.a.e) {
                        jo.c.a.e eVar3 = (jo.c.a.e) cVar2;
                        pVar = co.l.a(eVar2, eVar3.f99715c, eVar3.f99716d, DateTimeConstants.MINUTES_PER_DAY);
                    } else if (cVar2 instanceof jo.c.a.f) {
                        jo.c.a.f fVar = (jo.c.a.f) cVar2;
                        Integer num4 = fVar.f99720c;
                        Integer num5 = fVar.f99721d;
                        jo.c.b bVar2 = jo.c.f99697b;
                        boolean z16 = fVar.f99722e;
                        bVar2.getClass();
                        pVar = co.l.a(eVar2, num4, num5, z16 ? AuthApiStatusCodes.AUTH_API_INVALID_CREDENTIALS : 10000);
                    } else {
                        pVar = new o13.p(null, null);
                    }
                    jo.a aVar = (jo.a) pVar.f128594a;
                    jo.a aVar2 = (jo.a) pVar.f128595b;
                    if (cVar2 instanceof jo.c.a.e) {
                        jo.c.a.e eVar4 = (jo.c.a.e) cVar2;
                        cVarF = jo.c.a.e.f(eVar4, null, null, co.i.a(eVar2, eo.e.MINIMUM, aVar, eVar4.f99717e), co.i.a(eVar2, eo.e.MAXIMUM, aVar2, eVar4.f99718f), 3);
                    } else if (z14) {
                        jo.c.a.C1917c c1917c2 = (jo.c.a.C1917c) cVar2;
                        cVarF = jo.c.a.C1917c.f(c1917c2, null, null, co.i.a(eVar2, eo.e.MINIMUM, aVar, c1917c2.f99709f), co.i.a(eVar2, eo.e.MAXIMUM, aVar2, c1917c2.f99710g), 7);
                    } else if (cVar2 instanceof jo.c.a.f) {
                        jo.c.a.f fVar2 = (jo.c.a.f) cVar2;
                        cVarF = jo.c.a.f.f(fVar2, null, null, co.i.a(eVar2, eo.e.MINIMUM, aVar, fVar2.f99723f), co.i.a(eVar2, eo.e.MAXIMUM, aVar2, fVar2.f99724g), 7);
                    } else {
                        cVarF = cVar2;
                    }
                }
            } while (!p2Var.b(value, a0Var.y4(yVar, cVarF, iIntValue)));
            return Unit.INSTANCE;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class d extends p005kotlin.jvm.internal.q implements e23.p<Integer, ho.b, Unit> {
        public d(Object obj) {
            super(2, obj, a0.class, "onToggleActivity", "onToggleActivity(ILcom/garmin/android/apps/connectmobile/activities/history/presentation/filtering/ActivityFilterType;)V", 0);
        }

        @Override // e23.p
        public final Unit invoke(Integer num, ho.b bVar) {
            Object value;
            y yVar;
            jo.c.a.C1916a c1916a;
            ArrayList arrayList;
            int iIntValue = num.intValue();
            final ho.b bVar2 = bVar;
            bVar2.getClass();
            a0 a0Var = (a0) this.receiver;
            a0Var.getClass();
            new zn.a.C3839a(jo.d.ACTIVITIES).a();
            p2 p2Var = a0Var.f84578j;
            do {
                value = p2Var.getValue();
                yVar = (y) value;
                Object objE0 = h0.e0(iIntValue, yVar.f84690a);
                c1916a = objE0 instanceof jo.c.a.C1916a ? (jo.c.a.C1916a) objE0 : null;
                if (c1916a == null) {
                    c1916a = new jo.c.a.C1916a(null, a0Var.f84569a, 1, null);
                }
                ArrayList arrayListD1 = h0.d1(c1916a.f99700c);
                if (bVar2 instanceof ho.b.a) {
                    final int i14 = 0;
                    e23.l lVar = new e23.l() { // from class: ho.z
                        @Override // e23.l
                        public final Object invoke(Object obj) {
                            int i15 = i14;
                            boolean z14 = false;
                            b bVar3 = bVar2;
                            b bVar4 = (b) obj;
                            switch (i15) {
                                case 0:
                                    int i16 = a0.f84568l;
                                    bVar4.getClass();
                                    if ((bVar4 instanceof b.C1677b) && ((b.C1677b) bVar4).f84586d == bVar3.getF84581a()) {
                                        z14 = true;
                                    }
                                    return Boolean.valueOf(z14);
                                default:
                                    int i17 = a0.f84568l;
                                    bVar4.getClass();
                                    if ((bVar4 instanceof b.a) && bVar4.getF84581a() == ((b.C1677b) bVar3).f84586d) {
                                        z14 = true;
                                    }
                                    return Boolean.valueOf(z14);
                            }
                        }
                    };
                    arrayList = new ArrayList(arrayListD1);
                    if (arrayListD1.contains(bVar2)) {
                        arrayList.remove(bVar2);
                    } else {
                        p13.d0.A(arrayList, lVar, true);
                        arrayList.add(bVar2);
                    }
                } else {
                    if (!(bVar2 instanceof ho.b.C1677b)) {
                        u0.r();
                        return null;
                    }
                    final int i15 = 1;
                    e23.l lVar2 = new e23.l() { // from class: ho.z
                        @Override // e23.l
                        public final Object invoke(Object obj) {
                            int i16 = i15;
                            boolean z14 = false;
                            b bVar3 = bVar2;
                            b bVar4 = (b) obj;
                            switch (i16) {
                                case 0:
                                    int i17 = a0.f84568l;
                                    bVar4.getClass();
                                    if ((bVar4 instanceof b.C1677b) && ((b.C1677b) bVar4).f84586d == bVar3.getF84581a()) {
                                        z14 = true;
                                    }
                                    return Boolean.valueOf(z14);
                                default:
                                    int i18 = a0.f84568l;
                                    bVar4.getClass();
                                    if ((bVar4 instanceof b.a) && bVar4.getF84581a() == ((b.C1677b) bVar3).f84586d) {
                                        z14 = true;
                                    }
                                    return Boolean.valueOf(z14);
                            }
                        }
                    };
                    arrayList = new ArrayList(arrayListD1);
                    if (arrayListD1.contains(bVar2)) {
                        arrayList.remove(bVar2);
                    } else {
                        p13.d0.A(arrayList, lVar2, true);
                        arrayList.add(bVar2);
                    }
                }
            } while (!p2Var.b(value, a0Var.y4(yVar, jo.c.a.C1916a.f(c1916a, arrayList), iIntValue)));
            return Unit.INSTANCE;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class e extends p005kotlin.jvm.internal.q implements e23.p<Integer, eo.b, Unit> {
        public e(Object obj) {
            super(2, obj, a0.class, "onToggleEventChip", "onToggleEventChip(ILcom/garmin/android/apps/connectmobile/activities/history/domain/model/EventChipType;)V", 0);
        }

        @Override // e23.p
        public final Unit invoke(Integer num, eo.b bVar) {
            Object value;
            y yVar;
            eo.b bVar2;
            int iIntValue = num.intValue();
            eo.b bVar3 = bVar;
            bVar3.getClass();
            a0 a0Var = (a0) this.receiver;
            a0Var.getClass();
            new zn.a.C3839a(jo.d.EVENT_TYPE).a();
            p2 p2Var = a0Var.f84578j;
            do {
                value = p2Var.getValue();
                yVar = (y) value;
                Object objE0 = h0.e0(iIntValue, yVar.f84690a);
                jo.c.a.d dVar = objE0 instanceof jo.c.a.d ? (jo.c.a.d) objE0 : null;
                if (dVar == null) {
                    dVar = new jo.c.a.d(null, 1, null);
                }
                bVar2 = p005kotlin.jvm.internal.s.g(dVar.f99713c.f64757b, bVar3.f64757b) ? eo.b.a.f64758d : bVar3;
                bVar2.getClass();
            } while (!p2Var.b(value, a0Var.y4(yVar, new jo.c.a.d(bVar2), iIntValue)));
            return Unit.INSTANCE;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class f implements e23.r<Boolean, o4.d0, p3.m, Integer, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ x3<Boolean> f84681a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ y f84682b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ e23.a<Unit> f84683c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ e23.l<i53.c<? extends jo.c>, Unit> f84684d;

        /* JADX WARN: Multi-variable type inference failed */
        public f(x3<Boolean> x3Var, y yVar, e23.a<Unit> aVar, e23.l<? super i53.c<? extends jo.c>, Unit> lVar) {
            this.f84681a = x3Var;
            this.f84682b = yVar;
            this.f84683c = aVar;
            this.f84684d = lVar;
        }

        @Override // e23.r
        public final Unit invoke(Boolean bool, o4.d0 d0Var, p3.m mVar, Integer num) {
            bool.getClass();
            long j8 = d0Var.f128833a;
            p3.m mVar2 = mVar;
            int iIntValue = num.intValue();
            if ((iIntValue & 48) == 0) {
                iIntValue |= mVar2.l(j8) ? 32 : 16;
            }
            if (mVar2.n(iIntValue & 1, (iIntValue & 145) != 144)) {
                x1 x1Var = p3.n.f135158a;
                boolean z14 = !this.f84681a.getF182175a().booleanValue();
                xz1.a.f192853a.getClass();
                r1.c0.e(z14, null, xz1.a.a(mVar2), xz1.a.b(mVar2), null, z3.f.c(-853279383, new x(this.f84682b, this.f84683c, j8, this.f84684d), mVar2), mVar2, 196608, 18);
            } else {
                mVar2.e();
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Code duplicated, block: B:43:0x010f  */
    /* JADX WARN: Code duplicated, block: B:55:0x0171  */
    public static final void a(y yVar, e23.a<Unit> aVar, long j8, e23.l<? super i53.c<? extends jo.c>, Unit> lVar, p3.m mVar, int i14) {
        o0 o0VarE = mVar.E(-1147921761);
        int i15 = i14 | (o0VarE.B(yVar) ? 4 : 2) | (o0VarE.r(aVar) ? 32 : 16) | (o0VarE.l(j8) ? 256 : 128) | (o0VarE.r(lVar) ? 2048 : 1024);
        if (o0VarE.n(i15 & 1, (i15 & 1171) != 1170)) {
            x1 x1Var = p3.n.f135158a;
            h4.r.a aVar2 = h4.r.S;
            h4.r rVarE = u1.n.e(c2.l.o(x2.f(aVar2, 1.0f), q1.Min), j8, m1.f128891a);
            d92.b.f58623a.getClass();
            j92.b bVar = d92.b.f58625c;
            bVar.getClass();
            j92.e eVar = j92.b.f97899b;
            h4.r rVarY = c2.l.y(rVarE, eVar.f97920e);
            h4.d.f81522a.getClass();
            h4.g.b bVar2 = h4.d.a.f81534l;
            c2.j.f22691a.getClass();
            s2 s2VarA = q2.a(c2.j.f22692b, bVar2, o0VarE, 48);
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            h4.r rVarC = h4.k.c(rVarY, o0VarE);
            h5.g.V.getClass();
            h5.e0.a aVar3 = h5.g.a.f81805b;
            if (o0VarE.f135177b == null) {
                p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar3);
            } else {
                o0VarE.c();
            }
            b4.c(h5.g.a.f81810g, s2VarA, o0VarE);
            b4.c(h5.g.a.f81809f, i2VarA0, o0VarE);
            h5.g.a.b bVar3 = h5.g.a.f81813j;
            if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar3);
            }
            b4.c(h5.g.a.f81807d, rVarC, o0VarE);
            u2 u2Var = u2.f22900a;
            f0.a aVar4 = f0.a.f111000a;
            String strQ = gl1.y.Q(o0VarE, R.string.lbl_clear_all);
            h4.r rVarC2 = x2.c(u2Var.a(aVar2, 1.0f, true), 1.0f);
            boolean z14 = yVar.f84691b;
            boolean z15 = (i15 & 112) == 32;
            Object objQ = o0VarE.q();
            p3.m.a aVar5 = p3.m.f135153a;
            if (z15) {
                objQ = new gt1.s(aVar, 12);
                o0VarE.K(objQ);
            } else {
                aVar5.getClass();
                if (objQ == p3.m.a.f135155b) {
                    objQ = new gt1.s(aVar, 12);
                    o0VarE.K(objQ);
                }
            }
            aVar4.j(strQ, rVarC2, z14, (e23.a) objQ, o0VarE, 0, 0);
            bVar.getClass();
            c2.l.f(x2.u(aVar2, eVar.f97918c), o0VarE);
            h4.r rVarC3 = x2.c(u2Var.a(aVar2, 1.0f, true), 1.0f);
            boolean z16 = yVar.f84692c;
            z3.e eVarC = z3.f.c(952510682, new fp0.l(yVar, 13), o0VarE);
            boolean z17 = ((i15 & 7168) == 2048) | ((i15 & 14) == 4);
            Object objQ2 = o0VarE.q();
            if (z17) {
                objQ2 = new gp.f(18, lVar, yVar);
                o0VarE.K(objQ2);
            } else {
                aVar5.getClass();
                if (objQ2 == p3.m.a.f135155b) {
                    objQ2 = new gp.f(18, lVar, yVar);
                    o0VarE.K(objQ2);
                }
            }
            aVar4.d(eVarC, rVarC3, z16, (e23.a) objQ2, o0VarE, 6);
            o0VarE.g0(true);
        } else {
            o0VarE.e();
        }
        p3.p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new da0.d(yVar, aVar, j8, lVar, i14, 1);
        }
    }

    /* JADX WARN: Code duplicated, block: B:34:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:36:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:37:0x0103  */
    /* JADX WARN: Code duplicated, block: B:42:0x011e  */
    /* JADX WARN: Code duplicated, block: B:45:0x0144  */
    /* JADX WARN: Code duplicated, block: B:48:0x0172  */
    /* JADX WARN: Code duplicated, block: B:49:0x0184  */
    /* JADX WARN: Code duplicated, block: B:51:0x0194  */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void b(String str, String str2, z3.e eVar, p3.m mVar, int i14) {
        o0 o0Var;
        p3.c<?> cVar;
        h5.g.a.f fVar;
        c2.z zVarA;
        int iHashCode;
        i2 i2VarA0;
        h4.r rVarC;
        Object objQ;
        String str3 = str;
        o0 o0VarE = mVar.E(1204887734);
        p3.c<?> cVar2 = o0VarE.f135177b;
        int i15 = i14 | (o0VarE.B(str3) ? 4 : 2) | (o0VarE.B(str2) ? 32 : 16);
        if (o0VarE.n(i15 & 1, (i15 & 147) != 146)) {
            x1 x1Var = p3.n.f135158a;
            Object objQ2 = o0VarE.q();
            p3.m.f135153a.getClass();
            p3.m.a.C2565a c2565a = p3.m.a.f135155b;
            if (objQ2 == c2565a) {
                objQ2 = p0.n(Boolean.FALSE);
                o0VarE.K(objQ2);
            }
            p1 p1Var = (p1) objQ2;
            h4.r.a aVar = h4.r.S;
            h4.r rVarE = u1.n.e(x2.f(aVar, 1.0f), am.j.c(d92.b.f58623a, o0VarE), m1.f128891a);
            xz1.a.f192853a.getClass();
            h4.r rVarA = g0.a(rVarE, xz1.a.f192858f, 2);
            h4.d.f81522a.getClass();
            z0 z0VarD = c2.q.d(h4.d.a.f81524b, false);
            int iHashCode2 = Long.hashCode(o0VarE.U);
            i2 i2VarA1 = o0VarE.a0();
            h4.r rVarC2 = h4.k.c(rVarA, o0VarE);
            h5.g.V.getClass();
            h5.e0.a aVar2 = h5.g.a.f81805b;
            if (cVar2 == null) {
                p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar2);
            } else {
                o0VarE.c();
            }
            h5.g.a.e eVar2 = h5.g.a.f81810g;
            b4.c(eVar2, z0VarD, o0VarE);
            h5.g.a.C1623g c1623g = h5.g.a.f81809f;
            b4.c(c1623g, i2VarA1, o0VarE);
            h5.g.a.b bVar = h5.g.a.f81813j;
            if (o0VarE.T) {
                cVar = cVar2;
            } else {
                cVar = cVar2;
                if (!p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode2))) {
                }
                fVar = h5.g.a.f81807d;
                b4.c(fVar, rVarC2, o0VarE);
                c2.u uVar = c2.u.f22885a;
                h4.r rVarF = x2.f(aVar, 1.0f);
                c2.j.f22691a.getClass();
                zVarA = c2.y.a(c2.j.f22694d, h4.d.a.f81536n, o0VarE, 0);
                iHashCode = Long.hashCode(o0VarE.U);
                i2VarA0 = o0VarE.a0();
                rVarC = h4.k.c(rVarF, o0VarE);
                if (cVar != null) {
                    p0.l();
                    throw null;
                }
                o0VarE.z();
                if (o0VarE.T) {
                    o0VarE.M(aVar2);
                } else {
                    o0VarE.c();
                }
                b4.c(eVar2, zVarA, o0VarE);
                b4.c(c1623g, i2VarA0, o0VarE);
                if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                    v.h.A(iHashCode, o0VarE, iHashCode, bVar);
                }
                b4.c(fVar, rVarC, o0VarE);
                c2.b0 b0Var = c2.b0.f22601a;
                l72.p2 p2Var = l72.p2.f111205a;
                h4.r rVarF2 = x2.f(aVar, 1.0f);
                str3 = str;
                z3.e eVarC = z3.f.c(143422354, new fb0.b(b0Var, str3, str2, p1Var, 7), o0VarE);
                objQ = o0VarE.q();
                if (objQ == c2565a) {
                    objQ = new gp.e(p1Var, 19);
                    o0VarE.K(objQ);
                }
                p2Var.f(rVarF2, eVarC, null, false, false, null, (e23.a) objQ, o0VarE, 1572918, 60);
                o0Var = o0VarE;
                if (((Boolean) p1Var.getF182175a()).booleanValue()) {
                    o0Var.C(2044751001);
                    eVar.invoke(o0Var, 6);
                    o0Var.g0(false);
                } else {
                    o0Var.C(2044796168);
                    o0Var.g0(false);
                }
                o0Var.g0(true);
                o0Var.g0(true);
            }
            v.h.A(iHashCode2, o0VarE, iHashCode2, bVar);
            fVar = h5.g.a.f81807d;
            b4.c(fVar, rVarC2, o0VarE);
            c2.u uVar2 = c2.u.f22885a;
            h4.r rVarF3 = x2.f(aVar, 1.0f);
            c2.j.f22691a.getClass();
            zVarA = c2.y.a(c2.j.f22694d, h4.d.a.f81536n, o0VarE, 0);
            iHashCode = Long.hashCode(o0VarE.U);
            i2VarA0 = o0VarE.a0();
            rVarC = h4.k.c(rVarF3, o0VarE);
            if (cVar != null) {
                p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar2);
            } else {
                o0VarE.c();
            }
            b4.c(eVar2, zVarA, o0VarE);
            b4.c(c1623g, i2VarA0, o0VarE);
            if (o0VarE.T) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar);
            } else {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar);
            }
            b4.c(fVar, rVarC, o0VarE);
            c2.b0 b0Var2 = c2.b0.f22601a;
            l72.p2 p2Var2 = l72.p2.f111205a;
            h4.r rVarF4 = x2.f(aVar, 1.0f);
            str3 = str;
            z3.e eVarC2 = z3.f.c(143422354, new fb0.b(b0Var2, str3, str2, p1Var, 7), o0VarE);
            objQ = o0VarE.q();
            if (objQ == c2565a) {
                objQ = new gp.e(p1Var, 19);
                o0VarE.K(objQ);
            }
            p2Var2.f(rVarF4, eVarC2, null, false, false, null, (e23.a) objQ, o0VarE, 1572918, 60);
            o0Var = o0VarE;
            if (((Boolean) p1Var.getF182175a()).booleanValue()) {
                o0Var.C(2044751001);
                eVar.invoke(o0Var, 6);
                o0Var.g0(false);
            } else {
                o0Var.C(2044796168);
                o0Var.g0(false);
            }
            o0Var.g0(true);
            o0Var.g0(true);
        } else {
            o0Var = o0VarE;
            o0Var.e();
        }
        p3.p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new g02.p0(str3, str2, eVar, i14);
        }
    }

    /* JADX WARN: Code duplicated, block: B:56:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:71:0x0125  */
    /* JADX WARN: Code duplicated, block: B:80:0x0166  */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public static final void c(String str, boolean z14, i53.c<? extends jo.c> cVar, i53.c<? extends jo.d> cVar2, mc mcVar, e23.a<Unit> aVar, e23.l<? super i53.c<? extends jo.c>, Unit> lVar, p3.m mVar, int i14) {
        o0 o0Var;
        str.getClass();
        cVar2.getClass();
        mcVar.getClass();
        aVar.getClass();
        lVar.getClass();
        o0 o0VarE = mVar.E(-477592565);
        int i15 = (o0VarE.r(lVar) ? ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288) | i14 | (o0VarE.B(str) ? 4 : 2) | (o0VarE.h(z14) ? 32 : 16) | (o0VarE.B(cVar) ? 256 : 128) | (o0VarE.B(cVar2) ? 2048 : 1024) | (o0VarE.B(mcVar) ? 16384 : 8192) | (o0VarE.r(aVar) ? 131072 : 65536);
        if (o0VarE.n(i15 & 1, (599187 & i15) != 599186)) {
            x1 x1Var = p3.n.f135158a;
            int i16 = i15 & 14;
            int i17 = i15 & 896;
            boolean z15 = (i16 == 4) | ((i15 & 112) == 32) | (i17 == 256) | ((i15 & 7168) == 2048);
            Object objQ = o0VarE.q();
            p3.m.a aVar2 = p3.m.f135153a;
            if (z15) {
                an0.d dVar = new an0.d(str, z14, cVar, cVar2, 3);
                o0VarE.K(dVar);
                objQ = dVar;
            } else {
                aVar2.getClass();
                if (objQ == p3.m.a.f135155b) {
                    an0.d dVar2 = new an0.d(str, z14, cVar, cVar2, 3);
                    o0VarE.K(dVar2);
                    objQ = dVar2;
                }
            }
            e23.a aVar3 = (e23.a) objQ;
            o0VarE.L(-1614864554);
            v9.a.f176280a.getClass();
            ViewModelStoreOwner viewModelStoreOwnerA = v9.a.a(o0VarE);
            if (viewModelStoreOwnerA == null) {
                vb.h.z("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                return;
            }
            u1 u1VarResolveViewModel = GetViewModelKt.resolveViewModel(s0.f105811a.b(a0.class), viewModelStoreOwnerA.getF189591b(), null, CreationExtrasExtKt.defaultExtras(viewModelStoreOwnerA), null, KoinApplicationKt.currentKoinScope(o0VarE, 0), aVar3);
            o0VarE.g0(false);
            a0 a0Var = (a0) u1VarResolveViewModel;
            p1 p1VarC = s9.c.c(a0Var.f84579k, o0VarE);
            boolean zR = o0VarE.r(a0Var) | (i16 == 4) | (i17 == 256);
            Object objQ2 = o0VarE.q();
            if (zR) {
                objQ2 = new a(a0Var, str, cVar, null);
                o0VarE.K(objQ2);
            } else {
                aVar2.getClass();
                if (objQ2 == p3.m.a.f135155b) {
                    objQ2 = new a(a0Var, str, cVar, null);
                    o0VarE.K(objQ2);
                }
            }
            l0.e((e23.p) objQ2, cVar, o0VarE);
            l72.w wVar = l72.w.f111301a;
            q.f84665a.getClass();
            z3.e eVar = q.f84666b;
            z3.e eVarC = z3.f.c(612384514, new g80.e(22, aVar, a0Var), o0VarE);
            boolean zR2 = o0VarE.r(a0Var) | ((458752 & i15) == 131072);
            Object objQ3 = o0VarE.q();
            if (zR2) {
                objQ3 = new u(aVar, a0Var, 1);
                o0VarE.K(objQ3);
            } else {
                aVar2.getClass();
                if (objQ3 == p3.m.a.f135155b) {
                    objQ3 = new u(aVar, a0Var, 1);
                    o0VarE.K(objQ3);
                }
            }
            o0Var = o0VarE;
            wVar.c(eVar, eVarC, (e23.a) objQ3, mcVar, null, null, z3.f.c(1910228813, new gw1.e(a0Var, 6, lVar, p1VarC), o0VarE), o0Var, ((i15 >> 3) & 7168) | 1572918, 48);
        } else {
            o0Var = o0VarE;
            o0Var.e();
        }
        p3.p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new defpackage.d(str, z14, cVar, cVar2, mcVar, aVar, lVar, i14);
        }
    }

    public static final void d(e23.a<Unit> aVar, a0 a0Var) {
        Object value;
        aVar.invoke();
        zn.a.d.f205376b.a();
        p2 p2Var = a0Var.f84578j;
        do {
            value = p2Var.getValue();
        } while (!p2Var.b(value, y.a((y) value, a0Var.f84577i, false, false, null, null, false, null, 126)));
    }

    public static final void e(y yVar, e23.a<Unit> aVar, e23.q<? super Integer, ? super jo.c, ? super eo.e, Unit> qVar, e23.p<? super Integer, ? super ho.b, Unit> pVar, e23.p<? super Integer, ? super eo.b, Unit> pVar2, e23.l<? super i53.c<? extends jo.c>, Unit> lVar, p3.m mVar, int i14) {
        o0 o0VarE = mVar.E(863744551);
        int i15 = (o0VarE.B(yVar) ? 4 : 2) | i14;
        if ((i14 & 48) == 0) {
            i15 |= o0VarE.r(aVar) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            i15 |= o0VarE.r(qVar) ? 256 : 128;
        }
        if ((i14 & 3072) == 0) {
            i15 |= o0VarE.r(pVar) ? 2048 : 1024;
        }
        if ((i14 & 24576) == 0) {
            i15 |= o0VarE.r(pVar2) ? 16384 : 8192;
        }
        if ((196608 & i14) == 0) {
            i15 |= o0VarE.r(lVar) ? 131072 : 65536;
        }
        if (o0VarE.n(i15 & 1, (74899 & i15) != 74898)) {
            x1 x1Var = p3.n.f135158a;
            b82.c.c(z3.f.c(-1727657327, new f(s02.a.a(o0VarE), yVar, aVar, lVar), o0VarE), z3.f.c(1641348311, new ak0.j(yVar, (Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b), qVar, pVar, pVar2, 27), o0VarE), o0VarE, 54);
        } else {
            o0VarE.e();
        }
        p3.p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new a11.g0(yVar, aVar, qVar, pVar, pVar2, lVar, i14);
        }
    }

    /* JADX WARN: Code duplicated, block: B:116:0x02e9  */
    /* JADX WARN: Code duplicated, block: B:41:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:69:0x0186  */
    /* JADX WARN: Code duplicated, block: B:88:0x0245  */
    public static final void f(final jo.c.a aVar, final e23.p<? super jo.c, ? super eo.e, Unit> pVar, e23.l<? super ho.b, Unit> lVar, e23.l<? super eo.b, Unit> lVar2, p3.m mVar, int i14) {
        o0 o0VarE = mVar.E(1599743284);
        int i15 = i14 | (o0VarE.B(aVar) ? 4 : 2) | (o0VarE.r(pVar) ? 32 : 16) | (o0VarE.r(lVar) ? 256 : 128) | (o0VarE.r(lVar2) ? 2048 : 1024);
        final int i16 = 0;
        if (o0VarE.n(i15 & 1, (i15 & 1171) != 1170)) {
            x1 x1Var = p3.n.f135158a;
            if (aVar instanceof jo.c.a.C1916a) {
                o0VarE.C(995365091);
                jo.c.a.C1916a c1916a = (jo.c.a.C1916a) aVar;
                i.c(x2.f(h4.r.S, 1.0f), null, i53.a.j(c1916a.f99700c), c1916a.f99701d, lVar, o0VarE, ((i15 << 6) & 57344) | 6);
                o0VarE.g0(false);
            } else {
                boolean z14 = aVar instanceof jo.c.a.b;
                p3.m.a aVar2 = p3.m.f135153a;
                if (z14) {
                    o0VarE.C(995756404);
                    h4.r rVarF = x2.f(h4.r.S, 1.0f);
                    d92.b.f58623a.getClass();
                    j92.b bVar = d92.b.f58625c;
                    bVar.getClass();
                    j92.e eVar = j92.b.f97899b;
                    float f14 = eVar.f97920e;
                    bVar.getClass();
                    float f15 = eVar.f97920e;
                    bVar.getClass();
                    h4.r rVarC = c2.l.C(rVarF, f14, 0.0f, f15, eVar.f97920e, 2);
                    jo.c.a.b bVar2 = (jo.c.a.b) aVar;
                    eo.d dVar = bVar2.f99703c;
                    eo.d dVar2 = bVar2.f99704d;
                    boolean z15 = ((i15 & 112) == 32) | ((i15 & 14) == 4);
                    Object objQ = o0VarE.q();
                    if (z15) {
                        objQ = new g80.e(21, pVar, aVar);
                        o0VarE.K(objQ);
                    } else {
                        aVar2.getClass();
                        if (objQ == p3.m.a.f135155b) {
                            objQ = new g80.e(21, pVar, aVar);
                            o0VarE.K(objQ);
                        }
                    }
                    p.a(rVarC, dVar, dVar2, (e23.p) objQ, o0VarE, 0);
                    o0VarE.g0(false);
                } else if (aVar instanceof jo.c.a.C1917c) {
                    o0VarE.C(996292983);
                    h4.r rVarF2 = x2.f(h4.r.S, 1.0f);
                    d92.b.f58623a.getClass();
                    j92.b bVar3 = d92.b.f58625c;
                    bVar3.getClass();
                    j92.e eVar2 = j92.b.f97899b;
                    float f16 = eVar2.f97920e;
                    bVar3.getClass();
                    float f17 = eVar2.f97920e;
                    bVar3.getClass();
                    h4.r rVarC2 = c2.l.C(rVarF2, f16, 0.0f, f17, eVar2.f97920e, 2);
                    jo.c.b bVar4 = jo.c.f99697b;
                    jo.c.a.C1917c c1917c = (jo.c.a.C1917c) aVar;
                    boolean z16 = c1917c.f99708e;
                    bVar4.getClass();
                    double d14 = z16 ? 150 : 100;
                    Integer num = c1917c.f99706c;
                    Double dValueOf = num != null ? Double.valueOf(num.intValue()) : null;
                    Integer num2 = c1917c.f99707d;
                    Double dValueOf2 = num2 != null ? Double.valueOf(num2.intValue()) : null;
                    jo.a aVar3 = c1917c.f99709f;
                    jo.a aVar4 = c1917c.f99710g;
                    boolean z17 = ((i15 & 112) == 32) | ((i15 & 14) == 4);
                    Object objQ2 = o0VarE.q();
                    if (z17) {
                        objQ2 = new e23.q() { // from class: ho.v
                            @Override // e23.q
                            public final Object invoke(Object obj, Object obj2, Object obj3) {
                                switch (i16) {
                                    case 0:
                                        Double d15 = (Double) obj;
                                        Double d16 = (Double) obj2;
                                        pVar.invoke(jo.c.a.C1917c.f((jo.c.a.C1917c) aVar, d15 != null ? Integer.valueOf((int) d15.doubleValue()) : null, d16 != null ? Integer.valueOf((int) d16.doubleValue()) : null, null, null, 28), (eo.e) obj3);
                                        break;
                                    case 1:
                                        pVar.invoke(jo.c.a.e.f((jo.c.a.e) aVar, (Integer) obj, (Integer) obj2, null, null, 12), (eo.e) obj3);
                                        break;
                                    default:
                                        Double d17 = (Double) obj;
                                        Double d18 = (Double) obj2;
                                        pVar.invoke(jo.c.a.f.f((jo.c.a.f) aVar, d17 != null ? Integer.valueOf((int) d17.doubleValue()) : null, d18 != null ? Integer.valueOf((int) d18.doubleValue()) : null, null, null, 28), (eo.e) obj3);
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        };
                        o0VarE.K(objQ2);
                    } else {
                        aVar2.getClass();
                        if (objQ2 == p3.m.a.f135155b) {
                            objQ2 = new e23.q() { // from class: ho.v
                                @Override // e23.q
                                public final Object invoke(Object obj, Object obj2, Object obj3) {
                                    switch (i16) {
                                        case 0:
                                            Double d15 = (Double) obj;
                                            Double d16 = (Double) obj2;
                                            pVar.invoke(jo.c.a.C1917c.f((jo.c.a.C1917c) aVar, d15 != null ? Integer.valueOf((int) d15.doubleValue()) : null, d16 != null ? Integer.valueOf((int) d16.doubleValue()) : null, null, null, 28), (eo.e) obj3);
                                            break;
                                        case 1:
                                            pVar.invoke(jo.c.a.e.f((jo.c.a.e) aVar, (Integer) obj, (Integer) obj2, null, null, 12), (eo.e) obj3);
                                            break;
                                        default:
                                            Double d17 = (Double) obj;
                                            Double d18 = (Double) obj2;
                                            pVar.invoke(jo.c.a.f.f((jo.c.a.f) aVar, d17 != null ? Integer.valueOf((int) d17.doubleValue()) : null, d18 != null ? Integer.valueOf((int) d18.doubleValue()) : null, null, null, 28), (eo.e) obj3);
                                            break;
                                    }
                                    return Unit.INSTANCE;
                                }
                            };
                            o0VarE.K(objQ2);
                        }
                    }
                    s.a(rVarC2, d14, dValueOf, dValueOf2, aVar3, aVar4, (e23.q) objQ2, o0VarE, 0);
                    o0VarE.g0(false);
                } else if (aVar instanceof jo.c.a.d) {
                    o0VarE.C(997092566);
                    h4.r rVarF3 = x2.f(h4.r.S, 1.0f);
                    d92.b.f58623a.getClass();
                    j92.b bVar5 = d92.b.f58625c;
                    bVar5.getClass();
                    j92.e eVar3 = j92.b.f97899b;
                    float f18 = eVar3.f97920e;
                    bVar5.getClass();
                    float f19 = eVar3.f97920e;
                    bVar5.getClass();
                    t.a(c2.l.C(rVarF3, f18, 0.0f, f19, eVar3.f97920e, 2), ((jo.c.a.d) aVar).f99713c, lVar2, o0VarE, (i15 >> 3) & 896);
                    o0VarE.g0(false);
                } else if (aVar instanceof jo.c.a.e) {
                    o0VarE.C(997525884);
                    h4.r rVarF4 = x2.f(h4.r.S, 1.0f);
                    d92.b.f58623a.getClass();
                    j92.b bVar6 = d92.b.f58625c;
                    bVar6.getClass();
                    j92.e eVar4 = j92.b.f97899b;
                    float f22 = eVar4.f97920e;
                    bVar6.getClass();
                    float f24 = eVar4.f97920e;
                    bVar6.getClass();
                    h4.r rVarC3 = c2.l.C(rVarF4, f22, 0.0f, f24, eVar4.f97920e, 2);
                    jo.c.a.e eVar5 = (jo.c.a.e) aVar;
                    Integer num3 = eVar5.f99715c;
                    Integer num4 = eVar5.f99716d;
                    jo.a aVar5 = eVar5.f99717e;
                    jo.a aVar6 = eVar5.f99718f;
                    boolean z18 = ((i15 & 14) == 4) | ((i15 & 112) == 32);
                    Object objQ3 = o0VarE.q();
                    if (z18) {
                        final int i17 = 1;
                        objQ3 = new e23.q() { // from class: ho.v
                            @Override // e23.q
                            public final Object invoke(Object obj, Object obj2, Object obj3) {
                                switch (i17) {
                                    case 0:
                                        Double d15 = (Double) obj;
                                        Double d16 = (Double) obj2;
                                        pVar.invoke(jo.c.a.C1917c.f((jo.c.a.C1917c) aVar, d15 != null ? Integer.valueOf((int) d15.doubleValue()) : null, d16 != null ? Integer.valueOf((int) d16.doubleValue()) : null, null, null, 28), (eo.e) obj3);
                                        break;
                                    case 1:
                                        pVar.invoke(jo.c.a.e.f((jo.c.a.e) aVar, (Integer) obj, (Integer) obj2, null, null, 12), (eo.e) obj3);
                                        break;
                                    default:
                                        Double d17 = (Double) obj;
                                        Double d18 = (Double) obj2;
                                        pVar.invoke(jo.c.a.f.f((jo.c.a.f) aVar, d17 != null ? Integer.valueOf((int) d17.doubleValue()) : null, d18 != null ? Integer.valueOf((int) d18.doubleValue()) : null, null, null, 28), (eo.e) obj3);
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        };
                        o0VarE.K(objQ3);
                    } else {
                        aVar2.getClass();
                        if (objQ3 == p3.m.a.f135155b) {
                            final int i18 = 1;
                            objQ3 = new e23.q() { // from class: ho.v
                                @Override // e23.q
                                public final Object invoke(Object obj, Object obj2, Object obj3) {
                                    switch (i18) {
                                        case 0:
                                            Double d15 = (Double) obj;
                                            Double d16 = (Double) obj2;
                                            pVar.invoke(jo.c.a.C1917c.f((jo.c.a.C1917c) aVar, d15 != null ? Integer.valueOf((int) d15.doubleValue()) : null, d16 != null ? Integer.valueOf((int) d16.doubleValue()) : null, null, null, 28), (eo.e) obj3);
                                            break;
                                        case 1:
                                            pVar.invoke(jo.c.a.e.f((jo.c.a.e) aVar, (Integer) obj, (Integer) obj2, null, null, 12), (eo.e) obj3);
                                            break;
                                        default:
                                            Double d17 = (Double) obj;
                                            Double d18 = (Double) obj2;
                                            pVar.invoke(jo.c.a.f.f((jo.c.a.f) aVar, d17 != null ? Integer.valueOf((int) d17.doubleValue()) : null, d18 != null ? Integer.valueOf((int) d18.doubleValue()) : null, null, null, 28), (eo.e) obj3);
                                            break;
                                    }
                                    return Unit.INSTANCE;
                                }
                            };
                            o0VarE.K(objQ3);
                        }
                    }
                    e0.c(rVarC3, num3, num4, aVar5, aVar6, (e23.q) objQ3, o0VarE, 0);
                    o0VarE.g0(false);
                } else {
                    if (!(aVar instanceof jo.c.a.f)) {
                        throw kg.f.h(o0VarE, -244985102, false);
                    }
                    o0VarE.C(998180263);
                    h4.r rVarF5 = x2.f(h4.r.S, 1.0f);
                    d92.b.f58623a.getClass();
                    j92.b bVar7 = d92.b.f58625c;
                    bVar7.getClass();
                    j92.e eVar6 = j92.b.f97899b;
                    float f25 = eVar6.f97920e;
                    bVar7.getClass();
                    float f26 = eVar6.f97920e;
                    bVar7.getClass();
                    h4.r rVarC4 = c2.l.C(rVarF5, f25, 0.0f, f26, eVar6.f97920e, 2);
                    jo.c.b bVar8 = jo.c.f99697b;
                    jo.c.a.f fVar = (jo.c.a.f) aVar;
                    boolean z19 = fVar.f99722e;
                    bVar8.getClass();
                    double d15 = z19 ? AuthApiStatusCodes.AUTH_API_INVALID_CREDENTIALS : 10000;
                    Integer num5 = fVar.f99720c;
                    Double dValueOf3 = num5 != null ? Double.valueOf(num5.intValue()) : null;
                    Integer num6 = fVar.f99721d;
                    Double dValueOf4 = num6 != null ? Double.valueOf(num6.intValue()) : null;
                    jo.a aVar7 = fVar.f99723f;
                    jo.a aVar8 = fVar.f99724g;
                    boolean z24 = ((i15 & 112) == 32) | ((i15 & 14) == 4);
                    Object objQ4 = o0VarE.q();
                    if (z24) {
                        final int i19 = 2;
                        objQ4 = new e23.q() { // from class: ho.v
                            @Override // e23.q
                            public final Object invoke(Object obj, Object obj2, Object obj3) {
                                switch (i19) {
                                    case 0:
                                        Double d16 = (Double) obj;
                                        Double d17 = (Double) obj2;
                                        pVar.invoke(jo.c.a.C1917c.f((jo.c.a.C1917c) aVar, d16 != null ? Integer.valueOf((int) d16.doubleValue()) : null, d17 != null ? Integer.valueOf((int) d17.doubleValue()) : null, null, null, 28), (eo.e) obj3);
                                        break;
                                    case 1:
                                        pVar.invoke(jo.c.a.e.f((jo.c.a.e) aVar, (Integer) obj, (Integer) obj2, null, null, 12), (eo.e) obj3);
                                        break;
                                    default:
                                        Double d18 = (Double) obj;
                                        Double d19 = (Double) obj2;
                                        pVar.invoke(jo.c.a.f.f((jo.c.a.f) aVar, d18 != null ? Integer.valueOf((int) d18.doubleValue()) : null, d19 != null ? Integer.valueOf((int) d19.doubleValue()) : null, null, null, 28), (eo.e) obj3);
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        };
                        o0VarE.K(objQ4);
                    } else {
                        aVar2.getClass();
                        if (objQ4 == p3.m.a.f135155b) {
                            final int i110 = 2;
                            objQ4 = new e23.q() { // from class: ho.v
                                @Override // e23.q
                                public final Object invoke(Object obj, Object obj2, Object obj3) {
                                    switch (i110) {
                                        case 0:
                                            Double d16 = (Double) obj;
                                            Double d17 = (Double) obj2;
                                            pVar.invoke(jo.c.a.C1917c.f((jo.c.a.C1917c) aVar, d16 != null ? Integer.valueOf((int) d16.doubleValue()) : null, d17 != null ? Integer.valueOf((int) d17.doubleValue()) : null, null, null, 28), (eo.e) obj3);
                                            break;
                                        case 1:
                                            pVar.invoke(jo.c.a.e.f((jo.c.a.e) aVar, (Integer) obj, (Integer) obj2, null, null, 12), (eo.e) obj3);
                                            break;
                                        default:
                                            Double d18 = (Double) obj;
                                            Double d19 = (Double) obj2;
                                            pVar.invoke(jo.c.a.f.f((jo.c.a.f) aVar, d18 != null ? Integer.valueOf((int) d18.doubleValue()) : null, d19 != null ? Integer.valueOf((int) d19.doubleValue()) : null, null, null, 28), (eo.e) obj3);
                                            break;
                                    }
                                    return Unit.INSTANCE;
                                }
                            };
                            o0VarE.K(objQ4);
                        }
                    }
                    ge1.b.a(rVarC4, d15, dValueOf3, dValueOf4, aVar7, aVar8, (e23.q) objQ4, o0VarE, 0);
                    o0VarE.g0(false);
                }
            }
        } else {
            o0VarE.e();
        }
        p3.p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new g52.d(aVar, pVar, lVar, lVar2, i14, 15);
        }
    }
}
