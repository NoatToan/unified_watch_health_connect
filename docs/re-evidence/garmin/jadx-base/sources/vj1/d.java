package vj1;

import e23.l;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class d implements e23.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f178457a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ l f178458b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ wj1.a f178459c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ e23.a f178460d;

    public /* synthetic */ d(l lVar, wj1.a aVar, e23.a aVar2, int i14) {
        this.f178457a = i14;
        this.f178458b = lVar;
        this.f178459c = aVar;
        this.f178460d = aVar2;
    }

    @Override // e23.a
    public final Object invoke() {
        switch (this.f178457a) {
            case 0:
                this.f178458b.invoke(this.f178459c);
                this.f178460d.invoke();
                break;
            default:
                this.f178458b.invoke(this.f178459c);
                this.f178460d.invoke();
                break;
        }
        return Unit.INSTANCE;
    }
}
