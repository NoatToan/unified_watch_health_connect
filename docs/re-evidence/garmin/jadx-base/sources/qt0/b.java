package qt0;

import android.widget.Toast;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.g3;
import com.garmin.android.apps.connectmobile.leaderboard.model.ConnectionLeaderBoardDTO;
import com.garmin.android.apps.connectmobile.leaderboard.model.MetricsMapDTO;
import e23.l;
import g22.f;
import java.util.ArrayList;
import java.util.Iterator;
import lc.u0;
import mt0.k4;
import p005kotlin.Unit;
import p13.y;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class b implements l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f147463a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c f147464b;

    public /* synthetic */ b(c cVar, int i14) {
        this.f147463a = i14;
        this.f147464b = cVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // e23.l
    public final Object invoke(Object obj) {
        ArrayList arrayList;
        ArrayList arrayList2;
        switch (this.f147463a) {
            case 0:
                g3 g3Var = (g3) obj;
                int i14 = c.a.f147469a[g3Var.f35300a.ordinal()];
                c cVar = this.f147464b;
                if (i14 == 1) {
                    cVar.F6();
                    T t7 = g3Var.f35301b;
                    t7.getClass();
                    ConnectionLeaderBoardDTO connectionLeaderBoardDTO = (ConnectionLeaderBoardDTO) t7;
                    cVar.A = connectionLeaderBoardDTO;
                    MetricsMapDTO[] metricsMapDTOArr = connectionLeaderBoardDTO.f38024d;
                    if (metricsMapDTOArr != null) {
                        arrayList = new ArrayList(metricsMapDTOArr.length);
                        for (MetricsMapDTO metricsMapDTO : metricsMapDTOArr) {
                            arrayList.add(metricsMapDTO.f38035c);
                        }
                    } else {
                        arrayList = null;
                    }
                    if (arrayList != null) {
                        arrayList2 = new ArrayList(y.r(arrayList, 10));
                        Iterator it = arrayList.iterator();
                        while (it.hasNext()) {
                            arrayList2.add(Integer.valueOf((int) ((com.garmin.android.apps.connectmobile.connections.model.c) it.next()).f31695a));
                        }
                    } else {
                        arrayList2 = null;
                    }
                    if (arrayList2 == null || arrayList2.isEmpty()) {
                        cVar.c7();
                        cVar.d7();
                    } else {
                        ge1.b.T(f.b(cVar), null, null, new d(arrayList, cVar, arrayList2, null), 3);
                    }
                } else if (i14 == 2) {
                    cVar.F6();
                    Toast.makeText(cVar.getContext(), cVar.getString(R.string.txt_error_occurred), 0).show();
                    cVar.J6(false);
                } else {
                    if (i14 != 3) {
                        u0.r();
                        return null;
                    }
                    cVar.S6();
                }
                return Unit.INSTANCE;
            default:
                ((k4) obj).getClass();
                c cVar2 = this.f147464b;
                cVar2.U6().f(cVar2.getViewLifecycleOwner(), new c.b(new b(cVar2, 0)));
                return Unit.INSTANCE;
        }
    }
}
