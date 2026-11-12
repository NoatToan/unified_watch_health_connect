package lo;

import android.content.Context;
import android.content.Intent;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.activities.stats.ActivityPrivacyTypesActivity;

/* JADX INFO: loaded from: classes7.dex */
public class v extends f0.c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f0 f113975b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(f0 f0Var) {
        super(f0Var, 0);
        this.f113975b = f0Var;
    }

    @Override // lo.f0.c
    public final void a(f0.d dVar) {
        boolean zB = c22.s3.b();
        f0 f0Var = this.f113975b;
        if (zB) {
            Context context = f0Var.f113821r.getContext();
            context.getClass();
            ht.a.f85464a.getClass();
            ht.a.a(null, "ChildActivityPrivacyTapped");
            new androidx.appcompat.app.e.a(context).setTitle(R.string.lbl_activity_set_to_private).setMessage(R.string.msg_activity_set_to_private).setPositiveButton(R.string.lbl_ok, new f20.i(4)).setCancelable(false).create().show();
            return;
        }
        am.l lVar = f0Var.H1;
        t tVar = (t) dVar;
        Context contextRequireContext = tVar.requireContext();
        int i14 = ActivityPrivacyTypesActivity.f29759c;
        Intent intent = new Intent(contextRequireContext, (Class<?>) ActivityPrivacyTypesActivity.class);
        intent.putExtra("GCM_extra_privacy_type", lVar.f4054a);
        tVar.startActivityForResult(intent, 12);
    }
}
