package ap0;

import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class e implements e23.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11665a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f f11666b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ sd2.f f11667c;

    public /* synthetic */ e(f fVar, sd2.f fVar2, int i14) {
        this.f11665a = i14;
        this.f11666b = fVar;
        this.f11667c = fVar2;
    }

    @Override // e23.a
    public final Object invoke() {
        switch (this.f11665a) {
            case 0:
                this.f11666b.f11668a.y6(this.f11667c.getUnitID(), true);
                break;
            default:
                this.f11666b.f11668a.y6(this.f11667c.getUnitID(), false);
                break;
        }
        return Unit.INSTANCE;
    }
}
