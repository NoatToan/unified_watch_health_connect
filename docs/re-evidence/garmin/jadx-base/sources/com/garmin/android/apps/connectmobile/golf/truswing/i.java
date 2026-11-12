package com.garmin.android.apps.connectmobile.golf.truswing;

import android.content.Intent;
import android.os.Bundle;
import androidx.lifecycle.x1;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.golf.truswing.model.SwingDTO;
import com.garmin.android.apps.connectmobile.golf.truswing.model.SwingSessionDTO;
import com.garmin.android.apps.connectmobile.golf.truswing.model.m;
import com.garmin.android.apps.connectmobile.v2;
import java.util.ArrayList;
import java.util.List;
import org.joda.time.DateTime;
import org.koin.java.KoinJavaComponent;
import wl0.g0;
import wl0.o;

/* JADX INFO: loaded from: classes8.dex */
public class i extends a {
    public long P;
    public c T;

    /* JADX WARN: Multi-variable type inference failed */
    public static void n7(i iVar, v2 v2Var) {
        if (v2Var instanceof v2.b) {
            for (SwingSessionDTO swingSessionDTO : ((m) ((v2.b) v2Var).f47386a).f35980a) {
                if (DateTime.now().withTimeAtStartOfDay().equals(new DateTime(swingSessionDTO.f35885d).withTimeAtStartOfDay())) {
                    iVar.P = swingSessionDTO.f35882a;
                    break;
                }
            }
        }
        super.h7();
    }

    @Override // com.garmin.android.apps.connectmobile.o0
    public final void K6(int i14) {
        if (i14 == 0 && isAdded()) {
            getActivity().finish();
        } else {
            super.K6(i14);
        }
    }

    @Override // com.garmin.android.apps.connectmobile.golf.truswing.a
    public final boolean T6(SwingDTO swingDTO) {
        if (swingDTO.f35880i == swingDTO.f35872a) {
            cl0.a.e().getClass();
            List listF = cl0.a.f();
            cl0.a.e().getClass();
            ((cl0.b) KoinJavaComponent.get(cl0.b.class)).I();
            if (listF != null) {
                ArrayList arrayList = (ArrayList) listF;
                if (arrayList.size() > 0) {
                    cl0.a aVarE = cl0.a.e();
                    long jLongValue = ((Long) arrayList.get(0)).longValue();
                    aVarE.getClass();
                    cl0.a.b(jLongValue);
                }
            }
            cl0.a aVarE2 = cl0.a.e();
            long j8 = swingDTO.f35880i;
            aVarE2.getClass();
            return cl0.a.b(j8);
        }
        cl0.a.e().getClass();
        List listD = cl0.a.d();
        cl0.a.e().getClass();
        ((cl0.b) KoinJavaComponent.get(cl0.b.class)).H();
        if (listD != null) {
            ArrayList arrayList2 = (ArrayList) listD;
            if (arrayList2.size() > 0) {
                cl0.a aVarE3 = cl0.a.e();
                long jLongValue2 = ((Long) arrayList2.get(0)).longValue();
                aVarE3.getClass();
                cl0.a.a(jLongValue2);
            }
        }
        cl0.a aVarE4 = cl0.a.e();
        long j14 = swingDTO.f35872a;
        aVarE4.getClass();
        return cl0.a.a(j14);
    }

    @Override // com.garmin.android.apps.connectmobile.golf.truswing.a
    public final void V6(SwingDTO swingDTO) {
        if (swingDTO == null || swingDTO.f35880i != swingDTO.f35872a) {
            super.V6(swingDTO);
            return;
        }
        androidx.fragment.app.m activity = getActivity();
        boolean z14 = this.f35804z.f35886e == 1;
        int i14 = SwingDetailsActivity.f35774o;
        if (activity != null) {
            Intent intent = new Intent(activity, (Class<?>) SwingDetailsActivity.class);
            intent.setAction("GCM_action_swings_real_time");
            intent.putExtra("GCM_swing_dto", swingDTO);
            intent.putExtra("GCM_last_swing", z14);
            activity.startActivity(intent);
        }
    }

    @Override // com.garmin.android.apps.connectmobile.golf.truswing.a
    public final void X6() {
        f7();
    }

    @Override // com.garmin.android.apps.connectmobile.golf.truswing.a
    public final List<Long> Y6() {
        cl0.a.e().getClass();
        return cl0.a.f();
    }

    @Override // com.garmin.android.apps.connectmobile.golf.truswing.a
    public final boolean c7(List<Long> list, SwingDTO swingDTO) {
        return list.contains(Long.valueOf(swingDTO.f35880i));
    }

    @Override // com.garmin.android.apps.connectmobile.golf.truswing.a
    public final void d7() {
        f7();
        S6();
        c cVar = this.T;
        cVar.getClass();
        androidx.lifecycle.m.a(null, new wl0.j(null, cVar, null), 3).f(getViewLifecycleOwner(), new g0(this, 0));
    }

    @Override // com.garmin.android.apps.connectmobile.golf.truswing.a
    public final void h7() {
        if (this.P > 0) {
            super.h7();
            return;
        }
        qd2.a.b().i(qd2.a.b.GOLF_SWING_LIST);
        c cVar = this.T;
        cVar.getClass();
        androidx.lifecycle.m.a(null, new o(cVar, null), 3).f(this, new g0(this, 1));
    }

    public final void o7(List<SwingDTO> list) {
        if (isAdded()) {
            SwingSessionDTO swingSessionDTO = new SwingSessionDTO();
            this.f35804z = swingSessionDTO;
            swingSessionDTO.f35882a = this.P;
            swingSessionDTO.f35885d = getString(R.string.challenge_leaderboard_header_today_label);
            SwingSessionDTO swingSessionDTO2 = this.f35804z;
            if (swingSessionDTO2.f35888g == null) {
                swingSessionDTO2.f35888g = new ArrayList();
            }
            if (list != null) {
                this.f35804z.f35888g.addAll(list);
                SwingSessionDTO swingSessionDTO3 = this.f35804z;
                swingSessionDTO3.f35886e = list.size() + swingSessionDTO3.f35886e;
            }
            S6();
            this.f35804z = this.f35804z;
            i7();
            g7();
            K6(this.f35804z.f35886e);
            e7();
            if (this.f35804z.f35886e == 0 && isAdded()) {
                this.D.C4();
            }
        }
    }

    @Override // com.garmin.android.apps.connectmobile.golf.truswing.a, com.garmin.android.apps.connectmobile.o0, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (getArguments() != null) {
            this.P = getArguments().getLong("GCM_swing_session_id");
        }
        this.T = (c) new x1(requireActivity()).a(c.class);
    }
}
