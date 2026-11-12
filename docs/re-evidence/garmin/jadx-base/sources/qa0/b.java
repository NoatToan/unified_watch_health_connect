package qa0;

import com.garmin.android.apps.connectmobile.R;
import da0.p;
import e23.l;
import gl1.y;
import java.util.List;
import p3.m;
import p3.n;
import p3.o0;
import p3.p2;
import p3.x1;

/* JADX INFO: loaded from: classes8.dex */
public final class b {
    public static final void a(List list, e23.a aVar, l lVar, m mVar, int i14) {
        o0 o0Var;
        e23.a aVar2 = aVar;
        list.getClass();
        lVar.getClass();
        aVar2.getClass();
        o0 o0VarE = mVar.E(932925549);
        int i15 = i14 | (o0VarE.r(list) ? 4 : 2) | (o0VarE.r(lVar) ? 32 : 16) | (o0VarE.r(aVar2) ? 256 : 128);
        if (o0VarE.n(i15 & 1, (i15 & 147) != 146)) {
            x1 x1Var = n.f135158a;
            o0Var = o0VarE;
            p.b("device_migration_browse_all_backups_screen", y.Q(o0VarE, R.string.lbl_device_settings_device_backup), null, null, null, null, null, false, null, null, false, null, null, false, false, aVar, null, null, null, null, null, z3.f.c(2036217197, new c82.e(list, lVar, 4), o0VarE), o0Var, 6, (i15 << 9) & 458752, 384, 4161532);
            aVar2 = aVar;
        } else {
            o0Var = o0VarE;
            o0Var.e();
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new a(list, lVar, aVar2, i14);
        }
    }
}
