package im2;

import c83.b0;
import com.google.android.exoplayer2.extractor.ts.TsExtractor;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@v13.e(c = "com.garmin.device.pairing.impl.retrofit.PairingRetrofitServerDelegate", f = "PairingRetrofitServerDelegate.kt", l = {TsExtractor.TS_STREAM_TYPE_AC4}, m = "getGcService$suspendImpl")
public final class h extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public b0 f94283a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f94284b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ c f94285c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f94286d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(c cVar, t13.d<? super h> dVar) {
        super(dVar);
        this.f94285c = cVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f94284b = obj;
        this.f94286d |= Integer.MIN_VALUE;
        return c.f(this.f94285c, this);
    }
}
