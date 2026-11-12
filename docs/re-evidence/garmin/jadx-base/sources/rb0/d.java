package rb0;

import e23.l;
import e23.p;
import h4.r;
import p005kotlin.Unit;
import p3.m;
import p3.p0;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class d implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f151549a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ r f151550b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ hv.a f151551c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f151552d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ l f151553e;

    public /* synthetic */ d(r rVar, hv.a aVar, int i14, l lVar, int i15, int i16) {
        this.f151549a = i16;
        this.f151550b = rVar;
        this.f151551c = aVar;
        this.f151552d = i14;
        this.f151553e = lVar;
    }

    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f151549a) {
            case 0:
                ((Integer) obj2).getClass();
                int iT = p0.t(7);
                h.d(this.f151550b, this.f151551c, this.f151552d, this.f151553e, (m) obj, iT);
                break;
            default:
                ((Integer) obj2).getClass();
                int iT2 = p0.t(7);
                tb0.c.d(this.f151550b, this.f151551c, this.f151552d, this.f151553e, (m) obj, iT2);
                break;
        }
        return Unit.INSTANCE;
    }
}
