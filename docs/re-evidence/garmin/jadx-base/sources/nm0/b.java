package nm0;

import com.garmin.android.apps.connectmobile.g3;
import com.garmin.android.apps.connectmobile.group.service.model.GroupDetailsDTO;
import e23.l;
import lc.u0;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class b implements l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f126547a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d f126548b;

    public /* synthetic */ b(d dVar, int i14) {
        this.f126547a = i14;
        this.f126548b = dVar;
    }

    @Override // e23.l
    public final Object invoke(Object obj) {
        switch (this.f126547a) {
            case 0:
                g3 g3Var = (g3) obj;
                g3Var.getClass();
                int i14 = d.a.f126569a[g3Var.f35300a.ordinal()];
                d dVar = this.f126548b;
                if (i14 == 1) {
                    dVar.T6();
                } else if (i14 == 2) {
                    dVar.requireActivity().invalidateOptionsMenu();
                    dVar.M6();
                } else {
                    if (i14 != 3) {
                        u0.r();
                        return null;
                    }
                    dVar.M6();
                    g22.e.c(dVar);
                }
                return Unit.INSTANCE;
            default:
                GroupDetailsDTO groupDetailsDTO = (GroupDetailsDTO) obj;
                groupDetailsDTO.getClass();
                this.f126548b.U6(groupDetailsDTO);
                return Unit.INSTANCE;
        }
    }
}
