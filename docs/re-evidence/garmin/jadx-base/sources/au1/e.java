package au1;

import p005kotlin.Unit;
import xw1.m;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class e implements e23.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f13039a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.garmin.android.apps.connectmobile.training.atp.create.steps.g f13040b;

    public /* synthetic */ e(com.garmin.android.apps.connectmobile.training.atp.create.steps.g gVar, int i14) {
        this.f13039a = i14;
        this.f13040b = gVar;
    }

    @Override // e23.a
    public final Object invoke() {
        yt1.c cVar;
        int i14 = this.f13039a;
        com.garmin.android.apps.connectmobile.training.atp.create.steps.g gVar = this.f13040b;
        switch (i14) {
            case 0:
                com.garmin.android.apps.connectmobile.training.atp.create.steps.g.a aVar = com.garmin.android.apps.connectmobile.training.atp.create.steps.g.f45268m;
                gVar.E6();
                break;
            default:
                m mVar = gVar.f45272k;
                if (mVar != null && (cVar = gVar.f45248a) != null) {
                    cVar.c(mVar);
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
