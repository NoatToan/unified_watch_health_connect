package po;

import androidx.compose.ui.platform.ComposeView;
import java.util.ArrayList;
import p005kotlin.Unit;
import p3.x1;
import p40.o0;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class l implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f138924a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f138925b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ArrayList f138926c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ph1.d f138927d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ b f138928e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f138929f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ c f138930g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ ComposeView f138931h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ c f138932i;

    public /* synthetic */ l(int i14, ArrayList arrayList, ph1.d dVar, b bVar, boolean z14, c cVar, ComposeView composeView, c cVar2, int i15) {
        this.f138924a = i15;
        this.f138925b = i14;
        this.f138926c = arrayList;
        this.f138927d = dVar;
        this.f138928e = bVar;
        this.f138929f = z14;
        this.f138930g = cVar;
        this.f138931h = composeView;
        this.f138932i = cVar2;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0040  */
    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f138924a) {
            case 0:
                p3.m mVar = (p3.m) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x1 x1Var = p3.n.f135158a;
                    z02.b.a(false, null, null, null, false, z3.f.c(1475409074, new l(this.f138925b, this.f138926c, this.f138927d, this.f138928e, this.f138929f, this.f138930g, this.f138931h, this.f138932i, 1), mVar), mVar, 196608, 31);
                } else {
                    mVar.e();
                }
                break;
            default:
                p3.m mVar2 = (p3.m) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (mVar2.n(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    x1 x1Var2 = p3.n.f135158a;
                    ComposeView composeView = this.f138931h;
                    boolean zR = mVar2.r(composeView);
                    c cVar = this.f138932i;
                    boolean zB = zR | mVar2.B(cVar);
                    Object objQ = mVar2.q();
                    if (zB) {
                        objQ = new o0(9, composeView, cVar);
                        mVar2.K(objQ);
                    } else {
                        p3.m.f135153a.getClass();
                        if (objQ == p3.m.a.f135155b) {
                            objQ = new o0(9, composeView, cVar);
                            mVar2.K(objQ);
                        }
                    }
                    r.d(this.f138925b, this.f138926c, this.f138927d, this.f138928e, this.f138929f, this.f138930g, (e23.a) objQ, mVar2, 0);
                } else {
                    mVar2.e();
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
