package xn;

import p005kotlin.Unit;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class o implements e23.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f191617a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p f191618b;

    public /* synthetic */ o(p pVar, int i14) {
        this.f191617a = i14;
        this.f191618b = pVar;
    }

    @Override // e23.a
    public final Object invoke() {
        int i14 = this.f191617a;
        p pVar = this.f191618b;
        switch (i14) {
            case 0:
                int i15 = p.f191619g;
                pVar.e("CALORIES_DURING_ACTIVITY");
                break;
            case 1:
                int i16 = p.f191619g;
                pVar.e("CALORIE_TRACKING");
                break;
            case 2:
                int i17 = p.f191619g;
                pVar.e("FLUID TRACKING");
                break;
            default:
                int i18 = p.f191619g;
                pVar.e("PACK CALORIES");
                break;
        }
        return Unit.INSTANCE;
    }
}
