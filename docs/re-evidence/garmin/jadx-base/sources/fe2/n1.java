package fe2;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.library.livetrack.domain.GrouptrackManager", f = "GrouptrackManager.kt", l = {215, 230, 238, 242, 250, 260}, m = "handleGrouptrackSendMessagesRequest", v = 2)
public final class n1 extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f70863a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f70864b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f70865c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f70866d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ j1 f70867e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f70868f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n1(j1 j1Var, t13.d<? super n1> dVar) {
        super(dVar);
        this.f70867e = j1Var;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f70866d = obj;
        this.f70868f |= Integer.MIN_VALUE;
        return this.f70867e.d(0, 0L, null, null, null, this);
    }
}
