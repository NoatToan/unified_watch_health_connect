package l71;

import e23.p;
import i71.x;
import p005kotlin.Unit;
import p3.m;
import p3.p0;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class c implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f110843a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.garmin.android.apps.connectmobile.performance.model.b f110844b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ x f110845c;

    public /* synthetic */ c(com.garmin.android.apps.connectmobile.performance.model.b bVar, x xVar, int i14, int i15) {
        this.f110843a = i15;
        this.f110844b = bVar;
        this.f110845c = xVar;
    }

    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        int i14 = this.f110843a;
        m mVar = (m) obj;
        ((Integer) obj2).getClass();
        switch (i14) {
            case 0:
                h.g(this.f110844b, this.f110845c, mVar, p0.t(1));
                break;
            default:
                h.i(this.f110844b, this.f110845c, mVar, p0.t(1));
                break;
        }
        return Unit.INSTANCE;
    }
}
