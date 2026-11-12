package ds;

import p005kotlin.Unit;
import p3.p0;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class h implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f60938a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ h4.r f60939b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ e23.a f60940c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ e23.a f60941d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ e23.a f60942e;

    public /* synthetic */ h(h4.r rVar, e23.a aVar, e23.a aVar2, e23.a aVar3, int i14, int i15) {
        this.f60938a = i15;
        this.f60939b = rVar;
        this.f60940c = aVar;
        this.f60941d = aVar2;
        this.f60942e = aVar3;
    }

    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f60938a) {
            case 0:
                ((Integer) obj2).getClass();
                int iT = p0.t(1);
                j.c(this.f60939b, this.f60940c, this.f60941d, this.f60942e, (p3.m) obj, iT);
                break;
            default:
                ((Integer) obj2).getClass();
                int iT2 = p0.t(1);
                wg2.l.b(this.f60939b, this.f60940c, this.f60941d, this.f60942e, (p3.m) obj, iT2);
                break;
        }
        return Unit.INSTANCE;
    }
}
