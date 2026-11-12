package au0;

import ew1.d3;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class m implements e23.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f12964a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e23.l f12965b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f12966c;

    public /* synthetic */ m(e23.l lVar, int i14, int i15) {
        this.f12964a = i15;
        this.f12965b = lVar;
        this.f12966c = i14;
    }

    @Override // e23.a
    public final Object invoke() {
        int i14 = this.f12964a;
        int i15 = this.f12966c;
        e23.l lVar = this.f12965b;
        switch (i14) {
            case 0:
                lVar.invoke(Integer.valueOf(i15));
                return Unit.INSTANCE;
            case 1:
                lVar.invoke(Integer.valueOf(i15));
                return Unit.INSTANCE;
            case 2:
                if (i15 < 0 || i15 >= 10) {
                    vb.h.s(v.e0.f(i15, "Int ", " is not a decimal digit"));
                    return null;
                }
                lVar.invoke(Character.valueOf((char) (i15 + 48)));
                return Unit.INSTANCE;
            case 3:
                lVar.invoke(Integer.valueOf(i15));
                return Unit.INSTANCE;
            case 4:
                lVar.invoke(Integer.valueOf(i15));
                return Unit.INSTANCE;
            case 5:
                lVar.invoke(Integer.valueOf(i15));
                return Unit.INSTANCE;
            case 6:
                lVar.invoke(Integer.valueOf(i15));
                return Unit.INSTANCE;
            case 7:
                lVar.invoke(Integer.valueOf(i15));
                return Unit.INSTANCE;
            case 8:
                if (lVar != null) {
                    lVar.invoke(Integer.valueOf(i15));
                }
                return Unit.INSTANCE;
            case 9:
                d3.a aVar = d3.f66394d;
                lVar.invoke(Integer.valueOf(i15));
                return Unit.INSTANCE;
            case 10:
                lVar.invoke(Integer.valueOf(i15 + 1));
                return Unit.INSTANCE;
            case 11:
                lVar.invoke(Integer.valueOf(i15));
                return Unit.INSTANCE;
            case 12:
                lVar.invoke(Integer.valueOf(i15));
                return Unit.INSTANCE;
            case 13:
                lVar.invoke(Integer.valueOf(i15));
                return Unit.INSTANCE;
            case 14:
                lVar.invoke(Integer.valueOf(i15));
                return Unit.INSTANCE;
            case 15:
                lVar.invoke(new n30.i.f(i15, true));
                return Unit.INSTANCE;
            case 16:
                lVar.invoke(Integer.valueOf(i15));
                return Unit.INSTANCE;
            case 17:
                lVar.invoke(Integer.valueOf(i15));
                return Unit.INSTANCE;
            case 18:
                lVar.invoke(Integer.valueOf(i15));
                return Unit.INSTANCE;
            case 19:
                lVar.invoke(Integer.valueOf(i15));
                return Unit.INSTANCE;
            case 20:
                lVar.invoke(Integer.valueOf(i15 - 1));
                return Unit.INSTANCE;
            case 21:
                lVar.invoke(Integer.valueOf(i15 + 1));
                return Unit.INSTANCE;
            default:
                lVar.invoke(Integer.valueOf(i15));
                return Unit.INSTANCE;
        }
    }
}
