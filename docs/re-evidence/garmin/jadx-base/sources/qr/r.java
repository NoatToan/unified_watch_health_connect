package qr;

import p005kotlin.Unit;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class r implements e23.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f146457a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ t f146458b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f146459c;

    public /* synthetic */ r(String str, t tVar) {
        this.f146457a = 2;
        this.f146459c = str;
        this.f146458b = tVar;
    }

    @Override // e23.a
    public final Object invoke() {
        int i14 = this.f146457a;
        t tVar = this.f146458b;
        String str = this.f146459c;
        switch (i14) {
            case 0:
                int i15 = t.A2;
                tVar.E4(new nr.y0(str));
                break;
            case 1:
                int i16 = t.A2;
                tVar.E4(new nr.w0.f0(str));
                break;
            default:
                if (str != null) {
                    tVar.t5(tVar.f146575z, str);
                } else {
                    int i17 = t.A2;
                }
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ r(t tVar, String str, int i14) {
        this.f146457a = i14;
        this.f146458b = tVar;
        this.f146459c = str;
    }
}
