package da0;

import l72.i3;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class d0 implements e23.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f58690a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e23.l f58691b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ i3 f58692c;

    public /* synthetic */ d0(e23.l lVar, i3 i3Var, int i14) {
        this.f58690a = i14;
        this.f58691b = lVar;
        this.f58692c = i3Var;
    }

    @Override // e23.a
    public final Object invoke() {
        switch (this.f58690a) {
            case 0:
                e23.l lVar = this.f58691b;
                if (lVar != null) {
                    lVar.invoke(this.f58692c);
                }
                break;
            case 1:
                e23.l lVar2 = this.f58691b;
                if (lVar2 != null) {
                    lVar2.invoke(this.f58692c);
                }
                break;
            case 2:
                e23.l lVar3 = this.f58691b;
                if (lVar3 != null) {
                    lVar3.invoke(this.f58692c);
                }
                break;
            default:
                e23.l lVar4 = this.f58691b;
                if (lVar4 != null) {
                    lVar4.invoke(this.f58692c);
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
