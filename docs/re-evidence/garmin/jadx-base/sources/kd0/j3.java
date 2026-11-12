package kd0;

import com.garmin.android.apps.connectmobile.devices.model.DeviceSettingsDTO;
import java.util.Iterator;
import java.util.List;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lkd0/j3;", "Lmn0/p;", "<init>", "()V", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class j3 implements mn0.p {
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // mn0.p
    public final Object a(long j8, v13.c cVar) {
        h3 h3Var;
        if (cVar instanceof h3) {
            h3Var = (h3) cVar;
            int i14 = h3Var.f104101c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                h3Var.f104101c = i14 - Integer.MIN_VALUE;
            } else {
                h3Var = new h3(this, cVar);
            }
        } else {
            h3Var = new h3(this, cVar);
        }
        Object objJ = h3Var.f104099a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = h3Var.f104101c;
        if (i15 == 0) {
            o13.r.b(objJ);
            iw.a aVarA = iw.a.C1823a.a(iw.a.f95249b);
            h3Var.f104101c = 1;
            objJ = com.garmin.android.apps.connectmobile.f0.J(aVarA, new iw.b(aVarA, j8, null), h3Var);
            if (objJ == aVar) {
                return aVar;
            }
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(objJ);
        }
        com.garmin.android.apps.connectmobile.v2 v2Var = (com.garmin.android.apps.connectmobile.v2) objJ;
        if (v2Var instanceof com.garmin.android.apps.connectmobile.v2.b) {
            DeviceSettingsDTO deviceSettingsDTO = (DeviceSettingsDTO) ((com.garmin.android.apps.connectmobile.v2.b) v2Var).f47386a;
            int i16 = o13.q.f128596b;
            com.garmin.android.apps.connectmobile.devices.model.h hVar = deviceSettingsDTO.f33885m;
            return new in0.f(hVar != null ? hVar.m() : null, deviceSettingsDTO.K0);
        }
        if (v2Var instanceof com.garmin.android.apps.connectmobile.v2.a) {
            int i17 = o13.q.f128596b;
            return o13.r.a(((com.garmin.android.apps.connectmobile.v2.a) v2Var).f47383a);
        }
        lc.u0.r();
        return null;
    }

    @Override // mn0.p
    public final void b(nk0.l lVar, p3.m mVar, int i14) {
        p3.o0 o0VarE = mVar.E(-1445271713);
        int i15 = (o0VarE.r(lVar) ? 4 : 2) | i14;
        if (o0VarE.n(i15 & 1, (i15 & 3) != 2)) {
            p3.x1 x1Var = p3.n.f135158a;
            t70.s0.d(null, lVar, o0VarE, (i15 << 3) & 112);
        } else {
            o0VarE.e();
        }
        p3.p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new k41.e(this, lVar, i14, 9);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // mn0.p
    public final Object c(v13.c cVar) {
        i3 i3Var;
        j70.c dailyStatsConfig;
        if (cVar instanceof i3) {
            i3Var = (i3) cVar;
            int i14 = i3Var.f104119c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                i3Var.f104119c = i14 - Integer.MIN_VALUE;
            } else {
                i3Var = new i3(this, cVar);
            }
        } else {
            i3Var = new i3(this, cVar);
        }
        Object objY = i3Var.f104117a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = i3Var.f104119c;
        boolean z14 = true;
        List<j70.b> listG = null;
        if (i15 == 0) {
            o13.r.b(objY);
            r53.i<j70.f> iVarP = ((com.garmin.android.apps.connectmobile.dashboard.data.datasource.l0) KoinJavaComponent.get$default(com.garmin.android.apps.connectmobile.dashboard.data.datasource.l0.class, null, null, 6, null)).p();
            i3Var.f104119c = 1;
            objY = r53.s.y(iVarP, i3Var);
            if (objY == aVar) {
                return aVar;
            }
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(objY);
        }
        j70.f fVar = (j70.f) objY;
        if (fVar != null && (dailyStatsConfig = fVar.getDailyStatsConfig()) != null) {
            listG = dailyStatsConfig.g();
        }
        if (listG == null || listG.isEmpty()) {
            z14 = false;
        } else {
            Iterator<T> it = listG.iterator();
            while (it.hasNext()) {
                if (p005kotlin.jvm.internal.s.g(((j70.b) it.next()).getCardType(), o70.t.f130076t.f130082a)) {
                }
            }
            z14 = false;
        }
        return Boolean.valueOf(z14);
    }

    @Override // mn0.p
    public final g3 d() {
        return new g3();
    }
}
