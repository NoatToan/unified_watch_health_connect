package u91;

import e23.p;
import h4.r;
import p005kotlin.Unit;
import p3.m;
import p3.n;
import p3.p0;
import p3.x1;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class f implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f169529a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ r f169530b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ aa1.d f169531c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ q91.d f169532d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f169533e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f169534f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ boolean f169535g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ boolean f169536h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ p f169537i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ e23.a f169538j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ e23.a f169539k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ p f169540l;

    public /* synthetic */ f(r rVar, aa1.d dVar, q91.d dVar2, boolean z14, boolean z15, boolean z16, boolean z17, p pVar, e23.a aVar, e23.a aVar2, p pVar2) {
        this.f169530b = rVar;
        this.f169531c = dVar;
        this.f169532d = dVar2;
        this.f169533e = z14;
        this.f169534f = z15;
        this.f169535g = z16;
        this.f169536h = z17;
        this.f169537i = pVar;
        this.f169538j = aVar;
        this.f169539k = aVar2;
        this.f169540l = pVar2;
    }

    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f169529a) {
            case 0:
                ((Integer) obj2).getClass();
                h.a(this.f169530b, this.f169531c, this.f169532d, this.f169533e, this.f169534f, this.f169535g, this.f169536h, this.f169537i, this.f169538j, this.f169539k, this.f169540l, (m) obj, p0.t(1));
                break;
            default:
                m mVar = (m) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x1 x1Var = n.f135158a;
                    h.a(this.f169530b, this.f169531c, this.f169532d, this.f169533e, this.f169534f, this.f169535g, this.f169536h, this.f169537i, this.f169538j, this.f169539k, this.f169540l, mVar, 0);
                } else {
                    mVar.e();
                }
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ f(r rVar, aa1.d dVar, q91.d dVar2, boolean z14, boolean z15, boolean z16, boolean z17, p pVar, e23.a aVar, e23.a aVar2, p pVar2, int i14) {
        this.f169530b = rVar;
        this.f169531c = dVar;
        this.f169532d = dVar2;
        this.f169533e = z14;
        this.f169534f = z15;
        this.f169535g = z16;
        this.f169536h = z17;
        this.f169537i = pVar;
        this.f169538j = aVar;
        this.f169539k = aVar2;
        this.f169540l = pVar2;
    }
}
