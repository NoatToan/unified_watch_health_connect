package ey;

import android.widget.Toast;
import androidx.lifecycle.w1;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.calendar.presentation.GCMCalendarActivity;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import o53.f0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p13.h0;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Ley/l;", "Ld80/b;", "gcm-calendar_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class l implements d80.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ GCMCalendarActivity f67099a;

    public l(GCMCalendarActivity gCMCalendarActivity) {
        this.f67099a = gCMCalendarActivity;
    }

    @Override // d80.b
    public final void a(lj0.b bVar) {
        GCMCalendarActivity gCMCalendarActivity = this.f67099a;
        gCMCalendarActivity.f31079p--;
        Toast.makeText(gCMCalendarActivity, R.string.txt_something_went_wrong_try_again, 0).show();
        gCMCalendarActivity.ma();
    }

    @Override // d80.b
    public final void b(Object obj, d80.b.a aVar) {
        aVar.getClass();
        GCMCalendarActivity gCMCalendarActivity = this.f67099a;
        int i14 = gCMCalendarActivity.f31079p;
        w1 w1Var = gCMCalendarActivity.f31083v;
        gCMCalendarActivity.f31079p = i14 - 1;
        if (obj == null) {
            Toast.makeText(gCMCalendarActivity, R.string.txt_something_went_wrong_try_again, 0).show();
            gCMCalendarActivity.ma();
            return;
        }
        bm2.c[] cVarArr = (bm2.c[]) obj;
        List listAsList = Arrays.asList(Arrays.copyOf(cVarArr, cVarArr.length));
        listAsList.getClass();
        ArrayList arrayListZ = h0.Z(h0.b1(listAsList));
        gCMCalendarActivity.f31078o = arrayListZ;
        Iterator it = arrayListZ.iterator();
        while (it.hasNext()) {
            if (((bm2.c) it.next()).g()) {
                int i15 = 1;
                gCMCalendarActivity.f31075l = true;
                if (gCMCalendarActivity.getSharedPreferences(gCMCalendarActivity.getString(R.string.one_time_shared_pref_name), 0).getBoolean(gCMCalendarActivity.getString(R.string.one_time_shared_pref_key), true)) {
                    f0.N(new q((s) w1Var.getValue(), "AutoSync.OneTimeMessage.dismiss", null)).f(gCMCalendarActivity, new GCMCalendarActivity.c(new k(gCMCalendarActivity, 3)));
                    gCMCalendarActivity.f31079p++;
                    Unit unit = Unit.INSTANCE;
                }
                f0.N(new q((s) w1Var.getValue(), "Calendar.AutoSync", null)).f(gCMCalendarActivity, new GCMCalendarActivity.c(new k(gCMCalendarActivity, i15)));
                gCMCalendarActivity.f31079p++;
                gCMCalendarActivity.invalidateOptionsMenu();
                break;
            }
        }
        gCMCalendarActivity.ma();
    }
}
