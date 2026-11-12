package h50;

import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class f implements e23.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f82046a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e23.l f82047b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ i50.i f82048c;

    public /* synthetic */ f(e23.l lVar, i50.i iVar) {
        this.f82047b = lVar;
        this.f82048c = iVar;
    }

    @Override // e23.a
    public final Object invoke() {
        switch (this.f82046a) {
            case 0:
                i50.i iVar = i50.i.CREATED_BY_YOU;
                i50.i iVar2 = this.f82048c;
                e23.l lVar = this.f82047b;
                if (iVar2 == iVar) {
                    lVar.invoke(i50.a.g.f91678a);
                } else {
                    lVar.invoke(i50.a.n.f91686a);
                }
                break;
            default:
                this.f82047b.invoke(this.f82048c);
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ f(i50.i iVar, e23.l lVar) {
        this.f82048c = iVar;
        this.f82047b = lVar;
    }
}
