package x40;

import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import com.garmin.android.apps.connectmobile.courses.presentation.custom.CreateCustomCourseActivity;
import java.util.ArrayList;
import org.koin.core.parameter.ParametersHolderKt;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class c implements e23.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f188664a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ CreateCustomCourseActivity f188665b;

    public /* synthetic */ c(CreateCustomCourseActivity createCustomCourseActivity, int i14) {
        this.f188664a = i14;
        this.f188665b = createCustomCourseActivity;
    }

    /* JADX WARN: Code duplicated, block: B:29:0x00ad  */
    @Override // e23.a
    public final Object invoke() {
        com.garmin.android.apps.connectmobile.courses.model.e eVar;
        ArrayList parcelableArrayList;
        ArrayList parcelableArrayList2;
        Parcelable parcelable;
        int i14 = this.f188664a;
        CreateCustomCourseActivity createCustomCourseActivity = this.f188665b;
        switch (i14) {
            case 0:
                CreateCustomCourseActivity.a aVar = CreateCustomCourseActivity.f33013f;
                createCustomCourseActivity.ha(a50.c.s.f1302a);
                return Unit.INSTANCE;
            case 1:
                CreateCustomCourseActivity.a aVar2 = CreateCustomCourseActivity.f33013f;
                createCustomCourseActivity.ha(a50.c.i.f1279a);
                return Unit.INSTANCE;
            case 2:
                CreateCustomCourseActivity.a aVar3 = CreateCustomCourseActivity.f33013f;
                createCustomCourseActivity.fa().A4();
                return Unit.INSTANCE;
            case 3:
                CreateCustomCourseActivity.a aVar4 = CreateCustomCourseActivity.f33013f;
                createCustomCourseActivity.fa().C4();
                createCustomCourseActivity.fa().A4();
                return Unit.INSTANCE;
            case 4:
                Bundle bundle = createCustomCourseActivity.f33016c;
                if (bundle == null) {
                    eVar = new com.garmin.android.apps.connectmobile.courses.model.e();
                } else {
                    if (Build.VERSION.SDK_INT >= 33) {
                        parcelable = (Parcelable) bundle.getParcelable("GCM_extra_course_detail", com.garmin.android.apps.connectmobile.courses.model.e.class);
                    } else {
                        Parcelable parcelable2 = bundle.getParcelable("GCM_extra_course_detail");
                        if (!(parcelable2 instanceof com.garmin.android.apps.connectmobile.courses.model.e)) {
                            parcelable2 = null;
                        }
                        parcelable = (com.garmin.android.apps.connectmobile.courses.model.e) parcelable2;
                    }
                    eVar = (com.garmin.android.apps.connectmobile.courses.model.e) parcelable;
                    if (eVar == null) {
                        eVar = new com.garmin.android.apps.connectmobile.courses.model.e();
                    }
                }
                Bundle bundle2 = createCustomCourseActivity.f33016c;
                boolean z14 = bundle2 != null ? bundle2.getBoolean("EXTRA_COURSE_IMPORTED", false) : false;
                Bundle bundle3 = createCustomCourseActivity.f33016c;
                if (bundle3 != null) {
                    parcelableArrayList = Build.VERSION.SDK_INT >= 33 ? bundle3.getParcelableArrayList("EXTRA_RELATED_PACEBANDS", com.garmin.android.apps.connectmobile.pacepro.data.dto.b.class) : bundle3.getParcelableArrayList("EXTRA_RELATED_PACEBANDS");
                } else {
                    parcelableArrayList = null;
                }
                Bundle bundle4 = createCustomCourseActivity.f33016c;
                if (bundle4 != null) {
                    parcelableArrayList2 = Build.VERSION.SDK_INT >= 33 ? bundle4.getParcelableArrayList("EXTRA_RELATED_POWER_GUIDES", ab1.g.class) : bundle4.getParcelableArrayList("EXTRA_RELATED_POWER_GUIDES");
                } else {
                    parcelableArrayList2 = null;
                }
                return ParametersHolderKt.parametersOf(eVar, Boolean.valueOf(z14), parcelableArrayList, parcelableArrayList2 != null ? (ab1.g) p13.h0.d0(parcelableArrayList2) : null);
            case 5:
                CreateCustomCourseActivity.a aVar5 = CreateCustomCourseActivity.f33013f;
                createCustomCourseActivity.fa().A4();
                return Unit.INSTANCE;
            case 6:
                CreateCustomCourseActivity.a aVar6 = CreateCustomCourseActivity.f33013f;
                createCustomCourseActivity.fa().A4();
                l0 l0VarFa = createCustomCourseActivity.fa();
                l0VarFa.getClass();
                l0VarFa.D4(new a50.e.i0(true));
                l0 l0VarFa2 = createCustomCourseActivity.fa();
                l0VarFa2.getClass();
                l0VarFa2.D4(a50.e.d.f1336a);
                return Unit.INSTANCE;
            case 7:
                CreateCustomCourseActivity.a aVar7 = CreateCustomCourseActivity.f33013f;
                createCustomCourseActivity.fa().C4();
                createCustomCourseActivity.fa().A4();
                return Unit.INSTANCE;
            case 8:
                CreateCustomCourseActivity.a aVar8 = CreateCustomCourseActivity.f33013f;
                createCustomCourseActivity.fa().C4();
                createCustomCourseActivity.fa().A4();
                return Unit.INSTANCE;
            default:
                CreateCustomCourseActivity.a aVar9 = CreateCustomCourseActivity.f33013f;
                if (createCustomCourseActivity.hasInternetConnection()) {
                    l0 l0VarFa3 = createCustomCourseActivity.fa();
                    l0VarFa3.getClass();
                    l0VarFa3.D4(a50.e.i.f1346a);
                } else {
                    createCustomCourseActivity.displayFailedMessage();
                }
                createCustomCourseActivity.fa().C4();
                createCustomCourseActivity.fa().A4();
                return Unit.INSTANCE;
        }
    }
}
