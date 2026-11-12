package rv1;

import p005kotlin.Unit;
import p3.p0;
import w52.b0;
import w52.y;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class s implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f154748a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f154749b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f154750c;

    public /* synthetic */ s(String str, String str2, int i14, int i15) {
        this.f154748a = i15;
        this.f154749b = str;
        this.f154750c = str2;
    }

    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        int i14 = this.f154748a;
        p3.m mVar = (p3.m) obj;
        ((Integer) obj2).getClass();
        switch (i14) {
            case 0:
                t.a(this.f154749b, this.f154750c, mVar, p0.t(1));
                break;
            case 1:
                tw.a.c(this.f154749b, this.f154750c, mVar, p0.t(1));
                break;
            case 2:
                ub1.f.c(this.f154749b, this.f154750c, mVar, p0.t(1));
                break;
            case 3:
                v50.b.a(this.f154749b, this.f154750c, mVar, p0.t(1));
                break;
            case 4:
                y.g(this.f154749b, this.f154750c, mVar, p0.t(1));
                break;
            case 5:
                y.o(this.f154749b, this.f154750c, mVar, p0.t(1));
                break;
            default:
                b0.a(this.f154749b, this.f154750c, mVar, p0.t(1));
                break;
        }
        return Unit.INSTANCE;
    }
}
