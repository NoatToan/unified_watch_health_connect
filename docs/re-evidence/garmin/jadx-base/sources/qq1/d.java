package qq1;

import e23.p;
import h4.r;
import nq1.k;
import p005kotlin.Unit;
import p3.m;
import p3.p0;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class d implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f146055a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ r f146056b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ k f146057c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ e23.a f146058d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f146059e;

    public /* synthetic */ d(r rVar, k kVar, e23.a aVar, int i14, int i15) {
        this.f146055a = i15;
        this.f146056b = rVar;
        this.f146057c = kVar;
        this.f146058d = aVar;
        this.f146059e = i14;
    }

    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        int i14 = this.f146055a;
        m mVar = (m) obj;
        ((Integer) obj2).getClass();
        switch (i14) {
            case 0:
                h.d(this.f146056b, this.f146057c, this.f146058d, mVar, p0.t(this.f146059e | 1));
                break;
            default:
                h.c(this.f146056b, this.f146057c, this.f146058d, mVar, p0.t(this.f146059e | 1));
                break;
        }
        return Unit.INSTANCE;
    }
}
