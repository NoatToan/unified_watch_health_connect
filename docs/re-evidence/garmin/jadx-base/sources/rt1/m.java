package rt1;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import bs2.nv;
import com.garmin.android.apps.connectmobile.courses.model.GeoPointDTO;
import com.garmin.android.apps.connectmobile.pacepro.data.dto.PaceBandSplitDTO;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public interface m {
    boolean A();

    void B(long j8, String str);

    PaceBandSplitDTO[] C(com.garmin.android.apps.connectmobile.pacepro.data.dto.b bVar, GeoPointDTO[] geoPointDTOArr);

    Object D(fz0.c cVar, fz0.c cVar2, qv1.f fVar);

    boolean E();

    long F(long j8, long j14, com.garmin.android.apps.connectmobile.workouts.presentation.details.f.l lVar);

    void G(ps.m mVar);

    boolean H();

    boolean a(long j8);

    Context b();

    boolean c();

    boolean d();

    ps.m e(long j8);

    boolean f();

    Intent g(Context context);

    Object h(v13.c cVar);

    String i(long j8);

    boolean j();

    boolean k();

    void l(Activity activity, bg1.a aVar);

    boolean m();

    boolean n();

    boolean o();

    boolean p();

    List<j23.o> q();

    Object r(String str, xf1.m mVar);

    boolean s();

    Object t(String str, xf1.l lVar);

    Intent u(Context context, fg0.k kVar, ww1.g gVar, boolean z14, boolean z15);

    void v(boolean z14);

    void w(Context context, w01.c cVar, f.c<Intent> cVar2);

    boolean x();

    long y(nv nvVar);

    String z();
}
