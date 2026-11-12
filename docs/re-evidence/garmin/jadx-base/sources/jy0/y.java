package jy0;

import am.c1;
import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import aq.s1;
import c2.x2;
import c22.j0;
import c22.x0;
import com.garmin.android.apps.connectmobile.R;
import g02.q0;
import i3.mh;
import java.util.Calendar;
import java.util.Locale;
import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p3.b4;
import p3.i2;
import p3.l0;
import p3.o0;
import p3.p0;
import p3.p1;
import p3.p2;
import p3.x1;

/* JADX INFO: loaded from: classes9.dex */
public final class y {

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"jy0/y$a", "Lp3/h0;", "runtime"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a implements p3.h0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ r22.c0 f101843a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ e23.a f101844b;

        public a(r22.c0 c0Var, e23.a aVar) {
            this.f101843a = c0Var;
            this.f101844b = aVar;
        }

        @Override // p3.h0
        public final void dispose() {
            this.f101843a.dismiss();
            this.f101844b.invoke();
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.multidayactivities.presentation.creation.MultiDayActivitiesDateRangeScreenKt$MultiDayActivitiesDateRangeScreen$6$1", f = "MultiDayActivitiesDateRangeScreen.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class b extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e23.l<Long, Unit> f101845a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ e23.l<Long, Unit> f101846b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ p1<Calendar> f101847c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ p1<Calendar> f101848d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(e23.l<? super Long, Unit> lVar, e23.l<? super Long, Unit> lVar2, p1<Calendar> p1Var, p1<Calendar> p1Var2, t13.d<? super b> dVar) {
            super(2, dVar);
            this.f101845a = lVar;
            this.f101846b = lVar2;
            this.f101847c = p1Var;
            this.f101848d = p1Var2;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new b(this.f101845a, this.f101846b, this.f101847c, this.f101848d, dVar);
        }

        @Override // e23.p
        public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
            return ((b) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            o13.r.b(obj);
            Calendar f182175a = this.f101847c.getF182175a();
            Long l14 = f182175a != null ? new Long(f182175a.getTimeInMillis()) : null;
            p1<Calendar> p1Var = this.f101848d;
            Calendar f182175a2 = p1Var.getF182175a();
            Long l15 = f182175a2 != null ? new Long(f182175a2.getTimeInMillis()) : null;
            this.f101845a.invoke(l14);
            if (l14 != null && l15 != null) {
                long jLongValue = l14.longValue();
                long jLongValue2 = l15.longValue();
                e23.l<Long, Unit> lVar = this.f101846b;
                if (jLongValue > jLongValue2 || (l15.longValue() - l14.longValue()) / 86400000 > 91) {
                    p1Var.setValue(null);
                    lVar.invoke(null);
                }
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.multidayactivities.presentation.creation.MultiDayActivitiesDateRangeScreenKt$MultiDayActivitiesDateRangeScreen$7$1", f = "MultiDayActivitiesDateRangeScreen.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class c extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e23.l<Long, Unit> f101849a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ p1<Calendar> f101850b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public c(e23.l<? super Long, Unit> lVar, p1<Calendar> p1Var, t13.d<? super c> dVar) {
            super(2, dVar);
            this.f101849a = lVar;
            this.f101850b = p1Var;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new c(this.f101849a, this.f101850b, dVar);
        }

        @Override // e23.p
        public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
            return ((c) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            o13.r.b(obj);
            Calendar f182175a = this.f101850b.getF182175a();
            this.f101849a.invoke(f182175a != null ? new Long(f182175a.getTimeInMillis()) : null);
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Code duplicated, block: B:43:0x00a1  */
    public static final void a(final long j8, final long j14, final Calendar calendar, final e23.a<Unit> aVar, final e23.l<? super Calendar, Unit> lVar, p3.m mVar, int i14) {
        o0 o0VarO = androidx.room.a0.o(aVar, lVar, mVar, -1190567870);
        int i15 = (o0VarO.l(j8) ? 4 : 2) | i14 | (o0VarO.l(j14) ? 32 : 16) | (o0VarO.r(calendar) ? 256 : 128);
        if ((i14 & 24576) == 0) {
            i15 |= o0VarO.r(lVar) ? 16384 : 8192;
        }
        if (o0VarO.n(i15 & 1, (i15 & 9363) != 9362)) {
            x1 x1Var = p3.n.f135158a;
            final Context context = (Context) o0VarO.A(AndroidCompositionLocals_androidKt.f6042b);
            Unit unit = Unit.INSTANCE;
            boolean zR = o0VarO.r(context) | ((i15 & 14) == 4) | ((i15 & 112) == 32) | o0VarO.r(calendar) | ((i15 & 57344) == 16384);
            Object objQ = o0VarO.q();
            if (zR) {
                e23.l lVar2 = new e23.l() { // from class: jy0.x
                    @Override // e23.l
                    public final Object invoke(Object obj) {
                        ((p3.i0) obj).getClass();
                        r22.c0 c0Var = new r22.c0(context, j8, j14, calendar, new s1(lVar, 7));
                        e23.a aVar2 = aVar;
                        c0Var.setOnDismissListener(new w(aVar2, 0));
                        c0Var.show();
                        return new y.a(c0Var, aVar2);
                    }
                };
                o0VarO.K(lVar2);
                objQ = lVar2;
            } else {
                p3.m.f135153a.getClass();
                if (objQ == p3.m.a.f135155b) {
                    e23.l lVar3 = new e23.l() { // from class: jy0.x
                        @Override // e23.l
                        public final Object invoke(Object obj) {
                            ((p3.i0) obj).getClass();
                            r22.c0 c0Var = new r22.c0(context, j8, j14, calendar, new s1(lVar, 7));
                            e23.a aVar2 = aVar;
                            c0Var.setOnDismissListener(new w(aVar2, 0));
                            c0Var.show();
                            return new y.a(c0Var, aVar2);
                        }
                    };
                    o0VarO.K(lVar3);
                    objQ = lVar3;
                }
            }
            l0.a(unit, (e23.l) objQ, o0VarO);
        } else {
            o0VarO.e();
        }
        p2 p2VarI0 = o0VarO.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new b82.x1(j8, j14, calendar, aVar, lVar, i14);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public static final void b(Long l14, Long l15, e23.l<? super Long, Unit> lVar, e23.l<? super Long, Unit> lVar2, p3.m mVar, int i14) {
        int i15;
        p1 p1Var;
        boolean z14;
        p1 p1Var2;
        Calendar calendar;
        p1 p1Var3;
        Calendar calendar2;
        Calendar calendar3;
        e23.l<? super Long, Unit> lVar3 = lVar2;
        lVar.getClass();
        lVar3.getClass();
        o0 o0VarE = mVar.E(-218732999);
        if ((i14 & 6) == 0) {
            i15 = (o0VarE.B(l14) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= o0VarE.B(l15) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            i15 |= o0VarE.r(lVar) ? 256 : 128;
        }
        if ((i14 & 3072) == 0) {
            i15 |= o0VarE.r(lVar3) ? 2048 : 1024;
        }
        if (o0VarE.n(i15 & 1, (i15 & 1171) != 1170)) {
            x1 x1Var = p3.n.f135158a;
            Object objQ = o0VarE.q();
            p3.m.f135153a.getClass();
            p3.m.a.C2565a c2565a = p3.m.a.f135155b;
            if (objQ == c2565a) {
                objQ = p0.n(Boolean.FALSE);
                o0VarE.K(objQ);
            }
            p1 p1Var4 = (p1) objQ;
            Object objQ2 = o0VarE.q();
            if (objQ2 == c2565a) {
                objQ2 = p0.n(Boolean.FALSE);
                o0VarE.K(objQ2);
            }
            p1 p1Var5 = (p1) objQ2;
            Object objQ3 = o0VarE.q();
            if (objQ3 == c2565a) {
                if (l14 != null) {
                    long jLongValue = l14.longValue();
                    calendar3 = Calendar.getInstance();
                    calendar3.setTimeInMillis(jLongValue);
                } else {
                    calendar3 = null;
                }
                objQ3 = p0.n(calendar3);
                o0VarE.K(objQ3);
            }
            p1 p1Var6 = (p1) objQ3;
            Object objQ4 = o0VarE.q();
            if (objQ4 == c2565a) {
                if (l15 != null) {
                    long jLongValue2 = l15.longValue();
                    calendar2 = Calendar.getInstance();
                    calendar2.setTimeInMillis(jLongValue2);
                } else {
                    calendar2 = null;
                }
                objQ4 = p0.n(calendar2);
                o0VarE.K(objQ4);
            }
            p1 p1Var7 = (p1) objQ4;
            h4.r.a aVar = h4.r.S;
            h4.r rVarD = x2.d(aVar, 1.0f);
            h4.d.f81522a.getClass();
            h4.g.a aVar2 = h4.d.a.f81537o;
            c2.j.f22691a.getClass();
            c2.z zVarA = c2.y.a(c2.j.f22694d, aVar2, o0VarE, 48);
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            h4.r rVarC = h4.k.c(rVarD, o0VarE);
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
            b4.c(h5.g.a.f81810g, zVarA, o0VarE);
            b4.c(h5.g.a.f81809f, i2VarA0, o0VarE);
            h5.g.a.b bVar = h5.g.a.f81813j;
            if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar);
            }
            b4.c(h5.g.a.f81807d, rVarC, o0VarE);
            c2.b0 b0Var = c2.b0.f22601a;
            d92.b.f58623a.getClass();
            j92.b bVar2 = d92.b.f58625c;
            bVar2.getClass();
            j92.e eVar = j92.b.f97899b;
            h4.r rVarC2 = c2.l.C(aVar, 0.0f, eVar.f97921f, 0.0f, 0.0f, 13);
            x0.f23314a.getClass();
            String strW = gl1.d.W(x0.Ya);
            j92.f fVar = d92.b.f58624b;
            fVar.getClass();
            s5.x0 x0VarB = d92.c.b(j92.f.f97930g, o0VarE);
            d6.h.f57752b.getClass();
            int i16 = d6.h.f57755e;
            p1 p1Var8 = p1Var7;
            int i17 = i15;
            boolean z15 = false;
            mh.c(strW, rVarC2, 0L, null, 0L, null, 0L, d6.h.a(i16), 0L, 0, false, 0, 0, null, x0VarB, o0VarE, 0, 0, 130044);
            bVar2.getClass();
            float f14 = eVar.f97918c;
            bVar2.getClass();
            h4.r rVarC3 = c2.l.C(aVar, 0.0f, f14, 0.0f, eVar.f97921f, 5);
            String strW2 = gl1.d.W(x0.Aa);
            fVar.getClass();
            mh.c(strW2, rVarC3, 0L, null, 0L, null, 0L, d6.h.a(i16), 0L, 0, false, 0, 0, null, d92.c.f(j92.f.f97932i, o0VarE), o0VarE, 0, 0, 130044);
            Calendar calendar4 = (Calendar) p1Var6.getF182175a();
            String strA = calendar4 != null ? j0.a(new DateTime(calendar4.getTimeInMillis(), DateTimeZone.getDefault()), 'S') : null;
            if (strA == null) {
                o0VarE.C(-1449730162);
                strA = gl1.d.W(x0.Xa);
            } else {
                o0VarE.C(-1449737106);
            }
            o0VarE.g0(false);
            l72.p2 p2Var = l72.p2.f111205a;
            String strQ = gl1.y.Q(o0VarE, R.string.lbl_start_date);
            jy0.c.f101678a.getClass();
            z3.e eVar2 = jy0.c.f101679b;
            Object objQ5 = o0VarE.q();
            if (objQ5 == c2565a) {
                objQ5 = new jt1.h(p1Var4, 13);
                o0VarE.K(objQ5);
            }
            p2Var.h(strQ, strA, null, null, null, false, false, null, eVar2, null, (e23.a) objQ5, o0VarE, 100663296, 6, 764);
            Calendar calendar5 = (Calendar) p1Var8.getF182175a();
            String strA2 = calendar5 != null ? j0.a(new DateTime(calendar5.getTimeInMillis(), DateTimeZone.getDefault()), 'S') : null;
            if (strA2 == null) {
                o0VarE.C(-1449700372);
                strA2 = gl1.d.W(x0.Va);
            } else {
                o0VarE.C(-1449707223);
            }
            o0VarE.g0(false);
            String strQ2 = gl1.y.Q(o0VarE, R.string.common_end_date);
            z3.e eVar3 = jy0.c.f101680c;
            Object objQ6 = o0VarE.q();
            int i18 = 14;
            if (objQ6 == c2565a) {
                objQ6 = new jt1.h(p1Var5, 14);
                o0VarE.K(objQ6);
            }
            p2Var.h(strQ2, strA2, null, null, null, false, false, null, eVar3, null, (e23.a) objQ6, o0VarE, 100663296, 6, 764);
            o0VarE = o0VarE;
            o0VarE.g0(true);
            int i19 = 15;
            if (((Boolean) p1Var4.getF182175a()).booleanValue()) {
                o0VarE.C(-805969967);
                boolean zB = o0VarE.B((Calendar) p1Var6.getF182175a());
                Object objQ7 = o0VarE.q();
                if (zB || objQ7 == c2565a) {
                    Calendar calendar6 = (Calendar) p1Var6.getF182175a();
                    if (calendar6 == null) {
                        calendar6 = Calendar.getInstance(Locale.getDefault());
                    }
                    objQ7 = calendar6;
                    o0VarE.K(objQ7);
                }
                Calendar calendar7 = (Calendar) objQ7;
                calendar7.getClass();
                DateTime dateTime = new DateTime(0L);
                DateTime dateTimePlusYears = DateTime.now().plusYears(1);
                long millis = dateTime.getMillis();
                long millis2 = dateTimePlusYears.getMillis();
                Object objQ8 = o0VarE.q();
                if (objQ8 == c2565a) {
                    objQ8 = new jt1.h(p1Var4, 15);
                    o0VarE.K(objQ8);
                }
                e23.a aVar4 = (e23.a) objQ8;
                Object objQ9 = o0VarE.q();
                if (objQ9 == c2565a) {
                    p1Var = p1Var6;
                    objQ9 = new c1(p1Var, p1Var4, i18);
                    o0VarE.K(objQ9);
                } else {
                    p1Var = p1Var6;
                }
                a(millis, millis2, calendar7, aVar4, (e23.l) objQ9, o0VarE, 27648);
                o0VarE.g0(false);
            } else {
                p1Var = p1Var6;
                o0VarE.C(-805301111);
                o0VarE.g0(false);
            }
            if (((Boolean) p1Var5.getF182175a()).booleanValue()) {
                o0VarE.C(-805237034);
                boolean zB2 = o0VarE.B((Calendar) p1Var8.getF182175a());
                Object objQ10 = o0VarE.q();
                if (zB2 || objQ10 == c2565a) {
                    Calendar calendar8 = (Calendar) p1Var.getF182175a();
                    if (calendar8 != null) {
                        calendar = Calendar.getInstance();
                        DateTime dateTime2 = new DateTime(calendar8.getTimeInMillis());
                        z14 = true;
                        calendar.setTimeInMillis(dateTime2.plusDays(1).getMillis());
                    } else {
                        z14 = true;
                        calendar = null;
                    }
                    objQ10 = (Calendar) p1Var8.getF182175a();
                    if (objQ10 == null) {
                        objQ10 = calendar == null ? Calendar.getInstance(Locale.getDefault()) : calendar;
                    }
                    o0VarE.K(objQ10);
                } else {
                    z14 = true;
                }
                Calendar calendar9 = (Calendar) objQ10;
                calendar9.getClass();
                Calendar calendar10 = (Calendar) p1Var.getF182175a();
                DateTime dateTime3 = calendar10 != null ? new DateTime(calendar10.getTimeInMillis()) : DateTime.now();
                DateTime dateTimePlusDays = dateTime3.plusDays(91);
                long millis3 = dateTime3.getMillis();
                long millis4 = dateTimePlusDays.getMillis();
                Object objQ11 = o0VarE.q();
                if (objQ11 == c2565a) {
                    objQ11 = new jt1.h(p1Var5, 16);
                    o0VarE.K(objQ11);
                }
                e23.a aVar5 = (e23.a) objQ11;
                Object objQ12 = o0VarE.q();
                if (objQ12 == c2565a) {
                    p1Var3 = p1Var8;
                    objQ12 = new c1(p1Var3, p1Var5, i19);
                    o0VarE.K(objQ12);
                } else {
                    p1Var3 = p1Var8;
                }
                p1Var8 = p1Var3;
                a(millis3, millis4, calendar9, aVar5, (e23.l) objQ12, o0VarE, 27648);
                o0VarE.g0(false);
            } else {
                z14 = true;
                o0VarE.C(-804234711);
                o0VarE.g0(false);
            }
            Calendar calendar11 = (Calendar) p1Var.getF182175a();
            int i24 = i17 & 7168;
            boolean z16 = (i24 == 2048 ? z14 : false) | ((i17 & 896) == 256 ? z14 : false);
            Object objQ13 = o0VarE.q();
            if (z16 || objQ13 == c2565a) {
                p1 p1Var9 = p1Var8;
                b bVar3 = new b(lVar, lVar2, p1Var, p1Var9, null);
                lVar3 = lVar2;
                p1Var2 = p1Var9;
                o0VarE.K(bVar3);
                objQ13 = bVar3;
            } else {
                lVar3 = lVar2;
                p1Var2 = p1Var8;
            }
            l0.e((e23.p) objQ13, calendar11, o0VarE);
            Calendar calendar12 = (Calendar) p1Var2.getF182175a();
            if (i24 == 2048) {
                z15 = z14;
            }
            Object objQ14 = o0VarE.q();
            if (z15 || objQ14 == c2565a) {
                objQ14 = new c(lVar3, p1Var2, null);
                o0VarE.K(objQ14);
            }
            l0.e((e23.p) objQ14, calendar12, o0VarE);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new q0(l14, l15, lVar, lVar3, i14, 13);
        }
    }
}
