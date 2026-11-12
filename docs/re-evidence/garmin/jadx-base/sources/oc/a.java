package oc;

import e23.p;
import i3.j2;
import i3.u7;
import p005kotlin.Unit;
import p3.m;
import p3.n;
import p3.p0;
import p3.x1;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f131140a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f131141b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ p f131142c;

    public /* synthetic */ a(boolean z14, p pVar) {
        this.f131141b = z14;
        this.f131142c = pVar;
    }

    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        j2 j2VarD;
        int i14 = this.f131140a;
        boolean z14 = this.f131141b;
        switch (i14) {
            case 0:
                ((Integer) obj2).getClass();
                b.b(z14, this.f131142c, (m) obj, p0.t(1));
                break;
            default:
                m mVar = (m) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x1 x1Var = n.f135158a;
                    if (z14) {
                        mVar.C(-1500636645);
                        j2VarD = d92.c.c(d92.b.f58623a, mVar, d92.b.f58626d);
                        mVar.f();
                    } else {
                        mVar.C(-1500580070);
                        j2VarD = d92.c.d(d92.b.f58623a, mVar, d92.b.f58626d);
                        mVar.f();
                    }
                    u7.b(j2VarD, null, null, this.f131142c, mVar, 0);
                } else {
                    mVar.e();
                }
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ a(boolean z14, p pVar, int i14) {
        this.f131141b = z14;
        this.f131142c = pVar;
    }
}
