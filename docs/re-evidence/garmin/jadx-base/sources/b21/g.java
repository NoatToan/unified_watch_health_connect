package b21;

import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class g implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14679a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ u21.p f14680b;

    public /* synthetic */ g(u21.p pVar, int i14) {
        this.f14679a = i14;
        this.f14680b = pVar;
    }

    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        int i14 = this.f14679a;
        int iIntValue = ((Integer) obj).intValue();
        int iIntValue2 = ((Integer) obj2).intValue();
        switch (i14) {
            case 0:
                this.f14680b.B4(iIntValue, iIntValue2);
                break;
            case 1:
                this.f14680b.B4(iIntValue, iIntValue2);
                break;
            default:
                this.f14680b.B4(iIntValue, iIntValue2);
                break;
        }
        return Unit.INSTANCE;
    }
}
