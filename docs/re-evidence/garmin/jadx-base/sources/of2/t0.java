package of2;

import com.google.android.exoplayer2.extractor.ts.TsExtractor;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.livesessionview.communication.LSVSessionManager", f = "LSVSessionManager.kt", l = {TsExtractor.TS_STREAM_TYPE_DTS}, m = "sendSaveRequest-gIAlu-s", v = 2)
public final class t0 extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f131916a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c0 f131917b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f131918c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t0(c0 c0Var, t13.d<? super t0> dVar) {
        super(dVar);
        this.f131917b = c0Var;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f131916a = obj;
        this.f131918c |= Integer.MIN_VALUE;
        Object objO = this.f131917b.o(null, this);
        return objO == u13.a.COROUTINE_SUSPENDED ? objO : o13.q.a(objO);
    }
}
