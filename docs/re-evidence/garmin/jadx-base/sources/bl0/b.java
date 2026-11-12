package bl0;

import android.text.Editable;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.connections.groups.details.GroupActivityFeedTypeMainFragment;
import com.garmin.android.apps.connectmobile.devices.model.f;
import com.garmin.android.apps.connectmobile.strava.m;
import e23.l;
import fr1.i;
import fr1.j;
import ig1.d0;
import ig1.e2;
import ig1.f2;
import ig1.g2;
import ig1.m0;
import ig1.m1;
import ig1.u0;
import ig1.x0;
import ig1.z0;
import qw0.u;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class b implements CompoundButton.OnCheckedChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18578a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f18579b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f18580c;

    public /* synthetic */ b(int i14, Object obj, Object obj2) {
        this.f18578a = i14;
        this.f18579b = obj;
        this.f18580c = obj2;
    }

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public final void onCheckedChanged(CompoundButton compoundButton, boolean z14) {
        EditText editText;
        Editable text;
        View viewFindViewById;
        int i14 = this.f18578a;
        boolean z15 = true;
        Object obj = this.f18580c;
        Object obj2 = this.f18579b;
        switch (i14) {
            case 0:
                int i15 = c.f18581h;
                compoundButton.getClass();
                ((l) obj2).invoke(Boolean.valueOf(z14));
                ((c) obj).ca(!z14);
                break;
            case 1:
                j jVar = (j) obj2;
                i iVar = (i) obj;
                m.a aVar = m.f45000y;
                compoundButton.getClass();
                int i16 = z14 ? 2131231882 : 2131231880;
                ImageView imageView = jVar.f73308a;
                if (imageView != null) {
                    imageView.setImageResource(i16);
                    imageView.setVisibility(0);
                }
                iVar.a(z14 ? zf1.a.STRAVA : zf1.a.GARMIN);
                break;
            case 2:
                d0 d0Var = (d0) obj2;
                f fVar = (f) obj;
                int i17 = d0.f93294l;
                LinearLayout linearLayout = d0Var.f93323f;
                if (z14) {
                    linearLayout.setVisibility(0);
                } else {
                    linearLayout.setVisibility(8);
                }
                fVar.y1("distanceAlertEnabled", Boolean.valueOf(z14));
                d0Var.p();
                break;
            case 3:
                m0 m0Var = (m0) obj2;
                f fVar2 = (f) obj;
                int i18 = m0.f93361m;
                compoundButton.getClass();
                LinearLayout linearLayout2 = m0Var.f93323f;
                if (z14) {
                    linearLayout2.setVisibility(0);
                } else {
                    linearLayout2.setVisibility(8);
                }
                fVar2.y1("heartRateAlertEnabled", Boolean.valueOf(z14));
                m0Var.p();
                break;
            case 4:
                u0 u0Var = (u0) obj2;
                f fVar3 = (f) obj;
                int i19 = u0.f93414j;
                compoundButton.getClass();
                LinearLayout linearLayout3 = u0Var.f93323f;
                if (z14) {
                    linearLayout3.setVisibility(0);
                } else {
                    linearLayout3.setVisibility(8);
                }
                fVar3.y1("cadenceAlertModeHighEnabled", Boolean.valueOf(z14));
                u0Var.p();
                break;
            case 5:
                x0 x0Var = (x0) obj2;
                f fVar4 = (f) obj;
                int i24 = x0.f93425j;
                compoundButton.getClass();
                LinearLayout linearLayout4 = x0Var.f93323f;
                if (z14) {
                    linearLayout4.setVisibility(0);
                } else {
                    linearLayout4.setVisibility(8);
                }
                fVar4.y1("intervalAlertsEnabled", Boolean.valueOf(z14));
                x0Var.p();
                break;
            case 6:
                z0 z0Var = (z0) obj2;
                f fVar5 = (f) obj;
                int i25 = z0.f93431j;
                compoundButton.getClass();
                LinearLayout linearLayout5 = z0Var.f93323f;
                if (z14) {
                    linearLayout5.setVisibility(0);
                } else {
                    linearLayout5.setVisibility(8);
                }
                fVar5.y1("cadenceAlertModeLowEnabled", Boolean.valueOf(z14));
                z0Var.p();
                break;
            case 7:
                m1 m1Var = (m1) obj2;
                f fVar6 = (f) obj;
                int i26 = m1.f93365j;
                compoundButton.getClass();
                LinearLayout linearLayout6 = m1Var.f93323f;
                if (z14) {
                    linearLayout6.setVisibility(0);
                } else {
                    linearLayout6.setVisibility(8);
                }
                fVar6.y1("virtualPacerEnabled", Boolean.valueOf(z14));
                m1Var.p();
                break;
            case 8:
                e2 e2Var = (e2) obj2;
                f fVar7 = (f) obj;
                int i27 = e2.f93302k;
                compoundButton.getClass();
                e2Var.f93323f.setVisibility(z14 ? 0 : 8);
                fVar7.y1("distanceAlertEnabled", Boolean.valueOf(z14));
                e2Var.p();
                break;
            case 9:
                f2 f2Var = (f2) obj2;
                f fVar8 = (f) obj;
                int i28 = f2.f93316l;
                compoundButton.getClass();
                LinearLayout linearLayout7 = f2Var.f93323f;
                if (z14) {
                    linearLayout7.setVisibility(0);
                } else {
                    linearLayout7.setVisibility(8);
                }
                fVar8.y1("swimPacingAlertEnabled", Boolean.valueOf(z14));
                f2Var.p();
                break;
            case 10:
                g2 g2Var = (g2) obj2;
                f fVar9 = (f) obj;
                int i29 = g2.f93329j;
                LinearLayout linearLayout8 = g2Var.f93323f;
                if (z14) {
                    linearLayout8.setVisibility(0);
                } else {
                    linearLayout8.setVisibility(8);
                }
                fVar9.y1("timeAlertEnabled", Boolean.valueOf(z14));
                g2Var.p();
                break;
            case 11:
                int i30 = GroupActivityFeedTypeMainFragment.a.b.f31381c;
                compoundButton.getClass();
                ((GroupActivityFeedTypeMainFragment.a.b) obj2).f31383b.invoke((com.garmin.android.apps.connectmobile.connections.groups.details.a.AbstractC0510a) obj, Boolean.valueOf(z14));
                break;
            case 12:
                compoundButton.getClass();
                ((po.i) obj2).invoke(((u) obj).f148348a, Boolean.valueOf(z14));
                break;
            default:
                xg1.m mVar = (xg1.m) obj2;
                View view2 = (View) obj;
                EditText editText2 = mVar.f190905a;
                if (editText2 != null) {
                    editText2.setEnabled(!z14);
                }
                EditText editText3 = mVar.f190905a;
                if (editText3 != null) {
                    editText3.setTextAppearance(mVar.getActivity(), R.style.GCMEditText);
                }
                if (view2 != null && (viewFindViewById = view2.findViewById(R.id.addGoalStepsLayout)) != null) {
                    viewFindViewById.setVisibility(z14 ? 8 : 0);
                }
                if (!z14 && ((editText = mVar.f190905a) == null || (text = editText.getText()) == null || text.length() == 0 || Integer.parseInt(text.toString()) < 1)) {
                    z15 = false;
                }
                mVar.v6(z15);
                break;
        }
    }
}
