package av0;

import g22.n;
import p005kotlin.Unit;
import p13.h0;
import r53.p2;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class e implements e23.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f13182a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ pu0.b f13183b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ gv0.d f13184c;

    public /* synthetic */ e(gv0.d dVar, pu0.b bVar, int i14) {
        this.f13182a = i14;
        this.f13184c = dVar;
        this.f13183b = bVar;
    }

    @Override // e23.a
    public final Object invoke() {
        Long l14;
        Long l15;
        Long l16;
        Object value;
        Object value2;
        Object value3;
        Object value4;
        Object value5;
        Object value6;
        Object value7;
        Object value8;
        Object value9;
        int i14 = this.f13182a;
        pu0.b bVar = this.f13183b;
        gv0.d dVar = this.f13184c;
        switch (i14) {
            case 0:
                pu0.i iVar = (pu0.i) h0.d0(bVar.f141191i);
                if (iVar != null && (l14 = iVar.f141260a) != null) {
                    dVar.L4(l14.longValue());
                }
                break;
            case 1:
                pu0.i iVar2 = (pu0.i) h0.d0(bVar.f141191i);
                if (iVar2 != null && (l15 = iVar2.f141260a) != null) {
                    dVar.L4(l15.longValue());
                }
                break;
            case 2:
                pu0.i iVar3 = (pu0.i) h0.d0(bVar.f141191i);
                if (iVar3 != null && (l16 = iVar3.f141260a) != null) {
                    dVar.L4(l16.longValue());
                }
                break;
            case 3:
                p2 p2Var = dVar.f79189g;
                do {
                    value = p2Var.getValue();
                } while (!p2Var.b(value, new iv0.h(bVar, false)));
                break;
            case 4:
                int i15 = gv0.d.O0;
                if (n.d(og.a.K(bVar))) {
                    p2 p2Var2 = dVar.f79189g;
                    do {
                        value4 = p2Var2.getValue();
                    } while (!p2Var2.b(value4, new iv0.h(bVar, true)));
                } else if (n.d(og.a.I(bVar))) {
                    p2 p2Var3 = dVar.f79189g;
                    do {
                        value3 = p2Var3.getValue();
                    } while (!p2Var3.b(value3, new iv0.h(bVar, true)));
                } else {
                    p2 p2Var4 = dVar.f79189g;
                    do {
                        value2 = p2Var4.getValue();
                    } while (!p2Var4.b(value2, new iv0.h(bVar, false)));
                }
                break;
            case 5:
                int i16 = gv0.d.O0;
                if (n.d(og.a.K(bVar))) {
                    p2 p2Var5 = dVar.f79189g;
                    do {
                        value7 = p2Var5.getValue();
                    } while (!p2Var5.b(value7, new iv0.h(bVar, true)));
                } else if (n.d(og.a.I(bVar))) {
                    p2 p2Var6 = dVar.f79189g;
                    do {
                        value6 = p2Var6.getValue();
                    } while (!p2Var6.b(value6, new iv0.h(bVar, true)));
                } else {
                    p2 p2Var7 = dVar.f79189g;
                    do {
                        value5 = p2Var7.getValue();
                    } while (!p2Var7.b(value5, new iv0.h(bVar, false)));
                }
                break;
            case 6:
                p2 p2Var8 = dVar.f79189g;
                do {
                    value8 = p2Var8.getValue();
                } while (!p2Var8.b(value8, new iv0.h(bVar, false)));
                break;
            default:
                p2 p2Var9 = dVar.f79189g;
                do {
                    value9 = p2Var9.getValue();
                } while (!p2Var9.b(value9, new iv0.h(bVar, false)));
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ e(pu0.b bVar, gv0.d dVar, int i14) {
        this.f13182a = i14;
        this.f13183b = bVar;
        this.f13184c = dVar;
    }
}
