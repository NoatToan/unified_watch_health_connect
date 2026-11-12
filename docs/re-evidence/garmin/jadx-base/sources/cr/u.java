package cr;

import com.garmin.android.apps.connectmobile.R;
import p005kotlin.Unit;
import p3.p0;
import p3.x1;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class u implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f55291a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f55292b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f55293c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f55294d;

    public /* synthetic */ u(h4.r rVar, long j8, long j14, int i14) {
        this.f55294d = rVar;
        this.f55292b = j8;
        this.f55293c = j14;
    }

    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        int i14 = this.f55291a;
        Object obj3 = this.f55294d;
        switch (i14) {
            case 0:
                ((Integer) obj2).getClass();
                x.d((h4.r) obj3, this.f55292b, this.f55293c, (p3.m) obj, p0.t(1));
                break;
            default:
                String str = (String) obj3;
                p3.m mVar = (p3.m) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x1 x1Var = p3.n.f135158a;
                    j82.e.h(i53.a.e(p13.x.k(new j82.f(str, new j82.g.a(this.f55292b, null), null, 4, null), new j82.f(gl1.y.Q(mVar, R.string.lbl_typical_range), new j82.g.a(this.f55293c, null), null, 4, null))), null, null, mVar, 0, 6);
                } else {
                    mVar.e();
                }
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ u(String str, long j8, long j14) {
        this.f55294d = str;
        this.f55292b = j8;
        this.f55293c = j14;
    }
}
