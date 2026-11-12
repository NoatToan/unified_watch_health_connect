package y22;

import android.content.Context;
import android.net.Uri;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.core.content.FileProvider;
import com.garmin.android.apps.connectmobile.R;
import com.google.accompanist.permissions.PermissionState;
import com.google.accompanist.permissions.PermissionStateKt;
import cw1.k0;
import java.io.File;
import java.util.List;
import l72.c1;
import o72.z2;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.r0;
import p3.o0;
import p3.p1;
import p3.p2;
import p3.x1;

/* JADX INFO: loaded from: classes10.dex */
public final class e {
    public static final void a(e23.a aVar, int i14, p3.m mVar, int i15) {
        String strJ;
        aVar.getClass();
        o0 o0VarE = mVar.E(291120945);
        int i16 = (o0VarE.k(i14) ? 4 : 2) | i15;
        if (o0VarE.n(i16 & 1, (i16 & 19) != 18)) {
            x1 x1Var = p3.n.f135158a;
            if (i14 > 1) {
                o0VarE.C(1245215767);
                strJ = gl1.y.P(R.string.message_reached_maximum_photos_plural, new Object[]{Integer.valueOf(i14)}, o0VarE);
                o0VarE.g0(false);
            } else {
                strJ = com.airbnb.lottie.animation.keyframe.a.j(o0VarE, 1245310410, R.string.message_reached_maximum_photos, o0VarE, false);
            }
            c1.f110940a.a(false, gl1.y.Q(o0VarE, R.string.social_group_photo_limit_reached), strJ, null, null, gl1.y.Q(o0VarE, R.string.lbl_ok), false, false, aVar, null, aVar, o0VarE, 100663296, 6, 729);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new at1.c(i14, i15, 20, aVar);
        }
    }

    public static final void b(String str, e23.a<Unit> aVar, e23.a<Unit> aVar2, p3.m mVar, int i14) {
        o0 o0VarE = mVar.E(-118906546);
        int i15 = i14 | (o0VarE.B(str) ? 4 : 2) | (o0VarE.r(aVar) ? 32 : 16) | (o0VarE.r(aVar2) ? 256 : 128);
        if (o0VarE.n(i15 & 1, (i15 & 147) != 146)) {
            x1 x1Var = p3.n.f135158a;
            c1.f110940a.a(false, null, str, null, null, gl1.y.Q(o0VarE, R.string.lbl_settings), false, false, aVar, gl1.y.Q(o0VarE, R.string.lbl_close), aVar2, o0VarE, ((i15 << 6) & 896) | ((i15 << 21) & 234881024), (i15 >> 6) & 14, 219);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new gt1.t(str, aVar, aVar2, i14, 8);
        }
    }

    public static final Uri c(Context context) {
        h23.c.f81216a.getClass();
        Uri uriD = FileProvider.d(context, "GarminConnectMobileApp.provider", File.createTempFile(am.j.h(h23.c.f81217b.b(), "camera_image"), ".jpg", context.getCacheDir()));
        uriD.getClass();
        return uriD;
    }

