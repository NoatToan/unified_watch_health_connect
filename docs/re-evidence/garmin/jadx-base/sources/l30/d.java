package l30;

import android.content.DialogInterface;
import android.net.Uri;
import com.garmin.android.apps.connectmobile.courses.presentation.automatic.CreateCourseActivity;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class d implements DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f109556a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ CreateCourseActivity f109557b;

    public /* synthetic */ d(CreateCourseActivity createCourseActivity, int i14) {
        this.f109556a = i14;
        this.f109557b = createCourseActivity;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i14) {
        int i15 = this.f109556a;
        CreateCourseActivity createCourseActivity = this.f109557b;
        switch (i15) {
            case 0:
                CreateCourseActivity.a aVar = CreateCourseActivity.f32989g;
                createCourseActivity.fa(new n30.a.v(false));
                break;
            default:
                CreateCourseActivity.a aVar2 = CreateCourseActivity.f32989g;
                g22.a.c(createCourseActivity, Uri.parse("https://support.garmin.com/sas/gcapp/?productId=125677&contentId=4SKJEVdUWL11K9escSVn96"));
                break;
        }
    }
}
