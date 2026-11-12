package wl0;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;
import androidx.lifecycle.x1;
import com.garmin.android.apps.connectmobile.golf.truswing.SwingDetailsActivity;
import com.garmin.android.apps.connectmobile.golf.truswing.SwingSessionActivity;
import com.garmin.android.apps.connectmobile.golf.truswing.model.SwingSessionDTO;
import com.garmin.android.apps.connectmobile.o0;
import org.joda.time.DateTime;

/* JADX INFO: loaded from: classes8.dex */
public class d0 extends o0 {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public e0 f185909w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public com.garmin.android.apps.connectmobile.golf.truswing.c f185910x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final wd2.h0 f185911y = new wd2.h0(this, 4);

    @Override // com.garmin.android.apps.connectmobile.o0
    public final void I6() {
        T6();
    }

    public final void T6() {
        if (hb2.i.a(getContext())) {
            qd2.a.b().i(qd2.a.b.GOLF_SWING_LIST);
        }
        com.garmin.android.apps.connectmobile.golf.truswing.c cVar = this.f185910x;
        cVar.getClass();
        androidx.lifecycle.m.a(null, new o(cVar, null), 3).f(getViewLifecycleOwner(), this.f185911y);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        e0 e0Var = new e0(getActivity());
        this.f185909w = e0Var;
        w6(e0Var);
    }

    @Override // com.garmin.android.apps.connectmobile.o0, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f185910x = (com.garmin.android.apps.connectmobile.golf.truswing.c) new x1(requireActivity()).a(com.garmin.android.apps.connectmobile.golf.truswing.c.class);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        S6();
        T6();
    }

    @Override // com.garmin.android.apps.connectmobile.o0, androidx.fragment.app.n0, androidx.fragment.app.Fragment
    public final void onViewCreated(View view2, Bundle bundle) {
        super.onViewCreated(view2, bundle);
        u6();
        this.f7311e.setDivider(null);
        u6();
        this.f7311e.setChoiceMode(1);
        if (h.i() != null) {
            h.i().p(requireActivity().getApplicationContext());
        }
    }

    @Override // androidx.fragment.app.n0
    public final void v6(ListView listView, View view2, int i14) {
        SwingSessionDTO swingSessionDTO = this.f185909w.f185917c.get(i14);
        if (!DateTime.now().withTimeAtStartOfDay().equals(new DateTime(swingSessionDTO.f35885d).withTimeAtStartOfDay())) {
            androidx.fragment.app.m activity = getActivity();
            long j8 = swingSessionDTO.f35882a;
            String str = swingSessionDTO.f35885d;
            int i15 = SwingSessionActivity.f35791d;
            if (activity != null) {
                Intent intent = new Intent(activity, (Class<?>) SwingSessionActivity.class);
                intent.putExtra("GCM_swing_session_id", j8);
                intent.putExtra("GCM_swing_session_date", str);
                activity.startActivity(intent);
                return;
            }
            return;
        }
        if (swingSessionDTO.f35886e == 0) {
            SwingDetailsActivity.ca(getActivity());
            return;
        }
        androidx.fragment.app.m activity2 = getActivity();
        long j14 = swingSessionDTO.f35882a;
        String str2 = swingSessionDTO.f35885d;
        int i16 = SwingSessionActivity.f35791d;
        if (activity2 != null) {
            Intent intent2 = new Intent(activity2, (Class<?>) SwingSessionActivity.class);
            intent2.putExtra("GCM_swing_session_id", j14);
            intent2.putExtra("GCM_swing_session_date", str2);
            activity2.startActivity(intent2);
        }
    }
}
