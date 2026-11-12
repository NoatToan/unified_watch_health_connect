package ht0;

import e23.p;
import p005kotlin.Unit;
import p3.m;
import p3.p0;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class b implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f85512a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e f85513b;

    public /* synthetic */ b(e eVar, int i14, int i15) {
        this.f85512a = i15;
        this.f85513b = eVar;
    }

    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        int i14 = this.f85512a;
        e eVar = this.f85513b;
        m mVar = (m) obj;
        ((Integer) obj2).getClass();
        int i15 = e.f85518g;
        switch (i14) {
            case 0:
                eVar.i(mVar, p0.t(1));
                break;
            case 1:
                eVar.h(mVar, p0.t(1));
                break;
            case 2:
                eVar.g(mVar, p0.t(1));
                break;
            default:
                eVar.j(mVar, p0.t(1));
                break;
        }
        return Unit.INSTANCE;
    }
}
