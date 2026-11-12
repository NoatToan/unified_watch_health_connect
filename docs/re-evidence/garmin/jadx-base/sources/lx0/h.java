package lx0;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.menstrualcycle.presentation.setup.MCTSetupViewModel", f = "MCTSetupViewModel.kt", l = {213}, m = "getLastConfirmedCycle", v = 2)
public final class h extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f115166a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ k f115167b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f115168c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(k kVar, t13.d<? super h> dVar) {
        super(dVar);
        this.f115167b = kVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f115166a = obj;
        this.f115168c |= Integer.MIN_VALUE;
        return k.x4(this.f115167b, this);
    }
}
