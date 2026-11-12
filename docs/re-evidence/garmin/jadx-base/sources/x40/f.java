package x40;

import com.garmin.android.apps.connectmobile.courses.presentation.custom.CreateCustomCourseActivity;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class f implements e23.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f188681a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ CreateCustomCourseActivity f188682b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.garmin.android.apps.connectmobile.courses.model.g f188683c;

    public /* synthetic */ f(CreateCustomCourseActivity createCustomCourseActivity, com.garmin.android.apps.connectmobile.courses.model.g gVar, int i14) {
        this.f188681a = i14;
        this.f188682b = createCustomCourseActivity;
        this.f188683c = gVar;
    }

    @Override // e23.a
    public final Object invoke() {
        int i14 = this.f188681a;
        com.garmin.android.apps.connectmobile.courses.model.g gVar = this.f188683c;
        CreateCustomCourseActivity createCustomCourseActivity = this.f188682b;
        switch (i14) {
            case 0:
                CreateCustomCourseActivity.a aVar = CreateCustomCourseActivity.f33013f;
                l0 l0VarFa = createCustomCourseActivity.fa();
                l0VarFa.getClass();
                gVar.getClass();
                l0VarFa.D4(new a50.e.m(gVar));
                break;
            case 1:
                CreateCustomCourseActivity.a aVar2 = CreateCustomCourseActivity.f33013f;
                l0 l0VarFa2 = createCustomCourseActivity.fa();
                l0VarFa2.getClass();
                gVar.getClass();
                l0VarFa2.D4(new a50.e.g(gVar));
                break;
            case 2:
                CreateCustomCourseActivity.a aVar3 = CreateCustomCourseActivity.f33013f;
                createCustomCourseActivity.fa().C4();
                l0 l0VarFa3 = createCustomCourseActivity.fa();
                l0VarFa3.getClass();
                gVar.getClass();
                l0VarFa3.D4(new a50.e.t(gVar));
                break;
            default:
                CreateCustomCourseActivity.a aVar4 = CreateCustomCourseActivity.f33013f;
                l0 l0VarFa4 = createCustomCourseActivity.fa();
                l0VarFa4.getClass();
                l0VarFa4.D4(new a50.e.c0(gVar));
                createCustomCourseActivity.fa().A4();
                break;
        }
        return Unit.INSTANCE;
    }
}
