package xu0;

import android.content.Context;
import android.text.format.DateFormat;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import b82.a1;
import c2.b0;
import c2.j;
import c2.q;
import c2.q2;
import c2.s2;
import c2.u;
import c2.u2;
import c2.x2;
import c2.z;
import c22.s3;
import ch.qos.logback.core.net.SyslogConstants;
import com.garmin.android.apps.connectmobile.R;
import com.google.android.exoplayer2.source.ProgressiveMediaSource;
import cq0.i;
import e23.l;
import e23.p;
import f5.z0;
import gl1.y;
import h4.g;
import h4.k;
import h4.r;
import h5.e0;
import i3.ff;
import i3.hf;
import i3.i7;
import i3.mh;
import i3.p3;
import j92.f;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import l72.f0;
import l72.w1;
import o4.d0;
import o4.m1;
import org.joda.time.DateTime;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import p3.b4;
import p3.i2;
import p3.m;
import p3.n;
import p3.o0;
import p3.p0;
import p3.p2;
import p3.x1;
import p5.v;
import s5.x0;
import u1.w;
import v.h;
import wd2.d2;
import wd2.e2;
import wd2.f2;
import wd2.z1;
import xd2.m0;

/* JADX INFO: loaded from: classes9.dex */
public final class e {
    /* JADX WARN: Code duplicated, block: B:36:0x008b  */
    /* JADX WARN: Code duplicated, block: B:41:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:50:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:56:0x0129  */
    /* JADX WARN: Code duplicated, block: B:61:0x0168  */
    /* JADX WARN: Code duplicated, block: B:70:0x0195  */
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
    public static final void a(final ev0.b bVar, boolean z14, final l<? super ev0.b, Unit> lVar, final l<? super Long, Unit> lVar2, m mVar, int i14) {
        o0 o0VarE = mVar.E(-1711042887);
        int i15 = (o0VarE.r(bVar) ? 4 : 2) | i14 | (o0VarE.h(z14) ? 32 : 16);
        if ((i14 & 384) == 0) {
            i15 |= o0VarE.r(lVar) ? 256 : 128;
        }
        if ((i14 & 3072) == 0) {
            i15 |= o0VarE.r(lVar2) ? 2048 : 1024;
        }
        final int i16 = 0;
        if (o0VarE.n(i15 & 1, (i15 & 1171) != 1170)) {
            x1 x1Var = n.f135158a;
            Context context = (Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b);
            boolean zA = bVar.a();
            m.a aVar = m.f135153a;
            if (zA) {
                o0VarE.C(-1006506251);
                boolean zB = o0VarE.B(context);
                Object objQ = o0VarE.q();
                if (zB) {
                    objQ = oi0.c.A(context, new m0(11), context.getString(R.string.txt_stop_live_track));
                    o0VarE.K(objQ);
                } else {
                    aVar.getClass();
                    if (objQ == m.a.f135155b) {
                        objQ = oi0.c.A(context, new m0(11), context.getString(R.string.txt_stop_live_track));
                        o0VarE.K(objQ);
                    }
                }
                String str = (String) objQ;
                f0 f0Var = f0.f110999a;
                r rVarF = x2.f(r.S, 1.0f);
                d92.b.f58623a.getClass();
                d92.b.f58625c.getClass();
                r rVarY = c2.l.y(rVarF, j92.b.f97899b.f97920e);
                boolean zB2 = o0VarE.B(str);
                Object objQ2 = o0VarE.q();
                if (zB2) {
                    objQ2 = new u91.c(str, 25);
                    o0VarE.K(objQ2);
                } else {
                    aVar.getClass();
                    if (objQ2 == m.a.f135155b) {
                        objQ2 = new u91.c(str, 25);
                        o0VarE.K(objQ2);
                    }
                }
                r rVarC = v.c((l) objQ2, rVarY, false);
                String strQ = y.Q(o0VarE, R.string.txt_stop_live_track);
                boolean zR = o0VarE.r(bVar) | ((i15 & 7168) == 2048);
                Object objQ3 = o0VarE.q();
                if (zR) {
                    objQ3 = new e23.a() { // from class: xu0.d
                        @Override // e23.a
                        public final Object invoke() {
                            switch (i16) {
                                case 0:
                                    lVar2.invoke(Long.valueOf(bVar.f66140a));
                                    break;
                                default:
                                    lVar2.invoke(bVar);
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    };
                    o0VarE.K(objQ3);
                } else {
                    aVar.getClass();
                    if (objQ3 == m.a.f135155b) {
                        objQ3 = new e23.a() { // from class: xu0.d
                            @Override // e23.a
                            public final Object invoke() {
                                switch (i16) {
                                    case 0:
                                        lVar2.invoke(Long.valueOf(bVar.f66140a));
                                        break;
                                    default:
                                        lVar2.invoke(bVar);
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        };
                        o0VarE.K(objQ3);
                    }
                }
                f0Var.b(strQ, rVarC, z14, (e23.a) objQ3, o0VarE, (i15 << 3) & 896, 0);
                o0VarE.g0(false);
            } else {
                o0VarE.C(-1005907703);
                boolean zB3 = o0VarE.B(context);
                Object objQ4 = o0VarE.q();
                if (zB3) {
                    objQ4 = oi0.c.A(context, new m0(12), context.getString(R.string.live_track_config_bttn_text_start_live_track));
                    o0VarE.K(objQ4);
                } else {
                    aVar.getClass();
                    if (objQ4 == m.a.f135155b) {
                        objQ4 = oi0.c.A(context, new m0(12), context.getString(R.string.live_track_config_bttn_text_start_live_track));
                        o0VarE.K(objQ4);
                    }
                }
                String str2 = (String) objQ4;
                f0 f0Var2 = f0.f110999a;
                r rVarF2 = x2.f(r.S, 1.0f);
                d92.b.f58623a.getClass();
                d92.b.f58625c.getClass();
                r rVarY2 = c2.l.y(rVarF2, j92.b.f97899b.f97920e);
                boolean zB4 = o0VarE.B(str2);
                Object objQ5 = o0VarE.q();
                if (zB4) {
                    objQ5 = new u91.c(str2, 26);
                    o0VarE.K(objQ5);
                } else {
                    aVar.getClass();
                    if (objQ5 == m.a.f135155b) {
                        objQ5 = new u91.c(str2, 26);
                        o0VarE.K(objQ5);
                    }
                }
                r rVarC2 = v.c((l) objQ5, rVarY2, false);
                String strQ2 = y.Q(o0VarE, R.string.live_track_config_bttn_text_start_live_track);
                boolean zR2 = ((i15 & 896) == 256) | o0VarE.r(bVar);
                Object objQ6 = o0VarE.q();
                if (zR2) {
                    final int i17 = 1;
                    objQ6 = new e23.a() { // from class: xu0.d
                        @Override // e23.a
                        public final Object invoke() {
                            switch (i17) {
                                case 0:
                                    lVar.invoke(Long.valueOf(bVar.f66140a));
                                    break;
                                default:
                                    lVar.invoke(bVar);
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    };
                    o0VarE.K(objQ6);
                } else {
                    aVar.getClass();
                    if (objQ6 == m.a.f135155b) {
                        final int i18 = 1;
                        objQ6 = new e23.a() { // from class: xu0.d
                            @Override // e23.a
                            public final Object invoke() {
                                switch (i18) {
                                    case 0:
                                        lVar.invoke(Long.valueOf(bVar.f66140a));
                                        break;
                                    default:
                                        lVar.invoke(bVar);
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        };
                        o0VarE.K(objQ6);
                    }
                }
                f0Var2.i(strQ2, rVarC2, z14, (e23.a) objQ6, o0VarE, (i15 << 3) & 896, 0);
                o0VarE.g0(false);
            }
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new i(bVar, z14, lVar, lVar2, i14, 27);
        }
    }

    /* JADX WARN: Code duplicated, block: B:137:0x03a9  */
    /* JADX WARN: Code duplicated, block: B:168:0x04b3  */
    public static final void b(final z1 z1Var, final boolean z14, final boolean z15, final long j8, final boolean z16, final l<? super Boolean, Unit> lVar, final l<? super z1, Unit> lVar2, final l<? super Long, Unit> lVar3, m mVar, final int i14) {
        l<? super z1, Unit> lVar4;
        o0 o0Var;
        l<? super Boolean, Unit> lVar5;
        p2 p2VarI0;
        p<? super m, ? super Integer, Unit> pVar;
        o0 o0Var2;
        int i15;
        boolean z17;
        boolean z18;
        o0 o0VarE = mVar.E(1929844696);
        p3.c<?> cVar = o0VarE.f135177b;
        int i16 = i14 | (o0VarE.r(z1Var) ? 4 : 2) | (o0VarE.h(z14) ? 32 : 16) | (o0VarE.l(j8) ? 2048 : 1024) | (o0VarE.h(z16) ? 16384 : 8192);
        if ((i14 & 196608) == 0) {
            i16 |= o0VarE.r(lVar) ? 131072 : 65536;
        }
        if ((i14 & 1572864) == 0) {
            lVar4 = lVar2;
            i16 |= o0VarE.r(lVar4) ? ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288;
        } else {
            lVar4 = lVar2;
        }
        if ((i14 & 12582912) == 0) {
            i16 |= o0VarE.r(lVar3) ? 8388608 : 4194304;
        }
        int i17 = i16;
        if (o0VarE.n(i17 & 1, (4793491 & i16) != 4793490)) {
            x1 x1Var = n.f135158a;
            if (z1Var == null) {
                p2VarI0 = o0VarE.i0();
                if (p2VarI0 == null) {
                    return;
                }
                final int i18 = 0;
                final l<? super z1, Unit> lVar6 = lVar4;
                pVar = new p() { // from class: xu0.c
                    @Override // e23.p
                    public final Object invoke(Object obj, Object obj2) {
                        switch (i18) {
                            case 0:
                                ((Integer) obj2).getClass();
                                e.b(z1Var, z14, z15, j8, z16, lVar, lVar6, lVar3, (m) obj, p0.t(i14 | 1));
                                break;
                            default:
                                ((Integer) obj2).getClass();
                                e.b(z1Var, z14, z15, j8, z16, lVar, lVar6, lVar3, (m) obj, p0.t(i14 | 1));
                                break;
                        }
                        return Unit.INSTANCE;
                    }
                };
            } else {
                Context context = (Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b);
                DateTime dateTime = z1Var.f184695c;
                String string = dateTime != null ? context.getString(R.string.lbl_started, DateFormat.getTimeFormat(context).format(dateTime.toDate())) : null;
                r.a aVar = r.S;
                r rVarF = x2.f(aVar, 1.0f);
                d92.b.f58623a.getClass();
                j92.b bVar = d92.b.f58625c;
                bVar.getClass();
                j92.e eVar = j92.b.f97899b;
                float f14 = eVar.f97920e;
                bVar.getClass();
                r rVarZ = c2.l.z(rVarF, f14, eVar.f97920e);
                h4.d.f81522a.getClass();
                g.b bVar2 = h4.d.a.f81533k;
                j.f22691a.getClass();
                j.C0343j c0343j = j.f22692b;
                s2 s2VarA = q2.a(c0343j, bVar2, o0VarE, 48);
                int iHashCode = Long.hashCode(o0VarE.U);
                i2 i2VarA0 = o0VarE.a0();
                r rVarC = k.c(rVarZ, o0VarE);
                h5.g.V.getClass();
                e0.a aVar2 = h5.g.a.f81805b;
                if (cVar == null) {
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
                b4.c(eVar2, s2VarA, o0VarE);
                h5.g.a.C1623g c1623g = h5.g.a.f81809f;
                b4.c(c1623g, i2VarA0, o0VarE);
                h5.g.a.b bVar3 = h5.g.a.f81813j;
                if (o0VarE.T || !s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                    h.A(iHashCode, o0VarE, iHashCode, bVar3);
                }
                h5.g.a.f fVar = h5.g.a.f81807d;
                b4.c(fVar, rVarC, o0VarE);
                r rVarA = u2.f22900a.a(aVar, 1.0f, true);
                z zVarA = c2.y.a(j.f22694d, h4.d.a.f81536n, o0VarE, 0);
                int iHashCode2 = Long.hashCode(o0VarE.U);
                i2 i2VarA1 = o0VarE.a0();
                r rVarC2 = k.c(rVarA, o0VarE);
                if (cVar == null) {
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
                b4.c(c1623g, i2VarA1, o0VarE);
                if (o0VarE.T || !s.g(o0VarE.q(), Integer.valueOf(iHashCode2))) {
                    h.A(iHashCode2, o0VarE, iHashCode2, bVar3);
                }
                b4.c(fVar, rVarC2, o0VarE);
                b0 b0Var = b0.f22601a;
                String str = z1Var.f184694b;
                if (str == null) {
                    str = "";
                }
                f fVar2 = d92.b.f58624b;
                fVar2.getClass();
                mh.c(str, null, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.b(f.f97930g, o0VarE), o0VarE, 0, 0, 131070);
                o0 o0Var3 = o0VarE;
                if (string == null || string.length() == 0) {
                    o0Var3.C(1385452196);
                    o0Var3.g0(false);
                } else {
                    o0Var3.C(1385297475);
                    fVar2.getClass();
                    mh.c(string, null, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.f(f.f97933j, o0Var3), o0Var3, 0, 0, 131070);
                    o0Var3 = o0Var3;
                    o0Var3.g0(false);
                }
                s2 s2VarA2 = q2.a(c0343j, h4.d.a.f81534l, o0Var3, 48);
                int iHashCode3 = Long.hashCode(o0Var3.U);
                i2 i2VarA2 = o0Var3.a0();
                r rVarC3 = k.c(aVar, o0Var3);
                if (cVar == null) {
                    p0.l();
                    throw null;
                }
                o0Var3.z();
                if (o0Var3.T) {
                    o0Var3.M(aVar2);
                } else {
                    o0Var3.c();
                }
                b4.c(eVar2, s2VarA2, o0Var3);
                b4.c(c1623g, i2VarA2, o0Var3);
                if (o0Var3.T || !s.g(o0Var3.q(), Integer.valueOf(iHashCode3))) {
                    h.A(iHashCode3, o0Var3, iHashCode3, bVar3);
                }
                b4.c(fVar, rVarC3, o0Var3);
                Map<f2, List<d2>> map = z1Var.f184699g;
                if (map == null) {
                    o0Var2 = o0Var3;
                    o0Var2.C(-1469249720);
                    o0Var2.g0(false);
                    break;
                }
                Iterator<Map.Entry<f2, List<d2>>> it = map.entrySet().iterator();
                loop0: while (true) {
                    if (!it.hasNext()) {
                        o0Var2 = o0Var3;
                        o0Var2.C(-1469249720);
                        o0Var2.g0(false);
                        break;
                    }
                    Iterator<T> it3 = it.next().getValue().iterator();
                    while (it3.hasNext()) {
                        e2 e2Var = ((d2) it3.next()).f184431a;
                        if (!s.g(e2Var, e2.g.f184451a) && !s.g(e2Var, e2.d.f184448a) && !s.g(e2Var, e2.b.f184446a)) {
                            o0Var3.C(-1469652379);
                            t4.d dVarA = n5.c.a(2131231971, o0Var3, 0);
                            r.a aVar3 = r.S;
                            d92.b.f58623a.getClass();
                            j92.b bVar4 = d92.b.f58625c;
                            bVar4.getClass();
                            j92.e eVar3 = j92.b.f97899b;
                            i7.a(dVarA, null, x2.q(aVar3, eVar3.f97920e), am.j.d(o0Var3), o0Var3, 48, 0);
                            o0Var2 = o0Var3;
                            bVar4.getClass();
                            c2.l.f(x2.u(aVar3, eVar3.f97917b), o0Var2);
                            o0Var2.g0(false);
                            break loop0;
                        }
                        o0Var3 = o0Var3;
                    }
                }
                m.a aVar4 = m.f135153a;
                if (z15) {
                    o0Var = o0Var2;
                    i15 = i17;
                    o0Var.C(-1468812248);
                    o0Var.g0(false);
                } else {
                    o0Var2.C(-1469177986);
                    String strQ = y.Q(o0Var2, R.string.lbl_session_details);
                    d92.b.f58623a.getClass();
                    d92.b.f58624b.getClass();
                    x0 x0VarA = x0.a(f.f97933j, hb.a.e(o0Var2), 0L, null, null, 0L, null, null, 0, 0L, null, null, 16777214);
                    r.a aVar5 = r.S;
                    boolean z19 = ((29360128 & i17) == 8388608) | ((i17 & 7168) == 2048);
                    Object objQ = o0Var2.q();
                    if (z19) {
                        objQ = new p3(1, j8, lVar3);
                        o0Var2.K(objQ);
                    } else {
                        aVar4.getClass();
                        if (objQ == m.a.f135155b) {
                            objQ = new p3(1, j8, lVar3);
                            o0Var2.K(objQ);
                        }
                    }
                    o0 o0Var4 = o0Var2;
                    i15 = i17;
                    mh.c(strQ, w.d(aVar5, z14, null, null, (e23.a) objQ, 14), 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, x0VarA, o0Var4, 0, 0, 131068);
                    o0Var = o0Var4;
                    o0Var.g0(false);
                }
                o0Var.g0(true);
                o0Var.g0(true);
                if (z15) {
                    lVar5 = lVar;
                    z17 = true;
                    o0Var.C(-1530230802);
                    o0Var.g0(false);
                } else {
                    o0Var.C(-1531397456);
                    r rVarY = x2.y(r.S, null, 3);
                    h4.d.f81522a.getClass();
                    z0 z0VarD = q.d(h4.d.a.f81524b, false);
                    x1 x1Var2 = n.f135158a;
                    int iHashCode4 = Long.hashCode(o0Var.U);
                    i2 i2VarA3 = o0Var.a0();
                    r rVarC4 = k.c(rVarY, o0Var);
                    h5.g.V.getClass();
                    e0.a aVar6 = h5.g.a.f81805b;
                    if (cVar == null) {
                        p0.l();
                        throw null;
                    }
                    o0Var.z();
                    if (o0Var.T) {
                        o0Var.M(aVar6);
                    } else {
                        o0Var.c();
                    }
                    b4.c(h5.g.a.f81810g, z0VarD, o0Var);
                    b4.c(h5.g.a.f81809f, i2VarA3, o0Var);
                    h5.g.a.b bVar5 = h5.g.a.f81813j;
                    if (o0Var.T || !s.g(o0Var.q(), Integer.valueOf(iHashCode4))) {
                        h.A(iHashCode4, o0Var, iHashCode4, bVar5);
                    }
                    b4.c(h5.g.a.f81807d, rVarC4, o0Var);
                    u uVar = u.f22885a;
                    long j14 = -5;
                    long j15 = (j14 << 32) | (j14 & 4294967295L);
                    g6.k.a aVar7 = g6.k.f76003b;
                    w1 w1Var = w1.BottomStart;
                    l72.x1 x1Var3 = l72.x1.EndSmall;
                    String strQ2 = y.Q(o0Var, R.string.msg_share_livetrack_link);
                    Integer numValueOf = Integer.valueOf(SyslogConstants.LOG_LOCAL4);
                    boolean z24 = ((i15 & 458752) == 131072) | ((i15 & 57344) == 16384);
                    Object objQ2 = o0Var.q();
                    if (z24) {
                        z18 = z16;
                        lVar5 = lVar;
                        objQ2 = new ad0.e(lVar5, z18, 22);
                        o0Var.K(objQ2);
                    } else {
                        aVar4.getClass();
                        if (objQ2 == m.a.f135155b) {
                            z18 = z16;
                            lVar5 = lVar;
                            objQ2 = new ad0.e(lVar5, z18, 22);
                            o0Var.K(objQ2);
                        } else {
                            z18 = z16;
                            lVar5 = lVar;
                        }
                    }
                    o0 o0Var5 = o0Var;
                    z17 = true;
                    a1.a(strQ2, w1Var, x1Var3, numValueOf, j15, z18, (e23.a) objQ2, z3.f.c(86111502, new h21.m(uVar, lVar2, z1Var, z14, 18), o0Var), o0Var5, (3670016 & (i15 << 6)) | 100887936, 2);
                    o0Var = o0Var5;
                    o0Var.g0(true);
                    o0Var.g0(false);
                }
                o0Var.g0(z17);
                x1 x1Var4 = n.f135158a;
            }
            p2VarI0.f135219d = pVar;
        }
        o0Var = o0VarE;
        lVar5 = lVar;
        o0Var.e();
        p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            final int i19 = 1;
            final l<? super Boolean, Unit> lVar7 = lVar5;
            pVar = new p() { // from class: xu0.c
                @Override // e23.p
                public final Object invoke(Object obj, Object obj2) {
                    switch (i19) {
                        case 0:
                            ((Integer) obj2).getClass();
                            e.b(z1Var, z14, z15, j8, z16, lVar7, lVar2, lVar3, (m) obj, p0.t(i14 | 1));
                            break;
                        default:
                            ((Integer) obj2).getClass();
                            e.b(z1Var, z14, z15, j8, z16, lVar7, lVar2, lVar3, (m) obj, p0.t(i14 | 1));
                            break;
                    }
                    return Unit.INSTANCE;
                }
            };
            p2VarI0.f135219d = pVar;
        }
    }

    public static final void c(int i14, String str, String str2, m mVar, boolean z14) {
        o0 o0Var;
        o0 o0VarE = mVar.E(1679974887);
        p3.c<?> cVar = o0VarE.f135177b;
        int i15 = i14 | (o0VarE.B(str) ? 4 : 2) | (o0VarE.B(str2) ? 32 : 16) | (o0VarE.h(z14) ? 256 : 128);
        if (o0VarE.n(i15 & 1, (i15 & 147) != 146)) {
            x1 x1Var = n.f135158a;
            r.a aVar = r.S;
            r rVarF = x2.f(aVar, 1.0f);
            d92.b.f58623a.getClass();
            j92.b bVar = d92.b.f58625c;
            bVar.getClass();
            j92.e eVar = j92.b.f97899b;
            r rVarA = c2.l.A(rVarF, eVar.f97920e, 0.0f, 2);
            bVar.getClass();
            r rVarC = c2.l.C(rVarA, 0.0f, eVar.f97920e, 0.0f, 0.0f, 13);
            h4.d.f81522a.getClass();
            g.b bVar2 = h4.d.a.f81534l;
            j jVar = j.f22691a;
            bVar.getClass();
            s2 s2VarF = hb.a.f(jVar, eVar.f97920e, bVar2, o0VarE, 48);
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            r rVarC2 = k.c(rVarC, o0VarE);
            h5.g.V.getClass();
            e0.a aVar2 = h5.g.a.f81805b;
            if (cVar == null) {
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
            b4.c(eVar2, s2VarF, o0VarE);
            h5.g.a.C1623g c1623g = h5.g.a.f81809f;
            b4.c(c1623g, i2VarA0, o0VarE);
            h5.g.a.b bVar3 = h5.g.a.f81813j;
            if (o0VarE.T || !s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                h.A(iHashCode, o0VarE, iHashCode, bVar3);
            }
            h5.g.a.f fVar = h5.g.a.f81807d;
            b4.c(fVar, rVarC2, o0VarE);
            u2 u2Var = u2.f22900a;
            String strQ = y.Q(o0VarE, R.string.default_image_view_content_description);
            g6.f.a aVar3 = g6.f.f75994b;
            jf.r.b(str, strQ, x2.q(aVar, 48), n5.c.a(2131231969, o0VarE, 0), n5.c.a(2131231969, o0VarE, 0), null, null, null, null, null, null, null, o0VarE, (i15 & 14) | 384, 0, 32736);
            r rVarF2 = x2.f(aVar, 1.0f);
            z zVarA = c2.y.a(j.f22698h, h4.d.a.f81536n, o0VarE, 6);
            int iHashCode2 = Long.hashCode(o0VarE.U);
            i2 i2VarA1 = o0VarE.a0();
            r rVarC3 = k.c(rVarF2, o0VarE);
            if (cVar == null) {
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
            b4.c(c1623g, i2VarA1, o0VarE);
            if (o0VarE.T || !s.g(o0VarE.q(), Integer.valueOf(iHashCode2))) {
                h.A(iHashCode2, o0VarE, iHashCode2, bVar3);
            }
            b4.c(fVar, rVarC3, o0VarE);
            b0 b0Var = b0.f22601a;
            f fVar2 = d92.b.f58624b;
            fVar2.getClass();
            mh.c(str2, null, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.b(f.f97931h, o0VarE), o0VarE, (i15 >> 3) & 14, 0, 131070);
            String strQ2 = y.Q(o0VarE, z14 ? R.string.txt_garmin_device_connected : R.string.devices_not_connected);
            fVar2.getClass();
            mh.c(strQ2, null, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.f(f.f97933j, o0VarE), o0VarE, 0, 0, 131070);
            o0Var = o0VarE;
            o0Var.g0(true);
            o0Var.g0(true);
        } else {
            o0Var = o0VarE;
            o0Var.e();
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new h50.d(str, str2, z14, i14, 3);
        }
    }

    /* JADX WARN: Code duplicated, block: B:122:0x02e2  */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void d(final ev0.b bVar, boolean z14, p pVar, final p pVar2, p pVar3, e23.a aVar, l lVar, l lVar2, l lVar3, l lVar4, l lVar5, m mVar, int i14) {
        final p pVar4;
        p pVar5;
        boolean z15;
        e23.a aVar2 = aVar;
        o0 o0VarE = mVar.E(51347383);
        p3.c<?> cVar = o0VarE.f135177b;
        int i15 = i14 | (o0VarE.r(bVar) ? 4 : 2) | (o0VarE.h(z14) ? 32 : 16) | (o0VarE.r(pVar) ? 256 : 128) | (o0VarE.r(pVar2) ? 2048 : 1024) | (o0VarE.r(pVar3) ? 16384 : 8192) | (o0VarE.r(aVar2) ? 131072 : 65536) | (o0VarE.r(lVar) ? ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288) | (o0VarE.r(lVar2) ? 8388608 : 4194304) | (o0VarE.r(lVar3) ? 67108864 : 33554432) | (o0VarE.r(lVar4) ? 536870912 : 268435456);
        int i16 = o0VarE.r(lVar5) ? 4 : 2;
        if (o0VarE.n(i15 & 1, ((i15 & 306783379) == 306783378 && (i16 & 3) == 2) ? false : true)) {
            x1 x1Var = n.f135158a;
            Object objQ = o0VarE.q();
            m.f135153a.getClass();
            m.a.C2565a c2565a = m.a.f135155b;
            if (objQ == c2565a) {
                objQ = Boolean.valueOf(s3.b());
                o0VarE.K(objQ);
            }
            boolean zBooleanValue = ((Boolean) objQ).booleanValue();
            r.a aVar3 = r.S;
            r rVarF = x2.f(aVar3, 1.0f);
            d92.b.f58623a.getClass();
            d92.b.f58625c.getClass();
            r rVarC = c2.l.C(rVarF, 0.0f, 0.0f, 0.0f, j92.b.f97899b.f97920e, 7);
            long jB = p6.b.b(o0VarE);
            m1.a aVar4 = m1.f128891a;
            r rVarE = u1.n.e(rVarC, jB, aVar4);
            h4.d.f81522a.getClass();
            z0 z0VarD = q.d(h4.d.a.f81524b, false);
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            r rVarC2 = k.c(rVarE, o0VarE);
            h5.g.V.getClass();
            e0.a aVar5 = h5.g.a.f81805b;
            if (cVar == null) {
                p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar5);
            } else {
                o0VarE.c();
            }
            h5.g.a.e eVar = h5.g.a.f81810g;
            b4.c(eVar, z0VarD, o0VarE);
            h5.g.a.C1623g c1623g = h5.g.a.f81809f;
            b4.c(c1623g, i2VarA0, o0VarE);
            h5.g.a.b bVar2 = h5.g.a.f81813j;
            if (o0VarE.T || !s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                h.A(iHashCode, o0VarE, iHashCode, bVar2);
            }
            h5.g.a.f fVar = h5.g.a.f81807d;
            b4.c(fVar, rVarC2, o0VarE);
            u uVar = u.f22885a;
            r rVarF2 = x2.f(aVar3, 1.0f);
            j.f22691a.getClass();
            z zVarA = c2.y.a(j.f22694d, h4.d.a.f81536n, o0VarE, 0);
            int iHashCode2 = Long.hashCode(o0VarE.U);
            i2 i2VarA1 = o0VarE.a0();
            r rVarC3 = k.c(rVarF2, o0VarE);
            if (cVar == null) {
                p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar5);
            } else {
                o0VarE.c();
            }
            b4.c(eVar, zVarA, o0VarE);
            b4.c(c1623g, i2VarA1, o0VarE);
            if (o0VarE.T || !s.g(o0VarE.q(), Integer.valueOf(iHashCode2))) {
                h.A(iHashCode2, o0VarE, iHashCode2, bVar2);
            }
            b4.c(fVar, rVarC3, o0VarE);
            b0 b0Var = b0.f22601a;
            z1 z1Var = bVar.f66150k;
            Boolean bool = bVar.f66146g;
            Boolean bool2 = bVar.f66145f;
            int i17 = i15 >> 9;
            b(z1Var, z14, zBooleanValue, bVar.f66140a, bVar.f66151l, lVar3, lVar4, lVar5, o0VarE, (i15 & 112) | 384 | (i17 & 458752) | (i17 & 3670016) | ((i16 << 21) & 29360128));
            c(0, bVar.f66141b, bVar.f66142c, o0VarE, bVar.f66143d);
            if (bVar.a() || bool2 == null) {
                o0VarE.C(-1847643729);
                o0VarE.g0(false);
            } else {
                o0VarE.C(-1847949327);
                String strQ = y.Q(o0VarE, R.string.lbl_show_course);
                boolean zBooleanValue2 = bool2.booleanValue();
                boolean zR = ((i15 & 7168) == 2048) | o0VarE.r(bVar);
                Object objQ2 = o0VarE.q();
                if (zR || objQ2 == c2565a) {
                    z15 = false;
                    final Object[] objArr = 0 == true ? 1 : 0;
                    objQ2 = new l() { // from class: xu0.b
                        @Override // e23.l
                        public final Object invoke(Object obj) {
                            int i18 = objArr;
                            Boolean bool3 = (Boolean) obj;
                            bool3.booleanValue();
                            switch (i18) {
                                case 0:
                                    pVar2.invoke(Long.valueOf(bVar.f66140a), bool3);
                                    break;
                                default:
                                    pVar2.invoke(Long.valueOf(bVar.f66140a), bool3);
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    };
                    o0VarE.K(objQ2);
                } else {
                    z15 = false;
                }
                f(strQ, zBooleanValue2, z14, (l) objQ2, o0VarE, (i15 << 3) & 896);
                o0VarE.g0(z15);
            }
            if (bVar.a()) {
                pVar5 = pVar3;
                aVar2 = aVar;
                o0VarE.C(-1846881873);
                o0VarE.g0(false);
            } else {
                Boolean bool3 = bVar.f66149j;
                Boolean bool4 = Boolean.TRUE;
                if (!s.g(bool3, bool4) || ((f12.b) KoinJavaComponent.get$default(f12.b.class, null, null, 6, null)).f()) {
                    pVar5 = pVar3;
                    aVar2 = aVar;
                    o0VarE.C(-1846881873);
                    o0VarE.g0(false);
                } else {
                    o0VarE.C(-1847478654);
                    String strQ2 = y.Q(o0VarE, R.string.live_track_spectator_messaging);
                    boolean z16 = s.g(bVar.f66147h, bool4) && s.g(bVar.f66148i, bool4);
                    boolean zR2 = ((i15 & 458752) == 131072) | ((57344 & i15) == 16384) | o0VarE.r(bVar);
                    Object objQ3 = o0VarE.q();
                    if (zR2 || objQ3 == c2565a) {
                        pVar5 = pVar3;
                        aVar2 = aVar;
                        objQ3 = new dt1.d(zBooleanValue, aVar2, pVar5, bVar);
                        o0VarE.K(objQ3);
                    } else {
                        pVar5 = pVar3;
                        aVar2 = aVar;
                    }
                    f(strQ2, z16, z14, (l) objQ3, o0VarE, (i15 << 3) & 896);
                    o0VarE.g0(false);
                }
            }
            if (bVar.a() || bool == null) {
                pVar4 = pVar;
                o0VarE.C(-1846484081);
                o0VarE.g0(false);
            } else {
                o0VarE.C(-1846797367);
                String strQ3 = y.Q(o0VarE, R.string.live_track_auto_start);
                boolean zBooleanValue3 = bool.booleanValue();
                boolean zR3 = ((i15 & 896) == 256) | o0VarE.r(bVar);
                Object objQ4 = o0VarE.q();
                if (zR3 || objQ4 == c2565a) {
                    pVar4 = pVar;
                    final int i18 = 1;
                    objQ4 = new l() { // from class: xu0.b
                        @Override // e23.l
                        public final Object invoke(Object obj) {
                            int i19 = i18;
                            Boolean bool5 = (Boolean) obj;
                            bool5.booleanValue();
                            switch (i19) {
                                case 0:
                                    pVar4.invoke(Long.valueOf(bVar.f66140a), bool5);
                                    break;
                                default:
                                    pVar4.invoke(Long.valueOf(bVar.f66140a), bool5);
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    };
                    o0VarE.K(objQ4);
                } else {
                    pVar4 = pVar;
                }
                f(strQ3, zBooleanValue3, z14, (l) objQ4, o0VarE, (i15 << 3) & 896);
                o0VarE.g0(false);
            }
            int i19 = i15 & 126;
            int i24 = i15 >> 12;
            a(bVar, z14, lVar, lVar2, o0VarE, i19 | (i24 & 896) | (i24 & 7168));
            o0VarE = o0VarE;
            o0VarE.g0(true);
            if (z14) {
                o0VarE.C(-918831195);
                o0VarE.g0(false);
            } else {
                o0VarE.C(-919025317);
                q.a(u1.n.e(uVar.d(aVar3), d0.c(0.5f, d92.b.a(o0VarE).c().e(), 14), aVar4), o0VarE, 0);
                o0VarE.g0(false);
            }
            o0VarE.g0(true);
        } else {
            pVar4 = pVar;
            pVar5 = pVar3;
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new et1.e(bVar, z14, pVar4, pVar2, pVar5, aVar2, lVar, lVar2, lVar3, lVar4, lVar5, i14, 6);
        }
    }

    /* JADX WARN: Code duplicated, block: B:106:0x00f2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:59:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:61:0x00f2 A[EDGE_INSN: B:61:0x00f2->B:70:0x010f BREAK  A[LOOP:1: B:63:0x00f8->B:109:0x00f8]] */
    /* JADX WARN: Code duplicated, block: B:62:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:65:0x00fe  */
    public static final void e(List list, boolean z14, p pVar, p pVar2, p pVar3, e23.a aVar, l lVar, l lVar2, l lVar3, l lVar4, l lVar5, m mVar, int i14) {
        Iterator it;
        ev0.b bVar;
        boolean z15;
        list.getClass();
        pVar.getClass();
        pVar2.getClass();
        pVar3.getClass();
        aVar.getClass();
        lVar.getClass();
        lVar2.getClass();
        lVar3.getClass();
        lVar4.getClass();
        lVar5.getClass();
        o0 o0VarE = mVar.E(-915725397);
        int i15 = i14 | (o0VarE.r(list) ? 4 : 2) | (o0VarE.h(z14) ? 32 : 16) | (o0VarE.r(pVar) ? 256 : 128) | (o0VarE.r(pVar2) ? 2048 : 1024) | (o0VarE.r(pVar3) ? 16384 : 8192) | (o0VarE.r(aVar) ? 131072 : 65536) | (o0VarE.r(lVar) ? ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288) | (o0VarE.r(lVar2) ? 8388608 : 4194304) | (o0VarE.r(lVar3) ? 67108864 : 33554432) | (o0VarE.r(lVar4) ? 536870912 : 268435456);
        if (o0VarE.n(i15 & 1, ((306783379 & i15) == 306783378 && ((o0VarE.r(lVar5) ? (char) 4 : (char) 2) & 3) == 2) ? false : true)) {
            x1 x1Var = n.f135158a;
            boolean zB = o0VarE.B(list);
            Object objQ = o0VarE.q();
            if (zB) {
                if (list.isEmpty()) {
                    it = list.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            z15 = false;
                            break;
                        } else {
                            bVar = (ev0.b) it.next();
                            if (!bVar.a()) {
                            }
                        }
                    }
                } else {
                    z15 = false;
                    break;
                }
                objQ = Boolean.valueOf(z15);
                o0VarE.K(objQ);
            } else {
                m.f135153a.getClass();
                if (objQ == m.a.f135155b) {
                    if (list.isEmpty()) {
                        it = list.iterator();
                        while (true) {
                            if (it.hasNext()) {
                                z15 = false;
                                break;
                            }
                            bVar = (ev0.b) it.next();
                            if (!bVar.a() && !bVar.f66144e) {
                                z15 = true;
                                break;
                            }
                        }
                    } else {
                        z15 = false;
                        break;
                    }
                    objQ = Boolean.valueOf(z15);
                    o0VarE.K(objQ);
                }
            }
            boolean zBooleanValue = ((Boolean) objQ).booleanValue();
            String upperCase = y.Q(o0VarE, R.string.device_settings_supported_devices_title).toUpperCase(Locale.ROOT);
            upperCase.getClass();
            d92.b.f58623a.getClass();
            d92.b.f58624b.getClass();
            x0 x0VarF = d92.c.f(f.f97934k, o0VarE);
            r.a aVar2 = r.S;
            j92.b bVar2 = d92.b.f58625c;
            bVar2.getClass();
            j92.e eVar = j92.b.f97899b;
            float f14 = eVar.f97920e;
            float f15 = eVar.f97920e;
            bVar2.getClass();
            float f16 = eVar.f97918c;
            bVar2.getClass();
            bVar2.getClass();
            mh.c(upperCase, c2.l.B(aVar2, f15, f14, f15, f16), 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, x0VarF, o0VarE, 0, 0, 131068);
            o0VarE = o0VarE;
            j.f22691a.getClass();
            j.k kVar = j.f22694d;
            h4.d.f81522a.getClass();
            z zVarA = c2.y.a(kVar, h4.d.a.f81536n, o0VarE, 0);
            x1 x1Var2 = n.f135158a;
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            r rVarC = k.c(aVar2, o0VarE);
            h5.g.V.getClass();
            e0.a aVar3 = h5.g.a.f81805b;
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
            h5.g.a.b bVar3 = h5.g.a.f81813j;
            if (o0VarE.T || !s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                h.A(iHashCode, o0VarE, iHashCode, bVar3);
            }
            b4.c(h5.g.a.f81807d, rVarC, o0VarE);
            b0 b0Var = b0.f22601a;
            o0VarE.C(1146644259);
            Iterator it3 = list.iterator();
            while (it3.hasNext()) {
                ev0.b bVar4 = (ev0.b) it3.next();
                d(bVar4, !z14 && (!zBooleanValue || bVar4.f66144e || bVar4.a()), pVar, pVar2, pVar3, aVar, lVar, lVar2, lVar3, lVar4, lVar5, o0VarE, i15 & 2147483520);
            }
            o0VarE.g0(false);
            o0VarE.g0(true);
            x1 x1Var3 = n.f135158a;
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new et1.e(list, z14, pVar, pVar2, pVar3, aVar, lVar, lVar2, lVar3, lVar4, lVar5, i14, 5);
        }
    }

    public static final void f(String str, boolean z14, boolean z15, l<? super Boolean, Unit> lVar, m mVar, int i14) {
        int i15;
        o0 o0VarE = mVar.E(-1334250828);
        if ((i14 & 6) == 0) {
            i15 = (o0VarE.B(str) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= o0VarE.h(z14) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            i15 |= o0VarE.h(z15) ? 256 : 128;
        }
        if ((i14 & 3072) == 0) {
            i15 |= o0VarE.r(lVar) ? 2048 : 1024;
        }
        if (o0VarE.n(i15 & 1, (i15 & 1171) != 1170)) {
            x1 x1Var = n.f135158a;
            r.a aVar = r.S;
            g6.f.a aVar2 = g6.f.f75994b;
            r rVarH = x2.h(x2.f(aVar, 1.0f), 56);
            d92.b.f58623a.getClass();
            d92.b.f58625c.getClass();
            r rVarA = c2.l.A(rVarH, j92.b.f97899b.f97920e, 0.0f, 2);
            h4.d.f81522a.getClass();
            g.b bVar = h4.d.a.f81534l;
            j.f22691a.getClass();
            s2 s2VarA = q2.a(j.f22692b, bVar, o0VarE, 48);
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            r rVarC = k.c(rVarA, o0VarE);
            h5.g.V.getClass();
            e0.a aVar3 = h5.g.a.f81805b;
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
            h5.g.a.b bVar2 = h5.g.a.f81813j;
            if (o0VarE.T || !s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                h.A(iHashCode, o0VarE, iHashCode, bVar2);
            }
            b4.c(h5.g.a.f81807d, rVarC, o0VarE);
            u2 u2Var = u2.f22900a;
            d92.b.f58624b.getClass();
            int i16 = i15;
            mh.c(str, u2Var.a(aVar, 1.0f, true), 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.b(f.f97931h, o0VarE), o0VarE, i15 & 14, 0, 131068);
            o0VarE = o0VarE;
            hf.a(z14, lVar, null, z15, d92.c.a(ff.f88115a, o0VarE), o0VarE, ((i16 >> 3) & 14) | ((i16 >> 6) & 112) | (57344 & (i16 << 6)), 76);
            o0VarE.g0(true);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new ct1.a(i14, 6, str, lVar, z14, z15);
        }
    }
}
