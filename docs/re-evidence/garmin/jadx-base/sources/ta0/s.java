package ta0;

import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class s implements e23.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f163430a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e23.a f163431b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ x f163432c;

    public /* synthetic */ s(e23.a aVar, x xVar) {
        this.f163431b = aVar;
        this.f163432c = xVar;
    }

    @Override // e23.a
    public final Object invoke() {
        switch (this.f163430a) {
            case 0:
                this.f163432c.x4();
                this.f163431b.invoke();
                break;
            default:
                this.f163431b.invoke();
                this.f163432c.y4(l90.c.REJECT);
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ s(x xVar, e23.a aVar) {
        this.f163432c = xVar;
        this.f163431b = aVar;
    }
}
