package et1;

import p005kotlin.Unit;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class d implements e23.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f65387a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f4.s f65388b;

    public /* synthetic */ d(f4.s sVar, int i14) {
        this.f65387a = i14;
        this.f65388b = sVar;
    }

    @Override // e23.a
    public final Object invoke() {
        int i14 = this.f65387a;
        f4.s sVar = this.f65388b;
        switch (i14) {
            case 0:
                sVar.clear();
                return Unit.INSTANCE;
            case 1:
                sVar.clear();
                return Unit.INSTANCE;
            case 2:
                sVar.clear();
                return Unit.INSTANCE;
            case 3:
                sVar.clear();
                return Unit.INSTANCE;
            default:
                float f14 = com.garmin.android.apps.connectmobile.newsfeed.d.f39492d;
                return Boolean.valueOf(sVar.isEmpty());
        }
    }
}
