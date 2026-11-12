package wl0;

import androidx.lifecycle.z0;
import com.garmin.android.apps.connectmobile.golf.truswing.model.SwingDTO;
import com.garmin.android.apps.connectmobile.golf.truswing.model.SwingSessionDTO;
import com.garmin.android.apps.connectmobile.v2;
import java.util.ArrayList;
import java.util.List;
import org.joda.time.DateTime;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class h0 implements z0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f185935a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.garmin.android.apps.connectmobile.golf.truswing.i f185936b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ List f185937c;

    public /* synthetic */ h0(com.garmin.android.apps.connectmobile.golf.truswing.i iVar, List list, int i14) {
        this.f185935a = i14;
        this.f185936b = iVar;
        this.f185937c = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.lifecycle.z0
    public final void onChanged(Object obj) {
        v2 v2Var = (v2) obj;
        switch (this.f185935a) {
            case 0:
                boolean z14 = v2Var instanceof v2.b;
                com.garmin.android.apps.connectmobile.golf.truswing.i iVar = this.f185936b;
                if (z14) {
                    for (SwingSessionDTO swingSessionDTO : ((com.garmin.android.apps.connectmobile.golf.truswing.model.m) ((v2.b) v2Var).f47386a).f35980a) {
                        if (DateTime.now().withTimeAtStartOfDay().equals(new DateTime(swingSessionDTO.f35885d).withTimeAtStartOfDay())) {
                            iVar.P = swingSessionDTO.f35882a;
                        }
                    }
                }
                com.garmin.android.apps.connectmobile.golf.truswing.c cVar = iVar.T;
                long j8 = iVar.P;
                cVar.getClass();
                androidx.lifecycle.m.a(null, new n(cVar, j8, null), 3).f(iVar, new h0(iVar, this.f185937c, 1));
                break;
            default:
                boolean z15 = v2Var instanceof v2.b;
                com.garmin.android.apps.connectmobile.golf.truswing.i iVar2 = this.f185936b;
                List<SwingDTO> list = this.f185937c;
                if (z15) {
                    SwingSessionDTO swingSessionDTO2 = (SwingSessionDTO) ((v2.b) v2Var).f47386a;
                    if (iVar2.isAdded()) {
                        qd2.a.b().i(qd2.a.b.GOLF_SWING_LIST);
                        ArrayList arrayList = new ArrayList();
                        arrayList.addAll(swingSessionDTO2.f35888g);
                        if (list != null) {
                            for (int i14 = 0; i14 < list.size(); i14++) {
                                if (!arrayList.contains(list.get(i14))) {
                                    arrayList.add(list.get(i14));
                                }
                            }
                        }
                        iVar2.o7(arrayList);
                        SwingSessionDTO swingSessionDTO3 = iVar2.f35804z;
                        swingSessionDTO3.f35887f = swingSessionDTO2.f35887f;
                        iVar2.f35804z = swingSessionDTO3;
                        iVar2.i7();
                        iVar2.g7();
                        iVar2.e7();
                        iVar2.h7();
                        break;
                    }
                } else if (iVar2.isAdded()) {
                    iVar2.o7(list);
                    iVar2.e7();
                    break;
                }
                break;
        }
    }
}
