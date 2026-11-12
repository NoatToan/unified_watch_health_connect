package hp1;

import e23.p;
import p005kotlin.Unit;
import p3.m;
import p3.p0;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class d implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f84944a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e f84945b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f84946c;

    public /* synthetic */ d(e eVar, int i14, int i15) {
        this.f84944a = i15;
        this.f84945b = eVar;
        this.f84946c = i14;
    }

    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        int i14 = this.f84944a;
        int i15 = this.f84946c;
        e eVar = this.f84945b;
        m mVar = (m) obj;
        ((Integer) obj2).getClass();
        int i16 = e.f84947f;
        switch (i14) {
            case 0:
                eVar.h(mVar, p0.t(i15 | 1));
                break;
            case 1:
                eVar.i(mVar, p0.t(i15 | 1));
                break;
            default:
                eVar.g(mVar, p0.t(i15 | 1));
                break;
        }
        return Unit.INSTANCE;
    }
}
