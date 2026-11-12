package ii0;

import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class p implements e23.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f93720a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ mi0.f f93721b;

    public /* synthetic */ p(mi0.f fVar, int i14) {
        this.f93720a = i14;
        this.f93721b = fVar;
    }

    @Override // e23.a
    public final Object invoke() {
        int i14 = this.f93720a;
        mi0.f fVar = this.f93721b;
        switch (i14) {
            case 0:
                fVar.x4();
                return Unit.INSTANCE;
            case 1:
                return new fi0.e(fVar.f118768c, fVar.f118766a, 1, 20);
            case 2:
                return new fi0.h(fVar.f118768c, fVar.f118766a, 1, 20);
            default:
                int i15 = mi0.f.f118765t;
                return new fi0.i(fVar.f118768c, fVar.f118766a, 200);
        }
    }
}
