package vo1;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import com.garmin.android.apps.connectmobile.activities.newmodel.ActivityDetailChartDTO;
import h4.r;
import java.util.List;
import p005kotlin.Unit;
import ps.x1;

/* JADX INFO: loaded from: classes10.dex */
public interface b {
    void a(List<x1> list, ActivityDetailChartDTO activityDetailChartDTO, yo1.f fVar, boolean z14, boolean z15, e23.a<Unit> aVar, p3.m mVar, int i14);

    Intent b(Activity activity, String str, String str2);

    void c();

    void d(Activity activity, long j8);

    void e(x1 x1Var, List list, String str, boolean z14, ActivityDetailChartDTO activityDetailChartDTO, yo1.f fVar, boolean z15, boolean z16, boolean z17, e23.l lVar, e23.a aVar, p3.m mVar, int i14);

    void f(r rVar, ps.r rVar2, ps.n nVar, p3.m mVar, int i14);

    void g(Context context);

    void h(x1 x1Var, String str, int i14, m00.a aVar, yo1.f fVar, e23.p<? super Integer, ? super Boolean, Unit> pVar, p3.m mVar, int i15);
}
