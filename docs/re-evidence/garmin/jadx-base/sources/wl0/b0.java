package wl0;

import com.garmin.android.apps.connectmobile.golf.truswing.SwingDetailsActivity;
import com.garmin.android.apps.connectmobile.golf.truswing.model.SwingDTO;
import com.garmin.android.apps.connectmobile.q1;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class b0 implements q1.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f185897a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ SwingDetailsActivity f185898b;

    public /* synthetic */ b0(SwingDetailsActivity swingDetailsActivity, int i14) {
        this.f185897a = i14;
        this.f185898b = swingDetailsActivity;
    }

    @Override // com.garmin.android.apps.connectmobile.q1.a
    public final void g(boolean z14) {
        int i14 = this.f185897a;
        SwingDetailsActivity swingDetailsActivity = this.f185898b;
        switch (i14) {
            case 0:
                int i15 = SwingDetailsActivity.f35774o;
                if (z14) {
                    swingDetailsActivity.showProgressOverlay();
                    cl0.a aVarE = cl0.a.e();
                    SwingDTO swingDTO = swingDetailsActivity.f35776b;
                    aVarE.getClass();
                    boolean zC = cl0.a.c(swingDTO);
                    com.garmin.android.apps.connectmobile.golf.truswing.c cVar = swingDetailsActivity.f35787m;
                    long j8 = swingDetailsActivity.f35776b.f35872a;
                    cVar.getClass();
                    androidx.lifecycle.m.a(null, new k(cVar, j8, null), 3).f(swingDetailsActivity, new c(swingDetailsActivity, zC, 1));
                }
                break;
            default:
                swingDetailsActivity.f35786l.dismiss();
                break;
        }
    }
}
