package rx1;

import h2.j0;
import o53.b0;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class o implements e23.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f155011a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b0 f155012b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ j0 f155013c;

    public /* synthetic */ o(int i14, j0 j0Var, b0 b0Var) {
        this.f155011a = i14;
        this.f155012b = b0Var;
        this.f155013c = j0Var;
    }

    @Override // e23.l
    public final Object invoke(Object obj) {
        int i14 = this.f155011a;
        int iIntValue = ((Integer) obj).intValue();
        switch (i14) {
            case 0:
                ge1.b.T(this.f155012b, null, null, new q(this.f155013c, iIntValue, null), 3);
                break;
            default:
                ge1.b.T(this.f155012b, null, null, new uc1.d.c(this.f155013c, iIntValue, null), 3);
                break;
        }
        return Unit.INSTANCE;
    }
}
