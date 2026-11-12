package ky0;

import i3.mc;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class l implements e23.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f107406a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f107407b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ o53.b0 f107408c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p3.p1 f107409d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ mc f107410e;

    public /* synthetic */ l(boolean z14, o53.b0 b0Var, p3.p1 p1Var, mc mcVar, int i14) {
        this.f107406a = i14;
        this.f107407b = z14;
        this.f107408c = b0Var;
        this.f107409d = p1Var;
        this.f107410e = mcVar;
    }

    @Override // e23.a
    public final Object invoke() {
        switch (this.f107406a) {
            case 0:
                if (this.f107407b) {
                    this.f107409d.setValue(Boolean.TRUE);
                } else {
                    ge1.b.T(this.f107408c, null, null, new p(this.f107410e, null), 3);
                }
                break;
            default:
                if (this.f107407b) {
                    this.f107409d.setValue(Boolean.TRUE);
                } else {
                    ge1.b.T(this.f107408c, null, null, new yr.v(this.f107410e, null), 3);
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
