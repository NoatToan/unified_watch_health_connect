package xr;

import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.os.Bundle;
import android.view.View;
import androidx.lifecycle.v1;
import c22.s3;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.activities.PrivacyType;
import com.garmin.android.apps.connectmobile.activity.details.presentation.overview.SelectTrailBottomSheet;
import com.garmin.android.apps.connectmobile.courses.presentation.custom.CreateCustomCourseActivity;
import com.garmin.android.apps.connectmobile.courses.presentation.setup.CourseDrawingMethodActivity;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.l2;
import com.garmin.android.apps.connectmobile.settings.usersettings.stride.StrideLengthSettingsActivity;
import java.util.LinkedHashMap;
import lc.y;
import nr.w0;
import org.joda.time.DateTime;
import org.joda.time.LocalDate;
import p005kotlin.Unit;
import p3.p1;
import p3.x3;
import qr.t;
import r22.q0;
import ue.u;
import wd2.z1;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class a implements e23.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f191942a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f191943b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f191944c;

    public /* synthetic */ a(int i14, Object obj, Object obj2) {
        this.f191942a = i14;
        this.f191943b = obj;
        this.f191944c = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object, o13.l] */
    @Override // e23.a
    public final Object invoke() {
        int i14 = 0;
        switch (this.f191942a) {
            case 0:
                c cVar = (c) this.f191943b;
                View view2 = (View) this.f191944c;
                if (cVar.f191949b == null) {
                    t tVarU6 = cVar.u6();
                    int i15 = t.A2;
                    tVarU6.F5("ActivityShareScreenshot", null, false, false);
                    q0.b bVar = q0.f149800b;
                    String string = cVar.getString(R.string.lbl_share_this_activity);
                    string.getClass();
                    q0 q0VarC = q0.b.c(bVar, view2, string, null, 12);
                    q0VarC.b(R.string.lbl_share, new xp0.d(cVar, 2));
                    q0 q0VarAddCallback = q0VarC.setDuration(10000).addCallback(new d(cVar));
                    cVar.f191949b = q0VarAddCallback;
                    if (q0VarAddCallback != null) {
                        q0VarAddCallback.show();
                    }
                }
                return Unit.INSTANCE;
            case 1:
                ((p1) this.f191944c).setValue((ms1.d) this.f191943b);
                return Unit.INSTANCE;
            case 2:
                SelectTrailBottomSheet selectTrailBottomSheet = (SelectTrailBottomSheet) this.f191943b;
                ms1.d dVar = (ms1.d) this.f191944c;
                t tVar = (t) selectTrailBottomSheet.f30107g.getValue();
                tVar.getClass();
                Long l14 = dVar.f120483a;
                if (l14 != null) {
                    tVar.E4(new w0.g1(l14.longValue(), Long.valueOf(tVar.f146575z), null, null, null, false, 60, null));
                } else {
                    i2.f36769a.getClass();
                    i2.a.p(a2.ACTIVITIES, "ActivityDetailsViewModel", "Found null in curatedCourseId " + dVar);
                }
                return Unit.INSTANCE;
            case 3:
                ((e23.l) this.f191943b).invoke((z1) this.f191944c);
                return Unit.INSTANCE;
            case 4:
                ((e23.l) this.f191943b).invoke(((xy.b) this.f191944c).f192607e);
                return Unit.INSTANCE;
            case 5:
                ((e23.l) this.f191943b).invoke(((xy.d) this.f191944c).f192616c);
                return Unit.INSTANCE;
            case 6:
                xy2.k[] kVarArr = (xy2.k[]) this.f191943b;
                xy2.j jVar = (xy2.j) this.f191944c;
                int length = kVarArr.length;
                while (i14 < length) {
                    xy2.l lVar = new xy2.l(jVar, kVarArr[i14]);
                    i14++;
                    jVar = lVar;
                }
                return jVar;
            case 7:
                e23.l lVar2 = (e23.l) this.f191943b;
                b11.i iVar = (b11.i) this.f191944c;
                if (lVar2 != null) {
                    lVar2.invoke(iVar);
                }
                return Unit.INSTANCE;
            case 8:
                y22.j jVar2 = (y22.j) this.f191943b;
                ((p1) this.f191944c).setValue(Boolean.FALSE);
                jVar2.l4();
                return Unit.INSTANCE;
            case 9:
                CourseDrawingMethodActivity courseDrawingMethodActivity = (CourseDrawingMethodActivity) this.f191943b;
                com.garmin.android.apps.connectmobile.courses.model.i iVar2 = (com.garmin.android.apps.connectmobile.courses.model.i) this.f191944c;
                CourseDrawingMethodActivity.a aVar = CourseDrawingMethodActivity.f33101a;
                ht.a.f85464a.getClass();
                ht.a.a(null, "P2PCourseCreator");
                CreateCustomCourseActivity.f33013f.getClass();
                iVar2.getClass();
                com.garmin.android.apps.connectmobile.courses.model.e eVar = new com.garmin.android.apps.connectmobile.courses.model.e();
                eVar.j0(iVar2);
                eVar.sourceTypeId = 3L;
                eVar.z0(false);
                Intent intent = new Intent(courseDrawingMethodActivity, (Class<?>) CreateCustomCourseActivity.class);
                Bundle bundle = new Bundle();
                bundle.putParcelable("GCM_extra_course_detail", eVar);
                l2.f37135b.getClass();
                l2.a.b().a(intent, bundle);
                courseDrawingMethodActivity.startActivity(intent);
                return Unit.INSTANCE;
            case 10:
                y80.f fVar = (y80.f) this.f191944c;
                a2 a2Var = a2.DEVICE_SETUP;
                i2.a aVar2 = i2.f36769a;
                aVar2.getClass();
                i2.a.b(a2Var, "BleDeviceScanRepository", "awaitClose -> Stopping device scan");
                fVar.getClass();
                aVar2.getClass();
                i2.a.b(a2Var, "BleDeviceScanRepository", "stopDeviceScan() - Stopping device scan");
                ((dk2.g) fVar.f195118b.getValue()).b();
                return Unit.INSTANCE;
            case 11:
                y80.k kVar = (y80.k) this.f191944c;
                a2 a2Var2 = a2.DEVICE_SETUP;
                i2.a aVar3 = i2.f36769a;
                aVar3.getClass();
                i2.a.b(a2Var2, "BtcDeviceScanRepository", "Device scan flow is closed, stopping device scan");
                kVar.getClass();
                aVar3.getClass();
                i2.a.b(a2Var2, "BtcDeviceScanRepository", "stopDeviceScan() - Stopping device scan");
                jk2.a aVar4 = kVar.f195164b;
                if (aVar4 != null) {
                    aVar4.c(kVar.f195163a);
                }
                kVar.f195164b = null;
                return Unit.INSTANCE;
            case 12:
                y92.f fVar2 = (y92.f) this.f191943b;
                y92.f.a.C3636a c3636a = (y92.f.a.C3636a) this.f191944c;
                x92.a.f189663a.getClass();
                x92.a.a("DevicePasscodeRepository", "Closing device connection callback");
                fVar2.f195308c.f58886a.i(c3636a);
                return Unit.INSTANCE;
            case 13:
                ya0.g gVar = (ya0.g) this.f191943b;
                Context context = (Context) this.f191944c;
                context.getClass();
                ge1.b.T(v1.a(gVar), null, null, new ya0.h(context, gVar, null), 3);
                return Unit.INSTANCE;
            case 14:
                p90.a aVar5 = (p90.a) this.f191943b;
                ya0.a aVar6 = (ya0.a) this.f191944c;
                aVar5.f136458d.invoke();
                aVar6.x4(aVar5.f136455a);
                return Unit.INSTANCE;
            case 15:
                ya1.m mVar = (ya1.m) this.f191943b;
                p1 p1Var = (p1) this.f191944c;
                mVar.f195575e.invoke();
                p1Var.setValue(Boolean.valueOf(!((Boolean) p1Var.getF182175a()).booleanValue()));
                return Unit.INSTANCE;
            case 16:
                ((ya1.r) this.f191943b).f195594e.invoke((com.garmin.android.apps.connectmobile.courses.model.e) this.f191944c);
                return Unit.INSTANCE;
            case 17:
                x9.b bVar2 = (x9.b) this.f191943b;
                ConnectivityManager connectivityManager = (ConnectivityManager) this.f191944c;
                synchronized (ye.h.f196796b) {
                    LinkedHashMap linkedHashMap = ye.h.f196797c;
                    linkedHashMap.remove(bVar2);
                    if (linkedHashMap.isEmpty()) {
                        u uVarA = u.a();
                        int i16 = ye.l.f196812a;
                        uVarA.getClass();
                        connectivityManager.unregisterNetworkCallback(ye.h.f196795a);
                        ye.h.f196798d = null;
                        ye.h.f196799e = false;
                    }
                    break;
                }
                return Unit.INSTANCE;
            case 18:
                y yVar = (y) this.f191943b;
                yg2.h hVar = (yg2.h) this.f191944c;
                y.l(yVar, vg2.a.h.INSTANCE);
                hVar.A4();
                return Unit.INSTANCE;
            case 19:
                yg2.h hVar2 = (yg2.h) this.f191943b;
                Integer numI = d53.t.i((String) ((x3) this.f191944c).getF182175a());
                int iIntValue = (numI != null ? numI.intValue() : 0) - 1;
                hVar2.B4(String.valueOf(iIntValue >= 0 ? iIntValue : 0));
                hVar2.A4();
                return Unit.INSTANCE;
            case 20:
                e23.a aVar7 = (e23.a) this.f191943b;
                yg2.h hVar3 = (yg2.h) this.f191944c;
                aVar7.invoke();
                hVar3.A4();
                return Unit.INSTANCE;
            case 21:
                yk1.i iVar3 = (yk1.i) this.f191943b;
                String str = (String) this.f191944c;
                StrideLengthSettingsActivity.a aVar8 = StrideLengthSettingsActivity.f44198b;
                iVar3.D4(str);
                return Unit.INSTANCE;
            case 22:
                LocalDate localDate = (LocalDate) this.f191943b;
                yp0.f fVar3 = (yp0.f) this.f191944c;
                if (localDate != null) {
                    e32.l<yp0.l> lVar3 = fVar3.f198640a;
                    DateTime dateTimeAtStartOfDay = localDate.toDateTimeAtStartOfDay();
                    dateTimeAtStartOfDay.getClass();
                    lVar3.p4(e32.o.f62806i, dateTimeAtStartOfDay);
                }
                return Unit.INSTANCE;
            case 23:
                LocalDate localDate2 = (LocalDate) this.f191943b;
                yp0.o oVar = (yp0.o) this.f191944c;
                if (localDate2 != null) {
                    e32.l<yp0.l> lVar4 = oVar.f198680a;
                    DateTime dateTimeAtStartOfDay2 = localDate2.toDateTimeAtStartOfDay();
                    dateTimeAtStartOfDay2.getClass();
                    lVar4.p4(e32.o.f62807j, dateTimeAtStartOfDay2);
                }
                return Unit.INSTANCE;
            case 24:
                ((e23.l) this.f191943b).invoke((tq0.e) this.f191944c);
                return Unit.INSTANCE;
            case 25:
                nr.g.d dVar2 = (nr.g.d) this.f191943b;
                p1 p1Var2 = (p1) this.f191944c;
                dVar2.f127054c.invoke();
                p1Var2.setValue(Boolean.FALSE);
                return Unit.INSTANCE;
            case 26:
                nr.g.m mVar2 = (nr.g.m) this.f191943b;
                p1 p1Var3 = (p1) this.f191944c;
                if (s3.b()) {
                    p1Var3.setValue(Boolean.TRUE);
                } else {
                    e23.l<PrivacyType, Unit> lVar5 = mVar2.f127094h;
                    if (lVar5 != null) {
                        lVar5.invoke(mVar2.f127096j);
                    }
                }
                return Unit.INSTANCE;
            case 27:
                nr.g.s sVar = (nr.g.s) this.f191943b;
                ((p1) this.f191944c).setValue(Boolean.FALSE);
                sVar.f127131h.invoke();
                return Unit.INSTANCE;
            case 28:
                ((e23.l) this.f191943b).invoke((pt1.i) this.f191944c);
                return Unit.INSTANCE;
            default:
                com.garmin.realtimesettings.app.presentationlayer.c cVar2 = (com.garmin.realtimesettings.app.presentationlayer.c) this.f191943b;
                jw2.a aVar9 = (jw2.a) this.f191944c;
                com.garmin.realtimesettings.app.presentationlayer.c.a aVar10 = com.garmin.realtimesettings.app.presentationlayer.c.f52641v;
                cVar2.G6(aVar9.f101364b, aVar9.f101363a);
                aVar9.f101366d = null;
                aVar9.f101364b = false;
                aVar9.f101363a = false;
                return Unit.INSTANCE;
        }
    }
}
