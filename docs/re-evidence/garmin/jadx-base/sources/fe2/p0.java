package fe2;

import com.google.android.exoplayer2.text.ttml.TtmlNode;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.library.livetrack.domain.DeviceDrivenSession", f = "DeviceDrivenSession.kt", l = {88, 91, 113, 114, 128}, m = TtmlNode.START, v = 2)
public final class p0 extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object f70882a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public v1 f70883b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f70884c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f70885d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f70886e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public /* synthetic */ Object f70887f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ j0 f70888g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f70889h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p0(j0 j0Var, t13.d<? super p0> dVar) {
        super(dVar);
        this.f70888g = j0Var;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f70887f = obj;
        this.f70889h |= Integer.MIN_VALUE;
        return this.f70888g.h(null, this);
    }
}
