package d81;

import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class c implements e23.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f58294a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ i81.a f58295b;

    public /* synthetic */ c(i81.a aVar, int i14) {
        this.f58294a = i14;
        this.f58295b = aVar;
    }

    @Override // e23.l
    public final Object invoke(Object obj) {
        int i14 = this.f58294a;
        int iIntValue = ((Integer) obj).intValue();
        switch (i14) {
            case 0:
                i81.a aVar = this.f58295b;
                aVar.f92255e.a(iIntValue);
                aVar.y4(iIntValue, "oneDay");
                break;
            case 1:
                this.f58295b.z4(iIntValue);
                break;
            case 2:
                i81.a aVar2 = this.f58295b;
                aVar2.f92255e.a(iIntValue);
                aVar2.y4(iIntValue, "oneYear");
                break;
            case 3:
                this.f58295b.z4(iIntValue);
                break;
            case 4:
                i81.a aVar3 = this.f58295b;
                aVar3.f92255e.a(iIntValue);
                aVar3.y4(iIntValue, "twelveWeeks");
                break;
            default:
                this.f58295b.z4(iIntValue);
                break;
        }
        return Unit.INSTANCE;
    }
}
