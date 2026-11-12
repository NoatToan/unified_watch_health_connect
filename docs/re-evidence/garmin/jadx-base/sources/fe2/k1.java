package fe2;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.library.livetrack.domain.GrouptrackManager", f = "GrouptrackManager.kt", l = {275, 280, 282}, m = "handleGetConnectionsRequest", v = 2)
public final class k1 extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f70824a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f70825b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f70826c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f70827d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ j1 f70828e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f70829f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k1(j1 j1Var, t13.d<? super k1> dVar) {
        super(dVar);
        this.f70828e = j1Var;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f70827d = obj;
        this.f70829f |= Integer.MIN_VALUE;
        return this.f70828e.a(0, null, 0, null, null, null, this);
    }
}
