package vd0;

import java.util.Calendar;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class u0 implements e23.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f177392a = 2;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p3.n1 f177393b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ i53.c f177394c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Calendar f177395d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ e23.l f177396e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ e23.p f177397f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ p3.n1 f177398g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Calendar f177399h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Calendar f177400i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ p3.p1 f177401j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ p3.n1 f177402k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ p3.p1 f177403l;

    public /* synthetic */ u0(p3.n1 n1Var, i53.c cVar, Calendar calendar, e23.l lVar, e23.p pVar, Calendar calendar2, Calendar calendar3, p3.p1 p1Var, p3.n1 n1Var2, p3.p1 p1Var2, p3.n1 n1Var3) {
        this.f177393b = n1Var;
        this.f177394c = cVar;
        this.f177395d = calendar;
        this.f177396e = lVar;
        this.f177397f = pVar;
        this.f177399h = calendar2;
        this.f177400i = calendar3;
        this.f177401j = p1Var;
        this.f177398g = n1Var2;
        this.f177403l = p1Var2;
        this.f177402k = n1Var3;
    }

    @Override // e23.l
    public final Object invoke(Object obj) {
        int i14 = this.f177392a;
        int iIntValue = ((Integer) obj).intValue();
        switch (i14) {
            case 0:
                p3.n1 n1Var = this.f177393b;
                n1Var.t(iIntValue);
                v0.d(this.f177398g, this.f177394c, this.f177395d, this.f177396e, this.f177397f, this.f177399h, this.f177400i, this.f177401j, n1Var, this.f177403l, this.f177402k);
                break;
            case 1:
                p3.n1 n1Var2 = this.f177393b;
                n1Var2.t(iIntValue);
                v0.d(this.f177398g, this.f177394c, this.f177395d, this.f177396e, this.f177397f, this.f177399h, this.f177400i, this.f177401j, this.f177402k, this.f177403l, n1Var2);
                break;
            default:
                p3.n1 n1Var3 = this.f177393b;
                n1Var3.t(iIntValue);
                v0.d(n1Var3, this.f177394c, this.f177395d, this.f177396e, this.f177397f, this.f177399h, this.f177400i, this.f177401j, this.f177398g, this.f177403l, this.f177402k);
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ u0(p3.n1 n1Var, i53.c cVar, Calendar calendar, e23.l lVar, e23.p pVar, p3.n1 n1Var2, Calendar calendar2, Calendar calendar3, p3.p1 p1Var, p3.n1 n1Var3, p3.p1 p1Var2) {
        this.f177393b = n1Var;
        this.f177394c = cVar;
        this.f177395d = calendar;
        this.f177396e = lVar;
        this.f177397f = pVar;
        this.f177398g = n1Var2;
        this.f177399h = calendar2;
        this.f177400i = calendar3;
        this.f177401j = p1Var;
        this.f177402k = n1Var3;
        this.f177403l = p1Var2;
    }

    public /* synthetic */ u0(p3.n1 n1Var, i53.c cVar, Calendar calendar, e23.l lVar, e23.p pVar, p3.n1 n1Var2, Calendar calendar2, Calendar calendar3, p3.p1 p1Var, p3.p1 p1Var2, p3.n1 n1Var3) {
        this.f177393b = n1Var;
        this.f177394c = cVar;
        this.f177395d = calendar;
        this.f177396e = lVar;
        this.f177397f = pVar;
        this.f177398g = n1Var2;
        this.f177399h = calendar2;
        this.f177400i = calendar3;
        this.f177401j = p1Var;
        this.f177403l = p1Var2;
        this.f177402k = n1Var3;
    }
}
