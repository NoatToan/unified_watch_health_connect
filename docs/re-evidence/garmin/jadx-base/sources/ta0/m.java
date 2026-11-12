package ta0;

import c2.t2;
import com.garmin.android.apps.connectmobile.R;
import com.google.android.exoplayer2.source.ProgressiveMediaSource;
import i3.ba;
import i3.eh;
import i3.sg;
import java.util.ArrayList;
import java.util.List;
import kotlin.m3;
import kotlin.t1;
import o4.m1;
import p005kotlin.Unit;
import p006l2.a2;
import p3.p1;
import p3.p2;
import p3.x1;
import sk0.k1;

/* JADX INFO: loaded from: classes8.dex */
public final class m {
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
    public static final void a(String str, o90.a aVar, String str2, String str3, e23.l lVar, e23.l lVar2, e23.a aVar2, p3.m mVar, int i14) {
        e23.l lVar3;
        String str4;
        String str5;
        p3.o0 o0Var;
        String strQ;
        String strQ2;
        int i15;
        p3.o0 o0Var2;
        p3.o0 o0VarE = mVar.E(-2079251957);
        int i16 = (i14 & 6) == 0 ? (o0VarE.B(str) ? 4 : 2) | i14 : i14;
        if ((i14 & 48) == 0) {
            i16 |= (i14 & 64) == 0 ? o0VarE.B(aVar) : o0VarE.r(aVar) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            i16 |= 128;
        }
        if ((i14 & 3072) == 0) {
            i16 |= 1024;
        }
        if ((i14 & 24576) == 0) {
            i16 |= o0VarE.r(lVar) ? 16384 : 8192;
        }
        if ((196608 & i14) == 0) {
            lVar3 = lVar2;
            i16 |= o0VarE.r(lVar3) ? 131072 : 65536;
        } else {
            lVar3 = lVar2;
        }
        if ((1572864 & i14) == 0) {
            i16 |= o0VarE.r(aVar2) ? ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288;
        }
        if (o0VarE.n(i16 & 1, (599187 & i16) != 599186)) {
            o0VarE.G0();
            if ((i14 & 1) == 0 || o0VarE.o0()) {
                strQ = gl1.y.Q(o0VarE, R.string.title_enter_left_pedal_id_number);
                strQ2 = gl1.y.Q(o0VarE, R.string.vector_pedal_id_instruction);
                i15 = i16 & (-8065);
            } else {
                o0VarE.e();
                i15 = i16 & (-8065);
                strQ = str2;
                strQ2 = str3;
            }
            int i17 = i15;
            o0VarE.h0();
            x1 x1Var = p3.n.f135158a;
            Object objQ = o0VarE.q();
            p3.m.f135153a.getClass();
            if (objQ == p3.m.a.f135155b) {
                ArrayList arrayList = new ArrayList(7);
                for (int i18 = 0; i18 < 7; i18++) {
                    arrayList.add("");
                }
                objQ = p3.p0.n(arrayList);
                o0VarE.K(objQ);
            }
            p1 p1Var = (p1) objQ;
            Object objQ2 = o0VarE.q();
            Object obj = objQ2;
            if (objQ2 == p3.m.a.f135155b) {
                ArrayList arrayList2 = new ArrayList(7);
                for (int i19 = 0; i19 < 7; i19++) {
                    arrayList2.add(new m4.b0());
                }
                o0VarE.K(arrayList2);
                obj = arrayList2;
            }
            List list = (List) obj;
            m3 m3Var = (m3) o0VarE.A(t1.f91499q);
            Object objQ3 = o0VarE.q();
            p3.m.a.C2565a c2565a = p3.m.a.f135155b;
            if (objQ3 == c2565a) {
                objQ3 = p3.p0.n(Boolean.FALSE);
                o0VarE.K(objQ3);
            }
            p1 p1Var2 = (p1) objQ3;
            Unit unit = Unit.INSTANCE;
            boolean zR = o0VarE.r(list);
            Object objQ4 = o0VarE.q();
            if (zR || objQ4 == c2565a) {
                objQ4 = new k(list, null);
                o0VarE.K(objQ4);
            }
            p3.l0.e((e23.p) objQ4, unit, o0VarE);
            if (((Boolean) p1Var2.getF182175a()).booleanValue()) {
                o0VarE.C(-975905049);
                l72.c1 c1Var = l72.c1.f110940a;
                String strQ3 = gl1.y.Q(o0VarE, R.string.dialog_title_error);
                String strQ4 = gl1.y.Q(o0VarE, R.string.lbl_error_title_wrong_number);
                String strQ5 = gl1.y.Q(o0VarE, R.string.lbl_ok);
                Object objQ5 = o0VarE.q();
                if (objQ5 == c2565a) {
                    objQ5 = new sg0.l(p1Var2, 26);
                    o0VarE.K(objQ5);
                }
                c1Var.a(false, strQ3, strQ4, null, null, strQ5, false, false, (e23.a) objQ5, null, null, o0VarE, 100663296, 0, 1753);
                p3.o0 o0Var3 = o0VarE;
                o0Var3.g0(false);
                o0Var2 = o0Var3;
            } else {
                p3.o0 o0Var4 = o0VarE;
                o0Var4.C(-975582153);
                o0Var4.g0(false);
                o0Var2 = o0Var4;
            }
            String str6 = strQ;
            String str7 = strQ2;
            p3.o0 o0Var5 = o0Var2;
            da0.p.d("device_discovery_ant_id_input_screen", false, aVar2, null, null, null, z3.f.c(-1572539102, new a11.j(aVar, lVar3, lVar, str6, str, str7, p1Var, list, m3Var, p1Var2), o0Var2), o0Var5, ((i17 >> 12) & 896) | 12582918, 122);
            o0Var = o0Var5;
            x1 x1Var2 = p3.n.f135158a;
            str4 = str6;
            str5 = str7;
        } else {
            p3.o0 o0Var6 = o0VarE;
            o0Var6.e();
            str4 = str2;
            str5 = str3;
            o0Var = o0Var6;
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new cn1.o(str, (Object) aVar, (Object) str4, (Object) str5, (Object) lVar, lVar2, aVar2, i14, 22);
        }
    }

