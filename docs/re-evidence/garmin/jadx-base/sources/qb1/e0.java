package qb1;

import android.widget.TextView;
import c22.l3;
import com.garmin.android.apps.connectmobile.q1;
import com.garmin.android.apps.connectmobile.view.view_3_0.GCMComplexOneLineButton;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class e0 implements com.garmin.android.apps.connectmobile.settings.d.a, q1.a, j42.b.InterfaceC1852b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.garmin.android.apps.connectmobile.pregnancytracking.ui.setup.f f144056a;

    @Override // com.garmin.android.apps.connectmobile.settings.d.a
    public void c(float f14) {
        com.garmin.android.apps.connectmobile.pregnancytracking.ui.setup.f.a aVar = com.garmin.android.apps.connectmobile.pregnancytracking.ui.setup.f.f40985j;
        this.f144056a.v6(Float.valueOf(f14));
    }

    @Override // com.garmin.android.apps.connectmobile.q1.a
    public void g(boolean z14) {
        if (z14) {
            com.garmin.android.apps.connectmobile.pregnancytracking.ui.setup.f.a aVar = com.garmin.android.apps.connectmobile.pregnancytracking.ui.setup.f.f40985j;
            return;
        }
        GCMComplexOneLineButton gCMComplexOneLineButton = this.f144056a.f40986a;
        if (gCMComplexOneLineButton != null) {
            gCMComplexOneLineButton.j();
        } else {
            p005kotlin.jvm.internal.s.m("mRadioButton");
            throw null;
        }
    }

    @Override // j42.b.InterfaceC1852b
    public void j(double d14) {
        com.garmin.android.apps.connectmobile.pregnancytracking.ui.setup.f fVar = this.f144056a;
        TextView textView = fVar.f40990e;
        if (textView == null) {
            p005kotlin.jvm.internal.s.m("mWeightLoggedTextView");
            throw null;
        }
        textView.setVisibility(8);
        fVar.w6(Double.valueOf(d14));
        l3.f23124b.getClass();
        f.N4(fVar.u6(), Double.valueOf(d14 * ((double) 1000)), null, 2);
    }
}
