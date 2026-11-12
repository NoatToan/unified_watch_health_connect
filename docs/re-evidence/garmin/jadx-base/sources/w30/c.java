package w30;

import e23.p;
import p005kotlin.Unit;
import p3.m;
import p3.p0;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class c implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f181827a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e f181828b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f181829c;

    public /* synthetic */ c(e eVar, int i14, int i15) {
        this.f181827a = i15;
        this.f181828b = eVar;
        this.f181829c = i14;
    }

    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        int i14 = this.f181827a;
        int i15 = this.f181829c;
        e eVar = this.f181828b;
        m mVar = (m) obj;
        ((Integer) obj2).getClass();
        int i16 = e.f181832f;
        switch (i14) {
            case 0:
                eVar.j(mVar, p0.t(i15 | 1));
                break;
            case 1:
                eVar.g(mVar, p0.t(i15 | 1));
                break;
            case 2:
                eVar.h(mVar, p0.t(i15 | 1));
                break;
            case 3:
                eVar.i(mVar, p0.t(i15 | 1));
                break;
            default:
                eVar.k(mVar, p0.t(i15 | 1));
                break;
        }
        return Unit.INSTANCE;
    }
}
