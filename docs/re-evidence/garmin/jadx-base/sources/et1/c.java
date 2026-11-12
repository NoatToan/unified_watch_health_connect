package et1;

import p005kotlin.Unit;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class c implements e23.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f65358a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f4.s f65359b;

    public /* synthetic */ c(f4.s sVar, int i14) {
        this.f65358a = i14;
        this.f65359b = sVar;
    }

    @Override // e23.l
    public final Object invoke(Object obj) {
        String str = (String) obj;
        switch (this.f65358a) {
            case 0:
                str.getClass();
                f4.s sVar = this.f65359b;
                if (sVar.contains(str)) {
                    sVar.remove(str);
                } else {
                    sVar.add(str);
                }
                break;
            case 1:
                str.getClass();
                f4.s sVar2 = this.f65359b;
                if (sVar2.contains(str)) {
                    sVar2.remove(str);
                } else {
                    sVar2.add(str);
                }
                break;
            case 2:
                str.getClass();
                f4.s sVar3 = this.f65359b;
                if (sVar3.contains(str)) {
                    sVar3.remove(str);
                } else {
                    sVar3.add(str);
                }
                break;
            case 3:
                str.getClass();
                f4.s sVar4 = this.f65359b;
                if (sVar4.contains(str)) {
                    sVar4.remove(str);
                } else {
                    sVar4.add(str);
                }
                break;
            case 4:
                str.getClass();
                f4.s sVar5 = this.f65359b;
                if (sVar5.contains(str)) {
                    sVar5.remove(str);
                } else {
                    sVar5.add(str);
                }
                break;
            default:
                str.getClass();
                f4.s sVar6 = this.f65359b;
                if (sVar6.contains(str)) {
                    sVar6.remove(str);
                } else {
                    sVar6.add(str);
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
