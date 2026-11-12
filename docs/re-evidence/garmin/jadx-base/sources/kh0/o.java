package kh0;

import p005kotlin.Unit;
import p3.p0;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class o implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f104741a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ double f104742b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f104743c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ih0.i f104744d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ e23.a f104745e;

    public /* synthetic */ o(double d14, boolean z14, ih0.i iVar, e23.a aVar, int i14, int i15) {
        this.f104741a = i15;
        this.f104742b = d14;
        this.f104743c = z14;
        this.f104744d = iVar;
        this.f104745e = aVar;
    }

    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f104741a) {
            case 0:
                ((Integer) obj2).getClass();
                int iT = p0.t(513);
                s.b(this.f104742b, this.f104743c, this.f104744d, this.f104745e, (p3.m) obj, iT);
                break;
            case 1:
                ((Integer) obj2).getClass();
                int iT2 = p0.t(513);
                s.m(this.f104742b, this.f104743c, this.f104744d, this.f104745e, (p3.m) obj, iT2);
                break;
            case 2:
                ((Integer) obj2).getClass();
                int iT3 = p0.t(513);
                s.k(this.f104742b, this.f104743c, this.f104744d, this.f104745e, (p3.m) obj, iT3);
                break;
            case 3:
                ((Integer) obj2).getClass();
                int iT4 = p0.t(513);
                s.i(this.f104742b, this.f104743c, this.f104744d, this.f104745e, (p3.m) obj, iT4);
                break;
            default:
                ((Integer) obj2).getClass();
                int iT5 = p0.t(513);
                s.d(this.f104742b, this.f104743c, this.f104744d, this.f104745e, (p3.m) obj, iT5);
                break;
        }
        return Unit.INSTANCE;
    }
}
