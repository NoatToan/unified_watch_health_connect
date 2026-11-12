package li0;

import android.content.Context;
import p005kotlin.Unit;
import p3.p1;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class t implements e23.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f112859a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e23.a f112860b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ a0 f112861c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ f f112862d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Context f112863e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ d0 f112864f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ p1 f112865g;

    public /* synthetic */ t(e23.a aVar, a0 a0Var, f fVar, Context context, d0 d0Var, p1 p1Var, int i14) {
        this.f112859a = i14;
        this.f112860b = aVar;
        this.f112861c = a0Var;
        this.f112862d = fVar;
        this.f112863e = context;
        this.f112864f = d0Var;
        this.f112865g = p1Var;
    }

    @Override // e23.a
    public final Object invoke() {
        switch (this.f112859a) {
            case 0:
                this.f112860b.invoke();
                this.f112861c.f112615c.invoke(this.f112862d, this.f112863e, this.f112864f, new ky0.k(this.f112865g, 15));
                break;
            default:
                this.f112860b.invoke();
                this.f112861c.f112615c.invoke(this.f112862d, this.f112863e, this.f112864f, new ky0.k(this.f112865g, 14));
                break;
        }
        return Unit.INSTANCE;
    }
}
