package ou1;

import p005kotlin.Metadata;
import r53.p2;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.training.domain.GetActiveOrPausedTrainingPlansUseCase", f = "GetActiveOrPausedTrainingPlansUseCase.kt", l = {27}, m = "fetchActiveTrainingPlans", v = 2)
public final class b extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public p2 f134004a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f134005b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ a f134006c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f134007d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(a aVar, t13.d<? super b> dVar) {
        super(dVar);
        this.f134006c = aVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f134005b = obj;
        this.f134007d |= Integer.MIN_VALUE;
        return this.f134006c.a(this);
    }
}
