package id0;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.charts.mpchart3.wrapper.CustomLineChart;
import com.garmin.android.apps.connectmobile.courses.model.GeoPointDTO;
import com.garmin.android.apps.connectmobile.courses.presentation.custom.CreateCustomCourseActivity;
import com.garmin.android.apps.connectmobile.settings.GCMSettingManager;
import com.garmin.android.gfdi.configuration.SupportedCapability;
import java.util.ArrayList;
import java.util.List;
import okhttp3.Response;
import org.joda.time.DateTime;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lid0/e5;", "Lts1/a;", "Lcom/garmin/android/apps/connectmobile/f0;", "<init>", "()V", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class e5 implements ts1.a, com.garmin.android.apps.connectmobile.f0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f92720c = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final am.b2 f92721a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d60.a f92722b;

    public e5() {
        ez0.b bVar = ez0.b.f67468a;
        ez0.c cVar = ez0.c.GC;
        this.f92721a = (am.b2) ez0.b.a(bVar, cVar, am.b2.class, new c83.h.a[0], null, null, null, 120);
        this.f92722b = (d60.a) ez0.b.a(bVar, cVar, d60.a.class, new c83.h.a[0], null, null, null, 120);
    }

    @Override // ts1.a
    public final Object a() {
        rd2.f.a().f152045a.getClass();
        ArrayList arrayListE = rd2.j.e();
        if (arrayListE == null) {
            return p13.j0.f134944a;
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : arrayListE) {
            sd2.f fVar = (sd2.f) obj;
            if (km2.a.i(fVar.getUnitID(), null, SupportedCapability.COURSE_DOWNLOAD.ordinal()) && fVar.Q2()) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    @Override // ts1.a
    public final Intent b(Activity activity, com.garmin.android.apps.connectmobile.courses.model.e eVar) {
        activity.getClass();
        eVar.getClass();
        CreateCustomCourseActivity.f33013f.getClass();
        Intent intent = new Intent(activity, (Class<?>) CreateCustomCourseActivity.class);
        Bundle bundle = new Bundle();
        bundle.putParcelable("GCM_extra_course_detail", new com.garmin.android.apps.connectmobile.courses.model.e(eVar));
        bundle.putBoolean("GCM_extra_course_navigate_up", false);
        com.airbnb.lottie.animation.keyframe.a.q(com.garmin.android.apps.connectmobile.l2.f37135b, intent, bundle);
        return intent;
    }

    @Override // ts1.a
    public final c83.a0 c(long j8, long j14) {
        c83.a0<String> a0VarExecute = this.f92722b.H(String.valueOf(j8), String.valueOf(j14)).execute();
        a0VarExecute.getClass();
        return a0VarExecute;
    }

    @Override // ts1.a
    public final long d() {
        return GCMSettingManager.r(fd0.d.TRAILS, null);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // ts1.a
    public final Object f(Context context, long j8, long j14, v13.c cVar) {
        c5 c5Var;
        if (cVar instanceof c5) {
            c5Var = (c5) cVar;
            int i14 = c5Var.f92696e;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                c5Var.f92696e = i14 - Integer.MIN_VALUE;
            } else {
                c5Var = new c5(this, cVar);
            }
        } else {
            c5Var = new c5(this, cVar);
        }
        Object objJ = c5Var.f92694c;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = c5Var.f92696e;
        if (i15 == 0) {
            o13.r.b(objJ);
            d5 d5Var = new d5(this, j14, null);
            c5Var.f92692a = context;
            c5Var.f92693b = j8;
            c5Var.f92696e = 1;
            objJ = com.garmin.android.apps.connectmobile.f0.J(this, d5Var, c5Var);
            if (objJ == aVar) {
                return aVar;
            }
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            j8 = c5Var.f92693b;
            context = c5Var.f92692a;
            o13.r.b(objJ);
        }
        com.garmin.android.apps.connectmobile.v2 v2Var = (com.garmin.android.apps.connectmobile.v2) objJ;
        if (!(v2Var instanceof com.garmin.android.apps.connectmobile.v2.b)) {
            return null;
        }
        com.garmin.android.apps.connectmobile.courses.model.e eVar = (com.garmin.android.apps.connectmobile.courses.model.e) ((com.garmin.android.apps.connectmobile.v2.b) v2Var).f47386a;
        eVar.A0(String.valueOf(j8));
        eVar.sourceTypeId = new Long(4L);
        String str = eVar.courseName;
        if (str == null) {
            str = "";
        }
        eVar.courseName = context.getString(R.string.course_name_copy_of, str);
        s20.d dVar = s20.d.f156005a;
        List<GeoPointDTO> list = eVar.geoPoints;
        boolean zY = ((f12.l) KoinJavaComponent.get$default(f12.l.class, null, null, 6, null)).y();
        dVar.getClass();
        eVar.intervalMarkers = s20.d.f(list, zY);
        return eVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // ts1.a
    public final Object g(long j8, v13.c cVar) {
        b5 b5Var;
        am.x0 x0VarH;
        ps.q1 summaryDTO;
        if (cVar instanceof b5) {
            b5Var = (b5) cVar;
            int i14 = b5Var.f92679c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                b5Var.f92679c = i14 - Integer.MIN_VALUE;
            } else {
                b5Var = new b5(this, cVar);
            }
        } else {
            b5Var = new b5(this, cVar);
        }
        Object objAwait = b5Var.f92677a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = b5Var.f92679c;
        String str = null;
        if (i15 == 0) {
            o13.r.b(objAwait);
            o53.i0<c83.a0<ps.r>> i0VarC = this.f92721a.c(j8);
            b5Var.f92679c = 1;
            objAwait = i0VarC.await(b5Var);
            if (objAwait == aVar) {
                return aVar;
            }
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(objAwait);
        }
        c83.a0 a0Var = (c83.a0) objAwait;
        Response response = a0Var.f25745a;
        T t7 = a0Var.f25746b;
        if (!response.isSuccessful()) {
            return null;
        }
        ps.r rVar = (ps.r) t7;
        long millis = (rVar == null || (summaryDTO = rVar.getSummaryDTO()) == null) ? DateTime.now().withTimeAtStartOfDay().getMillis() : summaryDTO.c5();
        if (rVar != null && (x0VarH = rVar.h()) != null) {
            str = x0VarH.f4358a;
        }
        am.z0 z0Var = am.z0.f4390a;
        return new ms1.c(millis, am.z0.b(am.x0.f4320q, str));
    }

    @Override // ts1.a
    public final Intent h(Activity activity) {
        activity.getClass();
        return ((am.d) KoinJavaComponent.get$default(am.d.class, null, null, 6, null)).k(activity);
    }

    @Override // ts1.a
    public final CustomLineChart i(Context context, ArrayList arrayList, boolean z14, boolean z15, e23.a aVar) {
        context.getClass();
        CustomLineChart customLineChart = new CustomLineChart(context);
        tz.a aVar2 = new tz.a(customLineChart, new q30.b(context), new a5(customLineChart, z14), z15 ? new q30.f(customLineChart) : null, new z4(customLineChart), null, 32, null);
        if (!arrayList.isEmpty()) {
            Double d14 = ((GeoPointDTO) p13.h0.m0(arrayList)).distance;
            qz.a.b(aVar2, new k30.q(arrayList, null, null, d14 != null ? d14.doubleValue() : 0.0d, null, 16, null), null, 6);
        }
        if (!z15) {
            customLineChart.setOnClickListener(new aq.q1(aVar, 6));
        }
        return customLineChart;
    }
}
