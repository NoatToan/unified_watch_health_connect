package b70;

import java.util.ArrayList;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.cyclingability.domain.reports.GetLatestCyclingAbilityDataUseCase", f = "GetLatestCyclingAbilityDataUseCase.kt", l = {129}, m = "getAggregatedCyclingAbility", v = 2)
public final class a extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ArrayList f16277a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public j61.h f16278b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f16279c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ g f16280d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f16281e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(g gVar, t13.d<? super a> dVar) {
        super(dVar);
        this.f16280d = gVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f16279c = obj;
        this.f16281e |= Integer.MIN_VALUE;
        int i14 = g.f16300d;
        return this.f16280d.a(null, null, null, this);
    }
}
