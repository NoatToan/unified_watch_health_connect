package wl0;

import android.text.TextUtils;
import android.widget.TextView;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.golf.truswing.SwingDetailsActivity;
import com.garmin.android.apps.connectmobile.golf.truswing.model.SwingDTO;
import java.util.Observable;
import java.util.Observer;

/* JADX INFO: loaded from: classes8.dex */
public class z implements Observer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public SwingDetailsActivity f186013a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public a f186014b;

    public class a extends g22.c<Void, t> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ hc2.b f186015c;

        public a(hc2.b bVar) {
            this.f186015c = bVar;
        }

        @Override // g22.c
        public final t b(Void[] voidArr) throws Throwable {
            hc2.b bVar;
            String str;
            if (this.f75549a.isCancelled() || (str = (bVar = this.f186015c).f83282b) == null || TextUtils.isEmpty(str)) {
                return null;
            }
            t tVarA = y.a(bVar.f83281a, bVar.f83282b, bVar.f83283c);
            tVarA.f185996a = bVar.f83286f;
            tVarA.f185997b = bVar.f83284d;
            tVarA.f185998c = bVar.f83285e;
            return tVarA;
        }

        @Override // g22.c
        public final void d(t tVar) {
            t tVar2 = tVar;
            if (tVar2 != null) {
                z.this.a(tVar2);
            }
        }
    }

    public final void a(t tVar) {
        SwingDTO swingDTOA;
        SwingDetailsActivity swingDetailsActivity = this.f186013a;
        if (swingDetailsActivity == null || tVar == null || swingDetailsActivity.f35778d == null || (swingDTOA = com.garmin.android.apps.connectmobile.golf.truswing.k.a.a(tVar)) == null) {
            return;
        }
        swingDetailsActivity.f35776b = swingDTOA;
        swingDetailsActivity.f35778d.E6(swingDTOA);
        SwingDTO swingDTO = swingDetailsActivity.f35776b;
        double[][] dArr = swingDTO.f35877f;
        if (dArr != null && dArr.length > 0) {
            swingDetailsActivity.f35778d.getClass();
            com.garmin.android.apps.connectmobile.golf.truswing.f.F6(swingDTO);
        }
        swingDetailsActivity.f35776b.f35881j = h.i().k();
        com.garmin.android.apps.connectmobile.golf.truswing.h hVar = swingDetailsActivity.f35778d;
        if (hVar.f35843n == null && hVar.getActivity() != null) {
            hVar.f35843n = (TextView) hVar.getActivity().findViewById(R.id.golf_swing_label);
        }
        TextView textView = hVar.f35843n;
        if (textView != null) {
            textView.setText(hVar.K6());
        }
        swingDetailsActivity.invalidateOptionsMenu();
    }

    @Override // java.util.Observer
    public final void update(Observable observable, Object obj) {
        hc2.c.a aVar = (hc2.c.a) obj;
        if (aVar.f83291a != hc2.c.a.EnumC1639a.NEW_SWING_DATA) {
            return;
        }
        hc2.b bVar = (hc2.b) aVar.f83292b;
        if (bVar == null) {
            a(null);
            return;
        }
        a aVar2 = this.f186014b;
        if (aVar2 != null) {
            aVar2.a();
        }
        a aVar3 = new a(bVar);
        this.f186014b = aVar3;
        aVar3.c(new Void[0]);
    }
}
