package vn2;

import org.slf4j.Logger;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class k implements e23.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f178903a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ m f178904b;

    public /* synthetic */ k(m mVar, int i14) {
        this.f178903a = i14;
        this.f178904b = mVar;
    }

    @Override // e23.a
    public final Object invoke() {
        int i14 = this.f178903a;
        m mVar = this.f178904b;
        switch (i14) {
            case 0:
                Logger logger = m.f178912c;
                mVar.getView().c();
                break;
            case 1:
                Logger logger2 = m.f178912c;
                mVar.getView().c();
                break;
            case 2:
                Logger logger3 = m.f178912c;
                mVar.getView().c();
                break;
            case 3:
                Logger logger4 = m.f178912c;
                mVar.getView().c();
                break;
            default:
                Logger logger5 = m.f178912c;
                mVar.getView().c();
                break;
        }
        return Unit.INSTANCE;
    }
}
