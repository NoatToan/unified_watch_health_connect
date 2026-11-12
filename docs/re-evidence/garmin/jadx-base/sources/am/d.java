package am;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.garmin.android.apps.connectmobile.activities.history.presentation.ActivitiesListActivity;
import com.garmin.android.apps.connectmobile.activities.photos.ViewImageActivity;
import com.garmin.android.apps.connectmobile.activity.details.presentation.ActivityDetailsActivity;
import java.util.List;
import org.joda.time.DateTime;

/* JADX INFO: loaded from: classes7.dex */
public interface d {
    Object A(String str, long j8, f0 f0Var);

    Intent B(androidx.fragment.app.m mVar);

    Object C(long j8, long j14, boolean z14, boolean z15, v13.i iVar);

    String D(Context context);

    void E(ViewImageActivity viewImageActivity, ps.q qVar, String str);

    boolean F(String str);

    void G(Context context, sn.h hVar);

    void H(androidx.fragment.app.m mVar, x0 x0Var, long j8, List list);

    String I(Context context, x0 x0Var, String str);

    boolean J();

    String K(l22.b bVar, long j8, com.garmin.android.apps.connectmobile.repcounting.model.f fVar);

    Intent L(Context context);

    jd0.j M();

    boolean N();

    o13.l O(ActivityDetailsActivity activityDetailsActivity);

    String P(String str);

    cp0.b Q();

    void R(androidx.fragment.app.m mVar, Intent intent);

    jd0.l S();

    x0 T();

    Intent U(androidx.fragment.app.m mVar, Uri uri, int i14, int i15);

    void V(Context context, Long l14, String str);

    void W(Context context, Intent intent);

    void X(double d14, String str);

    f Y();

    ok0.b Z();

    Object a0(dm.t0.a aVar);

    void b(Context context);

    void b0(Context context, int i14, String str);

    long c(String str, com.garmin.android.library.backgroundtaskmanagement.b.InterfaceC0995b<com.garmin.android.apps.connectmobile.courses.model.e> interfaceC0995b);

    void c0(x0 x0Var);

    Intent d(Context context, String str, String str2, String str3);

    void d0(Context context, String str);

    Intent e(Context context, long j8);

    void e0(long j8);

    Intent f(Context context, Long l14);

    String f0(Context context);

    boolean g(String str);

    String g0();

    long h();

    Intent h0(Context context, b63.o oVar, i53.c<c80.a> cVar, long j8, x0 x0Var);

    com.garmin.android.apps.connectmobile.repcounting.model.c i();

    Intent i0(Context context, String str);

    void j(int i14, Context context);

    Intent j0(Context context);

    Intent k(Activity activity);

    Object k0(Long l14, Integer num, v13.c cVar);

    String l();

    Intent l0(Context context, g gVar);

    Object m(DateTime dateTime, boolean z14, v13.c cVar);

    Object m0(long j8, qr.y yVar);

    void n(ActivitiesListActivity activitiesListActivity);

    void n0(nr.g.t tVar, p3.m mVar, int i14);

    void o(androidx.fragment.app.m mVar, long j8, long j14, long j15, long j16);

    void o0(com.garmin.android.apps.connectmobile.repcounting.model.d dVar);

    cp0.a p();

    zb0.b0 p0(Context context, long j8);

    void q(Context context, String str, im.d0 d0Var, im.d0 d0Var2);

    void r(Context context);

    void s();

    String t();

    void u(Activity activity, g gVar);

    Intent v(Context context, x0 x0Var, Long l14);

    Intent w(Context context, long j8, Long l14, Long l15, Integer num, Long l16);

    String x();

    Intent y(Context context, q91.d dVar);

    Object z(long j8, po.h.b bVar);
}
