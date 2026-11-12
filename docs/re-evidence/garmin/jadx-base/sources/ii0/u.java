package ii0;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.garmin.android.apps.connectmobile.R;
import i3.e5;
import java.util.List;
import l72.i3;
import org.koin.java.KoinJavaComponent;
import p3.n1;
import p3.p1;
import p3.p2;
import p3.x1;
import v62.b8;
import v62.i9;

/* JADX INFO: loaded from: classes8.dex */
public final class u {

    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f93743a;

        static {
            int[] iArr = new int[p003ji0.k.values().length];
            try {
                iArr[p003ji0.k.FOLLOWERS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[p003ji0.k.FOLLOWING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[p003ji0.k.SUGGESTED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f93743a = iArr;
        }
    }

    public static final void a(mi0.f fVar, p003ji0.k kVar, e23.a aVar, p3.m mVar, int i14) {
        p3.o0 o0Var;
        zc.d dVar;
        zc.d dVar2;
        aVar.getClass();
        p3.o0 o0VarE = mVar.E(-2147157131);
        int i15 = i14 | (o0VarE.r(fVar) ? 4 : 2) | (o0VarE.k(kVar == null ? -1 : kVar.ordinal()) ? 32 : 16) | (o0VarE.r(aVar) ? 256 : 128);
        if (o0VarE.n(i15 & 1, (i15 & 147) != 146)) {
            x1 x1Var = p3.n.f135158a;
            Context context = (Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b);
            Object objQ = o0VarE.q();
            p3.m.f135153a.getClass();
            p3.m.a.C2565a c2565a = p3.m.a.f135155b;
            if (objQ == c2565a) {
                objQ = p3.l0.j(t13.h.f161748a, o0VarE);
                o0VarE.K(objQ);
            }
            o53.b0 b0Var = (o53.b0) objQ;
            gi0.a aVar2 = (gi0.a) KoinJavaComponent.get$default(gi0.a.class, null, null, 6, null);
            String strQ = gl1.y.Q(o0VarE, R.string.lbl_share_profile);
            s62.a.f157643a.getClass();
            t62.b bVar = t62.b.f162798a;
            List listK = p13.x.k(new i3("MENU_ITEM_SHARE", strQ, false, b8.a(bVar), gl1.y.Q(o0VarE, R.string.lbl_share_profile), 4, (p005kotlin.jvm.internal.j) null), new i3("MENU_ITEM_DISCOVER", gl1.y.Q(o0VarE, R.string.concept_discover_friends), false, i9.a(bVar), gl1.y.Q(o0VarE, R.string.social_find_friends), 4, (p005kotlin.jvm.internal.j) null));
            List listK2 = p13.x.k(p003ji0.k.FOLLOWERS, p003ji0.k.FOLLOWING, p003ji0.k.SUGGESTED);
            String userFullName = ((f12.b) KoinJavaComponent.get$default(f12.b.class, null, null, 6, null)).getUserFullName();
            Object objQ2 = o0VarE.q();
            if (objQ2 == c2565a) {
                int iG0 = p13.h0.g0(kVar, listK2);
                if (iG0 < 0) {
                    iG0 = 0;
                }
                objQ2 = e5.o(iG0, o0VarE);
            }
            n1 n1Var = (n1) objQ2;
            p1 p1VarC = s9.c.c(fVar.f118776k, o0VarE);
            e2.i0 i0VarA = e2.k0.a(0, 0, 3, o0VarE);
            e2.i0 i0VarA2 = e2.k0.a(0, 0, 3, o0VarE);
            e2.i0 i0VarA3 = e2.k0.a(0, 0, 3, o0VarE);
            e2.i0 i0VarA4 = e2.k0.a(0, 0, 3, o0VarE);
            e2.i0 i0VarA5 = e2.k0.a(0, 0, 3, o0VarE);
            zc.d dVarA = zc.g.a(fVar.f118778m, o0VarE);
            zc.d dVarA2 = zc.g.a(fVar.f118781p, o0VarE);
            zc.d dVarA3 = zc.g.a(fVar.f118783r, o0VarE);
            zc.d dVarA4 = zc.g.a(fVar.f118779n, o0VarE);
            zc.d dVarA5 = zc.g.a(fVar.f118782q, o0VarE);
            Object objQ3 = o0VarE.q();
            if (objQ3 == c2565a) {
                objQ3 = p3.p0.n(Boolean.TRUE);
                o0VarE.K(objQ3);
            }
            p1 p1Var = (p1) objQ3;
            yc.s sVarD = dVarA.d();
            yc.s sVarD2 = dVarA2.d();
            yc.s sVarD3 = dVarA3.d();
            boolean zR = o0VarE.r(dVarA) | o0VarE.r(dVarA2) | o0VarE.r(dVarA3);
            Object objQ4 = o0VarE.q();
            if (zR || objQ4 == c2565a) {
                dVar = dVarA;
                dVar2 = dVarA2;
                objQ4 = new q(dVar, dVar2, dVarA3, p1Var, null);
                o0VarE.K(objQ4);
            } else {
                dVar = dVarA;
                dVar2 = dVarA2;
            }
            p3.l0.g(sVarD, sVarD2, sVarD3, (e23.p) objQ4, o0VarE);
            u2.h hVarC = u2.i.c(o0VarE);
            boolean zB = o0VarE.B(hVarC) | o0VarE.r(fVar);
            Object objQ5 = o0VarE.q();
            if (zB || objQ5 == c2565a) {
                objQ5 = new r(hVarC, fVar, null);
                o0VarE.K(objQ5);
            }
            p3.l0.e((e23.p) objQ5, hVarC, o0VarE);
            u2.h hVarC2 = u2.i.c(o0VarE);
            boolean zB2 = o0VarE.B(hVarC2) | o0VarE.r(fVar);
            Object objQ6 = o0VarE.q();
            if (zB2 || objQ6 == c2565a) {
                objQ6 = new s(hVarC2, fVar, null);
                o0VarE.K(objQ6);
            }
            p3.l0.e((e23.p) objQ6, hVarC2, o0VarE);
            p003ji0.a aVarA = p003ji0.b.a(o0VarE);
            p003ji0.a aVarA2 = p003ji0.b.a(o0VarE);
            int intValue = n1Var.getIntValue();
            Object objQ7 = o0VarE.q();
            if (objQ7 == c2565a) {
                objQ7 = new ad.b(listK2, 9);
                o0VarE.K(objQ7);
            }
            fo.g gVar = new fo.g(p1Var, userFullName, aVar, listK, aVar2, context, listK2, h2.o0.b(intValue, (e23.a) objQ7, o0VarE, 384, 2), dVar, dVarA4, fVar, hVarC, aVarA, i0VarA, i0VarA4, dVar2, dVarA5, hVarC2, aVarA2, i0VarA2, i0VarA5, b0Var, dVarA3, i0VarA3, p1VarC);
            o0Var = o0VarE;
            z02.b.a(false, null, null, null, false, z3.f.c(779683627, gVar, o0Var), o0Var, 196608, 31);
        } else {
            o0Var = o0VarE;
            o0Var.e();
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new h82.p(fVar, kVar, aVar, i14, 12);
        }
    }
}
