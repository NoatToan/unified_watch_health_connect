package za0;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.room.a0;
import c.w;
import com.garmin.android.apps.connectmobile.R;
import gl1.y;
import p3.o0;
import p3.p2;
import p3.x1;

/* JADX INFO: loaded from: classes8.dex */
public final class u {

    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f203279a;

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
            f203279a = iArr;
        }
    }

    /* JADX WARN: Code duplicated, block: B:32:0x0081  */
    /* JADX WARN: Code duplicated, block: B:41:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:51:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:56:0x0116  */
    public static final void a(i iVar, boolean z14, e23.l lVar, a4.a aVar, e23.a aVar2, p3.m mVar, int i14) {
        a4.a aVar3;
        Object qVar;
        o0 o0VarP = a0.p(lVar, aVar2, mVar, -2027538842);
        int i15 = i14 | (o0VarP.r(iVar) ? 4 : 2) | (o0VarP.h(z14) ? 32 : 16) | (o0VarP.r(aVar) ? 2048 : 1024) | (o0VarP.r(aVar2) ? 16384 : 8192);
        if (o0VarP.n(i15 & 1, (i15 & 9363) != 9362)) {
            x1 x1Var = p3.n.f135158a;
            Context context = (Context) o0VarP.A(AndroidCompositionLocals_androidKt.f6042b);
            g.h hVar = new g.h();
            int i16 = i15 & 7168;
            boolean zR = o0VarP.r(context) | (i16 == 2048);
            Object objQ = o0VarP.q();
            p3.m.a aVar4 = p3.m.f135153a;
            if (zR) {
                objQ = new za0.a(context, aVar, 3);
                o0VarP.K(objQ);
            } else {
                aVar4.getClass();
                if (objQ == p3.m.a.f135155b) {
                    objQ = new za0.a(context, aVar, 3);
                    o0VarP.K(objQ);
                }
            }
            c.q qVarC = w.c(hVar, (e23.l) objQ, o0VarP, 0);
            g.f fVar = new g.f();
            boolean zR2 = o0VarP.r(iVar) | o0VarP.r(context) | (i16 == 2048) | o0VarP.r(qVarC);
            Object objQ2 = o0VarP.q();
            if (zR2) {
                qVar = new ug2.q(iVar, context, aVar, lVar, qVarC);
                o0VarP.K(qVar);
            } else {
                aVar4.getClass();
                if (objQ2 == p3.m.a.f135155b) {
                    qVar = new ug2.q(iVar, context, aVar, lVar, qVarC);
                    o0VarP.K(qVar);
                } else {
                    qVar = objQ2;
                }
            }
            c.q qVarC2 = w.c(fVar, (e23.l) qVar, o0VarP, 0);
            String strQ = y.Q(o0VarP, R.string.title_phone_call_access);
            u4.d dVar = r90.a.f151349g.f151354b;
            String strQ2 = y.Q(o0VarP, R.string.phone_permission_bic_description);
            String strQ3 = y.Q(o0VarP, R.string.label_allow_phone_call_access);
            boolean z15 = i16 == 2048;
            Object objQ3 = o0VarP.q();
            if (z15) {
                objQ3 = new c(aVar, 4);
                o0VarP.K(objQ3);
            } else {
                aVar4.getClass();
                if (objQ3 == p3.m.a.f135155b) {
                    objQ3 = new c(aVar, 4);
                    o0VarP.K(objQ3);
                }
            }
            e23.a aVar5 = (e23.a) objQ3;
            boolean zR3 = o0VarP.r(qVarC2);
            Object objQ4 = o0VarP.q();
            if (zR3) {
                objQ4 = new ib0.n(qVarC2, 11);
                o0VarP.K(objQ4);
            } else {
                aVar4.getClass();
                if (objQ4 == p3.m.a.f135155b) {
                    objQ4 = new ib0.n(qVarC2, 11);
                    o0VarP.K(objQ4);
                }
            }
            int i17 = i15 << 12;
            h.a("permissions_phone_calls_screen", strQ, dVar, strQ2, strQ3, z14, aVar5, (e23.a) objQ4, aVar2, o0VarP, (i17 & 234881024) | (458752 & i17) | 390);
        } else {
            aVar3 = aVar;
            o0VarP.e();
        }
        p2 p2VarI0 = o0VarP.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new ug2.p(iVar, lVar, aVar3, aVar2, z14, i14, 18);
        }
    }
}
