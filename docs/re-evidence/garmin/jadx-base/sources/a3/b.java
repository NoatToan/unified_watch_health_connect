package a3;

import com.garmin.android.apps.connectmobile.R;
import i3.d7;
import i3.t6;
import org.joda.time.DateTime;
import p005kotlin.Unit;
import p3.x1;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class b implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f609a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f610b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f611c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f612d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f613e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f614f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f615g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Object f616h;

    public /* synthetic */ b(long j8, String str, String str2, String str3, long j14, String str4, String str5) {
        this.f610b = j8;
        this.f612d = str;
        this.f613e = str2;
        this.f614f = str3;
        this.f611c = j14;
        this.f615g = str4;
        this.f616h = str5;
    }

    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        String strValueOf;
        String strValueOf2;
        int i14 = this.f609a;
        long j8 = this.f611c;
        long j14 = this.f610b;
        Object obj3 = this.f616h;
        Object obj4 = this.f615g;
        Object obj5 = this.f614f;
        Object obj6 = this.f613e;
        Object obj7 = this.f612d;
        switch (i14) {
            case 0:
                ((Integer) obj2).getClass();
                f.b((e23.p) obj7, (h4.r) obj4, (e23.p) obj6, (e23.p) obj5, (o4.r1) obj3, this.f610b, this.f611c, (p3.m) obj, p3.p0.t(1));
                break;
            case 1:
                String str = (String) obj7;
                String str2 = (String) obj6;
                String str3 = (String) obj5;
                String str4 = (String) obj4;
                String str5 = (String) obj3;
                p3.m mVar = (p3.m) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x1 x1Var = p3.n.f135158a;
                    m92.y.b(o4.d0.a(j14), str, str2, null, str3, null, mVar, 0, 40);
                    m92.y.b(o4.d0.a(j8), str4, str2, null, str5, null, mVar, 0, 40);
                } else {
                    mVar.e();
                }
                break;
            case 2:
                ((Integer) obj2).getClass();
                d7.a((e23.a) obj7, (h4.r) obj4, (o4.r1) obj3, this.f610b, this.f611c, (t6) obj6, (e23.q) obj5, (p3.m) obj, p3.p0.t(12582913));
                break;
            case 3:
                ((Integer) obj2).getClass();
                lp1.l.a((ep1.e) obj7, this.f610b, (DateTime) obj6, (DateTime) obj5, this.f611c, (e23.a) obj4, (e23.a) obj3, (p3.m) obj, p3.p0.t(1));
                break;
            default:
                hz.d dVar = (hz.d) obj7;
                String str6 = (String) obj6;
                String str7 = (String) obj5;
                hz.d dVar2 = (hz.d) obj4;
                l22.a aVar = ((a10.a) obj3).f242a;
                p3.m mVar2 = (p3.m) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (mVar2.n(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    x1 x1Var2 = p3.n.f135158a;
                    Object objQ = mVar2.q();
                    p3.m.f135153a.getClass();
                    p3.m.a.C2565a c2565a = p3.m.a.f135155b;
                    if (objQ == c2565a) {
                        objQ = aVar.getString(R.string.lbl_sleep_avg);
                        mVar2.K(objQ);
                    }
                    String str8 = (String) objQ;
                    String str9 = (dVar == null || (strValueOf2 = String.valueOf((int) dVar.f86389b)) == null) ? str6 : strValueOf2;
                    o4.d0 d0VarA = o4.d0.a(j14);
                    Object objQ2 = mVar2.q();
                    if (objQ2 == c2565a) {
                        objQ2 = new m30.n(22);
                        mVar2.K(objQ2);
                    }
                    String strB = oi0.c.B(str7, (e23.l) objQ2, mVar2);
                    Object objQ3 = mVar2.q();
                    if (objQ3 == c2565a) {
                        objQ3 = new m30.n(23);
                        mVar2.K(objQ3);
                    }
                    m92.y.b(d0VarA, str9, str7, strB, str8, oi0.c.B(str8, (e23.l) objQ3, mVar2), mVar2, 24960, 0);
                    Object objQ4 = mVar2.q();
                    if (objQ4 == c2565a) {
                        objQ4 = aVar.getString(R.string.lbl_awake_avg);
                        mVar2.K(objQ4);
                    }
                    String str10 = (String) objQ4;
                    String str11 = (dVar2 == null || (strValueOf = String.valueOf((int) dVar2.f86389b)) == null) ? str6 : strValueOf;
                    o4.d0 d0VarA2 = o4.d0.a(j8);
                    Object objQ5 = mVar2.q();
                    if (objQ5 == c2565a) {
                        objQ5 = new m30.n(24);
                        mVar2.K(objQ5);
                    }
                    String strB2 = oi0.c.B(str7, (e23.l) objQ5, mVar2);
                    Object objQ6 = mVar2.q();
                    if (objQ6 == c2565a) {
                        objQ6 = new m30.n(25);
                        mVar2.K(objQ6);
                    }
                    m92.y.b(d0VarA2, str11, str7, strB2, str10, oi0.c.B(str10, (e23.l) objQ6, mVar2), mVar2, 24960, 0);
                } else {
                    mVar2.e();
                }
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ b(e23.a aVar, h4.r rVar, o4.r1 r1Var, long j8, long j14, t6 t6Var, e23.q qVar, int i14) {
        this.f612d = aVar;
        this.f615g = rVar;
        this.f616h = r1Var;
        this.f610b = j8;
        this.f611c = j14;
        this.f613e = t6Var;
        this.f614f = qVar;
    }

    public /* synthetic */ b(e23.p pVar, h4.r rVar, e23.p pVar2, e23.p pVar3, o4.r1 r1Var, long j8, long j14, int i14) {
        this.f612d = pVar;
        this.f615g = rVar;
        this.f613e = pVar2;
        this.f614f = pVar3;
        this.f616h = r1Var;
        this.f610b = j8;
        this.f611c = j14;
    }

    public /* synthetic */ b(ep1.e eVar, long j8, DateTime dateTime, DateTime dateTime2, long j14, e23.a aVar, e23.a aVar2, int i14) {
        this.f612d = eVar;
        this.f610b = j8;
        this.f613e = dateTime;
        this.f614f = dateTime2;
        this.f611c = j14;
        this.f615g = aVar;
        this.f616h = aVar2;
    }

    public /* synthetic */ b(hz.d dVar, String str, long j8, String str2, hz.d dVar2, long j14, a10.a aVar) {
        this.f612d = dVar;
        this.f613e = str;
        this.f610b = j8;
        this.f614f = str2;
        this.f615g = dVar2;
        this.f611c = j14;
        this.f616h = aVar;
    }
}
