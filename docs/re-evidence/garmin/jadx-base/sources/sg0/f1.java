package sg0;

import c2.x2;
import ch.qos.logback.core.net.SyslogConstants;
import com.garmin.android.apps.connectmobile.R;
import i3.mh;
import p3.b4;
import p3.i2;
import p3.p2;
import p3.x1;

/* JADX INFO: loaded from: classes8.dex */
public final class f1 {
    public static final void a(h4.r rVar, String str, com.garmin.android.apps.connectmobile.userprofile.model.l lVar, String str2, Long l14, p3.m mVar, int i14, int i15) {
        h4.r rVar2;
        int i16;
        com.garmin.android.apps.connectmobile.userprofile.model.j profileImageUrls;
        String str3;
        p3.o0 o0VarE = mVar.E(923976646);
        int i17 = i15 & 1;
        if (i17 != 0) {
            i16 = i14 | 6;
            rVar2 = rVar;
        } else if ((i14 & 6) == 0) {
            rVar2 = rVar;
            i16 = (o0VarE.B(rVar2) ? 4 : 2) | i14;
        } else {
            rVar2 = rVar;
            i16 = i14;
        }
        if ((i14 & 48) == 0) {
            i16 |= o0VarE.B(str) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            i16 |= (i14 & 512) == 0 ? o0VarE.B(lVar) : o0VarE.r(lVar) ? 256 : 128;
        }
        if ((i14 & 3072) == 0) {
            i16 |= o0VarE.B(str2) ? 2048 : 1024;
        }
        if ((i14 & 24576) == 0) {
            i16 |= o0VarE.B(l14) ? 16384 : 8192;
        }
        if (o0VarE.n(i16 & 1, (i16 & 9363) != 9362)) {
            h4.r rVar3 = i17 != 0 ? h4.r.S : rVar2;
            x1 x1Var = p3.n.f135158a;
            h4.r rVarF = x2.f(rVar3, 1.0f);
            d92.b.f58623a.getClass();
            j92.b bVar = d92.b.f58625c;
            bVar.getClass();
            j92.e eVar = j92.b.f97899b;
            h4.r rVarC = c2.l.C(rVarF, 0.0f, eVar.f97920e, 0.0f, 0.0f, 13);
            h4.d.f81522a.getClass();
            h4.g.a aVar = h4.d.a.f81537o;
            c2.j.f22691a.getClass();
            c2.z zVarA = c2.y.a(c2.j.f22694d, aVar, o0VarE, 48);
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            h4.r rVarC2 = h4.k.c(rVarC, o0VarE);
            h5.g.V.getClass();
            h5.e0.a aVar2 = h5.g.a.f81805b;
            if (o0VarE.f135177b == null) {
                p3.p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar2);
            } else {
                o0VarE.c();
            }
            b4.c(h5.g.a.f81810g, zVarA, o0VarE);
            b4.c(h5.g.a.f81809f, i2VarA0, o0VarE);
            h5.g.a.b bVar2 = h5.g.a.f81813j;
            if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar2);
            }
            b4.c(h5.g.a.f81807d, rVarC2, o0VarE);
            c2.b0 b0Var = c2.b0.f22601a;
            String strQ = gl1.y.Q(o0VarE, R.string.lbl_profile_picture);
            float f14 = SyslogConstants.LOG_LOCAL3;
            g6.f.a aVar3 = g6.f.f75994b;
            b12.k.b(null, strQ, f14, new b12.b((lVar == null || (profileImageUrls = lVar.getProfileImageUrls()) == null || (str3 = profileImageUrls.f46879h) == null) ? str2 : str3, null, f12.u.a(l14 != null ? (int) l14.longValue() : 0), null, null, 26, null), o0VarE, (b12.b.f14385f << 9) | 384, 17);
            String str4 = str == null ? "" : str;
            d92.b.f58624b.getClass();
            s5.x0 x0VarB = d92.c.b(j92.f.f97930g, o0VarE);
            h4.r.a aVar4 = h4.r.S;
            bVar.getClass();
            mh.c(str4, c2.l.C(aVar4, 0.0f, eVar.f97920e, 0.0f, 0.0f, 13), 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, x0VarB, o0VarE, 0, 0, 131068);
            o0VarE = o0VarE;
            o0VarE.g0(true);
            rVar2 = rVar3;
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new a42.a0(rVar2, (Object) str, (Object) lVar, (Object) str2, (Object) l14, i14, i15, 25);
        }
    }
}
