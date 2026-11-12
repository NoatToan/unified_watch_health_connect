package l30;

import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import com.garmin.android.apps.connectmobile.courses.presentation.automatic.MultipleCoursesActivity;
import org.koin.core.parameter.ParametersHolderKt;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class x0 implements e23.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f109642a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ MultipleCoursesActivity f109643b;

    public /* synthetic */ x0(MultipleCoursesActivity multipleCoursesActivity, int i14) {
        this.f109642a = i14;
        this.f109643b = multipleCoursesActivity;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0028  */
    @Override // e23.a
    public final Object invoke() {
        com.garmin.android.apps.connectmobile.courses.model.i iVar;
        Parcelable parcelable;
        Object serializable;
        int i14 = this.f109642a;
        MultipleCoursesActivity multipleCoursesActivity = this.f109643b;
        switch (i14) {
            case 0:
                MultipleCoursesActivity.a aVar = MultipleCoursesActivity.f33000c;
                multipleCoursesActivity.ea(n30.i.a.f123473a);
                return Unit.INSTANCE;
            default:
                Bundle bundle = multipleCoursesActivity.f33001a;
                Parcelable parcelable2 = null;
                if (bundle == null) {
                    iVar = com.garmin.android.apps.connectmobile.courses.model.i.OTHER;
                } else {
                    if (Build.VERSION.SDK_INT >= 33) {
                        serializable = bundle.getSerializable("GCM_extra_course_type", com.garmin.android.apps.connectmobile.courses.model.i.class);
                    } else {
                        Object serializable2 = bundle.getSerializable("GCM_extra_course_type");
                        if (!(serializable2 instanceof com.garmin.android.apps.connectmobile.courses.model.i)) {
                            serializable2 = null;
                        }
                        serializable = (com.garmin.android.apps.connectmobile.courses.model.i) serializable2;
                    }
                    iVar = (com.garmin.android.apps.connectmobile.courses.model.i) serializable;
                    if (iVar == null) {
                        iVar = com.garmin.android.apps.connectmobile.courses.model.i.OTHER;
                    }
                }
                Bundle bundle2 = multipleCoursesActivity.f33001a;
                String string = bundle2 != null ? bundle2.getString("GCM_extra_course_name") : null;
                if (string == null) {
                    string = "";
                }
                Bundle bundle3 = multipleCoursesActivity.f33001a;
                if (bundle3 != null) {
                    if (Build.VERSION.SDK_INT >= 33) {
                        parcelable = (Parcelable) bundle3.getParcelable("GCM_extra_automatic_course_params", n30.e.class);
                    } else {
                        Parcelable parcelable3 = bundle3.getParcelable("GCM_extra_automatic_course_params");
                        parcelable = (n30.e) (parcelable3 instanceof n30.e ? parcelable3 : null);
                    }
                    parcelable2 = (n30.e) parcelable;
                }
                return ParametersHolderKt.parametersOf(iVar, string, parcelable2);
        }
    }
}
