package rg0;

import p005kotlin.Unit;
import p3.p0;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class c implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f152516a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d f152517b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f152518c;

    public /* synthetic */ c(d dVar, int i14, int i15) {
        this.f152516a = i15;
        this.f152517b = dVar;
        this.f152518c = i14;
    }

    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        int i14 = this.f152516a;
        int i15 = this.f152518c;
        d dVar = this.f152517b;
        p3.m mVar = (p3.m) obj;
        ((Integer) obj2).getClass();
        int i16 = d.f152524f;
        switch (i14) {
            case 0:
                dVar.h(mVar, p0.t(i15 | 1));
                break;
            case 1:
                dVar.i(mVar, p0.t(i15 | 1));
                break;
            default:
                dVar.g(mVar, p0.t(i15 | 1));
                break;
        }
        return Unit.INSTANCE;
    }
}
