package jy1;

import am.h;
import am.x0;
import android.content.Context;
import android.content.Intent;
import androidx.fragment.app.m;
import com.garmin.android.apps.connectmobile.courses.model.e;
import com.garmin.android.apps.connectmobile.traininginitiative.ui.EventDetailsActivity;
import com.garmin.android.apps.connectmobile.workouts.data.model.f;
import f.c;
import fg0.k;
import java.util.ArrayList;
import java.util.List;
import vt1.o;
import xw1.n;

/* JADX INFO: loaded from: classes10.dex */
public interface b {
    void A(m mVar, e eVar, long j8, String str, boolean z14);

    boolean a();

    boolean b(long j8);

    Context c();

    boolean d();

    String e();

    String f(int i14, x0 x0Var, Context context);

    void g(m mVar, x0 x0Var, ArrayList arrayList, Boolean bool, boolean z14, Integer num, f fVar, com.garmin.android.library.mapsdkadapter.f fVar2, boolean z15);

    void h(EventDetailsActivity eventDetailsActivity, e eVar);

    void i(m mVar, long j8);

    void j(EventDetailsActivity eventDetailsActivity, List list);

    void k(m mVar, e eVar);

    void l(m mVar, com.garmin.android.apps.connectmobile.pacepro.data.dto.b bVar);

    void m(m mVar, long j8);

    void n(m mVar, x0 x0Var);

    String o(Context context, double d14, String str);

    void p(m mVar, String str, Double d14, String str2);

    void q(m mVar, x0 x0Var, Boolean bool, boolean z14, int i14);

    void r(Context context, long j8, n nVar);

    void s(m mVar, long j8, o oVar);

    void t(m mVar);

    void u(m mVar, k kVar);

    void v(m mVar, e eVar, String str, boolean z14);

    void w(m mVar, long j8, String str);

    void x(Context context, c<Intent> cVar, long j8, String str, h hVar);

    void y(m mVar, x0 x0Var, ArrayList arrayList, Boolean bool, boolean z14, f fVar, com.garmin.android.library.mapsdkadapter.f fVar2, boolean z15);

    void z(m mVar, w01.c cVar, c cVar2);
}
