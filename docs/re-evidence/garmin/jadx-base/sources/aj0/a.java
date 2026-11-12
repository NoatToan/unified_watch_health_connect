package aj0;

import a03.e;
import a42.z;
import c.w;
import com.garmin.android.apps.connectmobile.ftp.reports.presentation.activity.FtpActivity;
import e23.l;
import e23.p;
import g.h;
import g02.d;
import org.koin.android.ext.android.AndroidKoinScopeExtKt;
import org.koin.bundle.GetViewModelKt;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s0;
import p3.m;
import p3.n;
import p3.v;
import p3.x1;
import yi0.c;
import z02.b;
import z3.f;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class a implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3419a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ FtpActivity f3420b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ c f3421c;

    public /* synthetic */ a(FtpActivity ftpActivity, c cVar, int i14) {
        this.f3419a = i14;
        this.f3420b = ftpActivity;
        this.f3421c = cVar;
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0045  */
    /* JADX WARN: Code duplicated, block: B:23:0x0088  */
    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        int i14 = this.f3419a;
        c cVar = this.f3421c;
        int i15 = 1;
        switch (i14) {
            case 0:
                m mVar = (m) obj;
                int iIntValue = ((Integer) obj2).intValue();
                FtpActivity.a aVar = FtpActivity.f35281a;
                if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x1 x1Var = n.f135158a;
                    b.a(false, null, null, null, false, f.c(465621416, new a(this.f3420b, cVar, i15), mVar), mVar, 196608, 31);
                } else {
                    mVar.e();
                }
                break;
            default:
                m mVar2 = (m) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                FtpActivity.a aVar2 = FtpActivity.f35281a;
                if (mVar2.n(1 & iIntValue2, (iIntValue2 & 3) != 2)) {
                    x1 x1Var2 = n.f135158a;
                    boolean zK = mVar2.k(cVar == null ? -1 : cVar.ordinal());
                    Object objQ = mVar2.q();
                    m.a aVar3 = m.f135153a;
                    if (zK) {
                        objQ = new e(cVar, 5);
                        mVar2.K(objQ);
                    } else {
                        aVar3.getClass();
                        if (objQ == m.a.f135155b) {
                            objQ = new e(cVar, 5);
                            mVar2.K(objQ);
                        }
                    }
                    FtpActivity ftpActivity = this.f3420b;
                    hj0.a aVar4 = (hj0.a) GetViewModelKt.resolveViewModel$default(s0.f105811a.b(hj0.a.class), ftpActivity.getF189591b(), null, ftpActivity.getDefaultViewModelCreationExtras(), null, AndroidKoinScopeExtKt.getKoinScope(ftpActivity), (e23.a) objQ, 4, null);
                    h hVar = new h();
                    boolean zR = mVar2.r(aVar4);
                    Object objQ2 = mVar2.q();
                    if (zR) {
                        objQ2 = new a03.f(aVar4, 7);
                        mVar2.K(objQ2);
                    } else {
                        aVar3.getClass();
                        if (objQ2 == m.a.f135155b) {
                            objQ2 = new a03.f(aVar4, 7);
                            mVar2.K(objQ2);
                        }
                    }
                    v.a(d.f74342a.c(ftpActivity.getOnBackPressedDispatcher()), f.c(360543848, new z(aVar4, w.c(hVar, (l) objQ2, mVar2, 0), ftpActivity, s9.c.c(aVar4.f83970h, mVar2), s9.c.c(aVar4.f83971i, mVar2), 4), mVar2), mVar2, 56);
                } else {
                    mVar2.e();
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
