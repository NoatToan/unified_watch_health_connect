package vp1;

import e23.p;
import p005kotlin.Unit;
import p3.m;
import p3.p0;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class e implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f179396a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f f179397b;

    public /* synthetic */ e(f fVar, int i14, int i15) {
        this.f179396a = i15;
        this.f179397b = fVar;
    }

    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        int i14 = this.f179396a;
        f fVar = this.f179397b;
        m mVar = (m) obj;
        ((Integer) obj2).getClass();
        int i15 = f.f179398h;
        switch (i14) {
            case 0:
                fVar.h(mVar, p0.t(1));
                break;
            case 1:
                fVar.g(mVar, p0.t(1));
                break;
            default:
                fVar.i(mVar, p0.t(1));
                break;
        }
        return Unit.INSTANCE;
    }
}
