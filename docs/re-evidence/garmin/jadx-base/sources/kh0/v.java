package kh0;

import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class v implements e23.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f104772a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ gh0.a f104773b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ e23.a f104774c;

    public /* synthetic */ v(gh0.a aVar, e23.a aVar2, int i14) {
        this.f104772a = i14;
        this.f104773b = aVar;
        this.f104774c = aVar2;
    }

    @Override // e23.l
    public final Object invoke(Object obj) {
        f.a aVar = (f.a) obj;
        switch (this.f104772a) {
            case 0:
                aVar.getClass();
                int i14 = aVar.f67585a;
                this.f104773b.getClass();
                if (i14 == 11) {
                    this.f104774c.invoke();
                }
                break;
            default:
                aVar.getClass();
                int i15 = aVar.f67585a;
                this.f104773b.getClass();
                if (i15 == 11) {
                    this.f104774c.invoke();
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
