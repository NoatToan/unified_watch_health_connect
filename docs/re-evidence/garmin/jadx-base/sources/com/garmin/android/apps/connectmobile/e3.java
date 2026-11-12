package com.garmin.android.apps.connectmobile;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import com.garmin.android.apps.connectmobile.activities.model.ActivityListItemDTO;
import java.util.List;
import org.joda.time.DateTime;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes7.dex */
public interface e3 {

    public static final class a {
        public static final void a(ir0.e eVar, String str, boolean z14, o13.p pVar, e3 e3Var, p3.m mVar, int i14) {
            e3 e3Var2;
            o13.p pVar2;
            boolean z15;
            String str2;
            ir0.e eVar2;
            eVar.getClass();
            str.getClass();
            e3Var.getClass();
            p3.o0 o0VarE = mVar.E(-1260054165);
            int i15 = ((i14 & 8) == 0 ? o0VarE.B(eVar) : o0VarE.r(eVar) ? 4 : 2) | i14 | (o0VarE.B(str) ? 32 : 16) | (o0VarE.h(z14) ? 256 : 128) | (o0VarE.B(pVar) ? 2048 : 1024) | (o0VarE.B(e3Var) ? 16384 : 8192);
            if (o0VarE.n(i15 & 1, (i15 & 9363) != 9362)) {
                p3.x1 x1Var = p3.n.f135158a;
                e3Var.I(eVar, str, z14, pVar, o0VarE, ir0.e.f94792c | (i15 & 14) | (i15 & 112) | (i15 & 896) | (i15 & 7168) | (i15 & 57344));
                e3Var2 = e3Var;
                eVar2 = eVar;
                str2 = str;
                z15 = z14;
                pVar2 = pVar;
            } else {
                e3Var2 = e3Var;
                pVar2 = pVar;
                z15 = z14;
                str2 = str;
                eVar2 = eVar;
                o0VarE.e();
            }
            p3.p2 p2VarI0 = o0VarE.i0();
            if (p2VarI0 != null) {
                p2VarI0.f135219d = new ad0.l(eVar2, str2, z15, pVar2, e3Var2, i14);
            }
        }

        public static final void b(ir0.e eVar, String str, DateTime dateTime, DateTime dateTime2, o13.p pVar, e3 e3Var, p3.m mVar, int i14) {
            eVar.getClass();
            str.getClass();
            e3Var.getClass();
            p3.o0 o0VarE = mVar.E(-1620983464);
            int i15 = i14 | ((i14 & 8) == 0 ? o0VarE.B(eVar) : o0VarE.r(eVar) ? 4 : 2) | (o0VarE.B(str) ? 32 : 16) | (o0VarE.r(dateTime) ? 256 : 128) | (o0VarE.r(dateTime2) ? 2048 : 1024) | (o0VarE.B(pVar) ? 16384 : 8192) | (o0VarE.B(e3Var) ? 131072 : 65536);
            if (o0VarE.n(i15 & 1, (74899 & i15) != 74898)) {
                p3.x1 x1Var = p3.n.f135158a;
                e3Var.q(eVar, str, dateTime, dateTime2, pVar, o0VarE, (i15 & 458752) | ir0.e.f94792c | (i15 & 14) | (i15 & 112) | (i15 & 896) | (i15 & 7168) | (57344 & i15));
            } else {
                o0VarE.e();
            }
            p3.p2 p2VarI0 = o0VarE.i0();
            if (p2VarI0 != null) {
                p2VarI0.f135219d = new a11.g0((Object) eVar, str, (Object) dateTime, (Object) dateTime2, (Object) pVar, (Object) e3Var, i14, 4);
            }
        }
    }

    Intent B(Activity activity, long j8, boolean z14, boolean z15);

    void E(h4.r rVar, oz1.b bVar, p3.m mVar, int i14);

    Object H(v13.c cVar);

    void I(ir0.e eVar, String str, boolean z14, o13.p<String, String> pVar, p3.m mVar, int i14);

    void L(androidx.fragment.app.m mVar, fg0.k kVar, p3.m mVar2, int i14);

    Object M(lx1.c.d dVar);

    void N(Context context, boolean z14);

    Object O(long j8, kv1.f fVar);

    Object R(com.garmin.android.apps.connectmobile.workouts.data.model.b bVar, lx1.d.a aVar);

    Object T(ps.m mVar, kv1.f fVar);

    void V(k61.b bVar, j61.d dVar, p3.m mVar, int i14);

    Object a(List<com.garmin.android.apps.connectmobile.workouts.data.model.b> list, t13.d<? super v2<? extends List<com.garmin.android.apps.connectmobile.workouts.data.model.b>>> dVar);

    o13.p<String, String> b(Context context, long j8, double d14);

    Object c(v13.c cVar);

    Object d(v13.c cVar);

    void f(Activity activity, boolean z14, String str);

    void g(Context context);

    void h(h4.r rVar, av1.c cVar, p3.m mVar, int i14);

    void i(h4.r rVar, h61.a aVar, e23.a<Unit> aVar2, p3.m mVar, int i14);

    void j(j61.i iVar, j61.d dVar, p3.m mVar, int i14);

    Object k(t13.d<? super v2<? extends List<oz1.b>>> dVar);

    Intent l(Activity activity, long j8, long j14);

    Object m(v13.c cVar);

    Object n(v13.c cVar);

    Object o(DateTime dateTime, DateTime dateTime2, boolean z14, v13.c cVar);

    void q(ir0.e eVar, String str, DateTime dateTime, DateTime dateTime2, o13.p<String, String> pVar, p3.m mVar, int i14);

    zz1.a r(Context context);

    void t(h4.r rVar, o61.q qVar, p3.m mVar, int i14);

    void v(int i14, ActivityListItemDTO activityListItemDTO, e23.a aVar, h4.r rVar, p3.m mVar, boolean z14);

    Intent y(Context context, String str, com.garmin.android.apps.connectmobile.repcounting.model.c cVar, com.garmin.android.apps.connectmobile.repcounting.model.e eVar, boolean z14, String str2);
}
