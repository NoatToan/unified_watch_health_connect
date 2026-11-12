package bv0;

import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class m implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f21346a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ sc.f f21347b;

    public /* synthetic */ m(sc.f fVar, int i14) {
        this.f21346a = i14;
        this.f21347b = fVar;
    }

    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        int i14 = this.f21346a;
        String str = (String) obj;
        boolean zBooleanValue = ((Boolean) obj2).booleanValue();
        switch (i14) {
            case 0:
                str.getClass();
                this.f21347b.a(new a.o(str, zBooleanValue));
                break;
            case 1:
                str.getClass();
                this.f21347b.a(new a.o(str, zBooleanValue));
                break;
            default:
                str.getClass();
                this.f21347b.a(new a.o(str, zBooleanValue));
                break;
        }
        return Unit.INSTANCE;
    }
}
