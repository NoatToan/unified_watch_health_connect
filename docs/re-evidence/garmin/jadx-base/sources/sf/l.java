package sf;

import com.google.android.exoplayer2.extractor.ts.TsExtractor;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
@v13.e(c = "coil3.network.NetworkFetcher", f = "NetworkFetcher.kt", l = {TsExtractor.TS_STREAM_TYPE_DTS, 153}, m = "writeToDiskCache")
public final class l extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public mf.a.c f158799a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public p f158800b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public p f158801c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public mf.a.b f158802d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public /* synthetic */ Object f158803e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ i f158804f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f158805g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(i iVar, t13.d<? super l> dVar) {
        super(dVar);
        this.f158804f = iVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f158803e = obj;
        this.f158805g |= Integer.MIN_VALUE;
        return i.c(this.f158804f, null, null, null, null, this);
    }
}
