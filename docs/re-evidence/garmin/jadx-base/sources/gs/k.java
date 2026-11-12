package gs;

import com.garmin.android.apps.connectmobile.activities.dashboard.PolylineView;
import java.util.List;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class k implements e23.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f78625a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ List f78626b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f78627c;

    public /* synthetic */ k(int i14, List list) {
        this.f78625a = 0;
        this.f78627c = i14;
        this.f78626b = list;
    }

    @Override // e23.l
    public final Object invoke(Object obj) {
        switch (this.f78625a) {
            case 0:
                PolylineView polylineView = (PolylineView) obj;
                polylineView.getClass();
                polylineView.c(this.f78627c, this.f78626b);
                break;
            case 1:
                com.garmin.android.library.mapsdkadapter.i iVar = (com.garmin.android.library.mapsdkadapter.i) obj;
                iVar.getClass();
                iVar.J(this.f78627c, this.f78626b);
                break;
            default:
                com.garmin.android.library.mapsdkadapter.i iVar2 = (com.garmin.android.library.mapsdkadapter.i) obj;
                iVar2.getClass();
                iVar2.f(this.f78627c, this.f78626b);
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ k(List list, int i14, int i15) {
        this.f78625a = i15;
        this.f78626b = list;
        this.f78627c = i14;
    }
}
