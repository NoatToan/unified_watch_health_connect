package fy0;

import a11.g0;
import com.garmin.android.apps.connectmobile.activities.model.ActivityListItemDTO;
import h4.r;
import p005kotlin.Unit;
import p3.n;
import p3.o0;
import p3.p2;
import p3.x1;
import ps.m;
import wg0.l;

/* JADX INFO: loaded from: classes9.dex */
public interface e {

    public static final class a {
        public static final void a(r rVar, ActivityListItemDTO activityListItemDTO, m mVar, l lVar, e23.a aVar, e eVar, p3.m mVar2, int i14) {
            int i15;
            e eVar2;
            rVar.getClass();
            aVar.getClass();
            eVar.getClass();
            o0 o0VarE = mVar2.E(-993061555);
            if ((i14 & 6) == 0) {
                i15 = (o0VarE.B(rVar) ? 4 : 2) | i14;
            } else {
                i15 = i14;
            }
            if ((i14 & 48) == 0) {
                i15 |= o0VarE.r(activityListItemDTO) ? 32 : 16;
            }
            if ((i14 & 384) == 0) {
                i15 |= (i14 & 512) == 0 ? o0VarE.B(mVar) : o0VarE.r(mVar) ? 256 : 128;
            }
            if ((i14 & 3072) == 0) {
                i15 |= (i14 & 4096) == 0 ? o0VarE.B(lVar) : o0VarE.r(lVar) ? 2048 : 1024;
            }
            if ((i14 & 24576) == 0) {
                i15 |= o0VarE.r(aVar) ? 16384 : 8192;
            }
            if ((196608 & i14) == 0) {
                eVar2 = eVar;
                i15 |= o0VarE.B(eVar2) ? 131072 : 65536;
            } else {
                eVar2 = eVar;
            }
            if (o0VarE.n(i15 & 1, (74899 & i15) != 74898)) {
                x1 x1Var = n.f135158a;
                eVar2.b(rVar, activityListItemDTO, mVar, lVar, aVar, o0VarE, (i15 & 458752) | (i15 & 126) | (m.f139904n << 6) | (i15 & 896) | (l.f185101f << 9) | (i15 & 7168) | (57344 & i15));
            } else {
                o0VarE.e();
            }
            p2 p2VarI0 = o0VarE.i0();
            if (p2VarI0 != null) {
                p2VarI0.f135219d = new g0((Object) rVar, (Object) activityListItemDTO, (Object) mVar, (Object) lVar, aVar, (Object) eVar, i14, 13);
            }
        }
    }

    void a(ActivityListItemDTO activityListItemDTO, boolean z14, e23.l<? super Boolean, Unit> lVar, p3.m mVar, int i14);

    void b(r rVar, ActivityListItemDTO activityListItemDTO, m mVar, l lVar, e23.a<Unit> aVar, p3.m mVar2, int i14);

    void c(ActivityListItemDTO activityListItemDTO, e23.l<? super Long, Unit> lVar, p3.m mVar, int i14);
}
