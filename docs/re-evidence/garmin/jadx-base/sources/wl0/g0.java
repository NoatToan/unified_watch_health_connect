package wl0;

import androidx.lifecycle.z0;
import com.garmin.android.apps.connectmobile.v2;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class g0 implements z0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f185923a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.garmin.android.apps.connectmobile.golf.truswing.i f185924b;

    public /* synthetic */ g0(com.garmin.android.apps.connectmobile.golf.truswing.i iVar, int i14) {
        this.f185923a = i14;
        this.f185924b = iVar;
    }

    @Override // androidx.lifecycle.z0
    public final void onChanged(Object obj) {
        switch (this.f185923a) {
            case 0:
                List list = (List) obj;
                com.garmin.android.apps.connectmobile.golf.truswing.i iVar = this.f185924b;
                long j8 = iVar.P;
                if (j8 <= 0) {
                    qd2.a.b().i(qd2.a.b.GOLF_SWING_LIST);
                    com.garmin.android.apps.connectmobile.golf.truswing.c cVar = iVar.T;
                    cVar.getClass();
                    androidx.lifecycle.m.a(null, new o(cVar, null), 3).f(iVar, new h0(iVar, list, 0));
                } else {
                    com.garmin.android.apps.connectmobile.golf.truswing.c cVar2 = iVar.T;
                    cVar2.getClass();
                    androidx.lifecycle.m.a(null, new n(cVar2, j8, null), 3).f(iVar, new h0(iVar, list, 1));
                }
                break;
            default:
                com.garmin.android.apps.connectmobile.golf.truswing.i.n7(this.f185924b, (v2) obj);
                break;
        }
    }
}
