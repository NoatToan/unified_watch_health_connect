package o5;

import com.google.android.exoplayer2.extractor.ts.TsExtractor;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@v13.e(c = "androidx.compose.ui.scrollcapture.ComposeScrollCaptureCallback", f = "ComposeScrollCaptureCallback.android.kt", l = {TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 137}, m = "onScrollCaptureImageRequest", v = 1)
public final class b extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object f129140a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public g6.l f129141b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f129142c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f129143d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public /* synthetic */ Object f129144e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ a f129145f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f129146g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(a aVar, t13.d<? super b> dVar) {
        super(dVar);
        this.f129145f = aVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f129144e = obj;
        this.f129146g |= Integer.MIN_VALUE;
        return a.a(this.f129145f, null, null, this);
    }
}
