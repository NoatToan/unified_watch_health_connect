package h60;

import e23.l;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class d implements l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f82156a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ h f82157b;

    public /* synthetic */ d(h hVar, int i14) {
        this.f82156a = i14;
        this.f82157b = hVar;
    }

    @Override // e23.l
    public final Object invoke(Object obj) {
        switch (this.f82156a) {
            case 0:
                f.a aVar = (f.a) obj;
                aVar.getClass();
                int i14 = aVar.f67585a;
                if (i14 == -1 || i14 == 0) {
                    h hVar = this.f82157b;
                    hVar.f82171g.g();
                    hVar.f82172h.g();
                    hVar.f82173i.g();
                }
                break;
            default:
                obj.getClass();
                this.f82157b.y4((g60.b) obj);
                break;
        }
        return Unit.INSTANCE;
    }
}
