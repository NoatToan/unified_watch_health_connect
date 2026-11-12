package e11;

import c22.x0;
import com.garmin.android.apps.connectmobile.R;
import org.slf4j.Marker;
import p005kotlin.Unit;
import p3.p0;
import p3.x1;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class u implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f61961a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ v21.e f61962b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f61963c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f61964d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f61965e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ e23.l f61966f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ e23.l f61967g;

    public /* synthetic */ u(String str, boolean z14, e23.l lVar, String str2, e23.l lVar2, v21.e eVar) {
        this.f61963c = str;
        this.f61965e = z14;
        this.f61966f = lVar;
        this.f61964d = str2;
        this.f61967g = lVar2;
        this.f61962b = eVar;
    }

    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f61961a) {
            case 0:
                p3.m mVar = (p3.m) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x1 x1Var = p3.n.f135158a;
                    x0.f23314a.getClass();
                    String strConcat = gl1.d.W(x0.Ae).concat(Marker.ANY_MARKER);
                    Object objQ = mVar.q();
                    p3.m.f135153a.getClass();
                    p3.m.a.C2565a c2565a = p3.m.a.f135155b;
                    if (objQ == c2565a) {
                        objQ = new dv0.n(5);
                        mVar.K(objQ);
                    }
                    e23.l lVar = (e23.l) objQ;
                    e23.l lVar2 = this.f61966f;
                    boolean zB = mVar.B(lVar2);
                    Object objQ2 = mVar.q();
                    if (zB || objQ2 == c2565a) {
                        objQ2 = new ci0.f(lVar2, 11);
                        mVar.K(objQ2);
                    }
                    x5.v.f188954b.getClass();
                    int i14 = x5.v.f188955c;
                    boolean z14 = this.f61965e;
                    y01.y.a(null, strConcat, this.f61963c, 75, z14, lVar, (e23.l) objQ2, null, i14, 0, z3.f.c(-1907259646, new o(z14, this.f61962b, 0), mVar), mVar, 12782592, 3078, 6673);
                    String strQ = gl1.y.Q(mVar, R.string.brand_name);
                    Object objQ3 = mVar.q();
                    if (objQ3 == c2565a) {
                        objQ3 = new dv0.n(6);
                        mVar.K(objQ3);
                    }
                    e23.l lVar3 = (e23.l) objQ3;
                    e23.l lVar4 = this.f61967g;
                    boolean zB2 = mVar.B(lVar4);
                    Object objQ4 = mVar.q();
                    if (zB2 || objQ4 == c2565a) {
                        objQ4 = new ci0.f(lVar4, 12);
                        mVar.K(objQ4);
                    }
                    y01.y.a(null, strQ, this.f61964d, 75, false, lVar3, (e23.l) objQ4, null, i14, 0, null, mVar, 14355456, 6, 14865);
                } else {
                    mVar.e();
                }
                break;
            default:
                ((Integer) obj2).getClass();
                x.b(this.f61962b, this.f61963c, this.f61964d, this.f61965e, this.f61966f, this.f61967g, (p3.m) obj, p0.t(1));
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ u(v21.e eVar, String str, String str2, boolean z14, e23.l lVar, e23.l lVar2, int i14) {
        this.f61962b = eVar;
        this.f61963c = str;
        this.f61964d = str2;
        this.f61965e = z14;
        this.f61966f = lVar;
        this.f61967g = lVar2;
    }
}
