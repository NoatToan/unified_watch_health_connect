package m12;

import am.x0;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import com.garmin.android.apps.connectmobile.activities.model.ActivityListItemDTO;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public interface r {
    Intent A(Activity activity, ActivityListItemDTO activityListItemDTO, am.h hVar);

    int B(String str);

    void C(Context context, Long l14, String str);

    Intent D(Context context);

    void E(InputStream inputStream, FileOutputStream fileOutputStream);

    Intent F(Context context);

    Intent a(Context context);

    Object b(v13.c cVar);

    void c(Context context);

    List d(long j8, long j14, long j15, String str);

    boolean e();

    Intent f(Context context);

    Intent g(int i14, Context context);

    Intent h(Context context, hi0.a aVar, Boolean bool);

    void i(ArrayList arrayList);

    Object j(c.C2202c c2202c);

    void k();

    x0 l(int i14);

    String m(Context context, fg0.d dVar);

    String n(Context context, q91.d dVar, double d14);

    Intent o(Context context, String str, String str2);

    void p(Context context);

    Intent q(Context context, String str);

    Intent r(Context context, String str, String str2);

    Intent s(Context context, com.garmin.android.apps.connectmobile.userprofile.model.q qVar, boolean z14);

    Object t(nj1.e eVar, w wVar);

    Intent u(Context context, int i14, String str);

    Intent v();

    Intent w(Context context);

    Intent x(Context context);

    void y(Context context);

    void z(Context context);
}
