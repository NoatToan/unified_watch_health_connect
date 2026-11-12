package fe1;

import e23.p;
import p005kotlin.Unit;
import p3.p0;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class j implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f70549a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ k f70550b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f70551c;

    public /* synthetic */ j(k kVar, int i14, int i15) {
        this.f70549a = i15;
        this.f70550b = kVar;
        this.f70551c = i14;
    }

    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        int i14 = this.f70549a;
        int i15 = this.f70551c;
        k kVar = this.f70550b;
        p3.m mVar = (p3.m) obj;
        ((Integer) obj2).getClass();
        int i16 = k.f70552f;
        switch (i14) {
            case 0:
                kVar.i(mVar, p0.t(i15 | 1));
                break;
            case 1:
                kVar.j(mVar, p0.t(i15 | 1));
                break;
            case 2:
                kVar.g(mVar, p0.t(i15 | 1));
                break;
            default:
                kVar.h(mVar, p0.t(i15 | 1));
                break;
        }
        return Unit.INSTANCE;
    }
}
