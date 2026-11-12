package da0;

import p005kotlin.Unit;
import p3.p0;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class c implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f58677a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ o90.a f58678b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ h4.r f58679c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f58680d;

    public /* synthetic */ c(o90.a aVar, h4.r rVar, int i14, int i15) {
        this.f58677a = i15;
        this.f58678b = aVar;
        this.f58679c = rVar;
        this.f58680d = i14;
    }

    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        int i14 = this.f58677a;
        p3.m mVar = (p3.m) obj;
        ((Integer) obj2).getClass();
        switch (i14) {
            case 0:
                f.e(this.f58678b, this.f58679c, mVar, p0.t(this.f58680d | 1));
                break;
            default:
                f.b(this.f58678b, this.f58679c, mVar, p0.t(this.f58680d | 1));
                break;
        }
        return Unit.INSTANCE;
    }
}
