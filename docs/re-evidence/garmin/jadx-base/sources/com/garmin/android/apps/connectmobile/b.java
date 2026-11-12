package com.garmin.android.apps.connectmobile;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class b implements e23.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f30308a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c f30309b;

    public /* synthetic */ b(c cVar, int i14) {
        this.f30308a = i14;
        this.f30309b = cVar;
    }

    @Override // e23.l
    public final Object invoke(Object obj) {
        switch (this.f30308a) {
            case 0:
                return this.f30309b.lambda$getCommonBehaviorHandlers$1((a1) obj);
            default:
                ((p3.i0) obj).getClass();
                c cVar = this.f30309b;
                j1.v vVar = new j1.v(cVar, 3);
                cVar.addOnNewIntentListener(vVar);
                return new mt1.f(cVar, vVar);
        }
    }
}
