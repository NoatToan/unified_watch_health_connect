package w52;

import android.content.Context;
import android.graphics.Typeface;
import android.util.Patterns;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.settings.usersettings.stride.StrideLengthSettingsActivity;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.data.LineDataSet;
import com.google.common.base.Ascii;
import i3.e5;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.l2;
import org.joda.time.DateTime;
import org.joda.time.LocalDate;
import org.joda.time.format.DateTimeFormat;
import p005kotlin.Unit;
import p3.m;
import p3.p0;
import p3.p2;
import w52.u0;

/* JADX INFO: loaded from: classes9.dex */
public final class u0 {
    public static final void a(p3.m mVar, int i14) {
        p3.o0 o0VarE = mVar.E(1196386372);
        if (o0VarE.n(i14 & 1, i14 != 0)) {
            p3.x1 x1Var = p3.n.f135158a;
            xn.b.f191588a.getClass();
            h82.e.a(xn.b.f191589b, o0VarE, 6);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new xg0.v(i14, 10);
        }
    }

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
    public static final void b(String str, e23.a aVar, e23.a aVar2, p3.m mVar, int i14) {
        e23.a aVar3;
        p3.o0 o0Var;
        str.getClass();
        aVar.getClass();
        aVar2.getClass();
        p3.o0 o0VarE = mVar.E(-1525615737);
        int i15 = (o0VarE.B(str) ? 4 : 2) | i14 | (o0VarE.r(aVar) ? 32 : 16);
        if ((i14 & 384) == 0) {
            aVar3 = aVar2;
            i15 |= o0VarE.r(aVar3) ? 256 : 128;
        } else {
            aVar3 = aVar2;
        }
        if (o0VarE.n(i15 & 1, (i15 & 147) != 146)) {
            p3.x1 x1Var = p3.n.f135158a;
            o0Var = o0VarE;
            l72.c1.f110940a.a(false, g22.n.b(gl1.y.Q(o0VarE, R.string.instant_input_dialog_title_device_disconnected)), gl1.y.P(R.string.msg_reconnect_device, new Object[]{str}, o0VarE), null, null, gl1.y.Q(o0VarE, R.string.common_learn_more), false, false, aVar, gl1.y.Q(o0VarE, R.string.lbl_close), aVar3, o0Var, ((i15 << 21) & 234881024) | 6, (i15 >> 6) & 14, 216);
        } else {
            o0Var = o0VarE;
            o0Var.e();
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new pa0.f(str, aVar, aVar2, i14, 1);
        }
    }

    public static final void c(xc.e eVar, boolean z14, e23.a aVar, e23.a aVar2, p3.m mVar, int i14) {
        e23.a aVar3;
        p3.o0 o0VarE = mVar.E(1220469155);
        int i15 = (o0VarE.B(eVar) ? 4 : 2) | i14 | (o0VarE.h(z14) ? 32 : 16) | 384 | (o0VarE.r(aVar2) ? 2048 : 1024);
        if (o0VarE.n(i15 & 1, (i15 & 1171) != 1170)) {
            Object objQ = o0VarE.q();
            p3.m.a aVar4 = p3.m.f135153a;
            aVar4.getClass();
            p3.m.a.C2565a c2565a = p3.m.a.f135155b;
            if (objQ == c2565a) {
                objQ = new xa1.j(6);
                o0VarE.K(objQ);
            }
            e23.a aVar5 = (e23.a) objQ;
            p3.x1 x1Var = p3.n.f135158a;
            Object objQ2 = o0VarE.q();
            aVar4.getClass();
            if (objQ2 == c2565a) {
                objQ2 = new xa1.j(7);
                o0VarE.K(objQ2);
            }
            e23.a aVar6 = (e23.a) objQ2;
            Object objQ3 = o0VarE.q();
            if (objQ3 == c2565a) {
                objQ3 = new xa1.j(8);
                o0VarE.K(objQ3);
            }
            int i16 = (i15 & 14) | 3504;
            int i17 = i15 << 9;
            d(eVar, false, aVar6, (e23.a) objQ3, z14, aVar5, aVar2, o0VarE, i16 | (57344 & i17) | 196608 | (i17 & 3670016));
            aVar3 = aVar5;
        } else {
            o0VarE.e();
            aVar3 = aVar;
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new x72.m(eVar, z14, aVar3, aVar2, i14, 1);
        }
    }

