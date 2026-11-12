package c62;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class g2 implements l52.u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f24743a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ArrayList f24744b;

    public /* synthetic */ g2(int i14, ArrayList arrayList) {
        this.f24743a = i14;
        this.f24744b = arrayList;
    }

    @Override // l52.u
    public final void o(l52.i.a aVar) {
        int i14 = this.f24743a;
        ArrayList arrayList = this.f24744b;
        switch (i14) {
            case 0:
                if (aVar.k()) {
                    com.garmin.android.apps.connectmobile.workouts.data.model.j0 j0Var = (com.garmin.android.apps.connectmobile.workouts.data.model.j0) aVar.getData();
                    String str = j0Var.H0;
                    String strG = j0Var.g();
                    if (str != null && strG != null) {
                        arrayList.add(new com.garmin.android.apps.connectmobile.workouts.data.model.m(str, strG));
                        break;
                    }
                }
                break;
            default:
                com.garmin.android.apps.connectmobile.workouts.data.model.h0.a aVar2 = com.garmin.android.apps.connectmobile.workouts.data.model.h0.f48185j;
                String strG2 = ((com.garmin.android.apps.connectmobile.workouts.data.model.j0) aVar.getData()).g();
                if (strG2 != null) {
                    arrayList.add(new o13.p(strG2, Boolean.FALSE));
                }
                break;
        }
    }
}
