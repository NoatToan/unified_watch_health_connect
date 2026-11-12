package z50;

import e23.l;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class j implements l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f202461a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ l f202462b;

    public /* synthetic */ j(l lVar, int i14) {
        this.f202461a = i14;
        this.f202462b = lVar;
    }

    @Override // e23.l
    public final Object invoke(Object obj) {
        switch (this.f202461a) {
            case 0:
                this.f202462b.invoke(new a60.a.d(((Boolean) obj).booleanValue()));
                break;
            case 1:
                this.f202462b.invoke(new a60.a.f((Double) obj));
                break;
            case 2:
                w20.b bVar = (w20.b) obj;
                bVar.getClass();
                this.f202462b.invoke(new a60.a.e(bVar));
                break;
            default:
                us1.k kVar = (us1.k) obj;
                kVar.getClass();
                this.f202462b.invoke(kVar);
                break;
        }
        return Unit.INSTANCE;
    }
}
