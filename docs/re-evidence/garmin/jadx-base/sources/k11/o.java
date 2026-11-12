package k11;

import p005kotlin.Unit;
import p3.p1;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class o implements e23.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f102249a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p1 f102250b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ p1 f102251c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ l11.k f102252d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ e23.a f102253e;

    public /* synthetic */ o(p1 p1Var, p1 p1Var2, l11.k kVar, e23.a aVar, int i14) {
        this.f102249a = i14;
        this.f102250b = p1Var;
        this.f102251c = p1Var2;
        this.f102252d = kVar;
        this.f102253e = aVar;
    }

    @Override // e23.a
    public final Object invoke() {
        switch (this.f102249a) {
            case 0:
                s.b(this.f102250b, this.f102251c, this.f102252d, this.f102253e);
                break;
            case 1:
                s.b(this.f102250b, this.f102251c, this.f102252d, this.f102253e);
                break;
            default:
                s.b(this.f102250b, this.f102251c, this.f102252d, this.f102253e);
                break;
        }
        return Unit.INSTANCE;
    }
}
