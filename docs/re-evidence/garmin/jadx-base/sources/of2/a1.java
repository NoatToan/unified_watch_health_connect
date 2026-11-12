package of2;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.livesessionview.communication.LiveActivityMetricsDefinitionProviderImpl", f = "LiveActivityMetricsDefinitionProviderImpl.kt", l = {68}, m = "getDefinitionItems", v = 2)
public final class a1 extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f131718a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c1 f131719b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f131720c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a1(c1 c1Var, t13.d<? super a1> dVar) {
        super(dVar);
        this.f131719b = c1Var;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f131718a = obj;
        this.f131720c |= Integer.MIN_VALUE;
        return this.f131719b.c(null, false, 0L, this);
    }
}
