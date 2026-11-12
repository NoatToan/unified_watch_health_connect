package com.garmin.android.apps.connectmobile.workouts.presentation.details;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import c2.b0;
import c2.x2;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.l2;
import h5.e0;
import i3.mh;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import l72.p2;
import p005kotlin.Metadata;
import p13.h0;
import p3.b4;
import p3.i2;
import p3.o0;
import p3.p0;
import p3.x1;
import s5.x0;
import u1.a2;
import ww1.i0;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/garmin/android/apps/connectmobile/workouts/presentation/details/ViewCompatibleActivityListActivity;", "Lcom/garmin/android/apps/connectmobile/c;", "<init>", "()V", "a", "gcm-workouts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class ViewCompatibleActivityListActivity extends com.garmin.android.apps.connectmobile.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f48480a = new a(null);

    public final void ca(i0 i0Var, List<i0> list, p3.m mVar, int i14) {
        int i15;
        o0 o0Var;
        o0 o0VarE = mVar.E(1059561022);
        if ((i14 & 6) == 0) {
            i15 = i14 | ((i14 & 8) == 0 ? o0VarE.B(i0Var) : o0VarE.r(i0Var) ? 4 : 2);
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= o0VarE.r(list) ? 32 : 16;
        }
        int i16 = 1;
        if (o0VarE.n(i15 & 1, (i15 & 19) != 18)) {
            x1 x1Var = p3.n.f135158a;
            p2 p2Var = p2.f111205a;
            String strT = gl1.d.T(i0Var.b().f4360c, o0VarE, 0);
            o0VarE.C(330901589);
            ArrayList arrayList = new ArrayList(p13.y.r(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(gl1.d.T(((i0) it.next()).b().f4360c, o0VarE, 0));
            }
            o0VarE.g0(false);
            String strK0 = h0.k0(arrayList, null, null, null, null, 63);
            z3.e eVarC = z3.f.c(1774208240, new c62.s(i0Var, i16), o0VarE);
            p2 p2Var2 = p2.f111205a;
            o0Var = o0VarE;
            p2Var.h(strT, strK0, null, null, null, false, false, eVarC, null, null, null, o0Var, 12582912, 0, 1916);
            x1 x1Var2 = p3.n.f135158a;
        } else {
            o0Var = o0VarE;
            o0Var.e();
        }
        p3.p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new a42.f(this, i0Var, list, i14, 11);
        }
    }

    public final void da(String str, List<i0> list, p3.m mVar, int i14) {
        o0 o0VarE = mVar.E(1297161157);
        int i15 = (o0VarE.B(str) ? 4 : 2) | i14 | (o0VarE.r(list) ? 32 : 16) | (o0VarE.r(this) ? 256 : 128);
        int i16 = 0;
        if (o0VarE.n(i15 & 1, (i15 & 147) != 146)) {
            x1 x1Var = p3.n.f135158a;
            h4.r.a aVar = h4.r.S;
            h4.r rVarB = a2.b(x2.f(aVar, 1.0f), a2.a(o0VarE), true);
            c2.j.f22691a.getClass();
            c2.j.k kVar = c2.j.f22694d;
            h4.d.f81522a.getClass();
            c2.z zVarA = c2.y.a(kVar, h4.d.a.f81536n, o0VarE, 0);
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            h4.r rVarC = h4.k.c(rVarB, o0VarE);
            h5.g.V.getClass();
            e0.a aVar2 = h5.g.a.f81805b;
            if (o0VarE.f135177b == null) {
                p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar2);
            } else {
                o0VarE.c();
            }
            b4.c(h5.g.a.f81810g, zVarA, o0VarE);
            b4.c(h5.g.a.f81809f, i2VarA0, o0VarE);
            h5.g.a.b bVar = h5.g.a.f81813j;
            if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar);
            }
            b4.c(h5.g.a.f81807d, rVarC, o0VarE);
            b0 b0Var = b0.f22601a;
            String strP = gl1.y.P(R.string.compatible_activities_for_workout, new Object[]{str}, o0VarE);
            d92.b.f58623a.getClass();
            d92.b.f58624b.getClass();
            x0 x0VarB = d92.c.b(j92.f.f97931h, o0VarE);
            j92.b bVar2 = d92.b.f58625c;
            bVar2.getClass();
            j92.e eVar = j92.b.f97899b;
            h4.r rVarA = c2.l.A(aVar, eVar.f97920e, 0.0f, 2);
            bVar2.getClass();
            float f14 = eVar.f97921f;
            bVar2.getClass();
            mh.c(strP, c2.l.C(rVarA, 0.0f, f14, 0.0f, eVar.f97920e, 5), 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, x0VarB, o0VarE, 0, 0, 131068);
            o0VarE = o0VarE;
            o0VarE.C(1287352854);
            i0 i0VarP = w5.r.p(list);
            List<i0> listQ = w5.r.q(list);
            if (i0VarP != null && listQ != null) {
                ca(i0VarP, listQ, o0VarE, i0.f187805d | (i15 & 896));
            }
            o0VarE.g0(false);
            o0VarE.C(1287361142);
            i0 i0VarJ = w5.r.j(list);
            List<i0> listK = w5.r.k(list);
            if (i0VarJ != null && listK != null) {
                ca(i0VarJ, listK, o0VarE, (i15 & 896) | i0.f187805d);
            }
            o0VarE.g0(false);
            o0VarE.C(1287370973);
            for (i0 i0Var : w5.r.m(list)) {
                p2.f111205a.g(gl1.d.T(i0Var.b().f4360c, o0VarE, 0), null, null, z3.f.c(-1671930291, new c62.s(i0Var, i16), o0VarE), null, false, false, null, o0VarE, 3072, 502);
            }
            o0VarE.g0(false);
            o0VarE.g0(true);
            x1 x1Var2 = p3.n.f135158a;
        } else {
            o0VarE.e();
        }
        p3.p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new c62.r(this, str, list, i14);
        }
    }

    @Override // com.garmin.android.apps.connectmobile.c, com.garmin.android.apps.connectmobile.z1, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, b.g, z6.e, android.app.Activity
    public final void onCreate(Bundle bundle) {
        Parcelable[] parcelableArray;
        super.onCreate(bundle);
        setContentView(R.layout.activity_composable_container);
        l2.a aVar = l2.f37135b;
        Intent intent = getIntent();
        aVar.getClass();
        Bundle bundleA = l2.a.a(intent);
        List listI0 = null;
        String string = bundleA != null ? bundleA.getString("extras_workout_name") : null;
        if (bundleA != null) {
            if (Build.VERSION.SDK_INT >= 33) {
                parcelableArray = (Parcelable[]) bundleA.getParcelableArray("extras_compatible_activity_list", i0.class);
            } else {
                parcelableArray = bundleA.getParcelableArray("extras_compatible_activity_list");
                if (parcelableArray == null) {
                    parcelableArray = null;
                }
            }
            i0[] i0VarArr = (i0[]) parcelableArray;
            if (i0VarArr != null) {
                listI0 = p13.u.i0(i0VarArr);
            }
        }
        List list = listI0;
        if (string != null && list != null && !list.isEmpty()) {
            c.j.a(this, new z3.e(2039583120, true, new c62.r(this, string, list, 0, (byte) 0)));
            return;
        }
        com.garmin.android.apps.connectmobile.i2.a aVar2 = com.garmin.android.apps.connectmobile.i2.f36769a;
        com.garmin.android.apps.connectmobile.a2 a2Var = com.garmin.android.apps.connectmobile.a2.GENERAL;
        aVar2.getClass();
        com.garmin.android.apps.connectmobile.i2.a.f(a2Var, "FBTProgressReportActivity", "One or both of the required workoutName and compatibleActivityList params are missing. Finishing the activity.");
        finish();
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0006¨\u0006\t"}, d2 = {"Lcom/garmin/android/apps/connectmobile/workouts/presentation/details/ViewCompatibleActivityListActivity$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "EXTRAS_WORKOUT_NAME", "EXTRAS_COMPATIBLE_ACTIVITY_LIST", "gcm-workouts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
