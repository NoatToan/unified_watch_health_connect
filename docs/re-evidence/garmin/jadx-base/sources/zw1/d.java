package zw1;

import e23.l;
import e23.p;
import h4.r;
import i3.mh;
import p005kotlin.Unit;
import p3.m;
import p3.n;
import p3.p0;
import p3.x1;
import s5.x0;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class d implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f207257a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ r f207258b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f207259c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ x0 f207260d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ l f207261e;

    public /* synthetic */ d(r rVar, String str, x0 x0Var, l lVar, int i14) {
        this.f207258b = rVar;
        this.f207259c = str;
        this.f207260d = x0Var;
        this.f207261e = lVar;
    }

    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f207257a) {
            case 0:
                m mVar = (m) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x1 x1Var = n.f135158a;
                    mh.c(this.f207259c, this.f207258b, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, this.f207261e, this.f207260d, mVar, 0, 0, 65532);
                } else {
                    mVar.e();
                }
                break;
            default:
                ((Integer) obj2).getClass();
                e.b(this.f207258b, this.f207259c, this.f207260d, this.f207261e, (m) obj, p0.t(3073));
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ d(String str, r rVar, l lVar, x0 x0Var) {
        this.f207259c = str;
        this.f207258b = rVar;
        this.f207261e = lVar;
        this.f207260d = x0Var;
    }
}
