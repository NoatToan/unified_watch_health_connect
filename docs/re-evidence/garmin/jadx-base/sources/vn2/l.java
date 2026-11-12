package vn2;

import org.slf4j.Logger;

/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class l implements u03.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f178907a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ m f178908b;

    public /* synthetic */ l(m mVar, int i14) {
        this.f178907a = i14;
        this.f178908b = mVar;
    }

    @Override // u03.a
    public final void run() {
        int i14 = this.f178907a;
        m mVar = this.f178908b;
        switch (i14) {
            case 0:
                Logger logger = m.f178912c;
                mVar.getView().w8();
                mVar.getView().i();
                mVar.getView().e();
                mVar.getView().l1();
                break;
            case 1:
                Logger logger2 = m.f178912c;
                mVar.getView().hideProgressOverlay();
                break;
            case 2:
                Logger logger3 = m.f178912c;
                mVar.getView().A4();
                break;
            case 3:
                Logger logger4 = m.f178912c;
                mVar.getView().hideProgressOverlay();
                mVar.getView().c();
                break;
            case 4:
                m.f178912c.trace("User first time insert user info");
                mVar.getView().i();
                mVar.getView().e();
                mVar.getView().hideProgressOverlay();
                break;
            default:
                Logger logger5 = m.f178912c;
                mVar.getView().hideProgressOverlay();
                break;
        }
    }
}
