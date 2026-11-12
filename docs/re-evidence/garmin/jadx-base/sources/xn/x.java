package xn;

import android.content.Context;
import android.os.Bundle;
import c2.b0;
import c2.q2;
import c2.s2;
import c2.u2;
import c2.y;
import c2.z;
import com.garmin.android.apps.connectmobile.R;
import h5.e0;
import i3.mh;
import java.util.List;
import l72.u1;
import p005kotlin.Metadata;
import p13.h0;
import p3.b4;
import p3.i2;
import p3.o0;
import p3.p0;
import p3.p2;
import p3.x1;
import s5.x0;
import w52.j0;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lxn/x;", "Lh82/c;", "<init>", "()V", "a", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class x extends h82.c {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final List<Integer> f191633p;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f191635g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f191637i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f191638j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f191639k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f191640l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f191641m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f191642n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f191643o;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f191634f = -1;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public String f191636h = "";

    static {
        new a(null);
        f191633p = p13.x.k(Integer.valueOf(R.color.gds_data_viz_violet_primary), Integer.valueOf(R.color.gds_data_viz_blue_primary), Integer.valueOf(R.color.gds_data_viz_green_secondary), Integer.valueOf(R.color.gds_data_viz_orange_secondary), Integer.valueOf(R.color.gds_data_viz_red_primary));
    }

    public static String t(Context context, String str) {
        String string = context.getString(u(str));
        string.getClass();
        return string;
    }

    public static int u(String str) {
        if (str == null) {
            return R.string.lbl_help;
        }
        switch (str.hashCode()) {
            case -2058984604:
                return !str.equals("GROUND_CONTACT_TIME") ? R.string.lbl_help : R.string.lbl_ground_contact_time;
            case -1699514931:
                return !str.equals("GC_TIME_BALANCE") ? R.string.lbl_help : R.string.chart_ground_contact_time_balance_title;
            case -1377623582:
                return !str.equals("VERTICAL_RATIO") ? R.string.lbl_help : R.string.lbl_vertical_ratio;
            case -762316684:
                return !str.equals("STEP_SPEED_LOSS_PERCENT") ? R.string.lbl_help : R.string.lbl_step_speed_loss_percent;
            case 1259031409:
                return !str.equals("CADENCE") ? R.string.lbl_help : R.string.activity_details_running_cadence;
            case 1429212546:
                return !str.equals("VERTICAL_OSCILLATION") ? R.string.lbl_help : R.string.lbl_vertical_oscillation;
            case 1962266510:
                return !str.equals("STEP_SPEED_LOSS") ? R.string.lbl_help : R.string.lbl_step_speed_loss;
            case 2074580500:
                str.equals("DEFAULT_ACTION");
                return R.string.lbl_help;
            default:
                return R.string.lbl_help;
        }
    }

    @Override // h82.c
    public final void a(Bundle bundle, p3.m mVar, int i14) {
        int i15;
        o0 o0VarE = mVar.E(569916208);
        if ((i14 & 6) == 0) {
            i15 = (o0VarE.r(bundle) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= o0VarE.r(this) ? 32 : 16;
        }
        if (o0VarE.n(i15 & 1, (i15 & 19) != 18)) {
            x1 x1Var = p3.n.f135158a;
            super.a(bundle, o0VarE, i15 & 126);
            this.f191634f = bundle.getInt("extra_chart_type");
            this.f191635g = bundle.getBoolean("EXTRA_POD_DEVICE_DATA");
            String string = bundle.getString("extra_activity_type", "");
            string.getClass();
            this.f191636h = string;
            this.f191637i = bundle.getBoolean("EXTRA_RUN_CADENCE");
            this.f191638j = bundle.getBoolean("EXTRA_VERTICAL_OSCILLATION");
            this.f191639k = bundle.getBoolean("EXTRA_VERTICAL_RATIO");
            this.f191640l = bundle.getBoolean("EXTRA_GROUND_CONTACT_TIME");
            this.f191641m = bundle.getBoolean("EXTRA_GC_TIME_BALANCE");
            this.f191642n = bundle.getBoolean("EXTRA_STEP_SPEED_LOSS");
            this.f191643o = bundle.getBoolean("EXTRA_STEP_SPEED_LOSS_PERCENT");
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new vx1.a(this, bundle, i14, 20);
        }
    }

    @Override // h82.c
    public final List<h82.c.b> c(Context context) {
        context.getClass();
        return p13.x.k(new h82.c.b("DEFAULT_ACTION", t(context, "DEFAULT_ACTION"), null, new z3.e(1082982025, true, new v(this, 9)), 4, null), new h82.c.b("CADENCE", t(context, "CADENCE"), null, new z3.e(1844863336, true, new v(this, 10)), 4, null), new h82.c.b("VERTICAL_OSCILLATION", t(context, "VERTICAL_OSCILLATION"), null, new z3.e(-1688222649, true, new v(this, 11)), 4, null), new h82.c.b("VERTICAL_RATIO", t(context, "VERTICAL_RATIO"), null, new z3.e(-926341338, true, new v(this, 12)), 4, null), new h82.c.b("GROUND_CONTACT_TIME", t(context, "GROUND_CONTACT_TIME"), null, new z3.e(-164460027, true, new v(this, 13)), 4, null), new h82.c.b("GC_TIME_BALANCE", t(context, "GC_TIME_BALANCE"), null, new z3.e(597421284, true, new v(this, 14)), 4, null), new h82.c.b("STEP_SPEED_LOSS", t(context, "STEP_SPEED_LOSS"), null, new z3.e(1359302595, true, new v(this, 15)), 4, null), new h82.c.b("STEP_SPEED_LOSS_PERCENT", t(context, "STEP_SPEED_LOSS_PERCENT"), null, new z3.e(2121183906, true, new v(this, 0)), 4, null));
    }

    public final void g(p3.m mVar, int i14) {
        o0 o0VarE = mVar.E(-1043613454);
        int i15 = (o0VarE.r(this) ? 4 : 2) | i14;
        if (o0VarE.n(i15 & 1, (i15 & 3) != 2)) {
            x1 x1Var = p3.n.f135158a;
            h82.e.a(z3.f.c(973292799, new v(this, 3), o0VarE), o0VarE, 6);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new w(this, i14, 2);
        }
    }

    public final void h(p3.m mVar, int i14) {
        o0 o0VarE = mVar.E(-749371175);
        int i15 = (o0VarE.r(this) ? 4 : 2) | i14;
        int i16 = 5;
        if (o0VarE.n(i15 & 1, (i15 & 3) != 2)) {
            x1 x1Var = p3.n.f135158a;
            h82.e.a(z3.f.c(-424200212, new v(this, i16), o0VarE), o0VarE, 6);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new w(this, i14, 5);
        }
    }

    public final void i(p3.m mVar, int i14) {
        o0 o0VarE = mVar.E(-1061376600);
        int i15 = (o0VarE.r(this) ? 4 : 2) | i14;
        if (o0VarE.n(i15 & 1, (i15 & 3) != 2)) {
            x1 x1Var = p3.n.f135158a;
            h82.e.b(z3.f.c(-44375748, new v(this, 8), o0VarE), o0VarE, 6);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new w(this, i14, 9);
        }
    }

    public final void j(int i14, List<String> list, p3.m mVar, int i15) {
        int i16;
        o0 o0VarE = mVar.E(1434321701);
        if ((i15 & 6) == 0) {
            i16 = i15 | (o0VarE.k(i14) ? 4 : 2);
        } else {
            i16 = i15;
        }
        if ((i15 & 48) == 0) {
            i16 |= o0VarE.r(list) ? 32 : 16;
        }
        if (o0VarE.n(i16 & 1, (i16 & 19) != 18)) {
            x1 x1Var = p3.n.f135158a;
            h4.r.a aVar = h4.r.S;
            d92.b.f58623a.getClass();
            d92.b.f58625c.getClass();
            h4.r rVarC = c2.l.C(aVar, 0.0f, j92.b.f97899b.f97917b, 0.0f, 0.0f, 13);
            long jA = n5.a.a(o0VarE, i14);
            d92.b.f58624b.getClass();
            u1.e(rVarC, R.drawable.table_circle_shape, jA, 0.1f, list, d92.c.f(j92.f.f97932i, o0VarE), p13.x.k(Float.valueOf(0.4f), Float.valueOf(0.5f)), o0VarE, ((i16 << 9) & 57344) | 1575936, 0);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new ba2.f(this, i14, list, i15, 19);
        }
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0093  */
    public final void k(p3.m mVar, int i14) {
        o0 o0VarE = mVar.E(437607240);
        int i15 = (o0VarE.r(this) ? 4 : 2) | i14;
        if (o0VarE.n(i15 & 1, (i15 & 3) != 2)) {
            x1 x1Var = p3.n.f135158a;
            int i16 = this.f191634f;
            if (i16 == 16) {
                o0VarE.C(-366228383);
                r(o0VarE, i15 & 14);
                o0VarE.g0(false);
            } else if (i16 == 66) {
                o0VarE.C(-366233278);
                s(o0VarE, i15 & 14);
                o0VarE.g0(false);
            } else if (i16 == 83) {
                o0VarE.C(-366220703);
                l(o0VarE, i15 & 14);
                o0VarE.g0(false);
            } else if (i16 != 84) {
                switch (i16) {
                    case 11:
                        o0VarE.C(-366233278);
                        s(o0VarE, i15 & 14);
                        o0VarE.g0(false);
                        break;
                    case 12:
                        o0VarE.C(-366225979);
                        h(o0VarE, i15 & 14);
                        o0VarE.g0(false);
                        break;
                    case 13:
                        o0VarE.C(-366230809);
                        q(o0VarE, i15 & 14);
                        o0VarE.g0(false);
                        break;
                    case 14:
                        o0VarE.C(-366223192);
                        g(o0VarE, i15 & 14);
                        o0VarE.g0(false);
                        break;
                    default:
                        o0VarE.C(-366216488);
                        i(o0VarE, i15 & 14);
                        o0VarE.g0(false);
                        break;
                }
            } else {
                o0VarE.C(-366218168);
                m(o0VarE, i15 & 14);
                o0VarE.g0(false);
            }
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new w(this, i14, 8);
        }
    }

    public final void l(p3.m mVar, int i14) {
        o0 o0VarE = mVar.E(492221809);
        int i15 = (o0VarE.r(this) ? 4 : 2) | i14;
        int i16 = 6;
        if (o0VarE.n(i15 & 1, (i15 & 3) != 2)) {
            x1 x1Var = p3.n.f135158a;
            h82.e.a(z3.f.c(377286148, new v(this, i16), o0VarE), o0VarE, 6);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new w(this, i14, 6);
        }
    }

    public final void m(p3.m mVar, int i14) {
        o0 o0VarE = mVar.E(676411062);
        int i15 = (o0VarE.r(this) ? 4 : 2) | i14;
        int i16 = 1;
        if (o0VarE.n(i15 & 1, (i15 & 3) != 2)) {
            x1 x1Var = p3.n.f135158a;
            h82.e.a(z3.f.c(-1601649981, new v(this, i16), o0VarE), o0VarE, 6);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new w(this, i14, 0);
        }
    }

    /* JADX WARN: Code duplicated, block: B:21:0x00d9  */
    /* JADX WARN: Multi-variable type inference failed */
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
    public final void n(p3.m mVar, int i14) {
        o0 o0VarE = mVar.E(2062251933);
        int i15 = (o0VarE.r(this) ? 4 : 2) | i14;
        if (o0VarE.n(i15 & 1, (i15 & 3) != 2)) {
            x1 x1Var = p3.n.f135158a;
            for (o13.p pVar : p13.x.k(new o13.p(Boolean.valueOf(this.f191637i), "CADENCE"), new o13.p(Boolean.valueOf(this.f191638j), "VERTICAL_OSCILLATION"), new o13.p(Boolean.valueOf(this.f191639k), "VERTICAL_RATIO"), new o13.p(Boolean.valueOf(this.f191640l), "GROUND_CONTACT_TIME"), new o13.p(Boolean.valueOf(this.f191641m), "GC_TIME_BALANCE"), new o13.p(Boolean.valueOf(this.f191642n), "STEP_SPEED_LOSS"), new o13.p(Boolean.valueOf(this.f191643o), "STEP_SPEED_LOSS_PERCENT"))) {
                boolean zBooleanValue = ((Boolean) pVar.f128594a).booleanValue();
                String str = (String) pVar.f128595b;
                if (zBooleanValue) {
                    o0VarE.C(1467183414);
                    h82.r rVar = h82.r.f82497a;
                    int iU = u(str);
                    boolean zR = o0VarE.r(this) | o0VarE.B(str);
                    Object objQ = o0VarE.q();
                    if (zR) {
                        objQ = new wz1.c(29, this, str);
                        o0VarE.K(objQ);
                    } else {
                        p3.m.f135153a.getClass();
                        if (objQ == p3.m.a.f135155b) {
                            objQ = new wz1.c(29, this, str);
                            o0VarE.K(objQ);
                        }
                    }
                    rVar.B(iU, null, false, (e23.a) objQ, o0VarE, 24576, 6);
                    o0VarE.g0(false);
                } else {
                    o0VarE.C(1467283358);
                    o0VarE.g0(false);
                }
            }
            x1 x1Var2 = p3.n.f135158a;
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new w(this, i14, 4);
        }
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0048  */
    /* JADX WARN: Code duplicated, block: B:20:0x004b  */
    /* JADX WARN: Code duplicated, block: B:23:0x0056  */
    /* JADX WARN: Code duplicated, block: B:24:0x0058  */
    /* JADX WARN: Code duplicated, block: B:27:0x0061  */
    /* JADX WARN: Code duplicated, block: B:36:0x007b  */
    /* JADX WARN: Code duplicated, block: B:38:0x007f  */
    /* JADX WARN: Code duplicated, block: B:41:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:43:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:44:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:49:0x0108  */
    /* JADX WARN: Code duplicated, block: B:52:0x0157  */
    /* JADX WARN: Code duplicated, block: B:55:0x017c  */
    /* JADX WARN: Code duplicated, block: B:58:0x019c  */
    /* JADX WARN: Code duplicated, block: B:61:0x01bc  */
    /* JADX WARN: Code duplicated, block: B:65:0x01dd  */
    /* JADX WARN: Code duplicated, block: B:67:0x01f0  */
    /* JADX WARN: Code duplicated, block: B:69:0x01f5  */
    /* JADX WARN: Code duplicated, block: B:72:0x01ff  */
    /* JADX WARN: Code duplicated, block: B:74:? A[RETURN, SYNTHETIC] */
    public final void o(List<String> list, List<String> list2, List<Integer> list3, p3.m mVar, int i14, int i15) {
        List<Integer> list4;
        int i16;
        int i17;
        boolean z14;
        List<Integer> list5;
        p2 p2VarI0;
        int i18;
        List<Integer> list6;
        z zVarA;
        int iHashCode;
        i2 i2VarA0;
        h4.r rVarC;
        e0.a aVar;
        h5.g.a.b bVar;
        String str;
        String str2;
        String str3;
        String str4;
        list.getClass();
        list2.getClass();
        o0 o0VarE = mVar.E(-414247690);
        int i19 = i14 | (o0VarE.r(list) ? 4 : 2) | (o0VarE.r(list2) ? 32 : 16);
        if ((i15 & 4) == 0) {
            list4 = list3;
            int i24 = o0VarE.r(list4) ? 256 : 128;
            int i25 = i19 | i24;
            if (o0VarE.r(this)) {
                i16 = 2048;
            } else {
                i16 = 1024;
            }
            i17 = i25 | i16;
            if ((i17 & 1171) != 1170) {
                z14 = true;
            } else {
                z14 = false;
            }
            if (o0VarE.n(i17 & 1, z14)) {
                o0VarE.G0();
                if ((i14 & 1) == 0 && !o0VarE.o0()) {
                    o0VarE.e();
                    if ((i15 & 4) != 0) {
                        i17 &= -897;
                    }
                } else if ((i15 & 4) != 0) {
                    i17 &= -897;
                    list4 = f191633p;
                }
                i18 = i17;
                list6 = list4;
                o0VarE.h0();
                x1 x1Var = p3.n.f135158a;
                h4.r.a aVar2 = h4.r.S;
                d92.b.f58623a.getClass();
                j92.b bVar2 = d92.b.f58625c;
                bVar2.getClass();
                j92.e eVar = j92.b.f97899b;
                float f14 = eVar.f97921f;
                bVar2.getClass();
                float f15 = eVar.f97921f;
                bVar2.getClass();
                h4.r rVarC2 = c2.l.C(aVar2, f14, eVar.f97920e, f15, 0.0f, 8);
                c2.j.f22691a.getClass();
                c2.j.k kVar = c2.j.f22694d;
                h4.d.f81522a.getClass();
                zVarA = y.a(kVar, h4.d.a.f81536n, o0VarE, 0);
                iHashCode = Long.hashCode(o0VarE.U);
                i2VarA0 = o0VarE.a0();
                rVarC = h4.k.c(rVarC2, o0VarE);
                h5.g.V.getClass();
                aVar = h5.g.a.f81805b;
                if (o0VarE.f135177b != null) {
                    p0.l();
                    throw null;
                }
                o0VarE.z();
                if (o0VarE.T) {
                    o0VarE.M(aVar);
                } else {
                    o0VarE.c();
                }
                b4.c(h5.g.a.f81810g, zVarA, o0VarE);
                b4.c(h5.g.a.f81809f, i2VarA0, o0VarE);
                bVar = h5.g.a.f81813j;
                if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                    v.h.A(iHashCode, o0VarE, iHashCode, bVar);
                }
                b4.c(h5.g.a.f81807d, rVarC, o0VarE);
                b0 b0Var = b0.f22601a;
                p(null, h0.C0(p13.w.c(""), list), null, p13.x.k(Float.valueOf(0.1f), Float.valueOf(0.4f), Float.valueOf(0.5f)), o0VarE, ((i18 << 3) & 57344) | 3072);
                int iIntValue = list6.get(0).intValue();
                str = (String) h0.e0(0, list2);
                if (str == null) {
                    str = "";
                }
                int i26 = (i18 >> 3) & 896;
                j(iIntValue, p13.x.k("> 95%", str), o0VarE, i26);
                int iIntValue2 = list6.get(1).intValue();
                str2 = (String) h0.e0(1, list2);
                if (str2 == null) {
                    str2 = "";
                }
                j(iIntValue2, p13.x.k("70 - 95%", str2), o0VarE, i26);
                int iIntValue3 = list6.get(2).intValue();
                str3 = (String) h0.e0(2, list2);
                if (str3 == null) {
                    str3 = "";
                }
                j(iIntValue3, p13.x.k("30 - 69%", str3), o0VarE, i26);
                int iIntValue4 = list6.get(3).intValue();
                str4 = (String) h0.e0(3, list2);
                if (str4 == null) {
                    str4 = "";
                }
                j(iIntValue4, p13.x.k("5 - 29%", str4), o0VarE, i26);
                int iIntValue5 = list6.get(4).intValue();
                String str5 = (String) h0.e0(4, list2);
                j(iIntValue5, p13.x.k("< 5%", str5 != null ? str5 : ""), o0VarE, i26);
                o0VarE.g0(true);
                list5 = list6;
            } else {
                o0VarE.e();
                list5 = list4;
            }
            p2VarI0 = o0VarE.i0();
            if (p2VarI0 != null) {
                p2VarI0.f135219d = new ug0.c(this, (List) list, (List) list2, (List) list5, i14, i15);
            }
        }
        list4 = list3;
        int i27 = i19 | i24;
        if (o0VarE.r(this)) {
            i16 = 2048;
        } else {
            i16 = 1024;
        }
        i17 = i27 | i16;
        if ((i17 & 1171) != 1170) {
            z14 = true;
        } else {
            z14 = false;
        }
        if (o0VarE.n(i17 & 1, z14)) {
            o0VarE.G0();
            if ((i14 & 1) == 0) {
                if ((i15 & 4) != 0) {
                    i17 &= -897;
                    list4 = f191633p;
                }
            } else if ((i15 & 4) != 0) {
                i17 &= -897;
                list4 = f191633p;
            }
            i18 = i17;
            list6 = list4;
            o0VarE.h0();
            x1 x1Var2 = p3.n.f135158a;
            h4.r.a aVar3 = h4.r.S;
            d92.b.f58623a.getClass();
            j92.b bVar3 = d92.b.f58625c;
            bVar3.getClass();
            j92.e eVar2 = j92.b.f97899b;
            float f16 = eVar2.f97921f;
            bVar3.getClass();
            float f17 = eVar2.f97921f;
            bVar3.getClass();
            h4.r rVarC3 = c2.l.C(aVar3, f16, eVar2.f97920e, f17, 0.0f, 8);
            c2.j.f22691a.getClass();
            c2.j.k kVar2 = c2.j.f22694d;
            h4.d.f81522a.getClass();
            zVarA = y.a(kVar2, h4.d.a.f81536n, o0VarE, 0);
            iHashCode = Long.hashCode(o0VarE.U);
            i2VarA0 = o0VarE.a0();
            rVarC = h4.k.c(rVarC3, o0VarE);
            h5.g.V.getClass();
            aVar = h5.g.a.f81805b;
            if (o0VarE.f135177b != null) {
                p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar);
            } else {
                o0VarE.c();
            }
            b4.c(h5.g.a.f81810g, zVarA, o0VarE);
            b4.c(h5.g.a.f81809f, i2VarA0, o0VarE);
            bVar = h5.g.a.f81813j;
            if (o0VarE.T) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar);
            } else {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar);
            }
            b4.c(h5.g.a.f81807d, rVarC, o0VarE);
            b0 b0Var2 = b0.f22601a;
            p(null, h0.C0(p13.w.c(""), list), null, p13.x.k(Float.valueOf(0.1f), Float.valueOf(0.4f), Float.valueOf(0.5f)), o0VarE, ((i18 << 3) & 57344) | 3072);
            int iIntValue6 = list6.get(0).intValue();
            str = (String) h0.e0(0, list2);
            if (str == null) {
                str = "";
            }
            int i28 = (i18 >> 3) & 896;
            j(iIntValue6, p13.x.k("> 95%", str), o0VarE, i28);
            int iIntValue7 = list6.get(1).intValue();
            str2 = (String) h0.e0(1, list2);
            if (str2 == null) {
                str2 = "";
            }
            j(iIntValue7, p13.x.k("70 - 95%", str2), o0VarE, i28);
            int iIntValue8 = list6.get(2).intValue();
            str3 = (String) h0.e0(2, list2);
            if (str3 == null) {
                str3 = "";
            }
            j(iIntValue8, p13.x.k("30 - 69%", str3), o0VarE, i28);
            int iIntValue9 = list6.get(3).intValue();
            str4 = (String) h0.e0(3, list2);
            if (str4 == null) {
                str4 = "";
            }
            j(iIntValue9, p13.x.k("5 - 29%", str4), o0VarE, i28);
            int iIntValue10 = list6.get(4).intValue();
            String str6 = (String) h0.e0(4, list2);
            j(iIntValue10, p13.x.k("< 5%", str6 != null ? str6 : ""), o0VarE, i28);
            o0VarE.g0(true);
            list5 = list6;
        } else {
            o0VarE.e();
            list5 = list4;
        }
        p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new ug0.c(this, (List) list, (List) list2, (List) list5, i14, i15);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void p(h4.r rVar, List list, x0 x0Var, List list2, p3.m mVar, int i14) {
        List list3;
        h4.r rVar2;
        x0 x0Var2;
        o0 o0Var;
        x0 x0VarB;
        o0 o0VarE = mVar.E(-1486929412);
        p3.c<?> cVar = o0VarE.f135177b;
        int i15 = i14 | 6;
        if ((i14 & 48) == 0) {
            list3 = list;
            i15 |= o0VarE.r(list3) ? 32 : 16;
        } else {
            list3 = list;
        }
        if ((i14 & 384) == 0) {
            i15 |= 128;
        }
        if ((i14 & 3072) == 0) {
            i15 |= o0VarE.r(list2) ? 2048 : 1024;
        }
        int i16 = 0;
        boolean z14 = true;
        if (o0VarE.n(i15 & 1, (i15 & 1171) != 1170)) {
            o0VarE.G0();
            if ((i14 & 1) == 0 || o0VarE.o0()) {
                rVar2 = h4.r.S;
                d92.b.f58623a.getClass();
                d92.b.f58624b.getClass();
                x0VarB = d92.c.b(j92.f.f97932i, o0VarE);
            } else {
                o0VarE.e();
                rVar2 = rVar;
                x0VarB = x0Var;
            }
            o0VarE.h0();
            x1 x1Var = p3.n.f135158a;
            h4.d.f81522a.getClass();
            h4.g.b bVar = h4.d.a.f81534l;
            c2.j.f22691a.getClass();
            s2 s2VarA = q2.a(c2.j.f22692b, bVar, o0VarE, 48);
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            h4.r rVarC = h4.k.c(rVar2, o0VarE);
            h5.g.V.getClass();
            e0.a aVar = h5.g.a.f81805b;
            if (cVar == null) {
                p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar);
            } else {
                o0VarE.c();
            }
            b4.c(h5.g.a.f81810g, s2VarA, o0VarE);
            b4.c(h5.g.a.f81809f, i2VarA0, o0VarE);
            h5.g.a.b bVar2 = h5.g.a.f81813j;
            if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar2);
            }
            b4.c(h5.g.a.f81807d, rVarC, o0VarE);
            u2 u2Var = u2.f22900a;
            o0VarE.C(392906562);
            int i17 = 0;
            for (Object obj : list3) {
                int i18 = i17 + 1;
                if (i17 < 0) {
                    p13.x.q();
                    throw null;
                }
                String str = (String) obj;
                h4.r rVarA = u2Var.a(h4.r.S, ((Number) list2.get(i17)).floatValue(), z14);
                c2.j.f22691a.getClass();
                c2.j.k kVar = c2.j.f22694d;
                h4.d.f81522a.getClass();
                z zVarA = y.a(kVar, h4.d.a.f81536n, o0VarE, i16);
                x1 x1Var2 = p3.n.f135158a;
                int iHashCode2 = Long.hashCode(o0VarE.U);
                i2 i2VarA1 = o0VarE.a0();
                h4.r rVarC2 = h4.k.c(rVarA, o0VarE);
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
                b4.c(h5.g.a.f81810g, zVarA, o0VarE);
                b4.c(h5.g.a.f81809f, i2VarA1, o0VarE);
                h5.g.a.b bVar3 = h5.g.a.f81813j;
                if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode2))) {
                    v.h.A(iHashCode2, o0VarE, iHashCode2, bVar3);
                }
                b4.c(h5.g.a.f81807d, rVarC2, o0VarE);
                b0 b0Var = b0.f22601a;
                boolean z15 = z14;
                o0 o0Var2 = o0VarE;
                mh.c(str, null, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, x0VarB, o0Var2, 0, 0, 131070);
                o0Var2.g0(z15);
                z14 = z15;
                o0VarE = o0Var2;
                i17 = i18;
                i16 = 0;
            }
            o0 o0Var3 = o0VarE;
            o0Var3.g0(i16);
            o0Var3.g0(z14);
            x1 x1Var3 = p3.n.f135158a;
            x0Var2 = x0VarB;
            o0Var = o0Var3;
        } else {
            o0 o0Var4 = o0VarE;
            o0Var4.e();
            rVar2 = rVar;
            x0Var2 = x0Var;
            o0Var = o0Var4;
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new j0(this, rVar2, list3, x0Var2, list2, i14, 5);
        }
    }

    public final void q(p3.m mVar, int i14) {
        o0 o0VarE = mVar.E(-462252440);
        int i15 = 4;
        int i16 = (o0VarE.r(this) ? 4 : 2) | i14;
        if (o0VarE.n(i16 & 1, (i16 & 3) != 2)) {
            x1 x1Var = p3.n.f135158a;
            h82.e.a(z3.f.c(-1505569605, new v(this, i15), o0VarE), o0VarE, 6);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new w(this, i14, 3);
        }
    }

    public final void r(p3.m mVar, int i14) {
        o0 o0VarE = mVar.E(-908259704);
        int i15 = (o0VarE.r(this) ? 4 : 2) | i14;
        int i16 = 7;
        if (o0VarE.n(i15 & 1, (i15 & 3) != 2)) {
            x1 x1Var = p3.n.f135158a;
            h82.e.a(z3.f.c(-1023195365, new v(this, i16), o0VarE), o0VarE, 6);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new w(this, i14, 7);
        }
    }

    public final void s(p3.m mVar, int i14) {
        o0 o0VarE = mVar.E(-19379979);
        int i15 = 2;
        int i16 = (o0VarE.r(this) ? 4 : 2) | i14;
        if (o0VarE.n(i16 & 1, (i16 & 3) != 2)) {
            x1 x1Var = p3.n.f135158a;
            h82.e.a(z3.f.c(712581826, new v(this, i15), o0VarE), o0VarE, 6);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new w(this, i14, 1);
        }
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010 \n\u0002\u0010\b\n\u0002\b\u0010\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0006R\u0014\u0010\f\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\u0006R\u0014\u0010\r\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\u0006R\u0014\u0010\u000e\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000e\u0010\u0006R\u0014\u0010\u000f\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000f\u0010\u0006R\u0014\u0010\u0010\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0010\u0010\u0006R\u0014\u0010\u0011\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0011\u0010\u0006R\u001a\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0016\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0016\u0010\u0006R\u0014\u0010\u0017\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0017\u0010\u0006R\u0014\u0010\u0018\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0018\u0010\u0006R\u0014\u0010\u0019\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0019\u0010\u0006R\u0014\u0010\u001a\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001a\u0010\u0006R\u0014\u0010\u001b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001b\u0010\u0006R\u0014\u0010\u001c\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001c\u0010\u0006R\u0014\u0010\u001d\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001d\u0010\u0006R\u0014\u0010\u001e\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001e\u0010\u0006R\u0014\u0010\u001f\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001f\u0010\u0006R\u0014\u0010 \u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b \u0010\u0006R\u0014\u0010!\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b!\u0010\u0006R\u0014\u0010\"\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\"\u0010\u0006¨\u0006#"}, d2 = {"Lxn/x$a;", "", "<init>", "()V", "", "CADENCE", "Ljava/lang/String;", "VERTICAL_OSCILLATION", "VERTICAL_RATIO", "GROUND_CONTACT_TIME", "GC_TIME_BALANCE", "STEP_SPEED_LOSS", "STEP_SPEED_LOSS_PERCENT", "RANGE_1", "RANGE_2", "RANGE_3", "RANGE_4", "RANGE_5", "", "", "ZONE_COLORS", "Ljava/util/List;", "RANGE_WITH_UOM", "UPPER_RANGE_WITH_UOM", "LOWER_RANGE_WITH_UOM", "EXTRA_CHART_TYPE", "EXTRA_POD_DEVICE_DATA", "EXTRA_ACTIVITY_TYPE", "EXTRA_RUN_CADENCE", "EXTRA_VERTICAL_OSCILLATION", "EXTRA_VERTICAL_RATIO", "EXTRA_GROUND_CONTACT_TIME", "EXTRA_GC_TIME_BALANCE", "EXTRA_STEP_SPEED_LOSS", "EXTRA_STEP_SPEED_LOSS_PERCENT", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
