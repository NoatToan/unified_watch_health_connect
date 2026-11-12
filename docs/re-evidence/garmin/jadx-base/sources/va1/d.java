package va1;

import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class d implements e23.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f176593a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ wa1.b f176594b;

    public /* synthetic */ d(wa1.b bVar, int i14) {
        this.f176593a = i14;
        this.f176594b = bVar;
    }

    @Override // e23.l
    public final Object invoke(Object obj) {
        int i14 = this.f176593a;
        wa1.b bVar = this.f176594b;
        Integer num = (Integer) obj;
        switch (i14) {
            case 0:
                int i15 = e.f176595b;
                if (num != null) {
                    bVar.a(num.intValue());
                }
                break;
            default:
                bVar.a(num.intValue());
                break;
        }
        return Unit.INSTANCE;
    }
}
