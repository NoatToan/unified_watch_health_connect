package h60;

import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class e implements e23.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f82158a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ h f82159b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ o82.g f82160c;

    public /* synthetic */ e(h hVar, o82.g gVar, int i14) {
        this.f82158a = i14;
        this.f82159b = hVar;
        this.f82160c = gVar;
    }

    @Override // e23.a
    public final Object invoke() {
        switch (this.f82158a) {
            case 0:
                this.f82159b.getClass();
                h.x4(this.f82160c, "dailyListItem");
                break;
            default:
                this.f82159b.getClass();
                h.x4(this.f82160c, "weeklyListItem");
                break;
        }
        return Unit.INSTANCE;
    }
}
