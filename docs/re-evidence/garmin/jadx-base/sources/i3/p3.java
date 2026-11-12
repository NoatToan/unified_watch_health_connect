package i3;

import p005kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class p3 implements e23.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f89263a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e23.l f89264b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f89265c;

    public /* synthetic */ p3(int i14, long j8, e23.l lVar) {
        this.f89263a = i14;
        this.f89264b = lVar;
        this.f89265c = j8;
    }

    @Override // e23.a
    public final Object invoke() {
        switch (this.f89263a) {
            case 0:
                this.f89264b.invoke(Long.valueOf(this.f89265c));
                break;
            default:
                this.f89264b.invoke(Long.valueOf(this.f89265c));
                break;
        }
        return Unit.INSTANCE;
    }
}
