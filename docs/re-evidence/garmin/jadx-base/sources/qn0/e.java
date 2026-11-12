package qn0;

import p005kotlin.Unit;
import p3.p0;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class e implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f145792a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ i f145793b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f145794c;

    public /* synthetic */ e(i iVar, int i14, int i15) {
        this.f145792a = i15;
        this.f145793b = iVar;
        this.f145794c = i14;
    }

    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        int i14 = this.f145792a;
        int i15 = this.f145794c;
        i iVar = this.f145793b;
        p3.m mVar = (p3.m) obj;
        ((Integer) obj2).getClass();
        int i16 = i.f145805f;
        switch (i14) {
            case 0:
                iVar.i(mVar, p0.t(i15 | 1));
                break;
            case 1:
                iVar.m(mVar, p0.t(i15 | 1));
                break;
            case 2:
                iVar.h(mVar, p0.t(i15 | 1));
                break;
            case 3:
                iVar.g(mVar, p0.t(i15 | 1));
                break;
            case 4:
                iVar.j(mVar, p0.t(i15 | 1));
                break;
            case 5:
                iVar.l(mVar, p0.t(i15 | 1));
                break;
            default:
                iVar.k(mVar, p0.t(i15 | 1));
                break;
        }
        return Unit.INSTANCE;
    }
}
