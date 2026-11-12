package ii0;

import android.app.Activity;
import android.view.View;
import com.garmin.android.apps.connectmobile.help.HelpActivity;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class j implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f93643a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Activity f93644b;

    public /* synthetic */ j(Activity activity, int i14) {
        this.f93643a = i14;
        this.f93644b = activity;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view2) {
        switch (this.f93643a) {
            case 0:
                j22.b.f96736a.getClass();
                j22.b.r(this.f93644b);
                break;
            default:
                HelpActivity.da(this.f93644b, ro0.l.ACTIVITY_WORKOUT_SELF_EVALUATION, null, null);
                break;
        }
    }
}
