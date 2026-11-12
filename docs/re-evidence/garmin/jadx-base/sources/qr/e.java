package qr;

import android.view.View;
import com.garmin.android.apps.connectmobile.activity.details.presentation.ActivityDetailsFragment;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class e implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f146173a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ActivityDetailsFragment f146174b;

    public /* synthetic */ e(ActivityDetailsFragment activityDetailsFragment, int i14) {
        this.f146173a = i14;
        this.f146174b = activityDetailsFragment;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view2) {
        switch (this.f146173a) {
            case 0:
                r22.m0 m0Var = this.f146174b.f29996i;
                if (m0Var != null) {
                    m0Var.dismiss();
                }
                break;
            default:
                r22.m0 m0Var2 = this.f146174b.f29996i;
                if (m0Var2 != null) {
                    m0Var2.dismiss();
                }
                break;
        }
    }
}
