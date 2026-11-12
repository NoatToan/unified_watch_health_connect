package s70;

import android.annotation.SuppressLint;
import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.i2;
import o72.z2;
import p3.p2;

/* JADX INFO: loaded from: classes8.dex */
public final class s {

    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f157792a;

        static {
            int[] iArr = new int[j22.h.values().length];
            try {
                iArr[j22.h.ALLOWED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[j22.h.DENIED_DONT_ASK_AGAIN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f157792a = iArr;
        }
    }

    public static final void a(int i14, h4.r rVar, String str, p3.m mVar) {
        p3.o0 o0VarE = mVar.E(1930695114);
        int i15 = (o0VarE.B(rVar) ? 4 : 2) | i14 | (o0VarE.B(str) ? 32 : 16);
        if (o0VarE.n(i15 & 1, (i15 & 19) != 18)) {
            p3.x1 x1Var = p3.n.f135158a;
            l72.s sVar = l72.s.f111232a;
            l72.s.b bVar = l72.s.b.ALERT;
            s62.a.f157643a.getClass();
            sVar.d(rVar, bVar, v62.g0.a(t62.b.f162798a), str, null, null, null, null, o0VarE, (i15 & 14) | 48 | ((i15 << 6) & 7168), 496);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new cq.g(rVar, str, i14, 6);
        }
    }

    /* JADX WARN: Code duplicated, block: B:20:0x006d  */
    @SuppressLint({"MissingPermission"})
    public static final void b(h4.r rVar, p3.m mVar, int i14) {
        int i15;
        p3.o0 o0VarE = mVar.E(-962646724);
        if ((i14 & 6) == 0) {
            i15 = (o0VarE.B(rVar) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if (o0VarE.n(i15 & 1, (i15 & 3) != 2)) {
            p3.x1 x1Var = p3.n.f135158a;
            Context context = (Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b);
            d92.b.f58623a.getClass();
            j92.b bVar = d92.b.f58625c;
            bVar.getClass();
            j92.e eVar = j92.b.f97899b;
            float f14 = eVar.f97920e;
            bVar.getClass();
            float f15 = eVar.f97920e;
            bVar.getClass();
            h4.r rVarC = c2.l.C(rVar, f14, eVar.f97920e, f15, 0.0f, 8);
            boolean zR = o0VarE.r(context);
            Object objQ = o0VarE.q();
            if (zR) {
                objQ = new r(context, 0);
                o0VarE.K(objQ);
            } else {
                p3.m.f135153a.getClass();
                if (objQ == p3.m.a.f135155b) {
                    objQ = new r(context, 0);
                    o0VarE.K(objQ);
                }
            }
            a(0, u1.w.d(rVarC, false, null, null, (e23.a) objQ, 15), gl1.y.Q(o0VarE, R.string.lbl_bluetooth_off), o0VarE);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new c2.p(rVar, i14, 2, (byte) 0);
        }
    }

    /* JADX WARN: Code duplicated, block: B:31:0x006d  */
    /* JADX WARN: Code duplicated, block: B:40:0x0098  */
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
    public static final void c(int i14, e23.a aVar, h4.r rVar, p3.m mVar) {
        int i15;
        Context context;
        int i16;
        p3.o0 o0VarE = mVar.E(-901674072);
        if ((i14 & 6) == 0) {
            i15 = i14 | (o0VarE.B(rVar) ? 4 : 2);
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= o0VarE.r(aVar) ? 32 : 16;
        }
        if (o0VarE.n(i15 & 1, (i15 & 19) != 18)) {
            p3.x1 x1Var = p3.n.f135158a;
            Context context2 = (Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b);
            g.h hVar = new g.h();
            int i17 = i15 & 112;
            boolean zR = o0VarE.r(context2) | (i17 == 32);
            Object objQ = o0VarE.q();
            p3.m.a aVar2 = p3.m.f135153a;
            if (zR) {
                objQ = new rk0.g(19, context2, aVar);
                o0VarE.K(objQ);
            } else {
                aVar2.getClass();
                if (objQ == p3.m.a.f135155b) {
                    objQ = new rk0.g(19, context2, aVar);
                    o0VarE.K(objQ);
                }
            }
            c.q qVarC = c.w.c(hVar, (e23.l) objQ, o0VarE, 0);
            g.f fVar = new g.f();
            boolean zR2 = o0VarE.r(qVarC) | (i17 == 32);
            Object objQ2 = o0VarE.q();
            if (zR2) {
                objQ2 = new rk0.g(20, aVar, qVarC);
                o0VarE.K(objQ2);
            } else {
                aVar2.getClass();
                if (objQ2 == p3.m.a.f135155b) {
                    objQ2 = new rk0.g(20, aVar, qVarC);
                    o0VarE.K(objQ2);
                }
            }
            c.q qVarC2 = c.w.c(fVar, (e23.l) objQ2, o0VarE, 0);
            Object objQ3 = o0VarE.q();
            aVar2.getClass();
            p3.m.a.C2565a c2565a = p3.m.a.f135155b;
            if (objQ3 == c2565a) {
                objQ3 = p3.p0.n(Boolean.FALSE);
                o0VarE.K(objQ3);
            }
            p3.p1 p1Var = (p3.p1) objQ3;
            if (((Boolean) p1Var.getF182175a()).booleanValue()) {
                o0VarE.C(-1044996700);
                d("showBluetoothPermissionDeniedDialog");
                g82.c cVar = g82.c.f76436a;
                String strQ = gl1.y.Q(o0VarE, R.string.permission_nearby_devices_allow_title);
                String strQ2 = gl1.y.Q(o0VarE, R.string.permission_nearby_devices_allow_message);
                String strQ3 = gl1.y.Q(o0VarE, R.string.lbl_allow_access);
                boolean zR3 = o0VarE.r(qVarC2);
                Object objQ4 = o0VarE.q();
                if (zR3 || objQ4 == c2565a) {
                    objQ4 = new c42.g(qVarC2, p1Var, 7);
                    o0VarE.K(objQ4);
                }
                e23.a aVar3 = (e23.a) objQ4;
                String strQ4 = gl1.y.Q(o0VarE, R.string.lbl_cancel);
                Object objQ5 = o0VarE.q();
                if (objQ5 == c2565a) {
                    objQ5 = new rk0.w(p1Var, 10);
                    o0VarE.K(objQ5);
                }
                e23.a aVar4 = (e23.a) objQ5;
                Object objQ6 = o0VarE.q();
                if (objQ6 == c2565a) {
                    objQ6 = new rk0.w(p1Var, 11);
                    o0VarE.K(objQ6);
                }
                i16 = 0;
                context = context2;
                cVar.c(null, strQ, strQ2, 0, strQ3, aVar3, strQ4, aVar4, false, (e23.a) objQ6, o0VarE, 918552576, 9);
                o0VarE.g0(false);
            } else {
                context = context2;
                i16 = 0;
                o0VarE.C(-1043929990);
                o0VarE.g0(false);
            }
            d92.b.f58623a.getClass();
            j92.b bVar = d92.b.f58625c;
            bVar.getClass();
            j92.e eVar = j92.b.f97899b;
            float f14 = eVar.f97920e;
            bVar.getClass();
            float f15 = eVar.f97920e;
            bVar.getClass();
            h4.r rVarC = c2.l.C(rVar, f14, eVar.f97920e, f15, 0.0f, 8);
            boolean zR4 = o0VarE.r(context);
            Object objQ7 = o0VarE.q();
            if (zR4 || objQ7 == c2565a) {
                objQ7 = new z2(context, p1Var, 18);
                o0VarE.K(objQ7);
            }
            a(i16, u1.w.d(rVarC, false, null, null, (e23.a) objQ7, 15), gl1.y.Q(o0VarE, R.string.permission_nearby_devices_disabled_message), o0VarE);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new ba2.g(rVar, aVar, i14, 5, (byte) 0);
        }
    }

    public static final void d(String str) {
        i2.a aVar = i2.f36769a;
        com.garmin.android.apps.connectmobile.a2 a2Var = com.garmin.android.apps.connectmobile.a2.DASHBOARD;
        aVar.getClass();
        i2.a.b(a2Var, "BluetoothComposable", str);
    }
}
