package au1;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.m;
import b71.i;
import rt1.r;
import xw1.o;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class b implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f13024a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ xw1.h f13025b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ c f13026c;

    public /* synthetic */ b(c cVar, xw1.h hVar) {
        this.f13026c = cVar;
        this.f13025b = hVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view2) {
        yt1.c cVar;
        com.garmin.android.apps.connectmobile.training.atp.create.steps.c cVar2;
        switch (this.f13024a) {
            case 0:
                com.garmin.android.apps.connectmobile.training.atp.create.steps.c cVar3 = this.f13026c.f13029e;
                if (cVar3 != null && (cVar = cVar3.f45248a) != null) {
                    cVar.d(this.f13025b);
                    break;
                }
                break;
            default:
                o oVar = this.f13025b.f192397q;
                if (oVar != null && (cVar2 = this.f13026c.f13029e) != null) {
                    rt1.c cVar4 = rt1.c.f154516a;
                    xw1.c cVarW6 = cVar2.w6();
                    boolean z14 = cVar2.f45251d == 0;
                    cVar4.getClass();
                    r.a aVar = r.f154555d;
                    Integer planType = cVarW6.getPlanType();
                    aVar.getClass();
                    String strA = r.a.a(planType);
                    String str = z14 ? "CREATE" : "EDIT";
                    Bundle bundleD = i.d("Screen", "GarminCoachVideo");
                    bundleD.putString("videoKey", oVar.getVideoKey());
                    bundleD.putString("garminCoachCreate", str);
                    bundleD.putString("garminCoachPlanType", strA);
                    ht.a.f85464a.getClass();
                    ht.a.a(bundleD, "PageView");
                    com.garmin.android.apps.connectmobile.training.atp.create.video.a.C0871a c0871a = com.garmin.android.apps.connectmobile.training.atp.create.video.a.f45334d;
                    m activity = cVar2.getActivity();
                    c0871a.getClass();
                    Intent intentA = com.garmin.android.apps.connectmobile.training.atp.create.video.a.C0871a.a(activity, oVar);
                    if (intentA != null) {
                        cVar2.startActivity(intentA);
                    }
                    break;
                }
                break;
        }
    }

    public /* synthetic */ b(xw1.h hVar, c cVar) {
        this.f13025b = hVar;
        this.f13026c = cVar;
    }
}
