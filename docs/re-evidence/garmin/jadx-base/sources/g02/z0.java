package g02;

import c2.x2;
import com.garmin.android.apps.connectmobile.R;
import i3.i7;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class z0 implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f74661a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ float f74662b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f74663c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f74664d;

    public /* synthetic */ z0(int i14, float f14, int i15, boolean z14) {
        this.f74661a = i15;
        this.f74662b = f14;
        this.f74663c = z14;
        this.f74664d = i14;
    }

    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        String strH;
        long jD;
        int i14 = this.f74661a;
        int i15 = this.f74664d;
        boolean z14 = this.f74663c;
        float f14 = this.f74662b;
        switch (i14) {
            case 0:
                p3.m mVar = (p3.m) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                    p3.x1 x1Var = p3.n.f135158a;
                    h4.r rVarQ = x2.q(h4.r.S, f14);
                    t4.d dVarA = n5.c.a(z14 ? R.drawable.star_filled : R.drawable.star_outlined, mVar, 0);
                    int i16 = i15 + 1;
                    if (i16 != 1) {
                        mVar.C(-2143651047);
                        strH = gl1.y.P(R.string.stars_rating_content_description, new Object[]{String.valueOf(i16)}, mVar);
                        mVar.f();
                    } else {
                        strH = sn.a.h(mVar, -2143491893, R.string.one_star_rating_content_description, mVar);
                    }
                    String str = strH;
                    if (z14) {
                        mVar.C(-1316064491);
                        d92.b.f58623a.getClass();
                        jD = d92.b.a(mVar).f().b();
                    } else {
                        mVar.C(-1316063561);
                        d92.b.f58623a.getClass();
                        jD = d92.b.a(mVar).f().d();
                    }
                    mVar.f();
                    i7.a(dVarA, str, rVarQ, jD, mVar, 0, 0);
                } else {
                    mVar.e();
                }
                break;
            default:
                ((Integer) obj2).getClass();
                w21.m.a(f14, z14, (p3.m) obj, p3.p0.t(i15 | 1));
                break;
        }
        return Unit.INSTANCE;
    }
}
