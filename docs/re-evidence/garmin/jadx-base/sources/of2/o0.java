package of2;

import com.google.android.exoplayer2.extractor.ts.TsExtractor;
import p005kotlin.Metadata;
import r53.d2;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.livesessionview.communication.LSVSessionManager", f = "LSVSessionManager.kt", l = {TsExtractor.TS_STREAM_TYPE_AC4, 178, 186, 192}, m = "sendPauseAndOperationRequests-BWLJW6A", v = 2)
public final class o0 extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f131885a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public e23.l f131886b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public e23.l f131887c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public d2 f131888d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f131889e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public /* synthetic */ Object f131890f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ c0 f131891g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f131892h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0(c0 c0Var, t13.d<? super o0> dVar) {
        super(dVar);
        this.f131891g = c0Var;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f131890f = obj;
        this.f131892h |= Integer.MIN_VALUE;
        int i14 = c0.f131771p;
        Object objK = this.f131891g.k(null, null, null, this);
        return objK == u13.a.COROUTINE_SUSPENDED ? objK : o13.q.a(objK);
    }
}
