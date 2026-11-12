package gs;

import nr.p0;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class a implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f78584a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ h4.r f78585b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ p0 f78586c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ float f78587d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ds.n f78588e;

    public /* synthetic */ a(h4.r rVar, p0 p0Var, float f14, ds.n nVar, int i14, int i15) {
        this.f78584a = i15;
        this.f78585b = rVar;
        this.f78586c = p0Var;
        this.f78587d = f14;
        this.f78588e = nVar;
    }

    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f78584a) {
            case 0:
                ((Integer) obj2).getClass();
                int iT = p3.p0.t(1);
                c.a(this.f78585b, this.f78586c, this.f78587d, this.f78588e, (p3.m) obj, iT);
                break;
            case 1:
                ((Integer) obj2).getClass();
                int iT2 = p3.p0.t(1);
                g.a(this.f78585b, this.f78586c, this.f78587d, this.f78588e, (p3.m) obj, iT2);
                break;
            case 2:
                ((Integer) obj2).getClass();
                int iT3 = p3.p0.t(1);
                j.a(this.f78585b, this.f78586c, this.f78587d, this.f78588e, (p3.m) obj, iT3);
                break;
            case 3:
                ((Integer) obj2).getClass();
                int iT4 = p3.p0.t(1);
                l.c(this.f78585b, this.f78586c, this.f78587d, this.f78588e, (p3.m) obj, iT4);
                break;
            default:
                ((Integer) obj2).getClass();
                int iT5 = p3.p0.t(1);
                n.d(this.f78585b, this.f78586c, this.f78587d, this.f78588e, (p3.m) obj, iT5);
                break;
        }
        return Unit.INSTANCE;
    }
}
