package v71;

import b63.o;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.performancescores.endurancescore.data.repository.EnduranceScoreRepoImpl", f = "EnduranceScoreRepoImpl.kt", l = {26}, m = "getEnduranceScoreForDate", v = 2)
public final class b extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public o f176123a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f176124b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ f f176125c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f176126d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(f fVar, t13.d<? super b> dVar) {
        super(dVar);
        this.f176125c = fVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f176124b = obj;
        this.f176126d |= Integer.MIN_VALUE;
        return this.f176125c.J3(null, this);
    }
}
