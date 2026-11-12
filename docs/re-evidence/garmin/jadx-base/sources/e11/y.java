package e11;

import androidx.lifecycle.v1;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class y implements e23.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f61991a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f11.g f61992b;

    public /* synthetic */ y(f11.g gVar, int i14) {
        this.f61991a = i14;
        this.f61992b = gVar;
    }

    @Override // e23.a
    public final Object invoke() {
        switch (this.f61991a) {
            case 0:
                this.f61992b.f67936h.setValue(f11.g.c.LOADED);
                break;
            case 1:
                f11.g gVar = this.f61992b;
                gVar.getClass();
                ge1.b.T(v1.a(gVar), null, null, new f11.h(gVar, null), 3);
                break;
            default:
                this.f61992b.x4(v01.f.FOOD_LIMIT_EXCEEDED);
                break;
        }
        return Unit.INSTANCE;
    }
}
