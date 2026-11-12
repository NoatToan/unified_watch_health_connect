package d70;

import c2.t0;
import c2.x2;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.trails.presentation.UserTrailReviewsActivity;
import e23.p;
import gl1.y;
import h4.r;
import i3.i7;
import o4.d0;
import p005kotlin.Unit;
import p3.p0;
import p3.x1;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class n implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f58133a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f58134b;

    public /* synthetic */ n(long j8, int i14) {
        this.f58133a = i14;
        this.f58134b = j8;
    }

    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        int i14 = this.f58133a;
        long j8 = this.f58134b;
        switch (i14) {
            case 0:
                ((Integer) obj2).getClass();
                o.b(j8, (p3.m) obj, p0.t(1));
                break;
            case 1:
                ((Integer) obj2).getClass();
                es.e.b(j8, (p3.m) obj, p0.t(1));
                break;
            case 2:
                p3.m mVar = (p3.m) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x1 x1Var = p3.n.f135158a;
                    r.a aVar = r.S;
                    d92.b.f58623a.getClass();
                    d92.b.f58625c.getClass();
                    i7.a(n5.c.a(R.drawable.legend_dashes, mVar, 0), null, x2.q(aVar, j92.b.f97899b.f97920e), this.f58134b, mVar, 48, 0);
                } else {
                    mVar.e();
                }
                break;
            case 3:
                p3.m mVar2 = (p3.m) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                int i15 = UserTrailReviewsActivity.f45087a;
                if (mVar2.n(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    x1 x1Var2 = p3.n.f135158a;
                    gl.b.e(null, Long.valueOf(j8), mVar2, 0);
                } else {
                    mVar2.e();
                }
                break;
            case 4:
                p3.m mVar3 = (p3.m) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                if (mVar3.n(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    x1 x1Var3 = p3.n.f135158a;
                    c2.j.f22691a.getClass();
                    c2.j.c cVar = c2.j.f22696f;
                    r rVarF = x2.f(r.S, 1.0f);
                    d92.b.f58623a.getClass();
                    d92.b.f58625c.getClass();
                    t0.a(c2.l.A(rVarF, 0.0f, j92.b.f97899b.f97920e, 1), cVar, null, null, 0, 0, z3.f.c(-2078260623, new aa2.e(j8, 4), mVar3), mVar3, 1572912, 60);
                } else {
                    mVar3.e();
                }
                break;
            case 5:
                p3.m mVar4 = (p3.m) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                if (mVar4.n(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    x1 x1Var4 = p3.n.f135158a;
                    y31.b.a(this.f58134b, y.Q(mVar4, R.string.no_value), y.Q(mVar4, R.string.lbl_ms), y.Q(mVar4, R.string.hrv), mVar4, 24576);
                } else {
                    mVar4.e();
                }
                break;
            case 6:
                p3.m mVar5 = (p3.m) obj;
                int iIntValue5 = ((Integer) obj2).intValue();
                if (mVar5.n(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                    x1 x1Var5 = p3.n.f135158a;
                    m92.y.b(d0.a(j8), y.Q(mVar5, R.string.no_value), null, null, y.Q(mVar5, R.string.hrv), null, mVar5, 384, 40);
                } else {
                    mVar5.e();
                }
                break;
            case 7:
                ((Integer) obj2).getClass();
                z02.b.b(j8, (p3.m) obj, p0.t(1));
                break;
            default:
                ((Integer) obj2).getClass();
                zd0.e.b(j8, (p3.m) obj, p0.t(1));
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ n(long j8, int i14, int i15) {
        this.f58133a = i15;
        this.f58134b = j8;
    }
}
