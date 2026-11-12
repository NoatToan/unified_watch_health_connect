package a42;

import kotlin.a4;
import kotlin.t1;
import p005kotlin.Unit;
import p3.p0;
import p3.x1;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class o implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1055a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f1056b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f1057c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f1058d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f1059e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f1060f;

    public /* synthetic */ o(s sVar, String str, String str2, long j8, boolean z14, int i14) {
        this.f1060f = sVar;
        this.f1056b = str;
        this.f1057c = str2;
        this.f1058d = j8;
        this.f1059e = z14;
    }

    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        int i14 = this.f1055a;
        Object obj3 = this.f1057c;
        Object obj4 = this.f1056b;
        Object obj5 = this.f1060f;
        switch (i14) {
            case 0:
                p3.m mVar = (p3.m) obj;
                ((Integer) obj2).getClass();
                s.a aVar = s.f1073g;
                ((s) obj5).g((String) obj4, (String) obj3, this.f1058d, this.f1059e, mVar, p0.t(1));
                break;
            case 1:
                ((Integer) obj2).getClass();
                cr.x.b((String) obj4, (String) obj3, (String) obj5, this.f1058d, this.f1059e, (p3.m) obj, p0.t(1));
                break;
            default:
                a4 a4Var = (a4) obj5;
                h4.r rVar = (h4.r) obj4;
                z2.p pVar = (z2.p) obj3;
                p3.m mVar2 = (p3.m) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (mVar2.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x1 x1Var = p3.n.f135158a;
                    p3.v.a(t1.f91502t.c(a4Var), z3.f.c(1260045569, new cr.t(this.f1058d, this.f1059e, rVar, pVar), mVar2), mVar2, 56);
                } else {
                    mVar2.e();
                }
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ o(a4 a4Var, long j8, boolean z14, h4.r rVar, z2.p pVar) {
        this.f1060f = a4Var;
        this.f1058d = j8;
        this.f1059e = z14;
        this.f1056b = rVar;
        this.f1057c = pVar;
    }

    public /* synthetic */ o(String str, String str2, String str3, long j8, boolean z14, int i14) {
        this.f1056b = str;
        this.f1057c = str2;
        this.f1060f = str3;
        this.f1058d = j8;
        this.f1059e = z14;
    }
}
