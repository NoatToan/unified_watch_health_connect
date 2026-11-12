package r82;

import java.util.Calendar;
import p005kotlin.Unit;
import p3.n1;
import p3.p1;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class f implements e23.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f151238a = 2;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ n1 f151239b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ i53.c f151240c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Calendar f151241d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ e23.l f151242e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ n1 f151243f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Calendar f151244g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Calendar f151245h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ p1 f151246i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ n1 f151247j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ p1 f151248k;

    public /* synthetic */ f(n1 n1Var, i53.c cVar, Calendar calendar, e23.l lVar, Calendar calendar2, Calendar calendar3, p1 p1Var, n1 n1Var2, p1 p1Var2, n1 n1Var3) {
        this.f151239b = n1Var;
        this.f151240c = cVar;
        this.f151241d = calendar;
        this.f151242e = lVar;
        this.f151244g = calendar2;
        this.f151245h = calendar3;
        this.f151246i = p1Var;
        this.f151243f = n1Var2;
        this.f151248k = p1Var2;
        this.f151247j = n1Var3;
    }

    @Override // e23.l
    public final Object invoke(Object obj) {
        int i14 = this.f151238a;
        int iIntValue = ((Integer) obj).intValue();
        switch (i14) {
            case 0:
                n1 n1Var = this.f151239b;
                n1Var.t(iIntValue);
                g.d(this.f151243f, this.f151240c, this.f151241d, this.f151242e, this.f151244g, this.f151245h, this.f151246i, n1Var, this.f151248k, this.f151247j);
                break;
            case 1:
                n1 n1Var2 = this.f151239b;
                n1Var2.t(iIntValue);
                g.d(this.f151243f, this.f151240c, this.f151241d, this.f151242e, this.f151244g, this.f151245h, this.f151246i, this.f151247j, this.f151248k, n1Var2);
                break;
            default:
                n1 n1Var3 = this.f151239b;
                n1Var3.t(iIntValue);
                g.d(n1Var3, this.f151240c, this.f151241d, this.f151242e, this.f151244g, this.f151245h, this.f151246i, this.f151243f, this.f151248k, this.f151247j);
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ f(n1 n1Var, i53.c cVar, Calendar calendar, e23.l lVar, n1 n1Var2, Calendar calendar2, Calendar calendar3, p1 p1Var, n1 n1Var3, p1 p1Var2) {
        this.f151239b = n1Var;
        this.f151240c = cVar;
        this.f151241d = calendar;
        this.f151242e = lVar;
        this.f151243f = n1Var2;
        this.f151244g = calendar2;
        this.f151245h = calendar3;
        this.f151246i = p1Var;
        this.f151247j = n1Var3;
        this.f151248k = p1Var2;
    }

    public /* synthetic */ f(n1 n1Var, i53.c cVar, Calendar calendar, e23.l lVar, n1 n1Var2, Calendar calendar2, Calendar calendar3, p1 p1Var, p1 p1Var2, n1 n1Var3) {
        this.f151239b = n1Var;
        this.f151240c = cVar;
        this.f151241d = calendar;
        this.f151242e = lVar;
        this.f151243f = n1Var2;
        this.f151244g = calendar2;
        this.f151245h = calendar3;
        this.f151246i = p1Var;
        this.f151248k = p1Var2;
        this.f151247j = n1Var3;
    }
}
