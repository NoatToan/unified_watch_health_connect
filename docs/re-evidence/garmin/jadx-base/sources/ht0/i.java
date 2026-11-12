package ht0;

import e23.p;
import p005kotlin.Unit;
import p3.m;
import p3.p0;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class i implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f85527a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ j f85528b;

    public /* synthetic */ i(j jVar, int i14, int i15) {
        this.f85527a = i15;
        this.f85528b = jVar;
    }

    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        int i14 = this.f85527a;
        j jVar = this.f85528b;
        m mVar = (m) obj;
        ((Integer) obj2).getClass();
        int i15 = j.f85529g;
        switch (i14) {
            case 0:
                jVar.g(mVar, p0.t(1));
                break;
            case 1:
                jVar.i(mVar, p0.t(1));
                break;
            default:
                jVar.h(mVar, p0.t(1));
                break;
        }
        return Unit.INSTANCE;
    }
}
