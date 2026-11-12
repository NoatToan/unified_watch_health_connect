package z70;

import com.google.android.exoplayer2.extractor.ts.TsExtractor;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.data.PromosStoreImpl", f = "PromosStore.kt", l = {TsExtractor.TS_PACKET_SIZE, 64}, m = "load", v = 2)
public final class f0 extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f202811a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public z53.a f202812b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public c0 f202813c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f202814d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public /* synthetic */ Object f202815e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ c0 f202816f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f202817g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(c0 c0Var, t13.d<? super f0> dVar) {
        super(dVar);
        this.f202816f = c0Var;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f202815e = obj;
        this.f202817g |= Integer.MIN_VALUE;
        return this.f202816f.d(null, this);
    }
}
