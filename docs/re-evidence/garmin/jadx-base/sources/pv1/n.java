package pv1;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.training.fbtap.preferences.viewmodel.FBTEditPreferencesViewModel", f = "FBTEditPreferencesViewModel.kt", l = {505}, m = "updateTrainingLevelAfterSupplementalSport", v = 2)
public final class n extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f141604a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b f141605b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f141606c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(b bVar, t13.d<? super n> dVar) {
        super(dVar);
        this.f141605b = bVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f141604a = obj;
        this.f141606c |= Integer.MIN_VALUE;
        int i14 = b.f141488i1;
        return this.f141605b.B5(this);
    }
}
