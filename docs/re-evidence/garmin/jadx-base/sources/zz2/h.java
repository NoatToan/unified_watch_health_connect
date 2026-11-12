package zz2;

import p005kotlin.Unit;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class h implements e23.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f207682a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ a03.p f207683b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ e23.a f207684c;

    public /* synthetic */ h(a03.p pVar, e23.a aVar, int i14) {
        this.f207682a = i14;
        this.f207683b = pVar;
        this.f207684c = aVar;
    }

    @Override // e23.l
    public final Object invoke(Object obj) {
        switch (this.f207682a) {
            case 0:
                e23.a aVar = this.f207684c;
                aVar.getClass();
                if (!this.f207683b.f()) {
                    aVar.invoke();
                }
                break;
            default:
                e23.a aVar2 = this.f207684c;
                aVar2.getClass();
                if (!this.f207683b.f()) {
                    aVar2.invoke();
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
