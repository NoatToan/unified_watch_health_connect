package l30;

import android.os.Bundle;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.courses.presentation.automatic.CreateCourseActivity;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class c implements e23.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f109550a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ CreateCourseActivity f109551b;

    public /* synthetic */ c(CreateCourseActivity createCourseActivity, int i14) {
        this.f109550a = i14;
        this.f109551b = createCourseActivity;
    }

    @Override // e23.l
    public final Object invoke(Object obj) {
        com.garmin.android.apps.connectmobile.courses.model.i iVarM;
        int i14 = this.f109550a;
        boolean z14 = true;
        int i15 = 0;
        CreateCourseActivity createCourseActivity = this.f109551b;
        switch (i14) {
            case 0:
                int iIntValue = ((Integer) obj).intValue();
                CreateCourseActivity.a aVar = CreateCourseActivity.f32989g;
                createCourseActivity.ea().D4(iIntValue == 3);
                break;
            case 1:
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                Bundle bundle = createCourseActivity.f32993d;
                if ((bundle != null ? bundle.getBoolean("GCM_extra_course_has_linked_events", false) : false) && !zBooleanValue) {
                    s20.h hVar = (s20.h) KoinJavaComponent.get$default(s20.h.class, null, null, 6, null);
                    com.garmin.android.apps.connectmobile.courses.model.e eVarDa = createCourseActivity.da();
                    if (((eVarDa == null || (iVarM = eVarDa.m()) == null || !iVarM.c() || !hVar.a() || sa1.h.e(eVarDa.q())) ? (char) 0 : (char) 1) != 0) {
                        new androidx.appcompat.app.e.a(createCourseActivity).setTitle(R.string.ti_make_course_private).setMessage(createCourseActivity.getString(R.string.make_course_private_message, createCourseActivity.getString(R.string.power_guide_title))).setNegativeButton(R.string.lbl_cancel, new jm0.c(9)).setPositiveButton(R.string.lbl_course_make_private, new d(createCourseActivity, i15)).show();
                    }
                }
                createCourseActivity.fa(new n30.a.v(zBooleanValue));
                break;
            case 2:
                com.garmin.android.apps.connectmobile.courses.model.i iVar = (com.garmin.android.apps.connectmobile.courses.model.i) obj;
                CreateCourseActivity.a aVar2 = CreateCourseActivity.f32989g;
                iVar.getClass();
                createCourseActivity.fa(new n30.a.w(iVar));
                break;
            case 3:
                int iIntValue2 = ((Integer) obj).intValue();
                CreateCourseActivity.a aVar3 = CreateCourseActivity.f32989g;
                createCourseActivity.ea().D4(iIntValue2 == 3);
                break;
            case 4:
                int iIntValue3 = ((Integer) obj).intValue();
                CreateCourseActivity.a aVar4 = CreateCourseActivity.f32989g;
                z zVarEa = createCourseActivity.ea();
                zVarEa.getClass();
                zVarEa.z4(new n30.c.w(iIntValue3));
                break;
            case 5:
                com.garmin.android.apps.connectmobile.courses.model.g gVar = (com.garmin.android.apps.connectmobile.courses.model.g) obj;
                CreateCourseActivity.a aVar5 = CreateCourseActivity.f32989g;
                gVar.getClass();
                androidx.fragment.app.v supportFragmentManager = createCourseActivity.getSupportFragmentManager();
                supportFragmentManager.getClass();
                c60.e.t(supportFragmentManager, new f(createCourseActivity, gVar, i15), new f(createCourseActivity, gVar, z14 ? 1 : 0), new f(createCourseActivity, gVar, 2));
                break;
            case 6:
                int iIntValue4 = ((Integer) obj).intValue();
                CreateCourseActivity.a aVar6 = CreateCourseActivity.f32989g;
                createCourseActivity.ea().D4(iIntValue4 == 3);
                break;
            case 7:
                int iIntValue5 = ((Integer) obj).intValue();
                CreateCourseActivity.a aVar7 = CreateCourseActivity.f32989g;
                createCourseActivity.ea().D4(iIntValue5 == 3);
                break;
            case 8:
                ((Boolean) obj).getClass();
                CreateCourseActivity.a aVar8 = CreateCourseActivity.f32989g;
                createCourseActivity.ea().y4();
                createCourseActivity.ea().x4();
                break;
            case 9:
                com.garmin.android.apps.connectmobile.courses.model.f fVar = (com.garmin.android.apps.connectmobile.courses.model.f) obj;
                CreateCourseActivity.a aVar9 = CreateCourseActivity.f32989g;
                fVar.getClass();
                z zVarEa2 = createCourseActivity.ea();
                zVarEa2.getClass();
                zVarEa2.z4(new n30.c.h(fVar));
                createCourseActivity.ea().A4();
                androidx.fragment.app.v supportFragmentManager2 = createCourseActivity.getSupportFragmentManager();
                supportFragmentManager2.getClass();
                c60.e.e(supportFragmentManager2, new c(createCourseActivity, 11), new a(createCourseActivity, 4), new k11.h(28, createCourseActivity, fVar));
                break;
            case 10:
                int iIntValue6 = ((Integer) obj).intValue();
                CreateCourseActivity.a aVar10 = CreateCourseActivity.f32989g;
                createCourseActivity.ea().D4(iIntValue6 == 3);
                break;
            case 11:
                int iIntValue7 = ((Integer) obj).intValue();
                CreateCourseActivity.a aVar11 = CreateCourseActivity.f32989g;
                createCourseActivity.ea().D4(iIntValue7 == 3);
                break;
            case 12:
                int iIntValue8 = ((Integer) obj).intValue();
                CreateCourseActivity.a aVar12 = CreateCourseActivity.f32989g;
                createCourseActivity.ea().D4(iIntValue8 == 3);
                break;
            case 13:
                int iIntValue9 = ((Integer) obj).intValue();
                CreateCourseActivity.a aVar13 = CreateCourseActivity.f32989g;
                z zVarEa3 = createCourseActivity.ea();
                zVarEa3.getClass();
                zVarEa3.z4(new n30.c.w(iIntValue9));
                createCourseActivity.ea().x4();
                break;
            case 14:
                int iIntValue10 = ((Integer) obj).intValue();
                CreateCourseActivity.a aVar14 = CreateCourseActivity.f32989g;
                createCourseActivity.ea().D4(iIntValue10 == 3);
                break;
            case 15:
                int iIntValue11 = ((Integer) obj).intValue();
                CreateCourseActivity.a aVar15 = CreateCourseActivity.f32989g;
                createCourseActivity.ea().D4(iIntValue11 == 3);
                break;
            case 16:
                com.garmin.android.apps.connectmobile.courses.model.g gVar2 = (com.garmin.android.apps.connectmobile.courses.model.g) obj;
                CreateCourseActivity.a aVar16 = CreateCourseActivity.f32989g;
                gVar2.getClass();
                androidx.fragment.app.v supportFragmentManager3 = createCourseActivity.getSupportFragmentManager();
                supportFragmentManager3.getClass();
                c60.e.o(gVar2, supportFragmentManager3, new j(createCourseActivity, gVar2));
                break;
            default:
                int iIntValue12 = ((Integer) obj).intValue();
                CreateCourseActivity.a aVar17 = CreateCourseActivity.f32989g;
                createCourseActivity.ea().D4(iIntValue12 == 3);
                break;
        }
        return Unit.INSTANCE;
    }
}
