package e11;

import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class h0 implements e23.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f61891a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e23.p f61892b;

    public /* synthetic */ h0(e23.p pVar, int i14) {
        this.f61891a = i14;
        this.f61892b = pVar;
    }

    @Override // e23.a
    public final Object invoke() {
        switch (this.f61891a) {
            case 0:
                this.f61892b.invoke(null, null);
                break;
            case 1:
                this.f61892b.invoke(null, null);
                break;
            default:
                this.f61892b.invoke("", Boolean.FALSE);
                break;
        }
        return Unit.INSTANCE;
    }
}
