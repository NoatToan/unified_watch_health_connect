package cq;

import i3.mc;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class h implements e23.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f55019a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e23.l f55020b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ mc f55021c;

    public /* synthetic */ h(e23.l lVar, mc mcVar, int i14) {
        this.f55019a = i14;
        this.f55020b = lVar;
        this.f55021c = mcVar;
    }

    @Override // e23.a
    public final Object invoke() {
        switch (this.f55019a) {
            case 0:
                this.f55020b.invoke(this.f55021c);
                break;
            default:
                this.f55020b.invoke(this.f55021c);
                break;
        }
        return Unit.INSTANCE;
    }
}
