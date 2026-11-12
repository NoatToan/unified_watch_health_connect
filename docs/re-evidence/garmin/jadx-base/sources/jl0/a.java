package jl0;

import com.garmin.android.apps.connectmobile.golf.courses.presentation.DownloadedGolfCoursesActivity;
import e23.p;
import g8.i;
import i3.f2;
import o4.f0;
import p005kotlin.Unit;
import p3.m;
import p3.n;
import p3.v;
import p3.x1;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class a implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f99453a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ DownloadedGolfCoursesActivity f99454b;

    public /* synthetic */ a(DownloadedGolfCoursesActivity downloadedGolfCoursesActivity, int i14) {
        this.f99453a = i14;
        this.f99454b = downloadedGolfCoursesActivity;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0037  */
    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        int i14 = this.f99453a;
        DownloadedGolfCoursesActivity downloadedGolfCoursesActivity = this.f99454b;
        int i15 = 2;
        int i16 = 1;
        switch (i14) {
            case 0:
                m mVar = (m) obj;
                int iIntValue = ((Integer) obj2).intValue();
                int i17 = DownloadedGolfCoursesActivity.f35747b;
                if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x1 x1Var = n.f135158a;
                    d92.a aVarA = j92.a.a();
                    z02.b.a(false, d92.a.a(aVarA, e92.b.a(aVarA.e(), f0.d(4285839382L)), 2039), d92.a.a(j92.a.b(), e92.b.a(aVarA.e(), f0.d(4285839382L)), 2039), null, false, z3.f.c(1640670215, new a(downloadedGolfCoursesActivity, i16), mVar), mVar, 196608, 25);
                } else {
                    mVar.e();
                }
                break;
            case 1:
                m mVar2 = (m) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                int i18 = DownloadedGolfCoursesActivity.f35747b;
                if (mVar2.n(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    x1 x1Var2 = n.f135158a;
                    v.a(g02.d.f74342a.c(downloadedGolfCoursesActivity.getOnBackPressedDispatcher()), z3.f.c(-1519880377, new a(downloadedGolfCoursesActivity, i15), mVar2), mVar2, 56);
                } else {
                    mVar2.e();
                }
                break;
            default:
                m mVar3 = (m) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                int i19 = DownloadedGolfCoursesActivity.f35747b;
                if (mVar3.n(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    x1 x1Var3 = n.f135158a;
                    boolean zR = mVar3.r(downloadedGolfCoursesActivity);
                    Object objQ = mVar3.q();
                    if (zR) {
                        objQ = new f2(downloadedGolfCoursesActivity, 25);
                        mVar3.K(objQ);
                    } else {
                        m.f135153a.getClass();
                        if (objQ == m.a.f135155b) {
                            objQ = new f2(downloadedGolfCoursesActivity, 25);
                            mVar3.K(objQ);
                        }
                    }
                    i.b(0, (e23.a) objQ, null, mVar3);
                } else {
                    mVar3.e();
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
