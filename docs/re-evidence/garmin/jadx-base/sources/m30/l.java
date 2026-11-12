package m30;

import android.location.Location;
import android.view.View;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class l implements e23.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f116356a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ m f116357b;

    public /* synthetic */ l(m mVar, int i14) {
        this.f116356a = i14;
        this.f116357b = mVar;
    }

    @Override // e23.l
    public final Object invoke(Object obj) {
        int i14 = this.f116356a;
        m mVar = this.f116357b;
        switch (i14) {
            case 0:
                Location location = (Location) obj;
                if (!mVar.W0 || location == null) {
                    mVar.u6(mVar.f97019x, mVar.f148290a);
                } else {
                    mVar.W0 = false;
                    mVar.v6(com.garmin.android.library.mapsdkadapter.n.c(location), 15);
                }
                break;
            case 1:
                int i15 = m.f116358h1;
                ((View) obj).getClass();
                mVar.u6(mVar.f97019x, mVar.f148290a);
                break;
            default:
                int i16 = m.f116358h1;
                ((View) obj).getClass();
                mVar.u6(mVar.f97019x, mVar.f148290a);
                break;
        }
        return Unit.INSTANCE;
    }
}
