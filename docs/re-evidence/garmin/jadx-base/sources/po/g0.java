package po;

import am.x0;
import com.garmin.android.apps.connectmobile.activities.map.ActivityMapActivity;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class g0 implements com.garmin.android.library.mapsdkadapter.i.m, com.garmin.android.library.mapsdkadapter.i.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ h0 f138840a;

    public /* synthetic */ g0(h0 h0Var) {
        this.f138840a = h0Var;
    }

    @Override // com.garmin.android.library.mapsdkadapter.i.m
    public boolean O2(ie2.j jVar) {
        int i14 = h0.f138889m;
        h0 h0Var = this.f138840a;
        ActivityMapActivity.pa(h0Var.getActivity(), h0Var.f138998e.C() == x0.C ? os.b.ACTIVITY_MULTISPORT_MAP : os.b.ACTIVITY_LAPS_MAP, h0Var.f138998e);
        return true;
    }

    @Override // com.garmin.android.library.mapsdkadapter.i.j
    public void X(com.garmin.android.library.mapsdkadapter.f fVar) {
        int i14 = h0.f138889m;
        h0 h0Var = this.f138840a;
        ActivityMapActivity.pa(h0Var.getActivity(), h0Var.f138998e.C() == x0.C ? os.b.ACTIVITY_MULTISPORT_MAP : os.b.ACTIVITY_LAPS_MAP, h0Var.f138998e);
    }
}
