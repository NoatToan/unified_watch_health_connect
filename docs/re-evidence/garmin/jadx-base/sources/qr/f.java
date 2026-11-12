package qr;

import android.content.Context;
import android.view.View;
import com.garmin.android.apps.connectmobile.activity.details.presentation.ActivityDetailsFragment;
import org.koin.java.KoinJavaComponent;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class f implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f146198a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ActivityDetailsFragment f146199b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f146200c;

    public /* synthetic */ f(ActivityDetailsFragment activityDetailsFragment, String str, int i14) {
        this.f146198a = i14;
        this.f146199b = activityDetailsFragment;
        this.f146200c = str;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view2) {
        int i14 = this.f146198a;
        String str = this.f146200c;
        ActivityDetailsFragment activityDetailsFragment = this.f146199b;
        switch (i14) {
            case 0:
                int i15 = ActivityDetailsFragment.I;
                activityDetailsFragment.getClass();
                am.d dVar = (am.d) KoinJavaComponent.get$default(am.d.class, null, null, 6, null);
                Context contextRequireContext = activityDetailsFragment.requireContext();
                contextRequireContext.getClass();
                activityDetailsFragment.B.a(dVar.i0(contextRequireContext, str), null);
                break;
            default:
                int i16 = ActivityDetailsFragment.I;
                activityDetailsFragment.getClass();
                xn.j.f191609g.getClass();
                ActivityDetailsFragment.M6(activityDetailsFragment, ro0.l.FIVE_HZ_DATA_RECORDING, null, xn.j.a.a(str), 2);
                break;
        }
    }
}
