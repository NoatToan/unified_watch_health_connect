package ih0;

import p005kotlin.Unit;
import p3.p0;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class l implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f93460a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ m f93461b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f93462c;

    public /* synthetic */ l(m mVar, int i14, int i15) {
        this.f93460a = i15;
        this.f93461b = mVar;
        this.f93462c = i14;
    }

    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        int i14 = this.f93460a;
        int i15 = this.f93462c;
        m mVar = this.f93461b;
        p3.m mVar2 = (p3.m) obj;
        ((Integer) obj2).getClass();
        int i16 = m.f93463f;
        switch (i14) {
            case 0:
                mVar.j(mVar2, p0.t(i15 | 1));
                break;
            case 1:
                mVar.g(mVar2, p0.t(i15 | 1));
                break;
            case 2:
                mVar.i(mVar2, p0.t(i15 | 1));
                break;
            default:
                mVar.h(mVar2, p0.t(i15 | 1));
                break;
        }
        return Unit.INSTANCE;
    }
}
