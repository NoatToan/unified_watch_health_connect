package pb1;

import androidx.fragment.app.m;
import c22.l3;
import com.garmin.android.apps.connectmobile.pregnancytracking.ui.views.GCMPregnancyTwoLineButton;
import db1.u;
import gg1.j0;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class i implements j0.a, j42.b.InterfaceC1852b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ u f136850a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ l f136851b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ m f136852c;

    public /* synthetic */ i(u uVar, l lVar, m mVar) {
        this.f136850a = uVar;
        this.f136851b = lVar;
        this.f136852c = mVar;
    }

    public void a(float f14) {
        l.a aVar = l.f136861l;
        Double dValueOf = Double.valueOf(f14);
        u uVar = this.f136850a;
        uVar.h(dValueOf);
        tb1.e.f163745a.getClass();
        uVar.i(tb1.e.a.c());
        GCMPregnancyTwoLineButton gCMPregnancyTwoLineButton = this.f136851b.f136871i;
        if (gCMPregnancyTwoLineButton != null) {
            gCMPregnancyTwoLineButton.setButtonValueLabel(tb1.e.a.d(f14, this.f136852c));
        } else {
            s.m("mHeightButton");
            throw null;
        }
    }

    @Override // j42.b.InterfaceC1852b
    public void j(double d14) {
        l.a aVar = l.f136861l;
        l3.f23124b.getClass();
        Double dValueOf = Double.valueOf(((double) 1000) * d14);
        u uVar = this.f136850a;
        uVar.k(dValueOf);
        tb1.e.f163745a.getClass();
        uVar.i(tb1.e.a.c());
        GCMPregnancyTwoLineButton gCMPregnancyTwoLineButton = this.f136851b.f136870h;
        if (gCMPregnancyTwoLineButton != null) {
            gCMPregnancyTwoLineButton.setButtonValueLabel(tb1.e.a.f(this.f136852c, d14));
        } else {
            s.m("mWeightButton");
            throw null;
        }
    }
}
