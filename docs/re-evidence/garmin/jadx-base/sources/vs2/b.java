package vs2;

import com.google.android.exoplayer2.extractor.ts.TsExtractor;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@v13.e(c = "com.garmin.gfdi.event.CurrentTimeManager", f = "CurrentTimeManager.kt", l = {125, TsExtractor.TS_STREAM_TYPE_DTS, 190}, m = "synchronizeTime")
public final class b extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f179934a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ a f179935b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f179936c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(a aVar, t13.d<? super b> dVar) {
        super(dVar);
        this.f179935b = aVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f179934a = obj;
        this.f179936c |= Integer.MIN_VALUE;
        return this.f179935b.b(this);
    }
}
