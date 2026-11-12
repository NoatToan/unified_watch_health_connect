package po;

import com.garmin.android.apps.connectmobile.activities.map.ActivityMapActivity;
import java.util.List;
import ps.d1;
import yr.o0;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class e0 implements com.garmin.android.library.mapsdkadapter.i.m, com.garmin.android.library.mapsdkadapter.i.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ f0 f138832a;

    @Override // com.garmin.android.library.mapsdkadapter.i.m
    public boolean O2(ie2.j jVar) {
        f0.a aVar = f0.f138835p;
        f0 f0Var = this.f138832a;
        androidx.fragment.app.m activity = f0Var.getActivity();
        com.garmin.android.apps.connectmobile.activities.newmodel.h hVar = f0Var.f138998e;
        List<d1> list = f0Var.f138836n;
        d1[] d1VarArr = list != null ? (d1[]) list.toArray(new d1[0]) : null;
        int i14 = ActivityMapActivity.f29218k0;
        os.b bVar = os.b.ACTIVITY_MULTISPORT_MAP;
        long j8 = hVar.f29448a;
        Boolean bool = Boolean.FALSE;
        ActivityMapActivity.la(activity, bVar, hVar, j8, false, false, d1VarArr, null, bool, bool, null, null);
        return true;
    }

    @Override // com.garmin.android.library.mapsdkadapter.i.j
    public void X(com.garmin.android.library.mapsdkadapter.f fVar) {
        f0.a aVar = f0.f138835p;
        f0 f0Var = this.f138832a;
        o0 o0Var = f0Var.f138837o;
        if (o0Var != null) {
            o0Var.invoke();
        }
        androidx.fragment.app.m activity = f0Var.getActivity();
        com.garmin.android.apps.connectmobile.activities.newmodel.h hVar = f0Var.f138998e;
        List<d1> list = f0Var.f138836n;
        d1[] d1VarArr = list != null ? (d1[]) list.toArray(new d1[0]) : null;
        int i14 = ActivityMapActivity.f29218k0;
        os.b bVar = os.b.ACTIVITY_MULTISPORT_MAP;
        long j8 = hVar.f29448a;
        Boolean bool = Boolean.FALSE;
        ActivityMapActivity.la(activity, bVar, hVar, j8, false, false, d1VarArr, null, bool, bool, null, null);
    }
}
