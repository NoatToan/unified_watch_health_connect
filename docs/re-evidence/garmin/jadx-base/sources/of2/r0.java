package of2;

import com.google.android.exoplayer2.extractor.ts.TsExtractor;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.livesessionview.communication.LSVSessionManager", f = "LSVSessionManager.kt", l = {TsExtractor.TS_STREAM_TYPE_SPLICE_INFO}, m = "sendPauseRequest-IoAF18A", v = 2)
public final class r0 extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f131906a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c0 f131907b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f131908c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r0(c0 c0Var, t13.d<? super r0> dVar) {
        super(dVar);
        this.f131907b = c0Var;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f131906a = obj;
        this.f131908c |= Integer.MIN_VALUE;
        Object objM = this.f131907b.m(this);
        return objM == u13.a.COROUTINE_SUSPENDED ? objM : o13.q.a(objM);
    }
}
