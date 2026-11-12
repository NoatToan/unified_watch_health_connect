package zu1;

import p005kotlin.Unit;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class b implements e23.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f207073a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c f207074b;

    public /* synthetic */ b(c cVar, int i14) {
        this.f207073a = i14;
        this.f207074b = cVar;
    }

    @Override // e23.a
    public final Object invoke() {
        switch (this.f207073a) {
            case 0:
                wt1.b bVar = this.f207074b.f207079d;
                if (bVar != null) {
                    bVar.e();
                }
                break;
            default:
                g22.e.a(this.f207074b, null);
                break;
        }
        return Unit.INSTANCE;
    }
}
