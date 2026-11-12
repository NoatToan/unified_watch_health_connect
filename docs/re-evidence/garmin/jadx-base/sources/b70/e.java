package b70;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.cyclingability.domain.reports.GetLatestCyclingAbilityDataUseCase", f = "GetLatestCyclingAbilityDataUseCase.kt", l = {95}, m = "getShareableEventDetails", v = 2)
public final class e extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f16291a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g f16292b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f16293c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(g gVar, t13.d<? super e> dVar) {
        super(dVar);
        this.f16292b = gVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f16291a = obj;
        this.f16293c |= Integer.MIN_VALUE;
        int i14 = g.f16300d;
        return this.f16292b.e(null, this);
    }
}
