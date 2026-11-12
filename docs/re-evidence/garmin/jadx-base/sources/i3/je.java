package i3;

import p005kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class je implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f88597a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e23.p f88598b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ e23.p f88599c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ e23.p f88600d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ s5.x0 f88601e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f88602f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ long f88603g;

    public /* synthetic */ je(e23.p pVar, e23.p pVar2, e23.p pVar3, s5.x0 x0Var, long j8, long j14, int i14, int i15) {
        this.f88597a = i15;
        this.f88598b = pVar;
        this.f88599c = pVar2;
        this.f88600d = pVar3;
        this.f88601e = x0Var;
        this.f88602f = j8;
        this.f88603g = j14;
    }

    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f88597a) {
            case 0:
                ((Integer) obj2).getClass();
                int iT = p3.p0.t(1);
                le.b(this.f88598b, this.f88599c, this.f88600d, this.f88601e, this.f88602f, this.f88603g, (p3.m) obj, iT);
                break;
            default:
                ((Integer) obj2).getClass();
                int iT2 = p3.p0.t(1);
                le.a(this.f88598b, this.f88599c, this.f88600d, this.f88601e, this.f88602f, this.f88603g, (p3.m) obj, iT2);
                break;
        }
        return Unit.INSTANCE;
    }
}
