package i51;

import e23.l;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class e implements e23.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f91793a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ l f91794b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ e23.a f91795c;

    public /* synthetic */ e(int i14, e23.a aVar, l lVar) {
        this.f91793a = i14;
        this.f91794b = lVar;
        this.f91795c = aVar;
    }

    @Override // e23.a
    public final Object invoke() {
        switch (this.f91793a) {
            case 0:
                this.f91794b.invoke(null);
                this.f91795c.invoke();
                break;
            case 1:
                this.f91794b.invoke(new ku1.a(this.f91795c, 5));
                break;
            case 2:
                this.f91794b.invoke(new ku1.a(this.f91795c, 4));
                break;
            default:
                this.f91794b.invoke(new ku1.a(this.f91795c, 6));
                break;
        }
        return Unit.INSTANCE;
    }
}
