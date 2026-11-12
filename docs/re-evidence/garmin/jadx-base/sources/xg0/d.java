package xg0;

import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class d implements e23.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f190741a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ o f190742b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ wg0.a f190743c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ e23.a f190744d;

    public /* synthetic */ d(o oVar, wg0.a aVar, int i14, e23.a aVar2, int i15) {
        this.f190741a = i15;
        this.f190742b = oVar;
        this.f190743c = aVar;
        this.f190744d = aVar2;
    }

    @Override // e23.a
    public final Object invoke() {
        switch (this.f190741a) {
            case 0:
                this.f190742b.i1(this.f190743c);
                this.f190744d.invoke();
                break;
            case 1:
                this.f190742b.G(this.f190743c);
                this.f190744d.invoke();
                break;
            case 2:
                this.f190742b.W5(this.f190743c);
                this.f190744d.invoke();
                break;
            case 3:
                this.f190742b.c4(this.f190743c.f185046e);
                this.f190744d.invoke();
                break;
            case 4:
                this.f190742b.T5(this.f190743c.f185046e);
                this.f190744d.invoke();
                break;
            default:
                this.f190742b.w4(this.f190743c.f185046e);
                this.f190744d.invoke();
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ d(o oVar, wg0.a aVar, e23.a aVar2, int i14) {
        this.f190741a = i14;
        this.f190742b = oVar;
        this.f190743c = aVar;
        this.f190744d = aVar2;
    }
}
