package ad0;

import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class e implements e23.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2728a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e23.l f2729b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f2730c;

    public /* synthetic */ e(e23.l lVar, boolean z14, int i14) {
        this.f2728a = i14;
        this.f2729b = lVar;
        this.f2730c = z14;
    }

    @Override // e23.a
    public final Object invoke() {
        int i14 = this.f2728a;
        boolean z14 = this.f2730c;
        e23.l lVar = this.f2729b;
        switch (i14) {
            case 0:
                if (z14) {
                    lVar.invoke(ub0.a.PAUSE);
                } else {
                    lVar.invoke(ub0.a.RESUME);
                }
                break;
            case 1:
                if (lVar != null) {
                    lVar.invoke(Boolean.valueOf(z14));
                }
                break;
            case 2:
                lVar.invoke(Boolean.valueOf(!z14));
                break;
            case 3:
                lVar.invoke(Boolean.valueOf(z14));
                break;
            case 4:
                lVar.invoke(Boolean.valueOf(!z14));
                break;
            case 5:
                lVar.invoke(Boolean.valueOf(!z14));
                break;
            case 6:
                lVar.invoke(Boolean.valueOf(!z14));
                break;
            case 7:
                lVar.invoke(Boolean.valueOf(!z14));
                break;
            case 8:
                int i15 = j2.i.F;
                lVar.invoke(Boolean.valueOf(!z14));
                break;
            case 9:
                lVar.invoke(Boolean.valueOf(!z14));
                break;
            case 10:
                lVar.invoke(Boolean.valueOf(z14));
                break;
            case 11:
                if (z14) {
                    lVar.invoke(n30.i.l.f123493a);
                }
                break;
            case 12:
                lVar.invoke(Boolean.valueOf(z14));
                break;
            case 13:
                lVar.invoke(Boolean.valueOf(!z14));
                break;
            case 14:
                lVar.invoke(Boolean.valueOf(!z14));
                break;
            case 15:
                lVar.invoke(Boolean.valueOf(!z14));
                break;
            case 16:
                lVar.invoke(Boolean.valueOf(!z14));
                break;
            case 17:
                lVar.invoke(Boolean.valueOf(!z14));
                break;
            case 18:
                if (z14) {
                    lVar.invoke(ub0.a.PAUSE);
                } else {
                    lVar.invoke(ub0.a.RESUME);
                }
                break;
            case 19:
                lVar.invoke(Boolean.valueOf(!z14));
                break;
            case 20:
                lVar.invoke(Boolean.valueOf(!z14));
                break;
            case 21:
                lVar.invoke(Boolean.valueOf(!z14));
                break;
            default:
                lVar.invoke(Boolean.valueOf(!z14));
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ e(boolean z14, e23.l lVar, int i14) {
        this.f2728a = i14;
        this.f2730c = z14;
        this.f2729b = lVar;
    }
}