    public static final void b(l90.b bVar, e23.l<? super Long, Unit> lVar, e23.a<Unit> aVar, e23.l<? super Float, Unit> lVar2, p3.m mVar, int i14) {
        bVar.getClass();
        lVar.getClass();
        aVar.getClass();
        lVar2.getClass();
        p3.o0 o0VarE = mVar.E(-1490322328);
        int i15 = i14 | (o0VarE.r(bVar) ? 4 : 2) | (o0VarE.r(lVar) ? 32 : 16) | (o0VarE.r(aVar) ? 256 : 128) | (o0VarE.r(lVar2) ? 2048 : 1024);
        if (o0VarE.n(i15 & 1, (i15 & 1171) != 1170)) {
            x1 x1Var = p3.n.f135158a;
            a(bVar.f111521f, bVar.f111526k, null, null, lVar, lVar2, aVar, o0VarE, ((i15 << 9) & 57344) | (458752 & (i15 << 6)) | ((i15 << 12) & 3670016));
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new k1((Object) bVar, (e23.l) lVar, (e23.a) aVar, (o13.h) lVar2, i14, 7);
        }
    }

    /* JADX WARN: Code duplicated, block: B:36:0x008a  */
    /* JADX WARN: Code duplicated, block: B:44:0x0186  */
    public static final void c(t2 t2Var, String str, m4.b0 b0Var, int i14, e23.l lVar, e23.a aVar, p3.m mVar, int i15) {
        p3.o0 o0Var;
        p3.o0 o0VarE = mVar.E(-1481617250);
        int i16 = i15 | (o0VarE.B(str) ? 32 : 16) | (o0VarE.B(b0Var) ? 256 : 128) | (o0VarE.k(i14) ? 2048 : 1024) | (o0VarE.r(lVar) ? 16384 : 8192) | (o0VarE.r(aVar) ? 131072 : 65536);
        if (o0VarE.n(i16 & 1, (74899 & i16) != 74898)) {
            x1 x1Var = p3.n.f135158a;
            h4.r rVarA = m4.e.a(h4.r.S, b0Var);
            boolean z14 = (458752 & i16) == 131072;
            Object objQ = o0VarE.q();
            p3.m.a aVar2 = p3.m.f135153a;
            if (z14) {
                objQ = new l(aVar);
                o0VarE.K(objQ);
            } else {
                aVar2.getClass();
                if (objQ == p3.m.a.f135155b) {
                    objQ = new l(aVar);
                    o0VarE.K(objQ);
                }
            }
            h4.r rVarB = z4.f.b(rVarA, (e23.l) objQ);
            d92.b.f58623a.getClass();
            j92.b bVar = d92.b.f58625c;
            bVar.getClass();
            h4.r rVarA2 = t2Var.a(l4.k.b(rVarB, k2.i.a(j92.b.f97900c.f97911c)), 1.0f, true);
            bVar.getClass();
            h4.r rVarE = u1.n.e(c2.l.A(rVarA2, j92.b.f97899b.f97917b, 0.0f, 2), ds.e0.w(o0VarE), m1.f128891a);
            ba baVar = ba.f87580a;
            o4.d0.f128823b.getClass();
            long j8 = o4.d0.f128831j;
            long jA = d92.b.a(o0VarE).k().a();
            baVar.getClass();
            sg sgVarC = ba.c(0L, 0L, 0L, 0L, 0L, jA, null, j8, j8, 0L, 0L, j8, j8, 0L, 0L, 0L, 0L, o0VarE, 2147378943);
            d92.b.f58624b.getClass();
            s5.x0 x0VarB = d92.c.b(j92.f.f97931h, o0VarE);
            d6.h.f57752b.getClass();
            s5.x0 x0VarA = s5.x0.a(x0VarB, 0L, 0L, null, null, 0L, null, null, d6.h.f57755e, 0L, null, null, 16744447);
            x5.v.f188954b.getClass();
            a2 a2Var = new a2(0, (Boolean) null, x5.v.f188957e, i14, (x5.f0) null, (Boolean) null, (z5.c) null, 115, (p005kotlin.jvm.internal.j) null);
            boolean z15 = (57344 & i16) == 16384;
            Object objQ2 = o0VarE.q();
            if (z15) {
                objQ2 = new j(lVar, 1);
                o0VarE.K(objQ2);
            } else {
                aVar2.getClass();
                if (objQ2 == p3.m.a.f135155b) {
                    objQ2 = new j(lVar, 1);
                    o0VarE.K(objQ2);
                }
            }
            eh.a(str, (e23.l) objQ2, rVarE, false, x0VarA, null, null, null, null, a2Var, null, false, 0, 0, null, null, sgVarC, o0VarE, (i16 >> 3) & 14, 0, 4161496);
            o0Var = o0VarE;
        } else {
            o0Var = o0VarE;
            o0Var.e();
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new ka0.e(t2Var, str, b0Var, i14, lVar, aVar, i15);
        }
    }
}
