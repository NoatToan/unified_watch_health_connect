package mm0;

import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.group.details.GroupDetailActivity;
import com.garmin.android.apps.connectmobile.q1;

/* JADX INFO: loaded from: classes8.dex */
public final class r {
    public static final void a(GroupDetailActivity groupDetailActivity, androidx.fragment.app.v vVar, String str, int i14, int i15, int i16, e23.a aVar) {
        q1.b bVar = q1.f41066b;
        String string = groupDetailActivity.getString(i15);
        string.getClass();
        com.mapbox.maps.m mVar = new com.mapbox.maps.m(aVar, 1);
        bVar.getClass();
        q1.b.a(i14, string, i16, R.string.lbl_cancel, mVar).v6(vVar, str);
    }
}
