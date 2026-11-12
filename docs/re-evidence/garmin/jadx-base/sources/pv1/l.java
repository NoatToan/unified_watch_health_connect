package pv1;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.training.fbtap.preferences.viewmodel.FBTEditPreferencesViewModel", f = "FBTEditPreferencesViewModel.kt", l = {458, 460, 473, 475, 485, 492, 497}, m = "updateSupplementalSportAndTrainingLevel", v = 2)
public final class l extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f141595a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f141596b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f141597c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f141598d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ b f141599e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f141600f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(b bVar, t13.d<? super l> dVar) {
        super(dVar);
        this.f141599e = bVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f141598d = obj;
        this.f141600f |= Integer.MIN_VALUE;
        return b.a5(this.f141599e, this);
    }
}
