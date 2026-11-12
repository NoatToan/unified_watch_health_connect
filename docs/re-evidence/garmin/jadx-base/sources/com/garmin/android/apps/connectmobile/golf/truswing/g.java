package com.garmin.android.apps.connectmobile.golf.truswing;

import android.os.Bundle;
import androidx.lifecycle.m;
import androidx.lifecycle.x1;
import com.garmin.android.apps.connectmobile.golf.truswing.model.SwingDTO;
import java.util.ArrayList;
import java.util.List;
import org.koin.java.KoinJavaComponent;
import wd2.h0;
import wl0.n;

/* JADX INFO: loaded from: classes8.dex */
public class g extends a {
    public long P;
    public c T;

    @Override // com.garmin.android.apps.connectmobile.golf.truswing.a
    public final boolean T6(SwingDTO swingDTO) {
        cl0.a.e().getClass();
        List listD = cl0.a.d();
        cl0.a.e().getClass();
        ((cl0.b) KoinJavaComponent.get(cl0.b.class)).H();
        if (listD != null) {
            ArrayList arrayList = (ArrayList) listD;
            if (arrayList.size() > 0) {
                cl0.a aVarE = cl0.a.e();
                long jLongValue = ((Long) arrayList.get(0)).longValue();
                aVarE.getClass();
                cl0.a.a(jLongValue);
            }
        }
        cl0.a aVarE2 = cl0.a.e();
        long j8 = swingDTO.f35872a;
        aVarE2.getClass();
        return cl0.a.a(j8);
    }

    @Override // com.garmin.android.apps.connectmobile.golf.truswing.a
    public final void X6() {
        f7();
        c cVar = this.T;
        long j8 = this.P;
        cVar.getClass();
        m.a(null, new n(cVar, j8, null), 3).f(requireActivity(), new h0(this, 5));
    }

    @Override // com.garmin.android.apps.connectmobile.golf.truswing.a
    public final List<Long> Y6() {
        cl0.a.e().getClass();
        return cl0.a.d();
    }

    @Override // com.garmin.android.apps.connectmobile.golf.truswing.a
    public final boolean c7(List<Long> list, SwingDTO swingDTO) {
        return list.contains(Long.valueOf(swingDTO.f35872a));
    }

    @Override // com.garmin.android.apps.connectmobile.golf.truswing.a
    public final void d7() {
        X6();
    }

    @Override // com.garmin.android.apps.connectmobile.golf.truswing.a, com.garmin.android.apps.connectmobile.o0, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.P = getArguments().getLong("GCM_swing_session_id");
        this.T = (c) new x1(requireActivity()).a(c.class);
    }
}
