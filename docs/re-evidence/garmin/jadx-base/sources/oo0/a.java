package oo0;

import android.content.Context;
import android.text.format.DateFormat;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import c2.b0;
import c2.j;
import c2.l;
import c2.y;
import c2.z;
import com.garmin.android.apps.connectmobile.R;
import h4.k;
import h4.r;
import h5.e0;
import i3.e5;
import i3.mh;
import java.util.Iterator;
import java.util.List;
import l72.p2;
import p005kotlin.jvm.internal.s;
import p3.b4;
import p3.i2;
import p3.m;
import p3.n;
import p3.o0;
import p3.p0;
import p3.x1;

/* JADX INFO: loaded from: classes8.dex */
public final class a {
    public static final void a(List list, m mVar, int i14) {
        int i15;
        int i16;
        o0 o0VarE = mVar.E(1625585551);
        int i17 = i14 | (o0VarE.r(list) ? 4 : 2);
        if (o0VarE.n(i17 & 1, (i17 & 3) != 2)) {
            x1 x1Var = n.f135158a;
            Context context = (Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b);
            mo0.a aVar = new mo0.a(context);
            if (list.isEmpty()) {
                o0VarE.C(2064607571);
                o0VarE.g0(false);
            } else {
                o0VarE.C(2063118982);
                r.a aVar2 = r.S;
                d92.b.f58623a.getClass();
                j92.b bVar = d92.b.f58625c;
                bVar.getClass();
                j92.e eVar = j92.b.f97899b;
                r rVarC = l.C(aVar2, 0.0f, eVar.f97920e, 0.0f, 0.0f, 13);
                j.f22691a.getClass();
                j.k kVar = j.f22694d;
                h4.d.f81522a.getClass();
                z zVarA = y.a(kVar, h4.d.a.f81536n, o0VarE, 0);
                int iHashCode = Long.hashCode(o0VarE.U);
                i2 i2VarA0 = o0VarE.a0();
                r rVarC2 = k.c(rVarC, o0VarE);
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
                h5.g.a.b bVar2 = h5.g.a.f81813j;
                if (o0VarE.T || !s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                    v.h.A(iHashCode, o0VarE, iHashCode, bVar2);
                }
                b4.c(h5.g.a.f81807d, rVarC2, o0VarE);
                b0 b0Var = b0.f22601a;
                bVar.getClass();
                float f14 = eVar.f97920e;
                bVar.getClass();
                float f15 = eVar.f97920e;
                bVar.getClass();
                r rVarC3 = l.C(aVar2, f14, 0.0f, f15, eVar.f97917b, 2);
                if (list.size() == 1) {
                    i15 = -461866058;
                    i16 = R.string.device_settings_abnormal_heart_rate;
                } else {
                    i15 = -461752753;
                    i16 = R.string.device_settings_abnormal_heart_rate_alerts;
                }
                String strJ = com.airbnb.lottie.animation.keyframe.a.j(o0VarE, i15, i16, o0VarE, false);
                d92.b.f58624b.getClass();
                mh.c(strJ, rVarC3, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.f(j92.f.f97933j, o0VarE), o0VarE, 0, 0, 131068);
                o0VarE = o0VarE;
                o0VarE.C(1232038214);
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    co0.a aVar4 = (co0.a) it.next();
                    p2.f111205a.g(new yz.k(DateFormat.is24HourFormat(aVar.f119868a)).a(aVar4.f28119b), null, null, null, z3.f.c(-640722288, new ho2.n(gl1.y.P(R.string.devices_lbl_bpm_with_format, new Object[]{String.valueOf(aVar4.f28118a)}, o0VarE), context), o0VarE), false, false, null, o0VarE, 24576, 494);
                }
                e5.u(o0VarE, false, true, false);
            }
            x1 x1Var2 = n.f135158a;
        } else {
            o0VarE.e();
        }
        p3.p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new a31.b(list, i14, 16);
        }
    }
}
