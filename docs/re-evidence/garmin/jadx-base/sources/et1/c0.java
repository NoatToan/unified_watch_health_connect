package et1;

import i3.mc;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class c0 implements e23.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f65360a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ mc f65361b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ e23.a f65362c;

    public /* synthetic */ c0(mc mcVar, e23.a aVar, int i14) {
        this.f65360a = i14;
        this.f65361b = mcVar;
        this.f65362c = aVar;
    }

    @Override // e23.a
    public final Object invoke() {
        switch (this.f65360a) {
            case 0:
                if (!this.f65361b.e()) {
                    this.f65362c.invoke();
                }
                break;
            default:
                if (!this.f65361b.e()) {
                    this.f65362c.invoke();
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
