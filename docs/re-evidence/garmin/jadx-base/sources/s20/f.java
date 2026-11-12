package s20;

import android.content.Context;
import com.garmin.android.apps.connectmobile.R;

/* JADX INFO: loaded from: classes8.dex */
public final class f {
    public static final void a(Context context) {
        ht.a.f85464a.getClass();
        ht.a.a(null, "ChildCoursePrivacyTapped");
        androidx.appcompat.app.e.a aVar = new androidx.appcompat.app.e.a(context, 0);
        aVar.setTitle(context.getString(R.string.lbl_public_course_not_supported));
        aVar.setMessage(context.getString(R.string.msg_public_courses_not_supported));
        aVar.setCancelable(false);
        aVar.setPositiveButton(context.getString(R.string.lbl_ok), new qh1.j(10));
        aVar.create().show();
    }
}
