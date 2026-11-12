package bs1;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.garmin.android.apps.connectmobile.R;
import sz0.e;

/* JADX INFO: loaded from: classes10.dex */
public class b implements gc2.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f19652a = new a();

    @Override // gc2.a
    public final void a(int i14, Context context) {
        a aVar = this.f19652a;
        if (i14 == 1) {
            aVar.getClass();
            Intent intentA = a.a();
            a.C0295a c0295a = new a.C0295a();
            String string = context.getString(R.string.android_notfication_title_ciq_filetransfer_failure);
            String string2 = context.getString(R.string.android_notification_ciq_filetransfer_failure);
            if (!TextUtils.isEmpty(null)) {
                string2 = String.format(null, string2);
            }
            c0295a.f19649a = string2;
            c0295a.f19650b = context.getString(R.string.android_notification_update_failure_second_line);
            c0295a.f19651c = context.getString(R.string.android_notification_update_failure_thirdline_learn_more);
            a.b(context, e.f161374m, intentA, string, c0295a);
            return;
        }
        if (i14 == 2 || i14 == 3) {
            aVar.getClass();
            Intent intentA2 = a.a();
            a.C0295a c0295a2 = new a.C0295a();
            String string3 = context.getString(R.string.android_notification_title_courses_filetransfer_failure);
            String string4 = context.getString(R.string.android_notification_courses_workout_filetransfer_failure);
            if (!TextUtils.isEmpty(null)) {
                string4 = String.format(null, string4);
            }
            c0295a2.f19649a = string4;
            c0295a2.f19650b = context.getString(R.string.android_notification_update_failure_second_line);
            c0295a2.f19651c = context.getString(R.string.android_notification_update_failure_thirdline_learn_more);
            a.b(context, e.f161377p, intentA2, string3, c0295a2);
            return;
        }
        if (i14 != 4) {
            return;
        }
        aVar.getClass();
        Intent intentA3 = a.a();
        a.C0295a c0295a3 = new a.C0295a();
        String string5 = context.getString(R.string.android_notification_title_softwareupdate_failure);
        String string6 = context.getString(R.string.android_notification_softwareupdate_failure);
        if (!TextUtils.isEmpty(null)) {
            string6 = String.format(null, string6);
        }
        c0295a3.f19649a = string6;
        c0295a3.f19650b = context.getString(R.string.android_notification_update_failure_second_line);
        c0295a3.f19651c = context.getString(R.string.android_notification_update_failure_thirdline_learn_more);
        a.b(context, e.f161378q, intentA3, string5, c0295a3);
    }
}
