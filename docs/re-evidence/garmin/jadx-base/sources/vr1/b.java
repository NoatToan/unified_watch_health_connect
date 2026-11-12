package vr1;

import e23.p;
import p005kotlin.Unit;
import p3.p0;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class b implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f179485a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.garmin.android.apps.connectmobile.stress.presentation.view.a f179486b;

    public /* synthetic */ b(com.garmin.android.apps.connectmobile.stress.presentation.view.a aVar, int i14, int i15) {
        this.f179485a = i15;
        this.f179486b = aVar;
    }

    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        int i14 = this.f179485a;
        com.garmin.android.apps.connectmobile.stress.presentation.view.a aVar = this.f179486b;
        p3.m mVar = (p3.m) obj;
        ((Integer) obj2).getClass();
        com.garmin.android.apps.connectmobile.stress.presentation.view.a.C0859a c0859a = com.garmin.android.apps.connectmobile.stress.presentation.view.a.f45025j;
        switch (i14) {
            case 0:
                aVar.j(mVar, p0.t(1));
                break;
            case 1:
                aVar.k(mVar, p0.t(1));
                break;
            case 2:
                aVar.i(mVar, p0.t(1));
                break;
            case 3:
                aVar.h(mVar, p0.t(1));
                break;
            default:
                aVar.g(mVar, p0.t(1));
                break;
        }
        return Unit.INSTANCE;
    }
}
