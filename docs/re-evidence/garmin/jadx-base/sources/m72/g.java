package m72;

import com.garmin.android.apps.connectmobile.R;
import com.garmin.proto.generated.GDIInReachMessaging;
import com.mapbox.maps.extension.compose.style.standard.StandardStyleConfigurationState;
import l72.h3;
import l72.i3;
import p13.w;
import p3.o0;
import p3.p2;
import p3.x1;

/* JADX INFO: loaded from: classes9.dex */
public final class g {
    /* JADX WARN: Code duplicated, block: B:48:0x00f5  */
    public static final void a(String str, e23.a aVar, e23.a aVar2, u4.d dVar, e23.a aVar3, p3.m mVar, int i14) {
        o0 o0Var;
        int i15;
        q13.b bVar;
        u4.d dVarA;
        o0 o0VarL = vb.h.l(1421598012, aVar2, str, mVar);
        int i16 = i14 | (o0VarL.B(str) ? 4 : 2) | (o0VarL.r(aVar) ? 32 : 16) | (o0VarL.r(aVar2) ? 256 : 128) | (o0VarL.B(dVar) ? 2048 : 1024) | (o0VarL.r(aVar3) ? 16384 : 8192);
        boolean z14 = false;
        if (o0VarL.n(i16 & 1, (i16 & 9363) != 9362)) {
            x1 x1Var = p3.n.f135158a;
            o0VarL.C(356096974);
            q13.b bVarB = w.b();
            if (dVar == null || aVar3 == null) {
                i15 = i16;
                bVar = bVarB;
            } else {
                i15 = i16;
                bVar = bVarB;
                bVar.add(new i3("settings", "", false, dVar, "Example settings", 4, (p005kotlin.jvm.internal.j) null));
            }
            u4.d.b bVar2 = u4.d.f168373k;
            bVar.add(new i3(StandardStyleConfigurationState.CONFIG_THEME, "", false, n5.e.b(R.drawable.ic_palette_24dp, o0VarL, 6), (String) null, 20, (p005kotlin.jvm.internal.j) null));
            q13.b bVarA = w.a(bVar);
            o0VarL.g0(z14);
            i53.c cVarE = i53.a.e(bVarA);
            if (aVar != null) {
                s62.a.f157643a.getClass();
                dVarA = v62.o.a(t62.b.f162798a);
            } else {
                dVarA = null;
            }
            boolean z15 = ((i15 & 896) == 256 ? true : z14) | ((i15 & 57344) == 16384);
            Object objQ = o0VarL.q();
            if (z15) {
                objQ = new d52.m(aVar2, aVar3, 2);
                o0VarL.K(objQ);
            } else {
                p3.m.f135153a.getClass();
                if (objQ == p3.m.a.f135155b) {
                    objQ = new d52.m(aVar2, aVar3, 2);
                    o0VarL.K(objQ);
                }
            }
            o0Var = o0VarL;
            h3.f(dVarA, str, null, null, aVar, cVarE, null, (e23.l) objQ, null, o0Var, (57344 & (i15 << 9)) | ((i15 << 3) & 112) | GDIInReachMessaging.Capabilities.MessagingCapability.PLAN_CHANGE_VALUE, 332);
        } else {
            o0Var = o0VarL;
            o0Var.e();
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new b(str, aVar, aVar2, dVar, aVar3, i14);
        }
    }
}
