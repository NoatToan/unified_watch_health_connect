package m72;

import p005kotlin.Unit;
import p3.p0;
import s5.x0;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class d implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f117101a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ x0 f117102b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f117103c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f117104d;

    public /* synthetic */ d(x0 x0Var, String str, String str2, int i14, int i15) {
        this.f117101a = i15;
        this.f117102b = x0Var;
        this.f117103c = str;
        this.f117104d = str2;
    }

    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        int i14 = this.f117101a;
        p3.m mVar = (p3.m) obj;
        ((Integer) obj2).getClass();
        switch (i14) {
            case 0:
                f.h(this.f117102b, this.f117103c, this.f117104d, mVar, p0.t(1));
                break;
            default:
                f.g(this.f117102b, this.f117103c, this.f117104d, mVar, p0.t(1));
                break;
        }
        return Unit.INSTANCE;
    }
}
