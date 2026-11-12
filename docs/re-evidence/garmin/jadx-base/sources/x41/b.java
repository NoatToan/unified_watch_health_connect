package x41;

import com.garmin.android.apps.connectmobile.pacepro.presentation.activity.PaceProComposeActivity;
import e23.p;
import g02.d;
import p005kotlin.Unit;
import p3.m;
import p3.n;
import p3.n2;
import p3.v;
import p3.x1;
import z3.f;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class b implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f188820a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ PaceProComposeActivity f188821b;

    public /* synthetic */ b(PaceProComposeActivity paceProComposeActivity, int i14) {
        this.f188820a = i14;
        this.f188821b = paceProComposeActivity;
    }

    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        int i14 = this.f188820a;
        PaceProComposeActivity paceProComposeActivity = this.f188821b;
        int i15 = 1;
        switch (i14) {
            case 0:
                m mVar = (m) obj;
                int iIntValue = ((Integer) obj2).intValue();
                PaceProComposeActivity.a aVar = PaceProComposeActivity.f39792a;
                if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x1 x1Var = n.f135158a;
                    z02.b.a(false, null, null, null, false, f.c(-231273457, new b(paceProComposeActivity, i15), mVar), mVar, 196608, 31);
                } else {
                    mVar.e();
                }
                break;
            default:
                m mVar2 = (m) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                PaceProComposeActivity.a aVar2 = PaceProComposeActivity.f39792a;
                if (mVar2.n(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    x1 x1Var2 = n.f135158a;
                    n2 n2VarC = d.f74342a.c(paceProComposeActivity.getOnBackPressedDispatcher());
                    a.f188818a.getClass();
                    v.a(n2VarC, a.f188819b, mVar2, 56);
                } else {
                    mVar2.e();
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
