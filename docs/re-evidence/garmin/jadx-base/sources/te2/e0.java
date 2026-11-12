package te2;

import com.google.android.exoplayer2.extractor.ts.TsExtractor;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@v13.e(c = "com.garmin.android.library.mobileauth.biz.ContinueAsHandler", f = "ContinueAsHandler.kt", l = {183, TsExtractor.TS_PACKET_SIZE}, m = "exchangeForGC1")
public final class e0 extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f164015a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ h0 f164016b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f164017c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0(h0 h0Var, t13.d<? super e0> dVar) {
        super(dVar);
        this.f164016b = h0Var;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f164015a = obj;
        this.f164017c |= Integer.MIN_VALUE;
        return h0.e(this.f164016b, this);
    }
}
