package ls0;

import android.view.View;
import androidx.core.view.m1;
import com.garmin.android.apps.connectmobile.promotions.CampaignInfoFullScreenActivity;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class t implements androidx.core.view.z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f114767a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ View f114768b;

    public /* synthetic */ t(View view2, int i14) {
        this.f114767a = i14;
        this.f114768b = view2;
    }

    @Override // androidx.core.view.z
    public final m1 onApplyWindowInsets(View view2, m1 m1Var) {
        int i14 = this.f114767a;
        View view3 = this.f114768b;
        switch (i14) {
            case 0:
                view2.getClass();
                c7.e eVarI = m1Var.f6508a.i(2);
                eVarI.getClass();
                view3.setPadding(view3.getPaddingLeft(), view3.getPaddingTop(), view3.getPaddingRight(), eVarI.f25193d);
                break;
            default:
                CampaignInfoFullScreenActivity.a aVar = CampaignInfoFullScreenActivity.f41033o;
                view2.getClass();
                view2.setPadding(view3.getPaddingLeft(), view3.getPaddingTop(), view3.getPaddingRight(), view3.getPaddingBottom() + m1Var.f6508a.i(2).f25193d);
                break;
        }
        return m1Var;
    }
}
