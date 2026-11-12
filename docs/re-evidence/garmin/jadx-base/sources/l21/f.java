package l21;

import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class f implements e23.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f109082a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ m21.g f109083b;

    public /* synthetic */ f(m21.g gVar, int i14) {
        this.f109082a = i14;
        this.f109083b = gVar;
    }

    @Override // e23.a
    public final Object invoke() {
        int i14 = this.f109082a;
        m21.g gVar = this.f109083b;
        switch (i14) {
            case 0:
                gVar.B4();
                return Unit.INSTANCE;
            case 1:
                gVar.B4();
                return Unit.INSTANCE;
            case 2:
                gVar.L4(k21.a.ALL);
                return Unit.INSTANCE;
            case 3:
                gVar.L4(k21.a.MY_MEALS);
                return Unit.INSTANCE;
            case 4:
                gVar.L4(k21.a.MY_RECIPES);
                return Unit.INSTANCE;
            case 5:
                gVar.L4(k21.a.FAVORITES);
                return Unit.INSTANCE;
            case 6:
                gVar.L4(k21.a.MY_FOODS);
                return Unit.INSTANCE;
            default:
                int i15 = m21.g.f116107v;
                return new n01.l(gVar.f116111d, ((m21.e) gVar.f116126t.f150540a.getValue()).f116101r, gVar.f116108a);
        }
    }
}
