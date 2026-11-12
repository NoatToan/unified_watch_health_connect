package ub0;

import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class g implements e23.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f169724a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f169725b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ e23.a f169726c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ e23.l f169727d;

    public /* synthetic */ g(boolean z14, e23.a aVar, e23.l lVar, int i14) {
        this.f169724a = i14;
        this.f169725b = z14;
        this.f169726c = aVar;
        this.f169727d = lVar;
    }

    @Override // e23.a
    public final Object invoke() {
        switch (this.f169724a) {
            case 0:
                if (this.f169725b) {
                    this.f169726c.invoke();
                } else {
                    this.f169727d.invoke(a.NEXT_STEP);
                }
                break;
            default:
                if (this.f169725b) {
                    this.f169726c.invoke();
                } else {
                    this.f169727d.invoke(a.NEXT_STEP);
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
