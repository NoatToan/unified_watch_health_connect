package sg0;

import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class v0 implements e23.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f159173a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e23.l f159174b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ue0.l f159175c;

    public /* synthetic */ v0(e23.l lVar, ue0.l lVar2, int i14) {
        this.f159173a = i14;
        this.f159174b = lVar;
        this.f159175c = lVar2;
    }

    @Override // e23.a
    public final Object invoke() {
        switch (this.f159173a) {
            case 0:
                this.f159174b.invoke(this.f159175c);
                break;
            default:
                this.f159174b.invoke(String.valueOf(this.f159175c.getUserId()));
                break;
        }
        return Unit.INSTANCE;
    }
}