    public static final void d(int i14, c.q<f.j, List<Uri>> qVar, c.q<f.j, Uri> qVar2) {
        if (i14 > 1) {
            qVar.a(f.k.a(g.e.d.f74074a, i14, 12), null);
        } else {
            qVar2.a(f.k.a(g.e.d.f74074a, 0, 14), null);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final ug2.k e(e23.l lVar, p3.m mVar) {
        lVar.getClass();
        x1 x1Var = p3.n.f135158a;
        Context context = (Context) mVar.A(AndroidCompositionLocals_androidKt.f6042b);
        r0 r0Var = new r0();
        c.q qVarC = c.w.c(new g.j(), new r72.m(r0Var, lVar, 4), mVar, 0);
        Object[] objArr = new Object[0];
        Object objQ = mVar.q();
        p3.m.f135153a.getClass();
        Object obj = p3.m.a.f135155b;
        if (objQ == obj) {
            objQ = new xh0.d(17);
            mVar.K(objQ);
        }
        p1 p1Var = (p1) d4.a.e(objArr, (e23.a) objQ, mVar, 48);
        PermissionState permissionStateRememberPermissionState = PermissionStateKt.rememberPermissionState("android.permission.CAMERA", new wv0.h(context, qVarC, r0Var, p1Var, 9), mVar, 6, 0);
        if (((Boolean) p1Var.getF182175a()).booleanValue()) {
            mVar.C(292806727);
            String strQ = gl1.y.Q(mVar, R.string.social_camera_permission_denied_msg);
            boolean zR = mVar.r(context) | mVar.B(p1Var);
            Object objQ2 = mVar.q();
            if (zR || objQ2 == obj) {
                objQ2 = new z2(context, p1Var, 20);
                mVar.K(objQ2);
            }
            e23.a aVar = (e23.a) objQ2;
            boolean zB = mVar.B(p1Var);
            Object objQ3 = mVar.q();
            if (zB || objQ3 == obj) {
                objQ3 = new x91.d(p1Var, 18);
                mVar.K(objQ3);
            }
            b(strQ, aVar, (e23.a) objQ3, mVar, 0);
            mVar.f();
        } else {
            mVar.C(293290110);
            mVar.f();
        }
        return new ug2.k(permissionStateRememberPermissionState, context, qVarC, r0Var, 21);
    }

    /* JADX WARN: Code duplicated, block: B:11:0x004e  */
    /* JADX WARN: Code duplicated, block: B:6:0x0025  */
    /* JADX WARN: Multi-variable type inference failed */
    public static final e23.a f(e23.l lVar, p3.m mVar, int i14, int i15) {
        lVar.getClass();
        x1 x1Var = p3.n.f135158a;
        Context context = (Context) mVar.A(AndroidCompositionLocals_androidKt.f6042b);
        g.e eVar = new g.e();
        boolean zB = mVar.B(lVar);
        Object objQ = mVar.q();
        p3.m.a aVar = p3.m.f135153a;
        if (zB) {
            objQ = new wr1.d(lVar, 8);
            mVar.K(objQ);
        } else {
            aVar.getClass();
            if (objQ == p3.m.a.f135155b) {
                objQ = new wr1.d(lVar, 8);
                mVar.K(objQ);
            }
        }
        Object objC = c.w.c(eVar, (e23.l) objQ, mVar, 0);
        g.d dVar = new g.d(0, 1, null);
        boolean zB2 = mVar.B(lVar);
        Object objQ2 = mVar.q();
        if (zB2) {
            objQ2 = new wr1.d(lVar, 9);
            mVar.K(objQ2);
        } else {
            aVar.getClass();
            if (objQ2 == p3.m.a.f135155b) {
                objQ2 = new wr1.d(lVar, 9);
                mVar.K(objQ2);
            }
        }
        Object objC2 = c.w.c(dVar, (e23.l) objQ2, mVar, 0);
        Object[] objArr = new Object[0];
        Object objQ3 = mVar.q();
        aVar.getClass();
        Object obj = p3.m.a.f135155b;
        if (objQ3 == obj) {
            objQ3 = new xh0.d(18);
            mVar.K(objQ3);
        }
        p1 p1Var = (p1) d4.a.e(objArr, (e23.a) objQ3, mVar, 48);
        int i16 = (i15 & 14) ^ 6;
        boolean zR = ((i16 > 4 && mVar.k(i14)) || (i15 & 6) == 4) | mVar.r(objC2) | mVar.r(objC) | mVar.B(p1Var);
        Object objQ4 = mVar.q();
        if (zR || objQ4 == obj) {
            Object k0Var = new k0(i14, objC2, objC, p1Var, 16);
            mVar.K(k0Var);
            objQ4 = k0Var;
        }
        Object objRememberPermissionState = PermissionStateKt.rememberPermissionState("android.permission.READ_EXTERNAL_STORAGE", (e23.l) objQ4, mVar, 6, 0);
        if (((Boolean) p1Var.getF182175a()).booleanValue()) {
            mVar.C(-346965111);
            String strQ = gl1.y.Q(mVar, R.string.social_no_photos_access_message);
            boolean zR2 = mVar.r(context) | mVar.B(p1Var);
            Object objQ5 = mVar.q();
            if (zR2 || objQ5 == obj) {
                objQ5 = new z2(context, p1Var, 19);
                mVar.K(objQ5);
            }
            e23.a aVar2 = (e23.a) objQ5;
            boolean zB3 = mVar.B(p1Var);
            Object objQ6 = mVar.q();
            if (zB3 || objQ6 == obj) {
                objQ6 = new x91.d(p1Var, 17);
                mVar.K(objQ6);
            }
            b(strQ, aVar2, (e23.a) objQ6, mVar, 0);
            mVar.f();
        } else {
            mVar.C(-346485572);
            mVar.f();
        }
        boolean zR3 = mVar.r(objC2) | ((i16 > 4 && mVar.k(i14)) || (i15 & 6) == 4) | mVar.r(objC) | mVar.B(objRememberPermissionState);
        Object objQ7 = mVar.q();
        if (zR3 || objQ7 == obj) {
            Object kVar = new b21.k(i14, objC2, objC, objRememberPermissionState, 12);
            mVar.K(kVar);
            objQ7 = kVar;
        }
        return (e23.a) objQ7;
    }
}
