package h82;

import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class k implements e23.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f82467a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f82468b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f82469c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ e23.a f82470d;

    public /* synthetic */ k(int i14, int i15, int i16, e23.a aVar) {
        this.f82467a = i16;
        this.f82468b = i14;
        this.f82469c = i15;
        this.f82470d = aVar;
    }

    @Override // e23.l
    public final Object invoke(Object obj) {
        int i14 = this.f82467a;
        e23.a aVar = this.f82470d;
        int i15 = this.f82469c;
        int i16 = this.f82468b;
        int iIntValue = ((Integer) obj).intValue();
        switch (i14) {
            case 0:
                r rVar = r.f82497a;
                if (i16 <= iIntValue && iIntValue <= i15 && aVar != null) {
                    aVar.invoke();
                }
                break;
            default:
                if (i16 <= iIntValue && iIntValue <= i15) {
                    aVar.invoke();
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
