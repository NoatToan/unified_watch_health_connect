package vy0;

import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class p implements e23.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f180762a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e23.l f180763b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.garmin.android.apps.connectmobile.navigation.more.b f180764c;

    public /* synthetic */ p(e23.l lVar, com.garmin.android.apps.connectmobile.navigation.more.b bVar, int i14) {
        this.f180762a = i14;
        this.f180763b = lVar;
        this.f180764c = bVar;
    }

    @Override // e23.a
    public final Object invoke() {
        switch (this.f180762a) {
            case 0:
                this.f180763b.invoke(this.f180764c);
                break;
            case 1:
                this.f180763b.invoke(this.f180764c);
                break;
            default:
                this.f180763b.invoke(this.f180764c);
                break;
        }
        return Unit.INSTANCE;
    }
}
