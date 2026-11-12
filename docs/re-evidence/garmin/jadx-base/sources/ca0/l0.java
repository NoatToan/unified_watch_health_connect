package ca0;

import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class l0 implements e23.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f26329a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c50.f f26330b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ta0.x f26331c;

    public /* synthetic */ l0(c50.f fVar, ta0.x xVar, int i14) {
        this.f26329a = i14;
        this.f26330b = fVar;
        this.f26331c = xVar;
    }

    @Override // e23.l
    public final Object invoke(Object obj) {
        l90.k kVar = (l90.k) obj;
        switch (this.f26329a) {
            case 0:
                kVar.getClass();
                this.f26330b.invoke(this.f26331c, kVar);
                break;
            default:
                kVar.getClass();
                this.f26330b.invoke(this.f26331c, kVar);
                break;
        }
        return Unit.INSTANCE;
    }
}
