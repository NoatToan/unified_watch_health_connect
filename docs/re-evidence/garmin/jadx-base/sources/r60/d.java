package r60;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import c2.b0;
import c2.j;
import c2.x2;
import c2.y;
import c2.z;
import com.garmin.android.apps.connectmobile.R;
import e23.l;
import h4.k;
import h4.r;
import h5.e0;
import i3.mh;
import j92.f;
import java.util.List;
import l72.p2;
import o4.m1;
import o82.g;
import oi0.h;
import org.joda.time.DateTime;
import org.joda.time.LocalDate;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import p13.x;
import p3.b4;
import p3.i2;
import p3.m;
import p3.n;
import p3.o0;
import p3.p0;
import p3.x1;
import pi0.e;
import q42.v;

/* JADX INFO: loaded from: classes8.dex */
public final class d {

    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f151010a;

        static {
            int[] iArr = new int[g.values().length];
            try {
                iArr[g.f130854g.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[g.f130856i.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[g.f130851d.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f151010a = iArr;
        }
    }

    /* JADX WARN: Code duplicated, block: B:135:0x03a0  */
    /* JADX WARN: Code duplicated, block: B:88:0x02a3  */
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
    public static final void a(LocalDate localDate, LocalDate localDate2, g gVar, n60.b bVar, e23.a<Unit> aVar, l<Object, Unit> lVar, m mVar, int i14) {
        boolean z14;
        boolean z15;
        h hVar;
        String strD;
        gVar.getClass();
        aVar.getClass();
        lVar.getClass();
        o0 o0VarE = mVar.E(362848910);
        int i15 = i14 | (o0VarE.r(localDate) ? 4 : 2) | (o0VarE.r(localDate2) ? 32 : 16) | (o0VarE.k(gVar.ordinal()) ? 256 : 128) | (o0VarE.r(bVar) ? 2048 : 1024) | (o0VarE.r(aVar) ? 16384 : 8192) | (o0VarE.r(lVar) ? 131072 : 65536);
        if (o0VarE.n(i15 & 1, (74899 & i15) != 74898)) {
            x1 x1Var = n.f135158a;
            Context context = (Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b);
            s60.a aVar2 = new s60.a(context);
            h hVar2 = new h(context);
            r.a aVar3 = r.S;
            r rVarD = x2.d(aVar3, 1.0f);
            long jF = vb.h.f(d92.b.f58623a, o0VarE);
            m1.a aVar4 = m1.f128891a;
            r rVarE = u1.n.e(rVarD, jF, aVar4);
            j.f22691a.getClass();
            j.k kVar = j.f22694d;
            h4.d.f81522a.getClass();
            z zVarA = y.a(kVar, h4.d.a.f81536n, o0VarE, 0);
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            r rVarC = k.c(rVarE, o0VarE);
            h5.g.V.getClass();
            e0.a aVar5 = h5.g.a.f81805b;
            if (o0VarE.f135177b == null) {
                p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar5);
            } else {
                o0VarE.c();
            }
            b4.c(h5.g.a.f81810g, zVarA, o0VarE);
            b4.c(h5.g.a.f81809f, i2VarA0, o0VarE);
            h5.g.a.b bVar2 = h5.g.a.f81813j;
            if (o0VarE.T || !s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar2);
            }
            b4.c(h5.g.a.f81807d, rVarC, o0VarE);
            b0 b0Var = b0.f22601a;
            c.a(localDate, localDate2, gVar, bVar, o0VarE, i15 & 8190);
            d92.b.f58625c.getClass();
            r rVarY = c2.l.y(aVar3, j92.b.f97899b.f97920e);
            String strQ = gl1.y.Q(o0VarE, R.string.lbl_css_results);
            d92.b.f58624b.getClass();
            h hVar3 = hVar2;
            int i16 = i15;
            mh.c(strQ, rVarY, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.b(d92.c.e(f.f97931h), o0VarE), o0VarE, 0, 0, 131068);
            p2.f111205a.f(null, z3.f.c(313503280, new ho0.f(context, 12), o0VarE), null, false, false, null, null, o0VarE, 48, 125);
            o0VarE = o0VarE;
            g6.f.a aVar6 = g6.f.f75994b;
            c2.l.f(u1.n.e(x2.h(x2.f(aVar3, 1.0f), 2), d92.b.a(o0VarE).c().g(), aVar4), o0VarE);
            int i17 = a.f151010a[gVar.ordinal()];
            m.a aVar7 = m.f135153a;
            String str = aVar2.f157616d;
            e eVar = aVar2.f157614b;
            if (i17 == 1 || i17 == 2) {
                h hVar4 = hVar3;
                int i18 = 131072;
                o0VarE.C(2119217088);
                List<n60.a> listF = bVar != null ? bVar.f() : null;
                if (listF == null || !(!listF.isEmpty())) {
                    o0VarE.C(2120723502);
                    b.a(-1, 224304, null, gl1.y.Q(o0VarE, R.string.no_duration_value), null, gl1.y.Q(o0VarE, R.string.no_value), null, o0VarE);
                    z14 = false;
                    o0VarE.g0(false);
                } else {
                    o0VarE.C(2119349737);
                    int i19 = 0;
                    for (Object obj : listF) {
                        int i24 = i19 + 1;
                        if (i19 < 0) {
                            x.q();
                            throw null;
                        }
                        n60.a aVar8 = (n60.a) obj;
                        String strA = aVar2.a(aVar8.b(), null);
                        Double d14 = aVar8.d();
                        String strD2 = d14 != null ? hVar4.d((long) d14.doubleValue(), false) : null;
                        LocalDate localDate3 = aVar8.getCom.google.firebase.messaging.Constants.MessagePayloadKeys.FROM java.lang.String();
                        LocalDate until = aVar8.getUntil();
                        String strM = (localDate3 == null || until == null) ? str : eVar.m(localDate3, until, pi0.f.SHORT_MONTH_NO_WEEKDAY);
                        String strM2 = (localDate3 == null || until == null) ? str : eVar.m(localDate3, until, pi0.f.MONTH_NO_WEEKDAY);
                        boolean zR = ((i16 & 458752) == i18) | o0VarE.r(aVar8) | ((i16 & 57344) == 16384);
                        Object objQ = o0VarE.q();
                        if (zR) {
                            objQ = new v(lVar, 10, aVar8, aVar);
                            o0VarE.K(objQ);
                        } else {
                            aVar7.getClass();
                            if (objQ == m.a.f135155b) {
                                objQ = new v(lVar, 10, aVar8, aVar);
                                o0VarE.K(objQ);
                            }
                        }
                        b.a(i19, 0, (e23.a) objQ, strA, strD2, strM, strM2, o0VarE);
                        eVar = eVar;
                        i19 = i24;
                        hVar4 = hVar4;
                        i18 = 131072;
                    }
                    z14 = false;
                    o0VarE.g0(false);
                }
                o0VarE.g0(z14);
                Unit unit = Unit.INSTANCE;
            } else if (i17 != 3) {
                o0VarE.C(2123053896);
                o0VarE.g0(false);
                Unit unit2 = Unit.INSTANCE;
            } else {
                o0VarE.C(2121263770);
                List<g60.b> listG = bVar != null ? bVar.g() : null;
                if (listG == null || !(!listG.isEmpty())) {
                    o0VarE.C(2122591438);
                    b.a(-1, 224304, null, gl1.y.Q(o0VarE, R.string.no_duration_value), null, gl1.y.Q(o0VarE, R.string.no_value), null, o0VarE);
                    z15 = false;
                    o0VarE.g0(false);
                    Unit unit3 = Unit.INSTANCE;
                } else {
                    o0VarE.C(2121463131);
                    List<g60.b> listG2 = bVar.g();
                    if (listG2 == null) {
                        o0VarE.C(2121463130);
                        z15 = false;
                        o0VarE.g0(false);
                    } else {
                        o0VarE.C(2121463131);
                        int i25 = 0;
                        for (Object obj2 : listG2) {
                            int i26 = i25 + 1;
                            if (i25 < 0) {
                                x.q();
                                throw null;
                            }
                            g60.b bVar3 = (g60.b) obj2;
                            String strA2 = aVar2.a(bVar3.b(), null);
                            Double d15 = bVar3.d();
                            int i27 = i16;
                            if (d15 != null) {
                                long jDoubleValue = (long) d15.doubleValue();
                                hVar = hVar3;
                                strD = hVar.d(jDoubleValue, false);
                            } else {
                                hVar = hVar3;
                                strD = null;
                            }
                            DateTime dateTimeF = bVar3.f();
                            LocalDate localDate4 = dateTimeF != null ? dateTimeF.toLocalDate() : null;
                            String strD3 = localDate4 != null ? eVar.d(localDate4, qi0.a.RELATIVE_YEAR_MONTH_DAY) : str;
                            hVar3 = hVar;
                            boolean zR2 = ((i27 & 458752) == 131072) | o0VarE.r(bVar3) | ((i27 & 57344) == 16384);
                            Object objQ2 = o0VarE.q();
                            if (zR2) {
                                objQ2 = new v(lVar, 11, bVar3, aVar);
                                o0VarE.K(objQ2);
                            } else {
                                aVar7.getClass();
                                if (objQ2 == m.a.f135155b) {
                                    objQ2 = new v(lVar, 11, bVar3, aVar);
                                    o0VarE.K(objQ2);
                                }
                            }
                            b.a(i25, 0, (e23.a) objQ2, strA2, strD, strD3, strD3, o0VarE);
                            eVar = eVar;
                            str = str;
                            i25 = i26;
                            i16 = i27;
                        }
                        z15 = false;
                        o0VarE.g0(false);
                        Unit unit4 = Unit.INSTANCE;
                    }
                    o0VarE.g0(z15);
                }
                o0VarE.g0(z15);
            }
            o0VarE.g0(true);
            x1 x1Var2 = n.f135158a;
        } else {
            o0VarE.e();
        }
        p3.p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new oy0.b(localDate, localDate2, gVar, bVar, aVar, lVar, i14, 11);
        }
    }
}
