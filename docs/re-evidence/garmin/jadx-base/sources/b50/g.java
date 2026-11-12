package b50;

import android.os.Build;
import android.os.Bundle;
import com.garmin.android.apps.connectmobile.courses.presentation.details.CourseDetailsActivity;
import org.koin.core.parameter.ParametersHolderKt;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class g implements e23.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15979a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ CourseDetailsActivity f15980b;

    public /* synthetic */ g(CourseDetailsActivity courseDetailsActivity, int i14) {
        this.f15979a = i14;
        this.f15980b = courseDetailsActivity;
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0035  */
    @Override // e23.a
    public final Object invoke() {
        com.garmin.android.apps.connectmobile.courses.model.i iVar;
        Object serializable;
        int i14 = this.f15979a;
        CourseDetailsActivity courseDetailsActivity = this.f15980b;
        switch (i14) {
            case 0:
                CourseDetailsActivity.a aVar = CourseDetailsActivity.f33024k;
                p pVarIa = courseDetailsActivity.ia();
                pVarIa.getClass();
                pVarIa.z4(e50.b.a.f62947a);
                return Unit.INSTANCE;
            default:
                Bundle bundle = courseDetailsActivity.f33025a;
                String string = bundle != null ? bundle.getString("GCM_extra_course_id") : null;
                Bundle bundle2 = courseDetailsActivity.f33025a;
                if (bundle2 == null) {
                    iVar = com.garmin.android.apps.connectmobile.courses.model.i.OTHER;
                } else {
                    if (Build.VERSION.SDK_INT >= 33) {
                        serializable = bundle2.getSerializable("GCM_extra_course_type", com.garmin.android.apps.connectmobile.courses.model.i.class);
                    } else {
                        Object serializable2 = bundle2.getSerializable("GCM_extra_course_type");
                        serializable = (com.garmin.android.apps.connectmobile.courses.model.i) (serializable2 instanceof com.garmin.android.apps.connectmobile.courses.model.i ? serializable2 : null);
                    }
                    iVar = (com.garmin.android.apps.connectmobile.courses.model.i) serializable;
                    if (iVar == null) {
                        iVar = com.garmin.android.apps.connectmobile.courses.model.i.OTHER;
                    }
                }
                boolean zC = iVar.c();
                boolean z14 = iVar == com.garmin.android.apps.connectmobile.courses.model.i.RUNNING || iVar == com.garmin.android.apps.connectmobile.courses.model.i.TRAIL_RUNNING;
                Bundle bundle3 = courseDetailsActivity.f33025a;
                boolean z15 = bundle3 != null ? bundle3.getBoolean("readOnlyMode", false) : false;
                Bundle bundle4 = courseDetailsActivity.f33025a;
                return ParametersHolderKt.parametersOf(string, Boolean.valueOf(zC), Boolean.valueOf(z14), Boolean.valueOf(z15), Boolean.valueOf(bundle4 != null ? bundle4.getBoolean("deep_link", false) : false));
        }
    }
}
