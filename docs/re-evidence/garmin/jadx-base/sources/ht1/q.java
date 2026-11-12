package ht1;

import p005kotlin.Unit;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class q implements e23.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f85574a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e23.l f85575b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ i53.c f85576c;

    public /* synthetic */ q(int i14, e23.l lVar, i53.c cVar) {
        this.f85574a = i14;
        this.f85575b = lVar;
        this.f85576c = cVar;
    }

    @Override // e23.a
    public final Object invoke() {
        switch (this.f85574a) {
            case 0:
                this.f85575b.invoke(Integer.valueOf(10 - this.f85576c.size()));
                break;
            default:
                this.f85575b.invoke(this.f85576c);
                break;
        }
        return Unit.INSTANCE;
    }
}