    /* JADX WARN: Code duplicated, block: B:55:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:76:0x010b  */
    /* JADX WARN: Code duplicated, block: B:84:0x0143  */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void d(xc.e eVar, final boolean z14, final e23.a aVar, final e23.a aVar2, final boolean z15, final e23.a aVar3, final e23.a aVar4, p3.m mVar, final int i14) {
        int i15;
        e23.a aVar5;
        final e23.a aVar6;
        final xc.e eVar2 = eVar;
        p3.o0 o0VarE = mVar.E(898330592);
        int i16 = 2;
        if ((i14 & 6) == 0) {
            i15 = (o0VarE.B(eVar2) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 24576) == 0) {
            i15 |= o0VarE.h(z15) ? 16384 : 8192;
        }
        if ((196608 & i14) == 0) {
            aVar5 = aVar3;
            i15 |= o0VarE.r(aVar5) ? 131072 : 65536;
        } else {
            aVar5 = aVar3;
        }
        if ((1572864 & i14) == 0) {
            aVar6 = aVar4;
            i15 |= o0VarE.r(aVar6) ? 1048576 : 524288;
        } else {
            aVar6 = aVar4;
        }
        if (o0VarE.n(i15 & 1, (599187 & i15) != 599186)) {
            p3.x1 x1Var = p3.n.f135158a;
            if (((Boolean) o0VarE.A(l2.f91259a)).booleanValue()) {
                p2 p2VarI0 = o0VarE.i0();
                if (p2VarI0 != null) {
                    final int i17 = 0;
                    final e23.a aVar7 = aVar5;
                    p2VarI0.f135219d = new e23.p() { // from class: xc.c
                        @Override // e23.p
                        public final Object invoke(Object obj, Object obj2) {
                            switch (i17) {
                                case 0:
                                    ((Integer) obj2).getClass();
                                    u0.d(eVar2, z14, aVar, aVar2, z15, aVar7, aVar6, (m) obj, p0.t(i14 | 1));
                                    break;
                                default:
                                    ((Integer) obj2).getClass();
                                    u0.d(eVar2, z14, aVar, aVar2, z15, aVar7, aVar6, (m) obj, p0.t(i14 | 1));
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    };
                    return;
                }
                return;
            }
            xc.b.f189878a.getClass();
            wc.d dVarA = xc.b.a(o0VarE);
            if (dVarA == null) {
                vb.h.z("No NavigationEventDispatcher was provided via LocalNavigationEventDispatcherOwner");
                return;
            }
            wc.c navigationEventDispatcher = dVarA.getNavigationEventDispatcher();
            int i18 = i15 & 14;
            boolean z16 = i18 == 4;
            Object objQ = o0VarE.q();
            p3.m.a aVar8 = p3.m.f135153a;
            if (z16) {
                objQ = new xc.a((wc.g) eVar2.f189893c.getF182175a(), new xa2.g(eVar2, i16));
                o0VarE.K(objQ);
            } else {
                aVar8.getClass();
                if (objQ == p3.m.a.f135155b) {
                    objQ = new xc.a((wc.g) eVar2.f189893c.getF182175a(), new xa2.g(eVar2, i16));
                    o0VarE.K(objQ);
                }
            }
            xc.a aVar9 = (xc.a) objQ;
            boolean zR = ((i15 & 3670016) == 1048576) | o0VarE.r(aVar9) | ((57344 & i15) == 16384) | ((458752 & i15) == 131072) | (i18 == 4);
            Object objQ2 = o0VarE.q();
            if (zR) {
                pk0.b bVar = new pk0.b(aVar9, z14, aVar, aVar2, z15, aVar3, aVar4, eVar2);
                aVar9 = aVar9;
                eVar2 = eVar2;
                o0VarE.K(bVar);
                objQ2 = bVar;
            } else {
                aVar8.getClass();
                if (objQ2 == p3.m.a.f135155b) {
                    pk0.b bVar2 = new pk0.b(aVar9, z14, aVar, aVar2, z15, aVar3, aVar4, eVar2);
                    aVar9 = aVar9;
                    eVar2 = eVar2;
                    o0VarE.K(bVar2);
                    objQ2 = bVar2;
                }
            }
            p3.l0.i((e23.a) objQ2, o0VarE);
            boolean zR2 = o0VarE.r(aVar9) | (i18 == 4) | o0VarE.r(navigationEventDispatcher);
            Object objQ3 = o0VarE.q();
            if (zR2) {
                objQ3 = new wn2.f(eVar2, 8, aVar9, navigationEventDispatcher);
                o0VarE.K(objQ3);
            } else {
                aVar8.getClass();
                if (objQ3 == p3.m.a.f135155b) {
                    objQ3 = new wn2.f(eVar2, 8, aVar9, navigationEventDispatcher);
                    o0VarE.K(objQ3);
                }
            }
            p3.l0.a(eVar2, (e23.l) objQ3, o0VarE);
        } else {
            o0VarE.e();
        }
        p2 p2VarI1 = o0VarE.i0();
        if (p2VarI1 != null) {
            final int i19 = 1;
            p2VarI1.f135219d = new e23.p() { // from class: xc.c
                @Override // e23.p
                public final Object invoke(Object obj, Object obj2) {
                    switch (i19) {
                        case 0:
                            ((Integer) obj2).getClass();
                            u0.d(eVar2, z14, aVar, aVar2, z15, aVar3, aVar4, (m) obj, p0.t(i14 | 1));
                            break;
                        default:
                            ((Integer) obj2).getClass();
                            u0.d(eVar2, z14, aVar, aVar2, z15, aVar3, aVar4, (m) obj, p0.t(i14 | 1));
                            break;
                    }
                    return Unit.INSTANCE;
                }
            };
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void e(StrideLengthSettingsActivity strideLengthSettingsActivity, int i14, e23.l lVar, p3.m mVar, int i15) {
        p3.p1 p1Var;
        lVar.getClass();
        p3.o0 o0VarE = mVar.E(-474633463);
        int i16 = i15 | (o0VarE.r(strideLengthSettingsActivity) ? 4 : 2) | (o0VarE.k(i14) ? 32 : 16) | (o0VarE.r(lVar) ? 256 : 128);
        int i17 = 1;
        if (o0VarE.n(i16 & 1, (i16 & 147) != 146)) {
            p3.x1 x1Var = p3.n.f135158a;
            Object objQ = o0VarE.q();
            p3.m.f135153a.getClass();
            p3.m.a.C2565a c2565a = p3.m.a.f135155b;
            if (objQ == c2565a) {
                objQ = p3.p0.n(Boolean.FALSE);
                o0VarE.K(objQ);
            }
            p3.p1 p1Var2 = (p3.p1) objQ;
            yk1.b bVar = new yk1.b((Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b));
            l72.p2 p2Var = l72.p2.f111205a;
            String strQ = gl1.y.Q(o0VarE, R.string.lbl_units);
            String string = bVar.f197596a.getString(i14 == 0 ? R.string.common_feet_string : R.string.common_meters_string);
            string.getClass();
            z3.e eVarJ = j(strideLengthSettingsActivity, string, o0VarE);
            Object objQ2 = o0VarE.q();
            if (objQ2 == c2565a) {
                objQ2 = new zk1.d(p1Var2, i17);
                o0VarE.K(objQ2);
            }
            boolean z14 = true;
            p2Var.g(strQ, null, null, null, eVarJ, false, false, (e23.a) objQ2, o0VarE, 100663296, 238);
            Object objQ3 = o0VarE.q();
            if (objQ3 == c2565a) {
                objQ3 = e5.o(i14, o0VarE);
            }
            p3.n1 n1Var = (p3.n1) objQ3;
            if (((Boolean) p1Var2.getF182175a()).booleanValue()) {
                o0VarE.C(-772601318);
                l72.c1 c1Var = l72.c1.f110940a;
                String strQ2 = gl1.y.Q(o0VarE, R.string.lbl_units);
                int i18 = 2;
                z3.e eVarC = z3.f.c(1886267144, new cw1.f1(i14, n1Var, i18), o0VarE);
                String strQ3 = gl1.y.Q(o0VarE, R.string.lbl_done);
                Locale locale = Locale.ROOT;
                String upperCase = strQ3.toUpperCase(locale);
                upperCase.getClass();
                if ((i16 & 896) != 256) {
                    z14 = false;
                }
                Object objQ4 = o0VarE.q();
                if (z14 || objQ4 == c2565a) {
                    p1Var = p1Var2;
                    objQ4 = new x72.k(lVar, 14, p1Var, n1Var);
                    o0VarE.K(objQ4);
                } else {
                    p1Var = p1Var2;
                }
                e23.a<Unit> aVar = (e23.a) objQ4;
                String upperCase2 = gl1.y.Q(o0VarE, R.string.lbl_cancel).toUpperCase(locale);
                upperCase2.getClass();
                Object objQ5 = o0VarE.q();
                if (objQ5 == c2565a) {
                    objQ5 = new zk1.d(p1Var, i18);
                    o0VarE.K(objQ5);
                }
                c1Var.a(true, strQ2, null, eVarC, null, upperCase, false, false, aVar, upperCase2, (e23.a) objQ5, o0VarE, 3078, 6, 212);
                o0VarE = o0VarE;
                o0VarE.g0(false);
            } else {
                o0VarE.C(-771648967);
                o0VarE.g0(false);
            }
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new vx1.a(strideLengthSettingsActivity, i14, lVar, i15);
        }
    }

    public static final void f(z3.e eVar, p3.m mVar, int i14) {
        p3.o0 o0VarE = mVar.E(-1055684755);
        if (o0VarE.n(i14 & 1, (i14 & 3) != 2)) {
            p3.x1 x1Var = p3.n.f135158a;
            eVar.invoke(w0.f182753a, o0VarE, 54);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new aa2.o(eVar, i14, 16);
        }
    }

    public static final s5.x0 g(s5.x0 x0Var, p3.m mVar) {
        p3.x1 x1Var = p3.n.f135158a;
        Typeface typefaceA = h22.a.a("font/caveat_brush_regular.ttf", (Context) mVar.A(AndroidCompositionLocals_androidKt.f6042b));
        return s5.x0.a(x0Var, 0L, 0L, null, typefaceA != null ? new w5.j0(new a6.j(typefaceA)) : null, 0L, null, null, 0, 0L, null, null, 16777183);
    }

    public static final String h(String str) {
        char cCharAt;
        str.getClass();
        if (str.length() == 0 || 'a' > (cCharAt = str.charAt(0)) || cCharAt >= '{') {
            return str;
        }
        StringBuilder sb3 = new StringBuilder(str.length());
        sb3.append(Character.toUpperCase(cCharAt));
        sb3.append((CharSequence) str, 1, str.length());
        return sb3.toString();
    }

    public static final String i(DateTime dateTime) {
        if (dateTime == null) {
            p005kotlin.jvm.internal.x0 x0Var = p005kotlin.jvm.internal.x0.f105818a;
            return String.format("%s: --", Arrays.copyOf(new Object[]{w5.r.u(R.string.lbl_last_sync)}, 1));
        }
        if (g22.k.k(dateTime)) {
            p005kotlin.jvm.internal.x0 x0Var2 = p005kotlin.jvm.internal.x0.f105818a;
            return String.format("%s: %s @ %s", Arrays.copyOf(new Object[]{w5.r.u(R.string.lbl_last_sync), w5.r.u(R.string.wallet_lbl_today), DateTimeFormat.shortTime().print(dateTime)}, 3));
        }
        DateTime dateTimeNow = DateTime.now();
        dateTimeNow.getClass();
        if (g22.k.d(dateTime, dateTimeNow)) {
            p005kotlin.jvm.internal.x0 x0Var3 = p005kotlin.jvm.internal.x0.f105818a;
            return String.format("%s: %s @ %s", Arrays.copyOf(new Object[]{w5.r.u(R.string.lbl_last_sync), w5.r.u(R.string.social_elapsed_time_yesterday), DateTimeFormat.shortTime().print(dateTime)}, 3));
        }
        p005kotlin.jvm.internal.x0 x0Var4 = p005kotlin.jvm.internal.x0.f105818a;
        return String.format("%s: %s", Arrays.copyOf(new Object[]{w5.r.u(R.string.lbl_last_sync), DateTimeFormat.shortDateTime().print(dateTime)}, 2));
    }

    public static final z3.e j(StrideLengthSettingsActivity strideLengthSettingsActivity, String str, p3.m mVar) {
        str.getClass();
        p3.x1 x1Var = p3.n.f135158a;
        return z3.f.c(-1239998920, new vd0.b(str, 27), mVar);
    }

    public static final float k(LineDataSet lineDataSet) {
        Collection values = lineDataSet.getValues();
        float f14 = Float.MAX_VALUE;
        if (values != null) {
            Iterator it = values.iterator();
            while (it.hasNext()) {
                float y14 = ((Entry) it.next()).getY();
                if (y14 != -1.0f && y14 < f14) {
                    f14 = y14;
                }
            }
        }
        return f14;
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0057  */
    public static final boolean l(ym1.c cVar, boolean z14) {
        boolean z15;
        int iIntValue;
        Object next;
        Integer num;
        cVar.getClass();
        List<ym1.d> list = cVar.f198109a;
        if (!z14 || !p(cVar)) {
            if (list != null) {
                if (list.isEmpty()) {
                    z15 = false;
                } else {
                    Iterator<T> it = list.iterator();
                    while (it.hasNext()) {
                        Integer num2 = ((ym1.d) it.next()).f198112b;
                        if ((num2 != null ? num2.intValue() : 0) >= 28800) {
                            z15 = true;
                        }
                    }
                    z15 = false;
                }
                if (z15) {
                    return true;
                }
            }
            return false;
        }
        if (list != null && !list.isEmpty()) {
            for (ym1.d dVar : list) {
                LocalDate localDate = dVar.f198111a;
                List<ym1.g> list2 = cVar.f198110b;
                if (list2 != null) {
                    Iterator<T> it3 = list2.iterator();
                    do {
                        if (!it3.hasNext()) {
                            next = null;
                            break;
                        }
                        next = it3.next();
                    } while (!p005kotlin.jvm.internal.s.g(((ym1.g) next).f198127a, localDate));
                    ym1.g gVar = (ym1.g) next;
                    if (gVar == null || (num = gVar.f198128b) == null) {
                        iIntValue = -1;
                    } else {
                        iIntValue = num.intValue();
                    }
                } else {
                    iIntValue = -1;
                }
                if (iIntValue >= 0) {
                    Integer num3 = dVar.f198112b;
                    if (iIntValue <= (num3 != null ? num3.intValue() : 0)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0056  */
    public static final boolean m(ym1.c cVar, boolean z14) {
        boolean z15;
        int iIntValue;
        Object next;
        Integer num;
        cVar.getClass();
        List<ym1.d> list = cVar.f198109a;
        if (!z14 || !p(cVar)) {
            if (list != null) {
                if (list.isEmpty()) {
                    z15 = true;
                } else {
                    Iterator<T> it = list.iterator();
                    while (it.hasNext()) {
                        Integer num2 = ((ym1.d) it.next()).f198112b;
                        if (!((num2 != null ? num2.intValue() : 0) >= 28800)) {
                            z15 = false;
                        }
                    }
                    z15 = true;
                }
                if (z15) {
                    return true;
                }
            }
            return false;
        }
        if (list == null) {
            return false;
        }
        if (list.isEmpty()) {
            return true;
        }
        for (ym1.d dVar : list) {
            LocalDate localDate = dVar.f198111a;
            List<ym1.g> list2 = cVar.f198110b;
            if (list2 != null) {
                Iterator<T> it3 = list2.iterator();
                do {
                    if (!it3.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it3.next();
                } while (!p005kotlin.jvm.internal.s.g(((ym1.g) next).f198127a, localDate));
                ym1.g gVar = (ym1.g) next;
                if (gVar == null || (num = gVar.f198128b) == null) {
                    iIntValue = -1;
                } else {
                    iIntValue = num.intValue();
                }
            } else {
                iIntValue = -1;
            }
            if (iIntValue >= 0) {
                Integer num3 = dVar.f198112b;
                if (iIntValue <= (num3 != null ? num3.intValue() : 0)) {
                }
            }
            return false;
        }
        return true;
    }

    public static final boolean n(ym1.c cVar) {
        cVar.getClass();
        List<ym1.d> list = cVar.f198109a;
        if (list != null && !list.isEmpty()) {
            for (ym1.d dVar : list) {
                dVar.getClass();
                if (dVar.f198111a != null) {
                    Integer num = dVar.f198112b;
                    if (num == null || num.intValue() <= 0) {
                        num = null;
                    }
                    if (num != null) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static final boolean o(List list) {
        list.getClass();
        if (list.isEmpty()) {
            return false;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            wm1.a aVar = (wm1.a) it.next();
            aVar.getClass();
            if (aVar.f186054a != null) {
                Integer num = aVar.f186055b;
                if (num == null || num.intValue() < 0) {
                    num = null;
                }
                if (num != null) {
                    return true;
                }
            }
        }
        return false;
    }

    public static final boolean p(ym1.c cVar) {
        cVar.getClass();
        List<ym1.g> list = cVar.f198110b;
        if (list != null && !list.isEmpty()) {
            for (ym1.g gVar : list) {
                gVar.getClass();
                if (gVar.f198127a != null) {
                    Integer num = gVar.f198128b;
                    if (num == null || num.intValue() <= 0) {
                        num = null;
                    }
                    if (num != null) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static int q(int i14, int i15) {
        if (i14 > -12 || i15 > -65) {
            return -1;
        }
        return i14 ^ (i15 << 8);
    }

    public static int r(byte[] bArr, int i14, int i15) {
        byte b14 = bArr[i14 - 1];
        int i16 = i15 - i14;
        if (i16 == 0) {
            if (b14 > -12) {
                return -1;
            }
            return b14;
        }
        if (i16 == 1) {
            return q(b14, bArr[i14]);
        }
        if (i16 != 2) {
            v.e0.l();
            return 0;
        }
        byte b15 = bArr[i14];
        byte b16 = bArr[i14 + 1];
        if (b14 > -12 || b15 > -65 || b16 > -65) {
            return -1;
        }
        return (b16 << Ascii.DLE) ^ ((b15 << 8) ^ b14);
    }

    public static final boolean s(int i14, String str) {
        char cCharAt = str.charAt(i14);
        return 'A' <= cCharAt && cCharAt < '[';
    }

    public static final String t(sd2.f fVar) {
        if (fVar == null) {
            return null;
        }
        String strU4 = fVar.u4();
        if (strU4 != null && Patterns.WEB_URL.matcher(strU4).matches()) {
            return fVar.u4();
        }
        String strT0 = fVar.t0();
        if (strT0 != null && Patterns.WEB_URL.matcher(strT0).matches()) {
            return fVar.t0();
        }
        String strL = fVar.L();
        return (strL == null || !Patterns.WEB_URL.matcher(strL).matches()) ? fVar.getImageURL() : fVar.L();
    }

    public static int u(byte[] bArr, int i14, int i15) {
        while (i14 < i15 && bArr[i14] >= 0) {
            i14++;
        }
        if (i14 >= i15) {
            return 0;
        }
        while (i14 < i15) {
            int i16 = i14 + 1;
            byte b14 = bArr[i14];
            if (b14 >= 0) {
                i14 = i16;
            } else if (b14 < -32) {
                if (i16 >= i15) {
                    return b14;
                }
                if (b14 < -62) {
                    return -1;
                }
                i14 += 2;
                if (bArr[i16] > -65) {
                    return -1;
                }
            } else if (b14 < -16) {
                if (i16 >= i15 - 1) {
                    return r(bArr, i16, i15);
                }
                int i17 = i14 + 2;
                byte b15 = bArr[i16];
                if (b15 > -65) {
                    return -1;
                }
                if (b14 == -32 && b15 < -96) {
                    return -1;
                }
                if (b14 == -19 && b15 >= -96) {
                    return -1;
                }
                i14 += 3;
                if (bArr[i17] > -65) {
                    return -1;
                }
            } else {
                if (i16 >= i15 - 2) {
                    return r(bArr, i16, i15);
                }
                int i18 = i14 + 2;
                byte b16 = bArr[i16];
                if (b16 > -65) {
                    return -1;
                }
                if ((((b16 + 112) + (b14 << Ascii.FS)) >> 30) != 0) {
                    return -1;
                }
                int i19 = i14 + 3;
                if (bArr[i18] > -65) {
                    return -1;
                }
                i14 += 4;
                if (bArr[i19] > -65) {
                    return -1;
                }
            }
        }
        return 0;
    }

    public static final String v(String str) {
        str.getClass();
        StringBuilder sb3 = new StringBuilder(str.length());
        int length = str.length();
        for (int i14 = 0; i14 < length; i14++) {
            char cCharAt = str.charAt(i14);
            if ('A' <= cCharAt && cCharAt < '[') {
                cCharAt = Character.toLowerCase(cCharAt);
            }
            sb3.append(cCharAt);
        }
        return sb3.toString();
    }
}
