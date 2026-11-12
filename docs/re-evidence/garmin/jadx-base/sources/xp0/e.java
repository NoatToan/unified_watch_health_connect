package xp0;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import aq.q1;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.view.view_3_0.GCMComplexTwoLineButton;
import gg1.n;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import u62.z;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lxp0/e;", "", "Landroid/view/View;", "view", "<init>", "(Landroid/view/View;)V", "gcm-hydration_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final View f191838a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final wp0.a f191839b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final GCMComplexTwoLineButton f191840c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final GCMComplexTwoLineButton f191841d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final TextView f191842e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final GCMComplexTwoLineButton f191843f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final GCMComplexTwoLineButton f191844g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final GCMComplexTwoLineButton f191845h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final String f191846i;

    public e(View view2) {
        view2.getClass();
        this.f191838a = view2;
        Context context = view2.getContext();
        context.getClass();
        this.f191839b = new wp0.a(new l22.a(context));
        View viewFindViewById = view2.findViewById(R.id.hydration_units);
        viewFindViewById.getClass();
        this.f191840c = (GCMComplexTwoLineButton) viewFindViewById;
        View viewFindViewById2 = view2.findViewById(R.id.hydration_goal);
        viewFindViewById2.getClass();
        this.f191841d = (GCMComplexTwoLineButton) viewFindViewById2;
        View viewFindViewById3 = view2.findViewById(R.id.hydration_goal_info);
        viewFindViewById3.getClass();
        this.f191842e = (TextView) viewFindViewById3;
        View viewFindViewById4 = view2.findViewById(R.id.hydration_container1);
        viewFindViewById4.getClass();
        this.f191843f = (GCMComplexTwoLineButton) viewFindViewById4;
        View viewFindViewById5 = view2.findViewById(R.id.hydration_container2);
        viewFindViewById5.getClass();
        this.f191844g = (GCMComplexTwoLineButton) viewFindViewById5;
        View viewFindViewById6 = view2.findViewById(R.id.hydration_container3);
        viewFindViewById6.getClass();
        this.f191845h = (GCMComplexTwoLineButton) viewFindViewById6;
        this.f191846i = z.b(R.string.no_value, view2);
    }

    public final void a(op0.a aVar) {
        GCMComplexTwoLineButton gCMComplexTwoLineButton;
        aVar.getClass();
        int containerId = aVar.getContainerId();
        if (containerId == 1) {
            gCMComplexTwoLineButton = this.f191843f;
        } else if (containerId != 2) {
            gCMComplexTwoLineButton = containerId != 3 ? null : this.f191845h;
        } else {
            gCMComplexTwoLineButton = this.f191844g;
        }
        wp0.a aVar2 = this.f191839b;
        if (gCMComplexTwoLineButton != null) {
            aVar2.getClass();
            gCMComplexTwoLineButton.setButtonTopLabel(aVar2.f186529a.a(R.string.lbl_container_numeric, String.valueOf(aVar.getContainerId())));
        }
        if (gCMComplexTwoLineButton != null) {
            Double volume = aVar.getVolume();
            n nVarG = aVar.g();
            gCMComplexTwoLineButton.setButtonBottomLeftLabel((volume == null || Double.isNaN(volume.doubleValue()) || nVarG == null) ? this.f191846i : aVar2.a(volume.doubleValue(), jp0.c.j(nVarG), true));
        }
    }

    public final void b(int i14, e23.a<Unit> aVar) {
        if (i14 == 1) {
            this.f191843f.setOnClickListener(new q1(aVar, 23));
        } else if (i14 == 2) {
            this.f191844g.setOnClickListener(new q1(aVar, 24));
        } else {
            if (i14 != 3) {
                return;
            }
            this.f191845h.setOnClickListener(new q1(aVar, 25));
        }
    }

    public final void c(Double d14, n nVar) {
        String strC;
        nVar.getClass();
        if (Double.isNaN(d14.doubleValue())) {
            strC = this.f191846i;
        } else {
            strC = this.f191839b.c(d14.doubleValue(), jp0.c.j(nVar));
        }
        this.f191841d.setButtonBottomLeftLabel(strC);
    }
}
