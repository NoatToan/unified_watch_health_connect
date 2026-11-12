package of2;

import java.util.List;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.livesessionview.communication.LiveActivityMetricsDefinitionProviderImpl", f = "LiveActivityMetricsDefinitionProviderImpl.kt", l = {31}, m = "getDefinitionMetrics", v = 2)
public final class b1 extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public zf2.d f131761a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public vf2.p f131762b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public rf2.l f131763c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public List f131764d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public /* synthetic */ Object f131765e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ c1 f131766f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f131767g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b1(c1 c1Var, t13.d<? super b1> dVar) {
        super(dVar);
        this.f131766f = c1Var;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f131765e = obj;
        this.f131767g |= Integer.MIN_VALUE;
        return this.f131766f.b(null, null, null, null, 0L, this);
    }
}
