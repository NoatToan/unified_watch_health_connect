package bg2;

import e23.p;
import p005kotlin.Unit;
import p3.p0;

/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class f implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17865a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f17866b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f17867c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f17868d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f17869e;

    public /* synthetic */ f(Object obj, boolean z14, boolean z15, int i14, int i15) {
        this.f17865a = i15;
        this.f17869e = obj;
        this.f17866b = z14;
        this.f17867c = z15;
        this.f17868d = i14;
    }

    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f17865a) {
            case 0:
                ((Integer) obj2).getClass();
                int iT = p0.t(this.f17868d | 1);
                g.a((String) this.f17869e, this.f17866b, this.f17867c, (p3.m) obj, iT);
                break;
            default:
                ((Integer) obj2).getClass();
                int iT2 = p0.t(this.f17868d | 1);
                gw1.k.c((iw1.a) this.f17869e, this.f17866b, this.f17867c, (p3.m) obj, iT2);
                break;
        }
        return Unit.INSTANCE;
    }
}
