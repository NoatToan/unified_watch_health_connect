package rb0;

import e23.p;
import h4.r;
import p005kotlin.Unit;
import p3.m;
import p3.p0;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class f implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f151559a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ r f151560b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ hv.a f151561c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f151562d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f151563e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f151564f;

    public /* synthetic */ f(r rVar, hv.a aVar, int i14, int i15, boolean z14, int i16, int i17) {
        this.f151559a = i17;
        this.f151560b = rVar;
        this.f151561c = aVar;
        this.f151562d = i14;
        this.f151563e = i15;
        this.f151564f = z14;
    }

    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f151559a) {
            case 0:
                ((Integer) obj2).getClass();
                int iT = p0.t(7);
                h.a(this.f151560b, this.f151561c, this.f151562d, this.f151563e, this.f151564f, (m) obj, iT);
                break;
            default:
                ((Integer) obj2).getClass();
                int iT2 = p0.t(7);
                tb0.c.a(this.f151560b, this.f151561c, this.f151562d, this.f151563e, this.f151564f, (m) obj, iT2);
                break;
        }
        return Unit.INSTANCE;
    }
}
