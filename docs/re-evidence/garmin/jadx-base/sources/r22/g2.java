package r22;

import com.garmin.android.apps.connectmobile.view.UserLevelImageView;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class g2 implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f149659a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ UserLevelImageView f149660b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ b12.b f149661c;

    public /* synthetic */ g2(UserLevelImageView userLevelImageView, b12.b bVar, int i14) {
        this.f149659a = i14;
        this.f149660b = userLevelImageView;
        this.f149661c = bVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        float fC1;
        int i14 = this.f149659a;
        UserLevelImageView userLevelImageView = this.f149660b;
        int i15 = 1;
        switch (i14) {
            case 0:
                p3.m mVar = (p3.m) obj;
                int iIntValue = ((Integer) obj2).intValue();
                int i16 = UserLevelImageView.f47555c;
                if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                    p3.x1 x1Var = p3.n.f135158a;
                    z02.b.a(false, null, null, null, false, z3.f.c(1447234126, new g2(userLevelImageView, this.f149661c, i15), mVar), mVar, 196608, 31);
                } else {
                    mVar.e();
                }
                break;
            default:
                p3.m mVar2 = (p3.m) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                int i17 = UserLevelImageView.f47555c;
                if (mVar2.n(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    p3.x1 x1Var2 = p3.n.f135158a;
                    p3.p1 p1VarG = o53.f0.G(userLevelImageView.f47556a, mVar2);
                    g6.c cVar = (g6.c) mVar2.A(kotlin.t1.f91490h);
                    Integer num = (Integer) p1VarG.getF182175a();
                    if (num != null) {
                        fC1 = cVar.c1(num.intValue());
                    } else {
                        d92.b.f58623a.getClass();
                        d92.b.f58625c.getClass();
                        fC1 = j92.b.f97901d.f97908g;
                    }
                    b12.k.b(null, null, fC1, this.f149661c, mVar2, b12.b.f14385f << 9, 3);
                } else {
                    mVar2.e();
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
