package fg2;

import com.google.android.exoplayer2.extractor.ts.TsExtractor;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.livesessionview.repositories.LiveActivityRepository", f = "LiveActivityRepository.kt", l = {TsExtractor.TS_STREAM_TYPE_E_AC3}, m = "sendResumeRequest-IoAF18A", v = 2)
public final class v extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f71563a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f f71564b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f71565c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(f fVar, t13.d<? super v> dVar) {
        super(dVar);
        this.f71564b = fVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f71563a = obj;
        this.f71565c |= Integer.MIN_VALUE;
        Object objN = this.f71564b.n(this);
        return objN == u13.a.COROUTINE_SUSPENDED ? objN : o13.q.a(objN);
    }
}
