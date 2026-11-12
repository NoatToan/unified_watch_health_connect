package qy1;

import com.garmin.android.apps.connectmobile.v2;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.traininginitiative.domain.event.GetCyclingEventStrategyDataUseCase", f = "GetCyclingEventStrategyDataUseCase.kt", l = {16, 20, 21}, m = "invoke", v = 2)
public final class c extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public fg0.k f148555a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public v2 f148556b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ab1.g f148557c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f148558d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public /* synthetic */ Object f148559e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ d f148560f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f148561g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(d dVar, t13.d<? super c> dVar2) {
        super(dVar2);
        this.f148560f = dVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f148559e = obj;
        this.f148561g |= Integer.MIN_VALUE;
        return this.f148560f.a(null, this);
    }
}
