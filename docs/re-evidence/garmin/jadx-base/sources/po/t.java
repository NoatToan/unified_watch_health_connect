package po;

import androidx.compose.ui.platform.ComposeView;
import i3.e9;
import i3.mc;
import java.util.ArrayList;
import p005kotlin.Unit;
import p40.o0;
import ps.x1;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class t implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f138977a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f138978b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ u f138979c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ArrayList f138980d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ x1 f138981e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ComposeView f138982f;

    public /* synthetic */ t(String str, u uVar, ArrayList arrayList, x1 x1Var, ComposeView composeView, int i14) {
        this.f138977a = i14;
        this.f138978b = str;
        this.f138979c = uVar;
        this.f138980d = arrayList;
        this.f138981e = x1Var;
        this.f138982f = composeView;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x004c  */
    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f138977a) {
            case 0:
                p3.m mVar = (p3.m) obj;
                int iIntValue = ((Integer) obj2).intValue();
                int i14 = u.G1;
                if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                    p3.x1 x1Var = p3.n.f135158a;
                    z02.b.a(false, null, null, null, false, z3.f.c(241450368, new t(this.f138978b, this.f138979c, this.f138980d, this.f138981e, this.f138982f, 1), mVar), mVar, 196608, 31);
                } else {
                    mVar.e();
                }
                break;
            default:
                p3.m mVar2 = (p3.m) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                int i15 = u.G1;
                if (mVar2.n(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    p3.x1 x1Var2 = p3.n.f135158a;
                    mc mcVarF = e9.f(true, null, mVar2, 6, 2);
                    u uVar = this.f138979c;
                    com.garmin.android.apps.connectmobile.activities.newmodel.a aVar = uVar.T0;
                    boolean z14 = uVar.f138855n1;
                    ComposeView composeView = this.f138982f;
                    boolean zR = mVar2.r(composeView) | mVar2.r(uVar);
                    Object objQ = mVar2.q();
                    if (zR) {
                        objQ = new o0(10, composeView, uVar);
                        mVar2.K(objQ);
                    } else {
                        p3.m.f135153a.getClass();
                        if (objQ == p3.m.a.f135155b) {
                            objQ = new o0(10, composeView, uVar);
                            mVar2.K(objQ);
                        }
                    }
                    cq.u.b(this.f138978b, aVar, this.f138980d, this.f138981e, mcVarF, z14, (e23.a) objQ, mVar2, x1.G1 << 9);
                } else {
                    mVar2.e();
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
