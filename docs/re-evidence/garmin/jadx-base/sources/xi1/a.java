package xi1;

import com.garmin.android.apps.connectmobile.R;
import e23.p;
import gl1.y;
import p005kotlin.Unit;
import p3.m;
import p3.n;
import p3.p0;
import p3.x1;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class a implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f191127a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d f191128b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ e23.a f191129c;

    public /* synthetic */ a(d dVar, e23.a aVar) {
        this.f191128b = dVar;
        this.f191129c = aVar;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0043  */
    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        int i14 = this.f191127a;
        e23.a aVar = this.f191129c;
        d dVar = this.f191128b;
        switch (i14) {
            case 0:
                ((Integer) obj2).getClass();
                c.a(dVar, aVar, (m) obj, p0.t(1));
                break;
            default:
                m mVar = (m) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x1 x1Var = n.f135158a;
                    String strQ = y.Q(mVar, R.string.concept_news_feed);
                    boolean zR = mVar.r(dVar) | mVar.B(aVar);
                    Object objQ = mVar.q();
                    if (zR) {
                        objQ = new b(dVar, aVar, 1);
                        mVar.K(objQ);
                    } else {
                        m.f135153a.getClass();
                        if (objQ == m.a.f135155b) {
                            objQ = new b(dVar, aVar, 1);
                            mVar.K(objQ);
                        }
                    }
                    z02.f.c(0, 54, null, (e23.a) objQ, null, strQ, mVar, null);
                } else {
                    mVar.e();
                }
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ a(d dVar, e23.a aVar, int i14) {
        this.f191128b = dVar;
        this.f191129c = aVar;
    }
}
