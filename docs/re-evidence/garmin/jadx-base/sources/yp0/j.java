package yp0;

import p005kotlin.Unit;
import p3.p0;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class j implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f198662a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ k f198663b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f198664c;

    public /* synthetic */ j(k kVar, int i14, int i15) {
        this.f198662a = i15;
        this.f198663b = kVar;
        this.f198664c = i14;
    }

    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        int i14 = this.f198662a;
        int i15 = this.f198664c;
        k kVar = this.f198663b;
        p3.m mVar = (p3.m) obj;
        ((Integer) obj2).getClass();
        int i16 = k.f198665f;
        switch (i14) {
            case 0:
                kVar.i(mVar, p0.t(i15 | 1));
                break;
            case 1:
                kVar.h(mVar, p0.t(i15 | 1));
                break;
            default:
                kVar.g(mVar, p0.t(i15 | 1));
                break;
        }
        return Unit.INSTANCE;
    }
}
