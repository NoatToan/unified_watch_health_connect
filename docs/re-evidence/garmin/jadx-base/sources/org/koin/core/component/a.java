package org.koin.core.component;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class a implements e23.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f133529a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ KoinScopeComponent f133530b;

    public /* synthetic */ a(KoinScopeComponent koinScopeComponent, int i14) {
        this.f133529a = i14;
        this.f133530b = koinScopeComponent;
    }

    @Override // e23.a
    public final Object invoke() {
        switch (this.f133529a) {
            case 0:
                return KoinScopeComponentKt.newScope$lambda$0(this.f133530b);
            default:
                return KoinScopeComponentKt.getOrCreateScope$lambda$1(this.f133530b);
        }
    }
}
