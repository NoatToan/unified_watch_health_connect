package pv1;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.training.fbtap.preferences.viewmodel.FBTEditPreferencesViewModel", f = "FBTEditPreferencesViewModel.kt", l = {524}, m = "updateSupplementalSportsApiCall", v = 2)
public final class m extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f141601a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b f141602b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f141603c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(b bVar, t13.d<? super m> dVar) {
        super(dVar);
        this.f141602b = bVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f141601a = obj;
        this.f141603c |= Integer.MIN_VALUE;
        int i14 = b.f141488i1;
        return this.f141602b.A5(this);
    }
}
