package x40;

import android.content.DialogInterface;
import com.garmin.android.apps.connectmobile.courses.presentation.custom.CreateCustomCourseActivity;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class b implements DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f188660a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ CreateCustomCourseActivity f188661b;

    public /* synthetic */ b(CreateCustomCourseActivity createCustomCourseActivity, int i14) {
        this.f188660a = i14;
        this.f188661b = createCustomCourseActivity;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i14) {
        int i15 = this.f188660a;
        CreateCustomCourseActivity createCustomCourseActivity = this.f188661b;
        switch (i15) {
            case 0:
                CreateCustomCourseActivity.a aVar = CreateCustomCourseActivity.f33013f;
                createCustomCourseActivity.fa().G4(a50.c.a0.f1252a);
                break;
            case 1:
                CreateCustomCourseActivity.a aVar2 = CreateCustomCourseActivity.f33013f;
                createCustomCourseActivity.fa().G4(a50.c.a0.f1252a);
                break;
            case 2:
                CreateCustomCourseActivity.a aVar3 = CreateCustomCourseActivity.f33013f;
                createCustomCourseActivity.ha(new a50.c.j0(false));
                break;
            default:
                CreateCustomCourseActivity.a aVar4 = CreateCustomCourseActivity.f33013f;
                createCustomCourseActivity.fa().G4(a50.c.a0.f1252a);
                break;
        }
    }
}
