package pa0;

import e23.p;
import p005kotlin.Unit;
import p3.p0;
import w52.u0;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class f implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f136725a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f136726b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ e23.a f136727c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ e23.a f136728d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f136729e;

    public /* synthetic */ f(String str, e23.a aVar, e23.a aVar2, int i14, int i15) {
        this.f136725a = i15;
        this.f136726b = str;
        this.f136727c = aVar;
        this.f136728d = aVar2;
        this.f136729e = i14;
    }

    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        p3.m mVar = (p3.m) obj;
        Integer num = (Integer) obj2;
        switch (this.f136725a) {
            case 0:
                num.intValue();
                g.c(this.f136726b, this.f136727c, this.f136728d, mVar, p0.t(this.f136729e | 1));
                break;
            default:
                num.getClass();
                u0.b(this.f136726b, this.f136727c, this.f136728d, mVar, p0.t(this.f136729e | 1));
                break;
        }
        return Unit.INSTANCE;
    }
}
