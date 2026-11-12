package i02;

import p005kotlin.Unit;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class j implements e23.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f86862a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p f86863b;

    public /* synthetic */ j(p pVar, int i14) {
        this.f86862a = i14;
        this.f86863b = pVar;
    }

    @Override // e23.a
    public final Object invoke() {
        int i14 = this.f86862a;
        p pVar = this.f86863b;
        switch (i14) {
            case 0:
                pVar.v();
                return Unit.INSTANCE;
            case 1:
                pVar.v();
                return Unit.INSTANCE;
            default:
                p.a aVar = p.f86882o;
                return Boolean.valueOf(pVar.e() != null);
        }
    }
}
