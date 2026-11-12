package l30;

import com.garmin.android.apps.connectmobile.courses.presentation.automatic.CreateCourseActivity;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class f implements e23.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f109569a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ CreateCourseActivity f109570b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.garmin.android.apps.connectmobile.courses.model.g f109571c;

    public /* synthetic */ f(CreateCourseActivity createCourseActivity, com.garmin.android.apps.connectmobile.courses.model.g gVar, int i14) {
        this.f109569a = i14;
        this.f109570b = createCourseActivity;
        this.f109571c = gVar;
    }

    @Override // e23.a
    public final Object invoke() {
        int i14 = this.f109569a;
        com.garmin.android.apps.connectmobile.courses.model.g gVar = this.f109571c;
        CreateCourseActivity createCourseActivity = this.f109570b;
        switch (i14) {
            case 0:
                CreateCourseActivity.a aVar = CreateCourseActivity.f32989g;
                z zVarEa = createCourseActivity.ea();
                zVarEa.getClass();
                gVar.getClass();
                zVarEa.z4(new n30.c.j(gVar));
                break;
            case 1:
                CreateCourseActivity.a aVar2 = CreateCourseActivity.f32989g;
                z zVarEa2 = createCourseActivity.ea();
                zVarEa2.getClass();
                gVar.getClass();
                zVarEa2.z4(new n30.c.f(gVar));
                break;
            case 2:
                CreateCourseActivity.a aVar3 = CreateCourseActivity.f32989g;
                createCourseActivity.ea().y4();
                z zVarEa3 = createCourseActivity.ea();
                zVarEa3.getClass();
                gVar.getClass();
                zVarEa3.z4(new n30.c.q(gVar));
                break;
            default:
                CreateCourseActivity.a aVar4 = CreateCourseActivity.f32989g;
                z zVarEa4 = createCourseActivity.ea();
                zVarEa4.getClass();
                zVarEa4.z4(new n30.c.z(gVar));
                createCourseActivity.ea().x4();
                break;
        }
        return Unit.INSTANCE;
    }
}
