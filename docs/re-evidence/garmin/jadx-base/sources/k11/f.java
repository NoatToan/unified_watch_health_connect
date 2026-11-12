package k11;

import androidx.lifecycle.v1;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class f implements e23.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f102193a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ l11.a f102194b;

    public /* synthetic */ f(l11.a aVar, int i14) {
        this.f102193a = i14;
        this.f102194b = aVar;
    }

    @Override // e23.a
    public final Object invoke() {
        b11.i.a aVar;
        String str;
        switch (this.f102193a) {
            case 0:
                this.f102194b.f108073x.setValue(l11.a.d.h.f108104a);
                break;
            case 1:
                l11.a aVar2 = this.f102194b;
                aVar2.getClass();
                ge1.b.T(v1.a(aVar2), null, null, new l11.d(aVar2, null), 3);
                break;
            default:
                l11.a aVar3 = this.f102194b;
                l11.a.b bVar = (l11.a.b) aVar3.f108064m.getValue();
                if (bVar != null && (aVar = bVar.f108075a) != null && (str = aVar.f14295a) != null) {
                    ge1.b.T(v1.a(aVar3), null, null, new l11.c(aVar3, aVar3.f108052a.b(), str, aVar, null), 3);
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
