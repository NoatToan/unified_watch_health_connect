package r50;

import android.content.Intent;
import android.os.Bundle;
import com.garmin.android.apps.connectmobile.courses.presentation.planner.CoursePointListActivity;
import org.koin.core.parameter.ParametersHolderKt;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class f implements e23.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f150420a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ CoursePointListActivity f150421b;

    public /* synthetic */ f(CoursePointListActivity coursePointListActivity, int i14) {
        this.f150420a = i14;
        this.f150421b = coursePointListActivity;
    }

    @Override // e23.a
    public final Object invoke() {
        Bundle extras;
        int i14 = this.f150420a;
        CoursePointListActivity coursePointListActivity = this.f150421b;
        switch (i14) {
            case 0:
                CoursePointListActivity.a aVar = CoursePointListActivity.f33079c;
                coursePointListActivity.da().x4();
                coursePointListActivity.da().z4();
                return Unit.INSTANCE;
            case 1:
                CoursePointListActivity.a aVar2 = CoursePointListActivity.f33079c;
                coursePointListActivity.da().x4();
                coursePointListActivity.da().z4();
                return Unit.INSTANCE;
            default:
                CoursePointListActivity.a aVar3 = CoursePointListActivity.f33079c;
                com.garmin.android.apps.connectmobile.courses.model.e eVarC = ((s20.g) KoinJavaComponent.get$default(s20.g.class, null, null, 6, null)).C();
                Intent intent = coursePointListActivity.getIntent();
                boolean z14 = false;
                if (intent != null && (extras = intent.getExtras()) != null) {
                    z14 = extras.getBoolean("isCreatingCourse", false);
                }
                return ParametersHolderKt.parametersOf(eVarC, Boolean.valueOf(z14));
        }
    }
}
