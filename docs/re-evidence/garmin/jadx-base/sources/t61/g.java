package t61;

import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.v;
import org.joda.time.DateTime;
import r22.b0;

/* JADX INFO: loaded from: classes9.dex */
public class g extends x22.a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f162751d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public f f162752e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f162753f;

    public class a implements b0.b {
        public a() {
        }

        @Override // r22.b0.b
        public final String a(int i14, DateTime dateTime, DateTime dateTime2) {
            return new pi0.e(g.this.requireContext()).l(dateTime, dateTime2, pi0.f.SHORT_MONTH_NO_WEEKDAY);
        }
    }

    public class b extends b0 {
        public b(v vVar, int i14, DateTime dateTime, DateTime dateTime2, b0.b bVar) {
            super(vVar, i14, dateTime, dateTime2, bVar);
        }

        @Override // r22.b0
        public final Fragment b(long j8, long j14) {
            kd0.m mVar = bv.b.f21240b;
            g gVar = g.this;
            int i14 = gVar.f162753f;
            boolean z14 = gVar.f162751d;
            mVar.getClass();
            if (i14 != 3) {
                com.garmin.android.apps.connectmobile.performance.stats.a.f40030n.getClass();
                com.garmin.android.apps.connectmobile.performance.stats.a aVar = new com.garmin.android.apps.connectmobile.performance.stats.a();
                Bundle bundle = new Bundle();
                bundle.putLong("GCM_extra_start_date", j8);
                bundle.putLong("GCM_extra_end_date", j14);
                aVar.setArguments(bundle);
                return aVar;
            }
            com.garmin.android.apps.connectmobile.performance.stats.c.f40046r.getClass();
            com.garmin.android.apps.connectmobile.performance.stats.c cVar = new com.garmin.android.apps.connectmobile.performance.stats.c();
            Bundle bundle2 = new Bundle();
            bundle2.putBoolean("EXTRA_HAS_COMPLETE_DATA", z14);
            bundle2.putLong("GCM_extra_start_date", j8);
            bundle2.putLong("GCM_extra_end_date", j14);
            cVar.setArguments(bundle2);
            return cVar;
        }
    }

    public static g y6(f fVar, int i14) {
        g gVar = new g();
        Bundle bundle = new Bundle();
        bundle.putSerializable("extraFilterInterval", fVar);
        bundle.putInt("performanceMode", i14);
        gVar.setArguments(bundle);
        return gVar;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.f162752e = (f) arguments.getSerializable("extraFilterInterval");
            this.f162753f = arguments.getInt("performanceMode");
        }
        e12.e eVarC = bo1.a.a().c();
        this.f162751d = eVarC.l() && eVarC.s();
    }

    @Override // x22.a, androidx.fragment.app.Fragment
    public final void onViewCreated(View view2, Bundle bundle) {
        super.onViewCreated(view2, bundle);
        u6();
    }

    @Override // x22.a
    public final b0 u6() {
        return new b(getChildFragmentManager(), this.f162752e.f162748b, null, null, new a());
    }
}
