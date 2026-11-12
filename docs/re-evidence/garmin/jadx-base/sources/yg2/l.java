package yg2;

import p005kotlin.Unit;

/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class l implements e23.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f197073a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e23.l f197074b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ vf2.e f197075c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ lc.y f197076d;

    public /* synthetic */ l(e23.l lVar, vf2.e eVar, lc.y yVar, int i14) {
        this.f197073a = i14;
        this.f197074b = lVar;
        this.f197075c = eVar;
        this.f197076d = yVar;
    }

    @Override // e23.a
    public final Object invoke() {
        switch (this.f197073a) {
            case 0:
                this.f197074b.invoke(this.f197075c);
                this.f197076d.n();
                break;
            case 1:
                this.f197074b.invoke(this.f197075c);
                this.f197076d.n();
                break;
            default:
                this.f197074b.invoke(this.f197075c);
                this.f197076d.n();
                break;
        }
        return Unit.INSTANCE;
    }
}
