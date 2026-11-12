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
public final class n {

    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f203266a;

        static {
            int[] iArr = new int[j22.f.values().length];
            try {
                iArr[j22.f.ALLOWED_ALL_TIME.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[j22.f.DENIED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f203266a = iArr;
        }
    }

    /* JADX WARN: Code duplicated, block: B:32:0x0080  */
    /* JADX WARN: Code duplicated, block: B:41:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:49:0x00df  */
    /* JADX WARN: Code duplicated, block: B:54:0x00fb  */
    public static final void a(boolean z14, e23.l lVar, a4.a aVar, e23.a aVar2, int i14, p3.m mVar, int i15) {
        o0 o0VarP = a0.p(lVar, aVar2, mVar, 1061706218);
        int i16 = i15 | (o0VarP.h(z14) ? 4 : 2) | (o0VarP.r(aVar) ? 256 : 128) | (o0VarP.r(aVar2) ? 2048 : 1024) | (o0VarP.k(i14) ? 16384 : 8192);
        if (o0VarP.n(i16 & 1, (i16 & 9363) != 9362)) {
            x1 x1Var = p3.n.f135158a;
            Context context = (Context) o0VarP.A(AndroidCompositionLocals_androidKt.f6042b);
            g.h hVar = new g.h();
            int i17 = i16 & 896;
            boolean zR = o0VarP.r(context) | (i17 == 256);
            Object objQ = o0VarP.q();
            p3.m.a aVar3 = p3.m.f135153a;
            if (zR) {
                objQ = new za0.a(context, aVar, 2);
                o0VarP.K(objQ);
            } else {
                aVar3.getClass();
                if (objQ == p3.m.a.f135155b) {
                    objQ = new za0.a(context, aVar, 2);
                    o0VarP.K(objQ);
                }
            }
            c.q qVarC = w.c(hVar, (e23.l) objQ, o0VarP, 0);
            g.f fVar = new g.f();
            boolean zR2 = (i17 == 256) | o0VarP.r(qVarC);
            Object objQ2 = o0VarP.q();
            if (zR2) {
                objQ2 = new b(aVar, lVar, qVarC, 2);
                o0VarP.K(objQ2);
            } else {
                aVar3.getClass();
                if (objQ2 == p3.m.a.f135155b) {
                    objQ2 = new b(aVar, lVar, qVarC, 2);
                    o0VarP.K(objQ2);
                }
            }
            c.q qVarC2 = w.c(fVar, (e23.l) objQ2, o0VarP, 0);
            String strQ = y.Q(o0VarP, R.string.title_location_access);
            u4.d dVar = r90.a.f151346d.f151354b;
            String strQ2 = y.Q(o0VarP, i14);
            String strQ3 = y.Q(o0VarP, R.string.label_allow_location_access);
            boolean z15 = i17 == 256;
            Object objQ3 = o0VarP.q();
            if (z15) {
                objQ3 = new c(aVar, 2);
                o0VarP.K(objQ3);
            } else {
                aVar3.getClass();
                if (objQ3 == p3.m.a.f135155b) {
                    objQ3 = new c(aVar, 2);
                    o0VarP.K(objQ3);
                }
            }
            e23.a aVar4 = (e23.a) objQ3;
            boolean zR3 = o0VarP.r(qVarC2);
            Object objQ4 = o0VarP.q();
            if (zR3) {
                objQ4 = new ib0.n(qVarC2, 10);
                o0VarP.K(objQ4);
            } else {
                aVar3.getClass();
                if (objQ4 == p3.m.a.f135155b) {
                    objQ4 = new ib0.n(qVarC2, 10);
                    o0VarP.K(objQ4);
                }
            }
            int i18 = i16 << 15;
            h.a("permissions_location_screen", strQ, dVar, strQ2, strQ3, z14, aVar4, (e23.a) objQ4, aVar2, o0VarP, (458752 & i18) | 390 | (i18 & 234881024));
        } else {
            o0VarP.e();
        }
        p2 p2VarI0 = o0VarP.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new yy1.g(z14, lVar, aVar, aVar2, i14, i15);
        }
    }
}
