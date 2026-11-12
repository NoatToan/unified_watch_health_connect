package a42;

import p005kotlin.Unit;
import p3.p0;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class j implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1036a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ s f1037b;

    public /* synthetic */ j(s sVar, int i14, int i15) {
        this.f1036a = i15;
        this.f1037b = sVar;
    }

    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        int i14 = this.f1036a;
        s sVar = this.f1037b;
        p3.m mVar = (p3.m) obj;
        ((Integer) obj2).getClass();
        s.a aVar = s.f1073g;
        switch (i14) {
            case 0:
                sVar.h(mVar, p0.t(1));
                break;
            case 1:
                sVar.i(mVar, p0.t(1));
                break;
            default:
                sVar.j(mVar, p0.t(1));
                break;
        }
        return Unit.INSTANCE;
    }
}
